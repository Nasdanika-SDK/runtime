/**
 */
package org.nasdanika.sdk.runtime.models.jvm.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.sdk.runtime.models.jvm.DirectiveModifier;
import org.nasdanika.sdk.runtime.models.jvm.JvmPackage;
import org.nasdanika.sdk.runtime.models.jvm.Opens;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Opens</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.jvm.impl.OpensImpl#getModifiers <em>Modifiers</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.jvm.impl.OpensImpl#getTargetNames <em>Target Names</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.jvm.impl.OpensImpl#getPackage <em>Package</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.jvm.impl.OpensImpl#getTargets <em>Targets</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OpensImpl extends JvmElementImpl implements Opens {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OpensImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JvmPackage.Literals.OPENS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<DirectiveModifier> getModifiers() {
		return (EList<DirectiveModifier>)eDynamicGet(JvmPackage.OPENS__MODIFIERS, JvmPackage.Literals.OPENS__MODIFIERS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<String> getTargetNames() {
		return (EList<String>)eDynamicGet(JvmPackage.OPENS__TARGET_NAMES, JvmPackage.Literals.OPENS__TARGET_NAMES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.nasdanika.sdk.runtime.models.jvm.Package getPackage() {
		return (org.nasdanika.sdk.runtime.models.jvm.Package)eDynamicGet(JvmPackage.OPENS__PACKAGE, JvmPackage.Literals.OPENS__PACKAGE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.nasdanika.sdk.runtime.models.jvm.Package basicGetPackage() {
		return (org.nasdanika.sdk.runtime.models.jvm.Package)eDynamicGet(JvmPackage.OPENS__PACKAGE, JvmPackage.Literals.OPENS__PACKAGE, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPackage(org.nasdanika.sdk.runtime.models.jvm.Package newPackage) {
		eDynamicSet(JvmPackage.OPENS__PACKAGE, JvmPackage.Literals.OPENS__PACKAGE, newPackage);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<org.nasdanika.sdk.runtime.models.jvm.Module> getTargets() {
		return (EList<org.nasdanika.sdk.runtime.models.jvm.Module>)eDynamicGet(JvmPackage.OPENS__TARGETS, JvmPackage.Literals.OPENS__TARGETS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case JvmPackage.OPENS__MODIFIERS:
				return getModifiers();
			case JvmPackage.OPENS__TARGET_NAMES:
				return getTargetNames();
			case JvmPackage.OPENS__PACKAGE:
				if (resolve) return getPackage();
				return basicGetPackage();
			case JvmPackage.OPENS__TARGETS:
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
			case JvmPackage.OPENS__MODIFIERS:
				getModifiers().clear();
				getModifiers().addAll((Collection<? extends DirectiveModifier>)newValue);
				return;
			case JvmPackage.OPENS__TARGET_NAMES:
				getTargetNames().clear();
				getTargetNames().addAll((Collection<? extends String>)newValue);
				return;
			case JvmPackage.OPENS__PACKAGE:
				setPackage((org.nasdanika.sdk.runtime.models.jvm.Package)newValue);
				return;
			case JvmPackage.OPENS__TARGETS:
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
			case JvmPackage.OPENS__MODIFIERS:
				getModifiers().clear();
				return;
			case JvmPackage.OPENS__TARGET_NAMES:
				getTargetNames().clear();
				return;
			case JvmPackage.OPENS__PACKAGE:
				setPackage((org.nasdanika.sdk.runtime.models.jvm.Package)null);
				return;
			case JvmPackage.OPENS__TARGETS:
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
			case JvmPackage.OPENS__MODIFIERS:
				return !getModifiers().isEmpty();
			case JvmPackage.OPENS__TARGET_NAMES:
				return !getTargetNames().isEmpty();
			case JvmPackage.OPENS__PACKAGE:
				return basicGetPackage() != null;
			case JvmPackage.OPENS__TARGETS:
				return !getTargets().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //OpensImpl
