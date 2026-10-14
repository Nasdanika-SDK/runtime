/**
 */
package org.nasdanika.sdk.runtime.models.react.bootstrap;

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
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.bootstrap.Row#getColumnsPerRow <em>Columns Per Row</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.bootstrap.Row#getColumns <em>Columns</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.BootstrapPackage#getRow()
 * @model annotation="urn:org.nasdanika:react component='Row'"
 * @generated
 */
public interface Row extends BootstrapComponent {
	/**
	 * Returns the value of the '<em><b>Columns Per Row</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.sdk.runtime.models.react.bootstrap.RowColumns}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Columns Per Row</em>' containment reference list.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.BootstrapPackage#getRow_ColumnsPerRow()
	 * @model containment="true"
	 *        annotation="urn:org.nasdanika:react key='breakpoint'"
	 * @generated
	 */
	EList<RowColumns> getColumnsPerRow();

	/**
	 * Returns the value of the '<em><b>Columns</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.sdk.runtime.models.react.bootstrap.Col}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Columns</em>' containment reference list.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.BootstrapPackage#getRow_Columns()
	 * @model containment="true"
	 * @generated
	 */
	EList<Col> getColumns();

} // Row
