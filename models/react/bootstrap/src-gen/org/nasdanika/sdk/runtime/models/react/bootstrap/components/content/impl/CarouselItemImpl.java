/**
 */
package org.nasdanika.sdk.runtime.models.react.bootstrap.components.content.impl;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.nasdanika.sdk.runtime.models.react.JsxNode;

import org.nasdanika.sdk.runtime.models.react.bootstrap.components.content.CarouselCaption;
import org.nasdanika.sdk.runtime.models.react.bootstrap.components.content.CarouselItem;
import org.nasdanika.sdk.runtime.models.react.bootstrap.components.content.ContentPackage;

import org.nasdanika.sdk.runtime.models.react.bootstrap.impl.BootstrapComponentImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Carousel Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.content.impl.CarouselItemImpl#getInterval <em>Interval</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.content.impl.CarouselItemImpl#getContent <em>Content</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.content.impl.CarouselItemImpl#getCaption <em>Caption</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CarouselItemImpl extends BootstrapComponentImpl implements CarouselItem {
	/**
	 * The default value of the '{@link #getInterval() <em>Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterval()
	 * @generated
	 * @ordered
	 */
	protected static final int INTERVAL_EDEFAULT = 0;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CarouselItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ContentPackage.Literals.CAROUSEL_ITEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getInterval() {
		return (Integer)eDynamicGet(ContentPackage.CAROUSEL_ITEM__INTERVAL, ContentPackage.Literals.CAROUSEL_ITEM__INTERVAL, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInterval(int newInterval) {
		eDynamicSet(ContentPackage.CAROUSEL_ITEM__INTERVAL, ContentPackage.Literals.CAROUSEL_ITEM__INTERVAL, newInterval);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetInterval() {
		eDynamicUnset(ContentPackage.CAROUSEL_ITEM__INTERVAL, ContentPackage.Literals.CAROUSEL_ITEM__INTERVAL);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetInterval() {
		return eDynamicIsSet(ContentPackage.CAROUSEL_ITEM__INTERVAL, ContentPackage.Literals.CAROUSEL_ITEM__INTERVAL);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JsxNode getContent() {
		return (JsxNode)eDynamicGet(ContentPackage.CAROUSEL_ITEM__CONTENT, ContentPackage.Literals.CAROUSEL_ITEM__CONTENT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContent(JsxNode newContent, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newContent, ContentPackage.CAROUSEL_ITEM__CONTENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContent(JsxNode newContent) {
		eDynamicSet(ContentPackage.CAROUSEL_ITEM__CONTENT, ContentPackage.Literals.CAROUSEL_ITEM__CONTENT, newContent);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CarouselCaption getCaption() {
		return (CarouselCaption)eDynamicGet(ContentPackage.CAROUSEL_ITEM__CAPTION, ContentPackage.Literals.CAROUSEL_ITEM__CAPTION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCaption(CarouselCaption newCaption, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newCaption, ContentPackage.CAROUSEL_ITEM__CAPTION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCaption(CarouselCaption newCaption) {
		eDynamicSet(ContentPackage.CAROUSEL_ITEM__CAPTION, ContentPackage.Literals.CAROUSEL_ITEM__CAPTION, newCaption);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ContentPackage.CAROUSEL_ITEM__CONTENT:
				return basicSetContent(null, msgs);
			case ContentPackage.CAROUSEL_ITEM__CAPTION:
				return basicSetCaption(null, msgs);
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
			case ContentPackage.CAROUSEL_ITEM__INTERVAL:
				return getInterval();
			case ContentPackage.CAROUSEL_ITEM__CONTENT:
				return getContent();
			case ContentPackage.CAROUSEL_ITEM__CAPTION:
				return getCaption();
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
			case ContentPackage.CAROUSEL_ITEM__INTERVAL:
				setInterval((Integer)newValue);
				return;
			case ContentPackage.CAROUSEL_ITEM__CONTENT:
				setContent((JsxNode)newValue);
				return;
			case ContentPackage.CAROUSEL_ITEM__CAPTION:
				setCaption((CarouselCaption)newValue);
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
			case ContentPackage.CAROUSEL_ITEM__INTERVAL:
				unsetInterval();
				return;
			case ContentPackage.CAROUSEL_ITEM__CONTENT:
				setContent((JsxNode)null);
				return;
			case ContentPackage.CAROUSEL_ITEM__CAPTION:
				setCaption((CarouselCaption)null);
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
			case ContentPackage.CAROUSEL_ITEM__INTERVAL:
				return isSetInterval();
			case ContentPackage.CAROUSEL_ITEM__CONTENT:
				return getContent() != null;
			case ContentPackage.CAROUSEL_ITEM__CAPTION:
				return getCaption() != null;
		}
		return super.eIsSet(featureID);
	}

} //CarouselItemImpl
