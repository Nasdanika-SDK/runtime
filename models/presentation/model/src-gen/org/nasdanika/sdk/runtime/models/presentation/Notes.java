/**
 */
package org.nasdanika.sdk.runtime.models.presentation;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Notes</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.presentation.Notes#getText <em>Text</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.sdk.runtime.models.presentation.PresentationPackage#getNotes()
 * @model
 * @generated
 */
public interface Notes extends EObject {
	/**
	 * Returns the value of the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' attribute.
	 * @see #setText(String)
	 * @see org.nasdanika.sdk.runtime.models.presentation.PresentationPackage#getNotes_Text()
	 * @model unique="false"
	 * @generated
	 */
	String getText();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.presentation.Notes#getText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' attribute.
	 * @see #getText()
	 * @generated
	 */
	void setText(String value);

} // Notes
