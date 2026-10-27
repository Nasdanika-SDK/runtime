package org.nasdanika.sdk.runtime.models.meta.tests.book;

import static org.assertj.core.api.Assertions.assertThat;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;
import org.nasdanika.sdk.runtime.models.meta.MetaPackage;
import org.nasdanika.sdk.runtime.models.meta.Package;

/**
 * The listings of the Meta Model book.
 */
public class MetaBookTests {

	private static ResourceSet resourceSet() {
		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getResourceFactoryRegistry()
			.getExtensionToFactoryMap()
			.put("xml", new XMIResourceFactoryImpl());
		resourceSet.getPackageRegistry().put(MetaPackage.eNS_URI, MetaPackage.eINSTANCE);
		return resourceSet;
	}

	/**
	 * The glossary is compared with the reviewed file the book includes.
	 */
	@Test
	public void glossary() throws IOException {
		String glossary = Projections.glossary(Vocabulary.library());
		Path expected = Path.of(
				"src/test/resources/org/nasdanika/sdk/runtime/models/meta/tests/book/library.md");
		assertThat(glossary).isEqualToNormalizingNewlines(Files.readString(expected));
	}

	@Test
	public void vocabularyIsAModel(@TempDir Path directory) throws IOException {
		// tag::save[]
		URI uri = URI.createFileURI(directory.resolve("library.xml").toString());
		Resource resource = resourceSet().createResource(uri);
		resource.getContents().add(Vocabulary.library());
		resource.save(null);                                            // <1>

		Package loaded = (Package) resourceSet()
			.getResource(uri, true)
			.getContents()
			.getFirst();
		assertThat(loaded.getClassifiers())
			.extracting(c -> c.getName())
			.containsExactly("Person", "Format", "Book");
		// end::save[]
		assertThat(Files.readString(directory.resolve("library.xml")))
			.contains("International Standard Book Number");
	}

	@Test
	public void ecoreProjection(@TempDir Path directory) throws IOException {
		// tag::instances[]
		EPackage library = Projections.ecore(Vocabulary.library());
		EClass bookClass = (EClass) library.getEClassifier("Book");
		EObject book = EcoreUtil.create(bookClass);                     // <1>
		book.eSet(bookClass.getEStructuralFeature("isbn"), "978-0321125217");
		book.eSet(bookClass.getEStructuralFeature("title"), "Domain-Driven Design");

		ResourceSet resourceSet = resourceSet();
		resourceSet.getPackageRegistry().put(library.getNsURI(), library); // <2>
		URI uri = URI.createFileURI(directory.resolve("books.xml").toString());
		Resource resource = resourceSet.createResource(uri);
		resource.getContents().add(book);
		resource.save(null);
		// end::instances[]
		assertThat(Files.readString(directory.resolve("books.xml"))).contains("978-0321125217");
		assertThat(EcoreUtil.getID(book)).isEqualTo("978-0321125217");
	}

}
