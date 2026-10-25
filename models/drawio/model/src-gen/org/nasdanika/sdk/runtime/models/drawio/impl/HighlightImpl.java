/**
 */
package org.nasdanika.sdk.runtime.models.drawio.impl;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.sdk.runtime.models.drawio.DrawioPackage;
import org.nasdanika.sdk.runtime.models.drawio.Highlight;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Highlight</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.drawio.impl.HighlightImpl#getColor <em>Color</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.drawio.impl.HighlightImpl#getOpacity <em>Opacity</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.drawio.impl.HighlightImpl#getDuration <em>Duration</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HighlightImpl extends TargetedActionImpl implements Highlight {
	/**
	 * The default value of the '{@link #getColor() <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColor()
	 * @generated
	 * @ordered
	 */
	protected static final String COLOR_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getOpacity() <em>Opacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpacity()
	 * @generated
	 * @ordered
	 */
	protected static final int OPACITY_EDEFAULT = 0;

	/**
	 * The default value of the '{@link #getDuration() <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected static final int DURATION_EDEFAULT = 0;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HighlightImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DrawioPackage.Literals.HIGHLIGHT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getColor() {
		return (String)eDynamicGet(DrawioPackage.HIGHLIGHT__COLOR, DrawioPackage.Literals.HIGHLIGHT__COLOR, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColor(String newColor) {
		eDynamicSet(DrawioPackage.HIGHLIGHT__COLOR, DrawioPackage.Literals.HIGHLIGHT__COLOR, newColor);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getOpacity() {
		return (Integer)eDynamicGet(DrawioPackage.HIGHLIGHT__OPACITY, DrawioPackage.Literals.HIGHLIGHT__OPACITY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOpacity(int newOpacity) {
		eDynamicSet(DrawioPackage.HIGHLIGHT__OPACITY, DrawioPackage.Literals.HIGHLIGHT__OPACITY, newOpacity);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getDuration() {
		return (Integer)eDynamicGet(DrawioPackage.HIGHLIGHT__DURATION, DrawioPackage.Literals.HIGHLIGHT__DURATION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDuration(int newDuration) {
		eDynamicSet(DrawioPackage.HIGHLIGHT__DURATION, DrawioPackage.Literals.HIGHLIGHT__DURATION, newDuration);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DrawioPackage.HIGHLIGHT__COLOR:
				return getColor();
			case DrawioPackage.HIGHLIGHT__OPACITY:
				return getOpacity();
			case DrawioPackage.HIGHLIGHT__DURATION:
				return getDuration();
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
			case DrawioPackage.HIGHLIGHT__COLOR:
				setColor((String)newValue);
				return;
			case DrawioPackage.HIGHLIGHT__OPACITY:
				setOpacity((Integer)newValue);
				return;
			case DrawioPackage.HIGHLIGHT__DURATION:
				setDuration((Integer)newValue);
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
			case DrawioPackage.HIGHLIGHT__COLOR:
				setColor(COLOR_EDEFAULT);
				return;
			case DrawioPackage.HIGHLIGHT__OPACITY:
				setOpacity(OPACITY_EDEFAULT);
				return;
			case DrawioPackage.HIGHLIGHT__DURATION:
				setDuration(DURATION_EDEFAULT);
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
			case DrawioPackage.HIGHLIGHT__COLOR:
				return COLOR_EDEFAULT == null ? getColor() != null : !COLOR_EDEFAULT.equals(getColor());
			case DrawioPackage.HIGHLIGHT__OPACITY:
				return getOpacity() != OPACITY_EDEFAULT;
			case DrawioPackage.HIGHLIGHT__DURATION:
				return getDuration() != DURATION_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

} //HighlightImpl
