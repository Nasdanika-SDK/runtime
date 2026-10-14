/**
 */
package org.nasdanika.sdk.runtime.models.html.bootstrap.components.navigation;

import org.eclipse.emf.common.util.EList;

import org.nasdanika.sdk.runtime.models.html.Node;

import org.nasdanika.sdk.runtime.models.html.bootstrap.BootstrapElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Navbar Collapse</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.navigation.NavbarCollapse#getContent <em>Content</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.navigation.NavigationPackage#getNavbarCollapse()
 * @model annotation="urn:org.nasdanika:html tag='div' classes='collapse navbar-collapse'"
 * @generated
 */
public interface NavbarCollapse extends BootstrapElement {
	/**
	 * Returns the value of the '<em><b>Content</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.sdk.runtime.models.html.Node}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content</em>' containment reference list.
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.navigation.NavigationPackage#getNavbarCollapse_Content()
	 * @model containment="true"
	 * @generated
	 */
	EList<Node> getContent();

} // NavbarCollapse
