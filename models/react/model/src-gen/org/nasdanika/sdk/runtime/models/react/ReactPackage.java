/**
 */
package org.nasdanika.sdk.runtime.models.react;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.nasdanika.sdk.runtime.models.html.HtmlPackage;

import org.nasdanika.sdk.runtime.models.typescript.TypescriptPackage;

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
 * @see org.nasdanika.sdk.runtime.models.react.ReactFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel modelDirectory='/model/src-gen' featureDelegation='Dynamic' complianceLevel='25' suppressGenModelAnnotations='false' copyrightFields='false' operationReflection='true' importOrganizing='true' basePackage='org.nasdanika.sdk.runtime.models'"
 *        annotation="http://www.eclipse.org/emf/2011/Xcore Ecore='http://www.eclipse.org/emf/2002/Ecore' GenModel='http://www.eclipse.org/emf/2002/GenModel' Nasdanika='urn:org.nasdanika'"
 * @generated
 */
public interface ReactPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "react";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "https://runtime.sdk.nasdanika.org/models/react";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.nasdanika.sdk.runtime.models.react";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ReactPackage eINSTANCE = org.nasdanika.sdk.runtime.models.react.impl.ReactPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.react.impl.ReactElementImpl <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.react.impl.ReactElementImpl
	 * @see org.nasdanika.sdk.runtime.models.react.impl.ReactPackageImpl#getReactElement()
	 * @generated
	 */
	int REACT_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACT_ELEMENT__ID = TypescriptPackage.TYPE_SCRIPT_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACT_ELEMENT__DOCUMENTATION = TypescriptPackage.TYPE_SCRIPT_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACT_ELEMENT__DOC_REF = TypescriptPackage.TYPE_SCRIPT_ELEMENT__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACT_ELEMENT__DOC_FORMAT = TypescriptPackage.TYPE_SCRIPT_ELEMENT__DOC_FORMAT;

	/**
	 * The feature id for the '<em><b>Doc Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACT_ELEMENT__DOC_CONTENTS = TypescriptPackage.TYPE_SCRIPT_ELEMENT__DOC_CONTENTS;

	/**
	 * The feature id for the '<em><b>Doc Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACT_ELEMENT__DOC_SECTIONS = TypescriptPackage.TYPE_SCRIPT_ELEMENT__DOC_SECTIONS;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACT_ELEMENT__MARKERS = TypescriptPackage.TYPE_SCRIPT_ELEMENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACT_ELEMENT__ICON = TypescriptPackage.TYPE_SCRIPT_ELEMENT__ICON;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACT_ELEMENT__URIS = TypescriptPackage.TYPE_SCRIPT_ELEMENT__URIS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACT_ELEMENT__NAME = TypescriptPackage.TYPE_SCRIPT_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACT_ELEMENT_FEATURE_COUNT = TypescriptPackage.TYPE_SCRIPT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACT_ELEMENT___COLLECT__OBJECT_EREFERENCE_ELIST = TypescriptPackage.TYPE_SCRIPT_ELEMENT___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACT_ELEMENT___GET_REFERRERS__EREFERENCE = TypescriptPackage.TYPE_SCRIPT_ELEMENT___GET_REFERRERS__EREFERENCE;

	/**
	 * The number of operations of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACT_ELEMENT_OPERATION_COUNT = TypescriptPackage.TYPE_SCRIPT_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.react.impl.TsxModuleImpl <em>Tsx Module</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.react.impl.TsxModuleImpl
	 * @see org.nasdanika.sdk.runtime.models.react.impl.ReactPackageImpl#getTsxModule()
	 * @generated
	 */
	int TSX_MODULE = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSX_MODULE__ID = TypescriptPackage.MODULE__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSX_MODULE__DOCUMENTATION = TypescriptPackage.MODULE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSX_MODULE__DOC_REF = TypescriptPackage.MODULE__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSX_MODULE__DOC_FORMAT = TypescriptPackage.MODULE__DOC_FORMAT;

	/**
	 * The feature id for the '<em><b>Doc Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSX_MODULE__DOC_CONTENTS = TypescriptPackage.MODULE__DOC_CONTENTS;

	/**
	 * The feature id for the '<em><b>Doc Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSX_MODULE__DOC_SECTIONS = TypescriptPackage.MODULE__DOC_SECTIONS;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSX_MODULE__MARKERS = TypescriptPackage.MODULE__MARKERS;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSX_MODULE__ICON = TypescriptPackage.MODULE__ICON;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSX_MODULE__URIS = TypescriptPackage.MODULE__URIS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSX_MODULE__NAME = TypescriptPackage.MODULE__NAME;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSX_MODULE__PATH = TypescriptPackage.MODULE__PATH;

	/**
	 * The feature id for the '<em><b>Declaration Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSX_MODULE__DECLARATION_ONLY = TypescriptPackage.MODULE__DECLARATION_ONLY;

	/**
	 * The feature id for the '<em><b>Header</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSX_MODULE__HEADER = TypescriptPackage.MODULE__HEADER;

	/**
	 * The feature id for the '<em><b>Imports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSX_MODULE__IMPORTS = TypescriptPackage.MODULE__IMPORTS;

	/**
	 * The feature id for the '<em><b>Declarations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSX_MODULE__DECLARATIONS = TypescriptPackage.MODULE__DECLARATIONS;

	/**
	 * The feature id for the '<em><b>Footer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSX_MODULE__FOOTER = TypescriptPackage.MODULE__FOOTER;

	/**
	 * The feature id for the '<em><b>Directive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSX_MODULE__DIRECTIVE = TypescriptPackage.MODULE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Tsx Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSX_MODULE_FEATURE_COUNT = TypescriptPackage.MODULE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSX_MODULE___COLLECT__OBJECT_EREFERENCE_ELIST = TypescriptPackage.MODULE___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSX_MODULE___GET_REFERRERS__EREFERENCE = TypescriptPackage.MODULE___GET_REFERRERS__EREFERENCE;

	/**
	 * The number of operations of the '<em>Tsx Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSX_MODULE_OPERATION_COUNT = TypescriptPackage.MODULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.react.impl.ComponentDeclarationImpl <em>Component Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.react.impl.ComponentDeclarationImpl
	 * @see org.nasdanika.sdk.runtime.models.react.impl.ReactPackageImpl#getComponentDeclaration()
	 * @generated
	 */
	int COMPONENT_DECLARATION = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_DECLARATION__ID = TypescriptPackage.FUNCTION_DECLARATION__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_DECLARATION__DOCUMENTATION = TypescriptPackage.FUNCTION_DECLARATION__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_DECLARATION__DOC_REF = TypescriptPackage.FUNCTION_DECLARATION__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_DECLARATION__DOC_FORMAT = TypescriptPackage.FUNCTION_DECLARATION__DOC_FORMAT;

	/**
	 * The feature id for the '<em><b>Doc Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_DECLARATION__DOC_CONTENTS = TypescriptPackage.FUNCTION_DECLARATION__DOC_CONTENTS;

	/**
	 * The feature id for the '<em><b>Doc Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_DECLARATION__DOC_SECTIONS = TypescriptPackage.FUNCTION_DECLARATION__DOC_SECTIONS;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_DECLARATION__MARKERS = TypescriptPackage.FUNCTION_DECLARATION__MARKERS;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_DECLARATION__ICON = TypescriptPackage.FUNCTION_DECLARATION__ICON;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_DECLARATION__URIS = TypescriptPackage.FUNCTION_DECLARATION__URIS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_DECLARATION__NAME = TypescriptPackage.FUNCTION_DECLARATION__NAME;

	/**
	 * The feature id for the '<em><b>Exported</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_DECLARATION__EXPORTED = TypescriptPackage.FUNCTION_DECLARATION__EXPORTED;

	/**
	 * The feature id for the '<em><b>Ambient</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_DECLARATION__AMBIENT = TypescriptPackage.FUNCTION_DECLARATION__AMBIENT;

	/**
	 * The feature id for the '<em><b>Type Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_DECLARATION__TYPE_PARAMETERS = TypescriptPackage.FUNCTION_DECLARATION__TYPE_PARAMETERS;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_DECLARATION__PARAMETERS = TypescriptPackage.FUNCTION_DECLARATION__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Return Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_DECLARATION__RETURN_TYPE = TypescriptPackage.FUNCTION_DECLARATION__RETURN_TYPE;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_DECLARATION__BODY = TypescriptPackage.FUNCTION_DECLARATION__BODY;

	/**
	 * The feature id for the '<em><b>Async</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_DECLARATION__ASYNC = TypescriptPackage.FUNCTION_DECLARATION__ASYNC;

	/**
	 * The feature id for the '<em><b>Generator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_DECLARATION__GENERATOR = TypescriptPackage.FUNCTION_DECLARATION__GENERATOR;

	/**
	 * The feature id for the '<em><b>Props Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_DECLARATION__PROPS_TYPE = TypescriptPackage.FUNCTION_DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Hooks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_DECLARATION__HOOKS = TypescriptPackage.FUNCTION_DECLARATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Render</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_DECLARATION__RENDER = TypescriptPackage.FUNCTION_DECLARATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Memo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_DECLARATION__MEMO = TypescriptPackage.FUNCTION_DECLARATION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Component Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_DECLARATION_FEATURE_COUNT = TypescriptPackage.FUNCTION_DECLARATION_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_DECLARATION___COLLECT__OBJECT_EREFERENCE_ELIST = TypescriptPackage.FUNCTION_DECLARATION___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_DECLARATION___GET_REFERRERS__EREFERENCE = TypescriptPackage.FUNCTION_DECLARATION___GET_REFERRERS__EREFERENCE;

	/**
	 * The number of operations of the '<em>Component Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_DECLARATION_OPERATION_COUNT = TypescriptPackage.FUNCTION_DECLARATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.react.impl.JsxBlockImpl <em>Jsx Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.react.impl.JsxBlockImpl
	 * @see org.nasdanika.sdk.runtime.models.react.impl.ReactPackageImpl#getJsxBlock()
	 * @generated
	 */
	int JSX_BLOCK = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSX_BLOCK__ID = TypescriptPackage.CODE_BLOCK__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSX_BLOCK__DOCUMENTATION = TypescriptPackage.CODE_BLOCK__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSX_BLOCK__DOC_REF = TypescriptPackage.CODE_BLOCK__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSX_BLOCK__DOC_FORMAT = TypescriptPackage.CODE_BLOCK__DOC_FORMAT;

	/**
	 * The feature id for the '<em><b>Doc Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSX_BLOCK__DOC_CONTENTS = TypescriptPackage.CODE_BLOCK__DOC_CONTENTS;

	/**
	 * The feature id for the '<em><b>Doc Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSX_BLOCK__DOC_SECTIONS = TypescriptPackage.CODE_BLOCK__DOC_SECTIONS;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSX_BLOCK__MARKERS = TypescriptPackage.CODE_BLOCK__MARKERS;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSX_BLOCK__ICON = TypescriptPackage.CODE_BLOCK__ICON;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSX_BLOCK__URIS = TypescriptPackage.CODE_BLOCK__URIS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSX_BLOCK__NAME = TypescriptPackage.CODE_BLOCK__NAME;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSX_BLOCK__TEXT = TypescriptPackage.CODE_BLOCK__TEXT;

	/**
	 * The feature id for the '<em><b>References</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSX_BLOCK__REFERENCES = TypescriptPackage.CODE_BLOCK__REFERENCES;

	/**
	 * The feature id for the '<em><b>Root</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSX_BLOCK__ROOT = TypescriptPackage.CODE_BLOCK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Jsx Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSX_BLOCK_FEATURE_COUNT = TypescriptPackage.CODE_BLOCK_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSX_BLOCK___COLLECT__OBJECT_EREFERENCE_ELIST = TypescriptPackage.CODE_BLOCK___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSX_BLOCK___GET_REFERRERS__EREFERENCE = TypescriptPackage.CODE_BLOCK___GET_REFERRERS__EREFERENCE;

	/**
	 * The number of operations of the '<em>Jsx Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSX_BLOCK_OPERATION_COUNT = TypescriptPackage.CODE_BLOCK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.react.impl.HookImpl <em>Hook</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.react.impl.HookImpl
	 * @see org.nasdanika.sdk.runtime.models.react.impl.ReactPackageImpl#getHook()
	 * @generated
	 */
	int HOOK = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOOK__ID = REACT_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOOK__DOCUMENTATION = REACT_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOOK__DOC_REF = REACT_ELEMENT__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOOK__DOC_FORMAT = REACT_ELEMENT__DOC_FORMAT;

	/**
	 * The feature id for the '<em><b>Doc Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOOK__DOC_CONTENTS = REACT_ELEMENT__DOC_CONTENTS;

	/**
	 * The feature id for the '<em><b>Doc Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOOK__DOC_SECTIONS = REACT_ELEMENT__DOC_SECTIONS;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOOK__MARKERS = REACT_ELEMENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOOK__ICON = REACT_ELEMENT__ICON;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOOK__URIS = REACT_ELEMENT__URIS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOOK__NAME = REACT_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Bindings</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOOK__BINDINGS = REACT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Hook</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOOK_FEATURE_COUNT = REACT_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOOK___COLLECT__OBJECT_EREFERENCE_ELIST = REACT_ELEMENT___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOOK___GET_REFERRERS__EREFERENCE = REACT_ELEMENT___GET_REFERRERS__EREFERENCE;

	/**
	 * The number of operations of the '<em>Hook</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOOK_OPERATION_COUNT = REACT_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.react.impl.StateHookImpl <em>State Hook</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.react.impl.StateHookImpl
	 * @see org.nasdanika.sdk.runtime.models.react.impl.ReactPackageImpl#getStateHook()
	 * @generated
	 */
	int STATE_HOOK = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_HOOK__ID = HOOK__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_HOOK__DOCUMENTATION = HOOK__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_HOOK__DOC_REF = HOOK__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_HOOK__DOC_FORMAT = HOOK__DOC_FORMAT;

	/**
	 * The feature id for the '<em><b>Doc Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_HOOK__DOC_CONTENTS = HOOK__DOC_CONTENTS;

	/**
	 * The feature id for the '<em><b>Doc Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_HOOK__DOC_SECTIONS = HOOK__DOC_SECTIONS;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_HOOK__MARKERS = HOOK__MARKERS;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_HOOK__ICON = HOOK__ICON;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_HOOK__URIS = HOOK__URIS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_HOOK__NAME = HOOK__NAME;

	/**
	 * The feature id for the '<em><b>Bindings</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_HOOK__BINDINGS = HOOK__BINDINGS;

	/**
	 * The feature id for the '<em><b>State Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_HOOK__STATE_TYPE = HOOK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Initial Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_HOOK__INITIAL_VALUE = HOOK_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>State Hook</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_HOOK_FEATURE_COUNT = HOOK_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_HOOK___COLLECT__OBJECT_EREFERENCE_ELIST = HOOK___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_HOOK___GET_REFERRERS__EREFERENCE = HOOK___GET_REFERRERS__EREFERENCE;

	/**
	 * The number of operations of the '<em>State Hook</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_HOOK_OPERATION_COUNT = HOOK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.react.impl.EffectHookImpl <em>Effect Hook</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.react.impl.EffectHookImpl
	 * @see org.nasdanika.sdk.runtime.models.react.impl.ReactPackageImpl#getEffectHook()
	 * @generated
	 */
	int EFFECT_HOOK = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFFECT_HOOK__ID = HOOK__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFFECT_HOOK__DOCUMENTATION = HOOK__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFFECT_HOOK__DOC_REF = HOOK__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFFECT_HOOK__DOC_FORMAT = HOOK__DOC_FORMAT;

	/**
	 * The feature id for the '<em><b>Doc Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFFECT_HOOK__DOC_CONTENTS = HOOK__DOC_CONTENTS;

	/**
	 * The feature id for the '<em><b>Doc Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFFECT_HOOK__DOC_SECTIONS = HOOK__DOC_SECTIONS;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFFECT_HOOK__MARKERS = HOOK__MARKERS;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFFECT_HOOK__ICON = HOOK__ICON;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFFECT_HOOK__URIS = HOOK__URIS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFFECT_HOOK__NAME = HOOK__NAME;

	/**
	 * The feature id for the '<em><b>Bindings</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFFECT_HOOK__BINDINGS = HOOK__BINDINGS;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFFECT_HOOK__BODY = HOOK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Dependencies</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFFECT_HOOK__DEPENDENCIES = HOOK_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Layout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFFECT_HOOK__LAYOUT = HOOK_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Cleanup</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFFECT_HOOK__CLEANUP = HOOK_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Effect Hook</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFFECT_HOOK_FEATURE_COUNT = HOOK_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFFECT_HOOK___COLLECT__OBJECT_EREFERENCE_ELIST = HOOK___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFFECT_HOOK___GET_REFERRERS__EREFERENCE = HOOK___GET_REFERRERS__EREFERENCE;

	/**
	 * The number of operations of the '<em>Effect Hook</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFFECT_HOOK_OPERATION_COUNT = HOOK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.react.impl.MemoHookImpl <em>Memo Hook</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.react.impl.MemoHookImpl
	 * @see org.nasdanika.sdk.runtime.models.react.impl.ReactPackageImpl#getMemoHook()
	 * @generated
	 */
	int MEMO_HOOK = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMO_HOOK__ID = HOOK__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMO_HOOK__DOCUMENTATION = HOOK__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMO_HOOK__DOC_REF = HOOK__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMO_HOOK__DOC_FORMAT = HOOK__DOC_FORMAT;

	/**
	 * The feature id for the '<em><b>Doc Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMO_HOOK__DOC_CONTENTS = HOOK__DOC_CONTENTS;

	/**
	 * The feature id for the '<em><b>Doc Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMO_HOOK__DOC_SECTIONS = HOOK__DOC_SECTIONS;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMO_HOOK__MARKERS = HOOK__MARKERS;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMO_HOOK__ICON = HOOK__ICON;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMO_HOOK__URIS = HOOK__URIS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMO_HOOK__NAME = HOOK__NAME;

	/**
	 * The feature id for the '<em><b>Bindings</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMO_HOOK__BINDINGS = HOOK__BINDINGS;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMO_HOOK__EXPRESSION = HOOK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Dependencies</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMO_HOOK__DEPENDENCIES = HOOK_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Callback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMO_HOOK__CALLBACK = HOOK_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Memo Hook</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMO_HOOK_FEATURE_COUNT = HOOK_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMO_HOOK___COLLECT__OBJECT_EREFERENCE_ELIST = HOOK___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMO_HOOK___GET_REFERRERS__EREFERENCE = HOOK___GET_REFERRERS__EREFERENCE;

	/**
	 * The number of operations of the '<em>Memo Hook</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMO_HOOK_OPERATION_COUNT = HOOK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.react.impl.ContextHookImpl <em>Context Hook</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.react.impl.ContextHookImpl
	 * @see org.nasdanika.sdk.runtime.models.react.impl.ReactPackageImpl#getContextHook()
	 * @generated
	 */
	int CONTEXT_HOOK = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_HOOK__ID = HOOK__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_HOOK__DOCUMENTATION = HOOK__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_HOOK__DOC_REF = HOOK__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_HOOK__DOC_FORMAT = HOOK__DOC_FORMAT;

	/**
	 * The feature id for the '<em><b>Doc Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_HOOK__DOC_CONTENTS = HOOK__DOC_CONTENTS;

	/**
	 * The feature id for the '<em><b>Doc Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_HOOK__DOC_SECTIONS = HOOK__DOC_SECTIONS;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_HOOK__MARKERS = HOOK__MARKERS;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_HOOK__ICON = HOOK__ICON;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_HOOK__URIS = HOOK__URIS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_HOOK__NAME = HOOK__NAME;

	/**
	 * The feature id for the '<em><b>Bindings</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_HOOK__BINDINGS = HOOK__BINDINGS;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_HOOK__CONTEXT = HOOK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Context Hook</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_HOOK_FEATURE_COUNT = HOOK_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_HOOK___COLLECT__OBJECT_EREFERENCE_ELIST = HOOK___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_HOOK___GET_REFERRERS__EREFERENCE = HOOK___GET_REFERRERS__EREFERENCE;

	/**
	 * The number of operations of the '<em>Context Hook</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_HOOK_OPERATION_COUNT = HOOK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.react.impl.RefHookImpl <em>Ref Hook</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.react.impl.RefHookImpl
	 * @see org.nasdanika.sdk.runtime.models.react.impl.ReactPackageImpl#getRefHook()
	 * @generated
	 */
	int REF_HOOK = 9;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_HOOK__ID = HOOK__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_HOOK__DOCUMENTATION = HOOK__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_HOOK__DOC_REF = HOOK__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_HOOK__DOC_FORMAT = HOOK__DOC_FORMAT;

	/**
	 * The feature id for the '<em><b>Doc Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_HOOK__DOC_CONTENTS = HOOK__DOC_CONTENTS;

	/**
	 * The feature id for the '<em><b>Doc Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_HOOK__DOC_SECTIONS = HOOK__DOC_SECTIONS;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_HOOK__MARKERS = HOOK__MARKERS;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_HOOK__ICON = HOOK__ICON;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_HOOK__URIS = HOOK__URIS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_HOOK__NAME = HOOK__NAME;

	/**
	 * The feature id for the '<em><b>Bindings</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_HOOK__BINDINGS = HOOK__BINDINGS;

	/**
	 * The feature id for the '<em><b>Ref Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_HOOK__REF_TYPE = HOOK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Initial Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_HOOK__INITIAL_VALUE = HOOK_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Ref Hook</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_HOOK_FEATURE_COUNT = HOOK_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_HOOK___COLLECT__OBJECT_EREFERENCE_ELIST = HOOK___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_HOOK___GET_REFERRERS__EREFERENCE = HOOK___GET_REFERRERS__EREFERENCE;

	/**
	 * The number of operations of the '<em>Ref Hook</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_HOOK_OPERATION_COUNT = HOOK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.react.impl.OpaqueHookImpl <em>Opaque Hook</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.react.impl.OpaqueHookImpl
	 * @see org.nasdanika.sdk.runtime.models.react.impl.ReactPackageImpl#getOpaqueHook()
	 * @generated
	 */
	int OPAQUE_HOOK = 10;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_HOOK__ID = HOOK__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_HOOK__DOCUMENTATION = HOOK__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_HOOK__DOC_REF = HOOK__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_HOOK__DOC_FORMAT = HOOK__DOC_FORMAT;

	/**
	 * The feature id for the '<em><b>Doc Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_HOOK__DOC_CONTENTS = HOOK__DOC_CONTENTS;

	/**
	 * The feature id for the '<em><b>Doc Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_HOOK__DOC_SECTIONS = HOOK__DOC_SECTIONS;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_HOOK__MARKERS = HOOK__MARKERS;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_HOOK__ICON = HOOK__ICON;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_HOOK__URIS = HOOK__URIS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_HOOK__NAME = HOOK__NAME;

	/**
	 * The feature id for the '<em><b>Bindings</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_HOOK__BINDINGS = HOOK__BINDINGS;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_HOOK__TEXT = HOOK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>References</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_HOOK__REFERENCES = HOOK_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Opaque Hook</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_HOOK_FEATURE_COUNT = HOOK_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_HOOK___COLLECT__OBJECT_EREFERENCE_ELIST = HOOK___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_HOOK___GET_REFERRERS__EREFERENCE = HOOK___GET_REFERRERS__EREFERENCE;

	/**
	 * The number of operations of the '<em>Opaque Hook</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_HOOK_OPERATION_COUNT = HOOK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.react.impl.ContextDeclarationImpl <em>Context Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.react.impl.ContextDeclarationImpl
	 * @see org.nasdanika.sdk.runtime.models.react.impl.ReactPackageImpl#getContextDeclaration()
	 * @generated
	 */
	int CONTEXT_DECLARATION = 11;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_DECLARATION__ID = TypescriptPackage.DECLARATION__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_DECLARATION__DOCUMENTATION = TypescriptPackage.DECLARATION__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_DECLARATION__DOC_REF = TypescriptPackage.DECLARATION__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_DECLARATION__DOC_FORMAT = TypescriptPackage.DECLARATION__DOC_FORMAT;

	/**
	 * The feature id for the '<em><b>Doc Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_DECLARATION__DOC_CONTENTS = TypescriptPackage.DECLARATION__DOC_CONTENTS;

	/**
	 * The feature id for the '<em><b>Doc Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_DECLARATION__DOC_SECTIONS = TypescriptPackage.DECLARATION__DOC_SECTIONS;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_DECLARATION__MARKERS = TypescriptPackage.DECLARATION__MARKERS;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_DECLARATION__ICON = TypescriptPackage.DECLARATION__ICON;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_DECLARATION__URIS = TypescriptPackage.DECLARATION__URIS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_DECLARATION__NAME = TypescriptPackage.DECLARATION__NAME;

	/**
	 * The feature id for the '<em><b>Exported</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_DECLARATION__EXPORTED = TypescriptPackage.DECLARATION__EXPORTED;

	/**
	 * The feature id for the '<em><b>Ambient</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_DECLARATION__AMBIENT = TypescriptPackage.DECLARATION__AMBIENT;

	/**
	 * The feature id for the '<em><b>Value Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_DECLARATION__VALUE_TYPE = TypescriptPackage.DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_DECLARATION__DEFAULT_VALUE = TypescriptPackage.DECLARATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Context Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_DECLARATION_FEATURE_COUNT = TypescriptPackage.DECLARATION_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_DECLARATION___COLLECT__OBJECT_EREFERENCE_ELIST = TypescriptPackage.DECLARATION___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_DECLARATION___GET_REFERRERS__EREFERENCE = TypescriptPackage.DECLARATION___GET_REFERRERS__EREFERENCE;

	/**
	 * The number of operations of the '<em>Context Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_DECLARATION_OPERATION_COUNT = TypescriptPackage.DECLARATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.react.impl.JsxNodeImpl <em>Jsx Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.react.impl.JsxNodeImpl
	 * @see org.nasdanika.sdk.runtime.models.react.impl.ReactPackageImpl#getJsxNode()
	 * @generated
	 */
	int JSX_NODE = 12;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSX_NODE__ID = REACT_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSX_NODE__DOCUMENTATION = REACT_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSX_NODE__DOC_REF = REACT_ELEMENT__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSX_NODE__DOC_FORMAT = REACT_ELEMENT__DOC_FORMAT;

	/**
	 * The feature id for the '<em><b>Doc Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSX_NODE__DOC_CONTENTS = REACT_ELEMENT__DOC_CONTENTS;

	/**
	 * The feature id for the '<em><b>Doc Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSX_NODE__DOC_SECTIONS = REACT_ELEMENT__DOC_SECTIONS;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSX_NODE__MARKERS = REACT_ELEMENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSX_NODE__ICON = REACT_ELEMENT__ICON;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSX_NODE__URIS = REACT_ELEMENT__URIS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSX_NODE__NAME = REACT_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Jsx Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSX_NODE_FEATURE_COUNT = REACT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSX_NODE___COLLECT__OBJECT_EREFERENCE_ELIST = REACT_ELEMENT___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSX_NODE___GET_REFERRERS__EREFERENCE = REACT_ELEMENT___GET_REFERRERS__EREFERENCE;

	/**
	 * The number of operations of the '<em>Jsx Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSX_NODE_OPERATION_COUNT = REACT_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.react.impl.JsxContainerImpl <em>Jsx Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.react.impl.JsxContainerImpl
	 * @see org.nasdanika.sdk.runtime.models.react.impl.ReactPackageImpl#getJsxContainer()
	 * @generated
	 */
	int JSX_CONTAINER = 13;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSX_CONTAINER__ID = JSX_NODE__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSX_CONTAINER__DOCUMENTATION = JSX_NODE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSX_CONTAINER__DOC_REF = JSX_NODE__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSX_CONTAINER__DOC_FORMAT = JSX_NODE__DOC_FORMAT;

	/**
	 * The feature id for the '<em><b>Doc Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSX_CONTAINER__DOC_CONTENTS = JSX_NODE__DOC_CONTENTS;

	/**
	 * The feature id for the '<em><b>Doc Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSX_CONTAINER__DOC_SECTIONS = JSX_NODE__DOC_SECTIONS;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSX_CONTAINER__MARKERS = JSX_NODE__MARKERS;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSX_CONTAINER__ICON = JSX_NODE__ICON;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSX_CONTAINER__URIS = JSX_NODE__URIS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSX_CONTAINER__NAME = JSX_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSX_CONTAINER__CHILDREN = JSX_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Jsx Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSX_CONTAINER_FEATURE_COUNT = JSX_NODE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSX_CONTAINER___COLLECT__OBJECT_EREFERENCE_ELIST = JSX_NODE___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSX_CONTAINER___GET_REFERRERS__EREFERENCE = JSX_NODE___GET_REFERRERS__EREFERENCE;

	/**
	 * The number of operations of the '<em>Jsx Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSX_CONTAINER_OPERATION_COUNT = JSX_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.react.impl.JsxElementImpl <em>Jsx Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.react.impl.JsxElementImpl
	 * @see org.nasdanika.sdk.runtime.models.react.impl.ReactPackageImpl#getJsxElement()
	 * @generated
	 */
	int JSX_ELEMENT = 14;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSX_ELEMENT__ID = JSX_CONTAINER__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSX_ELEMENT__DOCUMENTATION = JSX_CONTAINER__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSX_ELEMENT__DOC_REF = JSX_CONTAINER__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSX_ELEMENT__DOC_FORMAT = JSX_CONTAINER__DOC_FORMAT;

	/**
	 * The feature id for the '<em><b>Doc Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSX_ELEMENT__DOC_CONTENTS = JSX_CONTAINER__DOC_CONTENTS;

	/**
	 * The feature id for the '<em><b>Doc Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSX_ELEMENT__DOC_SECTIONS = JSX_CONTAINER__DOC_SECTIONS;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSX_ELEMENT__MARKERS = JSX_CONTAINER__MARKERS;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSX_ELEMENT__ICON = JSX_CONTAINER__ICON;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSX_ELEMENT__URIS = JSX_CONTAINER__URIS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSX_ELEMENT__NAME = JSX_CONTAINER__NAME;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSX_ELEMENT__CHILDREN = JSX_CONTAINER__CHILDREN;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSX_ELEMENT__TAG = JSX_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Component Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSX_ELEMENT__COMPONENT_TYPE = JSX_CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSX_ELEMENT__ATTRIBUTES = JSX_CONTAINER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Jsx Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSX_ELEMENT_FEATURE_COUNT = JSX_CONTAINER_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSX_ELEMENT___COLLECT__OBJECT_EREFERENCE_ELIST = JSX_CONTAINER___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSX_ELEMENT___GET_REFERRERS__EREFERENCE = JSX_CONTAINER___GET_REFERRERS__EREFERENCE;

	/**
	 * The number of operations of the '<em>Jsx Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSX_ELEMENT_OPERATION_COUNT = JSX_CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.react.impl.JsxFragmentImpl <em>Jsx Fragment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.react.impl.JsxFragmentImpl
	 * @see org.nasdanika.sdk.runtime.models.react.impl.ReactPackageImpl#getJsxFragment()
	 * @generated
	 */
	int JSX_FRAGMENT = 15;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSX_FRAGMENT__ID = JSX_CONTAINER__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSX_FRAGMENT__DOCUMENTATION = JSX_CONTAINER__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSX_FRAGMENT__DOC_REF = JSX_CONTAINER__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSX_FRAGMENT__DOC_FORMAT = JSX_CONTAINER__DOC_FORMAT;

	/**
	 * The feature id for the '<em><b>Doc Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSX_FRAGMENT__DOC_CONTENTS = JSX_CONTAINER__DOC_CONTENTS;

	/**
	 * The feature id for the '<em><b>Doc Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSX_FRAGMENT__DOC_SECTIONS = JSX_CONTAINER__DOC_SECTIONS;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSX_FRAGMENT__MARKERS = JSX_CONTAINER__MARKERS;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSX_FRAGMENT__ICON = JSX_CONTAINER__ICON;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSX_FRAGMENT__URIS = JSX_CONTAINER__URIS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSX_FRAGMENT__NAME = JSX_CONTAINER__NAME;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSX_FRAGMENT__CHILDREN = JSX_CONTAINER__CHILDREN;

	/**
	 * The number of structural features of the '<em>Jsx Fragment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSX_FRAGMENT_FEATURE_COUNT = JSX_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSX_FRAGMENT___COLLECT__OBJECT_EREFERENCE_ELIST = JSX_CONTAINER___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSX_FRAGMENT___GET_REFERRERS__EREFERENCE = JSX_CONTAINER___GET_REFERRERS__EREFERENCE;

	/**
	 * The number of operations of the '<em>Jsx Fragment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSX_FRAGMENT_OPERATION_COUNT = JSX_CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.react.impl.JsxTextImpl <em>Jsx Text</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.react.impl.JsxTextImpl
	 * @see org.nasdanika.sdk.runtime.models.react.impl.ReactPackageImpl#getJsxText()
	 * @generated
	 */
	int JSX_TEXT = 16;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSX_TEXT__ID = JSX_NODE__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSX_TEXT__DOCUMENTATION = JSX_NODE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSX_TEXT__DOC_REF = JSX_NODE__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSX_TEXT__DOC_FORMAT = JSX_NODE__DOC_FORMAT;

	/**
	 * The feature id for the '<em><b>Doc Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSX_TEXT__DOC_CONTENTS = JSX_NODE__DOC_CONTENTS;

	/**
	 * The feature id for the '<em><b>Doc Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSX_TEXT__DOC_SECTIONS = JSX_NODE__DOC_SECTIONS;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSX_TEXT__MARKERS = JSX_NODE__MARKERS;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSX_TEXT__ICON = JSX_NODE__ICON;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSX_TEXT__URIS = JSX_NODE__URIS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSX_TEXT__NAME = JSX_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSX_TEXT__TEXT = JSX_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Jsx Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSX_TEXT_FEATURE_COUNT = JSX_NODE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSX_TEXT___COLLECT__OBJECT_EREFERENCE_ELIST = JSX_NODE___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSX_TEXT___GET_REFERRERS__EREFERENCE = JSX_NODE___GET_REFERRERS__EREFERENCE;

	/**
	 * The number of operations of the '<em>Jsx Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSX_TEXT_OPERATION_COUNT = JSX_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.react.impl.JsxExpressionImpl <em>Jsx Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.react.impl.JsxExpressionImpl
	 * @see org.nasdanika.sdk.runtime.models.react.impl.ReactPackageImpl#getJsxExpression()
	 * @generated
	 */
	int JSX_EXPRESSION = 17;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSX_EXPRESSION__ID = JSX_NODE__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSX_EXPRESSION__DOCUMENTATION = JSX_NODE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSX_EXPRESSION__DOC_REF = JSX_NODE__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSX_EXPRESSION__DOC_FORMAT = JSX_NODE__DOC_FORMAT;

	/**
	 * The feature id for the '<em><b>Doc Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSX_EXPRESSION__DOC_CONTENTS = JSX_NODE__DOC_CONTENTS;

	/**
	 * The feature id for the '<em><b>Doc Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSX_EXPRESSION__DOC_SECTIONS = JSX_NODE__DOC_SECTIONS;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSX_EXPRESSION__MARKERS = JSX_NODE__MARKERS;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSX_EXPRESSION__ICON = JSX_NODE__ICON;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSX_EXPRESSION__URIS = JSX_NODE__URIS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSX_EXPRESSION__NAME = JSX_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSX_EXPRESSION__EXPRESSION = JSX_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Jsx Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSX_EXPRESSION_FEATURE_COUNT = JSX_NODE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSX_EXPRESSION___COLLECT__OBJECT_EREFERENCE_ELIST = JSX_NODE___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSX_EXPRESSION___GET_REFERRERS__EREFERENCE = JSX_NODE___GET_REFERRERS__EREFERENCE;

	/**
	 * The number of operations of the '<em>Jsx Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSX_EXPRESSION_OPERATION_COUNT = JSX_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.react.impl.JsxConditionalImpl <em>Jsx Conditional</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.react.impl.JsxConditionalImpl
	 * @see org.nasdanika.sdk.runtime.models.react.impl.ReactPackageImpl#getJsxConditional()
	 * @generated
	 */
	int JSX_CONDITIONAL = 18;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSX_CONDITIONAL__ID = JSX_NODE__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSX_CONDITIONAL__DOCUMENTATION = JSX_NODE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSX_CONDITIONAL__DOC_REF = JSX_NODE__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSX_CONDITIONAL__DOC_FORMAT = JSX_NODE__DOC_FORMAT;

	/**
	 * The feature id for the '<em><b>Doc Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSX_CONDITIONAL__DOC_CONTENTS = JSX_NODE__DOC_CONTENTS;

	/**
	 * The feature id for the '<em><b>Doc Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSX_CONDITIONAL__DOC_SECTIONS = JSX_NODE__DOC_SECTIONS;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSX_CONDITIONAL__MARKERS = JSX_NODE__MARKERS;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSX_CONDITIONAL__ICON = JSX_NODE__ICON;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSX_CONDITIONAL__URIS = JSX_NODE__URIS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSX_CONDITIONAL__NAME = JSX_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSX_CONDITIONAL__CONDITION = JSX_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Then</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSX_CONDITIONAL__THEN = JSX_NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Otherwise</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSX_CONDITIONAL__OTHERWISE = JSX_NODE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Jsx Conditional</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSX_CONDITIONAL_FEATURE_COUNT = JSX_NODE_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSX_CONDITIONAL___COLLECT__OBJECT_EREFERENCE_ELIST = JSX_NODE___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSX_CONDITIONAL___GET_REFERRERS__EREFERENCE = JSX_NODE___GET_REFERRERS__EREFERENCE;

	/**
	 * The number of operations of the '<em>Jsx Conditional</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSX_CONDITIONAL_OPERATION_COUNT = JSX_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.react.impl.JsxIteratorImpl <em>Jsx Iterator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.react.impl.JsxIteratorImpl
	 * @see org.nasdanika.sdk.runtime.models.react.impl.ReactPackageImpl#getJsxIterator()
	 * @generated
	 */
	int JSX_ITERATOR = 19;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSX_ITERATOR__ID = JSX_NODE__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSX_ITERATOR__DOCUMENTATION = JSX_NODE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSX_ITERATOR__DOC_REF = JSX_NODE__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSX_ITERATOR__DOC_FORMAT = JSX_NODE__DOC_FORMAT;

	/**
	 * The feature id for the '<em><b>Doc Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSX_ITERATOR__DOC_CONTENTS = JSX_NODE__DOC_CONTENTS;

	/**
	 * The feature id for the '<em><b>Doc Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSX_ITERATOR__DOC_SECTIONS = JSX_NODE__DOC_SECTIONS;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSX_ITERATOR__MARKERS = JSX_NODE__MARKERS;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSX_ITERATOR__ICON = JSX_NODE__ICON;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSX_ITERATOR__URIS = JSX_NODE__URIS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSX_ITERATOR__NAME = JSX_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Items</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSX_ITERATOR__ITEMS = JSX_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSX_ITERATOR__VARIABLE = JSX_NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSX_ITERATOR__KEY = JSX_NODE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Template</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSX_ITERATOR__TEMPLATE = JSX_NODE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Jsx Iterator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSX_ITERATOR_FEATURE_COUNT = JSX_NODE_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSX_ITERATOR___COLLECT__OBJECT_EREFERENCE_ELIST = JSX_NODE___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSX_ITERATOR___GET_REFERRERS__EREFERENCE = JSX_NODE___GET_REFERRERS__EREFERENCE;

	/**
	 * The number of operations of the '<em>Jsx Iterator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSX_ITERATOR_OPERATION_COUNT = JSX_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.react.impl.ContextProviderImpl <em>Context Provider</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.react.impl.ContextProviderImpl
	 * @see org.nasdanika.sdk.runtime.models.react.impl.ReactPackageImpl#getContextProvider()
	 * @generated
	 */
	int CONTEXT_PROVIDER = 20;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_PROVIDER__ID = JSX_CONTAINER__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_PROVIDER__DOCUMENTATION = JSX_CONTAINER__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_PROVIDER__DOC_REF = JSX_CONTAINER__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_PROVIDER__DOC_FORMAT = JSX_CONTAINER__DOC_FORMAT;

	/**
	 * The feature id for the '<em><b>Doc Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_PROVIDER__DOC_CONTENTS = JSX_CONTAINER__DOC_CONTENTS;

	/**
	 * The feature id for the '<em><b>Doc Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_PROVIDER__DOC_SECTIONS = JSX_CONTAINER__DOC_SECTIONS;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_PROVIDER__MARKERS = JSX_CONTAINER__MARKERS;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_PROVIDER__ICON = JSX_CONTAINER__ICON;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_PROVIDER__URIS = JSX_CONTAINER__URIS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_PROVIDER__NAME = JSX_CONTAINER__NAME;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_PROVIDER__CHILDREN = JSX_CONTAINER__CHILDREN;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_PROVIDER__CONTEXT = JSX_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_PROVIDER__VALUE = JSX_CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Context Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_PROVIDER_FEATURE_COUNT = JSX_CONTAINER_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_PROVIDER___COLLECT__OBJECT_EREFERENCE_ELIST = JSX_CONTAINER___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_PROVIDER___GET_REFERRERS__EREFERENCE = JSX_CONTAINER___GET_REFERRERS__EREFERENCE;

	/**
	 * The number of operations of the '<em>Context Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_PROVIDER_OPERATION_COUNT = JSX_CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.react.impl.OpaqueJsxImpl <em>Opaque Jsx</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.react.impl.OpaqueJsxImpl
	 * @see org.nasdanika.sdk.runtime.models.react.impl.ReactPackageImpl#getOpaqueJsx()
	 * @generated
	 */
	int OPAQUE_JSX = 21;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_JSX__ID = JSX_NODE__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_JSX__DOCUMENTATION = JSX_NODE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_JSX__DOC_REF = JSX_NODE__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_JSX__DOC_FORMAT = JSX_NODE__DOC_FORMAT;

	/**
	 * The feature id for the '<em><b>Doc Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_JSX__DOC_CONTENTS = JSX_NODE__DOC_CONTENTS;

	/**
	 * The feature id for the '<em><b>Doc Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_JSX__DOC_SECTIONS = JSX_NODE__DOC_SECTIONS;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_JSX__MARKERS = JSX_NODE__MARKERS;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_JSX__ICON = JSX_NODE__ICON;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_JSX__URIS = JSX_NODE__URIS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_JSX__NAME = JSX_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_JSX__TEXT = JSX_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>References</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_JSX__REFERENCES = JSX_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Opaque Jsx</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_JSX_FEATURE_COUNT = JSX_NODE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_JSX___COLLECT__OBJECT_EREFERENCE_ELIST = JSX_NODE___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_JSX___GET_REFERRERS__EREFERENCE = JSX_NODE___GET_REFERRERS__EREFERENCE;

	/**
	 * The number of operations of the '<em>Opaque Jsx</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_JSX_OPERATION_COUNT = JSX_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.react.impl.IntrinsicImpl <em>Intrinsic</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.react.impl.IntrinsicImpl
	 * @see org.nasdanika.sdk.runtime.models.react.impl.ReactPackageImpl#getIntrinsic()
	 * @generated
	 */
	int INTRINSIC = 22;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTRINSIC__ID = JSX_CONTAINER__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTRINSIC__DOCUMENTATION = JSX_CONTAINER__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTRINSIC__DOC_REF = JSX_CONTAINER__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTRINSIC__DOC_FORMAT = JSX_CONTAINER__DOC_FORMAT;

	/**
	 * The feature id for the '<em><b>Doc Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTRINSIC__DOC_CONTENTS = JSX_CONTAINER__DOC_CONTENTS;

	/**
	 * The feature id for the '<em><b>Doc Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTRINSIC__DOC_SECTIONS = JSX_CONTAINER__DOC_SECTIONS;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTRINSIC__MARKERS = JSX_CONTAINER__MARKERS;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTRINSIC__ICON = JSX_CONTAINER__ICON;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTRINSIC__URIS = JSX_CONTAINER__URIS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTRINSIC__NAME = JSX_CONTAINER__NAME;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTRINSIC__CHILDREN = JSX_CONTAINER__CHILDREN;

	/**
	 * The feature id for the '<em><b>Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTRINSIC__ELEMENT = JSX_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTRINSIC__ATTRIBUTES = JSX_CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Intrinsic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTRINSIC_FEATURE_COUNT = JSX_CONTAINER_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTRINSIC___COLLECT__OBJECT_EREFERENCE_ELIST = JSX_CONTAINER___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTRINSIC___GET_REFERRERS__EREFERENCE = JSX_CONTAINER___GET_REFERRERS__EREFERENCE;

	/**
	 * The number of operations of the '<em>Intrinsic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTRINSIC_OPERATION_COUNT = JSX_CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.react.impl.JsxContentImpl <em>Jsx Content</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.react.impl.JsxContentImpl
	 * @see org.nasdanika.sdk.runtime.models.react.impl.ReactPackageImpl#getJsxContent()
	 * @generated
	 */
	int JSX_CONTENT = 23;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSX_CONTENT__MARKERS = HtmlPackage.NODE__MARKERS;

	/**
	 * The feature id for the '<em><b>Node</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSX_CONTENT__NODE = HtmlPackage.NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Jsx Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSX_CONTENT_FEATURE_COUNT = HtmlPackage.NODE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Jsx Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSX_CONTENT_OPERATION_COUNT = HtmlPackage.NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.react.impl.LibraryComponentImpl <em>Library Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.react.impl.LibraryComponentImpl
	 * @see org.nasdanika.sdk.runtime.models.react.impl.ReactPackageImpl#getLibraryComponent()
	 * @generated
	 */
	int LIBRARY_COMPONENT = 24;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY_COMPONENT__ID = JSX_CONTAINER__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY_COMPONENT__DOCUMENTATION = JSX_CONTAINER__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY_COMPONENT__DOC_REF = JSX_CONTAINER__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY_COMPONENT__DOC_FORMAT = JSX_CONTAINER__DOC_FORMAT;

	/**
	 * The feature id for the '<em><b>Doc Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY_COMPONENT__DOC_CONTENTS = JSX_CONTAINER__DOC_CONTENTS;

	/**
	 * The feature id for the '<em><b>Doc Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY_COMPONENT__DOC_SECTIONS = JSX_CONTAINER__DOC_SECTIONS;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY_COMPONENT__MARKERS = JSX_CONTAINER__MARKERS;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY_COMPONENT__ICON = JSX_CONTAINER__ICON;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY_COMPONENT__URIS = JSX_CONTAINER__URIS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY_COMPONENT__NAME = JSX_CONTAINER__NAME;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY_COMPONENT__CHILDREN = JSX_CONTAINER__CHILDREN;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY_COMPONENT__ATTRIBUTES = JSX_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Library Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY_COMPONENT_FEATURE_COUNT = JSX_CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY_COMPONENT___COLLECT__OBJECT_EREFERENCE_ELIST = JSX_CONTAINER___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY_COMPONENT___GET_REFERRERS__EREFERENCE = JSX_CONTAINER___GET_REFERRERS__EREFERENCE;

	/**
	 * The number of operations of the '<em>Library Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY_COMPONENT_OPERATION_COUNT = JSX_CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.react.impl.LibraryHookImpl <em>Library Hook</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.react.impl.LibraryHookImpl
	 * @see org.nasdanika.sdk.runtime.models.react.impl.ReactPackageImpl#getLibraryHook()
	 * @generated
	 */
	int LIBRARY_HOOK = 25;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY_HOOK__ID = HOOK__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY_HOOK__DOCUMENTATION = HOOK__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY_HOOK__DOC_REF = HOOK__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY_HOOK__DOC_FORMAT = HOOK__DOC_FORMAT;

	/**
	 * The feature id for the '<em><b>Doc Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY_HOOK__DOC_CONTENTS = HOOK__DOC_CONTENTS;

	/**
	 * The feature id for the '<em><b>Doc Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY_HOOK__DOC_SECTIONS = HOOK__DOC_SECTIONS;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY_HOOK__MARKERS = HOOK__MARKERS;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY_HOOK__ICON = HOOK__ICON;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY_HOOK__URIS = HOOK__URIS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY_HOOK__NAME = HOOK__NAME;

	/**
	 * The feature id for the '<em><b>Bindings</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY_HOOK__BINDINGS = HOOK__BINDINGS;

	/**
	 * The number of structural features of the '<em>Library Hook</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY_HOOK_FEATURE_COUNT = HOOK_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY_HOOK___COLLECT__OBJECT_EREFERENCE_ELIST = HOOK___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY_HOOK___GET_REFERRERS__EREFERENCE = HOOK___GET_REFERRERS__EREFERENCE;

	/**
	 * The number of operations of the '<em>Library Hook</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY_HOOK_OPERATION_COUNT = HOOK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.react.impl.ValueBlockImpl <em>Value Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.react.impl.ValueBlockImpl
	 * @see org.nasdanika.sdk.runtime.models.react.impl.ReactPackageImpl#getValueBlock()
	 * @generated
	 */
	int VALUE_BLOCK = 26;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_BLOCK__ID = TypescriptPackage.CODE_BLOCK__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_BLOCK__DOCUMENTATION = TypescriptPackage.CODE_BLOCK__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_BLOCK__DOC_REF = TypescriptPackage.CODE_BLOCK__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_BLOCK__DOC_FORMAT = TypescriptPackage.CODE_BLOCK__DOC_FORMAT;

	/**
	 * The feature id for the '<em><b>Doc Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_BLOCK__DOC_CONTENTS = TypescriptPackage.CODE_BLOCK__DOC_CONTENTS;

	/**
	 * The feature id for the '<em><b>Doc Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_BLOCK__DOC_SECTIONS = TypescriptPackage.CODE_BLOCK__DOC_SECTIONS;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_BLOCK__MARKERS = TypescriptPackage.CODE_BLOCK__MARKERS;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_BLOCK__ICON = TypescriptPackage.CODE_BLOCK__ICON;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_BLOCK__URIS = TypescriptPackage.CODE_BLOCK__URIS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_BLOCK__NAME = TypescriptPackage.CODE_BLOCK__NAME;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_BLOCK__TEXT = TypescriptPackage.CODE_BLOCK__TEXT;

	/**
	 * The feature id for the '<em><b>References</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_BLOCK__REFERENCES = TypescriptPackage.CODE_BLOCK__REFERENCES;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_BLOCK__VALUE = TypescriptPackage.CODE_BLOCK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Value Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_BLOCK_FEATURE_COUNT = TypescriptPackage.CODE_BLOCK_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_BLOCK___COLLECT__OBJECT_EREFERENCE_ELIST = TypescriptPackage.CODE_BLOCK___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_BLOCK___GET_REFERRERS__EREFERENCE = TypescriptPackage.CODE_BLOCK___GET_REFERRERS__EREFERENCE;

	/**
	 * The number of operations of the '<em>Value Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_BLOCK_OPERATION_COUNT = TypescriptPackage.CODE_BLOCK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.react.impl.JsxAttributeImpl <em>Jsx Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.react.impl.JsxAttributeImpl
	 * @see org.nasdanika.sdk.runtime.models.react.impl.ReactPackageImpl#getJsxAttribute()
	 * @generated
	 */
	int JSX_ATTRIBUTE = 27;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSX_ATTRIBUTE__ID = REACT_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSX_ATTRIBUTE__DOCUMENTATION = REACT_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSX_ATTRIBUTE__DOC_REF = REACT_ELEMENT__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSX_ATTRIBUTE__DOC_FORMAT = REACT_ELEMENT__DOC_FORMAT;

	/**
	 * The feature id for the '<em><b>Doc Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSX_ATTRIBUTE__DOC_CONTENTS = REACT_ELEMENT__DOC_CONTENTS;

	/**
	 * The feature id for the '<em><b>Doc Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSX_ATTRIBUTE__DOC_SECTIONS = REACT_ELEMENT__DOC_SECTIONS;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSX_ATTRIBUTE__MARKERS = REACT_ELEMENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSX_ATTRIBUTE__ICON = REACT_ELEMENT__ICON;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSX_ATTRIBUTE__URIS = REACT_ELEMENT__URIS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSX_ATTRIBUTE__NAME = REACT_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Attribute Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSX_ATTRIBUTE__ATTRIBUTE_NAME = REACT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Jsx Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSX_ATTRIBUTE_FEATURE_COUNT = REACT_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSX_ATTRIBUTE___COLLECT__OBJECT_EREFERENCE_ELIST = REACT_ELEMENT___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSX_ATTRIBUTE___GET_REFERRERS__EREFERENCE = REACT_ELEMENT___GET_REFERRERS__EREFERENCE;

	/**
	 * The number of operations of the '<em>Jsx Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSX_ATTRIBUTE_OPERATION_COUNT = REACT_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.react.impl.LiteralAttributeImpl <em>Literal Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.react.impl.LiteralAttributeImpl
	 * @see org.nasdanika.sdk.runtime.models.react.impl.ReactPackageImpl#getLiteralAttribute()
	 * @generated
	 */
	int LITERAL_ATTRIBUTE = 28;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_ATTRIBUTE__ID = JSX_ATTRIBUTE__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_ATTRIBUTE__DOCUMENTATION = JSX_ATTRIBUTE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_ATTRIBUTE__DOC_REF = JSX_ATTRIBUTE__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_ATTRIBUTE__DOC_FORMAT = JSX_ATTRIBUTE__DOC_FORMAT;

	/**
	 * The feature id for the '<em><b>Doc Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_ATTRIBUTE__DOC_CONTENTS = JSX_ATTRIBUTE__DOC_CONTENTS;

	/**
	 * The feature id for the '<em><b>Doc Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_ATTRIBUTE__DOC_SECTIONS = JSX_ATTRIBUTE__DOC_SECTIONS;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_ATTRIBUTE__MARKERS = JSX_ATTRIBUTE__MARKERS;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_ATTRIBUTE__ICON = JSX_ATTRIBUTE__ICON;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_ATTRIBUTE__URIS = JSX_ATTRIBUTE__URIS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_ATTRIBUTE__NAME = JSX_ATTRIBUTE__NAME;

	/**
	 * The feature id for the '<em><b>Attribute Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_ATTRIBUTE__ATTRIBUTE_NAME = JSX_ATTRIBUTE__ATTRIBUTE_NAME;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_ATTRIBUTE__VALUE = JSX_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Literal Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_ATTRIBUTE_FEATURE_COUNT = JSX_ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_ATTRIBUTE___COLLECT__OBJECT_EREFERENCE_ELIST = JSX_ATTRIBUTE___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_ATTRIBUTE___GET_REFERRERS__EREFERENCE = JSX_ATTRIBUTE___GET_REFERRERS__EREFERENCE;

	/**
	 * The number of operations of the '<em>Literal Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_ATTRIBUTE_OPERATION_COUNT = JSX_ATTRIBUTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.react.impl.ExpressionAttributeImpl <em>Expression Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.react.impl.ExpressionAttributeImpl
	 * @see org.nasdanika.sdk.runtime.models.react.impl.ReactPackageImpl#getExpressionAttribute()
	 * @generated
	 */
	int EXPRESSION_ATTRIBUTE = 29;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_ATTRIBUTE__ID = JSX_ATTRIBUTE__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_ATTRIBUTE__DOCUMENTATION = JSX_ATTRIBUTE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_ATTRIBUTE__DOC_REF = JSX_ATTRIBUTE__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_ATTRIBUTE__DOC_FORMAT = JSX_ATTRIBUTE__DOC_FORMAT;

	/**
	 * The feature id for the '<em><b>Doc Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_ATTRIBUTE__DOC_CONTENTS = JSX_ATTRIBUTE__DOC_CONTENTS;

	/**
	 * The feature id for the '<em><b>Doc Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_ATTRIBUTE__DOC_SECTIONS = JSX_ATTRIBUTE__DOC_SECTIONS;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_ATTRIBUTE__MARKERS = JSX_ATTRIBUTE__MARKERS;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_ATTRIBUTE__ICON = JSX_ATTRIBUTE__ICON;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_ATTRIBUTE__URIS = JSX_ATTRIBUTE__URIS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_ATTRIBUTE__NAME = JSX_ATTRIBUTE__NAME;

	/**
	 * The feature id for the '<em><b>Attribute Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_ATTRIBUTE__ATTRIBUTE_NAME = JSX_ATTRIBUTE__ATTRIBUTE_NAME;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_ATTRIBUTE__EXPRESSION = JSX_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Expression Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_ATTRIBUTE_FEATURE_COUNT = JSX_ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_ATTRIBUTE___COLLECT__OBJECT_EREFERENCE_ELIST = JSX_ATTRIBUTE___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_ATTRIBUTE___GET_REFERRERS__EREFERENCE = JSX_ATTRIBUTE___GET_REFERRERS__EREFERENCE;

	/**
	 * The number of operations of the '<em>Expression Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_ATTRIBUTE_OPERATION_COUNT = JSX_ATTRIBUTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.react.impl.EventAttributeImpl <em>Event Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.react.impl.EventAttributeImpl
	 * @see org.nasdanika.sdk.runtime.models.react.impl.ReactPackageImpl#getEventAttribute()
	 * @generated
	 */
	int EVENT_ATTRIBUTE = 30;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_ATTRIBUTE__ID = JSX_ATTRIBUTE__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_ATTRIBUTE__DOCUMENTATION = JSX_ATTRIBUTE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_ATTRIBUTE__DOC_REF = JSX_ATTRIBUTE__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_ATTRIBUTE__DOC_FORMAT = JSX_ATTRIBUTE__DOC_FORMAT;

	/**
	 * The feature id for the '<em><b>Doc Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_ATTRIBUTE__DOC_CONTENTS = JSX_ATTRIBUTE__DOC_CONTENTS;

	/**
	 * The feature id for the '<em><b>Doc Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_ATTRIBUTE__DOC_SECTIONS = JSX_ATTRIBUTE__DOC_SECTIONS;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_ATTRIBUTE__MARKERS = JSX_ATTRIBUTE__MARKERS;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_ATTRIBUTE__ICON = JSX_ATTRIBUTE__ICON;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_ATTRIBUTE__URIS = JSX_ATTRIBUTE__URIS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_ATTRIBUTE__NAME = JSX_ATTRIBUTE__NAME;

	/**
	 * The feature id for the '<em><b>Attribute Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_ATTRIBUTE__ATTRIBUTE_NAME = JSX_ATTRIBUTE__ATTRIBUTE_NAME;

	/**
	 * The feature id for the '<em><b>Handler</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_ATTRIBUTE__HANDLER = JSX_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Event Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_ATTRIBUTE_FEATURE_COUNT = JSX_ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_ATTRIBUTE___COLLECT__OBJECT_EREFERENCE_ELIST = JSX_ATTRIBUTE___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_ATTRIBUTE___GET_REFERRERS__EREFERENCE = JSX_ATTRIBUTE___GET_REFERRERS__EREFERENCE;

	/**
	 * The number of operations of the '<em>Event Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_ATTRIBUTE_OPERATION_COUNT = JSX_ATTRIBUTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.react.impl.SpreadAttributeImpl <em>Spread Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.react.impl.SpreadAttributeImpl
	 * @see org.nasdanika.sdk.runtime.models.react.impl.ReactPackageImpl#getSpreadAttribute()
	 * @generated
	 */
	int SPREAD_ATTRIBUTE = 31;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPREAD_ATTRIBUTE__ID = JSX_ATTRIBUTE__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPREAD_ATTRIBUTE__DOCUMENTATION = JSX_ATTRIBUTE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPREAD_ATTRIBUTE__DOC_REF = JSX_ATTRIBUTE__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPREAD_ATTRIBUTE__DOC_FORMAT = JSX_ATTRIBUTE__DOC_FORMAT;

	/**
	 * The feature id for the '<em><b>Doc Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPREAD_ATTRIBUTE__DOC_CONTENTS = JSX_ATTRIBUTE__DOC_CONTENTS;

	/**
	 * The feature id for the '<em><b>Doc Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPREAD_ATTRIBUTE__DOC_SECTIONS = JSX_ATTRIBUTE__DOC_SECTIONS;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPREAD_ATTRIBUTE__MARKERS = JSX_ATTRIBUTE__MARKERS;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPREAD_ATTRIBUTE__ICON = JSX_ATTRIBUTE__ICON;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPREAD_ATTRIBUTE__URIS = JSX_ATTRIBUTE__URIS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPREAD_ATTRIBUTE__NAME = JSX_ATTRIBUTE__NAME;

	/**
	 * The feature id for the '<em><b>Attribute Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPREAD_ATTRIBUTE__ATTRIBUTE_NAME = JSX_ATTRIBUTE__ATTRIBUTE_NAME;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPREAD_ATTRIBUTE__EXPRESSION = JSX_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Spread Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPREAD_ATTRIBUTE_FEATURE_COUNT = JSX_ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPREAD_ATTRIBUTE___COLLECT__OBJECT_EREFERENCE_ELIST = JSX_ATTRIBUTE___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPREAD_ATTRIBUTE___GET_REFERRERS__EREFERENCE = JSX_ATTRIBUTE___GET_REFERRERS__EREFERENCE;

	/**
	 * The number of operations of the '<em>Spread Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPREAD_ATTRIBUTE_OPERATION_COUNT = JSX_ATTRIBUTE_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.react.ReactElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.ReactElement
	 * @generated
	 */
	EClass getReactElement();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.react.TsxModule <em>Tsx Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tsx Module</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.TsxModule
	 * @generated
	 */
	EClass getTsxModule();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.react.TsxModule#getDirective <em>Directive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Directive</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.TsxModule#getDirective()
	 * @see #getTsxModule()
	 * @generated
	 */
	EAttribute getTsxModule_Directive();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.react.ComponentDeclaration <em>Component Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Declaration</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.ComponentDeclaration
	 * @generated
	 */
	EClass getComponentDeclaration();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.sdk.runtime.models.react.ComponentDeclaration#getPropsType <em>Props Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Props Type</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.ComponentDeclaration#getPropsType()
	 * @see #getComponentDeclaration()
	 * @generated
	 */
	EReference getComponentDeclaration_PropsType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.sdk.runtime.models.react.ComponentDeclaration#getHooks <em>Hooks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Hooks</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.ComponentDeclaration#getHooks()
	 * @see #getComponentDeclaration()
	 * @generated
	 */
	EReference getComponentDeclaration_Hooks();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.sdk.runtime.models.react.ComponentDeclaration#getRender <em>Render</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Render</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.ComponentDeclaration#getRender()
	 * @see #getComponentDeclaration()
	 * @generated
	 */
	EReference getComponentDeclaration_Render();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.react.ComponentDeclaration#isMemo <em>Memo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Memo</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.ComponentDeclaration#isMemo()
	 * @see #getComponentDeclaration()
	 * @generated
	 */
	EAttribute getComponentDeclaration_Memo();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.react.JsxBlock <em>Jsx Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Jsx Block</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.JsxBlock
	 * @generated
	 */
	EClass getJsxBlock();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.sdk.runtime.models.react.JsxBlock#getRoot <em>Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Root</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.JsxBlock#getRoot()
	 * @see #getJsxBlock()
	 * @generated
	 */
	EReference getJsxBlock_Root();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.react.Hook <em>Hook</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hook</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.Hook
	 * @generated
	 */
	EClass getHook();

	/**
	 * Returns the meta object for the attribute list '{@link org.nasdanika.sdk.runtime.models.react.Hook#getBindings <em>Bindings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Bindings</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.Hook#getBindings()
	 * @see #getHook()
	 * @generated
	 */
	EAttribute getHook_Bindings();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.react.StateHook <em>State Hook</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State Hook</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.StateHook
	 * @generated
	 */
	EClass getStateHook();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.sdk.runtime.models.react.StateHook#getStateType <em>State Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>State Type</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.StateHook#getStateType()
	 * @see #getStateHook()
	 * @generated
	 */
	EReference getStateHook_StateType();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.sdk.runtime.models.react.StateHook#getInitialValue <em>Initial Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Initial Value</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.StateHook#getInitialValue()
	 * @see #getStateHook()
	 * @generated
	 */
	EReference getStateHook_InitialValue();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.react.EffectHook <em>Effect Hook</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Effect Hook</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.EffectHook
	 * @generated
	 */
	EClass getEffectHook();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.sdk.runtime.models.react.EffectHook#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Body</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.EffectHook#getBody()
	 * @see #getEffectHook()
	 * @generated
	 */
	EReference getEffectHook_Body();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.sdk.runtime.models.react.EffectHook#getDependencies <em>Dependencies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dependencies</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.EffectHook#getDependencies()
	 * @see #getEffectHook()
	 * @generated
	 */
	EReference getEffectHook_Dependencies();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.react.EffectHook#isLayout <em>Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Layout</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.EffectHook#isLayout()
	 * @see #getEffectHook()
	 * @generated
	 */
	EAttribute getEffectHook_Layout();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.sdk.runtime.models.react.EffectHook#getCleanup <em>Cleanup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cleanup</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.EffectHook#getCleanup()
	 * @see #getEffectHook()
	 * @generated
	 */
	EReference getEffectHook_Cleanup();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.react.MemoHook <em>Memo Hook</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Memo Hook</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.MemoHook
	 * @generated
	 */
	EClass getMemoHook();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.sdk.runtime.models.react.MemoHook#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.MemoHook#getExpression()
	 * @see #getMemoHook()
	 * @generated
	 */
	EReference getMemoHook_Expression();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.sdk.runtime.models.react.MemoHook#getDependencies <em>Dependencies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dependencies</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.MemoHook#getDependencies()
	 * @see #getMemoHook()
	 * @generated
	 */
	EReference getMemoHook_Dependencies();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.react.MemoHook#isCallback <em>Callback</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Callback</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.MemoHook#isCallback()
	 * @see #getMemoHook()
	 * @generated
	 */
	EAttribute getMemoHook_Callback();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.react.ContextHook <em>Context Hook</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Context Hook</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.ContextHook
	 * @generated
	 */
	EClass getContextHook();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.sdk.runtime.models.react.ContextHook#getContext <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Context</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.ContextHook#getContext()
	 * @see #getContextHook()
	 * @generated
	 */
	EReference getContextHook_Context();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.react.RefHook <em>Ref Hook</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ref Hook</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.RefHook
	 * @generated
	 */
	EClass getRefHook();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.sdk.runtime.models.react.RefHook#getRefType <em>Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ref Type</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.RefHook#getRefType()
	 * @see #getRefHook()
	 * @generated
	 */
	EReference getRefHook_RefType();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.sdk.runtime.models.react.RefHook#getInitialValue <em>Initial Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Initial Value</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.RefHook#getInitialValue()
	 * @see #getRefHook()
	 * @generated
	 */
	EReference getRefHook_InitialValue();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.react.OpaqueHook <em>Opaque Hook</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Opaque Hook</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.OpaqueHook
	 * @generated
	 */
	EClass getOpaqueHook();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.react.OpaqueHook#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.OpaqueHook#getText()
	 * @see #getOpaqueHook()
	 * @generated
	 */
	EAttribute getOpaqueHook_Text();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.sdk.runtime.models.react.OpaqueHook#getReferences <em>References</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>References</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.OpaqueHook#getReferences()
	 * @see #getOpaqueHook()
	 * @generated
	 */
	EReference getOpaqueHook_References();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.react.ContextDeclaration <em>Context Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Context Declaration</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.ContextDeclaration
	 * @generated
	 */
	EClass getContextDeclaration();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.sdk.runtime.models.react.ContextDeclaration#getValueType <em>Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value Type</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.ContextDeclaration#getValueType()
	 * @see #getContextDeclaration()
	 * @generated
	 */
	EReference getContextDeclaration_ValueType();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.sdk.runtime.models.react.ContextDeclaration#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Default Value</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.ContextDeclaration#getDefaultValue()
	 * @see #getContextDeclaration()
	 * @generated
	 */
	EReference getContextDeclaration_DefaultValue();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.react.JsxNode <em>Jsx Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Jsx Node</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.JsxNode
	 * @generated
	 */
	EClass getJsxNode();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.react.JsxContainer <em>Jsx Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Jsx Container</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.JsxContainer
	 * @generated
	 */
	EClass getJsxContainer();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.sdk.runtime.models.react.JsxContainer#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Children</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.JsxContainer#getChildren()
	 * @see #getJsxContainer()
	 * @generated
	 */
	EReference getJsxContainer_Children();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.react.JsxElement <em>Jsx Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Jsx Element</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.JsxElement
	 * @generated
	 */
	EClass getJsxElement();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.react.JsxElement#getTag <em>Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tag</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.JsxElement#getTag()
	 * @see #getJsxElement()
	 * @generated
	 */
	EAttribute getJsxElement_Tag();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.sdk.runtime.models.react.JsxElement#getComponentType <em>Component Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Component Type</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.JsxElement#getComponentType()
	 * @see #getJsxElement()
	 * @generated
	 */
	EReference getJsxElement_ComponentType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.sdk.runtime.models.react.JsxElement#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attributes</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.JsxElement#getAttributes()
	 * @see #getJsxElement()
	 * @generated
	 */
	EReference getJsxElement_Attributes();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.react.JsxFragment <em>Jsx Fragment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Jsx Fragment</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.JsxFragment
	 * @generated
	 */
	EClass getJsxFragment();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.react.JsxText <em>Jsx Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Jsx Text</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.JsxText
	 * @generated
	 */
	EClass getJsxText();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.react.JsxText#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.JsxText#getText()
	 * @see #getJsxText()
	 * @generated
	 */
	EAttribute getJsxText_Text();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.react.JsxExpression <em>Jsx Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Jsx Expression</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.JsxExpression
	 * @generated
	 */
	EClass getJsxExpression();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.sdk.runtime.models.react.JsxExpression#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.JsxExpression#getExpression()
	 * @see #getJsxExpression()
	 * @generated
	 */
	EReference getJsxExpression_Expression();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.react.JsxConditional <em>Jsx Conditional</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Jsx Conditional</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.JsxConditional
	 * @generated
	 */
	EClass getJsxConditional();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.sdk.runtime.models.react.JsxConditional#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.JsxConditional#getCondition()
	 * @see #getJsxConditional()
	 * @generated
	 */
	EReference getJsxConditional_Condition();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.sdk.runtime.models.react.JsxConditional#getThen <em>Then</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Then</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.JsxConditional#getThen()
	 * @see #getJsxConditional()
	 * @generated
	 */
	EReference getJsxConditional_Then();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.sdk.runtime.models.react.JsxConditional#getOtherwise <em>Otherwise</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Otherwise</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.JsxConditional#getOtherwise()
	 * @see #getJsxConditional()
	 * @generated
	 */
	EReference getJsxConditional_Otherwise();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.react.JsxIterator <em>Jsx Iterator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Jsx Iterator</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.JsxIterator
	 * @generated
	 */
	EClass getJsxIterator();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.sdk.runtime.models.react.JsxIterator#getItems <em>Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Items</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.JsxIterator#getItems()
	 * @see #getJsxIterator()
	 * @generated
	 */
	EReference getJsxIterator_Items();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.react.JsxIterator#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Variable</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.JsxIterator#getVariable()
	 * @see #getJsxIterator()
	 * @generated
	 */
	EAttribute getJsxIterator_Variable();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.sdk.runtime.models.react.JsxIterator#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Key</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.JsxIterator#getKey()
	 * @see #getJsxIterator()
	 * @generated
	 */
	EReference getJsxIterator_Key();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.sdk.runtime.models.react.JsxIterator#getTemplate <em>Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Template</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.JsxIterator#getTemplate()
	 * @see #getJsxIterator()
	 * @generated
	 */
	EReference getJsxIterator_Template();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.react.ContextProvider <em>Context Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Context Provider</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.ContextProvider
	 * @generated
	 */
	EClass getContextProvider();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.sdk.runtime.models.react.ContextProvider#getContext <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Context</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.ContextProvider#getContext()
	 * @see #getContextProvider()
	 * @generated
	 */
	EReference getContextProvider_Context();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.sdk.runtime.models.react.ContextProvider#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.ContextProvider#getValue()
	 * @see #getContextProvider()
	 * @generated
	 */
	EReference getContextProvider_Value();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.react.OpaqueJsx <em>Opaque Jsx</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Opaque Jsx</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.OpaqueJsx
	 * @generated
	 */
	EClass getOpaqueJsx();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.react.OpaqueJsx#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.OpaqueJsx#getText()
	 * @see #getOpaqueJsx()
	 * @generated
	 */
	EAttribute getOpaqueJsx_Text();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.sdk.runtime.models.react.OpaqueJsx#getReferences <em>References</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>References</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.OpaqueJsx#getReferences()
	 * @see #getOpaqueJsx()
	 * @generated
	 */
	EReference getOpaqueJsx_References();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.react.Intrinsic <em>Intrinsic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Intrinsic</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.Intrinsic
	 * @generated
	 */
	EClass getIntrinsic();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.sdk.runtime.models.react.Intrinsic#getElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Element</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.Intrinsic#getElement()
	 * @see #getIntrinsic()
	 * @generated
	 */
	EReference getIntrinsic_Element();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.sdk.runtime.models.react.Intrinsic#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attributes</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.Intrinsic#getAttributes()
	 * @see #getIntrinsic()
	 * @generated
	 */
	EReference getIntrinsic_Attributes();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.react.JsxContent <em>Jsx Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Jsx Content</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.JsxContent
	 * @generated
	 */
	EClass getJsxContent();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.sdk.runtime.models.react.JsxContent#getNode <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Node</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.JsxContent#getNode()
	 * @see #getJsxContent()
	 * @generated
	 */
	EReference getJsxContent_Node();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.react.LibraryComponent <em>Library Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Library Component</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.LibraryComponent
	 * @generated
	 */
	EClass getLibraryComponent();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.sdk.runtime.models.react.LibraryComponent#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attributes</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.LibraryComponent#getAttributes()
	 * @see #getLibraryComponent()
	 * @generated
	 */
	EReference getLibraryComponent_Attributes();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.react.LibraryHook <em>Library Hook</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Library Hook</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.LibraryHook
	 * @generated
	 */
	EClass getLibraryHook();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.react.ValueBlock <em>Value Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value Block</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.ValueBlock
	 * @generated
	 */
	EClass getValueBlock();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.sdk.runtime.models.react.ValueBlock#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.ValueBlock#getValue()
	 * @see #getValueBlock()
	 * @generated
	 */
	EReference getValueBlock_Value();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.react.JsxAttribute <em>Jsx Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Jsx Attribute</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.JsxAttribute
	 * @generated
	 */
	EClass getJsxAttribute();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.react.JsxAttribute#getAttributeName <em>Attribute Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attribute Name</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.JsxAttribute#getAttributeName()
	 * @see #getJsxAttribute()
	 * @generated
	 */
	EAttribute getJsxAttribute_AttributeName();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.react.LiteralAttribute <em>Literal Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Literal Attribute</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.LiteralAttribute
	 * @generated
	 */
	EClass getLiteralAttribute();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.react.LiteralAttribute#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.LiteralAttribute#getValue()
	 * @see #getLiteralAttribute()
	 * @generated
	 */
	EAttribute getLiteralAttribute_Value();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.react.ExpressionAttribute <em>Expression Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression Attribute</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.ExpressionAttribute
	 * @generated
	 */
	EClass getExpressionAttribute();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.sdk.runtime.models.react.ExpressionAttribute#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.ExpressionAttribute#getExpression()
	 * @see #getExpressionAttribute()
	 * @generated
	 */
	EReference getExpressionAttribute_Expression();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.react.EventAttribute <em>Event Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event Attribute</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.EventAttribute
	 * @generated
	 */
	EClass getEventAttribute();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.sdk.runtime.models.react.EventAttribute#getHandler <em>Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Handler</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.EventAttribute#getHandler()
	 * @see #getEventAttribute()
	 * @generated
	 */
	EReference getEventAttribute_Handler();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.react.SpreadAttribute <em>Spread Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Spread Attribute</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.SpreadAttribute
	 * @generated
	 */
	EClass getSpreadAttribute();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.sdk.runtime.models.react.SpreadAttribute#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.SpreadAttribute#getExpression()
	 * @see #getSpreadAttribute()
	 * @generated
	 */
	EReference getSpreadAttribute_Expression();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ReactFactory getReactFactory();

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
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.react.impl.ReactElementImpl <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.react.impl.ReactElementImpl
		 * @see org.nasdanika.sdk.runtime.models.react.impl.ReactPackageImpl#getReactElement()
		 * @generated
		 */
		EClass REACT_ELEMENT = eINSTANCE.getReactElement();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.react.impl.TsxModuleImpl <em>Tsx Module</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.react.impl.TsxModuleImpl
		 * @see org.nasdanika.sdk.runtime.models.react.impl.ReactPackageImpl#getTsxModule()
		 * @generated
		 */
		EClass TSX_MODULE = eINSTANCE.getTsxModule();

		/**
		 * The meta object literal for the '<em><b>Directive</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TSX_MODULE__DIRECTIVE = eINSTANCE.getTsxModule_Directive();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.react.impl.ComponentDeclarationImpl <em>Component Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.react.impl.ComponentDeclarationImpl
		 * @see org.nasdanika.sdk.runtime.models.react.impl.ReactPackageImpl#getComponentDeclaration()
		 * @generated
		 */
		EClass COMPONENT_DECLARATION = eINSTANCE.getComponentDeclaration();

		/**
		 * The meta object literal for the '<em><b>Props Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_DECLARATION__PROPS_TYPE = eINSTANCE.getComponentDeclaration_PropsType();

		/**
		 * The meta object literal for the '<em><b>Hooks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_DECLARATION__HOOKS = eINSTANCE.getComponentDeclaration_Hooks();

		/**
		 * The meta object literal for the '<em><b>Render</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_DECLARATION__RENDER = eINSTANCE.getComponentDeclaration_Render();

		/**
		 * The meta object literal for the '<em><b>Memo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT_DECLARATION__MEMO = eINSTANCE.getComponentDeclaration_Memo();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.react.impl.JsxBlockImpl <em>Jsx Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.react.impl.JsxBlockImpl
		 * @see org.nasdanika.sdk.runtime.models.react.impl.ReactPackageImpl#getJsxBlock()
		 * @generated
		 */
		EClass JSX_BLOCK = eINSTANCE.getJsxBlock();

		/**
		 * The meta object literal for the '<em><b>Root</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JSX_BLOCK__ROOT = eINSTANCE.getJsxBlock_Root();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.react.impl.HookImpl <em>Hook</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.react.impl.HookImpl
		 * @see org.nasdanika.sdk.runtime.models.react.impl.ReactPackageImpl#getHook()
		 * @generated
		 */
		EClass HOOK = eINSTANCE.getHook();

		/**
		 * The meta object literal for the '<em><b>Bindings</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOOK__BINDINGS = eINSTANCE.getHook_Bindings();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.react.impl.StateHookImpl <em>State Hook</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.react.impl.StateHookImpl
		 * @see org.nasdanika.sdk.runtime.models.react.impl.ReactPackageImpl#getStateHook()
		 * @generated
		 */
		EClass STATE_HOOK = eINSTANCE.getStateHook();

		/**
		 * The meta object literal for the '<em><b>State Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE_HOOK__STATE_TYPE = eINSTANCE.getStateHook_StateType();

		/**
		 * The meta object literal for the '<em><b>Initial Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE_HOOK__INITIAL_VALUE = eINSTANCE.getStateHook_InitialValue();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.react.impl.EffectHookImpl <em>Effect Hook</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.react.impl.EffectHookImpl
		 * @see org.nasdanika.sdk.runtime.models.react.impl.ReactPackageImpl#getEffectHook()
		 * @generated
		 */
		EClass EFFECT_HOOK = eINSTANCE.getEffectHook();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EFFECT_HOOK__BODY = eINSTANCE.getEffectHook_Body();

		/**
		 * The meta object literal for the '<em><b>Dependencies</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EFFECT_HOOK__DEPENDENCIES = eINSTANCE.getEffectHook_Dependencies();

		/**
		 * The meta object literal for the '<em><b>Layout</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EFFECT_HOOK__LAYOUT = eINSTANCE.getEffectHook_Layout();

		/**
		 * The meta object literal for the '<em><b>Cleanup</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EFFECT_HOOK__CLEANUP = eINSTANCE.getEffectHook_Cleanup();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.react.impl.MemoHookImpl <em>Memo Hook</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.react.impl.MemoHookImpl
		 * @see org.nasdanika.sdk.runtime.models.react.impl.ReactPackageImpl#getMemoHook()
		 * @generated
		 */
		EClass MEMO_HOOK = eINSTANCE.getMemoHook();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEMO_HOOK__EXPRESSION = eINSTANCE.getMemoHook_Expression();

		/**
		 * The meta object literal for the '<em><b>Dependencies</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEMO_HOOK__DEPENDENCIES = eINSTANCE.getMemoHook_Dependencies();

		/**
		 * The meta object literal for the '<em><b>Callback</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEMO_HOOK__CALLBACK = eINSTANCE.getMemoHook_Callback();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.react.impl.ContextHookImpl <em>Context Hook</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.react.impl.ContextHookImpl
		 * @see org.nasdanika.sdk.runtime.models.react.impl.ReactPackageImpl#getContextHook()
		 * @generated
		 */
		EClass CONTEXT_HOOK = eINSTANCE.getContextHook();

		/**
		 * The meta object literal for the '<em><b>Context</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEXT_HOOK__CONTEXT = eINSTANCE.getContextHook_Context();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.react.impl.RefHookImpl <em>Ref Hook</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.react.impl.RefHookImpl
		 * @see org.nasdanika.sdk.runtime.models.react.impl.ReactPackageImpl#getRefHook()
		 * @generated
		 */
		EClass REF_HOOK = eINSTANCE.getRefHook();

		/**
		 * The meta object literal for the '<em><b>Ref Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REF_HOOK__REF_TYPE = eINSTANCE.getRefHook_RefType();

		/**
		 * The meta object literal for the '<em><b>Initial Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REF_HOOK__INITIAL_VALUE = eINSTANCE.getRefHook_InitialValue();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.react.impl.OpaqueHookImpl <em>Opaque Hook</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.react.impl.OpaqueHookImpl
		 * @see org.nasdanika.sdk.runtime.models.react.impl.ReactPackageImpl#getOpaqueHook()
		 * @generated
		 */
		EClass OPAQUE_HOOK = eINSTANCE.getOpaqueHook();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPAQUE_HOOK__TEXT = eINSTANCE.getOpaqueHook_Text();

		/**
		 * The meta object literal for the '<em><b>References</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPAQUE_HOOK__REFERENCES = eINSTANCE.getOpaqueHook_References();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.react.impl.ContextDeclarationImpl <em>Context Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.react.impl.ContextDeclarationImpl
		 * @see org.nasdanika.sdk.runtime.models.react.impl.ReactPackageImpl#getContextDeclaration()
		 * @generated
		 */
		EClass CONTEXT_DECLARATION = eINSTANCE.getContextDeclaration();

		/**
		 * The meta object literal for the '<em><b>Value Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEXT_DECLARATION__VALUE_TYPE = eINSTANCE.getContextDeclaration_ValueType();

		/**
		 * The meta object literal for the '<em><b>Default Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEXT_DECLARATION__DEFAULT_VALUE = eINSTANCE.getContextDeclaration_DefaultValue();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.react.impl.JsxNodeImpl <em>Jsx Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.react.impl.JsxNodeImpl
		 * @see org.nasdanika.sdk.runtime.models.react.impl.ReactPackageImpl#getJsxNode()
		 * @generated
		 */
		EClass JSX_NODE = eINSTANCE.getJsxNode();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.react.impl.JsxContainerImpl <em>Jsx Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.react.impl.JsxContainerImpl
		 * @see org.nasdanika.sdk.runtime.models.react.impl.ReactPackageImpl#getJsxContainer()
		 * @generated
		 */
		EClass JSX_CONTAINER = eINSTANCE.getJsxContainer();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JSX_CONTAINER__CHILDREN = eINSTANCE.getJsxContainer_Children();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.react.impl.JsxElementImpl <em>Jsx Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.react.impl.JsxElementImpl
		 * @see org.nasdanika.sdk.runtime.models.react.impl.ReactPackageImpl#getJsxElement()
		 * @generated
		 */
		EClass JSX_ELEMENT = eINSTANCE.getJsxElement();

		/**
		 * The meta object literal for the '<em><b>Tag</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JSX_ELEMENT__TAG = eINSTANCE.getJsxElement_Tag();

		/**
		 * The meta object literal for the '<em><b>Component Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JSX_ELEMENT__COMPONENT_TYPE = eINSTANCE.getJsxElement_ComponentType();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JSX_ELEMENT__ATTRIBUTES = eINSTANCE.getJsxElement_Attributes();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.react.impl.JsxFragmentImpl <em>Jsx Fragment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.react.impl.JsxFragmentImpl
		 * @see org.nasdanika.sdk.runtime.models.react.impl.ReactPackageImpl#getJsxFragment()
		 * @generated
		 */
		EClass JSX_FRAGMENT = eINSTANCE.getJsxFragment();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.react.impl.JsxTextImpl <em>Jsx Text</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.react.impl.JsxTextImpl
		 * @see org.nasdanika.sdk.runtime.models.react.impl.ReactPackageImpl#getJsxText()
		 * @generated
		 */
		EClass JSX_TEXT = eINSTANCE.getJsxText();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JSX_TEXT__TEXT = eINSTANCE.getJsxText_Text();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.react.impl.JsxExpressionImpl <em>Jsx Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.react.impl.JsxExpressionImpl
		 * @see org.nasdanika.sdk.runtime.models.react.impl.ReactPackageImpl#getJsxExpression()
		 * @generated
		 */
		EClass JSX_EXPRESSION = eINSTANCE.getJsxExpression();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JSX_EXPRESSION__EXPRESSION = eINSTANCE.getJsxExpression_Expression();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.react.impl.JsxConditionalImpl <em>Jsx Conditional</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.react.impl.JsxConditionalImpl
		 * @see org.nasdanika.sdk.runtime.models.react.impl.ReactPackageImpl#getJsxConditional()
		 * @generated
		 */
		EClass JSX_CONDITIONAL = eINSTANCE.getJsxConditional();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JSX_CONDITIONAL__CONDITION = eINSTANCE.getJsxConditional_Condition();

		/**
		 * The meta object literal for the '<em><b>Then</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JSX_CONDITIONAL__THEN = eINSTANCE.getJsxConditional_Then();

		/**
		 * The meta object literal for the '<em><b>Otherwise</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JSX_CONDITIONAL__OTHERWISE = eINSTANCE.getJsxConditional_Otherwise();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.react.impl.JsxIteratorImpl <em>Jsx Iterator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.react.impl.JsxIteratorImpl
		 * @see org.nasdanika.sdk.runtime.models.react.impl.ReactPackageImpl#getJsxIterator()
		 * @generated
		 */
		EClass JSX_ITERATOR = eINSTANCE.getJsxIterator();

		/**
		 * The meta object literal for the '<em><b>Items</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JSX_ITERATOR__ITEMS = eINSTANCE.getJsxIterator_Items();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JSX_ITERATOR__VARIABLE = eINSTANCE.getJsxIterator_Variable();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JSX_ITERATOR__KEY = eINSTANCE.getJsxIterator_Key();

		/**
		 * The meta object literal for the '<em><b>Template</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JSX_ITERATOR__TEMPLATE = eINSTANCE.getJsxIterator_Template();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.react.impl.ContextProviderImpl <em>Context Provider</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.react.impl.ContextProviderImpl
		 * @see org.nasdanika.sdk.runtime.models.react.impl.ReactPackageImpl#getContextProvider()
		 * @generated
		 */
		EClass CONTEXT_PROVIDER = eINSTANCE.getContextProvider();

		/**
		 * The meta object literal for the '<em><b>Context</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEXT_PROVIDER__CONTEXT = eINSTANCE.getContextProvider_Context();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEXT_PROVIDER__VALUE = eINSTANCE.getContextProvider_Value();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.react.impl.OpaqueJsxImpl <em>Opaque Jsx</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.react.impl.OpaqueJsxImpl
		 * @see org.nasdanika.sdk.runtime.models.react.impl.ReactPackageImpl#getOpaqueJsx()
		 * @generated
		 */
		EClass OPAQUE_JSX = eINSTANCE.getOpaqueJsx();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPAQUE_JSX__TEXT = eINSTANCE.getOpaqueJsx_Text();

		/**
		 * The meta object literal for the '<em><b>References</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPAQUE_JSX__REFERENCES = eINSTANCE.getOpaqueJsx_References();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.react.impl.IntrinsicImpl <em>Intrinsic</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.react.impl.IntrinsicImpl
		 * @see org.nasdanika.sdk.runtime.models.react.impl.ReactPackageImpl#getIntrinsic()
		 * @generated
		 */
		EClass INTRINSIC = eINSTANCE.getIntrinsic();

		/**
		 * The meta object literal for the '<em><b>Element</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTRINSIC__ELEMENT = eINSTANCE.getIntrinsic_Element();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTRINSIC__ATTRIBUTES = eINSTANCE.getIntrinsic_Attributes();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.react.impl.JsxContentImpl <em>Jsx Content</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.react.impl.JsxContentImpl
		 * @see org.nasdanika.sdk.runtime.models.react.impl.ReactPackageImpl#getJsxContent()
		 * @generated
		 */
		EClass JSX_CONTENT = eINSTANCE.getJsxContent();

		/**
		 * The meta object literal for the '<em><b>Node</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JSX_CONTENT__NODE = eINSTANCE.getJsxContent_Node();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.react.impl.LibraryComponentImpl <em>Library Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.react.impl.LibraryComponentImpl
		 * @see org.nasdanika.sdk.runtime.models.react.impl.ReactPackageImpl#getLibraryComponent()
		 * @generated
		 */
		EClass LIBRARY_COMPONENT = eINSTANCE.getLibraryComponent();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIBRARY_COMPONENT__ATTRIBUTES = eINSTANCE.getLibraryComponent_Attributes();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.react.impl.LibraryHookImpl <em>Library Hook</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.react.impl.LibraryHookImpl
		 * @see org.nasdanika.sdk.runtime.models.react.impl.ReactPackageImpl#getLibraryHook()
		 * @generated
		 */
		EClass LIBRARY_HOOK = eINSTANCE.getLibraryHook();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.react.impl.ValueBlockImpl <em>Value Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.react.impl.ValueBlockImpl
		 * @see org.nasdanika.sdk.runtime.models.react.impl.ReactPackageImpl#getValueBlock()
		 * @generated
		 */
		EClass VALUE_BLOCK = eINSTANCE.getValueBlock();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALUE_BLOCK__VALUE = eINSTANCE.getValueBlock_Value();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.react.impl.JsxAttributeImpl <em>Jsx Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.react.impl.JsxAttributeImpl
		 * @see org.nasdanika.sdk.runtime.models.react.impl.ReactPackageImpl#getJsxAttribute()
		 * @generated
		 */
		EClass JSX_ATTRIBUTE = eINSTANCE.getJsxAttribute();

		/**
		 * The meta object literal for the '<em><b>Attribute Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JSX_ATTRIBUTE__ATTRIBUTE_NAME = eINSTANCE.getJsxAttribute_AttributeName();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.react.impl.LiteralAttributeImpl <em>Literal Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.react.impl.LiteralAttributeImpl
		 * @see org.nasdanika.sdk.runtime.models.react.impl.ReactPackageImpl#getLiteralAttribute()
		 * @generated
		 */
		EClass LITERAL_ATTRIBUTE = eINSTANCE.getLiteralAttribute();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LITERAL_ATTRIBUTE__VALUE = eINSTANCE.getLiteralAttribute_Value();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.react.impl.ExpressionAttributeImpl <em>Expression Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.react.impl.ExpressionAttributeImpl
		 * @see org.nasdanika.sdk.runtime.models.react.impl.ReactPackageImpl#getExpressionAttribute()
		 * @generated
		 */
		EClass EXPRESSION_ATTRIBUTE = eINSTANCE.getExpressionAttribute();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESSION_ATTRIBUTE__EXPRESSION = eINSTANCE.getExpressionAttribute_Expression();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.react.impl.EventAttributeImpl <em>Event Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.react.impl.EventAttributeImpl
		 * @see org.nasdanika.sdk.runtime.models.react.impl.ReactPackageImpl#getEventAttribute()
		 * @generated
		 */
		EClass EVENT_ATTRIBUTE = eINSTANCE.getEventAttribute();

		/**
		 * The meta object literal for the '<em><b>Handler</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT_ATTRIBUTE__HANDLER = eINSTANCE.getEventAttribute_Handler();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.react.impl.SpreadAttributeImpl <em>Spread Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.react.impl.SpreadAttributeImpl
		 * @see org.nasdanika.sdk.runtime.models.react.impl.ReactPackageImpl#getSpreadAttribute()
		 * @generated
		 */
		EClass SPREAD_ATTRIBUTE = eINSTANCE.getSpreadAttribute();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPREAD_ATTRIBUTE__EXPRESSION = eINSTANCE.getSpreadAttribute_Expression();

	}

} //ReactPackage
