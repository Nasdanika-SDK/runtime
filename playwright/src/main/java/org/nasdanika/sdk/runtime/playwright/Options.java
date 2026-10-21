package org.nasdanika.sdk.runtime.playwright;

import java.nio.file.Path;
import java.util.Objects;

/**
 * How {@link Browsing} runs a browser and takes screenshots.
 *
 * @param channel A browser installed on the machine, such as {@code chrome} or {@code msedge}.
 * Null for the Chromium that Playwright downloads on first use
 * @param headless Without a window
 * @param width Viewport width in CSS pixels
 * @param height Viewport height in CSS pixels
 * @param screenshots Directory screenshots are written to, created if it does not exist
 * @param stepScreenshots Screenshots a step takes by itself
 * @param fullPage Screenshots of the full scrollable page rather than the viewport
 */
public record Options(
		String channel,
		boolean headless,
		int width,
		int height,
		Path screenshots,
		StepScreenshots stepScreenshots,
		boolean fullPage) {

	/**
	 * Screenshots a {@link Session#step(String, Session.StepBody) step} takes by itself. A failing
	 * step takes a screenshot of the failure in any case.
	 */
	public enum StepScreenshots {

		NONE,

		AFTER,

		/**
		 * Before and after, as the Nasdanika WebTest did. No "before" of a blank page.
		 */
		BEFORE_AND_AFTER

	}

	public static final Options DEFAULT = new Options(null, true, 1280, 800, Path.of("target", "screenshots"), StepScreenshots.BEFORE_AND_AFTER, false);

	public Options {
		Objects.requireNonNull(screenshots, "screenshots");
		Objects.requireNonNull(stepScreenshots, "stepScreenshots");
		if (width <= 0 || height <= 0) {
			throw new IllegalArgumentException("Viewport must not be empty: " + width + "x" + height);
		}
	}

	public Options withChannel(String channel) {
		return new Options(channel, headless, width, height, screenshots, stepScreenshots, fullPage);
	}

	public Options withHeadless(boolean headless) {
		return new Options(channel, headless, width, height, screenshots, stepScreenshots, fullPage);
	}

	public Options withViewport(int width, int height) {
		return new Options(channel, headless, width, height, screenshots, stepScreenshots, fullPage);
	}

	public Options withScreenshots(Path screenshots) {
		return new Options(channel, headless, width, height, screenshots, stepScreenshots, fullPage);
	}

	public Options withStepScreenshots(StepScreenshots stepScreenshots) {
		return new Options(channel, headless, width, height, screenshots, stepScreenshots, fullPage);
	}

	public Options withFullPage(boolean fullPage) {
		return new Options(channel, headless, width, height, screenshots, stepScreenshots, fullPage);
	}

}
