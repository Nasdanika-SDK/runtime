/**
 */
package org.nasdanika.sdk.runtime.models.react.bootstrap.components.content.impl;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.sdk.runtime.models.react.bootstrap.components.content.CloseButton;
import org.nasdanika.sdk.runtime.models.react.bootstrap.components.content.CloseButtonVariant;
import org.nasdanika.sdk.runtime.models.react.bootstrap.components.content.ContentPackage;

import org.nasdanika.sdk.runtime.models.react.bootstrap.impl.BootstrapComponentImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Close Button</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.content.impl.CloseButtonImpl#getVariant <em>Variant</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.content.impl.CloseButtonImpl#isDisabled <em>Disabled</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CloseButtonImpl extends BootstrapComponentImpl implements CloseButton {
	/**
	 * The default value of the '{@link #getVariant() <em>Variant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariant()
	 * @generated
	 * @ordered
	 */
	protected static final CloseButtonVariant VARIANT_EDEFAULT = CloseButtonVariant.WHITE;

	/**
	 * The default value of the '{@link #isDisabled() <em>Disabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDisabled()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DISABLED_EDEFAULT = false;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CloseButtonImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ContentPackage.Literals.CLOSE_BUTTON;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CloseButtonVariant getVariant() {
		return (CloseButtonVariant)eDynamicGet(ContentPackage.CLOSE_BUTTON__VARIANT, ContentPackage.Literals.CLOSE_BUTTON__VARIANT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVariant(CloseButtonVariant newVariant) {
		eDynamicSet(ContentPackage.CLOSE_BUTTON__VARIANT, ContentPackage.Literals.CLOSE_BUTTON__VARIANT, newVariant);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetVariant() {
		eDynamicUnset(ContentPackage.CLOSE_BUTTON__VARIANT, ContentPackage.Literals.CLOSE_BUTTON__VARIANT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetVariant() {
		return eDynamicIsSet(ContentPackage.CLOSE_BUTTON__VARIANT, ContentPackage.Literals.CLOSE_BUTTON__VARIANT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDisabled() {
		return (Boolean)eDynamicGet(ContentPackage.CLOSE_BUTTON__DISABLED, ContentPackage.Literals.CLOSE_BUTTON__DISABLED, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisabled(boolean newDisabled) {
		eDynamicSet(ContentPackage.CLOSE_BUTTON__DISABLED, ContentPackage.Literals.CLOSE_BUTTON__DISABLED, newDisabled);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ContentPackage.CLOSE_BUTTON__VARIANT:
				return getVariant();
			case ContentPackage.CLOSE_BUTTON__DISABLED:
				return isDisabled();
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
			case ContentPackage.CLOSE_BUTTON__VARIANT:
				setVariant((CloseButtonVariant)newValue);
				return;
			case ContentPackage.CLOSE_BUTTON__DISABLED:
				setDisabled((Boolean)newValue);
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
			case ContentPackage.CLOSE_BUTTON__VARIANT:
				unsetVariant();
				return;
			case ContentPackage.CLOSE_BUTTON__DISABLED:
				setDisabled(DISABLED_EDEFAULT);
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
			case ContentPackage.CLOSE_BUTTON__VARIANT:
				return isSetVariant();
			case ContentPackage.CLOSE_BUTTON__DISABLED:
				return isDisabled() != DISABLED_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

} //CloseButtonImpl
