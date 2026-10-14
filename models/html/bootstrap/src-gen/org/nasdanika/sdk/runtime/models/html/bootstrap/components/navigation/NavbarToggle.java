/**
 */
package org.nasdanika.sdk.runtime.models.html.bootstrap.components.navigation;

import org.nasdanika.sdk.runtime.models.html.bootstrap.BootstrapElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Navbar Toggle</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Button toggling the collapse of a navbar.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.navigation.NavbarToggle#getControls <em>Controls</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.navigation.NavigationPackage#getNavbarToggle()
 * @model annotation="urn:org.nasdanika:html tag='button' classes='navbar-toggler' attributes='type=button;data-bs-toggle=collapse;aria-expanded=false;aria-label=Toggle navigation'"
 * @generated
 */
public interface NavbarToggle extends BootstrapElement {
	/**
	 * Returns the value of the '<em><b>Controls</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Id of the collapse
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Controls</em>' attribute.
	 * @see #setControls(String)
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.navigation.NavigationPackage#getNavbarToggle_Controls()
	 * @model unique="false"
	 *        annotation="urn:org.nasdanika:html logical='true'"
	 * @generated
	 */
	String getControls();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.navigation.NavbarToggle#getControls <em>Controls</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Controls</em>' attribute.
	 * @see #getControls()
	 * @generated
	 */
	void setControls(String value);

} // NavbarToggle
