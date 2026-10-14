/**
 */
package org.nasdanika.sdk.runtime.models.html;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
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
 * @see org.nasdanika.sdk.runtime.models.html.HtmlFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel modelDirectory='/model/src-gen' featureDelegation='Dynamic' complianceLevel='25' suppressGenModelAnnotations='false' copyrightFields='false' operationReflection='true' importOrganizing='true' basePackage='org.nasdanika.sdk.runtime.models'"
 *        annotation="http://www.eclipse.org/emf/2011/Xcore Ecore='http://www.eclipse.org/emf/2002/Ecore' GenModel='http://www.eclipse.org/emf/2002/GenModel' Html='urn:org.nasdanika:html'"
 * @generated
 */
public interface HtmlPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "html";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "https://runtime.sdk.nasdanika.org/models/html";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.nasdanika.sdk.runtime.models.html";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	HtmlPackage eINSTANCE = org.nasdanika.sdk.runtime.models.html.impl.HtmlPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.html.impl.NodeImpl <em>Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.html.impl.NodeImpl
	 * @see org.nasdanika.sdk.runtime.models.html.impl.HtmlPackageImpl#getNode()
	 * @generated
	 */
	int NODE = 0;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__MARKERS = CorePackage.MARKED__MARKERS;

	/**
	 * The number of structural features of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_FEATURE_COUNT = CorePackage.MARKED_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_OPERATION_COUNT = CorePackage.MARKED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.html.impl.TextImpl <em>Text</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.html.impl.TextImpl
	 * @see org.nasdanika.sdk.runtime.models.html.impl.HtmlPackageImpl#getText()
	 * @generated
	 */
	int TEXT = 1;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__MARKERS = NODE__MARKERS;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__CONTENT = NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FEATURE_COUNT = NODE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_OPERATION_COUNT = NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.html.impl.MarkupImpl <em>Markup</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.html.impl.MarkupImpl
	 * @see org.nasdanika.sdk.runtime.models.html.impl.HtmlPackageImpl#getMarkup()
	 * @generated
	 */
	int MARKUP = 2;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKUP__MARKERS = NODE__MARKERS;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKUP__CONTENT = NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Markup</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKUP_FEATURE_COUNT = NODE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Markup</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKUP_OPERATION_COUNT = NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.html.impl.CommentImpl <em>Comment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.html.impl.CommentImpl
	 * @see org.nasdanika.sdk.runtime.models.html.impl.HtmlPackageImpl#getComment()
	 * @generated
	 */
	int COMMENT = 3;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__MARKERS = NODE__MARKERS;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__CONTENT = NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Comment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT_FEATURE_COUNT = NODE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Comment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT_OPERATION_COUNT = NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.html.impl.NodeReferenceImpl <em>Node Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.html.impl.NodeReferenceImpl
	 * @see org.nasdanika.sdk.runtime.models.html.impl.HtmlPackageImpl#getNodeReference()
	 * @generated
	 */
	int NODE_REFERENCE = 4;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_REFERENCE__MARKERS = NODE__MARKERS;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_REFERENCE__TARGET = NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Node Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_REFERENCE_FEATURE_COUNT = NODE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Node Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_REFERENCE_OPERATION_COUNT = NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.html.Container <em>Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.html.Container
	 * @see org.nasdanika.sdk.runtime.models.html.impl.HtmlPackageImpl#getContainer()
	 * @generated
	 */
	int CONTAINER = 5;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__CONTENTS = 0;

	/**
	 * The number of structural features of the '<em>Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.html.impl.ElementImpl <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.html.impl.ElementImpl
	 * @see org.nasdanika.sdk.runtime.models.html.impl.HtmlPackageImpl#getElement()
	 * @generated
	 */
	int ELEMENT = 6;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__MARKERS = NODE__MARKERS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__ID = NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__CLASSES = NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Style</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__STYLE = NODE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__ATTRIBUTES = NODE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_FEATURE_COUNT = NODE_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Tag Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT___TAG_NAME = NODE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_OPERATION_COUNT = NODE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.html.impl.VoidElementImpl <em>Void Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.html.impl.VoidElementImpl
	 * @see org.nasdanika.sdk.runtime.models.html.impl.HtmlPackageImpl#getVoidElement()
	 * @generated
	 */
	int VOID_ELEMENT = 7;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOID_ELEMENT__MARKERS = ELEMENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOID_ELEMENT__ID = ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOID_ELEMENT__CLASSES = ELEMENT__CLASSES;

	/**
	 * The feature id for the '<em><b>Style</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOID_ELEMENT__STYLE = ELEMENT__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOID_ELEMENT__ATTRIBUTES = ELEMENT__ATTRIBUTES;

	/**
	 * The number of structural features of the '<em>Void Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOID_ELEMENT_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Tag Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOID_ELEMENT___TAG_NAME = ELEMENT___TAG_NAME;

	/**
	 * The number of operations of the '<em>Void Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOID_ELEMENT_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.html.impl.GenericElementImpl <em>Generic Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.html.impl.GenericElementImpl
	 * @see org.nasdanika.sdk.runtime.models.html.impl.HtmlPackageImpl#getGenericElement()
	 * @generated
	 */
	int GENERIC_ELEMENT = 8;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_ELEMENT__MARKERS = ELEMENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_ELEMENT__ID = ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_ELEMENT__CLASSES = ELEMENT__CLASSES;

	/**
	 * The feature id for the '<em><b>Style</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_ELEMENT__STYLE = ELEMENT__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_ELEMENT__ATTRIBUTES = ELEMENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_ELEMENT__CONTENTS = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_ELEMENT__NAME = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Generic Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_ELEMENT_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Tag Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_ELEMENT___TAG_NAME = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Generic Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_ELEMENT_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.html.impl.GenericVoidElementImpl <em>Generic Void Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.html.impl.GenericVoidElementImpl
	 * @see org.nasdanika.sdk.runtime.models.html.impl.HtmlPackageImpl#getGenericVoidElement()
	 * @generated
	 */
	int GENERIC_VOID_ELEMENT = 9;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_VOID_ELEMENT__MARKERS = VOID_ELEMENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_VOID_ELEMENT__ID = VOID_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_VOID_ELEMENT__CLASSES = VOID_ELEMENT__CLASSES;

	/**
	 * The feature id for the '<em><b>Style</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_VOID_ELEMENT__STYLE = VOID_ELEMENT__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_VOID_ELEMENT__ATTRIBUTES = VOID_ELEMENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_VOID_ELEMENT__NAME = VOID_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Generic Void Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_VOID_ELEMENT_FEATURE_COUNT = VOID_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Tag Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_VOID_ELEMENT___TAG_NAME = VOID_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Generic Void Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_VOID_ELEMENT_OPERATION_COUNT = VOID_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.html.impl.LibraryElementImpl <em>Library Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.html.impl.LibraryElementImpl
	 * @see org.nasdanika.sdk.runtime.models.html.impl.HtmlPackageImpl#getLibraryElement()
	 * @generated
	 */
	int LIBRARY_ELEMENT = 10;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY_ELEMENT__MARKERS = ELEMENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY_ELEMENT__ID = ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY_ELEMENT__CLASSES = ELEMENT__CLASSES;

	/**
	 * The feature id for the '<em><b>Style</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY_ELEMENT__STYLE = ELEMENT__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY_ELEMENT__ATTRIBUTES = ELEMENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY_ELEMENT__CONTENTS = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Library Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY_ELEMENT_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Tag Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY_ELEMENT___TAG_NAME = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Library Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY_ELEMENT_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.html.impl.DocumentImpl <em>Document</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.html.impl.DocumentImpl
	 * @see org.nasdanika.sdk.runtime.models.html.impl.HtmlPackageImpl#getDocument()
	 * @generated
	 */
	int DOCUMENT = 11;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__MARKERS = ELEMENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__ID = ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__CLASSES = ELEMENT__CLASSES;

	/**
	 * The feature id for the '<em><b>Style</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__STYLE = ELEMENT__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__ATTRIBUTES = ELEMENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Doctype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__DOCTYPE = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__LANG = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Head</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__HEAD = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__BODY = ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Document</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Tag Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT___TAG_NAME = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Document</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.html.impl.HeadImpl <em>Head</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.html.impl.HeadImpl
	 * @see org.nasdanika.sdk.runtime.models.html.impl.HtmlPackageImpl#getHead()
	 * @generated
	 */
	int HEAD = 12;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAD__MARKERS = ELEMENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAD__ID = ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAD__CLASSES = ELEMENT__CLASSES;

	/**
	 * The feature id for the '<em><b>Style</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAD__STYLE = ELEMENT__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAD__ATTRIBUTES = ELEMENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAD__CONTENTS = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Charset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAD__CHARSET = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAD__TITLE = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Base</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAD__BASE = ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Metas</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAD__METAS = ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAD__LINKS = ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Stylesheets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAD__STYLESHEETS = ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Import Map</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAD__IMPORT_MAP = ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Scripts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAD__SCRIPTS = ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Head</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAD_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The operation id for the '<em>Tag Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAD___TAG_NAME = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Head</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAD_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.html.impl.BodyImpl <em>Body</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.html.impl.BodyImpl
	 * @see org.nasdanika.sdk.runtime.models.html.impl.HtmlPackageImpl#getBody()
	 * @generated
	 */
	int BODY = 13;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY__MARKERS = ELEMENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY__ID = ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY__CLASSES = ELEMENT__CLASSES;

	/**
	 * The feature id for the '<em><b>Style</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY__STYLE = ELEMENT__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY__ATTRIBUTES = ELEMENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY__CONTENTS = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Body</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Tag Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY___TAG_NAME = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Body</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.html.impl.MetaImpl <em>Meta</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.html.impl.MetaImpl
	 * @see org.nasdanika.sdk.runtime.models.html.impl.HtmlPackageImpl#getMeta()
	 * @generated
	 */
	int META = 14;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META__MARKERS = VOID_ELEMENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META__ID = VOID_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META__CLASSES = VOID_ELEMENT__CLASSES;

	/**
	 * The feature id for the '<em><b>Style</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META__STYLE = VOID_ELEMENT__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META__ATTRIBUTES = VOID_ELEMENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META__NAME = VOID_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Http Equiv</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META__HTTP_EQUIV = VOID_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META__PROPERTY = VOID_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META__CONTENT = VOID_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Charset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META__CHARSET = VOID_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Meta</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_FEATURE_COUNT = VOID_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Tag Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META___TAG_NAME = VOID_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Meta</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_OPERATION_COUNT = VOID_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.html.impl.LinkImpl <em>Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.html.impl.LinkImpl
	 * @see org.nasdanika.sdk.runtime.models.html.impl.HtmlPackageImpl#getLink()
	 * @generated
	 */
	int LINK = 15;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__MARKERS = VOID_ELEMENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__ID = VOID_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__CLASSES = VOID_ELEMENT__CLASSES;

	/**
	 * The feature id for the '<em><b>Style</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__STYLE = VOID_ELEMENT__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__ATTRIBUTES = VOID_ELEMENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Rel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__REL = VOID_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__HREF = VOID_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__TYPE = VOID_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Media</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__MEDIA = VOID_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Sizes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__SIZES = VOID_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Crossorigin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__CROSSORIGIN = VOID_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Integrity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__INTEGRITY = VOID_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_FEATURE_COUNT = VOID_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The operation id for the '<em>Tag Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK___TAG_NAME = VOID_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_OPERATION_COUNT = VOID_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.html.impl.StylesheetImpl <em>Stylesheet</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.html.impl.StylesheetImpl
	 * @see org.nasdanika.sdk.runtime.models.html.impl.HtmlPackageImpl#getStylesheet()
	 * @generated
	 */
	int STYLESHEET = 16;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLESHEET__MARKERS = ELEMENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLESHEET__ID = ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLESHEET__CLASSES = ELEMENT__CLASSES;

	/**
	 * The feature id for the '<em><b>Style</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLESHEET__STYLE = ELEMENT__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLESHEET__ATTRIBUTES = ELEMENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLESHEET__HREF = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Media</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLESHEET__MEDIA = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Crossorigin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLESHEET__CROSSORIGIN = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Integrity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLESHEET__INTEGRITY = ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLESHEET__CONTENT = ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Stylesheet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLESHEET_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Tag Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLESHEET___TAG_NAME = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Stylesheet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLESHEET_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.html.impl.ScriptImpl <em>Script</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.html.impl.ScriptImpl
	 * @see org.nasdanika.sdk.runtime.models.html.impl.HtmlPackageImpl#getScript()
	 * @generated
	 */
	int SCRIPT = 17;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT__MARKERS = ELEMENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT__ID = ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT__CLASSES = ELEMENT__CLASSES;

	/**
	 * The feature id for the '<em><b>Style</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT__STYLE = ELEMENT__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT__ATTRIBUTES = ELEMENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Src</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT__SRC = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT__TYPE = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Module</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT__MODULE = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Async</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT__ASYNC = ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Defer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT__DEFER = ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Crossorigin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT__CROSSORIGIN = ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Integrity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT__INTEGRITY = ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT__CONTENT = ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Script</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The operation id for the '<em>Tag Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT___TAG_NAME = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Script</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.html.impl.ImportMapImpl <em>Import Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.html.impl.ImportMapImpl
	 * @see org.nasdanika.sdk.runtime.models.html.impl.HtmlPackageImpl#getImportMap()
	 * @generated
	 */
	int IMPORT_MAP = 18;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_MAP__MARKERS = ELEMENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_MAP__ID = ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_MAP__CLASSES = ELEMENT__CLASSES;

	/**
	 * The feature id for the '<em><b>Style</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_MAP__STYLE = ELEMENT__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_MAP__ATTRIBUTES = ELEMENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Imports</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_MAP__IMPORTS = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Scopes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_MAP__SCOPES = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Import Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_MAP_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Tag Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_MAP___TAG_NAME = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Import Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_MAP_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.html.impl.ImportMapScopeImpl <em>Import Map Scope</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.html.impl.ImportMapScopeImpl
	 * @see org.nasdanika.sdk.runtime.models.html.impl.HtmlPackageImpl#getImportMapScope()
	 * @generated
	 */
	int IMPORT_MAP_SCOPE = 19;

	/**
	 * The feature id for the '<em><b>Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_MAP_SCOPE__PREFIX = 0;

	/**
	 * The feature id for the '<em><b>Imports</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_MAP_SCOPE__IMPORTS = 1;

	/**
	 * The number of structural features of the '<em>Import Map Scope</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_MAP_SCOPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Import Map Scope</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_MAP_SCOPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.html.impl.DivImpl <em>Div</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.html.impl.DivImpl
	 * @see org.nasdanika.sdk.runtime.models.html.impl.HtmlPackageImpl#getDiv()
	 * @generated
	 */
	int DIV = 20;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIV__MARKERS = ELEMENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIV__ID = ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIV__CLASSES = ELEMENT__CLASSES;

	/**
	 * The feature id for the '<em><b>Style</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIV__STYLE = ELEMENT__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIV__ATTRIBUTES = ELEMENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIV__CONTENTS = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Div</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIV_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Tag Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIV___TAG_NAME = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Div</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIV_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.html.impl.SpanImpl <em>Span</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.html.impl.SpanImpl
	 * @see org.nasdanika.sdk.runtime.models.html.impl.HtmlPackageImpl#getSpan()
	 * @generated
	 */
	int SPAN = 21;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPAN__MARKERS = ELEMENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPAN__ID = ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPAN__CLASSES = ELEMENT__CLASSES;

	/**
	 * The feature id for the '<em><b>Style</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPAN__STYLE = ELEMENT__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPAN__ATTRIBUTES = ELEMENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPAN__CONTENTS = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Span</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPAN_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Tag Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPAN___TAG_NAME = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Span</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPAN_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.html.impl.ParagraphImpl <em>Paragraph</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.html.impl.ParagraphImpl
	 * @see org.nasdanika.sdk.runtime.models.html.impl.HtmlPackageImpl#getParagraph()
	 * @generated
	 */
	int PARAGRAPH = 22;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAGRAPH__MARKERS = ELEMENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAGRAPH__ID = ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAGRAPH__CLASSES = ELEMENT__CLASSES;

	/**
	 * The feature id for the '<em><b>Style</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAGRAPH__STYLE = ELEMENT__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAGRAPH__ATTRIBUTES = ELEMENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAGRAPH__CONTENTS = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Paragraph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAGRAPH_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Tag Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAGRAPH___TAG_NAME = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Paragraph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAGRAPH_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.html.impl.HeadingImpl <em>Heading</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.html.impl.HeadingImpl
	 * @see org.nasdanika.sdk.runtime.models.html.impl.HtmlPackageImpl#getHeading()
	 * @generated
	 */
	int HEADING = 23;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADING__MARKERS = ELEMENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADING__ID = ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADING__CLASSES = ELEMENT__CLASSES;

	/**
	 * The feature id for the '<em><b>Style</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADING__STYLE = ELEMENT__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADING__ATTRIBUTES = ELEMENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADING__CONTENTS = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADING__LEVEL = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Heading</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADING_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Tag Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADING___TAG_NAME = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Heading</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADING_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.html.impl.HeaderImpl <em>Header</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.html.impl.HeaderImpl
	 * @see org.nasdanika.sdk.runtime.models.html.impl.HtmlPackageImpl#getHeader()
	 * @generated
	 */
	int HEADER = 24;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER__MARKERS = ELEMENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER__ID = ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER__CLASSES = ELEMENT__CLASSES;

	/**
	 * The feature id for the '<em><b>Style</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER__STYLE = ELEMENT__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER__ATTRIBUTES = ELEMENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER__CONTENTS = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Header</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Tag Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER___TAG_NAME = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Header</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.html.impl.FooterImpl <em>Footer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.html.impl.FooterImpl
	 * @see org.nasdanika.sdk.runtime.models.html.impl.HtmlPackageImpl#getFooter()
	 * @generated
	 */
	int FOOTER = 25;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOOTER__MARKERS = ELEMENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOOTER__ID = ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOOTER__CLASSES = ELEMENT__CLASSES;

	/**
	 * The feature id for the '<em><b>Style</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOOTER__STYLE = ELEMENT__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOOTER__ATTRIBUTES = ELEMENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOOTER__CONTENTS = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Footer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOOTER_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Tag Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOOTER___TAG_NAME = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Footer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOOTER_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.html.impl.MainImpl <em>Main</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.html.impl.MainImpl
	 * @see org.nasdanika.sdk.runtime.models.html.impl.HtmlPackageImpl#getMain()
	 * @generated
	 */
	int MAIN = 26;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN__MARKERS = ELEMENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN__ID = ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN__CLASSES = ELEMENT__CLASSES;

	/**
	 * The feature id for the '<em><b>Style</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN__STYLE = ELEMENT__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN__ATTRIBUTES = ELEMENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN__CONTENTS = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Main</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Tag Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN___TAG_NAME = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Main</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.html.impl.NavImpl <em>Nav</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.html.impl.NavImpl
	 * @see org.nasdanika.sdk.runtime.models.html.impl.HtmlPackageImpl#getNav()
	 * @generated
	 */
	int NAV = 27;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAV__MARKERS = ELEMENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAV__ID = ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAV__CLASSES = ELEMENT__CLASSES;

	/**
	 * The feature id for the '<em><b>Style</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAV__STYLE = ELEMENT__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAV__ATTRIBUTES = ELEMENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAV__CONTENTS = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Nav</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAV_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Tag Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAV___TAG_NAME = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Nav</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAV_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.html.impl.SectionImpl <em>Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.html.impl.SectionImpl
	 * @see org.nasdanika.sdk.runtime.models.html.impl.HtmlPackageImpl#getSection()
	 * @generated
	 */
	int SECTION = 28;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION__MARKERS = ELEMENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION__ID = ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION__CLASSES = ELEMENT__CLASSES;

	/**
	 * The feature id for the '<em><b>Style</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION__STYLE = ELEMENT__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION__ATTRIBUTES = ELEMENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION__CONTENTS = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Tag Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION___TAG_NAME = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.html.impl.ArticleImpl <em>Article</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.html.impl.ArticleImpl
	 * @see org.nasdanika.sdk.runtime.models.html.impl.HtmlPackageImpl#getArticle()
	 * @generated
	 */
	int ARTICLE = 29;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTICLE__MARKERS = ELEMENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTICLE__ID = ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTICLE__CLASSES = ELEMENT__CLASSES;

	/**
	 * The feature id for the '<em><b>Style</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTICLE__STYLE = ELEMENT__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTICLE__ATTRIBUTES = ELEMENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTICLE__CONTENTS = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Article</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTICLE_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Tag Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTICLE___TAG_NAME = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Article</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTICLE_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.html.impl.AsideImpl <em>Aside</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.html.impl.AsideImpl
	 * @see org.nasdanika.sdk.runtime.models.html.impl.HtmlPackageImpl#getAside()
	 * @generated
	 */
	int ASIDE = 30;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASIDE__MARKERS = ELEMENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASIDE__ID = ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASIDE__CLASSES = ELEMENT__CLASSES;

	/**
	 * The feature id for the '<em><b>Style</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASIDE__STYLE = ELEMENT__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASIDE__ATTRIBUTES = ELEMENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASIDE__CONTENTS = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Aside</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASIDE_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Tag Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASIDE___TAG_NAME = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Aside</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASIDE_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.html.impl.BlockquoteImpl <em>Blockquote</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.html.impl.BlockquoteImpl
	 * @see org.nasdanika.sdk.runtime.models.html.impl.HtmlPackageImpl#getBlockquote()
	 * @generated
	 */
	int BLOCKQUOTE = 31;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCKQUOTE__MARKERS = ELEMENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCKQUOTE__ID = ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCKQUOTE__CLASSES = ELEMENT__CLASSES;

	/**
	 * The feature id for the '<em><b>Style</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCKQUOTE__STYLE = ELEMENT__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCKQUOTE__ATTRIBUTES = ELEMENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCKQUOTE__CONTENTS = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Cite</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCKQUOTE__CITE = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Blockquote</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCKQUOTE_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Tag Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCKQUOTE___TAG_NAME = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Blockquote</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCKQUOTE_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.html.impl.PreImpl <em>Pre</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.html.impl.PreImpl
	 * @see org.nasdanika.sdk.runtime.models.html.impl.HtmlPackageImpl#getPre()
	 * @generated
	 */
	int PRE = 32;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE__MARKERS = ELEMENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE__ID = ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE__CLASSES = ELEMENT__CLASSES;

	/**
	 * The feature id for the '<em><b>Style</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE__STYLE = ELEMENT__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE__ATTRIBUTES = ELEMENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE__CONTENTS = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Pre</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Tag Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE___TAG_NAME = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Pre</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.html.impl.FigureImpl <em>Figure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.html.impl.FigureImpl
	 * @see org.nasdanika.sdk.runtime.models.html.impl.HtmlPackageImpl#getFigure()
	 * @generated
	 */
	int FIGURE = 33;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIGURE__MARKERS = ELEMENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIGURE__ID = ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIGURE__CLASSES = ELEMENT__CLASSES;

	/**
	 * The feature id for the '<em><b>Style</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIGURE__STYLE = ELEMENT__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIGURE__ATTRIBUTES = ELEMENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIGURE__CONTENTS = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Figure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIGURE_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Tag Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIGURE___TAG_NAME = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Figure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIGURE_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.html.impl.FigureCaptionImpl <em>Figure Caption</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.html.impl.FigureCaptionImpl
	 * @see org.nasdanika.sdk.runtime.models.html.impl.HtmlPackageImpl#getFigureCaption()
	 * @generated
	 */
	int FIGURE_CAPTION = 34;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIGURE_CAPTION__MARKERS = ELEMENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIGURE_CAPTION__ID = ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIGURE_CAPTION__CLASSES = ELEMENT__CLASSES;

	/**
	 * The feature id for the '<em><b>Style</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIGURE_CAPTION__STYLE = ELEMENT__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIGURE_CAPTION__ATTRIBUTES = ELEMENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIGURE_CAPTION__CONTENTS = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Figure Caption</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIGURE_CAPTION_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Tag Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIGURE_CAPTION___TAG_NAME = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Figure Caption</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIGURE_CAPTION_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.html.impl.DetailsImpl <em>Details</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.html.impl.DetailsImpl
	 * @see org.nasdanika.sdk.runtime.models.html.impl.HtmlPackageImpl#getDetails()
	 * @generated
	 */
	int DETAILS = 35;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS__MARKERS = ELEMENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS__ID = ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS__CLASSES = ELEMENT__CLASSES;

	/**
	 * The feature id for the '<em><b>Style</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS__STYLE = ELEMENT__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS__ATTRIBUTES = ELEMENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS__CONTENTS = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Open</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS__OPEN = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS__SUMMARY = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Details</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Tag Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS___TAG_NAME = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Details</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.html.impl.SummaryImpl <em>Summary</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.html.impl.SummaryImpl
	 * @see org.nasdanika.sdk.runtime.models.html.impl.HtmlPackageImpl#getSummary()
	 * @generated
	 */
	int SUMMARY = 36;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUMMARY__MARKERS = ELEMENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUMMARY__ID = ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUMMARY__CLASSES = ELEMENT__CLASSES;

	/**
	 * The feature id for the '<em><b>Style</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUMMARY__STYLE = ELEMENT__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUMMARY__ATTRIBUTES = ELEMENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUMMARY__CONTENTS = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Summary</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUMMARY_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Tag Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUMMARY___TAG_NAME = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Summary</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUMMARY_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.html.impl.HorizontalRuleImpl <em>Horizontal Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.html.impl.HorizontalRuleImpl
	 * @see org.nasdanika.sdk.runtime.models.html.impl.HtmlPackageImpl#getHorizontalRule()
	 * @generated
	 */
	int HORIZONTAL_RULE = 37;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HORIZONTAL_RULE__MARKERS = VOID_ELEMENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HORIZONTAL_RULE__ID = VOID_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HORIZONTAL_RULE__CLASSES = VOID_ELEMENT__CLASSES;

	/**
	 * The feature id for the '<em><b>Style</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HORIZONTAL_RULE__STYLE = VOID_ELEMENT__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HORIZONTAL_RULE__ATTRIBUTES = VOID_ELEMENT__ATTRIBUTES;

	/**
	 * The number of structural features of the '<em>Horizontal Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HORIZONTAL_RULE_FEATURE_COUNT = VOID_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Tag Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HORIZONTAL_RULE___TAG_NAME = VOID_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Horizontal Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HORIZONTAL_RULE_OPERATION_COUNT = VOID_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.html.impl.LineBreakImpl <em>Line Break</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.html.impl.LineBreakImpl
	 * @see org.nasdanika.sdk.runtime.models.html.impl.HtmlPackageImpl#getLineBreak()
	 * @generated
	 */
	int LINE_BREAK = 38;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_BREAK__MARKERS = VOID_ELEMENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_BREAK__ID = VOID_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_BREAK__CLASSES = VOID_ELEMENT__CLASSES;

	/**
	 * The feature id for the '<em><b>Style</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_BREAK__STYLE = VOID_ELEMENT__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_BREAK__ATTRIBUTES = VOID_ELEMENT__ATTRIBUTES;

	/**
	 * The number of structural features of the '<em>Line Break</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_BREAK_FEATURE_COUNT = VOID_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Tag Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_BREAK___TAG_NAME = VOID_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Line Break</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_BREAK_OPERATION_COUNT = VOID_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.html.impl.AnchorImpl <em>Anchor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.html.impl.AnchorImpl
	 * @see org.nasdanika.sdk.runtime.models.html.impl.HtmlPackageImpl#getAnchor()
	 * @generated
	 */
	int ANCHOR = 39;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANCHOR__MARKERS = ELEMENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANCHOR__ID = ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANCHOR__CLASSES = ELEMENT__CLASSES;

	/**
	 * The feature id for the '<em><b>Style</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANCHOR__STYLE = ELEMENT__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANCHOR__ATTRIBUTES = ELEMENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANCHOR__CONTENTS = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANCHOR__HREF = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANCHOR__TARGET = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Rel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANCHOR__REL = ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Download</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANCHOR__DOWNLOAD = ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Anchor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANCHOR_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Tag Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANCHOR___TAG_NAME = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Anchor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANCHOR_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.html.impl.StrongImpl <em>Strong</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.html.impl.StrongImpl
	 * @see org.nasdanika.sdk.runtime.models.html.impl.HtmlPackageImpl#getStrong()
	 * @generated
	 */
	int STRONG = 40;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRONG__MARKERS = ELEMENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRONG__ID = ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRONG__CLASSES = ELEMENT__CLASSES;

	/**
	 * The feature id for the '<em><b>Style</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRONG__STYLE = ELEMENT__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRONG__ATTRIBUTES = ELEMENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRONG__CONTENTS = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Strong</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRONG_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Tag Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRONG___TAG_NAME = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Strong</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRONG_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.html.impl.EmphasisImpl <em>Emphasis</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.html.impl.EmphasisImpl
	 * @see org.nasdanika.sdk.runtime.models.html.impl.HtmlPackageImpl#getEmphasis()
	 * @generated
	 */
	int EMPHASIS = 41;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPHASIS__MARKERS = ELEMENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPHASIS__ID = ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPHASIS__CLASSES = ELEMENT__CLASSES;

	/**
	 * The feature id for the '<em><b>Style</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPHASIS__STYLE = ELEMENT__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPHASIS__ATTRIBUTES = ELEMENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPHASIS__CONTENTS = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Emphasis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPHASIS_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Tag Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPHASIS___TAG_NAME = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Emphasis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPHASIS_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.html.impl.CodeImpl <em>Code</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.html.impl.CodeImpl
	 * @see org.nasdanika.sdk.runtime.models.html.impl.HtmlPackageImpl#getCode()
	 * @generated
	 */
	int CODE = 42;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE__MARKERS = ELEMENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE__ID = ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE__CLASSES = ELEMENT__CLASSES;

	/**
	 * The feature id for the '<em><b>Style</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE__STYLE = ELEMENT__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE__ATTRIBUTES = ELEMENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE__CONTENTS = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Code</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Tag Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE___TAG_NAME = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Code</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.html.impl.ImageImpl <em>Image</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.html.impl.ImageImpl
	 * @see org.nasdanika.sdk.runtime.models.html.impl.HtmlPackageImpl#getImage()
	 * @generated
	 */
	int IMAGE = 43;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__MARKERS = VOID_ELEMENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__ID = VOID_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__CLASSES = VOID_ELEMENT__CLASSES;

	/**
	 * The feature id for the '<em><b>Style</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__STYLE = VOID_ELEMENT__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__ATTRIBUTES = VOID_ELEMENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Src</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__SRC = VOID_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Alt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__ALT = VOID_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Srcset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__SRCSET = VOID_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Sizes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__SIZES = VOID_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__WIDTH = VOID_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__HEIGHT = VOID_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Loading</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__LOADING = VOID_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Image</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_FEATURE_COUNT = VOID_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The operation id for the '<em>Tag Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE___TAG_NAME = VOID_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Image</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_OPERATION_COUNT = VOID_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.html.impl.InlineFrameImpl <em>Inline Frame</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.html.impl.InlineFrameImpl
	 * @see org.nasdanika.sdk.runtime.models.html.impl.HtmlPackageImpl#getInlineFrame()
	 * @generated
	 */
	int INLINE_FRAME = 44;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE_FRAME__MARKERS = ELEMENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE_FRAME__ID = ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE_FRAME__CLASSES = ELEMENT__CLASSES;

	/**
	 * The feature id for the '<em><b>Style</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE_FRAME__STYLE = ELEMENT__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE_FRAME__ATTRIBUTES = ELEMENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Src</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE_FRAME__SRC = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE_FRAME__TITLE = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE_FRAME__WIDTH = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE_FRAME__HEIGHT = ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Allow</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE_FRAME__ALLOW = ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Loading</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE_FRAME__LOADING = ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Inline Frame</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE_FRAME_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The operation id for the '<em>Tag Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE_FRAME___TAG_NAME = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Inline Frame</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE_FRAME_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.html.ItemList <em>Item List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.html.ItemList
	 * @see org.nasdanika.sdk.runtime.models.html.impl.HtmlPackageImpl#getItemList()
	 * @generated
	 */
	int ITEM_LIST = 45;

	/**
	 * The feature id for the '<em><b>Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_LIST__ITEMS = 0;

	/**
	 * The number of structural features of the '<em>Item List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_LIST_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Item List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_LIST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.html.impl.UnorderedListImpl <em>Unordered List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.html.impl.UnorderedListImpl
	 * @see org.nasdanika.sdk.runtime.models.html.impl.HtmlPackageImpl#getUnorderedList()
	 * @generated
	 */
	int UNORDERED_LIST = 46;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNORDERED_LIST__MARKERS = ELEMENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNORDERED_LIST__ID = ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNORDERED_LIST__CLASSES = ELEMENT__CLASSES;

	/**
	 * The feature id for the '<em><b>Style</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNORDERED_LIST__STYLE = ELEMENT__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNORDERED_LIST__ATTRIBUTES = ELEMENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNORDERED_LIST__ITEMS = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Unordered List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNORDERED_LIST_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Tag Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNORDERED_LIST___TAG_NAME = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Unordered List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNORDERED_LIST_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.html.impl.OrderedListImpl <em>Ordered List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.html.impl.OrderedListImpl
	 * @see org.nasdanika.sdk.runtime.models.html.impl.HtmlPackageImpl#getOrderedList()
	 * @generated
	 */
	int ORDERED_LIST = 47;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_LIST__MARKERS = ELEMENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_LIST__ID = ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_LIST__CLASSES = ELEMENT__CLASSES;

	/**
	 * The feature id for the '<em><b>Style</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_LIST__STYLE = ELEMENT__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_LIST__ATTRIBUTES = ELEMENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_LIST__ITEMS = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_LIST__START = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Reversed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_LIST__REVERSED = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_LIST__TYPE = ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Ordered List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_LIST_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Tag Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_LIST___TAG_NAME = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Ordered List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_LIST_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.html.impl.ListItemImpl <em>List Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.html.impl.ListItemImpl
	 * @see org.nasdanika.sdk.runtime.models.html.impl.HtmlPackageImpl#getListItem()
	 * @generated
	 */
	int LIST_ITEM = 48;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_ITEM__MARKERS = ELEMENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_ITEM__ID = ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_ITEM__CLASSES = ELEMENT__CLASSES;

	/**
	 * The feature id for the '<em><b>Style</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_ITEM__STYLE = ELEMENT__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_ITEM__ATTRIBUTES = ELEMENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_ITEM__CONTENTS = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_ITEM__VALUE = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>List Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_ITEM_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Tag Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_ITEM___TAG_NAME = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>List Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_ITEM_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.html.DescriptionListItem <em>Description List Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.html.DescriptionListItem
	 * @see org.nasdanika.sdk.runtime.models.html.impl.HtmlPackageImpl#getDescriptionListItem()
	 * @generated
	 */
	int DESCRIPTION_LIST_ITEM = 49;

	/**
	 * The number of structural features of the '<em>Description List Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_LIST_ITEM_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Description List Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_LIST_ITEM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.html.impl.DescriptionListImpl <em>Description List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.html.impl.DescriptionListImpl
	 * @see org.nasdanika.sdk.runtime.models.html.impl.HtmlPackageImpl#getDescriptionList()
	 * @generated
	 */
	int DESCRIPTION_LIST = 50;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_LIST__MARKERS = ELEMENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_LIST__ID = ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_LIST__CLASSES = ELEMENT__CLASSES;

	/**
	 * The feature id for the '<em><b>Style</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_LIST__STYLE = ELEMENT__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_LIST__ATTRIBUTES = ELEMENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_LIST__ITEMS = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Description List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_LIST_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Tag Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_LIST___TAG_NAME = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Description List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_LIST_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.html.impl.DescriptionTermImpl <em>Description Term</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.html.impl.DescriptionTermImpl
	 * @see org.nasdanika.sdk.runtime.models.html.impl.HtmlPackageImpl#getDescriptionTerm()
	 * @generated
	 */
	int DESCRIPTION_TERM = 51;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_TERM__MARKERS = ELEMENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_TERM__ID = ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_TERM__CLASSES = ELEMENT__CLASSES;

	/**
	 * The feature id for the '<em><b>Style</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_TERM__STYLE = ELEMENT__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_TERM__ATTRIBUTES = ELEMENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_TERM__CONTENTS = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Description Term</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_TERM_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Tag Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_TERM___TAG_NAME = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Description Term</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_TERM_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.html.impl.DescriptionDetailsImpl <em>Description Details</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.html.impl.DescriptionDetailsImpl
	 * @see org.nasdanika.sdk.runtime.models.html.impl.HtmlPackageImpl#getDescriptionDetails()
	 * @generated
	 */
	int DESCRIPTION_DETAILS = 52;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_DETAILS__MARKERS = ELEMENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_DETAILS__ID = ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_DETAILS__CLASSES = ELEMENT__CLASSES;

	/**
	 * The feature id for the '<em><b>Style</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_DETAILS__STYLE = ELEMENT__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_DETAILS__ATTRIBUTES = ELEMENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_DETAILS__CONTENTS = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Description Details</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_DETAILS_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Tag Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_DETAILS___TAG_NAME = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Description Details</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_DETAILS_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.html.impl.TableImpl <em>Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.html.impl.TableImpl
	 * @see org.nasdanika.sdk.runtime.models.html.impl.HtmlPackageImpl#getTable()
	 * @generated
	 */
	int TABLE = 53;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__MARKERS = ELEMENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__ID = ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__CLASSES = ELEMENT__CLASSES;

	/**
	 * The feature id for the '<em><b>Style</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__STYLE = ELEMENT__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__ATTRIBUTES = ELEMENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Caption</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__CAPTION = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Column Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__COLUMN_GROUPS = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Head</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__HEAD = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Bodies</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__BODIES = ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Foot</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__FOOT = ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Tag Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE___TAG_NAME = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.html.impl.CaptionImpl <em>Caption</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.html.impl.CaptionImpl
	 * @see org.nasdanika.sdk.runtime.models.html.impl.HtmlPackageImpl#getCaption()
	 * @generated
	 */
	int CAPTION = 54;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPTION__MARKERS = ELEMENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPTION__ID = ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPTION__CLASSES = ELEMENT__CLASSES;

	/**
	 * The feature id for the '<em><b>Style</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPTION__STYLE = ELEMENT__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPTION__ATTRIBUTES = ELEMENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPTION__CONTENTS = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Caption</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPTION_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Tag Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPTION___TAG_NAME = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Caption</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPTION_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.html.impl.ColumnGroupImpl <em>Column Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.html.impl.ColumnGroupImpl
	 * @see org.nasdanika.sdk.runtime.models.html.impl.HtmlPackageImpl#getColumnGroup()
	 * @generated
	 */
	int COLUMN_GROUP = 55;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_GROUP__MARKERS = ELEMENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_GROUP__ID = ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_GROUP__CLASSES = ELEMENT__CLASSES;

	/**
	 * The feature id for the '<em><b>Style</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_GROUP__STYLE = ELEMENT__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_GROUP__ATTRIBUTES = ELEMENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Span</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_GROUP__SPAN = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Columns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_GROUP__COLUMNS = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Column Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_GROUP_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Tag Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_GROUP___TAG_NAME = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Column Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_GROUP_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.html.impl.ColumnImpl <em>Column</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.html.impl.ColumnImpl
	 * @see org.nasdanika.sdk.runtime.models.html.impl.HtmlPackageImpl#getColumn()
	 * @generated
	 */
	int COLUMN = 56;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__MARKERS = VOID_ELEMENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__ID = VOID_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__CLASSES = VOID_ELEMENT__CLASSES;

	/**
	 * The feature id for the '<em><b>Style</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__STYLE = VOID_ELEMENT__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__ATTRIBUTES = VOID_ELEMENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Span</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__SPAN = VOID_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_FEATURE_COUNT = VOID_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Tag Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN___TAG_NAME = VOID_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_OPERATION_COUNT = VOID_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.html.impl.TableSectionImpl <em>Table Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.html.impl.TableSectionImpl
	 * @see org.nasdanika.sdk.runtime.models.html.impl.HtmlPackageImpl#getTableSection()
	 * @generated
	 */
	int TABLE_SECTION = 57;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_SECTION__MARKERS = ELEMENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_SECTION__ID = ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_SECTION__CLASSES = ELEMENT__CLASSES;

	/**
	 * The feature id for the '<em><b>Style</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_SECTION__STYLE = ELEMENT__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_SECTION__ATTRIBUTES = ELEMENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Rows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_SECTION__ROWS = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Table Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_SECTION_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Tag Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_SECTION___TAG_NAME = ELEMENT___TAG_NAME;

	/**
	 * The number of operations of the '<em>Table Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_SECTION_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.html.impl.TableHeadImpl <em>Table Head</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.html.impl.TableHeadImpl
	 * @see org.nasdanika.sdk.runtime.models.html.impl.HtmlPackageImpl#getTableHead()
	 * @generated
	 */
	int TABLE_HEAD = 58;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_HEAD__MARKERS = TABLE_SECTION__MARKERS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_HEAD__ID = TABLE_SECTION__ID;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_HEAD__CLASSES = TABLE_SECTION__CLASSES;

	/**
	 * The feature id for the '<em><b>Style</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_HEAD__STYLE = TABLE_SECTION__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_HEAD__ATTRIBUTES = TABLE_SECTION__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Rows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_HEAD__ROWS = TABLE_SECTION__ROWS;

	/**
	 * The number of structural features of the '<em>Table Head</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_HEAD_FEATURE_COUNT = TABLE_SECTION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Tag Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_HEAD___TAG_NAME = TABLE_SECTION_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Table Head</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_HEAD_OPERATION_COUNT = TABLE_SECTION_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.html.impl.TableBodyImpl <em>Table Body</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.html.impl.TableBodyImpl
	 * @see org.nasdanika.sdk.runtime.models.html.impl.HtmlPackageImpl#getTableBody()
	 * @generated
	 */
	int TABLE_BODY = 59;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_BODY__MARKERS = TABLE_SECTION__MARKERS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_BODY__ID = TABLE_SECTION__ID;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_BODY__CLASSES = TABLE_SECTION__CLASSES;

	/**
	 * The feature id for the '<em><b>Style</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_BODY__STYLE = TABLE_SECTION__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_BODY__ATTRIBUTES = TABLE_SECTION__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Rows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_BODY__ROWS = TABLE_SECTION__ROWS;

	/**
	 * The number of structural features of the '<em>Table Body</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_BODY_FEATURE_COUNT = TABLE_SECTION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Tag Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_BODY___TAG_NAME = TABLE_SECTION_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Table Body</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_BODY_OPERATION_COUNT = TABLE_SECTION_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.html.impl.TableFootImpl <em>Table Foot</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.html.impl.TableFootImpl
	 * @see org.nasdanika.sdk.runtime.models.html.impl.HtmlPackageImpl#getTableFoot()
	 * @generated
	 */
	int TABLE_FOOT = 60;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_FOOT__MARKERS = TABLE_SECTION__MARKERS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_FOOT__ID = TABLE_SECTION__ID;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_FOOT__CLASSES = TABLE_SECTION__CLASSES;

	/**
	 * The feature id for the '<em><b>Style</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_FOOT__STYLE = TABLE_SECTION__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_FOOT__ATTRIBUTES = TABLE_SECTION__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Rows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_FOOT__ROWS = TABLE_SECTION__ROWS;

	/**
	 * The number of structural features of the '<em>Table Foot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_FOOT_FEATURE_COUNT = TABLE_SECTION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Tag Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_FOOT___TAG_NAME = TABLE_SECTION_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Table Foot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_FOOT_OPERATION_COUNT = TABLE_SECTION_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.html.impl.TableRowImpl <em>Table Row</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.html.impl.TableRowImpl
	 * @see org.nasdanika.sdk.runtime.models.html.impl.HtmlPackageImpl#getTableRow()
	 * @generated
	 */
	int TABLE_ROW = 61;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_ROW__MARKERS = ELEMENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_ROW__ID = ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_ROW__CLASSES = ELEMENT__CLASSES;

	/**
	 * The feature id for the '<em><b>Style</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_ROW__STYLE = ELEMENT__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_ROW__ATTRIBUTES = ELEMENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Cells</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_ROW__CELLS = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Table Row</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_ROW_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Tag Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_ROW___TAG_NAME = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Table Row</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_ROW_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.html.impl.TableCellImpl <em>Table Cell</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.html.impl.TableCellImpl
	 * @see org.nasdanika.sdk.runtime.models.html.impl.HtmlPackageImpl#getTableCell()
	 * @generated
	 */
	int TABLE_CELL = 62;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_CELL__MARKERS = ELEMENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_CELL__ID = ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_CELL__CLASSES = ELEMENT__CLASSES;

	/**
	 * The feature id for the '<em><b>Style</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_CELL__STYLE = ELEMENT__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_CELL__ATTRIBUTES = ELEMENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_CELL__CONTENTS = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Header</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_CELL__HEADER = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Colspan</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_CELL__COLSPAN = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Rowspan</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_CELL__ROWSPAN = ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_CELL__SCOPE = ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Headers</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_CELL__HEADERS = ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Table Cell</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_CELL_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The operation id for the '<em>Tag Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_CELL___TAG_NAME = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Table Cell</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_CELL_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.html.impl.FormImpl <em>Form</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.html.impl.FormImpl
	 * @see org.nasdanika.sdk.runtime.models.html.impl.HtmlPackageImpl#getForm()
	 * @generated
	 */
	int FORM = 63;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM__MARKERS = ELEMENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM__ID = ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM__CLASSES = ELEMENT__CLASSES;

	/**
	 * The feature id for the '<em><b>Style</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM__STYLE = ELEMENT__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM__ATTRIBUTES = ELEMENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM__CONTENTS = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM__ACTION = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM__METHOD = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Enctype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM__ENCTYPE = ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM__TARGET = ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Novalidate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM__NOVALIDATE = ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Form</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The operation id for the '<em>Tag Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM___TAG_NAME = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Form</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.html.impl.FieldsetImpl <em>Fieldset</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.html.impl.FieldsetImpl
	 * @see org.nasdanika.sdk.runtime.models.html.impl.HtmlPackageImpl#getFieldset()
	 * @generated
	 */
	int FIELDSET = 64;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELDSET__MARKERS = ELEMENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELDSET__ID = ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELDSET__CLASSES = ELEMENT__CLASSES;

	/**
	 * The feature id for the '<em><b>Style</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELDSET__STYLE = ELEMENT__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELDSET__ATTRIBUTES = ELEMENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELDSET__CONTENTS = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Disabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELDSET__DISABLED = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Legend</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELDSET__LEGEND = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Fieldset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELDSET_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Tag Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELDSET___TAG_NAME = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Fieldset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELDSET_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.html.impl.LegendImpl <em>Legend</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.html.impl.LegendImpl
	 * @see org.nasdanika.sdk.runtime.models.html.impl.HtmlPackageImpl#getLegend()
	 * @generated
	 */
	int LEGEND = 65;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGEND__MARKERS = ELEMENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGEND__ID = ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGEND__CLASSES = ELEMENT__CLASSES;

	/**
	 * The feature id for the '<em><b>Style</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGEND__STYLE = ELEMENT__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGEND__ATTRIBUTES = ELEMENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGEND__CONTENTS = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Legend</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGEND_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Tag Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGEND___TAG_NAME = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Legend</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGEND_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.html.impl.LabelImpl <em>Label</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.html.impl.LabelImpl
	 * @see org.nasdanika.sdk.runtime.models.html.impl.HtmlPackageImpl#getLabel()
	 * @generated
	 */
	int LABEL = 66;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__MARKERS = ELEMENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__ID = ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__CLASSES = ELEMENT__CLASSES;

	/**
	 * The feature id for the '<em><b>Style</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__STYLE = ELEMENT__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__ATTRIBUTES = ELEMENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__CONTENTS = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Html For</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__HTML_FOR = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Label</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Tag Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL___TAG_NAME = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Label</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.html.impl.InputImpl <em>Input</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.html.impl.InputImpl
	 * @see org.nasdanika.sdk.runtime.models.html.impl.HtmlPackageImpl#getInput()
	 * @generated
	 */
	int INPUT = 67;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__MARKERS = VOID_ELEMENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__ID = VOID_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__CLASSES = VOID_ELEMENT__CLASSES;

	/**
	 * The feature id for the '<em><b>Style</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__STYLE = VOID_ELEMENT__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__ATTRIBUTES = VOID_ELEMENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__TYPE = VOID_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__NAME = VOID_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__VALUE = VOID_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Placeholder</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__PLACEHOLDER = VOID_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__REQUIRED = VOID_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Disabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__DISABLED = VOID_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Readonly</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__READONLY = VOID_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Checked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__CHECKED = VOID_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Multiple</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__MULTIPLE = VOID_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_FEATURE_COUNT = VOID_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The operation id for the '<em>Tag Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT___TAG_NAME = VOID_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_OPERATION_COUNT = VOID_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.html.impl.ButtonImpl <em>Button</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.html.impl.ButtonImpl
	 * @see org.nasdanika.sdk.runtime.models.html.impl.HtmlPackageImpl#getButton()
	 * @generated
	 */
	int BUTTON = 68;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__MARKERS = ELEMENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__ID = ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__CLASSES = ELEMENT__CLASSES;

	/**
	 * The feature id for the '<em><b>Style</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__STYLE = ELEMENT__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__ATTRIBUTES = ELEMENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__CONTENTS = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__TYPE = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__NAME = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__VALUE = ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Disabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__DISABLED = ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Button</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Tag Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON___TAG_NAME = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Button</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.html.impl.TextAreaImpl <em>Text Area</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.html.impl.TextAreaImpl
	 * @see org.nasdanika.sdk.runtime.models.html.impl.HtmlPackageImpl#getTextArea()
	 * @generated
	 */
	int TEXT_AREA = 69;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_AREA__MARKERS = ELEMENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_AREA__ID = ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_AREA__CLASSES = ELEMENT__CLASSES;

	/**
	 * The feature id for the '<em><b>Style</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_AREA__STYLE = ELEMENT__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_AREA__ATTRIBUTES = ELEMENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_AREA__NAME = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rows</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_AREA__ROWS = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Cols</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_AREA__COLS = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Placeholder</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_AREA__PLACEHOLDER = ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_AREA__REQUIRED = ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Disabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_AREA__DISABLED = ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Readonly</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_AREA__READONLY = ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_AREA__TEXT = ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Text Area</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_AREA_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The operation id for the '<em>Tag Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_AREA___TAG_NAME = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Text Area</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_AREA_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.html.SelectItem <em>Select Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.html.SelectItem
	 * @see org.nasdanika.sdk.runtime.models.html.impl.HtmlPackageImpl#getSelectItem()
	 * @generated
	 */
	int SELECT_ITEM = 70;

	/**
	 * The number of structural features of the '<em>Select Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_ITEM_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Select Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_ITEM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.html.impl.SelectImpl <em>Select</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.html.impl.SelectImpl
	 * @see org.nasdanika.sdk.runtime.models.html.impl.HtmlPackageImpl#getSelect()
	 * @generated
	 */
	int SELECT = 71;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT__MARKERS = ELEMENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT__ID = ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT__CLASSES = ELEMENT__CLASSES;

	/**
	 * The feature id for the '<em><b>Style</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT__STYLE = ELEMENT__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT__ATTRIBUTES = ELEMENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT__NAME = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Multiple</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT__MULTIPLE = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT__REQUIRED = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Disabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT__DISABLED = ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT__SIZE = ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT__ITEMS = ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Select</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The operation id for the '<em>Tag Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT___TAG_NAME = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Select</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.html.impl.OptionImpl <em>Option</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.html.impl.OptionImpl
	 * @see org.nasdanika.sdk.runtime.models.html.impl.HtmlPackageImpl#getOption()
	 * @generated
	 */
	int OPTION = 72;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION__MARKERS = ELEMENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION__ID = ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION__CLASSES = ELEMENT__CLASSES;

	/**
	 * The feature id for the '<em><b>Style</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION__STYLE = ELEMENT__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION__ATTRIBUTES = ELEMENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION__VALUE = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION__LABEL = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION__SELECTED = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Disabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION__DISABLED = ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION__TEXT = ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Option</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Tag Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION___TAG_NAME = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Option</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.html.impl.OptionGroupImpl <em>Option Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.html.impl.OptionGroupImpl
	 * @see org.nasdanika.sdk.runtime.models.html.impl.HtmlPackageImpl#getOptionGroup()
	 * @generated
	 */
	int OPTION_GROUP = 73;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION_GROUP__MARKERS = ELEMENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION_GROUP__ID = ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION_GROUP__CLASSES = ELEMENT__CLASSES;

	/**
	 * The feature id for the '<em><b>Style</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION_GROUP__STYLE = ELEMENT__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION_GROUP__ATTRIBUTES = ELEMENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION_GROUP__LABEL = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Disabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION_GROUP__DISABLED = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Options</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION_GROUP__OPTIONS = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Option Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION_GROUP_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Tag Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION_GROUP___TAG_NAME = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Option Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION_GROUP_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.html.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.Node
	 * @generated
	 */
	EClass getNode();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.html.Text <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.Text
	 * @generated
	 */
	EClass getText();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.html.Text#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.Text#getContent()
	 * @see #getText()
	 * @generated
	 */
	EAttribute getText_Content();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.html.Markup <em>Markup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Markup</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.Markup
	 * @generated
	 */
	EClass getMarkup();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.html.Markup#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.Markup#getContent()
	 * @see #getMarkup()
	 * @generated
	 */
	EAttribute getMarkup_Content();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.html.Comment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Comment</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.Comment
	 * @generated
	 */
	EClass getComment();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.html.Comment#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.Comment#getContent()
	 * @see #getComment()
	 * @generated
	 */
	EAttribute getComment_Content();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.html.NodeReference <em>Node Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node Reference</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.NodeReference
	 * @generated
	 */
	EClass getNodeReference();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.sdk.runtime.models.html.NodeReference#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.NodeReference#getTarget()
	 * @see #getNodeReference()
	 * @generated
	 */
	EReference getNodeReference_Target();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.html.Container <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Container</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.Container
	 * @generated
	 */
	EClass getContainer();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.sdk.runtime.models.html.Container#getContents <em>Contents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contents</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.Container#getContents()
	 * @see #getContainer()
	 * @generated
	 */
	EReference getContainer_Contents();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.html.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.Element
	 * @generated
	 */
	EClass getElement();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.html.Element#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.Element#getId()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Id();

	/**
	 * Returns the meta object for the attribute list '{@link org.nasdanika.sdk.runtime.models.html.Element#getClasses <em>Classes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Classes</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.Element#getClasses()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Classes();

	/**
	 * Returns the meta object for the map '{@link org.nasdanika.sdk.runtime.models.html.Element#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Style</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.Element#getStyle()
	 * @see #getElement()
	 * @generated
	 */
	EReference getElement_Style();

	/**
	 * Returns the meta object for the map '{@link org.nasdanika.sdk.runtime.models.html.Element#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Attributes</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.Element#getAttributes()
	 * @see #getElement()
	 * @generated
	 */
	EReference getElement_Attributes();

	/**
	 * Returns the meta object for the '{@link org.nasdanika.sdk.runtime.models.html.Element#tagName() <em>Tag Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Tag Name</em>' operation.
	 * @see org.nasdanika.sdk.runtime.models.html.Element#tagName()
	 * @generated
	 */
	EOperation getElement__TagName();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.html.VoidElement <em>Void Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Void Element</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.VoidElement
	 * @generated
	 */
	EClass getVoidElement();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.html.GenericElement <em>Generic Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Generic Element</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.GenericElement
	 * @generated
	 */
	EClass getGenericElement();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.html.GenericElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.GenericElement#getName()
	 * @see #getGenericElement()
	 * @generated
	 */
	EAttribute getGenericElement_Name();

	/**
	 * Returns the meta object for the '{@link org.nasdanika.sdk.runtime.models.html.GenericElement#tagName() <em>Tag Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Tag Name</em>' operation.
	 * @see org.nasdanika.sdk.runtime.models.html.GenericElement#tagName()
	 * @generated
	 */
	EOperation getGenericElement__TagName();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.html.GenericVoidElement <em>Generic Void Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Generic Void Element</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.GenericVoidElement
	 * @generated
	 */
	EClass getGenericVoidElement();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.html.GenericVoidElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.GenericVoidElement#getName()
	 * @see #getGenericVoidElement()
	 * @generated
	 */
	EAttribute getGenericVoidElement_Name();

	/**
	 * Returns the meta object for the '{@link org.nasdanika.sdk.runtime.models.html.GenericVoidElement#tagName() <em>Tag Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Tag Name</em>' operation.
	 * @see org.nasdanika.sdk.runtime.models.html.GenericVoidElement#tagName()
	 * @generated
	 */
	EOperation getGenericVoidElement__TagName();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.html.LibraryElement <em>Library Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Library Element</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.LibraryElement
	 * @generated
	 */
	EClass getLibraryElement();

	/**
	 * Returns the meta object for the '{@link org.nasdanika.sdk.runtime.models.html.LibraryElement#tagName() <em>Tag Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Tag Name</em>' operation.
	 * @see org.nasdanika.sdk.runtime.models.html.LibraryElement#tagName()
	 * @generated
	 */
	EOperation getLibraryElement__TagName();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.html.Document <em>Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.Document
	 * @generated
	 */
	EClass getDocument();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.html.Document#getDoctype <em>Doctype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Doctype</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.Document#getDoctype()
	 * @see #getDocument()
	 * @generated
	 */
	EAttribute getDocument_Doctype();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.html.Document#getLang <em>Lang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.Document#getLang()
	 * @see #getDocument()
	 * @generated
	 */
	EAttribute getDocument_Lang();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.sdk.runtime.models.html.Document#getHead <em>Head</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Head</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.Document#getHead()
	 * @see #getDocument()
	 * @generated
	 */
	EReference getDocument_Head();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.sdk.runtime.models.html.Document#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Body</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.Document#getBody()
	 * @see #getDocument()
	 * @generated
	 */
	EReference getDocument_Body();

	/**
	 * Returns the meta object for the '{@link org.nasdanika.sdk.runtime.models.html.Document#tagName() <em>Tag Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Tag Name</em>' operation.
	 * @see org.nasdanika.sdk.runtime.models.html.Document#tagName()
	 * @generated
	 */
	EOperation getDocument__TagName();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.html.Head <em>Head</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Head</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.Head
	 * @generated
	 */
	EClass getHead();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.html.Head#getCharset <em>Charset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Charset</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.Head#getCharset()
	 * @see #getHead()
	 * @generated
	 */
	EAttribute getHead_Charset();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.html.Head#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.Head#getTitle()
	 * @see #getHead()
	 * @generated
	 */
	EAttribute getHead_Title();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.html.Head#getBase <em>Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Base</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.Head#getBase()
	 * @see #getHead()
	 * @generated
	 */
	EAttribute getHead_Base();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.sdk.runtime.models.html.Head#getMetas <em>Metas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Metas</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.Head#getMetas()
	 * @see #getHead()
	 * @generated
	 */
	EReference getHead_Metas();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.sdk.runtime.models.html.Head#getLinks <em>Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Links</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.Head#getLinks()
	 * @see #getHead()
	 * @generated
	 */
	EReference getHead_Links();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.sdk.runtime.models.html.Head#getStylesheets <em>Stylesheets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Stylesheets</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.Head#getStylesheets()
	 * @see #getHead()
	 * @generated
	 */
	EReference getHead_Stylesheets();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.sdk.runtime.models.html.Head#getImportMap <em>Import Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Import Map</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.Head#getImportMap()
	 * @see #getHead()
	 * @generated
	 */
	EReference getHead_ImportMap();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.sdk.runtime.models.html.Head#getScripts <em>Scripts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Scripts</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.Head#getScripts()
	 * @see #getHead()
	 * @generated
	 */
	EReference getHead_Scripts();

	/**
	 * Returns the meta object for the '{@link org.nasdanika.sdk.runtime.models.html.Head#tagName() <em>Tag Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Tag Name</em>' operation.
	 * @see org.nasdanika.sdk.runtime.models.html.Head#tagName()
	 * @generated
	 */
	EOperation getHead__TagName();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.html.Body <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Body</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.Body
	 * @generated
	 */
	EClass getBody();

	/**
	 * Returns the meta object for the '{@link org.nasdanika.sdk.runtime.models.html.Body#tagName() <em>Tag Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Tag Name</em>' operation.
	 * @see org.nasdanika.sdk.runtime.models.html.Body#tagName()
	 * @generated
	 */
	EOperation getBody__TagName();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.html.Meta <em>Meta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Meta</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.Meta
	 * @generated
	 */
	EClass getMeta();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.html.Meta#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.Meta#getName()
	 * @see #getMeta()
	 * @generated
	 */
	EAttribute getMeta_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.html.Meta#getHttpEquiv <em>Http Equiv</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Http Equiv</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.Meta#getHttpEquiv()
	 * @see #getMeta()
	 * @generated
	 */
	EAttribute getMeta_HttpEquiv();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.html.Meta#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Property</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.Meta#getProperty()
	 * @see #getMeta()
	 * @generated
	 */
	EAttribute getMeta_Property();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.html.Meta#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.Meta#getContent()
	 * @see #getMeta()
	 * @generated
	 */
	EAttribute getMeta_Content();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.html.Meta#getCharset <em>Charset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Charset</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.Meta#getCharset()
	 * @see #getMeta()
	 * @generated
	 */
	EAttribute getMeta_Charset();

	/**
	 * Returns the meta object for the '{@link org.nasdanika.sdk.runtime.models.html.Meta#tagName() <em>Tag Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Tag Name</em>' operation.
	 * @see org.nasdanika.sdk.runtime.models.html.Meta#tagName()
	 * @generated
	 */
	EOperation getMeta__TagName();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.html.Link <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Link</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.Link
	 * @generated
	 */
	EClass getLink();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.html.Link#getRel <em>Rel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rel</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.Link#getRel()
	 * @see #getLink()
	 * @generated
	 */
	EAttribute getLink_Rel();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.html.Link#getHref <em>Href</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Href</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.Link#getHref()
	 * @see #getLink()
	 * @generated
	 */
	EAttribute getLink_Href();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.html.Link#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.Link#getType()
	 * @see #getLink()
	 * @generated
	 */
	EAttribute getLink_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.html.Link#getMedia <em>Media</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Media</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.Link#getMedia()
	 * @see #getLink()
	 * @generated
	 */
	EAttribute getLink_Media();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.html.Link#getSizes <em>Sizes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sizes</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.Link#getSizes()
	 * @see #getLink()
	 * @generated
	 */
	EAttribute getLink_Sizes();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.html.Link#getCrossorigin <em>Crossorigin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Crossorigin</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.Link#getCrossorigin()
	 * @see #getLink()
	 * @generated
	 */
	EAttribute getLink_Crossorigin();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.html.Link#getIntegrity <em>Integrity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Integrity</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.Link#getIntegrity()
	 * @see #getLink()
	 * @generated
	 */
	EAttribute getLink_Integrity();

	/**
	 * Returns the meta object for the '{@link org.nasdanika.sdk.runtime.models.html.Link#tagName() <em>Tag Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Tag Name</em>' operation.
	 * @see org.nasdanika.sdk.runtime.models.html.Link#tagName()
	 * @generated
	 */
	EOperation getLink__TagName();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.html.Stylesheet <em>Stylesheet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stylesheet</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.Stylesheet
	 * @generated
	 */
	EClass getStylesheet();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.html.Stylesheet#getHref <em>Href</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Href</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.Stylesheet#getHref()
	 * @see #getStylesheet()
	 * @generated
	 */
	EAttribute getStylesheet_Href();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.html.Stylesheet#getMedia <em>Media</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Media</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.Stylesheet#getMedia()
	 * @see #getStylesheet()
	 * @generated
	 */
	EAttribute getStylesheet_Media();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.html.Stylesheet#getCrossorigin <em>Crossorigin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Crossorigin</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.Stylesheet#getCrossorigin()
	 * @see #getStylesheet()
	 * @generated
	 */
	EAttribute getStylesheet_Crossorigin();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.html.Stylesheet#getIntegrity <em>Integrity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Integrity</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.Stylesheet#getIntegrity()
	 * @see #getStylesheet()
	 * @generated
	 */
	EAttribute getStylesheet_Integrity();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.html.Stylesheet#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.Stylesheet#getContent()
	 * @see #getStylesheet()
	 * @generated
	 */
	EAttribute getStylesheet_Content();

	/**
	 * Returns the meta object for the '{@link org.nasdanika.sdk.runtime.models.html.Stylesheet#tagName() <em>Tag Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Tag Name</em>' operation.
	 * @see org.nasdanika.sdk.runtime.models.html.Stylesheet#tagName()
	 * @generated
	 */
	EOperation getStylesheet__TagName();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.html.Script <em>Script</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Script</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.Script
	 * @generated
	 */
	EClass getScript();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.html.Script#getSrc <em>Src</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Src</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.Script#getSrc()
	 * @see #getScript()
	 * @generated
	 */
	EAttribute getScript_Src();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.html.Script#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.Script#getType()
	 * @see #getScript()
	 * @generated
	 */
	EAttribute getScript_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.html.Script#isModule <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Module</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.Script#isModule()
	 * @see #getScript()
	 * @generated
	 */
	EAttribute getScript_Module();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.html.Script#isAsync <em>Async</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Async</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.Script#isAsync()
	 * @see #getScript()
	 * @generated
	 */
	EAttribute getScript_Async();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.html.Script#isDefer <em>Defer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Defer</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.Script#isDefer()
	 * @see #getScript()
	 * @generated
	 */
	EAttribute getScript_Defer();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.html.Script#getCrossorigin <em>Crossorigin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Crossorigin</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.Script#getCrossorigin()
	 * @see #getScript()
	 * @generated
	 */
	EAttribute getScript_Crossorigin();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.html.Script#getIntegrity <em>Integrity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Integrity</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.Script#getIntegrity()
	 * @see #getScript()
	 * @generated
	 */
	EAttribute getScript_Integrity();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.html.Script#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.Script#getContent()
	 * @see #getScript()
	 * @generated
	 */
	EAttribute getScript_Content();

	/**
	 * Returns the meta object for the '{@link org.nasdanika.sdk.runtime.models.html.Script#tagName() <em>Tag Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Tag Name</em>' operation.
	 * @see org.nasdanika.sdk.runtime.models.html.Script#tagName()
	 * @generated
	 */
	EOperation getScript__TagName();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.html.ImportMap <em>Import Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Import Map</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.ImportMap
	 * @generated
	 */
	EClass getImportMap();

	/**
	 * Returns the meta object for the map '{@link org.nasdanika.sdk.runtime.models.html.ImportMap#getImports <em>Imports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Imports</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.ImportMap#getImports()
	 * @see #getImportMap()
	 * @generated
	 */
	EReference getImportMap_Imports();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.sdk.runtime.models.html.ImportMap#getScopes <em>Scopes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Scopes</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.ImportMap#getScopes()
	 * @see #getImportMap()
	 * @generated
	 */
	EReference getImportMap_Scopes();

	/**
	 * Returns the meta object for the '{@link org.nasdanika.sdk.runtime.models.html.ImportMap#tagName() <em>Tag Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Tag Name</em>' operation.
	 * @see org.nasdanika.sdk.runtime.models.html.ImportMap#tagName()
	 * @generated
	 */
	EOperation getImportMap__TagName();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.html.ImportMapScope <em>Import Map Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Import Map Scope</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.ImportMapScope
	 * @generated
	 */
	EClass getImportMapScope();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.html.ImportMapScope#getPrefix <em>Prefix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Prefix</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.ImportMapScope#getPrefix()
	 * @see #getImportMapScope()
	 * @generated
	 */
	EAttribute getImportMapScope_Prefix();

	/**
	 * Returns the meta object for the map '{@link org.nasdanika.sdk.runtime.models.html.ImportMapScope#getImports <em>Imports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Imports</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.ImportMapScope#getImports()
	 * @see #getImportMapScope()
	 * @generated
	 */
	EReference getImportMapScope_Imports();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.html.Div <em>Div</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Div</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.Div
	 * @generated
	 */
	EClass getDiv();

	/**
	 * Returns the meta object for the '{@link org.nasdanika.sdk.runtime.models.html.Div#tagName() <em>Tag Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Tag Name</em>' operation.
	 * @see org.nasdanika.sdk.runtime.models.html.Div#tagName()
	 * @generated
	 */
	EOperation getDiv__TagName();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.html.Span <em>Span</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Span</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.Span
	 * @generated
	 */
	EClass getSpan();

	/**
	 * Returns the meta object for the '{@link org.nasdanika.sdk.runtime.models.html.Span#tagName() <em>Tag Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Tag Name</em>' operation.
	 * @see org.nasdanika.sdk.runtime.models.html.Span#tagName()
	 * @generated
	 */
	EOperation getSpan__TagName();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.html.Paragraph <em>Paragraph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Paragraph</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.Paragraph
	 * @generated
	 */
	EClass getParagraph();

	/**
	 * Returns the meta object for the '{@link org.nasdanika.sdk.runtime.models.html.Paragraph#tagName() <em>Tag Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Tag Name</em>' operation.
	 * @see org.nasdanika.sdk.runtime.models.html.Paragraph#tagName()
	 * @generated
	 */
	EOperation getParagraph__TagName();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.html.Heading <em>Heading</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Heading</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.Heading
	 * @generated
	 */
	EClass getHeading();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.html.Heading#getLevel <em>Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Level</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.Heading#getLevel()
	 * @see #getHeading()
	 * @generated
	 */
	EAttribute getHeading_Level();

	/**
	 * Returns the meta object for the '{@link org.nasdanika.sdk.runtime.models.html.Heading#tagName() <em>Tag Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Tag Name</em>' operation.
	 * @see org.nasdanika.sdk.runtime.models.html.Heading#tagName()
	 * @generated
	 */
	EOperation getHeading__TagName();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.html.Header <em>Header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Header</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.Header
	 * @generated
	 */
	EClass getHeader();

	/**
	 * Returns the meta object for the '{@link org.nasdanika.sdk.runtime.models.html.Header#tagName() <em>Tag Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Tag Name</em>' operation.
	 * @see org.nasdanika.sdk.runtime.models.html.Header#tagName()
	 * @generated
	 */
	EOperation getHeader__TagName();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.html.Footer <em>Footer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Footer</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.Footer
	 * @generated
	 */
	EClass getFooter();

	/**
	 * Returns the meta object for the '{@link org.nasdanika.sdk.runtime.models.html.Footer#tagName() <em>Tag Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Tag Name</em>' operation.
	 * @see org.nasdanika.sdk.runtime.models.html.Footer#tagName()
	 * @generated
	 */
	EOperation getFooter__TagName();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.html.Main <em>Main</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Main</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.Main
	 * @generated
	 */
	EClass getMain();

	/**
	 * Returns the meta object for the '{@link org.nasdanika.sdk.runtime.models.html.Main#tagName() <em>Tag Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Tag Name</em>' operation.
	 * @see org.nasdanika.sdk.runtime.models.html.Main#tagName()
	 * @generated
	 */
	EOperation getMain__TagName();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.html.Nav <em>Nav</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Nav</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.Nav
	 * @generated
	 */
	EClass getNav();

	/**
	 * Returns the meta object for the '{@link org.nasdanika.sdk.runtime.models.html.Nav#tagName() <em>Tag Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Tag Name</em>' operation.
	 * @see org.nasdanika.sdk.runtime.models.html.Nav#tagName()
	 * @generated
	 */
	EOperation getNav__TagName();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.html.Section <em>Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Section</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.Section
	 * @generated
	 */
	EClass getSection();

	/**
	 * Returns the meta object for the '{@link org.nasdanika.sdk.runtime.models.html.Section#tagName() <em>Tag Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Tag Name</em>' operation.
	 * @see org.nasdanika.sdk.runtime.models.html.Section#tagName()
	 * @generated
	 */
	EOperation getSection__TagName();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.html.Article <em>Article</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Article</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.Article
	 * @generated
	 */
	EClass getArticle();

	/**
	 * Returns the meta object for the '{@link org.nasdanika.sdk.runtime.models.html.Article#tagName() <em>Tag Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Tag Name</em>' operation.
	 * @see org.nasdanika.sdk.runtime.models.html.Article#tagName()
	 * @generated
	 */
	EOperation getArticle__TagName();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.html.Aside <em>Aside</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Aside</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.Aside
	 * @generated
	 */
	EClass getAside();

	/**
	 * Returns the meta object for the '{@link org.nasdanika.sdk.runtime.models.html.Aside#tagName() <em>Tag Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Tag Name</em>' operation.
	 * @see org.nasdanika.sdk.runtime.models.html.Aside#tagName()
	 * @generated
	 */
	EOperation getAside__TagName();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.html.Blockquote <em>Blockquote</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Blockquote</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.Blockquote
	 * @generated
	 */
	EClass getBlockquote();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.html.Blockquote#getCite <em>Cite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cite</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.Blockquote#getCite()
	 * @see #getBlockquote()
	 * @generated
	 */
	EAttribute getBlockquote_Cite();

	/**
	 * Returns the meta object for the '{@link org.nasdanika.sdk.runtime.models.html.Blockquote#tagName() <em>Tag Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Tag Name</em>' operation.
	 * @see org.nasdanika.sdk.runtime.models.html.Blockquote#tagName()
	 * @generated
	 */
	EOperation getBlockquote__TagName();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.html.Pre <em>Pre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pre</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.Pre
	 * @generated
	 */
	EClass getPre();

	/**
	 * Returns the meta object for the '{@link org.nasdanika.sdk.runtime.models.html.Pre#tagName() <em>Tag Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Tag Name</em>' operation.
	 * @see org.nasdanika.sdk.runtime.models.html.Pre#tagName()
	 * @generated
	 */
	EOperation getPre__TagName();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.html.Figure <em>Figure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Figure</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.Figure
	 * @generated
	 */
	EClass getFigure();

	/**
	 * Returns the meta object for the '{@link org.nasdanika.sdk.runtime.models.html.Figure#tagName() <em>Tag Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Tag Name</em>' operation.
	 * @see org.nasdanika.sdk.runtime.models.html.Figure#tagName()
	 * @generated
	 */
	EOperation getFigure__TagName();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.html.FigureCaption <em>Figure Caption</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Figure Caption</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.FigureCaption
	 * @generated
	 */
	EClass getFigureCaption();

	/**
	 * Returns the meta object for the '{@link org.nasdanika.sdk.runtime.models.html.FigureCaption#tagName() <em>Tag Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Tag Name</em>' operation.
	 * @see org.nasdanika.sdk.runtime.models.html.FigureCaption#tagName()
	 * @generated
	 */
	EOperation getFigureCaption__TagName();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.html.Details <em>Details</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Details</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.Details
	 * @generated
	 */
	EClass getDetails();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.html.Details#isOpen <em>Open</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Open</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.Details#isOpen()
	 * @see #getDetails()
	 * @generated
	 */
	EAttribute getDetails_Open();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.sdk.runtime.models.html.Details#getSummary <em>Summary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Summary</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.Details#getSummary()
	 * @see #getDetails()
	 * @generated
	 */
	EReference getDetails_Summary();

	/**
	 * Returns the meta object for the '{@link org.nasdanika.sdk.runtime.models.html.Details#tagName() <em>Tag Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Tag Name</em>' operation.
	 * @see org.nasdanika.sdk.runtime.models.html.Details#tagName()
	 * @generated
	 */
	EOperation getDetails__TagName();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.html.Summary <em>Summary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Summary</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.Summary
	 * @generated
	 */
	EClass getSummary();

	/**
	 * Returns the meta object for the '{@link org.nasdanika.sdk.runtime.models.html.Summary#tagName() <em>Tag Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Tag Name</em>' operation.
	 * @see org.nasdanika.sdk.runtime.models.html.Summary#tagName()
	 * @generated
	 */
	EOperation getSummary__TagName();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.html.HorizontalRule <em>Horizontal Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Horizontal Rule</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.HorizontalRule
	 * @generated
	 */
	EClass getHorizontalRule();

	/**
	 * Returns the meta object for the '{@link org.nasdanika.sdk.runtime.models.html.HorizontalRule#tagName() <em>Tag Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Tag Name</em>' operation.
	 * @see org.nasdanika.sdk.runtime.models.html.HorizontalRule#tagName()
	 * @generated
	 */
	EOperation getHorizontalRule__TagName();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.html.LineBreak <em>Line Break</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Line Break</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.LineBreak
	 * @generated
	 */
	EClass getLineBreak();

	/**
	 * Returns the meta object for the '{@link org.nasdanika.sdk.runtime.models.html.LineBreak#tagName() <em>Tag Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Tag Name</em>' operation.
	 * @see org.nasdanika.sdk.runtime.models.html.LineBreak#tagName()
	 * @generated
	 */
	EOperation getLineBreak__TagName();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.html.Anchor <em>Anchor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Anchor</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.Anchor
	 * @generated
	 */
	EClass getAnchor();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.html.Anchor#getHref <em>Href</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Href</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.Anchor#getHref()
	 * @see #getAnchor()
	 * @generated
	 */
	EAttribute getAnchor_Href();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.html.Anchor#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.Anchor#getTarget()
	 * @see #getAnchor()
	 * @generated
	 */
	EAttribute getAnchor_Target();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.html.Anchor#getRel <em>Rel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rel</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.Anchor#getRel()
	 * @see #getAnchor()
	 * @generated
	 */
	EAttribute getAnchor_Rel();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.html.Anchor#getDownload <em>Download</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Download</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.Anchor#getDownload()
	 * @see #getAnchor()
	 * @generated
	 */
	EAttribute getAnchor_Download();

	/**
	 * Returns the meta object for the '{@link org.nasdanika.sdk.runtime.models.html.Anchor#tagName() <em>Tag Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Tag Name</em>' operation.
	 * @see org.nasdanika.sdk.runtime.models.html.Anchor#tagName()
	 * @generated
	 */
	EOperation getAnchor__TagName();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.html.Strong <em>Strong</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Strong</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.Strong
	 * @generated
	 */
	EClass getStrong();

	/**
	 * Returns the meta object for the '{@link org.nasdanika.sdk.runtime.models.html.Strong#tagName() <em>Tag Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Tag Name</em>' operation.
	 * @see org.nasdanika.sdk.runtime.models.html.Strong#tagName()
	 * @generated
	 */
	EOperation getStrong__TagName();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.html.Emphasis <em>Emphasis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Emphasis</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.Emphasis
	 * @generated
	 */
	EClass getEmphasis();

	/**
	 * Returns the meta object for the '{@link org.nasdanika.sdk.runtime.models.html.Emphasis#tagName() <em>Tag Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Tag Name</em>' operation.
	 * @see org.nasdanika.sdk.runtime.models.html.Emphasis#tagName()
	 * @generated
	 */
	EOperation getEmphasis__TagName();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.html.Code <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Code</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.Code
	 * @generated
	 */
	EClass getCode();

	/**
	 * Returns the meta object for the '{@link org.nasdanika.sdk.runtime.models.html.Code#tagName() <em>Tag Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Tag Name</em>' operation.
	 * @see org.nasdanika.sdk.runtime.models.html.Code#tagName()
	 * @generated
	 */
	EOperation getCode__TagName();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.html.Image <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Image</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.Image
	 * @generated
	 */
	EClass getImage();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.html.Image#getSrc <em>Src</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Src</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.Image#getSrc()
	 * @see #getImage()
	 * @generated
	 */
	EAttribute getImage_Src();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.html.Image#getAlt <em>Alt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alt</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.Image#getAlt()
	 * @see #getImage()
	 * @generated
	 */
	EAttribute getImage_Alt();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.html.Image#getSrcset <em>Srcset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Srcset</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.Image#getSrcset()
	 * @see #getImage()
	 * @generated
	 */
	EAttribute getImage_Srcset();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.html.Image#getSizes <em>Sizes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sizes</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.Image#getSizes()
	 * @see #getImage()
	 * @generated
	 */
	EAttribute getImage_Sizes();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.html.Image#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.Image#getWidth()
	 * @see #getImage()
	 * @generated
	 */
	EAttribute getImage_Width();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.html.Image#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.Image#getHeight()
	 * @see #getImage()
	 * @generated
	 */
	EAttribute getImage_Height();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.html.Image#getLoading <em>Loading</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Loading</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.Image#getLoading()
	 * @see #getImage()
	 * @generated
	 */
	EAttribute getImage_Loading();

	/**
	 * Returns the meta object for the '{@link org.nasdanika.sdk.runtime.models.html.Image#tagName() <em>Tag Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Tag Name</em>' operation.
	 * @see org.nasdanika.sdk.runtime.models.html.Image#tagName()
	 * @generated
	 */
	EOperation getImage__TagName();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.html.InlineFrame <em>Inline Frame</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inline Frame</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.InlineFrame
	 * @generated
	 */
	EClass getInlineFrame();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.html.InlineFrame#getSrc <em>Src</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Src</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.InlineFrame#getSrc()
	 * @see #getInlineFrame()
	 * @generated
	 */
	EAttribute getInlineFrame_Src();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.html.InlineFrame#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.InlineFrame#getTitle()
	 * @see #getInlineFrame()
	 * @generated
	 */
	EAttribute getInlineFrame_Title();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.html.InlineFrame#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.InlineFrame#getWidth()
	 * @see #getInlineFrame()
	 * @generated
	 */
	EAttribute getInlineFrame_Width();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.html.InlineFrame#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.InlineFrame#getHeight()
	 * @see #getInlineFrame()
	 * @generated
	 */
	EAttribute getInlineFrame_Height();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.html.InlineFrame#getAllow <em>Allow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Allow</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.InlineFrame#getAllow()
	 * @see #getInlineFrame()
	 * @generated
	 */
	EAttribute getInlineFrame_Allow();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.html.InlineFrame#getLoading <em>Loading</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Loading</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.InlineFrame#getLoading()
	 * @see #getInlineFrame()
	 * @generated
	 */
	EAttribute getInlineFrame_Loading();

	/**
	 * Returns the meta object for the '{@link org.nasdanika.sdk.runtime.models.html.InlineFrame#tagName() <em>Tag Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Tag Name</em>' operation.
	 * @see org.nasdanika.sdk.runtime.models.html.InlineFrame#tagName()
	 * @generated
	 */
	EOperation getInlineFrame__TagName();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.html.ItemList <em>Item List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Item List</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.ItemList
	 * @generated
	 */
	EClass getItemList();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.sdk.runtime.models.html.ItemList#getItems <em>Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Items</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.ItemList#getItems()
	 * @see #getItemList()
	 * @generated
	 */
	EReference getItemList_Items();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.html.UnorderedList <em>Unordered List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unordered List</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.UnorderedList
	 * @generated
	 */
	EClass getUnorderedList();

	/**
	 * Returns the meta object for the '{@link org.nasdanika.sdk.runtime.models.html.UnorderedList#tagName() <em>Tag Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Tag Name</em>' operation.
	 * @see org.nasdanika.sdk.runtime.models.html.UnorderedList#tagName()
	 * @generated
	 */
	EOperation getUnorderedList__TagName();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.html.OrderedList <em>Ordered List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ordered List</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.OrderedList
	 * @generated
	 */
	EClass getOrderedList();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.html.OrderedList#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.OrderedList#getStart()
	 * @see #getOrderedList()
	 * @generated
	 */
	EAttribute getOrderedList_Start();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.html.OrderedList#isReversed <em>Reversed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reversed</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.OrderedList#isReversed()
	 * @see #getOrderedList()
	 * @generated
	 */
	EAttribute getOrderedList_Reversed();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.html.OrderedList#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.OrderedList#getType()
	 * @see #getOrderedList()
	 * @generated
	 */
	EAttribute getOrderedList_Type();

	/**
	 * Returns the meta object for the '{@link org.nasdanika.sdk.runtime.models.html.OrderedList#tagName() <em>Tag Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Tag Name</em>' operation.
	 * @see org.nasdanika.sdk.runtime.models.html.OrderedList#tagName()
	 * @generated
	 */
	EOperation getOrderedList__TagName();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.html.ListItem <em>List Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>List Item</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.ListItem
	 * @generated
	 */
	EClass getListItem();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.html.ListItem#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.ListItem#getValue()
	 * @see #getListItem()
	 * @generated
	 */
	EAttribute getListItem_Value();

	/**
	 * Returns the meta object for the '{@link org.nasdanika.sdk.runtime.models.html.ListItem#tagName() <em>Tag Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Tag Name</em>' operation.
	 * @see org.nasdanika.sdk.runtime.models.html.ListItem#tagName()
	 * @generated
	 */
	EOperation getListItem__TagName();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.html.DescriptionListItem <em>Description List Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Description List Item</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.DescriptionListItem
	 * @generated
	 */
	EClass getDescriptionListItem();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.html.DescriptionList <em>Description List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Description List</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.DescriptionList
	 * @generated
	 */
	EClass getDescriptionList();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.sdk.runtime.models.html.DescriptionList#getItems <em>Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Items</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.DescriptionList#getItems()
	 * @see #getDescriptionList()
	 * @generated
	 */
	EReference getDescriptionList_Items();

	/**
	 * Returns the meta object for the '{@link org.nasdanika.sdk.runtime.models.html.DescriptionList#tagName() <em>Tag Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Tag Name</em>' operation.
	 * @see org.nasdanika.sdk.runtime.models.html.DescriptionList#tagName()
	 * @generated
	 */
	EOperation getDescriptionList__TagName();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.html.DescriptionTerm <em>Description Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Description Term</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.DescriptionTerm
	 * @generated
	 */
	EClass getDescriptionTerm();

	/**
	 * Returns the meta object for the '{@link org.nasdanika.sdk.runtime.models.html.DescriptionTerm#tagName() <em>Tag Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Tag Name</em>' operation.
	 * @see org.nasdanika.sdk.runtime.models.html.DescriptionTerm#tagName()
	 * @generated
	 */
	EOperation getDescriptionTerm__TagName();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.html.DescriptionDetails <em>Description Details</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Description Details</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.DescriptionDetails
	 * @generated
	 */
	EClass getDescriptionDetails();

	/**
	 * Returns the meta object for the '{@link org.nasdanika.sdk.runtime.models.html.DescriptionDetails#tagName() <em>Tag Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Tag Name</em>' operation.
	 * @see org.nasdanika.sdk.runtime.models.html.DescriptionDetails#tagName()
	 * @generated
	 */
	EOperation getDescriptionDetails__TagName();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.html.Table <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.Table
	 * @generated
	 */
	EClass getTable();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.sdk.runtime.models.html.Table#getCaption <em>Caption</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Caption</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.Table#getCaption()
	 * @see #getTable()
	 * @generated
	 */
	EReference getTable_Caption();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.sdk.runtime.models.html.Table#getColumnGroups <em>Column Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Column Groups</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.Table#getColumnGroups()
	 * @see #getTable()
	 * @generated
	 */
	EReference getTable_ColumnGroups();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.sdk.runtime.models.html.Table#getHead <em>Head</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Head</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.Table#getHead()
	 * @see #getTable()
	 * @generated
	 */
	EReference getTable_Head();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.sdk.runtime.models.html.Table#getBodies <em>Bodies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bodies</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.Table#getBodies()
	 * @see #getTable()
	 * @generated
	 */
	EReference getTable_Bodies();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.sdk.runtime.models.html.Table#getFoot <em>Foot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Foot</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.Table#getFoot()
	 * @see #getTable()
	 * @generated
	 */
	EReference getTable_Foot();

	/**
	 * Returns the meta object for the '{@link org.nasdanika.sdk.runtime.models.html.Table#tagName() <em>Tag Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Tag Name</em>' operation.
	 * @see org.nasdanika.sdk.runtime.models.html.Table#tagName()
	 * @generated
	 */
	EOperation getTable__TagName();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.html.Caption <em>Caption</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Caption</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.Caption
	 * @generated
	 */
	EClass getCaption();

	/**
	 * Returns the meta object for the '{@link org.nasdanika.sdk.runtime.models.html.Caption#tagName() <em>Tag Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Tag Name</em>' operation.
	 * @see org.nasdanika.sdk.runtime.models.html.Caption#tagName()
	 * @generated
	 */
	EOperation getCaption__TagName();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.html.ColumnGroup <em>Column Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Column Group</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.ColumnGroup
	 * @generated
	 */
	EClass getColumnGroup();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.html.ColumnGroup#getSpan <em>Span</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Span</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.ColumnGroup#getSpan()
	 * @see #getColumnGroup()
	 * @generated
	 */
	EAttribute getColumnGroup_Span();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.sdk.runtime.models.html.ColumnGroup#getColumns <em>Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Columns</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.ColumnGroup#getColumns()
	 * @see #getColumnGroup()
	 * @generated
	 */
	EReference getColumnGroup_Columns();

	/**
	 * Returns the meta object for the '{@link org.nasdanika.sdk.runtime.models.html.ColumnGroup#tagName() <em>Tag Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Tag Name</em>' operation.
	 * @see org.nasdanika.sdk.runtime.models.html.ColumnGroup#tagName()
	 * @generated
	 */
	EOperation getColumnGroup__TagName();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.html.Column <em>Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Column</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.Column
	 * @generated
	 */
	EClass getColumn();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.html.Column#getSpan <em>Span</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Span</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.Column#getSpan()
	 * @see #getColumn()
	 * @generated
	 */
	EAttribute getColumn_Span();

	/**
	 * Returns the meta object for the '{@link org.nasdanika.sdk.runtime.models.html.Column#tagName() <em>Tag Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Tag Name</em>' operation.
	 * @see org.nasdanika.sdk.runtime.models.html.Column#tagName()
	 * @generated
	 */
	EOperation getColumn__TagName();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.html.TableSection <em>Table Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table Section</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.TableSection
	 * @generated
	 */
	EClass getTableSection();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.sdk.runtime.models.html.TableSection#getRows <em>Rows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rows</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.TableSection#getRows()
	 * @see #getTableSection()
	 * @generated
	 */
	EReference getTableSection_Rows();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.html.TableHead <em>Table Head</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table Head</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.TableHead
	 * @generated
	 */
	EClass getTableHead();

	/**
	 * Returns the meta object for the '{@link org.nasdanika.sdk.runtime.models.html.TableHead#tagName() <em>Tag Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Tag Name</em>' operation.
	 * @see org.nasdanika.sdk.runtime.models.html.TableHead#tagName()
	 * @generated
	 */
	EOperation getTableHead__TagName();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.html.TableBody <em>Table Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table Body</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.TableBody
	 * @generated
	 */
	EClass getTableBody();

	/**
	 * Returns the meta object for the '{@link org.nasdanika.sdk.runtime.models.html.TableBody#tagName() <em>Tag Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Tag Name</em>' operation.
	 * @see org.nasdanika.sdk.runtime.models.html.TableBody#tagName()
	 * @generated
	 */
	EOperation getTableBody__TagName();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.html.TableFoot <em>Table Foot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table Foot</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.TableFoot
	 * @generated
	 */
	EClass getTableFoot();

	/**
	 * Returns the meta object for the '{@link org.nasdanika.sdk.runtime.models.html.TableFoot#tagName() <em>Tag Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Tag Name</em>' operation.
	 * @see org.nasdanika.sdk.runtime.models.html.TableFoot#tagName()
	 * @generated
	 */
	EOperation getTableFoot__TagName();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.html.TableRow <em>Table Row</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table Row</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.TableRow
	 * @generated
	 */
	EClass getTableRow();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.sdk.runtime.models.html.TableRow#getCells <em>Cells</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cells</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.TableRow#getCells()
	 * @see #getTableRow()
	 * @generated
	 */
	EReference getTableRow_Cells();

	/**
	 * Returns the meta object for the '{@link org.nasdanika.sdk.runtime.models.html.TableRow#tagName() <em>Tag Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Tag Name</em>' operation.
	 * @see org.nasdanika.sdk.runtime.models.html.TableRow#tagName()
	 * @generated
	 */
	EOperation getTableRow__TagName();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.html.TableCell <em>Table Cell</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table Cell</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.TableCell
	 * @generated
	 */
	EClass getTableCell();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.html.TableCell#isHeader <em>Header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Header</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.TableCell#isHeader()
	 * @see #getTableCell()
	 * @generated
	 */
	EAttribute getTableCell_Header();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.html.TableCell#getColspan <em>Colspan</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Colspan</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.TableCell#getColspan()
	 * @see #getTableCell()
	 * @generated
	 */
	EAttribute getTableCell_Colspan();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.html.TableCell#getRowspan <em>Rowspan</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rowspan</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.TableCell#getRowspan()
	 * @see #getTableCell()
	 * @generated
	 */
	EAttribute getTableCell_Rowspan();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.html.TableCell#getScope <em>Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scope</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.TableCell#getScope()
	 * @see #getTableCell()
	 * @generated
	 */
	EAttribute getTableCell_Scope();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.html.TableCell#getHeaders <em>Headers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Headers</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.TableCell#getHeaders()
	 * @see #getTableCell()
	 * @generated
	 */
	EAttribute getTableCell_Headers();

	/**
	 * Returns the meta object for the '{@link org.nasdanika.sdk.runtime.models.html.TableCell#tagName() <em>Tag Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Tag Name</em>' operation.
	 * @see org.nasdanika.sdk.runtime.models.html.TableCell#tagName()
	 * @generated
	 */
	EOperation getTableCell__TagName();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.html.Form <em>Form</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Form</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.Form
	 * @generated
	 */
	EClass getForm();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.html.Form#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Action</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.Form#getAction()
	 * @see #getForm()
	 * @generated
	 */
	EAttribute getForm_Action();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.html.Form#getMethod <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Method</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.Form#getMethod()
	 * @see #getForm()
	 * @generated
	 */
	EAttribute getForm_Method();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.html.Form#getEnctype <em>Enctype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Enctype</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.Form#getEnctype()
	 * @see #getForm()
	 * @generated
	 */
	EAttribute getForm_Enctype();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.html.Form#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.Form#getTarget()
	 * @see #getForm()
	 * @generated
	 */
	EAttribute getForm_Target();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.html.Form#isNovalidate <em>Novalidate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Novalidate</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.Form#isNovalidate()
	 * @see #getForm()
	 * @generated
	 */
	EAttribute getForm_Novalidate();

	/**
	 * Returns the meta object for the '{@link org.nasdanika.sdk.runtime.models.html.Form#tagName() <em>Tag Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Tag Name</em>' operation.
	 * @see org.nasdanika.sdk.runtime.models.html.Form#tagName()
	 * @generated
	 */
	EOperation getForm__TagName();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.html.Fieldset <em>Fieldset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fieldset</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.Fieldset
	 * @generated
	 */
	EClass getFieldset();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.html.Fieldset#isDisabled <em>Disabled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Disabled</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.Fieldset#isDisabled()
	 * @see #getFieldset()
	 * @generated
	 */
	EAttribute getFieldset_Disabled();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.sdk.runtime.models.html.Fieldset#getLegend <em>Legend</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Legend</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.Fieldset#getLegend()
	 * @see #getFieldset()
	 * @generated
	 */
	EReference getFieldset_Legend();

	/**
	 * Returns the meta object for the '{@link org.nasdanika.sdk.runtime.models.html.Fieldset#tagName() <em>Tag Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Tag Name</em>' operation.
	 * @see org.nasdanika.sdk.runtime.models.html.Fieldset#tagName()
	 * @generated
	 */
	EOperation getFieldset__TagName();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.html.Legend <em>Legend</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Legend</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.Legend
	 * @generated
	 */
	EClass getLegend();

	/**
	 * Returns the meta object for the '{@link org.nasdanika.sdk.runtime.models.html.Legend#tagName() <em>Tag Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Tag Name</em>' operation.
	 * @see org.nasdanika.sdk.runtime.models.html.Legend#tagName()
	 * @generated
	 */
	EOperation getLegend__TagName();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.html.Label <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Label</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.Label
	 * @generated
	 */
	EClass getLabel();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.html.Label#getHtmlFor <em>Html For</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Html For</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.Label#getHtmlFor()
	 * @see #getLabel()
	 * @generated
	 */
	EAttribute getLabel_HtmlFor();

	/**
	 * Returns the meta object for the '{@link org.nasdanika.sdk.runtime.models.html.Label#tagName() <em>Tag Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Tag Name</em>' operation.
	 * @see org.nasdanika.sdk.runtime.models.html.Label#tagName()
	 * @generated
	 */
	EOperation getLabel__TagName();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.html.Input <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.Input
	 * @generated
	 */
	EClass getInput();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.html.Input#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.Input#getType()
	 * @see #getInput()
	 * @generated
	 */
	EAttribute getInput_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.html.Input#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.Input#getName()
	 * @see #getInput()
	 * @generated
	 */
	EAttribute getInput_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.html.Input#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.Input#getValue()
	 * @see #getInput()
	 * @generated
	 */
	EAttribute getInput_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.html.Input#getPlaceholder <em>Placeholder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Placeholder</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.Input#getPlaceholder()
	 * @see #getInput()
	 * @generated
	 */
	EAttribute getInput_Placeholder();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.html.Input#isRequired <em>Required</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Required</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.Input#isRequired()
	 * @see #getInput()
	 * @generated
	 */
	EAttribute getInput_Required();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.html.Input#isDisabled <em>Disabled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Disabled</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.Input#isDisabled()
	 * @see #getInput()
	 * @generated
	 */
	EAttribute getInput_Disabled();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.html.Input#isReadonly <em>Readonly</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Readonly</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.Input#isReadonly()
	 * @see #getInput()
	 * @generated
	 */
	EAttribute getInput_Readonly();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.html.Input#isChecked <em>Checked</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Checked</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.Input#isChecked()
	 * @see #getInput()
	 * @generated
	 */
	EAttribute getInput_Checked();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.html.Input#isMultiple <em>Multiple</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multiple</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.Input#isMultiple()
	 * @see #getInput()
	 * @generated
	 */
	EAttribute getInput_Multiple();

	/**
	 * Returns the meta object for the '{@link org.nasdanika.sdk.runtime.models.html.Input#tagName() <em>Tag Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Tag Name</em>' operation.
	 * @see org.nasdanika.sdk.runtime.models.html.Input#tagName()
	 * @generated
	 */
	EOperation getInput__TagName();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.html.Button <em>Button</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Button</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.Button
	 * @generated
	 */
	EClass getButton();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.html.Button#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.Button#getType()
	 * @see #getButton()
	 * @generated
	 */
	EAttribute getButton_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.html.Button#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.Button#getName()
	 * @see #getButton()
	 * @generated
	 */
	EAttribute getButton_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.html.Button#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.Button#getValue()
	 * @see #getButton()
	 * @generated
	 */
	EAttribute getButton_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.html.Button#isDisabled <em>Disabled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Disabled</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.Button#isDisabled()
	 * @see #getButton()
	 * @generated
	 */
	EAttribute getButton_Disabled();

	/**
	 * Returns the meta object for the '{@link org.nasdanika.sdk.runtime.models.html.Button#tagName() <em>Tag Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Tag Name</em>' operation.
	 * @see org.nasdanika.sdk.runtime.models.html.Button#tagName()
	 * @generated
	 */
	EOperation getButton__TagName();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.html.TextArea <em>Text Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text Area</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.TextArea
	 * @generated
	 */
	EClass getTextArea();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.html.TextArea#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.TextArea#getName()
	 * @see #getTextArea()
	 * @generated
	 */
	EAttribute getTextArea_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.html.TextArea#getRows <em>Rows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rows</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.TextArea#getRows()
	 * @see #getTextArea()
	 * @generated
	 */
	EAttribute getTextArea_Rows();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.html.TextArea#getCols <em>Cols</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cols</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.TextArea#getCols()
	 * @see #getTextArea()
	 * @generated
	 */
	EAttribute getTextArea_Cols();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.html.TextArea#getPlaceholder <em>Placeholder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Placeholder</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.TextArea#getPlaceholder()
	 * @see #getTextArea()
	 * @generated
	 */
	EAttribute getTextArea_Placeholder();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.html.TextArea#isRequired <em>Required</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Required</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.TextArea#isRequired()
	 * @see #getTextArea()
	 * @generated
	 */
	EAttribute getTextArea_Required();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.html.TextArea#isDisabled <em>Disabled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Disabled</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.TextArea#isDisabled()
	 * @see #getTextArea()
	 * @generated
	 */
	EAttribute getTextArea_Disabled();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.html.TextArea#isReadonly <em>Readonly</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Readonly</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.TextArea#isReadonly()
	 * @see #getTextArea()
	 * @generated
	 */
	EAttribute getTextArea_Readonly();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.html.TextArea#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.TextArea#getText()
	 * @see #getTextArea()
	 * @generated
	 */
	EAttribute getTextArea_Text();

	/**
	 * Returns the meta object for the '{@link org.nasdanika.sdk.runtime.models.html.TextArea#tagName() <em>Tag Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Tag Name</em>' operation.
	 * @see org.nasdanika.sdk.runtime.models.html.TextArea#tagName()
	 * @generated
	 */
	EOperation getTextArea__TagName();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.html.SelectItem <em>Select Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Select Item</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.SelectItem
	 * @generated
	 */
	EClass getSelectItem();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.html.Select <em>Select</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Select</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.Select
	 * @generated
	 */
	EClass getSelect();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.html.Select#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.Select#getName()
	 * @see #getSelect()
	 * @generated
	 */
	EAttribute getSelect_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.html.Select#isMultiple <em>Multiple</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multiple</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.Select#isMultiple()
	 * @see #getSelect()
	 * @generated
	 */
	EAttribute getSelect_Multiple();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.html.Select#isRequired <em>Required</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Required</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.Select#isRequired()
	 * @see #getSelect()
	 * @generated
	 */
	EAttribute getSelect_Required();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.html.Select#isDisabled <em>Disabled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Disabled</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.Select#isDisabled()
	 * @see #getSelect()
	 * @generated
	 */
	EAttribute getSelect_Disabled();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.html.Select#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.Select#getSize()
	 * @see #getSelect()
	 * @generated
	 */
	EAttribute getSelect_Size();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.sdk.runtime.models.html.Select#getItems <em>Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Items</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.Select#getItems()
	 * @see #getSelect()
	 * @generated
	 */
	EReference getSelect_Items();

	/**
	 * Returns the meta object for the '{@link org.nasdanika.sdk.runtime.models.html.Select#tagName() <em>Tag Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Tag Name</em>' operation.
	 * @see org.nasdanika.sdk.runtime.models.html.Select#tagName()
	 * @generated
	 */
	EOperation getSelect__TagName();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.html.Option <em>Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Option</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.Option
	 * @generated
	 */
	EClass getOption();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.html.Option#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.Option#getValue()
	 * @see #getOption()
	 * @generated
	 */
	EAttribute getOption_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.html.Option#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.Option#getLabel()
	 * @see #getOption()
	 * @generated
	 */
	EAttribute getOption_Label();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.html.Option#isSelected <em>Selected</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Selected</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.Option#isSelected()
	 * @see #getOption()
	 * @generated
	 */
	EAttribute getOption_Selected();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.html.Option#isDisabled <em>Disabled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Disabled</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.Option#isDisabled()
	 * @see #getOption()
	 * @generated
	 */
	EAttribute getOption_Disabled();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.html.Option#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.Option#getText()
	 * @see #getOption()
	 * @generated
	 */
	EAttribute getOption_Text();

	/**
	 * Returns the meta object for the '{@link org.nasdanika.sdk.runtime.models.html.Option#tagName() <em>Tag Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Tag Name</em>' operation.
	 * @see org.nasdanika.sdk.runtime.models.html.Option#tagName()
	 * @generated
	 */
	EOperation getOption__TagName();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.html.OptionGroup <em>Option Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Option Group</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.OptionGroup
	 * @generated
	 */
	EClass getOptionGroup();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.html.OptionGroup#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.OptionGroup#getLabel()
	 * @see #getOptionGroup()
	 * @generated
	 */
	EAttribute getOptionGroup_Label();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.html.OptionGroup#isDisabled <em>Disabled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Disabled</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.OptionGroup#isDisabled()
	 * @see #getOptionGroup()
	 * @generated
	 */
	EAttribute getOptionGroup_Disabled();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.sdk.runtime.models.html.OptionGroup#getOptions <em>Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Options</em>'.
	 * @see org.nasdanika.sdk.runtime.models.html.OptionGroup#getOptions()
	 * @see #getOptionGroup()
	 * @generated
	 */
	EReference getOptionGroup_Options();

	/**
	 * Returns the meta object for the '{@link org.nasdanika.sdk.runtime.models.html.OptionGroup#tagName() <em>Tag Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Tag Name</em>' operation.
	 * @see org.nasdanika.sdk.runtime.models.html.OptionGroup#tagName()
	 * @generated
	 */
	EOperation getOptionGroup__TagName();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	HtmlFactory getHtmlFactory();

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
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.html.impl.NodeImpl <em>Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.html.impl.NodeImpl
		 * @see org.nasdanika.sdk.runtime.models.html.impl.HtmlPackageImpl#getNode()
		 * @generated
		 */
		EClass NODE = eINSTANCE.getNode();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.html.impl.TextImpl <em>Text</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.html.impl.TextImpl
		 * @see org.nasdanika.sdk.runtime.models.html.impl.HtmlPackageImpl#getText()
		 * @generated
		 */
		EClass TEXT = eINSTANCE.getText();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT__CONTENT = eINSTANCE.getText_Content();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.html.impl.MarkupImpl <em>Markup</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.html.impl.MarkupImpl
		 * @see org.nasdanika.sdk.runtime.models.html.impl.HtmlPackageImpl#getMarkup()
		 * @generated
		 */
		EClass MARKUP = eINSTANCE.getMarkup();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MARKUP__CONTENT = eINSTANCE.getMarkup_Content();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.html.impl.CommentImpl <em>Comment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.html.impl.CommentImpl
		 * @see org.nasdanika.sdk.runtime.models.html.impl.HtmlPackageImpl#getComment()
		 * @generated
		 */
		EClass COMMENT = eINSTANCE.getComment();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMENT__CONTENT = eINSTANCE.getComment_Content();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.html.impl.NodeReferenceImpl <em>Node Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.html.impl.NodeReferenceImpl
		 * @see org.nasdanika.sdk.runtime.models.html.impl.HtmlPackageImpl#getNodeReference()
		 * @generated
		 */
		EClass NODE_REFERENCE = eINSTANCE.getNodeReference();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE_REFERENCE__TARGET = eINSTANCE.getNodeReference_Target();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.html.Container <em>Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.html.Container
		 * @see org.nasdanika.sdk.runtime.models.html.impl.HtmlPackageImpl#getContainer()
		 * @generated
		 */
		EClass CONTAINER = eINSTANCE.getContainer();

		/**
		 * The meta object literal for the '<em><b>Contents</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINER__CONTENTS = eINSTANCE.getContainer_Contents();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.html.impl.ElementImpl <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.html.impl.ElementImpl
		 * @see org.nasdanika.sdk.runtime.models.html.impl.HtmlPackageImpl#getElement()
		 * @generated
		 */
		EClass ELEMENT = eINSTANCE.getElement();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__ID = eINSTANCE.getElement_Id();

		/**
		 * The meta object literal for the '<em><b>Classes</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__CLASSES = eINSTANCE.getElement_Classes();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT__STYLE = eINSTANCE.getElement_Style();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT__ATTRIBUTES = eINSTANCE.getElement_Attributes();

		/**
		 * The meta object literal for the '<em><b>Tag Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ELEMENT___TAG_NAME = eINSTANCE.getElement__TagName();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.html.impl.VoidElementImpl <em>Void Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.html.impl.VoidElementImpl
		 * @see org.nasdanika.sdk.runtime.models.html.impl.HtmlPackageImpl#getVoidElement()
		 * @generated
		 */
		EClass VOID_ELEMENT = eINSTANCE.getVoidElement();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.html.impl.GenericElementImpl <em>Generic Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.html.impl.GenericElementImpl
		 * @see org.nasdanika.sdk.runtime.models.html.impl.HtmlPackageImpl#getGenericElement()
		 * @generated
		 */
		EClass GENERIC_ELEMENT = eINSTANCE.getGenericElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERIC_ELEMENT__NAME = eINSTANCE.getGenericElement_Name();

		/**
		 * The meta object literal for the '<em><b>Tag Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GENERIC_ELEMENT___TAG_NAME = eINSTANCE.getGenericElement__TagName();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.html.impl.GenericVoidElementImpl <em>Generic Void Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.html.impl.GenericVoidElementImpl
		 * @see org.nasdanika.sdk.runtime.models.html.impl.HtmlPackageImpl#getGenericVoidElement()
		 * @generated
		 */
		EClass GENERIC_VOID_ELEMENT = eINSTANCE.getGenericVoidElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERIC_VOID_ELEMENT__NAME = eINSTANCE.getGenericVoidElement_Name();

		/**
		 * The meta object literal for the '<em><b>Tag Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GENERIC_VOID_ELEMENT___TAG_NAME = eINSTANCE.getGenericVoidElement__TagName();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.html.impl.LibraryElementImpl <em>Library Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.html.impl.LibraryElementImpl
		 * @see org.nasdanika.sdk.runtime.models.html.impl.HtmlPackageImpl#getLibraryElement()
		 * @generated
		 */
		EClass LIBRARY_ELEMENT = eINSTANCE.getLibraryElement();

		/**
		 * The meta object literal for the '<em><b>Tag Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LIBRARY_ELEMENT___TAG_NAME = eINSTANCE.getLibraryElement__TagName();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.html.impl.DocumentImpl <em>Document</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.html.impl.DocumentImpl
		 * @see org.nasdanika.sdk.runtime.models.html.impl.HtmlPackageImpl#getDocument()
		 * @generated
		 */
		EClass DOCUMENT = eINSTANCE.getDocument();

		/**
		 * The meta object literal for the '<em><b>Doctype</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT__DOCTYPE = eINSTANCE.getDocument_Doctype();

		/**
		 * The meta object literal for the '<em><b>Lang</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT__LANG = eINSTANCE.getDocument_Lang();

		/**
		 * The meta object literal for the '<em><b>Head</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT__HEAD = eINSTANCE.getDocument_Head();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT__BODY = eINSTANCE.getDocument_Body();

		/**
		 * The meta object literal for the '<em><b>Tag Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DOCUMENT___TAG_NAME = eINSTANCE.getDocument__TagName();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.html.impl.HeadImpl <em>Head</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.html.impl.HeadImpl
		 * @see org.nasdanika.sdk.runtime.models.html.impl.HtmlPackageImpl#getHead()
		 * @generated
		 */
		EClass HEAD = eINSTANCE.getHead();

		/**
		 * The meta object literal for the '<em><b>Charset</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HEAD__CHARSET = eINSTANCE.getHead_Charset();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HEAD__TITLE = eINSTANCE.getHead_Title();

		/**
		 * The meta object literal for the '<em><b>Base</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HEAD__BASE = eINSTANCE.getHead_Base();

		/**
		 * The meta object literal for the '<em><b>Metas</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HEAD__METAS = eINSTANCE.getHead_Metas();

		/**
		 * The meta object literal for the '<em><b>Links</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HEAD__LINKS = eINSTANCE.getHead_Links();

		/**
		 * The meta object literal for the '<em><b>Stylesheets</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HEAD__STYLESHEETS = eINSTANCE.getHead_Stylesheets();

		/**
		 * The meta object literal for the '<em><b>Import Map</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HEAD__IMPORT_MAP = eINSTANCE.getHead_ImportMap();

		/**
		 * The meta object literal for the '<em><b>Scripts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HEAD__SCRIPTS = eINSTANCE.getHead_Scripts();

		/**
		 * The meta object literal for the '<em><b>Tag Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HEAD___TAG_NAME = eINSTANCE.getHead__TagName();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.html.impl.BodyImpl <em>Body</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.html.impl.BodyImpl
		 * @see org.nasdanika.sdk.runtime.models.html.impl.HtmlPackageImpl#getBody()
		 * @generated
		 */
		EClass BODY = eINSTANCE.getBody();

		/**
		 * The meta object literal for the '<em><b>Tag Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BODY___TAG_NAME = eINSTANCE.getBody__TagName();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.html.impl.MetaImpl <em>Meta</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.html.impl.MetaImpl
		 * @see org.nasdanika.sdk.runtime.models.html.impl.HtmlPackageImpl#getMeta()
		 * @generated
		 */
		EClass META = eINSTANCE.getMeta();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute META__NAME = eINSTANCE.getMeta_Name();

		/**
		 * The meta object literal for the '<em><b>Http Equiv</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute META__HTTP_EQUIV = eINSTANCE.getMeta_HttpEquiv();

		/**
		 * The meta object literal for the '<em><b>Property</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute META__PROPERTY = eINSTANCE.getMeta_Property();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute META__CONTENT = eINSTANCE.getMeta_Content();

		/**
		 * The meta object literal for the '<em><b>Charset</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute META__CHARSET = eINSTANCE.getMeta_Charset();

		/**
		 * The meta object literal for the '<em><b>Tag Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation META___TAG_NAME = eINSTANCE.getMeta__TagName();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.html.impl.LinkImpl <em>Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.html.impl.LinkImpl
		 * @see org.nasdanika.sdk.runtime.models.html.impl.HtmlPackageImpl#getLink()
		 * @generated
		 */
		EClass LINK = eINSTANCE.getLink();

		/**
		 * The meta object literal for the '<em><b>Rel</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK__REL = eINSTANCE.getLink_Rel();

		/**
		 * The meta object literal for the '<em><b>Href</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK__HREF = eINSTANCE.getLink_Href();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK__TYPE = eINSTANCE.getLink_Type();

		/**
		 * The meta object literal for the '<em><b>Media</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK__MEDIA = eINSTANCE.getLink_Media();

		/**
		 * The meta object literal for the '<em><b>Sizes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK__SIZES = eINSTANCE.getLink_Sizes();

		/**
		 * The meta object literal for the '<em><b>Crossorigin</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK__CROSSORIGIN = eINSTANCE.getLink_Crossorigin();

		/**
		 * The meta object literal for the '<em><b>Integrity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK__INTEGRITY = eINSTANCE.getLink_Integrity();

		/**
		 * The meta object literal for the '<em><b>Tag Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LINK___TAG_NAME = eINSTANCE.getLink__TagName();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.html.impl.StylesheetImpl <em>Stylesheet</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.html.impl.StylesheetImpl
		 * @see org.nasdanika.sdk.runtime.models.html.impl.HtmlPackageImpl#getStylesheet()
		 * @generated
		 */
		EClass STYLESHEET = eINSTANCE.getStylesheet();

		/**
		 * The meta object literal for the '<em><b>Href</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STYLESHEET__HREF = eINSTANCE.getStylesheet_Href();

		/**
		 * The meta object literal for the '<em><b>Media</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STYLESHEET__MEDIA = eINSTANCE.getStylesheet_Media();

		/**
		 * The meta object literal for the '<em><b>Crossorigin</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STYLESHEET__CROSSORIGIN = eINSTANCE.getStylesheet_Crossorigin();

		/**
		 * The meta object literal for the '<em><b>Integrity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STYLESHEET__INTEGRITY = eINSTANCE.getStylesheet_Integrity();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STYLESHEET__CONTENT = eINSTANCE.getStylesheet_Content();

		/**
		 * The meta object literal for the '<em><b>Tag Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STYLESHEET___TAG_NAME = eINSTANCE.getStylesheet__TagName();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.html.impl.ScriptImpl <em>Script</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.html.impl.ScriptImpl
		 * @see org.nasdanika.sdk.runtime.models.html.impl.HtmlPackageImpl#getScript()
		 * @generated
		 */
		EClass SCRIPT = eINSTANCE.getScript();

		/**
		 * The meta object literal for the '<em><b>Src</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCRIPT__SRC = eINSTANCE.getScript_Src();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCRIPT__TYPE = eINSTANCE.getScript_Type();

		/**
		 * The meta object literal for the '<em><b>Module</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCRIPT__MODULE = eINSTANCE.getScript_Module();

		/**
		 * The meta object literal for the '<em><b>Async</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCRIPT__ASYNC = eINSTANCE.getScript_Async();

		/**
		 * The meta object literal for the '<em><b>Defer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCRIPT__DEFER = eINSTANCE.getScript_Defer();

		/**
		 * The meta object literal for the '<em><b>Crossorigin</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCRIPT__CROSSORIGIN = eINSTANCE.getScript_Crossorigin();

		/**
		 * The meta object literal for the '<em><b>Integrity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCRIPT__INTEGRITY = eINSTANCE.getScript_Integrity();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCRIPT__CONTENT = eINSTANCE.getScript_Content();

		/**
		 * The meta object literal for the '<em><b>Tag Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SCRIPT___TAG_NAME = eINSTANCE.getScript__TagName();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.html.impl.ImportMapImpl <em>Import Map</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.html.impl.ImportMapImpl
		 * @see org.nasdanika.sdk.runtime.models.html.impl.HtmlPackageImpl#getImportMap()
		 * @generated
		 */
		EClass IMPORT_MAP = eINSTANCE.getImportMap();

		/**
		 * The meta object literal for the '<em><b>Imports</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMPORT_MAP__IMPORTS = eINSTANCE.getImportMap_Imports();

		/**
		 * The meta object literal for the '<em><b>Scopes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMPORT_MAP__SCOPES = eINSTANCE.getImportMap_Scopes();

		/**
		 * The meta object literal for the '<em><b>Tag Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IMPORT_MAP___TAG_NAME = eINSTANCE.getImportMap__TagName();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.html.impl.ImportMapScopeImpl <em>Import Map Scope</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.html.impl.ImportMapScopeImpl
		 * @see org.nasdanika.sdk.runtime.models.html.impl.HtmlPackageImpl#getImportMapScope()
		 * @generated
		 */
		EClass IMPORT_MAP_SCOPE = eINSTANCE.getImportMapScope();

		/**
		 * The meta object literal for the '<em><b>Prefix</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMPORT_MAP_SCOPE__PREFIX = eINSTANCE.getImportMapScope_Prefix();

		/**
		 * The meta object literal for the '<em><b>Imports</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMPORT_MAP_SCOPE__IMPORTS = eINSTANCE.getImportMapScope_Imports();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.html.impl.DivImpl <em>Div</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.html.impl.DivImpl
		 * @see org.nasdanika.sdk.runtime.models.html.impl.HtmlPackageImpl#getDiv()
		 * @generated
		 */
		EClass DIV = eINSTANCE.getDiv();

		/**
		 * The meta object literal for the '<em><b>Tag Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DIV___TAG_NAME = eINSTANCE.getDiv__TagName();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.html.impl.SpanImpl <em>Span</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.html.impl.SpanImpl
		 * @see org.nasdanika.sdk.runtime.models.html.impl.HtmlPackageImpl#getSpan()
		 * @generated
		 */
		EClass SPAN = eINSTANCE.getSpan();

		/**
		 * The meta object literal for the '<em><b>Tag Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SPAN___TAG_NAME = eINSTANCE.getSpan__TagName();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.html.impl.ParagraphImpl <em>Paragraph</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.html.impl.ParagraphImpl
		 * @see org.nasdanika.sdk.runtime.models.html.impl.HtmlPackageImpl#getParagraph()
		 * @generated
		 */
		EClass PARAGRAPH = eINSTANCE.getParagraph();

		/**
		 * The meta object literal for the '<em><b>Tag Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PARAGRAPH___TAG_NAME = eINSTANCE.getParagraph__TagName();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.html.impl.HeadingImpl <em>Heading</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.html.impl.HeadingImpl
		 * @see org.nasdanika.sdk.runtime.models.html.impl.HtmlPackageImpl#getHeading()
		 * @generated
		 */
		EClass HEADING = eINSTANCE.getHeading();

		/**
		 * The meta object literal for the '<em><b>Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HEADING__LEVEL = eINSTANCE.getHeading_Level();

		/**
		 * The meta object literal for the '<em><b>Tag Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HEADING___TAG_NAME = eINSTANCE.getHeading__TagName();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.html.impl.HeaderImpl <em>Header</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.html.impl.HeaderImpl
		 * @see org.nasdanika.sdk.runtime.models.html.impl.HtmlPackageImpl#getHeader()
		 * @generated
		 */
		EClass HEADER = eINSTANCE.getHeader();

		/**
		 * The meta object literal for the '<em><b>Tag Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HEADER___TAG_NAME = eINSTANCE.getHeader__TagName();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.html.impl.FooterImpl <em>Footer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.html.impl.FooterImpl
		 * @see org.nasdanika.sdk.runtime.models.html.impl.HtmlPackageImpl#getFooter()
		 * @generated
		 */
		EClass FOOTER = eINSTANCE.getFooter();

		/**
		 * The meta object literal for the '<em><b>Tag Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation FOOTER___TAG_NAME = eINSTANCE.getFooter__TagName();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.html.impl.MainImpl <em>Main</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.html.impl.MainImpl
		 * @see org.nasdanika.sdk.runtime.models.html.impl.HtmlPackageImpl#getMain()
		 * @generated
		 */
		EClass MAIN = eINSTANCE.getMain();

		/**
		 * The meta object literal for the '<em><b>Tag Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MAIN___TAG_NAME = eINSTANCE.getMain__TagName();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.html.impl.NavImpl <em>Nav</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.html.impl.NavImpl
		 * @see org.nasdanika.sdk.runtime.models.html.impl.HtmlPackageImpl#getNav()
		 * @generated
		 */
		EClass NAV = eINSTANCE.getNav();

		/**
		 * The meta object literal for the '<em><b>Tag Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NAV___TAG_NAME = eINSTANCE.getNav__TagName();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.html.impl.SectionImpl <em>Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.html.impl.SectionImpl
		 * @see org.nasdanika.sdk.runtime.models.html.impl.HtmlPackageImpl#getSection()
		 * @generated
		 */
		EClass SECTION = eINSTANCE.getSection();

		/**
		 * The meta object literal for the '<em><b>Tag Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SECTION___TAG_NAME = eINSTANCE.getSection__TagName();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.html.impl.ArticleImpl <em>Article</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.html.impl.ArticleImpl
		 * @see org.nasdanika.sdk.runtime.models.html.impl.HtmlPackageImpl#getArticle()
		 * @generated
		 */
		EClass ARTICLE = eINSTANCE.getArticle();

		/**
		 * The meta object literal for the '<em><b>Tag Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ARTICLE___TAG_NAME = eINSTANCE.getArticle__TagName();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.html.impl.AsideImpl <em>Aside</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.html.impl.AsideImpl
		 * @see org.nasdanika.sdk.runtime.models.html.impl.HtmlPackageImpl#getAside()
		 * @generated
		 */
		EClass ASIDE = eINSTANCE.getAside();

		/**
		 * The meta object literal for the '<em><b>Tag Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ASIDE___TAG_NAME = eINSTANCE.getAside__TagName();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.html.impl.BlockquoteImpl <em>Blockquote</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.html.impl.BlockquoteImpl
		 * @see org.nasdanika.sdk.runtime.models.html.impl.HtmlPackageImpl#getBlockquote()
		 * @generated
		 */
		EClass BLOCKQUOTE = eINSTANCE.getBlockquote();

		/**
		 * The meta object literal for the '<em><b>Cite</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BLOCKQUOTE__CITE = eINSTANCE.getBlockquote_Cite();

		/**
		 * The meta object literal for the '<em><b>Tag Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BLOCKQUOTE___TAG_NAME = eINSTANCE.getBlockquote__TagName();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.html.impl.PreImpl <em>Pre</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.html.impl.PreImpl
		 * @see org.nasdanika.sdk.runtime.models.html.impl.HtmlPackageImpl#getPre()
		 * @generated
		 */
		EClass PRE = eINSTANCE.getPre();

		/**
		 * The meta object literal for the '<em><b>Tag Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PRE___TAG_NAME = eINSTANCE.getPre__TagName();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.html.impl.FigureImpl <em>Figure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.html.impl.FigureImpl
		 * @see org.nasdanika.sdk.runtime.models.html.impl.HtmlPackageImpl#getFigure()
		 * @generated
		 */
		EClass FIGURE = eINSTANCE.getFigure();

		/**
		 * The meta object literal for the '<em><b>Tag Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation FIGURE___TAG_NAME = eINSTANCE.getFigure__TagName();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.html.impl.FigureCaptionImpl <em>Figure Caption</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.html.impl.FigureCaptionImpl
		 * @see org.nasdanika.sdk.runtime.models.html.impl.HtmlPackageImpl#getFigureCaption()
		 * @generated
		 */
		EClass FIGURE_CAPTION = eINSTANCE.getFigureCaption();

		/**
		 * The meta object literal for the '<em><b>Tag Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation FIGURE_CAPTION___TAG_NAME = eINSTANCE.getFigureCaption__TagName();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.html.impl.DetailsImpl <em>Details</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.html.impl.DetailsImpl
		 * @see org.nasdanika.sdk.runtime.models.html.impl.HtmlPackageImpl#getDetails()
		 * @generated
		 */
		EClass DETAILS = eINSTANCE.getDetails();

		/**
		 * The meta object literal for the '<em><b>Open</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DETAILS__OPEN = eINSTANCE.getDetails_Open();

		/**
		 * The meta object literal for the '<em><b>Summary</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DETAILS__SUMMARY = eINSTANCE.getDetails_Summary();

		/**
		 * The meta object literal for the '<em><b>Tag Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DETAILS___TAG_NAME = eINSTANCE.getDetails__TagName();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.html.impl.SummaryImpl <em>Summary</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.html.impl.SummaryImpl
		 * @see org.nasdanika.sdk.runtime.models.html.impl.HtmlPackageImpl#getSummary()
		 * @generated
		 */
		EClass SUMMARY = eINSTANCE.getSummary();

		/**
		 * The meta object literal for the '<em><b>Tag Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SUMMARY___TAG_NAME = eINSTANCE.getSummary__TagName();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.html.impl.HorizontalRuleImpl <em>Horizontal Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.html.impl.HorizontalRuleImpl
		 * @see org.nasdanika.sdk.runtime.models.html.impl.HtmlPackageImpl#getHorizontalRule()
		 * @generated
		 */
		EClass HORIZONTAL_RULE = eINSTANCE.getHorizontalRule();

		/**
		 * The meta object literal for the '<em><b>Tag Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HORIZONTAL_RULE___TAG_NAME = eINSTANCE.getHorizontalRule__TagName();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.html.impl.LineBreakImpl <em>Line Break</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.html.impl.LineBreakImpl
		 * @see org.nasdanika.sdk.runtime.models.html.impl.HtmlPackageImpl#getLineBreak()
		 * @generated
		 */
		EClass LINE_BREAK = eINSTANCE.getLineBreak();

		/**
		 * The meta object literal for the '<em><b>Tag Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LINE_BREAK___TAG_NAME = eINSTANCE.getLineBreak__TagName();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.html.impl.AnchorImpl <em>Anchor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.html.impl.AnchorImpl
		 * @see org.nasdanika.sdk.runtime.models.html.impl.HtmlPackageImpl#getAnchor()
		 * @generated
		 */
		EClass ANCHOR = eINSTANCE.getAnchor();

		/**
		 * The meta object literal for the '<em><b>Href</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANCHOR__HREF = eINSTANCE.getAnchor_Href();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANCHOR__TARGET = eINSTANCE.getAnchor_Target();

		/**
		 * The meta object literal for the '<em><b>Rel</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANCHOR__REL = eINSTANCE.getAnchor_Rel();

		/**
		 * The meta object literal for the '<em><b>Download</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANCHOR__DOWNLOAD = eINSTANCE.getAnchor_Download();

		/**
		 * The meta object literal for the '<em><b>Tag Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ANCHOR___TAG_NAME = eINSTANCE.getAnchor__TagName();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.html.impl.StrongImpl <em>Strong</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.html.impl.StrongImpl
		 * @see org.nasdanika.sdk.runtime.models.html.impl.HtmlPackageImpl#getStrong()
		 * @generated
		 */
		EClass STRONG = eINSTANCE.getStrong();

		/**
		 * The meta object literal for the '<em><b>Tag Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STRONG___TAG_NAME = eINSTANCE.getStrong__TagName();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.html.impl.EmphasisImpl <em>Emphasis</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.html.impl.EmphasisImpl
		 * @see org.nasdanika.sdk.runtime.models.html.impl.HtmlPackageImpl#getEmphasis()
		 * @generated
		 */
		EClass EMPHASIS = eINSTANCE.getEmphasis();

		/**
		 * The meta object literal for the '<em><b>Tag Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EMPHASIS___TAG_NAME = eINSTANCE.getEmphasis__TagName();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.html.impl.CodeImpl <em>Code</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.html.impl.CodeImpl
		 * @see org.nasdanika.sdk.runtime.models.html.impl.HtmlPackageImpl#getCode()
		 * @generated
		 */
		EClass CODE = eINSTANCE.getCode();

		/**
		 * The meta object literal for the '<em><b>Tag Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CODE___TAG_NAME = eINSTANCE.getCode__TagName();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.html.impl.ImageImpl <em>Image</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.html.impl.ImageImpl
		 * @see org.nasdanika.sdk.runtime.models.html.impl.HtmlPackageImpl#getImage()
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
		 * The meta object literal for the '<em><b>Srcset</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMAGE__SRCSET = eINSTANCE.getImage_Srcset();

		/**
		 * The meta object literal for the '<em><b>Sizes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMAGE__SIZES = eINSTANCE.getImage_Sizes();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMAGE__WIDTH = eINSTANCE.getImage_Width();

		/**
		 * The meta object literal for the '<em><b>Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMAGE__HEIGHT = eINSTANCE.getImage_Height();

		/**
		 * The meta object literal for the '<em><b>Loading</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMAGE__LOADING = eINSTANCE.getImage_Loading();

		/**
		 * The meta object literal for the '<em><b>Tag Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IMAGE___TAG_NAME = eINSTANCE.getImage__TagName();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.html.impl.InlineFrameImpl <em>Inline Frame</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.html.impl.InlineFrameImpl
		 * @see org.nasdanika.sdk.runtime.models.html.impl.HtmlPackageImpl#getInlineFrame()
		 * @generated
		 */
		EClass INLINE_FRAME = eINSTANCE.getInlineFrame();

		/**
		 * The meta object literal for the '<em><b>Src</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INLINE_FRAME__SRC = eINSTANCE.getInlineFrame_Src();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INLINE_FRAME__TITLE = eINSTANCE.getInlineFrame_Title();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INLINE_FRAME__WIDTH = eINSTANCE.getInlineFrame_Width();

		/**
		 * The meta object literal for the '<em><b>Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INLINE_FRAME__HEIGHT = eINSTANCE.getInlineFrame_Height();

		/**
		 * The meta object literal for the '<em><b>Allow</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INLINE_FRAME__ALLOW = eINSTANCE.getInlineFrame_Allow();

		/**
		 * The meta object literal for the '<em><b>Loading</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INLINE_FRAME__LOADING = eINSTANCE.getInlineFrame_Loading();

		/**
		 * The meta object literal for the '<em><b>Tag Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INLINE_FRAME___TAG_NAME = eINSTANCE.getInlineFrame__TagName();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.html.ItemList <em>Item List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.html.ItemList
		 * @see org.nasdanika.sdk.runtime.models.html.impl.HtmlPackageImpl#getItemList()
		 * @generated
		 */
		EClass ITEM_LIST = eINSTANCE.getItemList();

		/**
		 * The meta object literal for the '<em><b>Items</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITEM_LIST__ITEMS = eINSTANCE.getItemList_Items();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.html.impl.UnorderedListImpl <em>Unordered List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.html.impl.UnorderedListImpl
		 * @see org.nasdanika.sdk.runtime.models.html.impl.HtmlPackageImpl#getUnorderedList()
		 * @generated
		 */
		EClass UNORDERED_LIST = eINSTANCE.getUnorderedList();

		/**
		 * The meta object literal for the '<em><b>Tag Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation UNORDERED_LIST___TAG_NAME = eINSTANCE.getUnorderedList__TagName();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.html.impl.OrderedListImpl <em>Ordered List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.html.impl.OrderedListImpl
		 * @see org.nasdanika.sdk.runtime.models.html.impl.HtmlPackageImpl#getOrderedList()
		 * @generated
		 */
		EClass ORDERED_LIST = eINSTANCE.getOrderedList();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDERED_LIST__START = eINSTANCE.getOrderedList_Start();

		/**
		 * The meta object literal for the '<em><b>Reversed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDERED_LIST__REVERSED = eINSTANCE.getOrderedList_Reversed();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDERED_LIST__TYPE = eINSTANCE.getOrderedList_Type();

		/**
		 * The meta object literal for the '<em><b>Tag Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ORDERED_LIST___TAG_NAME = eINSTANCE.getOrderedList__TagName();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.html.impl.ListItemImpl <em>List Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.html.impl.ListItemImpl
		 * @see org.nasdanika.sdk.runtime.models.html.impl.HtmlPackageImpl#getListItem()
		 * @generated
		 */
		EClass LIST_ITEM = eINSTANCE.getListItem();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIST_ITEM__VALUE = eINSTANCE.getListItem_Value();

		/**
		 * The meta object literal for the '<em><b>Tag Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LIST_ITEM___TAG_NAME = eINSTANCE.getListItem__TagName();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.html.DescriptionListItem <em>Description List Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.html.DescriptionListItem
		 * @see org.nasdanika.sdk.runtime.models.html.impl.HtmlPackageImpl#getDescriptionListItem()
		 * @generated
		 */
		EClass DESCRIPTION_LIST_ITEM = eINSTANCE.getDescriptionListItem();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.html.impl.DescriptionListImpl <em>Description List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.html.impl.DescriptionListImpl
		 * @see org.nasdanika.sdk.runtime.models.html.impl.HtmlPackageImpl#getDescriptionList()
		 * @generated
		 */
		EClass DESCRIPTION_LIST = eINSTANCE.getDescriptionList();

		/**
		 * The meta object literal for the '<em><b>Items</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DESCRIPTION_LIST__ITEMS = eINSTANCE.getDescriptionList_Items();

		/**
		 * The meta object literal for the '<em><b>Tag Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DESCRIPTION_LIST___TAG_NAME = eINSTANCE.getDescriptionList__TagName();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.html.impl.DescriptionTermImpl <em>Description Term</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.html.impl.DescriptionTermImpl
		 * @see org.nasdanika.sdk.runtime.models.html.impl.HtmlPackageImpl#getDescriptionTerm()
		 * @generated
		 */
		EClass DESCRIPTION_TERM = eINSTANCE.getDescriptionTerm();

		/**
		 * The meta object literal for the '<em><b>Tag Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DESCRIPTION_TERM___TAG_NAME = eINSTANCE.getDescriptionTerm__TagName();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.html.impl.DescriptionDetailsImpl <em>Description Details</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.html.impl.DescriptionDetailsImpl
		 * @see org.nasdanika.sdk.runtime.models.html.impl.HtmlPackageImpl#getDescriptionDetails()
		 * @generated
		 */
		EClass DESCRIPTION_DETAILS = eINSTANCE.getDescriptionDetails();

		/**
		 * The meta object literal for the '<em><b>Tag Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DESCRIPTION_DETAILS___TAG_NAME = eINSTANCE.getDescriptionDetails__TagName();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.html.impl.TableImpl <em>Table</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.html.impl.TableImpl
		 * @see org.nasdanika.sdk.runtime.models.html.impl.HtmlPackageImpl#getTable()
		 * @generated
		 */
		EClass TABLE = eINSTANCE.getTable();

		/**
		 * The meta object literal for the '<em><b>Caption</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE__CAPTION = eINSTANCE.getTable_Caption();

		/**
		 * The meta object literal for the '<em><b>Column Groups</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE__COLUMN_GROUPS = eINSTANCE.getTable_ColumnGroups();

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
		 * The meta object literal for the '<em><b>Tag Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TABLE___TAG_NAME = eINSTANCE.getTable__TagName();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.html.impl.CaptionImpl <em>Caption</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.html.impl.CaptionImpl
		 * @see org.nasdanika.sdk.runtime.models.html.impl.HtmlPackageImpl#getCaption()
		 * @generated
		 */
		EClass CAPTION = eINSTANCE.getCaption();

		/**
		 * The meta object literal for the '<em><b>Tag Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CAPTION___TAG_NAME = eINSTANCE.getCaption__TagName();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.html.impl.ColumnGroupImpl <em>Column Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.html.impl.ColumnGroupImpl
		 * @see org.nasdanika.sdk.runtime.models.html.impl.HtmlPackageImpl#getColumnGroup()
		 * @generated
		 */
		EClass COLUMN_GROUP = eINSTANCE.getColumnGroup();

		/**
		 * The meta object literal for the '<em><b>Span</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLUMN_GROUP__SPAN = eINSTANCE.getColumnGroup_Span();

		/**
		 * The meta object literal for the '<em><b>Columns</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLUMN_GROUP__COLUMNS = eINSTANCE.getColumnGroup_Columns();

		/**
		 * The meta object literal for the '<em><b>Tag Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COLUMN_GROUP___TAG_NAME = eINSTANCE.getColumnGroup__TagName();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.html.impl.ColumnImpl <em>Column</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.html.impl.ColumnImpl
		 * @see org.nasdanika.sdk.runtime.models.html.impl.HtmlPackageImpl#getColumn()
		 * @generated
		 */
		EClass COLUMN = eINSTANCE.getColumn();

		/**
		 * The meta object literal for the '<em><b>Span</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLUMN__SPAN = eINSTANCE.getColumn_Span();

		/**
		 * The meta object literal for the '<em><b>Tag Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COLUMN___TAG_NAME = eINSTANCE.getColumn__TagName();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.html.impl.TableSectionImpl <em>Table Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.html.impl.TableSectionImpl
		 * @see org.nasdanika.sdk.runtime.models.html.impl.HtmlPackageImpl#getTableSection()
		 * @generated
		 */
		EClass TABLE_SECTION = eINSTANCE.getTableSection();

		/**
		 * The meta object literal for the '<em><b>Rows</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE_SECTION__ROWS = eINSTANCE.getTableSection_Rows();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.html.impl.TableHeadImpl <em>Table Head</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.html.impl.TableHeadImpl
		 * @see org.nasdanika.sdk.runtime.models.html.impl.HtmlPackageImpl#getTableHead()
		 * @generated
		 */
		EClass TABLE_HEAD = eINSTANCE.getTableHead();

		/**
		 * The meta object literal for the '<em><b>Tag Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TABLE_HEAD___TAG_NAME = eINSTANCE.getTableHead__TagName();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.html.impl.TableBodyImpl <em>Table Body</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.html.impl.TableBodyImpl
		 * @see org.nasdanika.sdk.runtime.models.html.impl.HtmlPackageImpl#getTableBody()
		 * @generated
		 */
		EClass TABLE_BODY = eINSTANCE.getTableBody();

		/**
		 * The meta object literal for the '<em><b>Tag Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TABLE_BODY___TAG_NAME = eINSTANCE.getTableBody__TagName();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.html.impl.TableFootImpl <em>Table Foot</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.html.impl.TableFootImpl
		 * @see org.nasdanika.sdk.runtime.models.html.impl.HtmlPackageImpl#getTableFoot()
		 * @generated
		 */
		EClass TABLE_FOOT = eINSTANCE.getTableFoot();

		/**
		 * The meta object literal for the '<em><b>Tag Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TABLE_FOOT___TAG_NAME = eINSTANCE.getTableFoot__TagName();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.html.impl.TableRowImpl <em>Table Row</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.html.impl.TableRowImpl
		 * @see org.nasdanika.sdk.runtime.models.html.impl.HtmlPackageImpl#getTableRow()
		 * @generated
		 */
		EClass TABLE_ROW = eINSTANCE.getTableRow();

		/**
		 * The meta object literal for the '<em><b>Cells</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE_ROW__CELLS = eINSTANCE.getTableRow_Cells();

		/**
		 * The meta object literal for the '<em><b>Tag Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TABLE_ROW___TAG_NAME = eINSTANCE.getTableRow__TagName();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.html.impl.TableCellImpl <em>Table Cell</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.html.impl.TableCellImpl
		 * @see org.nasdanika.sdk.runtime.models.html.impl.HtmlPackageImpl#getTableCell()
		 * @generated
		 */
		EClass TABLE_CELL = eINSTANCE.getTableCell();

		/**
		 * The meta object literal for the '<em><b>Header</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE_CELL__HEADER = eINSTANCE.getTableCell_Header();

		/**
		 * The meta object literal for the '<em><b>Colspan</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE_CELL__COLSPAN = eINSTANCE.getTableCell_Colspan();

		/**
		 * The meta object literal for the '<em><b>Rowspan</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE_CELL__ROWSPAN = eINSTANCE.getTableCell_Rowspan();

		/**
		 * The meta object literal for the '<em><b>Scope</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE_CELL__SCOPE = eINSTANCE.getTableCell_Scope();

		/**
		 * The meta object literal for the '<em><b>Headers</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE_CELL__HEADERS = eINSTANCE.getTableCell_Headers();

		/**
		 * The meta object literal for the '<em><b>Tag Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TABLE_CELL___TAG_NAME = eINSTANCE.getTableCell__TagName();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.html.impl.FormImpl <em>Form</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.html.impl.FormImpl
		 * @see org.nasdanika.sdk.runtime.models.html.impl.HtmlPackageImpl#getForm()
		 * @generated
		 */
		EClass FORM = eINSTANCE.getForm();

		/**
		 * The meta object literal for the '<em><b>Action</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORM__ACTION = eINSTANCE.getForm_Action();

		/**
		 * The meta object literal for the '<em><b>Method</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORM__METHOD = eINSTANCE.getForm_Method();

		/**
		 * The meta object literal for the '<em><b>Enctype</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORM__ENCTYPE = eINSTANCE.getForm_Enctype();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORM__TARGET = eINSTANCE.getForm_Target();

		/**
		 * The meta object literal for the '<em><b>Novalidate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORM__NOVALIDATE = eINSTANCE.getForm_Novalidate();

		/**
		 * The meta object literal for the '<em><b>Tag Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation FORM___TAG_NAME = eINSTANCE.getForm__TagName();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.html.impl.FieldsetImpl <em>Fieldset</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.html.impl.FieldsetImpl
		 * @see org.nasdanika.sdk.runtime.models.html.impl.HtmlPackageImpl#getFieldset()
		 * @generated
		 */
		EClass FIELDSET = eINSTANCE.getFieldset();

		/**
		 * The meta object literal for the '<em><b>Disabled</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIELDSET__DISABLED = eINSTANCE.getFieldset_Disabled();

		/**
		 * The meta object literal for the '<em><b>Legend</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIELDSET__LEGEND = eINSTANCE.getFieldset_Legend();

		/**
		 * The meta object literal for the '<em><b>Tag Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation FIELDSET___TAG_NAME = eINSTANCE.getFieldset__TagName();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.html.impl.LegendImpl <em>Legend</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.html.impl.LegendImpl
		 * @see org.nasdanika.sdk.runtime.models.html.impl.HtmlPackageImpl#getLegend()
		 * @generated
		 */
		EClass LEGEND = eINSTANCE.getLegend();

		/**
		 * The meta object literal for the '<em><b>Tag Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LEGEND___TAG_NAME = eINSTANCE.getLegend__TagName();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.html.impl.LabelImpl <em>Label</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.html.impl.LabelImpl
		 * @see org.nasdanika.sdk.runtime.models.html.impl.HtmlPackageImpl#getLabel()
		 * @generated
		 */
		EClass LABEL = eINSTANCE.getLabel();

		/**
		 * The meta object literal for the '<em><b>Html For</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LABEL__HTML_FOR = eINSTANCE.getLabel_HtmlFor();

		/**
		 * The meta object literal for the '<em><b>Tag Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LABEL___TAG_NAME = eINSTANCE.getLabel__TagName();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.html.impl.InputImpl <em>Input</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.html.impl.InputImpl
		 * @see org.nasdanika.sdk.runtime.models.html.impl.HtmlPackageImpl#getInput()
		 * @generated
		 */
		EClass INPUT = eINSTANCE.getInput();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INPUT__TYPE = eINSTANCE.getInput_Type();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INPUT__NAME = eINSTANCE.getInput_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INPUT__VALUE = eINSTANCE.getInput_Value();

		/**
		 * The meta object literal for the '<em><b>Placeholder</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INPUT__PLACEHOLDER = eINSTANCE.getInput_Placeholder();

		/**
		 * The meta object literal for the '<em><b>Required</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INPUT__REQUIRED = eINSTANCE.getInput_Required();

		/**
		 * The meta object literal for the '<em><b>Disabled</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INPUT__DISABLED = eINSTANCE.getInput_Disabled();

		/**
		 * The meta object literal for the '<em><b>Readonly</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INPUT__READONLY = eINSTANCE.getInput_Readonly();

		/**
		 * The meta object literal for the '<em><b>Checked</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INPUT__CHECKED = eINSTANCE.getInput_Checked();

		/**
		 * The meta object literal for the '<em><b>Multiple</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INPUT__MULTIPLE = eINSTANCE.getInput_Multiple();

		/**
		 * The meta object literal for the '<em><b>Tag Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INPUT___TAG_NAME = eINSTANCE.getInput__TagName();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.html.impl.ButtonImpl <em>Button</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.html.impl.ButtonImpl
		 * @see org.nasdanika.sdk.runtime.models.html.impl.HtmlPackageImpl#getButton()
		 * @generated
		 */
		EClass BUTTON = eINSTANCE.getButton();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUTTON__TYPE = eINSTANCE.getButton_Type();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUTTON__NAME = eINSTANCE.getButton_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUTTON__VALUE = eINSTANCE.getButton_Value();

		/**
		 * The meta object literal for the '<em><b>Disabled</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUTTON__DISABLED = eINSTANCE.getButton_Disabled();

		/**
		 * The meta object literal for the '<em><b>Tag Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BUTTON___TAG_NAME = eINSTANCE.getButton__TagName();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.html.impl.TextAreaImpl <em>Text Area</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.html.impl.TextAreaImpl
		 * @see org.nasdanika.sdk.runtime.models.html.impl.HtmlPackageImpl#getTextArea()
		 * @generated
		 */
		EClass TEXT_AREA = eINSTANCE.getTextArea();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_AREA__NAME = eINSTANCE.getTextArea_Name();

		/**
		 * The meta object literal for the '<em><b>Rows</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_AREA__ROWS = eINSTANCE.getTextArea_Rows();

		/**
		 * The meta object literal for the '<em><b>Cols</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_AREA__COLS = eINSTANCE.getTextArea_Cols();

		/**
		 * The meta object literal for the '<em><b>Placeholder</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_AREA__PLACEHOLDER = eINSTANCE.getTextArea_Placeholder();

		/**
		 * The meta object literal for the '<em><b>Required</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_AREA__REQUIRED = eINSTANCE.getTextArea_Required();

		/**
		 * The meta object literal for the '<em><b>Disabled</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_AREA__DISABLED = eINSTANCE.getTextArea_Disabled();

		/**
		 * The meta object literal for the '<em><b>Readonly</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_AREA__READONLY = eINSTANCE.getTextArea_Readonly();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_AREA__TEXT = eINSTANCE.getTextArea_Text();

		/**
		 * The meta object literal for the '<em><b>Tag Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TEXT_AREA___TAG_NAME = eINSTANCE.getTextArea__TagName();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.html.SelectItem <em>Select Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.html.SelectItem
		 * @see org.nasdanika.sdk.runtime.models.html.impl.HtmlPackageImpl#getSelectItem()
		 * @generated
		 */
		EClass SELECT_ITEM = eINSTANCE.getSelectItem();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.html.impl.SelectImpl <em>Select</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.html.impl.SelectImpl
		 * @see org.nasdanika.sdk.runtime.models.html.impl.HtmlPackageImpl#getSelect()
		 * @generated
		 */
		EClass SELECT = eINSTANCE.getSelect();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SELECT__NAME = eINSTANCE.getSelect_Name();

		/**
		 * The meta object literal for the '<em><b>Multiple</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SELECT__MULTIPLE = eINSTANCE.getSelect_Multiple();

		/**
		 * The meta object literal for the '<em><b>Required</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SELECT__REQUIRED = eINSTANCE.getSelect_Required();

		/**
		 * The meta object literal for the '<em><b>Disabled</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SELECT__DISABLED = eINSTANCE.getSelect_Disabled();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SELECT__SIZE = eINSTANCE.getSelect_Size();

		/**
		 * The meta object literal for the '<em><b>Items</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SELECT__ITEMS = eINSTANCE.getSelect_Items();

		/**
		 * The meta object literal for the '<em><b>Tag Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SELECT___TAG_NAME = eINSTANCE.getSelect__TagName();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.html.impl.OptionImpl <em>Option</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.html.impl.OptionImpl
		 * @see org.nasdanika.sdk.runtime.models.html.impl.HtmlPackageImpl#getOption()
		 * @generated
		 */
		EClass OPTION = eINSTANCE.getOption();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPTION__VALUE = eINSTANCE.getOption_Value();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPTION__LABEL = eINSTANCE.getOption_Label();

		/**
		 * The meta object literal for the '<em><b>Selected</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPTION__SELECTED = eINSTANCE.getOption_Selected();

		/**
		 * The meta object literal for the '<em><b>Disabled</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPTION__DISABLED = eINSTANCE.getOption_Disabled();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPTION__TEXT = eINSTANCE.getOption_Text();

		/**
		 * The meta object literal for the '<em><b>Tag Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation OPTION___TAG_NAME = eINSTANCE.getOption__TagName();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.html.impl.OptionGroupImpl <em>Option Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.html.impl.OptionGroupImpl
		 * @see org.nasdanika.sdk.runtime.models.html.impl.HtmlPackageImpl#getOptionGroup()
		 * @generated
		 */
		EClass OPTION_GROUP = eINSTANCE.getOptionGroup();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPTION_GROUP__LABEL = eINSTANCE.getOptionGroup_Label();

		/**
		 * The meta object literal for the '<em><b>Disabled</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPTION_GROUP__DISABLED = eINSTANCE.getOptionGroup_Disabled();

		/**
		 * The meta object literal for the '<em><b>Options</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPTION_GROUP__OPTIONS = eINSTANCE.getOptionGroup_Options();

		/**
		 * The meta object literal for the '<em><b>Tag Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation OPTION_GROUP___TAG_NAME = eINSTANCE.getOptionGroup__TagName();

	}

} //HtmlPackage
