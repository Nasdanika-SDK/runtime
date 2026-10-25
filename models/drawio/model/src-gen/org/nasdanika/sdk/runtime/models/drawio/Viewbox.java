/**
 */
package org.nasdanika.sdk.runtime.models.drawio;

import org.nasdanika.sdk.runtime.models.diagram.Bounds;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Viewbox</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 *  Move the viewport to a rectangle.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.drawio.Viewbox#getBounds <em>Bounds</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.drawio.Viewbox#isSmooth <em>Smooth</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.sdk.runtime.models.drawio.DrawioPackage#getViewbox()
 * @model
 * @generated
 */
public interface Viewbox extends Action {
	/**
	 * Returns the value of the '<em><b>Bounds</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bounds</em>' containment reference.
	 * @see #setBounds(Bounds)
	 * @see org.nasdanika.sdk.runtime.models.drawio.DrawioPackage#getViewbox_Bounds()
	 * @model containment="true"
	 * @generated
	 */
	Bounds getBounds();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.drawio.Viewbox#getBounds <em>Bounds</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bounds</em>' containment reference.
	 * @see #getBounds()
	 * @generated
	 */
	void setBounds(Bounds value);

	/**
	 * Returns the value of the '<em><b>Smooth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Smooth</em>' attribute.
	 * @see #setSmooth(boolean)
	 * @see org.nasdanika.sdk.runtime.models.drawio.DrawioPackage#getViewbox_Smooth()
	 * @model unique="false"
	 * @generated
	 */
	boolean isSmooth();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.drawio.Viewbox#isSmooth <em>Smooth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Smooth</em>' attribute.
	 * @see #isSmooth()
	 * @generated
	 */
	void setSmooth(boolean value);

} // Viewbox
