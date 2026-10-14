package org.nasdanika.sdk.runtime.models.react.flow.layout;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.nasdanika.sdk.runtime.models.react.flow.FlowEdge;
import org.nasdanika.sdk.runtime.models.react.flow.FlowFactory;
import org.nasdanika.sdk.runtime.models.react.flow.FlowNode;
import org.nasdanika.sdk.runtime.models.react.flow.XYPosition;

/**
 * A simple layered layout: a node without outgoing edges is in layer 0, any other node
 * one layer above the highest node it points to. Edges point down, or right if horizontal,
 * so for dependencies - source depends on target - dependents are on top. Nodes in a layer
 * are ordered by a comparator, in the order of the list by default.
 * <p>
 * Readable, not good: the user is expected to rearrange it, or a layout library to replace it.
 * Back edges of cycles are ignored when layers are computed.
 */
public class LayeredLayout {

	private double nodeSpacing = 200;
	private double layerSpacing = 120;
	private boolean horizontal;
	private Comparator<FlowNode> comparator;

	/**
	 * Distance between nodes in a layer, 200 by default.
	 */
	public LayeredLayout nodeSpacing(double nodeSpacing) {
		this.nodeSpacing = nodeSpacing;
		return this;
	}

	/**
	 * Distance between layers, 120 by default.
	 */
	public LayeredLayout layerSpacing(double layerSpacing) {
		this.layerSpacing = layerSpacing;
		return this;
	}

	/**
	 * Layers left to right instead of top to bottom.
	 */
	public LayeredLayout horizontal(boolean horizontal) {
		this.horizontal = horizontal;
		return this;
	}

	/**
	 * Order of nodes in a layer.
	 */
	public LayeredLayout comparator(Comparator<FlowNode> comparator) {
		this.comparator = comparator;
		return this;
	}

	/**
	 * Sets the positions of the nodes.
	 *
	 * @return Layer of each node
	 */
	public Map<FlowNode, Integer> apply(List<FlowNode> nodes, List<FlowEdge> edges) {
		Map<FlowNode, List<FlowNode>> targets = new HashMap<>();
		for (FlowEdge edge: edges) {
			if (edge.getSource() != null && edge.getTarget() != null) {
				targets.computeIfAbsent(edge.getSource(), s -> new ArrayList<>()).add(edge.getTarget());
			}
		}
		Map<FlowNode, Integer> layers = new LinkedHashMap<>();
		int maxLayer = 0;
		for (FlowNode node: nodes) {
			maxLayer = Math.max(maxLayer, layer(node, targets, layers, new HashSet<>()));
		}

		Map<Integer, List<FlowNode>> byLayer = new HashMap<>();
		for (FlowNode node: nodes) {
			byLayer.computeIfAbsent(layers.get(node), l -> new ArrayList<>()).add(node);
		}
		for (Map.Entry<Integer, List<FlowNode>> entry: byLayer.entrySet()) {
			List<FlowNode> layer = entry.getValue();
			if (comparator != null) {
				layer.sort(comparator);
			}
			for (int i = 0; i < layer.size(); ++i) {
				double along = i * nodeSpacing;
				double across = (maxLayer - entry.getKey()) * layerSpacing;
				XYPosition position = FlowFactory.eINSTANCE.createXYPosition();
				position.setX(horizontal ? across : along);
				position.setY(horizontal ? along : across);
				layer.get(i).setPosition(position);
			}
		}
		return layers;
	}

	private int layer(FlowNode node, Map<FlowNode, List<FlowNode>> targets, Map<FlowNode, Integer> layers, Set<FlowNode> path) {
		Integer cached = layers.get(node);
		if (cached != null) {
			return cached;
		}
		path.add(node);
		int ret = 0;
		for (FlowNode target: targets.getOrDefault(node, List.of())) {
			if (!path.contains(target)) { // Back edge of a cycle
				ret = Math.max(ret, layer(target, targets, layers, path) + 1);
			}
		}
		path.remove(node);
		layers.put(node, ret);
		return ret;
	}

}
