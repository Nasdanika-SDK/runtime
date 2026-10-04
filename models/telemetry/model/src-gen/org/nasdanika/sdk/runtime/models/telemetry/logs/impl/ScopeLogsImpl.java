/**
 */
package org.nasdanika.sdk.runtime.models.telemetry.logs.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.sdk.runtime.models.telemetry.InstrumentationScope;

import org.nasdanika.sdk.runtime.models.telemetry.logs.LogRecord;
import org.nasdanika.sdk.runtime.models.telemetry.logs.LogsPackage;
import org.nasdanika.sdk.runtime.models.telemetry.logs.ScopeLogs;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Scope Logs</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.telemetry.logs.impl.ScopeLogsImpl#getScope <em>Scope</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.telemetry.logs.impl.ScopeLogsImpl#getLogRecords <em>Log Records</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.telemetry.logs.impl.ScopeLogsImpl#getSchemaUrl <em>Schema Url</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ScopeLogsImpl extends MinimalEObjectImpl.Container implements ScopeLogs {
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
	protected ScopeLogsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LogsPackage.Literals.SCOPE_LOGS;
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
		return (InstrumentationScope)eDynamicGet(LogsPackage.SCOPE_LOGS__SCOPE, LogsPackage.Literals.SCOPE_LOGS__SCOPE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetScope(InstrumentationScope newScope, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newScope, LogsPackage.SCOPE_LOGS__SCOPE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScope(InstrumentationScope newScope) {
		eDynamicSet(LogsPackage.SCOPE_LOGS__SCOPE, LogsPackage.Literals.SCOPE_LOGS__SCOPE, newScope);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<LogRecord> getLogRecords() {
		return (EList<LogRecord>)eDynamicGet(LogsPackage.SCOPE_LOGS__LOG_RECORDS, LogsPackage.Literals.SCOPE_LOGS__LOG_RECORDS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSchemaUrl() {
		return (String)eDynamicGet(LogsPackage.SCOPE_LOGS__SCHEMA_URL, LogsPackage.Literals.SCOPE_LOGS__SCHEMA_URL, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSchemaUrl(String newSchemaUrl) {
		eDynamicSet(LogsPackage.SCOPE_LOGS__SCHEMA_URL, LogsPackage.Literals.SCOPE_LOGS__SCHEMA_URL, newSchemaUrl);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LogsPackage.SCOPE_LOGS__SCOPE:
				return basicSetScope(null, msgs);
			case LogsPackage.SCOPE_LOGS__LOG_RECORDS:
				return ((InternalEList<?>)getLogRecords()).basicRemove(otherEnd, msgs);
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
			case LogsPackage.SCOPE_LOGS__SCOPE:
				return getScope();
			case LogsPackage.SCOPE_LOGS__LOG_RECORDS:
				return getLogRecords();
			case LogsPackage.SCOPE_LOGS__SCHEMA_URL:
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
			case LogsPackage.SCOPE_LOGS__SCOPE:
				setScope((InstrumentationScope)newValue);
				return;
			case LogsPackage.SCOPE_LOGS__LOG_RECORDS:
				getLogRecords().clear();
				getLogRecords().addAll((Collection<? extends LogRecord>)newValue);
				return;
			case LogsPackage.SCOPE_LOGS__SCHEMA_URL:
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
			case LogsPackage.SCOPE_LOGS__SCOPE:
				setScope((InstrumentationScope)null);
				return;
			case LogsPackage.SCOPE_LOGS__LOG_RECORDS:
				getLogRecords().clear();
				return;
			case LogsPackage.SCOPE_LOGS__SCHEMA_URL:
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
			case LogsPackage.SCOPE_LOGS__SCOPE:
				return getScope() != null;
			case LogsPackage.SCOPE_LOGS__LOG_RECORDS:
				return !getLogRecords().isEmpty();
			case LogsPackage.SCOPE_LOGS__SCHEMA_URL:
				return SCHEMA_URL_EDEFAULT == null ? getSchemaUrl() != null : !SCHEMA_URL_EDEFAULT.equals(getSchemaUrl());
		}
		return super.eIsSet(featureID);
	}

} //ScopeLogsImpl
