package org.nasdanika.sdk.runtime.drawio.playwright;

import java.time.Duration;
import java.util.Objects;

import org.nasdanika.sdk.runtime.drawio.Page;

/**
 * A page of a {@link Rendering#video(java.nio.file.Path, java.util.List) video}, shown for a time.
 *
 * @param page The page
 * @param duration How long the page is shown after the body has run
 * @param body Runs once the viewer shows the page, for example to click a shape that runs custom
 * actions. Null for none
 */
public record Frame(Page page, Duration duration, Rendering.PageBody<? extends RuntimeException> body) {

	public Frame {
		Objects.requireNonNull(page, "page");
		Objects.requireNonNull(duration, "duration");
		if (duration.isNegative()) {
			throw new IllegalArgumentException("Negative duration: " + duration);
		}
	}

	public static Frame of(Page page, Duration duration) {
		return new Frame(page, duration, null);
	}

	public static Frame of(Page page, Duration duration, Rendering.PageBody<? extends RuntimeException> body) {
		return new Frame(page, duration, body);
	}

}
