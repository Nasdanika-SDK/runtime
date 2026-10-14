/**
 */
package org.nasdanika.sdk.runtime.models.html;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Document</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Page - html element preceded by the doctype.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.Document#getDoctype <em>Doctype</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.Document#getLang <em>Lang</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.Document#getHead <em>Head</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.Document#getBody <em>Body</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.sdk.runtime.models.html.HtmlPackage#getDocument()
 * @model
 * @generated
 */
public interface Document extends Element {
	/**
	 * Returns the value of the '<em><b>Doctype</b></em>' attribute.
	 * The default value is <code>"html"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Doctype</em>' attribute.
	 * @see #setDoctype(String)
	 * @see org.nasdanika.sdk.runtime.models.html.HtmlPackage#getDocument_Doctype()
	 * @model default="html" unique="false"
	 *        annotation="urn:org.nasdanika:html logical='true'"
	 * @generated
	 */
	String getDoctype();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.html.Document#getDoctype <em>Doctype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Doctype</em>' attribute.
	 * @see #getDoctype()
	 * @generated
	 */
	void setDoctype(String value);

	/**
	 * Returns the value of the '<em><b>Lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lang</em>' attribute.
	 * @see #setLang(String)
	 * @see org.nasdanika.sdk.runtime.models.html.HtmlPackage#getDocument_Lang()
	 * @model unique="false"
	 * @generated
	 */
	String getLang();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.html.Document#getLang <em>Lang</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lang</em>' attribute.
	 * @see #getLang()
	 * @generated
	 */
	void setLang(String value);

	/**
	 * Returns the value of the '<em><b>Head</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Head</em>' containment reference.
	 * @see #setHead(Head)
	 * @see org.nasdanika.sdk.runtime.models.html.HtmlPackage#getDocument_Head()
	 * @model containment="true"
	 * @generated
	 */
	Head getHead();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.html.Document#getHead <em>Head</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Head</em>' containment reference.
	 * @see #getHead()
	 * @generated
	 */
	void setHead(Head value);

	/**
	 * Returns the value of the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body</em>' containment reference.
	 * @see #setBody(Body)
	 * @see org.nasdanika.sdk.runtime.models.html.HtmlPackage#getDocument_Body()
	 * @model containment="true"
	 * @generated
	 */
	Body getBody();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.html.Document#getBody <em>Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body</em>' containment reference.
	 * @see #getBody()
	 * @generated
	 */
	void setBody(Body value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false"
	 * @generated
	 */
	String tagName();

} // Document
