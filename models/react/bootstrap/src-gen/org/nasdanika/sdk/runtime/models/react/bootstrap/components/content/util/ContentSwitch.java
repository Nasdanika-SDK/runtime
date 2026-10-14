/**
 */
package org.nasdanika.sdk.runtime.models.react.bootstrap.components.content.util;

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

import org.nasdanika.sdk.runtime.models.react.bootstrap.components.content.*;

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
 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.content.ContentPackage
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
				if (result == null) result = caseBootstrapComponent(alert);
				if (result == null) result = caseTextContent(alert);
				if (result == null) result = caseLibraryComponent(alert);
				if (result == null) result = caseJsxContainer(alert);
				if (result == null) result = caseJsxNode(alert);
				if (result == null) result = caseReactElement(alert);
				if (result == null) result = caseTypeScriptElement(alert);
				if (result == null) result = caseNamedElement(alert);
				if (result == null) result = caseModelElement(alert);
				if (result == null) result = caseStringIdentity(alert);
				if (result == null) result = caseDocumented(alert);
				if (result == null) result = caseMarked(alert);
				if (result == null) result = caseReferrable(alert);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ContentPackage.ALERT_HEADING: {
				AlertHeading alertHeading = (AlertHeading)theEObject;
				T result = caseAlertHeading(alertHeading);
				if (result == null) result = caseBootstrapComponent(alertHeading);
				if (result == null) result = caseTextContent(alertHeading);
				if (result == null) result = caseLibraryComponent(alertHeading);
				if (result == null) result = caseJsxContainer(alertHeading);
				if (result == null) result = caseJsxNode(alertHeading);
				if (result == null) result = caseReactElement(alertHeading);
				if (result == null) result = caseTypeScriptElement(alertHeading);
				if (result == null) result = caseNamedElement(alertHeading);
				if (result == null) result = caseModelElement(alertHeading);
				if (result == null) result = caseStringIdentity(alertHeading);
				if (result == null) result = caseDocumented(alertHeading);
				if (result == null) result = caseMarked(alertHeading);
				if (result == null) result = caseReferrable(alertHeading);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ContentPackage.ALERT_LINK: {
				AlertLink alertLink = (AlertLink)theEObject;
				T result = caseAlertLink(alertLink);
				if (result == null) result = caseBootstrapComponent(alertLink);
				if (result == null) result = caseTextContent(alertLink);
				if (result == null) result = caseLibraryComponent(alertLink);
				if (result == null) result = caseJsxContainer(alertLink);
				if (result == null) result = caseJsxNode(alertLink);
				if (result == null) result = caseReactElement(alertLink);
				if (result == null) result = caseTypeScriptElement(alertLink);
				if (result == null) result = caseNamedElement(alertLink);
				if (result == null) result = caseModelElement(alertLink);
				if (result == null) result = caseStringIdentity(alertLink);
				if (result == null) result = caseDocumented(alertLink);
				if (result == null) result = caseMarked(alertLink);
				if (result == null) result = caseReferrable(alertLink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ContentPackage.BADGE: {
				Badge badge = (Badge)theEObject;
				T result = caseBadge(badge);
				if (result == null) result = caseBootstrapComponent(badge);
				if (result == null) result = caseTextContent(badge);
				if (result == null) result = caseLibraryComponent(badge);
				if (result == null) result = caseJsxContainer(badge);
				if (result == null) result = caseJsxNode(badge);
				if (result == null) result = caseReactElement(badge);
				if (result == null) result = caseTypeScriptElement(badge);
				if (result == null) result = caseNamedElement(badge);
				if (result == null) result = caseModelElement(badge);
				if (result == null) result = caseStringIdentity(badge);
				if (result == null) result = caseDocumented(badge);
				if (result == null) result = caseMarked(badge);
				if (result == null) result = caseReferrable(badge);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ContentPackage.BUTTON: {
				Button button = (Button)theEObject;
				T result = caseButton(button);
				if (result == null) result = caseBootstrapComponent(button);
				if (result == null) result = caseTextContent(button);
				if (result == null) result = caseLibraryComponent(button);
				if (result == null) result = caseJsxContainer(button);
				if (result == null) result = caseJsxNode(button);
				if (result == null) result = caseReactElement(button);
				if (result == null) result = caseTypeScriptElement(button);
				if (result == null) result = caseNamedElement(button);
				if (result == null) result = caseModelElement(button);
				if (result == null) result = caseStringIdentity(button);
				if (result == null) result = caseDocumented(button);
				if (result == null) result = caseMarked(button);
				if (result == null) result = caseReferrable(button);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ContentPackage.BUTTON_GROUP: {
				ButtonGroup buttonGroup = (ButtonGroup)theEObject;
				T result = caseButtonGroup(buttonGroup);
				if (result == null) result = caseBootstrapComponent(buttonGroup);
				if (result == null) result = caseLibraryComponent(buttonGroup);
				if (result == null) result = caseJsxContainer(buttonGroup);
				if (result == null) result = caseJsxNode(buttonGroup);
				if (result == null) result = caseReactElement(buttonGroup);
				if (result == null) result = caseTypeScriptElement(buttonGroup);
				if (result == null) result = caseNamedElement(buttonGroup);
				if (result == null) result = caseModelElement(buttonGroup);
				if (result == null) result = caseStringIdentity(buttonGroup);
				if (result == null) result = caseDocumented(buttonGroup);
				if (result == null) result = caseMarked(buttonGroup);
				if (result == null) result = caseReferrable(buttonGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ContentPackage.BUTTON_TOOLBAR: {
				ButtonToolbar buttonToolbar = (ButtonToolbar)theEObject;
				T result = caseButtonToolbar(buttonToolbar);
				if (result == null) result = caseBootstrapComponent(buttonToolbar);
				if (result == null) result = caseLibraryComponent(buttonToolbar);
				if (result == null) result = caseJsxContainer(buttonToolbar);
				if (result == null) result = caseJsxNode(buttonToolbar);
				if (result == null) result = caseReactElement(buttonToolbar);
				if (result == null) result = caseTypeScriptElement(buttonToolbar);
				if (result == null) result = caseNamedElement(buttonToolbar);
				if (result == null) result = caseModelElement(buttonToolbar);
				if (result == null) result = caseStringIdentity(buttonToolbar);
				if (result == null) result = caseDocumented(buttonToolbar);
				if (result == null) result = caseMarked(buttonToolbar);
				if (result == null) result = caseReferrable(buttonToolbar);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ContentPackage.CLOSE_BUTTON: {
				CloseButton closeButton = (CloseButton)theEObject;
				T result = caseCloseButton(closeButton);
				if (result == null) result = caseBootstrapComponent(closeButton);
				if (result == null) result = caseLibraryComponent(closeButton);
				if (result == null) result = caseJsxContainer(closeButton);
				if (result == null) result = caseJsxNode(closeButton);
				if (result == null) result = caseReactElement(closeButton);
				if (result == null) result = caseTypeScriptElement(closeButton);
				if (result == null) result = caseNamedElement(closeButton);
				if (result == null) result = caseModelElement(closeButton);
				if (result == null) result = caseStringIdentity(closeButton);
				if (result == null) result = caseDocumented(closeButton);
				if (result == null) result = caseMarked(closeButton);
				if (result == null) result = caseReferrable(closeButton);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ContentPackage.CARD: {
				Card card = (Card)theEObject;
				T result = caseCard(card);
				if (result == null) result = caseBootstrapComponent(card);
				if (result == null) result = caseLibraryComponent(card);
				if (result == null) result = caseJsxContainer(card);
				if (result == null) result = caseJsxNode(card);
				if (result == null) result = caseReactElement(card);
				if (result == null) result = caseTypeScriptElement(card);
				if (result == null) result = caseNamedElement(card);
				if (result == null) result = caseModelElement(card);
				if (result == null) result = caseStringIdentity(card);
				if (result == null) result = caseDocumented(card);
				if (result == null) result = caseMarked(card);
				if (result == null) result = caseReferrable(card);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ContentPackage.CARD_HEADER: {
				CardHeader cardHeader = (CardHeader)theEObject;
				T result = caseCardHeader(cardHeader);
				if (result == null) result = caseBootstrapComponent(cardHeader);
				if (result == null) result = caseTextContent(cardHeader);
				if (result == null) result = caseLibraryComponent(cardHeader);
				if (result == null) result = caseJsxContainer(cardHeader);
				if (result == null) result = caseJsxNode(cardHeader);
				if (result == null) result = caseReactElement(cardHeader);
				if (result == null) result = caseTypeScriptElement(cardHeader);
				if (result == null) result = caseNamedElement(cardHeader);
				if (result == null) result = caseModelElement(cardHeader);
				if (result == null) result = caseStringIdentity(cardHeader);
				if (result == null) result = caseDocumented(cardHeader);
				if (result == null) result = caseMarked(cardHeader);
				if (result == null) result = caseReferrable(cardHeader);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ContentPackage.CARD_IMAGE: {
				CardImage cardImage = (CardImage)theEObject;
				T result = caseCardImage(cardImage);
				if (result == null) result = caseBootstrapComponent(cardImage);
				if (result == null) result = caseLibraryComponent(cardImage);
				if (result == null) result = caseJsxContainer(cardImage);
				if (result == null) result = caseJsxNode(cardImage);
				if (result == null) result = caseReactElement(cardImage);
				if (result == null) result = caseTypeScriptElement(cardImage);
				if (result == null) result = caseNamedElement(cardImage);
				if (result == null) result = caseModelElement(cardImage);
				if (result == null) result = caseStringIdentity(cardImage);
				if (result == null) result = caseDocumented(cardImage);
				if (result == null) result = caseMarked(cardImage);
				if (result == null) result = caseReferrable(cardImage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ContentPackage.CARD_BODY: {
				CardBody cardBody = (CardBody)theEObject;
				T result = caseCardBody(cardBody);
				if (result == null) result = caseBootstrapComponent(cardBody);
				if (result == null) result = caseLibraryComponent(cardBody);
				if (result == null) result = caseJsxContainer(cardBody);
				if (result == null) result = caseJsxNode(cardBody);
				if (result == null) result = caseReactElement(cardBody);
				if (result == null) result = caseTypeScriptElement(cardBody);
				if (result == null) result = caseNamedElement(cardBody);
				if (result == null) result = caseModelElement(cardBody);
				if (result == null) result = caseStringIdentity(cardBody);
				if (result == null) result = caseDocumented(cardBody);
				if (result == null) result = caseMarked(cardBody);
				if (result == null) result = caseReferrable(cardBody);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ContentPackage.CARD_TITLE: {
				CardTitle cardTitle = (CardTitle)theEObject;
				T result = caseCardTitle(cardTitle);
				if (result == null) result = caseBootstrapComponent(cardTitle);
				if (result == null) result = caseTextContent(cardTitle);
				if (result == null) result = caseLibraryComponent(cardTitle);
				if (result == null) result = caseJsxContainer(cardTitle);
				if (result == null) result = caseJsxNode(cardTitle);
				if (result == null) result = caseReactElement(cardTitle);
				if (result == null) result = caseTypeScriptElement(cardTitle);
				if (result == null) result = caseNamedElement(cardTitle);
				if (result == null) result = caseModelElement(cardTitle);
				if (result == null) result = caseStringIdentity(cardTitle);
				if (result == null) result = caseDocumented(cardTitle);
				if (result == null) result = caseMarked(cardTitle);
				if (result == null) result = caseReferrable(cardTitle);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ContentPackage.CARD_SUBTITLE: {
				CardSubtitle cardSubtitle = (CardSubtitle)theEObject;
				T result = caseCardSubtitle(cardSubtitle);
				if (result == null) result = caseBootstrapComponent(cardSubtitle);
				if (result == null) result = caseTextContent(cardSubtitle);
				if (result == null) result = caseLibraryComponent(cardSubtitle);
				if (result == null) result = caseJsxContainer(cardSubtitle);
				if (result == null) result = caseJsxNode(cardSubtitle);
				if (result == null) result = caseReactElement(cardSubtitle);
				if (result == null) result = caseTypeScriptElement(cardSubtitle);
				if (result == null) result = caseNamedElement(cardSubtitle);
				if (result == null) result = caseModelElement(cardSubtitle);
				if (result == null) result = caseStringIdentity(cardSubtitle);
				if (result == null) result = caseDocumented(cardSubtitle);
				if (result == null) result = caseMarked(cardSubtitle);
				if (result == null) result = caseReferrable(cardSubtitle);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ContentPackage.CARD_TEXT: {
				CardText cardText = (CardText)theEObject;
				T result = caseCardText(cardText);
				if (result == null) result = caseBootstrapComponent(cardText);
				if (result == null) result = caseTextContent(cardText);
				if (result == null) result = caseLibraryComponent(cardText);
				if (result == null) result = caseJsxContainer(cardText);
				if (result == null) result = caseJsxNode(cardText);
				if (result == null) result = caseReactElement(cardText);
				if (result == null) result = caseTypeScriptElement(cardText);
				if (result == null) result = caseNamedElement(cardText);
				if (result == null) result = caseModelElement(cardText);
				if (result == null) result = caseStringIdentity(cardText);
				if (result == null) result = caseDocumented(cardText);
				if (result == null) result = caseMarked(cardText);
				if (result == null) result = caseReferrable(cardText);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ContentPackage.CARD_LINK: {
				CardLink cardLink = (CardLink)theEObject;
				T result = caseCardLink(cardLink);
				if (result == null) result = caseBootstrapComponent(cardLink);
				if (result == null) result = caseTextContent(cardLink);
				if (result == null) result = caseLibraryComponent(cardLink);
				if (result == null) result = caseJsxContainer(cardLink);
				if (result == null) result = caseJsxNode(cardLink);
				if (result == null) result = caseReactElement(cardLink);
				if (result == null) result = caseTypeScriptElement(cardLink);
				if (result == null) result = caseNamedElement(cardLink);
				if (result == null) result = caseModelElement(cardLink);
				if (result == null) result = caseStringIdentity(cardLink);
				if (result == null) result = caseDocumented(cardLink);
				if (result == null) result = caseMarked(cardLink);
				if (result == null) result = caseReferrable(cardLink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ContentPackage.CARD_FOOTER: {
				CardFooter cardFooter = (CardFooter)theEObject;
				T result = caseCardFooter(cardFooter);
				if (result == null) result = caseBootstrapComponent(cardFooter);
				if (result == null) result = caseTextContent(cardFooter);
				if (result == null) result = caseLibraryComponent(cardFooter);
				if (result == null) result = caseJsxContainer(cardFooter);
				if (result == null) result = caseJsxNode(cardFooter);
				if (result == null) result = caseReactElement(cardFooter);
				if (result == null) result = caseTypeScriptElement(cardFooter);
				if (result == null) result = caseNamedElement(cardFooter);
				if (result == null) result = caseModelElement(cardFooter);
				if (result == null) result = caseStringIdentity(cardFooter);
				if (result == null) result = caseDocumented(cardFooter);
				if (result == null) result = caseMarked(cardFooter);
				if (result == null) result = caseReferrable(cardFooter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ContentPackage.CARD_GROUP: {
				CardGroup cardGroup = (CardGroup)theEObject;
				T result = caseCardGroup(cardGroup);
				if (result == null) result = caseBootstrapComponent(cardGroup);
				if (result == null) result = caseLibraryComponent(cardGroup);
				if (result == null) result = caseJsxContainer(cardGroup);
				if (result == null) result = caseJsxNode(cardGroup);
				if (result == null) result = caseReactElement(cardGroup);
				if (result == null) result = caseTypeScriptElement(cardGroup);
				if (result == null) result = caseNamedElement(cardGroup);
				if (result == null) result = caseModelElement(cardGroup);
				if (result == null) result = caseStringIdentity(cardGroup);
				if (result == null) result = caseDocumented(cardGroup);
				if (result == null) result = caseMarked(cardGroup);
				if (result == null) result = caseReferrable(cardGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ContentPackage.LIST_GROUP: {
				ListGroup listGroup = (ListGroup)theEObject;
				T result = caseListGroup(listGroup);
				if (result == null) result = caseBootstrapComponent(listGroup);
				if (result == null) result = caseLibraryComponent(listGroup);
				if (result == null) result = caseJsxContainer(listGroup);
				if (result == null) result = caseJsxNode(listGroup);
				if (result == null) result = caseReactElement(listGroup);
				if (result == null) result = caseTypeScriptElement(listGroup);
				if (result == null) result = caseNamedElement(listGroup);
				if (result == null) result = caseModelElement(listGroup);
				if (result == null) result = caseStringIdentity(listGroup);
				if (result == null) result = caseDocumented(listGroup);
				if (result == null) result = caseMarked(listGroup);
				if (result == null) result = caseReferrable(listGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ContentPackage.LIST_GROUP_ITEM: {
				ListGroupItem listGroupItem = (ListGroupItem)theEObject;
				T result = caseListGroupItem(listGroupItem);
				if (result == null) result = caseBootstrapComponent(listGroupItem);
				if (result == null) result = caseTextContent(listGroupItem);
				if (result == null) result = caseLibraryComponent(listGroupItem);
				if (result == null) result = caseJsxContainer(listGroupItem);
				if (result == null) result = caseJsxNode(listGroupItem);
				if (result == null) result = caseReactElement(listGroupItem);
				if (result == null) result = caseTypeScriptElement(listGroupItem);
				if (result == null) result = caseNamedElement(listGroupItem);
				if (result == null) result = caseModelElement(listGroupItem);
				if (result == null) result = caseStringIdentity(listGroupItem);
				if (result == null) result = caseDocumented(listGroupItem);
				if (result == null) result = caseMarked(listGroupItem);
				if (result == null) result = caseReferrable(listGroupItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ContentPackage.TABLE: {
				Table table = (Table)theEObject;
				T result = caseTable(table);
				if (result == null) result = caseBootstrapComponent(table);
				if (result == null) result = caseLibraryComponent(table);
				if (result == null) result = caseJsxContainer(table);
				if (result == null) result = caseJsxNode(table);
				if (result == null) result = caseReactElement(table);
				if (result == null) result = caseTypeScriptElement(table);
				if (result == null) result = caseNamedElement(table);
				if (result == null) result = caseModelElement(table);
				if (result == null) result = caseStringIdentity(table);
				if (result == null) result = caseDocumented(table);
				if (result == null) result = caseMarked(table);
				if (result == null) result = caseReferrable(table);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ContentPackage.PROGRESS_BAR: {
				ProgressBar progressBar = (ProgressBar)theEObject;
				T result = caseProgressBar(progressBar);
				if (result == null) result = caseBootstrapComponent(progressBar);
				if (result == null) result = caseLibraryComponent(progressBar);
				if (result == null) result = caseJsxContainer(progressBar);
				if (result == null) result = caseJsxNode(progressBar);
				if (result == null) result = caseReactElement(progressBar);
				if (result == null) result = caseTypeScriptElement(progressBar);
				if (result == null) result = caseNamedElement(progressBar);
				if (result == null) result = caseModelElement(progressBar);
				if (result == null) result = caseStringIdentity(progressBar);
				if (result == null) result = caseDocumented(progressBar);
				if (result == null) result = caseMarked(progressBar);
				if (result == null) result = caseReferrable(progressBar);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ContentPackage.SPINNER: {
				Spinner spinner = (Spinner)theEObject;
				T result = caseSpinner(spinner);
				if (result == null) result = caseBootstrapComponent(spinner);
				if (result == null) result = caseTextContent(spinner);
				if (result == null) result = caseLibraryComponent(spinner);
				if (result == null) result = caseJsxContainer(spinner);
				if (result == null) result = caseJsxNode(spinner);
				if (result == null) result = caseReactElement(spinner);
				if (result == null) result = caseTypeScriptElement(spinner);
				if (result == null) result = caseNamedElement(spinner);
				if (result == null) result = caseModelElement(spinner);
				if (result == null) result = caseStringIdentity(spinner);
				if (result == null) result = caseDocumented(spinner);
				if (result == null) result = caseMarked(spinner);
				if (result == null) result = caseReferrable(spinner);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ContentPackage.PLACEHOLDER: {
				Placeholder placeholder = (Placeholder)theEObject;
				T result = casePlaceholder(placeholder);
				if (result == null) result = caseBootstrapComponent(placeholder);
				if (result == null) result = caseLibraryComponent(placeholder);
				if (result == null) result = caseJsxContainer(placeholder);
				if (result == null) result = caseJsxNode(placeholder);
				if (result == null) result = caseReactElement(placeholder);
				if (result == null) result = caseTypeScriptElement(placeholder);
				if (result == null) result = caseNamedElement(placeholder);
				if (result == null) result = caseModelElement(placeholder);
				if (result == null) result = caseStringIdentity(placeholder);
				if (result == null) result = caseDocumented(placeholder);
				if (result == null) result = caseMarked(placeholder);
				if (result == null) result = caseReferrable(placeholder);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ContentPackage.PLACEHOLDER_BUTTON: {
				PlaceholderButton placeholderButton = (PlaceholderButton)theEObject;
				T result = casePlaceholderButton(placeholderButton);
				if (result == null) result = caseBootstrapComponent(placeholderButton);
				if (result == null) result = caseLibraryComponent(placeholderButton);
				if (result == null) result = caseJsxContainer(placeholderButton);
				if (result == null) result = caseJsxNode(placeholderButton);
				if (result == null) result = caseReactElement(placeholderButton);
				if (result == null) result = caseTypeScriptElement(placeholderButton);
				if (result == null) result = caseNamedElement(placeholderButton);
				if (result == null) result = caseModelElement(placeholderButton);
				if (result == null) result = caseStringIdentity(placeholderButton);
				if (result == null) result = caseDocumented(placeholderButton);
				if (result == null) result = caseMarked(placeholderButton);
				if (result == null) result = caseReferrable(placeholderButton);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ContentPackage.ACCORDION: {
				Accordion accordion = (Accordion)theEObject;
				T result = caseAccordion(accordion);
				if (result == null) result = caseBootstrapComponent(accordion);
				if (result == null) result = caseLibraryComponent(accordion);
				if (result == null) result = caseJsxContainer(accordion);
				if (result == null) result = caseJsxNode(accordion);
				if (result == null) result = caseReactElement(accordion);
				if (result == null) result = caseTypeScriptElement(accordion);
				if (result == null) result = caseNamedElement(accordion);
				if (result == null) result = caseModelElement(accordion);
				if (result == null) result = caseStringIdentity(accordion);
				if (result == null) result = caseDocumented(accordion);
				if (result == null) result = caseMarked(accordion);
				if (result == null) result = caseReferrable(accordion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ContentPackage.ACCORDION_ITEM: {
				AccordionItem accordionItem = (AccordionItem)theEObject;
				T result = caseAccordionItem(accordionItem);
				if (result == null) result = caseBootstrapComponent(accordionItem);
				if (result == null) result = caseLibraryComponent(accordionItem);
				if (result == null) result = caseJsxContainer(accordionItem);
				if (result == null) result = caseJsxNode(accordionItem);
				if (result == null) result = caseReactElement(accordionItem);
				if (result == null) result = caseTypeScriptElement(accordionItem);
				if (result == null) result = caseNamedElement(accordionItem);
				if (result == null) result = caseModelElement(accordionItem);
				if (result == null) result = caseStringIdentity(accordionItem);
				if (result == null) result = caseDocumented(accordionItem);
				if (result == null) result = caseMarked(accordionItem);
				if (result == null) result = caseReferrable(accordionItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ContentPackage.ACCORDION_HEADER: {
				AccordionHeader accordionHeader = (AccordionHeader)theEObject;
				T result = caseAccordionHeader(accordionHeader);
				if (result == null) result = caseBootstrapComponent(accordionHeader);
				if (result == null) result = caseTextContent(accordionHeader);
				if (result == null) result = caseLibraryComponent(accordionHeader);
				if (result == null) result = caseJsxContainer(accordionHeader);
				if (result == null) result = caseJsxNode(accordionHeader);
				if (result == null) result = caseReactElement(accordionHeader);
				if (result == null) result = caseTypeScriptElement(accordionHeader);
				if (result == null) result = caseNamedElement(accordionHeader);
				if (result == null) result = caseModelElement(accordionHeader);
				if (result == null) result = caseStringIdentity(accordionHeader);
				if (result == null) result = caseDocumented(accordionHeader);
				if (result == null) result = caseMarked(accordionHeader);
				if (result == null) result = caseReferrable(accordionHeader);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ContentPackage.ACCORDION_BODY: {
				AccordionBody accordionBody = (AccordionBody)theEObject;
				T result = caseAccordionBody(accordionBody);
				if (result == null) result = caseBootstrapComponent(accordionBody);
				if (result == null) result = caseTextContent(accordionBody);
				if (result == null) result = caseLibraryComponent(accordionBody);
				if (result == null) result = caseJsxContainer(accordionBody);
				if (result == null) result = caseJsxNode(accordionBody);
				if (result == null) result = caseReactElement(accordionBody);
				if (result == null) result = caseTypeScriptElement(accordionBody);
				if (result == null) result = caseNamedElement(accordionBody);
				if (result == null) result = caseModelElement(accordionBody);
				if (result == null) result = caseStringIdentity(accordionBody);
				if (result == null) result = caseDocumented(accordionBody);
				if (result == null) result = caseMarked(accordionBody);
				if (result == null) result = caseReferrable(accordionBody);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ContentPackage.CAROUSEL: {
				Carousel carousel = (Carousel)theEObject;
				T result = caseCarousel(carousel);
				if (result == null) result = caseBootstrapComponent(carousel);
				if (result == null) result = caseLibraryComponent(carousel);
				if (result == null) result = caseJsxContainer(carousel);
				if (result == null) result = caseJsxNode(carousel);
				if (result == null) result = caseReactElement(carousel);
				if (result == null) result = caseTypeScriptElement(carousel);
				if (result == null) result = caseNamedElement(carousel);
				if (result == null) result = caseModelElement(carousel);
				if (result == null) result = caseStringIdentity(carousel);
				if (result == null) result = caseDocumented(carousel);
				if (result == null) result = caseMarked(carousel);
				if (result == null) result = caseReferrable(carousel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ContentPackage.CAROUSEL_ITEM: {
				CarouselItem carouselItem = (CarouselItem)theEObject;
				T result = caseCarouselItem(carouselItem);
				if (result == null) result = caseBootstrapComponent(carouselItem);
				if (result == null) result = caseLibraryComponent(carouselItem);
				if (result == null) result = caseJsxContainer(carouselItem);
				if (result == null) result = caseJsxNode(carouselItem);
				if (result == null) result = caseReactElement(carouselItem);
				if (result == null) result = caseTypeScriptElement(carouselItem);
				if (result == null) result = caseNamedElement(carouselItem);
				if (result == null) result = caseModelElement(carouselItem);
				if (result == null) result = caseStringIdentity(carouselItem);
				if (result == null) result = caseDocumented(carouselItem);
				if (result == null) result = caseMarked(carouselItem);
				if (result == null) result = caseReferrable(carouselItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ContentPackage.CAROUSEL_CAPTION: {
				CarouselCaption carouselCaption = (CarouselCaption)theEObject;
				T result = caseCarouselCaption(carouselCaption);
				if (result == null) result = caseBootstrapComponent(carouselCaption);
				if (result == null) result = caseLibraryComponent(carouselCaption);
				if (result == null) result = caseJsxContainer(carouselCaption);
				if (result == null) result = caseJsxNode(carouselCaption);
				if (result == null) result = caseReactElement(carouselCaption);
				if (result == null) result = caseTypeScriptElement(carouselCaption);
				if (result == null) result = caseNamedElement(carouselCaption);
				if (result == null) result = caseModelElement(carouselCaption);
				if (result == null) result = caseStringIdentity(carouselCaption);
				if (result == null) result = caseDocumented(carouselCaption);
				if (result == null) result = caseMarked(carouselCaption);
				if (result == null) result = caseReferrable(carouselCaption);
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

} //ContentSwitch
