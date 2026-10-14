/**
 */
package org.nasdanika.sdk.runtime.models.jvm.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.sdk.runtime.models.jvm.Exports;
import org.nasdanika.sdk.runtime.models.jvm.JvmPackage;
import org.nasdanika.sdk.runtime.models.jvm.Layer;
import org.nasdanika.sdk.runtime.models.jvm.ModuleModifier;
import org.nasdanika.sdk.runtime.models.jvm.Opens;
import org.nasdanika.sdk.runtime.models.jvm.Provides;
import org.nasdanika.sdk.runtime.models.jvm.Requires;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Module</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.jvm.impl.ModuleImpl#isNamed <em>Named</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.jvm.impl.ModuleImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.jvm.impl.ModuleImpl#getModifiers <em>Modifiers</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.jvm.impl.ModuleImpl#getMainClassName <em>Main Class Name</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.jvm.impl.ModuleImpl#getPackages <em>Packages</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.jvm.impl.ModuleImpl#getRequires <em>Requires</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.jvm.impl.ModuleImpl#getExports <em>Exports</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.jvm.impl.ModuleImpl#getOpens <em>Opens</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.jvm.impl.ModuleImpl#getProvides <em>Provides</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.jvm.impl.ModuleImpl#getUses <em>Uses</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.jvm.impl.ModuleImpl#getReads <em>Reads</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.jvm.impl.ModuleImpl#getLayer <em>Layer</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.jvm.impl.ModuleImpl#getClassLoader <em>Class Loader</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModuleImpl extends JvmElementImpl implements org.nasdanika.sdk.runtime.models.jvm.Module {
	/**
	 * The default value of the '{@link #isNamed() <em>Named</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNamed()
	 * @generated
	 * @ordered
	 */
	protected static final boolean NAMED_EDEFAULT = false;

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
	 * The default value of the '{@link #getMainClassName() <em>Main Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMainClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String MAIN_CLASS_NAME_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JvmPackage.Literals.MODULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isNamed() {
		return (Boolean)eDynamicGet(JvmPackage.MODULE__NAMED, JvmPackage.Literals.MODULE__NAMED, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNamed(boolean newNamed) {
		eDynamicSet(JvmPackage.MODULE__NAMED, JvmPackage.Literals.MODULE__NAMED, newNamed);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVersion() {
		return (String)eDynamicGet(JvmPackage.MODULE__VERSION, JvmPackage.Literals.MODULE__VERSION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersion(String newVersion) {
		eDynamicSet(JvmPackage.MODULE__VERSION, JvmPackage.Literals.MODULE__VERSION, newVersion);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<ModuleModifier> getModifiers() {
		return (EList<ModuleModifier>)eDynamicGet(JvmPackage.MODULE__MODIFIERS, JvmPackage.Literals.MODULE__MODIFIERS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMainClassName() {
		return (String)eDynamicGet(JvmPackage.MODULE__MAIN_CLASS_NAME, JvmPackage.Literals.MODULE__MAIN_CLASS_NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMainClassName(String newMainClassName) {
		eDynamicSet(JvmPackage.MODULE__MAIN_CLASS_NAME, JvmPackage.Literals.MODULE__MAIN_CLASS_NAME, newMainClassName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<org.nasdanika.sdk.runtime.models.jvm.Package> getPackages() {
		return (EList<org.nasdanika.sdk.runtime.models.jvm.Package>)eDynamicGet(JvmPackage.MODULE__PACKAGES, JvmPackage.Literals.MODULE__PACKAGES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Requires> getRequires() {
		return (EList<Requires>)eDynamicGet(JvmPackage.MODULE__REQUIRES, JvmPackage.Literals.MODULE__REQUIRES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Exports> getExports() {
		return (EList<Exports>)eDynamicGet(JvmPackage.MODULE__EXPORTS, JvmPackage.Literals.MODULE__EXPORTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Opens> getOpens() {
		return (EList<Opens>)eDynamicGet(JvmPackage.MODULE__OPENS, JvmPackage.Literals.MODULE__OPENS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Provides> getProvides() {
		return (EList<Provides>)eDynamicGet(JvmPackage.MODULE__PROVIDES, JvmPackage.Literals.MODULE__PROVIDES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<String> getUses() {
		return (EList<String>)eDynamicGet(JvmPackage.MODULE__USES, JvmPackage.Literals.MODULE__USES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<org.nasdanika.sdk.runtime.models.jvm.Module> getReads() {
		return (EList<org.nasdanika.sdk.runtime.models.jvm.Module>)eDynamicGet(JvmPackage.MODULE__READS, JvmPackage.Literals.MODULE__READS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Layer getLayer() {
		return (Layer)eDynamicGet(JvmPackage.MODULE__LAYER, JvmPackage.Literals.MODULE__LAYER, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Layer basicGetLayer() {
		return (Layer)eDynamicGet(JvmPackage.MODULE__LAYER, JvmPackage.Literals.MODULE__LAYER, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLayer(Layer newLayer) {
		eDynamicSet(JvmPackage.MODULE__LAYER, JvmPackage.Literals.MODULE__LAYER, newLayer);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.nasdanika.sdk.runtime.models.jvm.ClassLoader getClassLoader() {
		return (org.nasdanika.sdk.runtime.models.jvm.ClassLoader)eDynamicGet(JvmPackage.MODULE__CLASS_LOADER, JvmPackage.Literals.MODULE__CLASS_LOADER, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.nasdanika.sdk.runtime.models.jvm.ClassLoader basicGetClassLoader() {
		return (org.nasdanika.sdk.runtime.models.jvm.ClassLoader)eDynamicGet(JvmPackage.MODULE__CLASS_LOADER, JvmPackage.Literals.MODULE__CLASS_LOADER, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClassLoader(org.nasdanika.sdk.runtime.models.jvm.ClassLoader newClassLoader) {
		eDynamicSet(JvmPackage.MODULE__CLASS_LOADER, JvmPackage.Literals.MODULE__CLASS_LOADER, newClassLoader);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JvmPackage.MODULE__PACKAGES:
				return ((InternalEList<?>)getPackages()).basicRemove(otherEnd, msgs);
			case JvmPackage.MODULE__REQUIRES:
				return ((InternalEList<?>)getRequires()).basicRemove(otherEnd, msgs);
			case JvmPackage.MODULE__EXPORTS:
				return ((InternalEList<?>)getExports()).basicRemove(otherEnd, msgs);
			case JvmPackage.MODULE__OPENS:
				return ((InternalEList<?>)getOpens()).basicRemove(otherEnd, msgs);
			case JvmPackage.MODULE__PROVIDES:
				return ((InternalEList<?>)getProvides()).basicRemove(otherEnd, msgs);
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
			case JvmPackage.MODULE__NAMED:
				return isNamed();
			case JvmPackage.MODULE__VERSION:
				return getVersion();
			case JvmPackage.MODULE__MODIFIERS:
				return getModifiers();
			case JvmPackage.MODULE__MAIN_CLASS_NAME:
				return getMainClassName();
			case JvmPackage.MODULE__PACKAGES:
				return getPackages();
			case JvmPackage.MODULE__REQUIRES:
				return getRequires();
			case JvmPackage.MODULE__EXPORTS:
				return getExports();
			case JvmPackage.MODULE__OPENS:
				return getOpens();
			case JvmPackage.MODULE__PROVIDES:
				return getProvides();
			case JvmPackage.MODULE__USES:
				return getUses();
			case JvmPackage.MODULE__READS:
				return getReads();
			case JvmPackage.MODULE__LAYER:
				if (resolve) return getLayer();
				return basicGetLayer();
			case JvmPackage.MODULE__CLASS_LOADER:
				if (resolve) return getClassLoader();
				return basicGetClassLoader();
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
			case JvmPackage.MODULE__NAMED:
				setNamed((Boolean)newValue);
				return;
			case JvmPackage.MODULE__VERSION:
				setVersion((String)newValue);
				return;
			case JvmPackage.MODULE__MODIFIERS:
				getModifiers().clear();
				getModifiers().addAll((Collection<? extends ModuleModifier>)newValue);
				return;
			case JvmPackage.MODULE__MAIN_CLASS_NAME:
				setMainClassName((String)newValue);
				return;
			case JvmPackage.MODULE__PACKAGES:
				getPackages().clear();
				getPackages().addAll((Collection<? extends org.nasdanika.sdk.runtime.models.jvm.Package>)newValue);
				return;
			case JvmPackage.MODULE__REQUIRES:
				getRequires().clear();
				getRequires().addAll((Collection<? extends Requires>)newValue);
				return;
			case JvmPackage.MODULE__EXPORTS:
				getExports().clear();
				getExports().addAll((Collection<? extends Exports>)newValue);
				return;
			case JvmPackage.MODULE__OPENS:
				getOpens().clear();
				getOpens().addAll((Collection<? extends Opens>)newValue);
				return;
			case JvmPackage.MODULE__PROVIDES:
				getProvides().clear();
				getProvides().addAll((Collection<? extends Provides>)newValue);
				return;
			case JvmPackage.MODULE__USES:
				getUses().clear();
				getUses().addAll((Collection<? extends String>)newValue);
				return;
			case JvmPackage.MODULE__READS:
				getReads().clear();
				getReads().addAll((Collection<? extends org.nasdanika.sdk.runtime.models.jvm.Module>)newValue);
				return;
			case JvmPackage.MODULE__LAYER:
				setLayer((Layer)newValue);
				return;
			case JvmPackage.MODULE__CLASS_LOADER:
				setClassLoader((org.nasdanika.sdk.runtime.models.jvm.ClassLoader)newValue);
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
			case JvmPackage.MODULE__NAMED:
				setNamed(NAMED_EDEFAULT);
				return;
			case JvmPackage.MODULE__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case JvmPackage.MODULE__MODIFIERS:
				getModifiers().clear();
				return;
			case JvmPackage.MODULE__MAIN_CLASS_NAME:
				setMainClassName(MAIN_CLASS_NAME_EDEFAULT);
				return;
			case JvmPackage.MODULE__PACKAGES:
				getPackages().clear();
				return;
			case JvmPackage.MODULE__REQUIRES:
				getRequires().clear();
				return;
			case JvmPackage.MODULE__EXPORTS:
				getExports().clear();
				return;
			case JvmPackage.MODULE__OPENS:
				getOpens().clear();
				return;
			case JvmPackage.MODULE__PROVIDES:
				getProvides().clear();
				return;
			case JvmPackage.MODULE__USES:
				getUses().clear();
				return;
			case JvmPackage.MODULE__READS:
				getReads().clear();
				return;
			case JvmPackage.MODULE__LAYER:
				setLayer((Layer)null);
				return;
			case JvmPackage.MODULE__CLASS_LOADER:
				setClassLoader((org.nasdanika.sdk.runtime.models.jvm.ClassLoader)null);
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
			case JvmPackage.MODULE__NAMED:
				return isNamed() != NAMED_EDEFAULT;
			case JvmPackage.MODULE__VERSION:
				return VERSION_EDEFAULT == null ? getVersion() != null : !VERSION_EDEFAULT.equals(getVersion());
			case JvmPackage.MODULE__MODIFIERS:
				return !getModifiers().isEmpty();
			case JvmPackage.MODULE__MAIN_CLASS_NAME:
				return MAIN_CLASS_NAME_EDEFAULT == null ? getMainClassName() != null : !MAIN_CLASS_NAME_EDEFAULT.equals(getMainClassName());
			case JvmPackage.MODULE__PACKAGES:
				return !getPackages().isEmpty();
			case JvmPackage.MODULE__REQUIRES:
				return !getRequires().isEmpty();
			case JvmPackage.MODULE__EXPORTS:
				return !getExports().isEmpty();
			case JvmPackage.MODULE__OPENS:
				return !getOpens().isEmpty();
			case JvmPackage.MODULE__PROVIDES:
				return !getProvides().isEmpty();
			case JvmPackage.MODULE__USES:
				return !getUses().isEmpty();
			case JvmPackage.MODULE__READS:
				return !getReads().isEmpty();
			case JvmPackage.MODULE__LAYER:
				return basicGetLayer() != null;
			case JvmPackage.MODULE__CLASS_LOADER:
				return basicGetClassLoader() != null;
		}
		return super.eIsSet(featureID);
	}

} //ModuleImpl
