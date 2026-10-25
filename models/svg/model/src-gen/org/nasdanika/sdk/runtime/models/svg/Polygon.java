/**
 */
package org.nasdanika.sdk.runtime.models.svg;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Polygon</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.svg.Polygon#getPoints <em>Points</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.sdk.runtime.models.svg.SvgPackage#getPolygon()
 * @model extendedMetaData="name='polygon' kind='elementOnly'"
 * @generated
 */
public interface Polygon extends Shape {
	/**
	 * Returns the value of the '<em><b>Points</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Points</em>' attribute.
	 * @see #setPoints(String)
	 * @see org.nasdanika.sdk.runtime.models.svg.SvgPackage#getPolygon_Points()
	 * @model unique="false"
	 *        extendedMetaData="kind='attribute' name='points'"
	 * @generated
	 */
	String getPoints();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.svg.Polygon#getPoints <em>Points</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Points</em>' attribute.
	 * @see #getPoints()
	 * @generated
	 */
	void setPoints(String value);

} // Polygon
