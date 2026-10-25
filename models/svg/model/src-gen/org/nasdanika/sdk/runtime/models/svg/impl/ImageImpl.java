/**
 */
package org.nasdanika.sdk.runtime.models.svg.impl;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.sdk.runtime.models.svg.Image;
import org.nasdanika.sdk.runtime.models.svg.SvgPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Image</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.svg.impl.ImageImpl#getHref <em>Href</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.svg.impl.ImageImpl#getX <em>X</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.svg.impl.ImageImpl#getY <em>Y</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.svg.impl.ImageImpl#getWidth <em>Width</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.svg.impl.ImageImpl#getHeight <em>Height</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.svg.impl.ImageImpl#getPreserveAspectRatio <em>Preserve Aspect Ratio</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ImageImpl extends ShapeImpl implements Image {
	/**
	 * The default value of the '{@link #getHref() <em>Href</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHref()
	 * @generated
	 * @ordered
	 */
	protected static final String HREF_EDEFAULT = null;

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
	 * The default value of the '{@link #getPreserveAspectRatio() <em>Preserve Aspect Ratio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreserveAspectRatio()
	 * @generated
	 * @ordered
	 */
	protected static final String PRESERVE_ASPECT_RATIO_EDEFAULT = null;

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
		return SvgPackage.Literals.IMAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHref() {
		return (String)eDynamicGet(SvgPackage.IMAGE__HREF, SvgPackage.Literals.IMAGE__HREF, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHref(String newHref) {
		eDynamicSet(SvgPackage.IMAGE__HREF, SvgPackage.Literals.IMAGE__HREF, newHref);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getX() {
		return (Double)eDynamicGet(SvgPackage.IMAGE__X, SvgPackage.Literals.IMAGE__X, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setX(double newX) {
		eDynamicSet(SvgPackage.IMAGE__X, SvgPackage.Literals.IMAGE__X, newX);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getY() {
		return (Double)eDynamicGet(SvgPackage.IMAGE__Y, SvgPackage.Literals.IMAGE__Y, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setY(double newY) {
		eDynamicSet(SvgPackage.IMAGE__Y, SvgPackage.Literals.IMAGE__Y, newY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getWidth() {
		return (Double)eDynamicGet(SvgPackage.IMAGE__WIDTH, SvgPackage.Literals.IMAGE__WIDTH, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWidth(double newWidth) {
		eDynamicSet(SvgPackage.IMAGE__WIDTH, SvgPackage.Literals.IMAGE__WIDTH, newWidth);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getHeight() {
		return (Double)eDynamicGet(SvgPackage.IMAGE__HEIGHT, SvgPackage.Literals.IMAGE__HEIGHT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeight(double newHeight) {
		eDynamicSet(SvgPackage.IMAGE__HEIGHT, SvgPackage.Literals.IMAGE__HEIGHT, newHeight);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPreserveAspectRatio() {
		return (String)eDynamicGet(SvgPackage.IMAGE__PRESERVE_ASPECT_RATIO, SvgPackage.Literals.IMAGE__PRESERVE_ASPECT_RATIO, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPreserveAspectRatio(String newPreserveAspectRatio) {
		eDynamicSet(SvgPackage.IMAGE__PRESERVE_ASPECT_RATIO, SvgPackage.Literals.IMAGE__PRESERVE_ASPECT_RATIO, newPreserveAspectRatio);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SvgPackage.IMAGE__HREF:
				return getHref();
			case SvgPackage.IMAGE__X:
				return getX();
			case SvgPackage.IMAGE__Y:
				return getY();
			case SvgPackage.IMAGE__WIDTH:
				return getWidth();
			case SvgPackage.IMAGE__HEIGHT:
				return getHeight();
			case SvgPackage.IMAGE__PRESERVE_ASPECT_RATIO:
				return getPreserveAspectRatio();
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
			case SvgPackage.IMAGE__HREF:
				setHref((String)newValue);
				return;
			case SvgPackage.IMAGE__X:
				setX((Double)newValue);
				return;
			case SvgPackage.IMAGE__Y:
				setY((Double)newValue);
				return;
			case SvgPackage.IMAGE__WIDTH:
				setWidth((Double)newValue);
				return;
			case SvgPackage.IMAGE__HEIGHT:
				setHeight((Double)newValue);
				return;
			case SvgPackage.IMAGE__PRESERVE_ASPECT_RATIO:
				setPreserveAspectRatio((String)newValue);
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
			case SvgPackage.IMAGE__HREF:
				setHref(HREF_EDEFAULT);
				return;
			case SvgPackage.IMAGE__X:
				setX(X_EDEFAULT);
				return;
			case SvgPackage.IMAGE__Y:
				setY(Y_EDEFAULT);
				return;
			case SvgPackage.IMAGE__WIDTH:
				setWidth(WIDTH_EDEFAULT);
				return;
			case SvgPackage.IMAGE__HEIGHT:
				setHeight(HEIGHT_EDEFAULT);
				return;
			case SvgPackage.IMAGE__PRESERVE_ASPECT_RATIO:
				setPreserveAspectRatio(PRESERVE_ASPECT_RATIO_EDEFAULT);
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
			case SvgPackage.IMAGE__HREF:
				return HREF_EDEFAULT == null ? getHref() != null : !HREF_EDEFAULT.equals(getHref());
			case SvgPackage.IMAGE__X:
				return getX() != X_EDEFAULT;
			case SvgPackage.IMAGE__Y:
				return getY() != Y_EDEFAULT;
			case SvgPackage.IMAGE__WIDTH:
				return getWidth() != WIDTH_EDEFAULT;
			case SvgPackage.IMAGE__HEIGHT:
				return getHeight() != HEIGHT_EDEFAULT;
			case SvgPackage.IMAGE__PRESERVE_ASPECT_RATIO:
				return PRESERVE_ASPECT_RATIO_EDEFAULT == null ? getPreserveAspectRatio() != null : !PRESERVE_ASPECT_RATIO_EDEFAULT.equals(getPreserveAspectRatio());
		}
		return super.eIsSet(featureID);
	}

} //ImageImpl
