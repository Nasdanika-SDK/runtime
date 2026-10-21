package org.nasdanika.sdk.runtime.models.diagram.elk.tests;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.nasdanika.sdk.runtime.models.diagram.Bounds;
import org.nasdanika.sdk.runtime.models.diagram.Connection;
import org.nasdanika.sdk.runtime.models.diagram.Node;
import org.nasdanika.sdk.runtime.models.diagram.Point;
import org.nasdanika.sdk.runtime.models.diagram.Port;

/**
 * Absolute coordinates of laid out diagram elements. Node bounds are relative to the nearest
 * enclosing node; waypoints and connection labels to the nearest node enclosing the connection.
 */
final class Coordinates {

	private Coordinates() {
	}

	/**
	 * Absolute position of a node's top left corner.
	 */
	static double[] origin(Node node) {
		double x = 0;
		double y = 0;
		for (EObject e = node; e != null; e = e.eContainer()) {
			if (e instanceof Node n && n.getBounds() != null) {
				x += n.getBounds().getX();
				y += n.getBounds().getY();
			}
		}
		return new double[] { x, y };
	}

	/**
	 * Absolute position of the coordinate system of a connection's waypoints and labels.
	 */
	static double[] frame(Connection connection) {
		for (EObject e = connection.eContainer(); e != null; e = e.eContainer()) {
			if (e instanceof Node node) {
				return origin(node);
			}
		}
		return new double[] { 0, 0 };
	}

	/**
	 * Absolute position of a port.
	 */
	static double[] port(Port port) {
		Node node = (Node) port.eContainer();
		double[] origin = origin(node);
		Bounds bounds = node.getBounds();
		return new double[] {
			origin[0] + port.getLocation().getX() * bounds.getWidth(),
			origin[1] + port.getLocation().getY() * bounds.getHeight() };
	}

	/**
	 * Absolute waypoints of a connection.
	 */
	static List<double[]> route(Connection connection) {
		double[] frame = frame(connection);
		return connection.getWaypoints()
			.stream()
			.map(p -> new double[] { frame[0] + p.getX(), frame[1] + p.getY() })
			.toList();
	}

	/**
	 * The point half way along a route, by length.
	 */
	static double[] middle(List<double[]> route) {
		double length = 0;
		for (int i = 1; i < route.size(); ++i) {
			length += distance(route.get(i - 1), route.get(i));
		}
		double remaining = length / 2;
		for (int i = 1; i < route.size(); ++i) {
			double segment = distance(route.get(i - 1), route.get(i));
			if (segment >= remaining && segment > 0) {
				double[] a = route.get(i - 1);
				double[] b = route.get(i);
				double t = remaining / segment;
				return new double[] { a[0] + t * (b[0] - a[0]), a[1] + t * (b[1] - a[1]) };
			}
			remaining -= segment;
		}
		return route.getFirst();
	}

	static double distance(double[] a, double[] b) {
		return Math.hypot(b[0] - a[0], b[1] - a[1]);
	}

	static double[] point(Point point) {
		return new double[] { point.getX(), point.getY() };
	}

}
