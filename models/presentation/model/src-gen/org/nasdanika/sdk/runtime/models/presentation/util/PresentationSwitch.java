/**
 */
package org.nasdanika.sdk.runtime.models.presentation.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.nasdanika.sdk.runtime.models.core.Attributed;
import org.nasdanika.sdk.runtime.models.core.Documented;
import org.nasdanika.sdk.runtime.models.core.Marked;
import org.nasdanika.sdk.runtime.models.core.ModelElement;
import org.nasdanika.sdk.runtime.models.core.NamedElement;
import org.nasdanika.sdk.runtime.models.core.Referrable;
import org.nasdanika.sdk.runtime.models.core.StringIdentity;

import org.nasdanika.sdk.runtime.models.diagram.Connectable;
import org.nasdanika.sdk.runtime.models.diagram.Connection;
import org.nasdanika.sdk.runtime.models.diagram.Diagram;
import org.nasdanika.sdk.runtime.models.diagram.DiagramElement;
import org.nasdanika.sdk.runtime.models.diagram.Node;

import org.nasdanika.sdk.runtime.models.presentation.*;

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
 * @see org.nasdanika.sdk.runtime.models.presentation.PresentationPackage
 * @generated
 */
public class PresentationSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static PresentationPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PresentationSwitch() {
		if (modelPackage == null) {
			modelPackage = PresentationPackage.eINSTANCE;
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
			case PresentationPackage.PRESENTATION: {
				Presentation presentation = (Presentation)theEObject;
				T result = casePresentation(presentation);
				if (result == null) result = caseDiagram(presentation);
				if (result == null) result = caseDiagramElement(presentation);
				if (result == null) result = caseNamedElement(presentation);
				if (result == null) result = caseAttributed(presentation);
				if (result == null) result = caseModelElement(presentation);
				if (result == null) result = caseStringIdentity(presentation);
				if (result == null) result = caseDocumented(presentation);
				if (result == null) result = caseMarked(presentation);
				if (result == null) result = caseReferrable(presentation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PresentationPackage.SLIDE: {
				Slide slide = (Slide)theEObject;
				T result = caseSlide(slide);
				if (result == null) result = caseDiagram(slide);
				if (result == null) result = caseDiagramElement(slide);
				if (result == null) result = caseNamedElement(slide);
				if (result == null) result = caseAttributed(slide);
				if (result == null) result = caseModelElement(slide);
				if (result == null) result = caseStringIdentity(slide);
				if (result == null) result = caseDocumented(slide);
				if (result == null) result = caseMarked(slide);
				if (result == null) result = caseReferrable(slide);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PresentationPackage.MASTER_SLIDE: {
				MasterSlide masterSlide = (MasterSlide)theEObject;
				T result = caseMasterSlide(masterSlide);
				if (result == null) result = caseSlide(masterSlide);
				if (result == null) result = caseDiagram(masterSlide);
				if (result == null) result = caseDiagramElement(masterSlide);
				if (result == null) result = caseNamedElement(masterSlide);
				if (result == null) result = caseAttributed(masterSlide);
				if (result == null) result = caseModelElement(masterSlide);
				if (result == null) result = caseStringIdentity(masterSlide);
				if (result == null) result = caseDocumented(masterSlide);
				if (result == null) result = caseMarked(masterSlide);
				if (result == null) result = caseReferrable(masterSlide);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PresentationPackage.NOTES: {
				Notes notes = (Notes)theEObject;
				T result = caseNotes(notes);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PresentationPackage.SHAPE: {
				Shape shape = (Shape)theEObject;
				T result = caseShape(shape);
				if (result == null) result = caseNode(shape);
				if (result == null) result = caseConnectable(shape);
				if (result == null) result = caseDiagramElement(shape);
				if (result == null) result = caseNamedElement(shape);
				if (result == null) result = caseAttributed(shape);
				if (result == null) result = caseModelElement(shape);
				if (result == null) result = caseStringIdentity(shape);
				if (result == null) result = caseDocumented(shape);
				if (result == null) result = caseMarked(shape);
				if (result == null) result = caseReferrable(shape);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PresentationPackage.GROUP_SHAPE: {
				GroupShape groupShape = (GroupShape)theEObject;
				T result = caseGroupShape(groupShape);
				if (result == null) result = caseShape(groupShape);
				if (result == null) result = caseNode(groupShape);
				if (result == null) result = caseConnectable(groupShape);
				if (result == null) result = caseDiagramElement(groupShape);
				if (result == null) result = caseNamedElement(groupShape);
				if (result == null) result = caseAttributed(groupShape);
				if (result == null) result = caseModelElement(groupShape);
				if (result == null) result = caseStringIdentity(groupShape);
				if (result == null) result = caseDocumented(groupShape);
				if (result == null) result = caseMarked(groupShape);
				if (result == null) result = caseReferrable(groupShape);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PresentationPackage.TEXT_SHAPE: {
				TextShape textShape = (TextShape)theEObject;
				T result = caseTextShape(textShape);
				if (result == null) result = caseShape(textShape);
				if (result == null) result = caseNode(textShape);
				if (result == null) result = caseConnectable(textShape);
				if (result == null) result = caseDiagramElement(textShape);
				if (result == null) result = caseNamedElement(textShape);
				if (result == null) result = caseAttributed(textShape);
				if (result == null) result = caseModelElement(textShape);
				if (result == null) result = caseStringIdentity(textShape);
				if (result == null) result = caseDocumented(textShape);
				if (result == null) result = caseMarked(textShape);
				if (result == null) result = caseReferrable(textShape);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PresentationPackage.PARAGRAPH: {
				Paragraph paragraph = (Paragraph)theEObject;
				T result = caseParagraph(paragraph);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PresentationPackage.TEXT_RUN: {
				TextRun textRun = (TextRun)theEObject;
				T result = caseTextRun(textRun);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PresentationPackage.IMAGE_SHAPE: {
				ImageShape imageShape = (ImageShape)theEObject;
				T result = caseImageShape(imageShape);
				if (result == null) result = caseShape(imageShape);
				if (result == null) result = caseNode(imageShape);
				if (result == null) result = caseConnectable(imageShape);
				if (result == null) result = caseDiagramElement(imageShape);
				if (result == null) result = caseNamedElement(imageShape);
				if (result == null) result = caseAttributed(imageShape);
				if (result == null) result = caseModelElement(imageShape);
				if (result == null) result = caseStringIdentity(imageShape);
				if (result == null) result = caseDocumented(imageShape);
				if (result == null) result = caseMarked(imageShape);
				if (result == null) result = caseReferrable(imageShape);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PresentationPackage.MEDIA_SHAPE: {
				MediaShape mediaShape = (MediaShape)theEObject;
				T result = caseMediaShape(mediaShape);
				if (result == null) result = caseShape(mediaShape);
				if (result == null) result = caseNode(mediaShape);
				if (result == null) result = caseConnectable(mediaShape);
				if (result == null) result = caseDiagramElement(mediaShape);
				if (result == null) result = caseNamedElement(mediaShape);
				if (result == null) result = caseAttributed(mediaShape);
				if (result == null) result = caseModelElement(mediaShape);
				if (result == null) result = caseStringIdentity(mediaShape);
				if (result == null) result = caseDocumented(mediaShape);
				if (result == null) result = caseMarked(mediaShape);
				if (result == null) result = caseReferrable(mediaShape);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PresentationPackage.TABLE_SHAPE: {
				TableShape tableShape = (TableShape)theEObject;
				T result = caseTableShape(tableShape);
				if (result == null) result = caseShape(tableShape);
				if (result == null) result = caseNode(tableShape);
				if (result == null) result = caseConnectable(tableShape);
				if (result == null) result = caseDiagramElement(tableShape);
				if (result == null) result = caseNamedElement(tableShape);
				if (result == null) result = caseAttributed(tableShape);
				if (result == null) result = caseModelElement(tableShape);
				if (result == null) result = caseStringIdentity(tableShape);
				if (result == null) result = caseDocumented(tableShape);
				if (result == null) result = caseMarked(tableShape);
				if (result == null) result = caseReferrable(tableShape);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PresentationPackage.ROW: {
				Row row = (Row)theEObject;
				T result = caseRow(row);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PresentationPackage.CELL: {
				Cell cell = (Cell)theEObject;
				T result = caseCell(cell);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PresentationPackage.CONNECTOR_SHAPE: {
				ConnectorShape connectorShape = (ConnectorShape)theEObject;
				T result = caseConnectorShape(connectorShape);
				if (result == null) result = caseConnection(connectorShape);
				if (result == null) result = caseDiagramElement(connectorShape);
				if (result == null) result = caseNamedElement(connectorShape);
				if (result == null) result = caseAttributed(connectorShape);
				if (result == null) result = caseModelElement(connectorShape);
				if (result == null) result = caseStringIdentity(connectorShape);
				if (result == null) result = caseDocumented(connectorShape);
				if (result == null) result = caseMarked(connectorShape);
				if (result == null) result = caseReferrable(connectorShape);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
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
	 * Returns the result of interpreting the object as an instance of '<em>Master Slide</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Master Slide</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMasterSlide(MasterSlide object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Notes</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Notes</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNotes(Notes object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Shape</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Shape</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseShape(Shape object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Group Shape</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Group Shape</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGroupShape(GroupShape object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Text Shape</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Text Shape</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTextShape(TextShape object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Paragraph</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Paragraph</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParagraph(Paragraph object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Text Run</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Text Run</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTextRun(TextRun object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Image Shape</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Image Shape</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImageShape(ImageShape object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Media Shape</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Media Shape</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMediaShape(MediaShape object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Table Shape</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Table Shape</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTableShape(TableShape object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Row</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Row</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRow(Row object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cell</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cell</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCell(Cell object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connector Shape</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connector Shape</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConnectorShape(ConnectorShape object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Attributed</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attributed</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttributed(Attributed object) {
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

} //PresentationSwitch
