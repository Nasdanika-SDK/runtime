/**
 */
package org.nasdanika.sdk.runtime.models.react.bootstrap;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.nasdanika.sdk.runtime.models.react.ReactPackage;

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
 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.BootstrapFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel modelDirectory='/bootstrap/src-gen' featureDelegation='Dynamic' complianceLevel='25' suppressGenModelAnnotations='false' copyrightFields='false' operationReflection='true' importOrganizing='true' basePackage='org.nasdanika.sdk.runtime.models.react'"
 *        annotation="http://www.eclipse.org/emf/2011/Xcore Ecore='http://www.eclipse.org/emf/2002/Ecore' GenModel='http://www.eclipse.org/emf/2002/GenModel' React='urn:org.nasdanika:react'"
 * @generated
 */
public interface BootstrapPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "bootstrap";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "https://runtime.sdk.nasdanika.org/models/react/bootstrap";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.nasdanika.sdk.runtime.models.react.bootstrap";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BootstrapPackage eINSTANCE = org.nasdanika.sdk.runtime.models.react.bootstrap.impl.BootstrapPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.impl.BootstrapComponentImpl <em>Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.impl.BootstrapComponentImpl
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.impl.BootstrapPackageImpl#getBootstrapComponent()
	 * @generated
	 */
	int BOOTSTRAP_COMPONENT = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOTSTRAP_COMPONENT__ID = ReactPackage.LIBRARY_COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOTSTRAP_COMPONENT__DOCUMENTATION = ReactPackage.LIBRARY_COMPONENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOTSTRAP_COMPONENT__DOC_REF = ReactPackage.LIBRARY_COMPONENT__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOTSTRAP_COMPONENT__DOC_FORMAT = ReactPackage.LIBRARY_COMPONENT__DOC_FORMAT;

	/**
	 * The feature id for the '<em><b>Doc Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOTSTRAP_COMPONENT__DOC_CONTENTS = ReactPackage.LIBRARY_COMPONENT__DOC_CONTENTS;

	/**
	 * The feature id for the '<em><b>Doc Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOTSTRAP_COMPONENT__DOC_SECTIONS = ReactPackage.LIBRARY_COMPONENT__DOC_SECTIONS;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOTSTRAP_COMPONENT__MARKERS = ReactPackage.LIBRARY_COMPONENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOTSTRAP_COMPONENT__ICON = ReactPackage.LIBRARY_COMPONENT__ICON;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOTSTRAP_COMPONENT__URIS = ReactPackage.LIBRARY_COMPONENT__URIS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOTSTRAP_COMPONENT__NAME = ReactPackage.LIBRARY_COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOTSTRAP_COMPONENT__CHILDREN = ReactPackage.LIBRARY_COMPONENT__CHILDREN;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOTSTRAP_COMPONENT__ATTRIBUTES = ReactPackage.LIBRARY_COMPONENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Element Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOTSTRAP_COMPONENT__ELEMENT_ID = ReactPackage.LIBRARY_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOTSTRAP_COMPONENT__CLASSES = ReactPackage.LIBRARY_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Style</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOTSTRAP_COMPONENT__STYLE = ReactPackage.LIBRARY_COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>As</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOTSTRAP_COMPONENT__AS = ReactPackage.LIBRARY_COMPONENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>As Component</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOTSTRAP_COMPONENT__AS_COMPONENT = ReactPackage.LIBRARY_COMPONENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOTSTRAP_COMPONENT_FEATURE_COUNT = ReactPackage.LIBRARY_COMPONENT_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOTSTRAP_COMPONENT___COLLECT__OBJECT_EREFERENCE_ELIST = ReactPackage.LIBRARY_COMPONENT___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOTSTRAP_COMPONENT___GET_REFERRERS__EREFERENCE = ReactPackage.LIBRARY_COMPONENT___GET_REFERRERS__EREFERENCE;

	/**
	 * The number of operations of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOTSTRAP_COMPONENT_OPERATION_COUNT = ReactPackage.LIBRARY_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.TextContent <em>Text Content</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.TextContent
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.impl.BootstrapPackageImpl#getTextContent()
	 * @generated
	 */
	int TEXT_CONTENT = 1;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_CONTENT__CONTENT = 0;

	/**
	 * The number of structural features of the '<em>Text Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_CONTENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Text Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_CONTENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.impl.ColumnSizeImpl <em>Column Size</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.impl.ColumnSizeImpl
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.impl.BootstrapPackageImpl#getColumnSize()
	 * @generated
	 */
	int COLUMN_SIZE = 2;

	/**
	 * The feature id for the '<em><b>Breakpoint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_SIZE__BREAKPOINT = 0;

	/**
	 * The feature id for the '<em><b>Span</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_SIZE__SPAN = 1;

	/**
	 * The feature id for the '<em><b>Auto</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_SIZE__AUTO = 2;

	/**
	 * The feature id for the '<em><b>Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_SIZE__OFFSET = 3;

	/**
	 * The feature id for the '<em><b>Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_SIZE__ORDER = 4;

	/**
	 * The number of structural features of the '<em>Column Size</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_SIZE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Column Size</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_SIZE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.impl.RowColumnsImpl <em>Row Columns</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.impl.RowColumnsImpl
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.impl.BootstrapPackageImpl#getRowColumns()
	 * @generated
	 */
	int ROW_COLUMNS = 3;

	/**
	 * The feature id for the '<em><b>Breakpoint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW_COLUMNS__BREAKPOINT = 0;

	/**
	 * The feature id for the '<em><b>Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW_COLUMNS__COUNT = 1;

	/**
	 * The feature id for the '<em><b>Auto</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW_COLUMNS__AUTO = 2;

	/**
	 * The number of structural features of the '<em>Row Columns</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW_COLUMNS_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Row Columns</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW_COLUMNS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.impl.ThemeProviderImpl <em>Theme Provider</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.impl.ThemeProviderImpl
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.impl.BootstrapPackageImpl#getThemeProvider()
	 * @generated
	 */
	int THEME_PROVIDER = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THEME_PROVIDER__ID = BOOTSTRAP_COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THEME_PROVIDER__DOCUMENTATION = BOOTSTRAP_COMPONENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THEME_PROVIDER__DOC_REF = BOOTSTRAP_COMPONENT__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THEME_PROVIDER__DOC_FORMAT = BOOTSTRAP_COMPONENT__DOC_FORMAT;

	/**
	 * The feature id for the '<em><b>Doc Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THEME_PROVIDER__DOC_CONTENTS = BOOTSTRAP_COMPONENT__DOC_CONTENTS;

	/**
	 * The feature id for the '<em><b>Doc Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THEME_PROVIDER__DOC_SECTIONS = BOOTSTRAP_COMPONENT__DOC_SECTIONS;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THEME_PROVIDER__MARKERS = BOOTSTRAP_COMPONENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THEME_PROVIDER__ICON = BOOTSTRAP_COMPONENT__ICON;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THEME_PROVIDER__URIS = BOOTSTRAP_COMPONENT__URIS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THEME_PROVIDER__NAME = BOOTSTRAP_COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THEME_PROVIDER__CHILDREN = BOOTSTRAP_COMPONENT__CHILDREN;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THEME_PROVIDER__ATTRIBUTES = BOOTSTRAP_COMPONENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Element Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THEME_PROVIDER__ELEMENT_ID = BOOTSTRAP_COMPONENT__ELEMENT_ID;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THEME_PROVIDER__CLASSES = BOOTSTRAP_COMPONENT__CLASSES;

	/**
	 * The feature id for the '<em><b>Style</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THEME_PROVIDER__STYLE = BOOTSTRAP_COMPONENT__STYLE;

	/**
	 * The feature id for the '<em><b>As</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THEME_PROVIDER__AS = BOOTSTRAP_COMPONENT__AS;

	/**
	 * The feature id for the '<em><b>As Component</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THEME_PROVIDER__AS_COMPONENT = BOOTSTRAP_COMPONENT__AS_COMPONENT;

	/**
	 * The feature id for the '<em><b>Breakpoints</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THEME_PROVIDER__BREAKPOINTS = BOOTSTRAP_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Min Breakpoint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THEME_PROVIDER__MIN_BREAKPOINT = BOOTSTRAP_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Dir</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THEME_PROVIDER__DIR = BOOTSTRAP_COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Theme Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THEME_PROVIDER_FEATURE_COUNT = BOOTSTRAP_COMPONENT_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THEME_PROVIDER___COLLECT__OBJECT_EREFERENCE_ELIST = BOOTSTRAP_COMPONENT___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THEME_PROVIDER___GET_REFERRERS__EREFERENCE = BOOTSTRAP_COMPONENT___GET_REFERRERS__EREFERENCE;

	/**
	 * The number of operations of the '<em>Theme Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THEME_PROVIDER_OPERATION_COUNT = BOOTSTRAP_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.impl.ContainerImpl <em>Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.impl.ContainerImpl
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.impl.BootstrapPackageImpl#getContainer()
	 * @generated
	 */
	int CONTAINER = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__ID = BOOTSTRAP_COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__DOCUMENTATION = BOOTSTRAP_COMPONENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__DOC_REF = BOOTSTRAP_COMPONENT__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__DOC_FORMAT = BOOTSTRAP_COMPONENT__DOC_FORMAT;

	/**
	 * The feature id for the '<em><b>Doc Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__DOC_CONTENTS = BOOTSTRAP_COMPONENT__DOC_CONTENTS;

	/**
	 * The feature id for the '<em><b>Doc Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__DOC_SECTIONS = BOOTSTRAP_COMPONENT__DOC_SECTIONS;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__MARKERS = BOOTSTRAP_COMPONENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__ICON = BOOTSTRAP_COMPONENT__ICON;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__URIS = BOOTSTRAP_COMPONENT__URIS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__NAME = BOOTSTRAP_COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__CHILDREN = BOOTSTRAP_COMPONENT__CHILDREN;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__ATTRIBUTES = BOOTSTRAP_COMPONENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Element Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__ELEMENT_ID = BOOTSTRAP_COMPONENT__ELEMENT_ID;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__CLASSES = BOOTSTRAP_COMPONENT__CLASSES;

	/**
	 * The feature id for the '<em><b>Style</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__STYLE = BOOTSTRAP_COMPONENT__STYLE;

	/**
	 * The feature id for the '<em><b>As</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__AS = BOOTSTRAP_COMPONENT__AS;

	/**
	 * The feature id for the '<em><b>As Component</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__AS_COMPONENT = BOOTSTRAP_COMPONENT__AS_COMPONENT;

	/**
	 * The feature id for the '<em><b>Fluid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__FLUID = BOOTSTRAP_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Fluid Until</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__FLUID_UNTIL = BOOTSTRAP_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Rows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__ROWS = BOOTSTRAP_COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_FEATURE_COUNT = BOOTSTRAP_COMPONENT_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER___COLLECT__OBJECT_EREFERENCE_ELIST = BOOTSTRAP_COMPONENT___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER___GET_REFERRERS__EREFERENCE = BOOTSTRAP_COMPONENT___GET_REFERRERS__EREFERENCE;

	/**
	 * The number of operations of the '<em>Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_OPERATION_COUNT = BOOTSTRAP_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.impl.RowImpl <em>Row</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.impl.RowImpl
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.impl.BootstrapPackageImpl#getRow()
	 * @generated
	 */
	int ROW = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW__ID = BOOTSTRAP_COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW__DOCUMENTATION = BOOTSTRAP_COMPONENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW__DOC_REF = BOOTSTRAP_COMPONENT__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW__DOC_FORMAT = BOOTSTRAP_COMPONENT__DOC_FORMAT;

	/**
	 * The feature id for the '<em><b>Doc Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW__DOC_CONTENTS = BOOTSTRAP_COMPONENT__DOC_CONTENTS;

	/**
	 * The feature id for the '<em><b>Doc Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW__DOC_SECTIONS = BOOTSTRAP_COMPONENT__DOC_SECTIONS;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW__MARKERS = BOOTSTRAP_COMPONENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW__ICON = BOOTSTRAP_COMPONENT__ICON;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW__URIS = BOOTSTRAP_COMPONENT__URIS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW__NAME = BOOTSTRAP_COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW__CHILDREN = BOOTSTRAP_COMPONENT__CHILDREN;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW__ATTRIBUTES = BOOTSTRAP_COMPONENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Element Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW__ELEMENT_ID = BOOTSTRAP_COMPONENT__ELEMENT_ID;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW__CLASSES = BOOTSTRAP_COMPONENT__CLASSES;

	/**
	 * The feature id for the '<em><b>Style</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW__STYLE = BOOTSTRAP_COMPONENT__STYLE;

	/**
	 * The feature id for the '<em><b>As</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW__AS = BOOTSTRAP_COMPONENT__AS;

	/**
	 * The feature id for the '<em><b>As Component</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW__AS_COMPONENT = BOOTSTRAP_COMPONENT__AS_COMPONENT;

	/**
	 * The feature id for the '<em><b>Columns Per Row</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW__COLUMNS_PER_ROW = BOOTSTRAP_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Columns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW__COLUMNS = BOOTSTRAP_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Row</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW_FEATURE_COUNT = BOOTSTRAP_COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW___COLLECT__OBJECT_EREFERENCE_ELIST = BOOTSTRAP_COMPONENT___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW___GET_REFERRERS__EREFERENCE = BOOTSTRAP_COMPONENT___GET_REFERRERS__EREFERENCE;

	/**
	 * The number of operations of the '<em>Row</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW_OPERATION_COUNT = BOOTSTRAP_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.impl.ColImpl <em>Col</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.impl.ColImpl
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.impl.BootstrapPackageImpl#getCol()
	 * @generated
	 */
	int COL = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COL__ID = BOOTSTRAP_COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COL__DOCUMENTATION = BOOTSTRAP_COMPONENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COL__DOC_REF = BOOTSTRAP_COMPONENT__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COL__DOC_FORMAT = BOOTSTRAP_COMPONENT__DOC_FORMAT;

	/**
	 * The feature id for the '<em><b>Doc Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COL__DOC_CONTENTS = BOOTSTRAP_COMPONENT__DOC_CONTENTS;

	/**
	 * The feature id for the '<em><b>Doc Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COL__DOC_SECTIONS = BOOTSTRAP_COMPONENT__DOC_SECTIONS;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COL__MARKERS = BOOTSTRAP_COMPONENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COL__ICON = BOOTSTRAP_COMPONENT__ICON;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COL__URIS = BOOTSTRAP_COMPONENT__URIS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COL__NAME = BOOTSTRAP_COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COL__CHILDREN = BOOTSTRAP_COMPONENT__CHILDREN;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COL__ATTRIBUTES = BOOTSTRAP_COMPONENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Element Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COL__ELEMENT_ID = BOOTSTRAP_COMPONENT__ELEMENT_ID;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COL__CLASSES = BOOTSTRAP_COMPONENT__CLASSES;

	/**
	 * The feature id for the '<em><b>Style</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COL__STYLE = BOOTSTRAP_COMPONENT__STYLE;

	/**
	 * The feature id for the '<em><b>As</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COL__AS = BOOTSTRAP_COMPONENT__AS;

	/**
	 * The feature id for the '<em><b>As Component</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COL__AS_COMPONENT = BOOTSTRAP_COMPONENT__AS_COMPONENT;

	/**
	 * The feature id for the '<em><b>Sizes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COL__SIZES = BOOTSTRAP_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Col</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COL_FEATURE_COUNT = BOOTSTRAP_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COL___COLLECT__OBJECT_EREFERENCE_ELIST = BOOTSTRAP_COMPONENT___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COL___GET_REFERRERS__EREFERENCE = BOOTSTRAP_COMPONENT___GET_REFERRERS__EREFERENCE;

	/**
	 * The number of operations of the '<em>Col</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COL_OPERATION_COUNT = BOOTSTRAP_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.impl.StackImpl <em>Stack</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.impl.StackImpl
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.impl.BootstrapPackageImpl#getStack()
	 * @generated
	 */
	int STACK = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STACK__ID = BOOTSTRAP_COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STACK__DOCUMENTATION = BOOTSTRAP_COMPONENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STACK__DOC_REF = BOOTSTRAP_COMPONENT__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STACK__DOC_FORMAT = BOOTSTRAP_COMPONENT__DOC_FORMAT;

	/**
	 * The feature id for the '<em><b>Doc Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STACK__DOC_CONTENTS = BOOTSTRAP_COMPONENT__DOC_CONTENTS;

	/**
	 * The feature id for the '<em><b>Doc Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STACK__DOC_SECTIONS = BOOTSTRAP_COMPONENT__DOC_SECTIONS;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STACK__MARKERS = BOOTSTRAP_COMPONENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STACK__ICON = BOOTSTRAP_COMPONENT__ICON;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STACK__URIS = BOOTSTRAP_COMPONENT__URIS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STACK__NAME = BOOTSTRAP_COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STACK__CHILDREN = BOOTSTRAP_COMPONENT__CHILDREN;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STACK__ATTRIBUTES = BOOTSTRAP_COMPONENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Element Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STACK__ELEMENT_ID = BOOTSTRAP_COMPONENT__ELEMENT_ID;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STACK__CLASSES = BOOTSTRAP_COMPONENT__CLASSES;

	/**
	 * The feature id for the '<em><b>Style</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STACK__STYLE = BOOTSTRAP_COMPONENT__STYLE;

	/**
	 * The feature id for the '<em><b>As</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STACK__AS = BOOTSTRAP_COMPONENT__AS;

	/**
	 * The feature id for the '<em><b>As Component</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STACK__AS_COMPONENT = BOOTSTRAP_COMPONENT__AS_COMPONENT;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STACK__DIRECTION = BOOTSTRAP_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Gap</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STACK__GAP = BOOTSTRAP_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Stack</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STACK_FEATURE_COUNT = BOOTSTRAP_COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STACK___COLLECT__OBJECT_EREFERENCE_ELIST = BOOTSTRAP_COMPONENT___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STACK___GET_REFERRERS__EREFERENCE = BOOTSTRAP_COMPONENT___GET_REFERRERS__EREFERENCE;

	/**
	 * The number of operations of the '<em>Stack</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STACK_OPERATION_COUNT = BOOTSTRAP_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.impl.RatioImpl <em>Ratio</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.impl.RatioImpl
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.impl.BootstrapPackageImpl#getRatio()
	 * @generated
	 */
	int RATIO = 9;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIO__ID = BOOTSTRAP_COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIO__DOCUMENTATION = BOOTSTRAP_COMPONENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIO__DOC_REF = BOOTSTRAP_COMPONENT__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIO__DOC_FORMAT = BOOTSTRAP_COMPONENT__DOC_FORMAT;

	/**
	 * The feature id for the '<em><b>Doc Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIO__DOC_CONTENTS = BOOTSTRAP_COMPONENT__DOC_CONTENTS;

	/**
	 * The feature id for the '<em><b>Doc Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIO__DOC_SECTIONS = BOOTSTRAP_COMPONENT__DOC_SECTIONS;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIO__MARKERS = BOOTSTRAP_COMPONENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIO__ICON = BOOTSTRAP_COMPONENT__ICON;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIO__URIS = BOOTSTRAP_COMPONENT__URIS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIO__NAME = BOOTSTRAP_COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIO__CHILDREN = BOOTSTRAP_COMPONENT__CHILDREN;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIO__ATTRIBUTES = BOOTSTRAP_COMPONENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Element Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIO__ELEMENT_ID = BOOTSTRAP_COMPONENT__ELEMENT_ID;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIO__CLASSES = BOOTSTRAP_COMPONENT__CLASSES;

	/**
	 * The feature id for the '<em><b>Style</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIO__STYLE = BOOTSTRAP_COMPONENT__STYLE;

	/**
	 * The feature id for the '<em><b>As</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIO__AS = BOOTSTRAP_COMPONENT__AS;

	/**
	 * The feature id for the '<em><b>As Component</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIO__AS_COMPONENT = BOOTSTRAP_COMPONENT__AS_COMPONENT;

	/**
	 * The feature id for the '<em><b>Aspect Ratio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIO__ASPECT_RATIO = BOOTSTRAP_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ratio</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIO_FEATURE_COUNT = BOOTSTRAP_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIO___COLLECT__OBJECT_EREFERENCE_ELIST = BOOTSTRAP_COMPONENT___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIO___GET_REFERRERS__EREFERENCE = BOOTSTRAP_COMPONENT___GET_REFERRERS__EREFERENCE;

	/**
	 * The number of operations of the '<em>Ratio</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIO_OPERATION_COUNT = BOOTSTRAP_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.impl.ImageImpl <em>Image</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.impl.ImageImpl
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.impl.BootstrapPackageImpl#getImage()
	 * @generated
	 */
	int IMAGE = 10;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__ID = BOOTSTRAP_COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__DOCUMENTATION = BOOTSTRAP_COMPONENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__DOC_REF = BOOTSTRAP_COMPONENT__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__DOC_FORMAT = BOOTSTRAP_COMPONENT__DOC_FORMAT;

	/**
	 * The feature id for the '<em><b>Doc Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__DOC_CONTENTS = BOOTSTRAP_COMPONENT__DOC_CONTENTS;

	/**
	 * The feature id for the '<em><b>Doc Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__DOC_SECTIONS = BOOTSTRAP_COMPONENT__DOC_SECTIONS;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__MARKERS = BOOTSTRAP_COMPONENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__ICON = BOOTSTRAP_COMPONENT__ICON;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__URIS = BOOTSTRAP_COMPONENT__URIS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__NAME = BOOTSTRAP_COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__CHILDREN = BOOTSTRAP_COMPONENT__CHILDREN;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__ATTRIBUTES = BOOTSTRAP_COMPONENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Element Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__ELEMENT_ID = BOOTSTRAP_COMPONENT__ELEMENT_ID;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__CLASSES = BOOTSTRAP_COMPONENT__CLASSES;

	/**
	 * The feature id for the '<em><b>Style</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__STYLE = BOOTSTRAP_COMPONENT__STYLE;

	/**
	 * The feature id for the '<em><b>As</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__AS = BOOTSTRAP_COMPONENT__AS;

	/**
	 * The feature id for the '<em><b>As Component</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__AS_COMPONENT = BOOTSTRAP_COMPONENT__AS_COMPONENT;

	/**
	 * The feature id for the '<em><b>Src</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__SRC = BOOTSTRAP_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Alt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__ALT = BOOTSTRAP_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Fluid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__FLUID = BOOTSTRAP_COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Rounded</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__ROUNDED = BOOTSTRAP_COMPONENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Rounded Circle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__ROUNDED_CIRCLE = BOOTSTRAP_COMPONENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Thumbnail</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__THUMBNAIL = BOOTSTRAP_COMPONENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Image</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_FEATURE_COUNT = BOOTSTRAP_COMPONENT_FEATURE_COUNT + 6;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE___COLLECT__OBJECT_EREFERENCE_ELIST = BOOTSTRAP_COMPONENT___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE___GET_REFERRERS__EREFERENCE = BOOTSTRAP_COMPONENT___GET_REFERRERS__EREFERENCE;

	/**
	 * The number of operations of the '<em>Image</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_OPERATION_COUNT = BOOTSTRAP_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.impl.FigureImpl <em>Figure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.impl.FigureImpl
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.impl.BootstrapPackageImpl#getFigure()
	 * @generated
	 */
	int FIGURE = 11;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIGURE__ID = BOOTSTRAP_COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIGURE__DOCUMENTATION = BOOTSTRAP_COMPONENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIGURE__DOC_REF = BOOTSTRAP_COMPONENT__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIGURE__DOC_FORMAT = BOOTSTRAP_COMPONENT__DOC_FORMAT;

	/**
	 * The feature id for the '<em><b>Doc Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIGURE__DOC_CONTENTS = BOOTSTRAP_COMPONENT__DOC_CONTENTS;

	/**
	 * The feature id for the '<em><b>Doc Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIGURE__DOC_SECTIONS = BOOTSTRAP_COMPONENT__DOC_SECTIONS;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIGURE__MARKERS = BOOTSTRAP_COMPONENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIGURE__ICON = BOOTSTRAP_COMPONENT__ICON;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIGURE__URIS = BOOTSTRAP_COMPONENT__URIS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIGURE__NAME = BOOTSTRAP_COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIGURE__CHILDREN = BOOTSTRAP_COMPONENT__CHILDREN;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIGURE__ATTRIBUTES = BOOTSTRAP_COMPONENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Element Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIGURE__ELEMENT_ID = BOOTSTRAP_COMPONENT__ELEMENT_ID;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIGURE__CLASSES = BOOTSTRAP_COMPONENT__CLASSES;

	/**
	 * The feature id for the '<em><b>Style</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIGURE__STYLE = BOOTSTRAP_COMPONENT__STYLE;

	/**
	 * The feature id for the '<em><b>As</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIGURE__AS = BOOTSTRAP_COMPONENT__AS;

	/**
	 * The feature id for the '<em><b>As Component</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIGURE__AS_COMPONENT = BOOTSTRAP_COMPONENT__AS_COMPONENT;

	/**
	 * The feature id for the '<em><b>Image</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIGURE__IMAGE = BOOTSTRAP_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Caption</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIGURE__CAPTION = BOOTSTRAP_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Figure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIGURE_FEATURE_COUNT = BOOTSTRAP_COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIGURE___COLLECT__OBJECT_EREFERENCE_ELIST = BOOTSTRAP_COMPONENT___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIGURE___GET_REFERRERS__EREFERENCE = BOOTSTRAP_COMPONENT___GET_REFERRERS__EREFERENCE;

	/**
	 * The number of operations of the '<em>Figure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIGURE_OPERATION_COUNT = BOOTSTRAP_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.impl.FigureImageImpl <em>Figure Image</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.impl.FigureImageImpl
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.impl.BootstrapPackageImpl#getFigureImage()
	 * @generated
	 */
	int FIGURE_IMAGE = 12;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIGURE_IMAGE__ID = IMAGE__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIGURE_IMAGE__DOCUMENTATION = IMAGE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIGURE_IMAGE__DOC_REF = IMAGE__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIGURE_IMAGE__DOC_FORMAT = IMAGE__DOC_FORMAT;

	/**
	 * The feature id for the '<em><b>Doc Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIGURE_IMAGE__DOC_CONTENTS = IMAGE__DOC_CONTENTS;

	/**
	 * The feature id for the '<em><b>Doc Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIGURE_IMAGE__DOC_SECTIONS = IMAGE__DOC_SECTIONS;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIGURE_IMAGE__MARKERS = IMAGE__MARKERS;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIGURE_IMAGE__ICON = IMAGE__ICON;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIGURE_IMAGE__URIS = IMAGE__URIS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIGURE_IMAGE__NAME = IMAGE__NAME;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIGURE_IMAGE__CHILDREN = IMAGE__CHILDREN;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIGURE_IMAGE__ATTRIBUTES = IMAGE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Element Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIGURE_IMAGE__ELEMENT_ID = IMAGE__ELEMENT_ID;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIGURE_IMAGE__CLASSES = IMAGE__CLASSES;

	/**
	 * The feature id for the '<em><b>Style</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIGURE_IMAGE__STYLE = IMAGE__STYLE;

	/**
	 * The feature id for the '<em><b>As</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIGURE_IMAGE__AS = IMAGE__AS;

	/**
	 * The feature id for the '<em><b>As Component</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIGURE_IMAGE__AS_COMPONENT = IMAGE__AS_COMPONENT;

	/**
	 * The feature id for the '<em><b>Src</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIGURE_IMAGE__SRC = IMAGE__SRC;

	/**
	 * The feature id for the '<em><b>Alt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIGURE_IMAGE__ALT = IMAGE__ALT;

	/**
	 * The feature id for the '<em><b>Fluid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIGURE_IMAGE__FLUID = IMAGE__FLUID;

	/**
	 * The feature id for the '<em><b>Rounded</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIGURE_IMAGE__ROUNDED = IMAGE__ROUNDED;

	/**
	 * The feature id for the '<em><b>Rounded Circle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIGURE_IMAGE__ROUNDED_CIRCLE = IMAGE__ROUNDED_CIRCLE;

	/**
	 * The feature id for the '<em><b>Thumbnail</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIGURE_IMAGE__THUMBNAIL = IMAGE__THUMBNAIL;

	/**
	 * The number of structural features of the '<em>Figure Image</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIGURE_IMAGE_FEATURE_COUNT = IMAGE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIGURE_IMAGE___COLLECT__OBJECT_EREFERENCE_ELIST = IMAGE___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIGURE_IMAGE___GET_REFERRERS__EREFERENCE = IMAGE___GET_REFERRERS__EREFERENCE;

	/**
	 * The number of operations of the '<em>Figure Image</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIGURE_IMAGE_OPERATION_COUNT = IMAGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.impl.FigureCaptionImpl <em>Figure Caption</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.impl.FigureCaptionImpl
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.impl.BootstrapPackageImpl#getFigureCaption()
	 * @generated
	 */
	int FIGURE_CAPTION = 13;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIGURE_CAPTION__ID = BOOTSTRAP_COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIGURE_CAPTION__DOCUMENTATION = BOOTSTRAP_COMPONENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIGURE_CAPTION__DOC_REF = BOOTSTRAP_COMPONENT__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIGURE_CAPTION__DOC_FORMAT = BOOTSTRAP_COMPONENT__DOC_FORMAT;

	/**
	 * The feature id for the '<em><b>Doc Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIGURE_CAPTION__DOC_CONTENTS = BOOTSTRAP_COMPONENT__DOC_CONTENTS;

	/**
	 * The feature id for the '<em><b>Doc Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIGURE_CAPTION__DOC_SECTIONS = BOOTSTRAP_COMPONENT__DOC_SECTIONS;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIGURE_CAPTION__MARKERS = BOOTSTRAP_COMPONENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIGURE_CAPTION__ICON = BOOTSTRAP_COMPONENT__ICON;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIGURE_CAPTION__URIS = BOOTSTRAP_COMPONENT__URIS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIGURE_CAPTION__NAME = BOOTSTRAP_COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIGURE_CAPTION__CHILDREN = BOOTSTRAP_COMPONENT__CHILDREN;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIGURE_CAPTION__ATTRIBUTES = BOOTSTRAP_COMPONENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Element Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIGURE_CAPTION__ELEMENT_ID = BOOTSTRAP_COMPONENT__ELEMENT_ID;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIGURE_CAPTION__CLASSES = BOOTSTRAP_COMPONENT__CLASSES;

	/**
	 * The feature id for the '<em><b>Style</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIGURE_CAPTION__STYLE = BOOTSTRAP_COMPONENT__STYLE;

	/**
	 * The feature id for the '<em><b>As</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIGURE_CAPTION__AS = BOOTSTRAP_COMPONENT__AS;

	/**
	 * The feature id for the '<em><b>As Component</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIGURE_CAPTION__AS_COMPONENT = BOOTSTRAP_COMPONENT__AS_COMPONENT;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIGURE_CAPTION__CONTENT = BOOTSTRAP_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Figure Caption</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIGURE_CAPTION_FEATURE_COUNT = BOOTSTRAP_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIGURE_CAPTION___COLLECT__OBJECT_EREFERENCE_ELIST = BOOTSTRAP_COMPONENT___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIGURE_CAPTION___GET_REFERRERS__EREFERENCE = BOOTSTRAP_COMPONENT___GET_REFERRERS__EREFERENCE;

	/**
	 * The number of operations of the '<em>Figure Caption</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIGURE_CAPTION_OPERATION_COUNT = BOOTSTRAP_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.Variant <em>Variant</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.Variant
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.impl.BootstrapPackageImpl#getVariant()
	 * @generated
	 */
	int VARIANT = 14;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.ButtonVariant <em>Button Variant</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.ButtonVariant
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.impl.BootstrapPackageImpl#getButtonVariant()
	 * @generated
	 */
	int BUTTON_VARIANT = 15;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.Size <em>Size</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.Size
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.impl.BootstrapPackageImpl#getSize()
	 * @generated
	 */
	int SIZE = 16;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.Breakpoint <em>Breakpoint</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.Breakpoint
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.impl.BootstrapPackageImpl#getBreakpoint()
	 * @generated
	 */
	int BREAKPOINT = 17;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.Direction <em>Direction</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.Direction
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.impl.BootstrapPackageImpl#getDirection()
	 * @generated
	 */
	int DIRECTION = 18;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.AspectRatio <em>Aspect Ratio</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.AspectRatio
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.impl.BootstrapPackageImpl#getAspectRatio()
	 * @generated
	 */
	int ASPECT_RATIO = 19;


	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.BootstrapComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.BootstrapComponent
	 * @generated
	 */
	EClass getBootstrapComponent();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.BootstrapComponent#getElementId <em>Element Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Element Id</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.BootstrapComponent#getElementId()
	 * @see #getBootstrapComponent()
	 * @generated
	 */
	EAttribute getBootstrapComponent_ElementId();

	/**
	 * Returns the meta object for the attribute list '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.BootstrapComponent#getClasses <em>Classes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Classes</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.BootstrapComponent#getClasses()
	 * @see #getBootstrapComponent()
	 * @generated
	 */
	EAttribute getBootstrapComponent_Classes();

	/**
	 * Returns the meta object for the map '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.BootstrapComponent#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Style</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.BootstrapComponent#getStyle()
	 * @see #getBootstrapComponent()
	 * @generated
	 */
	EReference getBootstrapComponent_Style();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.BootstrapComponent#getAs <em>As</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>As</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.BootstrapComponent#getAs()
	 * @see #getBootstrapComponent()
	 * @generated
	 */
	EAttribute getBootstrapComponent_As();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.BootstrapComponent#getAsComponent <em>As Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>As Component</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.BootstrapComponent#getAsComponent()
	 * @see #getBootstrapComponent()
	 * @generated
	 */
	EReference getBootstrapComponent_AsComponent();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.TextContent <em>Text Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text Content</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.TextContent
	 * @generated
	 */
	EClass getTextContent();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.TextContent#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.TextContent#getContent()
	 * @see #getTextContent()
	 * @generated
	 */
	EAttribute getTextContent_Content();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.ColumnSize <em>Column Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Column Size</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.ColumnSize
	 * @generated
	 */
	EClass getColumnSize();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.ColumnSize#getBreakpoint <em>Breakpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Breakpoint</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.ColumnSize#getBreakpoint()
	 * @see #getColumnSize()
	 * @generated
	 */
	EAttribute getColumnSize_Breakpoint();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.ColumnSize#getSpan <em>Span</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Span</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.ColumnSize#getSpan()
	 * @see #getColumnSize()
	 * @generated
	 */
	EAttribute getColumnSize_Span();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.ColumnSize#isAuto <em>Auto</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Auto</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.ColumnSize#isAuto()
	 * @see #getColumnSize()
	 * @generated
	 */
	EAttribute getColumnSize_Auto();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.ColumnSize#getOffset <em>Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Offset</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.ColumnSize#getOffset()
	 * @see #getColumnSize()
	 * @generated
	 */
	EAttribute getColumnSize_Offset();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.ColumnSize#getOrder <em>Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Order</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.ColumnSize#getOrder()
	 * @see #getColumnSize()
	 * @generated
	 */
	EAttribute getColumnSize_Order();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.RowColumns <em>Row Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Row Columns</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.RowColumns
	 * @generated
	 */
	EClass getRowColumns();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.RowColumns#getBreakpoint <em>Breakpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Breakpoint</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.RowColumns#getBreakpoint()
	 * @see #getRowColumns()
	 * @generated
	 */
	EAttribute getRowColumns_Breakpoint();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.RowColumns#getCount <em>Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Count</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.RowColumns#getCount()
	 * @see #getRowColumns()
	 * @generated
	 */
	EAttribute getRowColumns_Count();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.RowColumns#isAuto <em>Auto</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Auto</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.RowColumns#isAuto()
	 * @see #getRowColumns()
	 * @generated
	 */
	EAttribute getRowColumns_Auto();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.ThemeProvider <em>Theme Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Theme Provider</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.ThemeProvider
	 * @generated
	 */
	EClass getThemeProvider();

	/**
	 * Returns the meta object for the attribute list '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.ThemeProvider#getBreakpoints <em>Breakpoints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Breakpoints</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.ThemeProvider#getBreakpoints()
	 * @see #getThemeProvider()
	 * @generated
	 */
	EAttribute getThemeProvider_Breakpoints();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.ThemeProvider#getMinBreakpoint <em>Min Breakpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Breakpoint</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.ThemeProvider#getMinBreakpoint()
	 * @see #getThemeProvider()
	 * @generated
	 */
	EAttribute getThemeProvider_MinBreakpoint();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.ThemeProvider#getDir <em>Dir</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dir</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.ThemeProvider#getDir()
	 * @see #getThemeProvider()
	 * @generated
	 */
	EAttribute getThemeProvider_Dir();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.Container <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Container</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.Container
	 * @generated
	 */
	EClass getContainer();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.Container#isFluid <em>Fluid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fluid</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.Container#isFluid()
	 * @see #getContainer()
	 * @generated
	 */
	EAttribute getContainer_Fluid();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.Container#getFluidUntil <em>Fluid Until</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fluid Until</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.Container#getFluidUntil()
	 * @see #getContainer()
	 * @generated
	 */
	EAttribute getContainer_FluidUntil();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.Container#getRows <em>Rows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rows</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.Container#getRows()
	 * @see #getContainer()
	 * @generated
	 */
	EReference getContainer_Rows();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.Row <em>Row</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Row</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.Row
	 * @generated
	 */
	EClass getRow();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.Row#getColumnsPerRow <em>Columns Per Row</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Columns Per Row</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.Row#getColumnsPerRow()
	 * @see #getRow()
	 * @generated
	 */
	EReference getRow_ColumnsPerRow();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.Row#getColumns <em>Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Columns</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.Row#getColumns()
	 * @see #getRow()
	 * @generated
	 */
	EReference getRow_Columns();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.Col <em>Col</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Col</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.Col
	 * @generated
	 */
	EClass getCol();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.Col#getSizes <em>Sizes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sizes</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.Col#getSizes()
	 * @see #getCol()
	 * @generated
	 */
	EReference getCol_Sizes();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.Stack <em>Stack</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stack</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.Stack
	 * @generated
	 */
	EClass getStack();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.Stack#getDirection <em>Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Direction</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.Stack#getDirection()
	 * @see #getStack()
	 * @generated
	 */
	EAttribute getStack_Direction();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.Stack#getGap <em>Gap</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gap</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.Stack#getGap()
	 * @see #getStack()
	 * @generated
	 */
	EAttribute getStack_Gap();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.Ratio <em>Ratio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ratio</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.Ratio
	 * @generated
	 */
	EClass getRatio();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.Ratio#getAspectRatio <em>Aspect Ratio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Aspect Ratio</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.Ratio#getAspectRatio()
	 * @see #getRatio()
	 * @generated
	 */
	EAttribute getRatio_AspectRatio();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.Image <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Image</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.Image
	 * @generated
	 */
	EClass getImage();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.Image#getSrc <em>Src</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Src</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.Image#getSrc()
	 * @see #getImage()
	 * @generated
	 */
	EAttribute getImage_Src();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.Image#getAlt <em>Alt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alt</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.Image#getAlt()
	 * @see #getImage()
	 * @generated
	 */
	EAttribute getImage_Alt();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.Image#isFluid <em>Fluid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fluid</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.Image#isFluid()
	 * @see #getImage()
	 * @generated
	 */
	EAttribute getImage_Fluid();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.Image#isRounded <em>Rounded</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rounded</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.Image#isRounded()
	 * @see #getImage()
	 * @generated
	 */
	EAttribute getImage_Rounded();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.Image#isRoundedCircle <em>Rounded Circle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rounded Circle</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.Image#isRoundedCircle()
	 * @see #getImage()
	 * @generated
	 */
	EAttribute getImage_RoundedCircle();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.Image#isThumbnail <em>Thumbnail</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Thumbnail</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.Image#isThumbnail()
	 * @see #getImage()
	 * @generated
	 */
	EAttribute getImage_Thumbnail();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.Figure <em>Figure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Figure</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.Figure
	 * @generated
	 */
	EClass getFigure();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.Figure#getImage <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Image</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.Figure#getImage()
	 * @see #getFigure()
	 * @generated
	 */
	EReference getFigure_Image();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.Figure#getCaption <em>Caption</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Caption</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.Figure#getCaption()
	 * @see #getFigure()
	 * @generated
	 */
	EReference getFigure_Caption();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.FigureImage <em>Figure Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Figure Image</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.FigureImage
	 * @generated
	 */
	EClass getFigureImage();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.FigureCaption <em>Figure Caption</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Figure Caption</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.FigureCaption
	 * @generated
	 */
	EClass getFigureCaption();

	/**
	 * Returns the meta object for enum '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.Variant <em>Variant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Variant</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.Variant
	 * @generated
	 */
	EEnum getVariant();

	/**
	 * Returns the meta object for enum '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.ButtonVariant <em>Button Variant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Button Variant</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.ButtonVariant
	 * @generated
	 */
	EEnum getButtonVariant();

	/**
	 * Returns the meta object for enum '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.Size <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Size</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.Size
	 * @generated
	 */
	EEnum getSize();

	/**
	 * Returns the meta object for enum '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.Breakpoint <em>Breakpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Breakpoint</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.Breakpoint
	 * @generated
	 */
	EEnum getBreakpoint();

	/**
	 * Returns the meta object for enum '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.Direction <em>Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Direction</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.Direction
	 * @generated
	 */
	EEnum getDirection();

	/**
	 * Returns the meta object for enum '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.AspectRatio <em>Aspect Ratio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Aspect Ratio</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.AspectRatio
	 * @generated
	 */
	EEnum getAspectRatio();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	BootstrapFactory getBootstrapFactory();

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
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.impl.BootstrapComponentImpl <em>Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.impl.BootstrapComponentImpl
		 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.impl.BootstrapPackageImpl#getBootstrapComponent()
		 * @generated
		 */
		EClass BOOTSTRAP_COMPONENT = eINSTANCE.getBootstrapComponent();

		/**
		 * The meta object literal for the '<em><b>Element Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOTSTRAP_COMPONENT__ELEMENT_ID = eINSTANCE.getBootstrapComponent_ElementId();

		/**
		 * The meta object literal for the '<em><b>Classes</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOTSTRAP_COMPONENT__CLASSES = eINSTANCE.getBootstrapComponent_Classes();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOTSTRAP_COMPONENT__STYLE = eINSTANCE.getBootstrapComponent_Style();

		/**
		 * The meta object literal for the '<em><b>As</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOTSTRAP_COMPONENT__AS = eINSTANCE.getBootstrapComponent_As();

		/**
		 * The meta object literal for the '<em><b>As Component</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOTSTRAP_COMPONENT__AS_COMPONENT = eINSTANCE.getBootstrapComponent_AsComponent();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.TextContent <em>Text Content</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.TextContent
		 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.impl.BootstrapPackageImpl#getTextContent()
		 * @generated
		 */
		EClass TEXT_CONTENT = eINSTANCE.getTextContent();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_CONTENT__CONTENT = eINSTANCE.getTextContent_Content();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.impl.ColumnSizeImpl <em>Column Size</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.impl.ColumnSizeImpl
		 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.impl.BootstrapPackageImpl#getColumnSize()
		 * @generated
		 */
		EClass COLUMN_SIZE = eINSTANCE.getColumnSize();

		/**
		 * The meta object literal for the '<em><b>Breakpoint</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLUMN_SIZE__BREAKPOINT = eINSTANCE.getColumnSize_Breakpoint();

		/**
		 * The meta object literal for the '<em><b>Span</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLUMN_SIZE__SPAN = eINSTANCE.getColumnSize_Span();

		/**
		 * The meta object literal for the '<em><b>Auto</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLUMN_SIZE__AUTO = eINSTANCE.getColumnSize_Auto();

		/**
		 * The meta object literal for the '<em><b>Offset</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLUMN_SIZE__OFFSET = eINSTANCE.getColumnSize_Offset();

		/**
		 * The meta object literal for the '<em><b>Order</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLUMN_SIZE__ORDER = eINSTANCE.getColumnSize_Order();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.impl.RowColumnsImpl <em>Row Columns</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.impl.RowColumnsImpl
		 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.impl.BootstrapPackageImpl#getRowColumns()
		 * @generated
		 */
		EClass ROW_COLUMNS = eINSTANCE.getRowColumns();

		/**
		 * The meta object literal for the '<em><b>Breakpoint</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROW_COLUMNS__BREAKPOINT = eINSTANCE.getRowColumns_Breakpoint();

		/**
		 * The meta object literal for the '<em><b>Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROW_COLUMNS__COUNT = eINSTANCE.getRowColumns_Count();

		/**
		 * The meta object literal for the '<em><b>Auto</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROW_COLUMNS__AUTO = eINSTANCE.getRowColumns_Auto();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.impl.ThemeProviderImpl <em>Theme Provider</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.impl.ThemeProviderImpl
		 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.impl.BootstrapPackageImpl#getThemeProvider()
		 * @generated
		 */
		EClass THEME_PROVIDER = eINSTANCE.getThemeProvider();

		/**
		 * The meta object literal for the '<em><b>Breakpoints</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THEME_PROVIDER__BREAKPOINTS = eINSTANCE.getThemeProvider_Breakpoints();

		/**
		 * The meta object literal for the '<em><b>Min Breakpoint</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THEME_PROVIDER__MIN_BREAKPOINT = eINSTANCE.getThemeProvider_MinBreakpoint();

		/**
		 * The meta object literal for the '<em><b>Dir</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THEME_PROVIDER__DIR = eINSTANCE.getThemeProvider_Dir();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.impl.ContainerImpl <em>Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.impl.ContainerImpl
		 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.impl.BootstrapPackageImpl#getContainer()
		 * @generated
		 */
		EClass CONTAINER = eINSTANCE.getContainer();

		/**
		 * The meta object literal for the '<em><b>Fluid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER__FLUID = eINSTANCE.getContainer_Fluid();

		/**
		 * The meta object literal for the '<em><b>Fluid Until</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER__FLUID_UNTIL = eINSTANCE.getContainer_FluidUntil();

		/**
		 * The meta object literal for the '<em><b>Rows</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINER__ROWS = eINSTANCE.getContainer_Rows();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.impl.RowImpl <em>Row</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.impl.RowImpl
		 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.impl.BootstrapPackageImpl#getRow()
		 * @generated
		 */
		EClass ROW = eINSTANCE.getRow();

		/**
		 * The meta object literal for the '<em><b>Columns Per Row</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROW__COLUMNS_PER_ROW = eINSTANCE.getRow_ColumnsPerRow();

		/**
		 * The meta object literal for the '<em><b>Columns</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROW__COLUMNS = eINSTANCE.getRow_Columns();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.impl.ColImpl <em>Col</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.impl.ColImpl
		 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.impl.BootstrapPackageImpl#getCol()
		 * @generated
		 */
		EClass COL = eINSTANCE.getCol();

		/**
		 * The meta object literal for the '<em><b>Sizes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COL__SIZES = eINSTANCE.getCol_Sizes();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.impl.StackImpl <em>Stack</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.impl.StackImpl
		 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.impl.BootstrapPackageImpl#getStack()
		 * @generated
		 */
		EClass STACK = eINSTANCE.getStack();

		/**
		 * The meta object literal for the '<em><b>Direction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STACK__DIRECTION = eINSTANCE.getStack_Direction();

		/**
		 * The meta object literal for the '<em><b>Gap</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STACK__GAP = eINSTANCE.getStack_Gap();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.impl.RatioImpl <em>Ratio</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.impl.RatioImpl
		 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.impl.BootstrapPackageImpl#getRatio()
		 * @generated
		 */
		EClass RATIO = eINSTANCE.getRatio();

		/**
		 * The meta object literal for the '<em><b>Aspect Ratio</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RATIO__ASPECT_RATIO = eINSTANCE.getRatio_AspectRatio();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.impl.ImageImpl <em>Image</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.impl.ImageImpl
		 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.impl.BootstrapPackageImpl#getImage()
		 * @generated
		 */
		EClass IMAGE = eINSTANCE.getImage();

		/**
		 * The meta object literal for the '<em><b>Src</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMAGE__SRC = eINSTANCE.getImage_Src();

		/**
		 * The meta object literal for the '<em><b>Alt</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMAGE__ALT = eINSTANCE.getImage_Alt();

		/**
		 * The meta object literal for the '<em><b>Fluid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMAGE__FLUID = eINSTANCE.getImage_Fluid();

		/**
		 * The meta object literal for the '<em><b>Rounded</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMAGE__ROUNDED = eINSTANCE.getImage_Rounded();

		/**
		 * The meta object literal for the '<em><b>Rounded Circle</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMAGE__ROUNDED_CIRCLE = eINSTANCE.getImage_RoundedCircle();

		/**
		 * The meta object literal for the '<em><b>Thumbnail</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMAGE__THUMBNAIL = eINSTANCE.getImage_Thumbnail();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.impl.FigureImpl <em>Figure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.impl.FigureImpl
		 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.impl.BootstrapPackageImpl#getFigure()
		 * @generated
		 */
		EClass FIGURE = eINSTANCE.getFigure();

		/**
		 * The meta object literal for the '<em><b>Image</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIGURE__IMAGE = eINSTANCE.getFigure_Image();

		/**
		 * The meta object literal for the '<em><b>Caption</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIGURE__CAPTION = eINSTANCE.getFigure_Caption();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.impl.FigureImageImpl <em>Figure Image</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.impl.FigureImageImpl
		 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.impl.BootstrapPackageImpl#getFigureImage()
		 * @generated
		 */
		EClass FIGURE_IMAGE = eINSTANCE.getFigureImage();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.impl.FigureCaptionImpl <em>Figure Caption</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.impl.FigureCaptionImpl
		 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.impl.BootstrapPackageImpl#getFigureCaption()
		 * @generated
		 */
		EClass FIGURE_CAPTION = eINSTANCE.getFigureCaption();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.Variant <em>Variant</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.Variant
		 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.impl.BootstrapPackageImpl#getVariant()
		 * @generated
		 */
		EEnum VARIANT = eINSTANCE.getVariant();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.ButtonVariant <em>Button Variant</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.ButtonVariant
		 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.impl.BootstrapPackageImpl#getButtonVariant()
		 * @generated
		 */
		EEnum BUTTON_VARIANT = eINSTANCE.getButtonVariant();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.Size <em>Size</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.Size
		 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.impl.BootstrapPackageImpl#getSize()
		 * @generated
		 */
		EEnum SIZE = eINSTANCE.getSize();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.Breakpoint <em>Breakpoint</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.Breakpoint
		 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.impl.BootstrapPackageImpl#getBreakpoint()
		 * @generated
		 */
		EEnum BREAKPOINT = eINSTANCE.getBreakpoint();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.Direction <em>Direction</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.Direction
		 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.impl.BootstrapPackageImpl#getDirection()
		 * @generated
		 */
		EEnum DIRECTION = eINSTANCE.getDirection();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.AspectRatio <em>Aspect Ratio</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.AspectRatio
		 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.impl.BootstrapPackageImpl#getAspectRatio()
		 * @generated
		 */
		EEnum ASPECT_RATIO = eINSTANCE.getAspectRatio();

	}

} //BootstrapPackage
