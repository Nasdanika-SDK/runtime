package org.nasdanika.sdk.runtime.drawio.playwright.tests;

import static org.assertj.core.api.Assertions.assertThat;

import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.Duration;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.nasdanika.sdk.runtime.drawio.Document;
import org.nasdanika.sdk.runtime.drawio.Page;
import org.nasdanika.sdk.runtime.drawio.playwright.Frame;
import org.nasdanika.sdk.runtime.drawio.playwright.Pages;
import org.nasdanika.sdk.runtime.drawio.playwright.Rendering;
import org.nasdanika.sdk.runtime.playwright.Options;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Playwright;

/**
 * Renders the pages of a three-page document with draw.io's viewer: PNG and SVG images with the
 * page embedded, several pages at once, a page after clicking a button, and a video.
 */
public class TestDrawioPlaywright {

	static final Path OUTPUT = Path.of("target", "rendering");

	/**
	 * The rendering the tests use: the browser from the {@code nasdanika.playwright.channel}
	 * system property, an installed one or Playwright's Chromium if empty.
	 */
	static Rendering rendering() {
		String channel = System.getProperty("nasdanika.playwright.channel", "chrome");
		Options browser = Rendering.DEFAULT.browser()
			.withChannel(channel.isBlank() ? null : channel)
			.withScreenshots(OUTPUT.resolve("screenshots"));
		return Rendering.DEFAULT.withBrowser(browser);
	}

	@BeforeAll
	static void browserAvailable() {
		Options options = rendering().browser();
		Map<String, String> environment = options.channel() == null ? Map.of() : Map.of("PLAYWRIGHT_SKIP_BROWSER_DOWNLOAD", "1");
		try (Playwright playwright = Playwright.create(new Playwright.CreateOptions().setEnv(environment));
				Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setChannel(options.channel()))) {
			// Available
		} catch (RuntimeException e) {
			Assumptions.abort("No browser to drive: " + e.getMessage());
		}
	}

	static Document banking() throws Exception {
		return Document.load(TestDrawioPlaywright.class.getResource("banking.drawio"));
	}

	@Test
	public void testPng() throws Exception {
		// tag::png[]
		Document document = Document.load(TestDrawioPlaywright.class.getResource("banking.drawio"));
		Path file = rendering().png(document, OUTPUT.resolve("context.png")); // <1>

		try (InputStream in = Files.newInputStream(file)) {
			List<Document> embedded = Document.loadFromPngMetadata(in, null); // <2>
			assertThat(embedded).singleElement()
				.extracting(d -> d.getPages().getFirst().getName())
				.isEqualTo("Context");
		}
		// end::png[]
		try (InputStream in = Files.newInputStream(file)) {
			Document embedded = Document.loadFromPngMetadata(in, null).getFirst();
			assertThat(embedded.getPages()).hasSize(1);
			assertThat(embedded.getModelElementById("banking")).isNotNull();
		}
	}

	@Test
	public void testSvg() throws Exception {
		Document document = banking();
		// tag::svg[]
		Page containers = document.getPageByName("Containers");
		Path file = rendering().svg(containers, OUTPUT.resolve("containers.svg"));

		try (InputStream in = Files.newInputStream(file)) {
			Document embedded = Document.loadFromSvg(in, null); // <1>
			assertThat(embedded.getPages()).singleElement().extracting(Page::getName).isEqualTo("Containers");
		}
		// end::svg[]
		assertThat(Files.readString(file)).startsWith("<?xml").contains("<svg", "data-cell-id=\"api\"");
	}

	@Test
	public void testPages() throws Exception {
		Document document = banking();
		// tag::pages[]
		List<Page> pages = Pages.byName(document, "Context", "Containers"); // <1>
		List<Path> files = rendering()
			.withScale(2) // <2>
			.png(pages, OUTPUT.resolve("pages"), Rendering.fileNames(".png")); // <3>
		assertThat(files).extracting(f -> f.getFileName().toString()).containsExactly("context.png", "containers.png");
		// end::pages[]
		assertThat(Pages.byId(document, "payment")).extracting(Page::getName).containsExactly("Payment");
	}

	@Test
	public void testCallback() throws Exception {
		Document document = banking();
		// tag::callback[]
		Path directory = OUTPUT.resolve("payment");
		Rendering rendering = rendering().withScale(2);
		List<Page> pages = Pages.byName(document, "Payment");
		List<Path> files = rendering.png(pages, directory, Rendering.fileNames("-after.png"), (viewer, page) -> {
			viewer.png(directory.resolve("payment-before.png")); // <1>
			viewer.click("pay-button"); // <2>
			viewer.session().pause(Duration.ofMillis(1500)); // <3>
		});
		// end::callback[]
		assertThat(directory.resolve("payment-before.png")).isNotEmptyFile();
		assertThat(files).singleElement().satisfies(f -> assertThat(f).isNotEmptyFile());
		assertThat(Files.size(files.getFirst())).isNotEqualTo(Files.size(directory.resolve("payment-before.png")));
	}

	@Test
	public void testVideo() throws Exception {
		Document document = banking();
		// tag::video[]
		Page context = document.getPageByName("Context");
		Page containers = document.getPageByName("Containers");
		Page payment = document.getPageByName("Payment");
		Path video = rendering().video(OUTPUT.resolve("tour.webm"), List.of(
				Frame.of(context, Duration.ofSeconds(2)), // <1>
				Frame.of(containers, Duration.ofSeconds(2)),
				Frame.of(payment, Duration.ofSeconds(3), (viewer, page) -> viewer.click("pay-button")))); // <2>
		assertThat(video).isNotEmptyFile();
		// end::video[]
	}

}
