package org.example.start;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.nasdanika.sdk.runtime.common.NasdanikaResourceSet;

/**
 * A first program: a metamodel built at run time, an instance of it saved in three formats, and
 * one of them loaded back. No generated code, no Eclipse, no configuration files.
 */
public final class FirstModel {

	private FirstModel() {
	}

	// tag::metamodel[]
	/**
	 * A one-class metamodel: a book with a title and a year.
	 */
	public static EPackage libraryPackage() {
		EcoreFactory ecore = EcoreFactory.eINSTANCE;

		EPackage library = ecore.createEPackage();
		library.setName("library");
		library.setNsURI("https://example.org/start/library");
		library.setNsPrefix("library");

		EClass book = ecore.createEClass();
		book.setName("Book");
		library.getEClassifiers().add(book);

		EAttribute title = ecore.createEAttribute();
		title.setName("title");
		title.setEType(EcorePackage.Literals.ESTRING);
		book.getEStructuralFeatures().add(title);

		EAttribute year = ecore.createEAttribute();
		year.setName("year");
		year.setEType(EcorePackage.Literals.EINT);
		book.getEStructuralFeatures().add(year);

		// A package lives in a resource whose URI is its namespace URI, so that instances
		// reference their class as https://example.org/start/library#//Book
		new ResourceImpl(URI.createURI(library.getNsURI())).getContents().add(library);
		return library;
	}
	// end::metamodel[]

	// tag::save[]
	/**
	 * Saves one book as XMI, JSON and YAML.
	 *
	 * @return The saved files
	 */
	public static List<Path> save(EPackage library, Path directory) throws IOException {
		ResourceSet resourceSet = NasdanikaResourceSet.createAndConfigure(); // <1>
		resourceSet.getPackageRegistry().put(library.getNsURI(), library);   // <2>

		EClass bookClass = (EClass) library.getEClassifier("Book");
		EObject book = EcoreUtil.create(bookClass);                           // <3>
		book.eSet(bookClass.getEStructuralFeature("title"),
				"Structure and Interpretation of Computer Programs");
		book.eSet(bookClass.getEStructuralFeature("year"), 1985);

		List<Path> files = new java.util.ArrayList<>();
		for (String extension: List.of("xmi", "json", "yml")) {              // <4>
			Path file = directory.resolve("book." + extension);
			Resource resource = resourceSet.createResource(URI.createFileURI(file.toString()));
			resource.getContents().add(EcoreUtil.copy(book));
			resource.save(null);
			files.add(file);
		}
		return files;
	}
	// end::save[]

	// tag::load[]
	/**
	 * Loads a book saved by {@link #save(EPackage, Path)} and reads its title reflectively.
	 */
	public static String title(EPackage library, Path file) {
		ResourceSet resourceSet = NasdanikaResourceSet.createAndConfigure();
		resourceSet.getPackageRegistry().put(library.getNsURI(), library);
		Resource resource = resourceSet.getResource(URI.createFileURI(file.toString()), true);
		EObject book = resource.getContents().getFirst();
		EStructuralFeature title = book.eClass().getEStructuralFeature("title");
		return (String) book.eGet(title);
	}
	// end::load[]

	public static void main(String[] args) throws IOException {
		Path directory = Files.createTempDirectory("first-model");
		EPackage library = libraryPackage();
		for (Path file: save(library, directory)) {
			System.out.println(file + ": " + title(library, file));
		}
	}

}
