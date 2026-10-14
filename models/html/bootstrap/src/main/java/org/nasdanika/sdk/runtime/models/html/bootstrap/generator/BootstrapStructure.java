package org.nasdanika.sdk.runtime.models.html.bootstrap.generator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.nasdanika.sdk.runtime.models.html.Body;
import org.nasdanika.sdk.runtime.models.html.Element;
import org.nasdanika.sdk.runtime.models.html.GenericElement;
import org.nasdanika.sdk.runtime.models.html.GenericVoidElement;
import org.nasdanika.sdk.runtime.models.html.Head;
import org.nasdanika.sdk.runtime.models.html.HtmlFactory;
import org.nasdanika.sdk.runtime.models.html.Node;
import org.nasdanika.sdk.runtime.models.html.NodeReference;
import org.nasdanika.sdk.runtime.models.html.Script;
import org.nasdanika.sdk.runtime.models.html.Stylesheet;
import org.nasdanika.sdk.runtime.models.html.Text;
import org.nasdanika.sdk.runtime.models.html.bootstrap.BootstrapDocument;
import org.nasdanika.sdk.runtime.models.html.bootstrap.Breakpoint;
import org.nasdanika.sdk.runtime.models.html.bootstrap.Col;
import org.nasdanika.sdk.runtime.models.html.bootstrap.ColumnSize;
import org.nasdanika.sdk.runtime.models.html.bootstrap.Container;
import org.nasdanika.sdk.runtime.models.html.bootstrap.Row;
import org.nasdanika.sdk.runtime.models.html.bootstrap.RowColumns;
import org.nasdanika.sdk.runtime.models.html.bootstrap.Stack;
import org.nasdanika.sdk.runtime.models.html.bootstrap.Theme;
import org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.Accordion;
import org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.AccordionItem;
import org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.Alert;
import org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.Button;
import org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.ButtonGroup;
import org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.CardImage;
import org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.Carousel;
import org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.CarouselItem;
import org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.ListGroup;
import org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.ListGroupItem;
import org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.Placeholder;
import org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.PlaceholderButton;
import org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.ProgressBar;
import org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.Spinner;
import org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.Table;
import org.nasdanika.sdk.runtime.models.html.bootstrap.components.navigation.Breadcrumb;
import org.nasdanika.sdk.runtime.models.html.bootstrap.components.navigation.BreadcrumbItem;
import org.nasdanika.sdk.runtime.models.html.bootstrap.components.navigation.Dropdown;
import org.nasdanika.sdk.runtime.models.html.bootstrap.components.navigation.DropdownButton;
import org.nasdanika.sdk.runtime.models.html.bootstrap.components.navigation.DropdownEntry;
import org.nasdanika.sdk.runtime.models.html.bootstrap.components.navigation.DropdownItem;
import org.nasdanika.sdk.runtime.models.html.bootstrap.components.navigation.DropdownMenu;
import org.nasdanika.sdk.runtime.models.html.bootstrap.components.navigation.Nav;
import org.nasdanika.sdk.runtime.models.html.bootstrap.components.navigation.NavDropdown;
import org.nasdanika.sdk.runtime.models.html.bootstrap.components.navigation.NavEntry;
import org.nasdanika.sdk.runtime.models.html.bootstrap.components.navigation.NavLink;
import org.nasdanika.sdk.runtime.models.html.bootstrap.components.navigation.Navbar;
import org.nasdanika.sdk.runtime.models.html.bootstrap.components.navigation.NavbarCollapse;
import org.nasdanika.sdk.runtime.models.html.bootstrap.components.navigation.NavbarToggle;
import org.nasdanika.sdk.runtime.models.html.bootstrap.components.navigation.Pagination;
import org.nasdanika.sdk.runtime.models.html.bootstrap.components.navigation.PaginationEllipsis;
import org.nasdanika.sdk.runtime.models.html.bootstrap.components.navigation.PaginationEntry;
import org.nasdanika.sdk.runtime.models.html.bootstrap.components.navigation.PaginationFirst;
import org.nasdanika.sdk.runtime.models.html.bootstrap.components.navigation.PaginationLast;
import org.nasdanika.sdk.runtime.models.html.bootstrap.components.navigation.PaginationLink;
import org.nasdanika.sdk.runtime.models.html.bootstrap.components.navigation.PaginationNext;
import org.nasdanika.sdk.runtime.models.html.bootstrap.components.navigation.PaginationPrev;
import org.nasdanika.sdk.runtime.models.html.bootstrap.components.navigation.SplitButton;
import org.nasdanika.sdk.runtime.models.html.bootstrap.components.navigation.Tab;
import org.nasdanika.sdk.runtime.models.html.bootstrap.components.navigation.Tabs;
import org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.Modal;
import org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.ModalHeader;
import org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.ModalTitle;
import org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.Offcanvas;
import org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.OffcanvasHeader;
import org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.OffcanvasTitle;
import org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.Overlay;
import org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.OverlayTrigger;
import org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.Popover;
import org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.Toast;
import org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.ToastContainer;
import org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.ToastHeader;
import org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.Toggle;
import org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.Tooltip;
import org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.Trigger;
import org.nasdanika.sdk.runtime.models.html.bootstrap.forms.CheckType;
import org.nasdanika.sdk.runtime.models.html.bootstrap.forms.Field;
import org.nasdanika.sdk.runtime.models.html.bootstrap.forms.FloatingLabel;
import org.nasdanika.sdk.runtime.models.html.bootstrap.forms.FormCheck;
import org.nasdanika.sdk.runtime.models.html.bootstrap.forms.FormControl;
import org.nasdanika.sdk.runtime.models.html.bootstrap.forms.FormFeedback;
import org.nasdanika.sdk.runtime.models.html.bootstrap.forms.FormGroup;
import org.nasdanika.sdk.runtime.models.html.bootstrap.forms.FormLabel;
import org.nasdanika.sdk.runtime.models.html.generator.Generator;
import org.nasdanika.sdk.runtime.models.html.generator.HtmlStructure;

/**
 * How the Bootstrap model maps to HTML: what the annotations of the model classes do not
 * express - responsive classes, ids, ARIA and data attributes, and components which are more
 * than one element, which are expanded to plain HTML referring to the nodes of the model.
 * <p>
 * Use with the HTML generator: <code>new Generator(new BootstrapStructure())</code>, or with
 * the React generator: <code>new ReactGenerator(new BootstrapStructure())</code> to use
 * Bootstrap elements as intrinsics in React components.
 * <p>
 * Components which Bootstrap JavaScript connects by id - modals, offcanvases, accordions,
 * carousels, tabs, navbar collapses - get ids generated from their position in the model
 * if they do not have their own.
 */
public class BootstrapStructure extends HtmlStructure {

	private static final HtmlFactory HTML = HtmlFactory.eINSTANCE;

	/**
	 * @return URL of Bootstrap CSS or of a Bootswatch theme on jsDelivr
	 */
	public static String stylesheet(Theme theme, String bootstrapVersion, String bootswatchVersion) {
		if (theme == null || theme == Theme.BOOTSTRAP) {
			return "https://cdn.jsdelivr.net/npm/bootstrap@" + bootstrapVersion + "/dist/css/bootstrap.min.css";
		}
		return "https://cdn.jsdelivr.net/npm/bootswatch@" + bootswatchVersion + "/dist/" + theme.getLiteral() + "/bootstrap.min.css";
	}

	/**
	 * @return URL of the Bootstrap JavaScript bundle, with Popper, on jsDelivr
	 */
	public static String javaScript(String bootstrapVersion) {
		return "https://cdn.jsdelivr.net/npm/bootstrap@" + bootstrapVersion + "/dist/js/bootstrap.bundle.min.js";
	}

	/**
	 * Initializes tooltips and popovers, which Bootstrap does not do on its own.
	 */
	public static final String OVERLAY_INITIALIZATION = """
			document.querySelectorAll('[data-bs-toggle="tooltip"]').forEach(element => new bootstrap.Tooltip(element));
			document.querySelectorAll('[data-bs-toggle="popover"]').forEach(element => new bootstrap.Popover(element));
			""";

	/**
	 * Generates a Bootstrap document or element.
	 */
	public static String generate(Node node) {
		return new Generator(new BootstrapStructure()).generate(node);
	}

	// --- Ids ---------------------------------------------------------------------

	/**
	 * The element id, or:
	 * <ul>
	 * <li>for the first field of a form group or of a floating label with a controlId - the controlId,</li>
	 * <li>for elements which Bootstrap JavaScript or ARIA attributes refer to - a generated id.</li>
	 * </ul>
	 */
	@Override
	public String id(Element element) {
		String id = super.id(element);
		if (id != null) {
			return id;
		}
		if (element instanceof Field && !(element instanceof FormCheck)) {
			String controlId = controlId(element);
			if (controlId != null) {
				return controlId;
			}
		}
		if (element instanceof Modal
				|| element instanceof ModalTitle
				|| element instanceof Offcanvas
				|| element instanceof OffcanvasTitle
				|| element instanceof Accordion
				|| element instanceof Carousel
				|| element instanceof Tabs
				|| element instanceof NavbarCollapse) {
			return generatedId(element);
		}
		return null;
	}

	/**
	 * @return The id of the element, generated from its position in the model if not set
	 */
	public String idFor(Element element) {
		String id = id(element);
		return id == null ? generatedId(element) : id;
	}

	/**
	 * Class name and containment path, e.g. modal-contents-2-body-0.
	 */
	protected String generatedId(EObject element) {
		EObject root = EcoreUtil.getRootContainer(element);
		String path = root == element ? "root" : EcoreUtil.getRelativeURIFragmentPath(root, element);
		String id = (element.eClass().getName() + "-" + path).toLowerCase().replaceAll("[^a-z0-9]+", "-");
		return id.replaceAll("-+$", "");
	}

	/**
	 * @return controlId of the nearest form group or floating label if the element is its first field
	 */
	protected String controlId(Element element) {
		for (EObject container = element.eContainer(); container != null; container = container.eContainer()) {
			String controlId = switch (container) {
				case FormGroup group -> group.getControlId();
				case FloatingLabel label -> label.getControlId();
				default -> null;
			};
			if (container instanceof FormGroup || container instanceof FloatingLabel) {
				if (controlId == null) {
					return null;
				}
				for (Iterator<EObject> it = container.eAllContents(); it.hasNext();) {
					EObject next = it.next();
					if (next instanceof Field && !(next instanceof FormCheck)) {
						return next == element ? controlId : null;
					}
				}
				return null;
			}
		}
		return null;
	}

	// --- Tags --------------------------------------------------------------------

	@Override
	public String tagName(Element element) {
		return switch (element) {
			case Button button when button.getHref() != null -> "a";
			case ListGroup group when group.isNumbered() -> "ol";
			case ListGroup group when group.getItems().stream().anyMatch(item -> item.getHref() != null) -> "div";
			case ListGroupItem item when item.getHref() != null -> "a";
			default -> super.tagName(element);
		};
	}

	// --- Classes -----------------------------------------------------------------

	@Override
	public List<String> classes(Element element) {
		List<String> classes = super.classes(element);
		switch (element) {
			case Container container -> classes.add(0, container.isSetFluidUntil()
					? "container-" + container.getFluidUntil().getLiteral()
					: container.isFluid() ? "container-fluid" : "container");
			case Row row -> {
				int position = 1;
				for (RowColumns columns: row.getColumnsPerRow()) {
					classes.add(position++, "row-cols" + infix(columns.getBreakpoint()) + "-" + (columns.isAuto() ? "auto" : String.valueOf(columns.getCount())));
				}
			}
			case Col col -> classes.addAll(0, col.getSizes().isEmpty() ? List.of("col") : columnClasses(col.getSizes(), "col"));
			case Stack stack -> classes.add(0, stack.isHorizontal() ? "hstack" : "vstack");
			case FormLabel label -> {
				if (label.isColumn() || !label.getSizes().isEmpty()) {
					classes.add(0, "col-form-label");
					classes.addAll(1, columnClasses(label.getSizes(), "col"));
				} else {
					classes.add(0, "form-label");
				}
			}
			case FormControl control -> classes.add(0, control.isPlaintext() ? "form-control-plaintext" : "form-control");
			case FormFeedback feedback -> classes.add(0, (feedback.isSetType() ? feedback.getType().getLiteral() : "invalid") + (feedback.isTooltip() ? "-tooltip" : "-feedback"));
			case ButtonGroup group -> classes.add(0, group.isVertical() ? "btn-group-vertical" : "btn-group");
			case CardImage image -> classes.add(0, image.isSetVariant() ? "card-img-" + image.getVariant().getLiteral() : "card-img");
			case ListGroup group -> {
				if (group.isNumbered()) {
					classes.add(1, "list-group-numbered");
				}
			}
			case Nav nav -> classes.add(0, ancestor(nav, Navbar.class) == null ? "nav" : "navbar-nav");
			case Spinner spinner -> {
				String animation = "spinner-" + (spinner.isSetAnimation() ? spinner.getAnimation().getLiteral() : "border");
				classes.add(0, animation);
				if (spinner.isSetSize()) {
					classes.add(1, animation + "-" + spinner.getSize().getLiteral());
				}
			}
			case Placeholder placeholder -> classes.addAll(1, columnClasses(placeholder.getSizes(), "col"));
			case PlaceholderButton button -> classes.addAll(columnClasses(button.getSizes(), "col"));
			case Alert alert -> {
				if (alert.isDismissible()) {
					classes.addAll(List.of("alert-dismissible", "fade", "show"));
				}
			}
			case DropdownMenu menu -> {
				if (!menu.isSetAlign() && menu.eContainer() instanceof Dropdown dropdown && dropdown.isSetAlign()) {
					classes.add("dropdown-menu-" + dropdown.getAlign().getLiteral());
				}
			}
			case ToastContainer container -> {
				if (container.isSetPosition()) {
					classes.addAll(List.of((switch (container.getPosition()) {
						case TOP_START -> "top-0 start-0";
						case TOP_CENTER -> "top-0 start-50 translate-middle-x";
						case TOP_END -> "top-0 end-0";
						case MIDDLE_START -> "top-50 start-0 translate-middle-y";
						case MIDDLE_CENTER -> "top-50 start-50 translate-middle";
						case MIDDLE_END -> "top-50 end-0 translate-middle-y";
						case BOTTOM_START -> "bottom-0 start-0";
						case BOTTOM_CENTER -> "bottom-0 start-50 translate-middle-x";
						case BOTTOM_END -> "bottom-0 end-0";
					}).split(" ")));
				}
			}
			default -> {}
		}
		return classes;
	}

	private static String infix(Breakpoint breakpoint) {
		return breakpoint == null || breakpoint == Breakpoint.XS ? "" : "-" + breakpoint.getLiteral();
	}

	/**
	 * col-6, col-md-4 offset-md-2, col-lg-auto.
	 */
	protected List<String> columnClasses(List<ColumnSize> sizes, String prefix) {
		List<String> classes = new ArrayList<>();
		for (ColumnSize size: sizes) {
			String infix = infix(size.getBreakpoint());
			if (size.isAuto()) {
				classes.add(prefix + infix + "-auto");
			} else if (size.getSpan() > 0) {
				classes.add(prefix + infix + "-" + size.getSpan());
			} else {
				classes.add(prefix + infix);
			}
			if (size.isSetOffset()) {
				classes.add("offset" + infix + "-" + size.getOffset());
			}
			if (size.isSetOrder()) {
				classes.add("order" + infix + "-" + size.getOrder());
			}
		}
		return classes;
	}

	@SuppressWarnings("unchecked")
	private static <T> T ancestor(EObject element, Class<T> type) {
		for (EObject container = element.eContainer(); container != null; container = container.eContainer()) {
			if (type.isInstance(container)) {
				return (T) container;
			}
		}
		return null;
	}

	// --- Attributes --------------------------------------------------------------

	@Override
	public Map<String, Object> attributes(Element element) {
		Map<String, Object> attributes = super.attributes(element);
		switch (element) {
			case Toggle toggle -> {
				if (toggle.getTarget() == null) {
					throw new IllegalArgumentException("Toggle without target: " + toggle);
				}
				String targetId = idFor(toggle.getTarget());
				String type = switch (toggle.getTarget()) {
					case Modal modal -> "modal";
					case Offcanvas offcanvas -> "offcanvas";
					default -> "collapse";
				};
				attributes.put("data-bs-toggle", type);
				attributes.put("data-bs-target", "#" + targetId);
				attributes.put("aria-controls", targetId);
				if ("collapse".equals(type)) {
					attributes.put("aria-expanded", "false");
				}
			}
			case Button button when button.getHref() != null -> {
				attributes.remove("type");
				attributes.put("href", button.getHref());
				attributes.put("role", "button");
			}
			case ListGroupItem item when item.getHref() != null -> attributes.put("href", item.getHref());
			case NavLink link when link.isActive() -> attributes.put("aria-current", "page");
			case DropdownItem item when item.isActive() -> attributes.put("aria-current", "true");
			case BreadcrumbItem item when item.isActive() -> attributes.put("aria-current", "page");
			case FormLabel label when label.getHtmlFor() == null -> {
				FormGroup group = ancestor(label, FormGroup.class);
				if (group != null && group.getControlId() != null) {
					attributes.put("for", group.getControlId());
				}
			}
			case NavbarToggle toggle when toggle.getControls() != null -> {
				attributes.put("data-bs-target", "#" + toggle.getControls());
				attributes.put("aria-controls", toggle.getControls());
			}
			case Offcanvas offcanvas -> {
				if (offcanvas.getHeader() != null && offcanvas.getHeader().getTitle() != null) {
					attributes.put("aria-labelledby", idFor(offcanvas.getHeader().getTitle()));
				}
				if (offcanvas.isSetBackdrop()) {
					attributes.put("data-bs-backdrop", String.valueOf(offcanvas.isBackdrop()));
				}
				if (offcanvas.isScroll()) {
					attributes.put("data-bs-scroll", "true");
				}
			}
			case Toast toast when toast.isSetAutohide() -> attributes.put("data-bs-autohide", String.valueOf(toast.isAutohide()));
			case OverlayTrigger trigger -> overlayAttributes(trigger, attributes);
			default -> {}
		}
		return attributes;
	}

	protected void overlayAttributes(OverlayTrigger trigger, Map<String, Object> attributes) {
		Overlay overlay = trigger.getOverlay();
		switch (overlay) {
			case Tooltip tooltip -> {
				attributes.put("data-bs-toggle", "tooltip");
				if (tooltip.getTitle() != null) {
					attributes.put("data-bs-title", tooltip.getTitle());
				}
			}
			case Popover popover -> {
				attributes.put("data-bs-toggle", "popover");
				if (popover.getTitle() != null) {
					attributes.put("data-bs-title", popover.getTitle());
				}
				if (popover.getContent() != null) {
					attributes.put("data-bs-content", popover.getContent());
				}
			}
			case null -> throw new IllegalArgumentException("Overlay trigger without overlay: " + trigger);
			default -> throw new IllegalArgumentException("Unsupported overlay: " + overlay);
		}
		if (overlay.isHtml()) {
			attributes.put("data-bs-html", "true");
		}
		if (trigger.isSetPlacement()) {
			attributes.put("data-bs-placement", trigger.getPlacement().getLiteral());
		}
		if (!trigger.getTrigger().isEmpty()) {
			attributes.put("data-bs-trigger", String.join(" ", trigger.getTrigger().stream().map(Trigger::getLiteral).toList()));
		}
	}

	// --- Children ----------------------------------------------------------------

	@Override
	public List<Node> children(Element element) {
		List<Node> children = super.children(element);
		switch (element) {
			case Head head when head.eContainer() instanceof BootstrapDocument document -> {
				// Theme before the stylesheets of the document, which may override it
				Stylesheet theme = HTML.createStylesheet();
				theme.setHref(stylesheet(document.getTheme(), document.getBootstrapVersion(), document.getBootswatchVersion()));
				children.add(head.getMetas().size() + head.getLinks().size(), theme);
			}
			case Body body when body.eContainer() instanceof BootstrapDocument document && document.isJavaScript() -> {
				Script bundle = HTML.createScript();
				bundle.setSrc(javaScript(document.getBootstrapVersion()));
				children.add(bundle);
				for (Iterator<EObject> it = document.eAllContents(); it.hasNext();) {
					if (it.next() instanceof OverlayTrigger) {
						Script initialization = HTML.createScript();
						initialization.setContent(OVERLAY_INITIALIZATION);
						children.add(initialization);
						break;
					}
				}
			}
			case Alert alert when alert.isDismissible() -> children.add(closeButton("alert", null));
			case NavbarToggle toggle -> {
				if (children.isEmpty()) {
					children.add(element("span", null, "navbar-toggler-icon"));
				}
			}
			case ModalHeader header when header.isCloseButton() -> children.add(closeButton("modal", null));
			case OffcanvasHeader header when header.isCloseButton() -> children.add(closeButton("offcanvas", null));
			case ToastHeader header when !header.isSetCloseButton() || header.isCloseButton() -> children.add(closeButton("toast", "ms-2"));
			case Spinner spinner -> {
				children.clear();
				if (spinner.getContent() != null) {
					children.add(element("span", spinner.getContent(), "visually-hidden"));
				}
				children.addAll(spinner.getContents());
			}
			case Nav nav -> {
				children.clear();
				for (NavEntry entry: nav.getEntries()) {
					children.add(entry instanceof NavLink link ? element("li", null, "nav-item", reference(link)) : (Node) entry);
				}
				children.addAll(nav.getContents());
			}
			case DropdownMenu menu -> {
				children.clear();
				children.addAll(menuItems(menu.getEntries()));
				children.addAll(menu.getContents());
			}
			case FloatingLabel label -> {
				GenericElement labelElement = element("label", label.getLabel(), (String) null);
				if (label.getControlId() != null) {
					labelElement.getAttributes().put("for", label.getControlId());
				}
				children.add(label.getControl() == null ? 0 : 1, labelElement);
			}
			case BreadcrumbItem item when item.getHref() != null && !item.isActive() -> {
				children.clear();
				GenericElement link = element("a", item.getContent(), (String) null);
				link.getAttributes().put("href", item.getHref());
				link.getContents().addAll(references(item.getContents()));
				children.add(link);
			}
			case PaginationLink link -> {
				children.clear();
				children.add(pageLink(link));
			}
			default -> {}
		}
		return children;
	}

	private List<Node> menuItems(List<DropdownEntry> entries) {
		List<Node> items = new ArrayList<>();
		for (DropdownEntry entry: entries) {
			items.add(element("li", null, null, reference((Node) entry)));
		}
		return items;
	}

	private GenericElement closeButton(String dismiss, String classes) {
		GenericElement button = element("button", null, "btn-close");
		if (classes != null) {
			button.getClasses().add(classes);
		}
		button.getAttributes().put("type", "button");
		button.getAttributes().put("data-bs-dismiss", dismiss);
		button.getAttributes().put("aria-label", "Close");
		return button;
	}

	/**
	 * a.page-link, or span.page-link for an ellipsis. Navigation links have default
	 * symbols and labels.
	 */
	private GenericElement pageLink(PaginationLink link) {
		String[] defaults = switch (link) {
			case PaginationFirst first -> new String[] { "«", "First" };
			case PaginationPrev prev -> new String[] { "‹", "Previous" };
			case PaginationNext next -> new String[] { "›", "Next" };
			case PaginationLast last -> new String[] { "»", "Last" };
			case PaginationEllipsis ellipsis -> new String[] { "…", null };
			default -> new String[] { null, null };
		};
		boolean ellipsis = link instanceof PaginationEllipsis;
		GenericElement pageLink = element(ellipsis ? "span" : "a", null, "page-link");
		if (!ellipsis) {
			pageLink.getAttributes().put("href", link.getHref() == null ? "#" : link.getHref());
		}
		if (link.isActive()) {
			pageLink.getAttributes().put("aria-current", "page");
		}
		if (link.getContent() != null || !link.getContents().isEmpty()) {
			if (link.getContent() != null) {
				pageLink.getContents().add(text(link.getContent()));
			}
			pageLink.getContents().addAll(references(link.getContents()));
		} else if (defaults[1] != null) {
			pageLink.getAttributes().put("aria-label", defaults[1]);
			GenericElement symbol = element("span", defaults[0], (String) null);
			symbol.getAttributes().put("aria-hidden", "true");
			pageLink.getContents().add(symbol);
		} else if (defaults[0] != null) {
			pageLink.getContents().add(text(defaults[0]));
		}
		return pageLink;
	}

	// --- Expansion ---------------------------------------------------------------

	/**
	 * Expands components which are more than one element to plain HTML.
	 */
	@Override
	public Node expand(Node node) {
		Node expanded = super.expand(node);
		return switch (expanded) {
			case FormCheck check -> formCheck(check);
			case Table table when table.isResponsive() || table.isSetResponsiveBelow() -> {
				GenericElement wrapper = element("div", null, "table-responsive" + (table.isSetResponsiveBelow() ? "-" + table.getResponsiveBelow().getLiteral() : ""));
				wrapper.getContents().add(plain(table));
				yield wrapper;
			}
			case ProgressBar progressBar -> progressBar(progressBar);
			case Accordion accordion -> accordion(accordion);
			case Carousel carousel -> carousel(carousel);
			case NavDropdown dropdown -> navDropdown(dropdown);
			case Tabs tabs -> tabs(tabs);
			case Breadcrumb breadcrumb -> {
				GenericElement nav = plain(breadcrumb);
				nav.getContents().add(element("ol", null, "breadcrumb", references(breadcrumb.getItems()).toArray(Node[]::new)));
				yield nav;
			}
			case Pagination pagination -> {
				GenericElement nav = plain(pagination);
				GenericElement list = element("ul", null, "pagination");
				if (pagination.isSetSize()) {
					list.getClasses().add("pagination-" + pagination.getSize().getLiteral());
				}
				for (PaginationEntry entry: pagination.getEntries()) {
					list.getContents().add(reference((Node) entry));
				}
				nav.getContents().add(list);
				yield nav;
			}
			case DropdownButton dropdownButton -> dropdownButton(dropdownButton);
			case Modal modal -> modal(modal);
			default -> expanded;
		};
	}

	protected GenericElement formCheck(FormCheck check) {
		GenericElement wrapper = plain(check);
		wrapper.getClasses().removeAll(List.of("is-valid", "is-invalid"));
		CheckType type = check.isSetType() ? check.getType() : CheckType.CHECKBOX;
		if (type == CheckType.SWITCH) {
			wrapper.getClasses().add("form-switch");
		}
		wrapper.getAttributes().removeKey("name");
		wrapper.getAttributes().removeKey("disabled");
		wrapper.getAttributes().removeKey("required");

		String inputId = check.getInputId() == null ? generatedId(check) + "-input" : check.getInputId();
		GenericVoidElement input = HTML.createGenericVoidElement();
		input.setName("input");
		input.getClasses().add("form-check-input");
		if (check.isIsValid()) {
			input.getClasses().add("is-valid");
		}
		if (check.isIsInvalid()) {
			input.getClasses().add("is-invalid");
		}
		input.setId(inputId);
		input.getAttributes().put("type", type == CheckType.RADIO ? "radio" : "checkbox");
		if (type == CheckType.SWITCH) {
			input.getAttributes().put("role", "switch");
		}
		putIfNotNull(input, "name", check.getName());
		putIfNotNull(input, "value", check.getValue());
		putIfTrue(input, "checked", check.isChecked());
		putIfTrue(input, "disabled", check.isDisabled());
		putIfTrue(input, "required", check.isRequired());
		wrapper.getContents().add(0, input);
		if (check.getLabel() != null) {
			GenericElement label = element("label", check.getLabel(), "form-check-label");
			label.getAttributes().put("for", inputId);
			wrapper.getContents().add(1, label);
		}
		if (check.getFeedback() != null) {
			String feedbackType = check.isSetFeedbackType() ? check.getFeedbackType().getLiteral() : "invalid";
			wrapper.getContents().add(element("div", check.getFeedback(), feedbackType + "-feedback"));
		}
		return wrapper;
	}

	protected Element progressBar(ProgressBar progressBar) {
		if (progressBar.getBars().isEmpty()) {
			GenericElement progress = plain(progressBar);
			progress.getContents().clear();
			progressAttributes(progressBar, progress);
			progress.getContents().add(bar(progressBar));
			progress.getContents().addAll(references(progressBar.getContents()));
			return progress;
		}
		GenericElement stacked = plain(progressBar);
		stacked.getContents().clear();
		stacked.getClasses().set(stacked.getClasses().indexOf("progress"), "progress-stacked");
		for (ProgressBar bar: progressBar.getBars()) {
			GenericElement progress = element("div", null, "progress");
			progress.getClasses().addAll(bar.getClasses());
			progressAttributes(bar, progress);
			progress.getStyle().put("width", percentage(bar) + "%");
			progress.getContents().add(bar(bar));
			stacked.getContents().add(progress);
		}
		return stacked;
	}

	private static int min(ProgressBar progressBar) {
		return progressBar.isSetMin() ? progressBar.getMin() : 0;
	}

	private static int max(ProgressBar progressBar) {
		return progressBar.isSetMax() ? progressBar.getMax() : 100;
	}

	private static int percentage(ProgressBar progressBar) {
		int min = min(progressBar);
		int max = max(progressBar);
		return max == min ? 0 : (int) Math.round((progressBar.getNow() - min) * 100.0 / (max - min));
	}

	private static void progressAttributes(ProgressBar progressBar, GenericElement progress) {
		progress.getAttributes().put("role", "progressbar");
		if (progressBar.getLabel() != null) {
			progress.getAttributes().put("aria-label", progressBar.getLabel());
		}
		progress.getAttributes().put("aria-valuenow", String.valueOf(progressBar.getNow()));
		progress.getAttributes().put("aria-valuemin", String.valueOf(min(progressBar)));
		progress.getAttributes().put("aria-valuemax", String.valueOf(max(progressBar)));
	}

	private GenericElement bar(ProgressBar progressBar) {
		GenericElement bar = element("div", null, "progress-bar");
		if (progressBar.isSetVariant()) {
			bar.getClasses().add("bg-" + progressBar.getVariant().getLiteral());
		}
		if (progressBar.isStriped()) {
			bar.getClasses().add("progress-bar-striped");
		}
		if (progressBar.isAnimated()) {
			bar.getClasses().add("progress-bar-animated");
		}
		if (progressBar.eContainer() instanceof ProgressBar) {
			// Stacked - the width is on the progress
		} else {
			bar.getStyle().put("width", percentage(progressBar) + "%");
		}
		if (progressBar.getLabel() != null) {
			bar.getContents().add(progressBar.isVisuallyHidden() ? element("span", progressBar.getLabel(), "visually-hidden") : text(progressBar.getLabel()));
		}
		return bar;
	}

	protected GenericElement accordion(Accordion accordion) {
		String accordionId = idFor(accordion);
		GenericElement root = plain(accordion);
		root.getContents().clear();
		List<AccordionItem> items = accordion.getItems();
		for (int i = 0; i < items.size(); ++i) {
			AccordionItem item = items.get(i);
			String key = item.getEventKey() == null ? String.valueOf(i) : item.getEventKey();
			boolean open = accordion.getDefaultActiveKey() == null ? i == 0 : accordion.getDefaultActiveKey().equals(key);
			String collapseId = accordionId + "-" + sanitize(key);

			GenericElement itemElement = plain(item);
			itemElement.getContents().clear();
			GenericElement header = item.getHeader() == null ? element("h2", null, "accordion-header") : plain(item.getHeader());
			List<Node> headerContent = new ArrayList<>(header.getContents());
			header.getContents().clear();
			GenericElement button = element("button", null, "accordion-button");
			if (!open) {
				button.getClasses().add("collapsed");
			}
			button.getAttributes().put("type", "button");
			button.getAttributes().put("data-bs-toggle", "collapse");
			button.getAttributes().put("data-bs-target", "#" + collapseId);
			button.getAttributes().put("aria-expanded", String.valueOf(open));
			button.getAttributes().put("aria-controls", collapseId);
			button.getContents().addAll(headerContent);
			header.getContents().add(button);
			itemElement.getContents().add(header);

			GenericElement collapse = element("div", null, "accordion-collapse collapse");
			if (open) {
				collapse.getClasses().add("show");
			}
			collapse.setId(collapseId);
			if (!accordion.isAlwaysOpen()) {
				collapse.getAttributes().put("data-bs-parent", "#" + accordionId);
			}
			if (item.getBody() != null) {
				collapse.getContents().add(reference(item.getBody()));
			}
			itemElement.getContents().add(collapse);
			itemElement.getContents().addAll(references(item.getContents()));
			root.getContents().add(itemElement);
		}
		root.getContents().addAll(references(accordion.getContents()));
		return root;
	}

	protected GenericElement carousel(Carousel carousel) {
		String carouselId = idFor(carousel);
		GenericElement root = plain(carousel);
		root.getContents().clear();
		List<CarouselItem> items = carousel.getItems();
		if (!carousel.isSetIndicators() || carousel.isIndicators()) {
			GenericElement indicators = element("div", null, "carousel-indicators");
			for (int i = 0; i < items.size(); ++i) {
				GenericElement indicator = element("button", null, (String) null);
				indicator.getAttributes().put("type", "button");
				indicator.getAttributes().put("data-bs-target", "#" + carouselId);
				indicator.getAttributes().put("data-bs-slide-to", String.valueOf(i));
				if (i == 0) {
					indicator.getClasses().add("active");
					indicator.getAttributes().put("aria-current", "true");
				}
				indicator.getAttributes().put("aria-label", "Slide " + (i + 1));
				indicators.getContents().add(indicator);
			}
			root.getContents().add(indicators);
		}
		GenericElement inner = element("div", null, "carousel-inner");
		for (int i = 0; i < items.size(); ++i) {
			GenericElement item = plain(items.get(i));
			if (i == 0) {
				item.getClasses().add("active");
			}
			inner.getContents().add(item);
		}
		root.getContents().add(inner);
		if (!carousel.isSetControls() || carousel.isControls()) {
			for (String[] control: new String[][] { { "prev", "Previous" }, { "next", "Next" } }) {
				GenericElement button = element("button", null, "carousel-control-" + control[0]);
				button.getAttributes().put("type", "button");
				button.getAttributes().put("data-bs-target", "#" + carouselId);
				button.getAttributes().put("data-bs-slide", control[0]);
				GenericElement icon = element("span", null, "carousel-control-" + control[0] + "-icon");
				icon.getAttributes().put("aria-hidden", "true");
				button.getContents().add(icon);
				button.getContents().add(element("span", control[1], "visually-hidden"));
				root.getContents().add(button);
			}
		}
		root.getContents().addAll(references(carousel.getContents()));
		return root;
	}

	protected GenericElement navDropdown(NavDropdown dropdown) {
		GenericElement item = plain(dropdown);
		item.setId(null);
		item.getContents().clear();
		GenericElement toggle = element("a", null, "nav-link dropdown-toggle");
		toggle.setId(id(dropdown));
		toggle.getAttributes().put("href", "#");
		toggle.getAttributes().put("role", "button");
		toggle.getAttributes().put("data-bs-toggle", "dropdown");
		toggle.getAttributes().put("aria-expanded", "false");
		title(toggle, dropdown.getTitle(), dropdown.getTitleNode());
		item.getContents().add(toggle);
		GenericElement menu = element("ul", null, "dropdown-menu");
		if (dropdown.isMenuEnd()) {
			menu.getClasses().add("dropdown-menu-end");
		}
		menu.getContents().addAll(menuItems(dropdown.getEntries()));
		item.getContents().add(menu);
		item.getContents().addAll(references(dropdown.getContents()));
		return item;
	}

	private void title(GenericElement element, String title, Node titleNode) {
		if (titleNode != null) {
			element.getContents().add(reference(titleNode));
		} else if (title != null) {
			element.getContents().add(text(title));
		}
	}

	protected GenericElement tabs(Tabs tabs) {
		String tabsId = idFor(tabs);
		GenericElement root = plain(tabs);
		root.getContents().clear();
		GenericElement nav = element("ul", null, "nav nav-" + (tabs.isSetVariant() ? tabs.getVariant().getLiteral() : "tabs"));
		if (tabs.isFill()) {
			nav.getClasses().add("nav-fill");
		}
		if (tabs.isJustify()) {
			nav.getClasses().add("nav-justified");
		}
		nav.getAttributes().put("role", "tablist");
		GenericElement content = element("div", null, "tab-content");
		List<Tab> tabList = tabs.getTabs();
		for (int i = 0; i < tabList.size(); ++i) {
			Tab tab = tabList.get(i);
			String key = tab.getEventKey() == null ? String.valueOf(i) : tab.getEventKey();
			boolean active = tabs.getDefaultActiveKey() == null ? i == 0 : tabs.getDefaultActiveKey().equals(key);
			String tabId = tabsId + "-" + sanitize(key) + "-tab";
			String paneId = tabsId + "-" + sanitize(key) + "-pane";

			GenericElement button = element("button", null, "nav-link");
			if (active) {
				button.getClasses().add("active");
			}
			button.setId(tabId);
			button.getAttributes().put("data-bs-toggle", "tab");
			button.getAttributes().put("data-bs-target", "#" + paneId);
			button.getAttributes().put("type", "button");
			button.getAttributes().put("role", "tab");
			button.getAttributes().put("aria-controls", paneId);
			button.getAttributes().put("aria-selected", String.valueOf(active));
			if (tab.isDisabled()) {
				button.getAttributes().put("disabled", null);
			}
			title(button, tab.getTitle(), tab.getTitleNode());
			GenericElement item = element("li", null, "nav-item", button);
			item.getAttributes().put("role", "presentation");
			nav.getContents().add(item);

			GenericElement pane = plain(tab);
			pane.getClasses().addAll(0, active ? List.of("tab-pane", "fade", "show", "active") : List.of("tab-pane", "fade"));
			pane.setId(paneId);
			pane.getAttributes().put("role", "tabpanel");
			pane.getAttributes().put("aria-labelledby", tabId);
			pane.getAttributes().put("tabindex", "0");
			content.getContents().add(pane);
		}
		root.getContents().add(nav);
		root.getContents().add(content);
		root.getContents().addAll(references(tabs.getContents()));
		return root;
	}

	protected GenericElement dropdownButton(DropdownButton dropdownButton) {
		GenericElement root = plain(dropdownButton);
		root.getContents().clear();
		String variant = "btn-" + (dropdownButton.isSetVariant() ? dropdownButton.getVariant().getLiteral() : "primary");
		String size = dropdownButton.isSetSize() ? "btn-" + dropdownButton.getSize().getLiteral() : null;
		GenericElement toggle;
		if (dropdownButton instanceof SplitButton split) {
			GenericElement action = element(split.getHref() == null ? "button" : "a", null, "btn " + variant);
			if (split.getHref() == null) {
				action.getAttributes().put("type", "button");
			} else {
				action.getAttributes().put("href", split.getHref());
				action.getAttributes().put("role", "button");
			}
			if (size != null) {
				action.getClasses().add(size);
			}
			title(action, split.getTitle(), split.getTitleNode());
			root.getContents().add(action);
			toggle = element("button", null, "btn " + variant + " dropdown-toggle dropdown-toggle-split");
			toggle.getContents().add(element("span", "Toggle dropdown", "visually-hidden"));
		} else {
			toggle = element("button", null, "btn " + variant + " dropdown-toggle");
			title(toggle, dropdownButton.getTitle(), dropdownButton.getTitleNode());
		}
		if (size != null) {
			toggle.getClasses().add(size);
		}
		toggle.getAttributes().put("type", "button");
		toggle.getAttributes().put("data-bs-toggle", "dropdown");
		toggle.getAttributes().put("aria-expanded", "false");
		root.getContents().add(toggle);
		GenericElement menu = element("ul", null, "dropdown-menu");
		menu.getContents().addAll(menuItems(dropdownButton.getEntries()));
		root.getContents().add(menu);
		root.getContents().addAll(references(dropdownButton.getContents()));
		return root;
	}

	protected GenericElement modal(Modal modal) {
		GenericElement root = plain(modal);
		root.getContents().clear();
		if (modal.getHeader() != null && modal.getHeader().getTitle() != null) {
			root.getAttributes().put("aria-labelledby", idFor(modal.getHeader().getTitle()));
		}
		if (modal.isStaticBackdrop()) {
			root.getAttributes().put("data-bs-backdrop", "static");
		}
		if (modal.isSetKeyboard()) {
			root.getAttributes().put("data-bs-keyboard", String.valueOf(modal.isKeyboard()));
		}
		GenericElement dialog = element("div", null, "modal-dialog");
		if (modal.isSetSize()) {
			dialog.getClasses().add("modal-" + modal.getSize().getLiteral());
		}
		if (modal.isCentered()) {
			dialog.getClasses().add("modal-dialog-centered");
		}
		if (modal.isScrollable()) {
			dialog.getClasses().add("modal-dialog-scrollable");
		}
		if (modal.isSetFullscreenBelow()) {
			dialog.getClasses().add("modal-fullscreen-" + modal.getFullscreenBelow().getLiteral());
		} else if (modal.isFullscreen()) {
			dialog.getClasses().add("modal-fullscreen");
		}
		GenericElement content = element("div", null, "modal-content");
		for (Node part: new Node[] { modal.getHeader(), modal.getBody(), modal.getFooter() }) {
			if (part != null) {
				content.getContents().add(reference(part));
			}
		}
		content.getContents().addAll(references(modal.getContents()));
		dialog.getContents().add(content);
		root.getContents().add(dialog);
		return root;
	}

	// --- Plain HTML --------------------------------------------------------------

	/**
	 * Plain HTML element with the tag, id, classes, attributes, style and children of the
	 * element, as this structure renders them. Children of the model are referenced.
	 */
	protected GenericElement plain(Element element) {
		if (isVoid(element)) {
			throw new IllegalArgumentException("Void elements are not expanded: " + element);
		}
		GenericElement ret = element(tagName(element), null, (String) null);
		ret.setId(id(element));
		ret.getClasses().addAll(classes(element));
		for (Map.Entry<String, Object> attribute: attributes(element).entrySet()) {
			ret.getAttributes().put(attribute.getKey(), attribute.getValue() instanceof String value ? value : null);
		}
		for (Map.Entry<String, String> entry: element.getStyle()) {
			ret.getStyle().put(entry.getKey(), entry.getValue());
		}
		ret.getContents().addAll(references(children(element)));
		return ret;
	}

	/**
	 * @return The node if it is not contained, e.g. created by this structure, a reference to it otherwise
	 */
	protected Node reference(Node node) {
		if (node.eContainer() == null) {
			return node;
		}
		NodeReference reference = HTML.createNodeReference();
		reference.setTarget(node);
		return reference;
	}

	protected List<Node> references(List<? extends Node> nodes) {
		List<Node> ret = new ArrayList<>();
		for (Node node: nodes) {
			ret.add(reference(node));
		}
		return ret;
	}

	protected static Text text(String content) {
		Text text = HTML.createText();
		text.setContent(content);
		return text;
	}

	/**
	 * @param text Text content, null for none
	 * @param classes Class, null for none, may be space separated
	 */
	protected GenericElement element(String tag, String text, String classes, Node... children) {
		GenericElement element = HTML.createGenericElement();
		element.setName(tag);
		if (classes != null) {
			for (String cls: classes.split(" ")) {
				element.getClasses().add(cls);
			}
		}
		if (text != null) {
			element.getContents().add(text(text));
		}
		for (Node child: children) {
			element.getContents().add(child);
		}
		return element;
	}

	private static void putIfNotNull(Element element, String name, String value) {
		if (value != null) {
			element.getAttributes().put(name, value);
		}
	}

	private static void putIfTrue(Element element, String name, boolean value) {
		if (value) {
			element.getAttributes().put(name, null);
		}
	}

	private static String sanitize(String key) {
		return key.toLowerCase().replaceAll("[^a-z0-9]+", "-");
	}

}
