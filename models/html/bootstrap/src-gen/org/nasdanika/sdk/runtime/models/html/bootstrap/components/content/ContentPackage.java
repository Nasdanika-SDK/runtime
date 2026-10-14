/**
 */
package org.nasdanika.sdk.runtime.models.html.bootstrap.components.content;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.nasdanika.sdk.runtime.models.html.bootstrap.BootstrapPackage;

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
 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.ContentFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel modelDirectory='/bootstrap/src-gen' featureDelegation='Dynamic' complianceLevel='25' suppressGenModelAnnotations='false' copyrightFields='false' operationReflection='true' importOrganizing='true' basePackage='org.nasdanika.sdk.runtime.models.html.bootstrap.components'"
 *        annotation="http://www.eclipse.org/emf/2011/Xcore Ecore='http://www.eclipse.org/emf/2002/Ecore' GenModel='http://www.eclipse.org/emf/2002/GenModel' Html='urn:org.nasdanika:html'"
 * @generated
 */
public interface ContentPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "content";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "https://runtime.sdk.nasdanika.org/models/html/bootstrap/components/content";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.nasdanika.sdk.runtime.models.html.bootstrap.components.content";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ContentPackage eINSTANCE = org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.impl.ContentPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.impl.AlertImpl <em>Alert</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.impl.AlertImpl
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.impl.ContentPackageImpl#getAlert()
	 * @generated
	 */
	int ALERT = 0;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALERT__MARKERS = BootstrapPackage.BOOTSTRAP_ELEMENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALERT__ID = BootstrapPackage.BOOTSTRAP_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALERT__CLASSES = BootstrapPackage.BOOTSTRAP_ELEMENT__CLASSES;

	/**
	 * The feature id for the '<em><b>Style</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALERT__STYLE = BootstrapPackage.BOOTSTRAP_ELEMENT__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALERT__ATTRIBUTES = BootstrapPackage.BOOTSTRAP_ELEMENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALERT__CONTENTS = BootstrapPackage.BOOTSTRAP_ELEMENT__CONTENTS;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALERT__CONTENT = BootstrapPackage.BOOTSTRAP_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Variant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALERT__VARIANT = BootstrapPackage.BOOTSTRAP_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Dismissible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALERT__DISMISSIBLE = BootstrapPackage.BOOTSTRAP_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Heading</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALERT__HEADING = BootstrapPackage.BOOTSTRAP_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Alert</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALERT_FEATURE_COUNT = BootstrapPackage.BOOTSTRAP_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Tag Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALERT___TAG_NAME = BootstrapPackage.BOOTSTRAP_ELEMENT___TAG_NAME;

	/**
	 * The number of operations of the '<em>Alert</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALERT_OPERATION_COUNT = BootstrapPackage.BOOTSTRAP_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.impl.AlertHeadingImpl <em>Alert Heading</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.impl.AlertHeadingImpl
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.impl.ContentPackageImpl#getAlertHeading()
	 * @generated
	 */
	int ALERT_HEADING = 1;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALERT_HEADING__MARKERS = BootstrapPackage.BOOTSTRAP_ELEMENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALERT_HEADING__ID = BootstrapPackage.BOOTSTRAP_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALERT_HEADING__CLASSES = BootstrapPackage.BOOTSTRAP_ELEMENT__CLASSES;

	/**
	 * The feature id for the '<em><b>Style</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALERT_HEADING__STYLE = BootstrapPackage.BOOTSTRAP_ELEMENT__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALERT_HEADING__ATTRIBUTES = BootstrapPackage.BOOTSTRAP_ELEMENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALERT_HEADING__CONTENTS = BootstrapPackage.BOOTSTRAP_ELEMENT__CONTENTS;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALERT_HEADING__CONTENT = BootstrapPackage.BOOTSTRAP_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Alert Heading</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALERT_HEADING_FEATURE_COUNT = BootstrapPackage.BOOTSTRAP_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Tag Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALERT_HEADING___TAG_NAME = BootstrapPackage.BOOTSTRAP_ELEMENT___TAG_NAME;

	/**
	 * The number of operations of the '<em>Alert Heading</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALERT_HEADING_OPERATION_COUNT = BootstrapPackage.BOOTSTRAP_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.impl.AlertLinkImpl <em>Alert Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.impl.AlertLinkImpl
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.impl.ContentPackageImpl#getAlertLink()
	 * @generated
	 */
	int ALERT_LINK = 2;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALERT_LINK__MARKERS = BootstrapPackage.BOOTSTRAP_ELEMENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALERT_LINK__ID = BootstrapPackage.BOOTSTRAP_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALERT_LINK__CLASSES = BootstrapPackage.BOOTSTRAP_ELEMENT__CLASSES;

	/**
	 * The feature id for the '<em><b>Style</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALERT_LINK__STYLE = BootstrapPackage.BOOTSTRAP_ELEMENT__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALERT_LINK__ATTRIBUTES = BootstrapPackage.BOOTSTRAP_ELEMENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALERT_LINK__CONTENTS = BootstrapPackage.BOOTSTRAP_ELEMENT__CONTENTS;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALERT_LINK__CONTENT = BootstrapPackage.BOOTSTRAP_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALERT_LINK__HREF = BootstrapPackage.BOOTSTRAP_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Alert Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALERT_LINK_FEATURE_COUNT = BootstrapPackage.BOOTSTRAP_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Tag Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALERT_LINK___TAG_NAME = BootstrapPackage.BOOTSTRAP_ELEMENT___TAG_NAME;

	/**
	 * The number of operations of the '<em>Alert Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALERT_LINK_OPERATION_COUNT = BootstrapPackage.BOOTSTRAP_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.impl.BadgeImpl <em>Badge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.impl.BadgeImpl
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.impl.ContentPackageImpl#getBadge()
	 * @generated
	 */
	int BADGE = 3;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BADGE__MARKERS = BootstrapPackage.BOOTSTRAP_ELEMENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BADGE__ID = BootstrapPackage.BOOTSTRAP_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BADGE__CLASSES = BootstrapPackage.BOOTSTRAP_ELEMENT__CLASSES;

	/**
	 * The feature id for the '<em><b>Style</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BADGE__STYLE = BootstrapPackage.BOOTSTRAP_ELEMENT__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BADGE__ATTRIBUTES = BootstrapPackage.BOOTSTRAP_ELEMENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BADGE__CONTENTS = BootstrapPackage.BOOTSTRAP_ELEMENT__CONTENTS;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BADGE__CONTENT = BootstrapPackage.BOOTSTRAP_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Bg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BADGE__BG = BootstrapPackage.BOOTSTRAP_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Pill</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BADGE__PILL = BootstrapPackage.BOOTSTRAP_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Badge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BADGE_FEATURE_COUNT = BootstrapPackage.BOOTSTRAP_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Tag Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BADGE___TAG_NAME = BootstrapPackage.BOOTSTRAP_ELEMENT___TAG_NAME;

	/**
	 * The number of operations of the '<em>Badge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BADGE_OPERATION_COUNT = BootstrapPackage.BOOTSTRAP_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.impl.ButtonImpl <em>Button</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.impl.ButtonImpl
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.impl.ContentPackageImpl#getButton()
	 * @generated
	 */
	int BUTTON = 4;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__MARKERS = BootstrapPackage.BOOTSTRAP_ELEMENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__ID = BootstrapPackage.BOOTSTRAP_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__CLASSES = BootstrapPackage.BOOTSTRAP_ELEMENT__CLASSES;

	/**
	 * The feature id for the '<em><b>Style</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__STYLE = BootstrapPackage.BOOTSTRAP_ELEMENT__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__ATTRIBUTES = BootstrapPackage.BOOTSTRAP_ELEMENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__CONTENTS = BootstrapPackage.BOOTSTRAP_ELEMENT__CONTENTS;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__CONTENT = BootstrapPackage.BOOTSTRAP_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Variant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__VARIANT = BootstrapPackage.BOOTSTRAP_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__SIZE = BootstrapPackage.BOOTSTRAP_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Button Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__BUTTON_TYPE = BootstrapPackage.BOOTSTRAP_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__ACTIVE = BootstrapPackage.BOOTSTRAP_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Disabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__DISABLED = BootstrapPackage.BOOTSTRAP_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__HREF = BootstrapPackage.BOOTSTRAP_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Button</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_FEATURE_COUNT = BootstrapPackage.BOOTSTRAP_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The operation id for the '<em>Tag Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON___TAG_NAME = BootstrapPackage.BOOTSTRAP_ELEMENT___TAG_NAME;

	/**
	 * The number of operations of the '<em>Button</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_OPERATION_COUNT = BootstrapPackage.BOOTSTRAP_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.impl.ButtonGroupImpl <em>Button Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.impl.ButtonGroupImpl
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.impl.ContentPackageImpl#getButtonGroup()
	 * @generated
	 */
	int BUTTON_GROUP = 5;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_GROUP__MARKERS = BootstrapPackage.BOOTSTRAP_ELEMENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_GROUP__ID = BootstrapPackage.BOOTSTRAP_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_GROUP__CLASSES = BootstrapPackage.BOOTSTRAP_ELEMENT__CLASSES;

	/**
	 * The feature id for the '<em><b>Style</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_GROUP__STYLE = BootstrapPackage.BOOTSTRAP_ELEMENT__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_GROUP__ATTRIBUTES = BootstrapPackage.BOOTSTRAP_ELEMENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_GROUP__CONTENTS = BootstrapPackage.BOOTSTRAP_ELEMENT__CONTENTS;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_GROUP__SIZE = BootstrapPackage.BOOTSTRAP_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Vertical</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_GROUP__VERTICAL = BootstrapPackage.BOOTSTRAP_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Buttons</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_GROUP__BUTTONS = BootstrapPackage.BOOTSTRAP_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Button Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_GROUP_FEATURE_COUNT = BootstrapPackage.BOOTSTRAP_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Tag Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_GROUP___TAG_NAME = BootstrapPackage.BOOTSTRAP_ELEMENT___TAG_NAME;

	/**
	 * The number of operations of the '<em>Button Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_GROUP_OPERATION_COUNT = BootstrapPackage.BOOTSTRAP_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.impl.ButtonToolbarImpl <em>Button Toolbar</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.impl.ButtonToolbarImpl
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.impl.ContentPackageImpl#getButtonToolbar()
	 * @generated
	 */
	int BUTTON_TOOLBAR = 6;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_TOOLBAR__MARKERS = BootstrapPackage.BOOTSTRAP_ELEMENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_TOOLBAR__ID = BootstrapPackage.BOOTSTRAP_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_TOOLBAR__CLASSES = BootstrapPackage.BOOTSTRAP_ELEMENT__CLASSES;

	/**
	 * The feature id for the '<em><b>Style</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_TOOLBAR__STYLE = BootstrapPackage.BOOTSTRAP_ELEMENT__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_TOOLBAR__ATTRIBUTES = BootstrapPackage.BOOTSTRAP_ELEMENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_TOOLBAR__CONTENTS = BootstrapPackage.BOOTSTRAP_ELEMENT__CONTENTS;

	/**
	 * The feature id for the '<em><b>Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_TOOLBAR__GROUPS = BootstrapPackage.BOOTSTRAP_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Button Toolbar</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_TOOLBAR_FEATURE_COUNT = BootstrapPackage.BOOTSTRAP_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Tag Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_TOOLBAR___TAG_NAME = BootstrapPackage.BOOTSTRAP_ELEMENT___TAG_NAME;

	/**
	 * The number of operations of the '<em>Button Toolbar</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_TOOLBAR_OPERATION_COUNT = BootstrapPackage.BOOTSTRAP_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.impl.CloseButtonImpl <em>Close Button</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.impl.CloseButtonImpl
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.impl.ContentPackageImpl#getCloseButton()
	 * @generated
	 */
	int CLOSE_BUTTON = 7;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOSE_BUTTON__MARKERS = BootstrapPackage.BOOTSTRAP_ELEMENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOSE_BUTTON__ID = BootstrapPackage.BOOTSTRAP_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOSE_BUTTON__CLASSES = BootstrapPackage.BOOTSTRAP_ELEMENT__CLASSES;

	/**
	 * The feature id for the '<em><b>Style</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOSE_BUTTON__STYLE = BootstrapPackage.BOOTSTRAP_ELEMENT__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOSE_BUTTON__ATTRIBUTES = BootstrapPackage.BOOTSTRAP_ELEMENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOSE_BUTTON__CONTENTS = BootstrapPackage.BOOTSTRAP_ELEMENT__CONTENTS;

	/**
	 * The feature id for the '<em><b>Disabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOSE_BUTTON__DISABLED = BootstrapPackage.BOOTSTRAP_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Close Button</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOSE_BUTTON_FEATURE_COUNT = BootstrapPackage.BOOTSTRAP_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Tag Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOSE_BUTTON___TAG_NAME = BootstrapPackage.BOOTSTRAP_ELEMENT___TAG_NAME;

	/**
	 * The number of operations of the '<em>Close Button</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOSE_BUTTON_OPERATION_COUNT = BootstrapPackage.BOOTSTRAP_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.impl.CardImpl <em>Card</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.impl.CardImpl
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.impl.ContentPackageImpl#getCard()
	 * @generated
	 */
	int CARD = 8;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD__MARKERS = BootstrapPackage.BOOTSTRAP_ELEMENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD__ID = BootstrapPackage.BOOTSTRAP_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD__CLASSES = BootstrapPackage.BOOTSTRAP_ELEMENT__CLASSES;

	/**
	 * The feature id for the '<em><b>Style</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD__STYLE = BootstrapPackage.BOOTSTRAP_ELEMENT__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD__ATTRIBUTES = BootstrapPackage.BOOTSTRAP_ELEMENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD__CONTENTS = BootstrapPackage.BOOTSTRAP_ELEMENT__CONTENTS;

	/**
	 * The feature id for the '<em><b>Bg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD__BG = BootstrapPackage.BOOTSTRAP_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Text Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD__TEXT_COLOR = BootstrapPackage.BOOTSTRAP_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Border</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD__BORDER = BootstrapPackage.BOOTSTRAP_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Header</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD__HEADER = BootstrapPackage.BOOTSTRAP_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Image</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD__IMAGE = BootstrapPackage.BOOTSTRAP_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Bodies</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD__BODIES = BootstrapPackage.BOOTSTRAP_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Footer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD__FOOTER = BootstrapPackage.BOOTSTRAP_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Card</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_FEATURE_COUNT = BootstrapPackage.BOOTSTRAP_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The operation id for the '<em>Tag Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD___TAG_NAME = BootstrapPackage.BOOTSTRAP_ELEMENT___TAG_NAME;

	/**
	 * The number of operations of the '<em>Card</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_OPERATION_COUNT = BootstrapPackage.BOOTSTRAP_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.impl.CardHeaderImpl <em>Card Header</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.impl.CardHeaderImpl
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.impl.ContentPackageImpl#getCardHeader()
	 * @generated
	 */
	int CARD_HEADER = 9;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_HEADER__MARKERS = BootstrapPackage.BOOTSTRAP_ELEMENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_HEADER__ID = BootstrapPackage.BOOTSTRAP_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_HEADER__CLASSES = BootstrapPackage.BOOTSTRAP_ELEMENT__CLASSES;

	/**
	 * The feature id for the '<em><b>Style</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_HEADER__STYLE = BootstrapPackage.BOOTSTRAP_ELEMENT__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_HEADER__ATTRIBUTES = BootstrapPackage.BOOTSTRAP_ELEMENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_HEADER__CONTENTS = BootstrapPackage.BOOTSTRAP_ELEMENT__CONTENTS;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_HEADER__CONTENT = BootstrapPackage.BOOTSTRAP_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Card Header</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_HEADER_FEATURE_COUNT = BootstrapPackage.BOOTSTRAP_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Tag Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_HEADER___TAG_NAME = BootstrapPackage.BOOTSTRAP_ELEMENT___TAG_NAME;

	/**
	 * The number of operations of the '<em>Card Header</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_HEADER_OPERATION_COUNT = BootstrapPackage.BOOTSTRAP_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.impl.CardImageImpl <em>Card Image</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.impl.CardImageImpl
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.impl.ContentPackageImpl#getCardImage()
	 * @generated
	 */
	int CARD_IMAGE = 10;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_IMAGE__MARKERS = BootstrapPackage.BOOTSTRAP_ELEMENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_IMAGE__ID = BootstrapPackage.BOOTSTRAP_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_IMAGE__CLASSES = BootstrapPackage.BOOTSTRAP_ELEMENT__CLASSES;

	/**
	 * The feature id for the '<em><b>Style</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_IMAGE__STYLE = BootstrapPackage.BOOTSTRAP_ELEMENT__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_IMAGE__ATTRIBUTES = BootstrapPackage.BOOTSTRAP_ELEMENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_IMAGE__CONTENTS = BootstrapPackage.BOOTSTRAP_ELEMENT__CONTENTS;

	/**
	 * The feature id for the '<em><b>Variant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_IMAGE__VARIANT = BootstrapPackage.BOOTSTRAP_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Src</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_IMAGE__SRC = BootstrapPackage.BOOTSTRAP_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Alt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_IMAGE__ALT = BootstrapPackage.BOOTSTRAP_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Card Image</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_IMAGE_FEATURE_COUNT = BootstrapPackage.BOOTSTRAP_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Tag Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_IMAGE___TAG_NAME = BootstrapPackage.BOOTSTRAP_ELEMENT___TAG_NAME;

	/**
	 * The number of operations of the '<em>Card Image</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_IMAGE_OPERATION_COUNT = BootstrapPackage.BOOTSTRAP_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.impl.CardBodyImpl <em>Card Body</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.impl.CardBodyImpl
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.impl.ContentPackageImpl#getCardBody()
	 * @generated
	 */
	int CARD_BODY = 11;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_BODY__MARKERS = BootstrapPackage.BOOTSTRAP_ELEMENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_BODY__ID = BootstrapPackage.BOOTSTRAP_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_BODY__CLASSES = BootstrapPackage.BOOTSTRAP_ELEMENT__CLASSES;

	/**
	 * The feature id for the '<em><b>Style</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_BODY__STYLE = BootstrapPackage.BOOTSTRAP_ELEMENT__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_BODY__ATTRIBUTES = BootstrapPackage.BOOTSTRAP_ELEMENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_BODY__CONTENTS = BootstrapPackage.BOOTSTRAP_ELEMENT__CONTENTS;

	/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_BODY__TITLE = BootstrapPackage.BOOTSTRAP_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Subtitle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_BODY__SUBTITLE = BootstrapPackage.BOOTSTRAP_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Texts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_BODY__TEXTS = BootstrapPackage.BOOTSTRAP_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_BODY__LINKS = BootstrapPackage.BOOTSTRAP_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Card Body</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_BODY_FEATURE_COUNT = BootstrapPackage.BOOTSTRAP_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Tag Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_BODY___TAG_NAME = BootstrapPackage.BOOTSTRAP_ELEMENT___TAG_NAME;

	/**
	 * The number of operations of the '<em>Card Body</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_BODY_OPERATION_COUNT = BootstrapPackage.BOOTSTRAP_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.impl.CardTitleImpl <em>Card Title</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.impl.CardTitleImpl
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.impl.ContentPackageImpl#getCardTitle()
	 * @generated
	 */
	int CARD_TITLE = 12;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_TITLE__MARKERS = BootstrapPackage.BOOTSTRAP_ELEMENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_TITLE__ID = BootstrapPackage.BOOTSTRAP_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_TITLE__CLASSES = BootstrapPackage.BOOTSTRAP_ELEMENT__CLASSES;

	/**
	 * The feature id for the '<em><b>Style</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_TITLE__STYLE = BootstrapPackage.BOOTSTRAP_ELEMENT__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_TITLE__ATTRIBUTES = BootstrapPackage.BOOTSTRAP_ELEMENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_TITLE__CONTENTS = BootstrapPackage.BOOTSTRAP_ELEMENT__CONTENTS;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_TITLE__CONTENT = BootstrapPackage.BOOTSTRAP_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Card Title</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_TITLE_FEATURE_COUNT = BootstrapPackage.BOOTSTRAP_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Tag Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_TITLE___TAG_NAME = BootstrapPackage.BOOTSTRAP_ELEMENT___TAG_NAME;

	/**
	 * The number of operations of the '<em>Card Title</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_TITLE_OPERATION_COUNT = BootstrapPackage.BOOTSTRAP_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.impl.CardSubtitleImpl <em>Card Subtitle</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.impl.CardSubtitleImpl
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.impl.ContentPackageImpl#getCardSubtitle()
	 * @generated
	 */
	int CARD_SUBTITLE = 13;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_SUBTITLE__MARKERS = BootstrapPackage.BOOTSTRAP_ELEMENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_SUBTITLE__ID = BootstrapPackage.BOOTSTRAP_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_SUBTITLE__CLASSES = BootstrapPackage.BOOTSTRAP_ELEMENT__CLASSES;

	/**
	 * The feature id for the '<em><b>Style</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_SUBTITLE__STYLE = BootstrapPackage.BOOTSTRAP_ELEMENT__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_SUBTITLE__ATTRIBUTES = BootstrapPackage.BOOTSTRAP_ELEMENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_SUBTITLE__CONTENTS = BootstrapPackage.BOOTSTRAP_ELEMENT__CONTENTS;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_SUBTITLE__CONTENT = BootstrapPackage.BOOTSTRAP_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Card Subtitle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_SUBTITLE_FEATURE_COUNT = BootstrapPackage.BOOTSTRAP_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Tag Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_SUBTITLE___TAG_NAME = BootstrapPackage.BOOTSTRAP_ELEMENT___TAG_NAME;

	/**
	 * The number of operations of the '<em>Card Subtitle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_SUBTITLE_OPERATION_COUNT = BootstrapPackage.BOOTSTRAP_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.impl.CardTextImpl <em>Card Text</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.impl.CardTextImpl
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.impl.ContentPackageImpl#getCardText()
	 * @generated
	 */
	int CARD_TEXT = 14;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_TEXT__MARKERS = BootstrapPackage.BOOTSTRAP_ELEMENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_TEXT__ID = BootstrapPackage.BOOTSTRAP_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_TEXT__CLASSES = BootstrapPackage.BOOTSTRAP_ELEMENT__CLASSES;

	/**
	 * The feature id for the '<em><b>Style</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_TEXT__STYLE = BootstrapPackage.BOOTSTRAP_ELEMENT__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_TEXT__ATTRIBUTES = BootstrapPackage.BOOTSTRAP_ELEMENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_TEXT__CONTENTS = BootstrapPackage.BOOTSTRAP_ELEMENT__CONTENTS;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_TEXT__CONTENT = BootstrapPackage.BOOTSTRAP_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Card Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_TEXT_FEATURE_COUNT = BootstrapPackage.BOOTSTRAP_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Tag Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_TEXT___TAG_NAME = BootstrapPackage.BOOTSTRAP_ELEMENT___TAG_NAME;

	/**
	 * The number of operations of the '<em>Card Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_TEXT_OPERATION_COUNT = BootstrapPackage.BOOTSTRAP_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.impl.CardLinkImpl <em>Card Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.impl.CardLinkImpl
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.impl.ContentPackageImpl#getCardLink()
	 * @generated
	 */
	int CARD_LINK = 15;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_LINK__MARKERS = BootstrapPackage.BOOTSTRAP_ELEMENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_LINK__ID = BootstrapPackage.BOOTSTRAP_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_LINK__CLASSES = BootstrapPackage.BOOTSTRAP_ELEMENT__CLASSES;

	/**
	 * The feature id for the '<em><b>Style</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_LINK__STYLE = BootstrapPackage.BOOTSTRAP_ELEMENT__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_LINK__ATTRIBUTES = BootstrapPackage.BOOTSTRAP_ELEMENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_LINK__CONTENTS = BootstrapPackage.BOOTSTRAP_ELEMENT__CONTENTS;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_LINK__CONTENT = BootstrapPackage.BOOTSTRAP_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_LINK__HREF = BootstrapPackage.BOOTSTRAP_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Card Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_LINK_FEATURE_COUNT = BootstrapPackage.BOOTSTRAP_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Tag Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_LINK___TAG_NAME = BootstrapPackage.BOOTSTRAP_ELEMENT___TAG_NAME;

	/**
	 * The number of operations of the '<em>Card Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_LINK_OPERATION_COUNT = BootstrapPackage.BOOTSTRAP_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.impl.CardFooterImpl <em>Card Footer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.impl.CardFooterImpl
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.impl.ContentPackageImpl#getCardFooter()
	 * @generated
	 */
	int CARD_FOOTER = 16;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_FOOTER__MARKERS = BootstrapPackage.BOOTSTRAP_ELEMENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_FOOTER__ID = BootstrapPackage.BOOTSTRAP_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_FOOTER__CLASSES = BootstrapPackage.BOOTSTRAP_ELEMENT__CLASSES;

	/**
	 * The feature id for the '<em><b>Style</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_FOOTER__STYLE = BootstrapPackage.BOOTSTRAP_ELEMENT__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_FOOTER__ATTRIBUTES = BootstrapPackage.BOOTSTRAP_ELEMENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_FOOTER__CONTENTS = BootstrapPackage.BOOTSTRAP_ELEMENT__CONTENTS;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_FOOTER__CONTENT = BootstrapPackage.BOOTSTRAP_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Card Footer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_FOOTER_FEATURE_COUNT = BootstrapPackage.BOOTSTRAP_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Tag Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_FOOTER___TAG_NAME = BootstrapPackage.BOOTSTRAP_ELEMENT___TAG_NAME;

	/**
	 * The number of operations of the '<em>Card Footer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_FOOTER_OPERATION_COUNT = BootstrapPackage.BOOTSTRAP_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.impl.CardGroupImpl <em>Card Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.impl.CardGroupImpl
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.impl.ContentPackageImpl#getCardGroup()
	 * @generated
	 */
	int CARD_GROUP = 17;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_GROUP__MARKERS = BootstrapPackage.BOOTSTRAP_ELEMENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_GROUP__ID = BootstrapPackage.BOOTSTRAP_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_GROUP__CLASSES = BootstrapPackage.BOOTSTRAP_ELEMENT__CLASSES;

	/**
	 * The feature id for the '<em><b>Style</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_GROUP__STYLE = BootstrapPackage.BOOTSTRAP_ELEMENT__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_GROUP__ATTRIBUTES = BootstrapPackage.BOOTSTRAP_ELEMENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_GROUP__CONTENTS = BootstrapPackage.BOOTSTRAP_ELEMENT__CONTENTS;

	/**
	 * The feature id for the '<em><b>Cards</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_GROUP__CARDS = BootstrapPackage.BOOTSTRAP_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Card Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_GROUP_FEATURE_COUNT = BootstrapPackage.BOOTSTRAP_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Tag Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_GROUP___TAG_NAME = BootstrapPackage.BOOTSTRAP_ELEMENT___TAG_NAME;

	/**
	 * The number of operations of the '<em>Card Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_GROUP_OPERATION_COUNT = BootstrapPackage.BOOTSTRAP_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.impl.ListGroupImpl <em>List Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.impl.ListGroupImpl
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.impl.ContentPackageImpl#getListGroup()
	 * @generated
	 */
	int LIST_GROUP = 18;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_GROUP__MARKERS = BootstrapPackage.BOOTSTRAP_ELEMENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_GROUP__ID = BootstrapPackage.BOOTSTRAP_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_GROUP__CLASSES = BootstrapPackage.BOOTSTRAP_ELEMENT__CLASSES;

	/**
	 * The feature id for the '<em><b>Style</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_GROUP__STYLE = BootstrapPackage.BOOTSTRAP_ELEMENT__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_GROUP__ATTRIBUTES = BootstrapPackage.BOOTSTRAP_ELEMENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_GROUP__CONTENTS = BootstrapPackage.BOOTSTRAP_ELEMENT__CONTENTS;

	/**
	 * The feature id for the '<em><b>Flush</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_GROUP__FLUSH = BootstrapPackage.BOOTSTRAP_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Numbered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_GROUP__NUMBERED = BootstrapPackage.BOOTSTRAP_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Horizontal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_GROUP__HORIZONTAL = BootstrapPackage.BOOTSTRAP_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Horizontal From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_GROUP__HORIZONTAL_FROM = BootstrapPackage.BOOTSTRAP_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_GROUP__ITEMS = BootstrapPackage.BOOTSTRAP_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>List Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_GROUP_FEATURE_COUNT = BootstrapPackage.BOOTSTRAP_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Tag Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_GROUP___TAG_NAME = BootstrapPackage.BOOTSTRAP_ELEMENT___TAG_NAME;

	/**
	 * The number of operations of the '<em>List Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_GROUP_OPERATION_COUNT = BootstrapPackage.BOOTSTRAP_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.impl.ListGroupItemImpl <em>List Group Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.impl.ListGroupItemImpl
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.impl.ContentPackageImpl#getListGroupItem()
	 * @generated
	 */
	int LIST_GROUP_ITEM = 19;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_GROUP_ITEM__MARKERS = BootstrapPackage.BOOTSTRAP_ELEMENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_GROUP_ITEM__ID = BootstrapPackage.BOOTSTRAP_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_GROUP_ITEM__CLASSES = BootstrapPackage.BOOTSTRAP_ELEMENT__CLASSES;

	/**
	 * The feature id for the '<em><b>Style</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_GROUP_ITEM__STYLE = BootstrapPackage.BOOTSTRAP_ELEMENT__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_GROUP_ITEM__ATTRIBUTES = BootstrapPackage.BOOTSTRAP_ELEMENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_GROUP_ITEM__CONTENTS = BootstrapPackage.BOOTSTRAP_ELEMENT__CONTENTS;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_GROUP_ITEM__CONTENT = BootstrapPackage.BOOTSTRAP_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Variant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_GROUP_ITEM__VARIANT = BootstrapPackage.BOOTSTRAP_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_GROUP_ITEM__ACTION = BootstrapPackage.BOOTSTRAP_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_GROUP_ITEM__ACTIVE = BootstrapPackage.BOOTSTRAP_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Disabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_GROUP_ITEM__DISABLED = BootstrapPackage.BOOTSTRAP_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_GROUP_ITEM__HREF = BootstrapPackage.BOOTSTRAP_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>List Group Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_GROUP_ITEM_FEATURE_COUNT = BootstrapPackage.BOOTSTRAP_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The operation id for the '<em>Tag Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_GROUP_ITEM___TAG_NAME = BootstrapPackage.BOOTSTRAP_ELEMENT___TAG_NAME;

	/**
	 * The number of operations of the '<em>List Group Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_GROUP_ITEM_OPERATION_COUNT = BootstrapPackage.BOOTSTRAP_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.impl.TableImpl <em>Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.impl.TableImpl
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.impl.ContentPackageImpl#getTable()
	 * @generated
	 */
	int TABLE = 20;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__MARKERS = BootstrapPackage.BOOTSTRAP_ELEMENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__ID = BootstrapPackage.BOOTSTRAP_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__CLASSES = BootstrapPackage.BOOTSTRAP_ELEMENT__CLASSES;

	/**
	 * The feature id for the '<em><b>Style</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__STYLE = BootstrapPackage.BOOTSTRAP_ELEMENT__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__ATTRIBUTES = BootstrapPackage.BOOTSTRAP_ELEMENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__CONTENTS = BootstrapPackage.BOOTSTRAP_ELEMENT__CONTENTS;

	/**
	 * The feature id for the '<em><b>Striped</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__STRIPED = BootstrapPackage.BOOTSTRAP_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Bordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__BORDERED = BootstrapPackage.BOOTSTRAP_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Borderless</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__BORDERLESS = BootstrapPackage.BOOTSTRAP_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Hover</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__HOVER = BootstrapPackage.BOOTSTRAP_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__SIZE = BootstrapPackage.BOOTSTRAP_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Variant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__VARIANT = BootstrapPackage.BOOTSTRAP_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Responsive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__RESPONSIVE = BootstrapPackage.BOOTSTRAP_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Responsive Below</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__RESPONSIVE_BELOW = BootstrapPackage.BOOTSTRAP_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Head</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__HEAD = BootstrapPackage.BOOTSTRAP_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Bodies</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__BODIES = BootstrapPackage.BOOTSTRAP_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Foot</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__FOOT = BootstrapPackage.BOOTSTRAP_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_FEATURE_COUNT = BootstrapPackage.BOOTSTRAP_ELEMENT_FEATURE_COUNT + 11;

	/**
	 * The operation id for the '<em>Tag Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE___TAG_NAME = BootstrapPackage.BOOTSTRAP_ELEMENT___TAG_NAME;

	/**
	 * The number of operations of the '<em>Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_OPERATION_COUNT = BootstrapPackage.BOOTSTRAP_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.impl.ProgressBarImpl <em>Progress Bar</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.impl.ProgressBarImpl
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.impl.ContentPackageImpl#getProgressBar()
	 * @generated
	 */
	int PROGRESS_BAR = 21;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRESS_BAR__MARKERS = BootstrapPackage.BOOTSTRAP_ELEMENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRESS_BAR__ID = BootstrapPackage.BOOTSTRAP_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRESS_BAR__CLASSES = BootstrapPackage.BOOTSTRAP_ELEMENT__CLASSES;

	/**
	 * The feature id for the '<em><b>Style</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRESS_BAR__STYLE = BootstrapPackage.BOOTSTRAP_ELEMENT__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRESS_BAR__ATTRIBUTES = BootstrapPackage.BOOTSTRAP_ELEMENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRESS_BAR__CONTENTS = BootstrapPackage.BOOTSTRAP_ELEMENT__CONTENTS;

	/**
	 * The feature id for the '<em><b>Now</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRESS_BAR__NOW = BootstrapPackage.BOOTSTRAP_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRESS_BAR__MIN = BootstrapPackage.BOOTSTRAP_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRESS_BAR__MAX = BootstrapPackage.BOOTSTRAP_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRESS_BAR__LABEL = BootstrapPackage.BOOTSTRAP_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Visually Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRESS_BAR__VISUALLY_HIDDEN = BootstrapPackage.BOOTSTRAP_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Variant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRESS_BAR__VARIANT = BootstrapPackage.BOOTSTRAP_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Striped</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRESS_BAR__STRIPED = BootstrapPackage.BOOTSTRAP_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Animated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRESS_BAR__ANIMATED = BootstrapPackage.BOOTSTRAP_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Bars</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRESS_BAR__BARS = BootstrapPackage.BOOTSTRAP_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Progress Bar</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRESS_BAR_FEATURE_COUNT = BootstrapPackage.BOOTSTRAP_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The operation id for the '<em>Tag Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRESS_BAR___TAG_NAME = BootstrapPackage.BOOTSTRAP_ELEMENT___TAG_NAME;

	/**
	 * The number of operations of the '<em>Progress Bar</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRESS_BAR_OPERATION_COUNT = BootstrapPackage.BOOTSTRAP_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.impl.SpinnerImpl <em>Spinner</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.impl.SpinnerImpl
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.impl.ContentPackageImpl#getSpinner()
	 * @generated
	 */
	int SPINNER = 22;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPINNER__MARKERS = BootstrapPackage.BOOTSTRAP_ELEMENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPINNER__ID = BootstrapPackage.BOOTSTRAP_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPINNER__CLASSES = BootstrapPackage.BOOTSTRAP_ELEMENT__CLASSES;

	/**
	 * The feature id for the '<em><b>Style</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPINNER__STYLE = BootstrapPackage.BOOTSTRAP_ELEMENT__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPINNER__ATTRIBUTES = BootstrapPackage.BOOTSTRAP_ELEMENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPINNER__CONTENTS = BootstrapPackage.BOOTSTRAP_ELEMENT__CONTENTS;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPINNER__CONTENT = BootstrapPackage.BOOTSTRAP_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Animation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPINNER__ANIMATION = BootstrapPackage.BOOTSTRAP_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Variant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPINNER__VARIANT = BootstrapPackage.BOOTSTRAP_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPINNER__SIZE = BootstrapPackage.BOOTSTRAP_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Spinner</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPINNER_FEATURE_COUNT = BootstrapPackage.BOOTSTRAP_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Tag Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPINNER___TAG_NAME = BootstrapPackage.BOOTSTRAP_ELEMENT___TAG_NAME;

	/**
	 * The number of operations of the '<em>Spinner</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPINNER_OPERATION_COUNT = BootstrapPackage.BOOTSTRAP_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.impl.PlaceholderGroupImpl <em>Placeholder Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.impl.PlaceholderGroupImpl
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.impl.ContentPackageImpl#getPlaceholderGroup()
	 * @generated
	 */
	int PLACEHOLDER_GROUP = 23;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACEHOLDER_GROUP__MARKERS = BootstrapPackage.BOOTSTRAP_ELEMENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACEHOLDER_GROUP__ID = BootstrapPackage.BOOTSTRAP_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACEHOLDER_GROUP__CLASSES = BootstrapPackage.BOOTSTRAP_ELEMENT__CLASSES;

	/**
	 * The feature id for the '<em><b>Style</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACEHOLDER_GROUP__STYLE = BootstrapPackage.BOOTSTRAP_ELEMENT__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACEHOLDER_GROUP__ATTRIBUTES = BootstrapPackage.BOOTSTRAP_ELEMENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACEHOLDER_GROUP__CONTENTS = BootstrapPackage.BOOTSTRAP_ELEMENT__CONTENTS;

	/**
	 * The feature id for the '<em><b>Animation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACEHOLDER_GROUP__ANIMATION = BootstrapPackage.BOOTSTRAP_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Placeholders</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACEHOLDER_GROUP__PLACEHOLDERS = BootstrapPackage.BOOTSTRAP_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Placeholder Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACEHOLDER_GROUP_FEATURE_COUNT = BootstrapPackage.BOOTSTRAP_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Tag Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACEHOLDER_GROUP___TAG_NAME = BootstrapPackage.BOOTSTRAP_ELEMENT___TAG_NAME;

	/**
	 * The number of operations of the '<em>Placeholder Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACEHOLDER_GROUP_OPERATION_COUNT = BootstrapPackage.BOOTSTRAP_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.impl.PlaceholderImpl <em>Placeholder</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.impl.PlaceholderImpl
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.impl.ContentPackageImpl#getPlaceholder()
	 * @generated
	 */
	int PLACEHOLDER = 24;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACEHOLDER__MARKERS = BootstrapPackage.BOOTSTRAP_ELEMENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACEHOLDER__ID = BootstrapPackage.BOOTSTRAP_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACEHOLDER__CLASSES = BootstrapPackage.BOOTSTRAP_ELEMENT__CLASSES;

	/**
	 * The feature id for the '<em><b>Style</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACEHOLDER__STYLE = BootstrapPackage.BOOTSTRAP_ELEMENT__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACEHOLDER__ATTRIBUTES = BootstrapPackage.BOOTSTRAP_ELEMENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACEHOLDER__CONTENTS = BootstrapPackage.BOOTSTRAP_ELEMENT__CONTENTS;

	/**
	 * The feature id for the '<em><b>Bg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACEHOLDER__BG = BootstrapPackage.BOOTSTRAP_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACEHOLDER__SIZE = BootstrapPackage.BOOTSTRAP_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Sizes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACEHOLDER__SIZES = BootstrapPackage.BOOTSTRAP_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Placeholder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACEHOLDER_FEATURE_COUNT = BootstrapPackage.BOOTSTRAP_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Tag Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACEHOLDER___TAG_NAME = BootstrapPackage.BOOTSTRAP_ELEMENT___TAG_NAME;

	/**
	 * The number of operations of the '<em>Placeholder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACEHOLDER_OPERATION_COUNT = BootstrapPackage.BOOTSTRAP_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.impl.PlaceholderButtonImpl <em>Placeholder Button</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.impl.PlaceholderButtonImpl
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.impl.ContentPackageImpl#getPlaceholderButton()
	 * @generated
	 */
	int PLACEHOLDER_BUTTON = 25;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACEHOLDER_BUTTON__MARKERS = BootstrapPackage.BOOTSTRAP_ELEMENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACEHOLDER_BUTTON__ID = BootstrapPackage.BOOTSTRAP_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACEHOLDER_BUTTON__CLASSES = BootstrapPackage.BOOTSTRAP_ELEMENT__CLASSES;

	/**
	 * The feature id for the '<em><b>Style</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACEHOLDER_BUTTON__STYLE = BootstrapPackage.BOOTSTRAP_ELEMENT__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACEHOLDER_BUTTON__ATTRIBUTES = BootstrapPackage.BOOTSTRAP_ELEMENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACEHOLDER_BUTTON__CONTENTS = BootstrapPackage.BOOTSTRAP_ELEMENT__CONTENTS;

	/**
	 * The feature id for the '<em><b>Variant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACEHOLDER_BUTTON__VARIANT = BootstrapPackage.BOOTSTRAP_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sizes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACEHOLDER_BUTTON__SIZES = BootstrapPackage.BOOTSTRAP_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Placeholder Button</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACEHOLDER_BUTTON_FEATURE_COUNT = BootstrapPackage.BOOTSTRAP_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Tag Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACEHOLDER_BUTTON___TAG_NAME = BootstrapPackage.BOOTSTRAP_ELEMENT___TAG_NAME;

	/**
	 * The number of operations of the '<em>Placeholder Button</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACEHOLDER_BUTTON_OPERATION_COUNT = BootstrapPackage.BOOTSTRAP_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.impl.AccordionImpl <em>Accordion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.impl.AccordionImpl
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.impl.ContentPackageImpl#getAccordion()
	 * @generated
	 */
	int ACCORDION = 26;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCORDION__MARKERS = BootstrapPackage.BOOTSTRAP_ELEMENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCORDION__ID = BootstrapPackage.BOOTSTRAP_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCORDION__CLASSES = BootstrapPackage.BOOTSTRAP_ELEMENT__CLASSES;

	/**
	 * The feature id for the '<em><b>Style</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCORDION__STYLE = BootstrapPackage.BOOTSTRAP_ELEMENT__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCORDION__ATTRIBUTES = BootstrapPackage.BOOTSTRAP_ELEMENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCORDION__CONTENTS = BootstrapPackage.BOOTSTRAP_ELEMENT__CONTENTS;

	/**
	 * The feature id for the '<em><b>Default Active Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCORDION__DEFAULT_ACTIVE_KEY = BootstrapPackage.BOOTSTRAP_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Flush</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCORDION__FLUSH = BootstrapPackage.BOOTSTRAP_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Always Open</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCORDION__ALWAYS_OPEN = BootstrapPackage.BOOTSTRAP_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCORDION__ITEMS = BootstrapPackage.BOOTSTRAP_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Accordion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCORDION_FEATURE_COUNT = BootstrapPackage.BOOTSTRAP_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Tag Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCORDION___TAG_NAME = BootstrapPackage.BOOTSTRAP_ELEMENT___TAG_NAME;

	/**
	 * The number of operations of the '<em>Accordion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCORDION_OPERATION_COUNT = BootstrapPackage.BOOTSTRAP_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.impl.AccordionItemImpl <em>Accordion Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.impl.AccordionItemImpl
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.impl.ContentPackageImpl#getAccordionItem()
	 * @generated
	 */
	int ACCORDION_ITEM = 27;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCORDION_ITEM__MARKERS = BootstrapPackage.BOOTSTRAP_ELEMENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCORDION_ITEM__ID = BootstrapPackage.BOOTSTRAP_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCORDION_ITEM__CLASSES = BootstrapPackage.BOOTSTRAP_ELEMENT__CLASSES;

	/**
	 * The feature id for the '<em><b>Style</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCORDION_ITEM__STYLE = BootstrapPackage.BOOTSTRAP_ELEMENT__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCORDION_ITEM__ATTRIBUTES = BootstrapPackage.BOOTSTRAP_ELEMENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCORDION_ITEM__CONTENTS = BootstrapPackage.BOOTSTRAP_ELEMENT__CONTENTS;

	/**
	 * The feature id for the '<em><b>Event Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCORDION_ITEM__EVENT_KEY = BootstrapPackage.BOOTSTRAP_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Header</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCORDION_ITEM__HEADER = BootstrapPackage.BOOTSTRAP_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCORDION_ITEM__BODY = BootstrapPackage.BOOTSTRAP_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Accordion Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCORDION_ITEM_FEATURE_COUNT = BootstrapPackage.BOOTSTRAP_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Tag Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCORDION_ITEM___TAG_NAME = BootstrapPackage.BOOTSTRAP_ELEMENT___TAG_NAME;

	/**
	 * The number of operations of the '<em>Accordion Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCORDION_ITEM_OPERATION_COUNT = BootstrapPackage.BOOTSTRAP_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.impl.AccordionHeaderImpl <em>Accordion Header</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.impl.AccordionHeaderImpl
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.impl.ContentPackageImpl#getAccordionHeader()
	 * @generated
	 */
	int ACCORDION_HEADER = 28;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCORDION_HEADER__MARKERS = BootstrapPackage.BOOTSTRAP_ELEMENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCORDION_HEADER__ID = BootstrapPackage.BOOTSTRAP_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCORDION_HEADER__CLASSES = BootstrapPackage.BOOTSTRAP_ELEMENT__CLASSES;

	/**
	 * The feature id for the '<em><b>Style</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCORDION_HEADER__STYLE = BootstrapPackage.BOOTSTRAP_ELEMENT__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCORDION_HEADER__ATTRIBUTES = BootstrapPackage.BOOTSTRAP_ELEMENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCORDION_HEADER__CONTENTS = BootstrapPackage.BOOTSTRAP_ELEMENT__CONTENTS;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCORDION_HEADER__CONTENT = BootstrapPackage.BOOTSTRAP_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Accordion Header</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCORDION_HEADER_FEATURE_COUNT = BootstrapPackage.BOOTSTRAP_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Tag Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCORDION_HEADER___TAG_NAME = BootstrapPackage.BOOTSTRAP_ELEMENT___TAG_NAME;

	/**
	 * The number of operations of the '<em>Accordion Header</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCORDION_HEADER_OPERATION_COUNT = BootstrapPackage.BOOTSTRAP_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.impl.AccordionBodyImpl <em>Accordion Body</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.impl.AccordionBodyImpl
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.impl.ContentPackageImpl#getAccordionBody()
	 * @generated
	 */
	int ACCORDION_BODY = 29;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCORDION_BODY__MARKERS = BootstrapPackage.BOOTSTRAP_ELEMENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCORDION_BODY__ID = BootstrapPackage.BOOTSTRAP_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCORDION_BODY__CLASSES = BootstrapPackage.BOOTSTRAP_ELEMENT__CLASSES;

	/**
	 * The feature id for the '<em><b>Style</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCORDION_BODY__STYLE = BootstrapPackage.BOOTSTRAP_ELEMENT__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCORDION_BODY__ATTRIBUTES = BootstrapPackage.BOOTSTRAP_ELEMENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCORDION_BODY__CONTENTS = BootstrapPackage.BOOTSTRAP_ELEMENT__CONTENTS;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCORDION_BODY__CONTENT = BootstrapPackage.BOOTSTRAP_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Accordion Body</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCORDION_BODY_FEATURE_COUNT = BootstrapPackage.BOOTSTRAP_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Tag Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCORDION_BODY___TAG_NAME = BootstrapPackage.BOOTSTRAP_ELEMENT___TAG_NAME;

	/**
	 * The number of operations of the '<em>Accordion Body</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCORDION_BODY_OPERATION_COUNT = BootstrapPackage.BOOTSTRAP_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.impl.CarouselImpl <em>Carousel</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.impl.CarouselImpl
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.impl.ContentPackageImpl#getCarousel()
	 * @generated
	 */
	int CAROUSEL = 30;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAROUSEL__MARKERS = BootstrapPackage.BOOTSTRAP_ELEMENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAROUSEL__ID = BootstrapPackage.BOOTSTRAP_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAROUSEL__CLASSES = BootstrapPackage.BOOTSTRAP_ELEMENT__CLASSES;

	/**
	 * The feature id for the '<em><b>Style</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAROUSEL__STYLE = BootstrapPackage.BOOTSTRAP_ELEMENT__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAROUSEL__ATTRIBUTES = BootstrapPackage.BOOTSTRAP_ELEMENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAROUSEL__CONTENTS = BootstrapPackage.BOOTSTRAP_ELEMENT__CONTENTS;

	/**
	 * The feature id for the '<em><b>Controls</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAROUSEL__CONTROLS = BootstrapPackage.BOOTSTRAP_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Indicators</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAROUSEL__INDICATORS = BootstrapPackage.BOOTSTRAP_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Fade</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAROUSEL__FADE = BootstrapPackage.BOOTSTRAP_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Interval</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAROUSEL__INTERVAL = BootstrapPackage.BOOTSTRAP_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Variant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAROUSEL__VARIANT = BootstrapPackage.BOOTSTRAP_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAROUSEL__ITEMS = BootstrapPackage.BOOTSTRAP_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Carousel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAROUSEL_FEATURE_COUNT = BootstrapPackage.BOOTSTRAP_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The operation id for the '<em>Tag Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAROUSEL___TAG_NAME = BootstrapPackage.BOOTSTRAP_ELEMENT___TAG_NAME;

	/**
	 * The number of operations of the '<em>Carousel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAROUSEL_OPERATION_COUNT = BootstrapPackage.BOOTSTRAP_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.impl.CarouselItemImpl <em>Carousel Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.impl.CarouselItemImpl
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.impl.ContentPackageImpl#getCarouselItem()
	 * @generated
	 */
	int CAROUSEL_ITEM = 31;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAROUSEL_ITEM__MARKERS = BootstrapPackage.BOOTSTRAP_ELEMENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAROUSEL_ITEM__ID = BootstrapPackage.BOOTSTRAP_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAROUSEL_ITEM__CLASSES = BootstrapPackage.BOOTSTRAP_ELEMENT__CLASSES;

	/**
	 * The feature id for the '<em><b>Style</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAROUSEL_ITEM__STYLE = BootstrapPackage.BOOTSTRAP_ELEMENT__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAROUSEL_ITEM__ATTRIBUTES = BootstrapPackage.BOOTSTRAP_ELEMENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAROUSEL_ITEM__CONTENTS = BootstrapPackage.BOOTSTRAP_ELEMENT__CONTENTS;

	/**
	 * The feature id for the '<em><b>Interval</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAROUSEL_ITEM__INTERVAL = BootstrapPackage.BOOTSTRAP_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Content</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAROUSEL_ITEM__CONTENT = BootstrapPackage.BOOTSTRAP_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Caption</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAROUSEL_ITEM__CAPTION = BootstrapPackage.BOOTSTRAP_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Carousel Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAROUSEL_ITEM_FEATURE_COUNT = BootstrapPackage.BOOTSTRAP_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Tag Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAROUSEL_ITEM___TAG_NAME = BootstrapPackage.BOOTSTRAP_ELEMENT___TAG_NAME;

	/**
	 * The number of operations of the '<em>Carousel Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAROUSEL_ITEM_OPERATION_COUNT = BootstrapPackage.BOOTSTRAP_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.impl.CarouselCaptionImpl <em>Carousel Caption</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.impl.CarouselCaptionImpl
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.impl.ContentPackageImpl#getCarouselCaption()
	 * @generated
	 */
	int CAROUSEL_CAPTION = 32;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAROUSEL_CAPTION__MARKERS = BootstrapPackage.BOOTSTRAP_ELEMENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAROUSEL_CAPTION__ID = BootstrapPackage.BOOTSTRAP_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAROUSEL_CAPTION__CLASSES = BootstrapPackage.BOOTSTRAP_ELEMENT__CLASSES;

	/**
	 * The feature id for the '<em><b>Style</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAROUSEL_CAPTION__STYLE = BootstrapPackage.BOOTSTRAP_ELEMENT__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAROUSEL_CAPTION__ATTRIBUTES = BootstrapPackage.BOOTSTRAP_ELEMENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAROUSEL_CAPTION__CONTENTS = BootstrapPackage.BOOTSTRAP_ELEMENT__CONTENTS;

	/**
	 * The feature id for the '<em><b>Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAROUSEL_CAPTION__CONTENT = BootstrapPackage.BOOTSTRAP_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Carousel Caption</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAROUSEL_CAPTION_FEATURE_COUNT = BootstrapPackage.BOOTSTRAP_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Tag Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAROUSEL_CAPTION___TAG_NAME = BootstrapPackage.BOOTSTRAP_ELEMENT___TAG_NAME;

	/**
	 * The number of operations of the '<em>Carousel Caption</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAROUSEL_CAPTION_OPERATION_COUNT = BootstrapPackage.BOOTSTRAP_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.ButtonType <em>Button Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.ButtonType
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.impl.ContentPackageImpl#getButtonType()
	 * @generated
	 */
	int BUTTON_TYPE = 33;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.CardImageVariant <em>Card Image Variant</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.CardImageVariant
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.impl.ContentPackageImpl#getCardImageVariant()
	 * @generated
	 */
	int CARD_IMAGE_VARIANT = 34;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.SpinnerAnimation <em>Spinner Animation</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.SpinnerAnimation
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.impl.ContentPackageImpl#getSpinnerAnimation()
	 * @generated
	 */
	int SPINNER_ANIMATION = 35;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.PlaceholderAnimation <em>Placeholder Animation</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.PlaceholderAnimation
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.impl.ContentPackageImpl#getPlaceholderAnimation()
	 * @generated
	 */
	int PLACEHOLDER_ANIMATION = 36;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.PlaceholderSize <em>Placeholder Size</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.PlaceholderSize
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.impl.ContentPackageImpl#getPlaceholderSize()
	 * @generated
	 */
	int PLACEHOLDER_SIZE = 37;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.CarouselVariant <em>Carousel Variant</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.CarouselVariant
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.impl.ContentPackageImpl#getCarouselVariant()
	 * @generated
	 */
	int CAROUSEL_VARIANT = 38;


	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.Alert <em>Alert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Alert</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.Alert
	 * @generated
	 */
	EClass getAlert();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.Alert#getVariant <em>Variant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Variant</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.Alert#getVariant()
	 * @see #getAlert()
	 * @generated
	 */
	EAttribute getAlert_Variant();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.Alert#isDismissible <em>Dismissible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dismissible</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.Alert#isDismissible()
	 * @see #getAlert()
	 * @generated
	 */
	EAttribute getAlert_Dismissible();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.Alert#getHeading <em>Heading</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Heading</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.Alert#getHeading()
	 * @see #getAlert()
	 * @generated
	 */
	EReference getAlert_Heading();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.AlertHeading <em>Alert Heading</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Alert Heading</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.AlertHeading
	 * @generated
	 */
	EClass getAlertHeading();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.AlertLink <em>Alert Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Alert Link</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.AlertLink
	 * @generated
	 */
	EClass getAlertLink();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.AlertLink#getHref <em>Href</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Href</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.AlertLink#getHref()
	 * @see #getAlertLink()
	 * @generated
	 */
	EAttribute getAlertLink_Href();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.Badge <em>Badge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Badge</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.Badge
	 * @generated
	 */
	EClass getBadge();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.Badge#getBg <em>Bg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bg</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.Badge#getBg()
	 * @see #getBadge()
	 * @generated
	 */
	EAttribute getBadge_Bg();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.Badge#isPill <em>Pill</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pill</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.Badge#isPill()
	 * @see #getBadge()
	 * @generated
	 */
	EAttribute getBadge_Pill();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.Button <em>Button</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Button</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.Button
	 * @generated
	 */
	EClass getButton();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.Button#getVariant <em>Variant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Variant</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.Button#getVariant()
	 * @see #getButton()
	 * @generated
	 */
	EAttribute getButton_Variant();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.Button#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.Button#getSize()
	 * @see #getButton()
	 * @generated
	 */
	EAttribute getButton_Size();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.Button#getButtonType <em>Button Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Button Type</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.Button#getButtonType()
	 * @see #getButton()
	 * @generated
	 */
	EAttribute getButton_ButtonType();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.Button#isActive <em>Active</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Active</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.Button#isActive()
	 * @see #getButton()
	 * @generated
	 */
	EAttribute getButton_Active();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.Button#isDisabled <em>Disabled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Disabled</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.Button#isDisabled()
	 * @see #getButton()
	 * @generated
	 */
	EAttribute getButton_Disabled();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.Button#getHref <em>Href</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Href</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.Button#getHref()
	 * @see #getButton()
	 * @generated
	 */
	EAttribute getButton_Href();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.ButtonGroup <em>Button Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Button Group</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.ButtonGroup
	 * @generated
	 */
	EClass getButtonGroup();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.ButtonGroup#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.ButtonGroup#getSize()
	 * @see #getButtonGroup()
	 * @generated
	 */
	EAttribute getButtonGroup_Size();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.ButtonGroup#isVertical <em>Vertical</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vertical</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.ButtonGroup#isVertical()
	 * @see #getButtonGroup()
	 * @generated
	 */
	EAttribute getButtonGroup_Vertical();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.ButtonGroup#getButtons <em>Buttons</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Buttons</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.ButtonGroup#getButtons()
	 * @see #getButtonGroup()
	 * @generated
	 */
	EReference getButtonGroup_Buttons();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.ButtonToolbar <em>Button Toolbar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Button Toolbar</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.ButtonToolbar
	 * @generated
	 */
	EClass getButtonToolbar();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.ButtonToolbar#getGroups <em>Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Groups</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.ButtonToolbar#getGroups()
	 * @see #getButtonToolbar()
	 * @generated
	 */
	EReference getButtonToolbar_Groups();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.CloseButton <em>Close Button</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Close Button</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.CloseButton
	 * @generated
	 */
	EClass getCloseButton();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.CloseButton#isDisabled <em>Disabled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Disabled</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.CloseButton#isDisabled()
	 * @see #getCloseButton()
	 * @generated
	 */
	EAttribute getCloseButton_Disabled();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.Card <em>Card</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Card</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.Card
	 * @generated
	 */
	EClass getCard();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.Card#getBg <em>Bg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bg</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.Card#getBg()
	 * @see #getCard()
	 * @generated
	 */
	EAttribute getCard_Bg();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.Card#getTextColor <em>Text Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text Color</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.Card#getTextColor()
	 * @see #getCard()
	 * @generated
	 */
	EAttribute getCard_TextColor();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.Card#getBorder <em>Border</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Border</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.Card#getBorder()
	 * @see #getCard()
	 * @generated
	 */
	EAttribute getCard_Border();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.Card#getHeader <em>Header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Header</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.Card#getHeader()
	 * @see #getCard()
	 * @generated
	 */
	EReference getCard_Header();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.Card#getImage <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Image</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.Card#getImage()
	 * @see #getCard()
	 * @generated
	 */
	EReference getCard_Image();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.Card#getBodies <em>Bodies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bodies</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.Card#getBodies()
	 * @see #getCard()
	 * @generated
	 */
	EReference getCard_Bodies();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.Card#getFooter <em>Footer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Footer</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.Card#getFooter()
	 * @see #getCard()
	 * @generated
	 */
	EReference getCard_Footer();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.CardHeader <em>Card Header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Card Header</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.CardHeader
	 * @generated
	 */
	EClass getCardHeader();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.CardImage <em>Card Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Card Image</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.CardImage
	 * @generated
	 */
	EClass getCardImage();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.CardImage#getVariant <em>Variant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Variant</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.CardImage#getVariant()
	 * @see #getCardImage()
	 * @generated
	 */
	EAttribute getCardImage_Variant();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.CardImage#getSrc <em>Src</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Src</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.CardImage#getSrc()
	 * @see #getCardImage()
	 * @generated
	 */
	EAttribute getCardImage_Src();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.CardImage#getAlt <em>Alt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alt</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.CardImage#getAlt()
	 * @see #getCardImage()
	 * @generated
	 */
	EAttribute getCardImage_Alt();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.CardBody <em>Card Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Card Body</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.CardBody
	 * @generated
	 */
	EClass getCardBody();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.CardBody#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Title</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.CardBody#getTitle()
	 * @see #getCardBody()
	 * @generated
	 */
	EReference getCardBody_Title();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.CardBody#getSubtitle <em>Subtitle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Subtitle</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.CardBody#getSubtitle()
	 * @see #getCardBody()
	 * @generated
	 */
	EReference getCardBody_Subtitle();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.CardBody#getTexts <em>Texts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Texts</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.CardBody#getTexts()
	 * @see #getCardBody()
	 * @generated
	 */
	EReference getCardBody_Texts();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.CardBody#getLinks <em>Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Links</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.CardBody#getLinks()
	 * @see #getCardBody()
	 * @generated
	 */
	EReference getCardBody_Links();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.CardTitle <em>Card Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Card Title</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.CardTitle
	 * @generated
	 */
	EClass getCardTitle();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.CardSubtitle <em>Card Subtitle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Card Subtitle</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.CardSubtitle
	 * @generated
	 */
	EClass getCardSubtitle();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.CardText <em>Card Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Card Text</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.CardText
	 * @generated
	 */
	EClass getCardText();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.CardLink <em>Card Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Card Link</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.CardLink
	 * @generated
	 */
	EClass getCardLink();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.CardLink#getHref <em>Href</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Href</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.CardLink#getHref()
	 * @see #getCardLink()
	 * @generated
	 */
	EAttribute getCardLink_Href();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.CardFooter <em>Card Footer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Card Footer</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.CardFooter
	 * @generated
	 */
	EClass getCardFooter();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.CardGroup <em>Card Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Card Group</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.CardGroup
	 * @generated
	 */
	EClass getCardGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.CardGroup#getCards <em>Cards</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cards</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.CardGroup#getCards()
	 * @see #getCardGroup()
	 * @generated
	 */
	EReference getCardGroup_Cards();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.ListGroup <em>List Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>List Group</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.ListGroup
	 * @generated
	 */
	EClass getListGroup();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.ListGroup#isFlush <em>Flush</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Flush</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.ListGroup#isFlush()
	 * @see #getListGroup()
	 * @generated
	 */
	EAttribute getListGroup_Flush();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.ListGroup#isNumbered <em>Numbered</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Numbered</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.ListGroup#isNumbered()
	 * @see #getListGroup()
	 * @generated
	 */
	EAttribute getListGroup_Numbered();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.ListGroup#isHorizontal <em>Horizontal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Horizontal</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.ListGroup#isHorizontal()
	 * @see #getListGroup()
	 * @generated
	 */
	EAttribute getListGroup_Horizontal();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.ListGroup#getHorizontalFrom <em>Horizontal From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Horizontal From</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.ListGroup#getHorizontalFrom()
	 * @see #getListGroup()
	 * @generated
	 */
	EAttribute getListGroup_HorizontalFrom();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.ListGroup#getItems <em>Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Items</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.ListGroup#getItems()
	 * @see #getListGroup()
	 * @generated
	 */
	EReference getListGroup_Items();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.ListGroupItem <em>List Group Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>List Group Item</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.ListGroupItem
	 * @generated
	 */
	EClass getListGroupItem();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.ListGroupItem#getVariant <em>Variant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Variant</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.ListGroupItem#getVariant()
	 * @see #getListGroupItem()
	 * @generated
	 */
	EAttribute getListGroupItem_Variant();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.ListGroupItem#isAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Action</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.ListGroupItem#isAction()
	 * @see #getListGroupItem()
	 * @generated
	 */
	EAttribute getListGroupItem_Action();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.ListGroupItem#isActive <em>Active</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Active</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.ListGroupItem#isActive()
	 * @see #getListGroupItem()
	 * @generated
	 */
	EAttribute getListGroupItem_Active();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.ListGroupItem#isDisabled <em>Disabled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Disabled</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.ListGroupItem#isDisabled()
	 * @see #getListGroupItem()
	 * @generated
	 */
	EAttribute getListGroupItem_Disabled();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.ListGroupItem#getHref <em>Href</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Href</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.ListGroupItem#getHref()
	 * @see #getListGroupItem()
	 * @generated
	 */
	EAttribute getListGroupItem_Href();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.Table <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.Table
	 * @generated
	 */
	EClass getTable();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.Table#isStriped <em>Striped</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Striped</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.Table#isStriped()
	 * @see #getTable()
	 * @generated
	 */
	EAttribute getTable_Striped();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.Table#isBordered <em>Bordered</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bordered</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.Table#isBordered()
	 * @see #getTable()
	 * @generated
	 */
	EAttribute getTable_Bordered();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.Table#isBorderless <em>Borderless</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Borderless</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.Table#isBorderless()
	 * @see #getTable()
	 * @generated
	 */
	EAttribute getTable_Borderless();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.Table#isHover <em>Hover</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hover</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.Table#isHover()
	 * @see #getTable()
	 * @generated
	 */
	EAttribute getTable_Hover();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.Table#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.Table#getSize()
	 * @see #getTable()
	 * @generated
	 */
	EAttribute getTable_Size();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.Table#getVariant <em>Variant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Variant</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.Table#getVariant()
	 * @see #getTable()
	 * @generated
	 */
	EAttribute getTable_Variant();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.Table#isResponsive <em>Responsive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Responsive</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.Table#isResponsive()
	 * @see #getTable()
	 * @generated
	 */
	EAttribute getTable_Responsive();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.Table#getResponsiveBelow <em>Responsive Below</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Responsive Below</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.Table#getResponsiveBelow()
	 * @see #getTable()
	 * @generated
	 */
	EAttribute getTable_ResponsiveBelow();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.Table#getHead <em>Head</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Head</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.Table#getHead()
	 * @see #getTable()
	 * @generated
	 */
	EReference getTable_Head();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.Table#getBodies <em>Bodies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bodies</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.Table#getBodies()
	 * @see #getTable()
	 * @generated
	 */
	EReference getTable_Bodies();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.Table#getFoot <em>Foot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Foot</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.Table#getFoot()
	 * @see #getTable()
	 * @generated
	 */
	EReference getTable_Foot();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.ProgressBar <em>Progress Bar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Progress Bar</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.ProgressBar
	 * @generated
	 */
	EClass getProgressBar();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.ProgressBar#getNow <em>Now</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Now</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.ProgressBar#getNow()
	 * @see #getProgressBar()
	 * @generated
	 */
	EAttribute getProgressBar_Now();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.ProgressBar#getMin <em>Min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.ProgressBar#getMin()
	 * @see #getProgressBar()
	 * @generated
	 */
	EAttribute getProgressBar_Min();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.ProgressBar#getMax <em>Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.ProgressBar#getMax()
	 * @see #getProgressBar()
	 * @generated
	 */
	EAttribute getProgressBar_Max();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.ProgressBar#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.ProgressBar#getLabel()
	 * @see #getProgressBar()
	 * @generated
	 */
	EAttribute getProgressBar_Label();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.ProgressBar#isVisuallyHidden <em>Visually Hidden</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visually Hidden</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.ProgressBar#isVisuallyHidden()
	 * @see #getProgressBar()
	 * @generated
	 */
	EAttribute getProgressBar_VisuallyHidden();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.ProgressBar#getVariant <em>Variant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Variant</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.ProgressBar#getVariant()
	 * @see #getProgressBar()
	 * @generated
	 */
	EAttribute getProgressBar_Variant();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.ProgressBar#isStriped <em>Striped</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Striped</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.ProgressBar#isStriped()
	 * @see #getProgressBar()
	 * @generated
	 */
	EAttribute getProgressBar_Striped();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.ProgressBar#isAnimated <em>Animated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Animated</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.ProgressBar#isAnimated()
	 * @see #getProgressBar()
	 * @generated
	 */
	EAttribute getProgressBar_Animated();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.ProgressBar#getBars <em>Bars</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bars</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.ProgressBar#getBars()
	 * @see #getProgressBar()
	 * @generated
	 */
	EReference getProgressBar_Bars();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.Spinner <em>Spinner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Spinner</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.Spinner
	 * @generated
	 */
	EClass getSpinner();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.Spinner#getAnimation <em>Animation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Animation</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.Spinner#getAnimation()
	 * @see #getSpinner()
	 * @generated
	 */
	EAttribute getSpinner_Animation();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.Spinner#getVariant <em>Variant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Variant</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.Spinner#getVariant()
	 * @see #getSpinner()
	 * @generated
	 */
	EAttribute getSpinner_Variant();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.Spinner#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.Spinner#getSize()
	 * @see #getSpinner()
	 * @generated
	 */
	EAttribute getSpinner_Size();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.PlaceholderGroup <em>Placeholder Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Placeholder Group</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.PlaceholderGroup
	 * @generated
	 */
	EClass getPlaceholderGroup();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.PlaceholderGroup#getAnimation <em>Animation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Animation</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.PlaceholderGroup#getAnimation()
	 * @see #getPlaceholderGroup()
	 * @generated
	 */
	EAttribute getPlaceholderGroup_Animation();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.PlaceholderGroup#getPlaceholders <em>Placeholders</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Placeholders</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.PlaceholderGroup#getPlaceholders()
	 * @see #getPlaceholderGroup()
	 * @generated
	 */
	EReference getPlaceholderGroup_Placeholders();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.Placeholder <em>Placeholder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Placeholder</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.Placeholder
	 * @generated
	 */
	EClass getPlaceholder();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.Placeholder#getBg <em>Bg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bg</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.Placeholder#getBg()
	 * @see #getPlaceholder()
	 * @generated
	 */
	EAttribute getPlaceholder_Bg();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.Placeholder#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.Placeholder#getSize()
	 * @see #getPlaceholder()
	 * @generated
	 */
	EAttribute getPlaceholder_Size();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.Placeholder#getSizes <em>Sizes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sizes</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.Placeholder#getSizes()
	 * @see #getPlaceholder()
	 * @generated
	 */
	EReference getPlaceholder_Sizes();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.PlaceholderButton <em>Placeholder Button</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Placeholder Button</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.PlaceholderButton
	 * @generated
	 */
	EClass getPlaceholderButton();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.PlaceholderButton#getVariant <em>Variant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Variant</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.PlaceholderButton#getVariant()
	 * @see #getPlaceholderButton()
	 * @generated
	 */
	EAttribute getPlaceholderButton_Variant();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.PlaceholderButton#getSizes <em>Sizes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sizes</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.PlaceholderButton#getSizes()
	 * @see #getPlaceholderButton()
	 * @generated
	 */
	EReference getPlaceholderButton_Sizes();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.Accordion <em>Accordion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Accordion</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.Accordion
	 * @generated
	 */
	EClass getAccordion();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.Accordion#getDefaultActiveKey <em>Default Active Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Active Key</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.Accordion#getDefaultActiveKey()
	 * @see #getAccordion()
	 * @generated
	 */
	EAttribute getAccordion_DefaultActiveKey();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.Accordion#isFlush <em>Flush</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Flush</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.Accordion#isFlush()
	 * @see #getAccordion()
	 * @generated
	 */
	EAttribute getAccordion_Flush();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.Accordion#isAlwaysOpen <em>Always Open</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Always Open</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.Accordion#isAlwaysOpen()
	 * @see #getAccordion()
	 * @generated
	 */
	EAttribute getAccordion_AlwaysOpen();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.Accordion#getItems <em>Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Items</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.Accordion#getItems()
	 * @see #getAccordion()
	 * @generated
	 */
	EReference getAccordion_Items();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.AccordionItem <em>Accordion Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Accordion Item</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.AccordionItem
	 * @generated
	 */
	EClass getAccordionItem();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.AccordionItem#getEventKey <em>Event Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Event Key</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.AccordionItem#getEventKey()
	 * @see #getAccordionItem()
	 * @generated
	 */
	EAttribute getAccordionItem_EventKey();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.AccordionItem#getHeader <em>Header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Header</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.AccordionItem#getHeader()
	 * @see #getAccordionItem()
	 * @generated
	 */
	EReference getAccordionItem_Header();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.AccordionItem#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Body</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.AccordionItem#getBody()
	 * @see #getAccordionItem()
	 * @generated
	 */
	EReference getAccordionItem_Body();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.AccordionHeader <em>Accordion Header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Accordion Header</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.AccordionHeader
	 * @generated
	 */
	EClass getAccordionHeader();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.AccordionBody <em>Accordion Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Accordion Body</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.AccordionBody
	 * @generated
	 */
	EClass getAccordionBody();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.Carousel <em>Carousel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Carousel</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.Carousel
	 * @generated
	 */
	EClass getCarousel();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.Carousel#isControls <em>Controls</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Controls</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.Carousel#isControls()
	 * @see #getCarousel()
	 * @generated
	 */
	EAttribute getCarousel_Controls();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.Carousel#isIndicators <em>Indicators</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Indicators</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.Carousel#isIndicators()
	 * @see #getCarousel()
	 * @generated
	 */
	EAttribute getCarousel_Indicators();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.Carousel#isFade <em>Fade</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fade</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.Carousel#isFade()
	 * @see #getCarousel()
	 * @generated
	 */
	EAttribute getCarousel_Fade();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.Carousel#getInterval <em>Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Interval</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.Carousel#getInterval()
	 * @see #getCarousel()
	 * @generated
	 */
	EAttribute getCarousel_Interval();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.Carousel#getVariant <em>Variant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Variant</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.Carousel#getVariant()
	 * @see #getCarousel()
	 * @generated
	 */
	EAttribute getCarousel_Variant();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.Carousel#getItems <em>Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Items</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.Carousel#getItems()
	 * @see #getCarousel()
	 * @generated
	 */
	EReference getCarousel_Items();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.CarouselItem <em>Carousel Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Carousel Item</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.CarouselItem
	 * @generated
	 */
	EClass getCarouselItem();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.CarouselItem#getInterval <em>Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Interval</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.CarouselItem#getInterval()
	 * @see #getCarouselItem()
	 * @generated
	 */
	EAttribute getCarouselItem_Interval();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.CarouselItem#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Content</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.CarouselItem#getContent()
	 * @see #getCarouselItem()
	 * @generated
	 */
	EReference getCarouselItem_Content();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.CarouselItem#getCaption <em>Caption</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Caption</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.CarouselItem#getCaption()
	 * @see #getCarouselItem()
	 * @generated
	 */
	EReference getCarouselItem_Caption();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.CarouselCaption <em>Carousel Caption</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Carousel Caption</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.CarouselCaption
	 * @generated
	 */
	EClass getCarouselCaption();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.CarouselCaption#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Content</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.CarouselCaption#getContent()
	 * @see #getCarouselCaption()
	 * @generated
	 */
	EReference getCarouselCaption_Content();

	/**
	 * Returns the meta object for enum '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.ButtonType <em>Button Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Button Type</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.ButtonType
	 * @generated
	 */
	EEnum getButtonType();

	/**
	 * Returns the meta object for enum '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.CardImageVariant <em>Card Image Variant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Card Image Variant</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.CardImageVariant
	 * @generated
	 */
	EEnum getCardImageVariant();

	/**
	 * Returns the meta object for enum '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.SpinnerAnimation <em>Spinner Animation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Spinner Animation</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.SpinnerAnimation
	 * @generated
	 */
	EEnum getSpinnerAnimation();

	/**
	 * Returns the meta object for enum '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.PlaceholderAnimation <em>Placeholder Animation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Placeholder Animation</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.PlaceholderAnimation
	 * @generated
	 */
	EEnum getPlaceholderAnimation();

	/**
	 * Returns the meta object for enum '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.PlaceholderSize <em>Placeholder Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Placeholder Size</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.PlaceholderSize
	 * @generated
	 */
	EEnum getPlaceholderSize();

	/**
	 * Returns the meta object for enum '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.CarouselVariant <em>Carousel Variant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Carousel Variant</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.CarouselVariant
	 * @generated
	 */
	EEnum getCarouselVariant();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ContentFactory getContentFactory();

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
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.impl.AlertImpl <em>Alert</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.impl.AlertImpl
		 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.impl.ContentPackageImpl#getAlert()
		 * @generated
		 */
		EClass ALERT = eINSTANCE.getAlert();

		/**
		 * The meta object literal for the '<em><b>Variant</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALERT__VARIANT = eINSTANCE.getAlert_Variant();

		/**
		 * The meta object literal for the '<em><b>Dismissible</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALERT__DISMISSIBLE = eINSTANCE.getAlert_Dismissible();

		/**
		 * The meta object literal for the '<em><b>Heading</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALERT__HEADING = eINSTANCE.getAlert_Heading();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.impl.AlertHeadingImpl <em>Alert Heading</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.impl.AlertHeadingImpl
		 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.impl.ContentPackageImpl#getAlertHeading()
		 * @generated
		 */
		EClass ALERT_HEADING = eINSTANCE.getAlertHeading();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.impl.AlertLinkImpl <em>Alert Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.impl.AlertLinkImpl
		 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.impl.ContentPackageImpl#getAlertLink()
		 * @generated
		 */
		EClass ALERT_LINK = eINSTANCE.getAlertLink();

		/**
		 * The meta object literal for the '<em><b>Href</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALERT_LINK__HREF = eINSTANCE.getAlertLink_Href();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.impl.BadgeImpl <em>Badge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.impl.BadgeImpl
		 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.impl.ContentPackageImpl#getBadge()
		 * @generated
		 */
		EClass BADGE = eINSTANCE.getBadge();

		/**
		 * The meta object literal for the '<em><b>Bg</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BADGE__BG = eINSTANCE.getBadge_Bg();

		/**
		 * The meta object literal for the '<em><b>Pill</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BADGE__PILL = eINSTANCE.getBadge_Pill();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.impl.ButtonImpl <em>Button</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.impl.ButtonImpl
		 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.impl.ContentPackageImpl#getButton()
		 * @generated
		 */
		EClass BUTTON = eINSTANCE.getButton();

		/**
		 * The meta object literal for the '<em><b>Variant</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUTTON__VARIANT = eINSTANCE.getButton_Variant();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUTTON__SIZE = eINSTANCE.getButton_Size();

		/**
		 * The meta object literal for the '<em><b>Button Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUTTON__BUTTON_TYPE = eINSTANCE.getButton_ButtonType();

		/**
		 * The meta object literal for the '<em><b>Active</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUTTON__ACTIVE = eINSTANCE.getButton_Active();

		/**
		 * The meta object literal for the '<em><b>Disabled</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUTTON__DISABLED = eINSTANCE.getButton_Disabled();

		/**
		 * The meta object literal for the '<em><b>Href</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUTTON__HREF = eINSTANCE.getButton_Href();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.impl.ButtonGroupImpl <em>Button Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.impl.ButtonGroupImpl
		 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.impl.ContentPackageImpl#getButtonGroup()
		 * @generated
		 */
		EClass BUTTON_GROUP = eINSTANCE.getButtonGroup();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUTTON_GROUP__SIZE = eINSTANCE.getButtonGroup_Size();

		/**
		 * The meta object literal for the '<em><b>Vertical</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUTTON_GROUP__VERTICAL = eINSTANCE.getButtonGroup_Vertical();

		/**
		 * The meta object literal for the '<em><b>Buttons</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUTTON_GROUP__BUTTONS = eINSTANCE.getButtonGroup_Buttons();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.impl.ButtonToolbarImpl <em>Button Toolbar</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.impl.ButtonToolbarImpl
		 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.impl.ContentPackageImpl#getButtonToolbar()
		 * @generated
		 */
		EClass BUTTON_TOOLBAR = eINSTANCE.getButtonToolbar();

		/**
		 * The meta object literal for the '<em><b>Groups</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUTTON_TOOLBAR__GROUPS = eINSTANCE.getButtonToolbar_Groups();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.impl.CloseButtonImpl <em>Close Button</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.impl.CloseButtonImpl
		 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.impl.ContentPackageImpl#getCloseButton()
		 * @generated
		 */
		EClass CLOSE_BUTTON = eINSTANCE.getCloseButton();

		/**
		 * The meta object literal for the '<em><b>Disabled</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLOSE_BUTTON__DISABLED = eINSTANCE.getCloseButton_Disabled();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.impl.CardImpl <em>Card</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.impl.CardImpl
		 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.impl.ContentPackageImpl#getCard()
		 * @generated
		 */
		EClass CARD = eINSTANCE.getCard();

		/**
		 * The meta object literal for the '<em><b>Bg</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARD__BG = eINSTANCE.getCard_Bg();

		/**
		 * The meta object literal for the '<em><b>Text Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARD__TEXT_COLOR = eINSTANCE.getCard_TextColor();

		/**
		 * The meta object literal for the '<em><b>Border</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARD__BORDER = eINSTANCE.getCard_Border();

		/**
		 * The meta object literal for the '<em><b>Header</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CARD__HEADER = eINSTANCE.getCard_Header();

		/**
		 * The meta object literal for the '<em><b>Image</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CARD__IMAGE = eINSTANCE.getCard_Image();

		/**
		 * The meta object literal for the '<em><b>Bodies</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CARD__BODIES = eINSTANCE.getCard_Bodies();

		/**
		 * The meta object literal for the '<em><b>Footer</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CARD__FOOTER = eINSTANCE.getCard_Footer();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.impl.CardHeaderImpl <em>Card Header</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.impl.CardHeaderImpl
		 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.impl.ContentPackageImpl#getCardHeader()
		 * @generated
		 */
		EClass CARD_HEADER = eINSTANCE.getCardHeader();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.impl.CardImageImpl <em>Card Image</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.impl.CardImageImpl
		 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.impl.ContentPackageImpl#getCardImage()
		 * @generated
		 */
		EClass CARD_IMAGE = eINSTANCE.getCardImage();

		/**
		 * The meta object literal for the '<em><b>Variant</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARD_IMAGE__VARIANT = eINSTANCE.getCardImage_Variant();

		/**
		 * The meta object literal for the '<em><b>Src</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARD_IMAGE__SRC = eINSTANCE.getCardImage_Src();

		/**
		 * The meta object literal for the '<em><b>Alt</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARD_IMAGE__ALT = eINSTANCE.getCardImage_Alt();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.impl.CardBodyImpl <em>Card Body</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.impl.CardBodyImpl
		 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.impl.ContentPackageImpl#getCardBody()
		 * @generated
		 */
		EClass CARD_BODY = eINSTANCE.getCardBody();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CARD_BODY__TITLE = eINSTANCE.getCardBody_Title();

		/**
		 * The meta object literal for the '<em><b>Subtitle</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CARD_BODY__SUBTITLE = eINSTANCE.getCardBody_Subtitle();

		/**
		 * The meta object literal for the '<em><b>Texts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CARD_BODY__TEXTS = eINSTANCE.getCardBody_Texts();

		/**
		 * The meta object literal for the '<em><b>Links</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CARD_BODY__LINKS = eINSTANCE.getCardBody_Links();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.impl.CardTitleImpl <em>Card Title</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.impl.CardTitleImpl
		 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.impl.ContentPackageImpl#getCardTitle()
		 * @generated
		 */
		EClass CARD_TITLE = eINSTANCE.getCardTitle();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.impl.CardSubtitleImpl <em>Card Subtitle</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.impl.CardSubtitleImpl
		 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.impl.ContentPackageImpl#getCardSubtitle()
		 * @generated
		 */
		EClass CARD_SUBTITLE = eINSTANCE.getCardSubtitle();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.impl.CardTextImpl <em>Card Text</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.impl.CardTextImpl
		 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.impl.ContentPackageImpl#getCardText()
		 * @generated
		 */
		EClass CARD_TEXT = eINSTANCE.getCardText();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.impl.CardLinkImpl <em>Card Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.impl.CardLinkImpl
		 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.impl.ContentPackageImpl#getCardLink()
		 * @generated
		 */
		EClass CARD_LINK = eINSTANCE.getCardLink();

		/**
		 * The meta object literal for the '<em><b>Href</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARD_LINK__HREF = eINSTANCE.getCardLink_Href();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.impl.CardFooterImpl <em>Card Footer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.impl.CardFooterImpl
		 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.impl.ContentPackageImpl#getCardFooter()
		 * @generated
		 */
		EClass CARD_FOOTER = eINSTANCE.getCardFooter();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.impl.CardGroupImpl <em>Card Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.impl.CardGroupImpl
		 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.impl.ContentPackageImpl#getCardGroup()
		 * @generated
		 */
		EClass CARD_GROUP = eINSTANCE.getCardGroup();

		/**
		 * The meta object literal for the '<em><b>Cards</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CARD_GROUP__CARDS = eINSTANCE.getCardGroup_Cards();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.impl.ListGroupImpl <em>List Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.impl.ListGroupImpl
		 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.impl.ContentPackageImpl#getListGroup()
		 * @generated
		 */
		EClass LIST_GROUP = eINSTANCE.getListGroup();

		/**
		 * The meta object literal for the '<em><b>Flush</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIST_GROUP__FLUSH = eINSTANCE.getListGroup_Flush();

		/**
		 * The meta object literal for the '<em><b>Numbered</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIST_GROUP__NUMBERED = eINSTANCE.getListGroup_Numbered();

		/**
		 * The meta object literal for the '<em><b>Horizontal</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIST_GROUP__HORIZONTAL = eINSTANCE.getListGroup_Horizontal();

		/**
		 * The meta object literal for the '<em><b>Horizontal From</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIST_GROUP__HORIZONTAL_FROM = eINSTANCE.getListGroup_HorizontalFrom();

		/**
		 * The meta object literal for the '<em><b>Items</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIST_GROUP__ITEMS = eINSTANCE.getListGroup_Items();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.impl.ListGroupItemImpl <em>List Group Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.impl.ListGroupItemImpl
		 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.impl.ContentPackageImpl#getListGroupItem()
		 * @generated
		 */
		EClass LIST_GROUP_ITEM = eINSTANCE.getListGroupItem();

		/**
		 * The meta object literal for the '<em><b>Variant</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIST_GROUP_ITEM__VARIANT = eINSTANCE.getListGroupItem_Variant();

		/**
		 * The meta object literal for the '<em><b>Action</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIST_GROUP_ITEM__ACTION = eINSTANCE.getListGroupItem_Action();

		/**
		 * The meta object literal for the '<em><b>Active</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIST_GROUP_ITEM__ACTIVE = eINSTANCE.getListGroupItem_Active();

		/**
		 * The meta object literal for the '<em><b>Disabled</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIST_GROUP_ITEM__DISABLED = eINSTANCE.getListGroupItem_Disabled();

		/**
		 * The meta object literal for the '<em><b>Href</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIST_GROUP_ITEM__HREF = eINSTANCE.getListGroupItem_Href();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.impl.TableImpl <em>Table</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.impl.TableImpl
		 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.impl.ContentPackageImpl#getTable()
		 * @generated
		 */
		EClass TABLE = eINSTANCE.getTable();

		/**
		 * The meta object literal for the '<em><b>Striped</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE__STRIPED = eINSTANCE.getTable_Striped();

		/**
		 * The meta object literal for the '<em><b>Bordered</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE__BORDERED = eINSTANCE.getTable_Bordered();

		/**
		 * The meta object literal for the '<em><b>Borderless</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE__BORDERLESS = eINSTANCE.getTable_Borderless();

		/**
		 * The meta object literal for the '<em><b>Hover</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE__HOVER = eINSTANCE.getTable_Hover();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE__SIZE = eINSTANCE.getTable_Size();

		/**
		 * The meta object literal for the '<em><b>Variant</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE__VARIANT = eINSTANCE.getTable_Variant();

		/**
		 * The meta object literal for the '<em><b>Responsive</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE__RESPONSIVE = eINSTANCE.getTable_Responsive();

		/**
		 * The meta object literal for the '<em><b>Responsive Below</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE__RESPONSIVE_BELOW = eINSTANCE.getTable_ResponsiveBelow();

		/**
		 * The meta object literal for the '<em><b>Head</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE__HEAD = eINSTANCE.getTable_Head();

		/**
		 * The meta object literal for the '<em><b>Bodies</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE__BODIES = eINSTANCE.getTable_Bodies();

		/**
		 * The meta object literal for the '<em><b>Foot</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE__FOOT = eINSTANCE.getTable_Foot();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.impl.ProgressBarImpl <em>Progress Bar</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.impl.ProgressBarImpl
		 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.impl.ContentPackageImpl#getProgressBar()
		 * @generated
		 */
		EClass PROGRESS_BAR = eINSTANCE.getProgressBar();

		/**
		 * The meta object literal for the '<em><b>Now</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROGRESS_BAR__NOW = eINSTANCE.getProgressBar_Now();

		/**
		 * The meta object literal for the '<em><b>Min</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROGRESS_BAR__MIN = eINSTANCE.getProgressBar_Min();

		/**
		 * The meta object literal for the '<em><b>Max</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROGRESS_BAR__MAX = eINSTANCE.getProgressBar_Max();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROGRESS_BAR__LABEL = eINSTANCE.getProgressBar_Label();

		/**
		 * The meta object literal for the '<em><b>Visually Hidden</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROGRESS_BAR__VISUALLY_HIDDEN = eINSTANCE.getProgressBar_VisuallyHidden();

		/**
		 * The meta object literal for the '<em><b>Variant</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROGRESS_BAR__VARIANT = eINSTANCE.getProgressBar_Variant();

		/**
		 * The meta object literal for the '<em><b>Striped</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROGRESS_BAR__STRIPED = eINSTANCE.getProgressBar_Striped();

		/**
		 * The meta object literal for the '<em><b>Animated</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROGRESS_BAR__ANIMATED = eINSTANCE.getProgressBar_Animated();

		/**
		 * The meta object literal for the '<em><b>Bars</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRESS_BAR__BARS = eINSTANCE.getProgressBar_Bars();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.impl.SpinnerImpl <em>Spinner</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.impl.SpinnerImpl
		 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.impl.ContentPackageImpl#getSpinner()
		 * @generated
		 */
		EClass SPINNER = eINSTANCE.getSpinner();

		/**
		 * The meta object literal for the '<em><b>Animation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPINNER__ANIMATION = eINSTANCE.getSpinner_Animation();

		/**
		 * The meta object literal for the '<em><b>Variant</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPINNER__VARIANT = eINSTANCE.getSpinner_Variant();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPINNER__SIZE = eINSTANCE.getSpinner_Size();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.impl.PlaceholderGroupImpl <em>Placeholder Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.impl.PlaceholderGroupImpl
		 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.impl.ContentPackageImpl#getPlaceholderGroup()
		 * @generated
		 */
		EClass PLACEHOLDER_GROUP = eINSTANCE.getPlaceholderGroup();

		/**
		 * The meta object literal for the '<em><b>Animation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLACEHOLDER_GROUP__ANIMATION = eINSTANCE.getPlaceholderGroup_Animation();

		/**
		 * The meta object literal for the '<em><b>Placeholders</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLACEHOLDER_GROUP__PLACEHOLDERS = eINSTANCE.getPlaceholderGroup_Placeholders();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.impl.PlaceholderImpl <em>Placeholder</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.impl.PlaceholderImpl
		 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.impl.ContentPackageImpl#getPlaceholder()
		 * @generated
		 */
		EClass PLACEHOLDER = eINSTANCE.getPlaceholder();

		/**
		 * The meta object literal for the '<em><b>Bg</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLACEHOLDER__BG = eINSTANCE.getPlaceholder_Bg();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLACEHOLDER__SIZE = eINSTANCE.getPlaceholder_Size();

		/**
		 * The meta object literal for the '<em><b>Sizes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLACEHOLDER__SIZES = eINSTANCE.getPlaceholder_Sizes();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.impl.PlaceholderButtonImpl <em>Placeholder Button</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.impl.PlaceholderButtonImpl
		 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.impl.ContentPackageImpl#getPlaceholderButton()
		 * @generated
		 */
		EClass PLACEHOLDER_BUTTON = eINSTANCE.getPlaceholderButton();

		/**
		 * The meta object literal for the '<em><b>Variant</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLACEHOLDER_BUTTON__VARIANT = eINSTANCE.getPlaceholderButton_Variant();

		/**
		 * The meta object literal for the '<em><b>Sizes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLACEHOLDER_BUTTON__SIZES = eINSTANCE.getPlaceholderButton_Sizes();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.impl.AccordionImpl <em>Accordion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.impl.AccordionImpl
		 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.impl.ContentPackageImpl#getAccordion()
		 * @generated
		 */
		EClass ACCORDION = eINSTANCE.getAccordion();

		/**
		 * The meta object literal for the '<em><b>Default Active Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCORDION__DEFAULT_ACTIVE_KEY = eINSTANCE.getAccordion_DefaultActiveKey();

		/**
		 * The meta object literal for the '<em><b>Flush</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCORDION__FLUSH = eINSTANCE.getAccordion_Flush();

		/**
		 * The meta object literal for the '<em><b>Always Open</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCORDION__ALWAYS_OPEN = eINSTANCE.getAccordion_AlwaysOpen();

		/**
		 * The meta object literal for the '<em><b>Items</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACCORDION__ITEMS = eINSTANCE.getAccordion_Items();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.impl.AccordionItemImpl <em>Accordion Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.impl.AccordionItemImpl
		 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.impl.ContentPackageImpl#getAccordionItem()
		 * @generated
		 */
		EClass ACCORDION_ITEM = eINSTANCE.getAccordionItem();

		/**
		 * The meta object literal for the '<em><b>Event Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCORDION_ITEM__EVENT_KEY = eINSTANCE.getAccordionItem_EventKey();

		/**
		 * The meta object literal for the '<em><b>Header</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACCORDION_ITEM__HEADER = eINSTANCE.getAccordionItem_Header();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACCORDION_ITEM__BODY = eINSTANCE.getAccordionItem_Body();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.impl.AccordionHeaderImpl <em>Accordion Header</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.impl.AccordionHeaderImpl
		 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.impl.ContentPackageImpl#getAccordionHeader()
		 * @generated
		 */
		EClass ACCORDION_HEADER = eINSTANCE.getAccordionHeader();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.impl.AccordionBodyImpl <em>Accordion Body</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.impl.AccordionBodyImpl
		 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.impl.ContentPackageImpl#getAccordionBody()
		 * @generated
		 */
		EClass ACCORDION_BODY = eINSTANCE.getAccordionBody();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.impl.CarouselImpl <em>Carousel</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.impl.CarouselImpl
		 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.impl.ContentPackageImpl#getCarousel()
		 * @generated
		 */
		EClass CAROUSEL = eINSTANCE.getCarousel();

		/**
		 * The meta object literal for the '<em><b>Controls</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAROUSEL__CONTROLS = eINSTANCE.getCarousel_Controls();

		/**
		 * The meta object literal for the '<em><b>Indicators</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAROUSEL__INDICATORS = eINSTANCE.getCarousel_Indicators();

		/**
		 * The meta object literal for the '<em><b>Fade</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAROUSEL__FADE = eINSTANCE.getCarousel_Fade();

		/**
		 * The meta object literal for the '<em><b>Interval</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAROUSEL__INTERVAL = eINSTANCE.getCarousel_Interval();

		/**
		 * The meta object literal for the '<em><b>Variant</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAROUSEL__VARIANT = eINSTANCE.getCarousel_Variant();

		/**
		 * The meta object literal for the '<em><b>Items</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAROUSEL__ITEMS = eINSTANCE.getCarousel_Items();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.impl.CarouselItemImpl <em>Carousel Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.impl.CarouselItemImpl
		 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.impl.ContentPackageImpl#getCarouselItem()
		 * @generated
		 */
		EClass CAROUSEL_ITEM = eINSTANCE.getCarouselItem();

		/**
		 * The meta object literal for the '<em><b>Interval</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAROUSEL_ITEM__INTERVAL = eINSTANCE.getCarouselItem_Interval();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAROUSEL_ITEM__CONTENT = eINSTANCE.getCarouselItem_Content();

		/**
		 * The meta object literal for the '<em><b>Caption</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAROUSEL_ITEM__CAPTION = eINSTANCE.getCarouselItem_Caption();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.impl.CarouselCaptionImpl <em>Carousel Caption</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.impl.CarouselCaptionImpl
		 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.impl.ContentPackageImpl#getCarouselCaption()
		 * @generated
		 */
		EClass CAROUSEL_CAPTION = eINSTANCE.getCarouselCaption();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAROUSEL_CAPTION__CONTENT = eINSTANCE.getCarouselCaption_Content();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.ButtonType <em>Button Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.ButtonType
		 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.impl.ContentPackageImpl#getButtonType()
		 * @generated
		 */
		EEnum BUTTON_TYPE = eINSTANCE.getButtonType();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.CardImageVariant <em>Card Image Variant</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.CardImageVariant
		 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.impl.ContentPackageImpl#getCardImageVariant()
		 * @generated
		 */
		EEnum CARD_IMAGE_VARIANT = eINSTANCE.getCardImageVariant();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.SpinnerAnimation <em>Spinner Animation</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.SpinnerAnimation
		 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.impl.ContentPackageImpl#getSpinnerAnimation()
		 * @generated
		 */
		EEnum SPINNER_ANIMATION = eINSTANCE.getSpinnerAnimation();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.PlaceholderAnimation <em>Placeholder Animation</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.PlaceholderAnimation
		 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.impl.ContentPackageImpl#getPlaceholderAnimation()
		 * @generated
		 */
		EEnum PLACEHOLDER_ANIMATION = eINSTANCE.getPlaceholderAnimation();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.PlaceholderSize <em>Placeholder Size</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.PlaceholderSize
		 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.impl.ContentPackageImpl#getPlaceholderSize()
		 * @generated
		 */
		EEnum PLACEHOLDER_SIZE = eINSTANCE.getPlaceholderSize();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.CarouselVariant <em>Carousel Variant</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.CarouselVariant
		 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.impl.ContentPackageImpl#getCarouselVariant()
		 * @generated
		 */
		EEnum CAROUSEL_VARIANT = eINSTANCE.getCarouselVariant();

	}

} //ContentPackage
