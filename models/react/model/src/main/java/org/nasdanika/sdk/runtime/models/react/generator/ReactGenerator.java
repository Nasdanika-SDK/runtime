package org.nasdanika.sdk.runtime.models.react.generator;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.regex.Pattern;

import org.eclipse.emf.ecore.EObject;
import org.nasdanika.sdk.runtime.common.NasdanikaException;
import org.nasdanika.sdk.runtime.models.html.Element;
import org.nasdanika.sdk.runtime.models.html.Input;
import org.nasdanika.sdk.runtime.models.html.Markup;
import org.nasdanika.sdk.runtime.models.html.Option;
import org.nasdanika.sdk.runtime.models.html.OptionGroup;
import org.nasdanika.sdk.runtime.models.html.Select;
import org.nasdanika.sdk.runtime.models.html.SelectItem;
import org.nasdanika.sdk.runtime.models.html.TextArea;
import org.nasdanika.sdk.runtime.models.html.generator.HtmlStructure;
import org.nasdanika.sdk.runtime.models.react.ComponentDeclaration;
import org.nasdanika.sdk.runtime.models.react.ContextDeclaration;
import org.nasdanika.sdk.runtime.models.react.ContextHook;
import org.nasdanika.sdk.runtime.models.react.ContextProvider;
import org.nasdanika.sdk.runtime.models.react.EffectHook;
import org.nasdanika.sdk.runtime.models.react.EventAttribute;
import org.nasdanika.sdk.runtime.models.react.ExpressionAttribute;
import org.nasdanika.sdk.runtime.models.react.Hook;
import org.nasdanika.sdk.runtime.models.react.Intrinsic;
import org.nasdanika.sdk.runtime.models.react.JsxAttribute;
import org.nasdanika.sdk.runtime.models.react.JsxBlock;
import org.nasdanika.sdk.runtime.models.react.JsxConditional;
import org.nasdanika.sdk.runtime.models.react.JsxContent;
import org.nasdanika.sdk.runtime.models.react.JsxElement;
import org.nasdanika.sdk.runtime.models.react.JsxExpression;
import org.nasdanika.sdk.runtime.models.react.JsxFragment;
import org.nasdanika.sdk.runtime.models.react.JsxIterator;
import org.nasdanika.sdk.runtime.models.react.JsxNode;
import org.nasdanika.sdk.runtime.models.react.JsxText;
import org.nasdanika.sdk.runtime.models.react.LiteralAttribute;
import org.nasdanika.sdk.runtime.models.react.MemoHook;
import org.nasdanika.sdk.runtime.models.react.OpaqueHook;
import org.nasdanika.sdk.runtime.models.react.OpaqueJsx;
import org.nasdanika.sdk.runtime.models.react.RefHook;
import org.nasdanika.sdk.runtime.models.react.SpreadAttribute;
import org.nasdanika.sdk.runtime.models.react.StateHook;
import org.nasdanika.sdk.runtime.models.react.TsxModule;
import org.nasdanika.sdk.runtime.models.typescript.CodeBlock;
import org.nasdanika.sdk.runtime.models.typescript.Declaration;
import org.nasdanika.sdk.runtime.models.typescript.Module;
import org.nasdanika.sdk.runtime.models.typescript.NamedTypeReference;
import org.nasdanika.sdk.runtime.models.typescript.Package;
import org.nasdanika.sdk.runtime.models.typescript.TypeReference;
import org.nasdanika.sdk.runtime.models.typescript.TypescriptFactory;
import org.nasdanika.sdk.runtime.models.typescript.generator.Generator;

/**
 * TypeScript generator which also emits the React model: components with hooks, contexts,
 * and JSX - {@link JsxBlock}s and component render trees.
 * <p>
 * JSX is written in one of two syntaxes, chosen per module:
 * <ul>
 * <li>JSX in a {@link TsxModule}, written to <code>.tsx</code> and compiled with the
 * automatic runtime (<code>"jsx": "react-jsx"</code>), so nothing is imported for it.</li>
 * <li><code>createElement</code> calls in any other module - plain JavaScript a browser
 * runs as is, without a build step.</li>
 * </ul>
 * Imports of React functions - hooks, <code>createElement</code>, <code>Fragment</code>,
 * <code>memo</code>, <code>createContext</code> - and of components and contexts are
 * managed: component types are value references, wherever they appear in JSX.
 * <p>
 * {@link Intrinsic} HTML elements are interpreted by {@link HtmlStructure}, the same way the
 * HTML text generator interprets them, with HTML attributes mapped to React props
 * (<code>class</code> to <code>className</code>, <code>for</code> to <code>htmlFor</code>,
 * <code>style</code> to an object, ...). Static form state becomes uncontrolled defaults:
 * <code>defaultValue</code> and <code>defaultChecked</code> on inputs, text areas and selects,
 * unless the intrinsic's JSX attributes provide <code>value</code> or <code>checked</code>.
 * Logical features of a head element - charset, title, base - are not emitted.
 */
public class ReactGenerator extends Generator {

	public static final String REACT = "react";

	public static final String TSX_EXTENSION = ".tsx";

	/**
	 * HTML attribute names which differ from React prop names, other than class.
	 */
	public static final Map<String, String> PROP_NAMES = Map.ofEntries(
			Map.entry("for", "htmlFor"),
			Map.entry("http-equiv", "httpEquiv"),
			Map.entry("accept-charset", "acceptCharset"),
			Map.entry("accesskey", "accessKey"),
			Map.entry("allowfullscreen", "allowFullScreen"),
			Map.entry("autocomplete", "autoComplete"),
			Map.entry("autofocus", "autoFocus"),
			Map.entry("autoplay", "autoPlay"),
			Map.entry("cellpadding", "cellPadding"),
			Map.entry("cellspacing", "cellSpacing"),
			Map.entry("charset", "charSet"),
			Map.entry("colspan", "colSpan"),
			Map.entry("contenteditable", "contentEditable"),
			Map.entry("crossorigin", "crossOrigin"),
			Map.entry("datetime", "dateTime"),
			Map.entry("enctype", "encType"),
			Map.entry("enterkeyhint", "enterKeyHint"),
			Map.entry("fetchpriority", "fetchPriority"),
			Map.entry("formaction", "formAction"),
			Map.entry("hreflang", "hrefLang"),
			Map.entry("inputmode", "inputMode"),
			Map.entry("maxlength", "maxLength"),
			Map.entry("minlength", "minLength"),
			Map.entry("nomodule", "noModule"),
			Map.entry("novalidate", "noValidate"),
			Map.entry("playsinline", "playsInline"),
			Map.entry("readonly", "readOnly"),
			Map.entry("referrerpolicy", "referrerPolicy"),
			Map.entry("rowspan", "rowSpan"),
			Map.entry("spellcheck", "spellCheck"),
			Map.entry("srcset", "srcSet"),
			Map.entry("tabindex", "tabIndex"),
			Map.entry("usemap", "useMap"));

	/**
	 * Input types whose value attribute is not the current value.
	 */
	private static final Set<String> STATIC_VALUE_INPUT_TYPES = Set.of("checkbox", "radio", "submit", "button", "reset", "hidden", "image");

	private static final Pattern SIMPLE_EXPRESSION = Pattern.compile("!?[A-Za-z_$][\\w$]*(\\.[A-Za-z_$][\\w$]*)*(\\(\\))?");

	private static final Pattern IDENTIFIER = Pattern.compile("[A-Za-z_$][\\w$]*");

	private static final Pattern EVENT_NAME = Pattern.compile("on[A-Z]\\w*");

	private static final int LINE_LENGTH = 80;

	private final HtmlStructure htmlStructure;

	public ReactGenerator() {
		this(new HtmlStructure());
	}

	public ReactGenerator(HtmlStructure htmlStructure) {
		this.htmlStructure = Objects.requireNonNull(htmlStructure, "htmlStructure");
	}

	// --- Modules ---------------------------------------------------------------

	@Override
	protected String fileExtension(Module module) {
		return module instanceof TsxModule && !module.isDeclarationOnly() ? TSX_EXTENSION : super.fileExtension(module);
	}

	@Override
	protected Map<String, Object> compilerOptions(Package tsPackage) {
		Map<String, Object> compilerOptions = super.compilerOptions(tsPackage);
		if (tsPackage.getModules().stream().anyMatch(TsxModule.class::isInstance)) {
			compilerOptions.put("jsx", "react-jsx");
		}
		return compilerOptions;
	}

	/**
	 * Adds the directive of a {@link TsxModule}, which has to precede any statement.
	 */
	@Override
	public String generate(Module module) {
		String source = super.generate(module);
		if (module instanceof TsxModule tsxModule && !isBlank(tsxModule.getDirective())) {
			return quote(tsxModule.getDirective()) + ";" + System.lineSeparator() + System.lineSeparator() + source;
		}
		return source;
	}

	// --- Imports ---------------------------------------------------------------

	@Override
	protected boolean isValuePosition(NamedTypeReference reference) {
		for (EObject container = reference.eContainer(); container != null; container = container.eContainer()) {
			if (container instanceof JsxNode || container instanceof JsxAttribute) {
				return true;
			}
		}
		return super.isValuePosition(reference);
	}

	@Override
	protected List<ImplicitReference> implicitReferences(Module module) {
		List<ImplicitReference> ret = new ArrayList<>(super.implicitReferences(module));
		Set<Object> seen = new HashSet<>();
		boolean jsx = module instanceof TsxModule;
		for (Iterator<EObject> it = module.eAllContents(); it.hasNext();) {
			EObject next = it.next();
			switch (next) {
				case StateHook h -> addReact(ret, seen, "useState");
				case EffectHook h -> addReact(ret, seen, h.isLayout() ? "useLayoutEffect" : "useEffect");
				case MemoHook h -> addReact(ret, seen, h.isCallback() ? "useCallback" : "useMemo");
				case ContextHook h -> {
					addReact(ret, seen, "useContext");
					addTarget(ret, seen, h.getContext(), false);
				}
				case RefHook h -> addReact(ret, seen, "useRef");
				case ContextDeclaration c -> addReact(ret, seen, "createContext");
				case ContextProvider p -> addTarget(ret, seen, p.getContext(), false);
				case ComponentDeclaration c -> {
					if (c.isMemo()) {
						addReact(ret, seen, "memo");
					}
					if (c.getParameters().isEmpty()) {
						addTarget(ret, seen, c.getPropsType(), true);
					}
				}
				default -> {}
			}
			if (next instanceof JsxNode node && !jsx) {
				addReact(ret, seen, "createElement");
				if (node instanceof JsxFragment) {
					addReact(ret, seen, "Fragment");
				}
			}
			if (next instanceof JsxIterator iterator && iterator.getTemplate() instanceof JsxFragment) {
				// A keyed fragment is written as Fragment in both syntaxes
				addReact(ret, seen, "Fragment");
			}
		}
		return ret;
	}

	private static void addReact(List<ImplicitReference> references, Set<Object> seen, String name) {
		if (seen.add(name)) {
			references.add(new ImplicitReference(react(name), false));
		}
	}

	private static void addTarget(List<ImplicitReference> references, Set<Object> seen, Declaration target, boolean typeOnly) {
		if (target != null && seen.add(target)) {
			references.add(new ImplicitReference(target(target), typeOnly));
		}
	}

	private static NamedTypeReference react(String name) {
		NamedTypeReference ret = TypescriptFactory.eINSTANCE.createNamedTypeReference();
		ret.setQualifiedName(name);
		ret.setModuleSpecifier(REACT);
		return ret;
	}

	private static NamedTypeReference target(Declaration target) {
		NamedTypeReference ret = TypescriptFactory.eINSTANCE.createNamedTypeReference();
		ret.setTarget(target);
		return ret;
	}

	/**
	 * @return Local name of a React export, as the import manager bound it
	 */
	protected String react(String name, ImportManager im) {
		return im.localName(react(name));
	}

	protected String localName(Declaration declaration, ImportManager im) {
		return im.localName(target(declaration));
	}

	// --- Declarations ----------------------------------------------------------

	@Override
	protected String declaration(Declaration declaration, boolean declarationOnly, ImportManager im) {
		return switch (declaration) {
			case ComponentDeclaration component -> component(component, declarationOnly, im);
			case ContextDeclaration context -> context(context, declarationOnly, im);
			default -> super.declaration(declaration, declarationOnly, im);
		};
	}

	/**
	 * <pre>
	 * export function Name(props) {
	 *   hooks, in declaration order
	 *   prelude - the body
	 *   return render;
	 * }
	 * </pre>
	 * Wrapped in <code>memo</code> as <code>export const Name = memo(function Name(...) {...});</code>
	 */
	protected String component(ComponentDeclaration component, boolean declarationOnly, ImportManager im) {
		StringBuilder ret = new StringBuilder(jsDoc(component, ""));
		String name = name(component);
		String exportModifier = component.isExported() ? "export " : "";

		StringBuilder signature = new StringBuilder(typeParameters(component.getTypeParameters(), im));
		if (component.getParameters().isEmpty() && component.getPropsType() != null) {
			signature.append("(props: ").append(localName(component.getPropsType(), im)).append(")");
		} else {
			signature.append(parameters(component.getParameters(), im));
		}
		if (component.getReturnType() != null) {
			signature.append(": ").append(typeReference(component.getReturnType(), im));
		}

		if (declarationOnly || component.isAmbient()) {
			String declare = component.isAmbient() && !declarationOnly ? "declare " : "";
			return ret.append(exportModifier).append(declare).append("function ").append(name).append(signature).append(";").append(System.lineSeparator()).toString();
		}

		List<String> statements = new ArrayList<>();
		for (Hook hook: component.getHooks()) {
			statements.add(hook(hook, im));
		}
		if (component.getBody() != null) {
			String prelude = code(component.getBody(), true, im);
			if (!isBlank(prelude)) {
				statements.add(normalize(prelude));
			}
		}
		if (component.getRender() != null) {
			statements.add(returnStatement(component.getRender(), im));
		}
		String body = "{" + System.lineSeparator() + reindent(String.join("\n", statements), getIndent()) + "}";

		String function = (component.isAsync() ? "async " : "") + "function " + name + signature + " " + body;
		if (component.isMemo()) {
			ret.append(exportModifier).append("const ").append(name).append(" = ").append(react("memo", im)).append("(").append(function).append(");");
		} else {
			ret.append(exportModifier).append(function);
		}
		return ret.append(System.lineSeparator()).toString();
	}

	protected String hook(Hook hook, ImportManager im) {
		List<String> bindings = hook.getBindings();
		return switch (hook) {
			case StateHook state -> "const [" + String.join(", ", bindings) + "] = "
					+ react("useState", im) + typeArgument(state.getStateType(), im) + "(" + orEmpty(expression(state.getInitialValue(), im)) + ");";
			case EffectHook effect -> {
				StringBuilder ret = new StringBuilder(react(effect.isLayout() ? "useLayoutEffect" : "useEffect", im)).append("(() => {\n");
				String body = effect.getBody() == null ? null : code(effect.getBody(), true, im);
				if (!isBlank(body)) {
					ret.append(indent(normalize(body), 1)).append("\n");
				}
				if (effect.getCleanup() != null) {
					ret.append(getIndent()).append("return () => {\n")
						.append(indent(normalize(code(effect.getCleanup(), true, im)), 2)).append("\n")
						.append(getIndent()).append("};\n");
				}
				yield assign(bindings) + ret.append("}, ").append(dependencies(effect.getDependencies(), im)).append(");");
			}
			case MemoHook memo -> {
				String expression = orEmpty(expression(memo.getExpression(), im));
				String call = memo.isCallback()
						? react("useCallback", im) + "(" + expression + ", "
						: react("useMemo", im) + "(() => (" + expression + "), ";
				yield assign(bindings) + call + dependencies(memo.getDependencies(), im) + ");";
			}
			case ContextHook context -> assign(bindings) + react("useContext", im) + "(" + localName(context.getContext(), im) + ");";
			case RefHook ref -> {
				String initialValue = expression(ref.getInitialValue(), im);
				yield assign(bindings) + react("useRef", im) + typeArgument(ref.getRefType(), im) + "(" + (isBlank(initialValue) ? "null" : initialValue) + ");";
			}
			case OpaqueHook opaque -> normalize(opaque.getText());
			default -> throw new NasdanikaException("Unsupported hook: " + hook.eClass().getName());
		};
	}

	private static String assign(List<String> bindings) {
		return switch (bindings.size()) {
			case 0 -> "";
			case 1 -> "const " + bindings.get(0) + " = ";
			default -> "const [" + String.join(", ", bindings) + "] = ";
		};
	}

	private String dependencies(List<CodeBlock> dependencies, ImportManager im) {
		List<String> ret = new ArrayList<>();
		for (CodeBlock dependency: dependencies) {
			ret.add(expression(dependency, im));
		}
		return "[" + String.join(", ", ret) + "]";
	}

	private String typeArgument(TypeReference type, ImportManager im) {
		return type == null ? "" : "<" + typeReference(type, im) + ">";
	}

	/**
	 * <code>export const Name = createContext&lt;T&gt;(defaultValue);</code>
	 */
	protected String context(ContextDeclaration context, boolean declarationOnly, ImportManager im) {
		StringBuilder ret = new StringBuilder(jsDoc(context, ""));
		if (context.isExported()) {
			ret.append("export ");
		}
		if (context.isAmbient() && !declarationOnly) {
			ret.append("declare ");
		}
		ret.append("const ").append(name(context));
		if (declarationOnly || context.isAmbient()) {
			String valueType = context.getValueType() == null ? "unknown" : typeReference(context.getValueType(), im);
			ret.append(": import(\"react\").Context<").append(valueType).append(">");
		} else {
			String defaultValue = expression(context.getDefaultValue(), im);
			ret.append(" = ").append(react("createContext", im)).append(typeArgument(context.getValueType(), im))
				.append("(").append(isBlank(defaultValue) ? "undefined" : defaultValue).append(")");
		}
		return ret.append(";").append(System.lineSeparator()).toString();
	}

	// --- Code blocks -----------------------------------------------------------

	/**
	 * A {@link JsxBlock} as a body is its text - the prelude - followed by
	 * <code>return root;</code>. As an expression it is the root, and must not have a prelude.
	 */
	@Override
	protected String code(CodeBlock block, boolean asBody, ImportManager im) {
		if (block instanceof JsxBlock jsxBlock) {
			String prelude = jsxBlock.getText();
			if (asBody) {
				List<String> statements = new ArrayList<>();
				if (!isBlank(prelude)) {
					statements.add(normalize(prelude));
				}
				if (jsxBlock.getRoot() != null) {
					statements.add(returnStatement(jsxBlock.getRoot(), im));
				}
				return String.join("\n", statements);
			}
			if (!isBlank(prelude)) {
				throw new NasdanikaException("A JSX block with a prelude cannot be used as an expression: " + block);
			}
			return jsxBlock.getRoot() == null ? "null" : expression(jsxBlock.getRoot(), im);
		}
		return super.code(block, asBody, im);
	}

	/**
	 * @return Normalized expression text of a code block, null if there is no block
	 */
	protected String expression(CodeBlock block, ImportManager im) {
		return block == null ? null : normalize(code(block, false, im));
	}

	/**
	 * Common indentation removed, <code>\n</code> line separators, no leading and trailing blank lines.
	 */
	private String normalize(String text) {
		return isBlank(text) ? "" : reindent(text, "").strip().replace("\r\n", "\n");
	}

	private String indent(String text, int depth) {
		String pad = getIndent().repeat(depth);
		return pad + text.replace("\n", "\n" + pad);
	}

	private static String orEmpty(String str) {
		return str == null ? "" : str;
	}

	// --- JSX -------------------------------------------------------------------

	private enum PropKind { STRING, CODE, TRUE, SPREAD }

	private record Prop(String name, PropKind kind, String value) {}

	/**
	 * Syntax independent JSX tree.
	 */
	private sealed interface Out permits Elem, Txt, Code, Cond, Iter, Verbatim, Remark {}

	/**
	 * @param type Tag name if intrinsic, component expression otherwise, null for a fragment
	 */
	private record Elem(String type, boolean intrinsic, List<Prop> props, List<Out> children) implements Out {}

	private record Txt(String text) implements Out {}

	private record Code(String code) implements Out {}

	private record Cond(String condition, Out then, Out otherwise) implements Out {}

	private record Iter(String items, String variable, Out template) implements Out {}

	private record Verbatim(String text) implements Out {}

	private record Remark(String text) implements Out {}

	/**
	 * Context of building and printing one JSX tree.
	 */
	private class Jsx {

		final ImportManager im;
		final boolean jsxSyntax;

		Jsx(EObject context, ImportManager im) {
			this.im = im;
			this.jsxSyntax = containingModule(context) instanceof TsxModule;
		}

		// --- Building ---

		Out out(JsxNode node) {
			return switch (node) {
				case JsxElement element -> {
					String type;
					if (!isBlank(element.getTag())) {
						type = element.getTag();
					} else if (element.getComponentType() != null) {
						type = im.localName(element.getComponentType());
					} else {
						throw new NasdanikaException("JSX element has neither tag nor component type: " + element);
					}
					Map<String, Prop> props = new LinkedHashMap<>();
					attributes(element.getAttributes(), props);
					yield new Elem(type, !isBlank(element.getTag()), new ArrayList<>(props.values()), children(element.getChildren()));
				}
				case Intrinsic intrinsic -> intrinsic(intrinsic.getElement(), intrinsic.getAttributes(), intrinsic.getChildren());
				case ContextProvider provider -> {
					List<Prop> props = new ArrayList<>();
					if (provider.getValue() != null) {
						props.add(new Prop("value", PropKind.CODE, expression(provider.getValue(), im)));
					}
					yield new Elem(localName(provider.getContext(), im) + ".Provider", false, props, children(provider.getChildren()));
				}
				case JsxFragment fragment -> new Elem(null, false, List.of(), children(fragment.getChildren()));
				case JsxText text -> new Txt(orEmpty(text.getText()));
				case JsxExpression expression -> new Code(orEmpty(expression(expression.getExpression(), im)));
				case JsxConditional conditional -> {
					if (conditional.getThen() == null) {
						throw new NasdanikaException("JSX conditional without then: " + conditional);
					}
					yield new Cond(
							orEmpty(expression(conditional.getCondition(), im)),
							out(conditional.getThen()),
							conditional.getOtherwise() == null ? null : out(conditional.getOtherwise()));
				}
				case JsxIterator iterator -> iterator(iterator);
				case OpaqueJsx opaque -> new Verbatim(normalize(opaque.getText()));
				default -> throw new NasdanikaException("Unsupported JSX node: " + node.eClass().getName());
			};
		}

		List<Out> children(List<JsxNode> nodes) {
			List<Out> ret = new ArrayList<>();
			for (JsxNode node: nodes) {
				ret.add(out(node));
			}
			return ret;
		}

		/**
		 * React requires a key on list items, so a missing key is an error here rather than a
		 * warning at runtime. The key is added to the template element.
		 */
		Out iterator(JsxIterator iterator) {
			if (iterator.getKey() == null) {
				throw new NasdanikaException("JSX iterator without key: " + iterator);
			}
			if (iterator.getTemplate() == null) {
				throw new NasdanikaException("JSX iterator without template: " + iterator);
			}
			if (!(out(iterator.getTemplate()) instanceof Elem template)) {
				throw new NasdanikaException("The template of a JSX iterator shall be an element or a fragment: " + iterator);
			}
			List<Prop> props = new ArrayList<>();
			props.add(new Prop("key", PropKind.CODE, expression(iterator.getKey(), im)));
			props.addAll(template.props());
			String type = template.type() == null ? react("Fragment", im) : template.type();
			String variable = isBlank(iterator.getVariable()) ? "item" : iterator.getVariable();
			return new Iter(orEmpty(expression(iterator.getItems(), im)), variable, new Elem(type, template.intrinsic(), props, template.children()));
		}

		void attributes(List<JsxAttribute> attributes, Map<String, Prop> props) {
			int spreads = 0;
			for (JsxAttribute attribute: attributes) {
				String name = attribute.getAttributeName();
				switch (attribute) {
					case LiteralAttribute literal -> props.put(name, new Prop(name, PropKind.STRING, orEmpty(literal.getValue())));
					case ExpressionAttribute expression -> props.put(name, new Prop(name, PropKind.CODE, orEmpty(expression(expression.getExpression(), im))));
					case EventAttribute event -> {
						if (name == null || !EVENT_NAME.matcher(name).matches()) {
							throw new NasdanikaException("Event attribute name shall be on followed by an upper case letter, e.g. onClick: " + name);
						}
						props.put(name, new Prop(name, PropKind.CODE, orEmpty(expression(event.getHandler(), im))));
					}
					case SpreadAttribute spread -> props.put("..." + spreads++, new Prop(null, PropKind.SPREAD, orEmpty(expression(spread.getExpression(), im))));
					default -> throw new NasdanikaException("Unsupported JSX attribute: " + attribute.eClass().getName());
				}
				if (props.containsKey("value")) {
					props.remove("defaultValue");
				}
				if (props.containsKey("checked")) {
					props.remove("defaultChecked");
				}
			}
		}

		Out html(org.nasdanika.sdk.runtime.models.html.Node node) {
			return switch (node) {
				case org.nasdanika.sdk.runtime.models.html.Text text -> new Txt(orEmpty(text.getContent()));
				case org.nasdanika.sdk.runtime.models.html.Comment comment -> new Remark(orEmpty(comment.getContent()));
				case JsxContent content -> {
					if (content.getNode() == null) {
						throw new NasdanikaException("JSX content without node: " + content);
					}
					yield out(content.getNode());
				}
				case Markup markup -> throw new NasdanikaException("Markup can only be the sole content of an element in JSX, where it becomes dangerouslySetInnerHTML: " + markup);
				case Element element -> intrinsic(element, List.of(), List.of());
				default -> throw new NasdanikaException("Unsupported HTML node: " + node.eClass().getName());
			};
		}

		Elem intrinsic(Element element, List<JsxAttribute> jsxAttributes, List<JsxNode> jsxChildren) {
			if (element == null) {
				throw new NasdanikaException("Intrinsic without element");
			}
			String tag = htmlStructure.tagName(element);
			Map<String, Prop> props = new LinkedHashMap<>();
			if (element.getId() != null) {
				props.put("id", new Prop("id", PropKind.STRING, element.getId()));
			}
			if (!element.getClasses().isEmpty()) {
				props.put("className", new Prop("className", PropKind.STRING, String.join(" ", element.getClasses())));
			}
			for (Map.Entry<String, Object> attribute: htmlStructure.attributes(element).entrySet()) {
				String name = propName(attribute.getKey());
				if (element instanceof Option && "selected".equals(name)) {
					continue; // defaultValue of the select
				}
				if (element instanceof Input input) {
					if ("checked".equals(name)) {
						name = "defaultChecked";
					} else if ("value".equals(name) && (input.getType() == null || !STATIC_VALUE_INPUT_TYPES.contains(input.getType().toLowerCase()))) {
						name = "defaultValue";
					}
				}
				props.put(name, attribute.getValue() instanceof String value ? new Prop(name, PropKind.STRING, value) : new Prop(name, PropKind.TRUE, null));
			}
			if (element instanceof Select select) {
				List<String> selected = new ArrayList<>();
				selected(select.getItems(), selected);
				if (select.isMultiple()) {
					if (!selected.isEmpty()) {
						props.put("defaultValue", new Prop("defaultValue", PropKind.CODE, "[" + String.join(", ", selected.stream().map(Generator::quote).toList()) + "]"));
					}
				} else if (!selected.isEmpty()) {
					props.put("defaultValue", new Prop("defaultValue", PropKind.STRING, selected.get(0)));
				}
			}
			if (!element.getStyle().isEmpty()) {
				props.put("style", new Prop("style", PropKind.CODE, style(element.getStyle())));
			}

			List<Out> children = new ArrayList<>();
			String rawText = htmlStructure.rawText(element);
			String text = htmlStructure.text(element);
			if (rawText != null) {
				if (!rawText.isEmpty()) {
					props.put("dangerouslySetInnerHTML", innerHtml(rawText));
				}
			} else if (element instanceof TextArea) {
				if (!isBlank(text)) {
					props.put("defaultValue", new Prop("defaultValue", PropKind.STRING, text));
				}
			} else if (text != null) {
				if (!text.isEmpty()) {
					children.add(new Txt(text));
				}
			} else {
				List<org.nasdanika.sdk.runtime.models.html.Node> htmlChildren = htmlStructure.children(element);
				if (htmlChildren.size() == 1 && htmlChildren.get(0) instanceof Markup markup) {
					props.put("dangerouslySetInnerHTML", innerHtml(orEmpty(markup.getContent())));
				} else {
					for (org.nasdanika.sdk.runtime.models.html.Node child: htmlChildren) {
						children.add(html(child));
					}
				}
			}
			attributes(jsxAttributes, props);
			children.addAll(children(jsxChildren));
			if (htmlStructure.isVoid(element) && !children.isEmpty()) {
				throw new NasdanikaException("Void element " + tag + " cannot have children: " + element);
			}
			return new Elem(tag, true, new ArrayList<>(props.values()), children);
		}

		void selected(List<SelectItem> items, List<String> selected) {
			for (SelectItem item: items) {
				if (item instanceof Option option && option.isSelected()) {
					selected.add(option.getValue() == null ? orEmpty(option.getText()) : option.getValue());
				} else if (item instanceof OptionGroup group) {
					selected(new ArrayList<>(group.getOptions()), selected);
				}
			}
		}

		Prop innerHtml(String html) {
			return new Prop("dangerouslySetInnerHTML", PropKind.CODE, "{ __html: " + quote(html) + " }");
		}

		/**
		 * CSS properties to a style object: kebab case to camel case, vendor prefixes
		 * capitalized except ms (-webkit-x to WebkitX, -ms-x to msX), custom properties
		 * as quoted keys.
		 */
		String style(Iterable<Map.Entry<String, String>> style) {
			List<String> entries = new ArrayList<>();
			for (Map.Entry<String, String> entry: style) {
				String property = entry.getKey().strip();
				String key;
				if (property.startsWith("--")) {
					key = quote(property);
				} else {
					String camel = property.startsWith("-ms-") ? property.substring(1) : property;
					StringBuilder builder = new StringBuilder();
					boolean upper = false;
					for (char c: camel.toCharArray()) {
						if (c == '-') {
							upper = true;
						} else {
							builder.append(upper ? Character.toUpperCase(c) : c);
							upper = false;
						}
					}
					key = builder.toString();
				}
				entries.add(key + ": " + quote(entry.getValue()));
			}
			return "{ " + String.join(", ", entries) + " }";
		}

		// --- Printing ---

		/**
		 * @return Expression text, continuation lines indented by depth
		 */
		String print(Out out, int depth) {
			return switch (out) {
				case Elem elem -> jsxSyntax ? jsxElement(elem, depth) : createElement(elem, depth);
				case Txt txt -> quote(txt.text());
				case Code code -> code.code().replace("\n", "\n" + getIndent().repeat(depth));
				case Cond cond -> {
					String condition = operand(cond.condition());
					if (cond.otherwise() == null) {
						yield condition + " && " + print(cond.then(), depth);
					}
					String then = print(cond.then(), depth);
					String otherwise = print(cond.otherwise(), depth);
					String inline = condition + " ? " + then + " : " + otherwise;
					if (inline.length() < LINE_LENGTH && !inline.contains("\n")) {
						yield inline;
					}
					// One branch per line, nested conditionals indented
					String pad = "\n" + getIndent().repeat(depth + 1);
					yield condition + pad + "? " + print(cond.then(), depth + 1) + pad + ": " + print(cond.otherwise(), depth + 1);
				}
				case Iter iter -> operand(iter.items()) + ".map(" + iter.variable() + " => " + print(iter.template(), depth) + ")";
				case Verbatim verbatim -> verbatim.text().replace("\n", "\n" + getIndent().repeat(depth));
				case Remark remark -> "null";
			};
		}

		String operand(String expression) {
			return SIMPLE_EXPRESSION.matcher(expression).matches() ? expression : "(" + expression + ")";
		}

		String jsxElement(Elem elem, int depth) {
			String type = elem.type() == null ? "" : elem.type();
			StringBuilder ret = new StringBuilder("<").append(type);
			for (Prop prop: elem.props()) {
				ret.append(" ").append(switch (prop.kind()) {
					case STRING -> prop.name() + "=" + jsxString(prop.value());
					case CODE -> prop.name() + "={" + prop.value().replace("\n", "\n" + getIndent().repeat(depth)) + "}";
					case TRUE -> prop.name();
					case SPREAD -> "{..." + prop.value() + "}";
				});
			}
			List<Out> children = elem.children();
			if (children.isEmpty()) {
				return ret.append(elem.type() == null ? "></>" : " />").toString();
			}
			ret.append(">");
			List<String> printed = new ArrayList<>();
			boolean inline = false;
			int length = ret.length();
			for (Out child: children) {
				String text = jsxChild(child, depth + 1);
				printed.add(text);
				length += text.length();
				inline |= child instanceof Txt;
			}
			// Whitespace with line breaks between children is dropped by JSX, which would glue
			// text to adjacent elements, so mixed content stays on one line
			inline |= length < LINE_LENGTH && printed.stream().noneMatch(p -> p.contains("\n"));
			if (inline) {
				printed.forEach(ret::append);
			} else {
				String pad = getIndent().repeat(depth + 1);
				for (String child: printed) {
					ret.append("\n").append(pad).append(child);
				}
				ret.append("\n").append(getIndent().repeat(depth));
			}
			return ret.append("</").append(type).append(">").toString();
		}

		String jsxChild(Out out, int depth) {
			return switch (out) {
				case Elem elem -> jsxElement(elem, depth);
				case Txt txt -> jsxText(txt.text());
				case Verbatim verbatim -> print(verbatim, depth);
				case Remark remark -> "{/* " + remark.text().replace("*/", "* /") + " */}";
				default -> "{" + print(out, depth) + "}";
			};
		}

		/**
		 * JSX text decodes entities, treats braces and angle brackets as syntax and drops
		 * whitespace with line breaks. Text with any of these is written as a string expression.
		 */
		String jsxText(String text) {
			if (text.isEmpty() || text.chars().anyMatch(c -> "{}<>&\n\r".indexOf(c) != -1)) {
				return "{" + quote(text) + "}";
			}
			return text;
		}

		String jsxString(String value) {
			return value.chars().anyMatch(c -> "\"&\\\n\r".indexOf(c) != -1) ? "{" + quote(value) + "}" : "\"" + value + "\"";
		}

		String createElement(Elem elem, int depth) {
			String type = elem.type() == null ? react("Fragment", im) : elem.intrinsic() ? quote(elem.type()) : elem.type();
			StringBuilder ret = new StringBuilder(react("createElement", im)).append("(").append(type).append(", ");
			if (elem.props().isEmpty()) {
				ret.append("null");
			} else {
				List<String> props = new ArrayList<>();
				for (Prop prop: elem.props()) {
					props.add(switch (prop.kind()) {
						case STRING -> key(prop.name()) + ": " + quote(prop.value());
						case CODE -> key(prop.name()) + ": " + prop.value().replace("\n", "\n" + getIndent().repeat(depth));
						case TRUE -> key(prop.name()) + ": true";
						case SPREAD -> "..." + prop.value();
					});
				}
				ret.append("{ ").append(String.join(", ", props)).append(" }");
			}
			List<String> printed = new ArrayList<>();
			int length = ret.length();
			for (Out child: elem.children()) {
				if (child instanceof Remark) {
					continue;
				}
				String text = print(child, depth + 1);
				printed.add(text);
				length += text.length() + 2;
			}
			if (printed.isEmpty()) {
				return ret.append(")").toString();
			}
			if (length < LINE_LENGTH && printed.stream().noneMatch(p -> p.contains("\n"))) {
				printed.forEach(child -> ret.append(", ").append(child));
			} else {
				String pad = getIndent().repeat(depth + 1);
				ret.append(",");
				for (Iterator<String> it = printed.iterator(); it.hasNext();) {
					ret.append("\n").append(pad).append(it.next());
					if (it.hasNext()) {
						ret.append(",");
					}
				}
			}
			return ret.append(")").toString();
		}

		String key(String name) {
			return IDENTIFIER.matcher(name).matches() ? name : quote(name);
		}

	}

	protected static String propName(String htmlName) {
		String name = PROP_NAMES.get(htmlName);
		return name == null ? htmlName : name;
	}

	/**
	 * @return JSX node as an expression in the syntax of its module
	 */
	protected String expression(JsxNode node, ImportManager im) {
		Jsx jsx = new Jsx(node, im);
		return jsx.print(jsx.out(node), 0);
	}

	/**
	 * <code>return expression;</code>, with a multi-line JSX expression in parentheses.
	 */
	protected String returnStatement(JsxNode node, ImportManager im) {
		Jsx jsx = new Jsx(node, im);
		Out out = jsx.out(node);
		if (jsx.jsxSyntax && out instanceof Elem) {
			String text = jsx.print(out, 1);
			if (text.contains("\n")) {
				return "return (\n" + getIndent() + text + "\n);";
			}
			return "return " + text + ";";
		}
		return "return " + jsx.print(out, 0) + ";";
	}

	private static Module containingModule(EObject element) {
		for (EObject container = element; container != null; container = container.eContainer()) {
			if (container instanceof Module module) {
				return module;
			}
		}
		return null;
	}

}
