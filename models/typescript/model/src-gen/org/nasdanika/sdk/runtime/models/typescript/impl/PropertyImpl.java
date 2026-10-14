/**
 */
package org.nasdanika.sdk.runtime.models.typescript.impl;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.nasdanika.sdk.runtime.models.typescript.CodeBlock;
import org.nasdanika.sdk.runtime.models.typescript.Property;
import org.nasdanika.sdk.runtime.models.typescript.TypeReference;
import org.nasdanika.sdk.runtime.models.typescript.TypescriptPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.typescript.impl.PropertyImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.typescript.impl.PropertyImpl#isReadonly <em>Readonly</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.typescript.impl.PropertyImpl#getInitializer <em>Initializer</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PropertyImpl extends MemberImpl implements Property {
	/**
	 * The default value of the '{@link #isReadonly() <em>Readonly</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReadonly()
	 * @generated
	 * @ordered
	 */
	protected static final boolean READONLY_EDEFAULT = false;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PropertyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypescriptPackage.Literals.PROPERTY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeReference getType() {
		return (TypeReference)eDynamicGet(TypescriptPackage.PROPERTY__TYPE, TypescriptPackage.Literals.PROPERTY__TYPE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetType(TypeReference newType, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newType, TypescriptPackage.PROPERTY__TYPE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(TypeReference newType) {
		eDynamicSet(TypescriptPackage.PROPERTY__TYPE, TypescriptPackage.Literals.PROPERTY__TYPE, newType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isReadonly() {
		return (Boolean)eDynamicGet(TypescriptPackage.PROPERTY__READONLY, TypescriptPackage.Literals.PROPERTY__READONLY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReadonly(boolean newReadonly) {
		eDynamicSet(TypescriptPackage.PROPERTY__READONLY, TypescriptPackage.Literals.PROPERTY__READONLY, newReadonly);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeBlock getInitializer() {
		return (CodeBlock)eDynamicGet(TypescriptPackage.PROPERTY__INITIALIZER, TypescriptPackage.Literals.PROPERTY__INITIALIZER, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInitializer(CodeBlock newInitializer, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newInitializer, TypescriptPackage.PROPERTY__INITIALIZER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitializer(CodeBlock newInitializer) {
		eDynamicSet(TypescriptPackage.PROPERTY__INITIALIZER, TypescriptPackage.Literals.PROPERTY__INITIALIZER, newInitializer);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypescriptPackage.PROPERTY__TYPE:
				return basicSetType(null, msgs);
			case TypescriptPackage.PROPERTY__INITIALIZER:
				return basicSetInitializer(null, msgs);
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
			case TypescriptPackage.PROPERTY__TYPE:
				return getType();
			case TypescriptPackage.PROPERTY__READONLY:
				return isReadonly();
			case TypescriptPackage.PROPERTY__INITIALIZER:
				return getInitializer();
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
			case TypescriptPackage.PROPERTY__TYPE:
				setType((TypeReference)newValue);
				return;
			case TypescriptPackage.PROPERTY__READONLY:
				setReadonly((Boolean)newValue);
				return;
			case TypescriptPackage.PROPERTY__INITIALIZER:
				setInitializer((CodeBlock)newValue);
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
			case TypescriptPackage.PROPERTY__TYPE:
				setType((TypeReference)null);
				return;
			case TypescriptPackage.PROPERTY__READONLY:
				setReadonly(READONLY_EDEFAULT);
				return;
			case TypescriptPackage.PROPERTY__INITIALIZER:
				setInitializer((CodeBlock)null);
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
			case TypescriptPackage.PROPERTY__TYPE:
				return getType() != null;
			case TypescriptPackage.PROPERTY__READONLY:
				return isReadonly() != READONLY_EDEFAULT;
			case TypescriptPackage.PROPERTY__INITIALIZER:
				return getInitializer() != null;
		}
		return super.eIsSet(featureID);
	}

} //PropertyImpl
