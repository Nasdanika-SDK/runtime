package org.nasdanika.sdk.runtime.drawio.tests.book;

import java.net.URL;
import java.util.List;

import org.jsoup.Jsoup;
import org.nasdanika.sdk.runtime.drawio.Document;
import org.nasdanika.sdk.runtime.drawio.ModelElement;

/**
 * Loads the diagrams of the Draw.io Zephyr Book. They are PNG images with the diagram embedded, so
 * the figure a reader sees in the book is the document a test loads.
 */
public final class Diagrams {

	private Diagrams() {
		// Static helpers
	}

	// tag::load[]
	/**
	 * Loads the diagram embedded in a PNG image next to this class.
	 */
	public static Document load(String name) throws Exception {
		URL resource = Diagrams.class.getResource(name);
		List<Document> documents = Document.loadFromPngMetadata(resource); // <1>
		if (documents.size() != 1) {
			throw new IllegalArgumentException(name + " embeds " + documents.size() + " diagrams");
		}
		return documents.getFirst();
	}
	// end::load[]

	// tag::text[]
	/**
	 * Labels of elements with html=1 in their style are HTML. This is the text a reader sees.
	 */
	public static String text(ModelElement<?> element) {
		String label = element.getLabel();
		return label == null ? null : Jsoup.parse(label).text();
	}
	// end::text[]

}
