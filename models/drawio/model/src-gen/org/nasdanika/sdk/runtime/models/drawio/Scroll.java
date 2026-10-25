/**
 */
package org.nasdanika.sdk.runtime.models.drawio;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scroll</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 *  Scroll the cells into view.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.drawio.Scroll#isSmooth <em>Smooth</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.sdk.runtime.models.drawio.DrawioPackage#getScroll()
 * @model
 * @generated
 */
public interface Scroll extends TargetedAction {
	/**
	 * Returns the value of the '<em><b>Smooth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Smooth</em>' attribute.
	 * @see #setSmooth(boolean)
	 * @see org.nasdanika.sdk.runtime.models.drawio.DrawioPackage#getScroll_Smooth()
	 * @model unique="false"
	 * @generated
	 */
	boolean isSmooth();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.drawio.Scroll#isSmooth <em>Smooth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Smooth</em>' attribute.
	 * @see #isSmooth()
	 * @generated
	 */
	void setSmooth(boolean value);

} // Scroll
