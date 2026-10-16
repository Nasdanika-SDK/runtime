package org.example.flow;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.nasdanika.sdk.runtime.common.flow.Flows;
import org.nasdanika.sdk.runtime.common.flow.Transformer;

/**
 * Turns module descriptions, which name the modules they read, into a graph of objects that
 * reference each other. Readability can be cyclic, and the graph wires anyway.
 */
public final class ModuleGraph {

	private ModuleGraph() {
	}

	// tag::types[]
	/**
	 * What a module says about itself: its name and the names of the modules it reads.
	 */
	public record Description(String name, List<String> reads) {
	}

	/**
	 * A node of the graph, with references to the nodes it reads.
	 */
	public static final class Node {

		private final String name;
		private final List<Node> reads = new ArrayList<>();

		Node(String name) {
			this.name = name;
		}

		public String name() {
			return name;
		}

		public List<Node> reads() {
			return reads;
		}

		@Override
		public String toString() {
			return name + " -> " + reads.stream().map(Node::name).toList();
		}

	}
	// end::types[]

	// tag::transform[]
	public static Map<String, List<Node>> build(Map<String, Description> modules, String root) {
		Transformer<String, Node> transformer = new Transformer<>((name, context) -> { // <1>
			Node node = new Node(name);
			for (String read: modules.get(name).reads()) {
				Flows.forEach(context.get(read), node.reads()::add);                    // <2>
			}
			return Flows.of(node);                                                      // <3>
		});
		return transformer.transform(List.of(root));                                   // <4>
	}
	// end::transform[]

}
