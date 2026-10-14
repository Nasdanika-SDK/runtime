/**
 */
package org.nasdanika.sdk.runtime.models.jvm.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.sdk.runtime.models.jvm.DirectiveModifier;
import org.nasdanika.sdk.runtime.models.jvm.Exports;
import org.nasdanika.sdk.runtime.models.jvm.JvmPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Exports</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.jvm.impl.ExportsImpl#getModifiers <em>Modifiers</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.jvm.impl.ExportsImpl#getTargetNames <em>Target Names</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.jvm.impl.ExportsImpl#getPackage <em>Package</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.jvm.impl.ExportsImpl#getTargets <em>Targets</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExportsImpl extends JvmElementImpl implements Exports {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExportsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JvmPackage.Literals.EXPORTS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<DirectiveModifier> getModifiers() {
		return (EList<DirectiveModifier>)eDynamicGet(JvmPackage.EXPORTS__MODIFIERS, JvmPackage.Literals.EXPORTS__MODIFIERS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<String> getTargetNames() {
		return (EList<String>)eDynamicGet(JvmPackage.EXPORTS__TARGET_NAMES, JvmPackage.Literals.EXPORTS__TARGET_NAMES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.nasdanika.sdk.runtime.models.jvm.Package getPackage() {
		return (org.nasdanika.sdk.runtime.models.jvm.Package)eDynamicGet(JvmPackage.EXPORTS__PACKAGE, JvmPackage.Literals.EXPORTS__PACKAGE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.nasdanika.sdk.runtime.models.jvm.Package basicGetPackage() {
		return (org.nasdanika.sdk.runtime.models.jvm.Package)eDynamicGet(JvmPackage.EXPORTS__PACKAGE, JvmPackage.Literals.EXPORTS__PACKAGE, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPackage(org.nasdanika.sdk.runtime.models.jvm.Package newPackage) {
		eDynamicSet(JvmPackage.EXPORTS__PACKAGE, JvmPackage.Literals.EXPORTS__PACKAGE, newPackage);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<org.nasdanika.sdk.runtime.models.jvm.Module> getTargets() {
		return (EList<org.nasdanika.sdk.runtime.models.jvm.Module>)eDynamicGet(JvmPackage.EXPORTS__TARGETS, JvmPackage.Literals.EXPORTS__TARGETS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case JvmPackage.EXPORTS__MODIFIERS:
				return getModifiers();
			case JvmPackage.EXPORTS__TARGET_NAMES:
				return getTargetNames();
			case JvmPackage.EXPORTS__PACKAGE:
				if (resolve) return getPackage();
				return basicGetPackage();
			case JvmPackage.EXPORTS__TARGETS:
				return getTargets();
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
			case JvmPackage.EXPORTS__MODIFIERS:
				getModifiers().clear();
				getModifiers().addAll((Collection<? extends DirectiveModifier>)newValue);
				return;
			case JvmPackage.EXPORTS__TARGET_NAMES:
				getTargetNames().clear();
				getTargetNames().addAll((Collection<? extends String>)newValue);
				return;
			case JvmPackage.EXPORTS__PACKAGE:
				setPackage((org.nasdanika.sdk.runtime.models.jvm.Package)newValue);
				return;
			case JvmPackage.EXPORTS__TARGETS:
				getTargets().clear();
				getTargets().addAll((Collection<? extends org.nasdanika.sdk.runtime.models.jvm.Module>)newValue);
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
			case JvmPackage.EXPORTS__MODIFIERS:
				getModifiers().clear();
				return;
			case JvmPackage.EXPORTS__TARGET_NAMES:
				getTargetNames().clear();
				return;
			case JvmPackage.EXPORTS__PACKAGE:
				setPackage((org.nasdanika.sdk.runtime.models.jvm.Package)null);
				return;
			case JvmPackage.EXPORTS__TARGETS:
				getTargets().clear();
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
			case JvmPackage.EXPORTS__MODIFIERS:
				return !getModifiers().isEmpty();
			case JvmPackage.EXPORTS__TARGET_NAMES:
				return !getTargetNames().isEmpty();
			case JvmPackage.EXPORTS__PACKAGE:
				return basicGetPackage() != null;
			case JvmPackage.EXPORTS__TARGETS:
				return !getTargets().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ExportsImpl
