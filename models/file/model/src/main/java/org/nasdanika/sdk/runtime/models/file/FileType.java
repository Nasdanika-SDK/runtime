package org.nasdanika.sdk.runtime.models.file;

import java.util.List;
import java.util.Optional;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.resource.ContentHandler;

/**
 * A {@link java.util.ServiceLoader} service:
 * registration is a lookup by type alone, so it is a Java service, not a capability.
 *
 * Maps a content type to the EClass that represents files of that type. Classification uses EMF's
 * {@link ContentHandler} registry: the extension first, because on a remote backend inspecting
 * content means fetching the blob, and the content only when the extension is ambiguous (an
 * {@code .xml} file whose root element decides the model, a {@code .json} file whose
 * {@code $schema} does). One content type then selects both the file's EClass and the resource
 * factory that loads it as a model, through {@code ResourceSet.createResource(URI, String)}.
 *
 * Examples: the Draw.io module contributes {@code DrawioFile}, the Xcore support contributes
 * {@code XcoreFile}. Unknown content types fall back to {@code TextFile} when the content is text
 * and to {@code File} otherwise.
 */
public interface FileType {

	/** The EMF content type identifier. Not a MIME type. */
	String contentType();

	/** The EClass instantiated for files of this type: {@code TextFile} or a subclass of {@code File}. */
	EClass eClass();

	/** Extensions recognized without reading content, lower case, without the dot. */
	List<String> extensions();

	/**
	 * A handler for content inspection, for types the extension alone cannot decide, for example a
	 * {@code RootXMLContentHandlerImpl} matching a root element and namespace. Registered with the
	 * resource set's URI converter, so classification and resource loading agree.
	 */
	default Optional<ContentHandler> contentHandler() {
		return Optional.empty();
	}

	/** What the HTTP handler sends as {@code Content-Type}. */
	Optional<String> mimeType();

	/**
	 * True for text types. For types no registered file type claims, the fallback is Git's
	 * heuristic: binary if a NUL byte appears in the first 8,000 bytes.
	 */
	boolean text();

	/** Higher wins when two file types claim the same extension or content. */
	default int priority() {
		return 0;
	}

}
