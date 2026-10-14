/**
 */
package org.nasdanika.sdk.runtime.models.html;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Label</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.Label#getHtmlFor <em>Html For</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.sdk.runtime.models.html.HtmlPackage#getLabel()
 * @model
 * @generated
 */
public interface Label extends Element, Container {
	/**
	 * Returns the value of the '<em><b>Html For</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Id of the labeled control
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Html For</em>' attribute.
	 * @see #setHtmlFor(String)
	 * @see org.nasdanika.sdk.runtime.models.html.HtmlPackage#getLabel_HtmlFor()
	 * @model unique="false"
	 *        annotation="urn:org.nasdanika:html attribute='for'"
	 * @generated
	 */
	String getHtmlFor();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.html.Label#getHtmlFor <em>Html For</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Html For</em>' attribute.
	 * @see #getHtmlFor()
	 * @generated
	 */
	void setHtmlFor(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false"
	 * @generated
	 */
	String tagName();

} // Label
