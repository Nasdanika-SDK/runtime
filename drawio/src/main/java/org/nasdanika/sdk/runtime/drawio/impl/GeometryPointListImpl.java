package org.nasdanika.sdk.runtime.drawio.impl;

import java.util.AbstractList;
import java.util.List;

import org.nasdanika.sdk.runtime.drawio.Point;
import org.nasdanika.sdk.runtime.drawio.PointList;
import org.w3c.dom.Element;

/**
 * Points list which supports remove operation, but not add or set. 
 * Although it supports add(int index, double x, double y) and add(double x, double y) operations.
 */
class GeometryPointListImpl extends AbstractList<Point> implements PointList {
	
	private static final String MX_POINT_ELEMENT = "mxPoint";
	
	private GeometryImpl geometry;

	GeometryPointListImpl(GeometryImpl geometry) {
		this.geometry = geometry;
	}

	/**
	 * Points of the geometry, none if the element has no geometry yet.
	 */
	private List<Element> points() {
		Element geometryElement = geometry.getElement();
		return geometryElement == null ? List.of() : DocumentImpl.getChildrenElements(geometryElement, MX_POINT_ELEMENT);
	}

	@Override
	public int size() {
		return points().size();		
	}

	@Override
	public Point get(int index) {
		List<Element> points = points();
		if (index < 0 || index >= points.size()) {
			throw new ArrayIndexOutOfBoundsException(index);			
		}
		return new PointImpl(create -> points.get(index));
	}	
	
	@Override
	public Point remove(int index) {
		List<Element> points = points();
		if (index >= points.size()) {
			throw new ArrayIndexOutOfBoundsException(index);			
		}
		
		Element pointElement = points.get(index);
		geometry.getElement().removeChild(pointElement);
		
		return new PointImpl(create -> pointElement);
	}	
	
	@Override
	public Point set(int index, Point element) {
		List<Element> points = points();
		if (index >= points.size()) {
			throw new ArrayIndexOutOfBoundsException(index);			
		}
		Element pointElement = ((PointImpl) element).elementProvider.apply(false);
		Element refPointElement = points.get(index);
		if (refPointElement == pointElement) {
			return element;
		}
		geometry.getElement().insertBefore(pointElement, refPointElement);
		return new PointImpl(create -> refPointElement);
	}
	
	@Override
	public Point add(int index) {
		List<Element> points = points();
		if (index > points.size()) {
			throw new ArrayIndexOutOfBoundsException(index);			
		}
		
		Element geometryElement = geometry.elementProvider.apply(true); // Creates the geometry if there is none
		Element pointElement = geometryElement.getOwnerDocument().createElement(MX_POINT_ELEMENT);
		if (index == points.size()) {
			geometryElement.appendChild(pointElement);
		} else {
			Element refPointElement = points.get(index);
			geometryElement.insertBefore(pointElement, refPointElement);
		}
		
		return new PointImpl(create -> pointElement);
	}

}
