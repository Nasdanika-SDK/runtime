/**
 */
package org.nasdanika.sdk.runtime.models.react.flow;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pro Options</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.flow.ProOptions#isHideAttribution <em>Hide Attribution</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.sdk.runtime.models.react.flow.FlowPackage#getProOptions()
 * @model
 * @generated
 */
public interface ProOptions extends EObject {
	/**
	 * Returns the value of the '<em><b>Hide Attribution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hide Attribution</em>' attribute.
	 * @see #setHideAttribution(boolean)
	 * @see org.nasdanika.sdk.runtime.models.react.flow.FlowPackage#getProOptions_HideAttribution()
	 * @model unique="false"
	 * @generated
	 */
	boolean isHideAttribution();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.react.flow.ProOptions#isHideAttribution <em>Hide Attribution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hide Attribution</em>' attribute.
	 * @see #isHideAttribution()
	 * @generated
	 */
	void setHideAttribution(boolean value);

} // ProOptions
