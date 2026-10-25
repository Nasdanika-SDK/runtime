package org.nasdanika.sdk.runtime.drawio.playwright;

import java.nio.file.Path;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.function.Function;

import org.nasdanika.sdk.runtime.common.telemetry.Telemetry;
import org.nasdanika.sdk.runtime.drawio.Document;
import org.nasdanika.sdk.runtime.drawio.Page;
import org.nasdanika.sdk.runtime.playwright.Browsing;
import org.nasdanika.sdk.runtime.playwright.Options;

import io.opentelemetry.api.OpenTelemetry;

/**
 * Renders draw.io documents with draw.io's own viewer, in a browser driven by Playwright: pages
 * as PNG or SVG images with the page embedded, so draw.io can open the image for editing, and
 * videos of pages shown in sequence.
 *
 * <pre>
 * Rendering.DEFAULT.png(document, Path.of("diagram.png"));
 * Rendering.DEFAULT.svg(Pages.byName(document, "Context", "Containers"), dir, Rendering.fileNames(".svg"));
 * Rendering.DEFAULT.video(Path.of("tour.webm"), List.of(Frame.of(context, Duration.ofSeconds(3)), ...));
 * </pre>
 *
 * Each rendering is a browser session, {@link Browsing#inBrowser(OpenTelemetry, Options, Browsing.BrowserBody)
 * without a server}, in a {@code Browser} span, with a step span per page. A {@link PageBody} can
 * interact with a page before it is rendered, for example click a shape that runs custom actions,
 * and take more pictures. {@link #inViewer(Document, ViewerBody)} gives full control.
 *
 * @param openTelemetry Receives the spans and log records of the sessions. Null for the
 * {@link Telemetry#current() current} one
 * @param browser The browser, its viewport and scale, and the video file and screenshots directory
 * of sessions run with {@link #inViewer(Document, ViewerBody)}. Rendering sets the video itself.
 * The scale is the scale of PNG images: 2 for twice as many pixels in each direction
 * @param viewer URL of draw.io's viewer script. It is downloaded once per JVM and served to the
 * browser from memory
 * @param border Space around the diagram in PNG and SVG images, in pixels
 * @param embed Embed the page in PNG and SVG images as a single-page document, as draw.io's
 * editable exports do
 */
public record Rendering(
		OpenTelemetry openTelemetry,
		Options browser,
		String viewer,
		int border,
		boolean embed) {

	/**
	 * The body of a rendering session.
	 */
	@FunctionalInterface
	public interface ViewerBody<T, E extends Throwable> {

		T run(Viewer viewer) throws E;

	}

	/**
	 * What to do with a page once the viewer shows it, before it is rendered or, in a video,
	 * while it is shown.
	 */
	@FunctionalInterface
	public interface PageBody<E extends Throwable> {

		void run(Viewer viewer, Page page) throws E;

	}

	/**
	 * Playwright's Chromium, headless, a 1280 by 800 viewport, scale 1, no step screenshots, the
	 * viewer from jsDelivr, a border of 10 pixels, pages embedded.
	 */
	public static final Rendering DEFAULT = new Rendering(
			null,
			Options.DEFAULT.withStepScreenshots(Options.StepScreenshots.NONE),
			Document.JSDELIVR_DRAWIO_VIEWER,
			10,
			true);

	public Rendering {
		Objects.requireNonNull(browser, "browser");
		Objects.requireNonNull(viewer, "viewer");
		if (border < 0) {
			throw new IllegalArgumentException("Negative border: " + border);
		}
	}

	public Rendering withOpenTelemetry(OpenTelemetry openTelemetry) {
		return new Rendering(openTelemetry, browser, viewer, border, embed);
	}

	public Rendering withBrowser(Options browser) {
		return new Rendering(openTelemetry, browser, viewer, border, embed);
	}

	public Rendering withViewer(String viewer) {
		return new Rendering(openTelemetry, browser, viewer, border, embed);
	}

	public Rendering withBorder(int border) {
		return new Rendering(openTelemetry, browser, viewer, border, embed);
	}

	/**
	 * The browser's scale: 2 for PNG images with twice as many pixels in each direction.
	 */
	public Rendering withScale(double scale) {
		return withBrowser(browser.withScale(scale));
	}

	public Rendering withEmbed(boolean embed) {
		return new Rendering(openTelemetry, browser, viewer, border, embed);
	}

	/**
	 * Opens the document in the viewer, on its first page, and runs the body.
	 */
	public <T, E extends Throwable> T inViewer(Document document, ViewerBody<T, E> body) throws E {
		return inViewer(document, browser, false, body);
	}

	private <T, E extends Throwable> T inViewer(Document document, Options options, boolean fit, ViewerBody<T, E> body) throws E {
		OpenTelemetry otel = openTelemetry == null ? Telemetry.current() : openTelemetry;
		return Browsing.inBrowser(otel, options, session -> body.run(Viewer.open(session, document, this, fit)));
	}

	// --- PNG

	/**
	 * The first page of the document, which is usually its only one.
	 *
	 * @return The file
	 */
	public Path png(Document document, Path file) {
		return png(document.getPages().getFirst(), file);
	}

	public Path png(Page page, Path file) {
		return png(List.of(page), parent(file), _ -> file.getFileName().toString()).getFirst();
	}

	/**
	 * @param pages Pages of one document
	 * @param fileName The name of a page's file, resolved against the directory. See {@link #fileNames(String)}
	 * @return The files, in the order of the pages
	 */
	public List<Path> png(List<Page> pages, Path directory, Function<? super Page, String> fileName) {
		return png(pages, directory, fileName, null);
	}

	/**
	 * @param body Runs once the viewer shows a page, before the picture is taken. Null for none
	 */
	public <E extends Throwable> List<Path> png(List<Page> pages, Path directory, Function<? super Page, String> fileName, PageBody<E> body) throws E {
		return render(pages, directory, fileName, body, Viewer::png);
	}

	// --- SVG

	public Path svg(Document document, Path file) {
		return svg(document.getPages().getFirst(), file);
	}

	public Path svg(Page page, Path file) {
		return svg(List.of(page), parent(file), _ -> file.getFileName().toString()).getFirst();
	}

	public List<Path> svg(List<Page> pages, Path directory, Function<? super Page, String> fileName) {
		return svg(pages, directory, fileName, null);
	}

	/**
	 * SVG as draw.io exports it: labels with HTML are {@code foreignObject} elements, which browsers
	 * draw and some other renderers do not.
	 */
	public <E extends Throwable> List<Path> svg(List<Page> pages, Path directory, Function<? super Page, String> fileName, PageBody<E> body) throws E {
		return render(pages, directory, fileName, body, Viewer::svg);
	}

	private <E extends Throwable> List<Path> render(
			List<Page> pages,
			Path directory,
			Function<? super Page, String> fileName,
			PageBody<E> body,
			java.util.function.BiFunction<Viewer, Path, Path> writer) throws E {

		Document document = document(pages);
		return inViewer(document, viewer -> {
			List<Path> files = new ArrayList<>();
			for (Page page : pages) {
				Path file = directory.resolve(fileName.apply(page));
				viewer.session().step(name(page), () -> {
					viewer.show(page);
					if (body != null) {
						body.run(viewer, page);
					}
					files.add(writer.apply(viewer, file));
				});
			}
			return files;
		});
	}

	// --- Video

	/**
	 * Records the pages of the frames in sequence, each fit to the viewport and centered, for the
	 * frame's duration, and saves the video, WebM. The video starts with the viewer loading, a
	 * fraction of a second; the trace has each frame's offset into it, on its step span.
	 *
	 * @param frames Pages of one document
	 * @return The file
	 */
	public Path video(Path file, List<Frame> frames) {
		Document document = document(frames.stream().map(Frame::page).toList());
		return inViewer(document, browser.withVideo(file), true, viewer -> {
			for (Frame frame : frames) {
				viewer.session().step(name(frame.page()), () -> {
					viewer.show(frame.page());
					if (frame.body() != null) {
						frame.body().run(viewer, frame.page());
					}
					viewer.session().pause(frame.duration());
				});
			}
			return file;
		});
	}

	/**
	 * Frames of the same length, a page each.
	 */
	public Path video(Path file, List<Page> pages, Duration duration) {
		return video(file, pages.stream().map(page -> Frame.of(page, duration)).toList());
	}

	// --- File names

	/**
	 * A file name per page: its name in lower case, words joined by hyphens, or its id if it has
	 * no name, followed by the extension.
	 *
	 * @param extension Such as {@code ".png"}
	 */
	public static Function<Page, String> fileNames(String extension) {
		return page -> slug(name(page)) + extension;
	}

	static String name(Page page) {
		String name = page.getName();
		return name == null || name.isBlank() ? page.getId() : name;
	}

	static String slug(String name) {
		String slug = name.toLowerCase(Locale.ROOT).replaceAll("[^a-z0-9]+", "-").replaceAll("(^-+|-+$)", "");
		return slug.isEmpty() ? "page" : slug;
	}

	private static Path parent(Path file) {
		Path parent = file.toAbsolutePath().getParent();
		return parent == null ? Path.of("") : parent;
	}

	private static Document document(List<Page> pages) {
		if (pages.isEmpty()) {
			throw new IllegalArgumentException("No pages");
		}
		Document document = pages.getFirst().getDocument();
		for (Page page : pages) {
			if (page.getDocument() != document) {
				throw new IllegalArgumentException("Pages of different documents: " + name(page));
			}
		}
		return document;
	}

}
