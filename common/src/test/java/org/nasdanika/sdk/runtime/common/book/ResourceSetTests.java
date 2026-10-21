package org.nasdanika.sdk.runtime.common.book;

import static org.assertj.core.api.Assertions.assertThat;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceFactoryImpl;
import org.junit.jupiter.api.Test;
import org.nasdanika.sdk.runtime.common.NasdanikaResourceSet;
import org.nasdanika.sdk.runtime.common.services.ResourceSetContributor;

import io.opentelemetry.api.logs.Logger;
import io.opentelemetry.api.trace.Span;

/**
 * Resource sets configured from what is on the module path, URI handlers and globals.
 */
class ResourceSetTests {

	@Test
	void classpathAndModuleURIs() {
		// tag::uris[]
		ResourceSet resourceSet = NasdanikaResourceSet.createAndConfigure(); // <1>

		URI classpath = URI.createURI("classpath://book-data/library.ecore"); // <2>
		EPackage library = (EPackage) resourceSet.getResource(classpath, true).getContents().get(0);
		assertThat(library.getEClassifier("Book")).isNotNull();

		URI module = URI.createURI("module://org.nasdanika.sdk.runtime.common/book-data/library.ecore");
		Resource resource = resourceSet.getResource(module, true); // <3>
		assertThat(((EPackage) resource.getContents().get(0)).getNsURI())
			.isEqualTo("urn:example:library");
		// end::uris[]
	}

	// tag::contributor[]
	public static class XmlContributor implements ResourceSetContributor {

		@Override
		public void contribute(ResourceSet resourceSet, Span span, Logger logger) {
			resourceSet
				.getResourceFactoryRegistry()
				.getExtensionToFactoryMap()
				.put("xml", new XMLResourceFactoryImpl()); // <1>
		}

	}
	// end::contributor[]

	@Test
	void contributor() {
		// tag::contributor-test[]
		ResourceSet resourceSet = NasdanikaResourceSet.createAndConfigure();
		new XmlContributor().contribute(resourceSet); // <1>
		Resource resource = resourceSet.createResource(URI.createURI("memory:/books.xml"));
		assertThat(resource).isInstanceOf(org.eclipse.emf.ecore.xmi.XMLResource.class);
		// end::contributor-test[]
	}

	@Test
	void globals() {
		// tag::globals[]
		NasdanikaResourceSet resourceSet = NasdanikaResourceSet.createAndConfigure();
		EClass book = EcoreFactory.eINSTANCE.createEClass();
		book.setName("Book");
		URI uri = URI.createURI("urn:example:library#Book");
		resourceSet.registerGlobal(uri, book); // <1>
		assertThat(resourceSet.getEObject(uri, false)).isSameAs(book);
		// end::globals[]

		// Objects resolved through resources are not made global
		URI classpath = URI.createURI("classpath://book-data/library.ecore#//Author");
		EObject author = resourceSet.getEObject(classpath, true);
		assertThat(author).isNotNull();
		assertThat(resourceSet.getGlobals()).containsOnlyKeys(uri);
	}

}
