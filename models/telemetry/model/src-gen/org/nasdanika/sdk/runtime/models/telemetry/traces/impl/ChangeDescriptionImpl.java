/**
 */
package org.nasdanika.sdk.runtime.models.telemetry.traces.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.sdk.runtime.models.telemetry.traces.ChangeDescription;
import org.nasdanika.sdk.runtime.models.telemetry.traces.Span;
import org.nasdanika.sdk.runtime.models.telemetry.traces.SpanId;
import org.nasdanika.sdk.runtime.models.telemetry.traces.SpanReference;
import org.nasdanika.sdk.runtime.models.telemetry.traces.TracesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Change Description</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.telemetry.traces.impl.ChangeDescriptionImpl#getTraceId <em>Trace Id</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.telemetry.traces.impl.ChangeDescriptionImpl#getSpanId <em>Span Id</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.telemetry.traces.impl.ChangeDescriptionImpl#getSpan <em>Span</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.telemetry.traces.impl.ChangeDescriptionImpl#getRemovedObjects <em>Removed Objects</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ChangeDescriptionImpl extends org.eclipse.emf.ecore.change.impl.ChangeDescriptionImpl implements ChangeDescription {
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
	protected ChangeDescriptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TracesPackage.Literals.CHANGE_DESCRIPTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int ESTATIC_FEATURE_COUNT = 4;

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
		return (String)eDynamicGet(TracesPackage.CHANGE_DESCRIPTION__TRACE_ID - ESTATIC_FEATURE_COUNT, TracesPackage.Literals.SPAN_ID__TRACE_ID, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTraceId(String newTraceId) {
		eDynamicSet(TracesPackage.CHANGE_DESCRIPTION__TRACE_ID - ESTATIC_FEATURE_COUNT, TracesPackage.Literals.SPAN_ID__TRACE_ID, newTraceId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSpanId() {
		return (String)eDynamicGet(TracesPackage.CHANGE_DESCRIPTION__SPAN_ID - ESTATIC_FEATURE_COUNT, TracesPackage.Literals.SPAN_ID__SPAN_ID, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpanId(String newSpanId) {
		eDynamicSet(TracesPackage.CHANGE_DESCRIPTION__SPAN_ID - ESTATIC_FEATURE_COUNT, TracesPackage.Literals.SPAN_ID__SPAN_ID, newSpanId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Span getSpan() {
		return (Span)eDynamicGet(TracesPackage.CHANGE_DESCRIPTION__SPAN - ESTATIC_FEATURE_COUNT, TracesPackage.Literals.SPAN_REFERENCE__SPAN, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Span basicGetSpan() {
		return (Span)eDynamicGet(TracesPackage.CHANGE_DESCRIPTION__SPAN - ESTATIC_FEATURE_COUNT, TracesPackage.Literals.SPAN_REFERENCE__SPAN, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSpan(Span newSpan, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newSpan, TracesPackage.CHANGE_DESCRIPTION__SPAN, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpan(Span newSpan) {
		eDynamicSet(TracesPackage.CHANGE_DESCRIPTION__SPAN - ESTATIC_FEATURE_COUNT, TracesPackage.Literals.SPAN_REFERENCE__SPAN, newSpan);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<EObject> getRemovedObjects() {
		return (EList<EObject>)eDynamicGet(TracesPackage.CHANGE_DESCRIPTION__REMOVED_OBJECTS - ESTATIC_FEATURE_COUNT, TracesPackage.Literals.CHANGE_DESCRIPTION__REMOVED_OBJECTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TracesPackage.CHANGE_DESCRIPTION__SPAN:
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
			case TracesPackage.CHANGE_DESCRIPTION__SPAN:
				return basicSetSpan(null, msgs);
			case TracesPackage.CHANGE_DESCRIPTION__REMOVED_OBJECTS:
				return ((InternalEList<?>)getRemovedObjects()).basicRemove(otherEnd, msgs);
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
			case TracesPackage.CHANGE_DESCRIPTION__TRACE_ID:
				return getTraceId();
			case TracesPackage.CHANGE_DESCRIPTION__SPAN_ID:
				return getSpanId();
			case TracesPackage.CHANGE_DESCRIPTION__SPAN:
				if (resolve) return getSpan();
				return basicGetSpan();
			case TracesPackage.CHANGE_DESCRIPTION__REMOVED_OBJECTS:
				return getRemovedObjects();
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
			case TracesPackage.CHANGE_DESCRIPTION__TRACE_ID:
				setTraceId((String)newValue);
				return;
			case TracesPackage.CHANGE_DESCRIPTION__SPAN_ID:
				setSpanId((String)newValue);
				return;
			case TracesPackage.CHANGE_DESCRIPTION__SPAN:
				setSpan((Span)newValue);
				return;
			case TracesPackage.CHANGE_DESCRIPTION__REMOVED_OBJECTS:
				getRemovedObjects().clear();
				getRemovedObjects().addAll((Collection<? extends EObject>)newValue);
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
			case TracesPackage.CHANGE_DESCRIPTION__TRACE_ID:
				setTraceId(TRACE_ID_EDEFAULT);
				return;
			case TracesPackage.CHANGE_DESCRIPTION__SPAN_ID:
				setSpanId(SPAN_ID_EDEFAULT);
				return;
			case TracesPackage.CHANGE_DESCRIPTION__SPAN:
				setSpan((Span)null);
				return;
			case TracesPackage.CHANGE_DESCRIPTION__REMOVED_OBJECTS:
				getRemovedObjects().clear();
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
			case TracesPackage.CHANGE_DESCRIPTION__TRACE_ID:
				return TRACE_ID_EDEFAULT == null ? getTraceId() != null : !TRACE_ID_EDEFAULT.equals(getTraceId());
			case TracesPackage.CHANGE_DESCRIPTION__SPAN_ID:
				return SPAN_ID_EDEFAULT == null ? getSpanId() != null : !SPAN_ID_EDEFAULT.equals(getSpanId());
			case TracesPackage.CHANGE_DESCRIPTION__SPAN:
				return basicGetSpan() != null;
			case TracesPackage.CHANGE_DESCRIPTION__REMOVED_OBJECTS:
				return !getRemovedObjects().isEmpty();
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
				case TracesPackage.CHANGE_DESCRIPTION__TRACE_ID: return TracesPackage.SPAN_ID__TRACE_ID;
				case TracesPackage.CHANGE_DESCRIPTION__SPAN_ID: return TracesPackage.SPAN_ID__SPAN_ID;
				default: return -1;
			}
		}
		if (baseClass == SpanReference.class) {
			switch (derivedFeatureID) {
				case TracesPackage.CHANGE_DESCRIPTION__SPAN: return TracesPackage.SPAN_REFERENCE__SPAN;
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
				case TracesPackage.SPAN_ID__TRACE_ID: return TracesPackage.CHANGE_DESCRIPTION__TRACE_ID;
				case TracesPackage.SPAN_ID__SPAN_ID: return TracesPackage.CHANGE_DESCRIPTION__SPAN_ID;
				default: return -1;
			}
		}
		if (baseClass == SpanReference.class) {
			switch (baseFeatureID) {
				case TracesPackage.SPAN_REFERENCE__SPAN: return TracesPackage.CHANGE_DESCRIPTION__SPAN;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //ChangeDescriptionImpl
