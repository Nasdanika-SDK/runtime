package org.example.ui;

import org.eclipse.emf.ecore.EClass;

// tag::view-of[]
/**
 * A requirement for the view of exactly one class. Factories answer it only for their own
 * class, so a resolver can ask from the most specific class to the most general, and the
 * first answer is the most specific view.
 */
public record ViewOf(EClass eClass) {
}
// end::view-of[]
