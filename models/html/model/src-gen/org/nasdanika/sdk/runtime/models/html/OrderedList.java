/**
 */
package org.nasdanika.sdk.runtime.models.html;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ordered List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.OrderedList#getStart <em>Start</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.OrderedList#isReversed <em>Reversed</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.OrderedList#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.sdk.runtime.models.html.HtmlPackage#getOrderedList()
 * @model
 * @generated
 */
public interface OrderedList extends Element, ItemList {
	/**
	 * Returns the value of the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start</em>' attribute.
	 * @see #setStart(int)
	 * @see org.nasdanika.sdk.runtime.models.html.HtmlPackage#getOrderedList_Start()
	 * @model unique="false"
	 * @generated
	 */
	int getStart();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.html.OrderedList#getStart <em>Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start</em>' attribute.
	 * @see #getStart()
	 * @generated
	 */
	void setStart(int value);

	/**
	 * Returns the value of the '<em><b>Reversed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reversed</em>' attribute.
	 * @see #setReversed(boolean)
	 * @see org.nasdanika.sdk.runtime.models.html.HtmlPackage#getOrderedList_Reversed()
	 * @model unique="false"
	 * @generated
	 */
	boolean isReversed();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.html.OrderedList#isReversed <em>Reversed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reversed</em>' attribute.
	 * @see #isReversed()
	 * @generated
	 */
	void setReversed(boolean value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see org.nasdanika.sdk.runtime.models.html.HtmlPackage#getOrderedList_Type()
	 * @model unique="false"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.html.OrderedList#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false"
	 * @generated
	 */
	String tagName();

} // OrderedList
