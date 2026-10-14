/**
 */
package org.nasdanika.sdk.runtime.models.meta.impl;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.nasdanika.sdk.runtime.models.meta.MetaPackage;
import org.nasdanika.sdk.runtime.models.meta.TypeParameter;
import org.nasdanika.sdk.runtime.models.meta.TypeReference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.meta.impl.TypeParameterImpl#getBound <em>Bound</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.meta.impl.TypeParameterImpl#getDefault <em>Default</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TypeParameterImpl extends ModelElementImpl implements TypeParameter {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeParameterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetaPackage.Literals.TYPE_PARAMETER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeReference getBound() {
		return (TypeReference)eDynamicGet(MetaPackage.TYPE_PARAMETER__BOUND, MetaPackage.Literals.TYPE_PARAMETER__BOUND, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBound(TypeReference newBound, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newBound, MetaPackage.TYPE_PARAMETER__BOUND, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBound(TypeReference newBound) {
		eDynamicSet(MetaPackage.TYPE_PARAMETER__BOUND, MetaPackage.Literals.TYPE_PARAMETER__BOUND, newBound);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeReference getDefault() {
		return (TypeReference)eDynamicGet(MetaPackage.TYPE_PARAMETER__DEFAULT, MetaPackage.Literals.TYPE_PARAMETER__DEFAULT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefault(TypeReference newDefault, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newDefault, MetaPackage.TYPE_PARAMETER__DEFAULT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefault(TypeReference newDefault) {
		eDynamicSet(MetaPackage.TYPE_PARAMETER__DEFAULT, MetaPackage.Literals.TYPE_PARAMETER__DEFAULT, newDefault);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MetaPackage.TYPE_PARAMETER__BOUND:
				return basicSetBound(null, msgs);
			case MetaPackage.TYPE_PARAMETER__DEFAULT:
				return basicSetDefault(null, msgs);
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
			case MetaPackage.TYPE_PARAMETER__BOUND:
				return getBound();
			case MetaPackage.TYPE_PARAMETER__DEFAULT:
				return getDefault();
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
			case MetaPackage.TYPE_PARAMETER__BOUND:
				setBound((TypeReference)newValue);
				return;
			case MetaPackage.TYPE_PARAMETER__DEFAULT:
				setDefault((TypeReference)newValue);
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
			case MetaPackage.TYPE_PARAMETER__BOUND:
				setBound((TypeReference)null);
				return;
			case MetaPackage.TYPE_PARAMETER__DEFAULT:
				setDefault((TypeReference)null);
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
			case MetaPackage.TYPE_PARAMETER__BOUND:
				return getBound() != null;
			case MetaPackage.TYPE_PARAMETER__DEFAULT:
				return getDefault() != null;
		}
		return super.eIsSet(featureID);
	}

} //TypeParameterImpl
