/**
 */
package org.nasdanika.sdk.runtime.models.react.impl;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.nasdanika.sdk.runtime.models.react.ContextDeclaration;
import org.nasdanika.sdk.runtime.models.react.ReactPackage;

import org.nasdanika.sdk.runtime.models.typescript.CodeBlock;
import org.nasdanika.sdk.runtime.models.typescript.TypeReference;

import org.nasdanika.sdk.runtime.models.typescript.impl.DeclarationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Context Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.impl.ContextDeclarationImpl#getValueType <em>Value Type</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.impl.ContextDeclarationImpl#getDefaultValue <em>Default Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContextDeclarationImpl extends DeclarationImpl implements ContextDeclaration {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContextDeclarationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ReactPackage.Literals.CONTEXT_DECLARATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeReference getValueType() {
		return (TypeReference)eDynamicGet(ReactPackage.CONTEXT_DECLARATION__VALUE_TYPE, ReactPackage.Literals.CONTEXT_DECLARATION__VALUE_TYPE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValueType(TypeReference newValueType, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newValueType, ReactPackage.CONTEXT_DECLARATION__VALUE_TYPE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueType(TypeReference newValueType) {
		eDynamicSet(ReactPackage.CONTEXT_DECLARATION__VALUE_TYPE, ReactPackage.Literals.CONTEXT_DECLARATION__VALUE_TYPE, newValueType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeBlock getDefaultValue() {
		return (CodeBlock)eDynamicGet(ReactPackage.CONTEXT_DECLARATION__DEFAULT_VALUE, ReactPackage.Literals.CONTEXT_DECLARATION__DEFAULT_VALUE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefaultValue(CodeBlock newDefaultValue, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newDefaultValue, ReactPackage.CONTEXT_DECLARATION__DEFAULT_VALUE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultValue(CodeBlock newDefaultValue) {
		eDynamicSet(ReactPackage.CONTEXT_DECLARATION__DEFAULT_VALUE, ReactPackage.Literals.CONTEXT_DECLARATION__DEFAULT_VALUE, newDefaultValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ReactPackage.CONTEXT_DECLARATION__VALUE_TYPE:
				return basicSetValueType(null, msgs);
			case ReactPackage.CONTEXT_DECLARATION__DEFAULT_VALUE:
				return basicSetDefaultValue(null, msgs);
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
			case ReactPackage.CONTEXT_DECLARATION__VALUE_TYPE:
				return getValueType();
			case ReactPackage.CONTEXT_DECLARATION__DEFAULT_VALUE:
				return getDefaultValue();
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
			case ReactPackage.CONTEXT_DECLARATION__VALUE_TYPE:
				setValueType((TypeReference)newValue);
				return;
			case ReactPackage.CONTEXT_DECLARATION__DEFAULT_VALUE:
				setDefaultValue((CodeBlock)newValue);
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
			case ReactPackage.CONTEXT_DECLARATION__VALUE_TYPE:
				setValueType((TypeReference)null);
				return;
			case ReactPackage.CONTEXT_DECLARATION__DEFAULT_VALUE:
				setDefaultValue((CodeBlock)null);
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
			case ReactPackage.CONTEXT_DECLARATION__VALUE_TYPE:
				return getValueType() != null;
			case ReactPackage.CONTEXT_DECLARATION__DEFAULT_VALUE:
				return getDefaultValue() != null;
		}
		return super.eIsSet(featureID);
	}

} //ContextDeclarationImpl
