/**
 */
package org.nasdanika.sdk.runtime.models.react;

import org.nasdanika.sdk.runtime.models.typescript.TypeScriptElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Base of everything React specific. Extends the TypeScript base so the whole code
 * family shares one root: name, documentation-as-structure, and nested markers from
 * nxcore. The markers are the provenance join back to the ui elements a drawing
 * produced, and through them to owners and work.
 * <!-- end-model-doc -->
 *
 *
 * @see org.nasdanika.sdk.runtime.models.react.ReactPackage#getReactElement()
 * @model abstract="true"
 * @generated
 */
public interface ReactElement extends TypeScriptElement {
} // ReactElement
