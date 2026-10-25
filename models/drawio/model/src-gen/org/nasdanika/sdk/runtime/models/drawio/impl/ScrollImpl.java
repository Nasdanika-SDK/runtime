/**
 */
package org.nasdanika.sdk.runtime.models.drawio.impl;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.sdk.runtime.models.drawio.DrawioPackage;
import org.nasdanika.sdk.runtime.models.drawio.Scroll;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Scroll</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.drawio.impl.ScrollImpl#isSmooth <em>Smooth</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ScrollImpl extends TargetedActionImpl implements Scroll {
	/**
	 * The default value of the '{@link #isSmooth() <em>Smooth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSmooth()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SMOOTH_EDEFAULT = false;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScrollImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DrawioPackage.Literals.SCROLL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSmooth() {
		return (Boolean)eDynamicGet(DrawioPackage.SCROLL__SMOOTH, DrawioPackage.Literals.SCROLL__SMOOTH, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSmooth(boolean newSmooth) {
		eDynamicSet(DrawioPackage.SCROLL__SMOOTH, DrawioPackage.Literals.SCROLL__SMOOTH, newSmooth);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DrawioPackage.SCROLL__SMOOTH:
				return isSmooth();
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
			case DrawioPackage.SCROLL__SMOOTH:
				setSmooth((Boolean)newValue);
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
			case DrawioPackage.SCROLL__SMOOTH:
				setSmooth(SMOOTH_EDEFAULT);
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
			case DrawioPackage.SCROLL__SMOOTH:
				return isSmooth() != SMOOTH_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

} //ScrollImpl
