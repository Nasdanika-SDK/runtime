/**
 */
package org.nasdanika.sdk.runtime.models.react.impl;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.sdk.runtime.models.react.ContextDeclaration;
import org.nasdanika.sdk.runtime.models.react.ContextHook;
import org.nasdanika.sdk.runtime.models.react.ReactPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Context Hook</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.impl.ContextHookImpl#getContext <em>Context</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContextHookImpl extends HookImpl implements ContextHook {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContextHookImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ReactPackage.Literals.CONTEXT_HOOK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContextDeclaration getContext() {
		return (ContextDeclaration)eDynamicGet(ReactPackage.CONTEXT_HOOK__CONTEXT, ReactPackage.Literals.CONTEXT_HOOK__CONTEXT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContextDeclaration basicGetContext() {
		return (ContextDeclaration)eDynamicGet(ReactPackage.CONTEXT_HOOK__CONTEXT, ReactPackage.Literals.CONTEXT_HOOK__CONTEXT, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContext(ContextDeclaration newContext) {
		eDynamicSet(ReactPackage.CONTEXT_HOOK__CONTEXT, ReactPackage.Literals.CONTEXT_HOOK__CONTEXT, newContext);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ReactPackage.CONTEXT_HOOK__CONTEXT:
				if (resolve) return getContext();
				return basicGetContext();
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
			case ReactPackage.CONTEXT_HOOK__CONTEXT:
				setContext((ContextDeclaration)newValue);
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
			case ReactPackage.CONTEXT_HOOK__CONTEXT:
				setContext((ContextDeclaration)null);
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
			case ReactPackage.CONTEXT_HOOK__CONTEXT:
				return basicGetContext() != null;
		}
		return super.eIsSet(featureID);
	}

} //ContextHookImpl
