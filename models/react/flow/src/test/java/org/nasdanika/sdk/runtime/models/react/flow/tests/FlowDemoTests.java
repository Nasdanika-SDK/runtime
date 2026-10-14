package org.nasdanika.sdk.runtime.models.react.flow.tests;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.nasdanika.sdk.runtime.models.react.flow.tests.Flow.FLOW;
import static org.nasdanika.sdk.runtime.models.react.flow.tests.Flow.HTML;
import static org.nasdanika.sdk.runtime.models.react.flow.tests.Flow.REACT;
import static org.nasdanika.sdk.runtime.models.react.flow.tests.Flow.TS;
import static org.nasdanika.sdk.runtime.models.react.flow.tests.Flow.XYFLOW;
import static org.nasdanika.sdk.runtime.models.react.flow.tests.Flow.attribute;
import static org.nasdanika.sdk.runtime.models.react.flow.tests.Flow.attributes;
import static org.nasdanika.sdk.runtime.models.react.flow.tests.Flow.callback;
import static org.nasdanika.sdk.runtime.models.react.flow.tests.Flow.children;
import static org.nasdanika.sdk.runtime.models.react.flow.tests.Flow.content;
import static org.nasdanika.sdk.runtime.models.react.flow.tests.Flow.edge;
import static org.nasdanika.sdk.runtime.models.react.flow.tests.Flow.element;
import static org.nasdanika.sdk.runtime.models.react.flow.tests.Flow.event;
import static org.nasdanika.sdk.runtime.models.react.flow.tests.Flow.expression;
import static org.nasdanika.sdk.runtime.models.react.flow.tests.Flow.external;
import static org.nasdanika.sdk.runtime.models.react.flow.tests.Flow.intrinsic;
import static org.nasdanika.sdk.runtime.models.react.flow.tests.Flow.node;
import static org.nasdanika.sdk.runtime.models.react.flow.tests.Flow.text;
import static org.nasdanika.sdk.runtime.models.react.flow.tests.Flow.with;

import java.io.IOException;
import java.lang.module.ModuleDescriptor;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Supplier;

import org.junit.jupiter.api.Test;
import org.nasdanika.sdk.runtime.models.html.bootstrap.Theme;
import org.nasdanika.sdk.runtime.models.react.ComponentDeclaration;
import org.nasdanika.sdk.runtime.models.react.JsxElement;
import org.nasdanika.sdk.runtime.models.react.JsxNode;
import org.nasdanika.sdk.runtime.models.react.ValueBlock;
import org.nasdanika.sdk.runtime.models.react.flow.BackgroundVariant;
import org.nasdanika.sdk.runtime.models.react.flow.ColorMode;
import org.nasdanika.sdk.runtime.models.react.flow.ConnectionLineType;
import org.nasdanika.sdk.runtime.models.react.flow.EdgeType;
import org.nasdanika.sdk.runtime.models.react.flow.FlowEdge;
import org.nasdanika.sdk.runtime.models.react.flow.FlowNode;
import org.nasdanika.sdk.runtime.models.react.flow.HandlePosition;
import org.nasdanika.sdk.runtime.models.react.flow.HandleType;
import org.nasdanika.sdk.runtime.models.react.flow.MarkerKind;
import org.nasdanika.sdk.runtime.models.react.flow.NodeType;
import org.nasdanika.sdk.runtime.models.react.flow.PanelPosition;
import org.nasdanika.sdk.runtime.models.react.flow.ReactFlow;
import org.nasdanika.sdk.runtime.models.react.flow.layout.LayeredLayout;
import org.nasdanika.sdk.runtime.models.typescript.LiteralKind;
import org.nasdanika.sdk.runtime.models.typescript.Module;
import org.nasdanika.sdk.runtime.models.typescript.TypeAliasDeclaration;
import org.nasdanika.sdk.runtime.models.typescript.VariableDeclaration;
import org.nasdanika.sdk.runtime.models.typescript.VariableKind;

/**
 * Demo sites built from the React Flow model, with React Bootstrap pages and toolbars, and
 * static Bootstrap cards in custom nodes.
 * <p>
 * Browse with <code>jwebserver -d target/react-flow/site</code> and open
 * <a href="http://127.0.0.1:8000/">http://127.0.0.1:8000/</a>. The pages load React, React
 * Bootstrap and React Flow from esm.sh, so the browser needs internet access. TSX versions
 * of the modules are written to target/react-flow/tsx.
 */
public class FlowDemoTests {

	private static final org.nasdanika.sdk.runtime.models.react.bootstrap.BootstrapFactory RB_CORE =
			org.nasdanika.sdk.runtime.models.react.bootstrap.BootstrapFactory.eINSTANCE;

	private static final org.nasdanika.sdk.runtime.models.react.bootstrap.components.content.ContentFactory RB_CONTENT =
			org.nasdanika.sdk.runtime.models.react.bootstrap.components.content.ContentFactory.eINSTANCE;

	private static final org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.ContentFactory STATIC_CONTENT =
			org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.ContentFactory.eINSTANCE;

	private record Demo(String name, String title, String description, Theme theme, String style) {}

	private static final String INDEX_TITLE = "React Flow model demos";

	private static final String NODE_STYLE = """
			.model-node { min-width: 180px; }
			.model-node .card-body { padding: 0.5rem 0.75rem; }
			.react-flow__node.jdk { opacity: 0.6; font-style: italic; }
			""";

	private static final List<Demo> DEMOS = List.of(
			new Demo("pipeline", "Pipeline", "An uncontrolled flow: nodes and edges are the initial state, React Flow keeps it", Theme.BOOTSTRAP, null),
			new Demo("editor", "Editor", "A controlled flow with state hooks, connecting nodes, a toolbar using the React Flow instance, in the Darkly theme", Theme.DARKLY, null),
			new Demo("models", "Models", "Custom nodes with static Bootstrap cards - the Nasdanika models and their dependencies", Theme.ZEPHYR, NODE_STYLE),
			new Demo("modules", "JVM modules", "The modules of this test run and their dependencies, laid out by the layered layout", Theme.BOOTSTRAP, NODE_STYLE));

	/**
	 * Writes the page and module of a demo, the TSX version of the module, and the index.
	 *
	 * @param declarations Module declarations before the demo component, e.g. custom nodes
	 */
	private static String site(String name, Supplier<List<ComponentDeclaration>> declarations, Supplier<ComponentDeclaration> app) throws IOException {
		Demo demo = DEMOS.stream().filter(d -> d.name().equals(name)).findFirst().orElseThrow();
		String source = null;
		for (boolean tsx: new boolean[] { false, true }) {
			Module module = tsx ? REACT.createTsxModule() : TS.createModule();
			for (ComponentDeclaration declaration: declarations.get()) {
				module.getDeclarations().add(declaration);
				if ("ModelNode".equals(declaration.getName())) {
					module.getDeclarations().add(nodeTypes(declaration));
				}
			}
			SiteSupport.module(module, name, app.get());
			if (tsx) {
				SiteSupport.write(SiteSupport.TSX.resolve(name + ".tsx"), SiteSupport.generator().generate(module));
			} else {
				source = SiteSupport.generator().generate(module);
				SiteSupport.write(SiteSupport.SITE.resolve("modules/" + name + ".js"), source);
			}
		}
		SiteSupport.write(SiteSupport.SITE.resolve(name + ".html"), SiteSupport.html(SiteSupport.page(demo.title(), name, demo.theme(), demo.style())));

		SiteSupport.write(SiteSupport.SITE.resolve("index.html"), SiteSupport.html(SiteSupport.page(INDEX_TITLE, "index", Theme.BOOTSTRAP, null)));
		SiteSupport.write(SiteSupport.SITE.resolve("modules/index.js"), SiteSupport.generator().generate(SiteSupport.module(TS.createModule(), "index", index())));

		assertTrue(source.contains("export function mount(element)"), source);
		assertTrue(source.contains("from \"@xyflow/react\""), source);
		return source;
	}

	private static ComponentDeclaration app(String name, JsxNode render) {
		return with(REACT.createComponentDeclaration(), c -> {
			c.setName(name);
			c.setRender(render);
		});
	}

	/**
	 * React Bootstrap container with a heading, a lead paragraph and the content.
	 */
	private static JsxNode page(String title, String lead, JsxNode... content) {
		var container = with(RB_CORE.createContainer(), c -> {
			c.setFluid(true);
			c.getClasses().add("py-3");
		});
		container.getChildren().add(intrinsic(element(HTML.createHeading(), title, "h3", "mb-1")));
		container.getChildren().add(intrinsic(element(HTML.createParagraph(), lead, "text-body-secondary")));
		container.getChildren().addAll(List.of(content));
		if (!INDEX_TITLE.equals(title)) {
			container.getChildren().add(intrinsic(element(with(HTML.createAnchor(), a -> a.setHref("index.html")), "All demos", "d-block", "mt-2")));
		}
		return container;
	}

	/**
	 * A div with a height - React Flow fills its parent.
	 */
	private static JsxNode canvas(JsxNode flow) {
		return children(intrinsic(with(HTML.createDiv(), d -> {
			d.getClasses().addAll(List.of("border", "rounded"));
			d.getStyle().put("height", "75vh");
		})), flow);
	}

	private static ComponentDeclaration index() {
		var row = with(RB_CORE.createRow(), r -> {
			r.getClasses().add("g-4");
			r.getColumnsPerRow().add(with(RB_CORE.createRowColumns(), c -> {
				c.setBreakpoint(org.nasdanika.sdk.runtime.models.react.bootstrap.Breakpoint.XS);
				c.setCount(1);
			}));
			r.getColumnsPerRow().add(with(RB_CORE.createRowColumns(), c -> {
				c.setBreakpoint(org.nasdanika.sdk.runtime.models.react.bootstrap.Breakpoint.MD);
				c.setCount(2);
			}));
		});
		for (Demo demo: DEMOS) {
			row.getColumns().add(with(RB_CORE.createCol(), col -> col.getChildren().add(with(RB_CONTENT.createCard(), card -> {
				card.getClasses().add("h-100");
				card.getBodies().add(with(RB_CONTENT.createCardBody(), body -> {
					body.setTitle(with(RB_CONTENT.createCardTitle(), t -> t.setContent(demo.title())));
					body.getTexts().add(with(RB_CONTENT.createCardText(), t -> t.setContent(demo.description())));
					body.getLinks().add(with(RB_CONTENT.createCardLink(), l -> { l.setHref(demo.name() + ".html"); l.setContent("Open"); }));
				}));
			}))));
		}
		return app("Index", page(INDEX_TITLE, "Pages generated from the Nasdanika React Flow model", row));
	}

	// --- Pipeline: uncontrolled --------------------------------------------------

	private static ComponentDeclaration pipelineApp() {
		Map<String, FlowNode> nodes = new LinkedHashMap<>();
		for (String[] spec: new String[][] {
				{ "files", "Files", "input" }, { "database", "Database", "input" },
				{ "parse", "Parse", null }, { "validate", "Validate", null }, { "enrich", "Enrich", null },
				{ "store", "Store", "output" }, { "report", "Report", "output" } }) {
			FlowNode node = node(spec[0], spec[1], 0, 0);
			if (spec[2] != null) {
				node.setNodeType(NodeType.get(spec[2]));
			}
			nodes.put(spec[0], node);
		}
		List<FlowEdge> edges = new ArrayList<>();
		for (String[] spec: new String[][] { { "files", "parse" }, { "database", "parse" }, { "parse", "validate" }, { "validate", "enrich" }, { "enrich", "store" }, { "validate", "report" } }) {
			edges.add(with(edge(nodes.get(spec[0]), nodes.get(spec[1])), e -> {
				e.setAnimated(true);
				e.setMarkerEnd(with(FLOW.createEdgeMarker(), m -> m.setType(MarkerKind.ARROW_CLOSED)));
			}));
		}
		edges.get(5).setLabel("errors");
		new LayeredLayout().horizontal(true).nodeSpacing(100).layerSpacing(220).apply(new ArrayList<>(nodes.values()), edges);

		ReactFlow flow = with(FLOW.createReactFlow(), f -> {
			f.getNodes().addAll(nodes.values());
			f.getEdges().addAll(edges);
			f.setFitView(true);
			f.setBackground(with(FLOW.createBackground(), b -> { b.setVariant(BackgroundVariant.DOTS); b.setGap(20); }));
			f.setControls(FLOW.createControls());
			f.setMiniMap(with(FLOW.createMiniMap(), m -> { m.setPannable(true); m.setZoomable(true); }));
			f.getPanels().add(children(
					with(FLOW.createPanel(), p -> p.setPosition(PanelPosition.TOP_RIGHT)),
					children(with(RB_CONTENT.createBadge(), b -> b.setBg(org.nasdanika.sdk.runtime.models.react.bootstrap.Variant.SECONDARY)), text("Drag nodes, zoom, pan"))));
		});
		return app("PipelineDemo", page("Pipeline", DEMOS.get(0).description(), canvas(flow)));
	}

	@Test
	public void testPipeline() throws IOException {
		String source = site("pipeline", List::of, FlowDemoTests::pipelineApp);
		assertTrue(source.contains("defaultNodes"), source);
	}

	// --- Editor: controlled ------------------------------------------------------

	/**
	 * The flow with its state, in a ReactFlowProvider so the toolbar can use the React Flow instance.
	 */
	private static ComponentDeclaration editor() {
		var a = node("a", "Drag from a handle", 0, 0);
		var b = node("b", "to another handle", 250, 120);
		var c = node("c", "to connect nodes", 0, 240);
		return with(REACT.createComponentDeclaration(), component -> {
			component.setName("Editor");
			component.getHooks().add(with(FLOW.createNodesState(), h -> {
				h.getBindings().addAll(List.of("nodes", "setNodes", "onNodesChange"));
				h.getInitialNodes().addAll(List.of(a, b, c));
			}));
			component.getHooks().add(with(FLOW.createEdgesState(), h -> {
				h.getBindings().addAll(List.of("edges", "setEdges", "onEdgesChange"));
				h.getInitialEdges().add(with(edge(a, b), e -> e.setEdgeType(EdgeType.SMOOTH_STEP)));
			}));
			component.getHooks().add(with(FLOW.createReactFlowInstance(), h -> h.getBindings().add("flow")));
			var onConnect = callback("onConnect", "connection => setEdges(current => addEdge({ ...connection, type: \"smoothstep\" }, current))", "setEdges");
			onConnect.getExpression().getReferences().add(external("addEdge", XYFLOW));
			component.getHooks().add(onConnect);
			component.getHooks().add(callback("addNode", """
					() => setNodes(current => [...current, {
					  id: "n" + (current.length + 1),
					  position: { x: 100 + 40 * current.length, y: 60 + 30 * current.length },
					  data: { label: "Node " + (current.length + 1) }
					}])
					""", "setNodes"));

			var toolbar = with(RB_CONTENT.createButtonGroup(), g -> {
				g.setSize(org.nasdanika.sdk.runtime.models.react.bootstrap.Size.SM);
				g.getButtons().add(Flow.attributes(with(RB_CONTENT.createButton(), button -> button.setContent("Add node")), event("onClick", "addNode")));
				g.getButtons().add(Flow.attributes(
						with(RB_CONTENT.createButton(), button -> { button.setVariant(org.nasdanika.sdk.runtime.models.react.bootstrap.ButtonVariant.SECONDARY); button.setContent("Remove edges"); }),
						event("onClick", "() => setEdges([])")));
				g.getButtons().add(Flow.attributes(
						with(RB_CONTENT.createButton(), button -> { button.setVariant(org.nasdanika.sdk.runtime.models.react.bootstrap.ButtonVariant.INFO); button.setContent("Fit view"); }),
						event("onClick", "() => flow.fitView({ duration: 300 })")));
			});

			component.setRender(attributes(
					with(FLOW.createReactFlow(), f -> {
						f.setColorMode(ColorMode.DARK);
						f.setFitView(true);
						f.setConnectionLineType(ConnectionLineType.SMOOTH_STEP);
						f.getDeleteKeyCode().addAll(List.of("Backspace", "Delete"));
						f.setDefaultEdgeOptions(with(FLOW.createEdgeOptions(), o -> o.setMarkerEnd(with(FLOW.createEdgeMarker(), m -> m.setType(MarkerKind.ARROW_CLOSED)))));
						f.setBackground(with(FLOW.createBackground(), bg -> { bg.setVariant(BackgroundVariant.LINES); bg.setGap(40); }));
						f.setControls(FLOW.createControls());
						f.getPanels().add(children(with(FLOW.createPanel(), p -> p.setPosition(PanelPosition.TOP_LEFT)), toolbar));
					}),
					attribute("nodes", "nodes"),
					attribute("edges", "edges"),
					event("onNodesChange", "onNodesChange"),
					event("onEdgesChange", "onEdgesChange"),
					event("onConnect", "onConnect")));
		});
	}

	private static ComponentDeclaration editorApp() {
		JsxElement editor = REACT.createJsxElement();
		editor.setComponentType(with(TS.createNamedTypeReference(), r -> r.setQualifiedName("Editor")));
		return app("EditorDemo", page("Editor", DEMOS.get(1).description(), canvas(children(FLOW.createReactFlowProvider(), editor))));
	}

	@Test
	public void testEditor() throws IOException {
		String source = site("editor", () -> List.of(editor()), FlowDemoTests::editorApp);
		assertTrue(source.contains("useNodesState("), source);
		assertTrue(source.contains("useReactFlow()"), source);
	}

	// --- Models: custom nodes ----------------------------------------------------

	/**
	 * A custom node: a static Bootstrap card of the HTML Bootstrap model with handles, showing
	 * the label and description of the node data.
	 */
	/**
	 * type ModelNodeType = Node&lt;{ label: string; description: string }, "model"&gt; - for TSX.
	 */
	private static TypeAliasDeclaration modelNodeType() {
		return with(TS.createTypeAliasDeclaration(), alias -> {
			alias.setName("ModelNodeType");
			alias.setType(with(external("Node", XYFLOW), node -> {
				node.getTypeArguments().add(with(TS.createOpaqueTypeReference(), data -> data.setText("{ label: string; description: string }")));
				node.getTypeArguments().add(with(TS.createLiteralTypeReference(), type -> {
					type.setLiteralKind(LiteralKind.STRING);
					type.setValue("model");
				}));
			}));
		});
	}

	/**
	 * A custom node with props typed as NodeProps&lt;ModelNodeType&gt; if the type is not null.
	 */
	private static ComponentDeclaration modelNode(TypeAliasDeclaration type) {
		ComponentDeclaration ret = modelNode();
		if (type != null) {
			ret.getParameters().get(0).setType(with(external("NodeProps", XYFLOW), props -> props.getTypeArguments().add(with(TS.createNamedTypeReference(), r -> r.setTarget(type)))));
		}
		return ret;
	}

	private static ComponentDeclaration modelNode() {
		var card = with(STATIC_CONTENT.createCard(), c -> {
			c.getClasses().addAll(List.of("model-node", "shadow-sm"));
			c.setBorder(org.nasdanika.sdk.runtime.models.html.bootstrap.Variant.PRIMARY);
			c.getBodies().add(with(STATIC_CONTENT.createCardBody(), body -> {
				body.getContents().add(with(HTML.createStrong(), s -> s.getContents().add(content(expression("props.data.label")))));
				body.getContents().add(with(HTML.createGenericElement(), small -> {
					small.setName("small");
					small.getClasses().addAll(List.of("d-block", "text-body-secondary"));
					small.getContents().add(content(expression("props.data.description")));
				}));
			}));
		});
		return with(REACT.createComponentDeclaration(), c -> {
			c.setName("ModelNode");
			c.setMemo(true);
			c.getParameters().add(with(TS.createParameter(), p -> p.setName("props")));
			c.setRender(children(
					REACT.createJsxFragment(),
					with(FLOW.createHandle(), h -> { h.setHandleType(HandleType.TARGET); h.setPosition(HandlePosition.TOP); }),
					intrinsic(card),
					with(FLOW.createHandle(), h -> { h.setHandleType(HandleType.SOURCE); h.setPosition(HandlePosition.BOTTOM); })));
		});
	}

	/**
	 * const nodeTypes = { model: ModelNode } - a module level constant, the same object on every render.
	 */
	private static VariableDeclaration nodeTypes(ComponentDeclaration modelNode) {
		return with(TS.createVariableDeclaration(), v -> {
			v.setName("nodeTypes");
			v.setVariableKind(VariableKind.CONST);
			ValueBlock types = REACT.createValueBlock();
			types.setValue(with(FLOW.createFlowTypes(), t -> t.getTypes().add(with(FLOW.createFlowType(), type -> {
				type.setName("model");
				type.setComponent(with(TS.createNamedTypeReference(), r -> r.setTarget(modelNode)));
			}))));
			v.setInitializer(types);
		});
	}

	private static ComponentDeclaration modelsApp(Module module) {
		String[][] models = {
				{ "core", "Core", "Elements, markers, documentation" },
				{ "typescript", "TypeScript", "Packages, modules, declarations" },
				{ "html", "HTML", "Documents and elements" },
				{ "react", "React", "Components, hooks, JSX" },
				{ "html-bootstrap", "HTML Bootstrap", "Static Bootstrap, Bootswatch themes" },
				{ "react-bootstrap", "React Bootstrap", "React Bootstrap components" },
				{ "react-flow", "React Flow", "Flows, nodes, edges - this diagram" } };
		Map<String, FlowNode> nodes = new LinkedHashMap<>();
		for (String[] model: models) {
			FlowNode node = node(model[0], model[1], 0, 0);
			node.setCustomType("model");
			node.getData().getValues().add(with(FLOW.createDataValue(), v -> { v.setName("description"); v.setValue(model[2]); }));
			nodes.put(model[0], node);
		}
		List<FlowEdge> edges = new ArrayList<>();
		for (String[] dependency: new String[][] {
				{ "typescript", "core" }, { "html", "core" }, { "react", "typescript" }, { "react", "html" },
				{ "html-bootstrap", "html" }, { "react-bootstrap", "react" }, { "react-bootstrap", "html-bootstrap" }, { "react-flow", "react" } }) {
			edges.add(with(edge(nodes.get(dependency[0]), nodes.get(dependency[1])), e -> {
				e.setEdgeType(EdgeType.SMOOTH_STEP);
				e.setMarkerEnd(with(FLOW.createEdgeMarker(), m -> m.setType(MarkerKind.ARROW_CLOSED)));
			}));
		}
		new LayeredLayout().nodeSpacing(240).layerSpacing(150).apply(new ArrayList<>(nodes.values()), edges);

		VariableDeclaration nodeTypes = (VariableDeclaration) module.getDeclarations().stream().filter(d -> "nodeTypes".equals(d.getName())).findFirst().orElseThrow();
		ReactFlow flow = with(FLOW.createReactFlow(), f -> {
			f.getNodes().addAll(nodes.values());
			f.getEdges().addAll(edges);
			f.setNodeTypes(nodeTypes);
			f.setFitView(true);
			f.setBackground(FLOW.createBackground());
			f.setControls(with(FLOW.createControls(), c -> c.setShowInteractive(false)));
		});
		return app("ModelsDemo", page("Models", DEMOS.get(2).description(), canvas(flow)));
	}

	@Test
	public void testModels() throws IOException {
		// The demo component refers to the nodeTypes constant of its module
		String name = "models";
		Demo demo = DEMOS.get(2);
		String source = null;
		for (boolean tsx: new boolean[] { false, true }) {
			Module module = tsx ? REACT.createTsxModule() : TS.createModule();
			TypeAliasDeclaration modelNodeType = tsx ? modelNodeType() : null;
			if (modelNodeType != null) {
				module.getDeclarations().add(modelNodeType);
			}
			ComponentDeclaration modelNode = modelNode(modelNodeType);
			module.getDeclarations().add(modelNode);
			module.getDeclarations().add(nodeTypes(modelNode));
			SiteSupport.module(module, name, modelsApp(module));
			String generated = SiteSupport.generator().generate(module);
			if (tsx) {
				SiteSupport.write(SiteSupport.TSX.resolve(name + ".tsx"), generated);
			} else {
				source = generated;
				SiteSupport.write(SiteSupport.SITE.resolve("modules/" + name + ".js"), generated);
			}
		}
		SiteSupport.write(SiteSupport.SITE.resolve(name + ".html"), SiteSupport.html(SiteSupport.page(demo.title(), name, demo.theme(), demo.style())));
		assertTrue(source.contains("const nodeTypes = { model: ModelNode };"), source);
		assertTrue(source.contains("className: \"card"), source);
	}

	// --- JVM modules ---------------------------------------------------------------

	/**
	 * Modules reachable from the module of this test, JDK modules flagged and styled.
	 */
	private static ComponentDeclaration modulesApp() {
		java.lang.Module root = FlowDemoTests.class.getModule();
		ModuleLayer layer = root.getLayer() == null ? ModuleLayer.boot() : root.getLayer();
		Map<String, java.lang.Module> modules = new LinkedHashMap<>();
		List<java.lang.Module> roots = root.isNamed() ? List.of(root) : layer.modules().stream().filter(m -> !isJdk(m.getName())).toList();
		for (java.lang.Module module: roots) {
			collect(module, layer, modules);
		}
		Map<String, FlowNode> nodes = new LinkedHashMap<>();
		modules.keySet().stream().sorted(Comparator.comparing(FlowDemoTests::isJdk).thenComparing(Comparator.naturalOrder())).forEach(name -> {
			FlowNode node = node(name, name, 0, 0);
			node.setDeletable(false);
			if (isJdk(name)) {
				node.setClassName("jdk");
			}
			nodes.put(name, node);
		});
		List<FlowEdge> edges = new ArrayList<>();
		for (java.lang.Module module: modules.values()) {
			for (ModuleDescriptor.Requires requires: module.getDescriptor().requires()) {
				FlowNode target = nodes.get(requires.name());
				if (target != null) {
					edges.add(with(edge(nodes.get(module.getName()), target), e -> e.setMarkerEnd(with(FLOW.createEdgeMarker(), m -> m.setType(MarkerKind.ARROW)))));
				}
			}
		}
		new LayeredLayout().nodeSpacing(210).layerSpacing(120).apply(new ArrayList<>(nodes.values()), edges);

		ReactFlow flow = with(FLOW.createReactFlow(), f -> {
			f.getNodes().addAll(nodes.values());
			f.getEdges().addAll(edges);
			f.setFitView(true);
			f.setMinZoom(0.1);
			f.setBackground(FLOW.createBackground());
			f.setControls(FLOW.createControls());
			f.setMiniMap(with(FLOW.createMiniMap(), m -> m.setPannable(true)));
		});
		return app("ModulesDemo", page("JVM modules", DEMOS.get(3).description() + " - " + nodes.size() + " modules, " + edges.size() + " dependencies", canvas(flow)));
	}

	private static boolean isJdk(String name) {
		return name.startsWith("java.") || name.startsWith("jdk.");
	}

	private static void collect(java.lang.Module module, ModuleLayer layer, Map<String, java.lang.Module> modules) {
		if (modules.putIfAbsent(module.getName(), module) == null) {
			for (ModuleDescriptor.Requires requires: module.getDescriptor().requires()) {
				layer.findModule(requires.name()).ifPresent(required -> collect(required, layer, modules));
			}
		}
	}

	@Test
	public void testModules() throws IOException {
		String source = site("modules", List::of, FlowDemoTests::modulesApp);
		assertTrue(source.contains("org.nasdanika.sdk.runtime.models.react.flow"), source);
	}

}
