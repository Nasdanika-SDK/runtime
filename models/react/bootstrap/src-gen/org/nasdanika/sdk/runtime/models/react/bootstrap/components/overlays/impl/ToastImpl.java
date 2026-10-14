/**
 */
package org.nasdanika.sdk.runtime.models.react.bootstrap.components.overlays.impl;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.nasdanika.sdk.runtime.models.react.bootstrap.Variant;

import org.nasdanika.sdk.runtime.models.react.bootstrap.components.overlays.OverlaysPackage;
import org.nasdanika.sdk.runtime.models.react.bootstrap.components.overlays.Toast;
import org.nasdanika.sdk.runtime.models.react.bootstrap.components.overlays.ToastBody;
import org.nasdanika.sdk.runtime.models.react.bootstrap.components.overlays.ToastHeader;

import org.nasdanika.sdk.runtime.models.react.bootstrap.impl.BootstrapComponentImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Toast</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.overlays.impl.ToastImpl#isShow <em>Show</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.overlays.impl.ToastImpl#getBg <em>Bg</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.overlays.impl.ToastImpl#isAutohide <em>Autohide</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.overlays.impl.ToastImpl#getDelay <em>Delay</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.overlays.impl.ToastImpl#isAnimation <em>Animation</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.overlays.impl.ToastImpl#getHeader <em>Header</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.overlays.impl.ToastImpl#getBody <em>Body</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ToastImpl extends BootstrapComponentImpl implements Toast {
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
	 * The default value of the '{@link #getBg() <em>Bg</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBg()
	 * @generated
	 * @ordered
	 */
	protected static final Variant BG_EDEFAULT = Variant.PRIMARY;

	/**
	 * The default value of the '{@link #isAutohide() <em>Autohide</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAutohide()
	 * @generated
	 * @ordered
	 */
	protected static final boolean AUTOHIDE_EDEFAULT = false;

	/**
	 * The default value of the '{@link #getDelay() <em>Delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDelay()
	 * @generated
	 * @ordered
	 */
	protected static final int DELAY_EDEFAULT = 0;

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
	protected ToastImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OverlaysPackage.Literals.TOAST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isShow() {
		return (Boolean)eDynamicGet(OverlaysPackage.TOAST__SHOW, OverlaysPackage.Literals.TOAST__SHOW, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShow(boolean newShow) {
		eDynamicSet(OverlaysPackage.TOAST__SHOW, OverlaysPackage.Literals.TOAST__SHOW, newShow);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetShow() {
		eDynamicUnset(OverlaysPackage.TOAST__SHOW, OverlaysPackage.Literals.TOAST__SHOW);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetShow() {
		return eDynamicIsSet(OverlaysPackage.TOAST__SHOW, OverlaysPackage.Literals.TOAST__SHOW);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variant getBg() {
		return (Variant)eDynamicGet(OverlaysPackage.TOAST__BG, OverlaysPackage.Literals.TOAST__BG, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBg(Variant newBg) {
		eDynamicSet(OverlaysPackage.TOAST__BG, OverlaysPackage.Literals.TOAST__BG, newBg);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetBg() {
		eDynamicUnset(OverlaysPackage.TOAST__BG, OverlaysPackage.Literals.TOAST__BG);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetBg() {
		return eDynamicIsSet(OverlaysPackage.TOAST__BG, OverlaysPackage.Literals.TOAST__BG);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAutohide() {
		return (Boolean)eDynamicGet(OverlaysPackage.TOAST__AUTOHIDE, OverlaysPackage.Literals.TOAST__AUTOHIDE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAutohide(boolean newAutohide) {
		eDynamicSet(OverlaysPackage.TOAST__AUTOHIDE, OverlaysPackage.Literals.TOAST__AUTOHIDE, newAutohide);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getDelay() {
		return (Integer)eDynamicGet(OverlaysPackage.TOAST__DELAY, OverlaysPackage.Literals.TOAST__DELAY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDelay(int newDelay) {
		eDynamicSet(OverlaysPackage.TOAST__DELAY, OverlaysPackage.Literals.TOAST__DELAY, newDelay);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDelay() {
		eDynamicUnset(OverlaysPackage.TOAST__DELAY, OverlaysPackage.Literals.TOAST__DELAY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDelay() {
		return eDynamicIsSet(OverlaysPackage.TOAST__DELAY, OverlaysPackage.Literals.TOAST__DELAY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAnimation() {
		return (Boolean)eDynamicGet(OverlaysPackage.TOAST__ANIMATION, OverlaysPackage.Literals.TOAST__ANIMATION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnimation(boolean newAnimation) {
		eDynamicSet(OverlaysPackage.TOAST__ANIMATION, OverlaysPackage.Literals.TOAST__ANIMATION, newAnimation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAnimation() {
		eDynamicUnset(OverlaysPackage.TOAST__ANIMATION, OverlaysPackage.Literals.TOAST__ANIMATION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAnimation() {
		return eDynamicIsSet(OverlaysPackage.TOAST__ANIMATION, OverlaysPackage.Literals.TOAST__ANIMATION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ToastHeader getHeader() {
		return (ToastHeader)eDynamicGet(OverlaysPackage.TOAST__HEADER, OverlaysPackage.Literals.TOAST__HEADER, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHeader(ToastHeader newHeader, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newHeader, OverlaysPackage.TOAST__HEADER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeader(ToastHeader newHeader) {
		eDynamicSet(OverlaysPackage.TOAST__HEADER, OverlaysPackage.Literals.TOAST__HEADER, newHeader);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ToastBody getBody() {
		return (ToastBody)eDynamicGet(OverlaysPackage.TOAST__BODY, OverlaysPackage.Literals.TOAST__BODY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBody(ToastBody newBody, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newBody, OverlaysPackage.TOAST__BODY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBody(ToastBody newBody) {
		eDynamicSet(OverlaysPackage.TOAST__BODY, OverlaysPackage.Literals.TOAST__BODY, newBody);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OverlaysPackage.TOAST__HEADER:
				return basicSetHeader(null, msgs);
			case OverlaysPackage.TOAST__BODY:
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
			case OverlaysPackage.TOAST__SHOW:
				return isShow();
			case OverlaysPackage.TOAST__BG:
				return getBg();
			case OverlaysPackage.TOAST__AUTOHIDE:
				return isAutohide();
			case OverlaysPackage.TOAST__DELAY:
				return getDelay();
			case OverlaysPackage.TOAST__ANIMATION:
				return isAnimation();
			case OverlaysPackage.TOAST__HEADER:
				return getHeader();
			case OverlaysPackage.TOAST__BODY:
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
			case OverlaysPackage.TOAST__SHOW:
				setShow((Boolean)newValue);
				return;
			case OverlaysPackage.TOAST__BG:
				setBg((Variant)newValue);
				return;
			case OverlaysPackage.TOAST__AUTOHIDE:
				setAutohide((Boolean)newValue);
				return;
			case OverlaysPackage.TOAST__DELAY:
				setDelay((Integer)newValue);
				return;
			case OverlaysPackage.TOAST__ANIMATION:
				setAnimation((Boolean)newValue);
				return;
			case OverlaysPackage.TOAST__HEADER:
				setHeader((ToastHeader)newValue);
				return;
			case OverlaysPackage.TOAST__BODY:
				setBody((ToastBody)newValue);
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
			case OverlaysPackage.TOAST__SHOW:
				unsetShow();
				return;
			case OverlaysPackage.TOAST__BG:
				unsetBg();
				return;
			case OverlaysPackage.TOAST__AUTOHIDE:
				setAutohide(AUTOHIDE_EDEFAULT);
				return;
			case OverlaysPackage.TOAST__DELAY:
				unsetDelay();
				return;
			case OverlaysPackage.TOAST__ANIMATION:
				unsetAnimation();
				return;
			case OverlaysPackage.TOAST__HEADER:
				setHeader((ToastHeader)null);
				return;
			case OverlaysPackage.TOAST__BODY:
				setBody((ToastBody)null);
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
			case OverlaysPackage.TOAST__SHOW:
				return isSetShow();
			case OverlaysPackage.TOAST__BG:
				return isSetBg();
			case OverlaysPackage.TOAST__AUTOHIDE:
				return isAutohide() != AUTOHIDE_EDEFAULT;
			case OverlaysPackage.TOAST__DELAY:
				return isSetDelay();
			case OverlaysPackage.TOAST__ANIMATION:
				return isSetAnimation();
			case OverlaysPackage.TOAST__HEADER:
				return getHeader() != null;
			case OverlaysPackage.TOAST__BODY:
				return getBody() != null;
		}
		return super.eIsSet(featureID);
	}

} //ToastImpl
