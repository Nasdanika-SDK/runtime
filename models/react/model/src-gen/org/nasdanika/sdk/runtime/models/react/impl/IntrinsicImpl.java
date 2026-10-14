/**
 */
package org.nasdanika.sdk.runtime.models.react.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.sdk.runtime.models.html.Element;

import org.nasdanika.sdk.runtime.models.react.Intrinsic;
import org.nasdanika.sdk.runtime.models.react.JsxAttribute;
import org.nasdanika.sdk.runtime.models.react.ReactPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Intrinsic</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.impl.IntrinsicImpl#getElement <em>Element</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.impl.IntrinsicImpl#getAttributes <em>Attributes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IntrinsicImpl extends JsxContainerImpl implements Intrinsic {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IntrinsicImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ReactPackage.Literals.INTRINSIC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element getElement() {
		return (Element)eDynamicGet(ReactPackage.INTRINSIC__ELEMENT, ReactPackage.Literals.INTRINSIC__ELEMENT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetElement(Element newElement, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newElement, ReactPackage.INTRINSIC__ELEMENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElement(Element newElement) {
		eDynamicSet(ReactPackage.INTRINSIC__ELEMENT, ReactPackage.Literals.INTRINSIC__ELEMENT, newElement);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<JsxAttribute> getAttributes() {
		return (EList<JsxAttribute>)eDynamicGet(ReactPackage.INTRINSIC__ATTRIBUTES, ReactPackage.Literals.INTRINSIC__ATTRIBUTES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ReactPackage.INTRINSIC__ELEMENT:
				return basicSetElement(null, msgs);
			case ReactPackage.INTRINSIC__ATTRIBUTES:
				return ((InternalEList<?>)getAttributes()).basicRemove(otherEnd, msgs);
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
			case ReactPackage.INTRINSIC__ELEMENT:
				return getElement();
			case ReactPackage.INTRINSIC__ATTRIBUTES:
				return getAttributes();
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
			case ReactPackage.INTRINSIC__ELEMENT:
				setElement((Element)newValue);
				return;
			case ReactPackage.INTRINSIC__ATTRIBUTES:
				getAttributes().clear();
				getAttributes().addAll((Collection<? extends JsxAttribute>)newValue);
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
			case ReactPackage.INTRINSIC__ELEMENT:
				setElement((Element)null);
				return;
			case ReactPackage.INTRINSIC__ATTRIBUTES:
				getAttributes().clear();
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
			case ReactPackage.INTRINSIC__ELEMENT:
				return getElement() != null;
			case ReactPackage.INTRINSIC__ATTRIBUTES:
				return !getAttributes().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //IntrinsicImpl
