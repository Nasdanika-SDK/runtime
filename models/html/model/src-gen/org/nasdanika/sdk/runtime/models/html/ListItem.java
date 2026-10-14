/**
 */
package org.nasdanika.sdk.runtime.models.html;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.ListItem#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.sdk.runtime.models.html.HtmlPackage#getListItem()
 * @model
 * @generated
 */
public interface ListItem extends Element, Container {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(int)
	 * @see org.nasdanika.sdk.runtime.models.html.HtmlPackage#getListItem_Value()
	 * @model unique="false"
	 * @generated
	 */
	int getValue();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.html.ListItem#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(int value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false"
	 * @generated
	 */
	String tagName();

} // ListItem
