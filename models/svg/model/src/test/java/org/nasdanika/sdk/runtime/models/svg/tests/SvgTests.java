package org.nasdanika.sdk.runtime.models.svg.tests;

import static org.assertj.core.api.Assertions.assertThat;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.junit.jupiter.api.Test;
import org.nasdanika.sdk.runtime.common.NasdanikaResourceSet;
import org.nasdanika.sdk.runtime.models.diagram.Connection;
import org.nasdanika.sdk.runtime.models.diagram.Diagram;
import org.nasdanika.sdk.runtime.models.diagram.DiagramFactory;
import org.nasdanika.sdk.runtime.models.diagram.Node;
import org.nasdanika.sdk.runtime.models.diagram.elk.ElkLayout;
import org.nasdanika.sdk.runtime.models.svg.Circle;
import org.nasdanika.sdk.runtime.models.svg.G;
import org.nasdanika.sdk.runtime.models.svg.Rect;
import org.nasdanika.sdk.runtime.models.svg.Svg;
import org.nasdanika.sdk.runtime.models.svg.SvgFactory;
import org.nasdanika.sdk.runtime.models.svg.TSpan;
import org.nasdanika.sdk.runtime.models.svg.Text;
import org.nasdanika.sdk.runtime.models.svg.Title;
import org.nasdanika.sdk.runtime.models.svg.resource.SvgFormat;

/**
 * Building SVG, writing it, reading it back, and drawing a diagram laid out with ELK.
 */
public class SvgTests {

	@Test
	public void testBuild() throws Exception {
		// tag::build[]
		SvgFactory factory = SvgFactory.eINSTANCE;
		Svg svg = factory.createSvg();
		svg.setWidth("120");
		svg.setHeight("60");

		G group = svg.add(factory.createG()); // <1>
		group.setFill("#dae8fc");
		group.setStroke("#6c8ebf");

		Rect rect = group.add(factory.createRect());
		rect.setWidth(80);
		rect.setHeight(40);
		rect.setRx(6);
		Title title = rect.add(factory.createTitle()); // <2>
		title.setValue("A tooltip");

		Circle circle = group.add(factory.createCircle());
		circle.setCx(100);
		circle.setCy(20);
		circle.setR(10);

		Text text = svg.add(factory.createText());
		text.setX("40");
		text.setY("55");
		text.setTextAnchor("middle");
		text.addText("Hello, "); // <3>
		TSpan bold = text.addSpan(factory.createTSpan());
		bold.setFontWeight("bold");
		bold.addText("SVG");

		String written = SvgFormat.toString(svg); // <4>
		// end::build[]
		assertThat(written)
			.contains("<svg xmlns=\"http://www.w3.org/2000/svg\"")
			.contains("<rect width=\"80.0\" height=\"40.0\" rx=\"6.0\">")
			.contains("<title>A tooltip</title>")
			.contains("<tspan font-weight=\"bold\">SVG</tspan>");
		assertThat(group.children()).containsExactly(rect, circle);
		assertThat(text.text()).isEqualTo("Hello, SVG");

		// tag::read[]
		Svg read = SvgFormat.load(new ByteArrayInputStream(written.getBytes(StandardCharsets.UTF_8)), URI.createURI("hello.svg"));
		G readGroup = (G) read.children().getFirst();
		assertThat(readGroup.children()).hasSize(2).first().isInstanceOf(Rect.class);
		Text readText = (Text) read.children().getLast();
		assertThat(readText.text()).isEqualTo("Hello, SVG");
		// end::read[]
	}

	@Test
	public void testResourceSet() throws Exception {
		Svg svg = SvgFactory.eINSTANCE.createSvg();
		svg.setWidth("10");
		svg.add(SvgFactory.eINSTANCE.createRect()).setWidth(5);
		// tag::resource[]
		ResourceSet resourceSet = NasdanikaResourceSet.createAndConfigure();
		File file = new File("target/svg/rect.svg");
		Resource resource = resourceSet.createResource(URI.createFileURI(file.getAbsolutePath())); // <1>
		resource.getContents().add(svg);
		resource.save(null);

		Resource loaded = NasdanikaResourceSet.createAndConfigure().getResource(URI.createFileURI(file.getAbsolutePath()), true);
		Svg read = (Svg) loaded.getContents().getFirst(); // <2>
		assertThat(read.getWidth()).isEqualTo("10");
		// end::resource[]
		assertThat(read.children()).singleElement().isInstanceOf(Rect.class);
	}

	// tag::diagram[]
	static Diagram context() {
		DiagramFactory factory = DiagramFactory.eINSTANCE;
		Diagram diagram = factory.createDiagram();
		diagram.getAttributes().put("elk.direction", "DOWN"); // <1>
		diagram.getAttributes().put("elk.edgeRouting", "ORTHOGONAL");
		diagram.getAttributes().put("elk.spacing.nodeNode", "40");

		Node customer = node(diagram, "customer", "Personal Banking Customer", "person");
		Node banking = node(diagram, "banking", "Internet Banking System", "software-system");
		banking.setDocumentation("Lets customers view their accounts and make payments"); // <2>
		banking.getAttributes().put("link", "https://runtime.sdk.nasdanika.org");
		Node mainframe = node(diagram, "mainframe", "Mainframe Banking System", "external");
		Node email = node(diagram, "email", "E-mail System", "external");

		connect(diagram, customer, banking, "Views accounts and makes payments");
		connect(diagram, banking, mainframe, "Gets account information");
		connect(diagram, banking, email, "Sends e-mail").getAttributes().put("async", "true");
		connect(diagram, email, customer, "Sends e-mails to");
		return diagram;
	}
	// end::diagram[]

	static Node node(Diagram diagram, String id, String name, String type) {
		Node node = DiagramFactory.eINSTANCE.createNode();
		node.setId(id);
		node.setName(name);
		node.getAttributes().put("type", type);
		diagram.getChildren().add(node);
		return node;
	}

	static Connection connect(Diagram diagram, Node source, Node target, String name) {
		Connection connection = DiagramFactory.eINSTANCE.createConnection();
		connection.setId(source.getId() + "-" + target.getId());
		connection.setName(name);
		connection.setSource(source);
		connection.setTarget(target);
		diagram.getChildren().add(connection);
		return connection;
	}

	@Test
	public void testDiagram() throws Exception {
		// tag::layout[]
		Diagram diagram = context();
		new ElkLayout().padding(16, 12).layout(diagram); // <1>
		Svg svg = new DiagramToSvg().convert(diagram); // <2>

		Path file = Path.of("target", "svg", "internet-banking.svg");
		Files.createDirectories(file.getParent());
		Files.writeString(file, SvgFormat.toString(svg)); // <3>
		// end::layout[]

		String written = Files.readString(file);
		assertThat(written)
			.contains("<title>Lets customers view their accounts and make payments</title>")
			.contains("<a href=\"https://runtime.sdk.nasdanika.org\">")
			.contains("marker-end=\"url(#arrow)\"")
			.contains(">Sends e-mail</text>");
	}

}
