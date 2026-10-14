/**
 */
package org.nasdanika.sdk.runtime.models.html.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.sdk.runtime.models.html.HtmlPackage;
import org.nasdanika.sdk.runtime.models.html.ImportMap;
import org.nasdanika.sdk.runtime.models.html.ImportMapScope;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Import Map</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.impl.ImportMapImpl#getImports <em>Imports</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.impl.ImportMapImpl#getScopes <em>Scopes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ImportMapImpl extends ElementImpl implements ImportMap {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImportMapImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HtmlPackage.Literals.IMPORT_MAP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EMap<String, String> getImports() {
		return (EMap<String, String>)eDynamicGet(HtmlPackage.IMPORT_MAP__IMPORTS, HtmlPackage.Literals.IMPORT_MAP__IMPORTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<ImportMapScope> getScopes() {
		return (EList<ImportMapScope>)eDynamicGet(HtmlPackage.IMPORT_MAP__SCOPES, HtmlPackage.Literals.IMPORT_MAP__SCOPES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String tagName() {
		return "script";
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case HtmlPackage.IMPORT_MAP__IMPORTS:
				return ((InternalEList<?>)getImports()).basicRemove(otherEnd, msgs);
			case HtmlPackage.IMPORT_MAP__SCOPES:
				return ((InternalEList<?>)getScopes()).basicRemove(otherEnd, msgs);
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
			case HtmlPackage.IMPORT_MAP__IMPORTS:
				if (coreType) return getImports();
				else return getImports().map();
			case HtmlPackage.IMPORT_MAP__SCOPES:
				return getScopes();
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
			case HtmlPackage.IMPORT_MAP__IMPORTS:
				((EStructuralFeature.Setting)getImports()).set(newValue);
				return;
			case HtmlPackage.IMPORT_MAP__SCOPES:
				getScopes().clear();
				getScopes().addAll((Collection<? extends ImportMapScope>)newValue);
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
			case HtmlPackage.IMPORT_MAP__IMPORTS:
				getImports().clear();
				return;
			case HtmlPackage.IMPORT_MAP__SCOPES:
				getScopes().clear();
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
			case HtmlPackage.IMPORT_MAP__IMPORTS:
				return !getImports().isEmpty();
			case HtmlPackage.IMPORT_MAP__SCOPES:
				return !getScopes().isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case HtmlPackage.IMPORT_MAP___TAG_NAME:
				return tagName();
		}
		return super.eInvoke(operationID, arguments);
	}

} //ImportMapImpl
