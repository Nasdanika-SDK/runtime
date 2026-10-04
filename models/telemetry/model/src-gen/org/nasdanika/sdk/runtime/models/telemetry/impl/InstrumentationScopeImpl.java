/**
 */
package org.nasdanika.sdk.runtime.models.telemetry.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.sdk.runtime.models.telemetry.InstrumentationScope;
import org.nasdanika.sdk.runtime.models.telemetry.KeyValue;
import org.nasdanika.sdk.runtime.models.telemetry.TelemetryPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Instrumentation Scope</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.telemetry.impl.InstrumentationScopeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.telemetry.impl.InstrumentationScopeImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.telemetry.impl.InstrumentationScopeImpl#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.telemetry.impl.InstrumentationScopeImpl#getDroppedAttributesCount <em>Dropped Attributes Count</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.telemetry.impl.InstrumentationScopeImpl#getSchemaUrl <em>Schema Url</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InstrumentationScopeImpl extends MinimalEObjectImpl.Container implements InstrumentationScope {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getDroppedAttributesCount() <em>Dropped Attributes Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDroppedAttributesCount()
	 * @generated
	 * @ordered
	 */
	protected static final int DROPPED_ATTRIBUTES_COUNT_EDEFAULT = 0;

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
	protected InstrumentationScopeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TelemetryPackage.Literals.INSTRUMENTATION_SCOPE;
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
	public String getName() {
		return (String)eDynamicGet(TelemetryPackage.INSTRUMENTATION_SCOPE__NAME, TelemetryPackage.Literals.INSTRUMENTATION_SCOPE__NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		eDynamicSet(TelemetryPackage.INSTRUMENTATION_SCOPE__NAME, TelemetryPackage.Literals.INSTRUMENTATION_SCOPE__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVersion() {
		return (String)eDynamicGet(TelemetryPackage.INSTRUMENTATION_SCOPE__VERSION, TelemetryPackage.Literals.INSTRUMENTATION_SCOPE__VERSION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersion(String newVersion) {
		eDynamicSet(TelemetryPackage.INSTRUMENTATION_SCOPE__VERSION, TelemetryPackage.Literals.INSTRUMENTATION_SCOPE__VERSION, newVersion);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<KeyValue> getAttributes() {
		return (EList<KeyValue>)eDynamicGet(TelemetryPackage.INSTRUMENTATION_SCOPE__ATTRIBUTES, TelemetryPackage.Literals.INSTRUMENTATION_SCOPE__ATTRIBUTES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getDroppedAttributesCount() {
		return (Integer)eDynamicGet(TelemetryPackage.INSTRUMENTATION_SCOPE__DROPPED_ATTRIBUTES_COUNT, TelemetryPackage.Literals.INSTRUMENTATION_SCOPE__DROPPED_ATTRIBUTES_COUNT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDroppedAttributesCount(int newDroppedAttributesCount) {
		eDynamicSet(TelemetryPackage.INSTRUMENTATION_SCOPE__DROPPED_ATTRIBUTES_COUNT, TelemetryPackage.Literals.INSTRUMENTATION_SCOPE__DROPPED_ATTRIBUTES_COUNT, newDroppedAttributesCount);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSchemaUrl() {
		return (String)eDynamicGet(TelemetryPackage.INSTRUMENTATION_SCOPE__SCHEMA_URL, TelemetryPackage.Literals.INSTRUMENTATION_SCOPE__SCHEMA_URL, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSchemaUrl(String newSchemaUrl) {
		eDynamicSet(TelemetryPackage.INSTRUMENTATION_SCOPE__SCHEMA_URL, TelemetryPackage.Literals.INSTRUMENTATION_SCOPE__SCHEMA_URL, newSchemaUrl);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TelemetryPackage.INSTRUMENTATION_SCOPE__ATTRIBUTES:
				return ((InternalEList<?>)getAttributes()).basicRemove(otherEnd, msgs);
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
			case TelemetryPackage.INSTRUMENTATION_SCOPE__NAME:
				return getName();
			case TelemetryPackage.INSTRUMENTATION_SCOPE__VERSION:
				return getVersion();
			case TelemetryPackage.INSTRUMENTATION_SCOPE__ATTRIBUTES:
				return getAttributes();
			case TelemetryPackage.INSTRUMENTATION_SCOPE__DROPPED_ATTRIBUTES_COUNT:
				return getDroppedAttributesCount();
			case TelemetryPackage.INSTRUMENTATION_SCOPE__SCHEMA_URL:
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
			case TelemetryPackage.INSTRUMENTATION_SCOPE__NAME:
				setName((String)newValue);
				return;
			case TelemetryPackage.INSTRUMENTATION_SCOPE__VERSION:
				setVersion((String)newValue);
				return;
			case TelemetryPackage.INSTRUMENTATION_SCOPE__ATTRIBUTES:
				getAttributes().clear();
				getAttributes().addAll((Collection<? extends KeyValue>)newValue);
				return;
			case TelemetryPackage.INSTRUMENTATION_SCOPE__DROPPED_ATTRIBUTES_COUNT:
				setDroppedAttributesCount((Integer)newValue);
				return;
			case TelemetryPackage.INSTRUMENTATION_SCOPE__SCHEMA_URL:
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
			case TelemetryPackage.INSTRUMENTATION_SCOPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case TelemetryPackage.INSTRUMENTATION_SCOPE__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case TelemetryPackage.INSTRUMENTATION_SCOPE__ATTRIBUTES:
				getAttributes().clear();
				return;
			case TelemetryPackage.INSTRUMENTATION_SCOPE__DROPPED_ATTRIBUTES_COUNT:
				setDroppedAttributesCount(DROPPED_ATTRIBUTES_COUNT_EDEFAULT);
				return;
			case TelemetryPackage.INSTRUMENTATION_SCOPE__SCHEMA_URL:
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
			case TelemetryPackage.INSTRUMENTATION_SCOPE__NAME:
				return NAME_EDEFAULT == null ? getName() != null : !NAME_EDEFAULT.equals(getName());
			case TelemetryPackage.INSTRUMENTATION_SCOPE__VERSION:
				return VERSION_EDEFAULT == null ? getVersion() != null : !VERSION_EDEFAULT.equals(getVersion());
			case TelemetryPackage.INSTRUMENTATION_SCOPE__ATTRIBUTES:
				return !getAttributes().isEmpty();
			case TelemetryPackage.INSTRUMENTATION_SCOPE__DROPPED_ATTRIBUTES_COUNT:
				return getDroppedAttributesCount() != DROPPED_ATTRIBUTES_COUNT_EDEFAULT;
			case TelemetryPackage.INSTRUMENTATION_SCOPE__SCHEMA_URL:
				return SCHEMA_URL_EDEFAULT == null ? getSchemaUrl() != null : !SCHEMA_URL_EDEFAULT.equals(getSchemaUrl());
		}
		return super.eIsSet(featureID);
	}

} //InstrumentationScopeImpl
