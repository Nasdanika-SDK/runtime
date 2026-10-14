/**
 */
package org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.impl;

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

import org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.Accordion;
import org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.AccordionBody;
import org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.AccordionHeader;
import org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.AccordionItem;
import org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.Alert;
import org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.AlertHeading;
import org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.AlertLink;
import org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.Badge;
import org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.Button;
import org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.ButtonGroup;
import org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.ButtonToolbar;
import org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.ButtonType;
import org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.Card;
import org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.CardBody;
import org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.CardFooter;
import org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.CardGroup;
import org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.CardHeader;
import org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.CardImage;
import org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.CardImageVariant;
import org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.CardLink;
import org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.CardSubtitle;
import org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.CardText;
import org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.CardTitle;
import org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.Carousel;
import org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.CarouselCaption;
import org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.CarouselItem;
import org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.CarouselVariant;
import org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.CloseButton;
import org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.ContentFactory;
import org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.ContentPackage;
import org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.ListGroup;
import org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.ListGroupItem;
import org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.Placeholder;
import org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.PlaceholderAnimation;
import org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.PlaceholderButton;
import org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.PlaceholderGroup;
import org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.PlaceholderSize;
import org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.ProgressBar;
import org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.Spinner;
import org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.SpinnerAnimation;
import org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.Table;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ContentPackageImpl extends EPackageImpl implements ContentPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass alertEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass alertHeadingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass alertLinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass badgeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass buttonEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass buttonGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass buttonToolbarEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass closeButtonEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cardEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cardHeaderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cardImageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cardBodyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cardTitleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cardSubtitleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cardTextEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cardLinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cardFooterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cardGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listGroupItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass progressBarEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass spinnerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass placeholderGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass placeholderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass placeholderButtonEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass accordionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass accordionItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass accordionHeaderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass accordionBodyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass carouselEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass carouselItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass carouselCaptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum buttonTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum cardImageVariantEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum spinnerAnimationEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum placeholderAnimationEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum placeholderSizeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum carouselVariantEEnum = null;

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
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.ContentPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ContentPackageImpl() {
		super(eNS_URI, ContentFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ContentPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ContentPackage init() {
		if (isInited) return (ContentPackage)EPackage.Registry.INSTANCE.getEPackage(ContentPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredContentPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		ContentPackageImpl theContentPackage = registeredContentPackage instanceof ContentPackageImpl ? (ContentPackageImpl)registeredContentPackage : new ContentPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		BootstrapPackage.eINSTANCE.eClass();
		HtmlPackage.eINSTANCE.eClass();
		CorePackage.eINSTANCE.eClass();
		EcorePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theContentPackage.createPackageContents();

		// Initialize created meta-data
		theContentPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theContentPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ContentPackage.eNS_URI, theContentPackage);
		return theContentPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAlert() {
		return alertEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAlert_Variant() {
		return (EAttribute)alertEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAlert_Dismissible() {
		return (EAttribute)alertEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAlert_Heading() {
		return (EReference)alertEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAlertHeading() {
		return alertHeadingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAlertLink() {
		return alertLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAlertLink_Href() {
		return (EAttribute)alertLinkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBadge() {
		return badgeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBadge_Bg() {
		return (EAttribute)badgeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBadge_Pill() {
		return (EAttribute)badgeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getButton() {
		return buttonEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getButton_Variant() {
		return (EAttribute)buttonEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getButton_Size() {
		return (EAttribute)buttonEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getButton_ButtonType() {
		return (EAttribute)buttonEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getButton_Active() {
		return (EAttribute)buttonEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getButton_Disabled() {
		return (EAttribute)buttonEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getButton_Href() {
		return (EAttribute)buttonEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getButtonGroup() {
		return buttonGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getButtonGroup_Size() {
		return (EAttribute)buttonGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getButtonGroup_Vertical() {
		return (EAttribute)buttonGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getButtonGroup_Buttons() {
		return (EReference)buttonGroupEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getButtonToolbar() {
		return buttonToolbarEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getButtonToolbar_Groups() {
		return (EReference)buttonToolbarEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCloseButton() {
		return closeButtonEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCloseButton_Disabled() {
		return (EAttribute)closeButtonEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCard() {
		return cardEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCard_Bg() {
		return (EAttribute)cardEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCard_TextColor() {
		return (EAttribute)cardEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCard_Border() {
		return (EAttribute)cardEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCard_Header() {
		return (EReference)cardEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCard_Image() {
		return (EReference)cardEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCard_Bodies() {
		return (EReference)cardEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCard_Footer() {
		return (EReference)cardEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCardHeader() {
		return cardHeaderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCardImage() {
		return cardImageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCardImage_Variant() {
		return (EAttribute)cardImageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCardImage_Src() {
		return (EAttribute)cardImageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCardImage_Alt() {
		return (EAttribute)cardImageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCardBody() {
		return cardBodyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCardBody_Title() {
		return (EReference)cardBodyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCardBody_Subtitle() {
		return (EReference)cardBodyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCardBody_Texts() {
		return (EReference)cardBodyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCardBody_Links() {
		return (EReference)cardBodyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCardTitle() {
		return cardTitleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCardSubtitle() {
		return cardSubtitleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCardText() {
		return cardTextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCardLink() {
		return cardLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCardLink_Href() {
		return (EAttribute)cardLinkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCardFooter() {
		return cardFooterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCardGroup() {
		return cardGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCardGroup_Cards() {
		return (EReference)cardGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListGroup() {
		return listGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getListGroup_Flush() {
		return (EAttribute)listGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getListGroup_Numbered() {
		return (EAttribute)listGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getListGroup_Horizontal() {
		return (EAttribute)listGroupEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getListGroup_HorizontalFrom() {
		return (EAttribute)listGroupEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getListGroup_Items() {
		return (EReference)listGroupEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListGroupItem() {
		return listGroupItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getListGroupItem_Variant() {
		return (EAttribute)listGroupItemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getListGroupItem_Action() {
		return (EAttribute)listGroupItemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getListGroupItem_Active() {
		return (EAttribute)listGroupItemEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getListGroupItem_Disabled() {
		return (EAttribute)listGroupItemEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getListGroupItem_Href() {
		return (EAttribute)listGroupItemEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTable() {
		return tableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTable_Striped() {
		return (EAttribute)tableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTable_Bordered() {
		return (EAttribute)tableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTable_Borderless() {
		return (EAttribute)tableEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTable_Hover() {
		return (EAttribute)tableEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTable_Size() {
		return (EAttribute)tableEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTable_Variant() {
		return (EAttribute)tableEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTable_Responsive() {
		return (EAttribute)tableEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTable_ResponsiveBelow() {
		return (EAttribute)tableEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTable_Head() {
		return (EReference)tableEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTable_Bodies() {
		return (EReference)tableEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTable_Foot() {
		return (EReference)tableEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProgressBar() {
		return progressBarEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProgressBar_Now() {
		return (EAttribute)progressBarEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProgressBar_Min() {
		return (EAttribute)progressBarEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProgressBar_Max() {
		return (EAttribute)progressBarEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProgressBar_Label() {
		return (EAttribute)progressBarEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProgressBar_VisuallyHidden() {
		return (EAttribute)progressBarEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProgressBar_Variant() {
		return (EAttribute)progressBarEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProgressBar_Striped() {
		return (EAttribute)progressBarEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProgressBar_Animated() {
		return (EAttribute)progressBarEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProgressBar_Bars() {
		return (EReference)progressBarEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSpinner() {
		return spinnerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpinner_Animation() {
		return (EAttribute)spinnerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpinner_Variant() {
		return (EAttribute)spinnerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpinner_Size() {
		return (EAttribute)spinnerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlaceholderGroup() {
		return placeholderGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlaceholderGroup_Animation() {
		return (EAttribute)placeholderGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlaceholderGroup_Placeholders() {
		return (EReference)placeholderGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlaceholder() {
		return placeholderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlaceholder_Bg() {
		return (EAttribute)placeholderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlaceholder_Size() {
		return (EAttribute)placeholderEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlaceholder_Sizes() {
		return (EReference)placeholderEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlaceholderButton() {
		return placeholderButtonEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlaceholderButton_Variant() {
		return (EAttribute)placeholderButtonEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlaceholderButton_Sizes() {
		return (EReference)placeholderButtonEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAccordion() {
		return accordionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAccordion_DefaultActiveKey() {
		return (EAttribute)accordionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAccordion_Flush() {
		return (EAttribute)accordionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAccordion_AlwaysOpen() {
		return (EAttribute)accordionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAccordion_Items() {
		return (EReference)accordionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAccordionItem() {
		return accordionItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAccordionItem_EventKey() {
		return (EAttribute)accordionItemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAccordionItem_Header() {
		return (EReference)accordionItemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAccordionItem_Body() {
		return (EReference)accordionItemEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAccordionHeader() {
		return accordionHeaderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAccordionBody() {
		return accordionBodyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCarousel() {
		return carouselEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCarousel_Controls() {
		return (EAttribute)carouselEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCarousel_Indicators() {
		return (EAttribute)carouselEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCarousel_Fade() {
		return (EAttribute)carouselEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCarousel_Interval() {
		return (EAttribute)carouselEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCarousel_Variant() {
		return (EAttribute)carouselEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCarousel_Items() {
		return (EReference)carouselEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCarouselItem() {
		return carouselItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCarouselItem_Interval() {
		return (EAttribute)carouselItemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCarouselItem_Content() {
		return (EReference)carouselItemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCarouselItem_Caption() {
		return (EReference)carouselItemEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCarouselCaption() {
		return carouselCaptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCarouselCaption_Content() {
		return (EReference)carouselCaptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getButtonType() {
		return buttonTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCardImageVariant() {
		return cardImageVariantEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSpinnerAnimation() {
		return spinnerAnimationEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPlaceholderAnimation() {
		return placeholderAnimationEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPlaceholderSize() {
		return placeholderSizeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCarouselVariant() {
		return carouselVariantEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContentFactory getContentFactory() {
		return (ContentFactory)getEFactoryInstance();
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
		alertEClass = createEClass(ALERT);
		createEAttribute(alertEClass, ALERT__VARIANT);
		createEAttribute(alertEClass, ALERT__DISMISSIBLE);
		createEReference(alertEClass, ALERT__HEADING);

		alertHeadingEClass = createEClass(ALERT_HEADING);

		alertLinkEClass = createEClass(ALERT_LINK);
		createEAttribute(alertLinkEClass, ALERT_LINK__HREF);

		badgeEClass = createEClass(BADGE);
		createEAttribute(badgeEClass, BADGE__BG);
		createEAttribute(badgeEClass, BADGE__PILL);

		buttonEClass = createEClass(BUTTON);
		createEAttribute(buttonEClass, BUTTON__VARIANT);
		createEAttribute(buttonEClass, BUTTON__SIZE);
		createEAttribute(buttonEClass, BUTTON__BUTTON_TYPE);
		createEAttribute(buttonEClass, BUTTON__ACTIVE);
		createEAttribute(buttonEClass, BUTTON__DISABLED);
		createEAttribute(buttonEClass, BUTTON__HREF);

		buttonGroupEClass = createEClass(BUTTON_GROUP);
		createEAttribute(buttonGroupEClass, BUTTON_GROUP__SIZE);
		createEAttribute(buttonGroupEClass, BUTTON_GROUP__VERTICAL);
		createEReference(buttonGroupEClass, BUTTON_GROUP__BUTTONS);

		buttonToolbarEClass = createEClass(BUTTON_TOOLBAR);
		createEReference(buttonToolbarEClass, BUTTON_TOOLBAR__GROUPS);

		closeButtonEClass = createEClass(CLOSE_BUTTON);
		createEAttribute(closeButtonEClass, CLOSE_BUTTON__DISABLED);

		cardEClass = createEClass(CARD);
		createEAttribute(cardEClass, CARD__BG);
		createEAttribute(cardEClass, CARD__TEXT_COLOR);
		createEAttribute(cardEClass, CARD__BORDER);
		createEReference(cardEClass, CARD__HEADER);
		createEReference(cardEClass, CARD__IMAGE);
		createEReference(cardEClass, CARD__BODIES);
		createEReference(cardEClass, CARD__FOOTER);

		cardHeaderEClass = createEClass(CARD_HEADER);

		cardImageEClass = createEClass(CARD_IMAGE);
		createEAttribute(cardImageEClass, CARD_IMAGE__VARIANT);
		createEAttribute(cardImageEClass, CARD_IMAGE__SRC);
		createEAttribute(cardImageEClass, CARD_IMAGE__ALT);

		cardBodyEClass = createEClass(CARD_BODY);
		createEReference(cardBodyEClass, CARD_BODY__TITLE);
		createEReference(cardBodyEClass, CARD_BODY__SUBTITLE);
		createEReference(cardBodyEClass, CARD_BODY__TEXTS);
		createEReference(cardBodyEClass, CARD_BODY__LINKS);

		cardTitleEClass = createEClass(CARD_TITLE);

		cardSubtitleEClass = createEClass(CARD_SUBTITLE);

		cardTextEClass = createEClass(CARD_TEXT);

		cardLinkEClass = createEClass(CARD_LINK);
		createEAttribute(cardLinkEClass, CARD_LINK__HREF);

		cardFooterEClass = createEClass(CARD_FOOTER);

		cardGroupEClass = createEClass(CARD_GROUP);
		createEReference(cardGroupEClass, CARD_GROUP__CARDS);

		listGroupEClass = createEClass(LIST_GROUP);
		createEAttribute(listGroupEClass, LIST_GROUP__FLUSH);
		createEAttribute(listGroupEClass, LIST_GROUP__NUMBERED);
		createEAttribute(listGroupEClass, LIST_GROUP__HORIZONTAL);
		createEAttribute(listGroupEClass, LIST_GROUP__HORIZONTAL_FROM);
		createEReference(listGroupEClass, LIST_GROUP__ITEMS);

		listGroupItemEClass = createEClass(LIST_GROUP_ITEM);
		createEAttribute(listGroupItemEClass, LIST_GROUP_ITEM__VARIANT);
		createEAttribute(listGroupItemEClass, LIST_GROUP_ITEM__ACTION);
		createEAttribute(listGroupItemEClass, LIST_GROUP_ITEM__ACTIVE);
		createEAttribute(listGroupItemEClass, LIST_GROUP_ITEM__DISABLED);
		createEAttribute(listGroupItemEClass, LIST_GROUP_ITEM__HREF);

		tableEClass = createEClass(TABLE);
		createEAttribute(tableEClass, TABLE__STRIPED);
		createEAttribute(tableEClass, TABLE__BORDERED);
		createEAttribute(tableEClass, TABLE__BORDERLESS);
		createEAttribute(tableEClass, TABLE__HOVER);
		createEAttribute(tableEClass, TABLE__SIZE);
		createEAttribute(tableEClass, TABLE__VARIANT);
		createEAttribute(tableEClass, TABLE__RESPONSIVE);
		createEAttribute(tableEClass, TABLE__RESPONSIVE_BELOW);
		createEReference(tableEClass, TABLE__HEAD);
		createEReference(tableEClass, TABLE__BODIES);
		createEReference(tableEClass, TABLE__FOOT);

		progressBarEClass = createEClass(PROGRESS_BAR);
		createEAttribute(progressBarEClass, PROGRESS_BAR__NOW);
		createEAttribute(progressBarEClass, PROGRESS_BAR__MIN);
		createEAttribute(progressBarEClass, PROGRESS_BAR__MAX);
		createEAttribute(progressBarEClass, PROGRESS_BAR__LABEL);
		createEAttribute(progressBarEClass, PROGRESS_BAR__VISUALLY_HIDDEN);
		createEAttribute(progressBarEClass, PROGRESS_BAR__VARIANT);
		createEAttribute(progressBarEClass, PROGRESS_BAR__STRIPED);
		createEAttribute(progressBarEClass, PROGRESS_BAR__ANIMATED);
		createEReference(progressBarEClass, PROGRESS_BAR__BARS);

		spinnerEClass = createEClass(SPINNER);
		createEAttribute(spinnerEClass, SPINNER__ANIMATION);
		createEAttribute(spinnerEClass, SPINNER__VARIANT);
		createEAttribute(spinnerEClass, SPINNER__SIZE);

		placeholderGroupEClass = createEClass(PLACEHOLDER_GROUP);
		createEAttribute(placeholderGroupEClass, PLACEHOLDER_GROUP__ANIMATION);
		createEReference(placeholderGroupEClass, PLACEHOLDER_GROUP__PLACEHOLDERS);

		placeholderEClass = createEClass(PLACEHOLDER);
		createEAttribute(placeholderEClass, PLACEHOLDER__BG);
		createEAttribute(placeholderEClass, PLACEHOLDER__SIZE);
		createEReference(placeholderEClass, PLACEHOLDER__SIZES);

		placeholderButtonEClass = createEClass(PLACEHOLDER_BUTTON);
		createEAttribute(placeholderButtonEClass, PLACEHOLDER_BUTTON__VARIANT);
		createEReference(placeholderButtonEClass, PLACEHOLDER_BUTTON__SIZES);

		accordionEClass = createEClass(ACCORDION);
		createEAttribute(accordionEClass, ACCORDION__DEFAULT_ACTIVE_KEY);
		createEAttribute(accordionEClass, ACCORDION__FLUSH);
		createEAttribute(accordionEClass, ACCORDION__ALWAYS_OPEN);
		createEReference(accordionEClass, ACCORDION__ITEMS);

		accordionItemEClass = createEClass(ACCORDION_ITEM);
		createEAttribute(accordionItemEClass, ACCORDION_ITEM__EVENT_KEY);
		createEReference(accordionItemEClass, ACCORDION_ITEM__HEADER);
		createEReference(accordionItemEClass, ACCORDION_ITEM__BODY);

		accordionHeaderEClass = createEClass(ACCORDION_HEADER);

		accordionBodyEClass = createEClass(ACCORDION_BODY);

		carouselEClass = createEClass(CAROUSEL);
		createEAttribute(carouselEClass, CAROUSEL__CONTROLS);
		createEAttribute(carouselEClass, CAROUSEL__INDICATORS);
		createEAttribute(carouselEClass, CAROUSEL__FADE);
		createEAttribute(carouselEClass, CAROUSEL__INTERVAL);
		createEAttribute(carouselEClass, CAROUSEL__VARIANT);
		createEReference(carouselEClass, CAROUSEL__ITEMS);

		carouselItemEClass = createEClass(CAROUSEL_ITEM);
		createEAttribute(carouselItemEClass, CAROUSEL_ITEM__INTERVAL);
		createEReference(carouselItemEClass, CAROUSEL_ITEM__CONTENT);
		createEReference(carouselItemEClass, CAROUSEL_ITEM__CAPTION);

		carouselCaptionEClass = createEClass(CAROUSEL_CAPTION);
		createEReference(carouselCaptionEClass, CAROUSEL_CAPTION__CONTENT);

		// Create enums
		buttonTypeEEnum = createEEnum(BUTTON_TYPE);
		cardImageVariantEEnum = createEEnum(CARD_IMAGE_VARIANT);
		spinnerAnimationEEnum = createEEnum(SPINNER_ANIMATION);
		placeholderAnimationEEnum = createEEnum(PLACEHOLDER_ANIMATION);
		placeholderSizeEEnum = createEEnum(PLACEHOLDER_SIZE);
		carouselVariantEEnum = createEEnum(CAROUSEL_VARIANT);
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
		BootstrapPackage theBootstrapPackage = (BootstrapPackage)EPackage.Registry.INSTANCE.getEPackage(BootstrapPackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);
		HtmlPackage theHtmlPackage = (HtmlPackage)EPackage.Registry.INSTANCE.getEPackage(HtmlPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		alertEClass.getESuperTypes().add(theBootstrapPackage.getBootstrapElement());
		alertEClass.getESuperTypes().add(theBootstrapPackage.getTextContent());
		alertHeadingEClass.getESuperTypes().add(theBootstrapPackage.getBootstrapElement());
		alertHeadingEClass.getESuperTypes().add(theBootstrapPackage.getTextContent());
		alertLinkEClass.getESuperTypes().add(theBootstrapPackage.getBootstrapElement());
		alertLinkEClass.getESuperTypes().add(theBootstrapPackage.getTextContent());
		badgeEClass.getESuperTypes().add(theBootstrapPackage.getBootstrapElement());
		badgeEClass.getESuperTypes().add(theBootstrapPackage.getTextContent());
		buttonEClass.getESuperTypes().add(theBootstrapPackage.getBootstrapElement());
		buttonEClass.getESuperTypes().add(theBootstrapPackage.getTextContent());
		buttonGroupEClass.getESuperTypes().add(theBootstrapPackage.getBootstrapElement());
		buttonToolbarEClass.getESuperTypes().add(theBootstrapPackage.getBootstrapElement());
		closeButtonEClass.getESuperTypes().add(theBootstrapPackage.getBootstrapElement());
		cardEClass.getESuperTypes().add(theBootstrapPackage.getBootstrapElement());
		cardHeaderEClass.getESuperTypes().add(theBootstrapPackage.getBootstrapElement());
		cardHeaderEClass.getESuperTypes().add(theBootstrapPackage.getTextContent());
		cardImageEClass.getESuperTypes().add(theBootstrapPackage.getBootstrapElement());
		cardBodyEClass.getESuperTypes().add(theBootstrapPackage.getBootstrapElement());
		cardTitleEClass.getESuperTypes().add(theBootstrapPackage.getBootstrapElement());
		cardTitleEClass.getESuperTypes().add(theBootstrapPackage.getTextContent());
		cardSubtitleEClass.getESuperTypes().add(theBootstrapPackage.getBootstrapElement());
		cardSubtitleEClass.getESuperTypes().add(theBootstrapPackage.getTextContent());
		cardTextEClass.getESuperTypes().add(theBootstrapPackage.getBootstrapElement());
		cardTextEClass.getESuperTypes().add(theBootstrapPackage.getTextContent());
		cardLinkEClass.getESuperTypes().add(theBootstrapPackage.getBootstrapElement());
		cardLinkEClass.getESuperTypes().add(theBootstrapPackage.getTextContent());
		cardFooterEClass.getESuperTypes().add(theBootstrapPackage.getBootstrapElement());
		cardFooterEClass.getESuperTypes().add(theBootstrapPackage.getTextContent());
		cardGroupEClass.getESuperTypes().add(theBootstrapPackage.getBootstrapElement());
		listGroupEClass.getESuperTypes().add(theBootstrapPackage.getBootstrapElement());
		listGroupItemEClass.getESuperTypes().add(theBootstrapPackage.getBootstrapElement());
		listGroupItemEClass.getESuperTypes().add(theBootstrapPackage.getTextContent());
		tableEClass.getESuperTypes().add(theBootstrapPackage.getBootstrapElement());
		progressBarEClass.getESuperTypes().add(theBootstrapPackage.getBootstrapElement());
		spinnerEClass.getESuperTypes().add(theBootstrapPackage.getBootstrapElement());
		spinnerEClass.getESuperTypes().add(theBootstrapPackage.getTextContent());
		placeholderGroupEClass.getESuperTypes().add(theBootstrapPackage.getBootstrapElement());
		placeholderEClass.getESuperTypes().add(theBootstrapPackage.getBootstrapElement());
		placeholderButtonEClass.getESuperTypes().add(theBootstrapPackage.getBootstrapElement());
		accordionEClass.getESuperTypes().add(theBootstrapPackage.getBootstrapElement());
		accordionItemEClass.getESuperTypes().add(theBootstrapPackage.getBootstrapElement());
		accordionHeaderEClass.getESuperTypes().add(theBootstrapPackage.getBootstrapElement());
		accordionHeaderEClass.getESuperTypes().add(theBootstrapPackage.getTextContent());
		accordionBodyEClass.getESuperTypes().add(theBootstrapPackage.getBootstrapElement());
		accordionBodyEClass.getESuperTypes().add(theBootstrapPackage.getTextContent());
		carouselEClass.getESuperTypes().add(theBootstrapPackage.getBootstrapElement());
		carouselItemEClass.getESuperTypes().add(theBootstrapPackage.getBootstrapElement());
		carouselCaptionEClass.getESuperTypes().add(theBootstrapPackage.getBootstrapElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(alertEClass, Alert.class, "Alert", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAlert_Variant(), theBootstrapPackage.getVariant(), "variant", null, 0, 1, Alert.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAlert_Dismissible(), theEcorePackage.getEBoolean(), "dismissible", null, 0, 1, Alert.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAlert_Heading(), this.getAlertHeading(), null, "heading", null, 0, 1, Alert.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(alertHeadingEClass, AlertHeading.class, "AlertHeading", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(alertLinkEClass, AlertLink.class, "AlertLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAlertLink_Href(), theEcorePackage.getEString(), "href", null, 0, 1, AlertLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(badgeEClass, Badge.class, "Badge", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBadge_Bg(), theBootstrapPackage.getVariant(), "bg", null, 0, 1, Badge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBadge_Pill(), theEcorePackage.getEBoolean(), "pill", null, 0, 1, Badge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(buttonEClass, Button.class, "Button", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getButton_Variant(), theBootstrapPackage.getButtonVariant(), "variant", null, 0, 1, Button.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getButton_Size(), theBootstrapPackage.getSize(), "size", null, 0, 1, Button.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getButton_ButtonType(), this.getButtonType(), "buttonType", null, 0, 1, Button.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getButton_Active(), theEcorePackage.getEBoolean(), "active", null, 0, 1, Button.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getButton_Disabled(), theEcorePackage.getEBoolean(), "disabled", null, 0, 1, Button.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getButton_Href(), theEcorePackage.getEString(), "href", null, 0, 1, Button.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(buttonGroupEClass, ButtonGroup.class, "ButtonGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getButtonGroup_Size(), theBootstrapPackage.getSize(), "size", null, 0, 1, ButtonGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getButtonGroup_Vertical(), theEcorePackage.getEBoolean(), "vertical", null, 0, 1, ButtonGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getButtonGroup_Buttons(), theHtmlPackage.getNode(), null, "buttons", null, 0, -1, ButtonGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(buttonToolbarEClass, ButtonToolbar.class, "ButtonToolbar", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getButtonToolbar_Groups(), this.getButtonGroup(), null, "groups", null, 0, -1, ButtonToolbar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(closeButtonEClass, CloseButton.class, "CloseButton", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCloseButton_Disabled(), theEcorePackage.getEBoolean(), "disabled", null, 0, 1, CloseButton.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cardEClass, Card.class, "Card", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCard_Bg(), theBootstrapPackage.getVariant(), "bg", null, 0, 1, Card.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCard_TextColor(), theBootstrapPackage.getVariant(), "textColor", null, 0, 1, Card.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCard_Border(), theBootstrapPackage.getVariant(), "border", null, 0, 1, Card.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCard_Header(), this.getCardHeader(), null, "header", null, 0, 1, Card.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCard_Image(), this.getCardImage(), null, "image", null, 0, 1, Card.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCard_Bodies(), this.getCardBody(), null, "bodies", null, 0, -1, Card.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCard_Footer(), this.getCardFooter(), null, "footer", null, 0, 1, Card.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cardHeaderEClass, CardHeader.class, "CardHeader", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(cardImageEClass, CardImage.class, "CardImage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCardImage_Variant(), this.getCardImageVariant(), "variant", null, 0, 1, CardImage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCardImage_Src(), theEcorePackage.getEString(), "src", null, 0, 1, CardImage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCardImage_Alt(), theEcorePackage.getEString(), "alt", null, 0, 1, CardImage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cardBodyEClass, CardBody.class, "CardBody", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCardBody_Title(), this.getCardTitle(), null, "title", null, 0, 1, CardBody.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCardBody_Subtitle(), this.getCardSubtitle(), null, "subtitle", null, 0, 1, CardBody.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCardBody_Texts(), this.getCardText(), null, "texts", null, 0, -1, CardBody.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCardBody_Links(), this.getCardLink(), null, "links", null, 0, -1, CardBody.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cardTitleEClass, CardTitle.class, "CardTitle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(cardSubtitleEClass, CardSubtitle.class, "CardSubtitle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(cardTextEClass, CardText.class, "CardText", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(cardLinkEClass, CardLink.class, "CardLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCardLink_Href(), theEcorePackage.getEString(), "href", null, 0, 1, CardLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cardFooterEClass, CardFooter.class, "CardFooter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(cardGroupEClass, CardGroup.class, "CardGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCardGroup_Cards(), this.getCard(), null, "cards", null, 0, -1, CardGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(listGroupEClass, ListGroup.class, "ListGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getListGroup_Flush(), theEcorePackage.getEBoolean(), "flush", null, 0, 1, ListGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getListGroup_Numbered(), theEcorePackage.getEBoolean(), "numbered", null, 0, 1, ListGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getListGroup_Horizontal(), theEcorePackage.getEBoolean(), "horizontal", null, 0, 1, ListGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getListGroup_HorizontalFrom(), theBootstrapPackage.getBreakpoint(), "horizontalFrom", null, 0, 1, ListGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getListGroup_Items(), this.getListGroupItem(), null, "items", null, 0, -1, ListGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(listGroupItemEClass, ListGroupItem.class, "ListGroupItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getListGroupItem_Variant(), theBootstrapPackage.getVariant(), "variant", null, 0, 1, ListGroupItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getListGroupItem_Action(), theEcorePackage.getEBoolean(), "action", null, 0, 1, ListGroupItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getListGroupItem_Active(), theEcorePackage.getEBoolean(), "active", null, 0, 1, ListGroupItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getListGroupItem_Disabled(), theEcorePackage.getEBoolean(), "disabled", null, 0, 1, ListGroupItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getListGroupItem_Href(), theEcorePackage.getEString(), "href", null, 0, 1, ListGroupItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tableEClass, Table.class, "Table", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTable_Striped(), theEcorePackage.getEBoolean(), "striped", null, 0, 1, Table.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTable_Bordered(), theEcorePackage.getEBoolean(), "bordered", null, 0, 1, Table.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTable_Borderless(), theEcorePackage.getEBoolean(), "borderless", null, 0, 1, Table.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTable_Hover(), theEcorePackage.getEBoolean(), "hover", null, 0, 1, Table.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTable_Size(), theBootstrapPackage.getSize(), "size", null, 0, 1, Table.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTable_Variant(), theBootstrapPackage.getVariant(), "variant", null, 0, 1, Table.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTable_Responsive(), theEcorePackage.getEBoolean(), "responsive", null, 0, 1, Table.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTable_ResponsiveBelow(), theBootstrapPackage.getBreakpoint(), "responsiveBelow", null, 0, 1, Table.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTable_Head(), theHtmlPackage.getTableHead(), null, "head", null, 0, 1, Table.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTable_Bodies(), theHtmlPackage.getTableBody(), null, "bodies", null, 0, -1, Table.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTable_Foot(), theHtmlPackage.getTableFoot(), null, "foot", null, 0, 1, Table.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(progressBarEClass, ProgressBar.class, "ProgressBar", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProgressBar_Now(), theEcorePackage.getEInt(), "now", null, 0, 1, ProgressBar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProgressBar_Min(), theEcorePackage.getEInt(), "min", null, 0, 1, ProgressBar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProgressBar_Max(), theEcorePackage.getEInt(), "max", null, 0, 1, ProgressBar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProgressBar_Label(), theEcorePackage.getEString(), "label", null, 0, 1, ProgressBar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProgressBar_VisuallyHidden(), theEcorePackage.getEBoolean(), "visuallyHidden", null, 0, 1, ProgressBar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProgressBar_Variant(), theBootstrapPackage.getVariant(), "variant", null, 0, 1, ProgressBar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProgressBar_Striped(), theEcorePackage.getEBoolean(), "striped", null, 0, 1, ProgressBar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProgressBar_Animated(), theEcorePackage.getEBoolean(), "animated", null, 0, 1, ProgressBar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProgressBar_Bars(), this.getProgressBar(), null, "bars", null, 0, -1, ProgressBar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(spinnerEClass, Spinner.class, "Spinner", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSpinner_Animation(), this.getSpinnerAnimation(), "animation", null, 0, 1, Spinner.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpinner_Variant(), theBootstrapPackage.getVariant(), "variant", null, 0, 1, Spinner.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpinner_Size(), theBootstrapPackage.getSize(), "size", null, 0, 1, Spinner.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(placeholderGroupEClass, PlaceholderGroup.class, "PlaceholderGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPlaceholderGroup_Animation(), this.getPlaceholderAnimation(), "animation", null, 0, 1, PlaceholderGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPlaceholderGroup_Placeholders(), this.getPlaceholder(), null, "placeholders", null, 0, -1, PlaceholderGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(placeholderEClass, Placeholder.class, "Placeholder", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPlaceholder_Bg(), theBootstrapPackage.getVariant(), "bg", null, 0, 1, Placeholder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlaceholder_Size(), this.getPlaceholderSize(), "size", null, 0, 1, Placeholder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPlaceholder_Sizes(), theBootstrapPackage.getColumnSize(), null, "sizes", null, 0, -1, Placeholder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(placeholderButtonEClass, PlaceholderButton.class, "PlaceholderButton", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPlaceholderButton_Variant(), theBootstrapPackage.getButtonVariant(), "variant", null, 0, 1, PlaceholderButton.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPlaceholderButton_Sizes(), theBootstrapPackage.getColumnSize(), null, "sizes", null, 0, -1, PlaceholderButton.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(accordionEClass, Accordion.class, "Accordion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAccordion_DefaultActiveKey(), theEcorePackage.getEString(), "defaultActiveKey", null, 0, 1, Accordion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAccordion_Flush(), theEcorePackage.getEBoolean(), "flush", null, 0, 1, Accordion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAccordion_AlwaysOpen(), theEcorePackage.getEBoolean(), "alwaysOpen", null, 0, 1, Accordion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAccordion_Items(), this.getAccordionItem(), null, "items", null, 0, -1, Accordion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(accordionItemEClass, AccordionItem.class, "AccordionItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAccordionItem_EventKey(), theEcorePackage.getEString(), "eventKey", null, 0, 1, AccordionItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAccordionItem_Header(), this.getAccordionHeader(), null, "header", null, 0, 1, AccordionItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAccordionItem_Body(), this.getAccordionBody(), null, "body", null, 0, 1, AccordionItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(accordionHeaderEClass, AccordionHeader.class, "AccordionHeader", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(accordionBodyEClass, AccordionBody.class, "AccordionBody", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(carouselEClass, Carousel.class, "Carousel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCarousel_Controls(), theEcorePackage.getEBoolean(), "controls", null, 0, 1, Carousel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCarousel_Indicators(), theEcorePackage.getEBoolean(), "indicators", null, 0, 1, Carousel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCarousel_Fade(), theEcorePackage.getEBoolean(), "fade", null, 0, 1, Carousel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCarousel_Interval(), theEcorePackage.getEInt(), "interval", null, 0, 1, Carousel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCarousel_Variant(), this.getCarouselVariant(), "variant", null, 0, 1, Carousel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCarousel_Items(), this.getCarouselItem(), null, "items", null, 0, -1, Carousel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(carouselItemEClass, CarouselItem.class, "CarouselItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCarouselItem_Interval(), theEcorePackage.getEInt(), "interval", null, 0, 1, CarouselItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCarouselItem_Content(), theHtmlPackage.getNode(), null, "content", null, 0, 1, CarouselItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCarouselItem_Caption(), this.getCarouselCaption(), null, "caption", null, 0, 1, CarouselItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(carouselCaptionEClass, CarouselCaption.class, "CarouselCaption", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCarouselCaption_Content(), theHtmlPackage.getNode(), null, "content", null, 0, -1, CarouselCaption.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(buttonTypeEEnum, ButtonType.class, "ButtonType");
		addEEnumLiteral(buttonTypeEEnum, ButtonType.BUTTON);
		addEEnumLiteral(buttonTypeEEnum, ButtonType.SUBMIT);
		addEEnumLiteral(buttonTypeEEnum, ButtonType.RESET);

		initEEnum(cardImageVariantEEnum, CardImageVariant.class, "CardImageVariant");
		addEEnumLiteral(cardImageVariantEEnum, CardImageVariant.TOP);
		addEEnumLiteral(cardImageVariantEEnum, CardImageVariant.BOTTOM);

		initEEnum(spinnerAnimationEEnum, SpinnerAnimation.class, "SpinnerAnimation");
		addEEnumLiteral(spinnerAnimationEEnum, SpinnerAnimation.BORDER);
		addEEnumLiteral(spinnerAnimationEEnum, SpinnerAnimation.GROW);

		initEEnum(placeholderAnimationEEnum, PlaceholderAnimation.class, "PlaceholderAnimation");
		addEEnumLiteral(placeholderAnimationEEnum, PlaceholderAnimation.GLOW);
		addEEnumLiteral(placeholderAnimationEEnum, PlaceholderAnimation.WAVE);

		initEEnum(placeholderSizeEEnum, PlaceholderSize.class, "PlaceholderSize");
		addEEnumLiteral(placeholderSizeEEnum, PlaceholderSize.XS);
		addEEnumLiteral(placeholderSizeEEnum, PlaceholderSize.SM);
		addEEnumLiteral(placeholderSizeEEnum, PlaceholderSize.LG);

		initEEnum(carouselVariantEEnum, CarouselVariant.class, "CarouselVariant");
		addEEnumLiteral(carouselVariantEEnum, CarouselVariant.DARK);

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
		  (alertEClass,
		   source,
		   new String[] {
			   "documentation", "A dismissible alert gets a close button."
		   });
		addAnnotation
		  (buttonEClass,
		   source,
		   new String[] {
			   "documentation", "button, or a link styled as a button if href is set."
		   });
		addAnnotation
		  (buttonGroupEClass,
		   source,
		   new String[] {
			   "documentation", "btn-group, or btn-group-vertical."
		   });
		addAnnotation
		  (cardImageEClass,
		   source,
		   new String[] {
			   "documentation", "card-img-top, card-img-bottom, or card-img for an overlay."
		   });
		addAnnotation
		  (listGroupEClass,
		   source,
		   new String[] {
			   "documentation", "ul, or ol if numbered."
		   });
		addAnnotation
		  (listGroupItemEClass,
		   source,
		   new String[] {
			   "documentation", "li, or a link if href is set."
		   });
		addAnnotation
		  (tableEClass,
		   source,
		   new String[] {
			   "documentation", "Table with HTML sections. A responsive table is wrapped in table-responsive."
		   });
		addAnnotation
		  (getTable_ResponsiveBelow(),
		   source,
		   new String[] {
			   "documentation", " Responsive below the breakpoint. Wins over responsive."
		   });
		addAnnotation
		  (progressBarEClass,
		   source,
		   new String[] {
			   "documentation", "A progress bar, or a stacked progress bar of bars."
		   });
		addAnnotation
		  (getProgressBar_Bars(),
		   source,
		   new String[] {
			   "documentation", " Bars of a stacked progress bar, each with now"
		   });
		addAnnotation
		  (spinnerEClass,
		   source,
		   new String[] {
			   "documentation", "Spinner with its content as visually hidden text, e.g. \"Loading...\"."
		   });
		addAnnotation
		  (placeholderGroupEClass,
		   source,
		   new String[] {
			   "documentation", "Animated group of placeholders - Placeholder as=\"p\" animation=\"glow\" in React Bootstrap."
		   });
		addAnnotation
		  (placeholderEClass,
		   source,
		   new String[] {
			   "documentation", "Loading placeholder. Width in columns with sizes, e.g. col-6."
		   });
		addAnnotation
		  (accordionEClass,
		   source,
		   new String[] {
			   "documentation", "Items collapse into the accordion unless it is always open. The id of the accordion\nand of its items is generated if not set."
		   });
		addAnnotation
		  (getAccordion_DefaultActiveKey(),
		   source,
		   new String[] {
			   "documentation", " Event key of the item open initially, the first if not set"
		   });
		addAnnotation
		  (getAccordionItem_EventKey(),
		   source,
		   new String[] {
			   "documentation", " The index of the item if not set"
		   });
		addAnnotation
		  (accordionHeaderEClass,
		   source,
		   new String[] {
			   "documentation", "The text of the toggle button of the item."
		   });
		addAnnotation
		  (getCarousel_Interval(),
		   source,
		   new String[] {
			   "documentation", " Milliseconds between slides"
		   });
		addAnnotation
		  (carouselItemEClass,
		   source,
		   new String[] {
			   "documentation", "A slide, the first is active."
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
		  (alertEClass,
		   source,
		   new String[] {
			   "tag", "div",
			   "classes", "alert",
			   "attributes", "role=alert"
		   });
		addAnnotation
		  (getAlert_Variant(),
		   source,
		   new String[] {
			   "classes", "alert-{}",
			   "default", "primary"
		   });
		addAnnotation
		  (getAlert_Dismissible(),
		   source,
		   new String[] {
			   "logical", "true"
		   });
		addAnnotation
		  (alertHeadingEClass,
		   source,
		   new String[] {
			   "tag", "h4",
			   "classes", "alert-heading"
		   });
		addAnnotation
		  (alertLinkEClass,
		   source,
		   new String[] {
			   "tag", "a",
			   "classes", "alert-link"
		   });
		addAnnotation
		  (badgeEClass,
		   source,
		   new String[] {
			   "tag", "span",
			   "classes", "badge"
		   });
		addAnnotation
		  (getBadge_Bg(),
		   source,
		   new String[] {
			   "classes", "text-bg-{}",
			   "default", "primary"
		   });
		addAnnotation
		  (getBadge_Pill(),
		   source,
		   new String[] {
			   "classes", "rounded-pill"
		   });
		addAnnotation
		  (buttonEClass,
		   source,
		   new String[] {
			   "tag", "button",
			   "classes", "btn",
			   "attributes", "type=button"
		   });
		addAnnotation
		  (getButton_Variant(),
		   source,
		   new String[] {
			   "classes", "btn-{}",
			   "default", "primary"
		   });
		addAnnotation
		  (getButton_Size(),
		   source,
		   new String[] {
			   "classes", "btn-{}"
		   });
		addAnnotation
		  (getButton_ButtonType(),
		   source,
		   new String[] {
			   "attribute", "type"
		   });
		addAnnotation
		  (getButton_Active(),
		   source,
		   new String[] {
			   "classes", "active"
		   });
		addAnnotation
		  (getButton_Href(),
		   source,
		   new String[] {
			   "logical", "true"
		   });
		addAnnotation
		  (buttonGroupEClass,
		   source,
		   new String[] {
			   "tag", "div",
			   "attributes", "role=group"
		   });
		addAnnotation
		  (getButtonGroup_Size(),
		   source,
		   new String[] {
			   "classes", "btn-group-{}"
		   });
		addAnnotation
		  (getButtonGroup_Vertical(),
		   source,
		   new String[] {
			   "logical", "true"
		   });
		addAnnotation
		  (buttonToolbarEClass,
		   source,
		   new String[] {
			   "tag", "div",
			   "classes", "btn-toolbar",
			   "attributes", "role=toolbar"
		   });
		addAnnotation
		  (closeButtonEClass,
		   source,
		   new String[] {
			   "tag", "button",
			   "classes", "btn-close",
			   "attributes", "type=button;aria-label=Close"
		   });
		addAnnotation
		  (cardEClass,
		   source,
		   new String[] {
			   "tag", "div",
			   "classes", "card"
		   });
		addAnnotation
		  (getCard_Bg(),
		   source,
		   new String[] {
			   "classes", "bg-{}"
		   });
		addAnnotation
		  (getCard_TextColor(),
		   source,
		   new String[] {
			   "classes", "text-{}"
		   });
		addAnnotation
		  (getCard_Border(),
		   source,
		   new String[] {
			   "classes", "border-{}"
		   });
		addAnnotation
		  (cardHeaderEClass,
		   source,
		   new String[] {
			   "tag", "div",
			   "classes", "card-header"
		   });
		addAnnotation
		  (cardImageEClass,
		   source,
		   new String[] {
			   "tag", "img",
			   "voidElement", "true"
		   });
		addAnnotation
		  (getCardImage_Variant(),
		   source,
		   new String[] {
			   "logical", "true"
		   });
		addAnnotation
		  (cardBodyEClass,
		   source,
		   new String[] {
			   "tag", "div",
			   "classes", "card-body"
		   });
		addAnnotation
		  (cardTitleEClass,
		   source,
		   new String[] {
			   "tag", "h5",
			   "classes", "card-title"
		   });
		addAnnotation
		  (cardSubtitleEClass,
		   source,
		   new String[] {
			   "tag", "h6",
			   "classes", "card-subtitle mb-2 text-body-secondary"
		   });
		addAnnotation
		  (cardTextEClass,
		   source,
		   new String[] {
			   "tag", "p",
			   "classes", "card-text"
		   });
		addAnnotation
		  (cardLinkEClass,
		   source,
		   new String[] {
			   "tag", "a",
			   "classes", "card-link"
		   });
		addAnnotation
		  (cardFooterEClass,
		   source,
		   new String[] {
			   "tag", "div",
			   "classes", "card-footer"
		   });
		addAnnotation
		  (cardGroupEClass,
		   source,
		   new String[] {
			   "tag", "div",
			   "classes", "card-group"
		   });
		addAnnotation
		  (listGroupEClass,
		   source,
		   new String[] {
			   "tag", "ul",
			   "classes", "list-group"
		   });
		addAnnotation
		  (getListGroup_Flush(),
		   source,
		   new String[] {
			   "classes", "list-group-flush"
		   });
		addAnnotation
		  (getListGroup_Numbered(),
		   source,
		   new String[] {
			   "logical", "true"
		   });
		addAnnotation
		  (getListGroup_Horizontal(),
		   source,
		   new String[] {
			   "classes", "list-group-horizontal"
		   });
		addAnnotation
		  (getListGroup_HorizontalFrom(),
		   source,
		   new String[] {
			   "classes", "list-group-horizontal-{}"
		   });
		addAnnotation
		  (listGroupItemEClass,
		   source,
		   new String[] {
			   "tag", "li",
			   "classes", "list-group-item"
		   });
		addAnnotation
		  (getListGroupItem_Variant(),
		   source,
		   new String[] {
			   "classes", "list-group-item-{}"
		   });
		addAnnotation
		  (getListGroupItem_Action(),
		   source,
		   new String[] {
			   "classes", "list-group-item-action"
		   });
		addAnnotation
		  (getListGroupItem_Active(),
		   source,
		   new String[] {
			   "classes", "active"
		   });
		addAnnotation
		  (getListGroupItem_Disabled(),
		   source,
		   new String[] {
			   "classes", "disabled"
		   });
		addAnnotation
		  (getListGroupItem_Href(),
		   source,
		   new String[] {
			   "logical", "true"
		   });
		addAnnotation
		  (tableEClass,
		   source,
		   new String[] {
			   "tag", "table",
			   "classes", "table"
		   });
		addAnnotation
		  (getTable_Striped(),
		   source,
		   new String[] {
			   "classes", "table-striped"
		   });
		addAnnotation
		  (getTable_Bordered(),
		   source,
		   new String[] {
			   "classes", "table-bordered"
		   });
		addAnnotation
		  (getTable_Borderless(),
		   source,
		   new String[] {
			   "classes", "table-borderless"
		   });
		addAnnotation
		  (getTable_Hover(),
		   source,
		   new String[] {
			   "classes", "table-hover"
		   });
		addAnnotation
		  (getTable_Size(),
		   source,
		   new String[] {
			   "classes", "table-{}"
		   });
		addAnnotation
		  (getTable_Variant(),
		   source,
		   new String[] {
			   "classes", "table-{}"
		   });
		addAnnotation
		  (getTable_Responsive(),
		   source,
		   new String[] {
			   "logical", "true"
		   });
		addAnnotation
		  (getTable_ResponsiveBelow(),
		   source,
		   new String[] {
			   "logical", "true"
		   });
		addAnnotation
		  (progressBarEClass,
		   source,
		   new String[] {
			   "tag", "div",
			   "classes", "progress"
		   });
		addAnnotation
		  (getProgressBar_Now(),
		   source,
		   new String[] {
			   "logical", "true"
		   });
		addAnnotation
		  (getProgressBar_Min(),
		   source,
		   new String[] {
			   "logical", "true"
		   });
		addAnnotation
		  (getProgressBar_Max(),
		   source,
		   new String[] {
			   "logical", "true"
		   });
		addAnnotation
		  (getProgressBar_Label(),
		   source,
		   new String[] {
			   "logical", "true"
		   });
		addAnnotation
		  (getProgressBar_VisuallyHidden(),
		   source,
		   new String[] {
			   "logical", "true"
		   });
		addAnnotation
		  (getProgressBar_Variant(),
		   source,
		   new String[] {
			   "logical", "true"
		   });
		addAnnotation
		  (getProgressBar_Striped(),
		   source,
		   new String[] {
			   "logical", "true"
		   });
		addAnnotation
		  (getProgressBar_Animated(),
		   source,
		   new String[] {
			   "logical", "true"
		   });
		addAnnotation
		  (spinnerEClass,
		   source,
		   new String[] {
			   "tag", "div",
			   "attributes", "role=status"
		   });
		addAnnotation
		  (getSpinner_Animation(),
		   source,
		   new String[] {
			   "logical", "true"
		   });
		addAnnotation
		  (getSpinner_Variant(),
		   source,
		   new String[] {
			   "classes", "text-{}"
		   });
		addAnnotation
		  (getSpinner_Size(),
		   source,
		   new String[] {
			   "logical", "true"
		   });
		addAnnotation
		  (placeholderGroupEClass,
		   source,
		   new String[] {
			   "tag", "p"
		   });
		addAnnotation
		  (getPlaceholderGroup_Animation(),
		   source,
		   new String[] {
			   "classes", "placeholder-{}"
		   });
		addAnnotation
		  (placeholderEClass,
		   source,
		   new String[] {
			   "tag", "span",
			   "classes", "placeholder"
		   });
		addAnnotation
		  (getPlaceholder_Bg(),
		   source,
		   new String[] {
			   "classes", "bg-{}"
		   });
		addAnnotation
		  (getPlaceholder_Size(),
		   source,
		   new String[] {
			   "classes", "placeholder-{}"
		   });
		addAnnotation
		  (getPlaceholder_Sizes(),
		   source,
		   new String[] {
			   "logical", "true"
		   });
		addAnnotation
		  (placeholderButtonEClass,
		   source,
		   new String[] {
			   "tag", "a",
			   "classes", "btn disabled placeholder",
			   "attributes", "aria-disabled=true"
		   });
		addAnnotation
		  (getPlaceholderButton_Variant(),
		   source,
		   new String[] {
			   "classes", "btn-{}",
			   "default", "primary"
		   });
		addAnnotation
		  (getPlaceholderButton_Sizes(),
		   source,
		   new String[] {
			   "logical", "true"
		   });
		addAnnotation
		  (accordionEClass,
		   source,
		   new String[] {
			   "tag", "div",
			   "classes", "accordion"
		   });
		addAnnotation
		  (getAccordion_DefaultActiveKey(),
		   source,
		   new String[] {
			   "logical", "true"
		   });
		addAnnotation
		  (getAccordion_Flush(),
		   source,
		   new String[] {
			   "classes", "accordion-flush"
		   });
		addAnnotation
		  (getAccordion_AlwaysOpen(),
		   source,
		   new String[] {
			   "logical", "true"
		   });
		addAnnotation
		  (accordionItemEClass,
		   source,
		   new String[] {
			   "tag", "div",
			   "classes", "accordion-item"
		   });
		addAnnotation
		  (getAccordionItem_EventKey(),
		   source,
		   new String[] {
			   "logical", "true"
		   });
		addAnnotation
		  (accordionHeaderEClass,
		   source,
		   new String[] {
			   "tag", "h2",
			   "classes", "accordion-header"
		   });
		addAnnotation
		  (accordionBodyEClass,
		   source,
		   new String[] {
			   "tag", "div",
			   "classes", "accordion-body"
		   });
		addAnnotation
		  (carouselEClass,
		   source,
		   new String[] {
			   "tag", "div",
			   "classes", "carousel slide",
			   "attributes", "data-bs-ride=carousel"
		   });
		addAnnotation
		  (getCarousel_Controls(),
		   source,
		   new String[] {
			   "logical", "true"
		   });
		addAnnotation
		  (getCarousel_Indicators(),
		   source,
		   new String[] {
			   "logical", "true"
		   });
		addAnnotation
		  (getCarousel_Fade(),
		   source,
		   new String[] {
			   "classes", "carousel-fade"
		   });
		addAnnotation
		  (getCarousel_Interval(),
		   source,
		   new String[] {
			   "attribute", "data-bs-interval"
		   });
		addAnnotation
		  (getCarousel_Variant(),
		   source,
		   new String[] {
			   "attribute", "data-bs-theme"
		   });
		addAnnotation
		  (carouselItemEClass,
		   source,
		   new String[] {
			   "tag", "div",
			   "classes", "carousel-item"
		   });
		addAnnotation
		  (getCarouselItem_Interval(),
		   source,
		   new String[] {
			   "attribute", "data-bs-interval"
		   });
		addAnnotation
		  (carouselCaptionEClass,
		   source,
		   new String[] {
			   "tag", "div",
			   "classes", "carousel-caption d-none d-md-block"
		   });
	}

} //ContentPackageImpl
