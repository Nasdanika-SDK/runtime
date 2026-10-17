package org.example.ui;

import static java.nio.charset.StandardCharsets.UTF_8;
import static org.example.ui.Jsx.attribute;
import static org.example.ui.Jsx.children;
import static org.example.ui.Jsx.conditional;
import static org.example.ui.Jsx.effect;
import static org.example.ui.Jsx.element;
import static org.example.ui.Jsx.event;
import static org.example.ui.Jsx.external;
import static org.example.ui.Jsx.head;
import static org.example.ui.Jsx.intrinsic;
import static org.example.ui.Jsx.iterator;
import static org.example.ui.Jsx.literal;
import static org.example.ui.Jsx.memo;
import static org.example.ui.Jsx.parameter;
import static org.example.ui.Jsx.row;
import static org.example.ui.Jsx.state;
import static org.example.ui.Jsx.tag;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

import org.example.library.Author;
import org.example.library.Book;
import org.example.library.Library;
import org.json.JSONArray;
import org.json.JSONObject;
import org.nasdanika.sdk.runtime.models.html.Body;
import org.nasdanika.sdk.runtime.models.html.Div;
import org.nasdanika.sdk.runtime.models.html.Document;
import org.nasdanika.sdk.runtime.models.html.Head;
import org.nasdanika.sdk.runtime.models.html.Heading;
import org.nasdanika.sdk.runtime.models.html.HtmlFactory;
import org.nasdanika.sdk.runtime.models.html.ImportMap;
import org.nasdanika.sdk.runtime.models.html.Input;
import org.nasdanika.sdk.runtime.models.html.Main;
import org.nasdanika.sdk.runtime.models.html.Meta;
import org.nasdanika.sdk.runtime.models.html.Script;
import org.nasdanika.sdk.runtime.models.html.Stylesheet;
import org.nasdanika.sdk.runtime.models.html.generator.Generator;
import org.nasdanika.sdk.runtime.models.react.ComponentDeclaration;
import org.nasdanika.sdk.runtime.models.react.JsxNode;
import org.nasdanika.sdk.runtime.models.react.ReactFactory;
import org.nasdanika.sdk.runtime.models.react.generator.ReactGenerator;
import org.nasdanika.sdk.runtime.models.typescript.CodeBlock;
import org.nasdanika.sdk.runtime.models.typescript.FunctionDeclaration;
import org.nasdanika.sdk.runtime.models.typescript.Module;
import org.nasdanika.sdk.runtime.models.typescript.TypescriptFactory;
import org.nasdanika.sdk.runtime.volume.Content;
import org.nasdanika.sdk.runtime.volume.Volume;

/**
 * A React application built from Java, with no npm and no build step: a page, an ES module
 * generated from a React model, and JSON data from the library model.
 */
public final class BookTable {

	public static final String PAGE = "index.html";
	public static final String MODULE = "modules/books.js";
	public static final String DATA = "data/books.json";

	private static final HtmlFactory HTML = HtmlFactory.eINSTANCE;
	private static final ReactFactory REACT = ReactFactory.eINSTANCE;
	private static final TypescriptFactory TS = TypescriptFactory.eINSTANCE;

	private static final String ESM = "https://esm.sh/";
	private static final String REACT_VERSION = "19.3.0";
	private static final String BOOTSTRAP_CSS =
			"https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css";

	private BookTable() {
	}

	// tag::component[]
	/**
	 * A table of books with a filter. The module is not a TSX module, so the generator writes
	 * createElement calls that a browser runs as they are.
	 */
	public static Module module() {
		ComponentDeclaration table = REACT.createComponentDeclaration();
		table.setName("BookTable");
		table.setExported(true);
		table.getParameters().add(parameter("props"));
		table.getHooks().add(state("rows", "setRows", "null"));                       // <1>
		table.getHooks().add(state("query", "setQuery", "\"\""));
		table.getHooks().add(effect(                                                 // <2>
				"fetch(props.dataUrl).then(response => response.json()).then(setRows);",
				"props.dataUrl"));
		table.getHooks().add(memo("shown",                                           // <3>
				"(rows || []).filter(row => matches(row, query))",
				"rows", "query"));

		Input search = HTML.createInput();                                           // <4>
		search.setType("search");
		search.setPlaceholder("Filter by title");
		search.getClasses().addAll(List.of("form-control", "mb-3"));
		JsxNode filter = intrinsic(search,
				attribute("value", "query"),
				event("onChange", "event => setQuery(event.target.value)"));

		JsxNode spinner = element(external("Spinner", "react-bootstrap"),          // <5>
				literal("animation", "border"));
		JsxNode books = children(
				element(external("Table", "react-bootstrap"), attribute("striped", "true")),
				intrinsic(head("Title", "Year", "Authors")),
				children(
						intrinsic(HTML.createTableBody()),
						iterator("shown", "row", "row.title",                            // <6>
								intrinsic(row("row.title", "row.year", "row.authors")))));
		table.setRender(children(tag("div"), filter, conditional("!rows", spinner, books)));

		Module module = TS.createModule();
		module.setName("books");
		module.setPath("modules/books");
		module.setHeader("// Generated from a React model. Do not edit.");
		module.getImports().add(Jsx.namedImport("react-dom/client", "createRoot"));
		module.getDeclarations().add(matches());
		module.getDeclarations().add(table);
		module.getDeclarations().add(mount());
		return module;
	}
	// end::component[]

	/**
	 * Whether a row's title contains the query, ignoring case.
	 */
	private static FunctionDeclaration matches() {
		FunctionDeclaration matches = Jsx.function(
				"matches",
				"return row.title.toLowerCase().includes(query.toLowerCase());",
				"row",
				"query");
		matches.setExported(false);
		return matches;
	}

	/**
	 * Renders the table into an element, loading the data from a URL.
	 */
	private static FunctionDeclaration mount() {
		FunctionDeclaration mount = Jsx.function(
				"mount",
				"createRoot(element).render(createElement(BookTable, { dataUrl }));",
				"element",
				"dataUrl");
		CodeBlock body = (CodeBlock) mount.getBody();
		body.getReferences().add(external("createElement", "react")); // Keeps the import managed
		return mount;
	}

	// tag::page[]
	/**
	 * The page: Bootstrap's stylesheet, an import map resolving React and React Bootstrap to a
	 * CDN, a mount point and a module script. Relative URLs only, so the page works at any
	 * address, static or served.
	 */
	public static Document page() {
		ImportMap importMap = HTML.createImportMap();                               // <1>
		importMap.getImports().put("react", ESM + "react@" + REACT_VERSION);
		importMap.getImports().put("react/jsx-runtime",
				ESM + "react@" + REACT_VERSION + "/jsx-runtime");
		importMap.getImports().put("react-dom",
				ESM + "react-dom@" + REACT_VERSION + "?external=react");
		importMap.getImports().put("react-dom/client",
				ESM + "react-dom@" + REACT_VERSION + "/client?external=react");
		importMap.getImports().put("react-bootstrap",
				ESM + "react-bootstrap@2.10.10?external=react,react-dom");

		Head head = HTML.createHead();
		head.setTitle("Books");
		head.getMetas().add(viewport());
		head.getStylesheets().add(stylesheet(BOOTSTRAP_CSS));
		head.setImportMap(importMap);

		Div root = HTML.createDiv();
		root.setId("root");
		Script script = HTML.createScript();                                        // <2>
		script.setModule(true);
		script.setContent("""

				import { mount } from "./%s";
				mount(document.getElementById("root"), "%s");
				""".formatted(MODULE, DATA));

		Main main = HTML.createMain();
		main.getClasses().addAll(List.of("container", "py-4"));
		main.getContents().add(heading("Books"));
		main.getContents().add(root);
		Body body = HTML.createBody();
		body.getContents().add(main);
		body.getContents().add(script);

		Document page = HTML.createDocument();
		page.setLang("en");
		page.setHead(head);
		page.setBody(body);
		return page;
	}
	// end::page[]

	/**
	 * The library's books as JSON rows: title, year and authors.
	 */
	public static JSONArray data(Library library) {
		JSONArray rows = new JSONArray();
		for (Book book: library.getBooks()) {
			String authors = book.getAuthors().stream()
					.map(Author::getName)
					.collect(Collectors.joining(", "));
			rows.put(new JSONObject()
					.put("title", book.getName())
					.put("year", book.getYear())
					.put("authors", authors));
		}
		return rows;
	}

	// tag::write[]
	/**
	 * Writes the application to a writable volume: a directory to copy to a static host, or
	 * a volume that the runtime serves. The same bytes either way.
	 */
	public static void write(Library library, Volume volume) throws IOException {
		Volume.Writable site = volume.capability(Volume.Writable.class)
				.orElseThrow(() -> new IOException("Read-only volume"));
		String html = new Generator().generate(page()) + "\n";
		String javaScript = new ReactGenerator().generate(module());
		site.write(PAGE, Content.of(html, UTF_8));
		createDirectory(volume, site, "modules");
		site.write(MODULE, Content.of(javaScript, UTF_8));
		createDirectory(volume, site, "data");
		site.write(DATA, Content.of(data(library).toString(2), UTF_8));
	}
	// end::write[]

	private static void createDirectory(Volume volume, Volume.Writable site, String path)
			throws IOException {
		if (volume.stat(path).isEmpty()) {
			site.createDirectory(path);
		}
	}

	private static Meta viewport() {
		Meta viewport = HTML.createMeta();
		viewport.setName("viewport");
		viewport.setContent("width=device-width, initial-scale=1");
		return viewport;
	}

	private static Stylesheet stylesheet(String href) {
		Stylesheet stylesheet = HTML.createStylesheet();
		stylesheet.setHref(href);
		return stylesheet;
	}

	private static Heading heading(String content) {
		Heading heading = HTML.createHeading();
		heading.setLevel(1);
		heading.getContents().add(Jsx.text(content));
		return heading;
	}

}
