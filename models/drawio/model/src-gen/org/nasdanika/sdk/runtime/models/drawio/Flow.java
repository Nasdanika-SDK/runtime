/**
 */
package org.nasdanika.sdk.runtime.models.drawio;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Flow</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Moving dashes along connections - the JSON {"flow": {"start": true}}.
 * 
 * Modelled as a three-state enum because the JSON distinguishes "toggle whatever
 * it is now" (no 'start' key) from forcing it on or off, and a plain boolean
 * cannot say that.
 * 
 * This is the one effect that reads as motion along an edge, which makes it the
 * natural rendering of a message, a transaction, or a control transfer.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.drawio.Flow#getMode <em>Mode</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.sdk.runtime.models.drawio.DrawioPackage#getFlow()
 * @model
 * @generated
 */
public interface Flow extends TargetedAction {
	/**
	 * Returns the value of the '<em><b>Mode</b></em>' attribute.
	 * The default value is <code>"TOGGLE"</code>.
	 * The literals are from the enumeration {@link org.nasdanika.sdk.runtime.models.drawio.FlowMode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mode</em>' attribute.
	 * @see org.nasdanika.sdk.runtime.models.drawio.FlowMode
	 * @see #setMode(FlowMode)
	 * @see org.nasdanika.sdk.runtime.models.drawio.DrawioPackage#getFlow_Mode()
	 * @model default="TOGGLE" unique="false"
	 * @generated
	 */
	FlowMode getMode();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.drawio.Flow#getMode <em>Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mode</em>' attribute.
	 * @see org.nasdanika.sdk.runtime.models.drawio.FlowMode
	 * @see #getMode()
	 * @generated
	 */
	void setMode(FlowMode value);

} // Flow
