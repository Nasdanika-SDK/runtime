package org.nasdanika.sdk.runtime.models.react.tests;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.file.Path;
import java.time.Duration;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.nasdanika.sdk.runtime.harness.Harness;
import org.nasdanika.sdk.runtime.models.telemetry.exporters.Recording;
import org.nasdanika.sdk.runtime.models.telemetry.traces.Span;
import org.nasdanika.sdk.runtime.models.telemetry.traces.SpanKind;
import org.nasdanika.sdk.runtime.playwright.Browsing;
import org.nasdanika.sdk.runtime.playwright.Options;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

import io.opentelemetry.api.OpenTelemetry;

/**
 * The React page of {@link JvmPropertiesTableTests} in a browser: generated from Java models,
 * served by a harness server, driven by Playwright, and recorded as one trace with screenshots
 * in {@code target/react/jvm-properties-walkthrough}.
 * <p>
 * Needs a browser, the one named by the {@code nasdanika.playwright.channel} system property
 * ({@code chrome} by default, empty for Playwright's Chromium), and internet access, because the
 * page loads React from esm.sh. Skipped otherwise.
 */
public class JvmPropertiesWalkthroughTests {

	private static Options options(Path screenshots) {
		String channel = System.getProperty("nasdanika.playwright.channel", "chrome");
		return Options.DEFAULT
				.withChannel(channel.isBlank() ? null : channel)
				.withScreenshots(screenshots)
				.withViewport(1000, 700);
	}

	@BeforeAll
	static void browserAndNetwork() {
		Options options = options(Path.of("target"));
		Map<String, String> environment = options.channel() == null ? Map.of() : Map.of("PLAYWRIGHT_SKIP_BROWSER_DOWNLOAD", "1");
		try (Playwright playwright = Playwright.create(new Playwright.CreateOptions().setEnv(environment));
				Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setChannel(options.channel()))) {
			// Available
		} catch (RuntimeException e) {
			Assumptions.abort("No browser to drive: " + e.getMessage());
		}
		try (HttpClient client = HttpClient.newBuilder().connectTimeout(Duration.ofSeconds(5)).build()) {
			HttpRequest request = HttpRequest.newBuilder(URI.create("https://esm.sh/")).method("HEAD", HttpRequest.BodyPublishers.noBody()).build();
			client.send(request, HttpResponse.BodyHandlers.discarding());
		} catch (Exception e) {
			Assumptions.abort("esm.sh is not reachable: " + e);
		}
	}

	private static Stream<Span> descendants(Span span) {
		return Stream.concat(Stream.of(span), span.getChildren().stream().flatMap(JvmPropertiesWalkthroughTests::descendants));
	}

	@Test
	public void walkthrough() {
		Path dir = Path.of("target", "react", "jvm-properties-walkthrough");
		// tag::walkthrough[]
		Recording recording = Recording.builder()
				.serviceName("jvm-properties")
				.directory(dir, "yml")
				.build();
		try (recording) {
			OpenTelemetry otel = recording.getOpenTelemetry();
			Harness.inServer(otel, "JVM properties", JvmPropertiesTableTests::routes, server -> // <1>
				Browsing.inBrowser(server, options(dir), session -> {
					Page page = session.page();
					session.step("Open the JVM properties", () -> {
						page.navigate("/index.html");
						page.getByText("Process id").waitFor(); // <2>
					});
					session.step("Reload for fresh numbers", () -> {
						page.reload();
						page.getByText("Free memory").waitFor();
					});
					return null;
				}));
		}
		// end::walkthrough[]

		Span open = recording.getTraces().getResourceSpans().stream()
				.flatMap(r -> r.getScopeSpans().stream())
				.flatMap(s -> s.getSpans().stream())
				.flatMap(JvmPropertiesWalkthroughTests::descendants)
				.filter(s -> "Open the JVM properties".equals(s.getName()))
				.findFirst()
				.orElseThrow();

		// The page, the generated module and the data were served in the step that loaded them
		List<String> served = descendants(open)
				.filter(s -> s.getKind() == SpanKind.SPAN_KIND_SERVER)
				.map(Span::getName)
				.toList();
		assertTrue(served.containsAll(List.of("GET /", "GET /modules/", "GET /data/")), served.toString());
		assertTrue(dir.resolve("001-open-the-jvm-properties-after.png").toFile().isFile());
	}

}
