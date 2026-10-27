package org.nasdanika.sdk.runtime.volume.book;

import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.nasdanika.sdk.runtime.common.NasdanikaResourceSet;
import org.nasdanika.sdk.runtime.common.telemetry.Telemetry;
import org.nasdanika.sdk.runtime.common.telemetry.TelemetryURIHandler;
import org.nasdanika.sdk.runtime.volume.Content;
import org.nasdanika.sdk.runtime.volume.Volume;
import org.nasdanika.sdk.runtime.volume.emf.VolumeURIHandler;

/**
 * Models stored in a volume: URIs are the models' identity, paths in the volume are where the
 * bytes happen to be. The model is an Ecore package, so that the book needs no model of its own.
 */
final class Models {

	private Models() {
	}

	// tag::uri-handler[]
	static final URI BASE = URI.createURI("glossary://models/");

	/**
	 * A resource set whose glossary:// URIs are paths in the volume.
	 */
	static ResourceSet resourceSet(Volume volume) {
		ResourceSet resourceSet = NasdanikaResourceSet.createAndConfigure();
		URIConverter converter = resourceSet.getURIConverter();
		converter.getURIHandlers().add(0, new VolumeURIHandler(volume, BASE));    // <1>
		TelemetryURIHandler.wrapAll(converter, () -> Telemetry.of(resourceSet)); // <2>
		return resourceSet;
	}

	static void save(EPackage model, Volume volume, String path) throws IOException {
		URI uri = BASE.appendSegments(path.split("/"));                           // <3>
		Resource resource = resourceSet(volume).createResource(uri);
		resource.getContents().add(model);
		resource.save(null);                                                      // <4>
	}

	static EPackage load(Volume volume, String path) {
		URI uri = BASE.appendSegments(path.split("/"));
		Resource resource = resourceSet(volume).getResource(uri, true);
		return (EPackage) resource.getContents().getFirst();
	}
	// end::uri-handler[]

	// tag::content[]
	/**
	 * Copies a model as content produced by a writer: nothing is serialized until the target
	 * volume reads the content, and it is serialized straight into the target's stream.
	 */
	static void copy(Resource resource, Volume target, String path) throws IOException {
		Content content = Content.ofWriter(out -> resource.save(out, null));      // <1>
		Volume.Writable writable = target.capability(Volume.Writable.class)       // <2>
				.orElseThrow(() -> new IOException("Read-only volume"));
		writable.write(path, content);                                             // <3>
	}
	// end::content[]

	/**
	 * A small model to store: a package with a class per term of the glossary.
	 */
	static EPackage glossary() {
		EPackage ePackage = EcoreFactory.eINSTANCE.createEPackage();
		ePackage.setName("glossary");
		ePackage.setNsPrefix("glossary");
		ePackage.setNsURI("https://example.org/glossary");
		for (String term: GlossaryVolume.terms().keySet()) {
			var eClass = EcoreFactory.eINSTANCE.createEClass();
			eClass.setName(term);
			ePackage.getEClassifiers().add(eClass);
		}
		return ePackage;
	}

}
