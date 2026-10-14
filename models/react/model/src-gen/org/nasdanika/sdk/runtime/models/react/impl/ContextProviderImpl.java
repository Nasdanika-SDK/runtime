/**
 */
package org.nasdanika.sdk.runtime.models.react.impl;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.nasdanika.sdk.runtime.models.react.ContextDeclaration;
import org.nasdanika.sdk.runtime.models.react.ContextProvider;
import org.nasdanika.sdk.runtime.models.react.ReactPackage;

import org.nasdanika.sdk.runtime.models.typescript.CodeBlock;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Context Provider</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.impl.ContextProviderImpl#getContext <em>Context</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.impl.ContextProviderImpl#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContextProviderImpl extends JsxContainerImpl implements ContextProvider {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContextProviderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ReactPackage.Literals.CONTEXT_PROVIDER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContextDeclaration getContext() {
		return (ContextDeclaration)eDynamicGet(ReactPackage.CONTEXT_PROVIDER__CONTEXT, ReactPackage.Literals.CONTEXT_PROVIDER__CONTEXT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContextDeclaration basicGetContext() {
		return (ContextDeclaration)eDynamicGet(ReactPackage.CONTEXT_PROVIDER__CONTEXT, ReactPackage.Literals.CONTEXT_PROVIDER__CONTEXT, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContext(ContextDeclaration newContext) {
		eDynamicSet(ReactPackage.CONTEXT_PROVIDER__CONTEXT, ReactPackage.Literals.CONTEXT_PROVIDER__CONTEXT, newContext);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeBlock getValue() {
		return (CodeBlock)eDynamicGet(ReactPackage.CONTEXT_PROVIDER__VALUE, ReactPackage.Literals.CONTEXT_PROVIDER__VALUE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValue(CodeBlock newValue, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newValue, ReactPackage.CONTEXT_PROVIDER__VALUE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(CodeBlock newValue) {
		eDynamicSet(ReactPackage.CONTEXT_PROVIDER__VALUE, ReactPackage.Literals.CONTEXT_PROVIDER__VALUE, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ReactPackage.CONTEXT_PROVIDER__VALUE:
				return basicSetValue(null, msgs);
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
			case ReactPackage.CONTEXT_PROVIDER__CONTEXT:
				if (resolve) return getContext();
				return basicGetContext();
			case ReactPackage.CONTEXT_PROVIDER__VALUE:
				return getValue();
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
			case ReactPackage.CONTEXT_PROVIDER__CONTEXT:
				setContext((ContextDeclaration)newValue);
				return;
			case ReactPackage.CONTEXT_PROVIDER__VALUE:
				setValue((CodeBlock)newValue);
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
			case ReactPackage.CONTEXT_PROVIDER__CONTEXT:
				setContext((ContextDeclaration)null);
				return;
			case ReactPackage.CONTEXT_PROVIDER__VALUE:
				setValue((CodeBlock)null);
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
			case ReactPackage.CONTEXT_PROVIDER__CONTEXT:
				return basicGetContext() != null;
			case ReactPackage.CONTEXT_PROVIDER__VALUE:
				return getValue() != null;
		}
		return super.eIsSet(featureID);
	}

} //ContextProviderImpl
