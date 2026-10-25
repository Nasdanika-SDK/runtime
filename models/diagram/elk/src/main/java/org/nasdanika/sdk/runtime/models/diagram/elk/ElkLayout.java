package org.nasdanika.sdk.runtime.models.diagram.elk;

import java.util.LinkedHashMap;
import java.util.Map;

import org.eclipse.elk.core.util.BasicProgressMonitor;
import org.eclipse.elk.graph.ElkNode;
import org.eclipse.elk.graph.properties.IProperty;
import org.nasdanika.sdk.runtime.common.telemetry.Telemetry;
import org.nasdanika.sdk.runtime.models.diagram.DiagramElement;

import io.opentelemetry.api.common.AttributeKey;
import io.opentelemetry.api.common.Attributes;

/**
 * Lays out diagram elements with the Eclipse Layout Kernel.
 * <p>
 * {@link #layout(DiagramElement)} builds an ELK graph from a diagram element and what it contains,
 * runs ELK, and writes the results back into the diagram (see {@link DiagramElkGraph}). Layout
 * options come from three places, later ones winning: ELK's defaults, options set on this object
 * with {@link #option(IProperty, Object)}, and attributes of the diagram elements whose keys are
 * ELK option ids, such as {@code elk.algorithm} or {@code elk.direction}.
 * <p>
 * Nodes without bounds are sized to fit their name, measured with the {@link TextMeasurer}.
 */
public class ElkLayout {

	public static final AttributeKey<String> ROOT = AttributeKey.stringKey("nasdanika.diagram.root");

	public static final AttributeKey<Long> NODES = AttributeKey.longKey("nasdanika.diagram.nodes");

	public static final AttributeKey<Long> EDGES = AttributeKey.longKey("nasdanika.diagram.edges");

	private TextMeasurer textMeasurer = TextMeasurer.DEFAULT;
	private double horizontalPadding = 12;
	private double verticalPadding = 8;
	private double minimumNodeWidth = 80;
	private double minimumNodeHeight = 36;
	private double portSize = 0;
	private boolean createNameLabels = true;
	private final Map<IProperty<?>, Object> options = new LinkedHashMap<>();

	public ElkLayout textMeasurer(TextMeasurer textMeasurer) {
		this.textMeasurer = textMeasurer;
		return this;
	}

	/**
	 * Room around the name of a node sized to fit it, and around the nodes inside a container.
	 */
	public ElkLayout padding(double horizontal, double vertical) {
		horizontalPadding = horizontal;
		verticalPadding = vertical;
		return this;
	}

	public ElkLayout minimumNodeSize(double width, double height) {
		minimumNodeWidth = width;
		minimumNodeHeight = height;
		return this;
	}

	/**
	 * Width and height of ports in the ELK graph. Zero, the default, makes a connection start and end
	 * exactly at the port's location.
	 */
	public ElkLayout portSize(double portSize) {
		this.portSize = portSize;
		return this;
	}

	/**
	 * Whether a connection without labels gets a label for its name. True by default. The label is
	 * added to the connection's children, so that its position can be written back.
	 */
	public ElkLayout createNameLabels(boolean createNameLabels) {
		this.createNameLabels = createNameLabels;
		return this;
	}

	/**
	 * An option of the root of the ELK graph, which attributes of the root element override.
	 */
	public <T> ElkLayout option(IProperty<T> option, T value) {
		options.put(option, value);
		return this;
	}

	/**
	 * Builds the ELK graph of a diagram element without laying it out.
	 */
	public DiagramElkGraph build(DiagramElement root) {
		return new DiagramElkGraph(root, this);
	}

	// tag::layout[]
	/**
	 * Builds the ELK graph of a diagram element, lays it out, and writes the results back into the
	 * diagram, in a span of the current OpenTelemetry instance.
	 */
	public DiagramElkGraph layout(DiagramElement root) {
		DiagramElkGraph graph = build(root);
		Attributes attributes = Attributes.of(
				ROOT, String.valueOf(root.getId()),
				NODES, count(graph.getElkRoot()),
				EDGES, (long) graph.getElkRoot().getContainedEdges().size());
		Telemetry.inSpan(Telemetry.tracer(Telemetry.current()), "ELK Layout", attributes, span -> {
			graph.layout(new BasicProgressMonitor());
			graph.apply();
			return null;
		});
		return graph;
	}
	// end::layout[]

	private static long count(ElkNode node) {
		long ret = node.getChildren().size();
		for (ElkNode child: node.getChildren()) {
			ret += count(child);
		}
		return ret;
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	void applyDefaults(ElkNode elkRoot) {
		for (Map.Entry<IProperty<?>, Object> option: options.entrySet()) {
			elkRoot.setProperty((IProperty) option.getKey(), option.getValue());
		}
	}

	public TextMeasurer getTextMeasurer() {
		return textMeasurer;
	}

	public double getHorizontalPadding() {
		return horizontalPadding;
	}

	public double getVerticalPadding() {
		return verticalPadding;
	}

	public double getMinimumNodeWidth() {
		return minimumNodeWidth;
	}

	public double getMinimumNodeHeight() {
		return minimumNodeHeight;
	}

	public double getPortSize() {
		return portSize;
	}

	public boolean isCreateNameLabels() {
		return createNameLabels;
	}

}
