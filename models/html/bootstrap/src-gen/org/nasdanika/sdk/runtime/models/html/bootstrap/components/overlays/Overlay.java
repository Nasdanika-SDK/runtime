/**
 */
package org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Overlay</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Tooltip or popover content of an overlay trigger.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.Overlay#isHtml <em>Html</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.OverlaysPackage#getOverlay()
 * @model abstract="true"
 * @generated
 */
public interface Overlay extends EObject {
	/**
	 * Returns the value of the '<em><b>Html</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Content is HTML
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Html</em>' attribute.
	 * @see #setHtml(boolean)
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.OverlaysPackage#getOverlay_Html()
	 * @model unique="false"
	 * @generated
	 */
	boolean isHtml();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.Overlay#isHtml <em>Html</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Html</em>' attribute.
	 * @see #isHtml()
	 * @generated
	 */
	void setHtml(boolean value);

} // Overlay
