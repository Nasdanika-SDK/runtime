package org.nasdanika.sdk.runtime.models.html.bootstrap.tests;

import static org.nasdanika.sdk.runtime.models.html.bootstrap.tests.Bootstrap.CONTENT;
import static org.nasdanika.sdk.runtime.models.html.bootstrap.tests.Bootstrap.CORE;
import static org.nasdanika.sdk.runtime.models.html.bootstrap.tests.Bootstrap.FORMS;
import static org.nasdanika.sdk.runtime.models.html.bootstrap.tests.Bootstrap.HTML;
import static org.nasdanika.sdk.runtime.models.html.bootstrap.tests.Bootstrap.NAVIGATION;
import static org.nasdanika.sdk.runtime.models.html.bootstrap.tests.Bootstrap.OVERLAYS;
import static org.nasdanika.sdk.runtime.models.html.bootstrap.tests.Bootstrap.element;
import static org.nasdanika.sdk.runtime.models.html.bootstrap.tests.Bootstrap.size;
import static org.nasdanika.sdk.runtime.models.html.bootstrap.tests.Bootstrap.with;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.nasdanika.sdk.runtime.models.html.Node;
import org.nasdanika.sdk.runtime.models.html.bootstrap.Breakpoint;
import org.nasdanika.sdk.runtime.models.html.bootstrap.ColorMode;
import org.nasdanika.sdk.runtime.models.html.bootstrap.Theme;
import org.nasdanika.sdk.runtime.models.html.bootstrap.Variant;
import org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.CardImageVariant;
import org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.Placement;
import org.nasdanika.sdk.runtime.models.html.bootstrap.forms.CheckType;
import org.nasdanika.sdk.runtime.models.html.bootstrap.forms.FeedbackType;
import org.nasdanika.sdk.runtime.models.html.bootstrap.generator.BootstrapStructure;

/**
 * Rendering of the Bootstrap model, one package at a time.
 */
public class BootstrapGeneratorTests {

	private static String generate(Node node) {
		return BootstrapStructure.generate(node).replace("\r\n", "\n");
	}

	@Test
	public void testGrid() {
		var container = with(CORE.createContainer(), c -> c.setFluidUntil(Breakpoint.MD));
		container.getRows().add(with(CORE.createRow(), r -> {
			r.getColumnsPerRow().add(with(CORE.createRowColumns(), rc -> { rc.setBreakpoint(Breakpoint.XS); rc.setCount(1); }));
			r.getColumnsPerRow().add(with(CORE.createRowColumns(), rc -> { rc.setBreakpoint(Breakpoint.MD); rc.setCount(3); }));
			r.setGutter(3);
			r.getColumns().add(with(CORE.createCol(), c -> {
				c.getSizes().add(size(Breakpoint.XS, 12));
				c.getSizes().add(size(Breakpoint.MD, 4, 2));
				c.getContents().add(Bootstrap.text("First"));
			}));
			r.getColumns().add(with(CORE.createCol(), c -> {
				c.getSizes().add(with(CORE.createColumnSize(), s -> { s.setBreakpoint(Breakpoint.MD); s.setAuto(true); }));
				c.getContents().add(with(CORE.createStack(), s -> {
					s.setHorizontal(true);
					s.setGap(2);
					s.getContents().add(Bootstrap.text("Stacked"));
				}));
			}));
			r.getColumns().add(CORE.createCol());
		}));
		Expected.assertMatches("grid.html", generate(container));
	}

	@Test
	public void testDocument() {
		var document = with(CORE.createBootstrapDocument(), d -> {
			d.setTheme(Theme.FLATLY);
			d.setColorMode(ColorMode.DARK);
			d.setLang("en");
			d.setHead(with(HTML.createHead(), h -> h.setTitle("Themed")));
			d.setBody(with(HTML.createBody(), b -> b.getContents().add(with(OVERLAYS.createOverlayTrigger(), t -> {
				t.setPlacement(Placement.TOP);
				t.setOverlay(with(OVERLAYS.createTooltip(), tip -> tip.setTitle("Tip")));
				t.setTarget(with(CONTENT.createButton(), b2 -> b2.setContent("Hover")));
			}))));
		});
		Expected.assertMatches("document.html", generate(document));
	}

	@Test
	public void testContent() {
		var card = with(CONTENT.createCard(), c -> {
			c.setBorder(Variant.PRIMARY);
			c.setHeader(with(CONTENT.createCardHeader(), h -> h.setContent("Header")));
			c.setImage(with(CONTENT.createCardImage(), i -> { i.setVariant(CardImageVariant.TOP); i.setSrc("card.png"); i.setAlt("Card"); }));
			c.getBodies().add(with(CONTENT.createCardBody(), b -> {
				b.setTitle(with(CONTENT.createCardTitle(), t -> t.setContent("Title")));
				b.getTexts().add(with(CONTENT.createCardText(), t -> t.setContent("Text & more")));
				b.getLinks().add(with(CONTENT.createCardLink(), l -> { l.setHref("#more"); l.setContent("More"); }));
			}));
		});
		var alert = with(CONTENT.createAlert(), a -> {
			a.setVariant(Variant.WARNING);
			a.setDismissible(true);
			a.setHeading(with(CONTENT.createAlertHeading(), h -> h.setContent("Heads up")));
			a.setContent("Dismiss me");
		});
		var progress = with(CONTENT.createProgressBar(), p -> { p.setNow(60); p.setLabel("60%"); p.setVariant(Variant.SUCCESS); p.setStriped(true); });
		var spinner = with(CONTENT.createSpinner(), s -> s.setContent("Loading..."));
		var accordion = with(CONTENT.createAccordion(), a -> {
			for (String key: new String[] { "one", "two" }) {
				a.getItems().add(with(CONTENT.createAccordionItem(), i -> {
					i.setEventKey(key);
					i.setHeader(with(CONTENT.createAccordionHeader(), h -> h.setContent("Item " + key)));
					i.setBody(with(CONTENT.createAccordionBody(), b -> b.setContent("Body " + key)));
				}));
			}
		});
		var stack = with(CORE.createStack(), s -> s.getContents().addAll(List.of(card, alert, progress, spinner, accordion)));
		Expected.assertMatches("content.html", generate(stack));
	}

	@Test
	public void testForms() {
		var form = with(FORMS.createForm(), f -> {
			f.setNovalidate(true);
			f.getGroups().add(with(FORMS.createFormGroup(), g -> {
				g.setControlId("email");
				g.getClasses().add("mb-3");
				g.setLabel(with(FORMS.createFormLabel(), l -> l.setContent("Email")));
				g.getControls().add(with(FORMS.createFormControl(), c -> { c.setType("email"); c.setRequired(true); c.setPlaceholder("name@example.com"); }));
				g.getFeedback().add(with(FORMS.createFormFeedback(), fb -> { fb.setType(FeedbackType.INVALID); fb.setContent("Enter an email"); }));
			}));
			f.getGroups().add(with(FORMS.createFormGroup(), g -> {
				g.getControls().add(with(FORMS.createFormCheck(), c -> { c.setType(CheckType.SWITCH); c.setInputId("dark"); c.setLabel("Dark mode"); c.setChecked(true); }));
				g.getControls().add(with(FORMS.createFloatingLabel(), fl -> {
					fl.setControlId("city");
					fl.setLabel("City");
					fl.setControl(with(FORMS.createFormControl(), c -> c.setPlaceholder("City")));
				}));
				g.getControls().add(with(FORMS.createFormSelect(), s -> {
					s.setName("color");
					s.getOptions().add(with(HTML.createOption(), o -> { o.setValue("red"); o.setText("Red"); }));
				}));
			}));
		});
		Expected.assertMatches("forms.html", generate(form));
	}

	@Test
	public void testNavigation() {
		var navbar = with(NAVIGATION.createNavbar(), n -> {
			n.setBg(Variant.DARK);
			n.setTheme(ColorMode.DARK);
			n.setExpand(Breakpoint.LG);
			n.getContent().add(with(CORE.createContainer(), c -> {
				c.setFluid(true);
				c.getContents().add(with(NAVIGATION.createNavbarBrand(), b -> { b.setHref("#"); b.setContent("Nasdanika"); }));
				c.getContents().add(with(NAVIGATION.createNavbarToggle(), t -> t.setControls("main-nav")));
				c.getContents().add(with(NAVIGATION.createNavbarCollapse(), collapse -> {
					collapse.setId("main-nav");
					collapse.getContent().add(with(NAVIGATION.createNav(), nav -> {
						nav.getEntries().add(with(NAVIGATION.createNavLink(), l -> { l.setHref("#home"); l.setActive(true); l.setContent("Home"); }));
						nav.getEntries().add(with(NAVIGATION.createNavDropdown(), d -> {
							d.setTitle("More");
							d.getEntries().add(with(NAVIGATION.createDropdownItem(), i -> { i.setHref("#a"); i.setContent("A"); }));
							d.getEntries().add(NAVIGATION.createDropdownDivider());
						}));
					}));
				}));
			}));
		});
		var tabs = with(NAVIGATION.createTabs(), t -> {
			t.setId("models");
			t.getTabs().add(with(NAVIGATION.createTab(), tab -> { tab.setEventKey("html"); tab.setTitle("HTML"); tab.setContent("HTML pane"); }));
			t.getTabs().add(with(NAVIGATION.createTab(), tab -> { tab.setEventKey("react"); tab.setTitle("React"); tab.setContent("React pane"); }));
		});
		var pagination = with(NAVIGATION.createPagination(), p -> {
			p.getEntries().add(NAVIGATION.createPaginationPrev());
			p.getEntries().add(with(NAVIGATION.createPaginationItem(), i -> { i.setContent("1"); i.setActive(true); }));
			p.getEntries().add(NAVIGATION.createPaginationNext());
		});
		var stack = with(CORE.createStack(), s -> s.getContents().addAll(List.of(navbar, tabs, pagination)));
		Expected.assertMatches("navigation.html", generate(stack));
	}

	@Test
	public void testOverlays() {
		var modal = with(OVERLAYS.createModal(), m -> {
			m.setCentered(true);
			m.setHeader(with(OVERLAYS.createModalHeader(), h -> {
				h.setCloseButton(true);
				h.setTitle(with(OVERLAYS.createModalTitle(), t -> t.setContent("Title")));
			}));
			m.setBody(with(OVERLAYS.createModalBody(), b -> b.setContent("Body")));
		});
		var toggle = with(OVERLAYS.createToggle(), t -> { t.setTarget(modal); t.setContent("Open"); });
		var popover = with(OVERLAYS.createOverlayTrigger(), t -> {
			t.setOverlay(with(OVERLAYS.createPopover(), p -> { p.setTitle("Popover"); p.setContent("Content"); }));
			t.setTarget(element(HTML.createSpan(), "Click"));
		});
		var stack = with(CORE.createStack(), s -> s.getContents().addAll(List.of(toggle, modal, popover)));
		Expected.assertMatches("overlays.html", generate(stack));
	}

}
