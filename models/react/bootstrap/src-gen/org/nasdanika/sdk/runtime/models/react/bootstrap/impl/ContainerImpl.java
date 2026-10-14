/**
 */
package org.nasdanika.sdk.runtime.models.react.bootstrap.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.sdk.runtime.models.react.bootstrap.BootstrapPackage;
import org.nasdanika.sdk.runtime.models.react.bootstrap.Breakpoint;
import org.nasdanika.sdk.runtime.models.react.bootstrap.Row;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.bootstrap.impl.ContainerImpl#isFluid <em>Fluid</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.bootstrap.impl.ContainerImpl#getFluidUntil <em>Fluid Until</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.bootstrap.impl.ContainerImpl#getRows <em>Rows</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContainerImpl extends BootstrapComponentImpl implements org.nasdanika.sdk.runtime.models.react.bootstrap.Container {
	/**
	 * The default value of the '{@link #isFluid() <em>Fluid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFluid()
	 * @generated
	 * @ordered
	 */
	protected static final boolean FLUID_EDEFAULT = false;

	/**
	 * The default value of the '{@link #getFluidUntil() <em>Fluid Until</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFluidUntil()
	 * @generated
	 * @ordered
	 */
	protected static final Breakpoint FLUID_UNTIL_EDEFAULT = Breakpoint.XS;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContainerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BootstrapPackage.Literals.CONTAINER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isFluid() {
		return (Boolean)eDynamicGet(BootstrapPackage.CONTAINER__FLUID, BootstrapPackage.Literals.CONTAINER__FLUID, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFluid(boolean newFluid) {
		eDynamicSet(BootstrapPackage.CONTAINER__FLUID, BootstrapPackage.Literals.CONTAINER__FLUID, newFluid);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Breakpoint getFluidUntil() {
		return (Breakpoint)eDynamicGet(BootstrapPackage.CONTAINER__FLUID_UNTIL, BootstrapPackage.Literals.CONTAINER__FLUID_UNTIL, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFluidUntil(Breakpoint newFluidUntil) {
		eDynamicSet(BootstrapPackage.CONTAINER__FLUID_UNTIL, BootstrapPackage.Literals.CONTAINER__FLUID_UNTIL, newFluidUntil);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFluidUntil() {
		eDynamicUnset(BootstrapPackage.CONTAINER__FLUID_UNTIL, BootstrapPackage.Literals.CONTAINER__FLUID_UNTIL);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFluidUntil() {
		return eDynamicIsSet(BootstrapPackage.CONTAINER__FLUID_UNTIL, BootstrapPackage.Literals.CONTAINER__FLUID_UNTIL);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Row> getRows() {
		return (EList<Row>)eDynamicGet(BootstrapPackage.CONTAINER__ROWS, BootstrapPackage.Literals.CONTAINER__ROWS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BootstrapPackage.CONTAINER__ROWS:
				return ((InternalEList<?>)getRows()).basicRemove(otherEnd, msgs);
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
			case BootstrapPackage.CONTAINER__FLUID:
				return isFluid();
			case BootstrapPackage.CONTAINER__FLUID_UNTIL:
				return getFluidUntil();
			case BootstrapPackage.CONTAINER__ROWS:
				return getRows();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case BootstrapPackage.CONTAINER__FLUID:
				setFluid((Boolean)newValue);
				return;
			case BootstrapPackage.CONTAINER__FLUID_UNTIL:
				setFluidUntil((Breakpoint)newValue);
				return;
			case BootstrapPackage.CONTAINER__ROWS:
				getRows().clear();
				getRows().addAll((Collection<? extends Row>)newValue);
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
			case BootstrapPackage.CONTAINER__FLUID:
				setFluid(FLUID_EDEFAULT);
				return;
			case BootstrapPackage.CONTAINER__FLUID_UNTIL:
				unsetFluidUntil();
				return;
			case BootstrapPackage.CONTAINER__ROWS:
				getRows().clear();
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
			case BootstrapPackage.CONTAINER__FLUID:
				return isFluid() != FLUID_EDEFAULT;
			case BootstrapPackage.CONTAINER__FLUID_UNTIL:
				return isSetFluidUntil();
			case BootstrapPackage.CONTAINER__ROWS:
				return !getRows().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ContainerImpl
