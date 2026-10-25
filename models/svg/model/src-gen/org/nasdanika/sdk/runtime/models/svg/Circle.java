/**
 */
package org.nasdanika.sdk.runtime.models.svg;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Circle</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.svg.Circle#getCx <em>Cx</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.svg.Circle#getCy <em>Cy</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.svg.Circle#getR <em>R</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.sdk.runtime.models.svg.SvgPackage#getCircle()
 * @model extendedMetaData="name='circle' kind='elementOnly'"
 * @generated
 */
public interface Circle extends Shape {
	/**
	 * Returns the value of the '<em><b>Cx</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cx</em>' attribute.
	 * @see #setCx(double)
	 * @see org.nasdanika.sdk.runtime.models.svg.SvgPackage#getCircle_Cx()
	 * @model unique="false"
	 *        extendedMetaData="kind='attribute' name='cx'"
	 * @generated
	 */
	double getCx();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.svg.Circle#getCx <em>Cx</em>}' attribute.
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
	 * @see org.nasdanika.sdk.runtime.models.svg.SvgPackage#getCircle_Cy()
	 * @model unique="false"
	 *        extendedMetaData="kind='attribute' name='cy'"
	 * @generated
	 */
	double getCy();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.svg.Circle#getCy <em>Cy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cy</em>' attribute.
	 * @see #getCy()
	 * @generated
	 */
	void setCy(double value);

	/**
	 * Returns the value of the '<em><b>R</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>R</em>' attribute.
	 * @see #setR(double)
	 * @see org.nasdanika.sdk.runtime.models.svg.SvgPackage#getCircle_R()
	 * @model unique="false"
	 *        extendedMetaData="kind='attribute' name='r'"
	 * @generated
	 */
	double getR();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.svg.Circle#getR <em>R</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>R</em>' attribute.
	 * @see #getR()
	 * @generated
	 */
	void setR(double value);

} // Circle
