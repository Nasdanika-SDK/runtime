/**
 */
package org.nasdanika.sdk.runtime.models.react.bootstrap.components.overlays.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.nasdanika.sdk.runtime.models.react.bootstrap.components.overlays.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class OverlaysFactoryImpl extends EFactoryImpl implements OverlaysFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static OverlaysFactory init() {
		try {
			OverlaysFactory theOverlaysFactory = (OverlaysFactory)EPackage.Registry.INSTANCE.getEFactory(OverlaysPackage.eNS_URI);
			if (theOverlaysFactory != null) {
				return theOverlaysFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new OverlaysFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OverlaysFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case OverlaysPackage.MODAL: return createModal();
			case OverlaysPackage.MODAL_HEADER: return createModalHeader();
			case OverlaysPackage.MODAL_TITLE: return createModalTitle();
			case OverlaysPackage.MODAL_BODY: return createModalBody();
			case OverlaysPackage.MODAL_FOOTER: return createModalFooter();
			case OverlaysPackage.OFFCANVAS: return createOffcanvas();
			case OverlaysPackage.OFFCANVAS_HEADER: return createOffcanvasHeader();
			case OverlaysPackage.OFFCANVAS_TITLE: return createOffcanvasTitle();
			case OverlaysPackage.OFFCANVAS_BODY: return createOffcanvasBody();
			case OverlaysPackage.TOAST: return createToast();
			case OverlaysPackage.TOAST_HEADER: return createToastHeader();
			case OverlaysPackage.TOAST_BODY: return createToastBody();
			case OverlaysPackage.TOAST_CONTAINER: return createToastContainer();
			case OverlaysPackage.OVERLAY_TRIGGER: return createOverlayTrigger();
			case OverlaysPackage.TOOLTIP: return createTooltip();
			case OverlaysPackage.POPOVER: return createPopover();
			case OverlaysPackage.POPOVER_HEADER: return createPopoverHeader();
			case OverlaysPackage.POPOVER_BODY: return createPopoverBody();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case OverlaysPackage.MODAL_SIZE:
				return createModalSizeFromString(eDataType, initialValue);
			case OverlaysPackage.FULLSCREEN:
				return createFullscreenFromString(eDataType, initialValue);
			case OverlaysPackage.BACKDROP:
				return createBackdropFromString(eDataType, initialValue);
			case OverlaysPackage.OFFCANVAS_PLACEMENT:
				return createOffcanvasPlacementFromString(eDataType, initialValue);
			case OverlaysPackage.TOAST_POSITION:
				return createToastPositionFromString(eDataType, initialValue);
			case OverlaysPackage.TOAST_CONTAINMENT:
				return createToastContainmentFromString(eDataType, initialValue);
			case OverlaysPackage.PLACEMENT:
				return createPlacementFromString(eDataType, initialValue);
			case OverlaysPackage.TRIGGER:
				return createTriggerFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case OverlaysPackage.MODAL_SIZE:
				return convertModalSizeToString(eDataType, instanceValue);
			case OverlaysPackage.FULLSCREEN:
				return convertFullscreenToString(eDataType, instanceValue);
			case OverlaysPackage.BACKDROP:
				return convertBackdropToString(eDataType, instanceValue);
			case OverlaysPackage.OFFCANVAS_PLACEMENT:
				return convertOffcanvasPlacementToString(eDataType, instanceValue);
			case OverlaysPackage.TOAST_POSITION:
				return convertToastPositionToString(eDataType, instanceValue);
			case OverlaysPackage.TOAST_CONTAINMENT:
				return convertToastContainmentToString(eDataType, instanceValue);
			case OverlaysPackage.PLACEMENT:
				return convertPlacementToString(eDataType, instanceValue);
			case OverlaysPackage.TRIGGER:
				return convertTriggerToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Modal createModal() {
		ModalImpl modal = new ModalImpl();
		return modal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModalHeader createModalHeader() {
		ModalHeaderImpl modalHeader = new ModalHeaderImpl();
		return modalHeader;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModalTitle createModalTitle() {
		ModalTitleImpl modalTitle = new ModalTitleImpl();
		return modalTitle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModalBody createModalBody() {
		ModalBodyImpl modalBody = new ModalBodyImpl();
		return modalBody;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModalFooter createModalFooter() {
		ModalFooterImpl modalFooter = new ModalFooterImpl();
		return modalFooter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Offcanvas createOffcanvas() {
		OffcanvasImpl offcanvas = new OffcanvasImpl();
		return offcanvas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OffcanvasHeader createOffcanvasHeader() {
		OffcanvasHeaderImpl offcanvasHeader = new OffcanvasHeaderImpl();
		return offcanvasHeader;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OffcanvasTitle createOffcanvasTitle() {
		OffcanvasTitleImpl offcanvasTitle = new OffcanvasTitleImpl();
		return offcanvasTitle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OffcanvasBody createOffcanvasBody() {
		OffcanvasBodyImpl offcanvasBody = new OffcanvasBodyImpl();
		return offcanvasBody;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Toast createToast() {
		ToastImpl toast = new ToastImpl();
		return toast;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ToastHeader createToastHeader() {
		ToastHeaderImpl toastHeader = new ToastHeaderImpl();
		return toastHeader;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ToastBody createToastBody() {
		ToastBodyImpl toastBody = new ToastBodyImpl();
		return toastBody;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ToastContainer createToastContainer() {
		ToastContainerImpl toastContainer = new ToastContainerImpl();
		return toastContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OverlayTrigger createOverlayTrigger() {
		OverlayTriggerImpl overlayTrigger = new OverlayTriggerImpl();
		return overlayTrigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tooltip createTooltip() {
		TooltipImpl tooltip = new TooltipImpl();
		return tooltip;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Popover createPopover() {
		PopoverImpl popover = new PopoverImpl();
		return popover;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PopoverHeader createPopoverHeader() {
		PopoverHeaderImpl popoverHeader = new PopoverHeaderImpl();
		return popoverHeader;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PopoverBody createPopoverBody() {
		PopoverBodyImpl popoverBody = new PopoverBodyImpl();
		return popoverBody;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModalSize createModalSizeFromString(EDataType eDataType, String initialValue) {
		ModalSize result = ModalSize.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertModalSizeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Fullscreen createFullscreenFromString(EDataType eDataType, String initialValue) {
		Fullscreen result = Fullscreen.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFullscreenToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Backdrop createBackdropFromString(EDataType eDataType, String initialValue) {
		Backdrop result = Backdrop.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBackdropToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OffcanvasPlacement createOffcanvasPlacementFromString(EDataType eDataType, String initialValue) {
		OffcanvasPlacement result = OffcanvasPlacement.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOffcanvasPlacementToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ToastPosition createToastPositionFromString(EDataType eDataType, String initialValue) {
		ToastPosition result = ToastPosition.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertToastPositionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ToastContainment createToastContainmentFromString(EDataType eDataType, String initialValue) {
		ToastContainment result = ToastContainment.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertToastContainmentToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Placement createPlacementFromString(EDataType eDataType, String initialValue) {
		Placement result = Placement.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPlacementToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Trigger createTriggerFromString(EDataType eDataType, String initialValue) {
		Trigger result = Trigger.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTriggerToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OverlaysPackage getOverlaysPackage() {
		return (OverlaysPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static OverlaysPackage getPackage() {
		return OverlaysPackage.eINSTANCE;
	}

} //OverlaysFactoryImpl
