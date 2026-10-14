/**
 */
package org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.impl;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.sdk.runtime.models.html.Element;

import org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.impl.ButtonImpl;

import org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.OverlaysPackage;
import org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.Toggle;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Toggle</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.impl.ToggleImpl#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ToggleImpl extends ButtonImpl implements Toggle {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ToggleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OverlaysPackage.Literals.TOGGLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element getTarget() {
		return (Element)eDynamicGet(OverlaysPackage.TOGGLE__TARGET, OverlaysPackage.Literals.TOGGLE__TARGET, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element basicGetTarget() {
		return (Element)eDynamicGet(OverlaysPackage.TOGGLE__TARGET, OverlaysPackage.Literals.TOGGLE__TARGET, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(Element newTarget) {
		eDynamicSet(OverlaysPackage.TOGGLE__TARGET, OverlaysPackage.Literals.TOGGLE__TARGET, newTarget);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OverlaysPackage.TOGGLE__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
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
			case OverlaysPackage.TOGGLE__TARGET:
				setTarget((Element)newValue);
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
			case OverlaysPackage.TOGGLE__TARGET:
				setTarget((Element)null);
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
			case OverlaysPackage.TOGGLE__TARGET:
				return basicGetTarget() != null;
		}
		return super.eIsSet(featureID);
	}

} //ToggleImpl
