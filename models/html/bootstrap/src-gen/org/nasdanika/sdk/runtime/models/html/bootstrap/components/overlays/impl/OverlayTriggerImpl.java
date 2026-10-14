/**
 */
package org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.nasdanika.sdk.runtime.models.html.Node;

import org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.Overlay;
import org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.OverlayTrigger;
import org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.OverlaysPackage;
import org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.Placement;
import org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.Trigger;

import org.nasdanika.sdk.runtime.models.html.bootstrap.impl.BootstrapElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Overlay Trigger</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.impl.OverlayTriggerImpl#getPlacement <em>Placement</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.impl.OverlayTriggerImpl#getTrigger <em>Trigger</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.impl.OverlayTriggerImpl#getOverlay <em>Overlay</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.impl.OverlayTriggerImpl#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OverlayTriggerImpl extends BootstrapElementImpl implements OverlayTrigger {
	/**
	 * The default value of the '{@link #getPlacement() <em>Placement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlacement()
	 * @generated
	 * @ordered
	 */
	protected static final Placement PLACEMENT_EDEFAULT = Placement.AUTO;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OverlayTriggerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OverlaysPackage.Literals.OVERLAY_TRIGGER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Placement getPlacement() {
		return (Placement)eDynamicGet(OverlaysPackage.OVERLAY_TRIGGER__PLACEMENT, OverlaysPackage.Literals.OVERLAY_TRIGGER__PLACEMENT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlacement(Placement newPlacement) {
		eDynamicSet(OverlaysPackage.OVERLAY_TRIGGER__PLACEMENT, OverlaysPackage.Literals.OVERLAY_TRIGGER__PLACEMENT, newPlacement);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPlacement() {
		eDynamicUnset(OverlaysPackage.OVERLAY_TRIGGER__PLACEMENT, OverlaysPackage.Literals.OVERLAY_TRIGGER__PLACEMENT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPlacement() {
		return eDynamicIsSet(OverlaysPackage.OVERLAY_TRIGGER__PLACEMENT, OverlaysPackage.Literals.OVERLAY_TRIGGER__PLACEMENT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Trigger> getTrigger() {
		return (EList<Trigger>)eDynamicGet(OverlaysPackage.OVERLAY_TRIGGER__TRIGGER, OverlaysPackage.Literals.OVERLAY_TRIGGER__TRIGGER, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Overlay getOverlay() {
		return (Overlay)eDynamicGet(OverlaysPackage.OVERLAY_TRIGGER__OVERLAY, OverlaysPackage.Literals.OVERLAY_TRIGGER__OVERLAY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOverlay(Overlay newOverlay, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newOverlay, OverlaysPackage.OVERLAY_TRIGGER__OVERLAY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOverlay(Overlay newOverlay) {
		eDynamicSet(OverlaysPackage.OVERLAY_TRIGGER__OVERLAY, OverlaysPackage.Literals.OVERLAY_TRIGGER__OVERLAY, newOverlay);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node getTarget() {
		return (Node)eDynamicGet(OverlaysPackage.OVERLAY_TRIGGER__TARGET, OverlaysPackage.Literals.OVERLAY_TRIGGER__TARGET, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTarget(Node newTarget, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newTarget, OverlaysPackage.OVERLAY_TRIGGER__TARGET, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(Node newTarget) {
		eDynamicSet(OverlaysPackage.OVERLAY_TRIGGER__TARGET, OverlaysPackage.Literals.OVERLAY_TRIGGER__TARGET, newTarget);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OverlaysPackage.OVERLAY_TRIGGER__OVERLAY:
				return basicSetOverlay(null, msgs);
			case OverlaysPackage.OVERLAY_TRIGGER__TARGET:
				return basicSetTarget(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OverlaysPackage.OVERLAY_TRIGGER__PLACEMENT:
				return getPlacement();
			case OverlaysPackage.OVERLAY_TRIGGER__TRIGGER:
				return getTrigger();
			case OverlaysPackage.OVERLAY_TRIGGER__OVERLAY:
				return getOverlay();
			case OverlaysPackage.OVERLAY_TRIGGER__TARGET:
				return getTarget();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case OverlaysPackage.OVERLAY_TRIGGER__PLACEMENT:
				setPlacement((Placement)newValue);
				return;
			case OverlaysPackage.OVERLAY_TRIGGER__TRIGGER:
				getTrigger().clear();
				getTrigger().addAll((Collection<? extends Trigger>)newValue);
				return;
			case OverlaysPackage.OVERLAY_TRIGGER__OVERLAY:
				setOverlay((Overlay)newValue);
				return;
			case OverlaysPackage.OVERLAY_TRIGGER__TARGET:
				setTarget((Node)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case OverlaysPackage.OVERLAY_TRIGGER__PLACEMENT:
				unsetPlacement();
				return;
			case OverlaysPackage.OVERLAY_TRIGGER__TRIGGER:
				getTrigger().clear();
				return;
			case OverlaysPackage.OVERLAY_TRIGGER__OVERLAY:
				setOverlay((Overlay)null);
				return;
			case OverlaysPackage.OVERLAY_TRIGGER__TARGET:
				setTarget((Node)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case OverlaysPackage.OVERLAY_TRIGGER__PLACEMENT:
				return isSetPlacement();
			case OverlaysPackage.OVERLAY_TRIGGER__TRIGGER:
				return !getTrigger().isEmpty();
			case OverlaysPackage.OVERLAY_TRIGGER__OVERLAY:
				return getOverlay() != null;
			case OverlaysPackage.OVERLAY_TRIGGER__TARGET:
				return getTarget() != null;
		}
		return super.eIsSet(featureID);
	}

} //OverlayTriggerImpl
