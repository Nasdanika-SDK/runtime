package org.nasdanika.sdk.runtime.common;

/**
 * Something that can be adapted to a different type.  Can be used to access contextual information.
 * @author Pavel
 *
 */
public interface Adaptable {
	
	/**
	 * Adapts to requested type.
	 * @param type Type to adapt to.
	 * @return Instance of the type or null.
	 */
	default <T> T adaptTo(Class<T> type) {
		return type.isInstance(this) ? type.cast(this) : null;
	}
	
	/**
	 * Adapts source to requested type.
	 * @param source Source object.
	 * @param type Type to adapt to.
	 * @return Instance of the type or null.
	 */
	static <T> T adaptTo(Object source, Class<T> type) {
		if (source == null) {
			return null;
		}
		if (type.isInstance(source)) {
			return type.cast(source);
		}
		if (source instanceof Adaptable adaptable) {
			return adaptable.adaptTo(type);
		}
		return null;
	}

}
