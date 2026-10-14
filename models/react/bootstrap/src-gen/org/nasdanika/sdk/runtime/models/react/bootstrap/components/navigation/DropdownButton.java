/**
 */
package org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation;

import org.eclipse.emf.common.util.EList;

import org.nasdanika.sdk.runtime.models.react.JsxNode;

import org.nasdanika.sdk.runtime.models.react.bootstrap.BootstrapComponent;
import org.nasdanika.sdk.runtime.models.react.bootstrap.ButtonVariant;
import org.nasdanika.sdk.runtime.models.react.bootstrap.Size;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dropdown Button</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Dropdown with a button toggle in one component.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.DropdownButton#getTitle <em>Title</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.DropdownButton#getTitleNode <em>Title Node</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.DropdownButton#getVariant <em>Variant</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.DropdownButton#getSize <em>Size</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.DropdownButton#getDrop <em>Drop</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.DropdownButton#getEntries <em>Entries</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.NavigationPackage#getDropdownButton()
 * @model annotation="urn:org.nasdanika:react component='DropdownButton'"
 * @generated
 */
public interface DropdownButton extends BootstrapComponent {
	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.NavigationPackage#getDropdownButton_Title()
	 * @model unique="false"
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.DropdownButton#getTitle <em>Title</em>}' attribute.
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
	 * @return the value of the '<em>Title Node</em>' containment reference.
	 * @see #setTitleNode(JsxNode)
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.NavigationPackage#getDropdownButton_TitleNode()
	 * @model containment="true"
	 *        annotation="urn:org.nasdanika:react prop='title'"
	 * @generated
	 */
	JsxNode getTitleNode();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.DropdownButton#getTitleNode <em>Title Node</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title Node</em>' containment reference.
	 * @see #getTitleNode()
	 * @generated
	 */
	void setTitleNode(JsxNode value);

	/**
	 * Returns the value of the '<em><b>Variant</b></em>' attribute.
	 * The literals are from the enumeration {@link org.nasdanika.sdk.runtime.models.react.bootstrap.ButtonVariant}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variant</em>' attribute.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.ButtonVariant
	 * @see #isSetVariant()
	 * @see #unsetVariant()
	 * @see #setVariant(ButtonVariant)
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.NavigationPackage#getDropdownButton_Variant()
	 * @model unique="false" unsettable="true"
	 * @generated
	 */
	ButtonVariant getVariant();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.DropdownButton#getVariant <em>Variant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variant</em>' attribute.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.ButtonVariant
	 * @see #isSetVariant()
	 * @see #unsetVariant()
	 * @see #getVariant()
	 * @generated
	 */
	void setVariant(ButtonVariant value);

	/**
	 * Unsets the value of the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.DropdownButton#getVariant <em>Variant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetVariant()
	 * @see #getVariant()
	 * @see #setVariant(ButtonVariant)
	 * @generated
	 */
	void unsetVariant();

	/**
	 * Returns whether the value of the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.DropdownButton#getVariant <em>Variant</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Variant</em>' attribute is set.
	 * @see #unsetVariant()
	 * @see #getVariant()
	 * @see #setVariant(ButtonVariant)
	 * @generated
	 */
	boolean isSetVariant();

	/**
	 * Returns the value of the '<em><b>Size</b></em>' attribute.
	 * The literals are from the enumeration {@link org.nasdanika.sdk.runtime.models.react.bootstrap.Size}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size</em>' attribute.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.Size
	 * @see #isSetSize()
	 * @see #unsetSize()
	 * @see #setSize(Size)
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.NavigationPackage#getDropdownButton_Size()
	 * @model unique="false" unsettable="true"
	 * @generated
	 */
	Size getSize();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.DropdownButton#getSize <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size</em>' attribute.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.Size
	 * @see #isSetSize()
	 * @see #unsetSize()
	 * @see #getSize()
	 * @generated
	 */
	void setSize(Size value);

	/**
	 * Unsets the value of the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.DropdownButton#getSize <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSize()
	 * @see #getSize()
	 * @see #setSize(Size)
	 * @generated
	 */
	void unsetSize();

	/**
	 * Returns whether the value of the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.DropdownButton#getSize <em>Size</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Size</em>' attribute is set.
	 * @see #unsetSize()
	 * @see #getSize()
	 * @see #setSize(Size)
	 * @generated
	 */
	boolean isSetSize();

	/**
	 * Returns the value of the '<em><b>Drop</b></em>' attribute.
	 * The literals are from the enumeration {@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.Drop}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Drop</em>' attribute.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.Drop
	 * @see #isSetDrop()
	 * @see #unsetDrop()
	 * @see #setDrop(Drop)
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.NavigationPackage#getDropdownButton_Drop()
	 * @model unique="false" unsettable="true"
	 * @generated
	 */
	Drop getDrop();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.DropdownButton#getDrop <em>Drop</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Drop</em>' attribute.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.Drop
	 * @see #isSetDrop()
	 * @see #unsetDrop()
	 * @see #getDrop()
	 * @generated
	 */
	void setDrop(Drop value);

	/**
	 * Unsets the value of the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.DropdownButton#getDrop <em>Drop</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDrop()
	 * @see #getDrop()
	 * @see #setDrop(Drop)
	 * @generated
	 */
	void unsetDrop();

	/**
	 * Returns whether the value of the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.DropdownButton#getDrop <em>Drop</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Entries</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.DropdownEntry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entries</em>' containment reference list.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.NavigationPackage#getDropdownButton_Entries()
	 * @model containment="true"
	 * @generated
	 */
	EList<DropdownEntry> getEntries();

} // DropdownButton
