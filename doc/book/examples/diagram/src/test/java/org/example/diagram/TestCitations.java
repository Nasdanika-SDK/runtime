package org.example.diagram;

import static org.assertj.core.api.Assertions.assertThat;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.example.library.Library;
import org.example.library.services.Samples;
import org.junit.jupiter.api.Test;
import org.nasdanika.sdk.runtime.common.NasdanikaResourceSet;
import org.nasdanika.sdk.runtime.models.diagram.Connection;
import org.nasdanika.sdk.runtime.models.diagram.Connectable;
import org.nasdanika.sdk.runtime.models.diagram.DiagramElement;
import org.nasdanika.sdk.runtime.models.diagram.Node;
import org.nasdanika.sdk.runtime.models.diagram.elk.ElkLayout;
import org.nasdanika.sdk.runtime.models.drawio.Document;
import org.nasdanika.sdk.runtime.models.drawio.Page;
import org.nasdanika.sdk.runtime.models.svg.Svg;
import org.nasdanika.sdk.runtime.models.svg.Text;

class TestCitations {

	static final Path DIRECTORY = Path.of("target", "diagram").toAbsolutePath();

	static URI uri(String name) throws IOException {
		Files.createDirectories(DIRECTORY);
		return URI.createFileURI(DIRECTORY.resolve(name).toString());
	}

	@Test
	void generateCheckAndDraw() throws IOException {
		Library library = Samples.library();
		// tag::layout[]
		Document document = Citations.diagram(library);
		Page page = document.getPages().getFirst();
		new ElkLayout().layout(page);                                               // <1>

		ResourceSet resourceSet = NasdanikaResourceSet.createAndConfigure();
		Resource drawio = resourceSet.createResource(uri("citations.drawio"));    // <2>
		drawio.getContents().add(document);
		drawio.save(null);
		// end::layout[]

		// tag::check[]
		Resource loaded = NasdanikaResourceSet.createAndConfigure()
			.getResource(uri("citations.drawio"), true);
		DiagramElement diagram = (DiagramElement) loaded.getContents().getFirst(); // <1>
		assertThat(Citations.check(diagram, library)).isEmpty();

		Connection connection = all(diagram, Connection.class).getFirst();
		Connectable source = connection.getSource();
		connection.setSource(connection.getTarget());                             // <2>
		connection.setTarget(source);
		assertThat(Citations.check(diagram, library)).containsExactly(
				connection.getSource().getName() + " does not cite " + source.getName()); // <3>
		// end::check[]

		// tag::svg[]
		Svg svg = SvgDrawing.draw(page);
		Resource image = resourceSet.createResource(uri("citations.svg"));       // <1>
		image.getContents().add(svg);
		image.save(null);
		// end::svg[]

		// The figure of the chapter is a copy of the drawing, checked to show the same books
		URI figure = URI.createURI(getClass().getResource("citations.svg").toString());
		Svg committed = (Svg) NasdanikaResourceSet.createAndConfigure()
			.getResource(figure, true)
			.getContents()
			.getFirst();
		assertThat(texts(committed))
			.as("The figure is out of date: copy %s to src/test/resources/org/example/diagram",
					DIRECTORY.resolve("citations.svg"))
			.isEqualTo(texts(svg))
			.containsExactlyInAnyOrderElementsOf(all(page, Node.class)
				.stream()
				.map(Node::getName)
				.toList());
	}

	static <T> List<T> all(EObject root, Class<T> type) {
		List<T> ret = new ArrayList<>();
		root.eAllContents().forEachRemaining(e -> {
			if (type.isInstance(e)) {
				ret.add(type.cast(e));
			}
		});
		return ret;
	}

	static List<String> texts(Svg svg) {
		return all(svg, Text.class).stream().map(Text::text).toList();
	}

}
