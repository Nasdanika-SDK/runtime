/**
 */
package org.nasdanika.sdk.runtime.models.html;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Stylesheet</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Logical stylesheet - rendered as <link rel="stylesheet"> if href is set, as <style> otherwise.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.Stylesheet#getHref <em>Href</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.Stylesheet#getMedia <em>Media</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.Stylesheet#getCrossorigin <em>Crossorigin</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.Stylesheet#getIntegrity <em>Integrity</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.Stylesheet#getContent <em>Content</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.sdk.runtime.models.html.HtmlPackage#getStylesheet()
 * @model
 * @generated
 */
public interface Stylesheet extends Element {
	/**
	 * Returns the value of the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Href</em>' attribute.
	 * @see #setHref(String)
	 * @see org.nasdanika.sdk.runtime.models.html.HtmlPackage#getStylesheet_Href()
	 * @model unique="false"
	 * @generated
	 */
	String getHref();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.html.Stylesheet#getHref <em>Href</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Href</em>' attribute.
	 * @see #getHref()
	 * @generated
	 */
	void setHref(String value);

	/**
	 * Returns the value of the '<em><b>Media</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Media</em>' attribute.
	 * @see #setMedia(String)
	 * @see org.nasdanika.sdk.runtime.models.html.HtmlPackage#getStylesheet_Media()
	 * @model unique="false"
	 * @generated
	 */
	String getMedia();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.html.Stylesheet#getMedia <em>Media</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Media</em>' attribute.
	 * @see #getMedia()
	 * @generated
	 */
	void setMedia(String value);

	/**
	 * Returns the value of the '<em><b>Crossorigin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Crossorigin</em>' attribute.
	 * @see #setCrossorigin(String)
	 * @see org.nasdanika.sdk.runtime.models.html.HtmlPackage#getStylesheet_Crossorigin()
	 * @model unique="false"
	 * @generated
	 */
	String getCrossorigin();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.html.Stylesheet#getCrossorigin <em>Crossorigin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Crossorigin</em>' attribute.
	 * @see #getCrossorigin()
	 * @generated
	 */
	void setCrossorigin(String value);

	/**
	 * Returns the value of the '<em><b>Integrity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Integrity</em>' attribute.
	 * @see #setIntegrity(String)
	 * @see org.nasdanika.sdk.runtime.models.html.HtmlPackage#getStylesheet_Integrity()
	 * @model unique="false"
	 * @generated
	 */
	String getIntegrity();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.html.Stylesheet#getIntegrity <em>Integrity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Integrity</em>' attribute.
	 * @see #getIntegrity()
	 * @generated
	 */
	void setIntegrity(String value);

	/**
	 * Returns the value of the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Inline CSS, emitted verbatim
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Content</em>' attribute.
	 * @see #setContent(String)
	 * @see org.nasdanika.sdk.runtime.models.html.HtmlPackage#getStylesheet_Content()
	 * @model unique="false"
	 *        annotation="urn:org.nasdanika:html logical='true'"
	 * @generated
	 */
	String getContent();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.html.Stylesheet#getContent <em>Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content</em>' attribute.
	 * @see #getContent()
	 * @generated
	 */
	void setContent(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false"
	 * @generated
	 */
	String tagName();

} // Stylesheet
