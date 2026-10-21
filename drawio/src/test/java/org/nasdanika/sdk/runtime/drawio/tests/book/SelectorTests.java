package org.nasdanika.sdk.runtime.drawio.tests.book;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.nasdanika.sdk.runtime.drawio.Document;
import org.nasdanika.sdk.runtime.drawio.ModelElement;

/**
 * Chapter "Selectors and property paths".
 */
public class SelectorTests {

	@Test
	public void testSelectors() throws Exception {
		Document document = Diagrams.load("internet-banking.png");
		// tag::select[]
		ModelElement<?> customer = document.getModelElementById("customer");
		assertThat(customer.select("outgoing-connection/target")) // <1>
			.extracting(ModelElement::getId)
			.containsExactly("ibs");

		ModelElement<?> ibs = document.getModelElementById("ibs");
		assertThat(ibs.select("outgoing-connection[protocol=SMTP]/target")) // <2>
			.extracting(ModelElement::getId)
			.containsExactly("email");
		assertThat(ibs.select("incoming-connection/source"))
			.extracting(ModelElement::getId)
			.containsExactly("customer");
		// end::select[]

		// tag::containment[]
		ModelElement<?> api = document.getModelElementById("api");
		ModelElement<?> boundary = api.select("..").getFirst();
		assertThat(boundary.getId()).isEqualTo("ibs-boundary");
		assertThat(boundary.select("child"))
			.extracting(ModelElement::getId)
			.contains("spa", "api", "database");
		assertThat(boundary.select("child[technology=Java]"))
			.extracting(ModelElement::getId)
			.containsExactly("api");
		// end::containment[]

		// tag::across-pages[]
		assertThat(boundary.select("link-target/outgoing-connection/target")) // <1>
			.extracting(ModelElement::getId)
			.containsExactlyInAnyOrder("mainframe", "email");
		// end::across-pages[]
	}

	@Test
	public void testPropertyPaths() throws Exception {
		Document document = Diagrams.load("internet-banking.png");
		// tag::paths[]
		ModelElement<?> ibs = document.getModelElementById("ibs");
		assertThat(ibs.getProperty("outgoing-connection[protocol=SMTP]/target/owner"))
			.isEqualTo("Workplace Services");
		assertThat(ibs.getProperty("incoming-connection/protocol")).isEqualTo("HTTPS");

		ModelElement<?> spa = document.getModelElementById("spa");
		assertThat(spa.getProperty("../link-target/owner")).isEqualTo("Digital Channels"); // <1>
		assertThat(spa.getProperty("outgoing-connection/target/technology")).isEqualTo("Java");
		// end::paths[]

		// tag::no-match[]
		assertThat(ibs.select("child")).isEmpty();
		assertThat(ibs.select("outgoing-connection[protocol=FTP]")).isEmpty();
		assertThat(ibs.getProperty("outgoing-connection[protocol=FTP]/target/owner")).isNull();
		// end::no-match[]
	}

}
