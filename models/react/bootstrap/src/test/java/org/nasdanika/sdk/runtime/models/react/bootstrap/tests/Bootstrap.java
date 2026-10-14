package org.nasdanika.sdk.runtime.models.react.bootstrap.tests;

import java.util.List;
import java.util.function.Consumer;

import org.nasdanika.sdk.runtime.models.html.Element;
import org.nasdanika.sdk.runtime.models.html.HtmlFactory;
import org.nasdanika.sdk.runtime.models.react.EventAttribute;
import org.nasdanika.sdk.runtime.models.react.ExpressionAttribute;
import org.nasdanika.sdk.runtime.models.react.Intrinsic;
import org.nasdanika.sdk.runtime.models.react.JsxAttribute;
import org.nasdanika.sdk.runtime.models.react.JsxConditional;
import org.nasdanika.sdk.runtime.models.react.JsxContainer;
import org.nasdanika.sdk.runtime.models.react.JsxContent;
import org.nasdanika.sdk.runtime.models.react.JsxExpression;
import org.nasdanika.sdk.runtime.models.react.JsxIterator;
import org.nasdanika.sdk.runtime.models.react.JsxNode;
import org.nasdanika.sdk.runtime.models.react.JsxText;
import org.nasdanika.sdk.runtime.models.react.LibraryComponent;
import org.nasdanika.sdk.runtime.models.react.MemoHook;
import org.nasdanika.sdk.runtime.models.react.ReactFactory;
import org.nasdanika.sdk.runtime.models.react.StateHook;
import org.nasdanika.sdk.runtime.models.react.bootstrap.BootstrapFactory;
import org.nasdanika.sdk.runtime.models.react.bootstrap.Breakpoint;
import org.nasdanika.sdk.runtime.models.react.bootstrap.ColumnSize;
import org.nasdanika.sdk.runtime.models.react.bootstrap.components.content.ContentFactory;
import org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.NavigationFactory;
import org.nasdanika.sdk.runtime.models.react.bootstrap.components.overlays.OverlaysFactory;
import org.nasdanika.sdk.runtime.models.react.bootstrap.forms.FormsFactory;
import org.nasdanika.sdk.runtime.models.typescript.CodeBlock;
import org.nasdanika.sdk.runtime.models.typescript.NamedTypeReference;
import org.nasdanika.sdk.runtime.models.typescript.TypescriptFactory;

/**
 * Terse, typed construction of React Bootstrap models in tests and demos.
 */
final class Bootstrap {

	static final BootstrapFactory CORE = BootstrapFactory.eINSTANCE;
	static final FormsFactory FORMS = FormsFactory.eINSTANCE;
	static final ContentFactory CONTENT = ContentFactory.eINSTANCE;
	static final NavigationFactory NAVIGATION = NavigationFactory.eINSTANCE;
	static final OverlaysFactory OVERLAYS = OverlaysFactory.eINSTANCE;
	static final ReactFactory REACT = ReactFactory.eINSTANCE;
	static final HtmlFactory HTML = HtmlFactory.eINSTANCE;
	static final TypescriptFactory TS = TypescriptFactory.eINSTANCE;

	static final String REACT_BOOTSTRAP = "react-bootstrap";

	private Bootstrap() {
	}

	/**
	 * Configures a new object inline: with(CONTENT.createButton(), b -&gt; b.setContent("Save"))
	 */
	static <T> T with(T object, Consumer<T> configurator) {
		configurator.accept(object);
		return object;
	}

	// --- TypeScript ---

	static CodeBlock code(String text) {
		CodeBlock ret = TS.createCodeBlock();
		ret.setText(text);
		return ret;
	}

	/**
	 * Reference to an export of a module the generator does not own.
	 */
	static NamedTypeReference external(String name, String moduleSpecifier) {
		NamedTypeReference ret = TS.createNamedTypeReference();
		ret.setQualifiedName(name);
		ret.setModuleSpecifier(moduleSpecifier);
		return ret;
	}

	// --- Hooks ---

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

	// --- JSX ---

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

	static JsxConditional when(String condition, JsxNode then) {
		JsxConditional ret = REACT.createJsxConditional();
		ret.setCondition(code(condition));
		ret.setThen(then);
		return ret;
	}

	static JsxIterator iterate(String items, String variable, String key, JsxNode template) {
		JsxIterator ret = REACT.createJsxIterator();
		ret.setItems(code(items));
		ret.setVariable(variable);
		ret.setKey(code(key));
		ret.setTemplate(template);
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

	/**
	 * Adds JSX attributes - expressions, events - to a library component.
	 */
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

	static org.nasdanika.sdk.runtime.models.html.Text htmlText(String content) {
		org.nasdanika.sdk.runtime.models.html.Text ret = HTML.createText();
		ret.setContent(content);
		return ret;
	}

	static JsxContent content(JsxNode node) {
		JsxContent ret = REACT.createJsxContent();
		ret.setNode(node);
		return ret;
	}

	/**
	 * An HTML element with text, as a JSX node.
	 */
	static Intrinsic element(Element element, String text, String... classes) {
		if (element instanceof org.nasdanika.sdk.runtime.models.html.Container container && text != null) {
			container.getContents().add(htmlText(text));
		}
		element.getClasses().addAll(List.of(classes));
		return intrinsic(element);
	}

	// --- Bootstrap ---

	static ColumnSize size(Breakpoint breakpoint, int span) {
		ColumnSize ret = CORE.createColumnSize();
		ret.setBreakpoint(breakpoint);
		ret.setSpan(span);
		return ret;
	}

	static ColumnSize size(Breakpoint breakpoint, int span, int offset) {
		ColumnSize ret = size(breakpoint, span);
		ret.setOffset(offset);
		return ret;
	}

}
