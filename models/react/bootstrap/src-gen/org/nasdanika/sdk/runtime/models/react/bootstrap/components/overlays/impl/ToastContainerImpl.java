/**
 */
package org.nasdanika.sdk.runtime.models.react.bootstrap.components.overlays.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.sdk.runtime.models.react.bootstrap.components.overlays.OverlaysPackage;
import org.nasdanika.sdk.runtime.models.react.bootstrap.components.overlays.Toast;
import org.nasdanika.sdk.runtime.models.react.bootstrap.components.overlays.ToastContainer;
import org.nasdanika.sdk.runtime.models.react.bootstrap.components.overlays.ToastContainment;
import org.nasdanika.sdk.runtime.models.react.bootstrap.components.overlays.ToastPosition;

import org.nasdanika.sdk.runtime.models.react.bootstrap.impl.BootstrapComponentImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Toast Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.overlays.impl.ToastContainerImpl#getPosition <em>Position</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.overlays.impl.ToastContainerImpl#getContainment <em>Containment</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.overlays.impl.ToastContainerImpl#getToasts <em>Toasts</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ToastContainerImpl extends BootstrapComponentImpl implements ToastContainer {
	/**
	 * The default value of the '{@link #getPosition() <em>Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosition()
	 * @generated
	 * @ordered
	 */
	protected static final ToastPosition POSITION_EDEFAULT = ToastPosition.TOP_START;

	/**
	 * The default value of the '{@link #getContainment() <em>Containment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainment()
	 * @generated
	 * @ordered
	 */
	protected static final ToastContainment CONTAINMENT_EDEFAULT = ToastContainment.FIXED;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ToastContainerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OverlaysPackage.Literals.TOAST_CONTAINER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ToastPosition getPosition() {
		return (ToastPosition)eDynamicGet(OverlaysPackage.TOAST_CONTAINER__POSITION, OverlaysPackage.Literals.TOAST_CONTAINER__POSITION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPosition(ToastPosition newPosition) {
		eDynamicSet(OverlaysPackage.TOAST_CONTAINER__POSITION, OverlaysPackage.Literals.TOAST_CONTAINER__POSITION, newPosition);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPosition() {
		eDynamicUnset(OverlaysPackage.TOAST_CONTAINER__POSITION, OverlaysPackage.Literals.TOAST_CONTAINER__POSITION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPosition() {
		return eDynamicIsSet(OverlaysPackage.TOAST_CONTAINER__POSITION, OverlaysPackage.Literals.TOAST_CONTAINER__POSITION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ToastContainment getContainment() {
		return (ToastContainment)eDynamicGet(OverlaysPackage.TOAST_CONTAINER__CONTAINMENT, OverlaysPackage.Literals.TOAST_CONTAINER__CONTAINMENT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContainment(ToastContainment newContainment) {
		eDynamicSet(OverlaysPackage.TOAST_CONTAINER__CONTAINMENT, OverlaysPackage.Literals.TOAST_CONTAINER__CONTAINMENT, newContainment);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetContainment() {
		eDynamicUnset(OverlaysPackage.TOAST_CONTAINER__CONTAINMENT, OverlaysPackage.Literals.TOAST_CONTAINER__CONTAINMENT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetContainment() {
		return eDynamicIsSet(OverlaysPackage.TOAST_CONTAINER__CONTAINMENT, OverlaysPackage.Literals.TOAST_CONTAINER__CONTAINMENT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Toast> getToasts() {
		return (EList<Toast>)eDynamicGet(OverlaysPackage.TOAST_CONTAINER__TOASTS, OverlaysPackage.Literals.TOAST_CONTAINER__TOASTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OverlaysPackage.TOAST_CONTAINER__TOASTS:
				return ((InternalEList<?>)getToasts()).basicRemove(otherEnd, msgs);
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
			case OverlaysPackage.TOAST_CONTAINER__POSITION:
				return getPosition();
			case OverlaysPackage.TOAST_CONTAINER__CONTAINMENT:
				return getContainment();
			case OverlaysPackage.TOAST_CONTAINER__TOASTS:
				return getToasts();
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
			case OverlaysPackage.TOAST_CONTAINER__POSITION:
				setPosition((ToastPosition)newValue);
				return;
			case OverlaysPackage.TOAST_CONTAINER__CONTAINMENT:
				setContainment((ToastContainment)newValue);
				return;
			case OverlaysPackage.TOAST_CONTAINER__TOASTS:
				getToasts().clear();
				getToasts().addAll((Collection<? extends Toast>)newValue);
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
			case OverlaysPackage.TOAST_CONTAINER__POSITION:
				unsetPosition();
				return;
			case OverlaysPackage.TOAST_CONTAINER__CONTAINMENT:
				unsetContainment();
				return;
			case OverlaysPackage.TOAST_CONTAINER__TOASTS:
				getToasts().clear();
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
			case OverlaysPackage.TOAST_CONTAINER__POSITION:
				return isSetPosition();
			case OverlaysPackage.TOAST_CONTAINER__CONTAINMENT:
				return isSetContainment();
			case OverlaysPackage.TOAST_CONTAINER__TOASTS:
				return !getToasts().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ToastContainerImpl
