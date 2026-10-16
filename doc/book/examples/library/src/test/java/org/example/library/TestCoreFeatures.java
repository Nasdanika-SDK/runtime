package org.example.library;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Date;

import org.example.library.services.Samples;
import org.junit.jupiter.api.Test;
import org.nasdanika.sdk.runtime.models.core.CoreFactory;
import org.nasdanika.sdk.runtime.models.core.Marker;

/**
 * What the library model gets from extending the core model's NamedElement.
 */
class TestCoreFeatures {

	private static Book book(Library library, String name) {
		return library.getBooks().stream()
				.filter(b -> name.equals(b.getName()))
				.findFirst()
				.orElseThrow();
	}

	@Test
	void documentation() {
		// tag::documentation[]
		Book ddd = book(Samples.library(), "Domain-Driven Design");
		ddd.setDocumentation("""
				Introduced the *Ubiquitous Language* and the *Published Language*:
				a vocabulary shared by a team, and its documented form shared with others.
				""");                                 // <1>
		ddd.setDocRef("ddd/review.md");               // <2>
		ddd.setId("ddd");                             // <3>
		ddd.setIcon("fas fa-book");                   // <4>
		// end::documentation[]
		assertThat(ddd.getDocumentation()).contains("Published Language");
	}

	@Test
	void markers() {
		// tag::markers[]
		Book ddd = book(Samples.library(), "Domain-Driven Design");
		Marker marker = CoreFactory.eINSTANCE.createMarker();
		marker.setLocation("https://example.org/catalogs/2026/books.csv"); // <1>
		marker.setPosition("42");                                          // <2>
		marker.setDate(new Date());
		marker.setComment("Imported from the acquisitions spreadsheet");
		ddd.getMarkers().add(marker);
		// end::markers[]
		assertThat(ddd.getMarkers()).hasSize(1);
	}

	@Test
	void referrers() {
		// tag::referrers[]
		Library library = Samples.library();
		Book patterns = book(library, "Design Patterns");

		// Book.cites has no opposite. Who cites Design Patterns?
		assertThat(patterns.getReferrers(LibraryPackage.Literals.BOOK__CITES))
			.extracting(referrer -> ((Book) referrer).getName())
			.containsExactlyInAnyOrder("Domain-Driven Design", "EMF: Eclipse Modeling Framework");
		// end::referrers[]
	}

}
