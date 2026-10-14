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
import org.nasdanika.sdk.runtime.models.typescript.Parameter;
import org.nasdanika.sdk.runtime.models.typescript.TypeParameter;
import org.nasdanika.sdk.runtime.models.typescript.TypeReference;
import org.nasdanika.sdk.runtime.models.typescript.TypescriptPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Callable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.typescript.impl.CallableImpl#getTypeParameters <em>Type Parameters</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.typescript.impl.CallableImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.typescript.impl.CallableImpl#getReturnType <em>Return Type</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.typescript.impl.CallableImpl#getBody <em>Body</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.typescript.impl.CallableImpl#isAsync <em>Async</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.typescript.impl.CallableImpl#isGenerator <em>Generator</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class CallableImpl extends TypeScriptElementImpl implements Callable {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CallableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypescriptPackage.Literals.CALLABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<TypeParameter> getTypeParameters() {
		return (EList<TypeParameter>)eDynamicGet(TypescriptPackage.CALLABLE__TYPE_PARAMETERS, TypescriptPackage.Literals.CALLABLE__TYPE_PARAMETERS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Parameter> getParameters() {
		return (EList<Parameter>)eDynamicGet(TypescriptPackage.CALLABLE__PARAMETERS, TypescriptPackage.Literals.CALLABLE__PARAMETERS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeReference getReturnType() {
		return (TypeReference)eDynamicGet(TypescriptPackage.CALLABLE__RETURN_TYPE, TypescriptPackage.Literals.CALLABLE__RETURN_TYPE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReturnType(TypeReference newReturnType, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newReturnType, TypescriptPackage.CALLABLE__RETURN_TYPE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReturnType(TypeReference newReturnType) {
		eDynamicSet(TypescriptPackage.CALLABLE__RETURN_TYPE, TypescriptPackage.Literals.CALLABLE__RETURN_TYPE, newReturnType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeBlock getBody() {
		return (CodeBlock)eDynamicGet(TypescriptPackage.CALLABLE__BODY, TypescriptPackage.Literals.CALLABLE__BODY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBody(CodeBlock newBody, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newBody, TypescriptPackage.CALLABLE__BODY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBody(CodeBlock newBody) {
		eDynamicSet(TypescriptPackage.CALLABLE__BODY, TypescriptPackage.Literals.CALLABLE__BODY, newBody);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAsync() {
		return (Boolean)eDynamicGet(TypescriptPackage.CALLABLE__ASYNC, TypescriptPackage.Literals.CALLABLE__ASYNC, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAsync(boolean newAsync) {
		eDynamicSet(TypescriptPackage.CALLABLE__ASYNC, TypescriptPackage.Literals.CALLABLE__ASYNC, newAsync);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isGenerator() {
		return (Boolean)eDynamicGet(TypescriptPackage.CALLABLE__GENERATOR, TypescriptPackage.Literals.CALLABLE__GENERATOR, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGenerator(boolean newGenerator) {
		eDynamicSet(TypescriptPackage.CALLABLE__GENERATOR, TypescriptPackage.Literals.CALLABLE__GENERATOR, newGenerator);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypescriptPackage.CALLABLE__TYPE_PARAMETERS:
				return ((InternalEList<?>)getTypeParameters()).basicRemove(otherEnd, msgs);
			case TypescriptPackage.CALLABLE__PARAMETERS:
				return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
			case TypescriptPackage.CALLABLE__RETURN_TYPE:
				return basicSetReturnType(null, msgs);
			case TypescriptPackage.CALLABLE__BODY:
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
			case TypescriptPackage.CALLABLE__TYPE_PARAMETERS:
				return getTypeParameters();
			case TypescriptPackage.CALLABLE__PARAMETERS:
				return getParameters();
			case TypescriptPackage.CALLABLE__RETURN_TYPE:
				return getReturnType();
			case TypescriptPackage.CALLABLE__BODY:
				return getBody();
			case TypescriptPackage.CALLABLE__ASYNC:
				return isAsync();
			case TypescriptPackage.CALLABLE__GENERATOR:
				return isGenerator();
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
			case TypescriptPackage.CALLABLE__TYPE_PARAMETERS:
				getTypeParameters().clear();
				getTypeParameters().addAll((Collection<? extends TypeParameter>)newValue);
				return;
			case TypescriptPackage.CALLABLE__PARAMETERS:
				getParameters().clear();
				getParameters().addAll((Collection<? extends Parameter>)newValue);
				return;
			case TypescriptPackage.CALLABLE__RETURN_TYPE:
				setReturnType((TypeReference)newValue);
				return;
			case TypescriptPackage.CALLABLE__BODY:
				setBody((CodeBlock)newValue);
				return;
			case TypescriptPackage.CALLABLE__ASYNC:
				setAsync((Boolean)newValue);
				return;
			case TypescriptPackage.CALLABLE__GENERATOR:
				setGenerator((Boolean)newValue);
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
			case TypescriptPackage.CALLABLE__TYPE_PARAMETERS:
				getTypeParameters().clear();
				return;
			case TypescriptPackage.CALLABLE__PARAMETERS:
				getParameters().clear();
				return;
			case TypescriptPackage.CALLABLE__RETURN_TYPE:
				setReturnType((TypeReference)null);
				return;
			case TypescriptPackage.CALLABLE__BODY:
				setBody((CodeBlock)null);
				return;
			case TypescriptPackage.CALLABLE__ASYNC:
				setAsync(ASYNC_EDEFAULT);
				return;
			case TypescriptPackage.CALLABLE__GENERATOR:
				setGenerator(GENERATOR_EDEFAULT);
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
			case TypescriptPackage.CALLABLE__TYPE_PARAMETERS:
				return !getTypeParameters().isEmpty();
			case TypescriptPackage.CALLABLE__PARAMETERS:
				return !getParameters().isEmpty();
			case TypescriptPackage.CALLABLE__RETURN_TYPE:
				return getReturnType() != null;
			case TypescriptPackage.CALLABLE__BODY:
				return getBody() != null;
			case TypescriptPackage.CALLABLE__ASYNC:
				return isAsync() != ASYNC_EDEFAULT;
			case TypescriptPackage.CALLABLE__GENERATOR:
				return isGenerator() != GENERATOR_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

} //CallableImpl
