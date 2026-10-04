/**
 */
package org.nasdanika.sdk.runtime.models.telemetry.logs.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.nasdanika.sdk.runtime.models.telemetry.TelemetryPackage;

import org.nasdanika.sdk.runtime.models.telemetry.logs.LogRecord;
import org.nasdanika.sdk.runtime.models.telemetry.logs.LogsData;
import org.nasdanika.sdk.runtime.models.telemetry.logs.LogsFactory;
import org.nasdanika.sdk.runtime.models.telemetry.logs.LogsPackage;
import org.nasdanika.sdk.runtime.models.telemetry.logs.ResourceLogs;
import org.nasdanika.sdk.runtime.models.telemetry.logs.ScopeLogs;
import org.nasdanika.sdk.runtime.models.telemetry.logs.SeverityNumber;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class LogsPackageImpl extends EPackageImpl implements LogsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass logsDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceLogsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scopeLogsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass logRecordEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum severityNumberEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.nasdanika.sdk.runtime.models.telemetry.logs.LogsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private LogsPackageImpl() {
		super(eNS_URI, LogsFactory.eINSTANCE);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link LogsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static LogsPackage init() {
		if (isInited) return (LogsPackage)EPackage.Registry.INSTANCE.getEPackage(LogsPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredLogsPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		LogsPackageImpl theLogsPackage = registeredLogsPackage instanceof LogsPackageImpl ? (LogsPackageImpl)registeredLogsPackage : new LogsPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		TelemetryPackage.eINSTANCE.eClass();
		EcorePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theLogsPackage.createPackageContents();

		// Initialize created meta-data
		theLogsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theLogsPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(LogsPackage.eNS_URI, theLogsPackage);
		return theLogsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLogsData() {
		return logsDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLogsData_ResourceLogs() {
		return (EReference)logsDataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResourceLogs() {
		return resourceLogsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceLogs_Resource() {
		return (EReference)resourceLogsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceLogs_ScopeLogs() {
		return (EReference)resourceLogsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResourceLogs_SchemaUrl() {
		return (EAttribute)resourceLogsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getScopeLogs() {
		return scopeLogsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScopeLogs_Scope() {
		return (EReference)scopeLogsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScopeLogs_LogRecords() {
		return (EReference)scopeLogsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScopeLogs_SchemaUrl() {
		return (EAttribute)scopeLogsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLogRecord() {
		return logRecordEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLogRecord_TimeUnixNano() {
		return (EAttribute)logRecordEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLogRecord_ObservedTimeUnixNano() {
		return (EAttribute)logRecordEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLogRecord_SeverityNumber() {
		return (EAttribute)logRecordEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLogRecord_SeverityText() {
		return (EAttribute)logRecordEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLogRecord_Body() {
		return (EReference)logRecordEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLogRecord_Attributes() {
		return (EReference)logRecordEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLogRecord_DroppedAttributesCount() {
		return (EAttribute)logRecordEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLogRecord_Flags() {
		return (EAttribute)logRecordEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLogRecord_TraceId() {
		return (EAttribute)logRecordEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLogRecord_SpanId() {
		return (EAttribute)logRecordEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLogRecord_EventName() {
		return (EAttribute)logRecordEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSeverityNumber() {
		return severityNumberEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogsFactory getLogsFactory() {
		return (LogsFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		logsDataEClass = createEClass(LOGS_DATA);
		createEReference(logsDataEClass, LOGS_DATA__RESOURCE_LOGS);

		resourceLogsEClass = createEClass(RESOURCE_LOGS);
		createEReference(resourceLogsEClass, RESOURCE_LOGS__RESOURCE);
		createEReference(resourceLogsEClass, RESOURCE_LOGS__SCOPE_LOGS);
		createEAttribute(resourceLogsEClass, RESOURCE_LOGS__SCHEMA_URL);

		scopeLogsEClass = createEClass(SCOPE_LOGS);
		createEReference(scopeLogsEClass, SCOPE_LOGS__SCOPE);
		createEReference(scopeLogsEClass, SCOPE_LOGS__LOG_RECORDS);
		createEAttribute(scopeLogsEClass, SCOPE_LOGS__SCHEMA_URL);

		logRecordEClass = createEClass(LOG_RECORD);
		createEAttribute(logRecordEClass, LOG_RECORD__TIME_UNIX_NANO);
		createEAttribute(logRecordEClass, LOG_RECORD__OBSERVED_TIME_UNIX_NANO);
		createEAttribute(logRecordEClass, LOG_RECORD__SEVERITY_NUMBER);
		createEAttribute(logRecordEClass, LOG_RECORD__SEVERITY_TEXT);
		createEReference(logRecordEClass, LOG_RECORD__BODY);
		createEReference(logRecordEClass, LOG_RECORD__ATTRIBUTES);
		createEAttribute(logRecordEClass, LOG_RECORD__DROPPED_ATTRIBUTES_COUNT);
		createEAttribute(logRecordEClass, LOG_RECORD__FLAGS);
		createEAttribute(logRecordEClass, LOG_RECORD__TRACE_ID);
		createEAttribute(logRecordEClass, LOG_RECORD__SPAN_ID);
		createEAttribute(logRecordEClass, LOG_RECORD__EVENT_NAME);

		// Create enums
		severityNumberEEnum = createEEnum(SEVERITY_NUMBER);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		TelemetryPackage theTelemetryPackage = (TelemetryPackage)EPackage.Registry.INSTANCE.getEPackage(TelemetryPackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(logsDataEClass, LogsData.class, "LogsData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLogsData_ResourceLogs(), this.getResourceLogs(), null, "resourceLogs", null, 0, -1, LogsData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resourceLogsEClass, ResourceLogs.class, "ResourceLogs", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getResourceLogs_Resource(), theTelemetryPackage.getResource(), null, "resource", null, 0, 1, ResourceLogs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResourceLogs_ScopeLogs(), this.getScopeLogs(), null, "scopeLogs", null, 0, -1, ResourceLogs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResourceLogs_SchemaUrl(), theEcorePackage.getEString(), "schemaUrl", null, 0, 1, ResourceLogs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(scopeLogsEClass, ScopeLogs.class, "ScopeLogs", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getScopeLogs_Scope(), theTelemetryPackage.getInstrumentationScope(), null, "scope", null, 0, 1, ScopeLogs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getScopeLogs_LogRecords(), this.getLogRecord(), null, "logRecords", null, 0, -1, ScopeLogs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getScopeLogs_SchemaUrl(), theEcorePackage.getEString(), "schemaUrl", null, 0, 1, ScopeLogs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(logRecordEClass, LogRecord.class, "LogRecord", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLogRecord_TimeUnixNano(), theEcorePackage.getELong(), "timeUnixNano", null, 0, 1, LogRecord.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLogRecord_ObservedTimeUnixNano(), theEcorePackage.getELong(), "observedTimeUnixNano", null, 0, 1, LogRecord.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLogRecord_SeverityNumber(), this.getSeverityNumber(), "severityNumber", null, 0, 1, LogRecord.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLogRecord_SeverityText(), theEcorePackage.getEString(), "severityText", null, 0, 1, LogRecord.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLogRecord_Body(), theTelemetryPackage.getAnyValue(), null, "body", null, 0, 1, LogRecord.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLogRecord_Attributes(), theTelemetryPackage.getKeyValue(), null, "attributes", null, 0, -1, LogRecord.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLogRecord_DroppedAttributesCount(), theEcorePackage.getEInt(), "droppedAttributesCount", null, 0, 1, LogRecord.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLogRecord_Flags(), theEcorePackage.getEInt(), "flags", null, 0, 1, LogRecord.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLogRecord_TraceId(), theEcorePackage.getEString(), "traceId", null, 0, 1, LogRecord.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLogRecord_SpanId(), theEcorePackage.getEString(), "spanId", null, 0, 1, LogRecord.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLogRecord_EventName(), theEcorePackage.getEString(), "eventName", null, 0, 1, LogRecord.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(severityNumberEEnum, SeverityNumber.class, "SeverityNumber");
		addEEnumLiteral(severityNumberEEnum, SeverityNumber.SEVERITY_NUMBER_UNSPECIFIED);
		addEEnumLiteral(severityNumberEEnum, SeverityNumber.SEVERITY_NUMBER_TRACE);
		addEEnumLiteral(severityNumberEEnum, SeverityNumber.SEVERITY_NUMBER_TRACE2);
		addEEnumLiteral(severityNumberEEnum, SeverityNumber.SEVERITY_NUMBER_TRACE3);
		addEEnumLiteral(severityNumberEEnum, SeverityNumber.SEVERITY_NUMBER_TRACE4);
		addEEnumLiteral(severityNumberEEnum, SeverityNumber.SEVERITY_NUMBER_DEBUG);
		addEEnumLiteral(severityNumberEEnum, SeverityNumber.SEVERITY_NUMBER_DEBUG2);
		addEEnumLiteral(severityNumberEEnum, SeverityNumber.SEVERITY_NUMBER_DEBUG3);
		addEEnumLiteral(severityNumberEEnum, SeverityNumber.SEVERITY_NUMBER_DEBUG4);
		addEEnumLiteral(severityNumberEEnum, SeverityNumber.SEVERITY_NUMBER_INFO);
		addEEnumLiteral(severityNumberEEnum, SeverityNumber.SEVERITY_NUMBER_INFO2);
		addEEnumLiteral(severityNumberEEnum, SeverityNumber.SEVERITY_NUMBER_INFO3);
		addEEnumLiteral(severityNumberEEnum, SeverityNumber.SEVERITY_NUMBER_INFO4);
		addEEnumLiteral(severityNumberEEnum, SeverityNumber.SEVERITY_NUMBER_WARN);
		addEEnumLiteral(severityNumberEEnum, SeverityNumber.SEVERITY_NUMBER_WARN2);
		addEEnumLiteral(severityNumberEEnum, SeverityNumber.SEVERITY_NUMBER_WARN3);
		addEEnumLiteral(severityNumberEEnum, SeverityNumber.SEVERITY_NUMBER_WARN4);
		addEEnumLiteral(severityNumberEEnum, SeverityNumber.SEVERITY_NUMBER_ERROR);
		addEEnumLiteral(severityNumberEEnum, SeverityNumber.SEVERITY_NUMBER_ERROR2);
		addEEnumLiteral(severityNumberEEnum, SeverityNumber.SEVERITY_NUMBER_ERROR3);
		addEEnumLiteral(severityNumberEEnum, SeverityNumber.SEVERITY_NUMBER_ERROR4);
		addEEnumLiteral(severityNumberEEnum, SeverityNumber.SEVERITY_NUMBER_FATAL);
		addEEnumLiteral(severityNumberEEnum, SeverityNumber.SEVERITY_NUMBER_FATAL2);
		addEEnumLiteral(severityNumberEEnum, SeverityNumber.SEVERITY_NUMBER_FATAL3);
		addEEnumLiteral(severityNumberEEnum, SeverityNumber.SEVERITY_NUMBER_FATAL4);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/GenModel
		createGenModelAnnotations();
		// http://www.eclipse.org/emf/2011/Xcore
		createXcoreAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/GenModel</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGenModelAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/GenModel";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "modelDirectory", "/org.nasdanika.sdk.runtime.models.telemetry.model/src-gen",
			   "featureDelegation", "Dynamic",
			   "complianceLevel", "25",
			   "suppressGenModelAnnotations", "false",
			   "copyrightFields", "false",
			   "operationReflection", "true",
			   "importOrganizing", "true",
			   "basePackage", "org.nasdanika.sdk.runtime.models.telemetry"
		   });
		addAnnotation
		  (logsDataEClass,
		   source,
		   new String[] {
			   "documentation", "*\nLogsData represents the logs export payload which can be serialized to different formats, e.g., OTLP/gRPC, JSON, and proto."
		   });
		addAnnotation
		  (getLogsData_ResourceLogs(),
		   source,
		   new String[] {
			   "documentation", "*\nAn array of ResourceLogs."
		   });
		addAnnotation
		  (resourceLogsEClass,
		   source,
		   new String[] {
			   "documentation", "*\nA collection of ScopeLogs from a Resource."
		   });
		addAnnotation
		  (scopeLogsEClass,
		   source,
		   new String[] {
			   "documentation", "*\nA collection of Logs produced by a Scope."
		   });
		addAnnotation
		  (logRecordEClass,
		   source,
		   new String[] {
			   "documentation", "*\nA log record according to OpenTelemetry Log Data Model: https://opentelemetry.io/docs/specs/otel/logs/data-model/"
		   });
		addAnnotation
		  (getLogRecord_TimeUnixNano(),
		   source,
		   new String[] {
			   "documentation", "*\ntime_unix_nano is the time when the event occurred. Value is UNIX Epoch time in nanoseconds since 00:00:00 UTC on 1 January 1970."
		   });
		addAnnotation
		  (getLogRecord_ObservedTimeUnixNano(),
		   source,
		   new String[] {
			   "documentation", "*\nTime when the event was observed by the collection system."
		   });
		addAnnotation
		  (getLogRecord_SeverityNumber(),
		   source,
		   new String[] {
			   "documentation", "*\nNumerical value of the severity, normalized to values described in the log data model."
		   });
		addAnnotation
		  (getLogRecord_SeverityText(),
		   source,
		   new String[] {
			   "documentation", "*\nThe severity text (also known as log level). The original string representation as it is known at the source."
		   });
		addAnnotation
		  (getLogRecord_Body(),
		   source,
		   new String[] {
			   "documentation", "*\nA value containing the body of the log record."
		   });
		addAnnotation
		  (getLogRecord_Attributes(),
		   source,
		   new String[] {
			   "documentation", "*\nAdditional attributes that describe the specific event occurrence."
		   });
		addAnnotation
		  (getLogRecord_Flags(),
		   source,
		   new String[] {
			   "documentation", "*\nFlags, a bit field."
		   });
		addAnnotation
		  (getLogRecord_TraceId(),
		   source,
		   new String[] {
			   "documentation", "*\nA unique identifier for a trace. All logs from the same trace share the same trace_id."
		   });
		addAnnotation
		  (getLogRecord_SpanId(),
		   source,
		   new String[] {
			   "documentation", "*\nA unique identifier for a span within a trace. If present, this log record is associated with a specific span."
		   });
		addAnnotation
		  (getLogRecord_EventName(),
		   source,
		   new String[] {
			   "documentation", "*\nA unique identifier of an event. If present, this log record is an event: its attributes and body follow the event\'s semantic conventions."
		   });
		addAnnotation
		  (severityNumberEEnum,
		   source,
		   new String[] {
			   "documentation", "*\nPossible values for LogRecord.SeverityNumber."
		   });
		addAnnotation
		  (severityNumberEEnum.getELiterals().get(0),
		   source,
		   new String[] {
			   "documentation", "*\nUNSPECIFIED is the default SeverityNumber, it MUST not be used."
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2011/Xcore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createXcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2011/Xcore";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "Ecore", "http://www.eclipse.org/emf/2002/Ecore",
			   "GenModel", "http://www.eclipse.org/emf/2002/GenModel",
			   "Nasdanika", "urn:org.nasdanika"
		   });
	}

} //LogsPackageImpl
