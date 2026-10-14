/**
 */
package org.nasdanika.sdk.runtime.models.html.bootstrap.impl;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.sdk.runtime.models.html.bootstrap.BootstrapPackage;
import org.nasdanika.sdk.runtime.models.html.bootstrap.Stack;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Stack</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.bootstrap.impl.StackImpl#isHorizontal <em>Horizontal</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.bootstrap.impl.StackImpl#getGap <em>Gap</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StackImpl extends BootstrapElementImpl implements Stack {
	/**
	 * The default value of the '{@link #isHorizontal() <em>Horizontal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHorizontal()
	 * @generated
	 * @ordered
	 */
	protected static final boolean HORIZONTAL_EDEFAULT = false;

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
	public boolean isHorizontal() {
		return (Boolean)eDynamicGet(BootstrapPackage.STACK__HORIZONTAL, BootstrapPackage.Literals.STACK__HORIZONTAL, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHorizontal(boolean newHorizontal) {
		eDynamicSet(BootstrapPackage.STACK__HORIZONTAL, BootstrapPackage.Literals.STACK__HORIZONTAL, newHorizontal);
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
			case BootstrapPackage.STACK__HORIZONTAL:
				return isHorizontal();
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
			case BootstrapPackage.STACK__HORIZONTAL:
				setHorizontal((Boolean)newValue);
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
			case BootstrapPackage.STACK__HORIZONTAL:
				setHorizontal(HORIZONTAL_EDEFAULT);
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
			case BootstrapPackage.STACK__HORIZONTAL:
				return isHorizontal() != HORIZONTAL_EDEFAULT;
			case BootstrapPackage.STACK__GAP:
				return isSetGap();
		}
		return super.eIsSet(featureID);
	}

} //StackImpl
