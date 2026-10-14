/**
 */
package org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.sdk.runtime.models.html.bootstrap.ButtonVariant;
import org.nasdanika.sdk.runtime.models.html.bootstrap.ColumnSize;

import org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.ContentPackage;
import org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.PlaceholderButton;

import org.nasdanika.sdk.runtime.models.html.bootstrap.impl.BootstrapElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Placeholder Button</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.impl.PlaceholderButtonImpl#getVariant <em>Variant</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.impl.PlaceholderButtonImpl#getSizes <em>Sizes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PlaceholderButtonImpl extends BootstrapElementImpl implements PlaceholderButton {
	/**
	 * The default value of the '{@link #getVariant() <em>Variant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariant()
	 * @generated
	 * @ordered
	 */
	protected static final ButtonVariant VARIANT_EDEFAULT = ButtonVariant.PRIMARY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlaceholderButtonImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ContentPackage.Literals.PLACEHOLDER_BUTTON;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ButtonVariant getVariant() {
		return (ButtonVariant)eDynamicGet(ContentPackage.PLACEHOLDER_BUTTON__VARIANT, ContentPackage.Literals.PLACEHOLDER_BUTTON__VARIANT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVariant(ButtonVariant newVariant) {
		eDynamicSet(ContentPackage.PLACEHOLDER_BUTTON__VARIANT, ContentPackage.Literals.PLACEHOLDER_BUTTON__VARIANT, newVariant);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetVariant() {
		eDynamicUnset(ContentPackage.PLACEHOLDER_BUTTON__VARIANT, ContentPackage.Literals.PLACEHOLDER_BUTTON__VARIANT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetVariant() {
		return eDynamicIsSet(ContentPackage.PLACEHOLDER_BUTTON__VARIANT, ContentPackage.Literals.PLACEHOLDER_BUTTON__VARIANT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<ColumnSize> getSizes() {
		return (EList<ColumnSize>)eDynamicGet(ContentPackage.PLACEHOLDER_BUTTON__SIZES, ContentPackage.Literals.PLACEHOLDER_BUTTON__SIZES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ContentPackage.PLACEHOLDER_BUTTON__SIZES:
				return ((InternalEList<?>)getSizes()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ContentPackage.PLACEHOLDER_BUTTON__VARIANT:
				return getVariant();
			case ContentPackage.PLACEHOLDER_BUTTON__SIZES:
				return getSizes();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ContentPackage.PLACEHOLDER_BUTTON__VARIANT:
				setVariant((ButtonVariant)newValue);
				return;
			case ContentPackage.PLACEHOLDER_BUTTON__SIZES:
				getSizes().clear();
				getSizes().addAll((Collection<? extends ColumnSize>)newValue);
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
			case ContentPackage.PLACEHOLDER_BUTTON__VARIANT:
				unsetVariant();
				return;
			case ContentPackage.PLACEHOLDER_BUTTON__SIZES:
				getSizes().clear();
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
			case ContentPackage.PLACEHOLDER_BUTTON__VARIANT:
				return isSetVariant();
			case ContentPackage.PLACEHOLDER_BUTTON__SIZES:
				return !getSizes().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PlaceholderButtonImpl
