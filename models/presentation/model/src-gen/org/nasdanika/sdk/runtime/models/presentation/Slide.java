/**
 */
package org.nasdanika.sdk.runtime.models.presentation;

import org.nasdanika.sdk.runtime.models.diagram.Diagram;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Slide</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A slide IS a diagram: shapes are diagram nodes, connectors are diagram connections,
 * which makes slides convertible to/from Draw.io, Visio, PlantUML.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.presentation.Slide#getMaster <em>Master</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.presentation.Slide#isHidden <em>Hidden</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.presentation.Slide#getNotes <em>Notes</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.sdk.runtime.models.presentation.PresentationPackage#getSlide()
 * @model
 * @generated
 */
public interface Slide extends Diagram {
	/**
	 * Returns the value of the '<em><b>Master</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Master</em>' reference.
	 * @see #setMaster(MasterSlide)
	 * @see org.nasdanika.sdk.runtime.models.presentation.PresentationPackage#getSlide_Master()
	 * @model
	 * @generated
	 */
	MasterSlide getMaster();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.presentation.Slide#getMaster <em>Master</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Master</em>' reference.
	 * @see #getMaster()
	 * @generated
	 */
	void setMaster(MasterSlide value);

	/**
	 * Returns the value of the '<em><b>Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hidden</em>' attribute.
	 * @see #setHidden(boolean)
	 * @see org.nasdanika.sdk.runtime.models.presentation.PresentationPackage#getSlide_Hidden()
	 * @model unique="false"
	 * @generated
	 */
	boolean isHidden();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.presentation.Slide#isHidden <em>Hidden</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hidden</em>' attribute.
	 * @see #isHidden()
	 * @generated
	 */
	void setHidden(boolean value);

	/**
	 * Returns the value of the '<em><b>Notes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Speaker notes. Also the primary annotation carrier for composability:
	 * a conventional YAML/JSON block in notes is parsed on load into diagram
	 * properties / modelElement bindings and re-emitted on save.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Notes</em>' containment reference.
	 * @see #setNotes(Notes)
	 * @see org.nasdanika.sdk.runtime.models.presentation.PresentationPackage#getSlide_Notes()
	 * @model containment="true"
	 * @generated
	 */
	Notes getNotes();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.presentation.Slide#getNotes <em>Notes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Notes</em>' containment reference.
	 * @see #getNotes()
	 * @generated
	 */
	void setNotes(Notes value);

} // Slide
