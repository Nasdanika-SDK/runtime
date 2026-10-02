package org.nasdanika.sdk.runtime.common.capability;

import java.util.List;
import java.util.Objects;
import java.util.concurrent.Flow;
import java.util.concurrent.atomic.AtomicBoolean;

import org.nasdanika.sdk.runtime.common.flow.Flows;
import org.nasdanika.sdk.runtime.common.flow.Pump;

/**
 * See {@link CapabilityLoader#fallback(CapabilityLoader...)}. Relies on {@code concatMap}
 * mapping the next loader only after the previous one's providers completed, so whether any were
 * found is known by then.
 */
class FallbackCapabilityLoader implements CapabilityLoader {

	private final List<CapabilityLoader> loaders;

	FallbackCapabilityLoader(List<CapabilityLoader> loaders) {
		this.loaders = loaders;
	}

	@Override
	public <T> Flow.Publisher<CapabilityProvider<T>> load(Object requirement, Pump pump) {
		return subscriber -> {
			Objects.requireNonNull(subscriber, "subscriber");
			AtomicBoolean found = new AtomicBoolean();
			Flows.concatMap(
					Flows.fromIterable(loaders),
					loader -> found.get() ? Flows.<CapabilityProvider<T>>empty() : Flows.peek(loader.<T>load(requirement, pump), provider -> found.set(true)))
				.subscribe(subscriber);
		};
	}

	@Override
	public CapabilityLoader withListener(ResolutionListener listener) {
		return new FallbackCapabilityLoader(loaders.stream().map(loader -> loader.withListener(listener)).toList());
	}

}
