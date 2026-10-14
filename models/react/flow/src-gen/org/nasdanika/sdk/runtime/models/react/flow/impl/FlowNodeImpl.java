/**
 */
package org.nasdanika.sdk.runtime.models.react.flow.impl;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.sdk.runtime.models.react.flow.FlowData;
import org.nasdanika.sdk.runtime.models.react.flow.FlowNode;
import org.nasdanika.sdk.runtime.models.react.flow.FlowPackage;
import org.nasdanika.sdk.runtime.models.react.flow.HandlePosition;
import org.nasdanika.sdk.runtime.models.react.flow.NodeType;
import org.nasdanika.sdk.runtime.models.react.flow.XYPosition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.flow.impl.FlowNodeImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.flow.impl.FlowNodeImpl#getCustomType <em>Custom Type</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.flow.impl.FlowNodeImpl#getNodeType <em>Node Type</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.flow.impl.FlowNodeImpl#getPosition <em>Position</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.flow.impl.FlowNodeImpl#getData <em>Data</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.flow.impl.FlowNodeImpl#getSourcePosition <em>Source Position</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.flow.impl.FlowNodeImpl#getTargetPosition <em>Target Position</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.flow.impl.FlowNodeImpl#isHidden <em>Hidden</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.flow.impl.FlowNodeImpl#isDraggable <em>Draggable</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.flow.impl.FlowNodeImpl#isSelectable <em>Selectable</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.flow.impl.FlowNodeImpl#isConnectable <em>Connectable</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.flow.impl.FlowNodeImpl#isDeletable <em>Deletable</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.flow.impl.FlowNodeImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.flow.impl.FlowNodeImpl#getExtent <em>Extent</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.flow.impl.FlowNodeImpl#getWidth <em>Width</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.flow.impl.FlowNodeImpl#getHeight <em>Height</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.flow.impl.FlowNodeImpl#getZIndex <em>ZIndex</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.flow.impl.FlowNodeImpl#getClassName <em>Class Name</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.flow.impl.FlowNodeImpl#getStyle <em>Style</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FlowNodeImpl extends MinimalEObjectImpl.Container implements FlowNode {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getCustomType() <em>Custom Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomType()
	 * @generated
	 * @ordered
	 */
	protected static final String CUSTOM_TYPE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getNodeType() <em>Node Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodeType()
	 * @generated
	 * @ordered
	 */
	protected static final NodeType NODE_TYPE_EDEFAULT = NodeType.DEFAULT;

	/**
	 * The default value of the '{@link #getSourcePosition() <em>Source Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourcePosition()
	 * @generated
	 * @ordered
	 */
	protected static final HandlePosition SOURCE_POSITION_EDEFAULT = HandlePosition.LEFT;

	/**
	 * The default value of the '{@link #getTargetPosition() <em>Target Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetPosition()
	 * @generated
	 * @ordered
	 */
	protected static final HandlePosition TARGET_POSITION_EDEFAULT = HandlePosition.LEFT;

	/**
	 * The default value of the '{@link #isHidden() <em>Hidden</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHidden()
	 * @generated
	 * @ordered
	 */
	protected static final boolean HIDDEN_EDEFAULT = false;

	/**
	 * The default value of the '{@link #isDraggable() <em>Draggable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDraggable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DRAGGABLE_EDEFAULT = false;

	/**
	 * The default value of the '{@link #isSelectable() <em>Selectable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSelectable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SELECTABLE_EDEFAULT = false;

	/**
	 * The default value of the '{@link #isConnectable() <em>Connectable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isConnectable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CONNECTABLE_EDEFAULT = false;

	/**
	 * The default value of the '{@link #isDeletable() <em>Deletable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDeletable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DELETABLE_EDEFAULT = false;

	/**
	 * The default value of the '{@link #getExtent() <em>Extent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtent()
	 * @generated
	 * @ordered
	 */
	protected static final String EXTENT_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected static final double WIDTH_EDEFAULT = 0.0;

	/**
	 * The default value of the '{@link #getHeight() <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeight()
	 * @generated
	 * @ordered
	 */
	protected static final double HEIGHT_EDEFAULT = 0.0;

	/**
	 * The default value of the '{@link #getZIndex() <em>ZIndex</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZIndex()
	 * @generated
	 * @ordered
	 */
	protected static final int ZINDEX_EDEFAULT = 0;

	/**
	 * The default value of the '{@link #getClassName() <em>Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String CLASS_NAME_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FlowNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FlowPackage.Literals.FLOW_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return (String)eDynamicGet(FlowPackage.FLOW_NODE__ID, FlowPackage.Literals.FLOW_NODE__ID, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		eDynamicSet(FlowPackage.FLOW_NODE__ID, FlowPackage.Literals.FLOW_NODE__ID, newId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCustomType() {
		return (String)eDynamicGet(FlowPackage.FLOW_NODE__CUSTOM_TYPE, FlowPackage.Literals.FLOW_NODE__CUSTOM_TYPE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCustomType(String newCustomType) {
		eDynamicSet(FlowPackage.FLOW_NODE__CUSTOM_TYPE, FlowPackage.Literals.FLOW_NODE__CUSTOM_TYPE, newCustomType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeType getNodeType() {
		return (NodeType)eDynamicGet(FlowPackage.FLOW_NODE__NODE_TYPE, FlowPackage.Literals.FLOW_NODE__NODE_TYPE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNodeType(NodeType newNodeType) {
		eDynamicSet(FlowPackage.FLOW_NODE__NODE_TYPE, FlowPackage.Literals.FLOW_NODE__NODE_TYPE, newNodeType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNodeType() {
		eDynamicUnset(FlowPackage.FLOW_NODE__NODE_TYPE, FlowPackage.Literals.FLOW_NODE__NODE_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNodeType() {
		return eDynamicIsSet(FlowPackage.FLOW_NODE__NODE_TYPE, FlowPackage.Literals.FLOW_NODE__NODE_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XYPosition getPosition() {
		return (XYPosition)eDynamicGet(FlowPackage.FLOW_NODE__POSITION, FlowPackage.Literals.FLOW_NODE__POSITION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPosition(XYPosition newPosition, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newPosition, FlowPackage.FLOW_NODE__POSITION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPosition(XYPosition newPosition) {
		eDynamicSet(FlowPackage.FLOW_NODE__POSITION, FlowPackage.Literals.FLOW_NODE__POSITION, newPosition);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlowData getData() {
		return (FlowData)eDynamicGet(FlowPackage.FLOW_NODE__DATA, FlowPackage.Literals.FLOW_NODE__DATA, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetData(FlowData newData, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newData, FlowPackage.FLOW_NODE__DATA, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setData(FlowData newData) {
		eDynamicSet(FlowPackage.FLOW_NODE__DATA, FlowPackage.Literals.FLOW_NODE__DATA, newData);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HandlePosition getSourcePosition() {
		return (HandlePosition)eDynamicGet(FlowPackage.FLOW_NODE__SOURCE_POSITION, FlowPackage.Literals.FLOW_NODE__SOURCE_POSITION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourcePosition(HandlePosition newSourcePosition) {
		eDynamicSet(FlowPackage.FLOW_NODE__SOURCE_POSITION, FlowPackage.Literals.FLOW_NODE__SOURCE_POSITION, newSourcePosition);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSourcePosition() {
		eDynamicUnset(FlowPackage.FLOW_NODE__SOURCE_POSITION, FlowPackage.Literals.FLOW_NODE__SOURCE_POSITION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSourcePosition() {
		return eDynamicIsSet(FlowPackage.FLOW_NODE__SOURCE_POSITION, FlowPackage.Literals.FLOW_NODE__SOURCE_POSITION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HandlePosition getTargetPosition() {
		return (HandlePosition)eDynamicGet(FlowPackage.FLOW_NODE__TARGET_POSITION, FlowPackage.Literals.FLOW_NODE__TARGET_POSITION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetPosition(HandlePosition newTargetPosition) {
		eDynamicSet(FlowPackage.FLOW_NODE__TARGET_POSITION, FlowPackage.Literals.FLOW_NODE__TARGET_POSITION, newTargetPosition);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTargetPosition() {
		eDynamicUnset(FlowPackage.FLOW_NODE__TARGET_POSITION, FlowPackage.Literals.FLOW_NODE__TARGET_POSITION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTargetPosition() {
		return eDynamicIsSet(FlowPackage.FLOW_NODE__TARGET_POSITION, FlowPackage.Literals.FLOW_NODE__TARGET_POSITION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isHidden() {
		return (Boolean)eDynamicGet(FlowPackage.FLOW_NODE__HIDDEN, FlowPackage.Literals.FLOW_NODE__HIDDEN, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHidden(boolean newHidden) {
		eDynamicSet(FlowPackage.FLOW_NODE__HIDDEN, FlowPackage.Literals.FLOW_NODE__HIDDEN, newHidden);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetHidden() {
		eDynamicUnset(FlowPackage.FLOW_NODE__HIDDEN, FlowPackage.Literals.FLOW_NODE__HIDDEN);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetHidden() {
		return eDynamicIsSet(FlowPackage.FLOW_NODE__HIDDEN, FlowPackage.Literals.FLOW_NODE__HIDDEN);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDraggable() {
		return (Boolean)eDynamicGet(FlowPackage.FLOW_NODE__DRAGGABLE, FlowPackage.Literals.FLOW_NODE__DRAGGABLE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDraggable(boolean newDraggable) {
		eDynamicSet(FlowPackage.FLOW_NODE__DRAGGABLE, FlowPackage.Literals.FLOW_NODE__DRAGGABLE, newDraggable);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDraggable() {
		eDynamicUnset(FlowPackage.FLOW_NODE__DRAGGABLE, FlowPackage.Literals.FLOW_NODE__DRAGGABLE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDraggable() {
		return eDynamicIsSet(FlowPackage.FLOW_NODE__DRAGGABLE, FlowPackage.Literals.FLOW_NODE__DRAGGABLE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSelectable() {
		return (Boolean)eDynamicGet(FlowPackage.FLOW_NODE__SELECTABLE, FlowPackage.Literals.FLOW_NODE__SELECTABLE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSelectable(boolean newSelectable) {
		eDynamicSet(FlowPackage.FLOW_NODE__SELECTABLE, FlowPackage.Literals.FLOW_NODE__SELECTABLE, newSelectable);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSelectable() {
		eDynamicUnset(FlowPackage.FLOW_NODE__SELECTABLE, FlowPackage.Literals.FLOW_NODE__SELECTABLE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSelectable() {
		return eDynamicIsSet(FlowPackage.FLOW_NODE__SELECTABLE, FlowPackage.Literals.FLOW_NODE__SELECTABLE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isConnectable() {
		return (Boolean)eDynamicGet(FlowPackage.FLOW_NODE__CONNECTABLE, FlowPackage.Literals.FLOW_NODE__CONNECTABLE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConnectable(boolean newConnectable) {
		eDynamicSet(FlowPackage.FLOW_NODE__CONNECTABLE, FlowPackage.Literals.FLOW_NODE__CONNECTABLE, newConnectable);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetConnectable() {
		eDynamicUnset(FlowPackage.FLOW_NODE__CONNECTABLE, FlowPackage.Literals.FLOW_NODE__CONNECTABLE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetConnectable() {
		return eDynamicIsSet(FlowPackage.FLOW_NODE__CONNECTABLE, FlowPackage.Literals.FLOW_NODE__CONNECTABLE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDeletable() {
		return (Boolean)eDynamicGet(FlowPackage.FLOW_NODE__DELETABLE, FlowPackage.Literals.FLOW_NODE__DELETABLE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeletable(boolean newDeletable) {
		eDynamicSet(FlowPackage.FLOW_NODE__DELETABLE, FlowPackage.Literals.FLOW_NODE__DELETABLE, newDeletable);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDeletable() {
		eDynamicUnset(FlowPackage.FLOW_NODE__DELETABLE, FlowPackage.Literals.FLOW_NODE__DELETABLE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDeletable() {
		return eDynamicIsSet(FlowPackage.FLOW_NODE__DELETABLE, FlowPackage.Literals.FLOW_NODE__DELETABLE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlowNode getParent() {
		return (FlowNode)eDynamicGet(FlowPackage.FLOW_NODE__PARENT, FlowPackage.Literals.FLOW_NODE__PARENT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlowNode basicGetParent() {
		return (FlowNode)eDynamicGet(FlowPackage.FLOW_NODE__PARENT, FlowPackage.Literals.FLOW_NODE__PARENT, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(FlowNode newParent) {
		eDynamicSet(FlowPackage.FLOW_NODE__PARENT, FlowPackage.Literals.FLOW_NODE__PARENT, newParent);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExtent() {
		return (String)eDynamicGet(FlowPackage.FLOW_NODE__EXTENT, FlowPackage.Literals.FLOW_NODE__EXTENT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtent(String newExtent) {
		eDynamicSet(FlowPackage.FLOW_NODE__EXTENT, FlowPackage.Literals.FLOW_NODE__EXTENT, newExtent);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getWidth() {
		return (Double)eDynamicGet(FlowPackage.FLOW_NODE__WIDTH, FlowPackage.Literals.FLOW_NODE__WIDTH, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWidth(double newWidth) {
		eDynamicSet(FlowPackage.FLOW_NODE__WIDTH, FlowPackage.Literals.FLOW_NODE__WIDTH, newWidth);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetWidth() {
		eDynamicUnset(FlowPackage.FLOW_NODE__WIDTH, FlowPackage.Literals.FLOW_NODE__WIDTH);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetWidth() {
		return eDynamicIsSet(FlowPackage.FLOW_NODE__WIDTH, FlowPackage.Literals.FLOW_NODE__WIDTH);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getHeight() {
		return (Double)eDynamicGet(FlowPackage.FLOW_NODE__HEIGHT, FlowPackage.Literals.FLOW_NODE__HEIGHT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeight(double newHeight) {
		eDynamicSet(FlowPackage.FLOW_NODE__HEIGHT, FlowPackage.Literals.FLOW_NODE__HEIGHT, newHeight);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetHeight() {
		eDynamicUnset(FlowPackage.FLOW_NODE__HEIGHT, FlowPackage.Literals.FLOW_NODE__HEIGHT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetHeight() {
		return eDynamicIsSet(FlowPackage.FLOW_NODE__HEIGHT, FlowPackage.Literals.FLOW_NODE__HEIGHT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getZIndex() {
		return (Integer)eDynamicGet(FlowPackage.FLOW_NODE__ZINDEX, FlowPackage.Literals.FLOW_NODE__ZINDEX, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setZIndex(int newZIndex) {
		eDynamicSet(FlowPackage.FLOW_NODE__ZINDEX, FlowPackage.Literals.FLOW_NODE__ZINDEX, newZIndex);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetZIndex() {
		eDynamicUnset(FlowPackage.FLOW_NODE__ZINDEX, FlowPackage.Literals.FLOW_NODE__ZINDEX);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetZIndex() {
		return eDynamicIsSet(FlowPackage.FLOW_NODE__ZINDEX, FlowPackage.Literals.FLOW_NODE__ZINDEX);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getClassName() {
		return (String)eDynamicGet(FlowPackage.FLOW_NODE__CLASS_NAME, FlowPackage.Literals.FLOW_NODE__CLASS_NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClassName(String newClassName) {
		eDynamicSet(FlowPackage.FLOW_NODE__CLASS_NAME, FlowPackage.Literals.FLOW_NODE__CLASS_NAME, newClassName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EMap<String, String> getStyle() {
		return (EMap<String, String>)eDynamicGet(FlowPackage.FLOW_NODE__STYLE, FlowPackage.Literals.FLOW_NODE__STYLE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FlowPackage.FLOW_NODE__POSITION:
				return basicSetPosition(null, msgs);
			case FlowPackage.FLOW_NODE__DATA:
				return basicSetData(null, msgs);
			case FlowPackage.FLOW_NODE__STYLE:
				return ((InternalEList<?>)getStyle()).basicRemove(otherEnd, msgs);
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
			case FlowPackage.FLOW_NODE__ID:
				return getId();
			case FlowPackage.FLOW_NODE__CUSTOM_TYPE:
				return getCustomType();
			case FlowPackage.FLOW_NODE__NODE_TYPE:
				return getNodeType();
			case FlowPackage.FLOW_NODE__POSITION:
				return getPosition();
			case FlowPackage.FLOW_NODE__DATA:
				return getData();
			case FlowPackage.FLOW_NODE__SOURCE_POSITION:
				return getSourcePosition();
			case FlowPackage.FLOW_NODE__TARGET_POSITION:
				return getTargetPosition();
			case FlowPackage.FLOW_NODE__HIDDEN:
				return isHidden();
			case FlowPackage.FLOW_NODE__DRAGGABLE:
				return isDraggable();
			case FlowPackage.FLOW_NODE__SELECTABLE:
				return isSelectable();
			case FlowPackage.FLOW_NODE__CONNECTABLE:
				return isConnectable();
			case FlowPackage.FLOW_NODE__DELETABLE:
				return isDeletable();
			case FlowPackage.FLOW_NODE__PARENT:
				if (resolve) return getParent();
				return basicGetParent();
			case FlowPackage.FLOW_NODE__EXTENT:
				return getExtent();
			case FlowPackage.FLOW_NODE__WIDTH:
				return getWidth();
			case FlowPackage.FLOW_NODE__HEIGHT:
				return getHeight();
			case FlowPackage.FLOW_NODE__ZINDEX:
				return getZIndex();
			case FlowPackage.FLOW_NODE__CLASS_NAME:
				return getClassName();
			case FlowPackage.FLOW_NODE__STYLE:
				if (coreType) return getStyle();
				else return getStyle().map();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case FlowPackage.FLOW_NODE__ID:
				setId((String)newValue);
				return;
			case FlowPackage.FLOW_NODE__CUSTOM_TYPE:
				setCustomType((String)newValue);
				return;
			case FlowPackage.FLOW_NODE__NODE_TYPE:
				setNodeType((NodeType)newValue);
				return;
			case FlowPackage.FLOW_NODE__POSITION:
				setPosition((XYPosition)newValue);
				return;
			case FlowPackage.FLOW_NODE__DATA:
				setData((FlowData)newValue);
				return;
			case FlowPackage.FLOW_NODE__SOURCE_POSITION:
				setSourcePosition((HandlePosition)newValue);
				return;
			case FlowPackage.FLOW_NODE__TARGET_POSITION:
				setTargetPosition((HandlePosition)newValue);
				return;
			case FlowPackage.FLOW_NODE__HIDDEN:
				setHidden((Boolean)newValue);
				return;
			case FlowPackage.FLOW_NODE__DRAGGABLE:
				setDraggable((Boolean)newValue);
				return;
			case FlowPackage.FLOW_NODE__SELECTABLE:
				setSelectable((Boolean)newValue);
				return;
			case FlowPackage.FLOW_NODE__CONNECTABLE:
				setConnectable((Boolean)newValue);
				return;
			case FlowPackage.FLOW_NODE__DELETABLE:
				setDeletable((Boolean)newValue);
				return;
			case FlowPackage.FLOW_NODE__PARENT:
				setParent((FlowNode)newValue);
				return;
			case FlowPackage.FLOW_NODE__EXTENT:
				setExtent((String)newValue);
				return;
			case FlowPackage.FLOW_NODE__WIDTH:
				setWidth((Double)newValue);
				return;
			case FlowPackage.FLOW_NODE__HEIGHT:
				setHeight((Double)newValue);
				return;
			case FlowPackage.FLOW_NODE__ZINDEX:
				setZIndex((Integer)newValue);
				return;
			case FlowPackage.FLOW_NODE__CLASS_NAME:
				setClassName((String)newValue);
				return;
			case FlowPackage.FLOW_NODE__STYLE:
				((EStructuralFeature.Setting)getStyle()).set(newValue);
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
			case FlowPackage.FLOW_NODE__ID:
				setId(ID_EDEFAULT);
				return;
			case FlowPackage.FLOW_NODE__CUSTOM_TYPE:
				setCustomType(CUSTOM_TYPE_EDEFAULT);
				return;
			case FlowPackage.FLOW_NODE__NODE_TYPE:
				unsetNodeType();
				return;
			case FlowPackage.FLOW_NODE__POSITION:
				setPosition((XYPosition)null);
				return;
			case FlowPackage.FLOW_NODE__DATA:
				setData((FlowData)null);
				return;
			case FlowPackage.FLOW_NODE__SOURCE_POSITION:
				unsetSourcePosition();
				return;
			case FlowPackage.FLOW_NODE__TARGET_POSITION:
				unsetTargetPosition();
				return;
			case FlowPackage.FLOW_NODE__HIDDEN:
				unsetHidden();
				return;
			case FlowPackage.FLOW_NODE__DRAGGABLE:
				unsetDraggable();
				return;
			case FlowPackage.FLOW_NODE__SELECTABLE:
				unsetSelectable();
				return;
			case FlowPackage.FLOW_NODE__CONNECTABLE:
				unsetConnectable();
				return;
			case FlowPackage.FLOW_NODE__DELETABLE:
				unsetDeletable();
				return;
			case FlowPackage.FLOW_NODE__PARENT:
				setParent((FlowNode)null);
				return;
			case FlowPackage.FLOW_NODE__EXTENT:
				setExtent(EXTENT_EDEFAULT);
				return;
			case FlowPackage.FLOW_NODE__WIDTH:
				unsetWidth();
				return;
			case FlowPackage.FLOW_NODE__HEIGHT:
				unsetHeight();
				return;
			case FlowPackage.FLOW_NODE__ZINDEX:
				unsetZIndex();
				return;
			case FlowPackage.FLOW_NODE__CLASS_NAME:
				setClassName(CLASS_NAME_EDEFAULT);
				return;
			case FlowPackage.FLOW_NODE__STYLE:
				getStyle().clear();
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
			case FlowPackage.FLOW_NODE__ID:
				return ID_EDEFAULT == null ? getId() != null : !ID_EDEFAULT.equals(getId());
			case FlowPackage.FLOW_NODE__CUSTOM_TYPE:
				return CUSTOM_TYPE_EDEFAULT == null ? getCustomType() != null : !CUSTOM_TYPE_EDEFAULT.equals(getCustomType());
			case FlowPackage.FLOW_NODE__NODE_TYPE:
				return isSetNodeType();
			case FlowPackage.FLOW_NODE__POSITION:
				return getPosition() != null;
			case FlowPackage.FLOW_NODE__DATA:
				return getData() != null;
			case FlowPackage.FLOW_NODE__SOURCE_POSITION:
				return isSetSourcePosition();
			case FlowPackage.FLOW_NODE__TARGET_POSITION:
				return isSetTargetPosition();
			case FlowPackage.FLOW_NODE__HIDDEN:
				return isSetHidden();
			case FlowPackage.FLOW_NODE__DRAGGABLE:
				return isSetDraggable();
			case FlowPackage.FLOW_NODE__SELECTABLE:
				return isSetSelectable();
			case FlowPackage.FLOW_NODE__CONNECTABLE:
				return isSetConnectable();
			case FlowPackage.FLOW_NODE__DELETABLE:
				return isSetDeletable();
			case FlowPackage.FLOW_NODE__PARENT:
				return basicGetParent() != null;
			case FlowPackage.FLOW_NODE__EXTENT:
				return EXTENT_EDEFAULT == null ? getExtent() != null : !EXTENT_EDEFAULT.equals(getExtent());
			case FlowPackage.FLOW_NODE__WIDTH:
				return isSetWidth();
			case FlowPackage.FLOW_NODE__HEIGHT:
				return isSetHeight();
			case FlowPackage.FLOW_NODE__ZINDEX:
				return isSetZIndex();
			case FlowPackage.FLOW_NODE__CLASS_NAME:
				return CLASS_NAME_EDEFAULT == null ? getClassName() != null : !CLASS_NAME_EDEFAULT.equals(getClassName());
			case FlowPackage.FLOW_NODE__STYLE:
				return !getStyle().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //FlowNodeImpl
