package org.nasdanika.sdk.runtime.models.html.generator;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

import org.eclipse.emf.common.util.EMap;
import org.nasdanika.sdk.runtime.models.html.Comment;
import org.nasdanika.sdk.runtime.models.html.Document;
import org.nasdanika.sdk.runtime.models.html.Element;
import org.nasdanika.sdk.runtime.models.html.Head;
import org.nasdanika.sdk.runtime.models.html.Markup;
import org.nasdanika.sdk.runtime.models.html.Node;
import org.nasdanika.sdk.runtime.models.html.Pre;
import org.nasdanika.sdk.runtime.models.html.Text;

/**
 * Generates HTML text from the model. What to render - tag names, attributes, children,
 * text - comes from {@link HtmlStructure}; this class decides how it is written.
 * Attribute order: id, class, {@link HtmlStructure#attributes(Element) attributes}, style.
 * <p>
 * With an indent (the default), the children of an element are placed on separate indented
 * lines only if they are all block-level elements or comments, so whitespace is never added
 * between inline content. Contents of <code>pre</code> and <code>textarea</code> are never
 * re-indented. Set the indent to null for compact output.
 * <p>
 * To render additional node types, e.g. from models extending this one, override
 * {@link #node(Node, int, boolean)}, and pass an {@link HtmlStructure} subclass to the constructor
 * to change how elements map to HTML.
 */
public class Generator {

	/**
	 * Tags whose elements can be placed on their own lines without changing rendering.
	 */
	public static final Set<String> BLOCK_TAGS = Set.of(
			"html", "head", "body", "title", "base", "meta", "link", "style", "script", "noscript", "template",
			"div", "p", "h1", "h2", "h3", "h4", "h5", "h6", "header", "footer", "main", "nav", "section", "article", "aside",
			"address", "blockquote", "pre", "figure", "figcaption", "details", "summary", "hr",
			"ul", "ol", "li", "dl", "dt", "dd",
			"table", "caption", "colgroup", "col", "thead", "tbody", "tfoot", "tr", "th", "td",
			"form", "fieldset", "legend", "select", "optgroup", "option", "iframe");

	private final HtmlStructure structure;
	private String indent = "  ";
	private String lineSeparator = "\n";

	public Generator() {
		this(new HtmlStructure());
	}

	public Generator(HtmlStructure structure) {
		this.structure = Objects.requireNonNull(structure, "structure");
	}

	public HtmlStructure getStructure() {
		return structure;
	}

	/**
	 * @param indent indentation unit, two spaces by default. Null or empty for compact output.
	 */
	public Generator setIndent(String indent) {
		this.indent = indent == null || indent.isEmpty() ? null : indent;
		return this;
	}

	public Generator setLineSeparator(String lineSeparator) {
		this.lineSeparator = lineSeparator;
		return this;
	}

	public String generate(Node node) {
		StringBuilder out = new StringBuilder();
		generate(node, out);
		return out.toString();
	}

	public void generate(Node node, Appendable out) {
		Appendable previous = this.out;
		this.out = out;
		try {
			node(node, 0, indent != null);
		} finally {
			this.out = previous;
		}
	}

	// --- Dispatch ------------------------------------------------------------

	private Appendable out;

	/**
	 * Renders a node.
	 * @param depth Nesting depth for indentation
	 * @param pretty If false, no whitespace shall be added, e.g. inside pre
	 */
	protected void node(Node node, int depth, boolean pretty) {
		switch (structure.expandAll(node)) {
			case Text text -> append(escapeText(text.getContent()));
			case Markup markup -> append(markup.getContent());
			case Comment comment -> append("<!--").append(comment.getContent()).append("-->");
			case Document document -> document(document, depth, pretty);
			case Element element -> element(element, depth, pretty);
			default -> throw new IllegalArgumentException("Unsupported node: " + node.eClass().getName());
		}
	}

	protected void document(Document document, int depth, boolean pretty) {
		String doctype = document.getDoctype();
		if (doctype != null && !doctype.isBlank()) {
			append("<!DOCTYPE ").append(doctype).append(">");
			if (pretty) {
				newLine(depth);
			}
		}
		element(document, depth, pretty);
	}

	protected void element(Element element, int depth, boolean pretty) {
		startTag(element);
		if (structure.isVoid(element)) {
			return;
		}
		String rawText = structure.rawText(element);
		String text = structure.text(element);
		if (rawText != null) {
			// "</script" or "</style" would close the element
			append(rawText.replaceAll("(?i)</(script|style)", "<\\\\/$1"));
		} else if (text != null) {
			append(escapeText(text));
		} else {
			boolean childPretty = pretty && !(element instanceof Pre);
			List<? extends Node> children = structure.children(element).stream().map(structure::expandAll).toList();
			boolean block = childPretty && children.stream().allMatch(this::isBlock);
			boolean preamble = element instanceof Head head && headPreamble(head, depth + 1, block);
			if (block && (preamble || !children.isEmpty())) {
				for (Node child: children) {
					newLine(depth + 1);
					node(child, depth + 1, true);
				}
				newLine(depth);
			} else {
				for (Node child: children) {
					node(child, depth + 1, childPretty);
				}
			}
		}
		endTag(element);
	}

	protected boolean isBlock(Node node) {
		return node instanceof Comment || (node instanceof Element element && BLOCK_TAGS.contains(structure.tagName(element)));
	}

	// --- Tags and attributes -------------------------------------------------

	protected void startTag(Element element) {
		append("<").append(structure.tagName(element));
		attributes(element);
		append(">");
	}

	protected void endTag(Element element) {
		append("</").append(structure.tagName(element)).append(">");
	}

	/**
	 * Renders charset, title and base - logical features of Head - before its child nodes.
	 * @return true if anything was rendered
	 */
	protected boolean headPreamble(Head head, int depth, boolean pretty) {
		boolean rendered = false;
		if (head.getCharset() != null) {
			if (pretty) {
				newLine(depth);
			}
			append("<meta charset=\"").append(escapeAttribute(head.getCharset())).append("\">");
			rendered = true;
		}
		if (head.getTitle() != null) {
			if (pretty) {
				newLine(depth);
			}
			append("<title>").append(escapeText(head.getTitle())).append("</title>");
			rendered = true;
		}
		if (head.getBase() != null) {
			if (pretty) {
				newLine(depth);
			}
			append("<base href=\"").append(escapeAttribute(head.getBase())).append("\">");
			rendered = true;
		}
		return rendered;
	}

	protected void attributes(Element element) {
		String id = structure.id(element);
		if (id != null) {
			attribute("id", id);
		}
		Collection<String> classes = structure.classes(element);
		if (!classes.isEmpty()) {
			attribute("class", String.join(" ", classes));
		}
		for (Map.Entry<String, Object> attribute: structure.attributes(element).entrySet()) {
			attribute(attribute.getKey(), attribute.getValue() instanceof String value ? value : null);
		}
		EMap<String, String> style = element.getStyle();
		if (!style.isEmpty()) {
			StringBuilder styleValue = new StringBuilder();
			for (Map.Entry<String, String> property: style) {
				if (!styleValue.isEmpty()) {
					styleValue.append(" ");
				}
				styleValue.append(property.getKey()).append(": ").append(property.getValue()).append(";");
			}
			attribute("style", styleValue.toString());
		}
	}

	/**
	 * @param value null for a boolean attribute
	 */
	protected void attribute(String name, String value) {
		if (name == null) {
			return;
		}
		append(" ").append(name);
		if (value != null) {
			append("=\"").append(escapeAttribute(value)).append("\"");
		}
	}

	// --- Output --------------------------------------------------------------

	private void newLine(int depth) {
		append(lineSeparator);
		for (int i = 0; i < depth; ++i) {
			append(indent);
		}
	}

	private Generator append(String str) {
		if (str != null) {
			try {
				out.append(str);
			} catch (IOException e) {
				throw new UncheckedIOException(e);
			}
		}
		return this;
	}

	public static String escapeText(String text) {
		if (text == null) {
			return "";
		}
		return text
			.replace("&", "&amp;")
			.replace("<", "&lt;")
			.replace(">", "&gt;");
	}

	public static String escapeAttribute(String value) {
		return escapeText(value).replace("\"", "&quot;");
	}

}
