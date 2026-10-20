package org.nasdanika.sdk.runtime.drawio.impl;

import java.util.List;
import java.util.UUID;

import org.nasdanika.sdk.runtime.drawio.Connectable;
import org.nasdanika.sdk.runtime.drawio.Connection;
import org.nasdanika.sdk.runtime.drawio.Document.Context;
import org.nasdanika.sdk.runtime.drawio.Layer;
import org.nasdanika.sdk.runtime.drawio.LayerElement;
import org.nasdanika.sdk.runtime.drawio.Node;
import org.w3c.dom.Element;

class LayerImpl<L extends Layer<L>> extends ModelElementImpl<L> implements Layer<L> {

	LayerImpl(
			Element element, 
			ModelImpl model, 
			int position,
			Context context) {
		super(element, model, position, context);
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public List<LayerElement<?>> getChildren() {
		return (List) super.getChildren();
	}

	@Override
	public Node createNode() {
		Element nodeElement = element.getOwnerDocument().createElement(MX_CELL_ELEMENT);
		nodeElement.setAttribute(ATTRIBUTE_ID, UUID.randomUUID().toString());
		nodeElement.setAttribute(ATTRIBUTE_PARENT, element.getAttribute(ATTRIBUTE_ID));
		nodeElement.setAttribute(ModelImpl.ATTRIBUTE_VERTEX, "1");
		element.getParentNode().appendChild(nodeElement);
		List<LayerElement<?>> elements = getElements();
		return (Node) elements.get(elements.size() - 1);
	}

	@Override
	public Connection createConnection(Connectable source, Connectable target) {
		Element connectionElement = element.getOwnerDocument().createElement(MX_CELL_ELEMENT);
		connectionElement.setAttribute(ATTRIBUTE_ID, UUID.randomUUID().toString());
		connectionElement.setAttribute(ATTRIBUTE_PARENT, element.getAttribute(ATTRIBUTE_ID));
		connectionElement.setAttribute(ModelImpl.ATTRIBUTE_EDGE, "1");
		
		Element geometryElement = element.getOwnerDocument().createElement("mxGeometry");
		connectionElement.appendChild(geometryElement);
		geometryElement.setAttribute("relative", "1");
		geometryElement.setAttribute("as", "geometry");
		
		element.getParentNode().appendChild(connectionElement);
		List<LayerElement<?>> elements = getElements();
		Connection connection = (Connection) elements.get(elements.size() - 1);
		connection.setSource(source);
		connection.setTarget(target);
		return connection;
	}

	@Override
	public List<LayerElement<?>> getElements() {
		return getChildren();
	}
		
}
