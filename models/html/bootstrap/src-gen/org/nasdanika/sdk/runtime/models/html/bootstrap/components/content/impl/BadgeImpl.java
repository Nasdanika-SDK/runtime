/**
 */
package org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.impl;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.sdk.runtime.models.html.bootstrap.BootstrapPackage;
import org.nasdanika.sdk.runtime.models.html.bootstrap.TextContent;
import org.nasdanika.sdk.runtime.models.html.bootstrap.Variant;

import org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.Badge;
import org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.ContentPackage;

import org.nasdanika.sdk.runtime.models.html.bootstrap.impl.BootstrapElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Badge</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.impl.BadgeImpl#getContent <em>Content</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.impl.BadgeImpl#getBg <em>Bg</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.impl.BadgeImpl#isPill <em>Pill</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BadgeImpl extends BootstrapElementImpl implements Badge {
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
	 * The default value of the '{@link #getBg() <em>Bg</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBg()
	 * @generated
	 * @ordered
	 */
	protected static final Variant BG_EDEFAULT = Variant.PRIMARY;

	/**
	 * The default value of the '{@link #isPill() <em>Pill</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPill()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PILL_EDEFAULT = false;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BadgeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ContentPackage.Literals.BADGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getContent() {
		return (String)eDynamicGet(ContentPackage.BADGE__CONTENT, BootstrapPackage.Literals.TEXT_CONTENT__CONTENT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContent(String newContent) {
		eDynamicSet(ContentPackage.BADGE__CONTENT, BootstrapPackage.Literals.TEXT_CONTENT__CONTENT, newContent);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variant getBg() {
		return (Variant)eDynamicGet(ContentPackage.BADGE__BG, ContentPackage.Literals.BADGE__BG, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBg(Variant newBg) {
		eDynamicSet(ContentPackage.BADGE__BG, ContentPackage.Literals.BADGE__BG, newBg);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetBg() {
		eDynamicUnset(ContentPackage.BADGE__BG, ContentPackage.Literals.BADGE__BG);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetBg() {
		return eDynamicIsSet(ContentPackage.BADGE__BG, ContentPackage.Literals.BADGE__BG);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isPill() {
		return (Boolean)eDynamicGet(ContentPackage.BADGE__PILL, ContentPackage.Literals.BADGE__PILL, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPill(boolean newPill) {
		eDynamicSet(ContentPackage.BADGE__PILL, ContentPackage.Literals.BADGE__PILL, newPill);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ContentPackage.BADGE__CONTENT:
				return getContent();
			case ContentPackage.BADGE__BG:
				return getBg();
			case ContentPackage.BADGE__PILL:
				return isPill();
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
			case ContentPackage.BADGE__CONTENT:
				setContent((String)newValue);
				return;
			case ContentPackage.BADGE__BG:
				setBg((Variant)newValue);
				return;
			case ContentPackage.BADGE__PILL:
				setPill((Boolean)newValue);
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
			case ContentPackage.BADGE__CONTENT:
				setContent(CONTENT_EDEFAULT);
				return;
			case ContentPackage.BADGE__BG:
				unsetBg();
				return;
			case ContentPackage.BADGE__PILL:
				setPill(PILL_EDEFAULT);
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
			case ContentPackage.BADGE__CONTENT:
				return CONTENT_EDEFAULT == null ? getContent() != null : !CONTENT_EDEFAULT.equals(getContent());
			case ContentPackage.BADGE__BG:
				return isSetBg();
			case ContentPackage.BADGE__PILL:
				return isPill() != PILL_EDEFAULT;
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
				case ContentPackage.BADGE__CONTENT: return BootstrapPackage.TEXT_CONTENT__CONTENT;
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
				case BootstrapPackage.TEXT_CONTENT__CONTENT: return ContentPackage.BADGE__CONTENT;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //BadgeImpl
