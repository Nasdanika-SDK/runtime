/**
 */
package org.nasdanika.sdk.runtime.models.html.bootstrap.impl;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.nasdanika.sdk.runtime.models.html.bootstrap.BootstrapPackage;
import org.nasdanika.sdk.runtime.models.html.bootstrap.Breakpoint;
import org.nasdanika.sdk.runtime.models.html.bootstrap.ColumnSize;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Column Size</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.bootstrap.impl.ColumnSizeImpl#getBreakpoint <em>Breakpoint</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.bootstrap.impl.ColumnSizeImpl#getSpan <em>Span</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.bootstrap.impl.ColumnSizeImpl#isAuto <em>Auto</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.bootstrap.impl.ColumnSizeImpl#getOffset <em>Offset</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.bootstrap.impl.ColumnSizeImpl#getOrder <em>Order</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ColumnSizeImpl extends MinimalEObjectImpl.Container implements ColumnSize {
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
	 * The default value of the '{@link #getSpan() <em>Span</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpan()
	 * @generated
	 * @ordered
	 */
	protected static final int SPAN_EDEFAULT = 0;

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
	 * The default value of the '{@link #getOffset() <em>Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOffset()
	 * @generated
	 * @ordered
	 */
	protected static final int OFFSET_EDEFAULT = 0;

	/**
	 * The default value of the '{@link #getOrder() <em>Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrder()
	 * @generated
	 * @ordered
	 */
	protected static final int ORDER_EDEFAULT = 0;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ColumnSizeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BootstrapPackage.Literals.COLUMN_SIZE;
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
		return (Breakpoint)eDynamicGet(BootstrapPackage.COLUMN_SIZE__BREAKPOINT, BootstrapPackage.Literals.COLUMN_SIZE__BREAKPOINT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBreakpoint(Breakpoint newBreakpoint) {
		eDynamicSet(BootstrapPackage.COLUMN_SIZE__BREAKPOINT, BootstrapPackage.Literals.COLUMN_SIZE__BREAKPOINT, newBreakpoint);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSpan() {
		return (Integer)eDynamicGet(BootstrapPackage.COLUMN_SIZE__SPAN, BootstrapPackage.Literals.COLUMN_SIZE__SPAN, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpan(int newSpan) {
		eDynamicSet(BootstrapPackage.COLUMN_SIZE__SPAN, BootstrapPackage.Literals.COLUMN_SIZE__SPAN, newSpan);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAuto() {
		return (Boolean)eDynamicGet(BootstrapPackage.COLUMN_SIZE__AUTO, BootstrapPackage.Literals.COLUMN_SIZE__AUTO, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuto(boolean newAuto) {
		eDynamicSet(BootstrapPackage.COLUMN_SIZE__AUTO, BootstrapPackage.Literals.COLUMN_SIZE__AUTO, newAuto);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getOffset() {
		return (Integer)eDynamicGet(BootstrapPackage.COLUMN_SIZE__OFFSET, BootstrapPackage.Literals.COLUMN_SIZE__OFFSET, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOffset(int newOffset) {
		eDynamicSet(BootstrapPackage.COLUMN_SIZE__OFFSET, BootstrapPackage.Literals.COLUMN_SIZE__OFFSET, newOffset);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetOffset() {
		eDynamicUnset(BootstrapPackage.COLUMN_SIZE__OFFSET, BootstrapPackage.Literals.COLUMN_SIZE__OFFSET);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOffset() {
		return eDynamicIsSet(BootstrapPackage.COLUMN_SIZE__OFFSET, BootstrapPackage.Literals.COLUMN_SIZE__OFFSET);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getOrder() {
		return (Integer)eDynamicGet(BootstrapPackage.COLUMN_SIZE__ORDER, BootstrapPackage.Literals.COLUMN_SIZE__ORDER, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrder(int newOrder) {
		eDynamicSet(BootstrapPackage.COLUMN_SIZE__ORDER, BootstrapPackage.Literals.COLUMN_SIZE__ORDER, newOrder);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetOrder() {
		eDynamicUnset(BootstrapPackage.COLUMN_SIZE__ORDER, BootstrapPackage.Literals.COLUMN_SIZE__ORDER);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOrder() {
		return eDynamicIsSet(BootstrapPackage.COLUMN_SIZE__ORDER, BootstrapPackage.Literals.COLUMN_SIZE__ORDER);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BootstrapPackage.COLUMN_SIZE__BREAKPOINT:
				return getBreakpoint();
			case BootstrapPackage.COLUMN_SIZE__SPAN:
				return getSpan();
			case BootstrapPackage.COLUMN_SIZE__AUTO:
				return isAuto();
			case BootstrapPackage.COLUMN_SIZE__OFFSET:
				return getOffset();
			case BootstrapPackage.COLUMN_SIZE__ORDER:
				return getOrder();
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
			case BootstrapPackage.COLUMN_SIZE__BREAKPOINT:
				setBreakpoint((Breakpoint)newValue);
				return;
			case BootstrapPackage.COLUMN_SIZE__SPAN:
				setSpan((Integer)newValue);
				return;
			case BootstrapPackage.COLUMN_SIZE__AUTO:
				setAuto((Boolean)newValue);
				return;
			case BootstrapPackage.COLUMN_SIZE__OFFSET:
				setOffset((Integer)newValue);
				return;
			case BootstrapPackage.COLUMN_SIZE__ORDER:
				setOrder((Integer)newValue);
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
			case BootstrapPackage.COLUMN_SIZE__BREAKPOINT:
				setBreakpoint(BREAKPOINT_EDEFAULT);
				return;
			case BootstrapPackage.COLUMN_SIZE__SPAN:
				setSpan(SPAN_EDEFAULT);
				return;
			case BootstrapPackage.COLUMN_SIZE__AUTO:
				setAuto(AUTO_EDEFAULT);
				return;
			case BootstrapPackage.COLUMN_SIZE__OFFSET:
				unsetOffset();
				return;
			case BootstrapPackage.COLUMN_SIZE__ORDER:
				unsetOrder();
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
			case BootstrapPackage.COLUMN_SIZE__BREAKPOINT:
				return getBreakpoint() != BREAKPOINT_EDEFAULT;
			case BootstrapPackage.COLUMN_SIZE__SPAN:
				return getSpan() != SPAN_EDEFAULT;
			case BootstrapPackage.COLUMN_SIZE__AUTO:
				return isAuto() != AUTO_EDEFAULT;
			case BootstrapPackage.COLUMN_SIZE__OFFSET:
				return isSetOffset();
			case BootstrapPackage.COLUMN_SIZE__ORDER:
				return isSetOrder();
		}
		return super.eIsSet(featureID);
	}

} //ColumnSizeImpl
