/**
 */
package org.nasdanika.sdk.runtime.models.typescript.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.sdk.runtime.models.typescript.CodeBlock;
import org.nasdanika.sdk.runtime.models.typescript.Constructor;
import org.nasdanika.sdk.runtime.models.typescript.Parameter;
import org.nasdanika.sdk.runtime.models.typescript.TypescriptPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Constructor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.typescript.impl.ConstructorImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.typescript.impl.ConstructorImpl#getBody <em>Body</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConstructorImpl extends MemberImpl implements Constructor {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConstructorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypescriptPackage.Literals.CONSTRUCTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Parameter> getParameters() {
		return (EList<Parameter>)eDynamicGet(TypescriptPackage.CONSTRUCTOR__PARAMETERS, TypescriptPackage.Literals.CONSTRUCTOR__PARAMETERS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeBlock getBody() {
		return (CodeBlock)eDynamicGet(TypescriptPackage.CONSTRUCTOR__BODY, TypescriptPackage.Literals.CONSTRUCTOR__BODY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBody(CodeBlock newBody, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newBody, TypescriptPackage.CONSTRUCTOR__BODY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBody(CodeBlock newBody) {
		eDynamicSet(TypescriptPackage.CONSTRUCTOR__BODY, TypescriptPackage.Literals.CONSTRUCTOR__BODY, newBody);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypescriptPackage.CONSTRUCTOR__PARAMETERS:
				return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
			case TypescriptPackage.CONSTRUCTOR__BODY:
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
			case TypescriptPackage.CONSTRUCTOR__PARAMETERS:
				return getParameters();
			case TypescriptPackage.CONSTRUCTOR__BODY:
				return getBody();
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
			case TypescriptPackage.CONSTRUCTOR__PARAMETERS:
				getParameters().clear();
				getParameters().addAll((Collection<? extends Parameter>)newValue);
				return;
			case TypescriptPackage.CONSTRUCTOR__BODY:
				setBody((CodeBlock)newValue);
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
			case TypescriptPackage.CONSTRUCTOR__PARAMETERS:
				getParameters().clear();
				return;
			case TypescriptPackage.CONSTRUCTOR__BODY:
				setBody((CodeBlock)null);
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
			case TypescriptPackage.CONSTRUCTOR__PARAMETERS:
				return !getParameters().isEmpty();
			case TypescriptPackage.CONSTRUCTOR__BODY:
				return getBody() != null;
		}
		return super.eIsSet(featureID);
	}

} //ConstructorImpl
