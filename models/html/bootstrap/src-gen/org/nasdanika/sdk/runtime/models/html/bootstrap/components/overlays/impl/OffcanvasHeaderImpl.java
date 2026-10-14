/**
 */
package org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.impl;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.OffcanvasHeader;
import org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.OffcanvasTitle;
import org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.OverlaysPackage;

import org.nasdanika.sdk.runtime.models.html.bootstrap.impl.BootstrapElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Offcanvas Header</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.impl.OffcanvasHeaderImpl#isCloseButton <em>Close Button</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.impl.OffcanvasHeaderImpl#getTitle <em>Title</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OffcanvasHeaderImpl extends BootstrapElementImpl implements OffcanvasHeader {
	/**
	 * The default value of the '{@link #isCloseButton() <em>Close Button</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCloseButton()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CLOSE_BUTTON_EDEFAULT = false;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OffcanvasHeaderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OverlaysPackage.Literals.OFFCANVAS_HEADER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCloseButton() {
		return (Boolean)eDynamicGet(OverlaysPackage.OFFCANVAS_HEADER__CLOSE_BUTTON, OverlaysPackage.Literals.OFFCANVAS_HEADER__CLOSE_BUTTON, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCloseButton(boolean newCloseButton) {
		eDynamicSet(OverlaysPackage.OFFCANVAS_HEADER__CLOSE_BUTTON, OverlaysPackage.Literals.OFFCANVAS_HEADER__CLOSE_BUTTON, newCloseButton);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OffcanvasTitle getTitle() {
		return (OffcanvasTitle)eDynamicGet(OverlaysPackage.OFFCANVAS_HEADER__TITLE, OverlaysPackage.Literals.OFFCANVAS_HEADER__TITLE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTitle(OffcanvasTitle newTitle, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newTitle, OverlaysPackage.OFFCANVAS_HEADER__TITLE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitle(OffcanvasTitle newTitle) {
		eDynamicSet(OverlaysPackage.OFFCANVAS_HEADER__TITLE, OverlaysPackage.Literals.OFFCANVAS_HEADER__TITLE, newTitle);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OverlaysPackage.OFFCANVAS_HEADER__TITLE:
				return basicSetTitle(null, msgs);
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
			case OverlaysPackage.OFFCANVAS_HEADER__CLOSE_BUTTON:
				return isCloseButton();
			case OverlaysPackage.OFFCANVAS_HEADER__TITLE:
				return getTitle();
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
			case OverlaysPackage.OFFCANVAS_HEADER__CLOSE_BUTTON:
				setCloseButton((Boolean)newValue);
				return;
			case OverlaysPackage.OFFCANVAS_HEADER__TITLE:
				setTitle((OffcanvasTitle)newValue);
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
			case OverlaysPackage.OFFCANVAS_HEADER__CLOSE_BUTTON:
				setCloseButton(CLOSE_BUTTON_EDEFAULT);
				return;
			case OverlaysPackage.OFFCANVAS_HEADER__TITLE:
				setTitle((OffcanvasTitle)null);
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
			case OverlaysPackage.OFFCANVAS_HEADER__CLOSE_BUTTON:
				return isCloseButton() != CLOSE_BUTTON_EDEFAULT;
			case OverlaysPackage.OFFCANVAS_HEADER__TITLE:
				return getTitle() != null;
		}
		return super.eIsSet(featureID);
	}

} //OffcanvasHeaderImpl
