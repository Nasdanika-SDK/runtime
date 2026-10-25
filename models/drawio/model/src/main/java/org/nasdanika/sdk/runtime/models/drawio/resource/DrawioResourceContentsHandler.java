package org.nasdanika.sdk.runtime.models.drawio.resource;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Map;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.nasdanika.sdk.runtime.common.capability.emf.ResourceContentsHandler;
import org.nasdanika.sdk.runtime.models.drawio.Document;
import org.xml.sax.SAXException;

/**
 * Loads Draw.io documents into resources as the Draw.io model, with {@link DrawioLoader}, and
 * saves them as Draw.io XML, with {@link DrawioSaver}. The contents of a resource is one
 * {@link Document}.
 *
 * <p>
 * Images with an embedded document, {@code .drawio.png} and {@code .drawio.svg}, are loaded
 * but not saved: an image is a picture of the document, which the model alone cannot draw.
 * Render one with the {@code drawio-playwright} module.
 */
public class DrawioResourceContentsHandler implements ResourceContentsHandler<EObject[]> {

	/**
	 * How the document is stored.
	 */
	public enum Format {

		/** A {@code .drawio} file */
		XML,

		/** A PNG image with the document in a {@code tEXt} chunk, as Draw.io exports it */
		PNG,

		/** An SVG image with the document in the {@code content} attribute of its root element */
		SVG

	}

	private final URI uri;
	private final Format format;

	/**
	 * @param uri The resource's URI, for resolving links to other documents
	 */
	public DrawioResourceContentsHandler(URI uri, Format format) {
		this.uri = uri;
		this.format = format;
	}

	public Format getFormat() {
		return format;
	}

	@Override
	public Order getOrder() {
		return Order.of(0);
	}

	@Override
	public EObject[] load(InputStream inputStream, Map<?, ?> options) throws IOException {
		try {
			org.nasdanika.sdk.runtime.drawio.Document source = switch (format) {
				case XML -> org.nasdanika.sdk.runtime.drawio.Document.load(inputStream, uri);
				case PNG -> {
					List<org.nasdanika.sdk.runtime.drawio.Document> documents = org.nasdanika.sdk.runtime.drawio.Document.loadFromPngMetadata(inputStream, uri);
					if (documents.isEmpty()) {
						throw new IOException("No Draw.io document in " + uri);
					}
					yield documents.getFirst();
				}
				case SVG -> {
					org.nasdanika.sdk.runtime.drawio.Document document = org.nasdanika.sdk.runtime.drawio.Document.loadFromSvg(inputStream, uri);
					if (document == null) {
						throw new IOException("No Draw.io document in " + uri);
					}
					yield document;
				}
			};
			return new EObject[] { new DrawioLoader().load(source) };
		} catch (ParserConfigurationException | SAXException e) {
			throw new IOException("Error loading " + uri + ": " + e, e);
		}
	}

	@Override
	public void save(EObject[] contents, OutputStream outputStream, Map<?, ?> options) throws IOException {
		if (format != Format.XML) {
			throw new UnsupportedOperationException("A Draw.io document is saved as XML, not as " + format + ": " + uri);
		}
		if (contents.length != 1 || !(contents[0] instanceof Document document)) {
			throw new IOException("A Draw.io resource contains one Document: " + uri);
		}
		try {
			String xml = new DrawioSaver().save(document, uri).save(null);
			outputStream.write(xml.getBytes(StandardCharsets.UTF_8));
		} catch (ParserConfigurationException | TransformerException e) {
			throw new IOException("Error saving " + uri + ": " + e, e);
		}
	}

}
