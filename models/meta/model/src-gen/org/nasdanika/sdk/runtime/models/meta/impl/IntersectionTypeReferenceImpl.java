/**
 */
package org.nasdanika.sdk.runtime.models.meta.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.sdk.runtime.models.meta.IntersectionTypeReference;
import org.nasdanika.sdk.runtime.models.meta.MetaPackage;
import org.nasdanika.sdk.runtime.models.meta.TypeReference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Intersection Type Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.meta.impl.IntersectionTypeReferenceImpl#getTypes <em>Types</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IntersectionTypeReferenceImpl extends TypeReferenceImpl implements IntersectionTypeReference {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IntersectionTypeReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetaPackage.Literals.INTERSECTION_TYPE_REFERENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<TypeReference> getTypes() {
		return (EList<TypeReference>)eDynamicGet(MetaPackage.INTERSECTION_TYPE_REFERENCE__TYPES, MetaPackage.Literals.INTERSECTION_TYPE_REFERENCE__TYPES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MetaPackage.INTERSECTION_TYPE_REFERENCE__TYPES:
				return ((InternalEList<?>)getTypes()).basicRemove(otherEnd, msgs);
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
			case MetaPackage.INTERSECTION_TYPE_REFERENCE__TYPES:
				return getTypes();
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
			case MetaPackage.INTERSECTION_TYPE_REFERENCE__TYPES:
				getTypes().clear();
				getTypes().addAll((Collection<? extends TypeReference>)newValue);
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
			case MetaPackage.INTERSECTION_TYPE_REFERENCE__TYPES:
				getTypes().clear();
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
			case MetaPackage.INTERSECTION_TYPE_REFERENCE__TYPES:
				return !getTypes().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //IntersectionTypeReferenceImpl
