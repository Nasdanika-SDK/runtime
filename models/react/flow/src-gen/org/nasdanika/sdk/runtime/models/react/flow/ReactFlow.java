/**
 */
package org.nasdanika.sdk.runtime.models.react.flow;

import org.eclipse.emf.common.util.EList;

import org.nasdanika.sdk.runtime.models.typescript.VariableDeclaration;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>React Flow</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The flow. Its parent element needs a height.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.flow.ReactFlow#getNodes <em>Nodes</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.flow.ReactFlow#getEdges <em>Edges</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.flow.ReactFlow#getNodeTypes <em>Node Types</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.flow.ReactFlow#getEdgeTypes <em>Edge Types</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.flow.ReactFlow#isFitView <em>Fit View</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.flow.ReactFlow#getMinZoom <em>Min Zoom</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.flow.ReactFlow#getMaxZoom <em>Max Zoom</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.flow.ReactFlow#isNodesDraggable <em>Nodes Draggable</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.flow.ReactFlow#isNodesConnectable <em>Nodes Connectable</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.flow.ReactFlow#isElementsSelectable <em>Elements Selectable</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.flow.ReactFlow#isPanOnDrag <em>Pan On Drag</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.flow.ReactFlow#isZoomOnScroll <em>Zoom On Scroll</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.flow.ReactFlow#isZoomOnDoubleClick <em>Zoom On Double Click</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.flow.ReactFlow#isSnapToGrid <em>Snap To Grid</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.flow.ReactFlow#getSnapGrid <em>Snap Grid</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.flow.ReactFlow#getColorMode <em>Color Mode</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.flow.ReactFlow#getDeleteKeyCode <em>Delete Key Code</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.flow.ReactFlow#getConnectionLineType <em>Connection Line Type</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.flow.ReactFlow#getDefaultEdgeOptions <em>Default Edge Options</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.flow.ReactFlow#getProOptions <em>Pro Options</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.flow.ReactFlow#getBackground <em>Background</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.flow.ReactFlow#getControls <em>Controls</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.flow.ReactFlow#getMiniMap <em>Mini Map</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.flow.ReactFlow#getPanels <em>Panels</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.sdk.runtime.models.react.flow.FlowPackage#getReactFlow()
 * @model annotation="urn:org.nasdanika:react component='ReactFlow'"
 * @generated
 */
public interface ReactFlow extends FlowComponent {
	/**
	 * Returns the value of the '<em><b>Nodes</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.sdk.runtime.models.react.flow.FlowNode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Initial nodes of an uncontrolled flow
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Nodes</em>' containment reference list.
	 * @see org.nasdanika.sdk.runtime.models.react.flow.FlowPackage#getReactFlow_Nodes()
	 * @model containment="true"
	 *        annotation="urn:org.nasdanika:react prop='defaultNodes'"
	 * @generated
	 */
	EList<FlowNode> getNodes();

	/**
	 * Returns the value of the '<em><b>Edges</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.sdk.runtime.models.react.flow.FlowEdge}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Initial edges of an uncontrolled flow
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Edges</em>' containment reference list.
	 * @see org.nasdanika.sdk.runtime.models.react.flow.FlowPackage#getReactFlow_Edges()
	 * @model containment="true"
	 *        annotation="urn:org.nasdanika:react prop='defaultEdges'"
	 * @generated
	 */
	EList<FlowEdge> getEdges();

	/**
	 * Returns the value of the '<em><b>Node Types</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Constant with FlowTypes of custom nodes
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Node Types</em>' reference.
	 * @see #setNodeTypes(VariableDeclaration)
	 * @see org.nasdanika.sdk.runtime.models.react.flow.FlowPackage#getReactFlow_NodeTypes()
	 * @model
	 * @generated
	 */
	VariableDeclaration getNodeTypes();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.react.flow.ReactFlow#getNodeTypes <em>Node Types</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Node Types</em>' reference.
	 * @see #getNodeTypes()
	 * @generated
	 */
	void setNodeTypes(VariableDeclaration value);

	/**
	 * Returns the value of the '<em><b>Edge Types</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Constant with FlowTypes of custom edges
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Edge Types</em>' reference.
	 * @see #setEdgeTypes(VariableDeclaration)
	 * @see org.nasdanika.sdk.runtime.models.react.flow.FlowPackage#getReactFlow_EdgeTypes()
	 * @model
	 * @generated
	 */
	VariableDeclaration getEdgeTypes();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.react.flow.ReactFlow#getEdgeTypes <em>Edge Types</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Edge Types</em>' reference.
	 * @see #getEdgeTypes()
	 * @generated
	 */
	void setEdgeTypes(VariableDeclaration value);

	/**
	 * Returns the value of the '<em><b>Fit View</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fit View</em>' attribute.
	 * @see #setFitView(boolean)
	 * @see org.nasdanika.sdk.runtime.models.react.flow.FlowPackage#getReactFlow_FitView()
	 * @model unique="false"
	 * @generated
	 */
	boolean isFitView();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.react.flow.ReactFlow#isFitView <em>Fit View</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fit View</em>' attribute.
	 * @see #isFitView()
	 * @generated
	 */
	void setFitView(boolean value);

	/**
	 * Returns the value of the '<em><b>Min Zoom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Zoom</em>' attribute.
	 * @see #isSetMinZoom()
	 * @see #unsetMinZoom()
	 * @see #setMinZoom(double)
	 * @see org.nasdanika.sdk.runtime.models.react.flow.FlowPackage#getReactFlow_MinZoom()
	 * @model unique="false" unsettable="true"
	 * @generated
	 */
	double getMinZoom();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.react.flow.ReactFlow#getMinZoom <em>Min Zoom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Zoom</em>' attribute.
	 * @see #isSetMinZoom()
	 * @see #unsetMinZoom()
	 * @see #getMinZoom()
	 * @generated
	 */
	void setMinZoom(double value);

	/**
	 * Unsets the value of the '{@link org.nasdanika.sdk.runtime.models.react.flow.ReactFlow#getMinZoom <em>Min Zoom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMinZoom()
	 * @see #getMinZoom()
	 * @see #setMinZoom(double)
	 * @generated
	 */
	void unsetMinZoom();

	/**
	 * Returns whether the value of the '{@link org.nasdanika.sdk.runtime.models.react.flow.ReactFlow#getMinZoom <em>Min Zoom</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Min Zoom</em>' attribute is set.
	 * @see #unsetMinZoom()
	 * @see #getMinZoom()
	 * @see #setMinZoom(double)
	 * @generated
	 */
	boolean isSetMinZoom();

	/**
	 * Returns the value of the '<em><b>Max Zoom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Zoom</em>' attribute.
	 * @see #isSetMaxZoom()
	 * @see #unsetMaxZoom()
	 * @see #setMaxZoom(double)
	 * @see org.nasdanika.sdk.runtime.models.react.flow.FlowPackage#getReactFlow_MaxZoom()
	 * @model unique="false" unsettable="true"
	 * @generated
	 */
	double getMaxZoom();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.react.flow.ReactFlow#getMaxZoom <em>Max Zoom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Zoom</em>' attribute.
	 * @see #isSetMaxZoom()
	 * @see #unsetMaxZoom()
	 * @see #getMaxZoom()
	 * @generated
	 */
	void setMaxZoom(double value);

	/**
	 * Unsets the value of the '{@link org.nasdanika.sdk.runtime.models.react.flow.ReactFlow#getMaxZoom <em>Max Zoom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMaxZoom()
	 * @see #getMaxZoom()
	 * @see #setMaxZoom(double)
	 * @generated
	 */
	void unsetMaxZoom();

	/**
	 * Returns whether the value of the '{@link org.nasdanika.sdk.runtime.models.react.flow.ReactFlow#getMaxZoom <em>Max Zoom</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Max Zoom</em>' attribute is set.
	 * @see #unsetMaxZoom()
	 * @see #getMaxZoom()
	 * @see #setMaxZoom(double)
	 * @generated
	 */
	boolean isSetMaxZoom();

	/**
	 * Returns the value of the '<em><b>Nodes Draggable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nodes Draggable</em>' attribute.
	 * @see #isSetNodesDraggable()
	 * @see #unsetNodesDraggable()
	 * @see #setNodesDraggable(boolean)
	 * @see org.nasdanika.sdk.runtime.models.react.flow.FlowPackage#getReactFlow_NodesDraggable()
	 * @model unique="false" unsettable="true"
	 * @generated
	 */
	boolean isNodesDraggable();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.react.flow.ReactFlow#isNodesDraggable <em>Nodes Draggable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nodes Draggable</em>' attribute.
	 * @see #isSetNodesDraggable()
	 * @see #unsetNodesDraggable()
	 * @see #isNodesDraggable()
	 * @generated
	 */
	void setNodesDraggable(boolean value);

	/**
	 * Unsets the value of the '{@link org.nasdanika.sdk.runtime.models.react.flow.ReactFlow#isNodesDraggable <em>Nodes Draggable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNodesDraggable()
	 * @see #isNodesDraggable()
	 * @see #setNodesDraggable(boolean)
	 * @generated
	 */
	void unsetNodesDraggable();

	/**
	 * Returns whether the value of the '{@link org.nasdanika.sdk.runtime.models.react.flow.ReactFlow#isNodesDraggable <em>Nodes Draggable</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Nodes Draggable</em>' attribute is set.
	 * @see #unsetNodesDraggable()
	 * @see #isNodesDraggable()
	 * @see #setNodesDraggable(boolean)
	 * @generated
	 */
	boolean isSetNodesDraggable();

	/**
	 * Returns the value of the '<em><b>Nodes Connectable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nodes Connectable</em>' attribute.
	 * @see #isSetNodesConnectable()
	 * @see #unsetNodesConnectable()
	 * @see #setNodesConnectable(boolean)
	 * @see org.nasdanika.sdk.runtime.models.react.flow.FlowPackage#getReactFlow_NodesConnectable()
	 * @model unique="false" unsettable="true"
	 * @generated
	 */
	boolean isNodesConnectable();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.react.flow.ReactFlow#isNodesConnectable <em>Nodes Connectable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nodes Connectable</em>' attribute.
	 * @see #isSetNodesConnectable()
	 * @see #unsetNodesConnectable()
	 * @see #isNodesConnectable()
	 * @generated
	 */
	void setNodesConnectable(boolean value);

	/**
	 * Unsets the value of the '{@link org.nasdanika.sdk.runtime.models.react.flow.ReactFlow#isNodesConnectable <em>Nodes Connectable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNodesConnectable()
	 * @see #isNodesConnectable()
	 * @see #setNodesConnectable(boolean)
	 * @generated
	 */
	void unsetNodesConnectable();

	/**
	 * Returns whether the value of the '{@link org.nasdanika.sdk.runtime.models.react.flow.ReactFlow#isNodesConnectable <em>Nodes Connectable</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Nodes Connectable</em>' attribute is set.
	 * @see #unsetNodesConnectable()
	 * @see #isNodesConnectable()
	 * @see #setNodesConnectable(boolean)
	 * @generated
	 */
	boolean isSetNodesConnectable();

	/**
	 * Returns the value of the '<em><b>Elements Selectable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements Selectable</em>' attribute.
	 * @see #isSetElementsSelectable()
	 * @see #unsetElementsSelectable()
	 * @see #setElementsSelectable(boolean)
	 * @see org.nasdanika.sdk.runtime.models.react.flow.FlowPackage#getReactFlow_ElementsSelectable()
	 * @model unique="false" unsettable="true"
	 * @generated
	 */
	boolean isElementsSelectable();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.react.flow.ReactFlow#isElementsSelectable <em>Elements Selectable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Elements Selectable</em>' attribute.
	 * @see #isSetElementsSelectable()
	 * @see #unsetElementsSelectable()
	 * @see #isElementsSelectable()
	 * @generated
	 */
	void setElementsSelectable(boolean value);

	/**
	 * Unsets the value of the '{@link org.nasdanika.sdk.runtime.models.react.flow.ReactFlow#isElementsSelectable <em>Elements Selectable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetElementsSelectable()
	 * @see #isElementsSelectable()
	 * @see #setElementsSelectable(boolean)
	 * @generated
	 */
	void unsetElementsSelectable();

	/**
	 * Returns whether the value of the '{@link org.nasdanika.sdk.runtime.models.react.flow.ReactFlow#isElementsSelectable <em>Elements Selectable</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Elements Selectable</em>' attribute is set.
	 * @see #unsetElementsSelectable()
	 * @see #isElementsSelectable()
	 * @see #setElementsSelectable(boolean)
	 * @generated
	 */
	boolean isSetElementsSelectable();

	/**
	 * Returns the value of the '<em><b>Pan On Drag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pan On Drag</em>' attribute.
	 * @see #isSetPanOnDrag()
	 * @see #unsetPanOnDrag()
	 * @see #setPanOnDrag(boolean)
	 * @see org.nasdanika.sdk.runtime.models.react.flow.FlowPackage#getReactFlow_PanOnDrag()
	 * @model unique="false" unsettable="true"
	 * @generated
	 */
	boolean isPanOnDrag();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.react.flow.ReactFlow#isPanOnDrag <em>Pan On Drag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pan On Drag</em>' attribute.
	 * @see #isSetPanOnDrag()
	 * @see #unsetPanOnDrag()
	 * @see #isPanOnDrag()
	 * @generated
	 */
	void setPanOnDrag(boolean value);

	/**
	 * Unsets the value of the '{@link org.nasdanika.sdk.runtime.models.react.flow.ReactFlow#isPanOnDrag <em>Pan On Drag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPanOnDrag()
	 * @see #isPanOnDrag()
	 * @see #setPanOnDrag(boolean)
	 * @generated
	 */
	void unsetPanOnDrag();

	/**
	 * Returns whether the value of the '{@link org.nasdanika.sdk.runtime.models.react.flow.ReactFlow#isPanOnDrag <em>Pan On Drag</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Pan On Drag</em>' attribute is set.
	 * @see #unsetPanOnDrag()
	 * @see #isPanOnDrag()
	 * @see #setPanOnDrag(boolean)
	 * @generated
	 */
	boolean isSetPanOnDrag();

	/**
	 * Returns the value of the '<em><b>Zoom On Scroll</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Zoom On Scroll</em>' attribute.
	 * @see #isSetZoomOnScroll()
	 * @see #unsetZoomOnScroll()
	 * @see #setZoomOnScroll(boolean)
	 * @see org.nasdanika.sdk.runtime.models.react.flow.FlowPackage#getReactFlow_ZoomOnScroll()
	 * @model unique="false" unsettable="true"
	 * @generated
	 */
	boolean isZoomOnScroll();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.react.flow.ReactFlow#isZoomOnScroll <em>Zoom On Scroll</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Zoom On Scroll</em>' attribute.
	 * @see #isSetZoomOnScroll()
	 * @see #unsetZoomOnScroll()
	 * @see #isZoomOnScroll()
	 * @generated
	 */
	void setZoomOnScroll(boolean value);

	/**
	 * Unsets the value of the '{@link org.nasdanika.sdk.runtime.models.react.flow.ReactFlow#isZoomOnScroll <em>Zoom On Scroll</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetZoomOnScroll()
	 * @see #isZoomOnScroll()
	 * @see #setZoomOnScroll(boolean)
	 * @generated
	 */
	void unsetZoomOnScroll();

	/**
	 * Returns whether the value of the '{@link org.nasdanika.sdk.runtime.models.react.flow.ReactFlow#isZoomOnScroll <em>Zoom On Scroll</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Zoom On Scroll</em>' attribute is set.
	 * @see #unsetZoomOnScroll()
	 * @see #isZoomOnScroll()
	 * @see #setZoomOnScroll(boolean)
	 * @generated
	 */
	boolean isSetZoomOnScroll();

	/**
	 * Returns the value of the '<em><b>Zoom On Double Click</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Zoom On Double Click</em>' attribute.
	 * @see #isSetZoomOnDoubleClick()
	 * @see #unsetZoomOnDoubleClick()
	 * @see #setZoomOnDoubleClick(boolean)
	 * @see org.nasdanika.sdk.runtime.models.react.flow.FlowPackage#getReactFlow_ZoomOnDoubleClick()
	 * @model unique="false" unsettable="true"
	 * @generated
	 */
	boolean isZoomOnDoubleClick();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.react.flow.ReactFlow#isZoomOnDoubleClick <em>Zoom On Double Click</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Zoom On Double Click</em>' attribute.
	 * @see #isSetZoomOnDoubleClick()
	 * @see #unsetZoomOnDoubleClick()
	 * @see #isZoomOnDoubleClick()
	 * @generated
	 */
	void setZoomOnDoubleClick(boolean value);

	/**
	 * Unsets the value of the '{@link org.nasdanika.sdk.runtime.models.react.flow.ReactFlow#isZoomOnDoubleClick <em>Zoom On Double Click</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetZoomOnDoubleClick()
	 * @see #isZoomOnDoubleClick()
	 * @see #setZoomOnDoubleClick(boolean)
	 * @generated
	 */
	void unsetZoomOnDoubleClick();

	/**
	 * Returns whether the value of the '{@link org.nasdanika.sdk.runtime.models.react.flow.ReactFlow#isZoomOnDoubleClick <em>Zoom On Double Click</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Zoom On Double Click</em>' attribute is set.
	 * @see #unsetZoomOnDoubleClick()
	 * @see #isZoomOnDoubleClick()
	 * @see #setZoomOnDoubleClick(boolean)
	 * @generated
	 */
	boolean isSetZoomOnDoubleClick();

	/**
	 * Returns the value of the '<em><b>Snap To Grid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Snap To Grid</em>' attribute.
	 * @see #setSnapToGrid(boolean)
	 * @see org.nasdanika.sdk.runtime.models.react.flow.FlowPackage#getReactFlow_SnapToGrid()
	 * @model unique="false"
	 * @generated
	 */
	boolean isSnapToGrid();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.react.flow.ReactFlow#isSnapToGrid <em>Snap To Grid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Snap To Grid</em>' attribute.
	 * @see #isSnapToGrid()
	 * @generated
	 */
	void setSnapToGrid(boolean value);

	/**
	 * Returns the value of the '<em><b>Snap Grid</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  [x, y]
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Snap Grid</em>' attribute list.
	 * @see org.nasdanika.sdk.runtime.models.react.flow.FlowPackage#getReactFlow_SnapGrid()
	 * @model unique="false"
	 * @generated
	 */
	EList<Integer> getSnapGrid();

	/**
	 * Returns the value of the '<em><b>Color Mode</b></em>' attribute.
	 * The literals are from the enumeration {@link org.nasdanika.sdk.runtime.models.react.flow.ColorMode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Color Mode</em>' attribute.
	 * @see org.nasdanika.sdk.runtime.models.react.flow.ColorMode
	 * @see #isSetColorMode()
	 * @see #unsetColorMode()
	 * @see #setColorMode(ColorMode)
	 * @see org.nasdanika.sdk.runtime.models.react.flow.FlowPackage#getReactFlow_ColorMode()
	 * @model unique="false" unsettable="true"
	 * @generated
	 */
	ColorMode getColorMode();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.react.flow.ReactFlow#getColorMode <em>Color Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Color Mode</em>' attribute.
	 * @see org.nasdanika.sdk.runtime.models.react.flow.ColorMode
	 * @see #isSetColorMode()
	 * @see #unsetColorMode()
	 * @see #getColorMode()
	 * @generated
	 */
	void setColorMode(ColorMode value);

	/**
	 * Unsets the value of the '{@link org.nasdanika.sdk.runtime.models.react.flow.ReactFlow#getColorMode <em>Color Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetColorMode()
	 * @see #getColorMode()
	 * @see #setColorMode(ColorMode)
	 * @generated
	 */
	void unsetColorMode();

	/**
	 * Returns whether the value of the '{@link org.nasdanika.sdk.runtime.models.react.flow.ReactFlow#getColorMode <em>Color Mode</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Color Mode</em>' attribute is set.
	 * @see #unsetColorMode()
	 * @see #getColorMode()
	 * @see #setColorMode(ColorMode)
	 * @generated
	 */
	boolean isSetColorMode();

	/**
	 * Returns the value of the '<em><b>Delete Key Code</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Keys deleting selected elements, e.g. Backspace and Delete
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Delete Key Code</em>' attribute list.
	 * @see org.nasdanika.sdk.runtime.models.react.flow.FlowPackage#getReactFlow_DeleteKeyCode()
	 * @model unique="false"
	 * @generated
	 */
	EList<String> getDeleteKeyCode();

	/**
	 * Returns the value of the '<em><b>Connection Line Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.nasdanika.sdk.runtime.models.react.flow.ConnectionLineType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connection Line Type</em>' attribute.
	 * @see org.nasdanika.sdk.runtime.models.react.flow.ConnectionLineType
	 * @see #isSetConnectionLineType()
	 * @see #unsetConnectionLineType()
	 * @see #setConnectionLineType(ConnectionLineType)
	 * @see org.nasdanika.sdk.runtime.models.react.flow.FlowPackage#getReactFlow_ConnectionLineType()
	 * @model unique="false" unsettable="true"
	 *        annotation="urn:org.nasdanika:react enum='ConnectionLineType' module='@xyflow/react'"
	 * @generated
	 */
	ConnectionLineType getConnectionLineType();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.react.flow.ReactFlow#getConnectionLineType <em>Connection Line Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connection Line Type</em>' attribute.
	 * @see org.nasdanika.sdk.runtime.models.react.flow.ConnectionLineType
	 * @see #isSetConnectionLineType()
	 * @see #unsetConnectionLineType()
	 * @see #getConnectionLineType()
	 * @generated
	 */
	void setConnectionLineType(ConnectionLineType value);

	/**
	 * Unsets the value of the '{@link org.nasdanika.sdk.runtime.models.react.flow.ReactFlow#getConnectionLineType <em>Connection Line Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetConnectionLineType()
	 * @see #getConnectionLineType()
	 * @see #setConnectionLineType(ConnectionLineType)
	 * @generated
	 */
	void unsetConnectionLineType();

	/**
	 * Returns whether the value of the '{@link org.nasdanika.sdk.runtime.models.react.flow.ReactFlow#getConnectionLineType <em>Connection Line Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Connection Line Type</em>' attribute is set.
	 * @see #unsetConnectionLineType()
	 * @see #getConnectionLineType()
	 * @see #setConnectionLineType(ConnectionLineType)
	 * @generated
	 */
	boolean isSetConnectionLineType();

	/**
	 * Returns the value of the '<em><b>Default Edge Options</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Edge Options</em>' containment reference.
	 * @see #setDefaultEdgeOptions(EdgeOptions)
	 * @see org.nasdanika.sdk.runtime.models.react.flow.FlowPackage#getReactFlow_DefaultEdgeOptions()
	 * @model containment="true"
	 * @generated
	 */
	EdgeOptions getDefaultEdgeOptions();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.react.flow.ReactFlow#getDefaultEdgeOptions <em>Default Edge Options</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Edge Options</em>' containment reference.
	 * @see #getDefaultEdgeOptions()
	 * @generated
	 */
	void setDefaultEdgeOptions(EdgeOptions value);

	/**
	 * Returns the value of the '<em><b>Pro Options</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pro Options</em>' containment reference.
	 * @see #setProOptions(ProOptions)
	 * @see org.nasdanika.sdk.runtime.models.react.flow.FlowPackage#getReactFlow_ProOptions()
	 * @model containment="true"
	 * @generated
	 */
	ProOptions getProOptions();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.react.flow.ReactFlow#getProOptions <em>Pro Options</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pro Options</em>' containment reference.
	 * @see #getProOptions()
	 * @generated
	 */
	void setProOptions(ProOptions value);

	/**
	 * Returns the value of the '<em><b>Background</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Background</em>' containment reference.
	 * @see #setBackground(Background)
	 * @see org.nasdanika.sdk.runtime.models.react.flow.FlowPackage#getReactFlow_Background()
	 * @model containment="true"
	 * @generated
	 */
	Background getBackground();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.react.flow.ReactFlow#getBackground <em>Background</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Background</em>' containment reference.
	 * @see #getBackground()
	 * @generated
	 */
	void setBackground(Background value);

	/**
	 * Returns the value of the '<em><b>Controls</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Controls</em>' containment reference.
	 * @see #setControls(Controls)
	 * @see org.nasdanika.sdk.runtime.models.react.flow.FlowPackage#getReactFlow_Controls()
	 * @model containment="true"
	 * @generated
	 */
	Controls getControls();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.react.flow.ReactFlow#getControls <em>Controls</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Controls</em>' containment reference.
	 * @see #getControls()
	 * @generated
	 */
	void setControls(Controls value);

	/**
	 * Returns the value of the '<em><b>Mini Map</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mini Map</em>' containment reference.
	 * @see #setMiniMap(MiniMap)
	 * @see org.nasdanika.sdk.runtime.models.react.flow.FlowPackage#getReactFlow_MiniMap()
	 * @model containment="true"
	 * @generated
	 */
	MiniMap getMiniMap();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.react.flow.ReactFlow#getMiniMap <em>Mini Map</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mini Map</em>' containment reference.
	 * @see #getMiniMap()
	 * @generated
	 */
	void setMiniMap(MiniMap value);

	/**
	 * Returns the value of the '<em><b>Panels</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.sdk.runtime.models.react.flow.Panel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Panels</em>' containment reference list.
	 * @see org.nasdanika.sdk.runtime.models.react.flow.FlowPackage#getReactFlow_Panels()
	 * @model containment="true"
	 * @generated
	 */
	EList<Panel> getPanels();

} // ReactFlow
