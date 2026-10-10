/**
 */
package org.nasdanika.sdk.runtime.models.telemetry.traces.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.change.ChangePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.nasdanika.sdk.runtime.models.telemetry.TelemetryPackage;

import org.nasdanika.sdk.runtime.models.telemetry.logs.LogsPackage;

import org.nasdanika.sdk.runtime.models.telemetry.traces.FeatureChange;
import org.nasdanika.sdk.runtime.models.telemetry.traces.ResourceChange;
import org.nasdanika.sdk.runtime.models.telemetry.traces.ResourceSpans;
import org.nasdanika.sdk.runtime.models.telemetry.traces.ScopeSpans;
import org.nasdanika.sdk.runtime.models.telemetry.traces.Span;
import org.nasdanika.sdk.runtime.models.telemetry.traces.SpanEvent;
import org.nasdanika.sdk.runtime.models.telemetry.traces.SpanId;
import org.nasdanika.sdk.runtime.models.telemetry.traces.SpanKind;
import org.nasdanika.sdk.runtime.models.telemetry.traces.SpanLink;
import org.nasdanika.sdk.runtime.models.telemetry.traces.SpanReference;
import org.nasdanika.sdk.runtime.models.telemetry.traces.SpanStatus;
import org.nasdanika.sdk.runtime.models.telemetry.traces.StatusCode;
import org.nasdanika.sdk.runtime.models.telemetry.traces.TracesData;
import org.nasdanika.sdk.runtime.models.telemetry.traces.TracesFactory;
import org.nasdanika.sdk.runtime.models.telemetry.traces.TracesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TracesPackageImpl extends EPackageImpl implements TracesPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracesDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceSpansEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scopeSpansEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass spanIdEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass spanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass spanEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass spanReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass spanLinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass spanStatusEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass featureChangeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceChangeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum spanKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum statusCodeEEnum = null;

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
	 * @see org.nasdanika.sdk.runtime.models.telemetry.traces.TracesPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private TracesPackageImpl() {
		super(eNS_URI, TracesFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link TracesPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static TracesPackage init() {
		if (isInited) return (TracesPackage)EPackage.Registry.INSTANCE.getEPackage(TracesPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredTracesPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		TracesPackageImpl theTracesPackage = registeredTracesPackage instanceof TracesPackageImpl ? (TracesPackageImpl)registeredTracesPackage : new TracesPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		TelemetryPackage.eINSTANCE.eClass();
		EcorePackage.eINSTANCE.eClass();
		ChangePackage.eINSTANCE.eClass();
		LogsPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theTracesPackage.createPackageContents();

		// Initialize created meta-data
		theTracesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theTracesPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(TracesPackage.eNS_URI, theTracesPackage);
		return theTracesPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracesData() {
		return tracesDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracesData_ResourceSpans() {
		return (EReference)tracesDataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResourceSpans() {
		return resourceSpansEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceSpans_Resource() {
		return (EReference)resourceSpansEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceSpans_ScopeSpans() {
		return (EReference)resourceSpansEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResourceSpans_SchemaUrl() {
		return (EAttribute)resourceSpansEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getScopeSpans() {
		return scopeSpansEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScopeSpans_Scope() {
		return (EReference)scopeSpansEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScopeSpans_Spans() {
		return (EReference)scopeSpansEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScopeSpans_SchemaUrl() {
		return (EAttribute)scopeSpansEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSpanId() {
		return spanIdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpanId_TraceId() {
		return (EAttribute)spanIdEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpanId_SpanId() {
		return (EAttribute)spanIdEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSpan() {
		return spanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpan_TraceState() {
		return (EAttribute)spanEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpan_ParentSpanId() {
		return (EAttribute)spanEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpan_Name() {
		return (EAttribute)spanEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpan_Kind() {
		return (EAttribute)spanEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpan_StartTimeUnixNano() {
		return (EAttribute)spanEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpan_EndTimeUnixNano() {
		return (EAttribute)spanEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpan_Attributes() {
		return (EReference)spanEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpan_DroppedAttributesCount() {
		return (EAttribute)spanEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpan_Events() {
		return (EReference)spanEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpan_DroppedEventsCount() {
		return (EAttribute)spanEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpan_Links() {
		return (EReference)spanEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpan_DroppedLinksCount() {
		return (EAttribute)spanEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpan_Status() {
		return (EReference)spanEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpan_Flags() {
		return (EAttribute)spanEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpan_ChangeDescription() {
		return (EReference)spanEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpan_LogRecords() {
		return (EReference)spanEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpan_Children() {
		return (EReference)spanEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpan_Referrers() {
		return (EReference)spanEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSpanEvent() {
		return spanEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpanEvent_TimeUnixNano() {
		return (EAttribute)spanEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpanEvent_Name() {
		return (EAttribute)spanEventEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpanEvent_Attributes() {
		return (EReference)spanEventEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpanEvent_DroppedAttributesCount() {
		return (EAttribute)spanEventEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSpanReference() {
		return spanReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpanReference_Span() {
		return (EReference)spanReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSpanLink() {
		return spanLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpanLink_TraceState() {
		return (EAttribute)spanLinkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpanLink_Attributes() {
		return (EReference)spanLinkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpanLink_DroppedAttributesCount() {
		return (EAttribute)spanLinkEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpanLink_Flags() {
		return (EAttribute)spanLinkEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSpanStatus() {
		return spanStatusEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpanStatus_Message() {
		return (EAttribute)spanStatusEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpanStatus_Code() {
		return (EAttribute)spanStatusEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFeatureChange() {
		return featureChangeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResourceChange() {
		return resourceChangeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSpanKind() {
		return spanKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getStatusCode() {
		return statusCodeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracesFactory getTracesFactory() {
		return (TracesFactory)getEFactoryInstance();
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
		tracesDataEClass = createEClass(TRACES_DATA);
		createEReference(tracesDataEClass, TRACES_DATA__RESOURCE_SPANS);

		resourceSpansEClass = createEClass(RESOURCE_SPANS);
		createEReference(resourceSpansEClass, RESOURCE_SPANS__RESOURCE);
		createEReference(resourceSpansEClass, RESOURCE_SPANS__SCOPE_SPANS);
		createEAttribute(resourceSpansEClass, RESOURCE_SPANS__SCHEMA_URL);

		scopeSpansEClass = createEClass(SCOPE_SPANS);
		createEReference(scopeSpansEClass, SCOPE_SPANS__SCOPE);
		createEReference(scopeSpansEClass, SCOPE_SPANS__SPANS);
		createEAttribute(scopeSpansEClass, SCOPE_SPANS__SCHEMA_URL);

		spanIdEClass = createEClass(SPAN_ID);
		createEAttribute(spanIdEClass, SPAN_ID__TRACE_ID);
		createEAttribute(spanIdEClass, SPAN_ID__SPAN_ID);

		spanEClass = createEClass(SPAN);
		createEAttribute(spanEClass, SPAN__TRACE_STATE);
		createEAttribute(spanEClass, SPAN__PARENT_SPAN_ID);
		createEAttribute(spanEClass, SPAN__NAME);
		createEAttribute(spanEClass, SPAN__KIND);
		createEAttribute(spanEClass, SPAN__START_TIME_UNIX_NANO);
		createEAttribute(spanEClass, SPAN__END_TIME_UNIX_NANO);
		createEReference(spanEClass, SPAN__ATTRIBUTES);
		createEAttribute(spanEClass, SPAN__DROPPED_ATTRIBUTES_COUNT);
		createEReference(spanEClass, SPAN__EVENTS);
		createEAttribute(spanEClass, SPAN__DROPPED_EVENTS_COUNT);
		createEReference(spanEClass, SPAN__LINKS);
		createEAttribute(spanEClass, SPAN__DROPPED_LINKS_COUNT);
		createEReference(spanEClass, SPAN__STATUS);
		createEAttribute(spanEClass, SPAN__FLAGS);
		createEReference(spanEClass, SPAN__CHANGE_DESCRIPTION);
		createEReference(spanEClass, SPAN__LOG_RECORDS);
		createEReference(spanEClass, SPAN__CHILDREN);
		createEReference(spanEClass, SPAN__REFERRERS);

		spanEventEClass = createEClass(SPAN_EVENT);
		createEAttribute(spanEventEClass, SPAN_EVENT__TIME_UNIX_NANO);
		createEAttribute(spanEventEClass, SPAN_EVENT__NAME);
		createEReference(spanEventEClass, SPAN_EVENT__ATTRIBUTES);
		createEAttribute(spanEventEClass, SPAN_EVENT__DROPPED_ATTRIBUTES_COUNT);

		spanReferenceEClass = createEClass(SPAN_REFERENCE);
		createEReference(spanReferenceEClass, SPAN_REFERENCE__SPAN);

		spanLinkEClass = createEClass(SPAN_LINK);
		createEAttribute(spanLinkEClass, SPAN_LINK__TRACE_STATE);
		createEReference(spanLinkEClass, SPAN_LINK__ATTRIBUTES);
		createEAttribute(spanLinkEClass, SPAN_LINK__DROPPED_ATTRIBUTES_COUNT);
		createEAttribute(spanLinkEClass, SPAN_LINK__FLAGS);

		spanStatusEClass = createEClass(SPAN_STATUS);
		createEAttribute(spanStatusEClass, SPAN_STATUS__MESSAGE);
		createEAttribute(spanStatusEClass, SPAN_STATUS__CODE);

		featureChangeEClass = createEClass(FEATURE_CHANGE);

		resourceChangeEClass = createEClass(RESOURCE_CHANGE);

		// Create enums
		spanKindEEnum = createEEnum(SPAN_KIND);
		statusCodeEEnum = createEEnum(STATUS_CODE);
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
		ChangePackage theChangePackage = (ChangePackage)EPackage.Registry.INSTANCE.getEPackage(ChangePackage.eNS_URI);
		LogsPackage theLogsPackage = (LogsPackage)EPackage.Registry.INSTANCE.getEPackage(LogsPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		spanEClass.getESuperTypes().add(this.getSpanId());
		spanReferenceEClass.getESuperTypes().add(this.getSpanId());
		spanLinkEClass.getESuperTypes().add(this.getSpanReference());
		featureChangeEClass.getESuperTypes().add(theChangePackage.getFeatureChange());
		featureChangeEClass.getESuperTypes().add(this.getSpanReference());
		resourceChangeEClass.getESuperTypes().add(theChangePackage.getResourceChange());
		resourceChangeEClass.getESuperTypes().add(this.getSpanReference());

		// Initialize classes and features; add operations and parameters
		initEClass(tracesDataEClass, TracesData.class, "TracesData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTracesData_ResourceSpans(), this.getResourceSpans(), null, "resourceSpans", null, 0, -1, TracesData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resourceSpansEClass, ResourceSpans.class, "ResourceSpans", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getResourceSpans_Resource(), theTelemetryPackage.getResource(), null, "resource", null, 0, 1, ResourceSpans.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResourceSpans_ScopeSpans(), this.getScopeSpans(), null, "scopeSpans", null, 0, -1, ResourceSpans.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResourceSpans_SchemaUrl(), theEcorePackage.getEString(), "schemaUrl", null, 0, 1, ResourceSpans.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(scopeSpansEClass, ScopeSpans.class, "ScopeSpans", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getScopeSpans_Scope(), theTelemetryPackage.getInstrumentationScope(), null, "scope", null, 0, 1, ScopeSpans.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getScopeSpans_Spans(), this.getSpan(), null, "spans", null, 0, -1, ScopeSpans.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getScopeSpans_SchemaUrl(), theEcorePackage.getEString(), "schemaUrl", null, 0, 1, ScopeSpans.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(spanIdEClass, SpanId.class, "SpanId", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSpanId_TraceId(), theEcorePackage.getEString(), "traceId", null, 0, 1, SpanId.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpanId_SpanId(), theEcorePackage.getEString(), "spanId", null, 0, 1, SpanId.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(spanEClass, Span.class, "Span", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSpan_TraceState(), theEcorePackage.getEString(), "traceState", null, 0, 1, Span.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpan_ParentSpanId(), theEcorePackage.getEString(), "parentSpanId", null, 0, 1, Span.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpan_Name(), theEcorePackage.getEString(), "name", null, 1, 1, Span.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpan_Kind(), this.getSpanKind(), "kind", null, 0, 1, Span.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpan_StartTimeUnixNano(), theEcorePackage.getELong(), "startTimeUnixNano", null, 0, 1, Span.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpan_EndTimeUnixNano(), theEcorePackage.getELong(), "endTimeUnixNano", null, 0, 1, Span.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSpan_Attributes(), theTelemetryPackage.getKeyValue(), null, "attributes", null, 0, -1, Span.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpan_DroppedAttributesCount(), theEcorePackage.getEInt(), "droppedAttributesCount", null, 0, 1, Span.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSpan_Events(), this.getSpanEvent(), null, "events", null, 0, -1, Span.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpan_DroppedEventsCount(), theEcorePackage.getEInt(), "droppedEventsCount", null, 0, 1, Span.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSpan_Links(), this.getSpanLink(), null, "links", null, 0, -1, Span.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpan_DroppedLinksCount(), theEcorePackage.getEInt(), "droppedLinksCount", null, 0, 1, Span.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSpan_Status(), this.getSpanStatus(), null, "status", null, 0, 1, Span.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpan_Flags(), theEcorePackage.getEInt(), "flags", null, 0, 1, Span.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSpan_ChangeDescription(), theChangePackage.getChangeDescription(), null, "changeDescription", null, 0, 1, Span.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSpan_LogRecords(), theLogsPackage.getLogRecord(), null, "logRecords", null, 0, -1, Span.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSpan_Children(), this.getSpan(), null, "children", null, 0, -1, Span.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getSpan_Children().getEKeys().add(this.getSpanId_TraceId());
		getSpan_Children().getEKeys().add(this.getSpanId_SpanId());
		initEReference(getSpan_Referrers(), this.getSpanReference(), this.getSpanReference_Span(), "referrers", null, 0, -1, Span.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(spanEventEClass, SpanEvent.class, "SpanEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSpanEvent_TimeUnixNano(), theEcorePackage.getELong(), "timeUnixNano", null, 0, 1, SpanEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpanEvent_Name(), theEcorePackage.getEString(), "name", null, 1, 1, SpanEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSpanEvent_Attributes(), theTelemetryPackage.getKeyValue(), null, "attributes", null, 0, -1, SpanEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpanEvent_DroppedAttributesCount(), theEcorePackage.getEInt(), "droppedAttributesCount", null, 0, 1, SpanEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(spanReferenceEClass, SpanReference.class, "SpanReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSpanReference_Span(), this.getSpan(), this.getSpan_Referrers(), "span", null, 0, 1, SpanReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(spanLinkEClass, SpanLink.class, "SpanLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSpanLink_TraceState(), theEcorePackage.getEString(), "traceState", null, 0, 1, SpanLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSpanLink_Attributes(), theTelemetryPackage.getKeyValue(), null, "attributes", null, 0, -1, SpanLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpanLink_DroppedAttributesCount(), theEcorePackage.getEInt(), "droppedAttributesCount", null, 0, 1, SpanLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpanLink_Flags(), theEcorePackage.getEInt(), "flags", null, 0, 1, SpanLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(spanStatusEClass, SpanStatus.class, "SpanStatus", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSpanStatus_Message(), theEcorePackage.getEString(), "message", null, 0, 1, SpanStatus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpanStatus_Code(), this.getStatusCode(), "code", null, 0, 1, SpanStatus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(featureChangeEClass, FeatureChange.class, "FeatureChange", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(resourceChangeEClass, ResourceChange.class, "ResourceChange", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(spanKindEEnum, SpanKind.class, "SpanKind");
		addEEnumLiteral(spanKindEEnum, SpanKind.SPAN_KIND_UNSPECIFIED);
		addEEnumLiteral(spanKindEEnum, SpanKind.SPAN_KIND_INTERNAL);
		addEEnumLiteral(spanKindEEnum, SpanKind.SPAN_KIND_SERVER);
		addEEnumLiteral(spanKindEEnum, SpanKind.SPAN_KIND_CLIENT);
		addEEnumLiteral(spanKindEEnum, SpanKind.SPAN_KIND_PRODUCER);
		addEEnumLiteral(spanKindEEnum, SpanKind.SPAN_KIND_CONSUMER);

		initEEnum(statusCodeEEnum, StatusCode.class, "StatusCode");
		addEEnumLiteral(statusCodeEEnum, StatusCode.STATUS_CODE_UNSET);
		addEEnumLiteral(statusCodeEEnum, StatusCode.STATUS_CODE_OK);
		addEEnumLiteral(statusCodeEEnum, StatusCode.STATUS_CODE_ERROR);

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
			   "operationReflection", "false",
			   "importOrganizing", "true",
			   "basePackage", "org.nasdanika.sdk.runtime.models.telemetry"
		   });
		addAnnotation
		  (tracesDataEClass,
		   source,
		   new String[] {
			   "documentation", "*\nTracesData represents the traces export payload which can be serialized to different formats, e.g., OTLP/gRPC, JSON, and proto."
		   });
		addAnnotation
		  (getTracesData_ResourceSpans(),
		   source,
		   new String[] {
			   "documentation", "*\nAn array of ResourceSpans. For data coming from a single resource this array will typically contain one element. Intermediary nodes that receive data from multiple origins typically batch the data before forwarding further."
		   });
		addAnnotation
		  (resourceSpansEClass,
		   source,
		   new String[] {
			   "documentation", "*\nA collection of ScopeSpans from a Resource."
		   });
		addAnnotation
		  (getResourceSpans_Resource(),
		   source,
		   new String[] {
			   "documentation", "*\nThe resource for the spans in this message. If this field is not set then no resource info is known."
		   });
		addAnnotation
		  (getResourceSpans_ScopeSpans(),
		   source,
		   new String[] {
			   "documentation", "*\nA list of ScopeSpans that originate from a resource."
		   });
		addAnnotation
		  (getResourceSpans_SchemaUrl(),
		   source,
		   new String[] {
			   "documentation", "*\nThe URL of the schema that all spans in this message are following."
		   });
		addAnnotation
		  (scopeSpansEClass,
		   source,
		   new String[] {
			   "documentation", "*\nA collection of Spans produced by an InstrumentationScope."
		   });
		addAnnotation
		  (getScopeSpans_Scope(),
		   source,
		   new String[] {
			   "documentation", "*\nThe instrumentation scope information for the spans in this message. Semantically when InstrumentationScope isn\'t set, it is equivalent with an empty instrumentation scope name (unknown)."
		   });
		addAnnotation
		  (getScopeSpans_Spans(),
		   source,
		   new String[] {
			   "documentation", "*\nA list of Spans that originate from an instrumentation scope."
		   });
		addAnnotation
		  (spanKindEEnum,
		   source,
		   new String[] {
			   "documentation", "*\nSpanKind is the type of span. Can be used to specify additional relationships between spans in addition to a parent/child relationship."
		   });
		addAnnotation
		  (spanKindEEnum.getELiterals().get(0),
		   source,
		   new String[] {
			   "documentation", "*\nUnspecified. Do NOT use as default. Implementations MAY assume SpanKind to be INTERNAL when receiving UNSPECIFIED."
		   });
		addAnnotation
		  (spanKindEEnum.getELiterals().get(1),
		   source,
		   new String[] {
			   "documentation", "*\nIndicates that the span represents an internal operation within an application, as opposed to an operations happening at the boundaries of a process."
		   });
		addAnnotation
		  (spanKindEEnum.getELiterals().get(2),
		   source,
		   new String[] {
			   "documentation", "*\nIndicates that the span covers server-side handling of an RPC or other remote network request."
		   });
		addAnnotation
		  (spanKindEEnum.getELiterals().get(3),
		   source,
		   new String[] {
			   "documentation", "*\nIndicates that the span describes a request to some remote service."
		   });
		addAnnotation
		  (spanKindEEnum.getELiterals().get(4),
		   source,
		   new String[] {
			   "documentation", "*\nIndicates that the span describes a producer sending a message to a broker. Unlike CLIENT and SERVER, there is often no direct critical-path latency relationship between producer and consumer spans."
		   });
		addAnnotation
		  (spanKindEEnum.getELiterals().get(5),
		   source,
		   new String[] {
			   "documentation", "*\nIndicates that the span describes consumer receiving a message from a broker. Like the PRODUCER kind, there is often no direct critical-path latency relationship between producer and consumer spans."
		   });
		addAnnotation
		  (getSpanId_TraceId(),
		   source,
		   new String[] {
			   "documentation", "*\nA unique identifier for a trace. All spans from the same trace share the same trace_id.\nThe ID is a 16-byte array."
		   });
		addAnnotation
		  (getSpanId_SpanId(),
		   source,
		   new String[] {
			   "documentation", "*\nA unique identifier for a span within a trace, assigned when the span is created.\nThe ID is an 8-byte array."
		   });
		addAnnotation
		  (spanEClass,
		   source,
		   new String[] {
			   "documentation", "*\nA Span represents a single operation performed by a single component of the system.\nThe next available field id is 17."
		   });
		addAnnotation
		  (getSpan_TraceState(),
		   source,
		   new String[] {
			   "documentation", "*\ntrace_state conveys information about request position in multiple distributed tracing graphs. It is a vendor-specific format as described by the W3C Trace Context specification."
		   });
		addAnnotation
		  (getSpan_ParentSpanId(),
		   source,
		   new String[] {
			   "documentation", "*\nThe span_id of this span\'s parent span. If this is a root span, then this field must be empty. The ID is an 8-byte array."
		   });
		addAnnotation
		  (getSpan_Name(),
		   source,
		   new String[] {
			   "documentation", "*\nA description of the span\'s operation.\nFor example, the name can be a qualified method name or a file name and a line number where the operation is called. A best practice is to use the same display name at the same call point repeatably, so that users can filter and group spans based on the name."
		   });
		addAnnotation
		  (getSpan_Kind(),
		   source,
		   new String[] {
			   "documentation", "*\nDistinguishes between spans generated in a particular context."
		   });
		addAnnotation
		  (getSpan_StartTimeUnixNano(),
		   source,
		   new String[] {
			   "documentation", "*\nstart_time_unix_nano is the start time of the span. On the client side, this is the time kept by the local machine where the span execution starts. On the server side, this is the time when the server\'s application handler starts running.\nValue is UNIX Epoch time in nanoseconds since 00:00:00 UTC on 1 January 1970."
		   });
		addAnnotation
		  (getSpan_EndTimeUnixNano(),
		   source,
		   new String[] {
			   "documentation", "*\nend_time_unix_nano is the end time of the span. On the client side, this is the time kept by the local machine where the span execution ends. On the server side, this is the time when the server application handler stops running.\nValue is UNIX Epoch time in nanoseconds since 00:00:00 UTC on 1 January 1970."
		   });
		addAnnotation
		  (getSpan_Attributes(),
		   source,
		   new String[] {
			   "documentation", "*\nattributes is a collection of key/value pairs. Note, global attributes like server name can be set using the resource API."
		   });
		addAnnotation
		  (getSpan_Events(),
		   source,
		   new String[] {
			   "documentation", "*\nevents is a collection of Event items."
		   });
		addAnnotation
		  (getSpan_Links(),
		   source,
		   new String[] {
			   "documentation", "*\nlinks is a collection of Links, which are references from this span to a span in the same or different trace."
		   });
		addAnnotation
		  (getSpan_Status(),
		   source,
		   new String[] {
			   "documentation", "*\nAn optional final status for this span. Semantically when Status isn\'t set, it means span\'s status code is unset, i.e. assume STATUS_CODE_UNSET (code = 0)."
		   });
		addAnnotation
		  (getSpan_Flags(),
		   source,
		   new String[] {
			   "documentation", "*\nFlags, a bit field. 8 least significant bits are the trace flags as defined in W3C Trace Context specification."
		   });
		addAnnotation
		  (spanEventEClass,
		   source,
		   new String[] {
			   "documentation", "*\nEvent is a time-stamped annotation of the span, consisting of user-supplied text description and key-value pairs."
		   });
		addAnnotation
		  (getSpanEvent_TimeUnixNano(),
		   source,
		   new String[] {
			   "documentation", "*\ntime_unix_nano is the time the event occurred."
		   });
		addAnnotation
		  (getSpanEvent_Name(),
		   source,
		   new String[] {
			   "documentation", "*\nname of the event. This field is semantically required to be set to non-empty string by OpenTelemetry API when the event is created explicitly by the instrumentation libraries."
		   });
		addAnnotation
		  (getSpanEvent_Attributes(),
		   source,
		   new String[] {
			   "documentation", "*\nattributes is a collection of attribute key/value pairs on the event."
		   });
		addAnnotation
		  (spanLinkEClass,
		   source,
		   new String[] {
			   "documentation", "*\nA pointer from the current span to another span in the same trace or in a different trace. For example, this can be used in batching operations, where a single batch handler processes multiple requests from different traces or when the handler receives a request from a different project."
		   });
		addAnnotation
		  (getSpanLink_Attributes(),
		   source,
		   new String[] {
			   "documentation", "*\nattributes is a collection of attribute key/value pairs on the link."
		   });
		addAnnotation
		  (getSpanLink_Flags(),
		   source,
		   new String[] {
			   "documentation", "*\nFlags, a bit field."
		   });
		addAnnotation
		  (spanStatusEClass,
		   source,
		   new String[] {
			   "documentation", "*\nThe Status type defines a logical error model that is suitable for different programming environments, including REST APIs and RPC APIs."
		   });
		addAnnotation
		  (getSpanStatus_Message(),
		   source,
		   new String[] {
			   "documentation", "*\nA developer-facing human readable error message."
		   });
		addAnnotation
		  (getSpanStatus_Code(),
		   source,
		   new String[] {
			   "documentation", "*\nThe status code."
		   });
		addAnnotation
		  (statusCodeEEnum,
		   source,
		   new String[] {
			   "documentation", "*\nFor the semantics of status codes see https://github.com/open-telemetry/opentelemetry-specification/blob/main/specification/trace/api.md#set-status"
		   });
		addAnnotation
		  (statusCodeEEnum.getELiterals().get(0),
		   source,
		   new String[] {
			   "documentation", "*\nThe default status."
		   });
		addAnnotation
		  (statusCodeEEnum.getELiterals().get(1),
		   source,
		   new String[] {
			   "documentation", "*\nThe Span has been validated by an Application developer or Operator to have completed successfully."
		   });
		addAnnotation
		  (statusCodeEEnum.getELiterals().get(2),
		   source,
		   new String[] {
			   "documentation", "*\nThe Span contains an error."
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

} //TracesPackageImpl
