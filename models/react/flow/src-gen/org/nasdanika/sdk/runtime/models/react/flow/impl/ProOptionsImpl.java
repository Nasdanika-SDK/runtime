/**
 */
package org.nasdanika.sdk.runtime.models.react.flow.impl;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.nasdanika.sdk.runtime.models.react.flow.FlowPackage;
import org.nasdanika.sdk.runtime.models.react.flow.ProOptions;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pro Options</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.flow.impl.ProOptionsImpl#isHideAttribution <em>Hide Attribution</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProOptionsImpl extends MinimalEObjectImpl.Container implements ProOptions {
	/**
	 * The default value of the '{@link #isHideAttribution() <em>Hide Attribution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHideAttribution()
	 * @generated
	 * @ordered
	 */
	protected static final boolean HIDE_ATTRIBUTION_EDEFAULT = false;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProOptionsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FlowPackage.Literals.PRO_OPTIONS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isHideAttribution() {
		return (Boolean)eDynamicGet(FlowPackage.PRO_OPTIONS__HIDE_ATTRIBUTION, FlowPackage.Literals.PRO_OPTIONS__HIDE_ATTRIBUTION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHideAttribution(boolean newHideAttribution) {
		eDynamicSet(FlowPackage.PRO_OPTIONS__HIDE_ATTRIBUTION, FlowPackage.Literals.PRO_OPTIONS__HIDE_ATTRIBUTION, newHideAttribution);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FlowPackage.PRO_OPTIONS__HIDE_ATTRIBUTION:
				return isHideAttribution();
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
			case FlowPackage.PRO_OPTIONS__HIDE_ATTRIBUTION:
				setHideAttribution((Boolean)newValue);
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
			case FlowPackage.PRO_OPTIONS__HIDE_ATTRIBUTION:
				setHideAttribution(HIDE_ATTRIBUTION_EDEFAULT);
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
			case FlowPackage.PRO_OPTIONS__HIDE_ATTRIBUTION:
				return isHideAttribution() != HIDE_ATTRIBUTION_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

} //ProOptionsImpl
