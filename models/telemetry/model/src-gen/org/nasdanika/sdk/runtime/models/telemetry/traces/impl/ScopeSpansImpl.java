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

import org.nasdanika.sdk.runtime.models.telemetry.InstrumentationScope;

import org.nasdanika.sdk.runtime.models.telemetry.traces.ScopeSpans;
import org.nasdanika.sdk.runtime.models.telemetry.traces.Span;
import org.nasdanika.sdk.runtime.models.telemetry.traces.TracesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Scope Spans</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.telemetry.traces.impl.ScopeSpansImpl#getScope <em>Scope</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.telemetry.traces.impl.ScopeSpansImpl#getSpans <em>Spans</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.telemetry.traces.impl.ScopeSpansImpl#getSchemaUrl <em>Schema Url</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ScopeSpansImpl extends MinimalEObjectImpl.Container implements ScopeSpans {
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
	protected ScopeSpansImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TracesPackage.Literals.SCOPE_SPANS;
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
		return (InstrumentationScope)eDynamicGet(TracesPackage.SCOPE_SPANS__SCOPE, TracesPackage.Literals.SCOPE_SPANS__SCOPE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetScope(InstrumentationScope newScope, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newScope, TracesPackage.SCOPE_SPANS__SCOPE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScope(InstrumentationScope newScope) {
		eDynamicSet(TracesPackage.SCOPE_SPANS__SCOPE, TracesPackage.Literals.SCOPE_SPANS__SCOPE, newScope);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Span> getSpans() {
		return (EList<Span>)eDynamicGet(TracesPackage.SCOPE_SPANS__SPANS, TracesPackage.Literals.SCOPE_SPANS__SPANS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSchemaUrl() {
		return (String)eDynamicGet(TracesPackage.SCOPE_SPANS__SCHEMA_URL, TracesPackage.Literals.SCOPE_SPANS__SCHEMA_URL, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSchemaUrl(String newSchemaUrl) {
		eDynamicSet(TracesPackage.SCOPE_SPANS__SCHEMA_URL, TracesPackage.Literals.SCOPE_SPANS__SCHEMA_URL, newSchemaUrl);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TracesPackage.SCOPE_SPANS__SCOPE:
				return basicSetScope(null, msgs);
			case TracesPackage.SCOPE_SPANS__SPANS:
				return ((InternalEList<?>)getSpans()).basicRemove(otherEnd, msgs);
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
			case TracesPackage.SCOPE_SPANS__SCOPE:
				return getScope();
			case TracesPackage.SCOPE_SPANS__SPANS:
				return getSpans();
			case TracesPackage.SCOPE_SPANS__SCHEMA_URL:
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
			case TracesPackage.SCOPE_SPANS__SCOPE:
				setScope((InstrumentationScope)newValue);
				return;
			case TracesPackage.SCOPE_SPANS__SPANS:
				getSpans().clear();
				getSpans().addAll((Collection<? extends Span>)newValue);
				return;
			case TracesPackage.SCOPE_SPANS__SCHEMA_URL:
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
			case TracesPackage.SCOPE_SPANS__SCOPE:
				setScope((InstrumentationScope)null);
				return;
			case TracesPackage.SCOPE_SPANS__SPANS:
				getSpans().clear();
				return;
			case TracesPackage.SCOPE_SPANS__SCHEMA_URL:
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
			case TracesPackage.SCOPE_SPANS__SCOPE:
				return getScope() != null;
			case TracesPackage.SCOPE_SPANS__SPANS:
				return !getSpans().isEmpty();
			case TracesPackage.SCOPE_SPANS__SCHEMA_URL:
				return SCHEMA_URL_EDEFAULT == null ? getSchemaUrl() != null : !SCHEMA_URL_EDEFAULT.equals(getSchemaUrl());
		}
		return super.eIsSet(featureID);
	}

} //ScopeSpansImpl
