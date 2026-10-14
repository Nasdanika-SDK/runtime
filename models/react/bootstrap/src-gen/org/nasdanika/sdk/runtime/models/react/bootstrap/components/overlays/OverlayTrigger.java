/**
 */
package org.nasdanika.sdk.runtime.models.react.bootstrap.components.overlays;

import org.eclipse.emf.common.util.EList;

import org.nasdanika.sdk.runtime.models.react.JsxNode;

import org.nasdanika.sdk.runtime.models.react.bootstrap.BootstrapComponent;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Overlay Trigger</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Shows its overlay - a tooltip or a popover - for its single child.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.overlays.OverlayTrigger#getPlacement <em>Placement</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.overlays.OverlayTrigger#getTrigger <em>Trigger</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.overlays.OverlayTrigger#getDelay <em>Delay</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.overlays.OverlayTrigger#isRootClose <em>Root Close</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.overlays.OverlayTrigger#getOverlay <em>Overlay</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.overlays.OverlayTrigger#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.overlays.OverlaysPackage#getOverlayTrigger()
 * @model annotation="urn:org.nasdanika:react component='OverlayTrigger'"
 * @generated
 */
public interface OverlayTrigger extends BootstrapComponent {
	/**
	 * Returns the value of the '<em><b>Placement</b></em>' attribute.
	 * The literals are from the enumeration {@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.overlays.Placement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Placement</em>' attribute.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.overlays.Placement
	 * @see #isSetPlacement()
	 * @see #unsetPlacement()
	 * @see #setPlacement(Placement)
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.overlays.OverlaysPackage#getOverlayTrigger_Placement()
	 * @model unique="false" unsettable="true"
	 * @generated
	 */
	Placement getPlacement();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.overlays.OverlayTrigger#getPlacement <em>Placement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Placement</em>' attribute.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.overlays.Placement
	 * @see #isSetPlacement()
	 * @see #unsetPlacement()
	 * @see #getPlacement()
	 * @generated
	 */
	void setPlacement(Placement value);

	/**
	 * Unsets the value of the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.overlays.OverlayTrigger#getPlacement <em>Placement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPlacement()
	 * @see #getPlacement()
	 * @see #setPlacement(Placement)
	 * @generated
	 */
	void unsetPlacement();

	/**
	 * Returns whether the value of the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.overlays.OverlayTrigger#getPlacement <em>Placement</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Placement</em>' attribute is set.
	 * @see #unsetPlacement()
	 * @see #getPlacement()
	 * @see #setPlacement(Placement)
	 * @generated
	 */
	boolean isSetPlacement();

	/**
	 * Returns the value of the '<em><b>Trigger</b></em>' attribute list.
	 * The list contents are of type {@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.overlays.Trigger}.
	 * The literals are from the enumeration {@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.overlays.Trigger}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Events showing the overlay
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Trigger</em>' attribute list.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.overlays.Trigger
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.overlays.OverlaysPackage#getOverlayTrigger_Trigger()
	 * @model unique="false"
	 * @generated
	 */
	EList<Trigger> getTrigger();

	/**
	 * Returns the value of the '<em><b>Delay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delay</em>' attribute.
	 * @see #isSetDelay()
	 * @see #unsetDelay()
	 * @see #setDelay(int)
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.overlays.OverlaysPackage#getOverlayTrigger_Delay()
	 * @model unique="false" unsettable="true"
	 * @generated
	 */
	int getDelay();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.overlays.OverlayTrigger#getDelay <em>Delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delay</em>' attribute.
	 * @see #isSetDelay()
	 * @see #unsetDelay()
	 * @see #getDelay()
	 * @generated
	 */
	void setDelay(int value);

	/**
	 * Unsets the value of the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.overlays.OverlayTrigger#getDelay <em>Delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDelay()
	 * @see #getDelay()
	 * @see #setDelay(int)
	 * @generated
	 */
	void unsetDelay();

	/**
	 * Returns whether the value of the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.overlays.OverlayTrigger#getDelay <em>Delay</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Delay</em>' attribute is set.
	 * @see #unsetDelay()
	 * @see #getDelay()
	 * @see #setDelay(int)
	 * @generated
	 */
	boolean isSetDelay();

	/**
	 * Returns the value of the '<em><b>Root Close</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Hides the overlay on a click outside
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Root Close</em>' attribute.
	 * @see #setRootClose(boolean)
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.overlays.OverlaysPackage#getOverlayTrigger_RootClose()
	 * @model unique="false"
	 * @generated
	 */
	boolean isRootClose();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.overlays.OverlayTrigger#isRootClose <em>Root Close</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Root Close</em>' attribute.
	 * @see #isRootClose()
	 * @generated
	 */
	void setRootClose(boolean value);

	/**
	 * Returns the value of the '<em><b>Overlay</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Overlay</em>' containment reference.
	 * @see #setOverlay(JsxNode)
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.overlays.OverlaysPackage#getOverlayTrigger_Overlay()
	 * @model containment="true"
	 *        annotation="urn:org.nasdanika:react prop='overlay'"
	 * @generated
	 */
	JsxNode getOverlay();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.overlays.OverlayTrigger#getOverlay <em>Overlay</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Overlay</em>' containment reference.
	 * @see #getOverlay()
	 * @generated
	 */
	void setOverlay(JsxNode value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' containment reference.
	 * @see #setTarget(JsxNode)
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.overlays.OverlaysPackage#getOverlayTrigger_Target()
	 * @model containment="true"
	 * @generated
	 */
	JsxNode getTarget();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.overlays.OverlayTrigger#getTarget <em>Target</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' containment reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(JsxNode value);

} // OverlayTrigger
