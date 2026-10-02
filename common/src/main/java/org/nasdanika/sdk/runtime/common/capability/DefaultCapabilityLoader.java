package org.nasdanika.sdk.runtime.common.capability;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Flow;
import java.util.concurrent.atomic.AtomicInteger;

import org.nasdanika.sdk.runtime.common.capability.ResolutionEvent.CacheHit;
import org.nasdanika.sdk.runtime.common.capability.ResolutionEvent.Completed;
import org.nasdanika.sdk.runtime.common.capability.ResolutionEvent.DependencyRequested;
import org.nasdanika.sdk.runtime.common.capability.ResolutionEvent.FactoryConsidered;
import org.nasdanika.sdk.runtime.common.capability.ResolutionEvent.Failed;
import org.nasdanika.sdk.runtime.common.capability.ResolutionEvent.Requested;
import org.nasdanika.sdk.runtime.common.capability.ResolutionEvent.Resolved;
import org.nasdanika.sdk.runtime.common.flow.Flows;
import org.nasdanika.sdk.runtime.common.flow.Pump;
import org.nasdanika.sdk.runtime.common.flow.Transformation;
import org.nasdanika.sdk.runtime.common.flow.Transformer;

/**
 * Resolves requirements against a {@link CapabilityFactorySource}.
 *
 * <p>
 * A resolution is a {@link Transformation}: requirements are sources, providers are targets, and
 * the transformer factory runs every capability factory that can handle the requirement and
 * concatenates their providers. The transformation supplies what the old loader hand-built:
 * memoization per resolution, a trampoline instead of recursion, and cycle detection, which now
 * reports the cycle's path through the pump's stall detection instead of throwing an
 * {@code IllegalArgumentException} for a direct self-dependency only.
 */
public class DefaultCapabilityLoader implements CapabilityLoader {

	private final CapabilityFactorySource source;
	private final ResolutionListener listener;

	public DefaultCapabilityLoader(CapabilityFactorySource source) {
		this(source, ResolutionListener.NOP);
	}

	public DefaultCapabilityLoader(CapabilityFactorySource source, ResolutionListener listener) {
		this.source = Objects.requireNonNull(source, "source");
		this.listener = Objects.requireNonNull(listener, "listener");
	}

	public CapabilityFactorySource getSource() {
		return source;
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public <T> Flow.Publisher<CapabilityProvider<T>> load(Object requirement, Pump pump) {
		Resolution resolution = new Resolution(pump);
		listener.on(new Requested(requirement, null));
		return (Flow.Publisher) resolution.transformation.get(requirement);
	}

	@Override
	public CapabilityLoader withListener(ResolutionListener listener) {
		return new DefaultCapabilityLoader(source, listener);
	}

	/**
	 * The transformer factory of one resolution.
	 */
	private class Resolution implements Transformer.Factory<Object, CapabilityProvider<Object>> {

		final Transformation<Object, CapabilityProvider<Object>> transformation;

		Resolution(Pump pump) {
			transformation = new Transformer<>(this).start(pump);
		}

		@Override
		public Flow.Publisher<CapabilityProvider<Object>> create(Object requirement, Transformer.Context<Object, CapabilityProvider<Object>> context) {
			long start = System.nanoTime();
			List<CapabilityFactory<Object, Object>> handling = new ArrayList<>();
			for (CapabilityFactory<Object, Object> factory: source.getFactories()) {
				boolean canHandle = factory.canHandle(requirement);
				listener.on(new FactoryConsidered(requirement, factory, canHandle));
				if (canHandle) {
					handling.add(factory);
				}
			}

			Flow.Publisher<CapabilityProvider<Object>> providers = Flows.concatMap(Flows.fromIterable(handling), factory -> create(factory, requirement, context));
			AtomicInteger count = new AtomicInteger();
			return Flows.onTerminate(
					Flows.peek(providers, provider -> count.incrementAndGet()),
					error -> listener.on(error == null ? new Completed(requirement, count.get(), System.nanoTime() - start) : new Failed(requirement, error)));
		}

		private Flow.Publisher<CapabilityProvider<Object>> create(
				CapabilityFactory<Object, Object> factory,
				Object requirement,
				Transformer.Context<Object, CapabilityProvider<Object>> context) {

			CapabilityFactory.Loader loader = new CapabilityFactory.Loader() {

				@SuppressWarnings({ "unchecked", "rawtypes" })
				@Override
				public <T> Flow.Publisher<CapabilityProvider<T>> load(Object dependency) {
					listener.on(new DependencyRequested(requirement, factory, dependency));
					listener.on(transformation.contains(dependency) ? new CacheHit(dependency, requirement) : new Requested(dependency, requirement));
					return (Flow.Publisher) context.get(dependency);
				}

				@Override
				public Pump pump() {
					return context.pump();
				}

			};

			Flow.Publisher<CapabilityProvider<Object>> created;
			try {
				created = factory.create(requirement, loader);
			} catch (Throwable e) {
				return Flows.error(e);
			}
			if (created == null) {
				created = Flows.empty();
			}
			List<CapabilityProvider<Object>> produced = Collections.synchronizedList(new ArrayList<>());
			return Flows.onTerminate(
					Flows.peek(created, produced::add),
					error -> {
						if (error == null) {
							listener.on(new Resolved(requirement, factory, List.copyOf(produced)));
						}
					});
		}

	}

}
