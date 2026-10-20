package org.nasdanika.sdk.runtime.drawio;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.stream.Stream;

import org.eclipse.emf.common.util.URI;

/**
 * {@link Document} element, including the Document itself, backed by {@link org.w3c.dom.Element}.
 * @author Pavel
 *
 */
public interface Element<E extends Element<E>> {
	
	Marker getMarker();	
	
	URI getURI();
	
	/**
	 * @return The underlying XML element.
	 */
	org.w3c.dom.Element getElement();
	
	/**
	 * Accepts the visitor in children first (bottom-up) way.
	 * @param visitor
	 */
	default void accept(Consumer<? super Element<?>> visitor, ConnectionBase connectionBase) {
		accept((e, _) -> { visitor.accept(e); return null; }, connectionBase);
	}
	
	/**
	 * Accepts a result producing visitor {@link BiFunction}. Passes to it a map of results collected from children, nulls are not included.   
	 * @param <T>
	 * @param visitor
	 * @return result returned by the visitor.
	 */
	<T> T accept(BiFunction<Element<?>, Map<Element<?>, T>, T> visitor, ConnectionBase connectionBase);
		
	default <T> T accept(BiFunction<? super Element<?>, Map<? extends Element<?>, T>, T> visitor) {
		BiFunction<Element<?>, Map<Element<?>, T>, T> visitorAdapter = (element, childMappings) -> {
			return visitor.apply(element, childMappings);
		};
		return accept(visitorAdapter, ConnectionBase.PARENT);
	}
	
	/**
	 * @return Stream containing this element and its children.
	 */
	default Stream<Element<?>> stream() {
		BiFunction<Element<?>, Map<? extends Element<?>, Stream<Element<?>>>, Stream<Element<?>>> visitor = (element, childMappings) -> {
			return childMappings.values().stream().reduce(Stream.of(element), (a,b) -> Stream.concat(a, b));
		};
		return accept(visitor);
	}; 
		
	/**
	 * @return Stream containing this element and its children.
	 */
	default Stream<Element<?>> stream(ConnectionBase connectionBase) {
		BiFunction<Element<?>, Map<Element<?>, Stream<Element<?>>>, Stream<Element<?>>> visitor = (element, childMappings) -> {
			return childMappings.values().stream().reduce(Stream.of(element), (a,b) -> Stream.concat(a, b));
		};
		return accept(visitor, connectionBase);
	}; 
		
	default ModelElement<?> getModelElementById(String modelElementId) {
		if (org.nasdanika.sdk.runtime.common.Util.isBlank(modelElementId)) {
			return null;
		}
		return stream()
			.filter(ModelElement.class::isInstance)
			.map(ModelElement.class::cast)
			.filter(me -> modelElementId.equals(me.getId()))
			.findFirst()
			.orElse(null);
	}
	
	default ModelElement<?> getModelElementByProperty(String name, String value) {
		if (org.nasdanika.sdk.runtime.common.Util.isBlank(name) || org.nasdanika.sdk.runtime.common.Util.isBlank(value)) {
			return null;
		}
		return stream()
			.filter(ModelElement.class::isInstance)
			.map(ModelElement.class::cast)
			.filter(me -> value.equals(me.getProperty(name)))
			.findFirst()
			.orElse(null);
	}
	
	@SuppressWarnings("unchecked")
	default <ME extends ModelElement<ME>> List<ME> getModelElementsByProperty(String name, String value) {
		if (org.nasdanika.sdk.runtime.common.Util.isBlank(name) || org.nasdanika.sdk.runtime.common.Util.isBlank(value)) {
			return Collections.emptyList();
		}
		return stream()
			.filter(ModelElement.class::isInstance)
			.map(ModelElement.class::cast)
			.map(me -> (ME) me)
			.filter(me -> value.equals(me.getProperty(name)))
			.toList();
	}		

}
