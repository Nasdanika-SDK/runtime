/**
 */
package org.nasdanika.sdk.runtime.models.typescript.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.sdk.runtime.models.typescript.Import;
import org.nasdanika.sdk.runtime.models.typescript.ImportBinding;
import org.nasdanika.sdk.runtime.models.typescript.TypescriptPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Import</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.typescript.impl.ImportImpl#getModuleSpecifier <em>Module Specifier</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.typescript.impl.ImportImpl#isTypeOnly <em>Type Only</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.typescript.impl.ImportImpl#getBindings <em>Bindings</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ImportImpl extends TypeScriptElementImpl implements Import {
	/**
	 * The default value of the '{@link #getModuleSpecifier() <em>Module Specifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModuleSpecifier()
	 * @generated
	 * @ordered
	 */
	protected static final String MODULE_SPECIFIER_EDEFAULT = null;

	/**
	 * The default value of the '{@link #isTypeOnly() <em>Type Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTypeOnly()
	 * @generated
	 * @ordered
	 */
	protected static final boolean TYPE_ONLY_EDEFAULT = false;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImportImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypescriptPackage.Literals.IMPORT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getModuleSpecifier() {
		return (String)eDynamicGet(TypescriptPackage.IMPORT__MODULE_SPECIFIER, TypescriptPackage.Literals.IMPORT__MODULE_SPECIFIER, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModuleSpecifier(String newModuleSpecifier) {
		eDynamicSet(TypescriptPackage.IMPORT__MODULE_SPECIFIER, TypescriptPackage.Literals.IMPORT__MODULE_SPECIFIER, newModuleSpecifier);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isTypeOnly() {
		return (Boolean)eDynamicGet(TypescriptPackage.IMPORT__TYPE_ONLY, TypescriptPackage.Literals.IMPORT__TYPE_ONLY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeOnly(boolean newTypeOnly) {
		eDynamicSet(TypescriptPackage.IMPORT__TYPE_ONLY, TypescriptPackage.Literals.IMPORT__TYPE_ONLY, newTypeOnly);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<ImportBinding> getBindings() {
		return (EList<ImportBinding>)eDynamicGet(TypescriptPackage.IMPORT__BINDINGS, TypescriptPackage.Literals.IMPORT__BINDINGS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypescriptPackage.IMPORT__BINDINGS:
				return ((InternalEList<?>)getBindings()).basicRemove(otherEnd, msgs);
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
			case TypescriptPackage.IMPORT__MODULE_SPECIFIER:
				return getModuleSpecifier();
			case TypescriptPackage.IMPORT__TYPE_ONLY:
				return isTypeOnly();
			case TypescriptPackage.IMPORT__BINDINGS:
				return getBindings();
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
			case TypescriptPackage.IMPORT__MODULE_SPECIFIER:
				setModuleSpecifier((String)newValue);
				return;
			case TypescriptPackage.IMPORT__TYPE_ONLY:
				setTypeOnly((Boolean)newValue);
				return;
			case TypescriptPackage.IMPORT__BINDINGS:
				getBindings().clear();
				getBindings().addAll((Collection<? extends ImportBinding>)newValue);
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
			case TypescriptPackage.IMPORT__MODULE_SPECIFIER:
				setModuleSpecifier(MODULE_SPECIFIER_EDEFAULT);
				return;
			case TypescriptPackage.IMPORT__TYPE_ONLY:
				setTypeOnly(TYPE_ONLY_EDEFAULT);
				return;
			case TypescriptPackage.IMPORT__BINDINGS:
				getBindings().clear();
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
			case TypescriptPackage.IMPORT__MODULE_SPECIFIER:
				return MODULE_SPECIFIER_EDEFAULT == null ? getModuleSpecifier() != null : !MODULE_SPECIFIER_EDEFAULT.equals(getModuleSpecifier());
			case TypescriptPackage.IMPORT__TYPE_ONLY:
				return isTypeOnly() != TYPE_ONLY_EDEFAULT;
			case TypescriptPackage.IMPORT__BINDINGS:
				return !getBindings().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ImportImpl
