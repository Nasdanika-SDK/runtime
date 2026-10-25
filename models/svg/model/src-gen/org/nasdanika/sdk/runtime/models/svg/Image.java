/**
 */
package org.nasdanika.sdk.runtime.models.svg;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Image</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.svg.Image#getHref <em>Href</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.svg.Image#getX <em>X</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.svg.Image#getY <em>Y</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.svg.Image#getWidth <em>Width</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.svg.Image#getHeight <em>Height</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.svg.Image#getPreserveAspectRatio <em>Preserve Aspect Ratio</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.sdk.runtime.models.svg.SvgPackage#getImage()
 * @model extendedMetaData="name='image' kind='elementOnly'"
 * @generated
 */
public interface Image extends Shape {
	/**
	 * Returns the value of the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Href</em>' attribute.
	 * @see #setHref(String)
	 * @see org.nasdanika.sdk.runtime.models.svg.SvgPackage#getImage_Href()
	 * @model unique="false"
	 *        extendedMetaData="kind='attribute' name='href'"
	 * @generated
	 */
	String getHref();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.svg.Image#getHref <em>Href</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Href</em>' attribute.
	 * @see #getHref()
	 * @generated
	 */
	void setHref(String value);

	/**
	 * Returns the value of the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>X</em>' attribute.
	 * @see #setX(double)
	 * @see org.nasdanika.sdk.runtime.models.svg.SvgPackage#getImage_X()
	 * @model unique="false"
	 *        extendedMetaData="kind='attribute' name='x'"
	 * @generated
	 */
	double getX();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.svg.Image#getX <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>X</em>' attribute.
	 * @see #getX()
	 * @generated
	 */
	void setX(double value);

	/**
	 * Returns the value of the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Y</em>' attribute.
	 * @see #setY(double)
	 * @see org.nasdanika.sdk.runtime.models.svg.SvgPackage#getImage_Y()
	 * @model unique="false"
	 *        extendedMetaData="kind='attribute' name='y'"
	 * @generated
	 */
	double getY();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.svg.Image#getY <em>Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Y</em>' attribute.
	 * @see #getY()
	 * @generated
	 */
	void setY(double value);

	/**
	 * Returns the value of the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Width</em>' attribute.
	 * @see #setWidth(double)
	 * @see org.nasdanika.sdk.runtime.models.svg.SvgPackage#getImage_Width()
	 * @model unique="false"
	 *        extendedMetaData="kind='attribute' name='width'"
	 * @generated
	 */
	double getWidth();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.svg.Image#getWidth <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Width</em>' attribute.
	 * @see #getWidth()
	 * @generated
	 */
	void setWidth(double value);

	/**
	 * Returns the value of the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Height</em>' attribute.
	 * @see #setHeight(double)
	 * @see org.nasdanika.sdk.runtime.models.svg.SvgPackage#getImage_Height()
	 * @model unique="false"
	 *        extendedMetaData="kind='attribute' name='height'"
	 * @generated
	 */
	double getHeight();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.svg.Image#getHeight <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Height</em>' attribute.
	 * @see #getHeight()
	 * @generated
	 */
	void setHeight(double value);

	/**
	 * Returns the value of the '<em><b>Preserve Aspect Ratio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Preserve Aspect Ratio</em>' attribute.
	 * @see #setPreserveAspectRatio(String)
	 * @see org.nasdanika.sdk.runtime.models.svg.SvgPackage#getImage_PreserveAspectRatio()
	 * @model unique="false"
	 *        extendedMetaData="kind='attribute' name='preserveAspectRatio'"
	 * @generated
	 */
	String getPreserveAspectRatio();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.svg.Image#getPreserveAspectRatio <em>Preserve Aspect Ratio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Preserve Aspect Ratio</em>' attribute.
	 * @see #getPreserveAspectRatio()
	 * @generated
	 */
	void setPreserveAspectRatio(String value);

} // Image
