/**
 */
package org.nasdanika.sdk.runtime.models.presentation;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Paragraph</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.presentation.Paragraph#getRuns <em>Runs</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.presentation.Paragraph#getIndentLevel <em>Indent Level</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.presentation.Paragraph#getAlignment <em>Alignment</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.sdk.runtime.models.presentation.PresentationPackage#getParagraph()
 * @model
 * @generated
 */
public interface Paragraph extends EObject {
	/**
	 * Returns the value of the '<em><b>Runs</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.sdk.runtime.models.presentation.TextRun}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Runs</em>' containment reference list.
	 * @see org.nasdanika.sdk.runtime.models.presentation.PresentationPackage#getParagraph_Runs()
	 * @model containment="true"
	 * @generated
	 */
	EList<TextRun> getRuns();

	/**
	 * Returns the value of the '<em><b>Indent Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Indent Level</em>' attribute.
	 * @see #setIndentLevel(int)
	 * @see org.nasdanika.sdk.runtime.models.presentation.PresentationPackage#getParagraph_IndentLevel()
	 * @model unique="false"
	 * @generated
	 */
	int getIndentLevel();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.presentation.Paragraph#getIndentLevel <em>Indent Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Indent Level</em>' attribute.
	 * @see #getIndentLevel()
	 * @generated
	 */
	void setIndentLevel(int value);

	/**
	 * Returns the value of the '<em><b>Alignment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alignment</em>' attribute.
	 * @see #setAlignment(String)
	 * @see org.nasdanika.sdk.runtime.models.presentation.PresentationPackage#getParagraph_Alignment()
	 * @model unique="false"
	 * @generated
	 */
	String getAlignment();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.presentation.Paragraph#getAlignment <em>Alignment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alignment</em>' attribute.
	 * @see #getAlignment()
	 * @generated
	 */
	void setAlignment(String value);

} // Paragraph
