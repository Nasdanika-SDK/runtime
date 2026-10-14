/**
 */
package org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.nasdanika.sdk.runtime.models.core.CorePackage;

import org.nasdanika.sdk.runtime.models.html.HtmlPackage;

import org.nasdanika.sdk.runtime.models.html.bootstrap.BootstrapPackage;

import org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.ContentPackage;

import org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.Fullscreen;
import org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.Modal;
import org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.ModalBody;
import org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.ModalFooter;
import org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.ModalHeader;
import org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.ModalSize;
import org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.ModalTitle;
import org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.Offcanvas;
import org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.OffcanvasBody;
import org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.OffcanvasHeader;
import org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.OffcanvasPlacement;
import org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.OffcanvasTitle;
import org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.Overlay;
import org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.OverlayTrigger;
import org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.OverlaysFactory;
import org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.OverlaysPackage;
import org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.Placement;
import org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.Popover;
import org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.Toast;
import org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.ToastBody;
import org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.ToastContainer;
import org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.ToastContainment;
import org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.ToastHeader;
import org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.ToastPosition;
import org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.Toggle;
import org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.Tooltip;
import org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.Trigger;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class OverlaysPackageImpl extends EPackageImpl implements OverlaysPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass toggleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modalHeaderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modalTitleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modalBodyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modalFooterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass offcanvasEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass offcanvasHeaderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass offcanvasTitleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass offcanvasBodyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass toastEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass toastHeaderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass toastBodyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass toastContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass overlayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tooltipEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass popoverEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass overlayTriggerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum modalSizeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum fullscreenEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum offcanvasPlacementEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum toastPositionEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum toastContainmentEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum placementEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum triggerEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.OverlaysPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private OverlaysPackageImpl() {
		super(eNS_URI, OverlaysFactory.eINSTANCE);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link OverlaysPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static OverlaysPackage init() {
		if (isInited) return (OverlaysPackage)EPackage.Registry.INSTANCE.getEPackage(OverlaysPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredOverlaysPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		OverlaysPackageImpl theOverlaysPackage = registeredOverlaysPackage instanceof OverlaysPackageImpl ? (OverlaysPackageImpl)registeredOverlaysPackage : new OverlaysPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		ContentPackage.eINSTANCE.eClass();
		HtmlPackage.eINSTANCE.eClass();
		BootstrapPackage.eINSTANCE.eClass();
		CorePackage.eINSTANCE.eClass();
		EcorePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theOverlaysPackage.createPackageContents();

		// Initialize created meta-data
		theOverlaysPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theOverlaysPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(OverlaysPackage.eNS_URI, theOverlaysPackage);
		return theOverlaysPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getToggle() {
		return toggleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getToggle_Target() {
		return (EReference)toggleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModal() {
		return modalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModal_Size() {
		return (EAttribute)modalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModal_Centered() {
		return (EAttribute)modalEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModal_Scrollable() {
		return (EAttribute)modalEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModal_Fullscreen() {
		return (EAttribute)modalEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModal_FullscreenBelow() {
		return (EAttribute)modalEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModal_StaticBackdrop() {
		return (EAttribute)modalEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModal_Keyboard() {
		return (EAttribute)modalEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModal_Header() {
		return (EReference)modalEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModal_Body() {
		return (EReference)modalEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModal_Footer() {
		return (EReference)modalEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModalHeader() {
		return modalHeaderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModalHeader_CloseButton() {
		return (EAttribute)modalHeaderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModalHeader_Title() {
		return (EReference)modalHeaderEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModalTitle() {
		return modalTitleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModalBody() {
		return modalBodyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModalFooter() {
		return modalFooterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModalFooter_Content() {
		return (EReference)modalFooterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOffcanvas() {
		return offcanvasEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOffcanvas_Placement() {
		return (EAttribute)offcanvasEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOffcanvas_Backdrop() {
		return (EAttribute)offcanvasEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOffcanvas_Scroll() {
		return (EAttribute)offcanvasEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOffcanvas_Header() {
		return (EReference)offcanvasEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOffcanvas_Body() {
		return (EReference)offcanvasEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOffcanvasHeader() {
		return offcanvasHeaderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOffcanvasHeader_CloseButton() {
		return (EAttribute)offcanvasHeaderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOffcanvasHeader_Title() {
		return (EReference)offcanvasHeaderEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOffcanvasTitle() {
		return offcanvasTitleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOffcanvasBody() {
		return offcanvasBodyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getToast() {
		return toastEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getToast_Show() {
		return (EAttribute)toastEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getToast_Bg() {
		return (EAttribute)toastEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getToast_Autohide() {
		return (EAttribute)toastEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getToast_Delay() {
		return (EAttribute)toastEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getToast_Header() {
		return (EReference)toastEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getToast_Body() {
		return (EReference)toastEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getToastHeader() {
		return toastHeaderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getToastHeader_CloseButton() {
		return (EAttribute)toastHeaderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getToastHeader_Content() {
		return (EReference)toastHeaderEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getToastBody() {
		return toastBodyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getToastContainer() {
		return toastContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getToastContainer_Position() {
		return (EAttribute)toastContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getToastContainer_Containment() {
		return (EAttribute)toastContainerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getToastContainer_Toasts() {
		return (EReference)toastContainerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOverlay() {
		return overlayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOverlay_Html() {
		return (EAttribute)overlayEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTooltip() {
		return tooltipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTooltip_Title() {
		return (EAttribute)tooltipEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPopover() {
		return popoverEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPopover_Title() {
		return (EAttribute)popoverEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPopover_Content() {
		return (EAttribute)popoverEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOverlayTrigger() {
		return overlayTriggerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOverlayTrigger_Placement() {
		return (EAttribute)overlayTriggerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOverlayTrigger_Trigger() {
		return (EAttribute)overlayTriggerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOverlayTrigger_Overlay() {
		return (EReference)overlayTriggerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOverlayTrigger_Target() {
		return (EReference)overlayTriggerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getModalSize() {
		return modalSizeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getFullscreen() {
		return fullscreenEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getOffcanvasPlacement() {
		return offcanvasPlacementEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getToastPosition() {
		return toastPositionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getToastContainment() {
		return toastContainmentEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPlacement() {
		return placementEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTrigger() {
		return triggerEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OverlaysFactory getOverlaysFactory() {
		return (OverlaysFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		toggleEClass = createEClass(TOGGLE);
		createEReference(toggleEClass, TOGGLE__TARGET);

		modalEClass = createEClass(MODAL);
		createEAttribute(modalEClass, MODAL__SIZE);
		createEAttribute(modalEClass, MODAL__CENTERED);
		createEAttribute(modalEClass, MODAL__SCROLLABLE);
		createEAttribute(modalEClass, MODAL__FULLSCREEN);
		createEAttribute(modalEClass, MODAL__FULLSCREEN_BELOW);
		createEAttribute(modalEClass, MODAL__STATIC_BACKDROP);
		createEAttribute(modalEClass, MODAL__KEYBOARD);
		createEReference(modalEClass, MODAL__HEADER);
		createEReference(modalEClass, MODAL__BODY);
		createEReference(modalEClass, MODAL__FOOTER);

		modalHeaderEClass = createEClass(MODAL_HEADER);
		createEAttribute(modalHeaderEClass, MODAL_HEADER__CLOSE_BUTTON);
		createEReference(modalHeaderEClass, MODAL_HEADER__TITLE);

		modalTitleEClass = createEClass(MODAL_TITLE);

		modalBodyEClass = createEClass(MODAL_BODY);

		modalFooterEClass = createEClass(MODAL_FOOTER);
		createEReference(modalFooterEClass, MODAL_FOOTER__CONTENT);

		offcanvasEClass = createEClass(OFFCANVAS);
		createEAttribute(offcanvasEClass, OFFCANVAS__PLACEMENT);
		createEAttribute(offcanvasEClass, OFFCANVAS__BACKDROP);
		createEAttribute(offcanvasEClass, OFFCANVAS__SCROLL);
		createEReference(offcanvasEClass, OFFCANVAS__HEADER);
		createEReference(offcanvasEClass, OFFCANVAS__BODY);

		offcanvasHeaderEClass = createEClass(OFFCANVAS_HEADER);
		createEAttribute(offcanvasHeaderEClass, OFFCANVAS_HEADER__CLOSE_BUTTON);
		createEReference(offcanvasHeaderEClass, OFFCANVAS_HEADER__TITLE);

		offcanvasTitleEClass = createEClass(OFFCANVAS_TITLE);

		offcanvasBodyEClass = createEClass(OFFCANVAS_BODY);

		toastEClass = createEClass(TOAST);
		createEAttribute(toastEClass, TOAST__SHOW);
		createEAttribute(toastEClass, TOAST__BG);
		createEAttribute(toastEClass, TOAST__AUTOHIDE);
		createEAttribute(toastEClass, TOAST__DELAY);
		createEReference(toastEClass, TOAST__HEADER);
		createEReference(toastEClass, TOAST__BODY);

		toastHeaderEClass = createEClass(TOAST_HEADER);
		createEAttribute(toastHeaderEClass, TOAST_HEADER__CLOSE_BUTTON);
		createEReference(toastHeaderEClass, TOAST_HEADER__CONTENT);

		toastBodyEClass = createEClass(TOAST_BODY);

		toastContainerEClass = createEClass(TOAST_CONTAINER);
		createEAttribute(toastContainerEClass, TOAST_CONTAINER__POSITION);
		createEAttribute(toastContainerEClass, TOAST_CONTAINER__CONTAINMENT);
		createEReference(toastContainerEClass, TOAST_CONTAINER__TOASTS);

		overlayEClass = createEClass(OVERLAY);
		createEAttribute(overlayEClass, OVERLAY__HTML);

		tooltipEClass = createEClass(TOOLTIP);
		createEAttribute(tooltipEClass, TOOLTIP__TITLE);

		popoverEClass = createEClass(POPOVER);
		createEAttribute(popoverEClass, POPOVER__TITLE);
		createEAttribute(popoverEClass, POPOVER__CONTENT);

		overlayTriggerEClass = createEClass(OVERLAY_TRIGGER);
		createEAttribute(overlayTriggerEClass, OVERLAY_TRIGGER__PLACEMENT);
		createEAttribute(overlayTriggerEClass, OVERLAY_TRIGGER__TRIGGER);
		createEReference(overlayTriggerEClass, OVERLAY_TRIGGER__OVERLAY);
		createEReference(overlayTriggerEClass, OVERLAY_TRIGGER__TARGET);

		// Create enums
		modalSizeEEnum = createEEnum(MODAL_SIZE);
		fullscreenEEnum = createEEnum(FULLSCREEN);
		offcanvasPlacementEEnum = createEEnum(OFFCANVAS_PLACEMENT);
		toastPositionEEnum = createEEnum(TOAST_POSITION);
		toastContainmentEEnum = createEEnum(TOAST_CONTAINMENT);
		placementEEnum = createEEnum(PLACEMENT);
		triggerEEnum = createEEnum(TRIGGER);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		ContentPackage theContentPackage = (ContentPackage)EPackage.Registry.INSTANCE.getEPackage(ContentPackage.eNS_URI);
		HtmlPackage theHtmlPackage = (HtmlPackage)EPackage.Registry.INSTANCE.getEPackage(HtmlPackage.eNS_URI);
		BootstrapPackage theBootstrapPackage = (BootstrapPackage)EPackage.Registry.INSTANCE.getEPackage(BootstrapPackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		toggleEClass.getESuperTypes().add(theContentPackage.getButton());
		modalEClass.getESuperTypes().add(theBootstrapPackage.getBootstrapElement());
		modalHeaderEClass.getESuperTypes().add(theBootstrapPackage.getBootstrapElement());
		modalTitleEClass.getESuperTypes().add(theBootstrapPackage.getBootstrapElement());
		modalTitleEClass.getESuperTypes().add(theBootstrapPackage.getTextContent());
		modalBodyEClass.getESuperTypes().add(theBootstrapPackage.getBootstrapElement());
		modalBodyEClass.getESuperTypes().add(theBootstrapPackage.getTextContent());
		modalFooterEClass.getESuperTypes().add(theBootstrapPackage.getBootstrapElement());
		offcanvasEClass.getESuperTypes().add(theBootstrapPackage.getBootstrapElement());
		offcanvasHeaderEClass.getESuperTypes().add(theBootstrapPackage.getBootstrapElement());
		offcanvasTitleEClass.getESuperTypes().add(theBootstrapPackage.getBootstrapElement());
		offcanvasTitleEClass.getESuperTypes().add(theBootstrapPackage.getTextContent());
		offcanvasBodyEClass.getESuperTypes().add(theBootstrapPackage.getBootstrapElement());
		offcanvasBodyEClass.getESuperTypes().add(theBootstrapPackage.getTextContent());
		toastEClass.getESuperTypes().add(theBootstrapPackage.getBootstrapElement());
		toastHeaderEClass.getESuperTypes().add(theBootstrapPackage.getBootstrapElement());
		toastBodyEClass.getESuperTypes().add(theBootstrapPackage.getBootstrapElement());
		toastBodyEClass.getESuperTypes().add(theBootstrapPackage.getTextContent());
		toastContainerEClass.getESuperTypes().add(theBootstrapPackage.getBootstrapElement());
		tooltipEClass.getESuperTypes().add(this.getOverlay());
		popoverEClass.getESuperTypes().add(this.getOverlay());
		overlayTriggerEClass.getESuperTypes().add(theBootstrapPackage.getBootstrapElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(toggleEClass, Toggle.class, "Toggle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getToggle_Target(), theHtmlPackage.getElement(), null, "target", null, 0, 1, Toggle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modalEClass, Modal.class, "Modal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getModal_Size(), this.getModalSize(), "size", null, 0, 1, Modal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModal_Centered(), theEcorePackage.getEBoolean(), "centered", null, 0, 1, Modal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModal_Scrollable(), theEcorePackage.getEBoolean(), "scrollable", null, 0, 1, Modal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModal_Fullscreen(), theEcorePackage.getEBoolean(), "fullscreen", null, 0, 1, Modal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModal_FullscreenBelow(), this.getFullscreen(), "fullscreenBelow", null, 0, 1, Modal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModal_StaticBackdrop(), theEcorePackage.getEBoolean(), "staticBackdrop", null, 0, 1, Modal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModal_Keyboard(), theEcorePackage.getEBoolean(), "keyboard", null, 0, 1, Modal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModal_Header(), this.getModalHeader(), null, "header", null, 0, 1, Modal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModal_Body(), this.getModalBody(), null, "body", null, 0, 1, Modal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModal_Footer(), this.getModalFooter(), null, "footer", null, 0, 1, Modal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modalHeaderEClass, ModalHeader.class, "ModalHeader", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getModalHeader_CloseButton(), theEcorePackage.getEBoolean(), "closeButton", null, 0, 1, ModalHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModalHeader_Title(), this.getModalTitle(), null, "title", null, 0, 1, ModalHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modalTitleEClass, ModalTitle.class, "ModalTitle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(modalBodyEClass, ModalBody.class, "ModalBody", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(modalFooterEClass, ModalFooter.class, "ModalFooter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModalFooter_Content(), theHtmlPackage.getNode(), null, "content", null, 0, -1, ModalFooter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(offcanvasEClass, Offcanvas.class, "Offcanvas", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOffcanvas_Placement(), this.getOffcanvasPlacement(), "placement", null, 0, 1, Offcanvas.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOffcanvas_Backdrop(), theEcorePackage.getEBoolean(), "backdrop", null, 0, 1, Offcanvas.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOffcanvas_Scroll(), theEcorePackage.getEBoolean(), "scroll", null, 0, 1, Offcanvas.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOffcanvas_Header(), this.getOffcanvasHeader(), null, "header", null, 0, 1, Offcanvas.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOffcanvas_Body(), this.getOffcanvasBody(), null, "body", null, 0, 1, Offcanvas.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(offcanvasHeaderEClass, OffcanvasHeader.class, "OffcanvasHeader", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOffcanvasHeader_CloseButton(), theEcorePackage.getEBoolean(), "closeButton", null, 0, 1, OffcanvasHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOffcanvasHeader_Title(), this.getOffcanvasTitle(), null, "title", null, 0, 1, OffcanvasHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(offcanvasTitleEClass, OffcanvasTitle.class, "OffcanvasTitle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(offcanvasBodyEClass, OffcanvasBody.class, "OffcanvasBody", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(toastEClass, Toast.class, "Toast", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getToast_Show(), theEcorePackage.getEBoolean(), "show", null, 0, 1, Toast.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getToast_Bg(), theBootstrapPackage.getVariant(), "bg", null, 0, 1, Toast.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getToast_Autohide(), theEcorePackage.getEBoolean(), "autohide", null, 0, 1, Toast.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getToast_Delay(), theEcorePackage.getEInt(), "delay", null, 0, 1, Toast.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getToast_Header(), this.getToastHeader(), null, "header", null, 0, 1, Toast.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getToast_Body(), this.getToastBody(), null, "body", null, 0, 1, Toast.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(toastHeaderEClass, ToastHeader.class, "ToastHeader", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getToastHeader_CloseButton(), theEcorePackage.getEBoolean(), "closeButton", null, 0, 1, ToastHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getToastHeader_Content(), theHtmlPackage.getNode(), null, "content", null, 0, -1, ToastHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(toastBodyEClass, ToastBody.class, "ToastBody", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(toastContainerEClass, ToastContainer.class, "ToastContainer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getToastContainer_Position(), this.getToastPosition(), "position", null, 0, 1, ToastContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getToastContainer_Containment(), this.getToastContainment(), "containment", null, 0, 1, ToastContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getToastContainer_Toasts(), this.getToast(), null, "toasts", null, 0, -1, ToastContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(overlayEClass, Overlay.class, "Overlay", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOverlay_Html(), theEcorePackage.getEBoolean(), "html", null, 0, 1, Overlay.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tooltipEClass, Tooltip.class, "Tooltip", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTooltip_Title(), theEcorePackage.getEString(), "title", null, 0, 1, Tooltip.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(popoverEClass, Popover.class, "Popover", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPopover_Title(), theEcorePackage.getEString(), "title", null, 0, 1, Popover.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPopover_Content(), theEcorePackage.getEString(), "content", null, 0, 1, Popover.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(overlayTriggerEClass, OverlayTrigger.class, "OverlayTrigger", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOverlayTrigger_Placement(), this.getPlacement(), "placement", null, 0, 1, OverlayTrigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOverlayTrigger_Trigger(), this.getTrigger(), "trigger", null, 0, -1, OverlayTrigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOverlayTrigger_Overlay(), this.getOverlay(), null, "overlay", null, 0, 1, OverlayTrigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOverlayTrigger_Target(), theHtmlPackage.getNode(), null, "target", null, 0, 1, OverlayTrigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(modalSizeEEnum, ModalSize.class, "ModalSize");
		addEEnumLiteral(modalSizeEEnum, ModalSize.SM);
		addEEnumLiteral(modalSizeEEnum, ModalSize.LG);
		addEEnumLiteral(modalSizeEEnum, ModalSize.XL);

		initEEnum(fullscreenEEnum, Fullscreen.class, "Fullscreen");
		addEEnumLiteral(fullscreenEEnum, Fullscreen.SM_DOWN);
		addEEnumLiteral(fullscreenEEnum, Fullscreen.MD_DOWN);
		addEEnumLiteral(fullscreenEEnum, Fullscreen.LG_DOWN);
		addEEnumLiteral(fullscreenEEnum, Fullscreen.XL_DOWN);
		addEEnumLiteral(fullscreenEEnum, Fullscreen.XXL_DOWN);

		initEEnum(offcanvasPlacementEEnum, OffcanvasPlacement.class, "OffcanvasPlacement");
		addEEnumLiteral(offcanvasPlacementEEnum, OffcanvasPlacement.START);
		addEEnumLiteral(offcanvasPlacementEEnum, OffcanvasPlacement.END);
		addEEnumLiteral(offcanvasPlacementEEnum, OffcanvasPlacement.TOP);
		addEEnumLiteral(offcanvasPlacementEEnum, OffcanvasPlacement.BOTTOM);

		initEEnum(toastPositionEEnum, ToastPosition.class, "ToastPosition");
		addEEnumLiteral(toastPositionEEnum, ToastPosition.TOP_START);
		addEEnumLiteral(toastPositionEEnum, ToastPosition.TOP_CENTER);
		addEEnumLiteral(toastPositionEEnum, ToastPosition.TOP_END);
		addEEnumLiteral(toastPositionEEnum, ToastPosition.MIDDLE_START);
		addEEnumLiteral(toastPositionEEnum, ToastPosition.MIDDLE_CENTER);
		addEEnumLiteral(toastPositionEEnum, ToastPosition.MIDDLE_END);
		addEEnumLiteral(toastPositionEEnum, ToastPosition.BOTTOM_START);
		addEEnumLiteral(toastPositionEEnum, ToastPosition.BOTTOM_CENTER);
		addEEnumLiteral(toastPositionEEnum, ToastPosition.BOTTOM_END);

		initEEnum(toastContainmentEEnum, ToastContainment.class, "ToastContainment");
		addEEnumLiteral(toastContainmentEEnum, ToastContainment.FIXED);
		addEEnumLiteral(toastContainmentEEnum, ToastContainment.ABSOLUTE);
		addEEnumLiteral(toastContainmentEEnum, ToastContainment.RELATIVE);

		initEEnum(placementEEnum, Placement.class, "Placement");
		addEEnumLiteral(placementEEnum, Placement.AUTO);
		addEEnumLiteral(placementEEnum, Placement.TOP);
		addEEnumLiteral(placementEEnum, Placement.BOTTOM);
		addEEnumLiteral(placementEEnum, Placement.LEFT);
		addEEnumLiteral(placementEEnum, Placement.RIGHT);

		initEEnum(triggerEEnum, Trigger.class, "Trigger");
		addEEnumLiteral(triggerEEnum, Trigger.HOVER);
		addEEnumLiteral(triggerEEnum, Trigger.FOCUS);
		addEEnumLiteral(triggerEEnum, Trigger.CLICK);
		addEEnumLiteral(triggerEEnum, Trigger.MANUAL);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/GenModel
		createGenModelAnnotations();
		// http://www.eclipse.org/emf/2011/Xcore
		createXcoreAnnotations();
		// urn:org.nasdanika:html
		createUrnorgAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/GenModel</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGenModelAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/GenModel";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "modelDirectory", "/bootstrap/src-gen",
			   "featureDelegation", "Dynamic",
			   "complianceLevel", "25",
			   "suppressGenModelAnnotations", "false",
			   "copyrightFields", "false",
			   "operationReflection", "true",
			   "importOrganizing", "true",
			   "basePackage", "org.nasdanika.sdk.runtime.models.html.bootstrap.components"
		   });
		addAnnotation
		  (toggleEClass,
		   source,
		   new String[] {
			   "documentation", "Button which opens a modal or an offcanvas, or toggles a collapse, e.g. a navbar collapse.\nThe target id is generated if not set."
		   });
		addAnnotation
		  (modalEClass,
		   source,
		   new String[] {
			   "documentation", "modal, modal-dialog and modal-content around the header, body and footer.\nThe id of the modal is generated if not set."
		   });
		addAnnotation
		  (getModal_FullscreenBelow(),
		   source,
		   new String[] {
			   "documentation", " Fullscreen below the breakpoint. Wins over fullscreen."
		   });
		addAnnotation
		  (getModal_StaticBackdrop(),
		   source,
		   new String[] {
			   "documentation", " Clicking the backdrop does not close the modal"
		   });
		addAnnotation
		  (getModal_Keyboard(),
		   source,
		   new String[] {
			   "documentation", " Escape closes the modal"
		   });
		addAnnotation
		  (offcanvasEClass,
		   source,
		   new String[] {
			   "documentation", "The id of the offcanvas is generated if not set."
		   });
		addAnnotation
		  (getOffcanvas_Scroll(),
		   source,
		   new String[] {
			   "documentation", " Body scrolling while the offcanvas is open"
		   });
		addAnnotation
		  (toastEClass,
		   source,
		   new String[] {
			   "documentation", "Toasts are shown with the show class, or with the Bootstrap JavaScript API."
		   });
		addAnnotation
		  (getToast_Delay(),
		   source,
		   new String[] {
			   "documentation", " Milliseconds before autohide"
		   });
		addAnnotation
		  (toastHeaderEClass,
		   source,
		   new String[] {
			   "documentation", "Header with title and secondary text, followed by a close button unless closeButton is false."
		   });
		addAnnotation
		  (overlayEClass,
		   source,
		   new String[] {
			   "documentation", "Tooltip or popover content of an overlay trigger."
		   });
		addAnnotation
		  (getOverlay_Html(),
		   source,
		   new String[] {
			   "documentation", " Content is HTML"
		   });
		addAnnotation
		  (overlayTriggerEClass,
		   source,
		   new String[] {
			   "documentation", "Shows its overlay - a tooltip or a popover - for its target. Rendered as an inline block\nwrapper of the target with the data attributes of the overlay, which also works for\ndisabled targets."
		   });
		addAnnotation
		  (getOverlayTrigger_Trigger(),
		   source,
		   new String[] {
			   "documentation", " Events showing the overlay"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2011/Xcore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createXcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2011/Xcore";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "Ecore", "http://www.eclipse.org/emf/2002/Ecore",
			   "GenModel", "http://www.eclipse.org/emf/2002/GenModel",
			   "Html", "urn:org.nasdanika:html"
		   });
	}

	/**
	 * Initializes the annotations for <b>urn:org.nasdanika:html</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUrnorgAnnotations() {
		String source = "urn:org.nasdanika:html";
		addAnnotation
		  (getToggle_Target(),
		   source,
		   new String[] {
			   "logical", "true"
		   });
		addAnnotation
		  (modalEClass,
		   source,
		   new String[] {
			   "tag", "div",
			   "classes", "modal fade",
			   "attributes", "tabindex=-1;aria-hidden=true"
		   });
		addAnnotation
		  (getModal_Size(),
		   source,
		   new String[] {
			   "logical", "true"
		   });
		addAnnotation
		  (getModal_Centered(),
		   source,
		   new String[] {
			   "logical", "true"
		   });
		addAnnotation
		  (getModal_Scrollable(),
		   source,
		   new String[] {
			   "logical", "true"
		   });
		addAnnotation
		  (getModal_Fullscreen(),
		   source,
		   new String[] {
			   "logical", "true"
		   });
		addAnnotation
		  (getModal_FullscreenBelow(),
		   source,
		   new String[] {
			   "logical", "true"
		   });
		addAnnotation
		  (getModal_StaticBackdrop(),
		   source,
		   new String[] {
			   "logical", "true"
		   });
		addAnnotation
		  (getModal_Keyboard(),
		   source,
		   new String[] {
			   "logical", "true"
		   });
		addAnnotation
		  (modalHeaderEClass,
		   source,
		   new String[] {
			   "tag", "div",
			   "classes", "modal-header"
		   });
		addAnnotation
		  (getModalHeader_CloseButton(),
		   source,
		   new String[] {
			   "logical", "true"
		   });
		addAnnotation
		  (modalTitleEClass,
		   source,
		   new String[] {
			   "tag", "h1",
			   "classes", "modal-title fs-5"
		   });
		addAnnotation
		  (modalBodyEClass,
		   source,
		   new String[] {
			   "tag", "div",
			   "classes", "modal-body"
		   });
		addAnnotation
		  (modalFooterEClass,
		   source,
		   new String[] {
			   "tag", "div",
			   "classes", "modal-footer"
		   });
		addAnnotation
		  (offcanvasEClass,
		   source,
		   new String[] {
			   "tag", "div",
			   "classes", "offcanvas",
			   "attributes", "tabindex=-1"
		   });
		addAnnotation
		  (getOffcanvas_Placement(),
		   source,
		   new String[] {
			   "classes", "offcanvas-{}",
			   "default", "start"
		   });
		addAnnotation
		  (getOffcanvas_Backdrop(),
		   source,
		   new String[] {
			   "logical", "true"
		   });
		addAnnotation
		  (getOffcanvas_Scroll(),
		   source,
		   new String[] {
			   "logical", "true"
		   });
		addAnnotation
		  (offcanvasHeaderEClass,
		   source,
		   new String[] {
			   "tag", "div",
			   "classes", "offcanvas-header"
		   });
		addAnnotation
		  (getOffcanvasHeader_CloseButton(),
		   source,
		   new String[] {
			   "logical", "true"
		   });
		addAnnotation
		  (offcanvasTitleEClass,
		   source,
		   new String[] {
			   "tag", "h5",
			   "classes", "offcanvas-title"
		   });
		addAnnotation
		  (offcanvasBodyEClass,
		   source,
		   new String[] {
			   "tag", "div",
			   "classes", "offcanvas-body"
		   });
		addAnnotation
		  (toastEClass,
		   source,
		   new String[] {
			   "tag", "div",
			   "classes", "toast",
			   "attributes", "role=alert;aria-live=assertive;aria-atomic=true"
		   });
		addAnnotation
		  (getToast_Show(),
		   source,
		   new String[] {
			   "classes", "show"
		   });
		addAnnotation
		  (getToast_Bg(),
		   source,
		   new String[] {
			   "classes", "text-bg-{}"
		   });
		addAnnotation
		  (getToast_Autohide(),
		   source,
		   new String[] {
			   "logical", "true"
		   });
		addAnnotation
		  (getToast_Delay(),
		   source,
		   new String[] {
			   "attribute", "data-bs-delay"
		   });
		addAnnotation
		  (toastHeaderEClass,
		   source,
		   new String[] {
			   "tag", "div",
			   "classes", "toast-header"
		   });
		addAnnotation
		  (getToastHeader_CloseButton(),
		   source,
		   new String[] {
			   "logical", "true"
		   });
		addAnnotation
		  (toastBodyEClass,
		   source,
		   new String[] {
			   "tag", "div",
			   "classes", "toast-body"
		   });
		addAnnotation
		  (toastContainerEClass,
		   source,
		   new String[] {
			   "tag", "div",
			   "classes", "toast-container"
		   });
		addAnnotation
		  (getToastContainer_Position(),
		   source,
		   new String[] {
			   "logical", "true"
		   });
		addAnnotation
		  (getToastContainer_Containment(),
		   source,
		   new String[] {
			   "classes", "position-{}"
		   });
		addAnnotation
		  (overlayTriggerEClass,
		   source,
		   new String[] {
			   "tag", "span",
			   "classes", "d-inline-block",
			   "attributes", "tabindex=0"
		   });
		addAnnotation
		  (getOverlayTrigger_Placement(),
		   source,
		   new String[] {
			   "logical", "true"
		   });
		addAnnotation
		  (getOverlayTrigger_Trigger(),
		   source,
		   new String[] {
			   "logical", "true"
		   });
		addAnnotation
		  (getOverlayTrigger_Overlay(),
		   source,
		   new String[] {
			   "logical", "true"
		   });
	}

} //OverlaysPackageImpl
