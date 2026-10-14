/**
 */
package org.nasdanika.sdk.runtime.models.jvm.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.sdk.runtime.models.jvm.JvmPackage;
import org.nasdanika.sdk.runtime.models.jvm.Requires;
import org.nasdanika.sdk.runtime.models.jvm.RequiresModifier;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Requires</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.jvm.impl.RequiresImpl#getModifiers <em>Modifiers</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.jvm.impl.RequiresImpl#getCompiledVersion <em>Compiled Version</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.jvm.impl.RequiresImpl#getModule <em>Module</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RequiresImpl extends JvmElementImpl implements Requires {
	/**
	 * The default value of the '{@link #getCompiledVersion() <em>Compiled Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompiledVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String COMPILED_VERSION_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RequiresImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JvmPackage.Literals.REQUIRES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<RequiresModifier> getModifiers() {
		return (EList<RequiresModifier>)eDynamicGet(JvmPackage.REQUIRES__MODIFIERS, JvmPackage.Literals.REQUIRES__MODIFIERS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCompiledVersion() {
		return (String)eDynamicGet(JvmPackage.REQUIRES__COMPILED_VERSION, JvmPackage.Literals.REQUIRES__COMPILED_VERSION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompiledVersion(String newCompiledVersion) {
		eDynamicSet(JvmPackage.REQUIRES__COMPILED_VERSION, JvmPackage.Literals.REQUIRES__COMPILED_VERSION, newCompiledVersion);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.nasdanika.sdk.runtime.models.jvm.Module getModule() {
		return (org.nasdanika.sdk.runtime.models.jvm.Module)eDynamicGet(JvmPackage.REQUIRES__MODULE, JvmPackage.Literals.REQUIRES__MODULE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.nasdanika.sdk.runtime.models.jvm.Module basicGetModule() {
		return (org.nasdanika.sdk.runtime.models.jvm.Module)eDynamicGet(JvmPackage.REQUIRES__MODULE, JvmPackage.Literals.REQUIRES__MODULE, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModule(org.nasdanika.sdk.runtime.models.jvm.Module newModule) {
		eDynamicSet(JvmPackage.REQUIRES__MODULE, JvmPackage.Literals.REQUIRES__MODULE, newModule);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case JvmPackage.REQUIRES__MODIFIERS:
				return getModifiers();
			case JvmPackage.REQUIRES__COMPILED_VERSION:
				return getCompiledVersion();
			case JvmPackage.REQUIRES__MODULE:
				if (resolve) return getModule();
				return basicGetModule();
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
			case JvmPackage.REQUIRES__MODIFIERS:
				getModifiers().clear();
				getModifiers().addAll((Collection<? extends RequiresModifier>)newValue);
				return;
			case JvmPackage.REQUIRES__COMPILED_VERSION:
				setCompiledVersion((String)newValue);
				return;
			case JvmPackage.REQUIRES__MODULE:
				setModule((org.nasdanika.sdk.runtime.models.jvm.Module)newValue);
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
			case JvmPackage.REQUIRES__MODIFIERS:
				getModifiers().clear();
				return;
			case JvmPackage.REQUIRES__COMPILED_VERSION:
				setCompiledVersion(COMPILED_VERSION_EDEFAULT);
				return;
			case JvmPackage.REQUIRES__MODULE:
				setModule((org.nasdanika.sdk.runtime.models.jvm.Module)null);
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
			case JvmPackage.REQUIRES__MODIFIERS:
				return !getModifiers().isEmpty();
			case JvmPackage.REQUIRES__COMPILED_VERSION:
				return COMPILED_VERSION_EDEFAULT == null ? getCompiledVersion() != null : !COMPILED_VERSION_EDEFAULT.equals(getCompiledVersion());
			case JvmPackage.REQUIRES__MODULE:
				return basicGetModule() != null;
		}
		return super.eIsSet(featureID);
	}

} //RequiresImpl
