/**
 */
package org.nasdanika.sdk.runtime.models.telemetry.logs;

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
 * @see org.nasdanika.sdk.runtime.models.telemetry.logs.LogsFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel modelDirectory='/org.nasdanika.sdk.runtime.models.telemetry.model/src-gen' featureDelegation='Dynamic' complianceLevel='25' suppressGenModelAnnotations='false' copyrightFields='false' operationReflection='true' importOrganizing='true' basePackage='org.nasdanika.sdk.runtime.models.telemetry'"
 *        annotation="http://www.eclipse.org/emf/2011/Xcore Ecore='http://www.eclipse.org/emf/2002/Ecore' GenModel='http://www.eclipse.org/emf/2002/GenModel' Nasdanika='urn:org.nasdanika'"
 * @generated
 */
public interface LogsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "logs";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "https://runtime.sdk.nasdanika.org/models/telemetry/logs";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.nasdanika.sdk.runtime.models.telemetry.logs";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	LogsPackage eINSTANCE = org.nasdanika.sdk.runtime.models.telemetry.logs.impl.LogsPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.telemetry.logs.impl.LogsDataImpl <em>Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.telemetry.logs.impl.LogsDataImpl
	 * @see org.nasdanika.sdk.runtime.models.telemetry.logs.impl.LogsPackageImpl#getLogsData()
	 * @generated
	 */
	int LOGS_DATA = 0;

	/**
	 * The feature id for the '<em><b>Resource Logs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGS_DATA__RESOURCE_LOGS = 0;

	/**
	 * The number of structural features of the '<em>Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGS_DATA_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGS_DATA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.telemetry.logs.impl.ResourceLogsImpl <em>Resource Logs</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.telemetry.logs.impl.ResourceLogsImpl
	 * @see org.nasdanika.sdk.runtime.models.telemetry.logs.impl.LogsPackageImpl#getResourceLogs()
	 * @generated
	 */
	int RESOURCE_LOGS = 1;

	/**
	 * The feature id for the '<em><b>Resource</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_LOGS__RESOURCE = 0;

	/**
	 * The feature id for the '<em><b>Scope Logs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_LOGS__SCOPE_LOGS = 1;

	/**
	 * The feature id for the '<em><b>Schema Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_LOGS__SCHEMA_URL = 2;

	/**
	 * The number of structural features of the '<em>Resource Logs</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_LOGS_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Resource Logs</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_LOGS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.telemetry.logs.impl.ScopeLogsImpl <em>Scope Logs</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.telemetry.logs.impl.ScopeLogsImpl
	 * @see org.nasdanika.sdk.runtime.models.telemetry.logs.impl.LogsPackageImpl#getScopeLogs()
	 * @generated
	 */
	int SCOPE_LOGS = 2;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE_LOGS__SCOPE = 0;

	/**
	 * The feature id for the '<em><b>Log Records</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE_LOGS__LOG_RECORDS = 1;

	/**
	 * The feature id for the '<em><b>Schema Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE_LOGS__SCHEMA_URL = 2;

	/**
	 * The number of structural features of the '<em>Scope Logs</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE_LOGS_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Scope Logs</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE_LOGS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.telemetry.logs.impl.LogRecordImpl <em>Log Record</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.telemetry.logs.impl.LogRecordImpl
	 * @see org.nasdanika.sdk.runtime.models.telemetry.logs.impl.LogsPackageImpl#getLogRecord()
	 * @generated
	 */
	int LOG_RECORD = 3;

	/**
	 * The feature id for the '<em><b>Time Unix Nano</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_RECORD__TIME_UNIX_NANO = 0;

	/**
	 * The feature id for the '<em><b>Observed Time Unix Nano</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_RECORD__OBSERVED_TIME_UNIX_NANO = 1;

	/**
	 * The feature id for the '<em><b>Severity Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_RECORD__SEVERITY_NUMBER = 2;

	/**
	 * The feature id for the '<em><b>Severity Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_RECORD__SEVERITY_TEXT = 3;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_RECORD__BODY = 4;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_RECORD__ATTRIBUTES = 5;

	/**
	 * The feature id for the '<em><b>Dropped Attributes Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_RECORD__DROPPED_ATTRIBUTES_COUNT = 6;

	/**
	 * The feature id for the '<em><b>Flags</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_RECORD__FLAGS = 7;

	/**
	 * The feature id for the '<em><b>Trace Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_RECORD__TRACE_ID = 8;

	/**
	 * The feature id for the '<em><b>Span Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_RECORD__SPAN_ID = 9;

	/**
	 * The number of structural features of the '<em>Log Record</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_RECORD_FEATURE_COUNT = 10;

	/**
	 * The number of operations of the '<em>Log Record</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_RECORD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.telemetry.logs.SeverityNumber <em>Severity Number</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.telemetry.logs.SeverityNumber
	 * @see org.nasdanika.sdk.runtime.models.telemetry.logs.impl.LogsPackageImpl#getSeverityNumber()
	 * @generated
	 */
	int SEVERITY_NUMBER = 4;


	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.telemetry.logs.LogsData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data</em>'.
	 * @see org.nasdanika.sdk.runtime.models.telemetry.logs.LogsData
	 * @generated
	 */
	EClass getLogsData();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.sdk.runtime.models.telemetry.logs.LogsData#getResourceLogs <em>Resource Logs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resource Logs</em>'.
	 * @see org.nasdanika.sdk.runtime.models.telemetry.logs.LogsData#getResourceLogs()
	 * @see #getLogsData()
	 * @generated
	 */
	EReference getLogsData_ResourceLogs();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.telemetry.logs.ResourceLogs <em>Resource Logs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Logs</em>'.
	 * @see org.nasdanika.sdk.runtime.models.telemetry.logs.ResourceLogs
	 * @generated
	 */
	EClass getResourceLogs();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.sdk.runtime.models.telemetry.logs.ResourceLogs#getResource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Resource</em>'.
	 * @see org.nasdanika.sdk.runtime.models.telemetry.logs.ResourceLogs#getResource()
	 * @see #getResourceLogs()
	 * @generated
	 */
	EReference getResourceLogs_Resource();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.sdk.runtime.models.telemetry.logs.ResourceLogs#getScopeLogs <em>Scope Logs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Scope Logs</em>'.
	 * @see org.nasdanika.sdk.runtime.models.telemetry.logs.ResourceLogs#getScopeLogs()
	 * @see #getResourceLogs()
	 * @generated
	 */
	EReference getResourceLogs_ScopeLogs();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.telemetry.logs.ResourceLogs#getSchemaUrl <em>Schema Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Schema Url</em>'.
	 * @see org.nasdanika.sdk.runtime.models.telemetry.logs.ResourceLogs#getSchemaUrl()
	 * @see #getResourceLogs()
	 * @generated
	 */
	EAttribute getResourceLogs_SchemaUrl();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.telemetry.logs.ScopeLogs <em>Scope Logs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scope Logs</em>'.
	 * @see org.nasdanika.sdk.runtime.models.telemetry.logs.ScopeLogs
	 * @generated
	 */
	EClass getScopeLogs();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.sdk.runtime.models.telemetry.logs.ScopeLogs#getScope <em>Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Scope</em>'.
	 * @see org.nasdanika.sdk.runtime.models.telemetry.logs.ScopeLogs#getScope()
	 * @see #getScopeLogs()
	 * @generated
	 */
	EReference getScopeLogs_Scope();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.sdk.runtime.models.telemetry.logs.ScopeLogs#getLogRecords <em>Log Records</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Log Records</em>'.
	 * @see org.nasdanika.sdk.runtime.models.telemetry.logs.ScopeLogs#getLogRecords()
	 * @see #getScopeLogs()
	 * @generated
	 */
	EReference getScopeLogs_LogRecords();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.telemetry.logs.ScopeLogs#getSchemaUrl <em>Schema Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Schema Url</em>'.
	 * @see org.nasdanika.sdk.runtime.models.telemetry.logs.ScopeLogs#getSchemaUrl()
	 * @see #getScopeLogs()
	 * @generated
	 */
	EAttribute getScopeLogs_SchemaUrl();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.telemetry.logs.LogRecord <em>Log Record</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Log Record</em>'.
	 * @see org.nasdanika.sdk.runtime.models.telemetry.logs.LogRecord
	 * @generated
	 */
	EClass getLogRecord();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.telemetry.logs.LogRecord#getTimeUnixNano <em>Time Unix Nano</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time Unix Nano</em>'.
	 * @see org.nasdanika.sdk.runtime.models.telemetry.logs.LogRecord#getTimeUnixNano()
	 * @see #getLogRecord()
	 * @generated
	 */
	EAttribute getLogRecord_TimeUnixNano();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.telemetry.logs.LogRecord#getObservedTimeUnixNano <em>Observed Time Unix Nano</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Observed Time Unix Nano</em>'.
	 * @see org.nasdanika.sdk.runtime.models.telemetry.logs.LogRecord#getObservedTimeUnixNano()
	 * @see #getLogRecord()
	 * @generated
	 */
	EAttribute getLogRecord_ObservedTimeUnixNano();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.telemetry.logs.LogRecord#getSeverityNumber <em>Severity Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Severity Number</em>'.
	 * @see org.nasdanika.sdk.runtime.models.telemetry.logs.LogRecord#getSeverityNumber()
	 * @see #getLogRecord()
	 * @generated
	 */
	EAttribute getLogRecord_SeverityNumber();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.telemetry.logs.LogRecord#getSeverityText <em>Severity Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Severity Text</em>'.
	 * @see org.nasdanika.sdk.runtime.models.telemetry.logs.LogRecord#getSeverityText()
	 * @see #getLogRecord()
	 * @generated
	 */
	EAttribute getLogRecord_SeverityText();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.sdk.runtime.models.telemetry.logs.LogRecord#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Body</em>'.
	 * @see org.nasdanika.sdk.runtime.models.telemetry.logs.LogRecord#getBody()
	 * @see #getLogRecord()
	 * @generated
	 */
	EReference getLogRecord_Body();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.sdk.runtime.models.telemetry.logs.LogRecord#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attributes</em>'.
	 * @see org.nasdanika.sdk.runtime.models.telemetry.logs.LogRecord#getAttributes()
	 * @see #getLogRecord()
	 * @generated
	 */
	EReference getLogRecord_Attributes();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.telemetry.logs.LogRecord#getDroppedAttributesCount <em>Dropped Attributes Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dropped Attributes Count</em>'.
	 * @see org.nasdanika.sdk.runtime.models.telemetry.logs.LogRecord#getDroppedAttributesCount()
	 * @see #getLogRecord()
	 * @generated
	 */
	EAttribute getLogRecord_DroppedAttributesCount();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.telemetry.logs.LogRecord#getFlags <em>Flags</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Flags</em>'.
	 * @see org.nasdanika.sdk.runtime.models.telemetry.logs.LogRecord#getFlags()
	 * @see #getLogRecord()
	 * @generated
	 */
	EAttribute getLogRecord_Flags();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.telemetry.logs.LogRecord#getTraceId <em>Trace Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Trace Id</em>'.
	 * @see org.nasdanika.sdk.runtime.models.telemetry.logs.LogRecord#getTraceId()
	 * @see #getLogRecord()
	 * @generated
	 */
	EAttribute getLogRecord_TraceId();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.telemetry.logs.LogRecord#getSpanId <em>Span Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Span Id</em>'.
	 * @see org.nasdanika.sdk.runtime.models.telemetry.logs.LogRecord#getSpanId()
	 * @see #getLogRecord()
	 * @generated
	 */
	EAttribute getLogRecord_SpanId();

	/**
	 * Returns the meta object for enum '{@link org.nasdanika.sdk.runtime.models.telemetry.logs.SeverityNumber <em>Severity Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Severity Number</em>'.
	 * @see org.nasdanika.sdk.runtime.models.telemetry.logs.SeverityNumber
	 * @generated
	 */
	EEnum getSeverityNumber();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	LogsFactory getLogsFactory();

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
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.telemetry.logs.impl.LogsDataImpl <em>Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.telemetry.logs.impl.LogsDataImpl
		 * @see org.nasdanika.sdk.runtime.models.telemetry.logs.impl.LogsPackageImpl#getLogsData()
		 * @generated
		 */
		EClass LOGS_DATA = eINSTANCE.getLogsData();

		/**
		 * The meta object literal for the '<em><b>Resource Logs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOGS_DATA__RESOURCE_LOGS = eINSTANCE.getLogsData_ResourceLogs();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.telemetry.logs.impl.ResourceLogsImpl <em>Resource Logs</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.telemetry.logs.impl.ResourceLogsImpl
		 * @see org.nasdanika.sdk.runtime.models.telemetry.logs.impl.LogsPackageImpl#getResourceLogs()
		 * @generated
		 */
		EClass RESOURCE_LOGS = eINSTANCE.getResourceLogs();

		/**
		 * The meta object literal for the '<em><b>Resource</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_LOGS__RESOURCE = eINSTANCE.getResourceLogs_Resource();

		/**
		 * The meta object literal for the '<em><b>Scope Logs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_LOGS__SCOPE_LOGS = eINSTANCE.getResourceLogs_ScopeLogs();

		/**
		 * The meta object literal for the '<em><b>Schema Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_LOGS__SCHEMA_URL = eINSTANCE.getResourceLogs_SchemaUrl();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.telemetry.logs.impl.ScopeLogsImpl <em>Scope Logs</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.telemetry.logs.impl.ScopeLogsImpl
		 * @see org.nasdanika.sdk.runtime.models.telemetry.logs.impl.LogsPackageImpl#getScopeLogs()
		 * @generated
		 */
		EClass SCOPE_LOGS = eINSTANCE.getScopeLogs();

		/**
		 * The meta object literal for the '<em><b>Scope</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCOPE_LOGS__SCOPE = eINSTANCE.getScopeLogs_Scope();

		/**
		 * The meta object literal for the '<em><b>Log Records</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCOPE_LOGS__LOG_RECORDS = eINSTANCE.getScopeLogs_LogRecords();

		/**
		 * The meta object literal for the '<em><b>Schema Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCOPE_LOGS__SCHEMA_URL = eINSTANCE.getScopeLogs_SchemaUrl();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.telemetry.logs.impl.LogRecordImpl <em>Log Record</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.telemetry.logs.impl.LogRecordImpl
		 * @see org.nasdanika.sdk.runtime.models.telemetry.logs.impl.LogsPackageImpl#getLogRecord()
		 * @generated
		 */
		EClass LOG_RECORD = eINSTANCE.getLogRecord();

		/**
		 * The meta object literal for the '<em><b>Time Unix Nano</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOG_RECORD__TIME_UNIX_NANO = eINSTANCE.getLogRecord_TimeUnixNano();

		/**
		 * The meta object literal for the '<em><b>Observed Time Unix Nano</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOG_RECORD__OBSERVED_TIME_UNIX_NANO = eINSTANCE.getLogRecord_ObservedTimeUnixNano();

		/**
		 * The meta object literal for the '<em><b>Severity Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOG_RECORD__SEVERITY_NUMBER = eINSTANCE.getLogRecord_SeverityNumber();

		/**
		 * The meta object literal for the '<em><b>Severity Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOG_RECORD__SEVERITY_TEXT = eINSTANCE.getLogRecord_SeverityText();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOG_RECORD__BODY = eINSTANCE.getLogRecord_Body();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOG_RECORD__ATTRIBUTES = eINSTANCE.getLogRecord_Attributes();

		/**
		 * The meta object literal for the '<em><b>Dropped Attributes Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOG_RECORD__DROPPED_ATTRIBUTES_COUNT = eINSTANCE.getLogRecord_DroppedAttributesCount();

		/**
		 * The meta object literal for the '<em><b>Flags</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOG_RECORD__FLAGS = eINSTANCE.getLogRecord_Flags();

		/**
		 * The meta object literal for the '<em><b>Trace Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOG_RECORD__TRACE_ID = eINSTANCE.getLogRecord_TraceId();

		/**
		 * The meta object literal for the '<em><b>Span Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOG_RECORD__SPAN_ID = eINSTANCE.getLogRecord_SpanId();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.telemetry.logs.SeverityNumber <em>Severity Number</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.telemetry.logs.SeverityNumber
		 * @see org.nasdanika.sdk.runtime.models.telemetry.logs.impl.LogsPackageImpl#getSeverityNumber()
		 * @generated
		 */
		EEnum SEVERITY_NUMBER = eINSTANCE.getSeverityNumber();

	}

} //LogsPackage
