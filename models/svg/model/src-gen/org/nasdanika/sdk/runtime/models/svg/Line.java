/**
 */
package org.nasdanika.sdk.runtime.models.svg;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Line</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.svg.Line#getX1 <em>X1</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.svg.Line#getY1 <em>Y1</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.svg.Line#getX2 <em>X2</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.svg.Line#getY2 <em>Y2</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.sdk.runtime.models.svg.SvgPackage#getLine()
 * @model extendedMetaData="name='line' kind='elementOnly'"
 * @generated
 */
public interface Line extends Shape {
	/**
	 * Returns the value of the '<em><b>X1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>X1</em>' attribute.
	 * @see #setX1(double)
	 * @see org.nasdanika.sdk.runtime.models.svg.SvgPackage#getLine_X1()
	 * @model unique="false"
	 *        extendedMetaData="kind='attribute' name='x1'"
	 * @generated
	 */
	double getX1();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.svg.Line#getX1 <em>X1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>X1</em>' attribute.
	 * @see #getX1()
	 * @generated
	 */
	void setX1(double value);

	/**
	 * Returns the value of the '<em><b>Y1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Y1</em>' attribute.
	 * @see #setY1(double)
	 * @see org.nasdanika.sdk.runtime.models.svg.SvgPackage#getLine_Y1()
	 * @model unique="false"
	 *        extendedMetaData="kind='attribute' name='y1'"
	 * @generated
	 */
	double getY1();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.svg.Line#getY1 <em>Y1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Y1</em>' attribute.
	 * @see #getY1()
	 * @generated
	 */
	void setY1(double value);

	/**
	 * Returns the value of the '<em><b>X2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>X2</em>' attribute.
	 * @see #setX2(double)
	 * @see org.nasdanika.sdk.runtime.models.svg.SvgPackage#getLine_X2()
	 * @model unique="false"
	 *        extendedMetaData="kind='attribute' name='x2'"
	 * @generated
	 */
	double getX2();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.svg.Line#getX2 <em>X2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>X2</em>' attribute.
	 * @see #getX2()
	 * @generated
	 */
	void setX2(double value);

	/**
	 * Returns the value of the '<em><b>Y2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Y2</em>' attribute.
	 * @see #setY2(double)
	 * @see org.nasdanika.sdk.runtime.models.svg.SvgPackage#getLine_Y2()
	 * @model unique="false"
	 *        extendedMetaData="kind='attribute' name='y2'"
	 * @generated
	 */
	double getY2();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.svg.Line#getY2 <em>Y2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Y2</em>' attribute.
	 * @see #getY2()
	 * @generated
	 */
	void setY2(double value);

} // Line
