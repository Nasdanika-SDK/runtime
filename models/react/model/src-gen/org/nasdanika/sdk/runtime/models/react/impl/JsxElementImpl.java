/**
 */
package org.nasdanika.sdk.runtime.models.react.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.sdk.runtime.models.react.JsxAttribute;
import org.nasdanika.sdk.runtime.models.react.JsxElement;
import org.nasdanika.sdk.runtime.models.react.ReactPackage;

import org.nasdanika.sdk.runtime.models.typescript.NamedTypeReference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Jsx Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.impl.JsxElementImpl#getTag <em>Tag</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.impl.JsxElementImpl#getComponentType <em>Component Type</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.impl.JsxElementImpl#getAttributes <em>Attributes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class JsxElementImpl extends JsxContainerImpl implements JsxElement {
	/**
	 * The default value of the '{@link #getTag() <em>Tag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTag()
	 * @generated
	 * @ordered
	 */
	protected static final String TAG_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JsxElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ReactPackage.Literals.JSX_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTag() {
		return (String)eDynamicGet(ReactPackage.JSX_ELEMENT__TAG, ReactPackage.Literals.JSX_ELEMENT__TAG, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTag(String newTag) {
		eDynamicSet(ReactPackage.JSX_ELEMENT__TAG, ReactPackage.Literals.JSX_ELEMENT__TAG, newTag);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedTypeReference getComponentType() {
		return (NamedTypeReference)eDynamicGet(ReactPackage.JSX_ELEMENT__COMPONENT_TYPE, ReactPackage.Literals.JSX_ELEMENT__COMPONENT_TYPE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetComponentType(NamedTypeReference newComponentType, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newComponentType, ReactPackage.JSX_ELEMENT__COMPONENT_TYPE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComponentType(NamedTypeReference newComponentType) {
		eDynamicSet(ReactPackage.JSX_ELEMENT__COMPONENT_TYPE, ReactPackage.Literals.JSX_ELEMENT__COMPONENT_TYPE, newComponentType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<JsxAttribute> getAttributes() {
		return (EList<JsxAttribute>)eDynamicGet(ReactPackage.JSX_ELEMENT__ATTRIBUTES, ReactPackage.Literals.JSX_ELEMENT__ATTRIBUTES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ReactPackage.JSX_ELEMENT__COMPONENT_TYPE:
				return basicSetComponentType(null, msgs);
			case ReactPackage.JSX_ELEMENT__ATTRIBUTES:
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
			case ReactPackage.JSX_ELEMENT__TAG:
				return getTag();
			case ReactPackage.JSX_ELEMENT__COMPONENT_TYPE:
				return getComponentType();
			case ReactPackage.JSX_ELEMENT__ATTRIBUTES:
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
			case ReactPackage.JSX_ELEMENT__TAG:
				setTag((String)newValue);
				return;
			case ReactPackage.JSX_ELEMENT__COMPONENT_TYPE:
				setComponentType((NamedTypeReference)newValue);
				return;
			case ReactPackage.JSX_ELEMENT__ATTRIBUTES:
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
			case ReactPackage.JSX_ELEMENT__TAG:
				setTag(TAG_EDEFAULT);
				return;
			case ReactPackage.JSX_ELEMENT__COMPONENT_TYPE:
				setComponentType((NamedTypeReference)null);
				return;
			case ReactPackage.JSX_ELEMENT__ATTRIBUTES:
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
			case ReactPackage.JSX_ELEMENT__TAG:
				return TAG_EDEFAULT == null ? getTag() != null : !TAG_EDEFAULT.equals(getTag());
			case ReactPackage.JSX_ELEMENT__COMPONENT_TYPE:
				return getComponentType() != null;
			case ReactPackage.JSX_ELEMENT__ATTRIBUTES:
				return !getAttributes().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //JsxElementImpl
