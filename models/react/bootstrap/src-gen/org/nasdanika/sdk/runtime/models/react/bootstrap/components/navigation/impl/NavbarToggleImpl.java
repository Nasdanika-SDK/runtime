/**
 */
package org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.impl;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.NavbarToggle;
import org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.NavigationPackage;

import org.nasdanika.sdk.runtime.models.react.bootstrap.impl.BootstrapComponentImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Navbar Toggle</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.impl.NavbarToggleImpl#getControls <em>Controls</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NavbarToggleImpl extends BootstrapComponentImpl implements NavbarToggle {
	/**
	 * The default value of the '{@link #getControls() <em>Controls</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControls()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTROLS_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NavbarToggleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NavigationPackage.Literals.NAVBAR_TOGGLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getControls() {
		return (String)eDynamicGet(NavigationPackage.NAVBAR_TOGGLE__CONTROLS, NavigationPackage.Literals.NAVBAR_TOGGLE__CONTROLS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setControls(String newControls) {
		eDynamicSet(NavigationPackage.NAVBAR_TOGGLE__CONTROLS, NavigationPackage.Literals.NAVBAR_TOGGLE__CONTROLS, newControls);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case NavigationPackage.NAVBAR_TOGGLE__CONTROLS:
				return getControls();
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
			case NavigationPackage.NAVBAR_TOGGLE__CONTROLS:
				setControls((String)newValue);
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
			case NavigationPackage.NAVBAR_TOGGLE__CONTROLS:
				setControls(CONTROLS_EDEFAULT);
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
			case NavigationPackage.NAVBAR_TOGGLE__CONTROLS:
				return CONTROLS_EDEFAULT == null ? getControls() != null : !CONTROLS_EDEFAULT.equals(getControls());
		}
		return super.eIsSet(featureID);
	}

} //NavbarToggleImpl
