/**
 */
package org.nasdanika.sdk.runtime.models.telemetry.traces.impl;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.nasdanika.sdk.runtime.models.telemetry.traces.FeatureChange;
import org.nasdanika.sdk.runtime.models.telemetry.traces.Span;
import org.nasdanika.sdk.runtime.models.telemetry.traces.SpanId;
import org.nasdanika.sdk.runtime.models.telemetry.traces.SpanReference;
import org.nasdanika.sdk.runtime.models.telemetry.traces.TracesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Feature Change</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.telemetry.traces.impl.FeatureChangeImpl#getTraceId <em>Trace Id</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.telemetry.traces.impl.FeatureChangeImpl#getSpanId <em>Span Id</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.telemetry.traces.impl.FeatureChangeImpl#getSpan <em>Span</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FeatureChangeImpl extends org.eclipse.emf.ecore.change.impl.FeatureChangeImpl implements FeatureChange {
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
	protected FeatureChangeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TracesPackage.Literals.FEATURE_CHANGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int ESTATIC_FEATURE_COUNT = 7;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return ESTATIC_FEATURE_COUNT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTraceId() {
		return (String)eDynamicGet(TracesPackage.FEATURE_CHANGE__TRACE_ID - ESTATIC_FEATURE_COUNT, TracesPackage.Literals.SPAN_ID__TRACE_ID, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTraceId(String newTraceId) {
		eDynamicSet(TracesPackage.FEATURE_CHANGE__TRACE_ID - ESTATIC_FEATURE_COUNT, TracesPackage.Literals.SPAN_ID__TRACE_ID, newTraceId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSpanId() {
		return (String)eDynamicGet(TracesPackage.FEATURE_CHANGE__SPAN_ID - ESTATIC_FEATURE_COUNT, TracesPackage.Literals.SPAN_ID__SPAN_ID, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpanId(String newSpanId) {
		eDynamicSet(TracesPackage.FEATURE_CHANGE__SPAN_ID - ESTATIC_FEATURE_COUNT, TracesPackage.Literals.SPAN_ID__SPAN_ID, newSpanId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Span getSpan() {
		return (Span)eDynamicGet(TracesPackage.FEATURE_CHANGE__SPAN - ESTATIC_FEATURE_COUNT, TracesPackage.Literals.SPAN_REFERENCE__SPAN, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Span basicGetSpan() {
		return (Span)eDynamicGet(TracesPackage.FEATURE_CHANGE__SPAN - ESTATIC_FEATURE_COUNT, TracesPackage.Literals.SPAN_REFERENCE__SPAN, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSpan(Span newSpan, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newSpan, TracesPackage.FEATURE_CHANGE__SPAN, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpan(Span newSpan) {
		eDynamicSet(TracesPackage.FEATURE_CHANGE__SPAN - ESTATIC_FEATURE_COUNT, TracesPackage.Literals.SPAN_REFERENCE__SPAN, newSpan);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TracesPackage.FEATURE_CHANGE__SPAN:
				Span span = basicGetSpan();
				if (span != null)
					msgs = ((InternalEObject)span).eInverseRemove(this, TracesPackage.SPAN__REFERRERS, Span.class, msgs);
				return basicSetSpan((Span)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TracesPackage.FEATURE_CHANGE__SPAN:
				return basicSetSpan(null, msgs);
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
			case TracesPackage.FEATURE_CHANGE__TRACE_ID:
				return getTraceId();
			case TracesPackage.FEATURE_CHANGE__SPAN_ID:
				return getSpanId();
			case TracesPackage.FEATURE_CHANGE__SPAN:
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
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TracesPackage.FEATURE_CHANGE__TRACE_ID:
				setTraceId((String)newValue);
				return;
			case TracesPackage.FEATURE_CHANGE__SPAN_ID:
				setSpanId((String)newValue);
				return;
			case TracesPackage.FEATURE_CHANGE__SPAN:
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
			case TracesPackage.FEATURE_CHANGE__TRACE_ID:
				setTraceId(TRACE_ID_EDEFAULT);
				return;
			case TracesPackage.FEATURE_CHANGE__SPAN_ID:
				setSpanId(SPAN_ID_EDEFAULT);
				return;
			case TracesPackage.FEATURE_CHANGE__SPAN:
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
			case TracesPackage.FEATURE_CHANGE__TRACE_ID:
				return TRACE_ID_EDEFAULT == null ? getTraceId() != null : !TRACE_ID_EDEFAULT.equals(getTraceId());
			case TracesPackage.FEATURE_CHANGE__SPAN_ID:
				return SPAN_ID_EDEFAULT == null ? getSpanId() != null : !SPAN_ID_EDEFAULT.equals(getSpanId());
			case TracesPackage.FEATURE_CHANGE__SPAN:
				return basicGetSpan() != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == SpanId.class) {
			switch (derivedFeatureID) {
				case TracesPackage.FEATURE_CHANGE__TRACE_ID: return TracesPackage.SPAN_ID__TRACE_ID;
				case TracesPackage.FEATURE_CHANGE__SPAN_ID: return TracesPackage.SPAN_ID__SPAN_ID;
				default: return -1;
			}
		}
		if (baseClass == SpanReference.class) {
			switch (derivedFeatureID) {
				case TracesPackage.FEATURE_CHANGE__SPAN: return TracesPackage.SPAN_REFERENCE__SPAN;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == SpanId.class) {
			switch (baseFeatureID) {
				case TracesPackage.SPAN_ID__TRACE_ID: return TracesPackage.FEATURE_CHANGE__TRACE_ID;
				case TracesPackage.SPAN_ID__SPAN_ID: return TracesPackage.FEATURE_CHANGE__SPAN_ID;
				default: return -1;
			}
		}
		if (baseClass == SpanReference.class) {
			switch (baseFeatureID) {
				case TracesPackage.SPAN_REFERENCE__SPAN: return TracesPackage.FEATURE_CHANGE__SPAN;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //FeatureChangeImpl
