/**
 */
package org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.impl;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.CardImage;
import org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.CardImageVariant;
import org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.ContentPackage;

import org.nasdanika.sdk.runtime.models.html.bootstrap.impl.BootstrapElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Card Image</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.impl.CardImageImpl#getVariant <em>Variant</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.impl.CardImageImpl#getSrc <em>Src</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.impl.CardImageImpl#getAlt <em>Alt</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CardImageImpl extends BootstrapElementImpl implements CardImage {
	/**
	 * The default value of the '{@link #getVariant() <em>Variant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariant()
	 * @generated
	 * @ordered
	 */
	protected static final CardImageVariant VARIANT_EDEFAULT = CardImageVariant.TOP;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CardImageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ContentPackage.Literals.CARD_IMAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CardImageVariant getVariant() {
		return (CardImageVariant)eDynamicGet(ContentPackage.CARD_IMAGE__VARIANT, ContentPackage.Literals.CARD_IMAGE__VARIANT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVariant(CardImageVariant newVariant) {
		eDynamicSet(ContentPackage.CARD_IMAGE__VARIANT, ContentPackage.Literals.CARD_IMAGE__VARIANT, newVariant);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetVariant() {
		eDynamicUnset(ContentPackage.CARD_IMAGE__VARIANT, ContentPackage.Literals.CARD_IMAGE__VARIANT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetVariant() {
		return eDynamicIsSet(ContentPackage.CARD_IMAGE__VARIANT, ContentPackage.Literals.CARD_IMAGE__VARIANT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSrc() {
		return (String)eDynamicGet(ContentPackage.CARD_IMAGE__SRC, ContentPackage.Literals.CARD_IMAGE__SRC, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSrc(String newSrc) {
		eDynamicSet(ContentPackage.CARD_IMAGE__SRC, ContentPackage.Literals.CARD_IMAGE__SRC, newSrc);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAlt() {
		return (String)eDynamicGet(ContentPackage.CARD_IMAGE__ALT, ContentPackage.Literals.CARD_IMAGE__ALT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlt(String newAlt) {
		eDynamicSet(ContentPackage.CARD_IMAGE__ALT, ContentPackage.Literals.CARD_IMAGE__ALT, newAlt);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ContentPackage.CARD_IMAGE__VARIANT:
				return getVariant();
			case ContentPackage.CARD_IMAGE__SRC:
				return getSrc();
			case ContentPackage.CARD_IMAGE__ALT:
				return getAlt();
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
			case ContentPackage.CARD_IMAGE__VARIANT:
				setVariant((CardImageVariant)newValue);
				return;
			case ContentPackage.CARD_IMAGE__SRC:
				setSrc((String)newValue);
				return;
			case ContentPackage.CARD_IMAGE__ALT:
				setAlt((String)newValue);
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
			case ContentPackage.CARD_IMAGE__VARIANT:
				unsetVariant();
				return;
			case ContentPackage.CARD_IMAGE__SRC:
				setSrc(SRC_EDEFAULT);
				return;
			case ContentPackage.CARD_IMAGE__ALT:
				setAlt(ALT_EDEFAULT);
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
			case ContentPackage.CARD_IMAGE__VARIANT:
				return isSetVariant();
			case ContentPackage.CARD_IMAGE__SRC:
				return SRC_EDEFAULT == null ? getSrc() != null : !SRC_EDEFAULT.equals(getSrc());
			case ContentPackage.CARD_IMAGE__ALT:
				return ALT_EDEFAULT == null ? getAlt() != null : !ALT_EDEFAULT.equals(getAlt());
		}
		return super.eIsSet(featureID);
	}

} //CardImageImpl
