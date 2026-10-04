/**
 */
package org.nasdanika.sdk.runtime.models.telemetry.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.nasdanika.sdk.runtime.models.telemetry.AnyValue;
import org.nasdanika.sdk.runtime.models.telemetry.InstrumentationScope;
import org.nasdanika.sdk.runtime.models.telemetry.KeyValue;
import org.nasdanika.sdk.runtime.models.telemetry.Resource;
import org.nasdanika.sdk.runtime.models.telemetry.TelemetryFactory;
import org.nasdanika.sdk.runtime.models.telemetry.TelemetryPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TelemetryPackageImpl extends EPackageImpl implements TelemetryPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass instrumentationScopeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass keyValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass anyValueEClass = null;

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
	 * @see org.nasdanika.sdk.runtime.models.telemetry.TelemetryPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private TelemetryPackageImpl() {
		super(eNS_URI, TelemetryFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link TelemetryPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static TelemetryPackage init() {
		if (isInited) return (TelemetryPackage)EPackage.Registry.INSTANCE.getEPackage(TelemetryPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredTelemetryPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		TelemetryPackageImpl theTelemetryPackage = registeredTelemetryPackage instanceof TelemetryPackageImpl ? (TelemetryPackageImpl)registeredTelemetryPackage : new TelemetryPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theTelemetryPackage.createPackageContents();

		// Initialize created meta-data
		theTelemetryPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theTelemetryPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(TelemetryPackage.eNS_URI, theTelemetryPackage);
		return theTelemetryPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResource() {
		return resourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResource_Attributes() {
		return (EReference)resourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResource_DroppedAttributesCount() {
		return (EAttribute)resourceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResource_SchemaUrl() {
		return (EAttribute)resourceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInstrumentationScope() {
		return instrumentationScopeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInstrumentationScope_Name() {
		return (EAttribute)instrumentationScopeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInstrumentationScope_Version() {
		return (EAttribute)instrumentationScopeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInstrumentationScope_Attributes() {
		return (EReference)instrumentationScopeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInstrumentationScope_DroppedAttributesCount() {
		return (EAttribute)instrumentationScopeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInstrumentationScope_SchemaUrl() {
		return (EAttribute)instrumentationScopeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getKeyValue() {
		return keyValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKeyValue_Key() {
		return (EAttribute)keyValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKeyValue_Value() {
		return (EReference)keyValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnyValue() {
		return anyValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnyValue_StringValue() {
		return (EAttribute)anyValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnyValue_BoolValue() {
		return (EAttribute)anyValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnyValue_IntValue() {
		return (EAttribute)anyValueEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnyValue_DoubleValue() {
		return (EAttribute)anyValueEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnyValue_ArrayValue() {
		return (EReference)anyValueEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnyValue_KvlistValue() {
		return (EReference)anyValueEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnyValue_BytesValue() {
		return (EAttribute)anyValueEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TelemetryFactory getTelemetryFactory() {
		return (TelemetryFactory)getEFactoryInstance();
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
		resourceEClass = createEClass(RESOURCE);
		createEReference(resourceEClass, RESOURCE__ATTRIBUTES);
		createEAttribute(resourceEClass, RESOURCE__DROPPED_ATTRIBUTES_COUNT);
		createEAttribute(resourceEClass, RESOURCE__SCHEMA_URL);

		instrumentationScopeEClass = createEClass(INSTRUMENTATION_SCOPE);
		createEAttribute(instrumentationScopeEClass, INSTRUMENTATION_SCOPE__NAME);
		createEAttribute(instrumentationScopeEClass, INSTRUMENTATION_SCOPE__VERSION);
		createEReference(instrumentationScopeEClass, INSTRUMENTATION_SCOPE__ATTRIBUTES);
		createEAttribute(instrumentationScopeEClass, INSTRUMENTATION_SCOPE__DROPPED_ATTRIBUTES_COUNT);
		createEAttribute(instrumentationScopeEClass, INSTRUMENTATION_SCOPE__SCHEMA_URL);

		keyValueEClass = createEClass(KEY_VALUE);
		createEAttribute(keyValueEClass, KEY_VALUE__KEY);
		createEReference(keyValueEClass, KEY_VALUE__VALUE);

		anyValueEClass = createEClass(ANY_VALUE);
		createEAttribute(anyValueEClass, ANY_VALUE__STRING_VALUE);
		createEAttribute(anyValueEClass, ANY_VALUE__BOOL_VALUE);
		createEAttribute(anyValueEClass, ANY_VALUE__INT_VALUE);
		createEAttribute(anyValueEClass, ANY_VALUE__DOUBLE_VALUE);
		createEReference(anyValueEClass, ANY_VALUE__ARRAY_VALUE);
		createEReference(anyValueEClass, ANY_VALUE__KVLIST_VALUE);
		createEAttribute(anyValueEClass, ANY_VALUE__BYTES_VALUE);
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
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(resourceEClass, Resource.class, "Resource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getResource_Attributes(), this.getKeyValue(), null, "attributes", null, 0, -1, Resource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResource_DroppedAttributesCount(), theEcorePackage.getEInt(), "droppedAttributesCount", null, 0, 1, Resource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResource_SchemaUrl(), theEcorePackage.getEString(), "schemaUrl", null, 0, 1, Resource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(instrumentationScopeEClass, InstrumentationScope.class, "InstrumentationScope", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInstrumentationScope_Name(), theEcorePackage.getEString(), "name", null, 0, 1, InstrumentationScope.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInstrumentationScope_Version(), theEcorePackage.getEString(), "version", null, 0, 1, InstrumentationScope.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInstrumentationScope_Attributes(), this.getKeyValue(), null, "attributes", null, 0, -1, InstrumentationScope.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInstrumentationScope_DroppedAttributesCount(), theEcorePackage.getEInt(), "droppedAttributesCount", null, 0, 1, InstrumentationScope.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInstrumentationScope_SchemaUrl(), theEcorePackage.getEString(), "schemaUrl", null, 0, 1, InstrumentationScope.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(keyValueEClass, KeyValue.class, "KeyValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getKeyValue_Key(), theEcorePackage.getEString(), "key", null, 0, 1, KeyValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getKeyValue_Value(), this.getAnyValue(), null, "value", null, 0, 1, KeyValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(anyValueEClass, AnyValue.class, "AnyValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAnyValue_StringValue(), theEcorePackage.getEString(), "stringValue", null, 0, 1, AnyValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnyValue_BoolValue(), theEcorePackage.getEBooleanObject(), "boolValue", null, 0, 1, AnyValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnyValue_IntValue(), theEcorePackage.getELongObject(), "intValue", null, 0, 1, AnyValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnyValue_DoubleValue(), theEcorePackage.getEDoubleObject(), "doubleValue", null, 0, 1, AnyValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAnyValue_ArrayValue(), this.getAnyValue(), null, "arrayValue", null, 0, -1, AnyValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAnyValue_KvlistValue(), this.getKeyValue(), null, "kvlistValue", null, 0, -1, AnyValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnyValue_BytesValue(), theEcorePackage.getEByteArray(), "bytesValue", null, 0, 1, AnyValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
			   "basePackage", "org.nasdanika.sdk.runtime.models"
		   });
		addAnnotation
		  (resourceEClass,
		   source,
		   new String[] {
			   "documentation", "*\nResource represents the entity producing telemetry as Attributes.\nFor example, a process producing telemetry that is running in a container on Kubernetes has a Pod name, it is in a namespace and possibly is part of a Deployment which also has a name.\nAll three of these attributes can be included in the Resource."
		   });
		addAnnotation
		  (getResource_Attributes(),
		   source,
		   new String[] {
			   "documentation", "*\nSet of attributes that describe the resource."
		   });
		addAnnotation
		  (getResource_DroppedAttributesCount(),
		   source,
		   new String[] {
			   "documentation", "*\ndroppedAttributesCount is the number of dropped attributes. If the value is 0, then no attributes were dropped."
		   });
		addAnnotation
		  (getResource_SchemaUrl(),
		   source,
		   new String[] {
			   "documentation", "*\nschema_url contains the URL that describes the semantics of the attributes."
		   });
		addAnnotation
		  (instrumentationScopeEClass,
		   source,
		   new String[] {
			   "documentation", "*\nInstrumentationScope is a message representing the instrumentation scope information such as the fully qualified name and version."
		   });
		addAnnotation
		  (getInstrumentationScope_Name(),
		   source,
		   new String[] {
			   "documentation", "*\nAn empty instrumentation scope name means the name is unknown."
		   });
		addAnnotation
		  (getInstrumentationScope_Attributes(),
		   source,
		   new String[] {
			   "documentation", "*\nAdditional attributes that describe the scope. Use of this parameter is optional."
		   });
		addAnnotation
		  (getInstrumentationScope_SchemaUrl(),
		   source,
		   new String[] {
			   "documentation", "*\nschema_url contains the URL that describes the semantics of the attributes."
		   });
		addAnnotation
		  (keyValueEClass,
		   source,
		   new String[] {
			   "documentation", "*\nKeyValue is a key-value pair that is used to store Span attributes, Link attributes, etc."
		   });
		addAnnotation
		  (getKeyValue_Value(),
		   source,
		   new String[] {
			   "documentation", "*\nThe value associated with the key."
		   });
		addAnnotation
		  (anyValueEClass,
		   source,
		   new String[] {
			   "documentation", "*\nAnyValue is used to represent any type of attribute value. AnyValue may contain a primitive value such as a string or integer or it may contain an arbitrary nested object containing arrays, key-value lists and primitives."
		   });
		addAnnotation
		  (getAnyValue_ArrayValue(),
		   source,
		   new String[] {
			   "documentation", "*\nRepresents an array of any value."
		   });
		addAnnotation
		  (getAnyValue_KvlistValue(),
		   source,
		   new String[] {
			   "documentation", "*\nRepresents a list of key-value pairs."
		   });
		addAnnotation
		  (getAnyValue_BytesValue(),
		   source,
		   new String[] {
			   "documentation", "*\nRepresents raw bytes value."
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

} //TelemetryPackageImpl
