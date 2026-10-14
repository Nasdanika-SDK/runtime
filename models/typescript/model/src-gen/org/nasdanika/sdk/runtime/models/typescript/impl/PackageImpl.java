/**
 */
package org.nasdanika.sdk.runtime.models.typescript.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.sdk.runtime.models.typescript.TypescriptPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Package</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.typescript.impl.PackageImpl#getPackageName <em>Package Name</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.typescript.impl.PackageImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.typescript.impl.PackageImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.typescript.impl.PackageImpl#getLicense <em>License</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.typescript.impl.PackageImpl#getModuleType <em>Module Type</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.typescript.impl.PackageImpl#getDependencies <em>Dependencies</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.typescript.impl.PackageImpl#getPeerDependencies <em>Peer Dependencies</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.typescript.impl.PackageImpl#getModules <em>Modules</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PackageImpl extends TypeScriptElementImpl implements org.nasdanika.sdk.runtime.models.typescript.Package {
	/**
	 * The default value of the '{@link #getPackageName() <em>Package Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackageName()
	 * @generated
	 * @ordered
	 */
	protected static final String PACKAGE_NAME_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getLicense() <em>License</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLicense()
	 * @generated
	 * @ordered
	 */
	protected static final String LICENSE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getModuleType() <em>Module Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModuleType()
	 * @generated
	 * @ordered
	 */
	protected static final String MODULE_TYPE_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PackageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypescriptPackage.Literals.PACKAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPackageName() {
		return (String)eDynamicGet(TypescriptPackage.PACKAGE__PACKAGE_NAME, TypescriptPackage.Literals.PACKAGE__PACKAGE_NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPackageName(String newPackageName) {
		eDynamicSet(TypescriptPackage.PACKAGE__PACKAGE_NAME, TypescriptPackage.Literals.PACKAGE__PACKAGE_NAME, newPackageName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVersion() {
		return (String)eDynamicGet(TypescriptPackage.PACKAGE__VERSION, TypescriptPackage.Literals.PACKAGE__VERSION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersion(String newVersion) {
		eDynamicSet(TypescriptPackage.PACKAGE__VERSION, TypescriptPackage.Literals.PACKAGE__VERSION, newVersion);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return (String)eDynamicGet(TypescriptPackage.PACKAGE__DESCRIPTION, TypescriptPackage.Literals.PACKAGE__DESCRIPTION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		eDynamicSet(TypescriptPackage.PACKAGE__DESCRIPTION, TypescriptPackage.Literals.PACKAGE__DESCRIPTION, newDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLicense() {
		return (String)eDynamicGet(TypescriptPackage.PACKAGE__LICENSE, TypescriptPackage.Literals.PACKAGE__LICENSE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLicense(String newLicense) {
		eDynamicSet(TypescriptPackage.PACKAGE__LICENSE, TypescriptPackage.Literals.PACKAGE__LICENSE, newLicense);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getModuleType() {
		return (String)eDynamicGet(TypescriptPackage.PACKAGE__MODULE_TYPE, TypescriptPackage.Literals.PACKAGE__MODULE_TYPE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModuleType(String newModuleType) {
		eDynamicSet(TypescriptPackage.PACKAGE__MODULE_TYPE, TypescriptPackage.Literals.PACKAGE__MODULE_TYPE, newModuleType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<String> getDependencies() {
		return (EList<String>)eDynamicGet(TypescriptPackage.PACKAGE__DEPENDENCIES, TypescriptPackage.Literals.PACKAGE__DEPENDENCIES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<String> getPeerDependencies() {
		return (EList<String>)eDynamicGet(TypescriptPackage.PACKAGE__PEER_DEPENDENCIES, TypescriptPackage.Literals.PACKAGE__PEER_DEPENDENCIES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<org.nasdanika.sdk.runtime.models.typescript.Module> getModules() {
		return (EList<org.nasdanika.sdk.runtime.models.typescript.Module>)eDynamicGet(TypescriptPackage.PACKAGE__MODULES, TypescriptPackage.Literals.PACKAGE__MODULES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypescriptPackage.PACKAGE__MODULES:
				return ((InternalEList<?>)getModules()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TypescriptPackage.PACKAGE__PACKAGE_NAME:
				return getPackageName();
			case TypescriptPackage.PACKAGE__VERSION:
				return getVersion();
			case TypescriptPackage.PACKAGE__DESCRIPTION:
				return getDescription();
			case TypescriptPackage.PACKAGE__LICENSE:
				return getLicense();
			case TypescriptPackage.PACKAGE__MODULE_TYPE:
				return getModuleType();
			case TypescriptPackage.PACKAGE__DEPENDENCIES:
				return getDependencies();
			case TypescriptPackage.PACKAGE__PEER_DEPENDENCIES:
				return getPeerDependencies();
			case TypescriptPackage.PACKAGE__MODULES:
				return getModules();
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
			case TypescriptPackage.PACKAGE__PACKAGE_NAME:
				setPackageName((String)newValue);
				return;
			case TypescriptPackage.PACKAGE__VERSION:
				setVersion((String)newValue);
				return;
			case TypescriptPackage.PACKAGE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case TypescriptPackage.PACKAGE__LICENSE:
				setLicense((String)newValue);
				return;
			case TypescriptPackage.PACKAGE__MODULE_TYPE:
				setModuleType((String)newValue);
				return;
			case TypescriptPackage.PACKAGE__DEPENDENCIES:
				getDependencies().clear();
				getDependencies().addAll((Collection<? extends String>)newValue);
				return;
			case TypescriptPackage.PACKAGE__PEER_DEPENDENCIES:
				getPeerDependencies().clear();
				getPeerDependencies().addAll((Collection<? extends String>)newValue);
				return;
			case TypescriptPackage.PACKAGE__MODULES:
				getModules().clear();
				getModules().addAll((Collection<? extends org.nasdanika.sdk.runtime.models.typescript.Module>)newValue);
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
			case TypescriptPackage.PACKAGE__PACKAGE_NAME:
				setPackageName(PACKAGE_NAME_EDEFAULT);
				return;
			case TypescriptPackage.PACKAGE__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case TypescriptPackage.PACKAGE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case TypescriptPackage.PACKAGE__LICENSE:
				setLicense(LICENSE_EDEFAULT);
				return;
			case TypescriptPackage.PACKAGE__MODULE_TYPE:
				setModuleType(MODULE_TYPE_EDEFAULT);
				return;
			case TypescriptPackage.PACKAGE__DEPENDENCIES:
				getDependencies().clear();
				return;
			case TypescriptPackage.PACKAGE__PEER_DEPENDENCIES:
				getPeerDependencies().clear();
				return;
			case TypescriptPackage.PACKAGE__MODULES:
				getModules().clear();
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
			case TypescriptPackage.PACKAGE__PACKAGE_NAME:
				return PACKAGE_NAME_EDEFAULT == null ? getPackageName() != null : !PACKAGE_NAME_EDEFAULT.equals(getPackageName());
			case TypescriptPackage.PACKAGE__VERSION:
				return VERSION_EDEFAULT == null ? getVersion() != null : !VERSION_EDEFAULT.equals(getVersion());
			case TypescriptPackage.PACKAGE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? getDescription() != null : !DESCRIPTION_EDEFAULT.equals(getDescription());
			case TypescriptPackage.PACKAGE__LICENSE:
				return LICENSE_EDEFAULT == null ? getLicense() != null : !LICENSE_EDEFAULT.equals(getLicense());
			case TypescriptPackage.PACKAGE__MODULE_TYPE:
				return MODULE_TYPE_EDEFAULT == null ? getModuleType() != null : !MODULE_TYPE_EDEFAULT.equals(getModuleType());
			case TypescriptPackage.PACKAGE__DEPENDENCIES:
				return !getDependencies().isEmpty();
			case TypescriptPackage.PACKAGE__PEER_DEPENDENCIES:
				return !getPeerDependencies().isEmpty();
			case TypescriptPackage.PACKAGE__MODULES:
				return !getModules().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PackageImpl
