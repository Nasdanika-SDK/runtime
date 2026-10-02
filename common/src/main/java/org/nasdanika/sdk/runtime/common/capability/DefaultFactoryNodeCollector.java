package org.nasdanika.sdk.runtime.common.capability;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.nasdanika.sdk.runtime.common.capability.ResolutionEvent.DependencyRequested;
import org.nasdanika.sdk.runtime.common.capability.ResolutionEvent.Resolved;

/**
 * Assembles factory nodes from {@link DependencyRequested} and {@link Resolved} events.
 */
class DefaultFactoryNodeCollector implements ResolutionListener.FactoryNodeCollector {

	private record Key(Object requirement, CapabilityFactory<?, ?> factory) {}

	private final Map<Key, List<Object>> dependencies = new LinkedHashMap<>();
	private final List<FactoryNode> nodes = new ArrayList<>();

	@Override
	public synchronized void on(ResolutionEvent event) {
		switch (event) {
			case DependencyRequested e -> dependencies.computeIfAbsent(new Key(e.requirement(), e.factory()), k -> new ArrayList<>()).add(e.dependency());
			case Resolved e -> nodes.add(new FactoryNode(
					e.requirement(),
					e.factory(),
					e.providers(),
					List.copyOf(dependencies.getOrDefault(new Key(e.requirement(), e.factory()), List.of()))));
			default -> {
				// Not needed for the graph
			}
		}
	}

	@Override
	public synchronized List<FactoryNode> getFactoryNodes() {
		return List.copyOf(nodes);
	}

}
