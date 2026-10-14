/**
 */
package org.nasdanika.sdk.runtime.models.react.bootstrap.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.sdk.runtime.models.react.bootstrap.BootstrapPackage;
import org.nasdanika.sdk.runtime.models.react.bootstrap.ThemeProvider;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Theme Provider</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.bootstrap.impl.ThemeProviderImpl#getBreakpoints <em>Breakpoints</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.bootstrap.impl.ThemeProviderImpl#getMinBreakpoint <em>Min Breakpoint</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.bootstrap.impl.ThemeProviderImpl#getDir <em>Dir</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ThemeProviderImpl extends BootstrapComponentImpl implements ThemeProvider {
	/**
	 * The default value of the '{@link #getMinBreakpoint() <em>Min Breakpoint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinBreakpoint()
	 * @generated
	 * @ordered
	 */
	protected static final String MIN_BREAKPOINT_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getDir() <em>Dir</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDir()
	 * @generated
	 * @ordered
	 */
	protected static final String DIR_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ThemeProviderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BootstrapPackage.Literals.THEME_PROVIDER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<String> getBreakpoints() {
		return (EList<String>)eDynamicGet(BootstrapPackage.THEME_PROVIDER__BREAKPOINTS, BootstrapPackage.Literals.THEME_PROVIDER__BREAKPOINTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMinBreakpoint() {
		return (String)eDynamicGet(BootstrapPackage.THEME_PROVIDER__MIN_BREAKPOINT, BootstrapPackage.Literals.THEME_PROVIDER__MIN_BREAKPOINT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinBreakpoint(String newMinBreakpoint) {
		eDynamicSet(BootstrapPackage.THEME_PROVIDER__MIN_BREAKPOINT, BootstrapPackage.Literals.THEME_PROVIDER__MIN_BREAKPOINT, newMinBreakpoint);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDir() {
		return (String)eDynamicGet(BootstrapPackage.THEME_PROVIDER__DIR, BootstrapPackage.Literals.THEME_PROVIDER__DIR, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDir(String newDir) {
		eDynamicSet(BootstrapPackage.THEME_PROVIDER__DIR, BootstrapPackage.Literals.THEME_PROVIDER__DIR, newDir);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BootstrapPackage.THEME_PROVIDER__BREAKPOINTS:
				return getBreakpoints();
			case BootstrapPackage.THEME_PROVIDER__MIN_BREAKPOINT:
				return getMinBreakpoint();
			case BootstrapPackage.THEME_PROVIDER__DIR:
				return getDir();
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
			case BootstrapPackage.THEME_PROVIDER__BREAKPOINTS:
				getBreakpoints().clear();
				getBreakpoints().addAll((Collection<? extends String>)newValue);
				return;
			case BootstrapPackage.THEME_PROVIDER__MIN_BREAKPOINT:
				setMinBreakpoint((String)newValue);
				return;
			case BootstrapPackage.THEME_PROVIDER__DIR:
				setDir((String)newValue);
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
			case BootstrapPackage.THEME_PROVIDER__BREAKPOINTS:
				getBreakpoints().clear();
				return;
			case BootstrapPackage.THEME_PROVIDER__MIN_BREAKPOINT:
				setMinBreakpoint(MIN_BREAKPOINT_EDEFAULT);
				return;
			case BootstrapPackage.THEME_PROVIDER__DIR:
				setDir(DIR_EDEFAULT);
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
			case BootstrapPackage.THEME_PROVIDER__BREAKPOINTS:
				return !getBreakpoints().isEmpty();
			case BootstrapPackage.THEME_PROVIDER__MIN_BREAKPOINT:
				return MIN_BREAKPOINT_EDEFAULT == null ? getMinBreakpoint() != null : !MIN_BREAKPOINT_EDEFAULT.equals(getMinBreakpoint());
			case BootstrapPackage.THEME_PROVIDER__DIR:
				return DIR_EDEFAULT == null ? getDir() != null : !DIR_EDEFAULT.equals(getDir());
		}
		return super.eIsSet(featureID);
	}

} //ThemeProviderImpl
