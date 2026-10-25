package org.nasdanika.sdk.runtime.models.drawio.tests;

import static org.assertj.core.api.Assertions.assertThat;

import java.io.File;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.junit.jupiter.api.Test;
import org.nasdanika.sdk.runtime.common.NasdanikaResourceSet;
import org.nasdanika.sdk.runtime.models.diagram.DiagramElement;
import org.nasdanika.sdk.runtime.models.drawio.Connection;
import org.nasdanika.sdk.runtime.models.drawio.CustomLink;
import org.nasdanika.sdk.runtime.models.drawio.Document;
import org.nasdanika.sdk.runtime.models.drawio.Layer;
import org.nasdanika.sdk.runtime.models.drawio.Node;
import org.nasdanika.sdk.runtime.models.drawio.Page;
import org.nasdanika.sdk.runtime.models.drawio.SimpleLink;
import org.nasdanika.sdk.runtime.models.drawio.Tag;

/**
 * Draw.io documents in a resource set: loading the book's example, reading it as a model, and
 * saving changes back to Draw.io XML.
 */
public class DrawioTests {

	static Document load(ResourceSet resourceSet, String name) {
		URI uri = URI.createURI(DrawioTests.class.getResource(name).toString());
		return (Document) resourceSet.getResource(uri, true).getContents().getFirst();
	}

	/**
	 * The element with the id, anywhere under the root.
	 */
	@SuppressWarnings("unchecked")
	static <T extends DiagramElement> T element(EObject root, String id) {
		for (var contents = root.eAllContents(); contents.hasNext();) {
			if (contents.next() instanceof DiagramElement element && id.equals(element.getId())) {
				return (T) element;
			}
		}
		throw new AssertionError("No element " + id);
	}

	@Test
	public void testLoad() {
		// tag::load[]
		ResourceSet resourceSet = NasdanikaResourceSet.createAndConfigure(); // <1>
		URI uri = URI.createURI(DrawioTests.class.getResource("internet-banking.drawio").toString());
		Resource resource = resourceSet.getResource(uri, true); // <2>
		Document document = (Document) resource.getContents().getFirst();

		assertThat(document.getPages()).extracting(Page::getName).containsExactly("System Context", "Containers");
		Page context = document.getPages().getFirst();
		assertThat(context.getLayers()).extracting(Layer::getName).containsExactly(null, "Notes"); // <3>
		assertThat(context.getAttributes().map()).containsEntry("audience", "Architects"); // <4>
		// end::load[]
	}

	@Test
	public void testElements() {
		Document document = load(NasdanikaResourceSet.createAndConfigure(), "internet-banking.drawio");
		// tag::elements[]
		Node banking = element(document, "banking");
		assertThat(banking.getLabel()).isEqualTo("<b>Internet Banking System</b><br>Accounts and payments"); // <1>
		assertThat(banking.getName()).isEqualTo("Internet Banking System Accounts and payments");
		assertThat(banking.getDocumentation()).isEqualTo("Lets customers view their accounts and make payments"); // <2>
		assertThat(banking.getAttributes().map()) // <3>
			.containsEntry("type", "software-system")
			.containsEntry("owner", "Digital Channels")
			.doesNotContainKeys("label", "tooltip", "tags", "link");
		assertThat(banking.getStyle().get("fillColor")).isEqualTo("#1168bd"); // <4>
		assertThat(banking.getStyleString()).startsWith("rounded=1;whiteSpace=wrap;html=1;");
		assertThat(banking.getBounds().getWidth()).isEqualTo(160);

		Connection calls = element(document, "calls");
		assertThat(calls.getSource()).isSameAs(banking); // <5>
		assertThat(calls.getTarget()).isSameAs(element(document, "mainframe"));
		assertThat(calls.getWaypoints()).hasSize(1);
		assertThat(banking.getOutgoingConnections()).extracting(DiagramElement::getName).containsExactly("Reads and writes");
		// end::elements[]

		Node boundary = element(document, "boundary");
		assertThat(boundary.getChildren()).extracting(DiagramElement::getId).containsExactly("spa", "api", "spa-api");
		Node note = element(document, "note");
		assertThat(note.getName()).isEqualTo("Drawn after the C4 model's example");
		assertThat(note.getStyle().containsKey("shape")).isTrue();
	}

	@Test
	public void testTagsAndLinks() {
		Document document = load(NasdanikaResourceSet.createAndConfigure(), "internet-banking.drawio");
		// tag::links[]
		Page context = document.getPages().getFirst();
		Tag internal = context.getTags().stream().filter(t -> "internal".equals(t.getId())).findFirst().orElseThrow();
		assertThat(internal.getElements()) // <1>
			.extracting(e -> ((DiagramElement) e).getId())
			.containsExactlyInAnyOrder("banking", "mainframe");

		Node banking = element(document, "banking");
		CustomLink toPage = (CustomLink) banking.getLink(); // <2>
		assertThat(toPage.getTarget()).isSameAs(document.getPages().get(1));

		CustomLink toElement = (CustomLink) ((Node) element(document, "boundary")).getLink(); // <3>
		assertThat(toElement.getTarget()).isSameAs(banking);
		assertThat(toElement.getPageSelector()).isEqualTo("context");

		assertThat(banking.getReferrers(org.nasdanika.sdk.runtime.models.drawio.DrawioPackage.Literals.CUSTOM_LINK__TARGET)) // <4>
			.containsExactly(toElement);

		SimpleLink web = (SimpleLink) ((Node) element(document, "api")).getLink(); // <5>
		assertThat(web.getTarget()).isEqualTo("https://runtime.sdk.nasdanika.org");
		// end::links[]
	}

	@Test
	public void testSave() throws Exception {
		ResourceSet resourceSet = NasdanikaResourceSet.createAndConfigure();
		Document document = load(resourceSet, "internet-banking.drawio");
		// tag::save[]
		Node mainframe = element(document, "mainframe");
		mainframe.getStyle().put("fillColor", "#d5e8d4"); // <1>
		mainframe.getAttributes().put("status", "retiring");

		File file = new File("target/saved/internet-banking.drawio");
		Resource saved = resourceSet.createResource(URI.createFileURI(file.getAbsolutePath())); // <2>
		saved.getContents().add(EcoreUtil.copy(document));
		saved.save(null);

		var drawio = org.nasdanika.sdk.runtime.drawio.Document.load(file); // <3>
		var drawioMainframe = drawio.getModelElementById("mainframe");
		assertThat(drawioMainframe.getStyle().get("fillColor")).isEqualTo("#d5e8d4");
		assertThat(drawioMainframe.getProperty("status")).isEqualTo("retiring");
		assertThat(drawio.getModelElementById("banking").getLink()).isEqualTo("data:page/id,containers");
		assertThat(drawio.getModelElementById("boundary").getLink()).isEqualTo("data:element/id,id,context/banking");
		// end::save[]

		// The saved document loads as the model it was saved from
		Resource reloaded = NasdanikaResourceSet.createAndConfigure().getResource(URI.createFileURI(file.getAbsolutePath()), true);
		assertThat(EcoreUtil.equals(saved.getContents().getFirst(), reloaded.getContents().getFirst())).isTrue();
	}


}
