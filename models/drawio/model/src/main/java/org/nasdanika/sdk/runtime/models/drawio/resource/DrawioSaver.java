package org.nasdanika.sdk.runtime.models.drawio.resource;

import java.util.ArrayList;
import java.util.IdentityHashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.xml.parsers.ParserConfigurationException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.nasdanika.sdk.runtime.drawio.Layer;
import org.nasdanika.sdk.runtime.models.diagram.Bounds;
import org.nasdanika.sdk.runtime.models.diagram.DiagramElement;
import org.nasdanika.sdk.runtime.models.diagram.Point;
import org.nasdanika.sdk.runtime.models.drawio.Connection;
import org.nasdanika.sdk.runtime.models.drawio.Document;
import org.nasdanika.sdk.runtime.models.drawio.ModelElement;
import org.nasdanika.sdk.runtime.models.drawio.Node;
import org.nasdanika.sdk.runtime.models.drawio.Page;
import org.nasdanika.sdk.runtime.models.drawio.Tag;

/**
 * Writes a Draw.io model to a document of the runtime's Draw.io API, which saves it as XML: the
 * inverse of {@link DrawioLoader}. An element without a label is labeled with its name, and an
 * element without an id gets one from the API.
 *
 * <p>
 * Nodes are created first, in containment order, then connections, which need their ends, then
 * links, which need their targets.
 */
public class DrawioSaver {

	/** Model objects to the API elements made from them */
	private final Map<EObject, org.nasdanika.sdk.runtime.drawio.ModelElement<?>> saved = new IdentityHashMap<>();

	private final List<Runnable> connections = new ArrayList<>();

	public org.nasdanika.sdk.runtime.drawio.Document save(Document source, URI uri) throws ParserConfigurationException {
		org.nasdanika.sdk.runtime.drawio.Document document = org.nasdanika.sdk.runtime.drawio.Document.create(source.isCompressed(), uri);
		org.w3c.dom.Element mxfile = document.getElement();
		attribute(mxfile, "host", source.getHost());
		attribute(mxfile, "agent", source.getAgent());
		attribute(mxfile, "version", source.getVersion());
		for (Page page : source.getPages()) {
			save(page, document.createPage());
		}
		connections.forEach(Runnable::run);
		saved.forEach((element, target) -> {
			if (element instanceof ModelElement modelElement && modelElement.getLink() != null) {
				target.setLink(Links.format(modelElement.getLink(), modelElement));
			}
		});
		return document;
	}

	protected void save(Page source, org.nasdanika.sdk.runtime.drawio.Page target) {
		if (source.getId() != null) {
			target.setId(source.getId());
		}
		target.setName(source.getName());
		org.w3c.dom.Element graphModel = target.getModel().getElement();
		number(graphModel, "dx", source.getDx());
		number(graphModel, "dy", source.getDy());
		number(graphModel, "pageWidth", source.getPageWidth());
		number(graphModel, "pageHeight", source.getPageHeight());
		number(graphModel, "gridSize", source.getGridSize());

		Map<String, org.nasdanika.sdk.runtime.drawio.Tag> tags = new LinkedHashMap<>();
		for (Tag tag : source.getTags()) {
			tags.put(tag.getId(), target.createTag(tag.getId()));
		}

		org.nasdanika.sdk.runtime.drawio.Root root = target.getModel().getRoot();
		source.getAttributes().forEach(attribute -> root.setProperty(attribute.getKey(), attribute.getValue()));
		if (source.getDocumentation() != null) {
			root.setTooltip(source.getDocumentation());
		}

		// A new page has a layer, which is used for the first one
		boolean first = true;
		for (org.nasdanika.sdk.runtime.models.drawio.Layer layer : source.getLayers()) {
			Layer<?> targetLayer = first ? root.getLayers().getFirst() : root.createLayer();
			first = false;
			cell(layer, targetLayer, tags);
			targetLayer.setVisible(layer.isVisible());
			elements(layer, targetLayer, tags);
		}
	}

	private void elements(DiagramElement source, Layer<?> target, Map<String, org.nasdanika.sdk.runtime.drawio.Tag> tags) {
		for (DiagramElement child : source.getChildren()) {
			if (child instanceof Node node) {
				node(node, target.createNode(), tags);
			} else if (child instanceof Connection connection) {
				connections.add(() -> connection(connection, target, tags));
			}
		}
	}

	private void node(Node source, org.nasdanika.sdk.runtime.drawio.Node target, Map<String, org.nasdanika.sdk.runtime.drawio.Tag> tags) {
		cell(source, target, tags); // Before the children, which refer to the node by id
		if (!source.isVisible()) {
			target.setVisible(false);
		}
		if (source.isCollapsed()) {
			DrawioLoader.cellElement(target).setAttribute("collapsed", "1");
		}
		Bounds bounds = source.getBounds();
		if (bounds != null) {
			target.getGeometry().setBounds(bounds.getX(), bounds.getY(), bounds.getWidth(), bounds.getHeight());
		}
		elements(source, target, tags);
	}

	private void connection(Connection source, Layer<?> parent, Map<String, org.nasdanika.sdk.runtime.drawio.Tag> tags) {
		org.nasdanika.sdk.runtime.drawio.Connection target = parent.createConnection(end(source.getSource()), end(source.getTarget()));
		cell(source, target, tags);
		if (!source.isVisible()) {
			target.setVisible(false);
		}
		for (Point point : source.getWaypoints()) {
			target.getPoints().add(point.getX(), point.getY());
		}
		for (DiagramElement child : source.getChildren()) {
			if (child instanceof Node label) {
				node(label, target.createNode(), tags);
			}
		}
	}

	private org.nasdanika.sdk.runtime.drawio.Connectable end(EObject end) {
		return saved.get(end) instanceof org.nasdanika.sdk.runtime.drawio.Connectable connectable ? connectable : null;
	}

	protected void cell(ModelElement source, org.nasdanika.sdk.runtime.drawio.ModelElement<?> target, Map<String, org.nasdanika.sdk.runtime.drawio.Tag> tags) {
		saved.put((EObject) source, target);
		DiagramElement element = (DiagramElement) source;
		if (element.getId() != null) {
			target.setId(element.getId());
		}
		String label = source.getLabel() == null ? element.getName() : source.getLabel();
		if (label != null) {
			target.setLabel(label);
		}
		if (element.getDocumentation() != null) {
			target.setTooltip(element.getDocumentation());
		}
		element.getAttributes().forEach(attribute -> target.setProperty(attribute.getKey(), attribute.getValue()));
		String style = Styles.format(source.getStyle());
		if (!style.isEmpty()) {
			DrawioLoader.cellElement(target).setAttribute("style", style);
		}
		for (Tag tag : source.getTags()) {
			org.nasdanika.sdk.runtime.drawio.Tag targetTag = tags.get(tag.getId());
			if (targetTag != null) {
				target.getTags().add(targetTag);
			}
		}
	}

	private static void attribute(org.w3c.dom.Element element, String name, String value) {
		if (value != null) {
			element.setAttribute(name, value);
		}
	}

	private static void number(org.w3c.dom.Element element, String name, double value) {
		if (value != 0) {
			element.setAttribute(name, value == Math.rint(value) ? Long.toString((long) value) : Double.toString(value));
		}
	}

}
