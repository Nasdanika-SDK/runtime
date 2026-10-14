/**
 */
package org.nasdanika.sdk.runtime.models.html;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Table</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.Table#getCaption <em>Caption</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.Table#getColumnGroups <em>Column Groups</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.Table#getHead <em>Head</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.Table#getBodies <em>Bodies</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.Table#getFoot <em>Foot</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.sdk.runtime.models.html.HtmlPackage#getTable()
 * @model
 * @generated
 */
public interface Table extends Element {
	/**
	 * Returns the value of the '<em><b>Caption</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Caption</em>' containment reference.
	 * @see #setCaption(Caption)
	 * @see org.nasdanika.sdk.runtime.models.html.HtmlPackage#getTable_Caption()
	 * @model containment="true"
	 * @generated
	 */
	Caption getCaption();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.html.Table#getCaption <em>Caption</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Caption</em>' containment reference.
	 * @see #getCaption()
	 * @generated
	 */
	void setCaption(Caption value);

	/**
	 * Returns the value of the '<em><b>Column Groups</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.sdk.runtime.models.html.ColumnGroup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Column Groups</em>' containment reference list.
	 * @see org.nasdanika.sdk.runtime.models.html.HtmlPackage#getTable_ColumnGroups()
	 * @model containment="true"
	 * @generated
	 */
	EList<ColumnGroup> getColumnGroups();

	/**
	 * Returns the value of the '<em><b>Head</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Head</em>' containment reference.
	 * @see #setHead(TableHead)
	 * @see org.nasdanika.sdk.runtime.models.html.HtmlPackage#getTable_Head()
	 * @model containment="true"
	 * @generated
	 */
	TableHead getHead();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.html.Table#getHead <em>Head</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Head</em>' containment reference.
	 * @see #getHead()
	 * @generated
	 */
	void setHead(TableHead value);

	/**
	 * Returns the value of the '<em><b>Bodies</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.sdk.runtime.models.html.TableBody}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  HTML allows multiple tbody elements
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bodies</em>' containment reference list.
	 * @see org.nasdanika.sdk.runtime.models.html.HtmlPackage#getTable_Bodies()
	 * @model containment="true"
	 * @generated
	 */
	EList<TableBody> getBodies();

	/**
	 * Returns the value of the '<em><b>Foot</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Foot</em>' containment reference.
	 * @see #setFoot(TableFoot)
	 * @see org.nasdanika.sdk.runtime.models.html.HtmlPackage#getTable_Foot()
	 * @model containment="true"
	 * @generated
	 */
	TableFoot getFoot();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.html.Table#getFoot <em>Foot</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Foot</em>' containment reference.
	 * @see #getFoot()
	 * @generated
	 */
	void setFoot(TableFoot value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false"
	 * @generated
	 */
	String tagName();

} // Table
