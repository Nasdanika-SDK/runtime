/**
 */
package org.nasdanika.sdk.runtime.models.svg.impl;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.sdk.runtime.models.svg.Line;
import org.nasdanika.sdk.runtime.models.svg.SvgPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Line</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.svg.impl.LineImpl#getX1 <em>X1</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.svg.impl.LineImpl#getY1 <em>Y1</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.svg.impl.LineImpl#getX2 <em>X2</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.svg.impl.LineImpl#getY2 <em>Y2</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LineImpl extends ShapeImpl implements Line {
	/**
	 * The default value of the '{@link #getX1() <em>X1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getX1()
	 * @generated
	 * @ordered
	 */
	protected static final double X1_EDEFAULT = 0.0;

	/**
	 * The default value of the '{@link #getY1() <em>Y1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getY1()
	 * @generated
	 * @ordered
	 */
	protected static final double Y1_EDEFAULT = 0.0;

	/**
	 * The default value of the '{@link #getX2() <em>X2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getX2()
	 * @generated
	 * @ordered
	 */
	protected static final double X2_EDEFAULT = 0.0;

	/**
	 * The default value of the '{@link #getY2() <em>Y2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getY2()
	 * @generated
	 * @ordered
	 */
	protected static final double Y2_EDEFAULT = 0.0;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LineImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SvgPackage.Literals.LINE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getX1() {
		return (Double)eDynamicGet(SvgPackage.LINE__X1, SvgPackage.Literals.LINE__X1, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setX1(double newX1) {
		eDynamicSet(SvgPackage.LINE__X1, SvgPackage.Literals.LINE__X1, newX1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getY1() {
		return (Double)eDynamicGet(SvgPackage.LINE__Y1, SvgPackage.Literals.LINE__Y1, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setY1(double newY1) {
		eDynamicSet(SvgPackage.LINE__Y1, SvgPackage.Literals.LINE__Y1, newY1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getX2() {
		return (Double)eDynamicGet(SvgPackage.LINE__X2, SvgPackage.Literals.LINE__X2, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setX2(double newX2) {
		eDynamicSet(SvgPackage.LINE__X2, SvgPackage.Literals.LINE__X2, newX2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getY2() {
		return (Double)eDynamicGet(SvgPackage.LINE__Y2, SvgPackage.Literals.LINE__Y2, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setY2(double newY2) {
		eDynamicSet(SvgPackage.LINE__Y2, SvgPackage.Literals.LINE__Y2, newY2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SvgPackage.LINE__X1:
				return getX1();
			case SvgPackage.LINE__Y1:
				return getY1();
			case SvgPackage.LINE__X2:
				return getX2();
			case SvgPackage.LINE__Y2:
				return getY2();
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
			case SvgPackage.LINE__X1:
				setX1((Double)newValue);
				return;
			case SvgPackage.LINE__Y1:
				setY1((Double)newValue);
				return;
			case SvgPackage.LINE__X2:
				setX2((Double)newValue);
				return;
			case SvgPackage.LINE__Y2:
				setY2((Double)newValue);
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
			case SvgPackage.LINE__X1:
				setX1(X1_EDEFAULT);
				return;
			case SvgPackage.LINE__Y1:
				setY1(Y1_EDEFAULT);
				return;
			case SvgPackage.LINE__X2:
				setX2(X2_EDEFAULT);
				return;
			case SvgPackage.LINE__Y2:
				setY2(Y2_EDEFAULT);
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
			case SvgPackage.LINE__X1:
				return getX1() != X1_EDEFAULT;
			case SvgPackage.LINE__Y1:
				return getY1() != Y1_EDEFAULT;
			case SvgPackage.LINE__X2:
				return getX2() != X2_EDEFAULT;
			case SvgPackage.LINE__Y2:
				return getY2() != Y2_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

} //LineImpl
