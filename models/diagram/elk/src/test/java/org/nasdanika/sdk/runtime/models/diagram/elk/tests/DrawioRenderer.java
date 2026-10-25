package org.nasdanika.sdk.runtime.models.diagram.elk.tests;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.nasdanika.sdk.runtime.drawio.ConnectionPoint;
import org.nasdanika.sdk.runtime.drawio.Document;
import org.nasdanika.sdk.runtime.drawio.Geometry;
import org.nasdanika.sdk.runtime.drawio.Layer;
import org.nasdanika.sdk.runtime.drawio.Page;
import org.nasdanika.sdk.runtime.drawio.util.Util;
import org.nasdanika.sdk.runtime.models.diagram.Bounds;
import org.nasdanika.sdk.runtime.models.diagram.Connectable;
import org.nasdanika.sdk.runtime.models.diagram.Connection;
import org.nasdanika.sdk.runtime.models.diagram.Diagram;
import org.nasdanika.sdk.runtime.models.diagram.DiagramElement;
import org.nasdanika.sdk.runtime.models.diagram.Label;
import org.nasdanika.sdk.runtime.models.diagram.Node;
import org.nasdanika.sdk.runtime.models.diagram.Port;

/**
 * Renders a laid out diagram as a Draw.io document with the runtime's Draw.io API: nodes with
 * the bounds ELK computed, ports as connection points, routes as waypoints, and labels as edge
 * labels anchored at the end they name.
 */
final class DrawioRenderer {

	static final String CLASS_STYLE = "rounded=1;arcSize=8;whiteSpace=wrap;html=1;"
			+ "fillColor=#EBEFFC;strokeColor=#3459E6;fontSize=12;";
	static final String PACKAGE_STYLE = "rounded=1;arcSize=2;whiteSpace=wrap;html=1;container=1;collapsible=0;"
			+ "verticalAlign=top;align=left;spacingLeft=10;fontStyle=1;fontSize=12;"
			+ "fillColor=#F8F9FA;strokeColor=#6C757D;dashed=1;";
	static final String EDGE_STYLE = "edgeStyle=none;rounded=0;html=1;endSize=10;startSize=10;strokeColor=#495057;";
	static final String LABEL_STYLE = "edgeLabel;html=1;align=center;verticalAlign=middle;resizable=0;points=[];"
			+ "fontSize=12;labelBackgroundColor=none;";

	private final Map<Node, org.nasdanika.sdk.runtime.drawio.Node> nodes = new LinkedHashMap<>();
	private final Map<Port, ConnectionPoint> ports = new LinkedHashMap<>();

	private DrawioRenderer() {
	}

	static Document render(Diagram diagram) throws Exception {
		return new DrawioRenderer().document(diagram);
	}

	private Document document(Diagram diagram) throws Exception {
		Document document = Document.create(false, null);
		Page page = document.createPage();
		page.setName(diagram.getName());
		Layer<?> layer = page.getModel().getRoot().getLayers().getFirst();
		for (DiagramElement child: diagram.getChildren()) {
			if (child instanceof Node node) {
				addNode(node, layer);
			}
		}
		diagram.eAllContents().forEachRemaining(e -> {
			if (e instanceof Connection connection) {
				addConnection(connection, layer);
			}
		});
		return document;
	}

	// tag::node[]
	private void addNode(Node node, Layer<?> parent) {
		org.nasdanika.sdk.runtime.drawio.Node drawioNode = parent.createNode(); // <1>
		drawioNode.setId(node.getId());
		drawioNode.setLabel(node.getName());
		Bounds bounds = node.getBounds();
		drawioNode.getGeometry().setBounds(
				bounds.getX(),
				bounds.getY(),
				bounds.getWidth(),
				bounds.getHeight());
		boolean container = node.getChildren().stream().anyMatch(Node.class::isInstance);
		boolean isAbstract = "true".equals(node.getAttributes().get(EcoreDiagrams.ABSTRACT));
		String fontStyle = "fontStyle=" + (isAbstract ? 3 : 1) + ";"; // 1 bold, 3 bold italic
		String style = container ? PACKAGE_STYLE : CLASS_STYLE + fontStyle;
		drawioNode.getStyle().putAll(Util.loadStyle(style));
		nodes.put(node, drawioNode);
		for (Port port: node.getPorts()) {
			ports.put(port, drawioNode.createConnectionPoint( // <2>
					port.getLocation().getX(),
					port.getLocation().getY()));
		}
		for (DiagramElement child: node.getChildren()) {
			if (child instanceof Node childNode) {
				addNode(childNode, drawioNode);
			}
		}
	}
	// end::node[]

	// tag::connection[]
	private void addConnection(Connection connection, Layer<?> layer) {
		List<double[]> route = Coordinates.route(connection);
		org.nasdanika.sdk.runtime.drawio.Connection drawioConnection = layer.createConnection(
				end(connection.getSource(), route.getFirst()), // <1>
				end(connection.getTarget(), route.getLast()));
		drawioConnection.setId(connection.getId());
		for (double[] point: route.subList(1, route.size() - 1)) {
			drawioConnection.getPoints().add(point[0], point[1]); // <2>
		}
		drawioConnection.getStyle().putAll(Util.loadStyle(EDGE_STYLE + decorations(connection)));

		for (DiagramElement child: connection.getChildren()) {
			if (child instanceof Label label && label.getBounds() != null) {
				addLabel(label, route, Coordinates.frame(connection), drawioConnection);
			}
		}
	}

	private void addLabel(Label label, List<double[]> route, double[] frame,
			org.nasdanika.sdk.runtime.drawio.Connection drawioConnection) {
		String placement = label.getAttributes().get(EcoreDiagrams.PLACEMENT);
		double position;
		double[] anchor;
		if ("TAIL".equals(placement)) {
			position = -1; // <3>
			anchor = route.getFirst();
		} else if ("HEAD".equals(placement)) {
			position = 1;
			anchor = route.getLast();
		} else {
			position = 0;
			anchor = Coordinates.middle(route);
		}
		Bounds b = label.getBounds();
		double centerX = frame[0] + b.getX() + b.getWidth() / 2;
		double centerY = frame[1] + b.getY() + b.getHeight() / 2;
		org.nasdanika.sdk.runtime.drawio.Node drawioLabel = drawioConnection.createNode();
		drawioLabel.setLabel(label.getText());
		drawioLabel.getStyle().putAll(Util.loadStyle(LABEL_STYLE));
		Geometry geometry = drawioLabel.getGeometry();
		geometry.setRelative(true);
		geometry.setX(position);
		org.nasdanika.sdk.runtime.drawio.Point offset = geometry.getPoints().add();
		offset.setRole("offset"); // <4>
		offset.setX(centerX - anchor[0]);
		offset.setY(centerY - anchor[1]);
	}
	// end::connection[]

	/**
	 * A port's connection point, or a connection point on the node where the route touches it.
	 */
	private org.nasdanika.sdk.runtime.drawio.Connectable end(Connectable connectable, double[] point) {
		if (connectable instanceof Port port) {
			return ports.get(port);
		}
		Node node = (Node) connectable;
		double[] origin = Coordinates.origin(node);
		Bounds bounds = node.getBounds();
		double x = clamp((point[0] - origin[0]) / bounds.getWidth());
		double y = clamp((point[1] - origin[1]) / bounds.getHeight());
		return nodes.get(node).createConnectionPoint(x, y);
	}

	private static double clamp(double value) {
		return Math.max(0, Math.min(1, value));
	}

	private static String decorations(Connection connection) {
		Map<String, String> attributes = connection.getAttributes().map();
		boolean bidirectional = connection.getChildren().size() > 1;
		StringBuilder ret = new StringBuilder();
		if ("true".equals(attributes.get(EcoreDiagrams.CONTAINMENT))) {
			ret.append("startArrow=diamondThin;startFill=1;");
		} else {
			ret.append("startArrow=none;");
		}
		if (EcoreDiagrams.GENERALIZATION.equals(attributes.get(EcoreDiagrams.KIND))) {
			ret.append("endArrow=block;endFill=0;");
		} else if ("true".equals(attributes.get(EcoreDiagrams.CONTAINER))) {
			ret.append("endArrow=diamondThin;endFill=1;");
		} else if (bidirectional) {
			ret.append("endArrow=none;");
		} else {
			ret.append("endArrow=open;endFill=0;");
		}
		return ret.toString();
	}

}
