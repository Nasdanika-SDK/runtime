/**
 */
package org.nasdanika.sdk.runtime.models.typescript.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.sdk.runtime.models.typescript.InterfaceDeclaration;
import org.nasdanika.sdk.runtime.models.typescript.Member;
import org.nasdanika.sdk.runtime.models.typescript.TypeParameter;
import org.nasdanika.sdk.runtime.models.typescript.TypeReference;
import org.nasdanika.sdk.runtime.models.typescript.TypescriptPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interface Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.typescript.impl.InterfaceDeclarationImpl#getTypeParameters <em>Type Parameters</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.typescript.impl.InterfaceDeclarationImpl#getSuperTypes <em>Super Types</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.typescript.impl.InterfaceDeclarationImpl#getMembers <em>Members</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InterfaceDeclarationImpl extends DeclarationImpl implements InterfaceDeclaration {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InterfaceDeclarationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypescriptPackage.Literals.INTERFACE_DECLARATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<TypeParameter> getTypeParameters() {
		return (EList<TypeParameter>)eDynamicGet(TypescriptPackage.INTERFACE_DECLARATION__TYPE_PARAMETERS, TypescriptPackage.Literals.INTERFACE_DECLARATION__TYPE_PARAMETERS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<TypeReference> getSuperTypes() {
		return (EList<TypeReference>)eDynamicGet(TypescriptPackage.INTERFACE_DECLARATION__SUPER_TYPES, TypescriptPackage.Literals.INTERFACE_DECLARATION__SUPER_TYPES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Member> getMembers() {
		return (EList<Member>)eDynamicGet(TypescriptPackage.INTERFACE_DECLARATION__MEMBERS, TypescriptPackage.Literals.INTERFACE_DECLARATION__MEMBERS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypescriptPackage.INTERFACE_DECLARATION__TYPE_PARAMETERS:
				return ((InternalEList<?>)getTypeParameters()).basicRemove(otherEnd, msgs);
			case TypescriptPackage.INTERFACE_DECLARATION__SUPER_TYPES:
				return ((InternalEList<?>)getSuperTypes()).basicRemove(otherEnd, msgs);
			case TypescriptPackage.INTERFACE_DECLARATION__MEMBERS:
				return ((InternalEList<?>)getMembers()).basicRemove(otherEnd, msgs);
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
			case TypescriptPackage.INTERFACE_DECLARATION__TYPE_PARAMETERS:
				return getTypeParameters();
			case TypescriptPackage.INTERFACE_DECLARATION__SUPER_TYPES:
				return getSuperTypes();
			case TypescriptPackage.INTERFACE_DECLARATION__MEMBERS:
				return getMembers();
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
			case TypescriptPackage.INTERFACE_DECLARATION__TYPE_PARAMETERS:
				getTypeParameters().clear();
				getTypeParameters().addAll((Collection<? extends TypeParameter>)newValue);
				return;
			case TypescriptPackage.INTERFACE_DECLARATION__SUPER_TYPES:
				getSuperTypes().clear();
				getSuperTypes().addAll((Collection<? extends TypeReference>)newValue);
				return;
			case TypescriptPackage.INTERFACE_DECLARATION__MEMBERS:
				getMembers().clear();
				getMembers().addAll((Collection<? extends Member>)newValue);
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
			case TypescriptPackage.INTERFACE_DECLARATION__TYPE_PARAMETERS:
				getTypeParameters().clear();
				return;
			case TypescriptPackage.INTERFACE_DECLARATION__SUPER_TYPES:
				getSuperTypes().clear();
				return;
			case TypescriptPackage.INTERFACE_DECLARATION__MEMBERS:
				getMembers().clear();
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
			case TypescriptPackage.INTERFACE_DECLARATION__TYPE_PARAMETERS:
				return !getTypeParameters().isEmpty();
			case TypescriptPackage.INTERFACE_DECLARATION__SUPER_TYPES:
				return !getSuperTypes().isEmpty();
			case TypescriptPackage.INTERFACE_DECLARATION__MEMBERS:
				return !getMembers().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //InterfaceDeclarationImpl
