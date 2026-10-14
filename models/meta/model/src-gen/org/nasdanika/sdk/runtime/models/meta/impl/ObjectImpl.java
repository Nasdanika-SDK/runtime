/**
 */
package org.nasdanika.sdk.runtime.models.meta.impl;

import java.lang.Object;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.sdk.runtime.models.meta.Annotation;
import org.nasdanika.sdk.runtime.models.meta.Feature;
import org.nasdanika.sdk.runtime.models.meta.IncomingReference;
import org.nasdanika.sdk.runtime.models.meta.MetaPackage;
import org.nasdanika.sdk.runtime.models.meta.Operation;
import org.nasdanika.sdk.runtime.models.meta.Reference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Object</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.meta.impl.ObjectImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.meta.impl.ObjectImpl#getAnnotations <em>Annotations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ObjectImpl extends MinimalEObjectImpl.Container implements org.nasdanika.sdk.runtime.models.meta.Object {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ObjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetaPackage.Literals.OBJECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.nasdanika.sdk.runtime.models.meta.Class getType() {
		return (org.nasdanika.sdk.runtime.models.meta.Class)eDynamicGet(MetaPackage.OBJECT__TYPE, MetaPackage.Literals.OBJECT__TYPE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.nasdanika.sdk.runtime.models.meta.Class basicGetType() {
		return (org.nasdanika.sdk.runtime.models.meta.Class)eDynamicGet(MetaPackage.OBJECT__TYPE, MetaPackage.Literals.OBJECT__TYPE, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(org.nasdanika.sdk.runtime.models.meta.Class newType) {
		eDynamicSet(MetaPackage.OBJECT__TYPE, MetaPackage.Literals.OBJECT__TYPE, newType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Annotation> getAnnotations() {
		return (EList<Annotation>)eDynamicGet(MetaPackage.OBJECT__ANNOTATIONS, MetaPackage.Literals.OBJECT__ANNOTATIONS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Object> getIdentities() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.nasdanika.sdk.runtime.models.meta.Object getContainer() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Feature getContainmentFeature() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object get(Feature feature) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object get(Feature feature, int from, int count) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void set(Feature feature, Object value) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void set(Feature feature, Object value, int index) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void add(Feature feature, Object value, int index) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void remove(Feature feature, org.nasdanika.sdk.runtime.models.meta.Object value) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void remove(Feature feature, org.nasdanika.sdk.runtime.models.meta.Object value, int index) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unset(Feature feature) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int size(Feature feature) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.nasdanika.sdk.runtime.models.meta.Object invoke(Operation operation, EList<Object> arguments) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IncomingReference> getIncomingReferences(EList<Reference> references) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IncomingReference> getIncomingReferences(EList<Reference> references, int from, int count) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getIncomingReferenceCount(EList<Reference> references) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isResolved() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MetaPackage.OBJECT__ANNOTATIONS:
				return ((InternalEList<?>)getAnnotations()).basicRemove(otherEnd, msgs);
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
			case MetaPackage.OBJECT__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case MetaPackage.OBJECT__ANNOTATIONS:
				return getAnnotations();
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
			case MetaPackage.OBJECT__TYPE:
				setType((org.nasdanika.sdk.runtime.models.meta.Class)newValue);
				return;
			case MetaPackage.OBJECT__ANNOTATIONS:
				getAnnotations().clear();
				getAnnotations().addAll((Collection<? extends Annotation>)newValue);
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
			case MetaPackage.OBJECT__TYPE:
				setType((org.nasdanika.sdk.runtime.models.meta.Class)null);
				return;
			case MetaPackage.OBJECT__ANNOTATIONS:
				getAnnotations().clear();
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
			case MetaPackage.OBJECT__TYPE:
				return basicGetType() != null;
			case MetaPackage.OBJECT__ANNOTATIONS:
				return !getAnnotations().isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case MetaPackage.OBJECT___GET_IDENTITIES:
				return getIdentities();
			case MetaPackage.OBJECT___GET_CONTAINER:
				return getContainer();
			case MetaPackage.OBJECT___GET_CONTAINMENT_FEATURE:
				return getContainmentFeature();
			case MetaPackage.OBJECT___GET__FEATURE:
				return get((Feature)arguments.get(0));
			case MetaPackage.OBJECT___GET__FEATURE_INT_INT:
				return get((Feature)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
			case MetaPackage.OBJECT___SET__FEATURE_OBJECT:
				set((Feature)arguments.get(0), arguments.get(1));
				return null;
			case MetaPackage.OBJECT___SET__FEATURE_OBJECT_INT:
				set((Feature)arguments.get(0), arguments.get(1), (Integer)arguments.get(2));
				return null;
			case MetaPackage.OBJECT___ADD__FEATURE_OBJECT_INT:
				add((Feature)arguments.get(0), arguments.get(1), (Integer)arguments.get(2));
				return null;
			case MetaPackage.OBJECT___REMOVE__FEATURE_OBJECT:
				remove((Feature)arguments.get(0), (org.nasdanika.sdk.runtime.models.meta.Object)arguments.get(1));
				return null;
			case MetaPackage.OBJECT___REMOVE__FEATURE_OBJECT_INT:
				remove((Feature)arguments.get(0), (org.nasdanika.sdk.runtime.models.meta.Object)arguments.get(1), (Integer)arguments.get(2));
				return null;
			case MetaPackage.OBJECT___UNSET__FEATURE:
				unset((Feature)arguments.get(0));
				return null;
			case MetaPackage.OBJECT___SIZE__FEATURE:
				return size((Feature)arguments.get(0));
			case MetaPackage.OBJECT___INVOKE__OPERATION_ELIST:
				return invoke((Operation)arguments.get(0), (EList<Object>)arguments.get(1));
			case MetaPackage.OBJECT___GET_INCOMING_REFERENCES__ELIST:
				return getIncomingReferences((EList<Reference>)arguments.get(0));
			case MetaPackage.OBJECT___GET_INCOMING_REFERENCES__ELIST_INT_INT:
				return getIncomingReferences((EList<Reference>)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
			case MetaPackage.OBJECT___GET_INCOMING_REFERENCE_COUNT__ELIST:
				return getIncomingReferenceCount((EList<Reference>)arguments.get(0));
			case MetaPackage.OBJECT___IS_RESOLVED:
				return isResolved();
		}
		return super.eInvoke(operationID, arguments);
	}

} //ObjectImpl
