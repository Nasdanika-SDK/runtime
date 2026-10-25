/**
 */
package org.nasdanika.sdk.runtime.models.presentation;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Text Shape</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.presentation.TextShape#getParagraphs <em>Paragraphs</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.sdk.runtime.models.presentation.PresentationPackage#getTextShape()
 * @model
 * @generated
 */
public interface TextShape extends Shape {
	/**
	 * Returns the value of the '<em><b>Paragraphs</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.sdk.runtime.models.presentation.Paragraph}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Paragraphs</em>' containment reference list.
	 * @see org.nasdanika.sdk.runtime.models.presentation.PresentationPackage#getTextShape_Paragraphs()
	 * @model containment="true"
	 * @generated
	 */
	EList<Paragraph> getParagraphs();

} // TextShape
