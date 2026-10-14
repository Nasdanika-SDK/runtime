/**
 */
package org.nasdanika.sdk.runtime.models.react;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Library Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 *  ---------------------------------------------------------------------------
 * Component libraries
 * ---------------------------------------------------------------------------
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.LibraryComponent#getAttributes <em>Attributes</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.sdk.runtime.models.react.ReactPackage#getLibraryComponent()
 * @model abstract="true"
 * @generated
 */
public interface LibraryComponent extends JsxContainer {
	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.sdk.runtime.models.react.JsxAttribute}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes</em>' containment reference list.
	 * @see org.nasdanika.sdk.runtime.models.react.ReactPackage#getLibraryComponent_Attributes()
	 * @model containment="true"
	 * @generated
	 */
	EList<JsxAttribute> getAttributes();

} // LibraryComponent
