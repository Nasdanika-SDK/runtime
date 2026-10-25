package org.nasdanika.sdk.runtime.models.svg.tests;

import java.util.Locale;
import java.util.Map;

import org.nasdanika.sdk.runtime.models.diagram.Bounds;
import org.nasdanika.sdk.runtime.models.diagram.Connection;
import org.nasdanika.sdk.runtime.models.diagram.Diagram;
import org.nasdanika.sdk.runtime.models.diagram.DiagramElement;
import org.nasdanika.sdk.runtime.models.diagram.Label;
import org.nasdanika.sdk.runtime.models.diagram.Node;
import org.nasdanika.sdk.runtime.models.diagram.Point;
import org.nasdanika.sdk.runtime.models.svg.A;
import org.nasdanika.sdk.runtime.models.svg.Container;
import org.nasdanika.sdk.runtime.models.svg.Defs;
import org.nasdanika.sdk.runtime.models.svg.G;
import org.nasdanika.sdk.runtime.models.svg.Marker;
import org.nasdanika.sdk.runtime.models.svg.Path;
import org.nasdanika.sdk.runtime.models.svg.Polyline;
import org.nasdanika.sdk.runtime.models.svg.Rect;
import org.nasdanika.sdk.runtime.models.svg.Svg;
import org.nasdanika.sdk.runtime.models.svg.SvgFactory;
import org.nasdanika.sdk.runtime.models.svg.Text;
import org.nasdanika.sdk.runtime.models.svg.Title;

/**
 * Draws a diagram that ELK has laid out as SVG: a rounded rectangle and a name per node, a
 * polyline with an arrowhead per connection, and the connection's name where ELK placed its label.
 * A node's documentation is its tooltip, and its {@code link} attribute makes it a hyperlink.
 * Fill and stroke come from a palette keyed by the node's {@code type} attribute.
 */
// tag::converter[]
public class DiagramToSvg {

	static final String FONT = "Noto Sans, Helvetica, Arial, sans-serif";
	static final double FONT_SIZE = 12;
	static final double MARGIN = 10;

	/** Fill and stroke by the type attribute of a node */
	static final Map<String, String[]> PALETTE = Map.of(
		"person", new String[] { "#08427b", "#052e56", "#ffffff" },
		"software-system", new String[] { "#1168bd", "#0b4884", "#ffffff" },
		"external", new String[] { "#999999", "#6b6b6b", "#ffffff" });

	static final String[] DEFAULT = { "#f5f5f5", "#666666", "#333333" };

	private final SvgFactory factory = SvgFactory.eINSTANCE;

	public Svg convert(Diagram diagram) {
		Svg svg = factory.createSvg();
		double[] extent = { 0, 0 };
		measure(diagram, 0, 0, extent);
		double width = extent[0] + 2 * MARGIN;
		double height = extent[1] + 2 * MARGIN;
		svg.setWidth(number(width)); // <1>
		svg.setHeight(number(height));
		svg.setViewBox("0 0 " + number(width) + " " + number(height));
		svg.setFontFamily(FONT);
		svg.setFontSize(number(FONT_SIZE));
		svg.add(arrowhead());

		G content = svg.add(factory.createG()); // <2>
		content.setTransform("translate(" + number(MARGIN) + "," + number(MARGIN) + ")");
		draw(diagram, content, 0, 0);
		return svg;
	}

	/**
	 * An open arrowhead, drawn at the end of a polyline that refers to it.
	 */
	private Defs arrowhead() {
		Defs defs = factory.createDefs();
		Marker marker = defs.add(factory.createMarker());
		marker.setId("arrow");
		marker.setViewBox("0 0 10 10");
		marker.setRefX("10");
		marker.setRefY("5");
		marker.setMarkerWidth("8");
		marker.setMarkerHeight("8");
		marker.setOrient("auto");
		Path path = marker.add(factory.createPath());
		path.setD("M 0 0 L 10 5 L 0 10");
		path.setFill("none");
		path.setStroke("#333333");
		path.setStrokeWidth("1.5");
		return defs;
	}

	/**
	 * Draws the children of an element. Bounds of nodes are relative to the nearest enclosing
	 * node, and routes of connections are in the coordinates of the nearest enclosing node.
	 */
	private void draw(DiagramElement element, Container parent, double x, double y) {
		for (DiagramElement child : element.getChildren()) {
			if (child instanceof Node node && !(child instanceof Label) && node.getBounds() != null) {
				Bounds b = node.getBounds();
				node(node, parent, x + b.getX(), y + b.getY());
				draw(node, parent, x + b.getX(), y + b.getY());
			} else if (child instanceof Connection connection) {
				connection(connection, parent, x, y);
			} else if (!(child instanceof Node)) {
				draw(child, parent, x, y); // Pages and layers are transparent
			}
		}
	}
	// end::converter[]

	// tag::node[]
	private void node(Node node, Container parent, double x, double y) {
		Container target = parent;
		String link = node.getAttributes().get("link");
		if (link != null) {
			A a = parent.add(factory.createA()); // <1>
			a.setHref(link);
			target = a;
		}
		G g = target.add(factory.createG());
		g.setId(node.getId());
		if (node.getDocumentation() != null) {
			Title title = g.add(factory.createTitle()); // <2>
			title.setValue(node.getDocumentation());
		}
		String[] colors = PALETTE.getOrDefault(node.getAttributes().get("type"), DEFAULT);
		Rect rect = g.add(factory.createRect());
		rect.setX(round(x));
		rect.setY(round(y));
		rect.setWidth(round(node.getBounds().getWidth()));
		rect.setHeight(round(node.getBounds().getHeight()));
		rect.setRx(6);
		rect.setFill(colors[0]);
		rect.setStroke(colors[1]);
		if (node.getName() != null) {
			Text text = g.add(factory.createText()); // <3>
			text.setX(number(x + node.getBounds().getWidth() / 2));
			text.setY(number(y + node.getBounds().getHeight() / 2 + FONT_SIZE * 0.35));
			text.setTextAnchor("middle");
			text.setFill(colors[2]);
			text.addText(node.getName());
		}
	}
	// end::node[]

	// tag::connection[]
	private void connection(Connection connection, Container parent, double x, double y) {
		if (connection.getWaypoints().size() < 2) {
			return;
		}
		StringBuilder points = new StringBuilder();
		for (Point point : connection.getWaypoints()) {
			points.append(number(x + point.getX())).append(',').append(number(y + point.getY())).append(' ');
		}
		Polyline polyline = parent.add(factory.createPolyline());
		polyline.setId(connection.getId());
		polyline.setPoints(points.toString().trim());
		polyline.setFill("none");
		polyline.setStroke("#333333");
		polyline.setMarkerEnd("url(#arrow)"); // <1>
		if (connection.getAttributes().containsKey("async")) {
			polyline.setStrokeDasharray("6 4");
		}
		for (DiagramElement child : connection.getChildren()) {
			if (child instanceof Label label && label.getBounds() != null) {
				Bounds b = label.getBounds(); // <2>
				Text text = parent.add(factory.createText());
				text.setX(number(x + b.getX() + b.getWidth() / 2));
				text.setY(number(y + b.getY() + b.getHeight() / 2 + FONT_SIZE * 0.35));
				text.setTextAnchor("middle");
				text.setFill("#333333");
				text.addText(label.getText() == null ? connection.getName() : label.getText());
			}
		}
	}
	// end::connection[]

	/**
	 * The largest x and y of nodes, routes and labels, in the coordinates of the diagram.
	 */
	private static void measure(DiagramElement element, double x, double y, double[] extent) {
		for (DiagramElement child : element.getChildren()) {
			if (child instanceof Node node && node.getBounds() != null) {
				Bounds b = node.getBounds();
				boolean onConnection = element instanceof Connection;
				double left = onConnection ? x + b.getX() : x + b.getX();
				extent[0] = Math.max(extent[0], left + b.getWidth());
				extent[1] = Math.max(extent[1], y + b.getY() + b.getHeight());
				if (!onConnection) {
					measure(node, x + b.getX(), y + b.getY(), extent);
				}
			} else if (child instanceof Connection connection) {
				for (Point point : connection.getWaypoints()) {
					extent[0] = Math.max(extent[0], x + point.getX());
					extent[1] = Math.max(extent[1], y + point.getY());
				}
				measure(connection, x, y, extent); // Its labels
			} else {
				measure(child, x, y, extent);
			}
		}
	}

	private static double round(double value) {
		return Math.round(value * 10) / 10.0;
	}

	private static String number(double value) {
		return value == Math.rint(value) ? Long.toString((long) value) : String.format(Locale.ROOT, "%.1f", value);
	}

}
