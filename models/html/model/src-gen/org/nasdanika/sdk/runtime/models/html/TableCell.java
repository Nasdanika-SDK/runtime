/**
 */
package org.nasdanika.sdk.runtime.models.html;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Table Cell</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * td, or th if header is true
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.TableCell#isHeader <em>Header</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.TableCell#getColspan <em>Colspan</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.TableCell#getRowspan <em>Rowspan</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.TableCell#getScope <em>Scope</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.TableCell#getHeaders <em>Headers</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.sdk.runtime.models.html.HtmlPackage#getTableCell()
 * @model
 * @generated
 */
public interface TableCell extends Element, Container {
	/**
	 * Returns the value of the '<em><b>Header</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Header</em>' attribute.
	 * @see #setHeader(boolean)
	 * @see org.nasdanika.sdk.runtime.models.html.HtmlPackage#getTableCell_Header()
	 * @model unique="false"
	 *        annotation="urn:org.nasdanika:html logical='true'"
	 * @generated
	 */
	boolean isHeader();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.html.TableCell#isHeader <em>Header</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Header</em>' attribute.
	 * @see #isHeader()
	 * @generated
	 */
	void setHeader(boolean value);

	/**
	 * Returns the value of the '<em><b>Colspan</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Colspan</em>' attribute.
	 * @see #setColspan(int)
	 * @see org.nasdanika.sdk.runtime.models.html.HtmlPackage#getTableCell_Colspan()
	 * @model unique="false"
	 * @generated
	 */
	int getColspan();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.html.TableCell#getColspan <em>Colspan</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Colspan</em>' attribute.
	 * @see #getColspan()
	 * @generated
	 */
	void setColspan(int value);

	/**
	 * Returns the value of the '<em><b>Rowspan</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rowspan</em>' attribute.
	 * @see #setRowspan(int)
	 * @see org.nasdanika.sdk.runtime.models.html.HtmlPackage#getTableCell_Rowspan()
	 * @model unique="false"
	 * @generated
	 */
	int getRowspan();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.html.TableCell#getRowspan <em>Rowspan</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rowspan</em>' attribute.
	 * @see #getRowspan()
	 * @generated
	 */
	void setRowspan(int value);

	/**
	 * Returns the value of the '<em><b>Scope</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  row, col, rowgroup, colgroup - for header cells
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Scope</em>' attribute.
	 * @see #setScope(String)
	 * @see org.nasdanika.sdk.runtime.models.html.HtmlPackage#getTableCell_Scope()
	 * @model unique="false"
	 * @generated
	 */
	String getScope();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.html.TableCell#getScope <em>Scope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scope</em>' attribute.
	 * @see #getScope()
	 * @generated
	 */
	void setScope(String value);

	/**
	 * Returns the value of the '<em><b>Headers</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Space separated ids of header cells
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Headers</em>' attribute.
	 * @see #setHeaders(String)
	 * @see org.nasdanika.sdk.runtime.models.html.HtmlPackage#getTableCell_Headers()
	 * @model unique="false"
	 * @generated
	 */
	String getHeaders();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.html.TableCell#getHeaders <em>Headers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Headers</em>' attribute.
	 * @see #getHeaders()
	 * @generated
	 */
	void setHeaders(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false"
	 * @generated
	 */
	String tagName();

} // TableCell
