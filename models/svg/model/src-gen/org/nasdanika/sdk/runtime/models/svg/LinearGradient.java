/**
 */
package org.nasdanika.sdk.runtime.models.svg;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Linear Gradient</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 *  A linear gradient, with stops as its children.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.svg.LinearGradient#getX1 <em>X1</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.svg.LinearGradient#getY1 <em>Y1</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.svg.LinearGradient#getX2 <em>X2</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.svg.LinearGradient#getY2 <em>Y2</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.svg.LinearGradient#getGradientUnits <em>Gradient Units</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.sdk.runtime.models.svg.SvgPackage#getLinearGradient()
 * @model extendedMetaData="name='linearGradient' kind='elementOnly'"
 * @generated
 */
public interface LinearGradient extends Container {
	/**
	 * Returns the value of the '<em><b>X1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>X1</em>' attribute.
	 * @see #setX1(String)
	 * @see org.nasdanika.sdk.runtime.models.svg.SvgPackage#getLinearGradient_X1()
	 * @model unique="false"
	 *        extendedMetaData="kind='attribute' name='x1'"
	 * @generated
	 */
	String getX1();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.svg.LinearGradient#getX1 <em>X1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>X1</em>' attribute.
	 * @see #getX1()
	 * @generated
	 */
	void setX1(String value);

	/**
	 * Returns the value of the '<em><b>Y1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Y1</em>' attribute.
	 * @see #setY1(String)
	 * @see org.nasdanika.sdk.runtime.models.svg.SvgPackage#getLinearGradient_Y1()
	 * @model unique="false"
	 *        extendedMetaData="kind='attribute' name='y1'"
	 * @generated
	 */
	String getY1();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.svg.LinearGradient#getY1 <em>Y1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Y1</em>' attribute.
	 * @see #getY1()
	 * @generated
	 */
	void setY1(String value);

	/**
	 * Returns the value of the '<em><b>X2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>X2</em>' attribute.
	 * @see #setX2(String)
	 * @see org.nasdanika.sdk.runtime.models.svg.SvgPackage#getLinearGradient_X2()
	 * @model unique="false"
	 *        extendedMetaData="kind='attribute' name='x2'"
	 * @generated
	 */
	String getX2();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.svg.LinearGradient#getX2 <em>X2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>X2</em>' attribute.
	 * @see #getX2()
	 * @generated
	 */
	void setX2(String value);

	/**
	 * Returns the value of the '<em><b>Y2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Y2</em>' attribute.
	 * @see #setY2(String)
	 * @see org.nasdanika.sdk.runtime.models.svg.SvgPackage#getLinearGradient_Y2()
	 * @model unique="false"
	 *        extendedMetaData="kind='attribute' name='y2'"
	 * @generated
	 */
	String getY2();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.svg.LinearGradient#getY2 <em>Y2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Y2</em>' attribute.
	 * @see #getY2()
	 * @generated
	 */
	void setY2(String value);

	/**
	 * Returns the value of the '<em><b>Gradient Units</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gradient Units</em>' attribute.
	 * @see #setGradientUnits(String)
	 * @see org.nasdanika.sdk.runtime.models.svg.SvgPackage#getLinearGradient_GradientUnits()
	 * @model unique="false"
	 *        extendedMetaData="kind='attribute' name='gradientUnits'"
	 * @generated
	 */
	String getGradientUnits();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.svg.LinearGradient#getGradientUnits <em>Gradient Units</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gradient Units</em>' attribute.
	 * @see #getGradientUnits()
	 * @generated
	 */
	void setGradientUnits(String value);

} // LinearGradient
