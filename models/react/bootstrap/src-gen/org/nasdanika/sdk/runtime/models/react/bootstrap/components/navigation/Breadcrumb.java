/**
 */
package org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation;

import org.eclipse.emf.common.util.EList;

import org.nasdanika.sdk.runtime.models.react.bootstrap.BootstrapComponent;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Breadcrumb</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.Breadcrumb#getItems <em>Items</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.NavigationPackage#getBreadcrumb()
 * @model annotation="urn:org.nasdanika:react component='Breadcrumb'"
 * @generated
 */
public interface Breadcrumb extends BootstrapComponent {
	/**
	 * Returns the value of the '<em><b>Items</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.BreadcrumbItem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Items</em>' containment reference list.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.NavigationPackage#getBreadcrumb_Items()
	 * @model containment="true"
	 * @generated
	 */
	EList<BreadcrumbItem> getItems();

} // Breadcrumb
