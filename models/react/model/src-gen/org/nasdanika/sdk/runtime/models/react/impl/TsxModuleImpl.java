/**
 */
package org.nasdanika.sdk.runtime.models.react.impl;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.sdk.runtime.models.react.ReactPackage;
import org.nasdanika.sdk.runtime.models.react.TsxModule;

import org.nasdanika.sdk.runtime.models.typescript.impl.ModuleImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tsx Module</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.impl.TsxModuleImpl#getDirective <em>Directive</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TsxModuleImpl extends ModuleImpl implements TsxModule {
	/**
	 * The default value of the '{@link #getDirective() <em>Directive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirective()
	 * @generated
	 * @ordered
	 */
	protected static final String DIRECTIVE_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TsxModuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ReactPackage.Literals.TSX_MODULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDirective() {
		return (String)eDynamicGet(ReactPackage.TSX_MODULE__DIRECTIVE, ReactPackage.Literals.TSX_MODULE__DIRECTIVE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDirective(String newDirective) {
		eDynamicSet(ReactPackage.TSX_MODULE__DIRECTIVE, ReactPackage.Literals.TSX_MODULE__DIRECTIVE, newDirective);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ReactPackage.TSX_MODULE__DIRECTIVE:
				return getDirective();
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
			case ReactPackage.TSX_MODULE__DIRECTIVE:
				setDirective((String)newValue);
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
			case ReactPackage.TSX_MODULE__DIRECTIVE:
				setDirective(DIRECTIVE_EDEFAULT);
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
			case ReactPackage.TSX_MODULE__DIRECTIVE:
				return DIRECTIVE_EDEFAULT == null ? getDirective() != null : !DIRECTIVE_EDEFAULT.equals(getDirective());
		}
		return super.eIsSet(featureID);
	}

} //TsxModuleImpl
