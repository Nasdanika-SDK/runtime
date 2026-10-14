/**
 */
package org.nasdanika.sdk.runtime.models.react.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.sdk.runtime.models.react.ComponentDeclaration;
import org.nasdanika.sdk.runtime.models.react.Hook;
import org.nasdanika.sdk.runtime.models.react.JsxNode;
import org.nasdanika.sdk.runtime.models.react.ReactPackage;

import org.nasdanika.sdk.runtime.models.typescript.InterfaceDeclaration;

import org.nasdanika.sdk.runtime.models.typescript.impl.FunctionDeclarationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.impl.ComponentDeclarationImpl#getPropsType <em>Props Type</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.impl.ComponentDeclarationImpl#getHooks <em>Hooks</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.impl.ComponentDeclarationImpl#getRender <em>Render</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.impl.ComponentDeclarationImpl#isMemo <em>Memo</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComponentDeclarationImpl extends FunctionDeclarationImpl implements ComponentDeclaration {
	/**
	 * The default value of the '{@link #isMemo() <em>Memo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMemo()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MEMO_EDEFAULT = false;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentDeclarationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ReactPackage.Literals.COMPONENT_DECLARATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfaceDeclaration getPropsType() {
		return (InterfaceDeclaration)eDynamicGet(ReactPackage.COMPONENT_DECLARATION__PROPS_TYPE, ReactPackage.Literals.COMPONENT_DECLARATION__PROPS_TYPE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfaceDeclaration basicGetPropsType() {
		return (InterfaceDeclaration)eDynamicGet(ReactPackage.COMPONENT_DECLARATION__PROPS_TYPE, ReactPackage.Literals.COMPONENT_DECLARATION__PROPS_TYPE, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPropsType(InterfaceDeclaration newPropsType) {
		eDynamicSet(ReactPackage.COMPONENT_DECLARATION__PROPS_TYPE, ReactPackage.Literals.COMPONENT_DECLARATION__PROPS_TYPE, newPropsType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Hook> getHooks() {
		return (EList<Hook>)eDynamicGet(ReactPackage.COMPONENT_DECLARATION__HOOKS, ReactPackage.Literals.COMPONENT_DECLARATION__HOOKS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JsxNode getRender() {
		return (JsxNode)eDynamicGet(ReactPackage.COMPONENT_DECLARATION__RENDER, ReactPackage.Literals.COMPONENT_DECLARATION__RENDER, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRender(JsxNode newRender, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newRender, ReactPackage.COMPONENT_DECLARATION__RENDER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRender(JsxNode newRender) {
		eDynamicSet(ReactPackage.COMPONENT_DECLARATION__RENDER, ReactPackage.Literals.COMPONENT_DECLARATION__RENDER, newRender);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMemo() {
		return (Boolean)eDynamicGet(ReactPackage.COMPONENT_DECLARATION__MEMO, ReactPackage.Literals.COMPONENT_DECLARATION__MEMO, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMemo(boolean newMemo) {
		eDynamicSet(ReactPackage.COMPONENT_DECLARATION__MEMO, ReactPackage.Literals.COMPONENT_DECLARATION__MEMO, newMemo);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ReactPackage.COMPONENT_DECLARATION__HOOKS:
				return ((InternalEList<?>)getHooks()).basicRemove(otherEnd, msgs);
			case ReactPackage.COMPONENT_DECLARATION__RENDER:
				return basicSetRender(null, msgs);
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
			case ReactPackage.COMPONENT_DECLARATION__PROPS_TYPE:
				if (resolve) return getPropsType();
				return basicGetPropsType();
			case ReactPackage.COMPONENT_DECLARATION__HOOKS:
				return getHooks();
			case ReactPackage.COMPONENT_DECLARATION__RENDER:
				return getRender();
			case ReactPackage.COMPONENT_DECLARATION__MEMO:
				return isMemo();
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
			case ReactPackage.COMPONENT_DECLARATION__PROPS_TYPE:
				setPropsType((InterfaceDeclaration)newValue);
				return;
			case ReactPackage.COMPONENT_DECLARATION__HOOKS:
				getHooks().clear();
				getHooks().addAll((Collection<? extends Hook>)newValue);
				return;
			case ReactPackage.COMPONENT_DECLARATION__RENDER:
				setRender((JsxNode)newValue);
				return;
			case ReactPackage.COMPONENT_DECLARATION__MEMO:
				setMemo((Boolean)newValue);
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
			case ReactPackage.COMPONENT_DECLARATION__PROPS_TYPE:
				setPropsType((InterfaceDeclaration)null);
				return;
			case ReactPackage.COMPONENT_DECLARATION__HOOKS:
				getHooks().clear();
				return;
			case ReactPackage.COMPONENT_DECLARATION__RENDER:
				setRender((JsxNode)null);
				return;
			case ReactPackage.COMPONENT_DECLARATION__MEMO:
				setMemo(MEMO_EDEFAULT);
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
			case ReactPackage.COMPONENT_DECLARATION__PROPS_TYPE:
				return basicGetPropsType() != null;
			case ReactPackage.COMPONENT_DECLARATION__HOOKS:
				return !getHooks().isEmpty();
			case ReactPackage.COMPONENT_DECLARATION__RENDER:
				return getRender() != null;
			case ReactPackage.COMPONENT_DECLARATION__MEMO:
				return isMemo() != MEMO_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

} //ComponentDeclarationImpl
