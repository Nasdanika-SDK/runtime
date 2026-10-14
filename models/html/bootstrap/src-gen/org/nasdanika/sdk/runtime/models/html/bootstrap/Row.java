/**
 */
package org.nasdanika.sdk.runtime.models.html.bootstrap;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Row</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.bootstrap.Row#getColumnsPerRow <em>Columns Per Row</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.bootstrap.Row#getGutter <em>Gutter</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.bootstrap.Row#getColumns <em>Columns</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.BootstrapPackage#getRow()
 * @model annotation="urn:org.nasdanika:html tag='div' classes='row'"
 * @generated
 */
public interface Row extends BootstrapElement {
	/**
	 * Returns the value of the '<em><b>Columns Per Row</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.sdk.runtime.models.html.bootstrap.RowColumns}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Columns Per Row</em>' containment reference list.
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.BootstrapPackage#getRow_ColumnsPerRow()
	 * @model containment="true"
	 *        annotation="urn:org.nasdanika:html logical='true'"
	 * @generated
	 */
	EList<RowColumns> getColumnsPerRow();

	/**
	 * Returns the value of the '<em><b>Gutter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Gutter, 0 - 5
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Gutter</em>' attribute.
	 * @see #isSetGutter()
	 * @see #unsetGutter()
	 * @see #setGutter(int)
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.BootstrapPackage#getRow_Gutter()
	 * @model unique="false" unsettable="true"
	 *        annotation="urn:org.nasdanika:html classes='g-{}'"
	 * @generated
	 */
	int getGutter();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.Row#getGutter <em>Gutter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gutter</em>' attribute.
	 * @see #isSetGutter()
	 * @see #unsetGutter()
	 * @see #getGutter()
	 * @generated
	 */
	void setGutter(int value);

	/**
	 * Unsets the value of the '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.Row#getGutter <em>Gutter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetGutter()
	 * @see #getGutter()
	 * @see #setGutter(int)
	 * @generated
	 */
	void unsetGutter();

	/**
	 * Returns whether the value of the '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.Row#getGutter <em>Gutter</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Gutter</em>' attribute is set.
	 * @see #unsetGutter()
	 * @see #getGutter()
	 * @see #setGutter(int)
	 * @generated
	 */
	boolean isSetGutter();

	/**
	 * Returns the value of the '<em><b>Columns</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.sdk.runtime.models.html.bootstrap.Col}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Columns</em>' containment reference list.
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.BootstrapPackage#getRow_Columns()
	 * @model containment="true"
	 * @generated
	 */
	EList<Col> getColumns();

} // Row
