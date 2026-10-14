/**
 */
package org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation;

import org.nasdanika.sdk.runtime.models.react.bootstrap.BootstrapComponent;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Navbar Toggle</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.NavbarToggle#getControls <em>Controls</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.NavigationPackage#getNavbarToggle()
 * @model annotation="urn:org.nasdanika:react component='Navbar.Toggle'"
 * @generated
 */
public interface NavbarToggle extends BootstrapComponent {
	/**
	 * Returns the value of the '<em><b>Controls</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Id of the collapse
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Controls</em>' attribute.
	 * @see #setControls(String)
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.NavigationPackage#getNavbarToggle_Controls()
	 * @model unique="false"
	 *        annotation="urn:org.nasdanika:react prop='aria-controls'"
	 * @generated
	 */
	String getControls();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.NavbarToggle#getControls <em>Controls</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Controls</em>' attribute.
	 * @see #getControls()
	 * @generated
	 */
	void setControls(String value);

} // NavbarToggle
