/**
 */
package org.nasdanika.sdk.runtime.models.svg;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Polyline</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 *  Points as SVG writes them: x,y pairs separated by spaces.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.svg.Polyline#getPoints <em>Points</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.sdk.runtime.models.svg.SvgPackage#getPolyline()
 * @model extendedMetaData="name='polyline' kind='elementOnly'"
 * @generated
 */
public interface Polyline extends Shape {
	/**
	 * Returns the value of the '<em><b>Points</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Points</em>' attribute.
	 * @see #setPoints(String)
	 * @see org.nasdanika.sdk.runtime.models.svg.SvgPackage#getPolyline_Points()
	 * @model unique="false"
	 *        extendedMetaData="kind='attribute' name='points'"
	 * @generated
	 */
	String getPoints();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.svg.Polyline#getPoints <em>Points</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Points</em>' attribute.
	 * @see #getPoints()
	 * @generated
	 */
	void setPoints(String value);

} // Polyline
