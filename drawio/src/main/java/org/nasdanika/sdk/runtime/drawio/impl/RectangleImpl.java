package org.nasdanika.sdk.runtime.drawio.impl;

import java.util.function.Function;

import org.nasdanika.sdk.runtime.drawio.Rectangle;
import org.w3c.dom.Element;

public class RectangleImpl extends PointImpl implements Rectangle {
	
	public RectangleImpl(Function<Boolean, Element> elementProvider) {
		super(elementProvider);
	}

	static final String ATTRIBUTE_WIDTH = "width"; 
	static final String ATTRIBUTE_HEIGHT = "height";
		
	/**
	 * An element is empty, and can be removed, when nothing but its role is left: no attributes
	 * other than "as", such as "relative", and no children, such as points.
	 */
	protected boolean isEmpty(Element element) {
		org.w3c.dom.NamedNodeMap attributes = element.getAttributes();
		for (int i = 0; i < attributes.getLength(); ++i) {
			if (!ATTRIBUTE_AS.equals(attributes.item(i).getNodeName())) {
				return false;
			}
		}
		org.w3c.dom.NodeList children = element.getChildNodes();
		for (int i = 0; i < children.getLength(); ++i) {
			if (children.item(i) instanceof Element) {
				return false;
			}
		}
		return true;
	}
			
	@Override
	public double getWidth() {
		Element element = getElement();
		return element != null && element.hasAttribute(ATTRIBUTE_WIDTH) ? Double.parseDouble(element.getAttribute(ATTRIBUTE_WIDTH)) : 0;
	}

	@Override
	public double getHeight() {
		Element element = getElement();
		return element != null && element.hasAttribute(ATTRIBUTE_HEIGHT) ? Double.parseDouble(element.getAttribute(ATTRIBUTE_HEIGHT)) : 0;
	}

	@Override
	public void setWidth(double width) {
		Element element = elementProvider.apply(true);
		if (width == 0) {
			element.removeAttribute(ATTRIBUTE_WIDTH);
			if (isEmpty(element)) {
				element.getParentNode().removeChild(element);
			}
		} else {
			element.setAttribute(ATTRIBUTE_WIDTH, String.valueOf(width));
		}
	}

	@Override
	public void setHeight(double height) {
		Element element = elementProvider.apply(true);
		if (height == 0) {
			element.removeAttribute(ATTRIBUTE_HEIGHT);
			if (isEmpty(element)) {
				element.getParentNode().removeChild(element);
			}
		} else {
			element.setAttribute(ATTRIBUTE_HEIGHT, String.valueOf(height));
		}
	}

	@Override
	public void setBounds(double x, double y, double width, double height) {
		Element element = elementProvider.apply(true);
		if (x == 0) {
			element.removeAttribute(ATTRIBUTE_X);
		} else {
			element.setAttribute(ATTRIBUTE_X, String.valueOf(x));
		}
		if (y == 0) {
			element.removeAttribute(ATTRIBUTE_Y);
		} else {
			element.setAttribute(ATTRIBUTE_Y, String.valueOf(y));
		}
		if (width == 0) {
			element.removeAttribute(ATTRIBUTE_WIDTH);
		} else {
			element.setAttribute(ATTRIBUTE_WIDTH, String.valueOf(width));
		}
		if (height == 0) {
			element.removeAttribute(ATTRIBUTE_HEIGHT);
		} else {
			element.setAttribute(ATTRIBUTE_HEIGHT, String.valueOf(height));
		}
		
		if (isEmpty(element)) {
			element.getParentNode().removeChild(element);
		}		
	}
	
	@Override
	public String toString() {
		return super.toString() + "[" + getWidth() + ", " + getHeight() + "]";
	}
	
}