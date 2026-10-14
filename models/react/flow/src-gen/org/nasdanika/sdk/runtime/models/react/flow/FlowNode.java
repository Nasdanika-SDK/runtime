/**
 */
package org.nasdanika.sdk.runtime.models.react.flow;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A node. id is required - edges refer to it.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.flow.FlowNode#getId <em>Id</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.flow.FlowNode#getCustomType <em>Custom Type</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.flow.FlowNode#getNodeType <em>Node Type</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.flow.FlowNode#getPosition <em>Position</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.flow.FlowNode#getData <em>Data</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.flow.FlowNode#getSourcePosition <em>Source Position</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.flow.FlowNode#getTargetPosition <em>Target Position</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.flow.FlowNode#isHidden <em>Hidden</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.flow.FlowNode#isDraggable <em>Draggable</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.flow.FlowNode#isSelectable <em>Selectable</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.flow.FlowNode#isConnectable <em>Connectable</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.flow.FlowNode#isDeletable <em>Deletable</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.flow.FlowNode#getParent <em>Parent</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.flow.FlowNode#getExtent <em>Extent</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.flow.FlowNode#getWidth <em>Width</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.flow.FlowNode#getHeight <em>Height</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.flow.FlowNode#getZIndex <em>ZIndex</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.flow.FlowNode#getClassName <em>Class Name</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.flow.FlowNode#getStyle <em>Style</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.sdk.runtime.models.react.flow.FlowPackage#getFlowNode()
 * @model
 * @generated
 */
public interface FlowNode extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see org.nasdanika.sdk.runtime.models.react.flow.FlowPackage#getFlowNode_Id()
	 * @model unique="false"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.react.flow.FlowNode#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Custom Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Custom node type, a key of the nodeTypes of the flow. Wins over nodeType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Custom Type</em>' attribute.
	 * @see #setCustomType(String)
	 * @see org.nasdanika.sdk.runtime.models.react.flow.FlowPackage#getFlowNode_CustomType()
	 * @model unique="false"
	 *        annotation="urn:org.nasdanika:react prop='type'"
	 * @generated
	 */
	String getCustomType();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.react.flow.FlowNode#getCustomType <em>Custom Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Custom Type</em>' attribute.
	 * @see #getCustomType()
	 * @generated
	 */
	void setCustomType(String value);

	/**
	 * Returns the value of the '<em><b>Node Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.nasdanika.sdk.runtime.models.react.flow.NodeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node Type</em>' attribute.
	 * @see org.nasdanika.sdk.runtime.models.react.flow.NodeType
	 * @see #isSetNodeType()
	 * @see #unsetNodeType()
	 * @see #setNodeType(NodeType)
	 * @see org.nasdanika.sdk.runtime.models.react.flow.FlowPackage#getFlowNode_NodeType()
	 * @model unique="false" unsettable="true"
	 *        annotation="urn:org.nasdanika:react prop='type'"
	 * @generated
	 */
	NodeType getNodeType();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.react.flow.FlowNode#getNodeType <em>Node Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Node Type</em>' attribute.
	 * @see org.nasdanika.sdk.runtime.models.react.flow.NodeType
	 * @see #isSetNodeType()
	 * @see #unsetNodeType()
	 * @see #getNodeType()
	 * @generated
	 */
	void setNodeType(NodeType value);

	/**
	 * Unsets the value of the '{@link org.nasdanika.sdk.runtime.models.react.flow.FlowNode#getNodeType <em>Node Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNodeType()
	 * @see #getNodeType()
	 * @see #setNodeType(NodeType)
	 * @generated
	 */
	void unsetNodeType();

	/**
	 * Returns whether the value of the '{@link org.nasdanika.sdk.runtime.models.react.flow.FlowNode#getNodeType <em>Node Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Node Type</em>' attribute is set.
	 * @see #unsetNodeType()
	 * @see #getNodeType()
	 * @see #setNodeType(NodeType)
	 * @generated
	 */
	boolean isSetNodeType();

	/**
	 * Returns the value of the '<em><b>Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Position</em>' containment reference.
	 * @see #setPosition(XYPosition)
	 * @see org.nasdanika.sdk.runtime.models.react.flow.FlowPackage#getFlowNode_Position()
	 * @model containment="true"
	 *        annotation="urn:org.nasdanika:react required='true'"
	 * @generated
	 */
	XYPosition getPosition();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.react.flow.FlowNode#getPosition <em>Position</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position</em>' containment reference.
	 * @see #getPosition()
	 * @generated
	 */
	void setPosition(XYPosition value);

	/**
	 * Returns the value of the '<em><b>Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data</em>' containment reference.
	 * @see #setData(FlowData)
	 * @see org.nasdanika.sdk.runtime.models.react.flow.FlowPackage#getFlowNode_Data()
	 * @model containment="true"
	 *        annotation="urn:org.nasdanika:react required='true'"
	 * @generated
	 */
	FlowData getData();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.react.flow.FlowNode#getData <em>Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data</em>' containment reference.
	 * @see #getData()
	 * @generated
	 */
	void setData(FlowData value);

	/**
	 * Returns the value of the '<em><b>Source Position</b></em>' attribute.
	 * The literals are from the enumeration {@link org.nasdanika.sdk.runtime.models.react.flow.HandlePosition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Position</em>' attribute.
	 * @see org.nasdanika.sdk.runtime.models.react.flow.HandlePosition
	 * @see #isSetSourcePosition()
	 * @see #unsetSourcePosition()
	 * @see #setSourcePosition(HandlePosition)
	 * @see org.nasdanika.sdk.runtime.models.react.flow.FlowPackage#getFlowNode_SourcePosition()
	 * @model unique="false" unsettable="true"
	 *        annotation="urn:org.nasdanika:react enum='Position' module='@xyflow/react'"
	 * @generated
	 */
	HandlePosition getSourcePosition();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.react.flow.FlowNode#getSourcePosition <em>Source Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Position</em>' attribute.
	 * @see org.nasdanika.sdk.runtime.models.react.flow.HandlePosition
	 * @see #isSetSourcePosition()
	 * @see #unsetSourcePosition()
	 * @see #getSourcePosition()
	 * @generated
	 */
	void setSourcePosition(HandlePosition value);

	/**
	 * Unsets the value of the '{@link org.nasdanika.sdk.runtime.models.react.flow.FlowNode#getSourcePosition <em>Source Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSourcePosition()
	 * @see #getSourcePosition()
	 * @see #setSourcePosition(HandlePosition)
	 * @generated
	 */
	void unsetSourcePosition();

	/**
	 * Returns whether the value of the '{@link org.nasdanika.sdk.runtime.models.react.flow.FlowNode#getSourcePosition <em>Source Position</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Source Position</em>' attribute is set.
	 * @see #unsetSourcePosition()
	 * @see #getSourcePosition()
	 * @see #setSourcePosition(HandlePosition)
	 * @generated
	 */
	boolean isSetSourcePosition();

	/**
	 * Returns the value of the '<em><b>Target Position</b></em>' attribute.
	 * The literals are from the enumeration {@link org.nasdanika.sdk.runtime.models.react.flow.HandlePosition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Position</em>' attribute.
	 * @see org.nasdanika.sdk.runtime.models.react.flow.HandlePosition
	 * @see #isSetTargetPosition()
	 * @see #unsetTargetPosition()
	 * @see #setTargetPosition(HandlePosition)
	 * @see org.nasdanika.sdk.runtime.models.react.flow.FlowPackage#getFlowNode_TargetPosition()
	 * @model unique="false" unsettable="true"
	 *        annotation="urn:org.nasdanika:react enum='Position' module='@xyflow/react'"
	 * @generated
	 */
	HandlePosition getTargetPosition();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.react.flow.FlowNode#getTargetPosition <em>Target Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Position</em>' attribute.
	 * @see org.nasdanika.sdk.runtime.models.react.flow.HandlePosition
	 * @see #isSetTargetPosition()
	 * @see #unsetTargetPosition()
	 * @see #getTargetPosition()
	 * @generated
	 */
	void setTargetPosition(HandlePosition value);

	/**
	 * Unsets the value of the '{@link org.nasdanika.sdk.runtime.models.react.flow.FlowNode#getTargetPosition <em>Target Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTargetPosition()
	 * @see #getTargetPosition()
	 * @see #setTargetPosition(HandlePosition)
	 * @generated
	 */
	void unsetTargetPosition();

	/**
	 * Returns whether the value of the '{@link org.nasdanika.sdk.runtime.models.react.flow.FlowNode#getTargetPosition <em>Target Position</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Target Position</em>' attribute is set.
	 * @see #unsetTargetPosition()
	 * @see #getTargetPosition()
	 * @see #setTargetPosition(HandlePosition)
	 * @generated
	 */
	boolean isSetTargetPosition();

	/**
	 * Returns the value of the '<em><b>Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hidden</em>' attribute.
	 * @see #isSetHidden()
	 * @see #unsetHidden()
	 * @see #setHidden(boolean)
	 * @see org.nasdanika.sdk.runtime.models.react.flow.FlowPackage#getFlowNode_Hidden()
	 * @model unique="false" unsettable="true"
	 * @generated
	 */
	boolean isHidden();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.react.flow.FlowNode#isHidden <em>Hidden</em>}' attribute.
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
	 * Unsets the value of the '{@link org.nasdanika.sdk.runtime.models.react.flow.FlowNode#isHidden <em>Hidden</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetHidden()
	 * @see #isHidden()
	 * @see #setHidden(boolean)
	 * @generated
	 */
	void unsetHidden();

	/**
	 * Returns whether the value of the '{@link org.nasdanika.sdk.runtime.models.react.flow.FlowNode#isHidden <em>Hidden</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Draggable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Draggable</em>' attribute.
	 * @see #isSetDraggable()
	 * @see #unsetDraggable()
	 * @see #setDraggable(boolean)
	 * @see org.nasdanika.sdk.runtime.models.react.flow.FlowPackage#getFlowNode_Draggable()
	 * @model unique="false" unsettable="true"
	 * @generated
	 */
	boolean isDraggable();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.react.flow.FlowNode#isDraggable <em>Draggable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Draggable</em>' attribute.
	 * @see #isSetDraggable()
	 * @see #unsetDraggable()
	 * @see #isDraggable()
	 * @generated
	 */
	void setDraggable(boolean value);

	/**
	 * Unsets the value of the '{@link org.nasdanika.sdk.runtime.models.react.flow.FlowNode#isDraggable <em>Draggable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDraggable()
	 * @see #isDraggable()
	 * @see #setDraggable(boolean)
	 * @generated
	 */
	void unsetDraggable();

	/**
	 * Returns whether the value of the '{@link org.nasdanika.sdk.runtime.models.react.flow.FlowNode#isDraggable <em>Draggable</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Draggable</em>' attribute is set.
	 * @see #unsetDraggable()
	 * @see #isDraggable()
	 * @see #setDraggable(boolean)
	 * @generated
	 */
	boolean isSetDraggable();

	/**
	 * Returns the value of the '<em><b>Selectable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Selectable</em>' attribute.
	 * @see #isSetSelectable()
	 * @see #unsetSelectable()
	 * @see #setSelectable(boolean)
	 * @see org.nasdanika.sdk.runtime.models.react.flow.FlowPackage#getFlowNode_Selectable()
	 * @model unique="false" unsettable="true"
	 * @generated
	 */
	boolean isSelectable();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.react.flow.FlowNode#isSelectable <em>Selectable</em>}' attribute.
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
	 * Unsets the value of the '{@link org.nasdanika.sdk.runtime.models.react.flow.FlowNode#isSelectable <em>Selectable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSelectable()
	 * @see #isSelectable()
	 * @see #setSelectable(boolean)
	 * @generated
	 */
	void unsetSelectable();

	/**
	 * Returns whether the value of the '{@link org.nasdanika.sdk.runtime.models.react.flow.FlowNode#isSelectable <em>Selectable</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Connectable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connectable</em>' attribute.
	 * @see #isSetConnectable()
	 * @see #unsetConnectable()
	 * @see #setConnectable(boolean)
	 * @see org.nasdanika.sdk.runtime.models.react.flow.FlowPackage#getFlowNode_Connectable()
	 * @model unique="false" unsettable="true"
	 * @generated
	 */
	boolean isConnectable();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.react.flow.FlowNode#isConnectable <em>Connectable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connectable</em>' attribute.
	 * @see #isSetConnectable()
	 * @see #unsetConnectable()
	 * @see #isConnectable()
	 * @generated
	 */
	void setConnectable(boolean value);

	/**
	 * Unsets the value of the '{@link org.nasdanika.sdk.runtime.models.react.flow.FlowNode#isConnectable <em>Connectable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetConnectable()
	 * @see #isConnectable()
	 * @see #setConnectable(boolean)
	 * @generated
	 */
	void unsetConnectable();

	/**
	 * Returns whether the value of the '{@link org.nasdanika.sdk.runtime.models.react.flow.FlowNode#isConnectable <em>Connectable</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Connectable</em>' attribute is set.
	 * @see #unsetConnectable()
	 * @see #isConnectable()
	 * @see #setConnectable(boolean)
	 * @generated
	 */
	boolean isSetConnectable();

	/**
	 * Returns the value of the '<em><b>Deletable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deletable</em>' attribute.
	 * @see #isSetDeletable()
	 * @see #unsetDeletable()
	 * @see #setDeletable(boolean)
	 * @see org.nasdanika.sdk.runtime.models.react.flow.FlowPackage#getFlowNode_Deletable()
	 * @model unique="false" unsettable="true"
	 * @generated
	 */
	boolean isDeletable();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.react.flow.FlowNode#isDeletable <em>Deletable</em>}' attribute.
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
	 * Unsets the value of the '{@link org.nasdanika.sdk.runtime.models.react.flow.FlowNode#isDeletable <em>Deletable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDeletable()
	 * @see #isDeletable()
	 * @see #setDeletable(boolean)
	 * @generated
	 */
	void unsetDeletable();

	/**
	 * Returns whether the value of the '{@link org.nasdanika.sdk.runtime.models.react.flow.FlowNode#isDeletable <em>Deletable</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Parent node of a sub flow
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parent</em>' reference.
	 * @see #setParent(FlowNode)
	 * @see org.nasdanika.sdk.runtime.models.react.flow.FlowPackage#getFlowNode_Parent()
	 * @model annotation="urn:org.nasdanika:react prop='parentId' ref='id'"
	 * @generated
	 */
	FlowNode getParent();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.react.flow.FlowNode#getParent <em>Parent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(FlowNode value);

	/**
	 * Returns the value of the '<em><b>Extent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  "parent" keeps a child node within its parent
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Extent</em>' attribute.
	 * @see #setExtent(String)
	 * @see org.nasdanika.sdk.runtime.models.react.flow.FlowPackage#getFlowNode_Extent()
	 * @model unique="false"
	 * @generated
	 */
	String getExtent();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.react.flow.FlowNode#getExtent <em>Extent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extent</em>' attribute.
	 * @see #getExtent()
	 * @generated
	 */
	void setExtent(String value);

	/**
	 * Returns the value of the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Width</em>' attribute.
	 * @see #isSetWidth()
	 * @see #unsetWidth()
	 * @see #setWidth(double)
	 * @see org.nasdanika.sdk.runtime.models.react.flow.FlowPackage#getFlowNode_Width()
	 * @model unique="false" unsettable="true"
	 * @generated
	 */
	double getWidth();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.react.flow.FlowNode#getWidth <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Width</em>' attribute.
	 * @see #isSetWidth()
	 * @see #unsetWidth()
	 * @see #getWidth()
	 * @generated
	 */
	void setWidth(double value);

	/**
	 * Unsets the value of the '{@link org.nasdanika.sdk.runtime.models.react.flow.FlowNode#getWidth <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetWidth()
	 * @see #getWidth()
	 * @see #setWidth(double)
	 * @generated
	 */
	void unsetWidth();

	/**
	 * Returns whether the value of the '{@link org.nasdanika.sdk.runtime.models.react.flow.FlowNode#getWidth <em>Width</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Width</em>' attribute is set.
	 * @see #unsetWidth()
	 * @see #getWidth()
	 * @see #setWidth(double)
	 * @generated
	 */
	boolean isSetWidth();

	/**
	 * Returns the value of the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Height</em>' attribute.
	 * @see #isSetHeight()
	 * @see #unsetHeight()
	 * @see #setHeight(double)
	 * @see org.nasdanika.sdk.runtime.models.react.flow.FlowPackage#getFlowNode_Height()
	 * @model unique="false" unsettable="true"
	 * @generated
	 */
	double getHeight();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.react.flow.FlowNode#getHeight <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Height</em>' attribute.
	 * @see #isSetHeight()
	 * @see #unsetHeight()
	 * @see #getHeight()
	 * @generated
	 */
	void setHeight(double value);

	/**
	 * Unsets the value of the '{@link org.nasdanika.sdk.runtime.models.react.flow.FlowNode#getHeight <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetHeight()
	 * @see #getHeight()
	 * @see #setHeight(double)
	 * @generated
	 */
	void unsetHeight();

	/**
	 * Returns whether the value of the '{@link org.nasdanika.sdk.runtime.models.react.flow.FlowNode#getHeight <em>Height</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Height</em>' attribute is set.
	 * @see #unsetHeight()
	 * @see #getHeight()
	 * @see #setHeight(double)
	 * @generated
	 */
	boolean isSetHeight();

	/**
	 * Returns the value of the '<em><b>ZIndex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ZIndex</em>' attribute.
	 * @see #isSetZIndex()
	 * @see #unsetZIndex()
	 * @see #setZIndex(int)
	 * @see org.nasdanika.sdk.runtime.models.react.flow.FlowPackage#getFlowNode_ZIndex()
	 * @model unique="false" unsettable="true"
	 * @generated
	 */
	int getZIndex();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.react.flow.FlowNode#getZIndex <em>ZIndex</em>}' attribute.
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
	 * Unsets the value of the '{@link org.nasdanika.sdk.runtime.models.react.flow.FlowNode#getZIndex <em>ZIndex</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetZIndex()
	 * @see #getZIndex()
	 * @see #setZIndex(int)
	 * @generated
	 */
	void unsetZIndex();

	/**
	 * Returns whether the value of the '{@link org.nasdanika.sdk.runtime.models.react.flow.FlowNode#getZIndex <em>ZIndex</em>}' attribute is set.
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
	 * @see org.nasdanika.sdk.runtime.models.react.flow.FlowPackage#getFlowNode_ClassName()
	 * @model unique="false"
	 * @generated
	 */
	String getClassName();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.react.flow.FlowNode#getClassName <em>Class Name</em>}' attribute.
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
	 * @see org.nasdanika.sdk.runtime.models.react.flow.FlowPackage#getFlowNode_Style()
	 * @model mapType="org.nasdanika.sdk.runtime.models.core.StringToStringMapEntry&lt;org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString&gt;"
	 *        annotation="urn:org.nasdanika:react style='true'"
	 * @generated
	 */
	EMap<String, String> getStyle();

} // FlowNode
