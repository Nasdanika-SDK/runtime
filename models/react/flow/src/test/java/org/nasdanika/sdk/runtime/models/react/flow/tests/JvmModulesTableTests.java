package org.nasdanika.sdk.runtime.models.react.flow.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.IOException;
import java.io.OutputStream;
import java.lang.module.ModuleDescriptor;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.json.JSONArray;
import org.json.JSONObject;
import org.junit.jupiter.api.Test;
import org.nasdanika.sdk.runtime.models.html.Document;
import org.nasdanika.sdk.runtime.models.react.tests.JvmModulesTableTests;
import org.nasdanika.sdk.runtime.models.react.tests.JvmPropertiesTableTests;
import org.nasdanika.sdk.runtime.models.react.tests.WebTestSupport;
import org.nasdanika.sdk.runtime.models.typescript.CodeBlock;
import org.nasdanika.sdk.runtime.models.typescript.FunctionDeclaration;
import org.nasdanika.sdk.runtime.models.typescript.Import;
import org.nasdanika.sdk.runtime.models.typescript.ImportBinding;
import org.nasdanika.sdk.runtime.models.typescript.ImportKind;
import org.nasdanika.sdk.runtime.models.typescript.Module;
import org.nasdanika.sdk.runtime.models.typescript.Parameter;
import org.nasdanika.sdk.runtime.models.typescript.TypescriptFactory;
import org.nasdanika.sdk.runtime.models.typescript.generator.Generator;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpServer;

/**
 * An interactive table of the JVM's modules: text filtering, sorting by column, and a
 * column selection modal, modeled on the <code>nsd-table</code> Vue component used by
 * the model documentation sites
 * (e.g. https://react.models.nasdanika.org/references/eClassifiers/JsxBlock/operations.html).
 * <p>
 * Table state (sorting, filtering, column visibility) is TanStack Table, which is
 * headless; everything rendered is React Bootstrap. The module is generic: it knows
 * nothing about JVM modules. The data JSON carries the column definitions (key, label,
 * visible, sortable) next to the items, the same shape <code>nsd-table</code> takes, so
 * the same module can render a table for any model element's features.
 * <p>
 * Behavior matched from <code>nsd-table</code>: a "Filter" search box with a "Clear"
 * button, filtering on visible columns only, sortable columns flagged per column, and a
 * "Table configuration" modal with a Visible checkbox per column, applied on OK and
 * discarded on Cancel, and remembered in local storage under a configuration key.
 * <p>
 * Delivered the same two ways as {@link JvmPropertiesTableTests}: written as a static
 * site, and served by the JDK HTTP server with page, module and data handlers. Set
 * <code>-Dnasdanika.react.demo.seconds=300</code> to keep the server running.
 */
public class JvmModulesTableTests {

	private static final TypescriptFactory FACTORY = TypescriptFactory.eINSTANCE;

	private static final String PAGE_PATH = "index.html";

	private static final String MODULE_PATH = "modules/table.js";

	private static final String DATA_PATH = "data/jvm-modules.json";

	private static final String CONFIG_KEY = "nasdanika.react.tests.jvm-modules";

	private static final String BOOTSTRAP_CSS = "https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css";

	private static final String BOOTSTRAP_ICONS_CSS = "https://cdn.jsdelivr.net/npm/bootstrap-icons@1.11.3/font/bootstrap-icons.min.css";

	private static final String REACT_VERSION = "19.3.0";

	private static final String REACT_BOOTSTRAP_VERSION = "2.10.10";

	private static final String TANSTACK_TABLE_VERSION = "8.21.3";

	/**
	 * See {@link JvmPropertiesTableTests} for why each React entry is needed. TanStack
	 * Table imports only the bare <code>react</code> specifier.
	 */
	private static final Map<String, String> IMPORT_MAP = new LinkedHashMap<>();

	static {
		IMPORT_MAP.put("react", "https://esm.sh/react@" + REACT_VERSION);
		IMPORT_MAP.put("react/jsx-runtime", "https://esm.sh/react@" + REACT_VERSION + "/jsx-runtime");
		IMPORT_MAP.put("react-dom", "https://esm.sh/react-dom@" + REACT_VERSION + "?external=react");
		IMPORT_MAP.put("react-dom/client", "https://esm.sh/react-dom@" + REACT_VERSION + "/client?external=react");
		IMPORT_MAP.put("react-bootstrap", "https://esm.sh/react-bootstrap@" + REACT_BOOTSTRAP_VERSION + "?external=react,react-dom");
		IMPORT_MAP.put("@tanstack/react-table", "https://esm.sh/@tanstack/react-table@" + TANSTACK_TABLE_VERSION + "?external=react");
	}

	// --- Component source --------------------------------------------------------
	// Opaque createElement code in TypeScript model code blocks, until the React model
	// has an emitter. Every hook is called before the early returns, as React requires.

	private static final String TABLE_BODY = """
			const [data, setData] = useState(null);
			const [error, setError] = useState(null);
			const [filter, setFilter] = useState("");
			const [sorting, setSorting] = useState([]);
			const [columnVisibility, setColumnVisibility] = useState({});
			// Visibility being edited in the configuration modal; null when the modal is closed.
			const [draft, setDraft] = useState(null);

			useEffect(() => {
			  fetch(props.dataUrl)
			    .then(response => {
			      if (!response.ok) {
			        throw new Error(response.status + " " + response.statusText);
			      }
			      return response.json();
			    })
			    .then(json => {
			      setColumnVisibility(loadVisibility(props.configKey, json.columns));
			      setData(json);
			    }, setError);
			}, [props.dataUrl, props.configKey]);

			const items = useMemo(() => data ? data.items : [], [data]);

			const columns = useMemo(() => data ? data.columns.map(column => ({
			  id: column.key,
			  accessorKey: column.key,
			  header: column.label,
			  enableSorting: !!column.sortable
			})) : [], [data]);

			// Filter on visible columns only, as nsd-table does. TanStack caches filtered
			// rows on the global filter value and not on column visibility, so the visible
			// column ids travel inside the filter value to invalidate that cache.
			const globalFilter = useMemo(() => filter ? {
			  text: filter.toLowerCase(),
			  columns: columns.map(column => column.id).filter(id => columnVisibility[id] !== false)
			} : "", [filter, columns, columnVisibility]);

			const table = useReactTable({
			  data: items,
			  columns,
			  state: { sorting, columnVisibility, globalFilter },
			  onSortingChange: setSorting,
			  onColumnVisibilityChange: setColumnVisibility,
			  globalFilterFn: matchesText,
			  getCoreRowModel: getCoreRowModel(),
			  getFilteredRowModel: getFilteredRowModel(),
			  getSortedRowModel: getSortedRowModel()
			});

			if (error) {
			  return h(Alert, { variant: "danger" }, String(error));
			}
			if (!data) {
			  return h(Spinner, { animation: "border", role: "status" });
			}

			const rows = table.getRowModel().rows;

			return h(Container, { fluid: true },
			  h(Row, { className: "my-1" },
			    h(Col, { xs: 10 },
			      h(Form.Group, { as: Row, className: "mb-0", controlId: "filter-input" },
			        h(Form.Label, { column: "sm", sm: 3, className: "text-sm-end" }, "Filter"),
			        h(Col, { sm: 9 },
			          h(InputGroup, { size: "sm" },
			            h(Form.Control, {
			              type: "search",
			              placeholder: "Type to Search",
			              value: filter,
			              onChange: event => setFilter(event.target.value)
			            }),
			            h(Button, { variant: "secondary", disabled: !filter, onClick: () => setFilter("") }, "Clear"))))),
			    h(Col, { xs: 2 },
			      h(Button, {
			        variant: "secondary",
			        size: "sm",
			        title: "Configuration",
			        onClick: () => setDraft(Object.fromEntries(table.getAllLeafColumns().map(column => [column.id, column.getIsVisible()])))
			      }, h("i", { className: "bi bi-gear" })))),
			  h(Row, null,
			    h(Col, null,
			      h(Table, { striped: true, hover: true, size: "sm" },
			        h("thead", null,
			          table.getHeaderGroups().map(headerGroup =>
			            h("tr", { key: headerGroup.id }, headerGroup.headers.map(headerCell)))),
			        h("tbody", null,
			          rows.map(row =>
			            h("tr", { key: row.id },
			              row.getVisibleCells().map(cell =>
			                h("td", { key: cell.id }, flexRender(cell.column.columnDef.cell, cell.getContext()))))))),
			      h("small", { className: "text-body-secondary" }, rows.length + " of " + items.length))),
			  h(Modal, { show: draft !== null, onHide: () => setDraft(null), size: "lg", scrollable: true },
			    h(Modal.Header, { closeButton: true }, h(Modal.Title, null, "Table configuration")),
			    h(Modal.Body, null,
			      h(Table, { striped: true, hover: true, size: "sm" },
			        h("thead", null, h("tr", null, h("th", null, "Field"), h("th", null, "Visible"))),
			        h("tbody", null,
			          table.getAllLeafColumns().map(column =>
			            h("tr", { key: column.id },
			              h("td", null, column.columnDef.header),
			              h("td", null,
			                h(Form.Check, {
			                  type: "checkbox",
			                  "aria-label": "Show " + column.columnDef.header,
			                  checked: draft !== null && draft[column.id] !== false,
			                  onChange: event => setDraft({ ...draft, [column.id]: event.target.checked })
			                }))))))),
			    h(Modal.Footer, null,
			      h(Button, { variant: "secondary", onClick: () => setDraft(null) }, "Cancel"),
			      h(Button, {
			        variant: "primary",
			        onClick: () => {
			          setColumnVisibility(draft);
			          saveVisibility(props.configKey, draft);
			          setDraft(null);
			        }
			      }, "OK"))));
			""";

	private static final String HEADER_CELL_BODY = """
			const column = header.column;
			const label = header.isPlaceholder ? null : flexRender(column.columnDef.header, header.getContext());
			if (!column.getCanSort()) {
			  return h("th", { key: header.id }, label);
			}
			const sorted = column.getIsSorted();
			return h("th", {
			    key: header.id,
			    "aria-sort": sorted === "asc" ? "ascending" : sorted === "desc" ? "descending" : "none",
			    title: "Sort by " + column.columnDef.header,
			    style: { cursor: "pointer", userSelect: "none", whiteSpace: "nowrap" },
			    onClick: column.getToggleSortingHandler()
			  },
			  label,
			  " ",
			  h("i", { className: sorted === "asc" ? "bi bi-sort-up" : sorted === "desc" ? "bi bi-sort-down" : "bi bi-arrow-down-up text-body-tertiary" }));
			""";

	private static final String MATCHES_TEXT_BODY = """
			return filterValue.columns.includes(columnId)
			  && String(row.getValue(columnId) ?? "").toLowerCase().includes(filterValue.text);
			""";

	private static final String LOAD_VISIBILITY_BODY = """
			const defaults = Object.fromEntries(columns.map(column => [column.key, column.visible !== false]));
			if (!configKey) {
			  return defaults;
			}
			try {
			  const stored = JSON.parse(window.localStorage.getItem(configKey) || "null");
			  return stored && stored.visibility ? { ...defaults, ...stored.visibility } : defaults;
			} catch (error) {
			  console.error(error);
			  return defaults;
			}
			""";

	private static final String SAVE_VISIBILITY_BODY = """
			if (!configKey) {
			  return;
			}
			try {
			  window.localStorage.setItem(configKey, JSON.stringify({ visibility }));
			} catch (error) {
			  console.error(error);
			}
			""";

	private static final String MOUNT_BODY = """
			createRoot(element).render(h(NsdTable, { dataUrl, configKey }));
			""";

	// --- Tests -------------------------------------------------------------------

	@Test
	public void testStaticSite() throws IOException {
		Path site = Path.of("target", "react", "jvm-modules-site").toAbsolutePath();

		Map<String, String> files = new LinkedHashMap<>();
		files.put(PAGE_PATH, page());
		files.put(MODULE_PATH, module());
		files.put(DATA_PATH, jvmModules().toString(2));

		for (Map.Entry<String, String> file : files.entrySet()) {
			Path target = site.resolve(file.getKey());
			Files.createDirectories(target.getParent());
			Files.writeString(target, file.getValue(), StandardCharsets.UTF_8);
		}

		String module = Files.readString(site.resolve(MODULE_PATH));
		assertTrue(module.contains("from \"@tanstack/react-table\";"), module);
		assertTrue(module.contains("export function NsdTable(props) {"), module);
		assertTrue(module.contains("export function mount(element, dataUrl, configKey) {"), module);

		assertModules(new JSONObject(Files.readString(site.resolve(DATA_PATH))));

		System.out.println("Static site: " + site);
		System.out.println("View it with: jwebserver -d \"" + site + "\" and open http://127.0.0.1:8000/");
	}

	@Test
	public void testServer() throws Exception {
		String page = page();
		Map<String, String> modules = Map.of(MODULE_PATH, module());

		HttpServer server = HttpServer.create(new InetSocketAddress(InetAddress.getLoopbackAddress(), 0), 0);
		try (ExecutorService executor = Executors.newVirtualThreadPerTaskExecutor()) {
			server.setExecutor(executor);

			// Page handler, on the catch-all context.
			server.createContext("/", exchange -> {
				String path = exchange.getRequestURI().getPath();
				if (!isGet(exchange)) {
					send(exchange, 405, "text/plain; charset=utf-8", "Method not allowed");
				} else if ("/".equals(path) || ("/" + PAGE_PATH).equals(path)) {
					send(exchange, 200, "text/html; charset=utf-8", page);
				} else {
					send(exchange, 404, "text/plain; charset=utf-8", "Not found");
				}
			});

			// Module handler.
			server.createContext("/modules/", exchange -> {
				String source = modules.get(exchange.getRequestURI().getPath().substring(1));
				if (!isGet(exchange)) {
					send(exchange, 405, "text/plain; charset=utf-8", "Method not allowed");
				} else if (source == null) {
					send(exchange, 404, "text/plain; charset=utf-8", "Not found");
				} else {
					send(exchange, 200, "text/javascript; charset=utf-8", source);
				}
			});

			// Data handler, computed per request.
			server.createContext("/data/", exchange -> {
				if (!isGet(exchange)) {
					send(exchange, 405, "text/plain; charset=utf-8", "Method not allowed");
				} else if (("/" + DATA_PATH).equals(exchange.getRequestURI().getPath())) {
					exchange.getResponseHeaders().set("Cache-Control", "no-store");
					send(exchange, 200, "application/json", jvmModules().toString());
				} else {
					send(exchange, 404, "text/plain; charset=utf-8", "Not found");
				}
			});

			server.start();
			try (HttpClient client = HttpClient.newHttpClient()) {
				URI base = URI.create("http://127.0.0.1:" + server.getAddress().getPort() + "/");

				HttpResponse<String> pageResponse = get(client, base.resolve(""));
				assertEquals(200, pageResponse.statusCode());
				assertEquals(page, pageResponse.body());

				HttpResponse<String> moduleResponse = get(client, base.resolve(MODULE_PATH));
				assertEquals(200, moduleResponse.statusCode());
				assertTrue(contentType(moduleResponse).startsWith("text/javascript"));
				assertTrue(moduleResponse.body().contains("useReactTable("));

				HttpResponse<String> dataResponse = get(client, base.resolve(DATA_PATH));
				assertEquals(200, dataResponse.statusCode());
				assertTrue(contentType(dataResponse).startsWith("application/json"));
				assertModules(new JSONObject(dataResponse.body()));

				assertEquals(404, get(client, base.resolve("modules/missing.js")).statusCode());

				long seconds = Long.getLong("nasdanika.react.demo.seconds", 0);
				if (seconds > 0) {
					System.out.println("Serving " + base + " for " + seconds + " seconds");
					Thread.sleep(Duration.ofSeconds(seconds));
				}
			} finally {
				server.stop(0);
			}
		}
	}

	private static void assertModules(JSONObject data) {
		JSONArray columns = data.getJSONArray("columns");
		assertEquals("name", columns.getJSONObject(0).getString("key"));
		List<String> names = new ArrayList<>();
		JSONArray items = data.getJSONArray("items");
		for (int i = 0; i < items.length(); i++) {
			names.add(items.getJSONObject(i).getString("name"));
		}
		assertTrue(names.contains("java.base"), names::toString);
		String testModule = JvmModulesTableTests.class.getModule().getName();
		if (testModule != null) {
			assertTrue(names.contains(testModule), names::toString);
		}
	}

	// --- Artifacts ---------------------------------------------------------------

	/**
	 * The generic table module, generated from a TypeScript model with no type
	 * annotations.
	 */
	private static String module() {
		Module module = FACTORY.createModule();
		module.setName("table");
		module.setPath(MODULE_PATH.substring(0, MODULE_PATH.length() - ".js".length()));
		module.setHeader("// Generated from a Nasdanika TypeScript model by JvmModulesTableTests. Do not edit.");

		module.getImports().add(namedImport("react",
				binding("createElement", "h"),
				binding("useEffect", null),
				binding("useMemo", null),
				binding("useState", null)));
		module.getImports().add(namedImport("react-dom/client", binding("createRoot", null)));
		module.getImports().add(namedImport("react-bootstrap",
				binding("Alert", null),
				binding("Button", null),
				binding("Col", null),
				binding("Container", null),
				binding("Form", null),
				binding("InputGroup", null),
				binding("Modal", null),
				binding("Row", null),
				binding("Spinner", null),
				binding("Table", null)));
		module.getImports().add(namedImport("@tanstack/react-table",
				binding("flexRender", null),
				binding("getCoreRowModel", null),
				binding("getFilteredRowModel", null),
				binding("getSortedRowModel", null),
				binding("useReactTable", null)));

		module.getDeclarations().add(function(
				"NsdTable",
				true,
				"""
				A table with text filtering, sorting by column and column selection. Loads
				{ columns, items } from props.dataUrl; each column has key, label, visible and
				sortable. Column visibility is remembered in local storage under props.configKey.""",
				TABLE_BODY,
				"props"));
		module.getDeclarations().add(function(
				"headerCell",
				false,
				"Header cell, clickable with a sort indicator when the column is sortable.",
				HEADER_CELL_BODY,
				"header"));
		module.getDeclarations().add(function(
				"matchesText",
				false,
				"Global filter function: case-insensitive substring match on the visible columns carried in the filter value.",
				MATCHES_TEXT_BODY,
				"row", "columnId", "filterValue"));
		module.getDeclarations().add(function(
				"loadVisibility",
				false,
				"Column visibility from the column defaults, overridden by what was saved under the configuration key.",
				LOAD_VISIBILITY_BODY,
				"configKey", "columns"));
		module.getDeclarations().add(function(
				"saveVisibility",
				false,
				"Saves column visibility under the configuration key.",
				SAVE_VISIBILITY_BODY,
				"configKey", "visibility"));
		module.getDeclarations().add(function(
				"mount",
				true,
				"Renders the table into the element.",
				MOUNT_BODY,
				"element", "dataUrl", "configKey"));

		return new Generator().generate(module);
	}

	private static String page() {
		Document page = WebTestSupport.page(
				"JVM Modules",
				IMPORT_MAP,
				WebTestSupport.main("container-fluid py-4", "JVM Modules"),
				MODULE_PATH,
				JSONObject.quote(DATA_PATH) + ", " + JSONObject.quote(CONFIG_KEY));
		page.getHead().getStylesheets().add(WebTestSupport.stylesheet(BOOTSTRAP_CSS));
		page.getHead().getStylesheets().add(WebTestSupport.stylesheet(BOOTSTRAP_ICONS_CSS));
		return WebTestSupport.html(page);
	}

	/**
	 * Columns and items for the modules of the layer this test runs in and its parents.
	 * Counts are numbers so they sort numerically; lists are strings and hidden by
	 * default, which is what the column selection modal is for.
	 */
	private static JSONObject jvmModules() {
		JSONArray columns = new JSONArray();
		column(columns, "name", "Name", true, true);
		column(columns, "version", "Version", true, true);
		column(columns, "kind", "Kind", true, true);
		column(columns, "requires", "Requires", true, true);
		column(columns, "exports", "Exports", true, true);
		column(columns, "packages", "Packages", true, true);
		column(columns, "layer", "Layer", false, true);
		column(columns, "mainClass", "Main class", false, true);
		column(columns, "location", "Location", false, true);
		column(columns, "requiredModules", "Required modules", false, false);
		column(columns, "exportedPackages", "Exported packages", false, false);
		column(columns, "providedServices", "Provided services", false, false);
		column(columns, "usedServices", "Used services", false, false);

		java.lang.Module testModule = JvmModulesTableTests.class.getModule();
		ModuleLayer start = testModule.getLayer() == null ? ModuleLayer.boot() : testModule.getLayer();
		List<ModuleLayer> layers = new ArrayList<>();
		collectLayers(start, layers);

		JSONArray items = new JSONArray();
		for (int i = 0; i < layers.size(); i++) {
			ModuleLayer layer = layers.get(i);
			String layerName = layer == ModuleLayer.boot() ? "boot" : "layer " + i;
			List<java.lang.Module> modules = layer.modules()
					.stream()
					.sorted(Comparator.comparing(java.lang.Module::getName))
					.toList();
			for (java.lang.Module module : modules) {
				ModuleDescriptor descriptor = module.getDescriptor();
				JSONObject item = new JSONObject();
				item.put("name", module.getName());
				item.put("version", descriptor.rawVersion().orElse(""));
				item.put("kind", descriptor.isAutomatic() ? "automatic" : descriptor.isOpen() ? "open" : "explicit");
				item.put("requires", descriptor.requires().size());
				item.put("exports", descriptor.exports().size());
				item.put("packages", descriptor.packages().size());
				item.put("layer", layerName);
				item.put("mainClass", descriptor.mainClass().orElse(""));
				item.put("location", layer.configuration()
						.findModule(module.getName())
						.flatMap(resolved -> resolved.reference().location())
						.map(Object::toString)
						.orElse(""));
				item.put("requiredModules", sortedJoin(descriptor.requires().stream().map(JvmModulesTableTests::requires)));
				item.put("exportedPackages", sortedJoin(descriptor.exports().stream().map(JvmModulesTableTests::exports)));
				item.put("providedServices", sortedJoin(descriptor.provides().stream().map(ModuleDescriptor.Provides::service)));
				item.put("usedServices", sortedJoin(descriptor.uses().stream()));
				items.put(item);
			}
		}

		return new JSONObject().put("columns", columns).put("items", items);
	}

	private static void collectLayers(ModuleLayer layer, List<ModuleLayer> layers) {
		if (!layers.contains(layer)) {
			layers.add(layer);
			for (ModuleLayer parent : layer.parents()) {
				collectLayers(parent, layers);
			}
		}
	}

	private static String requires(ModuleDescriptor.Requires requires) {
		String modifiers = requires.modifiers()
				.stream()
				.map(modifier -> modifier.name().toLowerCase())
				.sorted()
				.collect(Collectors.joining(" "));
		return modifiers.isEmpty() ? requires.name() : requires.name() + " (" + modifiers + ")";
	}

	private static String exports(ModuleDescriptor.Exports exports) {
		return exports.isQualified() ? exports.source() + " to " + String.join(", ", exports.targets().stream().sorted().toList()) : exports.source();
	}

	private static String sortedJoin(Stream<String> values) {
		return values.sorted().collect(Collectors.joining(", "));
	}

	private static void column(JSONArray columns, String key, String label, boolean visible, boolean sortable) {
		columns.put(new JSONObject()
				.put("key", key)
				.put("label", label)
				.put("visible", visible)
				.put("sortable", sortable));
	}

	// --- Helpers -----------------------------------------------------------------

	private static FunctionDeclaration function(String name, boolean exported, String documentation, String body, String... parameters) {
		FunctionDeclaration ret = FACTORY.createFunctionDeclaration();
		ret.setName(name);
		ret.setExported(exported);
		ret.setDocumentation(documentation);
		for (String parameterName : parameters) {
			Parameter parameter = FACTORY.createParameter();
			parameter.setName(parameterName);
			ret.getParameters().add(parameter);
		}
		CodeBlock code = FACTORY.createCodeBlock();
		code.setName("body");
		code.setText(body);
		ret.setBody(code);
		return ret;
	}

	private static Import namedImport(String specifier, ImportBinding... bindings) {
		Import ret = FACTORY.createImport();
		ret.setName(specifier);
		ret.setModuleSpecifier(specifier);
		for (ImportBinding binding : bindings) {
			ret.getBindings().add(binding);
		}
		return ret;
	}

	private static ImportBinding binding(String importedName, String alias) {
		ImportBinding ret = FACTORY.createImportBinding();
		ret.setName(alias == null ? importedName : alias);
		ret.setKind(ImportKind.NAMED);
		ret.setImportedName(importedName);
		ret.setAlias(alias);
		return ret;
	}

	private static boolean isGet(HttpExchange exchange) {
		return "GET".equals(exchange.getRequestMethod());
	}

	private static void send(HttpExchange exchange, int status, String contentType, String body) throws IOException {
		byte[] bytes = body.getBytes(StandardCharsets.UTF_8);
		exchange.getResponseHeaders().set("Content-Type", contentType);
		exchange.sendResponseHeaders(status, bytes.length);
		try (OutputStream out = exchange.getResponseBody()) {
			out.write(bytes);
		}
	}

	private static HttpResponse<String> get(HttpClient client, URI uri) throws IOException, InterruptedException {
		return client.send(HttpRequest.newBuilder(uri).GET().build(), HttpResponse.BodyHandlers.ofString());
	}

	private static String contentType(HttpResponse<?> response) {
		return response.headers().firstValue("Content-Type").orElse("");
	}

}
