/**
 */
package org.nasdanika.sdk.runtime.models.svg;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Use</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 *  A copy of another element, by reference: href="#id".
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.svg.Use#getHref <em>Href</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.svg.Use#getX <em>X</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.svg.Use#getY <em>Y</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.sdk.runtime.models.svg.SvgPackage#getUse()
 * @model extendedMetaData="name='use' kind='elementOnly'"
 * @generated
 */
public interface Use extends Shape {
	/**
	 * Returns the value of the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Href</em>' attribute.
	 * @see #setHref(String)
	 * @see org.nasdanika.sdk.runtime.models.svg.SvgPackage#getUse_Href()
	 * @model unique="false"
	 *        extendedMetaData="kind='attribute' name='href'"
	 * @generated
	 */
	String getHref();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.svg.Use#getHref <em>Href</em>}' attribute.
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
	 * @see org.nasdanika.sdk.runtime.models.svg.SvgPackage#getUse_X()
	 * @model unique="false"
	 *        extendedMetaData="kind='attribute' name='x'"
	 * @generated
	 */
	double getX();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.svg.Use#getX <em>X</em>}' attribute.
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
	 * @see org.nasdanika.sdk.runtime.models.svg.SvgPackage#getUse_Y()
	 * @model unique="false"
	 *        extendedMetaData="kind='attribute' name='y'"
	 * @generated
	 */
	double getY();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.svg.Use#getY <em>Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Y</em>' attribute.
	 * @see #getY()
	 * @generated
	 */
	void setY(double value);

} // Use
