/**
 */
package org.nasdanika.sdk.runtime.models.react.flow.impl;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.sdk.runtime.models.react.flow.Controls;
import org.nasdanika.sdk.runtime.models.react.flow.FlowPackage;
import org.nasdanika.sdk.runtime.models.react.flow.Orientation;
import org.nasdanika.sdk.runtime.models.react.flow.PanelPosition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Controls</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.flow.impl.ControlsImpl#isShowZoom <em>Show Zoom</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.flow.impl.ControlsImpl#isShowFitView <em>Show Fit View</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.flow.impl.ControlsImpl#isShowInteractive <em>Show Interactive</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.flow.impl.ControlsImpl#getPosition <em>Position</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.flow.impl.ControlsImpl#getOrientation <em>Orientation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ControlsImpl extends FlowComponentImpl implements Controls {
	/**
	 * The default value of the '{@link #isShowZoom() <em>Show Zoom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isShowZoom()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SHOW_ZOOM_EDEFAULT = false;

	/**
	 * The default value of the '{@link #isShowFitView() <em>Show Fit View</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isShowFitView()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SHOW_FIT_VIEW_EDEFAULT = false;

	/**
	 * The default value of the '{@link #isShowInteractive() <em>Show Interactive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isShowInteractive()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SHOW_INTERACTIVE_EDEFAULT = false;

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
	 * The default value of the '{@link #getOrientation() <em>Orientation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrientation()
	 * @generated
	 * @ordered
	 */
	protected static final Orientation ORIENTATION_EDEFAULT = Orientation.HORIZONTAL;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ControlsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FlowPackage.Literals.CONTROLS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isShowZoom() {
		return (Boolean)eDynamicGet(FlowPackage.CONTROLS__SHOW_ZOOM, FlowPackage.Literals.CONTROLS__SHOW_ZOOM, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShowZoom(boolean newShowZoom) {
		eDynamicSet(FlowPackage.CONTROLS__SHOW_ZOOM, FlowPackage.Literals.CONTROLS__SHOW_ZOOM, newShowZoom);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetShowZoom() {
		eDynamicUnset(FlowPackage.CONTROLS__SHOW_ZOOM, FlowPackage.Literals.CONTROLS__SHOW_ZOOM);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetShowZoom() {
		return eDynamicIsSet(FlowPackage.CONTROLS__SHOW_ZOOM, FlowPackage.Literals.CONTROLS__SHOW_ZOOM);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isShowFitView() {
		return (Boolean)eDynamicGet(FlowPackage.CONTROLS__SHOW_FIT_VIEW, FlowPackage.Literals.CONTROLS__SHOW_FIT_VIEW, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShowFitView(boolean newShowFitView) {
		eDynamicSet(FlowPackage.CONTROLS__SHOW_FIT_VIEW, FlowPackage.Literals.CONTROLS__SHOW_FIT_VIEW, newShowFitView);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetShowFitView() {
		eDynamicUnset(FlowPackage.CONTROLS__SHOW_FIT_VIEW, FlowPackage.Literals.CONTROLS__SHOW_FIT_VIEW);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetShowFitView() {
		return eDynamicIsSet(FlowPackage.CONTROLS__SHOW_FIT_VIEW, FlowPackage.Literals.CONTROLS__SHOW_FIT_VIEW);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isShowInteractive() {
		return (Boolean)eDynamicGet(FlowPackage.CONTROLS__SHOW_INTERACTIVE, FlowPackage.Literals.CONTROLS__SHOW_INTERACTIVE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShowInteractive(boolean newShowInteractive) {
		eDynamicSet(FlowPackage.CONTROLS__SHOW_INTERACTIVE, FlowPackage.Literals.CONTROLS__SHOW_INTERACTIVE, newShowInteractive);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetShowInteractive() {
		eDynamicUnset(FlowPackage.CONTROLS__SHOW_INTERACTIVE, FlowPackage.Literals.CONTROLS__SHOW_INTERACTIVE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetShowInteractive() {
		return eDynamicIsSet(FlowPackage.CONTROLS__SHOW_INTERACTIVE, FlowPackage.Literals.CONTROLS__SHOW_INTERACTIVE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PanelPosition getPosition() {
		return (PanelPosition)eDynamicGet(FlowPackage.CONTROLS__POSITION, FlowPackage.Literals.CONTROLS__POSITION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPosition(PanelPosition newPosition) {
		eDynamicSet(FlowPackage.CONTROLS__POSITION, FlowPackage.Literals.CONTROLS__POSITION, newPosition);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPosition() {
		eDynamicUnset(FlowPackage.CONTROLS__POSITION, FlowPackage.Literals.CONTROLS__POSITION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPosition() {
		return eDynamicIsSet(FlowPackage.CONTROLS__POSITION, FlowPackage.Literals.CONTROLS__POSITION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Orientation getOrientation() {
		return (Orientation)eDynamicGet(FlowPackage.CONTROLS__ORIENTATION, FlowPackage.Literals.CONTROLS__ORIENTATION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrientation(Orientation newOrientation) {
		eDynamicSet(FlowPackage.CONTROLS__ORIENTATION, FlowPackage.Literals.CONTROLS__ORIENTATION, newOrientation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetOrientation() {
		eDynamicUnset(FlowPackage.CONTROLS__ORIENTATION, FlowPackage.Literals.CONTROLS__ORIENTATION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOrientation() {
		return eDynamicIsSet(FlowPackage.CONTROLS__ORIENTATION, FlowPackage.Literals.CONTROLS__ORIENTATION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FlowPackage.CONTROLS__SHOW_ZOOM:
				return isShowZoom();
			case FlowPackage.CONTROLS__SHOW_FIT_VIEW:
				return isShowFitView();
			case FlowPackage.CONTROLS__SHOW_INTERACTIVE:
				return isShowInteractive();
			case FlowPackage.CONTROLS__POSITION:
				return getPosition();
			case FlowPackage.CONTROLS__ORIENTATION:
				return getOrientation();
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
			case FlowPackage.CONTROLS__SHOW_ZOOM:
				setShowZoom((Boolean)newValue);
				return;
			case FlowPackage.CONTROLS__SHOW_FIT_VIEW:
				setShowFitView((Boolean)newValue);
				return;
			case FlowPackage.CONTROLS__SHOW_INTERACTIVE:
				setShowInteractive((Boolean)newValue);
				return;
			case FlowPackage.CONTROLS__POSITION:
				setPosition((PanelPosition)newValue);
				return;
			case FlowPackage.CONTROLS__ORIENTATION:
				setOrientation((Orientation)newValue);
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
			case FlowPackage.CONTROLS__SHOW_ZOOM:
				unsetShowZoom();
				return;
			case FlowPackage.CONTROLS__SHOW_FIT_VIEW:
				unsetShowFitView();
				return;
			case FlowPackage.CONTROLS__SHOW_INTERACTIVE:
				unsetShowInteractive();
				return;
			case FlowPackage.CONTROLS__POSITION:
				unsetPosition();
				return;
			case FlowPackage.CONTROLS__ORIENTATION:
				unsetOrientation();
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
			case FlowPackage.CONTROLS__SHOW_ZOOM:
				return isSetShowZoom();
			case FlowPackage.CONTROLS__SHOW_FIT_VIEW:
				return isSetShowFitView();
			case FlowPackage.CONTROLS__SHOW_INTERACTIVE:
				return isSetShowInteractive();
			case FlowPackage.CONTROLS__POSITION:
				return isSetPosition();
			case FlowPackage.CONTROLS__ORIENTATION:
				return isSetOrientation();
		}
		return super.eIsSet(featureID);
	}

} //ControlsImpl
