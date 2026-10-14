/**
 */
package org.nasdanika.sdk.runtime.models.react.bootstrap.impl;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.nasdanika.sdk.runtime.models.react.bootstrap.BootstrapPackage;
import org.nasdanika.sdk.runtime.models.react.bootstrap.Breakpoint;
import org.nasdanika.sdk.runtime.models.react.bootstrap.RowColumns;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Row Columns</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.bootstrap.impl.RowColumnsImpl#getBreakpoint <em>Breakpoint</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.bootstrap.impl.RowColumnsImpl#getCount <em>Count</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.bootstrap.impl.RowColumnsImpl#isAuto <em>Auto</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RowColumnsImpl extends MinimalEObjectImpl.Container implements RowColumns {
	/**
	 * The default value of the '{@link #getBreakpoint() <em>Breakpoint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBreakpoint()
	 * @generated
	 * @ordered
	 */
	protected static final Breakpoint BREAKPOINT_EDEFAULT = Breakpoint.XS;

	/**
	 * The default value of the '{@link #getCount() <em>Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCount()
	 * @generated
	 * @ordered
	 */
	protected static final int COUNT_EDEFAULT = 0;

	/**
	 * The default value of the '{@link #isAuto() <em>Auto</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAuto()
	 * @generated
	 * @ordered
	 */
	protected static final boolean AUTO_EDEFAULT = false;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RowColumnsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BootstrapPackage.Literals.ROW_COLUMNS;
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
	public Breakpoint getBreakpoint() {
		return (Breakpoint)eDynamicGet(BootstrapPackage.ROW_COLUMNS__BREAKPOINT, BootstrapPackage.Literals.ROW_COLUMNS__BREAKPOINT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBreakpoint(Breakpoint newBreakpoint) {
		eDynamicSet(BootstrapPackage.ROW_COLUMNS__BREAKPOINT, BootstrapPackage.Literals.ROW_COLUMNS__BREAKPOINT, newBreakpoint);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCount() {
		return (Integer)eDynamicGet(BootstrapPackage.ROW_COLUMNS__COUNT, BootstrapPackage.Literals.ROW_COLUMNS__COUNT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCount(int newCount) {
		eDynamicSet(BootstrapPackage.ROW_COLUMNS__COUNT, BootstrapPackage.Literals.ROW_COLUMNS__COUNT, newCount);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAuto() {
		return (Boolean)eDynamicGet(BootstrapPackage.ROW_COLUMNS__AUTO, BootstrapPackage.Literals.ROW_COLUMNS__AUTO, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuto(boolean newAuto) {
		eDynamicSet(BootstrapPackage.ROW_COLUMNS__AUTO, BootstrapPackage.Literals.ROW_COLUMNS__AUTO, newAuto);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BootstrapPackage.ROW_COLUMNS__BREAKPOINT:
				return getBreakpoint();
			case BootstrapPackage.ROW_COLUMNS__COUNT:
				return getCount();
			case BootstrapPackage.ROW_COLUMNS__AUTO:
				return isAuto();
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
			case BootstrapPackage.ROW_COLUMNS__BREAKPOINT:
				setBreakpoint((Breakpoint)newValue);
				return;
			case BootstrapPackage.ROW_COLUMNS__COUNT:
				setCount((Integer)newValue);
				return;
			case BootstrapPackage.ROW_COLUMNS__AUTO:
				setAuto((Boolean)newValue);
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
			case BootstrapPackage.ROW_COLUMNS__BREAKPOINT:
				setBreakpoint(BREAKPOINT_EDEFAULT);
				return;
			case BootstrapPackage.ROW_COLUMNS__COUNT:
				setCount(COUNT_EDEFAULT);
				return;
			case BootstrapPackage.ROW_COLUMNS__AUTO:
				setAuto(AUTO_EDEFAULT);
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
			case BootstrapPackage.ROW_COLUMNS__BREAKPOINT:
				return getBreakpoint() != BREAKPOINT_EDEFAULT;
			case BootstrapPackage.ROW_COLUMNS__COUNT:
				return getCount() != COUNT_EDEFAULT;
			case BootstrapPackage.ROW_COLUMNS__AUTO:
				return isAuto() != AUTO_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

} //RowColumnsImpl
