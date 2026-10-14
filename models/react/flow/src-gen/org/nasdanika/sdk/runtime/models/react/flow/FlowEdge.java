/**
 */
package org.nasdanika.sdk.runtime.models.react.flow;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EObject;

import org.nasdanika.sdk.runtime.models.react.JsxNode;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Edge</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An edge between nodes. id is required.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.flow.FlowEdge#getId <em>Id</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.flow.FlowEdge#getSource <em>Source</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.flow.FlowEdge#getTarget <em>Target</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.flow.FlowEdge#getSourceHandle <em>Source Handle</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.flow.FlowEdge#getTargetHandle <em>Target Handle</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.flow.FlowEdge#getEdgeType <em>Edge Type</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.flow.FlowEdge#getCustomType <em>Custom Type</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.flow.FlowEdge#getLabel <em>Label</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.flow.FlowEdge#getLabelNode <em>Label Node</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.flow.FlowEdge#isAnimated <em>Animated</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.flow.FlowEdge#isHidden <em>Hidden</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.flow.FlowEdge#isDeletable <em>Deletable</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.flow.FlowEdge#isSelectable <em>Selectable</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.flow.FlowEdge#isReconnectable <em>Reconnectable</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.flow.FlowEdge#getMarkerStart <em>Marker Start</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.flow.FlowEdge#getMarkerEnd <em>Marker End</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.flow.FlowEdge#getData <em>Data</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.flow.FlowEdge#getZIndex <em>ZIndex</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.flow.FlowEdge#getClassName <em>Class Name</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.flow.FlowEdge#getStyle <em>Style</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.sdk.runtime.models.react.flow.FlowPackage#getFlowEdge()
 * @model
 * @generated
 */
public interface FlowEdge extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see org.nasdanika.sdk.runtime.models.react.flow.FlowPackage#getFlowEdge_Id()
	 * @model unique="false"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.react.flow.FlowEdge#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(FlowNode)
	 * @see org.nasdanika.sdk.runtime.models.react.flow.FlowPackage#getFlowEdge_Source()
	 * @model annotation="urn:org.nasdanika:react ref='id'"
	 * @generated
	 */
	FlowNode getSource();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.react.flow.FlowEdge#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(FlowNode value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(FlowNode)
	 * @see org.nasdanika.sdk.runtime.models.react.flow.FlowPackage#getFlowEdge_Target()
	 * @model annotation="urn:org.nasdanika:react ref='id'"
	 * @generated
	 */
	FlowNode getTarget();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.react.flow.FlowEdge#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(FlowNode value);

	/**
	 * Returns the value of the '<em><b>Source Handle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Handle</em>' attribute.
	 * @see #setSourceHandle(String)
	 * @see org.nasdanika.sdk.runtime.models.react.flow.FlowPackage#getFlowEdge_SourceHandle()
	 * @model unique="false"
	 * @generated
	 */
	String getSourceHandle();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.react.flow.FlowEdge#getSourceHandle <em>Source Handle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Handle</em>' attribute.
	 * @see #getSourceHandle()
	 * @generated
	 */
	void setSourceHandle(String value);

	/**
	 * Returns the value of the '<em><b>Target Handle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Handle</em>' attribute.
	 * @see #setTargetHandle(String)
	 * @see org.nasdanika.sdk.runtime.models.react.flow.FlowPackage#getFlowEdge_TargetHandle()
	 * @model unique="false"
	 * @generated
	 */
	String getTargetHandle();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.react.flow.FlowEdge#getTargetHandle <em>Target Handle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Handle</em>' attribute.
	 * @see #getTargetHandle()
	 * @generated
	 */
	void setTargetHandle(String value);

	/**
	 * Returns the value of the '<em><b>Edge Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.nasdanika.sdk.runtime.models.react.flow.EdgeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Edge Type</em>' attribute.
	 * @see org.nasdanika.sdk.runtime.models.react.flow.EdgeType
	 * @see #isSetEdgeType()
	 * @see #unsetEdgeType()
	 * @see #setEdgeType(EdgeType)
	 * @see org.nasdanika.sdk.runtime.models.react.flow.FlowPackage#getFlowEdge_EdgeType()
	 * @model unique="false" unsettable="true"
	 *        annotation="urn:org.nasdanika:react prop='type'"
	 * @generated
	 */
	EdgeType getEdgeType();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.react.flow.FlowEdge#getEdgeType <em>Edge Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Edge Type</em>' attribute.
	 * @see org.nasdanika.sdk.runtime.models.react.flow.EdgeType
	 * @see #isSetEdgeType()
	 * @see #unsetEdgeType()
	 * @see #getEdgeType()
	 * @generated
	 */
	void setEdgeType(EdgeType value);

	/**
	 * Unsets the value of the '{@link org.nasdanika.sdk.runtime.models.react.flow.FlowEdge#getEdgeType <em>Edge Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEdgeType()
	 * @see #getEdgeType()
	 * @see #setEdgeType(EdgeType)
	 * @generated
	 */
	void unsetEdgeType();

	/**
	 * Returns whether the value of the '{@link org.nasdanika.sdk.runtime.models.react.flow.FlowEdge#getEdgeType <em>Edge Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Edge Type</em>' attribute is set.
	 * @see #unsetEdgeType()
	 * @see #getEdgeType()
	 * @see #setEdgeType(EdgeType)
	 * @generated
	 */
	boolean isSetEdgeType();

	/**
	 * Returns the value of the '<em><b>Custom Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Custom edge type, a key of the edgeTypes of the flow. Wins over edgeType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Custom Type</em>' attribute.
	 * @see #setCustomType(String)
	 * @see org.nasdanika.sdk.runtime.models.react.flow.FlowPackage#getFlowEdge_CustomType()
	 * @model unique="false"
	 *        annotation="urn:org.nasdanika:react prop='type'"
	 * @generated
	 */
	String getCustomType();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.react.flow.FlowEdge#getCustomType <em>Custom Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Custom Type</em>' attribute.
	 * @see #getCustomType()
	 * @generated
	 */
	void setCustomType(String value);

	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see org.nasdanika.sdk.runtime.models.react.flow.FlowPackage#getFlowEdge_Label()
	 * @model unique="false"
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.react.flow.FlowEdge#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

	/**
	 * Returns the value of the '<em><b>Label Node</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Label with markup. Wins over label.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Label Node</em>' containment reference.
	 * @see #setLabelNode(JsxNode)
	 * @see org.nasdanika.sdk.runtime.models.react.flow.FlowPackage#getFlowEdge_LabelNode()
	 * @model containment="true"
	 *        annotation="urn:org.nasdanika:react prop='label'"
	 * @generated
	 */
	JsxNode getLabelNode();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.react.flow.FlowEdge#getLabelNode <em>Label Node</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label Node</em>' containment reference.
	 * @see #getLabelNode()
	 * @generated
	 */
	void setLabelNode(JsxNode value);

	/**
	 * Returns the value of the '<em><b>Animated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Animated</em>' attribute.
	 * @see #isSetAnimated()
	 * @see #unsetAnimated()
	 * @see #setAnimated(boolean)
	 * @see org.nasdanika.sdk.runtime.models.react.flow.FlowPackage#getFlowEdge_Animated()
	 * @model unique="false" unsettable="true"
	 * @generated
	 */
	boolean isAnimated();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.react.flow.FlowEdge#isAnimated <em>Animated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Animated</em>' attribute.
	 * @see #isSetAnimated()
	 * @see #unsetAnimated()
	 * @see #isAnimated()
	 * @generated
	 */
	void setAnimated(boolean value);

	/**
	 * Unsets the value of the '{@link org.nasdanika.sdk.runtime.models.react.flow.FlowEdge#isAnimated <em>Animated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAnimated()
	 * @see #isAnimated()
	 * @see #setAnimated(boolean)
	 * @generated
	 */
	void unsetAnimated();

	/**
	 * Returns whether the value of the '{@link org.nasdanika.sdk.runtime.models.react.flow.FlowEdge#isAnimated <em>Animated</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Animated</em>' attribute is set.
	 * @see #unsetAnimated()
	 * @see #isAnimated()
	 * @see #setAnimated(boolean)
	 * @generated
	 */
	boolean isSetAnimated();

	/**
	 * Returns the value of the '<em><b>Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hidden</em>' attribute.
	 * @see #isSetHidden()
	 * @see #unsetHidden()
	 * @see #setHidden(boolean)
	 * @see org.nasdanika.sdk.runtime.models.react.flow.FlowPackage#getFlowEdge_Hidden()
	 * @model unique="false" unsettable="true"
	 * @generated
	 */
	boolean isHidden();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.react.flow.FlowEdge#isHidden <em>Hidden</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hidden</em>' attribute.
	 * @see #isSetHidden()
	 * @see #unsetHidden()
	 * @see #isHidden()
	 * @generated
	 */
	void setHidden(boolean value);

	/**
	 * Unsets the value of the '{@link org.nasdanika.sdk.runtime.models.react.flow.FlowEdge#isHidden <em>Hidden</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetHidden()
	 * @see #isHidden()
	 * @see #setHidden(boolean)
	 * @generated
	 */
	void unsetHidden();

	/**
	 * Returns whether the value of the '{@link org.nasdanika.sdk.runtime.models.react.flow.FlowEdge#isHidden <em>Hidden</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Hidden</em>' attribute is set.
	 * @see #unsetHidden()
	 * @see #isHidden()
	 * @see #setHidden(boolean)
	 * @generated
	 */
	boolean isSetHidden();

	/**
	 * Returns the value of the '<em><b>Deletable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deletable</em>' attribute.
	 * @see #isSetDeletable()
	 * @see #unsetDeletable()
	 * @see #setDeletable(boolean)
	 * @see org.nasdanika.sdk.runtime.models.react.flow.FlowPackage#getFlowEdge_Deletable()
	 * @model unique="false" unsettable="true"
	 * @generated
	 */
	boolean isDeletable();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.react.flow.FlowEdge#isDeletable <em>Deletable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deletable</em>' attribute.
	 * @see #isSetDeletable()
	 * @see #unsetDeletable()
	 * @see #isDeletable()
	 * @generated
	 */
	void setDeletable(boolean value);

	/**
	 * Unsets the value of the '{@link org.nasdanika.sdk.runtime.models.react.flow.FlowEdge#isDeletable <em>Deletable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDeletable()
	 * @see #isDeletable()
	 * @see #setDeletable(boolean)
	 * @generated
	 */
	void unsetDeletable();

	/**
	 * Returns whether the value of the '{@link org.nasdanika.sdk.runtime.models.react.flow.FlowEdge#isDeletable <em>Deletable</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Deletable</em>' attribute is set.
	 * @see #unsetDeletable()
	 * @see #isDeletable()
	 * @see #setDeletable(boolean)
	 * @generated
	 */
	boolean isSetDeletable();

	/**
	 * Returns the value of the '<em><b>Selectable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Selectable</em>' attribute.
	 * @see #isSetSelectable()
	 * @see #unsetSelectable()
	 * @see #setSelectable(boolean)
	 * @see org.nasdanika.sdk.runtime.models.react.flow.FlowPackage#getFlowEdge_Selectable()
	 * @model unique="false" unsettable="true"
	 * @generated
	 */
	boolean isSelectable();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.react.flow.FlowEdge#isSelectable <em>Selectable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Selectable</em>' attribute.
	 * @see #isSetSelectable()
	 * @see #unsetSelectable()
	 * @see #isSelectable()
	 * @generated
	 */
	void setSelectable(boolean value);

	/**
	 * Unsets the value of the '{@link org.nasdanika.sdk.runtime.models.react.flow.FlowEdge#isSelectable <em>Selectable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSelectable()
	 * @see #isSelectable()
	 * @see #setSelectable(boolean)
	 * @generated
	 */
	void unsetSelectable();

	/**
	 * Returns whether the value of the '{@link org.nasdanika.sdk.runtime.models.react.flow.FlowEdge#isSelectable <em>Selectable</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Selectable</em>' attribute is set.
	 * @see #unsetSelectable()
	 * @see #isSelectable()
	 * @see #setSelectable(boolean)
	 * @generated
	 */
	boolean isSetSelectable();

	/**
	 * Returns the value of the '<em><b>Reconnectable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reconnectable</em>' attribute.
	 * @see #isSetReconnectable()
	 * @see #unsetReconnectable()
	 * @see #setReconnectable(boolean)
	 * @see org.nasdanika.sdk.runtime.models.react.flow.FlowPackage#getFlowEdge_Reconnectable()
	 * @model unique="false" unsettable="true"
	 * @generated
	 */
	boolean isReconnectable();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.react.flow.FlowEdge#isReconnectable <em>Reconnectable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reconnectable</em>' attribute.
	 * @see #isSetReconnectable()
	 * @see #unsetReconnectable()
	 * @see #isReconnectable()
	 * @generated
	 */
	void setReconnectable(boolean value);

	/**
	 * Unsets the value of the '{@link org.nasdanika.sdk.runtime.models.react.flow.FlowEdge#isReconnectable <em>Reconnectable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetReconnectable()
	 * @see #isReconnectable()
	 * @see #setReconnectable(boolean)
	 * @generated
	 */
	void unsetReconnectable();

	/**
	 * Returns whether the value of the '{@link org.nasdanika.sdk.runtime.models.react.flow.FlowEdge#isReconnectable <em>Reconnectable</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Reconnectable</em>' attribute is set.
	 * @see #unsetReconnectable()
	 * @see #isReconnectable()
	 * @see #setReconnectable(boolean)
	 * @generated
	 */
	boolean isSetReconnectable();

	/**
	 * Returns the value of the '<em><b>Marker Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Marker Start</em>' containment reference.
	 * @see #setMarkerStart(EdgeMarker)
	 * @see org.nasdanika.sdk.runtime.models.react.flow.FlowPackage#getFlowEdge_MarkerStart()
	 * @model containment="true"
	 * @generated
	 */
	EdgeMarker getMarkerStart();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.react.flow.FlowEdge#getMarkerStart <em>Marker Start</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Marker Start</em>' containment reference.
	 * @see #getMarkerStart()
	 * @generated
	 */
	void setMarkerStart(EdgeMarker value);

	/**
	 * Returns the value of the '<em><b>Marker End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Marker End</em>' containment reference.
	 * @see #setMarkerEnd(EdgeMarker)
	 * @see org.nasdanika.sdk.runtime.models.react.flow.FlowPackage#getFlowEdge_MarkerEnd()
	 * @model containment="true"
	 * @generated
	 */
	EdgeMarker getMarkerEnd();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.react.flow.FlowEdge#getMarkerEnd <em>Marker End</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Marker End</em>' containment reference.
	 * @see #getMarkerEnd()
	 * @generated
	 */
	void setMarkerEnd(EdgeMarker value);

	/**
	 * Returns the value of the '<em><b>Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data</em>' containment reference.
	 * @see #setData(FlowData)
	 * @see org.nasdanika.sdk.runtime.models.react.flow.FlowPackage#getFlowEdge_Data()
	 * @model containment="true"
	 * @generated
	 */
	FlowData getData();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.react.flow.FlowEdge#getData <em>Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data</em>' containment reference.
	 * @see #getData()
	 * @generated
	 */
	void setData(FlowData value);

	/**
	 * Returns the value of the '<em><b>ZIndex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ZIndex</em>' attribute.
	 * @see #isSetZIndex()
	 * @see #unsetZIndex()
	 * @see #setZIndex(int)
	 * @see org.nasdanika.sdk.runtime.models.react.flow.FlowPackage#getFlowEdge_ZIndex()
	 * @model unique="false" unsettable="true"
	 * @generated
	 */
	int getZIndex();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.react.flow.FlowEdge#getZIndex <em>ZIndex</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ZIndex</em>' attribute.
	 * @see #isSetZIndex()
	 * @see #unsetZIndex()
	 * @see #getZIndex()
	 * @generated
	 */
	void setZIndex(int value);

	/**
	 * Unsets the value of the '{@link org.nasdanika.sdk.runtime.models.react.flow.FlowEdge#getZIndex <em>ZIndex</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetZIndex()
	 * @see #getZIndex()
	 * @see #setZIndex(int)
	 * @generated
	 */
	void unsetZIndex();

	/**
	 * Returns whether the value of the '{@link org.nasdanika.sdk.runtime.models.react.flow.FlowEdge#getZIndex <em>ZIndex</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>ZIndex</em>' attribute is set.
	 * @see #unsetZIndex()
	 * @see #getZIndex()
	 * @see #setZIndex(int)
	 * @generated
	 */
	boolean isSetZIndex();

	/**
	 * Returns the value of the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class Name</em>' attribute.
	 * @see #setClassName(String)
	 * @see org.nasdanika.sdk.runtime.models.react.flow.FlowPackage#getFlowEdge_ClassName()
	 * @model unique="false"
	 * @generated
	 */
	String getClassName();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.react.flow.FlowEdge#getClassName <em>Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class Name</em>' attribute.
	 * @see #getClassName()
	 * @generated
	 */
	void setClassName(String value);

	/**
	 * Returns the value of the '<em><b>Style</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Style</em>' map.
	 * @see org.nasdanika.sdk.runtime.models.react.flow.FlowPackage#getFlowEdge_Style()
	 * @model mapType="org.nasdanika.sdk.runtime.models.core.StringToStringMapEntry&lt;org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString&gt;"
	 *        annotation="urn:org.nasdanika:react style='true'"
	 * @generated
	 */
	EMap<String, String> getStyle();

} // FlowEdge
