package org.nasdanika.sdk.runtime.models.diagram.elk.tests;

import static org.assertj.core.api.Assertions.assertThat;

import java.net.URL;

import org.junit.jupiter.api.Test;
import org.nasdanika.sdk.runtime.drawio.Document;
import org.nasdanika.sdk.runtime.drawio.Geometry;
import org.nasdanika.sdk.runtime.drawio.ModelElement;
import org.nasdanika.sdk.runtime.models.diagram.Bounds;
import org.nasdanika.sdk.runtime.models.diagram.Connection;
import org.nasdanika.sdk.runtime.models.diagram.Diagram;
import org.nasdanika.sdk.runtime.models.diagram.DiagramPackage;
import org.nasdanika.sdk.runtime.models.diagram.Node;
import org.nasdanika.sdk.runtime.models.diagram.elk.ElkLayout;

/**
 * The book's figures are generated diagrams rendered into PNG images with the Draw.io document
 * embedded. These tests compare the embedded documents with a fresh layout, so that a change to the
 * generator or to the adapter fails the build until the figures are rendered again with
 * doc/zephyr/tools/drawio-figure.
 * <p>
 * Positions are not compared: ELK's layout of these diagrams differs slightly from one JVM run to
 * another, while it is the same within a run. The nodes, the sizes of classes, which come from
 * their names, and the connections are compared.
 */
public class FigureTests {

	@Test
	public void testPackageFigure() throws Exception {
		Diagram diagram = EcoreDiagrams.packageDiagram(DiagramPackage.eINSTANCE);
		new ElkLayout().layout(diagram);
		assertMatches(diagram, "diagram-package.png");
	}

	@Test
	public void testContextFigure() throws Exception {
		Diagram diagram = EcoreDiagrams.classContext(DiagramPackage.Literals.NODE);
		new ElkLayout().layout(diagram);
		assertMatches(diagram, "node-context.png");
	}

	// tag::figure[]
	static void assertMatches(Diagram diagram, String figure) throws Exception {
		URL png = FigureTests.class.getResource(figure);
		Document document = Document.loadFromPngMetadata(png).getFirst(); // <1>
		for (Node node: EcoreDiagrams.nodes(diagram)) {
			Geometry drawn = geometry(document, node.getId());
			if (EcoreDiagrams.CLASS.equals(node.getAttributes().get(EcoreDiagrams.KIND))) {
				Bounds bounds = node.getBounds(); // <2>
				assertThat(drawn.getWidth()).as(node.getId()).isEqualTo(bounds.getWidth());
				assertThat(drawn.getHeight()).as(node.getId()).isEqualTo(bounds.getHeight());
			}
		}
		for (Connection connection: EcoreDiagrams.connections(diagram)) {
			assertThat(document.getModelElementById(connection.getId())) // <3>
				.as(connection.getId() + " in " + figure)
				.isInstanceOf(org.nasdanika.sdk.runtime.drawio.Connection.class);
		}
	}
	// end::figure[]

	private static Geometry geometry(Document document, String id) {
		ModelElement<?> element = document.getModelElementById(id);
		assertThat(element).as(id).isInstanceOf(org.nasdanika.sdk.runtime.drawio.Node.class);
		return ((org.nasdanika.sdk.runtime.drawio.Node) element).getGeometry();
	}

}
