/**
 */
package org.nasdanika.sdk.runtime.models.jvm;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.nasdanika.sdk.runtime.models.core.CorePackage;

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
 * @see org.nasdanika.sdk.runtime.models.jvm.JvmFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel modelDirectory='/model/src-gen' featureDelegation='Dynamic' complianceLevel='25' suppressGenModelAnnotations='false' copyrightFields='false' operationReflection='true' importOrganizing='true' basePackage='org.nasdanika.sdk.runtime.models'"
 *        annotation="http://www.eclipse.org/emf/2011/Xcore Ecore='http://www.eclipse.org/emf/2002/Ecore' GenModel='http://www.eclipse.org/emf/2002/GenModel' Nasdanika='urn:org.nasdanika'"
 * @generated
 */
public interface JvmPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "jvm";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "https://runtime.sdk.nasdanika.org/models/jvm";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.nasdanika.sdk.runtime.models.jvm";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	JvmPackage eINSTANCE = org.nasdanika.sdk.runtime.models.jvm.impl.JvmPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.jvm.impl.JvmElementImpl <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.jvm.impl.JvmElementImpl
	 * @see org.nasdanika.sdk.runtime.models.jvm.impl.JvmPackageImpl#getJvmElement()
	 * @generated
	 */
	int JVM_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JVM_ELEMENT__ID = CorePackage.NAMED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JVM_ELEMENT__DOCUMENTATION = CorePackage.NAMED_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JVM_ELEMENT__DOC_REF = CorePackage.NAMED_ELEMENT__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JVM_ELEMENT__DOC_FORMAT = CorePackage.NAMED_ELEMENT__DOC_FORMAT;

	/**
	 * The feature id for the '<em><b>Doc Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JVM_ELEMENT__DOC_CONTENTS = CorePackage.NAMED_ELEMENT__DOC_CONTENTS;

	/**
	 * The feature id for the '<em><b>Doc Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JVM_ELEMENT__DOC_SECTIONS = CorePackage.NAMED_ELEMENT__DOC_SECTIONS;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JVM_ELEMENT__MARKERS = CorePackage.NAMED_ELEMENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JVM_ELEMENT__ICON = CorePackage.NAMED_ELEMENT__ICON;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JVM_ELEMENT__URIS = CorePackage.NAMED_ELEMENT__URIS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JVM_ELEMENT__NAME = CorePackage.NAMED_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JVM_ELEMENT_FEATURE_COUNT = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JVM_ELEMENT___COLLECT__OBJECT_EREFERENCE_ELIST = CorePackage.NAMED_ELEMENT___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JVM_ELEMENT___GET_REFERRERS__EREFERENCE = CorePackage.NAMED_ELEMENT___GET_REFERRERS__EREFERENCE;

	/**
	 * The number of operations of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JVM_ELEMENT_OPERATION_COUNT = CorePackage.NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.jvm.impl.JavaVirtualMachineImpl <em>Java Virtual Machine</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.jvm.impl.JavaVirtualMachineImpl
	 * @see org.nasdanika.sdk.runtime.models.jvm.impl.JvmPackageImpl#getJavaVirtualMachine()
	 * @generated
	 */
	int JAVA_VIRTUAL_MACHINE = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_VIRTUAL_MACHINE__ID = CorePackage.MODEL_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_VIRTUAL_MACHINE__DOCUMENTATION = CorePackage.MODEL_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_VIRTUAL_MACHINE__DOC_REF = CorePackage.MODEL_ELEMENT__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_VIRTUAL_MACHINE__DOC_FORMAT = CorePackage.MODEL_ELEMENT__DOC_FORMAT;

	/**
	 * The feature id for the '<em><b>Doc Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_VIRTUAL_MACHINE__DOC_CONTENTS = CorePackage.MODEL_ELEMENT__DOC_CONTENTS;

	/**
	 * The feature id for the '<em><b>Doc Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_VIRTUAL_MACHINE__DOC_SECTIONS = CorePackage.MODEL_ELEMENT__DOC_SECTIONS;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_VIRTUAL_MACHINE__MARKERS = CorePackage.MODEL_ELEMENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_VIRTUAL_MACHINE__ICON = CorePackage.MODEL_ELEMENT__ICON;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_VIRTUAL_MACHINE__URIS = CorePackage.MODEL_ELEMENT__URIS;

	/**
	 * The feature id for the '<em><b>Live</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_VIRTUAL_MACHINE__LIVE = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Vm Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_VIRTUAL_MACHINE__VM_NAME = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Vm Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_VIRTUAL_MACHINE__VM_VERSION = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Vm Vendor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_VIRTUAL_MACHINE__VM_VENDOR = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Specification Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_VIRTUAL_MACHINE__SPECIFICATION_VERSION = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Modules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_VIRTUAL_MACHINE__MODULES = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Layers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_VIRTUAL_MACHINE__LAYERS = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Class Loaders</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_VIRTUAL_MACHINE__CLASS_LOADERS = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Java Virtual Machine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_VIRTUAL_MACHINE_FEATURE_COUNT = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_VIRTUAL_MACHINE___COLLECT__OBJECT_EREFERENCE_ELIST = CorePackage.MODEL_ELEMENT___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_VIRTUAL_MACHINE___GET_REFERRERS__EREFERENCE = CorePackage.MODEL_ELEMENT___GET_REFERRERS__EREFERENCE;

	/**
	 * The number of operations of the '<em>Java Virtual Machine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_VIRTUAL_MACHINE_OPERATION_COUNT = CorePackage.MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.jvm.impl.LayerImpl <em>Layer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.jvm.impl.LayerImpl
	 * @see org.nasdanika.sdk.runtime.models.jvm.impl.JvmPackageImpl#getLayer()
	 * @generated
	 */
	int LAYER = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER__ID = JVM_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER__DOCUMENTATION = JVM_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER__DOC_REF = JVM_ELEMENT__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER__DOC_FORMAT = JVM_ELEMENT__DOC_FORMAT;

	/**
	 * The feature id for the '<em><b>Doc Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER__DOC_CONTENTS = JVM_ELEMENT__DOC_CONTENTS;

	/**
	 * The feature id for the '<em><b>Doc Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER__DOC_SECTIONS = JVM_ELEMENT__DOC_SECTIONS;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER__MARKERS = JVM_ELEMENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER__ICON = JVM_ELEMENT__ICON;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER__URIS = JVM_ELEMENT__URIS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER__NAME = JVM_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Boot</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER__BOOT = JVM_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER__PARENTS = JVM_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Modules</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER__MODULES = JVM_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Layer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_FEATURE_COUNT = JVM_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER___COLLECT__OBJECT_EREFERENCE_ELIST = JVM_ELEMENT___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER___GET_REFERRERS__EREFERENCE = JVM_ELEMENT___GET_REFERRERS__EREFERENCE;

	/**
	 * The number of operations of the '<em>Layer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_OPERATION_COUNT = JVM_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.jvm.impl.ClassLoaderImpl <em>Class Loader</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.jvm.impl.ClassLoaderImpl
	 * @see org.nasdanika.sdk.runtime.models.jvm.impl.JvmPackageImpl#getClassLoader()
	 * @generated
	 */
	int CLASS_LOADER = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_LOADER__ID = JVM_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_LOADER__DOCUMENTATION = JVM_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_LOADER__DOC_REF = JVM_ELEMENT__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_LOADER__DOC_FORMAT = JVM_ELEMENT__DOC_FORMAT;

	/**
	 * The feature id for the '<em><b>Doc Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_LOADER__DOC_CONTENTS = JVM_ELEMENT__DOC_CONTENTS;

	/**
	 * The feature id for the '<em><b>Doc Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_LOADER__DOC_SECTIONS = JVM_ELEMENT__DOC_SECTIONS;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_LOADER__MARKERS = JVM_ELEMENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_LOADER__ICON = JVM_ELEMENT__ICON;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_LOADER__URIS = JVM_ELEMENT__URIS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_LOADER__NAME = JVM_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Loader Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_LOADER__LOADER_TYPE_NAME = JVM_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_LOADER__PARENT = JVM_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Unnamed Module</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_LOADER__UNNAMED_MODULE = JVM_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Class Loader</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_LOADER_FEATURE_COUNT = JVM_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_LOADER___COLLECT__OBJECT_EREFERENCE_ELIST = JVM_ELEMENT___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_LOADER___GET_REFERRERS__EREFERENCE = JVM_ELEMENT___GET_REFERRERS__EREFERENCE;

	/**
	 * The number of operations of the '<em>Class Loader</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_LOADER_OPERATION_COUNT = JVM_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.jvm.impl.ModuleImpl <em>Module</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.jvm.impl.ModuleImpl
	 * @see org.nasdanika.sdk.runtime.models.jvm.impl.JvmPackageImpl#getModule()
	 * @generated
	 */
	int MODULE = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__ID = JVM_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__DOCUMENTATION = JVM_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__DOC_REF = JVM_ELEMENT__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__DOC_FORMAT = JVM_ELEMENT__DOC_FORMAT;

	/**
	 * The feature id for the '<em><b>Doc Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__DOC_CONTENTS = JVM_ELEMENT__DOC_CONTENTS;

	/**
	 * The feature id for the '<em><b>Doc Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__DOC_SECTIONS = JVM_ELEMENT__DOC_SECTIONS;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__MARKERS = JVM_ELEMENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__ICON = JVM_ELEMENT__ICON;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__URIS = JVM_ELEMENT__URIS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__NAME = JVM_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Named</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__NAMED = JVM_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__VERSION = JVM_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Modifiers</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__MODIFIERS = JVM_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Main Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__MAIN_CLASS_NAME = JVM_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Packages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__PACKAGES = JVM_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Requires</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__REQUIRES = JVM_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Exports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__EXPORTS = JVM_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Opens</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__OPENS = JVM_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Provides</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__PROVIDES = JVM_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Uses</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__USES = JVM_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Reads</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__READS = JVM_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Layer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__LAYER = JVM_ELEMENT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Class Loader</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__CLASS_LOADER = JVM_ELEMENT_FEATURE_COUNT + 12;

	/**
	 * The number of structural features of the '<em>Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_FEATURE_COUNT = JVM_ELEMENT_FEATURE_COUNT + 13;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE___COLLECT__OBJECT_EREFERENCE_ELIST = JVM_ELEMENT___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE___GET_REFERRERS__EREFERENCE = JVM_ELEMENT___GET_REFERRERS__EREFERENCE;

	/**
	 * The number of operations of the '<em>Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_OPERATION_COUNT = JVM_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.jvm.impl.RequiresImpl <em>Requires</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.jvm.impl.RequiresImpl
	 * @see org.nasdanika.sdk.runtime.models.jvm.impl.JvmPackageImpl#getRequires()
	 * @generated
	 */
	int REQUIRES = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRES__ID = JVM_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRES__DOCUMENTATION = JVM_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRES__DOC_REF = JVM_ELEMENT__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRES__DOC_FORMAT = JVM_ELEMENT__DOC_FORMAT;

	/**
	 * The feature id for the '<em><b>Doc Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRES__DOC_CONTENTS = JVM_ELEMENT__DOC_CONTENTS;

	/**
	 * The feature id for the '<em><b>Doc Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRES__DOC_SECTIONS = JVM_ELEMENT__DOC_SECTIONS;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRES__MARKERS = JVM_ELEMENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRES__ICON = JVM_ELEMENT__ICON;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRES__URIS = JVM_ELEMENT__URIS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRES__NAME = JVM_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Modifiers</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRES__MODIFIERS = JVM_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Compiled Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRES__COMPILED_VERSION = JVM_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Module</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRES__MODULE = JVM_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Requires</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRES_FEATURE_COUNT = JVM_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRES___COLLECT__OBJECT_EREFERENCE_ELIST = JVM_ELEMENT___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRES___GET_REFERRERS__EREFERENCE = JVM_ELEMENT___GET_REFERRERS__EREFERENCE;

	/**
	 * The number of operations of the '<em>Requires</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRES_OPERATION_COUNT = JVM_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.jvm.impl.ExportsImpl <em>Exports</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.jvm.impl.ExportsImpl
	 * @see org.nasdanika.sdk.runtime.models.jvm.impl.JvmPackageImpl#getExports()
	 * @generated
	 */
	int EXPORTS = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPORTS__ID = JVM_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPORTS__DOCUMENTATION = JVM_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPORTS__DOC_REF = JVM_ELEMENT__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPORTS__DOC_FORMAT = JVM_ELEMENT__DOC_FORMAT;

	/**
	 * The feature id for the '<em><b>Doc Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPORTS__DOC_CONTENTS = JVM_ELEMENT__DOC_CONTENTS;

	/**
	 * The feature id for the '<em><b>Doc Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPORTS__DOC_SECTIONS = JVM_ELEMENT__DOC_SECTIONS;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPORTS__MARKERS = JVM_ELEMENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPORTS__ICON = JVM_ELEMENT__ICON;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPORTS__URIS = JVM_ELEMENT__URIS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPORTS__NAME = JVM_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Modifiers</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPORTS__MODIFIERS = JVM_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target Names</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPORTS__TARGET_NAMES = JVM_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPORTS__PACKAGE = JVM_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Targets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPORTS__TARGETS = JVM_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Exports</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPORTS_FEATURE_COUNT = JVM_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPORTS___COLLECT__OBJECT_EREFERENCE_ELIST = JVM_ELEMENT___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPORTS___GET_REFERRERS__EREFERENCE = JVM_ELEMENT___GET_REFERRERS__EREFERENCE;

	/**
	 * The number of operations of the '<em>Exports</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPORTS_OPERATION_COUNT = JVM_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.jvm.impl.OpensImpl <em>Opens</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.jvm.impl.OpensImpl
	 * @see org.nasdanika.sdk.runtime.models.jvm.impl.JvmPackageImpl#getOpens()
	 * @generated
	 */
	int OPENS = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPENS__ID = JVM_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPENS__DOCUMENTATION = JVM_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPENS__DOC_REF = JVM_ELEMENT__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPENS__DOC_FORMAT = JVM_ELEMENT__DOC_FORMAT;

	/**
	 * The feature id for the '<em><b>Doc Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPENS__DOC_CONTENTS = JVM_ELEMENT__DOC_CONTENTS;

	/**
	 * The feature id for the '<em><b>Doc Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPENS__DOC_SECTIONS = JVM_ELEMENT__DOC_SECTIONS;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPENS__MARKERS = JVM_ELEMENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPENS__ICON = JVM_ELEMENT__ICON;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPENS__URIS = JVM_ELEMENT__URIS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPENS__NAME = JVM_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Modifiers</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPENS__MODIFIERS = JVM_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target Names</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPENS__TARGET_NAMES = JVM_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPENS__PACKAGE = JVM_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Targets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPENS__TARGETS = JVM_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Opens</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPENS_FEATURE_COUNT = JVM_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPENS___COLLECT__OBJECT_EREFERENCE_ELIST = JVM_ELEMENT___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPENS___GET_REFERRERS__EREFERENCE = JVM_ELEMENT___GET_REFERRERS__EREFERENCE;

	/**
	 * The number of operations of the '<em>Opens</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPENS_OPERATION_COUNT = JVM_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.jvm.impl.ProvidesImpl <em>Provides</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.jvm.impl.ProvidesImpl
	 * @see org.nasdanika.sdk.runtime.models.jvm.impl.JvmPackageImpl#getProvides()
	 * @generated
	 */
	int PROVIDES = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDES__ID = JVM_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDES__DOCUMENTATION = JVM_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDES__DOC_REF = JVM_ELEMENT__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDES__DOC_FORMAT = JVM_ELEMENT__DOC_FORMAT;

	/**
	 * The feature id for the '<em><b>Doc Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDES__DOC_CONTENTS = JVM_ELEMENT__DOC_CONTENTS;

	/**
	 * The feature id for the '<em><b>Doc Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDES__DOC_SECTIONS = JVM_ELEMENT__DOC_SECTIONS;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDES__MARKERS = JVM_ELEMENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDES__ICON = JVM_ELEMENT__ICON;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDES__URIS = JVM_ELEMENT__URIS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDES__NAME = JVM_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Service Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDES__SERVICE_NAME = JVM_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Provider Names</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDES__PROVIDER_NAMES = JVM_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Service</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDES__SERVICE = JVM_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Providers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDES__PROVIDERS = JVM_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Provides</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDES_FEATURE_COUNT = JVM_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDES___COLLECT__OBJECT_EREFERENCE_ELIST = JVM_ELEMENT___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDES___GET_REFERRERS__EREFERENCE = JVM_ELEMENT___GET_REFERRERS__EREFERENCE;

	/**
	 * The number of operations of the '<em>Provides</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDES_OPERATION_COUNT = JVM_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.jvm.impl.PackageImpl <em>Package</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.jvm.impl.PackageImpl
	 * @see org.nasdanika.sdk.runtime.models.jvm.impl.JvmPackageImpl#getPackage()
	 * @generated
	 */
	int PACKAGE = 9;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__ID = JVM_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__DOCUMENTATION = JVM_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__DOC_REF = JVM_ELEMENT__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__DOC_FORMAT = JVM_ELEMENT__DOC_FORMAT;

	/**
	 * The feature id for the '<em><b>Doc Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__DOC_CONTENTS = JVM_ELEMENT__DOC_CONTENTS;

	/**
	 * The feature id for the '<em><b>Doc Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__DOC_SECTIONS = JVM_ELEMENT__DOC_SECTIONS;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__MARKERS = JVM_ELEMENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__ICON = JVM_ELEMENT__ICON;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__URIS = JVM_ELEMENT__URIS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__NAME = JVM_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__TYPES = JVM_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_FEATURE_COUNT = JVM_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE___COLLECT__OBJECT_EREFERENCE_ELIST = JVM_ELEMENT___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE___GET_REFERRERS__EREFERENCE = JVM_ELEMENT___GET_REFERRERS__EREFERENCE;

	/**
	 * The number of operations of the '<em>Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_OPERATION_COUNT = JVM_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.jvm.impl.TypeImpl <em>Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.jvm.impl.TypeImpl
	 * @see org.nasdanika.sdk.runtime.models.jvm.impl.JvmPackageImpl#getType()
	 * @generated
	 */
	int TYPE = 10;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__ID = JVM_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__DOCUMENTATION = JVM_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__DOC_REF = JVM_ELEMENT__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__DOC_FORMAT = JVM_ELEMENT__DOC_FORMAT;

	/**
	 * The feature id for the '<em><b>Doc Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__DOC_CONTENTS = JVM_ELEMENT__DOC_CONTENTS;

	/**
	 * The feature id for the '<em><b>Doc Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__DOC_SECTIONS = JVM_ELEMENT__DOC_SECTIONS;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__MARKERS = JVM_ELEMENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__ICON = JVM_ELEMENT__ICON;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__URIS = JVM_ELEMENT__URIS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__NAME = JVM_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__KIND = JVM_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Access</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__ACCESS = JVM_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Binary Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__BINARY_NAME = JVM_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Descriptor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__DESCRIPTOR = JVM_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Signature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__SIGNATURE = JVM_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__ABSTRACT = JVM_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Final</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__FINAL = JVM_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Synthetic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__SYNTHETIC = JVM_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Sealed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__SEALED = JVM_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Class File Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__CLASS_FILE_VERSION = JVM_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Methods</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__METHODS = JVM_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__FIELDS = JVM_ELEMENT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Super Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__SUPER_TYPE = JVM_ELEMENT_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__INTERFACES = JVM_ELEMENT_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Component Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__COMPONENT_TYPE = JVM_ELEMENT_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Module</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__MODULE = JVM_ELEMENT_FEATURE_COUNT + 15;

	/**
	 * The number of structural features of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_FEATURE_COUNT = JVM_ELEMENT_FEATURE_COUNT + 16;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE___COLLECT__OBJECT_EREFERENCE_ELIST = JVM_ELEMENT___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE___GET_REFERRERS__EREFERENCE = JVM_ELEMENT___GET_REFERRERS__EREFERENCE;

	/**
	 * The number of operations of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_OPERATION_COUNT = JVM_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.jvm.impl.MemberImpl <em>Member</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.jvm.impl.MemberImpl
	 * @see org.nasdanika.sdk.runtime.models.jvm.impl.JvmPackageImpl#getMember()
	 * @generated
	 */
	int MEMBER = 11;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER__ID = JVM_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER__DOCUMENTATION = JVM_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER__DOC_REF = JVM_ELEMENT__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER__DOC_FORMAT = JVM_ELEMENT__DOC_FORMAT;

	/**
	 * The feature id for the '<em><b>Doc Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER__DOC_CONTENTS = JVM_ELEMENT__DOC_CONTENTS;

	/**
	 * The feature id for the '<em><b>Doc Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER__DOC_SECTIONS = JVM_ELEMENT__DOC_SECTIONS;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER__MARKERS = JVM_ELEMENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER__ICON = JVM_ELEMENT__ICON;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER__URIS = JVM_ELEMENT__URIS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER__NAME = JVM_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Access</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER__ACCESS = JVM_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Static</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER__STATIC = JVM_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Final</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER__FINAL = JVM_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Synthetic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER__SYNTHETIC = JVM_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Descriptor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER__DESCRIPTOR = JVM_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Signature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER__SIGNATURE = JVM_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Member</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_FEATURE_COUNT = JVM_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER___COLLECT__OBJECT_EREFERENCE_ELIST = JVM_ELEMENT___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER___GET_REFERRERS__EREFERENCE = JVM_ELEMENT___GET_REFERRERS__EREFERENCE;

	/**
	 * The number of operations of the '<em>Member</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_OPERATION_COUNT = JVM_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.jvm.impl.MethodImpl <em>Method</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.jvm.impl.MethodImpl
	 * @see org.nasdanika.sdk.runtime.models.jvm.impl.JvmPackageImpl#getMethod()
	 * @generated
	 */
	int METHOD = 12;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__ID = MEMBER__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__DOCUMENTATION = MEMBER__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__DOC_REF = MEMBER__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__DOC_FORMAT = MEMBER__DOC_FORMAT;

	/**
	 * The feature id for the '<em><b>Doc Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__DOC_CONTENTS = MEMBER__DOC_CONTENTS;

	/**
	 * The feature id for the '<em><b>Doc Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__DOC_SECTIONS = MEMBER__DOC_SECTIONS;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__MARKERS = MEMBER__MARKERS;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__ICON = MEMBER__ICON;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__URIS = MEMBER__URIS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__NAME = MEMBER__NAME;

	/**
	 * The feature id for the '<em><b>Access</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__ACCESS = MEMBER__ACCESS;

	/**
	 * The feature id for the '<em><b>Static</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__STATIC = MEMBER__STATIC;

	/**
	 * The feature id for the '<em><b>Final</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__FINAL = MEMBER__FINAL;

	/**
	 * The feature id for the '<em><b>Synthetic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__SYNTHETIC = MEMBER__SYNTHETIC;

	/**
	 * The feature id for the '<em><b>Descriptor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__DESCRIPTOR = MEMBER__DESCRIPTOR;

	/**
	 * The feature id for the '<em><b>Signature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__SIGNATURE = MEMBER__SIGNATURE;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__ABSTRACT = MEMBER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Synchronized</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__SYNCHRONIZED = MEMBER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Native</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__NATIVE = MEMBER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Bridge</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__BRIDGE = MEMBER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Varargs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__VARARGS = MEMBER_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__DEFAULT = MEMBER_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Return Descriptor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__RETURN_DESCRIPTOR = MEMBER_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__PARAMETERS = MEMBER_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Return Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__RETURN_TYPE = MEMBER_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Thrown Type Names</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__THROWN_TYPE_NAMES = MEMBER_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Thrown Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__THROWN_TYPES = MEMBER_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_FEATURE_COUNT = MEMBER_FEATURE_COUNT + 11;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD___COLLECT__OBJECT_EREFERENCE_ELIST = MEMBER___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD___GET_REFERRERS__EREFERENCE = MEMBER___GET_REFERRERS__EREFERENCE;

	/**
	 * The number of operations of the '<em>Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_OPERATION_COUNT = MEMBER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.jvm.impl.FieldImpl <em>Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.jvm.impl.FieldImpl
	 * @see org.nasdanika.sdk.runtime.models.jvm.impl.JvmPackageImpl#getField()
	 * @generated
	 */
	int FIELD = 13;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__ID = MEMBER__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__DOCUMENTATION = MEMBER__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__DOC_REF = MEMBER__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__DOC_FORMAT = MEMBER__DOC_FORMAT;

	/**
	 * The feature id for the '<em><b>Doc Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__DOC_CONTENTS = MEMBER__DOC_CONTENTS;

	/**
	 * The feature id for the '<em><b>Doc Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__DOC_SECTIONS = MEMBER__DOC_SECTIONS;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__MARKERS = MEMBER__MARKERS;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__ICON = MEMBER__ICON;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__URIS = MEMBER__URIS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__NAME = MEMBER__NAME;

	/**
	 * The feature id for the '<em><b>Access</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__ACCESS = MEMBER__ACCESS;

	/**
	 * The feature id for the '<em><b>Static</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__STATIC = MEMBER__STATIC;

	/**
	 * The feature id for the '<em><b>Final</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__FINAL = MEMBER__FINAL;

	/**
	 * The feature id for the '<em><b>Synthetic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__SYNTHETIC = MEMBER__SYNTHETIC;

	/**
	 * The feature id for the '<em><b>Descriptor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__DESCRIPTOR = MEMBER__DESCRIPTOR;

	/**
	 * The feature id for the '<em><b>Signature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__SIGNATURE = MEMBER__SIGNATURE;

	/**
	 * The feature id for the '<em><b>Transient</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__TRANSIENT = MEMBER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Volatile</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__VOLATILE = MEMBER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Enum Constant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__ENUM_CONSTANT = MEMBER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Constant Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__CONSTANT_VALUE = MEMBER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__TYPE = MEMBER_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_FEATURE_COUNT = MEMBER_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD___COLLECT__OBJECT_EREFERENCE_ELIST = MEMBER___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD___GET_REFERRERS__EREFERENCE = MEMBER___GET_REFERRERS__EREFERENCE;

	/**
	 * The number of operations of the '<em>Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_OPERATION_COUNT = MEMBER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.jvm.impl.ParameterImpl <em>Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.jvm.impl.ParameterImpl
	 * @see org.nasdanika.sdk.runtime.models.jvm.impl.JvmPackageImpl#getParameter()
	 * @generated
	 */
	int PARAMETER = 14;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__ID = JVM_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__DOCUMENTATION = JVM_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__DOC_REF = JVM_ELEMENT__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__DOC_FORMAT = JVM_ELEMENT__DOC_FORMAT;

	/**
	 * The feature id for the '<em><b>Doc Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__DOC_CONTENTS = JVM_ELEMENT__DOC_CONTENTS;

	/**
	 * The feature id for the '<em><b>Doc Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__DOC_SECTIONS = JVM_ELEMENT__DOC_SECTIONS;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__MARKERS = JVM_ELEMENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__ICON = JVM_ELEMENT__ICON;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__URIS = JVM_ELEMENT__URIS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__NAME = JVM_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__INDEX = JVM_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Descriptor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__DESCRIPTOR = JVM_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Final</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__FINAL = JVM_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Synthetic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__SYNTHETIC = JVM_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Mandated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__MANDATED = JVM_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__TYPE = JVM_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FEATURE_COUNT = JVM_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER___COLLECT__OBJECT_EREFERENCE_ELIST = JVM_ELEMENT___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER___GET_REFERRERS__EREFERENCE = JVM_ELEMENT___GET_REFERRERS__EREFERENCE;

	/**
	 * The number of operations of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_OPERATION_COUNT = JVM_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.jvm.ModuleModifier <em>Module Modifier</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.jvm.ModuleModifier
	 * @see org.nasdanika.sdk.runtime.models.jvm.impl.JvmPackageImpl#getModuleModifier()
	 * @generated
	 */
	int MODULE_MODIFIER = 15;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.jvm.RequiresModifier <em>Requires Modifier</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.jvm.RequiresModifier
	 * @see org.nasdanika.sdk.runtime.models.jvm.impl.JvmPackageImpl#getRequiresModifier()
	 * @generated
	 */
	int REQUIRES_MODIFIER = 16;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.jvm.DirectiveModifier <em>Directive Modifier</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.jvm.DirectiveModifier
	 * @see org.nasdanika.sdk.runtime.models.jvm.impl.JvmPackageImpl#getDirectiveModifier()
	 * @generated
	 */
	int DIRECTIVE_MODIFIER = 17;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.jvm.TypeKind <em>Type Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.jvm.TypeKind
	 * @see org.nasdanika.sdk.runtime.models.jvm.impl.JvmPackageImpl#getTypeKind()
	 * @generated
	 */
	int TYPE_KIND = 18;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.jvm.AccessLevel <em>Access Level</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.jvm.AccessLevel
	 * @see org.nasdanika.sdk.runtime.models.jvm.impl.JvmPackageImpl#getAccessLevel()
	 * @generated
	 */
	int ACCESS_LEVEL = 19;


	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.jvm.JvmElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see org.nasdanika.sdk.runtime.models.jvm.JvmElement
	 * @generated
	 */
	EClass getJvmElement();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.jvm.JavaVirtualMachine <em>Java Virtual Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Java Virtual Machine</em>'.
	 * @see org.nasdanika.sdk.runtime.models.jvm.JavaVirtualMachine
	 * @generated
	 */
	EClass getJavaVirtualMachine();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.jvm.JavaVirtualMachine#isLive <em>Live</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Live</em>'.
	 * @see org.nasdanika.sdk.runtime.models.jvm.JavaVirtualMachine#isLive()
	 * @see #getJavaVirtualMachine()
	 * @generated
	 */
	EAttribute getJavaVirtualMachine_Live();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.jvm.JavaVirtualMachine#getVmName <em>Vm Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vm Name</em>'.
	 * @see org.nasdanika.sdk.runtime.models.jvm.JavaVirtualMachine#getVmName()
	 * @see #getJavaVirtualMachine()
	 * @generated
	 */
	EAttribute getJavaVirtualMachine_VmName();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.jvm.JavaVirtualMachine#getVmVersion <em>Vm Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vm Version</em>'.
	 * @see org.nasdanika.sdk.runtime.models.jvm.JavaVirtualMachine#getVmVersion()
	 * @see #getJavaVirtualMachine()
	 * @generated
	 */
	EAttribute getJavaVirtualMachine_VmVersion();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.jvm.JavaVirtualMachine#getVmVendor <em>Vm Vendor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vm Vendor</em>'.
	 * @see org.nasdanika.sdk.runtime.models.jvm.JavaVirtualMachine#getVmVendor()
	 * @see #getJavaVirtualMachine()
	 * @generated
	 */
	EAttribute getJavaVirtualMachine_VmVendor();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.jvm.JavaVirtualMachine#getSpecificationVersion <em>Specification Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Specification Version</em>'.
	 * @see org.nasdanika.sdk.runtime.models.jvm.JavaVirtualMachine#getSpecificationVersion()
	 * @see #getJavaVirtualMachine()
	 * @generated
	 */
	EAttribute getJavaVirtualMachine_SpecificationVersion();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.sdk.runtime.models.jvm.JavaVirtualMachine#getModules <em>Modules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Modules</em>'.
	 * @see org.nasdanika.sdk.runtime.models.jvm.JavaVirtualMachine#getModules()
	 * @see #getJavaVirtualMachine()
	 * @generated
	 */
	EReference getJavaVirtualMachine_Modules();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.sdk.runtime.models.jvm.JavaVirtualMachine#getLayers <em>Layers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Layers</em>'.
	 * @see org.nasdanika.sdk.runtime.models.jvm.JavaVirtualMachine#getLayers()
	 * @see #getJavaVirtualMachine()
	 * @generated
	 */
	EReference getJavaVirtualMachine_Layers();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.sdk.runtime.models.jvm.JavaVirtualMachine#getClassLoaders <em>Class Loaders</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Class Loaders</em>'.
	 * @see org.nasdanika.sdk.runtime.models.jvm.JavaVirtualMachine#getClassLoaders()
	 * @see #getJavaVirtualMachine()
	 * @generated
	 */
	EReference getJavaVirtualMachine_ClassLoaders();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.jvm.Layer <em>Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Layer</em>'.
	 * @see org.nasdanika.sdk.runtime.models.jvm.Layer
	 * @generated
	 */
	EClass getLayer();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.jvm.Layer#isBoot <em>Boot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Boot</em>'.
	 * @see org.nasdanika.sdk.runtime.models.jvm.Layer#isBoot()
	 * @see #getLayer()
	 * @generated
	 */
	EAttribute getLayer_Boot();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.sdk.runtime.models.jvm.Layer#getParents <em>Parents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Parents</em>'.
	 * @see org.nasdanika.sdk.runtime.models.jvm.Layer#getParents()
	 * @see #getLayer()
	 * @generated
	 */
	EReference getLayer_Parents();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.sdk.runtime.models.jvm.Layer#getModules <em>Modules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Modules</em>'.
	 * @see org.nasdanika.sdk.runtime.models.jvm.Layer#getModules()
	 * @see #getLayer()
	 * @generated
	 */
	EReference getLayer_Modules();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.jvm.ClassLoader <em>Class Loader</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class Loader</em>'.
	 * @see org.nasdanika.sdk.runtime.models.jvm.ClassLoader
	 * @generated
	 */
	EClass getClassLoader();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.jvm.ClassLoader#getLoaderTypeName <em>Loader Type Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Loader Type Name</em>'.
	 * @see org.nasdanika.sdk.runtime.models.jvm.ClassLoader#getLoaderTypeName()
	 * @see #getClassLoader()
	 * @generated
	 */
	EAttribute getClassLoader_LoaderTypeName();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.sdk.runtime.models.jvm.ClassLoader#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent</em>'.
	 * @see org.nasdanika.sdk.runtime.models.jvm.ClassLoader#getParent()
	 * @see #getClassLoader()
	 * @generated
	 */
	EReference getClassLoader_Parent();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.sdk.runtime.models.jvm.ClassLoader#getUnnamedModule <em>Unnamed Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Unnamed Module</em>'.
	 * @see org.nasdanika.sdk.runtime.models.jvm.ClassLoader#getUnnamedModule()
	 * @see #getClassLoader()
	 * @generated
	 */
	EReference getClassLoader_UnnamedModule();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.jvm.Module <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Module</em>'.
	 * @see org.nasdanika.sdk.runtime.models.jvm.Module
	 * @generated
	 */
	EClass getModule();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.jvm.Module#isNamed <em>Named</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Named</em>'.
	 * @see org.nasdanika.sdk.runtime.models.jvm.Module#isNamed()
	 * @see #getModule()
	 * @generated
	 */
	EAttribute getModule_Named();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.jvm.Module#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see org.nasdanika.sdk.runtime.models.jvm.Module#getVersion()
	 * @see #getModule()
	 * @generated
	 */
	EAttribute getModule_Version();

	/**
	 * Returns the meta object for the attribute list '{@link org.nasdanika.sdk.runtime.models.jvm.Module#getModifiers <em>Modifiers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Modifiers</em>'.
	 * @see org.nasdanika.sdk.runtime.models.jvm.Module#getModifiers()
	 * @see #getModule()
	 * @generated
	 */
	EAttribute getModule_Modifiers();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.jvm.Module#getMainClassName <em>Main Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Main Class Name</em>'.
	 * @see org.nasdanika.sdk.runtime.models.jvm.Module#getMainClassName()
	 * @see #getModule()
	 * @generated
	 */
	EAttribute getModule_MainClassName();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.sdk.runtime.models.jvm.Module#getPackages <em>Packages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Packages</em>'.
	 * @see org.nasdanika.sdk.runtime.models.jvm.Module#getPackages()
	 * @see #getModule()
	 * @generated
	 */
	EReference getModule_Packages();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.sdk.runtime.models.jvm.Module#getRequires <em>Requires</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Requires</em>'.
	 * @see org.nasdanika.sdk.runtime.models.jvm.Module#getRequires()
	 * @see #getModule()
	 * @generated
	 */
	EReference getModule_Requires();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.sdk.runtime.models.jvm.Module#getExports <em>Exports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Exports</em>'.
	 * @see org.nasdanika.sdk.runtime.models.jvm.Module#getExports()
	 * @see #getModule()
	 * @generated
	 */
	EReference getModule_Exports();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.sdk.runtime.models.jvm.Module#getOpens <em>Opens</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Opens</em>'.
	 * @see org.nasdanika.sdk.runtime.models.jvm.Module#getOpens()
	 * @see #getModule()
	 * @generated
	 */
	EReference getModule_Opens();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.sdk.runtime.models.jvm.Module#getProvides <em>Provides</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Provides</em>'.
	 * @see org.nasdanika.sdk.runtime.models.jvm.Module#getProvides()
	 * @see #getModule()
	 * @generated
	 */
	EReference getModule_Provides();

	/**
	 * Returns the meta object for the attribute list '{@link org.nasdanika.sdk.runtime.models.jvm.Module#getUses <em>Uses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Uses</em>'.
	 * @see org.nasdanika.sdk.runtime.models.jvm.Module#getUses()
	 * @see #getModule()
	 * @generated
	 */
	EAttribute getModule_Uses();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.sdk.runtime.models.jvm.Module#getReads <em>Reads</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Reads</em>'.
	 * @see org.nasdanika.sdk.runtime.models.jvm.Module#getReads()
	 * @see #getModule()
	 * @generated
	 */
	EReference getModule_Reads();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.sdk.runtime.models.jvm.Module#getLayer <em>Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Layer</em>'.
	 * @see org.nasdanika.sdk.runtime.models.jvm.Module#getLayer()
	 * @see #getModule()
	 * @generated
	 */
	EReference getModule_Layer();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.sdk.runtime.models.jvm.Module#getClassLoader <em>Class Loader</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Class Loader</em>'.
	 * @see org.nasdanika.sdk.runtime.models.jvm.Module#getClassLoader()
	 * @see #getModule()
	 * @generated
	 */
	EReference getModule_ClassLoader();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.jvm.Requires <em>Requires</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Requires</em>'.
	 * @see org.nasdanika.sdk.runtime.models.jvm.Requires
	 * @generated
	 */
	EClass getRequires();

	/**
	 * Returns the meta object for the attribute list '{@link org.nasdanika.sdk.runtime.models.jvm.Requires#getModifiers <em>Modifiers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Modifiers</em>'.
	 * @see org.nasdanika.sdk.runtime.models.jvm.Requires#getModifiers()
	 * @see #getRequires()
	 * @generated
	 */
	EAttribute getRequires_Modifiers();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.jvm.Requires#getCompiledVersion <em>Compiled Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Compiled Version</em>'.
	 * @see org.nasdanika.sdk.runtime.models.jvm.Requires#getCompiledVersion()
	 * @see #getRequires()
	 * @generated
	 */
	EAttribute getRequires_CompiledVersion();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.sdk.runtime.models.jvm.Requires#getModule <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Module</em>'.
	 * @see org.nasdanika.sdk.runtime.models.jvm.Requires#getModule()
	 * @see #getRequires()
	 * @generated
	 */
	EReference getRequires_Module();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.jvm.Exports <em>Exports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exports</em>'.
	 * @see org.nasdanika.sdk.runtime.models.jvm.Exports
	 * @generated
	 */
	EClass getExports();

	/**
	 * Returns the meta object for the attribute list '{@link org.nasdanika.sdk.runtime.models.jvm.Exports#getModifiers <em>Modifiers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Modifiers</em>'.
	 * @see org.nasdanika.sdk.runtime.models.jvm.Exports#getModifiers()
	 * @see #getExports()
	 * @generated
	 */
	EAttribute getExports_Modifiers();

	/**
	 * Returns the meta object for the attribute list '{@link org.nasdanika.sdk.runtime.models.jvm.Exports#getTargetNames <em>Target Names</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Target Names</em>'.
	 * @see org.nasdanika.sdk.runtime.models.jvm.Exports#getTargetNames()
	 * @see #getExports()
	 * @generated
	 */
	EAttribute getExports_TargetNames();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.sdk.runtime.models.jvm.Exports#getPackage <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Package</em>'.
	 * @see org.nasdanika.sdk.runtime.models.jvm.Exports#getPackage()
	 * @see #getExports()
	 * @generated
	 */
	EReference getExports_Package();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.sdk.runtime.models.jvm.Exports#getTargets <em>Targets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Targets</em>'.
	 * @see org.nasdanika.sdk.runtime.models.jvm.Exports#getTargets()
	 * @see #getExports()
	 * @generated
	 */
	EReference getExports_Targets();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.jvm.Opens <em>Opens</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Opens</em>'.
	 * @see org.nasdanika.sdk.runtime.models.jvm.Opens
	 * @generated
	 */
	EClass getOpens();

	/**
	 * Returns the meta object for the attribute list '{@link org.nasdanika.sdk.runtime.models.jvm.Opens#getModifiers <em>Modifiers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Modifiers</em>'.
	 * @see org.nasdanika.sdk.runtime.models.jvm.Opens#getModifiers()
	 * @see #getOpens()
	 * @generated
	 */
	EAttribute getOpens_Modifiers();

	/**
	 * Returns the meta object for the attribute list '{@link org.nasdanika.sdk.runtime.models.jvm.Opens#getTargetNames <em>Target Names</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Target Names</em>'.
	 * @see org.nasdanika.sdk.runtime.models.jvm.Opens#getTargetNames()
	 * @see #getOpens()
	 * @generated
	 */
	EAttribute getOpens_TargetNames();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.sdk.runtime.models.jvm.Opens#getPackage <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Package</em>'.
	 * @see org.nasdanika.sdk.runtime.models.jvm.Opens#getPackage()
	 * @see #getOpens()
	 * @generated
	 */
	EReference getOpens_Package();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.sdk.runtime.models.jvm.Opens#getTargets <em>Targets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Targets</em>'.
	 * @see org.nasdanika.sdk.runtime.models.jvm.Opens#getTargets()
	 * @see #getOpens()
	 * @generated
	 */
	EReference getOpens_Targets();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.jvm.Provides <em>Provides</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Provides</em>'.
	 * @see org.nasdanika.sdk.runtime.models.jvm.Provides
	 * @generated
	 */
	EClass getProvides();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.jvm.Provides#getServiceName <em>Service Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service Name</em>'.
	 * @see org.nasdanika.sdk.runtime.models.jvm.Provides#getServiceName()
	 * @see #getProvides()
	 * @generated
	 */
	EAttribute getProvides_ServiceName();

	/**
	 * Returns the meta object for the attribute list '{@link org.nasdanika.sdk.runtime.models.jvm.Provides#getProviderNames <em>Provider Names</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Provider Names</em>'.
	 * @see org.nasdanika.sdk.runtime.models.jvm.Provides#getProviderNames()
	 * @see #getProvides()
	 * @generated
	 */
	EAttribute getProvides_ProviderNames();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.sdk.runtime.models.jvm.Provides#getService <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Service</em>'.
	 * @see org.nasdanika.sdk.runtime.models.jvm.Provides#getService()
	 * @see #getProvides()
	 * @generated
	 */
	EReference getProvides_Service();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.sdk.runtime.models.jvm.Provides#getProviders <em>Providers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Providers</em>'.
	 * @see org.nasdanika.sdk.runtime.models.jvm.Provides#getProviders()
	 * @see #getProvides()
	 * @generated
	 */
	EReference getProvides_Providers();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.jvm.Package <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Package</em>'.
	 * @see org.nasdanika.sdk.runtime.models.jvm.Package
	 * @generated
	 */
	EClass getPackage();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.sdk.runtime.models.jvm.Package#getTypes <em>Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Types</em>'.
	 * @see org.nasdanika.sdk.runtime.models.jvm.Package#getTypes()
	 * @see #getPackage()
	 * @generated
	 */
	EReference getPackage_Types();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.jvm.Type <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type</em>'.
	 * @see org.nasdanika.sdk.runtime.models.jvm.Type
	 * @generated
	 */
	EClass getType();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.jvm.Type#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see org.nasdanika.sdk.runtime.models.jvm.Type#getKind()
	 * @see #getType()
	 * @generated
	 */
	EAttribute getType_Kind();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.jvm.Type#getAccess <em>Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Access</em>'.
	 * @see org.nasdanika.sdk.runtime.models.jvm.Type#getAccess()
	 * @see #getType()
	 * @generated
	 */
	EAttribute getType_Access();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.jvm.Type#getBinaryName <em>Binary Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Binary Name</em>'.
	 * @see org.nasdanika.sdk.runtime.models.jvm.Type#getBinaryName()
	 * @see #getType()
	 * @generated
	 */
	EAttribute getType_BinaryName();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.jvm.Type#getDescriptor <em>Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Descriptor</em>'.
	 * @see org.nasdanika.sdk.runtime.models.jvm.Type#getDescriptor()
	 * @see #getType()
	 * @generated
	 */
	EAttribute getType_Descriptor();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.jvm.Type#getSignature <em>Signature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Signature</em>'.
	 * @see org.nasdanika.sdk.runtime.models.jvm.Type#getSignature()
	 * @see #getType()
	 * @generated
	 */
	EAttribute getType_Signature();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.jvm.Type#isAbstract <em>Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Abstract</em>'.
	 * @see org.nasdanika.sdk.runtime.models.jvm.Type#isAbstract()
	 * @see #getType()
	 * @generated
	 */
	EAttribute getType_Abstract();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.jvm.Type#isFinal <em>Final</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Final</em>'.
	 * @see org.nasdanika.sdk.runtime.models.jvm.Type#isFinal()
	 * @see #getType()
	 * @generated
	 */
	EAttribute getType_Final();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.jvm.Type#isSynthetic <em>Synthetic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Synthetic</em>'.
	 * @see org.nasdanika.sdk.runtime.models.jvm.Type#isSynthetic()
	 * @see #getType()
	 * @generated
	 */
	EAttribute getType_Synthetic();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.jvm.Type#isSealed <em>Sealed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sealed</em>'.
	 * @see org.nasdanika.sdk.runtime.models.jvm.Type#isSealed()
	 * @see #getType()
	 * @generated
	 */
	EAttribute getType_Sealed();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.jvm.Type#getClassFileVersion <em>Class File Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class File Version</em>'.
	 * @see org.nasdanika.sdk.runtime.models.jvm.Type#getClassFileVersion()
	 * @see #getType()
	 * @generated
	 */
	EAttribute getType_ClassFileVersion();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.sdk.runtime.models.jvm.Type#getMethods <em>Methods</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Methods</em>'.
	 * @see org.nasdanika.sdk.runtime.models.jvm.Type#getMethods()
	 * @see #getType()
	 * @generated
	 */
	EReference getType_Methods();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.sdk.runtime.models.jvm.Type#getFields <em>Fields</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fields</em>'.
	 * @see org.nasdanika.sdk.runtime.models.jvm.Type#getFields()
	 * @see #getType()
	 * @generated
	 */
	EReference getType_Fields();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.sdk.runtime.models.jvm.Type#getSuperType <em>Super Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Super Type</em>'.
	 * @see org.nasdanika.sdk.runtime.models.jvm.Type#getSuperType()
	 * @see #getType()
	 * @generated
	 */
	EReference getType_SuperType();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.sdk.runtime.models.jvm.Type#getInterfaces <em>Interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Interfaces</em>'.
	 * @see org.nasdanika.sdk.runtime.models.jvm.Type#getInterfaces()
	 * @see #getType()
	 * @generated
	 */
	EReference getType_Interfaces();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.sdk.runtime.models.jvm.Type#getComponentType <em>Component Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Component Type</em>'.
	 * @see org.nasdanika.sdk.runtime.models.jvm.Type#getComponentType()
	 * @see #getType()
	 * @generated
	 */
	EReference getType_ComponentType();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.sdk.runtime.models.jvm.Type#getModule <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Module</em>'.
	 * @see org.nasdanika.sdk.runtime.models.jvm.Type#getModule()
	 * @see #getType()
	 * @generated
	 */
	EReference getType_Module();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.jvm.Member <em>Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Member</em>'.
	 * @see org.nasdanika.sdk.runtime.models.jvm.Member
	 * @generated
	 */
	EClass getMember();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.jvm.Member#getAccess <em>Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Access</em>'.
	 * @see org.nasdanika.sdk.runtime.models.jvm.Member#getAccess()
	 * @see #getMember()
	 * @generated
	 */
	EAttribute getMember_Access();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.jvm.Member#isStatic <em>Static</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Static</em>'.
	 * @see org.nasdanika.sdk.runtime.models.jvm.Member#isStatic()
	 * @see #getMember()
	 * @generated
	 */
	EAttribute getMember_Static();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.jvm.Member#isFinal <em>Final</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Final</em>'.
	 * @see org.nasdanika.sdk.runtime.models.jvm.Member#isFinal()
	 * @see #getMember()
	 * @generated
	 */
	EAttribute getMember_Final();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.jvm.Member#isSynthetic <em>Synthetic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Synthetic</em>'.
	 * @see org.nasdanika.sdk.runtime.models.jvm.Member#isSynthetic()
	 * @see #getMember()
	 * @generated
	 */
	EAttribute getMember_Synthetic();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.jvm.Member#getDescriptor <em>Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Descriptor</em>'.
	 * @see org.nasdanika.sdk.runtime.models.jvm.Member#getDescriptor()
	 * @see #getMember()
	 * @generated
	 */
	EAttribute getMember_Descriptor();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.jvm.Member#getSignature <em>Signature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Signature</em>'.
	 * @see org.nasdanika.sdk.runtime.models.jvm.Member#getSignature()
	 * @see #getMember()
	 * @generated
	 */
	EAttribute getMember_Signature();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.jvm.Method <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Method</em>'.
	 * @see org.nasdanika.sdk.runtime.models.jvm.Method
	 * @generated
	 */
	EClass getMethod();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.jvm.Method#isAbstract <em>Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Abstract</em>'.
	 * @see org.nasdanika.sdk.runtime.models.jvm.Method#isAbstract()
	 * @see #getMethod()
	 * @generated
	 */
	EAttribute getMethod_Abstract();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.jvm.Method#isSynchronized <em>Synchronized</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Synchronized</em>'.
	 * @see org.nasdanika.sdk.runtime.models.jvm.Method#isSynchronized()
	 * @see #getMethod()
	 * @generated
	 */
	EAttribute getMethod_Synchronized();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.jvm.Method#isNative <em>Native</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Native</em>'.
	 * @see org.nasdanika.sdk.runtime.models.jvm.Method#isNative()
	 * @see #getMethod()
	 * @generated
	 */
	EAttribute getMethod_Native();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.jvm.Method#isBridge <em>Bridge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bridge</em>'.
	 * @see org.nasdanika.sdk.runtime.models.jvm.Method#isBridge()
	 * @see #getMethod()
	 * @generated
	 */
	EAttribute getMethod_Bridge();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.jvm.Method#isVarargs <em>Varargs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Varargs</em>'.
	 * @see org.nasdanika.sdk.runtime.models.jvm.Method#isVarargs()
	 * @see #getMethod()
	 * @generated
	 */
	EAttribute getMethod_Varargs();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.jvm.Method#isDefault <em>Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default</em>'.
	 * @see org.nasdanika.sdk.runtime.models.jvm.Method#isDefault()
	 * @see #getMethod()
	 * @generated
	 */
	EAttribute getMethod_Default();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.jvm.Method#getReturnDescriptor <em>Return Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Return Descriptor</em>'.
	 * @see org.nasdanika.sdk.runtime.models.jvm.Method#getReturnDescriptor()
	 * @see #getMethod()
	 * @generated
	 */
	EAttribute getMethod_ReturnDescriptor();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.sdk.runtime.models.jvm.Method#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see org.nasdanika.sdk.runtime.models.jvm.Method#getParameters()
	 * @see #getMethod()
	 * @generated
	 */
	EReference getMethod_Parameters();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.sdk.runtime.models.jvm.Method#getReturnType <em>Return Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Return Type</em>'.
	 * @see org.nasdanika.sdk.runtime.models.jvm.Method#getReturnType()
	 * @see #getMethod()
	 * @generated
	 */
	EReference getMethod_ReturnType();

	/**
	 * Returns the meta object for the attribute list '{@link org.nasdanika.sdk.runtime.models.jvm.Method#getThrownTypeNames <em>Thrown Type Names</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Thrown Type Names</em>'.
	 * @see org.nasdanika.sdk.runtime.models.jvm.Method#getThrownTypeNames()
	 * @see #getMethod()
	 * @generated
	 */
	EAttribute getMethod_ThrownTypeNames();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.sdk.runtime.models.jvm.Method#getThrownTypes <em>Thrown Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Thrown Types</em>'.
	 * @see org.nasdanika.sdk.runtime.models.jvm.Method#getThrownTypes()
	 * @see #getMethod()
	 * @generated
	 */
	EReference getMethod_ThrownTypes();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.jvm.Field <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Field</em>'.
	 * @see org.nasdanika.sdk.runtime.models.jvm.Field
	 * @generated
	 */
	EClass getField();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.jvm.Field#isTransient <em>Transient</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transient</em>'.
	 * @see org.nasdanika.sdk.runtime.models.jvm.Field#isTransient()
	 * @see #getField()
	 * @generated
	 */
	EAttribute getField_Transient();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.jvm.Field#isVolatile <em>Volatile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Volatile</em>'.
	 * @see org.nasdanika.sdk.runtime.models.jvm.Field#isVolatile()
	 * @see #getField()
	 * @generated
	 */
	EAttribute getField_Volatile();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.jvm.Field#isEnumConstant <em>Enum Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Enum Constant</em>'.
	 * @see org.nasdanika.sdk.runtime.models.jvm.Field#isEnumConstant()
	 * @see #getField()
	 * @generated
	 */
	EAttribute getField_EnumConstant();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.jvm.Field#getConstantValue <em>Constant Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Constant Value</em>'.
	 * @see org.nasdanika.sdk.runtime.models.jvm.Field#getConstantValue()
	 * @see #getField()
	 * @generated
	 */
	EAttribute getField_ConstantValue();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.sdk.runtime.models.jvm.Field#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see org.nasdanika.sdk.runtime.models.jvm.Field#getType()
	 * @see #getField()
	 * @generated
	 */
	EReference getField_Type();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.jvm.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter</em>'.
	 * @see org.nasdanika.sdk.runtime.models.jvm.Parameter
	 * @generated
	 */
	EClass getParameter();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.jvm.Parameter#getIndex <em>Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Index</em>'.
	 * @see org.nasdanika.sdk.runtime.models.jvm.Parameter#getIndex()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Index();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.jvm.Parameter#getDescriptor <em>Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Descriptor</em>'.
	 * @see org.nasdanika.sdk.runtime.models.jvm.Parameter#getDescriptor()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Descriptor();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.jvm.Parameter#isFinal <em>Final</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Final</em>'.
	 * @see org.nasdanika.sdk.runtime.models.jvm.Parameter#isFinal()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Final();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.jvm.Parameter#isSynthetic <em>Synthetic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Synthetic</em>'.
	 * @see org.nasdanika.sdk.runtime.models.jvm.Parameter#isSynthetic()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Synthetic();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.jvm.Parameter#isMandated <em>Mandated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mandated</em>'.
	 * @see org.nasdanika.sdk.runtime.models.jvm.Parameter#isMandated()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Mandated();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.sdk.runtime.models.jvm.Parameter#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see org.nasdanika.sdk.runtime.models.jvm.Parameter#getType()
	 * @see #getParameter()
	 * @generated
	 */
	EReference getParameter_Type();

	/**
	 * Returns the meta object for enum '{@link org.nasdanika.sdk.runtime.models.jvm.ModuleModifier <em>Module Modifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Module Modifier</em>'.
	 * @see org.nasdanika.sdk.runtime.models.jvm.ModuleModifier
	 * @generated
	 */
	EEnum getModuleModifier();

	/**
	 * Returns the meta object for enum '{@link org.nasdanika.sdk.runtime.models.jvm.RequiresModifier <em>Requires Modifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Requires Modifier</em>'.
	 * @see org.nasdanika.sdk.runtime.models.jvm.RequiresModifier
	 * @generated
	 */
	EEnum getRequiresModifier();

	/**
	 * Returns the meta object for enum '{@link org.nasdanika.sdk.runtime.models.jvm.DirectiveModifier <em>Directive Modifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Directive Modifier</em>'.
	 * @see org.nasdanika.sdk.runtime.models.jvm.DirectiveModifier
	 * @generated
	 */
	EEnum getDirectiveModifier();

	/**
	 * Returns the meta object for enum '{@link org.nasdanika.sdk.runtime.models.jvm.TypeKind <em>Type Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Type Kind</em>'.
	 * @see org.nasdanika.sdk.runtime.models.jvm.TypeKind
	 * @generated
	 */
	EEnum getTypeKind();

	/**
	 * Returns the meta object for enum '{@link org.nasdanika.sdk.runtime.models.jvm.AccessLevel <em>Access Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Access Level</em>'.
	 * @see org.nasdanika.sdk.runtime.models.jvm.AccessLevel
	 * @generated
	 */
	EEnum getAccessLevel();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	JvmFactory getJvmFactory();

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
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.jvm.impl.JvmElementImpl <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.jvm.impl.JvmElementImpl
		 * @see org.nasdanika.sdk.runtime.models.jvm.impl.JvmPackageImpl#getJvmElement()
		 * @generated
		 */
		EClass JVM_ELEMENT = eINSTANCE.getJvmElement();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.jvm.impl.JavaVirtualMachineImpl <em>Java Virtual Machine</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.jvm.impl.JavaVirtualMachineImpl
		 * @see org.nasdanika.sdk.runtime.models.jvm.impl.JvmPackageImpl#getJavaVirtualMachine()
		 * @generated
		 */
		EClass JAVA_VIRTUAL_MACHINE = eINSTANCE.getJavaVirtualMachine();

		/**
		 * The meta object literal for the '<em><b>Live</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JAVA_VIRTUAL_MACHINE__LIVE = eINSTANCE.getJavaVirtualMachine_Live();

		/**
		 * The meta object literal for the '<em><b>Vm Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JAVA_VIRTUAL_MACHINE__VM_NAME = eINSTANCE.getJavaVirtualMachine_VmName();

		/**
		 * The meta object literal for the '<em><b>Vm Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JAVA_VIRTUAL_MACHINE__VM_VERSION = eINSTANCE.getJavaVirtualMachine_VmVersion();

		/**
		 * The meta object literal for the '<em><b>Vm Vendor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JAVA_VIRTUAL_MACHINE__VM_VENDOR = eINSTANCE.getJavaVirtualMachine_VmVendor();

		/**
		 * The meta object literal for the '<em><b>Specification Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JAVA_VIRTUAL_MACHINE__SPECIFICATION_VERSION = eINSTANCE.getJavaVirtualMachine_SpecificationVersion();

		/**
		 * The meta object literal for the '<em><b>Modules</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JAVA_VIRTUAL_MACHINE__MODULES = eINSTANCE.getJavaVirtualMachine_Modules();

		/**
		 * The meta object literal for the '<em><b>Layers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JAVA_VIRTUAL_MACHINE__LAYERS = eINSTANCE.getJavaVirtualMachine_Layers();

		/**
		 * The meta object literal for the '<em><b>Class Loaders</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JAVA_VIRTUAL_MACHINE__CLASS_LOADERS = eINSTANCE.getJavaVirtualMachine_ClassLoaders();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.jvm.impl.LayerImpl <em>Layer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.jvm.impl.LayerImpl
		 * @see org.nasdanika.sdk.runtime.models.jvm.impl.JvmPackageImpl#getLayer()
		 * @generated
		 */
		EClass LAYER = eINSTANCE.getLayer();

		/**
		 * The meta object literal for the '<em><b>Boot</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAYER__BOOT = eINSTANCE.getLayer_Boot();

		/**
		 * The meta object literal for the '<em><b>Parents</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LAYER__PARENTS = eINSTANCE.getLayer_Parents();

		/**
		 * The meta object literal for the '<em><b>Modules</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LAYER__MODULES = eINSTANCE.getLayer_Modules();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.jvm.impl.ClassLoaderImpl <em>Class Loader</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.jvm.impl.ClassLoaderImpl
		 * @see org.nasdanika.sdk.runtime.models.jvm.impl.JvmPackageImpl#getClassLoader()
		 * @generated
		 */
		EClass CLASS_LOADER = eINSTANCE.getClassLoader();

		/**
		 * The meta object literal for the '<em><b>Loader Type Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASS_LOADER__LOADER_TYPE_NAME = eINSTANCE.getClassLoader_LoaderTypeName();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS_LOADER__PARENT = eINSTANCE.getClassLoader_Parent();

		/**
		 * The meta object literal for the '<em><b>Unnamed Module</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS_LOADER__UNNAMED_MODULE = eINSTANCE.getClassLoader_UnnamedModule();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.jvm.impl.ModuleImpl <em>Module</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.jvm.impl.ModuleImpl
		 * @see org.nasdanika.sdk.runtime.models.jvm.impl.JvmPackageImpl#getModule()
		 * @generated
		 */
		EClass MODULE = eINSTANCE.getModule();

		/**
		 * The meta object literal for the '<em><b>Named</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODULE__NAMED = eINSTANCE.getModule_Named();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODULE__VERSION = eINSTANCE.getModule_Version();

		/**
		 * The meta object literal for the '<em><b>Modifiers</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODULE__MODIFIERS = eINSTANCE.getModule_Modifiers();

		/**
		 * The meta object literal for the '<em><b>Main Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODULE__MAIN_CLASS_NAME = eINSTANCE.getModule_MainClassName();

		/**
		 * The meta object literal for the '<em><b>Packages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE__PACKAGES = eINSTANCE.getModule_Packages();

		/**
		 * The meta object literal for the '<em><b>Requires</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE__REQUIRES = eINSTANCE.getModule_Requires();

		/**
		 * The meta object literal for the '<em><b>Exports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE__EXPORTS = eINSTANCE.getModule_Exports();

		/**
		 * The meta object literal for the '<em><b>Opens</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE__OPENS = eINSTANCE.getModule_Opens();

		/**
		 * The meta object literal for the '<em><b>Provides</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE__PROVIDES = eINSTANCE.getModule_Provides();

		/**
		 * The meta object literal for the '<em><b>Uses</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODULE__USES = eINSTANCE.getModule_Uses();

		/**
		 * The meta object literal for the '<em><b>Reads</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE__READS = eINSTANCE.getModule_Reads();

		/**
		 * The meta object literal for the '<em><b>Layer</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE__LAYER = eINSTANCE.getModule_Layer();

		/**
		 * The meta object literal for the '<em><b>Class Loader</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE__CLASS_LOADER = eINSTANCE.getModule_ClassLoader();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.jvm.impl.RequiresImpl <em>Requires</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.jvm.impl.RequiresImpl
		 * @see org.nasdanika.sdk.runtime.models.jvm.impl.JvmPackageImpl#getRequires()
		 * @generated
		 */
		EClass REQUIRES = eINSTANCE.getRequires();

		/**
		 * The meta object literal for the '<em><b>Modifiers</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIRES__MODIFIERS = eINSTANCE.getRequires_Modifiers();

		/**
		 * The meta object literal for the '<em><b>Compiled Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIRES__COMPILED_VERSION = eINSTANCE.getRequires_CompiledVersion();

		/**
		 * The meta object literal for the '<em><b>Module</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIRES__MODULE = eINSTANCE.getRequires_Module();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.jvm.impl.ExportsImpl <em>Exports</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.jvm.impl.ExportsImpl
		 * @see org.nasdanika.sdk.runtime.models.jvm.impl.JvmPackageImpl#getExports()
		 * @generated
		 */
		EClass EXPORTS = eINSTANCE.getExports();

		/**
		 * The meta object literal for the '<em><b>Modifiers</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPORTS__MODIFIERS = eINSTANCE.getExports_Modifiers();

		/**
		 * The meta object literal for the '<em><b>Target Names</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPORTS__TARGET_NAMES = eINSTANCE.getExports_TargetNames();

		/**
		 * The meta object literal for the '<em><b>Package</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPORTS__PACKAGE = eINSTANCE.getExports_Package();

		/**
		 * The meta object literal for the '<em><b>Targets</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPORTS__TARGETS = eINSTANCE.getExports_Targets();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.jvm.impl.OpensImpl <em>Opens</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.jvm.impl.OpensImpl
		 * @see org.nasdanika.sdk.runtime.models.jvm.impl.JvmPackageImpl#getOpens()
		 * @generated
		 */
		EClass OPENS = eINSTANCE.getOpens();

		/**
		 * The meta object literal for the '<em><b>Modifiers</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPENS__MODIFIERS = eINSTANCE.getOpens_Modifiers();

		/**
		 * The meta object literal for the '<em><b>Target Names</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPENS__TARGET_NAMES = eINSTANCE.getOpens_TargetNames();

		/**
		 * The meta object literal for the '<em><b>Package</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPENS__PACKAGE = eINSTANCE.getOpens_Package();

		/**
		 * The meta object literal for the '<em><b>Targets</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPENS__TARGETS = eINSTANCE.getOpens_Targets();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.jvm.impl.ProvidesImpl <em>Provides</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.jvm.impl.ProvidesImpl
		 * @see org.nasdanika.sdk.runtime.models.jvm.impl.JvmPackageImpl#getProvides()
		 * @generated
		 */
		EClass PROVIDES = eINSTANCE.getProvides();

		/**
		 * The meta object literal for the '<em><b>Service Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROVIDES__SERVICE_NAME = eINSTANCE.getProvides_ServiceName();

		/**
		 * The meta object literal for the '<em><b>Provider Names</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROVIDES__PROVIDER_NAMES = eINSTANCE.getProvides_ProviderNames();

		/**
		 * The meta object literal for the '<em><b>Service</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROVIDES__SERVICE = eINSTANCE.getProvides_Service();

		/**
		 * The meta object literal for the '<em><b>Providers</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROVIDES__PROVIDERS = eINSTANCE.getProvides_Providers();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.jvm.impl.PackageImpl <em>Package</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.jvm.impl.PackageImpl
		 * @see org.nasdanika.sdk.runtime.models.jvm.impl.JvmPackageImpl#getPackage()
		 * @generated
		 */
		EClass PACKAGE = eINSTANCE.getPackage();

		/**
		 * The meta object literal for the '<em><b>Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE__TYPES = eINSTANCE.getPackage_Types();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.jvm.impl.TypeImpl <em>Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.jvm.impl.TypeImpl
		 * @see org.nasdanika.sdk.runtime.models.jvm.impl.JvmPackageImpl#getType()
		 * @generated
		 */
		EClass TYPE = eINSTANCE.getType();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE__KIND = eINSTANCE.getType_Kind();

		/**
		 * The meta object literal for the '<em><b>Access</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE__ACCESS = eINSTANCE.getType_Access();

		/**
		 * The meta object literal for the '<em><b>Binary Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE__BINARY_NAME = eINSTANCE.getType_BinaryName();

		/**
		 * The meta object literal for the '<em><b>Descriptor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE__DESCRIPTOR = eINSTANCE.getType_Descriptor();

		/**
		 * The meta object literal for the '<em><b>Signature</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE__SIGNATURE = eINSTANCE.getType_Signature();

		/**
		 * The meta object literal for the '<em><b>Abstract</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE__ABSTRACT = eINSTANCE.getType_Abstract();

		/**
		 * The meta object literal for the '<em><b>Final</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE__FINAL = eINSTANCE.getType_Final();

		/**
		 * The meta object literal for the '<em><b>Synthetic</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE__SYNTHETIC = eINSTANCE.getType_Synthetic();

		/**
		 * The meta object literal for the '<em><b>Sealed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE__SEALED = eINSTANCE.getType_Sealed();

		/**
		 * The meta object literal for the '<em><b>Class File Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE__CLASS_FILE_VERSION = eINSTANCE.getType_ClassFileVersion();

		/**
		 * The meta object literal for the '<em><b>Methods</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE__METHODS = eINSTANCE.getType_Methods();

		/**
		 * The meta object literal for the '<em><b>Fields</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE__FIELDS = eINSTANCE.getType_Fields();

		/**
		 * The meta object literal for the '<em><b>Super Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE__SUPER_TYPE = eINSTANCE.getType_SuperType();

		/**
		 * The meta object literal for the '<em><b>Interfaces</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE__INTERFACES = eINSTANCE.getType_Interfaces();

		/**
		 * The meta object literal for the '<em><b>Component Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE__COMPONENT_TYPE = eINSTANCE.getType_ComponentType();

		/**
		 * The meta object literal for the '<em><b>Module</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE__MODULE = eINSTANCE.getType_Module();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.jvm.impl.MemberImpl <em>Member</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.jvm.impl.MemberImpl
		 * @see org.nasdanika.sdk.runtime.models.jvm.impl.JvmPackageImpl#getMember()
		 * @generated
		 */
		EClass MEMBER = eINSTANCE.getMember();

		/**
		 * The meta object literal for the '<em><b>Access</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEMBER__ACCESS = eINSTANCE.getMember_Access();

		/**
		 * The meta object literal for the '<em><b>Static</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEMBER__STATIC = eINSTANCE.getMember_Static();

		/**
		 * The meta object literal for the '<em><b>Final</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEMBER__FINAL = eINSTANCE.getMember_Final();

		/**
		 * The meta object literal for the '<em><b>Synthetic</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEMBER__SYNTHETIC = eINSTANCE.getMember_Synthetic();

		/**
		 * The meta object literal for the '<em><b>Descriptor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEMBER__DESCRIPTOR = eINSTANCE.getMember_Descriptor();

		/**
		 * The meta object literal for the '<em><b>Signature</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEMBER__SIGNATURE = eINSTANCE.getMember_Signature();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.jvm.impl.MethodImpl <em>Method</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.jvm.impl.MethodImpl
		 * @see org.nasdanika.sdk.runtime.models.jvm.impl.JvmPackageImpl#getMethod()
		 * @generated
		 */
		EClass METHOD = eINSTANCE.getMethod();

		/**
		 * The meta object literal for the '<em><b>Abstract</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHOD__ABSTRACT = eINSTANCE.getMethod_Abstract();

		/**
		 * The meta object literal for the '<em><b>Synchronized</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHOD__SYNCHRONIZED = eINSTANCE.getMethod_Synchronized();

		/**
		 * The meta object literal for the '<em><b>Native</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHOD__NATIVE = eINSTANCE.getMethod_Native();

		/**
		 * The meta object literal for the '<em><b>Bridge</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHOD__BRIDGE = eINSTANCE.getMethod_Bridge();

		/**
		 * The meta object literal for the '<em><b>Varargs</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHOD__VARARGS = eINSTANCE.getMethod_Varargs();

		/**
		 * The meta object literal for the '<em><b>Default</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHOD__DEFAULT = eINSTANCE.getMethod_Default();

		/**
		 * The meta object literal for the '<em><b>Return Descriptor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHOD__RETURN_DESCRIPTOR = eINSTANCE.getMethod_ReturnDescriptor();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METHOD__PARAMETERS = eINSTANCE.getMethod_Parameters();

		/**
		 * The meta object literal for the '<em><b>Return Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METHOD__RETURN_TYPE = eINSTANCE.getMethod_ReturnType();

		/**
		 * The meta object literal for the '<em><b>Thrown Type Names</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHOD__THROWN_TYPE_NAMES = eINSTANCE.getMethod_ThrownTypeNames();

		/**
		 * The meta object literal for the '<em><b>Thrown Types</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METHOD__THROWN_TYPES = eINSTANCE.getMethod_ThrownTypes();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.jvm.impl.FieldImpl <em>Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.jvm.impl.FieldImpl
		 * @see org.nasdanika.sdk.runtime.models.jvm.impl.JvmPackageImpl#getField()
		 * @generated
		 */
		EClass FIELD = eINSTANCE.getField();

		/**
		 * The meta object literal for the '<em><b>Transient</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIELD__TRANSIENT = eINSTANCE.getField_Transient();

		/**
		 * The meta object literal for the '<em><b>Volatile</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIELD__VOLATILE = eINSTANCE.getField_Volatile();

		/**
		 * The meta object literal for the '<em><b>Enum Constant</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIELD__ENUM_CONSTANT = eINSTANCE.getField_EnumConstant();

		/**
		 * The meta object literal for the '<em><b>Constant Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIELD__CONSTANT_VALUE = eINSTANCE.getField_ConstantValue();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIELD__TYPE = eINSTANCE.getField_Type();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.jvm.impl.ParameterImpl <em>Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.jvm.impl.ParameterImpl
		 * @see org.nasdanika.sdk.runtime.models.jvm.impl.JvmPackageImpl#getParameter()
		 * @generated
		 */
		EClass PARAMETER = eINSTANCE.getParameter();

		/**
		 * The meta object literal for the '<em><b>Index</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__INDEX = eINSTANCE.getParameter_Index();

		/**
		 * The meta object literal for the '<em><b>Descriptor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__DESCRIPTOR = eINSTANCE.getParameter_Descriptor();

		/**
		 * The meta object literal for the '<em><b>Final</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__FINAL = eINSTANCE.getParameter_Final();

		/**
		 * The meta object literal for the '<em><b>Synthetic</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__SYNTHETIC = eINSTANCE.getParameter_Synthetic();

		/**
		 * The meta object literal for the '<em><b>Mandated</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__MANDATED = eINSTANCE.getParameter_Mandated();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER__TYPE = eINSTANCE.getParameter_Type();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.jvm.ModuleModifier <em>Module Modifier</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.jvm.ModuleModifier
		 * @see org.nasdanika.sdk.runtime.models.jvm.impl.JvmPackageImpl#getModuleModifier()
		 * @generated
		 */
		EEnum MODULE_MODIFIER = eINSTANCE.getModuleModifier();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.jvm.RequiresModifier <em>Requires Modifier</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.jvm.RequiresModifier
		 * @see org.nasdanika.sdk.runtime.models.jvm.impl.JvmPackageImpl#getRequiresModifier()
		 * @generated
		 */
		EEnum REQUIRES_MODIFIER = eINSTANCE.getRequiresModifier();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.jvm.DirectiveModifier <em>Directive Modifier</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.jvm.DirectiveModifier
		 * @see org.nasdanika.sdk.runtime.models.jvm.impl.JvmPackageImpl#getDirectiveModifier()
		 * @generated
		 */
		EEnum DIRECTIVE_MODIFIER = eINSTANCE.getDirectiveModifier();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.jvm.TypeKind <em>Type Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.jvm.TypeKind
		 * @see org.nasdanika.sdk.runtime.models.jvm.impl.JvmPackageImpl#getTypeKind()
		 * @generated
		 */
		EEnum TYPE_KIND = eINSTANCE.getTypeKind();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.jvm.AccessLevel <em>Access Level</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.jvm.AccessLevel
		 * @see org.nasdanika.sdk.runtime.models.jvm.impl.JvmPackageImpl#getAccessLevel()
		 * @generated
		 */
		EEnum ACCESS_LEVEL = eINSTANCE.getAccessLevel();

	}

} //JvmPackage
