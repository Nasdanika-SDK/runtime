/**
 */
package org.nasdanika.sdk.runtime.models.presentation;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Row</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.presentation.Row#getCells <em>Cells</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.presentation.Row#getHeight <em>Height</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.sdk.runtime.models.presentation.PresentationPackage#getRow()
 * @model
 * @generated
 */
public interface Row extends EObject {
	/**
	 * Returns the value of the '<em><b>Cells</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.sdk.runtime.models.presentation.Cell}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cells</em>' containment reference list.
	 * @see org.nasdanika.sdk.runtime.models.presentation.PresentationPackage#getRow_Cells()
	 * @model containment="true"
	 * @generated
	 */
	EList<Cell> getCells();

	/**
	 * Returns the value of the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Height</em>' attribute.
	 * @see #setHeight(double)
	 * @see org.nasdanika.sdk.runtime.models.presentation.PresentationPackage#getRow_Height()
	 * @model unique="false"
	 * @generated
	 */
	double getHeight();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.presentation.Row#getHeight <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Height</em>' attribute.
	 * @see #getHeight()
	 * @generated
	 */
	void setHeight(double value);

} // Row
