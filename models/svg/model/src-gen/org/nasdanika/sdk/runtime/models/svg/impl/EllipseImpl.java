/**
 */
package org.nasdanika.sdk.runtime.models.svg.impl;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.sdk.runtime.models.svg.Ellipse;
import org.nasdanika.sdk.runtime.models.svg.SvgPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ellipse</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.svg.impl.EllipseImpl#getCx <em>Cx</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.svg.impl.EllipseImpl#getCy <em>Cy</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.svg.impl.EllipseImpl#getRx <em>Rx</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.svg.impl.EllipseImpl#getRy <em>Ry</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EllipseImpl extends ShapeImpl implements Ellipse {
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
	 * The default value of the '{@link #getRx() <em>Rx</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRx()
	 * @generated
	 * @ordered
	 */
	protected static final double RX_EDEFAULT = 0.0;

	/**
	 * The default value of the '{@link #getRy() <em>Ry</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRy()
	 * @generated
	 * @ordered
	 */
	protected static final double RY_EDEFAULT = 0.0;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EllipseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SvgPackage.Literals.ELLIPSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getCx() {
		return (Double)eDynamicGet(SvgPackage.ELLIPSE__CX, SvgPackage.Literals.ELLIPSE__CX, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCx(double newCx) {
		eDynamicSet(SvgPackage.ELLIPSE__CX, SvgPackage.Literals.ELLIPSE__CX, newCx);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getCy() {
		return (Double)eDynamicGet(SvgPackage.ELLIPSE__CY, SvgPackage.Literals.ELLIPSE__CY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCy(double newCy) {
		eDynamicSet(SvgPackage.ELLIPSE__CY, SvgPackage.Literals.ELLIPSE__CY, newCy);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getRx() {
		return (Double)eDynamicGet(SvgPackage.ELLIPSE__RX, SvgPackage.Literals.ELLIPSE__RX, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRx(double newRx) {
		eDynamicSet(SvgPackage.ELLIPSE__RX, SvgPackage.Literals.ELLIPSE__RX, newRx);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getRy() {
		return (Double)eDynamicGet(SvgPackage.ELLIPSE__RY, SvgPackage.Literals.ELLIPSE__RY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRy(double newRy) {
		eDynamicSet(SvgPackage.ELLIPSE__RY, SvgPackage.Literals.ELLIPSE__RY, newRy);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SvgPackage.ELLIPSE__CX:
				return getCx();
			case SvgPackage.ELLIPSE__CY:
				return getCy();
			case SvgPackage.ELLIPSE__RX:
				return getRx();
			case SvgPackage.ELLIPSE__RY:
				return getRy();
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
			case SvgPackage.ELLIPSE__CX:
				setCx((Double)newValue);
				return;
			case SvgPackage.ELLIPSE__CY:
				setCy((Double)newValue);
				return;
			case SvgPackage.ELLIPSE__RX:
				setRx((Double)newValue);
				return;
			case SvgPackage.ELLIPSE__RY:
				setRy((Double)newValue);
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
			case SvgPackage.ELLIPSE__CX:
				setCx(CX_EDEFAULT);
				return;
			case SvgPackage.ELLIPSE__CY:
				setCy(CY_EDEFAULT);
				return;
			case SvgPackage.ELLIPSE__RX:
				setRx(RX_EDEFAULT);
				return;
			case SvgPackage.ELLIPSE__RY:
				setRy(RY_EDEFAULT);
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
			case SvgPackage.ELLIPSE__CX:
				return getCx() != CX_EDEFAULT;
			case SvgPackage.ELLIPSE__CY:
				return getCy() != CY_EDEFAULT;
			case SvgPackage.ELLIPSE__RX:
				return getRx() != RX_EDEFAULT;
			case SvgPackage.ELLIPSE__RY:
				return getRy() != RY_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

} //EllipseImpl
