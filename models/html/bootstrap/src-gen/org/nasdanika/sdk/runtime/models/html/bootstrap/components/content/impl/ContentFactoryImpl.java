/**
 */
package org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ContentFactoryImpl extends EFactoryImpl implements ContentFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ContentFactory init() {
		try {
			ContentFactory theContentFactory = (ContentFactory)EPackage.Registry.INSTANCE.getEFactory(ContentPackage.eNS_URI);
			if (theContentFactory != null) {
				return theContentFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ContentFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContentFactoryImpl() {
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
			case ContentPackage.ALERT: return createAlert();
			case ContentPackage.ALERT_HEADING: return createAlertHeading();
			case ContentPackage.ALERT_LINK: return createAlertLink();
			case ContentPackage.BADGE: return createBadge();
			case ContentPackage.BUTTON: return createButton();
			case ContentPackage.BUTTON_GROUP: return createButtonGroup();
			case ContentPackage.BUTTON_TOOLBAR: return createButtonToolbar();
			case ContentPackage.CLOSE_BUTTON: return createCloseButton();
			case ContentPackage.CARD: return createCard();
			case ContentPackage.CARD_HEADER: return createCardHeader();
			case ContentPackage.CARD_IMAGE: return createCardImage();
			case ContentPackage.CARD_BODY: return createCardBody();
			case ContentPackage.CARD_TITLE: return createCardTitle();
			case ContentPackage.CARD_SUBTITLE: return createCardSubtitle();
			case ContentPackage.CARD_TEXT: return createCardText();
			case ContentPackage.CARD_LINK: return createCardLink();
			case ContentPackage.CARD_FOOTER: return createCardFooter();
			case ContentPackage.CARD_GROUP: return createCardGroup();
			case ContentPackage.LIST_GROUP: return createListGroup();
			case ContentPackage.LIST_GROUP_ITEM: return createListGroupItem();
			case ContentPackage.TABLE: return createTable();
			case ContentPackage.PROGRESS_BAR: return createProgressBar();
			case ContentPackage.SPINNER: return createSpinner();
			case ContentPackage.PLACEHOLDER_GROUP: return createPlaceholderGroup();
			case ContentPackage.PLACEHOLDER: return createPlaceholder();
			case ContentPackage.PLACEHOLDER_BUTTON: return createPlaceholderButton();
			case ContentPackage.ACCORDION: return createAccordion();
			case ContentPackage.ACCORDION_ITEM: return createAccordionItem();
			case ContentPackage.ACCORDION_HEADER: return createAccordionHeader();
			case ContentPackage.ACCORDION_BODY: return createAccordionBody();
			case ContentPackage.CAROUSEL: return createCarousel();
			case ContentPackage.CAROUSEL_ITEM: return createCarouselItem();
			case ContentPackage.CAROUSEL_CAPTION: return createCarouselCaption();
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
			case ContentPackage.BUTTON_TYPE:
				return createButtonTypeFromString(eDataType, initialValue);
			case ContentPackage.CARD_IMAGE_VARIANT:
				return createCardImageVariantFromString(eDataType, initialValue);
			case ContentPackage.SPINNER_ANIMATION:
				return createSpinnerAnimationFromString(eDataType, initialValue);
			case ContentPackage.PLACEHOLDER_ANIMATION:
				return createPlaceholderAnimationFromString(eDataType, initialValue);
			case ContentPackage.PLACEHOLDER_SIZE:
				return createPlaceholderSizeFromString(eDataType, initialValue);
			case ContentPackage.CAROUSEL_VARIANT:
				return createCarouselVariantFromString(eDataType, initialValue);
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
			case ContentPackage.BUTTON_TYPE:
				return convertButtonTypeToString(eDataType, instanceValue);
			case ContentPackage.CARD_IMAGE_VARIANT:
				return convertCardImageVariantToString(eDataType, instanceValue);
			case ContentPackage.SPINNER_ANIMATION:
				return convertSpinnerAnimationToString(eDataType, instanceValue);
			case ContentPackage.PLACEHOLDER_ANIMATION:
				return convertPlaceholderAnimationToString(eDataType, instanceValue);
			case ContentPackage.PLACEHOLDER_SIZE:
				return convertPlaceholderSizeToString(eDataType, instanceValue);
			case ContentPackage.CAROUSEL_VARIANT:
				return convertCarouselVariantToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Alert createAlert() {
		AlertImpl alert = new AlertImpl();
		return alert;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlertHeading createAlertHeading() {
		AlertHeadingImpl alertHeading = new AlertHeadingImpl();
		return alertHeading;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlertLink createAlertLink() {
		AlertLinkImpl alertLink = new AlertLinkImpl();
		return alertLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Badge createBadge() {
		BadgeImpl badge = new BadgeImpl();
		return badge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Button createButton() {
		ButtonImpl button = new ButtonImpl();
		return button;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ButtonGroup createButtonGroup() {
		ButtonGroupImpl buttonGroup = new ButtonGroupImpl();
		return buttonGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ButtonToolbar createButtonToolbar() {
		ButtonToolbarImpl buttonToolbar = new ButtonToolbarImpl();
		return buttonToolbar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CloseButton createCloseButton() {
		CloseButtonImpl closeButton = new CloseButtonImpl();
		return closeButton;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Card createCard() {
		CardImpl card = new CardImpl();
		return card;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CardHeader createCardHeader() {
		CardHeaderImpl cardHeader = new CardHeaderImpl();
		return cardHeader;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CardImage createCardImage() {
		CardImageImpl cardImage = new CardImageImpl();
		return cardImage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CardBody createCardBody() {
		CardBodyImpl cardBody = new CardBodyImpl();
		return cardBody;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CardTitle createCardTitle() {
		CardTitleImpl cardTitle = new CardTitleImpl();
		return cardTitle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CardSubtitle createCardSubtitle() {
		CardSubtitleImpl cardSubtitle = new CardSubtitleImpl();
		return cardSubtitle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CardText createCardText() {
		CardTextImpl cardText = new CardTextImpl();
		return cardText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CardLink createCardLink() {
		CardLinkImpl cardLink = new CardLinkImpl();
		return cardLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CardFooter createCardFooter() {
		CardFooterImpl cardFooter = new CardFooterImpl();
		return cardFooter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CardGroup createCardGroup() {
		CardGroupImpl cardGroup = new CardGroupImpl();
		return cardGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListGroup createListGroup() {
		ListGroupImpl listGroup = new ListGroupImpl();
		return listGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListGroupItem createListGroupItem() {
		ListGroupItemImpl listGroupItem = new ListGroupItemImpl();
		return listGroupItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Table createTable() {
		TableImpl table = new TableImpl();
		return table;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProgressBar createProgressBar() {
		ProgressBarImpl progressBar = new ProgressBarImpl();
		return progressBar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Spinner createSpinner() {
		SpinnerImpl spinner = new SpinnerImpl();
		return spinner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlaceholderGroup createPlaceholderGroup() {
		PlaceholderGroupImpl placeholderGroup = new PlaceholderGroupImpl();
		return placeholderGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Placeholder createPlaceholder() {
		PlaceholderImpl placeholder = new PlaceholderImpl();
		return placeholder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlaceholderButton createPlaceholderButton() {
		PlaceholderButtonImpl placeholderButton = new PlaceholderButtonImpl();
		return placeholderButton;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Accordion createAccordion() {
		AccordionImpl accordion = new AccordionImpl();
		return accordion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccordionItem createAccordionItem() {
		AccordionItemImpl accordionItem = new AccordionItemImpl();
		return accordionItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccordionHeader createAccordionHeader() {
		AccordionHeaderImpl accordionHeader = new AccordionHeaderImpl();
		return accordionHeader;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccordionBody createAccordionBody() {
		AccordionBodyImpl accordionBody = new AccordionBodyImpl();
		return accordionBody;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Carousel createCarousel() {
		CarouselImpl carousel = new CarouselImpl();
		return carousel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CarouselItem createCarouselItem() {
		CarouselItemImpl carouselItem = new CarouselItemImpl();
		return carouselItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CarouselCaption createCarouselCaption() {
		CarouselCaptionImpl carouselCaption = new CarouselCaptionImpl();
		return carouselCaption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ButtonType createButtonTypeFromString(EDataType eDataType, String initialValue) {
		ButtonType result = ButtonType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertButtonTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CardImageVariant createCardImageVariantFromString(EDataType eDataType, String initialValue) {
		CardImageVariant result = CardImageVariant.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCardImageVariantToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpinnerAnimation createSpinnerAnimationFromString(EDataType eDataType, String initialValue) {
		SpinnerAnimation result = SpinnerAnimation.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSpinnerAnimationToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlaceholderAnimation createPlaceholderAnimationFromString(EDataType eDataType, String initialValue) {
		PlaceholderAnimation result = PlaceholderAnimation.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPlaceholderAnimationToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlaceholderSize createPlaceholderSizeFromString(EDataType eDataType, String initialValue) {
		PlaceholderSize result = PlaceholderSize.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPlaceholderSizeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CarouselVariant createCarouselVariantFromString(EDataType eDataType, String initialValue) {
		CarouselVariant result = CarouselVariant.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCarouselVariantToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContentPackage getContentPackage() {
		return (ContentPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ContentPackage getPackage() {
		return ContentPackage.eINSTANCE;
	}

} //ContentFactoryImpl
