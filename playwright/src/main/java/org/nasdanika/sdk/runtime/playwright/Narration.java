package org.nasdanika.sdk.runtime.playwright;

import java.time.Duration;
import java.util.Objects;

/**
 * What a person would say about a walk-through at a point in it: the script of a video, the text
 * of a guide. Recorded by {@link Session#narrate(Narration)} as a log record in the current span,
 * in order with the session's screenshots.
 *
 * <p>
 * A narration line is spoken over the last screenshot taken before it; a line before the first
 * screenshot of a session, over the first one. So a step narrated as it starts is spoken over its
 * "before" screenshot, while the page shows what the step is about to change.
 *
 * @param text What is said
 * @param language A BCP 47 language tag such as {@code en} or {@code en-US}, for walk-throughs
 * narrated in several languages and for speech synthesis. Null if unspecified
 * @param voice A voice for speech synthesis, by the name a renderer knows it. Null for the default
 * @param pause Silence after the line. Null for none
 */
public record Narration(String text, String language, String voice, Duration pause) {

	public Narration {
		Objects.requireNonNull(text, "text");
		if (pause != null && pause.isNegative()) {
			throw new IllegalArgumentException("Negative pause: " + pause);
		}
	}

	public static Narration of(String text) {
		return new Narration(text, null, null, null);
	}

	public Narration withLanguage(String language) {
		return new Narration(text, language, voice, pause);
	}

	public Narration withVoice(String voice) {
		return new Narration(text, language, voice, pause);
	}

	public Narration withPause(Duration pause) {
		return new Narration(text, language, voice, pause);
	}

}
