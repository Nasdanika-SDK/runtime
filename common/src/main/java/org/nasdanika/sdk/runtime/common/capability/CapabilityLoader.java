package org.nasdanika.sdk.runtime.common.capability;

import java.util.List;
import java.util.concurrent.Flow;

import org.nasdanika.sdk.runtime.common.flow.Flows;
import org.nasdanika.sdk.runtime.common.flow.Pump;
import org.nasdanika.sdk.runtime.common.flow.Transformer;
import org.nasdanika.sdk.runtime.common.telemetry.Telemetry;

import io.opentelemetry.api.common.Attributes;

/**
 * Resolves requirements to capability providers.
 *
 * <p>
 * Stateless, and not closeable. The memoization that keeps a shared dependency from being
 * resolved twice is per resolution, not per loader; the trace goes to a
 * {@link ResolutionListener}, not into an accumulating field; and disposing factories is the
 * {@link CapabilityFactorySource}'s job. That is what makes {@link #getInstance()} safe to share,
 * rather than a JVM-lifetime cache with an unbounded trace attached.
 *
 * <h2>Pumps</h2>
 *
 * A resolution runs on a {@link Pump}. Pass one to resolve inside a larger pumped computation, a
 * reactive runner for example, so that capability loading is ordered and settled with the rest of
 * its work. The blocking conveniences create their own and pump it on the calling thread.
 *
 * <h2>Composition</h2>
 *
 * Resolution yields many providers, so {@link #concat} is the natural composition and
 * {@link #fallback} the special case: they differ in whether a lower-priority loader contributes
 * alongside a higher one. Composing loaders keeps resolutions separate; to let factories from
 * several places satisfy each other's dependencies, compose
 * {@link CapabilityFactorySource#concat(CapabilityFactorySource...) sources} instead.
 */
public interface CapabilityLoader {

	/**
	 * Resolves a requirement on the given pump. Providers are emitted as the factories producing
	 * them complete, in factory order.
	 */
	<T> Flow.Publisher<CapabilityProvider<T>> load(Object requirement, Pump pump);

	/**
	 * Resolves a requirement on a new pump drained by virtual threads, for subscribers that do not
	 * pump.
	 */
	default <T> Flow.Publisher<CapabilityProvider<T>> load(Object requirement) {
		return load(requirement, new Pump(Pump.Options.DEFAULT.withExecutor(Pump.Options.VIRTUAL_THREADS)));
	}

	/**
	 * A loader reporting resolution events to the listener. A new instance: statelessness is what
	 * the rest of the design rests on.
	 */
	CapabilityLoader withListener(ResolutionListener listener);

	// --- Blocking conveniences, at the edge ---

	/**
	 * All capabilities for the requirement, pumping on the calling thread.
	 *
	 * @throws org.nasdanika.sdk.runtime.common.flow.StallException if resolution stalled, for example on a requirement cycle
	 */
	default <T> List<T> loadAll(Object requirement) {
		return Telemetry.inSpan(Telemetry.tracer(Telemetry.current()), "CapabilityLoader.loadAll", attributes(requirement), span -> {
			Pump pump = new Pump();
			List<T> capabilities = pump.join(Flows.toList(capabilities(this.<T>load(requirement, pump), pump, requirement)));
			span.setAttribute(Telemetry.CAPABILITY_PROVIDERS, (long) capabilities.size());
			return capabilities;
		});
	}

	/**
	 * The first capability, or null. Stops at the first: the providers after it are not
	 * subscribed to, and resolution work still queued is abandoned with the pump.
	 */
	default <T> T loadOne(Object requirement) {
		return Telemetry.inSpan(Telemetry.tracer(Telemetry.current()), "CapabilityLoader.loadOne", attributes(requirement), span -> {
			Pump pump = new Pump();
			return pump.join(Flows.first(capabilities(this.<T>load(requirement, pump), pump, requirement))).orElse(null);
		});
	}

	private static Attributes attributes(Object requirement) {
		return Attributes.of(Telemetry.CAPABILITY_REQUIREMENT, String.valueOf(requirement));
	}

	/**
	 * Flattens providers into capabilities. Provider publishers are tracked as in flight, because
	 * a provider may produce outside the pump.
	 */
	static <T> Flow.Publisher<T> capabilities(Flow.Publisher<CapabilityProvider<T>> providers, Pump pump, Object requirement) {
		return Flows.concatMap(providers, provider -> pump.track(provider.getPublisher(), "capabilities for " + requirement));
	}

	// --- Construction ---

	/**
	 * A loader over a factory source. The ordinary case.
	 */
	static CapabilityLoader of(CapabilityFactorySource source) {
		return new DefaultCapabilityLoader(source);
	}

	static CapabilityLoader of(CapabilityFactory<?, ?>... factories) {
		return of(CapabilityFactorySource.of(factories));
	}

	/**
	 * A loader backed by a transformer factory, for a class contributing many capabilities
	 * through {@link org.nasdanika.sdk.runtime.common.flow.ReflectiveFactory.Mapping} methods, or
	 * for a local, task-specific loader. To let it use globally registered capabilities as well,
	 * concatenate sources:
	 *
	 * <pre>
	 * CapabilityLoader.of(CapabilityFactorySource.concat(
	 *     CapabilityFactorySource.of(CapabilityFactory.of(mappings)),
	 *     CapabilityFactorySource.serviceLoader()));
	 * </pre>
	 */
	static CapabilityLoader of(Transformer.Factory<Object, ?> factory) {
		return of(CapabilityFactory.of(factory));
	}

	/**
	 * The shared loader over the service loader's factories.
	 *
	 * <p>
	 * Held in a nested class so that acquiring it is lazy: an interface field would run
	 * {@code ServiceLoader.load} the first time anything touches this type, including code that
	 * only takes a loader as a parameter.
	 */
	static CapabilityLoader getInstance() {
		return Holder.INSTANCE;
	}

	/**
	 * @hidden
	 */
	final class Holder {

		private Holder() {}

		static final CapabilityLoader INSTANCE = CapabilityLoader.of(CapabilityFactorySource.serviceLoader());

	}

	// --- Composition ---

	/**
	 * Every loader contributes providers, in order.
	 */
	static CapabilityLoader concat(CapabilityLoader... loaders) {
		return new ConcatCapabilityLoader(List.of(loaders));
	}

	/**
	 * The first loader producing any provider wins, and the rest are not consulted.
	 */
	static CapabilityLoader fallback(CapabilityLoader... loaders) {
		return new FallbackCapabilityLoader(List.of(loaders));
	}

	/**
	 * Memoizes across calls, which a loader deliberately does not do by itself. Opt in where the
	 * same requirements recur and the answers are stable, and remember that nothing evicts except
	 * failure.
	 */
	static CapabilityLoader cached(CapabilityLoader loader) {
		return new CachingCapabilityLoader(loader);
	}

}
