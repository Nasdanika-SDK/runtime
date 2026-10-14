/**
 */
package org.nasdanika.sdk.runtime.models.react.flow.impl;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.sdk.runtime.models.react.flow.Align;
import org.nasdanika.sdk.runtime.models.react.flow.FlowPackage;
import org.nasdanika.sdk.runtime.models.react.flow.HandlePosition;
import org.nasdanika.sdk.runtime.models.react.flow.NodeToolbar;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Node Toolbar</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.flow.impl.NodeToolbarImpl#getPosition <em>Position</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.flow.impl.NodeToolbarImpl#isIsVisible <em>Is Visible</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.flow.impl.NodeToolbarImpl#getOffset <em>Offset</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.flow.impl.NodeToolbarImpl#getAlign <em>Align</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NodeToolbarImpl extends FlowComponentImpl implements NodeToolbar {
	/**
	 * The default value of the '{@link #getPosition() <em>Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosition()
	 * @generated
	 * @ordered
	 */
	protected static final HandlePosition POSITION_EDEFAULT = HandlePosition.LEFT;

	/**
	 * The default value of the '{@link #isIsVisible() <em>Is Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsVisible()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_VISIBLE_EDEFAULT = false;

	/**
	 * The default value of the '{@link #getOffset() <em>Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOffset()
	 * @generated
	 * @ordered
	 */
	protected static final double OFFSET_EDEFAULT = 0.0;

	/**
	 * The default value of the '{@link #getAlign() <em>Align</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlign()
	 * @generated
	 * @ordered
	 */
	protected static final Align ALIGN_EDEFAULT = Align.START;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NodeToolbarImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FlowPackage.Literals.NODE_TOOLBAR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HandlePosition getPosition() {
		return (HandlePosition)eDynamicGet(FlowPackage.NODE_TOOLBAR__POSITION, FlowPackage.Literals.NODE_TOOLBAR__POSITION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPosition(HandlePosition newPosition) {
		eDynamicSet(FlowPackage.NODE_TOOLBAR__POSITION, FlowPackage.Literals.NODE_TOOLBAR__POSITION, newPosition);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPosition() {
		eDynamicUnset(FlowPackage.NODE_TOOLBAR__POSITION, FlowPackage.Literals.NODE_TOOLBAR__POSITION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPosition() {
		return eDynamicIsSet(FlowPackage.NODE_TOOLBAR__POSITION, FlowPackage.Literals.NODE_TOOLBAR__POSITION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsVisible() {
		return (Boolean)eDynamicGet(FlowPackage.NODE_TOOLBAR__IS_VISIBLE, FlowPackage.Literals.NODE_TOOLBAR__IS_VISIBLE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsVisible(boolean newIsVisible) {
		eDynamicSet(FlowPackage.NODE_TOOLBAR__IS_VISIBLE, FlowPackage.Literals.NODE_TOOLBAR__IS_VISIBLE, newIsVisible);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIsVisible() {
		eDynamicUnset(FlowPackage.NODE_TOOLBAR__IS_VISIBLE, FlowPackage.Literals.NODE_TOOLBAR__IS_VISIBLE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIsVisible() {
		return eDynamicIsSet(FlowPackage.NODE_TOOLBAR__IS_VISIBLE, FlowPackage.Literals.NODE_TOOLBAR__IS_VISIBLE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getOffset() {
		return (Double)eDynamicGet(FlowPackage.NODE_TOOLBAR__OFFSET, FlowPackage.Literals.NODE_TOOLBAR__OFFSET, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOffset(double newOffset) {
		eDynamicSet(FlowPackage.NODE_TOOLBAR__OFFSET, FlowPackage.Literals.NODE_TOOLBAR__OFFSET, newOffset);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetOffset() {
		eDynamicUnset(FlowPackage.NODE_TOOLBAR__OFFSET, FlowPackage.Literals.NODE_TOOLBAR__OFFSET);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOffset() {
		return eDynamicIsSet(FlowPackage.NODE_TOOLBAR__OFFSET, FlowPackage.Literals.NODE_TOOLBAR__OFFSET);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Align getAlign() {
		return (Align)eDynamicGet(FlowPackage.NODE_TOOLBAR__ALIGN, FlowPackage.Literals.NODE_TOOLBAR__ALIGN, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlign(Align newAlign) {
		eDynamicSet(FlowPackage.NODE_TOOLBAR__ALIGN, FlowPackage.Literals.NODE_TOOLBAR__ALIGN, newAlign);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAlign() {
		eDynamicUnset(FlowPackage.NODE_TOOLBAR__ALIGN, FlowPackage.Literals.NODE_TOOLBAR__ALIGN);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAlign() {
		return eDynamicIsSet(FlowPackage.NODE_TOOLBAR__ALIGN, FlowPackage.Literals.NODE_TOOLBAR__ALIGN);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FlowPackage.NODE_TOOLBAR__POSITION:
				return getPosition();
			case FlowPackage.NODE_TOOLBAR__IS_VISIBLE:
				return isIsVisible();
			case FlowPackage.NODE_TOOLBAR__OFFSET:
				return getOffset();
			case FlowPackage.NODE_TOOLBAR__ALIGN:
				return getAlign();
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
			case FlowPackage.NODE_TOOLBAR__POSITION:
				setPosition((HandlePosition)newValue);
				return;
			case FlowPackage.NODE_TOOLBAR__IS_VISIBLE:
				setIsVisible((Boolean)newValue);
				return;
			case FlowPackage.NODE_TOOLBAR__OFFSET:
				setOffset((Double)newValue);
				return;
			case FlowPackage.NODE_TOOLBAR__ALIGN:
				setAlign((Align)newValue);
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
			case FlowPackage.NODE_TOOLBAR__POSITION:
				unsetPosition();
				return;
			case FlowPackage.NODE_TOOLBAR__IS_VISIBLE:
				unsetIsVisible();
				return;
			case FlowPackage.NODE_TOOLBAR__OFFSET:
				unsetOffset();
				return;
			case FlowPackage.NODE_TOOLBAR__ALIGN:
				unsetAlign();
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
			case FlowPackage.NODE_TOOLBAR__POSITION:
				return isSetPosition();
			case FlowPackage.NODE_TOOLBAR__IS_VISIBLE:
				return isSetIsVisible();
			case FlowPackage.NODE_TOOLBAR__OFFSET:
				return isSetOffset();
			case FlowPackage.NODE_TOOLBAR__ALIGN:
				return isSetAlign();
		}
		return super.eIsSet(featureID);
	}

} //NodeToolbarImpl
