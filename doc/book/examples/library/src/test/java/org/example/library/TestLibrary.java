package org.example.library;

import static org.assertj.core.api.Assertions.assertThat;

import java.io.IOException;
import java.nio.file.Path;
import java.util.List;

import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.example.library.services.Samples;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;
import org.nasdanika.sdk.runtime.common.NasdanikaResourceSet;

class TestLibrary {

	@Test
	void generatedApi() {
		// tag::api[]
		LibraryFactory factory = LibraryFactory.eINSTANCE;
		Library library = factory.createLibrary();

		Author evans = factory.createAuthor();
		evans.setName("Eric Evans");
		library.getAuthors().add(evans);           // Containment: the library owns its authors

		Book ddd = factory.createBook();
		ddd.setName("Domain-Driven Design");
		ddd.setYear(2003);
		ddd.setGenre(Genre.TECHNOLOGY);
		ddd.getAuthors().add(evans);               // A cross reference
		library.getBooks().add(ddd);

		assertThat(evans.getBooks()).containsExactly(ddd); // The opposite is maintained
		assertThat(ddd.eContainer()).isSameAs(library);
		// end::api[]
	}

	@Test
	void everyFormat(@TempDir Path directory) throws IOException {
		// tag::formats[]
		ResourceSet resourceSet = NasdanikaResourceSet.createAndConfigure();
		Library library = Samples.library();
		for (String extension: List.of("xmi", "library", "ebin", "egz", "json", "yml")) {
			URI uri = URI.createFileURI(directory.resolve("shelf." + extension).toString());
			Resource resource = resourceSet.createResource(uri);   // The extension picks the factory
			resource.getContents().add(EcoreUtil.copy(library));
			resource.save(null);

			Resource loaded = NasdanikaResourceSet.createAndConfigure().getResource(uri, true);
			EObject root = loaded.getContents().getFirst();
			assertThat(EcoreUtil.equals(root, library)).as(extension).isTrue();
		}
		// end::formats[]
	}

	@Test
	void moduleUri() {
		// tag::module-uri[]
		ResourceSet resourceSet = NasdanikaResourceSet.createAndConfigure();
		URI uri = URI.createURI("module://org.example.library/catalog.library");
		Library catalog = (Library) resourceSet.getResource(uri, true).getContents().getFirst();
		assertThat(catalog.getBooks()).extracting(Book::getName).contains("Domain-Driven Design");
		// end::module-uri[]
	}

	@Test
	void operations() throws Exception {
		// tag::operations[]
		Library library = Samples.library();
		List<Book> classics = library.publishedBefore(1900);   // An operation implemented in Xcore
		assertThat(classics).extracting(Book::getName)
			.containsExactly("On the Origin of Species", "War and Peace");

		// The same operation, invoked reflectively: what a tool, a CLI or an agent would do
		EOperation operation = LibraryPackage.Literals.LIBRARY___PUBLISHED_BEFORE__INT;
		Object result = library.eInvoke(operation, ECollections.asEList(1900));
		assertThat(result).isEqualTo(classics);
		// end::operations[]
	}

}
