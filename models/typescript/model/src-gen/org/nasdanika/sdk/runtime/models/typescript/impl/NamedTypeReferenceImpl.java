/**
 */
package org.nasdanika.sdk.runtime.models.typescript.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.sdk.runtime.models.typescript.Declaration;
import org.nasdanika.sdk.runtime.models.typescript.NamedTypeReference;
import org.nasdanika.sdk.runtime.models.typescript.TypeReference;
import org.nasdanika.sdk.runtime.models.typescript.TypescriptPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Named Type Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.typescript.impl.NamedTypeReferenceImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.typescript.impl.NamedTypeReferenceImpl#getQualifiedName <em>Qualified Name</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.typescript.impl.NamedTypeReferenceImpl#getModuleSpecifier <em>Module Specifier</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.typescript.impl.NamedTypeReferenceImpl#getTypeArguments <em>Type Arguments</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NamedTypeReferenceImpl extends TypeReferenceImpl implements NamedTypeReference {
	/**
	 * The default value of the '{@link #getQualifiedName() <em>Qualified Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualifiedName()
	 * @generated
	 * @ordered
	 */
	protected static final String QUALIFIED_NAME_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getModuleSpecifier() <em>Module Specifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModuleSpecifier()
	 * @generated
	 * @ordered
	 */
	protected static final String MODULE_SPECIFIER_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NamedTypeReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypescriptPackage.Literals.NAMED_TYPE_REFERENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Declaration getTarget() {
		return (Declaration)eDynamicGet(TypescriptPackage.NAMED_TYPE_REFERENCE__TARGET, TypescriptPackage.Literals.NAMED_TYPE_REFERENCE__TARGET, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Declaration basicGetTarget() {
		return (Declaration)eDynamicGet(TypescriptPackage.NAMED_TYPE_REFERENCE__TARGET, TypescriptPackage.Literals.NAMED_TYPE_REFERENCE__TARGET, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(Declaration newTarget) {
		eDynamicSet(TypescriptPackage.NAMED_TYPE_REFERENCE__TARGET, TypescriptPackage.Literals.NAMED_TYPE_REFERENCE__TARGET, newTarget);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getQualifiedName() {
		return (String)eDynamicGet(TypescriptPackage.NAMED_TYPE_REFERENCE__QUALIFIED_NAME, TypescriptPackage.Literals.NAMED_TYPE_REFERENCE__QUALIFIED_NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQualifiedName(String newQualifiedName) {
		eDynamicSet(TypescriptPackage.NAMED_TYPE_REFERENCE__QUALIFIED_NAME, TypescriptPackage.Literals.NAMED_TYPE_REFERENCE__QUALIFIED_NAME, newQualifiedName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getModuleSpecifier() {
		return (String)eDynamicGet(TypescriptPackage.NAMED_TYPE_REFERENCE__MODULE_SPECIFIER, TypescriptPackage.Literals.NAMED_TYPE_REFERENCE__MODULE_SPECIFIER, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModuleSpecifier(String newModuleSpecifier) {
		eDynamicSet(TypescriptPackage.NAMED_TYPE_REFERENCE__MODULE_SPECIFIER, TypescriptPackage.Literals.NAMED_TYPE_REFERENCE__MODULE_SPECIFIER, newModuleSpecifier);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<TypeReference> getTypeArguments() {
		return (EList<TypeReference>)eDynamicGet(TypescriptPackage.NAMED_TYPE_REFERENCE__TYPE_ARGUMENTS, TypescriptPackage.Literals.NAMED_TYPE_REFERENCE__TYPE_ARGUMENTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypescriptPackage.NAMED_TYPE_REFERENCE__TYPE_ARGUMENTS:
				return ((InternalEList<?>)getTypeArguments()).basicRemove(otherEnd, msgs);
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
			case TypescriptPackage.NAMED_TYPE_REFERENCE__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
			case TypescriptPackage.NAMED_TYPE_REFERENCE__QUALIFIED_NAME:
				return getQualifiedName();
			case TypescriptPackage.NAMED_TYPE_REFERENCE__MODULE_SPECIFIER:
				return getModuleSpecifier();
			case TypescriptPackage.NAMED_TYPE_REFERENCE__TYPE_ARGUMENTS:
				return getTypeArguments();
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
			case TypescriptPackage.NAMED_TYPE_REFERENCE__TARGET:
				setTarget((Declaration)newValue);
				return;
			case TypescriptPackage.NAMED_TYPE_REFERENCE__QUALIFIED_NAME:
				setQualifiedName((String)newValue);
				return;
			case TypescriptPackage.NAMED_TYPE_REFERENCE__MODULE_SPECIFIER:
				setModuleSpecifier((String)newValue);
				return;
			case TypescriptPackage.NAMED_TYPE_REFERENCE__TYPE_ARGUMENTS:
				getTypeArguments().clear();
				getTypeArguments().addAll((Collection<? extends TypeReference>)newValue);
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
			case TypescriptPackage.NAMED_TYPE_REFERENCE__TARGET:
				setTarget((Declaration)null);
				return;
			case TypescriptPackage.NAMED_TYPE_REFERENCE__QUALIFIED_NAME:
				setQualifiedName(QUALIFIED_NAME_EDEFAULT);
				return;
			case TypescriptPackage.NAMED_TYPE_REFERENCE__MODULE_SPECIFIER:
				setModuleSpecifier(MODULE_SPECIFIER_EDEFAULT);
				return;
			case TypescriptPackage.NAMED_TYPE_REFERENCE__TYPE_ARGUMENTS:
				getTypeArguments().clear();
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
			case TypescriptPackage.NAMED_TYPE_REFERENCE__TARGET:
				return basicGetTarget() != null;
			case TypescriptPackage.NAMED_TYPE_REFERENCE__QUALIFIED_NAME:
				return QUALIFIED_NAME_EDEFAULT == null ? getQualifiedName() != null : !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case TypescriptPackage.NAMED_TYPE_REFERENCE__MODULE_SPECIFIER:
				return MODULE_SPECIFIER_EDEFAULT == null ? getModuleSpecifier() != null : !MODULE_SPECIFIER_EDEFAULT.equals(getModuleSpecifier());
			case TypescriptPackage.NAMED_TYPE_REFERENCE__TYPE_ARGUMENTS:
				return !getTypeArguments().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //NamedTypeReferenceImpl
