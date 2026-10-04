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

import org.nasdanika.sdk.runtime.models.telemetry.KeyValue;

import org.nasdanika.sdk.runtime.models.telemetry.metrics.Exemplar;
import org.nasdanika.sdk.runtime.models.telemetry.metrics.MetricsPackage;

import org.nasdanika.sdk.runtime.models.telemetry.traces.Span;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Exemplar</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.telemetry.metrics.impl.ExemplarImpl#getFilteredAttributes <em>Filtered Attributes</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.telemetry.metrics.impl.ExemplarImpl#getTimeUnixNano <em>Time Unix Nano</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.telemetry.metrics.impl.ExemplarImpl#getAsDouble <em>As Double</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.telemetry.metrics.impl.ExemplarImpl#getAsInt <em>As Int</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.telemetry.metrics.impl.ExemplarImpl#getSpanId <em>Span Id</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.telemetry.metrics.impl.ExemplarImpl#getTraceId <em>Trace Id</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.telemetry.metrics.impl.ExemplarImpl#getSpan <em>Span</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExemplarImpl extends MinimalEObjectImpl.Container implements Exemplar {
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
	 * The default value of the '{@link #getAsDouble() <em>As Double</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAsDouble()
	 * @generated
	 * @ordered
	 */
	protected static final Double AS_DOUBLE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getAsInt() <em>As Int</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAsInt()
	 * @generated
	 * @ordered
	 */
	protected static final Long AS_INT_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getSpanId() <em>Span Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpanId()
	 * @generated
	 * @ordered
	 */
	protected static final String SPAN_ID_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getTraceId() <em>Trace Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTraceId()
	 * @generated
	 * @ordered
	 */
	protected static final String TRACE_ID_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExemplarImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetricsPackage.Literals.EXEMPLAR;
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
	@SuppressWarnings("unchecked")
	public EList<KeyValue> getFilteredAttributes() {
		return (EList<KeyValue>)eDynamicGet(MetricsPackage.EXEMPLAR__FILTERED_ATTRIBUTES, MetricsPackage.Literals.EXEMPLAR__FILTERED_ATTRIBUTES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getTimeUnixNano() {
		return (Long)eDynamicGet(MetricsPackage.EXEMPLAR__TIME_UNIX_NANO, MetricsPackage.Literals.EXEMPLAR__TIME_UNIX_NANO, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeUnixNano(long newTimeUnixNano) {
		eDynamicSet(MetricsPackage.EXEMPLAR__TIME_UNIX_NANO, MetricsPackage.Literals.EXEMPLAR__TIME_UNIX_NANO, newTimeUnixNano);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getAsDouble() {
		return (Double)eDynamicGet(MetricsPackage.EXEMPLAR__AS_DOUBLE, MetricsPackage.Literals.EXEMPLAR__AS_DOUBLE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAsDouble(Double newAsDouble) {
		eDynamicSet(MetricsPackage.EXEMPLAR__AS_DOUBLE, MetricsPackage.Literals.EXEMPLAR__AS_DOUBLE, newAsDouble);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long getAsInt() {
		return (Long)eDynamicGet(MetricsPackage.EXEMPLAR__AS_INT, MetricsPackage.Literals.EXEMPLAR__AS_INT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAsInt(Long newAsInt) {
		eDynamicSet(MetricsPackage.EXEMPLAR__AS_INT, MetricsPackage.Literals.EXEMPLAR__AS_INT, newAsInt);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSpanId() {
		return (String)eDynamicGet(MetricsPackage.EXEMPLAR__SPAN_ID, MetricsPackage.Literals.EXEMPLAR__SPAN_ID, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpanId(String newSpanId) {
		eDynamicSet(MetricsPackage.EXEMPLAR__SPAN_ID, MetricsPackage.Literals.EXEMPLAR__SPAN_ID, newSpanId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTraceId() {
		return (String)eDynamicGet(MetricsPackage.EXEMPLAR__TRACE_ID, MetricsPackage.Literals.EXEMPLAR__TRACE_ID, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTraceId(String newTraceId) {
		eDynamicSet(MetricsPackage.EXEMPLAR__TRACE_ID, MetricsPackage.Literals.EXEMPLAR__TRACE_ID, newTraceId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Span getSpan() {
		return (Span)eDynamicGet(MetricsPackage.EXEMPLAR__SPAN, MetricsPackage.Literals.EXEMPLAR__SPAN, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Span basicGetSpan() {
		return (Span)eDynamicGet(MetricsPackage.EXEMPLAR__SPAN, MetricsPackage.Literals.EXEMPLAR__SPAN, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpan(Span newSpan) {
		eDynamicSet(MetricsPackage.EXEMPLAR__SPAN, MetricsPackage.Literals.EXEMPLAR__SPAN, newSpan);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MetricsPackage.EXEMPLAR__FILTERED_ATTRIBUTES:
				return ((InternalEList<?>)getFilteredAttributes()).basicRemove(otherEnd, msgs);
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
			case MetricsPackage.EXEMPLAR__FILTERED_ATTRIBUTES:
				return getFilteredAttributes();
			case MetricsPackage.EXEMPLAR__TIME_UNIX_NANO:
				return getTimeUnixNano();
			case MetricsPackage.EXEMPLAR__AS_DOUBLE:
				return getAsDouble();
			case MetricsPackage.EXEMPLAR__AS_INT:
				return getAsInt();
			case MetricsPackage.EXEMPLAR__SPAN_ID:
				return getSpanId();
			case MetricsPackage.EXEMPLAR__TRACE_ID:
				return getTraceId();
			case MetricsPackage.EXEMPLAR__SPAN:
				if (resolve) return getSpan();
				return basicGetSpan();
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
			case MetricsPackage.EXEMPLAR__FILTERED_ATTRIBUTES:
				getFilteredAttributes().clear();
				getFilteredAttributes().addAll((Collection<? extends KeyValue>)newValue);
				return;
			case MetricsPackage.EXEMPLAR__TIME_UNIX_NANO:
				setTimeUnixNano((Long)newValue);
				return;
			case MetricsPackage.EXEMPLAR__AS_DOUBLE:
				setAsDouble((Double)newValue);
				return;
			case MetricsPackage.EXEMPLAR__AS_INT:
				setAsInt((Long)newValue);
				return;
			case MetricsPackage.EXEMPLAR__SPAN_ID:
				setSpanId((String)newValue);
				return;
			case MetricsPackage.EXEMPLAR__TRACE_ID:
				setTraceId((String)newValue);
				return;
			case MetricsPackage.EXEMPLAR__SPAN:
				setSpan((Span)newValue);
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
			case MetricsPackage.EXEMPLAR__FILTERED_ATTRIBUTES:
				getFilteredAttributes().clear();
				return;
			case MetricsPackage.EXEMPLAR__TIME_UNIX_NANO:
				setTimeUnixNano(TIME_UNIX_NANO_EDEFAULT);
				return;
			case MetricsPackage.EXEMPLAR__AS_DOUBLE:
				setAsDouble(AS_DOUBLE_EDEFAULT);
				return;
			case MetricsPackage.EXEMPLAR__AS_INT:
				setAsInt(AS_INT_EDEFAULT);
				return;
			case MetricsPackage.EXEMPLAR__SPAN_ID:
				setSpanId(SPAN_ID_EDEFAULT);
				return;
			case MetricsPackage.EXEMPLAR__TRACE_ID:
				setTraceId(TRACE_ID_EDEFAULT);
				return;
			case MetricsPackage.EXEMPLAR__SPAN:
				setSpan((Span)null);
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
			case MetricsPackage.EXEMPLAR__FILTERED_ATTRIBUTES:
				return !getFilteredAttributes().isEmpty();
			case MetricsPackage.EXEMPLAR__TIME_UNIX_NANO:
				return getTimeUnixNano() != TIME_UNIX_NANO_EDEFAULT;
			case MetricsPackage.EXEMPLAR__AS_DOUBLE:
				return AS_DOUBLE_EDEFAULT == null ? getAsDouble() != null : !AS_DOUBLE_EDEFAULT.equals(getAsDouble());
			case MetricsPackage.EXEMPLAR__AS_INT:
				return AS_INT_EDEFAULT == null ? getAsInt() != null : !AS_INT_EDEFAULT.equals(getAsInt());
			case MetricsPackage.EXEMPLAR__SPAN_ID:
				return SPAN_ID_EDEFAULT == null ? getSpanId() != null : !SPAN_ID_EDEFAULT.equals(getSpanId());
			case MetricsPackage.EXEMPLAR__TRACE_ID:
				return TRACE_ID_EDEFAULT == null ? getTraceId() != null : !TRACE_ID_EDEFAULT.equals(getTraceId());
			case MetricsPackage.EXEMPLAR__SPAN:
				return basicGetSpan() != null;
		}
		return super.eIsSet(featureID);
	}

} //ExemplarImpl
