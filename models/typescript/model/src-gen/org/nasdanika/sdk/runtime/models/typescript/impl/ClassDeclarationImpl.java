/**
 */
package org.nasdanika.sdk.runtime.models.typescript.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.sdk.runtime.models.typescript.ClassDeclaration;
import org.nasdanika.sdk.runtime.models.typescript.Member;
import org.nasdanika.sdk.runtime.models.typescript.TypeParameter;
import org.nasdanika.sdk.runtime.models.typescript.TypeReference;
import org.nasdanika.sdk.runtime.models.typescript.TypescriptPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Class Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.typescript.impl.ClassDeclarationImpl#getTypeParameters <em>Type Parameters</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.typescript.impl.ClassDeclarationImpl#getSuperClass <em>Super Class</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.typescript.impl.ClassDeclarationImpl#getInterfaces <em>Interfaces</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.typescript.impl.ClassDeclarationImpl#isAbstract <em>Abstract</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.typescript.impl.ClassDeclarationImpl#getMembers <em>Members</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClassDeclarationImpl extends DeclarationImpl implements ClassDeclaration {
	/**
	 * The default value of the '{@link #isAbstract() <em>Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAbstract()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ABSTRACT_EDEFAULT = false;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassDeclarationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypescriptPackage.Literals.CLASS_DECLARATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<TypeParameter> getTypeParameters() {
		return (EList<TypeParameter>)eDynamicGet(TypescriptPackage.CLASS_DECLARATION__TYPE_PARAMETERS, TypescriptPackage.Literals.CLASS_DECLARATION__TYPE_PARAMETERS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeReference getSuperClass() {
		return (TypeReference)eDynamicGet(TypescriptPackage.CLASS_DECLARATION__SUPER_CLASS, TypescriptPackage.Literals.CLASS_DECLARATION__SUPER_CLASS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSuperClass(TypeReference newSuperClass, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newSuperClass, TypescriptPackage.CLASS_DECLARATION__SUPER_CLASS, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSuperClass(TypeReference newSuperClass) {
		eDynamicSet(TypescriptPackage.CLASS_DECLARATION__SUPER_CLASS, TypescriptPackage.Literals.CLASS_DECLARATION__SUPER_CLASS, newSuperClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<TypeReference> getInterfaces() {
		return (EList<TypeReference>)eDynamicGet(TypescriptPackage.CLASS_DECLARATION__INTERFACES, TypescriptPackage.Literals.CLASS_DECLARATION__INTERFACES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAbstract() {
		return (Boolean)eDynamicGet(TypescriptPackage.CLASS_DECLARATION__ABSTRACT, TypescriptPackage.Literals.CLASS_DECLARATION__ABSTRACT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAbstract(boolean newAbstract) {
		eDynamicSet(TypescriptPackage.CLASS_DECLARATION__ABSTRACT, TypescriptPackage.Literals.CLASS_DECLARATION__ABSTRACT, newAbstract);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Member> getMembers() {
		return (EList<Member>)eDynamicGet(TypescriptPackage.CLASS_DECLARATION__MEMBERS, TypescriptPackage.Literals.CLASS_DECLARATION__MEMBERS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypescriptPackage.CLASS_DECLARATION__TYPE_PARAMETERS:
				return ((InternalEList<?>)getTypeParameters()).basicRemove(otherEnd, msgs);
			case TypescriptPackage.CLASS_DECLARATION__SUPER_CLASS:
				return basicSetSuperClass(null, msgs);
			case TypescriptPackage.CLASS_DECLARATION__INTERFACES:
				return ((InternalEList<?>)getInterfaces()).basicRemove(otherEnd, msgs);
			case TypescriptPackage.CLASS_DECLARATION__MEMBERS:
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
			case TypescriptPackage.CLASS_DECLARATION__TYPE_PARAMETERS:
				return getTypeParameters();
			case TypescriptPackage.CLASS_DECLARATION__SUPER_CLASS:
				return getSuperClass();
			case TypescriptPackage.CLASS_DECLARATION__INTERFACES:
				return getInterfaces();
			case TypescriptPackage.CLASS_DECLARATION__ABSTRACT:
				return isAbstract();
			case TypescriptPackage.CLASS_DECLARATION__MEMBERS:
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
			case TypescriptPackage.CLASS_DECLARATION__TYPE_PARAMETERS:
				getTypeParameters().clear();
				getTypeParameters().addAll((Collection<? extends TypeParameter>)newValue);
				return;
			case TypescriptPackage.CLASS_DECLARATION__SUPER_CLASS:
				setSuperClass((TypeReference)newValue);
				return;
			case TypescriptPackage.CLASS_DECLARATION__INTERFACES:
				getInterfaces().clear();
				getInterfaces().addAll((Collection<? extends TypeReference>)newValue);
				return;
			case TypescriptPackage.CLASS_DECLARATION__ABSTRACT:
				setAbstract((Boolean)newValue);
				return;
			case TypescriptPackage.CLASS_DECLARATION__MEMBERS:
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
			case TypescriptPackage.CLASS_DECLARATION__TYPE_PARAMETERS:
				getTypeParameters().clear();
				return;
			case TypescriptPackage.CLASS_DECLARATION__SUPER_CLASS:
				setSuperClass((TypeReference)null);
				return;
			case TypescriptPackage.CLASS_DECLARATION__INTERFACES:
				getInterfaces().clear();
				return;
			case TypescriptPackage.CLASS_DECLARATION__ABSTRACT:
				setAbstract(ABSTRACT_EDEFAULT);
				return;
			case TypescriptPackage.CLASS_DECLARATION__MEMBERS:
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
			case TypescriptPackage.CLASS_DECLARATION__TYPE_PARAMETERS:
				return !getTypeParameters().isEmpty();
			case TypescriptPackage.CLASS_DECLARATION__SUPER_CLASS:
				return getSuperClass() != null;
			case TypescriptPackage.CLASS_DECLARATION__INTERFACES:
				return !getInterfaces().isEmpty();
			case TypescriptPackage.CLASS_DECLARATION__ABSTRACT:
				return isAbstract() != ABSTRACT_EDEFAULT;
			case TypescriptPackage.CLASS_DECLARATION__MEMBERS:
				return !getMembers().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ClassDeclarationImpl
