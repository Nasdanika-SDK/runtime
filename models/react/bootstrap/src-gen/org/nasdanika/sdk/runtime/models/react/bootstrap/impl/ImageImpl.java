/**
 */
package org.nasdanika.sdk.runtime.models.react.bootstrap.impl;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.sdk.runtime.models.react.bootstrap.BootstrapPackage;
import org.nasdanika.sdk.runtime.models.react.bootstrap.Image;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Image</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.bootstrap.impl.ImageImpl#getSrc <em>Src</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.bootstrap.impl.ImageImpl#getAlt <em>Alt</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.bootstrap.impl.ImageImpl#isFluid <em>Fluid</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.bootstrap.impl.ImageImpl#isRounded <em>Rounded</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.bootstrap.impl.ImageImpl#isRoundedCircle <em>Rounded Circle</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.bootstrap.impl.ImageImpl#isThumbnail <em>Thumbnail</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ImageImpl extends BootstrapComponentImpl implements Image {
	/**
	 * The default value of the '{@link #getSrc() <em>Src</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSrc()
	 * @generated
	 * @ordered
	 */
	protected static final String SRC_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getAlt() <em>Alt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlt()
	 * @generated
	 * @ordered
	 */
	protected static final String ALT_EDEFAULT = null;

	/**
	 * The default value of the '{@link #isFluid() <em>Fluid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFluid()
	 * @generated
	 * @ordered
	 */
	protected static final boolean FLUID_EDEFAULT = false;

	/**
	 * The default value of the '{@link #isRounded() <em>Rounded</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRounded()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ROUNDED_EDEFAULT = false;

	/**
	 * The default value of the '{@link #isRoundedCircle() <em>Rounded Circle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRoundedCircle()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ROUNDED_CIRCLE_EDEFAULT = false;

	/**
	 * The default value of the '{@link #isThumbnail() <em>Thumbnail</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isThumbnail()
	 * @generated
	 * @ordered
	 */
	protected static final boolean THUMBNAIL_EDEFAULT = false;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BootstrapPackage.Literals.IMAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSrc() {
		return (String)eDynamicGet(BootstrapPackage.IMAGE__SRC, BootstrapPackage.Literals.IMAGE__SRC, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSrc(String newSrc) {
		eDynamicSet(BootstrapPackage.IMAGE__SRC, BootstrapPackage.Literals.IMAGE__SRC, newSrc);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAlt() {
		return (String)eDynamicGet(BootstrapPackage.IMAGE__ALT, BootstrapPackage.Literals.IMAGE__ALT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlt(String newAlt) {
		eDynamicSet(BootstrapPackage.IMAGE__ALT, BootstrapPackage.Literals.IMAGE__ALT, newAlt);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isFluid() {
		return (Boolean)eDynamicGet(BootstrapPackage.IMAGE__FLUID, BootstrapPackage.Literals.IMAGE__FLUID, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFluid(boolean newFluid) {
		eDynamicSet(BootstrapPackage.IMAGE__FLUID, BootstrapPackage.Literals.IMAGE__FLUID, newFluid);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isRounded() {
		return (Boolean)eDynamicGet(BootstrapPackage.IMAGE__ROUNDED, BootstrapPackage.Literals.IMAGE__ROUNDED, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRounded(boolean newRounded) {
		eDynamicSet(BootstrapPackage.IMAGE__ROUNDED, BootstrapPackage.Literals.IMAGE__ROUNDED, newRounded);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isRoundedCircle() {
		return (Boolean)eDynamicGet(BootstrapPackage.IMAGE__ROUNDED_CIRCLE, BootstrapPackage.Literals.IMAGE__ROUNDED_CIRCLE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoundedCircle(boolean newRoundedCircle) {
		eDynamicSet(BootstrapPackage.IMAGE__ROUNDED_CIRCLE, BootstrapPackage.Literals.IMAGE__ROUNDED_CIRCLE, newRoundedCircle);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isThumbnail() {
		return (Boolean)eDynamicGet(BootstrapPackage.IMAGE__THUMBNAIL, BootstrapPackage.Literals.IMAGE__THUMBNAIL, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThumbnail(boolean newThumbnail) {
		eDynamicSet(BootstrapPackage.IMAGE__THUMBNAIL, BootstrapPackage.Literals.IMAGE__THUMBNAIL, newThumbnail);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BootstrapPackage.IMAGE__SRC:
				return getSrc();
			case BootstrapPackage.IMAGE__ALT:
				return getAlt();
			case BootstrapPackage.IMAGE__FLUID:
				return isFluid();
			case BootstrapPackage.IMAGE__ROUNDED:
				return isRounded();
			case BootstrapPackage.IMAGE__ROUNDED_CIRCLE:
				return isRoundedCircle();
			case BootstrapPackage.IMAGE__THUMBNAIL:
				return isThumbnail();
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
			case BootstrapPackage.IMAGE__SRC:
				setSrc((String)newValue);
				return;
			case BootstrapPackage.IMAGE__ALT:
				setAlt((String)newValue);
				return;
			case BootstrapPackage.IMAGE__FLUID:
				setFluid((Boolean)newValue);
				return;
			case BootstrapPackage.IMAGE__ROUNDED:
				setRounded((Boolean)newValue);
				return;
			case BootstrapPackage.IMAGE__ROUNDED_CIRCLE:
				setRoundedCircle((Boolean)newValue);
				return;
			case BootstrapPackage.IMAGE__THUMBNAIL:
				setThumbnail((Boolean)newValue);
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
			case BootstrapPackage.IMAGE__SRC:
				setSrc(SRC_EDEFAULT);
				return;
			case BootstrapPackage.IMAGE__ALT:
				setAlt(ALT_EDEFAULT);
				return;
			case BootstrapPackage.IMAGE__FLUID:
				setFluid(FLUID_EDEFAULT);
				return;
			case BootstrapPackage.IMAGE__ROUNDED:
				setRounded(ROUNDED_EDEFAULT);
				return;
			case BootstrapPackage.IMAGE__ROUNDED_CIRCLE:
				setRoundedCircle(ROUNDED_CIRCLE_EDEFAULT);
				return;
			case BootstrapPackage.IMAGE__THUMBNAIL:
				setThumbnail(THUMBNAIL_EDEFAULT);
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
			case BootstrapPackage.IMAGE__SRC:
				return SRC_EDEFAULT == null ? getSrc() != null : !SRC_EDEFAULT.equals(getSrc());
			case BootstrapPackage.IMAGE__ALT:
				return ALT_EDEFAULT == null ? getAlt() != null : !ALT_EDEFAULT.equals(getAlt());
			case BootstrapPackage.IMAGE__FLUID:
				return isFluid() != FLUID_EDEFAULT;
			case BootstrapPackage.IMAGE__ROUNDED:
				return isRounded() != ROUNDED_EDEFAULT;
			case BootstrapPackage.IMAGE__ROUNDED_CIRCLE:
				return isRoundedCircle() != ROUNDED_CIRCLE_EDEFAULT;
			case BootstrapPackage.IMAGE__THUMBNAIL:
				return isThumbnail() != THUMBNAIL_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

} //ImageImpl
