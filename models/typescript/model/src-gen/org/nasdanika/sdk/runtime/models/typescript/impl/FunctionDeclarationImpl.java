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
import org.nasdanika.sdk.runtime.models.typescript.FunctionDeclaration;
import org.nasdanika.sdk.runtime.models.typescript.Parameter;
import org.nasdanika.sdk.runtime.models.typescript.TypeParameter;
import org.nasdanika.sdk.runtime.models.typescript.TypeReference;
import org.nasdanika.sdk.runtime.models.typescript.TypescriptPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Function Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.typescript.impl.FunctionDeclarationImpl#getTypeParameters <em>Type Parameters</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.typescript.impl.FunctionDeclarationImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.typescript.impl.FunctionDeclarationImpl#getReturnType <em>Return Type</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.typescript.impl.FunctionDeclarationImpl#getBody <em>Body</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.typescript.impl.FunctionDeclarationImpl#isAsync <em>Async</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.typescript.impl.FunctionDeclarationImpl#isGenerator <em>Generator</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FunctionDeclarationImpl extends DeclarationImpl implements FunctionDeclaration {
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
	protected FunctionDeclarationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypescriptPackage.Literals.FUNCTION_DECLARATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<TypeParameter> getTypeParameters() {
		return (EList<TypeParameter>)eDynamicGet(TypescriptPackage.FUNCTION_DECLARATION__TYPE_PARAMETERS, TypescriptPackage.Literals.CALLABLE__TYPE_PARAMETERS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Parameter> getParameters() {
		return (EList<Parameter>)eDynamicGet(TypescriptPackage.FUNCTION_DECLARATION__PARAMETERS, TypescriptPackage.Literals.CALLABLE__PARAMETERS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeReference getReturnType() {
		return (TypeReference)eDynamicGet(TypescriptPackage.FUNCTION_DECLARATION__RETURN_TYPE, TypescriptPackage.Literals.CALLABLE__RETURN_TYPE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReturnType(TypeReference newReturnType, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newReturnType, TypescriptPackage.FUNCTION_DECLARATION__RETURN_TYPE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReturnType(TypeReference newReturnType) {
		eDynamicSet(TypescriptPackage.FUNCTION_DECLARATION__RETURN_TYPE, TypescriptPackage.Literals.CALLABLE__RETURN_TYPE, newReturnType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeBlock getBody() {
		return (CodeBlock)eDynamicGet(TypescriptPackage.FUNCTION_DECLARATION__BODY, TypescriptPackage.Literals.CALLABLE__BODY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBody(CodeBlock newBody, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newBody, TypescriptPackage.FUNCTION_DECLARATION__BODY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBody(CodeBlock newBody) {
		eDynamicSet(TypescriptPackage.FUNCTION_DECLARATION__BODY, TypescriptPackage.Literals.CALLABLE__BODY, newBody);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAsync() {
		return (Boolean)eDynamicGet(TypescriptPackage.FUNCTION_DECLARATION__ASYNC, TypescriptPackage.Literals.CALLABLE__ASYNC, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAsync(boolean newAsync) {
		eDynamicSet(TypescriptPackage.FUNCTION_DECLARATION__ASYNC, TypescriptPackage.Literals.CALLABLE__ASYNC, newAsync);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isGenerator() {
		return (Boolean)eDynamicGet(TypescriptPackage.FUNCTION_DECLARATION__GENERATOR, TypescriptPackage.Literals.CALLABLE__GENERATOR, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGenerator(boolean newGenerator) {
		eDynamicSet(TypescriptPackage.FUNCTION_DECLARATION__GENERATOR, TypescriptPackage.Literals.CALLABLE__GENERATOR, newGenerator);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypescriptPackage.FUNCTION_DECLARATION__TYPE_PARAMETERS:
				return ((InternalEList<?>)getTypeParameters()).basicRemove(otherEnd, msgs);
			case TypescriptPackage.FUNCTION_DECLARATION__PARAMETERS:
				return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
			case TypescriptPackage.FUNCTION_DECLARATION__RETURN_TYPE:
				return basicSetReturnType(null, msgs);
			case TypescriptPackage.FUNCTION_DECLARATION__BODY:
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
			case TypescriptPackage.FUNCTION_DECLARATION__TYPE_PARAMETERS:
				return getTypeParameters();
			case TypescriptPackage.FUNCTION_DECLARATION__PARAMETERS:
				return getParameters();
			case TypescriptPackage.FUNCTION_DECLARATION__RETURN_TYPE:
				return getReturnType();
			case TypescriptPackage.FUNCTION_DECLARATION__BODY:
				return getBody();
			case TypescriptPackage.FUNCTION_DECLARATION__ASYNC:
				return isAsync();
			case TypescriptPackage.FUNCTION_DECLARATION__GENERATOR:
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
			case TypescriptPackage.FUNCTION_DECLARATION__TYPE_PARAMETERS:
				getTypeParameters().clear();
				getTypeParameters().addAll((Collection<? extends TypeParameter>)newValue);
				return;
			case TypescriptPackage.FUNCTION_DECLARATION__PARAMETERS:
				getParameters().clear();
				getParameters().addAll((Collection<? extends Parameter>)newValue);
				return;
			case TypescriptPackage.FUNCTION_DECLARATION__RETURN_TYPE:
				setReturnType((TypeReference)newValue);
				return;
			case TypescriptPackage.FUNCTION_DECLARATION__BODY:
				setBody((CodeBlock)newValue);
				return;
			case TypescriptPackage.FUNCTION_DECLARATION__ASYNC:
				setAsync((Boolean)newValue);
				return;
			case TypescriptPackage.FUNCTION_DECLARATION__GENERATOR:
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
			case TypescriptPackage.FUNCTION_DECLARATION__TYPE_PARAMETERS:
				getTypeParameters().clear();
				return;
			case TypescriptPackage.FUNCTION_DECLARATION__PARAMETERS:
				getParameters().clear();
				return;
			case TypescriptPackage.FUNCTION_DECLARATION__RETURN_TYPE:
				setReturnType((TypeReference)null);
				return;
			case TypescriptPackage.FUNCTION_DECLARATION__BODY:
				setBody((CodeBlock)null);
				return;
			case TypescriptPackage.FUNCTION_DECLARATION__ASYNC:
				setAsync(ASYNC_EDEFAULT);
				return;
			case TypescriptPackage.FUNCTION_DECLARATION__GENERATOR:
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
			case TypescriptPackage.FUNCTION_DECLARATION__TYPE_PARAMETERS:
				return !getTypeParameters().isEmpty();
			case TypescriptPackage.FUNCTION_DECLARATION__PARAMETERS:
				return !getParameters().isEmpty();
			case TypescriptPackage.FUNCTION_DECLARATION__RETURN_TYPE:
				return getReturnType() != null;
			case TypescriptPackage.FUNCTION_DECLARATION__BODY:
				return getBody() != null;
			case TypescriptPackage.FUNCTION_DECLARATION__ASYNC:
				return isAsync() != ASYNC_EDEFAULT;
			case TypescriptPackage.FUNCTION_DECLARATION__GENERATOR:
				return isGenerator() != GENERATOR_EDEFAULT;
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
				case TypescriptPackage.FUNCTION_DECLARATION__TYPE_PARAMETERS: return TypescriptPackage.CALLABLE__TYPE_PARAMETERS;
				case TypescriptPackage.FUNCTION_DECLARATION__PARAMETERS: return TypescriptPackage.CALLABLE__PARAMETERS;
				case TypescriptPackage.FUNCTION_DECLARATION__RETURN_TYPE: return TypescriptPackage.CALLABLE__RETURN_TYPE;
				case TypescriptPackage.FUNCTION_DECLARATION__BODY: return TypescriptPackage.CALLABLE__BODY;
				case TypescriptPackage.FUNCTION_DECLARATION__ASYNC: return TypescriptPackage.CALLABLE__ASYNC;
				case TypescriptPackage.FUNCTION_DECLARATION__GENERATOR: return TypescriptPackage.CALLABLE__GENERATOR;
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
				case TypescriptPackage.CALLABLE__TYPE_PARAMETERS: return TypescriptPackage.FUNCTION_DECLARATION__TYPE_PARAMETERS;
				case TypescriptPackage.CALLABLE__PARAMETERS: return TypescriptPackage.FUNCTION_DECLARATION__PARAMETERS;
				case TypescriptPackage.CALLABLE__RETURN_TYPE: return TypescriptPackage.FUNCTION_DECLARATION__RETURN_TYPE;
				case TypescriptPackage.CALLABLE__BODY: return TypescriptPackage.FUNCTION_DECLARATION__BODY;
				case TypescriptPackage.CALLABLE__ASYNC: return TypescriptPackage.FUNCTION_DECLARATION__ASYNC;
				case TypescriptPackage.CALLABLE__GENERATOR: return TypescriptPackage.FUNCTION_DECLARATION__GENERATOR;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //FunctionDeclarationImpl
