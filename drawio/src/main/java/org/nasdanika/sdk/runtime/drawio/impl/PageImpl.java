package org.nasdanika.sdk.runtime.drawio.impl;

import java.io.IOException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;

import org.eclipse.emf.common.util.URI;
import org.nasdanika.sdk.runtime.drawio.ConnectionBase;
import org.nasdanika.sdk.runtime.drawio.Document;
import org.nasdanika.sdk.runtime.drawio.Document.Context;
import org.nasdanika.sdk.runtime.drawio.Element;
import org.nasdanika.sdk.runtime.drawio.Model;
import org.nasdanika.sdk.runtime.drawio.ModelElement;
import org.nasdanika.sdk.runtime.drawio.Page;
import org.xml.sax.SAXException;

class PageImpl extends ElementImpl<Page> implements Page {
	
	static final String ATTRIBUTE_NAME = "name";
	private ModelImpl model;
	private Document document;
	private int position;
	private Context context;
	
	PageImpl(
			Document document, 
			org.w3c.dom.Element element, 
			int position,
			Context context) throws IOException, ParserConfigurationException, SAXException {
		this.document = document;
		this.element = element;
		this.position = position;
		this.context = context;
		List<org.w3c.dom.Element> modelElements = DocumentImpl.getChildrenElements(element, "mxGraphModel");
		if (modelElements.isEmpty()) {
			model = new ModelImpl(this, element.getTextContent(), context);
		} else if (modelElements.size() == 1) {
			model = new ModelImpl(this, modelElements.get(0), context);
		} else {
			throw new IllegalArgumentException("Expected one model element, got " + modelElements.size());
		}
	}
	
	@Override
	public Document getDocument() {
		return document;
	}
	
	@Override
	public <T> T accept(BiFunction<Element<?>, Map<Element<?>, T>, T> visitor, ConnectionBase connectionBase) {
		Map<org.nasdanika.sdk.runtime.drawio.Element<?>, T> childResults = new LinkedHashMap<>();
		if (model != null) {
			childResults.put(model, model.accept(visitor, connectionBase));
		}
		return visitor.apply(this, childResults);
	}

	@Override
	public Model getModel() {
		return model;
	}

	@Override
	public String getName() {
		return element.getAttribute(ATTRIBUTE_NAME);
	}

	@Override
	public void setName(String name) {
		element.setAttribute(ATTRIBUTE_NAME, name);
	}
	
	/**
	 * Saves as compressed if there are no mxGraphModel child elements.
	 * @throws TransformerException
	 * @throws IOException
	 */
	void save() throws TransformerException, IOException {
		save(DocumentImpl.getChildrenElements(element, "mxGraphModel").isEmpty());
	}

	/**
	 * Saves any modifications. Doesn't do anything of compress null and uncompressed documents.
	 * For compressed documents replaces texts with compressed model string
	 * @param compress
	 * @throws TransformerException 
	 */
	void save(Boolean compress) throws TransformerException, IOException {		
		if (model.getElement().getParentNode() == element) {
			// Uncompressed - no action is required is keeping it uncompressed
			if (compress != null && compress) {				
				// Saving uncompressed model as compressed				
				element.removeChild(model.getElement());
				element.setTextContent(model.compress());			    
			}						
		} else {
			// Compressed
			if (compress == null || compress) {
				element.setTextContent(model.compress());			    
			} else {
				element.setTextContent("");
				org.w3c.dom.Element modelElement = model.getElement();
				if (modelElement.getOwnerDocument() != element.getOwnerDocument()) {
					modelElement = (org.w3c.dom.Element) element.getOwnerDocument().importNode(modelElement, true);
					element.appendChild(modelElement);
					model = new ModelImpl(this, modelElement, context);
				}
			}			
		}		
	}	
	
	@Override
	public String getId() {
		return element.hasAttribute(ATTRIBUTE_ID) ? element.getAttribute(ATTRIBUTE_ID) : null;
	}

	@Override
	public void setId(String id) {
		element.setAttribute(ATTRIBUTE_ID, id);
	}
	
	@Override
	public URI getURI() {
		URI documentURI = getDocument().getURI();
		return documentURI == null ? URI.createURI(getId()) : documentURI.appendFragment(URLEncoder.encode(getName(), StandardCharsets.UTF_8));
	}
		
	@Override
	public String toString() {
		return super.toString() + " " + getName();
	}
	
	@Override
	protected String getMarkerPosition() {
		return "name: " + getName() + ", id: " + getId();
	}	
	
	@Override
	protected String getMarkerLocation() {
		return ((DocumentImpl) getDocument()).getMarkerLocation();
	}

	@Override
	public Map<String, org.nasdanika.sdk.runtime.drawio.Tag> getTags() {
		Map<String, org.nasdanika.sdk.runtime.drawio.Tag> ret = new HashMap<>();
		accept(e -> {
			if (e instanceof ModelElement) {
				ModelElement<?> modelElement = (ModelElement<?>) e;
				for (org.nasdanika.sdk.runtime.drawio.Tag tag: modelElement.getTags()) {
					ret.put(tag.getName(), tag);
				}
			}
		}, null);
		return ret;
	}

	@Override
	public org.nasdanika.sdk.runtime.drawio.Tag createTag(String name) {
		return new TagImpl(name, this);
	}

	@Override
	public int getPosition() {
		return position;
	}
	
	@Override
	public void remove() {
		org.w3c.dom.Element toRemove = getElement();
		toRemove.getParentNode().removeChild(toRemove);
	}

}
