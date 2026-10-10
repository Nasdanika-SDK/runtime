/**
 */
package org.nasdanika.sdk.runtime.models.telemetry.traces;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.change.ChangeDescription;

import org.nasdanika.sdk.runtime.models.telemetry.KeyValue;

import org.nasdanika.sdk.runtime.models.telemetry.logs.LogRecord;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Span</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * *
 * A Span represents a single operation performed by a single component of the system.
 * The next available field id is 17.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.telemetry.traces.Span#getTraceState <em>Trace State</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.telemetry.traces.Span#getParentSpanId <em>Parent Span Id</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.telemetry.traces.Span#getName <em>Name</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.telemetry.traces.Span#getKind <em>Kind</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.telemetry.traces.Span#getStartTimeUnixNano <em>Start Time Unix Nano</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.telemetry.traces.Span#getEndTimeUnixNano <em>End Time Unix Nano</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.telemetry.traces.Span#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.telemetry.traces.Span#getDroppedAttributesCount <em>Dropped Attributes Count</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.telemetry.traces.Span#getEvents <em>Events</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.telemetry.traces.Span#getDroppedEventsCount <em>Dropped Events Count</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.telemetry.traces.Span#getLinks <em>Links</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.telemetry.traces.Span#getDroppedLinksCount <em>Dropped Links Count</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.telemetry.traces.Span#getStatus <em>Status</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.telemetry.traces.Span#getFlags <em>Flags</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.telemetry.traces.Span#getChangeDescription <em>Change Description</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.telemetry.traces.Span#getLogRecords <em>Log Records</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.telemetry.traces.Span#getChildren <em>Children</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.telemetry.traces.Span#getReferrers <em>Referrers</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.sdk.runtime.models.telemetry.traces.TracesPackage#getSpan()
 * @model
 * @generated
 */
public interface Span extends SpanId {
	/**
	 * Returns the value of the '<em><b>Trace State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * trace_state conveys information about request position in multiple distributed tracing graphs. It is a vendor-specific format as described by the W3C Trace Context specification.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Trace State</em>' attribute.
	 * @see #setTraceState(String)
	 * @see org.nasdanika.sdk.runtime.models.telemetry.traces.TracesPackage#getSpan_TraceState()
	 * @model unique="false"
	 * @generated
	 */
	String getTraceState();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.telemetry.traces.Span#getTraceState <em>Trace State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trace State</em>' attribute.
	 * @see #getTraceState()
	 * @generated
	 */
	void setTraceState(String value);

	/**
	 * Returns the value of the '<em><b>Parent Span Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * The span_id of this span's parent span. If this is a root span, then this field must be empty. The ID is an 8-byte array.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parent Span Id</em>' attribute.
	 * @see #setParentSpanId(String)
	 * @see org.nasdanika.sdk.runtime.models.telemetry.traces.TracesPackage#getSpan_ParentSpanId()
	 * @model unique="false"
	 * @generated
	 */
	String getParentSpanId();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.telemetry.traces.Span#getParentSpanId <em>Parent Span Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Span Id</em>' attribute.
	 * @see #getParentSpanId()
	 * @generated
	 */
	void setParentSpanId(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * A description of the span's operation.
	 * For example, the name can be a qualified method name or a file name and a line number where the operation is called. A best practice is to use the same display name at the same call point repeatably, so that users can filter and group spans based on the name.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.nasdanika.sdk.runtime.models.telemetry.traces.TracesPackage#getSpan_Name()
	 * @model unique="false" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.telemetry.traces.Span#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link org.nasdanika.sdk.runtime.models.telemetry.traces.SpanKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Distinguishes between spans generated in a particular context.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see org.nasdanika.sdk.runtime.models.telemetry.traces.SpanKind
	 * @see #setKind(SpanKind)
	 * @see org.nasdanika.sdk.runtime.models.telemetry.traces.TracesPackage#getSpan_Kind()
	 * @model unique="false"
	 * @generated
	 */
	SpanKind getKind();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.telemetry.traces.Span#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see org.nasdanika.sdk.runtime.models.telemetry.traces.SpanKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(SpanKind value);

	/**
	 * Returns the value of the '<em><b>Start Time Unix Nano</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * start_time_unix_nano is the start time of the span. On the client side, this is the time kept by the local machine where the span execution starts. On the server side, this is the time when the server's application handler starts running.
	 * Value is UNIX Epoch time in nanoseconds since 00:00:00 UTC on 1 January 1970.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Start Time Unix Nano</em>' attribute.
	 * @see #setStartTimeUnixNano(long)
	 * @see org.nasdanika.sdk.runtime.models.telemetry.traces.TracesPackage#getSpan_StartTimeUnixNano()
	 * @model unique="false"
	 * @generated
	 */
	long getStartTimeUnixNano();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.telemetry.traces.Span#getStartTimeUnixNano <em>Start Time Unix Nano</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Time Unix Nano</em>' attribute.
	 * @see #getStartTimeUnixNano()
	 * @generated
	 */
	void setStartTimeUnixNano(long value);

	/**
	 * Returns the value of the '<em><b>End Time Unix Nano</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * end_time_unix_nano is the end time of the span. On the client side, this is the time kept by the local machine where the span execution ends. On the server side, this is the time when the server application handler stops running.
	 * Value is UNIX Epoch time in nanoseconds since 00:00:00 UTC on 1 January 1970.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>End Time Unix Nano</em>' attribute.
	 * @see #setEndTimeUnixNano(long)
	 * @see org.nasdanika.sdk.runtime.models.telemetry.traces.TracesPackage#getSpan_EndTimeUnixNano()
	 * @model unique="false"
	 * @generated
	 */
	long getEndTimeUnixNano();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.telemetry.traces.Span#getEndTimeUnixNano <em>End Time Unix Nano</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Time Unix Nano</em>' attribute.
	 * @see #getEndTimeUnixNano()
	 * @generated
	 */
	void setEndTimeUnixNano(long value);

	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.sdk.runtime.models.telemetry.KeyValue}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * attributes is a collection of key/value pairs. Note, global attributes like server name can be set using the resource API.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Attributes</em>' containment reference list.
	 * @see org.nasdanika.sdk.runtime.models.telemetry.traces.TracesPackage#getSpan_Attributes()
	 * @model containment="true"
	 * @generated
	 */
	EList<KeyValue> getAttributes();

	/**
	 * Returns the value of the '<em><b>Dropped Attributes Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dropped Attributes Count</em>' attribute.
	 * @see #setDroppedAttributesCount(int)
	 * @see org.nasdanika.sdk.runtime.models.telemetry.traces.TracesPackage#getSpan_DroppedAttributesCount()
	 * @model unique="false"
	 * @generated
	 */
	int getDroppedAttributesCount();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.telemetry.traces.Span#getDroppedAttributesCount <em>Dropped Attributes Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dropped Attributes Count</em>' attribute.
	 * @see #getDroppedAttributesCount()
	 * @generated
	 */
	void setDroppedAttributesCount(int value);

	/**
	 * Returns the value of the '<em><b>Events</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.sdk.runtime.models.telemetry.traces.SpanEvent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * events is a collection of Event items.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Events</em>' containment reference list.
	 * @see org.nasdanika.sdk.runtime.models.telemetry.traces.TracesPackage#getSpan_Events()
	 * @model containment="true"
	 * @generated
	 */
	EList<SpanEvent> getEvents();

	/**
	 * Returns the value of the '<em><b>Dropped Events Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dropped Events Count</em>' attribute.
	 * @see #setDroppedEventsCount(int)
	 * @see org.nasdanika.sdk.runtime.models.telemetry.traces.TracesPackage#getSpan_DroppedEventsCount()
	 * @model unique="false"
	 * @generated
	 */
	int getDroppedEventsCount();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.telemetry.traces.Span#getDroppedEventsCount <em>Dropped Events Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dropped Events Count</em>' attribute.
	 * @see #getDroppedEventsCount()
	 * @generated
	 */
	void setDroppedEventsCount(int value);

	/**
	 * Returns the value of the '<em><b>Links</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.sdk.runtime.models.telemetry.traces.SpanLink}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * links is a collection of Links, which are references from this span to a span in the same or different trace.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Links</em>' containment reference list.
	 * @see org.nasdanika.sdk.runtime.models.telemetry.traces.TracesPackage#getSpan_Links()
	 * @model containment="true"
	 * @generated
	 */
	EList<SpanLink> getLinks();

	/**
	 * Returns the value of the '<em><b>Dropped Links Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dropped Links Count</em>' attribute.
	 * @see #setDroppedLinksCount(int)
	 * @see org.nasdanika.sdk.runtime.models.telemetry.traces.TracesPackage#getSpan_DroppedLinksCount()
	 * @model unique="false"
	 * @generated
	 */
	int getDroppedLinksCount();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.telemetry.traces.Span#getDroppedLinksCount <em>Dropped Links Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dropped Links Count</em>' attribute.
	 * @see #getDroppedLinksCount()
	 * @generated
	 */
	void setDroppedLinksCount(int value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * An optional final status for this span. Semantically when Status isn't set, it means span's status code is unset, i.e. assume STATUS_CODE_UNSET (code = 0).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Status</em>' containment reference.
	 * @see #setStatus(SpanStatus)
	 * @see org.nasdanika.sdk.runtime.models.telemetry.traces.TracesPackage#getSpan_Status()
	 * @model containment="true"
	 * @generated
	 */
	SpanStatus getStatus();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.telemetry.traces.Span#getStatus <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' containment reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(SpanStatus value);

	/**
	 * Returns the value of the '<em><b>Flags</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Flags, a bit field. 8 least significant bits are the trace flags as defined in W3C Trace Context specification.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Flags</em>' attribute.
	 * @see #setFlags(int)
	 * @see org.nasdanika.sdk.runtime.models.telemetry.traces.TracesPackage#getSpan_Flags()
	 * @model unique="false"
	 * @generated
	 */
	int getFlags();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.telemetry.traces.Span#getFlags <em>Flags</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Flags</em>' attribute.
	 * @see #getFlags()
	 * @generated
	 */
	void setFlags(int value);

	/**
	 * Returns the value of the '<em><b>Change Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Change Description</em>' containment reference.
	 * @see #setChangeDescription(ChangeDescription)
	 * @see org.nasdanika.sdk.runtime.models.telemetry.traces.TracesPackage#getSpan_ChangeDescription()
	 * @model containment="true"
	 * @generated
	 */
	ChangeDescription getChangeDescription();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.telemetry.traces.Span#getChangeDescription <em>Change Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Change Description</em>' containment reference.
	 * @see #getChangeDescription()
	 * @generated
	 */
	void setChangeDescription(ChangeDescription value);

	/**
	 * Returns the value of the '<em><b>Log Records</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.sdk.runtime.models.telemetry.logs.LogRecord}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Log Records</em>' containment reference list.
	 * @see org.nasdanika.sdk.runtime.models.telemetry.traces.TracesPackage#getSpan_LogRecords()
	 * @model containment="true"
	 * @generated
	 */
	EList<LogRecord> getLogRecords();

	/**
	 * Returns the value of the '<em><b>Children</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.sdk.runtime.models.telemetry.traces.Span}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children</em>' containment reference list.
	 * @see org.nasdanika.sdk.runtime.models.telemetry.traces.TracesPackage#getSpan_Children()
	 * @model containment="true" keys="traceId spanId"
	 * @generated
	 */
	EList<Span> getChildren();

	/**
	 * Returns the value of the '<em><b>Referrers</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.sdk.runtime.models.telemetry.traces.SpanReference}.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.sdk.runtime.models.telemetry.traces.SpanReference#getSpan <em>Span</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referrers</em>' reference list.
	 * @see org.nasdanika.sdk.runtime.models.telemetry.traces.TracesPackage#getSpan_Referrers()
	 * @see org.nasdanika.sdk.runtime.models.telemetry.traces.SpanReference#getSpan
	 * @model opposite="span"
	 * @generated
	 */
	EList<SpanReference> getReferrers();

} // Span
