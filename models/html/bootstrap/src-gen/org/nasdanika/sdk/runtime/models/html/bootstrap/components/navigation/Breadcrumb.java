/**
 */
package org.nasdanika.sdk.runtime.models.html.bootstrap.components.navigation;

import org.eclipse.emf.common.util.EList;

import org.nasdanika.sdk.runtime.models.html.bootstrap.BootstrapElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Breadcrumb</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.navigation.Breadcrumb#getItems <em>Items</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.navigation.NavigationPackage#getBreadcrumb()
 * @model annotation="urn:org.nasdanika:html tag='nav' attributes='aria-label=breadcrumb'"
 * @generated
 */
public interface Breadcrumb extends BootstrapElement {
	/**
	 * Returns the value of the '<em><b>Items</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.navigation.BreadcrumbItem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Items</em>' containment reference list.
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.navigation.NavigationPackage#getBreadcrumb_Items()
	 * @model containment="true"
	 *        annotation="urn:org.nasdanika:html logical='true'"
	 * @generated
	 */
	EList<BreadcrumbItem> getItems();

} // Breadcrumb
