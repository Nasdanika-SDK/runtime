/**
 */
package org.nasdanika.sdk.runtime.models.react.impl;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.nasdanika.sdk.runtime.models.react.ReactPackage;
import org.nasdanika.sdk.runtime.models.react.StateHook;

import org.nasdanika.sdk.runtime.models.typescript.CodeBlock;
import org.nasdanika.sdk.runtime.models.typescript.TypeReference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>State Hook</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.impl.StateHookImpl#getStateType <em>State Type</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.impl.StateHookImpl#getInitialValue <em>Initial Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StateHookImpl extends HookImpl implements StateHook {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StateHookImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ReactPackage.Literals.STATE_HOOK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeReference getStateType() {
		return (TypeReference)eDynamicGet(ReactPackage.STATE_HOOK__STATE_TYPE, ReactPackage.Literals.STATE_HOOK__STATE_TYPE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStateType(TypeReference newStateType, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newStateType, ReactPackage.STATE_HOOK__STATE_TYPE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStateType(TypeReference newStateType) {
		eDynamicSet(ReactPackage.STATE_HOOK__STATE_TYPE, ReactPackage.Literals.STATE_HOOK__STATE_TYPE, newStateType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeBlock getInitialValue() {
		return (CodeBlock)eDynamicGet(ReactPackage.STATE_HOOK__INITIAL_VALUE, ReactPackage.Literals.STATE_HOOK__INITIAL_VALUE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInitialValue(CodeBlock newInitialValue, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newInitialValue, ReactPackage.STATE_HOOK__INITIAL_VALUE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitialValue(CodeBlock newInitialValue) {
		eDynamicSet(ReactPackage.STATE_HOOK__INITIAL_VALUE, ReactPackage.Literals.STATE_HOOK__INITIAL_VALUE, newInitialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ReactPackage.STATE_HOOK__STATE_TYPE:
				return basicSetStateType(null, msgs);
			case ReactPackage.STATE_HOOK__INITIAL_VALUE:
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
			case ReactPackage.STATE_HOOK__STATE_TYPE:
				return getStateType();
			case ReactPackage.STATE_HOOK__INITIAL_VALUE:
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
			case ReactPackage.STATE_HOOK__STATE_TYPE:
				setStateType((TypeReference)newValue);
				return;
			case ReactPackage.STATE_HOOK__INITIAL_VALUE:
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
			case ReactPackage.STATE_HOOK__STATE_TYPE:
				setStateType((TypeReference)null);
				return;
			case ReactPackage.STATE_HOOK__INITIAL_VALUE:
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
			case ReactPackage.STATE_HOOK__STATE_TYPE:
				return getStateType() != null;
			case ReactPackage.STATE_HOOK__INITIAL_VALUE:
				return getInitialValue() != null;
		}
		return super.eIsSet(featureID);
	}

} //StateHookImpl
