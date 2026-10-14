package org.nasdanika.sdk.runtime.models.react.flow.tests;

import org.nasdanika.sdk.runtime.models.html.Container;
import org.nasdanika.sdk.runtime.models.html.Element;
import org.nasdanika.sdk.runtime.models.html.HtmlFactory;
import org.nasdanika.sdk.runtime.models.html.Node;
import org.nasdanika.sdk.runtime.models.html.TableCell;
import org.nasdanika.sdk.runtime.models.html.TableRow;
import org.nasdanika.sdk.runtime.models.react.EffectHook;
import org.nasdanika.sdk.runtime.models.react.EventAttribute;
import org.nasdanika.sdk.runtime.models.react.ExpressionAttribute;
import org.nasdanika.sdk.runtime.models.react.Intrinsic;
import org.nasdanika.sdk.runtime.models.react.JsxAttribute;
import org.nasdanika.sdk.runtime.models.react.JsxConditional;
import org.nasdanika.sdk.runtime.models.react.JsxContainer;
import org.nasdanika.sdk.runtime.models.react.JsxContent;
import org.nasdanika.sdk.runtime.models.react.JsxElement;
import org.nasdanika.sdk.runtime.models.react.JsxExpression;
import org.nasdanika.sdk.runtime.models.react.JsxIterator;
import org.nasdanika.sdk.runtime.models.react.JsxNode;
import org.nasdanika.sdk.runtime.models.react.JsxText;
import org.nasdanika.sdk.runtime.models.react.LiteralAttribute;
import org.nasdanika.sdk.runtime.models.react.ReactFactory;
import org.nasdanika.sdk.runtime.models.react.StateHook;
import org.nasdanika.sdk.runtime.models.typescript.CodeBlock;
import org.nasdanika.sdk.runtime.models.typescript.Declaration;
import org.nasdanika.sdk.runtime.models.typescript.NamedTypeReference;
import org.nasdanika.sdk.runtime.models.typescript.Parameter;
import org.nasdanika.sdk.runtime.models.typescript.TypescriptFactory;

/**
 * Terse construction of React model trees for tests.
 */
final class Jsx {

	static final ReactFactory REACT = ReactFactory.eINSTANCE;

	static final HtmlFactory HTML = HtmlFactory.eINSTANCE;

	static final TypescriptFactory TS = TypescriptFactory.eINSTANCE;

	private Jsx() {
	}

	// --- TypeScript ---

	static CodeBlock code(String text) {
		CodeBlock ret = TS.createCodeBlock();
		ret.setText(text);
		return ret;
	}

	static Parameter parameter(String name) {
		Parameter ret = TS.createParameter();
		ret.setName(name);
		return ret;
	}

	/**
	 * Reference to an export of a package the generator does not own, e.g. a React Bootstrap component.
	 */
	static NamedTypeReference external(String name, String moduleSpecifier) {
		NamedTypeReference ret = TS.createNamedTypeReference();
		ret.setQualifiedName(name);
		ret.setModuleSpecifier(moduleSpecifier);
		return ret;
	}

	static NamedTypeReference reference(Declaration target) {
		NamedTypeReference ret = TS.createNamedTypeReference();
		ret.setTarget(target);
		return ret;
	}

	// --- Hooks ---

	static StateHook state(String value, String setter, String initialValue) {
		StateHook ret = REACT.createStateHook();
		ret.getBindings().add(value);
		ret.getBindings().add(setter);
		if (initialValue != null) {
			ret.setInitialValue(code(initialValue));
		}
		return ret;
	}

	static EffectHook effect(String body, String... dependencies) {
		EffectHook ret = REACT.createEffectHook();
		ret.setBody(code(body));
		for (String dependency: dependencies) {
			ret.getDependencies().add(code(dependency));
		}
		return ret;
	}

	// --- JSX ---

	static JsxElement element(NamedTypeReference componentType, JsxAttribute... attributes) {
		JsxElement ret = REACT.createJsxElement();
		ret.setComponentType(componentType);
		ret.getAttributes().addAll(java.util.List.of(attributes));
		return ret;
	}

	static JsxElement tag(String tag, JsxAttribute... attributes) {
		JsxElement ret = REACT.createJsxElement();
		ret.setTag(tag);
		ret.getAttributes().addAll(java.util.List.of(attributes));
		return ret;
	}

	static Intrinsic intrinsic(Element element, JsxAttribute... attributes) {
		Intrinsic ret = REACT.createIntrinsic();
		ret.setElement(element);
		ret.getAttributes().addAll(java.util.List.of(attributes));
		return ret;
	}

	static <T extends JsxContainer> T children(T container, JsxNode... children) {
		container.getChildren().addAll(java.util.List.of(children));
		return container;
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

	static JsxConditional conditional(String condition, JsxNode then, JsxNode otherwise) {
		JsxConditional ret = REACT.createJsxConditional();
		ret.setCondition(code(condition));
		ret.setThen(then);
		ret.setOtherwise(otherwise);
		return ret;
	}

	static JsxIterator iterator(String items, String variable, String key, JsxNode template) {
		JsxIterator ret = REACT.createJsxIterator();
		ret.setItems(code(items));
		ret.setVariable(variable);
		if (key != null) {
			ret.setKey(code(key));
		}
		ret.setTemplate(template);
		return ret;
	}

	static LiteralAttribute literal(String name, String value) {
		LiteralAttribute ret = REACT.createLiteralAttribute();
		ret.setAttributeName(name);
		ret.setValue(value);
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

	// --- HTML ---

	static JsxContent content(JsxNode node) {
		JsxContent ret = REACT.createJsxContent();
		ret.setNode(node);
		return ret;
	}

	static org.nasdanika.sdk.runtime.models.html.Text htmlText(String content) {
		org.nasdanika.sdk.runtime.models.html.Text ret = HTML.createText();
		ret.setContent(content);
		return ret;
	}

	static <T extends Container> T contents(T container, Node... contents) {
		container.getContents().addAll(java.util.List.of(contents));
		return container;
	}

	static TableRow row(TableCell... cells) {
		TableRow ret = HTML.createTableRow();
		ret.getCells().addAll(java.util.List.of(cells));
		return ret;
	}

	static TableCell cell(boolean header, Node... contents) {
		TableCell ret = HTML.createTableCell();
		ret.setHeader(header);
		return contents(ret, contents);
	}

}
