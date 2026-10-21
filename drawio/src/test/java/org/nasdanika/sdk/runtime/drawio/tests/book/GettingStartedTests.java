package org.nasdanika.sdk.runtime.drawio.tests.book;

import static org.assertj.core.api.Assertions.assertThat;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.junit.jupiter.api.Test;
import org.nasdanika.sdk.runtime.drawio.Document;
import org.nasdanika.sdk.runtime.drawio.Page;

/**
 * Chapter "Getting started": loading, saving and sharing a diagram.
 */
public class GettingStartedTests {

	@Test
	public void testFirstDiagram() throws Exception {
		// tag::first[]
		Document document = Diagrams.load("internet-banking.png");
		List<String> pageNames = document
			.getPages()
			.stream()
			.map(Page::getName)
			.toList();
		assertThat(pageNames).containsExactly("System Context", "Containers");
		// end::first[]
	}

	@Test
	public void testSaveAndLoad() throws Exception {
		Document document = Diagrams.load("internet-banking.png");
		// tag::save[]
		Path path = Path.of("target", "book", "internet-banking.drawio");
		Files.createDirectories(path.getParent());
		Files.writeString(path, document.save(false)); // <1>

		Document reloaded = Document.load(path.toFile()); // <2>
		assertThat(reloaded.getPages()).hasSize(2);
		assertThat(reloaded.getURI().lastSegment()).isEqualTo("internet-banking.drawio");
		// end::save[]

		// tag::compressed[]
		String compressed = document.save(true);
		assertThat(compressed).doesNotContain("mxGraphModel"); // <1>
		Document fromString = Document.load(compressed, null); // <2>
		assertThat(fromString.getPageById("containers").getName()).isEqualTo("Containers");
		// end::compressed[]
	}

	@Test
	public void testShare() throws Exception {
		Document document = Diagrams.load("internet-banking.png");
		// tag::html[]
		String html = document.toHtml(); // <1>
		Path page = Path.of("target", "book", "internet-banking.html");
		Files.createDirectories(page.getParent());
		Files.writeString(page, "<html><body>" + html + "</body></html>");
		assertThat(html).contains("class=\"mxgraph\"").contains(Document.JSDELIVR_DRAWIO_VIEWER);
		// end::html[]

		// tag::data-uri[]
		URI dataUri = document.toDataURI(true); // <1>
		assertThat(Document.isDataURI(dataUri)).isTrue();
		Document fromDataUri = Document.load(dataUri); // <2>
		assertThat(fromDataUri.getPages()).hasSize(2);
		// end::data-uri[]
	}

	@Test
	public void testAllWays() throws Exception {
		// tag::sources[]
		File file = new File(
			"src/test/resources/org/nasdanika/sdk/runtime/drawio/tests/compressed.drawio");
		Document fromFile = Document.load(file);
		Document fromUrl = Document.load(file.toURI().toURL());
		Document fromUri = Document.load(URI.createFileURI(file.getAbsolutePath()));
		Document fromStream;
		try (var in = Files.newInputStream(file.toPath())) {
			fromStream = Document.load(in, URI.createFileURI(file.getAbsolutePath()));
		}
		Document empty = Document.create(false, null);
		// end::sources[]
		for (Document document: List.of(fromFile, fromUrl, fromUri, fromStream)) {
			assertThat(document.getPages()).isNotEmpty();
		}
		assertThat(empty.getPages()).isEmpty();
	}

}
