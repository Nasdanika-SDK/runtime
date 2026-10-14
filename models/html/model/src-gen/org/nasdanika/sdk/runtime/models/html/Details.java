/**
 */
package org.nasdanika.sdk.runtime.models.html;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Details</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.Details#isOpen <em>Open</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.Details#getSummary <em>Summary</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.sdk.runtime.models.html.HtmlPackage#getDetails()
 * @model
 * @generated
 */
public interface Details extends Element, Container {
	/**
	 * Returns the value of the '<em><b>Open</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Open</em>' attribute.
	 * @see #setOpen(boolean)
	 * @see org.nasdanika.sdk.runtime.models.html.HtmlPackage#getDetails_Open()
	 * @model unique="false"
	 * @generated
	 */
	boolean isOpen();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.html.Details#isOpen <em>Open</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Open</em>' attribute.
	 * @see #isOpen()
	 * @generated
	 */
	void setOpen(boolean value);

	/**
	 * Returns the value of the '<em><b>Summary</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Rendered before contents
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Summary</em>' containment reference.
	 * @see #setSummary(Summary)
	 * @see org.nasdanika.sdk.runtime.models.html.HtmlPackage#getDetails_Summary()
	 * @model containment="true"
	 * @generated
	 */
	Summary getSummary();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.html.Details#getSummary <em>Summary</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Summary</em>' containment reference.
	 * @see #getSummary()
	 * @generated
	 */
	void setSummary(Summary value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false"
	 * @generated
	 */
	String tagName();

} // Details
