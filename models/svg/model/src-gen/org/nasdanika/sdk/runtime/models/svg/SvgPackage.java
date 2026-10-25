/**
 */
package org.nasdanika.sdk.runtime.models.svg;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * <!-- begin-model-doc -->
 * A pragmatic subset of SVG as an EMF model: the twenty-odd elements and the presentation
 * attributes that generated diagrams need, and that Asciidoctor PDF's SVG renderer, prawn-svg,
 * draws, so one SVG works in HTML, PDF and EPUB.
 *  * The model is annotated with ExtendedMetaData, as models generated from XML schemas are, so EMF's
 * XML resource writes and reads SVG: element and attribute names are SVG's, and the namespace is
 * SVG's, which is why the namespace URI of this package is http://www.w3.org/2000/svg rather than
 * a runtime.sdk.nasdanika.org URI. Elements and attributes outside the subset are recorded on load,
 * not lost.
 *  * Containers hold their children in a feature map, content, keyed by the elements of DocumentRoot,
 * which is how one list holds rect, circle and g in document order. Text holds character data and
 * tspan elements in its mixed feature map. The add, children, addText, addSpan and text operations
 * add and read children and text without touching feature maps.
 * <!-- end-model-doc -->
 * @see org.nasdanika.sdk.runtime.models.svg.SvgFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel modelDirectory='/model/src-gen' featureDelegation='Dynamic' complianceLevel='25' suppressGenModelAnnotations='false' copyrightFields='false' operationReflection='true' importOrganizing='true' basePackage='org.nasdanika.sdk.runtime.models'"
 *        annotation="http://www.eclipse.org/emf/2011/Xcore Ecore='http://www.eclipse.org/emf/2002/Ecore' GenModel='http://www.eclipse.org/emf/2002/GenModel' Nasdanika='urn:org.nasdanika'"
 * @generated
 */
public interface SvgPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "svg";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.w3.org/2000/svg";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "svg";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SvgPackage eINSTANCE = org.nasdanika.sdk.runtime.models.svg.impl.SvgPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.svg.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.svg.impl.DocumentRootImpl
	 * @see org.nasdanika.sdk.runtime.models.svg.impl.SvgPackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 0;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MIXED = 0;

	/**
	 * The feature id for the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XMLNS_PREFIX_MAP = 1;

	/**
	 * The feature id for the '<em><b>XSI Schema Location</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = 2;

	/**
	 * The feature id for the '<em><b>Svg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SVG = 3;

	/**
	 * The feature id for the '<em><b>G</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__G = 4;

	/**
	 * The feature id for the '<em><b>Defs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DEFS = 5;

	/**
	 * The feature id for the '<em><b>A</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__A = 6;

	/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TITLE = 7;

	/**
	 * The feature id for the '<em><b>Desc</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DESC = 8;

	/**
	 * The feature id for the '<em><b>Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__STYLE = 9;

	/**
	 * The feature id for the '<em><b>Rect</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__RECT = 10;

	/**
	 * The feature id for the '<em><b>Circle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CIRCLE = 11;

	/**
	 * The feature id for the '<em><b>Ellipse</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ELLIPSE = 12;

	/**
	 * The feature id for the '<em><b>Line</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__LINE = 13;

	/**
	 * The feature id for the '<em><b>Polyline</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__POLYLINE = 14;

	/**
	 * The feature id for the '<em><b>Polygon</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__POLYGON = 15;

	/**
	 * The feature id for the '<em><b>Path</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PATH = 16;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TEXT = 17;

	/**
	 * The feature id for the '<em><b>Tspan</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TSPAN = 18;

	/**
	 * The feature id for the '<em><b>Image</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__IMAGE = 19;

	/**
	 * The feature id for the '<em><b>Use</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__USE = 20;

	/**
	 * The feature id for the '<em><b>Marker</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MARKER = 21;

	/**
	 * The feature id for the '<em><b>Clip Path</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CLIP_PATH = 22;

	/**
	 * The feature id for the '<em><b>Linear Gradient</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__LINEAR_GRADIENT = 23;

	/**
	 * The feature id for the '<em><b>Stop</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__STOP = 24;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 25;

	/**
	 * The number of operations of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.svg.impl.ElementImpl <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.svg.impl.ElementImpl
	 * @see org.nasdanika.sdk.runtime.models.svg.impl.SvgPackageImpl#getElement()
	 * @generated
	 */
	int ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__ID = 0;

	/**
	 * The feature id for the '<em><b>Style Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__STYLE_CLASS = 1;

	/**
	 * The feature id for the '<em><b>Style Attribute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__STYLE_ATTRIBUTE = 2;

	/**
	 * The feature id for the '<em><b>Transform</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__TRANSFORM = 3;

	/**
	 * The number of structural features of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.svg.Presentation <em>Presentation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.svg.Presentation
	 * @see org.nasdanika.sdk.runtime.models.svg.impl.SvgPackageImpl#getPresentation()
	 * @generated
	 */
	int PRESENTATION = 2;

	/**
	 * The feature id for the '<em><b>Fill</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESENTATION__FILL = 0;

	/**
	 * The feature id for the '<em><b>Fill Opacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESENTATION__FILL_OPACITY = 1;

	/**
	 * The feature id for the '<em><b>Stroke</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESENTATION__STROKE = 2;

	/**
	 * The feature id for the '<em><b>Stroke Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESENTATION__STROKE_WIDTH = 3;

	/**
	 * The feature id for the '<em><b>Stroke Opacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESENTATION__STROKE_OPACITY = 4;

	/**
	 * The feature id for the '<em><b>Stroke Dasharray</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESENTATION__STROKE_DASHARRAY = 5;

	/**
	 * The feature id for the '<em><b>Stroke Linecap</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESENTATION__STROKE_LINECAP = 6;

	/**
	 * The feature id for the '<em><b>Stroke Linejoin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESENTATION__STROKE_LINEJOIN = 7;

	/**
	 * The feature id for the '<em><b>Opacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESENTATION__OPACITY = 8;

	/**
	 * The feature id for the '<em><b>Font Family</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESENTATION__FONT_FAMILY = 9;

	/**
	 * The feature id for the '<em><b>Font Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESENTATION__FONT_SIZE = 10;

	/**
	 * The feature id for the '<em><b>Font Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESENTATION__FONT_WEIGHT = 11;

	/**
	 * The feature id for the '<em><b>Font Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESENTATION__FONT_STYLE = 12;

	/**
	 * The feature id for the '<em><b>Text Anchor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESENTATION__TEXT_ANCHOR = 13;

	/**
	 * The feature id for the '<em><b>Dominant Baseline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESENTATION__DOMINANT_BASELINE = 14;

	/**
	 * The feature id for the '<em><b>Marker Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESENTATION__MARKER_START = 15;

	/**
	 * The feature id for the '<em><b>Marker Mid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESENTATION__MARKER_MID = 16;

	/**
	 * The feature id for the '<em><b>Marker End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESENTATION__MARKER_END = 17;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESENTATION__VISIBILITY = 18;

	/**
	 * The feature id for the '<em><b>Clip Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESENTATION__CLIP_PATH = 19;

	/**
	 * The number of structural features of the '<em>Presentation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESENTATION_FEATURE_COUNT = 20;

	/**
	 * The number of operations of the '<em>Presentation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESENTATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.svg.impl.ContainerImpl <em>Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.svg.impl.ContainerImpl
	 * @see org.nasdanika.sdk.runtime.models.svg.impl.SvgPackageImpl#getContainer()
	 * @generated
	 */
	int CONTAINER = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__ID = ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Style Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__STYLE_CLASS = ELEMENT__STYLE_CLASS;

	/**
	 * The feature id for the '<em><b>Style Attribute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__STYLE_ATTRIBUTE = ELEMENT__STYLE_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Transform</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__TRANSFORM = ELEMENT__TRANSFORM;

	/**
	 * The feature id for the '<em><b>Fill</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__FILL = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Fill Opacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__FILL_OPACITY = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Stroke</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__STROKE = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Stroke Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__STROKE_WIDTH = ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Stroke Opacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__STROKE_OPACITY = ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Stroke Dasharray</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__STROKE_DASHARRAY = ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Stroke Linecap</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__STROKE_LINECAP = ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Stroke Linejoin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__STROKE_LINEJOIN = ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Opacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__OPACITY = ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Font Family</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__FONT_FAMILY = ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Font Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__FONT_SIZE = ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Font Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__FONT_WEIGHT = ELEMENT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Font Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__FONT_STYLE = ELEMENT_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Text Anchor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__TEXT_ANCHOR = ELEMENT_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Dominant Baseline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__DOMINANT_BASELINE = ELEMENT_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Marker Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__MARKER_START = ELEMENT_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Marker Mid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__MARKER_MID = ELEMENT_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Marker End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__MARKER_END = ELEMENT_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__VISIBILITY = ELEMENT_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Clip Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__CLIP_PATH = ELEMENT_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__CONTENT = ELEMENT_FEATURE_COUNT + 20;

	/**
	 * The number of structural features of the '<em>Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 21;

	/**
	 * The operation id for the '<em>Add</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER___ADD__ELEMENT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Children</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER___CHILDREN = ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.svg.impl.SvgImpl <em>Svg</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.svg.impl.SvgImpl
	 * @see org.nasdanika.sdk.runtime.models.svg.impl.SvgPackageImpl#getSvg()
	 * @generated
	 */
	int SVG = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SVG__ID = CONTAINER__ID;

	/**
	 * The feature id for the '<em><b>Style Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SVG__STYLE_CLASS = CONTAINER__STYLE_CLASS;

	/**
	 * The feature id for the '<em><b>Style Attribute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SVG__STYLE_ATTRIBUTE = CONTAINER__STYLE_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Transform</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SVG__TRANSFORM = CONTAINER__TRANSFORM;

	/**
	 * The feature id for the '<em><b>Fill</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SVG__FILL = CONTAINER__FILL;

	/**
	 * The feature id for the '<em><b>Fill Opacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SVG__FILL_OPACITY = CONTAINER__FILL_OPACITY;

	/**
	 * The feature id for the '<em><b>Stroke</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SVG__STROKE = CONTAINER__STROKE;

	/**
	 * The feature id for the '<em><b>Stroke Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SVG__STROKE_WIDTH = CONTAINER__STROKE_WIDTH;

	/**
	 * The feature id for the '<em><b>Stroke Opacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SVG__STROKE_OPACITY = CONTAINER__STROKE_OPACITY;

	/**
	 * The feature id for the '<em><b>Stroke Dasharray</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SVG__STROKE_DASHARRAY = CONTAINER__STROKE_DASHARRAY;

	/**
	 * The feature id for the '<em><b>Stroke Linecap</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SVG__STROKE_LINECAP = CONTAINER__STROKE_LINECAP;

	/**
	 * The feature id for the '<em><b>Stroke Linejoin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SVG__STROKE_LINEJOIN = CONTAINER__STROKE_LINEJOIN;

	/**
	 * The feature id for the '<em><b>Opacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SVG__OPACITY = CONTAINER__OPACITY;

	/**
	 * The feature id for the '<em><b>Font Family</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SVG__FONT_FAMILY = CONTAINER__FONT_FAMILY;

	/**
	 * The feature id for the '<em><b>Font Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SVG__FONT_SIZE = CONTAINER__FONT_SIZE;

	/**
	 * The feature id for the '<em><b>Font Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SVG__FONT_WEIGHT = CONTAINER__FONT_WEIGHT;

	/**
	 * The feature id for the '<em><b>Font Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SVG__FONT_STYLE = CONTAINER__FONT_STYLE;

	/**
	 * The feature id for the '<em><b>Text Anchor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SVG__TEXT_ANCHOR = CONTAINER__TEXT_ANCHOR;

	/**
	 * The feature id for the '<em><b>Dominant Baseline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SVG__DOMINANT_BASELINE = CONTAINER__DOMINANT_BASELINE;

	/**
	 * The feature id for the '<em><b>Marker Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SVG__MARKER_START = CONTAINER__MARKER_START;

	/**
	 * The feature id for the '<em><b>Marker Mid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SVG__MARKER_MID = CONTAINER__MARKER_MID;

	/**
	 * The feature id for the '<em><b>Marker End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SVG__MARKER_END = CONTAINER__MARKER_END;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SVG__VISIBILITY = CONTAINER__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Clip Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SVG__CLIP_PATH = CONTAINER__CLIP_PATH;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SVG__CONTENT = CONTAINER__CONTENT;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SVG__VERSION = CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SVG__X = CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SVG__Y = CONTAINER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SVG__WIDTH = CONTAINER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SVG__HEIGHT = CONTAINER_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>View Box</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SVG__VIEW_BOX = CONTAINER_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Preserve Aspect Ratio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SVG__PRESERVE_ASPECT_RATIO = CONTAINER_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Svg</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SVG_FEATURE_COUNT = CONTAINER_FEATURE_COUNT + 7;

	/**
	 * The operation id for the '<em>Add</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SVG___ADD__ELEMENT = CONTAINER___ADD__ELEMENT;

	/**
	 * The operation id for the '<em>Children</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SVG___CHILDREN = CONTAINER___CHILDREN;

	/**
	 * The number of operations of the '<em>Svg</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SVG_OPERATION_COUNT = CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.svg.impl.GImpl <em>G</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.svg.impl.GImpl
	 * @see org.nasdanika.sdk.runtime.models.svg.impl.SvgPackageImpl#getG()
	 * @generated
	 */
	int G = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int G__ID = CONTAINER__ID;

	/**
	 * The feature id for the '<em><b>Style Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int G__STYLE_CLASS = CONTAINER__STYLE_CLASS;

	/**
	 * The feature id for the '<em><b>Style Attribute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int G__STYLE_ATTRIBUTE = CONTAINER__STYLE_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Transform</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int G__TRANSFORM = CONTAINER__TRANSFORM;

	/**
	 * The feature id for the '<em><b>Fill</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int G__FILL = CONTAINER__FILL;

	/**
	 * The feature id for the '<em><b>Fill Opacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int G__FILL_OPACITY = CONTAINER__FILL_OPACITY;

	/**
	 * The feature id for the '<em><b>Stroke</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int G__STROKE = CONTAINER__STROKE;

	/**
	 * The feature id for the '<em><b>Stroke Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int G__STROKE_WIDTH = CONTAINER__STROKE_WIDTH;

	/**
	 * The feature id for the '<em><b>Stroke Opacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int G__STROKE_OPACITY = CONTAINER__STROKE_OPACITY;

	/**
	 * The feature id for the '<em><b>Stroke Dasharray</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int G__STROKE_DASHARRAY = CONTAINER__STROKE_DASHARRAY;

	/**
	 * The feature id for the '<em><b>Stroke Linecap</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int G__STROKE_LINECAP = CONTAINER__STROKE_LINECAP;

	/**
	 * The feature id for the '<em><b>Stroke Linejoin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int G__STROKE_LINEJOIN = CONTAINER__STROKE_LINEJOIN;

	/**
	 * The feature id for the '<em><b>Opacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int G__OPACITY = CONTAINER__OPACITY;

	/**
	 * The feature id for the '<em><b>Font Family</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int G__FONT_FAMILY = CONTAINER__FONT_FAMILY;

	/**
	 * The feature id for the '<em><b>Font Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int G__FONT_SIZE = CONTAINER__FONT_SIZE;

	/**
	 * The feature id for the '<em><b>Font Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int G__FONT_WEIGHT = CONTAINER__FONT_WEIGHT;

	/**
	 * The feature id for the '<em><b>Font Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int G__FONT_STYLE = CONTAINER__FONT_STYLE;

	/**
	 * The feature id for the '<em><b>Text Anchor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int G__TEXT_ANCHOR = CONTAINER__TEXT_ANCHOR;

	/**
	 * The feature id for the '<em><b>Dominant Baseline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int G__DOMINANT_BASELINE = CONTAINER__DOMINANT_BASELINE;

	/**
	 * The feature id for the '<em><b>Marker Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int G__MARKER_START = CONTAINER__MARKER_START;

	/**
	 * The feature id for the '<em><b>Marker Mid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int G__MARKER_MID = CONTAINER__MARKER_MID;

	/**
	 * The feature id for the '<em><b>Marker End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int G__MARKER_END = CONTAINER__MARKER_END;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int G__VISIBILITY = CONTAINER__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Clip Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int G__CLIP_PATH = CONTAINER__CLIP_PATH;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int G__CONTENT = CONTAINER__CONTENT;

	/**
	 * The number of structural features of the '<em>G</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int G_FEATURE_COUNT = CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Add</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int G___ADD__ELEMENT = CONTAINER___ADD__ELEMENT;

	/**
	 * The operation id for the '<em>Children</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int G___CHILDREN = CONTAINER___CHILDREN;

	/**
	 * The number of operations of the '<em>G</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int G_OPERATION_COUNT = CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.svg.impl.DefsImpl <em>Defs</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.svg.impl.DefsImpl
	 * @see org.nasdanika.sdk.runtime.models.svg.impl.SvgPackageImpl#getDefs()
	 * @generated
	 */
	int DEFS = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFS__ID = CONTAINER__ID;

	/**
	 * The feature id for the '<em><b>Style Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFS__STYLE_CLASS = CONTAINER__STYLE_CLASS;

	/**
	 * The feature id for the '<em><b>Style Attribute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFS__STYLE_ATTRIBUTE = CONTAINER__STYLE_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Transform</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFS__TRANSFORM = CONTAINER__TRANSFORM;

	/**
	 * The feature id for the '<em><b>Fill</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFS__FILL = CONTAINER__FILL;

	/**
	 * The feature id for the '<em><b>Fill Opacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFS__FILL_OPACITY = CONTAINER__FILL_OPACITY;

	/**
	 * The feature id for the '<em><b>Stroke</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFS__STROKE = CONTAINER__STROKE;

	/**
	 * The feature id for the '<em><b>Stroke Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFS__STROKE_WIDTH = CONTAINER__STROKE_WIDTH;

	/**
	 * The feature id for the '<em><b>Stroke Opacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFS__STROKE_OPACITY = CONTAINER__STROKE_OPACITY;

	/**
	 * The feature id for the '<em><b>Stroke Dasharray</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFS__STROKE_DASHARRAY = CONTAINER__STROKE_DASHARRAY;

	/**
	 * The feature id for the '<em><b>Stroke Linecap</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFS__STROKE_LINECAP = CONTAINER__STROKE_LINECAP;

	/**
	 * The feature id for the '<em><b>Stroke Linejoin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFS__STROKE_LINEJOIN = CONTAINER__STROKE_LINEJOIN;

	/**
	 * The feature id for the '<em><b>Opacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFS__OPACITY = CONTAINER__OPACITY;

	/**
	 * The feature id for the '<em><b>Font Family</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFS__FONT_FAMILY = CONTAINER__FONT_FAMILY;

	/**
	 * The feature id for the '<em><b>Font Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFS__FONT_SIZE = CONTAINER__FONT_SIZE;

	/**
	 * The feature id for the '<em><b>Font Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFS__FONT_WEIGHT = CONTAINER__FONT_WEIGHT;

	/**
	 * The feature id for the '<em><b>Font Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFS__FONT_STYLE = CONTAINER__FONT_STYLE;

	/**
	 * The feature id for the '<em><b>Text Anchor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFS__TEXT_ANCHOR = CONTAINER__TEXT_ANCHOR;

	/**
	 * The feature id for the '<em><b>Dominant Baseline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFS__DOMINANT_BASELINE = CONTAINER__DOMINANT_BASELINE;

	/**
	 * The feature id for the '<em><b>Marker Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFS__MARKER_START = CONTAINER__MARKER_START;

	/**
	 * The feature id for the '<em><b>Marker Mid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFS__MARKER_MID = CONTAINER__MARKER_MID;

	/**
	 * The feature id for the '<em><b>Marker End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFS__MARKER_END = CONTAINER__MARKER_END;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFS__VISIBILITY = CONTAINER__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Clip Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFS__CLIP_PATH = CONTAINER__CLIP_PATH;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFS__CONTENT = CONTAINER__CONTENT;

	/**
	 * The number of structural features of the '<em>Defs</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFS_FEATURE_COUNT = CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Add</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFS___ADD__ELEMENT = CONTAINER___ADD__ELEMENT;

	/**
	 * The operation id for the '<em>Children</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFS___CHILDREN = CONTAINER___CHILDREN;

	/**
	 * The number of operations of the '<em>Defs</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFS_OPERATION_COUNT = CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.svg.impl.AImpl <em>A</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.svg.impl.AImpl
	 * @see org.nasdanika.sdk.runtime.models.svg.impl.SvgPackageImpl#getA()
	 * @generated
	 */
	int A = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A__ID = CONTAINER__ID;

	/**
	 * The feature id for the '<em><b>Style Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A__STYLE_CLASS = CONTAINER__STYLE_CLASS;

	/**
	 * The feature id for the '<em><b>Style Attribute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A__STYLE_ATTRIBUTE = CONTAINER__STYLE_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Transform</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A__TRANSFORM = CONTAINER__TRANSFORM;

	/**
	 * The feature id for the '<em><b>Fill</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A__FILL = CONTAINER__FILL;

	/**
	 * The feature id for the '<em><b>Fill Opacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A__FILL_OPACITY = CONTAINER__FILL_OPACITY;

	/**
	 * The feature id for the '<em><b>Stroke</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A__STROKE = CONTAINER__STROKE;

	/**
	 * The feature id for the '<em><b>Stroke Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A__STROKE_WIDTH = CONTAINER__STROKE_WIDTH;

	/**
	 * The feature id for the '<em><b>Stroke Opacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A__STROKE_OPACITY = CONTAINER__STROKE_OPACITY;

	/**
	 * The feature id for the '<em><b>Stroke Dasharray</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A__STROKE_DASHARRAY = CONTAINER__STROKE_DASHARRAY;

	/**
	 * The feature id for the '<em><b>Stroke Linecap</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A__STROKE_LINECAP = CONTAINER__STROKE_LINECAP;

	/**
	 * The feature id for the '<em><b>Stroke Linejoin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A__STROKE_LINEJOIN = CONTAINER__STROKE_LINEJOIN;

	/**
	 * The feature id for the '<em><b>Opacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A__OPACITY = CONTAINER__OPACITY;

	/**
	 * The feature id for the '<em><b>Font Family</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A__FONT_FAMILY = CONTAINER__FONT_FAMILY;

	/**
	 * The feature id for the '<em><b>Font Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A__FONT_SIZE = CONTAINER__FONT_SIZE;

	/**
	 * The feature id for the '<em><b>Font Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A__FONT_WEIGHT = CONTAINER__FONT_WEIGHT;

	/**
	 * The feature id for the '<em><b>Font Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A__FONT_STYLE = CONTAINER__FONT_STYLE;

	/**
	 * The feature id for the '<em><b>Text Anchor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A__TEXT_ANCHOR = CONTAINER__TEXT_ANCHOR;

	/**
	 * The feature id for the '<em><b>Dominant Baseline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A__DOMINANT_BASELINE = CONTAINER__DOMINANT_BASELINE;

	/**
	 * The feature id for the '<em><b>Marker Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A__MARKER_START = CONTAINER__MARKER_START;

	/**
	 * The feature id for the '<em><b>Marker Mid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A__MARKER_MID = CONTAINER__MARKER_MID;

	/**
	 * The feature id for the '<em><b>Marker End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A__MARKER_END = CONTAINER__MARKER_END;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A__VISIBILITY = CONTAINER__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Clip Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A__CLIP_PATH = CONTAINER__CLIP_PATH;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A__CONTENT = CONTAINER__CONTENT;

	/**
	 * The feature id for the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A__HREF = CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A__TARGET = CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>A</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A_FEATURE_COUNT = CONTAINER_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Add</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A___ADD__ELEMENT = CONTAINER___ADD__ELEMENT;

	/**
	 * The operation id for the '<em>Children</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A___CHILDREN = CONTAINER___CHILDREN;

	/**
	 * The number of operations of the '<em>A</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A_OPERATION_COUNT = CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.svg.impl.MarkerImpl <em>Marker</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.svg.impl.MarkerImpl
	 * @see org.nasdanika.sdk.runtime.models.svg.impl.SvgPackageImpl#getMarker()
	 * @generated
	 */
	int MARKER = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKER__ID = CONTAINER__ID;

	/**
	 * The feature id for the '<em><b>Style Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKER__STYLE_CLASS = CONTAINER__STYLE_CLASS;

	/**
	 * The feature id for the '<em><b>Style Attribute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKER__STYLE_ATTRIBUTE = CONTAINER__STYLE_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Transform</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKER__TRANSFORM = CONTAINER__TRANSFORM;

	/**
	 * The feature id for the '<em><b>Fill</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKER__FILL = CONTAINER__FILL;

	/**
	 * The feature id for the '<em><b>Fill Opacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKER__FILL_OPACITY = CONTAINER__FILL_OPACITY;

	/**
	 * The feature id for the '<em><b>Stroke</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKER__STROKE = CONTAINER__STROKE;

	/**
	 * The feature id for the '<em><b>Stroke Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKER__STROKE_WIDTH = CONTAINER__STROKE_WIDTH;

	/**
	 * The feature id for the '<em><b>Stroke Opacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKER__STROKE_OPACITY = CONTAINER__STROKE_OPACITY;

	/**
	 * The feature id for the '<em><b>Stroke Dasharray</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKER__STROKE_DASHARRAY = CONTAINER__STROKE_DASHARRAY;

	/**
	 * The feature id for the '<em><b>Stroke Linecap</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKER__STROKE_LINECAP = CONTAINER__STROKE_LINECAP;

	/**
	 * The feature id for the '<em><b>Stroke Linejoin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKER__STROKE_LINEJOIN = CONTAINER__STROKE_LINEJOIN;

	/**
	 * The feature id for the '<em><b>Opacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKER__OPACITY = CONTAINER__OPACITY;

	/**
	 * The feature id for the '<em><b>Font Family</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKER__FONT_FAMILY = CONTAINER__FONT_FAMILY;

	/**
	 * The feature id for the '<em><b>Font Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKER__FONT_SIZE = CONTAINER__FONT_SIZE;

	/**
	 * The feature id for the '<em><b>Font Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKER__FONT_WEIGHT = CONTAINER__FONT_WEIGHT;

	/**
	 * The feature id for the '<em><b>Font Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKER__FONT_STYLE = CONTAINER__FONT_STYLE;

	/**
	 * The feature id for the '<em><b>Text Anchor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKER__TEXT_ANCHOR = CONTAINER__TEXT_ANCHOR;

	/**
	 * The feature id for the '<em><b>Dominant Baseline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKER__DOMINANT_BASELINE = CONTAINER__DOMINANT_BASELINE;

	/**
	 * The feature id for the '<em><b>Marker Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKER__MARKER_START = CONTAINER__MARKER_START;

	/**
	 * The feature id for the '<em><b>Marker Mid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKER__MARKER_MID = CONTAINER__MARKER_MID;

	/**
	 * The feature id for the '<em><b>Marker End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKER__MARKER_END = CONTAINER__MARKER_END;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKER__VISIBILITY = CONTAINER__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Clip Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKER__CLIP_PATH = CONTAINER__CLIP_PATH;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKER__CONTENT = CONTAINER__CONTENT;

	/**
	 * The feature id for the '<em><b>View Box</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKER__VIEW_BOX = CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ref X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKER__REF_X = CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Ref Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKER__REF_Y = CONTAINER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Marker Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKER__MARKER_WIDTH = CONTAINER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Marker Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKER__MARKER_HEIGHT = CONTAINER_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Orient</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKER__ORIENT = CONTAINER_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Marker Units</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKER__MARKER_UNITS = CONTAINER_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Marker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKER_FEATURE_COUNT = CONTAINER_FEATURE_COUNT + 7;

	/**
	 * The operation id for the '<em>Add</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKER___ADD__ELEMENT = CONTAINER___ADD__ELEMENT;

	/**
	 * The operation id for the '<em>Children</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKER___CHILDREN = CONTAINER___CHILDREN;

	/**
	 * The number of operations of the '<em>Marker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKER_OPERATION_COUNT = CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.svg.impl.ClipPathImpl <em>Clip Path</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.svg.impl.ClipPathImpl
	 * @see org.nasdanika.sdk.runtime.models.svg.impl.SvgPackageImpl#getClipPath()
	 * @generated
	 */
	int CLIP_PATH = 9;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIP_PATH__ID = CONTAINER__ID;

	/**
	 * The feature id for the '<em><b>Style Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIP_PATH__STYLE_CLASS = CONTAINER__STYLE_CLASS;

	/**
	 * The feature id for the '<em><b>Style Attribute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIP_PATH__STYLE_ATTRIBUTE = CONTAINER__STYLE_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Transform</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIP_PATH__TRANSFORM = CONTAINER__TRANSFORM;

	/**
	 * The feature id for the '<em><b>Fill</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIP_PATH__FILL = CONTAINER__FILL;

	/**
	 * The feature id for the '<em><b>Fill Opacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIP_PATH__FILL_OPACITY = CONTAINER__FILL_OPACITY;

	/**
	 * The feature id for the '<em><b>Stroke</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIP_PATH__STROKE = CONTAINER__STROKE;

	/**
	 * The feature id for the '<em><b>Stroke Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIP_PATH__STROKE_WIDTH = CONTAINER__STROKE_WIDTH;

	/**
	 * The feature id for the '<em><b>Stroke Opacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIP_PATH__STROKE_OPACITY = CONTAINER__STROKE_OPACITY;

	/**
	 * The feature id for the '<em><b>Stroke Dasharray</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIP_PATH__STROKE_DASHARRAY = CONTAINER__STROKE_DASHARRAY;

	/**
	 * The feature id for the '<em><b>Stroke Linecap</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIP_PATH__STROKE_LINECAP = CONTAINER__STROKE_LINECAP;

	/**
	 * The feature id for the '<em><b>Stroke Linejoin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIP_PATH__STROKE_LINEJOIN = CONTAINER__STROKE_LINEJOIN;

	/**
	 * The feature id for the '<em><b>Opacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIP_PATH__OPACITY = CONTAINER__OPACITY;

	/**
	 * The feature id for the '<em><b>Font Family</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIP_PATH__FONT_FAMILY = CONTAINER__FONT_FAMILY;

	/**
	 * The feature id for the '<em><b>Font Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIP_PATH__FONT_SIZE = CONTAINER__FONT_SIZE;

	/**
	 * The feature id for the '<em><b>Font Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIP_PATH__FONT_WEIGHT = CONTAINER__FONT_WEIGHT;

	/**
	 * The feature id for the '<em><b>Font Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIP_PATH__FONT_STYLE = CONTAINER__FONT_STYLE;

	/**
	 * The feature id for the '<em><b>Text Anchor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIP_PATH__TEXT_ANCHOR = CONTAINER__TEXT_ANCHOR;

	/**
	 * The feature id for the '<em><b>Dominant Baseline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIP_PATH__DOMINANT_BASELINE = CONTAINER__DOMINANT_BASELINE;

	/**
	 * The feature id for the '<em><b>Marker Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIP_PATH__MARKER_START = CONTAINER__MARKER_START;

	/**
	 * The feature id for the '<em><b>Marker Mid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIP_PATH__MARKER_MID = CONTAINER__MARKER_MID;

	/**
	 * The feature id for the '<em><b>Marker End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIP_PATH__MARKER_END = CONTAINER__MARKER_END;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIP_PATH__VISIBILITY = CONTAINER__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Clip Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIP_PATH__CLIP_PATH = CONTAINER__CLIP_PATH;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIP_PATH__CONTENT = CONTAINER__CONTENT;

	/**
	 * The feature id for the '<em><b>Clip Path Units</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIP_PATH__CLIP_PATH_UNITS = CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Clip Path</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIP_PATH_FEATURE_COUNT = CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Add</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIP_PATH___ADD__ELEMENT = CONTAINER___ADD__ELEMENT;

	/**
	 * The operation id for the '<em>Children</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIP_PATH___CHILDREN = CONTAINER___CHILDREN;

	/**
	 * The number of operations of the '<em>Clip Path</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIP_PATH_OPERATION_COUNT = CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.svg.impl.LinearGradientImpl <em>Linear Gradient</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.svg.impl.LinearGradientImpl
	 * @see org.nasdanika.sdk.runtime.models.svg.impl.SvgPackageImpl#getLinearGradient()
	 * @generated
	 */
	int LINEAR_GRADIENT = 10;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_GRADIENT__ID = CONTAINER__ID;

	/**
	 * The feature id for the '<em><b>Style Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_GRADIENT__STYLE_CLASS = CONTAINER__STYLE_CLASS;

	/**
	 * The feature id for the '<em><b>Style Attribute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_GRADIENT__STYLE_ATTRIBUTE = CONTAINER__STYLE_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Transform</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_GRADIENT__TRANSFORM = CONTAINER__TRANSFORM;

	/**
	 * The feature id for the '<em><b>Fill</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_GRADIENT__FILL = CONTAINER__FILL;

	/**
	 * The feature id for the '<em><b>Fill Opacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_GRADIENT__FILL_OPACITY = CONTAINER__FILL_OPACITY;

	/**
	 * The feature id for the '<em><b>Stroke</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_GRADIENT__STROKE = CONTAINER__STROKE;

	/**
	 * The feature id for the '<em><b>Stroke Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_GRADIENT__STROKE_WIDTH = CONTAINER__STROKE_WIDTH;

	/**
	 * The feature id for the '<em><b>Stroke Opacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_GRADIENT__STROKE_OPACITY = CONTAINER__STROKE_OPACITY;

	/**
	 * The feature id for the '<em><b>Stroke Dasharray</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_GRADIENT__STROKE_DASHARRAY = CONTAINER__STROKE_DASHARRAY;

	/**
	 * The feature id for the '<em><b>Stroke Linecap</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_GRADIENT__STROKE_LINECAP = CONTAINER__STROKE_LINECAP;

	/**
	 * The feature id for the '<em><b>Stroke Linejoin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_GRADIENT__STROKE_LINEJOIN = CONTAINER__STROKE_LINEJOIN;

	/**
	 * The feature id for the '<em><b>Opacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_GRADIENT__OPACITY = CONTAINER__OPACITY;

	/**
	 * The feature id for the '<em><b>Font Family</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_GRADIENT__FONT_FAMILY = CONTAINER__FONT_FAMILY;

	/**
	 * The feature id for the '<em><b>Font Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_GRADIENT__FONT_SIZE = CONTAINER__FONT_SIZE;

	/**
	 * The feature id for the '<em><b>Font Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_GRADIENT__FONT_WEIGHT = CONTAINER__FONT_WEIGHT;

	/**
	 * The feature id for the '<em><b>Font Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_GRADIENT__FONT_STYLE = CONTAINER__FONT_STYLE;

	/**
	 * The feature id for the '<em><b>Text Anchor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_GRADIENT__TEXT_ANCHOR = CONTAINER__TEXT_ANCHOR;

	/**
	 * The feature id for the '<em><b>Dominant Baseline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_GRADIENT__DOMINANT_BASELINE = CONTAINER__DOMINANT_BASELINE;

	/**
	 * The feature id for the '<em><b>Marker Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_GRADIENT__MARKER_START = CONTAINER__MARKER_START;

	/**
	 * The feature id for the '<em><b>Marker Mid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_GRADIENT__MARKER_MID = CONTAINER__MARKER_MID;

	/**
	 * The feature id for the '<em><b>Marker End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_GRADIENT__MARKER_END = CONTAINER__MARKER_END;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_GRADIENT__VISIBILITY = CONTAINER__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Clip Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_GRADIENT__CLIP_PATH = CONTAINER__CLIP_PATH;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_GRADIENT__CONTENT = CONTAINER__CONTENT;

	/**
	 * The feature id for the '<em><b>X1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_GRADIENT__X1 = CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Y1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_GRADIENT__Y1 = CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>X2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_GRADIENT__X2 = CONTAINER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Y2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_GRADIENT__Y2 = CONTAINER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Gradient Units</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_GRADIENT__GRADIENT_UNITS = CONTAINER_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Linear Gradient</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_GRADIENT_FEATURE_COUNT = CONTAINER_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Add</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_GRADIENT___ADD__ELEMENT = CONTAINER___ADD__ELEMENT;

	/**
	 * The operation id for the '<em>Children</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_GRADIENT___CHILDREN = CONTAINER___CHILDREN;

	/**
	 * The number of operations of the '<em>Linear Gradient</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_GRADIENT_OPERATION_COUNT = CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.svg.impl.StopImpl <em>Stop</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.svg.impl.StopImpl
	 * @see org.nasdanika.sdk.runtime.models.svg.impl.SvgPackageImpl#getStop()
	 * @generated
	 */
	int STOP = 11;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP__ID = ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Style Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP__STYLE_CLASS = ELEMENT__STYLE_CLASS;

	/**
	 * The feature id for the '<em><b>Style Attribute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP__STYLE_ATTRIBUTE = ELEMENT__STYLE_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Transform</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP__TRANSFORM = ELEMENT__TRANSFORM;

	/**
	 * The feature id for the '<em><b>Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP__OFFSET = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Stop Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP__STOP_COLOR = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Stop Opacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP__STOP_OPACITY = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Stop</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Stop</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.svg.impl.TitleImpl <em>Title</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.svg.impl.TitleImpl
	 * @see org.nasdanika.sdk.runtime.models.svg.impl.SvgPackageImpl#getTitle()
	 * @generated
	 */
	int TITLE = 12;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLE__ID = ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Style Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLE__STYLE_CLASS = ELEMENT__STYLE_CLASS;

	/**
	 * The feature id for the '<em><b>Style Attribute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLE__STYLE_ATTRIBUTE = ELEMENT__STYLE_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Transform</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLE__TRANSFORM = ELEMENT__TRANSFORM;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLE__VALUE = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Title</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLE_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Title</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLE_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.svg.impl.DescImpl <em>Desc</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.svg.impl.DescImpl
	 * @see org.nasdanika.sdk.runtime.models.svg.impl.SvgPackageImpl#getDesc()
	 * @generated
	 */
	int DESC = 13;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESC__ID = ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Style Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESC__STYLE_CLASS = ELEMENT__STYLE_CLASS;

	/**
	 * The feature id for the '<em><b>Style Attribute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESC__STYLE_ATTRIBUTE = ELEMENT__STYLE_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Transform</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESC__TRANSFORM = ELEMENT__TRANSFORM;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESC__VALUE = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Desc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESC_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Desc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESC_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.svg.impl.StyleImpl <em>Style</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.svg.impl.StyleImpl
	 * @see org.nasdanika.sdk.runtime.models.svg.impl.SvgPackageImpl#getStyle()
	 * @generated
	 */
	int STYLE = 14;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE__ID = ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Style Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE__STYLE_CLASS = ELEMENT__STYLE_CLASS;

	/**
	 * The feature id for the '<em><b>Style Attribute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE__STYLE_ATTRIBUTE = ELEMENT__STYLE_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Transform</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE__TRANSFORM = ELEMENT__TRANSFORM;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE__VALUE = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE__TYPE = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.svg.impl.ShapeImpl <em>Shape</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.svg.impl.ShapeImpl
	 * @see org.nasdanika.sdk.runtime.models.svg.impl.SvgPackageImpl#getShape()
	 * @generated
	 */
	int SHAPE = 15;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE__ID = CONTAINER__ID;

	/**
	 * The feature id for the '<em><b>Style Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE__STYLE_CLASS = CONTAINER__STYLE_CLASS;

	/**
	 * The feature id for the '<em><b>Style Attribute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE__STYLE_ATTRIBUTE = CONTAINER__STYLE_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Transform</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE__TRANSFORM = CONTAINER__TRANSFORM;

	/**
	 * The feature id for the '<em><b>Fill</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE__FILL = CONTAINER__FILL;

	/**
	 * The feature id for the '<em><b>Fill Opacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE__FILL_OPACITY = CONTAINER__FILL_OPACITY;

	/**
	 * The feature id for the '<em><b>Stroke</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE__STROKE = CONTAINER__STROKE;

	/**
	 * The feature id for the '<em><b>Stroke Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE__STROKE_WIDTH = CONTAINER__STROKE_WIDTH;

	/**
	 * The feature id for the '<em><b>Stroke Opacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE__STROKE_OPACITY = CONTAINER__STROKE_OPACITY;

	/**
	 * The feature id for the '<em><b>Stroke Dasharray</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE__STROKE_DASHARRAY = CONTAINER__STROKE_DASHARRAY;

	/**
	 * The feature id for the '<em><b>Stroke Linecap</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE__STROKE_LINECAP = CONTAINER__STROKE_LINECAP;

	/**
	 * The feature id for the '<em><b>Stroke Linejoin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE__STROKE_LINEJOIN = CONTAINER__STROKE_LINEJOIN;

	/**
	 * The feature id for the '<em><b>Opacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE__OPACITY = CONTAINER__OPACITY;

	/**
	 * The feature id for the '<em><b>Font Family</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE__FONT_FAMILY = CONTAINER__FONT_FAMILY;

	/**
	 * The feature id for the '<em><b>Font Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE__FONT_SIZE = CONTAINER__FONT_SIZE;

	/**
	 * The feature id for the '<em><b>Font Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE__FONT_WEIGHT = CONTAINER__FONT_WEIGHT;

	/**
	 * The feature id for the '<em><b>Font Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE__FONT_STYLE = CONTAINER__FONT_STYLE;

	/**
	 * The feature id for the '<em><b>Text Anchor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE__TEXT_ANCHOR = CONTAINER__TEXT_ANCHOR;

	/**
	 * The feature id for the '<em><b>Dominant Baseline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE__DOMINANT_BASELINE = CONTAINER__DOMINANT_BASELINE;

	/**
	 * The feature id for the '<em><b>Marker Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE__MARKER_START = CONTAINER__MARKER_START;

	/**
	 * The feature id for the '<em><b>Marker Mid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE__MARKER_MID = CONTAINER__MARKER_MID;

	/**
	 * The feature id for the '<em><b>Marker End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE__MARKER_END = CONTAINER__MARKER_END;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE__VISIBILITY = CONTAINER__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Clip Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE__CLIP_PATH = CONTAINER__CLIP_PATH;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE__CONTENT = CONTAINER__CONTENT;

	/**
	 * The number of structural features of the '<em>Shape</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE_FEATURE_COUNT = CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Add</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE___ADD__ELEMENT = CONTAINER___ADD__ELEMENT;

	/**
	 * The operation id for the '<em>Children</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE___CHILDREN = CONTAINER___CHILDREN;

	/**
	 * The number of operations of the '<em>Shape</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE_OPERATION_COUNT = CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.svg.impl.RectImpl <em>Rect</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.svg.impl.RectImpl
	 * @see org.nasdanika.sdk.runtime.models.svg.impl.SvgPackageImpl#getRect()
	 * @generated
	 */
	int RECT = 16;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECT__ID = SHAPE__ID;

	/**
	 * The feature id for the '<em><b>Style Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECT__STYLE_CLASS = SHAPE__STYLE_CLASS;

	/**
	 * The feature id for the '<em><b>Style Attribute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECT__STYLE_ATTRIBUTE = SHAPE__STYLE_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Transform</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECT__TRANSFORM = SHAPE__TRANSFORM;

	/**
	 * The feature id for the '<em><b>Fill</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECT__FILL = SHAPE__FILL;

	/**
	 * The feature id for the '<em><b>Fill Opacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECT__FILL_OPACITY = SHAPE__FILL_OPACITY;

	/**
	 * The feature id for the '<em><b>Stroke</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECT__STROKE = SHAPE__STROKE;

	/**
	 * The feature id for the '<em><b>Stroke Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECT__STROKE_WIDTH = SHAPE__STROKE_WIDTH;

	/**
	 * The feature id for the '<em><b>Stroke Opacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECT__STROKE_OPACITY = SHAPE__STROKE_OPACITY;

	/**
	 * The feature id for the '<em><b>Stroke Dasharray</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECT__STROKE_DASHARRAY = SHAPE__STROKE_DASHARRAY;

	/**
	 * The feature id for the '<em><b>Stroke Linecap</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECT__STROKE_LINECAP = SHAPE__STROKE_LINECAP;

	/**
	 * The feature id for the '<em><b>Stroke Linejoin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECT__STROKE_LINEJOIN = SHAPE__STROKE_LINEJOIN;

	/**
	 * The feature id for the '<em><b>Opacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECT__OPACITY = SHAPE__OPACITY;

	/**
	 * The feature id for the '<em><b>Font Family</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECT__FONT_FAMILY = SHAPE__FONT_FAMILY;

	/**
	 * The feature id for the '<em><b>Font Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECT__FONT_SIZE = SHAPE__FONT_SIZE;

	/**
	 * The feature id for the '<em><b>Font Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECT__FONT_WEIGHT = SHAPE__FONT_WEIGHT;

	/**
	 * The feature id for the '<em><b>Font Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECT__FONT_STYLE = SHAPE__FONT_STYLE;

	/**
	 * The feature id for the '<em><b>Text Anchor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECT__TEXT_ANCHOR = SHAPE__TEXT_ANCHOR;

	/**
	 * The feature id for the '<em><b>Dominant Baseline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECT__DOMINANT_BASELINE = SHAPE__DOMINANT_BASELINE;

	/**
	 * The feature id for the '<em><b>Marker Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECT__MARKER_START = SHAPE__MARKER_START;

	/**
	 * The feature id for the '<em><b>Marker Mid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECT__MARKER_MID = SHAPE__MARKER_MID;

	/**
	 * The feature id for the '<em><b>Marker End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECT__MARKER_END = SHAPE__MARKER_END;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECT__VISIBILITY = SHAPE__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Clip Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECT__CLIP_PATH = SHAPE__CLIP_PATH;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECT__CONTENT = SHAPE__CONTENT;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECT__X = SHAPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECT__Y = SHAPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECT__WIDTH = SHAPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECT__HEIGHT = SHAPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Rx</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECT__RX = SHAPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Ry</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECT__RY = SHAPE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Rect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECT_FEATURE_COUNT = SHAPE_FEATURE_COUNT + 6;

	/**
	 * The operation id for the '<em>Add</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECT___ADD__ELEMENT = SHAPE___ADD__ELEMENT;

	/**
	 * The operation id for the '<em>Children</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECT___CHILDREN = SHAPE___CHILDREN;

	/**
	 * The number of operations of the '<em>Rect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECT_OPERATION_COUNT = SHAPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.svg.impl.CircleImpl <em>Circle</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.svg.impl.CircleImpl
	 * @see org.nasdanika.sdk.runtime.models.svg.impl.SvgPackageImpl#getCircle()
	 * @generated
	 */
	int CIRCLE = 17;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE__ID = SHAPE__ID;

	/**
	 * The feature id for the '<em><b>Style Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE__STYLE_CLASS = SHAPE__STYLE_CLASS;

	/**
	 * The feature id for the '<em><b>Style Attribute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE__STYLE_ATTRIBUTE = SHAPE__STYLE_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Transform</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE__TRANSFORM = SHAPE__TRANSFORM;

	/**
	 * The feature id for the '<em><b>Fill</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE__FILL = SHAPE__FILL;

	/**
	 * The feature id for the '<em><b>Fill Opacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE__FILL_OPACITY = SHAPE__FILL_OPACITY;

	/**
	 * The feature id for the '<em><b>Stroke</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE__STROKE = SHAPE__STROKE;

	/**
	 * The feature id for the '<em><b>Stroke Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE__STROKE_WIDTH = SHAPE__STROKE_WIDTH;

	/**
	 * The feature id for the '<em><b>Stroke Opacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE__STROKE_OPACITY = SHAPE__STROKE_OPACITY;

	/**
	 * The feature id for the '<em><b>Stroke Dasharray</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE__STROKE_DASHARRAY = SHAPE__STROKE_DASHARRAY;

	/**
	 * The feature id for the '<em><b>Stroke Linecap</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE__STROKE_LINECAP = SHAPE__STROKE_LINECAP;

	/**
	 * The feature id for the '<em><b>Stroke Linejoin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE__STROKE_LINEJOIN = SHAPE__STROKE_LINEJOIN;

	/**
	 * The feature id for the '<em><b>Opacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE__OPACITY = SHAPE__OPACITY;

	/**
	 * The feature id for the '<em><b>Font Family</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE__FONT_FAMILY = SHAPE__FONT_FAMILY;

	/**
	 * The feature id for the '<em><b>Font Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE__FONT_SIZE = SHAPE__FONT_SIZE;

	/**
	 * The feature id for the '<em><b>Font Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE__FONT_WEIGHT = SHAPE__FONT_WEIGHT;

	/**
	 * The feature id for the '<em><b>Font Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE__FONT_STYLE = SHAPE__FONT_STYLE;

	/**
	 * The feature id for the '<em><b>Text Anchor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE__TEXT_ANCHOR = SHAPE__TEXT_ANCHOR;

	/**
	 * The feature id for the '<em><b>Dominant Baseline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE__DOMINANT_BASELINE = SHAPE__DOMINANT_BASELINE;

	/**
	 * The feature id for the '<em><b>Marker Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE__MARKER_START = SHAPE__MARKER_START;

	/**
	 * The feature id for the '<em><b>Marker Mid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE__MARKER_MID = SHAPE__MARKER_MID;

	/**
	 * The feature id for the '<em><b>Marker End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE__MARKER_END = SHAPE__MARKER_END;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE__VISIBILITY = SHAPE__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Clip Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE__CLIP_PATH = SHAPE__CLIP_PATH;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE__CONTENT = SHAPE__CONTENT;

	/**
	 * The feature id for the '<em><b>Cx</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE__CX = SHAPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Cy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE__CY = SHAPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>R</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE__R = SHAPE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Circle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE_FEATURE_COUNT = SHAPE_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Add</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE___ADD__ELEMENT = SHAPE___ADD__ELEMENT;

	/**
	 * The operation id for the '<em>Children</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE___CHILDREN = SHAPE___CHILDREN;

	/**
	 * The number of operations of the '<em>Circle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE_OPERATION_COUNT = SHAPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.svg.impl.EllipseImpl <em>Ellipse</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.svg.impl.EllipseImpl
	 * @see org.nasdanika.sdk.runtime.models.svg.impl.SvgPackageImpl#getEllipse()
	 * @generated
	 */
	int ELLIPSE = 18;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE__ID = SHAPE__ID;

	/**
	 * The feature id for the '<em><b>Style Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE__STYLE_CLASS = SHAPE__STYLE_CLASS;

	/**
	 * The feature id for the '<em><b>Style Attribute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE__STYLE_ATTRIBUTE = SHAPE__STYLE_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Transform</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE__TRANSFORM = SHAPE__TRANSFORM;

	/**
	 * The feature id for the '<em><b>Fill</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE__FILL = SHAPE__FILL;

	/**
	 * The feature id for the '<em><b>Fill Opacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE__FILL_OPACITY = SHAPE__FILL_OPACITY;

	/**
	 * The feature id for the '<em><b>Stroke</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE__STROKE = SHAPE__STROKE;

	/**
	 * The feature id for the '<em><b>Stroke Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE__STROKE_WIDTH = SHAPE__STROKE_WIDTH;

	/**
	 * The feature id for the '<em><b>Stroke Opacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE__STROKE_OPACITY = SHAPE__STROKE_OPACITY;

	/**
	 * The feature id for the '<em><b>Stroke Dasharray</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE__STROKE_DASHARRAY = SHAPE__STROKE_DASHARRAY;

	/**
	 * The feature id for the '<em><b>Stroke Linecap</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE__STROKE_LINECAP = SHAPE__STROKE_LINECAP;

	/**
	 * The feature id for the '<em><b>Stroke Linejoin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE__STROKE_LINEJOIN = SHAPE__STROKE_LINEJOIN;

	/**
	 * The feature id for the '<em><b>Opacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE__OPACITY = SHAPE__OPACITY;

	/**
	 * The feature id for the '<em><b>Font Family</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE__FONT_FAMILY = SHAPE__FONT_FAMILY;

	/**
	 * The feature id for the '<em><b>Font Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE__FONT_SIZE = SHAPE__FONT_SIZE;

	/**
	 * The feature id for the '<em><b>Font Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE__FONT_WEIGHT = SHAPE__FONT_WEIGHT;

	/**
	 * The feature id for the '<em><b>Font Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE__FONT_STYLE = SHAPE__FONT_STYLE;

	/**
	 * The feature id for the '<em><b>Text Anchor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE__TEXT_ANCHOR = SHAPE__TEXT_ANCHOR;

	/**
	 * The feature id for the '<em><b>Dominant Baseline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE__DOMINANT_BASELINE = SHAPE__DOMINANT_BASELINE;

	/**
	 * The feature id for the '<em><b>Marker Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE__MARKER_START = SHAPE__MARKER_START;

	/**
	 * The feature id for the '<em><b>Marker Mid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE__MARKER_MID = SHAPE__MARKER_MID;

	/**
	 * The feature id for the '<em><b>Marker End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE__MARKER_END = SHAPE__MARKER_END;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE__VISIBILITY = SHAPE__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Clip Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE__CLIP_PATH = SHAPE__CLIP_PATH;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE__CONTENT = SHAPE__CONTENT;

	/**
	 * The feature id for the '<em><b>Cx</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE__CX = SHAPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Cy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE__CY = SHAPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Rx</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE__RX = SHAPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Ry</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE__RY = SHAPE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Ellipse</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE_FEATURE_COUNT = SHAPE_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Add</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE___ADD__ELEMENT = SHAPE___ADD__ELEMENT;

	/**
	 * The operation id for the '<em>Children</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE___CHILDREN = SHAPE___CHILDREN;

	/**
	 * The number of operations of the '<em>Ellipse</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE_OPERATION_COUNT = SHAPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.svg.impl.LineImpl <em>Line</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.svg.impl.LineImpl
	 * @see org.nasdanika.sdk.runtime.models.svg.impl.SvgPackageImpl#getLine()
	 * @generated
	 */
	int LINE = 19;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE__ID = SHAPE__ID;

	/**
	 * The feature id for the '<em><b>Style Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE__STYLE_CLASS = SHAPE__STYLE_CLASS;

	/**
	 * The feature id for the '<em><b>Style Attribute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE__STYLE_ATTRIBUTE = SHAPE__STYLE_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Transform</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE__TRANSFORM = SHAPE__TRANSFORM;

	/**
	 * The feature id for the '<em><b>Fill</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE__FILL = SHAPE__FILL;

	/**
	 * The feature id for the '<em><b>Fill Opacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE__FILL_OPACITY = SHAPE__FILL_OPACITY;

	/**
	 * The feature id for the '<em><b>Stroke</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE__STROKE = SHAPE__STROKE;

	/**
	 * The feature id for the '<em><b>Stroke Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE__STROKE_WIDTH = SHAPE__STROKE_WIDTH;

	/**
	 * The feature id for the '<em><b>Stroke Opacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE__STROKE_OPACITY = SHAPE__STROKE_OPACITY;

	/**
	 * The feature id for the '<em><b>Stroke Dasharray</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE__STROKE_DASHARRAY = SHAPE__STROKE_DASHARRAY;

	/**
	 * The feature id for the '<em><b>Stroke Linecap</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE__STROKE_LINECAP = SHAPE__STROKE_LINECAP;

	/**
	 * The feature id for the '<em><b>Stroke Linejoin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE__STROKE_LINEJOIN = SHAPE__STROKE_LINEJOIN;

	/**
	 * The feature id for the '<em><b>Opacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE__OPACITY = SHAPE__OPACITY;

	/**
	 * The feature id for the '<em><b>Font Family</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE__FONT_FAMILY = SHAPE__FONT_FAMILY;

	/**
	 * The feature id for the '<em><b>Font Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE__FONT_SIZE = SHAPE__FONT_SIZE;

	/**
	 * The feature id for the '<em><b>Font Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE__FONT_WEIGHT = SHAPE__FONT_WEIGHT;

	/**
	 * The feature id for the '<em><b>Font Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE__FONT_STYLE = SHAPE__FONT_STYLE;

	/**
	 * The feature id for the '<em><b>Text Anchor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE__TEXT_ANCHOR = SHAPE__TEXT_ANCHOR;

	/**
	 * The feature id for the '<em><b>Dominant Baseline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE__DOMINANT_BASELINE = SHAPE__DOMINANT_BASELINE;

	/**
	 * The feature id for the '<em><b>Marker Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE__MARKER_START = SHAPE__MARKER_START;

	/**
	 * The feature id for the '<em><b>Marker Mid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE__MARKER_MID = SHAPE__MARKER_MID;

	/**
	 * The feature id for the '<em><b>Marker End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE__MARKER_END = SHAPE__MARKER_END;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE__VISIBILITY = SHAPE__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Clip Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE__CLIP_PATH = SHAPE__CLIP_PATH;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE__CONTENT = SHAPE__CONTENT;

	/**
	 * The feature id for the '<em><b>X1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE__X1 = SHAPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Y1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE__Y1 = SHAPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>X2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE__X2 = SHAPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Y2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE__Y2 = SHAPE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Line</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_FEATURE_COUNT = SHAPE_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Add</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE___ADD__ELEMENT = SHAPE___ADD__ELEMENT;

	/**
	 * The operation id for the '<em>Children</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE___CHILDREN = SHAPE___CHILDREN;

	/**
	 * The number of operations of the '<em>Line</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_OPERATION_COUNT = SHAPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.svg.impl.PolylineImpl <em>Polyline</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.svg.impl.PolylineImpl
	 * @see org.nasdanika.sdk.runtime.models.svg.impl.SvgPackageImpl#getPolyline()
	 * @generated
	 */
	int POLYLINE = 20;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE__ID = SHAPE__ID;

	/**
	 * The feature id for the '<em><b>Style Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE__STYLE_CLASS = SHAPE__STYLE_CLASS;

	/**
	 * The feature id for the '<em><b>Style Attribute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE__STYLE_ATTRIBUTE = SHAPE__STYLE_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Transform</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE__TRANSFORM = SHAPE__TRANSFORM;

	/**
	 * The feature id for the '<em><b>Fill</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE__FILL = SHAPE__FILL;

	/**
	 * The feature id for the '<em><b>Fill Opacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE__FILL_OPACITY = SHAPE__FILL_OPACITY;

	/**
	 * The feature id for the '<em><b>Stroke</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE__STROKE = SHAPE__STROKE;

	/**
	 * The feature id for the '<em><b>Stroke Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE__STROKE_WIDTH = SHAPE__STROKE_WIDTH;

	/**
	 * The feature id for the '<em><b>Stroke Opacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE__STROKE_OPACITY = SHAPE__STROKE_OPACITY;

	/**
	 * The feature id for the '<em><b>Stroke Dasharray</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE__STROKE_DASHARRAY = SHAPE__STROKE_DASHARRAY;

	/**
	 * The feature id for the '<em><b>Stroke Linecap</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE__STROKE_LINECAP = SHAPE__STROKE_LINECAP;

	/**
	 * The feature id for the '<em><b>Stroke Linejoin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE__STROKE_LINEJOIN = SHAPE__STROKE_LINEJOIN;

	/**
	 * The feature id for the '<em><b>Opacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE__OPACITY = SHAPE__OPACITY;

	/**
	 * The feature id for the '<em><b>Font Family</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE__FONT_FAMILY = SHAPE__FONT_FAMILY;

	/**
	 * The feature id for the '<em><b>Font Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE__FONT_SIZE = SHAPE__FONT_SIZE;

	/**
	 * The feature id for the '<em><b>Font Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE__FONT_WEIGHT = SHAPE__FONT_WEIGHT;

	/**
	 * The feature id for the '<em><b>Font Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE__FONT_STYLE = SHAPE__FONT_STYLE;

	/**
	 * The feature id for the '<em><b>Text Anchor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE__TEXT_ANCHOR = SHAPE__TEXT_ANCHOR;

	/**
	 * The feature id for the '<em><b>Dominant Baseline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE__DOMINANT_BASELINE = SHAPE__DOMINANT_BASELINE;

	/**
	 * The feature id for the '<em><b>Marker Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE__MARKER_START = SHAPE__MARKER_START;

	/**
	 * The feature id for the '<em><b>Marker Mid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE__MARKER_MID = SHAPE__MARKER_MID;

	/**
	 * The feature id for the '<em><b>Marker End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE__MARKER_END = SHAPE__MARKER_END;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE__VISIBILITY = SHAPE__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Clip Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE__CLIP_PATH = SHAPE__CLIP_PATH;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE__CONTENT = SHAPE__CONTENT;

	/**
	 * The feature id for the '<em><b>Points</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE__POINTS = SHAPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Polyline</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE_FEATURE_COUNT = SHAPE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Add</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE___ADD__ELEMENT = SHAPE___ADD__ELEMENT;

	/**
	 * The operation id for the '<em>Children</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE___CHILDREN = SHAPE___CHILDREN;

	/**
	 * The number of operations of the '<em>Polyline</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE_OPERATION_COUNT = SHAPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.svg.impl.PolygonImpl <em>Polygon</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.svg.impl.PolygonImpl
	 * @see org.nasdanika.sdk.runtime.models.svg.impl.SvgPackageImpl#getPolygon()
	 * @generated
	 */
	int POLYGON = 21;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON__ID = SHAPE__ID;

	/**
	 * The feature id for the '<em><b>Style Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON__STYLE_CLASS = SHAPE__STYLE_CLASS;

	/**
	 * The feature id for the '<em><b>Style Attribute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON__STYLE_ATTRIBUTE = SHAPE__STYLE_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Transform</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON__TRANSFORM = SHAPE__TRANSFORM;

	/**
	 * The feature id for the '<em><b>Fill</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON__FILL = SHAPE__FILL;

	/**
	 * The feature id for the '<em><b>Fill Opacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON__FILL_OPACITY = SHAPE__FILL_OPACITY;

	/**
	 * The feature id for the '<em><b>Stroke</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON__STROKE = SHAPE__STROKE;

	/**
	 * The feature id for the '<em><b>Stroke Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON__STROKE_WIDTH = SHAPE__STROKE_WIDTH;

	/**
	 * The feature id for the '<em><b>Stroke Opacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON__STROKE_OPACITY = SHAPE__STROKE_OPACITY;

	/**
	 * The feature id for the '<em><b>Stroke Dasharray</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON__STROKE_DASHARRAY = SHAPE__STROKE_DASHARRAY;

	/**
	 * The feature id for the '<em><b>Stroke Linecap</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON__STROKE_LINECAP = SHAPE__STROKE_LINECAP;

	/**
	 * The feature id for the '<em><b>Stroke Linejoin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON__STROKE_LINEJOIN = SHAPE__STROKE_LINEJOIN;

	/**
	 * The feature id for the '<em><b>Opacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON__OPACITY = SHAPE__OPACITY;

	/**
	 * The feature id for the '<em><b>Font Family</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON__FONT_FAMILY = SHAPE__FONT_FAMILY;

	/**
	 * The feature id for the '<em><b>Font Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON__FONT_SIZE = SHAPE__FONT_SIZE;

	/**
	 * The feature id for the '<em><b>Font Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON__FONT_WEIGHT = SHAPE__FONT_WEIGHT;

	/**
	 * The feature id for the '<em><b>Font Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON__FONT_STYLE = SHAPE__FONT_STYLE;

	/**
	 * The feature id for the '<em><b>Text Anchor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON__TEXT_ANCHOR = SHAPE__TEXT_ANCHOR;

	/**
	 * The feature id for the '<em><b>Dominant Baseline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON__DOMINANT_BASELINE = SHAPE__DOMINANT_BASELINE;

	/**
	 * The feature id for the '<em><b>Marker Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON__MARKER_START = SHAPE__MARKER_START;

	/**
	 * The feature id for the '<em><b>Marker Mid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON__MARKER_MID = SHAPE__MARKER_MID;

	/**
	 * The feature id for the '<em><b>Marker End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON__MARKER_END = SHAPE__MARKER_END;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON__VISIBILITY = SHAPE__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Clip Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON__CLIP_PATH = SHAPE__CLIP_PATH;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON__CONTENT = SHAPE__CONTENT;

	/**
	 * The feature id for the '<em><b>Points</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON__POINTS = SHAPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Polygon</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_FEATURE_COUNT = SHAPE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Add</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON___ADD__ELEMENT = SHAPE___ADD__ELEMENT;

	/**
	 * The operation id for the '<em>Children</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON___CHILDREN = SHAPE___CHILDREN;

	/**
	 * The number of operations of the '<em>Polygon</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_OPERATION_COUNT = SHAPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.svg.impl.PathImpl <em>Path</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.svg.impl.PathImpl
	 * @see org.nasdanika.sdk.runtime.models.svg.impl.SvgPackageImpl#getPath()
	 * @generated
	 */
	int PATH = 22;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH__ID = SHAPE__ID;

	/**
	 * The feature id for the '<em><b>Style Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH__STYLE_CLASS = SHAPE__STYLE_CLASS;

	/**
	 * The feature id for the '<em><b>Style Attribute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH__STYLE_ATTRIBUTE = SHAPE__STYLE_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Transform</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH__TRANSFORM = SHAPE__TRANSFORM;

	/**
	 * The feature id for the '<em><b>Fill</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH__FILL = SHAPE__FILL;

	/**
	 * The feature id for the '<em><b>Fill Opacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH__FILL_OPACITY = SHAPE__FILL_OPACITY;

	/**
	 * The feature id for the '<em><b>Stroke</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH__STROKE = SHAPE__STROKE;

	/**
	 * The feature id for the '<em><b>Stroke Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH__STROKE_WIDTH = SHAPE__STROKE_WIDTH;

	/**
	 * The feature id for the '<em><b>Stroke Opacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH__STROKE_OPACITY = SHAPE__STROKE_OPACITY;

	/**
	 * The feature id for the '<em><b>Stroke Dasharray</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH__STROKE_DASHARRAY = SHAPE__STROKE_DASHARRAY;

	/**
	 * The feature id for the '<em><b>Stroke Linecap</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH__STROKE_LINECAP = SHAPE__STROKE_LINECAP;

	/**
	 * The feature id for the '<em><b>Stroke Linejoin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH__STROKE_LINEJOIN = SHAPE__STROKE_LINEJOIN;

	/**
	 * The feature id for the '<em><b>Opacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH__OPACITY = SHAPE__OPACITY;

	/**
	 * The feature id for the '<em><b>Font Family</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH__FONT_FAMILY = SHAPE__FONT_FAMILY;

	/**
	 * The feature id for the '<em><b>Font Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH__FONT_SIZE = SHAPE__FONT_SIZE;

	/**
	 * The feature id for the '<em><b>Font Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH__FONT_WEIGHT = SHAPE__FONT_WEIGHT;

	/**
	 * The feature id for the '<em><b>Font Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH__FONT_STYLE = SHAPE__FONT_STYLE;

	/**
	 * The feature id for the '<em><b>Text Anchor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH__TEXT_ANCHOR = SHAPE__TEXT_ANCHOR;

	/**
	 * The feature id for the '<em><b>Dominant Baseline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH__DOMINANT_BASELINE = SHAPE__DOMINANT_BASELINE;

	/**
	 * The feature id for the '<em><b>Marker Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH__MARKER_START = SHAPE__MARKER_START;

	/**
	 * The feature id for the '<em><b>Marker Mid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH__MARKER_MID = SHAPE__MARKER_MID;

	/**
	 * The feature id for the '<em><b>Marker End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH__MARKER_END = SHAPE__MARKER_END;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH__VISIBILITY = SHAPE__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Clip Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH__CLIP_PATH = SHAPE__CLIP_PATH;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH__CONTENT = SHAPE__CONTENT;

	/**
	 * The feature id for the '<em><b>D</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH__D = SHAPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Path</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_FEATURE_COUNT = SHAPE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Add</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH___ADD__ELEMENT = SHAPE___ADD__ELEMENT;

	/**
	 * The operation id for the '<em>Children</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH___CHILDREN = SHAPE___CHILDREN;

	/**
	 * The number of operations of the '<em>Path</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_OPERATION_COUNT = SHAPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.svg.impl.ImageImpl <em>Image</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.svg.impl.ImageImpl
	 * @see org.nasdanika.sdk.runtime.models.svg.impl.SvgPackageImpl#getImage()
	 * @generated
	 */
	int IMAGE = 23;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__ID = SHAPE__ID;

	/**
	 * The feature id for the '<em><b>Style Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__STYLE_CLASS = SHAPE__STYLE_CLASS;

	/**
	 * The feature id for the '<em><b>Style Attribute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__STYLE_ATTRIBUTE = SHAPE__STYLE_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Transform</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__TRANSFORM = SHAPE__TRANSFORM;

	/**
	 * The feature id for the '<em><b>Fill</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__FILL = SHAPE__FILL;

	/**
	 * The feature id for the '<em><b>Fill Opacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__FILL_OPACITY = SHAPE__FILL_OPACITY;

	/**
	 * The feature id for the '<em><b>Stroke</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__STROKE = SHAPE__STROKE;

	/**
	 * The feature id for the '<em><b>Stroke Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__STROKE_WIDTH = SHAPE__STROKE_WIDTH;

	/**
	 * The feature id for the '<em><b>Stroke Opacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__STROKE_OPACITY = SHAPE__STROKE_OPACITY;

	/**
	 * The feature id for the '<em><b>Stroke Dasharray</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__STROKE_DASHARRAY = SHAPE__STROKE_DASHARRAY;

	/**
	 * The feature id for the '<em><b>Stroke Linecap</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__STROKE_LINECAP = SHAPE__STROKE_LINECAP;

	/**
	 * The feature id for the '<em><b>Stroke Linejoin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__STROKE_LINEJOIN = SHAPE__STROKE_LINEJOIN;

	/**
	 * The feature id for the '<em><b>Opacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__OPACITY = SHAPE__OPACITY;

	/**
	 * The feature id for the '<em><b>Font Family</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__FONT_FAMILY = SHAPE__FONT_FAMILY;

	/**
	 * The feature id for the '<em><b>Font Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__FONT_SIZE = SHAPE__FONT_SIZE;

	/**
	 * The feature id for the '<em><b>Font Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__FONT_WEIGHT = SHAPE__FONT_WEIGHT;

	/**
	 * The feature id for the '<em><b>Font Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__FONT_STYLE = SHAPE__FONT_STYLE;

	/**
	 * The feature id for the '<em><b>Text Anchor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__TEXT_ANCHOR = SHAPE__TEXT_ANCHOR;

	/**
	 * The feature id for the '<em><b>Dominant Baseline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__DOMINANT_BASELINE = SHAPE__DOMINANT_BASELINE;

	/**
	 * The feature id for the '<em><b>Marker Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__MARKER_START = SHAPE__MARKER_START;

	/**
	 * The feature id for the '<em><b>Marker Mid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__MARKER_MID = SHAPE__MARKER_MID;

	/**
	 * The feature id for the '<em><b>Marker End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__MARKER_END = SHAPE__MARKER_END;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__VISIBILITY = SHAPE__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Clip Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__CLIP_PATH = SHAPE__CLIP_PATH;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__CONTENT = SHAPE__CONTENT;

	/**
	 * The feature id for the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__HREF = SHAPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__X = SHAPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__Y = SHAPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__WIDTH = SHAPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__HEIGHT = SHAPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Preserve Aspect Ratio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__PRESERVE_ASPECT_RATIO = SHAPE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Image</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_FEATURE_COUNT = SHAPE_FEATURE_COUNT + 6;

	/**
	 * The operation id for the '<em>Add</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE___ADD__ELEMENT = SHAPE___ADD__ELEMENT;

	/**
	 * The operation id for the '<em>Children</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE___CHILDREN = SHAPE___CHILDREN;

	/**
	 * The number of operations of the '<em>Image</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_OPERATION_COUNT = SHAPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.svg.impl.UseImpl <em>Use</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.svg.impl.UseImpl
	 * @see org.nasdanika.sdk.runtime.models.svg.impl.SvgPackageImpl#getUse()
	 * @generated
	 */
	int USE = 24;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE__ID = SHAPE__ID;

	/**
	 * The feature id for the '<em><b>Style Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE__STYLE_CLASS = SHAPE__STYLE_CLASS;

	/**
	 * The feature id for the '<em><b>Style Attribute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE__STYLE_ATTRIBUTE = SHAPE__STYLE_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Transform</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE__TRANSFORM = SHAPE__TRANSFORM;

	/**
	 * The feature id for the '<em><b>Fill</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE__FILL = SHAPE__FILL;

	/**
	 * The feature id for the '<em><b>Fill Opacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE__FILL_OPACITY = SHAPE__FILL_OPACITY;

	/**
	 * The feature id for the '<em><b>Stroke</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE__STROKE = SHAPE__STROKE;

	/**
	 * The feature id for the '<em><b>Stroke Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE__STROKE_WIDTH = SHAPE__STROKE_WIDTH;

	/**
	 * The feature id for the '<em><b>Stroke Opacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE__STROKE_OPACITY = SHAPE__STROKE_OPACITY;

	/**
	 * The feature id for the '<em><b>Stroke Dasharray</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE__STROKE_DASHARRAY = SHAPE__STROKE_DASHARRAY;

	/**
	 * The feature id for the '<em><b>Stroke Linecap</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE__STROKE_LINECAP = SHAPE__STROKE_LINECAP;

	/**
	 * The feature id for the '<em><b>Stroke Linejoin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE__STROKE_LINEJOIN = SHAPE__STROKE_LINEJOIN;

	/**
	 * The feature id for the '<em><b>Opacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE__OPACITY = SHAPE__OPACITY;

	/**
	 * The feature id for the '<em><b>Font Family</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE__FONT_FAMILY = SHAPE__FONT_FAMILY;

	/**
	 * The feature id for the '<em><b>Font Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE__FONT_SIZE = SHAPE__FONT_SIZE;

	/**
	 * The feature id for the '<em><b>Font Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE__FONT_WEIGHT = SHAPE__FONT_WEIGHT;

	/**
	 * The feature id for the '<em><b>Font Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE__FONT_STYLE = SHAPE__FONT_STYLE;

	/**
	 * The feature id for the '<em><b>Text Anchor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE__TEXT_ANCHOR = SHAPE__TEXT_ANCHOR;

	/**
	 * The feature id for the '<em><b>Dominant Baseline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE__DOMINANT_BASELINE = SHAPE__DOMINANT_BASELINE;

	/**
	 * The feature id for the '<em><b>Marker Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE__MARKER_START = SHAPE__MARKER_START;

	/**
	 * The feature id for the '<em><b>Marker Mid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE__MARKER_MID = SHAPE__MARKER_MID;

	/**
	 * The feature id for the '<em><b>Marker End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE__MARKER_END = SHAPE__MARKER_END;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE__VISIBILITY = SHAPE__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Clip Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE__CLIP_PATH = SHAPE__CLIP_PATH;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE__CONTENT = SHAPE__CONTENT;

	/**
	 * The feature id for the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE__HREF = SHAPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE__X = SHAPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE__Y = SHAPE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Use</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_FEATURE_COUNT = SHAPE_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Add</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE___ADD__ELEMENT = SHAPE___ADD__ELEMENT;

	/**
	 * The operation id for the '<em>Children</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE___CHILDREN = SHAPE___CHILDREN;

	/**
	 * The number of operations of the '<em>Use</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_OPERATION_COUNT = SHAPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.svg.impl.TextContentImpl <em>Text Content</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.svg.impl.TextContentImpl
	 * @see org.nasdanika.sdk.runtime.models.svg.impl.SvgPackageImpl#getTextContent()
	 * @generated
	 */
	int TEXT_CONTENT = 25;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_CONTENT__ID = ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Style Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_CONTENT__STYLE_CLASS = ELEMENT__STYLE_CLASS;

	/**
	 * The feature id for the '<em><b>Style Attribute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_CONTENT__STYLE_ATTRIBUTE = ELEMENT__STYLE_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Transform</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_CONTENT__TRANSFORM = ELEMENT__TRANSFORM;

	/**
	 * The feature id for the '<em><b>Fill</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_CONTENT__FILL = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Fill Opacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_CONTENT__FILL_OPACITY = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Stroke</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_CONTENT__STROKE = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Stroke Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_CONTENT__STROKE_WIDTH = ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Stroke Opacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_CONTENT__STROKE_OPACITY = ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Stroke Dasharray</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_CONTENT__STROKE_DASHARRAY = ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Stroke Linecap</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_CONTENT__STROKE_LINECAP = ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Stroke Linejoin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_CONTENT__STROKE_LINEJOIN = ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Opacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_CONTENT__OPACITY = ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Font Family</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_CONTENT__FONT_FAMILY = ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Font Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_CONTENT__FONT_SIZE = ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Font Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_CONTENT__FONT_WEIGHT = ELEMENT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Font Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_CONTENT__FONT_STYLE = ELEMENT_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Text Anchor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_CONTENT__TEXT_ANCHOR = ELEMENT_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Dominant Baseline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_CONTENT__DOMINANT_BASELINE = ELEMENT_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Marker Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_CONTENT__MARKER_START = ELEMENT_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Marker Mid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_CONTENT__MARKER_MID = ELEMENT_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Marker End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_CONTENT__MARKER_END = ELEMENT_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_CONTENT__VISIBILITY = ELEMENT_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Clip Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_CONTENT__CLIP_PATH = ELEMENT_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_CONTENT__MIXED = ELEMENT_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_CONTENT__ANY = ELEMENT_FEATURE_COUNT + 21;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_CONTENT__X = ELEMENT_FEATURE_COUNT + 22;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_CONTENT__Y = ELEMENT_FEATURE_COUNT + 23;

	/**
	 * The feature id for the '<em><b>Dx</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_CONTENT__DX = ELEMENT_FEATURE_COUNT + 24;

	/**
	 * The feature id for the '<em><b>Dy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_CONTENT__DY = ELEMENT_FEATURE_COUNT + 25;

	/**
	 * The number of structural features of the '<em>Text Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_CONTENT_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 26;

	/**
	 * The operation id for the '<em>Add Text</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_CONTENT___ADD_TEXT__STRING = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Add Span</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_CONTENT___ADD_SPAN__TSPAN = ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Text</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_CONTENT___TEXT = ELEMENT_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>Text Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_CONTENT_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.svg.impl.TextImpl <em>Text</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.svg.impl.TextImpl
	 * @see org.nasdanika.sdk.runtime.models.svg.impl.SvgPackageImpl#getText()
	 * @generated
	 */
	int TEXT = 26;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__ID = TEXT_CONTENT__ID;

	/**
	 * The feature id for the '<em><b>Style Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__STYLE_CLASS = TEXT_CONTENT__STYLE_CLASS;

	/**
	 * The feature id for the '<em><b>Style Attribute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__STYLE_ATTRIBUTE = TEXT_CONTENT__STYLE_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Transform</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__TRANSFORM = TEXT_CONTENT__TRANSFORM;

	/**
	 * The feature id for the '<em><b>Fill</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__FILL = TEXT_CONTENT__FILL;

	/**
	 * The feature id for the '<em><b>Fill Opacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__FILL_OPACITY = TEXT_CONTENT__FILL_OPACITY;

	/**
	 * The feature id for the '<em><b>Stroke</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__STROKE = TEXT_CONTENT__STROKE;

	/**
	 * The feature id for the '<em><b>Stroke Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__STROKE_WIDTH = TEXT_CONTENT__STROKE_WIDTH;

	/**
	 * The feature id for the '<em><b>Stroke Opacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__STROKE_OPACITY = TEXT_CONTENT__STROKE_OPACITY;

	/**
	 * The feature id for the '<em><b>Stroke Dasharray</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__STROKE_DASHARRAY = TEXT_CONTENT__STROKE_DASHARRAY;

	/**
	 * The feature id for the '<em><b>Stroke Linecap</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__STROKE_LINECAP = TEXT_CONTENT__STROKE_LINECAP;

	/**
	 * The feature id for the '<em><b>Stroke Linejoin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__STROKE_LINEJOIN = TEXT_CONTENT__STROKE_LINEJOIN;

	/**
	 * The feature id for the '<em><b>Opacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__OPACITY = TEXT_CONTENT__OPACITY;

	/**
	 * The feature id for the '<em><b>Font Family</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__FONT_FAMILY = TEXT_CONTENT__FONT_FAMILY;

	/**
	 * The feature id for the '<em><b>Font Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__FONT_SIZE = TEXT_CONTENT__FONT_SIZE;

	/**
	 * The feature id for the '<em><b>Font Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__FONT_WEIGHT = TEXT_CONTENT__FONT_WEIGHT;

	/**
	 * The feature id for the '<em><b>Font Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__FONT_STYLE = TEXT_CONTENT__FONT_STYLE;

	/**
	 * The feature id for the '<em><b>Text Anchor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__TEXT_ANCHOR = TEXT_CONTENT__TEXT_ANCHOR;

	/**
	 * The feature id for the '<em><b>Dominant Baseline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__DOMINANT_BASELINE = TEXT_CONTENT__DOMINANT_BASELINE;

	/**
	 * The feature id for the '<em><b>Marker Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__MARKER_START = TEXT_CONTENT__MARKER_START;

	/**
	 * The feature id for the '<em><b>Marker Mid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__MARKER_MID = TEXT_CONTENT__MARKER_MID;

	/**
	 * The feature id for the '<em><b>Marker End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__MARKER_END = TEXT_CONTENT__MARKER_END;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__VISIBILITY = TEXT_CONTENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Clip Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__CLIP_PATH = TEXT_CONTENT__CLIP_PATH;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__MIXED = TEXT_CONTENT__MIXED;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__ANY = TEXT_CONTENT__ANY;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__X = TEXT_CONTENT__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__Y = TEXT_CONTENT__Y;

	/**
	 * The feature id for the '<em><b>Dx</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__DX = TEXT_CONTENT__DX;

	/**
	 * The feature id for the '<em><b>Dy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__DY = TEXT_CONTENT__DY;

	/**
	 * The number of structural features of the '<em>Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FEATURE_COUNT = TEXT_CONTENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Add Text</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT___ADD_TEXT__STRING = TEXT_CONTENT___ADD_TEXT__STRING;

	/**
	 * The operation id for the '<em>Add Span</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT___ADD_SPAN__TSPAN = TEXT_CONTENT___ADD_SPAN__TSPAN;

	/**
	 * The operation id for the '<em>Text</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT___TEXT = TEXT_CONTENT___TEXT;

	/**
	 * The number of operations of the '<em>Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_OPERATION_COUNT = TEXT_CONTENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.svg.impl.TSpanImpl <em>TSpan</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.svg.impl.TSpanImpl
	 * @see org.nasdanika.sdk.runtime.models.svg.impl.SvgPackageImpl#getTSpan()
	 * @generated
	 */
	int TSPAN = 27;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSPAN__ID = TEXT_CONTENT__ID;

	/**
	 * The feature id for the '<em><b>Style Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSPAN__STYLE_CLASS = TEXT_CONTENT__STYLE_CLASS;

	/**
	 * The feature id for the '<em><b>Style Attribute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSPAN__STYLE_ATTRIBUTE = TEXT_CONTENT__STYLE_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Transform</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSPAN__TRANSFORM = TEXT_CONTENT__TRANSFORM;

	/**
	 * The feature id for the '<em><b>Fill</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSPAN__FILL = TEXT_CONTENT__FILL;

	/**
	 * The feature id for the '<em><b>Fill Opacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSPAN__FILL_OPACITY = TEXT_CONTENT__FILL_OPACITY;

	/**
	 * The feature id for the '<em><b>Stroke</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSPAN__STROKE = TEXT_CONTENT__STROKE;

	/**
	 * The feature id for the '<em><b>Stroke Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSPAN__STROKE_WIDTH = TEXT_CONTENT__STROKE_WIDTH;

	/**
	 * The feature id for the '<em><b>Stroke Opacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSPAN__STROKE_OPACITY = TEXT_CONTENT__STROKE_OPACITY;

	/**
	 * The feature id for the '<em><b>Stroke Dasharray</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSPAN__STROKE_DASHARRAY = TEXT_CONTENT__STROKE_DASHARRAY;

	/**
	 * The feature id for the '<em><b>Stroke Linecap</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSPAN__STROKE_LINECAP = TEXT_CONTENT__STROKE_LINECAP;

	/**
	 * The feature id for the '<em><b>Stroke Linejoin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSPAN__STROKE_LINEJOIN = TEXT_CONTENT__STROKE_LINEJOIN;

	/**
	 * The feature id for the '<em><b>Opacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSPAN__OPACITY = TEXT_CONTENT__OPACITY;

	/**
	 * The feature id for the '<em><b>Font Family</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSPAN__FONT_FAMILY = TEXT_CONTENT__FONT_FAMILY;

	/**
	 * The feature id for the '<em><b>Font Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSPAN__FONT_SIZE = TEXT_CONTENT__FONT_SIZE;

	/**
	 * The feature id for the '<em><b>Font Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSPAN__FONT_WEIGHT = TEXT_CONTENT__FONT_WEIGHT;

	/**
	 * The feature id for the '<em><b>Font Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSPAN__FONT_STYLE = TEXT_CONTENT__FONT_STYLE;

	/**
	 * The feature id for the '<em><b>Text Anchor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSPAN__TEXT_ANCHOR = TEXT_CONTENT__TEXT_ANCHOR;

	/**
	 * The feature id for the '<em><b>Dominant Baseline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSPAN__DOMINANT_BASELINE = TEXT_CONTENT__DOMINANT_BASELINE;

	/**
	 * The feature id for the '<em><b>Marker Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSPAN__MARKER_START = TEXT_CONTENT__MARKER_START;

	/**
	 * The feature id for the '<em><b>Marker Mid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSPAN__MARKER_MID = TEXT_CONTENT__MARKER_MID;

	/**
	 * The feature id for the '<em><b>Marker End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSPAN__MARKER_END = TEXT_CONTENT__MARKER_END;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSPAN__VISIBILITY = TEXT_CONTENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Clip Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSPAN__CLIP_PATH = TEXT_CONTENT__CLIP_PATH;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSPAN__MIXED = TEXT_CONTENT__MIXED;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSPAN__ANY = TEXT_CONTENT__ANY;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSPAN__X = TEXT_CONTENT__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSPAN__Y = TEXT_CONTENT__Y;

	/**
	 * The feature id for the '<em><b>Dx</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSPAN__DX = TEXT_CONTENT__DX;

	/**
	 * The feature id for the '<em><b>Dy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSPAN__DY = TEXT_CONTENT__DY;

	/**
	 * The number of structural features of the '<em>TSpan</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSPAN_FEATURE_COUNT = TEXT_CONTENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Add Text</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSPAN___ADD_TEXT__STRING = TEXT_CONTENT___ADD_TEXT__STRING;

	/**
	 * The operation id for the '<em>Add Span</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSPAN___ADD_SPAN__TSPAN = TEXT_CONTENT___ADD_SPAN__TSPAN;

	/**
	 * The operation id for the '<em>Text</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSPAN___TEXT = TEXT_CONTENT___TEXT;

	/**
	 * The number of operations of the '<em>TSpan</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSPAN_OPERATION_COUNT = TEXT_CONTENT_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.svg.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see org.nasdanika.sdk.runtime.models.svg.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link org.nasdanika.sdk.runtime.models.svg.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.nasdanika.sdk.runtime.models.svg.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link org.nasdanika.sdk.runtime.models.svg.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see org.nasdanika.sdk.runtime.models.svg.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link org.nasdanika.sdk.runtime.models.svg.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see org.nasdanika.sdk.runtime.models.svg.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.sdk.runtime.models.svg.DocumentRoot#getSvg <em>Svg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Svg</em>'.
	 * @see org.nasdanika.sdk.runtime.models.svg.DocumentRoot#getSvg()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Svg();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.sdk.runtime.models.svg.DocumentRoot#getG <em>G</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>G</em>'.
	 * @see org.nasdanika.sdk.runtime.models.svg.DocumentRoot#getG()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_G();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.sdk.runtime.models.svg.DocumentRoot#getDefs <em>Defs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Defs</em>'.
	 * @see org.nasdanika.sdk.runtime.models.svg.DocumentRoot#getDefs()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Defs();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.sdk.runtime.models.svg.DocumentRoot#getA <em>A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>A</em>'.
	 * @see org.nasdanika.sdk.runtime.models.svg.DocumentRoot#getA()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_A();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.sdk.runtime.models.svg.DocumentRoot#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Title</em>'.
	 * @see org.nasdanika.sdk.runtime.models.svg.DocumentRoot#getTitle()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Title();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.sdk.runtime.models.svg.DocumentRoot#getDesc <em>Desc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Desc</em>'.
	 * @see org.nasdanika.sdk.runtime.models.svg.DocumentRoot#getDesc()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Desc();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.sdk.runtime.models.svg.DocumentRoot#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Style</em>'.
	 * @see org.nasdanika.sdk.runtime.models.svg.DocumentRoot#getStyle()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Style();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.sdk.runtime.models.svg.DocumentRoot#getRect <em>Rect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rect</em>'.
	 * @see org.nasdanika.sdk.runtime.models.svg.DocumentRoot#getRect()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Rect();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.sdk.runtime.models.svg.DocumentRoot#getCircle <em>Circle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Circle</em>'.
	 * @see org.nasdanika.sdk.runtime.models.svg.DocumentRoot#getCircle()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Circle();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.sdk.runtime.models.svg.DocumentRoot#getEllipse <em>Ellipse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ellipse</em>'.
	 * @see org.nasdanika.sdk.runtime.models.svg.DocumentRoot#getEllipse()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Ellipse();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.sdk.runtime.models.svg.DocumentRoot#getLine <em>Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Line</em>'.
	 * @see org.nasdanika.sdk.runtime.models.svg.DocumentRoot#getLine()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Line();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.sdk.runtime.models.svg.DocumentRoot#getPolyline <em>Polyline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Polyline</em>'.
	 * @see org.nasdanika.sdk.runtime.models.svg.DocumentRoot#getPolyline()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Polyline();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.sdk.runtime.models.svg.DocumentRoot#getPolygon <em>Polygon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Polygon</em>'.
	 * @see org.nasdanika.sdk.runtime.models.svg.DocumentRoot#getPolygon()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Polygon();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.sdk.runtime.models.svg.DocumentRoot#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Path</em>'.
	 * @see org.nasdanika.sdk.runtime.models.svg.DocumentRoot#getPath()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Path();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.sdk.runtime.models.svg.DocumentRoot#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Text</em>'.
	 * @see org.nasdanika.sdk.runtime.models.svg.DocumentRoot#getText()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Text();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.sdk.runtime.models.svg.DocumentRoot#getTspan <em>Tspan</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Tspan</em>'.
	 * @see org.nasdanika.sdk.runtime.models.svg.DocumentRoot#getTspan()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Tspan();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.sdk.runtime.models.svg.DocumentRoot#getImage <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Image</em>'.
	 * @see org.nasdanika.sdk.runtime.models.svg.DocumentRoot#getImage()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Image();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.sdk.runtime.models.svg.DocumentRoot#getUse <em>Use</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Use</em>'.
	 * @see org.nasdanika.sdk.runtime.models.svg.DocumentRoot#getUse()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Use();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.sdk.runtime.models.svg.DocumentRoot#getMarker <em>Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Marker</em>'.
	 * @see org.nasdanika.sdk.runtime.models.svg.DocumentRoot#getMarker()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Marker();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.sdk.runtime.models.svg.DocumentRoot#getClipPath <em>Clip Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Clip Path</em>'.
	 * @see org.nasdanika.sdk.runtime.models.svg.DocumentRoot#getClipPath()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ClipPath();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.sdk.runtime.models.svg.DocumentRoot#getLinearGradient <em>Linear Gradient</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Linear Gradient</em>'.
	 * @see org.nasdanika.sdk.runtime.models.svg.DocumentRoot#getLinearGradient()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_LinearGradient();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.sdk.runtime.models.svg.DocumentRoot#getStop <em>Stop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Stop</em>'.
	 * @see org.nasdanika.sdk.runtime.models.svg.DocumentRoot#getStop()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Stop();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.svg.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see org.nasdanika.sdk.runtime.models.svg.Element
	 * @generated
	 */
	EClass getElement();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.svg.Element#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.nasdanika.sdk.runtime.models.svg.Element#getId()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.svg.Element#getStyleClass <em>Style Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style Class</em>'.
	 * @see org.nasdanika.sdk.runtime.models.svg.Element#getStyleClass()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_StyleClass();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.svg.Element#getStyleAttribute <em>Style Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style Attribute</em>'.
	 * @see org.nasdanika.sdk.runtime.models.svg.Element#getStyleAttribute()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_StyleAttribute();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.svg.Element#getTransform <em>Transform</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transform</em>'.
	 * @see org.nasdanika.sdk.runtime.models.svg.Element#getTransform()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Transform();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.svg.Presentation <em>Presentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Presentation</em>'.
	 * @see org.nasdanika.sdk.runtime.models.svg.Presentation
	 * @generated
	 */
	EClass getPresentation();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.svg.Presentation#getFill <em>Fill</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fill</em>'.
	 * @see org.nasdanika.sdk.runtime.models.svg.Presentation#getFill()
	 * @see #getPresentation()
	 * @generated
	 */
	EAttribute getPresentation_Fill();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.svg.Presentation#getFillOpacity <em>Fill Opacity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fill Opacity</em>'.
	 * @see org.nasdanika.sdk.runtime.models.svg.Presentation#getFillOpacity()
	 * @see #getPresentation()
	 * @generated
	 */
	EAttribute getPresentation_FillOpacity();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.svg.Presentation#getStroke <em>Stroke</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stroke</em>'.
	 * @see org.nasdanika.sdk.runtime.models.svg.Presentation#getStroke()
	 * @see #getPresentation()
	 * @generated
	 */
	EAttribute getPresentation_Stroke();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.svg.Presentation#getStrokeWidth <em>Stroke Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stroke Width</em>'.
	 * @see org.nasdanika.sdk.runtime.models.svg.Presentation#getStrokeWidth()
	 * @see #getPresentation()
	 * @generated
	 */
	EAttribute getPresentation_StrokeWidth();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.svg.Presentation#getStrokeOpacity <em>Stroke Opacity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stroke Opacity</em>'.
	 * @see org.nasdanika.sdk.runtime.models.svg.Presentation#getStrokeOpacity()
	 * @see #getPresentation()
	 * @generated
	 */
	EAttribute getPresentation_StrokeOpacity();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.svg.Presentation#getStrokeDasharray <em>Stroke Dasharray</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stroke Dasharray</em>'.
	 * @see org.nasdanika.sdk.runtime.models.svg.Presentation#getStrokeDasharray()
	 * @see #getPresentation()
	 * @generated
	 */
	EAttribute getPresentation_StrokeDasharray();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.svg.Presentation#getStrokeLinecap <em>Stroke Linecap</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stroke Linecap</em>'.
	 * @see org.nasdanika.sdk.runtime.models.svg.Presentation#getStrokeLinecap()
	 * @see #getPresentation()
	 * @generated
	 */
	EAttribute getPresentation_StrokeLinecap();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.svg.Presentation#getStrokeLinejoin <em>Stroke Linejoin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stroke Linejoin</em>'.
	 * @see org.nasdanika.sdk.runtime.models.svg.Presentation#getStrokeLinejoin()
	 * @see #getPresentation()
	 * @generated
	 */
	EAttribute getPresentation_StrokeLinejoin();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.svg.Presentation#getOpacity <em>Opacity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Opacity</em>'.
	 * @see org.nasdanika.sdk.runtime.models.svg.Presentation#getOpacity()
	 * @see #getPresentation()
	 * @generated
	 */
	EAttribute getPresentation_Opacity();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.svg.Presentation#getFontFamily <em>Font Family</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Font Family</em>'.
	 * @see org.nasdanika.sdk.runtime.models.svg.Presentation#getFontFamily()
	 * @see #getPresentation()
	 * @generated
	 */
	EAttribute getPresentation_FontFamily();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.svg.Presentation#getFontSize <em>Font Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Font Size</em>'.
	 * @see org.nasdanika.sdk.runtime.models.svg.Presentation#getFontSize()
	 * @see #getPresentation()
	 * @generated
	 */
	EAttribute getPresentation_FontSize();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.svg.Presentation#getFontWeight <em>Font Weight</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Font Weight</em>'.
	 * @see org.nasdanika.sdk.runtime.models.svg.Presentation#getFontWeight()
	 * @see #getPresentation()
	 * @generated
	 */
	EAttribute getPresentation_FontWeight();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.svg.Presentation#getFontStyle <em>Font Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Font Style</em>'.
	 * @see org.nasdanika.sdk.runtime.models.svg.Presentation#getFontStyle()
	 * @see #getPresentation()
	 * @generated
	 */
	EAttribute getPresentation_FontStyle();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.svg.Presentation#getTextAnchor <em>Text Anchor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text Anchor</em>'.
	 * @see org.nasdanika.sdk.runtime.models.svg.Presentation#getTextAnchor()
	 * @see #getPresentation()
	 * @generated
	 */
	EAttribute getPresentation_TextAnchor();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.svg.Presentation#getDominantBaseline <em>Dominant Baseline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dominant Baseline</em>'.
	 * @see org.nasdanika.sdk.runtime.models.svg.Presentation#getDominantBaseline()
	 * @see #getPresentation()
	 * @generated
	 */
	EAttribute getPresentation_DominantBaseline();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.svg.Presentation#getMarkerStart <em>Marker Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Marker Start</em>'.
	 * @see org.nasdanika.sdk.runtime.models.svg.Presentation#getMarkerStart()
	 * @see #getPresentation()
	 * @generated
	 */
	EAttribute getPresentation_MarkerStart();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.svg.Presentation#getMarkerMid <em>Marker Mid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Marker Mid</em>'.
	 * @see org.nasdanika.sdk.runtime.models.svg.Presentation#getMarkerMid()
	 * @see #getPresentation()
	 * @generated
	 */
	EAttribute getPresentation_MarkerMid();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.svg.Presentation#getMarkerEnd <em>Marker End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Marker End</em>'.
	 * @see org.nasdanika.sdk.runtime.models.svg.Presentation#getMarkerEnd()
	 * @see #getPresentation()
	 * @generated
	 */
	EAttribute getPresentation_MarkerEnd();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.svg.Presentation#getVisibility <em>Visibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visibility</em>'.
	 * @see org.nasdanika.sdk.runtime.models.svg.Presentation#getVisibility()
	 * @see #getPresentation()
	 * @generated
	 */
	EAttribute getPresentation_Visibility();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.svg.Presentation#getClipPath <em>Clip Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Clip Path</em>'.
	 * @see org.nasdanika.sdk.runtime.models.svg.Presentation#getClipPath()
	 * @see #getPresentation()
	 * @generated
	 */
	EAttribute getPresentation_ClipPath();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.svg.Container <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Container</em>'.
	 * @see org.nasdanika.sdk.runtime.models.svg.Container
	 * @generated
	 */
	EClass getContainer();

	/**
	 * Returns the meta object for the attribute list '{@link org.nasdanika.sdk.runtime.models.svg.Container#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Content</em>'.
	 * @see org.nasdanika.sdk.runtime.models.svg.Container#getContent()
	 * @see #getContainer()
	 * @generated
	 */
	EAttribute getContainer_Content();

	/**
	 * Returns the meta object for the '{@link org.nasdanika.sdk.runtime.models.svg.Container#add(org.nasdanika.sdk.runtime.models.svg.Element) <em>Add</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add</em>' operation.
	 * @see org.nasdanika.sdk.runtime.models.svg.Container#add(org.nasdanika.sdk.runtime.models.svg.Element)
	 * @generated
	 */
	EOperation getContainer__Add__Element();

	/**
	 * Returns the meta object for the '{@link org.nasdanika.sdk.runtime.models.svg.Container#children() <em>Children</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Children</em>' operation.
	 * @see org.nasdanika.sdk.runtime.models.svg.Container#children()
	 * @generated
	 */
	EOperation getContainer__Children();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.svg.Svg <em>Svg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Svg</em>'.
	 * @see org.nasdanika.sdk.runtime.models.svg.Svg
	 * @generated
	 */
	EClass getSvg();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.svg.Svg#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see org.nasdanika.sdk.runtime.models.svg.Svg#getVersion()
	 * @see #getSvg()
	 * @generated
	 */
	EAttribute getSvg_Version();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.svg.Svg#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see org.nasdanika.sdk.runtime.models.svg.Svg#getX()
	 * @see #getSvg()
	 * @generated
	 */
	EAttribute getSvg_X();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.svg.Svg#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see org.nasdanika.sdk.runtime.models.svg.Svg#getY()
	 * @see #getSvg()
	 * @generated
	 */
	EAttribute getSvg_Y();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.svg.Svg#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see org.nasdanika.sdk.runtime.models.svg.Svg#getWidth()
	 * @see #getSvg()
	 * @generated
	 */
	EAttribute getSvg_Width();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.svg.Svg#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see org.nasdanika.sdk.runtime.models.svg.Svg#getHeight()
	 * @see #getSvg()
	 * @generated
	 */
	EAttribute getSvg_Height();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.svg.Svg#getViewBox <em>View Box</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>View Box</em>'.
	 * @see org.nasdanika.sdk.runtime.models.svg.Svg#getViewBox()
	 * @see #getSvg()
	 * @generated
	 */
	EAttribute getSvg_ViewBox();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.svg.Svg#getPreserveAspectRatio <em>Preserve Aspect Ratio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Preserve Aspect Ratio</em>'.
	 * @see org.nasdanika.sdk.runtime.models.svg.Svg#getPreserveAspectRatio()
	 * @see #getSvg()
	 * @generated
	 */
	EAttribute getSvg_PreserveAspectRatio();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.svg.G <em>G</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>G</em>'.
	 * @see org.nasdanika.sdk.runtime.models.svg.G
	 * @generated
	 */
	EClass getG();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.svg.Defs <em>Defs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Defs</em>'.
	 * @see org.nasdanika.sdk.runtime.models.svg.Defs
	 * @generated
	 */
	EClass getDefs();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.svg.A <em>A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>A</em>'.
	 * @see org.nasdanika.sdk.runtime.models.svg.A
	 * @generated
	 */
	EClass getA();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.svg.A#getHref <em>Href</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Href</em>'.
	 * @see org.nasdanika.sdk.runtime.models.svg.A#getHref()
	 * @see #getA()
	 * @generated
	 */
	EAttribute getA_Href();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.svg.A#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target</em>'.
	 * @see org.nasdanika.sdk.runtime.models.svg.A#getTarget()
	 * @see #getA()
	 * @generated
	 */
	EAttribute getA_Target();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.svg.Marker <em>Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Marker</em>'.
	 * @see org.nasdanika.sdk.runtime.models.svg.Marker
	 * @generated
	 */
	EClass getMarker();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.svg.Marker#getViewBox <em>View Box</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>View Box</em>'.
	 * @see org.nasdanika.sdk.runtime.models.svg.Marker#getViewBox()
	 * @see #getMarker()
	 * @generated
	 */
	EAttribute getMarker_ViewBox();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.svg.Marker#getRefX <em>Ref X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ref X</em>'.
	 * @see org.nasdanika.sdk.runtime.models.svg.Marker#getRefX()
	 * @see #getMarker()
	 * @generated
	 */
	EAttribute getMarker_RefX();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.svg.Marker#getRefY <em>Ref Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ref Y</em>'.
	 * @see org.nasdanika.sdk.runtime.models.svg.Marker#getRefY()
	 * @see #getMarker()
	 * @generated
	 */
	EAttribute getMarker_RefY();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.svg.Marker#getMarkerWidth <em>Marker Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Marker Width</em>'.
	 * @see org.nasdanika.sdk.runtime.models.svg.Marker#getMarkerWidth()
	 * @see #getMarker()
	 * @generated
	 */
	EAttribute getMarker_MarkerWidth();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.svg.Marker#getMarkerHeight <em>Marker Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Marker Height</em>'.
	 * @see org.nasdanika.sdk.runtime.models.svg.Marker#getMarkerHeight()
	 * @see #getMarker()
	 * @generated
	 */
	EAttribute getMarker_MarkerHeight();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.svg.Marker#getOrient <em>Orient</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Orient</em>'.
	 * @see org.nasdanika.sdk.runtime.models.svg.Marker#getOrient()
	 * @see #getMarker()
	 * @generated
	 */
	EAttribute getMarker_Orient();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.svg.Marker#getMarkerUnits <em>Marker Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Marker Units</em>'.
	 * @see org.nasdanika.sdk.runtime.models.svg.Marker#getMarkerUnits()
	 * @see #getMarker()
	 * @generated
	 */
	EAttribute getMarker_MarkerUnits();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.svg.ClipPath <em>Clip Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Clip Path</em>'.
	 * @see org.nasdanika.sdk.runtime.models.svg.ClipPath
	 * @generated
	 */
	EClass getClipPath();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.svg.ClipPath#getClipPathUnits <em>Clip Path Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Clip Path Units</em>'.
	 * @see org.nasdanika.sdk.runtime.models.svg.ClipPath#getClipPathUnits()
	 * @see #getClipPath()
	 * @generated
	 */
	EAttribute getClipPath_ClipPathUnits();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.svg.LinearGradient <em>Linear Gradient</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Linear Gradient</em>'.
	 * @see org.nasdanika.sdk.runtime.models.svg.LinearGradient
	 * @generated
	 */
	EClass getLinearGradient();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.svg.LinearGradient#getX1 <em>X1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X1</em>'.
	 * @see org.nasdanika.sdk.runtime.models.svg.LinearGradient#getX1()
	 * @see #getLinearGradient()
	 * @generated
	 */
	EAttribute getLinearGradient_X1();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.svg.LinearGradient#getY1 <em>Y1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y1</em>'.
	 * @see org.nasdanika.sdk.runtime.models.svg.LinearGradient#getY1()
	 * @see #getLinearGradient()
	 * @generated
	 */
	EAttribute getLinearGradient_Y1();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.svg.LinearGradient#getX2 <em>X2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X2</em>'.
	 * @see org.nasdanika.sdk.runtime.models.svg.LinearGradient#getX2()
	 * @see #getLinearGradient()
	 * @generated
	 */
	EAttribute getLinearGradient_X2();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.svg.LinearGradient#getY2 <em>Y2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y2</em>'.
	 * @see org.nasdanika.sdk.runtime.models.svg.LinearGradient#getY2()
	 * @see #getLinearGradient()
	 * @generated
	 */
	EAttribute getLinearGradient_Y2();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.svg.LinearGradient#getGradientUnits <em>Gradient Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gradient Units</em>'.
	 * @see org.nasdanika.sdk.runtime.models.svg.LinearGradient#getGradientUnits()
	 * @see #getLinearGradient()
	 * @generated
	 */
	EAttribute getLinearGradient_GradientUnits();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.svg.Stop <em>Stop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stop</em>'.
	 * @see org.nasdanika.sdk.runtime.models.svg.Stop
	 * @generated
	 */
	EClass getStop();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.svg.Stop#getOffset <em>Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Offset</em>'.
	 * @see org.nasdanika.sdk.runtime.models.svg.Stop#getOffset()
	 * @see #getStop()
	 * @generated
	 */
	EAttribute getStop_Offset();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.svg.Stop#getStopColor <em>Stop Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stop Color</em>'.
	 * @see org.nasdanika.sdk.runtime.models.svg.Stop#getStopColor()
	 * @see #getStop()
	 * @generated
	 */
	EAttribute getStop_StopColor();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.svg.Stop#getStopOpacity <em>Stop Opacity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stop Opacity</em>'.
	 * @see org.nasdanika.sdk.runtime.models.svg.Stop#getStopOpacity()
	 * @see #getStop()
	 * @generated
	 */
	EAttribute getStop_StopOpacity();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.svg.Title <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Title</em>'.
	 * @see org.nasdanika.sdk.runtime.models.svg.Title
	 * @generated
	 */
	EClass getTitle();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.svg.Title#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.nasdanika.sdk.runtime.models.svg.Title#getValue()
	 * @see #getTitle()
	 * @generated
	 */
	EAttribute getTitle_Value();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.svg.Desc <em>Desc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Desc</em>'.
	 * @see org.nasdanika.sdk.runtime.models.svg.Desc
	 * @generated
	 */
	EClass getDesc();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.svg.Desc#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.nasdanika.sdk.runtime.models.svg.Desc#getValue()
	 * @see #getDesc()
	 * @generated
	 */
	EAttribute getDesc_Value();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.svg.Style <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Style</em>'.
	 * @see org.nasdanika.sdk.runtime.models.svg.Style
	 * @generated
	 */
	EClass getStyle();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.svg.Style#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.nasdanika.sdk.runtime.models.svg.Style#getValue()
	 * @see #getStyle()
	 * @generated
	 */
	EAttribute getStyle_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.svg.Style#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.nasdanika.sdk.runtime.models.svg.Style#getType()
	 * @see #getStyle()
	 * @generated
	 */
	EAttribute getStyle_Type();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.svg.Shape <em>Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Shape</em>'.
	 * @see org.nasdanika.sdk.runtime.models.svg.Shape
	 * @generated
	 */
	EClass getShape();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.svg.Rect <em>Rect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rect</em>'.
	 * @see org.nasdanika.sdk.runtime.models.svg.Rect
	 * @generated
	 */
	EClass getRect();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.svg.Rect#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see org.nasdanika.sdk.runtime.models.svg.Rect#getX()
	 * @see #getRect()
	 * @generated
	 */
	EAttribute getRect_X();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.svg.Rect#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see org.nasdanika.sdk.runtime.models.svg.Rect#getY()
	 * @see #getRect()
	 * @generated
	 */
	EAttribute getRect_Y();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.svg.Rect#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see org.nasdanika.sdk.runtime.models.svg.Rect#getWidth()
	 * @see #getRect()
	 * @generated
	 */
	EAttribute getRect_Width();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.svg.Rect#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see org.nasdanika.sdk.runtime.models.svg.Rect#getHeight()
	 * @see #getRect()
	 * @generated
	 */
	EAttribute getRect_Height();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.svg.Rect#getRx <em>Rx</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rx</em>'.
	 * @see org.nasdanika.sdk.runtime.models.svg.Rect#getRx()
	 * @see #getRect()
	 * @generated
	 */
	EAttribute getRect_Rx();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.svg.Rect#getRy <em>Ry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ry</em>'.
	 * @see org.nasdanika.sdk.runtime.models.svg.Rect#getRy()
	 * @see #getRect()
	 * @generated
	 */
	EAttribute getRect_Ry();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.svg.Circle <em>Circle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Circle</em>'.
	 * @see org.nasdanika.sdk.runtime.models.svg.Circle
	 * @generated
	 */
	EClass getCircle();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.svg.Circle#getCx <em>Cx</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cx</em>'.
	 * @see org.nasdanika.sdk.runtime.models.svg.Circle#getCx()
	 * @see #getCircle()
	 * @generated
	 */
	EAttribute getCircle_Cx();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.svg.Circle#getCy <em>Cy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cy</em>'.
	 * @see org.nasdanika.sdk.runtime.models.svg.Circle#getCy()
	 * @see #getCircle()
	 * @generated
	 */
	EAttribute getCircle_Cy();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.svg.Circle#getR <em>R</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>R</em>'.
	 * @see org.nasdanika.sdk.runtime.models.svg.Circle#getR()
	 * @see #getCircle()
	 * @generated
	 */
	EAttribute getCircle_R();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.svg.Ellipse <em>Ellipse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ellipse</em>'.
	 * @see org.nasdanika.sdk.runtime.models.svg.Ellipse
	 * @generated
	 */
	EClass getEllipse();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.svg.Ellipse#getCx <em>Cx</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cx</em>'.
	 * @see org.nasdanika.sdk.runtime.models.svg.Ellipse#getCx()
	 * @see #getEllipse()
	 * @generated
	 */
	EAttribute getEllipse_Cx();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.svg.Ellipse#getCy <em>Cy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cy</em>'.
	 * @see org.nasdanika.sdk.runtime.models.svg.Ellipse#getCy()
	 * @see #getEllipse()
	 * @generated
	 */
	EAttribute getEllipse_Cy();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.svg.Ellipse#getRx <em>Rx</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rx</em>'.
	 * @see org.nasdanika.sdk.runtime.models.svg.Ellipse#getRx()
	 * @see #getEllipse()
	 * @generated
	 */
	EAttribute getEllipse_Rx();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.svg.Ellipse#getRy <em>Ry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ry</em>'.
	 * @see org.nasdanika.sdk.runtime.models.svg.Ellipse#getRy()
	 * @see #getEllipse()
	 * @generated
	 */
	EAttribute getEllipse_Ry();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.svg.Line <em>Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Line</em>'.
	 * @see org.nasdanika.sdk.runtime.models.svg.Line
	 * @generated
	 */
	EClass getLine();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.svg.Line#getX1 <em>X1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X1</em>'.
	 * @see org.nasdanika.sdk.runtime.models.svg.Line#getX1()
	 * @see #getLine()
	 * @generated
	 */
	EAttribute getLine_X1();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.svg.Line#getY1 <em>Y1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y1</em>'.
	 * @see org.nasdanika.sdk.runtime.models.svg.Line#getY1()
	 * @see #getLine()
	 * @generated
	 */
	EAttribute getLine_Y1();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.svg.Line#getX2 <em>X2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X2</em>'.
	 * @see org.nasdanika.sdk.runtime.models.svg.Line#getX2()
	 * @see #getLine()
	 * @generated
	 */
	EAttribute getLine_X2();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.svg.Line#getY2 <em>Y2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y2</em>'.
	 * @see org.nasdanika.sdk.runtime.models.svg.Line#getY2()
	 * @see #getLine()
	 * @generated
	 */
	EAttribute getLine_Y2();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.svg.Polyline <em>Polyline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Polyline</em>'.
	 * @see org.nasdanika.sdk.runtime.models.svg.Polyline
	 * @generated
	 */
	EClass getPolyline();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.svg.Polyline#getPoints <em>Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Points</em>'.
	 * @see org.nasdanika.sdk.runtime.models.svg.Polyline#getPoints()
	 * @see #getPolyline()
	 * @generated
	 */
	EAttribute getPolyline_Points();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.svg.Polygon <em>Polygon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Polygon</em>'.
	 * @see org.nasdanika.sdk.runtime.models.svg.Polygon
	 * @generated
	 */
	EClass getPolygon();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.svg.Polygon#getPoints <em>Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Points</em>'.
	 * @see org.nasdanika.sdk.runtime.models.svg.Polygon#getPoints()
	 * @see #getPolygon()
	 * @generated
	 */
	EAttribute getPolygon_Points();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.svg.Path <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Path</em>'.
	 * @see org.nasdanika.sdk.runtime.models.svg.Path
	 * @generated
	 */
	EClass getPath();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.svg.Path#getD <em>D</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>D</em>'.
	 * @see org.nasdanika.sdk.runtime.models.svg.Path#getD()
	 * @see #getPath()
	 * @generated
	 */
	EAttribute getPath_D();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.svg.Image <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Image</em>'.
	 * @see org.nasdanika.sdk.runtime.models.svg.Image
	 * @generated
	 */
	EClass getImage();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.svg.Image#getHref <em>Href</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Href</em>'.
	 * @see org.nasdanika.sdk.runtime.models.svg.Image#getHref()
	 * @see #getImage()
	 * @generated
	 */
	EAttribute getImage_Href();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.svg.Image#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see org.nasdanika.sdk.runtime.models.svg.Image#getX()
	 * @see #getImage()
	 * @generated
	 */
	EAttribute getImage_X();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.svg.Image#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see org.nasdanika.sdk.runtime.models.svg.Image#getY()
	 * @see #getImage()
	 * @generated
	 */
	EAttribute getImage_Y();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.svg.Image#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see org.nasdanika.sdk.runtime.models.svg.Image#getWidth()
	 * @see #getImage()
	 * @generated
	 */
	EAttribute getImage_Width();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.svg.Image#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see org.nasdanika.sdk.runtime.models.svg.Image#getHeight()
	 * @see #getImage()
	 * @generated
	 */
	EAttribute getImage_Height();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.svg.Image#getPreserveAspectRatio <em>Preserve Aspect Ratio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Preserve Aspect Ratio</em>'.
	 * @see org.nasdanika.sdk.runtime.models.svg.Image#getPreserveAspectRatio()
	 * @see #getImage()
	 * @generated
	 */
	EAttribute getImage_PreserveAspectRatio();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.svg.Use <em>Use</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Use</em>'.
	 * @see org.nasdanika.sdk.runtime.models.svg.Use
	 * @generated
	 */
	EClass getUse();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.svg.Use#getHref <em>Href</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Href</em>'.
	 * @see org.nasdanika.sdk.runtime.models.svg.Use#getHref()
	 * @see #getUse()
	 * @generated
	 */
	EAttribute getUse_Href();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.svg.Use#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see org.nasdanika.sdk.runtime.models.svg.Use#getX()
	 * @see #getUse()
	 * @generated
	 */
	EAttribute getUse_X();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.svg.Use#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see org.nasdanika.sdk.runtime.models.svg.Use#getY()
	 * @see #getUse()
	 * @generated
	 */
	EAttribute getUse_Y();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.svg.TextContent <em>Text Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text Content</em>'.
	 * @see org.nasdanika.sdk.runtime.models.svg.TextContent
	 * @generated
	 */
	EClass getTextContent();

	/**
	 * Returns the meta object for the attribute list '{@link org.nasdanika.sdk.runtime.models.svg.TextContent#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.nasdanika.sdk.runtime.models.svg.TextContent#getMixed()
	 * @see #getTextContent()
	 * @generated
	 */
	EAttribute getTextContent_Mixed();

	/**
	 * Returns the meta object for the attribute list '{@link org.nasdanika.sdk.runtime.models.svg.TextContent#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see org.nasdanika.sdk.runtime.models.svg.TextContent#getAny()
	 * @see #getTextContent()
	 * @generated
	 */
	EAttribute getTextContent_Any();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.svg.TextContent#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see org.nasdanika.sdk.runtime.models.svg.TextContent#getX()
	 * @see #getTextContent()
	 * @generated
	 */
	EAttribute getTextContent_X();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.svg.TextContent#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see org.nasdanika.sdk.runtime.models.svg.TextContent#getY()
	 * @see #getTextContent()
	 * @generated
	 */
	EAttribute getTextContent_Y();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.svg.TextContent#getDx <em>Dx</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dx</em>'.
	 * @see org.nasdanika.sdk.runtime.models.svg.TextContent#getDx()
	 * @see #getTextContent()
	 * @generated
	 */
	EAttribute getTextContent_Dx();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.svg.TextContent#getDy <em>Dy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dy</em>'.
	 * @see org.nasdanika.sdk.runtime.models.svg.TextContent#getDy()
	 * @see #getTextContent()
	 * @generated
	 */
	EAttribute getTextContent_Dy();

	/**
	 * Returns the meta object for the '{@link org.nasdanika.sdk.runtime.models.svg.TextContent#addText(java.lang.String) <em>Add Text</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Text</em>' operation.
	 * @see org.nasdanika.sdk.runtime.models.svg.TextContent#addText(java.lang.String)
	 * @generated
	 */
	EOperation getTextContent__AddText__String();

	/**
	 * Returns the meta object for the '{@link org.nasdanika.sdk.runtime.models.svg.TextContent#addSpan(org.nasdanika.sdk.runtime.models.svg.TSpan) <em>Add Span</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Span</em>' operation.
	 * @see org.nasdanika.sdk.runtime.models.svg.TextContent#addSpan(org.nasdanika.sdk.runtime.models.svg.TSpan)
	 * @generated
	 */
	EOperation getTextContent__AddSpan__TSpan();

	/**
	 * Returns the meta object for the '{@link org.nasdanika.sdk.runtime.models.svg.TextContent#text() <em>Text</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Text</em>' operation.
	 * @see org.nasdanika.sdk.runtime.models.svg.TextContent#text()
	 * @generated
	 */
	EOperation getTextContent__Text();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.svg.Text <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text</em>'.
	 * @see org.nasdanika.sdk.runtime.models.svg.Text
	 * @generated
	 */
	EClass getText();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.svg.TSpan <em>TSpan</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TSpan</em>'.
	 * @see org.nasdanika.sdk.runtime.models.svg.TSpan
	 * @generated
	 */
	EClass getTSpan();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SvgFactory getSvgFactory();

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
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.svg.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.svg.impl.DocumentRootImpl
		 * @see org.nasdanika.sdk.runtime.models.svg.impl.SvgPackageImpl#getDocumentRoot()
		 * @generated
		 */
		EClass DOCUMENT_ROOT = eINSTANCE.getDocumentRoot();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__MIXED = eINSTANCE.getDocumentRoot_Mixed();

		/**
		 * The meta object literal for the '<em><b>XMLNS Prefix Map</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XMLNS_PREFIX_MAP = eINSTANCE.getDocumentRoot_XMLNSPrefixMap();

		/**
		 * The meta object literal for the '<em><b>XSI Schema Location</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = eINSTANCE.getDocumentRoot_XSISchemaLocation();

		/**
		 * The meta object literal for the '<em><b>Svg</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__SVG = eINSTANCE.getDocumentRoot_Svg();

		/**
		 * The meta object literal for the '<em><b>G</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__G = eINSTANCE.getDocumentRoot_G();

		/**
		 * The meta object literal for the '<em><b>Defs</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__DEFS = eINSTANCE.getDocumentRoot_Defs();

		/**
		 * The meta object literal for the '<em><b>A</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__A = eINSTANCE.getDocumentRoot_A();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__TITLE = eINSTANCE.getDocumentRoot_Title();

		/**
		 * The meta object literal for the '<em><b>Desc</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__DESC = eINSTANCE.getDocumentRoot_Desc();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__STYLE = eINSTANCE.getDocumentRoot_Style();

		/**
		 * The meta object literal for the '<em><b>Rect</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__RECT = eINSTANCE.getDocumentRoot_Rect();

		/**
		 * The meta object literal for the '<em><b>Circle</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__CIRCLE = eINSTANCE.getDocumentRoot_Circle();

		/**
		 * The meta object literal for the '<em><b>Ellipse</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__ELLIPSE = eINSTANCE.getDocumentRoot_Ellipse();

		/**
		 * The meta object literal for the '<em><b>Line</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__LINE = eINSTANCE.getDocumentRoot_Line();

		/**
		 * The meta object literal for the '<em><b>Polyline</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__POLYLINE = eINSTANCE.getDocumentRoot_Polyline();

		/**
		 * The meta object literal for the '<em><b>Polygon</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__POLYGON = eINSTANCE.getDocumentRoot_Polygon();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__PATH = eINSTANCE.getDocumentRoot_Path();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__TEXT = eINSTANCE.getDocumentRoot_Text();

		/**
		 * The meta object literal for the '<em><b>Tspan</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__TSPAN = eINSTANCE.getDocumentRoot_Tspan();

		/**
		 * The meta object literal for the '<em><b>Image</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__IMAGE = eINSTANCE.getDocumentRoot_Image();

		/**
		 * The meta object literal for the '<em><b>Use</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__USE = eINSTANCE.getDocumentRoot_Use();

		/**
		 * The meta object literal for the '<em><b>Marker</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__MARKER = eINSTANCE.getDocumentRoot_Marker();

		/**
		 * The meta object literal for the '<em><b>Clip Path</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__CLIP_PATH = eINSTANCE.getDocumentRoot_ClipPath();

		/**
		 * The meta object literal for the '<em><b>Linear Gradient</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__LINEAR_GRADIENT = eINSTANCE.getDocumentRoot_LinearGradient();

		/**
		 * The meta object literal for the '<em><b>Stop</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__STOP = eINSTANCE.getDocumentRoot_Stop();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.svg.impl.ElementImpl <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.svg.impl.ElementImpl
		 * @see org.nasdanika.sdk.runtime.models.svg.impl.SvgPackageImpl#getElement()
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
		 * The meta object literal for the '<em><b>Style Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__STYLE_CLASS = eINSTANCE.getElement_StyleClass();

		/**
		 * The meta object literal for the '<em><b>Style Attribute</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__STYLE_ATTRIBUTE = eINSTANCE.getElement_StyleAttribute();

		/**
		 * The meta object literal for the '<em><b>Transform</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__TRANSFORM = eINSTANCE.getElement_Transform();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.svg.Presentation <em>Presentation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.svg.Presentation
		 * @see org.nasdanika.sdk.runtime.models.svg.impl.SvgPackageImpl#getPresentation()
		 * @generated
		 */
		EClass PRESENTATION = eINSTANCE.getPresentation();

		/**
		 * The meta object literal for the '<em><b>Fill</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRESENTATION__FILL = eINSTANCE.getPresentation_Fill();

		/**
		 * The meta object literal for the '<em><b>Fill Opacity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRESENTATION__FILL_OPACITY = eINSTANCE.getPresentation_FillOpacity();

		/**
		 * The meta object literal for the '<em><b>Stroke</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRESENTATION__STROKE = eINSTANCE.getPresentation_Stroke();

		/**
		 * The meta object literal for the '<em><b>Stroke Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRESENTATION__STROKE_WIDTH = eINSTANCE.getPresentation_StrokeWidth();

		/**
		 * The meta object literal for the '<em><b>Stroke Opacity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRESENTATION__STROKE_OPACITY = eINSTANCE.getPresentation_StrokeOpacity();

		/**
		 * The meta object literal for the '<em><b>Stroke Dasharray</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRESENTATION__STROKE_DASHARRAY = eINSTANCE.getPresentation_StrokeDasharray();

		/**
		 * The meta object literal for the '<em><b>Stroke Linecap</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRESENTATION__STROKE_LINECAP = eINSTANCE.getPresentation_StrokeLinecap();

		/**
		 * The meta object literal for the '<em><b>Stroke Linejoin</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRESENTATION__STROKE_LINEJOIN = eINSTANCE.getPresentation_StrokeLinejoin();

		/**
		 * The meta object literal for the '<em><b>Opacity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRESENTATION__OPACITY = eINSTANCE.getPresentation_Opacity();

		/**
		 * The meta object literal for the '<em><b>Font Family</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRESENTATION__FONT_FAMILY = eINSTANCE.getPresentation_FontFamily();

		/**
		 * The meta object literal for the '<em><b>Font Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRESENTATION__FONT_SIZE = eINSTANCE.getPresentation_FontSize();

		/**
		 * The meta object literal for the '<em><b>Font Weight</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRESENTATION__FONT_WEIGHT = eINSTANCE.getPresentation_FontWeight();

		/**
		 * The meta object literal for the '<em><b>Font Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRESENTATION__FONT_STYLE = eINSTANCE.getPresentation_FontStyle();

		/**
		 * The meta object literal for the '<em><b>Text Anchor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRESENTATION__TEXT_ANCHOR = eINSTANCE.getPresentation_TextAnchor();

		/**
		 * The meta object literal for the '<em><b>Dominant Baseline</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRESENTATION__DOMINANT_BASELINE = eINSTANCE.getPresentation_DominantBaseline();

		/**
		 * The meta object literal for the '<em><b>Marker Start</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRESENTATION__MARKER_START = eINSTANCE.getPresentation_MarkerStart();

		/**
		 * The meta object literal for the '<em><b>Marker Mid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRESENTATION__MARKER_MID = eINSTANCE.getPresentation_MarkerMid();

		/**
		 * The meta object literal for the '<em><b>Marker End</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRESENTATION__MARKER_END = eINSTANCE.getPresentation_MarkerEnd();

		/**
		 * The meta object literal for the '<em><b>Visibility</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRESENTATION__VISIBILITY = eINSTANCE.getPresentation_Visibility();

		/**
		 * The meta object literal for the '<em><b>Clip Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRESENTATION__CLIP_PATH = eINSTANCE.getPresentation_ClipPath();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.svg.impl.ContainerImpl <em>Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.svg.impl.ContainerImpl
		 * @see org.nasdanika.sdk.runtime.models.svg.impl.SvgPackageImpl#getContainer()
		 * @generated
		 */
		EClass CONTAINER = eINSTANCE.getContainer();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER__CONTENT = eINSTANCE.getContainer_Content();

		/**
		 * The meta object literal for the '<em><b>Add</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTAINER___ADD__ELEMENT = eINSTANCE.getContainer__Add__Element();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTAINER___CHILDREN = eINSTANCE.getContainer__Children();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.svg.impl.SvgImpl <em>Svg</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.svg.impl.SvgImpl
		 * @see org.nasdanika.sdk.runtime.models.svg.impl.SvgPackageImpl#getSvg()
		 * @generated
		 */
		EClass SVG = eINSTANCE.getSvg();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SVG__VERSION = eINSTANCE.getSvg_Version();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SVG__X = eINSTANCE.getSvg_X();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SVG__Y = eINSTANCE.getSvg_Y();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SVG__WIDTH = eINSTANCE.getSvg_Width();

		/**
		 * The meta object literal for the '<em><b>Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SVG__HEIGHT = eINSTANCE.getSvg_Height();

		/**
		 * The meta object literal for the '<em><b>View Box</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SVG__VIEW_BOX = eINSTANCE.getSvg_ViewBox();

		/**
		 * The meta object literal for the '<em><b>Preserve Aspect Ratio</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SVG__PRESERVE_ASPECT_RATIO = eINSTANCE.getSvg_PreserveAspectRatio();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.svg.impl.GImpl <em>G</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.svg.impl.GImpl
		 * @see org.nasdanika.sdk.runtime.models.svg.impl.SvgPackageImpl#getG()
		 * @generated
		 */
		EClass G = eINSTANCE.getG();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.svg.impl.DefsImpl <em>Defs</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.svg.impl.DefsImpl
		 * @see org.nasdanika.sdk.runtime.models.svg.impl.SvgPackageImpl#getDefs()
		 * @generated
		 */
		EClass DEFS = eINSTANCE.getDefs();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.svg.impl.AImpl <em>A</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.svg.impl.AImpl
		 * @see org.nasdanika.sdk.runtime.models.svg.impl.SvgPackageImpl#getA()
		 * @generated
		 */
		EClass A = eINSTANCE.getA();

		/**
		 * The meta object literal for the '<em><b>Href</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute A__HREF = eINSTANCE.getA_Href();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute A__TARGET = eINSTANCE.getA_Target();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.svg.impl.MarkerImpl <em>Marker</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.svg.impl.MarkerImpl
		 * @see org.nasdanika.sdk.runtime.models.svg.impl.SvgPackageImpl#getMarker()
		 * @generated
		 */
		EClass MARKER = eINSTANCE.getMarker();

		/**
		 * The meta object literal for the '<em><b>View Box</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MARKER__VIEW_BOX = eINSTANCE.getMarker_ViewBox();

		/**
		 * The meta object literal for the '<em><b>Ref X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MARKER__REF_X = eINSTANCE.getMarker_RefX();

		/**
		 * The meta object literal for the '<em><b>Ref Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MARKER__REF_Y = eINSTANCE.getMarker_RefY();

		/**
		 * The meta object literal for the '<em><b>Marker Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MARKER__MARKER_WIDTH = eINSTANCE.getMarker_MarkerWidth();

		/**
		 * The meta object literal for the '<em><b>Marker Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MARKER__MARKER_HEIGHT = eINSTANCE.getMarker_MarkerHeight();

		/**
		 * The meta object literal for the '<em><b>Orient</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MARKER__ORIENT = eINSTANCE.getMarker_Orient();

		/**
		 * The meta object literal for the '<em><b>Marker Units</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MARKER__MARKER_UNITS = eINSTANCE.getMarker_MarkerUnits();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.svg.impl.ClipPathImpl <em>Clip Path</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.svg.impl.ClipPathImpl
		 * @see org.nasdanika.sdk.runtime.models.svg.impl.SvgPackageImpl#getClipPath()
		 * @generated
		 */
		EClass CLIP_PATH = eINSTANCE.getClipPath();

		/**
		 * The meta object literal for the '<em><b>Clip Path Units</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLIP_PATH__CLIP_PATH_UNITS = eINSTANCE.getClipPath_ClipPathUnits();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.svg.impl.LinearGradientImpl <em>Linear Gradient</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.svg.impl.LinearGradientImpl
		 * @see org.nasdanika.sdk.runtime.models.svg.impl.SvgPackageImpl#getLinearGradient()
		 * @generated
		 */
		EClass LINEAR_GRADIENT = eINSTANCE.getLinearGradient();

		/**
		 * The meta object literal for the '<em><b>X1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINEAR_GRADIENT__X1 = eINSTANCE.getLinearGradient_X1();

		/**
		 * The meta object literal for the '<em><b>Y1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINEAR_GRADIENT__Y1 = eINSTANCE.getLinearGradient_Y1();

		/**
		 * The meta object literal for the '<em><b>X2</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINEAR_GRADIENT__X2 = eINSTANCE.getLinearGradient_X2();

		/**
		 * The meta object literal for the '<em><b>Y2</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINEAR_GRADIENT__Y2 = eINSTANCE.getLinearGradient_Y2();

		/**
		 * The meta object literal for the '<em><b>Gradient Units</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINEAR_GRADIENT__GRADIENT_UNITS = eINSTANCE.getLinearGradient_GradientUnits();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.svg.impl.StopImpl <em>Stop</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.svg.impl.StopImpl
		 * @see org.nasdanika.sdk.runtime.models.svg.impl.SvgPackageImpl#getStop()
		 * @generated
		 */
		EClass STOP = eINSTANCE.getStop();

		/**
		 * The meta object literal for the '<em><b>Offset</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STOP__OFFSET = eINSTANCE.getStop_Offset();

		/**
		 * The meta object literal for the '<em><b>Stop Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STOP__STOP_COLOR = eINSTANCE.getStop_StopColor();

		/**
		 * The meta object literal for the '<em><b>Stop Opacity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STOP__STOP_OPACITY = eINSTANCE.getStop_StopOpacity();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.svg.impl.TitleImpl <em>Title</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.svg.impl.TitleImpl
		 * @see org.nasdanika.sdk.runtime.models.svg.impl.SvgPackageImpl#getTitle()
		 * @generated
		 */
		EClass TITLE = eINSTANCE.getTitle();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TITLE__VALUE = eINSTANCE.getTitle_Value();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.svg.impl.DescImpl <em>Desc</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.svg.impl.DescImpl
		 * @see org.nasdanika.sdk.runtime.models.svg.impl.SvgPackageImpl#getDesc()
		 * @generated
		 */
		EClass DESC = eINSTANCE.getDesc();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DESC__VALUE = eINSTANCE.getDesc_Value();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.svg.impl.StyleImpl <em>Style</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.svg.impl.StyleImpl
		 * @see org.nasdanika.sdk.runtime.models.svg.impl.SvgPackageImpl#getStyle()
		 * @generated
		 */
		EClass STYLE = eINSTANCE.getStyle();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STYLE__VALUE = eINSTANCE.getStyle_Value();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STYLE__TYPE = eINSTANCE.getStyle_Type();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.svg.impl.ShapeImpl <em>Shape</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.svg.impl.ShapeImpl
		 * @see org.nasdanika.sdk.runtime.models.svg.impl.SvgPackageImpl#getShape()
		 * @generated
		 */
		EClass SHAPE = eINSTANCE.getShape();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.svg.impl.RectImpl <em>Rect</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.svg.impl.RectImpl
		 * @see org.nasdanika.sdk.runtime.models.svg.impl.SvgPackageImpl#getRect()
		 * @generated
		 */
		EClass RECT = eINSTANCE.getRect();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECT__X = eINSTANCE.getRect_X();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECT__Y = eINSTANCE.getRect_Y();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECT__WIDTH = eINSTANCE.getRect_Width();

		/**
		 * The meta object literal for the '<em><b>Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECT__HEIGHT = eINSTANCE.getRect_Height();

		/**
		 * The meta object literal for the '<em><b>Rx</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECT__RX = eINSTANCE.getRect_Rx();

		/**
		 * The meta object literal for the '<em><b>Ry</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECT__RY = eINSTANCE.getRect_Ry();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.svg.impl.CircleImpl <em>Circle</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.svg.impl.CircleImpl
		 * @see org.nasdanika.sdk.runtime.models.svg.impl.SvgPackageImpl#getCircle()
		 * @generated
		 */
		EClass CIRCLE = eINSTANCE.getCircle();

		/**
		 * The meta object literal for the '<em><b>Cx</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CIRCLE__CX = eINSTANCE.getCircle_Cx();

		/**
		 * The meta object literal for the '<em><b>Cy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CIRCLE__CY = eINSTANCE.getCircle_Cy();

		/**
		 * The meta object literal for the '<em><b>R</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CIRCLE__R = eINSTANCE.getCircle_R();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.svg.impl.EllipseImpl <em>Ellipse</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.svg.impl.EllipseImpl
		 * @see org.nasdanika.sdk.runtime.models.svg.impl.SvgPackageImpl#getEllipse()
		 * @generated
		 */
		EClass ELLIPSE = eINSTANCE.getEllipse();

		/**
		 * The meta object literal for the '<em><b>Cx</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELLIPSE__CX = eINSTANCE.getEllipse_Cx();

		/**
		 * The meta object literal for the '<em><b>Cy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELLIPSE__CY = eINSTANCE.getEllipse_Cy();

		/**
		 * The meta object literal for the '<em><b>Rx</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELLIPSE__RX = eINSTANCE.getEllipse_Rx();

		/**
		 * The meta object literal for the '<em><b>Ry</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELLIPSE__RY = eINSTANCE.getEllipse_Ry();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.svg.impl.LineImpl <em>Line</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.svg.impl.LineImpl
		 * @see org.nasdanika.sdk.runtime.models.svg.impl.SvgPackageImpl#getLine()
		 * @generated
		 */
		EClass LINE = eINSTANCE.getLine();

		/**
		 * The meta object literal for the '<em><b>X1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINE__X1 = eINSTANCE.getLine_X1();

		/**
		 * The meta object literal for the '<em><b>Y1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINE__Y1 = eINSTANCE.getLine_Y1();

		/**
		 * The meta object literal for the '<em><b>X2</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINE__X2 = eINSTANCE.getLine_X2();

		/**
		 * The meta object literal for the '<em><b>Y2</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINE__Y2 = eINSTANCE.getLine_Y2();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.svg.impl.PolylineImpl <em>Polyline</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.svg.impl.PolylineImpl
		 * @see org.nasdanika.sdk.runtime.models.svg.impl.SvgPackageImpl#getPolyline()
		 * @generated
		 */
		EClass POLYLINE = eINSTANCE.getPolyline();

		/**
		 * The meta object literal for the '<em><b>Points</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POLYLINE__POINTS = eINSTANCE.getPolyline_Points();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.svg.impl.PolygonImpl <em>Polygon</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.svg.impl.PolygonImpl
		 * @see org.nasdanika.sdk.runtime.models.svg.impl.SvgPackageImpl#getPolygon()
		 * @generated
		 */
		EClass POLYGON = eINSTANCE.getPolygon();

		/**
		 * The meta object literal for the '<em><b>Points</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POLYGON__POINTS = eINSTANCE.getPolygon_Points();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.svg.impl.PathImpl <em>Path</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.svg.impl.PathImpl
		 * @see org.nasdanika.sdk.runtime.models.svg.impl.SvgPackageImpl#getPath()
		 * @generated
		 */
		EClass PATH = eINSTANCE.getPath();

		/**
		 * The meta object literal for the '<em><b>D</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATH__D = eINSTANCE.getPath_D();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.svg.impl.ImageImpl <em>Image</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.svg.impl.ImageImpl
		 * @see org.nasdanika.sdk.runtime.models.svg.impl.SvgPackageImpl#getImage()
		 * @generated
		 */
		EClass IMAGE = eINSTANCE.getImage();

		/**
		 * The meta object literal for the '<em><b>Href</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMAGE__HREF = eINSTANCE.getImage_Href();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMAGE__X = eINSTANCE.getImage_X();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMAGE__Y = eINSTANCE.getImage_Y();

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
		 * The meta object literal for the '<em><b>Preserve Aspect Ratio</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMAGE__PRESERVE_ASPECT_RATIO = eINSTANCE.getImage_PreserveAspectRatio();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.svg.impl.UseImpl <em>Use</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.svg.impl.UseImpl
		 * @see org.nasdanika.sdk.runtime.models.svg.impl.SvgPackageImpl#getUse()
		 * @generated
		 */
		EClass USE = eINSTANCE.getUse();

		/**
		 * The meta object literal for the '<em><b>Href</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USE__HREF = eINSTANCE.getUse_Href();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USE__X = eINSTANCE.getUse_X();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USE__Y = eINSTANCE.getUse_Y();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.svg.impl.TextContentImpl <em>Text Content</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.svg.impl.TextContentImpl
		 * @see org.nasdanika.sdk.runtime.models.svg.impl.SvgPackageImpl#getTextContent()
		 * @generated
		 */
		EClass TEXT_CONTENT = eINSTANCE.getTextContent();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_CONTENT__MIXED = eINSTANCE.getTextContent_Mixed();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_CONTENT__ANY = eINSTANCE.getTextContent_Any();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_CONTENT__X = eINSTANCE.getTextContent_X();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_CONTENT__Y = eINSTANCE.getTextContent_Y();

		/**
		 * The meta object literal for the '<em><b>Dx</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_CONTENT__DX = eINSTANCE.getTextContent_Dx();

		/**
		 * The meta object literal for the '<em><b>Dy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_CONTENT__DY = eINSTANCE.getTextContent_Dy();

		/**
		 * The meta object literal for the '<em><b>Add Text</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TEXT_CONTENT___ADD_TEXT__STRING = eINSTANCE.getTextContent__AddText__String();

		/**
		 * The meta object literal for the '<em><b>Add Span</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TEXT_CONTENT___ADD_SPAN__TSPAN = eINSTANCE.getTextContent__AddSpan__TSpan();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TEXT_CONTENT___TEXT = eINSTANCE.getTextContent__Text();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.svg.impl.TextImpl <em>Text</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.svg.impl.TextImpl
		 * @see org.nasdanika.sdk.runtime.models.svg.impl.SvgPackageImpl#getText()
		 * @generated
		 */
		EClass TEXT = eINSTANCE.getText();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.svg.impl.TSpanImpl <em>TSpan</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.svg.impl.TSpanImpl
		 * @see org.nasdanika.sdk.runtime.models.svg.impl.SvgPackageImpl#getTSpan()
		 * @generated
		 */
		EClass TSPAN = eINSTANCE.getTSpan();

	}

} //SvgPackage
