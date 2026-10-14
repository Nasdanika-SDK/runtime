/**
 */
package org.nasdanika.sdk.runtime.models.html;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Inline Frame</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.InlineFrame#getSrc <em>Src</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.InlineFrame#getTitle <em>Title</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.InlineFrame#getWidth <em>Width</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.InlineFrame#getHeight <em>Height</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.InlineFrame#getAllow <em>Allow</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.InlineFrame#getLoading <em>Loading</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.sdk.runtime.models.html.HtmlPackage#getInlineFrame()
 * @model
 * @generated
 */
public interface InlineFrame extends Element {
	/**
	 * Returns the value of the '<em><b>Src</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Src</em>' attribute.
	 * @see #setSrc(String)
	 * @see org.nasdanika.sdk.runtime.models.html.HtmlPackage#getInlineFrame_Src()
	 * @model unique="false"
	 * @generated
	 */
	String getSrc();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.html.InlineFrame#getSrc <em>Src</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Src</em>' attribute.
	 * @see #getSrc()
	 * @generated
	 */
	void setSrc(String value);

	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see org.nasdanika.sdk.runtime.models.html.HtmlPackage#getInlineFrame_Title()
	 * @model unique="false"
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.html.InlineFrame#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Width</em>' attribute.
	 * @see #setWidth(int)
	 * @see org.nasdanika.sdk.runtime.models.html.HtmlPackage#getInlineFrame_Width()
	 * @model unique="false"
	 * @generated
	 */
	int getWidth();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.html.InlineFrame#getWidth <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Width</em>' attribute.
	 * @see #getWidth()
	 * @generated
	 */
	void setWidth(int value);

	/**
	 * Returns the value of the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Height</em>' attribute.
	 * @see #setHeight(int)
	 * @see org.nasdanika.sdk.runtime.models.html.HtmlPackage#getInlineFrame_Height()
	 * @model unique="false"
	 * @generated
	 */
	int getHeight();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.html.InlineFrame#getHeight <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Height</em>' attribute.
	 * @see #getHeight()
	 * @generated
	 */
	void setHeight(int value);

	/**
	 * Returns the value of the '<em><b>Allow</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allow</em>' attribute.
	 * @see #setAllow(String)
	 * @see org.nasdanika.sdk.runtime.models.html.HtmlPackage#getInlineFrame_Allow()
	 * @model unique="false"
	 * @generated
	 */
	String getAllow();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.html.InlineFrame#getAllow <em>Allow</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allow</em>' attribute.
	 * @see #getAllow()
	 * @generated
	 */
	void setAllow(String value);

	/**
	 * Returns the value of the '<em><b>Loading</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Loading</em>' attribute.
	 * @see #setLoading(String)
	 * @see org.nasdanika.sdk.runtime.models.html.HtmlPackage#getInlineFrame_Loading()
	 * @model unique="false"
	 * @generated
	 */
	String getLoading();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.html.InlineFrame#getLoading <em>Loading</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Loading</em>' attribute.
	 * @see #getLoading()
	 * @generated
	 */
	void setLoading(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false"
	 * @generated
	 */
	String tagName();

} // InlineFrame
