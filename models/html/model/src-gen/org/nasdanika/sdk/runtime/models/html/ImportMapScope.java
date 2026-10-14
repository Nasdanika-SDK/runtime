/**
 */
package org.nasdanika.sdk.runtime.models.html;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Import Map Scope</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Imports applying to modules under a URL prefix.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.ImportMapScope#getPrefix <em>Prefix</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.ImportMapScope#getImports <em>Imports</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.sdk.runtime.models.html.HtmlPackage#getImportMapScope()
 * @model
 * @generated
 */
public interface ImportMapScope extends EObject {
	/**
	 * Returns the value of the '<em><b>Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prefix</em>' attribute.
	 * @see #setPrefix(String)
	 * @see org.nasdanika.sdk.runtime.models.html.HtmlPackage#getImportMapScope_Prefix()
	 * @model unique="false"
	 * @generated
	 */
	String getPrefix();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.html.ImportMapScope#getPrefix <em>Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prefix</em>' attribute.
	 * @see #getPrefix()
	 * @generated
	 */
	void setPrefix(String value);

	/**
	 * Returns the value of the '<em><b>Imports</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imports</em>' map.
	 * @see org.nasdanika.sdk.runtime.models.html.HtmlPackage#getImportMapScope_Imports()
	 * @model mapType="org.nasdanika.sdk.runtime.models.core.StringToStringMapEntry&lt;org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString&gt;"
	 * @generated
	 */
	EMap<String, String> getImports();

} // ImportMapScope
