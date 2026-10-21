package org.nasdanika.sdk.runtime.drawio.tests.book;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.stream.Collectors;

import org.junit.jupiter.api.Test;
import org.nasdanika.sdk.runtime.drawio.Connection;
import org.nasdanika.sdk.runtime.drawio.ConnectionBase;
import org.nasdanika.sdk.runtime.drawio.Document;
import org.nasdanika.sdk.runtime.drawio.Element;
import org.nasdanika.sdk.runtime.drawio.Layer;
import org.nasdanika.sdk.runtime.drawio.LayerElement;
import org.nasdanika.sdk.runtime.drawio.ModelElement;
import org.nasdanika.sdk.runtime.drawio.Node;
import org.nasdanika.sdk.runtime.drawio.Page;
import org.nasdanika.sdk.runtime.drawio.Tag;
import org.nasdanika.sdk.runtime.drawio.util.Util;

/**
 * Chapter "Navigating a diagram".
 */
public class NavigationTests {

	@Test
	public void testWalk() throws Exception {
		Document document = Diagrams.load("internet-banking.png");
		// tag::walk[]
		List<String> outline = new ArrayList<>();
		for (Page page: document.getPages()) {
			outline.add(page.getName());
			for (Layer<?> layer: page.getModel().getRoot().getLayers()) {
				outline.add("  layer " + layer.getId());
				for (LayerElement<?> element: layer.getElements()) {
					outline.add("    " + element.getId());
				}
			}
		}
		assertThat(outline).startsWith(
			"System Context",
			"  layer 1",
			"    customer",
			"    ibs",
			"    mainframe",
			"    email",
			"    uses-ibs");
		assertThat(outline).contains("  layer notes", "    legend", "Containers", "    ibs-boundary");
		// end::walk[]
	}

	@Test
	public void testStream() throws Exception {
		Document document = Diagrams.load("internet-banking.png");
		// tag::stream[]
		List<String> systems = document
			.stream()
			.filter(Node.class::isInstance)
			.map(Node.class::cast)
			.filter(node -> "software-system".equals(node.getProperty("type")))
			.map(Diagrams::text)
			.toList();
		assertThat(systems).containsExactly(
			"Internet Banking System [Software System]",
			"Mainframe Banking System [Software System]",
			"E-mail System [Software System]");
		// end::stream[]

		// tag::find[]
		ModelElement<?> ibs = document.getModelElementById("ibs");
		ModelElement<?> core = document.getModelElementByProperty("owner", "Core Banking");
		assertThat(core.getId()).isEqualTo("mainframe");
		assertThat(ibs.getModel().getPage().getName()).isEqualTo("System Context");
		// end::find[]
	}

	@Test
	public void testConnections() throws Exception {
		Document document = Diagrams.load("internet-banking.png");
		// tag::connections[]
		Node ibs = (Node) document.getModelElementById("ibs");
		Map<String, String> uses = ibs
			.getOutgoingConnections()
			.stream()
			.collect(Collectors.toMap(
				Connection::getLabel,
				connection -> Util.getConnectableNode(connection.getTarget()).getId())); // <1>
		assertThat(uses).containsOnly(
			Map.entry("Gets account information from and makes payments using", "mainframe"),
			Map.entry("Sends e-mail using", "email"));

		assertThat(ibs.getIncomingConnections())
			.extracting(Connection::getId)
			.containsExactly("uses-ibs");
		// end::connections[]
	}

	@Test
	public void testVisitor() throws Exception {
		Document document = Diagrams.load("internet-banking.png");
		Page systemContext = document.getPageByName("System Context");
		// tag::visitor[]
		BiFunction<Element<?>, Map<? extends Element<?>, Integer>, Integer> counter =
			(element, childResults) -> {
				int nodes = element instanceof Node ? 1 : 0;
				for (Integer childResult: childResults.values()) { // <1>
					nodes += childResult;
				}
				return nodes;
			};
		assertThat(systemContext.accept(counter)).isEqualTo(5); // <2>
		assertThat(document.getPageByName("Containers").accept(counter)).isEqualTo(5);
		// end::visitor[]
	}

	@Test
	public void testConnectionBase() throws Exception {
		Document document = Diagrams.load("internet-banking.png");
		Page systemContext = document.getPageByName("System Context");
		// tag::connection-base[]
		BiFunction<Element<?>, Map<Element<?>, String>, String> tree =
			(element, childResults) -> {
				String children = String.join(", ", childResults.values());
				String id = element instanceof ModelElement<?> me ? me.getId() : "page";
				return children.isEmpty() ? id : id + "(" + children + ")";
			};
		String byParent = systemContext.accept(tree, ConnectionBase.PARENT);
		String bySource = systemContext.accept(tree, ConnectionBase.SOURCE); // <1>
		assertThat(bySource).contains("ibs(ibs-mainframe, ibs-email)");
		assertThat(bySource).contains("customer(uses-ibs)");
		assertThat(byParent).doesNotContain("ibs(ibs-mainframe");
		// end::connection-base[]
	}

	@Test
	public void testLayersAndTags() throws Exception {
		Document document = Diagrams.load("internet-banking.png");
		Page systemContext = document.getPageByName("System Context");
		// tag::tags[]
		assertThat(systemContext.getTags().keySet())
			.containsExactlyInAnyOrder("person", "internal", "legacy", "note"); // <1>

		Tag legacy = systemContext.getTags().get("legacy");
		assertThat(legacy.getElements())
			.extracting(ModelElement::getId)
			.containsExactly("mainframe");

		ModelElement<?> mainframe = document.getModelElementById("mainframe");
		assertThat(mainframe.getTags())
			.extracting(Tag::getName)
			.containsExactlyInAnyOrder("internal", "legacy");
		// end::tags[]

		// tag::layers[]
		Layer<?> notes = systemContext
			.getModel()
			.getRoot()
			.getLayers()
			.stream()
			.filter(layer -> "Notes".equals(layer.getLabel()))
			.findFirst()
			.orElseThrow();
		assertThat(notes.isVisible()).isTrue();
		notes.setVisible(false); // <1>
		assertThat(document.save(false)).contains("visible=\"0\"");
		// end::layers[]
	}

}
