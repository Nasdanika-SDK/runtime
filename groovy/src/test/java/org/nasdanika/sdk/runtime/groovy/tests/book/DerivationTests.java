package org.nasdanika.sdk.runtime.groovy.tests.book;

import static org.assertj.core.api.Assertions.assertThat;
import static org.nasdanika.sdk.runtime.groovy.tests.book.LanguageTests.uri;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.junit.jupiter.api.Test;
import org.nasdanika.sdk.runtime.common.NasdanikaResourceSet;

/**
 * Scripts that derive models from other resources, copy prototypes, and save themselves.
 */
public class DerivationTests {

	@Test
	public void derived() throws IOException {
		// tag::derived[]
		ResourceSet resourceSet = NasdanikaResourceSet.createAndConfigure();
		Resource dto = resourceSet.getResource(uri("derived.ecore.groovy"), true);
		EPackage dtoPackage = (EPackage) dto.getContents().get(0);
		assertThat(dtoPackage.getEClassifiers())
			.extracting(c -> c.getName())
			.containsExactly("LibraryDto", "BookDto", "AuthorDto"); // <1>
		EClass bookDto = (EClass) dtoPackage.getEClassifier("BookDto");
		assertThat(bookDto.getEStructuralFeatures())
			.extracting(f -> f.getName())
			.containsExactly("title", "year");
		assertThat(resourceSet.getResources()).hasSize(2); // <2>
		// end::derived[]
	}

	@Test
	public void copied() throws IOException {
		// tag::copied[]
		ResourceSet resourceSet = NasdanikaResourceSet.createAndConfigure();
		Resource resource = resourceSet.getResource(uri("branch.ecore.groovy"), true);
		EPackage branch = (EPackage) resource.getContents().get(0);
		EClass branchClass = (EClass) branch.getEClassifier("Branch");
		assertThat(branchClass.getEStructuralFeatures())
			.extracting(f -> f.getName())
			.containsExactly("books", "authors", "address"); // <1>

		EPackage library = (EPackage) resourceSet.getResources().get(1).getContents().get(0);
		EReference books = (EReference) branchClass.getEStructuralFeature("books");
		assertThat(books.getEType()).isSameAs(library.getEClassifier("Book")); // <2>
		assertThat(library.getEClassifier("Library")).isNotSameAs(branchClass); // <3>
		// end::copied[]
	}

	@Test
	public void selfWriting() throws IOException {
		// tag::save[]
		ResourceSet resourceSet = NasdanikaResourceSet.createAndConfigure();
		Resource journal = resourceSet.getResource(uri("journal.ecore.groovy"), true);
		String source = Files.readString(new File(journal.getURI().toFileString()).toPath());

		ByteArrayOutputStream out = new ByteArrayOutputStream(); // <1>
		journal.save(out, null);
		assertThat(out.toString(StandardCharsets.UTF_8))
			.isEqualTo(source + "// Saved with 1 class\n"); // <2>
		// end::save[]
	}

}
