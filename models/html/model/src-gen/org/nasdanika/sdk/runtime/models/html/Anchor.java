/**
 */
package org.nasdanika.sdk.runtime.models.html;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Anchor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.Anchor#getHref <em>Href</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.Anchor#getTarget <em>Target</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.Anchor#getRel <em>Rel</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.Anchor#getDownload <em>Download</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.sdk.runtime.models.html.HtmlPackage#getAnchor()
 * @model
 * @generated
 */
public interface Anchor extends Element, Container {
	/**
	 * Returns the value of the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Href</em>' attribute.
	 * @see #setHref(String)
	 * @see org.nasdanika.sdk.runtime.models.html.HtmlPackage#getAnchor_Href()
	 * @model unique="false"
	 * @generated
	 */
	String getHref();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.html.Anchor#getHref <em>Href</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Href</em>' attribute.
	 * @see #getHref()
	 * @generated
	 */
	void setHref(String value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' attribute.
	 * @see #setTarget(String)
	 * @see org.nasdanika.sdk.runtime.models.html.HtmlPackage#getAnchor_Target()
	 * @model unique="false"
	 * @generated
	 */
	String getTarget();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.html.Anchor#getTarget <em>Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' attribute.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(String value);

	/**
	 * Returns the value of the '<em><b>Rel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rel</em>' attribute.
	 * @see #setRel(String)
	 * @see org.nasdanika.sdk.runtime.models.html.HtmlPackage#getAnchor_Rel()
	 * @model unique="false"
	 * @generated
	 */
	String getRel();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.html.Anchor#getRel <em>Rel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rel</em>' attribute.
	 * @see #getRel()
	 * @generated
	 */
	void setRel(String value);

	/**
	 * Returns the value of the '<em><b>Download</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Download</em>' attribute.
	 * @see #setDownload(String)
	 * @see org.nasdanika.sdk.runtime.models.html.HtmlPackage#getAnchor_Download()
	 * @model unique="false"
	 * @generated
	 */
	String getDownload();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.html.Anchor#getDownload <em>Download</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Download</em>' attribute.
	 * @see #getDownload()
	 * @generated
	 */
	void setDownload(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false"
	 * @generated
	 */
	String tagName();

} // Anchor
