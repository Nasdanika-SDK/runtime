/**
 */
package org.nasdanika.sdk.runtime.models.telemetry.impl;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.nasdanika.sdk.runtime.models.telemetry.AnyValue;
import org.nasdanika.sdk.runtime.models.telemetry.KeyValue;
import org.nasdanika.sdk.runtime.models.telemetry.TelemetryPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Key Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.telemetry.impl.KeyValueImpl#getKey <em>Key</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.telemetry.impl.KeyValueImpl#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class KeyValueImpl extends MinimalEObjectImpl.Container implements KeyValue {
	/**
	 * The default value of the '{@link #getKey() <em>Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKey()
	 * @generated
	 * @ordered
	 */
	protected static final String KEY_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected KeyValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TelemetryPackage.Literals.KEY_VALUE;
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
	public String getKey() {
		return (String)eDynamicGet(TelemetryPackage.KEY_VALUE__KEY, TelemetryPackage.Literals.KEY_VALUE__KEY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKey(String newKey) {
		eDynamicSet(TelemetryPackage.KEY_VALUE__KEY, TelemetryPackage.Literals.KEY_VALUE__KEY, newKey);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnyValue getValue() {
		return (AnyValue)eDynamicGet(TelemetryPackage.KEY_VALUE__VALUE, TelemetryPackage.Literals.KEY_VALUE__VALUE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValue(AnyValue newValue, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newValue, TelemetryPackage.KEY_VALUE__VALUE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(AnyValue newValue) {
		eDynamicSet(TelemetryPackage.KEY_VALUE__VALUE, TelemetryPackage.Literals.KEY_VALUE__VALUE, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TelemetryPackage.KEY_VALUE__VALUE:
				return basicSetValue(null, msgs);
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
			case TelemetryPackage.KEY_VALUE__KEY:
				return getKey();
			case TelemetryPackage.KEY_VALUE__VALUE:
				return getValue();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TelemetryPackage.KEY_VALUE__KEY:
				setKey((String)newValue);
				return;
			case TelemetryPackage.KEY_VALUE__VALUE:
				setValue((AnyValue)newValue);
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
			case TelemetryPackage.KEY_VALUE__KEY:
				setKey(KEY_EDEFAULT);
				return;
			case TelemetryPackage.KEY_VALUE__VALUE:
				setValue((AnyValue)null);
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
			case TelemetryPackage.KEY_VALUE__KEY:
				return KEY_EDEFAULT == null ? getKey() != null : !KEY_EDEFAULT.equals(getKey());
			case TelemetryPackage.KEY_VALUE__VALUE:
				return getValue() != null;
		}
		return super.eIsSet(featureID);
	}

} //KeyValueImpl
