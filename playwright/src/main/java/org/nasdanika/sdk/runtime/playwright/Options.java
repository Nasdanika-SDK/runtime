package org.nasdanika.sdk.runtime.playwright;

import java.nio.file.Path;
import java.util.Objects;

/**
 * How {@link Browsing} runs a browser, takes screenshots and records video.
 *
 * @param channel A browser installed on the machine, such as {@code chrome} or {@code msedge}.
 * Null for the Chromium that Playwright downloads on first use
 * @param headless Without a window
 * @param width Viewport width in CSS pixels
 * @param height Viewport height in CSS pixels
 * @param scale Device scale factor: 2 for screenshots and videos with twice as many pixels in each
 * direction as CSS pixels
 * @param screenshots Directory screenshots are written to, created if it does not exist
 * @param stepScreenshots Screenshots a step takes by itself
 * @param fullPage Screenshots of the full scrollable page rather than the viewport
 * @param video File the session's video is saved to, WebM, at the viewport's size. Null for no
 * video
 */
public record Options(
		String channel,
		boolean headless,
		int width,
		int height,
		double scale,
		Path screenshots,
		StepScreenshots stepScreenshots,
		boolean fullPage,
		Path video) {

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

	public static final Options DEFAULT = new Options(null, true, 1280, 800, 1, Path.of("target", "screenshots"), StepScreenshots.BEFORE_AND_AFTER, false, null);

	public Options {
		Objects.requireNonNull(screenshots, "screenshots");
		Objects.requireNonNull(stepScreenshots, "stepScreenshots");
		if (width <= 0 || height <= 0) {
			throw new IllegalArgumentException("Viewport must not be empty: " + width + "x" + height);
		}
		if (scale <= 0) {
			throw new IllegalArgumentException("Scale must be positive: " + scale);
		}
	}

	public Options withChannel(String channel) {
		return new Options(channel, headless, width, height, scale, screenshots, stepScreenshots, fullPage, video);
	}

	public Options withHeadless(boolean headless) {
		return new Options(channel, headless, width, height, scale, screenshots, stepScreenshots, fullPage, video);
	}

	public Options withViewport(int width, int height) {
		return new Options(channel, headless, width, height, scale, screenshots, stepScreenshots, fullPage, video);
	}

	public Options withScale(double scale) {
		return new Options(channel, headless, width, height, scale, screenshots, stepScreenshots, fullPage, video);
	}

	public Options withScreenshots(Path screenshots) {
		return new Options(channel, headless, width, height, scale, screenshots, stepScreenshots, fullPage, video);
	}

	public Options withStepScreenshots(StepScreenshots stepScreenshots) {
		return new Options(channel, headless, width, height, scale, screenshots, stepScreenshots, fullPage, video);
	}

	public Options withFullPage(boolean fullPage) {
		return new Options(channel, headless, width, height, scale, screenshots, stepScreenshots, fullPage, video);
	}

	/**
	 * @param video Null for no video
	 */
	public Options withVideo(Path video) {
		return new Options(channel, headless, width, height, scale, screenshots, stepScreenshots, fullPage, video);
	}

}
