/**
 */
package org.nasdanika.sdk.runtime.models.drawio.impl;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.sdk.runtime.models.drawio.DrawioPackage;
import org.nasdanika.sdk.runtime.models.drawio.SetOpacity;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Set Opacity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.drawio.impl.SetOpacityImpl#getOpacity <em>Opacity</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SetOpacityImpl extends TargetedActionImpl implements SetOpacity {
	/**
	 * The default value of the '{@link #getOpacity() <em>Opacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpacity()
	 * @generated
	 * @ordered
	 */
	protected static final double OPACITY_EDEFAULT = 0.0;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SetOpacityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DrawioPackage.Literals.SET_OPACITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getOpacity() {
		return (Double)eDynamicGet(DrawioPackage.SET_OPACITY__OPACITY, DrawioPackage.Literals.SET_OPACITY__OPACITY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOpacity(double newOpacity) {
		eDynamicSet(DrawioPackage.SET_OPACITY__OPACITY, DrawioPackage.Literals.SET_OPACITY__OPACITY, newOpacity);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DrawioPackage.SET_OPACITY__OPACITY:
				return getOpacity();
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
			case DrawioPackage.SET_OPACITY__OPACITY:
				setOpacity((Double)newValue);
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
			case DrawioPackage.SET_OPACITY__OPACITY:
				setOpacity(OPACITY_EDEFAULT);
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
			case DrawioPackage.SET_OPACITY__OPACITY:
				return getOpacity() != OPACITY_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

} //SetOpacityImpl
