package org.nasdanika.sdk.runtime.models.react.flow.tests;

import java.lang.module.ModuleDescriptor;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.nasdanika.sdk.runtime.models.react.tests.ModuleGraph;

/**
 * The module dependency graph the diagram tests draw: the module this test runs in and
 * every module it requires, transitively, within its layer. JDK modules (java.*, jdk.*)
 * are included and flagged, so a diagram can hide or show them.
 * <p>
 * The layout is a deliberately simple layered one: a module sits one layer above the
 * highest module it requires, dependents on top, and modules in a layer are placed left
 * to right by name. It is readable and not good, which is the point: the user is
 * expected to rearrange it.
 */
final class ModuleGraph {

	record Node(String name, boolean jdk, int layer, double x, double y) {}

	record Edge(String source, String target) {}

	static final double X_SPACING = 210;

	static final double Y_SPACING = 120;

	final List<Node> nodes = new ArrayList<>();

	final List<Edge> edges = new ArrayList<>();

	ModuleGraph(Class<?> anchor) {
		Module root = anchor.getModule();
		ModuleLayer layer = root.getLayer() == null ? ModuleLayer.boot() : root.getLayer();

		// Reachable modules. On the class path the anchor is unnamed, so start from every
		// non-JDK module in the layer instead.
		Map<String, Module> modules = new LinkedHashMap<>();
		List<Module> roots = root.isNamed()
				? List.of(root)
				: layer.modules().stream().filter(module -> !isJdk(module.getName())).toList();
		for (Module module : roots) {
			collect(module, layer, modules);
		}

		for (Module module : modules.values()) {
			for (ModuleDescriptor.Requires requires : module.getDescriptor().requires()) {
				if (modules.containsKey(requires.name())) {
					edges.add(new Edge(module.getName(), requires.name()));
				}
			}
		}
		edges.sort(Comparator.comparing(Edge::source).thenComparing(Edge::target));

		Map<String, Integer> layers = new HashMap<>();
		int maxLayer = 0;
		for (String name : modules.keySet()) {
			maxLayer = Math.max(maxLayer, layer(name, layers));
		}

		Map<Integer, List<String>> byLayer = new HashMap<>();
		modules.keySet()
				.stream()
				.sorted(Comparator.comparing(ModuleGraph::isJdk).thenComparing(Comparator.naturalOrder()))
				.forEach(name -> byLayer.computeIfAbsent(layers.get(name), l -> new ArrayList<>()).add(name));

		for (Map.Entry<Integer, List<String>> entry : byLayer.entrySet()) {
			List<String> names = entry.getValue();
			for (int i = 0; i < names.size(); i++) {
				String name = names.get(i);
				nodes.add(new Node(name, isJdk(name), entry.getKey(), i * X_SPACING, (maxLayer - entry.getKey()) * Y_SPACING));
			}
		}
		nodes.sort(Comparator.comparing(Node::name));
	}

	static boolean isJdk(String moduleName) {
		return moduleName.startsWith("java.") || moduleName.startsWith("jdk.");
	}

	private static void collect(Module module, ModuleLayer layer, Map<String, Module> modules) {
		if (modules.putIfAbsent(module.getName(), module) == null) {
			for (ModuleDescriptor.Requires requires : module.getDescriptor().requires()) {
				layer.findModule(requires.name()).ifPresent(required -> collect(required, layer, modules));
			}
		}
	}

	/**
	 * Layer 0 for modules which require nothing in the graph, otherwise one above the
	 * highest required module. The module graph is acyclic by JPMS rules, so this
	 * terminates.
	 */
	private int layer(String name, Map<String, Integer> layers) {
		Integer cached = layers.get(name);
		if (cached != null) {
			return cached;
		}
		int ret = 0;
		for (Edge edge : edges) {
			if (edge.source().equals(name)) {
				ret = Math.max(ret, layer(edge.target(), layers) + 1);
			}
		}
		layers.put(name, ret);
		return ret;
	}

}
