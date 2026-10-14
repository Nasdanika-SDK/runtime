/**
 */
package org.nasdanika.sdk.runtime.models.react.bootstrap.components.content.impl;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.sdk.runtime.models.react.bootstrap.BootstrapPackage;
import org.nasdanika.sdk.runtime.models.react.bootstrap.ButtonVariant;
import org.nasdanika.sdk.runtime.models.react.bootstrap.Size;
import org.nasdanika.sdk.runtime.models.react.bootstrap.TextContent;

import org.nasdanika.sdk.runtime.models.react.bootstrap.components.content.Button;
import org.nasdanika.sdk.runtime.models.react.bootstrap.components.content.ButtonType;
import org.nasdanika.sdk.runtime.models.react.bootstrap.components.content.ContentPackage;

import org.nasdanika.sdk.runtime.models.react.bootstrap.impl.BootstrapComponentImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Button</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.content.impl.ButtonImpl#getContent <em>Content</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.content.impl.ButtonImpl#getVariant <em>Variant</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.content.impl.ButtonImpl#getSize <em>Size</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.content.impl.ButtonImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.content.impl.ButtonImpl#isActive <em>Active</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.content.impl.ButtonImpl#isDisabled <em>Disabled</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.content.impl.ButtonImpl#getHref <em>Href</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ButtonImpl extends BootstrapComponentImpl implements Button {
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
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final ButtonType TYPE_EDEFAULT = ButtonType.BUTTON;

	/**
	 * The default value of the '{@link #isActive() <em>Active</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isActive()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ACTIVE_EDEFAULT = false;

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
	 * The default value of the '{@link #getHref() <em>Href</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHref()
	 * @generated
	 * @ordered
	 */
	protected static final String HREF_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ButtonImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ContentPackage.Literals.BUTTON;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getContent() {
		return (String)eDynamicGet(ContentPackage.BUTTON__CONTENT, BootstrapPackage.Literals.TEXT_CONTENT__CONTENT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContent(String newContent) {
		eDynamicSet(ContentPackage.BUTTON__CONTENT, BootstrapPackage.Literals.TEXT_CONTENT__CONTENT, newContent);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ButtonVariant getVariant() {
		return (ButtonVariant)eDynamicGet(ContentPackage.BUTTON__VARIANT, ContentPackage.Literals.BUTTON__VARIANT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVariant(ButtonVariant newVariant) {
		eDynamicSet(ContentPackage.BUTTON__VARIANT, ContentPackage.Literals.BUTTON__VARIANT, newVariant);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetVariant() {
		eDynamicUnset(ContentPackage.BUTTON__VARIANT, ContentPackage.Literals.BUTTON__VARIANT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetVariant() {
		return eDynamicIsSet(ContentPackage.BUTTON__VARIANT, ContentPackage.Literals.BUTTON__VARIANT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Size getSize() {
		return (Size)eDynamicGet(ContentPackage.BUTTON__SIZE, ContentPackage.Literals.BUTTON__SIZE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSize(Size newSize) {
		eDynamicSet(ContentPackage.BUTTON__SIZE, ContentPackage.Literals.BUTTON__SIZE, newSize);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSize() {
		eDynamicUnset(ContentPackage.BUTTON__SIZE, ContentPackage.Literals.BUTTON__SIZE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSize() {
		return eDynamicIsSet(ContentPackage.BUTTON__SIZE, ContentPackage.Literals.BUTTON__SIZE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ButtonType getType() {
		return (ButtonType)eDynamicGet(ContentPackage.BUTTON__TYPE, ContentPackage.Literals.BUTTON__TYPE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(ButtonType newType) {
		eDynamicSet(ContentPackage.BUTTON__TYPE, ContentPackage.Literals.BUTTON__TYPE, newType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetType() {
		eDynamicUnset(ContentPackage.BUTTON__TYPE, ContentPackage.Literals.BUTTON__TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetType() {
		return eDynamicIsSet(ContentPackage.BUTTON__TYPE, ContentPackage.Literals.BUTTON__TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isActive() {
		return (Boolean)eDynamicGet(ContentPackage.BUTTON__ACTIVE, ContentPackage.Literals.BUTTON__ACTIVE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActive(boolean newActive) {
		eDynamicSet(ContentPackage.BUTTON__ACTIVE, ContentPackage.Literals.BUTTON__ACTIVE, newActive);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDisabled() {
		return (Boolean)eDynamicGet(ContentPackage.BUTTON__DISABLED, ContentPackage.Literals.BUTTON__DISABLED, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisabled(boolean newDisabled) {
		eDynamicSet(ContentPackage.BUTTON__DISABLED, ContentPackage.Literals.BUTTON__DISABLED, newDisabled);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHref() {
		return (String)eDynamicGet(ContentPackage.BUTTON__HREF, ContentPackage.Literals.BUTTON__HREF, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHref(String newHref) {
		eDynamicSet(ContentPackage.BUTTON__HREF, ContentPackage.Literals.BUTTON__HREF, newHref);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ContentPackage.BUTTON__CONTENT:
				return getContent();
			case ContentPackage.BUTTON__VARIANT:
				return getVariant();
			case ContentPackage.BUTTON__SIZE:
				return getSize();
			case ContentPackage.BUTTON__TYPE:
				return getType();
			case ContentPackage.BUTTON__ACTIVE:
				return isActive();
			case ContentPackage.BUTTON__DISABLED:
				return isDisabled();
			case ContentPackage.BUTTON__HREF:
				return getHref();
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
			case ContentPackage.BUTTON__CONTENT:
				setContent((String)newValue);
				return;
			case ContentPackage.BUTTON__VARIANT:
				setVariant((ButtonVariant)newValue);
				return;
			case ContentPackage.BUTTON__SIZE:
				setSize((Size)newValue);
				return;
			case ContentPackage.BUTTON__TYPE:
				setType((ButtonType)newValue);
				return;
			case ContentPackage.BUTTON__ACTIVE:
				setActive((Boolean)newValue);
				return;
			case ContentPackage.BUTTON__DISABLED:
				setDisabled((Boolean)newValue);
				return;
			case ContentPackage.BUTTON__HREF:
				setHref((String)newValue);
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
			case ContentPackage.BUTTON__CONTENT:
				setContent(CONTENT_EDEFAULT);
				return;
			case ContentPackage.BUTTON__VARIANT:
				unsetVariant();
				return;
			case ContentPackage.BUTTON__SIZE:
				unsetSize();
				return;
			case ContentPackage.BUTTON__TYPE:
				unsetType();
				return;
			case ContentPackage.BUTTON__ACTIVE:
				setActive(ACTIVE_EDEFAULT);
				return;
			case ContentPackage.BUTTON__DISABLED:
				setDisabled(DISABLED_EDEFAULT);
				return;
			case ContentPackage.BUTTON__HREF:
				setHref(HREF_EDEFAULT);
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
			case ContentPackage.BUTTON__CONTENT:
				return CONTENT_EDEFAULT == null ? getContent() != null : !CONTENT_EDEFAULT.equals(getContent());
			case ContentPackage.BUTTON__VARIANT:
				return isSetVariant();
			case ContentPackage.BUTTON__SIZE:
				return isSetSize();
			case ContentPackage.BUTTON__TYPE:
				return isSetType();
			case ContentPackage.BUTTON__ACTIVE:
				return isActive() != ACTIVE_EDEFAULT;
			case ContentPackage.BUTTON__DISABLED:
				return isDisabled() != DISABLED_EDEFAULT;
			case ContentPackage.BUTTON__HREF:
				return HREF_EDEFAULT == null ? getHref() != null : !HREF_EDEFAULT.equals(getHref());
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
				case ContentPackage.BUTTON__CONTENT: return BootstrapPackage.TEXT_CONTENT__CONTENT;
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
				case BootstrapPackage.TEXT_CONTENT__CONTENT: return ContentPackage.BUTTON__CONTENT;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //ButtonImpl
