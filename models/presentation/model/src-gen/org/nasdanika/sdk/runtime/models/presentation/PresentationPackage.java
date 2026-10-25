/**
 */
package org.nasdanika.sdk.runtime.models.presentation;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.nasdanika.sdk.runtime.models.diagram.DiagramPackage;

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
 * @see org.nasdanika.sdk.runtime.models.presentation.PresentationFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel modelDirectory='/model/src-gen' featureDelegation='Dynamic' complianceLevel='25' suppressGenModelAnnotations='false' copyrightFields='false' operationReflection='true' importOrganizing='true' basePackage='org.nasdanika.sdk.runtime.models'"
 *        annotation="http://www.eclipse.org/emf/2011/Xcore Ecore='http://www.eclipse.org/emf/2002/Ecore' GenModel='http://www.eclipse.org/emf/2002/GenModel' Nasdanika='urn:org.nasdanika'"
 * @generated
 */
public interface PresentationPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "presentation";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "https://runtime.sdk.nasdanika.org/models/presentation";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.nasdanika.sdk.runtime.models.presentation";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PresentationPackage eINSTANCE = org.nasdanika.sdk.runtime.models.presentation.impl.PresentationPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.presentation.impl.PresentationImpl <em>Presentation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.presentation.impl.PresentationImpl
	 * @see org.nasdanika.sdk.runtime.models.presentation.impl.PresentationPackageImpl#getPresentation()
	 * @generated
	 */
	int PRESENTATION = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESENTATION__ID = DiagramPackage.DIAGRAM__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESENTATION__DOCUMENTATION = DiagramPackage.DIAGRAM__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESENTATION__DOC_REF = DiagramPackage.DIAGRAM__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESENTATION__DOC_FORMAT = DiagramPackage.DIAGRAM__DOC_FORMAT;

	/**
	 * The feature id for the '<em><b>Doc Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESENTATION__DOC_CONTENTS = DiagramPackage.DIAGRAM__DOC_CONTENTS;

	/**
	 * The feature id for the '<em><b>Doc Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESENTATION__DOC_SECTIONS = DiagramPackage.DIAGRAM__DOC_SECTIONS;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESENTATION__MARKERS = DiagramPackage.DIAGRAM__MARKERS;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESENTATION__ICON = DiagramPackage.DIAGRAM__ICON;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESENTATION__URIS = DiagramPackage.DIAGRAM__URIS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESENTATION__NAME = DiagramPackage.DIAGRAM__NAME;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESENTATION__ATTRIBUTES = DiagramPackage.DIAGRAM__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Semantic Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESENTATION__SEMANTIC_ELEMENTS = DiagramPackage.DIAGRAM__SEMANTIC_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESENTATION__CHILDREN = DiagramPackage.DIAGRAM__CHILDREN;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESENTATION__WIDTH = DiagramPackage.DIAGRAM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESENTATION__HEIGHT = DiagramPackage.DIAGRAM_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Slides</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESENTATION__SLIDES = DiagramPackage.DIAGRAM_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Master Slides</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESENTATION__MASTER_SLIDES = DiagramPackage.DIAGRAM_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Presentation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESENTATION_FEATURE_COUNT = DiagramPackage.DIAGRAM_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESENTATION___COLLECT__OBJECT_EREFERENCE_ELIST = DiagramPackage.DIAGRAM___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESENTATION___GET_REFERRERS__EREFERENCE = DiagramPackage.DIAGRAM___GET_REFERRERS__EREFERENCE;

	/**
	 * The number of operations of the '<em>Presentation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESENTATION_OPERATION_COUNT = DiagramPackage.DIAGRAM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.presentation.impl.SlideImpl <em>Slide</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.presentation.impl.SlideImpl
	 * @see org.nasdanika.sdk.runtime.models.presentation.impl.PresentationPackageImpl#getSlide()
	 * @generated
	 */
	int SLIDE = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDE__ID = DiagramPackage.DIAGRAM__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDE__DOCUMENTATION = DiagramPackage.DIAGRAM__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDE__DOC_REF = DiagramPackage.DIAGRAM__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDE__DOC_FORMAT = DiagramPackage.DIAGRAM__DOC_FORMAT;

	/**
	 * The feature id for the '<em><b>Doc Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDE__DOC_CONTENTS = DiagramPackage.DIAGRAM__DOC_CONTENTS;

	/**
	 * The feature id for the '<em><b>Doc Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDE__DOC_SECTIONS = DiagramPackage.DIAGRAM__DOC_SECTIONS;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDE__MARKERS = DiagramPackage.DIAGRAM__MARKERS;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDE__ICON = DiagramPackage.DIAGRAM__ICON;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDE__URIS = DiagramPackage.DIAGRAM__URIS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDE__NAME = DiagramPackage.DIAGRAM__NAME;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDE__ATTRIBUTES = DiagramPackage.DIAGRAM__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Semantic Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDE__SEMANTIC_ELEMENTS = DiagramPackage.DIAGRAM__SEMANTIC_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDE__CHILDREN = DiagramPackage.DIAGRAM__CHILDREN;

	/**
	 * The feature id for the '<em><b>Master</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDE__MASTER = DiagramPackage.DIAGRAM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDE__HIDDEN = DiagramPackage.DIAGRAM_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Notes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDE__NOTES = DiagramPackage.DIAGRAM_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Slide</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDE_FEATURE_COUNT = DiagramPackage.DIAGRAM_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDE___COLLECT__OBJECT_EREFERENCE_ELIST = DiagramPackage.DIAGRAM___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDE___GET_REFERRERS__EREFERENCE = DiagramPackage.DIAGRAM___GET_REFERRERS__EREFERENCE;

	/**
	 * The number of operations of the '<em>Slide</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDE_OPERATION_COUNT = DiagramPackage.DIAGRAM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.presentation.impl.MasterSlideImpl <em>Master Slide</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.presentation.impl.MasterSlideImpl
	 * @see org.nasdanika.sdk.runtime.models.presentation.impl.PresentationPackageImpl#getMasterSlide()
	 * @generated
	 */
	int MASTER_SLIDE = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTER_SLIDE__ID = SLIDE__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTER_SLIDE__DOCUMENTATION = SLIDE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTER_SLIDE__DOC_REF = SLIDE__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTER_SLIDE__DOC_FORMAT = SLIDE__DOC_FORMAT;

	/**
	 * The feature id for the '<em><b>Doc Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTER_SLIDE__DOC_CONTENTS = SLIDE__DOC_CONTENTS;

	/**
	 * The feature id for the '<em><b>Doc Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTER_SLIDE__DOC_SECTIONS = SLIDE__DOC_SECTIONS;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTER_SLIDE__MARKERS = SLIDE__MARKERS;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTER_SLIDE__ICON = SLIDE__ICON;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTER_SLIDE__URIS = SLIDE__URIS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTER_SLIDE__NAME = SLIDE__NAME;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTER_SLIDE__ATTRIBUTES = SLIDE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Semantic Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTER_SLIDE__SEMANTIC_ELEMENTS = SLIDE__SEMANTIC_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTER_SLIDE__CHILDREN = SLIDE__CHILDREN;

	/**
	 * The feature id for the '<em><b>Master</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTER_SLIDE__MASTER = SLIDE__MASTER;

	/**
	 * The feature id for the '<em><b>Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTER_SLIDE__HIDDEN = SLIDE__HIDDEN;

	/**
	 * The feature id for the '<em><b>Notes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTER_SLIDE__NOTES = SLIDE__NOTES;

	/**
	 * The number of structural features of the '<em>Master Slide</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTER_SLIDE_FEATURE_COUNT = SLIDE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTER_SLIDE___COLLECT__OBJECT_EREFERENCE_ELIST = SLIDE___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTER_SLIDE___GET_REFERRERS__EREFERENCE = SLIDE___GET_REFERRERS__EREFERENCE;

	/**
	 * The number of operations of the '<em>Master Slide</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTER_SLIDE_OPERATION_COUNT = SLIDE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.presentation.impl.NotesImpl <em>Notes</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.presentation.impl.NotesImpl
	 * @see org.nasdanika.sdk.runtime.models.presentation.impl.PresentationPackageImpl#getNotes()
	 * @generated
	 */
	int NOTES = 3;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTES__TEXT = 0;

	/**
	 * The number of structural features of the '<em>Notes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTES_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Notes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.presentation.impl.ShapeImpl <em>Shape</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.presentation.impl.ShapeImpl
	 * @see org.nasdanika.sdk.runtime.models.presentation.impl.PresentationPackageImpl#getShape()
	 * @generated
	 */
	int SHAPE = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE__ID = DiagramPackage.NODE__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE__DOCUMENTATION = DiagramPackage.NODE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE__DOC_REF = DiagramPackage.NODE__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE__DOC_FORMAT = DiagramPackage.NODE__DOC_FORMAT;

	/**
	 * The feature id for the '<em><b>Doc Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE__DOC_CONTENTS = DiagramPackage.NODE__DOC_CONTENTS;

	/**
	 * The feature id for the '<em><b>Doc Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE__DOC_SECTIONS = DiagramPackage.NODE__DOC_SECTIONS;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE__MARKERS = DiagramPackage.NODE__MARKERS;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE__ICON = DiagramPackage.NODE__ICON;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE__URIS = DiagramPackage.NODE__URIS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE__NAME = DiagramPackage.NODE__NAME;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE__ATTRIBUTES = DiagramPackage.NODE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Semantic Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE__SEMANTIC_ELEMENTS = DiagramPackage.NODE__SEMANTIC_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE__CHILDREN = DiagramPackage.NODE__CHILDREN;

	/**
	 * The feature id for the '<em><b>Incoming Connections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE__INCOMING_CONNECTIONS = DiagramPackage.NODE__INCOMING_CONNECTIONS;

	/**
	 * The feature id for the '<em><b>Outgoing Connections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE__OUTGOING_CONNECTIONS = DiagramPackage.NODE__OUTGOING_CONNECTIONS;

	/**
	 * The feature id for the '<em><b>Bounds</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE__BOUNDS = DiagramPackage.NODE__BOUNDS;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE__PORTS = DiagramPackage.NODE__PORTS;

	/**
	 * The feature id for the '<em><b>Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE__ORDER = DiagramPackage.NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rotation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE__ROTATION = DiagramPackage.NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Flip Horizontal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE__FLIP_HORIZONTAL = DiagramPackage.NODE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Flip Vertical</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE__FLIP_VERTICAL = DiagramPackage.NODE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Shape</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE_FEATURE_COUNT = DiagramPackage.NODE_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE___COLLECT__OBJECT_EREFERENCE_ELIST = DiagramPackage.NODE___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE___GET_REFERRERS__EREFERENCE = DiagramPackage.NODE___GET_REFERRERS__EREFERENCE;

	/**
	 * The number of operations of the '<em>Shape</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE_OPERATION_COUNT = DiagramPackage.NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.presentation.impl.GroupShapeImpl <em>Group Shape</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.presentation.impl.GroupShapeImpl
	 * @see org.nasdanika.sdk.runtime.models.presentation.impl.PresentationPackageImpl#getGroupShape()
	 * @generated
	 */
	int GROUP_SHAPE = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_SHAPE__ID = SHAPE__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_SHAPE__DOCUMENTATION = SHAPE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_SHAPE__DOC_REF = SHAPE__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_SHAPE__DOC_FORMAT = SHAPE__DOC_FORMAT;

	/**
	 * The feature id for the '<em><b>Doc Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_SHAPE__DOC_CONTENTS = SHAPE__DOC_CONTENTS;

	/**
	 * The feature id for the '<em><b>Doc Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_SHAPE__DOC_SECTIONS = SHAPE__DOC_SECTIONS;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_SHAPE__MARKERS = SHAPE__MARKERS;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_SHAPE__ICON = SHAPE__ICON;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_SHAPE__URIS = SHAPE__URIS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_SHAPE__NAME = SHAPE__NAME;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_SHAPE__ATTRIBUTES = SHAPE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Semantic Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_SHAPE__SEMANTIC_ELEMENTS = SHAPE__SEMANTIC_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_SHAPE__CHILDREN = SHAPE__CHILDREN;

	/**
	 * The feature id for the '<em><b>Incoming Connections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_SHAPE__INCOMING_CONNECTIONS = SHAPE__INCOMING_CONNECTIONS;

	/**
	 * The feature id for the '<em><b>Outgoing Connections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_SHAPE__OUTGOING_CONNECTIONS = SHAPE__OUTGOING_CONNECTIONS;

	/**
	 * The feature id for the '<em><b>Bounds</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_SHAPE__BOUNDS = SHAPE__BOUNDS;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_SHAPE__PORTS = SHAPE__PORTS;

	/**
	 * The feature id for the '<em><b>Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_SHAPE__ORDER = SHAPE__ORDER;

	/**
	 * The feature id for the '<em><b>Rotation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_SHAPE__ROTATION = SHAPE__ROTATION;

	/**
	 * The feature id for the '<em><b>Flip Horizontal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_SHAPE__FLIP_HORIZONTAL = SHAPE__FLIP_HORIZONTAL;

	/**
	 * The feature id for the '<em><b>Flip Vertical</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_SHAPE__FLIP_VERTICAL = SHAPE__FLIP_VERTICAL;

	/**
	 * The number of structural features of the '<em>Group Shape</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_SHAPE_FEATURE_COUNT = SHAPE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_SHAPE___COLLECT__OBJECT_EREFERENCE_ELIST = SHAPE___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_SHAPE___GET_REFERRERS__EREFERENCE = SHAPE___GET_REFERRERS__EREFERENCE;

	/**
	 * The number of operations of the '<em>Group Shape</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_SHAPE_OPERATION_COUNT = SHAPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.presentation.impl.TextShapeImpl <em>Text Shape</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.presentation.impl.TextShapeImpl
	 * @see org.nasdanika.sdk.runtime.models.presentation.impl.PresentationPackageImpl#getTextShape()
	 * @generated
	 */
	int TEXT_SHAPE = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_SHAPE__ID = SHAPE__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_SHAPE__DOCUMENTATION = SHAPE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_SHAPE__DOC_REF = SHAPE__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_SHAPE__DOC_FORMAT = SHAPE__DOC_FORMAT;

	/**
	 * The feature id for the '<em><b>Doc Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_SHAPE__DOC_CONTENTS = SHAPE__DOC_CONTENTS;

	/**
	 * The feature id for the '<em><b>Doc Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_SHAPE__DOC_SECTIONS = SHAPE__DOC_SECTIONS;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_SHAPE__MARKERS = SHAPE__MARKERS;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_SHAPE__ICON = SHAPE__ICON;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_SHAPE__URIS = SHAPE__URIS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_SHAPE__NAME = SHAPE__NAME;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_SHAPE__ATTRIBUTES = SHAPE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Semantic Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_SHAPE__SEMANTIC_ELEMENTS = SHAPE__SEMANTIC_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_SHAPE__CHILDREN = SHAPE__CHILDREN;

	/**
	 * The feature id for the '<em><b>Incoming Connections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_SHAPE__INCOMING_CONNECTIONS = SHAPE__INCOMING_CONNECTIONS;

	/**
	 * The feature id for the '<em><b>Outgoing Connections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_SHAPE__OUTGOING_CONNECTIONS = SHAPE__OUTGOING_CONNECTIONS;

	/**
	 * The feature id for the '<em><b>Bounds</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_SHAPE__BOUNDS = SHAPE__BOUNDS;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_SHAPE__PORTS = SHAPE__PORTS;

	/**
	 * The feature id for the '<em><b>Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_SHAPE__ORDER = SHAPE__ORDER;

	/**
	 * The feature id for the '<em><b>Rotation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_SHAPE__ROTATION = SHAPE__ROTATION;

	/**
	 * The feature id for the '<em><b>Flip Horizontal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_SHAPE__FLIP_HORIZONTAL = SHAPE__FLIP_HORIZONTAL;

	/**
	 * The feature id for the '<em><b>Flip Vertical</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_SHAPE__FLIP_VERTICAL = SHAPE__FLIP_VERTICAL;

	/**
	 * The feature id for the '<em><b>Paragraphs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_SHAPE__PARAGRAPHS = SHAPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Text Shape</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_SHAPE_FEATURE_COUNT = SHAPE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_SHAPE___COLLECT__OBJECT_EREFERENCE_ELIST = SHAPE___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_SHAPE___GET_REFERRERS__EREFERENCE = SHAPE___GET_REFERRERS__EREFERENCE;

	/**
	 * The number of operations of the '<em>Text Shape</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_SHAPE_OPERATION_COUNT = SHAPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.presentation.impl.ParagraphImpl <em>Paragraph</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.presentation.impl.ParagraphImpl
	 * @see org.nasdanika.sdk.runtime.models.presentation.impl.PresentationPackageImpl#getParagraph()
	 * @generated
	 */
	int PARAGRAPH = 7;

	/**
	 * The feature id for the '<em><b>Runs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAGRAPH__RUNS = 0;

	/**
	 * The feature id for the '<em><b>Indent Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAGRAPH__INDENT_LEVEL = 1;

	/**
	 * The feature id for the '<em><b>Alignment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAGRAPH__ALIGNMENT = 2;

	/**
	 * The number of structural features of the '<em>Paragraph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAGRAPH_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Paragraph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAGRAPH_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.presentation.impl.TextRunImpl <em>Text Run</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.presentation.impl.TextRunImpl
	 * @see org.nasdanika.sdk.runtime.models.presentation.impl.PresentationPackageImpl#getTextRun()
	 * @generated
	 */
	int TEXT_RUN = 8;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_RUN__TEXT = 0;

	/**
	 * The feature id for the '<em><b>Font Family</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_RUN__FONT_FAMILY = 1;

	/**
	 * The feature id for the '<em><b>Font Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_RUN__FONT_SIZE = 2;

	/**
	 * The feature id for the '<em><b>Bold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_RUN__BOLD = 3;

	/**
	 * The feature id for the '<em><b>Italic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_RUN__ITALIC = 4;

	/**
	 * The feature id for the '<em><b>Underline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_RUN__UNDERLINE = 5;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_RUN__COLOR = 6;

	/**
	 * The feature id for the '<em><b>Hyperlink</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_RUN__HYPERLINK = 7;

	/**
	 * The number of structural features of the '<em>Text Run</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_RUN_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Text Run</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_RUN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.presentation.impl.ImageShapeImpl <em>Image Shape</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.presentation.impl.ImageShapeImpl
	 * @see org.nasdanika.sdk.runtime.models.presentation.impl.PresentationPackageImpl#getImageShape()
	 * @generated
	 */
	int IMAGE_SHAPE = 9;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_SHAPE__ID = SHAPE__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_SHAPE__DOCUMENTATION = SHAPE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_SHAPE__DOC_REF = SHAPE__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_SHAPE__DOC_FORMAT = SHAPE__DOC_FORMAT;

	/**
	 * The feature id for the '<em><b>Doc Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_SHAPE__DOC_CONTENTS = SHAPE__DOC_CONTENTS;

	/**
	 * The feature id for the '<em><b>Doc Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_SHAPE__DOC_SECTIONS = SHAPE__DOC_SECTIONS;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_SHAPE__MARKERS = SHAPE__MARKERS;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_SHAPE__ICON = SHAPE__ICON;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_SHAPE__URIS = SHAPE__URIS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_SHAPE__NAME = SHAPE__NAME;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_SHAPE__ATTRIBUTES = SHAPE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Semantic Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_SHAPE__SEMANTIC_ELEMENTS = SHAPE__SEMANTIC_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_SHAPE__CHILDREN = SHAPE__CHILDREN;

	/**
	 * The feature id for the '<em><b>Incoming Connections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_SHAPE__INCOMING_CONNECTIONS = SHAPE__INCOMING_CONNECTIONS;

	/**
	 * The feature id for the '<em><b>Outgoing Connections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_SHAPE__OUTGOING_CONNECTIONS = SHAPE__OUTGOING_CONNECTIONS;

	/**
	 * The feature id for the '<em><b>Bounds</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_SHAPE__BOUNDS = SHAPE__BOUNDS;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_SHAPE__PORTS = SHAPE__PORTS;

	/**
	 * The feature id for the '<em><b>Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_SHAPE__ORDER = SHAPE__ORDER;

	/**
	 * The feature id for the '<em><b>Rotation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_SHAPE__ROTATION = SHAPE__ROTATION;

	/**
	 * The feature id for the '<em><b>Flip Horizontal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_SHAPE__FLIP_HORIZONTAL = SHAPE__FLIP_HORIZONTAL;

	/**
	 * The feature id for the '<em><b>Flip Vertical</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_SHAPE__FLIP_VERTICAL = SHAPE__FLIP_VERTICAL;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_SHAPE__LOCATION = SHAPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Content Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_SHAPE__CONTENT_TYPE = SHAPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Image Shape</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_SHAPE_FEATURE_COUNT = SHAPE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_SHAPE___COLLECT__OBJECT_EREFERENCE_ELIST = SHAPE___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_SHAPE___GET_REFERRERS__EREFERENCE = SHAPE___GET_REFERRERS__EREFERENCE;

	/**
	 * The number of operations of the '<em>Image Shape</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_SHAPE_OPERATION_COUNT = SHAPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.presentation.impl.MediaShapeImpl <em>Media Shape</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.presentation.impl.MediaShapeImpl
	 * @see org.nasdanika.sdk.runtime.models.presentation.impl.PresentationPackageImpl#getMediaShape()
	 * @generated
	 */
	int MEDIA_SHAPE = 10;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIA_SHAPE__ID = SHAPE__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIA_SHAPE__DOCUMENTATION = SHAPE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIA_SHAPE__DOC_REF = SHAPE__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIA_SHAPE__DOC_FORMAT = SHAPE__DOC_FORMAT;

	/**
	 * The feature id for the '<em><b>Doc Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIA_SHAPE__DOC_CONTENTS = SHAPE__DOC_CONTENTS;

	/**
	 * The feature id for the '<em><b>Doc Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIA_SHAPE__DOC_SECTIONS = SHAPE__DOC_SECTIONS;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIA_SHAPE__MARKERS = SHAPE__MARKERS;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIA_SHAPE__ICON = SHAPE__ICON;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIA_SHAPE__URIS = SHAPE__URIS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIA_SHAPE__NAME = SHAPE__NAME;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIA_SHAPE__ATTRIBUTES = SHAPE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Semantic Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIA_SHAPE__SEMANTIC_ELEMENTS = SHAPE__SEMANTIC_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIA_SHAPE__CHILDREN = SHAPE__CHILDREN;

	/**
	 * The feature id for the '<em><b>Incoming Connections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIA_SHAPE__INCOMING_CONNECTIONS = SHAPE__INCOMING_CONNECTIONS;

	/**
	 * The feature id for the '<em><b>Outgoing Connections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIA_SHAPE__OUTGOING_CONNECTIONS = SHAPE__OUTGOING_CONNECTIONS;

	/**
	 * The feature id for the '<em><b>Bounds</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIA_SHAPE__BOUNDS = SHAPE__BOUNDS;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIA_SHAPE__PORTS = SHAPE__PORTS;

	/**
	 * The feature id for the '<em><b>Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIA_SHAPE__ORDER = SHAPE__ORDER;

	/**
	 * The feature id for the '<em><b>Rotation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIA_SHAPE__ROTATION = SHAPE__ROTATION;

	/**
	 * The feature id for the '<em><b>Flip Horizontal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIA_SHAPE__FLIP_HORIZONTAL = SHAPE__FLIP_HORIZONTAL;

	/**
	 * The feature id for the '<em><b>Flip Vertical</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIA_SHAPE__FLIP_VERTICAL = SHAPE__FLIP_VERTICAL;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIA_SHAPE__LOCATION = SHAPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Content Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIA_SHAPE__CONTENT_TYPE = SHAPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Media Shape</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIA_SHAPE_FEATURE_COUNT = SHAPE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIA_SHAPE___COLLECT__OBJECT_EREFERENCE_ELIST = SHAPE___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIA_SHAPE___GET_REFERRERS__EREFERENCE = SHAPE___GET_REFERRERS__EREFERENCE;

	/**
	 * The number of operations of the '<em>Media Shape</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIA_SHAPE_OPERATION_COUNT = SHAPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.presentation.impl.TableShapeImpl <em>Table Shape</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.presentation.impl.TableShapeImpl
	 * @see org.nasdanika.sdk.runtime.models.presentation.impl.PresentationPackageImpl#getTableShape()
	 * @generated
	 */
	int TABLE_SHAPE = 11;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_SHAPE__ID = SHAPE__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_SHAPE__DOCUMENTATION = SHAPE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_SHAPE__DOC_REF = SHAPE__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_SHAPE__DOC_FORMAT = SHAPE__DOC_FORMAT;

	/**
	 * The feature id for the '<em><b>Doc Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_SHAPE__DOC_CONTENTS = SHAPE__DOC_CONTENTS;

	/**
	 * The feature id for the '<em><b>Doc Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_SHAPE__DOC_SECTIONS = SHAPE__DOC_SECTIONS;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_SHAPE__MARKERS = SHAPE__MARKERS;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_SHAPE__ICON = SHAPE__ICON;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_SHAPE__URIS = SHAPE__URIS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_SHAPE__NAME = SHAPE__NAME;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_SHAPE__ATTRIBUTES = SHAPE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Semantic Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_SHAPE__SEMANTIC_ELEMENTS = SHAPE__SEMANTIC_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_SHAPE__CHILDREN = SHAPE__CHILDREN;

	/**
	 * The feature id for the '<em><b>Incoming Connections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_SHAPE__INCOMING_CONNECTIONS = SHAPE__INCOMING_CONNECTIONS;

	/**
	 * The feature id for the '<em><b>Outgoing Connections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_SHAPE__OUTGOING_CONNECTIONS = SHAPE__OUTGOING_CONNECTIONS;

	/**
	 * The feature id for the '<em><b>Bounds</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_SHAPE__BOUNDS = SHAPE__BOUNDS;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_SHAPE__PORTS = SHAPE__PORTS;

	/**
	 * The feature id for the '<em><b>Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_SHAPE__ORDER = SHAPE__ORDER;

	/**
	 * The feature id for the '<em><b>Rotation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_SHAPE__ROTATION = SHAPE__ROTATION;

	/**
	 * The feature id for the '<em><b>Flip Horizontal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_SHAPE__FLIP_HORIZONTAL = SHAPE__FLIP_HORIZONTAL;

	/**
	 * The feature id for the '<em><b>Flip Vertical</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_SHAPE__FLIP_VERTICAL = SHAPE__FLIP_VERTICAL;

	/**
	 * The feature id for the '<em><b>Rows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_SHAPE__ROWS = SHAPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Table Shape</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_SHAPE_FEATURE_COUNT = SHAPE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_SHAPE___COLLECT__OBJECT_EREFERENCE_ELIST = SHAPE___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_SHAPE___GET_REFERRERS__EREFERENCE = SHAPE___GET_REFERRERS__EREFERENCE;

	/**
	 * The number of operations of the '<em>Table Shape</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_SHAPE_OPERATION_COUNT = SHAPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.presentation.impl.RowImpl <em>Row</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.presentation.impl.RowImpl
	 * @see org.nasdanika.sdk.runtime.models.presentation.impl.PresentationPackageImpl#getRow()
	 * @generated
	 */
	int ROW = 12;

	/**
	 * The feature id for the '<em><b>Cells</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW__CELLS = 0;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW__HEIGHT = 1;

	/**
	 * The number of structural features of the '<em>Row</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Row</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.presentation.impl.CellImpl <em>Cell</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.presentation.impl.CellImpl
	 * @see org.nasdanika.sdk.runtime.models.presentation.impl.PresentationPackageImpl#getCell()
	 * @generated
	 */
	int CELL = 13;

	/**
	 * The feature id for the '<em><b>Paragraphs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELL__PARAGRAPHS = 0;

	/**
	 * The feature id for the '<em><b>Column Span</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELL__COLUMN_SPAN = 1;

	/**
	 * The feature id for the '<em><b>Row Span</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELL__ROW_SPAN = 2;

	/**
	 * The number of structural features of the '<em>Cell</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELL_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Cell</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.presentation.impl.ConnectorShapeImpl <em>Connector Shape</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.presentation.impl.ConnectorShapeImpl
	 * @see org.nasdanika.sdk.runtime.models.presentation.impl.PresentationPackageImpl#getConnectorShape()
	 * @generated
	 */
	int CONNECTOR_SHAPE = 14;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_SHAPE__ID = DiagramPackage.CONNECTION__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_SHAPE__DOCUMENTATION = DiagramPackage.CONNECTION__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_SHAPE__DOC_REF = DiagramPackage.CONNECTION__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_SHAPE__DOC_FORMAT = DiagramPackage.CONNECTION__DOC_FORMAT;

	/**
	 * The feature id for the '<em><b>Doc Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_SHAPE__DOC_CONTENTS = DiagramPackage.CONNECTION__DOC_CONTENTS;

	/**
	 * The feature id for the '<em><b>Doc Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_SHAPE__DOC_SECTIONS = DiagramPackage.CONNECTION__DOC_SECTIONS;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_SHAPE__MARKERS = DiagramPackage.CONNECTION__MARKERS;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_SHAPE__ICON = DiagramPackage.CONNECTION__ICON;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_SHAPE__URIS = DiagramPackage.CONNECTION__URIS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_SHAPE__NAME = DiagramPackage.CONNECTION__NAME;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_SHAPE__ATTRIBUTES = DiagramPackage.CONNECTION__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Semantic Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_SHAPE__SEMANTIC_ELEMENTS = DiagramPackage.CONNECTION__SEMANTIC_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_SHAPE__CHILDREN = DiagramPackage.CONNECTION__CHILDREN;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_SHAPE__SOURCE = DiagramPackage.CONNECTION__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_SHAPE__TARGET = DiagramPackage.CONNECTION__TARGET;

	/**
	 * The feature id for the '<em><b>Waypoints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_SHAPE__WAYPOINTS = DiagramPackage.CONNECTION__WAYPOINTS;

	/**
	 * The number of structural features of the '<em>Connector Shape</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_SHAPE_FEATURE_COUNT = DiagramPackage.CONNECTION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_SHAPE___COLLECT__OBJECT_EREFERENCE_ELIST = DiagramPackage.CONNECTION___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_SHAPE___GET_REFERRERS__EREFERENCE = DiagramPackage.CONNECTION___GET_REFERRERS__EREFERENCE;

	/**
	 * The number of operations of the '<em>Connector Shape</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_SHAPE_OPERATION_COUNT = DiagramPackage.CONNECTION_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.presentation.Presentation <em>Presentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Presentation</em>'.
	 * @see org.nasdanika.sdk.runtime.models.presentation.Presentation
	 * @generated
	 */
	EClass getPresentation();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.presentation.Presentation#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see org.nasdanika.sdk.runtime.models.presentation.Presentation#getWidth()
	 * @see #getPresentation()
	 * @generated
	 */
	EAttribute getPresentation_Width();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.presentation.Presentation#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see org.nasdanika.sdk.runtime.models.presentation.Presentation#getHeight()
	 * @see #getPresentation()
	 * @generated
	 */
	EAttribute getPresentation_Height();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.sdk.runtime.models.presentation.Presentation#getSlides <em>Slides</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Slides</em>'.
	 * @see org.nasdanika.sdk.runtime.models.presentation.Presentation#getSlides()
	 * @see #getPresentation()
	 * @generated
	 */
	EReference getPresentation_Slides();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.sdk.runtime.models.presentation.Presentation#getMasterSlides <em>Master Slides</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Master Slides</em>'.
	 * @see org.nasdanika.sdk.runtime.models.presentation.Presentation#getMasterSlides()
	 * @see #getPresentation()
	 * @generated
	 */
	EReference getPresentation_MasterSlides();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.presentation.Slide <em>Slide</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Slide</em>'.
	 * @see org.nasdanika.sdk.runtime.models.presentation.Slide
	 * @generated
	 */
	EClass getSlide();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.sdk.runtime.models.presentation.Slide#getMaster <em>Master</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Master</em>'.
	 * @see org.nasdanika.sdk.runtime.models.presentation.Slide#getMaster()
	 * @see #getSlide()
	 * @generated
	 */
	EReference getSlide_Master();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.presentation.Slide#isHidden <em>Hidden</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hidden</em>'.
	 * @see org.nasdanika.sdk.runtime.models.presentation.Slide#isHidden()
	 * @see #getSlide()
	 * @generated
	 */
	EAttribute getSlide_Hidden();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.sdk.runtime.models.presentation.Slide#getNotes <em>Notes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Notes</em>'.
	 * @see org.nasdanika.sdk.runtime.models.presentation.Slide#getNotes()
	 * @see #getSlide()
	 * @generated
	 */
	EReference getSlide_Notes();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.presentation.MasterSlide <em>Master Slide</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Master Slide</em>'.
	 * @see org.nasdanika.sdk.runtime.models.presentation.MasterSlide
	 * @generated
	 */
	EClass getMasterSlide();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.presentation.Notes <em>Notes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Notes</em>'.
	 * @see org.nasdanika.sdk.runtime.models.presentation.Notes
	 * @generated
	 */
	EClass getNotes();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.presentation.Notes#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see org.nasdanika.sdk.runtime.models.presentation.Notes#getText()
	 * @see #getNotes()
	 * @generated
	 */
	EAttribute getNotes_Text();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.presentation.Shape <em>Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Shape</em>'.
	 * @see org.nasdanika.sdk.runtime.models.presentation.Shape
	 * @generated
	 */
	EClass getShape();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.presentation.Shape#getOrder <em>Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Order</em>'.
	 * @see org.nasdanika.sdk.runtime.models.presentation.Shape#getOrder()
	 * @see #getShape()
	 * @generated
	 */
	EAttribute getShape_Order();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.presentation.Shape#getRotation <em>Rotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rotation</em>'.
	 * @see org.nasdanika.sdk.runtime.models.presentation.Shape#getRotation()
	 * @see #getShape()
	 * @generated
	 */
	EAttribute getShape_Rotation();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.presentation.Shape#isFlipHorizontal <em>Flip Horizontal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Flip Horizontal</em>'.
	 * @see org.nasdanika.sdk.runtime.models.presentation.Shape#isFlipHorizontal()
	 * @see #getShape()
	 * @generated
	 */
	EAttribute getShape_FlipHorizontal();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.presentation.Shape#isFlipVertical <em>Flip Vertical</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Flip Vertical</em>'.
	 * @see org.nasdanika.sdk.runtime.models.presentation.Shape#isFlipVertical()
	 * @see #getShape()
	 * @generated
	 */
	EAttribute getShape_FlipVertical();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.presentation.GroupShape <em>Group Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Group Shape</em>'.
	 * @see org.nasdanika.sdk.runtime.models.presentation.GroupShape
	 * @generated
	 */
	EClass getGroupShape();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.presentation.TextShape <em>Text Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text Shape</em>'.
	 * @see org.nasdanika.sdk.runtime.models.presentation.TextShape
	 * @generated
	 */
	EClass getTextShape();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.sdk.runtime.models.presentation.TextShape#getParagraphs <em>Paragraphs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Paragraphs</em>'.
	 * @see org.nasdanika.sdk.runtime.models.presentation.TextShape#getParagraphs()
	 * @see #getTextShape()
	 * @generated
	 */
	EReference getTextShape_Paragraphs();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.presentation.Paragraph <em>Paragraph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Paragraph</em>'.
	 * @see org.nasdanika.sdk.runtime.models.presentation.Paragraph
	 * @generated
	 */
	EClass getParagraph();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.sdk.runtime.models.presentation.Paragraph#getRuns <em>Runs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Runs</em>'.
	 * @see org.nasdanika.sdk.runtime.models.presentation.Paragraph#getRuns()
	 * @see #getParagraph()
	 * @generated
	 */
	EReference getParagraph_Runs();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.presentation.Paragraph#getIndentLevel <em>Indent Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Indent Level</em>'.
	 * @see org.nasdanika.sdk.runtime.models.presentation.Paragraph#getIndentLevel()
	 * @see #getParagraph()
	 * @generated
	 */
	EAttribute getParagraph_IndentLevel();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.presentation.Paragraph#getAlignment <em>Alignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alignment</em>'.
	 * @see org.nasdanika.sdk.runtime.models.presentation.Paragraph#getAlignment()
	 * @see #getParagraph()
	 * @generated
	 */
	EAttribute getParagraph_Alignment();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.presentation.TextRun <em>Text Run</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text Run</em>'.
	 * @see org.nasdanika.sdk.runtime.models.presentation.TextRun
	 * @generated
	 */
	EClass getTextRun();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.presentation.TextRun#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see org.nasdanika.sdk.runtime.models.presentation.TextRun#getText()
	 * @see #getTextRun()
	 * @generated
	 */
	EAttribute getTextRun_Text();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.presentation.TextRun#getFontFamily <em>Font Family</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Font Family</em>'.
	 * @see org.nasdanika.sdk.runtime.models.presentation.TextRun#getFontFamily()
	 * @see #getTextRun()
	 * @generated
	 */
	EAttribute getTextRun_FontFamily();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.presentation.TextRun#getFontSize <em>Font Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Font Size</em>'.
	 * @see org.nasdanika.sdk.runtime.models.presentation.TextRun#getFontSize()
	 * @see #getTextRun()
	 * @generated
	 */
	EAttribute getTextRun_FontSize();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.presentation.TextRun#isBold <em>Bold</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bold</em>'.
	 * @see org.nasdanika.sdk.runtime.models.presentation.TextRun#isBold()
	 * @see #getTextRun()
	 * @generated
	 */
	EAttribute getTextRun_Bold();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.presentation.TextRun#isItalic <em>Italic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Italic</em>'.
	 * @see org.nasdanika.sdk.runtime.models.presentation.TextRun#isItalic()
	 * @see #getTextRun()
	 * @generated
	 */
	EAttribute getTextRun_Italic();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.presentation.TextRun#isUnderline <em>Underline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Underline</em>'.
	 * @see org.nasdanika.sdk.runtime.models.presentation.TextRun#isUnderline()
	 * @see #getTextRun()
	 * @generated
	 */
	EAttribute getTextRun_Underline();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.presentation.TextRun#getColor <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color</em>'.
	 * @see org.nasdanika.sdk.runtime.models.presentation.TextRun#getColor()
	 * @see #getTextRun()
	 * @generated
	 */
	EAttribute getTextRun_Color();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.presentation.TextRun#getHyperlink <em>Hyperlink</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hyperlink</em>'.
	 * @see org.nasdanika.sdk.runtime.models.presentation.TextRun#getHyperlink()
	 * @see #getTextRun()
	 * @generated
	 */
	EAttribute getTextRun_Hyperlink();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.presentation.ImageShape <em>Image Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Image Shape</em>'.
	 * @see org.nasdanika.sdk.runtime.models.presentation.ImageShape
	 * @generated
	 */
	EClass getImageShape();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.presentation.ImageShape#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Location</em>'.
	 * @see org.nasdanika.sdk.runtime.models.presentation.ImageShape#getLocation()
	 * @see #getImageShape()
	 * @generated
	 */
	EAttribute getImageShape_Location();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.presentation.ImageShape#getContentType <em>Content Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content Type</em>'.
	 * @see org.nasdanika.sdk.runtime.models.presentation.ImageShape#getContentType()
	 * @see #getImageShape()
	 * @generated
	 */
	EAttribute getImageShape_ContentType();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.presentation.MediaShape <em>Media Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Media Shape</em>'.
	 * @see org.nasdanika.sdk.runtime.models.presentation.MediaShape
	 * @generated
	 */
	EClass getMediaShape();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.presentation.MediaShape#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Location</em>'.
	 * @see org.nasdanika.sdk.runtime.models.presentation.MediaShape#getLocation()
	 * @see #getMediaShape()
	 * @generated
	 */
	EAttribute getMediaShape_Location();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.presentation.MediaShape#getContentType <em>Content Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content Type</em>'.
	 * @see org.nasdanika.sdk.runtime.models.presentation.MediaShape#getContentType()
	 * @see #getMediaShape()
	 * @generated
	 */
	EAttribute getMediaShape_ContentType();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.presentation.TableShape <em>Table Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table Shape</em>'.
	 * @see org.nasdanika.sdk.runtime.models.presentation.TableShape
	 * @generated
	 */
	EClass getTableShape();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.sdk.runtime.models.presentation.TableShape#getRows <em>Rows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rows</em>'.
	 * @see org.nasdanika.sdk.runtime.models.presentation.TableShape#getRows()
	 * @see #getTableShape()
	 * @generated
	 */
	EReference getTableShape_Rows();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.presentation.Row <em>Row</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Row</em>'.
	 * @see org.nasdanika.sdk.runtime.models.presentation.Row
	 * @generated
	 */
	EClass getRow();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.sdk.runtime.models.presentation.Row#getCells <em>Cells</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cells</em>'.
	 * @see org.nasdanika.sdk.runtime.models.presentation.Row#getCells()
	 * @see #getRow()
	 * @generated
	 */
	EReference getRow_Cells();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.presentation.Row#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see org.nasdanika.sdk.runtime.models.presentation.Row#getHeight()
	 * @see #getRow()
	 * @generated
	 */
	EAttribute getRow_Height();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.presentation.Cell <em>Cell</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cell</em>'.
	 * @see org.nasdanika.sdk.runtime.models.presentation.Cell
	 * @generated
	 */
	EClass getCell();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.sdk.runtime.models.presentation.Cell#getParagraphs <em>Paragraphs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Paragraphs</em>'.
	 * @see org.nasdanika.sdk.runtime.models.presentation.Cell#getParagraphs()
	 * @see #getCell()
	 * @generated
	 */
	EReference getCell_Paragraphs();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.presentation.Cell#getColumnSpan <em>Column Span</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Column Span</em>'.
	 * @see org.nasdanika.sdk.runtime.models.presentation.Cell#getColumnSpan()
	 * @see #getCell()
	 * @generated
	 */
	EAttribute getCell_ColumnSpan();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.presentation.Cell#getRowSpan <em>Row Span</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Row Span</em>'.
	 * @see org.nasdanika.sdk.runtime.models.presentation.Cell#getRowSpan()
	 * @see #getCell()
	 * @generated
	 */
	EAttribute getCell_RowSpan();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.presentation.ConnectorShape <em>Connector Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connector Shape</em>'.
	 * @see org.nasdanika.sdk.runtime.models.presentation.ConnectorShape
	 * @generated
	 */
	EClass getConnectorShape();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PresentationFactory getPresentationFactory();

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
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.presentation.impl.PresentationImpl <em>Presentation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.presentation.impl.PresentationImpl
		 * @see org.nasdanika.sdk.runtime.models.presentation.impl.PresentationPackageImpl#getPresentation()
		 * @generated
		 */
		EClass PRESENTATION = eINSTANCE.getPresentation();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRESENTATION__WIDTH = eINSTANCE.getPresentation_Width();

		/**
		 * The meta object literal for the '<em><b>Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRESENTATION__HEIGHT = eINSTANCE.getPresentation_Height();

		/**
		 * The meta object literal for the '<em><b>Slides</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRESENTATION__SLIDES = eINSTANCE.getPresentation_Slides();

		/**
		 * The meta object literal for the '<em><b>Master Slides</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRESENTATION__MASTER_SLIDES = eINSTANCE.getPresentation_MasterSlides();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.presentation.impl.SlideImpl <em>Slide</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.presentation.impl.SlideImpl
		 * @see org.nasdanika.sdk.runtime.models.presentation.impl.PresentationPackageImpl#getSlide()
		 * @generated
		 */
		EClass SLIDE = eINSTANCE.getSlide();

		/**
		 * The meta object literal for the '<em><b>Master</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SLIDE__MASTER = eINSTANCE.getSlide_Master();

		/**
		 * The meta object literal for the '<em><b>Hidden</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SLIDE__HIDDEN = eINSTANCE.getSlide_Hidden();

		/**
		 * The meta object literal for the '<em><b>Notes</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SLIDE__NOTES = eINSTANCE.getSlide_Notes();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.presentation.impl.MasterSlideImpl <em>Master Slide</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.presentation.impl.MasterSlideImpl
		 * @see org.nasdanika.sdk.runtime.models.presentation.impl.PresentationPackageImpl#getMasterSlide()
		 * @generated
		 */
		EClass MASTER_SLIDE = eINSTANCE.getMasterSlide();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.presentation.impl.NotesImpl <em>Notes</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.presentation.impl.NotesImpl
		 * @see org.nasdanika.sdk.runtime.models.presentation.impl.PresentationPackageImpl#getNotes()
		 * @generated
		 */
		EClass NOTES = eINSTANCE.getNotes();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NOTES__TEXT = eINSTANCE.getNotes_Text();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.presentation.impl.ShapeImpl <em>Shape</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.presentation.impl.ShapeImpl
		 * @see org.nasdanika.sdk.runtime.models.presentation.impl.PresentationPackageImpl#getShape()
		 * @generated
		 */
		EClass SHAPE = eINSTANCE.getShape();

		/**
		 * The meta object literal for the '<em><b>Order</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHAPE__ORDER = eINSTANCE.getShape_Order();

		/**
		 * The meta object literal for the '<em><b>Rotation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHAPE__ROTATION = eINSTANCE.getShape_Rotation();

		/**
		 * The meta object literal for the '<em><b>Flip Horizontal</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHAPE__FLIP_HORIZONTAL = eINSTANCE.getShape_FlipHorizontal();

		/**
		 * The meta object literal for the '<em><b>Flip Vertical</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHAPE__FLIP_VERTICAL = eINSTANCE.getShape_FlipVertical();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.presentation.impl.GroupShapeImpl <em>Group Shape</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.presentation.impl.GroupShapeImpl
		 * @see org.nasdanika.sdk.runtime.models.presentation.impl.PresentationPackageImpl#getGroupShape()
		 * @generated
		 */
		EClass GROUP_SHAPE = eINSTANCE.getGroupShape();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.presentation.impl.TextShapeImpl <em>Text Shape</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.presentation.impl.TextShapeImpl
		 * @see org.nasdanika.sdk.runtime.models.presentation.impl.PresentationPackageImpl#getTextShape()
		 * @generated
		 */
		EClass TEXT_SHAPE = eINSTANCE.getTextShape();

		/**
		 * The meta object literal for the '<em><b>Paragraphs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEXT_SHAPE__PARAGRAPHS = eINSTANCE.getTextShape_Paragraphs();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.presentation.impl.ParagraphImpl <em>Paragraph</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.presentation.impl.ParagraphImpl
		 * @see org.nasdanika.sdk.runtime.models.presentation.impl.PresentationPackageImpl#getParagraph()
		 * @generated
		 */
		EClass PARAGRAPH = eINSTANCE.getParagraph();

		/**
		 * The meta object literal for the '<em><b>Runs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAGRAPH__RUNS = eINSTANCE.getParagraph_Runs();

		/**
		 * The meta object literal for the '<em><b>Indent Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAGRAPH__INDENT_LEVEL = eINSTANCE.getParagraph_IndentLevel();

		/**
		 * The meta object literal for the '<em><b>Alignment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAGRAPH__ALIGNMENT = eINSTANCE.getParagraph_Alignment();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.presentation.impl.TextRunImpl <em>Text Run</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.presentation.impl.TextRunImpl
		 * @see org.nasdanika.sdk.runtime.models.presentation.impl.PresentationPackageImpl#getTextRun()
		 * @generated
		 */
		EClass TEXT_RUN = eINSTANCE.getTextRun();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_RUN__TEXT = eINSTANCE.getTextRun_Text();

		/**
		 * The meta object literal for the '<em><b>Font Family</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_RUN__FONT_FAMILY = eINSTANCE.getTextRun_FontFamily();

		/**
		 * The meta object literal for the '<em><b>Font Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_RUN__FONT_SIZE = eINSTANCE.getTextRun_FontSize();

		/**
		 * The meta object literal for the '<em><b>Bold</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_RUN__BOLD = eINSTANCE.getTextRun_Bold();

		/**
		 * The meta object literal for the '<em><b>Italic</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_RUN__ITALIC = eINSTANCE.getTextRun_Italic();

		/**
		 * The meta object literal for the '<em><b>Underline</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_RUN__UNDERLINE = eINSTANCE.getTextRun_Underline();

		/**
		 * The meta object literal for the '<em><b>Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_RUN__COLOR = eINSTANCE.getTextRun_Color();

		/**
		 * The meta object literal for the '<em><b>Hyperlink</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_RUN__HYPERLINK = eINSTANCE.getTextRun_Hyperlink();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.presentation.impl.ImageShapeImpl <em>Image Shape</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.presentation.impl.ImageShapeImpl
		 * @see org.nasdanika.sdk.runtime.models.presentation.impl.PresentationPackageImpl#getImageShape()
		 * @generated
		 */
		EClass IMAGE_SHAPE = eINSTANCE.getImageShape();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMAGE_SHAPE__LOCATION = eINSTANCE.getImageShape_Location();

		/**
		 * The meta object literal for the '<em><b>Content Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMAGE_SHAPE__CONTENT_TYPE = eINSTANCE.getImageShape_ContentType();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.presentation.impl.MediaShapeImpl <em>Media Shape</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.presentation.impl.MediaShapeImpl
		 * @see org.nasdanika.sdk.runtime.models.presentation.impl.PresentationPackageImpl#getMediaShape()
		 * @generated
		 */
		EClass MEDIA_SHAPE = eINSTANCE.getMediaShape();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEDIA_SHAPE__LOCATION = eINSTANCE.getMediaShape_Location();

		/**
		 * The meta object literal for the '<em><b>Content Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEDIA_SHAPE__CONTENT_TYPE = eINSTANCE.getMediaShape_ContentType();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.presentation.impl.TableShapeImpl <em>Table Shape</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.presentation.impl.TableShapeImpl
		 * @see org.nasdanika.sdk.runtime.models.presentation.impl.PresentationPackageImpl#getTableShape()
		 * @generated
		 */
		EClass TABLE_SHAPE = eINSTANCE.getTableShape();

		/**
		 * The meta object literal for the '<em><b>Rows</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE_SHAPE__ROWS = eINSTANCE.getTableShape_Rows();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.presentation.impl.RowImpl <em>Row</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.presentation.impl.RowImpl
		 * @see org.nasdanika.sdk.runtime.models.presentation.impl.PresentationPackageImpl#getRow()
		 * @generated
		 */
		EClass ROW = eINSTANCE.getRow();

		/**
		 * The meta object literal for the '<em><b>Cells</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROW__CELLS = eINSTANCE.getRow_Cells();

		/**
		 * The meta object literal for the '<em><b>Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROW__HEIGHT = eINSTANCE.getRow_Height();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.presentation.impl.CellImpl <em>Cell</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.presentation.impl.CellImpl
		 * @see org.nasdanika.sdk.runtime.models.presentation.impl.PresentationPackageImpl#getCell()
		 * @generated
		 */
		EClass CELL = eINSTANCE.getCell();

		/**
		 * The meta object literal for the '<em><b>Paragraphs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CELL__PARAGRAPHS = eINSTANCE.getCell_Paragraphs();

		/**
		 * The meta object literal for the '<em><b>Column Span</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CELL__COLUMN_SPAN = eINSTANCE.getCell_ColumnSpan();

		/**
		 * The meta object literal for the '<em><b>Row Span</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CELL__ROW_SPAN = eINSTANCE.getCell_RowSpan();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.presentation.impl.ConnectorShapeImpl <em>Connector Shape</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.presentation.impl.ConnectorShapeImpl
		 * @see org.nasdanika.sdk.runtime.models.presentation.impl.PresentationPackageImpl#getConnectorShape()
		 * @generated
		 */
		EClass CONNECTOR_SHAPE = eINSTANCE.getConnectorShape();

	}

} //PresentationPackage
