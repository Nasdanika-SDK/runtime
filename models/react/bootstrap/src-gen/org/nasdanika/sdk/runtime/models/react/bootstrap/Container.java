/**
 */
package org.nasdanika.sdk.runtime.models.react.bootstrap;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.bootstrap.Container#isFluid <em>Fluid</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.bootstrap.Container#getFluidUntil <em>Fluid Until</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.bootstrap.Container#getRows <em>Rows</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.BootstrapPackage#getContainer()
 * @model annotation="urn:org.nasdanika:react component='Container'"
 * @generated
 */
public interface Container extends BootstrapComponent {
	/**
	 * Returns the value of the '<em><b>Fluid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fluid</em>' attribute.
	 * @see #setFluid(boolean)
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.BootstrapPackage#getContainer_Fluid()
	 * @model unique="false"
	 * @generated
	 */
	boolean isFluid();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.Container#isFluid <em>Fluid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fluid</em>' attribute.
	 * @see #isFluid()
	 * @generated
	 */
	void setFluid(boolean value);

	/**
	 * Returns the value of the '<em><b>Fluid Until</b></em>' attribute.
	 * The literals are from the enumeration {@link org.nasdanika.sdk.runtime.models.react.bootstrap.Breakpoint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Fluid until the breakpoint. Wins over fluid.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Fluid Until</em>' attribute.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.Breakpoint
	 * @see #isSetFluidUntil()
	 * @see #unsetFluidUntil()
	 * @see #setFluidUntil(Breakpoint)
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.BootstrapPackage#getContainer_FluidUntil()
	 * @model unique="false" unsettable="true"
	 *        annotation="urn:org.nasdanika:react prop='fluid'"
	 * @generated
	 */
	Breakpoint getFluidUntil();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.Container#getFluidUntil <em>Fluid Until</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fluid Until</em>' attribute.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.Breakpoint
	 * @see #isSetFluidUntil()
	 * @see #unsetFluidUntil()
	 * @see #getFluidUntil()
	 * @generated
	 */
	void setFluidUntil(Breakpoint value);

	/**
	 * Unsets the value of the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.Container#getFluidUntil <em>Fluid Until</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFluidUntil()
	 * @see #getFluidUntil()
	 * @see #setFluidUntil(Breakpoint)
	 * @generated
	 */
	void unsetFluidUntil();

	/**
	 * Returns whether the value of the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.Container#getFluidUntil <em>Fluid Until</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Fluid Until</em>' attribute is set.
	 * @see #unsetFluidUntil()
	 * @see #getFluidUntil()
	 * @see #setFluidUntil(Breakpoint)
	 * @generated
	 */
	boolean isSetFluidUntil();

	/**
	 * Returns the value of the '<em><b>Rows</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.sdk.runtime.models.react.bootstrap.Row}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rows</em>' containment reference list.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.BootstrapPackage#getContainer_Rows()
	 * @model containment="true"
	 * @generated
	 */
	EList<Row> getRows();

} // Container
