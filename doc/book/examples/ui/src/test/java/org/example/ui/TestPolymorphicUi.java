package org.example.ui;

import static org.assertj.core.api.Assertions.assertThat;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.example.library.Book;
import org.example.library.Library;
import org.example.library.LibraryPackage;
import org.example.library.services.Samples;
import org.junit.jupiter.api.Test;
import org.nasdanika.sdk.runtime.common.capability.CapabilityLoader;
import org.nasdanika.sdk.runtime.models.core.CoreFactory;
import org.nasdanika.sdk.runtime.models.core.CorePackage;
import org.nasdanika.sdk.runtime.models.core.Marker;
import org.nasdanika.sdk.runtime.models.html.bootstrap.generator.BootstrapStructure;

class TestPolymorphicUi {

	private static Book book(Library library, String name) {
		return library.getBooks().stream()
				.filter(b -> name.equals(b.getName()))
				.findFirst()
				.orElseThrow();
	}

	@Test
	void lineage() {
		// tag::lineage[]
		assertThat(Views.lineage(LibraryPackage.Literals.BOOK)).containsExactly(
				LibraryPackage.Literals.BOOK,
				CorePackage.Literals.NAMED_ELEMENT,
				CorePackage.Literals.MODEL_ELEMENT,
				CorePackage.Literals.STRING_IDENTITY,
				CorePackage.Literals.DOCUMENTED,
				CorePackage.Literals.MARKED,
				CorePackage.Literals.REFERRABLE);
		// end::lineage[]
	}

	@Test
	void dispatchOnType() {
		// tag::dispatch[]
		Library library = Samples.library();
		Marker marker = CoreFactory.eINSTANCE.createMarker();
		marker.setLocation("acquisitions.csv");
		marker.setPosition("42");
		book(library, "Domain-Driven Design").getMarkers().add(marker);

		Views views = new Views(CapabilityLoader.getInstance());                    // <1>
		String html = BootstrapStructure.generate(views.render(library));

		assertThat(html)
			.contains("<h1>A Modeler's Shelf</h1>")                                 // <2>
			.contains("<h5 class=\"card-title\">Domain-Driven Design</h5>")         // <3>
			.contains("<p class=\"named-element\"><strong>Eric Evans</strong></p>") // <4>
			.contains("<th>location</th>")                                         // <5>
			.contains("acquisitions.csv");
		// end::dispatch[]
		System.out.println(html);
	}

	/**
	 * One book, compared with the file the book shows.
	 */
	@Test
	void bookWithMarker() throws IOException {
		Library library = Samples.library();
		Book ddd = book(library, "Domain-Driven Design");
		Marker marker = CoreFactory.eINSTANCE.createMarker();
		marker.setLocation("acquisitions.csv");
		marker.setPosition("42");
		ddd.getMarkers().add(marker);

		Views views = new Views(CapabilityLoader.getInstance());
		String html = BootstrapStructure.generate(views.render(ddd)).replace("\r\n", "\n") + "\n";
		Path out = Path.of("target", "polymorphic");
		Files.createDirectories(out);
		Files.writeString(out.resolve("ddd.html"), html);
		Path expected = Path.of("src", "test", "resources", "expected", "ddd.html");
		assertThat(html).isEqualTo(Files.readString(expected).replace("\r\n", "\n"));
	}

	@Test
	void dynamicObjects() {
		// tag::dynamic[]
		EClass note = EcoreFactory.eINSTANCE.createEClass();                        // <1>
		note.setName("Note");
		EAttribute text = EcoreFactory.eINSTANCE.createEAttribute();
		text.setName("text");
		text.setEType(EcorePackage.Literals.ESTRING);
		note.getEStructuralFeatures().add(text);
		EPackage notes = EcoreFactory.eINSTANCE.createEPackage();
		notes.setName("notes");
		notes.setNsURI("https://example.org/notes");
		notes.getEClassifiers().add(note);

		EObject reminder = EcoreUtil.create(note);
		reminder.eSet(text, "Return the book by Friday");

		String html = BootstrapStructure.generate(
				new Views(CapabilityLoader.getInstance()).render(reminder));
		assertThat(html)
			.contains("<td>Note</td>")                                                // <2>
			.contains("<td>Return the book by Friday</td>");
		// end::dynamic[]
		assertThat(List.of(html)).isNotEmpty();
	}

}
