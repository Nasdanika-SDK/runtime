/**
 */
package org.nasdanika.sdk.runtime.models.jvm.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.sdk.runtime.models.jvm.JvmPackage;
import org.nasdanika.sdk.runtime.models.jvm.Method;
import org.nasdanika.sdk.runtime.models.jvm.Parameter;
import org.nasdanika.sdk.runtime.models.jvm.Type;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Method</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.jvm.impl.MethodImpl#isAbstract <em>Abstract</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.jvm.impl.MethodImpl#isSynchronized <em>Synchronized</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.jvm.impl.MethodImpl#isNative <em>Native</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.jvm.impl.MethodImpl#isBridge <em>Bridge</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.jvm.impl.MethodImpl#isVarargs <em>Varargs</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.jvm.impl.MethodImpl#isDefault <em>Default</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.jvm.impl.MethodImpl#getReturnDescriptor <em>Return Descriptor</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.jvm.impl.MethodImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.jvm.impl.MethodImpl#getReturnType <em>Return Type</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.jvm.impl.MethodImpl#getThrownTypeNames <em>Thrown Type Names</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.jvm.impl.MethodImpl#getThrownTypes <em>Thrown Types</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MethodImpl extends MemberImpl implements Method {
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
	 * The default value of the '{@link #isSynchronized() <em>Synchronized</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSynchronized()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SYNCHRONIZED_EDEFAULT = false;

	/**
	 * The default value of the '{@link #isNative() <em>Native</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNative()
	 * @generated
	 * @ordered
	 */
	protected static final boolean NATIVE_EDEFAULT = false;

	/**
	 * The default value of the '{@link #isBridge() <em>Bridge</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBridge()
	 * @generated
	 * @ordered
	 */
	protected static final boolean BRIDGE_EDEFAULT = false;

	/**
	 * The default value of the '{@link #isVarargs() <em>Varargs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isVarargs()
	 * @generated
	 * @ordered
	 */
	protected static final boolean VARARGS_EDEFAULT = false;

	/**
	 * The default value of the '{@link #isDefault() <em>Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDefault()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DEFAULT_EDEFAULT = false;

	/**
	 * The default value of the '{@link #getReturnDescriptor() <em>Return Descriptor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnDescriptor()
	 * @generated
	 * @ordered
	 */
	protected static final String RETURN_DESCRIPTOR_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MethodImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JvmPackage.Literals.METHOD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAbstract() {
		return (Boolean)eDynamicGet(JvmPackage.METHOD__ABSTRACT, JvmPackage.Literals.METHOD__ABSTRACT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAbstract(boolean newAbstract) {
		eDynamicSet(JvmPackage.METHOD__ABSTRACT, JvmPackage.Literals.METHOD__ABSTRACT, newAbstract);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSynchronized() {
		return (Boolean)eDynamicGet(JvmPackage.METHOD__SYNCHRONIZED, JvmPackage.Literals.METHOD__SYNCHRONIZED, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSynchronized(boolean newSynchronized) {
		eDynamicSet(JvmPackage.METHOD__SYNCHRONIZED, JvmPackage.Literals.METHOD__SYNCHRONIZED, newSynchronized);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isNative() {
		return (Boolean)eDynamicGet(JvmPackage.METHOD__NATIVE, JvmPackage.Literals.METHOD__NATIVE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNative(boolean newNative) {
		eDynamicSet(JvmPackage.METHOD__NATIVE, JvmPackage.Literals.METHOD__NATIVE, newNative);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isBridge() {
		return (Boolean)eDynamicGet(JvmPackage.METHOD__BRIDGE, JvmPackage.Literals.METHOD__BRIDGE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBridge(boolean newBridge) {
		eDynamicSet(JvmPackage.METHOD__BRIDGE, JvmPackage.Literals.METHOD__BRIDGE, newBridge);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isVarargs() {
		return (Boolean)eDynamicGet(JvmPackage.METHOD__VARARGS, JvmPackage.Literals.METHOD__VARARGS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVarargs(boolean newVarargs) {
		eDynamicSet(JvmPackage.METHOD__VARARGS, JvmPackage.Literals.METHOD__VARARGS, newVarargs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDefault() {
		return (Boolean)eDynamicGet(JvmPackage.METHOD__DEFAULT, JvmPackage.Literals.METHOD__DEFAULT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefault(boolean newDefault) {
		eDynamicSet(JvmPackage.METHOD__DEFAULT, JvmPackage.Literals.METHOD__DEFAULT, newDefault);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getReturnDescriptor() {
		return (String)eDynamicGet(JvmPackage.METHOD__RETURN_DESCRIPTOR, JvmPackage.Literals.METHOD__RETURN_DESCRIPTOR, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReturnDescriptor(String newReturnDescriptor) {
		eDynamicSet(JvmPackage.METHOD__RETURN_DESCRIPTOR, JvmPackage.Literals.METHOD__RETURN_DESCRIPTOR, newReturnDescriptor);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Parameter> getParameters() {
		return (EList<Parameter>)eDynamicGet(JvmPackage.METHOD__PARAMETERS, JvmPackage.Literals.METHOD__PARAMETERS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type getReturnType() {
		return (Type)eDynamicGet(JvmPackage.METHOD__RETURN_TYPE, JvmPackage.Literals.METHOD__RETURN_TYPE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type basicGetReturnType() {
		return (Type)eDynamicGet(JvmPackage.METHOD__RETURN_TYPE, JvmPackage.Literals.METHOD__RETURN_TYPE, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReturnType(Type newReturnType) {
		eDynamicSet(JvmPackage.METHOD__RETURN_TYPE, JvmPackage.Literals.METHOD__RETURN_TYPE, newReturnType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<String> getThrownTypeNames() {
		return (EList<String>)eDynamicGet(JvmPackage.METHOD__THROWN_TYPE_NAMES, JvmPackage.Literals.METHOD__THROWN_TYPE_NAMES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Type> getThrownTypes() {
		return (EList<Type>)eDynamicGet(JvmPackage.METHOD__THROWN_TYPES, JvmPackage.Literals.METHOD__THROWN_TYPES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JvmPackage.METHOD__PARAMETERS:
				return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
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
			case JvmPackage.METHOD__ABSTRACT:
				return isAbstract();
			case JvmPackage.METHOD__SYNCHRONIZED:
				return isSynchronized();
			case JvmPackage.METHOD__NATIVE:
				return isNative();
			case JvmPackage.METHOD__BRIDGE:
				return isBridge();
			case JvmPackage.METHOD__VARARGS:
				return isVarargs();
			case JvmPackage.METHOD__DEFAULT:
				return isDefault();
			case JvmPackage.METHOD__RETURN_DESCRIPTOR:
				return getReturnDescriptor();
			case JvmPackage.METHOD__PARAMETERS:
				return getParameters();
			case JvmPackage.METHOD__RETURN_TYPE:
				if (resolve) return getReturnType();
				return basicGetReturnType();
			case JvmPackage.METHOD__THROWN_TYPE_NAMES:
				return getThrownTypeNames();
			case JvmPackage.METHOD__THROWN_TYPES:
				return getThrownTypes();
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
			case JvmPackage.METHOD__ABSTRACT:
				setAbstract((Boolean)newValue);
				return;
			case JvmPackage.METHOD__SYNCHRONIZED:
				setSynchronized((Boolean)newValue);
				return;
			case JvmPackage.METHOD__NATIVE:
				setNative((Boolean)newValue);
				return;
			case JvmPackage.METHOD__BRIDGE:
				setBridge((Boolean)newValue);
				return;
			case JvmPackage.METHOD__VARARGS:
				setVarargs((Boolean)newValue);
				return;
			case JvmPackage.METHOD__DEFAULT:
				setDefault((Boolean)newValue);
				return;
			case JvmPackage.METHOD__RETURN_DESCRIPTOR:
				setReturnDescriptor((String)newValue);
				return;
			case JvmPackage.METHOD__PARAMETERS:
				getParameters().clear();
				getParameters().addAll((Collection<? extends Parameter>)newValue);
				return;
			case JvmPackage.METHOD__RETURN_TYPE:
				setReturnType((Type)newValue);
				return;
			case JvmPackage.METHOD__THROWN_TYPE_NAMES:
				getThrownTypeNames().clear();
				getThrownTypeNames().addAll((Collection<? extends String>)newValue);
				return;
			case JvmPackage.METHOD__THROWN_TYPES:
				getThrownTypes().clear();
				getThrownTypes().addAll((Collection<? extends Type>)newValue);
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
			case JvmPackage.METHOD__ABSTRACT:
				setAbstract(ABSTRACT_EDEFAULT);
				return;
			case JvmPackage.METHOD__SYNCHRONIZED:
				setSynchronized(SYNCHRONIZED_EDEFAULT);
				return;
			case JvmPackage.METHOD__NATIVE:
				setNative(NATIVE_EDEFAULT);
				return;
			case JvmPackage.METHOD__BRIDGE:
				setBridge(BRIDGE_EDEFAULT);
				return;
			case JvmPackage.METHOD__VARARGS:
				setVarargs(VARARGS_EDEFAULT);
				return;
			case JvmPackage.METHOD__DEFAULT:
				setDefault(DEFAULT_EDEFAULT);
				return;
			case JvmPackage.METHOD__RETURN_DESCRIPTOR:
				setReturnDescriptor(RETURN_DESCRIPTOR_EDEFAULT);
				return;
			case JvmPackage.METHOD__PARAMETERS:
				getParameters().clear();
				return;
			case JvmPackage.METHOD__RETURN_TYPE:
				setReturnType((Type)null);
				return;
			case JvmPackage.METHOD__THROWN_TYPE_NAMES:
				getThrownTypeNames().clear();
				return;
			case JvmPackage.METHOD__THROWN_TYPES:
				getThrownTypes().clear();
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
			case JvmPackage.METHOD__ABSTRACT:
				return isAbstract() != ABSTRACT_EDEFAULT;
			case JvmPackage.METHOD__SYNCHRONIZED:
				return isSynchronized() != SYNCHRONIZED_EDEFAULT;
			case JvmPackage.METHOD__NATIVE:
				return isNative() != NATIVE_EDEFAULT;
			case JvmPackage.METHOD__BRIDGE:
				return isBridge() != BRIDGE_EDEFAULT;
			case JvmPackage.METHOD__VARARGS:
				return isVarargs() != VARARGS_EDEFAULT;
			case JvmPackage.METHOD__DEFAULT:
				return isDefault() != DEFAULT_EDEFAULT;
			case JvmPackage.METHOD__RETURN_DESCRIPTOR:
				return RETURN_DESCRIPTOR_EDEFAULT == null ? getReturnDescriptor() != null : !RETURN_DESCRIPTOR_EDEFAULT.equals(getReturnDescriptor());
			case JvmPackage.METHOD__PARAMETERS:
				return !getParameters().isEmpty();
			case JvmPackage.METHOD__RETURN_TYPE:
				return basicGetReturnType() != null;
			case JvmPackage.METHOD__THROWN_TYPE_NAMES:
				return !getThrownTypeNames().isEmpty();
			case JvmPackage.METHOD__THROWN_TYPES:
				return !getThrownTypes().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MethodImpl
