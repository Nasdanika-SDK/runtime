/**
 */
package org.nasdanika.sdk.runtime.models.html;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Script</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Script - external if src is set, inline otherwise. Can be placed in head and in containers.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.Script#getSrc <em>Src</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.Script#getType <em>Type</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.Script#isModule <em>Module</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.Script#isAsync <em>Async</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.Script#isDefer <em>Defer</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.Script#getCrossorigin <em>Crossorigin</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.Script#getIntegrity <em>Integrity</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.Script#getContent <em>Content</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.sdk.runtime.models.html.HtmlPackage#getScript()
 * @model
 * @generated
 */
public interface Script extends Element {
	/**
	 * Returns the value of the '<em><b>Src</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Src</em>' attribute.
	 * @see #setSrc(String)
	 * @see org.nasdanika.sdk.runtime.models.html.HtmlPackage#getScript_Src()
	 * @model unique="false"
	 * @generated
	 */
	String getSrc();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.html.Script#getSrc <em>Src</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Src</em>' attribute.
	 * @see #getSrc()
	 * @generated
	 */
	void setSrc(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see org.nasdanika.sdk.runtime.models.html.HtmlPackage#getScript_Type()
	 * @model unique="false"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.html.Script#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Module</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  type="module" unless type is set explicitly
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Module</em>' attribute.
	 * @see #setModule(boolean)
	 * @see org.nasdanika.sdk.runtime.models.html.HtmlPackage#getScript_Module()
	 * @model unique="false"
	 *        annotation="urn:org.nasdanika:html logical='true'"
	 * @generated
	 */
	boolean isModule();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.html.Script#isModule <em>Module</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Module</em>' attribute.
	 * @see #isModule()
	 * @generated
	 */
	void setModule(boolean value);

	/**
	 * Returns the value of the '<em><b>Async</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Async</em>' attribute.
	 * @see #setAsync(boolean)
	 * @see org.nasdanika.sdk.runtime.models.html.HtmlPackage#getScript_Async()
	 * @model unique="false"
	 * @generated
	 */
	boolean isAsync();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.html.Script#isAsync <em>Async</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Async</em>' attribute.
	 * @see #isAsync()
	 * @generated
	 */
	void setAsync(boolean value);

	/**
	 * Returns the value of the '<em><b>Defer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Defer</em>' attribute.
	 * @see #setDefer(boolean)
	 * @see org.nasdanika.sdk.runtime.models.html.HtmlPackage#getScript_Defer()
	 * @model unique="false"
	 * @generated
	 */
	boolean isDefer();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.html.Script#isDefer <em>Defer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Defer</em>' attribute.
	 * @see #isDefer()
	 * @generated
	 */
	void setDefer(boolean value);

	/**
	 * Returns the value of the '<em><b>Crossorigin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Crossorigin</em>' attribute.
	 * @see #setCrossorigin(String)
	 * @see org.nasdanika.sdk.runtime.models.html.HtmlPackage#getScript_Crossorigin()
	 * @model unique="false"
	 * @generated
	 */
	String getCrossorigin();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.html.Script#getCrossorigin <em>Crossorigin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Crossorigin</em>' attribute.
	 * @see #getCrossorigin()
	 * @generated
	 */
	void setCrossorigin(String value);

	/**
	 * Returns the value of the '<em><b>Integrity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Integrity</em>' attribute.
	 * @see #setIntegrity(String)
	 * @see org.nasdanika.sdk.runtime.models.html.HtmlPackage#getScript_Integrity()
	 * @model unique="false"
	 * @generated
	 */
	String getIntegrity();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.html.Script#getIntegrity <em>Integrity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Integrity</em>' attribute.
	 * @see #getIntegrity()
	 * @generated
	 */
	void setIntegrity(String value);

	/**
	 * Returns the value of the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Inline source, emitted verbatim except for closing script tags
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Content</em>' attribute.
	 * @see #setContent(String)
	 * @see org.nasdanika.sdk.runtime.models.html.HtmlPackage#getScript_Content()
	 * @model unique="false"
	 *        annotation="urn:org.nasdanika:html logical='true'"
	 * @generated
	 */
	String getContent();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.html.Script#getContent <em>Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content</em>' attribute.
	 * @see #getContent()
	 * @generated
	 */
	void setContent(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false"
	 * @generated
	 */
	String tagName();

} // Script
