/**
 */
package org.nasdanika.sdk.runtime.models.jvm.impl;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.sdk.runtime.models.jvm.JvmPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Class Loader</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.jvm.impl.ClassLoaderImpl#getLoaderTypeName <em>Loader Type Name</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.jvm.impl.ClassLoaderImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.jvm.impl.ClassLoaderImpl#getUnnamedModule <em>Unnamed Module</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClassLoaderImpl extends JvmElementImpl implements org.nasdanika.sdk.runtime.models.jvm.ClassLoader {
	/**
	 * The default value of the '{@link #getLoaderTypeName() <em>Loader Type Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoaderTypeName()
	 * @generated
	 * @ordered
	 */
	protected static final String LOADER_TYPE_NAME_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassLoaderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JvmPackage.Literals.CLASS_LOADER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLoaderTypeName() {
		return (String)eDynamicGet(JvmPackage.CLASS_LOADER__LOADER_TYPE_NAME, JvmPackage.Literals.CLASS_LOADER__LOADER_TYPE_NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLoaderTypeName(String newLoaderTypeName) {
		eDynamicSet(JvmPackage.CLASS_LOADER__LOADER_TYPE_NAME, JvmPackage.Literals.CLASS_LOADER__LOADER_TYPE_NAME, newLoaderTypeName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.nasdanika.sdk.runtime.models.jvm.ClassLoader getParent() {
		return (org.nasdanika.sdk.runtime.models.jvm.ClassLoader)eDynamicGet(JvmPackage.CLASS_LOADER__PARENT, JvmPackage.Literals.CLASS_LOADER__PARENT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.nasdanika.sdk.runtime.models.jvm.ClassLoader basicGetParent() {
		return (org.nasdanika.sdk.runtime.models.jvm.ClassLoader)eDynamicGet(JvmPackage.CLASS_LOADER__PARENT, JvmPackage.Literals.CLASS_LOADER__PARENT, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(org.nasdanika.sdk.runtime.models.jvm.ClassLoader newParent) {
		eDynamicSet(JvmPackage.CLASS_LOADER__PARENT, JvmPackage.Literals.CLASS_LOADER__PARENT, newParent);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.nasdanika.sdk.runtime.models.jvm.Module getUnnamedModule() {
		return (org.nasdanika.sdk.runtime.models.jvm.Module)eDynamicGet(JvmPackage.CLASS_LOADER__UNNAMED_MODULE, JvmPackage.Literals.CLASS_LOADER__UNNAMED_MODULE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.nasdanika.sdk.runtime.models.jvm.Module basicGetUnnamedModule() {
		return (org.nasdanika.sdk.runtime.models.jvm.Module)eDynamicGet(JvmPackage.CLASS_LOADER__UNNAMED_MODULE, JvmPackage.Literals.CLASS_LOADER__UNNAMED_MODULE, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnnamedModule(org.nasdanika.sdk.runtime.models.jvm.Module newUnnamedModule) {
		eDynamicSet(JvmPackage.CLASS_LOADER__UNNAMED_MODULE, JvmPackage.Literals.CLASS_LOADER__UNNAMED_MODULE, newUnnamedModule);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case JvmPackage.CLASS_LOADER__LOADER_TYPE_NAME:
				return getLoaderTypeName();
			case JvmPackage.CLASS_LOADER__PARENT:
				if (resolve) return getParent();
				return basicGetParent();
			case JvmPackage.CLASS_LOADER__UNNAMED_MODULE:
				if (resolve) return getUnnamedModule();
				return basicGetUnnamedModule();
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
			case JvmPackage.CLASS_LOADER__LOADER_TYPE_NAME:
				setLoaderTypeName((String)newValue);
				return;
			case JvmPackage.CLASS_LOADER__PARENT:
				setParent((org.nasdanika.sdk.runtime.models.jvm.ClassLoader)newValue);
				return;
			case JvmPackage.CLASS_LOADER__UNNAMED_MODULE:
				setUnnamedModule((org.nasdanika.sdk.runtime.models.jvm.Module)newValue);
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
			case JvmPackage.CLASS_LOADER__LOADER_TYPE_NAME:
				setLoaderTypeName(LOADER_TYPE_NAME_EDEFAULT);
				return;
			case JvmPackage.CLASS_LOADER__PARENT:
				setParent((org.nasdanika.sdk.runtime.models.jvm.ClassLoader)null);
				return;
			case JvmPackage.CLASS_LOADER__UNNAMED_MODULE:
				setUnnamedModule((org.nasdanika.sdk.runtime.models.jvm.Module)null);
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
			case JvmPackage.CLASS_LOADER__LOADER_TYPE_NAME:
				return LOADER_TYPE_NAME_EDEFAULT == null ? getLoaderTypeName() != null : !LOADER_TYPE_NAME_EDEFAULT.equals(getLoaderTypeName());
			case JvmPackage.CLASS_LOADER__PARENT:
				return basicGetParent() != null;
			case JvmPackage.CLASS_LOADER__UNNAMED_MODULE:
				return basicGetUnnamedModule() != null;
		}
		return super.eIsSet(featureID);
	}

} //ClassLoaderImpl
