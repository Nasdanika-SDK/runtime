package org.nasdanika.sdk.runtime.models.react.flow.tests;

import java.util.List;
import java.util.function.Consumer;

import org.nasdanika.sdk.runtime.models.html.Element;
import org.nasdanika.sdk.runtime.models.html.HtmlFactory;
import org.nasdanika.sdk.runtime.models.react.EventAttribute;
import org.nasdanika.sdk.runtime.models.react.ExpressionAttribute;
import org.nasdanika.sdk.runtime.models.react.Intrinsic;
import org.nasdanika.sdk.runtime.models.react.JsxAttribute;
import org.nasdanika.sdk.runtime.models.react.JsxContainer;
import org.nasdanika.sdk.runtime.models.react.JsxContent;
import org.nasdanika.sdk.runtime.models.react.JsxExpression;
import org.nasdanika.sdk.runtime.models.react.JsxNode;
import org.nasdanika.sdk.runtime.models.react.JsxText;
import org.nasdanika.sdk.runtime.models.react.LibraryComponent;
import org.nasdanika.sdk.runtime.models.react.MemoHook;
import org.nasdanika.sdk.runtime.models.react.ReactFactory;
import org.nasdanika.sdk.runtime.models.react.StateHook;
import org.nasdanika.sdk.runtime.models.react.flow.DataValue;
import org.nasdanika.sdk.runtime.models.react.flow.FlowData;
import org.nasdanika.sdk.runtime.models.react.flow.FlowEdge;
import org.nasdanika.sdk.runtime.models.react.flow.FlowFactory;
import org.nasdanika.sdk.runtime.models.react.flow.FlowNode;
import org.nasdanika.sdk.runtime.models.react.flow.XYPosition;
import org.nasdanika.sdk.runtime.models.typescript.CodeBlock;
import org.nasdanika.sdk.runtime.models.typescript.NamedTypeReference;
import org.nasdanika.sdk.runtime.models.typescript.TypescriptFactory;

/**
 * Terse, typed construction of React Flow models in tests and demos.
 */
final class Flow {

	static final FlowFactory FLOW = FlowFactory.eINSTANCE;
	static final ReactFactory REACT = ReactFactory.eINSTANCE;
	static final HtmlFactory HTML = HtmlFactory.eINSTANCE;
	static final TypescriptFactory TS = TypescriptFactory.eINSTANCE;

	static final String XYFLOW = "@xyflow/react";

	private Flow() {
	}

	/**
	 * Configures a new object inline: with(FLOW.createFlowNode(), n -&gt; n.setId("a"))
	 */
	static <T> T with(T object, Consumer<T> configurator) {
		configurator.accept(object);
		return object;
	}

	// --- Flow ---

	static XYPosition position(double x, double y) {
		XYPosition ret = FLOW.createXYPosition();
		ret.setX(x);
		ret.setY(y);
		return ret;
	}

	static FlowData data(String label) {
		FlowData ret = FLOW.createFlowData();
		ret.setLabel(label);
		return ret;
	}

	static DataValue value(String name, String expression) {
		DataValue ret = FLOW.createDataValue();
		ret.setName(name);
		ret.setExpression(code(expression));
		return ret;
	}

	static FlowNode node(String id, String label, double x, double y) {
		FlowNode ret = FLOW.createFlowNode();
		ret.setId(id);
		ret.setData(data(label));
		ret.setPosition(position(x, y));
		return ret;
	}

	static FlowEdge edge(FlowNode source, FlowNode target) {
		FlowEdge ret = FLOW.createFlowEdge();
		ret.setId(source.getId() + "-" + target.getId());
		ret.setSource(source);
		ret.setTarget(target);
		return ret;
	}

	// --- TypeScript ---

	static CodeBlock code(String text) {
		CodeBlock ret = TS.createCodeBlock();
		ret.setText(text);
		return ret;
	}

	static NamedTypeReference external(String name, String moduleSpecifier) {
		NamedTypeReference ret = TS.createNamedTypeReference();
		ret.setQualifiedName(name);
		ret.setModuleSpecifier(moduleSpecifier);
		return ret;
	}

	// --- React ---

	static StateHook state(String value, String setter, String initialValue) {
		StateHook ret = REACT.createStateHook();
		ret.getBindings().add(value);
		ret.getBindings().add(setter);
		ret.setInitialValue(code(initialValue));
		return ret;
	}

	static MemoHook callback(String name, String function, String... dependencies) {
		MemoHook ret = REACT.createMemoHook();
		ret.setCallback(true);
		ret.getBindings().add(name);
		ret.setExpression(code(function));
		for (String dependency: dependencies) {
			ret.getDependencies().add(code(dependency));
		}
		return ret;
	}

	static JsxText text(String text) {
		JsxText ret = REACT.createJsxText();
		ret.setText(text);
		return ret;
	}

	static JsxExpression expression(String expression) {
		JsxExpression ret = REACT.createJsxExpression();
		ret.setExpression(code(expression));
		return ret;
	}

	static ExpressionAttribute attribute(String name, String expression) {
		ExpressionAttribute ret = REACT.createExpressionAttribute();
		ret.setAttributeName(name);
		ret.setExpression(code(expression));
		return ret;
	}

	static EventAttribute event(String name, String handler) {
		EventAttribute ret = REACT.createEventAttribute();
		ret.setAttributeName(name);
		ret.setHandler(code(handler));
		return ret;
	}

	static <T extends LibraryComponent> T attributes(T component, JsxAttribute... attributes) {
		component.getAttributes().addAll(List.of(attributes));
		return component;
	}

	static <T extends JsxContainer> T children(T container, JsxNode... children) {
		container.getChildren().addAll(List.of(children));
		return container;
	}

	// --- HTML ---

	static Intrinsic intrinsic(Element element, JsxAttribute... attributes) {
		Intrinsic ret = REACT.createIntrinsic();
		ret.setElement(element);
		ret.getAttributes().addAll(List.of(attributes));
		return ret;
	}

	static JsxContent content(JsxNode node) {
		JsxContent ret = REACT.createJsxContent();
		ret.setNode(node);
		return ret;
	}

	/**
	 * An HTML element with text and classes.
	 */
	static <T extends Element> T element(T element, String text, String... classes) {
		if (text != null) {
			org.nasdanika.sdk.runtime.models.html.Text htmlText = HTML.createText();
			htmlText.setContent(text);
			((org.nasdanika.sdk.runtime.models.html.Container) element).getContents().add(htmlText);
		}
		element.getClasses().addAll(List.of(classes));
		return element;
	}

}
