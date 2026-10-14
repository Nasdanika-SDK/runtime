/**
 */
package org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.impl;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.AccordionBody;
import org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.AccordionHeader;
import org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.AccordionItem;
import org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.ContentPackage;

import org.nasdanika.sdk.runtime.models.html.bootstrap.impl.BootstrapElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Accordion Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.impl.AccordionItemImpl#getEventKey <em>Event Key</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.impl.AccordionItemImpl#getHeader <em>Header</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.impl.AccordionItemImpl#getBody <em>Body</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AccordionItemImpl extends BootstrapElementImpl implements AccordionItem {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AccordionItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ContentPackage.Literals.ACCORDION_ITEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEventKey() {
		return (String)eDynamicGet(ContentPackage.ACCORDION_ITEM__EVENT_KEY, ContentPackage.Literals.ACCORDION_ITEM__EVENT_KEY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEventKey(String newEventKey) {
		eDynamicSet(ContentPackage.ACCORDION_ITEM__EVENT_KEY, ContentPackage.Literals.ACCORDION_ITEM__EVENT_KEY, newEventKey);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccordionHeader getHeader() {
		return (AccordionHeader)eDynamicGet(ContentPackage.ACCORDION_ITEM__HEADER, ContentPackage.Literals.ACCORDION_ITEM__HEADER, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHeader(AccordionHeader newHeader, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newHeader, ContentPackage.ACCORDION_ITEM__HEADER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeader(AccordionHeader newHeader) {
		eDynamicSet(ContentPackage.ACCORDION_ITEM__HEADER, ContentPackage.Literals.ACCORDION_ITEM__HEADER, newHeader);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccordionBody getBody() {
		return (AccordionBody)eDynamicGet(ContentPackage.ACCORDION_ITEM__BODY, ContentPackage.Literals.ACCORDION_ITEM__BODY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBody(AccordionBody newBody, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newBody, ContentPackage.ACCORDION_ITEM__BODY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBody(AccordionBody newBody) {
		eDynamicSet(ContentPackage.ACCORDION_ITEM__BODY, ContentPackage.Literals.ACCORDION_ITEM__BODY, newBody);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ContentPackage.ACCORDION_ITEM__HEADER:
				return basicSetHeader(null, msgs);
			case ContentPackage.ACCORDION_ITEM__BODY:
				return basicSetBody(null, msgs);
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
			case ContentPackage.ACCORDION_ITEM__EVENT_KEY:
				return getEventKey();
			case ContentPackage.ACCORDION_ITEM__HEADER:
				return getHeader();
			case ContentPackage.ACCORDION_ITEM__BODY:
				return getBody();
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
			case ContentPackage.ACCORDION_ITEM__EVENT_KEY:
				setEventKey((String)newValue);
				return;
			case ContentPackage.ACCORDION_ITEM__HEADER:
				setHeader((AccordionHeader)newValue);
				return;
			case ContentPackage.ACCORDION_ITEM__BODY:
				setBody((AccordionBody)newValue);
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
			case ContentPackage.ACCORDION_ITEM__EVENT_KEY:
				setEventKey(EVENT_KEY_EDEFAULT);
				return;
			case ContentPackage.ACCORDION_ITEM__HEADER:
				setHeader((AccordionHeader)null);
				return;
			case ContentPackage.ACCORDION_ITEM__BODY:
				setBody((AccordionBody)null);
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
			case ContentPackage.ACCORDION_ITEM__EVENT_KEY:
				return EVENT_KEY_EDEFAULT == null ? getEventKey() != null : !EVENT_KEY_EDEFAULT.equals(getEventKey());
			case ContentPackage.ACCORDION_ITEM__HEADER:
				return getHeader() != null;
			case ContentPackage.ACCORDION_ITEM__BODY:
				return getBody() != null;
		}
		return super.eIsSet(featureID);
	}

} //AccordionItemImpl
