/**
 */
package org.nasdanika.sdk.runtime.models.meta.impl;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.nasdanika.sdk.runtime.models.meta.MetaPackage;
import org.nasdanika.sdk.runtime.models.meta.TypeReference;
import org.nasdanika.sdk.runtime.models.meta.WildcardTypeReference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Wildcard Type Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.meta.impl.WildcardTypeReferenceImpl#getUpperBound <em>Upper Bound</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.meta.impl.WildcardTypeReferenceImpl#getLowerBound <em>Lower Bound</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WildcardTypeReferenceImpl extends TypeReferenceImpl implements WildcardTypeReference {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WildcardTypeReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetaPackage.Literals.WILDCARD_TYPE_REFERENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeReference getUpperBound() {
		return (TypeReference)eDynamicGet(MetaPackage.WILDCARD_TYPE_REFERENCE__UPPER_BOUND, MetaPackage.Literals.WILDCARD_TYPE_REFERENCE__UPPER_BOUND, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUpperBound(TypeReference newUpperBound, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newUpperBound, MetaPackage.WILDCARD_TYPE_REFERENCE__UPPER_BOUND, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUpperBound(TypeReference newUpperBound) {
		eDynamicSet(MetaPackage.WILDCARD_TYPE_REFERENCE__UPPER_BOUND, MetaPackage.Literals.WILDCARD_TYPE_REFERENCE__UPPER_BOUND, newUpperBound);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeReference getLowerBound() {
		return (TypeReference)eDynamicGet(MetaPackage.WILDCARD_TYPE_REFERENCE__LOWER_BOUND, MetaPackage.Literals.WILDCARD_TYPE_REFERENCE__LOWER_BOUND, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLowerBound(TypeReference newLowerBound, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newLowerBound, MetaPackage.WILDCARD_TYPE_REFERENCE__LOWER_BOUND, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLowerBound(TypeReference newLowerBound) {
		eDynamicSet(MetaPackage.WILDCARD_TYPE_REFERENCE__LOWER_BOUND, MetaPackage.Literals.WILDCARD_TYPE_REFERENCE__LOWER_BOUND, newLowerBound);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MetaPackage.WILDCARD_TYPE_REFERENCE__UPPER_BOUND:
				return basicSetUpperBound(null, msgs);
			case MetaPackage.WILDCARD_TYPE_REFERENCE__LOWER_BOUND:
				return basicSetLowerBound(null, msgs);
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
			case MetaPackage.WILDCARD_TYPE_REFERENCE__UPPER_BOUND:
				return getUpperBound();
			case MetaPackage.WILDCARD_TYPE_REFERENCE__LOWER_BOUND:
				return getLowerBound();
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
			case MetaPackage.WILDCARD_TYPE_REFERENCE__UPPER_BOUND:
				setUpperBound((TypeReference)newValue);
				return;
			case MetaPackage.WILDCARD_TYPE_REFERENCE__LOWER_BOUND:
				setLowerBound((TypeReference)newValue);
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
			case MetaPackage.WILDCARD_TYPE_REFERENCE__UPPER_BOUND:
				setUpperBound((TypeReference)null);
				return;
			case MetaPackage.WILDCARD_TYPE_REFERENCE__LOWER_BOUND:
				setLowerBound((TypeReference)null);
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
			case MetaPackage.WILDCARD_TYPE_REFERENCE__UPPER_BOUND:
				return getUpperBound() != null;
			case MetaPackage.WILDCARD_TYPE_REFERENCE__LOWER_BOUND:
				return getLowerBound() != null;
		}
		return super.eIsSet(featureID);
	}

} //WildcardTypeReferenceImpl
