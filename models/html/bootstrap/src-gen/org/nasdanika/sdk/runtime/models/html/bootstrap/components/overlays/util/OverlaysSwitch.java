/**
 */
package org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.nasdanika.sdk.runtime.models.core.Marked;

import org.nasdanika.sdk.runtime.models.html.Container;
import org.nasdanika.sdk.runtime.models.html.Element;
import org.nasdanika.sdk.runtime.models.html.LibraryElement;
import org.nasdanika.sdk.runtime.models.html.Node;

import org.nasdanika.sdk.runtime.models.html.bootstrap.BootstrapElement;
import org.nasdanika.sdk.runtime.models.html.bootstrap.TextContent;

import org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.Button;

import org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.*;

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
 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.OverlaysPackage
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
			case OverlaysPackage.TOGGLE: {
				Toggle toggle = (Toggle)theEObject;
				T result = caseToggle(toggle);
				if (result == null) result = caseButton(toggle);
				if (result == null) result = caseBootstrapElement(toggle);
				if (result == null) result = caseTextContent(toggle);
				if (result == null) result = caseLibraryElement(toggle);
				if (result == null) result = caseElement(toggle);
				if (result == null) result = caseContainer(toggle);
				if (result == null) result = caseNode(toggle);
				if (result == null) result = caseMarked(toggle);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OverlaysPackage.MODAL: {
				Modal modal = (Modal)theEObject;
				T result = caseModal(modal);
				if (result == null) result = caseBootstrapElement(modal);
				if (result == null) result = caseLibraryElement(modal);
				if (result == null) result = caseElement(modal);
				if (result == null) result = caseContainer(modal);
				if (result == null) result = caseNode(modal);
				if (result == null) result = caseMarked(modal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OverlaysPackage.MODAL_HEADER: {
				ModalHeader modalHeader = (ModalHeader)theEObject;
				T result = caseModalHeader(modalHeader);
				if (result == null) result = caseBootstrapElement(modalHeader);
				if (result == null) result = caseLibraryElement(modalHeader);
				if (result == null) result = caseElement(modalHeader);
				if (result == null) result = caseContainer(modalHeader);
				if (result == null) result = caseNode(modalHeader);
				if (result == null) result = caseMarked(modalHeader);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OverlaysPackage.MODAL_TITLE: {
				ModalTitle modalTitle = (ModalTitle)theEObject;
				T result = caseModalTitle(modalTitle);
				if (result == null) result = caseBootstrapElement(modalTitle);
				if (result == null) result = caseTextContent(modalTitle);
				if (result == null) result = caseLibraryElement(modalTitle);
				if (result == null) result = caseElement(modalTitle);
				if (result == null) result = caseContainer(modalTitle);
				if (result == null) result = caseNode(modalTitle);
				if (result == null) result = caseMarked(modalTitle);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OverlaysPackage.MODAL_BODY: {
				ModalBody modalBody = (ModalBody)theEObject;
				T result = caseModalBody(modalBody);
				if (result == null) result = caseBootstrapElement(modalBody);
				if (result == null) result = caseTextContent(modalBody);
				if (result == null) result = caseLibraryElement(modalBody);
				if (result == null) result = caseElement(modalBody);
				if (result == null) result = caseContainer(modalBody);
				if (result == null) result = caseNode(modalBody);
				if (result == null) result = caseMarked(modalBody);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OverlaysPackage.MODAL_FOOTER: {
				ModalFooter modalFooter = (ModalFooter)theEObject;
				T result = caseModalFooter(modalFooter);
				if (result == null) result = caseBootstrapElement(modalFooter);
				if (result == null) result = caseLibraryElement(modalFooter);
				if (result == null) result = caseElement(modalFooter);
				if (result == null) result = caseContainer(modalFooter);
				if (result == null) result = caseNode(modalFooter);
				if (result == null) result = caseMarked(modalFooter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OverlaysPackage.OFFCANVAS: {
				Offcanvas offcanvas = (Offcanvas)theEObject;
				T result = caseOffcanvas(offcanvas);
				if (result == null) result = caseBootstrapElement(offcanvas);
				if (result == null) result = caseLibraryElement(offcanvas);
				if (result == null) result = caseElement(offcanvas);
				if (result == null) result = caseContainer(offcanvas);
				if (result == null) result = caseNode(offcanvas);
				if (result == null) result = caseMarked(offcanvas);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OverlaysPackage.OFFCANVAS_HEADER: {
				OffcanvasHeader offcanvasHeader = (OffcanvasHeader)theEObject;
				T result = caseOffcanvasHeader(offcanvasHeader);
				if (result == null) result = caseBootstrapElement(offcanvasHeader);
				if (result == null) result = caseLibraryElement(offcanvasHeader);
				if (result == null) result = caseElement(offcanvasHeader);
				if (result == null) result = caseContainer(offcanvasHeader);
				if (result == null) result = caseNode(offcanvasHeader);
				if (result == null) result = caseMarked(offcanvasHeader);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OverlaysPackage.OFFCANVAS_TITLE: {
				OffcanvasTitle offcanvasTitle = (OffcanvasTitle)theEObject;
				T result = caseOffcanvasTitle(offcanvasTitle);
				if (result == null) result = caseBootstrapElement(offcanvasTitle);
				if (result == null) result = caseTextContent(offcanvasTitle);
				if (result == null) result = caseLibraryElement(offcanvasTitle);
				if (result == null) result = caseElement(offcanvasTitle);
				if (result == null) result = caseContainer(offcanvasTitle);
				if (result == null) result = caseNode(offcanvasTitle);
				if (result == null) result = caseMarked(offcanvasTitle);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OverlaysPackage.OFFCANVAS_BODY: {
				OffcanvasBody offcanvasBody = (OffcanvasBody)theEObject;
				T result = caseOffcanvasBody(offcanvasBody);
				if (result == null) result = caseBootstrapElement(offcanvasBody);
				if (result == null) result = caseTextContent(offcanvasBody);
				if (result == null) result = caseLibraryElement(offcanvasBody);
				if (result == null) result = caseElement(offcanvasBody);
				if (result == null) result = caseContainer(offcanvasBody);
				if (result == null) result = caseNode(offcanvasBody);
				if (result == null) result = caseMarked(offcanvasBody);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OverlaysPackage.TOAST: {
				Toast toast = (Toast)theEObject;
				T result = caseToast(toast);
				if (result == null) result = caseBootstrapElement(toast);
				if (result == null) result = caseLibraryElement(toast);
				if (result == null) result = caseElement(toast);
				if (result == null) result = caseContainer(toast);
				if (result == null) result = caseNode(toast);
				if (result == null) result = caseMarked(toast);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OverlaysPackage.TOAST_HEADER: {
				ToastHeader toastHeader = (ToastHeader)theEObject;
				T result = caseToastHeader(toastHeader);
				if (result == null) result = caseBootstrapElement(toastHeader);
				if (result == null) result = caseLibraryElement(toastHeader);
				if (result == null) result = caseElement(toastHeader);
				if (result == null) result = caseContainer(toastHeader);
				if (result == null) result = caseNode(toastHeader);
				if (result == null) result = caseMarked(toastHeader);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OverlaysPackage.TOAST_BODY: {
				ToastBody toastBody = (ToastBody)theEObject;
				T result = caseToastBody(toastBody);
				if (result == null) result = caseBootstrapElement(toastBody);
				if (result == null) result = caseTextContent(toastBody);
				if (result == null) result = caseLibraryElement(toastBody);
				if (result == null) result = caseElement(toastBody);
				if (result == null) result = caseContainer(toastBody);
				if (result == null) result = caseNode(toastBody);
				if (result == null) result = caseMarked(toastBody);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OverlaysPackage.TOAST_CONTAINER: {
				ToastContainer toastContainer = (ToastContainer)theEObject;
				T result = caseToastContainer(toastContainer);
				if (result == null) result = caseBootstrapElement(toastContainer);
				if (result == null) result = caseLibraryElement(toastContainer);
				if (result == null) result = caseElement(toastContainer);
				if (result == null) result = caseContainer(toastContainer);
				if (result == null) result = caseNode(toastContainer);
				if (result == null) result = caseMarked(toastContainer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OverlaysPackage.OVERLAY: {
				Overlay overlay = (Overlay)theEObject;
				T result = caseOverlay(overlay);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OverlaysPackage.TOOLTIP: {
				Tooltip tooltip = (Tooltip)theEObject;
				T result = caseTooltip(tooltip);
				if (result == null) result = caseOverlay(tooltip);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OverlaysPackage.POPOVER: {
				Popover popover = (Popover)theEObject;
				T result = casePopover(popover);
				if (result == null) result = caseOverlay(popover);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OverlaysPackage.OVERLAY_TRIGGER: {
				OverlayTrigger overlayTrigger = (OverlayTrigger)theEObject;
				T result = caseOverlayTrigger(overlayTrigger);
				if (result == null) result = caseBootstrapElement(overlayTrigger);
				if (result == null) result = caseLibraryElement(overlayTrigger);
				if (result == null) result = caseElement(overlayTrigger);
				if (result == null) result = caseContainer(overlayTrigger);
				if (result == null) result = caseNode(overlayTrigger);
				if (result == null) result = caseMarked(overlayTrigger);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Toggle</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Toggle</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseToggle(Toggle object) {
		return null;
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
	 * Returns the result of interpreting the object as an instance of '<em>Overlay</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Overlay</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOverlay(Overlay object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNode(Node object) {
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
	public T caseElement(Element object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContainer(Container object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Library Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Library Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLibraryElement(LibraryElement object) {
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
	public T caseBootstrapElement(BootstrapElement object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Button</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Button</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseButton(Button object) {
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
