/**
 */
package org.nasdanika.sdk.runtime.models.react.flow.impl;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.sdk.runtime.models.react.flow.FlowPackage;
import org.nasdanika.sdk.runtime.models.react.flow.Handle;
import org.nasdanika.sdk.runtime.models.react.flow.HandlePosition;
import org.nasdanika.sdk.runtime.models.react.flow.HandleType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Handle</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.flow.impl.HandleImpl#getHandleType <em>Handle Type</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.flow.impl.HandleImpl#getPosition <em>Position</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.flow.impl.HandleImpl#getHandleId <em>Handle Id</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.flow.impl.HandleImpl#isIsConnectable <em>Is Connectable</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HandleImpl extends FlowComponentImpl implements Handle {
	/**
	 * The default value of the '{@link #getHandleType() <em>Handle Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHandleType()
	 * @generated
	 * @ordered
	 */
	protected static final HandleType HANDLE_TYPE_EDEFAULT = HandleType.SOURCE;

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
	 * The default value of the '{@link #getHandleId() <em>Handle Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHandleId()
	 * @generated
	 * @ordered
	 */
	protected static final String HANDLE_ID_EDEFAULT = null;

	/**
	 * The default value of the '{@link #isIsConnectable() <em>Is Connectable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsConnectable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_CONNECTABLE_EDEFAULT = false;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HandleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FlowPackage.Literals.HANDLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HandleType getHandleType() {
		return (HandleType)eDynamicGet(FlowPackage.HANDLE__HANDLE_TYPE, FlowPackage.Literals.HANDLE__HANDLE_TYPE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHandleType(HandleType newHandleType) {
		eDynamicSet(FlowPackage.HANDLE__HANDLE_TYPE, FlowPackage.Literals.HANDLE__HANDLE_TYPE, newHandleType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetHandleType() {
		eDynamicUnset(FlowPackage.HANDLE__HANDLE_TYPE, FlowPackage.Literals.HANDLE__HANDLE_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetHandleType() {
		return eDynamicIsSet(FlowPackage.HANDLE__HANDLE_TYPE, FlowPackage.Literals.HANDLE__HANDLE_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HandlePosition getPosition() {
		return (HandlePosition)eDynamicGet(FlowPackage.HANDLE__POSITION, FlowPackage.Literals.HANDLE__POSITION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPosition(HandlePosition newPosition) {
		eDynamicSet(FlowPackage.HANDLE__POSITION, FlowPackage.Literals.HANDLE__POSITION, newPosition);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPosition() {
		eDynamicUnset(FlowPackage.HANDLE__POSITION, FlowPackage.Literals.HANDLE__POSITION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPosition() {
		return eDynamicIsSet(FlowPackage.HANDLE__POSITION, FlowPackage.Literals.HANDLE__POSITION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHandleId() {
		return (String)eDynamicGet(FlowPackage.HANDLE__HANDLE_ID, FlowPackage.Literals.HANDLE__HANDLE_ID, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHandleId(String newHandleId) {
		eDynamicSet(FlowPackage.HANDLE__HANDLE_ID, FlowPackage.Literals.HANDLE__HANDLE_ID, newHandleId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsConnectable() {
		return (Boolean)eDynamicGet(FlowPackage.HANDLE__IS_CONNECTABLE, FlowPackage.Literals.HANDLE__IS_CONNECTABLE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsConnectable(boolean newIsConnectable) {
		eDynamicSet(FlowPackage.HANDLE__IS_CONNECTABLE, FlowPackage.Literals.HANDLE__IS_CONNECTABLE, newIsConnectable);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIsConnectable() {
		eDynamicUnset(FlowPackage.HANDLE__IS_CONNECTABLE, FlowPackage.Literals.HANDLE__IS_CONNECTABLE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIsConnectable() {
		return eDynamicIsSet(FlowPackage.HANDLE__IS_CONNECTABLE, FlowPackage.Literals.HANDLE__IS_CONNECTABLE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FlowPackage.HANDLE__HANDLE_TYPE:
				return getHandleType();
			case FlowPackage.HANDLE__POSITION:
				return getPosition();
			case FlowPackage.HANDLE__HANDLE_ID:
				return getHandleId();
			case FlowPackage.HANDLE__IS_CONNECTABLE:
				return isIsConnectable();
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
			case FlowPackage.HANDLE__HANDLE_TYPE:
				setHandleType((HandleType)newValue);
				return;
			case FlowPackage.HANDLE__POSITION:
				setPosition((HandlePosition)newValue);
				return;
			case FlowPackage.HANDLE__HANDLE_ID:
				setHandleId((String)newValue);
				return;
			case FlowPackage.HANDLE__IS_CONNECTABLE:
				setIsConnectable((Boolean)newValue);
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
			case FlowPackage.HANDLE__HANDLE_TYPE:
				unsetHandleType();
				return;
			case FlowPackage.HANDLE__POSITION:
				unsetPosition();
				return;
			case FlowPackage.HANDLE__HANDLE_ID:
				setHandleId(HANDLE_ID_EDEFAULT);
				return;
			case FlowPackage.HANDLE__IS_CONNECTABLE:
				unsetIsConnectable();
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
			case FlowPackage.HANDLE__HANDLE_TYPE:
				return isSetHandleType();
			case FlowPackage.HANDLE__POSITION:
				return isSetPosition();
			case FlowPackage.HANDLE__HANDLE_ID:
				return HANDLE_ID_EDEFAULT == null ? getHandleId() != null : !HANDLE_ID_EDEFAULT.equals(getHandleId());
			case FlowPackage.HANDLE__IS_CONNECTABLE:
				return isSetIsConnectable();
		}
		return super.eIsSet(featureID);
	}

} //HandleImpl
