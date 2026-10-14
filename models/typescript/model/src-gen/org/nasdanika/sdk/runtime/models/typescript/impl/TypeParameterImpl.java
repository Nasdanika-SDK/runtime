/**
 */
package org.nasdanika.sdk.runtime.models.typescript.impl;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.nasdanika.sdk.runtime.models.typescript.TypeParameter;
import org.nasdanika.sdk.runtime.models.typescript.TypeReference;
import org.nasdanika.sdk.runtime.models.typescript.TypescriptPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.typescript.impl.TypeParameterImpl#getConstraint <em>Constraint</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.typescript.impl.TypeParameterImpl#getDefault <em>Default</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TypeParameterImpl extends TypeScriptElementImpl implements TypeParameter {
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
		return TypescriptPackage.Literals.TYPE_PARAMETER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeReference getConstraint() {
		return (TypeReference)eDynamicGet(TypescriptPackage.TYPE_PARAMETER__CONSTRAINT, TypescriptPackage.Literals.TYPE_PARAMETER__CONSTRAINT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConstraint(TypeReference newConstraint, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newConstraint, TypescriptPackage.TYPE_PARAMETER__CONSTRAINT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConstraint(TypeReference newConstraint) {
		eDynamicSet(TypescriptPackage.TYPE_PARAMETER__CONSTRAINT, TypescriptPackage.Literals.TYPE_PARAMETER__CONSTRAINT, newConstraint);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeReference getDefault() {
		return (TypeReference)eDynamicGet(TypescriptPackage.TYPE_PARAMETER__DEFAULT, TypescriptPackage.Literals.TYPE_PARAMETER__DEFAULT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefault(TypeReference newDefault, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newDefault, TypescriptPackage.TYPE_PARAMETER__DEFAULT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefault(TypeReference newDefault) {
		eDynamicSet(TypescriptPackage.TYPE_PARAMETER__DEFAULT, TypescriptPackage.Literals.TYPE_PARAMETER__DEFAULT, newDefault);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypescriptPackage.TYPE_PARAMETER__CONSTRAINT:
				return basicSetConstraint(null, msgs);
			case TypescriptPackage.TYPE_PARAMETER__DEFAULT:
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
			case TypescriptPackage.TYPE_PARAMETER__CONSTRAINT:
				return getConstraint();
			case TypescriptPackage.TYPE_PARAMETER__DEFAULT:
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
			case TypescriptPackage.TYPE_PARAMETER__CONSTRAINT:
				setConstraint((TypeReference)newValue);
				return;
			case TypescriptPackage.TYPE_PARAMETER__DEFAULT:
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
			case TypescriptPackage.TYPE_PARAMETER__CONSTRAINT:
				setConstraint((TypeReference)null);
				return;
			case TypescriptPackage.TYPE_PARAMETER__DEFAULT:
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
			case TypescriptPackage.TYPE_PARAMETER__CONSTRAINT:
				return getConstraint() != null;
			case TypescriptPackage.TYPE_PARAMETER__DEFAULT:
				return getDefault() != null;
		}
		return super.eIsSet(featureID);
	}

} //TypeParameterImpl
