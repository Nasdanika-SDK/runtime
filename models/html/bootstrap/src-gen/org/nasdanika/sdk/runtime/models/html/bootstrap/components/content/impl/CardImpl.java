/**
 */
package org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.sdk.runtime.models.html.bootstrap.Variant;

import org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.Card;
import org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.CardBody;
import org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.CardFooter;
import org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.CardHeader;
import org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.CardImage;
import org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.ContentPackage;

import org.nasdanika.sdk.runtime.models.html.bootstrap.impl.BootstrapElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Card</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.impl.CardImpl#getBg <em>Bg</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.impl.CardImpl#getTextColor <em>Text Color</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.impl.CardImpl#getBorder <em>Border</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.impl.CardImpl#getHeader <em>Header</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.impl.CardImpl#getImage <em>Image</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.impl.CardImpl#getBodies <em>Bodies</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.impl.CardImpl#getFooter <em>Footer</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CardImpl extends BootstrapElementImpl implements Card {
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
	 * The default value of the '{@link #getTextColor() <em>Text Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextColor()
	 * @generated
	 * @ordered
	 */
	protected static final Variant TEXT_COLOR_EDEFAULT = Variant.PRIMARY;

	/**
	 * The default value of the '{@link #getBorder() <em>Border</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBorder()
	 * @generated
	 * @ordered
	 */
	protected static final Variant BORDER_EDEFAULT = Variant.PRIMARY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CardImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ContentPackage.Literals.CARD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variant getBg() {
		return (Variant)eDynamicGet(ContentPackage.CARD__BG, ContentPackage.Literals.CARD__BG, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBg(Variant newBg) {
		eDynamicSet(ContentPackage.CARD__BG, ContentPackage.Literals.CARD__BG, newBg);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetBg() {
		eDynamicUnset(ContentPackage.CARD__BG, ContentPackage.Literals.CARD__BG);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetBg() {
		return eDynamicIsSet(ContentPackage.CARD__BG, ContentPackage.Literals.CARD__BG);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variant getTextColor() {
		return (Variant)eDynamicGet(ContentPackage.CARD__TEXT_COLOR, ContentPackage.Literals.CARD__TEXT_COLOR, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTextColor(Variant newTextColor) {
		eDynamicSet(ContentPackage.CARD__TEXT_COLOR, ContentPackage.Literals.CARD__TEXT_COLOR, newTextColor);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTextColor() {
		eDynamicUnset(ContentPackage.CARD__TEXT_COLOR, ContentPackage.Literals.CARD__TEXT_COLOR);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTextColor() {
		return eDynamicIsSet(ContentPackage.CARD__TEXT_COLOR, ContentPackage.Literals.CARD__TEXT_COLOR);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variant getBorder() {
		return (Variant)eDynamicGet(ContentPackage.CARD__BORDER, ContentPackage.Literals.CARD__BORDER, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBorder(Variant newBorder) {
		eDynamicSet(ContentPackage.CARD__BORDER, ContentPackage.Literals.CARD__BORDER, newBorder);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetBorder() {
		eDynamicUnset(ContentPackage.CARD__BORDER, ContentPackage.Literals.CARD__BORDER);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetBorder() {
		return eDynamicIsSet(ContentPackage.CARD__BORDER, ContentPackage.Literals.CARD__BORDER);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CardHeader getHeader() {
		return (CardHeader)eDynamicGet(ContentPackage.CARD__HEADER, ContentPackage.Literals.CARD__HEADER, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHeader(CardHeader newHeader, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newHeader, ContentPackage.CARD__HEADER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeader(CardHeader newHeader) {
		eDynamicSet(ContentPackage.CARD__HEADER, ContentPackage.Literals.CARD__HEADER, newHeader);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CardImage getImage() {
		return (CardImage)eDynamicGet(ContentPackage.CARD__IMAGE, ContentPackage.Literals.CARD__IMAGE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImage(CardImage newImage, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newImage, ContentPackage.CARD__IMAGE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImage(CardImage newImage) {
		eDynamicSet(ContentPackage.CARD__IMAGE, ContentPackage.Literals.CARD__IMAGE, newImage);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<CardBody> getBodies() {
		return (EList<CardBody>)eDynamicGet(ContentPackage.CARD__BODIES, ContentPackage.Literals.CARD__BODIES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CardFooter getFooter() {
		return (CardFooter)eDynamicGet(ContentPackage.CARD__FOOTER, ContentPackage.Literals.CARD__FOOTER, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFooter(CardFooter newFooter, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newFooter, ContentPackage.CARD__FOOTER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFooter(CardFooter newFooter) {
		eDynamicSet(ContentPackage.CARD__FOOTER, ContentPackage.Literals.CARD__FOOTER, newFooter);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ContentPackage.CARD__HEADER:
				return basicSetHeader(null, msgs);
			case ContentPackage.CARD__IMAGE:
				return basicSetImage(null, msgs);
			case ContentPackage.CARD__BODIES:
				return ((InternalEList<?>)getBodies()).basicRemove(otherEnd, msgs);
			case ContentPackage.CARD__FOOTER:
				return basicSetFooter(null, msgs);
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
			case ContentPackage.CARD__BG:
				return getBg();
			case ContentPackage.CARD__TEXT_COLOR:
				return getTextColor();
			case ContentPackage.CARD__BORDER:
				return getBorder();
			case ContentPackage.CARD__HEADER:
				return getHeader();
			case ContentPackage.CARD__IMAGE:
				return getImage();
			case ContentPackage.CARD__BODIES:
				return getBodies();
			case ContentPackage.CARD__FOOTER:
				return getFooter();
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
			case ContentPackage.CARD__BG:
				setBg((Variant)newValue);
				return;
			case ContentPackage.CARD__TEXT_COLOR:
				setTextColor((Variant)newValue);
				return;
			case ContentPackage.CARD__BORDER:
				setBorder((Variant)newValue);
				return;
			case ContentPackage.CARD__HEADER:
				setHeader((CardHeader)newValue);
				return;
			case ContentPackage.CARD__IMAGE:
				setImage((CardImage)newValue);
				return;
			case ContentPackage.CARD__BODIES:
				getBodies().clear();
				getBodies().addAll((Collection<? extends CardBody>)newValue);
				return;
			case ContentPackage.CARD__FOOTER:
				setFooter((CardFooter)newValue);
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
			case ContentPackage.CARD__BG:
				unsetBg();
				return;
			case ContentPackage.CARD__TEXT_COLOR:
				unsetTextColor();
				return;
			case ContentPackage.CARD__BORDER:
				unsetBorder();
				return;
			case ContentPackage.CARD__HEADER:
				setHeader((CardHeader)null);
				return;
			case ContentPackage.CARD__IMAGE:
				setImage((CardImage)null);
				return;
			case ContentPackage.CARD__BODIES:
				getBodies().clear();
				return;
			case ContentPackage.CARD__FOOTER:
				setFooter((CardFooter)null);
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
			case ContentPackage.CARD__BG:
				return isSetBg();
			case ContentPackage.CARD__TEXT_COLOR:
				return isSetTextColor();
			case ContentPackage.CARD__BORDER:
				return isSetBorder();
			case ContentPackage.CARD__HEADER:
				return getHeader() != null;
			case ContentPackage.CARD__IMAGE:
				return getImage() != null;
			case ContentPackage.CARD__BODIES:
				return !getBodies().isEmpty();
			case ContentPackage.CARD__FOOTER:
				return getFooter() != null;
		}
		return super.eIsSet(featureID);
	}

} //CardImpl
