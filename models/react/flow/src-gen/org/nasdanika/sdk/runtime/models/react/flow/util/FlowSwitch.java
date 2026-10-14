/**
 */
package org.nasdanika.sdk.runtime.models.react.flow.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.nasdanika.sdk.runtime.models.core.Documented;
import org.nasdanika.sdk.runtime.models.core.Marked;
import org.nasdanika.sdk.runtime.models.core.ModelElement;
import org.nasdanika.sdk.runtime.models.core.NamedElement;
import org.nasdanika.sdk.runtime.models.core.Referrable;
import org.nasdanika.sdk.runtime.models.core.StringIdentity;

import org.nasdanika.sdk.runtime.models.react.Hook;
import org.nasdanika.sdk.runtime.models.react.JsxContainer;
import org.nasdanika.sdk.runtime.models.react.JsxNode;
import org.nasdanika.sdk.runtime.models.react.LibraryComponent;
import org.nasdanika.sdk.runtime.models.react.LibraryHook;
import org.nasdanika.sdk.runtime.models.react.ReactElement;

import org.nasdanika.sdk.runtime.models.react.flow.*;

import org.nasdanika.sdk.runtime.models.typescript.TypeScriptElement;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.nasdanika.sdk.runtime.models.react.flow.FlowPackage
 * @generated
 */
public class FlowSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static FlowPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlowSwitch() {
		if (modelPackage == null) {
			modelPackage = FlowPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case FlowPackage.XY_POSITION: {
				XYPosition xyPosition = (XYPosition)theEObject;
				T result = caseXYPosition(xyPosition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FlowPackage.FLOW_DATA: {
				FlowData flowData = (FlowData)theEObject;
				T result = caseFlowData(flowData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FlowPackage.DATA_VALUE: {
				DataValue dataValue = (DataValue)theEObject;
				T result = caseDataValue(dataValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FlowPackage.FLOW_NODE: {
				FlowNode flowNode = (FlowNode)theEObject;
				T result = caseFlowNode(flowNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FlowPackage.EDGE_MARKER: {
				EdgeMarker edgeMarker = (EdgeMarker)theEObject;
				T result = caseEdgeMarker(edgeMarker);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FlowPackage.FLOW_EDGE: {
				FlowEdge flowEdge = (FlowEdge)theEObject;
				T result = caseFlowEdge(flowEdge);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FlowPackage.EDGE_OPTIONS: {
				EdgeOptions edgeOptions = (EdgeOptions)theEObject;
				T result = caseEdgeOptions(edgeOptions);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FlowPackage.PRO_OPTIONS: {
				ProOptions proOptions = (ProOptions)theEObject;
				T result = caseProOptions(proOptions);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FlowPackage.FLOW_TYPES: {
				FlowTypes flowTypes = (FlowTypes)theEObject;
				T result = caseFlowTypes(flowTypes);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FlowPackage.FLOW_TYPE: {
				FlowType flowType = (FlowType)theEObject;
				T result = caseFlowType(flowType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FlowPackage.FLOW_COMPONENT: {
				FlowComponent flowComponent = (FlowComponent)theEObject;
				T result = caseFlowComponent(flowComponent);
				if (result == null) result = caseLibraryComponent(flowComponent);
				if (result == null) result = caseJsxContainer(flowComponent);
				if (result == null) result = caseJsxNode(flowComponent);
				if (result == null) result = caseReactElement(flowComponent);
				if (result == null) result = caseTypeScriptElement(flowComponent);
				if (result == null) result = caseNamedElement(flowComponent);
				if (result == null) result = caseModelElement(flowComponent);
				if (result == null) result = caseStringIdentity(flowComponent);
				if (result == null) result = caseDocumented(flowComponent);
				if (result == null) result = caseMarked(flowComponent);
				if (result == null) result = caseReferrable(flowComponent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FlowPackage.REACT_FLOW_PROVIDER: {
				ReactFlowProvider reactFlowProvider = (ReactFlowProvider)theEObject;
				T result = caseReactFlowProvider(reactFlowProvider);
				if (result == null) result = caseFlowComponent(reactFlowProvider);
				if (result == null) result = caseLibraryComponent(reactFlowProvider);
				if (result == null) result = caseJsxContainer(reactFlowProvider);
				if (result == null) result = caseJsxNode(reactFlowProvider);
				if (result == null) result = caseReactElement(reactFlowProvider);
				if (result == null) result = caseTypeScriptElement(reactFlowProvider);
				if (result == null) result = caseNamedElement(reactFlowProvider);
				if (result == null) result = caseModelElement(reactFlowProvider);
				if (result == null) result = caseStringIdentity(reactFlowProvider);
				if (result == null) result = caseDocumented(reactFlowProvider);
				if (result == null) result = caseMarked(reactFlowProvider);
				if (result == null) result = caseReferrable(reactFlowProvider);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FlowPackage.REACT_FLOW: {
				ReactFlow reactFlow = (ReactFlow)theEObject;
				T result = caseReactFlow(reactFlow);
				if (result == null) result = caseFlowComponent(reactFlow);
				if (result == null) result = caseLibraryComponent(reactFlow);
				if (result == null) result = caseJsxContainer(reactFlow);
				if (result == null) result = caseJsxNode(reactFlow);
				if (result == null) result = caseReactElement(reactFlow);
				if (result == null) result = caseTypeScriptElement(reactFlow);
				if (result == null) result = caseNamedElement(reactFlow);
				if (result == null) result = caseModelElement(reactFlow);
				if (result == null) result = caseStringIdentity(reactFlow);
				if (result == null) result = caseDocumented(reactFlow);
				if (result == null) result = caseMarked(reactFlow);
				if (result == null) result = caseReferrable(reactFlow);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FlowPackage.BACKGROUND: {
				Background background = (Background)theEObject;
				T result = caseBackground(background);
				if (result == null) result = caseFlowComponent(background);
				if (result == null) result = caseLibraryComponent(background);
				if (result == null) result = caseJsxContainer(background);
				if (result == null) result = caseJsxNode(background);
				if (result == null) result = caseReactElement(background);
				if (result == null) result = caseTypeScriptElement(background);
				if (result == null) result = caseNamedElement(background);
				if (result == null) result = caseModelElement(background);
				if (result == null) result = caseStringIdentity(background);
				if (result == null) result = caseDocumented(background);
				if (result == null) result = caseMarked(background);
				if (result == null) result = caseReferrable(background);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FlowPackage.CONTROLS: {
				Controls controls = (Controls)theEObject;
				T result = caseControls(controls);
				if (result == null) result = caseFlowComponent(controls);
				if (result == null) result = caseLibraryComponent(controls);
				if (result == null) result = caseJsxContainer(controls);
				if (result == null) result = caseJsxNode(controls);
				if (result == null) result = caseReactElement(controls);
				if (result == null) result = caseTypeScriptElement(controls);
				if (result == null) result = caseNamedElement(controls);
				if (result == null) result = caseModelElement(controls);
				if (result == null) result = caseStringIdentity(controls);
				if (result == null) result = caseDocumented(controls);
				if (result == null) result = caseMarked(controls);
				if (result == null) result = caseReferrable(controls);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FlowPackage.MINI_MAP: {
				MiniMap miniMap = (MiniMap)theEObject;
				T result = caseMiniMap(miniMap);
				if (result == null) result = caseFlowComponent(miniMap);
				if (result == null) result = caseLibraryComponent(miniMap);
				if (result == null) result = caseJsxContainer(miniMap);
				if (result == null) result = caseJsxNode(miniMap);
				if (result == null) result = caseReactElement(miniMap);
				if (result == null) result = caseTypeScriptElement(miniMap);
				if (result == null) result = caseNamedElement(miniMap);
				if (result == null) result = caseModelElement(miniMap);
				if (result == null) result = caseStringIdentity(miniMap);
				if (result == null) result = caseDocumented(miniMap);
				if (result == null) result = caseMarked(miniMap);
				if (result == null) result = caseReferrable(miniMap);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FlowPackage.PANEL: {
				Panel panel = (Panel)theEObject;
				T result = casePanel(panel);
				if (result == null) result = caseFlowComponent(panel);
				if (result == null) result = caseLibraryComponent(panel);
				if (result == null) result = caseJsxContainer(panel);
				if (result == null) result = caseJsxNode(panel);
				if (result == null) result = caseReactElement(panel);
				if (result == null) result = caseTypeScriptElement(panel);
				if (result == null) result = caseNamedElement(panel);
				if (result == null) result = caseModelElement(panel);
				if (result == null) result = caseStringIdentity(panel);
				if (result == null) result = caseDocumented(panel);
				if (result == null) result = caseMarked(panel);
				if (result == null) result = caseReferrable(panel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FlowPackage.HANDLE: {
				Handle handle = (Handle)theEObject;
				T result = caseHandle(handle);
				if (result == null) result = caseFlowComponent(handle);
				if (result == null) result = caseLibraryComponent(handle);
				if (result == null) result = caseJsxContainer(handle);
				if (result == null) result = caseJsxNode(handle);
				if (result == null) result = caseReactElement(handle);
				if (result == null) result = caseTypeScriptElement(handle);
				if (result == null) result = caseNamedElement(handle);
				if (result == null) result = caseModelElement(handle);
				if (result == null) result = caseStringIdentity(handle);
				if (result == null) result = caseDocumented(handle);
				if (result == null) result = caseMarked(handle);
				if (result == null) result = caseReferrable(handle);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FlowPackage.NODE_TOOLBAR: {
				NodeToolbar nodeToolbar = (NodeToolbar)theEObject;
				T result = caseNodeToolbar(nodeToolbar);
				if (result == null) result = caseFlowComponent(nodeToolbar);
				if (result == null) result = caseLibraryComponent(nodeToolbar);
				if (result == null) result = caseJsxContainer(nodeToolbar);
				if (result == null) result = caseJsxNode(nodeToolbar);
				if (result == null) result = caseReactElement(nodeToolbar);
				if (result == null) result = caseTypeScriptElement(nodeToolbar);
				if (result == null) result = caseNamedElement(nodeToolbar);
				if (result == null) result = caseModelElement(nodeToolbar);
				if (result == null) result = caseStringIdentity(nodeToolbar);
				if (result == null) result = caseDocumented(nodeToolbar);
				if (result == null) result = caseMarked(nodeToolbar);
				if (result == null) result = caseReferrable(nodeToolbar);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FlowPackage.NODE_RESIZER: {
				NodeResizer nodeResizer = (NodeResizer)theEObject;
				T result = caseNodeResizer(nodeResizer);
				if (result == null) result = caseFlowComponent(nodeResizer);
				if (result == null) result = caseLibraryComponent(nodeResizer);
				if (result == null) result = caseJsxContainer(nodeResizer);
				if (result == null) result = caseJsxNode(nodeResizer);
				if (result == null) result = caseReactElement(nodeResizer);
				if (result == null) result = caseTypeScriptElement(nodeResizer);
				if (result == null) result = caseNamedElement(nodeResizer);
				if (result == null) result = caseModelElement(nodeResizer);
				if (result == null) result = caseStringIdentity(nodeResizer);
				if (result == null) result = caseDocumented(nodeResizer);
				if (result == null) result = caseMarked(nodeResizer);
				if (result == null) result = caseReferrable(nodeResizer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FlowPackage.FLOW_HOOK: {
				FlowHook flowHook = (FlowHook)theEObject;
				T result = caseFlowHook(flowHook);
				if (result == null) result = caseLibraryHook(flowHook);
				if (result == null) result = caseHook(flowHook);
				if (result == null) result = caseReactElement(flowHook);
				if (result == null) result = caseTypeScriptElement(flowHook);
				if (result == null) result = caseNamedElement(flowHook);
				if (result == null) result = caseModelElement(flowHook);
				if (result == null) result = caseStringIdentity(flowHook);
				if (result == null) result = caseDocumented(flowHook);
				if (result == null) result = caseMarked(flowHook);
				if (result == null) result = caseReferrable(flowHook);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FlowPackage.NODES_STATE: {
				NodesState nodesState = (NodesState)theEObject;
				T result = caseNodesState(nodesState);
				if (result == null) result = caseFlowHook(nodesState);
				if (result == null) result = caseLibraryHook(nodesState);
				if (result == null) result = caseHook(nodesState);
				if (result == null) result = caseReactElement(nodesState);
				if (result == null) result = caseTypeScriptElement(nodesState);
				if (result == null) result = caseNamedElement(nodesState);
				if (result == null) result = caseModelElement(nodesState);
				if (result == null) result = caseStringIdentity(nodesState);
				if (result == null) result = caseDocumented(nodesState);
				if (result == null) result = caseMarked(nodesState);
				if (result == null) result = caseReferrable(nodesState);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FlowPackage.EDGES_STATE: {
				EdgesState edgesState = (EdgesState)theEObject;
				T result = caseEdgesState(edgesState);
				if (result == null) result = caseFlowHook(edgesState);
				if (result == null) result = caseLibraryHook(edgesState);
				if (result == null) result = caseHook(edgesState);
				if (result == null) result = caseReactElement(edgesState);
				if (result == null) result = caseTypeScriptElement(edgesState);
				if (result == null) result = caseNamedElement(edgesState);
				if (result == null) result = caseModelElement(edgesState);
				if (result == null) result = caseStringIdentity(edgesState);
				if (result == null) result = caseDocumented(edgesState);
				if (result == null) result = caseMarked(edgesState);
				if (result == null) result = caseReferrable(edgesState);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FlowPackage.REACT_FLOW_INSTANCE: {
				ReactFlowInstance reactFlowInstance = (ReactFlowInstance)theEObject;
				T result = caseReactFlowInstance(reactFlowInstance);
				if (result == null) result = caseFlowHook(reactFlowInstance);
				if (result == null) result = caseLibraryHook(reactFlowInstance);
				if (result == null) result = caseHook(reactFlowInstance);
				if (result == null) result = caseReactElement(reactFlowInstance);
				if (result == null) result = caseTypeScriptElement(reactFlowInstance);
				if (result == null) result = caseNamedElement(reactFlowInstance);
				if (result == null) result = caseModelElement(reactFlowInstance);
				if (result == null) result = caseStringIdentity(reactFlowInstance);
				if (result == null) result = caseDocumented(reactFlowInstance);
				if (result == null) result = caseMarked(reactFlowInstance);
				if (result == null) result = caseReferrable(reactFlowInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>XY Position</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>XY Position</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXYPosition(XYPosition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFlowData(FlowData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataValue(DataValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFlowNode(FlowNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Edge Marker</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Edge Marker</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEdgeMarker(EdgeMarker object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Edge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Edge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFlowEdge(FlowEdge object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Edge Options</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Edge Options</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEdgeOptions(EdgeOptions object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pro Options</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pro Options</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProOptions(ProOptions object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Types</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Types</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFlowTypes(FlowTypes object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFlowType(FlowType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFlowComponent(FlowComponent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>React Flow Provider</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>React Flow Provider</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReactFlowProvider(ReactFlowProvider object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>React Flow</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>React Flow</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReactFlow(ReactFlow object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Background</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Background</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBackground(Background object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Controls</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Controls</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseControls(Controls object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mini Map</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mini Map</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMiniMap(MiniMap object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Panel</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Panel</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePanel(Panel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Handle</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Handle</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHandle(Handle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Node Toolbar</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Node Toolbar</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNodeToolbar(NodeToolbar object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Node Resizer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Node Resizer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNodeResizer(NodeResizer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hook</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hook</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFlowHook(FlowHook object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Nodes State</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Nodes State</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNodesState(NodesState object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Edges State</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Edges State</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEdgesState(EdgesState object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>React Flow Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>React Flow Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReactFlowInstance(ReactFlowInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Referrable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Referrable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReferrable(Referrable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String Identity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String Identity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStringIdentity(StringIdentity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Documented</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Documented</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumented(Documented object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Marked</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Marked</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMarked(Marked object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModelElement(ModelElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedElement(NamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Script Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Script Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeScriptElement(TypeScriptElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReactElement(ReactElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Jsx Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Jsx Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJsxNode(JsxNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Jsx Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Jsx Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJsxContainer(JsxContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Library Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Library Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLibraryComponent(LibraryComponent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hook</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hook</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHook(Hook object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Library Hook</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Library Hook</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLibraryHook(LibraryHook object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //FlowSwitch
