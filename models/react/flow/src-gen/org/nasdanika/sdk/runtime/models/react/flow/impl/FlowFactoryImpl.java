/**
 */
package org.nasdanika.sdk.runtime.models.react.flow.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.nasdanika.sdk.runtime.models.react.flow.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FlowFactoryImpl extends EFactoryImpl implements FlowFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FlowFactory init() {
		try {
			FlowFactory theFlowFactory = (FlowFactory)EPackage.Registry.INSTANCE.getEFactory(FlowPackage.eNS_URI);
			if (theFlowFactory != null) {
				return theFlowFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new FlowFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlowFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case FlowPackage.XY_POSITION: return createXYPosition();
			case FlowPackage.FLOW_DATA: return createFlowData();
			case FlowPackage.DATA_VALUE: return createDataValue();
			case FlowPackage.FLOW_NODE: return createFlowNode();
			case FlowPackage.EDGE_MARKER: return createEdgeMarker();
			case FlowPackage.FLOW_EDGE: return createFlowEdge();
			case FlowPackage.EDGE_OPTIONS: return createEdgeOptions();
			case FlowPackage.PRO_OPTIONS: return createProOptions();
			case FlowPackage.FLOW_TYPES: return createFlowTypes();
			case FlowPackage.FLOW_TYPE: return createFlowType();
			case FlowPackage.REACT_FLOW_PROVIDER: return createReactFlowProvider();
			case FlowPackage.REACT_FLOW: return createReactFlow();
			case FlowPackage.BACKGROUND: return createBackground();
			case FlowPackage.CONTROLS: return createControls();
			case FlowPackage.MINI_MAP: return createMiniMap();
			case FlowPackage.PANEL: return createPanel();
			case FlowPackage.HANDLE: return createHandle();
			case FlowPackage.NODE_TOOLBAR: return createNodeToolbar();
			case FlowPackage.NODE_RESIZER: return createNodeResizer();
			case FlowPackage.NODES_STATE: return createNodesState();
			case FlowPackage.EDGES_STATE: return createEdgesState();
			case FlowPackage.REACT_FLOW_INSTANCE: return createReactFlowInstance();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case FlowPackage.HANDLE_POSITION:
				return createHandlePositionFromString(eDataType, initialValue);
			case FlowPackage.MARKER_KIND:
				return createMarkerKindFromString(eDataType, initialValue);
			case FlowPackage.CONNECTION_LINE_TYPE:
				return createConnectionLineTypeFromString(eDataType, initialValue);
			case FlowPackage.BACKGROUND_VARIANT:
				return createBackgroundVariantFromString(eDataType, initialValue);
			case FlowPackage.EDGE_TYPE:
				return createEdgeTypeFromString(eDataType, initialValue);
			case FlowPackage.NODE_TYPE:
				return createNodeTypeFromString(eDataType, initialValue);
			case FlowPackage.COLOR_MODE:
				return createColorModeFromString(eDataType, initialValue);
			case FlowPackage.PANEL_POSITION:
				return createPanelPositionFromString(eDataType, initialValue);
			case FlowPackage.ORIENTATION:
				return createOrientationFromString(eDataType, initialValue);
			case FlowPackage.HANDLE_TYPE:
				return createHandleTypeFromString(eDataType, initialValue);
			case FlowPackage.ALIGN:
				return createAlignFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case FlowPackage.HANDLE_POSITION:
				return convertHandlePositionToString(eDataType, instanceValue);
			case FlowPackage.MARKER_KIND:
				return convertMarkerKindToString(eDataType, instanceValue);
			case FlowPackage.CONNECTION_LINE_TYPE:
				return convertConnectionLineTypeToString(eDataType, instanceValue);
			case FlowPackage.BACKGROUND_VARIANT:
				return convertBackgroundVariantToString(eDataType, instanceValue);
			case FlowPackage.EDGE_TYPE:
				return convertEdgeTypeToString(eDataType, instanceValue);
			case FlowPackage.NODE_TYPE:
				return convertNodeTypeToString(eDataType, instanceValue);
			case FlowPackage.COLOR_MODE:
				return convertColorModeToString(eDataType, instanceValue);
			case FlowPackage.PANEL_POSITION:
				return convertPanelPositionToString(eDataType, instanceValue);
			case FlowPackage.ORIENTATION:
				return convertOrientationToString(eDataType, instanceValue);
			case FlowPackage.HANDLE_TYPE:
				return convertHandleTypeToString(eDataType, instanceValue);
			case FlowPackage.ALIGN:
				return convertAlignToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XYPosition createXYPosition() {
		XYPositionImpl xyPosition = new XYPositionImpl();
		return xyPosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlowData createFlowData() {
		FlowDataImpl flowData = new FlowDataImpl();
		return flowData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataValue createDataValue() {
		DataValueImpl dataValue = new DataValueImpl();
		return dataValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlowNode createFlowNode() {
		FlowNodeImpl flowNode = new FlowNodeImpl();
		return flowNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EdgeMarker createEdgeMarker() {
		EdgeMarkerImpl edgeMarker = new EdgeMarkerImpl();
		return edgeMarker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlowEdge createFlowEdge() {
		FlowEdgeImpl flowEdge = new FlowEdgeImpl();
		return flowEdge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EdgeOptions createEdgeOptions() {
		EdgeOptionsImpl edgeOptions = new EdgeOptionsImpl();
		return edgeOptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProOptions createProOptions() {
		ProOptionsImpl proOptions = new ProOptionsImpl();
		return proOptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlowTypes createFlowTypes() {
		FlowTypesImpl flowTypes = new FlowTypesImpl();
		return flowTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlowType createFlowType() {
		FlowTypeImpl flowType = new FlowTypeImpl();
		return flowType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReactFlowProvider createReactFlowProvider() {
		ReactFlowProviderImpl reactFlowProvider = new ReactFlowProviderImpl();
		return reactFlowProvider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReactFlow createReactFlow() {
		ReactFlowImpl reactFlow = new ReactFlowImpl();
		return reactFlow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Background createBackground() {
		BackgroundImpl background = new BackgroundImpl();
		return background;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Controls createControls() {
		ControlsImpl controls = new ControlsImpl();
		return controls;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MiniMap createMiniMap() {
		MiniMapImpl miniMap = new MiniMapImpl();
		return miniMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Panel createPanel() {
		PanelImpl panel = new PanelImpl();
		return panel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Handle createHandle() {
		HandleImpl handle = new HandleImpl();
		return handle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeToolbar createNodeToolbar() {
		NodeToolbarImpl nodeToolbar = new NodeToolbarImpl();
		return nodeToolbar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeResizer createNodeResizer() {
		NodeResizerImpl nodeResizer = new NodeResizerImpl();
		return nodeResizer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodesState createNodesState() {
		NodesStateImpl nodesState = new NodesStateImpl();
		return nodesState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EdgesState createEdgesState() {
		EdgesStateImpl edgesState = new EdgesStateImpl();
		return edgesState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReactFlowInstance createReactFlowInstance() {
		ReactFlowInstanceImpl reactFlowInstance = new ReactFlowInstanceImpl();
		return reactFlowInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HandlePosition createHandlePositionFromString(EDataType eDataType, String initialValue) {
		HandlePosition result = HandlePosition.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertHandlePositionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MarkerKind createMarkerKindFromString(EDataType eDataType, String initialValue) {
		MarkerKind result = MarkerKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMarkerKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectionLineType createConnectionLineTypeFromString(EDataType eDataType, String initialValue) {
		ConnectionLineType result = ConnectionLineType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConnectionLineTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BackgroundVariant createBackgroundVariantFromString(EDataType eDataType, String initialValue) {
		BackgroundVariant result = BackgroundVariant.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBackgroundVariantToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EdgeType createEdgeTypeFromString(EDataType eDataType, String initialValue) {
		EdgeType result = EdgeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEdgeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeType createNodeTypeFromString(EDataType eDataType, String initialValue) {
		NodeType result = NodeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNodeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ColorMode createColorModeFromString(EDataType eDataType, String initialValue) {
		ColorMode result = ColorMode.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertColorModeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PanelPosition createPanelPositionFromString(EDataType eDataType, String initialValue) {
		PanelPosition result = PanelPosition.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPanelPositionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Orientation createOrientationFromString(EDataType eDataType, String initialValue) {
		Orientation result = Orientation.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOrientationToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HandleType createHandleTypeFromString(EDataType eDataType, String initialValue) {
		HandleType result = HandleType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertHandleTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Align createAlignFromString(EDataType eDataType, String initialValue) {
		Align result = Align.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAlignToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlowPackage getFlowPackage() {
		return (FlowPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static FlowPackage getPackage() {
		return FlowPackage.eINSTANCE;
	}

} //FlowFactoryImpl
