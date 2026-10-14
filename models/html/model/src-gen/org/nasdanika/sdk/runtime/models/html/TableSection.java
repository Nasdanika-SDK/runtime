/**
 */
package org.nasdanika.sdk.runtime.models.html;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Table Section</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.TableSection#getRows <em>Rows</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.sdk.runtime.models.html.HtmlPackage#getTableSection()
 * @model abstract="true"
 * @generated
 */
public interface TableSection extends Element {
	/**
	 * Returns the value of the '<em><b>Rows</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.sdk.runtime.models.html.TableRow}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rows</em>' containment reference list.
	 * @see org.nasdanika.sdk.runtime.models.html.HtmlPackage#getTableSection_Rows()
	 * @model containment="true"
	 * @generated
	 */
	EList<TableRow> getRows();

} // TableSection
