package org.nasdanika.sdk.runtime.models.html.bootstrap.tests;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.nasdanika.sdk.runtime.models.html.bootstrap.tests.Bootstrap.CONTENT;
import static org.nasdanika.sdk.runtime.models.html.bootstrap.tests.Bootstrap.CORE;
import static org.nasdanika.sdk.runtime.models.html.bootstrap.tests.Bootstrap.FORMS;
import static org.nasdanika.sdk.runtime.models.html.bootstrap.tests.Bootstrap.HTML;
import static org.nasdanika.sdk.runtime.models.html.bootstrap.tests.Bootstrap.NAVIGATION;
import static org.nasdanika.sdk.runtime.models.html.bootstrap.tests.Bootstrap.OVERLAYS;
import static org.nasdanika.sdk.runtime.models.html.bootstrap.tests.Bootstrap.element;
import static org.nasdanika.sdk.runtime.models.html.bootstrap.tests.Bootstrap.size;
import static org.nasdanika.sdk.runtime.models.html.bootstrap.tests.Bootstrap.text;
import static org.nasdanika.sdk.runtime.models.html.bootstrap.tests.Bootstrap.with;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.nasdanika.sdk.runtime.models.html.Meta;
import org.nasdanika.sdk.runtime.models.html.Node;
import org.nasdanika.sdk.runtime.models.html.TableCell;
import org.nasdanika.sdk.runtime.models.html.TableHead;
import org.nasdanika.sdk.runtime.models.html.TableRow;
import org.nasdanika.sdk.runtime.models.html.bootstrap.BootstrapDocument;
import org.nasdanika.sdk.runtime.models.html.bootstrap.Breakpoint;
import org.nasdanika.sdk.runtime.models.html.bootstrap.ButtonVariant;
import org.nasdanika.sdk.runtime.models.html.bootstrap.ColorMode;
import org.nasdanika.sdk.runtime.models.html.bootstrap.Container;
import org.nasdanika.sdk.runtime.models.html.bootstrap.Row;
import org.nasdanika.sdk.runtime.models.html.bootstrap.Size;
import org.nasdanika.sdk.runtime.models.html.bootstrap.Theme;
import org.nasdanika.sdk.runtime.models.html.bootstrap.Variant;
import org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.ButtonType;
import org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.PlaceholderAnimation;
import org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.SpinnerAnimation;
import org.nasdanika.sdk.runtime.models.html.bootstrap.components.navigation.Drop;
import org.nasdanika.sdk.runtime.models.html.bootstrap.components.navigation.NavVariant;
import org.nasdanika.sdk.runtime.models.html.bootstrap.components.navigation.Navbar;
import org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.OffcanvasPlacement;
import org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.Placement;
import org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.ToastContainment;
import org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.ToastPosition;
import org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.Trigger;
import org.nasdanika.sdk.runtime.models.html.bootstrap.forms.CheckType;
import org.nasdanika.sdk.runtime.models.html.bootstrap.forms.FeedbackType;
import org.nasdanika.sdk.runtime.models.html.bootstrap.forms.FormGroup;
import org.nasdanika.sdk.runtime.models.html.bootstrap.generator.BootstrapStructure;

/**
 * A static demo site built from the Bootstrap model: a page per package and a gallery of the
 * same showcase in every Bootstrap and Bootswatch theme. No JavaScript is generated other than
 * the Bootstrap bundle and tooltip initialization.
 * <p>
 * Browse with <code>jwebserver -d target/html-bootstrap/site</code> and open
 * <a href="http://127.0.0.1:8000/">http://127.0.0.1:8000/</a>. Pages load Bootstrap from
 * jsDelivr, so the browser needs internet access.
 */
public class BootstrapDemoTests {

	static final Path SITE = Path.of("target", "html-bootstrap", "site").toAbsolutePath();

	private record Demo(String name, String title, String description) {}

	private static final List<Demo> DEMOS = List.of(
			new Demo("content", "Layout and content", "Grid, cards, alerts, badges, list groups, progress, tables, accordion, carousel"),
			new Demo("forms", "Forms", "Groups, floating labels, input groups, selects, checks, switches, ranges and validation styles"),
			new Demo("navigation", "Navigation", "Navs, tabs, breadcrumb, pagination and dropdowns"),
			new Demo("overlays", "Overlays", "Modal, offcanvas, toasts, tooltips and popovers"),
			new Demo("themes", "Themes", "The same showcase in Bootstrap and every Bootswatch theme"),
			new Demo("tree/index", "Navigation tree", "The files of this module with a tree in a side panel, without JavaScript"));

	// --- Pages -------------------------------------------------------------------

	/**
	 * A themed page with the demo navbar and a container with a heading and a lead paragraph.
	 *
	 * @param base Relative path to the site root, e.g. "../" for theme pages
	 */
	private static BootstrapDocument page(String title, String lead, Theme theme, String base, Node... content) {
		BootstrapDocument document = with(CORE.createBootstrapDocument(), d -> {
			d.setLang("en");
			d.setTheme(theme);
		});
		document.setHead(with(HTML.createHead(), head -> {
			head.setTitle(title);
			Meta viewport = HTML.createMeta();
			viewport.setName("viewport");
			viewport.setContent("width=device-width, initial-scale=1");
			head.getMetas().add(viewport);
		}));
		Container container = with(CORE.createContainer(), c -> c.getClasses().add("py-4"));
		container.getContents().add(element(HTML.createHeading(), title, "mb-1"));
		container.getContents().add(element(HTML.createParagraph(), lead, "lead", "text-body-secondary"));
		container.getContents().addAll(List.of(content));
		document.setBody(with(HTML.createBody(), body -> {
			body.getContents().add(navbar(base, theme));
			body.getContents().add(container);
		}));
		return document;
	}

	/**
	 * Brand, links to the demos, and a dropdown of themes.
	 */
	static Navbar navbar(String base, Theme current) {
		return with(NAVIGATION.createNavbar(), n -> {
			n.setBg(Variant.PRIMARY);
			n.setTheme(ColorMode.DARK);
			n.setExpand(Breakpoint.LG);
			n.getAttributes().put("aria-label", "Demos");
			n.getContents().add(with(CORE.createContainer(), c -> {
				c.getContents().add(with(NAVIGATION.createNavbarBrand(), b -> { b.setHref(base + "index.html"); b.setContent("Bootstrap model"); }));
				c.getContents().add(with(NAVIGATION.createNavbarToggle(), t -> t.setControls("demo-nav")));
				c.getContents().add(with(NAVIGATION.createNavbarCollapse(), collapse -> {
					collapse.setId("demo-nav");
					collapse.getContent().add(with(NAVIGATION.createNav(), nav -> {
						nav.getClasses().add("me-auto");
						for (Demo demo: DEMOS.subList(0, 4)) {
							nav.getEntries().add(with(NAVIGATION.createNavLink(), l -> { l.setHref(base + demo.name() + ".html"); l.setContent(demo.title()); }));
						}
						nav.getEntries().add(with(NAVIGATION.createNavDropdown(), d -> {
							d.setTitle("Themes");
							d.setMenuEnd(true);
							d.getEntries().add(with(NAVIGATION.createDropdownItem(), i -> { i.setHref(base + "themes.html"); i.setContent("All themes"); }));
							d.getEntries().add(NAVIGATION.createDropdownDivider());
							for (Theme theme: Theme.VALUES) {
								d.getEntries().add(with(NAVIGATION.createDropdownItem(), i -> {
									i.setHref(base + "themes/" + theme.getLiteral() + ".html");
									i.setContent(title(theme));
									i.setActive(theme == current && current != Theme.BOOTSTRAP);
								}));
							}
						}));
					}));
				}));
			}));
		});
	}

	private static String title(Theme theme) {
		return Character.toUpperCase(theme.getLiteral().charAt(0)) + theme.getLiteral().substring(1);
	}

	private static String write(String path, BootstrapDocument document) throws IOException {
		String html = BootstrapStructure.generate(document) + "\n";
		Path file = SITE.resolve(path);
		Files.createDirectories(file.getParent());
		Files.writeString(file, html);
		return html;
	}

	private static Node heading(String text) {
		return element(with(HTML.createHeading(), h -> h.setLevel(2)), text, "h4", "mt-4");
	}

	private static org.nasdanika.sdk.runtime.models.html.bootstrap.Col col(int md, Node... content) {
		return with(CORE.createCol(), c -> {
			c.getSizes().add(size(Breakpoint.MD, md));
			c.getContents().addAll(List.of(content));
		});
	}

	private static Row row(String classes, org.nasdanika.sdk.runtime.models.html.bootstrap.Col... columns) {
		return with(CORE.createRow(), r -> {
			r.getClasses().addAll(List.of(classes.split(" ")));
			r.getColumns().addAll(List.of(columns));
		});
	}

	// --- Index -------------------------------------------------------------------

	@Test
	public void testIndex() throws IOException {
		Row row = with(CORE.createRow(), r -> {
			r.setGutter(4);
			r.getColumnsPerRow().add(with(CORE.createRowColumns(), c -> { c.setBreakpoint(Breakpoint.XS); c.setCount(1); }));
			r.getColumnsPerRow().add(with(CORE.createRowColumns(), c -> { c.setBreakpoint(Breakpoint.MD); c.setCount(2); }));
		});
		for (Demo demo: DEMOS) {
			row.getColumns().add(with(CORE.createCol(), col -> col.getContents().add(with(CONTENT.createCard(), card -> {
				card.getClasses().add("h-100");
				card.getBodies().add(with(CONTENT.createCardBody(), body -> {
					body.setTitle(with(CONTENT.createCardTitle(), t -> t.setContent(demo.title())));
					body.getTexts().add(with(CONTENT.createCardText(), t -> t.setContent(demo.description())));
					body.getLinks().add(with(CONTENT.createCardLink(), l -> { l.setHref(demo.name() + ".html"); l.setContent("Open"); }));
				}));
			}))));
		}
		String html = write("index.html", page("Bootstrap model demos", "Static pages generated from the Nasdanika Bootstrap model", Theme.BOOTSTRAP, "", row));
		assertTrue(html.contains("bootstrap@5.3.8/dist/css/bootstrap.min.css"), html);
	}

	// --- Content -----------------------------------------------------------------

	static Node[] contentShowcase() {
		var alert = with(CONTENT.createAlert(), a -> {
			a.setVariant(Variant.INFO);
			a.setDismissible(true);
			a.setHeading(with(CONTENT.createAlertHeading(), h -> h.setContent("Generated from a model")));
			a.setContent("Every element on this page is an object of the Bootstrap model, generated to static HTML.");
		});

		Row cards = with(CORE.createRow(), r -> {
			r.setGutter(3);
			r.getColumnsPerRow().add(with(CORE.createRowColumns(), c -> { c.setBreakpoint(Breakpoint.XS); c.setCount(1); }));
			r.getColumnsPerRow().add(with(CORE.createRowColumns(), c -> { c.setBreakpoint(Breakpoint.MD); c.setCount(3); }));
		});
		Object[][] models = {
				{ "HTML", "A technology model of HTML with a text generator.", Variant.PRIMARY },
				{ "Bootstrap", "Static Bootstrap pages - no build step, no React.", Variant.SUCCESS },
				{ "React Bootstrap", "Interactive components where static is not enough.", Variant.DARK } };
		for (Object[] model: models) {
			cards.getColumns().add(with(CORE.createCol(), col -> col.getContents().add(with(CONTENT.createCard(), c -> {
				c.getClasses().add("h-100");
				c.setBorder((Variant) model[2]);
				c.setHeader(with(CONTENT.createCardHeader(), h -> h.setContent("Model")));
				c.getBodies().add(with(CONTENT.createCardBody(), b -> {
					b.setTitle(with(CONTENT.createCardTitle(), t -> t.setContent((String) model[0])));
					b.getTexts().add(with(CONTENT.createCardText(), t -> t.setContent((String) model[1])));
				}));
				c.setFooter(with(CONTENT.createCardFooter(), f -> f.getContents().add(with(CONTENT.createBadge(), badge -> {
					badge.setBg((Variant) model[2]);
					badge.setPill(true);
					badge.setContent((String) model[0]);
				}))));
			}))));
		}

		var buttons = with(CORE.createStack(), s -> {
			s.setHorizontal(true);
			s.setGap(2);
			s.getClasses().add("flex-wrap");
			for (ButtonVariant variant: List.of(ButtonVariant.PRIMARY, ButtonVariant.SECONDARY, ButtonVariant.SUCCESS, ButtonVariant.DANGER, ButtonVariant.OUTLINE_PRIMARY, ButtonVariant.LINK)) {
				s.getContents().add(with(CONTENT.createButton(), b -> { b.setVariant(variant); b.setContent(variant.getLiteral()); }));
			}
			s.getContents().add(with(CONTENT.createButtonGroup(), g -> {
				g.setSize(Size.SM);
				for (String label: new String[] { "Left", "Middle", "Right" }) {
					g.getButtons().add(with(CONTENT.createButton(), b -> { b.setVariant(ButtonVariant.OUTLINE_SECONDARY); b.setContent(label); }));
				}
			}));
		});

		var listGroup = with(CONTENT.createListGroup(), l -> {
			l.getItems().add(with(CONTENT.createListGroupItem(), i -> { i.setActive(true); i.setContent("Active item"); }));
			l.getItems().add(with(CONTENT.createListGroupItem(), i -> i.setContent("Plain item")));
			l.getItems().add(with(CONTENT.createListGroupItem(), i -> { i.setVariant(Variant.SUCCESS); i.setContent("Success variant"); }));
			l.getItems().add(with(CONTENT.createListGroupItem(), i -> { i.setDisabled(true); i.setContent("Disabled item"); }));
		});

		var progress = with(CORE.createStack(), s -> {
			s.setGap(3);
			s.getContents().add(with(CONTENT.createProgressBar(), p -> { p.setNow(40); p.setLabel("40%"); }));
			s.getContents().add(with(CONTENT.createProgressBar(), p -> {
				p.getBars().add(with(CONTENT.createProgressBar(), b -> { b.setVariant(Variant.SUCCESS); b.setNow(35); b.setLabel("Done"); b.setVisuallyHidden(true); }));
				p.getBars().add(with(CONTENT.createProgressBar(), b -> { b.setVariant(Variant.WARNING); b.setNow(20); b.setStriped(true); b.setLabel("Review"); b.setVisuallyHidden(true); }));
				p.getBars().add(with(CONTENT.createProgressBar(), b -> { b.setVariant(Variant.DANGER); b.setNow(10); b.setStriped(true); b.setAnimated(true); b.setLabel("Blocked"); b.setVisuallyHidden(true); }));
			}));
			s.getContents().add(with(CORE.createStack(), spinners -> {
				spinners.setHorizontal(true);
				spinners.setGap(2);
				spinners.getContents().add(with(CONTENT.createSpinner(), sp -> { sp.setVariant(Variant.PRIMARY); sp.setContent("Loading..."); }));
				spinners.getContents().add(with(CONTENT.createSpinner(), sp -> { sp.setAnimation(SpinnerAnimation.GROW); sp.setSize(Size.SM); sp.setContent("Loading..."); }));
			}));
			s.getContents().add(with(CONTENT.createPlaceholderGroup(), g -> {
				g.setAnimation(PlaceholderAnimation.GLOW);
				g.getPlaceholders().add(with(CONTENT.createPlaceholder(), p -> p.getSizes().add(size(Breakpoint.XS, 7))));
				g.getPlaceholders().add(with(CONTENT.createPlaceholder(), p -> { p.getSizes().add(size(Breakpoint.XS, 4)); p.getClasses().add("ms-1"); }));
			}));
		});

		TableHead tableHead = HTML.createTableHead();
		TableRow headerRow = HTML.createTableRow();
		for (String header: new String[] { "Model", "Status" }) {
			TableCell cell = HTML.createTableCell();
			cell.setHeader(true);
			cell.setScope("col");
			cell.getContents().add(text(header));
			headerRow.getCells().add(cell);
		}
		tableHead.getRows().add(headerRow);
		var tableBody = HTML.createTableBody();
		Object[][] releases = { { "HTML", "Done", Variant.SUCCESS }, { "Bootstrap", "Done", Variant.SUCCESS }, { "React Flow", "Next", Variant.SECONDARY } };
		for (Object[] release: releases) {
			TableRow row = HTML.createTableRow();
			TableCell name = HTML.createTableCell();
			name.getContents().add(text((String) release[0]));
			TableCell status = HTML.createTableCell();
			status.getContents().add(with(CONTENT.createBadge(), b -> { b.setBg((Variant) release[2]); b.setContent((String) release[1]); }));
			row.getCells().add(name);
			row.getCells().add(status);
			tableBody.getRows().add(row);
		}
		var table = with(CONTENT.createTable(), t -> {
			t.setStriped(true);
			t.setHover(true);
			t.setResponsive(true);
			t.setHead(tableHead);
			t.getBodies().add(tableBody);
		});

		var accordion = with(CONTENT.createAccordion(), a -> {
			a.setId("faq");
			String[][] items = {
					{ "Why a model?", "Typed construction catches structural errors, and output is consistent." },
					{ "How is it rendered?", "Reflectively from annotations, and composite components are expanded by the Bootstrap structure." } };
			for (String[] item: items) {
				a.getItems().add(with(CONTENT.createAccordionItem(), ai -> {
					ai.setHeader(with(CONTENT.createAccordionHeader(), h -> h.setContent(item[0])));
					ai.setBody(with(CONTENT.createAccordionBody(), b -> b.setContent(item[1])));
				}));
			}
		});

		var carousel = with(CONTENT.createCarousel(), c -> {
			c.setId("slides");
			c.setInterval(4000);
			String[][] slides = { { "First slide", "#0d6efd" }, { "Second slide", "#198754" }, { "Third slide", "#6f42c1" } };
			for (String[] slide: slides) {
				c.getItems().add(with(CONTENT.createCarouselItem(), item -> {
					item.setContent(with(HTML.createDiv(), d -> {
						d.getStyle().put("height", "220px");
						d.getStyle().put("background", slide[1]);
					}));
					item.setCaption(with(CONTENT.createCarouselCaption(), caption -> {
						caption.getContent().add(element(with(HTML.createHeading(), h -> h.setLevel(3)), slide[0]));
						caption.getContent().add(element(HTML.createParagraph(), "A carousel item with an HTML background"));
					}));
				}));
			}
		});

		return new Node[] {
				alert,
				cards,
				heading("Buttons"),
				buttons,
				row("mt-1 g-4", col(6, heading("List group"), listGroup), col(6, heading("Progress, spinners, placeholders"), progress)),
				heading("Table"),
				table,
				row("g-4", col(6, heading("Accordion"), accordion), col(6, heading("Carousel"), carousel)) };
	}

	@Test
	public void testContent() throws IOException {
		String html = write("content.html", page("Layout and content", DEMOS.get(0).description(), Theme.BOOTSTRAP, "", contentShowcase()));
		assertTrue(html.contains("class=\"accordion\""), html);
	}

	// --- Forms -------------------------------------------------------------------

	private static FormGroup group(String controlId, String label, Node control, String feedback) {
		return with(FORMS.createFormGroup(), g -> {
			g.setControlId(controlId);
			g.getClasses().add("mb-3");
			g.setLabel(with(FORMS.createFormLabel(), l -> l.setContent(label)));
			g.getControls().add(control);
			if (feedback != null) {
				g.getFeedback().add(with(FORMS.createFormFeedback(), f -> { f.setType(FeedbackType.INVALID); f.setContent(feedback); }));
			}
		});
	}

	static Node[] formsShowcase() {
		var form = with(FORMS.createForm(), f -> {
			f.setNovalidate(true);
			f.setValidated(true);
			f.getContents().add(row("g-3",
					col(6, group("firstName", "First name", with(FORMS.createFormControl(), c -> { c.setRequired(true); c.setValue("Ada"); }), "First name is required")),
					col(6, group("lastName", "Last name", with(FORMS.createFormControl(), c -> c.setRequired(true)), "Last name is required"))));
			f.getContents().add(with(FORMS.createFloatingLabel(), fl -> {
				fl.setControlId("email");
				fl.setLabel("Email address");
				fl.getClasses().add("mb-3");
				fl.setControl(with(FORMS.createFormControl(), c -> { c.setType("email"); c.setPlaceholder("name@example.com"); }));
			}));
			f.getContents().add(with(FORMS.createFormGroup(), g -> {
				g.setControlId("username");
				g.getClasses().add("mb-3");
				g.setLabel(with(FORMS.createFormLabel(), l -> l.setContent("Username")));
				g.getControls().add(with(FORMS.createInputGroup(), ig -> {
					ig.setHasValidation(true);
					ig.getItems().add(with(FORMS.createInputGroupText(), t -> t.setContent("@")));
					ig.getItems().add(with(FORMS.createFormControl(), c -> { c.setRequired(true); c.setPlaceholder("Username"); }));
					ig.getItems().add(with(FORMS.createFormFeedback(), fb -> fb.setContent("Choose a username")));
				}));
				g.setText(with(FORMS.createFormText(), t -> t.setContent("Letters, digits and underscores.")));
			}));
			f.getContents().add(with(FORMS.createFormGroup(), g -> {
				g.setControlId("plan");
				g.getClasses().addAll(List.of("row", "mb-3"));
				g.setLabel(with(FORMS.createFormLabel(), l -> { l.getSizes().add(size(Breakpoint.SM, 2)); l.setContent("Plan"); }));
				g.getControls().add(with(CORE.createCol(), c -> {
					c.getSizes().add(size(Breakpoint.SM, 10));
					c.getContents().add(with(FORMS.createFormSelect(), s -> {
						s.setName("plan");
						for (String[] option: new String[][] { { "free", "Free" }, { "team", "Team" }, { "enterprise", "Enterprise" } }) {
							s.getOptions().add(with(HTML.createOption(), o -> { o.setValue(option[0]); o.setText(option[1]); o.setSelected("team".equals(option[0])); }));
						}
					}));
				}));
			}));
			f.getContents().add(with(FORMS.createFormGroup(), g -> {
				g.getClasses().add("mb-3");
				g.setLabel(with(FORMS.createFormLabel(), l -> l.setContent("Contact me by")));
				for (String channel: new String[] { "Email", "Phone" }) {
					g.getControls().add(with(FORMS.createFormCheck(), c -> {
						c.setType(CheckType.RADIO);
						c.setInline(true);
						c.setName("contact");
						c.setInputId("contact-" + channel.toLowerCase());
						c.setValue(channel.toLowerCase());
						c.setLabel(channel);
						c.setChecked("Email".equals(channel));
					}));
				}
				g.getControls().add(with(FORMS.createFormCheck(), c -> {
					c.setType(CheckType.SWITCH);
					c.setInputId("newsletter");
					c.setLabel("Subscribe to the newsletter");
				}));
			}));
			f.getContents().add(group("experience", "Experience with models", with(FORMS.createFormRange(), r -> { r.setMin(0); r.setMax(10); r.setValue("5"); }), null));
			f.getContents().add(group("notes", "Notes", with(FORMS.createFormTextArea(), t -> { t.setRows(3); t.setContent("Static HTML forms post to a server."); }), null));
			f.getContents().add(with(FORMS.createFormCheck(), c -> {
				c.setInputId("terms");
				c.setRequired(true);
				c.setLabel("Agree to terms and conditions");
				c.setFeedback("You must agree before submitting.");
				c.getClasses().add("mb-3");
			}));
			f.getContents().add(with(CONTENT.createButton(), b -> { b.setButtonType(ButtonType.SUBMIT); b.setContent("Submit"); }));
		});
		return new Node[] { form };
	}

	@Test
	public void testForms() throws IOException {
		String html = write("forms.html", page("Forms", DEMOS.get(1).description() + ". The form is shown validated.", Theme.BOOTSTRAP, "", formsShowcase()));
		assertTrue(html.contains("form-floating"), html);
	}

	// --- Navigation --------------------------------------------------------------

	static Node[] navigationShowcase() {
		var breadcrumb = with(NAVIGATION.createBreadcrumb(), b -> {
			b.getItems().add(with(NAVIGATION.createBreadcrumbItem(), i -> { i.setHref("index.html"); i.setContent("Demos"); }));
			b.getItems().add(with(NAVIGATION.createBreadcrumbItem(), i -> { i.setActive(true); i.setContent("Navigation"); }));
		});

		var tabs = with(NAVIGATION.createTabs(), t -> {
			t.setId("model-tabs");
			t.getClasses().add("mb-3");
			String[][] items = {
					{ "html", "HTML", "Documents, elements and text, generated to HTML." },
					{ "bootstrap", "Bootstrap", "Static Bootstrap, expanded to plain HTML." },
					{ "react", "React Bootstrap", "Interactive components, generated to JSX or createElement calls." } };
			for (String[] item: items) {
				t.getTabs().add(with(NAVIGATION.createTab(), tab -> {
					tab.setEventKey(item[0]);
					tab.setTitle(item[1]);
					tab.getClasses().add("p-3");
					tab.setContent(item[2]);
				}));
			}
			t.getTabs().add(with(NAVIGATION.createTab(), tab -> { tab.setEventKey("flow"); tab.setTitle("React Flow"); tab.setDisabled(true); }));
		});

		var pills = with(NAVIGATION.createNav(), nav -> {
			nav.setVariant(NavVariant.PILLS);
			nav.setFill(true);
			for (String section: new String[] { "Overview", "Details", "History" }) {
				nav.getEntries().add(with(NAVIGATION.createNavItem(), item -> item.setLink(with(NAVIGATION.createNavLink(), l -> {
					l.setHref("#" + section.toLowerCase());
					l.setActive("Overview".equals(section));
					l.setContent(section);
				}))));
			}
		});

		var pagination = with(NAVIGATION.createPagination(), p -> {
			p.getEntries().add(with(NAVIGATION.createPaginationPrev(), prev -> prev.setDisabled(true)));
			for (int i = 1; i <= 3; ++i) {
				int number = i;
				p.getEntries().add(with(NAVIGATION.createPaginationItem(), item -> {
					item.setHref("#page-" + number);
					item.setActive(number == 1);
					item.setContent(String.valueOf(number));
				}));
			}
			p.getEntries().add(NAVIGATION.createPaginationEllipsis());
			p.getEntries().add(with(NAVIGATION.createPaginationItem(), item -> { item.setHref("#page-10"); item.setContent("10"); }));
			p.getEntries().add(with(NAVIGATION.createPaginationNext(), next -> next.setHref("#page-2")));
		});

		var dropdowns = with(CORE.createStack(), s -> {
			s.setHorizontal(true);
			s.setGap(2);
			s.getClasses().add("flex-wrap");
			s.getContents().add(with(NAVIGATION.createDropdown(), d -> {
				d.setToggle(with(NAVIGATION.createDropdownToggle(), t -> { t.setVariant(ButtonVariant.SUCCESS); t.setContent("Dropdown"); }));
				d.setMenu(with(NAVIGATION.createDropdownMenu(), m -> {
					m.getEntries().add(with(NAVIGATION.createDropdownHeader(), h -> h.setContent("Actions")));
					m.getEntries().add(with(NAVIGATION.createDropdownItem(), i -> { i.setHref("#action"); i.setContent("Action"); }));
					m.getEntries().add(with(NAVIGATION.createDropdownItem(), i -> { i.setHref("#another"); i.setContent("Another action"); }));
					m.getEntries().add(NAVIGATION.createDropdownDivider());
					m.getEntries().add(with(NAVIGATION.createDropdownItemText(), i -> i.setContent("Item text")));
				}));
			}));
			s.getContents().add(with(NAVIGATION.createDropdownButton(), d -> {
				d.setTitle("Drop up");
				d.setDrop(Drop.UP);
				d.setVariant(ButtonVariant.OUTLINE_SECONDARY);
				d.getEntries().add(with(NAVIGATION.createDropdownItem(), i -> { i.setHref("#one"); i.setContent("One"); }));
				d.getEntries().add(with(NAVIGATION.createDropdownItem(), i -> { i.setHref("#two"); i.setContent("Two"); }));
			}));
			s.getContents().add(with(NAVIGATION.createSplitButton(), d -> {
				d.setTitle("Split button");
				d.setVariant(ButtonVariant.INFO);
				d.getEntries().add(with(NAVIGATION.createDropdownItem(), i -> { i.setHref("#split"); i.setContent("Split action"); }));
			}));
		});

		return new Node[] {
				breadcrumb,
				heading("Tabs"),
				tabs,
				heading("Pills"),
				pills,
				heading("Pagination"),
				pagination,
				heading("Dropdowns"),
				dropdowns };
	}

	@Test
	public void testNavigation() throws IOException {
		String html = write("navigation.html", page("Navigation", DEMOS.get(2).description(), Theme.BOOTSTRAP, "", navigationShowcase()));
		assertTrue(html.contains("data-bs-toggle=\"tab\""), html);
	}

	// --- Overlays ----------------------------------------------------------------

	static Node[] overlaysShowcase() {
		var modal = with(OVERLAYS.createModal(), m -> {
			m.setId("demo-modal");
			m.setCentered(true);
			m.setHeader(with(OVERLAYS.createModalHeader(), h -> {
				h.setCloseButton(true);
				h.setTitle(with(OVERLAYS.createModalTitle(), t -> t.setContent("A modal")));
			}));
			m.setBody(with(OVERLAYS.createModalBody(), b -> b.setContent("Opened by a toggle, closed by the close button - no code but the Bootstrap bundle.")));
			m.setFooter(with(OVERLAYS.createModalFooter(), f -> f.getContent().add(with(CONTENT.createButton(), b -> {
				b.setVariant(ButtonVariant.SECONDARY);
				b.setContent("Close");
				b.getAttributes().put("data-bs-dismiss", "modal");
			}))));
		});

		var offcanvas = with(OVERLAYS.createOffcanvas(), o -> {
			o.setId("demo-offcanvas");
			o.setPlacement(OffcanvasPlacement.END);
			o.setHeader(with(OVERLAYS.createOffcanvasHeader(), h -> {
				h.setCloseButton(true);
				h.setTitle(with(OVERLAYS.createOffcanvasTitle(), t -> t.setContent("Models")));
			}));
			o.setBody(with(OVERLAYS.createOffcanvasBody(), b -> b.getContents().add(with(CONTENT.createListGroup(), l -> {
				l.setFlush(true);
				for (String model: new String[] { "HTML", "Bootstrap", "React", "React Bootstrap" }) {
					l.getItems().add(with(CONTENT.createListGroupItem(), i -> i.setContent(model)));
				}
			}))));
		});

		var buttons = with(CORE.createStack(), s -> {
			s.setHorizontal(true);
			s.setGap(2);
			s.getClasses().add("flex-wrap");
			s.getContents().add(with(OVERLAYS.createToggle(), t -> { t.setTarget(modal); t.setContent("Modal"); }));
			s.getContents().add(with(OVERLAYS.createToggle(), t -> { t.setTarget(offcanvas); t.setVariant(ButtonVariant.SECONDARY); t.setContent("Offcanvas"); }));
			s.getContents().add(with(OVERLAYS.createOverlayTrigger(), t -> {
				t.setPlacement(Placement.TOP);
				t.setOverlay(with(OVERLAYS.createTooltip(), tip -> tip.setTitle("A tooltip from the model")));
				t.setTarget(with(CONTENT.createButton(), b -> { b.setVariant(ButtonVariant.OUTLINE_DARK); b.setContent("Hover for a tooltip"); }));
			}));
			s.getContents().add(with(OVERLAYS.createOverlayTrigger(), t -> {
				t.setPlacement(Placement.BOTTOM);
				t.getTrigger().add(Trigger.CLICK);
				t.setOverlay(with(OVERLAYS.createPopover(), p -> { p.setTitle("Popover"); p.setContent("Click again to close."); }));
				t.setTarget(with(CONTENT.createButton(), b -> { b.setVariant(ButtonVariant.OUTLINE_INFO); b.setContent("Click for a popover"); }));
			}));
		});

		var toasts = with(OVERLAYS.createToastContainer(), c -> {
			c.setContainment(ToastContainment.RELATIVE);
			c.setPosition(ToastPosition.TOP_START);
			c.getClasses().add("mt-3");
			for (Variant variant: List.of(Variant.LIGHT, Variant.SUCCESS)) {
				c.getToasts().add(with(OVERLAYS.createToast(), t -> {
					t.setShow(true);
					t.setBg(variant);
					t.setHeader(with(OVERLAYS.createToastHeader(), h -> {
						h.getContent().add(element(HTML.createStrong(), "Nasdanika", "me-auto"));
						h.getContent().add(element(with(HTML.createGenericElement(), small -> small.setName("small")), "just now"));
					}));
					t.setBody(with(OVERLAYS.createToastBody(), b -> b.setContent("A " + variant.getLiteral() + " toast, shown statically.")));
				}));
			}
		});

		return new Node[] { buttons, modal, offcanvas, heading("Toasts"), toasts };
	}

	@Test
	public void testOverlays() throws IOException {
		String html = write("overlays.html", page("Overlays", DEMOS.get(3).description(), Theme.BOOTSTRAP, "", overlaysShowcase()));
		assertTrue(html.contains("new bootstrap.Tooltip"), html);
	}

	// --- Themes ------------------------------------------------------------------

	/**
	 * The same showcase in every theme, and a gallery linking them.
	 */
	@Test
	public void testThemes() throws IOException {
		Row gallery = with(CORE.createRow(), r -> {
			r.setGutter(3);
			r.getColumnsPerRow().add(with(CORE.createRowColumns(), c -> { c.setBreakpoint(Breakpoint.XS); c.setCount(2); }));
			r.getColumnsPerRow().add(with(CORE.createRowColumns(), c -> { c.setBreakpoint(Breakpoint.MD); c.setCount(4); }));
		});
		for (Theme theme: Theme.VALUES) {
			List<Node> showcase = new java.util.ArrayList<>();
			showcase.addAll(List.of(contentShowcase()).subList(0, 4));
			showcase.add(heading("Form"));
			showcase.addAll(List.of(formsShowcase()));
			String html = write("themes/" + theme.getLiteral() + ".html", page(
					title(theme) + " theme",
					theme == Theme.BOOTSTRAP ? "Bootstrap " + "5.3.8" : "Bootswatch " + title(theme) + " theme",
					theme,
					"../",
					showcase.toArray(Node[]::new)));
			assertTrue(html.contains(theme == Theme.BOOTSTRAP ? "bootstrap@" : "/dist/" + theme.getLiteral() + "/"), html);

			gallery.getColumns().add(with(CORE.createCol(), col -> col.getContents().add(with(CONTENT.createCard(), card -> {
				card.getClasses().add("h-100");
				card.getBodies().add(with(CONTENT.createCardBody(), body -> {
					body.setTitle(with(CONTENT.createCardTitle(), t -> t.setContent(title(theme))));
					body.getLinks().add(with(CONTENT.createCardLink(), l -> { l.setHref("themes/" + theme.getLiteral() + ".html"); l.setContent("Open"); }));
				}));
			}))));
		}
		write("themes.html", page("Themes", DEMOS.get(4).description(), Theme.BOOTSTRAP, "", gallery));
	}

}
