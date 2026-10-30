package org.nasdanika.sdk.runtime.models.meta.tests.book;

import static org.assertj.core.api.Assertions.assertThat;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;
import org.nasdanika.sdk.runtime.models.meta.Annotation;
import org.nasdanika.sdk.runtime.models.meta.Class;            // Shadows java.lang.Class in this file
import org.nasdanika.sdk.runtime.models.meta.Classifier;
import org.nasdanika.sdk.runtime.models.meta.ClassifierReference;
import org.nasdanika.sdk.runtime.models.meta.Feature;
import org.nasdanika.sdk.runtime.models.meta.MetaPackage;
import org.nasdanika.sdk.runtime.models.meta.Package;          // Shadows java.lang.Package in this file
import org.nasdanika.sdk.runtime.models.meta.Reference;
import org.nasdanika.sdk.runtime.models.meta.resource.MetaResourceFactory;
import org.nasdanika.sdk.runtime.models.meta.resource.MetaWriter;

/**
 * The listings of the text syntax chapter: a bank's vocabulary in a .nmeta file, importing the
 * party vocabulary another team owns.
 */
public class TextSyntaxTests {

	private static final Path BOOK = Path.of("src/test/resources/org/nasdanika/sdk/runtime/models/meta/tests/book");

	private static final URI BANK = URI.createFileURI(BOOK.resolve("bank.nmeta").toAbsolutePath().toString());

	// tag::resource-set[]
	static ResourceSet resourceSet() {
		ResourceSet resourceSet = new ResourceSetImpl();
		Map<String, Object> factories = resourceSet.getResourceFactoryRegistry()
			.getExtensionToFactoryMap();
		factories.put("nmeta", new MetaResourceFactory());                  // <1>
		factories.put("xml", new XMIResourceFactoryImpl());
		resourceSet.getPackageRegistry().put(MetaPackage.eNS_URI, MetaPackage.eINSTANCE);

		Path party = BOOK.resolve("party.nmeta").toAbsolutePath();
		resourceSet.getURIConverter().getURIMap().put(                      // <2>
				URI.createURI("https://example.org/vocabulary/party"),
				URI.createFileURI(party.toString()));
		return resourceSet;
	}
	// end::resource-set[]

	private static Classifier classifier(Package pkg, String name) {
		return pkg.getClassifiers().stream().filter(c -> name.equals(c.getName())).findFirst().orElseThrow();
	}

	private static Feature feature(Class type, String name) {
		return type.getFeatures().stream().filter(f -> name.equals(f.getName())).findFirst().orElseThrow();
	}

	@Test
	public void load() {
		// tag::load[]
		Resource resource = resourceSet().getResource(BANK, true);
		Package bank = (Package) resource.getContents().getFirst();
		assertThat(bank.getClassifiers()).extracting(Classifier::getName).containsExactly(
				"CurrencyCode", "Amount", "ProductCategory", "Direction",
				"Product", "Customer", "Account", "Transaction", "Statement");

		Class customer = (Class) classifier(bank, "Customer");
		ClassifierReference party = (ClassifierReference) feature(customer, "party").getType();
		assertThat(party.getTarget().getName()).isEqualTo("Party");                 // <1>
		assertThat(party.getTarget().eResource().getURI().lastSegment()).isEqualTo("party.nmeta");

		Class account = (Class) classifier(bank, "Account");
		Reference holders = (Reference) feature(account, "holders");
		assertThat(holders.getOpposite()).isSameAs(feature(customer, "accounts"));
		assertThat(holders.getLowerBound()).isEqualTo(1);                           // <2>
		assertThat(holders.getUpperBound()).isEqualTo(-1);
		assertThat(account.getDocumentation())
			.isEqualTo("An arrangement under a product, in one currency, through which money moves.");

		assertThat(resource.getWarnings()).extracting(Resource.Diagnostic::getMessage)  // <3>
			.containsExactly("Facet type occupancy.Presence is not available, "
					+ "its properties are not checked");
		// end::load[]

		Reference transactions = (Reference) feature(account, "transactions");
		assertThat(transactions.isContainment()).isTrue();
		assertThat(transactions.getKeys()).extracting(Feature::getName).containsExactly("transactionId");
		assertThat(account.getOperations().getFirst().getName()).isEqualTo("balanceAt");
		assertThat(customer.getMarkers().getFirst().getPosition()).isEqualTo("55:1");
		assertThat(customer.getAnnotations().getFirst().getDetails().get("icon")).isEqualTo("bi-person");
	}

	@Test
	public void facet() {
		Package bank = (Package) resourceSet().getResource(BANK, true).getContents().getFirst();
		// tag::facet[]
		Class customer = (Class) classifier(bank, "Customer");
		Annotation presence = feature(customer, "contractLanguage").getAnnotations().getFirst();
		assertThat(presence.getSource())
			.isEqualTo("https://runtime.sdk.nasdanika.org/models/occupancy#Presence");
		assertThat(presence.getDetails().get("jurisdiction")).isEqualTo("CA-QC");
		// end::facet[]
	}

	/**
	 * The glossary of the bank is compared with the reviewed file the book includes.
	 */
	@Test
	public void glossary() throws IOException {
		Package bank = (Package) resourceSet().getResource(BANK, true).getContents().getFirst();
		String glossary = Projections.glossary(bank);
		assertThat(glossary).isEqualToNormalizingNewlines(Files.readString(BOOK.resolve("bank.md")));
	}

	@Test
	public void saveAsXmi(@TempDir Path directory) throws IOException {
		// tag::xmi[]
		ResourceSet resourceSet = resourceSet();
		Package bank = (Package) resourceSet.getResource(BANK, true).getContents().getFirst();
		URI xmi = URI.createFileURI(directory.resolve("bank.xml").toString());
		Resource copy = resourceSet.createResource(xmi);
		copy.getContents().add(bank);                                           // <1>
		copy.save(null);
		assertThat(Files.readString(directory.resolve("bank.xml")))
			.contains("party.nmeta#//Party");                                   // <2>
		// end::xmi[]

		Package loaded = (Package) resourceSet().getResource(xmi, true).getContents().getFirst();
		ClassifierReference party = (ClassifierReference) feature((Class) classifier(loaded, "Customer"), "party").getType();
		assertThat(party.getTarget().getName()).isEqualTo("Party");
	}

	/**
	 * The library's vocabulary, built in Java, is compared with the reviewed file the book includes.
	 */
	@Test
	public void writeLibrary(@TempDir Path directory) throws IOException {
		// tag::write[]
		Package library = Vocabulary.library();
		String text = MetaWriter.write(library);                                // <1>

		URI uri = URI.createFileURI(directory.resolve("library.nmeta").toString());
		Resource resource = resourceSet().createResource(uri);
		resource.getContents().add(library);
		resource.save(null);                                                    // <2>
		// end::write[]
		assertThat(text).isEqualToNormalizingNewlines(Files.readString(BOOK.resolve("library.nmeta")));
		assertThat(Files.readString(directory.resolve("library.nmeta"))).isEqualTo(text);

		Package loaded = (Package) resourceSet().getResource(uri, true).getContents().getFirst();
		assertThat(MetaWriter.write(loaded)).isEqualTo(text);
	}

	@Test
	public void bankReadsBackTheSame() throws IOException {
		ResourceSet resourceSet = resourceSet();
		Package bank = (Package) resourceSet.getResource(BANK, true).getContents().getFirst();
		String written = MetaWriter.write(bank);
		assertThat(written).contains("import \"https://example.org/vocabulary/party\" as party");
		assertThat(written).contains("    @occupancy.Presence { jurisdiction: \"CA-QC\" }\n");

		Resource copy = resourceSet.createResource(URI.createURI("copy.nmeta"));
		copy.load(new ByteArrayInputStream(written.getBytes(StandardCharsets.UTF_8)), null);
		Package read = (Package) copy.getContents().getFirst();
		assertThat(MetaWriter.write(read)).isEqualTo(written);
		Class customer = (Class) classifier(read, "Customer");
		ClassifierReference party = (ClassifierReference) feature(customer, "party").getType();
		assertThat(party.getTarget().eResource().getURI().lastSegment()).isEqualTo("party.nmeta");
	}

}
