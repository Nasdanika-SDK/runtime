/**
 */
package org.nasdanika.sdk.runtime.models.telemetry.traces.impl;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.nasdanika.sdk.runtime.models.telemetry.traces.Span;
import org.nasdanika.sdk.runtime.models.telemetry.traces.SpanReference;
import org.nasdanika.sdk.runtime.models.telemetry.traces.TracesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Span Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.telemetry.traces.impl.SpanReferenceImpl#getSpan <em>Span</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SpanReferenceImpl extends SpanIdImpl implements SpanReference {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpanReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TracesPackage.Literals.SPAN_REFERENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Span getSpan() {
		return (Span)eDynamicGet(TracesPackage.SPAN_REFERENCE__SPAN, TracesPackage.Literals.SPAN_REFERENCE__SPAN, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Span basicGetSpan() {
		return (Span)eDynamicGet(TracesPackage.SPAN_REFERENCE__SPAN, TracesPackage.Literals.SPAN_REFERENCE__SPAN, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSpan(Span newSpan, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newSpan, TracesPackage.SPAN_REFERENCE__SPAN, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpan(Span newSpan) {
		eDynamicSet(TracesPackage.SPAN_REFERENCE__SPAN, TracesPackage.Literals.SPAN_REFERENCE__SPAN, newSpan);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TracesPackage.SPAN_REFERENCE__SPAN:
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
			case TracesPackage.SPAN_REFERENCE__SPAN:
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
			case TracesPackage.SPAN_REFERENCE__SPAN:
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
			case TracesPackage.SPAN_REFERENCE__SPAN:
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
			case TracesPackage.SPAN_REFERENCE__SPAN:
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
			case TracesPackage.SPAN_REFERENCE__SPAN:
				return basicGetSpan() != null;
		}
		return super.eIsSet(featureID);
	}

} //SpanReferenceImpl
