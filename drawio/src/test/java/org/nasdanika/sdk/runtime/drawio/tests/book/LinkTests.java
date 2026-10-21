package org.nasdanika.sdk.runtime.drawio.tests.book;

import static org.assertj.core.api.Assertions.assertThat;

import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import org.eclipse.emf.common.util.URI;
import org.junit.jupiter.api.Test;
import org.nasdanika.sdk.runtime.drawio.Document;
import org.nasdanika.sdk.runtime.drawio.Document.Context;
import org.nasdanika.sdk.runtime.drawio.Element;
import org.nasdanika.sdk.runtime.drawio.Layer;
import org.nasdanika.sdk.runtime.drawio.LinkTarget;
import org.nasdanika.sdk.runtime.drawio.ModelElement;
import org.nasdanika.sdk.runtime.drawio.Node;
import org.nasdanika.sdk.runtime.drawio.Page;
import org.nasdanika.sdk.runtime.drawio.util.Util;

/**
 * Chapter "Links between pages, elements and documents".
 */
public class LinkTests {

	@Test
	public void testLinksInDocument() throws Exception {
		Document document = Diagrams.load("internet-banking.png");
		// tag::links[]
		ModelElement<?> ibs = document.getModelElementById("ibs");
		assertThat(ibs.isTargetLink()).isTrue();
		Page containers = (Page) ibs.getLinkTarget(); // <1>
		assertThat(containers.getName()).isEqualTo("Containers");

		ModelElement<?> boundary = document.getModelElementById("ibs-boundary");
		assertThat(boundary.getLinkTarget()).isSameAs(ibs); // <2>

		ModelElement<?> mainframeRef = document.getModelElementById("mainframe-ref");
		Node mainframe = (Node) mainframeRef.getLinkTarget(); // <3>
		assertThat(mainframe.getModel().getPage().getName()).isEqualTo("System Context");
		assertThat(mainframe.getId()).isEqualTo("mainframe");
		// end::links[]
	}

	@Test
	public void testFollowLinks() throws Exception {
		Document document = Diagrams.load("internet-banking.png");
		Page systemContext = document.getPageByName("System Context");
		// tag::follow[]
		List<String> pages = new ArrayList<>();
		Consumer<Element<?>> visitor = element -> {
			if (element instanceof Page page) {
				pages.add(page.getName());
			}
		};
		systemContext.accept(visitor, null);
		assertThat(pages).containsExactly("System Context");

		pages.clear();
		systemContext.accept(Util.withLinkTargets(visitor, null), null); // <1>
		assertThat(pages).containsExactlyInAnyOrder("System Context", "Containers");
		// end::follow[]
	}

	@Test
	public void testCrossDocument() throws Exception {
		// tag::cross-document[]
		URL links = Diagrams.class.getResource("/org/nasdanika/sdk/runtime/drawio/tests/links.drawio");
		Document document = Document.load(links);
		Node linkSource = document
			.stream()
			.filter(Node.class::isInstance)
			.map(Node.class::cast)
			.filter(node -> "Link to linked on compressed second page".equals(node.getLabel()))
			.findFirst()
			.orElseThrow();
		assertThat(linkSource.getLink())
			.isEqualTo("data:element/name,compressed.drawio#name,Page+2/Linked");

		Node linked = (Node) linkSource.getLinkTarget(); // <1>
		Document other = linked.getModel().getPage().getDocument();
		assertThat(other.getURI().lastSegment()).isEqualTo("compressed.drawio");
		assertThat(other).isSameAs(document.getDocument(URI.createURI("compressed.drawio"))); // <2>
		// end::cross-document[]
	}

	@Test
	public void testLogicalUris() throws Exception {
		// tag::logical[]
		Context catalog = new Context() {

			@Override
			public InputStream openStream(URI uri) throws java.io.IOException,
					java.net.URISyntaxException {
				if ("catalog".equals(uri.scheme())) { // <1>
					String path = "/org/nasdanika/sdk/runtime/drawio/tests/" + uri.opaquePart();
					return Diagrams.class.getResourceAsStream(path);
				}
				return Context.super.openStream(uri);
			}

		};

		Document document = Document.create(false, null, catalog);
		Layer<?> layer = document.createPage().getModel().getRoot().getLayers().getFirst();
		Node node = layer.createNode();
		node.setLink("data:page/name,catalog:compressed.drawio#Page+2"); // <2>
		LinkTarget<?> target = node.getLinkTarget();
		assertThat(((Page) target).getName()).isEqualTo("Page 2");
		// end::logical[]
	}

}
