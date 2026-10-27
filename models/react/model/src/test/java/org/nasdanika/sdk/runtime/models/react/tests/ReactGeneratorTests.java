package org.nasdanika.sdk.runtime.models.react.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.nasdanika.sdk.runtime.models.react.tests.Jsx.HTML;
import static org.nasdanika.sdk.runtime.models.react.tests.Jsx.REACT;
import static org.nasdanika.sdk.runtime.models.react.tests.Jsx.TS;

import java.nio.file.Files;
import java.nio.file.Path;

import org.junit.jupiter.api.Test;
import org.nasdanika.sdk.runtime.common.NasdanikaException;
import org.nasdanika.sdk.runtime.models.html.Comment;
import org.nasdanika.sdk.runtime.models.html.Div;
import org.nasdanika.sdk.runtime.models.html.Input;
import org.nasdanika.sdk.runtime.models.html.Label;
import org.nasdanika.sdk.runtime.models.html.ListItem;
import org.nasdanika.sdk.runtime.models.html.Markup;
import org.nasdanika.sdk.runtime.models.html.Option;
import org.nasdanika.sdk.runtime.models.html.Paragraph;
import org.nasdanika.sdk.runtime.models.html.Select;
import org.nasdanika.sdk.runtime.models.html.TextArea;
import org.nasdanika.sdk.runtime.models.react.ComponentDeclaration;
import org.nasdanika.sdk.runtime.models.react.ContextDeclaration;
import org.nasdanika.sdk.runtime.models.react.ContextHook;
import org.nasdanika.sdk.runtime.models.react.ContextProvider;
import org.nasdanika.sdk.runtime.models.react.JsxBlock;
import org.nasdanika.sdk.runtime.models.react.MemoHook;
import org.nasdanika.sdk.runtime.models.react.StateHook;
import org.nasdanika.sdk.runtime.models.react.generator.ReactGenerator;
import org.nasdanika.sdk.runtime.models.typescript.FunctionDeclaration;
import org.nasdanika.sdk.runtime.models.typescript.InterfaceDeclaration;
import org.nasdanika.sdk.runtime.models.typescript.OpaqueTypeReference;
import org.nasdanika.sdk.runtime.models.typescript.Property;
import org.nasdanika.sdk.runtime.models.typescript.Module;
import org.nasdanika.sdk.runtime.models.typescript.Package;
import org.nasdanika.sdk.runtime.models.typescript.PrimitiveType;
import org.nasdanika.sdk.runtime.models.typescript.PrimitiveTypeReference;

/**
 * Generation of components, hooks, contexts and JSX in both syntaxes.
 */
public class ReactGeneratorTests {

	/**
	 * A package with a Badge component and a UserList component using it, a context,
	 * hooks, typed HTML intrinsics with JSX attributes and content, an iterator and a conditional.
	 *
	 * @param tsx JSX syntax in TsxModules with type annotations, or createElement calls in
	 * plain modules without type annotations
	 */
	private static Package userList(boolean tsx) {
		Package tsPackage = TS.createPackage();
		tsPackage.setName("users");
		tsPackage.setPackageName("@example/users");

		Module badgeModule = tsx ? REACT.createTsxModule() : TS.createModule();
		badgeModule.setName("badge");
		badgeModule.setPath("components/badge");
		tsPackage.getModules().add(badgeModule);

		// tag::badge[]
		ComponentDeclaration badge = REACT.createComponentDeclaration();
		badge.setName("Badge");
		badge.setExported(true);
		badge.getParameters().add(Jsx.parameter("props"));
		badge.setRender(Jsx.children(
				Jsx.tag("span", Jsx.literal("className", "badge")),
				Jsx.expression("props.name")));
		badgeModule.getDeclarations().add(badge);
		// end::badge[]

		Module module = tsx ? REACT.createTsxModule() : TS.createModule();
		module.setName("users");
		module.setPath("users");
		tsPackage.getModules().add(module);

		// tag::context[]
		ContextDeclaration themeContext = REACT.createContextDeclaration();
		themeContext.setName("ThemeContext");
		themeContext.setExported(true);
		if (tsx) {
			themeContext.setValueType(primitive(PrimitiveType.STRING));
		}
		themeContext.setDefaultValue(Jsx.code("\"light\""));
		module.getDeclarations().add(themeContext);
		// end::context[]

		ComponentDeclaration userList = REACT.createComponentDeclaration();
		userList.setName("UserList");
		userList.setExported(true);
		userList.setMemo(true);
		userList.setDocumentation("Users, filtered by name.");
		if (tsx) {
			// (props: UserListProps)
			InterfaceDeclaration props = TS.createInterfaceDeclaration();
			props.setName("UserListProps");
			props.setExported(true);
			Property users = TS.createProperty();
			users.setName("users");
			OpaqueTypeReference usersType = TS.createOpaqueTypeReference();
			usersType.setText("{ id: number; name: string }[]");
			users.setType(usersType);
			props.getMembers().add(users);
			module.getDeclarations().add(props);
			userList.setPropsType(props);
		} else {
			userList.getParameters().add(Jsx.parameter("props"));
		}

		// tag::hooks[]
		StateHook filter = Jsx.state("filter", "setFilter", "\"\"");
		if (tsx) {
			filter.setStateType(primitive(PrimitiveType.STRING));
		}
		userList.getHooks().add(filter);

		ContextHook theme = REACT.createContextHook();
		theme.getBindings().add("theme");
		theme.setContext(themeContext);
		userList.getHooks().add(theme);

		MemoHook visible = REACT.createMemoHook();
		visible.getBindings().add("visible");
		visible.setExpression(Jsx.code("props.users.filter(user => user.name.includes(filter))"));
		visible.getDependencies().add(Jsx.code("props.users"));
		visible.getDependencies().add(Jsx.code("filter"));
		userList.getHooks().add(visible);
		// end::hooks[]

		// tag::render[]
		Div root = HTML.createDiv();
		root.getClasses().add("user-list");
		root.getStyle().put("margin-top", "1rem");
		root.getAttributes().put("data-theme", "light");

		Label label = HTML.createLabel();
		label.setHtmlFor("filter");
		Jsx.contents(label, Jsx.htmlText("Filter: "));

		Input input = HTML.createInput();
		input.setId("filter");
		input.setType("text");
		input.setValue("ignored, value is controlled");

		ListItem item = HTML.createListItem();
		Jsx.contents(
				item,
				Jsx.content(Jsx.element(Jsx.reference(badge), Jsx.attribute("name", "user.name"))),
				Jsx.htmlText(" & friends"));

		Paragraph empty = HTML.createParagraph();
		Jsx.contents(empty, Jsx.htmlText("No users"));

		ContextProvider provider = REACT.createContextProvider();
		provider.setContext(themeContext);
		provider.setValue(Jsx.code("theme"));
		userList.setRender(Jsx.children(
				provider,
				Jsx.children(
						Jsx.intrinsic(root, Jsx.attribute("data-theme", "theme")),
						Jsx.intrinsic(label),
						Jsx.intrinsic(
								input,
								Jsx.attribute("value", "filter"),
								Jsx.event("onChange", "event => setFilter(event.target.value)")),
						Jsx.children(
								Jsx.intrinsic(HTML.createUnorderedList()),
								Jsx.iterator("visible", "user", "user.id", Jsx.intrinsic(item))),
						Jsx.conditional("visible.length === 0", Jsx.intrinsic(empty), null))));
		module.getDeclarations().add(userList);
		// end::render[]

		// A render prop style function returning JSX
		FunctionDeclaration renderName = TS.createFunctionDeclaration();
		renderName.setName("renderName");
		renderName.getParameters().add(Jsx.parameter("name"));
		JsxBlock body = REACT.createJsxBlock();
		body.setText("const upper = name.toUpperCase();");
		body.setRoot(Jsx.children(Jsx.tag("b"), Jsx.expression("upper")));
		renderName.setBody(body);
		module.getDeclarations().add(renderName);

		return tsPackage;
	}

	private static PrimitiveTypeReference primitive(PrimitiveType type) {
		PrimitiveTypeReference ret = TS.createPrimitiveTypeReference();
		ret.setPrimitiveType(type);
		return ret;
	}

	private static String generate(Module module) {
		return new ReactGenerator().generate(module).replace("\r\n", "\n");
	}

	/**
	 * JSX syntax. The output is written to target/react/generator/tsx for inspection; it
	 * type-checks with tsc --strict --jsx react-jsx given @types/react.
	 */
	@Test
	public void testTsx() throws Exception {
		Package tsPackage = userList(true);
		String users = generate(tsPackage.getModules().get(1));
		String badge = generate(tsPackage.getModules().get(0));
		Path out = Path.of("target", "react", "generator", "tsx", "components");
		Files.createDirectories(out);
		Files.writeString(out.getParent().resolve("users.tsx"), users);
		Files.writeString(out.resolve("badge.tsx"), badge);

		Expected.assertMatches("users.tsx", users);

		Expected.assertMatches("badge.tsx", badge);
	}

	/**
	 * createElement calls in plain modules. The output is written to
	 * target/react/generator/js for inspection; it renders with react-dom/server without warnings.
	 */
	@Test
	public void testCreateElement() throws Exception {
		Package tsPackage = userList(false);
		String users = generate(tsPackage.getModules().get(1));
		String badge = generate(tsPackage.getModules().get(0));
		Path out = Path.of("target", "react", "generator", "js", "components");
		Files.createDirectories(out);
		Files.writeString(out.getParent().resolve("users.js"), users);
		Files.writeString(out.resolve("badge.js"), badge);

		Expected.assertMatches("users.js", users);

		Expected.assertMatches("badge.js", badge);
	}

	/**
	 * HTML attributes and static form state mapped to React props.
	 */
	@Test
	public void testIntrinsicProps() {
		Div form = HTML.createDiv();

		Input checkbox = HTML.createInput();
		checkbox.setType("checkbox");
		checkbox.setValue("yes");
		checkbox.setChecked(true);
		checkbox.setReadonly(true);

		TextArea notes = HTML.createTextArea();
		notes.setText("Line 1\nLine 2");

		Select colors = HTML.createSelect();
		colors.setMultiple(true);
		for (String color: new String[] { "red", "green", "blue" }) {
			Option option = HTML.createOption();
			option.setValue(color);
			option.setText(color);
			option.setSelected(!"green".equals(color));
			colors.getItems().add(option);
		}

		Div styled = HTML.createDiv();
		styled.getStyle().put("-webkit-line-clamp", "2");
		styled.getStyle().put("-ms-flex", "1");
		styled.getStyle().put("--accent", "red");

		Div markup = HTML.createDiv();
		Markup html = HTML.createMarkup();
		html.setContent("<b>Bold</b>");
		markup.getContents().add(html);

		Comment comment = HTML.createComment();
		comment.setContent("A note");
		Jsx.contents(form, checkbox, notes, colors, styled, markup, comment);

		Module module = REACT.createTsxModule();
		module.setPath("form");
		ComponentDeclaration component = REACT.createComponentDeclaration();
		component.setName("Form");
		component.setRender(Jsx.intrinsic(form));
		module.getDeclarations().add(component);

		assertEquals("""
				function Form() {
				  return (
				    <div>
				      <input type="checkbox" value="yes" readOnly defaultChecked />
				      <textarea defaultValue={"Line 1\\nLine 2"} />
				      <select multiple defaultValue={["red", "blue"]}>
				        <option value="red">red</option>
				        <option value="green">green</option>
				        <option value="blue">blue</option>
				      </select>
				      <div style={{ WebkitLineClamp: "2", msFlex: "1", "--accent": "red" }} />
				      <div dangerouslySetInnerHTML={{ __html: "<b>Bold</b>" }} />
				      {/* A note */}
				    </div>
				  );
				}
				""", generate(module));
	}

	@Test
	public void testIteratorWithoutKey() {
		Module module = REACT.createTsxModule();
		module.setPath("list");
		ComponentDeclaration list = REACT.createComponentDeclaration();
		list.setName("List");
		list.setRender(Jsx.children(Jsx.tag("ul"), Jsx.iterator("items", "item", null, Jsx.tag("li"))));
		module.getDeclarations().add(list);
		NasdanikaException exception = assertThrows(NasdanikaException.class, () -> new ReactGenerator().generate(module));
		assertTrue(exception.getMessage().contains("without key"), exception.getMessage());
	}

	@Test
	public void testTsConfig() {
		Package tsPackage = userList(true);
		String tsConfig = new ReactGenerator().generateTsConfigJson(tsPackage);
		assertTrue(tsConfig.contains("\"jsx\": \"react-jsx\""), tsConfig);
		assertEquals(-1, new ReactGenerator().generateTsConfigJson(userList(false)).indexOf("\"jsx\""));
	}

}
