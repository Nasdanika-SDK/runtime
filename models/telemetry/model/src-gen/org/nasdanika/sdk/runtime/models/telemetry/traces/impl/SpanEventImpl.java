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

import org.nasdanika.sdk.runtime.models.telemetry.KeyValue;

import org.nasdanika.sdk.runtime.models.telemetry.traces.SpanEvent;
import org.nasdanika.sdk.runtime.models.telemetry.traces.TracesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Span Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.telemetry.traces.impl.SpanEventImpl#getTimeUnixNano <em>Time Unix Nano</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.telemetry.traces.impl.SpanEventImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.telemetry.traces.impl.SpanEventImpl#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.telemetry.traces.impl.SpanEventImpl#getDroppedAttributesCount <em>Dropped Attributes Count</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SpanEventImpl extends MinimalEObjectImpl.Container implements SpanEvent {
	/**
	 * The default value of the '{@link #getTimeUnixNano() <em>Time Unix Nano</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeUnixNano()
	 * @generated
	 * @ordered
	 */
	protected static final long TIME_UNIX_NANO_EDEFAULT = 0L;

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
	 * The default value of the '{@link #getDroppedAttributesCount() <em>Dropped Attributes Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDroppedAttributesCount()
	 * @generated
	 * @ordered
	 */
	protected static final int DROPPED_ATTRIBUTES_COUNT_EDEFAULT = 0;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpanEventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TracesPackage.Literals.SPAN_EVENT;
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
	public long getTimeUnixNano() {
		return (Long)eDynamicGet(TracesPackage.SPAN_EVENT__TIME_UNIX_NANO, TracesPackage.Literals.SPAN_EVENT__TIME_UNIX_NANO, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeUnixNano(long newTimeUnixNano) {
		eDynamicSet(TracesPackage.SPAN_EVENT__TIME_UNIX_NANO, TracesPackage.Literals.SPAN_EVENT__TIME_UNIX_NANO, newTimeUnixNano);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return (String)eDynamicGet(TracesPackage.SPAN_EVENT__NAME, TracesPackage.Literals.SPAN_EVENT__NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		eDynamicSet(TracesPackage.SPAN_EVENT__NAME, TracesPackage.Literals.SPAN_EVENT__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<KeyValue> getAttributes() {
		return (EList<KeyValue>)eDynamicGet(TracesPackage.SPAN_EVENT__ATTRIBUTES, TracesPackage.Literals.SPAN_EVENT__ATTRIBUTES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getDroppedAttributesCount() {
		return (Integer)eDynamicGet(TracesPackage.SPAN_EVENT__DROPPED_ATTRIBUTES_COUNT, TracesPackage.Literals.SPAN_EVENT__DROPPED_ATTRIBUTES_COUNT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDroppedAttributesCount(int newDroppedAttributesCount) {
		eDynamicSet(TracesPackage.SPAN_EVENT__DROPPED_ATTRIBUTES_COUNT, TracesPackage.Literals.SPAN_EVENT__DROPPED_ATTRIBUTES_COUNT, newDroppedAttributesCount);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TracesPackage.SPAN_EVENT__ATTRIBUTES:
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
			case TracesPackage.SPAN_EVENT__TIME_UNIX_NANO:
				return getTimeUnixNano();
			case TracesPackage.SPAN_EVENT__NAME:
				return getName();
			case TracesPackage.SPAN_EVENT__ATTRIBUTES:
				return getAttributes();
			case TracesPackage.SPAN_EVENT__DROPPED_ATTRIBUTES_COUNT:
				return getDroppedAttributesCount();
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
			case TracesPackage.SPAN_EVENT__TIME_UNIX_NANO:
				setTimeUnixNano((Long)newValue);
				return;
			case TracesPackage.SPAN_EVENT__NAME:
				setName((String)newValue);
				return;
			case TracesPackage.SPAN_EVENT__ATTRIBUTES:
				getAttributes().clear();
				getAttributes().addAll((Collection<? extends KeyValue>)newValue);
				return;
			case TracesPackage.SPAN_EVENT__DROPPED_ATTRIBUTES_COUNT:
				setDroppedAttributesCount((Integer)newValue);
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
			case TracesPackage.SPAN_EVENT__TIME_UNIX_NANO:
				setTimeUnixNano(TIME_UNIX_NANO_EDEFAULT);
				return;
			case TracesPackage.SPAN_EVENT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case TracesPackage.SPAN_EVENT__ATTRIBUTES:
				getAttributes().clear();
				return;
			case TracesPackage.SPAN_EVENT__DROPPED_ATTRIBUTES_COUNT:
				setDroppedAttributesCount(DROPPED_ATTRIBUTES_COUNT_EDEFAULT);
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
			case TracesPackage.SPAN_EVENT__TIME_UNIX_NANO:
				return getTimeUnixNano() != TIME_UNIX_NANO_EDEFAULT;
			case TracesPackage.SPAN_EVENT__NAME:
				return NAME_EDEFAULT == null ? getName() != null : !NAME_EDEFAULT.equals(getName());
			case TracesPackage.SPAN_EVENT__ATTRIBUTES:
				return !getAttributes().isEmpty();
			case TracesPackage.SPAN_EVENT__DROPPED_ATTRIBUTES_COUNT:
				return getDroppedAttributesCount() != DROPPED_ATTRIBUTES_COUNT_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

} //SpanEventImpl
