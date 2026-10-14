/**
 */
package org.nasdanika.sdk.runtime.models.jvm.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.sdk.runtime.models.core.impl.ModelElementImpl;

import org.nasdanika.sdk.runtime.models.jvm.JavaVirtualMachine;
import org.nasdanika.sdk.runtime.models.jvm.JvmPackage;
import org.nasdanika.sdk.runtime.models.jvm.Layer;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Java Virtual Machine</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.jvm.impl.JavaVirtualMachineImpl#isLive <em>Live</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.jvm.impl.JavaVirtualMachineImpl#getVmName <em>Vm Name</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.jvm.impl.JavaVirtualMachineImpl#getVmVersion <em>Vm Version</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.jvm.impl.JavaVirtualMachineImpl#getVmVendor <em>Vm Vendor</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.jvm.impl.JavaVirtualMachineImpl#getSpecificationVersion <em>Specification Version</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.jvm.impl.JavaVirtualMachineImpl#getModules <em>Modules</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.jvm.impl.JavaVirtualMachineImpl#getLayers <em>Layers</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.jvm.impl.JavaVirtualMachineImpl#getClassLoaders <em>Class Loaders</em>}</li>
 * </ul>
 *
 * @generated
 */
public class JavaVirtualMachineImpl extends ModelElementImpl implements JavaVirtualMachine {
	/**
	 * The default value of the '{@link #isLive() <em>Live</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLive()
	 * @generated
	 * @ordered
	 */
	protected static final boolean LIVE_EDEFAULT = false;

	/**
	 * The default value of the '{@link #getVmName() <em>Vm Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVmName()
	 * @generated
	 * @ordered
	 */
	protected static final String VM_NAME_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getVmVersion() <em>Vm Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVmVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String VM_VERSION_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getVmVendor() <em>Vm Vendor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVmVendor()
	 * @generated
	 * @ordered
	 */
	protected static final String VM_VENDOR_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getSpecificationVersion() <em>Specification Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecificationVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String SPECIFICATION_VERSION_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JavaVirtualMachineImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JvmPackage.Literals.JAVA_VIRTUAL_MACHINE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isLive() {
		return (Boolean)eDynamicGet(JvmPackage.JAVA_VIRTUAL_MACHINE__LIVE, JvmPackage.Literals.JAVA_VIRTUAL_MACHINE__LIVE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLive(boolean newLive) {
		eDynamicSet(JvmPackage.JAVA_VIRTUAL_MACHINE__LIVE, JvmPackage.Literals.JAVA_VIRTUAL_MACHINE__LIVE, newLive);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVmName() {
		return (String)eDynamicGet(JvmPackage.JAVA_VIRTUAL_MACHINE__VM_NAME, JvmPackage.Literals.JAVA_VIRTUAL_MACHINE__VM_NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVmName(String newVmName) {
		eDynamicSet(JvmPackage.JAVA_VIRTUAL_MACHINE__VM_NAME, JvmPackage.Literals.JAVA_VIRTUAL_MACHINE__VM_NAME, newVmName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVmVersion() {
		return (String)eDynamicGet(JvmPackage.JAVA_VIRTUAL_MACHINE__VM_VERSION, JvmPackage.Literals.JAVA_VIRTUAL_MACHINE__VM_VERSION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVmVersion(String newVmVersion) {
		eDynamicSet(JvmPackage.JAVA_VIRTUAL_MACHINE__VM_VERSION, JvmPackage.Literals.JAVA_VIRTUAL_MACHINE__VM_VERSION, newVmVersion);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVmVendor() {
		return (String)eDynamicGet(JvmPackage.JAVA_VIRTUAL_MACHINE__VM_VENDOR, JvmPackage.Literals.JAVA_VIRTUAL_MACHINE__VM_VENDOR, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVmVendor(String newVmVendor) {
		eDynamicSet(JvmPackage.JAVA_VIRTUAL_MACHINE__VM_VENDOR, JvmPackage.Literals.JAVA_VIRTUAL_MACHINE__VM_VENDOR, newVmVendor);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSpecificationVersion() {
		return (String)eDynamicGet(JvmPackage.JAVA_VIRTUAL_MACHINE__SPECIFICATION_VERSION, JvmPackage.Literals.JAVA_VIRTUAL_MACHINE__SPECIFICATION_VERSION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpecificationVersion(String newSpecificationVersion) {
		eDynamicSet(JvmPackage.JAVA_VIRTUAL_MACHINE__SPECIFICATION_VERSION, JvmPackage.Literals.JAVA_VIRTUAL_MACHINE__SPECIFICATION_VERSION, newSpecificationVersion);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<org.nasdanika.sdk.runtime.models.jvm.Module> getModules() {
		return (EList<org.nasdanika.sdk.runtime.models.jvm.Module>)eDynamicGet(JvmPackage.JAVA_VIRTUAL_MACHINE__MODULES, JvmPackage.Literals.JAVA_VIRTUAL_MACHINE__MODULES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Layer> getLayers() {
		return (EList<Layer>)eDynamicGet(JvmPackage.JAVA_VIRTUAL_MACHINE__LAYERS, JvmPackage.Literals.JAVA_VIRTUAL_MACHINE__LAYERS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<org.nasdanika.sdk.runtime.models.jvm.ClassLoader> getClassLoaders() {
		return (EList<org.nasdanika.sdk.runtime.models.jvm.ClassLoader>)eDynamicGet(JvmPackage.JAVA_VIRTUAL_MACHINE__CLASS_LOADERS, JvmPackage.Literals.JAVA_VIRTUAL_MACHINE__CLASS_LOADERS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JvmPackage.JAVA_VIRTUAL_MACHINE__MODULES:
				return ((InternalEList<?>)getModules()).basicRemove(otherEnd, msgs);
			case JvmPackage.JAVA_VIRTUAL_MACHINE__LAYERS:
				return ((InternalEList<?>)getLayers()).basicRemove(otherEnd, msgs);
			case JvmPackage.JAVA_VIRTUAL_MACHINE__CLASS_LOADERS:
				return ((InternalEList<?>)getClassLoaders()).basicRemove(otherEnd, msgs);
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
			case JvmPackage.JAVA_VIRTUAL_MACHINE__LIVE:
				return isLive();
			case JvmPackage.JAVA_VIRTUAL_MACHINE__VM_NAME:
				return getVmName();
			case JvmPackage.JAVA_VIRTUAL_MACHINE__VM_VERSION:
				return getVmVersion();
			case JvmPackage.JAVA_VIRTUAL_MACHINE__VM_VENDOR:
				return getVmVendor();
			case JvmPackage.JAVA_VIRTUAL_MACHINE__SPECIFICATION_VERSION:
				return getSpecificationVersion();
			case JvmPackage.JAVA_VIRTUAL_MACHINE__MODULES:
				return getModules();
			case JvmPackage.JAVA_VIRTUAL_MACHINE__LAYERS:
				return getLayers();
			case JvmPackage.JAVA_VIRTUAL_MACHINE__CLASS_LOADERS:
				return getClassLoaders();
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
			case JvmPackage.JAVA_VIRTUAL_MACHINE__LIVE:
				setLive((Boolean)newValue);
				return;
			case JvmPackage.JAVA_VIRTUAL_MACHINE__VM_NAME:
				setVmName((String)newValue);
				return;
			case JvmPackage.JAVA_VIRTUAL_MACHINE__VM_VERSION:
				setVmVersion((String)newValue);
				return;
			case JvmPackage.JAVA_VIRTUAL_MACHINE__VM_VENDOR:
				setVmVendor((String)newValue);
				return;
			case JvmPackage.JAVA_VIRTUAL_MACHINE__SPECIFICATION_VERSION:
				setSpecificationVersion((String)newValue);
				return;
			case JvmPackage.JAVA_VIRTUAL_MACHINE__MODULES:
				getModules().clear();
				getModules().addAll((Collection<? extends org.nasdanika.sdk.runtime.models.jvm.Module>)newValue);
				return;
			case JvmPackage.JAVA_VIRTUAL_MACHINE__LAYERS:
				getLayers().clear();
				getLayers().addAll((Collection<? extends Layer>)newValue);
				return;
			case JvmPackage.JAVA_VIRTUAL_MACHINE__CLASS_LOADERS:
				getClassLoaders().clear();
				getClassLoaders().addAll((Collection<? extends org.nasdanika.sdk.runtime.models.jvm.ClassLoader>)newValue);
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
			case JvmPackage.JAVA_VIRTUAL_MACHINE__LIVE:
				setLive(LIVE_EDEFAULT);
				return;
			case JvmPackage.JAVA_VIRTUAL_MACHINE__VM_NAME:
				setVmName(VM_NAME_EDEFAULT);
				return;
			case JvmPackage.JAVA_VIRTUAL_MACHINE__VM_VERSION:
				setVmVersion(VM_VERSION_EDEFAULT);
				return;
			case JvmPackage.JAVA_VIRTUAL_MACHINE__VM_VENDOR:
				setVmVendor(VM_VENDOR_EDEFAULT);
				return;
			case JvmPackage.JAVA_VIRTUAL_MACHINE__SPECIFICATION_VERSION:
				setSpecificationVersion(SPECIFICATION_VERSION_EDEFAULT);
				return;
			case JvmPackage.JAVA_VIRTUAL_MACHINE__MODULES:
				getModules().clear();
				return;
			case JvmPackage.JAVA_VIRTUAL_MACHINE__LAYERS:
				getLayers().clear();
				return;
			case JvmPackage.JAVA_VIRTUAL_MACHINE__CLASS_LOADERS:
				getClassLoaders().clear();
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
			case JvmPackage.JAVA_VIRTUAL_MACHINE__LIVE:
				return isLive() != LIVE_EDEFAULT;
			case JvmPackage.JAVA_VIRTUAL_MACHINE__VM_NAME:
				return VM_NAME_EDEFAULT == null ? getVmName() != null : !VM_NAME_EDEFAULT.equals(getVmName());
			case JvmPackage.JAVA_VIRTUAL_MACHINE__VM_VERSION:
				return VM_VERSION_EDEFAULT == null ? getVmVersion() != null : !VM_VERSION_EDEFAULT.equals(getVmVersion());
			case JvmPackage.JAVA_VIRTUAL_MACHINE__VM_VENDOR:
				return VM_VENDOR_EDEFAULT == null ? getVmVendor() != null : !VM_VENDOR_EDEFAULT.equals(getVmVendor());
			case JvmPackage.JAVA_VIRTUAL_MACHINE__SPECIFICATION_VERSION:
				return SPECIFICATION_VERSION_EDEFAULT == null ? getSpecificationVersion() != null : !SPECIFICATION_VERSION_EDEFAULT.equals(getSpecificationVersion());
			case JvmPackage.JAVA_VIRTUAL_MACHINE__MODULES:
				return !getModules().isEmpty();
			case JvmPackage.JAVA_VIRTUAL_MACHINE__LAYERS:
				return !getLayers().isEmpty();
			case JvmPackage.JAVA_VIRTUAL_MACHINE__CLASS_LOADERS:
				return !getClassLoaders().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //JavaVirtualMachineImpl
