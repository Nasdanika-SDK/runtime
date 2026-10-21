package org.nasdanika.sdk.runtime.models.diagram.elk;

import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.elk.core.RecursiveGraphLayoutEngine;
import org.eclipse.elk.core.data.LayoutMetaDataService;
import org.eclipse.elk.core.data.LayoutOptionData;
import org.eclipse.elk.core.math.ElkPadding;
import org.eclipse.elk.core.math.KVector;
import org.eclipse.elk.core.options.CoreOptions;
import org.eclipse.elk.core.options.EdgeLabelPlacement;
import org.eclipse.elk.core.options.HierarchyHandling;
import org.eclipse.elk.core.options.PortConstraints;
import org.eclipse.elk.core.options.PortSide;
import org.eclipse.elk.core.options.SizeConstraint;
import org.eclipse.elk.core.util.BasicProgressMonitor;
import org.eclipse.elk.core.util.IElkProgressMonitor;
import org.eclipse.elk.graph.ElkBendPoint;
import org.eclipse.elk.graph.ElkConnectableShape;
import org.eclipse.elk.graph.ElkEdge;
import org.eclipse.elk.graph.ElkEdgeSection;
import org.eclipse.elk.graph.ElkGraphElement;
import org.eclipse.elk.graph.ElkLabel;
import org.eclipse.elk.graph.ElkNode;
import org.eclipse.elk.graph.ElkPort;
import org.eclipse.elk.graph.util.ElkGraphUtil;
import org.eclipse.emf.ecore.EObject;
import org.nasdanika.sdk.runtime.models.diagram.Bounds;
import org.nasdanika.sdk.runtime.models.diagram.Connectable;
import org.nasdanika.sdk.runtime.models.diagram.Connection;
import org.nasdanika.sdk.runtime.models.diagram.DiagramElement;
import org.nasdanika.sdk.runtime.models.diagram.DiagramFactory;
import org.nasdanika.sdk.runtime.models.diagram.Label;
import org.nasdanika.sdk.runtime.models.diagram.Node;
import org.nasdanika.sdk.runtime.models.diagram.Point;
import org.nasdanika.sdk.runtime.models.diagram.Port;

/**
 * An ELK graph built from a diagram element, with the correspondence between the two, so that
 * the results of a layout can be written back.
 * <p>
 * Mapping:
 * <ul>
 * <li>Nodes, labels standing alone included, become ELK nodes, nested as the diagram nests them.
 * Diagrams and layers are transparent: their nodes join the nearest enclosing node.</li>
 * <li>Ports become ELK ports at their relative location, on the side the location is on.</li>
 * <li>Connections become ELK edges between the ELK nodes and ports of their ends. Connections
 * with a missing end are not laid out.</li>
 * <li>The {@link Label} children of a connection become its ELK labels. A connection without
 * labels gets one for its name, placed at its center.</li>
 * <li>Properties whose keys start with {@code elk.} or {@code org.eclipse.elk.} are ELK layout
 * options of the element, such as {@code elk.direction=UP}.</li>
 * </ul>
 * After layout, {@link #apply()} writes back:
 * <ul>
 * <li>node bounds, relative to the nearest enclosing node, or to the diagram;</li>
 * <li>port locations, relative to the node's size;</li>
 * <li>connection waypoints: the whole route, from the point where it leaves the source to the
 * point where it reaches the target, in the coordinates of the nearest node enclosing the
 * connection, or of the diagram;</li>
 * <li>bounds of connection labels, in the same coordinates as the waypoints.</li>
 * </ul>
 */
public class DiagramElkGraph {

	/**
	 * Property keys with these prefixes are ELK layout options.
	 */
	public static final List<String> OPTION_PREFIXES = List.of("elk.", "org.eclipse.elk.");

	private final DiagramElement root;
	private final ElkNode elkRoot;
	private final ElkLayout configuration;
	private final Map<DiagramElement, ElkGraphElement> toElk = new LinkedHashMap<>();
	private final Map<ElkGraphElement, DiagramElement> toDiagram = new LinkedHashMap<>();
	private final List<Connection> connections = new ArrayList<>();
	private final List<Connection> skipped = new ArrayList<>();

	DiagramElkGraph(DiagramElement root, ElkLayout configuration) {
		this.root = root;
		this.configuration = configuration;
		elkRoot = ElkGraphUtil.createGraph();
		elkRoot.setIdentifier(root.getId());
		map(root, elkRoot);
		configuration.applyDefaults(elkRoot);
		if (root instanceof Node node) {
			Bounds bounds = node.getBounds();
			if (bounds != null) {
				elkRoot.setDimensions(bounds.getWidth(), bounds.getHeight());
			}
		}
		addChildren(root, elkRoot);
		boolean nested = elkRoot.getChildren().stream().anyMatch(child -> !child.getChildren().isEmpty());
		if (nested && !elkRoot.hasProperty(CoreOptions.HIERARCHY_HANDLING)) {
			elkRoot.setProperty(CoreOptions.HIERARCHY_HANDLING, HierarchyHandling.INCLUDE_CHILDREN);
		}
		for (Connection connection: connections) {
			addEdge(connection);
		}
		applyOptions(root, elkRoot);
	}

	/**
	 * The ELK graph: the root node, which stands for the diagram element the graph was built from.
	 */
	public ElkNode getElkRoot() {
		return elkRoot;
	}

	public DiagramElement getRoot() {
		return root;
	}

	/**
	 * @return The ELK node, port, edge or label made from the diagram element, or null
	 */
	public ElkGraphElement getElkElement(DiagramElement element) {
		return toElk.get(element);
	}

	/**
	 * @return The diagram element an ELK node, port, edge or label was made from, or null
	 */
	public DiagramElement getDiagramElement(ElkGraphElement element) {
		return toDiagram.get(element);
	}

	/**
	 * Connections that were not laid out because an end is missing or outside the graph.
	 */
	public List<Connection> getSkipped() {
		return Collections.unmodifiableList(skipped);
	}

	/**
	 * Lays the ELK graph out. Does not change the diagram; see {@link #apply()}.
	 */
	public void layout(IElkProgressMonitor progressMonitor) {
		new RecursiveGraphLayoutEngine().layout(elkRoot, progressMonitor);
	}

	public void layout() {
		layout(new BasicProgressMonitor());
	}

	// --- Building ---

	private void map(DiagramElement element, ElkGraphElement elkElement) {
		toElk.put(element, elkElement);
		toDiagram.put(elkElement, element);
	}

	private void addChildren(DiagramElement parent, ElkNode elkParent) {
		for (DiagramElement child: parent.getChildren()) {
			if (child instanceof Node node) {
				addNode(node, elkParent);
			} else if (child instanceof Connection connection) {
				connections.add(connection);
				addChildren(connection, elkParent); // Nodes on a connection, other than labels, are laid out as nodes
			} else {
				addChildren(child, elkParent); // Diagrams and layers are transparent
			}
		}
	}

	private void addNode(Node node, ElkNode elkParent) {
		if (node instanceof Label && node.eContainer() instanceof Connection) {
			return; // Connection labels are added with their connection
		}
		ElkNode elkNode = ElkGraphUtil.createNode(elkParent);
		elkNode.setIdentifier(node.getId());
		map(node, elkNode);

		String text = text(node);
		double[] textSize = configuration.getTextMeasurer().measure(text);
		Bounds bounds = node.getBounds();
		double width;
		double height;
		if (bounds != null && bounds.getWidth() > 0 && bounds.getHeight() > 0) {
			width = bounds.getWidth();
			height = bounds.getHeight();
		} else {
			width = Math.max(configuration.getMinimumNodeWidth(), textSize[0] + 2 * configuration.getHorizontalPadding());
			height = Math.max(configuration.getMinimumNodeHeight(), textSize[1] + 2 * configuration.getVerticalPadding());
		}
		elkNode.setDimensions(width, height);

		if (hasNodes(node)) {
			// A container: its name is drawn at the top, inside, so reserve room for it
			ElkPadding padding = new ElkPadding(
					textSize[1] + 2 * configuration.getVerticalPadding(),
					configuration.getHorizontalPadding(),
					configuration.getHorizontalPadding(),
					configuration.getHorizontalPadding());
			elkNode.setProperty(CoreOptions.PADDING, padding);
			elkNode.setProperty(CoreOptions.NODE_SIZE_CONSTRAINTS, EnumSet.of(SizeConstraint.MINIMUM_SIZE));
			elkNode.setProperty(CoreOptions.NODE_SIZE_MINIMUM, new KVector(width, height));
		}

		if (!node.getPorts().isEmpty()) {
			elkNode.setProperty(CoreOptions.PORT_CONSTRAINTS, PortConstraints.FIXED_POS);
			for (Port port: node.getPorts()) {
				addPort(port, elkNode);
			}
		}
		applyOptions(node, elkNode);
		addChildren(node, elkNode);
	}

	private static boolean hasNodes(DiagramElement element) {
		for (DiagramElement child: element.getChildren()) {
			if (child instanceof Node) {
				return true;
			}
			if (!(child instanceof Connection) && hasNodes(child)) {
				return true;
			}
		}
		return false;
	}

	private void addPort(Port port, ElkNode elkNode) {
		ElkPort elkPort = ElkGraphUtil.createPort(elkNode);
		elkPort.setIdentifier(port.getId());
		map(port, elkPort);
		double size = configuration.getPortSize();
		elkPort.setDimensions(size, size);
		Point location = port.getLocation();
		double x = location == null ? 0.5 : location.getX();
		double y = location == null ? 0.5 : location.getY();
		elkPort.setLocation(x * elkNode.getWidth() - size / 2, y * elkNode.getHeight() - size / 2);
		elkPort.setProperty(CoreOptions.PORT_SIDE, side(x, y));
		applyOptions(port, elkPort);
	}

	/**
	 * The side a relative location is on: top and bottom win over left and right at corners.
	 */
	static PortSide side(double x, double y) {
		if (y <= 0) {
			return PortSide.NORTH;
		}
		if (y >= 1) {
			return PortSide.SOUTH;
		}
		if (x <= 0) {
			return PortSide.WEST;
		}
		if (x >= 1) {
			return PortSide.EAST;
		}
		return PortSide.UNDEFINED;
	}

	private void addEdge(Connection connection) {
		ElkConnectableShape source = shape(connection.getSource());
		ElkConnectableShape target = shape(connection.getTarget());
		if (source == null || target == null) {
			skipped.add(connection);
			return;
		}
		ElkEdge elkEdge = ElkGraphUtil.createSimpleEdge(source, target);
		elkEdge.setIdentifier(connection.getId());
		map(connection, elkEdge);
		ElkGraphUtil.updateContainment(elkEdge);

		List<Label> labels = connection.getChildren()
			.stream()
			.filter(Label.class::isInstance)
			.map(Label.class::cast)
			.toList();
		if (labels.isEmpty() && configuration.isCreateNameLabels() && !isBlank(connection.getName())) {
			Label nameLabel = DiagramFactory.eINSTANCE.createLabel();
			nameLabel.setId(connection.getId() == null ? null : connection.getId() + "-label");
			nameLabel.setText(connection.getName());
			connection.getChildren().add(nameLabel);
			labels = List.of(nameLabel);
		}
		for (Label label: labels) {
			String text = text(label);
			ElkLabel elkLabel = ElkGraphUtil.createLabel(text, elkEdge);
			elkLabel.setIdentifier(label.getId());
			double[] size = configuration.getTextMeasurer().measure(text);
			elkLabel.setDimensions(size[0], size[1]);
			elkLabel.setProperty(CoreOptions.EDGE_LABELS_PLACEMENT, EdgeLabelPlacement.CENTER);
			map(label, elkLabel);
			applyOptions(label, elkLabel);
		}
		applyOptions(connection, elkEdge);
	}

	private ElkConnectableShape shape(Connectable connectable) {
		return connectable == null ? null : toElk.get(connectable) instanceof ElkConnectableShape shape ? shape : null;
	}

	private static String text(Node node) {
		if (node instanceof Label label && !isBlank(label.getText())) {
			return label.getText();
		}
		return node.getName();
	}

	private static boolean isBlank(String text) {
		return text == null || text.isBlank();
	}

	/**
	 * Applies the element's properties that are ELK options.
	 */
	static void applyOptions(DiagramElement element, ElkGraphElement elkElement) {
		for (Map.Entry<String, String> property: element.getProperties()) {
			String key = property.getKey();
			if (key != null && OPTION_PREFIXES.stream().anyMatch(key::startsWith)) {
				LayoutOptionData option = LayoutMetaDataService.getInstance().getOptionDataBySuffix(key);
				if (option == null) {
					throw new IllegalArgumentException("Unknown ELK option " + key + " on " + element.getId());
				}
				Object value = option.parseValue(property.getValue());
				if (value == null) {
					throw new IllegalArgumentException("Invalid value of ELK option " + key + " on " + element.getId() + ": " + property.getValue());
				}
				elkElement.setProperty(option, value);
			}
		}
	}

	// --- Writing back ---

	/**
	 * Writes the results of the layout into the diagram.
	 */
	public void apply() {
		for (Map.Entry<DiagramElement, ElkGraphElement> entry: toElk.entrySet()) {
			if (entry.getKey() instanceof Node node && entry.getValue() instanceof ElkNode elkNode) {
				if (elkNode == elkRoot) {
					size(node).setWidth(elkNode.getWidth());
					size(node).setHeight(elkNode.getHeight());
				} else if (!(node instanceof Label && node.eContainer() instanceof Connection)) {
					Bounds bounds = size(node);
					bounds.setX(elkNode.getX());
					bounds.setY(elkNode.getY());
					bounds.setWidth(elkNode.getWidth());
					bounds.setHeight(elkNode.getHeight());
				}
			}
		}
		for (Map.Entry<DiagramElement, ElkGraphElement> entry: toElk.entrySet()) {
			if (entry.getKey() instanceof Port port && entry.getValue() instanceof ElkPort elkPort) {
				ElkNode elkNode = elkPort.getParent();
				Point location = port.getLocation();
				if (location == null) {
					location = DiagramFactory.eINSTANCE.createPoint();
					port.setLocation(location);
				}
				location.setX(relative(elkPort.getX() + elkPort.getWidth() / 2, elkNode.getWidth()));
				location.setY(relative(elkPort.getY() + elkPort.getHeight() / 2, elkNode.getHeight()));
			} else if (entry.getKey() instanceof Connection connection && entry.getValue() instanceof ElkEdge elkEdge) {
				applyEdge(connection, elkEdge);
			}
		}
	}

	private static double relative(double position, double size) {
		return size == 0 ? 0 : position / size;
	}

	private static Bounds size(Node node) {
		Bounds bounds = node.getBounds();
		if (bounds == null) {
			bounds = DiagramFactory.eINSTANCE.createBounds();
			node.setBounds(bounds);
		}
		return bounds;
	}

	private void applyEdge(Connection connection, ElkEdge elkEdge) {
		// ELK coordinates of an edge, and of its labels, are relative to the edge's containing node
		KVector offset = absolute(elkEdge.getContainingNode()).sub(absolute(frame(connection)));
		connection.getWaypoints().clear();
		for (ElkEdgeSection section: elkEdge.getSections()) {
			add(connection, section.getStartX() + offset.x, section.getStartY() + offset.y);
			for (ElkBendPoint bendPoint: section.getBendPoints()) {
				add(connection, bendPoint.getX() + offset.x, bendPoint.getY() + offset.y);
			}
			add(connection, section.getEndX() + offset.x, section.getEndY() + offset.y);
		}
		for (ElkLabel elkLabel: elkEdge.getLabels()) {
			if (toDiagram.get(elkLabel) instanceof Label label) {
				Bounds bounds = size(label);
				bounds.setX(elkLabel.getX() + offset.x);
				bounds.setY(elkLabel.getY() + offset.y);
				bounds.setWidth(elkLabel.getWidth());
				bounds.setHeight(elkLabel.getHeight());
			}
		}
	}

	private static void add(Connection connection, double x, double y) {
		List<Point> waypoints = connection.getWaypoints();
		if (!waypoints.isEmpty()) {
			Point last = waypoints.get(waypoints.size() - 1);
			if (last.getX() == x && last.getY() == y) {
				return; // Sections join at the same point
			}
		}
		Point point = DiagramFactory.eINSTANCE.createPoint();
		point.setX(x);
		point.setY(y);
		waypoints.add(point);
	}

	/**
	 * The ELK node whose coordinates a connection's waypoints are in: the one made from the
	 * nearest node enclosing the connection, or the root.
	 */
	private ElkNode frame(Connection connection) {
		for (EObject container = connection.eContainer(); container != null; container = container.eContainer()) {
			if (container instanceof Node node && toElk.get(node) instanceof ElkNode elkNode) {
				return elkNode;
			}
			if (container == root) {
				break;
			}
		}
		return elkRoot;
	}

	/**
	 * Position of an ELK node relative to the root.
	 */
	private KVector absolute(ElkNode elkNode) {
		KVector ret = new KVector();
		for (ElkNode node = elkNode; node != null && node != elkRoot; node = node.getParent()) {
			ret.add(node.getX(), node.getY());
		}
		return ret;
	}

}
