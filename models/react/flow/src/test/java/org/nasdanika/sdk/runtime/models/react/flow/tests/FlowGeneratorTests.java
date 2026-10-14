package org.nasdanika.sdk.runtime.models.react.flow.tests;

import static org.nasdanika.sdk.runtime.models.react.flow.tests.Flow.FLOW;
import static org.nasdanika.sdk.runtime.models.react.flow.tests.Flow.HTML;
import static org.nasdanika.sdk.runtime.models.react.flow.tests.Flow.REACT;
import static org.nasdanika.sdk.runtime.models.react.flow.tests.Flow.TS;
import static org.nasdanika.sdk.runtime.models.react.flow.tests.Flow.XYFLOW;
import static org.nasdanika.sdk.runtime.models.react.flow.tests.Flow.attribute;
import static org.nasdanika.sdk.runtime.models.react.flow.tests.Flow.attributes;
import static org.nasdanika.sdk.runtime.models.react.flow.tests.Flow.callback;
import static org.nasdanika.sdk.runtime.models.react.flow.tests.Flow.children;
import static org.nasdanika.sdk.runtime.models.react.flow.tests.Flow.edge;
import static org.nasdanika.sdk.runtime.models.react.flow.tests.Flow.event;
import static org.nasdanika.sdk.runtime.models.react.flow.tests.Flow.expression;
import static org.nasdanika.sdk.runtime.models.react.flow.tests.Flow.external;
import static org.nasdanika.sdk.runtime.models.react.flow.tests.Flow.intrinsic;
import static org.nasdanika.sdk.runtime.models.react.flow.tests.Flow.node;
import static org.nasdanika.sdk.runtime.models.react.flow.tests.Flow.text;
import static org.nasdanika.sdk.runtime.models.react.flow.tests.Flow.value;
import static org.nasdanika.sdk.runtime.models.react.flow.tests.Flow.with;

import org.junit.jupiter.api.Test;
import org.nasdanika.sdk.runtime.models.react.ComponentDeclaration;
import org.nasdanika.sdk.runtime.models.react.ValueBlock;
import org.nasdanika.sdk.runtime.models.react.flow.BackgroundVariant;
import org.nasdanika.sdk.runtime.models.react.flow.ColorMode;
import org.nasdanika.sdk.runtime.models.react.flow.ConnectionLineType;
import org.nasdanika.sdk.runtime.models.react.flow.EdgeType;
import org.nasdanika.sdk.runtime.models.react.flow.HandlePosition;
import org.nasdanika.sdk.runtime.models.react.flow.HandleType;
import org.nasdanika.sdk.runtime.models.react.flow.MarkerKind;
import org.nasdanika.sdk.runtime.models.react.flow.NodeType;
import org.nasdanika.sdk.runtime.models.react.flow.PanelPosition;
import org.nasdanika.sdk.runtime.models.react.generator.ReactGenerator;
import org.nasdanika.sdk.runtime.models.typescript.Module;
import org.nasdanika.sdk.runtime.models.typescript.VariableDeclaration;
import org.nasdanika.sdk.runtime.models.typescript.VariableKind;

/**
 * Rendering of the React Flow model.
 */
public class FlowGeneratorTests {

	private static String generate(Module module) {
		return new ReactGenerator().generate(module).replace("\r\n", "\n");
	}

	private static Module module(ComponentDeclaration component) {
		Module module = REACT.createTsxModule();
		module.setPath("flow");
		component.setExported(true);
		module.getDeclarations().add(component);
		return module;
	}

	@Test
	public void testUncontrolled() {
		var input = with(node("in", "Input", 0, 0), n -> n.setNodeType(NodeType.INPUT));
		var process = node("process", "Process", 0, 100);
		var output = with(node("out", "Output", 0, 200), n -> n.setNodeType(NodeType.OUTPUT));
		var flow = with(FLOW.createReactFlow(), f -> {
			f.getNodes().add(input);
			f.getNodes().add(process);
			f.getNodes().add(output);
			f.getEdges().add(with(edge(input, process), e -> { e.setAnimated(true); e.setLabel("raw"); }));
			f.getEdges().add(with(edge(process, output), e -> e.setMarkerEnd(with(FLOW.createEdgeMarker(), m -> m.setType(MarkerKind.ARROW_CLOSED)))));
			f.setFitView(true);
			f.setBackground(with(FLOW.createBackground(), b -> { b.setVariant(BackgroundVariant.DOTS); b.setGap(16); }));
			f.setControls(FLOW.createControls());
			f.setMiniMap(with(FLOW.createMiniMap(), m -> m.setPannable(true)));
			f.getPanels().add(children(with(FLOW.createPanel(), p -> p.setPosition(PanelPosition.TOP_LEFT)), text("Pipeline")));
		});
		ComponentDeclaration component = with(REACT.createComponentDeclaration(), c -> {
			c.setName("Pipeline");
			c.setRender(children(intrinsic(with(HTML.createDiv(), d -> d.getStyle().put("height", "400px"))), flow));
		});
		Expected.assertMatches("uncontrolled.tsx", generate(module(component)));
	}

	@Test
	public void testControlled() {
		var a = node("a", "A", 0, 0);
		var b = node("b", "B", 200, 0);
		ComponentDeclaration component = with(REACT.createComponentDeclaration(), c -> {
			c.setName("Editor");
			c.getHooks().add(with(FLOW.createNodesState(), h -> {
				h.getBindings().addAll(java.util.List.of("nodes", "setNodes", "onNodesChange"));
				h.getInitialNodes().add(a);
				h.getInitialNodes().add(b);
			}));
			c.getHooks().add(with(FLOW.createEdgesState(), h -> {
				h.getBindings().addAll(java.util.List.of("edges", "setEdges", "onEdgesChange"));
				h.getInitialEdges().add(with(edge(a, b), e -> e.setEdgeType(EdgeType.SMOOTH_STEP)));
			}));
			var onConnect = callback("onConnect", "connection => setEdges(current => addEdge(connection, current))", "setEdges");
			onConnect.getExpression().getReferences().add(external("addEdge", XYFLOW));
			c.getHooks().add(onConnect);
			c.setRender(attributes(
					with(FLOW.createReactFlow(), f -> {
						f.setColorMode(ColorMode.DARK);
						f.setConnectionLineType(ConnectionLineType.SMOOTH_STEP);
						f.setDefaultEdgeOptions(with(FLOW.createEdgeOptions(), o -> { o.setAnimated(true); o.setMarkerEnd(FLOW.createEdgeMarker()); }));
						f.getDeleteKeyCode().addAll(java.util.List.of("Backspace", "Delete"));
					}),
					attribute("nodes", "nodes"),
					attribute("edges", "edges"),
					event("onNodesChange", "onNodesChange"),
					event("onEdgesChange", "onEdgesChange"),
					event("onConnect", "onConnect")));
		});
		Expected.assertMatches("controlled.tsx", generate(module(component)));
	}

	@Test
	public void testCustomNodes() {
		ComponentDeclaration modelNode = with(REACT.createComponentDeclaration(), c -> {
			c.setName("ModelNode");
			c.getParameters().add(with(TS.createParameter(), p -> p.setName("props")));
			c.setRender(children(
					intrinsic(with(HTML.createDiv(), d -> d.getClasses().add("model-node"))),
					with(FLOW.createHandle(), h -> { h.setHandleType(HandleType.TARGET); h.setPosition(HandlePosition.TOP); }),
					expression("props.data.label"),
					with(FLOW.createHandle(), h -> { h.setHandleType(HandleType.SOURCE); h.setPosition(HandlePosition.BOTTOM); })));
		});
		VariableDeclaration nodeTypes = with(TS.createVariableDeclaration(), v -> {
			v.setName("nodeTypes");
			v.setVariableKind(VariableKind.CONST);
			ValueBlock types = REACT.createValueBlock();
			types.setValue(with(FLOW.createFlowTypes(), t -> t.getTypes().add(with(FLOW.createFlowType(), type -> {
				type.setName("model");
				type.setComponent(with(TS.createNamedTypeReference(), r -> r.setTarget(modelNode)));
			}))));
			v.setInitializer(types);
		});
		var html = with(node("html", "HTML", 0, 0), n -> {
			n.setCustomType("model");
			n.getData().getValues().add(value("level", "1"));
		});
		var react = with(node("react", "React", 0, 150), n -> n.setCustomType("model"));
		ComponentDeclaration diagram = with(REACT.createComponentDeclaration(), c -> {
			c.setName("Models");
			c.setRender(with(FLOW.createReactFlow(), f -> {
				f.setNodeTypes(nodeTypes);
				f.getNodes().add(html);
				f.getNodes().add(react);
				f.getEdges().add(edge(react, html));
			}));
		});
		Module module = module(diagram);
		module.getDeclarations().add(0, modelNode);
		module.getDeclarations().add(1, nodeTypes);
		Expected.assertMatches("custom-nodes.tsx", generate(module));
	}

}
