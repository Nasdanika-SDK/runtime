/**
 */
package org.nasdanika.sdk.runtime.models.html.impl;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.sdk.runtime.models.html.HtmlPackage;
import org.nasdanika.sdk.runtime.models.html.ImportMapScope;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Import Map Scope</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.impl.ImportMapScopeImpl#getPrefix <em>Prefix</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.impl.ImportMapScopeImpl#getImports <em>Imports</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ImportMapScopeImpl extends MinimalEObjectImpl.Container implements ImportMapScope {
	/**
	 * The default value of the '{@link #getPrefix() <em>Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrefix()
	 * @generated
	 * @ordered
	 */
	protected static final String PREFIX_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImportMapScopeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HtmlPackage.Literals.IMPORT_MAP_SCOPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPrefix() {
		return (String)eDynamicGet(HtmlPackage.IMPORT_MAP_SCOPE__PREFIX, HtmlPackage.Literals.IMPORT_MAP_SCOPE__PREFIX, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrefix(String newPrefix) {
		eDynamicSet(HtmlPackage.IMPORT_MAP_SCOPE__PREFIX, HtmlPackage.Literals.IMPORT_MAP_SCOPE__PREFIX, newPrefix);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EMap<String, String> getImports() {
		return (EMap<String, String>)eDynamicGet(HtmlPackage.IMPORT_MAP_SCOPE__IMPORTS, HtmlPackage.Literals.IMPORT_MAP_SCOPE__IMPORTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case HtmlPackage.IMPORT_MAP_SCOPE__IMPORTS:
				return ((InternalEList<?>)getImports()).basicRemove(otherEnd, msgs);
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
			case HtmlPackage.IMPORT_MAP_SCOPE__PREFIX:
				return getPrefix();
			case HtmlPackage.IMPORT_MAP_SCOPE__IMPORTS:
				if (coreType) return getImports();
				else return getImports().map();
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
			case HtmlPackage.IMPORT_MAP_SCOPE__PREFIX:
				setPrefix((String)newValue);
				return;
			case HtmlPackage.IMPORT_MAP_SCOPE__IMPORTS:
				((EStructuralFeature.Setting)getImports()).set(newValue);
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
			case HtmlPackage.IMPORT_MAP_SCOPE__PREFIX:
				setPrefix(PREFIX_EDEFAULT);
				return;
			case HtmlPackage.IMPORT_MAP_SCOPE__IMPORTS:
				getImports().clear();
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
			case HtmlPackage.IMPORT_MAP_SCOPE__PREFIX:
				return PREFIX_EDEFAULT == null ? getPrefix() != null : !PREFIX_EDEFAULT.equals(getPrefix());
			case HtmlPackage.IMPORT_MAP_SCOPE__IMPORTS:
				return !getImports().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ImportMapScopeImpl
