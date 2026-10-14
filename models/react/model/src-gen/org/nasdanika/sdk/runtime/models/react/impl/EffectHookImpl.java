/**
 */
package org.nasdanika.sdk.runtime.models.react.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.sdk.runtime.models.react.EffectHook;
import org.nasdanika.sdk.runtime.models.react.ReactPackage;

import org.nasdanika.sdk.runtime.models.typescript.CodeBlock;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Effect Hook</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.impl.EffectHookImpl#getBody <em>Body</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.impl.EffectHookImpl#getDependencies <em>Dependencies</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.impl.EffectHookImpl#isLayout <em>Layout</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.impl.EffectHookImpl#getCleanup <em>Cleanup</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EffectHookImpl extends HookImpl implements EffectHook {
	/**
	 * The default value of the '{@link #isLayout() <em>Layout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLayout()
	 * @generated
	 * @ordered
	 */
	protected static final boolean LAYOUT_EDEFAULT = false;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EffectHookImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ReactPackage.Literals.EFFECT_HOOK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeBlock getBody() {
		return (CodeBlock)eDynamicGet(ReactPackage.EFFECT_HOOK__BODY, ReactPackage.Literals.EFFECT_HOOK__BODY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBody(CodeBlock newBody, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newBody, ReactPackage.EFFECT_HOOK__BODY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBody(CodeBlock newBody) {
		eDynamicSet(ReactPackage.EFFECT_HOOK__BODY, ReactPackage.Literals.EFFECT_HOOK__BODY, newBody);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<CodeBlock> getDependencies() {
		return (EList<CodeBlock>)eDynamicGet(ReactPackage.EFFECT_HOOK__DEPENDENCIES, ReactPackage.Literals.EFFECT_HOOK__DEPENDENCIES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isLayout() {
		return (Boolean)eDynamicGet(ReactPackage.EFFECT_HOOK__LAYOUT, ReactPackage.Literals.EFFECT_HOOK__LAYOUT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLayout(boolean newLayout) {
		eDynamicSet(ReactPackage.EFFECT_HOOK__LAYOUT, ReactPackage.Literals.EFFECT_HOOK__LAYOUT, newLayout);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeBlock getCleanup() {
		return (CodeBlock)eDynamicGet(ReactPackage.EFFECT_HOOK__CLEANUP, ReactPackage.Literals.EFFECT_HOOK__CLEANUP, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCleanup(CodeBlock newCleanup, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newCleanup, ReactPackage.EFFECT_HOOK__CLEANUP, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCleanup(CodeBlock newCleanup) {
		eDynamicSet(ReactPackage.EFFECT_HOOK__CLEANUP, ReactPackage.Literals.EFFECT_HOOK__CLEANUP, newCleanup);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ReactPackage.EFFECT_HOOK__BODY:
				return basicSetBody(null, msgs);
			case ReactPackage.EFFECT_HOOK__DEPENDENCIES:
				return ((InternalEList<?>)getDependencies()).basicRemove(otherEnd, msgs);
			case ReactPackage.EFFECT_HOOK__CLEANUP:
				return basicSetCleanup(null, msgs);
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
			case ReactPackage.EFFECT_HOOK__BODY:
				return getBody();
			case ReactPackage.EFFECT_HOOK__DEPENDENCIES:
				return getDependencies();
			case ReactPackage.EFFECT_HOOK__LAYOUT:
				return isLayout();
			case ReactPackage.EFFECT_HOOK__CLEANUP:
				return getCleanup();
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
			case ReactPackage.EFFECT_HOOK__BODY:
				setBody((CodeBlock)newValue);
				return;
			case ReactPackage.EFFECT_HOOK__DEPENDENCIES:
				getDependencies().clear();
				getDependencies().addAll((Collection<? extends CodeBlock>)newValue);
				return;
			case ReactPackage.EFFECT_HOOK__LAYOUT:
				setLayout((Boolean)newValue);
				return;
			case ReactPackage.EFFECT_HOOK__CLEANUP:
				setCleanup((CodeBlock)newValue);
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
			case ReactPackage.EFFECT_HOOK__BODY:
				setBody((CodeBlock)null);
				return;
			case ReactPackage.EFFECT_HOOK__DEPENDENCIES:
				getDependencies().clear();
				return;
			case ReactPackage.EFFECT_HOOK__LAYOUT:
				setLayout(LAYOUT_EDEFAULT);
				return;
			case ReactPackage.EFFECT_HOOK__CLEANUP:
				setCleanup((CodeBlock)null);
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
			case ReactPackage.EFFECT_HOOK__BODY:
				return getBody() != null;
			case ReactPackage.EFFECT_HOOK__DEPENDENCIES:
				return !getDependencies().isEmpty();
			case ReactPackage.EFFECT_HOOK__LAYOUT:
				return isLayout() != LAYOUT_EDEFAULT;
			case ReactPackage.EFFECT_HOOK__CLEANUP:
				return getCleanup() != null;
		}
		return super.eIsSet(featureID);
	}

} //EffectHookImpl
