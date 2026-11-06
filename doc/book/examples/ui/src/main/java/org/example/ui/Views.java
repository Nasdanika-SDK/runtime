package org.example.ui;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.nasdanika.sdk.runtime.common.Util;
import org.nasdanika.sdk.runtime.common.capability.CapabilityLoader;
import org.nasdanika.sdk.runtime.models.html.Node;

// tag::views[]
/**
 * Renders model elements polymorphically: with the view of an element's class, or of its
 * nearest superclass that has one, or with the reflective view of last resort.
 */
public class Views {

	private final CapabilityLoader loader;
	private final Map<EClass, Optional<View<?>>> resolved = new HashMap<>();

	public Views(CapabilityLoader loader) {
		this.loader = loader;
	}

	public Node render(EObject element) {
		for (EClass eClass: Util.lineage(element.eClass())) {                   // <1>
			Optional<View<?>> view = resolved.computeIfAbsent(                  // <2>
					eClass,
					key -> Optional.ofNullable(loader.<View<?>>loadOne(new ViewOf(key))));
			if (view.isPresent()) {
				return view.get().apply(element, this);                         // <3>
			}
		}
		return Properties.render(element, this);                               // <4>
	}

}
// end::views[]
