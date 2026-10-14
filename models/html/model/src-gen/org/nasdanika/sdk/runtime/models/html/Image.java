/**
 */
package org.nasdanika.sdk.runtime.models.html;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Image</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.Image#getSrc <em>Src</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.Image#getAlt <em>Alt</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.Image#getSrcset <em>Srcset</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.Image#getSizes <em>Sizes</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.Image#getWidth <em>Width</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.Image#getHeight <em>Height</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.Image#getLoading <em>Loading</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.sdk.runtime.models.html.HtmlPackage#getImage()
 * @model
 * @generated
 */
public interface Image extends VoidElement {
	/**
	 * Returns the value of the '<em><b>Src</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Src</em>' attribute.
	 * @see #setSrc(String)
	 * @see org.nasdanika.sdk.runtime.models.html.HtmlPackage#getImage_Src()
	 * @model unique="false"
	 * @generated
	 */
	String getSrc();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.html.Image#getSrc <em>Src</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Src</em>' attribute.
	 * @see #getSrc()
	 * @generated
	 */
	void setSrc(String value);

	/**
	 * Returns the value of the '<em><b>Alt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alt</em>' attribute.
	 * @see #setAlt(String)
	 * @see org.nasdanika.sdk.runtime.models.html.HtmlPackage#getImage_Alt()
	 * @model unique="false"
	 * @generated
	 */
	String getAlt();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.html.Image#getAlt <em>Alt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alt</em>' attribute.
	 * @see #getAlt()
	 * @generated
	 */
	void setAlt(String value);

	/**
	 * Returns the value of the '<em><b>Srcset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Srcset</em>' attribute.
	 * @see #setSrcset(String)
	 * @see org.nasdanika.sdk.runtime.models.html.HtmlPackage#getImage_Srcset()
	 * @model unique="false"
	 * @generated
	 */
	String getSrcset();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.html.Image#getSrcset <em>Srcset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Srcset</em>' attribute.
	 * @see #getSrcset()
	 * @generated
	 */
	void setSrcset(String value);

	/**
	 * Returns the value of the '<em><b>Sizes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sizes</em>' attribute.
	 * @see #setSizes(String)
	 * @see org.nasdanika.sdk.runtime.models.html.HtmlPackage#getImage_Sizes()
	 * @model unique="false"
	 * @generated
	 */
	String getSizes();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.html.Image#getSizes <em>Sizes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sizes</em>' attribute.
	 * @see #getSizes()
	 * @generated
	 */
	void setSizes(String value);

	/**
	 * Returns the value of the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Width</em>' attribute.
	 * @see #setWidth(int)
	 * @see org.nasdanika.sdk.runtime.models.html.HtmlPackage#getImage_Width()
	 * @model unique="false"
	 * @generated
	 */
	int getWidth();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.html.Image#getWidth <em>Width</em>}' attribute.
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
	 * @see org.nasdanika.sdk.runtime.models.html.HtmlPackage#getImage_Height()
	 * @model unique="false"
	 * @generated
	 */
	int getHeight();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.html.Image#getHeight <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Height</em>' attribute.
	 * @see #getHeight()
	 * @generated
	 */
	void setHeight(int value);

	/**
	 * Returns the value of the '<em><b>Loading</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Loading</em>' attribute.
	 * @see #setLoading(String)
	 * @see org.nasdanika.sdk.runtime.models.html.HtmlPackage#getImage_Loading()
	 * @model unique="false"
	 * @generated
	 */
	String getLoading();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.html.Image#getLoading <em>Loading</em>}' attribute.
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

} // Image
