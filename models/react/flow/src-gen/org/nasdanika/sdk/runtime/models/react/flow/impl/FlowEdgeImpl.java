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

import org.nasdanika.sdk.runtime.models.react.JsxNode;

import org.nasdanika.sdk.runtime.models.react.flow.EdgeMarker;
import org.nasdanika.sdk.runtime.models.react.flow.EdgeType;
import org.nasdanika.sdk.runtime.models.react.flow.FlowData;
import org.nasdanika.sdk.runtime.models.react.flow.FlowEdge;
import org.nasdanika.sdk.runtime.models.react.flow.FlowNode;
import org.nasdanika.sdk.runtime.models.react.flow.FlowPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Edge</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.flow.impl.FlowEdgeImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.flow.impl.FlowEdgeImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.flow.impl.FlowEdgeImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.flow.impl.FlowEdgeImpl#getSourceHandle <em>Source Handle</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.flow.impl.FlowEdgeImpl#getTargetHandle <em>Target Handle</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.flow.impl.FlowEdgeImpl#getEdgeType <em>Edge Type</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.flow.impl.FlowEdgeImpl#getCustomType <em>Custom Type</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.flow.impl.FlowEdgeImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.flow.impl.FlowEdgeImpl#getLabelNode <em>Label Node</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.flow.impl.FlowEdgeImpl#isAnimated <em>Animated</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.flow.impl.FlowEdgeImpl#isHidden <em>Hidden</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.flow.impl.FlowEdgeImpl#isDeletable <em>Deletable</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.flow.impl.FlowEdgeImpl#isSelectable <em>Selectable</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.flow.impl.FlowEdgeImpl#isReconnectable <em>Reconnectable</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.flow.impl.FlowEdgeImpl#getMarkerStart <em>Marker Start</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.flow.impl.FlowEdgeImpl#getMarkerEnd <em>Marker End</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.flow.impl.FlowEdgeImpl#getData <em>Data</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.flow.impl.FlowEdgeImpl#getZIndex <em>ZIndex</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.flow.impl.FlowEdgeImpl#getClassName <em>Class Name</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.flow.impl.FlowEdgeImpl#getStyle <em>Style</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FlowEdgeImpl extends MinimalEObjectImpl.Container implements FlowEdge {
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
	 * The default value of the '{@link #getSourceHandle() <em>Source Handle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceHandle()
	 * @generated
	 * @ordered
	 */
	protected static final String SOURCE_HANDLE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getTargetHandle() <em>Target Handle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetHandle()
	 * @generated
	 * @ordered
	 */
	protected static final String TARGET_HANDLE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getEdgeType() <em>Edge Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEdgeType()
	 * @generated
	 * @ordered
	 */
	protected static final EdgeType EDGE_TYPE_EDEFAULT = EdgeType.BEZIER;

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
	 * The default value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String LABEL_EDEFAULT = null;

	/**
	 * The default value of the '{@link #isAnimated() <em>Animated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAnimated()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ANIMATED_EDEFAULT = false;

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
	 * The default value of the '{@link #isDeletable() <em>Deletable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDeletable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DELETABLE_EDEFAULT = false;

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
	 * The default value of the '{@link #isReconnectable() <em>Reconnectable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReconnectable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean RECONNECTABLE_EDEFAULT = false;

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
	protected FlowEdgeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FlowPackage.Literals.FLOW_EDGE;
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
		return (String)eDynamicGet(FlowPackage.FLOW_EDGE__ID, FlowPackage.Literals.FLOW_EDGE__ID, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		eDynamicSet(FlowPackage.FLOW_EDGE__ID, FlowPackage.Literals.FLOW_EDGE__ID, newId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlowNode getSource() {
		return (FlowNode)eDynamicGet(FlowPackage.FLOW_EDGE__SOURCE, FlowPackage.Literals.FLOW_EDGE__SOURCE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlowNode basicGetSource() {
		return (FlowNode)eDynamicGet(FlowPackage.FLOW_EDGE__SOURCE, FlowPackage.Literals.FLOW_EDGE__SOURCE, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(FlowNode newSource) {
		eDynamicSet(FlowPackage.FLOW_EDGE__SOURCE, FlowPackage.Literals.FLOW_EDGE__SOURCE, newSource);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlowNode getTarget() {
		return (FlowNode)eDynamicGet(FlowPackage.FLOW_EDGE__TARGET, FlowPackage.Literals.FLOW_EDGE__TARGET, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlowNode basicGetTarget() {
		return (FlowNode)eDynamicGet(FlowPackage.FLOW_EDGE__TARGET, FlowPackage.Literals.FLOW_EDGE__TARGET, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(FlowNode newTarget) {
		eDynamicSet(FlowPackage.FLOW_EDGE__TARGET, FlowPackage.Literals.FLOW_EDGE__TARGET, newTarget);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSourceHandle() {
		return (String)eDynamicGet(FlowPackage.FLOW_EDGE__SOURCE_HANDLE, FlowPackage.Literals.FLOW_EDGE__SOURCE_HANDLE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceHandle(String newSourceHandle) {
		eDynamicSet(FlowPackage.FLOW_EDGE__SOURCE_HANDLE, FlowPackage.Literals.FLOW_EDGE__SOURCE_HANDLE, newSourceHandle);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTargetHandle() {
		return (String)eDynamicGet(FlowPackage.FLOW_EDGE__TARGET_HANDLE, FlowPackage.Literals.FLOW_EDGE__TARGET_HANDLE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetHandle(String newTargetHandle) {
		eDynamicSet(FlowPackage.FLOW_EDGE__TARGET_HANDLE, FlowPackage.Literals.FLOW_EDGE__TARGET_HANDLE, newTargetHandle);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EdgeType getEdgeType() {
		return (EdgeType)eDynamicGet(FlowPackage.FLOW_EDGE__EDGE_TYPE, FlowPackage.Literals.FLOW_EDGE__EDGE_TYPE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEdgeType(EdgeType newEdgeType) {
		eDynamicSet(FlowPackage.FLOW_EDGE__EDGE_TYPE, FlowPackage.Literals.FLOW_EDGE__EDGE_TYPE, newEdgeType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEdgeType() {
		eDynamicUnset(FlowPackage.FLOW_EDGE__EDGE_TYPE, FlowPackage.Literals.FLOW_EDGE__EDGE_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEdgeType() {
		return eDynamicIsSet(FlowPackage.FLOW_EDGE__EDGE_TYPE, FlowPackage.Literals.FLOW_EDGE__EDGE_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCustomType() {
		return (String)eDynamicGet(FlowPackage.FLOW_EDGE__CUSTOM_TYPE, FlowPackage.Literals.FLOW_EDGE__CUSTOM_TYPE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCustomType(String newCustomType) {
		eDynamicSet(FlowPackage.FLOW_EDGE__CUSTOM_TYPE, FlowPackage.Literals.FLOW_EDGE__CUSTOM_TYPE, newCustomType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLabel() {
		return (String)eDynamicGet(FlowPackage.FLOW_EDGE__LABEL, FlowPackage.Literals.FLOW_EDGE__LABEL, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabel(String newLabel) {
		eDynamicSet(FlowPackage.FLOW_EDGE__LABEL, FlowPackage.Literals.FLOW_EDGE__LABEL, newLabel);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JsxNode getLabelNode() {
		return (JsxNode)eDynamicGet(FlowPackage.FLOW_EDGE__LABEL_NODE, FlowPackage.Literals.FLOW_EDGE__LABEL_NODE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLabelNode(JsxNode newLabelNode, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newLabelNode, FlowPackage.FLOW_EDGE__LABEL_NODE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabelNode(JsxNode newLabelNode) {
		eDynamicSet(FlowPackage.FLOW_EDGE__LABEL_NODE, FlowPackage.Literals.FLOW_EDGE__LABEL_NODE, newLabelNode);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAnimated() {
		return (Boolean)eDynamicGet(FlowPackage.FLOW_EDGE__ANIMATED, FlowPackage.Literals.FLOW_EDGE__ANIMATED, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnimated(boolean newAnimated) {
		eDynamicSet(FlowPackage.FLOW_EDGE__ANIMATED, FlowPackage.Literals.FLOW_EDGE__ANIMATED, newAnimated);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAnimated() {
		eDynamicUnset(FlowPackage.FLOW_EDGE__ANIMATED, FlowPackage.Literals.FLOW_EDGE__ANIMATED);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAnimated() {
		return eDynamicIsSet(FlowPackage.FLOW_EDGE__ANIMATED, FlowPackage.Literals.FLOW_EDGE__ANIMATED);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isHidden() {
		return (Boolean)eDynamicGet(FlowPackage.FLOW_EDGE__HIDDEN, FlowPackage.Literals.FLOW_EDGE__HIDDEN, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHidden(boolean newHidden) {
		eDynamicSet(FlowPackage.FLOW_EDGE__HIDDEN, FlowPackage.Literals.FLOW_EDGE__HIDDEN, newHidden);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetHidden() {
		eDynamicUnset(FlowPackage.FLOW_EDGE__HIDDEN, FlowPackage.Literals.FLOW_EDGE__HIDDEN);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetHidden() {
		return eDynamicIsSet(FlowPackage.FLOW_EDGE__HIDDEN, FlowPackage.Literals.FLOW_EDGE__HIDDEN);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDeletable() {
		return (Boolean)eDynamicGet(FlowPackage.FLOW_EDGE__DELETABLE, FlowPackage.Literals.FLOW_EDGE__DELETABLE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeletable(boolean newDeletable) {
		eDynamicSet(FlowPackage.FLOW_EDGE__DELETABLE, FlowPackage.Literals.FLOW_EDGE__DELETABLE, newDeletable);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDeletable() {
		eDynamicUnset(FlowPackage.FLOW_EDGE__DELETABLE, FlowPackage.Literals.FLOW_EDGE__DELETABLE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDeletable() {
		return eDynamicIsSet(FlowPackage.FLOW_EDGE__DELETABLE, FlowPackage.Literals.FLOW_EDGE__DELETABLE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSelectable() {
		return (Boolean)eDynamicGet(FlowPackage.FLOW_EDGE__SELECTABLE, FlowPackage.Literals.FLOW_EDGE__SELECTABLE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSelectable(boolean newSelectable) {
		eDynamicSet(FlowPackage.FLOW_EDGE__SELECTABLE, FlowPackage.Literals.FLOW_EDGE__SELECTABLE, newSelectable);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSelectable() {
		eDynamicUnset(FlowPackage.FLOW_EDGE__SELECTABLE, FlowPackage.Literals.FLOW_EDGE__SELECTABLE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSelectable() {
		return eDynamicIsSet(FlowPackage.FLOW_EDGE__SELECTABLE, FlowPackage.Literals.FLOW_EDGE__SELECTABLE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isReconnectable() {
		return (Boolean)eDynamicGet(FlowPackage.FLOW_EDGE__RECONNECTABLE, FlowPackage.Literals.FLOW_EDGE__RECONNECTABLE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReconnectable(boolean newReconnectable) {
		eDynamicSet(FlowPackage.FLOW_EDGE__RECONNECTABLE, FlowPackage.Literals.FLOW_EDGE__RECONNECTABLE, newReconnectable);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetReconnectable() {
		eDynamicUnset(FlowPackage.FLOW_EDGE__RECONNECTABLE, FlowPackage.Literals.FLOW_EDGE__RECONNECTABLE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetReconnectable() {
		return eDynamicIsSet(FlowPackage.FLOW_EDGE__RECONNECTABLE, FlowPackage.Literals.FLOW_EDGE__RECONNECTABLE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EdgeMarker getMarkerStart() {
		return (EdgeMarker)eDynamicGet(FlowPackage.FLOW_EDGE__MARKER_START, FlowPackage.Literals.FLOW_EDGE__MARKER_START, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMarkerStart(EdgeMarker newMarkerStart, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newMarkerStart, FlowPackage.FLOW_EDGE__MARKER_START, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMarkerStart(EdgeMarker newMarkerStart) {
		eDynamicSet(FlowPackage.FLOW_EDGE__MARKER_START, FlowPackage.Literals.FLOW_EDGE__MARKER_START, newMarkerStart);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EdgeMarker getMarkerEnd() {
		return (EdgeMarker)eDynamicGet(FlowPackage.FLOW_EDGE__MARKER_END, FlowPackage.Literals.FLOW_EDGE__MARKER_END, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMarkerEnd(EdgeMarker newMarkerEnd, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newMarkerEnd, FlowPackage.FLOW_EDGE__MARKER_END, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMarkerEnd(EdgeMarker newMarkerEnd) {
		eDynamicSet(FlowPackage.FLOW_EDGE__MARKER_END, FlowPackage.Literals.FLOW_EDGE__MARKER_END, newMarkerEnd);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlowData getData() {
		return (FlowData)eDynamicGet(FlowPackage.FLOW_EDGE__DATA, FlowPackage.Literals.FLOW_EDGE__DATA, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetData(FlowData newData, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newData, FlowPackage.FLOW_EDGE__DATA, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setData(FlowData newData) {
		eDynamicSet(FlowPackage.FLOW_EDGE__DATA, FlowPackage.Literals.FLOW_EDGE__DATA, newData);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getZIndex() {
		return (Integer)eDynamicGet(FlowPackage.FLOW_EDGE__ZINDEX, FlowPackage.Literals.FLOW_EDGE__ZINDEX, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setZIndex(int newZIndex) {
		eDynamicSet(FlowPackage.FLOW_EDGE__ZINDEX, FlowPackage.Literals.FLOW_EDGE__ZINDEX, newZIndex);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetZIndex() {
		eDynamicUnset(FlowPackage.FLOW_EDGE__ZINDEX, FlowPackage.Literals.FLOW_EDGE__ZINDEX);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetZIndex() {
		return eDynamicIsSet(FlowPackage.FLOW_EDGE__ZINDEX, FlowPackage.Literals.FLOW_EDGE__ZINDEX);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getClassName() {
		return (String)eDynamicGet(FlowPackage.FLOW_EDGE__CLASS_NAME, FlowPackage.Literals.FLOW_EDGE__CLASS_NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClassName(String newClassName) {
		eDynamicSet(FlowPackage.FLOW_EDGE__CLASS_NAME, FlowPackage.Literals.FLOW_EDGE__CLASS_NAME, newClassName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EMap<String, String> getStyle() {
		return (EMap<String, String>)eDynamicGet(FlowPackage.FLOW_EDGE__STYLE, FlowPackage.Literals.FLOW_EDGE__STYLE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FlowPackage.FLOW_EDGE__LABEL_NODE:
				return basicSetLabelNode(null, msgs);
			case FlowPackage.FLOW_EDGE__MARKER_START:
				return basicSetMarkerStart(null, msgs);
			case FlowPackage.FLOW_EDGE__MARKER_END:
				return basicSetMarkerEnd(null, msgs);
			case FlowPackage.FLOW_EDGE__DATA:
				return basicSetData(null, msgs);
			case FlowPackage.FLOW_EDGE__STYLE:
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
			case FlowPackage.FLOW_EDGE__ID:
				return getId();
			case FlowPackage.FLOW_EDGE__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case FlowPackage.FLOW_EDGE__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
			case FlowPackage.FLOW_EDGE__SOURCE_HANDLE:
				return getSourceHandle();
			case FlowPackage.FLOW_EDGE__TARGET_HANDLE:
				return getTargetHandle();
			case FlowPackage.FLOW_EDGE__EDGE_TYPE:
				return getEdgeType();
			case FlowPackage.FLOW_EDGE__CUSTOM_TYPE:
				return getCustomType();
			case FlowPackage.FLOW_EDGE__LABEL:
				return getLabel();
			case FlowPackage.FLOW_EDGE__LABEL_NODE:
				return getLabelNode();
			case FlowPackage.FLOW_EDGE__ANIMATED:
				return isAnimated();
			case FlowPackage.FLOW_EDGE__HIDDEN:
				return isHidden();
			case FlowPackage.FLOW_EDGE__DELETABLE:
				return isDeletable();
			case FlowPackage.FLOW_EDGE__SELECTABLE:
				return isSelectable();
			case FlowPackage.FLOW_EDGE__RECONNECTABLE:
				return isReconnectable();
			case FlowPackage.FLOW_EDGE__MARKER_START:
				return getMarkerStart();
			case FlowPackage.FLOW_EDGE__MARKER_END:
				return getMarkerEnd();
			case FlowPackage.FLOW_EDGE__DATA:
				return getData();
			case FlowPackage.FLOW_EDGE__ZINDEX:
				return getZIndex();
			case FlowPackage.FLOW_EDGE__CLASS_NAME:
				return getClassName();
			case FlowPackage.FLOW_EDGE__STYLE:
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
			case FlowPackage.FLOW_EDGE__ID:
				setId((String)newValue);
				return;
			case FlowPackage.FLOW_EDGE__SOURCE:
				setSource((FlowNode)newValue);
				return;
			case FlowPackage.FLOW_EDGE__TARGET:
				setTarget((FlowNode)newValue);
				return;
			case FlowPackage.FLOW_EDGE__SOURCE_HANDLE:
				setSourceHandle((String)newValue);
				return;
			case FlowPackage.FLOW_EDGE__TARGET_HANDLE:
				setTargetHandle((String)newValue);
				return;
			case FlowPackage.FLOW_EDGE__EDGE_TYPE:
				setEdgeType((EdgeType)newValue);
				return;
			case FlowPackage.FLOW_EDGE__CUSTOM_TYPE:
				setCustomType((String)newValue);
				return;
			case FlowPackage.FLOW_EDGE__LABEL:
				setLabel((String)newValue);
				return;
			case FlowPackage.FLOW_EDGE__LABEL_NODE:
				setLabelNode((JsxNode)newValue);
				return;
			case FlowPackage.FLOW_EDGE__ANIMATED:
				setAnimated((Boolean)newValue);
				return;
			case FlowPackage.FLOW_EDGE__HIDDEN:
				setHidden((Boolean)newValue);
				return;
			case FlowPackage.FLOW_EDGE__DELETABLE:
				setDeletable((Boolean)newValue);
				return;
			case FlowPackage.FLOW_EDGE__SELECTABLE:
				setSelectable((Boolean)newValue);
				return;
			case FlowPackage.FLOW_EDGE__RECONNECTABLE:
				setReconnectable((Boolean)newValue);
				return;
			case FlowPackage.FLOW_EDGE__MARKER_START:
				setMarkerStart((EdgeMarker)newValue);
				return;
			case FlowPackage.FLOW_EDGE__MARKER_END:
				setMarkerEnd((EdgeMarker)newValue);
				return;
			case FlowPackage.FLOW_EDGE__DATA:
				setData((FlowData)newValue);
				return;
			case FlowPackage.FLOW_EDGE__ZINDEX:
				setZIndex((Integer)newValue);
				return;
			case FlowPackage.FLOW_EDGE__CLASS_NAME:
				setClassName((String)newValue);
				return;
			case FlowPackage.FLOW_EDGE__STYLE:
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
			case FlowPackage.FLOW_EDGE__ID:
				setId(ID_EDEFAULT);
				return;
			case FlowPackage.FLOW_EDGE__SOURCE:
				setSource((FlowNode)null);
				return;
			case FlowPackage.FLOW_EDGE__TARGET:
				setTarget((FlowNode)null);
				return;
			case FlowPackage.FLOW_EDGE__SOURCE_HANDLE:
				setSourceHandle(SOURCE_HANDLE_EDEFAULT);
				return;
			case FlowPackage.FLOW_EDGE__TARGET_HANDLE:
				setTargetHandle(TARGET_HANDLE_EDEFAULT);
				return;
			case FlowPackage.FLOW_EDGE__EDGE_TYPE:
				unsetEdgeType();
				return;
			case FlowPackage.FLOW_EDGE__CUSTOM_TYPE:
				setCustomType(CUSTOM_TYPE_EDEFAULT);
				return;
			case FlowPackage.FLOW_EDGE__LABEL:
				setLabel(LABEL_EDEFAULT);
				return;
			case FlowPackage.FLOW_EDGE__LABEL_NODE:
				setLabelNode((JsxNode)null);
				return;
			case FlowPackage.FLOW_EDGE__ANIMATED:
				unsetAnimated();
				return;
			case FlowPackage.FLOW_EDGE__HIDDEN:
				unsetHidden();
				return;
			case FlowPackage.FLOW_EDGE__DELETABLE:
				unsetDeletable();
				return;
			case FlowPackage.FLOW_EDGE__SELECTABLE:
				unsetSelectable();
				return;
			case FlowPackage.FLOW_EDGE__RECONNECTABLE:
				unsetReconnectable();
				return;
			case FlowPackage.FLOW_EDGE__MARKER_START:
				setMarkerStart((EdgeMarker)null);
				return;
			case FlowPackage.FLOW_EDGE__MARKER_END:
				setMarkerEnd((EdgeMarker)null);
				return;
			case FlowPackage.FLOW_EDGE__DATA:
				setData((FlowData)null);
				return;
			case FlowPackage.FLOW_EDGE__ZINDEX:
				unsetZIndex();
				return;
			case FlowPackage.FLOW_EDGE__CLASS_NAME:
				setClassName(CLASS_NAME_EDEFAULT);
				return;
			case FlowPackage.FLOW_EDGE__STYLE:
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
			case FlowPackage.FLOW_EDGE__ID:
				return ID_EDEFAULT == null ? getId() != null : !ID_EDEFAULT.equals(getId());
			case FlowPackage.FLOW_EDGE__SOURCE:
				return basicGetSource() != null;
			case FlowPackage.FLOW_EDGE__TARGET:
				return basicGetTarget() != null;
			case FlowPackage.FLOW_EDGE__SOURCE_HANDLE:
				return SOURCE_HANDLE_EDEFAULT == null ? getSourceHandle() != null : !SOURCE_HANDLE_EDEFAULT.equals(getSourceHandle());
			case FlowPackage.FLOW_EDGE__TARGET_HANDLE:
				return TARGET_HANDLE_EDEFAULT == null ? getTargetHandle() != null : !TARGET_HANDLE_EDEFAULT.equals(getTargetHandle());
			case FlowPackage.FLOW_EDGE__EDGE_TYPE:
				return isSetEdgeType();
			case FlowPackage.FLOW_EDGE__CUSTOM_TYPE:
				return CUSTOM_TYPE_EDEFAULT == null ? getCustomType() != null : !CUSTOM_TYPE_EDEFAULT.equals(getCustomType());
			case FlowPackage.FLOW_EDGE__LABEL:
				return LABEL_EDEFAULT == null ? getLabel() != null : !LABEL_EDEFAULT.equals(getLabel());
			case FlowPackage.FLOW_EDGE__LABEL_NODE:
				return getLabelNode() != null;
			case FlowPackage.FLOW_EDGE__ANIMATED:
				return isSetAnimated();
			case FlowPackage.FLOW_EDGE__HIDDEN:
				return isSetHidden();
			case FlowPackage.FLOW_EDGE__DELETABLE:
				return isSetDeletable();
			case FlowPackage.FLOW_EDGE__SELECTABLE:
				return isSetSelectable();
			case FlowPackage.FLOW_EDGE__RECONNECTABLE:
				return isSetReconnectable();
			case FlowPackage.FLOW_EDGE__MARKER_START:
				return getMarkerStart() != null;
			case FlowPackage.FLOW_EDGE__MARKER_END:
				return getMarkerEnd() != null;
			case FlowPackage.FLOW_EDGE__DATA:
				return getData() != null;
			case FlowPackage.FLOW_EDGE__ZINDEX:
				return isSetZIndex();
			case FlowPackage.FLOW_EDGE__CLASS_NAME:
				return CLASS_NAME_EDEFAULT == null ? getClassName() != null : !CLASS_NAME_EDEFAULT.equals(getClassName());
			case FlowPackage.FLOW_EDGE__STYLE:
				return !getStyle().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //FlowEdgeImpl
