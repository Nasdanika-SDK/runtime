package org.nasdanika.sdk.runtime.models.react.bootstrap.tests;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.nasdanika.sdk.runtime.models.react.bootstrap.tests.Bootstrap.CONTENT;
import static org.nasdanika.sdk.runtime.models.react.bootstrap.tests.Bootstrap.CORE;
import static org.nasdanika.sdk.runtime.models.react.bootstrap.tests.Bootstrap.FORMS;
import static org.nasdanika.sdk.runtime.models.react.bootstrap.tests.Bootstrap.HTML;
import static org.nasdanika.sdk.runtime.models.react.bootstrap.tests.Bootstrap.NAVIGATION;
import static org.nasdanika.sdk.runtime.models.react.bootstrap.tests.Bootstrap.OVERLAYS;
import static org.nasdanika.sdk.runtime.models.react.bootstrap.tests.Bootstrap.REACT;
import static org.nasdanika.sdk.runtime.models.react.bootstrap.tests.Bootstrap.REACT_BOOTSTRAP;
import static org.nasdanika.sdk.runtime.models.react.bootstrap.tests.Bootstrap.attribute;
import static org.nasdanika.sdk.runtime.models.react.bootstrap.tests.Bootstrap.attributes;
import static org.nasdanika.sdk.runtime.models.react.bootstrap.tests.Bootstrap.callback;
import static org.nasdanika.sdk.runtime.models.react.bootstrap.tests.Bootstrap.children;
import static org.nasdanika.sdk.runtime.models.react.bootstrap.tests.Bootstrap.code;
import static org.nasdanika.sdk.runtime.models.react.bootstrap.tests.Bootstrap.content;
import static org.nasdanika.sdk.runtime.models.react.bootstrap.tests.Bootstrap.element;
import static org.nasdanika.sdk.runtime.models.react.bootstrap.tests.Bootstrap.event;
import static org.nasdanika.sdk.runtime.models.react.bootstrap.tests.Bootstrap.expression;
import static org.nasdanika.sdk.runtime.models.react.bootstrap.tests.Bootstrap.external;
import static org.nasdanika.sdk.runtime.models.react.bootstrap.tests.Bootstrap.intrinsic;
import static org.nasdanika.sdk.runtime.models.react.bootstrap.tests.Bootstrap.iterate;
import static org.nasdanika.sdk.runtime.models.react.bootstrap.tests.Bootstrap.size;
import static org.nasdanika.sdk.runtime.models.react.bootstrap.tests.Bootstrap.state;
import static org.nasdanika.sdk.runtime.models.react.bootstrap.tests.Bootstrap.text;
import static org.nasdanika.sdk.runtime.models.react.bootstrap.tests.Bootstrap.when;
import static org.nasdanika.sdk.runtime.models.react.bootstrap.tests.Bootstrap.with;

import java.io.IOException;
import java.util.List;
import java.util.function.Supplier;

import org.junit.jupiter.api.Test;
import org.nasdanika.sdk.runtime.models.html.Anchor;
import org.nasdanika.sdk.runtime.models.html.Div;
import org.nasdanika.sdk.runtime.models.html.ListItem;
import org.nasdanika.sdk.runtime.models.html.Paragraph;
import org.nasdanika.sdk.runtime.models.html.TableCell;
import org.nasdanika.sdk.runtime.models.html.TableHead;
import org.nasdanika.sdk.runtime.models.html.TableRow;
import org.nasdanika.sdk.runtime.models.html.UnorderedList;
import org.nasdanika.sdk.runtime.models.react.ComponentDeclaration;
import org.nasdanika.sdk.runtime.models.react.JsxNode;
import org.nasdanika.sdk.runtime.models.react.bootstrap.Breakpoint;
import org.nasdanika.sdk.runtime.models.react.bootstrap.ButtonVariant;
import org.nasdanika.sdk.runtime.models.react.bootstrap.Col;
import org.nasdanika.sdk.runtime.models.react.bootstrap.Container;
import org.nasdanika.sdk.runtime.models.react.bootstrap.Direction;
import org.nasdanika.sdk.runtime.models.react.bootstrap.Row;
import org.nasdanika.sdk.runtime.models.react.bootstrap.Size;
import org.nasdanika.sdk.runtime.models.react.bootstrap.Variant;
import org.nasdanika.sdk.runtime.models.react.bootstrap.components.content.ButtonType;
import org.nasdanika.sdk.runtime.models.react.bootstrap.components.content.Card;
import org.nasdanika.sdk.runtime.models.react.bootstrap.components.content.SpinnerAnimation;
import org.nasdanika.sdk.runtime.models.react.bootstrap.components.content.PlaceholderAnimation;
import org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.NavVariant;
import org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.NavbarTheme;
import org.nasdanika.sdk.runtime.models.react.bootstrap.components.overlays.OffcanvasPlacement;
import org.nasdanika.sdk.runtime.models.react.bootstrap.components.overlays.Placement;
import org.nasdanika.sdk.runtime.models.react.bootstrap.components.overlays.ToastContainment;
import org.nasdanika.sdk.runtime.models.react.bootstrap.components.overlays.ToastPosition;
import org.nasdanika.sdk.runtime.models.react.bootstrap.components.overlays.Trigger;
import org.nasdanika.sdk.runtime.models.react.bootstrap.forms.CheckType;
import org.nasdanika.sdk.runtime.models.react.bootstrap.forms.FeedbackType;
import org.nasdanika.sdk.runtime.models.react.bootstrap.forms.FormControl;
import org.nasdanika.sdk.runtime.models.react.bootstrap.forms.FormGroup;
import org.nasdanika.sdk.runtime.models.react.generator.ReactGenerator;
import org.nasdanika.sdk.runtime.models.typescript.Module;

/**
 * Demo sites built from the React Bootstrap model - one page per package, with a
 * component generated as createElement calls, which browsers run without a build step.
 * <p>
 * Browse with <code>jwebserver -d target/react-bootstrap/site</code> and open
 * <a href="http://127.0.0.1:8000/">http://127.0.0.1:8000/</a>. The pages load React
 * and React Bootstrap from esm.sh, so the browser needs internet access.
 * <p>
 * TSX versions of the modules are written to target/react-bootstrap/tsx for inspection.
 */
public class BootstrapDemoTests {

	private record Demo(String name, String title, String description) {}

	private static final String INDEX_TITLE = "React Bootstrap model demos";

	private static final List<Demo> DEMOS = List.of(
			new Demo("content", "Layout and content", "Grid, cards, alerts, badges, list groups, progress, tables, accordion, carousel"),
			new Demo("forms", "Forms", "Validated form with groups, floating labels, input groups, selects, checks and ranges"),
			new Demo("navigation", "Navigation", "Navbar, breadcrumb, tabs, pills, pagination and dropdowns"),
			new Demo("overlays", "Overlays", "Modal, offcanvas, toast, tooltip and popover"));

	/**
	 * Writes the page and module of a demo, the TSX version of the module, and the index.
	 */
	private static String site(String name, Supplier<ComponentDeclaration> app) throws IOException {
		Demo demo = DEMOS.stream().filter(d -> d.name().equals(name)).findFirst().orElseThrow();
		Module module = SiteSupport.module(Bootstrap.TS.createModule(), name, app.get());
		String source = new ReactGenerator().generate(module);
		SiteSupport.write(SiteSupport.SITE.resolve("modules/" + name + ".js"), source);
		SiteSupport.write(SiteSupport.SITE.resolve(name + ".html"), SiteSupport.html(SiteSupport.page(demo.title(), name)));

		Module tsxModule = SiteSupport.module(REACT.createTsxModule(), name, app.get());
		SiteSupport.write(SiteSupport.TSX.resolve(name + ".tsx"), new ReactGenerator().generate(tsxModule));

		SiteSupport.write(SiteSupport.SITE.resolve("index.html"), SiteSupport.html(SiteSupport.page(INDEX_TITLE, "index")));
		SiteSupport.write(SiteSupport.SITE.resolve("modules/index.js"), new ReactGenerator().generate(SiteSupport.module(Bootstrap.TS.createModule(), "index", index())));

		assertTrue(source.contains("export function mount(element)"), source);
		assertTrue(source.contains("from \"react-bootstrap\""), source);
		return source;
	}

	/**
	 * Links to the demos, as cards.
	 */
	private static ComponentDeclaration index() {
		Row row = with(CORE.createRow(), r -> {
			r.getClasses().add("g-4");
			r.getColumnsPerRow().add(with(CORE.createRowColumns(), c -> { c.setBreakpoint(Breakpoint.XS); c.setCount(1); }));
			r.getColumnsPerRow().add(with(CORE.createRowColumns(), c -> { c.setBreakpoint(Breakpoint.MD); c.setCount(2); }));
		});
		for (Demo demo: DEMOS) {
			row.getColumns().add(with(CORE.createCol(), col -> col.getChildren().add(with(CONTENT.createCard(), card -> {
				card.getClasses().add("h-100");
				card.getBodies().add(with(CONTENT.createCardBody(), body -> {
					body.setTitle(with(CONTENT.createCardTitle(), t -> t.setContent(demo.title())));
					body.getTexts().add(with(CONTENT.createCardText(), t -> t.setContent(demo.description())));
					body.getLinks().add(with(CONTENT.createCardLink(), l -> { l.setHref(demo.name() + ".html"); l.setContent("Open"); }));
				}));
			}))));
		}
		return app("Index", container(INDEX_TITLE, "Pages generated from the Nasdanika React Bootstrap model", row));
	}

	private static ComponentDeclaration app(String name, JsxNode render) {
		return with(REACT.createComponentDeclaration(), c -> {
			c.setName(name);
			c.setRender(render);
		});
	}

	/**
	 * Page container with a heading and a lead paragraph.
	 */
	private static Container container(String title, String lead, JsxNode... content) {
		Container container = with(CORE.createContainer(), c -> c.getClasses().add("py-4"));
		container.getChildren().add(element(HTML.createHeading(), title, "mb-1"));
		container.getChildren().add(element(HTML.createParagraph(), lead, "lead", "text-secondary"));
		container.getChildren().addAll(List.of(content));
		if (!INDEX_TITLE.equals(title)) {
			Anchor back = with(HTML.createAnchor(), a -> a.setHref("index.html"));
			container.getChildren().add(element(back, "All demos", "d-block", "mt-4"));
		}
		return container;
	}

	private static Col col(int md, JsxNode... content) {
		return with(CORE.createCol(), c -> {
			c.getSizes().add(size(Breakpoint.MD, md));
			c.getChildren().addAll(List.of(content));
		});
	}

	private static Row row(String classes, Col... columns) {
		return with(CORE.createRow(), r -> {
			r.getClasses().addAll(List.of(classes.split(" ")));
			r.getColumns().addAll(List.of(columns));
		});
	}

	private static JsxNode heading(String text) {
		return element(with(HTML.createHeading(), h -> h.setLevel(2)), text, "h4", "mt-4");
	}

	// --- Content -----------------------------------------------------------------

	private static ComponentDeclaration contentApp() {
		ComponentDeclaration app = app("ContentDemo", null);
		app.getHooks().add(state("showAlert", "setShowAlert", "true"));
		app.getHooks().add(state("progress", "setProgress", "40"));
		app.setBody(code("""
				const releases = [
				  { name: "HTML model", status: "Done", variant: "success" },
				  { name: "React model", status: "Done", variant: "success" },
				  { name: "React Bootstrap model", status: "In progress", variant: "warning" },
				  { name: "React Flow model", status: "Next", variant: "secondary" }
				];
				"""));

		var alert = attributes(
				with(CONTENT.createAlert(), a -> {
					a.setVariant(Variant.INFO);
					a.setDismissible(true);
					a.setHeading(with(CONTENT.createAlertHeading(), h -> h.setContent("Generated from a model")));
					a.setContent("Every element on this page is an object of the React Bootstrap model, generated to createElement calls.");
				}),
				attribute("show", "showAlert"),
				event("onClose", "() => setShowAlert(false)"));

		Row cards = with(CORE.createRow(), r -> {
			r.getClasses().add("g-3");
			r.getColumnsPerRow().add(with(CORE.createRowColumns(), c -> { c.setBreakpoint(Breakpoint.XS); c.setCount(1); }));
			r.getColumnsPerRow().add(with(CORE.createRowColumns(), c -> { c.setBreakpoint(Breakpoint.MD); c.setCount(3); }));
		});
		String[][] models = {
				{ "HTML", "A technology model of HTML with a text generator.", "primary" },
				{ "React", "Components, hooks and JSX on top of the TypeScript model.", "success" },
				{ "React Bootstrap", "Typed construction of React Bootstrap UIs.", "dark" } };
		for (String[] model: models) {
			Card card = with(CONTENT.createCard(), c -> {
				c.getClasses().add("h-100");
				c.setBorder(Variant.valueOf(model[2].toUpperCase()));
				c.setHeader(with(CONTENT.createCardHeader(), h -> h.setContent("Model")));
				c.getBodies().add(with(CONTENT.createCardBody(), b -> {
					b.setTitle(with(CONTENT.createCardTitle(), t -> t.setContent(model[0])));
					b.getTexts().add(with(CONTENT.createCardText(), t -> t.setContent(model[1])));
				}));
				c.setFooter(with(CONTENT.createCardFooter(), f -> {
					f.getChildren().add(with(CONTENT.createBadge(), badge -> { badge.setBg(Variant.valueOf(model[2].toUpperCase())); badge.setContent(model[0]); }));
				}));
			});
			cards.getColumns().add(with(CORE.createCol(), col -> col.getChildren().add(card)));
		}

		var listGroup = with(CONTENT.createListGroup(), l -> {
			l.getItems().add(with(CONTENT.createListGroupItem(), i -> { i.setActive(true); i.setContent("Active item"); }));
			l.getItems().add(with(CONTENT.createListGroupItem(), i -> i.setContent("Plain item")));
			l.getItems().add(with(CONTENT.createListGroupItem(), i -> { i.setVariant(Variant.SUCCESS); i.setContent("Success variant"); }));
			l.getItems().add(with(CONTENT.createListGroupItem(), i -> { i.setDisabled(true); i.setContent("Disabled item"); }));
		});

		// Shows the progress state
		var liveBar = attributes(CONTENT.createProgressBar(), attribute("now", "progress"), attribute("label", "`${progress}%`"));
		var progress = with(CORE.createStack(), s -> {
			s.setGap(3);
			s.getChildren().add(liveBar);
			s.getChildren().add(with(CONTENT.createProgressBar(), p -> {
				p.getBars().add(with(CONTENT.createProgressBar(), b -> { b.setVariant(Variant.SUCCESS); b.setNow(35); }));
				p.getBars().add(with(CONTENT.createProgressBar(), b -> { b.setVariant(Variant.WARNING); b.setNow(20); b.setStriped(true); }));
				p.getBars().add(with(CONTENT.createProgressBar(), b -> { b.setVariant(Variant.DANGER); b.setNow(10); b.setAnimated(true); b.setStriped(true); }));
			}));
			s.getChildren().add(with(CORE.createStack(), buttons -> {
				buttons.setDirection(Direction.HORIZONTAL);
				buttons.setGap(2);
				buttons.getChildren().add(attributes(
						with(CONTENT.createButton(), b -> { b.setVariant(ButtonVariant.OUTLINE_PRIMARY); b.setSize(Size.SM); b.setContent("+10%"); }),
						event("onClick", "() => setProgress(value => Math.min(100, value + 10))")));
				buttons.getChildren().add(with(CONTENT.createSpinner(), sp -> { sp.setAnimation(SpinnerAnimation.GROW); sp.setVariant(Variant.PRIMARY); sp.setSize(Size.SM); }));
				buttons.getChildren().add(with(CONTENT.createSpinner(), sp -> { sp.setAnimation(SpinnerAnimation.BORDER); sp.setSize(Size.SM); }));
			}));
			s.getChildren().add(with(CONTENT.createPlaceholder(), p -> {
				p.setAnimation(PlaceholderAnimation.GLOW);
				p.setAs("p");
				p.getPlaceholders().add(with(CONTENT.createPlaceholder(), inner -> inner.getSizes().add(size(Breakpoint.XS, 7))));
				p.getPlaceholders().add(with(CONTENT.createPlaceholder(), inner -> { inner.getSizes().add(size(Breakpoint.XS, 4)); inner.getClasses().add("ms-1"); }));
			}));
		});

		TableHead tableHead = HTML.createTableHead();
		TableRow headerRow = HTML.createTableRow();
		for (String header: new String[] { "Model", "Status" }) {
			TableCell cell = HTML.createTableCell();
			cell.setHeader(true);
			cell.getContents().add(Bootstrap.htmlText(header));
			headerRow.getCells().add(cell);
		}
		tableHead.getRows().add(headerRow);
		TableRow template = HTML.createTableRow();
		TableCell nameCell = HTML.createTableCell();
		nameCell.getContents().add(content(expression("release.name")));
		TableCell statusCell = HTML.createTableCell();
		statusCell.getContents().add(content(children(attributes(CONTENT.createBadge(), attribute("bg", "release.variant")), expression("release.status"))));
		template.getCells().add(nameCell);
		template.getCells().add(statusCell);
		var table = with(CONTENT.createTable(), t -> {
			t.setStriped(true);
			t.setHover(true);
			t.setResponsive(true);
			t.setHead(tableHead);
			t.getChildren().add(children(intrinsic(HTML.createTableBody()), iterate("releases", "release", "release.name", intrinsic(template))));
		});

		var accordion = with(CONTENT.createAccordion(), a -> {
			a.setDefaultActiveKey("0");
			String[][] items = {
					{ "Why a model?", "Typed construction catches structural errors, and imports are computed." },
					{ "How is it rendered?", "Reflectively, from annotations on the Xcore classes - no generator code per component." } };
			for (int i = 0; i < items.length; ++i) {
				String key = String.valueOf(i);
				String[] item = items[i];
				a.getItems().add(with(CONTENT.createAccordionItem(), ai -> {
					ai.setEventKey(key);
					ai.setHeader(with(CONTENT.createAccordionHeader(), h -> h.setContent(item[0])));
					ai.setBody(with(CONTENT.createAccordionBody(), b -> b.setContent(item[1])));
				}));
			}
		});

		var carousel = with(CONTENT.createCarousel(), c -> {
			c.setInterval(4000);
			String[][] slides = { { "First slide", "#0d6efd" }, { "Second slide", "#198754" }, { "Third slide", "#6f42c1" } };
			for (String[] slide: slides) {
				c.getItems().add(with(CONTENT.createCarouselItem(), item -> {
					Div background = with(HTML.createDiv(), d -> {
						d.getStyle().put("height", "220px");
						d.getStyle().put("background", slide[1]);
					});
					item.setContent(intrinsic(background));
					item.setCaption(with(CONTENT.createCarouselCaption(), caption -> {
						caption.getContent().add(element(with(HTML.createHeading(), h -> h.setLevel(3)), slide[0]));
						caption.getContent().add(element(HTML.createParagraph(), "A carousel item with an HTML model background"));
					}));
				}));
			}
		});

		app.setRender(container(
				"Layout and content",
				"Grid, cards, alerts, badges, list groups, progress, tables, accordion and carousel",
				alert,
				cards,
				row("mt-1 g-4", col(6, heading("List group"), listGroup), col(6, heading("Progress, spinners, placeholders"), progress)),
				heading("Table with dynamic rows"),
				table,
				row("g-4", col(6, heading("Accordion"), accordion), col(6, heading("Carousel"), carousel))));
		return app;
	}

	@Test
	public void testContent() throws IOException {
		String source = site("content", BootstrapDemoTests::contentApp);
		assertTrue(source.contains("releases.map(release =>"), source);
	}

	// --- Forms -------------------------------------------------------------------

	private static FormGroup group(String controlId, String label, JsxNode control, String feedback) {
		return with(FORMS.createFormGroup(), g -> {
			g.setControlId(controlId);
			g.setAsComponent(external("Col", REACT_BOOTSTRAP));
			g.setLabel(with(FORMS.createFormLabel(), l -> l.setContent(label)));
			g.getControls().add(control);
			if (feedback != null) {
				g.getFeedback().add(with(FORMS.createFormControlFeedback(), f -> { f.setType(FeedbackType.INVALID); f.setContent(feedback); }));
			}
		});
	}

	private static FormControl control(String type, String placeholder, boolean required) {
		return with(FORMS.createFormControl(), c -> {
			c.setType(type);
			c.setPlaceholder(placeholder);
			c.setRequired(required);
		});
	}

	private static ComponentDeclaration formsApp() {
		ComponentDeclaration app = app("FormsDemo", null);
		app.getHooks().add(state("validated", "setValidated", "false"));
		app.getHooks().add(state("submitted", "setSubmitted", "false"));
		app.getHooks().add(callback("handleSubmit", """
				event => {
				  event.preventDefault();
				  event.stopPropagation();
				  setValidated(true);
				  setSubmitted(event.currentTarget.checkValidity());
				}
				"""));

		Row names = row("mb-3",
				new Col[0]);
		FormGroup firstName = group("firstName", "First name", control("text", "First name", true), "First name is required");
		FormGroup lastName = group("lastName", "Last name", control("text", "Last name", true), "Last name is required");
		attributes(firstName, attribute("md", "6"));
		attributes(lastName, attribute("md", "6"));
		names.getChildren().add(firstName);
		names.getChildren().add(lastName);

		var email = with(FORMS.createFloatingLabel(), f -> {
			f.setControlId("email");
			f.setLabel("Email address");
			f.getClasses().add("mb-3");
			f.setControl(control("email", "name@example.com", true));
		});

		var username = with(FORMS.createFormGroup(), g -> {
			g.setControlId("username");
			g.getClasses().add("mb-3");
			g.setLabel(with(FORMS.createFormLabel(), l -> l.setContent("Username")));
			g.getControls().add(with(FORMS.createInputGroup(), ig -> {
				ig.setHasValidation(true);
				ig.getItems().add(with(FORMS.createInputGroupText(), t -> t.setContent("@")));
				ig.getItems().add(control("text", "Username", true));
				ig.getItems().add(with(FORMS.createFormControlFeedback(), f -> { f.setType(FeedbackType.INVALID); f.setContent("Choose a username"); }));
			}));
			g.setText(with(FORMS.createFormText(), t -> { t.setMuted(true); t.setContent("Letters, digits and underscores."); }));
		});

		var plan = with(FORMS.createFormGroup(), g -> {
			g.setControlId("plan");
			g.setAsComponent(external("Row", REACT_BOOTSTRAP));
			g.getClasses().add("mb-3");
			g.setLabel(with(FORMS.createFormLabel(), l -> {
				l.setColumn(true);
				l.getSizes().add(size(Breakpoint.SM, 2));
				l.setContent("Plan");
			}));
			g.getControls().add(with(CORE.createCol(), c -> {
				c.getSizes().add(size(Breakpoint.SM, 10));
				c.getChildren().add(with(FORMS.createFormSelect(), s -> {
					s.setFieldName("plan");
					s.setInitialValue("team");
					for (String[] option: new String[][] { { "free", "Free" }, { "team", "Team" }, { "enterprise", "Enterprise" } }) {
						s.getOptions().add(with(HTML.createOption(), o -> { o.setValue(option[0]); o.setText(option[1]); }));
					}
				}));
			}));
		});

		var contact = with(FORMS.createFormGroup(), g -> {
			g.getClasses().add("mb-3");
			g.setLabel(with(FORMS.createFormLabel(), l -> l.setContent("Contact me by")));
			for (String channel: new String[] { "Email", "Phone" }) {
				g.getControls().add(with(FORMS.createFormCheck(), c -> {
					c.setType(CheckType.RADIO);
					c.setInline(true);
					c.setFieldName("contact");
					c.setElementId("contact-" + channel.toLowerCase());
					c.setValue(channel.toLowerCase());
					c.setLabel(channel);
					c.setDefaultChecked("Email".equals(channel));
				}));
			}
			g.getControls().add(with(FORMS.createFormCheck(), c -> {
				c.setType(CheckType.SWITCH);
				c.setElementId("newsletter");
				c.setLabel("Subscribe to the newsletter");
			}));
		});

		var range = with(FORMS.createFormGroup(), g -> {
			g.setControlId("experience");
			g.getClasses().add("mb-3");
			g.setLabel(with(FORMS.createFormLabel(), l -> l.setContent("Experience with models")));
			g.getControls().add(with(FORMS.createFormRange(), r -> { r.setMin(0); r.setMax(10); r.setInitialValue(5); }));
		});

		var terms = with(FORMS.createFormGroup(), g -> {
			g.getClasses().add("mb-3");
			g.getControls().add(with(FORMS.createFormCheck(), c -> {
				c.setElementId("terms");
				c.setRequired(true);
				c.setLabel("Agree to terms and conditions");
				c.setFeedback("You must agree before submitting.");
				c.setFeedbackType("invalid");
			}));
		});

		var form = attributes(
				with(FORMS.createForm(), f -> {
					f.setNoValidate(true);
					f.getChildren().addAll(List.of(names, email, username, plan, contact, range, terms));
					f.getChildren().add(with(CONTENT.createButton(), b -> { b.setType(ButtonType.SUBMIT); b.setContent("Submit"); }));
				}),
				attribute("validated", "validated"),
				event("onSubmit", "handleSubmit"));

		var submitted = when("submitted", with(CONTENT.createAlert(), a -> {
			a.setVariant(Variant.SUCCESS);
			a.getClasses().add("mt-3");
			a.setContent("The form is valid.");
		}));

		app.setRender(container("Forms", "Validated form with groups, floating labels, input groups, selects, checks and ranges", form, submitted));
		return app;
	}

	@Test
	public void testForms() throws IOException {
		String source = site("forms", BootstrapDemoTests::formsApp);
		assertTrue(source.contains("Form.Control.Feedback"), source);
	}

	// --- Navigation --------------------------------------------------------------

	private static ComponentDeclaration navigationApp() {
		ComponentDeclaration app = app("NavigationDemo", null);
		app.getHooks().add(state("page", "setPage", "1"));
		app.getHooks().add(state("section", "setSection", "\"overview\""));

		var navbar = with(NAVIGATION.createNavbar(), n -> {
			n.setBg(Variant.DARK);
			n.setTheme(NavbarTheme.DARK);
			n.setExpand(Breakpoint.LG);
			n.getContent().add(with(CORE.createContainer(), c -> {
				c.getChildren().add(with(NAVIGATION.createNavbarBrand(), b -> { b.setHref("index.html"); b.setContent("Nasdanika"); }));
				c.getChildren().add(with(NAVIGATION.createNavbarToggle(), t -> t.setControls("main-nav")));
				c.getChildren().add(with(NAVIGATION.createNavbarCollapse(), collapse -> {
					collapse.setElementId("main-nav");
					collapse.getContent().add(with(NAVIGATION.createNav(), nav -> {
						nav.getClasses().add("me-auto");
						nav.getEntries().add(with(NAVIGATION.createNavLink(), l -> { l.setHref("index.html"); l.setContent("Demos"); }));
						nav.getEntries().add(with(NAVIGATION.createNavLink(), l -> { l.setHref("https://react-bootstrap.netlify.app/"); l.setContent("React Bootstrap"); }));
						nav.getEntries().add(with(NAVIGATION.createNavDropdown(), d -> {
							d.setTitle("Models");
							d.setElementId("models-dropdown");
							for (String model: new String[] { "HTML", "React", "React Bootstrap" }) {
								d.getEntries().add(with(NAVIGATION.createDropdownItem(), i -> { i.setHref("#" + model.toLowerCase().replace(' ', '-')); i.setContent(model); }));
							}
							d.getEntries().add(NAVIGATION.createDropdownDivider());
							d.getEntries().add(with(NAVIGATION.createDropdownItem(), i -> { i.setHref("#flow"); i.setContent("React Flow - next"); i.setDisabled(true); }));
						}));
					}));
					collapse.getContent().add(with(NAVIGATION.createNavbarText(), t -> t.setContent("Generated from a model")));
				}));
			}));
		});

		var breadcrumb = with(NAVIGATION.createBreadcrumb(), b -> {
			b.getItems().add(with(NAVIGATION.createBreadcrumbItem(), i -> { i.setHref("index.html"); i.setContent("Demos"); }));
			b.getItems().add(with(NAVIGATION.createBreadcrumbItem(), i -> { i.setActive(true); i.setContent("Navigation"); }));
		});

		var tabs = with(NAVIGATION.createTabs(), t -> {
			t.setDefaultActiveKey("html");
			t.setElementId("model-tabs");
			t.getClasses().add("mb-3");
			String[][] items = {
					{ "html", "HTML", "Documents, elements and text, generated to HTML." },
					{ "react", "React", "Components, hooks and JSX, generated to TSX or createElement calls." },
					{ "bootstrap", "React Bootstrap", "Typed React Bootstrap components, rendered from annotations." } };
			for (String[] item: items) {
				t.getTabs().add(with(NAVIGATION.createTab(), tab -> { tab.setEventKey(item[0]); tab.setTitle(item[1]); tab.setContent(item[2]); }));
			}
			t.getTabs().add(with(NAVIGATION.createTab(), tab -> { tab.setEventKey("flow"); tab.setTitle("React Flow"); tab.setDisabled(true); }));
		});

		var pills = attributes(
				with(NAVIGATION.createNav(), nav -> {
					nav.setVariant(NavVariant.PILLS);
					nav.getClasses().add("mb-2");
					for (String section: new String[] { "overview", "details", "history" }) {
						nav.getEntries().add(with(NAVIGATION.createNavItem(), item -> item.setLink(with(NAVIGATION.createNavLink(), l -> {
							l.setEventKey(section);
							l.setContent(Character.toUpperCase(section.charAt(0)) + section.substring(1));
						}))));
					}
				}),
				attribute("activeKey", "section"),
				event("onSelect", "key => setSection(key ?? \"overview\")"));

		var pagination = with(NAVIGATION.createPagination(), p -> {
			p.getEntries().add(attributes(NAVIGATION.createPaginationPrev(), attribute("disabled", "page === 1"), event("onClick", "() => setPage(page - 1)")));
			for (int i = 1; i <= 5; ++i) {
				int number = i;
				p.getEntries().add(attributes(
						with(NAVIGATION.createPaginationItem(), item -> item.setContent(String.valueOf(number))),
						attribute("active", "page === " + number),
						event("onClick", "() => setPage(" + number + ")")));
			}
			p.getEntries().add(attributes(NAVIGATION.createPaginationNext(), attribute("disabled", "page === 5"), event("onClick", "() => setPage(page + 1)")));
		});

		var dropdowns = with(CORE.createStack(), s -> {
			s.setDirection(Direction.HORIZONTAL);
			s.setGap(2);
			s.getChildren().add(with(NAVIGATION.createDropdown(), d -> {
				d.setToggle(with(NAVIGATION.createDropdownToggle(), t -> { t.setVariant(ButtonVariant.SUCCESS); t.setElementId("dropdown-basic"); t.setContent("Dropdown"); }));
				d.setMenu(with(NAVIGATION.createDropdownMenu(), m -> {
					m.getEntries().add(with(NAVIGATION.createDropdownHeader(), h -> h.setContent("Actions")));
					m.getEntries().add(with(NAVIGATION.createDropdownItem(), i -> { i.setHref("#action"); i.setContent("Action"); }));
					m.getEntries().add(with(NAVIGATION.createDropdownItem(), i -> { i.setHref("#another"); i.setContent("Another action"); }));
				}));
			}));
			s.getChildren().add(with(NAVIGATION.createDropdownButton(), d -> {
				d.setElementId("dropdown-button");
				d.setTitle("Dropdown button");
				d.setVariant(ButtonVariant.OUTLINE_SECONDARY);
				d.getEntries().add(with(NAVIGATION.createDropdownItem(), i -> { i.setHref("#one"); i.setContent("One"); }));
				d.getEntries().add(with(NAVIGATION.createDropdownItem(), i -> { i.setHref("#two"); i.setContent("Two"); }));
			}));
			s.getChildren().add(with(NAVIGATION.createSplitButton(), d -> {
				d.setElementId("split-button");
				d.setTitle("Split button");
				d.setVariant(ButtonVariant.INFO);
				d.getEntries().add(with(NAVIGATION.createDropdownItem(), i -> { i.setHref("#split"); i.setContent("Split action"); }));
			}));
		});

		Paragraph selected = HTML.createParagraph();
		selected.getContents().add(Bootstrap.htmlText("Selected section: "));
		selected.getContents().add(content(expression("section")));
		Paragraph currentPage = HTML.createParagraph();
		currentPage.getContents().add(Bootstrap.htmlText("Page "));
		currentPage.getContents().add(content(expression("page")));

		var fragment = REACT.createJsxFragment();
		fragment.getChildren().add(navbar);
		fragment.getChildren().add(container(
				"Navigation",
				"Navbar, breadcrumb, tabs, pills, pagination and dropdowns",
				breadcrumb,
				heading("Tabs"),
				tabs,
				heading("Pills"),
				pills,
				intrinsic(selected),
				heading("Pagination"),
				pagination,
				intrinsic(currentPage),
				heading("Dropdowns"),
				dropdowns));
		app.setRender(fragment);
		return app;
	}

	@Test
	public void testNavigation() throws IOException {
		String source = site("navigation", BootstrapDemoTests::navigationApp);
		assertTrue(source.contains("Navbar.Collapse"), source);
	}

	// --- Overlays ----------------------------------------------------------------

	private static ComponentDeclaration overlaysApp() {
		ComponentDeclaration app = app("OverlaysDemo", null);
		app.getHooks().add(state("showModal", "setShowModal", "false"));
		app.getHooks().add(state("showOffcanvas", "setShowOffcanvas", "false"));
		app.getHooks().add(state("showToast", "setShowToast", "false"));

		var buttons = with(CORE.createStack(), s -> {
			s.setDirection(Direction.HORIZONTAL);
			s.setGap(2);
			s.getClasses().add("flex-wrap");
			s.getChildren().add(attributes(with(CONTENT.createButton(), b -> b.setContent("Modal")), event("onClick", "() => setShowModal(true)")));
			s.getChildren().add(attributes(with(CONTENT.createButton(), b -> { b.setVariant(ButtonVariant.SECONDARY); b.setContent("Offcanvas"); }), event("onClick", "() => setShowOffcanvas(true)")));
			s.getChildren().add(attributes(with(CONTENT.createButton(), b -> { b.setVariant(ButtonVariant.SUCCESS); b.setContent("Toast"); }), event("onClick", "() => setShowToast(true)")));
			s.getChildren().add(with(OVERLAYS.createOverlayTrigger(), t -> {
				t.setPlacement(Placement.TOP);
				t.setOverlay(with(OVERLAYS.createTooltip(), tip -> { tip.setElementId("demo-tooltip"); tip.setContent("A tooltip from the model"); }));
				t.setTarget(with(CONTENT.createButton(), b -> { b.setVariant(ButtonVariant.OUTLINE_DARK); b.setContent("Hover for a tooltip"); }));
			}));
			s.getChildren().add(with(OVERLAYS.createOverlayTrigger(), t -> {
				t.setPlacement(Placement.BOTTOM);
				t.getTrigger().add(Trigger.CLICK);
				t.setRootClose(true);
				t.setOverlay(with(OVERLAYS.createPopover(), p -> {
					p.setElementId("demo-popover");
					p.setHeader(with(OVERLAYS.createPopoverHeader(), h -> h.setContent("Popover")));
					p.setBody(with(OVERLAYS.createPopoverBody(), b -> b.setContent("Click outside to close.")));
				}));
				t.setTarget(with(CONTENT.createButton(), b -> { b.setVariant(ButtonVariant.OUTLINE_INFO); b.setContent("Click for a popover"); }));
			}));
		});

		var modal = attributes(
				with(OVERLAYS.createModal(), m -> {
					m.setCentered(true);
					m.setHeader(with(OVERLAYS.createModalHeader(), h -> {
						h.setCloseButton(true);
						h.setTitle(with(OVERLAYS.createModalTitle(), t -> t.setContent("A modal")));
					}));
					m.setBody(with(OVERLAYS.createModalBody(), b -> b.setContent("Shown and hidden with a state hook of the demo component.")));
					m.setFooter(with(OVERLAYS.createModalFooter(), f -> f.getContent().add(attributes(
							with(CONTENT.createButton(), b -> { b.setVariant(ButtonVariant.SECONDARY); b.setContent("Close"); }),
							event("onClick", "() => setShowModal(false)")))));
				}),
				attribute("show", "showModal"),
				event("onHide", "() => setShowModal(false)"));

		UnorderedList models = HTML.createUnorderedList();
		for (String model: new String[] { "HTML", "React", "React Bootstrap" }) {
			ListItem item = HTML.createListItem();
			item.getContents().add(Bootstrap.htmlText(model));
			models.getItems().add(item);
		}
		var offcanvas = attributes(
				with(OVERLAYS.createOffcanvas(), o -> {
					o.setPlacement(OffcanvasPlacement.END);
					o.setHeader(with(OVERLAYS.createOffcanvasHeader(), h -> {
						h.setCloseButton(true);
						h.setTitle(with(OVERLAYS.createOffcanvasTitle(), t -> t.setContent("Models")));
					}));
					o.setBody(children(OVERLAYS.createOffcanvasBody(), intrinsic(models)));
				}),
				attribute("show", "showOffcanvas"),
				event("onHide", "() => setShowOffcanvas(false)"));

		var toasts = with(OVERLAYS.createToastContainer(), c -> {
			c.setPosition(ToastPosition.TOP_END);
			c.setContainment(ToastContainment.FIXED);
			c.getClasses().add("p-3");
			c.getToasts().add(attributes(
					with(OVERLAYS.createToast(), t -> {
						t.setAutohide(true);
						t.setDelay(4000);
						t.setHeader(with(OVERLAYS.createToastHeader(), h -> {
							h.getContent().add(element(HTML.createStrong(), "Nasdanika", "me-auto"));
							h.getContent().add(element(with(HTML.createGenericElement(), small -> small.setName("small")), "just now"));
						}));
						t.setBody(with(OVERLAYS.createToastBody(), b -> b.setContent("Hides itself after four seconds.")));
					}),
					attribute("show", "showToast"),
					event("onClose", "() => setShowToast(false)")));
		});

		app.setRender(container("Overlays", "Modal, offcanvas, toast, tooltip and popover", buttons, modal, offcanvas, toasts));
		return app;
	}

	@Test
	public void testOverlays() throws IOException {
		String source = site("overlays", BootstrapDemoTests::overlaysApp);
		assertTrue(source.contains("OverlayTrigger"), source);
	}

	@Test
	public void testIndex() throws IOException {
		site("content", BootstrapDemoTests::contentApp);
		String index = java.nio.file.Files.readString(SiteSupport.SITE.resolve("index.html"));
		assertTrue(index.contains("<script type=\"importmap\">"), index);
		assertTrue(index.contains("modules/index.js"), index);
	}

}
