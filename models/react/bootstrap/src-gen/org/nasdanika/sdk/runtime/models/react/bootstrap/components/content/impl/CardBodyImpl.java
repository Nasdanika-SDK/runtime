/**
 */
package org.nasdanika.sdk.runtime.models.react.bootstrap.components.content.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.sdk.runtime.models.react.bootstrap.components.content.CardBody;
import org.nasdanika.sdk.runtime.models.react.bootstrap.components.content.CardLink;
import org.nasdanika.sdk.runtime.models.react.bootstrap.components.content.CardSubtitle;
import org.nasdanika.sdk.runtime.models.react.bootstrap.components.content.CardText;
import org.nasdanika.sdk.runtime.models.react.bootstrap.components.content.CardTitle;
import org.nasdanika.sdk.runtime.models.react.bootstrap.components.content.ContentPackage;

import org.nasdanika.sdk.runtime.models.react.bootstrap.impl.BootstrapComponentImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Card Body</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.content.impl.CardBodyImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.content.impl.CardBodyImpl#getSubtitle <em>Subtitle</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.content.impl.CardBodyImpl#getTexts <em>Texts</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.content.impl.CardBodyImpl#getLinks <em>Links</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CardBodyImpl extends BootstrapComponentImpl implements CardBody {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CardBodyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ContentPackage.Literals.CARD_BODY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CardTitle getTitle() {
		return (CardTitle)eDynamicGet(ContentPackage.CARD_BODY__TITLE, ContentPackage.Literals.CARD_BODY__TITLE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTitle(CardTitle newTitle, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newTitle, ContentPackage.CARD_BODY__TITLE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitle(CardTitle newTitle) {
		eDynamicSet(ContentPackage.CARD_BODY__TITLE, ContentPackage.Literals.CARD_BODY__TITLE, newTitle);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CardSubtitle getSubtitle() {
		return (CardSubtitle)eDynamicGet(ContentPackage.CARD_BODY__SUBTITLE, ContentPackage.Literals.CARD_BODY__SUBTITLE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubtitle(CardSubtitle newSubtitle, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newSubtitle, ContentPackage.CARD_BODY__SUBTITLE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubtitle(CardSubtitle newSubtitle) {
		eDynamicSet(ContentPackage.CARD_BODY__SUBTITLE, ContentPackage.Literals.CARD_BODY__SUBTITLE, newSubtitle);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<CardText> getTexts() {
		return (EList<CardText>)eDynamicGet(ContentPackage.CARD_BODY__TEXTS, ContentPackage.Literals.CARD_BODY__TEXTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<CardLink> getLinks() {
		return (EList<CardLink>)eDynamicGet(ContentPackage.CARD_BODY__LINKS, ContentPackage.Literals.CARD_BODY__LINKS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ContentPackage.CARD_BODY__TITLE:
				return basicSetTitle(null, msgs);
			case ContentPackage.CARD_BODY__SUBTITLE:
				return basicSetSubtitle(null, msgs);
			case ContentPackage.CARD_BODY__TEXTS:
				return ((InternalEList<?>)getTexts()).basicRemove(otherEnd, msgs);
			case ContentPackage.CARD_BODY__LINKS:
				return ((InternalEList<?>)getLinks()).basicRemove(otherEnd, msgs);
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
			case ContentPackage.CARD_BODY__TITLE:
				return getTitle();
			case ContentPackage.CARD_BODY__SUBTITLE:
				return getSubtitle();
			case ContentPackage.CARD_BODY__TEXTS:
				return getTexts();
			case ContentPackage.CARD_BODY__LINKS:
				return getLinks();
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
			case ContentPackage.CARD_BODY__TITLE:
				setTitle((CardTitle)newValue);
				return;
			case ContentPackage.CARD_BODY__SUBTITLE:
				setSubtitle((CardSubtitle)newValue);
				return;
			case ContentPackage.CARD_BODY__TEXTS:
				getTexts().clear();
				getTexts().addAll((Collection<? extends CardText>)newValue);
				return;
			case ContentPackage.CARD_BODY__LINKS:
				getLinks().clear();
				getLinks().addAll((Collection<? extends CardLink>)newValue);
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
			case ContentPackage.CARD_BODY__TITLE:
				setTitle((CardTitle)null);
				return;
			case ContentPackage.CARD_BODY__SUBTITLE:
				setSubtitle((CardSubtitle)null);
				return;
			case ContentPackage.CARD_BODY__TEXTS:
				getTexts().clear();
				return;
			case ContentPackage.CARD_BODY__LINKS:
				getLinks().clear();
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
			case ContentPackage.CARD_BODY__TITLE:
				return getTitle() != null;
			case ContentPackage.CARD_BODY__SUBTITLE:
				return getSubtitle() != null;
			case ContentPackage.CARD_BODY__TEXTS:
				return !getTexts().isEmpty();
			case ContentPackage.CARD_BODY__LINKS:
				return !getLinks().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CardBodyImpl
