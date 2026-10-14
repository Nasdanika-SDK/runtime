package org.nasdanika.sdk.runtime.models.react.flow.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.nasdanika.sdk.runtime.models.react.flow.tests.WebTestSupport.FACTORY;
import static org.nasdanika.sdk.runtime.models.react.flow.tests.WebTestSupport.badRequest;
import static org.nasdanika.sdk.runtime.models.react.flow.tests.WebTestSupport.binding;
import static org.nasdanika.sdk.runtime.models.react.flow.tests.WebTestSupport.demoPause;
import static org.nasdanika.sdk.runtime.models.react.flow.tests.WebTestSupport.function;
import static org.nasdanika.sdk.runtime.models.react.flow.tests.WebTestSupport.get;
import static org.nasdanika.sdk.runtime.models.react.flow.tests.WebTestSupport.method;
import static org.nasdanika.sdk.runtime.models.react.flow.tests.WebTestSupport.methodNotAllowed;
import static org.nasdanika.sdk.runtime.models.react.flow.tests.WebTestSupport.namedImport;
import static org.nasdanika.sdk.runtime.models.react.flow.tests.WebTestSupport.notFound;
import static org.nasdanika.sdk.runtime.models.react.flow.tests.WebTestSupport.path;
import static org.nasdanika.sdk.runtime.models.react.flow.tests.WebTestSupport.post;
import static org.nasdanika.sdk.runtime.models.react.flow.tests.WebTestSupport.readBody;
import static org.nasdanika.sdk.runtime.models.react.flow.tests.WebTestSupport.send;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.URI;
import java.net.http.HttpClient;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.junit.jupiter.api.Test;
import org.eclipse.emf.common.util.EList;
import org.nasdanika.sdk.runtime.models.html.Document;
import org.nasdanika.sdk.runtime.models.html.Stylesheet;
import org.nasdanika.sdk.runtime.models.react.tests.ModuleGraph;
import org.nasdanika.sdk.runtime.models.react.tests.ReactFlowDiagramTests;
import org.nasdanika.sdk.runtime.models.react.tests.WebTestSupport;
import org.nasdanika.sdk.runtime.models.typescript.Module;
import org.nasdanika.sdk.runtime.models.typescript.generator.Generator;

import com.sun.net.httpserver.HttpServer;

/**
 * A module dependency diagram with React Flow, covering the three interaction
 * scenarios:
 * <ol>
 * <li><b>Rearranging a generated layout.</b> The server generates a mediocre layered
 * layout ({@link ModuleGraph}); the user drags modules around, and positions are kept.</li>
 * <li><b>Reacting to user actions.</b> A switch shows and hides JDK modules; clicking a
 * module highlights it with its direct dependencies and dependents and dims the rest;
 * "Clear highlight" and a click on the background undo it.</li>
 * <li><b>Editing server-side information.</b> Dragging from a module's bottom handle to
 * another module's top handle adds a dependency; selecting an edge and pressing Delete
 * removes it.</li>
 * </ol>
 * <p>
 * Every interaction that should be kept is a <b>change</b>: <code>move</code>,
 * <code>connect</code>, <code>disconnect</code>, <code>resetLayout</code>. The same
 * changes go to one of two stores. On a static site they are appended to a log in local
 * storage and replayed over the static data on load. Against the server they are POSTed
 * to one command endpoint, which applies them to the server's model; the next GET of
 * the diagram returns the result. One command vocabulary, two stores, and the browser
 * code does not care which.
 * <p>
 * Set <code>-Dnasdanika.react.demo.seconds=300</code> to keep the server running.
 */
public class ReactFlowDiagramTests {

	private static final String PAGE_PATH = "index.html";

	private static final String MODULE_PATH = "modules/diagram.js";

	private static final String DATA_PATH = "data/diagram.json";

	private static final String CHANGES_PATH = "data/changes";

	private static final String STORAGE_KEY = "nasdanika.react.tests.module-diagram";

	private static final String XYFLOW_VERSION = "12.12.0";

	private static final Map<String, String> IMPORT_MAP = new LinkedHashMap<>();

	static {
		WebTestSupport.putReact(IMPORT_MAP);
		IMPORT_MAP.put("@xyflow/react", "https://esm.sh/@xyflow/react@" + XYFLOW_VERSION + "?external=react,react-dom");
	}

	// --- Component source --------------------------------------------------------

	private static final String DIAGRAM_BODY = """
			const [nodes, setNodes, onNodesChange] = useNodesState([]);
			const [edges, setEdges, onEdgesChange] = useEdgesState([]);
			const [error, setError] = useState(null);
			const [loaded, setLoaded] = useState(false);
			const [showJdk, setShowJdk] = useState(false);
			const [selected, setSelected] = useState(null);
			const store = useMemo(
			  () => props.storeUrl ? remoteStore(props.storeUrl) : localStore(props.storageKey),
			  [props.storeUrl, props.storageKey]);

			useEffect(() => {
			  Promise.all([fetchJson(props.dataUrl), store.load()])
			    .then(([data, changes]) => {
			      const state = changes.reduce(applyChange, { nodes: data.nodes, edges: data.edges });
			      setNodes(state.nodes);
			      setEdges(state.edges);
			      setLoaded(true);
			    })
			    .catch(setError);
			}, [props.dataUrl, store]);

			const send = change => store.send(change).catch(setError);

			const related = useMemo(() => selected ? relatedIds(selected, edges) : null, [selected, edges]);
			const jdkIds = useMemo(() => new Set(nodes.filter(node => node.data.jdk).map(node => node.id)), [nodes]);

			// What is shown is derived from the stored nodes and edges on every render, so
			// hiding and highlighting never touch the state that is saved.
			const viewNodes = useMemo(() => nodes.map(node => ({
			  ...node,
			  hidden: node.data.jdk && !showJdk,
			  className: !related ? "" : node.id === selected ? "nsd-selected" : related.has(node.id) ? "nsd-related" : "nsd-dimmed"
			})), [nodes, showJdk, related, selected]);

			const viewEdges = useMemo(() => edges.map(edge => {
			  const touchesSelected = related !== null && (edge.source === selected || edge.target === selected);
			  return {
			    ...edge,
			    hidden: !showJdk && (jdkIds.has(edge.source) || jdkIds.has(edge.target)),
			    animated: touchesSelected,
			    className: !related ? "" : touchesSelected ? "nsd-highlight" : "nsd-dimmed"
			  };
			}), [edges, showJdk, related, selected, jdkIds]);

			const onNodeDragStop = (event, node, dragged) => send({
			  op: "move",
			  positions: Object.fromEntries((dragged && dragged.length ? dragged : [node]).map(n => [n.id, n.position]))
			});

			const onConnect = connection => {
			  if (connection.source === connection.target) {
			    return;
			  }
			  const change = { op: "connect", source: connection.source, target: connection.target };
			  setEdges(current => connect(current, change.source, change.target));
			  send(change);
			};

			const onEdgesDelete = deleted => deleted.forEach(edge => send({ op: "disconnect", source: edge.source, target: edge.target }));

			const resetLayout = () => {
			  setNodes(current => resetPositions(current));
			  send({ op: "resetLayout" });
			};

			if (error) {
			  return h(Alert, { variant: "danger" }, String(error));
			}
			if (!loaded) {
			  return h(Spinner, { animation: "border", role: "status" });
			}

			return h("div", null,
			  h(Stack, { direction: "horizontal", gap: 3, className: "mb-2 flex-wrap" },
			    h(Form.Check, {
			      type: "switch",
			      id: "show-jdk",
			      label: "Show JDK modules",
			      checked: showJdk,
			      onChange: event => setShowJdk(event.target.checked)
			    }),
			    h(Button, { size: "sm", variant: "outline-secondary", disabled: !selected, onClick: () => setSelected(null) }, "Clear highlight"),
			    h(Button, { size: "sm", variant: "outline-secondary", onClick: resetLayout }, "Reset layout"),
			    h("span", { className: "text-body-secondary small", id: "diagram-status" },
			      (selected ? "Selected: " + selected + ". " : "Click a module to highlight its dependencies. ")
			      + "Changes are saved to " + (props.storeUrl ? "the server." : "this browser."))),
			  h("div", { style: { height: "75vh" }, className: "border rounded" },
			    h(ReactFlow, {
			      nodes: viewNodes,
			      edges: viewEdges,
			      onNodesChange,
			      onEdgesChange,
			      onConnect,
			      onEdgesDelete,
			      onNodeDragStop,
			      onNodeClick: (event, node) => setSelected(current => current === node.id ? null : node.id),
			      onPaneClick: () => setSelected(null),
			      deleteKeyCode: ["Backspace", "Delete"],
			      // The default minimum zoom (0.5) cannot fit a generated layout of this width.
			      minZoom: 0.1,
			      fitView: true
			    },
			      h(Background, null),
			      h(Controls, null),
			      h(MiniMap, { pannable: true, zoomable: true }))));
			""";

	private static final String APPLY_CHANGE_BODY = """
			switch (change.op) {
			  case "move":
			    return { ...state, nodes: state.nodes.map(node => change.positions[node.id] ? { ...node, position: change.positions[node.id] } : node) };
			  case "connect":
			    return { ...state, edges: connect(state.edges, change.source, change.target) };
			  case "disconnect":
			    return { ...state, edges: state.edges.filter(edge => edge.id !== edgeId(change.source, change.target)) };
			  case "resetLayout":
			    return { ...state, nodes: resetPositions(state.nodes) };
			  default:
			    console.warn("Unknown change", change);
			    return state;
			}
			""";

	private static final String CONNECT_BODY = """
			const id = edgeId(source, target);
			return edges.some(edge => edge.id === id) ? edges : [...edges, { id, source, target, markerEnd: { type: "arrowclosed" } }];
			""";

	private static final String EDGE_ID_BODY = """
			return source + "->" + target;
			""";

	private static final String RESET_POSITIONS_BODY = """
			return nodes.map(node => ({ ...node, position: node.data.initialPosition }));
			""";

	private static final String RELATED_IDS_BODY = """
			const ret = new Set();
			for (const edge of edges) {
			  if (edge.source === id) {
			    ret.add(edge.target);
			  }
			  if (edge.target === id) {
			    ret.add(edge.source);
			  }
			}
			return ret;
			""";

	private static final String FETCH_JSON_BODY = """
			return fetch(url).then(response => {
			  if (!response.ok) {
			    throw new Error(response.status + " " + response.statusText);
			  }
			  return response.json();
			});
			""";

	private static final String LOCAL_STORE_BODY = """
			const read = () => {
			  try {
			    return JSON.parse(window.localStorage.getItem(key) || "[]");
			  } catch (error) {
			    console.error(error);
			    return [];
			  }
			};
			return {
			  load: () => Promise.resolve(read()),
			  send: change => {
			    window.localStorage.setItem(key, JSON.stringify([...read(), change]));
			    return Promise.resolve();
			  }
			};
			""";

	private static final String REMOTE_STORE_BODY = """
			return {
			  // The server applies changes as they arrive, so its data is already current.
			  load: () => Promise.resolve([]),
			  send: change => fetch(url, {
			    method: "POST",
			    headers: { "Content-Type": "application/json" },
			    body: JSON.stringify(change)
			  }).then(response => {
			    if (!response.ok) {
			      throw new Error("Saving " + change.op + " failed: " + response.status + " " + response.statusText);
			    }
			  })
			};
			""";

	private static final String MOUNT_BODY = """
			createRoot(element).render(h(ModuleDiagram, options));
			""";

	private static final String PAGE_STYLE = """
			.react-flow__node.nsd-dimmed, .react-flow__edge.nsd-dimmed { opacity: 0.2; }
			.react-flow__node.nsd-selected { border-color: var(--bs-primary); box-shadow: 0 0 0 3px rgba(var(--bs-primary-rgb), 0.35); }
			.react-flow__node.nsd-related { border-color: var(--bs-primary); }
			.react-flow__edge.nsd-highlight .react-flow__edge-path { stroke: var(--bs-primary); stroke-width: 2; }
			""";

	// --- Tests -------------------------------------------------------------------

	@Test
	public void testStaticSite() throws IOException {
		Path site = Path.of("target", "react", "module-diagram-site").toAbsolutePath();
		Map<String, String> files = new LinkedHashMap<>();
		files.put(PAGE_PATH, page("{ dataUrl: \"" + DATA_PATH + "\", storageKey: \"" + STORAGE_KEY + "\" }"));
		files.put(MODULE_PATH, module());
		files.put(DATA_PATH, new DiagramState(new ModuleGraph(ReactFlowDiagramTests.class)).toJson().toString(2));
		WebTestSupport.writeSite(site, files);

		String module = Files.readString(site.resolve(MODULE_PATH));
		assertTrue(module.contains("from \"@xyflow/react\";"), module);
		assertTrue(module.contains("export function ModuleDiagram(props) {"), module);

		JSONObject data = new JSONObject(Files.readString(site.resolve(DATA_PATH)));
		assertTrue(data.getJSONArray("nodes").length() > 1);
		assertTrue(data.getJSONArray("edges").length() > 0);
	}

	@Test
	public void testServer() throws Exception {
		DiagramState state = new DiagramState(new ModuleGraph(ReactFlowDiagramTests.class));
		String page = page("{ dataUrl: \"" + DATA_PATH + "\", storeUrl: \"" + CHANGES_PATH + "\" }");
		Map<String, String> modules = Map.of(MODULE_PATH, module());

		HttpServer server = HttpServer.create(new InetSocketAddress(InetAddress.getLoopbackAddress(), 0), 0);
		try (ExecutorService executor = Executors.newVirtualThreadPerTaskExecutor()) {
			server.setExecutor(executor);

			server.createContext("/", exchange -> {
				if (!"GET".equals(method(exchange))) {
					methodNotAllowed(exchange);
				} else if ("/".equals(path(exchange)) || ("/" + PAGE_PATH).equals(path(exchange))) {
					send(exchange, 200, "text/html; charset=utf-8", page);
				} else {
					notFound(exchange);
				}
			});

			server.createContext("/modules/", exchange -> {
				String source = modules.get(path(exchange).substring(1));
				if (!"GET".equals(method(exchange))) {
					methodNotAllowed(exchange);
				} else if (source == null) {
					notFound(exchange);
				} else {
					send(exchange, 200, "text/javascript; charset=utf-8", source);
				}
			});

			// Data handler: GET the diagram, POST a change. The change endpoint is the
			// command side; the diagram is the query side.
			server.createContext("/data/", exchange -> {
				String path = path(exchange);
				if (("/" + DATA_PATH).equals(path)) {
					if ("GET".equals(method(exchange))) {
						send(exchange, 200, "application/json", state.toJson().toString());
					} else {
						methodNotAllowed(exchange);
					}
				} else if (("/" + CHANGES_PATH).equals(path)) {
					if ("POST".equals(method(exchange))) {
						try {
							state.apply(new JSONObject(readBody(exchange)));
							send(exchange, 200, "application/json", "{}");
						} catch (JSONException | IllegalArgumentException e) {
							badRequest(exchange, e.getMessage());
						}
					} else {
						methodNotAllowed(exchange);
					}
				} else {
					notFound(exchange);
				}
			});

			server.start();
			try (HttpClient client = HttpClient.newHttpClient()) {
				URI base = URI.create("http://127.0.0.1:" + server.getAddress().getPort() + "/");
				URI data = base.resolve(DATA_PATH);
				URI changes = base.resolve(CHANGES_PATH);

				assertEquals(page, get(client, base).body());
				assertTrue(get(client, base.resolve(MODULE_PATH)).body().contains("useNodesState"));

				JSONObject initial = new JSONObject(get(client, data).body());
				JSONObject firstNode = initial.getJSONArray("nodes").getJSONObject(0);
				String id = firstNode.getString("id");
				JSONObject firstEdge = initial.getJSONArray("edges").getJSONObject(0);

				// Scenario 1: a move is kept.
				assertEquals(200, post(client, changes, "application/json",
						new JSONObject().put("op", "move").put("positions", new JSONObject().put(id, new JSONObject().put("x", 12.5).put("y", 34))).toString()).statusCode());
				JSONObject moved = node(new JSONObject(get(client, data).body()), id).getJSONObject("position");
				assertEquals(12.5, moved.getDouble("x"));
				assertEquals(34, moved.getDouble("y"));

				// Scenario 3: server-side information edited through the diagram.
				String source = firstEdge.getString("target");
				String target = firstEdge.getString("source");
				assertEquals(200, post(client, changes, "application/json",
						new JSONObject().put("op", "connect").put("source", source).put("target", target).toString()).statusCode());
				assertTrue(hasEdge(new JSONObject(get(client, data).body()), source, target));

				assertEquals(200, post(client, changes, "application/json",
						new JSONObject().put("op", "disconnect").put("source", source).put("target", target).toString()).statusCode());
				assertFalse(hasEdge(new JSONObject(get(client, data).body()), source, target));

				// Reset restores the generated layout.
				assertEquals(200, post(client, changes, "application/json", "{\"op\":\"resetLayout\"}").statusCode());
				assertEquals(firstNode.getJSONObject("position").toString(),
						node(new JSONObject(get(client, data).body()), id).getJSONObject("position").toString());

				// Nonsense is refused rather than applied.
				assertEquals(400, post(client, changes, "application/json", "{\"op\":\"teleport\"}").statusCode());
				assertEquals(400, post(client, changes, "application/json",
						new JSONObject().put("op", "connect").put("source", source).put("target", "no.such.module").toString()).statusCode());

				demoPause(base);
			} finally {
				server.stop(0);
			}
		}
	}

	private static JSONObject node(JSONObject diagram, String id) {
		JSONArray nodes = diagram.getJSONArray("nodes");
		for (int i = 0; i < nodes.length(); i++) {
			if (id.equals(nodes.getJSONObject(i).getString("id"))) {
				return nodes.getJSONObject(i);
			}
		}
		throw new AssertionError("No node " + id);
	}

	private static boolean hasEdge(JSONObject diagram, String source, String target) {
		JSONArray edges = diagram.getJSONArray("edges");
		for (int i = 0; i < edges.length(); i++) {
			JSONObject edge = edges.getJSONObject(i);
			if (source.equals(edge.getString("source")) && target.equals(edge.getString("target"))) {
				return true;
			}
		}
		return false;
	}

	// --- Server-side model --------------------------------------------------------

	/**
	 * The server's copy of the diagram, and the Java side of the change vocabulary the
	 * browser replays from local storage. Changes are validated before they are applied:
	 * a connect to a module that is not in the diagram is refused.
	 */
	static final class DiagramState {

		private final Map<String, JSONObject> nodes = new LinkedHashMap<>();

		private final Map<String, JSONObject> edges = new LinkedHashMap<>();

		DiagramState(ModuleGraph graph) {
			for (ModuleGraph.Node node : graph.nodes) {
				JSONObject position = new JSONObject().put("x", node.x()).put("y", node.y());
				nodes.put(node.name(), new JSONObject()
						.put("id", node.name())
						.put("position", position)
						.put("deletable", false)
						.put("data", new JSONObject()
								.put("label", node.name())
								.put("jdk", node.jdk())
								.put("initialPosition", new JSONObject(position.toString()))));
			}
			for (ModuleGraph.Edge edge : graph.edges) {
				connect(edge.source(), edge.target());
			}
		}

		synchronized JSONObject toJson() {
			return new JSONObject()
					.put("nodes", new JSONArray(nodes.values()))
					.put("edges", new JSONArray(edges.values()));
		}

		synchronized void apply(JSONObject change) {
			switch (change.getString("op")) {
				case "move" -> {
					JSONObject positions = change.getJSONObject("positions");
					for (String id : positions.keySet()) {
						JSONObject position = positions.getJSONObject(id);
						node(id).put("position", new JSONObject().put("x", position.getDouble("x")).put("y", position.getDouble("y")));
					}
				}
				case "connect" -> connect(node(change.getString("source")).getString("id"), node(change.getString("target")).getString("id"));
				case "disconnect" -> edges.remove(edgeId(change.getString("source"), change.getString("target")));
				case "resetLayout" -> nodes.values().forEach(node -> node.put("position", new JSONObject(node.getJSONObject("data").getJSONObject("initialPosition").toString())));
				default -> throw new IllegalArgumentException("Unknown change: " + change.getString("op"));
			}
		}

		private JSONObject node(String id) {
			JSONObject ret = nodes.get(id);
			if (ret == null) {
				throw new IllegalArgumentException("No such module in the diagram: " + id);
			}
			return ret;
		}

		private void connect(String source, String target) {
			if (source.equals(target)) {
				throw new IllegalArgumentException("A module cannot require itself: " + source);
			}
			edges.putIfAbsent(edgeId(source, target), new JSONObject()
					.put("id", edgeId(source, target))
					.put("source", source)
					.put("target", target)
					.put("markerEnd", new JSONObject().put("type", "arrowclosed")));
		}

		private static String edgeId(String source, String target) {
			return source + "->" + target;
		}

	}

	// --- Artifacts ---------------------------------------------------------------

	private static String module() {
		Module module = FACTORY.createModule();
		module.setName("diagram");
		module.setPath(MODULE_PATH.substring(0, MODULE_PATH.length() - ".js".length()));
		module.setHeader("// Generated from a Nasdanika TypeScript model by ReactFlowDiagramTests. Do not edit.");

		module.getImports().add(namedImport("react", binding("createElement", "h"), binding("useEffect"), binding("useMemo"), binding("useState")));
		module.getImports().add(namedImport("react-dom/client", binding("createRoot")));
		module.getImports().add(namedImport("react-bootstrap", binding("Alert"), binding("Button"), binding("Form"), binding("Spinner"), binding("Stack")));
		module.getImports().add(namedImport("@xyflow/react",
				binding("Background"),
				binding("Controls"),
				binding("MiniMap"),
				binding("ReactFlow"),
				binding("useEdgesState"),
				binding("useNodesState")));

		module.getDeclarations().add(function("ModuleDiagram", true,
				"""
				Module dependency diagram. Loads { nodes, edges } from props.dataUrl. Changes
				(move, connect, disconnect, resetLayout) are POSTed to props.storeUrl when it is
				set, and otherwise appended to a log in local storage under props.storageKey and
				replayed on load.""",
				DIAGRAM_BODY, "props"));
		module.getDeclarations().add(function("applyChange", false,
				"Applies one change to { nodes, edges }. The browser's copy of the server's apply.",
				APPLY_CHANGE_BODY, "state", "change"));
		module.getDeclarations().add(function("connect", false, "Adds a dependency edge unless it exists.", CONNECT_BODY, "edges", "source", "target"));
		module.getDeclarations().add(function("edgeId", false, "Edge identity: one edge per ordered pair of modules.", EDGE_ID_BODY, "source", "target"));
		module.getDeclarations().add(function("resetPositions", false, "Puts every node back where the generated layout had it.", RESET_POSITIONS_BODY, "nodes"));
		module.getDeclarations().add(function("relatedIds", false, "Direct dependencies and dependents of a module.", RELATED_IDS_BODY, "id", "edges"));
		module.getDeclarations().add(function("fetchJson", false, "Fetches JSON, failing on an error status.", FETCH_JSON_BODY, "url"));
		module.getDeclarations().add(function("localStore", false, "Change log in local storage.", LOCAL_STORE_BODY, "key"));
		module.getDeclarations().add(function("remoteStore", false, "Changes POSTed to the server's command endpoint.", REMOTE_STORE_BODY, "url"));
		module.getDeclarations().add(function("mount", true, "Renders the diagram into the element.", MOUNT_BODY, "element", "options"));

		return new Generator().generate(module);
	}

	private static String page(String options) {
		Document page = WebTestSupport.page(
				"Module Dependencies",
				IMPORT_MAP,
				WebTestSupport.main("container-fluid py-3", "Module Dependencies"),
				MODULE_PATH,
				options);
		EList<Stylesheet> stylesheets = page.getHead().getStylesheets();
		stylesheets.add(WebTestSupport.stylesheet(WebTestSupport.BOOTSTRAP_CSS));
		stylesheets.add(WebTestSupport.stylesheet("https://cdn.jsdelivr.net/npm/@xyflow/react@" + XYFLOW_VERSION + "/dist/style.css"));
		stylesheets.add(WebTestSupport.style(PAGE_STYLE));
		return WebTestSupport.html(page);
	}

}
