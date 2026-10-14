/**
 */
package org.nasdanika.sdk.runtime.models.html;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Form</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.Form#getAction <em>Action</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.Form#getMethod <em>Method</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.Form#getEnctype <em>Enctype</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.Form#getTarget <em>Target</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.Form#isNovalidate <em>Novalidate</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.sdk.runtime.models.html.HtmlPackage#getForm()
 * @model
 * @generated
 */
public interface Form extends Element, Container {
	/**
	 * Returns the value of the '<em><b>Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action</em>' attribute.
	 * @see #setAction(String)
	 * @see org.nasdanika.sdk.runtime.models.html.HtmlPackage#getForm_Action()
	 * @model unique="false"
	 * @generated
	 */
	String getAction();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.html.Form#getAction <em>Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action</em>' attribute.
	 * @see #getAction()
	 * @generated
	 */
	void setAction(String value);

	/**
	 * Returns the value of the '<em><b>Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Method</em>' attribute.
	 * @see #setMethod(String)
	 * @see org.nasdanika.sdk.runtime.models.html.HtmlPackage#getForm_Method()
	 * @model unique="false"
	 * @generated
	 */
	String getMethod();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.html.Form#getMethod <em>Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Method</em>' attribute.
	 * @see #getMethod()
	 * @generated
	 */
	void setMethod(String value);

	/**
	 * Returns the value of the '<em><b>Enctype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enctype</em>' attribute.
	 * @see #setEnctype(String)
	 * @see org.nasdanika.sdk.runtime.models.html.HtmlPackage#getForm_Enctype()
	 * @model unique="false"
	 * @generated
	 */
	String getEnctype();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.html.Form#getEnctype <em>Enctype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enctype</em>' attribute.
	 * @see #getEnctype()
	 * @generated
	 */
	void setEnctype(String value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' attribute.
	 * @see #setTarget(String)
	 * @see org.nasdanika.sdk.runtime.models.html.HtmlPackage#getForm_Target()
	 * @model unique="false"
	 * @generated
	 */
	String getTarget();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.html.Form#getTarget <em>Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' attribute.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(String value);

	/**
	 * Returns the value of the '<em><b>Novalidate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Novalidate</em>' attribute.
	 * @see #setNovalidate(boolean)
	 * @see org.nasdanika.sdk.runtime.models.html.HtmlPackage#getForm_Novalidate()
	 * @model unique="false"
	 * @generated
	 */
	boolean isNovalidate();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.html.Form#isNovalidate <em>Novalidate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Novalidate</em>' attribute.
	 * @see #isNovalidate()
	 * @generated
	 */
	void setNovalidate(boolean value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false"
	 * @generated
	 */
	String tagName();

} // Form
