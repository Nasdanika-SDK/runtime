/**
 */
package org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.impl;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.Fullscreen;
import org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.Modal;
import org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.ModalBody;
import org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.ModalFooter;
import org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.ModalHeader;
import org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.ModalSize;
import org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.OverlaysPackage;

import org.nasdanika.sdk.runtime.models.html.bootstrap.impl.BootstrapElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Modal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.impl.ModalImpl#getSize <em>Size</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.impl.ModalImpl#isCentered <em>Centered</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.impl.ModalImpl#isScrollable <em>Scrollable</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.impl.ModalImpl#isFullscreen <em>Fullscreen</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.impl.ModalImpl#getFullscreenBelow <em>Fullscreen Below</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.impl.ModalImpl#isStaticBackdrop <em>Static Backdrop</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.impl.ModalImpl#isKeyboard <em>Keyboard</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.impl.ModalImpl#getHeader <em>Header</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.impl.ModalImpl#getBody <em>Body</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.impl.ModalImpl#getFooter <em>Footer</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModalImpl extends BootstrapElementImpl implements Modal {
	/**
	 * The default value of the '{@link #getSize() <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected static final ModalSize SIZE_EDEFAULT = ModalSize.SM;

	/**
	 * The default value of the '{@link #isCentered() <em>Centered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCentered()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CENTERED_EDEFAULT = false;

	/**
	 * The default value of the '{@link #isScrollable() <em>Scrollable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isScrollable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SCROLLABLE_EDEFAULT = false;

	/**
	 * The default value of the '{@link #isFullscreen() <em>Fullscreen</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFullscreen()
	 * @generated
	 * @ordered
	 */
	protected static final boolean FULLSCREEN_EDEFAULT = false;

	/**
	 * The default value of the '{@link #getFullscreenBelow() <em>Fullscreen Below</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFullscreenBelow()
	 * @generated
	 * @ordered
	 */
	protected static final Fullscreen FULLSCREEN_BELOW_EDEFAULT = Fullscreen.SM_DOWN;

	/**
	 * The default value of the '{@link #isStaticBackdrop() <em>Static Backdrop</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isStaticBackdrop()
	 * @generated
	 * @ordered
	 */
	protected static final boolean STATIC_BACKDROP_EDEFAULT = false;

	/**
	 * The default value of the '{@link #isKeyboard() <em>Keyboard</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isKeyboard()
	 * @generated
	 * @ordered
	 */
	protected static final boolean KEYBOARD_EDEFAULT = false;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OverlaysPackage.Literals.MODAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModalSize getSize() {
		return (ModalSize)eDynamicGet(OverlaysPackage.MODAL__SIZE, OverlaysPackage.Literals.MODAL__SIZE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSize(ModalSize newSize) {
		eDynamicSet(OverlaysPackage.MODAL__SIZE, OverlaysPackage.Literals.MODAL__SIZE, newSize);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSize() {
		eDynamicUnset(OverlaysPackage.MODAL__SIZE, OverlaysPackage.Literals.MODAL__SIZE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSize() {
		return eDynamicIsSet(OverlaysPackage.MODAL__SIZE, OverlaysPackage.Literals.MODAL__SIZE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCentered() {
		return (Boolean)eDynamicGet(OverlaysPackage.MODAL__CENTERED, OverlaysPackage.Literals.MODAL__CENTERED, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCentered(boolean newCentered) {
		eDynamicSet(OverlaysPackage.MODAL__CENTERED, OverlaysPackage.Literals.MODAL__CENTERED, newCentered);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isScrollable() {
		return (Boolean)eDynamicGet(OverlaysPackage.MODAL__SCROLLABLE, OverlaysPackage.Literals.MODAL__SCROLLABLE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScrollable(boolean newScrollable) {
		eDynamicSet(OverlaysPackage.MODAL__SCROLLABLE, OverlaysPackage.Literals.MODAL__SCROLLABLE, newScrollable);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isFullscreen() {
		return (Boolean)eDynamicGet(OverlaysPackage.MODAL__FULLSCREEN, OverlaysPackage.Literals.MODAL__FULLSCREEN, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFullscreen(boolean newFullscreen) {
		eDynamicSet(OverlaysPackage.MODAL__FULLSCREEN, OverlaysPackage.Literals.MODAL__FULLSCREEN, newFullscreen);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Fullscreen getFullscreenBelow() {
		return (Fullscreen)eDynamicGet(OverlaysPackage.MODAL__FULLSCREEN_BELOW, OverlaysPackage.Literals.MODAL__FULLSCREEN_BELOW, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFullscreenBelow(Fullscreen newFullscreenBelow) {
		eDynamicSet(OverlaysPackage.MODAL__FULLSCREEN_BELOW, OverlaysPackage.Literals.MODAL__FULLSCREEN_BELOW, newFullscreenBelow);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFullscreenBelow() {
		eDynamicUnset(OverlaysPackage.MODAL__FULLSCREEN_BELOW, OverlaysPackage.Literals.MODAL__FULLSCREEN_BELOW);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFullscreenBelow() {
		return eDynamicIsSet(OverlaysPackage.MODAL__FULLSCREEN_BELOW, OverlaysPackage.Literals.MODAL__FULLSCREEN_BELOW);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isStaticBackdrop() {
		return (Boolean)eDynamicGet(OverlaysPackage.MODAL__STATIC_BACKDROP, OverlaysPackage.Literals.MODAL__STATIC_BACKDROP, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStaticBackdrop(boolean newStaticBackdrop) {
		eDynamicSet(OverlaysPackage.MODAL__STATIC_BACKDROP, OverlaysPackage.Literals.MODAL__STATIC_BACKDROP, newStaticBackdrop);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isKeyboard() {
		return (Boolean)eDynamicGet(OverlaysPackage.MODAL__KEYBOARD, OverlaysPackage.Literals.MODAL__KEYBOARD, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKeyboard(boolean newKeyboard) {
		eDynamicSet(OverlaysPackage.MODAL__KEYBOARD, OverlaysPackage.Literals.MODAL__KEYBOARD, newKeyboard);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetKeyboard() {
		eDynamicUnset(OverlaysPackage.MODAL__KEYBOARD, OverlaysPackage.Literals.MODAL__KEYBOARD);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetKeyboard() {
		return eDynamicIsSet(OverlaysPackage.MODAL__KEYBOARD, OverlaysPackage.Literals.MODAL__KEYBOARD);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModalHeader getHeader() {
		return (ModalHeader)eDynamicGet(OverlaysPackage.MODAL__HEADER, OverlaysPackage.Literals.MODAL__HEADER, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHeader(ModalHeader newHeader, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newHeader, OverlaysPackage.MODAL__HEADER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeader(ModalHeader newHeader) {
		eDynamicSet(OverlaysPackage.MODAL__HEADER, OverlaysPackage.Literals.MODAL__HEADER, newHeader);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModalBody getBody() {
		return (ModalBody)eDynamicGet(OverlaysPackage.MODAL__BODY, OverlaysPackage.Literals.MODAL__BODY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBody(ModalBody newBody, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newBody, OverlaysPackage.MODAL__BODY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBody(ModalBody newBody) {
		eDynamicSet(OverlaysPackage.MODAL__BODY, OverlaysPackage.Literals.MODAL__BODY, newBody);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModalFooter getFooter() {
		return (ModalFooter)eDynamicGet(OverlaysPackage.MODAL__FOOTER, OverlaysPackage.Literals.MODAL__FOOTER, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFooter(ModalFooter newFooter, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newFooter, OverlaysPackage.MODAL__FOOTER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFooter(ModalFooter newFooter) {
		eDynamicSet(OverlaysPackage.MODAL__FOOTER, OverlaysPackage.Literals.MODAL__FOOTER, newFooter);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OverlaysPackage.MODAL__HEADER:
				return basicSetHeader(null, msgs);
			case OverlaysPackage.MODAL__BODY:
				return basicSetBody(null, msgs);
			case OverlaysPackage.MODAL__FOOTER:
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
			case OverlaysPackage.MODAL__SIZE:
				return getSize();
			case OverlaysPackage.MODAL__CENTERED:
				return isCentered();
			case OverlaysPackage.MODAL__SCROLLABLE:
				return isScrollable();
			case OverlaysPackage.MODAL__FULLSCREEN:
				return isFullscreen();
			case OverlaysPackage.MODAL__FULLSCREEN_BELOW:
				return getFullscreenBelow();
			case OverlaysPackage.MODAL__STATIC_BACKDROP:
				return isStaticBackdrop();
			case OverlaysPackage.MODAL__KEYBOARD:
				return isKeyboard();
			case OverlaysPackage.MODAL__HEADER:
				return getHeader();
			case OverlaysPackage.MODAL__BODY:
				return getBody();
			case OverlaysPackage.MODAL__FOOTER:
				return getFooter();
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
			case OverlaysPackage.MODAL__SIZE:
				setSize((ModalSize)newValue);
				return;
			case OverlaysPackage.MODAL__CENTERED:
				setCentered((Boolean)newValue);
				return;
			case OverlaysPackage.MODAL__SCROLLABLE:
				setScrollable((Boolean)newValue);
				return;
			case OverlaysPackage.MODAL__FULLSCREEN:
				setFullscreen((Boolean)newValue);
				return;
			case OverlaysPackage.MODAL__FULLSCREEN_BELOW:
				setFullscreenBelow((Fullscreen)newValue);
				return;
			case OverlaysPackage.MODAL__STATIC_BACKDROP:
				setStaticBackdrop((Boolean)newValue);
				return;
			case OverlaysPackage.MODAL__KEYBOARD:
				setKeyboard((Boolean)newValue);
				return;
			case OverlaysPackage.MODAL__HEADER:
				setHeader((ModalHeader)newValue);
				return;
			case OverlaysPackage.MODAL__BODY:
				setBody((ModalBody)newValue);
				return;
			case OverlaysPackage.MODAL__FOOTER:
				setFooter((ModalFooter)newValue);
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
			case OverlaysPackage.MODAL__SIZE:
				unsetSize();
				return;
			case OverlaysPackage.MODAL__CENTERED:
				setCentered(CENTERED_EDEFAULT);
				return;
			case OverlaysPackage.MODAL__SCROLLABLE:
				setScrollable(SCROLLABLE_EDEFAULT);
				return;
			case OverlaysPackage.MODAL__FULLSCREEN:
				setFullscreen(FULLSCREEN_EDEFAULT);
				return;
			case OverlaysPackage.MODAL__FULLSCREEN_BELOW:
				unsetFullscreenBelow();
				return;
			case OverlaysPackage.MODAL__STATIC_BACKDROP:
				setStaticBackdrop(STATIC_BACKDROP_EDEFAULT);
				return;
			case OverlaysPackage.MODAL__KEYBOARD:
				unsetKeyboard();
				return;
			case OverlaysPackage.MODAL__HEADER:
				setHeader((ModalHeader)null);
				return;
			case OverlaysPackage.MODAL__BODY:
				setBody((ModalBody)null);
				return;
			case OverlaysPackage.MODAL__FOOTER:
				setFooter((ModalFooter)null);
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
			case OverlaysPackage.MODAL__SIZE:
				return isSetSize();
			case OverlaysPackage.MODAL__CENTERED:
				return isCentered() != CENTERED_EDEFAULT;
			case OverlaysPackage.MODAL__SCROLLABLE:
				return isScrollable() != SCROLLABLE_EDEFAULT;
			case OverlaysPackage.MODAL__FULLSCREEN:
				return isFullscreen() != FULLSCREEN_EDEFAULT;
			case OverlaysPackage.MODAL__FULLSCREEN_BELOW:
				return isSetFullscreenBelow();
			case OverlaysPackage.MODAL__STATIC_BACKDROP:
				return isStaticBackdrop() != STATIC_BACKDROP_EDEFAULT;
			case OverlaysPackage.MODAL__KEYBOARD:
				return isSetKeyboard();
			case OverlaysPackage.MODAL__HEADER:
				return getHeader() != null;
			case OverlaysPackage.MODAL__BODY:
				return getBody() != null;
			case OverlaysPackage.MODAL__FOOTER:
				return getFooter() != null;
		}
		return super.eIsSet(featureID);
	}

} //ModalImpl
