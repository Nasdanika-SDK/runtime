package org.nasdanika.sdk.runtime.groovy.tests.book;

import static org.assertj.core.api.Assertions.assertThat;

import java.io.File;
import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.junit.jupiter.api.Test;
import org.nasdanika.sdk.runtime.common.NasdanikaResourceSet;

/**
 * The language: entry points, dispatch, call forms, references, globals.
 */
public class LanguageTests {

	static URI uri(String name) throws IOException {
		File file = new File("src/test/resources/book", name).getCanonicalFile();
		return URI.createFileURI(file.getAbsolutePath());
	}

	@Test
	public void library() throws IOException {
		// tag::load[]
		ResourceSet resourceSet = NasdanikaResourceSet.createAndConfigure(); // <1>
		Resource resource = resourceSet.getResource(uri("library.ecore.groovy"), true); // <2>
		EPackage library = (EPackage) resource.getContents().get(0);
		assertThat(library.getName()).isEqualTo("library");
		// end::load[]

		// tag::model[]
		EClass namedElement = (EClass) library.getEClassifier("NamedElement");
		EClass book = (EClass) library.getEClassifier("Book");
		EClass author = (EClass) library.getEClassifier("Author");
		assertThat(namedElement.isAbstract()).isTrue();

		EClass libraryClass = (EClass) library.getEClassifier("Library");
		EReference books = (EReference) libraryClass.getEStructuralFeature("books");
		assertThat(books.getEType()).isSameAs(book); // Resolved after the script ran
		assertThat(books.isMany()).isTrue();

		EReference authors = (EReference) book.getEStructuralFeature("authors");
		assertThat(authors.getEOpposite()).isSameAs(author.getEStructuralFeature("books"));
		// end::model[]
	}

	@Test
	public void callForms() throws IOException {
		// tag::forms[]
		ResourceSet resourceSet = NasdanikaResourceSet.createAndConfigure();
		Resource resource = resourceSet.getResource(uri("forms.ecore.groovy"), true);
		EPackage forms = (EPackage) resource.getContents().get(0);
		EClass shelf = (EClass) forms.getEClassifier("Shelf");
		assertThat(shelf.getEStructuralFeature("assigned").getUpperBound()).isEqualTo(-1);
		assertThat(shelf.getEStructuralFeature("called").getUpperBound()).isEqualTo(-1);
		assertThat(shelf.getEStructuralFeature("subtracted").getUpperBound()).isEqualTo(1); // <1>
		// end::forms[]
	}

	@Test
	public void plainGroovy() throws IOException {
		// tag::plain[]
		ResourceSet resourceSet = NasdanikaResourceSet.createAndConfigure();
		Resource resource = resourceSet.getResource(uri("plain.groovy"), true);
		EPackage plain = (EPackage) resource.getContents().get(0);
		assertThat(plain.getEClassifier("Thing")).isInstanceOf(EClass.class);
		// end::plain[]
	}

	@Test
	public void globals() throws IOException {
		// tag::global[]
		ResourceSet resourceSet = NasdanikaResourceSet.createAndConfigure();
		resourceSet.getResource(uri("library.ecore.groovy"), true);
		EObject library = resourceSet.getEObject(URI.createURI("urn:example:library"), false);
		assertThat(library).isInstanceOf(EPackage.class); // <1>
		// end::global[]
	}

}
