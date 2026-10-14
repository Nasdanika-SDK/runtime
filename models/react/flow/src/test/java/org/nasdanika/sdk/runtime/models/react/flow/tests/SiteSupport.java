package org.nasdanika.sdk.runtime.models.react.flow.tests;

import static org.nasdanika.sdk.runtime.models.react.flow.tests.Flow.HTML;
import static org.nasdanika.sdk.runtime.models.react.flow.tests.Flow.TS;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.LinkedHashMap;
import java.util.Map;

import org.nasdanika.sdk.runtime.models.html.Body;
import org.nasdanika.sdk.runtime.models.html.Div;
import org.nasdanika.sdk.runtime.models.html.Head;
import org.nasdanika.sdk.runtime.models.html.ImportMap;
import org.nasdanika.sdk.runtime.models.html.Meta;
import org.nasdanika.sdk.runtime.models.html.Script;
import org.nasdanika.sdk.runtime.models.html.Stylesheet;
import org.nasdanika.sdk.runtime.models.html.bootstrap.BootstrapDocument;
import org.nasdanika.sdk.runtime.models.html.bootstrap.BootstrapFactory;
import org.nasdanika.sdk.runtime.models.html.bootstrap.Theme;
import org.nasdanika.sdk.runtime.models.html.bootstrap.generator.BootstrapStructure;
import org.nasdanika.sdk.runtime.models.react.ComponentDeclaration;
import org.nasdanika.sdk.runtime.models.react.generator.ReactGenerator;
import org.nasdanika.sdk.runtime.models.typescript.CodeBlock;
import org.nasdanika.sdk.runtime.models.typescript.FunctionDeclaration;
import org.nasdanika.sdk.runtime.models.typescript.Module;
import org.nasdanika.sdk.runtime.models.typescript.Parameter;

/**
 * Static React Flow sites: Bootstrap documents of the HTML Bootstrap model which load React,
 * React Bootstrap and React Flow from esm.sh through an import map, and mount a module
 * generated from the React Flow model.
 * <p>
 * No build step and no npm: browse with <code>jwebserver -d target/react-flow/site</code>
 * and open <a href="http://127.0.0.1:8000/">http://127.0.0.1:8000/</a>.
 */
final class SiteSupport {

	static final Path SITE = Path.of("target", "react-flow", "site").toAbsolutePath();

	/**
	 * TSX versions of the demo modules, for inspection and type checking with tsc.
	 */
	static final Path TSX = Path.of("target", "react-flow", "tsx").toAbsolutePath();

	static final String REACT_VERSION = "19.3.0";

	static final String REACT_BOOTSTRAP_VERSION = "2.10.10";

	static final String XYFLOW_VERSION = "12.12.0";

	static final String XYFLOW_CSS = "https://cdn.jsdelivr.net/npm/@xyflow/react@" + XYFLOW_VERSION + "/dist/style.css";

	/**
	 * <code>?external=</code> keeps libraries importing bare React specifiers, so the import
	 * map resolves all of them to one React instance.
	 */
	static final Map<String, String> IMPORT_MAP = new LinkedHashMap<>();

	static {
		IMPORT_MAP.put("react", "https://esm.sh/react@" + REACT_VERSION);
		IMPORT_MAP.put("react/jsx-runtime", "https://esm.sh/react@" + REACT_VERSION + "/jsx-runtime");
		IMPORT_MAP.put("react-dom", "https://esm.sh/react-dom@" + REACT_VERSION + "?external=react");
		IMPORT_MAP.put("react-dom/client", "https://esm.sh/react-dom@" + REACT_VERSION + "/client?external=react");
		IMPORT_MAP.put("react-bootstrap", "https://esm.sh/react-bootstrap@" + REACT_BOOTSTRAP_VERSION + "?external=react,react-dom");
		IMPORT_MAP.put(Flow.XYFLOW, "https://esm.sh/@xyflow/react@" + XYFLOW_VERSION + "?external=react,react-dom");
	}

	private SiteSupport() {
	}

	/**
	 * Renders React Flow, React Bootstrap and static Bootstrap elements used as intrinsics.
	 */
	static ReactGenerator generator() {
		return new ReactGenerator(new BootstrapStructure());
	}

	/**
	 * A themed page with React Flow CSS, an optional page style, the import map, a mount point,
	 * and a module script calling <code>mount</code> of the module at modules/{name}.js.
	 */
	static BootstrapDocument page(String title, String name, Theme theme, String style) {
		BootstrapDocument page = BootstrapFactory.eINSTANCE.createBootstrapDocument();
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
		Stylesheet xyflow = HTML.createStylesheet();
		xyflow.setHref(XYFLOW_CSS);
		head.getStylesheets().add(xyflow);
		if (style != null) {
			Stylesheet pageStyle = HTML.createStylesheet();
			pageStyle.setContent("\n" + style);
			head.getStylesheets().add(pageStyle);
		}
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
		module.setHeader("// Generated from a Nasdanika React Flow model. Do not edit.");
		app.setExported(true);
		module.getDeclarations().add(app);

		FunctionDeclaration mount = TS.createFunctionDeclaration();
		mount.setName("mount");
		mount.setExported(true);
		mount.setDocumentation("Renders " + app.getName() + " into the element.");
		Parameter element = TS.createParameter();
		element.setName("element");
		mount.getParameters().add(element);
		CodeBlock body = Flow.code("createRoot(element).render(createElement(" + app.getName() + "));");
		body.getReferences().add(Flow.external("createRoot", "react-dom/client"));
		body.getReferences().add(Flow.external("createElement", "react"));
		mount.setBody(body);
		module.getDeclarations().add(mount);
		return module;
	}

	static String html(BootstrapDocument page) {
		return BootstrapStructure.generate(page) + "\n";
	}

	static void write(Path path, String content) throws IOException {
		Files.createDirectories(path.getParent());
		Files.writeString(path, content);
	}

}
