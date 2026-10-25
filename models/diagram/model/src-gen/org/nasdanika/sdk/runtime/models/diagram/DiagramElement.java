/**
 */
package org.nasdanika.sdk.runtime.models.diagram;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.nasdanika.sdk.runtime.models.core.Attributed;
import org.nasdanika.sdk.runtime.models.core.NamedElement;
import org.nasdanika.sdk.runtime.models.core.StringIdentity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 *  ---- Core ----
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.diagram.DiagramElement#getSemanticElements <em>Semantic Elements</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.diagram.DiagramElement#getChildren <em>Children</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.sdk.runtime.models.diagram.DiagramPackage#getDiagramElement()
 * @model abstract="true"
 * @generated
 */
public interface DiagramElement extends NamedElement, StringIdentity, Attributed {
	/**
	 * Returns the value of the '<em><b>Semantic Elements</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Semantic model elements this notation element depicts - the "other" model.
	 * Named after the semantic model / representation model distinction rather than
	 * after OMG DI's single-valued "modelElement", because a diagram element is
	 * itself a model element.
	 * 
	 * Multi-valued because a notation element may depict a collection rather than a
	 * single object: a "Forest" box mapping to a collection of trees, a container
	 * standing for a group of people or resources, or a shape representing an
	 * iteration over something.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Semantic Elements</em>' reference list.
	 * @see org.nasdanika.sdk.runtime.models.diagram.DiagramPackage#getDiagramElement_SemanticElements()
	 * @model
	 * @generated
	 */
	EList<EObject> getSemanticElements();

	/**
	 * Returns the value of the '<em><b>Children</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.sdk.runtime.models.diagram.DiagramElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children</em>' containment reference list.
	 * @see org.nasdanika.sdk.runtime.models.diagram.DiagramPackage#getDiagramElement_Children()
	 * @model containment="true"
	 * @generated
	 */
	EList<DiagramElement> getChildren();

} // DiagramElement
