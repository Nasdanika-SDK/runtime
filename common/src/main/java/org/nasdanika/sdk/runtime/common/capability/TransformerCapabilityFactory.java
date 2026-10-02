package org.nasdanika.sdk.runtime.common.capability;

import java.util.Objects;
import java.util.concurrent.Flow;

import org.nasdanika.sdk.runtime.common.flow.Flows;
import org.nasdanika.sdk.runtime.common.flow.Pump;
import org.nasdanika.sdk.runtime.common.flow.Transformer;

/**
 * Adapts a {@link Transformer.Factory} to a {@link CapabilityFactory}: requirements are sources,
 * capabilities are targets. See {@link CapabilityFactory#of(Transformer.Factory)}.
 */
public class TransformerCapabilityFactory implements CapabilityFactory<Object, Object> {

	private final Transformer.Factory<Object, Object> factory;

	@SuppressWarnings("unchecked")
	public TransformerCapabilityFactory(Transformer.Factory<Object, ?> factory) {
		this.factory = (Transformer.Factory<Object, Object>) Objects.requireNonNull(factory, "factory");
	}

	@Override
	public boolean canHandle(Object requirement) {
		return factory.canHandle(requirement);
	}

	@Override
	public Flow.Publisher<CapabilityProvider<Object>> create(Object requirement, Loader loader) {
		Transformer.Context<Object, Object> context = new Transformer.Context<>() {

			@Override
			public Object source() {
				return requirement;
			}

			@Override
			public Flow.Publisher<Object> get(Object dependency) {
				return Flows.concatMap(
						loader.load(dependency),
						provider -> loader.pump().track(provider.getPublisher(), "capabilities for " + dependency));
			}

			@Override
			public Pump pump() {
				return loader.pump();
			}

		};
		Flow.Publisher<?> targets = factory.create(requirement, context);
		return targets == null ? null : Flows.map(targets, TransformerCapabilityFactory::provider);
	}

	@SuppressWarnings("unchecked")
	private static CapabilityProvider<Object> provider(Object target) {
		return target instanceof CapabilityProvider<?> provider ? (CapabilityProvider<Object>) provider : CapabilityProvider.of(target);
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + "[" + factory + "]";
	}

}
