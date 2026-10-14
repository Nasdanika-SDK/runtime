/**
 */
package org.nasdanika.sdk.runtime.models.react.bootstrap.components.overlays.impl;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.nasdanika.sdk.runtime.models.react.bootstrap.components.overlays.Backdrop;
import org.nasdanika.sdk.runtime.models.react.bootstrap.components.overlays.Fullscreen;
import org.nasdanika.sdk.runtime.models.react.bootstrap.components.overlays.Modal;
import org.nasdanika.sdk.runtime.models.react.bootstrap.components.overlays.ModalBody;
import org.nasdanika.sdk.runtime.models.react.bootstrap.components.overlays.ModalFooter;
import org.nasdanika.sdk.runtime.models.react.bootstrap.components.overlays.ModalHeader;
import org.nasdanika.sdk.runtime.models.react.bootstrap.components.overlays.ModalSize;
import org.nasdanika.sdk.runtime.models.react.bootstrap.components.overlays.OverlaysPackage;

import org.nasdanika.sdk.runtime.models.react.bootstrap.impl.BootstrapComponentImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Modal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.overlays.impl.ModalImpl#isShow <em>Show</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.overlays.impl.ModalImpl#getSize <em>Size</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.overlays.impl.ModalImpl#isCentered <em>Centered</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.overlays.impl.ModalImpl#isScrollable <em>Scrollable</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.overlays.impl.ModalImpl#isFullscreen <em>Fullscreen</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.overlays.impl.ModalImpl#getFullscreenBelow <em>Fullscreen Below</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.overlays.impl.ModalImpl#getBackdrop <em>Backdrop</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.overlays.impl.ModalImpl#isKeyboard <em>Keyboard</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.overlays.impl.ModalImpl#isAnimation <em>Animation</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.overlays.impl.ModalImpl#getHeader <em>Header</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.overlays.impl.ModalImpl#getBody <em>Body</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.overlays.impl.ModalImpl#getFooter <em>Footer</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModalImpl extends BootstrapComponentImpl implements Modal {
	/**
	 * The default value of the '{@link #isShow() <em>Show</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isShow()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SHOW_EDEFAULT = false;

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
	 * The default value of the '{@link #getBackdrop() <em>Backdrop</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBackdrop()
	 * @generated
	 * @ordered
	 */
	protected static final Backdrop BACKDROP_EDEFAULT = Backdrop.STATIC;

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
	 * The default value of the '{@link #isAnimation() <em>Animation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAnimation()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ANIMATION_EDEFAULT = false;

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
	public boolean isShow() {
		return (Boolean)eDynamicGet(OverlaysPackage.MODAL__SHOW, OverlaysPackage.Literals.MODAL__SHOW, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShow(boolean newShow) {
		eDynamicSet(OverlaysPackage.MODAL__SHOW, OverlaysPackage.Literals.MODAL__SHOW, newShow);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetShow() {
		eDynamicUnset(OverlaysPackage.MODAL__SHOW, OverlaysPackage.Literals.MODAL__SHOW);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetShow() {
		return eDynamicIsSet(OverlaysPackage.MODAL__SHOW, OverlaysPackage.Literals.MODAL__SHOW);
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
	public Backdrop getBackdrop() {
		return (Backdrop)eDynamicGet(OverlaysPackage.MODAL__BACKDROP, OverlaysPackage.Literals.MODAL__BACKDROP, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBackdrop(Backdrop newBackdrop) {
		eDynamicSet(OverlaysPackage.MODAL__BACKDROP, OverlaysPackage.Literals.MODAL__BACKDROP, newBackdrop);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetBackdrop() {
		eDynamicUnset(OverlaysPackage.MODAL__BACKDROP, OverlaysPackage.Literals.MODAL__BACKDROP);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetBackdrop() {
		return eDynamicIsSet(OverlaysPackage.MODAL__BACKDROP, OverlaysPackage.Literals.MODAL__BACKDROP);
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
	public boolean isAnimation() {
		return (Boolean)eDynamicGet(OverlaysPackage.MODAL__ANIMATION, OverlaysPackage.Literals.MODAL__ANIMATION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnimation(boolean newAnimation) {
		eDynamicSet(OverlaysPackage.MODAL__ANIMATION, OverlaysPackage.Literals.MODAL__ANIMATION, newAnimation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAnimation() {
		eDynamicUnset(OverlaysPackage.MODAL__ANIMATION, OverlaysPackage.Literals.MODAL__ANIMATION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAnimation() {
		return eDynamicIsSet(OverlaysPackage.MODAL__ANIMATION, OverlaysPackage.Literals.MODAL__ANIMATION);
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
			case OverlaysPackage.MODAL__SHOW:
				return isShow();
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
			case OverlaysPackage.MODAL__BACKDROP:
				return getBackdrop();
			case OverlaysPackage.MODAL__KEYBOARD:
				return isKeyboard();
			case OverlaysPackage.MODAL__ANIMATION:
				return isAnimation();
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
			case OverlaysPackage.MODAL__SHOW:
				setShow((Boolean)newValue);
				return;
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
			case OverlaysPackage.MODAL__BACKDROP:
				setBackdrop((Backdrop)newValue);
				return;
			case OverlaysPackage.MODAL__KEYBOARD:
				setKeyboard((Boolean)newValue);
				return;
			case OverlaysPackage.MODAL__ANIMATION:
				setAnimation((Boolean)newValue);
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
			case OverlaysPackage.MODAL__SHOW:
				unsetShow();
				return;
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
			case OverlaysPackage.MODAL__BACKDROP:
				unsetBackdrop();
				return;
			case OverlaysPackage.MODAL__KEYBOARD:
				unsetKeyboard();
				return;
			case OverlaysPackage.MODAL__ANIMATION:
				unsetAnimation();
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
			case OverlaysPackage.MODAL__SHOW:
				return isSetShow();
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
			case OverlaysPackage.MODAL__BACKDROP:
				return isSetBackdrop();
			case OverlaysPackage.MODAL__KEYBOARD:
				return isSetKeyboard();
			case OverlaysPackage.MODAL__ANIMATION:
				return isSetAnimation();
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
