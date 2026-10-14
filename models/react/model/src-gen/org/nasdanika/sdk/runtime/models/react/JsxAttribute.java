/**
 */
package org.nasdanika.sdk.runtime.models.react;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Jsx Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 *  ---------------------------------------------------------------------------
 * Attributes
 * ---------------------------------------------------------------------------
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.JsxAttribute#getAttributeName <em>Attribute Name</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.sdk.runtime.models.react.ReactPackage#getJsxAttribute()
 * @model abstract="true"
 * @generated
 */
public interface JsxAttribute extends ReactElement {
	/**
	 * Returns the value of the '<em><b>Attribute Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  JSX attribute name: className, htmlFor, value, onClick, data-bs-theme.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Attribute Name</em>' attribute.
	 * @see #setAttributeName(String)
	 * @see org.nasdanika.sdk.runtime.models.react.ReactPackage#getJsxAttribute_AttributeName()
	 * @model unique="false"
	 * @generated
	 */
	String getAttributeName();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.react.JsxAttribute#getAttributeName <em>Attribute Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute Name</em>' attribute.
	 * @see #getAttributeName()
	 * @generated
	 */
	void setAttributeName(String value);

} // JsxAttribute
