/**
 */
package org.nasdanika.sdk.runtime.models.jvm.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.sdk.runtime.models.jvm.AccessLevel;
import org.nasdanika.sdk.runtime.models.jvm.Field;
import org.nasdanika.sdk.runtime.models.jvm.JvmPackage;
import org.nasdanika.sdk.runtime.models.jvm.Method;
import org.nasdanika.sdk.runtime.models.jvm.Type;
import org.nasdanika.sdk.runtime.models.jvm.TypeKind;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.jvm.impl.TypeImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.jvm.impl.TypeImpl#getAccess <em>Access</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.jvm.impl.TypeImpl#getBinaryName <em>Binary Name</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.jvm.impl.TypeImpl#getDescriptor <em>Descriptor</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.jvm.impl.TypeImpl#getSignature <em>Signature</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.jvm.impl.TypeImpl#isAbstract <em>Abstract</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.jvm.impl.TypeImpl#isFinal <em>Final</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.jvm.impl.TypeImpl#isSynthetic <em>Synthetic</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.jvm.impl.TypeImpl#isSealed <em>Sealed</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.jvm.impl.TypeImpl#getClassFileVersion <em>Class File Version</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.jvm.impl.TypeImpl#getMethods <em>Methods</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.jvm.impl.TypeImpl#getFields <em>Fields</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.jvm.impl.TypeImpl#getSuperType <em>Super Type</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.jvm.impl.TypeImpl#getInterfaces <em>Interfaces</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.jvm.impl.TypeImpl#getComponentType <em>Component Type</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.jvm.impl.TypeImpl#getModule <em>Module</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TypeImpl extends JvmElementImpl implements Type {
	/**
	 * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected static final TypeKind KIND_EDEFAULT = TypeKind.CLASS;

	/**
	 * The default value of the '{@link #getAccess() <em>Access</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccess()
	 * @generated
	 * @ordered
	 */
	protected static final AccessLevel ACCESS_EDEFAULT = AccessLevel.PUBLIC;

	/**
	 * The default value of the '{@link #getBinaryName() <em>Binary Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBinaryName()
	 * @generated
	 * @ordered
	 */
	protected static final String BINARY_NAME_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getDescriptor() <em>Descriptor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescriptor()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTOR_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getSignature() <em>Signature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignature()
	 * @generated
	 * @ordered
	 */
	protected static final String SIGNATURE_EDEFAULT = null;

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
	 * The default value of the '{@link #isFinal() <em>Final</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFinal()
	 * @generated
	 * @ordered
	 */
	protected static final boolean FINAL_EDEFAULT = false;

	/**
	 * The default value of the '{@link #isSynthetic() <em>Synthetic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSynthetic()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SYNTHETIC_EDEFAULT = false;

	/**
	 * The default value of the '{@link #isSealed() <em>Sealed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSealed()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SEALED_EDEFAULT = false;

	/**
	 * The default value of the '{@link #getClassFileVersion() <em>Class File Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassFileVersion()
	 * @generated
	 * @ordered
	 */
	protected static final int CLASS_FILE_VERSION_EDEFAULT = -1;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JvmPackage.Literals.TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeKind getKind() {
		return (TypeKind)eDynamicGet(JvmPackage.TYPE__KIND, JvmPackage.Literals.TYPE__KIND, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKind(TypeKind newKind) {
		eDynamicSet(JvmPackage.TYPE__KIND, JvmPackage.Literals.TYPE__KIND, newKind);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccessLevel getAccess() {
		return (AccessLevel)eDynamicGet(JvmPackage.TYPE__ACCESS, JvmPackage.Literals.TYPE__ACCESS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccess(AccessLevel newAccess) {
		eDynamicSet(JvmPackage.TYPE__ACCESS, JvmPackage.Literals.TYPE__ACCESS, newAccess);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBinaryName() {
		return (String)eDynamicGet(JvmPackage.TYPE__BINARY_NAME, JvmPackage.Literals.TYPE__BINARY_NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBinaryName(String newBinaryName) {
		eDynamicSet(JvmPackage.TYPE__BINARY_NAME, JvmPackage.Literals.TYPE__BINARY_NAME, newBinaryName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescriptor() {
		return (String)eDynamicGet(JvmPackage.TYPE__DESCRIPTOR, JvmPackage.Literals.TYPE__DESCRIPTOR, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescriptor(String newDescriptor) {
		eDynamicSet(JvmPackage.TYPE__DESCRIPTOR, JvmPackage.Literals.TYPE__DESCRIPTOR, newDescriptor);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSignature() {
		return (String)eDynamicGet(JvmPackage.TYPE__SIGNATURE, JvmPackage.Literals.TYPE__SIGNATURE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSignature(String newSignature) {
		eDynamicSet(JvmPackage.TYPE__SIGNATURE, JvmPackage.Literals.TYPE__SIGNATURE, newSignature);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAbstract() {
		return (Boolean)eDynamicGet(JvmPackage.TYPE__ABSTRACT, JvmPackage.Literals.TYPE__ABSTRACT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAbstract(boolean newAbstract) {
		eDynamicSet(JvmPackage.TYPE__ABSTRACT, JvmPackage.Literals.TYPE__ABSTRACT, newAbstract);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isFinal() {
		return (Boolean)eDynamicGet(JvmPackage.TYPE__FINAL, JvmPackage.Literals.TYPE__FINAL, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFinal(boolean newFinal) {
		eDynamicSet(JvmPackage.TYPE__FINAL, JvmPackage.Literals.TYPE__FINAL, newFinal);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSynthetic() {
		return (Boolean)eDynamicGet(JvmPackage.TYPE__SYNTHETIC, JvmPackage.Literals.TYPE__SYNTHETIC, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSynthetic(boolean newSynthetic) {
		eDynamicSet(JvmPackage.TYPE__SYNTHETIC, JvmPackage.Literals.TYPE__SYNTHETIC, newSynthetic);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSealed() {
		return (Boolean)eDynamicGet(JvmPackage.TYPE__SEALED, JvmPackage.Literals.TYPE__SEALED, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSealed(boolean newSealed) {
		eDynamicSet(JvmPackage.TYPE__SEALED, JvmPackage.Literals.TYPE__SEALED, newSealed);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getClassFileVersion() {
		return (Integer)eDynamicGet(JvmPackage.TYPE__CLASS_FILE_VERSION, JvmPackage.Literals.TYPE__CLASS_FILE_VERSION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClassFileVersion(int newClassFileVersion) {
		eDynamicSet(JvmPackage.TYPE__CLASS_FILE_VERSION, JvmPackage.Literals.TYPE__CLASS_FILE_VERSION, newClassFileVersion);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Method> getMethods() {
		return (EList<Method>)eDynamicGet(JvmPackage.TYPE__METHODS, JvmPackage.Literals.TYPE__METHODS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Field> getFields() {
		return (EList<Field>)eDynamicGet(JvmPackage.TYPE__FIELDS, JvmPackage.Literals.TYPE__FIELDS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type getSuperType() {
		return (Type)eDynamicGet(JvmPackage.TYPE__SUPER_TYPE, JvmPackage.Literals.TYPE__SUPER_TYPE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type basicGetSuperType() {
		return (Type)eDynamicGet(JvmPackage.TYPE__SUPER_TYPE, JvmPackage.Literals.TYPE__SUPER_TYPE, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSuperType(Type newSuperType) {
		eDynamicSet(JvmPackage.TYPE__SUPER_TYPE, JvmPackage.Literals.TYPE__SUPER_TYPE, newSuperType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Type> getInterfaces() {
		return (EList<Type>)eDynamicGet(JvmPackage.TYPE__INTERFACES, JvmPackage.Literals.TYPE__INTERFACES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type getComponentType() {
		return (Type)eDynamicGet(JvmPackage.TYPE__COMPONENT_TYPE, JvmPackage.Literals.TYPE__COMPONENT_TYPE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type basicGetComponentType() {
		return (Type)eDynamicGet(JvmPackage.TYPE__COMPONENT_TYPE, JvmPackage.Literals.TYPE__COMPONENT_TYPE, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComponentType(Type newComponentType) {
		eDynamicSet(JvmPackage.TYPE__COMPONENT_TYPE, JvmPackage.Literals.TYPE__COMPONENT_TYPE, newComponentType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.nasdanika.sdk.runtime.models.jvm.Module getModule() {
		return (org.nasdanika.sdk.runtime.models.jvm.Module)eDynamicGet(JvmPackage.TYPE__MODULE, JvmPackage.Literals.TYPE__MODULE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.nasdanika.sdk.runtime.models.jvm.Module basicGetModule() {
		return (org.nasdanika.sdk.runtime.models.jvm.Module)eDynamicGet(JvmPackage.TYPE__MODULE, JvmPackage.Literals.TYPE__MODULE, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModule(org.nasdanika.sdk.runtime.models.jvm.Module newModule) {
		eDynamicSet(JvmPackage.TYPE__MODULE, JvmPackage.Literals.TYPE__MODULE, newModule);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JvmPackage.TYPE__METHODS:
				return ((InternalEList<?>)getMethods()).basicRemove(otherEnd, msgs);
			case JvmPackage.TYPE__FIELDS:
				return ((InternalEList<?>)getFields()).basicRemove(otherEnd, msgs);
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
			case JvmPackage.TYPE__KIND:
				return getKind();
			case JvmPackage.TYPE__ACCESS:
				return getAccess();
			case JvmPackage.TYPE__BINARY_NAME:
				return getBinaryName();
			case JvmPackage.TYPE__DESCRIPTOR:
				return getDescriptor();
			case JvmPackage.TYPE__SIGNATURE:
				return getSignature();
			case JvmPackage.TYPE__ABSTRACT:
				return isAbstract();
			case JvmPackage.TYPE__FINAL:
				return isFinal();
			case JvmPackage.TYPE__SYNTHETIC:
				return isSynthetic();
			case JvmPackage.TYPE__SEALED:
				return isSealed();
			case JvmPackage.TYPE__CLASS_FILE_VERSION:
				return getClassFileVersion();
			case JvmPackage.TYPE__METHODS:
				return getMethods();
			case JvmPackage.TYPE__FIELDS:
				return getFields();
			case JvmPackage.TYPE__SUPER_TYPE:
				if (resolve) return getSuperType();
				return basicGetSuperType();
			case JvmPackage.TYPE__INTERFACES:
				return getInterfaces();
			case JvmPackage.TYPE__COMPONENT_TYPE:
				if (resolve) return getComponentType();
				return basicGetComponentType();
			case JvmPackage.TYPE__MODULE:
				if (resolve) return getModule();
				return basicGetModule();
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
			case JvmPackage.TYPE__KIND:
				setKind((TypeKind)newValue);
				return;
			case JvmPackage.TYPE__ACCESS:
				setAccess((AccessLevel)newValue);
				return;
			case JvmPackage.TYPE__BINARY_NAME:
				setBinaryName((String)newValue);
				return;
			case JvmPackage.TYPE__DESCRIPTOR:
				setDescriptor((String)newValue);
				return;
			case JvmPackage.TYPE__SIGNATURE:
				setSignature((String)newValue);
				return;
			case JvmPackage.TYPE__ABSTRACT:
				setAbstract((Boolean)newValue);
				return;
			case JvmPackage.TYPE__FINAL:
				setFinal((Boolean)newValue);
				return;
			case JvmPackage.TYPE__SYNTHETIC:
				setSynthetic((Boolean)newValue);
				return;
			case JvmPackage.TYPE__SEALED:
				setSealed((Boolean)newValue);
				return;
			case JvmPackage.TYPE__CLASS_FILE_VERSION:
				setClassFileVersion((Integer)newValue);
				return;
			case JvmPackage.TYPE__METHODS:
				getMethods().clear();
				getMethods().addAll((Collection<? extends Method>)newValue);
				return;
			case JvmPackage.TYPE__FIELDS:
				getFields().clear();
				getFields().addAll((Collection<? extends Field>)newValue);
				return;
			case JvmPackage.TYPE__SUPER_TYPE:
				setSuperType((Type)newValue);
				return;
			case JvmPackage.TYPE__INTERFACES:
				getInterfaces().clear();
				getInterfaces().addAll((Collection<? extends Type>)newValue);
				return;
			case JvmPackage.TYPE__COMPONENT_TYPE:
				setComponentType((Type)newValue);
				return;
			case JvmPackage.TYPE__MODULE:
				setModule((org.nasdanika.sdk.runtime.models.jvm.Module)newValue);
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
			case JvmPackage.TYPE__KIND:
				setKind(KIND_EDEFAULT);
				return;
			case JvmPackage.TYPE__ACCESS:
				setAccess(ACCESS_EDEFAULT);
				return;
			case JvmPackage.TYPE__BINARY_NAME:
				setBinaryName(BINARY_NAME_EDEFAULT);
				return;
			case JvmPackage.TYPE__DESCRIPTOR:
				setDescriptor(DESCRIPTOR_EDEFAULT);
				return;
			case JvmPackage.TYPE__SIGNATURE:
				setSignature(SIGNATURE_EDEFAULT);
				return;
			case JvmPackage.TYPE__ABSTRACT:
				setAbstract(ABSTRACT_EDEFAULT);
				return;
			case JvmPackage.TYPE__FINAL:
				setFinal(FINAL_EDEFAULT);
				return;
			case JvmPackage.TYPE__SYNTHETIC:
				setSynthetic(SYNTHETIC_EDEFAULT);
				return;
			case JvmPackage.TYPE__SEALED:
				setSealed(SEALED_EDEFAULT);
				return;
			case JvmPackage.TYPE__CLASS_FILE_VERSION:
				setClassFileVersion(CLASS_FILE_VERSION_EDEFAULT);
				return;
			case JvmPackage.TYPE__METHODS:
				getMethods().clear();
				return;
			case JvmPackage.TYPE__FIELDS:
				getFields().clear();
				return;
			case JvmPackage.TYPE__SUPER_TYPE:
				setSuperType((Type)null);
				return;
			case JvmPackage.TYPE__INTERFACES:
				getInterfaces().clear();
				return;
			case JvmPackage.TYPE__COMPONENT_TYPE:
				setComponentType((Type)null);
				return;
			case JvmPackage.TYPE__MODULE:
				setModule((org.nasdanika.sdk.runtime.models.jvm.Module)null);
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
			case JvmPackage.TYPE__KIND:
				return getKind() != KIND_EDEFAULT;
			case JvmPackage.TYPE__ACCESS:
				return getAccess() != ACCESS_EDEFAULT;
			case JvmPackage.TYPE__BINARY_NAME:
				return BINARY_NAME_EDEFAULT == null ? getBinaryName() != null : !BINARY_NAME_EDEFAULT.equals(getBinaryName());
			case JvmPackage.TYPE__DESCRIPTOR:
				return DESCRIPTOR_EDEFAULT == null ? getDescriptor() != null : !DESCRIPTOR_EDEFAULT.equals(getDescriptor());
			case JvmPackage.TYPE__SIGNATURE:
				return SIGNATURE_EDEFAULT == null ? getSignature() != null : !SIGNATURE_EDEFAULT.equals(getSignature());
			case JvmPackage.TYPE__ABSTRACT:
				return isAbstract() != ABSTRACT_EDEFAULT;
			case JvmPackage.TYPE__FINAL:
				return isFinal() != FINAL_EDEFAULT;
			case JvmPackage.TYPE__SYNTHETIC:
				return isSynthetic() != SYNTHETIC_EDEFAULT;
			case JvmPackage.TYPE__SEALED:
				return isSealed() != SEALED_EDEFAULT;
			case JvmPackage.TYPE__CLASS_FILE_VERSION:
				return getClassFileVersion() != CLASS_FILE_VERSION_EDEFAULT;
			case JvmPackage.TYPE__METHODS:
				return !getMethods().isEmpty();
			case JvmPackage.TYPE__FIELDS:
				return !getFields().isEmpty();
			case JvmPackage.TYPE__SUPER_TYPE:
				return basicGetSuperType() != null;
			case JvmPackage.TYPE__INTERFACES:
				return !getInterfaces().isEmpty();
			case JvmPackage.TYPE__COMPONENT_TYPE:
				return basicGetComponentType() != null;
			case JvmPackage.TYPE__MODULE:
				return basicGetModule() != null;
		}
		return super.eIsSet(featureID);
	}

} //TypeImpl
