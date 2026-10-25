/**
 */
package org.nasdanika.sdk.runtime.models.drawio;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.nasdanika.sdk.runtime.models.core.CorePackage;

import org.nasdanika.sdk.runtime.models.diagram.DiagramPackage;

import org.nasdanika.sdk.runtime.models.presentation.PresentationPackage;

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
 * @see org.nasdanika.sdk.runtime.models.drawio.DrawioFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel modelDirectory='/model/src-gen' featureDelegation='Dynamic' complianceLevel='25' suppressGenModelAnnotations='false' copyrightFields='false' operationReflection='true' importOrganizing='true' basePackage='org.nasdanika.sdk.runtime.models'"
 *        annotation="http://www.eclipse.org/emf/2011/Xcore Ecore='http://www.eclipse.org/emf/2002/Ecore' GenModel='http://www.eclipse.org/emf/2002/GenModel' Nasdanika='urn:org.nasdanika'"
 * @generated
 */
public interface DrawioPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "drawio";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "https://runtime.sdk.nasdanika.org/models/drawio";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.nasdanika.sdk.runtime.models.drawio";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DrawioPackage eINSTANCE = org.nasdanika.sdk.runtime.models.drawio.impl.DrawioPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.drawio.impl.DocumentImpl <em>Document</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.drawio.impl.DocumentImpl
	 * @see org.nasdanika.sdk.runtime.models.drawio.impl.DrawioPackageImpl#getDocument()
	 * @generated
	 */
	int DOCUMENT = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__ID = PresentationPackage.PRESENTATION__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__DOCUMENTATION = PresentationPackage.PRESENTATION__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__DOC_REF = PresentationPackage.PRESENTATION__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__DOC_FORMAT = PresentationPackage.PRESENTATION__DOC_FORMAT;

	/**
	 * The feature id for the '<em><b>Doc Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__DOC_CONTENTS = PresentationPackage.PRESENTATION__DOC_CONTENTS;

	/**
	 * The feature id for the '<em><b>Doc Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__DOC_SECTIONS = PresentationPackage.PRESENTATION__DOC_SECTIONS;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__MARKERS = PresentationPackage.PRESENTATION__MARKERS;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__ICON = PresentationPackage.PRESENTATION__ICON;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__URIS = PresentationPackage.PRESENTATION__URIS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__NAME = PresentationPackage.PRESENTATION__NAME;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__PROPERTIES = PresentationPackage.PRESENTATION__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Semantic Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__SEMANTIC_ELEMENTS = PresentationPackage.PRESENTATION__SEMANTIC_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__CHILDREN = PresentationPackage.PRESENTATION__CHILDREN;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__WIDTH = PresentationPackage.PRESENTATION__WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__HEIGHT = PresentationPackage.PRESENTATION__HEIGHT;

	/**
	 * The feature id for the '<em><b>Slides</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__SLIDES = PresentationPackage.PRESENTATION__SLIDES;

	/**
	 * The feature id for the '<em><b>Master Slides</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__MASTER_SLIDES = PresentationPackage.PRESENTATION__MASTER_SLIDES;

	/**
	 * The feature id for the '<em><b>Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__HOST = PresentationPackage.PRESENTATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Agent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__AGENT = PresentationPackage.PRESENTATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__VERSION = PresentationPackage.PRESENTATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Compressed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__COMPRESSED = PresentationPackage.PRESENTATION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Document</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_FEATURE_COUNT = PresentationPackage.PRESENTATION_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT___COLLECT__OBJECT_EREFERENCE_ELIST = PresentationPackage.PRESENTATION___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT___GET_REFERRERS__EREFERENCE = PresentationPackage.PRESENTATION___GET_REFERRERS__EREFERENCE;

	/**
	 * The number of operations of the '<em>Document</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_OPERATION_COUNT = PresentationPackage.PRESENTATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.drawio.LinkTarget <em>Link Target</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.drawio.LinkTarget
	 * @see org.nasdanika.sdk.runtime.models.drawio.impl.DrawioPackageImpl#getLinkTarget()
	 * @generated
	 */
	int LINK_TARGET = 1;

	/**
	 * The number of structural features of the '<em>Link Target</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_TARGET_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Link Target</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_TARGET_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.drawio.impl.PageImpl <em>Page</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.drawio.impl.PageImpl
	 * @see org.nasdanika.sdk.runtime.models.drawio.impl.DrawioPackageImpl#getPage()
	 * @generated
	 */
	int PAGE = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__ID = PresentationPackage.SLIDE__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__DOCUMENTATION = PresentationPackage.SLIDE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__DOC_REF = PresentationPackage.SLIDE__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__DOC_FORMAT = PresentationPackage.SLIDE__DOC_FORMAT;

	/**
	 * The feature id for the '<em><b>Doc Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__DOC_CONTENTS = PresentationPackage.SLIDE__DOC_CONTENTS;

	/**
	 * The feature id for the '<em><b>Doc Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__DOC_SECTIONS = PresentationPackage.SLIDE__DOC_SECTIONS;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__MARKERS = PresentationPackage.SLIDE__MARKERS;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__ICON = PresentationPackage.SLIDE__ICON;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__URIS = PresentationPackage.SLIDE__URIS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__NAME = PresentationPackage.SLIDE__NAME;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__PROPERTIES = PresentationPackage.SLIDE__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Semantic Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__SEMANTIC_ELEMENTS = PresentationPackage.SLIDE__SEMANTIC_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__CHILDREN = PresentationPackage.SLIDE__CHILDREN;

	/**
	 * The feature id for the '<em><b>Master</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__MASTER = PresentationPackage.SLIDE__MASTER;

	/**
	 * The feature id for the '<em><b>Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__HIDDEN = PresentationPackage.SLIDE__HIDDEN;

	/**
	 * The feature id for the '<em><b>Notes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__NOTES = PresentationPackage.SLIDE__NOTES;

	/**
	 * The feature id for the '<em><b>Dx</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__DX = PresentationPackage.SLIDE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Dy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__DY = PresentationPackage.SLIDE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Page Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__PAGE_WIDTH = PresentationPackage.SLIDE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Page Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__PAGE_HEIGHT = PresentationPackage.SLIDE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Grid Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__GRID_SIZE = PresentationPackage.SLIDE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__TAGS = PresentationPackage.SLIDE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_FEATURE_COUNT = PresentationPackage.SLIDE_FEATURE_COUNT + 6;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE___COLLECT__OBJECT_EREFERENCE_ELIST = PresentationPackage.SLIDE___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE___GET_REFERRERS__EREFERENCE = PresentationPackage.SLIDE___GET_REFERRERS__EREFERENCE;

	/**
	 * The number of operations of the '<em>Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_OPERATION_COUNT = PresentationPackage.SLIDE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.drawio.impl.LayerImpl <em>Layer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.drawio.impl.LayerImpl
	 * @see org.nasdanika.sdk.runtime.models.drawio.impl.DrawioPackageImpl#getLayer()
	 * @generated
	 */
	int LAYER = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER__ID = DiagramPackage.LAYER__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER__DOCUMENTATION = DiagramPackage.LAYER__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER__DOC_REF = DiagramPackage.LAYER__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER__DOC_FORMAT = DiagramPackage.LAYER__DOC_FORMAT;

	/**
	 * The feature id for the '<em><b>Doc Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER__DOC_CONTENTS = DiagramPackage.LAYER__DOC_CONTENTS;

	/**
	 * The feature id for the '<em><b>Doc Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER__DOC_SECTIONS = DiagramPackage.LAYER__DOC_SECTIONS;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER__MARKERS = DiagramPackage.LAYER__MARKERS;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER__ICON = DiagramPackage.LAYER__ICON;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER__URIS = DiagramPackage.LAYER__URIS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER__NAME = DiagramPackage.LAYER__NAME;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER__PROPERTIES = DiagramPackage.LAYER__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Semantic Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER__SEMANTIC_ELEMENTS = DiagramPackage.LAYER__SEMANTIC_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER__CHILDREN = DiagramPackage.LAYER__CHILDREN;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER__VISIBLE = DiagramPackage.LAYER__VISIBLE;

	/**
	 * The feature id for the '<em><b>Locked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER__LOCKED = DiagramPackage.LAYER__LOCKED;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER__STYLE = DiagramPackage.LAYER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Layer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_FEATURE_COUNT = DiagramPackage.LAYER_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER___COLLECT__OBJECT_EREFERENCE_ELIST = DiagramPackage.LAYER___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER___GET_REFERRERS__EREFERENCE = DiagramPackage.LAYER___GET_REFERRERS__EREFERENCE;

	/**
	 * The number of operations of the '<em>Layer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_OPERATION_COUNT = DiagramPackage.LAYER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.drawio.ModelElement <em>Model Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.drawio.ModelElement
	 * @see org.nasdanika.sdk.runtime.models.drawio.impl.DrawioPackageImpl#getModelElement()
	 * @generated
	 */
	int MODEL_ELEMENT = 4;

	/**
	 * The feature id for the '<em><b>Link</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT__LINK = LINK_TARGET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT__TAGS = LINK_TARGET_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Model Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT_FEATURE_COUNT = LINK_TARGET_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Model Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT_OPERATION_COUNT = LINK_TARGET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.drawio.impl.NodeImpl <em>Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.drawio.impl.NodeImpl
	 * @see org.nasdanika.sdk.runtime.models.drawio.impl.DrawioPackageImpl#getNode()
	 * @generated
	 */
	int NODE = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__ID = DiagramPackage.NODE__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__DOCUMENTATION = DiagramPackage.NODE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__DOC_REF = DiagramPackage.NODE__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__DOC_FORMAT = DiagramPackage.NODE__DOC_FORMAT;

	/**
	 * The feature id for the '<em><b>Doc Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__DOC_CONTENTS = DiagramPackage.NODE__DOC_CONTENTS;

	/**
	 * The feature id for the '<em><b>Doc Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__DOC_SECTIONS = DiagramPackage.NODE__DOC_SECTIONS;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__MARKERS = DiagramPackage.NODE__MARKERS;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__ICON = DiagramPackage.NODE__ICON;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__URIS = DiagramPackage.NODE__URIS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__NAME = DiagramPackage.NODE__NAME;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__PROPERTIES = DiagramPackage.NODE__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Semantic Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__SEMANTIC_ELEMENTS = DiagramPackage.NODE__SEMANTIC_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__CHILDREN = DiagramPackage.NODE__CHILDREN;

	/**
	 * The feature id for the '<em><b>Incoming Connections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__INCOMING_CONNECTIONS = DiagramPackage.NODE__INCOMING_CONNECTIONS;

	/**
	 * The feature id for the '<em><b>Outgoing Connections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__OUTGOING_CONNECTIONS = DiagramPackage.NODE__OUTGOING_CONNECTIONS;

	/**
	 * The feature id for the '<em><b>Bounds</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__BOUNDS = DiagramPackage.NODE__BOUNDS;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__PORTS = DiagramPackage.NODE__PORTS;

	/**
	 * The feature id for the '<em><b>Link</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__LINK = DiagramPackage.NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__TAGS = DiagramPackage.NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__STYLE = DiagramPackage.NODE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__LABEL = DiagramPackage.NODE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Collapsed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__COLLAPSED = DiagramPackage.NODE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_FEATURE_COUNT = DiagramPackage.NODE_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE___COLLECT__OBJECT_EREFERENCE_ELIST = DiagramPackage.NODE___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE___GET_REFERRERS__EREFERENCE = DiagramPackage.NODE___GET_REFERRERS__EREFERENCE;

	/**
	 * The number of operations of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_OPERATION_COUNT = DiagramPackage.NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.drawio.impl.ConnectionImpl <em>Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.drawio.impl.ConnectionImpl
	 * @see org.nasdanika.sdk.runtime.models.drawio.impl.DrawioPackageImpl#getConnection()
	 * @generated
	 */
	int CONNECTION = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__ID = DiagramPackage.CONNECTION__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__DOCUMENTATION = DiagramPackage.CONNECTION__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__DOC_REF = DiagramPackage.CONNECTION__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__DOC_FORMAT = DiagramPackage.CONNECTION__DOC_FORMAT;

	/**
	 * The feature id for the '<em><b>Doc Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__DOC_CONTENTS = DiagramPackage.CONNECTION__DOC_CONTENTS;

	/**
	 * The feature id for the '<em><b>Doc Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__DOC_SECTIONS = DiagramPackage.CONNECTION__DOC_SECTIONS;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__MARKERS = DiagramPackage.CONNECTION__MARKERS;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__ICON = DiagramPackage.CONNECTION__ICON;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__URIS = DiagramPackage.CONNECTION__URIS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__NAME = DiagramPackage.CONNECTION__NAME;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__PROPERTIES = DiagramPackage.CONNECTION__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Semantic Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__SEMANTIC_ELEMENTS = DiagramPackage.CONNECTION__SEMANTIC_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__CHILDREN = DiagramPackage.CONNECTION__CHILDREN;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__SOURCE = DiagramPackage.CONNECTION__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__TARGET = DiagramPackage.CONNECTION__TARGET;

	/**
	 * The feature id for the '<em><b>Waypoints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__WAYPOINTS = DiagramPackage.CONNECTION__WAYPOINTS;

	/**
	 * The feature id for the '<em><b>Link</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__LINK = DiagramPackage.CONNECTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__TAGS = DiagramPackage.CONNECTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__STYLE = DiagramPackage.CONNECTION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__LABEL = DiagramPackage.CONNECTION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_FEATURE_COUNT = DiagramPackage.CONNECTION_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION___COLLECT__OBJECT_EREFERENCE_ELIST = DiagramPackage.CONNECTION___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION___GET_REFERRERS__EREFERENCE = DiagramPackage.CONNECTION___GET_REFERRERS__EREFERENCE;

	/**
	 * The number of operations of the '<em>Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_OPERATION_COUNT = DiagramPackage.CONNECTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.drawio.impl.TagImpl <em>Tag</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.drawio.impl.TagImpl
	 * @see org.nasdanika.sdk.runtime.models.drawio.impl.DrawioPackageImpl#getTag()
	 * @generated
	 */
	int TAG = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG__ID = CorePackage.STRING_IDENTITY__ID;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG__ELEMENTS = CorePackage.STRING_IDENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Tag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_FEATURE_COUNT = CorePackage.STRING_IDENTITY_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG___COLLECT__OBJECT_EREFERENCE_ELIST = CorePackage.STRING_IDENTITY___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG___GET_REFERRERS__EREFERENCE = CorePackage.STRING_IDENTITY___GET_REFERRERS__EREFERENCE;

	/**
	 * The number of operations of the '<em>Tag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_OPERATION_COUNT = CorePackage.STRING_IDENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.drawio.impl.AbstractLinkImpl <em>Abstract Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.drawio.impl.AbstractLinkImpl
	 * @see org.nasdanika.sdk.runtime.models.drawio.impl.DrawioPackageImpl#getAbstractLink()
	 * @generated
	 */
	int ABSTRACT_LINK = 8;

	/**
	 * The number of structural features of the '<em>Abstract Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_LINK_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Abstract Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_LINK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.drawio.impl.SimpleLinkImpl <em>Simple Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.drawio.impl.SimpleLinkImpl
	 * @see org.nasdanika.sdk.runtime.models.drawio.impl.DrawioPackageImpl#getSimpleLink()
	 * @generated
	 */
	int SIMPLE_LINK = 9;

	/**
	 * The feature id for the '<em><b>Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_LINK__TARGET = ABSTRACT_LINK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Simple Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_LINK_FEATURE_COUNT = ABSTRACT_LINK_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Simple Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_LINK_OPERATION_COUNT = ABSTRACT_LINK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.drawio.impl.CustomLinkImpl <em>Custom Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.drawio.impl.CustomLinkImpl
	 * @see org.nasdanika.sdk.runtime.models.drawio.impl.DrawioPackageImpl#getCustomLink()
	 * @generated
	 */
	int CUSTOM_LINK = 10;

	/**
	 * The feature id for the '<em><b>Resource</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_LINK__RESOURCE = ABSTRACT_LINK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_LINK__TARGET = ABSTRACT_LINK_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Page Selector Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_LINK__PAGE_SELECTOR_TYPE = ABSTRACT_LINK_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Page Selector</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_LINK__PAGE_SELECTOR = ABSTRACT_LINK_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Element Selector Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_LINK__ELEMENT_SELECTOR_TYPE = ABSTRACT_LINK_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Element Selector</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_LINK__ELEMENT_SELECTOR = ABSTRACT_LINK_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Custom Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_LINK_FEATURE_COUNT = ABSTRACT_LINK_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Custom Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_LINK_OPERATION_COUNT = ABSTRACT_LINK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.drawio.impl.SpelLinkImpl <em>Spel Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.drawio.impl.SpelLinkImpl
	 * @see org.nasdanika.sdk.runtime.models.drawio.impl.DrawioPackageImpl#getSpelLink()
	 * @generated
	 */
	int SPEL_LINK = 11;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEL_LINK__EXPRESSION = ABSTRACT_LINK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Spel Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEL_LINK_FEATURE_COUNT = ABSTRACT_LINK_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Spel Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEL_LINK_OPERATION_COUNT = ABSTRACT_LINK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.drawio.impl.ActionsImpl <em>Actions</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.drawio.impl.ActionsImpl
	 * @see org.nasdanika.sdk.runtime.models.drawio.impl.DrawioPackageImpl#getActions()
	 * @generated
	 */
	int ACTIONS = 12;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIONS__TITLE = ABSTRACT_LINK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIONS__ACTIONS = ABSTRACT_LINK_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Actions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIONS_FEATURE_COUNT = ABSTRACT_LINK_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Actions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIONS_OPERATION_COUNT = ABSTRACT_LINK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.drawio.impl.AnimationImpl <em>Animation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.drawio.impl.AnimationImpl
	 * @see org.nasdanika.sdk.runtime.models.drawio.impl.DrawioPackageImpl#getAnimation()
	 * @generated
	 */
	int ANIMATION = 13;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANIMATION__ENABLED = 0;

	/**
	 * The feature id for the '<em><b>Loop</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANIMATION__LOOP = 1;

	/**
	 * The feature id for the '<em><b>Steps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANIMATION__STEPS = 2;

	/**
	 * The number of structural features of the '<em>Animation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANIMATION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Animation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANIMATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.drawio.impl.ActionImpl <em>Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.drawio.impl.ActionImpl
	 * @see org.nasdanika.sdk.runtime.models.drawio.impl.DrawioPackageImpl#getAction()
	 * @generated
	 */
	int ACTION = 14;

	/**
	 * The feature id for the '<em><b>Immediate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__IMMEDIATE = 0;

	/**
	 * The number of structural features of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.drawio.impl.WaitImpl <em>Wait</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.drawio.impl.WaitImpl
	 * @see org.nasdanika.sdk.runtime.models.drawio.impl.DrawioPackageImpl#getWait()
	 * @generated
	 */
	int WAIT = 15;

	/**
	 * The feature id for the '<em><b>Immediate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAIT__IMMEDIATE = ACTION__IMMEDIATE;

	/**
	 * The feature id for the '<em><b>Delay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAIT__DELAY = ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Wait</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAIT_FEATURE_COUNT = ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Wait</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAIT_OPERATION_COUNT = ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.drawio.impl.TargetedActionImpl <em>Targeted Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.drawio.impl.TargetedActionImpl
	 * @see org.nasdanika.sdk.runtime.models.drawio.impl.DrawioPackageImpl#getTargetedAction()
	 * @generated
	 */
	int TARGETED_ACTION = 16;

	/**
	 * The feature id for the '<em><b>Immediate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGETED_ACTION__IMMEDIATE = ACTION__IMMEDIATE;

	/**
	 * The feature id for the '<em><b>Cells</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGETED_ACTION__CELLS = ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>All Cells</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGETED_ACTION__ALL_CELLS = ACTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Layers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGETED_ACTION__LAYERS = ACTION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGETED_ACTION__TAGS = ACTION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Tags Match</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGETED_ACTION__TAGS_MATCH = ACTION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Exclude Cells</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGETED_ACTION__EXCLUDE_CELLS = ACTION_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Targeted Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGETED_ACTION_FEATURE_COUNT = ACTION_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Targeted Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGETED_ACTION_OPERATION_COUNT = ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.drawio.impl.PersistableActionImpl <em>Persistable Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.drawio.impl.PersistableActionImpl
	 * @see org.nasdanika.sdk.runtime.models.drawio.impl.DrawioPackageImpl#getPersistableAction()
	 * @generated
	 */
	int PERSISTABLE_ACTION = 17;

	/**
	 * The feature id for the '<em><b>Immediate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTABLE_ACTION__IMMEDIATE = TARGETED_ACTION__IMMEDIATE;

	/**
	 * The feature id for the '<em><b>Cells</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTABLE_ACTION__CELLS = TARGETED_ACTION__CELLS;

	/**
	 * The feature id for the '<em><b>All Cells</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTABLE_ACTION__ALL_CELLS = TARGETED_ACTION__ALL_CELLS;

	/**
	 * The feature id for the '<em><b>Layers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTABLE_ACTION__LAYERS = TARGETED_ACTION__LAYERS;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTABLE_ACTION__TAGS = TARGETED_ACTION__TAGS;

	/**
	 * The feature id for the '<em><b>Tags Match</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTABLE_ACTION__TAGS_MATCH = TARGETED_ACTION__TAGS_MATCH;

	/**
	 * The feature id for the '<em><b>Exclude Cells</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTABLE_ACTION__EXCLUDE_CELLS = TARGETED_ACTION__EXCLUDE_CELLS;

	/**
	 * The feature id for the '<em><b>Persist Changes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTABLE_ACTION__PERSIST_CHANGES = TARGETED_ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Persistable Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTABLE_ACTION_FEATURE_COUNT = TARGETED_ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Persistable Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTABLE_ACTION_OPERATION_COUNT = TARGETED_ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.drawio.impl.ShowImpl <em>Show</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.drawio.impl.ShowImpl
	 * @see org.nasdanika.sdk.runtime.models.drawio.impl.DrawioPackageImpl#getShow()
	 * @generated
	 */
	int SHOW = 18;

	/**
	 * The feature id for the '<em><b>Immediate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOW__IMMEDIATE = PERSISTABLE_ACTION__IMMEDIATE;

	/**
	 * The feature id for the '<em><b>Cells</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOW__CELLS = PERSISTABLE_ACTION__CELLS;

	/**
	 * The feature id for the '<em><b>All Cells</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOW__ALL_CELLS = PERSISTABLE_ACTION__ALL_CELLS;

	/**
	 * The feature id for the '<em><b>Layers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOW__LAYERS = PERSISTABLE_ACTION__LAYERS;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOW__TAGS = PERSISTABLE_ACTION__TAGS;

	/**
	 * The feature id for the '<em><b>Tags Match</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOW__TAGS_MATCH = PERSISTABLE_ACTION__TAGS_MATCH;

	/**
	 * The feature id for the '<em><b>Exclude Cells</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOW__EXCLUDE_CELLS = PERSISTABLE_ACTION__EXCLUDE_CELLS;

	/**
	 * The feature id for the '<em><b>Persist Changes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOW__PERSIST_CHANGES = PERSISTABLE_ACTION__PERSIST_CHANGES;

	/**
	 * The number of structural features of the '<em>Show</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOW_FEATURE_COUNT = PERSISTABLE_ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Show</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOW_OPERATION_COUNT = PERSISTABLE_ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.drawio.impl.HideImpl <em>Hide</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.drawio.impl.HideImpl
	 * @see org.nasdanika.sdk.runtime.models.drawio.impl.DrawioPackageImpl#getHide()
	 * @generated
	 */
	int HIDE = 19;

	/**
	 * The feature id for the '<em><b>Immediate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIDE__IMMEDIATE = PERSISTABLE_ACTION__IMMEDIATE;

	/**
	 * The feature id for the '<em><b>Cells</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIDE__CELLS = PERSISTABLE_ACTION__CELLS;

	/**
	 * The feature id for the '<em><b>All Cells</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIDE__ALL_CELLS = PERSISTABLE_ACTION__ALL_CELLS;

	/**
	 * The feature id for the '<em><b>Layers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIDE__LAYERS = PERSISTABLE_ACTION__LAYERS;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIDE__TAGS = PERSISTABLE_ACTION__TAGS;

	/**
	 * The feature id for the '<em><b>Tags Match</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIDE__TAGS_MATCH = PERSISTABLE_ACTION__TAGS_MATCH;

	/**
	 * The feature id for the '<em><b>Exclude Cells</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIDE__EXCLUDE_CELLS = PERSISTABLE_ACTION__EXCLUDE_CELLS;

	/**
	 * The feature id for the '<em><b>Persist Changes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIDE__PERSIST_CHANGES = PERSISTABLE_ACTION__PERSIST_CHANGES;

	/**
	 * The number of structural features of the '<em>Hide</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIDE_FEATURE_COUNT = PERSISTABLE_ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Hide</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIDE_OPERATION_COUNT = PERSISTABLE_ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.drawio.impl.ToggleImpl <em>Toggle</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.drawio.impl.ToggleImpl
	 * @see org.nasdanika.sdk.runtime.models.drawio.impl.DrawioPackageImpl#getToggle()
	 * @generated
	 */
	int TOGGLE = 20;

	/**
	 * The feature id for the '<em><b>Immediate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOGGLE__IMMEDIATE = PERSISTABLE_ACTION__IMMEDIATE;

	/**
	 * The feature id for the '<em><b>Cells</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOGGLE__CELLS = PERSISTABLE_ACTION__CELLS;

	/**
	 * The feature id for the '<em><b>All Cells</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOGGLE__ALL_CELLS = PERSISTABLE_ACTION__ALL_CELLS;

	/**
	 * The feature id for the '<em><b>Layers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOGGLE__LAYERS = PERSISTABLE_ACTION__LAYERS;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOGGLE__TAGS = PERSISTABLE_ACTION__TAGS;

	/**
	 * The feature id for the '<em><b>Tags Match</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOGGLE__TAGS_MATCH = PERSISTABLE_ACTION__TAGS_MATCH;

	/**
	 * The feature id for the '<em><b>Exclude Cells</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOGGLE__EXCLUDE_CELLS = PERSISTABLE_ACTION__EXCLUDE_CELLS;

	/**
	 * The feature id for the '<em><b>Persist Changes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOGGLE__PERSIST_CHANGES = PERSISTABLE_ACTION__PERSIST_CHANGES;

	/**
	 * The number of structural features of the '<em>Toggle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOGGLE_FEATURE_COUNT = PERSISTABLE_ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Toggle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOGGLE_OPERATION_COUNT = PERSISTABLE_ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.drawio.impl.SetOpacityImpl <em>Set Opacity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.drawio.impl.SetOpacityImpl
	 * @see org.nasdanika.sdk.runtime.models.drawio.impl.DrawioPackageImpl#getSetOpacity()
	 * @generated
	 */
	int SET_OPACITY = 21;

	/**
	 * The feature id for the '<em><b>Immediate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_OPACITY__IMMEDIATE = TARGETED_ACTION__IMMEDIATE;

	/**
	 * The feature id for the '<em><b>Cells</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_OPACITY__CELLS = TARGETED_ACTION__CELLS;

	/**
	 * The feature id for the '<em><b>All Cells</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_OPACITY__ALL_CELLS = TARGETED_ACTION__ALL_CELLS;

	/**
	 * The feature id for the '<em><b>Layers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_OPACITY__LAYERS = TARGETED_ACTION__LAYERS;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_OPACITY__TAGS = TARGETED_ACTION__TAGS;

	/**
	 * The feature id for the '<em><b>Tags Match</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_OPACITY__TAGS_MATCH = TARGETED_ACTION__TAGS_MATCH;

	/**
	 * The feature id for the '<em><b>Exclude Cells</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_OPACITY__EXCLUDE_CELLS = TARGETED_ACTION__EXCLUDE_CELLS;

	/**
	 * The feature id for the '<em><b>Opacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_OPACITY__OPACITY = TARGETED_ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Set Opacity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_OPACITY_FEATURE_COUNT = TARGETED_ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Set Opacity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_OPACITY_OPERATION_COUNT = TARGETED_ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.drawio.impl.TransitionEffectImpl <em>Transition Effect</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.drawio.impl.TransitionEffectImpl
	 * @see org.nasdanika.sdk.runtime.models.drawio.impl.DrawioPackageImpl#getTransitionEffect()
	 * @generated
	 */
	int TRANSITION_EFFECT = 22;

	/**
	 * The feature id for the '<em><b>Immediate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_EFFECT__IMMEDIATE = TARGETED_ACTION__IMMEDIATE;

	/**
	 * The feature id for the '<em><b>Cells</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_EFFECT__CELLS = TARGETED_ACTION__CELLS;

	/**
	 * The feature id for the '<em><b>All Cells</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_EFFECT__ALL_CELLS = TARGETED_ACTION__ALL_CELLS;

	/**
	 * The feature id for the '<em><b>Layers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_EFFECT__LAYERS = TARGETED_ACTION__LAYERS;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_EFFECT__TAGS = TARGETED_ACTION__TAGS;

	/**
	 * The feature id for the '<em><b>Tags Match</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_EFFECT__TAGS_MATCH = TARGETED_ACTION__TAGS_MATCH;

	/**
	 * The feature id for the '<em><b>Exclude Cells</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_EFFECT__EXCLUDE_CELLS = TARGETED_ACTION__EXCLUDE_CELLS;

	/**
	 * The feature id for the '<em><b>Delay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_EFFECT__DELAY = TARGETED_ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Transition Effect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_EFFECT_FEATURE_COUNT = TARGETED_ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Transition Effect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_EFFECT_OPERATION_COUNT = TARGETED_ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.drawio.impl.FadeInImpl <em>Fade In</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.drawio.impl.FadeInImpl
	 * @see org.nasdanika.sdk.runtime.models.drawio.impl.DrawioPackageImpl#getFadeIn()
	 * @generated
	 */
	int FADE_IN = 23;

	/**
	 * The feature id for the '<em><b>Immediate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FADE_IN__IMMEDIATE = TRANSITION_EFFECT__IMMEDIATE;

	/**
	 * The feature id for the '<em><b>Cells</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FADE_IN__CELLS = TRANSITION_EFFECT__CELLS;

	/**
	 * The feature id for the '<em><b>All Cells</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FADE_IN__ALL_CELLS = TRANSITION_EFFECT__ALL_CELLS;

	/**
	 * The feature id for the '<em><b>Layers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FADE_IN__LAYERS = TRANSITION_EFFECT__LAYERS;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FADE_IN__TAGS = TRANSITION_EFFECT__TAGS;

	/**
	 * The feature id for the '<em><b>Tags Match</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FADE_IN__TAGS_MATCH = TRANSITION_EFFECT__TAGS_MATCH;

	/**
	 * The feature id for the '<em><b>Exclude Cells</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FADE_IN__EXCLUDE_CELLS = TRANSITION_EFFECT__EXCLUDE_CELLS;

	/**
	 * The feature id for the '<em><b>Delay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FADE_IN__DELAY = TRANSITION_EFFECT__DELAY;

	/**
	 * The number of structural features of the '<em>Fade In</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FADE_IN_FEATURE_COUNT = TRANSITION_EFFECT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Fade In</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FADE_IN_OPERATION_COUNT = TRANSITION_EFFECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.drawio.impl.FadeOutImpl <em>Fade Out</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.drawio.impl.FadeOutImpl
	 * @see org.nasdanika.sdk.runtime.models.drawio.impl.DrawioPackageImpl#getFadeOut()
	 * @generated
	 */
	int FADE_OUT = 24;

	/**
	 * The feature id for the '<em><b>Immediate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FADE_OUT__IMMEDIATE = TRANSITION_EFFECT__IMMEDIATE;

	/**
	 * The feature id for the '<em><b>Cells</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FADE_OUT__CELLS = TRANSITION_EFFECT__CELLS;

	/**
	 * The feature id for the '<em><b>All Cells</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FADE_OUT__ALL_CELLS = TRANSITION_EFFECT__ALL_CELLS;

	/**
	 * The feature id for the '<em><b>Layers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FADE_OUT__LAYERS = TRANSITION_EFFECT__LAYERS;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FADE_OUT__TAGS = TRANSITION_EFFECT__TAGS;

	/**
	 * The feature id for the '<em><b>Tags Match</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FADE_OUT__TAGS_MATCH = TRANSITION_EFFECT__TAGS_MATCH;

	/**
	 * The feature id for the '<em><b>Exclude Cells</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FADE_OUT__EXCLUDE_CELLS = TRANSITION_EFFECT__EXCLUDE_CELLS;

	/**
	 * The feature id for the '<em><b>Delay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FADE_OUT__DELAY = TRANSITION_EFFECT__DELAY;

	/**
	 * The number of structural features of the '<em>Fade Out</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FADE_OUT_FEATURE_COUNT = TRANSITION_EFFECT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Fade Out</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FADE_OUT_OPERATION_COUNT = TRANSITION_EFFECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.drawio.impl.FadeToImpl <em>Fade To</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.drawio.impl.FadeToImpl
	 * @see org.nasdanika.sdk.runtime.models.drawio.impl.DrawioPackageImpl#getFadeTo()
	 * @generated
	 */
	int FADE_TO = 25;

	/**
	 * The feature id for the '<em><b>Immediate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FADE_TO__IMMEDIATE = TRANSITION_EFFECT__IMMEDIATE;

	/**
	 * The feature id for the '<em><b>Cells</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FADE_TO__CELLS = TRANSITION_EFFECT__CELLS;

	/**
	 * The feature id for the '<em><b>All Cells</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FADE_TO__ALL_CELLS = TRANSITION_EFFECT__ALL_CELLS;

	/**
	 * The feature id for the '<em><b>Layers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FADE_TO__LAYERS = TRANSITION_EFFECT__LAYERS;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FADE_TO__TAGS = TRANSITION_EFFECT__TAGS;

	/**
	 * The feature id for the '<em><b>Tags Match</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FADE_TO__TAGS_MATCH = TRANSITION_EFFECT__TAGS_MATCH;

	/**
	 * The feature id for the '<em><b>Exclude Cells</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FADE_TO__EXCLUDE_CELLS = TRANSITION_EFFECT__EXCLUDE_CELLS;

	/**
	 * The feature id for the '<em><b>Delay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FADE_TO__DELAY = TRANSITION_EFFECT__DELAY;

	/**
	 * The feature id for the '<em><b>Opacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FADE_TO__OPACITY = TRANSITION_EFFECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Fade To</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FADE_TO_FEATURE_COUNT = TRANSITION_EFFECT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Fade To</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FADE_TO_OPERATION_COUNT = TRANSITION_EFFECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.drawio.impl.WipeInImpl <em>Wipe In</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.drawio.impl.WipeInImpl
	 * @see org.nasdanika.sdk.runtime.models.drawio.impl.DrawioPackageImpl#getWipeIn()
	 * @generated
	 */
	int WIPE_IN = 26;

	/**
	 * The feature id for the '<em><b>Immediate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIPE_IN__IMMEDIATE = TRANSITION_EFFECT__IMMEDIATE;

	/**
	 * The feature id for the '<em><b>Cells</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIPE_IN__CELLS = TRANSITION_EFFECT__CELLS;

	/**
	 * The feature id for the '<em><b>All Cells</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIPE_IN__ALL_CELLS = TRANSITION_EFFECT__ALL_CELLS;

	/**
	 * The feature id for the '<em><b>Layers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIPE_IN__LAYERS = TRANSITION_EFFECT__LAYERS;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIPE_IN__TAGS = TRANSITION_EFFECT__TAGS;

	/**
	 * The feature id for the '<em><b>Tags Match</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIPE_IN__TAGS_MATCH = TRANSITION_EFFECT__TAGS_MATCH;

	/**
	 * The feature id for the '<em><b>Exclude Cells</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIPE_IN__EXCLUDE_CELLS = TRANSITION_EFFECT__EXCLUDE_CELLS;

	/**
	 * The feature id for the '<em><b>Delay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIPE_IN__DELAY = TRANSITION_EFFECT__DELAY;

	/**
	 * The number of structural features of the '<em>Wipe In</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIPE_IN_FEATURE_COUNT = TRANSITION_EFFECT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Wipe In</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIPE_IN_OPERATION_COUNT = TRANSITION_EFFECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.drawio.impl.WipeOutImpl <em>Wipe Out</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.drawio.impl.WipeOutImpl
	 * @see org.nasdanika.sdk.runtime.models.drawio.impl.DrawioPackageImpl#getWipeOut()
	 * @generated
	 */
	int WIPE_OUT = 27;

	/**
	 * The feature id for the '<em><b>Immediate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIPE_OUT__IMMEDIATE = TRANSITION_EFFECT__IMMEDIATE;

	/**
	 * The feature id for the '<em><b>Cells</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIPE_OUT__CELLS = TRANSITION_EFFECT__CELLS;

	/**
	 * The feature id for the '<em><b>All Cells</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIPE_OUT__ALL_CELLS = TRANSITION_EFFECT__ALL_CELLS;

	/**
	 * The feature id for the '<em><b>Layers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIPE_OUT__LAYERS = TRANSITION_EFFECT__LAYERS;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIPE_OUT__TAGS = TRANSITION_EFFECT__TAGS;

	/**
	 * The feature id for the '<em><b>Tags Match</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIPE_OUT__TAGS_MATCH = TRANSITION_EFFECT__TAGS_MATCH;

	/**
	 * The feature id for the '<em><b>Exclude Cells</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIPE_OUT__EXCLUDE_CELLS = TRANSITION_EFFECT__EXCLUDE_CELLS;

	/**
	 * The feature id for the '<em><b>Delay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIPE_OUT__DELAY = TRANSITION_EFFECT__DELAY;

	/**
	 * The number of structural features of the '<em>Wipe Out</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIPE_OUT_FEATURE_COUNT = TRANSITION_EFFECT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Wipe Out</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIPE_OUT_OPERATION_COUNT = TRANSITION_EFFECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.drawio.impl.PopInImpl <em>Pop In</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.drawio.impl.PopInImpl
	 * @see org.nasdanika.sdk.runtime.models.drawio.impl.DrawioPackageImpl#getPopIn()
	 * @generated
	 */
	int POP_IN = 28;

	/**
	 * The feature id for the '<em><b>Immediate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POP_IN__IMMEDIATE = TRANSITION_EFFECT__IMMEDIATE;

	/**
	 * The feature id for the '<em><b>Cells</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POP_IN__CELLS = TRANSITION_EFFECT__CELLS;

	/**
	 * The feature id for the '<em><b>All Cells</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POP_IN__ALL_CELLS = TRANSITION_EFFECT__ALL_CELLS;

	/**
	 * The feature id for the '<em><b>Layers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POP_IN__LAYERS = TRANSITION_EFFECT__LAYERS;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POP_IN__TAGS = TRANSITION_EFFECT__TAGS;

	/**
	 * The feature id for the '<em><b>Tags Match</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POP_IN__TAGS_MATCH = TRANSITION_EFFECT__TAGS_MATCH;

	/**
	 * The feature id for the '<em><b>Exclude Cells</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POP_IN__EXCLUDE_CELLS = TRANSITION_EFFECT__EXCLUDE_CELLS;

	/**
	 * The feature id for the '<em><b>Delay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POP_IN__DELAY = TRANSITION_EFFECT__DELAY;

	/**
	 * The number of structural features of the '<em>Pop In</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POP_IN_FEATURE_COUNT = TRANSITION_EFFECT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Pop In</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POP_IN_OPERATION_COUNT = TRANSITION_EFFECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.drawio.impl.PopOutImpl <em>Pop Out</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.drawio.impl.PopOutImpl
	 * @see org.nasdanika.sdk.runtime.models.drawio.impl.DrawioPackageImpl#getPopOut()
	 * @generated
	 */
	int POP_OUT = 29;

	/**
	 * The feature id for the '<em><b>Immediate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POP_OUT__IMMEDIATE = TRANSITION_EFFECT__IMMEDIATE;

	/**
	 * The feature id for the '<em><b>Cells</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POP_OUT__CELLS = TRANSITION_EFFECT__CELLS;

	/**
	 * The feature id for the '<em><b>All Cells</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POP_OUT__ALL_CELLS = TRANSITION_EFFECT__ALL_CELLS;

	/**
	 * The feature id for the '<em><b>Layers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POP_OUT__LAYERS = TRANSITION_EFFECT__LAYERS;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POP_OUT__TAGS = TRANSITION_EFFECT__TAGS;

	/**
	 * The feature id for the '<em><b>Tags Match</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POP_OUT__TAGS_MATCH = TRANSITION_EFFECT__TAGS_MATCH;

	/**
	 * The feature id for the '<em><b>Exclude Cells</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POP_OUT__EXCLUDE_CELLS = TRANSITION_EFFECT__EXCLUDE_CELLS;

	/**
	 * The feature id for the '<em><b>Delay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POP_OUT__DELAY = TRANSITION_EFFECT__DELAY;

	/**
	 * The number of structural features of the '<em>Pop Out</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POP_OUT_FEATURE_COUNT = TRANSITION_EFFECT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Pop Out</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POP_OUT_OPERATION_COUNT = TRANSITION_EFFECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.drawio.impl.SetStyleImpl <em>Set Style</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.drawio.impl.SetStyleImpl
	 * @see org.nasdanika.sdk.runtime.models.drawio.impl.DrawioPackageImpl#getSetStyle()
	 * @generated
	 */
	int SET_STYLE = 30;

	/**
	 * The feature id for the '<em><b>Immediate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_STYLE__IMMEDIATE = PERSISTABLE_ACTION__IMMEDIATE;

	/**
	 * The feature id for the '<em><b>Cells</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_STYLE__CELLS = PERSISTABLE_ACTION__CELLS;

	/**
	 * The feature id for the '<em><b>All Cells</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_STYLE__ALL_CELLS = PERSISTABLE_ACTION__ALL_CELLS;

	/**
	 * The feature id for the '<em><b>Layers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_STYLE__LAYERS = PERSISTABLE_ACTION__LAYERS;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_STYLE__TAGS = PERSISTABLE_ACTION__TAGS;

	/**
	 * The feature id for the '<em><b>Tags Match</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_STYLE__TAGS_MATCH = PERSISTABLE_ACTION__TAGS_MATCH;

	/**
	 * The feature id for the '<em><b>Exclude Cells</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_STYLE__EXCLUDE_CELLS = PERSISTABLE_ACTION__EXCLUDE_CELLS;

	/**
	 * The feature id for the '<em><b>Persist Changes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_STYLE__PERSIST_CHANGES = PERSISTABLE_ACTION__PERSIST_CHANGES;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_STYLE__KEY = PERSISTABLE_ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_STYLE__VALUE = PERSISTABLE_ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Set Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_STYLE_FEATURE_COUNT = PERSISTABLE_ACTION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Set Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_STYLE_OPERATION_COUNT = PERSISTABLE_ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.drawio.impl.ToggleStyleImpl <em>Toggle Style</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.drawio.impl.ToggleStyleImpl
	 * @see org.nasdanika.sdk.runtime.models.drawio.impl.DrawioPackageImpl#getToggleStyle()
	 * @generated
	 */
	int TOGGLE_STYLE = 31;

	/**
	 * The feature id for the '<em><b>Immediate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOGGLE_STYLE__IMMEDIATE = PERSISTABLE_ACTION__IMMEDIATE;

	/**
	 * The feature id for the '<em><b>Cells</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOGGLE_STYLE__CELLS = PERSISTABLE_ACTION__CELLS;

	/**
	 * The feature id for the '<em><b>All Cells</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOGGLE_STYLE__ALL_CELLS = PERSISTABLE_ACTION__ALL_CELLS;

	/**
	 * The feature id for the '<em><b>Layers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOGGLE_STYLE__LAYERS = PERSISTABLE_ACTION__LAYERS;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOGGLE_STYLE__TAGS = PERSISTABLE_ACTION__TAGS;

	/**
	 * The feature id for the '<em><b>Tags Match</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOGGLE_STYLE__TAGS_MATCH = PERSISTABLE_ACTION__TAGS_MATCH;

	/**
	 * The feature id for the '<em><b>Exclude Cells</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOGGLE_STYLE__EXCLUDE_CELLS = PERSISTABLE_ACTION__EXCLUDE_CELLS;

	/**
	 * The feature id for the '<em><b>Persist Changes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOGGLE_STYLE__PERSIST_CHANGES = PERSISTABLE_ACTION__PERSIST_CHANGES;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOGGLE_STYLE__KEY = PERSISTABLE_ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOGGLE_STYLE__DEFAULT_VALUE = PERSISTABLE_ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Toggle Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOGGLE_STYLE_FEATURE_COUNT = PERSISTABLE_ACTION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Toggle Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOGGLE_STYLE_OPERATION_COUNT = PERSISTABLE_ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.drawio.impl.HighlightImpl <em>Highlight</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.drawio.impl.HighlightImpl
	 * @see org.nasdanika.sdk.runtime.models.drawio.impl.DrawioPackageImpl#getHighlight()
	 * @generated
	 */
	int HIGHLIGHT = 32;

	/**
	 * The feature id for the '<em><b>Immediate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIGHLIGHT__IMMEDIATE = TARGETED_ACTION__IMMEDIATE;

	/**
	 * The feature id for the '<em><b>Cells</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIGHLIGHT__CELLS = TARGETED_ACTION__CELLS;

	/**
	 * The feature id for the '<em><b>All Cells</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIGHLIGHT__ALL_CELLS = TARGETED_ACTION__ALL_CELLS;

	/**
	 * The feature id for the '<em><b>Layers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIGHLIGHT__LAYERS = TARGETED_ACTION__LAYERS;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIGHLIGHT__TAGS = TARGETED_ACTION__TAGS;

	/**
	 * The feature id for the '<em><b>Tags Match</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIGHLIGHT__TAGS_MATCH = TARGETED_ACTION__TAGS_MATCH;

	/**
	 * The feature id for the '<em><b>Exclude Cells</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIGHLIGHT__EXCLUDE_CELLS = TARGETED_ACTION__EXCLUDE_CELLS;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIGHLIGHT__COLOR = TARGETED_ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Opacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIGHLIGHT__OPACITY = TARGETED_ACTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIGHLIGHT__DURATION = TARGETED_ACTION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Highlight</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIGHLIGHT_FEATURE_COUNT = TARGETED_ACTION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Highlight</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIGHLIGHT_OPERATION_COUNT = TARGETED_ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.drawio.impl.FlowImpl <em>Flow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.drawio.impl.FlowImpl
	 * @see org.nasdanika.sdk.runtime.models.drawio.impl.DrawioPackageImpl#getFlow()
	 * @generated
	 */
	int FLOW = 33;

	/**
	 * The feature id for the '<em><b>Immediate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__IMMEDIATE = TARGETED_ACTION__IMMEDIATE;

	/**
	 * The feature id for the '<em><b>Cells</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__CELLS = TARGETED_ACTION__CELLS;

	/**
	 * The feature id for the '<em><b>All Cells</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__ALL_CELLS = TARGETED_ACTION__ALL_CELLS;

	/**
	 * The feature id for the '<em><b>Layers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__LAYERS = TARGETED_ACTION__LAYERS;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__TAGS = TARGETED_ACTION__TAGS;

	/**
	 * The feature id for the '<em><b>Tags Match</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__TAGS_MATCH = TARGETED_ACTION__TAGS_MATCH;

	/**
	 * The feature id for the '<em><b>Exclude Cells</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__EXCLUDE_CELLS = TARGETED_ACTION__EXCLUDE_CELLS;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__MODE = TARGETED_ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_FEATURE_COUNT = TARGETED_ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_OPERATION_COUNT = TARGETED_ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.drawio.impl.SelectImpl <em>Select</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.drawio.impl.SelectImpl
	 * @see org.nasdanika.sdk.runtime.models.drawio.impl.DrawioPackageImpl#getSelect()
	 * @generated
	 */
	int SELECT = 34;

	/**
	 * The feature id for the '<em><b>Immediate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT__IMMEDIATE = TARGETED_ACTION__IMMEDIATE;

	/**
	 * The feature id for the '<em><b>Cells</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT__CELLS = TARGETED_ACTION__CELLS;

	/**
	 * The feature id for the '<em><b>All Cells</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT__ALL_CELLS = TARGETED_ACTION__ALL_CELLS;

	/**
	 * The feature id for the '<em><b>Layers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT__LAYERS = TARGETED_ACTION__LAYERS;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT__TAGS = TARGETED_ACTION__TAGS;

	/**
	 * The feature id for the '<em><b>Tags Match</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT__TAGS_MATCH = TARGETED_ACTION__TAGS_MATCH;

	/**
	 * The feature id for the '<em><b>Exclude Cells</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT__EXCLUDE_CELLS = TARGETED_ACTION__EXCLUDE_CELLS;

	/**
	 * The number of structural features of the '<em>Select</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_FEATURE_COUNT = TARGETED_ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Select</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_OPERATION_COUNT = TARGETED_ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.drawio.impl.ScrollImpl <em>Scroll</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.drawio.impl.ScrollImpl
	 * @see org.nasdanika.sdk.runtime.models.drawio.impl.DrawioPackageImpl#getScroll()
	 * @generated
	 */
	int SCROLL = 35;

	/**
	 * The feature id for the '<em><b>Immediate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCROLL__IMMEDIATE = TARGETED_ACTION__IMMEDIATE;

	/**
	 * The feature id for the '<em><b>Cells</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCROLL__CELLS = TARGETED_ACTION__CELLS;

	/**
	 * The feature id for the '<em><b>All Cells</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCROLL__ALL_CELLS = TARGETED_ACTION__ALL_CELLS;

	/**
	 * The feature id for the '<em><b>Layers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCROLL__LAYERS = TARGETED_ACTION__LAYERS;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCROLL__TAGS = TARGETED_ACTION__TAGS;

	/**
	 * The feature id for the '<em><b>Tags Match</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCROLL__TAGS_MATCH = TARGETED_ACTION__TAGS_MATCH;

	/**
	 * The feature id for the '<em><b>Exclude Cells</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCROLL__EXCLUDE_CELLS = TARGETED_ACTION__EXCLUDE_CELLS;

	/**
	 * The feature id for the '<em><b>Smooth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCROLL__SMOOTH = TARGETED_ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Scroll</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCROLL_FEATURE_COUNT = TARGETED_ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Scroll</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCROLL_OPERATION_COUNT = TARGETED_ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.drawio.impl.ViewboxImpl <em>Viewbox</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.drawio.impl.ViewboxImpl
	 * @see org.nasdanika.sdk.runtime.models.drawio.impl.DrawioPackageImpl#getViewbox()
	 * @generated
	 */
	int VIEWBOX = 36;

	/**
	 * The feature id for the '<em><b>Immediate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEWBOX__IMMEDIATE = ACTION__IMMEDIATE;

	/**
	 * The feature id for the '<em><b>Bounds</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEWBOX__BOUNDS = ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Smooth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEWBOX__SMOOTH = ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Viewbox</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEWBOX_FEATURE_COUNT = ACTION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Viewbox</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEWBOX_OPERATION_COUNT = ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.drawio.impl.OpenImpl <em>Open</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.drawio.impl.OpenImpl
	 * @see org.nasdanika.sdk.runtime.models.drawio.impl.DrawioPackageImpl#getOpen()
	 * @generated
	 */
	int OPEN = 37;

	/**
	 * The feature id for the '<em><b>Immediate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN__IMMEDIATE = ACTION__IMMEDIATE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN__TARGET = ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Open</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_FEATURE_COUNT = ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Open</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_OPERATION_COUNT = ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.drawio.impl.TagsActionImpl <em>Tags Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.drawio.impl.TagsActionImpl
	 * @see org.nasdanika.sdk.runtime.models.drawio.impl.DrawioPackageImpl#getTagsAction()
	 * @generated
	 */
	int TAGS_ACTION = 38;

	/**
	 * The feature id for the '<em><b>Immediate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAGS_ACTION__IMMEDIATE = ACTION__IMMEDIATE;

	/**
	 * The feature id for the '<em><b>Toggle</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAGS_ACTION__TOGGLE = ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Hidden</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAGS_ACTION__HIDDEN = ACTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAGS_ACTION__VISIBLE = ACTION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Tags Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAGS_ACTION_FEATURE_COUNT = ACTION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Tags Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAGS_ACTION_OPERATION_COUNT = ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.drawio.SelectorType <em>Selector Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.drawio.SelectorType
	 * @see org.nasdanika.sdk.runtime.models.drawio.impl.DrawioPackageImpl#getSelectorType()
	 * @generated
	 */
	int SELECTOR_TYPE = 39;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.drawio.TagsMatch <em>Tags Match</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.drawio.TagsMatch
	 * @see org.nasdanika.sdk.runtime.models.drawio.impl.DrawioPackageImpl#getTagsMatch()
	 * @generated
	 */
	int TAGS_MATCH = 40;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.drawio.FlowMode <em>Flow Mode</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.drawio.FlowMode
	 * @see org.nasdanika.sdk.runtime.models.drawio.impl.DrawioPackageImpl#getFlowMode()
	 * @generated
	 */
	int FLOW_MODE = 41;


	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.drawio.Document <em>Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document</em>'.
	 * @see org.nasdanika.sdk.runtime.models.drawio.Document
	 * @generated
	 */
	EClass getDocument();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.drawio.Document#getHost <em>Host</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Host</em>'.
	 * @see org.nasdanika.sdk.runtime.models.drawio.Document#getHost()
	 * @see #getDocument()
	 * @generated
	 */
	EAttribute getDocument_Host();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.drawio.Document#getAgent <em>Agent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Agent</em>'.
	 * @see org.nasdanika.sdk.runtime.models.drawio.Document#getAgent()
	 * @see #getDocument()
	 * @generated
	 */
	EAttribute getDocument_Agent();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.drawio.Document#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see org.nasdanika.sdk.runtime.models.drawio.Document#getVersion()
	 * @see #getDocument()
	 * @generated
	 */
	EAttribute getDocument_Version();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.drawio.Document#isCompressed <em>Compressed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Compressed</em>'.
	 * @see org.nasdanika.sdk.runtime.models.drawio.Document#isCompressed()
	 * @see #getDocument()
	 * @generated
	 */
	EAttribute getDocument_Compressed();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.drawio.LinkTarget <em>Link Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Link Target</em>'.
	 * @see org.nasdanika.sdk.runtime.models.drawio.LinkTarget
	 * @generated
	 */
	EClass getLinkTarget();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.drawio.Page <em>Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Page</em>'.
	 * @see org.nasdanika.sdk.runtime.models.drawio.Page
	 * @generated
	 */
	EClass getPage();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.drawio.Page#getDx <em>Dx</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dx</em>'.
	 * @see org.nasdanika.sdk.runtime.models.drawio.Page#getDx()
	 * @see #getPage()
	 * @generated
	 */
	EAttribute getPage_Dx();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.drawio.Page#getDy <em>Dy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dy</em>'.
	 * @see org.nasdanika.sdk.runtime.models.drawio.Page#getDy()
	 * @see #getPage()
	 * @generated
	 */
	EAttribute getPage_Dy();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.drawio.Page#getPageWidth <em>Page Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Page Width</em>'.
	 * @see org.nasdanika.sdk.runtime.models.drawio.Page#getPageWidth()
	 * @see #getPage()
	 * @generated
	 */
	EAttribute getPage_PageWidth();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.drawio.Page#getPageHeight <em>Page Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Page Height</em>'.
	 * @see org.nasdanika.sdk.runtime.models.drawio.Page#getPageHeight()
	 * @see #getPage()
	 * @generated
	 */
	EAttribute getPage_PageHeight();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.drawio.Page#getGridSize <em>Grid Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Grid Size</em>'.
	 * @see org.nasdanika.sdk.runtime.models.drawio.Page#getGridSize()
	 * @see #getPage()
	 * @generated
	 */
	EAttribute getPage_GridSize();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.sdk.runtime.models.drawio.Page#getTags <em>Tags</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tags</em>'.
	 * @see org.nasdanika.sdk.runtime.models.drawio.Page#getTags()
	 * @see #getPage()
	 * @generated
	 */
	EReference getPage_Tags();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.drawio.Layer <em>Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Layer</em>'.
	 * @see org.nasdanika.sdk.runtime.models.drawio.Layer
	 * @generated
	 */
	EClass getLayer();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.drawio.Layer#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see org.nasdanika.sdk.runtime.models.drawio.Layer#getStyle()
	 * @see #getLayer()
	 * @generated
	 */
	EAttribute getLayer_Style();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.drawio.ModelElement <em>Model Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Element</em>'.
	 * @see org.nasdanika.sdk.runtime.models.drawio.ModelElement
	 * @generated
	 */
	EClass getModelElement();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.sdk.runtime.models.drawio.ModelElement#getLink <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Link</em>'.
	 * @see org.nasdanika.sdk.runtime.models.drawio.ModelElement#getLink()
	 * @see #getModelElement()
	 * @generated
	 */
	EReference getModelElement_Link();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.sdk.runtime.models.drawio.ModelElement#getTags <em>Tags</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Tags</em>'.
	 * @see org.nasdanika.sdk.runtime.models.drawio.ModelElement#getTags()
	 * @see #getModelElement()
	 * @generated
	 */
	EReference getModelElement_Tags();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.drawio.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node</em>'.
	 * @see org.nasdanika.sdk.runtime.models.drawio.Node
	 * @generated
	 */
	EClass getNode();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.drawio.Node#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see org.nasdanika.sdk.runtime.models.drawio.Node#getStyle()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_Style();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.drawio.Node#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see org.nasdanika.sdk.runtime.models.drawio.Node#getLabel()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_Label();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.drawio.Node#isCollapsed <em>Collapsed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Collapsed</em>'.
	 * @see org.nasdanika.sdk.runtime.models.drawio.Node#isCollapsed()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_Collapsed();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.drawio.Connection <em>Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connection</em>'.
	 * @see org.nasdanika.sdk.runtime.models.drawio.Connection
	 * @generated
	 */
	EClass getConnection();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.drawio.Connection#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see org.nasdanika.sdk.runtime.models.drawio.Connection#getStyle()
	 * @see #getConnection()
	 * @generated
	 */
	EAttribute getConnection_Style();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.drawio.Connection#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see org.nasdanika.sdk.runtime.models.drawio.Connection#getLabel()
	 * @see #getConnection()
	 * @generated
	 */
	EAttribute getConnection_Label();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.drawio.Tag <em>Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tag</em>'.
	 * @see org.nasdanika.sdk.runtime.models.drawio.Tag
	 * @generated
	 */
	EClass getTag();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.sdk.runtime.models.drawio.Tag#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Elements</em>'.
	 * @see org.nasdanika.sdk.runtime.models.drawio.Tag#getElements()
	 * @see #getTag()
	 * @generated
	 */
	EReference getTag_Elements();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.drawio.AbstractLink <em>Abstract Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Link</em>'.
	 * @see org.nasdanika.sdk.runtime.models.drawio.AbstractLink
	 * @generated
	 */
	EClass getAbstractLink();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.drawio.SimpleLink <em>Simple Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Link</em>'.
	 * @see org.nasdanika.sdk.runtime.models.drawio.SimpleLink
	 * @generated
	 */
	EClass getSimpleLink();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.drawio.SimpleLink#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target</em>'.
	 * @see org.nasdanika.sdk.runtime.models.drawio.SimpleLink#getTarget()
	 * @see #getSimpleLink()
	 * @generated
	 */
	EAttribute getSimpleLink_Target();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.drawio.CustomLink <em>Custom Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Custom Link</em>'.
	 * @see org.nasdanika.sdk.runtime.models.drawio.CustomLink
	 * @generated
	 */
	EClass getCustomLink();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.drawio.CustomLink#getResource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resource</em>'.
	 * @see org.nasdanika.sdk.runtime.models.drawio.CustomLink#getResource()
	 * @see #getCustomLink()
	 * @generated
	 */
	EAttribute getCustomLink_Resource();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.sdk.runtime.models.drawio.CustomLink#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.nasdanika.sdk.runtime.models.drawio.CustomLink#getTarget()
	 * @see #getCustomLink()
	 * @generated
	 */
	EReference getCustomLink_Target();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.drawio.CustomLink#getPageSelectorType <em>Page Selector Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Page Selector Type</em>'.
	 * @see org.nasdanika.sdk.runtime.models.drawio.CustomLink#getPageSelectorType()
	 * @see #getCustomLink()
	 * @generated
	 */
	EAttribute getCustomLink_PageSelectorType();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.drawio.CustomLink#getPageSelector <em>Page Selector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Page Selector</em>'.
	 * @see org.nasdanika.sdk.runtime.models.drawio.CustomLink#getPageSelector()
	 * @see #getCustomLink()
	 * @generated
	 */
	EAttribute getCustomLink_PageSelector();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.drawio.CustomLink#getElementSelectorType <em>Element Selector Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Element Selector Type</em>'.
	 * @see org.nasdanika.sdk.runtime.models.drawio.CustomLink#getElementSelectorType()
	 * @see #getCustomLink()
	 * @generated
	 */
	EAttribute getCustomLink_ElementSelectorType();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.drawio.CustomLink#getElementSelector <em>Element Selector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Element Selector</em>'.
	 * @see org.nasdanika.sdk.runtime.models.drawio.CustomLink#getElementSelector()
	 * @see #getCustomLink()
	 * @generated
	 */
	EAttribute getCustomLink_ElementSelector();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.drawio.SpelLink <em>Spel Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Spel Link</em>'.
	 * @see org.nasdanika.sdk.runtime.models.drawio.SpelLink
	 * @generated
	 */
	EClass getSpelLink();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.drawio.SpelLink#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expression</em>'.
	 * @see org.nasdanika.sdk.runtime.models.drawio.SpelLink#getExpression()
	 * @see #getSpelLink()
	 * @generated
	 */
	EAttribute getSpelLink_Expression();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.drawio.Actions <em>Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Actions</em>'.
	 * @see org.nasdanika.sdk.runtime.models.drawio.Actions
	 * @generated
	 */
	EClass getActions();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.drawio.Actions#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.nasdanika.sdk.runtime.models.drawio.Actions#getTitle()
	 * @see #getActions()
	 * @generated
	 */
	EAttribute getActions_Title();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.sdk.runtime.models.drawio.Actions#getActions <em>Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Actions</em>'.
	 * @see org.nasdanika.sdk.runtime.models.drawio.Actions#getActions()
	 * @see #getActions()
	 * @generated
	 */
	EReference getActions_Actions();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.drawio.Animation <em>Animation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Animation</em>'.
	 * @see org.nasdanika.sdk.runtime.models.drawio.Animation
	 * @generated
	 */
	EClass getAnimation();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.drawio.Animation#isEnabled <em>Enabled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Enabled</em>'.
	 * @see org.nasdanika.sdk.runtime.models.drawio.Animation#isEnabled()
	 * @see #getAnimation()
	 * @generated
	 */
	EAttribute getAnimation_Enabled();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.drawio.Animation#isLoop <em>Loop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Loop</em>'.
	 * @see org.nasdanika.sdk.runtime.models.drawio.Animation#isLoop()
	 * @see #getAnimation()
	 * @generated
	 */
	EAttribute getAnimation_Loop();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.sdk.runtime.models.drawio.Animation#getSteps <em>Steps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Steps</em>'.
	 * @see org.nasdanika.sdk.runtime.models.drawio.Animation#getSteps()
	 * @see #getAnimation()
	 * @generated
	 */
	EReference getAnimation_Steps();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.drawio.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action</em>'.
	 * @see org.nasdanika.sdk.runtime.models.drawio.Action
	 * @generated
	 */
	EClass getAction();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.drawio.Action#isImmediate <em>Immediate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Immediate</em>'.
	 * @see org.nasdanika.sdk.runtime.models.drawio.Action#isImmediate()
	 * @see #getAction()
	 * @generated
	 */
	EAttribute getAction_Immediate();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.drawio.Wait <em>Wait</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Wait</em>'.
	 * @see org.nasdanika.sdk.runtime.models.drawio.Wait
	 * @generated
	 */
	EClass getWait();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.drawio.Wait#getDelay <em>Delay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Delay</em>'.
	 * @see org.nasdanika.sdk.runtime.models.drawio.Wait#getDelay()
	 * @see #getWait()
	 * @generated
	 */
	EAttribute getWait_Delay();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.drawio.TargetedAction <em>Targeted Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Targeted Action</em>'.
	 * @see org.nasdanika.sdk.runtime.models.drawio.TargetedAction
	 * @generated
	 */
	EClass getTargetedAction();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.sdk.runtime.models.drawio.TargetedAction#getCells <em>Cells</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Cells</em>'.
	 * @see org.nasdanika.sdk.runtime.models.drawio.TargetedAction#getCells()
	 * @see #getTargetedAction()
	 * @generated
	 */
	EReference getTargetedAction_Cells();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.drawio.TargetedAction#isAllCells <em>All Cells</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>All Cells</em>'.
	 * @see org.nasdanika.sdk.runtime.models.drawio.TargetedAction#isAllCells()
	 * @see #getTargetedAction()
	 * @generated
	 */
	EAttribute getTargetedAction_AllCells();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.sdk.runtime.models.drawio.TargetedAction#getLayers <em>Layers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Layers</em>'.
	 * @see org.nasdanika.sdk.runtime.models.drawio.TargetedAction#getLayers()
	 * @see #getTargetedAction()
	 * @generated
	 */
	EReference getTargetedAction_Layers();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.sdk.runtime.models.drawio.TargetedAction#getTags <em>Tags</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Tags</em>'.
	 * @see org.nasdanika.sdk.runtime.models.drawio.TargetedAction#getTags()
	 * @see #getTargetedAction()
	 * @generated
	 */
	EReference getTargetedAction_Tags();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.drawio.TargetedAction#getTagsMatch <em>Tags Match</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tags Match</em>'.
	 * @see org.nasdanika.sdk.runtime.models.drawio.TargetedAction#getTagsMatch()
	 * @see #getTargetedAction()
	 * @generated
	 */
	EAttribute getTargetedAction_TagsMatch();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.sdk.runtime.models.drawio.TargetedAction#getExcludeCells <em>Exclude Cells</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Exclude Cells</em>'.
	 * @see org.nasdanika.sdk.runtime.models.drawio.TargetedAction#getExcludeCells()
	 * @see #getTargetedAction()
	 * @generated
	 */
	EReference getTargetedAction_ExcludeCells();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.drawio.PersistableAction <em>Persistable Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Persistable Action</em>'.
	 * @see org.nasdanika.sdk.runtime.models.drawio.PersistableAction
	 * @generated
	 */
	EClass getPersistableAction();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.drawio.PersistableAction#isPersistChanges <em>Persist Changes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Persist Changes</em>'.
	 * @see org.nasdanika.sdk.runtime.models.drawio.PersistableAction#isPersistChanges()
	 * @see #getPersistableAction()
	 * @generated
	 */
	EAttribute getPersistableAction_PersistChanges();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.drawio.Show <em>Show</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Show</em>'.
	 * @see org.nasdanika.sdk.runtime.models.drawio.Show
	 * @generated
	 */
	EClass getShow();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.drawio.Hide <em>Hide</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hide</em>'.
	 * @see org.nasdanika.sdk.runtime.models.drawio.Hide
	 * @generated
	 */
	EClass getHide();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.drawio.Toggle <em>Toggle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Toggle</em>'.
	 * @see org.nasdanika.sdk.runtime.models.drawio.Toggle
	 * @generated
	 */
	EClass getToggle();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.drawio.SetOpacity <em>Set Opacity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Set Opacity</em>'.
	 * @see org.nasdanika.sdk.runtime.models.drawio.SetOpacity
	 * @generated
	 */
	EClass getSetOpacity();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.drawio.SetOpacity#getOpacity <em>Opacity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Opacity</em>'.
	 * @see org.nasdanika.sdk.runtime.models.drawio.SetOpacity#getOpacity()
	 * @see #getSetOpacity()
	 * @generated
	 */
	EAttribute getSetOpacity_Opacity();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.drawio.TransitionEffect <em>Transition Effect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition Effect</em>'.
	 * @see org.nasdanika.sdk.runtime.models.drawio.TransitionEffect
	 * @generated
	 */
	EClass getTransitionEffect();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.drawio.TransitionEffect#getDelay <em>Delay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Delay</em>'.
	 * @see org.nasdanika.sdk.runtime.models.drawio.TransitionEffect#getDelay()
	 * @see #getTransitionEffect()
	 * @generated
	 */
	EAttribute getTransitionEffect_Delay();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.drawio.FadeIn <em>Fade In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fade In</em>'.
	 * @see org.nasdanika.sdk.runtime.models.drawio.FadeIn
	 * @generated
	 */
	EClass getFadeIn();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.drawio.FadeOut <em>Fade Out</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fade Out</em>'.
	 * @see org.nasdanika.sdk.runtime.models.drawio.FadeOut
	 * @generated
	 */
	EClass getFadeOut();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.drawio.FadeTo <em>Fade To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fade To</em>'.
	 * @see org.nasdanika.sdk.runtime.models.drawio.FadeTo
	 * @generated
	 */
	EClass getFadeTo();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.drawio.FadeTo#getOpacity <em>Opacity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Opacity</em>'.
	 * @see org.nasdanika.sdk.runtime.models.drawio.FadeTo#getOpacity()
	 * @see #getFadeTo()
	 * @generated
	 */
	EAttribute getFadeTo_Opacity();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.drawio.WipeIn <em>Wipe In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Wipe In</em>'.
	 * @see org.nasdanika.sdk.runtime.models.drawio.WipeIn
	 * @generated
	 */
	EClass getWipeIn();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.drawio.WipeOut <em>Wipe Out</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Wipe Out</em>'.
	 * @see org.nasdanika.sdk.runtime.models.drawio.WipeOut
	 * @generated
	 */
	EClass getWipeOut();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.drawio.PopIn <em>Pop In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pop In</em>'.
	 * @see org.nasdanika.sdk.runtime.models.drawio.PopIn
	 * @generated
	 */
	EClass getPopIn();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.drawio.PopOut <em>Pop Out</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pop Out</em>'.
	 * @see org.nasdanika.sdk.runtime.models.drawio.PopOut
	 * @generated
	 */
	EClass getPopOut();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.drawio.SetStyle <em>Set Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Set Style</em>'.
	 * @see org.nasdanika.sdk.runtime.models.drawio.SetStyle
	 * @generated
	 */
	EClass getSetStyle();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.drawio.SetStyle#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see org.nasdanika.sdk.runtime.models.drawio.SetStyle#getKey()
	 * @see #getSetStyle()
	 * @generated
	 */
	EAttribute getSetStyle_Key();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.drawio.SetStyle#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.nasdanika.sdk.runtime.models.drawio.SetStyle#getValue()
	 * @see #getSetStyle()
	 * @generated
	 */
	EAttribute getSetStyle_Value();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.drawio.ToggleStyle <em>Toggle Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Toggle Style</em>'.
	 * @see org.nasdanika.sdk.runtime.models.drawio.ToggleStyle
	 * @generated
	 */
	EClass getToggleStyle();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.drawio.ToggleStyle#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see org.nasdanika.sdk.runtime.models.drawio.ToggleStyle#getKey()
	 * @see #getToggleStyle()
	 * @generated
	 */
	EAttribute getToggleStyle_Key();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.drawio.ToggleStyle#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Value</em>'.
	 * @see org.nasdanika.sdk.runtime.models.drawio.ToggleStyle#getDefaultValue()
	 * @see #getToggleStyle()
	 * @generated
	 */
	EAttribute getToggleStyle_DefaultValue();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.drawio.Highlight <em>Highlight</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Highlight</em>'.
	 * @see org.nasdanika.sdk.runtime.models.drawio.Highlight
	 * @generated
	 */
	EClass getHighlight();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.drawio.Highlight#getColor <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color</em>'.
	 * @see org.nasdanika.sdk.runtime.models.drawio.Highlight#getColor()
	 * @see #getHighlight()
	 * @generated
	 */
	EAttribute getHighlight_Color();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.drawio.Highlight#getOpacity <em>Opacity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Opacity</em>'.
	 * @see org.nasdanika.sdk.runtime.models.drawio.Highlight#getOpacity()
	 * @see #getHighlight()
	 * @generated
	 */
	EAttribute getHighlight_Opacity();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.drawio.Highlight#getDuration <em>Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Duration</em>'.
	 * @see org.nasdanika.sdk.runtime.models.drawio.Highlight#getDuration()
	 * @see #getHighlight()
	 * @generated
	 */
	EAttribute getHighlight_Duration();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.drawio.Flow <em>Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Flow</em>'.
	 * @see org.nasdanika.sdk.runtime.models.drawio.Flow
	 * @generated
	 */
	EClass getFlow();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.drawio.Flow#getMode <em>Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mode</em>'.
	 * @see org.nasdanika.sdk.runtime.models.drawio.Flow#getMode()
	 * @see #getFlow()
	 * @generated
	 */
	EAttribute getFlow_Mode();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.drawio.Select <em>Select</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Select</em>'.
	 * @see org.nasdanika.sdk.runtime.models.drawio.Select
	 * @generated
	 */
	EClass getSelect();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.drawio.Scroll <em>Scroll</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scroll</em>'.
	 * @see org.nasdanika.sdk.runtime.models.drawio.Scroll
	 * @generated
	 */
	EClass getScroll();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.drawio.Scroll#isSmooth <em>Smooth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Smooth</em>'.
	 * @see org.nasdanika.sdk.runtime.models.drawio.Scroll#isSmooth()
	 * @see #getScroll()
	 * @generated
	 */
	EAttribute getScroll_Smooth();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.drawio.Viewbox <em>Viewbox</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Viewbox</em>'.
	 * @see org.nasdanika.sdk.runtime.models.drawio.Viewbox
	 * @generated
	 */
	EClass getViewbox();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.sdk.runtime.models.drawio.Viewbox#getBounds <em>Bounds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bounds</em>'.
	 * @see org.nasdanika.sdk.runtime.models.drawio.Viewbox#getBounds()
	 * @see #getViewbox()
	 * @generated
	 */
	EReference getViewbox_Bounds();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.drawio.Viewbox#isSmooth <em>Smooth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Smooth</em>'.
	 * @see org.nasdanika.sdk.runtime.models.drawio.Viewbox#isSmooth()
	 * @see #getViewbox()
	 * @generated
	 */
	EAttribute getViewbox_Smooth();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.drawio.Open <em>Open</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Open</em>'.
	 * @see org.nasdanika.sdk.runtime.models.drawio.Open
	 * @generated
	 */
	EClass getOpen();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.sdk.runtime.models.drawio.Open#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Target</em>'.
	 * @see org.nasdanika.sdk.runtime.models.drawio.Open#getTarget()
	 * @see #getOpen()
	 * @generated
	 */
	EReference getOpen_Target();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.drawio.TagsAction <em>Tags Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tags Action</em>'.
	 * @see org.nasdanika.sdk.runtime.models.drawio.TagsAction
	 * @generated
	 */
	EClass getTagsAction();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.sdk.runtime.models.drawio.TagsAction#getToggle <em>Toggle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Toggle</em>'.
	 * @see org.nasdanika.sdk.runtime.models.drawio.TagsAction#getToggle()
	 * @see #getTagsAction()
	 * @generated
	 */
	EReference getTagsAction_Toggle();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.sdk.runtime.models.drawio.TagsAction#getHidden <em>Hidden</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Hidden</em>'.
	 * @see org.nasdanika.sdk.runtime.models.drawio.TagsAction#getHidden()
	 * @see #getTagsAction()
	 * @generated
	 */
	EReference getTagsAction_Hidden();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.sdk.runtime.models.drawio.TagsAction#getVisible <em>Visible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Visible</em>'.
	 * @see org.nasdanika.sdk.runtime.models.drawio.TagsAction#getVisible()
	 * @see #getTagsAction()
	 * @generated
	 */
	EReference getTagsAction_Visible();

	/**
	 * Returns the meta object for enum '{@link org.nasdanika.sdk.runtime.models.drawio.SelectorType <em>Selector Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Selector Type</em>'.
	 * @see org.nasdanika.sdk.runtime.models.drawio.SelectorType
	 * @generated
	 */
	EEnum getSelectorType();

	/**
	 * Returns the meta object for enum '{@link org.nasdanika.sdk.runtime.models.drawio.TagsMatch <em>Tags Match</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Tags Match</em>'.
	 * @see org.nasdanika.sdk.runtime.models.drawio.TagsMatch
	 * @generated
	 */
	EEnum getTagsMatch();

	/**
	 * Returns the meta object for enum '{@link org.nasdanika.sdk.runtime.models.drawio.FlowMode <em>Flow Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Flow Mode</em>'.
	 * @see org.nasdanika.sdk.runtime.models.drawio.FlowMode
	 * @generated
	 */
	EEnum getFlowMode();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DrawioFactory getDrawioFactory();

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
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.drawio.impl.DocumentImpl <em>Document</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.drawio.impl.DocumentImpl
		 * @see org.nasdanika.sdk.runtime.models.drawio.impl.DrawioPackageImpl#getDocument()
		 * @generated
		 */
		EClass DOCUMENT = eINSTANCE.getDocument();

		/**
		 * The meta object literal for the '<em><b>Host</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT__HOST = eINSTANCE.getDocument_Host();

		/**
		 * The meta object literal for the '<em><b>Agent</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT__AGENT = eINSTANCE.getDocument_Agent();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT__VERSION = eINSTANCE.getDocument_Version();

		/**
		 * The meta object literal for the '<em><b>Compressed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT__COMPRESSED = eINSTANCE.getDocument_Compressed();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.drawio.LinkTarget <em>Link Target</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.drawio.LinkTarget
		 * @see org.nasdanika.sdk.runtime.models.drawio.impl.DrawioPackageImpl#getLinkTarget()
		 * @generated
		 */
		EClass LINK_TARGET = eINSTANCE.getLinkTarget();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.drawio.impl.PageImpl <em>Page</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.drawio.impl.PageImpl
		 * @see org.nasdanika.sdk.runtime.models.drawio.impl.DrawioPackageImpl#getPage()
		 * @generated
		 */
		EClass PAGE = eINSTANCE.getPage();

		/**
		 * The meta object literal for the '<em><b>Dx</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAGE__DX = eINSTANCE.getPage_Dx();

		/**
		 * The meta object literal for the '<em><b>Dy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAGE__DY = eINSTANCE.getPage_Dy();

		/**
		 * The meta object literal for the '<em><b>Page Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAGE__PAGE_WIDTH = eINSTANCE.getPage_PageWidth();

		/**
		 * The meta object literal for the '<em><b>Page Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAGE__PAGE_HEIGHT = eINSTANCE.getPage_PageHeight();

		/**
		 * The meta object literal for the '<em><b>Grid Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAGE__GRID_SIZE = eINSTANCE.getPage_GridSize();

		/**
		 * The meta object literal for the '<em><b>Tags</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAGE__TAGS = eINSTANCE.getPage_Tags();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.drawio.impl.LayerImpl <em>Layer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.drawio.impl.LayerImpl
		 * @see org.nasdanika.sdk.runtime.models.drawio.impl.DrawioPackageImpl#getLayer()
		 * @generated
		 */
		EClass LAYER = eINSTANCE.getLayer();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAYER__STYLE = eINSTANCE.getLayer_Style();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.drawio.ModelElement <em>Model Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.drawio.ModelElement
		 * @see org.nasdanika.sdk.runtime.models.drawio.impl.DrawioPackageImpl#getModelElement()
		 * @generated
		 */
		EClass MODEL_ELEMENT = eINSTANCE.getModelElement();

		/**
		 * The meta object literal for the '<em><b>Link</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_ELEMENT__LINK = eINSTANCE.getModelElement_Link();

		/**
		 * The meta object literal for the '<em><b>Tags</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_ELEMENT__TAGS = eINSTANCE.getModelElement_Tags();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.drawio.impl.NodeImpl <em>Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.drawio.impl.NodeImpl
		 * @see org.nasdanika.sdk.runtime.models.drawio.impl.DrawioPackageImpl#getNode()
		 * @generated
		 */
		EClass NODE = eINSTANCE.getNode();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__STYLE = eINSTANCE.getNode_Style();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__LABEL = eINSTANCE.getNode_Label();

		/**
		 * The meta object literal for the '<em><b>Collapsed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__COLLAPSED = eINSTANCE.getNode_Collapsed();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.drawio.impl.ConnectionImpl <em>Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.drawio.impl.ConnectionImpl
		 * @see org.nasdanika.sdk.runtime.models.drawio.impl.DrawioPackageImpl#getConnection()
		 * @generated
		 */
		EClass CONNECTION = eINSTANCE.getConnection();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTION__STYLE = eINSTANCE.getConnection_Style();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTION__LABEL = eINSTANCE.getConnection_Label();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.drawio.impl.TagImpl <em>Tag</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.drawio.impl.TagImpl
		 * @see org.nasdanika.sdk.runtime.models.drawio.impl.DrawioPackageImpl#getTag()
		 * @generated
		 */
		EClass TAG = eINSTANCE.getTag();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TAG__ELEMENTS = eINSTANCE.getTag_Elements();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.drawio.impl.AbstractLinkImpl <em>Abstract Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.drawio.impl.AbstractLinkImpl
		 * @see org.nasdanika.sdk.runtime.models.drawio.impl.DrawioPackageImpl#getAbstractLink()
		 * @generated
		 */
		EClass ABSTRACT_LINK = eINSTANCE.getAbstractLink();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.drawio.impl.SimpleLinkImpl <em>Simple Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.drawio.impl.SimpleLinkImpl
		 * @see org.nasdanika.sdk.runtime.models.drawio.impl.DrawioPackageImpl#getSimpleLink()
		 * @generated
		 */
		EClass SIMPLE_LINK = eINSTANCE.getSimpleLink();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLE_LINK__TARGET = eINSTANCE.getSimpleLink_Target();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.drawio.impl.CustomLinkImpl <em>Custom Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.drawio.impl.CustomLinkImpl
		 * @see org.nasdanika.sdk.runtime.models.drawio.impl.DrawioPackageImpl#getCustomLink()
		 * @generated
		 */
		EClass CUSTOM_LINK = eINSTANCE.getCustomLink();

		/**
		 * The meta object literal for the '<em><b>Resource</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOM_LINK__RESOURCE = eINSTANCE.getCustomLink_Resource();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CUSTOM_LINK__TARGET = eINSTANCE.getCustomLink_Target();

		/**
		 * The meta object literal for the '<em><b>Page Selector Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOM_LINK__PAGE_SELECTOR_TYPE = eINSTANCE.getCustomLink_PageSelectorType();

		/**
		 * The meta object literal for the '<em><b>Page Selector</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOM_LINK__PAGE_SELECTOR = eINSTANCE.getCustomLink_PageSelector();

		/**
		 * The meta object literal for the '<em><b>Element Selector Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOM_LINK__ELEMENT_SELECTOR_TYPE = eINSTANCE.getCustomLink_ElementSelectorType();

		/**
		 * The meta object literal for the '<em><b>Element Selector</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOM_LINK__ELEMENT_SELECTOR = eINSTANCE.getCustomLink_ElementSelector();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.drawio.impl.SpelLinkImpl <em>Spel Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.drawio.impl.SpelLinkImpl
		 * @see org.nasdanika.sdk.runtime.models.drawio.impl.DrawioPackageImpl#getSpelLink()
		 * @generated
		 */
		EClass SPEL_LINK = eINSTANCE.getSpelLink();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPEL_LINK__EXPRESSION = eINSTANCE.getSpelLink_Expression();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.drawio.impl.ActionsImpl <em>Actions</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.drawio.impl.ActionsImpl
		 * @see org.nasdanika.sdk.runtime.models.drawio.impl.DrawioPackageImpl#getActions()
		 * @generated
		 */
		EClass ACTIONS = eINSTANCE.getActions();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIONS__TITLE = eINSTANCE.getActions_Title();

		/**
		 * The meta object literal for the '<em><b>Actions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIONS__ACTIONS = eINSTANCE.getActions_Actions();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.drawio.impl.AnimationImpl <em>Animation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.drawio.impl.AnimationImpl
		 * @see org.nasdanika.sdk.runtime.models.drawio.impl.DrawioPackageImpl#getAnimation()
		 * @generated
		 */
		EClass ANIMATION = eINSTANCE.getAnimation();

		/**
		 * The meta object literal for the '<em><b>Enabled</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANIMATION__ENABLED = eINSTANCE.getAnimation_Enabled();

		/**
		 * The meta object literal for the '<em><b>Loop</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANIMATION__LOOP = eINSTANCE.getAnimation_Loop();

		/**
		 * The meta object literal for the '<em><b>Steps</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANIMATION__STEPS = eINSTANCE.getAnimation_Steps();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.drawio.impl.ActionImpl <em>Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.drawio.impl.ActionImpl
		 * @see org.nasdanika.sdk.runtime.models.drawio.impl.DrawioPackageImpl#getAction()
		 * @generated
		 */
		EClass ACTION = eINSTANCE.getAction();

		/**
		 * The meta object literal for the '<em><b>Immediate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION__IMMEDIATE = eINSTANCE.getAction_Immediate();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.drawio.impl.WaitImpl <em>Wait</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.drawio.impl.WaitImpl
		 * @see org.nasdanika.sdk.runtime.models.drawio.impl.DrawioPackageImpl#getWait()
		 * @generated
		 */
		EClass WAIT = eINSTANCE.getWait();

		/**
		 * The meta object literal for the '<em><b>Delay</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WAIT__DELAY = eINSTANCE.getWait_Delay();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.drawio.impl.TargetedActionImpl <em>Targeted Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.drawio.impl.TargetedActionImpl
		 * @see org.nasdanika.sdk.runtime.models.drawio.impl.DrawioPackageImpl#getTargetedAction()
		 * @generated
		 */
		EClass TARGETED_ACTION = eINSTANCE.getTargetedAction();

		/**
		 * The meta object literal for the '<em><b>Cells</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TARGETED_ACTION__CELLS = eINSTANCE.getTargetedAction_Cells();

		/**
		 * The meta object literal for the '<em><b>All Cells</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TARGETED_ACTION__ALL_CELLS = eINSTANCE.getTargetedAction_AllCells();

		/**
		 * The meta object literal for the '<em><b>Layers</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TARGETED_ACTION__LAYERS = eINSTANCE.getTargetedAction_Layers();

		/**
		 * The meta object literal for the '<em><b>Tags</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TARGETED_ACTION__TAGS = eINSTANCE.getTargetedAction_Tags();

		/**
		 * The meta object literal for the '<em><b>Tags Match</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TARGETED_ACTION__TAGS_MATCH = eINSTANCE.getTargetedAction_TagsMatch();

		/**
		 * The meta object literal for the '<em><b>Exclude Cells</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TARGETED_ACTION__EXCLUDE_CELLS = eINSTANCE.getTargetedAction_ExcludeCells();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.drawio.impl.PersistableActionImpl <em>Persistable Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.drawio.impl.PersistableActionImpl
		 * @see org.nasdanika.sdk.runtime.models.drawio.impl.DrawioPackageImpl#getPersistableAction()
		 * @generated
		 */
		EClass PERSISTABLE_ACTION = eINSTANCE.getPersistableAction();

		/**
		 * The meta object literal for the '<em><b>Persist Changes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSISTABLE_ACTION__PERSIST_CHANGES = eINSTANCE.getPersistableAction_PersistChanges();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.drawio.impl.ShowImpl <em>Show</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.drawio.impl.ShowImpl
		 * @see org.nasdanika.sdk.runtime.models.drawio.impl.DrawioPackageImpl#getShow()
		 * @generated
		 */
		EClass SHOW = eINSTANCE.getShow();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.drawio.impl.HideImpl <em>Hide</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.drawio.impl.HideImpl
		 * @see org.nasdanika.sdk.runtime.models.drawio.impl.DrawioPackageImpl#getHide()
		 * @generated
		 */
		EClass HIDE = eINSTANCE.getHide();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.drawio.impl.ToggleImpl <em>Toggle</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.drawio.impl.ToggleImpl
		 * @see org.nasdanika.sdk.runtime.models.drawio.impl.DrawioPackageImpl#getToggle()
		 * @generated
		 */
		EClass TOGGLE = eINSTANCE.getToggle();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.drawio.impl.SetOpacityImpl <em>Set Opacity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.drawio.impl.SetOpacityImpl
		 * @see org.nasdanika.sdk.runtime.models.drawio.impl.DrawioPackageImpl#getSetOpacity()
		 * @generated
		 */
		EClass SET_OPACITY = eINSTANCE.getSetOpacity();

		/**
		 * The meta object literal for the '<em><b>Opacity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SET_OPACITY__OPACITY = eINSTANCE.getSetOpacity_Opacity();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.drawio.impl.TransitionEffectImpl <em>Transition Effect</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.drawio.impl.TransitionEffectImpl
		 * @see org.nasdanika.sdk.runtime.models.drawio.impl.DrawioPackageImpl#getTransitionEffect()
		 * @generated
		 */
		EClass TRANSITION_EFFECT = eINSTANCE.getTransitionEffect();

		/**
		 * The meta object literal for the '<em><b>Delay</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION_EFFECT__DELAY = eINSTANCE.getTransitionEffect_Delay();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.drawio.impl.FadeInImpl <em>Fade In</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.drawio.impl.FadeInImpl
		 * @see org.nasdanika.sdk.runtime.models.drawio.impl.DrawioPackageImpl#getFadeIn()
		 * @generated
		 */
		EClass FADE_IN = eINSTANCE.getFadeIn();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.drawio.impl.FadeOutImpl <em>Fade Out</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.drawio.impl.FadeOutImpl
		 * @see org.nasdanika.sdk.runtime.models.drawio.impl.DrawioPackageImpl#getFadeOut()
		 * @generated
		 */
		EClass FADE_OUT = eINSTANCE.getFadeOut();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.drawio.impl.FadeToImpl <em>Fade To</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.drawio.impl.FadeToImpl
		 * @see org.nasdanika.sdk.runtime.models.drawio.impl.DrawioPackageImpl#getFadeTo()
		 * @generated
		 */
		EClass FADE_TO = eINSTANCE.getFadeTo();

		/**
		 * The meta object literal for the '<em><b>Opacity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FADE_TO__OPACITY = eINSTANCE.getFadeTo_Opacity();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.drawio.impl.WipeInImpl <em>Wipe In</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.drawio.impl.WipeInImpl
		 * @see org.nasdanika.sdk.runtime.models.drawio.impl.DrawioPackageImpl#getWipeIn()
		 * @generated
		 */
		EClass WIPE_IN = eINSTANCE.getWipeIn();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.drawio.impl.WipeOutImpl <em>Wipe Out</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.drawio.impl.WipeOutImpl
		 * @see org.nasdanika.sdk.runtime.models.drawio.impl.DrawioPackageImpl#getWipeOut()
		 * @generated
		 */
		EClass WIPE_OUT = eINSTANCE.getWipeOut();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.drawio.impl.PopInImpl <em>Pop In</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.drawio.impl.PopInImpl
		 * @see org.nasdanika.sdk.runtime.models.drawio.impl.DrawioPackageImpl#getPopIn()
		 * @generated
		 */
		EClass POP_IN = eINSTANCE.getPopIn();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.drawio.impl.PopOutImpl <em>Pop Out</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.drawio.impl.PopOutImpl
		 * @see org.nasdanika.sdk.runtime.models.drawio.impl.DrawioPackageImpl#getPopOut()
		 * @generated
		 */
		EClass POP_OUT = eINSTANCE.getPopOut();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.drawio.impl.SetStyleImpl <em>Set Style</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.drawio.impl.SetStyleImpl
		 * @see org.nasdanika.sdk.runtime.models.drawio.impl.DrawioPackageImpl#getSetStyle()
		 * @generated
		 */
		EClass SET_STYLE = eINSTANCE.getSetStyle();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SET_STYLE__KEY = eINSTANCE.getSetStyle_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SET_STYLE__VALUE = eINSTANCE.getSetStyle_Value();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.drawio.impl.ToggleStyleImpl <em>Toggle Style</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.drawio.impl.ToggleStyleImpl
		 * @see org.nasdanika.sdk.runtime.models.drawio.impl.DrawioPackageImpl#getToggleStyle()
		 * @generated
		 */
		EClass TOGGLE_STYLE = eINSTANCE.getToggleStyle();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOGGLE_STYLE__KEY = eINSTANCE.getToggleStyle_Key();

		/**
		 * The meta object literal for the '<em><b>Default Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOGGLE_STYLE__DEFAULT_VALUE = eINSTANCE.getToggleStyle_DefaultValue();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.drawio.impl.HighlightImpl <em>Highlight</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.drawio.impl.HighlightImpl
		 * @see org.nasdanika.sdk.runtime.models.drawio.impl.DrawioPackageImpl#getHighlight()
		 * @generated
		 */
		EClass HIGHLIGHT = eINSTANCE.getHighlight();

		/**
		 * The meta object literal for the '<em><b>Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HIGHLIGHT__COLOR = eINSTANCE.getHighlight_Color();

		/**
		 * The meta object literal for the '<em><b>Opacity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HIGHLIGHT__OPACITY = eINSTANCE.getHighlight_Opacity();

		/**
		 * The meta object literal for the '<em><b>Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HIGHLIGHT__DURATION = eINSTANCE.getHighlight_Duration();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.drawio.impl.FlowImpl <em>Flow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.drawio.impl.FlowImpl
		 * @see org.nasdanika.sdk.runtime.models.drawio.impl.DrawioPackageImpl#getFlow()
		 * @generated
		 */
		EClass FLOW = eINSTANCE.getFlow();

		/**
		 * The meta object literal for the '<em><b>Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLOW__MODE = eINSTANCE.getFlow_Mode();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.drawio.impl.SelectImpl <em>Select</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.drawio.impl.SelectImpl
		 * @see org.nasdanika.sdk.runtime.models.drawio.impl.DrawioPackageImpl#getSelect()
		 * @generated
		 */
		EClass SELECT = eINSTANCE.getSelect();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.drawio.impl.ScrollImpl <em>Scroll</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.drawio.impl.ScrollImpl
		 * @see org.nasdanika.sdk.runtime.models.drawio.impl.DrawioPackageImpl#getScroll()
		 * @generated
		 */
		EClass SCROLL = eINSTANCE.getScroll();

		/**
		 * The meta object literal for the '<em><b>Smooth</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCROLL__SMOOTH = eINSTANCE.getScroll_Smooth();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.drawio.impl.ViewboxImpl <em>Viewbox</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.drawio.impl.ViewboxImpl
		 * @see org.nasdanika.sdk.runtime.models.drawio.impl.DrawioPackageImpl#getViewbox()
		 * @generated
		 */
		EClass VIEWBOX = eINSTANCE.getViewbox();

		/**
		 * The meta object literal for the '<em><b>Bounds</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIEWBOX__BOUNDS = eINSTANCE.getViewbox_Bounds();

		/**
		 * The meta object literal for the '<em><b>Smooth</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIEWBOX__SMOOTH = eINSTANCE.getViewbox_Smooth();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.drawio.impl.OpenImpl <em>Open</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.drawio.impl.OpenImpl
		 * @see org.nasdanika.sdk.runtime.models.drawio.impl.DrawioPackageImpl#getOpen()
		 * @generated
		 */
		EClass OPEN = eINSTANCE.getOpen();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPEN__TARGET = eINSTANCE.getOpen_Target();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.drawio.impl.TagsActionImpl <em>Tags Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.drawio.impl.TagsActionImpl
		 * @see org.nasdanika.sdk.runtime.models.drawio.impl.DrawioPackageImpl#getTagsAction()
		 * @generated
		 */
		EClass TAGS_ACTION = eINSTANCE.getTagsAction();

		/**
		 * The meta object literal for the '<em><b>Toggle</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TAGS_ACTION__TOGGLE = eINSTANCE.getTagsAction_Toggle();

		/**
		 * The meta object literal for the '<em><b>Hidden</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TAGS_ACTION__HIDDEN = eINSTANCE.getTagsAction_Hidden();

		/**
		 * The meta object literal for the '<em><b>Visible</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TAGS_ACTION__VISIBLE = eINSTANCE.getTagsAction_Visible();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.drawio.SelectorType <em>Selector Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.drawio.SelectorType
		 * @see org.nasdanika.sdk.runtime.models.drawio.impl.DrawioPackageImpl#getSelectorType()
		 * @generated
		 */
		EEnum SELECTOR_TYPE = eINSTANCE.getSelectorType();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.drawio.TagsMatch <em>Tags Match</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.drawio.TagsMatch
		 * @see org.nasdanika.sdk.runtime.models.drawio.impl.DrawioPackageImpl#getTagsMatch()
		 * @generated
		 */
		EEnum TAGS_MATCH = eINSTANCE.getTagsMatch();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.drawio.FlowMode <em>Flow Mode</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.drawio.FlowMode
		 * @see org.nasdanika.sdk.runtime.models.drawio.impl.DrawioPackageImpl#getFlowMode()
		 * @generated
		 */
		EEnum FLOW_MODE = eINSTANCE.getFlowMode();

	}

} //DrawioPackage
