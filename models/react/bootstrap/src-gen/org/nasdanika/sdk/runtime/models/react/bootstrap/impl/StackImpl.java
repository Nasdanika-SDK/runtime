/**
 */
package org.nasdanika.sdk.runtime.models.react.bootstrap.impl;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.sdk.runtime.models.react.bootstrap.BootstrapPackage;
import org.nasdanika.sdk.runtime.models.react.bootstrap.Direction;
import org.nasdanika.sdk.runtime.models.react.bootstrap.Stack;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Stack</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.bootstrap.impl.StackImpl#getDirection <em>Direction</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.bootstrap.impl.StackImpl#getGap <em>Gap</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StackImpl extends BootstrapComponentImpl implements Stack {
	/**
	 * The default value of the '{@link #getDirection() <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirection()
	 * @generated
	 * @ordered
	 */
	protected static final Direction DIRECTION_EDEFAULT = Direction.HORIZONTAL;

	/**
	 * The default value of the '{@link #getGap() <em>Gap</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGap()
	 * @generated
	 * @ordered
	 */
	protected static final int GAP_EDEFAULT = 0;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StackImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BootstrapPackage.Literals.STACK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Direction getDirection() {
		return (Direction)eDynamicGet(BootstrapPackage.STACK__DIRECTION, BootstrapPackage.Literals.STACK__DIRECTION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDirection(Direction newDirection) {
		eDynamicSet(BootstrapPackage.STACK__DIRECTION, BootstrapPackage.Literals.STACK__DIRECTION, newDirection);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDirection() {
		eDynamicUnset(BootstrapPackage.STACK__DIRECTION, BootstrapPackage.Literals.STACK__DIRECTION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDirection() {
		return eDynamicIsSet(BootstrapPackage.STACK__DIRECTION, BootstrapPackage.Literals.STACK__DIRECTION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getGap() {
		return (Integer)eDynamicGet(BootstrapPackage.STACK__GAP, BootstrapPackage.Literals.STACK__GAP, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGap(int newGap) {
		eDynamicSet(BootstrapPackage.STACK__GAP, BootstrapPackage.Literals.STACK__GAP, newGap);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetGap() {
		eDynamicUnset(BootstrapPackage.STACK__GAP, BootstrapPackage.Literals.STACK__GAP);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetGap() {
		return eDynamicIsSet(BootstrapPackage.STACK__GAP, BootstrapPackage.Literals.STACK__GAP);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BootstrapPackage.STACK__DIRECTION:
				return getDirection();
			case BootstrapPackage.STACK__GAP:
				return getGap();
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
			case BootstrapPackage.STACK__DIRECTION:
				setDirection((Direction)newValue);
				return;
			case BootstrapPackage.STACK__GAP:
				setGap((Integer)newValue);
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
			case BootstrapPackage.STACK__DIRECTION:
				unsetDirection();
				return;
			case BootstrapPackage.STACK__GAP:
				unsetGap();
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
			case BootstrapPackage.STACK__DIRECTION:
				return isSetDirection();
			case BootstrapPackage.STACK__GAP:
				return isSetGap();
		}
		return super.eIsSet(featureID);
	}

} //StackImpl
