package org.nasdanika.sdk.runtime.common.capability;

import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Flow;

import org.nasdanika.sdk.runtime.common.flow.Flows;
import org.nasdanika.sdk.runtime.common.flow.Pump;

/**
 * See {@link CapabilityLoader#cached(CapabilityLoader)}.
 *
 * <p>
 * The first request for a requirement resolves it on the requester's pump. A later request on
 * another pump while that is in progress waits for it, tracked as in flight on its own pump,
 * because the result is produced elsewhere. Failures are evicted so that they can be retried.
 */
class CachingCapabilityLoader implements CapabilityLoader {

	private record Entry(Pump pump, CompletableFuture<List<CapabilityProvider<Object>>> providers) {}

	private final CapabilityLoader loader;
	private final Map<Object, Entry> cache;

	CachingCapabilityLoader(CapabilityLoader loader) {
		this(loader, new ConcurrentHashMap<>());
	}

	private CachingCapabilityLoader(CapabilityLoader loader, Map<Object, Entry> cache) {
		this.loader = Objects.requireNonNull(loader, "loader");
		this.cache = cache;
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public <T> Flow.Publisher<CapabilityProvider<T>> load(Object requirement, Pump pump) {
		return subscriber -> {
			Objects.requireNonNull(subscriber, "subscriber");
			Entry candidate = new Entry(pump, new CompletableFuture<>());
			Entry existing = cache.putIfAbsent(requirement, candidate);
			Entry entry = existing == null ? candidate : existing;
			if (existing == null) {
				Flows.toList(loader.<Object>load(requirement, pump)).whenComplete((providers, error) -> {
					if (error == null) {
						candidate.providers().complete(providers);
					} else {
						cache.remove(requirement, candidate);
						candidate.providers().completeExceptionally(error);
					}
				});
			}

			CompletableFuture<List<CapabilityProvider<Object>>> providers = entry.providers();
			if (!providers.isDone() && entry.pump() != pump) {
				providers = pump.track(providers, "cached capability providers for " + requirement);
			}
			Flow.Publisher<CapabilityProvider<Object>> publisher = Flows.concatMap(Flows.fromFuture(providers), Flows::fromIterable);
			((Flow.Publisher) publisher).subscribe(subscriber);
		};
	}

	@Override
	public CapabilityLoader withListener(ResolutionListener listener) {
		return new CachingCapabilityLoader(loader.withListener(listener), cache);
	}

}
