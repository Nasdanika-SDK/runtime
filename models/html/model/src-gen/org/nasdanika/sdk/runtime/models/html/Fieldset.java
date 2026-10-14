/**
 */
package org.nasdanika.sdk.runtime.models.html;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fieldset</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.Fieldset#isDisabled <em>Disabled</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.Fieldset#getLegend <em>Legend</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.sdk.runtime.models.html.HtmlPackage#getFieldset()
 * @model
 * @generated
 */
public interface Fieldset extends Element, Container {
	/**
	 * Returns the value of the '<em><b>Disabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Disabled</em>' attribute.
	 * @see #setDisabled(boolean)
	 * @see org.nasdanika.sdk.runtime.models.html.HtmlPackage#getFieldset_Disabled()
	 * @model unique="false"
	 * @generated
	 */
	boolean isDisabled();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.html.Fieldset#isDisabled <em>Disabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Disabled</em>' attribute.
	 * @see #isDisabled()
	 * @generated
	 */
	void setDisabled(boolean value);

	/**
	 * Returns the value of the '<em><b>Legend</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Rendered before contents
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Legend</em>' containment reference.
	 * @see #setLegend(Legend)
	 * @see org.nasdanika.sdk.runtime.models.html.HtmlPackage#getFieldset_Legend()
	 * @model containment="true"
	 * @generated
	 */
	Legend getLegend();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.html.Fieldset#getLegend <em>Legend</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Legend</em>' containment reference.
	 * @see #getLegend()
	 * @generated
	 */
	void setLegend(Legend value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false"
	 * @generated
	 */
	String tagName();

} // Fieldset
