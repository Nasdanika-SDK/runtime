package org.nasdanika.sdk.runtime.playwright.tests;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import java.nio.file.Path;
import java.time.Duration;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.Stream;

import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.nasdanika.sdk.runtime.harness.Harness;
import org.nasdanika.sdk.runtime.models.telemetry.AnyValue;
import org.nasdanika.sdk.runtime.models.telemetry.KeyValue;
import org.nasdanika.sdk.runtime.models.telemetry.exporters.Recording;
import org.nasdanika.sdk.runtime.models.telemetry.logs.LogRecord;
import org.nasdanika.sdk.runtime.models.telemetry.traces.Span;
import org.nasdanika.sdk.runtime.models.telemetry.traces.SpanKind;
import org.nasdanika.sdk.runtime.models.telemetry.traces.StatusCode;
import org.nasdanika.sdk.runtime.playwright.Browsing;
import org.nasdanika.sdk.runtime.playwright.Narration;
import org.nasdanika.sdk.runtime.playwright.Options;

import io.opentelemetry.api.OpenTelemetry;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

/**
 * A walk-through of the catalog: steps, screenshots, and the server's spans in one trace.
 */
class WalkthroughTests {

	/**
	 * The browser the tests drive, from the {@code nasdanika.playwright.channel} system property:
	 * an installed browser, or Playwright's Chromium if empty.
	 */
	static Options options(Path screenshots) {
		String channel = System.getProperty("nasdanika.playwright.channel", "chrome");
		return Options.DEFAULT
			.withChannel(channel.isBlank() ? null : channel)
			.withScreenshots(screenshots)
			.withViewport(800, 500);
	}

	// tag::skip[]
	@BeforeAll
	static void browserAvailable() {
		Options options = options(Path.of("target"));
		Map<String, String> environment = options.channel() == null
			? Map.of()
			: Map.of("PLAYWRIGHT_SKIP_BROWSER_DOWNLOAD", "1"); // An installed browser
		var create = new Playwright.CreateOptions().setEnv(environment);
		var launch = new BrowserType.LaunchOptions().setChannel(options.channel());
		try (Playwright playwright = Playwright.create(create);
				Browser browser = playwright.chromium().launch(launch)) {
			// Available
		} catch (RuntimeException e) {
			Assumptions.abort("No browser to drive: " + e.getMessage());
		}
	}
	// end::skip[]

	static Stream<Span> descendants(Span span) {
		return Stream.concat(Stream.of(span), span.getChildren().stream().flatMap(WalkthroughTests::descendants));
	}

	static Span span(Recording recording, String name) {
		return recording.getTraces().getResourceSpans().stream()
			.flatMap(r -> r.getScopeSpans().stream())
			.flatMap(s -> s.getSpans().stream())
			.flatMap(WalkthroughTests::descendants)
			.filter(s -> s.getName().equals(name))
			.findFirst()
			.orElseThrow(() -> new AssertionError("No span " + name));
	}

	static String attribute(LogRecord record, String key) {
		return record.getAttributes().stream()
			.filter(a -> a.getKey().equals(key))
			.map(KeyValue::getValue)
			.map(AnyValue::getStringValue)
			.findFirst()
			.orElse(null);
	}

	/**
	 * The parts of a recorded walk-through that do not change from run to run: the spans of the
	 * body and the steps, the screenshots and narration in their order, the console messages, and the server spans
	 * for data, with their log records. Static files are left out: the browser loads them in
	 * parallel, and may ask for a favicon at any time.
	 */
	static String outline(Span span, String indent) {
		StringBuilder outline = new StringBuilder(indent).append(span.getName()).append('\n');
		String inner = indent + "  ";
		for (LogRecord log : span.getLogRecords()) {
			String path = attribute(log, Browsing.SCREENSHOT_PATH.getKey());
			if (path != null) {
				outline.append(inner).append("screenshot ").append(path).append('\n');
			} else if (Browsing.NARRATION_EVENT.equals(log.getEventName())) {
				outline.append(inner).append("narration ").append(log.getBody().getStringValue()).append('\n');
			}
		}
		for (LogRecord log : span.getLogRecords()) {
			if (Browsing.CONSOLE_EVENT.equals(log.getEventName())) {
				outline.append(inner).append("console ").append(log.getBody().getStringValue()).append('\n');
			}
		}
		span.getChildren().stream()
			.filter(child -> child.getKind() != SpanKind.SPAN_KIND_SERVER || child.getName().equals("GET /data"))
			.sorted(java.util.Comparator.comparingLong(Span::getStartTimeUnixNano))
			.forEach(child -> {
				if (child.getKind() == SpanKind.SPAN_KIND_SERVER) {
					String logs = child.getLogRecords().stream()
						.map(log -> log.getBody().getStringValue())
						.collect(java.util.stream.Collectors.joining("; "));
					outline.append(inner).append(child.getName()).append(": ").append(logs).append('\n');
				} else {
					outline.append(outline(child, inner));
				}
			});
		return outline.toString();
	}

	static String expectedOutline() {
		try (var in = WalkthroughTests.class.getResourceAsStream("/walkthrough-outline.txt")) {
			return new String(in.readAllBytes(), java.nio.charset.StandardCharsets.UTF_8).replace("\r\n", "\n");
		} catch (java.io.IOException e) {
			throw new java.io.UncheckedIOException(e);
		}
	}

	@Test
	void walkthrough() {
		Path dir = Path.of("target", "walkthrough");
		// tag::walkthrough[]
		Recording recording = Recording.builder()
			.serviceName("catalog")
			.directory(dir, "yml") // <1>
			.build();
		try (recording) {
			Harness.inServer(recording.getOpenTelemetry(), "Catalog", Catalog::routes, server ->
				Browsing.inBrowser(server, options(dir), session -> { // <2>
					Page page = session.page();
					session.step("Open the catalog", "The catalog lists the library's books.", () -> {
						page.navigate("/index.html"); // <3>
						assertThat(page.locator("#books li")).hasCount(4);
					});
					session.step("Search for Dune", "Type a title to narrow the list.", () -> {
						page.getByLabel("Title").fill("dune");
						assertThat(page.locator("#books li")).hasCount(1); // <4>
					});
					session.step("Open Dune", "Click a title to see its author.", () -> {
						page.getByText("Dune").click();
						assertThat(page.locator("#book-author")).hasText("Frank Herbert");
					});
					return null;
				}));
		}
		// end::walkthrough[]

		// tag::model[]
		Span search = span(recording, "Search for Dune");
		assertThat(search.getLogRecords()) // <1>
			.extracting(log -> log.getBody().getStringValue())
			.containsExactly("Search for Dune", "Type a title to narrow the list.", "Search for Dune");
		assertThat(search.getLogRecords())
			.extracting(log -> attribute(log, Browsing.SCREENSHOT_PATH.getKey()))
			.containsExactly("002-search-for-dune-before.png", null, "003-search-for-dune-after.png");

		Span served = search.getChildren().getFirst(); // <2>
		assertThat(served.getName()).isEqualTo("GET /data");
		assertThat(served.getKind()).isEqualTo(SpanKind.SPAN_KIND_SERVER);
		assertThat(served.getLogRecords())
			.singleElement()
			.extracting(log -> log.getBody().getStringValue())
			.isEqualTo("Searching for 'dune'");
		// end::model[]

		assertThat(dir.resolve("003-search-for-dune-after.png")).exists();
		assertThat(outline(span(recording, "Catalog"), "")).isEqualTo(expectedOutline());
		assertThat(dir.resolve("traces.yml")).exists();
		Span open = span(recording, "Open the catalog");
		assertThat(descendants(open))
			.filteredOn(s -> s.getKind() == SpanKind.SPAN_KIND_SERVER)
			.extracting(Span::getName)
			.contains("GET /", "GET /data");
		assertThat(open.getLogRecords())
			.extracting(log -> log.getBody().getStringValue())
			.contains("Catalog ready", "Open the catalog"); // The console message, and the "after" screenshot
	}

	@Test
	void failingStep() {
		Path dir = Path.of("target", "failing-step");
		// tag::failure[]
		Recording recording = Recording.builder().directory(dir, "yml").build();
		try (recording) {
			Harness.inServer(recording.getOpenTelemetry(), "Catalog", Catalog::routes, server ->
				Browsing.inBrowser(server, options(dir), session -> {
					session.step("Open the catalog", () -> session.page().navigate("/index.html"));
					assertThatThrownBy(() -> session.step("Click a missing button", () -> {
						Locator missing = session.page().locator("#missing");
						missing.click(new Locator.ClickOptions().setTimeout(500));
					})).hasMessageContaining("Timeout");
					return null;
				}));
		}
		Span failed = span(recording, "Click a missing button");
		assertThat(failed.getStatus().getCode()).isEqualTo(StatusCode.STATUS_CODE_ERROR); // <1>
		assertThat(failed.getLogRecords())
			.extracting(log -> attribute(log, Browsing.SCREENSHOT_PHASE.getKey()))
			.containsExactly("before", "failure"); // <2>
		// end::failure[]
	}

	@Test
	void otherOriginsGetNoTraceContext() {
		Path dir = Path.of("target", "origins");
		// tag::origins[]
		List<String> received = new CopyOnWriteArrayList<>();
		Recording recording = Recording.builder().directory(dir, "yml").build();
		try (recording) {
			OpenTelemetry otel = recording.getOpenTelemetry();
			Harness.inServer(otel, "Other origin", other -> other.createContext("/", exchange -> {
				received.add(String.valueOf(exchange.getRequestHeaders().getFirst("traceparent")));
				exchange.getResponseHeaders().set("Access-Control-Allow-Origin", "*");
				exchange.sendResponseHeaders(204, -1);
				exchange.close();
			}), otherServer -> Harness.inServer(otel, "Catalog", Catalog::routes, server ->
				Browsing.inBrowser(server, options(dir), session -> {
					session.page().navigate("/index.html");
					String ping = otherServer.uri("/ping").toString();
					session.page().evaluate("url => fetch(url).then(r => r.status)", ping); // <1>
					return null;
				})));
		}
		assertThat(received).containsExactly("null"); // <2>
		assertThat(span(recording, "Browser").getChildren()) // <3>
			.extracting(Span::getName)
			.contains("GET /");
		// end::origins[]
	}

	@Test
	void narration() {
		Path dir = Path.of("target", "narration");
		// tag::narration[]
		Recording recording = Recording.builder().directory(dir, "yml").build();
		try (recording) {
			Harness.inServer(recording.getOpenTelemetry(), "Catalog", Catalog::routes, server ->
				Browsing.inBrowser(server, options(dir), session -> {
					Page page = session.page();
					session.step("Open the catalog", () -> page.navigate("/index.html"));
					session.step("Search for Solaris", () -> {
						session.narrate("Type the title."); // <1>
						page.getByLabel("Title").fill("solaris");
						assertThat(page.locator("#books li")).hasCount(1);
						session.narrate(Narration.of("Une seule réponse.") // <2>
							.withLanguage("fr")
							.withVoice("narrator-2")
							.withPause(Duration.ofSeconds(2)));
					});
					return null;
				}));
		}
		Span search = span(recording, "Search for Solaris");
		assertThat(search.getLogRecords()) // <3>
			.extracting(LogRecord::getEventName)
			.containsExactly(
				Browsing.SCREENSHOT_EVENT, // before
				Browsing.NARRATION_EVENT,
				Browsing.NARRATION_EVENT,
				Browsing.SCREENSHOT_EVENT); // after
		LogRecord french = search.getLogRecords().get(2);
		assertThat(attribute(french, Browsing.NARRATION_LANGUAGE.getKey())).isEqualTo("fr");
		assertThat(attribute(french, Browsing.NARRATION_VOICE.getKey())).isEqualTo("narrator-2");
		// end::narration[]
		assertThat(french.getAttributes())
			.filteredOn(a -> a.getKey().equals(Browsing.NARRATION_PAUSE.getKey()))
			.singleElement()
			.satisfies(a -> assertThat(a.getValue().getIntValue()).isEqualTo(2000L));
	}

	static long longAttribute(Span span, String key) {
		return span.getAttributes().stream()
			.filter(a -> a.getKey().equals(key))
			.mapToLong(a -> a.getValue().getIntValue())
			.findFirst()
			.orElseThrow(() -> new AssertionError("No attribute " + key + " on " + span.getName()));
	}

	@Test
	void video() throws Exception {
		Path dir = Path.of("target", "video");
		// tag::video[]
		Recording recording = Recording.builder().directory(dir, "yml").build();
		try (recording) {
			Harness.inServer(recording.getOpenTelemetry(), "Catalog", Catalog::routes, server ->
				Browsing.inBrowser(server, options(dir).withVideo(dir.resolve("catalog.webm")), session -> { // <1>
					Page page = session.page();
					session.step("Open the catalog", () -> page.navigate("/index.html"));
					session.step("Search for Dune", () -> {
						page.getByLabel("Title").fill("dune");
						assertThat(page.locator("#books li")).hasCount(1);
					});
					session.pause(Duration.ofMillis(500)); // <2>
					session.step("Open Dune", () -> page.getByText("Dune").click());
					return null;
				}));
		}
		assertThat(dir.resolve("catalog.webm")).isNotEmptyFile(); // <3>

		LogRecord started = span(recording, "Browser").getLogRecords().stream() // <4>
			.filter(log -> Browsing.VIDEO_EVENT.equals(log.getEventName()))
			.findFirst()
			.orElseThrow();
		Span searchStep = span(recording, "Search for Dune");
		long search = longAttribute(searchStep, Browsing.VIDEO_OFFSET.getKey()); // <5>
		long open = longAttribute(span(recording, "Open Dune"), Browsing.VIDEO_OFFSET.getKey());
		Span served = searchStep.getChildren().getFirst(); // GET /data, the search on the server
		long servedAt = (served.getStartTimeUnixNano() - started.getObservedTimeUnixNano()) / 1_000_000; // <6>
		assertThat(servedAt).isBetween(search - 50, open);
		// end::video[]
		assertThat(attribute(started, Browsing.VIDEO_PATH.getKey())).endsWith("video/catalog.webm");
		assertThat(open - search).isGreaterThanOrEqualTo(500);
		try (var files = java.nio.file.Files.list(dir)) {
			assertThat(files.map(Path::getFileName).map(Path::toString)).noneMatch(name -> name.startsWith(".video"));
		}
	}

	@Test
	void withoutServer() {
		Path dir = Path.of("target", "without-server");
		// tag::without-server[]
		Recording recording = Recording.builder().directory(dir, "yml").build();
		try (recording) {
			Browsing.inBrowser(recording.getOpenTelemetry(), options(dir), session -> { // <1>
				session.page().setContent("<h1>Hello</h1>");
				session.screenshot("Hello");
				return null;
			});
		}
		assertThat(span(recording, "Browser").getLogRecords())
			.extracting(log -> attribute(log, Browsing.SCREENSHOT_PATH.getKey()))
			.containsExactly("001-hello-explicit.png");
		// end::without-server[]
	}

}
