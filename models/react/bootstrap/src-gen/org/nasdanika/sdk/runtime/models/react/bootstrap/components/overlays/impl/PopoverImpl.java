/**
 */
package org.nasdanika.sdk.runtime.models.react.bootstrap.components.overlays.impl;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.nasdanika.sdk.runtime.models.react.bootstrap.components.overlays.OverlaysPackage;
import org.nasdanika.sdk.runtime.models.react.bootstrap.components.overlays.Placement;
import org.nasdanika.sdk.runtime.models.react.bootstrap.components.overlays.Popover;
import org.nasdanika.sdk.runtime.models.react.bootstrap.components.overlays.PopoverBody;
import org.nasdanika.sdk.runtime.models.react.bootstrap.components.overlays.PopoverHeader;

import org.nasdanika.sdk.runtime.models.react.bootstrap.impl.BootstrapComponentImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Popover</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.overlays.impl.PopoverImpl#getPlacement <em>Placement</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.overlays.impl.PopoverImpl#getHeader <em>Header</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.overlays.impl.PopoverImpl#getBody <em>Body</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PopoverImpl extends BootstrapComponentImpl implements Popover {
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
	protected PopoverImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OverlaysPackage.Literals.POPOVER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Placement getPlacement() {
		return (Placement)eDynamicGet(OverlaysPackage.POPOVER__PLACEMENT, OverlaysPackage.Literals.POPOVER__PLACEMENT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlacement(Placement newPlacement) {
		eDynamicSet(OverlaysPackage.POPOVER__PLACEMENT, OverlaysPackage.Literals.POPOVER__PLACEMENT, newPlacement);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPlacement() {
		eDynamicUnset(OverlaysPackage.POPOVER__PLACEMENT, OverlaysPackage.Literals.POPOVER__PLACEMENT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPlacement() {
		return eDynamicIsSet(OverlaysPackage.POPOVER__PLACEMENT, OverlaysPackage.Literals.POPOVER__PLACEMENT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PopoverHeader getHeader() {
		return (PopoverHeader)eDynamicGet(OverlaysPackage.POPOVER__HEADER, OverlaysPackage.Literals.POPOVER__HEADER, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHeader(PopoverHeader newHeader, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newHeader, OverlaysPackage.POPOVER__HEADER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeader(PopoverHeader newHeader) {
		eDynamicSet(OverlaysPackage.POPOVER__HEADER, OverlaysPackage.Literals.POPOVER__HEADER, newHeader);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PopoverBody getBody() {
		return (PopoverBody)eDynamicGet(OverlaysPackage.POPOVER__BODY, OverlaysPackage.Literals.POPOVER__BODY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBody(PopoverBody newBody, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newBody, OverlaysPackage.POPOVER__BODY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBody(PopoverBody newBody) {
		eDynamicSet(OverlaysPackage.POPOVER__BODY, OverlaysPackage.Literals.POPOVER__BODY, newBody);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OverlaysPackage.POPOVER__HEADER:
				return basicSetHeader(null, msgs);
			case OverlaysPackage.POPOVER__BODY:
				return basicSetBody(null, msgs);
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
			case OverlaysPackage.POPOVER__PLACEMENT:
				return getPlacement();
			case OverlaysPackage.POPOVER__HEADER:
				return getHeader();
			case OverlaysPackage.POPOVER__BODY:
				return getBody();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case OverlaysPackage.POPOVER__PLACEMENT:
				setPlacement((Placement)newValue);
				return;
			case OverlaysPackage.POPOVER__HEADER:
				setHeader((PopoverHeader)newValue);
				return;
			case OverlaysPackage.POPOVER__BODY:
				setBody((PopoverBody)newValue);
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
			case OverlaysPackage.POPOVER__PLACEMENT:
				unsetPlacement();
				return;
			case OverlaysPackage.POPOVER__HEADER:
				setHeader((PopoverHeader)null);
				return;
			case OverlaysPackage.POPOVER__BODY:
				setBody((PopoverBody)null);
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
			case OverlaysPackage.POPOVER__PLACEMENT:
				return isSetPlacement();
			case OverlaysPackage.POPOVER__HEADER:
				return getHeader() != null;
			case OverlaysPackage.POPOVER__BODY:
				return getBody() != null;
		}
		return super.eIsSet(featureID);
	}

} //PopoverImpl
