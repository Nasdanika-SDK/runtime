/**
 */
package org.nasdanika.sdk.runtime.models.typescript.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.sdk.runtime.models.typescript.Accessor;
import org.nasdanika.sdk.runtime.models.typescript.AccessorKind;
import org.nasdanika.sdk.runtime.models.typescript.Callable;
import org.nasdanika.sdk.runtime.models.typescript.CodeBlock;
import org.nasdanika.sdk.runtime.models.typescript.Parameter;
import org.nasdanika.sdk.runtime.models.typescript.TypeParameter;
import org.nasdanika.sdk.runtime.models.typescript.TypeReference;
import org.nasdanika.sdk.runtime.models.typescript.TypescriptPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Accessor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.typescript.impl.AccessorImpl#getTypeParameters <em>Type Parameters</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.typescript.impl.AccessorImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.typescript.impl.AccessorImpl#getReturnType <em>Return Type</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.typescript.impl.AccessorImpl#getBody <em>Body</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.typescript.impl.AccessorImpl#isAsync <em>Async</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.typescript.impl.AccessorImpl#isGenerator <em>Generator</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.typescript.impl.AccessorImpl#getAccessorKind <em>Accessor Kind</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AccessorImpl extends MemberImpl implements Accessor {
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
	 * The default value of the '{@link #getAccessorKind() <em>Accessor Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessorKind()
	 * @generated
	 * @ordered
	 */
	protected static final AccessorKind ACCESSOR_KIND_EDEFAULT = AccessorKind.GET;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AccessorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypescriptPackage.Literals.ACCESSOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<TypeParameter> getTypeParameters() {
		return (EList<TypeParameter>)eDynamicGet(TypescriptPackage.ACCESSOR__TYPE_PARAMETERS, TypescriptPackage.Literals.CALLABLE__TYPE_PARAMETERS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Parameter> getParameters() {
		return (EList<Parameter>)eDynamicGet(TypescriptPackage.ACCESSOR__PARAMETERS, TypescriptPackage.Literals.CALLABLE__PARAMETERS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeReference getReturnType() {
		return (TypeReference)eDynamicGet(TypescriptPackage.ACCESSOR__RETURN_TYPE, TypescriptPackage.Literals.CALLABLE__RETURN_TYPE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReturnType(TypeReference newReturnType, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newReturnType, TypescriptPackage.ACCESSOR__RETURN_TYPE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReturnType(TypeReference newReturnType) {
		eDynamicSet(TypescriptPackage.ACCESSOR__RETURN_TYPE, TypescriptPackage.Literals.CALLABLE__RETURN_TYPE, newReturnType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeBlock getBody() {
		return (CodeBlock)eDynamicGet(TypescriptPackage.ACCESSOR__BODY, TypescriptPackage.Literals.CALLABLE__BODY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBody(CodeBlock newBody, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newBody, TypescriptPackage.ACCESSOR__BODY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBody(CodeBlock newBody) {
		eDynamicSet(TypescriptPackage.ACCESSOR__BODY, TypescriptPackage.Literals.CALLABLE__BODY, newBody);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAsync() {
		return (Boolean)eDynamicGet(TypescriptPackage.ACCESSOR__ASYNC, TypescriptPackage.Literals.CALLABLE__ASYNC, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAsync(boolean newAsync) {
		eDynamicSet(TypescriptPackage.ACCESSOR__ASYNC, TypescriptPackage.Literals.CALLABLE__ASYNC, newAsync);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isGenerator() {
		return (Boolean)eDynamicGet(TypescriptPackage.ACCESSOR__GENERATOR, TypescriptPackage.Literals.CALLABLE__GENERATOR, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGenerator(boolean newGenerator) {
		eDynamicSet(TypescriptPackage.ACCESSOR__GENERATOR, TypescriptPackage.Literals.CALLABLE__GENERATOR, newGenerator);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccessorKind getAccessorKind() {
		return (AccessorKind)eDynamicGet(TypescriptPackage.ACCESSOR__ACCESSOR_KIND, TypescriptPackage.Literals.ACCESSOR__ACCESSOR_KIND, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccessorKind(AccessorKind newAccessorKind) {
		eDynamicSet(TypescriptPackage.ACCESSOR__ACCESSOR_KIND, TypescriptPackage.Literals.ACCESSOR__ACCESSOR_KIND, newAccessorKind);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypescriptPackage.ACCESSOR__TYPE_PARAMETERS:
				return ((InternalEList<?>)getTypeParameters()).basicRemove(otherEnd, msgs);
			case TypescriptPackage.ACCESSOR__PARAMETERS:
				return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
			case TypescriptPackage.ACCESSOR__RETURN_TYPE:
				return basicSetReturnType(null, msgs);
			case TypescriptPackage.ACCESSOR__BODY:
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
			case TypescriptPackage.ACCESSOR__TYPE_PARAMETERS:
				return getTypeParameters();
			case TypescriptPackage.ACCESSOR__PARAMETERS:
				return getParameters();
			case TypescriptPackage.ACCESSOR__RETURN_TYPE:
				return getReturnType();
			case TypescriptPackage.ACCESSOR__BODY:
				return getBody();
			case TypescriptPackage.ACCESSOR__ASYNC:
				return isAsync();
			case TypescriptPackage.ACCESSOR__GENERATOR:
				return isGenerator();
			case TypescriptPackage.ACCESSOR__ACCESSOR_KIND:
				return getAccessorKind();
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
			case TypescriptPackage.ACCESSOR__TYPE_PARAMETERS:
				getTypeParameters().clear();
				getTypeParameters().addAll((Collection<? extends TypeParameter>)newValue);
				return;
			case TypescriptPackage.ACCESSOR__PARAMETERS:
				getParameters().clear();
				getParameters().addAll((Collection<? extends Parameter>)newValue);
				return;
			case TypescriptPackage.ACCESSOR__RETURN_TYPE:
				setReturnType((TypeReference)newValue);
				return;
			case TypescriptPackage.ACCESSOR__BODY:
				setBody((CodeBlock)newValue);
				return;
			case TypescriptPackage.ACCESSOR__ASYNC:
				setAsync((Boolean)newValue);
				return;
			case TypescriptPackage.ACCESSOR__GENERATOR:
				setGenerator((Boolean)newValue);
				return;
			case TypescriptPackage.ACCESSOR__ACCESSOR_KIND:
				setAccessorKind((AccessorKind)newValue);
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
			case TypescriptPackage.ACCESSOR__TYPE_PARAMETERS:
				getTypeParameters().clear();
				return;
			case TypescriptPackage.ACCESSOR__PARAMETERS:
				getParameters().clear();
				return;
			case TypescriptPackage.ACCESSOR__RETURN_TYPE:
				setReturnType((TypeReference)null);
				return;
			case TypescriptPackage.ACCESSOR__BODY:
				setBody((CodeBlock)null);
				return;
			case TypescriptPackage.ACCESSOR__ASYNC:
				setAsync(ASYNC_EDEFAULT);
				return;
			case TypescriptPackage.ACCESSOR__GENERATOR:
				setGenerator(GENERATOR_EDEFAULT);
				return;
			case TypescriptPackage.ACCESSOR__ACCESSOR_KIND:
				setAccessorKind(ACCESSOR_KIND_EDEFAULT);
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
			case TypescriptPackage.ACCESSOR__TYPE_PARAMETERS:
				return !getTypeParameters().isEmpty();
			case TypescriptPackage.ACCESSOR__PARAMETERS:
				return !getParameters().isEmpty();
			case TypescriptPackage.ACCESSOR__RETURN_TYPE:
				return getReturnType() != null;
			case TypescriptPackage.ACCESSOR__BODY:
				return getBody() != null;
			case TypescriptPackage.ACCESSOR__ASYNC:
				return isAsync() != ASYNC_EDEFAULT;
			case TypescriptPackage.ACCESSOR__GENERATOR:
				return isGenerator() != GENERATOR_EDEFAULT;
			case TypescriptPackage.ACCESSOR__ACCESSOR_KIND:
				return getAccessorKind() != ACCESSOR_KIND_EDEFAULT;
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
				case TypescriptPackage.ACCESSOR__TYPE_PARAMETERS: return TypescriptPackage.CALLABLE__TYPE_PARAMETERS;
				case TypescriptPackage.ACCESSOR__PARAMETERS: return TypescriptPackage.CALLABLE__PARAMETERS;
				case TypescriptPackage.ACCESSOR__RETURN_TYPE: return TypescriptPackage.CALLABLE__RETURN_TYPE;
				case TypescriptPackage.ACCESSOR__BODY: return TypescriptPackage.CALLABLE__BODY;
				case TypescriptPackage.ACCESSOR__ASYNC: return TypescriptPackage.CALLABLE__ASYNC;
				case TypescriptPackage.ACCESSOR__GENERATOR: return TypescriptPackage.CALLABLE__GENERATOR;
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
				case TypescriptPackage.CALLABLE__TYPE_PARAMETERS: return TypescriptPackage.ACCESSOR__TYPE_PARAMETERS;
				case TypescriptPackage.CALLABLE__PARAMETERS: return TypescriptPackage.ACCESSOR__PARAMETERS;
				case TypescriptPackage.CALLABLE__RETURN_TYPE: return TypescriptPackage.ACCESSOR__RETURN_TYPE;
				case TypescriptPackage.CALLABLE__BODY: return TypescriptPackage.ACCESSOR__BODY;
				case TypescriptPackage.CALLABLE__ASYNC: return TypescriptPackage.ACCESSOR__ASYNC;
				case TypescriptPackage.CALLABLE__GENERATOR: return TypescriptPackage.ACCESSOR__GENERATOR;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //AccessorImpl
