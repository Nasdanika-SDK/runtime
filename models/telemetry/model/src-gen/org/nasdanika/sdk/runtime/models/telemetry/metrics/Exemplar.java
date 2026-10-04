/**
 */
package org.nasdanika.sdk.runtime.models.telemetry.metrics;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.nasdanika.sdk.runtime.models.telemetry.KeyValue;

import org.nasdanika.sdk.runtime.models.telemetry.traces.Span;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Exemplar</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * *
 * A representation of an exemplar, which is a sample input measurement. Exemplars also hold information about the environment when the measurement was recorded, for example the span and trace ID of the active span when the exemplar was recorded.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.telemetry.metrics.Exemplar#getFilteredAttributes <em>Filtered Attributes</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.telemetry.metrics.Exemplar#getTimeUnixNano <em>Time Unix Nano</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.telemetry.metrics.Exemplar#getAsDouble <em>As Double</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.telemetry.metrics.Exemplar#getAsInt <em>As Int</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.telemetry.metrics.Exemplar#getSpanId <em>Span Id</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.telemetry.metrics.Exemplar#getTraceId <em>Trace Id</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.telemetry.metrics.Exemplar#getSpan <em>Span</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.sdk.runtime.models.telemetry.metrics.MetricsPackage#getExemplar()
 * @model
 * @generated
 */
public interface Exemplar extends EObject {
	/**
	 * Returns the value of the '<em><b>Filtered Attributes</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.sdk.runtime.models.telemetry.KeyValue}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * The set of key/value pairs that were filtered out by the aggregator, but recorded alongside the original measurement.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Filtered Attributes</em>' containment reference list.
	 * @see org.nasdanika.sdk.runtime.models.telemetry.metrics.MetricsPackage#getExemplar_FilteredAttributes()
	 * @model containment="true"
	 * @generated
	 */
	EList<KeyValue> getFilteredAttributes();

	/**
	 * Returns the value of the '<em><b>Time Unix Nano</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Unix Nano</em>' attribute.
	 * @see #setTimeUnixNano(long)
	 * @see org.nasdanika.sdk.runtime.models.telemetry.metrics.MetricsPackage#getExemplar_TimeUnixNano()
	 * @model unique="false"
	 * @generated
	 */
	long getTimeUnixNano();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.telemetry.metrics.Exemplar#getTimeUnixNano <em>Time Unix Nano</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Unix Nano</em>' attribute.
	 * @see #getTimeUnixNano()
	 * @generated
	 */
	void setTimeUnixNano(long value);

	/**
	 * Returns the value of the '<em><b>As Double</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>As Double</em>' attribute.
	 * @see #setAsDouble(Double)
	 * @see org.nasdanika.sdk.runtime.models.telemetry.metrics.MetricsPackage#getExemplar_AsDouble()
	 * @model unique="false"
	 * @generated
	 */
	Double getAsDouble();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.telemetry.metrics.Exemplar#getAsDouble <em>As Double</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>As Double</em>' attribute.
	 * @see #getAsDouble()
	 * @generated
	 */
	void setAsDouble(Double value);

	/**
	 * Returns the value of the '<em><b>As Int</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>As Int</em>' attribute.
	 * @see #setAsInt(Long)
	 * @see org.nasdanika.sdk.runtime.models.telemetry.metrics.MetricsPackage#getExemplar_AsInt()
	 * @model unique="false"
	 * @generated
	 */
	Long getAsInt();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.telemetry.metrics.Exemplar#getAsInt <em>As Int</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>As Int</em>' attribute.
	 * @see #getAsInt()
	 * @generated
	 */
	void setAsInt(Long value);

	/**
	 * Returns the value of the '<em><b>Span Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * (Optional) Span ID of the exemplar trace. span_id may be missing if the measurement is not recorded inside a trace or if the trace is not sampled.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Span Id</em>' attribute.
	 * @see #setSpanId(String)
	 * @see org.nasdanika.sdk.runtime.models.telemetry.metrics.MetricsPackage#getExemplar_SpanId()
	 * @model unique="false"
	 * @generated
	 */
	String getSpanId();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.telemetry.metrics.Exemplar#getSpanId <em>Span Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Span Id</em>' attribute.
	 * @see #getSpanId()
	 * @generated
	 */
	void setSpanId(String value);

	/**
	 * Returns the value of the '<em><b>Trace Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * (Optional) Trace ID of the exemplar trace.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Trace Id</em>' attribute.
	 * @see #setTraceId(String)
	 * @see org.nasdanika.sdk.runtime.models.telemetry.metrics.MetricsPackage#getExemplar_TraceId()
	 * @model unique="false"
	 * @generated
	 */
	String getTraceId();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.telemetry.metrics.Exemplar#getTraceId <em>Trace Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trace Id</em>' attribute.
	 * @see #getTraceId()
	 * @generated
	 */
	void setTraceId(String value);

	/**
	 * Returns the value of the '<em><b>Span</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Span</em>' reference.
	 * @see #setSpan(Span)
	 * @see org.nasdanika.sdk.runtime.models.telemetry.metrics.MetricsPackage#getExemplar_Span()
	 * @model
	 * @generated
	 */
	Span getSpan();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.telemetry.metrics.Exemplar#getSpan <em>Span</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Span</em>' reference.
	 * @see #getSpan()
	 * @generated
	 */
	void setSpan(Span value);

} // Exemplar
