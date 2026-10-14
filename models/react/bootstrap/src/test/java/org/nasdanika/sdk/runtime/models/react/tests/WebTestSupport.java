package org.nasdanika.sdk.runtime.models.react.tests;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.Duration;
import java.util.List;
import java.util.Map;

import org.nasdanika.sdk.runtime.models.html.Body;
import org.nasdanika.sdk.runtime.models.html.Div;
import org.nasdanika.sdk.runtime.models.html.Document;
import org.nasdanika.sdk.runtime.models.html.Head;
import org.nasdanika.sdk.runtime.models.html.Heading;
import org.nasdanika.sdk.runtime.models.html.HtmlFactory;
import org.nasdanika.sdk.runtime.models.html.ImportMap;
import org.nasdanika.sdk.runtime.models.html.Main;
import org.nasdanika.sdk.runtime.models.html.Meta;
import org.nasdanika.sdk.runtime.models.html.Node;
import org.nasdanika.sdk.runtime.models.html.Script;
import org.nasdanika.sdk.runtime.models.html.Stylesheet;
import org.nasdanika.sdk.runtime.models.html.Text;
import org.nasdanika.sdk.runtime.models.typescript.CodeBlock;
import org.nasdanika.sdk.runtime.models.typescript.FunctionDeclaration;
import org.nasdanika.sdk.runtime.models.typescript.Import;
import org.nasdanika.sdk.runtime.models.typescript.ImportBinding;
import org.nasdanika.sdk.runtime.models.typescript.ImportKind;
import org.nasdanika.sdk.runtime.models.typescript.Parameter;
import org.nasdanika.sdk.runtime.models.typescript.TypescriptFactory;

import com.sun.net.httpserver.HttpExchange;

/**
 * Helpers shared by the diagram tests: building type-free TypeScript model modules,
 * writing a static site, and the bits of handler and client plumbing every server test
 * repeats.
 */
final class WebTestSupport {

	static final TypescriptFactory FACTORY = TypescriptFactory.eINSTANCE;

	static final HtmlFactory HTML = HtmlFactory.eINSTANCE;

	static final String REACT_VERSION = "19.3.0";

	static final String REACT_BOOTSTRAP_VERSION = "2.10.10";

	static final String BOOTSTRAP_CSS = "https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css";

	private WebTestSupport() {
	}

	/**
	 * React entries every React page needs. See {@link JvmPropertiesTableTests} for why
	 * each one is there.
	 */
	static void putReact(Map<String, String> importMap) {
		importMap.put("react", "https://esm.sh/react@" + REACT_VERSION);
		importMap.put("react/jsx-runtime", "https://esm.sh/react@" + REACT_VERSION + "/jsx-runtime");
		importMap.put("react-dom", "https://esm.sh/react-dom@" + REACT_VERSION + "?external=react");
		importMap.put("react-dom/client", "https://esm.sh/react-dom@" + REACT_VERSION + "/client?external=react");
		importMap.put("react-bootstrap", "https://esm.sh/react-bootstrap@" + REACT_BOOTSTRAP_VERSION + "?external=react,react-dom");
	}

	// --- HTML model ---------------------------------------------------------------

	/**
	 * Id of the element the generated module mounts into.
	 */
	static final String ROOT_ID = "root";

	/**
	 * A page shell: viewport meta, title and import map in the head; the content followed by
	 * a module script calling the generated module's <code>mount</code> in the body. Tests
	 * add stylesheets, base and other head content to the returned document.
	 *
	 * @param modulePath Path of the generated module, relative to the page
	 * @param mountArguments Arguments of <code>mount</code> after the root element, verbatim
	 */
	static Document page(String title, Map<String, String> importMap, Node content, String modulePath, String mountArguments) {
		Document page = HTML.createDocument();
		page.setLang("en");

		Head head = HTML.createHead();
		page.setHead(head);
		head.setTitle(title);
		Meta viewport = HTML.createMeta();
		viewport.setName("viewport");
		viewport.setContent("width=device-width, initial-scale=1");
		head.getMetas().add(viewport);
		ImportMap htmlImportMap = HTML.createImportMap();
		htmlImportMap.getImports().putAll(importMap);
		head.setImportMap(htmlImportMap);

		Body body = HTML.createBody();
		page.setBody(body);
		body.getContents().add(content);
		Script mount = HTML.createScript();
		mount.setModule(true);
		mount.setContent("""

				import { mount } from "./%s";
				mount(document.getElementById("%s")%s);
				""".formatted(modulePath, ROOT_ID, mountArguments == null || mountArguments.isBlank() ? "" : ", " + mountArguments));
		body.getContents().add(mount);
		return page;
	}

	/**
	 * <code>main</code> with a heading and the mount point.
	 */
	static Main main(String classes, String heading) {
		Main main = HTML.createMain();
		main.getClasses().addAll(List.of(classes.split("\\s+")));
		Heading h1 = HTML.createHeading();
		h1.getClasses().addAll(List.of("h3", "mb-3"));
		Text text = HTML.createText();
		text.setContent(heading);
		h1.getContents().add(text);
		main.getContents().add(h1);
		main.getContents().add(mountPoint());
		return main;
	}

	static Div mountPoint() {
		Div root = HTML.createDiv();
		root.setId(ROOT_ID);
		return root;
	}

	static Stylesheet stylesheet(String href) {
		Stylesheet stylesheet = HTML.createStylesheet();
		stylesheet.setHref(href);
		return stylesheet;
	}

	static Stylesheet style(String css) {
		Stylesheet stylesheet = HTML.createStylesheet();
		stylesheet.setContent("\n" + css);
		return stylesheet;
	}

	static String html(Document page) {
		return new org.nasdanika.sdk.runtime.models.html.generator.Generator().generate(page) + "\n";
	}

	// --- TypeScript model ---------------------------------------------------------

	static FunctionDeclaration function(String name, boolean exported, String documentation, String body, String... parameters) {
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

	static Import namedImport(String specifier, ImportBinding... bindings) {
		Import ret = FACTORY.createImport();
		ret.setName(specifier);
		ret.setModuleSpecifier(specifier);
		for (ImportBinding binding : bindings) {
			ret.getBindings().add(binding);
		}
		return ret;
	}

	static ImportBinding binding(String importedName) {
		return binding(importedName, null);
	}

	static ImportBinding defaultBinding(String localName) {
		ImportBinding ret = FACTORY.createImportBinding();
		ret.setName(localName);
		ret.setKind(ImportKind.DEFAULT);
		ret.setAlias(localName);
		return ret;
	}

	static ImportBinding binding(String importedName, String alias) {
		ImportBinding ret = FACTORY.createImportBinding();
		ret.setName(alias == null ? importedName : alias);
		ret.setKind(ImportKind.NAMED);
		ret.setImportedName(importedName);
		ret.setAlias(alias);
		return ret;
	}

	// --- Static site --------------------------------------------------------------

	static void writeSite(Path site, Map<String, String> files) throws IOException {
		for (Map.Entry<String, String> file : files.entrySet()) {
			Path target = site.resolve(file.getKey());
			Files.createDirectories(target.getParent());
			Files.writeString(target, file.getValue(), StandardCharsets.UTF_8);
		}
		System.out.println("Static site: " + site);
		System.out.println("View it with: jwebserver -d \"" + site + "\" and open http://127.0.0.1:8000/");
	}

	// --- Server -------------------------------------------------------------------

	static String method(HttpExchange exchange) {
		return exchange.getRequestMethod();
	}

	static String path(HttpExchange exchange) {
		return exchange.getRequestURI().getPath();
	}

	static String readBody(HttpExchange exchange) throws IOException {
		try (InputStream in = exchange.getRequestBody()) {
			return new String(in.readAllBytes(), StandardCharsets.UTF_8);
		}
	}

	static void send(HttpExchange exchange, int status, String contentType, String body) throws IOException {
		byte[] bytes = body.getBytes(StandardCharsets.UTF_8);
		exchange.getResponseHeaders().set("Content-Type", contentType);
		if (!contentType.startsWith("text/html") && !contentType.startsWith("text/javascript")) {
			exchange.getResponseHeaders().set("Cache-Control", "no-store");
		}
		exchange.sendResponseHeaders(status, bytes.length);
		try (OutputStream out = exchange.getResponseBody()) {
			out.write(bytes);
		}
	}

	static void notFound(HttpExchange exchange) throws IOException {
		send(exchange, 404, "text/plain; charset=utf-8", "Not found");
	}

	static void methodNotAllowed(HttpExchange exchange) throws IOException {
		send(exchange, 405, "text/plain; charset=utf-8", "Method not allowed");
	}

	static void badRequest(HttpExchange exchange, String message) throws IOException {
		send(exchange, 400, "text/plain; charset=utf-8", message);
	}

	/**
	 * Keeps a test server up for manual browsing when
	 * <code>-Dnasdanika.react.demo.seconds</code> is set.
	 */
	static void demoPause(URI base) throws InterruptedException {
		long seconds = Long.getLong("nasdanika.react.demo.seconds", 0);
		if (seconds > 0) {
			System.out.println("Serving " + base + " for " + seconds + " seconds");
			Thread.sleep(Duration.ofSeconds(seconds));
		}
	}

	// --- Client -------------------------------------------------------------------

	static HttpResponse<String> get(HttpClient client, URI uri) throws IOException, InterruptedException {
		return client.send(HttpRequest.newBuilder(uri).GET().build(), HttpResponse.BodyHandlers.ofString());
	}

	static HttpResponse<String> post(HttpClient client, URI uri, String contentType, String body) throws IOException, InterruptedException {
		return client.send(
				HttpRequest.newBuilder(uri).header("Content-Type", contentType).POST(HttpRequest.BodyPublishers.ofString(body)).build(),
				HttpResponse.BodyHandlers.ofString());
	}

	static HttpResponse<String> put(HttpClient client, URI uri, String contentType, String body) throws IOException, InterruptedException {
		return client.send(
				HttpRequest.newBuilder(uri).header("Content-Type", contentType).PUT(HttpRequest.BodyPublishers.ofString(body)).build(),
				HttpResponse.BodyHandlers.ofString());
	}

	static String contentType(HttpResponse<?> response) {
		return response.headers().firstValue("Content-Type").orElse("");
	}

}
