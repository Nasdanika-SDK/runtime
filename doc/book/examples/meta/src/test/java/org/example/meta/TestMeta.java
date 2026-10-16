package org.example.meta;

import static org.assertj.core.api.Assertions.assertThat;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;
import org.nasdanika.sdk.runtime.common.NasdanikaResourceSet;
import org.nasdanika.sdk.runtime.models.meta.Package;

class TestMeta {

	@Test
	void glossary() {
		// tag::glossary-test[]
		String glossary = Projections.glossary(Vocabulary.library());
		System.out.println(glossary);
		assertThat(glossary)
			.contains("## Book")
			.contains("| isbn (identifies) | string | International Standard Book Number, 13 digits. |")
			.contains("| authors | Person, many |");
		// end::glossary-test[]
	}

	@Test
	void vocabularyIsAModel(@TempDir Path directory) throws IOException {
		// tag::save[]
		ResourceSet resourceSet = NasdanikaResourceSet.createAndConfigure();
		URI uri = URI.createFileURI(directory.resolve("library.meta.yml").toString());
		Resource resource = resourceSet.createResource(uri);
		resource.getContents().add(Vocabulary.library());
		resource.save(null);                                            // <1>
		// end::save[]
		Package loaded = (Package) NasdanikaResourceSet.createAndConfigure()
				.getResource(uri, true)
				.getContents()
				.getFirst();
		assertThat(loaded.getClassifiers()).hasSize(2);
		assertThat(Files.readString(directory.resolve("library.meta.yml"))).contains("International Standard Book Number");
	}

	@Test
	void ecoreProjection(@TempDir Path directory) throws IOException {
		// tag::instances[]
		EPackage library = Projections.ecore(Vocabulary.library());
		EClass bookClass = (EClass) library.getEClassifier("Book");
		EObject book = EcoreUtil.create(bookClass);                     // <1>
		book.eSet(bookClass.getEStructuralFeature("isbn"), "978-0321125217");
		book.eSet(bookClass.getEStructuralFeature("title"), "Domain-Driven Design");

		ResourceSet resourceSet = NasdanikaResourceSet.createAndConfigure();
		resourceSet.getPackageRegistry().put(library.getNsURI(), library); // <2>
		URI uri = URI.createFileURI(directory.resolve("books.json").toString());
		Resource resource = resourceSet.createResource(uri);
		resource.getContents().add(book);
		resource.save(null);
		// end::instances[]
		List<String> lines = Files.readAllLines(directory.resolve("books.json"));
		assertThat(String.join("\n", lines)).contains("978-0321125217");
	}

}
