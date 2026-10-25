/**
 */
package org.nasdanika.sdk.runtime.models.svg;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ellipse</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.svg.Ellipse#getCx <em>Cx</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.svg.Ellipse#getCy <em>Cy</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.svg.Ellipse#getRx <em>Rx</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.svg.Ellipse#getRy <em>Ry</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.sdk.runtime.models.svg.SvgPackage#getEllipse()
 * @model extendedMetaData="name='ellipse' kind='elementOnly'"
 * @generated
 */
public interface Ellipse extends Shape {
	/**
	 * Returns the value of the '<em><b>Cx</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cx</em>' attribute.
	 * @see #setCx(double)
	 * @see org.nasdanika.sdk.runtime.models.svg.SvgPackage#getEllipse_Cx()
	 * @model unique="false"
	 *        extendedMetaData="kind='attribute' name='cx'"
	 * @generated
	 */
	double getCx();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.svg.Ellipse#getCx <em>Cx</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cx</em>' attribute.
	 * @see #getCx()
	 * @generated
	 */
	void setCx(double value);

	/**
	 * Returns the value of the '<em><b>Cy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cy</em>' attribute.
	 * @see #setCy(double)
	 * @see org.nasdanika.sdk.runtime.models.svg.SvgPackage#getEllipse_Cy()
	 * @model unique="false"
	 *        extendedMetaData="kind='attribute' name='cy'"
	 * @generated
	 */
	double getCy();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.svg.Ellipse#getCy <em>Cy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cy</em>' attribute.
	 * @see #getCy()
	 * @generated
	 */
	void setCy(double value);

	/**
	 * Returns the value of the '<em><b>Rx</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rx</em>' attribute.
	 * @see #setRx(double)
	 * @see org.nasdanika.sdk.runtime.models.svg.SvgPackage#getEllipse_Rx()
	 * @model unique="false"
	 *        extendedMetaData="kind='attribute' name='rx'"
	 * @generated
	 */
	double getRx();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.svg.Ellipse#getRx <em>Rx</em>}' attribute.
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
	 * @see org.nasdanika.sdk.runtime.models.svg.SvgPackage#getEllipse_Ry()
	 * @model unique="false"
	 *        extendedMetaData="kind='attribute' name='ry'"
	 * @generated
	 */
	double getRy();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.svg.Ellipse#getRy <em>Ry</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ry</em>' attribute.
	 * @see #getRy()
	 * @generated
	 */
	void setRy(double value);

} // Ellipse
