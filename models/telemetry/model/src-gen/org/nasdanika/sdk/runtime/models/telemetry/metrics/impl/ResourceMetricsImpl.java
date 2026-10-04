/**
 */
package org.nasdanika.sdk.runtime.models.telemetry.metrics.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.sdk.runtime.models.telemetry.Resource;

import org.nasdanika.sdk.runtime.models.telemetry.metrics.MetricsPackage;
import org.nasdanika.sdk.runtime.models.telemetry.metrics.ResourceMetrics;
import org.nasdanika.sdk.runtime.models.telemetry.metrics.ScopeMetrics;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resource Metrics</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.telemetry.metrics.impl.ResourceMetricsImpl#getResource <em>Resource</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.telemetry.metrics.impl.ResourceMetricsImpl#getScopeMetrics <em>Scope Metrics</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.telemetry.metrics.impl.ResourceMetricsImpl#getSchemaUrl <em>Schema Url</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ResourceMetricsImpl extends MinimalEObjectImpl.Container implements ResourceMetrics {
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
	protected ResourceMetricsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetricsPackage.Literals.RESOURCE_METRICS;
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
		return (Resource)eDynamicGet(MetricsPackage.RESOURCE_METRICS__RESOURCE, MetricsPackage.Literals.RESOURCE_METRICS__RESOURCE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResource(Resource newResource, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newResource, MetricsPackage.RESOURCE_METRICS__RESOURCE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResource(Resource newResource) {
		eDynamicSet(MetricsPackage.RESOURCE_METRICS__RESOURCE, MetricsPackage.Literals.RESOURCE_METRICS__RESOURCE, newResource);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<ScopeMetrics> getScopeMetrics() {
		return (EList<ScopeMetrics>)eDynamicGet(MetricsPackage.RESOURCE_METRICS__SCOPE_METRICS, MetricsPackage.Literals.RESOURCE_METRICS__SCOPE_METRICS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSchemaUrl() {
		return (String)eDynamicGet(MetricsPackage.RESOURCE_METRICS__SCHEMA_URL, MetricsPackage.Literals.RESOURCE_METRICS__SCHEMA_URL, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSchemaUrl(String newSchemaUrl) {
		eDynamicSet(MetricsPackage.RESOURCE_METRICS__SCHEMA_URL, MetricsPackage.Literals.RESOURCE_METRICS__SCHEMA_URL, newSchemaUrl);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MetricsPackage.RESOURCE_METRICS__RESOURCE:
				return basicSetResource(null, msgs);
			case MetricsPackage.RESOURCE_METRICS__SCOPE_METRICS:
				return ((InternalEList<?>)getScopeMetrics()).basicRemove(otherEnd, msgs);
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
			case MetricsPackage.RESOURCE_METRICS__RESOURCE:
				return getResource();
			case MetricsPackage.RESOURCE_METRICS__SCOPE_METRICS:
				return getScopeMetrics();
			case MetricsPackage.RESOURCE_METRICS__SCHEMA_URL:
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
			case MetricsPackage.RESOURCE_METRICS__RESOURCE:
				setResource((Resource)newValue);
				return;
			case MetricsPackage.RESOURCE_METRICS__SCOPE_METRICS:
				getScopeMetrics().clear();
				getScopeMetrics().addAll((Collection<? extends ScopeMetrics>)newValue);
				return;
			case MetricsPackage.RESOURCE_METRICS__SCHEMA_URL:
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
			case MetricsPackage.RESOURCE_METRICS__RESOURCE:
				setResource((Resource)null);
				return;
			case MetricsPackage.RESOURCE_METRICS__SCOPE_METRICS:
				getScopeMetrics().clear();
				return;
			case MetricsPackage.RESOURCE_METRICS__SCHEMA_URL:
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
			case MetricsPackage.RESOURCE_METRICS__RESOURCE:
				return getResource() != null;
			case MetricsPackage.RESOURCE_METRICS__SCOPE_METRICS:
				return !getScopeMetrics().isEmpty();
			case MetricsPackage.RESOURCE_METRICS__SCHEMA_URL:
				return SCHEMA_URL_EDEFAULT == null ? getSchemaUrl() != null : !SCHEMA_URL_EDEFAULT.equals(getSchemaUrl());
		}
		return super.eIsSet(featureID);
	}

} //ResourceMetricsImpl
