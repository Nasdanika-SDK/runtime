package org.example.generics;

import java.lang.reflect.Type;
import java.util.function.Supplier;

import org.example.generics.Catalogs.Shelf;
import org.nasdanika.sdk.runtime.common.Adaptable;
import org.nasdanika.sdk.runtime.common.Adapter;

// tag::reserve[]
/**
 * Adaptation that annotations cannot express goes into an override, which falls back
 * to the declarations.
 */
public class Reserve implements Adaptable {

	@Adapter
	private final Supplier<Shelf> shelves = Catalogs.OakShelf::new;

	@Override
	public <T> T adaptTo(Type type, Object... context) {
		if (type == String.class && context.length == 1
				&& context[0] instanceof Integer floor) {
			@SuppressWarnings("unchecked")
			T location = (T) ("Reserve, floor " + floor); // Computed, not declared
			return location;
		}
		return Adaptable.super.adaptTo(type, context);   // The declared adapters
	}

}
// end::reserve[]
