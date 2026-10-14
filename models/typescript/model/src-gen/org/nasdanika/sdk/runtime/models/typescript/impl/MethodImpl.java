/**
 */
package org.nasdanika.sdk.runtime.models.typescript.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.sdk.runtime.models.typescript.Callable;
import org.nasdanika.sdk.runtime.models.typescript.CodeBlock;
import org.nasdanika.sdk.runtime.models.typescript.Method;
import org.nasdanika.sdk.runtime.models.typescript.Parameter;
import org.nasdanika.sdk.runtime.models.typescript.TypeParameter;
import org.nasdanika.sdk.runtime.models.typescript.TypeReference;
import org.nasdanika.sdk.runtime.models.typescript.TypescriptPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Method</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.typescript.impl.MethodImpl#getTypeParameters <em>Type Parameters</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.typescript.impl.MethodImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.typescript.impl.MethodImpl#getReturnType <em>Return Type</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.typescript.impl.MethodImpl#getBody <em>Body</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.typescript.impl.MethodImpl#isAsync <em>Async</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.typescript.impl.MethodImpl#isGenerator <em>Generator</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.typescript.impl.MethodImpl#isAbstract <em>Abstract</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MethodImpl extends MemberImpl implements Method {
	/**
	 * The default value of the '{@link #isAsync() <em>Async</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAsync()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ASYNC_EDEFAULT = false;

	/**
	 * The default value of the '{@link #isGenerator() <em>Generator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGenerator()
	 * @generated
	 * @ordered
	 */
	protected static final boolean GENERATOR_EDEFAULT = false;

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
		return TypescriptPackage.Literals.METHOD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<TypeParameter> getTypeParameters() {
		return (EList<TypeParameter>)eDynamicGet(TypescriptPackage.METHOD__TYPE_PARAMETERS, TypescriptPackage.Literals.CALLABLE__TYPE_PARAMETERS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Parameter> getParameters() {
		return (EList<Parameter>)eDynamicGet(TypescriptPackage.METHOD__PARAMETERS, TypescriptPackage.Literals.CALLABLE__PARAMETERS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeReference getReturnType() {
		return (TypeReference)eDynamicGet(TypescriptPackage.METHOD__RETURN_TYPE, TypescriptPackage.Literals.CALLABLE__RETURN_TYPE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReturnType(TypeReference newReturnType, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newReturnType, TypescriptPackage.METHOD__RETURN_TYPE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReturnType(TypeReference newReturnType) {
		eDynamicSet(TypescriptPackage.METHOD__RETURN_TYPE, TypescriptPackage.Literals.CALLABLE__RETURN_TYPE, newReturnType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeBlock getBody() {
		return (CodeBlock)eDynamicGet(TypescriptPackage.METHOD__BODY, TypescriptPackage.Literals.CALLABLE__BODY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBody(CodeBlock newBody, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newBody, TypescriptPackage.METHOD__BODY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBody(CodeBlock newBody) {
		eDynamicSet(TypescriptPackage.METHOD__BODY, TypescriptPackage.Literals.CALLABLE__BODY, newBody);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAsync() {
		return (Boolean)eDynamicGet(TypescriptPackage.METHOD__ASYNC, TypescriptPackage.Literals.CALLABLE__ASYNC, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAsync(boolean newAsync) {
		eDynamicSet(TypescriptPackage.METHOD__ASYNC, TypescriptPackage.Literals.CALLABLE__ASYNC, newAsync);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isGenerator() {
		return (Boolean)eDynamicGet(TypescriptPackage.METHOD__GENERATOR, TypescriptPackage.Literals.CALLABLE__GENERATOR, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGenerator(boolean newGenerator) {
		eDynamicSet(TypescriptPackage.METHOD__GENERATOR, TypescriptPackage.Literals.CALLABLE__GENERATOR, newGenerator);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAbstract() {
		return (Boolean)eDynamicGet(TypescriptPackage.METHOD__ABSTRACT, TypescriptPackage.Literals.METHOD__ABSTRACT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAbstract(boolean newAbstract) {
		eDynamicSet(TypescriptPackage.METHOD__ABSTRACT, TypescriptPackage.Literals.METHOD__ABSTRACT, newAbstract);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypescriptPackage.METHOD__TYPE_PARAMETERS:
				return ((InternalEList<?>)getTypeParameters()).basicRemove(otherEnd, msgs);
			case TypescriptPackage.METHOD__PARAMETERS:
				return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
			case TypescriptPackage.METHOD__RETURN_TYPE:
				return basicSetReturnType(null, msgs);
			case TypescriptPackage.METHOD__BODY:
				return basicSetBody(null, msgs);
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
			case TypescriptPackage.METHOD__TYPE_PARAMETERS:
				return getTypeParameters();
			case TypescriptPackage.METHOD__PARAMETERS:
				return getParameters();
			case TypescriptPackage.METHOD__RETURN_TYPE:
				return getReturnType();
			case TypescriptPackage.METHOD__BODY:
				return getBody();
			case TypescriptPackage.METHOD__ASYNC:
				return isAsync();
			case TypescriptPackage.METHOD__GENERATOR:
				return isGenerator();
			case TypescriptPackage.METHOD__ABSTRACT:
				return isAbstract();
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
			case TypescriptPackage.METHOD__TYPE_PARAMETERS:
				getTypeParameters().clear();
				getTypeParameters().addAll((Collection<? extends TypeParameter>)newValue);
				return;
			case TypescriptPackage.METHOD__PARAMETERS:
				getParameters().clear();
				getParameters().addAll((Collection<? extends Parameter>)newValue);
				return;
			case TypescriptPackage.METHOD__RETURN_TYPE:
				setReturnType((TypeReference)newValue);
				return;
			case TypescriptPackage.METHOD__BODY:
				setBody((CodeBlock)newValue);
				return;
			case TypescriptPackage.METHOD__ASYNC:
				setAsync((Boolean)newValue);
				return;
			case TypescriptPackage.METHOD__GENERATOR:
				setGenerator((Boolean)newValue);
				return;
			case TypescriptPackage.METHOD__ABSTRACT:
				setAbstract((Boolean)newValue);
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
			case TypescriptPackage.METHOD__TYPE_PARAMETERS:
				getTypeParameters().clear();
				return;
			case TypescriptPackage.METHOD__PARAMETERS:
				getParameters().clear();
				return;
			case TypescriptPackage.METHOD__RETURN_TYPE:
				setReturnType((TypeReference)null);
				return;
			case TypescriptPackage.METHOD__BODY:
				setBody((CodeBlock)null);
				return;
			case TypescriptPackage.METHOD__ASYNC:
				setAsync(ASYNC_EDEFAULT);
				return;
			case TypescriptPackage.METHOD__GENERATOR:
				setGenerator(GENERATOR_EDEFAULT);
				return;
			case TypescriptPackage.METHOD__ABSTRACT:
				setAbstract(ABSTRACT_EDEFAULT);
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
			case TypescriptPackage.METHOD__TYPE_PARAMETERS:
				return !getTypeParameters().isEmpty();
			case TypescriptPackage.METHOD__PARAMETERS:
				return !getParameters().isEmpty();
			case TypescriptPackage.METHOD__RETURN_TYPE:
				return getReturnType() != null;
			case TypescriptPackage.METHOD__BODY:
				return getBody() != null;
			case TypescriptPackage.METHOD__ASYNC:
				return isAsync() != ASYNC_EDEFAULT;
			case TypescriptPackage.METHOD__GENERATOR:
				return isGenerator() != GENERATOR_EDEFAULT;
			case TypescriptPackage.METHOD__ABSTRACT:
				return isAbstract() != ABSTRACT_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == Callable.class) {
			switch (derivedFeatureID) {
				case TypescriptPackage.METHOD__TYPE_PARAMETERS: return TypescriptPackage.CALLABLE__TYPE_PARAMETERS;
				case TypescriptPackage.METHOD__PARAMETERS: return TypescriptPackage.CALLABLE__PARAMETERS;
				case TypescriptPackage.METHOD__RETURN_TYPE: return TypescriptPackage.CALLABLE__RETURN_TYPE;
				case TypescriptPackage.METHOD__BODY: return TypescriptPackage.CALLABLE__BODY;
				case TypescriptPackage.METHOD__ASYNC: return TypescriptPackage.CALLABLE__ASYNC;
				case TypescriptPackage.METHOD__GENERATOR: return TypescriptPackage.CALLABLE__GENERATOR;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == Callable.class) {
			switch (baseFeatureID) {
				case TypescriptPackage.CALLABLE__TYPE_PARAMETERS: return TypescriptPackage.METHOD__TYPE_PARAMETERS;
				case TypescriptPackage.CALLABLE__PARAMETERS: return TypescriptPackage.METHOD__PARAMETERS;
				case TypescriptPackage.CALLABLE__RETURN_TYPE: return TypescriptPackage.METHOD__RETURN_TYPE;
				case TypescriptPackage.CALLABLE__BODY: return TypescriptPackage.METHOD__BODY;
				case TypescriptPackage.CALLABLE__ASYNC: return TypescriptPackage.METHOD__ASYNC;
				case TypescriptPackage.CALLABLE__GENERATOR: return TypescriptPackage.METHOD__GENERATOR;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //MethodImpl
