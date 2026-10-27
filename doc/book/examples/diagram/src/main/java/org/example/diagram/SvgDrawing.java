package org.example.diagram;

import java.util.Locale;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.EObject;
import org.nasdanika.sdk.runtime.models.diagram.Bounds;
import org.nasdanika.sdk.runtime.models.diagram.Connection;
import org.nasdanika.sdk.runtime.models.diagram.DiagramElement;
import org.nasdanika.sdk.runtime.models.diagram.Label;
import org.nasdanika.sdk.runtime.models.diagram.Node;
import org.nasdanika.sdk.runtime.models.svg.Defs;
import org.nasdanika.sdk.runtime.models.svg.G;
import org.nasdanika.sdk.runtime.models.svg.Marker;
import org.nasdanika.sdk.runtime.models.svg.Path;
import org.nasdanika.sdk.runtime.models.svg.Polyline;
import org.nasdanika.sdk.runtime.models.svg.Rect;
import org.nasdanika.sdk.runtime.models.svg.Svg;
import org.nasdanika.sdk.runtime.models.svg.SvgFactory;
import org.nasdanika.sdk.runtime.models.svg.Text;

/**
 * Draws a laid-out diagram whose nodes are not nested as SVG: a rounded rectangle with a name and
 * a tooltip per node, and a polyline with an arrowhead per connection. Nodes must have bounds.
 */
public final class SvgDrawing {

	static final double MARGIN = 10;

	private SvgDrawing() {
	}

	// tag::draw[]
	public static Svg draw(DiagramElement diagram) {
		SvgFactory factory = SvgFactory.eINSTANCE;
		Svg svg = factory.createSvg();
		svg.setFontFamily("Noto Sans, Helvetica, Arial, sans-serif");
		svg.setFontSize("12");
		svg.add(arrowhead());
		double width = 0;
		double height = 0;
		for (EObject element : (Iterable<EObject>) diagram::eAllContents) {
			if (element instanceof Node node && !(node instanceof Label)) {          // <1>
				Bounds b = node.getBounds();
				width = Math.max(width, b.getX() + b.getWidth());
				height = Math.max(height, b.getY() + b.getHeight());
				G g = svg.add(factory.createG());
				if (node.getDocumentation() != null) {
					g.add(factory.createTitle()).setValue(node.getDocumentation());     // <2>
				}
				Rect rect = g.add(factory.createRect());
				rect.setX(round(MARGIN + b.getX()));
				rect.setY(round(MARGIN + b.getY()));
				rect.setWidth(round(b.getWidth()));
				rect.setHeight(round(b.getHeight()));
				rect.setRx(6);
				rect.setFill("#dae8fc");
				rect.setStroke("#6c8ebf");
				Text text = g.add(factory.createText());
				text.setX(number(MARGIN + b.getX() + b.getWidth() / 2));
				text.setY(number(MARGIN + b.getY() + b.getHeight() / 2 + 4));
				text.setTextAnchor("middle");
				text.addText(node.getName());
			} else if (element instanceof Connection connection) {                   // <3>
				Polyline line = svg.add(factory.createPolyline());
				line.setPoints(connection.getWaypoints()
					.stream()
					.map(p -> number(MARGIN + p.getX()) + "," + number(MARGIN + p.getY()))
					.collect(Collectors.joining(" ")));
				line.setFill("none");
				line.setStroke("#333333");
				line.setMarkerEnd("url(#arrow)");
			}
		}
		svg.setWidth(number(width + 2 * MARGIN));
		svg.setHeight(number(height + 2 * MARGIN));
		svg.setViewBox("0 0 " + svg.getWidth() + " " + svg.getHeight());
		return svg;
	}
	// end::draw[]

	/**
	 * An open arrowhead, drawn at the end of a polyline that refers to it.
	 */
	private static Defs arrowhead() {
		SvgFactory factory = SvgFactory.eINSTANCE;
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
		return defs;
	}

	private static double round(double value) {
		return Math.round(value * 10) / 10.0;
	}

	private static String number(double value) {
		return value == Math.rint(value)
				? Long.toString((long) value)
				: String.format(Locale.ROOT, "%.1f", value);
	}

}
