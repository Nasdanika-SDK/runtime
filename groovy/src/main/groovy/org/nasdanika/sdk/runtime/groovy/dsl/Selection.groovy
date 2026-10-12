package org.nasdanika.sdk.runtime.groovy.dsl

import org.eclipse.emf.ecore.EClassifier

/**
 * A classifier selected for a name, and the classifiers it superseded. A match is superseded when
 * another match for the same name is more specific: a refinement model's {@code ModelElement}, which
 * extends the core {@code ModelElement}, supersedes it when a script is loaded at the refinement's
 * level. See {@link DslContext.Resolver#selectClass(org.eclipse.emf.ecore.EObject, String)}.
 *
 * @param selected the selected classifier
 * @param superseded the less specific matches, empty when there were none
 */
record Selection<T extends EClassifier>(T selected, List<T> superseded) {

}
