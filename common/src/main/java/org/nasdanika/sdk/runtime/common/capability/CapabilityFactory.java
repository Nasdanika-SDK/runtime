package org.nasdanika.sdk.runtime.common.capability;

import java.util.List;
import java.util.ServiceLoader;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Flow;

import org.nasdanika.sdk.runtime.common.flow.Flows;
import org.nasdanika.sdk.runtime.common.flow.Pump;
import org.nasdanika.sdk.runtime.common.flow.Transformer;

/**
 * Creates providers of capabilities satisfying a requirement. A service interface for
 * {@link ServiceLoader}, and the unit a {@link CapabilityFactorySource} supplies.
 *
 * <p>
 * Use it when there is a requirement object for a provider to interpret, or a resolution that
 * chains. A lookup by type alone is a plain Java service.
 */
public interface CapabilityFactory<R, C> {

	/**
	 * Resolves the requirements a factory depends on, within the same resolution: a requirement
	 * reached more than once is resolved once.
	 */
	interface Loader {

		<T> Flow.Publisher<CapabilityProvider<T>> load(Object requirement);

		/**
		 * The pump the resolution runs on. Work a factory sends off the pump (an HTTP call) must
		 * be tracked on it with {@link Pump#track(java.util.concurrent.CompletionStage, String)},
		 * or the pump will consider the resolution stuck while the work is still out.
		 */
		Pump pump();

		/**
		 * All capabilities for a requirement, without blocking. Provider publishers are tracked
		 * on the pump, because they may produce outside it.
		 */
		default <T> CompletableFuture<List<T>> loadAll(Object requirement) {
			return Flows.toList(Flows.concatMap(this.<T>load(requirement), provider -> pump().track(provider.getPublisher(), "capabilities for " + requirement)));
		}

	}

	boolean canHandle(Object requirement);

	/**
	 * Called on the resolution's pump, once per requirement per resolution.
	 *
	 * <p>
	 * Waiting on a dependency is fine; waiting on a dependency that waits on this requirement is a
	 * cycle, and the resolution fails with a {@link org.nasdanika.sdk.runtime.common.flow.StallException}
	 * naming it.
	 *
	 * @param requirement The requirement, for which {@link #canHandle(Object)} returned true
	 * @param loader Resolves dependency requirements
	 * @return Providers, emitted as they are produced. Null for none
	 */
	Flow.Publisher<CapabilityProvider<C>> create(R requirement, Loader loader);

	/**
	 * A capability factory backed by a transformer factory: a requirement is a source and its
	 * targets are capabilities. One class with many {@link org.nasdanika.sdk.runtime.common.flow.ReflectiveFactory.Mapping}
	 * methods becomes one capability factory contributing many capabilities.
	 *
	 * <p>
	 * Targets that are {@link CapabilityProvider}s are passed as they are, any other target is
	 * wrapped. Through the transformer context, {@code get(requirement)} yields capabilities, not
	 * providers.
	 */
	static CapabilityFactory<Object, Object> of(Transformer.Factory<Object, ?> factory) {
		return new TransformerCapabilityFactory(factory);
	}

}
