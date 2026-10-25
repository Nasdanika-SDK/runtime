/**
 */
package org.nasdanika.sdk.runtime.models.drawio;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Toggle Style</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Flip a style key between its current value and a default -
 * {"toggleStyle": {"key": "fillColor", "defaultValue": "none"}}.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.drawio.ToggleStyle#getKey <em>Key</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.drawio.ToggleStyle#getDefaultValue <em>Default Value</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.sdk.runtime.models.drawio.DrawioPackage#getToggleStyle()
 * @model
 * @generated
 */
public interface ToggleStyle extends PersistableAction {
	/**
	 * Returns the value of the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key</em>' attribute.
	 * @see #setKey(String)
	 * @see org.nasdanika.sdk.runtime.models.drawio.DrawioPackage#getToggleStyle_Key()
	 * @model unique="false"
	 * @generated
	 */
	String getKey();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.drawio.ToggleStyle#getKey <em>Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key</em>' attribute.
	 * @see #getKey()
	 * @generated
	 */
	void setKey(String value);

	/**
	 * Returns the value of the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Value</em>' attribute.
	 * @see #setDefaultValue(String)
	 * @see org.nasdanika.sdk.runtime.models.drawio.DrawioPackage#getToggleStyle_DefaultValue()
	 * @model unique="false"
	 * @generated
	 */
	String getDefaultValue();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.drawio.ToggleStyle#getDefaultValue <em>Default Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value</em>' attribute.
	 * @see #getDefaultValue()
	 * @generated
	 */
	void setDefaultValue(String value);

} // ToggleStyle
