/**
 */
package org.nasdanika.sdk.runtime.models.react.bootstrap;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Row Columns</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Columns per row at a breakpoint: Row xs={1} md={3}.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.bootstrap.RowColumns#getBreakpoint <em>Breakpoint</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.bootstrap.RowColumns#getCount <em>Count</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.bootstrap.RowColumns#isAuto <em>Auto</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.BootstrapPackage#getRowColumns()
 * @model annotation="urn:org.nasdanika:react shorthand='count'"
 * @generated
 */
public interface RowColumns extends EObject {
	/**
	 * Returns the value of the '<em><b>Breakpoint</b></em>' attribute.
	 * The literals are from the enumeration {@link org.nasdanika.sdk.runtime.models.react.bootstrap.Breakpoint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Breakpoint</em>' attribute.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.Breakpoint
	 * @see #setBreakpoint(Breakpoint)
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.BootstrapPackage#getRowColumns_Breakpoint()
	 * @model unique="false"
	 *        annotation="urn:org.nasdanika:react logical='true'"
	 * @generated
	 */
	Breakpoint getBreakpoint();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.RowColumns#getBreakpoint <em>Breakpoint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Breakpoint</em>' attribute.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.Breakpoint
	 * @see #getBreakpoint()
	 * @generated
	 */
	void setBreakpoint(Breakpoint value);

	/**
	 * Returns the value of the '<em><b>Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Count</em>' attribute.
	 * @see #setCount(int)
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.BootstrapPackage#getRowColumns_Count()
	 * @model unique="false"
	 *        annotation="urn:org.nasdanika:react prop='count'"
	 * @generated
	 */
	int getCount();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.RowColumns#getCount <em>Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Count</em>' attribute.
	 * @see #getCount()
	 * @generated
	 */
	void setCount(int value);

	/**
	 * Returns the value of the '<em><b>Auto</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Auto</em>' attribute.
	 * @see #setAuto(boolean)
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.BootstrapPackage#getRowColumns_Auto()
	 * @model unique="false"
	 *        annotation="urn:org.nasdanika:react prop='count' value='auto'"
	 * @generated
	 */
	boolean isAuto();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.RowColumns#isAuto <em>Auto</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Auto</em>' attribute.
	 * @see #isAuto()
	 * @generated
	 */
	void setAuto(boolean value);

} // RowColumns
