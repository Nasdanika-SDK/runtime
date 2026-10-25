/**
 */
package org.nasdanika.sdk.runtime.models.svg.impl;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.sdk.runtime.models.svg.Circle;
import org.nasdanika.sdk.runtime.models.svg.SvgPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Circle</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.svg.impl.CircleImpl#getCx <em>Cx</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.svg.impl.CircleImpl#getCy <em>Cy</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.svg.impl.CircleImpl#getR <em>R</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CircleImpl extends ShapeImpl implements Circle {
	/**
	 * The default value of the '{@link #getCx() <em>Cx</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCx()
	 * @generated
	 * @ordered
	 */
	protected static final double CX_EDEFAULT = 0.0;

	/**
	 * The default value of the '{@link #getCy() <em>Cy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCy()
	 * @generated
	 * @ordered
	 */
	protected static final double CY_EDEFAULT = 0.0;

	/**
	 * The default value of the '{@link #getR() <em>R</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getR()
	 * @generated
	 * @ordered
	 */
	protected static final double R_EDEFAULT = 0.0;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CircleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SvgPackage.Literals.CIRCLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getCx() {
		return (Double)eDynamicGet(SvgPackage.CIRCLE__CX, SvgPackage.Literals.CIRCLE__CX, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCx(double newCx) {
		eDynamicSet(SvgPackage.CIRCLE__CX, SvgPackage.Literals.CIRCLE__CX, newCx);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getCy() {
		return (Double)eDynamicGet(SvgPackage.CIRCLE__CY, SvgPackage.Literals.CIRCLE__CY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCy(double newCy) {
		eDynamicSet(SvgPackage.CIRCLE__CY, SvgPackage.Literals.CIRCLE__CY, newCy);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getR() {
		return (Double)eDynamicGet(SvgPackage.CIRCLE__R, SvgPackage.Literals.CIRCLE__R, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setR(double newR) {
		eDynamicSet(SvgPackage.CIRCLE__R, SvgPackage.Literals.CIRCLE__R, newR);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SvgPackage.CIRCLE__CX:
				return getCx();
			case SvgPackage.CIRCLE__CY:
				return getCy();
			case SvgPackage.CIRCLE__R:
				return getR();
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
			case SvgPackage.CIRCLE__CX:
				setCx((Double)newValue);
				return;
			case SvgPackage.CIRCLE__CY:
				setCy((Double)newValue);
				return;
			case SvgPackage.CIRCLE__R:
				setR((Double)newValue);
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
			case SvgPackage.CIRCLE__CX:
				setCx(CX_EDEFAULT);
				return;
			case SvgPackage.CIRCLE__CY:
				setCy(CY_EDEFAULT);
				return;
			case SvgPackage.CIRCLE__R:
				setR(R_EDEFAULT);
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
			case SvgPackage.CIRCLE__CX:
				return getCx() != CX_EDEFAULT;
			case SvgPackage.CIRCLE__CY:
				return getCy() != CY_EDEFAULT;
			case SvgPackage.CIRCLE__R:
				return getR() != R_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

} //CircleImpl
