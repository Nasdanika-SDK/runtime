/**
 */
package org.nasdanika.sdk.runtime.models.svg.impl;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.sdk.runtime.models.svg.Stop;
import org.nasdanika.sdk.runtime.models.svg.SvgPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Stop</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.svg.impl.StopImpl#getOffset <em>Offset</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.svg.impl.StopImpl#getStopColor <em>Stop Color</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.svg.impl.StopImpl#getStopOpacity <em>Stop Opacity</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StopImpl extends ElementImpl implements Stop {
	/**
	 * The default value of the '{@link #getOffset() <em>Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOffset()
	 * @generated
	 * @ordered
	 */
	protected static final String OFFSET_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getStopColor() <em>Stop Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStopColor()
	 * @generated
	 * @ordered
	 */
	protected static final String STOP_COLOR_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getStopOpacity() <em>Stop Opacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStopOpacity()
	 * @generated
	 * @ordered
	 */
	protected static final String STOP_OPACITY_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StopImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SvgPackage.Literals.STOP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOffset() {
		return (String)eDynamicGet(SvgPackage.STOP__OFFSET, SvgPackage.Literals.STOP__OFFSET, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOffset(String newOffset) {
		eDynamicSet(SvgPackage.STOP__OFFSET, SvgPackage.Literals.STOP__OFFSET, newOffset);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStopColor() {
		return (String)eDynamicGet(SvgPackage.STOP__STOP_COLOR, SvgPackage.Literals.STOP__STOP_COLOR, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStopColor(String newStopColor) {
		eDynamicSet(SvgPackage.STOP__STOP_COLOR, SvgPackage.Literals.STOP__STOP_COLOR, newStopColor);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStopOpacity() {
		return (String)eDynamicGet(SvgPackage.STOP__STOP_OPACITY, SvgPackage.Literals.STOP__STOP_OPACITY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStopOpacity(String newStopOpacity) {
		eDynamicSet(SvgPackage.STOP__STOP_OPACITY, SvgPackage.Literals.STOP__STOP_OPACITY, newStopOpacity);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SvgPackage.STOP__OFFSET:
				return getOffset();
			case SvgPackage.STOP__STOP_COLOR:
				return getStopColor();
			case SvgPackage.STOP__STOP_OPACITY:
				return getStopOpacity();
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
			case SvgPackage.STOP__OFFSET:
				setOffset((String)newValue);
				return;
			case SvgPackage.STOP__STOP_COLOR:
				setStopColor((String)newValue);
				return;
			case SvgPackage.STOP__STOP_OPACITY:
				setStopOpacity((String)newValue);
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
			case SvgPackage.STOP__OFFSET:
				setOffset(OFFSET_EDEFAULT);
				return;
			case SvgPackage.STOP__STOP_COLOR:
				setStopColor(STOP_COLOR_EDEFAULT);
				return;
			case SvgPackage.STOP__STOP_OPACITY:
				setStopOpacity(STOP_OPACITY_EDEFAULT);
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
			case SvgPackage.STOP__OFFSET:
				return OFFSET_EDEFAULT == null ? getOffset() != null : !OFFSET_EDEFAULT.equals(getOffset());
			case SvgPackage.STOP__STOP_COLOR:
				return STOP_COLOR_EDEFAULT == null ? getStopColor() != null : !STOP_COLOR_EDEFAULT.equals(getStopColor());
			case SvgPackage.STOP__STOP_OPACITY:
				return STOP_OPACITY_EDEFAULT == null ? getStopOpacity() != null : !STOP_OPACITY_EDEFAULT.equals(getStopOpacity());
		}
		return super.eIsSet(featureID);
	}

} //StopImpl
