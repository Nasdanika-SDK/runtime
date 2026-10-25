package org.nasdanika.sdk.runtime.models.diagram.tests.book;

import static org.assertj.core.api.Assertions.assertThat;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.junit.jupiter.api.Test;
import org.nasdanika.sdk.runtime.common.NasdanikaResourceSet;
import org.nasdanika.sdk.runtime.models.diagram.Bounds;
import org.nasdanika.sdk.runtime.models.diagram.Connection;
import org.nasdanika.sdk.runtime.models.diagram.Diagram;
import org.nasdanika.sdk.runtime.models.diagram.DiagramElement;
import org.nasdanika.sdk.runtime.models.diagram.DiagramFactory;
import org.nasdanika.sdk.runtime.models.diagram.Connectable;
import org.nasdanika.sdk.runtime.models.diagram.Node;
import org.nasdanika.sdk.runtime.models.diagram.Point;
import org.nasdanika.sdk.runtime.models.diagram.Port;

/**
 * Chapters "Building a diagram" and "Diagrams as resources".
 */
public class BuildingTests {

	// tag::build[]
	static Diagram systemContext() {
		DiagramFactory factory = DiagramFactory.eINSTANCE;

		Diagram diagram = factory.createDiagram(); // <1>
		diagram.setId("internet-banking");
		diagram.setName("Internet Banking System");

		Diagram page = factory.createDiagram();
		page.setId("context");
		page.setName("System Context");
		diagram.getChildren().add(page);

		Node customer = node("customer", "Personal Banking Customer", 240, 0, 200, 80);
		customer.getAttributes().put("type", "person"); // <2>
		Node ibs = node("ibs", "Internet Banking System", 240, 200, 200, 90);
		ibs.getAttributes().put("type", "software-system");
		ibs.getAttributes().put("owner", "Digital Channels");
		ibs.setDocumentation("Lets customers view their accounts and make payments."); // <3>
		Node mainframe = node("mainframe", "Mainframe Banking System", 240, 400, 200, 90);
		mainframe.getAttributes().put("type", "software-system");
		mainframe.getAttributes().put("owner", "Core Banking");
		page.getChildren().addAll(List.of(customer, ibs, mainframe));

		Port api = factory.createPort(); // <4>
		api.setId("api");
		api.setName("API");
		Point bottom = factory.createPoint();
		bottom.setX(0.5);
		bottom.setY(1);
		api.setLocation(bottom);
		ibs.getPorts().add(api);

		page.getChildren().add(connection("uses-ibs", "Uses", customer, ibs));
		Connection calls = connection("ibs-mainframe", "Gets account information from", api,
				mainframe);
		calls.getAttributes().put("protocol", "XML/HTTPS");
		page.getChildren().add(calls);
		return diagram;
	}

	static Node node(String id, String name, double x, double y, double width, double height) {
		Node node = DiagramFactory.eINSTANCE.createNode();
		node.setId(id);
		node.setName(name);
		Bounds bounds = DiagramFactory.eINSTANCE.createBounds();
		bounds.setX(x);
		bounds.setY(y);
		bounds.setWidth(width);
		bounds.setHeight(height);
		node.setBounds(bounds);
		return node;
	}

	static Connection connection(
			String id,
			String name,
			Connectable source,
			Connectable target) {
		Connection connection = DiagramFactory.eINSTANCE.createConnection();
		connection.setId(id);
		connection.setName(name);
		connection.setSource(source);
		connection.setTarget(target);
		return connection;
	}
	// end::build[]

	@Test
	public void testBuild() throws Exception {
		Diagram diagram = systemContext();
		// tag::navigate[]
		Diagram page = (Diagram) diagram.getChildren().getFirst();
		Node ibs = (Node) page.getChildren()
			.stream()
			.filter(e -> "ibs".equals(e.getId()))
			.findFirst()
			.orElseThrow();

		assertThat(ibs.getIncomingConnections()) // <1>
			.extracting(DiagramElement::getId)
			.containsExactly("uses-ibs");
		Port api = ibs.getPorts().getFirst();
		assertThat(api.getOutgoingConnections().getFirst().getTarget().getId())
			.isEqualTo("mainframe");
		assertThat(ibs.getOutgoingConnections()).isEmpty(); // <2>
		// end::navigate[]
	}

	@Test
	public void testSaveAndLoad() throws Exception {
		// tag::save[]
		ResourceSet resourceSet = NasdanikaResourceSet.createAndConfigure(); // <1>
		Path path = Path.of("target", "book", "internet-banking.yaml").toAbsolutePath();
		Files.createDirectories(path.getParent());
		Resource resource = resourceSet.createResource(URI.createFileURI(path.toString()));
		resource.getContents().add(systemContext());
		resource.save(null);

		Resource loaded = NasdanikaResourceSet.createAndConfigure()
			.getResource(URI.createFileURI(path.toString()), true);
		assertThat(EcoreUtil.equals(loaded.getContents(), resource.getContents())).isTrue();
		// end::save[]

		// tag::fragments[]
		Node ibs = (Node) loaded.getEObject("//@children[id='context']/@children[id='ibs']"); // <1>
		assertThat(ibs.getName()).isEqualTo("Internet Banking System");
		assertThat(EcoreUtil.getURI(ibs).fragment()).isEqualTo("//@children.0/@children.1"); // <2>
		// end::fragments[]
	}

	@Test
	public void testAuthoredYaml() throws Exception {
		// tag::authored[]
		URI uri = URI.createURI(getClass().getResource("internet-banking.yaml").toString());
		Resource authored = NasdanikaResourceSet.createAndConfigure().getResource(uri, true);
		assertThat(EcoreUtil.equals(authored.getContents().getFirst(), systemContext())).isTrue();
		// end::authored[]
	}

}
