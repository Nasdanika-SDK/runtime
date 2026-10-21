package org.nasdanika.sdk.runtime.playwright;

import java.nio.file.Path;
import java.util.Locale;

import org.nasdanika.sdk.runtime.common.telemetry.Telemetry;
import org.nasdanika.sdk.runtime.harness.Server;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.ConsoleMessage;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

import io.opentelemetry.api.common.Attributes;
import io.opentelemetry.api.logs.Logger;
import io.opentelemetry.api.logs.Severity;

/**
 * A browser session of a {@link Browsing} body: the Playwright objects, steps, and screenshots.
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

	private final Server server;
	private final Options options;
	private final Playwright playwright;
	private final Browser browser;
	private final BrowserContext context;
	private final Page page;
	private final Logger logger;
	private int steps;
	private int screenshots;

	Session(Server server, Options options, Playwright playwright, Browser browser, BrowserContext context, Page page) {
		this.server = server;
		this.options = options;
		this.playwright = playwright;
		this.browser = browser;
		this.context = context;
		this.page = page;
		logger = Telemetry.logger(server.openTelemetry());
		page.onConsoleMessage(this::console);
		page.onPageError(error -> Telemetry.log(
				logger,
				Severity.ERROR,
				Browsing.PAGE_ERROR_EVENT,
				error,
				Attributes.of(Browsing.URL_FULL, page.url())));
	}

	public Server server() {
		return server;
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
		int index = ++steps;
		Telemetry.inSpan(Telemetry.tracer(server.openTelemetry()), name, Attributes.of(Browsing.STEP_INDEX, (long) index), span -> {
			if (options.stepScreenshots() == Options.StepScreenshots.BEFORE_AND_AFTER && !"about:blank".equals(page.url())) {
				take(name, "before");
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
		Telemetry.log(
				logger,
				Severity.INFO,
				Browsing.SCREENSHOT_EVENT,
				name,
				Attributes.builder()
					.put(Browsing.SCREENSHOT_NAME, name)
					.put(Browsing.SCREENSHOT_PATH, fileName)
					.put(Browsing.SCREENSHOT_PHASE, phase)
					.put(Browsing.SCREENSHOT_INDEX, (long) index)
					.put(Browsing.URL_FULL, page.url())
					.build());
		return file;
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
