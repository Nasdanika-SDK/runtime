/**
 */
package org.nasdanika.sdk.runtime.models.telemetry.traces.impl;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.nasdanika.sdk.runtime.models.telemetry.traces.SpanId;
import org.nasdanika.sdk.runtime.models.telemetry.traces.TracesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Span Id</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.telemetry.traces.impl.SpanIdImpl#getTraceId <em>Trace Id</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.telemetry.traces.impl.SpanIdImpl#getSpanId <em>Span Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SpanIdImpl extends MinimalEObjectImpl.Container implements SpanId {
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
	 * The default value of the '{@link #getSpanId() <em>Span Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpanId()
	 * @generated
	 * @ordered
	 */
	protected static final String SPAN_ID_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpanIdImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TracesPackage.Literals.SPAN_ID;
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
	public String getTraceId() {
		return (String)eDynamicGet(TracesPackage.SPAN_ID__TRACE_ID, TracesPackage.Literals.SPAN_ID__TRACE_ID, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTraceId(String newTraceId) {
		eDynamicSet(TracesPackage.SPAN_ID__TRACE_ID, TracesPackage.Literals.SPAN_ID__TRACE_ID, newTraceId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSpanId() {
		return (String)eDynamicGet(TracesPackage.SPAN_ID__SPAN_ID, TracesPackage.Literals.SPAN_ID__SPAN_ID, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpanId(String newSpanId) {
		eDynamicSet(TracesPackage.SPAN_ID__SPAN_ID, TracesPackage.Literals.SPAN_ID__SPAN_ID, newSpanId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TracesPackage.SPAN_ID__TRACE_ID:
				return getTraceId();
			case TracesPackage.SPAN_ID__SPAN_ID:
				return getSpanId();
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
			case TracesPackage.SPAN_ID__TRACE_ID:
				setTraceId((String)newValue);
				return;
			case TracesPackage.SPAN_ID__SPAN_ID:
				setSpanId((String)newValue);
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
			case TracesPackage.SPAN_ID__TRACE_ID:
				setTraceId(TRACE_ID_EDEFAULT);
				return;
			case TracesPackage.SPAN_ID__SPAN_ID:
				setSpanId(SPAN_ID_EDEFAULT);
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
			case TracesPackage.SPAN_ID__TRACE_ID:
				return TRACE_ID_EDEFAULT == null ? getTraceId() != null : !TRACE_ID_EDEFAULT.equals(getTraceId());
			case TracesPackage.SPAN_ID__SPAN_ID:
				return SPAN_ID_EDEFAULT == null ? getSpanId() != null : !SPAN_ID_EDEFAULT.equals(getSpanId());
		}
		return super.eIsSet(featureID);
	}

} //SpanIdImpl
