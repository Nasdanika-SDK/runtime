/**
 */
package org.nasdanika.sdk.runtime.models.typescript;

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
 * @see org.nasdanika.sdk.runtime.models.typescript.TypescriptFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel modelDirectory='/model/src-gen' featureDelegation='Dynamic' complianceLevel='25' suppressGenModelAnnotations='false' copyrightFields='false' operationReflection='true' importOrganizing='true' basePackage='org.nasdanika.sdk.runtime.models'"
 *        annotation="http://www.eclipse.org/emf/2011/Xcore Ecore='http://www.eclipse.org/emf/2002/Ecore' GenModel='http://www.eclipse.org/emf/2002/GenModel' Nasdanika='urn:org.nasdanika'"
 * @generated
 */
public interface TypescriptPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "typescript";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "https://runtime.sdk.nasdanika.org/models/typescript";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.nasdanika.sdk.runtime.models.typescript";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TypescriptPackage eINSTANCE = org.nasdanika.sdk.runtime.models.typescript.impl.TypescriptPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.typescript.impl.TypeScriptElementImpl <em>Type Script Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.typescript.impl.TypeScriptElementImpl
	 * @see org.nasdanika.sdk.runtime.models.typescript.impl.TypescriptPackageImpl#getTypeScriptElement()
	 * @generated
	 */
	int TYPE_SCRIPT_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_SCRIPT_ELEMENT__ID = CorePackage.NAMED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_SCRIPT_ELEMENT__DOCUMENTATION = CorePackage.NAMED_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_SCRIPT_ELEMENT__DOC_REF = CorePackage.NAMED_ELEMENT__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_SCRIPT_ELEMENT__DOC_FORMAT = CorePackage.NAMED_ELEMENT__DOC_FORMAT;

	/**
	 * The feature id for the '<em><b>Doc Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_SCRIPT_ELEMENT__DOC_CONTENTS = CorePackage.NAMED_ELEMENT__DOC_CONTENTS;

	/**
	 * The feature id for the '<em><b>Doc Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_SCRIPT_ELEMENT__DOC_SECTIONS = CorePackage.NAMED_ELEMENT__DOC_SECTIONS;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_SCRIPT_ELEMENT__MARKERS = CorePackage.NAMED_ELEMENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_SCRIPT_ELEMENT__ICON = CorePackage.NAMED_ELEMENT__ICON;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_SCRIPT_ELEMENT__URIS = CorePackage.NAMED_ELEMENT__URIS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_SCRIPT_ELEMENT__NAME = CorePackage.NAMED_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Type Script Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_SCRIPT_ELEMENT_FEATURE_COUNT = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_SCRIPT_ELEMENT___COLLECT__OBJECT_EREFERENCE_ELIST = CorePackage.NAMED_ELEMENT___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_SCRIPT_ELEMENT___GET_REFERRERS__EREFERENCE = CorePackage.NAMED_ELEMENT___GET_REFERRERS__EREFERENCE;

	/**
	 * The number of operations of the '<em>Type Script Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_SCRIPT_ELEMENT_OPERATION_COUNT = CorePackage.NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.typescript.impl.PackageImpl <em>Package</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.typescript.impl.PackageImpl
	 * @see org.nasdanika.sdk.runtime.models.typescript.impl.TypescriptPackageImpl#getPackage()
	 * @generated
	 */
	int PACKAGE = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__ID = TYPE_SCRIPT_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__DOCUMENTATION = TYPE_SCRIPT_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__DOC_REF = TYPE_SCRIPT_ELEMENT__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__DOC_FORMAT = TYPE_SCRIPT_ELEMENT__DOC_FORMAT;

	/**
	 * The feature id for the '<em><b>Doc Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__DOC_CONTENTS = TYPE_SCRIPT_ELEMENT__DOC_CONTENTS;

	/**
	 * The feature id for the '<em><b>Doc Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__DOC_SECTIONS = TYPE_SCRIPT_ELEMENT__DOC_SECTIONS;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__MARKERS = TYPE_SCRIPT_ELEMENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__ICON = TYPE_SCRIPT_ELEMENT__ICON;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__URIS = TYPE_SCRIPT_ELEMENT__URIS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__NAME = TYPE_SCRIPT_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Package Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__PACKAGE_NAME = TYPE_SCRIPT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__VERSION = TYPE_SCRIPT_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__DESCRIPTION = TYPE_SCRIPT_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>License</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__LICENSE = TYPE_SCRIPT_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Module Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__MODULE_TYPE = TYPE_SCRIPT_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Dependencies</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__DEPENDENCIES = TYPE_SCRIPT_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Peer Dependencies</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__PEER_DEPENDENCIES = TYPE_SCRIPT_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Modules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__MODULES = TYPE_SCRIPT_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_FEATURE_COUNT = TYPE_SCRIPT_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE___COLLECT__OBJECT_EREFERENCE_ELIST = TYPE_SCRIPT_ELEMENT___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE___GET_REFERRERS__EREFERENCE = TYPE_SCRIPT_ELEMENT___GET_REFERRERS__EREFERENCE;

	/**
	 * The number of operations of the '<em>Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_OPERATION_COUNT = TYPE_SCRIPT_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.typescript.impl.ModuleImpl <em>Module</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.typescript.impl.ModuleImpl
	 * @see org.nasdanika.sdk.runtime.models.typescript.impl.TypescriptPackageImpl#getModule()
	 * @generated
	 */
	int MODULE = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__ID = TYPE_SCRIPT_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__DOCUMENTATION = TYPE_SCRIPT_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__DOC_REF = TYPE_SCRIPT_ELEMENT__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__DOC_FORMAT = TYPE_SCRIPT_ELEMENT__DOC_FORMAT;

	/**
	 * The feature id for the '<em><b>Doc Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__DOC_CONTENTS = TYPE_SCRIPT_ELEMENT__DOC_CONTENTS;

	/**
	 * The feature id for the '<em><b>Doc Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__DOC_SECTIONS = TYPE_SCRIPT_ELEMENT__DOC_SECTIONS;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__MARKERS = TYPE_SCRIPT_ELEMENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__ICON = TYPE_SCRIPT_ELEMENT__ICON;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__URIS = TYPE_SCRIPT_ELEMENT__URIS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__NAME = TYPE_SCRIPT_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__PATH = TYPE_SCRIPT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Declaration Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__DECLARATION_ONLY = TYPE_SCRIPT_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Header</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__HEADER = TYPE_SCRIPT_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Imports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__IMPORTS = TYPE_SCRIPT_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Declarations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__DECLARATIONS = TYPE_SCRIPT_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Footer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__FOOTER = TYPE_SCRIPT_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_FEATURE_COUNT = TYPE_SCRIPT_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE___COLLECT__OBJECT_EREFERENCE_ELIST = TYPE_SCRIPT_ELEMENT___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE___GET_REFERRERS__EREFERENCE = TYPE_SCRIPT_ELEMENT___GET_REFERRERS__EREFERENCE;

	/**
	 * The number of operations of the '<em>Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_OPERATION_COUNT = TYPE_SCRIPT_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.typescript.impl.ImportImpl <em>Import</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.typescript.impl.ImportImpl
	 * @see org.nasdanika.sdk.runtime.models.typescript.impl.TypescriptPackageImpl#getImport()
	 * @generated
	 */
	int IMPORT = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT__ID = TYPE_SCRIPT_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT__DOCUMENTATION = TYPE_SCRIPT_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT__DOC_REF = TYPE_SCRIPT_ELEMENT__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT__DOC_FORMAT = TYPE_SCRIPT_ELEMENT__DOC_FORMAT;

	/**
	 * The feature id for the '<em><b>Doc Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT__DOC_CONTENTS = TYPE_SCRIPT_ELEMENT__DOC_CONTENTS;

	/**
	 * The feature id for the '<em><b>Doc Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT__DOC_SECTIONS = TYPE_SCRIPT_ELEMENT__DOC_SECTIONS;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT__MARKERS = TYPE_SCRIPT_ELEMENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT__ICON = TYPE_SCRIPT_ELEMENT__ICON;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT__URIS = TYPE_SCRIPT_ELEMENT__URIS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT__NAME = TYPE_SCRIPT_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Module Specifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT__MODULE_SPECIFIER = TYPE_SCRIPT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT__TYPE_ONLY = TYPE_SCRIPT_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Bindings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT__BINDINGS = TYPE_SCRIPT_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Import</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_FEATURE_COUNT = TYPE_SCRIPT_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT___COLLECT__OBJECT_EREFERENCE_ELIST = TYPE_SCRIPT_ELEMENT___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT___GET_REFERRERS__EREFERENCE = TYPE_SCRIPT_ELEMENT___GET_REFERRERS__EREFERENCE;

	/**
	 * The number of operations of the '<em>Import</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_OPERATION_COUNT = TYPE_SCRIPT_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.typescript.impl.ImportBindingImpl <em>Import Binding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.typescript.impl.ImportBindingImpl
	 * @see org.nasdanika.sdk.runtime.models.typescript.impl.TypescriptPackageImpl#getImportBinding()
	 * @generated
	 */
	int IMPORT_BINDING = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_BINDING__ID = TYPE_SCRIPT_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_BINDING__DOCUMENTATION = TYPE_SCRIPT_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_BINDING__DOC_REF = TYPE_SCRIPT_ELEMENT__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_BINDING__DOC_FORMAT = TYPE_SCRIPT_ELEMENT__DOC_FORMAT;

	/**
	 * The feature id for the '<em><b>Doc Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_BINDING__DOC_CONTENTS = TYPE_SCRIPT_ELEMENT__DOC_CONTENTS;

	/**
	 * The feature id for the '<em><b>Doc Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_BINDING__DOC_SECTIONS = TYPE_SCRIPT_ELEMENT__DOC_SECTIONS;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_BINDING__MARKERS = TYPE_SCRIPT_ELEMENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_BINDING__ICON = TYPE_SCRIPT_ELEMENT__ICON;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_BINDING__URIS = TYPE_SCRIPT_ELEMENT__URIS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_BINDING__NAME = TYPE_SCRIPT_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_BINDING__KIND = TYPE_SCRIPT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Imported Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_BINDING__IMPORTED_NAME = TYPE_SCRIPT_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_BINDING__ALIAS = TYPE_SCRIPT_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Import Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_BINDING_FEATURE_COUNT = TYPE_SCRIPT_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_BINDING___COLLECT__OBJECT_EREFERENCE_ELIST = TYPE_SCRIPT_ELEMENT___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_BINDING___GET_REFERRERS__EREFERENCE = TYPE_SCRIPT_ELEMENT___GET_REFERRERS__EREFERENCE;

	/**
	 * The number of operations of the '<em>Import Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_BINDING_OPERATION_COUNT = TYPE_SCRIPT_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.typescript.impl.TypeReferenceImpl <em>Type Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.typescript.impl.TypeReferenceImpl
	 * @see org.nasdanika.sdk.runtime.models.typescript.impl.TypescriptPackageImpl#getTypeReference()
	 * @generated
	 */
	int TYPE_REFERENCE = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_REFERENCE__ID = TYPE_SCRIPT_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_REFERENCE__DOCUMENTATION = TYPE_SCRIPT_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_REFERENCE__DOC_REF = TYPE_SCRIPT_ELEMENT__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_REFERENCE__DOC_FORMAT = TYPE_SCRIPT_ELEMENT__DOC_FORMAT;

	/**
	 * The feature id for the '<em><b>Doc Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_REFERENCE__DOC_CONTENTS = TYPE_SCRIPT_ELEMENT__DOC_CONTENTS;

	/**
	 * The feature id for the '<em><b>Doc Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_REFERENCE__DOC_SECTIONS = TYPE_SCRIPT_ELEMENT__DOC_SECTIONS;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_REFERENCE__MARKERS = TYPE_SCRIPT_ELEMENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_REFERENCE__ICON = TYPE_SCRIPT_ELEMENT__ICON;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_REFERENCE__URIS = TYPE_SCRIPT_ELEMENT__URIS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_REFERENCE__NAME = TYPE_SCRIPT_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Type Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_REFERENCE_FEATURE_COUNT = TYPE_SCRIPT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_REFERENCE___COLLECT__OBJECT_EREFERENCE_ELIST = TYPE_SCRIPT_ELEMENT___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_REFERENCE___GET_REFERRERS__EREFERENCE = TYPE_SCRIPT_ELEMENT___GET_REFERRERS__EREFERENCE;

	/**
	 * The number of operations of the '<em>Type Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_REFERENCE_OPERATION_COUNT = TYPE_SCRIPT_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.typescript.impl.PrimitiveTypeReferenceImpl <em>Primitive Type Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.typescript.impl.PrimitiveTypeReferenceImpl
	 * @see org.nasdanika.sdk.runtime.models.typescript.impl.TypescriptPackageImpl#getPrimitiveTypeReference()
	 * @generated
	 */
	int PRIMITIVE_TYPE_REFERENCE = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_REFERENCE__ID = TYPE_REFERENCE__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_REFERENCE__DOCUMENTATION = TYPE_REFERENCE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_REFERENCE__DOC_REF = TYPE_REFERENCE__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_REFERENCE__DOC_FORMAT = TYPE_REFERENCE__DOC_FORMAT;

	/**
	 * The feature id for the '<em><b>Doc Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_REFERENCE__DOC_CONTENTS = TYPE_REFERENCE__DOC_CONTENTS;

	/**
	 * The feature id for the '<em><b>Doc Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_REFERENCE__DOC_SECTIONS = TYPE_REFERENCE__DOC_SECTIONS;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_REFERENCE__MARKERS = TYPE_REFERENCE__MARKERS;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_REFERENCE__ICON = TYPE_REFERENCE__ICON;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_REFERENCE__URIS = TYPE_REFERENCE__URIS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_REFERENCE__NAME = TYPE_REFERENCE__NAME;

	/**
	 * The feature id for the '<em><b>Primitive Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_REFERENCE__PRIMITIVE_TYPE = TYPE_REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Primitive Type Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_REFERENCE_FEATURE_COUNT = TYPE_REFERENCE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_REFERENCE___COLLECT__OBJECT_EREFERENCE_ELIST = TYPE_REFERENCE___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_REFERENCE___GET_REFERRERS__EREFERENCE = TYPE_REFERENCE___GET_REFERRERS__EREFERENCE;

	/**
	 * The number of operations of the '<em>Primitive Type Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_REFERENCE_OPERATION_COUNT = TYPE_REFERENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.typescript.impl.NamedTypeReferenceImpl <em>Named Type Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.typescript.impl.NamedTypeReferenceImpl
	 * @see org.nasdanika.sdk.runtime.models.typescript.impl.TypescriptPackageImpl#getNamedTypeReference()
	 * @generated
	 */
	int NAMED_TYPE_REFERENCE = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_TYPE_REFERENCE__ID = TYPE_REFERENCE__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_TYPE_REFERENCE__DOCUMENTATION = TYPE_REFERENCE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_TYPE_REFERENCE__DOC_REF = TYPE_REFERENCE__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_TYPE_REFERENCE__DOC_FORMAT = TYPE_REFERENCE__DOC_FORMAT;

	/**
	 * The feature id for the '<em><b>Doc Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_TYPE_REFERENCE__DOC_CONTENTS = TYPE_REFERENCE__DOC_CONTENTS;

	/**
	 * The feature id for the '<em><b>Doc Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_TYPE_REFERENCE__DOC_SECTIONS = TYPE_REFERENCE__DOC_SECTIONS;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_TYPE_REFERENCE__MARKERS = TYPE_REFERENCE__MARKERS;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_TYPE_REFERENCE__ICON = TYPE_REFERENCE__ICON;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_TYPE_REFERENCE__URIS = TYPE_REFERENCE__URIS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_TYPE_REFERENCE__NAME = TYPE_REFERENCE__NAME;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_TYPE_REFERENCE__TARGET = TYPE_REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_TYPE_REFERENCE__QUALIFIED_NAME = TYPE_REFERENCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Module Specifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_TYPE_REFERENCE__MODULE_SPECIFIER = TYPE_REFERENCE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Type Arguments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_TYPE_REFERENCE__TYPE_ARGUMENTS = TYPE_REFERENCE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Named Type Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_TYPE_REFERENCE_FEATURE_COUNT = TYPE_REFERENCE_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_TYPE_REFERENCE___COLLECT__OBJECT_EREFERENCE_ELIST = TYPE_REFERENCE___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_TYPE_REFERENCE___GET_REFERRERS__EREFERENCE = TYPE_REFERENCE___GET_REFERRERS__EREFERENCE;

	/**
	 * The number of operations of the '<em>Named Type Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_TYPE_REFERENCE_OPERATION_COUNT = TYPE_REFERENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.typescript.impl.ArrayTypeReferenceImpl <em>Array Type Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.typescript.impl.ArrayTypeReferenceImpl
	 * @see org.nasdanika.sdk.runtime.models.typescript.impl.TypescriptPackageImpl#getArrayTypeReference()
	 * @generated
	 */
	int ARRAY_TYPE_REFERENCE = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_TYPE_REFERENCE__ID = TYPE_REFERENCE__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_TYPE_REFERENCE__DOCUMENTATION = TYPE_REFERENCE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_TYPE_REFERENCE__DOC_REF = TYPE_REFERENCE__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_TYPE_REFERENCE__DOC_FORMAT = TYPE_REFERENCE__DOC_FORMAT;

	/**
	 * The feature id for the '<em><b>Doc Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_TYPE_REFERENCE__DOC_CONTENTS = TYPE_REFERENCE__DOC_CONTENTS;

	/**
	 * The feature id for the '<em><b>Doc Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_TYPE_REFERENCE__DOC_SECTIONS = TYPE_REFERENCE__DOC_SECTIONS;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_TYPE_REFERENCE__MARKERS = TYPE_REFERENCE__MARKERS;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_TYPE_REFERENCE__ICON = TYPE_REFERENCE__ICON;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_TYPE_REFERENCE__URIS = TYPE_REFERENCE__URIS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_TYPE_REFERENCE__NAME = TYPE_REFERENCE__NAME;

	/**
	 * The feature id for the '<em><b>Element Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_TYPE_REFERENCE__ELEMENT_TYPE = TYPE_REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Array Type Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_TYPE_REFERENCE_FEATURE_COUNT = TYPE_REFERENCE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_TYPE_REFERENCE___COLLECT__OBJECT_EREFERENCE_ELIST = TYPE_REFERENCE___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_TYPE_REFERENCE___GET_REFERRERS__EREFERENCE = TYPE_REFERENCE___GET_REFERRERS__EREFERENCE;

	/**
	 * The number of operations of the '<em>Array Type Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_TYPE_REFERENCE_OPERATION_COUNT = TYPE_REFERENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.typescript.impl.UnionTypeReferenceImpl <em>Union Type Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.typescript.impl.UnionTypeReferenceImpl
	 * @see org.nasdanika.sdk.runtime.models.typescript.impl.TypescriptPackageImpl#getUnionTypeReference()
	 * @generated
	 */
	int UNION_TYPE_REFERENCE = 9;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION_TYPE_REFERENCE__ID = TYPE_REFERENCE__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION_TYPE_REFERENCE__DOCUMENTATION = TYPE_REFERENCE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION_TYPE_REFERENCE__DOC_REF = TYPE_REFERENCE__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION_TYPE_REFERENCE__DOC_FORMAT = TYPE_REFERENCE__DOC_FORMAT;

	/**
	 * The feature id for the '<em><b>Doc Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION_TYPE_REFERENCE__DOC_CONTENTS = TYPE_REFERENCE__DOC_CONTENTS;

	/**
	 * The feature id for the '<em><b>Doc Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION_TYPE_REFERENCE__DOC_SECTIONS = TYPE_REFERENCE__DOC_SECTIONS;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION_TYPE_REFERENCE__MARKERS = TYPE_REFERENCE__MARKERS;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION_TYPE_REFERENCE__ICON = TYPE_REFERENCE__ICON;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION_TYPE_REFERENCE__URIS = TYPE_REFERENCE__URIS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION_TYPE_REFERENCE__NAME = TYPE_REFERENCE__NAME;

	/**
	 * The feature id for the '<em><b>Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION_TYPE_REFERENCE__TYPES = TYPE_REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Union Type Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION_TYPE_REFERENCE_FEATURE_COUNT = TYPE_REFERENCE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION_TYPE_REFERENCE___COLLECT__OBJECT_EREFERENCE_ELIST = TYPE_REFERENCE___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION_TYPE_REFERENCE___GET_REFERRERS__EREFERENCE = TYPE_REFERENCE___GET_REFERRERS__EREFERENCE;

	/**
	 * The number of operations of the '<em>Union Type Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION_TYPE_REFERENCE_OPERATION_COUNT = TYPE_REFERENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.typescript.impl.IntersectionTypeReferenceImpl <em>Intersection Type Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.typescript.impl.IntersectionTypeReferenceImpl
	 * @see org.nasdanika.sdk.runtime.models.typescript.impl.TypescriptPackageImpl#getIntersectionTypeReference()
	 * @generated
	 */
	int INTERSECTION_TYPE_REFERENCE = 10;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERSECTION_TYPE_REFERENCE__ID = TYPE_REFERENCE__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERSECTION_TYPE_REFERENCE__DOCUMENTATION = TYPE_REFERENCE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERSECTION_TYPE_REFERENCE__DOC_REF = TYPE_REFERENCE__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERSECTION_TYPE_REFERENCE__DOC_FORMAT = TYPE_REFERENCE__DOC_FORMAT;

	/**
	 * The feature id for the '<em><b>Doc Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERSECTION_TYPE_REFERENCE__DOC_CONTENTS = TYPE_REFERENCE__DOC_CONTENTS;

	/**
	 * The feature id for the '<em><b>Doc Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERSECTION_TYPE_REFERENCE__DOC_SECTIONS = TYPE_REFERENCE__DOC_SECTIONS;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERSECTION_TYPE_REFERENCE__MARKERS = TYPE_REFERENCE__MARKERS;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERSECTION_TYPE_REFERENCE__ICON = TYPE_REFERENCE__ICON;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERSECTION_TYPE_REFERENCE__URIS = TYPE_REFERENCE__URIS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERSECTION_TYPE_REFERENCE__NAME = TYPE_REFERENCE__NAME;

	/**
	 * The feature id for the '<em><b>Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERSECTION_TYPE_REFERENCE__TYPES = TYPE_REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Intersection Type Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERSECTION_TYPE_REFERENCE_FEATURE_COUNT = TYPE_REFERENCE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERSECTION_TYPE_REFERENCE___COLLECT__OBJECT_EREFERENCE_ELIST = TYPE_REFERENCE___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERSECTION_TYPE_REFERENCE___GET_REFERRERS__EREFERENCE = TYPE_REFERENCE___GET_REFERRERS__EREFERENCE;

	/**
	 * The number of operations of the '<em>Intersection Type Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERSECTION_TYPE_REFERENCE_OPERATION_COUNT = TYPE_REFERENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.typescript.impl.LiteralTypeReferenceImpl <em>Literal Type Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.typescript.impl.LiteralTypeReferenceImpl
	 * @see org.nasdanika.sdk.runtime.models.typescript.impl.TypescriptPackageImpl#getLiteralTypeReference()
	 * @generated
	 */
	int LITERAL_TYPE_REFERENCE = 11;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_TYPE_REFERENCE__ID = TYPE_REFERENCE__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_TYPE_REFERENCE__DOCUMENTATION = TYPE_REFERENCE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_TYPE_REFERENCE__DOC_REF = TYPE_REFERENCE__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_TYPE_REFERENCE__DOC_FORMAT = TYPE_REFERENCE__DOC_FORMAT;

	/**
	 * The feature id for the '<em><b>Doc Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_TYPE_REFERENCE__DOC_CONTENTS = TYPE_REFERENCE__DOC_CONTENTS;

	/**
	 * The feature id for the '<em><b>Doc Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_TYPE_REFERENCE__DOC_SECTIONS = TYPE_REFERENCE__DOC_SECTIONS;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_TYPE_REFERENCE__MARKERS = TYPE_REFERENCE__MARKERS;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_TYPE_REFERENCE__ICON = TYPE_REFERENCE__ICON;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_TYPE_REFERENCE__URIS = TYPE_REFERENCE__URIS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_TYPE_REFERENCE__NAME = TYPE_REFERENCE__NAME;

	/**
	 * The feature id for the '<em><b>Literal Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_TYPE_REFERENCE__LITERAL_KIND = TYPE_REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_TYPE_REFERENCE__VALUE = TYPE_REFERENCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Literal Type Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_TYPE_REFERENCE_FEATURE_COUNT = TYPE_REFERENCE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_TYPE_REFERENCE___COLLECT__OBJECT_EREFERENCE_ELIST = TYPE_REFERENCE___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_TYPE_REFERENCE___GET_REFERRERS__EREFERENCE = TYPE_REFERENCE___GET_REFERRERS__EREFERENCE;

	/**
	 * The number of operations of the '<em>Literal Type Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_TYPE_REFERENCE_OPERATION_COUNT = TYPE_REFERENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.typescript.impl.TypeLiteralReferenceImpl <em>Type Literal Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.typescript.impl.TypeLiteralReferenceImpl
	 * @see org.nasdanika.sdk.runtime.models.typescript.impl.TypescriptPackageImpl#getTypeLiteralReference()
	 * @generated
	 */
	int TYPE_LITERAL_REFERENCE = 12;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_LITERAL_REFERENCE__ID = TYPE_REFERENCE__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_LITERAL_REFERENCE__DOCUMENTATION = TYPE_REFERENCE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_LITERAL_REFERENCE__DOC_REF = TYPE_REFERENCE__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_LITERAL_REFERENCE__DOC_FORMAT = TYPE_REFERENCE__DOC_FORMAT;

	/**
	 * The feature id for the '<em><b>Doc Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_LITERAL_REFERENCE__DOC_CONTENTS = TYPE_REFERENCE__DOC_CONTENTS;

	/**
	 * The feature id for the '<em><b>Doc Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_LITERAL_REFERENCE__DOC_SECTIONS = TYPE_REFERENCE__DOC_SECTIONS;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_LITERAL_REFERENCE__MARKERS = TYPE_REFERENCE__MARKERS;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_LITERAL_REFERENCE__ICON = TYPE_REFERENCE__ICON;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_LITERAL_REFERENCE__URIS = TYPE_REFERENCE__URIS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_LITERAL_REFERENCE__NAME = TYPE_REFERENCE__NAME;

	/**
	 * The feature id for the '<em><b>Members</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_LITERAL_REFERENCE__MEMBERS = TYPE_REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Type Literal Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_LITERAL_REFERENCE_FEATURE_COUNT = TYPE_REFERENCE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_LITERAL_REFERENCE___COLLECT__OBJECT_EREFERENCE_ELIST = TYPE_REFERENCE___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_LITERAL_REFERENCE___GET_REFERRERS__EREFERENCE = TYPE_REFERENCE___GET_REFERRERS__EREFERENCE;

	/**
	 * The number of operations of the '<em>Type Literal Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_LITERAL_REFERENCE_OPERATION_COUNT = TYPE_REFERENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.typescript.impl.FunctionTypeReferenceImpl <em>Function Type Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.typescript.impl.FunctionTypeReferenceImpl
	 * @see org.nasdanika.sdk.runtime.models.typescript.impl.TypescriptPackageImpl#getFunctionTypeReference()
	 * @generated
	 */
	int FUNCTION_TYPE_REFERENCE = 13;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_TYPE_REFERENCE__ID = TYPE_REFERENCE__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_TYPE_REFERENCE__DOCUMENTATION = TYPE_REFERENCE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_TYPE_REFERENCE__DOC_REF = TYPE_REFERENCE__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_TYPE_REFERENCE__DOC_FORMAT = TYPE_REFERENCE__DOC_FORMAT;

	/**
	 * The feature id for the '<em><b>Doc Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_TYPE_REFERENCE__DOC_CONTENTS = TYPE_REFERENCE__DOC_CONTENTS;

	/**
	 * The feature id for the '<em><b>Doc Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_TYPE_REFERENCE__DOC_SECTIONS = TYPE_REFERENCE__DOC_SECTIONS;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_TYPE_REFERENCE__MARKERS = TYPE_REFERENCE__MARKERS;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_TYPE_REFERENCE__ICON = TYPE_REFERENCE__ICON;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_TYPE_REFERENCE__URIS = TYPE_REFERENCE__URIS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_TYPE_REFERENCE__NAME = TYPE_REFERENCE__NAME;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_TYPE_REFERENCE__PARAMETERS = TYPE_REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Return Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_TYPE_REFERENCE__RETURN_TYPE = TYPE_REFERENCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Function Type Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_TYPE_REFERENCE_FEATURE_COUNT = TYPE_REFERENCE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_TYPE_REFERENCE___COLLECT__OBJECT_EREFERENCE_ELIST = TYPE_REFERENCE___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_TYPE_REFERENCE___GET_REFERRERS__EREFERENCE = TYPE_REFERENCE___GET_REFERRERS__EREFERENCE;

	/**
	 * The number of operations of the '<em>Function Type Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_TYPE_REFERENCE_OPERATION_COUNT = TYPE_REFERENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.typescript.impl.OpaqueTypeReferenceImpl <em>Opaque Type Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.typescript.impl.OpaqueTypeReferenceImpl
	 * @see org.nasdanika.sdk.runtime.models.typescript.impl.TypescriptPackageImpl#getOpaqueTypeReference()
	 * @generated
	 */
	int OPAQUE_TYPE_REFERENCE = 14;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_TYPE_REFERENCE__ID = TYPE_REFERENCE__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_TYPE_REFERENCE__DOCUMENTATION = TYPE_REFERENCE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_TYPE_REFERENCE__DOC_REF = TYPE_REFERENCE__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_TYPE_REFERENCE__DOC_FORMAT = TYPE_REFERENCE__DOC_FORMAT;

	/**
	 * The feature id for the '<em><b>Doc Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_TYPE_REFERENCE__DOC_CONTENTS = TYPE_REFERENCE__DOC_CONTENTS;

	/**
	 * The feature id for the '<em><b>Doc Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_TYPE_REFERENCE__DOC_SECTIONS = TYPE_REFERENCE__DOC_SECTIONS;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_TYPE_REFERENCE__MARKERS = TYPE_REFERENCE__MARKERS;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_TYPE_REFERENCE__ICON = TYPE_REFERENCE__ICON;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_TYPE_REFERENCE__URIS = TYPE_REFERENCE__URIS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_TYPE_REFERENCE__NAME = TYPE_REFERENCE__NAME;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_TYPE_REFERENCE__TEXT = TYPE_REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>References</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_TYPE_REFERENCE__REFERENCES = TYPE_REFERENCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Opaque Type Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_TYPE_REFERENCE_FEATURE_COUNT = TYPE_REFERENCE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_TYPE_REFERENCE___COLLECT__OBJECT_EREFERENCE_ELIST = TYPE_REFERENCE___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_TYPE_REFERENCE___GET_REFERRERS__EREFERENCE = TYPE_REFERENCE___GET_REFERRERS__EREFERENCE;

	/**
	 * The number of operations of the '<em>Opaque Type Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_TYPE_REFERENCE_OPERATION_COUNT = TYPE_REFERENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.typescript.impl.DeclarationImpl <em>Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.typescript.impl.DeclarationImpl
	 * @see org.nasdanika.sdk.runtime.models.typescript.impl.TypescriptPackageImpl#getDeclaration()
	 * @generated
	 */
	int DECLARATION = 15;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARATION__ID = TYPE_SCRIPT_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARATION__DOCUMENTATION = TYPE_SCRIPT_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARATION__DOC_REF = TYPE_SCRIPT_ELEMENT__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARATION__DOC_FORMAT = TYPE_SCRIPT_ELEMENT__DOC_FORMAT;

	/**
	 * The feature id for the '<em><b>Doc Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARATION__DOC_CONTENTS = TYPE_SCRIPT_ELEMENT__DOC_CONTENTS;

	/**
	 * The feature id for the '<em><b>Doc Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARATION__DOC_SECTIONS = TYPE_SCRIPT_ELEMENT__DOC_SECTIONS;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARATION__MARKERS = TYPE_SCRIPT_ELEMENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARATION__ICON = TYPE_SCRIPT_ELEMENT__ICON;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARATION__URIS = TYPE_SCRIPT_ELEMENT__URIS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARATION__NAME = TYPE_SCRIPT_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Exported</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARATION__EXPORTED = TYPE_SCRIPT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ambient</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARATION__AMBIENT = TYPE_SCRIPT_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARATION_FEATURE_COUNT = TYPE_SCRIPT_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARATION___COLLECT__OBJECT_EREFERENCE_ELIST = TYPE_SCRIPT_ELEMENT___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARATION___GET_REFERRERS__EREFERENCE = TYPE_SCRIPT_ELEMENT___GET_REFERRERS__EREFERENCE;

	/**
	 * The number of operations of the '<em>Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARATION_OPERATION_COUNT = TYPE_SCRIPT_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.typescript.impl.TypeParameterImpl <em>Type Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.typescript.impl.TypeParameterImpl
	 * @see org.nasdanika.sdk.runtime.models.typescript.impl.TypescriptPackageImpl#getTypeParameter()
	 * @generated
	 */
	int TYPE_PARAMETER = 16;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_PARAMETER__ID = TYPE_SCRIPT_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_PARAMETER__DOCUMENTATION = TYPE_SCRIPT_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_PARAMETER__DOC_REF = TYPE_SCRIPT_ELEMENT__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_PARAMETER__DOC_FORMAT = TYPE_SCRIPT_ELEMENT__DOC_FORMAT;

	/**
	 * The feature id for the '<em><b>Doc Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_PARAMETER__DOC_CONTENTS = TYPE_SCRIPT_ELEMENT__DOC_CONTENTS;

	/**
	 * The feature id for the '<em><b>Doc Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_PARAMETER__DOC_SECTIONS = TYPE_SCRIPT_ELEMENT__DOC_SECTIONS;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_PARAMETER__MARKERS = TYPE_SCRIPT_ELEMENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_PARAMETER__ICON = TYPE_SCRIPT_ELEMENT__ICON;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_PARAMETER__URIS = TYPE_SCRIPT_ELEMENT__URIS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_PARAMETER__NAME = TYPE_SCRIPT_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_PARAMETER__CONSTRAINT = TYPE_SCRIPT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Default</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_PARAMETER__DEFAULT = TYPE_SCRIPT_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Type Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_PARAMETER_FEATURE_COUNT = TYPE_SCRIPT_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_PARAMETER___COLLECT__OBJECT_EREFERENCE_ELIST = TYPE_SCRIPT_ELEMENT___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_PARAMETER___GET_REFERRERS__EREFERENCE = TYPE_SCRIPT_ELEMENT___GET_REFERRERS__EREFERENCE;

	/**
	 * The number of operations of the '<em>Type Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_PARAMETER_OPERATION_COUNT = TYPE_SCRIPT_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.typescript.impl.CallableImpl <em>Callable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.typescript.impl.CallableImpl
	 * @see org.nasdanika.sdk.runtime.models.typescript.impl.TypescriptPackageImpl#getCallable()
	 * @generated
	 */
	int CALLABLE = 17;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLABLE__ID = TYPE_SCRIPT_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLABLE__DOCUMENTATION = TYPE_SCRIPT_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLABLE__DOC_REF = TYPE_SCRIPT_ELEMENT__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLABLE__DOC_FORMAT = TYPE_SCRIPT_ELEMENT__DOC_FORMAT;

	/**
	 * The feature id for the '<em><b>Doc Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLABLE__DOC_CONTENTS = TYPE_SCRIPT_ELEMENT__DOC_CONTENTS;

	/**
	 * The feature id for the '<em><b>Doc Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLABLE__DOC_SECTIONS = TYPE_SCRIPT_ELEMENT__DOC_SECTIONS;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLABLE__MARKERS = TYPE_SCRIPT_ELEMENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLABLE__ICON = TYPE_SCRIPT_ELEMENT__ICON;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLABLE__URIS = TYPE_SCRIPT_ELEMENT__URIS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLABLE__NAME = TYPE_SCRIPT_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Type Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLABLE__TYPE_PARAMETERS = TYPE_SCRIPT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLABLE__PARAMETERS = TYPE_SCRIPT_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Return Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLABLE__RETURN_TYPE = TYPE_SCRIPT_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLABLE__BODY = TYPE_SCRIPT_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Async</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLABLE__ASYNC = TYPE_SCRIPT_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Generator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLABLE__GENERATOR = TYPE_SCRIPT_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Callable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLABLE_FEATURE_COUNT = TYPE_SCRIPT_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLABLE___COLLECT__OBJECT_EREFERENCE_ELIST = TYPE_SCRIPT_ELEMENT___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLABLE___GET_REFERRERS__EREFERENCE = TYPE_SCRIPT_ELEMENT___GET_REFERRERS__EREFERENCE;

	/**
	 * The number of operations of the '<em>Callable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLABLE_OPERATION_COUNT = TYPE_SCRIPT_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.typescript.impl.ParameterImpl <em>Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.typescript.impl.ParameterImpl
	 * @see org.nasdanika.sdk.runtime.models.typescript.impl.TypescriptPackageImpl#getParameter()
	 * @generated
	 */
	int PARAMETER = 18;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__ID = TYPE_SCRIPT_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__DOCUMENTATION = TYPE_SCRIPT_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__DOC_REF = TYPE_SCRIPT_ELEMENT__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__DOC_FORMAT = TYPE_SCRIPT_ELEMENT__DOC_FORMAT;

	/**
	 * The feature id for the '<em><b>Doc Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__DOC_CONTENTS = TYPE_SCRIPT_ELEMENT__DOC_CONTENTS;

	/**
	 * The feature id for the '<em><b>Doc Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__DOC_SECTIONS = TYPE_SCRIPT_ELEMENT__DOC_SECTIONS;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__MARKERS = TYPE_SCRIPT_ELEMENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__ICON = TYPE_SCRIPT_ELEMENT__ICON;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__URIS = TYPE_SCRIPT_ELEMENT__URIS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__NAME = TYPE_SCRIPT_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__TYPE = TYPE_SCRIPT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__OPTIONAL = TYPE_SCRIPT_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Rest</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__REST = TYPE_SCRIPT_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__DEFAULT_VALUE = TYPE_SCRIPT_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FEATURE_COUNT = TYPE_SCRIPT_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER___COLLECT__OBJECT_EREFERENCE_ELIST = TYPE_SCRIPT_ELEMENT___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER___GET_REFERRERS__EREFERENCE = TYPE_SCRIPT_ELEMENT___GET_REFERRERS__EREFERENCE;

	/**
	 * The number of operations of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_OPERATION_COUNT = TYPE_SCRIPT_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.typescript.impl.CodeBlockImpl <em>Code Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.typescript.impl.CodeBlockImpl
	 * @see org.nasdanika.sdk.runtime.models.typescript.impl.TypescriptPackageImpl#getCodeBlock()
	 * @generated
	 */
	int CODE_BLOCK = 19;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_BLOCK__ID = TYPE_SCRIPT_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_BLOCK__DOCUMENTATION = TYPE_SCRIPT_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_BLOCK__DOC_REF = TYPE_SCRIPT_ELEMENT__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_BLOCK__DOC_FORMAT = TYPE_SCRIPT_ELEMENT__DOC_FORMAT;

	/**
	 * The feature id for the '<em><b>Doc Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_BLOCK__DOC_CONTENTS = TYPE_SCRIPT_ELEMENT__DOC_CONTENTS;

	/**
	 * The feature id for the '<em><b>Doc Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_BLOCK__DOC_SECTIONS = TYPE_SCRIPT_ELEMENT__DOC_SECTIONS;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_BLOCK__MARKERS = TYPE_SCRIPT_ELEMENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_BLOCK__ICON = TYPE_SCRIPT_ELEMENT__ICON;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_BLOCK__URIS = TYPE_SCRIPT_ELEMENT__URIS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_BLOCK__NAME = TYPE_SCRIPT_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_BLOCK__TEXT = TYPE_SCRIPT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>References</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_BLOCK__REFERENCES = TYPE_SCRIPT_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Code Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_BLOCK_FEATURE_COUNT = TYPE_SCRIPT_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_BLOCK___COLLECT__OBJECT_EREFERENCE_ELIST = TYPE_SCRIPT_ELEMENT___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_BLOCK___GET_REFERRERS__EREFERENCE = TYPE_SCRIPT_ELEMENT___GET_REFERRERS__EREFERENCE;

	/**
	 * The number of operations of the '<em>Code Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_BLOCK_OPERATION_COUNT = TYPE_SCRIPT_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.typescript.impl.InterfaceDeclarationImpl <em>Interface Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.typescript.impl.InterfaceDeclarationImpl
	 * @see org.nasdanika.sdk.runtime.models.typescript.impl.TypescriptPackageImpl#getInterfaceDeclaration()
	 * @generated
	 */
	int INTERFACE_DECLARATION = 20;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_DECLARATION__ID = DECLARATION__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_DECLARATION__DOCUMENTATION = DECLARATION__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_DECLARATION__DOC_REF = DECLARATION__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_DECLARATION__DOC_FORMAT = DECLARATION__DOC_FORMAT;

	/**
	 * The feature id for the '<em><b>Doc Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_DECLARATION__DOC_CONTENTS = DECLARATION__DOC_CONTENTS;

	/**
	 * The feature id for the '<em><b>Doc Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_DECLARATION__DOC_SECTIONS = DECLARATION__DOC_SECTIONS;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_DECLARATION__MARKERS = DECLARATION__MARKERS;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_DECLARATION__ICON = DECLARATION__ICON;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_DECLARATION__URIS = DECLARATION__URIS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_DECLARATION__NAME = DECLARATION__NAME;

	/**
	 * The feature id for the '<em><b>Exported</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_DECLARATION__EXPORTED = DECLARATION__EXPORTED;

	/**
	 * The feature id for the '<em><b>Ambient</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_DECLARATION__AMBIENT = DECLARATION__AMBIENT;

	/**
	 * The feature id for the '<em><b>Type Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_DECLARATION__TYPE_PARAMETERS = DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Super Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_DECLARATION__SUPER_TYPES = DECLARATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Members</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_DECLARATION__MEMBERS = DECLARATION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Interface Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_DECLARATION_FEATURE_COUNT = DECLARATION_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_DECLARATION___COLLECT__OBJECT_EREFERENCE_ELIST = DECLARATION___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_DECLARATION___GET_REFERRERS__EREFERENCE = DECLARATION___GET_REFERRERS__EREFERENCE;

	/**
	 * The number of operations of the '<em>Interface Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_DECLARATION_OPERATION_COUNT = DECLARATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.typescript.impl.ClassDeclarationImpl <em>Class Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.typescript.impl.ClassDeclarationImpl
	 * @see org.nasdanika.sdk.runtime.models.typescript.impl.TypescriptPackageImpl#getClassDeclaration()
	 * @generated
	 */
	int CLASS_DECLARATION = 21;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_DECLARATION__ID = DECLARATION__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_DECLARATION__DOCUMENTATION = DECLARATION__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_DECLARATION__DOC_REF = DECLARATION__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_DECLARATION__DOC_FORMAT = DECLARATION__DOC_FORMAT;

	/**
	 * The feature id for the '<em><b>Doc Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_DECLARATION__DOC_CONTENTS = DECLARATION__DOC_CONTENTS;

	/**
	 * The feature id for the '<em><b>Doc Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_DECLARATION__DOC_SECTIONS = DECLARATION__DOC_SECTIONS;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_DECLARATION__MARKERS = DECLARATION__MARKERS;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_DECLARATION__ICON = DECLARATION__ICON;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_DECLARATION__URIS = DECLARATION__URIS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_DECLARATION__NAME = DECLARATION__NAME;

	/**
	 * The feature id for the '<em><b>Exported</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_DECLARATION__EXPORTED = DECLARATION__EXPORTED;

	/**
	 * The feature id for the '<em><b>Ambient</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_DECLARATION__AMBIENT = DECLARATION__AMBIENT;

	/**
	 * The feature id for the '<em><b>Type Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_DECLARATION__TYPE_PARAMETERS = DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Super Class</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_DECLARATION__SUPER_CLASS = DECLARATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Interfaces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_DECLARATION__INTERFACES = DECLARATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_DECLARATION__ABSTRACT = DECLARATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Members</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_DECLARATION__MEMBERS = DECLARATION_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Class Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_DECLARATION_FEATURE_COUNT = DECLARATION_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_DECLARATION___COLLECT__OBJECT_EREFERENCE_ELIST = DECLARATION___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_DECLARATION___GET_REFERRERS__EREFERENCE = DECLARATION___GET_REFERRERS__EREFERENCE;

	/**
	 * The number of operations of the '<em>Class Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_DECLARATION_OPERATION_COUNT = DECLARATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.typescript.impl.TypeAliasDeclarationImpl <em>Type Alias Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.typescript.impl.TypeAliasDeclarationImpl
	 * @see org.nasdanika.sdk.runtime.models.typescript.impl.TypescriptPackageImpl#getTypeAliasDeclaration()
	 * @generated
	 */
	int TYPE_ALIAS_DECLARATION = 22;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_ALIAS_DECLARATION__ID = DECLARATION__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_ALIAS_DECLARATION__DOCUMENTATION = DECLARATION__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_ALIAS_DECLARATION__DOC_REF = DECLARATION__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_ALIAS_DECLARATION__DOC_FORMAT = DECLARATION__DOC_FORMAT;

	/**
	 * The feature id for the '<em><b>Doc Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_ALIAS_DECLARATION__DOC_CONTENTS = DECLARATION__DOC_CONTENTS;

	/**
	 * The feature id for the '<em><b>Doc Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_ALIAS_DECLARATION__DOC_SECTIONS = DECLARATION__DOC_SECTIONS;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_ALIAS_DECLARATION__MARKERS = DECLARATION__MARKERS;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_ALIAS_DECLARATION__ICON = DECLARATION__ICON;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_ALIAS_DECLARATION__URIS = DECLARATION__URIS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_ALIAS_DECLARATION__NAME = DECLARATION__NAME;

	/**
	 * The feature id for the '<em><b>Exported</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_ALIAS_DECLARATION__EXPORTED = DECLARATION__EXPORTED;

	/**
	 * The feature id for the '<em><b>Ambient</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_ALIAS_DECLARATION__AMBIENT = DECLARATION__AMBIENT;

	/**
	 * The feature id for the '<em><b>Type Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_ALIAS_DECLARATION__TYPE_PARAMETERS = DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_ALIAS_DECLARATION__TYPE = DECLARATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Type Alias Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_ALIAS_DECLARATION_FEATURE_COUNT = DECLARATION_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_ALIAS_DECLARATION___COLLECT__OBJECT_EREFERENCE_ELIST = DECLARATION___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_ALIAS_DECLARATION___GET_REFERRERS__EREFERENCE = DECLARATION___GET_REFERRERS__EREFERENCE;

	/**
	 * The number of operations of the '<em>Type Alias Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_ALIAS_DECLARATION_OPERATION_COUNT = DECLARATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.typescript.impl.EnumDeclarationImpl <em>Enum Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.typescript.impl.EnumDeclarationImpl
	 * @see org.nasdanika.sdk.runtime.models.typescript.impl.TypescriptPackageImpl#getEnumDeclaration()
	 * @generated
	 */
	int ENUM_DECLARATION = 23;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_DECLARATION__ID = DECLARATION__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_DECLARATION__DOCUMENTATION = DECLARATION__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_DECLARATION__DOC_REF = DECLARATION__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_DECLARATION__DOC_FORMAT = DECLARATION__DOC_FORMAT;

	/**
	 * The feature id for the '<em><b>Doc Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_DECLARATION__DOC_CONTENTS = DECLARATION__DOC_CONTENTS;

	/**
	 * The feature id for the '<em><b>Doc Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_DECLARATION__DOC_SECTIONS = DECLARATION__DOC_SECTIONS;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_DECLARATION__MARKERS = DECLARATION__MARKERS;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_DECLARATION__ICON = DECLARATION__ICON;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_DECLARATION__URIS = DECLARATION__URIS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_DECLARATION__NAME = DECLARATION__NAME;

	/**
	 * The feature id for the '<em><b>Exported</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_DECLARATION__EXPORTED = DECLARATION__EXPORTED;

	/**
	 * The feature id for the '<em><b>Ambient</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_DECLARATION__AMBIENT = DECLARATION__AMBIENT;

	/**
	 * The feature id for the '<em><b>Constant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_DECLARATION__CONSTANT = DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Members</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_DECLARATION__MEMBERS = DECLARATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Enum Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_DECLARATION_FEATURE_COUNT = DECLARATION_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_DECLARATION___COLLECT__OBJECT_EREFERENCE_ELIST = DECLARATION___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_DECLARATION___GET_REFERRERS__EREFERENCE = DECLARATION___GET_REFERRERS__EREFERENCE;

	/**
	 * The number of operations of the '<em>Enum Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_DECLARATION_OPERATION_COUNT = DECLARATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.typescript.impl.EnumMemberImpl <em>Enum Member</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.typescript.impl.EnumMemberImpl
	 * @see org.nasdanika.sdk.runtime.models.typescript.impl.TypescriptPackageImpl#getEnumMember()
	 * @generated
	 */
	int ENUM_MEMBER = 24;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_MEMBER__ID = TYPE_SCRIPT_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_MEMBER__DOCUMENTATION = TYPE_SCRIPT_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_MEMBER__DOC_REF = TYPE_SCRIPT_ELEMENT__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_MEMBER__DOC_FORMAT = TYPE_SCRIPT_ELEMENT__DOC_FORMAT;

	/**
	 * The feature id for the '<em><b>Doc Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_MEMBER__DOC_CONTENTS = TYPE_SCRIPT_ELEMENT__DOC_CONTENTS;

	/**
	 * The feature id for the '<em><b>Doc Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_MEMBER__DOC_SECTIONS = TYPE_SCRIPT_ELEMENT__DOC_SECTIONS;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_MEMBER__MARKERS = TYPE_SCRIPT_ELEMENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_MEMBER__ICON = TYPE_SCRIPT_ELEMENT__ICON;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_MEMBER__URIS = TYPE_SCRIPT_ELEMENT__URIS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_MEMBER__NAME = TYPE_SCRIPT_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_MEMBER__VALUE = TYPE_SCRIPT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Enum Member</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_MEMBER_FEATURE_COUNT = TYPE_SCRIPT_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_MEMBER___COLLECT__OBJECT_EREFERENCE_ELIST = TYPE_SCRIPT_ELEMENT___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_MEMBER___GET_REFERRERS__EREFERENCE = TYPE_SCRIPT_ELEMENT___GET_REFERRERS__EREFERENCE;

	/**
	 * The number of operations of the '<em>Enum Member</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_MEMBER_OPERATION_COUNT = TYPE_SCRIPT_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.typescript.impl.FunctionDeclarationImpl <em>Function Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.typescript.impl.FunctionDeclarationImpl
	 * @see org.nasdanika.sdk.runtime.models.typescript.impl.TypescriptPackageImpl#getFunctionDeclaration()
	 * @generated
	 */
	int FUNCTION_DECLARATION = 25;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_DECLARATION__ID = DECLARATION__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_DECLARATION__DOCUMENTATION = DECLARATION__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_DECLARATION__DOC_REF = DECLARATION__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_DECLARATION__DOC_FORMAT = DECLARATION__DOC_FORMAT;

	/**
	 * The feature id for the '<em><b>Doc Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_DECLARATION__DOC_CONTENTS = DECLARATION__DOC_CONTENTS;

	/**
	 * The feature id for the '<em><b>Doc Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_DECLARATION__DOC_SECTIONS = DECLARATION__DOC_SECTIONS;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_DECLARATION__MARKERS = DECLARATION__MARKERS;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_DECLARATION__ICON = DECLARATION__ICON;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_DECLARATION__URIS = DECLARATION__URIS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_DECLARATION__NAME = DECLARATION__NAME;

	/**
	 * The feature id for the '<em><b>Exported</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_DECLARATION__EXPORTED = DECLARATION__EXPORTED;

	/**
	 * The feature id for the '<em><b>Ambient</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_DECLARATION__AMBIENT = DECLARATION__AMBIENT;

	/**
	 * The feature id for the '<em><b>Type Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_DECLARATION__TYPE_PARAMETERS = DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_DECLARATION__PARAMETERS = DECLARATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Return Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_DECLARATION__RETURN_TYPE = DECLARATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_DECLARATION__BODY = DECLARATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Async</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_DECLARATION__ASYNC = DECLARATION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Generator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_DECLARATION__GENERATOR = DECLARATION_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Function Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_DECLARATION_FEATURE_COUNT = DECLARATION_FEATURE_COUNT + 6;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_DECLARATION___COLLECT__OBJECT_EREFERENCE_ELIST = DECLARATION___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_DECLARATION___GET_REFERRERS__EREFERENCE = DECLARATION___GET_REFERRERS__EREFERENCE;

	/**
	 * The number of operations of the '<em>Function Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_DECLARATION_OPERATION_COUNT = DECLARATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.typescript.impl.VariableDeclarationImpl <em>Variable Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.typescript.impl.VariableDeclarationImpl
	 * @see org.nasdanika.sdk.runtime.models.typescript.impl.TypescriptPackageImpl#getVariableDeclaration()
	 * @generated
	 */
	int VARIABLE_DECLARATION = 26;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION__ID = DECLARATION__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION__DOCUMENTATION = DECLARATION__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION__DOC_REF = DECLARATION__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION__DOC_FORMAT = DECLARATION__DOC_FORMAT;

	/**
	 * The feature id for the '<em><b>Doc Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION__DOC_CONTENTS = DECLARATION__DOC_CONTENTS;

	/**
	 * The feature id for the '<em><b>Doc Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION__DOC_SECTIONS = DECLARATION__DOC_SECTIONS;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION__MARKERS = DECLARATION__MARKERS;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION__ICON = DECLARATION__ICON;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION__URIS = DECLARATION__URIS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION__NAME = DECLARATION__NAME;

	/**
	 * The feature id for the '<em><b>Exported</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION__EXPORTED = DECLARATION__EXPORTED;

	/**
	 * The feature id for the '<em><b>Ambient</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION__AMBIENT = DECLARATION__AMBIENT;

	/**
	 * The feature id for the '<em><b>Type Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION__TYPE_PARAMETERS = DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION__PARAMETERS = DECLARATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Return Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION__RETURN_TYPE = DECLARATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION__BODY = DECLARATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Async</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION__ASYNC = DECLARATION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Generator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION__GENERATOR = DECLARATION_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Variable Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION__VARIABLE_KIND = DECLARATION_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION__TYPE = DECLARATION_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Initializer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION__INITIALIZER = DECLARATION_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Variable Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION_FEATURE_COUNT = DECLARATION_FEATURE_COUNT + 9;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION___COLLECT__OBJECT_EREFERENCE_ELIST = DECLARATION___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION___GET_REFERRERS__EREFERENCE = DECLARATION___GET_REFERRERS__EREFERENCE;

	/**
	 * The number of operations of the '<em>Variable Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION_OPERATION_COUNT = DECLARATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.typescript.impl.MemberImpl <em>Member</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.typescript.impl.MemberImpl
	 * @see org.nasdanika.sdk.runtime.models.typescript.impl.TypescriptPackageImpl#getMember()
	 * @generated
	 */
	int MEMBER = 27;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER__ID = TYPE_SCRIPT_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER__DOCUMENTATION = TYPE_SCRIPT_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER__DOC_REF = TYPE_SCRIPT_ELEMENT__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER__DOC_FORMAT = TYPE_SCRIPT_ELEMENT__DOC_FORMAT;

	/**
	 * The feature id for the '<em><b>Doc Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER__DOC_CONTENTS = TYPE_SCRIPT_ELEMENT__DOC_CONTENTS;

	/**
	 * The feature id for the '<em><b>Doc Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER__DOC_SECTIONS = TYPE_SCRIPT_ELEMENT__DOC_SECTIONS;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER__MARKERS = TYPE_SCRIPT_ELEMENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER__ICON = TYPE_SCRIPT_ELEMENT__ICON;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER__URIS = TYPE_SCRIPT_ELEMENT__URIS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER__NAME = TYPE_SCRIPT_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER__VISIBILITY = TYPE_SCRIPT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Static</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER__STATIC = TYPE_SCRIPT_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER__OPTIONAL = TYPE_SCRIPT_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Member</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_FEATURE_COUNT = TYPE_SCRIPT_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER___COLLECT__OBJECT_EREFERENCE_ELIST = TYPE_SCRIPT_ELEMENT___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER___GET_REFERRERS__EREFERENCE = TYPE_SCRIPT_ELEMENT___GET_REFERRERS__EREFERENCE;

	/**
	 * The number of operations of the '<em>Member</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_OPERATION_COUNT = TYPE_SCRIPT_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.typescript.impl.PropertyImpl <em>Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.typescript.impl.PropertyImpl
	 * @see org.nasdanika.sdk.runtime.models.typescript.impl.TypescriptPackageImpl#getProperty()
	 * @generated
	 */
	int PROPERTY = 28;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__ID = MEMBER__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__DOCUMENTATION = MEMBER__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__DOC_REF = MEMBER__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__DOC_FORMAT = MEMBER__DOC_FORMAT;

	/**
	 * The feature id for the '<em><b>Doc Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__DOC_CONTENTS = MEMBER__DOC_CONTENTS;

	/**
	 * The feature id for the '<em><b>Doc Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__DOC_SECTIONS = MEMBER__DOC_SECTIONS;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__MARKERS = MEMBER__MARKERS;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__ICON = MEMBER__ICON;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__URIS = MEMBER__URIS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__NAME = MEMBER__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__VISIBILITY = MEMBER__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Static</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__STATIC = MEMBER__STATIC;

	/**
	 * The feature id for the '<em><b>Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__OPTIONAL = MEMBER__OPTIONAL;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__TYPE = MEMBER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Readonly</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__READONLY = MEMBER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Initializer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__INITIALIZER = MEMBER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_FEATURE_COUNT = MEMBER_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY___COLLECT__OBJECT_EREFERENCE_ELIST = MEMBER___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY___GET_REFERRERS__EREFERENCE = MEMBER___GET_REFERRERS__EREFERENCE;

	/**
	 * The number of operations of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_OPERATION_COUNT = MEMBER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.typescript.impl.MethodImpl <em>Method</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.typescript.impl.MethodImpl
	 * @see org.nasdanika.sdk.runtime.models.typescript.impl.TypescriptPackageImpl#getMethod()
	 * @generated
	 */
	int METHOD = 29;

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
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__VISIBILITY = MEMBER__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Static</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__STATIC = MEMBER__STATIC;

	/**
	 * The feature id for the '<em><b>Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__OPTIONAL = MEMBER__OPTIONAL;

	/**
	 * The feature id for the '<em><b>Type Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__TYPE_PARAMETERS = MEMBER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__PARAMETERS = MEMBER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Return Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__RETURN_TYPE = MEMBER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__BODY = MEMBER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Async</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__ASYNC = MEMBER_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Generator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__GENERATOR = MEMBER_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__ABSTRACT = MEMBER_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_FEATURE_COUNT = MEMBER_FEATURE_COUNT + 7;

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
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.typescript.impl.ConstructorImpl <em>Constructor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.typescript.impl.ConstructorImpl
	 * @see org.nasdanika.sdk.runtime.models.typescript.impl.TypescriptPackageImpl#getConstructor()
	 * @generated
	 */
	int CONSTRUCTOR = 30;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR__ID = MEMBER__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR__DOCUMENTATION = MEMBER__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR__DOC_REF = MEMBER__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR__DOC_FORMAT = MEMBER__DOC_FORMAT;

	/**
	 * The feature id for the '<em><b>Doc Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR__DOC_CONTENTS = MEMBER__DOC_CONTENTS;

	/**
	 * The feature id for the '<em><b>Doc Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR__DOC_SECTIONS = MEMBER__DOC_SECTIONS;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR__MARKERS = MEMBER__MARKERS;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR__ICON = MEMBER__ICON;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR__URIS = MEMBER__URIS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR__NAME = MEMBER__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR__VISIBILITY = MEMBER__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Static</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR__STATIC = MEMBER__STATIC;

	/**
	 * The feature id for the '<em><b>Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR__OPTIONAL = MEMBER__OPTIONAL;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR__PARAMETERS = MEMBER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR__BODY = MEMBER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Constructor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_FEATURE_COUNT = MEMBER_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR___COLLECT__OBJECT_EREFERENCE_ELIST = MEMBER___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR___GET_REFERRERS__EREFERENCE = MEMBER___GET_REFERRERS__EREFERENCE;

	/**
	 * The number of operations of the '<em>Constructor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_OPERATION_COUNT = MEMBER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.typescript.impl.AccessorImpl <em>Accessor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.typescript.impl.AccessorImpl
	 * @see org.nasdanika.sdk.runtime.models.typescript.impl.TypescriptPackageImpl#getAccessor()
	 * @generated
	 */
	int ACCESSOR = 31;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESSOR__ID = MEMBER__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESSOR__DOCUMENTATION = MEMBER__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESSOR__DOC_REF = MEMBER__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESSOR__DOC_FORMAT = MEMBER__DOC_FORMAT;

	/**
	 * The feature id for the '<em><b>Doc Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESSOR__DOC_CONTENTS = MEMBER__DOC_CONTENTS;

	/**
	 * The feature id for the '<em><b>Doc Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESSOR__DOC_SECTIONS = MEMBER__DOC_SECTIONS;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESSOR__MARKERS = MEMBER__MARKERS;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESSOR__ICON = MEMBER__ICON;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESSOR__URIS = MEMBER__URIS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESSOR__NAME = MEMBER__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESSOR__VISIBILITY = MEMBER__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Static</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESSOR__STATIC = MEMBER__STATIC;

	/**
	 * The feature id for the '<em><b>Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESSOR__OPTIONAL = MEMBER__OPTIONAL;

	/**
	 * The feature id for the '<em><b>Type Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESSOR__TYPE_PARAMETERS = MEMBER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESSOR__PARAMETERS = MEMBER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Return Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESSOR__RETURN_TYPE = MEMBER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESSOR__BODY = MEMBER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Async</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESSOR__ASYNC = MEMBER_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Generator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESSOR__GENERATOR = MEMBER_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Accessor Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESSOR__ACCESSOR_KIND = MEMBER_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Accessor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESSOR_FEATURE_COUNT = MEMBER_FEATURE_COUNT + 7;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESSOR___COLLECT__OBJECT_EREFERENCE_ELIST = MEMBER___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESSOR___GET_REFERRERS__EREFERENCE = MEMBER___GET_REFERRERS__EREFERENCE;

	/**
	 * The number of operations of the '<em>Accessor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESSOR_OPERATION_COUNT = MEMBER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.typescript.impl.OpaqueMemberImpl <em>Opaque Member</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.typescript.impl.OpaqueMemberImpl
	 * @see org.nasdanika.sdk.runtime.models.typescript.impl.TypescriptPackageImpl#getOpaqueMember()
	 * @generated
	 */
	int OPAQUE_MEMBER = 32;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_MEMBER__ID = MEMBER__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_MEMBER__DOCUMENTATION = MEMBER__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_MEMBER__DOC_REF = MEMBER__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_MEMBER__DOC_FORMAT = MEMBER__DOC_FORMAT;

	/**
	 * The feature id for the '<em><b>Doc Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_MEMBER__DOC_CONTENTS = MEMBER__DOC_CONTENTS;

	/**
	 * The feature id for the '<em><b>Doc Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_MEMBER__DOC_SECTIONS = MEMBER__DOC_SECTIONS;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_MEMBER__MARKERS = MEMBER__MARKERS;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_MEMBER__ICON = MEMBER__ICON;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_MEMBER__URIS = MEMBER__URIS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_MEMBER__NAME = MEMBER__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_MEMBER__VISIBILITY = MEMBER__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Static</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_MEMBER__STATIC = MEMBER__STATIC;

	/**
	 * The feature id for the '<em><b>Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_MEMBER__OPTIONAL = MEMBER__OPTIONAL;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_MEMBER__TEXT = MEMBER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>References</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_MEMBER__REFERENCES = MEMBER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Opaque Member</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_MEMBER_FEATURE_COUNT = MEMBER_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_MEMBER___COLLECT__OBJECT_EREFERENCE_ELIST = MEMBER___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_MEMBER___GET_REFERRERS__EREFERENCE = MEMBER___GET_REFERRERS__EREFERENCE;

	/**
	 * The number of operations of the '<em>Opaque Member</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_MEMBER_OPERATION_COUNT = MEMBER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.typescript.ImportKind <em>Import Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.typescript.ImportKind
	 * @see org.nasdanika.sdk.runtime.models.typescript.impl.TypescriptPackageImpl#getImportKind()
	 * @generated
	 */
	int IMPORT_KIND = 33;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.typescript.PrimitiveType <em>Primitive Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.typescript.PrimitiveType
	 * @see org.nasdanika.sdk.runtime.models.typescript.impl.TypescriptPackageImpl#getPrimitiveType()
	 * @generated
	 */
	int PRIMITIVE_TYPE = 34;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.typescript.LiteralKind <em>Literal Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.typescript.LiteralKind
	 * @see org.nasdanika.sdk.runtime.models.typescript.impl.TypescriptPackageImpl#getLiteralKind()
	 * @generated
	 */
	int LITERAL_KIND = 35;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.typescript.VariableKind <em>Variable Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.typescript.VariableKind
	 * @see org.nasdanika.sdk.runtime.models.typescript.impl.TypescriptPackageImpl#getVariableKind()
	 * @generated
	 */
	int VARIABLE_KIND = 36;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.typescript.Visibility <em>Visibility</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.typescript.Visibility
	 * @see org.nasdanika.sdk.runtime.models.typescript.impl.TypescriptPackageImpl#getVisibility()
	 * @generated
	 */
	int VISIBILITY = 37;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.typescript.AccessorKind <em>Accessor Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.typescript.AccessorKind
	 * @see org.nasdanika.sdk.runtime.models.typescript.impl.TypescriptPackageImpl#getAccessorKind()
	 * @generated
	 */
	int ACCESSOR_KIND = 38;


	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.typescript.TypeScriptElement <em>Type Script Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Script Element</em>'.
	 * @see org.nasdanika.sdk.runtime.models.typescript.TypeScriptElement
	 * @generated
	 */
	EClass getTypeScriptElement();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.typescript.Package <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Package</em>'.
	 * @see org.nasdanika.sdk.runtime.models.typescript.Package
	 * @generated
	 */
	EClass getPackage();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.typescript.Package#getPackageName <em>Package Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Package Name</em>'.
	 * @see org.nasdanika.sdk.runtime.models.typescript.Package#getPackageName()
	 * @see #getPackage()
	 * @generated
	 */
	EAttribute getPackage_PackageName();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.typescript.Package#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see org.nasdanika.sdk.runtime.models.typescript.Package#getVersion()
	 * @see #getPackage()
	 * @generated
	 */
	EAttribute getPackage_Version();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.typescript.Package#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.nasdanika.sdk.runtime.models.typescript.Package#getDescription()
	 * @see #getPackage()
	 * @generated
	 */
	EAttribute getPackage_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.typescript.Package#getLicense <em>License</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>License</em>'.
	 * @see org.nasdanika.sdk.runtime.models.typescript.Package#getLicense()
	 * @see #getPackage()
	 * @generated
	 */
	EAttribute getPackage_License();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.typescript.Package#getModuleType <em>Module Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Module Type</em>'.
	 * @see org.nasdanika.sdk.runtime.models.typescript.Package#getModuleType()
	 * @see #getPackage()
	 * @generated
	 */
	EAttribute getPackage_ModuleType();

	/**
	 * Returns the meta object for the attribute list '{@link org.nasdanika.sdk.runtime.models.typescript.Package#getDependencies <em>Dependencies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Dependencies</em>'.
	 * @see org.nasdanika.sdk.runtime.models.typescript.Package#getDependencies()
	 * @see #getPackage()
	 * @generated
	 */
	EAttribute getPackage_Dependencies();

	/**
	 * Returns the meta object for the attribute list '{@link org.nasdanika.sdk.runtime.models.typescript.Package#getPeerDependencies <em>Peer Dependencies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Peer Dependencies</em>'.
	 * @see org.nasdanika.sdk.runtime.models.typescript.Package#getPeerDependencies()
	 * @see #getPackage()
	 * @generated
	 */
	EAttribute getPackage_PeerDependencies();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.sdk.runtime.models.typescript.Package#getModules <em>Modules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Modules</em>'.
	 * @see org.nasdanika.sdk.runtime.models.typescript.Package#getModules()
	 * @see #getPackage()
	 * @generated
	 */
	EReference getPackage_Modules();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.typescript.Module <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Module</em>'.
	 * @see org.nasdanika.sdk.runtime.models.typescript.Module
	 * @generated
	 */
	EClass getModule();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.typescript.Module#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see org.nasdanika.sdk.runtime.models.typescript.Module#getPath()
	 * @see #getModule()
	 * @generated
	 */
	EAttribute getModule_Path();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.typescript.Module#isDeclarationOnly <em>Declaration Only</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Declaration Only</em>'.
	 * @see org.nasdanika.sdk.runtime.models.typescript.Module#isDeclarationOnly()
	 * @see #getModule()
	 * @generated
	 */
	EAttribute getModule_DeclarationOnly();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.typescript.Module#getHeader <em>Header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Header</em>'.
	 * @see org.nasdanika.sdk.runtime.models.typescript.Module#getHeader()
	 * @see #getModule()
	 * @generated
	 */
	EAttribute getModule_Header();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.sdk.runtime.models.typescript.Module#getImports <em>Imports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Imports</em>'.
	 * @see org.nasdanika.sdk.runtime.models.typescript.Module#getImports()
	 * @see #getModule()
	 * @generated
	 */
	EReference getModule_Imports();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.sdk.runtime.models.typescript.Module#getDeclarations <em>Declarations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Declarations</em>'.
	 * @see org.nasdanika.sdk.runtime.models.typescript.Module#getDeclarations()
	 * @see #getModule()
	 * @generated
	 */
	EReference getModule_Declarations();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.typescript.Module#getFooter <em>Footer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Footer</em>'.
	 * @see org.nasdanika.sdk.runtime.models.typescript.Module#getFooter()
	 * @see #getModule()
	 * @generated
	 */
	EAttribute getModule_Footer();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.typescript.Import <em>Import</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Import</em>'.
	 * @see org.nasdanika.sdk.runtime.models.typescript.Import
	 * @generated
	 */
	EClass getImport();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.typescript.Import#getModuleSpecifier <em>Module Specifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Module Specifier</em>'.
	 * @see org.nasdanika.sdk.runtime.models.typescript.Import#getModuleSpecifier()
	 * @see #getImport()
	 * @generated
	 */
	EAttribute getImport_ModuleSpecifier();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.typescript.Import#isTypeOnly <em>Type Only</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Only</em>'.
	 * @see org.nasdanika.sdk.runtime.models.typescript.Import#isTypeOnly()
	 * @see #getImport()
	 * @generated
	 */
	EAttribute getImport_TypeOnly();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.sdk.runtime.models.typescript.Import#getBindings <em>Bindings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bindings</em>'.
	 * @see org.nasdanika.sdk.runtime.models.typescript.Import#getBindings()
	 * @see #getImport()
	 * @generated
	 */
	EReference getImport_Bindings();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.typescript.ImportBinding <em>Import Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Import Binding</em>'.
	 * @see org.nasdanika.sdk.runtime.models.typescript.ImportBinding
	 * @generated
	 */
	EClass getImportBinding();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.typescript.ImportBinding#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see org.nasdanika.sdk.runtime.models.typescript.ImportBinding#getKind()
	 * @see #getImportBinding()
	 * @generated
	 */
	EAttribute getImportBinding_Kind();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.typescript.ImportBinding#getImportedName <em>Imported Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Imported Name</em>'.
	 * @see org.nasdanika.sdk.runtime.models.typescript.ImportBinding#getImportedName()
	 * @see #getImportBinding()
	 * @generated
	 */
	EAttribute getImportBinding_ImportedName();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.typescript.ImportBinding#getAlias <em>Alias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alias</em>'.
	 * @see org.nasdanika.sdk.runtime.models.typescript.ImportBinding#getAlias()
	 * @see #getImportBinding()
	 * @generated
	 */
	EAttribute getImportBinding_Alias();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.typescript.TypeReference <em>Type Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Reference</em>'.
	 * @see org.nasdanika.sdk.runtime.models.typescript.TypeReference
	 * @generated
	 */
	EClass getTypeReference();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.typescript.PrimitiveTypeReference <em>Primitive Type Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Primitive Type Reference</em>'.
	 * @see org.nasdanika.sdk.runtime.models.typescript.PrimitiveTypeReference
	 * @generated
	 */
	EClass getPrimitiveTypeReference();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.typescript.PrimitiveTypeReference#getPrimitiveType <em>Primitive Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Primitive Type</em>'.
	 * @see org.nasdanika.sdk.runtime.models.typescript.PrimitiveTypeReference#getPrimitiveType()
	 * @see #getPrimitiveTypeReference()
	 * @generated
	 */
	EAttribute getPrimitiveTypeReference_PrimitiveType();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.typescript.NamedTypeReference <em>Named Type Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Type Reference</em>'.
	 * @see org.nasdanika.sdk.runtime.models.typescript.NamedTypeReference
	 * @generated
	 */
	EClass getNamedTypeReference();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.sdk.runtime.models.typescript.NamedTypeReference#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.nasdanika.sdk.runtime.models.typescript.NamedTypeReference#getTarget()
	 * @see #getNamedTypeReference()
	 * @generated
	 */
	EReference getNamedTypeReference_Target();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.typescript.NamedTypeReference#getQualifiedName <em>Qualified Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Qualified Name</em>'.
	 * @see org.nasdanika.sdk.runtime.models.typescript.NamedTypeReference#getQualifiedName()
	 * @see #getNamedTypeReference()
	 * @generated
	 */
	EAttribute getNamedTypeReference_QualifiedName();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.typescript.NamedTypeReference#getModuleSpecifier <em>Module Specifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Module Specifier</em>'.
	 * @see org.nasdanika.sdk.runtime.models.typescript.NamedTypeReference#getModuleSpecifier()
	 * @see #getNamedTypeReference()
	 * @generated
	 */
	EAttribute getNamedTypeReference_ModuleSpecifier();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.sdk.runtime.models.typescript.NamedTypeReference#getTypeArguments <em>Type Arguments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Type Arguments</em>'.
	 * @see org.nasdanika.sdk.runtime.models.typescript.NamedTypeReference#getTypeArguments()
	 * @see #getNamedTypeReference()
	 * @generated
	 */
	EReference getNamedTypeReference_TypeArguments();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.typescript.ArrayTypeReference <em>Array Type Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Array Type Reference</em>'.
	 * @see org.nasdanika.sdk.runtime.models.typescript.ArrayTypeReference
	 * @generated
	 */
	EClass getArrayTypeReference();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.sdk.runtime.models.typescript.ArrayTypeReference#getElementType <em>Element Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Element Type</em>'.
	 * @see org.nasdanika.sdk.runtime.models.typescript.ArrayTypeReference#getElementType()
	 * @see #getArrayTypeReference()
	 * @generated
	 */
	EReference getArrayTypeReference_ElementType();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.typescript.UnionTypeReference <em>Union Type Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Union Type Reference</em>'.
	 * @see org.nasdanika.sdk.runtime.models.typescript.UnionTypeReference
	 * @generated
	 */
	EClass getUnionTypeReference();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.sdk.runtime.models.typescript.UnionTypeReference#getTypes <em>Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Types</em>'.
	 * @see org.nasdanika.sdk.runtime.models.typescript.UnionTypeReference#getTypes()
	 * @see #getUnionTypeReference()
	 * @generated
	 */
	EReference getUnionTypeReference_Types();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.typescript.IntersectionTypeReference <em>Intersection Type Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Intersection Type Reference</em>'.
	 * @see org.nasdanika.sdk.runtime.models.typescript.IntersectionTypeReference
	 * @generated
	 */
	EClass getIntersectionTypeReference();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.sdk.runtime.models.typescript.IntersectionTypeReference#getTypes <em>Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Types</em>'.
	 * @see org.nasdanika.sdk.runtime.models.typescript.IntersectionTypeReference#getTypes()
	 * @see #getIntersectionTypeReference()
	 * @generated
	 */
	EReference getIntersectionTypeReference_Types();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.typescript.LiteralTypeReference <em>Literal Type Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Literal Type Reference</em>'.
	 * @see org.nasdanika.sdk.runtime.models.typescript.LiteralTypeReference
	 * @generated
	 */
	EClass getLiteralTypeReference();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.typescript.LiteralTypeReference#getLiteralKind <em>Literal Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Literal Kind</em>'.
	 * @see org.nasdanika.sdk.runtime.models.typescript.LiteralTypeReference#getLiteralKind()
	 * @see #getLiteralTypeReference()
	 * @generated
	 */
	EAttribute getLiteralTypeReference_LiteralKind();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.typescript.LiteralTypeReference#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.nasdanika.sdk.runtime.models.typescript.LiteralTypeReference#getValue()
	 * @see #getLiteralTypeReference()
	 * @generated
	 */
	EAttribute getLiteralTypeReference_Value();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.typescript.TypeLiteralReference <em>Type Literal Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Literal Reference</em>'.
	 * @see org.nasdanika.sdk.runtime.models.typescript.TypeLiteralReference
	 * @generated
	 */
	EClass getTypeLiteralReference();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.sdk.runtime.models.typescript.TypeLiteralReference#getMembers <em>Members</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Members</em>'.
	 * @see org.nasdanika.sdk.runtime.models.typescript.TypeLiteralReference#getMembers()
	 * @see #getTypeLiteralReference()
	 * @generated
	 */
	EReference getTypeLiteralReference_Members();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.typescript.FunctionTypeReference <em>Function Type Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function Type Reference</em>'.
	 * @see org.nasdanika.sdk.runtime.models.typescript.FunctionTypeReference
	 * @generated
	 */
	EClass getFunctionTypeReference();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.sdk.runtime.models.typescript.FunctionTypeReference#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see org.nasdanika.sdk.runtime.models.typescript.FunctionTypeReference#getParameters()
	 * @see #getFunctionTypeReference()
	 * @generated
	 */
	EReference getFunctionTypeReference_Parameters();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.sdk.runtime.models.typescript.FunctionTypeReference#getReturnType <em>Return Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Return Type</em>'.
	 * @see org.nasdanika.sdk.runtime.models.typescript.FunctionTypeReference#getReturnType()
	 * @see #getFunctionTypeReference()
	 * @generated
	 */
	EReference getFunctionTypeReference_ReturnType();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.typescript.OpaqueTypeReference <em>Opaque Type Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Opaque Type Reference</em>'.
	 * @see org.nasdanika.sdk.runtime.models.typescript.OpaqueTypeReference
	 * @generated
	 */
	EClass getOpaqueTypeReference();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.typescript.OpaqueTypeReference#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see org.nasdanika.sdk.runtime.models.typescript.OpaqueTypeReference#getText()
	 * @see #getOpaqueTypeReference()
	 * @generated
	 */
	EAttribute getOpaqueTypeReference_Text();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.sdk.runtime.models.typescript.OpaqueTypeReference#getReferences <em>References</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>References</em>'.
	 * @see org.nasdanika.sdk.runtime.models.typescript.OpaqueTypeReference#getReferences()
	 * @see #getOpaqueTypeReference()
	 * @generated
	 */
	EReference getOpaqueTypeReference_References();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.typescript.Declaration <em>Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Declaration</em>'.
	 * @see org.nasdanika.sdk.runtime.models.typescript.Declaration
	 * @generated
	 */
	EClass getDeclaration();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.typescript.Declaration#isExported <em>Exported</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Exported</em>'.
	 * @see org.nasdanika.sdk.runtime.models.typescript.Declaration#isExported()
	 * @see #getDeclaration()
	 * @generated
	 */
	EAttribute getDeclaration_Exported();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.typescript.Declaration#isAmbient <em>Ambient</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ambient</em>'.
	 * @see org.nasdanika.sdk.runtime.models.typescript.Declaration#isAmbient()
	 * @see #getDeclaration()
	 * @generated
	 */
	EAttribute getDeclaration_Ambient();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.typescript.TypeParameter <em>Type Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Parameter</em>'.
	 * @see org.nasdanika.sdk.runtime.models.typescript.TypeParameter
	 * @generated
	 */
	EClass getTypeParameter();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.sdk.runtime.models.typescript.TypeParameter#getConstraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Constraint</em>'.
	 * @see org.nasdanika.sdk.runtime.models.typescript.TypeParameter#getConstraint()
	 * @see #getTypeParameter()
	 * @generated
	 */
	EReference getTypeParameter_Constraint();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.sdk.runtime.models.typescript.TypeParameter#getDefault <em>Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Default</em>'.
	 * @see org.nasdanika.sdk.runtime.models.typescript.TypeParameter#getDefault()
	 * @see #getTypeParameter()
	 * @generated
	 */
	EReference getTypeParameter_Default();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.typescript.Callable <em>Callable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Callable</em>'.
	 * @see org.nasdanika.sdk.runtime.models.typescript.Callable
	 * @generated
	 */
	EClass getCallable();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.sdk.runtime.models.typescript.Callable#getTypeParameters <em>Type Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Type Parameters</em>'.
	 * @see org.nasdanika.sdk.runtime.models.typescript.Callable#getTypeParameters()
	 * @see #getCallable()
	 * @generated
	 */
	EReference getCallable_TypeParameters();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.sdk.runtime.models.typescript.Callable#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see org.nasdanika.sdk.runtime.models.typescript.Callable#getParameters()
	 * @see #getCallable()
	 * @generated
	 */
	EReference getCallable_Parameters();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.sdk.runtime.models.typescript.Callable#getReturnType <em>Return Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Return Type</em>'.
	 * @see org.nasdanika.sdk.runtime.models.typescript.Callable#getReturnType()
	 * @see #getCallable()
	 * @generated
	 */
	EReference getCallable_ReturnType();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.sdk.runtime.models.typescript.Callable#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Body</em>'.
	 * @see org.nasdanika.sdk.runtime.models.typescript.Callable#getBody()
	 * @see #getCallable()
	 * @generated
	 */
	EReference getCallable_Body();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.typescript.Callable#isAsync <em>Async</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Async</em>'.
	 * @see org.nasdanika.sdk.runtime.models.typescript.Callable#isAsync()
	 * @see #getCallable()
	 * @generated
	 */
	EAttribute getCallable_Async();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.typescript.Callable#isGenerator <em>Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generator</em>'.
	 * @see org.nasdanika.sdk.runtime.models.typescript.Callable#isGenerator()
	 * @see #getCallable()
	 * @generated
	 */
	EAttribute getCallable_Generator();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.typescript.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter</em>'.
	 * @see org.nasdanika.sdk.runtime.models.typescript.Parameter
	 * @generated
	 */
	EClass getParameter();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.sdk.runtime.models.typescript.Parameter#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type</em>'.
	 * @see org.nasdanika.sdk.runtime.models.typescript.Parameter#getType()
	 * @see #getParameter()
	 * @generated
	 */
	EReference getParameter_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.typescript.Parameter#isOptional <em>Optional</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Optional</em>'.
	 * @see org.nasdanika.sdk.runtime.models.typescript.Parameter#isOptional()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Optional();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.typescript.Parameter#isRest <em>Rest</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rest</em>'.
	 * @see org.nasdanika.sdk.runtime.models.typescript.Parameter#isRest()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Rest();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.sdk.runtime.models.typescript.Parameter#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Default Value</em>'.
	 * @see org.nasdanika.sdk.runtime.models.typescript.Parameter#getDefaultValue()
	 * @see #getParameter()
	 * @generated
	 */
	EReference getParameter_DefaultValue();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.typescript.CodeBlock <em>Code Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Code Block</em>'.
	 * @see org.nasdanika.sdk.runtime.models.typescript.CodeBlock
	 * @generated
	 */
	EClass getCodeBlock();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.typescript.CodeBlock#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see org.nasdanika.sdk.runtime.models.typescript.CodeBlock#getText()
	 * @see #getCodeBlock()
	 * @generated
	 */
	EAttribute getCodeBlock_Text();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.sdk.runtime.models.typescript.CodeBlock#getReferences <em>References</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>References</em>'.
	 * @see org.nasdanika.sdk.runtime.models.typescript.CodeBlock#getReferences()
	 * @see #getCodeBlock()
	 * @generated
	 */
	EReference getCodeBlock_References();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.typescript.InterfaceDeclaration <em>Interface Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interface Declaration</em>'.
	 * @see org.nasdanika.sdk.runtime.models.typescript.InterfaceDeclaration
	 * @generated
	 */
	EClass getInterfaceDeclaration();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.sdk.runtime.models.typescript.InterfaceDeclaration#getTypeParameters <em>Type Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Type Parameters</em>'.
	 * @see org.nasdanika.sdk.runtime.models.typescript.InterfaceDeclaration#getTypeParameters()
	 * @see #getInterfaceDeclaration()
	 * @generated
	 */
	EReference getInterfaceDeclaration_TypeParameters();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.sdk.runtime.models.typescript.InterfaceDeclaration#getSuperTypes <em>Super Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Super Types</em>'.
	 * @see org.nasdanika.sdk.runtime.models.typescript.InterfaceDeclaration#getSuperTypes()
	 * @see #getInterfaceDeclaration()
	 * @generated
	 */
	EReference getInterfaceDeclaration_SuperTypes();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.sdk.runtime.models.typescript.InterfaceDeclaration#getMembers <em>Members</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Members</em>'.
	 * @see org.nasdanika.sdk.runtime.models.typescript.InterfaceDeclaration#getMembers()
	 * @see #getInterfaceDeclaration()
	 * @generated
	 */
	EReference getInterfaceDeclaration_Members();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.typescript.ClassDeclaration <em>Class Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class Declaration</em>'.
	 * @see org.nasdanika.sdk.runtime.models.typescript.ClassDeclaration
	 * @generated
	 */
	EClass getClassDeclaration();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.sdk.runtime.models.typescript.ClassDeclaration#getTypeParameters <em>Type Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Type Parameters</em>'.
	 * @see org.nasdanika.sdk.runtime.models.typescript.ClassDeclaration#getTypeParameters()
	 * @see #getClassDeclaration()
	 * @generated
	 */
	EReference getClassDeclaration_TypeParameters();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.sdk.runtime.models.typescript.ClassDeclaration#getSuperClass <em>Super Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Super Class</em>'.
	 * @see org.nasdanika.sdk.runtime.models.typescript.ClassDeclaration#getSuperClass()
	 * @see #getClassDeclaration()
	 * @generated
	 */
	EReference getClassDeclaration_SuperClass();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.sdk.runtime.models.typescript.ClassDeclaration#getInterfaces <em>Interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Interfaces</em>'.
	 * @see org.nasdanika.sdk.runtime.models.typescript.ClassDeclaration#getInterfaces()
	 * @see #getClassDeclaration()
	 * @generated
	 */
	EReference getClassDeclaration_Interfaces();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.typescript.ClassDeclaration#isAbstract <em>Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Abstract</em>'.
	 * @see org.nasdanika.sdk.runtime.models.typescript.ClassDeclaration#isAbstract()
	 * @see #getClassDeclaration()
	 * @generated
	 */
	EAttribute getClassDeclaration_Abstract();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.sdk.runtime.models.typescript.ClassDeclaration#getMembers <em>Members</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Members</em>'.
	 * @see org.nasdanika.sdk.runtime.models.typescript.ClassDeclaration#getMembers()
	 * @see #getClassDeclaration()
	 * @generated
	 */
	EReference getClassDeclaration_Members();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.typescript.TypeAliasDeclaration <em>Type Alias Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Alias Declaration</em>'.
	 * @see org.nasdanika.sdk.runtime.models.typescript.TypeAliasDeclaration
	 * @generated
	 */
	EClass getTypeAliasDeclaration();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.sdk.runtime.models.typescript.TypeAliasDeclaration#getTypeParameters <em>Type Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Type Parameters</em>'.
	 * @see org.nasdanika.sdk.runtime.models.typescript.TypeAliasDeclaration#getTypeParameters()
	 * @see #getTypeAliasDeclaration()
	 * @generated
	 */
	EReference getTypeAliasDeclaration_TypeParameters();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.sdk.runtime.models.typescript.TypeAliasDeclaration#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type</em>'.
	 * @see org.nasdanika.sdk.runtime.models.typescript.TypeAliasDeclaration#getType()
	 * @see #getTypeAliasDeclaration()
	 * @generated
	 */
	EReference getTypeAliasDeclaration_Type();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.typescript.EnumDeclaration <em>Enum Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enum Declaration</em>'.
	 * @see org.nasdanika.sdk.runtime.models.typescript.EnumDeclaration
	 * @generated
	 */
	EClass getEnumDeclaration();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.typescript.EnumDeclaration#isConstant <em>Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Constant</em>'.
	 * @see org.nasdanika.sdk.runtime.models.typescript.EnumDeclaration#isConstant()
	 * @see #getEnumDeclaration()
	 * @generated
	 */
	EAttribute getEnumDeclaration_Constant();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.sdk.runtime.models.typescript.EnumDeclaration#getMembers <em>Members</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Members</em>'.
	 * @see org.nasdanika.sdk.runtime.models.typescript.EnumDeclaration#getMembers()
	 * @see #getEnumDeclaration()
	 * @generated
	 */
	EReference getEnumDeclaration_Members();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.typescript.EnumMember <em>Enum Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enum Member</em>'.
	 * @see org.nasdanika.sdk.runtime.models.typescript.EnumMember
	 * @generated
	 */
	EClass getEnumMember();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.typescript.EnumMember#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.nasdanika.sdk.runtime.models.typescript.EnumMember#getValue()
	 * @see #getEnumMember()
	 * @generated
	 */
	EAttribute getEnumMember_Value();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.typescript.FunctionDeclaration <em>Function Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function Declaration</em>'.
	 * @see org.nasdanika.sdk.runtime.models.typescript.FunctionDeclaration
	 * @generated
	 */
	EClass getFunctionDeclaration();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.typescript.VariableDeclaration <em>Variable Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable Declaration</em>'.
	 * @see org.nasdanika.sdk.runtime.models.typescript.VariableDeclaration
	 * @generated
	 */
	EClass getVariableDeclaration();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.typescript.VariableDeclaration#getVariableKind <em>Variable Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Variable Kind</em>'.
	 * @see org.nasdanika.sdk.runtime.models.typescript.VariableDeclaration#getVariableKind()
	 * @see #getVariableDeclaration()
	 * @generated
	 */
	EAttribute getVariableDeclaration_VariableKind();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.sdk.runtime.models.typescript.VariableDeclaration#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type</em>'.
	 * @see org.nasdanika.sdk.runtime.models.typescript.VariableDeclaration#getType()
	 * @see #getVariableDeclaration()
	 * @generated
	 */
	EReference getVariableDeclaration_Type();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.sdk.runtime.models.typescript.VariableDeclaration#getInitializer <em>Initializer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Initializer</em>'.
	 * @see org.nasdanika.sdk.runtime.models.typescript.VariableDeclaration#getInitializer()
	 * @see #getVariableDeclaration()
	 * @generated
	 */
	EReference getVariableDeclaration_Initializer();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.typescript.Member <em>Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Member</em>'.
	 * @see org.nasdanika.sdk.runtime.models.typescript.Member
	 * @generated
	 */
	EClass getMember();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.typescript.Member#getVisibility <em>Visibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visibility</em>'.
	 * @see org.nasdanika.sdk.runtime.models.typescript.Member#getVisibility()
	 * @see #getMember()
	 * @generated
	 */
	EAttribute getMember_Visibility();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.typescript.Member#isStatic <em>Static</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Static</em>'.
	 * @see org.nasdanika.sdk.runtime.models.typescript.Member#isStatic()
	 * @see #getMember()
	 * @generated
	 */
	EAttribute getMember_Static();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.typescript.Member#isOptional <em>Optional</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Optional</em>'.
	 * @see org.nasdanika.sdk.runtime.models.typescript.Member#isOptional()
	 * @see #getMember()
	 * @generated
	 */
	EAttribute getMember_Optional();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.typescript.Property <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property</em>'.
	 * @see org.nasdanika.sdk.runtime.models.typescript.Property
	 * @generated
	 */
	EClass getProperty();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.sdk.runtime.models.typescript.Property#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type</em>'.
	 * @see org.nasdanika.sdk.runtime.models.typescript.Property#getType()
	 * @see #getProperty()
	 * @generated
	 */
	EReference getProperty_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.typescript.Property#isReadonly <em>Readonly</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Readonly</em>'.
	 * @see org.nasdanika.sdk.runtime.models.typescript.Property#isReadonly()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Readonly();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.sdk.runtime.models.typescript.Property#getInitializer <em>Initializer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Initializer</em>'.
	 * @see org.nasdanika.sdk.runtime.models.typescript.Property#getInitializer()
	 * @see #getProperty()
	 * @generated
	 */
	EReference getProperty_Initializer();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.typescript.Method <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Method</em>'.
	 * @see org.nasdanika.sdk.runtime.models.typescript.Method
	 * @generated
	 */
	EClass getMethod();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.typescript.Method#isAbstract <em>Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Abstract</em>'.
	 * @see org.nasdanika.sdk.runtime.models.typescript.Method#isAbstract()
	 * @see #getMethod()
	 * @generated
	 */
	EAttribute getMethod_Abstract();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.typescript.Constructor <em>Constructor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constructor</em>'.
	 * @see org.nasdanika.sdk.runtime.models.typescript.Constructor
	 * @generated
	 */
	EClass getConstructor();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.sdk.runtime.models.typescript.Constructor#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see org.nasdanika.sdk.runtime.models.typescript.Constructor#getParameters()
	 * @see #getConstructor()
	 * @generated
	 */
	EReference getConstructor_Parameters();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.sdk.runtime.models.typescript.Constructor#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Body</em>'.
	 * @see org.nasdanika.sdk.runtime.models.typescript.Constructor#getBody()
	 * @see #getConstructor()
	 * @generated
	 */
	EReference getConstructor_Body();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.typescript.Accessor <em>Accessor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Accessor</em>'.
	 * @see org.nasdanika.sdk.runtime.models.typescript.Accessor
	 * @generated
	 */
	EClass getAccessor();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.typescript.Accessor#getAccessorKind <em>Accessor Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Accessor Kind</em>'.
	 * @see org.nasdanika.sdk.runtime.models.typescript.Accessor#getAccessorKind()
	 * @see #getAccessor()
	 * @generated
	 */
	EAttribute getAccessor_AccessorKind();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.typescript.OpaqueMember <em>Opaque Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Opaque Member</em>'.
	 * @see org.nasdanika.sdk.runtime.models.typescript.OpaqueMember
	 * @generated
	 */
	EClass getOpaqueMember();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.typescript.OpaqueMember#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see org.nasdanika.sdk.runtime.models.typescript.OpaqueMember#getText()
	 * @see #getOpaqueMember()
	 * @generated
	 */
	EAttribute getOpaqueMember_Text();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.sdk.runtime.models.typescript.OpaqueMember#getReferences <em>References</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>References</em>'.
	 * @see org.nasdanika.sdk.runtime.models.typescript.OpaqueMember#getReferences()
	 * @see #getOpaqueMember()
	 * @generated
	 */
	EReference getOpaqueMember_References();

	/**
	 * Returns the meta object for enum '{@link org.nasdanika.sdk.runtime.models.typescript.ImportKind <em>Import Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Import Kind</em>'.
	 * @see org.nasdanika.sdk.runtime.models.typescript.ImportKind
	 * @generated
	 */
	EEnum getImportKind();

	/**
	 * Returns the meta object for enum '{@link org.nasdanika.sdk.runtime.models.typescript.PrimitiveType <em>Primitive Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Primitive Type</em>'.
	 * @see org.nasdanika.sdk.runtime.models.typescript.PrimitiveType
	 * @generated
	 */
	EEnum getPrimitiveType();

	/**
	 * Returns the meta object for enum '{@link org.nasdanika.sdk.runtime.models.typescript.LiteralKind <em>Literal Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Literal Kind</em>'.
	 * @see org.nasdanika.sdk.runtime.models.typescript.LiteralKind
	 * @generated
	 */
	EEnum getLiteralKind();

	/**
	 * Returns the meta object for enum '{@link org.nasdanika.sdk.runtime.models.typescript.VariableKind <em>Variable Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Variable Kind</em>'.
	 * @see org.nasdanika.sdk.runtime.models.typescript.VariableKind
	 * @generated
	 */
	EEnum getVariableKind();

	/**
	 * Returns the meta object for enum '{@link org.nasdanika.sdk.runtime.models.typescript.Visibility <em>Visibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Visibility</em>'.
	 * @see org.nasdanika.sdk.runtime.models.typescript.Visibility
	 * @generated
	 */
	EEnum getVisibility();

	/**
	 * Returns the meta object for enum '{@link org.nasdanika.sdk.runtime.models.typescript.AccessorKind <em>Accessor Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Accessor Kind</em>'.
	 * @see org.nasdanika.sdk.runtime.models.typescript.AccessorKind
	 * @generated
	 */
	EEnum getAccessorKind();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TypescriptFactory getTypescriptFactory();

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
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.typescript.impl.TypeScriptElementImpl <em>Type Script Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.typescript.impl.TypeScriptElementImpl
		 * @see org.nasdanika.sdk.runtime.models.typescript.impl.TypescriptPackageImpl#getTypeScriptElement()
		 * @generated
		 */
		EClass TYPE_SCRIPT_ELEMENT = eINSTANCE.getTypeScriptElement();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.typescript.impl.PackageImpl <em>Package</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.typescript.impl.PackageImpl
		 * @see org.nasdanika.sdk.runtime.models.typescript.impl.TypescriptPackageImpl#getPackage()
		 * @generated
		 */
		EClass PACKAGE = eINSTANCE.getPackage();

		/**
		 * The meta object literal for the '<em><b>Package Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PACKAGE__PACKAGE_NAME = eINSTANCE.getPackage_PackageName();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PACKAGE__VERSION = eINSTANCE.getPackage_Version();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PACKAGE__DESCRIPTION = eINSTANCE.getPackage_Description();

		/**
		 * The meta object literal for the '<em><b>License</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PACKAGE__LICENSE = eINSTANCE.getPackage_License();

		/**
		 * The meta object literal for the '<em><b>Module Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PACKAGE__MODULE_TYPE = eINSTANCE.getPackage_ModuleType();

		/**
		 * The meta object literal for the '<em><b>Dependencies</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PACKAGE__DEPENDENCIES = eINSTANCE.getPackage_Dependencies();

		/**
		 * The meta object literal for the '<em><b>Peer Dependencies</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PACKAGE__PEER_DEPENDENCIES = eINSTANCE.getPackage_PeerDependencies();

		/**
		 * The meta object literal for the '<em><b>Modules</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE__MODULES = eINSTANCE.getPackage_Modules();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.typescript.impl.ModuleImpl <em>Module</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.typescript.impl.ModuleImpl
		 * @see org.nasdanika.sdk.runtime.models.typescript.impl.TypescriptPackageImpl#getModule()
		 * @generated
		 */
		EClass MODULE = eINSTANCE.getModule();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODULE__PATH = eINSTANCE.getModule_Path();

		/**
		 * The meta object literal for the '<em><b>Declaration Only</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODULE__DECLARATION_ONLY = eINSTANCE.getModule_DeclarationOnly();

		/**
		 * The meta object literal for the '<em><b>Header</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODULE__HEADER = eINSTANCE.getModule_Header();

		/**
		 * The meta object literal for the '<em><b>Imports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE__IMPORTS = eINSTANCE.getModule_Imports();

		/**
		 * The meta object literal for the '<em><b>Declarations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE__DECLARATIONS = eINSTANCE.getModule_Declarations();

		/**
		 * The meta object literal for the '<em><b>Footer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODULE__FOOTER = eINSTANCE.getModule_Footer();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.typescript.impl.ImportImpl <em>Import</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.typescript.impl.ImportImpl
		 * @see org.nasdanika.sdk.runtime.models.typescript.impl.TypescriptPackageImpl#getImport()
		 * @generated
		 */
		EClass IMPORT = eINSTANCE.getImport();

		/**
		 * The meta object literal for the '<em><b>Module Specifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMPORT__MODULE_SPECIFIER = eINSTANCE.getImport_ModuleSpecifier();

		/**
		 * The meta object literal for the '<em><b>Type Only</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMPORT__TYPE_ONLY = eINSTANCE.getImport_TypeOnly();

		/**
		 * The meta object literal for the '<em><b>Bindings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMPORT__BINDINGS = eINSTANCE.getImport_Bindings();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.typescript.impl.ImportBindingImpl <em>Import Binding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.typescript.impl.ImportBindingImpl
		 * @see org.nasdanika.sdk.runtime.models.typescript.impl.TypescriptPackageImpl#getImportBinding()
		 * @generated
		 */
		EClass IMPORT_BINDING = eINSTANCE.getImportBinding();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMPORT_BINDING__KIND = eINSTANCE.getImportBinding_Kind();

		/**
		 * The meta object literal for the '<em><b>Imported Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMPORT_BINDING__IMPORTED_NAME = eINSTANCE.getImportBinding_ImportedName();

		/**
		 * The meta object literal for the '<em><b>Alias</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMPORT_BINDING__ALIAS = eINSTANCE.getImportBinding_Alias();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.typescript.impl.TypeReferenceImpl <em>Type Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.typescript.impl.TypeReferenceImpl
		 * @see org.nasdanika.sdk.runtime.models.typescript.impl.TypescriptPackageImpl#getTypeReference()
		 * @generated
		 */
		EClass TYPE_REFERENCE = eINSTANCE.getTypeReference();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.typescript.impl.PrimitiveTypeReferenceImpl <em>Primitive Type Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.typescript.impl.PrimitiveTypeReferenceImpl
		 * @see org.nasdanika.sdk.runtime.models.typescript.impl.TypescriptPackageImpl#getPrimitiveTypeReference()
		 * @generated
		 */
		EClass PRIMITIVE_TYPE_REFERENCE = eINSTANCE.getPrimitiveTypeReference();

		/**
		 * The meta object literal for the '<em><b>Primitive Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRIMITIVE_TYPE_REFERENCE__PRIMITIVE_TYPE = eINSTANCE.getPrimitiveTypeReference_PrimitiveType();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.typescript.impl.NamedTypeReferenceImpl <em>Named Type Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.typescript.impl.NamedTypeReferenceImpl
		 * @see org.nasdanika.sdk.runtime.models.typescript.impl.TypescriptPackageImpl#getNamedTypeReference()
		 * @generated
		 */
		EClass NAMED_TYPE_REFERENCE = eINSTANCE.getNamedTypeReference();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NAMED_TYPE_REFERENCE__TARGET = eINSTANCE.getNamedTypeReference_Target();

		/**
		 * The meta object literal for the '<em><b>Qualified Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_TYPE_REFERENCE__QUALIFIED_NAME = eINSTANCE.getNamedTypeReference_QualifiedName();

		/**
		 * The meta object literal for the '<em><b>Module Specifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_TYPE_REFERENCE__MODULE_SPECIFIER = eINSTANCE.getNamedTypeReference_ModuleSpecifier();

		/**
		 * The meta object literal for the '<em><b>Type Arguments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NAMED_TYPE_REFERENCE__TYPE_ARGUMENTS = eINSTANCE.getNamedTypeReference_TypeArguments();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.typescript.impl.ArrayTypeReferenceImpl <em>Array Type Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.typescript.impl.ArrayTypeReferenceImpl
		 * @see org.nasdanika.sdk.runtime.models.typescript.impl.TypescriptPackageImpl#getArrayTypeReference()
		 * @generated
		 */
		EClass ARRAY_TYPE_REFERENCE = eINSTANCE.getArrayTypeReference();

		/**
		 * The meta object literal for the '<em><b>Element Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARRAY_TYPE_REFERENCE__ELEMENT_TYPE = eINSTANCE.getArrayTypeReference_ElementType();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.typescript.impl.UnionTypeReferenceImpl <em>Union Type Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.typescript.impl.UnionTypeReferenceImpl
		 * @see org.nasdanika.sdk.runtime.models.typescript.impl.TypescriptPackageImpl#getUnionTypeReference()
		 * @generated
		 */
		EClass UNION_TYPE_REFERENCE = eINSTANCE.getUnionTypeReference();

		/**
		 * The meta object literal for the '<em><b>Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNION_TYPE_REFERENCE__TYPES = eINSTANCE.getUnionTypeReference_Types();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.typescript.impl.IntersectionTypeReferenceImpl <em>Intersection Type Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.typescript.impl.IntersectionTypeReferenceImpl
		 * @see org.nasdanika.sdk.runtime.models.typescript.impl.TypescriptPackageImpl#getIntersectionTypeReference()
		 * @generated
		 */
		EClass INTERSECTION_TYPE_REFERENCE = eINSTANCE.getIntersectionTypeReference();

		/**
		 * The meta object literal for the '<em><b>Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERSECTION_TYPE_REFERENCE__TYPES = eINSTANCE.getIntersectionTypeReference_Types();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.typescript.impl.LiteralTypeReferenceImpl <em>Literal Type Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.typescript.impl.LiteralTypeReferenceImpl
		 * @see org.nasdanika.sdk.runtime.models.typescript.impl.TypescriptPackageImpl#getLiteralTypeReference()
		 * @generated
		 */
		EClass LITERAL_TYPE_REFERENCE = eINSTANCE.getLiteralTypeReference();

		/**
		 * The meta object literal for the '<em><b>Literal Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LITERAL_TYPE_REFERENCE__LITERAL_KIND = eINSTANCE.getLiteralTypeReference_LiteralKind();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LITERAL_TYPE_REFERENCE__VALUE = eINSTANCE.getLiteralTypeReference_Value();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.typescript.impl.TypeLiteralReferenceImpl <em>Type Literal Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.typescript.impl.TypeLiteralReferenceImpl
		 * @see org.nasdanika.sdk.runtime.models.typescript.impl.TypescriptPackageImpl#getTypeLiteralReference()
		 * @generated
		 */
		EClass TYPE_LITERAL_REFERENCE = eINSTANCE.getTypeLiteralReference();

		/**
		 * The meta object literal for the '<em><b>Members</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_LITERAL_REFERENCE__MEMBERS = eINSTANCE.getTypeLiteralReference_Members();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.typescript.impl.FunctionTypeReferenceImpl <em>Function Type Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.typescript.impl.FunctionTypeReferenceImpl
		 * @see org.nasdanika.sdk.runtime.models.typescript.impl.TypescriptPackageImpl#getFunctionTypeReference()
		 * @generated
		 */
		EClass FUNCTION_TYPE_REFERENCE = eINSTANCE.getFunctionTypeReference();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_TYPE_REFERENCE__PARAMETERS = eINSTANCE.getFunctionTypeReference_Parameters();

		/**
		 * The meta object literal for the '<em><b>Return Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_TYPE_REFERENCE__RETURN_TYPE = eINSTANCE.getFunctionTypeReference_ReturnType();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.typescript.impl.OpaqueTypeReferenceImpl <em>Opaque Type Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.typescript.impl.OpaqueTypeReferenceImpl
		 * @see org.nasdanika.sdk.runtime.models.typescript.impl.TypescriptPackageImpl#getOpaqueTypeReference()
		 * @generated
		 */
		EClass OPAQUE_TYPE_REFERENCE = eINSTANCE.getOpaqueTypeReference();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPAQUE_TYPE_REFERENCE__TEXT = eINSTANCE.getOpaqueTypeReference_Text();

		/**
		 * The meta object literal for the '<em><b>References</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPAQUE_TYPE_REFERENCE__REFERENCES = eINSTANCE.getOpaqueTypeReference_References();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.typescript.impl.DeclarationImpl <em>Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.typescript.impl.DeclarationImpl
		 * @see org.nasdanika.sdk.runtime.models.typescript.impl.TypescriptPackageImpl#getDeclaration()
		 * @generated
		 */
		EClass DECLARATION = eINSTANCE.getDeclaration();

		/**
		 * The meta object literal for the '<em><b>Exported</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DECLARATION__EXPORTED = eINSTANCE.getDeclaration_Exported();

		/**
		 * The meta object literal for the '<em><b>Ambient</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DECLARATION__AMBIENT = eINSTANCE.getDeclaration_Ambient();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.typescript.impl.TypeParameterImpl <em>Type Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.typescript.impl.TypeParameterImpl
		 * @see org.nasdanika.sdk.runtime.models.typescript.impl.TypescriptPackageImpl#getTypeParameter()
		 * @generated
		 */
		EClass TYPE_PARAMETER = eINSTANCE.getTypeParameter();

		/**
		 * The meta object literal for the '<em><b>Constraint</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_PARAMETER__CONSTRAINT = eINSTANCE.getTypeParameter_Constraint();

		/**
		 * The meta object literal for the '<em><b>Default</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_PARAMETER__DEFAULT = eINSTANCE.getTypeParameter_Default();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.typescript.impl.CallableImpl <em>Callable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.typescript.impl.CallableImpl
		 * @see org.nasdanika.sdk.runtime.models.typescript.impl.TypescriptPackageImpl#getCallable()
		 * @generated
		 */
		EClass CALLABLE = eINSTANCE.getCallable();

		/**
		 * The meta object literal for the '<em><b>Type Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CALLABLE__TYPE_PARAMETERS = eINSTANCE.getCallable_TypeParameters();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CALLABLE__PARAMETERS = eINSTANCE.getCallable_Parameters();

		/**
		 * The meta object literal for the '<em><b>Return Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CALLABLE__RETURN_TYPE = eINSTANCE.getCallable_ReturnType();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CALLABLE__BODY = eINSTANCE.getCallable_Body();

		/**
		 * The meta object literal for the '<em><b>Async</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CALLABLE__ASYNC = eINSTANCE.getCallable_Async();

		/**
		 * The meta object literal for the '<em><b>Generator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CALLABLE__GENERATOR = eINSTANCE.getCallable_Generator();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.typescript.impl.ParameterImpl <em>Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.typescript.impl.ParameterImpl
		 * @see org.nasdanika.sdk.runtime.models.typescript.impl.TypescriptPackageImpl#getParameter()
		 * @generated
		 */
		EClass PARAMETER = eINSTANCE.getParameter();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER__TYPE = eINSTANCE.getParameter_Type();

		/**
		 * The meta object literal for the '<em><b>Optional</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__OPTIONAL = eINSTANCE.getParameter_Optional();

		/**
		 * The meta object literal for the '<em><b>Rest</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__REST = eINSTANCE.getParameter_Rest();

		/**
		 * The meta object literal for the '<em><b>Default Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER__DEFAULT_VALUE = eINSTANCE.getParameter_DefaultValue();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.typescript.impl.CodeBlockImpl <em>Code Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.typescript.impl.CodeBlockImpl
		 * @see org.nasdanika.sdk.runtime.models.typescript.impl.TypescriptPackageImpl#getCodeBlock()
		 * @generated
		 */
		EClass CODE_BLOCK = eINSTANCE.getCodeBlock();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CODE_BLOCK__TEXT = eINSTANCE.getCodeBlock_Text();

		/**
		 * The meta object literal for the '<em><b>References</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CODE_BLOCK__REFERENCES = eINSTANCE.getCodeBlock_References();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.typescript.impl.InterfaceDeclarationImpl <em>Interface Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.typescript.impl.InterfaceDeclarationImpl
		 * @see org.nasdanika.sdk.runtime.models.typescript.impl.TypescriptPackageImpl#getInterfaceDeclaration()
		 * @generated
		 */
		EClass INTERFACE_DECLARATION = eINSTANCE.getInterfaceDeclaration();

		/**
		 * The meta object literal for the '<em><b>Type Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE_DECLARATION__TYPE_PARAMETERS = eINSTANCE.getInterfaceDeclaration_TypeParameters();

		/**
		 * The meta object literal for the '<em><b>Super Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE_DECLARATION__SUPER_TYPES = eINSTANCE.getInterfaceDeclaration_SuperTypes();

		/**
		 * The meta object literal for the '<em><b>Members</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE_DECLARATION__MEMBERS = eINSTANCE.getInterfaceDeclaration_Members();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.typescript.impl.ClassDeclarationImpl <em>Class Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.typescript.impl.ClassDeclarationImpl
		 * @see org.nasdanika.sdk.runtime.models.typescript.impl.TypescriptPackageImpl#getClassDeclaration()
		 * @generated
		 */
		EClass CLASS_DECLARATION = eINSTANCE.getClassDeclaration();

		/**
		 * The meta object literal for the '<em><b>Type Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS_DECLARATION__TYPE_PARAMETERS = eINSTANCE.getClassDeclaration_TypeParameters();

		/**
		 * The meta object literal for the '<em><b>Super Class</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS_DECLARATION__SUPER_CLASS = eINSTANCE.getClassDeclaration_SuperClass();

		/**
		 * The meta object literal for the '<em><b>Interfaces</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS_DECLARATION__INTERFACES = eINSTANCE.getClassDeclaration_Interfaces();

		/**
		 * The meta object literal for the '<em><b>Abstract</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASS_DECLARATION__ABSTRACT = eINSTANCE.getClassDeclaration_Abstract();

		/**
		 * The meta object literal for the '<em><b>Members</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS_DECLARATION__MEMBERS = eINSTANCE.getClassDeclaration_Members();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.typescript.impl.TypeAliasDeclarationImpl <em>Type Alias Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.typescript.impl.TypeAliasDeclarationImpl
		 * @see org.nasdanika.sdk.runtime.models.typescript.impl.TypescriptPackageImpl#getTypeAliasDeclaration()
		 * @generated
		 */
		EClass TYPE_ALIAS_DECLARATION = eINSTANCE.getTypeAliasDeclaration();

		/**
		 * The meta object literal for the '<em><b>Type Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_ALIAS_DECLARATION__TYPE_PARAMETERS = eINSTANCE.getTypeAliasDeclaration_TypeParameters();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_ALIAS_DECLARATION__TYPE = eINSTANCE.getTypeAliasDeclaration_Type();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.typescript.impl.EnumDeclarationImpl <em>Enum Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.typescript.impl.EnumDeclarationImpl
		 * @see org.nasdanika.sdk.runtime.models.typescript.impl.TypescriptPackageImpl#getEnumDeclaration()
		 * @generated
		 */
		EClass ENUM_DECLARATION = eINSTANCE.getEnumDeclaration();

		/**
		 * The meta object literal for the '<em><b>Constant</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENUM_DECLARATION__CONSTANT = eINSTANCE.getEnumDeclaration_Constant();

		/**
		 * The meta object literal for the '<em><b>Members</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENUM_DECLARATION__MEMBERS = eINSTANCE.getEnumDeclaration_Members();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.typescript.impl.EnumMemberImpl <em>Enum Member</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.typescript.impl.EnumMemberImpl
		 * @see org.nasdanika.sdk.runtime.models.typescript.impl.TypescriptPackageImpl#getEnumMember()
		 * @generated
		 */
		EClass ENUM_MEMBER = eINSTANCE.getEnumMember();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENUM_MEMBER__VALUE = eINSTANCE.getEnumMember_Value();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.typescript.impl.FunctionDeclarationImpl <em>Function Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.typescript.impl.FunctionDeclarationImpl
		 * @see org.nasdanika.sdk.runtime.models.typescript.impl.TypescriptPackageImpl#getFunctionDeclaration()
		 * @generated
		 */
		EClass FUNCTION_DECLARATION = eINSTANCE.getFunctionDeclaration();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.typescript.impl.VariableDeclarationImpl <em>Variable Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.typescript.impl.VariableDeclarationImpl
		 * @see org.nasdanika.sdk.runtime.models.typescript.impl.TypescriptPackageImpl#getVariableDeclaration()
		 * @generated
		 */
		EClass VARIABLE_DECLARATION = eINSTANCE.getVariableDeclaration();

		/**
		 * The meta object literal for the '<em><b>Variable Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE_DECLARATION__VARIABLE_KIND = eINSTANCE.getVariableDeclaration_VariableKind();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE_DECLARATION__TYPE = eINSTANCE.getVariableDeclaration_Type();

		/**
		 * The meta object literal for the '<em><b>Initializer</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE_DECLARATION__INITIALIZER = eINSTANCE.getVariableDeclaration_Initializer();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.typescript.impl.MemberImpl <em>Member</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.typescript.impl.MemberImpl
		 * @see org.nasdanika.sdk.runtime.models.typescript.impl.TypescriptPackageImpl#getMember()
		 * @generated
		 */
		EClass MEMBER = eINSTANCE.getMember();

		/**
		 * The meta object literal for the '<em><b>Visibility</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEMBER__VISIBILITY = eINSTANCE.getMember_Visibility();

		/**
		 * The meta object literal for the '<em><b>Static</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEMBER__STATIC = eINSTANCE.getMember_Static();

		/**
		 * The meta object literal for the '<em><b>Optional</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEMBER__OPTIONAL = eINSTANCE.getMember_Optional();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.typescript.impl.PropertyImpl <em>Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.typescript.impl.PropertyImpl
		 * @see org.nasdanika.sdk.runtime.models.typescript.impl.TypescriptPackageImpl#getProperty()
		 * @generated
		 */
		EClass PROPERTY = eINSTANCE.getProperty();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY__TYPE = eINSTANCE.getProperty_Type();

		/**
		 * The meta object literal for the '<em><b>Readonly</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__READONLY = eINSTANCE.getProperty_Readonly();

		/**
		 * The meta object literal for the '<em><b>Initializer</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY__INITIALIZER = eINSTANCE.getProperty_Initializer();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.typescript.impl.MethodImpl <em>Method</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.typescript.impl.MethodImpl
		 * @see org.nasdanika.sdk.runtime.models.typescript.impl.TypescriptPackageImpl#getMethod()
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
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.typescript.impl.ConstructorImpl <em>Constructor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.typescript.impl.ConstructorImpl
		 * @see org.nasdanika.sdk.runtime.models.typescript.impl.TypescriptPackageImpl#getConstructor()
		 * @generated
		 */
		EClass CONSTRUCTOR = eINSTANCE.getConstructor();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTRUCTOR__PARAMETERS = eINSTANCE.getConstructor_Parameters();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTRUCTOR__BODY = eINSTANCE.getConstructor_Body();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.typescript.impl.AccessorImpl <em>Accessor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.typescript.impl.AccessorImpl
		 * @see org.nasdanika.sdk.runtime.models.typescript.impl.TypescriptPackageImpl#getAccessor()
		 * @generated
		 */
		EClass ACCESSOR = eINSTANCE.getAccessor();

		/**
		 * The meta object literal for the '<em><b>Accessor Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCESSOR__ACCESSOR_KIND = eINSTANCE.getAccessor_AccessorKind();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.typescript.impl.OpaqueMemberImpl <em>Opaque Member</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.typescript.impl.OpaqueMemberImpl
		 * @see org.nasdanika.sdk.runtime.models.typescript.impl.TypescriptPackageImpl#getOpaqueMember()
		 * @generated
		 */
		EClass OPAQUE_MEMBER = eINSTANCE.getOpaqueMember();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPAQUE_MEMBER__TEXT = eINSTANCE.getOpaqueMember_Text();

		/**
		 * The meta object literal for the '<em><b>References</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPAQUE_MEMBER__REFERENCES = eINSTANCE.getOpaqueMember_References();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.typescript.ImportKind <em>Import Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.typescript.ImportKind
		 * @see org.nasdanika.sdk.runtime.models.typescript.impl.TypescriptPackageImpl#getImportKind()
		 * @generated
		 */
		EEnum IMPORT_KIND = eINSTANCE.getImportKind();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.typescript.PrimitiveType <em>Primitive Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.typescript.PrimitiveType
		 * @see org.nasdanika.sdk.runtime.models.typescript.impl.TypescriptPackageImpl#getPrimitiveType()
		 * @generated
		 */
		EEnum PRIMITIVE_TYPE = eINSTANCE.getPrimitiveType();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.typescript.LiteralKind <em>Literal Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.typescript.LiteralKind
		 * @see org.nasdanika.sdk.runtime.models.typescript.impl.TypescriptPackageImpl#getLiteralKind()
		 * @generated
		 */
		EEnum LITERAL_KIND = eINSTANCE.getLiteralKind();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.typescript.VariableKind <em>Variable Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.typescript.VariableKind
		 * @see org.nasdanika.sdk.runtime.models.typescript.impl.TypescriptPackageImpl#getVariableKind()
		 * @generated
		 */
		EEnum VARIABLE_KIND = eINSTANCE.getVariableKind();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.typescript.Visibility <em>Visibility</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.typescript.Visibility
		 * @see org.nasdanika.sdk.runtime.models.typescript.impl.TypescriptPackageImpl#getVisibility()
		 * @generated
		 */
		EEnum VISIBILITY = eINSTANCE.getVisibility();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.typescript.AccessorKind <em>Accessor Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.typescript.AccessorKind
		 * @see org.nasdanika.sdk.runtime.models.typescript.impl.TypescriptPackageImpl#getAccessorKind()
		 * @generated
		 */
		EEnum ACCESSOR_KIND = eINSTANCE.getAccessorKind();

	}

} //TypescriptPackage
