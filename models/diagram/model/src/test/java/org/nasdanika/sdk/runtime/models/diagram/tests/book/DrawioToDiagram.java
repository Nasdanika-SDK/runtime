package org.nasdanika.sdk.runtime.models.diagram.tests.book;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.jsoup.Jsoup;
import org.nasdanika.sdk.runtime.drawio.Document;
import org.nasdanika.sdk.runtime.drawio.Geometry;
import org.nasdanika.sdk.runtime.drawio.LayerElement;
import org.nasdanika.sdk.runtime.drawio.ModelElement;
import org.nasdanika.sdk.runtime.drawio.Page;
import org.nasdanika.sdk.runtime.drawio.util.Util;
import org.nasdanika.sdk.runtime.models.diagram.Bounds;
import org.nasdanika.sdk.runtime.models.diagram.Connectable;
import org.nasdanika.sdk.runtime.models.diagram.Connection;
import org.nasdanika.sdk.runtime.models.diagram.Diagram;
import org.nasdanika.sdk.runtime.models.diagram.DiagramElement;
import org.nasdanika.sdk.runtime.models.diagram.DiagramFactory;
import org.nasdanika.sdk.runtime.models.diagram.Layer;
import org.nasdanika.sdk.runtime.models.diagram.Node;
import org.nasdanika.sdk.runtime.models.diagram.Point;

/**
 * A minimal converter from a Draw.io document, read with the runtime's Draw.io API, to the diagram
 * model: pages, layers, nodes with their bounds and children, connections with their waypoints,
 * labels as names, tooltips as documentation, and properties.
 */
// tag::converter[]
public class DrawioToDiagram {

	private final DiagramFactory factory = DiagramFactory.eINSTANCE;

	/** Draw.io elements to the diagram elements made from them, to connect connections */
	private final Map<ModelElement<?>, DiagramElement> converted = new LinkedHashMap<>();

	public Diagram convert(Document document) {
		Diagram diagram = factory.createDiagram();
		for (Page page: document.getPages()) {
			Diagram pageDiagram = factory.createDiagram(); // <1>
			pageDiagram.setId(page.getId());
			pageDiagram.setName(page.getName());
			diagram.getChildren().add(pageDiagram);
			for (org.nasdanika.sdk.runtime.drawio.Layer<?> drawioLayer:
					page.getModel().getRoot().getLayers()) {
				Layer layer = factory.createLayer();
				copy(drawioLayer, layer);
				layer.setVisible(drawioLayer.isVisible());
				pageDiagram.getChildren().add(layer);
				convert(drawioLayer.getElements(), layer);
			}
		}

		converted.forEach((source, target) -> { // <2>
			if (source instanceof org.nasdanika.sdk.runtime.drawio.Connection drawioConnection
					&& target instanceof Connection connection) {
				connection.setSource(end(drawioConnection.getSource()));
				connection.setTarget(end(drawioConnection.getTarget())); // <3>
			}
		});
		return diagram;
	}

	private void convert(List<LayerElement<?>> elements, DiagramElement parent) {
		for (LayerElement<?> element: elements) {
			if (element instanceof org.nasdanika.sdk.runtime.drawio.Node drawioNode) {
				Node node = factory.createNode();
				copy(drawioNode, node);
				Geometry geometry = drawioNode.getGeometry();
				Bounds bounds = factory.createBounds();
				bounds.setX(geometry.getX());
				bounds.setY(geometry.getY());
				bounds.setWidth(geometry.getWidth());
				bounds.setHeight(geometry.getHeight());
				node.setBounds(bounds);
				parent.getChildren().add(node);
				convert(drawioNode.getElements(), node); // <4>
			} else if (element
					instanceof org.nasdanika.sdk.runtime.drawio.Connection drawioConn) {
				Connection connection = factory.createConnection();
				copy(drawioConn, connection);
				for (var drawioPoint: drawioConn.getPoints()) {
					Point point = factory.createPoint();
					point.setX(drawioPoint.getX());
					point.setY(drawioPoint.getY());
					connection.getWaypoints().add(point);
				}
				parent.getChildren().add(connection);
			}
		}
	}

	private void copy(ModelElement<?> source, DiagramElement target) {
		target.setId(source.getId());
		String label = source.getLabel();
		if (label != null && !label.isBlank()) {
			target.setName(Jsoup.parse(label).text()); // <5>
		}
		String tooltip = source.getTooltip();
		if (tooltip != null && !tooltip.isBlank()) {
			target.setDocumentation(tooltip);
		}
		for (String name: source.getPropertyNames()) {
			if (!"id".equals(name)) {
				target.getProperties().put(name, source.getProperty(name));
			}
		}
		converted.put(source, target);
	}

	private Connectable end(org.nasdanika.sdk.runtime.drawio.Connectable end) {
		return end == null ? null : (Connectable) converted.get(Util.getConnectableNode(end));
	}

}
// end::converter[]
