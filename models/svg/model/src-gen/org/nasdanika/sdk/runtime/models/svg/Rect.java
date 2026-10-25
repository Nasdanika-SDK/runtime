/**
 */
package org.nasdanika.sdk.runtime.models.svg;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rect</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.svg.Rect#getX <em>X</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.svg.Rect#getY <em>Y</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.svg.Rect#getWidth <em>Width</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.svg.Rect#getHeight <em>Height</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.svg.Rect#getRx <em>Rx</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.svg.Rect#getRy <em>Ry</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.sdk.runtime.models.svg.SvgPackage#getRect()
 * @model extendedMetaData="name='rect' kind='elementOnly'"
 * @generated
 */
public interface Rect extends Shape {
	/**
	 * Returns the value of the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>X</em>' attribute.
	 * @see #setX(double)
	 * @see org.nasdanika.sdk.runtime.models.svg.SvgPackage#getRect_X()
	 * @model unique="false"
	 *        extendedMetaData="kind='attribute' name='x'"
	 * @generated
	 */
	double getX();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.svg.Rect#getX <em>X</em>}' attribute.
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
	 * @see org.nasdanika.sdk.runtime.models.svg.SvgPackage#getRect_Y()
	 * @model unique="false"
	 *        extendedMetaData="kind='attribute' name='y'"
	 * @generated
	 */
	double getY();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.svg.Rect#getY <em>Y</em>}' attribute.
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
	 * @see org.nasdanika.sdk.runtime.models.svg.SvgPackage#getRect_Width()
	 * @model unique="false"
	 *        extendedMetaData="kind='attribute' name='width'"
	 * @generated
	 */
	double getWidth();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.svg.Rect#getWidth <em>Width</em>}' attribute.
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
	 * @see org.nasdanika.sdk.runtime.models.svg.SvgPackage#getRect_Height()
	 * @model unique="false"
	 *        extendedMetaData="kind='attribute' name='height'"
	 * @generated
	 */
	double getHeight();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.svg.Rect#getHeight <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Height</em>' attribute.
	 * @see #getHeight()
	 * @generated
	 */
	void setHeight(double value);

	/**
	 * Returns the value of the '<em><b>Rx</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Corner radii.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rx</em>' attribute.
	 * @see #setRx(double)
	 * @see org.nasdanika.sdk.runtime.models.svg.SvgPackage#getRect_Rx()
	 * @model unique="false"
	 *        extendedMetaData="kind='attribute' name='rx'"
	 * @generated
	 */
	double getRx();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.svg.Rect#getRx <em>Rx</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rx</em>' attribute.
	 * @see #getRx()
	 * @generated
	 */
	void setRx(double value);

	/**
	 * Returns the value of the '<em><b>Ry</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ry</em>' attribute.
	 * @see #setRy(double)
	 * @see org.nasdanika.sdk.runtime.models.svg.SvgPackage#getRect_Ry()
	 * @model unique="false"
	 *        extendedMetaData="kind='attribute' name='ry'"
	 * @generated
	 */
	double getRy();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.svg.Rect#getRy <em>Ry</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ry</em>' attribute.
	 * @see #getRy()
	 * @generated
	 */
	void setRy(double value);

} // Rect
