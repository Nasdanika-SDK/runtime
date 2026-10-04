/**
 */
package org.nasdanika.sdk.runtime.models.telemetry.traces.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.nasdanika.sdk.runtime.models.telemetry.traces.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TracesFactoryImpl extends EFactoryImpl implements TracesFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TracesFactory init() {
		try {
			TracesFactory theTracesFactory = (TracesFactory)EPackage.Registry.INSTANCE.getEFactory(TracesPackage.eNS_URI);
			if (theTracesFactory != null) {
				return theTracesFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new TracesFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracesFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case TracesPackage.TRACES_DATA: return createTracesData();
			case TracesPackage.RESOURCE_SPANS: return createResourceSpans();
			case TracesPackage.SCOPE_SPANS: return createScopeSpans();
			case TracesPackage.SPAN: return createSpan();
			case TracesPackage.SPAN_EVENT: return createSpanEvent();
			case TracesPackage.SPAN_LINK: return createSpanLink();
			case TracesPackage.SPAN_STATUS: return createSpanStatus();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case TracesPackage.SPAN_KIND:
				return createSpanKindFromString(eDataType, initialValue);
			case TracesPackage.STATUS_CODE:
				return createStatusCodeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case TracesPackage.SPAN_KIND:
				return convertSpanKindToString(eDataType, instanceValue);
			case TracesPackage.STATUS_CODE:
				return convertStatusCodeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracesData createTracesData() {
		TracesDataImpl tracesData = new TracesDataImpl();
		return tracesData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceSpans createResourceSpans() {
		ResourceSpansImpl resourceSpans = new ResourceSpansImpl();
		return resourceSpans;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScopeSpans createScopeSpans() {
		ScopeSpansImpl scopeSpans = new ScopeSpansImpl();
		return scopeSpans;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Span createSpan() {
		SpanImpl span = new SpanImpl();
		return span;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpanEvent createSpanEvent() {
		SpanEventImpl spanEvent = new SpanEventImpl();
		return spanEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpanLink createSpanLink() {
		SpanLinkImpl spanLink = new SpanLinkImpl();
		return spanLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpanStatus createSpanStatus() {
		SpanStatusImpl spanStatus = new SpanStatusImpl();
		return spanStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpanKind createSpanKindFromString(EDataType eDataType, String initialValue) {
		SpanKind result = SpanKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSpanKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatusCode createStatusCodeFromString(EDataType eDataType, String initialValue) {
		StatusCode result = StatusCode.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStatusCodeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracesPackage getTracesPackage() {
		return (TracesPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static TracesPackage getPackage() {
		return TracesPackage.eINSTANCE;
	}

} //TracesFactoryImpl
