/**
 */
package org.nasdanika.sdk.runtime.models.drawio;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Highlight</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Pulse a colour over the cells.
 * 
 * The workhorse for observability overlays - the "this activity is slow" or "this
 * step failed" marker on an otherwise unchanged diagram.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.drawio.Highlight#getColor <em>Color</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.drawio.Highlight#getOpacity <em>Opacity</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.drawio.Highlight#getDuration <em>Duration</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.sdk.runtime.models.drawio.DrawioPackage#getHighlight()
 * @model
 * @generated
 */
public interface Highlight extends TargetedAction {
	/**
	 * Returns the value of the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  #RRGGBB.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Color</em>' attribute.
	 * @see #setColor(String)
	 * @see org.nasdanika.sdk.runtime.models.drawio.DrawioPackage#getHighlight_Color()
	 * @model unique="false"
	 * @generated
	 */
	String getColor();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.drawio.Highlight#getColor <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Color</em>' attribute.
	 * @see #getColor()
	 * @generated
	 */
	void setColor(String value);

	/**
	 * Returns the value of the '<em><b>Opacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Percent, 0..100 - Draw.io's own unit here, unlike the 0..1 opacity elsewhere.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Opacity</em>' attribute.
	 * @see #setOpacity(int)
	 * @see org.nasdanika.sdk.runtime.models.drawio.DrawioPackage#getHighlight_Opacity()
	 * @model unique="false"
	 * @generated
	 */
	int getOpacity();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.drawio.Highlight#getOpacity <em>Opacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Opacity</em>' attribute.
	 * @see #getOpacity()
	 * @generated
	 */
	void setOpacity(int value);

	/**
	 * Returns the value of the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Milliseconds.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Duration</em>' attribute.
	 * @see #setDuration(int)
	 * @see org.nasdanika.sdk.runtime.models.drawio.DrawioPackage#getHighlight_Duration()
	 * @model unique="false"
	 * @generated
	 */
	int getDuration();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.drawio.Highlight#getDuration <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duration</em>' attribute.
	 * @see #getDuration()
	 * @generated
	 */
	void setDuration(int value);

} // Highlight
