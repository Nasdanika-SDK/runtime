/**
 */
package org.nasdanika.sdk.runtime.models.react.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.sdk.runtime.models.react.MemoHook;
import org.nasdanika.sdk.runtime.models.react.ReactPackage;

import org.nasdanika.sdk.runtime.models.typescript.CodeBlock;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Memo Hook</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.impl.MemoHookImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.impl.MemoHookImpl#getDependencies <em>Dependencies</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.impl.MemoHookImpl#isCallback <em>Callback</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MemoHookImpl extends HookImpl implements MemoHook {
	/**
	 * The default value of the '{@link #isCallback() <em>Callback</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCallback()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CALLBACK_EDEFAULT = false;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MemoHookImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ReactPackage.Literals.MEMO_HOOK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeBlock getExpression() {
		return (CodeBlock)eDynamicGet(ReactPackage.MEMO_HOOK__EXPRESSION, ReactPackage.Literals.MEMO_HOOK__EXPRESSION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExpression(CodeBlock newExpression, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newExpression, ReactPackage.MEMO_HOOK__EXPRESSION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpression(CodeBlock newExpression) {
		eDynamicSet(ReactPackage.MEMO_HOOK__EXPRESSION, ReactPackage.Literals.MEMO_HOOK__EXPRESSION, newExpression);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<CodeBlock> getDependencies() {
		return (EList<CodeBlock>)eDynamicGet(ReactPackage.MEMO_HOOK__DEPENDENCIES, ReactPackage.Literals.MEMO_HOOK__DEPENDENCIES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCallback() {
		return (Boolean)eDynamicGet(ReactPackage.MEMO_HOOK__CALLBACK, ReactPackage.Literals.MEMO_HOOK__CALLBACK, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCallback(boolean newCallback) {
		eDynamicSet(ReactPackage.MEMO_HOOK__CALLBACK, ReactPackage.Literals.MEMO_HOOK__CALLBACK, newCallback);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ReactPackage.MEMO_HOOK__EXPRESSION:
				return basicSetExpression(null, msgs);
			case ReactPackage.MEMO_HOOK__DEPENDENCIES:
				return ((InternalEList<?>)getDependencies()).basicRemove(otherEnd, msgs);
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
			case ReactPackage.MEMO_HOOK__EXPRESSION:
				return getExpression();
			case ReactPackage.MEMO_HOOK__DEPENDENCIES:
				return getDependencies();
			case ReactPackage.MEMO_HOOK__CALLBACK:
				return isCallback();
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
			case ReactPackage.MEMO_HOOK__EXPRESSION:
				setExpression((CodeBlock)newValue);
				return;
			case ReactPackage.MEMO_HOOK__DEPENDENCIES:
				getDependencies().clear();
				getDependencies().addAll((Collection<? extends CodeBlock>)newValue);
				return;
			case ReactPackage.MEMO_HOOK__CALLBACK:
				setCallback((Boolean)newValue);
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
			case ReactPackage.MEMO_HOOK__EXPRESSION:
				setExpression((CodeBlock)null);
				return;
			case ReactPackage.MEMO_HOOK__DEPENDENCIES:
				getDependencies().clear();
				return;
			case ReactPackage.MEMO_HOOK__CALLBACK:
				setCallback(CALLBACK_EDEFAULT);
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
			case ReactPackage.MEMO_HOOK__EXPRESSION:
				return getExpression() != null;
			case ReactPackage.MEMO_HOOK__DEPENDENCIES:
				return !getDependencies().isEmpty();
			case ReactPackage.MEMO_HOOK__CALLBACK:
				return isCallback() != CALLBACK_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

} //MemoHookImpl
