package org.nasdanika.sdk.runtime.drawio.impl;

import java.util.Objects;

import org.nasdanika.sdk.runtime.drawio.Element;
import org.nasdanika.sdk.runtime.drawio.Marker;

abstract class ElementImpl<E extends Element<E>> implements Element<E> {
	
	static final String ATTRIBUTE_ID = "id";
	
	protected org.w3c.dom.Element element; 

	@Override
	public org.w3c.dom.Element getElement() {
		return element;
	}

//	@Override
//	public <T> T accept(BiFunction<Element<?>, Map<Element<?>, T>, T> visitor, ConnectionBase connectionBase) {
//		Map<org.nasdanika.sdk.runtime.drawio.Element<?>, T> childResults = new LinkedHashMap<>();
//		for (Element<?> child: getLogicalChildren(connectionBase)) {
//			if (child != null) {
//				childResults.put(child, child.accept(visitor, connectionBase));
//			}
//		}
//		return visitor.apply(this, childResults);
//	}
	
//	protected List<? extends Element<?>> getLogicalChildren(ConnectionBase connectionBase) {
//		if (connectionBase == null || connectionBase == ConnectionBase.PARENT) {
//			return getChildren();
//		}
//		
//		Predicate<Element<?>> isConnection = Connection.class::isInstance;
//		return getChildren().stream().filter(isConnection.negate()).toList();
//	}
	
	@Override
	public int hashCode() {
		if (element == null) {
			return super.hashCode();
		}
		int hc = element.hasAttribute(ATTRIBUTE_ID) ? element.getAttribute(ATTRIBUTE_ID).hashCode() : element.hashCode();  
		return hc ^ getClass().hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ElementImpl<?> other = (ElementImpl<?>) obj;
		
		if (element == other.element) {
			return true;
		}
		
		if (element == null || other.element == null) {
			return super.equals(obj);
		}
		
		if (element.hasAttribute(ATTRIBUTE_ID) && other.element.hasAttribute(ATTRIBUTE_ID)) {
			return Objects.equals(element.getAttribute(ATTRIBUTE_ID), other.element.getAttribute(ATTRIBUTE_ID));			
		}

		return false;
	}
	
	@Override
	public Marker getMarker() {
		String markerLocation = getMarkerLocation();
		String markerPosition = getMarkerPosition();
		if (org.nasdanika.sdk.runtime.common.Util.isBlank(markerLocation) && org.nasdanika.sdk.runtime.common.Util.isBlank(markerPosition)) {
			return null;
		}
		return new MarkerImpl(markerLocation, markerPosition);
	}
		
	protected String getMarkerPosition() {
		return null;
	}	
	
	protected String getMarkerLocation() {
		return null;
	}
	
}
