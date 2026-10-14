/**
 */
package org.nasdanika.sdk.runtime.models.react.bootstrap.components.content.impl;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.sdk.runtime.models.react.bootstrap.BootstrapPackage;
import org.nasdanika.sdk.runtime.models.react.bootstrap.TextContent;
import org.nasdanika.sdk.runtime.models.react.bootstrap.Variant;

import org.nasdanika.sdk.runtime.models.react.bootstrap.components.content.ContentPackage;
import org.nasdanika.sdk.runtime.models.react.bootstrap.components.content.ListGroupItem;

import org.nasdanika.sdk.runtime.models.react.bootstrap.impl.BootstrapComponentImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>List Group Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.content.impl.ListGroupItemImpl#getContent <em>Content</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.content.impl.ListGroupItemImpl#getVariant <em>Variant</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.content.impl.ListGroupItemImpl#isAction <em>Action</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.content.impl.ListGroupItemImpl#isActive <em>Active</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.content.impl.ListGroupItemImpl#isDisabled <em>Disabled</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.content.impl.ListGroupItemImpl#getHref <em>Href</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ListGroupItemImpl extends BootstrapComponentImpl implements ListGroupItem {
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
	protected static final Variant VARIANT_EDEFAULT = Variant.PRIMARY;

	/**
	 * The default value of the '{@link #isAction() <em>Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAction()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ACTION_EDEFAULT = false;

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
	protected ListGroupItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ContentPackage.Literals.LIST_GROUP_ITEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getContent() {
		return (String)eDynamicGet(ContentPackage.LIST_GROUP_ITEM__CONTENT, BootstrapPackage.Literals.TEXT_CONTENT__CONTENT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContent(String newContent) {
		eDynamicSet(ContentPackage.LIST_GROUP_ITEM__CONTENT, BootstrapPackage.Literals.TEXT_CONTENT__CONTENT, newContent);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variant getVariant() {
		return (Variant)eDynamicGet(ContentPackage.LIST_GROUP_ITEM__VARIANT, ContentPackage.Literals.LIST_GROUP_ITEM__VARIANT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVariant(Variant newVariant) {
		eDynamicSet(ContentPackage.LIST_GROUP_ITEM__VARIANT, ContentPackage.Literals.LIST_GROUP_ITEM__VARIANT, newVariant);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetVariant() {
		eDynamicUnset(ContentPackage.LIST_GROUP_ITEM__VARIANT, ContentPackage.Literals.LIST_GROUP_ITEM__VARIANT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetVariant() {
		return eDynamicIsSet(ContentPackage.LIST_GROUP_ITEM__VARIANT, ContentPackage.Literals.LIST_GROUP_ITEM__VARIANT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAction() {
		return (Boolean)eDynamicGet(ContentPackage.LIST_GROUP_ITEM__ACTION, ContentPackage.Literals.LIST_GROUP_ITEM__ACTION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAction(boolean newAction) {
		eDynamicSet(ContentPackage.LIST_GROUP_ITEM__ACTION, ContentPackage.Literals.LIST_GROUP_ITEM__ACTION, newAction);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isActive() {
		return (Boolean)eDynamicGet(ContentPackage.LIST_GROUP_ITEM__ACTIVE, ContentPackage.Literals.LIST_GROUP_ITEM__ACTIVE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActive(boolean newActive) {
		eDynamicSet(ContentPackage.LIST_GROUP_ITEM__ACTIVE, ContentPackage.Literals.LIST_GROUP_ITEM__ACTIVE, newActive);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDisabled() {
		return (Boolean)eDynamicGet(ContentPackage.LIST_GROUP_ITEM__DISABLED, ContentPackage.Literals.LIST_GROUP_ITEM__DISABLED, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisabled(boolean newDisabled) {
		eDynamicSet(ContentPackage.LIST_GROUP_ITEM__DISABLED, ContentPackage.Literals.LIST_GROUP_ITEM__DISABLED, newDisabled);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHref() {
		return (String)eDynamicGet(ContentPackage.LIST_GROUP_ITEM__HREF, ContentPackage.Literals.LIST_GROUP_ITEM__HREF, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHref(String newHref) {
		eDynamicSet(ContentPackage.LIST_GROUP_ITEM__HREF, ContentPackage.Literals.LIST_GROUP_ITEM__HREF, newHref);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ContentPackage.LIST_GROUP_ITEM__CONTENT:
				return getContent();
			case ContentPackage.LIST_GROUP_ITEM__VARIANT:
				return getVariant();
			case ContentPackage.LIST_GROUP_ITEM__ACTION:
				return isAction();
			case ContentPackage.LIST_GROUP_ITEM__ACTIVE:
				return isActive();
			case ContentPackage.LIST_GROUP_ITEM__DISABLED:
				return isDisabled();
			case ContentPackage.LIST_GROUP_ITEM__HREF:
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
			case ContentPackage.LIST_GROUP_ITEM__CONTENT:
				setContent((String)newValue);
				return;
			case ContentPackage.LIST_GROUP_ITEM__VARIANT:
				setVariant((Variant)newValue);
				return;
			case ContentPackage.LIST_GROUP_ITEM__ACTION:
				setAction((Boolean)newValue);
				return;
			case ContentPackage.LIST_GROUP_ITEM__ACTIVE:
				setActive((Boolean)newValue);
				return;
			case ContentPackage.LIST_GROUP_ITEM__DISABLED:
				setDisabled((Boolean)newValue);
				return;
			case ContentPackage.LIST_GROUP_ITEM__HREF:
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
			case ContentPackage.LIST_GROUP_ITEM__CONTENT:
				setContent(CONTENT_EDEFAULT);
				return;
			case ContentPackage.LIST_GROUP_ITEM__VARIANT:
				unsetVariant();
				return;
			case ContentPackage.LIST_GROUP_ITEM__ACTION:
				setAction(ACTION_EDEFAULT);
				return;
			case ContentPackage.LIST_GROUP_ITEM__ACTIVE:
				setActive(ACTIVE_EDEFAULT);
				return;
			case ContentPackage.LIST_GROUP_ITEM__DISABLED:
				setDisabled(DISABLED_EDEFAULT);
				return;
			case ContentPackage.LIST_GROUP_ITEM__HREF:
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
			case ContentPackage.LIST_GROUP_ITEM__CONTENT:
				return CONTENT_EDEFAULT == null ? getContent() != null : !CONTENT_EDEFAULT.equals(getContent());
			case ContentPackage.LIST_GROUP_ITEM__VARIANT:
				return isSetVariant();
			case ContentPackage.LIST_GROUP_ITEM__ACTION:
				return isAction() != ACTION_EDEFAULT;
			case ContentPackage.LIST_GROUP_ITEM__ACTIVE:
				return isActive() != ACTIVE_EDEFAULT;
			case ContentPackage.LIST_GROUP_ITEM__DISABLED:
				return isDisabled() != DISABLED_EDEFAULT;
			case ContentPackage.LIST_GROUP_ITEM__HREF:
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
				case ContentPackage.LIST_GROUP_ITEM__CONTENT: return BootstrapPackage.TEXT_CONTENT__CONTENT;
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
				case BootstrapPackage.TEXT_CONTENT__CONTENT: return ContentPackage.LIST_GROUP_ITEM__CONTENT;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //ListGroupItemImpl
