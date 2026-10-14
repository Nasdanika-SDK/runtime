/**
 */
package org.nasdanika.sdk.runtime.models.typescript.impl;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.nasdanika.sdk.runtime.models.typescript.CodeBlock;
import org.nasdanika.sdk.runtime.models.typescript.Parameter;
import org.nasdanika.sdk.runtime.models.typescript.TypeReference;
import org.nasdanika.sdk.runtime.models.typescript.TypescriptPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.typescript.impl.ParameterImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.typescript.impl.ParameterImpl#isOptional <em>Optional</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.typescript.impl.ParameterImpl#isRest <em>Rest</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.typescript.impl.ParameterImpl#getDefaultValue <em>Default Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ParameterImpl extends TypeScriptElementImpl implements Parameter {
	/**
	 * The default value of the '{@link #isOptional() <em>Optional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOptional()
	 * @generated
	 * @ordered
	 */
	protected static final boolean OPTIONAL_EDEFAULT = false;

	/**
	 * The default value of the '{@link #isRest() <em>Rest</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRest()
	 * @generated
	 * @ordered
	 */
	protected static final boolean REST_EDEFAULT = false;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParameterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypescriptPackage.Literals.PARAMETER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeReference getType() {
		return (TypeReference)eDynamicGet(TypescriptPackage.PARAMETER__TYPE, TypescriptPackage.Literals.PARAMETER__TYPE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetType(TypeReference newType, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newType, TypescriptPackage.PARAMETER__TYPE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(TypeReference newType) {
		eDynamicSet(TypescriptPackage.PARAMETER__TYPE, TypescriptPackage.Literals.PARAMETER__TYPE, newType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isOptional() {
		return (Boolean)eDynamicGet(TypescriptPackage.PARAMETER__OPTIONAL, TypescriptPackage.Literals.PARAMETER__OPTIONAL, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOptional(boolean newOptional) {
		eDynamicSet(TypescriptPackage.PARAMETER__OPTIONAL, TypescriptPackage.Literals.PARAMETER__OPTIONAL, newOptional);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isRest() {
		return (Boolean)eDynamicGet(TypescriptPackage.PARAMETER__REST, TypescriptPackage.Literals.PARAMETER__REST, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRest(boolean newRest) {
		eDynamicSet(TypescriptPackage.PARAMETER__REST, TypescriptPackage.Literals.PARAMETER__REST, newRest);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeBlock getDefaultValue() {
		return (CodeBlock)eDynamicGet(TypescriptPackage.PARAMETER__DEFAULT_VALUE, TypescriptPackage.Literals.PARAMETER__DEFAULT_VALUE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefaultValue(CodeBlock newDefaultValue, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newDefaultValue, TypescriptPackage.PARAMETER__DEFAULT_VALUE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultValue(CodeBlock newDefaultValue) {
		eDynamicSet(TypescriptPackage.PARAMETER__DEFAULT_VALUE, TypescriptPackage.Literals.PARAMETER__DEFAULT_VALUE, newDefaultValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypescriptPackage.PARAMETER__TYPE:
				return basicSetType(null, msgs);
			case TypescriptPackage.PARAMETER__DEFAULT_VALUE:
				return basicSetDefaultValue(null, msgs);
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
			case TypescriptPackage.PARAMETER__TYPE:
				return getType();
			case TypescriptPackage.PARAMETER__OPTIONAL:
				return isOptional();
			case TypescriptPackage.PARAMETER__REST:
				return isRest();
			case TypescriptPackage.PARAMETER__DEFAULT_VALUE:
				return getDefaultValue();
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
			case TypescriptPackage.PARAMETER__TYPE:
				setType((TypeReference)newValue);
				return;
			case TypescriptPackage.PARAMETER__OPTIONAL:
				setOptional((Boolean)newValue);
				return;
			case TypescriptPackage.PARAMETER__REST:
				setRest((Boolean)newValue);
				return;
			case TypescriptPackage.PARAMETER__DEFAULT_VALUE:
				setDefaultValue((CodeBlock)newValue);
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
			case TypescriptPackage.PARAMETER__TYPE:
				setType((TypeReference)null);
				return;
			case TypescriptPackage.PARAMETER__OPTIONAL:
				setOptional(OPTIONAL_EDEFAULT);
				return;
			case TypescriptPackage.PARAMETER__REST:
				setRest(REST_EDEFAULT);
				return;
			case TypescriptPackage.PARAMETER__DEFAULT_VALUE:
				setDefaultValue((CodeBlock)null);
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
			case TypescriptPackage.PARAMETER__TYPE:
				return getType() != null;
			case TypescriptPackage.PARAMETER__OPTIONAL:
				return isOptional() != OPTIONAL_EDEFAULT;
			case TypescriptPackage.PARAMETER__REST:
				return isRest() != REST_EDEFAULT;
			case TypescriptPackage.PARAMETER__DEFAULT_VALUE:
				return getDefaultValue() != null;
		}
		return super.eIsSet(featureID);
	}

} //ParameterImpl
