package org.nasdanika.sdk.runtime.models.diagram.elk.tests;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.nasdanika.sdk.runtime.models.diagram.Bounds;
import org.nasdanika.sdk.runtime.models.diagram.Connectable;
import org.nasdanika.sdk.runtime.models.diagram.Connection;
import org.nasdanika.sdk.runtime.models.diagram.Diagram;
import org.nasdanika.sdk.runtime.models.diagram.DiagramElement;
import org.nasdanika.sdk.runtime.models.diagram.Label;
import org.nasdanika.sdk.runtime.models.diagram.Node;
import org.nasdanika.sdk.runtime.models.diagram.Port;
import org.nasdanika.sdk.runtime.models.html.Div;
import org.nasdanika.sdk.runtime.models.html.HtmlFactory;
import org.nasdanika.sdk.runtime.models.react.ComponentDeclaration;
import org.nasdanika.sdk.runtime.models.react.Intrinsic;
import org.nasdanika.sdk.runtime.models.react.ReactFactory;
import org.nasdanika.sdk.runtime.models.react.flow.DataValue;
import org.nasdanika.sdk.runtime.models.react.flow.FlowData;
import org.nasdanika.sdk.runtime.models.react.flow.FlowEdge;
import org.nasdanika.sdk.runtime.models.react.flow.FlowFactory;
import org.nasdanika.sdk.runtime.models.react.flow.FlowNode;
import org.nasdanika.sdk.runtime.models.react.flow.ReactFlow;
import org.nasdanika.sdk.runtime.models.react.flow.XYPosition;
import org.nasdanika.sdk.runtime.models.typescript.CodeBlock;
import org.nasdanika.sdk.runtime.models.typescript.FunctionDeclaration;
import org.nasdanika.sdk.runtime.models.typescript.Module;
import org.nasdanika.sdk.runtime.models.typescript.NamedTypeReference;
import org.nasdanika.sdk.runtime.models.typescript.Parameter;
import org.nasdanika.sdk.runtime.models.typescript.TypescriptFactory;
import org.nasdanika.sdk.runtime.models.typescript.VariableDeclaration;
import org.nasdanika.sdk.runtime.models.typescript.VariableKind;

/**
 * Renders a laid out diagram as a React Flow model: nodes at the positions ELK computed, and
 * edges of a custom type that draws ELK's routes and labels as they are, instead of letting React
 * Flow route them.
 */
final class ReactFlowRenderer {

	static final FlowFactory FLOW = FlowFactory.eINSTANCE;
	static final ReactFactory REACT = ReactFactory.eINSTANCE;
	static final TypescriptFactory TS = TypescriptFactory.eINSTANCE;
	static final String XYFLOW = "@xyflow/react";

	private final Map<Node, FlowNode> flowNodes = new LinkedHashMap<>();

	private ReactFlowRenderer() {
	}

	/**
	 * A module with the custom node and edge components, a component rendering the flow, and a
	 * <code>mount(element)</code> function.
	 */
	static Module module(Diagram diagram, String name) {
		return new ReactFlowRenderer().render(diagram, name);
	}

	private Module render(Diagram diagram, String name) {
		Module module = TS.createModule();
		module.setName(name);
		module.setPath("modules/" + name);
		module.setHeader("// Generated from a laid out diagram. Do not edit.");
		module.getDeclarations().add(classNode());
		module.getDeclarations().add(packageNode());
		module.getDeclarations().add(elkEdge());
		VariableDeclaration nodeTypes = constant("nodeTypes", "{ classNode: ClassNode, packageNode: PackageNode }");
		VariableDeclaration edgeTypes = constant("edgeTypes", "{ elk: ElkEdge }");
		module.getDeclarations().add(nodeTypes);
		module.getDeclarations().add(edgeTypes);

		// tag::flow[]
		ReactFlow flow = FLOW.createReactFlow();
		flow.setNodeTypes(nodeTypes);
		flow.setEdgeTypes(edgeTypes);
		flow.setFitView(true);
		flow.setNodesDraggable(false); // <1>
		flow.setNodesConnectable(false);
		flow.setControls(FLOW.createControls());
		flow.setBackground(FLOW.createBackground());
		for (DiagramElement child: diagram.getChildren()) {
			if (child instanceof Node node) {
				addNode(node, null, flow);
			}
		}
		diagram.eAllContents().forEachRemaining(e -> {
			if (e instanceof Connection connection) {
				flow.getEdges().add(edge(connection));
			}
		});
		// end::flow[]

		Div container = HtmlFactory.eINSTANCE.createDiv();
		container.getStyle().put("height", "100vh");
		Intrinsic intrinsic = REACT.createIntrinsic();
		intrinsic.setElement(container);
		intrinsic.getChildren().add(flow);
		ComponentDeclaration app = REACT.createComponentDeclaration();
		app.setName("DiagramView");
		app.setExported(true);
		app.setRender(intrinsic);
		module.getDeclarations().add(app);
		module.getDeclarations().add(mount());
		return module;
	}

	// tag::node[]
	private void addNode(Node node, FlowNode parent, ReactFlow flow) {
		FlowNode flowNode = FLOW.createFlowNode();
		flowNode.setId(id(node));
		boolean container = node.getChildren().stream().anyMatch(Node.class::isInstance);
		flowNode.setCustomType(container ? "packageNode" : "classNode");
		Bounds bounds = node.getBounds();
		XYPosition position = FLOW.createXYPosition();
		position.setX(bounds.getX()); // <1>
		position.setY(bounds.getY());
		flowNode.setPosition(position);
		flowNode.setWidth(bounds.getWidth());
		flowNode.setHeight(bounds.getHeight());
		flowNode.setParent(parent); // <2>
		FlowData data = FLOW.createFlowData();
		data.setLabel(node.getName());
		if ("true".equals(node.getProperties().get(EcoreDiagrams.ABSTRACT))) {
			data.getValues().add(expression("abstract", "true"));
		}
		flowNode.setData(data);
		flow.getNodes().add(flowNode); // Parents come before their children, as React Flow requires
		flowNodes.put(node, flowNode);
		for (DiagramElement child: node.getChildren()) {
			if (child instanceof Node childNode) {
				addNode(childNode, flowNode, flow);
			}
		}
	}
	// end::node[]

	private static String id(Node node) {
		List<String> segments = new ArrayList<>();
		for (EObject e = node; e instanceof Node n; e = e.eContainer()) {
			segments.addFirst(n.getId());
		}
		return String.join("/", segments);
	}

	// tag::edge[]
	private FlowEdge edge(Connection connection) {
		FlowEdge edge = FLOW.createFlowEdge();
		edge.setId(connection.getId());
		edge.setSource(flowNodes.get(node(connection.getSource())));
		edge.setTarget(flowNodes.get(node(connection.getTarget())));
		edge.setCustomType("elk"); // <1>
		FlowData data = FLOW.createFlowData();
		data.getValues().add(expression("points", points(Coordinates.route(connection)))); // <2>
		data.getValues().add(expression("labels", labels(connection)));
		Map<String, String> properties = connection.getProperties().map();
		String kind = properties.get(EcoreDiagrams.KIND);
		data.getValues().add(value("kind", kind));
		boolean containment = "true".equals(properties.get(EcoreDiagrams.CONTAINMENT));
		boolean container = "true".equals(properties.get(EcoreDiagrams.CONTAINER));
		boolean bidirectional = connection.getChildren().size() > 1;
		if (containment) {
			data.getValues().add(value("markerStart", "diamond"));
		}
		if (EcoreDiagrams.GENERALIZATION.equals(kind)) {
			data.getValues().add(value("markerEnd", "triangle"));
		} else if (container) {
			data.getValues().add(value("markerEnd", "diamond"));
		} else if (!bidirectional) {
			data.getValues().add(value("markerEnd", "arrow"));
		}
		edge.setData(data);
		return edge;
	}
	// end::edge[]

	private static Node node(Connectable connectable) {
		return connectable instanceof Port port ? (Node) port.eContainer() : (Node) connectable;
	}

	private static String points(List<double[]> route) {
		List<String> points = new ArrayList<>();
		for (double[] point: route) {
			points.add("{ x: " + point[0] + ", y: " + point[1] + " }");
		}
		return "[" + String.join(", ", points) + "]";
	}

	private static String labels(Connection connection) {
		double[] frame = Coordinates.frame(connection);
		List<String> labels = new ArrayList<>();
		for (DiagramElement child: connection.getChildren()) {
			if (child instanceof Label label && label.getBounds() != null) {
				Bounds b = label.getBounds();
				labels.add("{ id: " + quote(label.getId()) + ", text: " + quote(label.getText())
						+ ", x: " + (frame[0] + b.getX()) + ", y: " + (frame[1] + b.getY())
						+ ", width: " + b.getWidth() + ", height: " + b.getHeight() + " }");
			}
		}
		return "[" + String.join(", ", labels) + "]";
	}

	static String quote(String text) {
		if (text == null) {
			return "null";
		}
		StringBuilder ret = new StringBuilder("\"");
		for (char c: text.toCharArray()) {
			switch (c) {
			case '"' -> ret.append("\\\"");
			case '\\' -> ret.append("\\\\");
			case '\n' -> ret.append("\\n");
			case '<' -> ret.append("\\u003c");
			default -> ret.append(c);
			}
		}
		return ret.append('"').toString();
	}

	// --- Components, as code ---

	// tag::elk-edge[]
	/**
	 * Draws the route ELK computed, with markers, and the labels where ELK put them.
	 */
	private static FunctionDeclaration elkEdge() {
		return function("ElkEdge", """
				const { id, data } = props;
				const path = data.points
				  .map((point, index) => (index === 0 ? "M " : "L ") + point.x + " " + point.y)
				  .join(" ");
				const marker = name => (name ? "url(#" + name + ")" : undefined);
				return createElement(Fragment, null,
				  createElement(BaseEdge, {
				    id,
				    path,
				    className: data.kind,
				    markerStart: marker(data.markerStart),
				    markerEnd: marker(data.markerEnd)
				  }),
				  createElement(EdgeLabelRenderer, null, data.labels.map(label =>
				    createElement("div", {
				      key: label.id,
				      className: "elk-label nodrag nopan",
				      style: {
				        transform: "translate(" + label.x + "px, " + label.y + "px)",
				        width: label.width + "px",
				        height: label.height + "px"
				      }
				    }, label.text))));""",
				external("createElement", "react"),
				external("Fragment", "react"),
				external("BaseEdge", XYFLOW),
				external("EdgeLabelRenderer", XYFLOW));
	}
	// end::elk-edge[]

	/**
	 * A class box. Edges are drawn by the edge component from ELK's routes, so the handles React
	 * Flow needs to attach edges are hidden.
	 */
	private static FunctionDeclaration classNode() {
		return function("ClassNode", """
				const { data } = props;
				return createElement("div", { className: "class-node" + (data.abstract ? " abstract" : "") },
				  createElement(Handle, { type: "target", position: Position.Top, className: "hidden-handle" }),
				  data.label,
				  createElement(Handle, { type: "source", position: Position.Bottom, className: "hidden-handle" }));""",
				external("createElement", "react"),
				external("Handle", XYFLOW),
				external("Position", XYFLOW));
	}

	private static FunctionDeclaration packageNode() {
		return function("PackageNode", """
				return createElement("div", { className: "package-node" },
				  createElement("div", { className: "package-title" }, props.data.label));""",
				external("createElement", "react"));
	}

	private static FunctionDeclaration mount() {
		FunctionDeclaration mount = function("mount", "createRoot(element).render(createElement(DiagramView));",
				external("createRoot", "react-dom/client"),
				external("createElement", "react"));
		mount.getParameters().getFirst().setName("element");
		mount.setExported(true);
		return mount;
	}

	private static FunctionDeclaration function(String name, String body, NamedTypeReference... references) {
		FunctionDeclaration function = TS.createFunctionDeclaration();
		function.setName(name);
		Parameter props = TS.createParameter();
		props.setName("props");
		function.getParameters().add(props);
		function.setBody(code(body, references));
		return function;
	}

	private static VariableDeclaration constant(String name, String initializer) {
		VariableDeclaration ret = TS.createVariableDeclaration();
		ret.setName(name);
		ret.setVariableKind(VariableKind.CONST);
		ret.setInitializer(code(initializer));
		return ret;
	}

	private static CodeBlock code(String text, NamedTypeReference... references) {
		CodeBlock ret = TS.createCodeBlock();
		ret.setText(text);
		for (NamedTypeReference reference: references) {
			ret.getReferences().add(reference);
		}
		return ret;
	}

	private static NamedTypeReference external(String name, String moduleSpecifier) {
		NamedTypeReference ret = TS.createNamedTypeReference();
		ret.setQualifiedName(name);
		ret.setModuleSpecifier(moduleSpecifier);
		return ret;
	}

	private static DataValue value(String name, String value) {
		DataValue ret = FLOW.createDataValue();
		ret.setName(name);
		ret.setValue(value);
		return ret;
	}

	private static DataValue expression(String name, String expression) {
		DataValue ret = FLOW.createDataValue();
		ret.setName(name);
		ret.setExpression(code(expression));
		return ret;
	}

}
