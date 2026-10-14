/**
 */
package org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.impl;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.sdk.runtime.models.react.bootstrap.BootstrapPackage;
import org.nasdanika.sdk.runtime.models.react.bootstrap.TextContent;

import org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.DropdownEntry;
import org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.DropdownItem;
import org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.NavigationPackage;

import org.nasdanika.sdk.runtime.models.react.bootstrap.impl.BootstrapComponentImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dropdown Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.impl.DropdownItemImpl#getContent <em>Content</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.impl.DropdownItemImpl#getHref <em>Href</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.impl.DropdownItemImpl#getEventKey <em>Event Key</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.impl.DropdownItemImpl#isActive <em>Active</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.impl.DropdownItemImpl#isDisabled <em>Disabled</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DropdownItemImpl extends BootstrapComponentImpl implements DropdownItem {
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
	 * The default value of the '{@link #getHref() <em>Href</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHref()
	 * @generated
	 * @ordered
	 */
	protected static final String HREF_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getEventKey() <em>Event Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventKey()
	 * @generated
	 * @ordered
	 */
	protected static final String EVENT_KEY_EDEFAULT = null;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DropdownItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NavigationPackage.Literals.DROPDOWN_ITEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getContent() {
		return (String)eDynamicGet(NavigationPackage.DROPDOWN_ITEM__CONTENT, BootstrapPackage.Literals.TEXT_CONTENT__CONTENT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContent(String newContent) {
		eDynamicSet(NavigationPackage.DROPDOWN_ITEM__CONTENT, BootstrapPackage.Literals.TEXT_CONTENT__CONTENT, newContent);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHref() {
		return (String)eDynamicGet(NavigationPackage.DROPDOWN_ITEM__HREF, NavigationPackage.Literals.DROPDOWN_ITEM__HREF, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHref(String newHref) {
		eDynamicSet(NavigationPackage.DROPDOWN_ITEM__HREF, NavigationPackage.Literals.DROPDOWN_ITEM__HREF, newHref);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEventKey() {
		return (String)eDynamicGet(NavigationPackage.DROPDOWN_ITEM__EVENT_KEY, NavigationPackage.Literals.DROPDOWN_ITEM__EVENT_KEY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEventKey(String newEventKey) {
		eDynamicSet(NavigationPackage.DROPDOWN_ITEM__EVENT_KEY, NavigationPackage.Literals.DROPDOWN_ITEM__EVENT_KEY, newEventKey);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isActive() {
		return (Boolean)eDynamicGet(NavigationPackage.DROPDOWN_ITEM__ACTIVE, NavigationPackage.Literals.DROPDOWN_ITEM__ACTIVE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActive(boolean newActive) {
		eDynamicSet(NavigationPackage.DROPDOWN_ITEM__ACTIVE, NavigationPackage.Literals.DROPDOWN_ITEM__ACTIVE, newActive);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDisabled() {
		return (Boolean)eDynamicGet(NavigationPackage.DROPDOWN_ITEM__DISABLED, NavigationPackage.Literals.DROPDOWN_ITEM__DISABLED, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisabled(boolean newDisabled) {
		eDynamicSet(NavigationPackage.DROPDOWN_ITEM__DISABLED, NavigationPackage.Literals.DROPDOWN_ITEM__DISABLED, newDisabled);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case NavigationPackage.DROPDOWN_ITEM__CONTENT:
				return getContent();
			case NavigationPackage.DROPDOWN_ITEM__HREF:
				return getHref();
			case NavigationPackage.DROPDOWN_ITEM__EVENT_KEY:
				return getEventKey();
			case NavigationPackage.DROPDOWN_ITEM__ACTIVE:
				return isActive();
			case NavigationPackage.DROPDOWN_ITEM__DISABLED:
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
			case NavigationPackage.DROPDOWN_ITEM__CONTENT:
				setContent((String)newValue);
				return;
			case NavigationPackage.DROPDOWN_ITEM__HREF:
				setHref((String)newValue);
				return;
			case NavigationPackage.DROPDOWN_ITEM__EVENT_KEY:
				setEventKey((String)newValue);
				return;
			case NavigationPackage.DROPDOWN_ITEM__ACTIVE:
				setActive((Boolean)newValue);
				return;
			case NavigationPackage.DROPDOWN_ITEM__DISABLED:
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
			case NavigationPackage.DROPDOWN_ITEM__CONTENT:
				setContent(CONTENT_EDEFAULT);
				return;
			case NavigationPackage.DROPDOWN_ITEM__HREF:
				setHref(HREF_EDEFAULT);
				return;
			case NavigationPackage.DROPDOWN_ITEM__EVENT_KEY:
				setEventKey(EVENT_KEY_EDEFAULT);
				return;
			case NavigationPackage.DROPDOWN_ITEM__ACTIVE:
				setActive(ACTIVE_EDEFAULT);
				return;
			case NavigationPackage.DROPDOWN_ITEM__DISABLED:
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
			case NavigationPackage.DROPDOWN_ITEM__CONTENT:
				return CONTENT_EDEFAULT == null ? getContent() != null : !CONTENT_EDEFAULT.equals(getContent());
			case NavigationPackage.DROPDOWN_ITEM__HREF:
				return HREF_EDEFAULT == null ? getHref() != null : !HREF_EDEFAULT.equals(getHref());
			case NavigationPackage.DROPDOWN_ITEM__EVENT_KEY:
				return EVENT_KEY_EDEFAULT == null ? getEventKey() != null : !EVENT_KEY_EDEFAULT.equals(getEventKey());
			case NavigationPackage.DROPDOWN_ITEM__ACTIVE:
				return isActive() != ACTIVE_EDEFAULT;
			case NavigationPackage.DROPDOWN_ITEM__DISABLED:
				return isDisabled() != DISABLED_EDEFAULT;
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
				case NavigationPackage.DROPDOWN_ITEM__CONTENT: return BootstrapPackage.TEXT_CONTENT__CONTENT;
				default: return -1;
			}
		}
		if (baseClass == DropdownEntry.class) {
			switch (derivedFeatureID) {
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
				case BootstrapPackage.TEXT_CONTENT__CONTENT: return NavigationPackage.DROPDOWN_ITEM__CONTENT;
				default: return -1;
			}
		}
		if (baseClass == DropdownEntry.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //DropdownItemImpl
