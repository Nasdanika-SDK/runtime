/**
 */
package org.nasdanika.sdk.runtime.models.svg.impl;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.sdk.runtime.models.svg.LinearGradient;
import org.nasdanika.sdk.runtime.models.svg.SvgPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Linear Gradient</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.svg.impl.LinearGradientImpl#getX1 <em>X1</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.svg.impl.LinearGradientImpl#getY1 <em>Y1</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.svg.impl.LinearGradientImpl#getX2 <em>X2</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.svg.impl.LinearGradientImpl#getY2 <em>Y2</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.svg.impl.LinearGradientImpl#getGradientUnits <em>Gradient Units</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LinearGradientImpl extends ContainerImpl implements LinearGradient {
	/**
	 * The default value of the '{@link #getX1() <em>X1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getX1()
	 * @generated
	 * @ordered
	 */
	protected static final String X1_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getY1() <em>Y1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getY1()
	 * @generated
	 * @ordered
	 */
	protected static final String Y1_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getX2() <em>X2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getX2()
	 * @generated
	 * @ordered
	 */
	protected static final String X2_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getY2() <em>Y2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getY2()
	 * @generated
	 * @ordered
	 */
	protected static final String Y2_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getGradientUnits() <em>Gradient Units</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGradientUnits()
	 * @generated
	 * @ordered
	 */
	protected static final String GRADIENT_UNITS_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LinearGradientImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SvgPackage.Literals.LINEAR_GRADIENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getX1() {
		return (String)eDynamicGet(SvgPackage.LINEAR_GRADIENT__X1, SvgPackage.Literals.LINEAR_GRADIENT__X1, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setX1(String newX1) {
		eDynamicSet(SvgPackage.LINEAR_GRADIENT__X1, SvgPackage.Literals.LINEAR_GRADIENT__X1, newX1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getY1() {
		return (String)eDynamicGet(SvgPackage.LINEAR_GRADIENT__Y1, SvgPackage.Literals.LINEAR_GRADIENT__Y1, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setY1(String newY1) {
		eDynamicSet(SvgPackage.LINEAR_GRADIENT__Y1, SvgPackage.Literals.LINEAR_GRADIENT__Y1, newY1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getX2() {
		return (String)eDynamicGet(SvgPackage.LINEAR_GRADIENT__X2, SvgPackage.Literals.LINEAR_GRADIENT__X2, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setX2(String newX2) {
		eDynamicSet(SvgPackage.LINEAR_GRADIENT__X2, SvgPackage.Literals.LINEAR_GRADIENT__X2, newX2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getY2() {
		return (String)eDynamicGet(SvgPackage.LINEAR_GRADIENT__Y2, SvgPackage.Literals.LINEAR_GRADIENT__Y2, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setY2(String newY2) {
		eDynamicSet(SvgPackage.LINEAR_GRADIENT__Y2, SvgPackage.Literals.LINEAR_GRADIENT__Y2, newY2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGradientUnits() {
		return (String)eDynamicGet(SvgPackage.LINEAR_GRADIENT__GRADIENT_UNITS, SvgPackage.Literals.LINEAR_GRADIENT__GRADIENT_UNITS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGradientUnits(String newGradientUnits) {
		eDynamicSet(SvgPackage.LINEAR_GRADIENT__GRADIENT_UNITS, SvgPackage.Literals.LINEAR_GRADIENT__GRADIENT_UNITS, newGradientUnits);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SvgPackage.LINEAR_GRADIENT__X1:
				return getX1();
			case SvgPackage.LINEAR_GRADIENT__Y1:
				return getY1();
			case SvgPackage.LINEAR_GRADIENT__X2:
				return getX2();
			case SvgPackage.LINEAR_GRADIENT__Y2:
				return getY2();
			case SvgPackage.LINEAR_GRADIENT__GRADIENT_UNITS:
				return getGradientUnits();
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
			case SvgPackage.LINEAR_GRADIENT__X1:
				setX1((String)newValue);
				return;
			case SvgPackage.LINEAR_GRADIENT__Y1:
				setY1((String)newValue);
				return;
			case SvgPackage.LINEAR_GRADIENT__X2:
				setX2((String)newValue);
				return;
			case SvgPackage.LINEAR_GRADIENT__Y2:
				setY2((String)newValue);
				return;
			case SvgPackage.LINEAR_GRADIENT__GRADIENT_UNITS:
				setGradientUnits((String)newValue);
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
			case SvgPackage.LINEAR_GRADIENT__X1:
				setX1(X1_EDEFAULT);
				return;
			case SvgPackage.LINEAR_GRADIENT__Y1:
				setY1(Y1_EDEFAULT);
				return;
			case SvgPackage.LINEAR_GRADIENT__X2:
				setX2(X2_EDEFAULT);
				return;
			case SvgPackage.LINEAR_GRADIENT__Y2:
				setY2(Y2_EDEFAULT);
				return;
			case SvgPackage.LINEAR_GRADIENT__GRADIENT_UNITS:
				setGradientUnits(GRADIENT_UNITS_EDEFAULT);
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
			case SvgPackage.LINEAR_GRADIENT__X1:
				return X1_EDEFAULT == null ? getX1() != null : !X1_EDEFAULT.equals(getX1());
			case SvgPackage.LINEAR_GRADIENT__Y1:
				return Y1_EDEFAULT == null ? getY1() != null : !Y1_EDEFAULT.equals(getY1());
			case SvgPackage.LINEAR_GRADIENT__X2:
				return X2_EDEFAULT == null ? getX2() != null : !X2_EDEFAULT.equals(getX2());
			case SvgPackage.LINEAR_GRADIENT__Y2:
				return Y2_EDEFAULT == null ? getY2() != null : !Y2_EDEFAULT.equals(getY2());
			case SvgPackage.LINEAR_GRADIENT__GRADIENT_UNITS:
				return GRADIENT_UNITS_EDEFAULT == null ? getGradientUnits() != null : !GRADIENT_UNITS_EDEFAULT.equals(getGradientUnits());
		}
		return super.eIsSet(featureID);
	}

} //LinearGradientImpl
