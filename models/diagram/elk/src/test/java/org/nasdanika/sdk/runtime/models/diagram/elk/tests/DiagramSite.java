package org.nasdanika.sdk.runtime.models.diagram.elk.tests;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.nasdanika.sdk.runtime.drawio.Document;
import org.nasdanika.sdk.runtime.models.diagram.Diagram;
import org.nasdanika.sdk.runtime.models.html.Anchor;
import org.nasdanika.sdk.runtime.models.html.Body;
import org.nasdanika.sdk.runtime.models.html.Div;
import org.nasdanika.sdk.runtime.models.html.Head;
import org.nasdanika.sdk.runtime.models.html.Heading;
import org.nasdanika.sdk.runtime.models.html.HtmlFactory;
import org.nasdanika.sdk.runtime.models.html.ImportMap;
import org.nasdanika.sdk.runtime.models.html.ListItem;
import org.nasdanika.sdk.runtime.models.html.Markup;
import org.nasdanika.sdk.runtime.models.html.Meta;
import org.nasdanika.sdk.runtime.models.html.Paragraph;
import org.nasdanika.sdk.runtime.models.html.Script;
import org.nasdanika.sdk.runtime.models.html.Stylesheet;
import org.nasdanika.sdk.runtime.models.html.Text;
import org.nasdanika.sdk.runtime.models.html.UnorderedList;
import org.nasdanika.sdk.runtime.models.html.bootstrap.BootstrapDocument;
import org.nasdanika.sdk.runtime.models.html.bootstrap.BootstrapFactory;
import org.nasdanika.sdk.runtime.models.html.bootstrap.Theme;
import org.nasdanika.sdk.runtime.models.html.bootstrap.generator.BootstrapStructure;
import org.nasdanika.sdk.runtime.models.react.generator.ReactGenerator;

/**
 * A static site of laid out diagrams, each rendered with React Flow and with Draw.io:
 * <ul>
 * <li><code>{name}.html</code> and <code>modules/{name}.js</code>, the React Flow page;</li>
 * <li><code>{name}.drawio</code>, the Draw.io document, and <code>{name}-drawio.html</code>,
 * a page showing it in Draw.io's viewer;</li>
 * <li><code>index.html</code>, links to all of them.</li>
 * </ul>
 * The pages load React, React Flow and Draw.io's viewer from CDNs, so the browser needs internet
 * access. {@link ServeDiagrams} serves the site over HTTP.
 */
final class DiagramSite {

	static final Path SITE = Path.of("target", "diagrams").toAbsolutePath();

	static final String REACT_VERSION = "19.3.0";

	static final String XYFLOW_VERSION = "12.12.0";

	static final String XYFLOW_CSS = "https://cdn.jsdelivr.net/npm/@xyflow/react@" + XYFLOW_VERSION + "/dist/style.css";

	static final Map<String, String> IMPORT_MAP = new LinkedHashMap<>();

	static {
		IMPORT_MAP.put("react", "https://esm.sh/react@" + REACT_VERSION);
		IMPORT_MAP.put("react/jsx-runtime", "https://esm.sh/react@" + REACT_VERSION + "/jsx-runtime");
		IMPORT_MAP.put("react-dom", "https://esm.sh/react-dom@" + REACT_VERSION + "?external=react");
		IMPORT_MAP.put("react-dom/client", "https://esm.sh/react-dom@" + REACT_VERSION + "/client?external=react");
		IMPORT_MAP.put(ReactFlowRenderer.XYFLOW, "https://esm.sh/@xyflow/react@" + XYFLOW_VERSION + "?external=react,react-dom");
	}

	static final String STYLE = """
			html, body, #root { height: 100%; margin: 0; }
			.class-node { width: 100%; height: 100%; display: flex; align-items: center; justify-content: center;
			  border: 1px solid #3459E6; border-radius: 4px; background: #EBEFFC; color: #212529;
			  font-size: 12px; font-weight: 700; }
			.class-node.abstract { font-style: italic; }
			.package-node { width: 100%; height: 100%; border: 1px dashed #6C757D; border-radius: 4px;
			  background: rgba(248, 249, 250, 0.7); }
			.package-title { padding: 8px 12px; font-size: 12px; font-weight: 700; color: #495057; }
			.hidden-handle { opacity: 0; pointer-events: none; }
			.elk-label { position: absolute; font-size: 12px; line-height: 16px; white-space: nowrap;
			  text-align: center; color: #212529; pointer-events: none; }
			.react-flow__edge-path { stroke: #495057; stroke-width: 1.25; }
			.react-flow__edgelabel-renderer { z-index: 1000; }
			""";

	/**
	 * Markers drawn at the ends of edges: a hollow triangle for generalizations, an open arrow for
	 * references, a filled diamond for containment.
	 */
	static final String MARKERS = """
			<svg width="0" height="0" style="position: absolute">
			  <defs>
			    <marker id="triangle" viewBox="0 0 12 12" refX="12" refY="6" markerWidth="12" markerHeight="12"
			        markerUnits="userSpaceOnUse" orient="auto-start-reverse">
			      <path d="M 0 0 L 12 6 L 0 12 z" fill="white" stroke="#495057" />
			    </marker>
			    <marker id="arrow" viewBox="0 0 12 12" refX="12" refY="6" markerWidth="12" markerHeight="12"
			        markerUnits="userSpaceOnUse" orient="auto-start-reverse">
			      <path d="M 0 0 L 12 6 L 0 12" fill="none" stroke="#495057" />
			    </marker>
			    <marker id="diamond" viewBox="0 0 16 10" refX="16" refY="5" markerWidth="16" markerHeight="10"
			        markerUnits="userSpaceOnUse" orient="auto-start-reverse">
			      <path d="M 0 5 L 8 0 L 16 5 L 8 10 z" fill="#495057" />
			    </marker>
			  </defs>
			</svg>
			""";

	record Entry(String name, String title, String description) {}

	private DiagramSite() {
	}

	// tag::write[]
	/**
	 * Writes the React Flow page and module, the Draw.io document and its viewer page.
	 */
	static void write(Diagram diagram, String name) throws Exception {
		String module = new ReactGenerator().generate(ReactFlowRenderer.module(diagram, name));
		write(SITE.resolve("modules/" + name + ".js"), module);
		write(SITE.resolve(name + ".html"), html(reactFlowPage(diagram.getName(), name)));

		Document document = DrawioRenderer.render(diagram);
		write(SITE.resolve(name + ".drawio"), document.save(false));
		write(SITE.resolve(name + "-drawio.html"), html(drawioPage(diagram.getName(), document)));
	}
	// end::write[]

	static BootstrapDocument reactFlowPage(String title, String name) {
		BootstrapDocument page = page(title + " - React Flow");
		Head head = page.getHead();
		Stylesheet xyflow = HtmlFactory.eINSTANCE.createStylesheet();
		xyflow.setHref(XYFLOW_CSS);
		head.getStylesheets().add(xyflow);
		Stylesheet style = HtmlFactory.eINSTANCE.createStylesheet();
		style.setContent("\n" + STYLE);
		head.getStylesheets().add(style);
		ImportMap importMap = HtmlFactory.eINSTANCE.createImportMap();
		importMap.getImports().putAll(IMPORT_MAP);
		head.setImportMap(importMap);

		Body body = page.getBody();
		body.getContents().add(markup(MARKERS));
		Div root = HtmlFactory.eINSTANCE.createDiv();
		root.setId("root");
		body.getContents().add(root);
		Script mount = HtmlFactory.eINSTANCE.createScript();
		mount.setModule(true);
		mount.setContent("""

				import { mount } from "./modules/%s.js";
				mount(document.getElementById("root"));
				""".formatted(name));
		body.getContents().add(mount);
		return page;
	}

	static BootstrapDocument drawioPage(String title, Document document) throws Exception {
		BootstrapDocument page = page(title + " - Draw.io");
		Div container = HtmlFactory.eINSTANCE.createDiv();
		container.getClasses().add("container-fluid");
		container.getClasses().add("p-3");
		container.getContents().add(markup(document.toHtml()));
		page.getBody().getContents().add(container);
		return page;
	}

	static void index(List<Entry> entries) throws IOException {
		BootstrapDocument page = page("Diagrams laid out with ELK");
		Div container = HtmlFactory.eINSTANCE.createDiv();
		container.getClasses().add("container");
		container.getClasses().add("py-4");
		Heading heading = HtmlFactory.eINSTANCE.createHeading();
		heading.getContents().add(text("Diagrams laid out with ELK"));
		container.getContents().add(heading);
		Paragraph lead = HtmlFactory.eINSTANCE.createParagraph();
		lead.getClasses().add("lead");
		lead.getContents().add(text("Diagrams of Ecore packages and classes, generated in the diagram model, "
				+ "laid out by the Eclipse Layout Kernel, and rendered with React Flow and Draw.io."));
		container.getContents().add(lead);
		UnorderedList list = HtmlFactory.eINSTANCE.createUnorderedList();
		for (Entry entry: entries) {
			ListItem item = HtmlFactory.eINSTANCE.createListItem();
			item.getContents().add(text(entry.title() + ": " + entry.description() + " "));
			item.getContents().add(anchor(entry.name() + ".html", "React Flow"));
			item.getContents().add(text(", "));
			item.getContents().add(anchor(entry.name() + "-drawio.html", "Draw.io viewer"));
			item.getContents().add(text(", "));
			item.getContents().add(anchor(entry.name() + ".drawio", entry.name() + ".drawio"));
			list.getItems().add(item);
		}
		container.getContents().add(list);
		page.getBody().getContents().add(container);
		write(SITE.resolve("index.html"), html(page));
	}

	private static BootstrapDocument page(String title) {
		BootstrapDocument page = BootstrapFactory.eINSTANCE.createBootstrapDocument();
		page.setLang("en");
		page.setTheme(Theme.ZEPHYR);
		page.setJavaScript(false);
		Head head = HtmlFactory.eINSTANCE.createHead();
		head.setTitle(title);
		Meta viewport = HtmlFactory.eINSTANCE.createMeta();
		viewport.setName("viewport");
		viewport.setContent("width=device-width, initial-scale=1");
		head.getMetas().add(viewport);
		page.setHead(head);
		page.setBody(HtmlFactory.eINSTANCE.createBody());
		return page;
	}

	private static Markup markup(String content) {
		Markup ret = HtmlFactory.eINSTANCE.createMarkup();
		ret.setContent(content);
		return ret;
	}

	private static Text text(String content) {
		Text ret = HtmlFactory.eINSTANCE.createText();
		ret.setContent(content);
		return ret;
	}

	private static Anchor anchor(String href, String content) {
		Anchor ret = HtmlFactory.eINSTANCE.createAnchor();
		ret.setHref(href);
		ret.getContents().add(text(content));
		return ret;
	}

	private static String html(BootstrapDocument page) {
		return BootstrapStructure.generate(page) + "\n";
	}

	private static void write(Path path, String content) throws IOException {
		Files.createDirectories(path.getParent());
		Files.writeString(path, content);
	}

}
