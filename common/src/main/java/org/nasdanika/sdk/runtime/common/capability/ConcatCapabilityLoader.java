package org.nasdanika.sdk.runtime.common.capability;

import java.util.List;
import java.util.concurrent.Flow;

import org.nasdanika.sdk.runtime.common.flow.Flows;
import org.nasdanika.sdk.runtime.common.flow.Pump;

/**
 * See {@link CapabilityLoader#concat(CapabilityLoader...)}.
 */
class ConcatCapabilityLoader implements CapabilityLoader {

	private final List<CapabilityLoader> loaders;

	ConcatCapabilityLoader(List<CapabilityLoader> loaders) {
		this.loaders = loaders;
	}

	@Override
	public <T> Flow.Publisher<CapabilityProvider<T>> load(Object requirement, Pump pump) {
		return Flows.concatMap(Flows.fromIterable(loaders), loader -> loader.<T>load(requirement, pump));
	}

	@Override
	public CapabilityLoader withListener(ResolutionListener listener) {
		return new ConcatCapabilityLoader(loaders.stream().map(loader -> loader.withListener(listener)).toList());
	}

}
