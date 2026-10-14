/**
 */
package org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.impl;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.sdk.runtime.models.react.bootstrap.BootstrapPackage;
import org.nasdanika.sdk.runtime.models.react.bootstrap.ButtonVariant;
import org.nasdanika.sdk.runtime.models.react.bootstrap.Size;
import org.nasdanika.sdk.runtime.models.react.bootstrap.TextContent;

import org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.DropdownToggle;
import org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.NavigationPackage;

import org.nasdanika.sdk.runtime.models.react.bootstrap.impl.BootstrapComponentImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dropdown Toggle</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.impl.DropdownToggleImpl#getContent <em>Content</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.impl.DropdownToggleImpl#getVariant <em>Variant</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.impl.DropdownToggleImpl#getSize <em>Size</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.impl.DropdownToggleImpl#isSplit <em>Split</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DropdownToggleImpl extends BootstrapComponentImpl implements DropdownToggle {
	/**
	 * The default value of the '{@link #getContent() <em>Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContent()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTENT_EDEFAULT = null;

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
	 * The default value of the '{@link #getSize() <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected static final Size SIZE_EDEFAULT = Size.SM;

	/**
	 * The default value of the '{@link #isSplit() <em>Split</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSplit()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SPLIT_EDEFAULT = false;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DropdownToggleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NavigationPackage.Literals.DROPDOWN_TOGGLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getContent() {
		return (String)eDynamicGet(NavigationPackage.DROPDOWN_TOGGLE__CONTENT, BootstrapPackage.Literals.TEXT_CONTENT__CONTENT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContent(String newContent) {
		eDynamicSet(NavigationPackage.DROPDOWN_TOGGLE__CONTENT, BootstrapPackage.Literals.TEXT_CONTENT__CONTENT, newContent);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ButtonVariant getVariant() {
		return (ButtonVariant)eDynamicGet(NavigationPackage.DROPDOWN_TOGGLE__VARIANT, NavigationPackage.Literals.DROPDOWN_TOGGLE__VARIANT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVariant(ButtonVariant newVariant) {
		eDynamicSet(NavigationPackage.DROPDOWN_TOGGLE__VARIANT, NavigationPackage.Literals.DROPDOWN_TOGGLE__VARIANT, newVariant);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetVariant() {
		eDynamicUnset(NavigationPackage.DROPDOWN_TOGGLE__VARIANT, NavigationPackage.Literals.DROPDOWN_TOGGLE__VARIANT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetVariant() {
		return eDynamicIsSet(NavigationPackage.DROPDOWN_TOGGLE__VARIANT, NavigationPackage.Literals.DROPDOWN_TOGGLE__VARIANT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Size getSize() {
		return (Size)eDynamicGet(NavigationPackage.DROPDOWN_TOGGLE__SIZE, NavigationPackage.Literals.DROPDOWN_TOGGLE__SIZE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSize(Size newSize) {
		eDynamicSet(NavigationPackage.DROPDOWN_TOGGLE__SIZE, NavigationPackage.Literals.DROPDOWN_TOGGLE__SIZE, newSize);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSize() {
		eDynamicUnset(NavigationPackage.DROPDOWN_TOGGLE__SIZE, NavigationPackage.Literals.DROPDOWN_TOGGLE__SIZE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSize() {
		return eDynamicIsSet(NavigationPackage.DROPDOWN_TOGGLE__SIZE, NavigationPackage.Literals.DROPDOWN_TOGGLE__SIZE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSplit() {
		return (Boolean)eDynamicGet(NavigationPackage.DROPDOWN_TOGGLE__SPLIT, NavigationPackage.Literals.DROPDOWN_TOGGLE__SPLIT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSplit(boolean newSplit) {
		eDynamicSet(NavigationPackage.DROPDOWN_TOGGLE__SPLIT, NavigationPackage.Literals.DROPDOWN_TOGGLE__SPLIT, newSplit);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case NavigationPackage.DROPDOWN_TOGGLE__CONTENT:
				return getContent();
			case NavigationPackage.DROPDOWN_TOGGLE__VARIANT:
				return getVariant();
			case NavigationPackage.DROPDOWN_TOGGLE__SIZE:
				return getSize();
			case NavigationPackage.DROPDOWN_TOGGLE__SPLIT:
				return isSplit();
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
			case NavigationPackage.DROPDOWN_TOGGLE__CONTENT:
				setContent((String)newValue);
				return;
			case NavigationPackage.DROPDOWN_TOGGLE__VARIANT:
				setVariant((ButtonVariant)newValue);
				return;
			case NavigationPackage.DROPDOWN_TOGGLE__SIZE:
				setSize((Size)newValue);
				return;
			case NavigationPackage.DROPDOWN_TOGGLE__SPLIT:
				setSplit((Boolean)newValue);
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
			case NavigationPackage.DROPDOWN_TOGGLE__CONTENT:
				setContent(CONTENT_EDEFAULT);
				return;
			case NavigationPackage.DROPDOWN_TOGGLE__VARIANT:
				unsetVariant();
				return;
			case NavigationPackage.DROPDOWN_TOGGLE__SIZE:
				unsetSize();
				return;
			case NavigationPackage.DROPDOWN_TOGGLE__SPLIT:
				setSplit(SPLIT_EDEFAULT);
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
			case NavigationPackage.DROPDOWN_TOGGLE__CONTENT:
				return CONTENT_EDEFAULT == null ? getContent() != null : !CONTENT_EDEFAULT.equals(getContent());
			case NavigationPackage.DROPDOWN_TOGGLE__VARIANT:
				return isSetVariant();
			case NavigationPackage.DROPDOWN_TOGGLE__SIZE:
				return isSetSize();
			case NavigationPackage.DROPDOWN_TOGGLE__SPLIT:
				return isSplit() != SPLIT_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == TextContent.class) {
			switch (derivedFeatureID) {
				case NavigationPackage.DROPDOWN_TOGGLE__CONTENT: return BootstrapPackage.TEXT_CONTENT__CONTENT;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == TextContent.class) {
			switch (baseFeatureID) {
				case BootstrapPackage.TEXT_CONTENT__CONTENT: return NavigationPackage.DROPDOWN_TOGGLE__CONTENT;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //DropdownToggleImpl
