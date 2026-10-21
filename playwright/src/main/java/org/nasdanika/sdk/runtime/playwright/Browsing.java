package org.nasdanika.sdk.runtime.playwright;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.file.Files;
import java.util.HashMap;
import java.util.Map;

import org.nasdanika.sdk.runtime.common.telemetry.Telemetry;
import org.nasdanika.sdk.runtime.harness.Server;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.Route;

import io.opentelemetry.api.common.AttributeKey;
import io.opentelemetry.api.common.Attributes;
import io.opentelemetry.api.common.AttributesBuilder;
import io.opentelemetry.context.Context;

/**
 * Runs code that drives a browser against a {@link Server} of the harness, in the trace of the
 * server: the code runs in a span, each {@link Session#step(String, Session.StepBody) step} is a
 * child span, and every request the browser sends to the server carries the current span, so the
 * server's spans are children of the step that caused them.
 *
 * <pre>
 * Harness.inServer("Library", routes -&gt; ..., server -&gt; Browsing.inBrowser(server, session -&gt; {
 *     session.step("Open the catalog", () -&gt; session.page().navigate("/"));
 *     session.step("Search", () -&gt; session.page().getByLabel("Title").fill("Dune"));
 *     return null;
 * }));
 * </pre>
 *
 * Screenshots, those steps take and those taken with {@link Session#screenshot(String)}, are
 * written to a directory and reported as log records in the span they were taken in, with the
 * file's path as an attribute: a recorded trace says what the page looked like at each step. The
 * browser's console messages and page errors are log records too.
 *
 * <p>
 * The trace context is added to requests to the server only, never to requests to other origins,
 * such as content delivery networks, which have no use for it.
 */
public final class Browsing {

	/**
	 * Event name of the log record of a screenshot.
	 */
	public static final String SCREENSHOT_EVENT = "nasdanika.screenshot";

	/**
	 * Event name of the log record of a {@link Narration}. The body is the text.
	 */
	public static final String NARRATION_EVENT = "nasdanika.narration";

	/**
	 * The narration's language, a BCP 47 tag.
	 */
	public static final AttributeKey<String> NARRATION_LANGUAGE = AttributeKey.stringKey("nasdanika.narration.language");

	/**
	 * The voice to speak the narration with.
	 */
	public static final AttributeKey<String> NARRATION_VOICE = AttributeKey.stringKey("nasdanika.narration.voice");

	/**
	 * Silence after the narration, in milliseconds.
	 */
	public static final AttributeKey<Long> NARRATION_PAUSE = AttributeKey.longKey("nasdanika.narration.pause_ms");

	/**
	 * The position of a narration line in the session, from 1.
	 */
	public static final AttributeKey<Long> NARRATION_INDEX = AttributeKey.longKey("nasdanika.narration.index");

	/**
	 * Event name of the log record of a browser console message.
	 */
	public static final String CONSOLE_EVENT = "nasdanika.browser.console";

	/**
	 * Event name of the log record of an uncaught error in the page.
	 */
	public static final String PAGE_ERROR_EVENT = "nasdanika.browser.page_error";

	/**
	 * The screenshot's name, as given.
	 */
	public static final AttributeKey<String> SCREENSHOT_NAME = AttributeKey.stringKey("nasdanika.screenshot.name");

	/**
	 * The screenshot file, relative to the screenshots directory, with forward slashes.
	 */
	public static final AttributeKey<String> SCREENSHOT_PATH = AttributeKey.stringKey("nasdanika.screenshot.path");

	/**
	 * {@code before}, {@code after} or {@code failure} for a screenshot a step took,
	 * {@code explicit} for one taken with {@link Session#screenshot(String)}.
	 */
	public static final AttributeKey<String> SCREENSHOT_PHASE = AttributeKey.stringKey("nasdanika.screenshot.phase");

	/**
	 * The position of a screenshot in the session, from 1.
	 */
	public static final AttributeKey<Long> SCREENSHOT_INDEX = AttributeKey.longKey("nasdanika.screenshot.index");

	/**
	 * The position of a step in the session, from 1.
	 */
	public static final AttributeKey<Long> STEP_INDEX = AttributeKey.longKey("nasdanika.step.index");

	/**
	 * The page's URL when a screenshot was taken or a message logged.
	 */
	public static final AttributeKey<String> URL_FULL = AttributeKey.stringKey("url.full");

	public static final AttributeKey<String> BROWSER_NAME = AttributeKey.stringKey("browser.name");

	public static final AttributeKey<String> BROWSER_VERSION = AttributeKey.stringKey("browser.version");

	public static final AttributeKey<String> BROWSER_CHANNEL = AttributeKey.stringKey("nasdanika.browser.channel");

	private Browsing() {
		// Utility
	}

	/**
	 * Code to run with a browser.
	 *
	 * @param <T> Result type
	 * @param <E> Exception type
	 */
	@FunctionalInterface
	public interface BrowserBody<T, E extends Throwable> {

		T run(Session session) throws E;

	}

	/**
	 * With {@link Options#DEFAULT}.
	 */
	public static <T, E extends Throwable> T inBrowser(Server server, BrowserBody<T, E> body) throws E {
		return inBrowser(server, Options.DEFAULT, body);
	}

	/**
	 * Starts Playwright and a browser, opens a page whose relative URLs resolve against the
	 * server's base, runs the body in a {@code Browser} span, and closes everything.
	 */
	public static <T, E extends Throwable> T inBrowser(Server server, Options options, BrowserBody<T, E> body) throws E {
		try {
			Files.createDirectories(options.screenshots());
		} catch (IOException e) {
			throw new UncheckedIOException(e);
		}
		Map<String, String> environment = new HashMap<>();
		if (options.channel() != null) {
			// An installed browser: Playwright's own is not needed
			environment.put("PLAYWRIGHT_SKIP_BROWSER_DOWNLOAD", "1");
		}
		try (Playwright playwright = Playwright.create(new Playwright.CreateOptions().setEnv(environment));
				Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions()
						.setChannel(options.channel())
						.setHeadless(options.headless()));
				BrowserContext context = browser.newContext(new Browser.NewContextOptions()
						.setBaseURL(server.base().toString())
						.setViewportSize(options.width(), options.height()))) {

			// Requests to the server carry the span current when the browser sends them: Playwright
			// calls handlers on the thread that is waiting in a Playwright call, the test's thread
			context.route(server.base() + "**", route -> propagate(server, route));

			AttributesBuilder attributes = Attributes.builder()
					.put(BROWSER_NAME, browser.browserType().name())
					.put(BROWSER_VERSION, browser.version());
			if (options.channel() != null) {
				attributes.put(BROWSER_CHANNEL, options.channel());
			}
			return Telemetry.inSpan(Telemetry.tracer(server.openTelemetry()), "Browser", attributes.build(), span -> {
				Page page = context.newPage();
				Session session = new Session(server, options, playwright, browser, context, page);
				return body.run(session);
			});
		}
	}

	private static void propagate(Server server, Route route) {
		Map<String, String> headers = new HashMap<>(route.request().headers());
		headers.putAll(server.propagationHeaders(Context.current()));
		route.resume(new Route.ResumeOptions().setHeaders(headers));
	}

}
