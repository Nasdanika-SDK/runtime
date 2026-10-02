package org.nasdanika.sdk.runtime.common.flow;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.PriorityQueue;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.Executor;
import java.util.concurrent.Flow;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import java.util.function.BiConsumer;
import java.util.function.BooleanSupplier;

import io.opentelemetry.context.Context;
import io.opentelemetry.context.Scope;

/**
 * A serial work queue drained by one thread at a time, whose terminals ({@link #join(CompletionStage)},
 * {@link #settle()}) <b>block by pumping</b>: the waiting thread runs queued work instead of
 * sleeping, as {@code ForkJoinTask.join()}, SWT's {@code readAndDispatch} loop and Kotlin's
 * {@code runBlocking} do.
 *
 * <h2>Any thread can become the drainer</h2>
 *
 * Exactly one thread runs tasks at any moment. A blocking terminal drains on the calling thread if
 * nobody else is draining, and waits otherwise. With an {@link Options#executor() executor}, work
 * enqueued while nobody drains is drained there, so publishers on this pump progress without a
 * blocking caller. Without one, nothing runs until somebody pumps: the deterministic,
 * single-threaded mode for tests and the reactive runner.
 *
 * <h2>Idle</h2>
 *
 * The pump is idle when no task is runnable (the queue is empty, or holds only items that yielded
 * without anything having changed since) and no {@link #track(CompletionStage, String) tracked}
 * work is in flight. What happens then is a policy, not a guess: see {@link IdlePolicy}. Work that
 * leaves the pump (an HTTP call, an LLM turn on another thread) must be tracked, or the pump will
 * consider itself idle while it is still out.
 *
 * <h2>Yield</h2>
 *
 * An item that cannot proceed yields. With a reason, through {@link #when(CompletionStage, String, BiConsumer)}:
 * the item is parked and re-enqueued when the stage completes, and nothing polls. Blindly, through
 * {@link #submit(String, BooleanSupplier)} returning false: the item goes back into the queue at a
 * lower priority. Priorities age deterministically (a yielded item is re-ranked
 * {@code yieldPenalty} arrivals behind the current one, so it cannot starve behind a stream of new
 * work), and ties break by arrival order, never by hash code.
 *
 * <h2>Stalls</h2>
 *
 * A full cycle through the queue that only yields, with nothing in flight, means nothing can
 * progress. The pump fails at once with a {@link StallException} listing each parked, yielding and
 * waiting item and what it waits for. This replaces pass counters, which find the same condition
 * late and without saying what was stuck.
 *
 * <h2>Rules</h2>
 *
 * <ul>
 * <li>No blocking terminal on the pumping thread: a nested pump is re-entrancy, the classic
 * event-loop bug, and is refused.</li>
 * <li>An exception escaping a task fails the pump: new work is dropped and terminals rethrow it.
 * Operators route user exceptions to {@code onError}, so tasks rarely throw.</li>
 * </ul>
 *
 * <h2>Context</h2>
 *
 * A task runs in the OpenTelemetry {@link Context} that was current when it was enqueued, and an
 * action passed to {@link #when(CompletionStage, String, BiConsumer)} or a stage passed to
 * {@link #track(CompletionStage, String)} completes in the context current at that call. Spans
 * started by tasks are children of the span that enqueued them, whichever thread drains, and the
 * unit of work's {@link org.nasdanika.sdk.runtime.common.telemetry.Telemetry#current() OpenTelemetry}
 * travels with them.
 */
public class Pump implements Executor {

	/**
	 * What an idle pump does while something still waits.
	 */
	public enum IdlePolicy {

		/**
		 * A closed world: every source feeds this pump and is driven by it, so nothing more can
		 * arrive. Registered {@link Waiter}s are released (a pumped publisher completes, a
		 * transformation fails what is stuck), and a terminal still unsatisfied after that is a
		 * stall. The reactive runner's fixed point.
		 */
		COMPLETE,

		/**
		 * An open world: backend change reports, network, webhooks. An idle pump waits for new
		 * work for the {@link Options#quietPeriod() quiet period}, then behaves as
		 * {@link #COMPLETE}. Without a quiet period it waits indefinitely.
		 */
		WAIT,

		/**
		 * A closed world where idling early is a bug, for tests: an idle pump with anything still
		 * waiting fails with a {@link StallException} without releasing waiters.
		 */
		FAIL

	}

	/**
	 * Something waiting for a signal the pump cannot produce by running its queue, such as a
	 * pumped publisher awaiting items from upstream. Registered while it waits, released at most
	 * once at idle under {@link IdlePolicy#COMPLETE}, and listed in stall reports.
	 */
	public interface Waiter {

		String describe();

		/**
		 * Called on the pump thread when the pump is idle under {@link IdlePolicy#COMPLETE}. The
		 * registration is removed before the call: re-register to keep waiting.
		 */
		void release();

	}

	/**
	 * @param idlePolicy What an idle pump does, see {@link IdlePolicy}
	 * @param quietPeriod For {@link IdlePolicy#WAIT}: how long the pump must stay idle before waiters are released. Null waits indefinitely
	 * @param stepBudget Maximum number of tasks to run. Exhausting it fails the pump
	 * @param yieldPenalty How many arrivals a blindly yielded item is ranked behind, per yield
	 * @param executor Drains work enqueued while nobody pumps. Null for the single-threaded mode
	 */
	public record Options(
			IdlePolicy idlePolicy,
			Duration quietPeriod,
			long stepBudget,
			long yieldPenalty,
			Executor executor) {

		/**
		 * Starts a virtual thread per drain.
		 */
		public static final Executor VIRTUAL_THREADS = command -> Thread.ofVirtual().name("pump").start(command);

		/**
		 * {@link IdlePolicy#COMPLETE}, no budget, single-threaded.
		 */
		public static final Options DEFAULT = new Options(IdlePolicy.COMPLETE, null, Long.MAX_VALUE, 64, null);

		public Options {
			Objects.requireNonNull(idlePolicy, "idlePolicy");
			if (stepBudget <= 0) {
				throw new IllegalArgumentException("stepBudget must be positive: " + stepBudget);
			}
			if (yieldPenalty < 0) {
				throw new IllegalArgumentException("yieldPenalty must not be negative: " + yieldPenalty);
			}
		}

		public Options withIdlePolicy(IdlePolicy idlePolicy) {
			return new Options(idlePolicy, quietPeriod, stepBudget, yieldPenalty, executor);
		}

		public Options withQuietPeriod(Duration quietPeriod) {
			return new Options(idlePolicy, quietPeriod, stepBudget, yieldPenalty, executor);
		}

		public Options withStepBudget(long stepBudget) {
			return new Options(idlePolicy, quietPeriod, stepBudget, yieldPenalty, executor);
		}

		public Options withYieldPenalty(long yieldPenalty) {
			return new Options(idlePolicy, quietPeriod, stepBudget, yieldPenalty, executor);
		}

		public Options withExecutor(Executor executor) {
			return new Options(idlePolicy, quietPeriod, stepBudget, yieldPenalty, executor);
		}

	}

	private static final ScopedValue<Pump> CURRENT = ScopedValue.newInstance();

	/**
	 * The pump whose task is running on this thread, if any. Lets code running inside a task, such
	 * as a capability factory, track work it sends off the pump.
	 */
	public static Optional<Pump> current() {
		return CURRENT.isBound() ? Optional.of(CURRENT.get()) : Optional.empty();
	}

	private static final class Task {

		final long id;
		final String description;
		final Runnable runnable;
		final BooleanSupplier step;
		final Context context;
		long rank;
		int yields;
		long progressAtYield = -1;

		Task(long id, String description, Runnable runnable, BooleanSupplier step) {
			this.id = id;
			this.description = description;
			this.runnable = runnable;
			this.step = step;
			this.context = Context.current();
			this.rank = id;
		}

	}

	private static final Comparator<Task> TASK_ORDER = Comparator.<Task>comparingLong(t -> t.rank).thenComparingLong(t -> t.id);

	private final Options options;
	private final ReentrantLock lock = new ReentrantLock();
	private final Condition changed = lock.newCondition();

	// Guarded by lock
	private final PriorityQueue<Task> queue = new PriorityQueue<>(TASK_ORDER);
	private final Map<Long, String> inFlight = new LinkedHashMap<>();
	private final Map<Long, String> parked = new LinkedHashMap<>();
	private final Map<Long, Waiter> waiters = new LinkedHashMap<>();
	private long sequence;
	private long progress;
	private long steps;
	private int staleRun;
	private Thread drainer;
	private boolean drainScheduled;
	private RuntimeException failure;

	public Pump() {
		this(Options.DEFAULT);
	}

	public Pump(Options options) {
		this.options = Objects.requireNonNull(options, "options");
	}

	public Pump(IdlePolicy idlePolicy) {
		this(Options.DEFAULT.withIdlePolicy(idlePolicy));
	}

	public Options getOptions() {
		return options;
	}

	/**
	 * @return true if this thread is running one of this pump's tasks.
	 */
	public boolean isPumping() {
		return CURRENT.isBound() && CURRENT.get() == this;
	}

	// --- Work ---

	@Override
	public void execute(Runnable command) {
		execute(null, command);
	}

	/**
	 * Enqueues a task. The description appears in stall reports.
	 */
	public void execute(String description, Runnable command) {
		Objects.requireNonNull(command, "command");
		enqueue(description, command, null);
	}

	/**
	 * Enqueues a step that yields blindly: it returns true when done, false when it cannot proceed
	 * yet, in which case it is re-enqueued at a lower priority. Prefer
	 * {@link #when(CompletionStage, String, BiConsumer)} when the reason can be named.
	 */
	public void submit(String description, BooleanSupplier step) {
		Objects.requireNonNull(step, "step");
		enqueue(description, null, step);
	}

	/**
	 * Yield with a reason: parks the action until the stage completes, then runs it on the pump.
	 * Parked items are listed in stall reports. If the stage is completed by work outside the
	 * pump, that work must be {@link #track(CompletionStage, String) tracked}.
	 */
	public <V> void when(CompletionStage<V> stage, String description, BiConsumer<? super V, ? super Throwable> action) {
		Objects.requireNonNull(stage, "stage");
		Objects.requireNonNull(action, "action");
		long id;
		lock.lock();
		try {
			id = sequence++;
			parked.put(id, description);
		} finally {
			lock.unlock();
		}
		Context context = Context.current();
		stage.whenComplete((value, error) -> execute(description, context.wrap(() -> {
			lock.lock();
			try {
				parked.remove(id);
			} finally {
				lock.unlock();
			}
			action.accept(value, error == null ? null : Flows.unwrap(error));
		})));
	}

	/**
	 * Counts work that left the pump as in flight until the stage completes. The pump is not idle
	 * while anything is in flight. Compose on the returned stage, not on the argument: the
	 * returned stage completes in a pump task, so whatever its completion enqueues is in the
	 * queue before the in-flight count drops.
	 */
	public <V> CompletableFuture<V> track(CompletionStage<V> stage, String description) {
		Objects.requireNonNull(stage, "stage");
		CompletableFuture<V> result = new CompletableFuture<>();
		long id = beginInFlight(description);
		Context context = Context.current();
		stage.whenComplete((value, error) -> execute(description, context.wrap(() -> {
			endInFlight(id);
			if (error == null) {
				result.complete(value);
			} else {
				result.completeExceptionally(Flows.unwrap(error));
			}
		})));
		return result;
	}

	/**
	 * A publisher whose subscriptions count as in flight until they terminate or are cancelled,
	 * and whose signals are delivered on this pump. For publishers outside the pump's closed
	 * world, such as capabilities produced asynchronously.
	 */
	public <T> Flow.Publisher<T> track(Flow.Publisher<T> publisher, String description) {
		Objects.requireNonNull(publisher, "publisher");
		return subscriber -> publisher.subscribe(new ConfinedSubscriber<>(this, subscriber, description, ConfinedSubscriber.Mode.TRACKED));
	}

	/**
	 * Wraps a subscriber so that its signals are delivered on this pump, and its requests and
	 * cancellations are made from it.
	 */
	public <T> Flow.Subscriber<T> confine(Flow.Subscriber<T> subscriber, String description) {
		return new ConfinedSubscriber<>(this, subscriber, description, ConfinedSubscriber.Mode.PLAIN);
	}

	/**
	 * @return Removes the registration.
	 */
	public Runnable register(Waiter waiter) {
		Objects.requireNonNull(waiter, "waiter");
		long id;
		lock.lock();
		try {
			id = sequence++;
			waiters.put(id, waiter);
		} finally {
			lock.unlock();
		}
		return () -> {
			lock.lock();
			try {
				waiters.remove(id);
			} finally {
				lock.unlock();
			}
		};
	}

	// --- Terminals ---

	/**
	 * Pumps until the stage completes, then returns its value or throws its failure (unwrapped
	 * from {@link CompletionException} when it is unchecked).
	 *
	 * @throws StallException if the pump goes idle before the stage completes
	 * @throws IllegalStateException if called on this pump's draining thread
	 */
	public <V> V join(CompletionStage<V> stage) {
		CompletableFuture<V> future = stage.toCompletableFuture();
		if (!future.isDone()) {
			future.whenComplete((v, e) -> signal());
			pumpUntil(future::isDone, false);
		}
		try {
			return future.join();
		} catch (CompletionException e) {
			Throwable cause = e.getCause();
			if (cause instanceof RuntimeException re) {
				throw re;
			}
			if (cause instanceof Error er) {
				throw er;
			}
			throw e;
		}
	}

	/**
	 * Pumps until the pump is idle and, after releasing waiters, nothing is parked, yielding or
	 * waiting. The fixed point.
	 *
	 * @throws StallException if something is still parked, yielding or waiting
	 */
	public void settle() {
		pumpUntil(() -> false, true);
	}

	// --- Implementation ---

	long beginInFlight(String description) {
		lock.lock();
		try {
			long id = sequence++;
			inFlight.put(id, description);
			return id;
		} finally {
			lock.unlock();
		}
	}

	void endInFlight(long id) {
		lock.lock();
		try {
			if (inFlight.remove(id) != null) {
				progressed();
			}
		} finally {
			lock.unlock();
		}
	}

	private void enqueue(String description, Runnable runnable, BooleanSupplier step) {
		lock.lock();
		try {
			if (failure == null) {
				queue.add(new Task(sequence++, description, runnable, step));
				progressed();
				scheduleDrain();
			}
		} finally {
			lock.unlock();
		}
	}

	// Under lock
	private void progressed() {
		++progress;
		staleRun = 0;
		changed.signalAll();
	}

	private void signal() {
		lock.lock();
		try {
			changed.signalAll();
		} finally {
			lock.unlock();
		}
	}

	// Under lock
	private void scheduleDrain() {
		Executor executor = options.executor();
		if (executor != null && drainer == null && !drainScheduled) {
			drainScheduled = true;
			executor.execute(this::drainAsync);
		}
	}

	// Under lock
	private boolean isStale(Task task) {
		return task.progressAtYield == progress;
	}

	// Under lock
	private boolean hasRunnable() {
		Task head = queue.peek();
		return head != null && !(isStale(head) && staleRun >= queue.size());
	}

	// Under lock
	private void checkFailure() {
		if (failure != null) {
			throw failure;
		}
	}

	/**
	 * Runs one task on the draining thread.
	 *
	 * @return false if no task is runnable
	 */
	private boolean runNext() {
		Task task;
		lock.lock();
		try {
			checkFailure();
			if (!hasRunnable()) {
				return false;
			}
			if (isStale(queue.peek())) {
				++staleRun;
			}
			task = queue.poll();
		} finally {
			lock.unlock();
		}

		boolean done;
		try (Scope scope = task.context.makeCurrent()) {
			if (task.runnable == null) {
				done = task.step.getAsBoolean();
			} else {
				task.runnable.run();
				done = true;
			}
		} catch (Throwable e) {
			lock.lock();
			try {
				if (failure == null) {
					failure = new PumpException("Task failed: " + task.description, e);
				}
				changed.signalAll();
			} finally {
				lock.unlock();
			}
			throw failure;
		}

		lock.lock();
		try {
			if (done) {
				progressed();
			} else {
				++task.yields;
				task.progressAtYield = progress;
				task.rank = sequence++ + options.yieldPenalty() * task.yields;
				queue.add(task);
			}
			if (++steps >= options.stepBudget() && failure == null && (!queue.isEmpty() || !done)) {
				failure = stall("Step budget of " + options.stepBudget() + " exhausted", false);
				changed.signalAll();
			}
		} finally {
			lock.unlock();
		}
		return true;
	}

	private boolean acquireDrainer() {
		lock.lock();
		try {
			if (drainer == null) {
				drainer = Thread.currentThread();
				return true;
			}
			if (drainer == Thread.currentThread()) {
				throw new IllegalStateException("Blocking on a pump from its own draining thread would start a nested pump");
			}
			return false;
		} finally {
			lock.unlock();
		}
	}

	private void releaseDrainer() {
		lock.lock();
		try {
			drainer = null;
			changed.signalAll();
			if (hasRunnable()) {
				scheduleDrain();
			}
		} finally {
			lock.unlock();
		}
	}

	private void pumpUntil(BooleanSupplier done, boolean settling) {
		while (!done.getAsBoolean()) {
			if (!acquireDrainer()) {
				lock.lock();
				try {
					checkFailure();
					while (drainer != null && !done.getAsBoolean() && failure == null) {
						changed.await();
					}
				} catch (InterruptedException e) {
					throw interrupted(e);
				} finally {
					lock.unlock();
				}
				continue;
			}

			try {
				ScopedValue.where(CURRENT, this).run(() -> {
					while (!done.getAsBoolean() && runNext()) {
						// Pumping
					}
				});
				if (!done.getAsBoolean() && onIdle(done, settling)) {
					return;
				}
			} catch (InterruptedException e) {
				throw interrupted(e);
			} finally {
				releaseDrainer();
			}
		}
	}

	private PumpException interrupted(InterruptedException e) {
		Thread.currentThread().interrupt();
		return new PumpException("Interrupted while pumping", e);
	}

	/**
	 * Called by the drainer when no task is runnable.
	 *
	 * @return true when settling is complete
	 */
	private boolean onIdle(BooleanSupplier done, boolean settling) throws InterruptedException {
		lock.lock();
		try {
			checkFailure();
			if (hasRunnable() || done.getAsBoolean()) {
				return false;
			}
			if (!inFlight.isEmpty()) {
				changed.await();
				return false;
			}
			if (options.idlePolicy() == IdlePolicy.WAIT) {
				long observed = progress;
				Duration quietPeriod = options.quietPeriod();
				if (quietPeriod == null) {
					changed.await();
					return false;
				}
				long nanos = quietPeriod.toNanos();
				while (progress == observed && !done.getAsBoolean() && nanos > 0) {
					nanos = changed.awaitNanos(nanos);
				}
				if (progress != observed || done.getAsBoolean() || hasRunnable() || !inFlight.isEmpty()) {
					return false;
				}
			}
			if (options.idlePolicy() != IdlePolicy.FAIL && releaseWaiters()) {
				return false;
			}
			if (settling && waiters.isEmpty() && parked.isEmpty() && queue.isEmpty()) {
				return true;
			}
			throw stall(settling ? "Pump stalled before settling" : "Pump went idle before the awaited result was produced", true);
		} finally {
			lock.unlock();
		}
	}

	/**
	 * Enqueues a release task per registered waiter, removing the registrations. Under lock.
	 *
	 * @return true if anything was released
	 */
	private boolean releaseWaiters() {
		if (waiters.isEmpty()) {
			return false;
		}
		List<Waiter> released = new ArrayList<>(waiters.values());
		waiters.clear();
		for (Waiter waiter: released) {
			queue.add(new Task(sequence++, "release " + waiter.describe(), waiter::release, null));
		}
		progressed();
		return true;
	}

	// Under lock
	private StallException stall(String message, boolean includeQueue) {
		List<String> waiting = new ArrayList<>();
		for (String description: inFlight.values()) {
			waiting.add("in flight: " + description);
		}
		for (Waiter waiter: waiters.values()) {
			waiting.add("waiting: " + waiter.describe());
		}
		for (String description: parked.values()) {
			waiting.add("parked: " + description);
		}
		if (includeQueue) {
			queue
				.stream()
				.sorted(TASK_ORDER)
				.forEach(task -> waiting.add((task.yields > 0 ? "yielded " + task.yields + " time(s): " : "queued: ") + task.description));
		}
		return new StallException(message, waiting);
	}

	/**
	 * Drains on the executor until nothing is runnable. Releases waiters at idle under
	 * {@link IdlePolicy#COMPLETE}, so that a stuck subscription is completed or failed even when
	 * no thread blocks on a terminal. Stalls under the other policies surface at a terminal.
	 */
	private void drainAsync() {
		lock.lock();
		try {
			drainScheduled = false;
			if (drainer != null || failure != null) {
				return;
			}
			drainer = Thread.currentThread();
		} finally {
			lock.unlock();
		}

		try {
			ScopedValue.where(CURRENT, this).run(() -> {
				for (;;) {
					while (runNext()) {
						// Pumping
					}
					lock.lock();
					try {
						if (!hasRunnable()
								&& (options.idlePolicy() != IdlePolicy.COMPLETE || !inFlight.isEmpty() || !releaseWaiters())) {
							return;
						}
					} finally {
						lock.unlock();
					}
				}
			});
		} catch (PumpException e) {
			// Recorded as the pump's failure, rethrown by terminals
		} finally {
			releaseDrainer();
		}
	}

	@Override
	public String toString() {
		lock.lock();
		try {
			return getClass().getSimpleName()
					+ "[queued=" + queue.size()
					+ ", inFlight=" + inFlight.size()
					+ ", parked=" + parked.size()
					+ ", waiters=" + waiters.size()
					+ ", steps=" + steps
					+ (failure == null ? "" : ", failed") + "]";
		} finally {
			lock.unlock();
		}
	}

}
