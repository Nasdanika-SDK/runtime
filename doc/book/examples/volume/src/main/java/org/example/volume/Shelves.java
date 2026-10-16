package org.example.volume;

import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.example.library.Library;
import org.nasdanika.sdk.runtime.common.NasdanikaResourceSet;
import org.nasdanika.sdk.runtime.common.telemetry.Telemetry;
import org.nasdanika.sdk.runtime.common.telemetry.TelemetryURIHandler;
import org.nasdanika.sdk.runtime.volume.Content;
import org.nasdanika.sdk.runtime.volume.Volume;
import org.nasdanika.sdk.runtime.volume.emf.VolumeURIHandler;

/**
 * Models stored in a volume: URIs are the models' identity, paths in the volume are where
 * the bytes happen to be.
 */
public final class Shelves {

	private Shelves() {
	}

	// tag::uri-handler[]
	public static final URI BASE = URI.createURI("library://shelves/");

	/**
	 * A resource set whose library:// URIs are paths in the volume.
	 */
	public static ResourceSet resourceSet(Volume volume) {
		ResourceSet resourceSet = NasdanikaResourceSet.createAndConfigure();
		URIConverter converter = resourceSet.getURIConverter();
		converter.getURIHandlers().add(0, new VolumeURIHandler(volume, BASE));    // <1>
		TelemetryURIHandler.wrapAll(converter, () -> Telemetry.of(resourceSet)); // <2>
		return resourceSet;
	}

	public static void save(Library library, Volume volume, String path) throws IOException {
		URI uri = BASE.appendSegments(path.split("/"));                           // <3>
		Resource resource = resourceSet(volume).createResource(uri);
		resource.getContents().add(library);
		resource.save(null);                                                      // <4>
	}

	public static Library load(Volume volume, String path) {
		URI uri = BASE.appendSegments(path.split("/"));
		Resource resource = resourceSet(volume).getResource(uri, true);
		return (Library) resource.getContents().getFirst();
	}
	// end::uri-handler[]

	// tag::content[]
	/**
	 * Copies a model as content produced by a writer: nothing is serialized until the target
	 * volume reads the content, and it is serialized straight into the target's stream.
	 */
	public static void copy(Resource resource, Volume target, String path) throws IOException {
		Content content = Content.ofWriter(out -> resource.save(out, null));      // <1>
		Volume.Writable writable = target.capability(Volume.Writable.class)       // <2>
				.orElseThrow(() -> new IOException("Read-only volume"));
		writable.write(path, content);                                             // <3>
	}
	// end::content[]

}
