package org.nasdanika.sdk.runtime.common.flow;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Optional;
import java.util.Spliterator;
import java.util.Spliterators;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.Flow.Publisher;
import java.util.concurrent.Flow.Subscriber;
import java.util.concurrent.Flow.Subscription;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

/**
 * Sources, operators and terminals for {@link java.util.concurrent.Flow}, named like
 * {@link java.util.stream.Collectors} and {@link java.util.concurrent.Executors}.
 *
 * <h2>Two sides</h2>
 *
 * {@link #toStream(Publisher)} is the bridge to {@link java.util.stream}: on a virtual thread
 * blocking is cheap, so pull-side processing (map, filter, gatherers, collectors) needs nothing
 * from this class. The push-side operators here are for results that must stay a
 * {@link Publisher}: fed to another subscriber, subscribed by several consumers, or delivered
 * immediately.
 *
 * <h2>Deliberately absent</h2>
 *
 * {@code flatMap}, {@code merge}, {@code zip}, schedulers and time operators. They are where
 * reactive libraries get large and difficult, and on virtual threads they are ordinary blocking
 * code. {@link #concatMap(Publisher, Function)} is present because sequential composition is
 * deterministic and capability resolution needs it.
 *
 * <h2>Rules every operator follows</h2>
 *
 * <ol>
 * <li>Lazy: an operator subscribes upstream once per downstream subscriber, at subscription time.</li>
 * <li>Demand is accounted: {@link #filter(Publisher, Predicate)} requests one more for every item
 * it drops, {@link #take(Publisher, long)} cancels upstream after the last item.</li>
 * <li>An exception in a user function cancels upstream and signals {@code onError} downstream.</li>
 * </ol>
 */
public final class Flows {

	static final String RULE_3_9 = "Rule 3.9: request(n) requires n > 0";

	private Flows() {
		// Utility
	}

	// --- Sources ---

	@SafeVarargs
	public static <T> Publisher<T> of(T... items) {
		return fromIterable(Arrays.asList(items));
	}

	/**
	 * A publisher that iterates the iterable for every subscriber. Null elements are signalled
	 * as an error, because {@code Flow} does not allow null items.
	 */
	public static <T> Publisher<T> fromIterable(Iterable<? extends T> items) {
		Objects.requireNonNull(items, "items");
		return subscriber -> {
			Objects.requireNonNull(subscriber, "subscriber");
			Iterator<? extends T> iterator;
			try {
				iterator = items.iterator();
			} catch (Throwable e) {
				Flows.<T>error(e).subscribe(subscriber);
				return;
			}
			new IteratorSubscription<T>(subscriber, iterator, null).start();
		};
	}

	/**
	 * A single-use publisher over a stream. The stream is closed when it is exhausted or the
	 * subscription is cancelled. A second subscriber receives an error.
	 */
	public static <T> Publisher<T> fromStream(Stream<? extends T> stream) {
		Objects.requireNonNull(stream, "stream");
		AtomicBoolean subscribed = new AtomicBoolean();
		return subscriber -> {
			Objects.requireNonNull(subscriber, "subscriber");
			if (subscribed.getAndSet(true)) {
				Flows.<T>error(new IllegalStateException("A stream publisher can be subscribed to only once")).subscribe(subscriber);
				return;
			}
			new IteratorSubscription<T>(subscriber, stream.iterator(), stream::close).start();
		};
	}

	/**
	 * Emits the stage's value, if it is not null, then completes. Signals the stage's failure as
	 * an error. Signals are delivered on the thread completing the stage, or on the requesting
	 * thread if it is already complete.
	 */
	public static <T> Publisher<T> fromFuture(CompletionStage<? extends T> stage) {
		Objects.requireNonNull(stage, "stage");
		return subscriber -> {
			Objects.requireNonNull(subscriber, "subscriber");
			new FutureSubscription<T>(subscriber, stage).start();
		};
	}

	public static <T> Publisher<T> empty() {
		return subscriber -> {
			Objects.requireNonNull(subscriber, "subscriber");
			subscriber.onSubscribe(NoopSubscription.INSTANCE);
			subscriber.onComplete();
		};
	}

	public static <T> Publisher<T> error(Throwable error) {
		Objects.requireNonNull(error, "error");
		return subscriber -> {
			Objects.requireNonNull(subscriber, "subscriber");
			subscriber.onSubscribe(NoopSubscription.INSTANCE);
			subscriber.onError(error);
		};
	}

	// --- Operators ---

	public static <T, R> Publisher<R> map(Publisher<? extends T> source, Function<? super T, ? extends R> mapper) {
		Objects.requireNonNull(source, "source");
		Objects.requireNonNull(mapper, "mapper");
		return subscriber -> source.subscribe(new OperatorSubscriber<T, R>(subscriber) {

			@Override
			public void onNext(T item) {
				if (done) {
					return;
				}
				R result;
				try {
					result = Objects.requireNonNull(mapper.apply(item), "mapper returned null, use mapNotNull to drop items");
				} catch (Throwable e) {
					fail(e);
					return;
				}
				downstream.onNext(result);
			}

		});
	}

	/**
	 * Like {@link #map(Publisher, Function)}, but items the mapper maps to null are dropped.
	 */
	public static <T, R> Publisher<R> mapNotNull(Publisher<? extends T> source, Function<? super T, ? extends R> mapper) {
		Objects.requireNonNull(source, "source");
		Objects.requireNonNull(mapper, "mapper");
		return subscriber -> source.subscribe(new OperatorSubscriber<T, R>(subscriber) {

			@Override
			public void onNext(T item) {
				if (done) {
					return;
				}
				R result;
				try {
					result = mapper.apply(item);
				} catch (Throwable e) {
					fail(e);
					return;
				}
				if (result == null) {
					upstream.request(1);
				} else {
					downstream.onNext(result);
				}
			}

		});
	}

	public static <T> Publisher<T> filter(Publisher<? extends T> source, Predicate<? super T> predicate) {
		Objects.requireNonNull(source, "source");
		Objects.requireNonNull(predicate, "predicate");
		return subscriber -> source.subscribe(new OperatorSubscriber<T, T>(subscriber) {

			@Override
			public void onNext(T item) {
				if (done) {
					return;
				}
				boolean accepted;
				try {
					accepted = predicate.test(item);
				} catch (Throwable e) {
					fail(e);
					return;
				}
				if (accepted) {
					downstream.onNext(item);
				} else {
					upstream.request(1);
				}
			}

		});
	}

	/**
	 * Calls the action for each item before passing it on. For logging and telemetry.
	 */
	public static <T> Publisher<T> peek(Publisher<? extends T> source, Consumer<? super T> action) {
		Objects.requireNonNull(source, "source");
		Objects.requireNonNull(action, "action");
		return subscriber -> source.subscribe(new OperatorSubscriber<T, T>(subscriber) {

			@Override
			public void onNext(T item) {
				if (done) {
					return;
				}
				try {
					action.accept(item);
				} catch (Throwable e) {
					fail(e);
					return;
				}
				downstream.onNext(item);
			}

		});
	}

	/**
	 * Calls the action when the source terminates: with null on completion, with the error on
	 * failure. Not called on cancellation. An exception from the action on completion is
	 * signalled as an error instead.
	 */
	public static <T> Publisher<T> onTerminate(Publisher<? extends T> source, Consumer<? super Throwable> action) {
		Objects.requireNonNull(source, "source");
		Objects.requireNonNull(action, "action");
		return subscriber -> source.subscribe(new OperatorSubscriber<T, T>(subscriber) {

			@Override
			public void onNext(T item) {
				if (!done) {
					downstream.onNext(item);
				}
			}

			@Override
			public void onError(Throwable error) {
				if (done) {
					return;
				}
				try {
					action.accept(error);
				} catch (Throwable e) {
					error.addSuppressed(e);
				}
				super.onError(error);
			}

			@Override
			public void onComplete() {
				if (done) {
					return;
				}
				try {
					action.accept(null);
				} catch (Throwable e) {
					super.onError(e);
					return;
				}
				super.onComplete();
			}

		});
	}

	/**
	 * At most n items, then completes and cancels upstream.
	 */
	public static <T> Publisher<T> take(Publisher<? extends T> source, long n) {
		Objects.requireNonNull(source, "source");
		if (n < 0) {
			throw new IllegalArgumentException("n must not be negative: " + n);
		}
		return subscriber -> source.subscribe(new OperatorSubscriber<T, T>(subscriber) {

			private long remaining = n;

			@Override
			public void onSubscribe(Subscription subscription) {
				if (n == 0 && upstream == null) {
					upstream = subscription;
					done = true;
					subscription.cancel();
					downstream.onSubscribe(this);
					downstream.onComplete();
					return;
				}
				super.onSubscribe(subscription);
			}

			@Override
			public void request(long r) {
				if (!done) {
					super.request(r);
				}
			}

			@Override
			public void onNext(T item) {
				if (done) {
					return;
				}
				downstream.onNext(item);
				if (--remaining == 0) {
					done = true;
					upstream.cancel();
					downstream.onComplete();
				}
			}

		});
	}

	/**
	 * Maps each item to a publisher and emits the items of those publishers in order: the next
	 * publisher is subscribed after the previous one completes. Deterministic, which is why it is
	 * here and {@code flatMap} is not.
	 */
	public static <T, R> Publisher<R> concatMap(Publisher<? extends T> source, Function<? super T, ? extends Publisher<? extends R>> mapper) {
		Objects.requireNonNull(source, "source");
		Objects.requireNonNull(mapper, "mapper");
		return subscriber -> {
			Objects.requireNonNull(subscriber, "subscriber");
			source.subscribe(new ConcatMap<T, R>(subscriber, mapper));
		};
	}

	@SafeVarargs
	public static <T> Publisher<T> concat(Publisher<? extends T>... sources) {
		return concat(Arrays.asList(sources));
	}

	public static <T> Publisher<T> concat(Iterable<? extends Publisher<? extends T>> sources) {
		return concatMap(fromIterable(sources), p -> p);
	}

	// --- Terminals ---

	/**
	 * Collects all items. {@code join()} on the result is "block"; on a {@link Pump},
	 * {@link Pump#join(CompletionStage)} blocks by pumping. Cancelling the future cancels the
	 * subscription.
	 */
	public static <T> CompletableFuture<List<T>> toList(Publisher<? extends T> source) {
		CompletableFuture<List<T>> result = new CompletableFuture<>();
		source.subscribe(new Subscriber<T>() {

			private final List<T> items = new ArrayList<>();

			@Override
			public void onSubscribe(Subscription subscription) {
				result.whenComplete((r, e) -> {
					if (result.isCancelled()) {
						subscription.cancel();
					}
				});
				subscription.request(Long.MAX_VALUE);
			}

			@Override
			public void onNext(T item) {
				items.add(item);
			}

			@Override
			public void onError(Throwable throwable) {
				result.completeExceptionally(throwable);
			}

			@Override
			public void onComplete() {
				result.complete(items);
			}

		});
		return result;
	}

	/**
	 * The first item, then cancels. Empty if the source completes without items.
	 */
	public static <T> CompletableFuture<Optional<T>> first(Publisher<? extends T> source) {
		CompletableFuture<Optional<T>> result = new CompletableFuture<>();
		source.subscribe(new Subscriber<T>() {

			private Subscription subscription;

			@Override
			public void onSubscribe(Subscription subscription) {
				this.subscription = subscription;
				result.whenComplete((r, e) -> {
					if (result.isCancelled()) {
						subscription.cancel();
					}
				});
				subscription.request(1);
			}

			@Override
			public void onNext(T item) {
				if (!result.isDone()) {
					subscription.cancel();
					result.complete(Optional.of(item));
				}
			}

			@Override
			public void onError(Throwable throwable) {
				result.completeExceptionally(throwable);
			}

			@Override
			public void onComplete() {
				result.complete(Optional.empty());
			}

		});
		return result;
	}

	/**
	 * Calls the action for every item. The shape of the JDK's own
	 * {@code SubmissionPublisher.consume}. An exception from the action cancels the subscription
	 * and fails the result.
	 */
	public static <T> CompletableFuture<Void> forEach(Publisher<? extends T> source, Consumer<? super T> action) {
		Objects.requireNonNull(action, "action");
		CompletableFuture<Void> result = new CompletableFuture<>();
		source.subscribe(new Subscriber<T>() {

			private Subscription subscription;

			@Override
			public void onSubscribe(Subscription subscription) {
				this.subscription = subscription;
				result.whenComplete((r, e) -> {
					if (result.isCancelled()) {
						subscription.cancel();
					}
				});
				subscription.request(Long.MAX_VALUE);
			}

			@Override
			public void onNext(T item) {
				if (result.isDone()) {
					return;
				}
				try {
					action.accept(item);
				} catch (Throwable e) {
					subscription.cancel();
					result.completeExceptionally(e);
				}
			}

			@Override
			public void onError(Throwable throwable) {
				result.completeExceptionally(throwable);
			}

			@Override
			public void onComplete() {
				result.complete(null);
			}

		});
		return result;
	}

	public static <T> Stream<T> toStream(Publisher<? extends T> source) {
		return toStream(source, 16);
	}

	/**
	 * The bridge to {@link java.util.stream}: subscribes, requests {@code prefetch} items, and
	 * hands them out through a blocking iterator, requesting more as the stream pulls. Closing
	 * the stream cancels the subscription. Intended for virtual threads.
	 *
	 * <p>
	 * Do not call this on a thread pumping the {@link Pump} that delivers the source's signals:
	 * the iterator would wait for a delivery only that thread can make. Use the pump's terminals
	 * there.
	 */
	public static <T> Stream<T> toStream(Publisher<? extends T> source, int prefetch) {
		if (prefetch <= 0) {
			throw new IllegalArgumentException("prefetch must be positive: " + prefetch);
		}
		BlockingSubscriber<T> subscriber = new BlockingSubscriber<>(prefetch);
		source.subscribe(subscriber);
		return StreamSupport
				.stream(Spliterators.spliteratorUnknownSize(subscriber, Spliterator.ORDERED | Spliterator.NONNULL), false)
				.onClose(subscriber::cancel);
	}

	// --- Implementation ---

	static long addCap(long a, long b) {
		long r = a + b;
		return r < 0 ? Long.MAX_VALUE : r;
	}

	static long addCap(AtomicLong requested, long n) {
		for (;;) {
			long current = requested.get();
			if (current == Long.MAX_VALUE) {
				return current;
			}
			if (requested.compareAndSet(current, addCap(current, n))) {
				return current;
			}
		}
	}

	static Throwable unwrap(Throwable error) {
		return error instanceof CompletionException && error.getCause() != null ? error.getCause() : error;
	}

	enum NoopSubscription implements Subscription {

		INSTANCE;

		@Override
		public void request(long n) {
			// Nothing to deliver
		}

		@Override
		public void cancel() {
			// Nothing to cancel
		}

	}

	/**
	 * Pass-through base for one-to-one operators. Signals arrive serially from upstream, so the
	 * {@code done} flag needs no synchronization on the signal path; it is volatile because
	 * {@code request} may read it from another thread.
	 */
	private abstract static class OperatorSubscriber<T, R> implements Subscriber<T>, Subscription {

		protected final Subscriber<? super R> downstream;
		protected Subscription upstream;
		protected volatile boolean done;

		OperatorSubscriber(Subscriber<? super R> downstream) {
			this.downstream = Objects.requireNonNull(downstream, "subscriber");
		}

		@Override
		public void onSubscribe(Subscription subscription) {
			if (upstream != null) {
				subscription.cancel();
				return;
			}
			upstream = subscription;
			downstream.onSubscribe(this);
		}

		@Override
		public void request(long n) {
			upstream.request(n);
		}

		@Override
		public void cancel() {
			upstream.cancel();
		}

		@Override
		public void onError(Throwable throwable) {
			if (done) {
				return;
			}
			done = true;
			downstream.onError(throwable);
		}

		@Override
		public void onComplete() {
			if (done) {
				return;
			}
			done = true;
			downstream.onComplete();
		}

		protected void fail(Throwable error) {
			upstream.cancel();
			onError(error);
		}

	}

	/**
	 * Emits from an iterator under demand. The work-in-progress counter makes the emission loop
	 * single-threaded and non-recursive: a request made from inside {@code onNext} adds demand
	 * and returns, and the running loop picks it up.
	 */
	private static final class IteratorSubscription<T> implements Subscription {

		private final Subscriber<? super T> downstream;
		private final Iterator<? extends T> iterator;
		private final Runnable onClose;
		private final AtomicLong requested = new AtomicLong();
		private final AtomicInteger wip = new AtomicInteger();
		private volatile boolean cancelled;
		private volatile boolean badRequest;

		// Confined to the emission loop
		private long emitted;
		private boolean done;

		IteratorSubscription(Subscriber<? super T> downstream, Iterator<? extends T> iterator, Runnable onClose) {
			this.downstream = downstream;
			this.iterator = iterator;
			this.onClose = onClose;
		}

		void start() {
			downstream.onSubscribe(this);
			drain();
		}

		@Override
		public void request(long n) {
			if (n <= 0) {
				badRequest = true;
			} else {
				addCap(requested, n);
			}
			drain();
		}

		@Override
		public void cancel() {
			cancelled = true;
			drain();
		}

		private void drain() {
			if (wip.getAndIncrement() != 0) {
				return;
			}
			int missed = 1;
			do {
				emit();
				missed = wip.addAndGet(-missed);
			} while (missed != 0);
		}

		private void emit() {
			if (done) {
				return;
			}
			try {
				for (;;) {
					if (cancelled) {
						finish();
						return;
					}
					if (badRequest) {
						finish();
						downstream.onError(new IllegalArgumentException(RULE_3_9));
						return;
					}
					if (!iterator.hasNext()) {
						finish();
						downstream.onComplete();
						return;
					}
					if (emitted == requested.get()) {
						return;
					}
					T item = iterator.next();
					if (item == null) {
						finish();
						downstream.onError(new NullPointerException("Flow does not allow null items"));
						return;
					}
					downstream.onNext(item);
					++emitted;
				}
			} catch (Throwable e) {
				if (!done) {
					finish();
					downstream.onError(e);
				}
			}
		}

		private void finish() {
			done = true;
			cancelled = true;
			if (onClose != null) {
				try {
					onClose.run();
				} catch (RuntimeException e) {
					// Closing is best effort
				}
			}
		}

	}

	private static final class FutureSubscription<T> implements Subscription {

		private final Subscriber<? super T> downstream;
		private final CompletionStage<? extends T> stage;
		private final AtomicInteger wip = new AtomicInteger();
		private volatile boolean requested;
		private volatile boolean cancelled;
		private volatile boolean badRequest;
		private volatile boolean ready;
		private T value;
		private Throwable error;
		private boolean done;

		FutureSubscription(Subscriber<? super T> downstream, CompletionStage<? extends T> stage) {
			this.downstream = downstream;
			this.stage = stage;
		}

		void start() {
			downstream.onSubscribe(this);
			stage.whenComplete((v, e) -> {
				value = v;
				error = e;
				ready = true;
				drain();
			});
		}

		@Override
		public void request(long n) {
			if (n <= 0) {
				badRequest = true;
			} else {
				requested = true;
			}
			drain();
		}

		@Override
		public void cancel() {
			cancelled = true;
		}

		private void drain() {
			if (wip.getAndIncrement() != 0) {
				return;
			}
			int missed = 1;
			do {
				emit();
				missed = wip.addAndGet(-missed);
			} while (missed != 0);
		}

		private void emit() {
			if (done || cancelled) {
				return;
			}
			if (badRequest) {
				done = true;
				downstream.onError(new IllegalArgumentException(RULE_3_9));
				return;
			}
			if (!ready) {
				return;
			}
			if (error != null) {
				done = true;
				downstream.onError(unwrap(error));
				return;
			}
			if (value == null) {
				done = true;
				downstream.onComplete();
				return;
			}
			if (requested) {
				done = true;
				downstream.onNext(value);
				if (!cancelled) {
					downstream.onComplete();
				}
			}
		}

	}

	/**
	 * Subscribes to one inner publisher at a time. Bookkeeping is guarded by {@code this}, and
	 * downstream signals by {@code emitLock}, always taken in that order (emitLock, then this),
	 * so that an outer error on one thread and an inner item on another are never delivered
	 * concurrently. Neither lock is held while calling upstream.
	 */
	private static final class ConcatMap<T, R> implements Subscriber<T>, Subscription {

		private final Subscriber<? super R> downstream;
		private final Function<? super T, ? extends Publisher<? extends R>> mapper;
		private final Object emitLock = new Object();
		private final AtomicInteger outerWip = new AtomicInteger();

		// Guarded by this
		private Subscription outer;
		private Subscription inner;
		private long requested;
		private boolean innerActive;
		private boolean outerDone;
		private boolean terminated;

		ConcatMap(Subscriber<? super R> downstream, Function<? super T, ? extends Publisher<? extends R>> mapper) {
			this.downstream = downstream;
			this.mapper = mapper;
		}

		// --- Outer ---

		@Override
		public void onSubscribe(Subscription subscription) {
			synchronized (this) {
				if (outer != null) {
					subscription.cancel();
					return;
				}
				outer = subscription;
			}
			downstream.onSubscribe(this);
			requestOuter();
		}

		@Override
		public void onNext(T item) {
			Publisher<? extends R> publisher;
			try {
				publisher = Objects.requireNonNull(mapper.apply(item), "mapper returned null");
			} catch (Throwable e) {
				cancel(false);
				terminate(e);
				return;
			}
			synchronized (this) {
				if (terminated) {
					return;
				}
				innerActive = true;
			}
			publisher.subscribe(new Inner());
		}

		@Override
		public void onError(Throwable throwable) {
			Subscription currentInner;
			synchronized (this) {
				outerDone = true;
				currentInner = inner;
			}
			if (currentInner != null) {
				currentInner.cancel();
			}
			terminate(throwable);
		}

		@Override
		public void onComplete() {
			boolean complete;
			synchronized (this) {
				outerDone = true;
				complete = !innerActive;
			}
			if (complete) {
				terminate(null);
			}
		}

		// --- Downstream ---

		@Override
		public void request(long n) {
			if (n <= 0) {
				cancel(false);
				terminate(new IllegalArgumentException(RULE_3_9));
				return;
			}
			Subscription currentInner;
			synchronized (this) {
				requested = addCap(requested, n);
				currentInner = inner;
			}
			if (currentInner != null) {
				currentInner.request(n);
			}
		}

		@Override
		public void cancel() {
			cancel(true);
		}

		private void cancel(boolean markTerminated) {
			Subscription currentOuter;
			Subscription currentInner;
			synchronized (this) {
				if (markTerminated) {
					terminated = true;
				}
				currentOuter = outer;
				currentInner = inner;
			}
			if (currentOuter != null) {
				currentOuter.cancel();
			}
			if (currentInner != null) {
				currentInner.cancel();
			}
		}

		private void terminate(Throwable error) {
			synchronized (emitLock) {
				synchronized (this) {
					if (terminated) {
						return;
					}
					terminated = true;
				}
				if (error == null) {
					downstream.onComplete();
				} else {
					downstream.onError(error);
				}
			}
		}

		/**
		 * Trampolined, so that synchronous inner publishers completing inside {@code subscribe}
		 * do not recurse once per outer item.
		 */
		private void requestOuter() {
			if (outerWip.getAndIncrement() != 0) {
				return;
			}
			do {
				Subscription currentOuter;
				synchronized (this) {
					if (terminated) {
						return;
					}
					currentOuter = outer;
				}
				currentOuter.request(1);
			} while (outerWip.decrementAndGet() != 0);
		}

		private final class Inner implements Subscriber<R> {

			@Override
			public void onSubscribe(Subscription subscription) {
				long r;
				synchronized (ConcatMap.this) {
					if (terminated || inner != null) {
						subscription.cancel();
						return;
					}
					inner = subscription;
					r = requested;
				}
				if (r > 0) {
					subscription.request(r);
				}
			}

			@Override
			public void onNext(R item) {
				synchronized (emitLock) {
					synchronized (ConcatMap.this) {
						if (terminated) {
							return;
						}
						if (requested != Long.MAX_VALUE) {
							--requested;
						}
					}
					downstream.onNext(item);
				}
			}

			@Override
			public void onError(Throwable throwable) {
				Subscription currentOuter;
				synchronized (ConcatMap.this) {
					inner = null;
					innerActive = false;
					currentOuter = outer;
				}
				currentOuter.cancel();
				terminate(throwable);
			}

			@Override
			public void onComplete() {
				boolean complete;
				synchronized (ConcatMap.this) {
					inner = null;
					innerActive = false;
					complete = outerDone;
				}
				if (complete) {
					terminate(null);
				} else {
					requestOuter();
				}
			}

		}

	}

	private static final class BlockingSubscriber<T> implements Subscriber<T>, Iterator<T> {

		private static final Object COMPLETE = new Object();

		private record Failure(Throwable error) {}

		private final BlockingQueue<Object> queue = new LinkedBlockingQueue<>();
		private final int limit;
		private final int prefetch;
		private volatile Subscription subscription;
		private volatile boolean cancelled;

		// Confined to the consuming thread
		private Object next;
		private int consumed;
		private boolean finished;

		BlockingSubscriber(int prefetch) {
			this.prefetch = prefetch;
			this.limit = Math.max(1, prefetch - (prefetch >> 2));
		}

		@Override
		public void onSubscribe(Subscription subscription) {
			this.subscription = subscription;
			if (cancelled) {
				subscription.cancel();
			} else {
				subscription.request(prefetch);
			}
		}

		@Override
		public void onNext(T item) {
			queue.add(item);
		}

		@Override
		public void onError(Throwable throwable) {
			queue.add(new Failure(throwable));
		}

		@Override
		public void onComplete() {
			queue.add(COMPLETE);
		}

		void cancel() {
			cancelled = true;
			Subscription s = subscription;
			if (s != null) {
				s.cancel();
			}
		}

		@Override
		public boolean hasNext() {
			if (next != null) {
				return true;
			}
			if (finished) {
				return false;
			}
			Object signal;
			try {
				signal = queue.take();
			} catch (InterruptedException e) {
				Thread.currentThread().interrupt();
				cancel();
				throw new CancellationException("Interrupted while waiting for the next item");
			}
			if (signal == COMPLETE) {
				finished = true;
				return false;
			}
			if (signal instanceof Failure failure) {
				finished = true;
				Throwable error = failure.error();
				if (error instanceof RuntimeException re) {
					throw re;
				}
				if (error instanceof Error er) {
					throw er;
				}
				throw new CompletionException(error);
			}
			next = signal;
			return true;
		}

		@SuppressWarnings("unchecked")
		@Override
		public T next() {
			if (!hasNext()) {
				throw new NoSuchElementException();
			}
			T item = (T) next;
			next = null;
			if (++consumed == limit) {
				consumed = 0;
				subscription.request(limit);
			}
			return item;
		}

	}

}
