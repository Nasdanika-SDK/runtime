/**
 */
package org.nasdanika.sdk.runtime.models.telemetry;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see org.nasdanika.sdk.runtime.models.telemetry.TelemetryFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel modelDirectory='/org.nasdanika.sdk.runtime.models.telemetry.model/src-gen' featureDelegation='Dynamic' complianceLevel='25' suppressGenModelAnnotations='false' copyrightFields='false' operationReflection='true' importOrganizing='true' basePackage='org.nasdanika.sdk.runtime.models'"
 *        annotation="http://www.eclipse.org/emf/2011/Xcore Ecore='http://www.eclipse.org/emf/2002/Ecore' GenModel='http://www.eclipse.org/emf/2002/GenModel' Nasdanika='urn:org.nasdanika'"
 * @generated
 */
public interface TelemetryPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "telemetry";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "https://runtime.sdk.nasdanika.org/models/telemetry";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.nasdanika.sdk.runtime.models.telemetry";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TelemetryPackage eINSTANCE = org.nasdanika.sdk.runtime.models.telemetry.impl.TelemetryPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.telemetry.impl.ResourceImpl <em>Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.telemetry.impl.ResourceImpl
	 * @see org.nasdanika.sdk.runtime.models.telemetry.impl.TelemetryPackageImpl#getResource()
	 * @generated
	 */
	int RESOURCE = 0;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__ATTRIBUTES = 0;

	/**
	 * The feature id for the '<em><b>Dropped Attributes Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__DROPPED_ATTRIBUTES_COUNT = 1;

	/**
	 * The feature id for the '<em><b>Schema Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__SCHEMA_URL = 2;

	/**
	 * The number of structural features of the '<em>Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.telemetry.impl.InstrumentationScopeImpl <em>Instrumentation Scope</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.telemetry.impl.InstrumentationScopeImpl
	 * @see org.nasdanika.sdk.runtime.models.telemetry.impl.TelemetryPackageImpl#getInstrumentationScope()
	 * @generated
	 */
	int INSTRUMENTATION_SCOPE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUMENTATION_SCOPE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUMENTATION_SCOPE__VERSION = 1;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUMENTATION_SCOPE__ATTRIBUTES = 2;

	/**
	 * The feature id for the '<em><b>Dropped Attributes Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUMENTATION_SCOPE__DROPPED_ATTRIBUTES_COUNT = 3;

	/**
	 * The feature id for the '<em><b>Schema Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUMENTATION_SCOPE__SCHEMA_URL = 4;

	/**
	 * The number of structural features of the '<em>Instrumentation Scope</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUMENTATION_SCOPE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Instrumentation Scope</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUMENTATION_SCOPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.telemetry.impl.KeyValueImpl <em>Key Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.telemetry.impl.KeyValueImpl
	 * @see org.nasdanika.sdk.runtime.models.telemetry.impl.TelemetryPackageImpl#getKeyValue()
	 * @generated
	 */
	int KEY_VALUE = 2;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_VALUE__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_VALUE__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Key Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_VALUE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Key Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_VALUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.telemetry.impl.AnyValueImpl <em>Any Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.telemetry.impl.AnyValueImpl
	 * @see org.nasdanika.sdk.runtime.models.telemetry.impl.TelemetryPackageImpl#getAnyValue()
	 * @generated
	 */
	int ANY_VALUE = 3;

	/**
	 * The feature id for the '<em><b>String Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANY_VALUE__STRING_VALUE = 0;

	/**
	 * The feature id for the '<em><b>Bool Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANY_VALUE__BOOL_VALUE = 1;

	/**
	 * The feature id for the '<em><b>Int Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANY_VALUE__INT_VALUE = 2;

	/**
	 * The feature id for the '<em><b>Double Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANY_VALUE__DOUBLE_VALUE = 3;

	/**
	 * The feature id for the '<em><b>Array Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANY_VALUE__ARRAY_VALUE = 4;

	/**
	 * The feature id for the '<em><b>Kvlist Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANY_VALUE__KVLIST_VALUE = 5;

	/**
	 * The feature id for the '<em><b>Bytes Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANY_VALUE__BYTES_VALUE = 6;

	/**
	 * The number of structural features of the '<em>Any Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANY_VALUE_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Any Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANY_VALUE_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.telemetry.Resource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource</em>'.
	 * @see org.nasdanika.sdk.runtime.models.telemetry.Resource
	 * @generated
	 */
	EClass getResource();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.sdk.runtime.models.telemetry.Resource#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attributes</em>'.
	 * @see org.nasdanika.sdk.runtime.models.telemetry.Resource#getAttributes()
	 * @see #getResource()
	 * @generated
	 */
	EReference getResource_Attributes();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.telemetry.Resource#getDroppedAttributesCount <em>Dropped Attributes Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dropped Attributes Count</em>'.
	 * @see org.nasdanika.sdk.runtime.models.telemetry.Resource#getDroppedAttributesCount()
	 * @see #getResource()
	 * @generated
	 */
	EAttribute getResource_DroppedAttributesCount();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.telemetry.Resource#getSchemaUrl <em>Schema Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Schema Url</em>'.
	 * @see org.nasdanika.sdk.runtime.models.telemetry.Resource#getSchemaUrl()
	 * @see #getResource()
	 * @generated
	 */
	EAttribute getResource_SchemaUrl();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.telemetry.InstrumentationScope <em>Instrumentation Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instrumentation Scope</em>'.
	 * @see org.nasdanika.sdk.runtime.models.telemetry.InstrumentationScope
	 * @generated
	 */
	EClass getInstrumentationScope();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.telemetry.InstrumentationScope#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.nasdanika.sdk.runtime.models.telemetry.InstrumentationScope#getName()
	 * @see #getInstrumentationScope()
	 * @generated
	 */
	EAttribute getInstrumentationScope_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.telemetry.InstrumentationScope#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see org.nasdanika.sdk.runtime.models.telemetry.InstrumentationScope#getVersion()
	 * @see #getInstrumentationScope()
	 * @generated
	 */
	EAttribute getInstrumentationScope_Version();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.sdk.runtime.models.telemetry.InstrumentationScope#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attributes</em>'.
	 * @see org.nasdanika.sdk.runtime.models.telemetry.InstrumentationScope#getAttributes()
	 * @see #getInstrumentationScope()
	 * @generated
	 */
	EReference getInstrumentationScope_Attributes();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.telemetry.InstrumentationScope#getDroppedAttributesCount <em>Dropped Attributes Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dropped Attributes Count</em>'.
	 * @see org.nasdanika.sdk.runtime.models.telemetry.InstrumentationScope#getDroppedAttributesCount()
	 * @see #getInstrumentationScope()
	 * @generated
	 */
	EAttribute getInstrumentationScope_DroppedAttributesCount();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.telemetry.InstrumentationScope#getSchemaUrl <em>Schema Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Schema Url</em>'.
	 * @see org.nasdanika.sdk.runtime.models.telemetry.InstrumentationScope#getSchemaUrl()
	 * @see #getInstrumentationScope()
	 * @generated
	 */
	EAttribute getInstrumentationScope_SchemaUrl();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.telemetry.KeyValue <em>Key Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Key Value</em>'.
	 * @see org.nasdanika.sdk.runtime.models.telemetry.KeyValue
	 * @generated
	 */
	EClass getKeyValue();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.telemetry.KeyValue#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see org.nasdanika.sdk.runtime.models.telemetry.KeyValue#getKey()
	 * @see #getKeyValue()
	 * @generated
	 */
	EAttribute getKeyValue_Key();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.sdk.runtime.models.telemetry.KeyValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see org.nasdanika.sdk.runtime.models.telemetry.KeyValue#getValue()
	 * @see #getKeyValue()
	 * @generated
	 */
	EReference getKeyValue_Value();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.telemetry.AnyValue <em>Any Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Any Value</em>'.
	 * @see org.nasdanika.sdk.runtime.models.telemetry.AnyValue
	 * @generated
	 */
	EClass getAnyValue();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.telemetry.AnyValue#getStringValue <em>String Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>String Value</em>'.
	 * @see org.nasdanika.sdk.runtime.models.telemetry.AnyValue#getStringValue()
	 * @see #getAnyValue()
	 * @generated
	 */
	EAttribute getAnyValue_StringValue();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.telemetry.AnyValue#getBoolValue <em>Bool Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bool Value</em>'.
	 * @see org.nasdanika.sdk.runtime.models.telemetry.AnyValue#getBoolValue()
	 * @see #getAnyValue()
	 * @generated
	 */
	EAttribute getAnyValue_BoolValue();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.telemetry.AnyValue#getIntValue <em>Int Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Int Value</em>'.
	 * @see org.nasdanika.sdk.runtime.models.telemetry.AnyValue#getIntValue()
	 * @see #getAnyValue()
	 * @generated
	 */
	EAttribute getAnyValue_IntValue();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.telemetry.AnyValue#getDoubleValue <em>Double Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Double Value</em>'.
	 * @see org.nasdanika.sdk.runtime.models.telemetry.AnyValue#getDoubleValue()
	 * @see #getAnyValue()
	 * @generated
	 */
	EAttribute getAnyValue_DoubleValue();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.sdk.runtime.models.telemetry.AnyValue#getArrayValue <em>Array Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Array Value</em>'.
	 * @see org.nasdanika.sdk.runtime.models.telemetry.AnyValue#getArrayValue()
	 * @see #getAnyValue()
	 * @generated
	 */
	EReference getAnyValue_ArrayValue();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.sdk.runtime.models.telemetry.AnyValue#getKvlistValue <em>Kvlist Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Kvlist Value</em>'.
	 * @see org.nasdanika.sdk.runtime.models.telemetry.AnyValue#getKvlistValue()
	 * @see #getAnyValue()
	 * @generated
	 */
	EReference getAnyValue_KvlistValue();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.telemetry.AnyValue#getBytesValue <em>Bytes Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bytes Value</em>'.
	 * @see org.nasdanika.sdk.runtime.models.telemetry.AnyValue#getBytesValue()
	 * @see #getAnyValue()
	 * @generated
	 */
	EAttribute getAnyValue_BytesValue();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TelemetryFactory getTelemetryFactory();

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
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.telemetry.impl.ResourceImpl <em>Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.telemetry.impl.ResourceImpl
		 * @see org.nasdanika.sdk.runtime.models.telemetry.impl.TelemetryPackageImpl#getResource()
		 * @generated
		 */
		EClass RESOURCE = eINSTANCE.getResource();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE__ATTRIBUTES = eINSTANCE.getResource_Attributes();

		/**
		 * The meta object literal for the '<em><b>Dropped Attributes Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE__DROPPED_ATTRIBUTES_COUNT = eINSTANCE.getResource_DroppedAttributesCount();

		/**
		 * The meta object literal for the '<em><b>Schema Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE__SCHEMA_URL = eINSTANCE.getResource_SchemaUrl();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.telemetry.impl.InstrumentationScopeImpl <em>Instrumentation Scope</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.telemetry.impl.InstrumentationScopeImpl
		 * @see org.nasdanika.sdk.runtime.models.telemetry.impl.TelemetryPackageImpl#getInstrumentationScope()
		 * @generated
		 */
		EClass INSTRUMENTATION_SCOPE = eINSTANCE.getInstrumentationScope();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTRUMENTATION_SCOPE__NAME = eINSTANCE.getInstrumentationScope_Name();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTRUMENTATION_SCOPE__VERSION = eINSTANCE.getInstrumentationScope_Version();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSTRUMENTATION_SCOPE__ATTRIBUTES = eINSTANCE.getInstrumentationScope_Attributes();

		/**
		 * The meta object literal for the '<em><b>Dropped Attributes Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTRUMENTATION_SCOPE__DROPPED_ATTRIBUTES_COUNT = eINSTANCE.getInstrumentationScope_DroppedAttributesCount();

		/**
		 * The meta object literal for the '<em><b>Schema Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTRUMENTATION_SCOPE__SCHEMA_URL = eINSTANCE.getInstrumentationScope_SchemaUrl();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.telemetry.impl.KeyValueImpl <em>Key Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.telemetry.impl.KeyValueImpl
		 * @see org.nasdanika.sdk.runtime.models.telemetry.impl.TelemetryPackageImpl#getKeyValue()
		 * @generated
		 */
		EClass KEY_VALUE = eINSTANCE.getKeyValue();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KEY_VALUE__KEY = eINSTANCE.getKeyValue_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KEY_VALUE__VALUE = eINSTANCE.getKeyValue_Value();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.telemetry.impl.AnyValueImpl <em>Any Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.telemetry.impl.AnyValueImpl
		 * @see org.nasdanika.sdk.runtime.models.telemetry.impl.TelemetryPackageImpl#getAnyValue()
		 * @generated
		 */
		EClass ANY_VALUE = eINSTANCE.getAnyValue();

		/**
		 * The meta object literal for the '<em><b>String Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANY_VALUE__STRING_VALUE = eINSTANCE.getAnyValue_StringValue();

		/**
		 * The meta object literal for the '<em><b>Bool Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANY_VALUE__BOOL_VALUE = eINSTANCE.getAnyValue_BoolValue();

		/**
		 * The meta object literal for the '<em><b>Int Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANY_VALUE__INT_VALUE = eINSTANCE.getAnyValue_IntValue();

		/**
		 * The meta object literal for the '<em><b>Double Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANY_VALUE__DOUBLE_VALUE = eINSTANCE.getAnyValue_DoubleValue();

		/**
		 * The meta object literal for the '<em><b>Array Value</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANY_VALUE__ARRAY_VALUE = eINSTANCE.getAnyValue_ArrayValue();

		/**
		 * The meta object literal for the '<em><b>Kvlist Value</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANY_VALUE__KVLIST_VALUE = eINSTANCE.getAnyValue_KvlistValue();

		/**
		 * The meta object literal for the '<em><b>Bytes Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANY_VALUE__BYTES_VALUE = eINSTANCE.getAnyValue_BytesValue();

	}

} //TelemetryPackage
