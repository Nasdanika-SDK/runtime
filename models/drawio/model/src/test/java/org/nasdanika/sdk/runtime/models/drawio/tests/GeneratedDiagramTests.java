package org.nasdanika.sdk.runtime.models.drawio.tests;

import static org.assertj.core.api.Assertions.assertThat;

import java.io.File;
import java.lang.module.ModuleDescriptor;
import java.nio.file.Path;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;
import org.nasdanika.sdk.runtime.common.NasdanikaResourceSet;
import org.nasdanika.sdk.runtime.drawio.playwright.Rendering;
import org.nasdanika.sdk.runtime.models.diagram.Bounds;
import org.nasdanika.sdk.runtime.models.diagram.DiagramElement;
import org.nasdanika.sdk.runtime.models.diagram.Point;
import org.nasdanika.sdk.runtime.models.diagram.elk.ElkLayout;
import org.nasdanika.sdk.runtime.models.drawio.Connection;
import org.nasdanika.sdk.runtime.models.drawio.Document;
import org.nasdanika.sdk.runtime.models.drawio.DrawioFactory;
import org.nasdanika.sdk.runtime.models.drawio.Layer;
import org.nasdanika.sdk.runtime.models.drawio.Node;
import org.nasdanika.sdk.runtime.models.drawio.Page;

/**
 * A diagram generated from the running JVM: the runtime's modules in the boot layer and the
 * modules they require, as a Draw.io model, laid out with ELK, saved as a {@code .drawio} file,
 * rendered by Draw.io's viewer into a PNG image with the document embedded, and loaded back.
 */
public class GeneratedDiagramTests {

	static final String PREFIX = "org.nasdanika.sdk.runtime.";

	// tag::generate[]
	/**
	 * A page with a node per module of the runtime in the boot layer, and a connection per
	 * {@code requires} between them.
	 */
	static Document modules() {
		DrawioFactory factory = DrawioFactory.eINSTANCE;
		Document document = factory.createDocument();
		Page page = factory.createPage();
		page.setId("modules");
		page.setName("Modules");
		page.getAttributes().put("elk.direction", "DOWN"); // <1>
		page.getAttributes().put("elk.edgeRouting", "ORTHOGONAL");
		document.getChildren().add(page);
		Layer layer = factory.createLayer();
		page.getChildren().add(layer);

		List<ModuleDescriptor> descriptors = ModuleLayer.boot().modules().stream()
			.filter(module -> module.getName().startsWith(PREFIX))
			.map(Module::getDescriptor)
			.sorted(Comparator.comparing(ModuleDescriptor::name))
			.toList();
		Map<String, Node> nodes = new LinkedHashMap<>();
		for (ModuleDescriptor descriptor : descriptors) {
			Node node = factory.createNode();
			node.setId(descriptor.name());
			node.setName(descriptor.name().substring(PREFIX.length())); // <2>
			boolean model = descriptor.name().startsWith(PREFIX + "models.");
			node.getStyle().put("rounded", "1"); // <3>
			node.getStyle().put("whiteSpace", "wrap");
			node.getStyle().put("fillColor", model ? "#dae8fc" : "#f5f5f5");
			node.getStyle().put("strokeColor", model ? "#6c8ebf" : "#666666");
			layer.getChildren().add(node);
			nodes.put(descriptor.name(), node);
		}
		for (ModuleDescriptor descriptor : descriptors) {
			for (ModuleDescriptor.Requires requires : descriptor.requires()) {
				Node target = nodes.get(requires.name());
				if (target != null) {
					Connection connection = factory.createConnection();
					connection.setSource(nodes.get(descriptor.name()));
					connection.setTarget(target);
					connection.getStyle().put("endArrow", "open");
					connection.getStyle().put("endFill", "0");
					if (requires.modifiers().contains(ModuleDescriptor.Requires.Modifier.TRANSITIVE)) {
						connection.getStyle().put("dashed", "1"); // <4>
					}
					layer.getChildren().add(connection);
				}
			}
		}
		return document;
	}
	// end::generate[]

	// tag::anchor[]
	/**
	 * ELK routes a connection from the outline of its source to the outline of its target. Draw.io
	 * takes the inner points as waypoints, and the ends as exit and entry points, relative to the
	 * bounds of the nodes.
	 */
	static void anchor(Connection connection) {
		EList<Point> route = connection.getWaypoints();
		if (route.size() < 2) {
			return;
		}
		Point exit = route.removeFirst();
		Point entry = route.removeLast();
		Bounds source = ((Node) connection.getSource()).getBounds();
		Bounds target = ((Node) connection.getTarget()).getBounds();
		connection.getStyle().put("exitX", relative(exit.getX() - source.getX(), source.getWidth()));
		connection.getStyle().put("exitY", relative(exit.getY() - source.getY(), source.getHeight()));
		connection.getStyle().put("entryX", relative(entry.getX() - target.getX(), target.getWidth()));
		connection.getStyle().put("entryY", relative(entry.getY() - target.getY(), target.getHeight()));
	}

	private static String relative(double offset, double size) {
		return String.valueOf(Math.max(0, Math.min(1, Math.round(offset / size * 1000) / 1000.0)));
	}
	// end::anchor[]

	@Test
	public void testGenerate() throws Exception {
		Document generated = modules();
		Assumptions.assumeTrue(generated.getPages().getFirst().getLayers().getFirst().getChildren().size() > 2, "Run on the module path");
		Path directory = Path.of("target", "generated");

		// tag::layout[]
		Document document = modules();
		Page page = document.getPages().getFirst();
		new ElkLayout().layout(page); // <1>
		for (DiagramElement element : page.getLayers().getFirst().getChildren()) {
			if (element instanceof Connection connection) {
				anchor(connection);
			}
		}

		ResourceSet resourceSet = NasdanikaResourceSet.createAndConfigure();
		File file = directory.resolve("modules.drawio").toFile();
		Resource resource = resourceSet.createResource(URI.createFileURI(file.getAbsolutePath()));
		resource.getContents().add(document);
		resource.save(null); // <2>
		// end::layout[]

		assertThat(((Node) page.getLayers().getFirst().getChildren().getFirst()).getBounds()).isNotNull();

		// tag::render[]
		var drawio = org.nasdanika.sdk.runtime.drawio.Document.load(file); // <1>
		Path png = rendering().withScale(2).png(drawio, directory.resolve("modules.drawio.png")); // <2>

		Resource image = NasdanikaResourceSet.createAndConfigure()
			.getResource(URI.createFileURI(png.toAbsolutePath().toString()), true); // <3>
		Page loaded = ((Document) image.getContents().getFirst()).getPages().getFirst();
		assertThat(loaded.getName()).isEqualTo("Modules");
		// end::render[]
		assertThat(loaded.getLayers().getFirst().getChildren()).hasSameSizeAs(page.getLayers().getFirst().getChildren());
	}

	/**
	 * The browser from the {@code nasdanika.playwright.channel} system property: an installed one,
	 * or Playwright's Chromium if empty. The test is skipped if it cannot be launched.
	 */
	static Rendering rendering() {
		String channel = System.getProperty("nasdanika.playwright.channel", "chrome");
		Rendering rendering = Rendering.DEFAULT.withBrowser(Rendering.DEFAULT.browser().withChannel(channel.isBlank() ? null : channel));
		try {
			rendering.inViewer(emptyDocument(), viewer -> null);
		} catch (RuntimeException e) {
			Assumptions.abort("No browser to render with: " + e.getMessage());
		}
		return rendering;
	}

	private static org.nasdanika.sdk.runtime.drawio.Document emptyDocument() {
		try {
			var document = org.nasdanika.sdk.runtime.drawio.Document.create(false, null);
			document.createPage();
			return document;
		} catch (Exception e) {
			throw new IllegalStateException(e);
		}
	}

}
