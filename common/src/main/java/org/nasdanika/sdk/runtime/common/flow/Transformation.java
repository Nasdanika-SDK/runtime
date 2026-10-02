package org.nasdanika.sdk.runtime.common.flow;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Flow;
import java.util.stream.Collectors;

import org.nasdanika.sdk.runtime.common.telemetry.Telemetry;

import io.opentelemetry.api.trace.Span;
import io.opentelemetry.context.Scope;

/**
 * One resolution of a {@link Transformer} on one {@link Pump}. Each source is resolved once, its
 * targets are cached and replayed to every subscriber, and all state is confined to the pump.
 * {@link #get(Object)} may be called from any thread.
 *
 * <p>
 * While any source is unresolved the transformation is registered as a {@link Pump.Waiter}. If
 * the pump goes idle with sources unresolved, they cannot progress: under
 * {@link Pump.IdlePolicy#COMPLETE} they fail with a {@link StallException} describing what each
 * waits for and naming the cycle if there is one; under {@link Pump.IdlePolicy#FAIL} the same
 * description is in the pump's stall report.
 */
public class Transformation<S, T> {

	private final Transformer.Factory<S, T> factory;
	private final Pump pump;
	private final Map<S, Entry> entries = Collections.synchronizedMap(new LinkedHashMap<>());

	// Confined to the pump
	private int incomplete;
	private Runnable waiterRegistration;

	private final Pump.Waiter waiter = new Pump.Waiter() {

		@Override
		public String describe() {
			return Transformation.this.describe();
		}

		@Override
		public void release() {
			waiterRegistration = null;
			StallException stall = new StallException("Transformation stalled", List.of(describe()));
			List<Entry> stuck;
			synchronized (entries) {
				stuck = entries.values().stream().filter(e -> !e.isDone()).toList();
			}
			for (Entry entry: stuck) {
				entry.fail(stall);
			}
		}

	};

	Transformation(Transformer.Factory<S, T> factory, Pump pump) {
		this.factory = factory;
		this.pump = Objects.requireNonNull(pump, "pump");
	}

	public Pump getPump() {
		return pump;
	}

	/**
	 * Targets of a source. Requesting resolves the source (once per transformation) even if the
	 * publisher is never subscribed to.
	 */
	public Flow.Publisher<T> get(S source) {
		return request(source, null);
	}

	/**
	 * @return true if the source has been requested. Accurate on the pump thread.
	 */
	public boolean contains(S source) {
		return entries.containsKey(source);
	}

	/**
	 * @return Targets of the sources resolved successfully so far, in request order.
	 */
	public Map<S, List<T>> getResults() {
		Map<S, List<T>> results = new LinkedHashMap<>();
		synchronized (entries) {
			for (Entry entry: entries.values()) {
				if (entry.completed) {
					results.put(entry.source, List.copyOf(entry.items));
				}
			}
		}
		return results;
	}

	/**
	 * @return Failures, in request order.
	 */
	public Map<S, Throwable> getErrors() {
		Map<S, Throwable> errors = new LinkedHashMap<>();
		synchronized (entries) {
			for (Entry entry: entries.values()) {
				if (entry.error != null) {
					errors.put(entry.source, entry.error);
				}
			}
		}
		return errors;
	}

	// --- Implementation ---

	private Flow.Publisher<T> request(S source, S requestor) {
		if (pump.isPumping()) {
			ensure(source, requestor);
		} else {
			pump.execute("request " + source, () -> ensure(source, requestor));
		}
		return subscriber -> {
			Objects.requireNonNull(subscriber, "subscriber");
			pump.execute("subscribe to " + source, () -> entries.get(source).subscribe(subscriber));
		};
	}

	private void ensure(S source, S requestor) {
		Entry entry = entries.get(source);
		if (entry == null) {
			entry = new Entry(source, requestor);
			entries.put(source, entry);
			if (incomplete++ == 0) {
				waiterRegistration = pump.register(waiter);
			}
			Entry created = entry;
			pump.execute("create " + source, () -> created.start());
		}
		if (requestor != null) {
			Entry requestorEntry = entries.get(requestor);
			if (requestorEntry != null) {
				requestorEntry.dependencies.add(source);
			}
		}
	}

	private String describe() {
		Map<S, Entry> waiting = new LinkedHashMap<>();
		synchronized (entries) {
			for (Entry entry: entries.values()) {
				if (!entry.isDone()) {
					waiting.put(entry.source, entry);
				}
			}
		}
		StringBuilder builder = new StringBuilder("transformation with ")
				.append(waiting.size())
				.append(" unresolved source(s)");
		List<S> cycle = findCycle(waiting);
		if (cycle != null) {
			builder.append("; cycle: ").append(cycle.stream().map(String::valueOf).collect(Collectors.joining(" -> ")));
		}
		for (Entry entry: waiting.values()) {
			builder.append("; ").append(entry.source);
			if (entry.requestor != null) {
				builder.append(" (requested by ").append(entry.requestor).append(")");
			}
			List<S> waitsOn = entry.dependencies.stream().filter(waiting::containsKey).toList();
			if (waitsOn.isEmpty()) {
				builder.append(" waits on no other source: its publisher did not complete, and work it sent off the pump must be tracked");
			} else {
				builder.append(" waits on ").append(waitsOn);
			}
		}
		return builder.toString();
	}

	private List<S> findCycle(Map<S, Entry> waiting) {
		Set<S> visited = new LinkedHashSet<>();
		for (S start: waiting.keySet()) {
			List<S> cycle = findCycle(start, waiting, visited, new ArrayList<>());
			if (cycle != null) {
				return cycle;
			}
		}
		return null;
	}

	private List<S> findCycle(S node, Map<S, Entry> waiting, Set<S> visited, List<S> path) {
		int index = path.indexOf(node);
		if (index != -1) {
			List<S> cycle = new ArrayList<>(path.subList(index, path.size()));
			cycle.add(node);
			return cycle;
		}
		if (!visited.add(node)) {
			return null;
		}
		path.add(node);
		for (S dependency: waiting.get(node).dependencies) {
			if (waiting.containsKey(dependency)) {
				List<S> cycle = findCycle(dependency, waiting, visited, path);
				if (cycle != null) {
					return cycle;
				}
			}
		}
		path.remove(path.size() - 1);
		return null;
	}

	/**
	 * A source's resolution: the factory's context, the subscriber to the factory's publisher, and
	 * the cache replayed to subscribers.
	 */
	private final class Entry implements Transformer.Context<S, T>, Flow.Subscriber<T> {

		final S source;
		final S requestor;
		final Set<S> dependencies = Collections.synchronizedSet(new LinkedHashSet<>());
		final List<T> items = new ArrayList<>();
		final List<Replay> subscribers = new ArrayList<>();
		Flow.Subscription upstream;
		Span span;
		volatile boolean completed;
		volatile Throwable error;

		Entry(S source, S requestor) {
			this.source = source;
			this.requestor = requestor;
		}

		boolean isDone() {
			return completed || error != null;
		}

		void start() {
			span = Telemetry.tracer(Telemetry.current())
					.spanBuilder("Transformer.create")
					.setAttribute(Telemetry.TRANSFORMER_SOURCE, String.valueOf(source))
					.startSpan();
			try (Scope scope = span.makeCurrent()) {
				Flow.Publisher<? extends T> publisher;
				try {
					publisher = factory.canHandle(source) ? factory.create(source, this) : null;
				} catch (Throwable e) {
					fail(e);
					return;
				}
				if (publisher == null) {
					complete();
				} else {
					publisher.subscribe(pump.confine(this, "targets of " + source));
				}
			}
		}

		// --- Context ---

		@Override
		public S source() {
			return source;
		}

		@Override
		public Flow.Publisher<T> get(S dependency) {
			return request(dependency, source);
		}

		@Override
		public Pump pump() {
			return pump;
		}

		// --- Subscriber to the factory's publisher ---

		@Override
		public void onSubscribe(Flow.Subscription subscription) {
			if (upstream != null || isDone()) {
				subscription.cancel();
				return;
			}
			upstream = subscription;
			subscription.request(Long.MAX_VALUE);
		}

		@Override
		public void onNext(T item) {
			if (isDone()) {
				return;
			}
			items.add(item);
			deliver();
		}

		@Override
		public void onError(Throwable throwable) {
			fail(throwable);
		}

		@Override
		public void onComplete() {
			complete();
		}

		// --- Implementation ---

		void complete() {
			if (isDone()) {
				return;
			}
			completed = true;
			finish();
		}

		void fail(Throwable throwable) {
			if (isDone()) {
				return;
			}
			error = throwable;
			if (upstream != null) {
				upstream.cancel();
			}
			finish();
		}

		private void finish() {
			if (span != null) {
				span.setAttribute(Telemetry.TRANSFORMER_TARGETS, (long) items.size());
				if (error != null) {
					Telemetry.recordFailure(span, error);
				}
				span.end();
			}
			if (--incomplete == 0 && waiterRegistration != null) {
				waiterRegistration.run();
				waiterRegistration = null;
			}
			deliver();
		}

		private void deliver() {
			for (Replay replay: List.copyOf(subscribers)) {
				replay.deliver();
			}
		}

		void subscribe(Flow.Subscriber<? super T> subscriber) {
			Replay replay = new Replay(subscriber);
			subscribers.add(replay);
			subscriber.onSubscribe(replay);
			replay.deliver();
		}

		private final class Replay implements Flow.Subscription {

			final Flow.Subscriber<? super T> downstream;
			int index;
			long requested;
			boolean cancelled;
			boolean delivering;

			Replay(Flow.Subscriber<? super T> downstream) {
				this.downstream = downstream;
			}

			@Override
			public void request(long n) {
				onPump(() -> {
					if (cancelled) {
						return;
					}
					if (n <= 0) {
						cancelled = true;
						subscribers.remove(this);
						downstream.onError(new IllegalArgumentException(Flows.RULE_3_9));
						return;
					}
					requested = Flows.addCap(requested, n);
					deliver();
				});
			}

			@Override
			public void cancel() {
				onPump(() -> {
					cancelled = true;
					subscribers.remove(this);
				});
			}

			void deliver() {
				if (delivering || cancelled) {
					return;
				}
				delivering = true;
				try {
					while (!cancelled && index < items.size() && requested > 0) {
						T item = items.get(index++);
						if (requested != Long.MAX_VALUE) {
							--requested;
						}
						downstream.onNext(item);
					}
					if (!cancelled && index == items.size() && isDone()) {
						cancelled = true;
						subscribers.remove(this);
						if (error == null) {
							downstream.onComplete();
						} else {
							downstream.onError(error);
						}
					}
				} finally {
					delivering = false;
				}
			}

			private void onPump(Runnable action) {
				if (pump.isPumping()) {
					action.run();
				} else {
					pump.execute("targets of " + source, action);
				}
			}

		}

	}

}
