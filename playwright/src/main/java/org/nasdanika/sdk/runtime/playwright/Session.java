package org.nasdanika.sdk.runtime.playwright;

import java.nio.file.Path;
import java.time.Duration;
import java.util.Locale;

import org.nasdanika.sdk.runtime.common.telemetry.Telemetry;
import org.nasdanika.sdk.runtime.harness.Server;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.ConsoleMessage;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

import io.opentelemetry.api.OpenTelemetry;
import io.opentelemetry.api.common.Attributes;
import io.opentelemetry.api.common.AttributesBuilder;
import io.opentelemetry.api.logs.Logger;
import io.opentelemetry.api.logs.Severity;

/**
 * A browser session of a {@link Browsing} body: the Playwright objects, steps, screenshots,
 * narration and the video.
 */
public final class Session {

	/**
	 * The body of a step.
	 *
	 * @param <E> Exception type
	 */
	@FunctionalInterface
	public interface StepBody<E extends Throwable> {

		void run() throws E;

	}

	private final OpenTelemetry openTelemetry;
	private final Server server;
	private final Options options;
	private final Playwright playwright;
	private final Browser browser;
	private final BrowserContext context;
	private final Page page;
	private final Logger logger;
	private int steps;
	private int screenshots;
	private int narrations;
	private final long videoStart;

	Session(OpenTelemetry openTelemetry, Server server, Options options, Playwright playwright, Browser browser, BrowserContext context, Page page) {
		this.openTelemetry = openTelemetry;
		this.server = server;
		this.options = options;
		this.playwright = playwright;
		this.browser = browser;
		this.context = context;
		this.page = page;
		logger = Telemetry.logger(openTelemetry);
		if (options.video() == null) {
			videoStart = -1;
		} else {
			// The page has just been created, and its recording with it
			videoStart = System.nanoTime();
			String path = options.video().toString().replace('\\', '/');
			Telemetry.log(logger, Severity.INFO, Browsing.VIDEO_EVENT, options.video().getFileName().toString(), Attributes.of(Browsing.VIDEO_PATH, path));
		}
		page.onConsoleMessage(this::console);
		page.onPageError(error -> Telemetry.log(
				logger,
				Severity.ERROR,
				Browsing.PAGE_ERROR_EVENT,
				error,
				Attributes.of(Browsing.URL_FULL, page.url())));
	}

	/**
	 * The server, or null for a session {@link Browsing#inBrowser(OpenTelemetry, Options, Browsing.BrowserBody)
	 * without one}.
	 */
	public Server server() {
		return server;
	}

	/**
	 * Receives the session's spans and log records.
	 */
	public OpenTelemetry openTelemetry() {
		return openTelemetry;
	}

	/**
	 * How far the video has got: the time since the recording started.
	 *
	 * @return Null if the session is not recorded
	 */
	public Duration videoOffset() {
		return videoStart < 0 ? null : Duration.ofNanos(System.nanoTime() - videoStart);
	}

	/**
	 * Waits, so that a video shows what the page shows for a while, for example while a viewer
	 * animates, or long enough to read.
	 */
	public void pause(Duration duration) {
		page.waitForTimeout(duration.toMillis());
	}

	public Options options() {
		return options;
	}

	public Playwright playwright() {
		return playwright;
	}

	public Browser browser() {
		return browser;
	}

	public BrowserContext context() {
		return context;
	}

	/**
	 * The page. Relative URLs passed to {@code navigate} resolve against the server's base.
	 */
	public Page page() {
		return page;
	}

	/**
	 * Runs the body in a span named after the step, with screenshots as the options say: before
	 * and after, after, or none. If the body fails, a screenshot of the failure is taken, and the
	 * failure is recorded on the span and rethrown.
	 */
	public <E extends Throwable> void step(String name, StepBody<E> body) throws E {
		step(name, (Narration) null, body);
	}

	/**
	 * A step narrated as it starts: the narration follows the "before" screenshot, and is spoken
	 * over it.
	 */
	public <E extends Throwable> void step(String name, String narration, StepBody<E> body) throws E {
		step(name, Narration.of(narration), body);
	}

	/**
	 * A step narrated as it starts, with the narration's language, voice or pause.
	 *
	 * @param narration Null for none
	 */
	public <E extends Throwable> void step(String name, Narration narration, StepBody<E> body) throws E {
		int index = ++steps;
		AttributesBuilder stepAttributes = Attributes.builder().put(Browsing.STEP_INDEX, (long) index);
		putVideoOffset(stepAttributes);
		Telemetry.inSpan(Telemetry.tracer(openTelemetry), name, stepAttributes.build(), span -> {
			if (options.stepScreenshots() == Options.StepScreenshots.BEFORE_AND_AFTER && !"about:blank".equals(page.url())) {
				take(name, "before");
			}
			if (narration != null) {
				narrate(narration);
			}
			try {
				body.run();
			} catch (Throwable failure) {
				if (!page.isClosed()) {
					take(name, "failure");
				}
				throw failure;
			}
			if (options.stepScreenshots() != Options.StepScreenshots.NONE) {
				take(name, "after");
			}
			return null;
		});
	}

	/**
	 * Records a line of narration in the current span, in order with the screenshots: the script of
	 * a video, the text of a guide. Spoken over the last screenshot taken before it.
	 */
	public void narrate(String text) {
		narrate(Narration.of(text));
	}

	/**
	 * Records a line of narration with its language, voice or pause.
	 */
	public void narrate(Narration narration) {
		AttributesBuilder attributes = Attributes.builder()
			.put(Browsing.NARRATION_INDEX, (long) ++narrations)
			.put(Browsing.URL_FULL, page.url());
		if (narration.language() != null) {
			attributes.put(Browsing.NARRATION_LANGUAGE, narration.language());
		}
		if (narration.voice() != null) {
			attributes.put(Browsing.NARRATION_VOICE, narration.voice());
		}
		if (narration.pause() != null) {
			attributes.put(Browsing.NARRATION_PAUSE, narration.pause().toMillis());
		}
		putVideoOffset(attributes);
		Telemetry.log(logger, Severity.INFO, Browsing.NARRATION_EVENT, narration.text(), attributes.build());
	}

	/**
	 * Takes a screenshot now, in the current span.
	 *
	 * @return The file
	 */
	public Path screenshot(String name) {
		return take(name, "explicit");
	}

	private Path take(String name, String phase) {
		int index = ++screenshots;
		String fileName = String.format(Locale.ROOT, "%03d-%s-%s.png", index, slug(name), phase);
		Path file = options.screenshots().resolve(fileName);
		page.screenshot(new Page.ScreenshotOptions().setPath(file).setFullPage(options.fullPage()));
		AttributesBuilder attributes = Attributes.builder()
			.put(Browsing.SCREENSHOT_NAME, name)
			.put(Browsing.SCREENSHOT_PATH, fileName)
			.put(Browsing.SCREENSHOT_PHASE, phase)
			.put(Browsing.SCREENSHOT_INDEX, (long) index)
			.put(Browsing.URL_FULL, page.url());
		putVideoOffset(attributes);
		Telemetry.log(logger, Severity.INFO, Browsing.SCREENSHOT_EVENT, name, attributes.build());
		return file;
	}

	private void putVideoOffset(AttributesBuilder attributes) {
		Duration offset = videoOffset();
		if (offset != null) {
			attributes.put(Browsing.VIDEO_OFFSET, offset.toMillis());
		}
	}

	private void console(ConsoleMessage message) {
		Severity severity = switch (message.type()) {
			case "error" -> Severity.ERROR;
			case "warning" -> Severity.WARN;
			case "debug" -> Severity.DEBUG;
			default -> Severity.INFO;
		};
		Telemetry.log(logger, severity, Browsing.CONSOLE_EVENT, message.text(), Attributes.of(Browsing.URL_FULL, page.url()));
	}

	/**
	 * A file name segment: lower case letters and digits, words joined by hyphens.
	 */
	static String slug(String name) {
		String slug = name.toLowerCase(Locale.ROOT).replaceAll("[^a-z0-9]+", "-").replaceAll("(^-+|-+$)", "");
		return slug.isEmpty() ? "screenshot" : slug;
	}

}
