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
import org.nasdanika.sdk.runtime.models.meta.Class;            // Shadows java.lang.Class in this file
import org.nasdanika.sdk.runtime.models.meta.Classifier;
import org.nasdanika.sdk.runtime.models.meta.ClassifierReference;
import org.nasdanika.sdk.runtime.models.meta.Feature;
import org.nasdanika.sdk.runtime.models.meta.Package;
import org.nasdanika.sdk.runtime.models.meta.Reference;
import org.nasdanika.sdk.runtime.models.meta.resource.MetaWriter;

class TestMeta {

	private static final Path TEXT = Path.of("src/main/meta").toAbsolutePath();

	private static final URI LENDING = URI.createFileURI(TEXT.resolve("lending.nmeta").toString());

	// tag::text-resource-set[]
	static ResourceSet vocabularies() {
		ResourceSet resourceSet = NasdanikaResourceSet.createAndConfigure();    // <1>
		resourceSet.getURIConverter().getURIMap().put(                          // <2>
				URI.createURI("https://example.org/vocabulary/library"),
				URI.createFileURI(TEXT.resolve("library.nmeta").toString()));
		return resourceSet;
	}
	// end::text-resource-set[]

	private static Classifier classifier(Package pkg, String name) {
		return pkg.getClassifiers().stream().filter(c -> name.equals(c.getName())).findFirst().orElseThrow();
	}

	private static Feature feature(Class type, String name) {
		return type.getFeatures().stream().filter(f -> name.equals(f.getName())).findFirst().orElseThrow();
	}

	@Test
	void textSyntax() {
		// tag::text-load[]
		Resource resource = vocabularies().getResource(LENDING, true);
		Package lending = (Package) resource.getContents().getFirst();

		Class loan = (Class) classifier(lending, "Loan");
		ClassifierReference book = (ClassifierReference) feature(loan, "book").getType();
		assertThat(book.getTarget().getName()).isEqualTo("Book");                 // <1>
		assertThat(book.getTarget().eResource().getURI().lastSegment())
			.isEqualTo("library.nmeta");

		Reference loans = (Reference) feature((Class) classifier(lending, "Member"), "loans");
		assertThat(loans.isContainment()).isTrue();                               // <2>
		assertThat(loans.getOpposite()).isSameAs(feature(loan, "member"));
		assertThat(loans.getKeys()).extracting(Feature::getName).containsExactly("loanId");

		assertThat(resource.getWarnings()).extracting(Resource.Diagnostic::getMessage)  // <3>
			.containsExactly("Facet type occupancy.Presence is not available, "
					+ "its properties are not checked");
		// end::text-load[]

		assertThat(loan.getDocumentation()).isEqualTo("A book in a member's hands, until it comes back.");
		assertThat(loan.getMarkers().getFirst().getPosition()).isEqualTo("34:1");
		assertThat(loan.getOperations().getFirst().getName()).isEqualTo("fineOn");
		assertThat(feature(loan, "fine").getAnnotations().getFirst().getSource())
			.isEqualTo("https://runtime.sdk.nasdanika.org/models/occupancy#Presence");
		assertThat(Projections.glossary(lending))
			.contains("## Loan")
			.contains("| book | Book | The book on loan. Defined by the library's vocabulary, not here. |");
	}

	@Test
	void textIsCanonical(@TempDir Path directory) throws IOException {
		// tag::text-write[]
		Package library = Vocabulary.library();                                 // <1>
		String text = MetaWriter.write(library);

		URI uri = URI.createFileURI(directory.resolve("library.nmeta").toString());
		Resource resource = vocabularies().createResource(uri);
		resource.getContents().add(library);
		resource.save(null);                                                    // <2>
		// end::text-write[]
		assertThat(text).isEqualToNormalizingNewlines(Files.readString(TEXT.resolve("library.nmeta")));
		assertThat(Files.readString(directory.resolve("library.nmeta"))).isEqualTo(text);

		Package loaded = (Package) vocabularies().getResource(uri, true).getContents().getFirst();
		assertThat(MetaWriter.write(loaded)).isEqualTo(text);
		assertThat(Projections.glossary(loaded)).isEqualTo(Projections.glossary(Vocabulary.library()));
		EPackage projected = Projections.ecore(loaded);
		EClass book = (EClass) projected.getEClassifier("Book");
		assertThat(book.getEStructuralFeature("authors").getEType())
			.isSameAs(projected.getEClassifier("Person"));
	}

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
