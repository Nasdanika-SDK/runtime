/**
 */
package org.nasdanika.sdk.runtime.models.react.bootstrap.components.content;

import org.nasdanika.sdk.runtime.models.react.bootstrap.BootstrapComponent;
import org.nasdanika.sdk.runtime.models.react.bootstrap.TextContent;
import org.nasdanika.sdk.runtime.models.react.bootstrap.Variant;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List Group Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.content.ListGroupItem#getVariant <em>Variant</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.content.ListGroupItem#isAction <em>Action</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.content.ListGroupItem#isActive <em>Active</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.content.ListGroupItem#isDisabled <em>Disabled</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.content.ListGroupItem#getHref <em>Href</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.content.ContentPackage#getListGroupItem()
 * @model annotation="urn:org.nasdanika:react component='ListGroup.Item'"
 * @generated
 */
public interface ListGroupItem extends BootstrapComponent, TextContent {
	/**
	 * Returns the value of the '<em><b>Variant</b></em>' attribute.
	 * The literals are from the enumeration {@link org.nasdanika.sdk.runtime.models.react.bootstrap.Variant}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variant</em>' attribute.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.Variant
	 * @see #isSetVariant()
	 * @see #unsetVariant()
	 * @see #setVariant(Variant)
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.content.ContentPackage#getListGroupItem_Variant()
	 * @model unique="false" unsettable="true"
	 * @generated
	 */
	Variant getVariant();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.content.ListGroupItem#getVariant <em>Variant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variant</em>' attribute.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.Variant
	 * @see #isSetVariant()
	 * @see #unsetVariant()
	 * @see #getVariant()
	 * @generated
	 */
	void setVariant(Variant value);

	/**
	 * Unsets the value of the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.content.ListGroupItem#getVariant <em>Variant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetVariant()
	 * @see #getVariant()
	 * @see #setVariant(Variant)
	 * @generated
	 */
	void unsetVariant();

	/**
	 * Returns whether the value of the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.content.ListGroupItem#getVariant <em>Variant</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Variant</em>' attribute is set.
	 * @see #unsetVariant()
	 * @see #getVariant()
	 * @see #setVariant(Variant)
	 * @generated
	 */
	boolean isSetVariant();

	/**
	 * Returns the value of the '<em><b>Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Hover and click styles; renders a button, or a link if href is set
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Action</em>' attribute.
	 * @see #setAction(boolean)
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.content.ContentPackage#getListGroupItem_Action()
	 * @model unique="false"
	 * @generated
	 */
	boolean isAction();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.content.ListGroupItem#isAction <em>Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action</em>' attribute.
	 * @see #isAction()
	 * @generated
	 */
	void setAction(boolean value);

	/**
	 * Returns the value of the '<em><b>Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Active</em>' attribute.
	 * @see #setActive(boolean)
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.content.ContentPackage#getListGroupItem_Active()
	 * @model unique="false"
	 * @generated
	 */
	boolean isActive();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.content.ListGroupItem#isActive <em>Active</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Active</em>' attribute.
	 * @see #isActive()
	 * @generated
	 */
	void setActive(boolean value);

	/**
	 * Returns the value of the '<em><b>Disabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Disabled</em>' attribute.
	 * @see #setDisabled(boolean)
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.content.ContentPackage#getListGroupItem_Disabled()
	 * @model unique="false"
	 * @generated
	 */
	boolean isDisabled();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.content.ListGroupItem#isDisabled <em>Disabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Disabled</em>' attribute.
	 * @see #isDisabled()
	 * @generated
	 */
	void setDisabled(boolean value);

	/**
	 * Returns the value of the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Href</em>' attribute.
	 * @see #setHref(String)
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.content.ContentPackage#getListGroupItem_Href()
	 * @model unique="false"
	 * @generated
	 */
	String getHref();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.content.ListGroupItem#getHref <em>Href</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Href</em>' attribute.
	 * @see #getHref()
	 * @generated
	 */
	void setHref(String value);

} // ListGroupItem
