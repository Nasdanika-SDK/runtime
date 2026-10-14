/**
 */
package org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.nasdanika.sdk.runtime.models.react.bootstrap.BootstrapPackage;

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
 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.NavigationFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel modelDirectory='/bootstrap/src-gen' featureDelegation='Dynamic' complianceLevel='25' suppressGenModelAnnotations='false' copyrightFields='false' operationReflection='true' importOrganizing='true' basePackage='org.nasdanika.sdk.runtime.models.react.bootstrap.components'"
 *        annotation="http://www.eclipse.org/emf/2011/Xcore Ecore='http://www.eclipse.org/emf/2002/Ecore' GenModel='http://www.eclipse.org/emf/2002/GenModel' React='urn:org.nasdanika:react'"
 * @generated
 */
public interface NavigationPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "navigation";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "https://runtime.sdk.nasdanika.org/models/react/bootstrap/components/navigation";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	NavigationPackage eINSTANCE = org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.impl.NavigationPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.NavEntry <em>Nav Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.NavEntry
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.impl.NavigationPackageImpl#getNavEntry()
	 * @generated
	 */
	int NAV_ENTRY = 0;

	/**
	 * The number of structural features of the '<em>Nav Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAV_ENTRY_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Nav Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAV_ENTRY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.impl.NavImpl <em>Nav</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.impl.NavImpl
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.impl.NavigationPackageImpl#getNav()
	 * @generated
	 */
	int NAV = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAV__ID = BootstrapPackage.BOOTSTRAP_COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAV__DOCUMENTATION = BootstrapPackage.BOOTSTRAP_COMPONENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAV__DOC_REF = BootstrapPackage.BOOTSTRAP_COMPONENT__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAV__DOC_FORMAT = BootstrapPackage.BOOTSTRAP_COMPONENT__DOC_FORMAT;

	/**
	 * The feature id for the '<em><b>Doc Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAV__DOC_CONTENTS = BootstrapPackage.BOOTSTRAP_COMPONENT__DOC_CONTENTS;

	/**
	 * The feature id for the '<em><b>Doc Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAV__DOC_SECTIONS = BootstrapPackage.BOOTSTRAP_COMPONENT__DOC_SECTIONS;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAV__MARKERS = BootstrapPackage.BOOTSTRAP_COMPONENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAV__ICON = BootstrapPackage.BOOTSTRAP_COMPONENT__ICON;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAV__URIS = BootstrapPackage.BOOTSTRAP_COMPONENT__URIS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAV__NAME = BootstrapPackage.BOOTSTRAP_COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAV__CHILDREN = BootstrapPackage.BOOTSTRAP_COMPONENT__CHILDREN;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAV__ATTRIBUTES = BootstrapPackage.BOOTSTRAP_COMPONENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Element Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAV__ELEMENT_ID = BootstrapPackage.BOOTSTRAP_COMPONENT__ELEMENT_ID;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAV__CLASSES = BootstrapPackage.BOOTSTRAP_COMPONENT__CLASSES;

	/**
	 * The feature id for the '<em><b>Style</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAV__STYLE = BootstrapPackage.BOOTSTRAP_COMPONENT__STYLE;

	/**
	 * The feature id for the '<em><b>As</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAV__AS = BootstrapPackage.BOOTSTRAP_COMPONENT__AS;

	/**
	 * The feature id for the '<em><b>As Component</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAV__AS_COMPONENT = BootstrapPackage.BOOTSTRAP_COMPONENT__AS_COMPONENT;

	/**
	 * The feature id for the '<em><b>Variant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAV__VARIANT = BootstrapPackage.BOOTSTRAP_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Active Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAV__ACTIVE_KEY = BootstrapPackage.BOOTSTRAP_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Default Active Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAV__DEFAULT_ACTIVE_KEY = BootstrapPackage.BOOTSTRAP_COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Fill</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAV__FILL = BootstrapPackage.BOOTSTRAP_COMPONENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Justify</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAV__JUSTIFY = BootstrapPackage.BOOTSTRAP_COMPONENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Entries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAV__ENTRIES = BootstrapPackage.BOOTSTRAP_COMPONENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Nav</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAV_FEATURE_COUNT = BootstrapPackage.BOOTSTRAP_COMPONENT_FEATURE_COUNT + 6;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAV___COLLECT__OBJECT_EREFERENCE_ELIST = BootstrapPackage.BOOTSTRAP_COMPONENT___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAV___GET_REFERRERS__EREFERENCE = BootstrapPackage.BOOTSTRAP_COMPONENT___GET_REFERRERS__EREFERENCE;

	/**
	 * The number of operations of the '<em>Nav</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAV_OPERATION_COUNT = BootstrapPackage.BOOTSTRAP_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.impl.NavItemImpl <em>Nav Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.impl.NavItemImpl
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.impl.NavigationPackageImpl#getNavItem()
	 * @generated
	 */
	int NAV_ITEM = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAV_ITEM__ID = BootstrapPackage.BOOTSTRAP_COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAV_ITEM__DOCUMENTATION = BootstrapPackage.BOOTSTRAP_COMPONENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAV_ITEM__DOC_REF = BootstrapPackage.BOOTSTRAP_COMPONENT__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAV_ITEM__DOC_FORMAT = BootstrapPackage.BOOTSTRAP_COMPONENT__DOC_FORMAT;

	/**
	 * The feature id for the '<em><b>Doc Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAV_ITEM__DOC_CONTENTS = BootstrapPackage.BOOTSTRAP_COMPONENT__DOC_CONTENTS;

	/**
	 * The feature id for the '<em><b>Doc Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAV_ITEM__DOC_SECTIONS = BootstrapPackage.BOOTSTRAP_COMPONENT__DOC_SECTIONS;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAV_ITEM__MARKERS = BootstrapPackage.BOOTSTRAP_COMPONENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAV_ITEM__ICON = BootstrapPackage.BOOTSTRAP_COMPONENT__ICON;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAV_ITEM__URIS = BootstrapPackage.BOOTSTRAP_COMPONENT__URIS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAV_ITEM__NAME = BootstrapPackage.BOOTSTRAP_COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAV_ITEM__CHILDREN = BootstrapPackage.BOOTSTRAP_COMPONENT__CHILDREN;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAV_ITEM__ATTRIBUTES = BootstrapPackage.BOOTSTRAP_COMPONENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Element Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAV_ITEM__ELEMENT_ID = BootstrapPackage.BOOTSTRAP_COMPONENT__ELEMENT_ID;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAV_ITEM__CLASSES = BootstrapPackage.BOOTSTRAP_COMPONENT__CLASSES;

	/**
	 * The feature id for the '<em><b>Style</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAV_ITEM__STYLE = BootstrapPackage.BOOTSTRAP_COMPONENT__STYLE;

	/**
	 * The feature id for the '<em><b>As</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAV_ITEM__AS = BootstrapPackage.BOOTSTRAP_COMPONENT__AS;

	/**
	 * The feature id for the '<em><b>As Component</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAV_ITEM__AS_COMPONENT = BootstrapPackage.BOOTSTRAP_COMPONENT__AS_COMPONENT;

	/**
	 * The feature id for the '<em><b>Link</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAV_ITEM__LINK = BootstrapPackage.BOOTSTRAP_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Nav Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAV_ITEM_FEATURE_COUNT = BootstrapPackage.BOOTSTRAP_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAV_ITEM___COLLECT__OBJECT_EREFERENCE_ELIST = BootstrapPackage.BOOTSTRAP_COMPONENT___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAV_ITEM___GET_REFERRERS__EREFERENCE = BootstrapPackage.BOOTSTRAP_COMPONENT___GET_REFERRERS__EREFERENCE;

	/**
	 * The number of operations of the '<em>Nav Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAV_ITEM_OPERATION_COUNT = BootstrapPackage.BOOTSTRAP_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.impl.NavLinkImpl <em>Nav Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.impl.NavLinkImpl
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.impl.NavigationPackageImpl#getNavLink()
	 * @generated
	 */
	int NAV_LINK = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAV_LINK__ID = BootstrapPackage.BOOTSTRAP_COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAV_LINK__DOCUMENTATION = BootstrapPackage.BOOTSTRAP_COMPONENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAV_LINK__DOC_REF = BootstrapPackage.BOOTSTRAP_COMPONENT__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAV_LINK__DOC_FORMAT = BootstrapPackage.BOOTSTRAP_COMPONENT__DOC_FORMAT;

	/**
	 * The feature id for the '<em><b>Doc Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAV_LINK__DOC_CONTENTS = BootstrapPackage.BOOTSTRAP_COMPONENT__DOC_CONTENTS;

	/**
	 * The feature id for the '<em><b>Doc Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAV_LINK__DOC_SECTIONS = BootstrapPackage.BOOTSTRAP_COMPONENT__DOC_SECTIONS;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAV_LINK__MARKERS = BootstrapPackage.BOOTSTRAP_COMPONENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAV_LINK__ICON = BootstrapPackage.BOOTSTRAP_COMPONENT__ICON;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAV_LINK__URIS = BootstrapPackage.BOOTSTRAP_COMPONENT__URIS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAV_LINK__NAME = BootstrapPackage.BOOTSTRAP_COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAV_LINK__CHILDREN = BootstrapPackage.BOOTSTRAP_COMPONENT__CHILDREN;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAV_LINK__ATTRIBUTES = BootstrapPackage.BOOTSTRAP_COMPONENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Element Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAV_LINK__ELEMENT_ID = BootstrapPackage.BOOTSTRAP_COMPONENT__ELEMENT_ID;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAV_LINK__CLASSES = BootstrapPackage.BOOTSTRAP_COMPONENT__CLASSES;

	/**
	 * The feature id for the '<em><b>Style</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAV_LINK__STYLE = BootstrapPackage.BOOTSTRAP_COMPONENT__STYLE;

	/**
	 * The feature id for the '<em><b>As</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAV_LINK__AS = BootstrapPackage.BOOTSTRAP_COMPONENT__AS;

	/**
	 * The feature id for the '<em><b>As Component</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAV_LINK__AS_COMPONENT = BootstrapPackage.BOOTSTRAP_COMPONENT__AS_COMPONENT;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAV_LINK__CONTENT = BootstrapPackage.BOOTSTRAP_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAV_LINK__HREF = BootstrapPackage.BOOTSTRAP_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Event Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAV_LINK__EVENT_KEY = BootstrapPackage.BOOTSTRAP_COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAV_LINK__ACTIVE = BootstrapPackage.BOOTSTRAP_COMPONENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Disabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAV_LINK__DISABLED = BootstrapPackage.BOOTSTRAP_COMPONENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Nav Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAV_LINK_FEATURE_COUNT = BootstrapPackage.BOOTSTRAP_COMPONENT_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAV_LINK___COLLECT__OBJECT_EREFERENCE_ELIST = BootstrapPackage.BOOTSTRAP_COMPONENT___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAV_LINK___GET_REFERRERS__EREFERENCE = BootstrapPackage.BOOTSTRAP_COMPONENT___GET_REFERRERS__EREFERENCE;

	/**
	 * The number of operations of the '<em>Nav Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAV_LINK_OPERATION_COUNT = BootstrapPackage.BOOTSTRAP_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.impl.NavDropdownImpl <em>Nav Dropdown</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.impl.NavDropdownImpl
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.impl.NavigationPackageImpl#getNavDropdown()
	 * @generated
	 */
	int NAV_DROPDOWN = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAV_DROPDOWN__ID = BootstrapPackage.BOOTSTRAP_COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAV_DROPDOWN__DOCUMENTATION = BootstrapPackage.BOOTSTRAP_COMPONENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAV_DROPDOWN__DOC_REF = BootstrapPackage.BOOTSTRAP_COMPONENT__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAV_DROPDOWN__DOC_FORMAT = BootstrapPackage.BOOTSTRAP_COMPONENT__DOC_FORMAT;

	/**
	 * The feature id for the '<em><b>Doc Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAV_DROPDOWN__DOC_CONTENTS = BootstrapPackage.BOOTSTRAP_COMPONENT__DOC_CONTENTS;

	/**
	 * The feature id for the '<em><b>Doc Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAV_DROPDOWN__DOC_SECTIONS = BootstrapPackage.BOOTSTRAP_COMPONENT__DOC_SECTIONS;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAV_DROPDOWN__MARKERS = BootstrapPackage.BOOTSTRAP_COMPONENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAV_DROPDOWN__ICON = BootstrapPackage.BOOTSTRAP_COMPONENT__ICON;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAV_DROPDOWN__URIS = BootstrapPackage.BOOTSTRAP_COMPONENT__URIS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAV_DROPDOWN__NAME = BootstrapPackage.BOOTSTRAP_COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAV_DROPDOWN__CHILDREN = BootstrapPackage.BOOTSTRAP_COMPONENT__CHILDREN;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAV_DROPDOWN__ATTRIBUTES = BootstrapPackage.BOOTSTRAP_COMPONENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Element Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAV_DROPDOWN__ELEMENT_ID = BootstrapPackage.BOOTSTRAP_COMPONENT__ELEMENT_ID;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAV_DROPDOWN__CLASSES = BootstrapPackage.BOOTSTRAP_COMPONENT__CLASSES;

	/**
	 * The feature id for the '<em><b>Style</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAV_DROPDOWN__STYLE = BootstrapPackage.BOOTSTRAP_COMPONENT__STYLE;

	/**
	 * The feature id for the '<em><b>As</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAV_DROPDOWN__AS = BootstrapPackage.BOOTSTRAP_COMPONENT__AS;

	/**
	 * The feature id for the '<em><b>As Component</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAV_DROPDOWN__AS_COMPONENT = BootstrapPackage.BOOTSTRAP_COMPONENT__AS_COMPONENT;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAV_DROPDOWN__TITLE = BootstrapPackage.BOOTSTRAP_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Title Node</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAV_DROPDOWN__TITLE_NODE = BootstrapPackage.BOOTSTRAP_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Entries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAV_DROPDOWN__ENTRIES = BootstrapPackage.BOOTSTRAP_COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Nav Dropdown</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAV_DROPDOWN_FEATURE_COUNT = BootstrapPackage.BOOTSTRAP_COMPONENT_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAV_DROPDOWN___COLLECT__OBJECT_EREFERENCE_ELIST = BootstrapPackage.BOOTSTRAP_COMPONENT___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAV_DROPDOWN___GET_REFERRERS__EREFERENCE = BootstrapPackage.BOOTSTRAP_COMPONENT___GET_REFERRERS__EREFERENCE;

	/**
	 * The number of operations of the '<em>Nav Dropdown</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAV_DROPDOWN_OPERATION_COUNT = BootstrapPackage.BOOTSTRAP_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.impl.NavbarImpl <em>Navbar</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.impl.NavbarImpl
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.impl.NavigationPackageImpl#getNavbar()
	 * @generated
	 */
	int NAVBAR = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVBAR__ID = BootstrapPackage.BOOTSTRAP_COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVBAR__DOCUMENTATION = BootstrapPackage.BOOTSTRAP_COMPONENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVBAR__DOC_REF = BootstrapPackage.BOOTSTRAP_COMPONENT__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVBAR__DOC_FORMAT = BootstrapPackage.BOOTSTRAP_COMPONENT__DOC_FORMAT;

	/**
	 * The feature id for the '<em><b>Doc Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVBAR__DOC_CONTENTS = BootstrapPackage.BOOTSTRAP_COMPONENT__DOC_CONTENTS;

	/**
	 * The feature id for the '<em><b>Doc Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVBAR__DOC_SECTIONS = BootstrapPackage.BOOTSTRAP_COMPONENT__DOC_SECTIONS;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVBAR__MARKERS = BootstrapPackage.BOOTSTRAP_COMPONENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVBAR__ICON = BootstrapPackage.BOOTSTRAP_COMPONENT__ICON;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVBAR__URIS = BootstrapPackage.BOOTSTRAP_COMPONENT__URIS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVBAR__NAME = BootstrapPackage.BOOTSTRAP_COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVBAR__CHILDREN = BootstrapPackage.BOOTSTRAP_COMPONENT__CHILDREN;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVBAR__ATTRIBUTES = BootstrapPackage.BOOTSTRAP_COMPONENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Element Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVBAR__ELEMENT_ID = BootstrapPackage.BOOTSTRAP_COMPONENT__ELEMENT_ID;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVBAR__CLASSES = BootstrapPackage.BOOTSTRAP_COMPONENT__CLASSES;

	/**
	 * The feature id for the '<em><b>Style</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVBAR__STYLE = BootstrapPackage.BOOTSTRAP_COMPONENT__STYLE;

	/**
	 * The feature id for the '<em><b>As</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVBAR__AS = BootstrapPackage.BOOTSTRAP_COMPONENT__AS;

	/**
	 * The feature id for the '<em><b>As Component</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVBAR__AS_COMPONENT = BootstrapPackage.BOOTSTRAP_COMPONENT__AS_COMPONENT;

	/**
	 * The feature id for the '<em><b>Bg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVBAR__BG = BootstrapPackage.BOOTSTRAP_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Theme</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVBAR__THEME = BootstrapPackage.BOOTSTRAP_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Always Expanded</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVBAR__ALWAYS_EXPANDED = BootstrapPackage.BOOTSTRAP_COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Expand</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVBAR__EXPAND = BootstrapPackage.BOOTSTRAP_COMPONENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Fixed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVBAR__FIXED = BootstrapPackage.BOOTSTRAP_COMPONENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Sticky</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVBAR__STICKY = BootstrapPackage.BOOTSTRAP_COMPONENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVBAR__CONTENT = BootstrapPackage.BOOTSTRAP_COMPONENT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Navbar</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVBAR_FEATURE_COUNT = BootstrapPackage.BOOTSTRAP_COMPONENT_FEATURE_COUNT + 7;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVBAR___COLLECT__OBJECT_EREFERENCE_ELIST = BootstrapPackage.BOOTSTRAP_COMPONENT___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVBAR___GET_REFERRERS__EREFERENCE = BootstrapPackage.BOOTSTRAP_COMPONENT___GET_REFERRERS__EREFERENCE;

	/**
	 * The number of operations of the '<em>Navbar</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVBAR_OPERATION_COUNT = BootstrapPackage.BOOTSTRAP_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.impl.NavbarBrandImpl <em>Navbar Brand</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.impl.NavbarBrandImpl
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.impl.NavigationPackageImpl#getNavbarBrand()
	 * @generated
	 */
	int NAVBAR_BRAND = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVBAR_BRAND__ID = BootstrapPackage.BOOTSTRAP_COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVBAR_BRAND__DOCUMENTATION = BootstrapPackage.BOOTSTRAP_COMPONENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVBAR_BRAND__DOC_REF = BootstrapPackage.BOOTSTRAP_COMPONENT__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVBAR_BRAND__DOC_FORMAT = BootstrapPackage.BOOTSTRAP_COMPONENT__DOC_FORMAT;

	/**
	 * The feature id for the '<em><b>Doc Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVBAR_BRAND__DOC_CONTENTS = BootstrapPackage.BOOTSTRAP_COMPONENT__DOC_CONTENTS;

	/**
	 * The feature id for the '<em><b>Doc Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVBAR_BRAND__DOC_SECTIONS = BootstrapPackage.BOOTSTRAP_COMPONENT__DOC_SECTIONS;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVBAR_BRAND__MARKERS = BootstrapPackage.BOOTSTRAP_COMPONENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVBAR_BRAND__ICON = BootstrapPackage.BOOTSTRAP_COMPONENT__ICON;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVBAR_BRAND__URIS = BootstrapPackage.BOOTSTRAP_COMPONENT__URIS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVBAR_BRAND__NAME = BootstrapPackage.BOOTSTRAP_COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVBAR_BRAND__CHILDREN = BootstrapPackage.BOOTSTRAP_COMPONENT__CHILDREN;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVBAR_BRAND__ATTRIBUTES = BootstrapPackage.BOOTSTRAP_COMPONENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Element Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVBAR_BRAND__ELEMENT_ID = BootstrapPackage.BOOTSTRAP_COMPONENT__ELEMENT_ID;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVBAR_BRAND__CLASSES = BootstrapPackage.BOOTSTRAP_COMPONENT__CLASSES;

	/**
	 * The feature id for the '<em><b>Style</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVBAR_BRAND__STYLE = BootstrapPackage.BOOTSTRAP_COMPONENT__STYLE;

	/**
	 * The feature id for the '<em><b>As</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVBAR_BRAND__AS = BootstrapPackage.BOOTSTRAP_COMPONENT__AS;

	/**
	 * The feature id for the '<em><b>As Component</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVBAR_BRAND__AS_COMPONENT = BootstrapPackage.BOOTSTRAP_COMPONENT__AS_COMPONENT;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVBAR_BRAND__CONTENT = BootstrapPackage.BOOTSTRAP_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVBAR_BRAND__HREF = BootstrapPackage.BOOTSTRAP_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Navbar Brand</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVBAR_BRAND_FEATURE_COUNT = BootstrapPackage.BOOTSTRAP_COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVBAR_BRAND___COLLECT__OBJECT_EREFERENCE_ELIST = BootstrapPackage.BOOTSTRAP_COMPONENT___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVBAR_BRAND___GET_REFERRERS__EREFERENCE = BootstrapPackage.BOOTSTRAP_COMPONENT___GET_REFERRERS__EREFERENCE;

	/**
	 * The number of operations of the '<em>Navbar Brand</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVBAR_BRAND_OPERATION_COUNT = BootstrapPackage.BOOTSTRAP_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.impl.NavbarToggleImpl <em>Navbar Toggle</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.impl.NavbarToggleImpl
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.impl.NavigationPackageImpl#getNavbarToggle()
	 * @generated
	 */
	int NAVBAR_TOGGLE = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVBAR_TOGGLE__ID = BootstrapPackage.BOOTSTRAP_COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVBAR_TOGGLE__DOCUMENTATION = BootstrapPackage.BOOTSTRAP_COMPONENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVBAR_TOGGLE__DOC_REF = BootstrapPackage.BOOTSTRAP_COMPONENT__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVBAR_TOGGLE__DOC_FORMAT = BootstrapPackage.BOOTSTRAP_COMPONENT__DOC_FORMAT;

	/**
	 * The feature id for the '<em><b>Doc Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVBAR_TOGGLE__DOC_CONTENTS = BootstrapPackage.BOOTSTRAP_COMPONENT__DOC_CONTENTS;

	/**
	 * The feature id for the '<em><b>Doc Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVBAR_TOGGLE__DOC_SECTIONS = BootstrapPackage.BOOTSTRAP_COMPONENT__DOC_SECTIONS;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVBAR_TOGGLE__MARKERS = BootstrapPackage.BOOTSTRAP_COMPONENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVBAR_TOGGLE__ICON = BootstrapPackage.BOOTSTRAP_COMPONENT__ICON;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVBAR_TOGGLE__URIS = BootstrapPackage.BOOTSTRAP_COMPONENT__URIS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVBAR_TOGGLE__NAME = BootstrapPackage.BOOTSTRAP_COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVBAR_TOGGLE__CHILDREN = BootstrapPackage.BOOTSTRAP_COMPONENT__CHILDREN;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVBAR_TOGGLE__ATTRIBUTES = BootstrapPackage.BOOTSTRAP_COMPONENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Element Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVBAR_TOGGLE__ELEMENT_ID = BootstrapPackage.BOOTSTRAP_COMPONENT__ELEMENT_ID;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVBAR_TOGGLE__CLASSES = BootstrapPackage.BOOTSTRAP_COMPONENT__CLASSES;

	/**
	 * The feature id for the '<em><b>Style</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVBAR_TOGGLE__STYLE = BootstrapPackage.BOOTSTRAP_COMPONENT__STYLE;

	/**
	 * The feature id for the '<em><b>As</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVBAR_TOGGLE__AS = BootstrapPackage.BOOTSTRAP_COMPONENT__AS;

	/**
	 * The feature id for the '<em><b>As Component</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVBAR_TOGGLE__AS_COMPONENT = BootstrapPackage.BOOTSTRAP_COMPONENT__AS_COMPONENT;

	/**
	 * The feature id for the '<em><b>Controls</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVBAR_TOGGLE__CONTROLS = BootstrapPackage.BOOTSTRAP_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Navbar Toggle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVBAR_TOGGLE_FEATURE_COUNT = BootstrapPackage.BOOTSTRAP_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVBAR_TOGGLE___COLLECT__OBJECT_EREFERENCE_ELIST = BootstrapPackage.BOOTSTRAP_COMPONENT___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVBAR_TOGGLE___GET_REFERRERS__EREFERENCE = BootstrapPackage.BOOTSTRAP_COMPONENT___GET_REFERRERS__EREFERENCE;

	/**
	 * The number of operations of the '<em>Navbar Toggle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVBAR_TOGGLE_OPERATION_COUNT = BootstrapPackage.BOOTSTRAP_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.impl.NavbarCollapseImpl <em>Navbar Collapse</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.impl.NavbarCollapseImpl
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.impl.NavigationPackageImpl#getNavbarCollapse()
	 * @generated
	 */
	int NAVBAR_COLLAPSE = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVBAR_COLLAPSE__ID = BootstrapPackage.BOOTSTRAP_COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVBAR_COLLAPSE__DOCUMENTATION = BootstrapPackage.BOOTSTRAP_COMPONENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVBAR_COLLAPSE__DOC_REF = BootstrapPackage.BOOTSTRAP_COMPONENT__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVBAR_COLLAPSE__DOC_FORMAT = BootstrapPackage.BOOTSTRAP_COMPONENT__DOC_FORMAT;

	/**
	 * The feature id for the '<em><b>Doc Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVBAR_COLLAPSE__DOC_CONTENTS = BootstrapPackage.BOOTSTRAP_COMPONENT__DOC_CONTENTS;

	/**
	 * The feature id for the '<em><b>Doc Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVBAR_COLLAPSE__DOC_SECTIONS = BootstrapPackage.BOOTSTRAP_COMPONENT__DOC_SECTIONS;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVBAR_COLLAPSE__MARKERS = BootstrapPackage.BOOTSTRAP_COMPONENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVBAR_COLLAPSE__ICON = BootstrapPackage.BOOTSTRAP_COMPONENT__ICON;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVBAR_COLLAPSE__URIS = BootstrapPackage.BOOTSTRAP_COMPONENT__URIS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVBAR_COLLAPSE__NAME = BootstrapPackage.BOOTSTRAP_COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVBAR_COLLAPSE__CHILDREN = BootstrapPackage.BOOTSTRAP_COMPONENT__CHILDREN;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVBAR_COLLAPSE__ATTRIBUTES = BootstrapPackage.BOOTSTRAP_COMPONENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Element Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVBAR_COLLAPSE__ELEMENT_ID = BootstrapPackage.BOOTSTRAP_COMPONENT__ELEMENT_ID;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVBAR_COLLAPSE__CLASSES = BootstrapPackage.BOOTSTRAP_COMPONENT__CLASSES;

	/**
	 * The feature id for the '<em><b>Style</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVBAR_COLLAPSE__STYLE = BootstrapPackage.BOOTSTRAP_COMPONENT__STYLE;

	/**
	 * The feature id for the '<em><b>As</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVBAR_COLLAPSE__AS = BootstrapPackage.BOOTSTRAP_COMPONENT__AS;

	/**
	 * The feature id for the '<em><b>As Component</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVBAR_COLLAPSE__AS_COMPONENT = BootstrapPackage.BOOTSTRAP_COMPONENT__AS_COMPONENT;

	/**
	 * The feature id for the '<em><b>Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVBAR_COLLAPSE__CONTENT = BootstrapPackage.BOOTSTRAP_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Navbar Collapse</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVBAR_COLLAPSE_FEATURE_COUNT = BootstrapPackage.BOOTSTRAP_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVBAR_COLLAPSE___COLLECT__OBJECT_EREFERENCE_ELIST = BootstrapPackage.BOOTSTRAP_COMPONENT___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVBAR_COLLAPSE___GET_REFERRERS__EREFERENCE = BootstrapPackage.BOOTSTRAP_COMPONENT___GET_REFERRERS__EREFERENCE;

	/**
	 * The number of operations of the '<em>Navbar Collapse</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVBAR_COLLAPSE_OPERATION_COUNT = BootstrapPackage.BOOTSTRAP_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.impl.NavbarTextImpl <em>Navbar Text</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.impl.NavbarTextImpl
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.impl.NavigationPackageImpl#getNavbarText()
	 * @generated
	 */
	int NAVBAR_TEXT = 9;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVBAR_TEXT__ID = BootstrapPackage.BOOTSTRAP_COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVBAR_TEXT__DOCUMENTATION = BootstrapPackage.BOOTSTRAP_COMPONENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVBAR_TEXT__DOC_REF = BootstrapPackage.BOOTSTRAP_COMPONENT__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVBAR_TEXT__DOC_FORMAT = BootstrapPackage.BOOTSTRAP_COMPONENT__DOC_FORMAT;

	/**
	 * The feature id for the '<em><b>Doc Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVBAR_TEXT__DOC_CONTENTS = BootstrapPackage.BOOTSTRAP_COMPONENT__DOC_CONTENTS;

	/**
	 * The feature id for the '<em><b>Doc Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVBAR_TEXT__DOC_SECTIONS = BootstrapPackage.BOOTSTRAP_COMPONENT__DOC_SECTIONS;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVBAR_TEXT__MARKERS = BootstrapPackage.BOOTSTRAP_COMPONENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVBAR_TEXT__ICON = BootstrapPackage.BOOTSTRAP_COMPONENT__ICON;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVBAR_TEXT__URIS = BootstrapPackage.BOOTSTRAP_COMPONENT__URIS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVBAR_TEXT__NAME = BootstrapPackage.BOOTSTRAP_COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVBAR_TEXT__CHILDREN = BootstrapPackage.BOOTSTRAP_COMPONENT__CHILDREN;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVBAR_TEXT__ATTRIBUTES = BootstrapPackage.BOOTSTRAP_COMPONENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Element Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVBAR_TEXT__ELEMENT_ID = BootstrapPackage.BOOTSTRAP_COMPONENT__ELEMENT_ID;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVBAR_TEXT__CLASSES = BootstrapPackage.BOOTSTRAP_COMPONENT__CLASSES;

	/**
	 * The feature id for the '<em><b>Style</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVBAR_TEXT__STYLE = BootstrapPackage.BOOTSTRAP_COMPONENT__STYLE;

	/**
	 * The feature id for the '<em><b>As</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVBAR_TEXT__AS = BootstrapPackage.BOOTSTRAP_COMPONENT__AS;

	/**
	 * The feature id for the '<em><b>As Component</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVBAR_TEXT__AS_COMPONENT = BootstrapPackage.BOOTSTRAP_COMPONENT__AS_COMPONENT;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVBAR_TEXT__CONTENT = BootstrapPackage.BOOTSTRAP_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Navbar Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVBAR_TEXT_FEATURE_COUNT = BootstrapPackage.BOOTSTRAP_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVBAR_TEXT___COLLECT__OBJECT_EREFERENCE_ELIST = BootstrapPackage.BOOTSTRAP_COMPONENT___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVBAR_TEXT___GET_REFERRERS__EREFERENCE = BootstrapPackage.BOOTSTRAP_COMPONENT___GET_REFERRERS__EREFERENCE;

	/**
	 * The number of operations of the '<em>Navbar Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVBAR_TEXT_OPERATION_COUNT = BootstrapPackage.BOOTSTRAP_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.impl.TabsImpl <em>Tabs</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.impl.TabsImpl
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.impl.NavigationPackageImpl#getTabs()
	 * @generated
	 */
	int TABS = 10;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABS__ID = BootstrapPackage.BOOTSTRAP_COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABS__DOCUMENTATION = BootstrapPackage.BOOTSTRAP_COMPONENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABS__DOC_REF = BootstrapPackage.BOOTSTRAP_COMPONENT__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABS__DOC_FORMAT = BootstrapPackage.BOOTSTRAP_COMPONENT__DOC_FORMAT;

	/**
	 * The feature id for the '<em><b>Doc Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABS__DOC_CONTENTS = BootstrapPackage.BOOTSTRAP_COMPONENT__DOC_CONTENTS;

	/**
	 * The feature id for the '<em><b>Doc Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABS__DOC_SECTIONS = BootstrapPackage.BOOTSTRAP_COMPONENT__DOC_SECTIONS;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABS__MARKERS = BootstrapPackage.BOOTSTRAP_COMPONENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABS__ICON = BootstrapPackage.BOOTSTRAP_COMPONENT__ICON;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABS__URIS = BootstrapPackage.BOOTSTRAP_COMPONENT__URIS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABS__NAME = BootstrapPackage.BOOTSTRAP_COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABS__CHILDREN = BootstrapPackage.BOOTSTRAP_COMPONENT__CHILDREN;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABS__ATTRIBUTES = BootstrapPackage.BOOTSTRAP_COMPONENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Element Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABS__ELEMENT_ID = BootstrapPackage.BOOTSTRAP_COMPONENT__ELEMENT_ID;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABS__CLASSES = BootstrapPackage.BOOTSTRAP_COMPONENT__CLASSES;

	/**
	 * The feature id for the '<em><b>Style</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABS__STYLE = BootstrapPackage.BOOTSTRAP_COMPONENT__STYLE;

	/**
	 * The feature id for the '<em><b>As</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABS__AS = BootstrapPackage.BOOTSTRAP_COMPONENT__AS;

	/**
	 * The feature id for the '<em><b>As Component</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABS__AS_COMPONENT = BootstrapPackage.BOOTSTRAP_COMPONENT__AS_COMPONENT;

	/**
	 * The feature id for the '<em><b>Default Active Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABS__DEFAULT_ACTIVE_KEY = BootstrapPackage.BOOTSTRAP_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Active Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABS__ACTIVE_KEY = BootstrapPackage.BOOTSTRAP_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Variant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABS__VARIANT = BootstrapPackage.BOOTSTRAP_COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Fill</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABS__FILL = BootstrapPackage.BOOTSTRAP_COMPONENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Justify</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABS__JUSTIFY = BootstrapPackage.BOOTSTRAP_COMPONENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Mount On Enter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABS__MOUNT_ON_ENTER = BootstrapPackage.BOOTSTRAP_COMPONENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Unmount On Exit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABS__UNMOUNT_ON_EXIT = BootstrapPackage.BOOTSTRAP_COMPONENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Tabs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABS__TABS = BootstrapPackage.BOOTSTRAP_COMPONENT_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Tabs</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABS_FEATURE_COUNT = BootstrapPackage.BOOTSTRAP_COMPONENT_FEATURE_COUNT + 8;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABS___COLLECT__OBJECT_EREFERENCE_ELIST = BootstrapPackage.BOOTSTRAP_COMPONENT___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABS___GET_REFERRERS__EREFERENCE = BootstrapPackage.BOOTSTRAP_COMPONENT___GET_REFERRERS__EREFERENCE;

	/**
	 * The number of operations of the '<em>Tabs</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABS_OPERATION_COUNT = BootstrapPackage.BOOTSTRAP_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.impl.TabImpl <em>Tab</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.impl.TabImpl
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.impl.NavigationPackageImpl#getTab()
	 * @generated
	 */
	int TAB = 11;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB__ID = BootstrapPackage.BOOTSTRAP_COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB__DOCUMENTATION = BootstrapPackage.BOOTSTRAP_COMPONENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB__DOC_REF = BootstrapPackage.BOOTSTRAP_COMPONENT__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB__DOC_FORMAT = BootstrapPackage.BOOTSTRAP_COMPONENT__DOC_FORMAT;

	/**
	 * The feature id for the '<em><b>Doc Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB__DOC_CONTENTS = BootstrapPackage.BOOTSTRAP_COMPONENT__DOC_CONTENTS;

	/**
	 * The feature id for the '<em><b>Doc Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB__DOC_SECTIONS = BootstrapPackage.BOOTSTRAP_COMPONENT__DOC_SECTIONS;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB__MARKERS = BootstrapPackage.BOOTSTRAP_COMPONENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB__ICON = BootstrapPackage.BOOTSTRAP_COMPONENT__ICON;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB__URIS = BootstrapPackage.BOOTSTRAP_COMPONENT__URIS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB__NAME = BootstrapPackage.BOOTSTRAP_COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB__CHILDREN = BootstrapPackage.BOOTSTRAP_COMPONENT__CHILDREN;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB__ATTRIBUTES = BootstrapPackage.BOOTSTRAP_COMPONENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Element Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB__ELEMENT_ID = BootstrapPackage.BOOTSTRAP_COMPONENT__ELEMENT_ID;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB__CLASSES = BootstrapPackage.BOOTSTRAP_COMPONENT__CLASSES;

	/**
	 * The feature id for the '<em><b>Style</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB__STYLE = BootstrapPackage.BOOTSTRAP_COMPONENT__STYLE;

	/**
	 * The feature id for the '<em><b>As</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB__AS = BootstrapPackage.BOOTSTRAP_COMPONENT__AS;

	/**
	 * The feature id for the '<em><b>As Component</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB__AS_COMPONENT = BootstrapPackage.BOOTSTRAP_COMPONENT__AS_COMPONENT;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB__CONTENT = BootstrapPackage.BOOTSTRAP_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Event Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB__EVENT_KEY = BootstrapPackage.BOOTSTRAP_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB__TITLE = BootstrapPackage.BOOTSTRAP_COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Title Node</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB__TITLE_NODE = BootstrapPackage.BOOTSTRAP_COMPONENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Disabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB__DISABLED = BootstrapPackage.BOOTSTRAP_COMPONENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Tab</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB_FEATURE_COUNT = BootstrapPackage.BOOTSTRAP_COMPONENT_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB___COLLECT__OBJECT_EREFERENCE_ELIST = BootstrapPackage.BOOTSTRAP_COMPONENT___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB___GET_REFERRERS__EREFERENCE = BootstrapPackage.BOOTSTRAP_COMPONENT___GET_REFERRERS__EREFERENCE;

	/**
	 * The number of operations of the '<em>Tab</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB_OPERATION_COUNT = BootstrapPackage.BOOTSTRAP_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.impl.BreadcrumbImpl <em>Breadcrumb</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.impl.BreadcrumbImpl
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.impl.NavigationPackageImpl#getBreadcrumb()
	 * @generated
	 */
	int BREADCRUMB = 12;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREADCRUMB__ID = BootstrapPackage.BOOTSTRAP_COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREADCRUMB__DOCUMENTATION = BootstrapPackage.BOOTSTRAP_COMPONENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREADCRUMB__DOC_REF = BootstrapPackage.BOOTSTRAP_COMPONENT__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREADCRUMB__DOC_FORMAT = BootstrapPackage.BOOTSTRAP_COMPONENT__DOC_FORMAT;

	/**
	 * The feature id for the '<em><b>Doc Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREADCRUMB__DOC_CONTENTS = BootstrapPackage.BOOTSTRAP_COMPONENT__DOC_CONTENTS;

	/**
	 * The feature id for the '<em><b>Doc Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREADCRUMB__DOC_SECTIONS = BootstrapPackage.BOOTSTRAP_COMPONENT__DOC_SECTIONS;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREADCRUMB__MARKERS = BootstrapPackage.BOOTSTRAP_COMPONENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREADCRUMB__ICON = BootstrapPackage.BOOTSTRAP_COMPONENT__ICON;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREADCRUMB__URIS = BootstrapPackage.BOOTSTRAP_COMPONENT__URIS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREADCRUMB__NAME = BootstrapPackage.BOOTSTRAP_COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREADCRUMB__CHILDREN = BootstrapPackage.BOOTSTRAP_COMPONENT__CHILDREN;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREADCRUMB__ATTRIBUTES = BootstrapPackage.BOOTSTRAP_COMPONENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Element Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREADCRUMB__ELEMENT_ID = BootstrapPackage.BOOTSTRAP_COMPONENT__ELEMENT_ID;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREADCRUMB__CLASSES = BootstrapPackage.BOOTSTRAP_COMPONENT__CLASSES;

	/**
	 * The feature id for the '<em><b>Style</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREADCRUMB__STYLE = BootstrapPackage.BOOTSTRAP_COMPONENT__STYLE;

	/**
	 * The feature id for the '<em><b>As</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREADCRUMB__AS = BootstrapPackage.BOOTSTRAP_COMPONENT__AS;

	/**
	 * The feature id for the '<em><b>As Component</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREADCRUMB__AS_COMPONENT = BootstrapPackage.BOOTSTRAP_COMPONENT__AS_COMPONENT;

	/**
	 * The feature id for the '<em><b>Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREADCRUMB__ITEMS = BootstrapPackage.BOOTSTRAP_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Breadcrumb</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREADCRUMB_FEATURE_COUNT = BootstrapPackage.BOOTSTRAP_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREADCRUMB___COLLECT__OBJECT_EREFERENCE_ELIST = BootstrapPackage.BOOTSTRAP_COMPONENT___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREADCRUMB___GET_REFERRERS__EREFERENCE = BootstrapPackage.BOOTSTRAP_COMPONENT___GET_REFERRERS__EREFERENCE;

	/**
	 * The number of operations of the '<em>Breadcrumb</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREADCRUMB_OPERATION_COUNT = BootstrapPackage.BOOTSTRAP_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.impl.BreadcrumbItemImpl <em>Breadcrumb Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.impl.BreadcrumbItemImpl
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.impl.NavigationPackageImpl#getBreadcrumbItem()
	 * @generated
	 */
	int BREADCRUMB_ITEM = 13;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREADCRUMB_ITEM__ID = BootstrapPackage.BOOTSTRAP_COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREADCRUMB_ITEM__DOCUMENTATION = BootstrapPackage.BOOTSTRAP_COMPONENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREADCRUMB_ITEM__DOC_REF = BootstrapPackage.BOOTSTRAP_COMPONENT__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREADCRUMB_ITEM__DOC_FORMAT = BootstrapPackage.BOOTSTRAP_COMPONENT__DOC_FORMAT;

	/**
	 * The feature id for the '<em><b>Doc Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREADCRUMB_ITEM__DOC_CONTENTS = BootstrapPackage.BOOTSTRAP_COMPONENT__DOC_CONTENTS;

	/**
	 * The feature id for the '<em><b>Doc Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREADCRUMB_ITEM__DOC_SECTIONS = BootstrapPackage.BOOTSTRAP_COMPONENT__DOC_SECTIONS;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREADCRUMB_ITEM__MARKERS = BootstrapPackage.BOOTSTRAP_COMPONENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREADCRUMB_ITEM__ICON = BootstrapPackage.BOOTSTRAP_COMPONENT__ICON;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREADCRUMB_ITEM__URIS = BootstrapPackage.BOOTSTRAP_COMPONENT__URIS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREADCRUMB_ITEM__NAME = BootstrapPackage.BOOTSTRAP_COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREADCRUMB_ITEM__CHILDREN = BootstrapPackage.BOOTSTRAP_COMPONENT__CHILDREN;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREADCRUMB_ITEM__ATTRIBUTES = BootstrapPackage.BOOTSTRAP_COMPONENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Element Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREADCRUMB_ITEM__ELEMENT_ID = BootstrapPackage.BOOTSTRAP_COMPONENT__ELEMENT_ID;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREADCRUMB_ITEM__CLASSES = BootstrapPackage.BOOTSTRAP_COMPONENT__CLASSES;

	/**
	 * The feature id for the '<em><b>Style</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREADCRUMB_ITEM__STYLE = BootstrapPackage.BOOTSTRAP_COMPONENT__STYLE;

	/**
	 * The feature id for the '<em><b>As</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREADCRUMB_ITEM__AS = BootstrapPackage.BOOTSTRAP_COMPONENT__AS;

	/**
	 * The feature id for the '<em><b>As Component</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREADCRUMB_ITEM__AS_COMPONENT = BootstrapPackage.BOOTSTRAP_COMPONENT__AS_COMPONENT;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREADCRUMB_ITEM__CONTENT = BootstrapPackage.BOOTSTRAP_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREADCRUMB_ITEM__HREF = BootstrapPackage.BOOTSTRAP_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREADCRUMB_ITEM__ACTIVE = BootstrapPackage.BOOTSTRAP_COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Breadcrumb Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREADCRUMB_ITEM_FEATURE_COUNT = BootstrapPackage.BOOTSTRAP_COMPONENT_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREADCRUMB_ITEM___COLLECT__OBJECT_EREFERENCE_ELIST = BootstrapPackage.BOOTSTRAP_COMPONENT___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREADCRUMB_ITEM___GET_REFERRERS__EREFERENCE = BootstrapPackage.BOOTSTRAP_COMPONENT___GET_REFERRERS__EREFERENCE;

	/**
	 * The number of operations of the '<em>Breadcrumb Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREADCRUMB_ITEM_OPERATION_COUNT = BootstrapPackage.BOOTSTRAP_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.PaginationEntry <em>Pagination Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.PaginationEntry
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.impl.NavigationPackageImpl#getPaginationEntry()
	 * @generated
	 */
	int PAGINATION_ENTRY = 14;

	/**
	 * The number of structural features of the '<em>Pagination Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGINATION_ENTRY_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Pagination Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGINATION_ENTRY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.impl.PaginationImpl <em>Pagination</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.impl.PaginationImpl
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.impl.NavigationPackageImpl#getPagination()
	 * @generated
	 */
	int PAGINATION = 15;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGINATION__ID = BootstrapPackage.BOOTSTRAP_COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGINATION__DOCUMENTATION = BootstrapPackage.BOOTSTRAP_COMPONENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGINATION__DOC_REF = BootstrapPackage.BOOTSTRAP_COMPONENT__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGINATION__DOC_FORMAT = BootstrapPackage.BOOTSTRAP_COMPONENT__DOC_FORMAT;

	/**
	 * The feature id for the '<em><b>Doc Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGINATION__DOC_CONTENTS = BootstrapPackage.BOOTSTRAP_COMPONENT__DOC_CONTENTS;

	/**
	 * The feature id for the '<em><b>Doc Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGINATION__DOC_SECTIONS = BootstrapPackage.BOOTSTRAP_COMPONENT__DOC_SECTIONS;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGINATION__MARKERS = BootstrapPackage.BOOTSTRAP_COMPONENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGINATION__ICON = BootstrapPackage.BOOTSTRAP_COMPONENT__ICON;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGINATION__URIS = BootstrapPackage.BOOTSTRAP_COMPONENT__URIS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGINATION__NAME = BootstrapPackage.BOOTSTRAP_COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGINATION__CHILDREN = BootstrapPackage.BOOTSTRAP_COMPONENT__CHILDREN;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGINATION__ATTRIBUTES = BootstrapPackage.BOOTSTRAP_COMPONENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Element Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGINATION__ELEMENT_ID = BootstrapPackage.BOOTSTRAP_COMPONENT__ELEMENT_ID;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGINATION__CLASSES = BootstrapPackage.BOOTSTRAP_COMPONENT__CLASSES;

	/**
	 * The feature id for the '<em><b>Style</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGINATION__STYLE = BootstrapPackage.BOOTSTRAP_COMPONENT__STYLE;

	/**
	 * The feature id for the '<em><b>As</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGINATION__AS = BootstrapPackage.BOOTSTRAP_COMPONENT__AS;

	/**
	 * The feature id for the '<em><b>As Component</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGINATION__AS_COMPONENT = BootstrapPackage.BOOTSTRAP_COMPONENT__AS_COMPONENT;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGINATION__SIZE = BootstrapPackage.BOOTSTRAP_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Entries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGINATION__ENTRIES = BootstrapPackage.BOOTSTRAP_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Pagination</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGINATION_FEATURE_COUNT = BootstrapPackage.BOOTSTRAP_COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGINATION___COLLECT__OBJECT_EREFERENCE_ELIST = BootstrapPackage.BOOTSTRAP_COMPONENT___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGINATION___GET_REFERRERS__EREFERENCE = BootstrapPackage.BOOTSTRAP_COMPONENT___GET_REFERRERS__EREFERENCE;

	/**
	 * The number of operations of the '<em>Pagination</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGINATION_OPERATION_COUNT = BootstrapPackage.BOOTSTRAP_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.impl.PaginationLinkImpl <em>Pagination Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.impl.PaginationLinkImpl
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.impl.NavigationPackageImpl#getPaginationLink()
	 * @generated
	 */
	int PAGINATION_LINK = 16;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGINATION_LINK__ID = BootstrapPackage.BOOTSTRAP_COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGINATION_LINK__DOCUMENTATION = BootstrapPackage.BOOTSTRAP_COMPONENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGINATION_LINK__DOC_REF = BootstrapPackage.BOOTSTRAP_COMPONENT__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGINATION_LINK__DOC_FORMAT = BootstrapPackage.BOOTSTRAP_COMPONENT__DOC_FORMAT;

	/**
	 * The feature id for the '<em><b>Doc Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGINATION_LINK__DOC_CONTENTS = BootstrapPackage.BOOTSTRAP_COMPONENT__DOC_CONTENTS;

	/**
	 * The feature id for the '<em><b>Doc Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGINATION_LINK__DOC_SECTIONS = BootstrapPackage.BOOTSTRAP_COMPONENT__DOC_SECTIONS;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGINATION_LINK__MARKERS = BootstrapPackage.BOOTSTRAP_COMPONENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGINATION_LINK__ICON = BootstrapPackage.BOOTSTRAP_COMPONENT__ICON;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGINATION_LINK__URIS = BootstrapPackage.BOOTSTRAP_COMPONENT__URIS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGINATION_LINK__NAME = BootstrapPackage.BOOTSTRAP_COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGINATION_LINK__CHILDREN = BootstrapPackage.BOOTSTRAP_COMPONENT__CHILDREN;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGINATION_LINK__ATTRIBUTES = BootstrapPackage.BOOTSTRAP_COMPONENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Element Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGINATION_LINK__ELEMENT_ID = BootstrapPackage.BOOTSTRAP_COMPONENT__ELEMENT_ID;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGINATION_LINK__CLASSES = BootstrapPackage.BOOTSTRAP_COMPONENT__CLASSES;

	/**
	 * The feature id for the '<em><b>Style</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGINATION_LINK__STYLE = BootstrapPackage.BOOTSTRAP_COMPONENT__STYLE;

	/**
	 * The feature id for the '<em><b>As</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGINATION_LINK__AS = BootstrapPackage.BOOTSTRAP_COMPONENT__AS;

	/**
	 * The feature id for the '<em><b>As Component</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGINATION_LINK__AS_COMPONENT = BootstrapPackage.BOOTSTRAP_COMPONENT__AS_COMPONENT;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGINATION_LINK__CONTENT = BootstrapPackage.BOOTSTRAP_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGINATION_LINK__HREF = BootstrapPackage.BOOTSTRAP_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGINATION_LINK__ACTIVE = BootstrapPackage.BOOTSTRAP_COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Disabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGINATION_LINK__DISABLED = BootstrapPackage.BOOTSTRAP_COMPONENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Pagination Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGINATION_LINK_FEATURE_COUNT = BootstrapPackage.BOOTSTRAP_COMPONENT_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGINATION_LINK___COLLECT__OBJECT_EREFERENCE_ELIST = BootstrapPackage.BOOTSTRAP_COMPONENT___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGINATION_LINK___GET_REFERRERS__EREFERENCE = BootstrapPackage.BOOTSTRAP_COMPONENT___GET_REFERRERS__EREFERENCE;

	/**
	 * The number of operations of the '<em>Pagination Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGINATION_LINK_OPERATION_COUNT = BootstrapPackage.BOOTSTRAP_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.impl.PaginationItemImpl <em>Pagination Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.impl.PaginationItemImpl
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.impl.NavigationPackageImpl#getPaginationItem()
	 * @generated
	 */
	int PAGINATION_ITEM = 17;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGINATION_ITEM__ID = PAGINATION_LINK__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGINATION_ITEM__DOCUMENTATION = PAGINATION_LINK__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGINATION_ITEM__DOC_REF = PAGINATION_LINK__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGINATION_ITEM__DOC_FORMAT = PAGINATION_LINK__DOC_FORMAT;

	/**
	 * The feature id for the '<em><b>Doc Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGINATION_ITEM__DOC_CONTENTS = PAGINATION_LINK__DOC_CONTENTS;

	/**
	 * The feature id for the '<em><b>Doc Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGINATION_ITEM__DOC_SECTIONS = PAGINATION_LINK__DOC_SECTIONS;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGINATION_ITEM__MARKERS = PAGINATION_LINK__MARKERS;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGINATION_ITEM__ICON = PAGINATION_LINK__ICON;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGINATION_ITEM__URIS = PAGINATION_LINK__URIS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGINATION_ITEM__NAME = PAGINATION_LINK__NAME;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGINATION_ITEM__CHILDREN = PAGINATION_LINK__CHILDREN;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGINATION_ITEM__ATTRIBUTES = PAGINATION_LINK__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Element Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGINATION_ITEM__ELEMENT_ID = PAGINATION_LINK__ELEMENT_ID;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGINATION_ITEM__CLASSES = PAGINATION_LINK__CLASSES;

	/**
	 * The feature id for the '<em><b>Style</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGINATION_ITEM__STYLE = PAGINATION_LINK__STYLE;

	/**
	 * The feature id for the '<em><b>As</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGINATION_ITEM__AS = PAGINATION_LINK__AS;

	/**
	 * The feature id for the '<em><b>As Component</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGINATION_ITEM__AS_COMPONENT = PAGINATION_LINK__AS_COMPONENT;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGINATION_ITEM__CONTENT = PAGINATION_LINK__CONTENT;

	/**
	 * The feature id for the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGINATION_ITEM__HREF = PAGINATION_LINK__HREF;

	/**
	 * The feature id for the '<em><b>Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGINATION_ITEM__ACTIVE = PAGINATION_LINK__ACTIVE;

	/**
	 * The feature id for the '<em><b>Disabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGINATION_ITEM__DISABLED = PAGINATION_LINK__DISABLED;

	/**
	 * The number of structural features of the '<em>Pagination Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGINATION_ITEM_FEATURE_COUNT = PAGINATION_LINK_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGINATION_ITEM___COLLECT__OBJECT_EREFERENCE_ELIST = PAGINATION_LINK___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGINATION_ITEM___GET_REFERRERS__EREFERENCE = PAGINATION_LINK___GET_REFERRERS__EREFERENCE;

	/**
	 * The number of operations of the '<em>Pagination Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGINATION_ITEM_OPERATION_COUNT = PAGINATION_LINK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.impl.PaginationFirstImpl <em>Pagination First</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.impl.PaginationFirstImpl
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.impl.NavigationPackageImpl#getPaginationFirst()
	 * @generated
	 */
	int PAGINATION_FIRST = 18;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGINATION_FIRST__ID = PAGINATION_LINK__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGINATION_FIRST__DOCUMENTATION = PAGINATION_LINK__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGINATION_FIRST__DOC_REF = PAGINATION_LINK__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGINATION_FIRST__DOC_FORMAT = PAGINATION_LINK__DOC_FORMAT;

	/**
	 * The feature id for the '<em><b>Doc Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGINATION_FIRST__DOC_CONTENTS = PAGINATION_LINK__DOC_CONTENTS;

	/**
	 * The feature id for the '<em><b>Doc Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGINATION_FIRST__DOC_SECTIONS = PAGINATION_LINK__DOC_SECTIONS;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGINATION_FIRST__MARKERS = PAGINATION_LINK__MARKERS;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGINATION_FIRST__ICON = PAGINATION_LINK__ICON;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGINATION_FIRST__URIS = PAGINATION_LINK__URIS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGINATION_FIRST__NAME = PAGINATION_LINK__NAME;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGINATION_FIRST__CHILDREN = PAGINATION_LINK__CHILDREN;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGINATION_FIRST__ATTRIBUTES = PAGINATION_LINK__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Element Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGINATION_FIRST__ELEMENT_ID = PAGINATION_LINK__ELEMENT_ID;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGINATION_FIRST__CLASSES = PAGINATION_LINK__CLASSES;

	/**
	 * The feature id for the '<em><b>Style</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGINATION_FIRST__STYLE = PAGINATION_LINK__STYLE;

	/**
	 * The feature id for the '<em><b>As</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGINATION_FIRST__AS = PAGINATION_LINK__AS;

	/**
	 * The feature id for the '<em><b>As Component</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGINATION_FIRST__AS_COMPONENT = PAGINATION_LINK__AS_COMPONENT;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGINATION_FIRST__CONTENT = PAGINATION_LINK__CONTENT;

	/**
	 * The feature id for the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGINATION_FIRST__HREF = PAGINATION_LINK__HREF;

	/**
	 * The feature id for the '<em><b>Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGINATION_FIRST__ACTIVE = PAGINATION_LINK__ACTIVE;

	/**
	 * The feature id for the '<em><b>Disabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGINATION_FIRST__DISABLED = PAGINATION_LINK__DISABLED;

	/**
	 * The number of structural features of the '<em>Pagination First</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGINATION_FIRST_FEATURE_COUNT = PAGINATION_LINK_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGINATION_FIRST___COLLECT__OBJECT_EREFERENCE_ELIST = PAGINATION_LINK___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGINATION_FIRST___GET_REFERRERS__EREFERENCE = PAGINATION_LINK___GET_REFERRERS__EREFERENCE;

	/**
	 * The number of operations of the '<em>Pagination First</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGINATION_FIRST_OPERATION_COUNT = PAGINATION_LINK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.impl.PaginationPrevImpl <em>Pagination Prev</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.impl.PaginationPrevImpl
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.impl.NavigationPackageImpl#getPaginationPrev()
	 * @generated
	 */
	int PAGINATION_PREV = 19;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGINATION_PREV__ID = PAGINATION_LINK__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGINATION_PREV__DOCUMENTATION = PAGINATION_LINK__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGINATION_PREV__DOC_REF = PAGINATION_LINK__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGINATION_PREV__DOC_FORMAT = PAGINATION_LINK__DOC_FORMAT;

	/**
	 * The feature id for the '<em><b>Doc Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGINATION_PREV__DOC_CONTENTS = PAGINATION_LINK__DOC_CONTENTS;

	/**
	 * The feature id for the '<em><b>Doc Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGINATION_PREV__DOC_SECTIONS = PAGINATION_LINK__DOC_SECTIONS;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGINATION_PREV__MARKERS = PAGINATION_LINK__MARKERS;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGINATION_PREV__ICON = PAGINATION_LINK__ICON;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGINATION_PREV__URIS = PAGINATION_LINK__URIS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGINATION_PREV__NAME = PAGINATION_LINK__NAME;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGINATION_PREV__CHILDREN = PAGINATION_LINK__CHILDREN;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGINATION_PREV__ATTRIBUTES = PAGINATION_LINK__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Element Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGINATION_PREV__ELEMENT_ID = PAGINATION_LINK__ELEMENT_ID;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGINATION_PREV__CLASSES = PAGINATION_LINK__CLASSES;

	/**
	 * The feature id for the '<em><b>Style</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGINATION_PREV__STYLE = PAGINATION_LINK__STYLE;

	/**
	 * The feature id for the '<em><b>As</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGINATION_PREV__AS = PAGINATION_LINK__AS;

	/**
	 * The feature id for the '<em><b>As Component</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGINATION_PREV__AS_COMPONENT = PAGINATION_LINK__AS_COMPONENT;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGINATION_PREV__CONTENT = PAGINATION_LINK__CONTENT;

	/**
	 * The feature id for the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGINATION_PREV__HREF = PAGINATION_LINK__HREF;

	/**
	 * The feature id for the '<em><b>Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGINATION_PREV__ACTIVE = PAGINATION_LINK__ACTIVE;

	/**
	 * The feature id for the '<em><b>Disabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGINATION_PREV__DISABLED = PAGINATION_LINK__DISABLED;

	/**
	 * The number of structural features of the '<em>Pagination Prev</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGINATION_PREV_FEATURE_COUNT = PAGINATION_LINK_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGINATION_PREV___COLLECT__OBJECT_EREFERENCE_ELIST = PAGINATION_LINK___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGINATION_PREV___GET_REFERRERS__EREFERENCE = PAGINATION_LINK___GET_REFERRERS__EREFERENCE;

	/**
	 * The number of operations of the '<em>Pagination Prev</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGINATION_PREV_OPERATION_COUNT = PAGINATION_LINK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.impl.PaginationEllipsisImpl <em>Pagination Ellipsis</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.impl.PaginationEllipsisImpl
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.impl.NavigationPackageImpl#getPaginationEllipsis()
	 * @generated
	 */
	int PAGINATION_ELLIPSIS = 20;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGINATION_ELLIPSIS__ID = PAGINATION_LINK__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGINATION_ELLIPSIS__DOCUMENTATION = PAGINATION_LINK__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGINATION_ELLIPSIS__DOC_REF = PAGINATION_LINK__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGINATION_ELLIPSIS__DOC_FORMAT = PAGINATION_LINK__DOC_FORMAT;

	/**
	 * The feature id for the '<em><b>Doc Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGINATION_ELLIPSIS__DOC_CONTENTS = PAGINATION_LINK__DOC_CONTENTS;

	/**
	 * The feature id for the '<em><b>Doc Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGINATION_ELLIPSIS__DOC_SECTIONS = PAGINATION_LINK__DOC_SECTIONS;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGINATION_ELLIPSIS__MARKERS = PAGINATION_LINK__MARKERS;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGINATION_ELLIPSIS__ICON = PAGINATION_LINK__ICON;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGINATION_ELLIPSIS__URIS = PAGINATION_LINK__URIS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGINATION_ELLIPSIS__NAME = PAGINATION_LINK__NAME;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGINATION_ELLIPSIS__CHILDREN = PAGINATION_LINK__CHILDREN;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGINATION_ELLIPSIS__ATTRIBUTES = PAGINATION_LINK__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Element Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGINATION_ELLIPSIS__ELEMENT_ID = PAGINATION_LINK__ELEMENT_ID;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGINATION_ELLIPSIS__CLASSES = PAGINATION_LINK__CLASSES;

	/**
	 * The feature id for the '<em><b>Style</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGINATION_ELLIPSIS__STYLE = PAGINATION_LINK__STYLE;

	/**
	 * The feature id for the '<em><b>As</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGINATION_ELLIPSIS__AS = PAGINATION_LINK__AS;

	/**
	 * The feature id for the '<em><b>As Component</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGINATION_ELLIPSIS__AS_COMPONENT = PAGINATION_LINK__AS_COMPONENT;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGINATION_ELLIPSIS__CONTENT = PAGINATION_LINK__CONTENT;

	/**
	 * The feature id for the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGINATION_ELLIPSIS__HREF = PAGINATION_LINK__HREF;

	/**
	 * The feature id for the '<em><b>Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGINATION_ELLIPSIS__ACTIVE = PAGINATION_LINK__ACTIVE;

	/**
	 * The feature id for the '<em><b>Disabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGINATION_ELLIPSIS__DISABLED = PAGINATION_LINK__DISABLED;

	/**
	 * The number of structural features of the '<em>Pagination Ellipsis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGINATION_ELLIPSIS_FEATURE_COUNT = PAGINATION_LINK_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGINATION_ELLIPSIS___COLLECT__OBJECT_EREFERENCE_ELIST = PAGINATION_LINK___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGINATION_ELLIPSIS___GET_REFERRERS__EREFERENCE = PAGINATION_LINK___GET_REFERRERS__EREFERENCE;

	/**
	 * The number of operations of the '<em>Pagination Ellipsis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGINATION_ELLIPSIS_OPERATION_COUNT = PAGINATION_LINK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.impl.PaginationNextImpl <em>Pagination Next</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.impl.PaginationNextImpl
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.impl.NavigationPackageImpl#getPaginationNext()
	 * @generated
	 */
	int PAGINATION_NEXT = 21;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGINATION_NEXT__ID = PAGINATION_LINK__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGINATION_NEXT__DOCUMENTATION = PAGINATION_LINK__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGINATION_NEXT__DOC_REF = PAGINATION_LINK__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGINATION_NEXT__DOC_FORMAT = PAGINATION_LINK__DOC_FORMAT;

	/**
	 * The feature id for the '<em><b>Doc Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGINATION_NEXT__DOC_CONTENTS = PAGINATION_LINK__DOC_CONTENTS;

	/**
	 * The feature id for the '<em><b>Doc Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGINATION_NEXT__DOC_SECTIONS = PAGINATION_LINK__DOC_SECTIONS;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGINATION_NEXT__MARKERS = PAGINATION_LINK__MARKERS;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGINATION_NEXT__ICON = PAGINATION_LINK__ICON;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGINATION_NEXT__URIS = PAGINATION_LINK__URIS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGINATION_NEXT__NAME = PAGINATION_LINK__NAME;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGINATION_NEXT__CHILDREN = PAGINATION_LINK__CHILDREN;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGINATION_NEXT__ATTRIBUTES = PAGINATION_LINK__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Element Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGINATION_NEXT__ELEMENT_ID = PAGINATION_LINK__ELEMENT_ID;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGINATION_NEXT__CLASSES = PAGINATION_LINK__CLASSES;

	/**
	 * The feature id for the '<em><b>Style</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGINATION_NEXT__STYLE = PAGINATION_LINK__STYLE;

	/**
	 * The feature id for the '<em><b>As</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGINATION_NEXT__AS = PAGINATION_LINK__AS;

	/**
	 * The feature id for the '<em><b>As Component</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGINATION_NEXT__AS_COMPONENT = PAGINATION_LINK__AS_COMPONENT;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGINATION_NEXT__CONTENT = PAGINATION_LINK__CONTENT;

	/**
	 * The feature id for the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGINATION_NEXT__HREF = PAGINATION_LINK__HREF;

	/**
	 * The feature id for the '<em><b>Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGINATION_NEXT__ACTIVE = PAGINATION_LINK__ACTIVE;

	/**
	 * The feature id for the '<em><b>Disabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGINATION_NEXT__DISABLED = PAGINATION_LINK__DISABLED;

	/**
	 * The number of structural features of the '<em>Pagination Next</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGINATION_NEXT_FEATURE_COUNT = PAGINATION_LINK_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGINATION_NEXT___COLLECT__OBJECT_EREFERENCE_ELIST = PAGINATION_LINK___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGINATION_NEXT___GET_REFERRERS__EREFERENCE = PAGINATION_LINK___GET_REFERRERS__EREFERENCE;

	/**
	 * The number of operations of the '<em>Pagination Next</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGINATION_NEXT_OPERATION_COUNT = PAGINATION_LINK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.impl.PaginationLastImpl <em>Pagination Last</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.impl.PaginationLastImpl
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.impl.NavigationPackageImpl#getPaginationLast()
	 * @generated
	 */
	int PAGINATION_LAST = 22;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGINATION_LAST__ID = PAGINATION_LINK__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGINATION_LAST__DOCUMENTATION = PAGINATION_LINK__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGINATION_LAST__DOC_REF = PAGINATION_LINK__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGINATION_LAST__DOC_FORMAT = PAGINATION_LINK__DOC_FORMAT;

	/**
	 * The feature id for the '<em><b>Doc Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGINATION_LAST__DOC_CONTENTS = PAGINATION_LINK__DOC_CONTENTS;

	/**
	 * The feature id for the '<em><b>Doc Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGINATION_LAST__DOC_SECTIONS = PAGINATION_LINK__DOC_SECTIONS;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGINATION_LAST__MARKERS = PAGINATION_LINK__MARKERS;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGINATION_LAST__ICON = PAGINATION_LINK__ICON;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGINATION_LAST__URIS = PAGINATION_LINK__URIS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGINATION_LAST__NAME = PAGINATION_LINK__NAME;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGINATION_LAST__CHILDREN = PAGINATION_LINK__CHILDREN;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGINATION_LAST__ATTRIBUTES = PAGINATION_LINK__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Element Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGINATION_LAST__ELEMENT_ID = PAGINATION_LINK__ELEMENT_ID;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGINATION_LAST__CLASSES = PAGINATION_LINK__CLASSES;

	/**
	 * The feature id for the '<em><b>Style</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGINATION_LAST__STYLE = PAGINATION_LINK__STYLE;

	/**
	 * The feature id for the '<em><b>As</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGINATION_LAST__AS = PAGINATION_LINK__AS;

	/**
	 * The feature id for the '<em><b>As Component</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGINATION_LAST__AS_COMPONENT = PAGINATION_LINK__AS_COMPONENT;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGINATION_LAST__CONTENT = PAGINATION_LINK__CONTENT;

	/**
	 * The feature id for the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGINATION_LAST__HREF = PAGINATION_LINK__HREF;

	/**
	 * The feature id for the '<em><b>Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGINATION_LAST__ACTIVE = PAGINATION_LINK__ACTIVE;

	/**
	 * The feature id for the '<em><b>Disabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGINATION_LAST__DISABLED = PAGINATION_LINK__DISABLED;

	/**
	 * The number of structural features of the '<em>Pagination Last</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGINATION_LAST_FEATURE_COUNT = PAGINATION_LINK_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGINATION_LAST___COLLECT__OBJECT_EREFERENCE_ELIST = PAGINATION_LINK___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGINATION_LAST___GET_REFERRERS__EREFERENCE = PAGINATION_LINK___GET_REFERRERS__EREFERENCE;

	/**
	 * The number of operations of the '<em>Pagination Last</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGINATION_LAST_OPERATION_COUNT = PAGINATION_LINK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.DropdownEntry <em>Dropdown Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.DropdownEntry
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.impl.NavigationPackageImpl#getDropdownEntry()
	 * @generated
	 */
	int DROPDOWN_ENTRY = 23;

	/**
	 * The number of structural features of the '<em>Dropdown Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROPDOWN_ENTRY_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Dropdown Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROPDOWN_ENTRY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.impl.DropdownImpl <em>Dropdown</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.impl.DropdownImpl
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.impl.NavigationPackageImpl#getDropdown()
	 * @generated
	 */
	int DROPDOWN = 24;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROPDOWN__ID = BootstrapPackage.BOOTSTRAP_COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROPDOWN__DOCUMENTATION = BootstrapPackage.BOOTSTRAP_COMPONENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROPDOWN__DOC_REF = BootstrapPackage.BOOTSTRAP_COMPONENT__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROPDOWN__DOC_FORMAT = BootstrapPackage.BOOTSTRAP_COMPONENT__DOC_FORMAT;

	/**
	 * The feature id for the '<em><b>Doc Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROPDOWN__DOC_CONTENTS = BootstrapPackage.BOOTSTRAP_COMPONENT__DOC_CONTENTS;

	/**
	 * The feature id for the '<em><b>Doc Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROPDOWN__DOC_SECTIONS = BootstrapPackage.BOOTSTRAP_COMPONENT__DOC_SECTIONS;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROPDOWN__MARKERS = BootstrapPackage.BOOTSTRAP_COMPONENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROPDOWN__ICON = BootstrapPackage.BOOTSTRAP_COMPONENT__ICON;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROPDOWN__URIS = BootstrapPackage.BOOTSTRAP_COMPONENT__URIS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROPDOWN__NAME = BootstrapPackage.BOOTSTRAP_COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROPDOWN__CHILDREN = BootstrapPackage.BOOTSTRAP_COMPONENT__CHILDREN;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROPDOWN__ATTRIBUTES = BootstrapPackage.BOOTSTRAP_COMPONENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Element Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROPDOWN__ELEMENT_ID = BootstrapPackage.BOOTSTRAP_COMPONENT__ELEMENT_ID;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROPDOWN__CLASSES = BootstrapPackage.BOOTSTRAP_COMPONENT__CLASSES;

	/**
	 * The feature id for the '<em><b>Style</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROPDOWN__STYLE = BootstrapPackage.BOOTSTRAP_COMPONENT__STYLE;

	/**
	 * The feature id for the '<em><b>As</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROPDOWN__AS = BootstrapPackage.BOOTSTRAP_COMPONENT__AS;

	/**
	 * The feature id for the '<em><b>As Component</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROPDOWN__AS_COMPONENT = BootstrapPackage.BOOTSTRAP_COMPONENT__AS_COMPONENT;

	/**
	 * The feature id for the '<em><b>Drop</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROPDOWN__DROP = BootstrapPackage.BOOTSTRAP_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Align</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROPDOWN__ALIGN = BootstrapPackage.BOOTSTRAP_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Toggle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROPDOWN__TOGGLE = BootstrapPackage.BOOTSTRAP_COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Menu</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROPDOWN__MENU = BootstrapPackage.BOOTSTRAP_COMPONENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Dropdown</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROPDOWN_FEATURE_COUNT = BootstrapPackage.BOOTSTRAP_COMPONENT_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROPDOWN___COLLECT__OBJECT_EREFERENCE_ELIST = BootstrapPackage.BOOTSTRAP_COMPONENT___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROPDOWN___GET_REFERRERS__EREFERENCE = BootstrapPackage.BOOTSTRAP_COMPONENT___GET_REFERRERS__EREFERENCE;

	/**
	 * The number of operations of the '<em>Dropdown</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROPDOWN_OPERATION_COUNT = BootstrapPackage.BOOTSTRAP_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.impl.DropdownToggleImpl <em>Dropdown Toggle</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.impl.DropdownToggleImpl
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.impl.NavigationPackageImpl#getDropdownToggle()
	 * @generated
	 */
	int DROPDOWN_TOGGLE = 25;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROPDOWN_TOGGLE__ID = BootstrapPackage.BOOTSTRAP_COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROPDOWN_TOGGLE__DOCUMENTATION = BootstrapPackage.BOOTSTRAP_COMPONENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROPDOWN_TOGGLE__DOC_REF = BootstrapPackage.BOOTSTRAP_COMPONENT__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROPDOWN_TOGGLE__DOC_FORMAT = BootstrapPackage.BOOTSTRAP_COMPONENT__DOC_FORMAT;

	/**
	 * The feature id for the '<em><b>Doc Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROPDOWN_TOGGLE__DOC_CONTENTS = BootstrapPackage.BOOTSTRAP_COMPONENT__DOC_CONTENTS;

	/**
	 * The feature id for the '<em><b>Doc Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROPDOWN_TOGGLE__DOC_SECTIONS = BootstrapPackage.BOOTSTRAP_COMPONENT__DOC_SECTIONS;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROPDOWN_TOGGLE__MARKERS = BootstrapPackage.BOOTSTRAP_COMPONENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROPDOWN_TOGGLE__ICON = BootstrapPackage.BOOTSTRAP_COMPONENT__ICON;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROPDOWN_TOGGLE__URIS = BootstrapPackage.BOOTSTRAP_COMPONENT__URIS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROPDOWN_TOGGLE__NAME = BootstrapPackage.BOOTSTRAP_COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROPDOWN_TOGGLE__CHILDREN = BootstrapPackage.BOOTSTRAP_COMPONENT__CHILDREN;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROPDOWN_TOGGLE__ATTRIBUTES = BootstrapPackage.BOOTSTRAP_COMPONENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Element Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROPDOWN_TOGGLE__ELEMENT_ID = BootstrapPackage.BOOTSTRAP_COMPONENT__ELEMENT_ID;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROPDOWN_TOGGLE__CLASSES = BootstrapPackage.BOOTSTRAP_COMPONENT__CLASSES;

	/**
	 * The feature id for the '<em><b>Style</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROPDOWN_TOGGLE__STYLE = BootstrapPackage.BOOTSTRAP_COMPONENT__STYLE;

	/**
	 * The feature id for the '<em><b>As</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROPDOWN_TOGGLE__AS = BootstrapPackage.BOOTSTRAP_COMPONENT__AS;

	/**
	 * The feature id for the '<em><b>As Component</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROPDOWN_TOGGLE__AS_COMPONENT = BootstrapPackage.BOOTSTRAP_COMPONENT__AS_COMPONENT;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROPDOWN_TOGGLE__CONTENT = BootstrapPackage.BOOTSTRAP_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Variant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROPDOWN_TOGGLE__VARIANT = BootstrapPackage.BOOTSTRAP_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROPDOWN_TOGGLE__SIZE = BootstrapPackage.BOOTSTRAP_COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Split</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROPDOWN_TOGGLE__SPLIT = BootstrapPackage.BOOTSTRAP_COMPONENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Dropdown Toggle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROPDOWN_TOGGLE_FEATURE_COUNT = BootstrapPackage.BOOTSTRAP_COMPONENT_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROPDOWN_TOGGLE___COLLECT__OBJECT_EREFERENCE_ELIST = BootstrapPackage.BOOTSTRAP_COMPONENT___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROPDOWN_TOGGLE___GET_REFERRERS__EREFERENCE = BootstrapPackage.BOOTSTRAP_COMPONENT___GET_REFERRERS__EREFERENCE;

	/**
	 * The number of operations of the '<em>Dropdown Toggle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROPDOWN_TOGGLE_OPERATION_COUNT = BootstrapPackage.BOOTSTRAP_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.impl.DropdownMenuImpl <em>Dropdown Menu</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.impl.DropdownMenuImpl
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.impl.NavigationPackageImpl#getDropdownMenu()
	 * @generated
	 */
	int DROPDOWN_MENU = 26;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROPDOWN_MENU__ID = BootstrapPackage.BOOTSTRAP_COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROPDOWN_MENU__DOCUMENTATION = BootstrapPackage.BOOTSTRAP_COMPONENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROPDOWN_MENU__DOC_REF = BootstrapPackage.BOOTSTRAP_COMPONENT__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROPDOWN_MENU__DOC_FORMAT = BootstrapPackage.BOOTSTRAP_COMPONENT__DOC_FORMAT;

	/**
	 * The feature id for the '<em><b>Doc Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROPDOWN_MENU__DOC_CONTENTS = BootstrapPackage.BOOTSTRAP_COMPONENT__DOC_CONTENTS;

	/**
	 * The feature id for the '<em><b>Doc Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROPDOWN_MENU__DOC_SECTIONS = BootstrapPackage.BOOTSTRAP_COMPONENT__DOC_SECTIONS;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROPDOWN_MENU__MARKERS = BootstrapPackage.BOOTSTRAP_COMPONENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROPDOWN_MENU__ICON = BootstrapPackage.BOOTSTRAP_COMPONENT__ICON;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROPDOWN_MENU__URIS = BootstrapPackage.BOOTSTRAP_COMPONENT__URIS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROPDOWN_MENU__NAME = BootstrapPackage.BOOTSTRAP_COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROPDOWN_MENU__CHILDREN = BootstrapPackage.BOOTSTRAP_COMPONENT__CHILDREN;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROPDOWN_MENU__ATTRIBUTES = BootstrapPackage.BOOTSTRAP_COMPONENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Element Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROPDOWN_MENU__ELEMENT_ID = BootstrapPackage.BOOTSTRAP_COMPONENT__ELEMENT_ID;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROPDOWN_MENU__CLASSES = BootstrapPackage.BOOTSTRAP_COMPONENT__CLASSES;

	/**
	 * The feature id for the '<em><b>Style</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROPDOWN_MENU__STYLE = BootstrapPackage.BOOTSTRAP_COMPONENT__STYLE;

	/**
	 * The feature id for the '<em><b>As</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROPDOWN_MENU__AS = BootstrapPackage.BOOTSTRAP_COMPONENT__AS;

	/**
	 * The feature id for the '<em><b>As Component</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROPDOWN_MENU__AS_COMPONENT = BootstrapPackage.BOOTSTRAP_COMPONENT__AS_COMPONENT;

	/**
	 * The feature id for the '<em><b>Variant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROPDOWN_MENU__VARIANT = BootstrapPackage.BOOTSTRAP_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Entries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROPDOWN_MENU__ENTRIES = BootstrapPackage.BOOTSTRAP_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Dropdown Menu</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROPDOWN_MENU_FEATURE_COUNT = BootstrapPackage.BOOTSTRAP_COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROPDOWN_MENU___COLLECT__OBJECT_EREFERENCE_ELIST = BootstrapPackage.BOOTSTRAP_COMPONENT___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROPDOWN_MENU___GET_REFERRERS__EREFERENCE = BootstrapPackage.BOOTSTRAP_COMPONENT___GET_REFERRERS__EREFERENCE;

	/**
	 * The number of operations of the '<em>Dropdown Menu</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROPDOWN_MENU_OPERATION_COUNT = BootstrapPackage.BOOTSTRAP_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.impl.DropdownItemImpl <em>Dropdown Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.impl.DropdownItemImpl
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.impl.NavigationPackageImpl#getDropdownItem()
	 * @generated
	 */
	int DROPDOWN_ITEM = 27;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROPDOWN_ITEM__ID = BootstrapPackage.BOOTSTRAP_COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROPDOWN_ITEM__DOCUMENTATION = BootstrapPackage.BOOTSTRAP_COMPONENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROPDOWN_ITEM__DOC_REF = BootstrapPackage.BOOTSTRAP_COMPONENT__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROPDOWN_ITEM__DOC_FORMAT = BootstrapPackage.BOOTSTRAP_COMPONENT__DOC_FORMAT;

	/**
	 * The feature id for the '<em><b>Doc Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROPDOWN_ITEM__DOC_CONTENTS = BootstrapPackage.BOOTSTRAP_COMPONENT__DOC_CONTENTS;

	/**
	 * The feature id for the '<em><b>Doc Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROPDOWN_ITEM__DOC_SECTIONS = BootstrapPackage.BOOTSTRAP_COMPONENT__DOC_SECTIONS;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROPDOWN_ITEM__MARKERS = BootstrapPackage.BOOTSTRAP_COMPONENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROPDOWN_ITEM__ICON = BootstrapPackage.BOOTSTRAP_COMPONENT__ICON;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROPDOWN_ITEM__URIS = BootstrapPackage.BOOTSTRAP_COMPONENT__URIS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROPDOWN_ITEM__NAME = BootstrapPackage.BOOTSTRAP_COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROPDOWN_ITEM__CHILDREN = BootstrapPackage.BOOTSTRAP_COMPONENT__CHILDREN;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROPDOWN_ITEM__ATTRIBUTES = BootstrapPackage.BOOTSTRAP_COMPONENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Element Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROPDOWN_ITEM__ELEMENT_ID = BootstrapPackage.BOOTSTRAP_COMPONENT__ELEMENT_ID;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROPDOWN_ITEM__CLASSES = BootstrapPackage.BOOTSTRAP_COMPONENT__CLASSES;

	/**
	 * The feature id for the '<em><b>Style</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROPDOWN_ITEM__STYLE = BootstrapPackage.BOOTSTRAP_COMPONENT__STYLE;

	/**
	 * The feature id for the '<em><b>As</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROPDOWN_ITEM__AS = BootstrapPackage.BOOTSTRAP_COMPONENT__AS;

	/**
	 * The feature id for the '<em><b>As Component</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROPDOWN_ITEM__AS_COMPONENT = BootstrapPackage.BOOTSTRAP_COMPONENT__AS_COMPONENT;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROPDOWN_ITEM__CONTENT = BootstrapPackage.BOOTSTRAP_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROPDOWN_ITEM__HREF = BootstrapPackage.BOOTSTRAP_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Event Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROPDOWN_ITEM__EVENT_KEY = BootstrapPackage.BOOTSTRAP_COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROPDOWN_ITEM__ACTIVE = BootstrapPackage.BOOTSTRAP_COMPONENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Disabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROPDOWN_ITEM__DISABLED = BootstrapPackage.BOOTSTRAP_COMPONENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Dropdown Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROPDOWN_ITEM_FEATURE_COUNT = BootstrapPackage.BOOTSTRAP_COMPONENT_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROPDOWN_ITEM___COLLECT__OBJECT_EREFERENCE_ELIST = BootstrapPackage.BOOTSTRAP_COMPONENT___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROPDOWN_ITEM___GET_REFERRERS__EREFERENCE = BootstrapPackage.BOOTSTRAP_COMPONENT___GET_REFERRERS__EREFERENCE;

	/**
	 * The number of operations of the '<em>Dropdown Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROPDOWN_ITEM_OPERATION_COUNT = BootstrapPackage.BOOTSTRAP_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.impl.DropdownHeaderImpl <em>Dropdown Header</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.impl.DropdownHeaderImpl
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.impl.NavigationPackageImpl#getDropdownHeader()
	 * @generated
	 */
	int DROPDOWN_HEADER = 28;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROPDOWN_HEADER__ID = BootstrapPackage.BOOTSTRAP_COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROPDOWN_HEADER__DOCUMENTATION = BootstrapPackage.BOOTSTRAP_COMPONENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROPDOWN_HEADER__DOC_REF = BootstrapPackage.BOOTSTRAP_COMPONENT__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROPDOWN_HEADER__DOC_FORMAT = BootstrapPackage.BOOTSTRAP_COMPONENT__DOC_FORMAT;

	/**
	 * The feature id for the '<em><b>Doc Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROPDOWN_HEADER__DOC_CONTENTS = BootstrapPackage.BOOTSTRAP_COMPONENT__DOC_CONTENTS;

	/**
	 * The feature id for the '<em><b>Doc Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROPDOWN_HEADER__DOC_SECTIONS = BootstrapPackage.BOOTSTRAP_COMPONENT__DOC_SECTIONS;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROPDOWN_HEADER__MARKERS = BootstrapPackage.BOOTSTRAP_COMPONENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROPDOWN_HEADER__ICON = BootstrapPackage.BOOTSTRAP_COMPONENT__ICON;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROPDOWN_HEADER__URIS = BootstrapPackage.BOOTSTRAP_COMPONENT__URIS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROPDOWN_HEADER__NAME = BootstrapPackage.BOOTSTRAP_COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROPDOWN_HEADER__CHILDREN = BootstrapPackage.BOOTSTRAP_COMPONENT__CHILDREN;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROPDOWN_HEADER__ATTRIBUTES = BootstrapPackage.BOOTSTRAP_COMPONENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Element Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROPDOWN_HEADER__ELEMENT_ID = BootstrapPackage.BOOTSTRAP_COMPONENT__ELEMENT_ID;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROPDOWN_HEADER__CLASSES = BootstrapPackage.BOOTSTRAP_COMPONENT__CLASSES;

	/**
	 * The feature id for the '<em><b>Style</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROPDOWN_HEADER__STYLE = BootstrapPackage.BOOTSTRAP_COMPONENT__STYLE;

	/**
	 * The feature id for the '<em><b>As</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROPDOWN_HEADER__AS = BootstrapPackage.BOOTSTRAP_COMPONENT__AS;

	/**
	 * The feature id for the '<em><b>As Component</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROPDOWN_HEADER__AS_COMPONENT = BootstrapPackage.BOOTSTRAP_COMPONENT__AS_COMPONENT;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROPDOWN_HEADER__CONTENT = BootstrapPackage.BOOTSTRAP_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Dropdown Header</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROPDOWN_HEADER_FEATURE_COUNT = BootstrapPackage.BOOTSTRAP_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROPDOWN_HEADER___COLLECT__OBJECT_EREFERENCE_ELIST = BootstrapPackage.BOOTSTRAP_COMPONENT___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROPDOWN_HEADER___GET_REFERRERS__EREFERENCE = BootstrapPackage.BOOTSTRAP_COMPONENT___GET_REFERRERS__EREFERENCE;

	/**
	 * The number of operations of the '<em>Dropdown Header</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROPDOWN_HEADER_OPERATION_COUNT = BootstrapPackage.BOOTSTRAP_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.impl.DropdownDividerImpl <em>Dropdown Divider</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.impl.DropdownDividerImpl
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.impl.NavigationPackageImpl#getDropdownDivider()
	 * @generated
	 */
	int DROPDOWN_DIVIDER = 29;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROPDOWN_DIVIDER__ID = BootstrapPackage.BOOTSTRAP_COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROPDOWN_DIVIDER__DOCUMENTATION = BootstrapPackage.BOOTSTRAP_COMPONENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROPDOWN_DIVIDER__DOC_REF = BootstrapPackage.BOOTSTRAP_COMPONENT__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROPDOWN_DIVIDER__DOC_FORMAT = BootstrapPackage.BOOTSTRAP_COMPONENT__DOC_FORMAT;

	/**
	 * The feature id for the '<em><b>Doc Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROPDOWN_DIVIDER__DOC_CONTENTS = BootstrapPackage.BOOTSTRAP_COMPONENT__DOC_CONTENTS;

	/**
	 * The feature id for the '<em><b>Doc Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROPDOWN_DIVIDER__DOC_SECTIONS = BootstrapPackage.BOOTSTRAP_COMPONENT__DOC_SECTIONS;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROPDOWN_DIVIDER__MARKERS = BootstrapPackage.BOOTSTRAP_COMPONENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROPDOWN_DIVIDER__ICON = BootstrapPackage.BOOTSTRAP_COMPONENT__ICON;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROPDOWN_DIVIDER__URIS = BootstrapPackage.BOOTSTRAP_COMPONENT__URIS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROPDOWN_DIVIDER__NAME = BootstrapPackage.BOOTSTRAP_COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROPDOWN_DIVIDER__CHILDREN = BootstrapPackage.BOOTSTRAP_COMPONENT__CHILDREN;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROPDOWN_DIVIDER__ATTRIBUTES = BootstrapPackage.BOOTSTRAP_COMPONENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Element Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROPDOWN_DIVIDER__ELEMENT_ID = BootstrapPackage.BOOTSTRAP_COMPONENT__ELEMENT_ID;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROPDOWN_DIVIDER__CLASSES = BootstrapPackage.BOOTSTRAP_COMPONENT__CLASSES;

	/**
	 * The feature id for the '<em><b>Style</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROPDOWN_DIVIDER__STYLE = BootstrapPackage.BOOTSTRAP_COMPONENT__STYLE;

	/**
	 * The feature id for the '<em><b>As</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROPDOWN_DIVIDER__AS = BootstrapPackage.BOOTSTRAP_COMPONENT__AS;

	/**
	 * The feature id for the '<em><b>As Component</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROPDOWN_DIVIDER__AS_COMPONENT = BootstrapPackage.BOOTSTRAP_COMPONENT__AS_COMPONENT;

	/**
	 * The number of structural features of the '<em>Dropdown Divider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROPDOWN_DIVIDER_FEATURE_COUNT = BootstrapPackage.BOOTSTRAP_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROPDOWN_DIVIDER___COLLECT__OBJECT_EREFERENCE_ELIST = BootstrapPackage.BOOTSTRAP_COMPONENT___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROPDOWN_DIVIDER___GET_REFERRERS__EREFERENCE = BootstrapPackage.BOOTSTRAP_COMPONENT___GET_REFERRERS__EREFERENCE;

	/**
	 * The number of operations of the '<em>Dropdown Divider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROPDOWN_DIVIDER_OPERATION_COUNT = BootstrapPackage.BOOTSTRAP_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.impl.DropdownItemTextImpl <em>Dropdown Item Text</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.impl.DropdownItemTextImpl
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.impl.NavigationPackageImpl#getDropdownItemText()
	 * @generated
	 */
	int DROPDOWN_ITEM_TEXT = 30;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROPDOWN_ITEM_TEXT__ID = BootstrapPackage.BOOTSTRAP_COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROPDOWN_ITEM_TEXT__DOCUMENTATION = BootstrapPackage.BOOTSTRAP_COMPONENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROPDOWN_ITEM_TEXT__DOC_REF = BootstrapPackage.BOOTSTRAP_COMPONENT__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROPDOWN_ITEM_TEXT__DOC_FORMAT = BootstrapPackage.BOOTSTRAP_COMPONENT__DOC_FORMAT;

	/**
	 * The feature id for the '<em><b>Doc Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROPDOWN_ITEM_TEXT__DOC_CONTENTS = BootstrapPackage.BOOTSTRAP_COMPONENT__DOC_CONTENTS;

	/**
	 * The feature id for the '<em><b>Doc Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROPDOWN_ITEM_TEXT__DOC_SECTIONS = BootstrapPackage.BOOTSTRAP_COMPONENT__DOC_SECTIONS;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROPDOWN_ITEM_TEXT__MARKERS = BootstrapPackage.BOOTSTRAP_COMPONENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROPDOWN_ITEM_TEXT__ICON = BootstrapPackage.BOOTSTRAP_COMPONENT__ICON;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROPDOWN_ITEM_TEXT__URIS = BootstrapPackage.BOOTSTRAP_COMPONENT__URIS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROPDOWN_ITEM_TEXT__NAME = BootstrapPackage.BOOTSTRAP_COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROPDOWN_ITEM_TEXT__CHILDREN = BootstrapPackage.BOOTSTRAP_COMPONENT__CHILDREN;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROPDOWN_ITEM_TEXT__ATTRIBUTES = BootstrapPackage.BOOTSTRAP_COMPONENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Element Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROPDOWN_ITEM_TEXT__ELEMENT_ID = BootstrapPackage.BOOTSTRAP_COMPONENT__ELEMENT_ID;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROPDOWN_ITEM_TEXT__CLASSES = BootstrapPackage.BOOTSTRAP_COMPONENT__CLASSES;

	/**
	 * The feature id for the '<em><b>Style</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROPDOWN_ITEM_TEXT__STYLE = BootstrapPackage.BOOTSTRAP_COMPONENT__STYLE;

	/**
	 * The feature id for the '<em><b>As</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROPDOWN_ITEM_TEXT__AS = BootstrapPackage.BOOTSTRAP_COMPONENT__AS;

	/**
	 * The feature id for the '<em><b>As Component</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROPDOWN_ITEM_TEXT__AS_COMPONENT = BootstrapPackage.BOOTSTRAP_COMPONENT__AS_COMPONENT;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROPDOWN_ITEM_TEXT__CONTENT = BootstrapPackage.BOOTSTRAP_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Dropdown Item Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROPDOWN_ITEM_TEXT_FEATURE_COUNT = BootstrapPackage.BOOTSTRAP_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROPDOWN_ITEM_TEXT___COLLECT__OBJECT_EREFERENCE_ELIST = BootstrapPackage.BOOTSTRAP_COMPONENT___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROPDOWN_ITEM_TEXT___GET_REFERRERS__EREFERENCE = BootstrapPackage.BOOTSTRAP_COMPONENT___GET_REFERRERS__EREFERENCE;

	/**
	 * The number of operations of the '<em>Dropdown Item Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROPDOWN_ITEM_TEXT_OPERATION_COUNT = BootstrapPackage.BOOTSTRAP_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.impl.DropdownButtonImpl <em>Dropdown Button</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.impl.DropdownButtonImpl
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.impl.NavigationPackageImpl#getDropdownButton()
	 * @generated
	 */
	int DROPDOWN_BUTTON = 31;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROPDOWN_BUTTON__ID = BootstrapPackage.BOOTSTRAP_COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROPDOWN_BUTTON__DOCUMENTATION = BootstrapPackage.BOOTSTRAP_COMPONENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROPDOWN_BUTTON__DOC_REF = BootstrapPackage.BOOTSTRAP_COMPONENT__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROPDOWN_BUTTON__DOC_FORMAT = BootstrapPackage.BOOTSTRAP_COMPONENT__DOC_FORMAT;

	/**
	 * The feature id for the '<em><b>Doc Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROPDOWN_BUTTON__DOC_CONTENTS = BootstrapPackage.BOOTSTRAP_COMPONENT__DOC_CONTENTS;

	/**
	 * The feature id for the '<em><b>Doc Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROPDOWN_BUTTON__DOC_SECTIONS = BootstrapPackage.BOOTSTRAP_COMPONENT__DOC_SECTIONS;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROPDOWN_BUTTON__MARKERS = BootstrapPackage.BOOTSTRAP_COMPONENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROPDOWN_BUTTON__ICON = BootstrapPackage.BOOTSTRAP_COMPONENT__ICON;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROPDOWN_BUTTON__URIS = BootstrapPackage.BOOTSTRAP_COMPONENT__URIS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROPDOWN_BUTTON__NAME = BootstrapPackage.BOOTSTRAP_COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROPDOWN_BUTTON__CHILDREN = BootstrapPackage.BOOTSTRAP_COMPONENT__CHILDREN;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROPDOWN_BUTTON__ATTRIBUTES = BootstrapPackage.BOOTSTRAP_COMPONENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Element Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROPDOWN_BUTTON__ELEMENT_ID = BootstrapPackage.BOOTSTRAP_COMPONENT__ELEMENT_ID;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROPDOWN_BUTTON__CLASSES = BootstrapPackage.BOOTSTRAP_COMPONENT__CLASSES;

	/**
	 * The feature id for the '<em><b>Style</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROPDOWN_BUTTON__STYLE = BootstrapPackage.BOOTSTRAP_COMPONENT__STYLE;

	/**
	 * The feature id for the '<em><b>As</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROPDOWN_BUTTON__AS = BootstrapPackage.BOOTSTRAP_COMPONENT__AS;

	/**
	 * The feature id for the '<em><b>As Component</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROPDOWN_BUTTON__AS_COMPONENT = BootstrapPackage.BOOTSTRAP_COMPONENT__AS_COMPONENT;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROPDOWN_BUTTON__TITLE = BootstrapPackage.BOOTSTRAP_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Title Node</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROPDOWN_BUTTON__TITLE_NODE = BootstrapPackage.BOOTSTRAP_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Variant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROPDOWN_BUTTON__VARIANT = BootstrapPackage.BOOTSTRAP_COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROPDOWN_BUTTON__SIZE = BootstrapPackage.BOOTSTRAP_COMPONENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Drop</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROPDOWN_BUTTON__DROP = BootstrapPackage.BOOTSTRAP_COMPONENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Entries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROPDOWN_BUTTON__ENTRIES = BootstrapPackage.BOOTSTRAP_COMPONENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Dropdown Button</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROPDOWN_BUTTON_FEATURE_COUNT = BootstrapPackage.BOOTSTRAP_COMPONENT_FEATURE_COUNT + 6;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROPDOWN_BUTTON___COLLECT__OBJECT_EREFERENCE_ELIST = BootstrapPackage.BOOTSTRAP_COMPONENT___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROPDOWN_BUTTON___GET_REFERRERS__EREFERENCE = BootstrapPackage.BOOTSTRAP_COMPONENT___GET_REFERRERS__EREFERENCE;

	/**
	 * The number of operations of the '<em>Dropdown Button</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROPDOWN_BUTTON_OPERATION_COUNT = BootstrapPackage.BOOTSTRAP_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.impl.SplitButtonImpl <em>Split Button</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.impl.SplitButtonImpl
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.impl.NavigationPackageImpl#getSplitButton()
	 * @generated
	 */
	int SPLIT_BUTTON = 32;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_BUTTON__ID = DROPDOWN_BUTTON__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_BUTTON__DOCUMENTATION = DROPDOWN_BUTTON__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_BUTTON__DOC_REF = DROPDOWN_BUTTON__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_BUTTON__DOC_FORMAT = DROPDOWN_BUTTON__DOC_FORMAT;

	/**
	 * The feature id for the '<em><b>Doc Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_BUTTON__DOC_CONTENTS = DROPDOWN_BUTTON__DOC_CONTENTS;

	/**
	 * The feature id for the '<em><b>Doc Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_BUTTON__DOC_SECTIONS = DROPDOWN_BUTTON__DOC_SECTIONS;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_BUTTON__MARKERS = DROPDOWN_BUTTON__MARKERS;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_BUTTON__ICON = DROPDOWN_BUTTON__ICON;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_BUTTON__URIS = DROPDOWN_BUTTON__URIS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_BUTTON__NAME = DROPDOWN_BUTTON__NAME;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_BUTTON__CHILDREN = DROPDOWN_BUTTON__CHILDREN;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_BUTTON__ATTRIBUTES = DROPDOWN_BUTTON__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Element Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_BUTTON__ELEMENT_ID = DROPDOWN_BUTTON__ELEMENT_ID;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_BUTTON__CLASSES = DROPDOWN_BUTTON__CLASSES;

	/**
	 * The feature id for the '<em><b>Style</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_BUTTON__STYLE = DROPDOWN_BUTTON__STYLE;

	/**
	 * The feature id for the '<em><b>As</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_BUTTON__AS = DROPDOWN_BUTTON__AS;

	/**
	 * The feature id for the '<em><b>As Component</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_BUTTON__AS_COMPONENT = DROPDOWN_BUTTON__AS_COMPONENT;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_BUTTON__TITLE = DROPDOWN_BUTTON__TITLE;

	/**
	 * The feature id for the '<em><b>Title Node</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_BUTTON__TITLE_NODE = DROPDOWN_BUTTON__TITLE_NODE;

	/**
	 * The feature id for the '<em><b>Variant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_BUTTON__VARIANT = DROPDOWN_BUTTON__VARIANT;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_BUTTON__SIZE = DROPDOWN_BUTTON__SIZE;

	/**
	 * The feature id for the '<em><b>Drop</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_BUTTON__DROP = DROPDOWN_BUTTON__DROP;

	/**
	 * The feature id for the '<em><b>Entries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_BUTTON__ENTRIES = DROPDOWN_BUTTON__ENTRIES;

	/**
	 * The feature id for the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_BUTTON__HREF = DROPDOWN_BUTTON_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Split Button</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_BUTTON_FEATURE_COUNT = DROPDOWN_BUTTON_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_BUTTON___COLLECT__OBJECT_EREFERENCE_ELIST = DROPDOWN_BUTTON___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_BUTTON___GET_REFERRERS__EREFERENCE = DROPDOWN_BUTTON___GET_REFERRERS__EREFERENCE;

	/**
	 * The number of operations of the '<em>Split Button</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_BUTTON_OPERATION_COUNT = DROPDOWN_BUTTON_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.NavVariant <em>Nav Variant</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.NavVariant
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.impl.NavigationPackageImpl#getNavVariant()
	 * @generated
	 */
	int NAV_VARIANT = 33;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.NavbarTheme <em>Navbar Theme</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.NavbarTheme
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.impl.NavigationPackageImpl#getNavbarTheme()
	 * @generated
	 */
	int NAVBAR_THEME = 34;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.Fixed <em>Fixed</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.Fixed
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.impl.NavigationPackageImpl#getFixed()
	 * @generated
	 */
	int FIXED = 35;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.Drop <em>Drop</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.Drop
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.impl.NavigationPackageImpl#getDrop()
	 * @generated
	 */
	int DROP = 36;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.Align <em>Align</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.Align
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.impl.NavigationPackageImpl#getAlign()
	 * @generated
	 */
	int ALIGN = 37;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.MenuVariant <em>Menu Variant</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.MenuVariant
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.impl.NavigationPackageImpl#getMenuVariant()
	 * @generated
	 */
	int MENU_VARIANT = 38;


	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.NavEntry <em>Nav Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Nav Entry</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.NavEntry
	 * @generated
	 */
	EClass getNavEntry();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.Nav <em>Nav</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Nav</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.Nav
	 * @generated
	 */
	EClass getNav();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.Nav#getVariant <em>Variant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Variant</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.Nav#getVariant()
	 * @see #getNav()
	 * @generated
	 */
	EAttribute getNav_Variant();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.Nav#getActiveKey <em>Active Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Active Key</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.Nav#getActiveKey()
	 * @see #getNav()
	 * @generated
	 */
	EAttribute getNav_ActiveKey();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.Nav#getDefaultActiveKey <em>Default Active Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Active Key</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.Nav#getDefaultActiveKey()
	 * @see #getNav()
	 * @generated
	 */
	EAttribute getNav_DefaultActiveKey();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.Nav#isFill <em>Fill</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fill</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.Nav#isFill()
	 * @see #getNav()
	 * @generated
	 */
	EAttribute getNav_Fill();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.Nav#isJustify <em>Justify</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Justify</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.Nav#isJustify()
	 * @see #getNav()
	 * @generated
	 */
	EAttribute getNav_Justify();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.Nav#getEntries <em>Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entries</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.Nav#getEntries()
	 * @see #getNav()
	 * @generated
	 */
	EReference getNav_Entries();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.NavItem <em>Nav Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Nav Item</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.NavItem
	 * @generated
	 */
	EClass getNavItem();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.NavItem#getLink <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Link</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.NavItem#getLink()
	 * @see #getNavItem()
	 * @generated
	 */
	EReference getNavItem_Link();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.NavLink <em>Nav Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Nav Link</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.NavLink
	 * @generated
	 */
	EClass getNavLink();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.NavLink#getHref <em>Href</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Href</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.NavLink#getHref()
	 * @see #getNavLink()
	 * @generated
	 */
	EAttribute getNavLink_Href();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.NavLink#getEventKey <em>Event Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Event Key</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.NavLink#getEventKey()
	 * @see #getNavLink()
	 * @generated
	 */
	EAttribute getNavLink_EventKey();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.NavLink#isActive <em>Active</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Active</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.NavLink#isActive()
	 * @see #getNavLink()
	 * @generated
	 */
	EAttribute getNavLink_Active();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.NavLink#isDisabled <em>Disabled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Disabled</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.NavLink#isDisabled()
	 * @see #getNavLink()
	 * @generated
	 */
	EAttribute getNavLink_Disabled();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.NavDropdown <em>Nav Dropdown</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Nav Dropdown</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.NavDropdown
	 * @generated
	 */
	EClass getNavDropdown();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.NavDropdown#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.NavDropdown#getTitle()
	 * @see #getNavDropdown()
	 * @generated
	 */
	EAttribute getNavDropdown_Title();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.NavDropdown#getTitleNode <em>Title Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Title Node</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.NavDropdown#getTitleNode()
	 * @see #getNavDropdown()
	 * @generated
	 */
	EReference getNavDropdown_TitleNode();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.NavDropdown#getEntries <em>Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entries</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.NavDropdown#getEntries()
	 * @see #getNavDropdown()
	 * @generated
	 */
	EReference getNavDropdown_Entries();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.Navbar <em>Navbar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Navbar</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.Navbar
	 * @generated
	 */
	EClass getNavbar();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.Navbar#getBg <em>Bg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bg</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.Navbar#getBg()
	 * @see #getNavbar()
	 * @generated
	 */
	EAttribute getNavbar_Bg();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.Navbar#getTheme <em>Theme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Theme</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.Navbar#getTheme()
	 * @see #getNavbar()
	 * @generated
	 */
	EAttribute getNavbar_Theme();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.Navbar#isAlwaysExpanded <em>Always Expanded</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Always Expanded</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.Navbar#isAlwaysExpanded()
	 * @see #getNavbar()
	 * @generated
	 */
	EAttribute getNavbar_AlwaysExpanded();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.Navbar#getExpand <em>Expand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expand</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.Navbar#getExpand()
	 * @see #getNavbar()
	 * @generated
	 */
	EAttribute getNavbar_Expand();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.Navbar#getFixed <em>Fixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fixed</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.Navbar#getFixed()
	 * @see #getNavbar()
	 * @generated
	 */
	EAttribute getNavbar_Fixed();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.Navbar#getSticky <em>Sticky</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sticky</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.Navbar#getSticky()
	 * @see #getNavbar()
	 * @generated
	 */
	EAttribute getNavbar_Sticky();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.Navbar#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Content</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.Navbar#getContent()
	 * @see #getNavbar()
	 * @generated
	 */
	EReference getNavbar_Content();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.NavbarBrand <em>Navbar Brand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Navbar Brand</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.NavbarBrand
	 * @generated
	 */
	EClass getNavbarBrand();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.NavbarBrand#getHref <em>Href</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Href</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.NavbarBrand#getHref()
	 * @see #getNavbarBrand()
	 * @generated
	 */
	EAttribute getNavbarBrand_Href();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.NavbarToggle <em>Navbar Toggle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Navbar Toggle</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.NavbarToggle
	 * @generated
	 */
	EClass getNavbarToggle();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.NavbarToggle#getControls <em>Controls</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Controls</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.NavbarToggle#getControls()
	 * @see #getNavbarToggle()
	 * @generated
	 */
	EAttribute getNavbarToggle_Controls();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.NavbarCollapse <em>Navbar Collapse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Navbar Collapse</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.NavbarCollapse
	 * @generated
	 */
	EClass getNavbarCollapse();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.NavbarCollapse#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Content</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.NavbarCollapse#getContent()
	 * @see #getNavbarCollapse()
	 * @generated
	 */
	EReference getNavbarCollapse_Content();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.NavbarText <em>Navbar Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Navbar Text</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.NavbarText
	 * @generated
	 */
	EClass getNavbarText();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.Tabs <em>Tabs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tabs</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.Tabs
	 * @generated
	 */
	EClass getTabs();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.Tabs#getDefaultActiveKey <em>Default Active Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Active Key</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.Tabs#getDefaultActiveKey()
	 * @see #getTabs()
	 * @generated
	 */
	EAttribute getTabs_DefaultActiveKey();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.Tabs#getActiveKey <em>Active Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Active Key</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.Tabs#getActiveKey()
	 * @see #getTabs()
	 * @generated
	 */
	EAttribute getTabs_ActiveKey();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.Tabs#getVariant <em>Variant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Variant</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.Tabs#getVariant()
	 * @see #getTabs()
	 * @generated
	 */
	EAttribute getTabs_Variant();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.Tabs#isFill <em>Fill</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fill</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.Tabs#isFill()
	 * @see #getTabs()
	 * @generated
	 */
	EAttribute getTabs_Fill();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.Tabs#isJustify <em>Justify</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Justify</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.Tabs#isJustify()
	 * @see #getTabs()
	 * @generated
	 */
	EAttribute getTabs_Justify();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.Tabs#isMountOnEnter <em>Mount On Enter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mount On Enter</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.Tabs#isMountOnEnter()
	 * @see #getTabs()
	 * @generated
	 */
	EAttribute getTabs_MountOnEnter();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.Tabs#isUnmountOnExit <em>Unmount On Exit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unmount On Exit</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.Tabs#isUnmountOnExit()
	 * @see #getTabs()
	 * @generated
	 */
	EAttribute getTabs_UnmountOnExit();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.Tabs#getTabs <em>Tabs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tabs</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.Tabs#getTabs()
	 * @see #getTabs()
	 * @generated
	 */
	EReference getTabs_Tabs();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.Tab <em>Tab</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tab</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.Tab
	 * @generated
	 */
	EClass getTab();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.Tab#getEventKey <em>Event Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Event Key</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.Tab#getEventKey()
	 * @see #getTab()
	 * @generated
	 */
	EAttribute getTab_EventKey();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.Tab#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.Tab#getTitle()
	 * @see #getTab()
	 * @generated
	 */
	EAttribute getTab_Title();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.Tab#getTitleNode <em>Title Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Title Node</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.Tab#getTitleNode()
	 * @see #getTab()
	 * @generated
	 */
	EReference getTab_TitleNode();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.Tab#isDisabled <em>Disabled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Disabled</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.Tab#isDisabled()
	 * @see #getTab()
	 * @generated
	 */
	EAttribute getTab_Disabled();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.Breadcrumb <em>Breadcrumb</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Breadcrumb</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.Breadcrumb
	 * @generated
	 */
	EClass getBreadcrumb();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.Breadcrumb#getItems <em>Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Items</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.Breadcrumb#getItems()
	 * @see #getBreadcrumb()
	 * @generated
	 */
	EReference getBreadcrumb_Items();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.BreadcrumbItem <em>Breadcrumb Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Breadcrumb Item</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.BreadcrumbItem
	 * @generated
	 */
	EClass getBreadcrumbItem();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.BreadcrumbItem#getHref <em>Href</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Href</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.BreadcrumbItem#getHref()
	 * @see #getBreadcrumbItem()
	 * @generated
	 */
	EAttribute getBreadcrumbItem_Href();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.BreadcrumbItem#isActive <em>Active</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Active</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.BreadcrumbItem#isActive()
	 * @see #getBreadcrumbItem()
	 * @generated
	 */
	EAttribute getBreadcrumbItem_Active();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.PaginationEntry <em>Pagination Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pagination Entry</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.PaginationEntry
	 * @generated
	 */
	EClass getPaginationEntry();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.Pagination <em>Pagination</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pagination</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.Pagination
	 * @generated
	 */
	EClass getPagination();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.Pagination#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.Pagination#getSize()
	 * @see #getPagination()
	 * @generated
	 */
	EAttribute getPagination_Size();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.Pagination#getEntries <em>Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entries</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.Pagination#getEntries()
	 * @see #getPagination()
	 * @generated
	 */
	EReference getPagination_Entries();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.PaginationLink <em>Pagination Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pagination Link</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.PaginationLink
	 * @generated
	 */
	EClass getPaginationLink();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.PaginationLink#getHref <em>Href</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Href</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.PaginationLink#getHref()
	 * @see #getPaginationLink()
	 * @generated
	 */
	EAttribute getPaginationLink_Href();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.PaginationLink#isActive <em>Active</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Active</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.PaginationLink#isActive()
	 * @see #getPaginationLink()
	 * @generated
	 */
	EAttribute getPaginationLink_Active();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.PaginationLink#isDisabled <em>Disabled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Disabled</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.PaginationLink#isDisabled()
	 * @see #getPaginationLink()
	 * @generated
	 */
	EAttribute getPaginationLink_Disabled();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.PaginationItem <em>Pagination Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pagination Item</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.PaginationItem
	 * @generated
	 */
	EClass getPaginationItem();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.PaginationFirst <em>Pagination First</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pagination First</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.PaginationFirst
	 * @generated
	 */
	EClass getPaginationFirst();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.PaginationPrev <em>Pagination Prev</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pagination Prev</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.PaginationPrev
	 * @generated
	 */
	EClass getPaginationPrev();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.PaginationEllipsis <em>Pagination Ellipsis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pagination Ellipsis</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.PaginationEllipsis
	 * @generated
	 */
	EClass getPaginationEllipsis();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.PaginationNext <em>Pagination Next</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pagination Next</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.PaginationNext
	 * @generated
	 */
	EClass getPaginationNext();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.PaginationLast <em>Pagination Last</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pagination Last</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.PaginationLast
	 * @generated
	 */
	EClass getPaginationLast();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.DropdownEntry <em>Dropdown Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dropdown Entry</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.DropdownEntry
	 * @generated
	 */
	EClass getDropdownEntry();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.Dropdown <em>Dropdown</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dropdown</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.Dropdown
	 * @generated
	 */
	EClass getDropdown();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.Dropdown#getDrop <em>Drop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Drop</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.Dropdown#getDrop()
	 * @see #getDropdown()
	 * @generated
	 */
	EAttribute getDropdown_Drop();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.Dropdown#getAlign <em>Align</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Align</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.Dropdown#getAlign()
	 * @see #getDropdown()
	 * @generated
	 */
	EAttribute getDropdown_Align();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.Dropdown#getToggle <em>Toggle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Toggle</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.Dropdown#getToggle()
	 * @see #getDropdown()
	 * @generated
	 */
	EReference getDropdown_Toggle();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.Dropdown#getMenu <em>Menu</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Menu</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.Dropdown#getMenu()
	 * @see #getDropdown()
	 * @generated
	 */
	EReference getDropdown_Menu();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.DropdownToggle <em>Dropdown Toggle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dropdown Toggle</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.DropdownToggle
	 * @generated
	 */
	EClass getDropdownToggle();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.DropdownToggle#getVariant <em>Variant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Variant</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.DropdownToggle#getVariant()
	 * @see #getDropdownToggle()
	 * @generated
	 */
	EAttribute getDropdownToggle_Variant();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.DropdownToggle#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.DropdownToggle#getSize()
	 * @see #getDropdownToggle()
	 * @generated
	 */
	EAttribute getDropdownToggle_Size();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.DropdownToggle#isSplit <em>Split</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Split</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.DropdownToggle#isSplit()
	 * @see #getDropdownToggle()
	 * @generated
	 */
	EAttribute getDropdownToggle_Split();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.DropdownMenu <em>Dropdown Menu</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dropdown Menu</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.DropdownMenu
	 * @generated
	 */
	EClass getDropdownMenu();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.DropdownMenu#getVariant <em>Variant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Variant</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.DropdownMenu#getVariant()
	 * @see #getDropdownMenu()
	 * @generated
	 */
	EAttribute getDropdownMenu_Variant();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.DropdownMenu#getEntries <em>Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entries</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.DropdownMenu#getEntries()
	 * @see #getDropdownMenu()
	 * @generated
	 */
	EReference getDropdownMenu_Entries();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.DropdownItem <em>Dropdown Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dropdown Item</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.DropdownItem
	 * @generated
	 */
	EClass getDropdownItem();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.DropdownItem#getHref <em>Href</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Href</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.DropdownItem#getHref()
	 * @see #getDropdownItem()
	 * @generated
	 */
	EAttribute getDropdownItem_Href();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.DropdownItem#getEventKey <em>Event Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Event Key</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.DropdownItem#getEventKey()
	 * @see #getDropdownItem()
	 * @generated
	 */
	EAttribute getDropdownItem_EventKey();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.DropdownItem#isActive <em>Active</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Active</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.DropdownItem#isActive()
	 * @see #getDropdownItem()
	 * @generated
	 */
	EAttribute getDropdownItem_Active();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.DropdownItem#isDisabled <em>Disabled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Disabled</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.DropdownItem#isDisabled()
	 * @see #getDropdownItem()
	 * @generated
	 */
	EAttribute getDropdownItem_Disabled();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.DropdownHeader <em>Dropdown Header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dropdown Header</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.DropdownHeader
	 * @generated
	 */
	EClass getDropdownHeader();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.DropdownDivider <em>Dropdown Divider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dropdown Divider</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.DropdownDivider
	 * @generated
	 */
	EClass getDropdownDivider();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.DropdownItemText <em>Dropdown Item Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dropdown Item Text</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.DropdownItemText
	 * @generated
	 */
	EClass getDropdownItemText();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.DropdownButton <em>Dropdown Button</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dropdown Button</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.DropdownButton
	 * @generated
	 */
	EClass getDropdownButton();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.DropdownButton#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.DropdownButton#getTitle()
	 * @see #getDropdownButton()
	 * @generated
	 */
	EAttribute getDropdownButton_Title();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.DropdownButton#getTitleNode <em>Title Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Title Node</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.DropdownButton#getTitleNode()
	 * @see #getDropdownButton()
	 * @generated
	 */
	EReference getDropdownButton_TitleNode();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.DropdownButton#getVariant <em>Variant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Variant</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.DropdownButton#getVariant()
	 * @see #getDropdownButton()
	 * @generated
	 */
	EAttribute getDropdownButton_Variant();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.DropdownButton#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.DropdownButton#getSize()
	 * @see #getDropdownButton()
	 * @generated
	 */
	EAttribute getDropdownButton_Size();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.DropdownButton#getDrop <em>Drop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Drop</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.DropdownButton#getDrop()
	 * @see #getDropdownButton()
	 * @generated
	 */
	EAttribute getDropdownButton_Drop();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.DropdownButton#getEntries <em>Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entries</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.DropdownButton#getEntries()
	 * @see #getDropdownButton()
	 * @generated
	 */
	EReference getDropdownButton_Entries();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.SplitButton <em>Split Button</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Split Button</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.SplitButton
	 * @generated
	 */
	EClass getSplitButton();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.SplitButton#getHref <em>Href</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Href</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.SplitButton#getHref()
	 * @see #getSplitButton()
	 * @generated
	 */
	EAttribute getSplitButton_Href();

	/**
	 * Returns the meta object for enum '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.NavVariant <em>Nav Variant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Nav Variant</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.NavVariant
	 * @generated
	 */
	EEnum getNavVariant();

	/**
	 * Returns the meta object for enum '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.NavbarTheme <em>Navbar Theme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Navbar Theme</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.NavbarTheme
	 * @generated
	 */
	EEnum getNavbarTheme();

	/**
	 * Returns the meta object for enum '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.Fixed <em>Fixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Fixed</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.Fixed
	 * @generated
	 */
	EEnum getFixed();

	/**
	 * Returns the meta object for enum '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.Drop <em>Drop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Drop</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.Drop
	 * @generated
	 */
	EEnum getDrop();

	/**
	 * Returns the meta object for enum '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.Align <em>Align</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Align</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.Align
	 * @generated
	 */
	EEnum getAlign();

	/**
	 * Returns the meta object for enum '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.MenuVariant <em>Menu Variant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Menu Variant</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.MenuVariant
	 * @generated
	 */
	EEnum getMenuVariant();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	NavigationFactory getNavigationFactory();

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
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.NavEntry <em>Nav Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.NavEntry
		 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.impl.NavigationPackageImpl#getNavEntry()
		 * @generated
		 */
		EClass NAV_ENTRY = eINSTANCE.getNavEntry();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.impl.NavImpl <em>Nav</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.impl.NavImpl
		 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.impl.NavigationPackageImpl#getNav()
		 * @generated
		 */
		EClass NAV = eINSTANCE.getNav();

		/**
		 * The meta object literal for the '<em><b>Variant</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAV__VARIANT = eINSTANCE.getNav_Variant();

		/**
		 * The meta object literal for the '<em><b>Active Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAV__ACTIVE_KEY = eINSTANCE.getNav_ActiveKey();

		/**
		 * The meta object literal for the '<em><b>Default Active Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAV__DEFAULT_ACTIVE_KEY = eINSTANCE.getNav_DefaultActiveKey();

		/**
		 * The meta object literal for the '<em><b>Fill</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAV__FILL = eINSTANCE.getNav_Fill();

		/**
		 * The meta object literal for the '<em><b>Justify</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAV__JUSTIFY = eINSTANCE.getNav_Justify();

		/**
		 * The meta object literal for the '<em><b>Entries</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NAV__ENTRIES = eINSTANCE.getNav_Entries();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.impl.NavItemImpl <em>Nav Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.impl.NavItemImpl
		 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.impl.NavigationPackageImpl#getNavItem()
		 * @generated
		 */
		EClass NAV_ITEM = eINSTANCE.getNavItem();

		/**
		 * The meta object literal for the '<em><b>Link</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NAV_ITEM__LINK = eINSTANCE.getNavItem_Link();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.impl.NavLinkImpl <em>Nav Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.impl.NavLinkImpl
		 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.impl.NavigationPackageImpl#getNavLink()
		 * @generated
		 */
		EClass NAV_LINK = eINSTANCE.getNavLink();

		/**
		 * The meta object literal for the '<em><b>Href</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAV_LINK__HREF = eINSTANCE.getNavLink_Href();

		/**
		 * The meta object literal for the '<em><b>Event Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAV_LINK__EVENT_KEY = eINSTANCE.getNavLink_EventKey();

		/**
		 * The meta object literal for the '<em><b>Active</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAV_LINK__ACTIVE = eINSTANCE.getNavLink_Active();

		/**
		 * The meta object literal for the '<em><b>Disabled</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAV_LINK__DISABLED = eINSTANCE.getNavLink_Disabled();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.impl.NavDropdownImpl <em>Nav Dropdown</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.impl.NavDropdownImpl
		 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.impl.NavigationPackageImpl#getNavDropdown()
		 * @generated
		 */
		EClass NAV_DROPDOWN = eINSTANCE.getNavDropdown();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAV_DROPDOWN__TITLE = eINSTANCE.getNavDropdown_Title();

		/**
		 * The meta object literal for the '<em><b>Title Node</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NAV_DROPDOWN__TITLE_NODE = eINSTANCE.getNavDropdown_TitleNode();

		/**
		 * The meta object literal for the '<em><b>Entries</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NAV_DROPDOWN__ENTRIES = eINSTANCE.getNavDropdown_Entries();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.impl.NavbarImpl <em>Navbar</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.impl.NavbarImpl
		 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.impl.NavigationPackageImpl#getNavbar()
		 * @generated
		 */
		EClass NAVBAR = eINSTANCE.getNavbar();

		/**
		 * The meta object literal for the '<em><b>Bg</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAVBAR__BG = eINSTANCE.getNavbar_Bg();

		/**
		 * The meta object literal for the '<em><b>Theme</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAVBAR__THEME = eINSTANCE.getNavbar_Theme();

		/**
		 * The meta object literal for the '<em><b>Always Expanded</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAVBAR__ALWAYS_EXPANDED = eINSTANCE.getNavbar_AlwaysExpanded();

		/**
		 * The meta object literal for the '<em><b>Expand</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAVBAR__EXPAND = eINSTANCE.getNavbar_Expand();

		/**
		 * The meta object literal for the '<em><b>Fixed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAVBAR__FIXED = eINSTANCE.getNavbar_Fixed();

		/**
		 * The meta object literal for the '<em><b>Sticky</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAVBAR__STICKY = eINSTANCE.getNavbar_Sticky();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NAVBAR__CONTENT = eINSTANCE.getNavbar_Content();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.impl.NavbarBrandImpl <em>Navbar Brand</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.impl.NavbarBrandImpl
		 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.impl.NavigationPackageImpl#getNavbarBrand()
		 * @generated
		 */
		EClass NAVBAR_BRAND = eINSTANCE.getNavbarBrand();

		/**
		 * The meta object literal for the '<em><b>Href</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAVBAR_BRAND__HREF = eINSTANCE.getNavbarBrand_Href();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.impl.NavbarToggleImpl <em>Navbar Toggle</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.impl.NavbarToggleImpl
		 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.impl.NavigationPackageImpl#getNavbarToggle()
		 * @generated
		 */
		EClass NAVBAR_TOGGLE = eINSTANCE.getNavbarToggle();

		/**
		 * The meta object literal for the '<em><b>Controls</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAVBAR_TOGGLE__CONTROLS = eINSTANCE.getNavbarToggle_Controls();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.impl.NavbarCollapseImpl <em>Navbar Collapse</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.impl.NavbarCollapseImpl
		 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.impl.NavigationPackageImpl#getNavbarCollapse()
		 * @generated
		 */
		EClass NAVBAR_COLLAPSE = eINSTANCE.getNavbarCollapse();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NAVBAR_COLLAPSE__CONTENT = eINSTANCE.getNavbarCollapse_Content();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.impl.NavbarTextImpl <em>Navbar Text</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.impl.NavbarTextImpl
		 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.impl.NavigationPackageImpl#getNavbarText()
		 * @generated
		 */
		EClass NAVBAR_TEXT = eINSTANCE.getNavbarText();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.impl.TabsImpl <em>Tabs</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.impl.TabsImpl
		 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.impl.NavigationPackageImpl#getTabs()
		 * @generated
		 */
		EClass TABS = eINSTANCE.getTabs();

		/**
		 * The meta object literal for the '<em><b>Default Active Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABS__DEFAULT_ACTIVE_KEY = eINSTANCE.getTabs_DefaultActiveKey();

		/**
		 * The meta object literal for the '<em><b>Active Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABS__ACTIVE_KEY = eINSTANCE.getTabs_ActiveKey();

		/**
		 * The meta object literal for the '<em><b>Variant</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABS__VARIANT = eINSTANCE.getTabs_Variant();

		/**
		 * The meta object literal for the '<em><b>Fill</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABS__FILL = eINSTANCE.getTabs_Fill();

		/**
		 * The meta object literal for the '<em><b>Justify</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABS__JUSTIFY = eINSTANCE.getTabs_Justify();

		/**
		 * The meta object literal for the '<em><b>Mount On Enter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABS__MOUNT_ON_ENTER = eINSTANCE.getTabs_MountOnEnter();

		/**
		 * The meta object literal for the '<em><b>Unmount On Exit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABS__UNMOUNT_ON_EXIT = eINSTANCE.getTabs_UnmountOnExit();

		/**
		 * The meta object literal for the '<em><b>Tabs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABS__TABS = eINSTANCE.getTabs_Tabs();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.impl.TabImpl <em>Tab</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.impl.TabImpl
		 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.impl.NavigationPackageImpl#getTab()
		 * @generated
		 */
		EClass TAB = eINSTANCE.getTab();

		/**
		 * The meta object literal for the '<em><b>Event Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAB__EVENT_KEY = eINSTANCE.getTab_EventKey();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAB__TITLE = eINSTANCE.getTab_Title();

		/**
		 * The meta object literal for the '<em><b>Title Node</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TAB__TITLE_NODE = eINSTANCE.getTab_TitleNode();

		/**
		 * The meta object literal for the '<em><b>Disabled</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAB__DISABLED = eINSTANCE.getTab_Disabled();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.impl.BreadcrumbImpl <em>Breadcrumb</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.impl.BreadcrumbImpl
		 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.impl.NavigationPackageImpl#getBreadcrumb()
		 * @generated
		 */
		EClass BREADCRUMB = eINSTANCE.getBreadcrumb();

		/**
		 * The meta object literal for the '<em><b>Items</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BREADCRUMB__ITEMS = eINSTANCE.getBreadcrumb_Items();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.impl.BreadcrumbItemImpl <em>Breadcrumb Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.impl.BreadcrumbItemImpl
		 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.impl.NavigationPackageImpl#getBreadcrumbItem()
		 * @generated
		 */
		EClass BREADCRUMB_ITEM = eINSTANCE.getBreadcrumbItem();

		/**
		 * The meta object literal for the '<em><b>Href</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BREADCRUMB_ITEM__HREF = eINSTANCE.getBreadcrumbItem_Href();

		/**
		 * The meta object literal for the '<em><b>Active</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BREADCRUMB_ITEM__ACTIVE = eINSTANCE.getBreadcrumbItem_Active();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.PaginationEntry <em>Pagination Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.PaginationEntry
		 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.impl.NavigationPackageImpl#getPaginationEntry()
		 * @generated
		 */
		EClass PAGINATION_ENTRY = eINSTANCE.getPaginationEntry();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.impl.PaginationImpl <em>Pagination</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.impl.PaginationImpl
		 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.impl.NavigationPackageImpl#getPagination()
		 * @generated
		 */
		EClass PAGINATION = eINSTANCE.getPagination();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAGINATION__SIZE = eINSTANCE.getPagination_Size();

		/**
		 * The meta object literal for the '<em><b>Entries</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAGINATION__ENTRIES = eINSTANCE.getPagination_Entries();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.impl.PaginationLinkImpl <em>Pagination Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.impl.PaginationLinkImpl
		 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.impl.NavigationPackageImpl#getPaginationLink()
		 * @generated
		 */
		EClass PAGINATION_LINK = eINSTANCE.getPaginationLink();

		/**
		 * The meta object literal for the '<em><b>Href</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAGINATION_LINK__HREF = eINSTANCE.getPaginationLink_Href();

		/**
		 * The meta object literal for the '<em><b>Active</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAGINATION_LINK__ACTIVE = eINSTANCE.getPaginationLink_Active();

		/**
		 * The meta object literal for the '<em><b>Disabled</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAGINATION_LINK__DISABLED = eINSTANCE.getPaginationLink_Disabled();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.impl.PaginationItemImpl <em>Pagination Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.impl.PaginationItemImpl
		 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.impl.NavigationPackageImpl#getPaginationItem()
		 * @generated
		 */
		EClass PAGINATION_ITEM = eINSTANCE.getPaginationItem();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.impl.PaginationFirstImpl <em>Pagination First</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.impl.PaginationFirstImpl
		 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.impl.NavigationPackageImpl#getPaginationFirst()
		 * @generated
		 */
		EClass PAGINATION_FIRST = eINSTANCE.getPaginationFirst();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.impl.PaginationPrevImpl <em>Pagination Prev</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.impl.PaginationPrevImpl
		 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.impl.NavigationPackageImpl#getPaginationPrev()
		 * @generated
		 */
		EClass PAGINATION_PREV = eINSTANCE.getPaginationPrev();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.impl.PaginationEllipsisImpl <em>Pagination Ellipsis</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.impl.PaginationEllipsisImpl
		 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.impl.NavigationPackageImpl#getPaginationEllipsis()
		 * @generated
		 */
		EClass PAGINATION_ELLIPSIS = eINSTANCE.getPaginationEllipsis();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.impl.PaginationNextImpl <em>Pagination Next</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.impl.PaginationNextImpl
		 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.impl.NavigationPackageImpl#getPaginationNext()
		 * @generated
		 */
		EClass PAGINATION_NEXT = eINSTANCE.getPaginationNext();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.impl.PaginationLastImpl <em>Pagination Last</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.impl.PaginationLastImpl
		 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.impl.NavigationPackageImpl#getPaginationLast()
		 * @generated
		 */
		EClass PAGINATION_LAST = eINSTANCE.getPaginationLast();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.DropdownEntry <em>Dropdown Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.DropdownEntry
		 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.impl.NavigationPackageImpl#getDropdownEntry()
		 * @generated
		 */
		EClass DROPDOWN_ENTRY = eINSTANCE.getDropdownEntry();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.impl.DropdownImpl <em>Dropdown</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.impl.DropdownImpl
		 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.impl.NavigationPackageImpl#getDropdown()
		 * @generated
		 */
		EClass DROPDOWN = eINSTANCE.getDropdown();

		/**
		 * The meta object literal for the '<em><b>Drop</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DROPDOWN__DROP = eINSTANCE.getDropdown_Drop();

		/**
		 * The meta object literal for the '<em><b>Align</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DROPDOWN__ALIGN = eINSTANCE.getDropdown_Align();

		/**
		 * The meta object literal for the '<em><b>Toggle</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DROPDOWN__TOGGLE = eINSTANCE.getDropdown_Toggle();

		/**
		 * The meta object literal for the '<em><b>Menu</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DROPDOWN__MENU = eINSTANCE.getDropdown_Menu();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.impl.DropdownToggleImpl <em>Dropdown Toggle</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.impl.DropdownToggleImpl
		 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.impl.NavigationPackageImpl#getDropdownToggle()
		 * @generated
		 */
		EClass DROPDOWN_TOGGLE = eINSTANCE.getDropdownToggle();

		/**
		 * The meta object literal for the '<em><b>Variant</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DROPDOWN_TOGGLE__VARIANT = eINSTANCE.getDropdownToggle_Variant();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DROPDOWN_TOGGLE__SIZE = eINSTANCE.getDropdownToggle_Size();

		/**
		 * The meta object literal for the '<em><b>Split</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DROPDOWN_TOGGLE__SPLIT = eINSTANCE.getDropdownToggle_Split();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.impl.DropdownMenuImpl <em>Dropdown Menu</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.impl.DropdownMenuImpl
		 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.impl.NavigationPackageImpl#getDropdownMenu()
		 * @generated
		 */
		EClass DROPDOWN_MENU = eINSTANCE.getDropdownMenu();

		/**
		 * The meta object literal for the '<em><b>Variant</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DROPDOWN_MENU__VARIANT = eINSTANCE.getDropdownMenu_Variant();

		/**
		 * The meta object literal for the '<em><b>Entries</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DROPDOWN_MENU__ENTRIES = eINSTANCE.getDropdownMenu_Entries();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.impl.DropdownItemImpl <em>Dropdown Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.impl.DropdownItemImpl
		 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.impl.NavigationPackageImpl#getDropdownItem()
		 * @generated
		 */
		EClass DROPDOWN_ITEM = eINSTANCE.getDropdownItem();

		/**
		 * The meta object literal for the '<em><b>Href</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DROPDOWN_ITEM__HREF = eINSTANCE.getDropdownItem_Href();

		/**
		 * The meta object literal for the '<em><b>Event Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DROPDOWN_ITEM__EVENT_KEY = eINSTANCE.getDropdownItem_EventKey();

		/**
		 * The meta object literal for the '<em><b>Active</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DROPDOWN_ITEM__ACTIVE = eINSTANCE.getDropdownItem_Active();

		/**
		 * The meta object literal for the '<em><b>Disabled</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DROPDOWN_ITEM__DISABLED = eINSTANCE.getDropdownItem_Disabled();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.impl.DropdownHeaderImpl <em>Dropdown Header</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.impl.DropdownHeaderImpl
		 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.impl.NavigationPackageImpl#getDropdownHeader()
		 * @generated
		 */
		EClass DROPDOWN_HEADER = eINSTANCE.getDropdownHeader();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.impl.DropdownDividerImpl <em>Dropdown Divider</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.impl.DropdownDividerImpl
		 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.impl.NavigationPackageImpl#getDropdownDivider()
		 * @generated
		 */
		EClass DROPDOWN_DIVIDER = eINSTANCE.getDropdownDivider();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.impl.DropdownItemTextImpl <em>Dropdown Item Text</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.impl.DropdownItemTextImpl
		 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.impl.NavigationPackageImpl#getDropdownItemText()
		 * @generated
		 */
		EClass DROPDOWN_ITEM_TEXT = eINSTANCE.getDropdownItemText();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.impl.DropdownButtonImpl <em>Dropdown Button</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.impl.DropdownButtonImpl
		 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.impl.NavigationPackageImpl#getDropdownButton()
		 * @generated
		 */
		EClass DROPDOWN_BUTTON = eINSTANCE.getDropdownButton();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DROPDOWN_BUTTON__TITLE = eINSTANCE.getDropdownButton_Title();

		/**
		 * The meta object literal for the '<em><b>Title Node</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DROPDOWN_BUTTON__TITLE_NODE = eINSTANCE.getDropdownButton_TitleNode();

		/**
		 * The meta object literal for the '<em><b>Variant</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DROPDOWN_BUTTON__VARIANT = eINSTANCE.getDropdownButton_Variant();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DROPDOWN_BUTTON__SIZE = eINSTANCE.getDropdownButton_Size();

		/**
		 * The meta object literal for the '<em><b>Drop</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DROPDOWN_BUTTON__DROP = eINSTANCE.getDropdownButton_Drop();

		/**
		 * The meta object literal for the '<em><b>Entries</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DROPDOWN_BUTTON__ENTRIES = eINSTANCE.getDropdownButton_Entries();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.impl.SplitButtonImpl <em>Split Button</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.impl.SplitButtonImpl
		 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.impl.NavigationPackageImpl#getSplitButton()
		 * @generated
		 */
		EClass SPLIT_BUTTON = eINSTANCE.getSplitButton();

		/**
		 * The meta object literal for the '<em><b>Href</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPLIT_BUTTON__HREF = eINSTANCE.getSplitButton_Href();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.NavVariant <em>Nav Variant</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.NavVariant
		 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.impl.NavigationPackageImpl#getNavVariant()
		 * @generated
		 */
		EEnum NAV_VARIANT = eINSTANCE.getNavVariant();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.NavbarTheme <em>Navbar Theme</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.NavbarTheme
		 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.impl.NavigationPackageImpl#getNavbarTheme()
		 * @generated
		 */
		EEnum NAVBAR_THEME = eINSTANCE.getNavbarTheme();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.Fixed <em>Fixed</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.Fixed
		 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.impl.NavigationPackageImpl#getFixed()
		 * @generated
		 */
		EEnum FIXED = eINSTANCE.getFixed();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.Drop <em>Drop</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.Drop
		 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.impl.NavigationPackageImpl#getDrop()
		 * @generated
		 */
		EEnum DROP = eINSTANCE.getDrop();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.Align <em>Align</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.Align
		 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.impl.NavigationPackageImpl#getAlign()
		 * @generated
		 */
		EEnum ALIGN = eINSTANCE.getAlign();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.MenuVariant <em>Menu Variant</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.MenuVariant
		 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.impl.NavigationPackageImpl#getMenuVariant()
		 * @generated
		 */
		EEnum MENU_VARIANT = eINSTANCE.getMenuVariant();

	}

} //NavigationPackage
