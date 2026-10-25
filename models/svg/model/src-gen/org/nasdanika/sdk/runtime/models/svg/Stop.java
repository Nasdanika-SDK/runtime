/**
 */
package org.nasdanika.sdk.runtime.models.svg;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Stop</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 *  A color stop of a gradient.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.svg.Stop#getOffset <em>Offset</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.svg.Stop#getStopColor <em>Stop Color</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.svg.Stop#getStopOpacity <em>Stop Opacity</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.sdk.runtime.models.svg.SvgPackage#getStop()
 * @model extendedMetaData="name='stop' kind='empty'"
 * @generated
 */
public interface Stop extends Element {
	/**
	 * Returns the value of the '<em><b>Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Offset</em>' attribute.
	 * @see #setOffset(String)
	 * @see org.nasdanika.sdk.runtime.models.svg.SvgPackage#getStop_Offset()
	 * @model unique="false"
	 *        extendedMetaData="kind='attribute' name='offset'"
	 * @generated
	 */
	String getOffset();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.svg.Stop#getOffset <em>Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Offset</em>' attribute.
	 * @see #getOffset()
	 * @generated
	 */
	void setOffset(String value);

	/**
	 * Returns the value of the '<em><b>Stop Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stop Color</em>' attribute.
	 * @see #setStopColor(String)
	 * @see org.nasdanika.sdk.runtime.models.svg.SvgPackage#getStop_StopColor()
	 * @model unique="false"
	 *        extendedMetaData="kind='attribute' name='stop-color'"
	 * @generated
	 */
	String getStopColor();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.svg.Stop#getStopColor <em>Stop Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stop Color</em>' attribute.
	 * @see #getStopColor()
	 * @generated
	 */
	void setStopColor(String value);

	/**
	 * Returns the value of the '<em><b>Stop Opacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stop Opacity</em>' attribute.
	 * @see #setStopOpacity(String)
	 * @see org.nasdanika.sdk.runtime.models.svg.SvgPackage#getStop_StopOpacity()
	 * @model unique="false"
	 *        extendedMetaData="kind='attribute' name='stop-opacity'"
	 * @generated
	 */
	String getStopOpacity();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.svg.Stop#getStopOpacity <em>Stop Opacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stop Opacity</em>' attribute.
	 * @see #getStopOpacity()
	 * @generated
	 */
	void setStopOpacity(String value);

} // Stop
