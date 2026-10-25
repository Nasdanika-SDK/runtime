package org.nasdanika.sdk.runtime.models.diagram.elk.tests;

import static org.assertj.core.api.Assertions.assertThat;
import static org.nasdanika.sdk.runtime.models.diagram.DiagramPackage.Literals.CONNECTABLE__INCOMING_CONNECTIONS;
import static org.nasdanika.sdk.runtime.models.diagram.DiagramPackage.Literals.CONNECTION__TARGET;
import static org.nasdanika.sdk.runtime.models.diagram.elk.tests.EcoreDiagrams.CLASS;
import static org.nasdanika.sdk.runtime.models.diagram.elk.tests.EcoreDiagrams.GENERALIZATION;
import static org.nasdanika.sdk.runtime.models.diagram.elk.tests.EcoreDiagrams.KIND;
import static org.nasdanika.sdk.runtime.models.diagram.elk.tests.EcoreDiagrams.REFERENCE;

import java.io.File;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.nasdanika.sdk.runtime.drawio.Document;
import org.nasdanika.sdk.runtime.models.diagram.Bounds;
import org.nasdanika.sdk.runtime.models.diagram.Connection;
import org.nasdanika.sdk.runtime.models.diagram.Diagram;
import org.nasdanika.sdk.runtime.models.diagram.DiagramPackage;
import org.nasdanika.sdk.runtime.models.diagram.Label;
import org.nasdanika.sdk.runtime.models.diagram.Node;
import org.nasdanika.sdk.runtime.models.diagram.Port;
import org.nasdanika.sdk.runtime.models.diagram.elk.ElkLayout;

import com.sun.net.httpserver.HttpServer;

/**
 * Chapters "Diagrams of Ecore models" and "Rendering": the diagram model's own package and the
 * context of its class Node, generated, laid out, checked, rendered and served.
 */
public class EcoreDiagramTests {

	static Diagram packageDiagram;
	static Diagram nodeContext;

	@BeforeAll
	static void generate() throws Exception {
		// tag::generate[]
		packageDiagram = EcoreDiagrams.packageDiagram(DiagramPackage.eINSTANCE);
		new ElkLayout().layout(packageDiagram);

		nodeContext = EcoreDiagrams.classContext(DiagramPackage.Literals.NODE);
		new ElkLayout().layout(nodeContext);

		DiagramSite.write(packageDiagram, "diagram-package"); // <1>
		DiagramSite.write(nodeContext, "node-context");
		DiagramSite.index(List.of(
				new DiagramSite.Entry("diagram-package", "Diagram package",
						"the classes of the diagram model and what they extend and refer to"),
				new DiagramSite.Entry("node-context", "Node context",
						"the class Node, its supertypes, subtypes, references and referrers")));
		// end::generate[]
	}

	@Test
	public void testPackageDiagram() {
		// tag::package[]
		List<Node> packages = packageDiagram.getChildren().stream()
			.filter(Node.class::isInstance)
			.map(Node.class::cast)
			.toList();
		assertThat(packages).extracting(Node::getName).containsExactly("diagram", "core", "ecore");
		Node diagram = packages.getFirst();
		assertThat(diagram.getChildren()).filteredOn(Node.class::isInstance).hasSize(10); // <1>
		assertThat(packages.get(1).getChildren()).extracting(e -> e.getName())
			.containsExactlyInAnyOrder("NamedElement", "StringIdentity", "Attributed");
		// end::package[]
		assertNoOverlaps(packageDiagram);
	}

	@Test
	public void testGeneralizations() {
		// tag::generalizations[]
		for (Diagram diagram: List.of(packageDiagram, nodeContext)) {
			for (Connection connection: EcoreDiagrams.connections(diagram)) {
				if (GENERALIZATION.equals(connection.getAttributes().get(KIND))) {
					Port top = (Port) connection.getSource();
					Port bottom = (Port) connection.getTarget();
					assertThat(top.getLocation().getY()).isZero(); // <1>
					assertThat(bottom.getLocation().getY()).isEqualTo(1);
					List<double[]> route = Coordinates.route(connection);
					assertThat(route.getFirst()).containsExactly(Coordinates.port(top)); // <2>
					assertThat(route.getLast()).containsExactly(Coordinates.port(bottom));
					assertRectilinear(route); // <3>
					assertThat(route.getLast()[1]).isLessThan(route.getFirst()[1]); // <4>
				}
			}
		}
		// end::generalizations[]
	}

	@Test
	public void testReferences() {
		// tag::references[]
		List<Connection> references = new ArrayList<>();
		for (Connection connection: EcoreDiagrams.connections(packageDiagram)) {
			if (REFERENCE.equals(connection.getAttributes().get(KIND))) {
				assertThat(connection.getSource()).isInstanceOf(Node.class); // <1>
				assertThat(connection.getTarget()).isInstanceOf(Node.class);
				references.add(connection);
			}
		}
		Connection incoming = references.stream()
			.filter(c -> c.getSemanticElements().contains(CONNECTABLE__INCOMING_CONNECTIONS))
			.findFirst()
			.orElseThrow();
		assertThat(incoming.getSemanticElements()) // <2>
			.containsExactly(CONNECTABLE__INCOMING_CONNECTIONS, CONNECTION__TARGET);
		assertThat(incoming.getChildren()).hasSize(2);
		Label head = (Label) incoming.getChildren().get(0);
		Label tail = (Label) incoming.getChildren().get(1);
		assertThat(head.getText()).isEqualTo("incomingConnections *");
		assertThat(tail.getText()).isEqualTo("target");

		List<double[]> route = Coordinates.route(incoming);
		double[] frame = Coordinates.frame(incoming);
		double[] start = route.getFirst();
		double[] end = route.getLast();
		assertThat(distance(head, frame, end)).isLessThan(distance(head, frame, start)); // <3>
		assertThat(distance(tail, frame, start)).isLessThan(distance(tail, frame, end));

		long opposites = references.stream()
			.filter(c -> c.getSemanticElements().size() == 2)
			.count();
		long declared = DiagramPackage.eINSTANCE.getEClassifiers().stream()
			.filter(EClass.class::isInstance)
			.flatMap(c -> ((EClass) c).getEReferences().stream())
			.filter(r -> r.getEOpposite() != null)
			.count();
		assertThat(opposites * 2).isEqualTo(declared); // <4>
		// end::references[]
	}

	@Test
	public void testNodeContext() {
		// tag::context[]
		List<String> classes = EcoreDiagrams.nodes(nodeContext).stream()
			.filter(n -> CLASS.equals(n.getAttributes().get(KIND)))
			.map(Node::getName)
			.toList();
		assertThat(classes).contains(
				"Node", "Connectable", "DiagramElement", "NamedElement", // the class and its supertypes
				"Label", // a subtype
				"Bounds", "Port", // what its references lead to
				"Connection"); // what an inherited reference leads to, and refers back
		assertThat(classes).doesNotContain("Diagram", "Layer"); // <1>
		// end::context[]
		assertNoOverlaps(nodeContext);
	}

	@Test
	public void testRenderings() throws Exception {
		// tag::renderings[]
		String module = Files.readString(DiagramSite.SITE.resolve("modules/diagram-package.js"));
		assertThat(module)
			.contains("function ElkEdge(props)")
			.contains("edgeTypes")
			.contains("type: \"elk\"")
			.contains("markerEnd: \"triangle\"");

		File file = DiagramSite.SITE.resolve("diagram-package.drawio").toFile();
		Document drawio = Document.load(file); // <1>
		var node = (org.nasdanika.sdk.runtime.drawio.Node) drawio.getModelElementById("Node");
		Bounds bounds = EcoreDiagrams.nodes(packageDiagram).stream()
			.filter(n -> "Node".equals(n.getId()))
			.findFirst()
			.orElseThrow()
			.getBounds();
		assertThat(node.getGeometry().getX()).isEqualTo(bounds.getX());
		assertThat(node.getGeometry().getWidth()).isEqualTo(bounds.getWidth());
		// end::renderings[]
	}

	@Test
	public void testServe() throws Exception {
		// tag::serve[]
		HttpServer server = ServeDiagrams.serve(DiagramSite.SITE, 0); // <1>
		try {
			String root = "http://127.0.0.1:" + server.getAddress().getPort() + "/diagrams/";
			HttpClient client = HttpClient.newHttpClient();
			HttpResponse<String> page = client.send(
					HttpRequest.newBuilder(URI.create(root + "node-context.html")).build(),
					HttpResponse.BodyHandlers.ofString());
			assertThat(page.statusCode()).isEqualTo(200);
			assertThat(page.body()).contains("./modules/node-context.js");
			HttpResponse<String> module = client.send(
					HttpRequest.newBuilder(URI.create(root + "modules/node-context.js")).build(),
					HttpResponse.BodyHandlers.ofString());
			assertThat(module.headers().firstValue("Content-Type")).hasValueSatisfying(
					type -> assertThat(type).startsWith("text/javascript")); // <2>
		} finally {
			server.stop(0);
		}
		// end::serve[]
	}

	// --- Checks ---

	static void assertRectilinear(List<double[]> route) {
		for (int i = 1; i < route.size(); ++i) {
			double[] a = route.get(i - 1);
			double[] b = route.get(i);
			assertThat(a[0] == b[0] || a[1] == b[1])
				.as("Segment %s - %s", List.of(a[0], a[1]), List.of(b[0], b[1]))
				.isTrue();
		}
	}

	static void assertNoOverlaps(Diagram diagram) {
		List<Node> nodes = EcoreDiagrams.nodes(diagram);
		for (Node a: nodes) {
			for (Node b: nodes) {
				if (a != b && a.eContainer() == b.eContainer()) {
					Bounds p = a.getBounds();
					Bounds q = b.getBounds();
					boolean overlap = p.getX() < q.getX() + q.getWidth() && q.getX() < p.getX() + p.getWidth()
							&& p.getY() < q.getY() + q.getHeight() && q.getY() < p.getY() + p.getHeight();
					assertThat(overlap).as(a.getId() + " and " + b.getId()).isFalse();
				}
			}
		}
	}

	private static double distance(Label label, double[] frame, double[] point) {
		Bounds b = label.getBounds();
		double[] center = { frame[0] + b.getX() + b.getWidth() / 2, frame[1] + b.getY() + b.getHeight() / 2 };
		return Coordinates.distance(center, point);
	}

}
