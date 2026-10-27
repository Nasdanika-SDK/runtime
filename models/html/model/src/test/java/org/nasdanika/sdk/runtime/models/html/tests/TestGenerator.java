package org.nasdanika.sdk.runtime.models.html.tests;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.assertj.core.api.Assertions.entry;

import org.junit.jupiter.api.Test;
import org.nasdanika.sdk.runtime.models.html.Body;
import org.nasdanika.sdk.runtime.models.html.Container;
import org.nasdanika.sdk.runtime.models.html.Div;
import org.nasdanika.sdk.runtime.models.html.Document;
import org.nasdanika.sdk.runtime.models.html.GenericElement;
import org.nasdanika.sdk.runtime.models.html.Head;
import org.nasdanika.sdk.runtime.models.html.Heading;
import org.nasdanika.sdk.runtime.models.html.HtmlFactory;
import org.nasdanika.sdk.runtime.models.html.Image;
import org.nasdanika.sdk.runtime.models.html.ImportMap;
import org.nasdanika.sdk.runtime.models.html.ImportMapScope;
import org.nasdanika.sdk.runtime.models.html.Input;
import org.nasdanika.sdk.runtime.models.html.Label;
import org.nasdanika.sdk.runtime.models.html.ListItem;
import org.nasdanika.sdk.runtime.models.html.Meta;
import org.nasdanika.sdk.runtime.models.html.Option;
import org.nasdanika.sdk.runtime.models.html.Paragraph;
import org.nasdanika.sdk.runtime.models.html.Pre;
import org.nasdanika.sdk.runtime.models.html.Script;
import org.nasdanika.sdk.runtime.models.html.Select;
import org.nasdanika.sdk.runtime.models.html.Strong;
import org.nasdanika.sdk.runtime.models.html.Stylesheet;
import org.nasdanika.sdk.runtime.models.html.Table;
import org.nasdanika.sdk.runtime.models.html.TableBody;
import org.nasdanika.sdk.runtime.models.html.TableCell;
import org.nasdanika.sdk.runtime.models.html.TableHead;
import org.nasdanika.sdk.runtime.models.html.TableRow;
import org.nasdanika.sdk.runtime.models.html.Text;
import org.nasdanika.sdk.runtime.models.html.UnorderedList;
import org.nasdanika.sdk.runtime.models.html.generator.Generator;
import org.nasdanika.sdk.runtime.models.html.generator.HtmlStructure;

public class TestGenerator {

	private static final HtmlFactory FACTORY = HtmlFactory.eINSTANCE;

	private static Text text(Container container, String content) {
		Text text = FACTORY.createText();
		text.setContent(content);
		container.getContents().add(text);
		return text;
	}

	private static TableCell cell(TableRow row, boolean header, String content) {
		TableCell cell = FACTORY.createTableCell();
		cell.setHeader(header);
		text(cell, content);
		row.getCells().add(cell);
		return cell;
	}

	@Test
	public void testTable() {
		Table table = FACTORY.createTable();
		table.getClasses().add("data");

		TableHead head = FACTORY.createTableHead();
		table.setHead(head);
		TableRow headerRow = FACTORY.createTableRow();
		head.getRows().add(headerRow);
		cell(headerRow, true, "Name").setScope("col");
		cell(headerRow, true, "Value").setScope("col");

		TableBody body = FACTORY.createTableBody();
		table.getBodies().add(body);
		TableRow row = FACTORY.createTableRow();
		body.getRows().add(row);
		cell(row, false, "a < b");
		cell(row, false, "1");
		TableRow spanRow = FACTORY.createTableRow();
		body.getRows().add(spanRow);
		cell(spanRow, false, "Total").setColspan(2);

		assertThat(new Generator().setIndent(null).generate(table)).isEqualTo(
				"<table class=\"data\">"
				+ "<thead><tr><th scope=\"col\">Name</th><th scope=\"col\">Value</th></tr></thead>"
				+ "<tbody><tr><td>a &lt; b</td><td>1</td></tr><tr><td colspan=\"2\">Total</td></tr></tbody>"
				+ "</table>");

		assertThat(new Generator().generate(table)).isEqualTo("""
				<table class="data">
				  <thead>
				    <tr>
				      <th scope="col">Name</th>
				      <th scope="col">Value</th>
				    </tr>
				  </thead>
				  <tbody>
				    <tr>
				      <td>a &lt; b</td>
				      <td>1</td>
				    </tr>
				    <tr>
				      <td colspan="2">Total</td>
				    </tr>
				  </tbody>
				</table>""");
	}

	@Test
	public void testDocument() {
		// tag::document[]
		Document document = FACTORY.createDocument();
		document.setLang("en");

		Head head = FACTORY.createHead();
		document.setHead(head);
		head.setTitle("Tom & Jerry");
		Meta viewport = FACTORY.createMeta();
		viewport.setName("viewport");
		viewport.setContent("width=device-width, initial-scale=1");
		head.getMetas().add(viewport);
		Stylesheet external = FACTORY.createStylesheet();
		external.setHref("styles.css");
		head.getStylesheets().add(external);
		Stylesheet inline = FACTORY.createStylesheet();
		inline.setContent("p > b { color: red; }");
		head.getStylesheets().add(inline);
		Script script = FACTORY.createScript();
		script.setModule(true);
		script.setSrc("main.js");
		head.getScripts().add(script);

		Body body = FACTORY.createBody();
		document.setBody(body);
		Div div = FACTORY.createDiv();
		div.setId("main");
		div.getClasses().add("container");
		div.getClasses().add("wide");
		div.getStyle().put("margin", "0 auto");
		body.getContents().add(div);

		Heading heading = FACTORY.createHeading();
		heading.setLevel(2);
		text(heading, "Hello");
		div.getContents().add(heading);

		// Mixed content stays on one line
		Paragraph paragraph = FACTORY.createParagraph();
		text(paragraph, "Hello, ");
		Strong strong = FACTORY.createStrong();
		text(strong, "World");
		paragraph.getContents().add(strong);
		text(paragraph, "!");
		div.getContents().add(paragraph);

		UnorderedList list = FACTORY.createUnorderedList();
		ListItem item = FACTORY.createListItem();
		text(item, "One");
		list.getItems().add(item);
		div.getContents().add(list);

		assertThat(new Generator().generate(document)).isEqualTo("""
				<!DOCTYPE html>
				<html lang="en">
				  <head>
				    <meta charset="utf-8">
				    <title>Tom &amp; Jerry</title>
				    <meta name="viewport" content="width=device-width, initial-scale=1">
				    <link rel="stylesheet" href="styles.css">
				    <style>p > b { color: red; }</style>
				    <script src="main.js" type="module"></script>
				  </head>
				  <body>
				    <div id="main" class="container wide" style="margin: 0 auto;">
				      <h2>Hello</h2>
				      <p>Hello, <strong>World</strong>!</p>
				      <ul>
				        <li>One</li>
				      </ul>
				    </div>
				  </body>
				</html>""");
		// end::document[]
	}

	@Test
	public void testAttributesAndEscaping() {
		// tag::escaping[]
		Div div = FACTORY.createDiv();
		div.getAttributes().put("data-title", "\"quoted\" & <tagged>");
		div.getAttributes().put("hidden", null);

		Label label = FACTORY.createLabel();
		label.setHtmlFor("name");
		text(label, "Name");
		div.getContents().add(label);

		Input input = FACTORY.createInput();
		input.setId("name");
		input.setType("text");
		input.setRequired(true);
		input.setDisabled(false);
		div.getContents().add(input);

		Image image = FACTORY.createImage();
		image.setSrc("logo.png");
		image.setAlt("Logo");
		image.setWidth(32);
		div.getContents().add(image);

		Select select = FACTORY.createSelect();
		select.setName("color");
		Option option = FACTORY.createOption();
		option.setValue("r");
		option.setSelected(true);
		option.setText("Red & Rose");
		select.getItems().add(option);
		div.getContents().add(select);

		Script script = FACTORY.createScript();
		script.setContent("document.write('</script>');");
		div.getContents().add(script);

		assertThat(new Generator().setIndent(null).generate(div)).isEqualTo(
				"<div data-title=\"&quot;quoted&quot; &amp; &lt;tagged&gt;\" hidden>"
				+ "<label for=\"name\">Name</label>"
				+ "<input id=\"name\" type=\"text\" required>"
				+ "<img src=\"logo.png\" alt=\"Logo\" width=\"32\">"
				+ "<select name=\"color\"><option value=\"r\" selected>Red &amp; Rose</option></select>"
				+ "<script>document.write('<\\/script>');</script>"
				+ "</div>");
		// end::escaping[]
	}

	@Test
	public void testImportMap() {
		Head head = FACTORY.createHead();
		head.setCharset(null);
		ImportMap importMap = FACTORY.createImportMap();
		importMap.getImports().put("react", "https://esm.sh/react@19.3.0");
		ImportMapScope scope = FACTORY.createImportMapScope();
		scope.setPrefix("/vendor/");
		scope.getImports().put("lib", "./lib \"v2\".js");
		importMap.getScopes().add(scope);
		head.setImportMap(importMap);
		Script script = FACTORY.createScript();
		script.setModule(true);
		script.setSrc("app.js");
		head.getScripts().add(script);

		assertThat(new Generator().generate(head)).isEqualTo("""
				<head>
				  <script type="importmap">{"imports":{"react":"https://esm.sh/react@19.3.0"},"scopes":{"/vendor/":{"lib":"./lib \\"v2\\".js"}}}</script>
				  <script src="app.js" type="module"></script>
				</head>""");
	}

	@Test
	public void testStructure() {
		Input input = FACTORY.createInput();
		input.setId("name");
		input.setType("text");
		input.setReadonly(true);
		input.getAttributes().put("data-x", "1");
		input.getAttributes().put("autofocus", null);

		HtmlStructure structure = new HtmlStructure();
		assertThat(structure.tagName(input)).isEqualTo("input");
		assertThat(structure.isVoid(input)).isTrue();
		assertThat(structure.attributes(input)).containsExactly(
				entry("type", "text"),
				entry("readonly", Boolean.TRUE),
				entry("data-x", "1"),
				entry("autofocus", Boolean.TRUE));

		Label label = FACTORY.createLabel();
		label.setHtmlFor("name");
		assertThat(structure.attributes(label)).containsExactly(entry("for", "name"));

		Stylesheet stylesheet = FACTORY.createStylesheet();
		assertThat(structure.isVoid(stylesheet)).isFalse();
		stylesheet.setHref("a.css");
		assertThat(structure.isVoid(stylesheet)).isTrue();
		assertThat(structure.attributes(stylesheet)).containsExactly(entry("rel", "stylesheet"), entry("href", "a.css"));
	}

	@Test
	public void testGenericElementAndPre() {
		GenericElement custom = FACTORY.createGenericElement();
		custom.setName("my-widget");
		custom.getAttributes().put("mode", "compact");

		Pre pre = FACTORY.createPre();
		Div inner = FACTORY.createDiv();
		text(inner, "line 1\n  line 2");
		pre.getContents().add(inner);
		custom.getContents().add(pre);

		assertThat(new Generator().generate(custom)).isEqualTo("""
				<my-widget mode="compact">
				  <pre><div>line 1
				  line 2</div></pre>
				</my-widget>""");

		GenericElement nameless = FACTORY.createGenericElement();
		assertThatThrownBy(() -> new Generator().generate(nameless)).isInstanceOf(IllegalArgumentException.class);
	}

}
