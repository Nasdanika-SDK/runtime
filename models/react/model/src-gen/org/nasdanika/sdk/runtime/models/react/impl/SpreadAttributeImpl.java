/**
 */
package org.nasdanika.sdk.runtime.models.react.impl;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.nasdanika.sdk.runtime.models.react.ReactPackage;
import org.nasdanika.sdk.runtime.models.react.SpreadAttribute;

import org.nasdanika.sdk.runtime.models.typescript.CodeBlock;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Spread Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.impl.SpreadAttributeImpl#getExpression <em>Expression</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SpreadAttributeImpl extends JsxAttributeImpl implements SpreadAttribute {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpreadAttributeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ReactPackage.Literals.SPREAD_ATTRIBUTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeBlock getExpression() {
		return (CodeBlock)eDynamicGet(ReactPackage.SPREAD_ATTRIBUTE__EXPRESSION, ReactPackage.Literals.SPREAD_ATTRIBUTE__EXPRESSION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExpression(CodeBlock newExpression, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newExpression, ReactPackage.SPREAD_ATTRIBUTE__EXPRESSION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpression(CodeBlock newExpression) {
		eDynamicSet(ReactPackage.SPREAD_ATTRIBUTE__EXPRESSION, ReactPackage.Literals.SPREAD_ATTRIBUTE__EXPRESSION, newExpression);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ReactPackage.SPREAD_ATTRIBUTE__EXPRESSION:
				return basicSetExpression(null, msgs);
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
			case ReactPackage.SPREAD_ATTRIBUTE__EXPRESSION:
				return getExpression();
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
			case ReactPackage.SPREAD_ATTRIBUTE__EXPRESSION:
				setExpression((CodeBlock)newValue);
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
			case ReactPackage.SPREAD_ATTRIBUTE__EXPRESSION:
				setExpression((CodeBlock)null);
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
			case ReactPackage.SPREAD_ATTRIBUTE__EXPRESSION:
				return getExpression() != null;
		}
		return super.eIsSet(featureID);
	}

} //SpreadAttributeImpl
