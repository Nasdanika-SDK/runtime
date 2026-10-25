/**
 */
package org.nasdanika.sdk.runtime.models.svg.impl;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.sdk.runtime.models.svg.ClipPath;
import org.nasdanika.sdk.runtime.models.svg.SvgPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Clip Path</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.svg.impl.ClipPathImpl#getClipPathUnits <em>Clip Path Units</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClipPathImpl extends ContainerImpl implements ClipPath {
	/**
	 * The default value of the '{@link #getClipPathUnits() <em>Clip Path Units</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClipPathUnits()
	 * @generated
	 * @ordered
	 */
	protected static final String CLIP_PATH_UNITS_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClipPathImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SvgPackage.Literals.CLIP_PATH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getClipPathUnits() {
		return (String)eDynamicGet(SvgPackage.CLIP_PATH__CLIP_PATH_UNITS, SvgPackage.Literals.CLIP_PATH__CLIP_PATH_UNITS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClipPathUnits(String newClipPathUnits) {
		eDynamicSet(SvgPackage.CLIP_PATH__CLIP_PATH_UNITS, SvgPackage.Literals.CLIP_PATH__CLIP_PATH_UNITS, newClipPathUnits);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SvgPackage.CLIP_PATH__CLIP_PATH_UNITS:
				return getClipPathUnits();
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
			case SvgPackage.CLIP_PATH__CLIP_PATH_UNITS:
				setClipPathUnits((String)newValue);
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
			case SvgPackage.CLIP_PATH__CLIP_PATH_UNITS:
				setClipPathUnits(CLIP_PATH_UNITS_EDEFAULT);
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
			case SvgPackage.CLIP_PATH__CLIP_PATH_UNITS:
				return CLIP_PATH_UNITS_EDEFAULT == null ? getClipPathUnits() != null : !CLIP_PATH_UNITS_EDEFAULT.equals(getClipPathUnits());
		}
		return super.eIsSet(featureID);
	}

} //ClipPathImpl
