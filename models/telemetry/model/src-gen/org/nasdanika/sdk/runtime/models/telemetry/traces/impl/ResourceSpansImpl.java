/**
 */
package org.nasdanika.sdk.runtime.models.telemetry.traces.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.sdk.runtime.models.telemetry.Resource;

import org.nasdanika.sdk.runtime.models.telemetry.traces.ResourceSpans;
import org.nasdanika.sdk.runtime.models.telemetry.traces.ScopeSpans;
import org.nasdanika.sdk.runtime.models.telemetry.traces.TracesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resource Spans</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.telemetry.traces.impl.ResourceSpansImpl#getResource <em>Resource</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.telemetry.traces.impl.ResourceSpansImpl#getScopeSpans <em>Scope Spans</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.telemetry.traces.impl.ResourceSpansImpl#getSchemaUrl <em>Schema Url</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ResourceSpansImpl extends MinimalEObjectImpl.Container implements ResourceSpans {
	/**
	 * The default value of the '{@link #getSchemaUrl() <em>Schema Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchemaUrl()
	 * @generated
	 * @ordered
	 */
	protected static final String SCHEMA_URL_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceSpansImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TracesPackage.Literals.RESOURCE_SPANS;
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
	public Resource getResource() {
		return (Resource)eDynamicGet(TracesPackage.RESOURCE_SPANS__RESOURCE, TracesPackage.Literals.RESOURCE_SPANS__RESOURCE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResource(Resource newResource, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newResource, TracesPackage.RESOURCE_SPANS__RESOURCE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResource(Resource newResource) {
		eDynamicSet(TracesPackage.RESOURCE_SPANS__RESOURCE, TracesPackage.Literals.RESOURCE_SPANS__RESOURCE, newResource);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<ScopeSpans> getScopeSpans() {
		return (EList<ScopeSpans>)eDynamicGet(TracesPackage.RESOURCE_SPANS__SCOPE_SPANS, TracesPackage.Literals.RESOURCE_SPANS__SCOPE_SPANS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSchemaUrl() {
		return (String)eDynamicGet(TracesPackage.RESOURCE_SPANS__SCHEMA_URL, TracesPackage.Literals.RESOURCE_SPANS__SCHEMA_URL, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSchemaUrl(String newSchemaUrl) {
		eDynamicSet(TracesPackage.RESOURCE_SPANS__SCHEMA_URL, TracesPackage.Literals.RESOURCE_SPANS__SCHEMA_URL, newSchemaUrl);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TracesPackage.RESOURCE_SPANS__RESOURCE:
				return basicSetResource(null, msgs);
			case TracesPackage.RESOURCE_SPANS__SCOPE_SPANS:
				return ((InternalEList<?>)getScopeSpans()).basicRemove(otherEnd, msgs);
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
			case TracesPackage.RESOURCE_SPANS__RESOURCE:
				return getResource();
			case TracesPackage.RESOURCE_SPANS__SCOPE_SPANS:
				return getScopeSpans();
			case TracesPackage.RESOURCE_SPANS__SCHEMA_URL:
				return getSchemaUrl();
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
			case TracesPackage.RESOURCE_SPANS__RESOURCE:
				setResource((Resource)newValue);
				return;
			case TracesPackage.RESOURCE_SPANS__SCOPE_SPANS:
				getScopeSpans().clear();
				getScopeSpans().addAll((Collection<? extends ScopeSpans>)newValue);
				return;
			case TracesPackage.RESOURCE_SPANS__SCHEMA_URL:
				setSchemaUrl((String)newValue);
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
			case TracesPackage.RESOURCE_SPANS__RESOURCE:
				setResource((Resource)null);
				return;
			case TracesPackage.RESOURCE_SPANS__SCOPE_SPANS:
				getScopeSpans().clear();
				return;
			case TracesPackage.RESOURCE_SPANS__SCHEMA_URL:
				setSchemaUrl(SCHEMA_URL_EDEFAULT);
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
			case TracesPackage.RESOURCE_SPANS__RESOURCE:
				return getResource() != null;
			case TracesPackage.RESOURCE_SPANS__SCOPE_SPANS:
				return !getScopeSpans().isEmpty();
			case TracesPackage.RESOURCE_SPANS__SCHEMA_URL:
				return SCHEMA_URL_EDEFAULT == null ? getSchemaUrl() != null : !SCHEMA_URL_EDEFAULT.equals(getSchemaUrl());
		}
		return super.eIsSet(featureID);
	}

} //ResourceSpansImpl
