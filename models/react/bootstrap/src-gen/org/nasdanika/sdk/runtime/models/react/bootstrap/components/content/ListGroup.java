/**
 */
package org.nasdanika.sdk.runtime.models.react.bootstrap.components.content;

import org.eclipse.emf.common.util.EList;

import org.nasdanika.sdk.runtime.models.react.bootstrap.BootstrapComponent;
import org.nasdanika.sdk.runtime.models.react.bootstrap.Breakpoint;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.content.ListGroup#isFlush <em>Flush</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.content.ListGroup#isNumbered <em>Numbered</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.content.ListGroup#isHorizontal <em>Horizontal</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.content.ListGroup#getHorizontalFrom <em>Horizontal From</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.content.ListGroup#getItems <em>Items</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.content.ContentPackage#getListGroup()
 * @model annotation="urn:org.nasdanika:react component='ListGroup'"
 * @generated
 */
public interface ListGroup extends BootstrapComponent {
	/**
	 * Returns the value of the '<em><b>Flush</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flush</em>' attribute.
	 * @see #setFlush(boolean)
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.content.ContentPackage#getListGroup_Flush()
	 * @model unique="false"
	 * @generated
	 */
	boolean isFlush();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.content.ListGroup#isFlush <em>Flush</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Flush</em>' attribute.
	 * @see #isFlush()
	 * @generated
	 */
	void setFlush(boolean value);

	/**
	 * Returns the value of the '<em><b>Numbered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Numbered</em>' attribute.
	 * @see #setNumbered(boolean)
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.content.ContentPackage#getListGroup_Numbered()
	 * @model unique="false"
	 * @generated
	 */
	boolean isNumbered();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.content.ListGroup#isNumbered <em>Numbered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Numbered</em>' attribute.
	 * @see #isNumbered()
	 * @generated
	 */
	void setNumbered(boolean value);

	/**
	 * Returns the value of the '<em><b>Horizontal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Horizontal</em>' attribute.
	 * @see #setHorizontal(boolean)
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.content.ContentPackage#getListGroup_Horizontal()
	 * @model unique="false"
	 * @generated
	 */
	boolean isHorizontal();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.content.ListGroup#isHorizontal <em>Horizontal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Horizontal</em>' attribute.
	 * @see #isHorizontal()
	 * @generated
	 */
	void setHorizontal(boolean value);

	/**
	 * Returns the value of the '<em><b>Horizontal From</b></em>' attribute.
	 * The literals are from the enumeration {@link org.nasdanika.sdk.runtime.models.react.bootstrap.Breakpoint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Horizontal from the breakpoint up. Wins over horizontal.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Horizontal From</em>' attribute.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.Breakpoint
	 * @see #isSetHorizontalFrom()
	 * @see #unsetHorizontalFrom()
	 * @see #setHorizontalFrom(Breakpoint)
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.content.ContentPackage#getListGroup_HorizontalFrom()
	 * @model unique="false" unsettable="true"
	 *        annotation="urn:org.nasdanika:react prop='horizontal'"
	 * @generated
	 */
	Breakpoint getHorizontalFrom();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.content.ListGroup#getHorizontalFrom <em>Horizontal From</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Horizontal From</em>' attribute.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.Breakpoint
	 * @see #isSetHorizontalFrom()
	 * @see #unsetHorizontalFrom()
	 * @see #getHorizontalFrom()
	 * @generated
	 */
	void setHorizontalFrom(Breakpoint value);

	/**
	 * Unsets the value of the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.content.ListGroup#getHorizontalFrom <em>Horizontal From</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetHorizontalFrom()
	 * @see #getHorizontalFrom()
	 * @see #setHorizontalFrom(Breakpoint)
	 * @generated
	 */
	void unsetHorizontalFrom();

	/**
	 * Returns whether the value of the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.content.ListGroup#getHorizontalFrom <em>Horizontal From</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Horizontal From</em>' attribute is set.
	 * @see #unsetHorizontalFrom()
	 * @see #getHorizontalFrom()
	 * @see #setHorizontalFrom(Breakpoint)
	 * @generated
	 */
	boolean isSetHorizontalFrom();

	/**
	 * Returns the value of the '<em><b>Items</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.content.ListGroupItem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Items</em>' containment reference list.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.content.ContentPackage#getListGroup_Items()
	 * @model containment="true"
	 * @generated
	 */
	EList<ListGroupItem> getItems();

} // ListGroup
