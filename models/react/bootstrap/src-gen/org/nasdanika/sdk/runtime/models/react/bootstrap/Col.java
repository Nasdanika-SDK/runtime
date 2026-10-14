/**
 */
package org.nasdanika.sdk.runtime.models.react.bootstrap;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Col</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.bootstrap.Col#getSizes <em>Sizes</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.BootstrapPackage#getCol()
 * @model annotation="urn:org.nasdanika:react component='Col'"
 * @generated
 */
public interface Col extends BootstrapComponent {
	/**
	 * Returns the value of the '<em><b>Sizes</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.sdk.runtime.models.react.bootstrap.ColumnSize}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sizes</em>' containment reference list.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.BootstrapPackage#getCol_Sizes()
	 * @model containment="true"
	 *        annotation="urn:org.nasdanika:react key='breakpoint'"
	 * @generated
	 */
	EList<ColumnSize> getSizes();

} // Col
