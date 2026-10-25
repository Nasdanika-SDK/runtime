/**
 */
package org.nasdanika.sdk.runtime.models.svg;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Path</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 *  A path, in SVG's path data: M 0 0 L 10 0 Z.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.svg.Path#getD <em>D</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.sdk.runtime.models.svg.SvgPackage#getPath()
 * @model extendedMetaData="name='path' kind='elementOnly'"
 * @generated
 */
public interface Path extends Shape {
	/**
	 * Returns the value of the '<em><b>D</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>D</em>' attribute.
	 * @see #setD(String)
	 * @see org.nasdanika.sdk.runtime.models.svg.SvgPackage#getPath_D()
	 * @model unique="false"
	 *        extendedMetaData="kind='attribute' name='d'"
	 * @generated
	 */
	String getD();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.svg.Path#getD <em>D</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>D</em>' attribute.
	 * @see #getD()
	 * @generated
	 */
	void setD(String value);

} // Path
