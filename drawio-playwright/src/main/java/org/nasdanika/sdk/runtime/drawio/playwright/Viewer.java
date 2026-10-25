package org.nasdanika.sdk.runtime.drawio.playwright;

import java.io.IOException;
import java.io.InputStream;
import java.io.UncheckedIOException;
import java.net.URI;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;

import org.json.JSONObject;
import org.nasdanika.sdk.runtime.drawio.Document;
import org.nasdanika.sdk.runtime.drawio.ModelElement;
import org.nasdanika.sdk.runtime.drawio.Page;
import org.nasdanika.sdk.runtime.playwright.Session;

import com.microsoft.playwright.Route;

/**
 * A draw.io document open in draw.io's viewer, in the page of a browser {@link Session}: shows a
 * page, clicks shapes, and takes PNG and SVG pictures of the page shown.
 *
 * <p>
 * The viewer is in the browser's global variable {@value #VARIABLE}, a {@code GraphViewer}, for
 * scripts that need more of it: {@code window.nasdanikaViewer.graph} is its graph.
 */
public final class Viewer {

	/**
	 * The global variable of the viewer in the browser.
	 */
	public static final String VARIABLE = "nasdanikaViewer";

	private static final Map<String, byte[]> SCRIPTS = new ConcurrentHashMap<>();

	private final Session session;
	private final Document document;
	private final Rendering rendering;
	private final boolean fit;
	private Page page;

	private Viewer(Session session, Document document, Rendering rendering, boolean fit) {
		this.session = session;
		this.document = document;
		this.rendering = rendering;
		this.fit = fit;
	}

	/**
	 * Loads the viewer with the document in the session's page, showing the first page.
	 *
	 * @param fit Fit pages to the viewport and center them, for videos
	 */
	static Viewer open(Session session, Document document, Rendering rendering, boolean fit) {
		Viewer viewer = new Viewer(session, document, rendering, fit);
		viewer.load();
		return viewer;
	}

	private void load() {
		byte[] script = script(rendering.viewer());
		if (script != null) {
			// Served from memory: one download per JVM, not one per session
			session.page().route(url -> url.equals(rendering.viewer()), route -> route.fulfill(new Route.FulfillOptions()
					.setStatus(200)
					.setContentType("application/javascript")
					.setBodyBytes(script)));
		}
		session.page().setContent(html());
		session.page().waitForFunction("() => window." + VARIABLE + " && window." + VARIABLE + ".graph");
		page = document.getPages().getFirst();
		if (fit) {
			fit();
		}
	}

	private static byte[] script(String url) {
		try {
			return SCRIPTS.computeIfAbsent(url, u -> {
				try (InputStream in = URI.create(u).toURL().openStream()) {
					return in.readAllBytes();
				} catch (IOException e) {
					throw new UncheckedIOException(e);
				}
			});
		} catch (UncheckedIOException | IllegalArgumentException e) {
			return null; // The browser loads it
		}
	}

	private String html() {
		JSONObject config = new JSONObject();
		config.put("xml", save(document));
		config.put("page", 0);
		config.put("nav", false);
		config.put("resize", true);
		config.put("lightbox", false);
		config.put("border", rendering.border());
		config.put("check-visible-state", false); // Render into a container that has no size yet
		String style = fit
				? "html,body{margin:0;padding:0;background:#fff;overflow:hidden}body{display:flex;align-items:center;justify-content:center;width:100vw;height:100vh}"
				: "html,body{margin:0;padding:0;background:#fff}";
		return "<!DOCTYPE html><html><head><meta charset=\"utf-8\"><style>" + style + "</style></head><body>"
				+ "<div id=\"diagram\" style=\"display:inline-block\" data-mxgraph=\"" + escape(config.toString()) + "\"></div>"
				+ "<script src=\"" + escape(rendering.viewer()) + "\"></script>"
				+ "<script>GraphViewer.createViewerForElement(document.getElementById('diagram'), function(viewer) { window."
				+ VARIABLE + " = viewer; });</script>"
				+ "</body></html>";
	}

	private static String escape(String text) {
		return text.replace("&", "&amp;").replace("\"", "&quot;").replace("<", "&lt;").replace(">", "&gt;");
	}

	private static String save(Document document) {
		try {
			return document.save(true);
		} catch (TransformerException e) {
			throw new IllegalStateException(e);
		} catch (IOException e) {
			throw new UncheckedIOException(e);
		}
	}

	public Session session() {
		return session;
	}

	public Document document() {
		return document;
	}

	/**
	 * The page shown.
	 */
	public Page page() {
		return page;
	}

	/**
	 * Shows a page of the document.
	 */
	public void show(Page page) {
		int index = document.getPages().indexOf(page);
		if (index < 0) {
			throw new IllegalArgumentException("Not a page of the document: " + Rendering.name(page));
		}
		session.page().evaluate("index => window." + VARIABLE + ".selectPage(index)", index);
		this.page = page;
		if (fit) {
			fit();
		}
	}

	private void fit() {
		session.page().evaluate("""
				() => {
					const container = document.getElementById('diagram');
					container.style.transform = '';
					const bounds = container.getBoundingClientRect();
					const scale = Math.min(2, window.innerWidth / bounds.width, window.innerHeight / bounds.height);
					container.style.transform = 'scale(' + scale + ')';
				}""");
	}

	/**
	 * Clicks the shape of a cell of the page shown, in its middle, as a person would: a shape with
	 * a link or custom actions runs them.
	 *
	 * @throws IllegalArgumentException If the cell is not shown
	 */
	public void click(String cellId) {
		Object center = session.page().evaluate("""
				id => {
					const graph = window.%s.graph;
					const state = graph.view.getState(graph.model.getCell(id));
					if (state == null || state.shape == null || state.shape.node == null) {
						return null;
					}
					const bounds = state.shape.node.getBoundingClientRect();
					return [bounds.x + bounds.width / 2, bounds.y + bounds.height / 2];
				}""".formatted(VARIABLE), cellId);
		if (!(center instanceof List<?> xy)) {
			throw new IllegalArgumentException("Cell " + cellId + " is not shown on page " + Rendering.name(page));
		}
		session.page().mouse().click(((Number) xy.get(0)).doubleValue(), ((Number) xy.get(1)).doubleValue());
	}

	public void click(ModelElement<?> element) {
		click(element.getId());
	}

	/**
	 * A PNG picture of the page shown, cropped to the diagram and its border, with the page
	 * embedded if the rendering says so.
	 */
	public byte[] png() {
		@SuppressWarnings("unchecked")
		Map<String, Number> clip = (Map<String, Number>) session.page().evaluate("""
				border => {
					const viewer = window.%s;
					const container = viewer.graph.container;
					const rect = container.getBoundingClientRect();
					const scale = rect.width / container.offsetWidth;
					const bounds = viewer.graph.getGraphBounds();
					const x = Math.max(0, Math.floor(rect.left + (bounds.x - border) * scale));
					const y = Math.max(0, Math.floor(rect.top + (bounds.y - border) * scale));
					return {
						x: x + window.scrollX,
						y: y + window.scrollY,
						width: Math.ceil((bounds.width + 2 * border) * scale),
						height: Math.ceil((bounds.height + 2 * border) * scale)
					};
				}""".formatted(VARIABLE), rendering.border());
		byte[] png = session.page().screenshot(new com.microsoft.playwright.Page.ScreenshotOptions()
				.setFullPage(true)
				.setClip(
						clip.get("x").doubleValue(),
						clip.get("y").doubleValue(),
						clip.get("width").doubleValue(),
						clip.get("height").doubleValue()));
		if (!rendering.embed()) {
			return png;
		}
		try {
			return pageDocument().embedInPng(png, true);
		} catch (TransformerException e) {
			throw new IllegalStateException(e);
		} catch (IOException e) {
			throw new UncheckedIOException(e);
		}
	}

	/**
	 * Writes {@link #png()} to a file, creating its directory.
	 *
	 * @return The file
	 */
	public Path png(Path file) {
		return write(file, png());
	}

	/**
	 * The page shown as SVG, as draw.io exports it, with the page embedded in the {@code content}
	 * attribute of the root element if the rendering says so: draw.io opens such a file for
	 * editing, and {@link Document#loadFromSvg(java.net.URL)} loads it.
	 */
	public String svg() {
		String content = rendering.embed() ? save(pageDocument()) : null;
		String svg = (String) session.page().evaluate("""
				([border, content]) => {
					const graph = window.%s.graph;
					const svg = graph.getSvg(null, 1, border, false, null, true, null, null, '_blank');
					if (content != null) {
						svg.setAttribute('content', content);
					}
					return mxUtils.getXml(svg);
				}""".formatted(VARIABLE), Arrays.asList(rendering.border(), content));
		return "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" + svg;
	}

	/**
	 * Writes {@link #svg()} to a file, creating its directory.
	 *
	 * @return The file
	 */
	public Path svg(Path file) {
		return write(file, svg().getBytes(StandardCharsets.UTF_8));
	}

	/**
	 * The page shown, as a document of its own: what an image of it embeds.
	 */
	private Document pageDocument() {
		if (document.getPages().size() == 1) {
			return document;
		}
		try {
			Document single = Document.create(true, document.getURI());
			single.getPages().add(page); // A copy
			return single;
		} catch (ParserConfigurationException e) {
			throw new IllegalStateException(e);
		}
	}

	private static Path write(Path file, byte[] content) {
		try {
			Path parent = file.toAbsolutePath().getParent();
			if (parent != null) {
				Files.createDirectories(parent);
			}
			Files.write(file, content);
			return file;
		} catch (IOException e) {
			throw new UncheckedIOException(e);
		}
	}

}
