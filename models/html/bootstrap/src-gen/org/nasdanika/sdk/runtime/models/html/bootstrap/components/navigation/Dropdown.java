/**
 */
package org.nasdanika.sdk.runtime.models.html.bootstrap.components.navigation;

import org.nasdanika.sdk.runtime.models.html.bootstrap.BootstrapElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dropdown</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.navigation.Dropdown#getDrop <em>Drop</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.navigation.Dropdown#getAlign <em>Align</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.navigation.Dropdown#getToggle <em>Toggle</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.navigation.Dropdown#getMenu <em>Menu</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.navigation.NavigationPackage#getDropdown()
 * @model annotation="urn:org.nasdanika:html tag='div'"
 * @generated
 */
public interface Dropdown extends BootstrapElement {
	/**
	 * Returns the value of the '<em><b>Drop</b></em>' attribute.
	 * The literals are from the enumeration {@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.navigation.Drop}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Drop</em>' attribute.
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.navigation.Drop
	 * @see #isSetDrop()
	 * @see #unsetDrop()
	 * @see #setDrop(Drop)
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.navigation.NavigationPackage#getDropdown_Drop()
	 * @model unique="false" unsettable="true"
	 *        annotation="urn:org.nasdanika:html classes='{}' default='dropdown'"
	 * @generated
	 */
	Drop getDrop();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.navigation.Dropdown#getDrop <em>Drop</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Drop</em>' attribute.
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.navigation.Drop
	 * @see #isSetDrop()
	 * @see #unsetDrop()
	 * @see #getDrop()
	 * @generated
	 */
	void setDrop(Drop value);

	/**
	 * Unsets the value of the '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.navigation.Dropdown#getDrop <em>Drop</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDrop()
	 * @see #getDrop()
	 * @see #setDrop(Drop)
	 * @generated
	 */
	void unsetDrop();

	/**
	 * Returns whether the value of the '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.navigation.Dropdown#getDrop <em>Drop</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Drop</em>' attribute is set.
	 * @see #unsetDrop()
	 * @see #getDrop()
	 * @see #setDrop(Drop)
	 * @generated
	 */
	boolean isSetDrop();

	/**
	 * Returns the value of the '<em><b>Align</b></em>' attribute.
	 * The literals are from the enumeration {@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.navigation.Align}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Alignment of the menu
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Align</em>' attribute.
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.navigation.Align
	 * @see #isSetAlign()
	 * @see #unsetAlign()
	 * @see #setAlign(Align)
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.navigation.NavigationPackage#getDropdown_Align()
	 * @model unique="false" unsettable="true"
	 *        annotation="urn:org.nasdanika:html logical='true'"
	 * @generated
	 */
	Align getAlign();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.navigation.Dropdown#getAlign <em>Align</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Align</em>' attribute.
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.navigation.Align
	 * @see #isSetAlign()
	 * @see #unsetAlign()
	 * @see #getAlign()
	 * @generated
	 */
	void setAlign(Align value);

	/**
	 * Unsets the value of the '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.navigation.Dropdown#getAlign <em>Align</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAlign()
	 * @see #getAlign()
	 * @see #setAlign(Align)
	 * @generated
	 */
	void unsetAlign();

	/**
	 * Returns whether the value of the '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.navigation.Dropdown#getAlign <em>Align</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Align</em>' attribute is set.
	 * @see #unsetAlign()
	 * @see #getAlign()
	 * @see #setAlign(Align)
	 * @generated
	 */
	boolean isSetAlign();

	/**
	 * Returns the value of the '<em><b>Toggle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Toggle</em>' containment reference.
	 * @see #setToggle(DropdownToggle)
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.navigation.NavigationPackage#getDropdown_Toggle()
	 * @model containment="true"
	 * @generated
	 */
	DropdownToggle getToggle();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.navigation.Dropdown#getToggle <em>Toggle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Toggle</em>' containment reference.
	 * @see #getToggle()
	 * @generated
	 */
	void setToggle(DropdownToggle value);

	/**
	 * Returns the value of the '<em><b>Menu</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Menu</em>' containment reference.
	 * @see #setMenu(DropdownMenu)
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.navigation.NavigationPackage#getDropdown_Menu()
	 * @model containment="true"
	 * @generated
	 */
	DropdownMenu getMenu();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.navigation.Dropdown#getMenu <em>Menu</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Menu</em>' containment reference.
	 * @see #getMenu()
	 * @generated
	 */
	void setMenu(DropdownMenu value);

} // Dropdown
