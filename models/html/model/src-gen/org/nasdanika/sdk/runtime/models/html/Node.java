/**
 */
package org.nasdanika.sdk.runtime.models.html;

import org.nasdanika.sdk.runtime.models.core.Marked;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Anything that can be placed into a Container: elements, text, raw markup, comments.
 * Other models (e.g. React) extend Node to put their own kinds of content, such as
 * expressions and component instances, into HTML containers.
 * Markers are the provenance join back to the source model element.
 * <!-- end-model-doc -->
 *
 *
 * @see org.nasdanika.sdk.runtime.models.html.HtmlPackage#getNode()
 * @model abstract="true"
 * @generated
 */
public interface Node extends Marked {
} // Node
