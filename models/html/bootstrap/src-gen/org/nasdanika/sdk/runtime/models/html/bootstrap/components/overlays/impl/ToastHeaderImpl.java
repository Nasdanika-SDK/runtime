/**
 */
package org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.sdk.runtime.models.html.Node;

import org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.OverlaysPackage;
import org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.ToastHeader;

import org.nasdanika.sdk.runtime.models.html.bootstrap.impl.BootstrapElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Toast Header</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.impl.ToastHeaderImpl#isCloseButton <em>Close Button</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.impl.ToastHeaderImpl#getContent <em>Content</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ToastHeaderImpl extends BootstrapElementImpl implements ToastHeader {
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
	protected ToastHeaderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OverlaysPackage.Literals.TOAST_HEADER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCloseButton() {
		return (Boolean)eDynamicGet(OverlaysPackage.TOAST_HEADER__CLOSE_BUTTON, OverlaysPackage.Literals.TOAST_HEADER__CLOSE_BUTTON, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCloseButton(boolean newCloseButton) {
		eDynamicSet(OverlaysPackage.TOAST_HEADER__CLOSE_BUTTON, OverlaysPackage.Literals.TOAST_HEADER__CLOSE_BUTTON, newCloseButton);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCloseButton() {
		eDynamicUnset(OverlaysPackage.TOAST_HEADER__CLOSE_BUTTON, OverlaysPackage.Literals.TOAST_HEADER__CLOSE_BUTTON);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCloseButton() {
		return eDynamicIsSet(OverlaysPackage.TOAST_HEADER__CLOSE_BUTTON, OverlaysPackage.Literals.TOAST_HEADER__CLOSE_BUTTON);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Node> getContent() {
		return (EList<Node>)eDynamicGet(OverlaysPackage.TOAST_HEADER__CONTENT, OverlaysPackage.Literals.TOAST_HEADER__CONTENT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OverlaysPackage.TOAST_HEADER__CONTENT:
				return ((InternalEList<?>)getContent()).basicRemove(otherEnd, msgs);
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
			case OverlaysPackage.TOAST_HEADER__CLOSE_BUTTON:
				return isCloseButton();
			case OverlaysPackage.TOAST_HEADER__CONTENT:
				return getContent();
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
			case OverlaysPackage.TOAST_HEADER__CLOSE_BUTTON:
				setCloseButton((Boolean)newValue);
				return;
			case OverlaysPackage.TOAST_HEADER__CONTENT:
				getContent().clear();
				getContent().addAll((Collection<? extends Node>)newValue);
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
			case OverlaysPackage.TOAST_HEADER__CLOSE_BUTTON:
				unsetCloseButton();
				return;
			case OverlaysPackage.TOAST_HEADER__CONTENT:
				getContent().clear();
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
			case OverlaysPackage.TOAST_HEADER__CLOSE_BUTTON:
				return isSetCloseButton();
			case OverlaysPackage.TOAST_HEADER__CONTENT:
				return !getContent().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ToastHeaderImpl
