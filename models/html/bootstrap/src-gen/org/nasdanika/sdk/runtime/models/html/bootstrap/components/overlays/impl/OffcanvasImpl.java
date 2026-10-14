/**
 */
package org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.impl;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.Offcanvas;
import org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.OffcanvasBody;
import org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.OffcanvasHeader;
import org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.OffcanvasPlacement;
import org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.OverlaysPackage;

import org.nasdanika.sdk.runtime.models.html.bootstrap.impl.BootstrapElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Offcanvas</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.impl.OffcanvasImpl#getPlacement <em>Placement</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.impl.OffcanvasImpl#isBackdrop <em>Backdrop</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.impl.OffcanvasImpl#isScroll <em>Scroll</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.impl.OffcanvasImpl#getHeader <em>Header</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.impl.OffcanvasImpl#getBody <em>Body</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OffcanvasImpl extends BootstrapElementImpl implements Offcanvas {
	/**
	 * The default value of the '{@link #getPlacement() <em>Placement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlacement()
	 * @generated
	 * @ordered
	 */
	protected static final OffcanvasPlacement PLACEMENT_EDEFAULT = OffcanvasPlacement.START;

	/**
	 * The default value of the '{@link #isBackdrop() <em>Backdrop</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBackdrop()
	 * @generated
	 * @ordered
	 */
	protected static final boolean BACKDROP_EDEFAULT = false;

	/**
	 * The default value of the '{@link #isScroll() <em>Scroll</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isScroll()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SCROLL_EDEFAULT = false;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OffcanvasImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OverlaysPackage.Literals.OFFCANVAS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OffcanvasPlacement getPlacement() {
		return (OffcanvasPlacement)eDynamicGet(OverlaysPackage.OFFCANVAS__PLACEMENT, OverlaysPackage.Literals.OFFCANVAS__PLACEMENT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlacement(OffcanvasPlacement newPlacement) {
		eDynamicSet(OverlaysPackage.OFFCANVAS__PLACEMENT, OverlaysPackage.Literals.OFFCANVAS__PLACEMENT, newPlacement);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPlacement() {
		eDynamicUnset(OverlaysPackage.OFFCANVAS__PLACEMENT, OverlaysPackage.Literals.OFFCANVAS__PLACEMENT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPlacement() {
		return eDynamicIsSet(OverlaysPackage.OFFCANVAS__PLACEMENT, OverlaysPackage.Literals.OFFCANVAS__PLACEMENT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isBackdrop() {
		return (Boolean)eDynamicGet(OverlaysPackage.OFFCANVAS__BACKDROP, OverlaysPackage.Literals.OFFCANVAS__BACKDROP, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBackdrop(boolean newBackdrop) {
		eDynamicSet(OverlaysPackage.OFFCANVAS__BACKDROP, OverlaysPackage.Literals.OFFCANVAS__BACKDROP, newBackdrop);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetBackdrop() {
		eDynamicUnset(OverlaysPackage.OFFCANVAS__BACKDROP, OverlaysPackage.Literals.OFFCANVAS__BACKDROP);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetBackdrop() {
		return eDynamicIsSet(OverlaysPackage.OFFCANVAS__BACKDROP, OverlaysPackage.Literals.OFFCANVAS__BACKDROP);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isScroll() {
		return (Boolean)eDynamicGet(OverlaysPackage.OFFCANVAS__SCROLL, OverlaysPackage.Literals.OFFCANVAS__SCROLL, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScroll(boolean newScroll) {
		eDynamicSet(OverlaysPackage.OFFCANVAS__SCROLL, OverlaysPackage.Literals.OFFCANVAS__SCROLL, newScroll);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OffcanvasHeader getHeader() {
		return (OffcanvasHeader)eDynamicGet(OverlaysPackage.OFFCANVAS__HEADER, OverlaysPackage.Literals.OFFCANVAS__HEADER, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHeader(OffcanvasHeader newHeader, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newHeader, OverlaysPackage.OFFCANVAS__HEADER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeader(OffcanvasHeader newHeader) {
		eDynamicSet(OverlaysPackage.OFFCANVAS__HEADER, OverlaysPackage.Literals.OFFCANVAS__HEADER, newHeader);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OffcanvasBody getBody() {
		return (OffcanvasBody)eDynamicGet(OverlaysPackage.OFFCANVAS__BODY, OverlaysPackage.Literals.OFFCANVAS__BODY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBody(OffcanvasBody newBody, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newBody, OverlaysPackage.OFFCANVAS__BODY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBody(OffcanvasBody newBody) {
		eDynamicSet(OverlaysPackage.OFFCANVAS__BODY, OverlaysPackage.Literals.OFFCANVAS__BODY, newBody);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OverlaysPackage.OFFCANVAS__HEADER:
				return basicSetHeader(null, msgs);
			case OverlaysPackage.OFFCANVAS__BODY:
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
			case OverlaysPackage.OFFCANVAS__PLACEMENT:
				return getPlacement();
			case OverlaysPackage.OFFCANVAS__BACKDROP:
				return isBackdrop();
			case OverlaysPackage.OFFCANVAS__SCROLL:
				return isScroll();
			case OverlaysPackage.OFFCANVAS__HEADER:
				return getHeader();
			case OverlaysPackage.OFFCANVAS__BODY:
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
			case OverlaysPackage.OFFCANVAS__PLACEMENT:
				setPlacement((OffcanvasPlacement)newValue);
				return;
			case OverlaysPackage.OFFCANVAS__BACKDROP:
				setBackdrop((Boolean)newValue);
				return;
			case OverlaysPackage.OFFCANVAS__SCROLL:
				setScroll((Boolean)newValue);
				return;
			case OverlaysPackage.OFFCANVAS__HEADER:
				setHeader((OffcanvasHeader)newValue);
				return;
			case OverlaysPackage.OFFCANVAS__BODY:
				setBody((OffcanvasBody)newValue);
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
			case OverlaysPackage.OFFCANVAS__PLACEMENT:
				unsetPlacement();
				return;
			case OverlaysPackage.OFFCANVAS__BACKDROP:
				unsetBackdrop();
				return;
			case OverlaysPackage.OFFCANVAS__SCROLL:
				setScroll(SCROLL_EDEFAULT);
				return;
			case OverlaysPackage.OFFCANVAS__HEADER:
				setHeader((OffcanvasHeader)null);
				return;
			case OverlaysPackage.OFFCANVAS__BODY:
				setBody((OffcanvasBody)null);
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
			case OverlaysPackage.OFFCANVAS__PLACEMENT:
				return isSetPlacement();
			case OverlaysPackage.OFFCANVAS__BACKDROP:
				return isSetBackdrop();
			case OverlaysPackage.OFFCANVAS__SCROLL:
				return isScroll() != SCROLL_EDEFAULT;
			case OverlaysPackage.OFFCANVAS__HEADER:
				return getHeader() != null;
			case OverlaysPackage.OFFCANVAS__BODY:
				return getBody() != null;
		}
		return super.eIsSet(featureID);
	}

} //OffcanvasImpl
