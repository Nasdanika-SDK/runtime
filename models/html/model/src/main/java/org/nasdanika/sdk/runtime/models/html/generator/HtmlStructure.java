package org.nasdanika.sdk.runtime.models.html.generator;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EAttribute;
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
import org.nasdanika.sdk.runtime.models.html.HtmlPackage;
import org.nasdanika.sdk.runtime.models.html.ImportMap;
import org.nasdanika.sdk.runtime.models.html.ImportMapScope;
import org.nasdanika.sdk.runtime.models.html.ItemList;
import org.nasdanika.sdk.runtime.models.html.Node;
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
		return element instanceof VoidElement || (element instanceof Stylesheet stylesheet && stylesheet.getHref() != null);
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
		for (EAttribute eAttribute: element.eClass().getEAllAttributes()) {
			if (eAttribute.getEContainingClass() == HtmlPackage.Literals.ELEMENT || isLogical(eAttribute) || !element.eIsSet(eAttribute)) {
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
