/**
 */
package org.nasdanika.sdk.runtime.models.html;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Head</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Head. Contents, if any, are rendered after the modeled children.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.Head#getCharset <em>Charset</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.Head#getTitle <em>Title</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.Head#getBase <em>Base</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.Head#getMetas <em>Metas</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.Head#getLinks <em>Links</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.Head#getStylesheets <em>Stylesheets</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.Head#getImportMap <em>Import Map</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.Head#getScripts <em>Scripts</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.sdk.runtime.models.html.HtmlPackage#getHead()
 * @model
 * @generated
 */
public interface Head extends Element, Container {
	/**
	 * Returns the value of the '<em><b>Charset</b></em>' attribute.
	 * The default value is <code>"utf-8"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  meta charset, rendered first
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Charset</em>' attribute.
	 * @see #setCharset(String)
	 * @see org.nasdanika.sdk.runtime.models.html.HtmlPackage#getHead_Charset()
	 * @model default="utf-8" unique="false"
	 *        annotation="urn:org.nasdanika:html logical='true'"
	 * @generated
	 */
	String getCharset();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.html.Head#getCharset <em>Charset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Charset</em>' attribute.
	 * @see #getCharset()
	 * @generated
	 */
	void setCharset(String value);

	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see org.nasdanika.sdk.runtime.models.html.HtmlPackage#getHead_Title()
	 * @model unique="false"
	 *        annotation="urn:org.nasdanika:html logical='true'"
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.html.Head#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Base</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  base href
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Base</em>' attribute.
	 * @see #setBase(String)
	 * @see org.nasdanika.sdk.runtime.models.html.HtmlPackage#getHead_Base()
	 * @model unique="false"
	 *        annotation="urn:org.nasdanika:html logical='true'"
	 * @generated
	 */
	String getBase();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.html.Head#getBase <em>Base</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base</em>' attribute.
	 * @see #getBase()
	 * @generated
	 */
	void setBase(String value);

	/**
	 * Returns the value of the '<em><b>Metas</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.sdk.runtime.models.html.Meta}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metas</em>' containment reference list.
	 * @see org.nasdanika.sdk.runtime.models.html.HtmlPackage#getHead_Metas()
	 * @model containment="true"
	 * @generated
	 */
	EList<Meta> getMetas();

	/**
	 * Returns the value of the '<em><b>Links</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.sdk.runtime.models.html.Link}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Links</em>' containment reference list.
	 * @see org.nasdanika.sdk.runtime.models.html.HtmlPackage#getHead_Links()
	 * @model containment="true"
	 * @generated
	 */
	EList<Link> getLinks();

	/**
	 * Returns the value of the '<em><b>Stylesheets</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.sdk.runtime.models.html.Stylesheet}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stylesheets</em>' containment reference list.
	 * @see org.nasdanika.sdk.runtime.models.html.HtmlPackage#getHead_Stylesheets()
	 * @model containment="true"
	 * @generated
	 */
	EList<Stylesheet> getStylesheets();

	/**
	 * Returns the value of the '<em><b>Import Map</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Rendered before scripts, as module scripts depend on it
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Import Map</em>' containment reference.
	 * @see #setImportMap(ImportMap)
	 * @see org.nasdanika.sdk.runtime.models.html.HtmlPackage#getHead_ImportMap()
	 * @model containment="true"
	 * @generated
	 */
	ImportMap getImportMap();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.html.Head#getImportMap <em>Import Map</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Import Map</em>' containment reference.
	 * @see #getImportMap()
	 * @generated
	 */
	void setImportMap(ImportMap value);

	/**
	 * Returns the value of the '<em><b>Scripts</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.sdk.runtime.models.html.Script}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scripts</em>' containment reference list.
	 * @see org.nasdanika.sdk.runtime.models.html.HtmlPackage#getHead_Scripts()
	 * @model containment="true"
	 * @generated
	 */
	EList<Script> getScripts();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false"
	 * @generated
	 */
	String tagName();

} // Head
