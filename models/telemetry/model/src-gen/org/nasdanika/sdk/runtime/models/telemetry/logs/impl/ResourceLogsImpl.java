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

import org.nasdanika.sdk.runtime.models.telemetry.Resource;

import org.nasdanika.sdk.runtime.models.telemetry.logs.LogsPackage;
import org.nasdanika.sdk.runtime.models.telemetry.logs.ResourceLogs;
import org.nasdanika.sdk.runtime.models.telemetry.logs.ScopeLogs;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resource Logs</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.telemetry.logs.impl.ResourceLogsImpl#getResource <em>Resource</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.telemetry.logs.impl.ResourceLogsImpl#getScopeLogs <em>Scope Logs</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.telemetry.logs.impl.ResourceLogsImpl#getSchemaUrl <em>Schema Url</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ResourceLogsImpl extends MinimalEObjectImpl.Container implements ResourceLogs {
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
	protected ResourceLogsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LogsPackage.Literals.RESOURCE_LOGS;
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
		return (Resource)eDynamicGet(LogsPackage.RESOURCE_LOGS__RESOURCE, LogsPackage.Literals.RESOURCE_LOGS__RESOURCE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResource(Resource newResource, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newResource, LogsPackage.RESOURCE_LOGS__RESOURCE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResource(Resource newResource) {
		eDynamicSet(LogsPackage.RESOURCE_LOGS__RESOURCE, LogsPackage.Literals.RESOURCE_LOGS__RESOURCE, newResource);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<ScopeLogs> getScopeLogs() {
		return (EList<ScopeLogs>)eDynamicGet(LogsPackage.RESOURCE_LOGS__SCOPE_LOGS, LogsPackage.Literals.RESOURCE_LOGS__SCOPE_LOGS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSchemaUrl() {
		return (String)eDynamicGet(LogsPackage.RESOURCE_LOGS__SCHEMA_URL, LogsPackage.Literals.RESOURCE_LOGS__SCHEMA_URL, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSchemaUrl(String newSchemaUrl) {
		eDynamicSet(LogsPackage.RESOURCE_LOGS__SCHEMA_URL, LogsPackage.Literals.RESOURCE_LOGS__SCHEMA_URL, newSchemaUrl);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LogsPackage.RESOURCE_LOGS__RESOURCE:
				return basicSetResource(null, msgs);
			case LogsPackage.RESOURCE_LOGS__SCOPE_LOGS:
				return ((InternalEList<?>)getScopeLogs()).basicRemove(otherEnd, msgs);
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
			case LogsPackage.RESOURCE_LOGS__RESOURCE:
				return getResource();
			case LogsPackage.RESOURCE_LOGS__SCOPE_LOGS:
				return getScopeLogs();
			case LogsPackage.RESOURCE_LOGS__SCHEMA_URL:
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
			case LogsPackage.RESOURCE_LOGS__RESOURCE:
				setResource((Resource)newValue);
				return;
			case LogsPackage.RESOURCE_LOGS__SCOPE_LOGS:
				getScopeLogs().clear();
				getScopeLogs().addAll((Collection<? extends ScopeLogs>)newValue);
				return;
			case LogsPackage.RESOURCE_LOGS__SCHEMA_URL:
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
			case LogsPackage.RESOURCE_LOGS__RESOURCE:
				setResource((Resource)null);
				return;
			case LogsPackage.RESOURCE_LOGS__SCOPE_LOGS:
				getScopeLogs().clear();
				return;
			case LogsPackage.RESOURCE_LOGS__SCHEMA_URL:
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
			case LogsPackage.RESOURCE_LOGS__RESOURCE:
				return getResource() != null;
			case LogsPackage.RESOURCE_LOGS__SCOPE_LOGS:
				return !getScopeLogs().isEmpty();
			case LogsPackage.RESOURCE_LOGS__SCHEMA_URL:
				return SCHEMA_URL_EDEFAULT == null ? getSchemaUrl() != null : !SCHEMA_URL_EDEFAULT.equals(getSchemaUrl());
		}
		return super.eIsSet(featureID);
	}

} //ResourceLogsImpl
