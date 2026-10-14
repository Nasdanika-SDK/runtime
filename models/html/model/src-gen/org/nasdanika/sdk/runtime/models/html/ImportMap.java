/**
 */
package org.nasdanika.sdk.runtime.models.html;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Import Map</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <script type="importmap"> - bare module specifiers to URLs, rendered as JSON.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.ImportMap#getImports <em>Imports</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.ImportMap#getScopes <em>Scopes</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.sdk.runtime.models.html.HtmlPackage#getImportMap()
 * @model
 * @generated
 */
public interface ImportMap extends Element {
	/**
	 * Returns the value of the '<em><b>Imports</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Specifier or specifier prefix to URL
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Imports</em>' map.
	 * @see org.nasdanika.sdk.runtime.models.html.HtmlPackage#getImportMap_Imports()
	 * @model mapType="org.nasdanika.sdk.runtime.models.core.StringToStringMapEntry&lt;org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString&gt;"
	 * @generated
	 */
	EMap<String, String> getImports();

	/**
	 * Returns the value of the '<em><b>Scopes</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.sdk.runtime.models.html.ImportMapScope}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scopes</em>' containment reference list.
	 * @see org.nasdanika.sdk.runtime.models.html.HtmlPackage#getImportMap_Scopes()
	 * @model containment="true"
	 * @generated
	 */
	EList<ImportMapScope> getScopes();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false"
	 * @generated
	 */
	String tagName();

} // ImportMap
