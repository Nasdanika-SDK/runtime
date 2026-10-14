/**
 */
package org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.nasdanika.sdk.runtime.models.html.bootstrap.BootstrapPackage;

import org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.ContentPackage;

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
 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.OverlaysFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel modelDirectory='/bootstrap/src-gen' featureDelegation='Dynamic' complianceLevel='25' suppressGenModelAnnotations='false' copyrightFields='false' operationReflection='true' importOrganizing='true' basePackage='org.nasdanika.sdk.runtime.models.html.bootstrap.components'"
 *        annotation="http://www.eclipse.org/emf/2011/Xcore Ecore='http://www.eclipse.org/emf/2002/Ecore' GenModel='http://www.eclipse.org/emf/2002/GenModel' Html='urn:org.nasdanika:html'"
 * @generated
 */
public interface OverlaysPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "overlays";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "https://runtime.sdk.nasdanika.org/models/html/bootstrap/components/overlays";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	OverlaysPackage eINSTANCE = org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.impl.OverlaysPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.impl.ToggleImpl <em>Toggle</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.impl.ToggleImpl
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.impl.OverlaysPackageImpl#getToggle()
	 * @generated
	 */
	int TOGGLE = 0;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOGGLE__MARKERS = ContentPackage.BUTTON__MARKERS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOGGLE__ID = ContentPackage.BUTTON__ID;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOGGLE__CLASSES = ContentPackage.BUTTON__CLASSES;

	/**
	 * The feature id for the '<em><b>Style</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOGGLE__STYLE = ContentPackage.BUTTON__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOGGLE__ATTRIBUTES = ContentPackage.BUTTON__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOGGLE__CONTENTS = ContentPackage.BUTTON__CONTENTS;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOGGLE__CONTENT = ContentPackage.BUTTON__CONTENT;

	/**
	 * The feature id for the '<em><b>Variant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOGGLE__VARIANT = ContentPackage.BUTTON__VARIANT;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOGGLE__SIZE = ContentPackage.BUTTON__SIZE;

	/**
	 * The feature id for the '<em><b>Button Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOGGLE__BUTTON_TYPE = ContentPackage.BUTTON__BUTTON_TYPE;

	/**
	 * The feature id for the '<em><b>Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOGGLE__ACTIVE = ContentPackage.BUTTON__ACTIVE;

	/**
	 * The feature id for the '<em><b>Disabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOGGLE__DISABLED = ContentPackage.BUTTON__DISABLED;

	/**
	 * The feature id for the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOGGLE__HREF = ContentPackage.BUTTON__HREF;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOGGLE__TARGET = ContentPackage.BUTTON_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Toggle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOGGLE_FEATURE_COUNT = ContentPackage.BUTTON_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Tag Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOGGLE___TAG_NAME = ContentPackage.BUTTON___TAG_NAME;

	/**
	 * The number of operations of the '<em>Toggle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOGGLE_OPERATION_COUNT = ContentPackage.BUTTON_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.impl.ModalImpl <em>Modal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.impl.ModalImpl
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.impl.OverlaysPackageImpl#getModal()
	 * @generated
	 */
	int MODAL = 1;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODAL__MARKERS = BootstrapPackage.BOOTSTRAP_ELEMENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODAL__ID = BootstrapPackage.BOOTSTRAP_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODAL__CLASSES = BootstrapPackage.BOOTSTRAP_ELEMENT__CLASSES;

	/**
	 * The feature id for the '<em><b>Style</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODAL__STYLE = BootstrapPackage.BOOTSTRAP_ELEMENT__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODAL__ATTRIBUTES = BootstrapPackage.BOOTSTRAP_ELEMENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODAL__CONTENTS = BootstrapPackage.BOOTSTRAP_ELEMENT__CONTENTS;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODAL__SIZE = BootstrapPackage.BOOTSTRAP_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Centered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODAL__CENTERED = BootstrapPackage.BOOTSTRAP_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Scrollable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODAL__SCROLLABLE = BootstrapPackage.BOOTSTRAP_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Fullscreen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODAL__FULLSCREEN = BootstrapPackage.BOOTSTRAP_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Fullscreen Below</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODAL__FULLSCREEN_BELOW = BootstrapPackage.BOOTSTRAP_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Static Backdrop</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODAL__STATIC_BACKDROP = BootstrapPackage.BOOTSTRAP_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Keyboard</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODAL__KEYBOARD = BootstrapPackage.BOOTSTRAP_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Header</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODAL__HEADER = BootstrapPackage.BOOTSTRAP_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODAL__BODY = BootstrapPackage.BOOTSTRAP_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Footer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODAL__FOOTER = BootstrapPackage.BOOTSTRAP_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Modal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODAL_FEATURE_COUNT = BootstrapPackage.BOOTSTRAP_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The operation id for the '<em>Tag Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODAL___TAG_NAME = BootstrapPackage.BOOTSTRAP_ELEMENT___TAG_NAME;

	/**
	 * The number of operations of the '<em>Modal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODAL_OPERATION_COUNT = BootstrapPackage.BOOTSTRAP_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.impl.ModalHeaderImpl <em>Modal Header</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.impl.ModalHeaderImpl
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.impl.OverlaysPackageImpl#getModalHeader()
	 * @generated
	 */
	int MODAL_HEADER = 2;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODAL_HEADER__MARKERS = BootstrapPackage.BOOTSTRAP_ELEMENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODAL_HEADER__ID = BootstrapPackage.BOOTSTRAP_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODAL_HEADER__CLASSES = BootstrapPackage.BOOTSTRAP_ELEMENT__CLASSES;

	/**
	 * The feature id for the '<em><b>Style</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODAL_HEADER__STYLE = BootstrapPackage.BOOTSTRAP_ELEMENT__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODAL_HEADER__ATTRIBUTES = BootstrapPackage.BOOTSTRAP_ELEMENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODAL_HEADER__CONTENTS = BootstrapPackage.BOOTSTRAP_ELEMENT__CONTENTS;

	/**
	 * The feature id for the '<em><b>Close Button</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODAL_HEADER__CLOSE_BUTTON = BootstrapPackage.BOOTSTRAP_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODAL_HEADER__TITLE = BootstrapPackage.BOOTSTRAP_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Modal Header</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODAL_HEADER_FEATURE_COUNT = BootstrapPackage.BOOTSTRAP_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Tag Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODAL_HEADER___TAG_NAME = BootstrapPackage.BOOTSTRAP_ELEMENT___TAG_NAME;

	/**
	 * The number of operations of the '<em>Modal Header</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODAL_HEADER_OPERATION_COUNT = BootstrapPackage.BOOTSTRAP_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.impl.ModalTitleImpl <em>Modal Title</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.impl.ModalTitleImpl
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.impl.OverlaysPackageImpl#getModalTitle()
	 * @generated
	 */
	int MODAL_TITLE = 3;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODAL_TITLE__MARKERS = BootstrapPackage.BOOTSTRAP_ELEMENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODAL_TITLE__ID = BootstrapPackage.BOOTSTRAP_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODAL_TITLE__CLASSES = BootstrapPackage.BOOTSTRAP_ELEMENT__CLASSES;

	/**
	 * The feature id for the '<em><b>Style</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODAL_TITLE__STYLE = BootstrapPackage.BOOTSTRAP_ELEMENT__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODAL_TITLE__ATTRIBUTES = BootstrapPackage.BOOTSTRAP_ELEMENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODAL_TITLE__CONTENTS = BootstrapPackage.BOOTSTRAP_ELEMENT__CONTENTS;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODAL_TITLE__CONTENT = BootstrapPackage.BOOTSTRAP_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Modal Title</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODAL_TITLE_FEATURE_COUNT = BootstrapPackage.BOOTSTRAP_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Tag Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODAL_TITLE___TAG_NAME = BootstrapPackage.BOOTSTRAP_ELEMENT___TAG_NAME;

	/**
	 * The number of operations of the '<em>Modal Title</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODAL_TITLE_OPERATION_COUNT = BootstrapPackage.BOOTSTRAP_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.impl.ModalBodyImpl <em>Modal Body</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.impl.ModalBodyImpl
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.impl.OverlaysPackageImpl#getModalBody()
	 * @generated
	 */
	int MODAL_BODY = 4;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODAL_BODY__MARKERS = BootstrapPackage.BOOTSTRAP_ELEMENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODAL_BODY__ID = BootstrapPackage.BOOTSTRAP_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODAL_BODY__CLASSES = BootstrapPackage.BOOTSTRAP_ELEMENT__CLASSES;

	/**
	 * The feature id for the '<em><b>Style</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODAL_BODY__STYLE = BootstrapPackage.BOOTSTRAP_ELEMENT__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODAL_BODY__ATTRIBUTES = BootstrapPackage.BOOTSTRAP_ELEMENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODAL_BODY__CONTENTS = BootstrapPackage.BOOTSTRAP_ELEMENT__CONTENTS;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODAL_BODY__CONTENT = BootstrapPackage.BOOTSTRAP_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Modal Body</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODAL_BODY_FEATURE_COUNT = BootstrapPackage.BOOTSTRAP_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Tag Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODAL_BODY___TAG_NAME = BootstrapPackage.BOOTSTRAP_ELEMENT___TAG_NAME;

	/**
	 * The number of operations of the '<em>Modal Body</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODAL_BODY_OPERATION_COUNT = BootstrapPackage.BOOTSTRAP_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.impl.ModalFooterImpl <em>Modal Footer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.impl.ModalFooterImpl
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.impl.OverlaysPackageImpl#getModalFooter()
	 * @generated
	 */
	int MODAL_FOOTER = 5;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODAL_FOOTER__MARKERS = BootstrapPackage.BOOTSTRAP_ELEMENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODAL_FOOTER__ID = BootstrapPackage.BOOTSTRAP_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODAL_FOOTER__CLASSES = BootstrapPackage.BOOTSTRAP_ELEMENT__CLASSES;

	/**
	 * The feature id for the '<em><b>Style</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODAL_FOOTER__STYLE = BootstrapPackage.BOOTSTRAP_ELEMENT__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODAL_FOOTER__ATTRIBUTES = BootstrapPackage.BOOTSTRAP_ELEMENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODAL_FOOTER__CONTENTS = BootstrapPackage.BOOTSTRAP_ELEMENT__CONTENTS;

	/**
	 * The feature id for the '<em><b>Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODAL_FOOTER__CONTENT = BootstrapPackage.BOOTSTRAP_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Modal Footer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODAL_FOOTER_FEATURE_COUNT = BootstrapPackage.BOOTSTRAP_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Tag Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODAL_FOOTER___TAG_NAME = BootstrapPackage.BOOTSTRAP_ELEMENT___TAG_NAME;

	/**
	 * The number of operations of the '<em>Modal Footer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODAL_FOOTER_OPERATION_COUNT = BootstrapPackage.BOOTSTRAP_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.impl.OffcanvasImpl <em>Offcanvas</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.impl.OffcanvasImpl
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.impl.OverlaysPackageImpl#getOffcanvas()
	 * @generated
	 */
	int OFFCANVAS = 6;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFCANVAS__MARKERS = BootstrapPackage.BOOTSTRAP_ELEMENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFCANVAS__ID = BootstrapPackage.BOOTSTRAP_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFCANVAS__CLASSES = BootstrapPackage.BOOTSTRAP_ELEMENT__CLASSES;

	/**
	 * The feature id for the '<em><b>Style</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFCANVAS__STYLE = BootstrapPackage.BOOTSTRAP_ELEMENT__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFCANVAS__ATTRIBUTES = BootstrapPackage.BOOTSTRAP_ELEMENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFCANVAS__CONTENTS = BootstrapPackage.BOOTSTRAP_ELEMENT__CONTENTS;

	/**
	 * The feature id for the '<em><b>Placement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFCANVAS__PLACEMENT = BootstrapPackage.BOOTSTRAP_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Backdrop</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFCANVAS__BACKDROP = BootstrapPackage.BOOTSTRAP_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Scroll</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFCANVAS__SCROLL = BootstrapPackage.BOOTSTRAP_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Header</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFCANVAS__HEADER = BootstrapPackage.BOOTSTRAP_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFCANVAS__BODY = BootstrapPackage.BOOTSTRAP_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Offcanvas</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFCANVAS_FEATURE_COUNT = BootstrapPackage.BOOTSTRAP_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Tag Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFCANVAS___TAG_NAME = BootstrapPackage.BOOTSTRAP_ELEMENT___TAG_NAME;

	/**
	 * The number of operations of the '<em>Offcanvas</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFCANVAS_OPERATION_COUNT = BootstrapPackage.BOOTSTRAP_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.impl.OffcanvasHeaderImpl <em>Offcanvas Header</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.impl.OffcanvasHeaderImpl
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.impl.OverlaysPackageImpl#getOffcanvasHeader()
	 * @generated
	 */
	int OFFCANVAS_HEADER = 7;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFCANVAS_HEADER__MARKERS = BootstrapPackage.BOOTSTRAP_ELEMENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFCANVAS_HEADER__ID = BootstrapPackage.BOOTSTRAP_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFCANVAS_HEADER__CLASSES = BootstrapPackage.BOOTSTRAP_ELEMENT__CLASSES;

	/**
	 * The feature id for the '<em><b>Style</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFCANVAS_HEADER__STYLE = BootstrapPackage.BOOTSTRAP_ELEMENT__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFCANVAS_HEADER__ATTRIBUTES = BootstrapPackage.BOOTSTRAP_ELEMENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFCANVAS_HEADER__CONTENTS = BootstrapPackage.BOOTSTRAP_ELEMENT__CONTENTS;

	/**
	 * The feature id for the '<em><b>Close Button</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFCANVAS_HEADER__CLOSE_BUTTON = BootstrapPackage.BOOTSTRAP_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFCANVAS_HEADER__TITLE = BootstrapPackage.BOOTSTRAP_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Offcanvas Header</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFCANVAS_HEADER_FEATURE_COUNT = BootstrapPackage.BOOTSTRAP_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Tag Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFCANVAS_HEADER___TAG_NAME = BootstrapPackage.BOOTSTRAP_ELEMENT___TAG_NAME;

	/**
	 * The number of operations of the '<em>Offcanvas Header</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFCANVAS_HEADER_OPERATION_COUNT = BootstrapPackage.BOOTSTRAP_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.impl.OffcanvasTitleImpl <em>Offcanvas Title</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.impl.OffcanvasTitleImpl
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.impl.OverlaysPackageImpl#getOffcanvasTitle()
	 * @generated
	 */
	int OFFCANVAS_TITLE = 8;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFCANVAS_TITLE__MARKERS = BootstrapPackage.BOOTSTRAP_ELEMENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFCANVAS_TITLE__ID = BootstrapPackage.BOOTSTRAP_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFCANVAS_TITLE__CLASSES = BootstrapPackage.BOOTSTRAP_ELEMENT__CLASSES;

	/**
	 * The feature id for the '<em><b>Style</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFCANVAS_TITLE__STYLE = BootstrapPackage.BOOTSTRAP_ELEMENT__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFCANVAS_TITLE__ATTRIBUTES = BootstrapPackage.BOOTSTRAP_ELEMENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFCANVAS_TITLE__CONTENTS = BootstrapPackage.BOOTSTRAP_ELEMENT__CONTENTS;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFCANVAS_TITLE__CONTENT = BootstrapPackage.BOOTSTRAP_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Offcanvas Title</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFCANVAS_TITLE_FEATURE_COUNT = BootstrapPackage.BOOTSTRAP_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Tag Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFCANVAS_TITLE___TAG_NAME = BootstrapPackage.BOOTSTRAP_ELEMENT___TAG_NAME;

	/**
	 * The number of operations of the '<em>Offcanvas Title</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFCANVAS_TITLE_OPERATION_COUNT = BootstrapPackage.BOOTSTRAP_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.impl.OffcanvasBodyImpl <em>Offcanvas Body</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.impl.OffcanvasBodyImpl
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.impl.OverlaysPackageImpl#getOffcanvasBody()
	 * @generated
	 */
	int OFFCANVAS_BODY = 9;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFCANVAS_BODY__MARKERS = BootstrapPackage.BOOTSTRAP_ELEMENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFCANVAS_BODY__ID = BootstrapPackage.BOOTSTRAP_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFCANVAS_BODY__CLASSES = BootstrapPackage.BOOTSTRAP_ELEMENT__CLASSES;

	/**
	 * The feature id for the '<em><b>Style</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFCANVAS_BODY__STYLE = BootstrapPackage.BOOTSTRAP_ELEMENT__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFCANVAS_BODY__ATTRIBUTES = BootstrapPackage.BOOTSTRAP_ELEMENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFCANVAS_BODY__CONTENTS = BootstrapPackage.BOOTSTRAP_ELEMENT__CONTENTS;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFCANVAS_BODY__CONTENT = BootstrapPackage.BOOTSTRAP_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Offcanvas Body</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFCANVAS_BODY_FEATURE_COUNT = BootstrapPackage.BOOTSTRAP_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Tag Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFCANVAS_BODY___TAG_NAME = BootstrapPackage.BOOTSTRAP_ELEMENT___TAG_NAME;

	/**
	 * The number of operations of the '<em>Offcanvas Body</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFCANVAS_BODY_OPERATION_COUNT = BootstrapPackage.BOOTSTRAP_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.impl.ToastImpl <em>Toast</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.impl.ToastImpl
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.impl.OverlaysPackageImpl#getToast()
	 * @generated
	 */
	int TOAST = 10;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOAST__MARKERS = BootstrapPackage.BOOTSTRAP_ELEMENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOAST__ID = BootstrapPackage.BOOTSTRAP_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOAST__CLASSES = BootstrapPackage.BOOTSTRAP_ELEMENT__CLASSES;

	/**
	 * The feature id for the '<em><b>Style</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOAST__STYLE = BootstrapPackage.BOOTSTRAP_ELEMENT__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOAST__ATTRIBUTES = BootstrapPackage.BOOTSTRAP_ELEMENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOAST__CONTENTS = BootstrapPackage.BOOTSTRAP_ELEMENT__CONTENTS;

	/**
	 * The feature id for the '<em><b>Show</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOAST__SHOW = BootstrapPackage.BOOTSTRAP_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Bg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOAST__BG = BootstrapPackage.BOOTSTRAP_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Autohide</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOAST__AUTOHIDE = BootstrapPackage.BOOTSTRAP_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Delay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOAST__DELAY = BootstrapPackage.BOOTSTRAP_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Header</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOAST__HEADER = BootstrapPackage.BOOTSTRAP_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOAST__BODY = BootstrapPackage.BOOTSTRAP_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Toast</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOAST_FEATURE_COUNT = BootstrapPackage.BOOTSTRAP_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The operation id for the '<em>Tag Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOAST___TAG_NAME = BootstrapPackage.BOOTSTRAP_ELEMENT___TAG_NAME;

	/**
	 * The number of operations of the '<em>Toast</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOAST_OPERATION_COUNT = BootstrapPackage.BOOTSTRAP_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.impl.ToastHeaderImpl <em>Toast Header</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.impl.ToastHeaderImpl
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.impl.OverlaysPackageImpl#getToastHeader()
	 * @generated
	 */
	int TOAST_HEADER = 11;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOAST_HEADER__MARKERS = BootstrapPackage.BOOTSTRAP_ELEMENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOAST_HEADER__ID = BootstrapPackage.BOOTSTRAP_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOAST_HEADER__CLASSES = BootstrapPackage.BOOTSTRAP_ELEMENT__CLASSES;

	/**
	 * The feature id for the '<em><b>Style</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOAST_HEADER__STYLE = BootstrapPackage.BOOTSTRAP_ELEMENT__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOAST_HEADER__ATTRIBUTES = BootstrapPackage.BOOTSTRAP_ELEMENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOAST_HEADER__CONTENTS = BootstrapPackage.BOOTSTRAP_ELEMENT__CONTENTS;

	/**
	 * The feature id for the '<em><b>Close Button</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOAST_HEADER__CLOSE_BUTTON = BootstrapPackage.BOOTSTRAP_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOAST_HEADER__CONTENT = BootstrapPackage.BOOTSTRAP_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Toast Header</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOAST_HEADER_FEATURE_COUNT = BootstrapPackage.BOOTSTRAP_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Tag Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOAST_HEADER___TAG_NAME = BootstrapPackage.BOOTSTRAP_ELEMENT___TAG_NAME;

	/**
	 * The number of operations of the '<em>Toast Header</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOAST_HEADER_OPERATION_COUNT = BootstrapPackage.BOOTSTRAP_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.impl.ToastBodyImpl <em>Toast Body</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.impl.ToastBodyImpl
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.impl.OverlaysPackageImpl#getToastBody()
	 * @generated
	 */
	int TOAST_BODY = 12;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOAST_BODY__MARKERS = BootstrapPackage.BOOTSTRAP_ELEMENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOAST_BODY__ID = BootstrapPackage.BOOTSTRAP_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOAST_BODY__CLASSES = BootstrapPackage.BOOTSTRAP_ELEMENT__CLASSES;

	/**
	 * The feature id for the '<em><b>Style</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOAST_BODY__STYLE = BootstrapPackage.BOOTSTRAP_ELEMENT__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOAST_BODY__ATTRIBUTES = BootstrapPackage.BOOTSTRAP_ELEMENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOAST_BODY__CONTENTS = BootstrapPackage.BOOTSTRAP_ELEMENT__CONTENTS;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOAST_BODY__CONTENT = BootstrapPackage.BOOTSTRAP_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Toast Body</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOAST_BODY_FEATURE_COUNT = BootstrapPackage.BOOTSTRAP_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Tag Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOAST_BODY___TAG_NAME = BootstrapPackage.BOOTSTRAP_ELEMENT___TAG_NAME;

	/**
	 * The number of operations of the '<em>Toast Body</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOAST_BODY_OPERATION_COUNT = BootstrapPackage.BOOTSTRAP_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.impl.ToastContainerImpl <em>Toast Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.impl.ToastContainerImpl
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.impl.OverlaysPackageImpl#getToastContainer()
	 * @generated
	 */
	int TOAST_CONTAINER = 13;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOAST_CONTAINER__MARKERS = BootstrapPackage.BOOTSTRAP_ELEMENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOAST_CONTAINER__ID = BootstrapPackage.BOOTSTRAP_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOAST_CONTAINER__CLASSES = BootstrapPackage.BOOTSTRAP_ELEMENT__CLASSES;

	/**
	 * The feature id for the '<em><b>Style</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOAST_CONTAINER__STYLE = BootstrapPackage.BOOTSTRAP_ELEMENT__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOAST_CONTAINER__ATTRIBUTES = BootstrapPackage.BOOTSTRAP_ELEMENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOAST_CONTAINER__CONTENTS = BootstrapPackage.BOOTSTRAP_ELEMENT__CONTENTS;

	/**
	 * The feature id for the '<em><b>Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOAST_CONTAINER__POSITION = BootstrapPackage.BOOTSTRAP_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Containment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOAST_CONTAINER__CONTAINMENT = BootstrapPackage.BOOTSTRAP_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Toasts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOAST_CONTAINER__TOASTS = BootstrapPackage.BOOTSTRAP_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Toast Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOAST_CONTAINER_FEATURE_COUNT = BootstrapPackage.BOOTSTRAP_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Tag Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOAST_CONTAINER___TAG_NAME = BootstrapPackage.BOOTSTRAP_ELEMENT___TAG_NAME;

	/**
	 * The number of operations of the '<em>Toast Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOAST_CONTAINER_OPERATION_COUNT = BootstrapPackage.BOOTSTRAP_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.impl.OverlayImpl <em>Overlay</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.impl.OverlayImpl
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.impl.OverlaysPackageImpl#getOverlay()
	 * @generated
	 */
	int OVERLAY = 14;

	/**
	 * The feature id for the '<em><b>Html</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERLAY__HTML = 0;

	/**
	 * The number of structural features of the '<em>Overlay</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERLAY_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Overlay</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERLAY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.impl.TooltipImpl <em>Tooltip</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.impl.TooltipImpl
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.impl.OverlaysPackageImpl#getTooltip()
	 * @generated
	 */
	int TOOLTIP = 15;

	/**
	 * The feature id for the '<em><b>Html</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOLTIP__HTML = OVERLAY__HTML;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOLTIP__TITLE = OVERLAY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Tooltip</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOLTIP_FEATURE_COUNT = OVERLAY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Tooltip</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOLTIP_OPERATION_COUNT = OVERLAY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.impl.PopoverImpl <em>Popover</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.impl.PopoverImpl
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.impl.OverlaysPackageImpl#getPopover()
	 * @generated
	 */
	int POPOVER = 16;

	/**
	 * The feature id for the '<em><b>Html</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POPOVER__HTML = OVERLAY__HTML;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POPOVER__TITLE = OVERLAY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POPOVER__CONTENT = OVERLAY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Popover</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POPOVER_FEATURE_COUNT = OVERLAY_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Popover</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POPOVER_OPERATION_COUNT = OVERLAY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.impl.OverlayTriggerImpl <em>Overlay Trigger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.impl.OverlayTriggerImpl
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.impl.OverlaysPackageImpl#getOverlayTrigger()
	 * @generated
	 */
	int OVERLAY_TRIGGER = 17;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERLAY_TRIGGER__MARKERS = BootstrapPackage.BOOTSTRAP_ELEMENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERLAY_TRIGGER__ID = BootstrapPackage.BOOTSTRAP_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERLAY_TRIGGER__CLASSES = BootstrapPackage.BOOTSTRAP_ELEMENT__CLASSES;

	/**
	 * The feature id for the '<em><b>Style</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERLAY_TRIGGER__STYLE = BootstrapPackage.BOOTSTRAP_ELEMENT__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERLAY_TRIGGER__ATTRIBUTES = BootstrapPackage.BOOTSTRAP_ELEMENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERLAY_TRIGGER__CONTENTS = BootstrapPackage.BOOTSTRAP_ELEMENT__CONTENTS;

	/**
	 * The feature id for the '<em><b>Placement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERLAY_TRIGGER__PLACEMENT = BootstrapPackage.BOOTSTRAP_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Trigger</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERLAY_TRIGGER__TRIGGER = BootstrapPackage.BOOTSTRAP_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Overlay</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERLAY_TRIGGER__OVERLAY = BootstrapPackage.BOOTSTRAP_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERLAY_TRIGGER__TARGET = BootstrapPackage.BOOTSTRAP_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Overlay Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERLAY_TRIGGER_FEATURE_COUNT = BootstrapPackage.BOOTSTRAP_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Tag Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERLAY_TRIGGER___TAG_NAME = BootstrapPackage.BOOTSTRAP_ELEMENT___TAG_NAME;

	/**
	 * The number of operations of the '<em>Overlay Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERLAY_TRIGGER_OPERATION_COUNT = BootstrapPackage.BOOTSTRAP_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.ModalSize <em>Modal Size</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.ModalSize
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.impl.OverlaysPackageImpl#getModalSize()
	 * @generated
	 */
	int MODAL_SIZE = 18;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.Fullscreen <em>Fullscreen</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.Fullscreen
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.impl.OverlaysPackageImpl#getFullscreen()
	 * @generated
	 */
	int FULLSCREEN = 19;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.OffcanvasPlacement <em>Offcanvas Placement</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.OffcanvasPlacement
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.impl.OverlaysPackageImpl#getOffcanvasPlacement()
	 * @generated
	 */
	int OFFCANVAS_PLACEMENT = 20;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.ToastPosition <em>Toast Position</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.ToastPosition
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.impl.OverlaysPackageImpl#getToastPosition()
	 * @generated
	 */
	int TOAST_POSITION = 21;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.ToastContainment <em>Toast Containment</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.ToastContainment
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.impl.OverlaysPackageImpl#getToastContainment()
	 * @generated
	 */
	int TOAST_CONTAINMENT = 22;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.Placement <em>Placement</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.Placement
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.impl.OverlaysPackageImpl#getPlacement()
	 * @generated
	 */
	int PLACEMENT = 23;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.Trigger <em>Trigger</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.Trigger
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.impl.OverlaysPackageImpl#getTrigger()
	 * @generated
	 */
	int TRIGGER = 24;


	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.Toggle <em>Toggle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Toggle</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.Toggle
	 * @generated
	 */
	EClass getToggle();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.Toggle#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.Toggle#getTarget()
	 * @see #getToggle()
	 * @generated
	 */
	EReference getToggle_Target();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.Modal <em>Modal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Modal</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.Modal
	 * @generated
	 */
	EClass getModal();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.Modal#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.Modal#getSize()
	 * @see #getModal()
	 * @generated
	 */
	EAttribute getModal_Size();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.Modal#isCentered <em>Centered</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Centered</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.Modal#isCentered()
	 * @see #getModal()
	 * @generated
	 */
	EAttribute getModal_Centered();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.Modal#isScrollable <em>Scrollable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scrollable</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.Modal#isScrollable()
	 * @see #getModal()
	 * @generated
	 */
	EAttribute getModal_Scrollable();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.Modal#isFullscreen <em>Fullscreen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fullscreen</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.Modal#isFullscreen()
	 * @see #getModal()
	 * @generated
	 */
	EAttribute getModal_Fullscreen();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.Modal#getFullscreenBelow <em>Fullscreen Below</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fullscreen Below</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.Modal#getFullscreenBelow()
	 * @see #getModal()
	 * @generated
	 */
	EAttribute getModal_FullscreenBelow();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.Modal#isStaticBackdrop <em>Static Backdrop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Static Backdrop</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.Modal#isStaticBackdrop()
	 * @see #getModal()
	 * @generated
	 */
	EAttribute getModal_StaticBackdrop();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.Modal#isKeyboard <em>Keyboard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Keyboard</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.Modal#isKeyboard()
	 * @see #getModal()
	 * @generated
	 */
	EAttribute getModal_Keyboard();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.Modal#getHeader <em>Header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Header</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.Modal#getHeader()
	 * @see #getModal()
	 * @generated
	 */
	EReference getModal_Header();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.Modal#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Body</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.Modal#getBody()
	 * @see #getModal()
	 * @generated
	 */
	EReference getModal_Body();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.Modal#getFooter <em>Footer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Footer</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.Modal#getFooter()
	 * @see #getModal()
	 * @generated
	 */
	EReference getModal_Footer();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.ModalHeader <em>Modal Header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Modal Header</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.ModalHeader
	 * @generated
	 */
	EClass getModalHeader();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.ModalHeader#isCloseButton <em>Close Button</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Close Button</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.ModalHeader#isCloseButton()
	 * @see #getModalHeader()
	 * @generated
	 */
	EAttribute getModalHeader_CloseButton();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.ModalHeader#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Title</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.ModalHeader#getTitle()
	 * @see #getModalHeader()
	 * @generated
	 */
	EReference getModalHeader_Title();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.ModalTitle <em>Modal Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Modal Title</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.ModalTitle
	 * @generated
	 */
	EClass getModalTitle();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.ModalBody <em>Modal Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Modal Body</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.ModalBody
	 * @generated
	 */
	EClass getModalBody();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.ModalFooter <em>Modal Footer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Modal Footer</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.ModalFooter
	 * @generated
	 */
	EClass getModalFooter();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.ModalFooter#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Content</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.ModalFooter#getContent()
	 * @see #getModalFooter()
	 * @generated
	 */
	EReference getModalFooter_Content();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.Offcanvas <em>Offcanvas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Offcanvas</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.Offcanvas
	 * @generated
	 */
	EClass getOffcanvas();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.Offcanvas#getPlacement <em>Placement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Placement</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.Offcanvas#getPlacement()
	 * @see #getOffcanvas()
	 * @generated
	 */
	EAttribute getOffcanvas_Placement();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.Offcanvas#isBackdrop <em>Backdrop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Backdrop</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.Offcanvas#isBackdrop()
	 * @see #getOffcanvas()
	 * @generated
	 */
	EAttribute getOffcanvas_Backdrop();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.Offcanvas#isScroll <em>Scroll</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scroll</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.Offcanvas#isScroll()
	 * @see #getOffcanvas()
	 * @generated
	 */
	EAttribute getOffcanvas_Scroll();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.Offcanvas#getHeader <em>Header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Header</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.Offcanvas#getHeader()
	 * @see #getOffcanvas()
	 * @generated
	 */
	EReference getOffcanvas_Header();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.Offcanvas#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Body</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.Offcanvas#getBody()
	 * @see #getOffcanvas()
	 * @generated
	 */
	EReference getOffcanvas_Body();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.OffcanvasHeader <em>Offcanvas Header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Offcanvas Header</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.OffcanvasHeader
	 * @generated
	 */
	EClass getOffcanvasHeader();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.OffcanvasHeader#isCloseButton <em>Close Button</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Close Button</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.OffcanvasHeader#isCloseButton()
	 * @see #getOffcanvasHeader()
	 * @generated
	 */
	EAttribute getOffcanvasHeader_CloseButton();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.OffcanvasHeader#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Title</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.OffcanvasHeader#getTitle()
	 * @see #getOffcanvasHeader()
	 * @generated
	 */
	EReference getOffcanvasHeader_Title();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.OffcanvasTitle <em>Offcanvas Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Offcanvas Title</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.OffcanvasTitle
	 * @generated
	 */
	EClass getOffcanvasTitle();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.OffcanvasBody <em>Offcanvas Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Offcanvas Body</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.OffcanvasBody
	 * @generated
	 */
	EClass getOffcanvasBody();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.Toast <em>Toast</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Toast</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.Toast
	 * @generated
	 */
	EClass getToast();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.Toast#isShow <em>Show</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Show</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.Toast#isShow()
	 * @see #getToast()
	 * @generated
	 */
	EAttribute getToast_Show();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.Toast#getBg <em>Bg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bg</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.Toast#getBg()
	 * @see #getToast()
	 * @generated
	 */
	EAttribute getToast_Bg();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.Toast#isAutohide <em>Autohide</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Autohide</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.Toast#isAutohide()
	 * @see #getToast()
	 * @generated
	 */
	EAttribute getToast_Autohide();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.Toast#getDelay <em>Delay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Delay</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.Toast#getDelay()
	 * @see #getToast()
	 * @generated
	 */
	EAttribute getToast_Delay();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.Toast#getHeader <em>Header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Header</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.Toast#getHeader()
	 * @see #getToast()
	 * @generated
	 */
	EReference getToast_Header();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.Toast#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Body</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.Toast#getBody()
	 * @see #getToast()
	 * @generated
	 */
	EReference getToast_Body();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.ToastHeader <em>Toast Header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Toast Header</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.ToastHeader
	 * @generated
	 */
	EClass getToastHeader();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.ToastHeader#isCloseButton <em>Close Button</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Close Button</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.ToastHeader#isCloseButton()
	 * @see #getToastHeader()
	 * @generated
	 */
	EAttribute getToastHeader_CloseButton();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.ToastHeader#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Content</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.ToastHeader#getContent()
	 * @see #getToastHeader()
	 * @generated
	 */
	EReference getToastHeader_Content();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.ToastBody <em>Toast Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Toast Body</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.ToastBody
	 * @generated
	 */
	EClass getToastBody();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.ToastContainer <em>Toast Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Toast Container</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.ToastContainer
	 * @generated
	 */
	EClass getToastContainer();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.ToastContainer#getPosition <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Position</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.ToastContainer#getPosition()
	 * @see #getToastContainer()
	 * @generated
	 */
	EAttribute getToastContainer_Position();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.ToastContainer#getContainment <em>Containment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Containment</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.ToastContainer#getContainment()
	 * @see #getToastContainer()
	 * @generated
	 */
	EAttribute getToastContainer_Containment();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.ToastContainer#getToasts <em>Toasts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Toasts</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.ToastContainer#getToasts()
	 * @see #getToastContainer()
	 * @generated
	 */
	EReference getToastContainer_Toasts();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.Overlay <em>Overlay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Overlay</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.Overlay
	 * @generated
	 */
	EClass getOverlay();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.Overlay#isHtml <em>Html</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Html</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.Overlay#isHtml()
	 * @see #getOverlay()
	 * @generated
	 */
	EAttribute getOverlay_Html();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.Tooltip <em>Tooltip</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tooltip</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.Tooltip
	 * @generated
	 */
	EClass getTooltip();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.Tooltip#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.Tooltip#getTitle()
	 * @see #getTooltip()
	 * @generated
	 */
	EAttribute getTooltip_Title();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.Popover <em>Popover</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Popover</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.Popover
	 * @generated
	 */
	EClass getPopover();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.Popover#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.Popover#getTitle()
	 * @see #getPopover()
	 * @generated
	 */
	EAttribute getPopover_Title();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.Popover#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.Popover#getContent()
	 * @see #getPopover()
	 * @generated
	 */
	EAttribute getPopover_Content();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.OverlayTrigger <em>Overlay Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Overlay Trigger</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.OverlayTrigger
	 * @generated
	 */
	EClass getOverlayTrigger();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.OverlayTrigger#getPlacement <em>Placement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Placement</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.OverlayTrigger#getPlacement()
	 * @see #getOverlayTrigger()
	 * @generated
	 */
	EAttribute getOverlayTrigger_Placement();

	/**
	 * Returns the meta object for the attribute list '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.OverlayTrigger#getTrigger <em>Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Trigger</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.OverlayTrigger#getTrigger()
	 * @see #getOverlayTrigger()
	 * @generated
	 */
	EAttribute getOverlayTrigger_Trigger();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.OverlayTrigger#getOverlay <em>Overlay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Overlay</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.OverlayTrigger#getOverlay()
	 * @see #getOverlayTrigger()
	 * @generated
	 */
	EReference getOverlayTrigger_Overlay();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.OverlayTrigger#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Target</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.OverlayTrigger#getTarget()
	 * @see #getOverlayTrigger()
	 * @generated
	 */
	EReference getOverlayTrigger_Target();

	/**
	 * Returns the meta object for enum '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.ModalSize <em>Modal Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Modal Size</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.ModalSize
	 * @generated
	 */
	EEnum getModalSize();

	/**
	 * Returns the meta object for enum '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.Fullscreen <em>Fullscreen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Fullscreen</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.Fullscreen
	 * @generated
	 */
	EEnum getFullscreen();

	/**
	 * Returns the meta object for enum '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.OffcanvasPlacement <em>Offcanvas Placement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Offcanvas Placement</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.OffcanvasPlacement
	 * @generated
	 */
	EEnum getOffcanvasPlacement();

	/**
	 * Returns the meta object for enum '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.ToastPosition <em>Toast Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Toast Position</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.ToastPosition
	 * @generated
	 */
	EEnum getToastPosition();

	/**
	 * Returns the meta object for enum '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.ToastContainment <em>Toast Containment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Toast Containment</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.ToastContainment
	 * @generated
	 */
	EEnum getToastContainment();

	/**
	 * Returns the meta object for enum '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.Placement <em>Placement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Placement</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.Placement
	 * @generated
	 */
	EEnum getPlacement();

	/**
	 * Returns the meta object for enum '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.Trigger <em>Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Trigger</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.Trigger
	 * @generated
	 */
	EEnum getTrigger();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	OverlaysFactory getOverlaysFactory();

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
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.impl.ToggleImpl <em>Toggle</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.impl.ToggleImpl
		 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.impl.OverlaysPackageImpl#getToggle()
		 * @generated
		 */
		EClass TOGGLE = eINSTANCE.getToggle();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOGGLE__TARGET = eINSTANCE.getToggle_Target();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.impl.ModalImpl <em>Modal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.impl.ModalImpl
		 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.impl.OverlaysPackageImpl#getModal()
		 * @generated
		 */
		EClass MODAL = eINSTANCE.getModal();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODAL__SIZE = eINSTANCE.getModal_Size();

		/**
		 * The meta object literal for the '<em><b>Centered</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODAL__CENTERED = eINSTANCE.getModal_Centered();

		/**
		 * The meta object literal for the '<em><b>Scrollable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODAL__SCROLLABLE = eINSTANCE.getModal_Scrollable();

		/**
		 * The meta object literal for the '<em><b>Fullscreen</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODAL__FULLSCREEN = eINSTANCE.getModal_Fullscreen();

		/**
		 * The meta object literal for the '<em><b>Fullscreen Below</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODAL__FULLSCREEN_BELOW = eINSTANCE.getModal_FullscreenBelow();

		/**
		 * The meta object literal for the '<em><b>Static Backdrop</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODAL__STATIC_BACKDROP = eINSTANCE.getModal_StaticBackdrop();

		/**
		 * The meta object literal for the '<em><b>Keyboard</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODAL__KEYBOARD = eINSTANCE.getModal_Keyboard();

		/**
		 * The meta object literal for the '<em><b>Header</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODAL__HEADER = eINSTANCE.getModal_Header();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODAL__BODY = eINSTANCE.getModal_Body();

		/**
		 * The meta object literal for the '<em><b>Footer</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODAL__FOOTER = eINSTANCE.getModal_Footer();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.impl.ModalHeaderImpl <em>Modal Header</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.impl.ModalHeaderImpl
		 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.impl.OverlaysPackageImpl#getModalHeader()
		 * @generated
		 */
		EClass MODAL_HEADER = eINSTANCE.getModalHeader();

		/**
		 * The meta object literal for the '<em><b>Close Button</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODAL_HEADER__CLOSE_BUTTON = eINSTANCE.getModalHeader_CloseButton();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODAL_HEADER__TITLE = eINSTANCE.getModalHeader_Title();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.impl.ModalTitleImpl <em>Modal Title</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.impl.ModalTitleImpl
		 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.impl.OverlaysPackageImpl#getModalTitle()
		 * @generated
		 */
		EClass MODAL_TITLE = eINSTANCE.getModalTitle();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.impl.ModalBodyImpl <em>Modal Body</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.impl.ModalBodyImpl
		 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.impl.OverlaysPackageImpl#getModalBody()
		 * @generated
		 */
		EClass MODAL_BODY = eINSTANCE.getModalBody();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.impl.ModalFooterImpl <em>Modal Footer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.impl.ModalFooterImpl
		 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.impl.OverlaysPackageImpl#getModalFooter()
		 * @generated
		 */
		EClass MODAL_FOOTER = eINSTANCE.getModalFooter();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODAL_FOOTER__CONTENT = eINSTANCE.getModalFooter_Content();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.impl.OffcanvasImpl <em>Offcanvas</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.impl.OffcanvasImpl
		 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.impl.OverlaysPackageImpl#getOffcanvas()
		 * @generated
		 */
		EClass OFFCANVAS = eINSTANCE.getOffcanvas();

		/**
		 * The meta object literal for the '<em><b>Placement</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OFFCANVAS__PLACEMENT = eINSTANCE.getOffcanvas_Placement();

		/**
		 * The meta object literal for the '<em><b>Backdrop</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OFFCANVAS__BACKDROP = eINSTANCE.getOffcanvas_Backdrop();

		/**
		 * The meta object literal for the '<em><b>Scroll</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OFFCANVAS__SCROLL = eINSTANCE.getOffcanvas_Scroll();

		/**
		 * The meta object literal for the '<em><b>Header</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OFFCANVAS__HEADER = eINSTANCE.getOffcanvas_Header();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OFFCANVAS__BODY = eINSTANCE.getOffcanvas_Body();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.impl.OffcanvasHeaderImpl <em>Offcanvas Header</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.impl.OffcanvasHeaderImpl
		 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.impl.OverlaysPackageImpl#getOffcanvasHeader()
		 * @generated
		 */
		EClass OFFCANVAS_HEADER = eINSTANCE.getOffcanvasHeader();

		/**
		 * The meta object literal for the '<em><b>Close Button</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OFFCANVAS_HEADER__CLOSE_BUTTON = eINSTANCE.getOffcanvasHeader_CloseButton();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OFFCANVAS_HEADER__TITLE = eINSTANCE.getOffcanvasHeader_Title();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.impl.OffcanvasTitleImpl <em>Offcanvas Title</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.impl.OffcanvasTitleImpl
		 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.impl.OverlaysPackageImpl#getOffcanvasTitle()
		 * @generated
		 */
		EClass OFFCANVAS_TITLE = eINSTANCE.getOffcanvasTitle();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.impl.OffcanvasBodyImpl <em>Offcanvas Body</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.impl.OffcanvasBodyImpl
		 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.impl.OverlaysPackageImpl#getOffcanvasBody()
		 * @generated
		 */
		EClass OFFCANVAS_BODY = eINSTANCE.getOffcanvasBody();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.impl.ToastImpl <em>Toast</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.impl.ToastImpl
		 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.impl.OverlaysPackageImpl#getToast()
		 * @generated
		 */
		EClass TOAST = eINSTANCE.getToast();

		/**
		 * The meta object literal for the '<em><b>Show</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOAST__SHOW = eINSTANCE.getToast_Show();

		/**
		 * The meta object literal for the '<em><b>Bg</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOAST__BG = eINSTANCE.getToast_Bg();

		/**
		 * The meta object literal for the '<em><b>Autohide</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOAST__AUTOHIDE = eINSTANCE.getToast_Autohide();

		/**
		 * The meta object literal for the '<em><b>Delay</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOAST__DELAY = eINSTANCE.getToast_Delay();

		/**
		 * The meta object literal for the '<em><b>Header</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOAST__HEADER = eINSTANCE.getToast_Header();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOAST__BODY = eINSTANCE.getToast_Body();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.impl.ToastHeaderImpl <em>Toast Header</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.impl.ToastHeaderImpl
		 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.impl.OverlaysPackageImpl#getToastHeader()
		 * @generated
		 */
		EClass TOAST_HEADER = eINSTANCE.getToastHeader();

		/**
		 * The meta object literal for the '<em><b>Close Button</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOAST_HEADER__CLOSE_BUTTON = eINSTANCE.getToastHeader_CloseButton();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOAST_HEADER__CONTENT = eINSTANCE.getToastHeader_Content();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.impl.ToastBodyImpl <em>Toast Body</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.impl.ToastBodyImpl
		 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.impl.OverlaysPackageImpl#getToastBody()
		 * @generated
		 */
		EClass TOAST_BODY = eINSTANCE.getToastBody();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.impl.ToastContainerImpl <em>Toast Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.impl.ToastContainerImpl
		 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.impl.OverlaysPackageImpl#getToastContainer()
		 * @generated
		 */
		EClass TOAST_CONTAINER = eINSTANCE.getToastContainer();

		/**
		 * The meta object literal for the '<em><b>Position</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOAST_CONTAINER__POSITION = eINSTANCE.getToastContainer_Position();

		/**
		 * The meta object literal for the '<em><b>Containment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOAST_CONTAINER__CONTAINMENT = eINSTANCE.getToastContainer_Containment();

		/**
		 * The meta object literal for the '<em><b>Toasts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOAST_CONTAINER__TOASTS = eINSTANCE.getToastContainer_Toasts();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.impl.OverlayImpl <em>Overlay</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.impl.OverlayImpl
		 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.impl.OverlaysPackageImpl#getOverlay()
		 * @generated
		 */
		EClass OVERLAY = eINSTANCE.getOverlay();

		/**
		 * The meta object literal for the '<em><b>Html</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OVERLAY__HTML = eINSTANCE.getOverlay_Html();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.impl.TooltipImpl <em>Tooltip</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.impl.TooltipImpl
		 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.impl.OverlaysPackageImpl#getTooltip()
		 * @generated
		 */
		EClass TOOLTIP = eINSTANCE.getTooltip();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOOLTIP__TITLE = eINSTANCE.getTooltip_Title();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.impl.PopoverImpl <em>Popover</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.impl.PopoverImpl
		 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.impl.OverlaysPackageImpl#getPopover()
		 * @generated
		 */
		EClass POPOVER = eINSTANCE.getPopover();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POPOVER__TITLE = eINSTANCE.getPopover_Title();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POPOVER__CONTENT = eINSTANCE.getPopover_Content();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.impl.OverlayTriggerImpl <em>Overlay Trigger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.impl.OverlayTriggerImpl
		 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.impl.OverlaysPackageImpl#getOverlayTrigger()
		 * @generated
		 */
		EClass OVERLAY_TRIGGER = eINSTANCE.getOverlayTrigger();

		/**
		 * The meta object literal for the '<em><b>Placement</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OVERLAY_TRIGGER__PLACEMENT = eINSTANCE.getOverlayTrigger_Placement();

		/**
		 * The meta object literal for the '<em><b>Trigger</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OVERLAY_TRIGGER__TRIGGER = eINSTANCE.getOverlayTrigger_Trigger();

		/**
		 * The meta object literal for the '<em><b>Overlay</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OVERLAY_TRIGGER__OVERLAY = eINSTANCE.getOverlayTrigger_Overlay();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OVERLAY_TRIGGER__TARGET = eINSTANCE.getOverlayTrigger_Target();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.ModalSize <em>Modal Size</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.ModalSize
		 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.impl.OverlaysPackageImpl#getModalSize()
		 * @generated
		 */
		EEnum MODAL_SIZE = eINSTANCE.getModalSize();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.Fullscreen <em>Fullscreen</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.Fullscreen
		 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.impl.OverlaysPackageImpl#getFullscreen()
		 * @generated
		 */
		EEnum FULLSCREEN = eINSTANCE.getFullscreen();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.OffcanvasPlacement <em>Offcanvas Placement</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.OffcanvasPlacement
		 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.impl.OverlaysPackageImpl#getOffcanvasPlacement()
		 * @generated
		 */
		EEnum OFFCANVAS_PLACEMENT = eINSTANCE.getOffcanvasPlacement();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.ToastPosition <em>Toast Position</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.ToastPosition
		 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.impl.OverlaysPackageImpl#getToastPosition()
		 * @generated
		 */
		EEnum TOAST_POSITION = eINSTANCE.getToastPosition();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.ToastContainment <em>Toast Containment</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.ToastContainment
		 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.impl.OverlaysPackageImpl#getToastContainment()
		 * @generated
		 */
		EEnum TOAST_CONTAINMENT = eINSTANCE.getToastContainment();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.Placement <em>Placement</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.Placement
		 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.impl.OverlaysPackageImpl#getPlacement()
		 * @generated
		 */
		EEnum PLACEMENT = eINSTANCE.getPlacement();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.Trigger <em>Trigger</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.Trigger
		 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.impl.OverlaysPackageImpl#getTrigger()
		 * @generated
		 */
		EEnum TRIGGER = eINSTANCE.getTrigger();

	}

} //OverlaysPackage
