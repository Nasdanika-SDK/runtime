package org.nasdanika.sdk.runtime.models.html.generator;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.nasdanika.sdk.runtime.models.html.ColumnGroup;
import org.nasdanika.sdk.runtime.models.html.Container;
import org.nasdanika.sdk.runtime.models.html.DescriptionList;
import org.nasdanika.sdk.runtime.models.html.Details;
import org.nasdanika.sdk.runtime.models.html.Document;
import org.nasdanika.sdk.runtime.models.html.Element;
import org.nasdanika.sdk.runtime.models.html.Fieldset;
import org.nasdanika.sdk.runtime.models.html.GenericVoidElement;
import org.nasdanika.sdk.runtime.models.html.Head;
import org.nasdanika.sdk.runtime.models.html.HtmlFactory;
import org.nasdanika.sdk.runtime.models.html.HtmlPackage;
import org.nasdanika.sdk.runtime.models.html.ImportMap;
import org.nasdanika.sdk.runtime.models.html.ImportMapScope;
import org.nasdanika.sdk.runtime.models.html.ItemList;
import org.nasdanika.sdk.runtime.models.html.LibraryElement;
import org.nasdanika.sdk.runtime.models.html.Node;
import org.nasdanika.sdk.runtime.models.html.NodeReference;
import org.nasdanika.sdk.runtime.models.html.Text;
import org.nasdanika.sdk.runtime.models.html.Option;
import org.nasdanika.sdk.runtime.models.html.OptionGroup;
import org.nasdanika.sdk.runtime.models.html.Script;
import org.nasdanika.sdk.runtime.models.html.Select;
import org.nasdanika.sdk.runtime.models.html.Stylesheet;
import org.nasdanika.sdk.runtime.models.html.Table;
import org.nasdanika.sdk.runtime.models.html.TableRow;
import org.nasdanika.sdk.runtime.models.html.TableSection;
import org.nasdanika.sdk.runtime.models.html.TextArea;
import org.nasdanika.sdk.runtime.models.html.VoidElement;

/**
 * How the model maps to HTML elements, independent of the output syntax: tag names,
 * attributes, children in rendering order, text and raw text content. Shared by the
 * HTML text {@link Generator} and by emitters of other syntaxes, e.g. JSX, so that
 * all of them interpret the model the same way.
 * <p>
 * Typed attributes are computed reflectively from the EAttributes of the element class:
 * a set value is an attribute, a boolean only when true. The name is the lower-cased
 * feature name unless the feature is annotated with {@link #HTML_ANNOTATION_SOURCE}
 * {@link #ATTRIBUTE_KEY}. Features annotated with {@link #LOGICAL_KEY} are not attributes.
 * <p>
 * Logical features of {@link Head} - charset, title and base - are syntax specific and
 * are not covered here.
 */
public class HtmlStructure {

	public static final String HTML_ANNOTATION_SOURCE = "urn:org.nasdanika:html";
	public static final String ATTRIBUTE_KEY = "attribute";
	public static final String LOGICAL_KEY = "logical";

	// Library element keys, see LibraryElement
	public static final String TAG_KEY = "tag";
	public static final String CLASSES_KEY = "classes";
	public static final String VOID_ELEMENT_KEY = "voidElement";
	public static final String CHILD_KEY = "child";
	public static final String DEFAULT_KEY = "default";
	public static final String ATTRIBUTES_KEY = "attributes";

	/**
	 * @return id attribute value, the element id by default
	 */
	public String id(Element element) {
		return element.getId();
	}

	/**
	 * The node to render in place of a node: the target of a {@link NodeReference}, or
	 * plain HTML for an element which does not map to a single element. Called for every
	 * node before it is rendered, and again on the result until it does not change.
	 * Expansion shall not modify the model - expanded HTML refers to nodes of the model with
	 * {@link NodeReference}s.
	 */
	public Node expand(Node node) {
		Node current = node;
		for (int i = 0; current instanceof NodeReference reference; ++i) {
			if (i > 100) {
				throw new IllegalArgumentException("Node reference cycle: " + node);
			}
			current = reference.getTarget();
			if (current == null) {
				throw new IllegalArgumentException("Node reference without target: " + reference);
			}
		}
		return current;
	}

	/**
	 * Expands until the result does not change.
	 */
	public Node expandAll(Node node) {
		Node current = node;
		for (int i = 0; i < 100; ++i) {
			Node expanded = expand(current);
			if (expanded == current) {
				return current;
			}
			current = expanded;
		}
		throw new IllegalArgumentException("Expansion does not converge: " + node);
	}

	/**
	 * @return Classes of the element: of the class and of its features for library elements, then its own classes.
	 */
	public List<String> classes(Element element) {
		List<String> classes = new ArrayList<>();
		if (element instanceof LibraryElement) {
			String classAnnotation = classAnnotation(element.eClass(), CLASSES_KEY);
			if (classAnnotation != null) {
				for (String cls: classAnnotation.split("\\s+")) {
					if (!cls.isBlank()) {
						classes.add(cls);
					}
				}
			}
			for (EAttribute eAttribute: element.eClass().getEAllAttributes()) {
				String pattern = annotation(eAttribute, CLASSES_KEY);
				String defaultValue = annotation(eAttribute, DEFAULT_KEY);
				if (pattern != null && defaultValue != null && !element.eIsSet(eAttribute)) {
					classes.add(pattern.replace("{}", defaultValue));
				} else if (pattern != null && element.eIsSet(eAttribute)) {
					Object value = element.eGet(eAttribute);
					for (Object v: eAttribute.isMany() ? (List<?>) value : List.of(value)) {
						if (v instanceof Boolean bValue) {
							if (bValue) {
								classes.add(pattern);
							}
						} else {
							classes.add(pattern.replace("{}", literal(v)));
						}
					}
				}
			}
		}
		for (String cls: element.getClasses()) {
			if (!classes.contains(cls)) {
				classes.add(cls);
			}
		}
		return classes;
	}

	/**
	 * Enum literal or string value.
	 */
	protected static String literal(Object value) {
		return value instanceof Enumerator enumerator ? enumerator.getLiteral() : String.valueOf(value);
	}

	/**
	 * @return Detail of the {@link #HTML_ANNOTATION_SOURCE} annotation of the class or of the nearest supertype which has it
	 */
	public static String classAnnotation(EClass eClass, String key) {
		List<EClass> queue = new ArrayList<>(List.of(eClass));
		Set<EClass> visited = new HashSet<>();
		while (!queue.isEmpty()) {
			EClass next = queue.remove(0);
			if (visited.add(next)) {
				String value = annotation(next, key);
				if (value != null) {
					return value;
				}
				queue.addAll(next.getESuperTypes());
			}
		}
		return null;
	}

	/**
	 * @return Detail of the {@link #HTML_ANNOTATION_SOURCE} annotation, null if there is none
	 */
	public static String annotation(EModelElement element, String key) {
		EAnnotation annotation = element.getEAnnotation(HTML_ANNOTATION_SOURCE);
		return annotation == null ? null : annotation.getDetails().get(key);
	}

	/**
	 * @throws IllegalArgumentException if the element does not have a tag name
	 */
	public String tagName(Element element) {
		String tagName = element.tagName();
		if (tagName == null || tagName.isBlank()) {
			String kind = element instanceof GenericVoidElement ? "Generic void element" : "Element";
			throw new IllegalArgumentException(kind + " without a tag name: " + element);
		}
		return tagName;
	}

	/**
	 * @return true for elements without content and end tag, including a stylesheet rendered as link
	 */
	public boolean isVoid(Element element) {
		return element instanceof VoidElement
				|| (element instanceof Stylesheet stylesheet && stylesheet.getHref() != null)
				|| (element instanceof LibraryElement && "true".equals(classAnnotation(element.eClass(), VOID_ELEMENT_KEY)));
	}

	/**
	 * Attributes other than id, class and style, which are available from the element as
	 * structured values.
	 *
	 * @return Attribute name to value in rendering order. Values are strings, or
	 * {@link Boolean#TRUE} for boolean attributes. Generic attributes with null values are
	 * boolean attributes.
	 */
	public Map<String, Object> attributes(Element element) {
		Map<String, Object> attributes = new LinkedHashMap<>();
		if (element instanceof Stylesheet stylesheet && stylesheet.getHref() != null) {
			attributes.put("rel", "stylesheet");
		}
		if (element instanceof LibraryElement) {
			// name=value;name=value, a name without a value is a boolean attribute
			String classAttributes = classAnnotation(element.eClass(), ATTRIBUTES_KEY);
			if (classAttributes != null) {
				for (String attribute: classAttributes.split(";")) {
					if (!attribute.isBlank()) {
						int idx = attribute.indexOf('=');
						if (idx == -1) {
							attributes.put(attribute.strip(), Boolean.TRUE);
						} else {
							attributes.put(attribute.substring(0, idx).strip(), attribute.substring(idx + 1));
						}
					}
				}
			}
		}
		for (EAttribute eAttribute: element.eClass().getEAllAttributes()) {
			if (eAttribute.getEContainingClass() == HtmlPackage.Literals.ELEMENT
					|| isLogical(eAttribute)
					|| annotation(eAttribute, CLASSES_KEY) != null
					|| annotation(eAttribute, CHILD_KEY) != null
					|| !element.eIsSet(eAttribute)) {
				continue;
			}
			Object value = element.eGet(eAttribute);
			if (value instanceof Boolean bValue) {
				if (bValue) {
					attributes.put(attributeName(eAttribute), Boolean.TRUE);
				}
			} else if (value != null) {
				attributes.put(attributeName(eAttribute), value.toString());
			}
		}
		if (element instanceof Script script && script.isModule() && script.getType() == null) {
			attributes.put("type", "module");
		}
		if (element instanceof ImportMap) {
			attributes.put("type", "importmap");
		}
		for (Map.Entry<String, String> attribute: element.getAttributes()) {
			attributes.put(attribute.getKey(), attribute.getValue() == null ? Boolean.TRUE : attribute.getValue());
		}
		return attributes;
	}

	/**
	 * @return Child nodes in rendering order. Logical containment references are flattened here.
	 */
	public List<Node> children(Element element) {
		List<Node> children = new ArrayList<>();
		switch (element) {
			case Document document -> {
				addIfNotNull(children, document.getHead());
				addIfNotNull(children, document.getBody());
			}
			case Head head -> {
				children.addAll(head.getMetas());
				children.addAll(head.getLinks());
				children.addAll(head.getStylesheets());
				addIfNotNull(children, head.getImportMap());
				children.addAll(head.getScripts());
				children.addAll(head.getContents());
			}
			case Details details -> {
				addIfNotNull(children, details.getSummary());
				children.addAll(details.getContents());
			}
			case Fieldset fieldset -> {
				addIfNotNull(children, fieldset.getLegend());
				children.addAll(fieldset.getContents());
			}
			case Table table -> {
				addIfNotNull(children, table.getCaption());
				children.addAll(table.getColumnGroups());
				addIfNotNull(children, table.getHead());
				children.addAll(table.getBodies());
				addIfNotNull(children, table.getFoot());
			}
			case ColumnGroup columnGroup -> children.addAll(columnGroup.getColumns());
			case TableSection section -> children.addAll(section.getRows());
			case TableRow row -> children.addAll(row.getCells());
			case ItemList list -> children.addAll(list.getItems());
			case DescriptionList list -> list.getItems().forEach(item -> children.add((Node) item));
			case Select select -> select.getItems().forEach(item -> children.add((Node) item));
			case OptionGroup group -> children.addAll(group.getOptions());
			case LibraryElement library -> {
				List<Node> texts = new ArrayList<>();
				for (EStructuralFeature feature: library.eClass().getEAllStructuralFeatures()) {
					if (HtmlPackage.Literals.LIBRARY_ELEMENT.getEAllStructuralFeatures().contains(feature)
							|| isLogical(feature)
							|| !library.eIsSet(feature)) {
						continue;
					}
					if (feature instanceof EReference reference && reference.isContainment()) {
						Object value = library.eGet(reference);
						for (Object v: reference.isMany() ? (List<?>) value : List.of(value)) {
							if (v instanceof Node node) {
								children.add(node);
							}
						}
					} else if (feature instanceof EAttribute && "true".equals(annotation(feature, CHILD_KEY))) {
						Text text = HtmlFactory.eINSTANCE.createText();
						text.setContent(String.valueOf(library.eGet(feature)));
						texts.add(text);
					}
				}
				children.addAll(texts);
				children.addAll(library.getContents());
			}
			case Container container -> children.addAll(container.getContents());
			default -> {}
		}
		return children;
	}

	private static void addIfNotNull(List<Node> children, Node child) {
		if (child != null) {
			children.add(child);
		}
	}

	/**
	 * @return Text content, to be escaped, of text-only elements. Null for other elements.
	 */
	public String text(Element element) {
		return switch (element) {
			case Option option -> option.getText() == null ? "" : option.getText();
			case TextArea textArea -> textArea.getText() == null ? "" : textArea.getText();
			default -> null;
		};
	}

	/**
	 * @return Raw text content of script and style elements, not escaped. Null for other elements.
	 */
	public String rawText(Element element) {
		return switch (element) {
			case Script script -> script.getContent() == null ? "" : script.getContent();
			case ImportMap importMap -> json(importMap);
			case Stylesheet stylesheet -> stylesheet.getContent() == null ? "" : stylesheet.getContent();
			default -> null;
		};
	}

	/**
	 * @return Import map JSON, entries in model order
	 */
	public String json(ImportMap importMap) {
		StringBuilder json = new StringBuilder("{\"imports\":");
		json(importMap.getImports(), json);
		if (!importMap.getScopes().isEmpty()) {
			json.append(",\"scopes\":{");
			boolean first = true;
			for (ImportMapScope scope: importMap.getScopes()) {
				if (!first) {
					json.append(",");
				}
				first = false;
				json.append(jsonString(scope.getPrefix())).append(":");
				json(scope.getImports(), json);
			}
			json.append("}");
		}
		return json.append("}").toString();
	}

	private static void json(Iterable<Map.Entry<String, String>> entries, StringBuilder json) {
		json.append("{");
		boolean first = true;
		for (Map.Entry<String, String> entry: entries) {
			if (!first) {
				json.append(",");
			}
			first = false;
			json.append(jsonString(entry.getKey())).append(":").append(jsonString(entry.getValue()));
		}
		json.append("}");
	}

	public static String jsonString(String value) {
		if (value == null) {
			return "null";
		}
		StringBuilder json = new StringBuilder("\"");
		for (char c: value.toCharArray()) {
			switch (c) {
				case '"' -> json.append("\\\"");
				case '\\' -> json.append("\\\\");
				case '\n' -> json.append("\\n");
				case '\r' -> json.append("\\r");
				case '\t' -> json.append("\\t");
				default -> {
					if (c < 0x20) {
						json.append(String.format("\\u%04x", (int) c));
					} else {
						json.append(c);
					}
				}
			}
		}
		return json.append("\"").toString();
	}

	public static boolean isLogical(EStructuralFeature feature) {
		EAnnotation annotation = feature.getEAnnotation(HTML_ANNOTATION_SOURCE);
		return annotation != null && "true".equals(annotation.getDetails().get(LOGICAL_KEY));
	}

	public static String attributeName(EStructuralFeature feature) {
		EAnnotation annotation = feature.getEAnnotation(HTML_ANNOTATION_SOURCE);
		if (annotation != null) {
			String name = annotation.getDetails().get(ATTRIBUTE_KEY);
			if (name != null && !name.isBlank()) {
				return name;
			}
		}
		return feature.getName().toLowerCase();
	}

}
