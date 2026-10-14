/**
 */
package org.nasdanika.sdk.runtime.models.react.flow.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.sdk.runtime.models.react.flow.Background;
import org.nasdanika.sdk.runtime.models.react.flow.ColorMode;
import org.nasdanika.sdk.runtime.models.react.flow.ConnectionLineType;
import org.nasdanika.sdk.runtime.models.react.flow.Controls;
import org.nasdanika.sdk.runtime.models.react.flow.EdgeOptions;
import org.nasdanika.sdk.runtime.models.react.flow.FlowEdge;
import org.nasdanika.sdk.runtime.models.react.flow.FlowNode;
import org.nasdanika.sdk.runtime.models.react.flow.FlowPackage;
import org.nasdanika.sdk.runtime.models.react.flow.MiniMap;
import org.nasdanika.sdk.runtime.models.react.flow.Panel;
import org.nasdanika.sdk.runtime.models.react.flow.ProOptions;
import org.nasdanika.sdk.runtime.models.react.flow.ReactFlow;

import org.nasdanika.sdk.runtime.models.typescript.VariableDeclaration;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>React Flow</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.flow.impl.ReactFlowImpl#getNodes <em>Nodes</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.flow.impl.ReactFlowImpl#getEdges <em>Edges</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.flow.impl.ReactFlowImpl#getNodeTypes <em>Node Types</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.flow.impl.ReactFlowImpl#getEdgeTypes <em>Edge Types</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.flow.impl.ReactFlowImpl#isFitView <em>Fit View</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.flow.impl.ReactFlowImpl#getMinZoom <em>Min Zoom</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.flow.impl.ReactFlowImpl#getMaxZoom <em>Max Zoom</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.flow.impl.ReactFlowImpl#isNodesDraggable <em>Nodes Draggable</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.flow.impl.ReactFlowImpl#isNodesConnectable <em>Nodes Connectable</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.flow.impl.ReactFlowImpl#isElementsSelectable <em>Elements Selectable</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.flow.impl.ReactFlowImpl#isPanOnDrag <em>Pan On Drag</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.flow.impl.ReactFlowImpl#isZoomOnScroll <em>Zoom On Scroll</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.flow.impl.ReactFlowImpl#isZoomOnDoubleClick <em>Zoom On Double Click</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.flow.impl.ReactFlowImpl#isSnapToGrid <em>Snap To Grid</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.flow.impl.ReactFlowImpl#getSnapGrid <em>Snap Grid</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.flow.impl.ReactFlowImpl#getColorMode <em>Color Mode</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.flow.impl.ReactFlowImpl#getDeleteKeyCode <em>Delete Key Code</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.flow.impl.ReactFlowImpl#getConnectionLineType <em>Connection Line Type</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.flow.impl.ReactFlowImpl#getDefaultEdgeOptions <em>Default Edge Options</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.flow.impl.ReactFlowImpl#getProOptions <em>Pro Options</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.flow.impl.ReactFlowImpl#getBackground <em>Background</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.flow.impl.ReactFlowImpl#getControls <em>Controls</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.flow.impl.ReactFlowImpl#getMiniMap <em>Mini Map</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.flow.impl.ReactFlowImpl#getPanels <em>Panels</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReactFlowImpl extends FlowComponentImpl implements ReactFlow {
	/**
	 * The default value of the '{@link #isFitView() <em>Fit View</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFitView()
	 * @generated
	 * @ordered
	 */
	protected static final boolean FIT_VIEW_EDEFAULT = false;

	/**
	 * The default value of the '{@link #getMinZoom() <em>Min Zoom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinZoom()
	 * @generated
	 * @ordered
	 */
	protected static final double MIN_ZOOM_EDEFAULT = 0.0;

	/**
	 * The default value of the '{@link #getMaxZoom() <em>Max Zoom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxZoom()
	 * @generated
	 * @ordered
	 */
	protected static final double MAX_ZOOM_EDEFAULT = 0.0;

	/**
	 * The default value of the '{@link #isNodesDraggable() <em>Nodes Draggable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNodesDraggable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean NODES_DRAGGABLE_EDEFAULT = false;

	/**
	 * The default value of the '{@link #isNodesConnectable() <em>Nodes Connectable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNodesConnectable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean NODES_CONNECTABLE_EDEFAULT = false;

	/**
	 * The default value of the '{@link #isElementsSelectable() <em>Elements Selectable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isElementsSelectable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ELEMENTS_SELECTABLE_EDEFAULT = false;

	/**
	 * The default value of the '{@link #isPanOnDrag() <em>Pan On Drag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPanOnDrag()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PAN_ON_DRAG_EDEFAULT = false;

	/**
	 * The default value of the '{@link #isZoomOnScroll() <em>Zoom On Scroll</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isZoomOnScroll()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ZOOM_ON_SCROLL_EDEFAULT = false;

	/**
	 * The default value of the '{@link #isZoomOnDoubleClick() <em>Zoom On Double Click</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isZoomOnDoubleClick()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ZOOM_ON_DOUBLE_CLICK_EDEFAULT = false;

	/**
	 * The default value of the '{@link #isSnapToGrid() <em>Snap To Grid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSnapToGrid()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SNAP_TO_GRID_EDEFAULT = false;

	/**
	 * The default value of the '{@link #getColorMode() <em>Color Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColorMode()
	 * @generated
	 * @ordered
	 */
	protected static final ColorMode COLOR_MODE_EDEFAULT = ColorMode.LIGHT;

	/**
	 * The default value of the '{@link #getConnectionLineType() <em>Connection Line Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectionLineType()
	 * @generated
	 * @ordered
	 */
	protected static final ConnectionLineType CONNECTION_LINE_TYPE_EDEFAULT = ConnectionLineType.BEZIER;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReactFlowImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FlowPackage.Literals.REACT_FLOW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<FlowNode> getNodes() {
		return (EList<FlowNode>)eDynamicGet(FlowPackage.REACT_FLOW__NODES, FlowPackage.Literals.REACT_FLOW__NODES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<FlowEdge> getEdges() {
		return (EList<FlowEdge>)eDynamicGet(FlowPackage.REACT_FLOW__EDGES, FlowPackage.Literals.REACT_FLOW__EDGES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableDeclaration getNodeTypes() {
		return (VariableDeclaration)eDynamicGet(FlowPackage.REACT_FLOW__NODE_TYPES, FlowPackage.Literals.REACT_FLOW__NODE_TYPES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableDeclaration basicGetNodeTypes() {
		return (VariableDeclaration)eDynamicGet(FlowPackage.REACT_FLOW__NODE_TYPES, FlowPackage.Literals.REACT_FLOW__NODE_TYPES, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNodeTypes(VariableDeclaration newNodeTypes) {
		eDynamicSet(FlowPackage.REACT_FLOW__NODE_TYPES, FlowPackage.Literals.REACT_FLOW__NODE_TYPES, newNodeTypes);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableDeclaration getEdgeTypes() {
		return (VariableDeclaration)eDynamicGet(FlowPackage.REACT_FLOW__EDGE_TYPES, FlowPackage.Literals.REACT_FLOW__EDGE_TYPES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableDeclaration basicGetEdgeTypes() {
		return (VariableDeclaration)eDynamicGet(FlowPackage.REACT_FLOW__EDGE_TYPES, FlowPackage.Literals.REACT_FLOW__EDGE_TYPES, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEdgeTypes(VariableDeclaration newEdgeTypes) {
		eDynamicSet(FlowPackage.REACT_FLOW__EDGE_TYPES, FlowPackage.Literals.REACT_FLOW__EDGE_TYPES, newEdgeTypes);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isFitView() {
		return (Boolean)eDynamicGet(FlowPackage.REACT_FLOW__FIT_VIEW, FlowPackage.Literals.REACT_FLOW__FIT_VIEW, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFitView(boolean newFitView) {
		eDynamicSet(FlowPackage.REACT_FLOW__FIT_VIEW, FlowPackage.Literals.REACT_FLOW__FIT_VIEW, newFitView);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMinZoom() {
		return (Double)eDynamicGet(FlowPackage.REACT_FLOW__MIN_ZOOM, FlowPackage.Literals.REACT_FLOW__MIN_ZOOM, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinZoom(double newMinZoom) {
		eDynamicSet(FlowPackage.REACT_FLOW__MIN_ZOOM, FlowPackage.Literals.REACT_FLOW__MIN_ZOOM, newMinZoom);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMinZoom() {
		eDynamicUnset(FlowPackage.REACT_FLOW__MIN_ZOOM, FlowPackage.Literals.REACT_FLOW__MIN_ZOOM);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMinZoom() {
		return eDynamicIsSet(FlowPackage.REACT_FLOW__MIN_ZOOM, FlowPackage.Literals.REACT_FLOW__MIN_ZOOM);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMaxZoom() {
		return (Double)eDynamicGet(FlowPackage.REACT_FLOW__MAX_ZOOM, FlowPackage.Literals.REACT_FLOW__MAX_ZOOM, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxZoom(double newMaxZoom) {
		eDynamicSet(FlowPackage.REACT_FLOW__MAX_ZOOM, FlowPackage.Literals.REACT_FLOW__MAX_ZOOM, newMaxZoom);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMaxZoom() {
		eDynamicUnset(FlowPackage.REACT_FLOW__MAX_ZOOM, FlowPackage.Literals.REACT_FLOW__MAX_ZOOM);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMaxZoom() {
		return eDynamicIsSet(FlowPackage.REACT_FLOW__MAX_ZOOM, FlowPackage.Literals.REACT_FLOW__MAX_ZOOM);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isNodesDraggable() {
		return (Boolean)eDynamicGet(FlowPackage.REACT_FLOW__NODES_DRAGGABLE, FlowPackage.Literals.REACT_FLOW__NODES_DRAGGABLE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNodesDraggable(boolean newNodesDraggable) {
		eDynamicSet(FlowPackage.REACT_FLOW__NODES_DRAGGABLE, FlowPackage.Literals.REACT_FLOW__NODES_DRAGGABLE, newNodesDraggable);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNodesDraggable() {
		eDynamicUnset(FlowPackage.REACT_FLOW__NODES_DRAGGABLE, FlowPackage.Literals.REACT_FLOW__NODES_DRAGGABLE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNodesDraggable() {
		return eDynamicIsSet(FlowPackage.REACT_FLOW__NODES_DRAGGABLE, FlowPackage.Literals.REACT_FLOW__NODES_DRAGGABLE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isNodesConnectable() {
		return (Boolean)eDynamicGet(FlowPackage.REACT_FLOW__NODES_CONNECTABLE, FlowPackage.Literals.REACT_FLOW__NODES_CONNECTABLE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNodesConnectable(boolean newNodesConnectable) {
		eDynamicSet(FlowPackage.REACT_FLOW__NODES_CONNECTABLE, FlowPackage.Literals.REACT_FLOW__NODES_CONNECTABLE, newNodesConnectable);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNodesConnectable() {
		eDynamicUnset(FlowPackage.REACT_FLOW__NODES_CONNECTABLE, FlowPackage.Literals.REACT_FLOW__NODES_CONNECTABLE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNodesConnectable() {
		return eDynamicIsSet(FlowPackage.REACT_FLOW__NODES_CONNECTABLE, FlowPackage.Literals.REACT_FLOW__NODES_CONNECTABLE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isElementsSelectable() {
		return (Boolean)eDynamicGet(FlowPackage.REACT_FLOW__ELEMENTS_SELECTABLE, FlowPackage.Literals.REACT_FLOW__ELEMENTS_SELECTABLE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElementsSelectable(boolean newElementsSelectable) {
		eDynamicSet(FlowPackage.REACT_FLOW__ELEMENTS_SELECTABLE, FlowPackage.Literals.REACT_FLOW__ELEMENTS_SELECTABLE, newElementsSelectable);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetElementsSelectable() {
		eDynamicUnset(FlowPackage.REACT_FLOW__ELEMENTS_SELECTABLE, FlowPackage.Literals.REACT_FLOW__ELEMENTS_SELECTABLE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetElementsSelectable() {
		return eDynamicIsSet(FlowPackage.REACT_FLOW__ELEMENTS_SELECTABLE, FlowPackage.Literals.REACT_FLOW__ELEMENTS_SELECTABLE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isPanOnDrag() {
		return (Boolean)eDynamicGet(FlowPackage.REACT_FLOW__PAN_ON_DRAG, FlowPackage.Literals.REACT_FLOW__PAN_ON_DRAG, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPanOnDrag(boolean newPanOnDrag) {
		eDynamicSet(FlowPackage.REACT_FLOW__PAN_ON_DRAG, FlowPackage.Literals.REACT_FLOW__PAN_ON_DRAG, newPanOnDrag);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPanOnDrag() {
		eDynamicUnset(FlowPackage.REACT_FLOW__PAN_ON_DRAG, FlowPackage.Literals.REACT_FLOW__PAN_ON_DRAG);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPanOnDrag() {
		return eDynamicIsSet(FlowPackage.REACT_FLOW__PAN_ON_DRAG, FlowPackage.Literals.REACT_FLOW__PAN_ON_DRAG);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isZoomOnScroll() {
		return (Boolean)eDynamicGet(FlowPackage.REACT_FLOW__ZOOM_ON_SCROLL, FlowPackage.Literals.REACT_FLOW__ZOOM_ON_SCROLL, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setZoomOnScroll(boolean newZoomOnScroll) {
		eDynamicSet(FlowPackage.REACT_FLOW__ZOOM_ON_SCROLL, FlowPackage.Literals.REACT_FLOW__ZOOM_ON_SCROLL, newZoomOnScroll);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetZoomOnScroll() {
		eDynamicUnset(FlowPackage.REACT_FLOW__ZOOM_ON_SCROLL, FlowPackage.Literals.REACT_FLOW__ZOOM_ON_SCROLL);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetZoomOnScroll() {
		return eDynamicIsSet(FlowPackage.REACT_FLOW__ZOOM_ON_SCROLL, FlowPackage.Literals.REACT_FLOW__ZOOM_ON_SCROLL);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isZoomOnDoubleClick() {
		return (Boolean)eDynamicGet(FlowPackage.REACT_FLOW__ZOOM_ON_DOUBLE_CLICK, FlowPackage.Literals.REACT_FLOW__ZOOM_ON_DOUBLE_CLICK, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setZoomOnDoubleClick(boolean newZoomOnDoubleClick) {
		eDynamicSet(FlowPackage.REACT_FLOW__ZOOM_ON_DOUBLE_CLICK, FlowPackage.Literals.REACT_FLOW__ZOOM_ON_DOUBLE_CLICK, newZoomOnDoubleClick);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetZoomOnDoubleClick() {
		eDynamicUnset(FlowPackage.REACT_FLOW__ZOOM_ON_DOUBLE_CLICK, FlowPackage.Literals.REACT_FLOW__ZOOM_ON_DOUBLE_CLICK);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetZoomOnDoubleClick() {
		return eDynamicIsSet(FlowPackage.REACT_FLOW__ZOOM_ON_DOUBLE_CLICK, FlowPackage.Literals.REACT_FLOW__ZOOM_ON_DOUBLE_CLICK);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSnapToGrid() {
		return (Boolean)eDynamicGet(FlowPackage.REACT_FLOW__SNAP_TO_GRID, FlowPackage.Literals.REACT_FLOW__SNAP_TO_GRID, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSnapToGrid(boolean newSnapToGrid) {
		eDynamicSet(FlowPackage.REACT_FLOW__SNAP_TO_GRID, FlowPackage.Literals.REACT_FLOW__SNAP_TO_GRID, newSnapToGrid);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Integer> getSnapGrid() {
		return (EList<Integer>)eDynamicGet(FlowPackage.REACT_FLOW__SNAP_GRID, FlowPackage.Literals.REACT_FLOW__SNAP_GRID, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ColorMode getColorMode() {
		return (ColorMode)eDynamicGet(FlowPackage.REACT_FLOW__COLOR_MODE, FlowPackage.Literals.REACT_FLOW__COLOR_MODE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColorMode(ColorMode newColorMode) {
		eDynamicSet(FlowPackage.REACT_FLOW__COLOR_MODE, FlowPackage.Literals.REACT_FLOW__COLOR_MODE, newColorMode);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetColorMode() {
		eDynamicUnset(FlowPackage.REACT_FLOW__COLOR_MODE, FlowPackage.Literals.REACT_FLOW__COLOR_MODE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetColorMode() {
		return eDynamicIsSet(FlowPackage.REACT_FLOW__COLOR_MODE, FlowPackage.Literals.REACT_FLOW__COLOR_MODE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<String> getDeleteKeyCode() {
		return (EList<String>)eDynamicGet(FlowPackage.REACT_FLOW__DELETE_KEY_CODE, FlowPackage.Literals.REACT_FLOW__DELETE_KEY_CODE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectionLineType getConnectionLineType() {
		return (ConnectionLineType)eDynamicGet(FlowPackage.REACT_FLOW__CONNECTION_LINE_TYPE, FlowPackage.Literals.REACT_FLOW__CONNECTION_LINE_TYPE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConnectionLineType(ConnectionLineType newConnectionLineType) {
		eDynamicSet(FlowPackage.REACT_FLOW__CONNECTION_LINE_TYPE, FlowPackage.Literals.REACT_FLOW__CONNECTION_LINE_TYPE, newConnectionLineType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetConnectionLineType() {
		eDynamicUnset(FlowPackage.REACT_FLOW__CONNECTION_LINE_TYPE, FlowPackage.Literals.REACT_FLOW__CONNECTION_LINE_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetConnectionLineType() {
		return eDynamicIsSet(FlowPackage.REACT_FLOW__CONNECTION_LINE_TYPE, FlowPackage.Literals.REACT_FLOW__CONNECTION_LINE_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EdgeOptions getDefaultEdgeOptions() {
		return (EdgeOptions)eDynamicGet(FlowPackage.REACT_FLOW__DEFAULT_EDGE_OPTIONS, FlowPackage.Literals.REACT_FLOW__DEFAULT_EDGE_OPTIONS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefaultEdgeOptions(EdgeOptions newDefaultEdgeOptions, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newDefaultEdgeOptions, FlowPackage.REACT_FLOW__DEFAULT_EDGE_OPTIONS, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultEdgeOptions(EdgeOptions newDefaultEdgeOptions) {
		eDynamicSet(FlowPackage.REACT_FLOW__DEFAULT_EDGE_OPTIONS, FlowPackage.Literals.REACT_FLOW__DEFAULT_EDGE_OPTIONS, newDefaultEdgeOptions);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProOptions getProOptions() {
		return (ProOptions)eDynamicGet(FlowPackage.REACT_FLOW__PRO_OPTIONS, FlowPackage.Literals.REACT_FLOW__PRO_OPTIONS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProOptions(ProOptions newProOptions, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newProOptions, FlowPackage.REACT_FLOW__PRO_OPTIONS, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProOptions(ProOptions newProOptions) {
		eDynamicSet(FlowPackage.REACT_FLOW__PRO_OPTIONS, FlowPackage.Literals.REACT_FLOW__PRO_OPTIONS, newProOptions);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Background getBackground() {
		return (Background)eDynamicGet(FlowPackage.REACT_FLOW__BACKGROUND, FlowPackage.Literals.REACT_FLOW__BACKGROUND, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBackground(Background newBackground, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newBackground, FlowPackage.REACT_FLOW__BACKGROUND, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBackground(Background newBackground) {
		eDynamicSet(FlowPackage.REACT_FLOW__BACKGROUND, FlowPackage.Literals.REACT_FLOW__BACKGROUND, newBackground);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Controls getControls() {
		return (Controls)eDynamicGet(FlowPackage.REACT_FLOW__CONTROLS, FlowPackage.Literals.REACT_FLOW__CONTROLS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetControls(Controls newControls, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newControls, FlowPackage.REACT_FLOW__CONTROLS, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setControls(Controls newControls) {
		eDynamicSet(FlowPackage.REACT_FLOW__CONTROLS, FlowPackage.Literals.REACT_FLOW__CONTROLS, newControls);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MiniMap getMiniMap() {
		return (MiniMap)eDynamicGet(FlowPackage.REACT_FLOW__MINI_MAP, FlowPackage.Literals.REACT_FLOW__MINI_MAP, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMiniMap(MiniMap newMiniMap, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newMiniMap, FlowPackage.REACT_FLOW__MINI_MAP, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMiniMap(MiniMap newMiniMap) {
		eDynamicSet(FlowPackage.REACT_FLOW__MINI_MAP, FlowPackage.Literals.REACT_FLOW__MINI_MAP, newMiniMap);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Panel> getPanels() {
		return (EList<Panel>)eDynamicGet(FlowPackage.REACT_FLOW__PANELS, FlowPackage.Literals.REACT_FLOW__PANELS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FlowPackage.REACT_FLOW__NODES:
				return ((InternalEList<?>)getNodes()).basicRemove(otherEnd, msgs);
			case FlowPackage.REACT_FLOW__EDGES:
				return ((InternalEList<?>)getEdges()).basicRemove(otherEnd, msgs);
			case FlowPackage.REACT_FLOW__DEFAULT_EDGE_OPTIONS:
				return basicSetDefaultEdgeOptions(null, msgs);
			case FlowPackage.REACT_FLOW__PRO_OPTIONS:
				return basicSetProOptions(null, msgs);
			case FlowPackage.REACT_FLOW__BACKGROUND:
				return basicSetBackground(null, msgs);
			case FlowPackage.REACT_FLOW__CONTROLS:
				return basicSetControls(null, msgs);
			case FlowPackage.REACT_FLOW__MINI_MAP:
				return basicSetMiniMap(null, msgs);
			case FlowPackage.REACT_FLOW__PANELS:
				return ((InternalEList<?>)getPanels()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FlowPackage.REACT_FLOW__NODES:
				return getNodes();
			case FlowPackage.REACT_FLOW__EDGES:
				return getEdges();
			case FlowPackage.REACT_FLOW__NODE_TYPES:
				if (resolve) return getNodeTypes();
				return basicGetNodeTypes();
			case FlowPackage.REACT_FLOW__EDGE_TYPES:
				if (resolve) return getEdgeTypes();
				return basicGetEdgeTypes();
			case FlowPackage.REACT_FLOW__FIT_VIEW:
				return isFitView();
			case FlowPackage.REACT_FLOW__MIN_ZOOM:
				return getMinZoom();
			case FlowPackage.REACT_FLOW__MAX_ZOOM:
				return getMaxZoom();
			case FlowPackage.REACT_FLOW__NODES_DRAGGABLE:
				return isNodesDraggable();
			case FlowPackage.REACT_FLOW__NODES_CONNECTABLE:
				return isNodesConnectable();
			case FlowPackage.REACT_FLOW__ELEMENTS_SELECTABLE:
				return isElementsSelectable();
			case FlowPackage.REACT_FLOW__PAN_ON_DRAG:
				return isPanOnDrag();
			case FlowPackage.REACT_FLOW__ZOOM_ON_SCROLL:
				return isZoomOnScroll();
			case FlowPackage.REACT_FLOW__ZOOM_ON_DOUBLE_CLICK:
				return isZoomOnDoubleClick();
			case FlowPackage.REACT_FLOW__SNAP_TO_GRID:
				return isSnapToGrid();
			case FlowPackage.REACT_FLOW__SNAP_GRID:
				return getSnapGrid();
			case FlowPackage.REACT_FLOW__COLOR_MODE:
				return getColorMode();
			case FlowPackage.REACT_FLOW__DELETE_KEY_CODE:
				return getDeleteKeyCode();
			case FlowPackage.REACT_FLOW__CONNECTION_LINE_TYPE:
				return getConnectionLineType();
			case FlowPackage.REACT_FLOW__DEFAULT_EDGE_OPTIONS:
				return getDefaultEdgeOptions();
			case FlowPackage.REACT_FLOW__PRO_OPTIONS:
				return getProOptions();
			case FlowPackage.REACT_FLOW__BACKGROUND:
				return getBackground();
			case FlowPackage.REACT_FLOW__CONTROLS:
				return getControls();
			case FlowPackage.REACT_FLOW__MINI_MAP:
				return getMiniMap();
			case FlowPackage.REACT_FLOW__PANELS:
				return getPanels();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case FlowPackage.REACT_FLOW__NODES:
				getNodes().clear();
				getNodes().addAll((Collection<? extends FlowNode>)newValue);
				return;
			case FlowPackage.REACT_FLOW__EDGES:
				getEdges().clear();
				getEdges().addAll((Collection<? extends FlowEdge>)newValue);
				return;
			case FlowPackage.REACT_FLOW__NODE_TYPES:
				setNodeTypes((VariableDeclaration)newValue);
				return;
			case FlowPackage.REACT_FLOW__EDGE_TYPES:
				setEdgeTypes((VariableDeclaration)newValue);
				return;
			case FlowPackage.REACT_FLOW__FIT_VIEW:
				setFitView((Boolean)newValue);
				return;
			case FlowPackage.REACT_FLOW__MIN_ZOOM:
				setMinZoom((Double)newValue);
				return;
			case FlowPackage.REACT_FLOW__MAX_ZOOM:
				setMaxZoom((Double)newValue);
				return;
			case FlowPackage.REACT_FLOW__NODES_DRAGGABLE:
				setNodesDraggable((Boolean)newValue);
				return;
			case FlowPackage.REACT_FLOW__NODES_CONNECTABLE:
				setNodesConnectable((Boolean)newValue);
				return;
			case FlowPackage.REACT_FLOW__ELEMENTS_SELECTABLE:
				setElementsSelectable((Boolean)newValue);
				return;
			case FlowPackage.REACT_FLOW__PAN_ON_DRAG:
				setPanOnDrag((Boolean)newValue);
				return;
			case FlowPackage.REACT_FLOW__ZOOM_ON_SCROLL:
				setZoomOnScroll((Boolean)newValue);
				return;
			case FlowPackage.REACT_FLOW__ZOOM_ON_DOUBLE_CLICK:
				setZoomOnDoubleClick((Boolean)newValue);
				return;
			case FlowPackage.REACT_FLOW__SNAP_TO_GRID:
				setSnapToGrid((Boolean)newValue);
				return;
			case FlowPackage.REACT_FLOW__SNAP_GRID:
				getSnapGrid().clear();
				getSnapGrid().addAll((Collection<? extends Integer>)newValue);
				return;
			case FlowPackage.REACT_FLOW__COLOR_MODE:
				setColorMode((ColorMode)newValue);
				return;
			case FlowPackage.REACT_FLOW__DELETE_KEY_CODE:
				getDeleteKeyCode().clear();
				getDeleteKeyCode().addAll((Collection<? extends String>)newValue);
				return;
			case FlowPackage.REACT_FLOW__CONNECTION_LINE_TYPE:
				setConnectionLineType((ConnectionLineType)newValue);
				return;
			case FlowPackage.REACT_FLOW__DEFAULT_EDGE_OPTIONS:
				setDefaultEdgeOptions((EdgeOptions)newValue);
				return;
			case FlowPackage.REACT_FLOW__PRO_OPTIONS:
				setProOptions((ProOptions)newValue);
				return;
			case FlowPackage.REACT_FLOW__BACKGROUND:
				setBackground((Background)newValue);
				return;
			case FlowPackage.REACT_FLOW__CONTROLS:
				setControls((Controls)newValue);
				return;
			case FlowPackage.REACT_FLOW__MINI_MAP:
				setMiniMap((MiniMap)newValue);
				return;
			case FlowPackage.REACT_FLOW__PANELS:
				getPanels().clear();
				getPanels().addAll((Collection<? extends Panel>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case FlowPackage.REACT_FLOW__NODES:
				getNodes().clear();
				return;
			case FlowPackage.REACT_FLOW__EDGES:
				getEdges().clear();
				return;
			case FlowPackage.REACT_FLOW__NODE_TYPES:
				setNodeTypes((VariableDeclaration)null);
				return;
			case FlowPackage.REACT_FLOW__EDGE_TYPES:
				setEdgeTypes((VariableDeclaration)null);
				return;
			case FlowPackage.REACT_FLOW__FIT_VIEW:
				setFitView(FIT_VIEW_EDEFAULT);
				return;
			case FlowPackage.REACT_FLOW__MIN_ZOOM:
				unsetMinZoom();
				return;
			case FlowPackage.REACT_FLOW__MAX_ZOOM:
				unsetMaxZoom();
				return;
			case FlowPackage.REACT_FLOW__NODES_DRAGGABLE:
				unsetNodesDraggable();
				return;
			case FlowPackage.REACT_FLOW__NODES_CONNECTABLE:
				unsetNodesConnectable();
				return;
			case FlowPackage.REACT_FLOW__ELEMENTS_SELECTABLE:
				unsetElementsSelectable();
				return;
			case FlowPackage.REACT_FLOW__PAN_ON_DRAG:
				unsetPanOnDrag();
				return;
			case FlowPackage.REACT_FLOW__ZOOM_ON_SCROLL:
				unsetZoomOnScroll();
				return;
			case FlowPackage.REACT_FLOW__ZOOM_ON_DOUBLE_CLICK:
				unsetZoomOnDoubleClick();
				return;
			case FlowPackage.REACT_FLOW__SNAP_TO_GRID:
				setSnapToGrid(SNAP_TO_GRID_EDEFAULT);
				return;
			case FlowPackage.REACT_FLOW__SNAP_GRID:
				getSnapGrid().clear();
				return;
			case FlowPackage.REACT_FLOW__COLOR_MODE:
				unsetColorMode();
				return;
			case FlowPackage.REACT_FLOW__DELETE_KEY_CODE:
				getDeleteKeyCode().clear();
				return;
			case FlowPackage.REACT_FLOW__CONNECTION_LINE_TYPE:
				unsetConnectionLineType();
				return;
			case FlowPackage.REACT_FLOW__DEFAULT_EDGE_OPTIONS:
				setDefaultEdgeOptions((EdgeOptions)null);
				return;
			case FlowPackage.REACT_FLOW__PRO_OPTIONS:
				setProOptions((ProOptions)null);
				return;
			case FlowPackage.REACT_FLOW__BACKGROUND:
				setBackground((Background)null);
				return;
			case FlowPackage.REACT_FLOW__CONTROLS:
				setControls((Controls)null);
				return;
			case FlowPackage.REACT_FLOW__MINI_MAP:
				setMiniMap((MiniMap)null);
				return;
			case FlowPackage.REACT_FLOW__PANELS:
				getPanels().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case FlowPackage.REACT_FLOW__NODES:
				return !getNodes().isEmpty();
			case FlowPackage.REACT_FLOW__EDGES:
				return !getEdges().isEmpty();
			case FlowPackage.REACT_FLOW__NODE_TYPES:
				return basicGetNodeTypes() != null;
			case FlowPackage.REACT_FLOW__EDGE_TYPES:
				return basicGetEdgeTypes() != null;
			case FlowPackage.REACT_FLOW__FIT_VIEW:
				return isFitView() != FIT_VIEW_EDEFAULT;
			case FlowPackage.REACT_FLOW__MIN_ZOOM:
				return isSetMinZoom();
			case FlowPackage.REACT_FLOW__MAX_ZOOM:
				return isSetMaxZoom();
			case FlowPackage.REACT_FLOW__NODES_DRAGGABLE:
				return isSetNodesDraggable();
			case FlowPackage.REACT_FLOW__NODES_CONNECTABLE:
				return isSetNodesConnectable();
			case FlowPackage.REACT_FLOW__ELEMENTS_SELECTABLE:
				return isSetElementsSelectable();
			case FlowPackage.REACT_FLOW__PAN_ON_DRAG:
				return isSetPanOnDrag();
			case FlowPackage.REACT_FLOW__ZOOM_ON_SCROLL:
				return isSetZoomOnScroll();
			case FlowPackage.REACT_FLOW__ZOOM_ON_DOUBLE_CLICK:
				return isSetZoomOnDoubleClick();
			case FlowPackage.REACT_FLOW__SNAP_TO_GRID:
				return isSnapToGrid() != SNAP_TO_GRID_EDEFAULT;
			case FlowPackage.REACT_FLOW__SNAP_GRID:
				return !getSnapGrid().isEmpty();
			case FlowPackage.REACT_FLOW__COLOR_MODE:
				return isSetColorMode();
			case FlowPackage.REACT_FLOW__DELETE_KEY_CODE:
				return !getDeleteKeyCode().isEmpty();
			case FlowPackage.REACT_FLOW__CONNECTION_LINE_TYPE:
				return isSetConnectionLineType();
			case FlowPackage.REACT_FLOW__DEFAULT_EDGE_OPTIONS:
				return getDefaultEdgeOptions() != null;
			case FlowPackage.REACT_FLOW__PRO_OPTIONS:
				return getProOptions() != null;
			case FlowPackage.REACT_FLOW__BACKGROUND:
				return getBackground() != null;
			case FlowPackage.REACT_FLOW__CONTROLS:
				return getControls() != null;
			case FlowPackage.REACT_FLOW__MINI_MAP:
				return getMiniMap() != null;
			case FlowPackage.REACT_FLOW__PANELS:
				return !getPanels().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ReactFlowImpl
