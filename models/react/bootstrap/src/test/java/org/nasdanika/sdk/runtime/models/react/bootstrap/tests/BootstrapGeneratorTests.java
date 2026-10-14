package org.nasdanika.sdk.runtime.models.react.bootstrap.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;
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
import static org.nasdanika.sdk.runtime.models.react.bootstrap.tests.Bootstrap.element;
import static org.nasdanika.sdk.runtime.models.react.bootstrap.tests.Bootstrap.event;
import static org.nasdanika.sdk.runtime.models.react.bootstrap.tests.Bootstrap.external;
import static org.nasdanika.sdk.runtime.models.react.bootstrap.tests.Bootstrap.size;
import static org.nasdanika.sdk.runtime.models.react.bootstrap.tests.Bootstrap.with;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.nasdanika.sdk.runtime.models.react.ComponentDeclaration;
import org.nasdanika.sdk.runtime.models.react.JsxNode;
import org.nasdanika.sdk.runtime.models.react.bootstrap.Breakpoint;
import org.nasdanika.sdk.runtime.models.react.bootstrap.Direction;
import org.nasdanika.sdk.runtime.models.react.bootstrap.Variant;
import org.nasdanika.sdk.runtime.models.react.bootstrap.components.content.CardImageVariant;
import org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.NavbarTheme;
import org.nasdanika.sdk.runtime.models.react.bootstrap.components.overlays.Placement;
import org.nasdanika.sdk.runtime.models.react.bootstrap.components.overlays.Trigger;
import org.nasdanika.sdk.runtime.models.react.bootstrap.forms.CheckType;
import org.nasdanika.sdk.runtime.models.react.bootstrap.forms.FeedbackType;
import org.nasdanika.sdk.runtime.models.react.generator.ReactGenerator;
import org.nasdanika.sdk.runtime.models.typescript.Module;

/**
 * Rendering of the React Bootstrap model, one package at a time, in both syntaxes.
 */
public class BootstrapGeneratorTests {

	/**
	 * A module with a component rendering the node.
	 */
	private static String generate(JsxNode render, boolean tsx) {
		Module module = tsx ? REACT.createTsxModule() : Bootstrap.TS.createModule();
		module.setPath("demo");
		ComponentDeclaration component = REACT.createComponentDeclaration();
		component.setName("Demo");
		component.setRender(render);
		module.getDeclarations().add(component);
		return new ReactGenerator().generate(module).replace("\r\n", "\n");
	}

	@Test
	public void testGrid() {
		var container = with(CORE.createContainer(), c -> c.setFluidUntil(Breakpoint.MD));
		var row = with(CORE.createRow(), r -> {
			r.getColumnsPerRow().add(with(CORE.createRowColumns(), rc -> { rc.setBreakpoint(Breakpoint.XS); rc.setCount(1); }));
			r.getColumnsPerRow().add(with(CORE.createRowColumns(), rc -> { rc.setBreakpoint(Breakpoint.MD); rc.setCount(3); }));
			r.getClasses().addAll(List.of("g-3", "mb-3"));
		});
		container.getRows().add(row);
		row.getColumns().add(with(CORE.createCol(), c -> {
			c.getSizes().add(size(Breakpoint.XS, 12));
			c.getSizes().add(size(Breakpoint.MD, 4, 2));
			c.getChildren().add(Bootstrap.text("First"));
		}));
		row.getColumns().add(with(CORE.createCol(), c -> {
			c.getSizes().add(with(CORE.createColumnSize(), s -> { s.setBreakpoint(Breakpoint.MD); s.setAuto(true); }));
			c.getStyle().put("min-height", "4rem");
			c.getChildren().add(with(CORE.createStack(), s -> {
				s.setDirection(Direction.HORIZONTAL);
				s.setGap(2);
				s.getChildren().add(Bootstrap.text("Stacked"));
			}));
		}));

		assertEquals("""
				import { Container, Row, Col, Stack } from "react-bootstrap";

				function Demo() {
				  return (
				    <Container fluid="md">
				      <Row className="g-3 mb-3" xs={1} md={3}>
				        <Col xs={12} md={{ span: 4, offset: 2 }}>First</Col>
				        <Col style={{ minHeight: "4rem" }} md="auto">
				          <Stack direction="horizontal" gap={2}>Stacked</Stack>
				        </Col>
				      </Row>
				    </Container>
				  );
				}
				""", generate(container, true));
	}

	@Test
	public void testContent() {
		var card = with(CONTENT.createCard(), c -> {
			c.setBg(Variant.DARK);
			c.setTextColor(Variant.LIGHT);
			c.setHeader(with(CONTENT.createCardHeader(), h -> h.setContent("Header")));
			c.setImage(with(CONTENT.createCardImage(), i -> { i.setVariant(CardImageVariant.TOP); i.setSrc("card.png"); i.setAlt("Card"); }));
			c.getBodies().add(with(CONTENT.createCardBody(), b -> {
				b.setTitle(with(CONTENT.createCardTitle(), t -> t.setContent("Title")));
				b.getTexts().add(with(CONTENT.createCardText(), t -> t.setContent("Text & more")));
				b.getLinks().add(with(CONTENT.createCardLink(), l -> { l.setHref("#more"); l.setContent("More"); }));
			}));
		});
		var alert = attributes(
				with(CONTENT.createAlert(), a -> {
					a.setVariant(Variant.WARNING);
					a.setDismissible(true);
					a.setShow(false);
					a.setHeading(with(CONTENT.createAlertHeading(), h -> h.setContent("Heads up")));
					a.setContent("Hidden until shown");
				}),
				attribute("show", "visible"),
				event("onClose", "() => setVisible(false)"));
		var stack = with(CORE.createStack(), s -> s.getChildren().addAll(List.of(card, alert)));

		assertEquals("""
				import { Stack, Card, Alert } from "react-bootstrap";

				function Demo() {
				  return (
				    <Stack>
				      <Card bg="dark" text="light">
				        <Card.Header>Header</Card.Header>
				        <Card.Img variant="top" src="card.png" alt="Card" />
				        <Card.Body>
				          <Card.Title>Title</Card.Title>
				          <Card.Text>{"Text & more"}</Card.Text>
				          <Card.Link href="#more">More</Card.Link>
				        </Card.Body>
				      </Card>
				      <Alert
				        variant="warning"
				        dismissible
				        show={visible}
				        onClose={() => setVisible(false)}
				      ><Alert.Heading>Heads up</Alert.Heading>Hidden until shown</Alert>
				    </Stack>
				  );
				}
				""", generate(stack, true));

		assertEquals("""
				import { createElement } from "react";
				import { Stack, Card, Alert } from "react-bootstrap";

				function Demo() {
				  return createElement(Stack, null,
				    createElement(Card, { bg: "dark", text: "light" },
				      createElement(Card.Header, null, "Header"),
				      createElement(Card.Img, { variant: "top", src: "card.png", alt: "Card" }),
				      createElement(Card.Body, null,
				        createElement(Card.Title, null, "Title"),
				        createElement(Card.Text, null, "Text & more"),
				        createElement(Card.Link, { href: "#more" }, "More"))),
				    createElement(Alert, {
				      variant: "warning",
				      dismissible: true,
				      show: visible,
				      onClose: () => setVisible(false)
				    },
				      createElement(Alert.Heading, null, "Heads up"),
				      "Hidden until shown"));
				}
				""", generate(stack, false));
	}

	@Test
	public void testForms() {
		var group = with(FORMS.createFormGroup(), g -> {
			g.setControlId("color");
			g.setAsComponent(external("Col", REACT_BOOTSTRAP));
			g.setLabel(with(FORMS.createFormLabel(), l -> l.setContent("Color")));
			g.getControls().add(with(FORMS.createFormSelect(), s -> {
				s.setFieldName("color");
				s.setRequired(true);
				for (String color: new String[] { "Red", "Green" }) {
					s.getOptions().add(with(HTML.createOption(), o -> { o.setValue(color.toLowerCase()); o.setText(color); }));
				}
			}));
			g.getControls().add(with(FORMS.createFormCheck(), c -> {
				c.setType(CheckType.SWITCH);
				c.setElementId("dark");
				c.setLabel("Dark");
			}));
			g.getFeedback().add(with(FORMS.createFormControlFeedback(), f -> { f.setType(FeedbackType.INVALID); f.setContent("Pick a color"); }));
		});

		assertEquals("""
				import { Col, Form } from "react-bootstrap";

				function Demo() {
				  return (
				    <Form.Group as={Col} controlId="color">
				      <Form.Label>Color</Form.Label>
				      <Form.Select name="color" required>
				        <option value="red">Red</option>
				        <option value="green">Green</option>
				      </Form.Select>
				      <Form.Check id="dark" type="switch" label="Dark" />
				      <Form.Control.Feedback type="invalid">Pick a color</Form.Control.Feedback>
				    </Form.Group>
				  );
				}
				""", generate(group, true));
	}

	@Test
	public void testNavigation() {
		var navbar = with(NAVIGATION.createNavbar(), n -> {
			n.setBg(Variant.DARK);
			n.setTheme(NavbarTheme.DARK);
			n.setExpand(Breakpoint.LG);
			n.getContent().add(with(NAVIGATION.createNavbarBrand(), b -> { b.setHref("#"); b.setContent("Nasdanika"); }));
			n.getContent().add(with(NAVIGATION.createNav(), nav -> {
				nav.getEntries().add(with(NAVIGATION.createNavLink(), l -> { l.setHref("#home"); l.setContent("Home"); }));
				nav.getEntries().add(with(NAVIGATION.createNavDropdown(), d -> {
					d.setElementId("more");
					d.setTitleNode(element(HTML.createStrong(), "More"));
					d.getEntries().add(with(NAVIGATION.createDropdownItem(), i -> { i.setHref("#a"); i.setContent("A"); }));
					d.getEntries().add(NAVIGATION.createDropdownDivider());
				}));
			}));
		});

		assertEquals("""
				import { Navbar, Nav, NavDropdown, Dropdown } from "react-bootstrap";

				function Demo() {
				  return (
				    <Navbar bg="dark" data-bs-theme="dark" expand="lg">
				      <Navbar.Brand href="#">Nasdanika</Navbar.Brand>
				      <Nav>
				        <Nav.Link href="#home">Home</Nav.Link>
				        <NavDropdown id="more" title={<strong>More</strong>}>
				          <Dropdown.Item href="#a">A</Dropdown.Item>
				          <Dropdown.Divider />
				        </NavDropdown>
				      </Nav>
				    </Navbar>
				  );
				}
				""", generate(navbar, true));

		assertEquals("""
				import { createElement } from "react";
				import { Navbar, Nav, NavDropdown, Dropdown } from "react-bootstrap";

				function Demo() {
				  return createElement(Navbar, { bg: "dark", "data-bs-theme": "dark", expand: "lg" },
				    createElement(Navbar.Brand, { href: "#" }, "Nasdanika"),
				    createElement(Nav, null,
				      createElement(Nav.Link, { href: "#home" }, "Home"),
				      createElement(NavDropdown, { id: "more", title: createElement("strong", null, "More") },
				        createElement(Dropdown.Item, { href: "#a" }, "A"),
				        createElement(Dropdown.Divider, null))));
				}
				""", generate(navbar, false));
	}

	@Test
	public void testOverlays() {
		var trigger = with(OVERLAYS.createOverlayTrigger(), t -> {
			t.setPlacement(Placement.RIGHT_START);
			t.getTrigger().addAll(List.of(Trigger.HOVER, Trigger.FOCUS));
			t.setOverlay(with(OVERLAYS.createTooltip(), tip -> { tip.setElementId("tip"); tip.setContent("Tooltip"); }));
			t.setTarget(with(CONTENT.createButton(), b -> b.setContent("Hover me")));
		});
		var modal = attributes(
				with(OVERLAYS.createModal(), m -> {
					m.setCentered(true);
					m.setHeader(with(OVERLAYS.createModalHeader(), h -> {
						h.setCloseButton(true);
						h.setTitle(with(OVERLAYS.createModalTitle(), t -> t.setContent("Title")));
					}));
					m.setBody(with(OVERLAYS.createModalBody(), b -> b.setContent("Body")));
				}),
				attribute("show", "show"),
				event("onHide", "() => setShow(false)"));
		var stack = with(CORE.createStack(), s -> s.getChildren().addAll(List.of(trigger, modal)));

		assertEquals("""
				import { Stack, OverlayTrigger, Tooltip, Button, Modal } from "react-bootstrap";

				function Demo() {
				  return (
				    <Stack>
				      <OverlayTrigger
				        placement="right-start"
				        trigger={["hover", "focus"]}
				        overlay={<Tooltip id="tip">Tooltip</Tooltip>}
				      >
				        <Button>Hover me</Button>
				      </OverlayTrigger>
				      <Modal centered show={show} onHide={() => setShow(false)}>
				        <Modal.Header closeButton><Modal.Title>Title</Modal.Title></Modal.Header>
				        <Modal.Body>Body</Modal.Body>
				      </Modal>
				    </Stack>
				  );
				}
				""", generate(stack, true));
	}

}
