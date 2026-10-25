/**
 */
package org.nasdanika.sdk.runtime.models.presentation.impl;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.sdk.runtime.models.presentation.MediaShape;
import org.nasdanika.sdk.runtime.models.presentation.PresentationPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Media Shape</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.presentation.impl.MediaShapeImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.presentation.impl.MediaShapeImpl#getContentType <em>Content Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MediaShapeImpl extends ShapeImpl implements MediaShape {
	/**
	 * The default value of the '{@link #getLocation() <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected static final String LOCATION_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getContentType() <em>Content Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentType()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTENT_TYPE_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MediaShapeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PresentationPackage.Literals.MEDIA_SHAPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLocation() {
		return (String)eDynamicGet(PresentationPackage.MEDIA_SHAPE__LOCATION, PresentationPackage.Literals.MEDIA_SHAPE__LOCATION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocation(String newLocation) {
		eDynamicSet(PresentationPackage.MEDIA_SHAPE__LOCATION, PresentationPackage.Literals.MEDIA_SHAPE__LOCATION, newLocation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getContentType() {
		return (String)eDynamicGet(PresentationPackage.MEDIA_SHAPE__CONTENT_TYPE, PresentationPackage.Literals.MEDIA_SHAPE__CONTENT_TYPE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContentType(String newContentType) {
		eDynamicSet(PresentationPackage.MEDIA_SHAPE__CONTENT_TYPE, PresentationPackage.Literals.MEDIA_SHAPE__CONTENT_TYPE, newContentType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PresentationPackage.MEDIA_SHAPE__LOCATION:
				return getLocation();
			case PresentationPackage.MEDIA_SHAPE__CONTENT_TYPE:
				return getContentType();
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
			case PresentationPackage.MEDIA_SHAPE__LOCATION:
				setLocation((String)newValue);
				return;
			case PresentationPackage.MEDIA_SHAPE__CONTENT_TYPE:
				setContentType((String)newValue);
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
			case PresentationPackage.MEDIA_SHAPE__LOCATION:
				setLocation(LOCATION_EDEFAULT);
				return;
			case PresentationPackage.MEDIA_SHAPE__CONTENT_TYPE:
				setContentType(CONTENT_TYPE_EDEFAULT);
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
			case PresentationPackage.MEDIA_SHAPE__LOCATION:
				return LOCATION_EDEFAULT == null ? getLocation() != null : !LOCATION_EDEFAULT.equals(getLocation());
			case PresentationPackage.MEDIA_SHAPE__CONTENT_TYPE:
				return CONTENT_TYPE_EDEFAULT == null ? getContentType() != null : !CONTENT_TYPE_EDEFAULT.equals(getContentType());
		}
		return super.eIsSet(featureID);
	}

} //MediaShapeImpl
