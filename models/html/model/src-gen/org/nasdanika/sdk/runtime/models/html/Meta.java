/**
 */
package org.nasdanika.sdk.runtime.models.html;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Meta</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.Meta#getName <em>Name</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.Meta#getHttpEquiv <em>Http Equiv</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.Meta#getProperty <em>Property</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.Meta#getContent <em>Content</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.Meta#getCharset <em>Charset</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.sdk.runtime.models.html.HtmlPackage#getMeta()
 * @model
 * @generated
 */
public interface Meta extends VoidElement {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.nasdanika.sdk.runtime.models.html.HtmlPackage#getMeta_Name()
	 * @model unique="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.html.Meta#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Http Equiv</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Http Equiv</em>' attribute.
	 * @see #setHttpEquiv(String)
	 * @see org.nasdanika.sdk.runtime.models.html.HtmlPackage#getMeta_HttpEquiv()
	 * @model unique="false"
	 *        annotation="urn:org.nasdanika:html attribute='http-equiv'"
	 * @generated
	 */
	String getHttpEquiv();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.html.Meta#getHttpEquiv <em>Http Equiv</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Http Equiv</em>' attribute.
	 * @see #getHttpEquiv()
	 * @generated
	 */
	void setHttpEquiv(String value);

	/**
	 * Returns the value of the '<em><b>Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property</em>' attribute.
	 * @see #setProperty(String)
	 * @see org.nasdanika.sdk.runtime.models.html.HtmlPackage#getMeta_Property()
	 * @model unique="false"
	 * @generated
	 */
	String getProperty();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.html.Meta#getProperty <em>Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property</em>' attribute.
	 * @see #getProperty()
	 * @generated
	 */
	void setProperty(String value);

	/**
	 * Returns the value of the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content</em>' attribute.
	 * @see #setContent(String)
	 * @see org.nasdanika.sdk.runtime.models.html.HtmlPackage#getMeta_Content()
	 * @model unique="false"
	 * @generated
	 */
	String getContent();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.html.Meta#getContent <em>Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content</em>' attribute.
	 * @see #getContent()
	 * @generated
	 */
	void setContent(String value);

	/**
	 * Returns the value of the '<em><b>Charset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Charset</em>' attribute.
	 * @see #setCharset(String)
	 * @see org.nasdanika.sdk.runtime.models.html.HtmlPackage#getMeta_Charset()
	 * @model unique="false"
	 * @generated
	 */
	String getCharset();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.html.Meta#getCharset <em>Charset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Charset</em>' attribute.
	 * @see #getCharset()
	 * @generated
	 */
	void setCharset(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false"
	 * @generated
	 */
	String tagName();

} // Meta
