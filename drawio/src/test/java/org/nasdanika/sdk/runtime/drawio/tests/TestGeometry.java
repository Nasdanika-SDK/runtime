package org.nasdanika.sdk.runtime.drawio.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.nasdanika.sdk.runtime.drawio.Connection;
import org.nasdanika.sdk.runtime.drawio.Document;
import org.nasdanika.sdk.runtime.drawio.Geometry;
import org.nasdanika.sdk.runtime.drawio.Layer;
import org.nasdanika.sdk.runtime.drawio.Node;
import org.nasdanika.sdk.runtime.drawio.Point;

/**
 * Geometry of elements created by the API: elements without geometry, and geometry that holds
 * nothing but a flag and points.
 */
public class TestGeometry {

	@Test
	public void testLabelAtEdgeCenter() throws Exception {
		Document document = Document.create(false, null);
		Layer<?> layer = document.createPage().getModel().getRoot().getLayers().getFirst();
		Node a = layer.createNode();
		Node b = layer.createNode();
		Connection connection = layer.createConnection(a, b);

		Node label = connection.createNode();
		Geometry geometry = label.getGeometry();
		assertEquals(0, geometry.getPoints().size()); // No geometry yet: no points, no exception

		geometry.setRelative(true);
		geometry.setX(0); // The center of the edge: removes x, and must keep the relative flag
		Point offset = geometry.getPoints().add();
		offset.setRole("offset");
		offset.setX(10);
		offset.setY(-5);

		assertTrue(geometry.isRelative());
		assertEquals(1, geometry.getPoints().size());
		assertEquals(10, geometry.getPoints().get(0).getX());
		assertEquals(-5, geometry.getPoints().get(0).getY());
		String saved = document.save(false);
		assertTrue(saved.contains("relative=\"1\""), saved);
		assertTrue(saved.contains("as=\"offset\""), saved);
	}

}
