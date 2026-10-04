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

import org.nasdanika.sdk.runtime.models.telemetry.InstrumentationScope;

import org.nasdanika.sdk.runtime.models.telemetry.metrics.Metric;
import org.nasdanika.sdk.runtime.models.telemetry.metrics.MetricsPackage;
import org.nasdanika.sdk.runtime.models.telemetry.metrics.ScopeMetrics;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Scope Metrics</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.telemetry.metrics.impl.ScopeMetricsImpl#getScope <em>Scope</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.telemetry.metrics.impl.ScopeMetricsImpl#getMetrics <em>Metrics</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.telemetry.metrics.impl.ScopeMetricsImpl#getSchemaUrl <em>Schema Url</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ScopeMetricsImpl extends MinimalEObjectImpl.Container implements ScopeMetrics {
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
	protected ScopeMetricsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetricsPackage.Literals.SCOPE_METRICS;
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
	public InstrumentationScope getScope() {
		return (InstrumentationScope)eDynamicGet(MetricsPackage.SCOPE_METRICS__SCOPE, MetricsPackage.Literals.SCOPE_METRICS__SCOPE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetScope(InstrumentationScope newScope, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newScope, MetricsPackage.SCOPE_METRICS__SCOPE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScope(InstrumentationScope newScope) {
		eDynamicSet(MetricsPackage.SCOPE_METRICS__SCOPE, MetricsPackage.Literals.SCOPE_METRICS__SCOPE, newScope);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Metric> getMetrics() {
		return (EList<Metric>)eDynamicGet(MetricsPackage.SCOPE_METRICS__METRICS, MetricsPackage.Literals.SCOPE_METRICS__METRICS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSchemaUrl() {
		return (String)eDynamicGet(MetricsPackage.SCOPE_METRICS__SCHEMA_URL, MetricsPackage.Literals.SCOPE_METRICS__SCHEMA_URL, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSchemaUrl(String newSchemaUrl) {
		eDynamicSet(MetricsPackage.SCOPE_METRICS__SCHEMA_URL, MetricsPackage.Literals.SCOPE_METRICS__SCHEMA_URL, newSchemaUrl);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MetricsPackage.SCOPE_METRICS__SCOPE:
				return basicSetScope(null, msgs);
			case MetricsPackage.SCOPE_METRICS__METRICS:
				return ((InternalEList<?>)getMetrics()).basicRemove(otherEnd, msgs);
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
			case MetricsPackage.SCOPE_METRICS__SCOPE:
				return getScope();
			case MetricsPackage.SCOPE_METRICS__METRICS:
				return getMetrics();
			case MetricsPackage.SCOPE_METRICS__SCHEMA_URL:
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
			case MetricsPackage.SCOPE_METRICS__SCOPE:
				setScope((InstrumentationScope)newValue);
				return;
			case MetricsPackage.SCOPE_METRICS__METRICS:
				getMetrics().clear();
				getMetrics().addAll((Collection<? extends Metric>)newValue);
				return;
			case MetricsPackage.SCOPE_METRICS__SCHEMA_URL:
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
			case MetricsPackage.SCOPE_METRICS__SCOPE:
				setScope((InstrumentationScope)null);
				return;
			case MetricsPackage.SCOPE_METRICS__METRICS:
				getMetrics().clear();
				return;
			case MetricsPackage.SCOPE_METRICS__SCHEMA_URL:
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
			case MetricsPackage.SCOPE_METRICS__SCOPE:
				return getScope() != null;
			case MetricsPackage.SCOPE_METRICS__METRICS:
				return !getMetrics().isEmpty();
			case MetricsPackage.SCOPE_METRICS__SCHEMA_URL:
				return SCHEMA_URL_EDEFAULT == null ? getSchemaUrl() != null : !SCHEMA_URL_EDEFAULT.equals(getSchemaUrl());
		}
		return super.eIsSet(featureID);
	}

} //ScopeMetricsImpl
