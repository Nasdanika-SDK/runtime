/**
 */
package org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.util;

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

import org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.*;

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
 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.ContentPackage
 * @generated
 */
public class ContentSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ContentPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContentSwitch() {
		if (modelPackage == null) {
			modelPackage = ContentPackage.eINSTANCE;
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
			case ContentPackage.ALERT: {
				Alert alert = (Alert)theEObject;
				T result = caseAlert(alert);
				if (result == null) result = caseBootstrapElement(alert);
				if (result == null) result = caseTextContent(alert);
				if (result == null) result = caseLibraryElement(alert);
				if (result == null) result = caseElement(alert);
				if (result == null) result = caseContainer(alert);
				if (result == null) result = caseNode(alert);
				if (result == null) result = caseMarked(alert);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ContentPackage.ALERT_HEADING: {
				AlertHeading alertHeading = (AlertHeading)theEObject;
				T result = caseAlertHeading(alertHeading);
				if (result == null) result = caseBootstrapElement(alertHeading);
				if (result == null) result = caseTextContent(alertHeading);
				if (result == null) result = caseLibraryElement(alertHeading);
				if (result == null) result = caseElement(alertHeading);
				if (result == null) result = caseContainer(alertHeading);
				if (result == null) result = caseNode(alertHeading);
				if (result == null) result = caseMarked(alertHeading);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ContentPackage.ALERT_LINK: {
				AlertLink alertLink = (AlertLink)theEObject;
				T result = caseAlertLink(alertLink);
				if (result == null) result = caseBootstrapElement(alertLink);
				if (result == null) result = caseTextContent(alertLink);
				if (result == null) result = caseLibraryElement(alertLink);
				if (result == null) result = caseElement(alertLink);
				if (result == null) result = caseContainer(alertLink);
				if (result == null) result = caseNode(alertLink);
				if (result == null) result = caseMarked(alertLink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ContentPackage.BADGE: {
				Badge badge = (Badge)theEObject;
				T result = caseBadge(badge);
				if (result == null) result = caseBootstrapElement(badge);
				if (result == null) result = caseTextContent(badge);
				if (result == null) result = caseLibraryElement(badge);
				if (result == null) result = caseElement(badge);
				if (result == null) result = caseContainer(badge);
				if (result == null) result = caseNode(badge);
				if (result == null) result = caseMarked(badge);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ContentPackage.BUTTON: {
				Button button = (Button)theEObject;
				T result = caseButton(button);
				if (result == null) result = caseBootstrapElement(button);
				if (result == null) result = caseTextContent(button);
				if (result == null) result = caseLibraryElement(button);
				if (result == null) result = caseElement(button);
				if (result == null) result = caseContainer(button);
				if (result == null) result = caseNode(button);
				if (result == null) result = caseMarked(button);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ContentPackage.BUTTON_GROUP: {
				ButtonGroup buttonGroup = (ButtonGroup)theEObject;
				T result = caseButtonGroup(buttonGroup);
				if (result == null) result = caseBootstrapElement(buttonGroup);
				if (result == null) result = caseLibraryElement(buttonGroup);
				if (result == null) result = caseElement(buttonGroup);
				if (result == null) result = caseContainer(buttonGroup);
				if (result == null) result = caseNode(buttonGroup);
				if (result == null) result = caseMarked(buttonGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ContentPackage.BUTTON_TOOLBAR: {
				ButtonToolbar buttonToolbar = (ButtonToolbar)theEObject;
				T result = caseButtonToolbar(buttonToolbar);
				if (result == null) result = caseBootstrapElement(buttonToolbar);
				if (result == null) result = caseLibraryElement(buttonToolbar);
				if (result == null) result = caseElement(buttonToolbar);
				if (result == null) result = caseContainer(buttonToolbar);
				if (result == null) result = caseNode(buttonToolbar);
				if (result == null) result = caseMarked(buttonToolbar);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ContentPackage.CLOSE_BUTTON: {
				CloseButton closeButton = (CloseButton)theEObject;
				T result = caseCloseButton(closeButton);
				if (result == null) result = caseBootstrapElement(closeButton);
				if (result == null) result = caseLibraryElement(closeButton);
				if (result == null) result = caseElement(closeButton);
				if (result == null) result = caseContainer(closeButton);
				if (result == null) result = caseNode(closeButton);
				if (result == null) result = caseMarked(closeButton);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ContentPackage.CARD: {
				Card card = (Card)theEObject;
				T result = caseCard(card);
				if (result == null) result = caseBootstrapElement(card);
				if (result == null) result = caseLibraryElement(card);
				if (result == null) result = caseElement(card);
				if (result == null) result = caseContainer(card);
				if (result == null) result = caseNode(card);
				if (result == null) result = caseMarked(card);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ContentPackage.CARD_HEADER: {
				CardHeader cardHeader = (CardHeader)theEObject;
				T result = caseCardHeader(cardHeader);
				if (result == null) result = caseBootstrapElement(cardHeader);
				if (result == null) result = caseTextContent(cardHeader);
				if (result == null) result = caseLibraryElement(cardHeader);
				if (result == null) result = caseElement(cardHeader);
				if (result == null) result = caseContainer(cardHeader);
				if (result == null) result = caseNode(cardHeader);
				if (result == null) result = caseMarked(cardHeader);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ContentPackage.CARD_IMAGE: {
				CardImage cardImage = (CardImage)theEObject;
				T result = caseCardImage(cardImage);
				if (result == null) result = caseBootstrapElement(cardImage);
				if (result == null) result = caseLibraryElement(cardImage);
				if (result == null) result = caseElement(cardImage);
				if (result == null) result = caseContainer(cardImage);
				if (result == null) result = caseNode(cardImage);
				if (result == null) result = caseMarked(cardImage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ContentPackage.CARD_BODY: {
				CardBody cardBody = (CardBody)theEObject;
				T result = caseCardBody(cardBody);
				if (result == null) result = caseBootstrapElement(cardBody);
				if (result == null) result = caseLibraryElement(cardBody);
				if (result == null) result = caseElement(cardBody);
				if (result == null) result = caseContainer(cardBody);
				if (result == null) result = caseNode(cardBody);
				if (result == null) result = caseMarked(cardBody);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ContentPackage.CARD_TITLE: {
				CardTitle cardTitle = (CardTitle)theEObject;
				T result = caseCardTitle(cardTitle);
				if (result == null) result = caseBootstrapElement(cardTitle);
				if (result == null) result = caseTextContent(cardTitle);
				if (result == null) result = caseLibraryElement(cardTitle);
				if (result == null) result = caseElement(cardTitle);
				if (result == null) result = caseContainer(cardTitle);
				if (result == null) result = caseNode(cardTitle);
				if (result == null) result = caseMarked(cardTitle);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ContentPackage.CARD_SUBTITLE: {
				CardSubtitle cardSubtitle = (CardSubtitle)theEObject;
				T result = caseCardSubtitle(cardSubtitle);
				if (result == null) result = caseBootstrapElement(cardSubtitle);
				if (result == null) result = caseTextContent(cardSubtitle);
				if (result == null) result = caseLibraryElement(cardSubtitle);
				if (result == null) result = caseElement(cardSubtitle);
				if (result == null) result = caseContainer(cardSubtitle);
				if (result == null) result = caseNode(cardSubtitle);
				if (result == null) result = caseMarked(cardSubtitle);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ContentPackage.CARD_TEXT: {
				CardText cardText = (CardText)theEObject;
				T result = caseCardText(cardText);
				if (result == null) result = caseBootstrapElement(cardText);
				if (result == null) result = caseTextContent(cardText);
				if (result == null) result = caseLibraryElement(cardText);
				if (result == null) result = caseElement(cardText);
				if (result == null) result = caseContainer(cardText);
				if (result == null) result = caseNode(cardText);
				if (result == null) result = caseMarked(cardText);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ContentPackage.CARD_LINK: {
				CardLink cardLink = (CardLink)theEObject;
				T result = caseCardLink(cardLink);
				if (result == null) result = caseBootstrapElement(cardLink);
				if (result == null) result = caseTextContent(cardLink);
				if (result == null) result = caseLibraryElement(cardLink);
				if (result == null) result = caseElement(cardLink);
				if (result == null) result = caseContainer(cardLink);
				if (result == null) result = caseNode(cardLink);
				if (result == null) result = caseMarked(cardLink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ContentPackage.CARD_FOOTER: {
				CardFooter cardFooter = (CardFooter)theEObject;
				T result = caseCardFooter(cardFooter);
				if (result == null) result = caseBootstrapElement(cardFooter);
				if (result == null) result = caseTextContent(cardFooter);
				if (result == null) result = caseLibraryElement(cardFooter);
				if (result == null) result = caseElement(cardFooter);
				if (result == null) result = caseContainer(cardFooter);
				if (result == null) result = caseNode(cardFooter);
				if (result == null) result = caseMarked(cardFooter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ContentPackage.CARD_GROUP: {
				CardGroup cardGroup = (CardGroup)theEObject;
				T result = caseCardGroup(cardGroup);
				if (result == null) result = caseBootstrapElement(cardGroup);
				if (result == null) result = caseLibraryElement(cardGroup);
				if (result == null) result = caseElement(cardGroup);
				if (result == null) result = caseContainer(cardGroup);
				if (result == null) result = caseNode(cardGroup);
				if (result == null) result = caseMarked(cardGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ContentPackage.LIST_GROUP: {
				ListGroup listGroup = (ListGroup)theEObject;
				T result = caseListGroup(listGroup);
				if (result == null) result = caseBootstrapElement(listGroup);
				if (result == null) result = caseLibraryElement(listGroup);
				if (result == null) result = caseElement(listGroup);
				if (result == null) result = caseContainer(listGroup);
				if (result == null) result = caseNode(listGroup);
				if (result == null) result = caseMarked(listGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ContentPackage.LIST_GROUP_ITEM: {
				ListGroupItem listGroupItem = (ListGroupItem)theEObject;
				T result = caseListGroupItem(listGroupItem);
				if (result == null) result = caseBootstrapElement(listGroupItem);
				if (result == null) result = caseTextContent(listGroupItem);
				if (result == null) result = caseLibraryElement(listGroupItem);
				if (result == null) result = caseElement(listGroupItem);
				if (result == null) result = caseContainer(listGroupItem);
				if (result == null) result = caseNode(listGroupItem);
				if (result == null) result = caseMarked(listGroupItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ContentPackage.TABLE: {
				Table table = (Table)theEObject;
				T result = caseTable(table);
				if (result == null) result = caseBootstrapElement(table);
				if (result == null) result = caseLibraryElement(table);
				if (result == null) result = caseElement(table);
				if (result == null) result = caseContainer(table);
				if (result == null) result = caseNode(table);
				if (result == null) result = caseMarked(table);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ContentPackage.PROGRESS_BAR: {
				ProgressBar progressBar = (ProgressBar)theEObject;
				T result = caseProgressBar(progressBar);
				if (result == null) result = caseBootstrapElement(progressBar);
				if (result == null) result = caseLibraryElement(progressBar);
				if (result == null) result = caseElement(progressBar);
				if (result == null) result = caseContainer(progressBar);
				if (result == null) result = caseNode(progressBar);
				if (result == null) result = caseMarked(progressBar);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ContentPackage.SPINNER: {
				Spinner spinner = (Spinner)theEObject;
				T result = caseSpinner(spinner);
				if (result == null) result = caseBootstrapElement(spinner);
				if (result == null) result = caseTextContent(spinner);
				if (result == null) result = caseLibraryElement(spinner);
				if (result == null) result = caseElement(spinner);
				if (result == null) result = caseContainer(spinner);
				if (result == null) result = caseNode(spinner);
				if (result == null) result = caseMarked(spinner);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ContentPackage.PLACEHOLDER_GROUP: {
				PlaceholderGroup placeholderGroup = (PlaceholderGroup)theEObject;
				T result = casePlaceholderGroup(placeholderGroup);
				if (result == null) result = caseBootstrapElement(placeholderGroup);
				if (result == null) result = caseLibraryElement(placeholderGroup);
				if (result == null) result = caseElement(placeholderGroup);
				if (result == null) result = caseContainer(placeholderGroup);
				if (result == null) result = caseNode(placeholderGroup);
				if (result == null) result = caseMarked(placeholderGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ContentPackage.PLACEHOLDER: {
				Placeholder placeholder = (Placeholder)theEObject;
				T result = casePlaceholder(placeholder);
				if (result == null) result = caseBootstrapElement(placeholder);
				if (result == null) result = caseLibraryElement(placeholder);
				if (result == null) result = caseElement(placeholder);
				if (result == null) result = caseContainer(placeholder);
				if (result == null) result = caseNode(placeholder);
				if (result == null) result = caseMarked(placeholder);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ContentPackage.PLACEHOLDER_BUTTON: {
				PlaceholderButton placeholderButton = (PlaceholderButton)theEObject;
				T result = casePlaceholderButton(placeholderButton);
				if (result == null) result = caseBootstrapElement(placeholderButton);
				if (result == null) result = caseLibraryElement(placeholderButton);
				if (result == null) result = caseElement(placeholderButton);
				if (result == null) result = caseContainer(placeholderButton);
				if (result == null) result = caseNode(placeholderButton);
				if (result == null) result = caseMarked(placeholderButton);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ContentPackage.ACCORDION: {
				Accordion accordion = (Accordion)theEObject;
				T result = caseAccordion(accordion);
				if (result == null) result = caseBootstrapElement(accordion);
				if (result == null) result = caseLibraryElement(accordion);
				if (result == null) result = caseElement(accordion);
				if (result == null) result = caseContainer(accordion);
				if (result == null) result = caseNode(accordion);
				if (result == null) result = caseMarked(accordion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ContentPackage.ACCORDION_ITEM: {
				AccordionItem accordionItem = (AccordionItem)theEObject;
				T result = caseAccordionItem(accordionItem);
				if (result == null) result = caseBootstrapElement(accordionItem);
				if (result == null) result = caseLibraryElement(accordionItem);
				if (result == null) result = caseElement(accordionItem);
				if (result == null) result = caseContainer(accordionItem);
				if (result == null) result = caseNode(accordionItem);
				if (result == null) result = caseMarked(accordionItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ContentPackage.ACCORDION_HEADER: {
				AccordionHeader accordionHeader = (AccordionHeader)theEObject;
				T result = caseAccordionHeader(accordionHeader);
				if (result == null) result = caseBootstrapElement(accordionHeader);
				if (result == null) result = caseTextContent(accordionHeader);
				if (result == null) result = caseLibraryElement(accordionHeader);
				if (result == null) result = caseElement(accordionHeader);
				if (result == null) result = caseContainer(accordionHeader);
				if (result == null) result = caseNode(accordionHeader);
				if (result == null) result = caseMarked(accordionHeader);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ContentPackage.ACCORDION_BODY: {
				AccordionBody accordionBody = (AccordionBody)theEObject;
				T result = caseAccordionBody(accordionBody);
				if (result == null) result = caseBootstrapElement(accordionBody);
				if (result == null) result = caseTextContent(accordionBody);
				if (result == null) result = caseLibraryElement(accordionBody);
				if (result == null) result = caseElement(accordionBody);
				if (result == null) result = caseContainer(accordionBody);
				if (result == null) result = caseNode(accordionBody);
				if (result == null) result = caseMarked(accordionBody);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ContentPackage.CAROUSEL: {
				Carousel carousel = (Carousel)theEObject;
				T result = caseCarousel(carousel);
				if (result == null) result = caseBootstrapElement(carousel);
				if (result == null) result = caseLibraryElement(carousel);
				if (result == null) result = caseElement(carousel);
				if (result == null) result = caseContainer(carousel);
				if (result == null) result = caseNode(carousel);
				if (result == null) result = caseMarked(carousel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ContentPackage.CAROUSEL_ITEM: {
				CarouselItem carouselItem = (CarouselItem)theEObject;
				T result = caseCarouselItem(carouselItem);
				if (result == null) result = caseBootstrapElement(carouselItem);
				if (result == null) result = caseLibraryElement(carouselItem);
				if (result == null) result = caseElement(carouselItem);
				if (result == null) result = caseContainer(carouselItem);
				if (result == null) result = caseNode(carouselItem);
				if (result == null) result = caseMarked(carouselItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ContentPackage.CAROUSEL_CAPTION: {
				CarouselCaption carouselCaption = (CarouselCaption)theEObject;
				T result = caseCarouselCaption(carouselCaption);
				if (result == null) result = caseBootstrapElement(carouselCaption);
				if (result == null) result = caseLibraryElement(carouselCaption);
				if (result == null) result = caseElement(carouselCaption);
				if (result == null) result = caseContainer(carouselCaption);
				if (result == null) result = caseNode(carouselCaption);
				if (result == null) result = caseMarked(carouselCaption);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Alert</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Alert</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAlert(Alert object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Alert Heading</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Alert Heading</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAlertHeading(AlertHeading object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Alert Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Alert Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAlertLink(AlertLink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Badge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Badge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBadge(Badge object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Button Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Button Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseButtonGroup(ButtonGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Button Toolbar</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Button Toolbar</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseButtonToolbar(ButtonToolbar object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Close Button</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Close Button</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCloseButton(CloseButton object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Card</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Card</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCard(Card object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Card Header</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Card Header</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCardHeader(CardHeader object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Card Image</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Card Image</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCardImage(CardImage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Card Body</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Card Body</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCardBody(CardBody object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Card Title</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Card Title</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCardTitle(CardTitle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Card Subtitle</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Card Subtitle</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCardSubtitle(CardSubtitle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Card Text</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Card Text</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCardText(CardText object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Card Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Card Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCardLink(CardLink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Card Footer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Card Footer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCardFooter(CardFooter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Card Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Card Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCardGroup(CardGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListGroup(ListGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Group Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Group Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListGroupItem(ListGroupItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Table</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Table</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTable(Table object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Progress Bar</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Progress Bar</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProgressBar(ProgressBar object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Spinner</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Spinner</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpinner(Spinner object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Placeholder Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Placeholder Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlaceholderGroup(PlaceholderGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Placeholder</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Placeholder</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlaceholder(Placeholder object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Placeholder Button</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Placeholder Button</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlaceholderButton(PlaceholderButton object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Accordion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Accordion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAccordion(Accordion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Accordion Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Accordion Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAccordionItem(AccordionItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Accordion Header</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Accordion Header</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAccordionHeader(AccordionHeader object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Accordion Body</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Accordion Body</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAccordionBody(AccordionBody object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Carousel</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Carousel</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCarousel(Carousel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Carousel Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Carousel Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCarouselItem(CarouselItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Carousel Caption</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Carousel Caption</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCarouselCaption(CarouselCaption object) {
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

} //ContentSwitch
