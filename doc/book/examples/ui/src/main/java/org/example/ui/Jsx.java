package org.example.ui;

import java.util.List;

import org.nasdanika.sdk.runtime.models.html.Element;
import org.nasdanika.sdk.runtime.models.html.HtmlFactory;
import org.nasdanika.sdk.runtime.models.html.TableCell;
import org.nasdanika.sdk.runtime.models.html.TableHead;
import org.nasdanika.sdk.runtime.models.html.TableRow;
import org.nasdanika.sdk.runtime.models.html.Text;
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
import org.nasdanika.sdk.runtime.models.react.LiteralAttribute;
import org.nasdanika.sdk.runtime.models.react.MemoHook;
import org.nasdanika.sdk.runtime.models.react.ReactFactory;
import org.nasdanika.sdk.runtime.models.react.StateHook;
import org.nasdanika.sdk.runtime.models.typescript.CodeBlock;
import org.nasdanika.sdk.runtime.models.typescript.FunctionDeclaration;
import org.nasdanika.sdk.runtime.models.typescript.Import;
import org.nasdanika.sdk.runtime.models.typescript.ImportBinding;
import org.nasdanika.sdk.runtime.models.typescript.ImportKind;
import org.nasdanika.sdk.runtime.models.typescript.NamedTypeReference;
import org.nasdanika.sdk.runtime.models.typescript.Parameter;
import org.nasdanika.sdk.runtime.models.typescript.TypescriptFactory;

/**
 * Terse construction of React, TypeScript and HTML model objects: each method creates one
 * object with a factory and sets what the call passes.
 */
final class Jsx {

	static final ReactFactory REACT = ReactFactory.eINSTANCE;
	static final TypescriptFactory TS = TypescriptFactory.eINSTANCE;
	static final HtmlFactory HTML = HtmlFactory.eINSTANCE;

	private Jsx() {
	}

	// --- TypeScript ---

	static CodeBlock code(String text) {
		CodeBlock code = TS.createCodeBlock();
		code.setText(text);
		return code;
	}

	static Parameter parameter(String name) {
		Parameter parameter = TS.createParameter();
		parameter.setName(name);
		return parameter;
	}

	/**
	 * An export of a package the generator does not own, such as a React Bootstrap component.
	 */
	static NamedTypeReference external(String name, String moduleSpecifier) {
		NamedTypeReference reference = TS.createNamedTypeReference();
		reference.setQualifiedName(name);
		reference.setModuleSpecifier(moduleSpecifier);
		return reference;
	}

	static Import namedImport(String moduleSpecifier, String name) {
		ImportBinding binding = TS.createImportBinding();
		binding.setName(name);
		binding.setKind(ImportKind.NAMED);
		binding.setImportedName(name);
		Import ret = TS.createImport();
		ret.setName(moduleSpecifier);
		ret.setModuleSpecifier(moduleSpecifier);
		ret.getBindings().add(binding);
		return ret;
	}

	static FunctionDeclaration function(String name, String body, String... parameters) {
		FunctionDeclaration function = TS.createFunctionDeclaration();
		function.setName(name);
		function.setExported(true);
		for (String parameter: parameters) {
			function.getParameters().add(parameter(parameter));
		}
		function.setBody(code(body));
		return function;
	}

	// --- Hooks ---

	static StateHook state(String value, String setter, String initialValue) {
		StateHook state = REACT.createStateHook();
		state.getBindings().add(value);
		state.getBindings().add(setter);
		state.setInitialValue(code(initialValue));
		return state;
	}

	static EffectHook effect(String body, String... dependencies) {
		EffectHook effect = REACT.createEffectHook();
		effect.setBody(code(body));
		for (String dependency: dependencies) {
			effect.getDependencies().add(code(dependency));
		}
		return effect;
	}

	static MemoHook memo(String binding, String expression, String... dependencies) {
		MemoHook memo = REACT.createMemoHook();
		memo.getBindings().add(binding);
		memo.setExpression(code(expression));
		for (String dependency: dependencies) {
			memo.getDependencies().add(code(dependency));
		}
		return memo;
	}

	// --- JSX ---

	static JsxElement tag(String tag) {
		JsxElement element = REACT.createJsxElement();
		element.setTag(tag);
		return element;
	}

	static JsxElement element(NamedTypeReference componentType, JsxAttribute... attributes) {
		JsxElement element = REACT.createJsxElement();
		element.setComponentType(componentType);
		element.getAttributes().addAll(List.of(attributes));
		return element;
	}

	static Intrinsic intrinsic(Element element, JsxAttribute... attributes) {
		Intrinsic intrinsic = REACT.createIntrinsic();
		intrinsic.setElement(element);
		intrinsic.getAttributes().addAll(List.of(attributes));
		return intrinsic;
	}

	static <T extends JsxContainer> T children(T container, JsxNode... children) {
		container.getChildren().addAll(List.of(children));
		return container;
	}

	static JsxExpression expression(String expression) {
		JsxExpression ret = REACT.createJsxExpression();
		ret.setExpression(code(expression));
		return ret;
	}

	static JsxConditional conditional(String condition, JsxNode then, JsxNode otherwise) {
		JsxConditional conditional = REACT.createJsxConditional();
		conditional.setCondition(code(condition));
		conditional.setThen(then);
		conditional.setOtherwise(otherwise);
		return conditional;
	}

	static JsxIterator iterator(String items, String variable, String key, JsxNode template) {
		JsxIterator iterator = REACT.createJsxIterator();
		iterator.setItems(code(items));
		iterator.setVariable(variable);
		iterator.setKey(code(key));
		iterator.setTemplate(template);
		return iterator;
	}

	static LiteralAttribute literal(String name, String value) {
		LiteralAttribute attribute = REACT.createLiteralAttribute();
		attribute.setAttributeName(name);
		attribute.setValue(value);
		return attribute;
	}

	static ExpressionAttribute attribute(String name, String expression) {
		ExpressionAttribute attribute = REACT.createExpressionAttribute();
		attribute.setAttributeName(name);
		attribute.setExpression(code(expression));
		return attribute;
	}

	static EventAttribute event(String name, String handler) {
		EventAttribute attribute = REACT.createEventAttribute();
		attribute.setAttributeName(name);
		attribute.setHandler(code(handler));
		return attribute;
	}

	// --- HTML ---

	static Text text(String content) {
		Text text = HTML.createText();
		text.setContent(content);
		return text;
	}

	/**
	 * A table head with one row of header cells.
	 */
	static TableHead head(String... columns) {
		TableRow row = HTML.createTableRow();
		for (String column: columns) {
			TableCell cell = HTML.createTableCell();
			cell.setHeader(true);
			cell.getContents().add(text(column));
			row.getCells().add(cell);
		}
		TableHead head = HTML.createTableHead();
		head.getRows().add(row);
		return head;
	}

	/**
	 * A table row with a cell per JavaScript expression.
	 */
	static TableRow row(String... expressions) {
		TableRow row = HTML.createTableRow();
		for (String expression: expressions) {
			JsxContent content = REACT.createJsxContent();
			content.setNode(expression(expression));
			TableCell cell = HTML.createTableCell();
			cell.getContents().add(content);
			row.getCells().add(cell);
		}
		return row;
	}

}
