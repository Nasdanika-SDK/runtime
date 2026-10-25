/**
 */
package org.nasdanika.sdk.runtime.models.drawio.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.nasdanika.sdk.runtime.models.core.Documented;
import org.nasdanika.sdk.runtime.models.core.Marked;
import org.nasdanika.sdk.runtime.models.core.NamedElement;
import org.nasdanika.sdk.runtime.models.core.Referrable;
import org.nasdanika.sdk.runtime.models.core.StringIdentity;

import org.nasdanika.sdk.runtime.models.diagram.Connectable;
import org.nasdanika.sdk.runtime.models.diagram.Diagram;
import org.nasdanika.sdk.runtime.models.diagram.DiagramElement;

import org.nasdanika.sdk.runtime.models.drawio.*;

import org.nasdanika.sdk.runtime.models.presentation.Presentation;
import org.nasdanika.sdk.runtime.models.presentation.Slide;

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
 * @see org.nasdanika.sdk.runtime.models.drawio.DrawioPackage
 * @generated
 */
public class DrawioSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static DrawioPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DrawioSwitch() {
		if (modelPackage == null) {
			modelPackage = DrawioPackage.eINSTANCE;
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
			case DrawioPackage.DOCUMENT: {
				Document document = (Document)theEObject;
				T result = caseDocument(document);
				if (result == null) result = casePresentation(document);
				if (result == null) result = caseDiagram(document);
				if (result == null) result = caseDiagramElement(document);
				if (result == null) result = caseNamedElement(document);
				if (result == null) result = caseCore_ModelElement(document);
				if (result == null) result = caseStringIdentity(document);
				if (result == null) result = caseDocumented(document);
				if (result == null) result = caseMarked(document);
				if (result == null) result = caseReferrable(document);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DrawioPackage.LINK_TARGET: {
				LinkTarget linkTarget = (LinkTarget)theEObject;
				T result = caseLinkTarget(linkTarget);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DrawioPackage.PAGE: {
				Page page = (Page)theEObject;
				T result = casePage(page);
				if (result == null) result = caseSlide(page);
				if (result == null) result = caseLinkTarget(page);
				if (result == null) result = caseDiagram(page);
				if (result == null) result = caseDiagramElement(page);
				if (result == null) result = caseNamedElement(page);
				if (result == null) result = caseCore_ModelElement(page);
				if (result == null) result = caseStringIdentity(page);
				if (result == null) result = caseDocumented(page);
				if (result == null) result = caseMarked(page);
				if (result == null) result = caseReferrable(page);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DrawioPackage.LAYER: {
				Layer layer = (Layer)theEObject;
				T result = caseLayer(layer);
				if (result == null) result = caseDiagram_Layer(layer);
				if (result == null) result = caseDiagramElement(layer);
				if (result == null) result = caseNamedElement(layer);
				if (result == null) result = caseCore_ModelElement(layer);
				if (result == null) result = caseStringIdentity(layer);
				if (result == null) result = caseDocumented(layer);
				if (result == null) result = caseMarked(layer);
				if (result == null) result = caseReferrable(layer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DrawioPackage.MODEL_ELEMENT: {
				ModelElement modelElement = (ModelElement)theEObject;
				T result = caseModelElement(modelElement);
				if (result == null) result = caseLinkTarget(modelElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DrawioPackage.NODE: {
				Node node = (Node)theEObject;
				T result = caseNode(node);
				if (result == null) result = caseDiagram_Node(node);
				if (result == null) result = caseModelElement(node);
				if (result == null) result = caseConnectable(node);
				if (result == null) result = caseLinkTarget(node);
				if (result == null) result = caseDiagramElement(node);
				if (result == null) result = caseNamedElement(node);
				if (result == null) result = caseCore_ModelElement(node);
				if (result == null) result = caseStringIdentity(node);
				if (result == null) result = caseDocumented(node);
				if (result == null) result = caseMarked(node);
				if (result == null) result = caseReferrable(node);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DrawioPackage.CONNECTION: {
				Connection connection = (Connection)theEObject;
				T result = caseConnection(connection);
				if (result == null) result = caseDiagram_Connection(connection);
				if (result == null) result = caseModelElement(connection);
				if (result == null) result = caseDiagramElement(connection);
				if (result == null) result = caseLinkTarget(connection);
				if (result == null) result = caseNamedElement(connection);
				if (result == null) result = caseCore_ModelElement(connection);
				if (result == null) result = caseStringIdentity(connection);
				if (result == null) result = caseDocumented(connection);
				if (result == null) result = caseMarked(connection);
				if (result == null) result = caseReferrable(connection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DrawioPackage.TAG: {
				Tag tag = (Tag)theEObject;
				T result = caseTag(tag);
				if (result == null) result = caseStringIdentity(tag);
				if (result == null) result = caseReferrable(tag);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DrawioPackage.ABSTRACT_LINK: {
				AbstractLink abstractLink = (AbstractLink)theEObject;
				T result = caseAbstractLink(abstractLink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DrawioPackage.SIMPLE_LINK: {
				SimpleLink simpleLink = (SimpleLink)theEObject;
				T result = caseSimpleLink(simpleLink);
				if (result == null) result = caseAbstractLink(simpleLink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DrawioPackage.CUSTOM_LINK: {
				CustomLink customLink = (CustomLink)theEObject;
				T result = caseCustomLink(customLink);
				if (result == null) result = caseAbstractLink(customLink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DrawioPackage.SPEL_LINK: {
				SpelLink spelLink = (SpelLink)theEObject;
				T result = caseSpelLink(spelLink);
				if (result == null) result = caseAbstractLink(spelLink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DrawioPackage.ACTIONS: {
				Actions actions = (Actions)theEObject;
				T result = caseActions(actions);
				if (result == null) result = caseAbstractLink(actions);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DrawioPackage.ANIMATION: {
				Animation animation = (Animation)theEObject;
				T result = caseAnimation(animation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DrawioPackage.ACTION: {
				Action action = (Action)theEObject;
				T result = caseAction(action);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DrawioPackage.WAIT: {
				Wait wait = (Wait)theEObject;
				T result = caseWait(wait);
				if (result == null) result = caseAction(wait);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DrawioPackage.TARGETED_ACTION: {
				TargetedAction targetedAction = (TargetedAction)theEObject;
				T result = caseTargetedAction(targetedAction);
				if (result == null) result = caseAction(targetedAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DrawioPackage.PERSISTABLE_ACTION: {
				PersistableAction persistableAction = (PersistableAction)theEObject;
				T result = casePersistableAction(persistableAction);
				if (result == null) result = caseTargetedAction(persistableAction);
				if (result == null) result = caseAction(persistableAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DrawioPackage.SHOW: {
				Show show = (Show)theEObject;
				T result = caseShow(show);
				if (result == null) result = casePersistableAction(show);
				if (result == null) result = caseTargetedAction(show);
				if (result == null) result = caseAction(show);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DrawioPackage.HIDE: {
				Hide hide = (Hide)theEObject;
				T result = caseHide(hide);
				if (result == null) result = casePersistableAction(hide);
				if (result == null) result = caseTargetedAction(hide);
				if (result == null) result = caseAction(hide);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DrawioPackage.TOGGLE: {
				Toggle toggle = (Toggle)theEObject;
				T result = caseToggle(toggle);
				if (result == null) result = casePersistableAction(toggle);
				if (result == null) result = caseTargetedAction(toggle);
				if (result == null) result = caseAction(toggle);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DrawioPackage.SET_OPACITY: {
				SetOpacity setOpacity = (SetOpacity)theEObject;
				T result = caseSetOpacity(setOpacity);
				if (result == null) result = caseTargetedAction(setOpacity);
				if (result == null) result = caseAction(setOpacity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DrawioPackage.TRANSITION_EFFECT: {
				TransitionEffect transitionEffect = (TransitionEffect)theEObject;
				T result = caseTransitionEffect(transitionEffect);
				if (result == null) result = caseTargetedAction(transitionEffect);
				if (result == null) result = caseAction(transitionEffect);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DrawioPackage.FADE_IN: {
				FadeIn fadeIn = (FadeIn)theEObject;
				T result = caseFadeIn(fadeIn);
				if (result == null) result = caseTransitionEffect(fadeIn);
				if (result == null) result = caseTargetedAction(fadeIn);
				if (result == null) result = caseAction(fadeIn);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DrawioPackage.FADE_OUT: {
				FadeOut fadeOut = (FadeOut)theEObject;
				T result = caseFadeOut(fadeOut);
				if (result == null) result = caseTransitionEffect(fadeOut);
				if (result == null) result = caseTargetedAction(fadeOut);
				if (result == null) result = caseAction(fadeOut);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DrawioPackage.FADE_TO: {
				FadeTo fadeTo = (FadeTo)theEObject;
				T result = caseFadeTo(fadeTo);
				if (result == null) result = caseTransitionEffect(fadeTo);
				if (result == null) result = caseTargetedAction(fadeTo);
				if (result == null) result = caseAction(fadeTo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DrawioPackage.WIPE_IN: {
				WipeIn wipeIn = (WipeIn)theEObject;
				T result = caseWipeIn(wipeIn);
				if (result == null) result = caseTransitionEffect(wipeIn);
				if (result == null) result = caseTargetedAction(wipeIn);
				if (result == null) result = caseAction(wipeIn);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DrawioPackage.WIPE_OUT: {
				WipeOut wipeOut = (WipeOut)theEObject;
				T result = caseWipeOut(wipeOut);
				if (result == null) result = caseTransitionEffect(wipeOut);
				if (result == null) result = caseTargetedAction(wipeOut);
				if (result == null) result = caseAction(wipeOut);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DrawioPackage.POP_IN: {
				PopIn popIn = (PopIn)theEObject;
				T result = casePopIn(popIn);
				if (result == null) result = caseTransitionEffect(popIn);
				if (result == null) result = caseTargetedAction(popIn);
				if (result == null) result = caseAction(popIn);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DrawioPackage.POP_OUT: {
				PopOut popOut = (PopOut)theEObject;
				T result = casePopOut(popOut);
				if (result == null) result = caseTransitionEffect(popOut);
				if (result == null) result = caseTargetedAction(popOut);
				if (result == null) result = caseAction(popOut);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DrawioPackage.SET_STYLE: {
				SetStyle setStyle = (SetStyle)theEObject;
				T result = caseSetStyle(setStyle);
				if (result == null) result = casePersistableAction(setStyle);
				if (result == null) result = caseTargetedAction(setStyle);
				if (result == null) result = caseAction(setStyle);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DrawioPackage.TOGGLE_STYLE: {
				ToggleStyle toggleStyle = (ToggleStyle)theEObject;
				T result = caseToggleStyle(toggleStyle);
				if (result == null) result = casePersistableAction(toggleStyle);
				if (result == null) result = caseTargetedAction(toggleStyle);
				if (result == null) result = caseAction(toggleStyle);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DrawioPackage.HIGHLIGHT: {
				Highlight highlight = (Highlight)theEObject;
				T result = caseHighlight(highlight);
				if (result == null) result = caseTargetedAction(highlight);
				if (result == null) result = caseAction(highlight);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DrawioPackage.FLOW: {
				Flow flow = (Flow)theEObject;
				T result = caseFlow(flow);
				if (result == null) result = caseTargetedAction(flow);
				if (result == null) result = caseAction(flow);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DrawioPackage.SELECT: {
				Select select = (Select)theEObject;
				T result = caseSelect(select);
				if (result == null) result = caseTargetedAction(select);
				if (result == null) result = caseAction(select);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DrawioPackage.SCROLL: {
				Scroll scroll = (Scroll)theEObject;
				T result = caseScroll(scroll);
				if (result == null) result = caseTargetedAction(scroll);
				if (result == null) result = caseAction(scroll);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DrawioPackage.VIEWBOX: {
				Viewbox viewbox = (Viewbox)theEObject;
				T result = caseViewbox(viewbox);
				if (result == null) result = caseAction(viewbox);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DrawioPackage.OPEN: {
				Open open = (Open)theEObject;
				T result = caseOpen(open);
				if (result == null) result = caseAction(open);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DrawioPackage.TAGS_ACTION: {
				TagsAction tagsAction = (TagsAction)theEObject;
				T result = caseTagsAction(tagsAction);
				if (result == null) result = caseAction(tagsAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Document</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Document</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocument(Document object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Link Target</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Link Target</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLinkTarget(LinkTarget object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Page</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Page</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePage(Page object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Layer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Layer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLayer(Layer object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Connection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConnection(Connection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tag</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tag</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTag(Tag object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractLink(AbstractLink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Simple Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Simple Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSimpleLink(SimpleLink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Custom Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Custom Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCustomLink(CustomLink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Spel Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Spel Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpelLink(SpelLink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Actions</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Actions</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActions(Actions object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Animation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Animation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnimation(Animation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAction(Action object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Wait</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Wait</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWait(Wait object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Targeted Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Targeted Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTargetedAction(TargetedAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Persistable Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Persistable Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePersistableAction(PersistableAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Show</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Show</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseShow(Show object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hide</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hide</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHide(Hide object) {
		return null;
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
	 * Returns the result of interpreting the object as an instance of '<em>Set Opacity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Set Opacity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSetOpacity(SetOpacity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transition Effect</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transition Effect</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransitionEffect(TransitionEffect object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fade In</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fade In</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFadeIn(FadeIn object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fade Out</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fade Out</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFadeOut(FadeOut object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fade To</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fade To</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFadeTo(FadeTo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Wipe In</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Wipe In</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWipeIn(WipeIn object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Wipe Out</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Wipe Out</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWipeOut(WipeOut object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pop In</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pop In</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePopIn(PopIn object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pop Out</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pop Out</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePopOut(PopOut object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Set Style</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Set Style</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSetStyle(SetStyle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Toggle Style</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Toggle Style</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseToggleStyle(ToggleStyle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Highlight</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Highlight</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHighlight(Highlight object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Flow</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Flow</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFlow(Flow object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Select</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Select</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSelect(Select object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Scroll</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Scroll</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScroll(Scroll object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Viewbox</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Viewbox</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseViewbox(Viewbox object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Open</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Open</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOpen(Open object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tags Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tags Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTagsAction(TagsAction object) {
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
	public T caseCore_ModelElement(org.nasdanika.sdk.runtime.models.core.ModelElement object) {
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
	public T caseDiagramElement(DiagramElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diagram</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diagram</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiagram(Diagram object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Presentation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Presentation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePresentation(Presentation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Slide</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Slide</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSlide(Slide object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Layer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Layer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiagram_Layer(org.nasdanika.sdk.runtime.models.diagram.Layer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connectable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connectable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConnectable(Connectable object) {
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
	public T caseDiagram_Node(org.nasdanika.sdk.runtime.models.diagram.Node object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiagram_Connection(org.nasdanika.sdk.runtime.models.diagram.Connection object) {
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

} //DrawioSwitch
