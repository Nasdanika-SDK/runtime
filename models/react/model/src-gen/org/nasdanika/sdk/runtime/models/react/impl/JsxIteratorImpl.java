/**
 */
package org.nasdanika.sdk.runtime.models.react.impl;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.nasdanika.sdk.runtime.models.react.JsxIterator;
import org.nasdanika.sdk.runtime.models.react.JsxNode;
import org.nasdanika.sdk.runtime.models.react.ReactPackage;

import org.nasdanika.sdk.runtime.models.typescript.CodeBlock;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Jsx Iterator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.impl.JsxIteratorImpl#getItems <em>Items</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.impl.JsxIteratorImpl#getVariable <em>Variable</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.impl.JsxIteratorImpl#getKey <em>Key</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.impl.JsxIteratorImpl#getTemplate <em>Template</em>}</li>
 * </ul>
 *
 * @generated
 */
public class JsxIteratorImpl extends JsxNodeImpl implements JsxIterator {
	/**
	 * The default value of the '{@link #getVariable() <em>Variable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariable()
	 * @generated
	 * @ordered
	 */
	protected static final String VARIABLE_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JsxIteratorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ReactPackage.Literals.JSX_ITERATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeBlock getItems() {
		return (CodeBlock)eDynamicGet(ReactPackage.JSX_ITERATOR__ITEMS, ReactPackage.Literals.JSX_ITERATOR__ITEMS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetItems(CodeBlock newItems, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newItems, ReactPackage.JSX_ITERATOR__ITEMS, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setItems(CodeBlock newItems) {
		eDynamicSet(ReactPackage.JSX_ITERATOR__ITEMS, ReactPackage.Literals.JSX_ITERATOR__ITEMS, newItems);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVariable() {
		return (String)eDynamicGet(ReactPackage.JSX_ITERATOR__VARIABLE, ReactPackage.Literals.JSX_ITERATOR__VARIABLE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVariable(String newVariable) {
		eDynamicSet(ReactPackage.JSX_ITERATOR__VARIABLE, ReactPackage.Literals.JSX_ITERATOR__VARIABLE, newVariable);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeBlock getKey() {
		return (CodeBlock)eDynamicGet(ReactPackage.JSX_ITERATOR__KEY, ReactPackage.Literals.JSX_ITERATOR__KEY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetKey(CodeBlock newKey, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newKey, ReactPackage.JSX_ITERATOR__KEY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKey(CodeBlock newKey) {
		eDynamicSet(ReactPackage.JSX_ITERATOR__KEY, ReactPackage.Literals.JSX_ITERATOR__KEY, newKey);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JsxNode getTemplate() {
		return (JsxNode)eDynamicGet(ReactPackage.JSX_ITERATOR__TEMPLATE, ReactPackage.Literals.JSX_ITERATOR__TEMPLATE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTemplate(JsxNode newTemplate, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newTemplate, ReactPackage.JSX_ITERATOR__TEMPLATE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTemplate(JsxNode newTemplate) {
		eDynamicSet(ReactPackage.JSX_ITERATOR__TEMPLATE, ReactPackage.Literals.JSX_ITERATOR__TEMPLATE, newTemplate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ReactPackage.JSX_ITERATOR__ITEMS:
				return basicSetItems(null, msgs);
			case ReactPackage.JSX_ITERATOR__KEY:
				return basicSetKey(null, msgs);
			case ReactPackage.JSX_ITERATOR__TEMPLATE:
				return basicSetTemplate(null, msgs);
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
			case ReactPackage.JSX_ITERATOR__ITEMS:
				return getItems();
			case ReactPackage.JSX_ITERATOR__VARIABLE:
				return getVariable();
			case ReactPackage.JSX_ITERATOR__KEY:
				return getKey();
			case ReactPackage.JSX_ITERATOR__TEMPLATE:
				return getTemplate();
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
			case ReactPackage.JSX_ITERATOR__ITEMS:
				setItems((CodeBlock)newValue);
				return;
			case ReactPackage.JSX_ITERATOR__VARIABLE:
				setVariable((String)newValue);
				return;
			case ReactPackage.JSX_ITERATOR__KEY:
				setKey((CodeBlock)newValue);
				return;
			case ReactPackage.JSX_ITERATOR__TEMPLATE:
				setTemplate((JsxNode)newValue);
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
			case ReactPackage.JSX_ITERATOR__ITEMS:
				setItems((CodeBlock)null);
				return;
			case ReactPackage.JSX_ITERATOR__VARIABLE:
				setVariable(VARIABLE_EDEFAULT);
				return;
			case ReactPackage.JSX_ITERATOR__KEY:
				setKey((CodeBlock)null);
				return;
			case ReactPackage.JSX_ITERATOR__TEMPLATE:
				setTemplate((JsxNode)null);
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
			case ReactPackage.JSX_ITERATOR__ITEMS:
				return getItems() != null;
			case ReactPackage.JSX_ITERATOR__VARIABLE:
				return VARIABLE_EDEFAULT == null ? getVariable() != null : !VARIABLE_EDEFAULT.equals(getVariable());
			case ReactPackage.JSX_ITERATOR__KEY:
				return getKey() != null;
			case ReactPackage.JSX_ITERATOR__TEMPLATE:
				return getTemplate() != null;
		}
		return super.eIsSet(featureID);
	}

} //JsxIteratorImpl
