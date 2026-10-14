/**
 */
package org.nasdanika.sdk.runtime.models.react.flow;

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
 * @see org.nasdanika.sdk.runtime.models.react.flow.FlowFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel modelDirectory='/flow/src-gen' featureDelegation='Dynamic' complianceLevel='25' suppressGenModelAnnotations='false' copyrightFields='false' operationReflection='true' importOrganizing='true' basePackage='org.nasdanika.sdk.runtime.models.react'"
 *        annotation="http://www.eclipse.org/emf/2011/Xcore Ecore='http://www.eclipse.org/emf/2002/Ecore' GenModel='http://www.eclipse.org/emf/2002/GenModel' React='urn:org.nasdanika:react'"
 * @generated
 */
public interface FlowPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "flow";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "https://runtime.sdk.nasdanika.org/models/react/flow";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.nasdanika.sdk.runtime.models.react.flow";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FlowPackage eINSTANCE = org.nasdanika.sdk.runtime.models.react.flow.impl.FlowPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.react.flow.impl.XYPositionImpl <em>XY Position</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.react.flow.impl.XYPositionImpl
	 * @see org.nasdanika.sdk.runtime.models.react.flow.impl.FlowPackageImpl#getXYPosition()
	 * @generated
	 */
	int XY_POSITION = 0;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XY_POSITION__X = 0;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XY_POSITION__Y = 1;

	/**
	 * The number of structural features of the '<em>XY Position</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XY_POSITION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>XY Position</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XY_POSITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.react.flow.impl.FlowDataImpl <em>Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.react.flow.impl.FlowDataImpl
	 * @see org.nasdanika.sdk.runtime.models.react.flow.impl.FlowPackageImpl#getFlowData()
	 * @generated
	 */
	int FLOW_DATA = 1;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_DATA__LABEL = 0;

	/**
	 * The feature id for the '<em><b>Label Node</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_DATA__LABEL_NODE = 1;

	/**
	 * The feature id for the '<em><b>Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_DATA__VALUES = 2;

	/**
	 * The number of structural features of the '<em>Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_DATA_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_DATA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.react.flow.impl.DataValueImpl <em>Data Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.react.flow.impl.DataValueImpl
	 * @see org.nasdanika.sdk.runtime.models.react.flow.impl.FlowPackageImpl#getDataValue()
	 * @generated
	 */
	int DATA_VALUE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_VALUE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_VALUE__VALUE = 1;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_VALUE__EXPRESSION = 2;

	/**
	 * The number of structural features of the '<em>Data Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_VALUE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Data Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_VALUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.react.flow.impl.FlowNodeImpl <em>Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.react.flow.impl.FlowNodeImpl
	 * @see org.nasdanika.sdk.runtime.models.react.flow.impl.FlowPackageImpl#getFlowNode()
	 * @generated
	 */
	int FLOW_NODE = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_NODE__ID = 0;

	/**
	 * The feature id for the '<em><b>Custom Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_NODE__CUSTOM_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Node Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_NODE__NODE_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_NODE__POSITION = 3;

	/**
	 * The feature id for the '<em><b>Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_NODE__DATA = 4;

	/**
	 * The feature id for the '<em><b>Source Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_NODE__SOURCE_POSITION = 5;

	/**
	 * The feature id for the '<em><b>Target Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_NODE__TARGET_POSITION = 6;

	/**
	 * The feature id for the '<em><b>Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_NODE__HIDDEN = 7;

	/**
	 * The feature id for the '<em><b>Draggable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_NODE__DRAGGABLE = 8;

	/**
	 * The feature id for the '<em><b>Selectable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_NODE__SELECTABLE = 9;

	/**
	 * The feature id for the '<em><b>Connectable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_NODE__CONNECTABLE = 10;

	/**
	 * The feature id for the '<em><b>Deletable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_NODE__DELETABLE = 11;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_NODE__PARENT = 12;

	/**
	 * The feature id for the '<em><b>Extent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_NODE__EXTENT = 13;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_NODE__WIDTH = 14;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_NODE__HEIGHT = 15;

	/**
	 * The feature id for the '<em><b>ZIndex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_NODE__ZINDEX = 16;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_NODE__CLASS_NAME = 17;

	/**
	 * The feature id for the '<em><b>Style</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_NODE__STYLE = 18;

	/**
	 * The number of structural features of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_NODE_FEATURE_COUNT = 19;

	/**
	 * The number of operations of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_NODE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.react.flow.impl.EdgeMarkerImpl <em>Edge Marker</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.react.flow.impl.EdgeMarkerImpl
	 * @see org.nasdanika.sdk.runtime.models.react.flow.impl.FlowPackageImpl#getEdgeMarker()
	 * @generated
	 */
	int EDGE_MARKER = 4;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_MARKER__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_MARKER__COLOR = 1;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_MARKER__WIDTH = 2;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_MARKER__HEIGHT = 3;

	/**
	 * The feature id for the '<em><b>Stroke Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_MARKER__STROKE_WIDTH = 4;

	/**
	 * The number of structural features of the '<em>Edge Marker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_MARKER_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Edge Marker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_MARKER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.react.flow.impl.FlowEdgeImpl <em>Edge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.react.flow.impl.FlowEdgeImpl
	 * @see org.nasdanika.sdk.runtime.models.react.flow.impl.FlowPackageImpl#getFlowEdge()
	 * @generated
	 */
	int FLOW_EDGE = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_EDGE__ID = 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_EDGE__SOURCE = 1;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_EDGE__TARGET = 2;

	/**
	 * The feature id for the '<em><b>Source Handle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_EDGE__SOURCE_HANDLE = 3;

	/**
	 * The feature id for the '<em><b>Target Handle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_EDGE__TARGET_HANDLE = 4;

	/**
	 * The feature id for the '<em><b>Edge Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_EDGE__EDGE_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Custom Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_EDGE__CUSTOM_TYPE = 6;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_EDGE__LABEL = 7;

	/**
	 * The feature id for the '<em><b>Label Node</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_EDGE__LABEL_NODE = 8;

	/**
	 * The feature id for the '<em><b>Animated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_EDGE__ANIMATED = 9;

	/**
	 * The feature id for the '<em><b>Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_EDGE__HIDDEN = 10;

	/**
	 * The feature id for the '<em><b>Deletable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_EDGE__DELETABLE = 11;

	/**
	 * The feature id for the '<em><b>Selectable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_EDGE__SELECTABLE = 12;

	/**
	 * The feature id for the '<em><b>Reconnectable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_EDGE__RECONNECTABLE = 13;

	/**
	 * The feature id for the '<em><b>Marker Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_EDGE__MARKER_START = 14;

	/**
	 * The feature id for the '<em><b>Marker End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_EDGE__MARKER_END = 15;

	/**
	 * The feature id for the '<em><b>Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_EDGE__DATA = 16;

	/**
	 * The feature id for the '<em><b>ZIndex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_EDGE__ZINDEX = 17;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_EDGE__CLASS_NAME = 18;

	/**
	 * The feature id for the '<em><b>Style</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_EDGE__STYLE = 19;

	/**
	 * The number of structural features of the '<em>Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_EDGE_FEATURE_COUNT = 20;

	/**
	 * The number of operations of the '<em>Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_EDGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.react.flow.impl.EdgeOptionsImpl <em>Edge Options</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.react.flow.impl.EdgeOptionsImpl
	 * @see org.nasdanika.sdk.runtime.models.react.flow.impl.FlowPackageImpl#getEdgeOptions()
	 * @generated
	 */
	int EDGE_OPTIONS = 6;

	/**
	 * The feature id for the '<em><b>Edge Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_OPTIONS__EDGE_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Custom Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_OPTIONS__CUSTOM_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Animated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_OPTIONS__ANIMATED = 2;

	/**
	 * The feature id for the '<em><b>Marker End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_OPTIONS__MARKER_END = 3;

	/**
	 * The feature id for the '<em><b>Style</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_OPTIONS__STYLE = 4;

	/**
	 * The number of structural features of the '<em>Edge Options</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_OPTIONS_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Edge Options</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_OPTIONS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.react.flow.impl.ProOptionsImpl <em>Pro Options</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.react.flow.impl.ProOptionsImpl
	 * @see org.nasdanika.sdk.runtime.models.react.flow.impl.FlowPackageImpl#getProOptions()
	 * @generated
	 */
	int PRO_OPTIONS = 7;

	/**
	 * The feature id for the '<em><b>Hide Attribution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRO_OPTIONS__HIDE_ATTRIBUTION = 0;

	/**
	 * The number of structural features of the '<em>Pro Options</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRO_OPTIONS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Pro Options</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRO_OPTIONS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.react.flow.impl.FlowTypesImpl <em>Types</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.react.flow.impl.FlowTypesImpl
	 * @see org.nasdanika.sdk.runtime.models.react.flow.impl.FlowPackageImpl#getFlowTypes()
	 * @generated
	 */
	int FLOW_TYPES = 8;

	/**
	 * The feature id for the '<em><b>Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_TYPES__TYPES = 0;

	/**
	 * The number of structural features of the '<em>Types</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_TYPES_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Types</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_TYPES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.react.flow.impl.FlowTypeImpl <em>Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.react.flow.impl.FlowTypeImpl
	 * @see org.nasdanika.sdk.runtime.models.react.flow.impl.FlowPackageImpl#getFlowType()
	 * @generated
	 */
	int FLOW_TYPE = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_TYPE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Component</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_TYPE__COMPONENT = 1;

	/**
	 * The number of structural features of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.react.flow.impl.FlowComponentImpl <em>Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.react.flow.impl.FlowComponentImpl
	 * @see org.nasdanika.sdk.runtime.models.react.flow.impl.FlowPackageImpl#getFlowComponent()
	 * @generated
	 */
	int FLOW_COMPONENT = 10;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_COMPONENT__ID = ReactPackage.LIBRARY_COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_COMPONENT__DOCUMENTATION = ReactPackage.LIBRARY_COMPONENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_COMPONENT__DOC_REF = ReactPackage.LIBRARY_COMPONENT__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_COMPONENT__DOC_FORMAT = ReactPackage.LIBRARY_COMPONENT__DOC_FORMAT;

	/**
	 * The feature id for the '<em><b>Doc Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_COMPONENT__DOC_CONTENTS = ReactPackage.LIBRARY_COMPONENT__DOC_CONTENTS;

	/**
	 * The feature id for the '<em><b>Doc Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_COMPONENT__DOC_SECTIONS = ReactPackage.LIBRARY_COMPONENT__DOC_SECTIONS;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_COMPONENT__MARKERS = ReactPackage.LIBRARY_COMPONENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_COMPONENT__ICON = ReactPackage.LIBRARY_COMPONENT__ICON;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_COMPONENT__URIS = ReactPackage.LIBRARY_COMPONENT__URIS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_COMPONENT__NAME = ReactPackage.LIBRARY_COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_COMPONENT__CHILDREN = ReactPackage.LIBRARY_COMPONENT__CHILDREN;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_COMPONENT__ATTRIBUTES = ReactPackage.LIBRARY_COMPONENT__ATTRIBUTES;

	/**
	 * The number of structural features of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_COMPONENT_FEATURE_COUNT = ReactPackage.LIBRARY_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_COMPONENT___COLLECT__OBJECT_EREFERENCE_ELIST = ReactPackage.LIBRARY_COMPONENT___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_COMPONENT___GET_REFERRERS__EREFERENCE = ReactPackage.LIBRARY_COMPONENT___GET_REFERRERS__EREFERENCE;

	/**
	 * The number of operations of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_COMPONENT_OPERATION_COUNT = ReactPackage.LIBRARY_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.react.flow.impl.ReactFlowProviderImpl <em>React Flow Provider</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.react.flow.impl.ReactFlowProviderImpl
	 * @see org.nasdanika.sdk.runtime.models.react.flow.impl.FlowPackageImpl#getReactFlowProvider()
	 * @generated
	 */
	int REACT_FLOW_PROVIDER = 11;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACT_FLOW_PROVIDER__ID = FLOW_COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACT_FLOW_PROVIDER__DOCUMENTATION = FLOW_COMPONENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACT_FLOW_PROVIDER__DOC_REF = FLOW_COMPONENT__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACT_FLOW_PROVIDER__DOC_FORMAT = FLOW_COMPONENT__DOC_FORMAT;

	/**
	 * The feature id for the '<em><b>Doc Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACT_FLOW_PROVIDER__DOC_CONTENTS = FLOW_COMPONENT__DOC_CONTENTS;

	/**
	 * The feature id for the '<em><b>Doc Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACT_FLOW_PROVIDER__DOC_SECTIONS = FLOW_COMPONENT__DOC_SECTIONS;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACT_FLOW_PROVIDER__MARKERS = FLOW_COMPONENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACT_FLOW_PROVIDER__ICON = FLOW_COMPONENT__ICON;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACT_FLOW_PROVIDER__URIS = FLOW_COMPONENT__URIS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACT_FLOW_PROVIDER__NAME = FLOW_COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACT_FLOW_PROVIDER__CHILDREN = FLOW_COMPONENT__CHILDREN;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACT_FLOW_PROVIDER__ATTRIBUTES = FLOW_COMPONENT__ATTRIBUTES;

	/**
	 * The number of structural features of the '<em>React Flow Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACT_FLOW_PROVIDER_FEATURE_COUNT = FLOW_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACT_FLOW_PROVIDER___COLLECT__OBJECT_EREFERENCE_ELIST = FLOW_COMPONENT___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACT_FLOW_PROVIDER___GET_REFERRERS__EREFERENCE = FLOW_COMPONENT___GET_REFERRERS__EREFERENCE;

	/**
	 * The number of operations of the '<em>React Flow Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACT_FLOW_PROVIDER_OPERATION_COUNT = FLOW_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.react.flow.impl.ReactFlowImpl <em>React Flow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.react.flow.impl.ReactFlowImpl
	 * @see org.nasdanika.sdk.runtime.models.react.flow.impl.FlowPackageImpl#getReactFlow()
	 * @generated
	 */
	int REACT_FLOW = 12;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACT_FLOW__ID = FLOW_COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACT_FLOW__DOCUMENTATION = FLOW_COMPONENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACT_FLOW__DOC_REF = FLOW_COMPONENT__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACT_FLOW__DOC_FORMAT = FLOW_COMPONENT__DOC_FORMAT;

	/**
	 * The feature id for the '<em><b>Doc Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACT_FLOW__DOC_CONTENTS = FLOW_COMPONENT__DOC_CONTENTS;

	/**
	 * The feature id for the '<em><b>Doc Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACT_FLOW__DOC_SECTIONS = FLOW_COMPONENT__DOC_SECTIONS;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACT_FLOW__MARKERS = FLOW_COMPONENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACT_FLOW__ICON = FLOW_COMPONENT__ICON;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACT_FLOW__URIS = FLOW_COMPONENT__URIS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACT_FLOW__NAME = FLOW_COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACT_FLOW__CHILDREN = FLOW_COMPONENT__CHILDREN;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACT_FLOW__ATTRIBUTES = FLOW_COMPONENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACT_FLOW__NODES = FLOW_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Edges</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACT_FLOW__EDGES = FLOW_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Node Types</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACT_FLOW__NODE_TYPES = FLOW_COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Edge Types</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACT_FLOW__EDGE_TYPES = FLOW_COMPONENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Fit View</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACT_FLOW__FIT_VIEW = FLOW_COMPONENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Min Zoom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACT_FLOW__MIN_ZOOM = FLOW_COMPONENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Max Zoom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACT_FLOW__MAX_ZOOM = FLOW_COMPONENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Nodes Draggable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACT_FLOW__NODES_DRAGGABLE = FLOW_COMPONENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Nodes Connectable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACT_FLOW__NODES_CONNECTABLE = FLOW_COMPONENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Elements Selectable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACT_FLOW__ELEMENTS_SELECTABLE = FLOW_COMPONENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Pan On Drag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACT_FLOW__PAN_ON_DRAG = FLOW_COMPONENT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Zoom On Scroll</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACT_FLOW__ZOOM_ON_SCROLL = FLOW_COMPONENT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Zoom On Double Click</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACT_FLOW__ZOOM_ON_DOUBLE_CLICK = FLOW_COMPONENT_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Snap To Grid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACT_FLOW__SNAP_TO_GRID = FLOW_COMPONENT_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Snap Grid</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACT_FLOW__SNAP_GRID = FLOW_COMPONENT_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Color Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACT_FLOW__COLOR_MODE = FLOW_COMPONENT_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Delete Key Code</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACT_FLOW__DELETE_KEY_CODE = FLOW_COMPONENT_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Connection Line Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACT_FLOW__CONNECTION_LINE_TYPE = FLOW_COMPONENT_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Default Edge Options</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACT_FLOW__DEFAULT_EDGE_OPTIONS = FLOW_COMPONENT_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Pro Options</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACT_FLOW__PRO_OPTIONS = FLOW_COMPONENT_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Background</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACT_FLOW__BACKGROUND = FLOW_COMPONENT_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>Controls</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACT_FLOW__CONTROLS = FLOW_COMPONENT_FEATURE_COUNT + 21;

	/**
	 * The feature id for the '<em><b>Mini Map</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACT_FLOW__MINI_MAP = FLOW_COMPONENT_FEATURE_COUNT + 22;

	/**
	 * The feature id for the '<em><b>Panels</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACT_FLOW__PANELS = FLOW_COMPONENT_FEATURE_COUNT + 23;

	/**
	 * The number of structural features of the '<em>React Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACT_FLOW_FEATURE_COUNT = FLOW_COMPONENT_FEATURE_COUNT + 24;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACT_FLOW___COLLECT__OBJECT_EREFERENCE_ELIST = FLOW_COMPONENT___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACT_FLOW___GET_REFERRERS__EREFERENCE = FLOW_COMPONENT___GET_REFERRERS__EREFERENCE;

	/**
	 * The number of operations of the '<em>React Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACT_FLOW_OPERATION_COUNT = FLOW_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.react.flow.impl.BackgroundImpl <em>Background</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.react.flow.impl.BackgroundImpl
	 * @see org.nasdanika.sdk.runtime.models.react.flow.impl.FlowPackageImpl#getBackground()
	 * @generated
	 */
	int BACKGROUND = 13;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACKGROUND__ID = FLOW_COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACKGROUND__DOCUMENTATION = FLOW_COMPONENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACKGROUND__DOC_REF = FLOW_COMPONENT__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACKGROUND__DOC_FORMAT = FLOW_COMPONENT__DOC_FORMAT;

	/**
	 * The feature id for the '<em><b>Doc Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACKGROUND__DOC_CONTENTS = FLOW_COMPONENT__DOC_CONTENTS;

	/**
	 * The feature id for the '<em><b>Doc Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACKGROUND__DOC_SECTIONS = FLOW_COMPONENT__DOC_SECTIONS;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACKGROUND__MARKERS = FLOW_COMPONENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACKGROUND__ICON = FLOW_COMPONENT__ICON;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACKGROUND__URIS = FLOW_COMPONENT__URIS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACKGROUND__NAME = FLOW_COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACKGROUND__CHILDREN = FLOW_COMPONENT__CHILDREN;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACKGROUND__ATTRIBUTES = FLOW_COMPONENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Variant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACKGROUND__VARIANT = FLOW_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Gap</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACKGROUND__GAP = FLOW_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACKGROUND__SIZE = FLOW_COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Line Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACKGROUND__LINE_WIDTH = FLOW_COMPONENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACKGROUND__COLOR = FLOW_COMPONENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Bg Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACKGROUND__BG_COLOR = FLOW_COMPONENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Background Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACKGROUND__BACKGROUND_ID = FLOW_COMPONENT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Background</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACKGROUND_FEATURE_COUNT = FLOW_COMPONENT_FEATURE_COUNT + 7;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACKGROUND___COLLECT__OBJECT_EREFERENCE_ELIST = FLOW_COMPONENT___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACKGROUND___GET_REFERRERS__EREFERENCE = FLOW_COMPONENT___GET_REFERRERS__EREFERENCE;

	/**
	 * The number of operations of the '<em>Background</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACKGROUND_OPERATION_COUNT = FLOW_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.react.flow.impl.ControlsImpl <em>Controls</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.react.flow.impl.ControlsImpl
	 * @see org.nasdanika.sdk.runtime.models.react.flow.impl.FlowPackageImpl#getControls()
	 * @generated
	 */
	int CONTROLS = 14;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLS__ID = FLOW_COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLS__DOCUMENTATION = FLOW_COMPONENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLS__DOC_REF = FLOW_COMPONENT__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLS__DOC_FORMAT = FLOW_COMPONENT__DOC_FORMAT;

	/**
	 * The feature id for the '<em><b>Doc Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLS__DOC_CONTENTS = FLOW_COMPONENT__DOC_CONTENTS;

	/**
	 * The feature id for the '<em><b>Doc Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLS__DOC_SECTIONS = FLOW_COMPONENT__DOC_SECTIONS;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLS__MARKERS = FLOW_COMPONENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLS__ICON = FLOW_COMPONENT__ICON;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLS__URIS = FLOW_COMPONENT__URIS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLS__NAME = FLOW_COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLS__CHILDREN = FLOW_COMPONENT__CHILDREN;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLS__ATTRIBUTES = FLOW_COMPONENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Show Zoom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLS__SHOW_ZOOM = FLOW_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Show Fit View</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLS__SHOW_FIT_VIEW = FLOW_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Show Interactive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLS__SHOW_INTERACTIVE = FLOW_COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLS__POSITION = FLOW_COMPONENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Orientation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLS__ORIENTATION = FLOW_COMPONENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Controls</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLS_FEATURE_COUNT = FLOW_COMPONENT_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLS___COLLECT__OBJECT_EREFERENCE_ELIST = FLOW_COMPONENT___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLS___GET_REFERRERS__EREFERENCE = FLOW_COMPONENT___GET_REFERRERS__EREFERENCE;

	/**
	 * The number of operations of the '<em>Controls</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLS_OPERATION_COUNT = FLOW_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.react.flow.impl.MiniMapImpl <em>Mini Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.react.flow.impl.MiniMapImpl
	 * @see org.nasdanika.sdk.runtime.models.react.flow.impl.FlowPackageImpl#getMiniMap()
	 * @generated
	 */
	int MINI_MAP = 15;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINI_MAP__ID = FLOW_COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINI_MAP__DOCUMENTATION = FLOW_COMPONENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINI_MAP__DOC_REF = FLOW_COMPONENT__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINI_MAP__DOC_FORMAT = FLOW_COMPONENT__DOC_FORMAT;

	/**
	 * The feature id for the '<em><b>Doc Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINI_MAP__DOC_CONTENTS = FLOW_COMPONENT__DOC_CONTENTS;

	/**
	 * The feature id for the '<em><b>Doc Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINI_MAP__DOC_SECTIONS = FLOW_COMPONENT__DOC_SECTIONS;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINI_MAP__MARKERS = FLOW_COMPONENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINI_MAP__ICON = FLOW_COMPONENT__ICON;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINI_MAP__URIS = FLOW_COMPONENT__URIS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINI_MAP__NAME = FLOW_COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINI_MAP__CHILDREN = FLOW_COMPONENT__CHILDREN;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINI_MAP__ATTRIBUTES = FLOW_COMPONENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINI_MAP__POSITION = FLOW_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Node Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINI_MAP__NODE_COLOR = FLOW_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Node Stroke Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINI_MAP__NODE_STROKE_COLOR = FLOW_COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Mask Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINI_MAP__MASK_COLOR = FLOW_COMPONENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Bg Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINI_MAP__BG_COLOR = FLOW_COMPONENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Pannable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINI_MAP__PANNABLE = FLOW_COMPONENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Zoomable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINI_MAP__ZOOMABLE = FLOW_COMPONENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Aria Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINI_MAP__ARIA_LABEL = FLOW_COMPONENT_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Mini Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINI_MAP_FEATURE_COUNT = FLOW_COMPONENT_FEATURE_COUNT + 8;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINI_MAP___COLLECT__OBJECT_EREFERENCE_ELIST = FLOW_COMPONENT___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINI_MAP___GET_REFERRERS__EREFERENCE = FLOW_COMPONENT___GET_REFERRERS__EREFERENCE;

	/**
	 * The number of operations of the '<em>Mini Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINI_MAP_OPERATION_COUNT = FLOW_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.react.flow.impl.PanelImpl <em>Panel</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.react.flow.impl.PanelImpl
	 * @see org.nasdanika.sdk.runtime.models.react.flow.impl.FlowPackageImpl#getPanel()
	 * @generated
	 */
	int PANEL = 16;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANEL__ID = FLOW_COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANEL__DOCUMENTATION = FLOW_COMPONENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANEL__DOC_REF = FLOW_COMPONENT__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANEL__DOC_FORMAT = FLOW_COMPONENT__DOC_FORMAT;

	/**
	 * The feature id for the '<em><b>Doc Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANEL__DOC_CONTENTS = FLOW_COMPONENT__DOC_CONTENTS;

	/**
	 * The feature id for the '<em><b>Doc Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANEL__DOC_SECTIONS = FLOW_COMPONENT__DOC_SECTIONS;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANEL__MARKERS = FLOW_COMPONENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANEL__ICON = FLOW_COMPONENT__ICON;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANEL__URIS = FLOW_COMPONENT__URIS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANEL__NAME = FLOW_COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANEL__CHILDREN = FLOW_COMPONENT__CHILDREN;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANEL__ATTRIBUTES = FLOW_COMPONENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANEL__POSITION = FLOW_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Panel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANEL_FEATURE_COUNT = FLOW_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANEL___COLLECT__OBJECT_EREFERENCE_ELIST = FLOW_COMPONENT___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANEL___GET_REFERRERS__EREFERENCE = FLOW_COMPONENT___GET_REFERRERS__EREFERENCE;

	/**
	 * The number of operations of the '<em>Panel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANEL_OPERATION_COUNT = FLOW_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.react.flow.impl.HandleImpl <em>Handle</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.react.flow.impl.HandleImpl
	 * @see org.nasdanika.sdk.runtime.models.react.flow.impl.FlowPackageImpl#getHandle()
	 * @generated
	 */
	int HANDLE = 17;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HANDLE__ID = FLOW_COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HANDLE__DOCUMENTATION = FLOW_COMPONENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HANDLE__DOC_REF = FLOW_COMPONENT__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HANDLE__DOC_FORMAT = FLOW_COMPONENT__DOC_FORMAT;

	/**
	 * The feature id for the '<em><b>Doc Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HANDLE__DOC_CONTENTS = FLOW_COMPONENT__DOC_CONTENTS;

	/**
	 * The feature id for the '<em><b>Doc Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HANDLE__DOC_SECTIONS = FLOW_COMPONENT__DOC_SECTIONS;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HANDLE__MARKERS = FLOW_COMPONENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HANDLE__ICON = FLOW_COMPONENT__ICON;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HANDLE__URIS = FLOW_COMPONENT__URIS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HANDLE__NAME = FLOW_COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HANDLE__CHILDREN = FLOW_COMPONENT__CHILDREN;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HANDLE__ATTRIBUTES = FLOW_COMPONENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Handle Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HANDLE__HANDLE_TYPE = FLOW_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HANDLE__POSITION = FLOW_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Handle Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HANDLE__HANDLE_ID = FLOW_COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Is Connectable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HANDLE__IS_CONNECTABLE = FLOW_COMPONENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Handle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HANDLE_FEATURE_COUNT = FLOW_COMPONENT_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HANDLE___COLLECT__OBJECT_EREFERENCE_ELIST = FLOW_COMPONENT___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HANDLE___GET_REFERRERS__EREFERENCE = FLOW_COMPONENT___GET_REFERRERS__EREFERENCE;

	/**
	 * The number of operations of the '<em>Handle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HANDLE_OPERATION_COUNT = FLOW_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.react.flow.impl.NodeToolbarImpl <em>Node Toolbar</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.react.flow.impl.NodeToolbarImpl
	 * @see org.nasdanika.sdk.runtime.models.react.flow.impl.FlowPackageImpl#getNodeToolbar()
	 * @generated
	 */
	int NODE_TOOLBAR = 18;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_TOOLBAR__ID = FLOW_COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_TOOLBAR__DOCUMENTATION = FLOW_COMPONENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_TOOLBAR__DOC_REF = FLOW_COMPONENT__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_TOOLBAR__DOC_FORMAT = FLOW_COMPONENT__DOC_FORMAT;

	/**
	 * The feature id for the '<em><b>Doc Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_TOOLBAR__DOC_CONTENTS = FLOW_COMPONENT__DOC_CONTENTS;

	/**
	 * The feature id for the '<em><b>Doc Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_TOOLBAR__DOC_SECTIONS = FLOW_COMPONENT__DOC_SECTIONS;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_TOOLBAR__MARKERS = FLOW_COMPONENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_TOOLBAR__ICON = FLOW_COMPONENT__ICON;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_TOOLBAR__URIS = FLOW_COMPONENT__URIS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_TOOLBAR__NAME = FLOW_COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_TOOLBAR__CHILDREN = FLOW_COMPONENT__CHILDREN;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_TOOLBAR__ATTRIBUTES = FLOW_COMPONENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_TOOLBAR__POSITION = FLOW_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_TOOLBAR__IS_VISIBLE = FLOW_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_TOOLBAR__OFFSET = FLOW_COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Align</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_TOOLBAR__ALIGN = FLOW_COMPONENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Node Toolbar</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_TOOLBAR_FEATURE_COUNT = FLOW_COMPONENT_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_TOOLBAR___COLLECT__OBJECT_EREFERENCE_ELIST = FLOW_COMPONENT___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_TOOLBAR___GET_REFERRERS__EREFERENCE = FLOW_COMPONENT___GET_REFERRERS__EREFERENCE;

	/**
	 * The number of operations of the '<em>Node Toolbar</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_TOOLBAR_OPERATION_COUNT = FLOW_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.react.flow.impl.NodeResizerImpl <em>Node Resizer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.react.flow.impl.NodeResizerImpl
	 * @see org.nasdanika.sdk.runtime.models.react.flow.impl.FlowPackageImpl#getNodeResizer()
	 * @generated
	 */
	int NODE_RESIZER = 19;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_RESIZER__ID = FLOW_COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_RESIZER__DOCUMENTATION = FLOW_COMPONENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_RESIZER__DOC_REF = FLOW_COMPONENT__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_RESIZER__DOC_FORMAT = FLOW_COMPONENT__DOC_FORMAT;

	/**
	 * The feature id for the '<em><b>Doc Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_RESIZER__DOC_CONTENTS = FLOW_COMPONENT__DOC_CONTENTS;

	/**
	 * The feature id for the '<em><b>Doc Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_RESIZER__DOC_SECTIONS = FLOW_COMPONENT__DOC_SECTIONS;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_RESIZER__MARKERS = FLOW_COMPONENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_RESIZER__ICON = FLOW_COMPONENT__ICON;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_RESIZER__URIS = FLOW_COMPONENT__URIS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_RESIZER__NAME = FLOW_COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_RESIZER__CHILDREN = FLOW_COMPONENT__CHILDREN;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_RESIZER__ATTRIBUTES = FLOW_COMPONENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Min Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_RESIZER__MIN_WIDTH = FLOW_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Min Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_RESIZER__MIN_HEIGHT = FLOW_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_RESIZER__IS_VISIBLE = FLOW_COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Keep Aspect Ratio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_RESIZER__KEEP_ASPECT_RATIO = FLOW_COMPONENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_RESIZER__COLOR = FLOW_COMPONENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Node Resizer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_RESIZER_FEATURE_COUNT = FLOW_COMPONENT_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_RESIZER___COLLECT__OBJECT_EREFERENCE_ELIST = FLOW_COMPONENT___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_RESIZER___GET_REFERRERS__EREFERENCE = FLOW_COMPONENT___GET_REFERRERS__EREFERENCE;

	/**
	 * The number of operations of the '<em>Node Resizer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_RESIZER_OPERATION_COUNT = FLOW_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.react.flow.impl.FlowHookImpl <em>Hook</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.react.flow.impl.FlowHookImpl
	 * @see org.nasdanika.sdk.runtime.models.react.flow.impl.FlowPackageImpl#getFlowHook()
	 * @generated
	 */
	int FLOW_HOOK = 20;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_HOOK__ID = ReactPackage.LIBRARY_HOOK__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_HOOK__DOCUMENTATION = ReactPackage.LIBRARY_HOOK__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_HOOK__DOC_REF = ReactPackage.LIBRARY_HOOK__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_HOOK__DOC_FORMAT = ReactPackage.LIBRARY_HOOK__DOC_FORMAT;

	/**
	 * The feature id for the '<em><b>Doc Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_HOOK__DOC_CONTENTS = ReactPackage.LIBRARY_HOOK__DOC_CONTENTS;

	/**
	 * The feature id for the '<em><b>Doc Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_HOOK__DOC_SECTIONS = ReactPackage.LIBRARY_HOOK__DOC_SECTIONS;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_HOOK__MARKERS = ReactPackage.LIBRARY_HOOK__MARKERS;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_HOOK__ICON = ReactPackage.LIBRARY_HOOK__ICON;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_HOOK__URIS = ReactPackage.LIBRARY_HOOK__URIS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_HOOK__NAME = ReactPackage.LIBRARY_HOOK__NAME;

	/**
	 * The feature id for the '<em><b>Bindings</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_HOOK__BINDINGS = ReactPackage.LIBRARY_HOOK__BINDINGS;

	/**
	 * The number of structural features of the '<em>Hook</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_HOOK_FEATURE_COUNT = ReactPackage.LIBRARY_HOOK_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_HOOK___COLLECT__OBJECT_EREFERENCE_ELIST = ReactPackage.LIBRARY_HOOK___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_HOOK___GET_REFERRERS__EREFERENCE = ReactPackage.LIBRARY_HOOK___GET_REFERRERS__EREFERENCE;

	/**
	 * The number of operations of the '<em>Hook</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_HOOK_OPERATION_COUNT = ReactPackage.LIBRARY_HOOK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.react.flow.impl.NodesStateImpl <em>Nodes State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.react.flow.impl.NodesStateImpl
	 * @see org.nasdanika.sdk.runtime.models.react.flow.impl.FlowPackageImpl#getNodesState()
	 * @generated
	 */
	int NODES_STATE = 21;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODES_STATE__ID = FLOW_HOOK__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODES_STATE__DOCUMENTATION = FLOW_HOOK__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODES_STATE__DOC_REF = FLOW_HOOK__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODES_STATE__DOC_FORMAT = FLOW_HOOK__DOC_FORMAT;

	/**
	 * The feature id for the '<em><b>Doc Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODES_STATE__DOC_CONTENTS = FLOW_HOOK__DOC_CONTENTS;

	/**
	 * The feature id for the '<em><b>Doc Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODES_STATE__DOC_SECTIONS = FLOW_HOOK__DOC_SECTIONS;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODES_STATE__MARKERS = FLOW_HOOK__MARKERS;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODES_STATE__ICON = FLOW_HOOK__ICON;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODES_STATE__URIS = FLOW_HOOK__URIS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODES_STATE__NAME = FLOW_HOOK__NAME;

	/**
	 * The feature id for the '<em><b>Bindings</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODES_STATE__BINDINGS = FLOW_HOOK__BINDINGS;

	/**
	 * The feature id for the '<em><b>Initial Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODES_STATE__INITIAL_NODES = FLOW_HOOK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Nodes State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODES_STATE_FEATURE_COUNT = FLOW_HOOK_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODES_STATE___COLLECT__OBJECT_EREFERENCE_ELIST = FLOW_HOOK___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODES_STATE___GET_REFERRERS__EREFERENCE = FLOW_HOOK___GET_REFERRERS__EREFERENCE;

	/**
	 * The number of operations of the '<em>Nodes State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODES_STATE_OPERATION_COUNT = FLOW_HOOK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.react.flow.impl.EdgesStateImpl <em>Edges State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.react.flow.impl.EdgesStateImpl
	 * @see org.nasdanika.sdk.runtime.models.react.flow.impl.FlowPackageImpl#getEdgesState()
	 * @generated
	 */
	int EDGES_STATE = 22;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGES_STATE__ID = FLOW_HOOK__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGES_STATE__DOCUMENTATION = FLOW_HOOK__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGES_STATE__DOC_REF = FLOW_HOOK__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGES_STATE__DOC_FORMAT = FLOW_HOOK__DOC_FORMAT;

	/**
	 * The feature id for the '<em><b>Doc Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGES_STATE__DOC_CONTENTS = FLOW_HOOK__DOC_CONTENTS;

	/**
	 * The feature id for the '<em><b>Doc Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGES_STATE__DOC_SECTIONS = FLOW_HOOK__DOC_SECTIONS;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGES_STATE__MARKERS = FLOW_HOOK__MARKERS;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGES_STATE__ICON = FLOW_HOOK__ICON;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGES_STATE__URIS = FLOW_HOOK__URIS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGES_STATE__NAME = FLOW_HOOK__NAME;

	/**
	 * The feature id for the '<em><b>Bindings</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGES_STATE__BINDINGS = FLOW_HOOK__BINDINGS;

	/**
	 * The feature id for the '<em><b>Initial Edges</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGES_STATE__INITIAL_EDGES = FLOW_HOOK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Edges State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGES_STATE_FEATURE_COUNT = FLOW_HOOK_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGES_STATE___COLLECT__OBJECT_EREFERENCE_ELIST = FLOW_HOOK___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGES_STATE___GET_REFERRERS__EREFERENCE = FLOW_HOOK___GET_REFERRERS__EREFERENCE;

	/**
	 * The number of operations of the '<em>Edges State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGES_STATE_OPERATION_COUNT = FLOW_HOOK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.react.flow.impl.ReactFlowInstanceImpl <em>React Flow Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.react.flow.impl.ReactFlowInstanceImpl
	 * @see org.nasdanika.sdk.runtime.models.react.flow.impl.FlowPackageImpl#getReactFlowInstance()
	 * @generated
	 */
	int REACT_FLOW_INSTANCE = 23;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACT_FLOW_INSTANCE__ID = FLOW_HOOK__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACT_FLOW_INSTANCE__DOCUMENTATION = FLOW_HOOK__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACT_FLOW_INSTANCE__DOC_REF = FLOW_HOOK__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACT_FLOW_INSTANCE__DOC_FORMAT = FLOW_HOOK__DOC_FORMAT;

	/**
	 * The feature id for the '<em><b>Doc Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACT_FLOW_INSTANCE__DOC_CONTENTS = FLOW_HOOK__DOC_CONTENTS;

	/**
	 * The feature id for the '<em><b>Doc Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACT_FLOW_INSTANCE__DOC_SECTIONS = FLOW_HOOK__DOC_SECTIONS;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACT_FLOW_INSTANCE__MARKERS = FLOW_HOOK__MARKERS;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACT_FLOW_INSTANCE__ICON = FLOW_HOOK__ICON;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACT_FLOW_INSTANCE__URIS = FLOW_HOOK__URIS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACT_FLOW_INSTANCE__NAME = FLOW_HOOK__NAME;

	/**
	 * The feature id for the '<em><b>Bindings</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACT_FLOW_INSTANCE__BINDINGS = FLOW_HOOK__BINDINGS;

	/**
	 * The number of structural features of the '<em>React Flow Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACT_FLOW_INSTANCE_FEATURE_COUNT = FLOW_HOOK_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACT_FLOW_INSTANCE___COLLECT__OBJECT_EREFERENCE_ELIST = FLOW_HOOK___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACT_FLOW_INSTANCE___GET_REFERRERS__EREFERENCE = FLOW_HOOK___GET_REFERRERS__EREFERENCE;

	/**
	 * The number of operations of the '<em>React Flow Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACT_FLOW_INSTANCE_OPERATION_COUNT = FLOW_HOOK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.react.flow.HandlePosition <em>Handle Position</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.react.flow.HandlePosition
	 * @see org.nasdanika.sdk.runtime.models.react.flow.impl.FlowPackageImpl#getHandlePosition()
	 * @generated
	 */
	int HANDLE_POSITION = 24;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.react.flow.MarkerKind <em>Marker Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.react.flow.MarkerKind
	 * @see org.nasdanika.sdk.runtime.models.react.flow.impl.FlowPackageImpl#getMarkerKind()
	 * @generated
	 */
	int MARKER_KIND = 25;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.react.flow.ConnectionLineType <em>Connection Line Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.react.flow.ConnectionLineType
	 * @see org.nasdanika.sdk.runtime.models.react.flow.impl.FlowPackageImpl#getConnectionLineType()
	 * @generated
	 */
	int CONNECTION_LINE_TYPE = 26;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.react.flow.BackgroundVariant <em>Background Variant</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.react.flow.BackgroundVariant
	 * @see org.nasdanika.sdk.runtime.models.react.flow.impl.FlowPackageImpl#getBackgroundVariant()
	 * @generated
	 */
	int BACKGROUND_VARIANT = 27;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.react.flow.EdgeType <em>Edge Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.react.flow.EdgeType
	 * @see org.nasdanika.sdk.runtime.models.react.flow.impl.FlowPackageImpl#getEdgeType()
	 * @generated
	 */
	int EDGE_TYPE = 28;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.react.flow.NodeType <em>Node Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.react.flow.NodeType
	 * @see org.nasdanika.sdk.runtime.models.react.flow.impl.FlowPackageImpl#getNodeType()
	 * @generated
	 */
	int NODE_TYPE = 29;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.react.flow.ColorMode <em>Color Mode</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.react.flow.ColorMode
	 * @see org.nasdanika.sdk.runtime.models.react.flow.impl.FlowPackageImpl#getColorMode()
	 * @generated
	 */
	int COLOR_MODE = 30;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.react.flow.PanelPosition <em>Panel Position</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.react.flow.PanelPosition
	 * @see org.nasdanika.sdk.runtime.models.react.flow.impl.FlowPackageImpl#getPanelPosition()
	 * @generated
	 */
	int PANEL_POSITION = 31;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.react.flow.Orientation <em>Orientation</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.react.flow.Orientation
	 * @see org.nasdanika.sdk.runtime.models.react.flow.impl.FlowPackageImpl#getOrientation()
	 * @generated
	 */
	int ORIENTATION = 32;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.react.flow.HandleType <em>Handle Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.react.flow.HandleType
	 * @see org.nasdanika.sdk.runtime.models.react.flow.impl.FlowPackageImpl#getHandleType()
	 * @generated
	 */
	int HANDLE_TYPE = 33;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.react.flow.Align <em>Align</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.react.flow.Align
	 * @see org.nasdanika.sdk.runtime.models.react.flow.impl.FlowPackageImpl#getAlign()
	 * @generated
	 */
	int ALIGN = 34;


	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.react.flow.XYPosition <em>XY Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XY Position</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.flow.XYPosition
	 * @generated
	 */
	EClass getXYPosition();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.react.flow.XYPosition#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.flow.XYPosition#getX()
	 * @see #getXYPosition()
	 * @generated
	 */
	EAttribute getXYPosition_X();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.react.flow.XYPosition#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.flow.XYPosition#getY()
	 * @see #getXYPosition()
	 * @generated
	 */
	EAttribute getXYPosition_Y();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.react.flow.FlowData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.flow.FlowData
	 * @generated
	 */
	EClass getFlowData();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.react.flow.FlowData#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.flow.FlowData#getLabel()
	 * @see #getFlowData()
	 * @generated
	 */
	EAttribute getFlowData_Label();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.sdk.runtime.models.react.flow.FlowData#getLabelNode <em>Label Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Label Node</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.flow.FlowData#getLabelNode()
	 * @see #getFlowData()
	 * @generated
	 */
	EReference getFlowData_LabelNode();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.sdk.runtime.models.react.flow.FlowData#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Values</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.flow.FlowData#getValues()
	 * @see #getFlowData()
	 * @generated
	 */
	EReference getFlowData_Values();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.react.flow.DataValue <em>Data Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Value</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.flow.DataValue
	 * @generated
	 */
	EClass getDataValue();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.react.flow.DataValue#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.flow.DataValue#getName()
	 * @see #getDataValue()
	 * @generated
	 */
	EAttribute getDataValue_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.react.flow.DataValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.flow.DataValue#getValue()
	 * @see #getDataValue()
	 * @generated
	 */
	EAttribute getDataValue_Value();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.sdk.runtime.models.react.flow.DataValue#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.flow.DataValue#getExpression()
	 * @see #getDataValue()
	 * @generated
	 */
	EReference getDataValue_Expression();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.react.flow.FlowNode <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.flow.FlowNode
	 * @generated
	 */
	EClass getFlowNode();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.react.flow.FlowNode#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.flow.FlowNode#getId()
	 * @see #getFlowNode()
	 * @generated
	 */
	EAttribute getFlowNode_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.react.flow.FlowNode#getCustomType <em>Custom Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Custom Type</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.flow.FlowNode#getCustomType()
	 * @see #getFlowNode()
	 * @generated
	 */
	EAttribute getFlowNode_CustomType();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.react.flow.FlowNode#getNodeType <em>Node Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Node Type</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.flow.FlowNode#getNodeType()
	 * @see #getFlowNode()
	 * @generated
	 */
	EAttribute getFlowNode_NodeType();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.sdk.runtime.models.react.flow.FlowNode#getPosition <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Position</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.flow.FlowNode#getPosition()
	 * @see #getFlowNode()
	 * @generated
	 */
	EReference getFlowNode_Position();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.sdk.runtime.models.react.flow.FlowNode#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Data</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.flow.FlowNode#getData()
	 * @see #getFlowNode()
	 * @generated
	 */
	EReference getFlowNode_Data();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.react.flow.FlowNode#getSourcePosition <em>Source Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Position</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.flow.FlowNode#getSourcePosition()
	 * @see #getFlowNode()
	 * @generated
	 */
	EAttribute getFlowNode_SourcePosition();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.react.flow.FlowNode#getTargetPosition <em>Target Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Position</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.flow.FlowNode#getTargetPosition()
	 * @see #getFlowNode()
	 * @generated
	 */
	EAttribute getFlowNode_TargetPosition();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.react.flow.FlowNode#isHidden <em>Hidden</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hidden</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.flow.FlowNode#isHidden()
	 * @see #getFlowNode()
	 * @generated
	 */
	EAttribute getFlowNode_Hidden();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.react.flow.FlowNode#isDraggable <em>Draggable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Draggable</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.flow.FlowNode#isDraggable()
	 * @see #getFlowNode()
	 * @generated
	 */
	EAttribute getFlowNode_Draggable();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.react.flow.FlowNode#isSelectable <em>Selectable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Selectable</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.flow.FlowNode#isSelectable()
	 * @see #getFlowNode()
	 * @generated
	 */
	EAttribute getFlowNode_Selectable();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.react.flow.FlowNode#isConnectable <em>Connectable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Connectable</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.flow.FlowNode#isConnectable()
	 * @see #getFlowNode()
	 * @generated
	 */
	EAttribute getFlowNode_Connectable();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.react.flow.FlowNode#isDeletable <em>Deletable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Deletable</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.flow.FlowNode#isDeletable()
	 * @see #getFlowNode()
	 * @generated
	 */
	EAttribute getFlowNode_Deletable();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.sdk.runtime.models.react.flow.FlowNode#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.flow.FlowNode#getParent()
	 * @see #getFlowNode()
	 * @generated
	 */
	EReference getFlowNode_Parent();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.react.flow.FlowNode#getExtent <em>Extent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Extent</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.flow.FlowNode#getExtent()
	 * @see #getFlowNode()
	 * @generated
	 */
	EAttribute getFlowNode_Extent();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.react.flow.FlowNode#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.flow.FlowNode#getWidth()
	 * @see #getFlowNode()
	 * @generated
	 */
	EAttribute getFlowNode_Width();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.react.flow.FlowNode#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.flow.FlowNode#getHeight()
	 * @see #getFlowNode()
	 * @generated
	 */
	EAttribute getFlowNode_Height();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.react.flow.FlowNode#getZIndex <em>ZIndex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ZIndex</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.flow.FlowNode#getZIndex()
	 * @see #getFlowNode()
	 * @generated
	 */
	EAttribute getFlowNode_ZIndex();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.react.flow.FlowNode#getClassName <em>Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class Name</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.flow.FlowNode#getClassName()
	 * @see #getFlowNode()
	 * @generated
	 */
	EAttribute getFlowNode_ClassName();

	/**
	 * Returns the meta object for the map '{@link org.nasdanika.sdk.runtime.models.react.flow.FlowNode#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Style</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.flow.FlowNode#getStyle()
	 * @see #getFlowNode()
	 * @generated
	 */
	EReference getFlowNode_Style();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.react.flow.EdgeMarker <em>Edge Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Edge Marker</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.flow.EdgeMarker
	 * @generated
	 */
	EClass getEdgeMarker();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.react.flow.EdgeMarker#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.flow.EdgeMarker#getType()
	 * @see #getEdgeMarker()
	 * @generated
	 */
	EAttribute getEdgeMarker_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.react.flow.EdgeMarker#getColor <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.flow.EdgeMarker#getColor()
	 * @see #getEdgeMarker()
	 * @generated
	 */
	EAttribute getEdgeMarker_Color();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.react.flow.EdgeMarker#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.flow.EdgeMarker#getWidth()
	 * @see #getEdgeMarker()
	 * @generated
	 */
	EAttribute getEdgeMarker_Width();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.react.flow.EdgeMarker#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.flow.EdgeMarker#getHeight()
	 * @see #getEdgeMarker()
	 * @generated
	 */
	EAttribute getEdgeMarker_Height();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.react.flow.EdgeMarker#getStrokeWidth <em>Stroke Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stroke Width</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.flow.EdgeMarker#getStrokeWidth()
	 * @see #getEdgeMarker()
	 * @generated
	 */
	EAttribute getEdgeMarker_StrokeWidth();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.react.flow.FlowEdge <em>Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Edge</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.flow.FlowEdge
	 * @generated
	 */
	EClass getFlowEdge();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.react.flow.FlowEdge#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.flow.FlowEdge#getId()
	 * @see #getFlowEdge()
	 * @generated
	 */
	EAttribute getFlowEdge_Id();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.sdk.runtime.models.react.flow.FlowEdge#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.flow.FlowEdge#getSource()
	 * @see #getFlowEdge()
	 * @generated
	 */
	EReference getFlowEdge_Source();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.sdk.runtime.models.react.flow.FlowEdge#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.flow.FlowEdge#getTarget()
	 * @see #getFlowEdge()
	 * @generated
	 */
	EReference getFlowEdge_Target();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.react.flow.FlowEdge#getSourceHandle <em>Source Handle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Handle</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.flow.FlowEdge#getSourceHandle()
	 * @see #getFlowEdge()
	 * @generated
	 */
	EAttribute getFlowEdge_SourceHandle();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.react.flow.FlowEdge#getTargetHandle <em>Target Handle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Handle</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.flow.FlowEdge#getTargetHandle()
	 * @see #getFlowEdge()
	 * @generated
	 */
	EAttribute getFlowEdge_TargetHandle();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.react.flow.FlowEdge#getEdgeType <em>Edge Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Edge Type</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.flow.FlowEdge#getEdgeType()
	 * @see #getFlowEdge()
	 * @generated
	 */
	EAttribute getFlowEdge_EdgeType();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.react.flow.FlowEdge#getCustomType <em>Custom Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Custom Type</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.flow.FlowEdge#getCustomType()
	 * @see #getFlowEdge()
	 * @generated
	 */
	EAttribute getFlowEdge_CustomType();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.react.flow.FlowEdge#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.flow.FlowEdge#getLabel()
	 * @see #getFlowEdge()
	 * @generated
	 */
	EAttribute getFlowEdge_Label();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.sdk.runtime.models.react.flow.FlowEdge#getLabelNode <em>Label Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Label Node</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.flow.FlowEdge#getLabelNode()
	 * @see #getFlowEdge()
	 * @generated
	 */
	EReference getFlowEdge_LabelNode();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.react.flow.FlowEdge#isAnimated <em>Animated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Animated</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.flow.FlowEdge#isAnimated()
	 * @see #getFlowEdge()
	 * @generated
	 */
	EAttribute getFlowEdge_Animated();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.react.flow.FlowEdge#isHidden <em>Hidden</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hidden</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.flow.FlowEdge#isHidden()
	 * @see #getFlowEdge()
	 * @generated
	 */
	EAttribute getFlowEdge_Hidden();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.react.flow.FlowEdge#isDeletable <em>Deletable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Deletable</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.flow.FlowEdge#isDeletable()
	 * @see #getFlowEdge()
	 * @generated
	 */
	EAttribute getFlowEdge_Deletable();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.react.flow.FlowEdge#isSelectable <em>Selectable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Selectable</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.flow.FlowEdge#isSelectable()
	 * @see #getFlowEdge()
	 * @generated
	 */
	EAttribute getFlowEdge_Selectable();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.react.flow.FlowEdge#isReconnectable <em>Reconnectable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reconnectable</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.flow.FlowEdge#isReconnectable()
	 * @see #getFlowEdge()
	 * @generated
	 */
	EAttribute getFlowEdge_Reconnectable();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.sdk.runtime.models.react.flow.FlowEdge#getMarkerStart <em>Marker Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Marker Start</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.flow.FlowEdge#getMarkerStart()
	 * @see #getFlowEdge()
	 * @generated
	 */
	EReference getFlowEdge_MarkerStart();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.sdk.runtime.models.react.flow.FlowEdge#getMarkerEnd <em>Marker End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Marker End</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.flow.FlowEdge#getMarkerEnd()
	 * @see #getFlowEdge()
	 * @generated
	 */
	EReference getFlowEdge_MarkerEnd();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.sdk.runtime.models.react.flow.FlowEdge#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Data</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.flow.FlowEdge#getData()
	 * @see #getFlowEdge()
	 * @generated
	 */
	EReference getFlowEdge_Data();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.react.flow.FlowEdge#getZIndex <em>ZIndex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ZIndex</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.flow.FlowEdge#getZIndex()
	 * @see #getFlowEdge()
	 * @generated
	 */
	EAttribute getFlowEdge_ZIndex();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.react.flow.FlowEdge#getClassName <em>Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class Name</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.flow.FlowEdge#getClassName()
	 * @see #getFlowEdge()
	 * @generated
	 */
	EAttribute getFlowEdge_ClassName();

	/**
	 * Returns the meta object for the map '{@link org.nasdanika.sdk.runtime.models.react.flow.FlowEdge#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Style</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.flow.FlowEdge#getStyle()
	 * @see #getFlowEdge()
	 * @generated
	 */
	EReference getFlowEdge_Style();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.react.flow.EdgeOptions <em>Edge Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Edge Options</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.flow.EdgeOptions
	 * @generated
	 */
	EClass getEdgeOptions();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.react.flow.EdgeOptions#getEdgeType <em>Edge Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Edge Type</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.flow.EdgeOptions#getEdgeType()
	 * @see #getEdgeOptions()
	 * @generated
	 */
	EAttribute getEdgeOptions_EdgeType();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.react.flow.EdgeOptions#getCustomType <em>Custom Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Custom Type</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.flow.EdgeOptions#getCustomType()
	 * @see #getEdgeOptions()
	 * @generated
	 */
	EAttribute getEdgeOptions_CustomType();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.react.flow.EdgeOptions#isAnimated <em>Animated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Animated</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.flow.EdgeOptions#isAnimated()
	 * @see #getEdgeOptions()
	 * @generated
	 */
	EAttribute getEdgeOptions_Animated();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.sdk.runtime.models.react.flow.EdgeOptions#getMarkerEnd <em>Marker End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Marker End</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.flow.EdgeOptions#getMarkerEnd()
	 * @see #getEdgeOptions()
	 * @generated
	 */
	EReference getEdgeOptions_MarkerEnd();

	/**
	 * Returns the meta object for the map '{@link org.nasdanika.sdk.runtime.models.react.flow.EdgeOptions#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Style</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.flow.EdgeOptions#getStyle()
	 * @see #getEdgeOptions()
	 * @generated
	 */
	EReference getEdgeOptions_Style();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.react.flow.ProOptions <em>Pro Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pro Options</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.flow.ProOptions
	 * @generated
	 */
	EClass getProOptions();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.react.flow.ProOptions#isHideAttribution <em>Hide Attribution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hide Attribution</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.flow.ProOptions#isHideAttribution()
	 * @see #getProOptions()
	 * @generated
	 */
	EAttribute getProOptions_HideAttribution();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.react.flow.FlowTypes <em>Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Types</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.flow.FlowTypes
	 * @generated
	 */
	EClass getFlowTypes();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.sdk.runtime.models.react.flow.FlowTypes#getTypes <em>Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Types</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.flow.FlowTypes#getTypes()
	 * @see #getFlowTypes()
	 * @generated
	 */
	EReference getFlowTypes_Types();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.react.flow.FlowType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.flow.FlowType
	 * @generated
	 */
	EClass getFlowType();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.react.flow.FlowType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.flow.FlowType#getName()
	 * @see #getFlowType()
	 * @generated
	 */
	EAttribute getFlowType_Name();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.sdk.runtime.models.react.flow.FlowType#getComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Component</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.flow.FlowType#getComponent()
	 * @see #getFlowType()
	 * @generated
	 */
	EReference getFlowType_Component();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.react.flow.FlowComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.flow.FlowComponent
	 * @generated
	 */
	EClass getFlowComponent();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.react.flow.ReactFlowProvider <em>React Flow Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>React Flow Provider</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.flow.ReactFlowProvider
	 * @generated
	 */
	EClass getReactFlowProvider();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.react.flow.ReactFlow <em>React Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>React Flow</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.flow.ReactFlow
	 * @generated
	 */
	EClass getReactFlow();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.sdk.runtime.models.react.flow.ReactFlow#getNodes <em>Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nodes</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.flow.ReactFlow#getNodes()
	 * @see #getReactFlow()
	 * @generated
	 */
	EReference getReactFlow_Nodes();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.sdk.runtime.models.react.flow.ReactFlow#getEdges <em>Edges</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Edges</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.flow.ReactFlow#getEdges()
	 * @see #getReactFlow()
	 * @generated
	 */
	EReference getReactFlow_Edges();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.sdk.runtime.models.react.flow.ReactFlow#getNodeTypes <em>Node Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Node Types</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.flow.ReactFlow#getNodeTypes()
	 * @see #getReactFlow()
	 * @generated
	 */
	EReference getReactFlow_NodeTypes();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.sdk.runtime.models.react.flow.ReactFlow#getEdgeTypes <em>Edge Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Edge Types</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.flow.ReactFlow#getEdgeTypes()
	 * @see #getReactFlow()
	 * @generated
	 */
	EReference getReactFlow_EdgeTypes();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.react.flow.ReactFlow#isFitView <em>Fit View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fit View</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.flow.ReactFlow#isFitView()
	 * @see #getReactFlow()
	 * @generated
	 */
	EAttribute getReactFlow_FitView();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.react.flow.ReactFlow#getMinZoom <em>Min Zoom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Zoom</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.flow.ReactFlow#getMinZoom()
	 * @see #getReactFlow()
	 * @generated
	 */
	EAttribute getReactFlow_MinZoom();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.react.flow.ReactFlow#getMaxZoom <em>Max Zoom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Zoom</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.flow.ReactFlow#getMaxZoom()
	 * @see #getReactFlow()
	 * @generated
	 */
	EAttribute getReactFlow_MaxZoom();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.react.flow.ReactFlow#isNodesDraggable <em>Nodes Draggable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nodes Draggable</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.flow.ReactFlow#isNodesDraggable()
	 * @see #getReactFlow()
	 * @generated
	 */
	EAttribute getReactFlow_NodesDraggable();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.react.flow.ReactFlow#isNodesConnectable <em>Nodes Connectable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nodes Connectable</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.flow.ReactFlow#isNodesConnectable()
	 * @see #getReactFlow()
	 * @generated
	 */
	EAttribute getReactFlow_NodesConnectable();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.react.flow.ReactFlow#isElementsSelectable <em>Elements Selectable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Elements Selectable</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.flow.ReactFlow#isElementsSelectable()
	 * @see #getReactFlow()
	 * @generated
	 */
	EAttribute getReactFlow_ElementsSelectable();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.react.flow.ReactFlow#isPanOnDrag <em>Pan On Drag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pan On Drag</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.flow.ReactFlow#isPanOnDrag()
	 * @see #getReactFlow()
	 * @generated
	 */
	EAttribute getReactFlow_PanOnDrag();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.react.flow.ReactFlow#isZoomOnScroll <em>Zoom On Scroll</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Zoom On Scroll</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.flow.ReactFlow#isZoomOnScroll()
	 * @see #getReactFlow()
	 * @generated
	 */
	EAttribute getReactFlow_ZoomOnScroll();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.react.flow.ReactFlow#isZoomOnDoubleClick <em>Zoom On Double Click</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Zoom On Double Click</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.flow.ReactFlow#isZoomOnDoubleClick()
	 * @see #getReactFlow()
	 * @generated
	 */
	EAttribute getReactFlow_ZoomOnDoubleClick();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.react.flow.ReactFlow#isSnapToGrid <em>Snap To Grid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Snap To Grid</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.flow.ReactFlow#isSnapToGrid()
	 * @see #getReactFlow()
	 * @generated
	 */
	EAttribute getReactFlow_SnapToGrid();

	/**
	 * Returns the meta object for the attribute list '{@link org.nasdanika.sdk.runtime.models.react.flow.ReactFlow#getSnapGrid <em>Snap Grid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Snap Grid</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.flow.ReactFlow#getSnapGrid()
	 * @see #getReactFlow()
	 * @generated
	 */
	EAttribute getReactFlow_SnapGrid();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.react.flow.ReactFlow#getColorMode <em>Color Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color Mode</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.flow.ReactFlow#getColorMode()
	 * @see #getReactFlow()
	 * @generated
	 */
	EAttribute getReactFlow_ColorMode();

	/**
	 * Returns the meta object for the attribute list '{@link org.nasdanika.sdk.runtime.models.react.flow.ReactFlow#getDeleteKeyCode <em>Delete Key Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Delete Key Code</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.flow.ReactFlow#getDeleteKeyCode()
	 * @see #getReactFlow()
	 * @generated
	 */
	EAttribute getReactFlow_DeleteKeyCode();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.react.flow.ReactFlow#getConnectionLineType <em>Connection Line Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Connection Line Type</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.flow.ReactFlow#getConnectionLineType()
	 * @see #getReactFlow()
	 * @generated
	 */
	EAttribute getReactFlow_ConnectionLineType();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.sdk.runtime.models.react.flow.ReactFlow#getDefaultEdgeOptions <em>Default Edge Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Default Edge Options</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.flow.ReactFlow#getDefaultEdgeOptions()
	 * @see #getReactFlow()
	 * @generated
	 */
	EReference getReactFlow_DefaultEdgeOptions();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.sdk.runtime.models.react.flow.ReactFlow#getProOptions <em>Pro Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Pro Options</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.flow.ReactFlow#getProOptions()
	 * @see #getReactFlow()
	 * @generated
	 */
	EReference getReactFlow_ProOptions();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.sdk.runtime.models.react.flow.ReactFlow#getBackground <em>Background</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Background</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.flow.ReactFlow#getBackground()
	 * @see #getReactFlow()
	 * @generated
	 */
	EReference getReactFlow_Background();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.sdk.runtime.models.react.flow.ReactFlow#getControls <em>Controls</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Controls</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.flow.ReactFlow#getControls()
	 * @see #getReactFlow()
	 * @generated
	 */
	EReference getReactFlow_Controls();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.sdk.runtime.models.react.flow.ReactFlow#getMiniMap <em>Mini Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Mini Map</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.flow.ReactFlow#getMiniMap()
	 * @see #getReactFlow()
	 * @generated
	 */
	EReference getReactFlow_MiniMap();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.sdk.runtime.models.react.flow.ReactFlow#getPanels <em>Panels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Panels</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.flow.ReactFlow#getPanels()
	 * @see #getReactFlow()
	 * @generated
	 */
	EReference getReactFlow_Panels();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.react.flow.Background <em>Background</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Background</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.flow.Background
	 * @generated
	 */
	EClass getBackground();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.react.flow.Background#getVariant <em>Variant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Variant</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.flow.Background#getVariant()
	 * @see #getBackground()
	 * @generated
	 */
	EAttribute getBackground_Variant();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.react.flow.Background#getGap <em>Gap</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gap</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.flow.Background#getGap()
	 * @see #getBackground()
	 * @generated
	 */
	EAttribute getBackground_Gap();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.react.flow.Background#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.flow.Background#getSize()
	 * @see #getBackground()
	 * @generated
	 */
	EAttribute getBackground_Size();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.react.flow.Background#getLineWidth <em>Line Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Line Width</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.flow.Background#getLineWidth()
	 * @see #getBackground()
	 * @generated
	 */
	EAttribute getBackground_LineWidth();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.react.flow.Background#getColor <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.flow.Background#getColor()
	 * @see #getBackground()
	 * @generated
	 */
	EAttribute getBackground_Color();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.react.flow.Background#getBgColor <em>Bg Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bg Color</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.flow.Background#getBgColor()
	 * @see #getBackground()
	 * @generated
	 */
	EAttribute getBackground_BgColor();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.react.flow.Background#getBackgroundId <em>Background Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Background Id</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.flow.Background#getBackgroundId()
	 * @see #getBackground()
	 * @generated
	 */
	EAttribute getBackground_BackgroundId();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.react.flow.Controls <em>Controls</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Controls</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.flow.Controls
	 * @generated
	 */
	EClass getControls();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.react.flow.Controls#isShowZoom <em>Show Zoom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Show Zoom</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.flow.Controls#isShowZoom()
	 * @see #getControls()
	 * @generated
	 */
	EAttribute getControls_ShowZoom();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.react.flow.Controls#isShowFitView <em>Show Fit View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Show Fit View</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.flow.Controls#isShowFitView()
	 * @see #getControls()
	 * @generated
	 */
	EAttribute getControls_ShowFitView();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.react.flow.Controls#isShowInteractive <em>Show Interactive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Show Interactive</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.flow.Controls#isShowInteractive()
	 * @see #getControls()
	 * @generated
	 */
	EAttribute getControls_ShowInteractive();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.react.flow.Controls#getPosition <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Position</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.flow.Controls#getPosition()
	 * @see #getControls()
	 * @generated
	 */
	EAttribute getControls_Position();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.react.flow.Controls#getOrientation <em>Orientation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Orientation</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.flow.Controls#getOrientation()
	 * @see #getControls()
	 * @generated
	 */
	EAttribute getControls_Orientation();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.react.flow.MiniMap <em>Mini Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mini Map</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.flow.MiniMap
	 * @generated
	 */
	EClass getMiniMap();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.react.flow.MiniMap#getPosition <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Position</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.flow.MiniMap#getPosition()
	 * @see #getMiniMap()
	 * @generated
	 */
	EAttribute getMiniMap_Position();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.react.flow.MiniMap#getNodeColor <em>Node Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Node Color</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.flow.MiniMap#getNodeColor()
	 * @see #getMiniMap()
	 * @generated
	 */
	EAttribute getMiniMap_NodeColor();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.react.flow.MiniMap#getNodeStrokeColor <em>Node Stroke Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Node Stroke Color</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.flow.MiniMap#getNodeStrokeColor()
	 * @see #getMiniMap()
	 * @generated
	 */
	EAttribute getMiniMap_NodeStrokeColor();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.react.flow.MiniMap#getMaskColor <em>Mask Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mask Color</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.flow.MiniMap#getMaskColor()
	 * @see #getMiniMap()
	 * @generated
	 */
	EAttribute getMiniMap_MaskColor();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.react.flow.MiniMap#getBgColor <em>Bg Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bg Color</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.flow.MiniMap#getBgColor()
	 * @see #getMiniMap()
	 * @generated
	 */
	EAttribute getMiniMap_BgColor();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.react.flow.MiniMap#isPannable <em>Pannable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pannable</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.flow.MiniMap#isPannable()
	 * @see #getMiniMap()
	 * @generated
	 */
	EAttribute getMiniMap_Pannable();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.react.flow.MiniMap#isZoomable <em>Zoomable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Zoomable</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.flow.MiniMap#isZoomable()
	 * @see #getMiniMap()
	 * @generated
	 */
	EAttribute getMiniMap_Zoomable();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.react.flow.MiniMap#getAriaLabel <em>Aria Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Aria Label</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.flow.MiniMap#getAriaLabel()
	 * @see #getMiniMap()
	 * @generated
	 */
	EAttribute getMiniMap_AriaLabel();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.react.flow.Panel <em>Panel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Panel</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.flow.Panel
	 * @generated
	 */
	EClass getPanel();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.react.flow.Panel#getPosition <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Position</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.flow.Panel#getPosition()
	 * @see #getPanel()
	 * @generated
	 */
	EAttribute getPanel_Position();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.react.flow.Handle <em>Handle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Handle</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.flow.Handle
	 * @generated
	 */
	EClass getHandle();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.react.flow.Handle#getHandleType <em>Handle Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Handle Type</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.flow.Handle#getHandleType()
	 * @see #getHandle()
	 * @generated
	 */
	EAttribute getHandle_HandleType();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.react.flow.Handle#getPosition <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Position</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.flow.Handle#getPosition()
	 * @see #getHandle()
	 * @generated
	 */
	EAttribute getHandle_Position();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.react.flow.Handle#getHandleId <em>Handle Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Handle Id</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.flow.Handle#getHandleId()
	 * @see #getHandle()
	 * @generated
	 */
	EAttribute getHandle_HandleId();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.react.flow.Handle#isIsConnectable <em>Is Connectable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Connectable</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.flow.Handle#isIsConnectable()
	 * @see #getHandle()
	 * @generated
	 */
	EAttribute getHandle_IsConnectable();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.react.flow.NodeToolbar <em>Node Toolbar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node Toolbar</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.flow.NodeToolbar
	 * @generated
	 */
	EClass getNodeToolbar();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.react.flow.NodeToolbar#getPosition <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Position</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.flow.NodeToolbar#getPosition()
	 * @see #getNodeToolbar()
	 * @generated
	 */
	EAttribute getNodeToolbar_Position();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.react.flow.NodeToolbar#isIsVisible <em>Is Visible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Visible</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.flow.NodeToolbar#isIsVisible()
	 * @see #getNodeToolbar()
	 * @generated
	 */
	EAttribute getNodeToolbar_IsVisible();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.react.flow.NodeToolbar#getOffset <em>Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Offset</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.flow.NodeToolbar#getOffset()
	 * @see #getNodeToolbar()
	 * @generated
	 */
	EAttribute getNodeToolbar_Offset();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.react.flow.NodeToolbar#getAlign <em>Align</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Align</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.flow.NodeToolbar#getAlign()
	 * @see #getNodeToolbar()
	 * @generated
	 */
	EAttribute getNodeToolbar_Align();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.react.flow.NodeResizer <em>Node Resizer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node Resizer</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.flow.NodeResizer
	 * @generated
	 */
	EClass getNodeResizer();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.react.flow.NodeResizer#getMinWidth <em>Min Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Width</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.flow.NodeResizer#getMinWidth()
	 * @see #getNodeResizer()
	 * @generated
	 */
	EAttribute getNodeResizer_MinWidth();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.react.flow.NodeResizer#getMinHeight <em>Min Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Height</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.flow.NodeResizer#getMinHeight()
	 * @see #getNodeResizer()
	 * @generated
	 */
	EAttribute getNodeResizer_MinHeight();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.react.flow.NodeResizer#isIsVisible <em>Is Visible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Visible</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.flow.NodeResizer#isIsVisible()
	 * @see #getNodeResizer()
	 * @generated
	 */
	EAttribute getNodeResizer_IsVisible();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.react.flow.NodeResizer#isKeepAspectRatio <em>Keep Aspect Ratio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Keep Aspect Ratio</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.flow.NodeResizer#isKeepAspectRatio()
	 * @see #getNodeResizer()
	 * @generated
	 */
	EAttribute getNodeResizer_KeepAspectRatio();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.react.flow.NodeResizer#getColor <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.flow.NodeResizer#getColor()
	 * @see #getNodeResizer()
	 * @generated
	 */
	EAttribute getNodeResizer_Color();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.react.flow.FlowHook <em>Hook</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hook</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.flow.FlowHook
	 * @generated
	 */
	EClass getFlowHook();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.react.flow.NodesState <em>Nodes State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Nodes State</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.flow.NodesState
	 * @generated
	 */
	EClass getNodesState();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.sdk.runtime.models.react.flow.NodesState#getInitialNodes <em>Initial Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Initial Nodes</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.flow.NodesState#getInitialNodes()
	 * @see #getNodesState()
	 * @generated
	 */
	EReference getNodesState_InitialNodes();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.react.flow.EdgesState <em>Edges State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Edges State</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.flow.EdgesState
	 * @generated
	 */
	EClass getEdgesState();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.sdk.runtime.models.react.flow.EdgesState#getInitialEdges <em>Initial Edges</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Initial Edges</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.flow.EdgesState#getInitialEdges()
	 * @see #getEdgesState()
	 * @generated
	 */
	EReference getEdgesState_InitialEdges();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.react.flow.ReactFlowInstance <em>React Flow Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>React Flow Instance</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.flow.ReactFlowInstance
	 * @generated
	 */
	EClass getReactFlowInstance();

	/**
	 * Returns the meta object for enum '{@link org.nasdanika.sdk.runtime.models.react.flow.HandlePosition <em>Handle Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Handle Position</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.flow.HandlePosition
	 * @generated
	 */
	EEnum getHandlePosition();

	/**
	 * Returns the meta object for enum '{@link org.nasdanika.sdk.runtime.models.react.flow.MarkerKind <em>Marker Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Marker Kind</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.flow.MarkerKind
	 * @generated
	 */
	EEnum getMarkerKind();

	/**
	 * Returns the meta object for enum '{@link org.nasdanika.sdk.runtime.models.react.flow.ConnectionLineType <em>Connection Line Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Connection Line Type</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.flow.ConnectionLineType
	 * @generated
	 */
	EEnum getConnectionLineType();

	/**
	 * Returns the meta object for enum '{@link org.nasdanika.sdk.runtime.models.react.flow.BackgroundVariant <em>Background Variant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Background Variant</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.flow.BackgroundVariant
	 * @generated
	 */
	EEnum getBackgroundVariant();

	/**
	 * Returns the meta object for enum '{@link org.nasdanika.sdk.runtime.models.react.flow.EdgeType <em>Edge Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Edge Type</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.flow.EdgeType
	 * @generated
	 */
	EEnum getEdgeType();

	/**
	 * Returns the meta object for enum '{@link org.nasdanika.sdk.runtime.models.react.flow.NodeType <em>Node Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Node Type</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.flow.NodeType
	 * @generated
	 */
	EEnum getNodeType();

	/**
	 * Returns the meta object for enum '{@link org.nasdanika.sdk.runtime.models.react.flow.ColorMode <em>Color Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Color Mode</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.flow.ColorMode
	 * @generated
	 */
	EEnum getColorMode();

	/**
	 * Returns the meta object for enum '{@link org.nasdanika.sdk.runtime.models.react.flow.PanelPosition <em>Panel Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Panel Position</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.flow.PanelPosition
	 * @generated
	 */
	EEnum getPanelPosition();

	/**
	 * Returns the meta object for enum '{@link org.nasdanika.sdk.runtime.models.react.flow.Orientation <em>Orientation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Orientation</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.flow.Orientation
	 * @generated
	 */
	EEnum getOrientation();

	/**
	 * Returns the meta object for enum '{@link org.nasdanika.sdk.runtime.models.react.flow.HandleType <em>Handle Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Handle Type</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.flow.HandleType
	 * @generated
	 */
	EEnum getHandleType();

	/**
	 * Returns the meta object for enum '{@link org.nasdanika.sdk.runtime.models.react.flow.Align <em>Align</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Align</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.flow.Align
	 * @generated
	 */
	EEnum getAlign();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	FlowFactory getFlowFactory();

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
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.react.flow.impl.XYPositionImpl <em>XY Position</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.react.flow.impl.XYPositionImpl
		 * @see org.nasdanika.sdk.runtime.models.react.flow.impl.FlowPackageImpl#getXYPosition()
		 * @generated
		 */
		EClass XY_POSITION = eINSTANCE.getXYPosition();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XY_POSITION__X = eINSTANCE.getXYPosition_X();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XY_POSITION__Y = eINSTANCE.getXYPosition_Y();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.react.flow.impl.FlowDataImpl <em>Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.react.flow.impl.FlowDataImpl
		 * @see org.nasdanika.sdk.runtime.models.react.flow.impl.FlowPackageImpl#getFlowData()
		 * @generated
		 */
		EClass FLOW_DATA = eINSTANCE.getFlowData();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLOW_DATA__LABEL = eINSTANCE.getFlowData_Label();

		/**
		 * The meta object literal for the '<em><b>Label Node</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW_DATA__LABEL_NODE = eINSTANCE.getFlowData_LabelNode();

		/**
		 * The meta object literal for the '<em><b>Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW_DATA__VALUES = eINSTANCE.getFlowData_Values();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.react.flow.impl.DataValueImpl <em>Data Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.react.flow.impl.DataValueImpl
		 * @see org.nasdanika.sdk.runtime.models.react.flow.impl.FlowPackageImpl#getDataValue()
		 * @generated
		 */
		EClass DATA_VALUE = eINSTANCE.getDataValue();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_VALUE__NAME = eINSTANCE.getDataValue_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_VALUE__VALUE = eINSTANCE.getDataValue_Value();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_VALUE__EXPRESSION = eINSTANCE.getDataValue_Expression();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.react.flow.impl.FlowNodeImpl <em>Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.react.flow.impl.FlowNodeImpl
		 * @see org.nasdanika.sdk.runtime.models.react.flow.impl.FlowPackageImpl#getFlowNode()
		 * @generated
		 */
		EClass FLOW_NODE = eINSTANCE.getFlowNode();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLOW_NODE__ID = eINSTANCE.getFlowNode_Id();

		/**
		 * The meta object literal for the '<em><b>Custom Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLOW_NODE__CUSTOM_TYPE = eINSTANCE.getFlowNode_CustomType();

		/**
		 * The meta object literal for the '<em><b>Node Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLOW_NODE__NODE_TYPE = eINSTANCE.getFlowNode_NodeType();

		/**
		 * The meta object literal for the '<em><b>Position</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW_NODE__POSITION = eINSTANCE.getFlowNode_Position();

		/**
		 * The meta object literal for the '<em><b>Data</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW_NODE__DATA = eINSTANCE.getFlowNode_Data();

		/**
		 * The meta object literal for the '<em><b>Source Position</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLOW_NODE__SOURCE_POSITION = eINSTANCE.getFlowNode_SourcePosition();

		/**
		 * The meta object literal for the '<em><b>Target Position</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLOW_NODE__TARGET_POSITION = eINSTANCE.getFlowNode_TargetPosition();

		/**
		 * The meta object literal for the '<em><b>Hidden</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLOW_NODE__HIDDEN = eINSTANCE.getFlowNode_Hidden();

		/**
		 * The meta object literal for the '<em><b>Draggable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLOW_NODE__DRAGGABLE = eINSTANCE.getFlowNode_Draggable();

		/**
		 * The meta object literal for the '<em><b>Selectable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLOW_NODE__SELECTABLE = eINSTANCE.getFlowNode_Selectable();

		/**
		 * The meta object literal for the '<em><b>Connectable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLOW_NODE__CONNECTABLE = eINSTANCE.getFlowNode_Connectable();

		/**
		 * The meta object literal for the '<em><b>Deletable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLOW_NODE__DELETABLE = eINSTANCE.getFlowNode_Deletable();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW_NODE__PARENT = eINSTANCE.getFlowNode_Parent();

		/**
		 * The meta object literal for the '<em><b>Extent</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLOW_NODE__EXTENT = eINSTANCE.getFlowNode_Extent();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLOW_NODE__WIDTH = eINSTANCE.getFlowNode_Width();

		/**
		 * The meta object literal for the '<em><b>Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLOW_NODE__HEIGHT = eINSTANCE.getFlowNode_Height();

		/**
		 * The meta object literal for the '<em><b>ZIndex</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLOW_NODE__ZINDEX = eINSTANCE.getFlowNode_ZIndex();

		/**
		 * The meta object literal for the '<em><b>Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLOW_NODE__CLASS_NAME = eINSTANCE.getFlowNode_ClassName();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW_NODE__STYLE = eINSTANCE.getFlowNode_Style();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.react.flow.impl.EdgeMarkerImpl <em>Edge Marker</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.react.flow.impl.EdgeMarkerImpl
		 * @see org.nasdanika.sdk.runtime.models.react.flow.impl.FlowPackageImpl#getEdgeMarker()
		 * @generated
		 */
		EClass EDGE_MARKER = eINSTANCE.getEdgeMarker();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EDGE_MARKER__TYPE = eINSTANCE.getEdgeMarker_Type();

		/**
		 * The meta object literal for the '<em><b>Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EDGE_MARKER__COLOR = eINSTANCE.getEdgeMarker_Color();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EDGE_MARKER__WIDTH = eINSTANCE.getEdgeMarker_Width();

		/**
		 * The meta object literal for the '<em><b>Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EDGE_MARKER__HEIGHT = eINSTANCE.getEdgeMarker_Height();

		/**
		 * The meta object literal for the '<em><b>Stroke Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EDGE_MARKER__STROKE_WIDTH = eINSTANCE.getEdgeMarker_StrokeWidth();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.react.flow.impl.FlowEdgeImpl <em>Edge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.react.flow.impl.FlowEdgeImpl
		 * @see org.nasdanika.sdk.runtime.models.react.flow.impl.FlowPackageImpl#getFlowEdge()
		 * @generated
		 */
		EClass FLOW_EDGE = eINSTANCE.getFlowEdge();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLOW_EDGE__ID = eINSTANCE.getFlowEdge_Id();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW_EDGE__SOURCE = eINSTANCE.getFlowEdge_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW_EDGE__TARGET = eINSTANCE.getFlowEdge_Target();

		/**
		 * The meta object literal for the '<em><b>Source Handle</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLOW_EDGE__SOURCE_HANDLE = eINSTANCE.getFlowEdge_SourceHandle();

		/**
		 * The meta object literal for the '<em><b>Target Handle</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLOW_EDGE__TARGET_HANDLE = eINSTANCE.getFlowEdge_TargetHandle();

		/**
		 * The meta object literal for the '<em><b>Edge Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLOW_EDGE__EDGE_TYPE = eINSTANCE.getFlowEdge_EdgeType();

		/**
		 * The meta object literal for the '<em><b>Custom Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLOW_EDGE__CUSTOM_TYPE = eINSTANCE.getFlowEdge_CustomType();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLOW_EDGE__LABEL = eINSTANCE.getFlowEdge_Label();

		/**
		 * The meta object literal for the '<em><b>Label Node</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW_EDGE__LABEL_NODE = eINSTANCE.getFlowEdge_LabelNode();

		/**
		 * The meta object literal for the '<em><b>Animated</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLOW_EDGE__ANIMATED = eINSTANCE.getFlowEdge_Animated();

		/**
		 * The meta object literal for the '<em><b>Hidden</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLOW_EDGE__HIDDEN = eINSTANCE.getFlowEdge_Hidden();

		/**
		 * The meta object literal for the '<em><b>Deletable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLOW_EDGE__DELETABLE = eINSTANCE.getFlowEdge_Deletable();

		/**
		 * The meta object literal for the '<em><b>Selectable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLOW_EDGE__SELECTABLE = eINSTANCE.getFlowEdge_Selectable();

		/**
		 * The meta object literal for the '<em><b>Reconnectable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLOW_EDGE__RECONNECTABLE = eINSTANCE.getFlowEdge_Reconnectable();

		/**
		 * The meta object literal for the '<em><b>Marker Start</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW_EDGE__MARKER_START = eINSTANCE.getFlowEdge_MarkerStart();

		/**
		 * The meta object literal for the '<em><b>Marker End</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW_EDGE__MARKER_END = eINSTANCE.getFlowEdge_MarkerEnd();

		/**
		 * The meta object literal for the '<em><b>Data</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW_EDGE__DATA = eINSTANCE.getFlowEdge_Data();

		/**
		 * The meta object literal for the '<em><b>ZIndex</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLOW_EDGE__ZINDEX = eINSTANCE.getFlowEdge_ZIndex();

		/**
		 * The meta object literal for the '<em><b>Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLOW_EDGE__CLASS_NAME = eINSTANCE.getFlowEdge_ClassName();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW_EDGE__STYLE = eINSTANCE.getFlowEdge_Style();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.react.flow.impl.EdgeOptionsImpl <em>Edge Options</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.react.flow.impl.EdgeOptionsImpl
		 * @see org.nasdanika.sdk.runtime.models.react.flow.impl.FlowPackageImpl#getEdgeOptions()
		 * @generated
		 */
		EClass EDGE_OPTIONS = eINSTANCE.getEdgeOptions();

		/**
		 * The meta object literal for the '<em><b>Edge Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EDGE_OPTIONS__EDGE_TYPE = eINSTANCE.getEdgeOptions_EdgeType();

		/**
		 * The meta object literal for the '<em><b>Custom Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EDGE_OPTIONS__CUSTOM_TYPE = eINSTANCE.getEdgeOptions_CustomType();

		/**
		 * The meta object literal for the '<em><b>Animated</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EDGE_OPTIONS__ANIMATED = eINSTANCE.getEdgeOptions_Animated();

		/**
		 * The meta object literal for the '<em><b>Marker End</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDGE_OPTIONS__MARKER_END = eINSTANCE.getEdgeOptions_MarkerEnd();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDGE_OPTIONS__STYLE = eINSTANCE.getEdgeOptions_Style();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.react.flow.impl.ProOptionsImpl <em>Pro Options</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.react.flow.impl.ProOptionsImpl
		 * @see org.nasdanika.sdk.runtime.models.react.flow.impl.FlowPackageImpl#getProOptions()
		 * @generated
		 */
		EClass PRO_OPTIONS = eINSTANCE.getProOptions();

		/**
		 * The meta object literal for the '<em><b>Hide Attribution</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRO_OPTIONS__HIDE_ATTRIBUTION = eINSTANCE.getProOptions_HideAttribution();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.react.flow.impl.FlowTypesImpl <em>Types</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.react.flow.impl.FlowTypesImpl
		 * @see org.nasdanika.sdk.runtime.models.react.flow.impl.FlowPackageImpl#getFlowTypes()
		 * @generated
		 */
		EClass FLOW_TYPES = eINSTANCE.getFlowTypes();

		/**
		 * The meta object literal for the '<em><b>Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW_TYPES__TYPES = eINSTANCE.getFlowTypes_Types();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.react.flow.impl.FlowTypeImpl <em>Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.react.flow.impl.FlowTypeImpl
		 * @see org.nasdanika.sdk.runtime.models.react.flow.impl.FlowPackageImpl#getFlowType()
		 * @generated
		 */
		EClass FLOW_TYPE = eINSTANCE.getFlowType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLOW_TYPE__NAME = eINSTANCE.getFlowType_Name();

		/**
		 * The meta object literal for the '<em><b>Component</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW_TYPE__COMPONENT = eINSTANCE.getFlowType_Component();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.react.flow.impl.FlowComponentImpl <em>Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.react.flow.impl.FlowComponentImpl
		 * @see org.nasdanika.sdk.runtime.models.react.flow.impl.FlowPackageImpl#getFlowComponent()
		 * @generated
		 */
		EClass FLOW_COMPONENT = eINSTANCE.getFlowComponent();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.react.flow.impl.ReactFlowProviderImpl <em>React Flow Provider</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.react.flow.impl.ReactFlowProviderImpl
		 * @see org.nasdanika.sdk.runtime.models.react.flow.impl.FlowPackageImpl#getReactFlowProvider()
		 * @generated
		 */
		EClass REACT_FLOW_PROVIDER = eINSTANCE.getReactFlowProvider();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.react.flow.impl.ReactFlowImpl <em>React Flow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.react.flow.impl.ReactFlowImpl
		 * @see org.nasdanika.sdk.runtime.models.react.flow.impl.FlowPackageImpl#getReactFlow()
		 * @generated
		 */
		EClass REACT_FLOW = eINSTANCE.getReactFlow();

		/**
		 * The meta object literal for the '<em><b>Nodes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REACT_FLOW__NODES = eINSTANCE.getReactFlow_Nodes();

		/**
		 * The meta object literal for the '<em><b>Edges</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REACT_FLOW__EDGES = eINSTANCE.getReactFlow_Edges();

		/**
		 * The meta object literal for the '<em><b>Node Types</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REACT_FLOW__NODE_TYPES = eINSTANCE.getReactFlow_NodeTypes();

		/**
		 * The meta object literal for the '<em><b>Edge Types</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REACT_FLOW__EDGE_TYPES = eINSTANCE.getReactFlow_EdgeTypes();

		/**
		 * The meta object literal for the '<em><b>Fit View</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REACT_FLOW__FIT_VIEW = eINSTANCE.getReactFlow_FitView();

		/**
		 * The meta object literal for the '<em><b>Min Zoom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REACT_FLOW__MIN_ZOOM = eINSTANCE.getReactFlow_MinZoom();

		/**
		 * The meta object literal for the '<em><b>Max Zoom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REACT_FLOW__MAX_ZOOM = eINSTANCE.getReactFlow_MaxZoom();

		/**
		 * The meta object literal for the '<em><b>Nodes Draggable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REACT_FLOW__NODES_DRAGGABLE = eINSTANCE.getReactFlow_NodesDraggable();

		/**
		 * The meta object literal for the '<em><b>Nodes Connectable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REACT_FLOW__NODES_CONNECTABLE = eINSTANCE.getReactFlow_NodesConnectable();

		/**
		 * The meta object literal for the '<em><b>Elements Selectable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REACT_FLOW__ELEMENTS_SELECTABLE = eINSTANCE.getReactFlow_ElementsSelectable();

		/**
		 * The meta object literal for the '<em><b>Pan On Drag</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REACT_FLOW__PAN_ON_DRAG = eINSTANCE.getReactFlow_PanOnDrag();

		/**
		 * The meta object literal for the '<em><b>Zoom On Scroll</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REACT_FLOW__ZOOM_ON_SCROLL = eINSTANCE.getReactFlow_ZoomOnScroll();

		/**
		 * The meta object literal for the '<em><b>Zoom On Double Click</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REACT_FLOW__ZOOM_ON_DOUBLE_CLICK = eINSTANCE.getReactFlow_ZoomOnDoubleClick();

		/**
		 * The meta object literal for the '<em><b>Snap To Grid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REACT_FLOW__SNAP_TO_GRID = eINSTANCE.getReactFlow_SnapToGrid();

		/**
		 * The meta object literal for the '<em><b>Snap Grid</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REACT_FLOW__SNAP_GRID = eINSTANCE.getReactFlow_SnapGrid();

		/**
		 * The meta object literal for the '<em><b>Color Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REACT_FLOW__COLOR_MODE = eINSTANCE.getReactFlow_ColorMode();

		/**
		 * The meta object literal for the '<em><b>Delete Key Code</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REACT_FLOW__DELETE_KEY_CODE = eINSTANCE.getReactFlow_DeleteKeyCode();

		/**
		 * The meta object literal for the '<em><b>Connection Line Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REACT_FLOW__CONNECTION_LINE_TYPE = eINSTANCE.getReactFlow_ConnectionLineType();

		/**
		 * The meta object literal for the '<em><b>Default Edge Options</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REACT_FLOW__DEFAULT_EDGE_OPTIONS = eINSTANCE.getReactFlow_DefaultEdgeOptions();

		/**
		 * The meta object literal for the '<em><b>Pro Options</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REACT_FLOW__PRO_OPTIONS = eINSTANCE.getReactFlow_ProOptions();

		/**
		 * The meta object literal for the '<em><b>Background</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REACT_FLOW__BACKGROUND = eINSTANCE.getReactFlow_Background();

		/**
		 * The meta object literal for the '<em><b>Controls</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REACT_FLOW__CONTROLS = eINSTANCE.getReactFlow_Controls();

		/**
		 * The meta object literal for the '<em><b>Mini Map</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REACT_FLOW__MINI_MAP = eINSTANCE.getReactFlow_MiniMap();

		/**
		 * The meta object literal for the '<em><b>Panels</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REACT_FLOW__PANELS = eINSTANCE.getReactFlow_Panels();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.react.flow.impl.BackgroundImpl <em>Background</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.react.flow.impl.BackgroundImpl
		 * @see org.nasdanika.sdk.runtime.models.react.flow.impl.FlowPackageImpl#getBackground()
		 * @generated
		 */
		EClass BACKGROUND = eINSTANCE.getBackground();

		/**
		 * The meta object literal for the '<em><b>Variant</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BACKGROUND__VARIANT = eINSTANCE.getBackground_Variant();

		/**
		 * The meta object literal for the '<em><b>Gap</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BACKGROUND__GAP = eINSTANCE.getBackground_Gap();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BACKGROUND__SIZE = eINSTANCE.getBackground_Size();

		/**
		 * The meta object literal for the '<em><b>Line Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BACKGROUND__LINE_WIDTH = eINSTANCE.getBackground_LineWidth();

		/**
		 * The meta object literal for the '<em><b>Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BACKGROUND__COLOR = eINSTANCE.getBackground_Color();

		/**
		 * The meta object literal for the '<em><b>Bg Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BACKGROUND__BG_COLOR = eINSTANCE.getBackground_BgColor();

		/**
		 * The meta object literal for the '<em><b>Background Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BACKGROUND__BACKGROUND_ID = eINSTANCE.getBackground_BackgroundId();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.react.flow.impl.ControlsImpl <em>Controls</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.react.flow.impl.ControlsImpl
		 * @see org.nasdanika.sdk.runtime.models.react.flow.impl.FlowPackageImpl#getControls()
		 * @generated
		 */
		EClass CONTROLS = eINSTANCE.getControls();

		/**
		 * The meta object literal for the '<em><b>Show Zoom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROLS__SHOW_ZOOM = eINSTANCE.getControls_ShowZoom();

		/**
		 * The meta object literal for the '<em><b>Show Fit View</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROLS__SHOW_FIT_VIEW = eINSTANCE.getControls_ShowFitView();

		/**
		 * The meta object literal for the '<em><b>Show Interactive</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROLS__SHOW_INTERACTIVE = eINSTANCE.getControls_ShowInteractive();

		/**
		 * The meta object literal for the '<em><b>Position</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROLS__POSITION = eINSTANCE.getControls_Position();

		/**
		 * The meta object literal for the '<em><b>Orientation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROLS__ORIENTATION = eINSTANCE.getControls_Orientation();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.react.flow.impl.MiniMapImpl <em>Mini Map</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.react.flow.impl.MiniMapImpl
		 * @see org.nasdanika.sdk.runtime.models.react.flow.impl.FlowPackageImpl#getMiniMap()
		 * @generated
		 */
		EClass MINI_MAP = eINSTANCE.getMiniMap();

		/**
		 * The meta object literal for the '<em><b>Position</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MINI_MAP__POSITION = eINSTANCE.getMiniMap_Position();

		/**
		 * The meta object literal for the '<em><b>Node Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MINI_MAP__NODE_COLOR = eINSTANCE.getMiniMap_NodeColor();

		/**
		 * The meta object literal for the '<em><b>Node Stroke Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MINI_MAP__NODE_STROKE_COLOR = eINSTANCE.getMiniMap_NodeStrokeColor();

		/**
		 * The meta object literal for the '<em><b>Mask Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MINI_MAP__MASK_COLOR = eINSTANCE.getMiniMap_MaskColor();

		/**
		 * The meta object literal for the '<em><b>Bg Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MINI_MAP__BG_COLOR = eINSTANCE.getMiniMap_BgColor();

		/**
		 * The meta object literal for the '<em><b>Pannable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MINI_MAP__PANNABLE = eINSTANCE.getMiniMap_Pannable();

		/**
		 * The meta object literal for the '<em><b>Zoomable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MINI_MAP__ZOOMABLE = eINSTANCE.getMiniMap_Zoomable();

		/**
		 * The meta object literal for the '<em><b>Aria Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MINI_MAP__ARIA_LABEL = eINSTANCE.getMiniMap_AriaLabel();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.react.flow.impl.PanelImpl <em>Panel</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.react.flow.impl.PanelImpl
		 * @see org.nasdanika.sdk.runtime.models.react.flow.impl.FlowPackageImpl#getPanel()
		 * @generated
		 */
		EClass PANEL = eINSTANCE.getPanel();

		/**
		 * The meta object literal for the '<em><b>Position</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PANEL__POSITION = eINSTANCE.getPanel_Position();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.react.flow.impl.HandleImpl <em>Handle</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.react.flow.impl.HandleImpl
		 * @see org.nasdanika.sdk.runtime.models.react.flow.impl.FlowPackageImpl#getHandle()
		 * @generated
		 */
		EClass HANDLE = eINSTANCE.getHandle();

		/**
		 * The meta object literal for the '<em><b>Handle Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HANDLE__HANDLE_TYPE = eINSTANCE.getHandle_HandleType();

		/**
		 * The meta object literal for the '<em><b>Position</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HANDLE__POSITION = eINSTANCE.getHandle_Position();

		/**
		 * The meta object literal for the '<em><b>Handle Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HANDLE__HANDLE_ID = eINSTANCE.getHandle_HandleId();

		/**
		 * The meta object literal for the '<em><b>Is Connectable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HANDLE__IS_CONNECTABLE = eINSTANCE.getHandle_IsConnectable();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.react.flow.impl.NodeToolbarImpl <em>Node Toolbar</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.react.flow.impl.NodeToolbarImpl
		 * @see org.nasdanika.sdk.runtime.models.react.flow.impl.FlowPackageImpl#getNodeToolbar()
		 * @generated
		 */
		EClass NODE_TOOLBAR = eINSTANCE.getNodeToolbar();

		/**
		 * The meta object literal for the '<em><b>Position</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE_TOOLBAR__POSITION = eINSTANCE.getNodeToolbar_Position();

		/**
		 * The meta object literal for the '<em><b>Is Visible</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE_TOOLBAR__IS_VISIBLE = eINSTANCE.getNodeToolbar_IsVisible();

		/**
		 * The meta object literal for the '<em><b>Offset</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE_TOOLBAR__OFFSET = eINSTANCE.getNodeToolbar_Offset();

		/**
		 * The meta object literal for the '<em><b>Align</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE_TOOLBAR__ALIGN = eINSTANCE.getNodeToolbar_Align();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.react.flow.impl.NodeResizerImpl <em>Node Resizer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.react.flow.impl.NodeResizerImpl
		 * @see org.nasdanika.sdk.runtime.models.react.flow.impl.FlowPackageImpl#getNodeResizer()
		 * @generated
		 */
		EClass NODE_RESIZER = eINSTANCE.getNodeResizer();

		/**
		 * The meta object literal for the '<em><b>Min Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE_RESIZER__MIN_WIDTH = eINSTANCE.getNodeResizer_MinWidth();

		/**
		 * The meta object literal for the '<em><b>Min Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE_RESIZER__MIN_HEIGHT = eINSTANCE.getNodeResizer_MinHeight();

		/**
		 * The meta object literal for the '<em><b>Is Visible</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE_RESIZER__IS_VISIBLE = eINSTANCE.getNodeResizer_IsVisible();

		/**
		 * The meta object literal for the '<em><b>Keep Aspect Ratio</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE_RESIZER__KEEP_ASPECT_RATIO = eINSTANCE.getNodeResizer_KeepAspectRatio();

		/**
		 * The meta object literal for the '<em><b>Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE_RESIZER__COLOR = eINSTANCE.getNodeResizer_Color();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.react.flow.impl.FlowHookImpl <em>Hook</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.react.flow.impl.FlowHookImpl
		 * @see org.nasdanika.sdk.runtime.models.react.flow.impl.FlowPackageImpl#getFlowHook()
		 * @generated
		 */
		EClass FLOW_HOOK = eINSTANCE.getFlowHook();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.react.flow.impl.NodesStateImpl <em>Nodes State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.react.flow.impl.NodesStateImpl
		 * @see org.nasdanika.sdk.runtime.models.react.flow.impl.FlowPackageImpl#getNodesState()
		 * @generated
		 */
		EClass NODES_STATE = eINSTANCE.getNodesState();

		/**
		 * The meta object literal for the '<em><b>Initial Nodes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODES_STATE__INITIAL_NODES = eINSTANCE.getNodesState_InitialNodes();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.react.flow.impl.EdgesStateImpl <em>Edges State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.react.flow.impl.EdgesStateImpl
		 * @see org.nasdanika.sdk.runtime.models.react.flow.impl.FlowPackageImpl#getEdgesState()
		 * @generated
		 */
		EClass EDGES_STATE = eINSTANCE.getEdgesState();

		/**
		 * The meta object literal for the '<em><b>Initial Edges</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDGES_STATE__INITIAL_EDGES = eINSTANCE.getEdgesState_InitialEdges();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.react.flow.impl.ReactFlowInstanceImpl <em>React Flow Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.react.flow.impl.ReactFlowInstanceImpl
		 * @see org.nasdanika.sdk.runtime.models.react.flow.impl.FlowPackageImpl#getReactFlowInstance()
		 * @generated
		 */
		EClass REACT_FLOW_INSTANCE = eINSTANCE.getReactFlowInstance();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.react.flow.HandlePosition <em>Handle Position</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.react.flow.HandlePosition
		 * @see org.nasdanika.sdk.runtime.models.react.flow.impl.FlowPackageImpl#getHandlePosition()
		 * @generated
		 */
		EEnum HANDLE_POSITION = eINSTANCE.getHandlePosition();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.react.flow.MarkerKind <em>Marker Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.react.flow.MarkerKind
		 * @see org.nasdanika.sdk.runtime.models.react.flow.impl.FlowPackageImpl#getMarkerKind()
		 * @generated
		 */
		EEnum MARKER_KIND = eINSTANCE.getMarkerKind();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.react.flow.ConnectionLineType <em>Connection Line Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.react.flow.ConnectionLineType
		 * @see org.nasdanika.sdk.runtime.models.react.flow.impl.FlowPackageImpl#getConnectionLineType()
		 * @generated
		 */
		EEnum CONNECTION_LINE_TYPE = eINSTANCE.getConnectionLineType();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.react.flow.BackgroundVariant <em>Background Variant</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.react.flow.BackgroundVariant
		 * @see org.nasdanika.sdk.runtime.models.react.flow.impl.FlowPackageImpl#getBackgroundVariant()
		 * @generated
		 */
		EEnum BACKGROUND_VARIANT = eINSTANCE.getBackgroundVariant();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.react.flow.EdgeType <em>Edge Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.react.flow.EdgeType
		 * @see org.nasdanika.sdk.runtime.models.react.flow.impl.FlowPackageImpl#getEdgeType()
		 * @generated
		 */
		EEnum EDGE_TYPE = eINSTANCE.getEdgeType();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.react.flow.NodeType <em>Node Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.react.flow.NodeType
		 * @see org.nasdanika.sdk.runtime.models.react.flow.impl.FlowPackageImpl#getNodeType()
		 * @generated
		 */
		EEnum NODE_TYPE = eINSTANCE.getNodeType();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.react.flow.ColorMode <em>Color Mode</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.react.flow.ColorMode
		 * @see org.nasdanika.sdk.runtime.models.react.flow.impl.FlowPackageImpl#getColorMode()
		 * @generated
		 */
		EEnum COLOR_MODE = eINSTANCE.getColorMode();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.react.flow.PanelPosition <em>Panel Position</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.react.flow.PanelPosition
		 * @see org.nasdanika.sdk.runtime.models.react.flow.impl.FlowPackageImpl#getPanelPosition()
		 * @generated
		 */
		EEnum PANEL_POSITION = eINSTANCE.getPanelPosition();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.react.flow.Orientation <em>Orientation</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.react.flow.Orientation
		 * @see org.nasdanika.sdk.runtime.models.react.flow.impl.FlowPackageImpl#getOrientation()
		 * @generated
		 */
		EEnum ORIENTATION = eINSTANCE.getOrientation();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.react.flow.HandleType <em>Handle Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.react.flow.HandleType
		 * @see org.nasdanika.sdk.runtime.models.react.flow.impl.FlowPackageImpl#getHandleType()
		 * @generated
		 */
		EEnum HANDLE_TYPE = eINSTANCE.getHandleType();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.react.flow.Align <em>Align</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.react.flow.Align
		 * @see org.nasdanika.sdk.runtime.models.react.flow.impl.FlowPackageImpl#getAlign()
		 * @generated
		 */
		EEnum ALIGN = eINSTANCE.getAlign();

	}

} //FlowPackage
