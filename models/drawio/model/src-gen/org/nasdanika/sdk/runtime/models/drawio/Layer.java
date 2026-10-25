/**
 */
package org.nasdanika.sdk.runtime.models.drawio;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Layer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 *  Common mxCell aspects: style string + custom properties (mxCell wrapped in <object>).
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.drawio.Layer#getStyle <em>Style</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.sdk.runtime.models.drawio.DrawioPackage#getLayer()
 * @model
 * @generated
 */
public interface Layer extends org.nasdanika.sdk.runtime.models.diagram.Layer {
	/**
	 * Returns the value of the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Style</em>' attribute.
	 * @see #setStyle(String)
	 * @see org.nasdanika.sdk.runtime.models.drawio.DrawioPackage#getLayer_Style()
	 * @model unique="false"
	 * @generated
	 */
	String getStyle();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.drawio.Layer#getStyle <em>Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Style</em>' attribute.
	 * @see #getStyle()
	 * @generated
	 */
	void setStyle(String value);

} // Layer
