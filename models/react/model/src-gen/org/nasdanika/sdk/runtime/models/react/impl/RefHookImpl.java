/**
 */
package org.nasdanika.sdk.runtime.models.react.impl;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.nasdanika.sdk.runtime.models.react.ReactPackage;
import org.nasdanika.sdk.runtime.models.react.RefHook;

import org.nasdanika.sdk.runtime.models.typescript.CodeBlock;
import org.nasdanika.sdk.runtime.models.typescript.TypeReference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ref Hook</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.impl.RefHookImpl#getRefType <em>Ref Type</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.impl.RefHookImpl#getInitialValue <em>Initial Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RefHookImpl extends HookImpl implements RefHook {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RefHookImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ReactPackage.Literals.REF_HOOK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeReference getRefType() {
		return (TypeReference)eDynamicGet(ReactPackage.REF_HOOK__REF_TYPE, ReactPackage.Literals.REF_HOOK__REF_TYPE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRefType(TypeReference newRefType, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newRefType, ReactPackage.REF_HOOK__REF_TYPE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRefType(TypeReference newRefType) {
		eDynamicSet(ReactPackage.REF_HOOK__REF_TYPE, ReactPackage.Literals.REF_HOOK__REF_TYPE, newRefType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeBlock getInitialValue() {
		return (CodeBlock)eDynamicGet(ReactPackage.REF_HOOK__INITIAL_VALUE, ReactPackage.Literals.REF_HOOK__INITIAL_VALUE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInitialValue(CodeBlock newInitialValue, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newInitialValue, ReactPackage.REF_HOOK__INITIAL_VALUE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitialValue(CodeBlock newInitialValue) {
		eDynamicSet(ReactPackage.REF_HOOK__INITIAL_VALUE, ReactPackage.Literals.REF_HOOK__INITIAL_VALUE, newInitialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ReactPackage.REF_HOOK__REF_TYPE:
				return basicSetRefType(null, msgs);
			case ReactPackage.REF_HOOK__INITIAL_VALUE:
				return basicSetInitialValue(null, msgs);
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
			case ReactPackage.REF_HOOK__REF_TYPE:
				return getRefType();
			case ReactPackage.REF_HOOK__INITIAL_VALUE:
				return getInitialValue();
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
			case ReactPackage.REF_HOOK__REF_TYPE:
				setRefType((TypeReference)newValue);
				return;
			case ReactPackage.REF_HOOK__INITIAL_VALUE:
				setInitialValue((CodeBlock)newValue);
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
			case ReactPackage.REF_HOOK__REF_TYPE:
				setRefType((TypeReference)null);
				return;
			case ReactPackage.REF_HOOK__INITIAL_VALUE:
				setInitialValue((CodeBlock)null);
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
			case ReactPackage.REF_HOOK__REF_TYPE:
				return getRefType() != null;
			case ReactPackage.REF_HOOK__INITIAL_VALUE:
				return getInitialValue() != null;
		}
		return super.eIsSet(featureID);
	}

} //RefHookImpl
