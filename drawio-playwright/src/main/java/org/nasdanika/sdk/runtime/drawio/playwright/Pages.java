package org.nasdanika.sdk.runtime.drawio.playwright;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;

import org.nasdanika.sdk.runtime.drawio.Document;
import org.nasdanika.sdk.runtime.drawio.Page;

/**
 * Pages of a document to render, picked by id or by name, in the order given.
 */
public final class Pages {

	private Pages() {
		// Static helpers
	}

	/**
	 * @throws IllegalArgumentException If the document has no page with one of the ids
	 */
	public static List<Page> byId(Document document, String... ids) {
		return select(document, Document::getPageById, "id", ids);
	}

	/**
	 * @throws IllegalArgumentException If the document has no page with one of the names
	 */
	public static List<Page> byName(Document document, String... names) {
		return select(document, Document::getPageByName, "name", names);
	}

	/**
	 * All pages, in the document's order.
	 */
	public static List<Page> all(Document document) {
		return List.copyOf(document.getPages());
	}

	private static List<Page> select(Document document, BiFunction<Document, String, Page> lookup, String by, String... keys) {
		List<Page> pages = new ArrayList<>();
		for (String key : keys) {
			Page page = lookup.apply(document, key);
			if (page == null) {
				throw new IllegalArgumentException("No page with " + by + " '" + key + "' in " + document.getURI());
			}
			pages.add(page);
		}
		return pages;
	}

}
