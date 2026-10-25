/**
 */
package org.nasdanika.sdk.runtime.models.svg;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Marker</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 *  A marker: an arrowhead or another decoration drawn at the vertices of a line.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.svg.Marker#getViewBox <em>View Box</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.svg.Marker#getRefX <em>Ref X</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.svg.Marker#getRefY <em>Ref Y</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.svg.Marker#getMarkerWidth <em>Marker Width</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.svg.Marker#getMarkerHeight <em>Marker Height</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.svg.Marker#getOrient <em>Orient</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.svg.Marker#getMarkerUnits <em>Marker Units</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.sdk.runtime.models.svg.SvgPackage#getMarker()
 * @model extendedMetaData="name='marker' kind='elementOnly'"
 * @generated
 */
public interface Marker extends Container {
	/**
	 * Returns the value of the '<em><b>View Box</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>View Box</em>' attribute.
	 * @see #setViewBox(String)
	 * @see org.nasdanika.sdk.runtime.models.svg.SvgPackage#getMarker_ViewBox()
	 * @model unique="false"
	 *        extendedMetaData="kind='attribute' name='viewBox'"
	 * @generated
	 */
	String getViewBox();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.svg.Marker#getViewBox <em>View Box</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>View Box</em>' attribute.
	 * @see #getViewBox()
	 * @generated
	 */
	void setViewBox(String value);

	/**
	 * Returns the value of the '<em><b>Ref X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ref X</em>' attribute.
	 * @see #setRefX(String)
	 * @see org.nasdanika.sdk.runtime.models.svg.SvgPackage#getMarker_RefX()
	 * @model unique="false"
	 *        extendedMetaData="kind='attribute' name='refX'"
	 * @generated
	 */
	String getRefX();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.svg.Marker#getRefX <em>Ref X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ref X</em>' attribute.
	 * @see #getRefX()
	 * @generated
	 */
	void setRefX(String value);

	/**
	 * Returns the value of the '<em><b>Ref Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ref Y</em>' attribute.
	 * @see #setRefY(String)
	 * @see org.nasdanika.sdk.runtime.models.svg.SvgPackage#getMarker_RefY()
	 * @model unique="false"
	 *        extendedMetaData="kind='attribute' name='refY'"
	 * @generated
	 */
	String getRefY();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.svg.Marker#getRefY <em>Ref Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ref Y</em>' attribute.
	 * @see #getRefY()
	 * @generated
	 */
	void setRefY(String value);

	/**
	 * Returns the value of the '<em><b>Marker Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Marker Width</em>' attribute.
	 * @see #setMarkerWidth(String)
	 * @see org.nasdanika.sdk.runtime.models.svg.SvgPackage#getMarker_MarkerWidth()
	 * @model unique="false"
	 *        extendedMetaData="kind='attribute' name='markerWidth'"
	 * @generated
	 */
	String getMarkerWidth();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.svg.Marker#getMarkerWidth <em>Marker Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Marker Width</em>' attribute.
	 * @see #getMarkerWidth()
	 * @generated
	 */
	void setMarkerWidth(String value);

	/**
	 * Returns the value of the '<em><b>Marker Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Marker Height</em>' attribute.
	 * @see #setMarkerHeight(String)
	 * @see org.nasdanika.sdk.runtime.models.svg.SvgPackage#getMarker_MarkerHeight()
	 * @model unique="false"
	 *        extendedMetaData="kind='attribute' name='markerHeight'"
	 * @generated
	 */
	String getMarkerHeight();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.svg.Marker#getMarkerHeight <em>Marker Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Marker Height</em>' attribute.
	 * @see #getMarkerHeight()
	 * @generated
	 */
	void setMarkerHeight(String value);

	/**
	 * Returns the value of the '<em><b>Orient</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  auto, auto-start-reverse, or an angle.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Orient</em>' attribute.
	 * @see #setOrient(String)
	 * @see org.nasdanika.sdk.runtime.models.svg.SvgPackage#getMarker_Orient()
	 * @model unique="false"
	 *        extendedMetaData="kind='attribute' name='orient'"
	 * @generated
	 */
	String getOrient();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.svg.Marker#getOrient <em>Orient</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Orient</em>' attribute.
	 * @see #getOrient()
	 * @generated
	 */
	void setOrient(String value);

	/**
	 * Returns the value of the '<em><b>Marker Units</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  strokeWidth (the default) or userSpaceOnUse.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Marker Units</em>' attribute.
	 * @see #setMarkerUnits(String)
	 * @see org.nasdanika.sdk.runtime.models.svg.SvgPackage#getMarker_MarkerUnits()
	 * @model unique="false"
	 *        extendedMetaData="kind='attribute' name='markerUnits'"
	 * @generated
	 */
	String getMarkerUnits();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.svg.Marker#getMarkerUnits <em>Marker Units</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Marker Units</em>' attribute.
	 * @see #getMarkerUnits()
	 * @generated
	 */
	void setMarkerUnits(String value);

} // Marker
