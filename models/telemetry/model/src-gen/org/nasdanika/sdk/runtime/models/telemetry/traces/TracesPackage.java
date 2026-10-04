/**
 */
package org.nasdanika.sdk.runtime.models.telemetry.traces;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.nasdanika.sdk.runtime.models.telemetry.traces.TracesFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel modelDirectory='/org.nasdanika.sdk.runtime.models.telemetry.model/src-gen' featureDelegation='Dynamic' complianceLevel='25' suppressGenModelAnnotations='false' copyrightFields='false' operationReflection='true' importOrganizing='true' basePackage='org.nasdanika.sdk.runtime.models.telemetry'"
 *        annotation="http://www.eclipse.org/emf/2011/Xcore Ecore='http://www.eclipse.org/emf/2002/Ecore' GenModel='http://www.eclipse.org/emf/2002/GenModel' Nasdanika='urn:org.nasdanika'"
 * @generated
 */
public interface TracesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "traces";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "https://runtime.sdk.nasdanika.org/models/telemetry/traces";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.nasdanika.sdk.runtime.models.telemetry.traces";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TracesPackage eINSTANCE = org.nasdanika.sdk.runtime.models.telemetry.traces.impl.TracesPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.telemetry.traces.impl.TracesDataImpl <em>Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.telemetry.traces.impl.TracesDataImpl
	 * @see org.nasdanika.sdk.runtime.models.telemetry.traces.impl.TracesPackageImpl#getTracesData()
	 * @generated
	 */
	int TRACES_DATA = 0;

	/**
	 * The feature id for the '<em><b>Resource Spans</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACES_DATA__RESOURCE_SPANS = 0;

	/**
	 * The number of structural features of the '<em>Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACES_DATA_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACES_DATA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.telemetry.traces.impl.ResourceSpansImpl <em>Resource Spans</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.telemetry.traces.impl.ResourceSpansImpl
	 * @see org.nasdanika.sdk.runtime.models.telemetry.traces.impl.TracesPackageImpl#getResourceSpans()
	 * @generated
	 */
	int RESOURCE_SPANS = 1;

	/**
	 * The feature id for the '<em><b>Resource</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_SPANS__RESOURCE = 0;

	/**
	 * The feature id for the '<em><b>Scope Spans</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_SPANS__SCOPE_SPANS = 1;

	/**
	 * The feature id for the '<em><b>Schema Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_SPANS__SCHEMA_URL = 2;

	/**
	 * The number of structural features of the '<em>Resource Spans</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_SPANS_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Resource Spans</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_SPANS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.telemetry.traces.impl.ScopeSpansImpl <em>Scope Spans</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.telemetry.traces.impl.ScopeSpansImpl
	 * @see org.nasdanika.sdk.runtime.models.telemetry.traces.impl.TracesPackageImpl#getScopeSpans()
	 * @generated
	 */
	int SCOPE_SPANS = 2;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE_SPANS__SCOPE = 0;

	/**
	 * The feature id for the '<em><b>Spans</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE_SPANS__SPANS = 1;

	/**
	 * The feature id for the '<em><b>Schema Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE_SPANS__SCHEMA_URL = 2;

	/**
	 * The number of structural features of the '<em>Scope Spans</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE_SPANS_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Scope Spans</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE_SPANS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.telemetry.traces.impl.SpanImpl <em>Span</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.telemetry.traces.impl.SpanImpl
	 * @see org.nasdanika.sdk.runtime.models.telemetry.traces.impl.TracesPackageImpl#getSpan()
	 * @generated
	 */
	int SPAN = 3;

	/**
	 * The feature id for the '<em><b>Trace Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPAN__TRACE_ID = 0;

	/**
	 * The feature id for the '<em><b>Span Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPAN__SPAN_ID = 1;

	/**
	 * The feature id for the '<em><b>Trace State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPAN__TRACE_STATE = 2;

	/**
	 * The feature id for the '<em><b>Parent Span Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPAN__PARENT_SPAN_ID = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPAN__NAME = 4;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPAN__KIND = 5;

	/**
	 * The feature id for the '<em><b>Start Time Unix Nano</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPAN__START_TIME_UNIX_NANO = 6;

	/**
	 * The feature id for the '<em><b>End Time Unix Nano</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPAN__END_TIME_UNIX_NANO = 7;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPAN__ATTRIBUTES = 8;

	/**
	 * The feature id for the '<em><b>Dropped Attributes Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPAN__DROPPED_ATTRIBUTES_COUNT = 9;

	/**
	 * The feature id for the '<em><b>Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPAN__EVENTS = 10;

	/**
	 * The feature id for the '<em><b>Dropped Events Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPAN__DROPPED_EVENTS_COUNT = 11;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPAN__LINKS = 12;

	/**
	 * The feature id for the '<em><b>Dropped Links Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPAN__DROPPED_LINKS_COUNT = 13;

	/**
	 * The feature id for the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPAN__STATUS = 14;

	/**
	 * The feature id for the '<em><b>Flags</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPAN__FLAGS = 15;

	/**
	 * The feature id for the '<em><b>Change Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPAN__CHANGE_DESCRIPTION = 16;

	/**
	 * The feature id for the '<em><b>Log Records</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPAN__LOG_RECORDS = 17;

	/**
	 * The number of structural features of the '<em>Span</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPAN_FEATURE_COUNT = 18;

	/**
	 * The number of operations of the '<em>Span</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPAN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.telemetry.traces.impl.SpanEventImpl <em>Span Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.telemetry.traces.impl.SpanEventImpl
	 * @see org.nasdanika.sdk.runtime.models.telemetry.traces.impl.TracesPackageImpl#getSpanEvent()
	 * @generated
	 */
	int SPAN_EVENT = 4;

	/**
	 * The feature id for the '<em><b>Time Unix Nano</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPAN_EVENT__TIME_UNIX_NANO = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPAN_EVENT__NAME = 1;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPAN_EVENT__ATTRIBUTES = 2;

	/**
	 * The feature id for the '<em><b>Dropped Attributes Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPAN_EVENT__DROPPED_ATTRIBUTES_COUNT = 3;

	/**
	 * The number of structural features of the '<em>Span Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPAN_EVENT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Span Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPAN_EVENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.telemetry.traces.impl.SpanLinkImpl <em>Span Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.telemetry.traces.impl.SpanLinkImpl
	 * @see org.nasdanika.sdk.runtime.models.telemetry.traces.impl.TracesPackageImpl#getSpanLink()
	 * @generated
	 */
	int SPAN_LINK = 5;

	/**
	 * The feature id for the '<em><b>Trace Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPAN_LINK__TRACE_ID = 0;

	/**
	 * The feature id for the '<em><b>Span Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPAN_LINK__SPAN_ID = 1;

	/**
	 * The feature id for the '<em><b>Trace State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPAN_LINK__TRACE_STATE = 2;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPAN_LINK__ATTRIBUTES = 3;

	/**
	 * The feature id for the '<em><b>Dropped Attributes Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPAN_LINK__DROPPED_ATTRIBUTES_COUNT = 4;

	/**
	 * The feature id for the '<em><b>Flags</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPAN_LINK__FLAGS = 5;

	/**
	 * The number of structural features of the '<em>Span Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPAN_LINK_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Span Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPAN_LINK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.telemetry.traces.impl.SpanStatusImpl <em>Span Status</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.telemetry.traces.impl.SpanStatusImpl
	 * @see org.nasdanika.sdk.runtime.models.telemetry.traces.impl.TracesPackageImpl#getSpanStatus()
	 * @generated
	 */
	int SPAN_STATUS = 6;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPAN_STATUS__MESSAGE = 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPAN_STATUS__CODE = 1;

	/**
	 * The number of structural features of the '<em>Span Status</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPAN_STATUS_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Span Status</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPAN_STATUS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.telemetry.traces.SpanKind <em>Span Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.telemetry.traces.SpanKind
	 * @see org.nasdanika.sdk.runtime.models.telemetry.traces.impl.TracesPackageImpl#getSpanKind()
	 * @generated
	 */
	int SPAN_KIND = 7;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.telemetry.traces.StatusCode <em>Status Code</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.telemetry.traces.StatusCode
	 * @see org.nasdanika.sdk.runtime.models.telemetry.traces.impl.TracesPackageImpl#getStatusCode()
	 * @generated
	 */
	int STATUS_CODE = 8;


	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.telemetry.traces.TracesData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data</em>'.
	 * @see org.nasdanika.sdk.runtime.models.telemetry.traces.TracesData
	 * @generated
	 */
	EClass getTracesData();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.sdk.runtime.models.telemetry.traces.TracesData#getResourceSpans <em>Resource Spans</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resource Spans</em>'.
	 * @see org.nasdanika.sdk.runtime.models.telemetry.traces.TracesData#getResourceSpans()
	 * @see #getTracesData()
	 * @generated
	 */
	EReference getTracesData_ResourceSpans();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.telemetry.traces.ResourceSpans <em>Resource Spans</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Spans</em>'.
	 * @see org.nasdanika.sdk.runtime.models.telemetry.traces.ResourceSpans
	 * @generated
	 */
	EClass getResourceSpans();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.sdk.runtime.models.telemetry.traces.ResourceSpans#getResource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Resource</em>'.
	 * @see org.nasdanika.sdk.runtime.models.telemetry.traces.ResourceSpans#getResource()
	 * @see #getResourceSpans()
	 * @generated
	 */
	EReference getResourceSpans_Resource();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.sdk.runtime.models.telemetry.traces.ResourceSpans#getScopeSpans <em>Scope Spans</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Scope Spans</em>'.
	 * @see org.nasdanika.sdk.runtime.models.telemetry.traces.ResourceSpans#getScopeSpans()
	 * @see #getResourceSpans()
	 * @generated
	 */
	EReference getResourceSpans_ScopeSpans();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.telemetry.traces.ResourceSpans#getSchemaUrl <em>Schema Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Schema Url</em>'.
	 * @see org.nasdanika.sdk.runtime.models.telemetry.traces.ResourceSpans#getSchemaUrl()
	 * @see #getResourceSpans()
	 * @generated
	 */
	EAttribute getResourceSpans_SchemaUrl();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.telemetry.traces.ScopeSpans <em>Scope Spans</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scope Spans</em>'.
	 * @see org.nasdanika.sdk.runtime.models.telemetry.traces.ScopeSpans
	 * @generated
	 */
	EClass getScopeSpans();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.sdk.runtime.models.telemetry.traces.ScopeSpans#getScope <em>Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Scope</em>'.
	 * @see org.nasdanika.sdk.runtime.models.telemetry.traces.ScopeSpans#getScope()
	 * @see #getScopeSpans()
	 * @generated
	 */
	EReference getScopeSpans_Scope();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.sdk.runtime.models.telemetry.traces.ScopeSpans#getSpans <em>Spans</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Spans</em>'.
	 * @see org.nasdanika.sdk.runtime.models.telemetry.traces.ScopeSpans#getSpans()
	 * @see #getScopeSpans()
	 * @generated
	 */
	EReference getScopeSpans_Spans();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.telemetry.traces.ScopeSpans#getSchemaUrl <em>Schema Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Schema Url</em>'.
	 * @see org.nasdanika.sdk.runtime.models.telemetry.traces.ScopeSpans#getSchemaUrl()
	 * @see #getScopeSpans()
	 * @generated
	 */
	EAttribute getScopeSpans_SchemaUrl();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.telemetry.traces.Span <em>Span</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Span</em>'.
	 * @see org.nasdanika.sdk.runtime.models.telemetry.traces.Span
	 * @generated
	 */
	EClass getSpan();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.telemetry.traces.Span#getTraceId <em>Trace Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Trace Id</em>'.
	 * @see org.nasdanika.sdk.runtime.models.telemetry.traces.Span#getTraceId()
	 * @see #getSpan()
	 * @generated
	 */
	EAttribute getSpan_TraceId();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.telemetry.traces.Span#getSpanId <em>Span Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Span Id</em>'.
	 * @see org.nasdanika.sdk.runtime.models.telemetry.traces.Span#getSpanId()
	 * @see #getSpan()
	 * @generated
	 */
	EAttribute getSpan_SpanId();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.telemetry.traces.Span#getTraceState <em>Trace State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Trace State</em>'.
	 * @see org.nasdanika.sdk.runtime.models.telemetry.traces.Span#getTraceState()
	 * @see #getSpan()
	 * @generated
	 */
	EAttribute getSpan_TraceState();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.telemetry.traces.Span#getParentSpanId <em>Parent Span Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parent Span Id</em>'.
	 * @see org.nasdanika.sdk.runtime.models.telemetry.traces.Span#getParentSpanId()
	 * @see #getSpan()
	 * @generated
	 */
	EAttribute getSpan_ParentSpanId();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.telemetry.traces.Span#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.nasdanika.sdk.runtime.models.telemetry.traces.Span#getName()
	 * @see #getSpan()
	 * @generated
	 */
	EAttribute getSpan_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.telemetry.traces.Span#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see org.nasdanika.sdk.runtime.models.telemetry.traces.Span#getKind()
	 * @see #getSpan()
	 * @generated
	 */
	EAttribute getSpan_Kind();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.telemetry.traces.Span#getStartTimeUnixNano <em>Start Time Unix Nano</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Time Unix Nano</em>'.
	 * @see org.nasdanika.sdk.runtime.models.telemetry.traces.Span#getStartTimeUnixNano()
	 * @see #getSpan()
	 * @generated
	 */
	EAttribute getSpan_StartTimeUnixNano();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.telemetry.traces.Span#getEndTimeUnixNano <em>End Time Unix Nano</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Time Unix Nano</em>'.
	 * @see org.nasdanika.sdk.runtime.models.telemetry.traces.Span#getEndTimeUnixNano()
	 * @see #getSpan()
	 * @generated
	 */
	EAttribute getSpan_EndTimeUnixNano();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.sdk.runtime.models.telemetry.traces.Span#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attributes</em>'.
	 * @see org.nasdanika.sdk.runtime.models.telemetry.traces.Span#getAttributes()
	 * @see #getSpan()
	 * @generated
	 */
	EReference getSpan_Attributes();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.telemetry.traces.Span#getDroppedAttributesCount <em>Dropped Attributes Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dropped Attributes Count</em>'.
	 * @see org.nasdanika.sdk.runtime.models.telemetry.traces.Span#getDroppedAttributesCount()
	 * @see #getSpan()
	 * @generated
	 */
	EAttribute getSpan_DroppedAttributesCount();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.sdk.runtime.models.telemetry.traces.Span#getEvents <em>Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Events</em>'.
	 * @see org.nasdanika.sdk.runtime.models.telemetry.traces.Span#getEvents()
	 * @see #getSpan()
	 * @generated
	 */
	EReference getSpan_Events();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.telemetry.traces.Span#getDroppedEventsCount <em>Dropped Events Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dropped Events Count</em>'.
	 * @see org.nasdanika.sdk.runtime.models.telemetry.traces.Span#getDroppedEventsCount()
	 * @see #getSpan()
	 * @generated
	 */
	EAttribute getSpan_DroppedEventsCount();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.sdk.runtime.models.telemetry.traces.Span#getLinks <em>Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Links</em>'.
	 * @see org.nasdanika.sdk.runtime.models.telemetry.traces.Span#getLinks()
	 * @see #getSpan()
	 * @generated
	 */
	EReference getSpan_Links();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.telemetry.traces.Span#getDroppedLinksCount <em>Dropped Links Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dropped Links Count</em>'.
	 * @see org.nasdanika.sdk.runtime.models.telemetry.traces.Span#getDroppedLinksCount()
	 * @see #getSpan()
	 * @generated
	 */
	EAttribute getSpan_DroppedLinksCount();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.sdk.runtime.models.telemetry.traces.Span#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Status</em>'.
	 * @see org.nasdanika.sdk.runtime.models.telemetry.traces.Span#getStatus()
	 * @see #getSpan()
	 * @generated
	 */
	EReference getSpan_Status();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.telemetry.traces.Span#getFlags <em>Flags</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Flags</em>'.
	 * @see org.nasdanika.sdk.runtime.models.telemetry.traces.Span#getFlags()
	 * @see #getSpan()
	 * @generated
	 */
	EAttribute getSpan_Flags();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.sdk.runtime.models.telemetry.traces.Span#getChangeDescription <em>Change Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Change Description</em>'.
	 * @see org.nasdanika.sdk.runtime.models.telemetry.traces.Span#getChangeDescription()
	 * @see #getSpan()
	 * @generated
	 */
	EReference getSpan_ChangeDescription();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.sdk.runtime.models.telemetry.traces.Span#getLogRecords <em>Log Records</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Log Records</em>'.
	 * @see org.nasdanika.sdk.runtime.models.telemetry.traces.Span#getLogRecords()
	 * @see #getSpan()
	 * @generated
	 */
	EReference getSpan_LogRecords();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.telemetry.traces.SpanEvent <em>Span Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Span Event</em>'.
	 * @see org.nasdanika.sdk.runtime.models.telemetry.traces.SpanEvent
	 * @generated
	 */
	EClass getSpanEvent();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.telemetry.traces.SpanEvent#getTimeUnixNano <em>Time Unix Nano</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time Unix Nano</em>'.
	 * @see org.nasdanika.sdk.runtime.models.telemetry.traces.SpanEvent#getTimeUnixNano()
	 * @see #getSpanEvent()
	 * @generated
	 */
	EAttribute getSpanEvent_TimeUnixNano();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.telemetry.traces.SpanEvent#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.nasdanika.sdk.runtime.models.telemetry.traces.SpanEvent#getName()
	 * @see #getSpanEvent()
	 * @generated
	 */
	EAttribute getSpanEvent_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.sdk.runtime.models.telemetry.traces.SpanEvent#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attributes</em>'.
	 * @see org.nasdanika.sdk.runtime.models.telemetry.traces.SpanEvent#getAttributes()
	 * @see #getSpanEvent()
	 * @generated
	 */
	EReference getSpanEvent_Attributes();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.telemetry.traces.SpanEvent#getDroppedAttributesCount <em>Dropped Attributes Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dropped Attributes Count</em>'.
	 * @see org.nasdanika.sdk.runtime.models.telemetry.traces.SpanEvent#getDroppedAttributesCount()
	 * @see #getSpanEvent()
	 * @generated
	 */
	EAttribute getSpanEvent_DroppedAttributesCount();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.telemetry.traces.SpanLink <em>Span Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Span Link</em>'.
	 * @see org.nasdanika.sdk.runtime.models.telemetry.traces.SpanLink
	 * @generated
	 */
	EClass getSpanLink();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.telemetry.traces.SpanLink#getTraceId <em>Trace Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Trace Id</em>'.
	 * @see org.nasdanika.sdk.runtime.models.telemetry.traces.SpanLink#getTraceId()
	 * @see #getSpanLink()
	 * @generated
	 */
	EAttribute getSpanLink_TraceId();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.telemetry.traces.SpanLink#getSpanId <em>Span Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Span Id</em>'.
	 * @see org.nasdanika.sdk.runtime.models.telemetry.traces.SpanLink#getSpanId()
	 * @see #getSpanLink()
	 * @generated
	 */
	EAttribute getSpanLink_SpanId();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.telemetry.traces.SpanLink#getTraceState <em>Trace State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Trace State</em>'.
	 * @see org.nasdanika.sdk.runtime.models.telemetry.traces.SpanLink#getTraceState()
	 * @see #getSpanLink()
	 * @generated
	 */
	EAttribute getSpanLink_TraceState();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.sdk.runtime.models.telemetry.traces.SpanLink#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attributes</em>'.
	 * @see org.nasdanika.sdk.runtime.models.telemetry.traces.SpanLink#getAttributes()
	 * @see #getSpanLink()
	 * @generated
	 */
	EReference getSpanLink_Attributes();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.telemetry.traces.SpanLink#getDroppedAttributesCount <em>Dropped Attributes Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dropped Attributes Count</em>'.
	 * @see org.nasdanika.sdk.runtime.models.telemetry.traces.SpanLink#getDroppedAttributesCount()
	 * @see #getSpanLink()
	 * @generated
	 */
	EAttribute getSpanLink_DroppedAttributesCount();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.telemetry.traces.SpanLink#getFlags <em>Flags</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Flags</em>'.
	 * @see org.nasdanika.sdk.runtime.models.telemetry.traces.SpanLink#getFlags()
	 * @see #getSpanLink()
	 * @generated
	 */
	EAttribute getSpanLink_Flags();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.telemetry.traces.SpanStatus <em>Span Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Span Status</em>'.
	 * @see org.nasdanika.sdk.runtime.models.telemetry.traces.SpanStatus
	 * @generated
	 */
	EClass getSpanStatus();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.telemetry.traces.SpanStatus#getMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message</em>'.
	 * @see org.nasdanika.sdk.runtime.models.telemetry.traces.SpanStatus#getMessage()
	 * @see #getSpanStatus()
	 * @generated
	 */
	EAttribute getSpanStatus_Message();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.telemetry.traces.SpanStatus#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see org.nasdanika.sdk.runtime.models.telemetry.traces.SpanStatus#getCode()
	 * @see #getSpanStatus()
	 * @generated
	 */
	EAttribute getSpanStatus_Code();

	/**
	 * Returns the meta object for enum '{@link org.nasdanika.sdk.runtime.models.telemetry.traces.SpanKind <em>Span Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Span Kind</em>'.
	 * @see org.nasdanika.sdk.runtime.models.telemetry.traces.SpanKind
	 * @generated
	 */
	EEnum getSpanKind();

	/**
	 * Returns the meta object for enum '{@link org.nasdanika.sdk.runtime.models.telemetry.traces.StatusCode <em>Status Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Status Code</em>'.
	 * @see org.nasdanika.sdk.runtime.models.telemetry.traces.StatusCode
	 * @generated
	 */
	EEnum getStatusCode();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TracesFactory getTracesFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.telemetry.traces.impl.TracesDataImpl <em>Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.telemetry.traces.impl.TracesDataImpl
		 * @see org.nasdanika.sdk.runtime.models.telemetry.traces.impl.TracesPackageImpl#getTracesData()
		 * @generated
		 */
		EClass TRACES_DATA = eINSTANCE.getTracesData();

		/**
		 * The meta object literal for the '<em><b>Resource Spans</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACES_DATA__RESOURCE_SPANS = eINSTANCE.getTracesData_ResourceSpans();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.telemetry.traces.impl.ResourceSpansImpl <em>Resource Spans</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.telemetry.traces.impl.ResourceSpansImpl
		 * @see org.nasdanika.sdk.runtime.models.telemetry.traces.impl.TracesPackageImpl#getResourceSpans()
		 * @generated
		 */
		EClass RESOURCE_SPANS = eINSTANCE.getResourceSpans();

		/**
		 * The meta object literal for the '<em><b>Resource</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_SPANS__RESOURCE = eINSTANCE.getResourceSpans_Resource();

		/**
		 * The meta object literal for the '<em><b>Scope Spans</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_SPANS__SCOPE_SPANS = eINSTANCE.getResourceSpans_ScopeSpans();

		/**
		 * The meta object literal for the '<em><b>Schema Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_SPANS__SCHEMA_URL = eINSTANCE.getResourceSpans_SchemaUrl();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.telemetry.traces.impl.ScopeSpansImpl <em>Scope Spans</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.telemetry.traces.impl.ScopeSpansImpl
		 * @see org.nasdanika.sdk.runtime.models.telemetry.traces.impl.TracesPackageImpl#getScopeSpans()
		 * @generated
		 */
		EClass SCOPE_SPANS = eINSTANCE.getScopeSpans();

		/**
		 * The meta object literal for the '<em><b>Scope</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCOPE_SPANS__SCOPE = eINSTANCE.getScopeSpans_Scope();

		/**
		 * The meta object literal for the '<em><b>Spans</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCOPE_SPANS__SPANS = eINSTANCE.getScopeSpans_Spans();

		/**
		 * The meta object literal for the '<em><b>Schema Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCOPE_SPANS__SCHEMA_URL = eINSTANCE.getScopeSpans_SchemaUrl();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.telemetry.traces.impl.SpanImpl <em>Span</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.telemetry.traces.impl.SpanImpl
		 * @see org.nasdanika.sdk.runtime.models.telemetry.traces.impl.TracesPackageImpl#getSpan()
		 * @generated
		 */
		EClass SPAN = eINSTANCE.getSpan();

		/**
		 * The meta object literal for the '<em><b>Trace Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPAN__TRACE_ID = eINSTANCE.getSpan_TraceId();

		/**
		 * The meta object literal for the '<em><b>Span Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPAN__SPAN_ID = eINSTANCE.getSpan_SpanId();

		/**
		 * The meta object literal for the '<em><b>Trace State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPAN__TRACE_STATE = eINSTANCE.getSpan_TraceState();

		/**
		 * The meta object literal for the '<em><b>Parent Span Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPAN__PARENT_SPAN_ID = eINSTANCE.getSpan_ParentSpanId();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPAN__NAME = eINSTANCE.getSpan_Name();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPAN__KIND = eINSTANCE.getSpan_Kind();

		/**
		 * The meta object literal for the '<em><b>Start Time Unix Nano</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPAN__START_TIME_UNIX_NANO = eINSTANCE.getSpan_StartTimeUnixNano();

		/**
		 * The meta object literal for the '<em><b>End Time Unix Nano</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPAN__END_TIME_UNIX_NANO = eINSTANCE.getSpan_EndTimeUnixNano();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPAN__ATTRIBUTES = eINSTANCE.getSpan_Attributes();

		/**
		 * The meta object literal for the '<em><b>Dropped Attributes Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPAN__DROPPED_ATTRIBUTES_COUNT = eINSTANCE.getSpan_DroppedAttributesCount();

		/**
		 * The meta object literal for the '<em><b>Events</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPAN__EVENTS = eINSTANCE.getSpan_Events();

		/**
		 * The meta object literal for the '<em><b>Dropped Events Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPAN__DROPPED_EVENTS_COUNT = eINSTANCE.getSpan_DroppedEventsCount();

		/**
		 * The meta object literal for the '<em><b>Links</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPAN__LINKS = eINSTANCE.getSpan_Links();

		/**
		 * The meta object literal for the '<em><b>Dropped Links Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPAN__DROPPED_LINKS_COUNT = eINSTANCE.getSpan_DroppedLinksCount();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPAN__STATUS = eINSTANCE.getSpan_Status();

		/**
		 * The meta object literal for the '<em><b>Flags</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPAN__FLAGS = eINSTANCE.getSpan_Flags();

		/**
		 * The meta object literal for the '<em><b>Change Description</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPAN__CHANGE_DESCRIPTION = eINSTANCE.getSpan_ChangeDescription();

		/**
		 * The meta object literal for the '<em><b>Log Records</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPAN__LOG_RECORDS = eINSTANCE.getSpan_LogRecords();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.telemetry.traces.impl.SpanEventImpl <em>Span Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.telemetry.traces.impl.SpanEventImpl
		 * @see org.nasdanika.sdk.runtime.models.telemetry.traces.impl.TracesPackageImpl#getSpanEvent()
		 * @generated
		 */
		EClass SPAN_EVENT = eINSTANCE.getSpanEvent();

		/**
		 * The meta object literal for the '<em><b>Time Unix Nano</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPAN_EVENT__TIME_UNIX_NANO = eINSTANCE.getSpanEvent_TimeUnixNano();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPAN_EVENT__NAME = eINSTANCE.getSpanEvent_Name();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPAN_EVENT__ATTRIBUTES = eINSTANCE.getSpanEvent_Attributes();

		/**
		 * The meta object literal for the '<em><b>Dropped Attributes Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPAN_EVENT__DROPPED_ATTRIBUTES_COUNT = eINSTANCE.getSpanEvent_DroppedAttributesCount();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.telemetry.traces.impl.SpanLinkImpl <em>Span Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.telemetry.traces.impl.SpanLinkImpl
		 * @see org.nasdanika.sdk.runtime.models.telemetry.traces.impl.TracesPackageImpl#getSpanLink()
		 * @generated
		 */
		EClass SPAN_LINK = eINSTANCE.getSpanLink();

		/**
		 * The meta object literal for the '<em><b>Trace Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPAN_LINK__TRACE_ID = eINSTANCE.getSpanLink_TraceId();

		/**
		 * The meta object literal for the '<em><b>Span Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPAN_LINK__SPAN_ID = eINSTANCE.getSpanLink_SpanId();

		/**
		 * The meta object literal for the '<em><b>Trace State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPAN_LINK__TRACE_STATE = eINSTANCE.getSpanLink_TraceState();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPAN_LINK__ATTRIBUTES = eINSTANCE.getSpanLink_Attributes();

		/**
		 * The meta object literal for the '<em><b>Dropped Attributes Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPAN_LINK__DROPPED_ATTRIBUTES_COUNT = eINSTANCE.getSpanLink_DroppedAttributesCount();

		/**
		 * The meta object literal for the '<em><b>Flags</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPAN_LINK__FLAGS = eINSTANCE.getSpanLink_Flags();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.telemetry.traces.impl.SpanStatusImpl <em>Span Status</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.telemetry.traces.impl.SpanStatusImpl
		 * @see org.nasdanika.sdk.runtime.models.telemetry.traces.impl.TracesPackageImpl#getSpanStatus()
		 * @generated
		 */
		EClass SPAN_STATUS = eINSTANCE.getSpanStatus();

		/**
		 * The meta object literal for the '<em><b>Message</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPAN_STATUS__MESSAGE = eINSTANCE.getSpanStatus_Message();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPAN_STATUS__CODE = eINSTANCE.getSpanStatus_Code();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.telemetry.traces.SpanKind <em>Span Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.telemetry.traces.SpanKind
		 * @see org.nasdanika.sdk.runtime.models.telemetry.traces.impl.TracesPackageImpl#getSpanKind()
		 * @generated
		 */
		EEnum SPAN_KIND = eINSTANCE.getSpanKind();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.telemetry.traces.StatusCode <em>Status Code</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.telemetry.traces.StatusCode
		 * @see org.nasdanika.sdk.runtime.models.telemetry.traces.impl.TracesPackageImpl#getStatusCode()
		 * @generated
		 */
		EEnum STATUS_CODE = eINSTANCE.getStatusCode();

	}

} //TracesPackage
