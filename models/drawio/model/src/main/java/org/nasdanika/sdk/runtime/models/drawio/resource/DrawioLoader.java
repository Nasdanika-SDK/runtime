package org.nasdanika.sdk.runtime.models.drawio.resource;

import java.util.ArrayList;
import java.util.IdentityHashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.jsoup.Jsoup;
import org.nasdanika.sdk.runtime.drawio.ConnectionBase;
import org.nasdanika.sdk.runtime.drawio.Geometry;
import org.nasdanika.sdk.runtime.drawio.LayerElement;
import org.nasdanika.sdk.runtime.drawio.util.Util;
import org.nasdanika.sdk.runtime.models.diagram.Bounds;
import org.nasdanika.sdk.runtime.models.diagram.Connectable;
import org.nasdanika.sdk.runtime.models.diagram.DiagramElement;
import org.nasdanika.sdk.runtime.models.diagram.DiagramFactory;
import org.nasdanika.sdk.runtime.models.diagram.Point;
import org.nasdanika.sdk.runtime.models.drawio.AbstractLink;
import org.nasdanika.sdk.runtime.models.drawio.Connection;
import org.nasdanika.sdk.runtime.models.drawio.CustomLink;
import org.nasdanika.sdk.runtime.models.drawio.Document;
import org.nasdanika.sdk.runtime.models.drawio.DrawioFactory;
import org.nasdanika.sdk.runtime.models.drawio.Layer;
import org.nasdanika.sdk.runtime.models.drawio.LinkTarget;
import org.nasdanika.sdk.runtime.models.drawio.ModelElement;
import org.nasdanika.sdk.runtime.models.drawio.Node;
import org.nasdanika.sdk.runtime.models.drawio.Page;
import org.nasdanika.sdk.runtime.models.drawio.Tag;

/**
 * Loads a document read with the runtime's Draw.io API into the Draw.io model: pages, layers,
 * nodes with their children, connections with their labels, and for each cell its id, label,
 * tooltip as documentation, properties as attributes, style, tags and link. Links to pages and
 * elements of the same document are resolved into references.
 *
 * <p>
 * Not loaded: custom actions as typed objects (they are loaded as simple links, so they keep
 * their text), connection points other than in the style, the end points of dangling
 * connections, and label offsets of connections.
 */
public class DrawioLoader {

	private final DrawioFactory factory = DrawioFactory.eINSTANCE;

	/** API elements and pages to the model objects made from them */
	private final Map<Object, EObject> loaded = new IdentityHashMap<>();

	private final List<org.nasdanika.sdk.runtime.drawio.ModelElement<?>> withLinks = new ArrayList<>();

	public Document load(org.nasdanika.sdk.runtime.drawio.Document source) {
		Document document = factory.createDocument();
		org.w3c.dom.Element mxfile = source.getElement();
		document.setHost(attribute(mxfile, "host"));
		document.setAgent(attribute(mxfile, "agent"));
		document.setVersion(attribute(mxfile, "version"));
		document.setCompressed(!"false".equals(mxfile.getAttribute("compressed")));
		for (org.nasdanika.sdk.runtime.drawio.Page sourcePage : source.getPages()) {
			document.getChildren().add(load(sourcePage));
		}
		connect();
		link();
		return document;
	}

	protected Page load(org.nasdanika.sdk.runtime.drawio.Page source) {
		Page page = factory.createPage();
		loaded.put(source, page);
		page.setId(source.getId());
		page.setName(source.getName());
		org.w3c.dom.Element graphModel = source.getModel().getElement();
		page.setDx(number(graphModel, "dx"));
		page.setDy(number(graphModel, "dy"));
		page.setPageWidth(number(graphModel, "pageWidth"));
		page.setPageHeight(number(graphModel, "pageHeight"));
		page.setGridSize(number(graphModel, "gridSize"));

		Map<String, Tag> tags = new LinkedHashMap<>();
		for (String name : source.getTags().keySet()) {
			Tag tag = factory.createTag();
			tag.setId(name);
			tags.put(name, tag);
			page.getTags().add(tag);
		}

		// The root cell's properties and tooltip are the page's
		org.nasdanika.sdk.runtime.drawio.Root root = source.getModel().getRoot();
		attributes(root, page);
		String tooltip = root.getTooltip();
		if (!isBlank(tooltip)) {
			page.setDocumentation(tooltip);
		}

		for (org.nasdanika.sdk.runtime.drawio.Layer<?> sourceLayer : root.getLayers()) {
			Layer layer = factory.createLayer();
			cell(sourceLayer, layer, tags);
			layer.setVisible(sourceLayer.isVisible());
			page.getChildren().add(layer);
			elements(sourceLayer.getElements(), layer, tags);
		}
		return page;
	}

	private void elements(List<LayerElement<?>> sources, DiagramElement parent, Map<String, Tag> tags) {
		for (LayerElement<?> source : sources) {
			if (source instanceof org.nasdanika.sdk.runtime.drawio.Node sourceNode) {
				parent.getChildren().add(node(sourceNode, tags));
			} else if (source instanceof org.nasdanika.sdk.runtime.drawio.Connection sourceConnection) {
				Connection connection = factory.createConnection();
				cell(sourceConnection, connection, tags);
				connection.setVisible(sourceConnection.isVisible());
				for (org.nasdanika.sdk.runtime.drawio.Point sourcePoint : sourceConnection.getPoints()) {
					connection.getWaypoints().add(point(sourcePoint.getX(), sourcePoint.getY()));
				}
				parent.getChildren().add(connection);
				// Labels of the connection are nodes whose parent is the connection
				sourceConnection.stream(ConnectionBase.PARENT)
					.filter(org.nasdanika.sdk.runtime.drawio.Node.class::isInstance)
					.map(org.nasdanika.sdk.runtime.drawio.Node.class::cast)
					.filter(label -> label.getParent() == sourceConnection)
					.forEach(label -> connection.getChildren().add(node(label, tags)));
			}
		}
	}

	private Node node(org.nasdanika.sdk.runtime.drawio.Node source, Map<String, Tag> tags) {
		Node node = factory.createNode();
		cell(source, node, tags);
		node.setVisible(source.isVisible());
		node.setCollapsed("1".equals(cellElement(source).getAttribute("collapsed")));
		Geometry geometry = source.getGeometry();
		if (geometry != null) {
			Bounds bounds = DiagramFactory.eINSTANCE.createBounds();
			bounds.setX(geometry.getX());
			bounds.setY(geometry.getY());
			bounds.setWidth(geometry.getWidth());
			bounds.setHeight(geometry.getHeight());
			node.setBounds(bounds);
		}
		elements(source.getElements(), node, tags);
		return node;
	}

	/**
	 * What every cell has: id, label and name, tooltip as documentation, properties as
	 * attributes, style, tags. Links are loaded once everything else is.
	 */
	protected void cell(org.nasdanika.sdk.runtime.drawio.ModelElement<?> source, ModelElement target, Map<String, Tag> tags) {
		loaded.put(source, target);
		DiagramElement element = (DiagramElement) target;
		element.setId(source.getId());
		Styles.parse(cellElement(source).getAttribute("style"), target.getStyle());
		String label = source.getLabel();
		if (!isBlank(label)) {
			target.setLabel(label);
			element.setName("1".equals(target.getStyle().get("html")) ? Jsoup.parse(label).text() : label);
		}
		String tooltip = source.getTooltip();
		if (!isBlank(tooltip)) {
			element.setDocumentation(tooltip);
		}
		attributes(source, element);
		for (org.nasdanika.sdk.runtime.drawio.Tag sourceTag : source.getTags()) {
			Tag tag = tags.get(sourceTag.getName());
			if (tag != null) {
				target.getTags().add(tag);
			}
		}
		if (!isBlank(source.getLink())) {
			withLinks.add(source);
		}
	}

	private static void attributes(org.nasdanika.sdk.runtime.drawio.ModelElement<?> source, DiagramElement target) {
		for (String name : source.getPropertyNames()) {
			if (!"id".equals(name)) {
				target.getAttributes().put(name, source.getProperty(name));
			}
		}
	}

	private void connect() {
		loaded.forEach((source, target) -> {
			if (source instanceof org.nasdanika.sdk.runtime.drawio.Connection sourceConnection && target instanceof Connection connection) {
				connection.setSource(end(sourceConnection.getSource()));
				connection.setTarget(end(sourceConnection.getTarget()));
			}
		});
	}

	private Connectable end(org.nasdanika.sdk.runtime.drawio.Connectable end) {
		return end == null ? null : (Connectable) loaded.get(Util.getConnectableNode(end));
	}

	/**
	 * Parses links, and resolves those to pages and elements of the document.
	 */
	private void link() {
		for (org.nasdanika.sdk.runtime.drawio.ModelElement<?> source : withLinks) {
			ModelElement target = (ModelElement) loaded.get(source);
			AbstractLink link = Links.parse(source.getLink());
			if (link instanceof CustomLink customLink && isBlank(customLink.getResource())) {
				try {
					EObject linkTarget = loaded.get(source.getLinkTarget());
					if (linkTarget instanceof LinkTarget resolved) {
						customLink.setTarget(resolved);
					}
				} catch (RuntimeException e) {
					// A dangling link keeps its selectors, and no target
				}
			}
			target.setLink(link);
		}
	}

	/**
	 * The {@code mxCell} of an element, which is the element itself or, for an element with
	 * properties, the child of its {@code object} or {@code UserObject} element.
	 */
	static org.w3c.dom.Element cellElement(org.nasdanika.sdk.runtime.drawio.ModelElement<?> element) {
		org.w3c.dom.Element domElement = element.getElement();
		if ("mxCell".equals(domElement.getTagName())) {
			return domElement;
		}
		for (org.w3c.dom.Node child = domElement.getFirstChild(); child != null; child = child.getNextSibling()) {
			if (child instanceof org.w3c.dom.Element childElement && "mxCell".equals(childElement.getTagName())) {
				return childElement;
			}
		}
		return domElement;
	}

	private static Point point(double x, double y) {
		Point point = DiagramFactory.eINSTANCE.createPoint();
		point.setX(x);
		point.setY(y);
		return point;
	}

	private static String attribute(org.w3c.dom.Element element, String name) {
		return element.hasAttribute(name) ? element.getAttribute(name) : null;
	}

	private static double number(org.w3c.dom.Element element, String name) {
		String value = element.getAttribute(name);
		if (isBlank(value)) {
			return 0;
		}
		try {
			return Double.parseDouble(value);
		} catch (NumberFormatException e) {
			return 0;
		}
	}

	private static boolean isBlank(String text) {
		return text == null || text.isBlank();
	}

}
