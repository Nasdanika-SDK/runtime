/**
 */
package org.nasdanika.sdk.runtime.models.presentation;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cell</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.presentation.Cell#getParagraphs <em>Paragraphs</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.presentation.Cell#getColumnSpan <em>Column Span</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.presentation.Cell#getRowSpan <em>Row Span</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.sdk.runtime.models.presentation.PresentationPackage#getCell()
 * @model
 * @generated
 */
public interface Cell extends EObject {
	/**
	 * Returns the value of the '<em><b>Paragraphs</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.sdk.runtime.models.presentation.Paragraph}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Paragraphs</em>' containment reference list.
	 * @see org.nasdanika.sdk.runtime.models.presentation.PresentationPackage#getCell_Paragraphs()
	 * @model containment="true"
	 * @generated
	 */
	EList<Paragraph> getParagraphs();

	/**
	 * Returns the value of the '<em><b>Column Span</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Column Span</em>' attribute.
	 * @see #setColumnSpan(int)
	 * @see org.nasdanika.sdk.runtime.models.presentation.PresentationPackage#getCell_ColumnSpan()
	 * @model default="1" unique="false"
	 * @generated
	 */
	int getColumnSpan();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.presentation.Cell#getColumnSpan <em>Column Span</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Column Span</em>' attribute.
	 * @see #getColumnSpan()
	 * @generated
	 */
	void setColumnSpan(int value);

	/**
	 * Returns the value of the '<em><b>Row Span</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Row Span</em>' attribute.
	 * @see #setRowSpan(int)
	 * @see org.nasdanika.sdk.runtime.models.presentation.PresentationPackage#getCell_RowSpan()
	 * @model default="1" unique="false"
	 * @generated
	 */
	int getRowSpan();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.presentation.Cell#getRowSpan <em>Row Span</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Row Span</em>' attribute.
	 * @see #getRowSpan()
	 * @generated
	 */
	void setRowSpan(int value);

} // Cell
