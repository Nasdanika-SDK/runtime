package org.nasdanika.sdk.runtime.models.diagram.elk;

/**
 * Estimates the size of text, for nodes without bounds and for labels.
 * ELK reserves room for labels by their size, so the estimate should be close to what the renderer
 * draws: a little too large leaves gaps, too small makes labels overlap.
 */
@FunctionalInterface
public interface TextMeasurer {

	/**
	 * @return width and height, in diagram units
	 */
	double[] measure(String text);

	/**
	 * An estimate that needs no fonts: an average character width and a line height.
	 * 7 by 16 suits 12 pixel sans serif text, the default of React Flow and close to Draw.io's.
	 */
	static TextMeasurer estimate(double characterWidth, double lineHeight) {
		return text -> {
			if (text == null || text.isEmpty()) {
				return new double[] { 0, 0 };
			}
			String[] lines = text.split("\\R");
			int longest = 0;
			for (String line: lines) {
				longest = Math.max(longest, line.length());
			}
			return new double[] { longest * characterWidth, lines.length * lineHeight };
		};
	}

	TextMeasurer DEFAULT = estimate(7, 16);

}
