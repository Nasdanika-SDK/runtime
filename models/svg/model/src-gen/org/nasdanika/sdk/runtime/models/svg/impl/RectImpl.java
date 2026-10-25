/**
 */
package org.nasdanika.sdk.runtime.models.svg.impl;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.sdk.runtime.models.svg.Rect;
import org.nasdanika.sdk.runtime.models.svg.SvgPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rect</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.svg.impl.RectImpl#getX <em>X</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.svg.impl.RectImpl#getY <em>Y</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.svg.impl.RectImpl#getWidth <em>Width</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.svg.impl.RectImpl#getHeight <em>Height</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.svg.impl.RectImpl#getRx <em>Rx</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.svg.impl.RectImpl#getRy <em>Ry</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RectImpl extends ShapeImpl implements Rect {
	/**
	 * The default value of the '{@link #getX() <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getX()
	 * @generated
	 * @ordered
	 */
	protected static final double X_EDEFAULT = 0.0;

	/**
	 * The default value of the '{@link #getY() <em>Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getY()
	 * @generated
	 * @ordered
	 */
	protected static final double Y_EDEFAULT = 0.0;

	/**
	 * The default value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected static final double WIDTH_EDEFAULT = 0.0;

	/**
	 * The default value of the '{@link #getHeight() <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeight()
	 * @generated
	 * @ordered
	 */
	protected static final double HEIGHT_EDEFAULT = 0.0;

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
	protected RectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SvgPackage.Literals.RECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getX() {
		return (Double)eDynamicGet(SvgPackage.RECT__X, SvgPackage.Literals.RECT__X, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setX(double newX) {
		eDynamicSet(SvgPackage.RECT__X, SvgPackage.Literals.RECT__X, newX);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getY() {
		return (Double)eDynamicGet(SvgPackage.RECT__Y, SvgPackage.Literals.RECT__Y, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setY(double newY) {
		eDynamicSet(SvgPackage.RECT__Y, SvgPackage.Literals.RECT__Y, newY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getWidth() {
		return (Double)eDynamicGet(SvgPackage.RECT__WIDTH, SvgPackage.Literals.RECT__WIDTH, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWidth(double newWidth) {
		eDynamicSet(SvgPackage.RECT__WIDTH, SvgPackage.Literals.RECT__WIDTH, newWidth);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getHeight() {
		return (Double)eDynamicGet(SvgPackage.RECT__HEIGHT, SvgPackage.Literals.RECT__HEIGHT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeight(double newHeight) {
		eDynamicSet(SvgPackage.RECT__HEIGHT, SvgPackage.Literals.RECT__HEIGHT, newHeight);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getRx() {
		return (Double)eDynamicGet(SvgPackage.RECT__RX, SvgPackage.Literals.RECT__RX, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRx(double newRx) {
		eDynamicSet(SvgPackage.RECT__RX, SvgPackage.Literals.RECT__RX, newRx);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getRy() {
		return (Double)eDynamicGet(SvgPackage.RECT__RY, SvgPackage.Literals.RECT__RY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRy(double newRy) {
		eDynamicSet(SvgPackage.RECT__RY, SvgPackage.Literals.RECT__RY, newRy);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SvgPackage.RECT__X:
				return getX();
			case SvgPackage.RECT__Y:
				return getY();
			case SvgPackage.RECT__WIDTH:
				return getWidth();
			case SvgPackage.RECT__HEIGHT:
				return getHeight();
			case SvgPackage.RECT__RX:
				return getRx();
			case SvgPackage.RECT__RY:
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
			case SvgPackage.RECT__X:
				setX((Double)newValue);
				return;
			case SvgPackage.RECT__Y:
				setY((Double)newValue);
				return;
			case SvgPackage.RECT__WIDTH:
				setWidth((Double)newValue);
				return;
			case SvgPackage.RECT__HEIGHT:
				setHeight((Double)newValue);
				return;
			case SvgPackage.RECT__RX:
				setRx((Double)newValue);
				return;
			case SvgPackage.RECT__RY:
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
			case SvgPackage.RECT__X:
				setX(X_EDEFAULT);
				return;
			case SvgPackage.RECT__Y:
				setY(Y_EDEFAULT);
				return;
			case SvgPackage.RECT__WIDTH:
				setWidth(WIDTH_EDEFAULT);
				return;
			case SvgPackage.RECT__HEIGHT:
				setHeight(HEIGHT_EDEFAULT);
				return;
			case SvgPackage.RECT__RX:
				setRx(RX_EDEFAULT);
				return;
			case SvgPackage.RECT__RY:
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
			case SvgPackage.RECT__X:
				return getX() != X_EDEFAULT;
			case SvgPackage.RECT__Y:
				return getY() != Y_EDEFAULT;
			case SvgPackage.RECT__WIDTH:
				return getWidth() != WIDTH_EDEFAULT;
			case SvgPackage.RECT__HEIGHT:
				return getHeight() != HEIGHT_EDEFAULT;
			case SvgPackage.RECT__RX:
				return getRx() != RX_EDEFAULT;
			case SvgPackage.RECT__RY:
				return getRy() != RY_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

} //RectImpl
