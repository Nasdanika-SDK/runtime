/**
 */
package org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation;

import org.eclipse.emf.common.util.EList;

import org.nasdanika.sdk.runtime.models.react.JsxNode;

import org.nasdanika.sdk.runtime.models.react.bootstrap.BootstrapComponent;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Nav Dropdown</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.NavDropdown#getTitle <em>Title</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.NavDropdown#getTitleNode <em>Title Node</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.NavDropdown#getEntries <em>Entries</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.NavigationPackage#getNavDropdown()
 * @model annotation="urn:org.nasdanika:react component='NavDropdown'"
 * @generated
 */
public interface NavDropdown extends BootstrapComponent, NavEntry {
	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.NavigationPackage#getNavDropdown_Title()
	 * @model unique="false"
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.NavDropdown#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Title Node</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Title with markup. Wins over title.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Title Node</em>' containment reference.
	 * @see #setTitleNode(JsxNode)
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.NavigationPackage#getNavDropdown_TitleNode()
	 * @model containment="true"
	 *        annotation="urn:org.nasdanika:react prop='title'"
	 * @generated
	 */
	JsxNode getTitleNode();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.NavDropdown#getTitleNode <em>Title Node</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title Node</em>' containment reference.
	 * @see #getTitleNode()
	 * @generated
	 */
	void setTitleNode(JsxNode value);

	/**
	 * Returns the value of the '<em><b>Entries</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.DropdownEntry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entries</em>' containment reference list.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.NavigationPackage#getNavDropdown_Entries()
	 * @model containment="true"
	 * @generated
	 */
	EList<DropdownEntry> getEntries();

} // NavDropdown
