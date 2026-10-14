package org.nasdanika.sdk.runtime.models.react.bootstrap.tests;

import static org.nasdanika.sdk.runtime.models.react.bootstrap.tests.Bootstrap.HTML;
import static org.nasdanika.sdk.runtime.models.react.bootstrap.tests.Bootstrap.REACT_BOOTSTRAP;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.LinkedHashMap;
import java.util.Map;

import org.nasdanika.sdk.runtime.models.html.Body;
import org.nasdanika.sdk.runtime.models.html.Div;
import org.nasdanika.sdk.runtime.models.html.Document;
import org.nasdanika.sdk.runtime.models.html.Head;
import org.nasdanika.sdk.runtime.models.html.ImportMap;
import org.nasdanika.sdk.runtime.models.html.Meta;
import org.nasdanika.sdk.runtime.models.html.Script;
import org.nasdanika.sdk.runtime.models.html.bootstrap.BootstrapDocument;
import org.nasdanika.sdk.runtime.models.html.bootstrap.Theme;
import org.nasdanika.sdk.runtime.models.html.bootstrap.generator.BootstrapStructure;
import org.nasdanika.sdk.runtime.models.react.ComponentDeclaration;
import org.nasdanika.sdk.runtime.models.react.bootstrap.tests.Bootstrap;
import org.nasdanika.sdk.runtime.models.typescript.CodeBlock;
import org.nasdanika.sdk.runtime.models.typescript.FunctionDeclaration;
import org.nasdanika.sdk.runtime.models.typescript.Module;
import org.nasdanika.sdk.runtime.models.typescript.Parameter;

/**
 * Static React Bootstrap sites: pages built from the HTML model which load React,
 * React DOM and React Bootstrap from esm.sh through an import map, and mount a
 * module generated from the React Bootstrap model.
 * <p>
 * No build step and no npm: browse a generated site with the JDK web server, e.g.
 * <code>jwebserver -d target/react-bootstrap/site</code>, and open
 * <a href="http://127.0.0.1:8000/">http://127.0.0.1:8000/</a>.
 */
final class SiteSupport {

	static final Path SITE = Path.of("target", "react-bootstrap", "site").toAbsolutePath();

	/**
	 * TSX versions of the demo modules, for inspection and type checking with tsc.
	 */
	static final Path TSX = Path.of("target", "react-bootstrap", "tsx").toAbsolutePath();

	/**
	 * react and react-dom must be the same version, or React fails at render time.
	 */
	static final String REACT_VERSION = "19.3.0";

	static final String REACT_BOOTSTRAP_VERSION = "2.10.10";

	/**
	 * <code>?external=</code> keeps react-dom and react-bootstrap importing bare React
	 * specifiers, so the import map resolves all of them to one React instance.
	 */
	static final Map<String, String> IMPORT_MAP = new LinkedHashMap<>();

	static {
		IMPORT_MAP.put("react", "https://esm.sh/react@" + REACT_VERSION);
		IMPORT_MAP.put("react/jsx-runtime", "https://esm.sh/react@" + REACT_VERSION + "/jsx-runtime");
		IMPORT_MAP.put("react-dom", "https://esm.sh/react-dom@" + REACT_VERSION + "?external=react");
		IMPORT_MAP.put("react-dom/client", "https://esm.sh/react-dom@" + REACT_VERSION + "/client?external=react");
		IMPORT_MAP.put(REACT_BOOTSTRAP, "https://esm.sh/react-bootstrap@" + REACT_BOOTSTRAP_VERSION + "?external=react,react-dom");
	}

	private SiteSupport() {
	}

	static Document page(String title, String name) {
		return page(title, name, Theme.BOOTSTRAP);
	}

	/**
	 * A Bootstrap document of the HTML Bootstrap model with the theme, the import map, a mount
	 * point, and a module script calling <code>mount</code> of the module at modules/{name}.js.
	 * The Bootstrap JavaScript bundle is not loaded - React Bootstrap implements the behavior.
	 */
	static Document page(String title, String name, Theme theme) {
		BootstrapDocument page = org.nasdanika.sdk.runtime.models.html.bootstrap.BootstrapFactory.eINSTANCE.createBootstrapDocument();
		page.setLang("en");
		page.setTheme(theme);
		page.setJavaScript(false);

		Head head = HTML.createHead();
		page.setHead(head);
		head.setTitle(title);
		Meta viewport = HTML.createMeta();
		viewport.setName("viewport");
		viewport.setContent("width=device-width, initial-scale=1");
		head.getMetas().add(viewport);
		ImportMap importMap = HTML.createImportMap();
		importMap.getImports().putAll(IMPORT_MAP);
		head.setImportMap(importMap);

		Body body = HTML.createBody();
		page.setBody(body);
		Div root = HTML.createDiv();
		root.setId("root");
		body.getContents().add(root);
		Script mount = HTML.createScript();
		mount.setModule(true);
		mount.setContent("""

				import { mount } from "./modules/%s.js";
				mount(document.getElementById("root"));
				""".formatted(name));
		body.getContents().add(mount);
		return page;
	}

	/**
	 * Adds the component and a <code>mount(element)</code> function rendering it to a module.
	 */
	static <M extends Module> M module(M module, String name, ComponentDeclaration app) {
		module.setName(name);
		module.setPath("modules/" + name);
		module.setHeader("// Generated from a Nasdanika React Bootstrap model. Do not edit.");
		app.setExported(true);
		module.getDeclarations().add(app);

		FunctionDeclaration mount = Bootstrap.TS.createFunctionDeclaration();
		mount.setName("mount");
		mount.setExported(true);
		mount.setDocumentation("Renders " + app.getName() + " into the element.");
		Parameter element = Bootstrap.TS.createParameter();
		element.setName("element");
		mount.getParameters().add(element);
		CodeBlock body = Bootstrap.code("createRoot(element).render(createElement(" + app.getName() + "));");
		body.getReferences().add(Bootstrap.external("createRoot", "react-dom/client"));
		body.getReferences().add(Bootstrap.external("createElement", "react"));
		mount.setBody(body);
		module.getDeclarations().add(mount);
		return module;
	}

	static String html(Document page) {
		return BootstrapStructure.generate(page) + "\n";
	}

	static void write(Path path, String content) throws IOException {
		Files.createDirectories(path.getParent());
		Files.writeString(path, content);
	}

}
