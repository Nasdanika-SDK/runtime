/**
 */
package org.nasdanika.sdk.runtime.models.react.flow.impl;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.sdk.runtime.models.react.flow.FlowPackage;
import org.nasdanika.sdk.runtime.models.react.flow.MiniMap;
import org.nasdanika.sdk.runtime.models.react.flow.PanelPosition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mini Map</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.flow.impl.MiniMapImpl#getPosition <em>Position</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.flow.impl.MiniMapImpl#getNodeColor <em>Node Color</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.flow.impl.MiniMapImpl#getNodeStrokeColor <em>Node Stroke Color</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.flow.impl.MiniMapImpl#getMaskColor <em>Mask Color</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.flow.impl.MiniMapImpl#getBgColor <em>Bg Color</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.flow.impl.MiniMapImpl#isPannable <em>Pannable</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.flow.impl.MiniMapImpl#isZoomable <em>Zoomable</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.flow.impl.MiniMapImpl#getAriaLabel <em>Aria Label</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MiniMapImpl extends FlowComponentImpl implements MiniMap {
	/**
	 * The default value of the '{@link #getPosition() <em>Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosition()
	 * @generated
	 * @ordered
	 */
	protected static final PanelPosition POSITION_EDEFAULT = PanelPosition.TOP_LEFT;

	/**
	 * The default value of the '{@link #getNodeColor() <em>Node Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodeColor()
	 * @generated
	 * @ordered
	 */
	protected static final String NODE_COLOR_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getNodeStrokeColor() <em>Node Stroke Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodeStrokeColor()
	 * @generated
	 * @ordered
	 */
	protected static final String NODE_STROKE_COLOR_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getMaskColor() <em>Mask Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaskColor()
	 * @generated
	 * @ordered
	 */
	protected static final String MASK_COLOR_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getBgColor() <em>Bg Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBgColor()
	 * @generated
	 * @ordered
	 */
	protected static final String BG_COLOR_EDEFAULT = null;

	/**
	 * The default value of the '{@link #isPannable() <em>Pannable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPannable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PANNABLE_EDEFAULT = false;

	/**
	 * The default value of the '{@link #isZoomable() <em>Zoomable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isZoomable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ZOOMABLE_EDEFAULT = false;

	/**
	 * The default value of the '{@link #getAriaLabel() <em>Aria Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAriaLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String ARIA_LABEL_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MiniMapImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FlowPackage.Literals.MINI_MAP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PanelPosition getPosition() {
		return (PanelPosition)eDynamicGet(FlowPackage.MINI_MAP__POSITION, FlowPackage.Literals.MINI_MAP__POSITION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPosition(PanelPosition newPosition) {
		eDynamicSet(FlowPackage.MINI_MAP__POSITION, FlowPackage.Literals.MINI_MAP__POSITION, newPosition);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPosition() {
		eDynamicUnset(FlowPackage.MINI_MAP__POSITION, FlowPackage.Literals.MINI_MAP__POSITION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPosition() {
		return eDynamicIsSet(FlowPackage.MINI_MAP__POSITION, FlowPackage.Literals.MINI_MAP__POSITION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNodeColor() {
		return (String)eDynamicGet(FlowPackage.MINI_MAP__NODE_COLOR, FlowPackage.Literals.MINI_MAP__NODE_COLOR, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNodeColor(String newNodeColor) {
		eDynamicSet(FlowPackage.MINI_MAP__NODE_COLOR, FlowPackage.Literals.MINI_MAP__NODE_COLOR, newNodeColor);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNodeStrokeColor() {
		return (String)eDynamicGet(FlowPackage.MINI_MAP__NODE_STROKE_COLOR, FlowPackage.Literals.MINI_MAP__NODE_STROKE_COLOR, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNodeStrokeColor(String newNodeStrokeColor) {
		eDynamicSet(FlowPackage.MINI_MAP__NODE_STROKE_COLOR, FlowPackage.Literals.MINI_MAP__NODE_STROKE_COLOR, newNodeStrokeColor);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMaskColor() {
		return (String)eDynamicGet(FlowPackage.MINI_MAP__MASK_COLOR, FlowPackage.Literals.MINI_MAP__MASK_COLOR, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaskColor(String newMaskColor) {
		eDynamicSet(FlowPackage.MINI_MAP__MASK_COLOR, FlowPackage.Literals.MINI_MAP__MASK_COLOR, newMaskColor);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBgColor() {
		return (String)eDynamicGet(FlowPackage.MINI_MAP__BG_COLOR, FlowPackage.Literals.MINI_MAP__BG_COLOR, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBgColor(String newBgColor) {
		eDynamicSet(FlowPackage.MINI_MAP__BG_COLOR, FlowPackage.Literals.MINI_MAP__BG_COLOR, newBgColor);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isPannable() {
		return (Boolean)eDynamicGet(FlowPackage.MINI_MAP__PANNABLE, FlowPackage.Literals.MINI_MAP__PANNABLE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPannable(boolean newPannable) {
		eDynamicSet(FlowPackage.MINI_MAP__PANNABLE, FlowPackage.Literals.MINI_MAP__PANNABLE, newPannable);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPannable() {
		eDynamicUnset(FlowPackage.MINI_MAP__PANNABLE, FlowPackage.Literals.MINI_MAP__PANNABLE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPannable() {
		return eDynamicIsSet(FlowPackage.MINI_MAP__PANNABLE, FlowPackage.Literals.MINI_MAP__PANNABLE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isZoomable() {
		return (Boolean)eDynamicGet(FlowPackage.MINI_MAP__ZOOMABLE, FlowPackage.Literals.MINI_MAP__ZOOMABLE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setZoomable(boolean newZoomable) {
		eDynamicSet(FlowPackage.MINI_MAP__ZOOMABLE, FlowPackage.Literals.MINI_MAP__ZOOMABLE, newZoomable);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetZoomable() {
		eDynamicUnset(FlowPackage.MINI_MAP__ZOOMABLE, FlowPackage.Literals.MINI_MAP__ZOOMABLE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetZoomable() {
		return eDynamicIsSet(FlowPackage.MINI_MAP__ZOOMABLE, FlowPackage.Literals.MINI_MAP__ZOOMABLE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAriaLabel() {
		return (String)eDynamicGet(FlowPackage.MINI_MAP__ARIA_LABEL, FlowPackage.Literals.MINI_MAP__ARIA_LABEL, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAriaLabel(String newAriaLabel) {
		eDynamicSet(FlowPackage.MINI_MAP__ARIA_LABEL, FlowPackage.Literals.MINI_MAP__ARIA_LABEL, newAriaLabel);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FlowPackage.MINI_MAP__POSITION:
				return getPosition();
			case FlowPackage.MINI_MAP__NODE_COLOR:
				return getNodeColor();
			case FlowPackage.MINI_MAP__NODE_STROKE_COLOR:
				return getNodeStrokeColor();
			case FlowPackage.MINI_MAP__MASK_COLOR:
				return getMaskColor();
			case FlowPackage.MINI_MAP__BG_COLOR:
				return getBgColor();
			case FlowPackage.MINI_MAP__PANNABLE:
				return isPannable();
			case FlowPackage.MINI_MAP__ZOOMABLE:
				return isZoomable();
			case FlowPackage.MINI_MAP__ARIA_LABEL:
				return getAriaLabel();
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
			case FlowPackage.MINI_MAP__POSITION:
				setPosition((PanelPosition)newValue);
				return;
			case FlowPackage.MINI_MAP__NODE_COLOR:
				setNodeColor((String)newValue);
				return;
			case FlowPackage.MINI_MAP__NODE_STROKE_COLOR:
				setNodeStrokeColor((String)newValue);
				return;
			case FlowPackage.MINI_MAP__MASK_COLOR:
				setMaskColor((String)newValue);
				return;
			case FlowPackage.MINI_MAP__BG_COLOR:
				setBgColor((String)newValue);
				return;
			case FlowPackage.MINI_MAP__PANNABLE:
				setPannable((Boolean)newValue);
				return;
			case FlowPackage.MINI_MAP__ZOOMABLE:
				setZoomable((Boolean)newValue);
				return;
			case FlowPackage.MINI_MAP__ARIA_LABEL:
				setAriaLabel((String)newValue);
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
			case FlowPackage.MINI_MAP__POSITION:
				unsetPosition();
				return;
			case FlowPackage.MINI_MAP__NODE_COLOR:
				setNodeColor(NODE_COLOR_EDEFAULT);
				return;
			case FlowPackage.MINI_MAP__NODE_STROKE_COLOR:
				setNodeStrokeColor(NODE_STROKE_COLOR_EDEFAULT);
				return;
			case FlowPackage.MINI_MAP__MASK_COLOR:
				setMaskColor(MASK_COLOR_EDEFAULT);
				return;
			case FlowPackage.MINI_MAP__BG_COLOR:
				setBgColor(BG_COLOR_EDEFAULT);
				return;
			case FlowPackage.MINI_MAP__PANNABLE:
				unsetPannable();
				return;
			case FlowPackage.MINI_MAP__ZOOMABLE:
				unsetZoomable();
				return;
			case FlowPackage.MINI_MAP__ARIA_LABEL:
				setAriaLabel(ARIA_LABEL_EDEFAULT);
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
			case FlowPackage.MINI_MAP__POSITION:
				return isSetPosition();
			case FlowPackage.MINI_MAP__NODE_COLOR:
				return NODE_COLOR_EDEFAULT == null ? getNodeColor() != null : !NODE_COLOR_EDEFAULT.equals(getNodeColor());
			case FlowPackage.MINI_MAP__NODE_STROKE_COLOR:
				return NODE_STROKE_COLOR_EDEFAULT == null ? getNodeStrokeColor() != null : !NODE_STROKE_COLOR_EDEFAULT.equals(getNodeStrokeColor());
			case FlowPackage.MINI_MAP__MASK_COLOR:
				return MASK_COLOR_EDEFAULT == null ? getMaskColor() != null : !MASK_COLOR_EDEFAULT.equals(getMaskColor());
			case FlowPackage.MINI_MAP__BG_COLOR:
				return BG_COLOR_EDEFAULT == null ? getBgColor() != null : !BG_COLOR_EDEFAULT.equals(getBgColor());
			case FlowPackage.MINI_MAP__PANNABLE:
				return isSetPannable();
			case FlowPackage.MINI_MAP__ZOOMABLE:
				return isSetZoomable();
			case FlowPackage.MINI_MAP__ARIA_LABEL:
				return ARIA_LABEL_EDEFAULT == null ? getAriaLabel() != null : !ARIA_LABEL_EDEFAULT.equals(getAriaLabel());
		}
		return super.eIsSet(featureID);
	}

} //MiniMapImpl
