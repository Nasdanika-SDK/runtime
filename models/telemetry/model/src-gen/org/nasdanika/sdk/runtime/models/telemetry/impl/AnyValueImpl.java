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

import org.nasdanika.sdk.runtime.models.telemetry.AnyValue;
import org.nasdanika.sdk.runtime.models.telemetry.KeyValue;
import org.nasdanika.sdk.runtime.models.telemetry.TelemetryPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Any Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.telemetry.impl.AnyValueImpl#getStringValue <em>String Value</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.telemetry.impl.AnyValueImpl#getBoolValue <em>Bool Value</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.telemetry.impl.AnyValueImpl#getIntValue <em>Int Value</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.telemetry.impl.AnyValueImpl#getDoubleValue <em>Double Value</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.telemetry.impl.AnyValueImpl#getArrayValue <em>Array Value</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.telemetry.impl.AnyValueImpl#getKvlistValue <em>Kvlist Value</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.telemetry.impl.AnyValueImpl#getBytesValue <em>Bytes Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AnyValueImpl extends MinimalEObjectImpl.Container implements AnyValue {
	/**
	 * The default value of the '{@link #getStringValue() <em>String Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStringValue()
	 * @generated
	 * @ordered
	 */
	protected static final String STRING_VALUE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getBoolValue() <em>Bool Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoolValue()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean BOOL_VALUE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getIntValue() <em>Int Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntValue()
	 * @generated
	 * @ordered
	 */
	protected static final Long INT_VALUE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getDoubleValue() <em>Double Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDoubleValue()
	 * @generated
	 * @ordered
	 */
	protected static final Double DOUBLE_VALUE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getBytesValue() <em>Bytes Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBytesValue()
	 * @generated
	 * @ordered
	 */
	protected static final byte[] BYTES_VALUE_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnyValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TelemetryPackage.Literals.ANY_VALUE;
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
	public String getStringValue() {
		return (String)eDynamicGet(TelemetryPackage.ANY_VALUE__STRING_VALUE, TelemetryPackage.Literals.ANY_VALUE__STRING_VALUE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStringValue(String newStringValue) {
		eDynamicSet(TelemetryPackage.ANY_VALUE__STRING_VALUE, TelemetryPackage.Literals.ANY_VALUE__STRING_VALUE, newStringValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getBoolValue() {
		return (Boolean)eDynamicGet(TelemetryPackage.ANY_VALUE__BOOL_VALUE, TelemetryPackage.Literals.ANY_VALUE__BOOL_VALUE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBoolValue(Boolean newBoolValue) {
		eDynamicSet(TelemetryPackage.ANY_VALUE__BOOL_VALUE, TelemetryPackage.Literals.ANY_VALUE__BOOL_VALUE, newBoolValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long getIntValue() {
		return (Long)eDynamicGet(TelemetryPackage.ANY_VALUE__INT_VALUE, TelemetryPackage.Literals.ANY_VALUE__INT_VALUE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIntValue(Long newIntValue) {
		eDynamicSet(TelemetryPackage.ANY_VALUE__INT_VALUE, TelemetryPackage.Literals.ANY_VALUE__INT_VALUE, newIntValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getDoubleValue() {
		return (Double)eDynamicGet(TelemetryPackage.ANY_VALUE__DOUBLE_VALUE, TelemetryPackage.Literals.ANY_VALUE__DOUBLE_VALUE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDoubleValue(Double newDoubleValue) {
		eDynamicSet(TelemetryPackage.ANY_VALUE__DOUBLE_VALUE, TelemetryPackage.Literals.ANY_VALUE__DOUBLE_VALUE, newDoubleValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<AnyValue> getArrayValue() {
		return (EList<AnyValue>)eDynamicGet(TelemetryPackage.ANY_VALUE__ARRAY_VALUE, TelemetryPackage.Literals.ANY_VALUE__ARRAY_VALUE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<KeyValue> getKvlistValue() {
		return (EList<KeyValue>)eDynamicGet(TelemetryPackage.ANY_VALUE__KVLIST_VALUE, TelemetryPackage.Literals.ANY_VALUE__KVLIST_VALUE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte[] getBytesValue() {
		return (byte[])eDynamicGet(TelemetryPackage.ANY_VALUE__BYTES_VALUE, TelemetryPackage.Literals.ANY_VALUE__BYTES_VALUE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBytesValue(byte[] newBytesValue) {
		eDynamicSet(TelemetryPackage.ANY_VALUE__BYTES_VALUE, TelemetryPackage.Literals.ANY_VALUE__BYTES_VALUE, newBytesValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TelemetryPackage.ANY_VALUE__ARRAY_VALUE:
				return ((InternalEList<?>)getArrayValue()).basicRemove(otherEnd, msgs);
			case TelemetryPackage.ANY_VALUE__KVLIST_VALUE:
				return ((InternalEList<?>)getKvlistValue()).basicRemove(otherEnd, msgs);
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
			case TelemetryPackage.ANY_VALUE__STRING_VALUE:
				return getStringValue();
			case TelemetryPackage.ANY_VALUE__BOOL_VALUE:
				return getBoolValue();
			case TelemetryPackage.ANY_VALUE__INT_VALUE:
				return getIntValue();
			case TelemetryPackage.ANY_VALUE__DOUBLE_VALUE:
				return getDoubleValue();
			case TelemetryPackage.ANY_VALUE__ARRAY_VALUE:
				return getArrayValue();
			case TelemetryPackage.ANY_VALUE__KVLIST_VALUE:
				return getKvlistValue();
			case TelemetryPackage.ANY_VALUE__BYTES_VALUE:
				return getBytesValue();
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
			case TelemetryPackage.ANY_VALUE__STRING_VALUE:
				setStringValue((String)newValue);
				return;
			case TelemetryPackage.ANY_VALUE__BOOL_VALUE:
				setBoolValue((Boolean)newValue);
				return;
			case TelemetryPackage.ANY_VALUE__INT_VALUE:
				setIntValue((Long)newValue);
				return;
			case TelemetryPackage.ANY_VALUE__DOUBLE_VALUE:
				setDoubleValue((Double)newValue);
				return;
			case TelemetryPackage.ANY_VALUE__ARRAY_VALUE:
				getArrayValue().clear();
				getArrayValue().addAll((Collection<? extends AnyValue>)newValue);
				return;
			case TelemetryPackage.ANY_VALUE__KVLIST_VALUE:
				getKvlistValue().clear();
				getKvlistValue().addAll((Collection<? extends KeyValue>)newValue);
				return;
			case TelemetryPackage.ANY_VALUE__BYTES_VALUE:
				setBytesValue((byte[])newValue);
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
			case TelemetryPackage.ANY_VALUE__STRING_VALUE:
				setStringValue(STRING_VALUE_EDEFAULT);
				return;
			case TelemetryPackage.ANY_VALUE__BOOL_VALUE:
				setBoolValue(BOOL_VALUE_EDEFAULT);
				return;
			case TelemetryPackage.ANY_VALUE__INT_VALUE:
				setIntValue(INT_VALUE_EDEFAULT);
				return;
			case TelemetryPackage.ANY_VALUE__DOUBLE_VALUE:
				setDoubleValue(DOUBLE_VALUE_EDEFAULT);
				return;
			case TelemetryPackage.ANY_VALUE__ARRAY_VALUE:
				getArrayValue().clear();
				return;
			case TelemetryPackage.ANY_VALUE__KVLIST_VALUE:
				getKvlistValue().clear();
				return;
			case TelemetryPackage.ANY_VALUE__BYTES_VALUE:
				setBytesValue(BYTES_VALUE_EDEFAULT);
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
			case TelemetryPackage.ANY_VALUE__STRING_VALUE:
				return STRING_VALUE_EDEFAULT == null ? getStringValue() != null : !STRING_VALUE_EDEFAULT.equals(getStringValue());
			case TelemetryPackage.ANY_VALUE__BOOL_VALUE:
				return BOOL_VALUE_EDEFAULT == null ? getBoolValue() != null : !BOOL_VALUE_EDEFAULT.equals(getBoolValue());
			case TelemetryPackage.ANY_VALUE__INT_VALUE:
				return INT_VALUE_EDEFAULT == null ? getIntValue() != null : !INT_VALUE_EDEFAULT.equals(getIntValue());
			case TelemetryPackage.ANY_VALUE__DOUBLE_VALUE:
				return DOUBLE_VALUE_EDEFAULT == null ? getDoubleValue() != null : !DOUBLE_VALUE_EDEFAULT.equals(getDoubleValue());
			case TelemetryPackage.ANY_VALUE__ARRAY_VALUE:
				return !getArrayValue().isEmpty();
			case TelemetryPackage.ANY_VALUE__KVLIST_VALUE:
				return !getKvlistValue().isEmpty();
			case TelemetryPackage.ANY_VALUE__BYTES_VALUE:
				return BYTES_VALUE_EDEFAULT == null ? getBytesValue() != null : !BYTES_VALUE_EDEFAULT.equals(getBytesValue());
		}
		return super.eIsSet(featureID);
	}

} //AnyValueImpl
