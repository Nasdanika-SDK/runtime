/**
 */
package org.nasdanika.sdk.runtime.models.react.impl;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.nasdanika.sdk.runtime.models.react.JsxConditional;
import org.nasdanika.sdk.runtime.models.react.JsxNode;
import org.nasdanika.sdk.runtime.models.react.ReactPackage;

import org.nasdanika.sdk.runtime.models.typescript.CodeBlock;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Jsx Conditional</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.impl.JsxConditionalImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.impl.JsxConditionalImpl#getThen <em>Then</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.impl.JsxConditionalImpl#getOtherwise <em>Otherwise</em>}</li>
 * </ul>
 *
 * @generated
 */
public class JsxConditionalImpl extends JsxNodeImpl implements JsxConditional {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JsxConditionalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ReactPackage.Literals.JSX_CONDITIONAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeBlock getCondition() {
		return (CodeBlock)eDynamicGet(ReactPackage.JSX_CONDITIONAL__CONDITION, ReactPackage.Literals.JSX_CONDITIONAL__CONDITION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCondition(CodeBlock newCondition, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newCondition, ReactPackage.JSX_CONDITIONAL__CONDITION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCondition(CodeBlock newCondition) {
		eDynamicSet(ReactPackage.JSX_CONDITIONAL__CONDITION, ReactPackage.Literals.JSX_CONDITIONAL__CONDITION, newCondition);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JsxNode getThen() {
		return (JsxNode)eDynamicGet(ReactPackage.JSX_CONDITIONAL__THEN, ReactPackage.Literals.JSX_CONDITIONAL__THEN, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetThen(JsxNode newThen, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newThen, ReactPackage.JSX_CONDITIONAL__THEN, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThen(JsxNode newThen) {
		eDynamicSet(ReactPackage.JSX_CONDITIONAL__THEN, ReactPackage.Literals.JSX_CONDITIONAL__THEN, newThen);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JsxNode getOtherwise() {
		return (JsxNode)eDynamicGet(ReactPackage.JSX_CONDITIONAL__OTHERWISE, ReactPackage.Literals.JSX_CONDITIONAL__OTHERWISE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOtherwise(JsxNode newOtherwise, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newOtherwise, ReactPackage.JSX_CONDITIONAL__OTHERWISE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOtherwise(JsxNode newOtherwise) {
		eDynamicSet(ReactPackage.JSX_CONDITIONAL__OTHERWISE, ReactPackage.Literals.JSX_CONDITIONAL__OTHERWISE, newOtherwise);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ReactPackage.JSX_CONDITIONAL__CONDITION:
				return basicSetCondition(null, msgs);
			case ReactPackage.JSX_CONDITIONAL__THEN:
				return basicSetThen(null, msgs);
			case ReactPackage.JSX_CONDITIONAL__OTHERWISE:
				return basicSetOtherwise(null, msgs);
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
			case ReactPackage.JSX_CONDITIONAL__CONDITION:
				return getCondition();
			case ReactPackage.JSX_CONDITIONAL__THEN:
				return getThen();
			case ReactPackage.JSX_CONDITIONAL__OTHERWISE:
				return getOtherwise();
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
			case ReactPackage.JSX_CONDITIONAL__CONDITION:
				setCondition((CodeBlock)newValue);
				return;
			case ReactPackage.JSX_CONDITIONAL__THEN:
				setThen((JsxNode)newValue);
				return;
			case ReactPackage.JSX_CONDITIONAL__OTHERWISE:
				setOtherwise((JsxNode)newValue);
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
			case ReactPackage.JSX_CONDITIONAL__CONDITION:
				setCondition((CodeBlock)null);
				return;
			case ReactPackage.JSX_CONDITIONAL__THEN:
				setThen((JsxNode)null);
				return;
			case ReactPackage.JSX_CONDITIONAL__OTHERWISE:
				setOtherwise((JsxNode)null);
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
			case ReactPackage.JSX_CONDITIONAL__CONDITION:
				return getCondition() != null;
			case ReactPackage.JSX_CONDITIONAL__THEN:
				return getThen() != null;
			case ReactPackage.JSX_CONDITIONAL__OTHERWISE:
				return getOtherwise() != null;
		}
		return super.eIsSet(featureID);
	}

} //JsxConditionalImpl
