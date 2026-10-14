/**
 */
package org.nasdanika.sdk.runtime.models.html.bootstrap.impl;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.sdk.runtime.models.html.bootstrap.AspectRatio;
import org.nasdanika.sdk.runtime.models.html.bootstrap.BootstrapPackage;
import org.nasdanika.sdk.runtime.models.html.bootstrap.Ratio;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ratio</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.bootstrap.impl.RatioImpl#getAspectRatio <em>Aspect Ratio</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RatioImpl extends BootstrapElementImpl implements Ratio {
	/**
	 * The default value of the '{@link #getAspectRatio() <em>Aspect Ratio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAspectRatio()
	 * @generated
	 * @ordered
	 */
	protected static final AspectRatio ASPECT_RATIO_EDEFAULT = AspectRatio.R1X1;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RatioImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BootstrapPackage.Literals.RATIO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AspectRatio getAspectRatio() {
		return (AspectRatio)eDynamicGet(BootstrapPackage.RATIO__ASPECT_RATIO, BootstrapPackage.Literals.RATIO__ASPECT_RATIO, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAspectRatio(AspectRatio newAspectRatio) {
		eDynamicSet(BootstrapPackage.RATIO__ASPECT_RATIO, BootstrapPackage.Literals.RATIO__ASPECT_RATIO, newAspectRatio);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAspectRatio() {
		eDynamicUnset(BootstrapPackage.RATIO__ASPECT_RATIO, BootstrapPackage.Literals.RATIO__ASPECT_RATIO);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAspectRatio() {
		return eDynamicIsSet(BootstrapPackage.RATIO__ASPECT_RATIO, BootstrapPackage.Literals.RATIO__ASPECT_RATIO);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BootstrapPackage.RATIO__ASPECT_RATIO:
				return getAspectRatio();
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
			case BootstrapPackage.RATIO__ASPECT_RATIO:
				setAspectRatio((AspectRatio)newValue);
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
			case BootstrapPackage.RATIO__ASPECT_RATIO:
				unsetAspectRatio();
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
			case BootstrapPackage.RATIO__ASPECT_RATIO:
				return isSetAspectRatio();
		}
		return super.eIsSet(featureID);
	}

} //RatioImpl
