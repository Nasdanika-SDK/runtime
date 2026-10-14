/**
 */
package org.nasdanika.sdk.runtime.models.html;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Blockquote</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.Blockquote#getCite <em>Cite</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.sdk.runtime.models.html.HtmlPackage#getBlockquote()
 * @model
 * @generated
 */
public interface Blockquote extends Element, Container {
	/**
	 * Returns the value of the '<em><b>Cite</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cite</em>' attribute.
	 * @see #setCite(String)
	 * @see org.nasdanika.sdk.runtime.models.html.HtmlPackage#getBlockquote_Cite()
	 * @model unique="false"
	 * @generated
	 */
	String getCite();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.html.Blockquote#getCite <em>Cite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cite</em>' attribute.
	 * @see #getCite()
	 * @generated
	 */
	void setCite(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false"
	 * @generated
	 */
	String tagName();

} // Blockquote
