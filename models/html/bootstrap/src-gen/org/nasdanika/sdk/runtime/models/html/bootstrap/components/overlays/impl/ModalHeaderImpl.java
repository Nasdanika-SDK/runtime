/**
 */
package org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.impl;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.ModalHeader;
import org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.ModalTitle;
import org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.OverlaysPackage;

import org.nasdanika.sdk.runtime.models.html.bootstrap.impl.BootstrapElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Modal Header</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.impl.ModalHeaderImpl#isCloseButton <em>Close Button</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.impl.ModalHeaderImpl#getTitle <em>Title</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModalHeaderImpl extends BootstrapElementImpl implements ModalHeader {
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
	protected ModalHeaderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OverlaysPackage.Literals.MODAL_HEADER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCloseButton() {
		return (Boolean)eDynamicGet(OverlaysPackage.MODAL_HEADER__CLOSE_BUTTON, OverlaysPackage.Literals.MODAL_HEADER__CLOSE_BUTTON, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCloseButton(boolean newCloseButton) {
		eDynamicSet(OverlaysPackage.MODAL_HEADER__CLOSE_BUTTON, OverlaysPackage.Literals.MODAL_HEADER__CLOSE_BUTTON, newCloseButton);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModalTitle getTitle() {
		return (ModalTitle)eDynamicGet(OverlaysPackage.MODAL_HEADER__TITLE, OverlaysPackage.Literals.MODAL_HEADER__TITLE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTitle(ModalTitle newTitle, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newTitle, OverlaysPackage.MODAL_HEADER__TITLE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitle(ModalTitle newTitle) {
		eDynamicSet(OverlaysPackage.MODAL_HEADER__TITLE, OverlaysPackage.Literals.MODAL_HEADER__TITLE, newTitle);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OverlaysPackage.MODAL_HEADER__TITLE:
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
			case OverlaysPackage.MODAL_HEADER__CLOSE_BUTTON:
				return isCloseButton();
			case OverlaysPackage.MODAL_HEADER__TITLE:
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
			case OverlaysPackage.MODAL_HEADER__CLOSE_BUTTON:
				setCloseButton((Boolean)newValue);
				return;
			case OverlaysPackage.MODAL_HEADER__TITLE:
				setTitle((ModalTitle)newValue);
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
			case OverlaysPackage.MODAL_HEADER__CLOSE_BUTTON:
				setCloseButton(CLOSE_BUTTON_EDEFAULT);
				return;
			case OverlaysPackage.MODAL_HEADER__TITLE:
				setTitle((ModalTitle)null);
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
			case OverlaysPackage.MODAL_HEADER__CLOSE_BUTTON:
				return isCloseButton() != CLOSE_BUTTON_EDEFAULT;
			case OverlaysPackage.MODAL_HEADER__TITLE:
				return getTitle() != null;
		}
		return super.eIsSet(featureID);
	}

} //ModalHeaderImpl
