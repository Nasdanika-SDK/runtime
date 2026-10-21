package org.nasdanika.sdk.runtime.drawio.tests.book;

import static org.assertj.core.api.Assertions.assertThat;

import java.io.InputStream;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.junit.jupiter.api.Test;
import org.nasdanika.sdk.runtime.drawio.Document;
import org.nasdanika.sdk.runtime.drawio.Document.Context;
import org.nasdanika.sdk.runtime.drawio.ModelElement;

/**
 * Chapter "Properties and placeholders".
 */
public class PropertiesTests {

	@Test
	public void testProperties() throws Exception {
		Document document = Diagrams.load("internet-banking.png");
		// tag::properties[]
		ModelElement<?> ibs = document.getModelElementById("ibs");
		assertThat(ibs.getProperty("type")).isEqualTo("software-system");
		assertThat(ibs.getProperty("owner")).isEqualTo("Digital Channels");
		assertThat(ibs.getPropertyNames()) // <1>
			.containsExactlyInAnyOrder("id", "type", "owner", "placeholders");
		assertThat(ibs.getLink()).isEqualTo("data:page/id,containers");
		assertThat(ibs.getProperty("budget")).isEmpty(); // <2>
		// end::properties[]

		// tag::placeholders[]
		assertThat(ibs.getTooltip()).isEqualTo( // <1>
			"Allows customers to view information about their bank accounts and make payments."
			+ " Owned by Digital Channels.");

		ibs.setProperty("colors", "Filled with %$style:fillColor%"); // <2>
		assertThat(ibs.getProperty("colors")).isEqualTo("Filled with #1168BD");
		// end::placeholders[]

		// tag::write[]
		ModelElement<?> mainframe = document.getModelElementById("mainframe");
		mainframe.setProperty("retirement", "2028");
		mainframe.setTooltip(mainframe.getTooltip() + ". Retirement planned for 2028");
		mainframe.setProperty("owner", null); // <1>
		assertThat(mainframe.getPropertyNames()).contains("retirement").doesNotContain("owner");
		assertThat(document.save(false)).contains("retirement=\"2028\"");
		// end::write[]
	}

	@Test
	public void testContext() throws Exception {
		// tag::context[]
		Map<String, String> environment = Map.of("environment", "production");
		Context context = Context.fromPropertySource(environment::get); // <1>
		Document document;
		try (InputStream in = Diagrams.class.getResourceAsStream("internet-banking.png")) {
			List<Document> documents = Document.loadFromPngMetadata(in, null, context);
			document = documents.getFirst();
		}

		ModelElement<?> api = document.getModelElementById("api");
		api.setProperty("placeholders", "1");
		api.setProperty("endpoint", "https://api.%environment%.example.com"); // <2>
		assertThat(api.getProperty("endpoint")).isEqualTo("https://api.production.example.com");
		// end::context[]
	}

	@Test
	public void testFilter() throws Exception {
		// tag::filter[]
		Context publicRendering = new Context() {

			@Override
			public String filterProperty(ModelElement<?> element, String name, String value) {
				return "owner".equals(name) ? null : value; // <1>
			}

		};
		Document document;
		try (InputStream in = Diagrams.class.getResourceAsStream("internet-banking.png")) {
			document = Document.loadFromPngMetadata(in, null, publicRendering).getFirst();
		}
		ModelElement<?> ibs = document.getModelElementById("ibs");
		assertThat(ibs.getProperty("owner")).isNull();
		assertThat(ibs.getProperty("type")).isEqualTo("software-system");
		// end::filter[]
		assertThat(ibs.getURI()).isNotNull();
		assertThat(URI.createURI("data:page/id,containers").scheme()).isEqualTo("data");
	}

}
