package org.example.capability;

import static org.assertj.core.api.Assertions.assertThat;
import static org.example.capability.Requirements.LIBRARY_RENDERER;
import static org.example.capability.Requirements.LIBRARY_SUPPLIER;

import java.io.IOException;
import java.lang.invoke.MethodHandles;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.example.library.Book;
import org.example.library.Library;
import org.example.library.LibraryFactory;
import org.example.library.services.Samples;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;
import org.nasdanika.sdk.runtime.common.NasdanikaResourceSet;
import org.nasdanika.sdk.runtime.common.capability.CapabilityFactorySource;
import org.nasdanika.sdk.runtime.common.capability.CapabilityLoader;
import org.nasdanika.sdk.runtime.common.capability.ReflectiveCapabilityFactory;
import org.nasdanika.sdk.runtime.common.capability.ReflectiveCapabilityFactory.Capability;
import org.nasdanika.sdk.runtime.common.capability.Requirement;
import org.nasdanika.sdk.runtime.common.capability.ResolutionListener;
import org.nasdanika.sdk.runtime.common.capability.ResolutionListener.FactoryNodeCollector;

class TestCapabilities {

	@Test
	void byGenericType() {
		// tag::by-type[]
		CapabilityLoader loader = CapabilityLoader.getInstance(); // Factories registered as services
		Supplier<Library> sample = loader.loadOne(Requirement.of(LIBRARY_SUPPLIER));
		assertThat(sample.get().getName()).isEqualTo("A Modeler's Shelf");
		// end::by-type[]
	}

	@Test
	void byTypeAndPayload() {
		// tag::by-payload[]
		Function<Library, String> markdown = CapabilityLoader.getInstance()
				.loadOne(Requirement.of(LIBRARY_RENDERER, new Format("markdown")));
		String text = markdown.apply(Samples.library());
		assertThat(text)
			.startsWith("# A Modeler's Shelf")
			.contains("* _Domain-Driven Design_ (2003)");
		// end::by-payload[]
	}

	@Test
	void plainRequirementObject() {
		// tag::isbn[]
		List<Book> books = CapabilityLoader.getInstance().loadAll(new Isbn("978-0321125217"));
		assertThat(books).extracting(Book::getName).containsExactly("Domain-Driven Design");
		// end::isbn[]
	}

	@Test
	void explaining() {
		// tag::explain[]
		List<String> lines = new ArrayList<>();
		CapabilityLoader loader = CapabilityLoader
				.of(new Renderers(), new IsbnLookup())
				.withListener(ResolutionListener.explaining(lines::add));
		loader.loadAll(Requirement.of(LIBRARY_RENDERER, new Format("markdown")));
		lines.forEach(System.out::println);
		// end::explain[]
		assertThat(lines).anyMatch(line -> line.contains("IsbnLookup declines"));
	}

	@Test
	void dependencyGraph() {
		// tag::graph[]
		FactoryNodeCollector collector = FactoryNodeCollector.create();
		CapabilityLoader.of(new Renderers())
			.withListener(collector)
			.loadAll(Requirement.of(LIBRARY_RENDERER, new Format("markdown")));
		// The markdown renderer needed a book renderer
		assertThat(collector.getFactoryNodes())
			.anySatisfy(node -> assertThat(node.dependencies()).hasSize(1));
		// end::graph[]
	}

	// tag::local[]
	/**
	 * A test double, in front of everything registered: its sample wins with loadOne.
	 */
	public static class EmptyLibrary {

		@Capability
		public Supplier<Library> empty() {
			return () -> {
				Library library = LibraryFactory.eINSTANCE.createLibrary();
				library.setName("Empty");
				return library;
			};
		}

	}

	@Test
	void localInFrontOfGlobal() {
		var factory = new ReflectiveCapabilityFactory(MethodHandles.lookup(), new EmptyLibrary());
		CapabilityFactorySource local = CapabilityFactorySource.of(factory);
		CapabilityFactorySource global = CapabilityFactorySource.serviceLoader();
		CapabilityFactorySource both = CapabilityFactorySource.concat(local, global);
		CapabilityLoader loader = CapabilityLoader.of(both);
		Supplier<Library> first = loader.loadOne(Requirement.of(LIBRARY_SUPPLIER));
		assertThat(first.get().getName()).isEqualTo("Empty");
		List<Supplier<Library>> all = loader.loadAll(Requirement.of(LIBRARY_SUPPLIER));
		assertThat(all).hasSize(2); // The registered sample is still there
	}
	// end::local[]

	@Test
	void trustBoundary() {
		// tag::filtered[]
		// Only factories from our own modules: a factory outside the set cannot satisfy
		// a dependency raised inside it either
		CapabilityFactorySource trusted = CapabilityFactorySource.serviceLoader()
				.filtered(f -> f.getClass().getModule().getName().startsWith("org.example."));
		CapabilityLoader loader = CapabilityLoader.of(trusted);
		assertThat(loader.<Book>loadAll(new Isbn("978-0201633610"))).hasSize(1);
		// end::filtered[]
	}

	@Test
	void csvFormat(@TempDir Path directory) throws IOException {
		// tag::csv[]
		Path file = directory.resolve("shelf.csv");
		Files.writeString(file, """
				# Two classics
				title,year,genre,isbn,authors
				Domain-Driven Design,2003,TECHNOLOGY,978-0321125217,Eric Evans
				"Design Patterns, Elements",1994,TECHNOLOGY,,Erich Gamma; Richard Helm
				""");

		URI uri = URI.createFileURI(file.toString());
		Resource resource = NasdanikaResourceSet.createAndConfigure().getResource(uri, true);
		Library library = (Library) resource.getContents().getFirst();
		assertThat(library.getName()).isEqualTo("Two classics");
		assertThat(library.getAuthors()).hasSize(3);
		assertThat(library.getBooks().get(1).getName()).isEqualTo("Design Patterns, Elements");

		library.getBooks().getFirst().setYear(2004);   // Edit the model, save the CSV
		resource.save(null);
		assertThat(Files.readString(file)).contains("Domain-Driven Design,2004,TECHNOLOGY");
		// end::csv[]
	}

}
