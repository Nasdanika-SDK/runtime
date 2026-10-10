/**
 */
package org.nasdanika.sdk.runtime.models.telemetry.traces;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Span Id</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.telemetry.traces.SpanId#getTraceId <em>Trace Id</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.telemetry.traces.SpanId#getSpanId <em>Span Id</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.sdk.runtime.models.telemetry.traces.TracesPackage#getSpanId()
 * @model
 * @generated
 */
public interface SpanId extends EObject {
	/**
	 * Returns the value of the '<em><b>Trace Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * A unique identifier for a trace. All spans from the same trace share the same trace_id.
	 * The ID is a 16-byte array.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Trace Id</em>' attribute.
	 * @see #setTraceId(String)
	 * @see org.nasdanika.sdk.runtime.models.telemetry.traces.TracesPackage#getSpanId_TraceId()
	 * @model unique="false"
	 * @generated
	 */
	String getTraceId();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.telemetry.traces.SpanId#getTraceId <em>Trace Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trace Id</em>' attribute.
	 * @see #getTraceId()
	 * @generated
	 */
	void setTraceId(String value);

	/**
	 * Returns the value of the '<em><b>Span Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * A unique identifier for a span within a trace, assigned when the span is created.
	 * The ID is an 8-byte array.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Span Id</em>' attribute.
	 * @see #setSpanId(String)
	 * @see org.nasdanika.sdk.runtime.models.telemetry.traces.TracesPackage#getSpanId_SpanId()
	 * @model unique="false"
	 * @generated
	 */
	String getSpanId();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.telemetry.traces.SpanId#getSpanId <em>Span Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Span Id</em>' attribute.
	 * @see #getSpanId()
	 * @generated
	 */
	void setSpanId(String value);

} // SpanId
