package org.nasdanika.sdk.runtime.common.flow;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Flow;

import org.nasdanika.sdk.runtime.common.telemetry.Telemetry;

import io.opentelemetry.api.common.Attributes;

/**
 * Maps sources to publishers of targets. A source may produce no target, one, or many, and a
 * factory may ask for the targets of other sources while producing its own.
 *
 * <h2>Resolution</h2>
 *
 * A {@link Transformation} is one resolution on one {@link Pump}: each source is resolved once
 * within it (memoized), its targets are replayed to everyone who asks, and all work runs through
 * the pump, so it is deterministic and never recursive. Requesting a source enqueues its
 * creation instead of running it inline, which is the trampoline that keeps a factory asking for
 * itself from recursing.
 *
 * <h2>Wiring</h2>
 *
 * There is no separate wiring phase. A factory emits its target and subscribes to the targets of
 * the sources it references, wiring them as they arrive:
 *
 * <pre>
 * (node, context) -&gt; {
 *     Vertex vertex = new Vertex(node.name());
 *     for (Node ref: node.references()) {
 *         Flows.forEach(context.get(ref), vertex::connect);
 *     }
 *     return Flows.of(vertex);
 * }
 * </pre>
 *
 * Because emitting does not wait for references, cyclic object graphs wire without deadlock.
 * A factory that does need another source's targets before it can emit its own waits on them
 * (for example {@code Flows.toList(context.get(other))} into {@code Flows.fromFuture}); if two
 * sources wait on each other, the pump goes idle and the transformation fails both with a
 * {@link StallException} naming the cycle.
 *
 * <h2>Telemetry</h2>
 *
 * {@link #transform(Collection)} runs in a {@code Transformer.transform} span, and each source is
 * created in a {@code Transformer.create} span, from the factory call to the completion of its
 * publisher. A source requested by a factory is created in a child span of the requesting source's
 * span, so the span tree shows the dependencies.
 *
 * <h2>What changed from the CompletionStage version</h2>
 *
 * One source to one target, a construction phase and a wiring phase with requeue on false, and a
 * pass limit. Now: a source maps to a publisher, wiring is subscription, and the pass limit is
 * the pump's stall detection, which fails at once and says what was stuck.
 *
 * @param <S> Source type
 * @param <T> Target type
 */
public class Transformer<S, T> {

	/**
	 * Creates the targets of one source.
	 */
	@FunctionalInterface
	public interface Factory<S, T> {

		/**
		 * Called once per source per transformation, on the pump.
		 *
		 * @return Publisher of the source's targets. Null for none. Work it does off the pump must be
		 * {@link Pump#track(java.util.concurrent.CompletionStage, String) tracked}
		 */
		Flow.Publisher<? extends T> create(S source, Context<S, T> context);

		/**
		 * Sources this factory declines produce no targets, without calling {@link #create(Object, Context)}.
		 */
		default boolean canHandle(S source) {
			return true;
		}

	}

	/**
	 * What a factory sees while creating the targets of a source.
	 */
	public interface Context<S, T> {

		/**
		 * The source being transformed.
		 */
		S source();

		/**
		 * Targets of another source, resolved within the same transformation. Recorded as a
		 * dependency of {@link #source()}, which is what stall reports use to name cycles.
		 */
		Flow.Publisher<T> get(S source);

		Pump pump();

	}

	private final Factory<S, T> factory;

	public Transformer(Factory<S, T> factory) {
		this.factory = Objects.requireNonNull(factory, "factory");
	}

	public Factory<S, T> getFactory() {
		return factory;
	}

	/**
	 * Starts a resolution on the given pump. Nothing runs until somebody pumps, or until the
	 * pump's executor does.
	 */
	public Transformation<S, T> start(Pump pump) {
		return new Transformation<>(factory, pump);
	}

	/**
	 * Transforms the sources on a new single-threaded pump and settles it.
	 *
	 * @return Targets of every source resolved, including those requested by factories, in the
	 * order they were requested
	 * @throws StallException if resolution stalled, for example on a cycle
	 * @throws RuntimeException the first failure of any source, with the rest suppressed
	 */
	public Map<S, List<T>> transform(Collection<? extends S> sources) {
		return transform(sources, Pump.Options.DEFAULT);
	}

	public Map<S, List<T>> transform(Collection<? extends S> sources, Pump.Options options) {
		Attributes attributes = Attributes.of(Telemetry.TRANSFORMER_SOURCES, (long) sources.size());
		return Telemetry.inSpan(Telemetry.tracer(Telemetry.current()), "Transformer.transform", attributes, span -> {
			Map<S, List<T>> results = transform(sources, new Pump(options));
			span.setAttribute(Telemetry.TRANSFORMER_TARGETS, results.values().stream().mapToLong(List::size).sum());
			return results;
		});
	}

	private Map<S, List<T>> transform(Collection<? extends S> sources, Pump pump) {
		Transformation<S, T> transformation = start(pump);
		List<CompletableFuture<List<T>>> results = new ArrayList<>();
		for (S source: sources) {
			results.add(Flows.toList(transformation.get(source)));
		}
		pump.settle();
		for (CompletableFuture<List<T>> result: results) {
			pump.join(result);
		}
		Map<S, Throwable> errors = transformation.getErrors();
		if (!errors.isEmpty()) {
			RuntimeException failure = null;
			for (Throwable error: errors.values()) {
				if (failure == null) {
					failure = error instanceof RuntimeException re ? re : new PumpException("Transformation failed", error);
				} else if (failure != error) {
					failure.addSuppressed(error);
				}
			}
			throw failure;
		}
		return transformation.getResults();
	}

}
