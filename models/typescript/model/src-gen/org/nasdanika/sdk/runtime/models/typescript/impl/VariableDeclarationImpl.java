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
import org.nasdanika.sdk.runtime.models.typescript.VariableDeclaration;
import org.nasdanika.sdk.runtime.models.typescript.VariableKind;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Variable Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.typescript.impl.VariableDeclarationImpl#getTypeParameters <em>Type Parameters</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.typescript.impl.VariableDeclarationImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.typescript.impl.VariableDeclarationImpl#getReturnType <em>Return Type</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.typescript.impl.VariableDeclarationImpl#getBody <em>Body</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.typescript.impl.VariableDeclarationImpl#isAsync <em>Async</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.typescript.impl.VariableDeclarationImpl#isGenerator <em>Generator</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.typescript.impl.VariableDeclarationImpl#getVariableKind <em>Variable Kind</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.typescript.impl.VariableDeclarationImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.typescript.impl.VariableDeclarationImpl#getInitializer <em>Initializer</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VariableDeclarationImpl extends DeclarationImpl implements VariableDeclaration {
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
	 * The default value of the '{@link #getVariableKind() <em>Variable Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariableKind()
	 * @generated
	 * @ordered
	 */
	protected static final VariableKind VARIABLE_KIND_EDEFAULT = VariableKind.CONST;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VariableDeclarationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypescriptPackage.Literals.VARIABLE_DECLARATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<TypeParameter> getTypeParameters() {
		return (EList<TypeParameter>)eDynamicGet(TypescriptPackage.VARIABLE_DECLARATION__TYPE_PARAMETERS, TypescriptPackage.Literals.CALLABLE__TYPE_PARAMETERS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Parameter> getParameters() {
		return (EList<Parameter>)eDynamicGet(TypescriptPackage.VARIABLE_DECLARATION__PARAMETERS, TypescriptPackage.Literals.CALLABLE__PARAMETERS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeReference getReturnType() {
		return (TypeReference)eDynamicGet(TypescriptPackage.VARIABLE_DECLARATION__RETURN_TYPE, TypescriptPackage.Literals.CALLABLE__RETURN_TYPE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReturnType(TypeReference newReturnType, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newReturnType, TypescriptPackage.VARIABLE_DECLARATION__RETURN_TYPE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReturnType(TypeReference newReturnType) {
		eDynamicSet(TypescriptPackage.VARIABLE_DECLARATION__RETURN_TYPE, TypescriptPackage.Literals.CALLABLE__RETURN_TYPE, newReturnType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeBlock getBody() {
		return (CodeBlock)eDynamicGet(TypescriptPackage.VARIABLE_DECLARATION__BODY, TypescriptPackage.Literals.CALLABLE__BODY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBody(CodeBlock newBody, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newBody, TypescriptPackage.VARIABLE_DECLARATION__BODY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBody(CodeBlock newBody) {
		eDynamicSet(TypescriptPackage.VARIABLE_DECLARATION__BODY, TypescriptPackage.Literals.CALLABLE__BODY, newBody);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAsync() {
		return (Boolean)eDynamicGet(TypescriptPackage.VARIABLE_DECLARATION__ASYNC, TypescriptPackage.Literals.CALLABLE__ASYNC, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAsync(boolean newAsync) {
		eDynamicSet(TypescriptPackage.VARIABLE_DECLARATION__ASYNC, TypescriptPackage.Literals.CALLABLE__ASYNC, newAsync);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isGenerator() {
		return (Boolean)eDynamicGet(TypescriptPackage.VARIABLE_DECLARATION__GENERATOR, TypescriptPackage.Literals.CALLABLE__GENERATOR, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGenerator(boolean newGenerator) {
		eDynamicSet(TypescriptPackage.VARIABLE_DECLARATION__GENERATOR, TypescriptPackage.Literals.CALLABLE__GENERATOR, newGenerator);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableKind getVariableKind() {
		return (VariableKind)eDynamicGet(TypescriptPackage.VARIABLE_DECLARATION__VARIABLE_KIND, TypescriptPackage.Literals.VARIABLE_DECLARATION__VARIABLE_KIND, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVariableKind(VariableKind newVariableKind) {
		eDynamicSet(TypescriptPackage.VARIABLE_DECLARATION__VARIABLE_KIND, TypescriptPackage.Literals.VARIABLE_DECLARATION__VARIABLE_KIND, newVariableKind);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeReference getType() {
		return (TypeReference)eDynamicGet(TypescriptPackage.VARIABLE_DECLARATION__TYPE, TypescriptPackage.Literals.VARIABLE_DECLARATION__TYPE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetType(TypeReference newType, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newType, TypescriptPackage.VARIABLE_DECLARATION__TYPE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(TypeReference newType) {
		eDynamicSet(TypescriptPackage.VARIABLE_DECLARATION__TYPE, TypescriptPackage.Literals.VARIABLE_DECLARATION__TYPE, newType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeBlock getInitializer() {
		return (CodeBlock)eDynamicGet(TypescriptPackage.VARIABLE_DECLARATION__INITIALIZER, TypescriptPackage.Literals.VARIABLE_DECLARATION__INITIALIZER, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInitializer(CodeBlock newInitializer, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newInitializer, TypescriptPackage.VARIABLE_DECLARATION__INITIALIZER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitializer(CodeBlock newInitializer) {
		eDynamicSet(TypescriptPackage.VARIABLE_DECLARATION__INITIALIZER, TypescriptPackage.Literals.VARIABLE_DECLARATION__INITIALIZER, newInitializer);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypescriptPackage.VARIABLE_DECLARATION__TYPE_PARAMETERS:
				return ((InternalEList<?>)getTypeParameters()).basicRemove(otherEnd, msgs);
			case TypescriptPackage.VARIABLE_DECLARATION__PARAMETERS:
				return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
			case TypescriptPackage.VARIABLE_DECLARATION__RETURN_TYPE:
				return basicSetReturnType(null, msgs);
			case TypescriptPackage.VARIABLE_DECLARATION__BODY:
				return basicSetBody(null, msgs);
			case TypescriptPackage.VARIABLE_DECLARATION__TYPE:
				return basicSetType(null, msgs);
			case TypescriptPackage.VARIABLE_DECLARATION__INITIALIZER:
				return basicSetInitializer(null, msgs);
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
			case TypescriptPackage.VARIABLE_DECLARATION__TYPE_PARAMETERS:
				return getTypeParameters();
			case TypescriptPackage.VARIABLE_DECLARATION__PARAMETERS:
				return getParameters();
			case TypescriptPackage.VARIABLE_DECLARATION__RETURN_TYPE:
				return getReturnType();
			case TypescriptPackage.VARIABLE_DECLARATION__BODY:
				return getBody();
			case TypescriptPackage.VARIABLE_DECLARATION__ASYNC:
				return isAsync();
			case TypescriptPackage.VARIABLE_DECLARATION__GENERATOR:
				return isGenerator();
			case TypescriptPackage.VARIABLE_DECLARATION__VARIABLE_KIND:
				return getVariableKind();
			case TypescriptPackage.VARIABLE_DECLARATION__TYPE:
				return getType();
			case TypescriptPackage.VARIABLE_DECLARATION__INITIALIZER:
				return getInitializer();
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
			case TypescriptPackage.VARIABLE_DECLARATION__TYPE_PARAMETERS:
				getTypeParameters().clear();
				getTypeParameters().addAll((Collection<? extends TypeParameter>)newValue);
				return;
			case TypescriptPackage.VARIABLE_DECLARATION__PARAMETERS:
				getParameters().clear();
				getParameters().addAll((Collection<? extends Parameter>)newValue);
				return;
			case TypescriptPackage.VARIABLE_DECLARATION__RETURN_TYPE:
				setReturnType((TypeReference)newValue);
				return;
			case TypescriptPackage.VARIABLE_DECLARATION__BODY:
				setBody((CodeBlock)newValue);
				return;
			case TypescriptPackage.VARIABLE_DECLARATION__ASYNC:
				setAsync((Boolean)newValue);
				return;
			case TypescriptPackage.VARIABLE_DECLARATION__GENERATOR:
				setGenerator((Boolean)newValue);
				return;
			case TypescriptPackage.VARIABLE_DECLARATION__VARIABLE_KIND:
				setVariableKind((VariableKind)newValue);
				return;
			case TypescriptPackage.VARIABLE_DECLARATION__TYPE:
				setType((TypeReference)newValue);
				return;
			case TypescriptPackage.VARIABLE_DECLARATION__INITIALIZER:
				setInitializer((CodeBlock)newValue);
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
			case TypescriptPackage.VARIABLE_DECLARATION__TYPE_PARAMETERS:
				getTypeParameters().clear();
				return;
			case TypescriptPackage.VARIABLE_DECLARATION__PARAMETERS:
				getParameters().clear();
				return;
			case TypescriptPackage.VARIABLE_DECLARATION__RETURN_TYPE:
				setReturnType((TypeReference)null);
				return;
			case TypescriptPackage.VARIABLE_DECLARATION__BODY:
				setBody((CodeBlock)null);
				return;
			case TypescriptPackage.VARIABLE_DECLARATION__ASYNC:
				setAsync(ASYNC_EDEFAULT);
				return;
			case TypescriptPackage.VARIABLE_DECLARATION__GENERATOR:
				setGenerator(GENERATOR_EDEFAULT);
				return;
			case TypescriptPackage.VARIABLE_DECLARATION__VARIABLE_KIND:
				setVariableKind(VARIABLE_KIND_EDEFAULT);
				return;
			case TypescriptPackage.VARIABLE_DECLARATION__TYPE:
				setType((TypeReference)null);
				return;
			case TypescriptPackage.VARIABLE_DECLARATION__INITIALIZER:
				setInitializer((CodeBlock)null);
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
			case TypescriptPackage.VARIABLE_DECLARATION__TYPE_PARAMETERS:
				return !getTypeParameters().isEmpty();
			case TypescriptPackage.VARIABLE_DECLARATION__PARAMETERS:
				return !getParameters().isEmpty();
			case TypescriptPackage.VARIABLE_DECLARATION__RETURN_TYPE:
				return getReturnType() != null;
			case TypescriptPackage.VARIABLE_DECLARATION__BODY:
				return getBody() != null;
			case TypescriptPackage.VARIABLE_DECLARATION__ASYNC:
				return isAsync() != ASYNC_EDEFAULT;
			case TypescriptPackage.VARIABLE_DECLARATION__GENERATOR:
				return isGenerator() != GENERATOR_EDEFAULT;
			case TypescriptPackage.VARIABLE_DECLARATION__VARIABLE_KIND:
				return getVariableKind() != VARIABLE_KIND_EDEFAULT;
			case TypescriptPackage.VARIABLE_DECLARATION__TYPE:
				return getType() != null;
			case TypescriptPackage.VARIABLE_DECLARATION__INITIALIZER:
				return getInitializer() != null;
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
				case TypescriptPackage.VARIABLE_DECLARATION__TYPE_PARAMETERS: return TypescriptPackage.CALLABLE__TYPE_PARAMETERS;
				case TypescriptPackage.VARIABLE_DECLARATION__PARAMETERS: return TypescriptPackage.CALLABLE__PARAMETERS;
				case TypescriptPackage.VARIABLE_DECLARATION__RETURN_TYPE: return TypescriptPackage.CALLABLE__RETURN_TYPE;
				case TypescriptPackage.VARIABLE_DECLARATION__BODY: return TypescriptPackage.CALLABLE__BODY;
				case TypescriptPackage.VARIABLE_DECLARATION__ASYNC: return TypescriptPackage.CALLABLE__ASYNC;
				case TypescriptPackage.VARIABLE_DECLARATION__GENERATOR: return TypescriptPackage.CALLABLE__GENERATOR;
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
				case TypescriptPackage.CALLABLE__TYPE_PARAMETERS: return TypescriptPackage.VARIABLE_DECLARATION__TYPE_PARAMETERS;
				case TypescriptPackage.CALLABLE__PARAMETERS: return TypescriptPackage.VARIABLE_DECLARATION__PARAMETERS;
				case TypescriptPackage.CALLABLE__RETURN_TYPE: return TypescriptPackage.VARIABLE_DECLARATION__RETURN_TYPE;
				case TypescriptPackage.CALLABLE__BODY: return TypescriptPackage.VARIABLE_DECLARATION__BODY;
				case TypescriptPackage.CALLABLE__ASYNC: return TypescriptPackage.VARIABLE_DECLARATION__ASYNC;
				case TypescriptPackage.CALLABLE__GENERATOR: return TypescriptPackage.VARIABLE_DECLARATION__GENERATOR;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //VariableDeclarationImpl
