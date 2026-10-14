/**
 */
package org.nasdanika.sdk.runtime.models.meta.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.sdk.runtime.models.meta.Classifier;
import org.nasdanika.sdk.runtime.models.meta.ClassifierReference;
import org.nasdanika.sdk.runtime.models.meta.MetaPackage;
import org.nasdanika.sdk.runtime.models.meta.TypeReference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Classifier Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.meta.impl.ClassifierReferenceImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.meta.impl.ClassifierReferenceImpl#getNamespace <em>Namespace</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.meta.impl.ClassifierReferenceImpl#getClassifierName <em>Classifier Name</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.meta.impl.ClassifierReferenceImpl#getTypeArguments <em>Type Arguments</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClassifierReferenceImpl extends TypeReferenceImpl implements ClassifierReference {
	/**
	 * The default value of the '{@link #getNamespace() <em>Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNamespace()
	 * @generated
	 * @ordered
	 */
	protected static final String NAMESPACE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getClassifierName() <em>Classifier Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassifierName()
	 * @generated
	 * @ordered
	 */
	protected static final String CLASSIFIER_NAME_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassifierReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetaPackage.Literals.CLASSIFIER_REFERENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Classifier getTarget() {
		return (Classifier)eDynamicGet(MetaPackage.CLASSIFIER_REFERENCE__TARGET, MetaPackage.Literals.CLASSIFIER_REFERENCE__TARGET, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Classifier basicGetTarget() {
		return (Classifier)eDynamicGet(MetaPackage.CLASSIFIER_REFERENCE__TARGET, MetaPackage.Literals.CLASSIFIER_REFERENCE__TARGET, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(Classifier newTarget) {
		eDynamicSet(MetaPackage.CLASSIFIER_REFERENCE__TARGET, MetaPackage.Literals.CLASSIFIER_REFERENCE__TARGET, newTarget);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNamespace() {
		return (String)eDynamicGet(MetaPackage.CLASSIFIER_REFERENCE__NAMESPACE, MetaPackage.Literals.CLASSIFIER_REFERENCE__NAMESPACE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNamespace(String newNamespace) {
		eDynamicSet(MetaPackage.CLASSIFIER_REFERENCE__NAMESPACE, MetaPackage.Literals.CLASSIFIER_REFERENCE__NAMESPACE, newNamespace);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getClassifierName() {
		return (String)eDynamicGet(MetaPackage.CLASSIFIER_REFERENCE__CLASSIFIER_NAME, MetaPackage.Literals.CLASSIFIER_REFERENCE__CLASSIFIER_NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClassifierName(String newClassifierName) {
		eDynamicSet(MetaPackage.CLASSIFIER_REFERENCE__CLASSIFIER_NAME, MetaPackage.Literals.CLASSIFIER_REFERENCE__CLASSIFIER_NAME, newClassifierName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<TypeReference> getTypeArguments() {
		return (EList<TypeReference>)eDynamicGet(MetaPackage.CLASSIFIER_REFERENCE__TYPE_ARGUMENTS, MetaPackage.Literals.CLASSIFIER_REFERENCE__TYPE_ARGUMENTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MetaPackage.CLASSIFIER_REFERENCE__TYPE_ARGUMENTS:
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
			case MetaPackage.CLASSIFIER_REFERENCE__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
			case MetaPackage.CLASSIFIER_REFERENCE__NAMESPACE:
				return getNamespace();
			case MetaPackage.CLASSIFIER_REFERENCE__CLASSIFIER_NAME:
				return getClassifierName();
			case MetaPackage.CLASSIFIER_REFERENCE__TYPE_ARGUMENTS:
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
			case MetaPackage.CLASSIFIER_REFERENCE__TARGET:
				setTarget((Classifier)newValue);
				return;
			case MetaPackage.CLASSIFIER_REFERENCE__NAMESPACE:
				setNamespace((String)newValue);
				return;
			case MetaPackage.CLASSIFIER_REFERENCE__CLASSIFIER_NAME:
				setClassifierName((String)newValue);
				return;
			case MetaPackage.CLASSIFIER_REFERENCE__TYPE_ARGUMENTS:
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
			case MetaPackage.CLASSIFIER_REFERENCE__TARGET:
				setTarget((Classifier)null);
				return;
			case MetaPackage.CLASSIFIER_REFERENCE__NAMESPACE:
				setNamespace(NAMESPACE_EDEFAULT);
				return;
			case MetaPackage.CLASSIFIER_REFERENCE__CLASSIFIER_NAME:
				setClassifierName(CLASSIFIER_NAME_EDEFAULT);
				return;
			case MetaPackage.CLASSIFIER_REFERENCE__TYPE_ARGUMENTS:
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
			case MetaPackage.CLASSIFIER_REFERENCE__TARGET:
				return basicGetTarget() != null;
			case MetaPackage.CLASSIFIER_REFERENCE__NAMESPACE:
				return NAMESPACE_EDEFAULT == null ? getNamespace() != null : !NAMESPACE_EDEFAULT.equals(getNamespace());
			case MetaPackage.CLASSIFIER_REFERENCE__CLASSIFIER_NAME:
				return CLASSIFIER_NAME_EDEFAULT == null ? getClassifierName() != null : !CLASSIFIER_NAME_EDEFAULT.equals(getClassifierName());
			case MetaPackage.CLASSIFIER_REFERENCE__TYPE_ARGUMENTS:
				return !getTypeArguments().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ClassifierReferenceImpl
