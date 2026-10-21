package org.nasdanika.sdk.runtime.models.react.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.IOException;
import java.io.OutputStream;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.Duration;
import java.util.LinkedHashMap;
import java.util.Map;

import org.json.JSONArray;
import org.json.JSONObject;
import org.junit.jupiter.api.Test;
import org.nasdanika.sdk.runtime.harness.Harness;
import org.nasdanika.sdk.runtime.models.html.Document;
import org.nasdanika.sdk.runtime.models.html.TableHead;
import org.nasdanika.sdk.runtime.models.react.ComponentDeclaration;
import org.nasdanika.sdk.runtime.models.react.JsxNode;
import org.nasdanika.sdk.runtime.models.react.generator.ReactGenerator;
import org.nasdanika.sdk.runtime.models.typescript.CodeBlock;
import org.nasdanika.sdk.runtime.models.typescript.FunctionDeclaration;
import org.nasdanika.sdk.runtime.models.typescript.Import;
import org.nasdanika.sdk.runtime.models.typescript.ImportBinding;
import org.nasdanika.sdk.runtime.models.typescript.ImportKind;
import org.nasdanika.sdk.runtime.models.typescript.Module;
import org.nasdanika.sdk.runtime.models.typescript.Parameter;
import org.nasdanika.sdk.runtime.models.typescript.TypescriptFactory;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpServer;

/**
 * React from Java, with no npm and no build step: a page, an ES module and JSON data.
 * <p>
 * The same three artifacts are delivered two ways. {@link #testStaticSite()} writes
 * them to a directory, which any static host can serve. {@link #testServer()} serves
 * them from a harness server through three handlers, with the data computed per
 * request. The page and the module use relative URLs, so they are byte for byte the
 * same in both modes.
 * <p>
 * The module is generated from the TypeScript model. A module without type annotations
 * is valid JavaScript, so the browser runs the generator's output directly. The
 * component body is opaque code using <code>createElement</code> because the React
 * model has no emitter yet; that emitter's job is to produce this code from
 * <code>ComponentDeclaration</code> and <code>JsxElement</code>, and this output is its
 * expected result.
 * <p>
 * Bare specifiers (<code>react</code>, <code>react-dom/client</code>,
 * <code>react-bootstrap</code>) are resolved by an import map in the page, pointing at
 * esm.sh. <code>?external=</code> keeps react-dom and react-bootstrap importing bare
 * React specifiers, so the import map resolves all of them to one React instance.
 * <p>
 * Set <code>-Dnasdanika.react.demo.seconds=300</code> to keep the server running and
 * open the printed URL in a browser.
 */
public class JvmPropertiesTableTests {

	private static final TypescriptFactory FACTORY = TypescriptFactory.eINSTANCE;

	private static final String PAGE_PATH = "index.html";

	private static final String MODULE_PATH = "modules/app.js";

	private static final String DATA_PATH = "data/jvm-properties.json";

	private static final String BOOTSTRAP_CSS = "https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css";

	/**
	 * react and react-dom must be the same version, or React fails at render time.
	 */
	private static final String REACT_VERSION = "19.3.0";

	private static final String REACT_BOOTSTRAP_VERSION = "2.10.10";

	/**
	 * An import map applies to every module the page loads, including the ones fetched
	 * from esm.sh. <code>?external=react,react-dom</code> leaves every specifier under
	 * those packages bare, subpaths included, so the map has to cover each one that the
	 * served module graph actually imports: <code>react</code>,
	 * <code>react/jsx-runtime</code> (used by @restart/ui under react-bootstrap) and
	 * <code>react-dom</code> (used by overlays and modals), plus
	 * <code>react-dom/client</code> for the page itself. A missing entry fails in the
	 * browser with "Failed to resolve module specifier".
	 */
	private static final Map<String, String> IMPORT_MAP = new LinkedHashMap<>();

	static {
		IMPORT_MAP.put("react", "https://esm.sh/react@" + REACT_VERSION);
		IMPORT_MAP.put("react/jsx-runtime", "https://esm.sh/react@" + REACT_VERSION + "/jsx-runtime");
		IMPORT_MAP.put("react-dom", "https://esm.sh/react-dom@" + REACT_VERSION + "?external=react");
		IMPORT_MAP.put("react-dom/client", "https://esm.sh/react-dom@" + REACT_VERSION + "/client?external=react");
		IMPORT_MAP.put("react-bootstrap", "https://esm.sh/react-bootstrap@" + REACT_BOOTSTRAP_VERSION + "?external=react,react-dom");
	}

	private static final String EFFECT_BODY = """
			fetch(props.dataUrl)
			  .then(response => {
			    if (!response.ok) {
			      throw new Error(response.status + " " + response.statusText);
			    }
			    return response.json();
			  })
			  .then(setRows, setError);
			""";

	private static final String MOUNT_BODY = """
			createRoot(element).render(createElement(JvmPropertiesTable, { dataUrl }));
			""";

	@Test
	public void testStaticSite() throws IOException {
		Path site = Path.of("target", "react", "jvm-properties-site").toAbsolutePath();

		Map<String, String> files = new LinkedHashMap<>();
		files.put(PAGE_PATH, page());
		files.put(MODULE_PATH, module());
		files.put(DATA_PATH, jvmProperties().toString(2));

		for (Map.Entry<String, String> file : files.entrySet()) {
			Path target = site.resolve(file.getKey());
			Files.createDirectories(target.getParent());
			Files.writeString(target, file.getValue(), StandardCharsets.UTF_8);
		}

		String page = Files.readString(site.resolve(PAGE_PATH));
		assertTrue(page.contains("<script type=\"importmap\">"));
		assertTrue(page.contains("./" + MODULE_PATH));

		String module = Files.readString(site.resolve(MODULE_PATH));
		assertTrue(module.contains("import { Alert, Spinner, Table } from \"react-bootstrap\";"), module);
		// No type annotations in the signatures: the generator's output runs in a browser as is.
		assertTrue(module.contains("export function JvmPropertiesTable(props) {"), module);
		assertTrue(module.contains("export function mount(element, dataUrl) {"), module);

		JSONArray data = new JSONArray(Files.readString(site.resolve(DATA_PATH)));
		assertTrue(names(data).contains("Process id"));

		// ES modules do not load from file:// URLs, so the site needs an HTTP server.
		// The JDK ships one: jwebserver.
		System.out.println("Static site: " + site);
		System.out.println("View it with: jwebserver -d \"" + site + "\" and open http://127.0.0.1:8000/");
	}

	/**
	 * The page, the module and the data, each from its own handler. "/" is the catch-all
	 * context, so anything the other handlers do not claim lands there and is not found
	 * unless it is the page.
	 */
	static void routes(HttpServer server) {
		String page = page();
		Map<String, String> modules = Map.of(MODULE_PATH, module());

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

		// Generated ES modules by path.
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

		// Computed per request, which is what makes the data dynamic (free memory changes
		// between requests) and is the place progressive delivery plugs in later.
		server.createContext("/data/", exchange -> {
			if (!isGet(exchange)) {
				send(exchange, 405, "text/plain; charset=utf-8", "Method not allowed");
			} else if (("/" + DATA_PATH).equals(exchange.getRequestURI().getPath())) {
				exchange.getResponseHeaders().set("Cache-Control", "no-store");
				send(exchange, 200, "application/json", jvmProperties().toString());
			} else {
				send(exchange, 404, "text/plain; charset=utf-8", "Not found");
			}
		});
	}

	/**
	 * The three artifacts served by the harness: a server that is up while the body runs, every
	 * request a server span, and the body's requests client spans in the same trace.
	 */
	@Test
	public void testServer() throws Exception {
		Harness.inServer("JVM properties", JvmPropertiesTableTests::routes, server -> {
			HttpResponse<String> pageResponse = server.get(PAGE_PATH);
			assertEquals(200, pageResponse.statusCode());
			assertTrue(contentType(pageResponse).startsWith("text/html"));
			assertEquals(page(), pageResponse.body());

			HttpResponse<String> moduleResponse = server.get(MODULE_PATH);
			assertEquals(200, moduleResponse.statusCode());
			assertTrue(contentType(moduleResponse).startsWith("text/javascript"));
			assertTrue(moduleResponse.body().contains("export function JvmPropertiesTable(props)"));

			HttpResponse<String> dataResponse = server.get(DATA_PATH);
			assertEquals(200, dataResponse.statusCode());
			assertTrue(contentType(dataResponse).startsWith("application/json"));
			assertTrue(names(new JSONArray(dataResponse.body())).contains("Process id"));

			assertEquals(404, server.get("favicon.ico").statusCode());
			assertEquals(404, server.get("modules/missing.js").statusCode());

			long seconds = Long.getLong("nasdanika.react.demo.seconds", 0);
			if (seconds > 0) {
				System.out.println("Serving " + server.base() + " for " + seconds + " seconds");
				Thread.sleep(Duration.ofSeconds(seconds));
			}
			return null;
		});
	}

	// --- Artifacts -----------------------------------------------------------

	/**
	 * The ES module, generated from a React model with no type annotations. The module is
	 * not a TsxModule, so the generator writes createElement calls, which the browser runs
	 * without a build step. React imports - hooks and createElement - and React Bootstrap
	 * imports are computed from the model; only createRoot, used in opaque code, is authored.
	 */
	static Module componentModule() {
		Module module = FACTORY.createModule();
		module.setName("app");
		module.setPath(MODULE_PATH.substring(0, MODULE_PATH.length() - ".js".length()));
		module.setHeader("// Generated from a Nasdanika React model by JvmPropertiesTableTests. Do not edit.");

		module.getImports().add(namedImport("react-dom/client", binding("createRoot", null)));

		ComponentDeclaration component = Jsx.REACT.createComponentDeclaration();
		component.setName("JvmPropertiesTable");
		component.setExported(true);
		component.setDocumentation("Fetches JVM properties from props.dataUrl and renders them as a React Bootstrap table.");
		component.getParameters().add(parameter("props"));
		component.getHooks().add(Jsx.state("rows", "setRows", "null"));
		component.getHooks().add(Jsx.state("error", "setError", "null"));
		component.getHooks().add(Jsx.effect(EFFECT_BODY, "props.dataUrl"));

		// Typed HTML structure, with a keyed iterator over the data rows as the dynamic children of tbody
		TableHead head = Jsx.HTML.createTableHead();
		head.getRows().add(Jsx.row(Jsx.cell(true, Jsx.htmlText("Property")), Jsx.cell(true, Jsx.htmlText("Value"))));
		JsxNode rowTemplate = Jsx.intrinsic(Jsx.row(
				Jsx.cell(false, Jsx.content(Jsx.expression("row.name"))),
				Jsx.cell(false, Jsx.content(Jsx.expression("row.value")))));

		component.setRender(Jsx.conditional(
				"error",
				Jsx.children(Jsx.element(Jsx.external("Alert", "react-bootstrap"), Jsx.literal("variant", "danger")), Jsx.expression("String(error)")),
				Jsx.conditional(
						"!rows",
						Jsx.element(Jsx.external("Spinner", "react-bootstrap"), Jsx.literal("animation", "border"), Jsx.literal("role", "status")),
						Jsx.children(
								Jsx.element(
										Jsx.external("Table", "react-bootstrap"),
										Jsx.attribute("striped", "true"),
										Jsx.attribute("bordered", "true"),
										Jsx.attribute("hover", "true"),
										Jsx.literal("size", "sm")),
								Jsx.intrinsic(head),
								Jsx.children(Jsx.intrinsic(Jsx.HTML.createTableBody()), Jsx.iterator("rows", "row", "row.name", rowTemplate))))));
		module.getDeclarations().add(component);

		FunctionDeclaration mount = FACTORY.createFunctionDeclaration();
		mount.setName("mount");
		mount.setExported(true);
		mount.setDocumentation("Renders the table into the element, loading data from dataUrl.");
		mount.getParameters().add(parameter("element"));
		mount.getParameters().add(parameter("dataUrl"));
		CodeBlock mountBody = code(MOUNT_BODY);
		// Keeps import management aware of createElement used in the opaque text
		mountBody.getReferences().add(Jsx.external("createElement", "react"));
		mount.setBody(mountBody);
		module.getDeclarations().add(mount);
		return module;
	}

	private static String module() {
		return new ReactGenerator().generate(componentModule());
	}

	/**
	 * The page: Bootstrap CSS, the import map, a mount point, and a module script that
	 * mounts the generated module. Relative URLs only, so the page works at any base.
	 */
	private static String page() {
		Document page = WebTestSupport.page(
				"JVM Properties",
				IMPORT_MAP,
				WebTestSupport.main("container py-4", "JVM Properties"),
				MODULE_PATH,
				JSONObject.quote(DATA_PATH));
		page.getHead().getStylesheets().add(WebTestSupport.stylesheet(BOOTSTRAP_CSS));
		return WebTestSupport.html(page);
	}

	/**
	 * JVM properties as an array of name/value rows, in display order.
	 */
	private static JSONArray jvmProperties() {
		Runtime runtime = Runtime.getRuntime();
		ProcessHandle process = ProcessHandle.current();
		java.lang.Module testModule = JvmPropertiesTableTests.class.getModule();

		JSONArray ret = new JSONArray();
		row(ret, "JVM name", System.getProperty("java.vm.name"));
		row(ret, "JVM vendor", System.getProperty("java.vm.vendor"));
		row(ret, "Java version", Runtime.version().toString());
		row(ret, "Process id", String.valueOf(process.pid()));
		row(ret, "Started", process.info().startInstant().map(Object::toString).orElse("unknown"));
		row(ret, "Available processors", String.valueOf(runtime.availableProcessors()));
		row(ret, "Max memory", mebibytes(runtime.maxMemory()));
		row(ret, "Total memory", mebibytes(runtime.totalMemory()));
		row(ret, "Free memory", mebibytes(runtime.freeMemory()));
		row(ret, "Operating system", System.getProperty("os.name") + " " + System.getProperty("os.version") + " (" + System.getProperty("os.arch") + ")");
		row(ret, "Test module", testModule.isNamed() ? testModule.getName() : "unnamed (class path)");
		return ret;
	}

	// --- Helpers -------------------------------------------------------------

	private static void row(JSONArray rows, String name, String value) {
		rows.put(new JSONObject().put("name", name).put("value", value));
	}

	private static String mebibytes(long bytes) {
		return String.format("%,.1f MiB", bytes / (1024.0 * 1024.0));
	}

	private static java.util.List<String> names(JSONArray rows) {
		java.util.List<String> ret = new java.util.ArrayList<>();
		for (int i = 0; i < rows.length(); i++) {
			ret.add(rows.getJSONObject(i).getString("name"));
		}
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

	private static Parameter parameter(String name) {
		Parameter ret = FACTORY.createParameter();
		ret.setName(name);
		return ret;
	}

	private static CodeBlock code(String text) {
		CodeBlock ret = FACTORY.createCodeBlock();
		ret.setName("body");
		ret.setText(text);
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

	private static String contentType(HttpResponse<?> response) {
		return response.headers().firstValue("Content-Type").orElse("");
	}

}
