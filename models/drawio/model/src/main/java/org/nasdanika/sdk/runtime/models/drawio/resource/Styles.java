package org.nasdanika.sdk.runtime.models.drawio.resource;

import java.util.Map;

import org.eclipse.emf.common.util.EMap;

/**
 * Draw.io style strings and the style map of {@link org.nasdanika.sdk.runtime.models.drawio.ModelElement}:
 * {@code rounded=1;fillColor=#dae8fc;} is the map {@code rounded -> 1, fillColor -> #dae8fc}, in
 * that order. A key without a value, such as {@code ellipse} in {@code ellipse;whiteSpace=wrap;},
 * has a null value. A value may contain {@code =}, as data URIs of images do.
 */
public final class Styles {

	private Styles() {
		// Static helpers
	}

	/**
	 * The style as Draw.io writes it, each entry followed by a semicolon.
	 *
	 * @return An empty string for no entries
	 */
	public static String format(Iterable<? extends Map.Entry<String, String>> style) {
		StringBuilder text = new StringBuilder();
		for (Map.Entry<String, String> entry : style) {
			text.append(entry.getKey());
			if (entry.getValue() != null) {
				text.append('=').append(entry.getValue());
			}
			text.append(';');
		}
		return text.toString();
	}

	/**
	 * Adds the entries of a style string to a map, in order. Later entries with the same key
	 * replace earlier ones, as in Draw.io.
	 *
	 * @param style May be null or blank
	 */
	public static void parse(String style, EMap<String, String> target) {
		if (style == null) {
			return;
		}
		for (String entry : style.split(";")) {
			if (entry.isBlank()) {
				continue;
			}
			int equals = entry.indexOf('=');
			if (equals == -1) {
				target.put(entry, null);
			} else {
				target.put(entry.substring(0, equals), entry.substring(equals + 1));
			}
		}
	}

}
