/**
 */
package org.nasdanika.sdk.runtime.models.react.bootstrap.components.overlays.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.nasdanika.sdk.runtime.models.core.Documented;
import org.nasdanika.sdk.runtime.models.core.Marked;
import org.nasdanika.sdk.runtime.models.core.ModelElement;
import org.nasdanika.sdk.runtime.models.core.NamedElement;
import org.nasdanika.sdk.runtime.models.core.Referrable;
import org.nasdanika.sdk.runtime.models.core.StringIdentity;

import org.nasdanika.sdk.runtime.models.react.JsxContainer;
import org.nasdanika.sdk.runtime.models.react.JsxNode;
import org.nasdanika.sdk.runtime.models.react.LibraryComponent;
import org.nasdanika.sdk.runtime.models.react.ReactElement;

import org.nasdanika.sdk.runtime.models.react.bootstrap.BootstrapComponent;
import org.nasdanika.sdk.runtime.models.react.bootstrap.TextContent;

import org.nasdanika.sdk.runtime.models.react.bootstrap.components.overlays.*;

import org.nasdanika.sdk.runtime.models.typescript.TypeScriptElement;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.overlays.OverlaysPackage
 * @generated
 */
public class OverlaysSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static OverlaysPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OverlaysSwitch() {
		if (modelPackage == null) {
			modelPackage = OverlaysPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case OverlaysPackage.MODAL: {
				Modal modal = (Modal)theEObject;
				T result = caseModal(modal);
				if (result == null) result = caseBootstrapComponent(modal);
				if (result == null) result = caseLibraryComponent(modal);
				if (result == null) result = caseJsxContainer(modal);
				if (result == null) result = caseJsxNode(modal);
				if (result == null) result = caseReactElement(modal);
				if (result == null) result = caseTypeScriptElement(modal);
				if (result == null) result = caseNamedElement(modal);
				if (result == null) result = caseModelElement(modal);
				if (result == null) result = caseStringIdentity(modal);
				if (result == null) result = caseDocumented(modal);
				if (result == null) result = caseMarked(modal);
				if (result == null) result = caseReferrable(modal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OverlaysPackage.MODAL_HEADER: {
				ModalHeader modalHeader = (ModalHeader)theEObject;
				T result = caseModalHeader(modalHeader);
				if (result == null) result = caseBootstrapComponent(modalHeader);
				if (result == null) result = caseLibraryComponent(modalHeader);
				if (result == null) result = caseJsxContainer(modalHeader);
				if (result == null) result = caseJsxNode(modalHeader);
				if (result == null) result = caseReactElement(modalHeader);
				if (result == null) result = caseTypeScriptElement(modalHeader);
				if (result == null) result = caseNamedElement(modalHeader);
				if (result == null) result = caseModelElement(modalHeader);
				if (result == null) result = caseStringIdentity(modalHeader);
				if (result == null) result = caseDocumented(modalHeader);
				if (result == null) result = caseMarked(modalHeader);
				if (result == null) result = caseReferrable(modalHeader);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OverlaysPackage.MODAL_TITLE: {
				ModalTitle modalTitle = (ModalTitle)theEObject;
				T result = caseModalTitle(modalTitle);
				if (result == null) result = caseBootstrapComponent(modalTitle);
				if (result == null) result = caseTextContent(modalTitle);
				if (result == null) result = caseLibraryComponent(modalTitle);
				if (result == null) result = caseJsxContainer(modalTitle);
				if (result == null) result = caseJsxNode(modalTitle);
				if (result == null) result = caseReactElement(modalTitle);
				if (result == null) result = caseTypeScriptElement(modalTitle);
				if (result == null) result = caseNamedElement(modalTitle);
				if (result == null) result = caseModelElement(modalTitle);
				if (result == null) result = caseStringIdentity(modalTitle);
				if (result == null) result = caseDocumented(modalTitle);
				if (result == null) result = caseMarked(modalTitle);
				if (result == null) result = caseReferrable(modalTitle);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OverlaysPackage.MODAL_BODY: {
				ModalBody modalBody = (ModalBody)theEObject;
				T result = caseModalBody(modalBody);
				if (result == null) result = caseBootstrapComponent(modalBody);
				if (result == null) result = caseTextContent(modalBody);
				if (result == null) result = caseLibraryComponent(modalBody);
				if (result == null) result = caseJsxContainer(modalBody);
				if (result == null) result = caseJsxNode(modalBody);
				if (result == null) result = caseReactElement(modalBody);
				if (result == null) result = caseTypeScriptElement(modalBody);
				if (result == null) result = caseNamedElement(modalBody);
				if (result == null) result = caseModelElement(modalBody);
				if (result == null) result = caseStringIdentity(modalBody);
				if (result == null) result = caseDocumented(modalBody);
				if (result == null) result = caseMarked(modalBody);
				if (result == null) result = caseReferrable(modalBody);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OverlaysPackage.MODAL_FOOTER: {
				ModalFooter modalFooter = (ModalFooter)theEObject;
				T result = caseModalFooter(modalFooter);
				if (result == null) result = caseBootstrapComponent(modalFooter);
				if (result == null) result = caseLibraryComponent(modalFooter);
				if (result == null) result = caseJsxContainer(modalFooter);
				if (result == null) result = caseJsxNode(modalFooter);
				if (result == null) result = caseReactElement(modalFooter);
				if (result == null) result = caseTypeScriptElement(modalFooter);
				if (result == null) result = caseNamedElement(modalFooter);
				if (result == null) result = caseModelElement(modalFooter);
				if (result == null) result = caseStringIdentity(modalFooter);
				if (result == null) result = caseDocumented(modalFooter);
				if (result == null) result = caseMarked(modalFooter);
				if (result == null) result = caseReferrable(modalFooter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OverlaysPackage.OFFCANVAS: {
				Offcanvas offcanvas = (Offcanvas)theEObject;
				T result = caseOffcanvas(offcanvas);
				if (result == null) result = caseBootstrapComponent(offcanvas);
				if (result == null) result = caseLibraryComponent(offcanvas);
				if (result == null) result = caseJsxContainer(offcanvas);
				if (result == null) result = caseJsxNode(offcanvas);
				if (result == null) result = caseReactElement(offcanvas);
				if (result == null) result = caseTypeScriptElement(offcanvas);
				if (result == null) result = caseNamedElement(offcanvas);
				if (result == null) result = caseModelElement(offcanvas);
				if (result == null) result = caseStringIdentity(offcanvas);
				if (result == null) result = caseDocumented(offcanvas);
				if (result == null) result = caseMarked(offcanvas);
				if (result == null) result = caseReferrable(offcanvas);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OverlaysPackage.OFFCANVAS_HEADER: {
				OffcanvasHeader offcanvasHeader = (OffcanvasHeader)theEObject;
				T result = caseOffcanvasHeader(offcanvasHeader);
				if (result == null) result = caseBootstrapComponent(offcanvasHeader);
				if (result == null) result = caseLibraryComponent(offcanvasHeader);
				if (result == null) result = caseJsxContainer(offcanvasHeader);
				if (result == null) result = caseJsxNode(offcanvasHeader);
				if (result == null) result = caseReactElement(offcanvasHeader);
				if (result == null) result = caseTypeScriptElement(offcanvasHeader);
				if (result == null) result = caseNamedElement(offcanvasHeader);
				if (result == null) result = caseModelElement(offcanvasHeader);
				if (result == null) result = caseStringIdentity(offcanvasHeader);
				if (result == null) result = caseDocumented(offcanvasHeader);
				if (result == null) result = caseMarked(offcanvasHeader);
				if (result == null) result = caseReferrable(offcanvasHeader);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OverlaysPackage.OFFCANVAS_TITLE: {
				OffcanvasTitle offcanvasTitle = (OffcanvasTitle)theEObject;
				T result = caseOffcanvasTitle(offcanvasTitle);
				if (result == null) result = caseBootstrapComponent(offcanvasTitle);
				if (result == null) result = caseTextContent(offcanvasTitle);
				if (result == null) result = caseLibraryComponent(offcanvasTitle);
				if (result == null) result = caseJsxContainer(offcanvasTitle);
				if (result == null) result = caseJsxNode(offcanvasTitle);
				if (result == null) result = caseReactElement(offcanvasTitle);
				if (result == null) result = caseTypeScriptElement(offcanvasTitle);
				if (result == null) result = caseNamedElement(offcanvasTitle);
				if (result == null) result = caseModelElement(offcanvasTitle);
				if (result == null) result = caseStringIdentity(offcanvasTitle);
				if (result == null) result = caseDocumented(offcanvasTitle);
				if (result == null) result = caseMarked(offcanvasTitle);
				if (result == null) result = caseReferrable(offcanvasTitle);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OverlaysPackage.OFFCANVAS_BODY: {
				OffcanvasBody offcanvasBody = (OffcanvasBody)theEObject;
				T result = caseOffcanvasBody(offcanvasBody);
				if (result == null) result = caseBootstrapComponent(offcanvasBody);
				if (result == null) result = caseTextContent(offcanvasBody);
				if (result == null) result = caseLibraryComponent(offcanvasBody);
				if (result == null) result = caseJsxContainer(offcanvasBody);
				if (result == null) result = caseJsxNode(offcanvasBody);
				if (result == null) result = caseReactElement(offcanvasBody);
				if (result == null) result = caseTypeScriptElement(offcanvasBody);
				if (result == null) result = caseNamedElement(offcanvasBody);
				if (result == null) result = caseModelElement(offcanvasBody);
				if (result == null) result = caseStringIdentity(offcanvasBody);
				if (result == null) result = caseDocumented(offcanvasBody);
				if (result == null) result = caseMarked(offcanvasBody);
				if (result == null) result = caseReferrable(offcanvasBody);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OverlaysPackage.TOAST: {
				Toast toast = (Toast)theEObject;
				T result = caseToast(toast);
				if (result == null) result = caseBootstrapComponent(toast);
				if (result == null) result = caseLibraryComponent(toast);
				if (result == null) result = caseJsxContainer(toast);
				if (result == null) result = caseJsxNode(toast);
				if (result == null) result = caseReactElement(toast);
				if (result == null) result = caseTypeScriptElement(toast);
				if (result == null) result = caseNamedElement(toast);
				if (result == null) result = caseModelElement(toast);
				if (result == null) result = caseStringIdentity(toast);
				if (result == null) result = caseDocumented(toast);
				if (result == null) result = caseMarked(toast);
				if (result == null) result = caseReferrable(toast);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OverlaysPackage.TOAST_HEADER: {
				ToastHeader toastHeader = (ToastHeader)theEObject;
				T result = caseToastHeader(toastHeader);
				if (result == null) result = caseBootstrapComponent(toastHeader);
				if (result == null) result = caseLibraryComponent(toastHeader);
				if (result == null) result = caseJsxContainer(toastHeader);
				if (result == null) result = caseJsxNode(toastHeader);
				if (result == null) result = caseReactElement(toastHeader);
				if (result == null) result = caseTypeScriptElement(toastHeader);
				if (result == null) result = caseNamedElement(toastHeader);
				if (result == null) result = caseModelElement(toastHeader);
				if (result == null) result = caseStringIdentity(toastHeader);
				if (result == null) result = caseDocumented(toastHeader);
				if (result == null) result = caseMarked(toastHeader);
				if (result == null) result = caseReferrable(toastHeader);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OverlaysPackage.TOAST_BODY: {
				ToastBody toastBody = (ToastBody)theEObject;
				T result = caseToastBody(toastBody);
				if (result == null) result = caseBootstrapComponent(toastBody);
				if (result == null) result = caseTextContent(toastBody);
				if (result == null) result = caseLibraryComponent(toastBody);
				if (result == null) result = caseJsxContainer(toastBody);
				if (result == null) result = caseJsxNode(toastBody);
				if (result == null) result = caseReactElement(toastBody);
				if (result == null) result = caseTypeScriptElement(toastBody);
				if (result == null) result = caseNamedElement(toastBody);
				if (result == null) result = caseModelElement(toastBody);
				if (result == null) result = caseStringIdentity(toastBody);
				if (result == null) result = caseDocumented(toastBody);
				if (result == null) result = caseMarked(toastBody);
				if (result == null) result = caseReferrable(toastBody);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OverlaysPackage.TOAST_CONTAINER: {
				ToastContainer toastContainer = (ToastContainer)theEObject;
				T result = caseToastContainer(toastContainer);
				if (result == null) result = caseBootstrapComponent(toastContainer);
				if (result == null) result = caseLibraryComponent(toastContainer);
				if (result == null) result = caseJsxContainer(toastContainer);
				if (result == null) result = caseJsxNode(toastContainer);
				if (result == null) result = caseReactElement(toastContainer);
				if (result == null) result = caseTypeScriptElement(toastContainer);
				if (result == null) result = caseNamedElement(toastContainer);
				if (result == null) result = caseModelElement(toastContainer);
				if (result == null) result = caseStringIdentity(toastContainer);
				if (result == null) result = caseDocumented(toastContainer);
				if (result == null) result = caseMarked(toastContainer);
				if (result == null) result = caseReferrable(toastContainer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OverlaysPackage.OVERLAY_TRIGGER: {
				OverlayTrigger overlayTrigger = (OverlayTrigger)theEObject;
				T result = caseOverlayTrigger(overlayTrigger);
				if (result == null) result = caseBootstrapComponent(overlayTrigger);
				if (result == null) result = caseLibraryComponent(overlayTrigger);
				if (result == null) result = caseJsxContainer(overlayTrigger);
				if (result == null) result = caseJsxNode(overlayTrigger);
				if (result == null) result = caseReactElement(overlayTrigger);
				if (result == null) result = caseTypeScriptElement(overlayTrigger);
				if (result == null) result = caseNamedElement(overlayTrigger);
				if (result == null) result = caseModelElement(overlayTrigger);
				if (result == null) result = caseStringIdentity(overlayTrigger);
				if (result == null) result = caseDocumented(overlayTrigger);
				if (result == null) result = caseMarked(overlayTrigger);
				if (result == null) result = caseReferrable(overlayTrigger);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OverlaysPackage.TOOLTIP: {
				Tooltip tooltip = (Tooltip)theEObject;
				T result = caseTooltip(tooltip);
				if (result == null) result = caseBootstrapComponent(tooltip);
				if (result == null) result = caseTextContent(tooltip);
				if (result == null) result = caseLibraryComponent(tooltip);
				if (result == null) result = caseJsxContainer(tooltip);
				if (result == null) result = caseJsxNode(tooltip);
				if (result == null) result = caseReactElement(tooltip);
				if (result == null) result = caseTypeScriptElement(tooltip);
				if (result == null) result = caseNamedElement(tooltip);
				if (result == null) result = caseModelElement(tooltip);
				if (result == null) result = caseStringIdentity(tooltip);
				if (result == null) result = caseDocumented(tooltip);
				if (result == null) result = caseMarked(tooltip);
				if (result == null) result = caseReferrable(tooltip);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OverlaysPackage.POPOVER: {
				Popover popover = (Popover)theEObject;
				T result = casePopover(popover);
				if (result == null) result = caseBootstrapComponent(popover);
				if (result == null) result = caseLibraryComponent(popover);
				if (result == null) result = caseJsxContainer(popover);
				if (result == null) result = caseJsxNode(popover);
				if (result == null) result = caseReactElement(popover);
				if (result == null) result = caseTypeScriptElement(popover);
				if (result == null) result = caseNamedElement(popover);
				if (result == null) result = caseModelElement(popover);
				if (result == null) result = caseStringIdentity(popover);
				if (result == null) result = caseDocumented(popover);
				if (result == null) result = caseMarked(popover);
				if (result == null) result = caseReferrable(popover);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OverlaysPackage.POPOVER_HEADER: {
				PopoverHeader popoverHeader = (PopoverHeader)theEObject;
				T result = casePopoverHeader(popoverHeader);
				if (result == null) result = caseBootstrapComponent(popoverHeader);
				if (result == null) result = caseTextContent(popoverHeader);
				if (result == null) result = caseLibraryComponent(popoverHeader);
				if (result == null) result = caseJsxContainer(popoverHeader);
				if (result == null) result = caseJsxNode(popoverHeader);
				if (result == null) result = caseReactElement(popoverHeader);
				if (result == null) result = caseTypeScriptElement(popoverHeader);
				if (result == null) result = caseNamedElement(popoverHeader);
				if (result == null) result = caseModelElement(popoverHeader);
				if (result == null) result = caseStringIdentity(popoverHeader);
				if (result == null) result = caseDocumented(popoverHeader);
				if (result == null) result = caseMarked(popoverHeader);
				if (result == null) result = caseReferrable(popoverHeader);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OverlaysPackage.POPOVER_BODY: {
				PopoverBody popoverBody = (PopoverBody)theEObject;
				T result = casePopoverBody(popoverBody);
				if (result == null) result = caseBootstrapComponent(popoverBody);
				if (result == null) result = caseTextContent(popoverBody);
				if (result == null) result = caseLibraryComponent(popoverBody);
				if (result == null) result = caseJsxContainer(popoverBody);
				if (result == null) result = caseJsxNode(popoverBody);
				if (result == null) result = caseReactElement(popoverBody);
				if (result == null) result = caseTypeScriptElement(popoverBody);
				if (result == null) result = caseNamedElement(popoverBody);
				if (result == null) result = caseModelElement(popoverBody);
				if (result == null) result = caseStringIdentity(popoverBody);
				if (result == null) result = caseDocumented(popoverBody);
				if (result == null) result = caseMarked(popoverBody);
				if (result == null) result = caseReferrable(popoverBody);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Modal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Modal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModal(Modal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Modal Header</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Modal Header</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModalHeader(ModalHeader object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Modal Title</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Modal Title</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModalTitle(ModalTitle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Modal Body</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Modal Body</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModalBody(ModalBody object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Modal Footer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Modal Footer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModalFooter(ModalFooter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Offcanvas</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Offcanvas</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOffcanvas(Offcanvas object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Offcanvas Header</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Offcanvas Header</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOffcanvasHeader(OffcanvasHeader object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Offcanvas Title</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Offcanvas Title</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOffcanvasTitle(OffcanvasTitle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Offcanvas Body</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Offcanvas Body</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOffcanvasBody(OffcanvasBody object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Toast</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Toast</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseToast(Toast object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Toast Header</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Toast Header</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseToastHeader(ToastHeader object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Toast Body</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Toast Body</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseToastBody(ToastBody object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Toast Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Toast Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseToastContainer(ToastContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Overlay Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Overlay Trigger</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOverlayTrigger(OverlayTrigger object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tooltip</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tooltip</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTooltip(Tooltip object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Popover</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Popover</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePopover(Popover object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Popover Header</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Popover Header</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePopoverHeader(PopoverHeader object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Popover Body</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Popover Body</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePopoverBody(PopoverBody object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Referrable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Referrable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReferrable(Referrable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String Identity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String Identity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStringIdentity(StringIdentity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Documented</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Documented</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumented(Documented object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Marked</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Marked</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMarked(Marked object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModelElement(ModelElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedElement(NamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Script Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Script Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeScriptElement(TypeScriptElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReactElement(ReactElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Jsx Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Jsx Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJsxNode(JsxNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Jsx Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Jsx Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJsxContainer(JsxContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Library Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Library Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLibraryComponent(LibraryComponent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBootstrapComponent(BootstrapComponent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Text Content</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Text Content</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTextContent(TextContent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //OverlaysSwitch
