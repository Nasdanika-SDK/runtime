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

import org.nasdanika.sdk.runtime.models.react.flow.EdgeMarker;
import org.nasdanika.sdk.runtime.models.react.flow.EdgeOptions;
import org.nasdanika.sdk.runtime.models.react.flow.EdgeType;
import org.nasdanika.sdk.runtime.models.react.flow.FlowPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Edge Options</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.flow.impl.EdgeOptionsImpl#getEdgeType <em>Edge Type</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.flow.impl.EdgeOptionsImpl#getCustomType <em>Custom Type</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.flow.impl.EdgeOptionsImpl#isAnimated <em>Animated</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.flow.impl.EdgeOptionsImpl#getMarkerEnd <em>Marker End</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.flow.impl.EdgeOptionsImpl#getStyle <em>Style</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EdgeOptionsImpl extends MinimalEObjectImpl.Container implements EdgeOptions {
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
	 * The default value of the '{@link #isAnimated() <em>Animated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAnimated()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ANIMATED_EDEFAULT = false;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EdgeOptionsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FlowPackage.Literals.EDGE_OPTIONS;
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
	public EdgeType getEdgeType() {
		return (EdgeType)eDynamicGet(FlowPackage.EDGE_OPTIONS__EDGE_TYPE, FlowPackage.Literals.EDGE_OPTIONS__EDGE_TYPE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEdgeType(EdgeType newEdgeType) {
		eDynamicSet(FlowPackage.EDGE_OPTIONS__EDGE_TYPE, FlowPackage.Literals.EDGE_OPTIONS__EDGE_TYPE, newEdgeType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEdgeType() {
		eDynamicUnset(FlowPackage.EDGE_OPTIONS__EDGE_TYPE, FlowPackage.Literals.EDGE_OPTIONS__EDGE_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEdgeType() {
		return eDynamicIsSet(FlowPackage.EDGE_OPTIONS__EDGE_TYPE, FlowPackage.Literals.EDGE_OPTIONS__EDGE_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCustomType() {
		return (String)eDynamicGet(FlowPackage.EDGE_OPTIONS__CUSTOM_TYPE, FlowPackage.Literals.EDGE_OPTIONS__CUSTOM_TYPE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCustomType(String newCustomType) {
		eDynamicSet(FlowPackage.EDGE_OPTIONS__CUSTOM_TYPE, FlowPackage.Literals.EDGE_OPTIONS__CUSTOM_TYPE, newCustomType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAnimated() {
		return (Boolean)eDynamicGet(FlowPackage.EDGE_OPTIONS__ANIMATED, FlowPackage.Literals.EDGE_OPTIONS__ANIMATED, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnimated(boolean newAnimated) {
		eDynamicSet(FlowPackage.EDGE_OPTIONS__ANIMATED, FlowPackage.Literals.EDGE_OPTIONS__ANIMATED, newAnimated);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAnimated() {
		eDynamicUnset(FlowPackage.EDGE_OPTIONS__ANIMATED, FlowPackage.Literals.EDGE_OPTIONS__ANIMATED);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAnimated() {
		return eDynamicIsSet(FlowPackage.EDGE_OPTIONS__ANIMATED, FlowPackage.Literals.EDGE_OPTIONS__ANIMATED);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EdgeMarker getMarkerEnd() {
		return (EdgeMarker)eDynamicGet(FlowPackage.EDGE_OPTIONS__MARKER_END, FlowPackage.Literals.EDGE_OPTIONS__MARKER_END, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMarkerEnd(EdgeMarker newMarkerEnd, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newMarkerEnd, FlowPackage.EDGE_OPTIONS__MARKER_END, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMarkerEnd(EdgeMarker newMarkerEnd) {
		eDynamicSet(FlowPackage.EDGE_OPTIONS__MARKER_END, FlowPackage.Literals.EDGE_OPTIONS__MARKER_END, newMarkerEnd);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EMap<String, String> getStyle() {
		return (EMap<String, String>)eDynamicGet(FlowPackage.EDGE_OPTIONS__STYLE, FlowPackage.Literals.EDGE_OPTIONS__STYLE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FlowPackage.EDGE_OPTIONS__MARKER_END:
				return basicSetMarkerEnd(null, msgs);
			case FlowPackage.EDGE_OPTIONS__STYLE:
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
			case FlowPackage.EDGE_OPTIONS__EDGE_TYPE:
				return getEdgeType();
			case FlowPackage.EDGE_OPTIONS__CUSTOM_TYPE:
				return getCustomType();
			case FlowPackage.EDGE_OPTIONS__ANIMATED:
				return isAnimated();
			case FlowPackage.EDGE_OPTIONS__MARKER_END:
				return getMarkerEnd();
			case FlowPackage.EDGE_OPTIONS__STYLE:
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
			case FlowPackage.EDGE_OPTIONS__EDGE_TYPE:
				setEdgeType((EdgeType)newValue);
				return;
			case FlowPackage.EDGE_OPTIONS__CUSTOM_TYPE:
				setCustomType((String)newValue);
				return;
			case FlowPackage.EDGE_OPTIONS__ANIMATED:
				setAnimated((Boolean)newValue);
				return;
			case FlowPackage.EDGE_OPTIONS__MARKER_END:
				setMarkerEnd((EdgeMarker)newValue);
				return;
			case FlowPackage.EDGE_OPTIONS__STYLE:
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
			case FlowPackage.EDGE_OPTIONS__EDGE_TYPE:
				unsetEdgeType();
				return;
			case FlowPackage.EDGE_OPTIONS__CUSTOM_TYPE:
				setCustomType(CUSTOM_TYPE_EDEFAULT);
				return;
			case FlowPackage.EDGE_OPTIONS__ANIMATED:
				unsetAnimated();
				return;
			case FlowPackage.EDGE_OPTIONS__MARKER_END:
				setMarkerEnd((EdgeMarker)null);
				return;
			case FlowPackage.EDGE_OPTIONS__STYLE:
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
			case FlowPackage.EDGE_OPTIONS__EDGE_TYPE:
				return isSetEdgeType();
			case FlowPackage.EDGE_OPTIONS__CUSTOM_TYPE:
				return CUSTOM_TYPE_EDEFAULT == null ? getCustomType() != null : !CUSTOM_TYPE_EDEFAULT.equals(getCustomType());
			case FlowPackage.EDGE_OPTIONS__ANIMATED:
				return isSetAnimated();
			case FlowPackage.EDGE_OPTIONS__MARKER_END:
				return getMarkerEnd() != null;
			case FlowPackage.EDGE_OPTIONS__STYLE:
				return !getStyle().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //EdgeOptionsImpl
