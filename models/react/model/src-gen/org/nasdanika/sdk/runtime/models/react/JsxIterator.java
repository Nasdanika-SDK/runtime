/**
 */
package org.nasdanika.sdk.runtime.models.react;

import org.nasdanika.sdk.runtime.models.typescript.CodeBlock;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Jsx Iterator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * List rendering: {items.map(variable => template)}. Target of ui.Iterator, whose
 * `key` already exists for keyed updates and lands here as React's required key
 * prop. The emitter must reject a missing key rather than emit a warning at runtime.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.JsxIterator#getItems <em>Items</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.JsxIterator#getVariable <em>Variable</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.JsxIterator#getKey <em>Key</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.JsxIterator#getTemplate <em>Template</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.sdk.runtime.models.react.ReactPackage#getJsxIterator()
 * @model
 * @generated
 */
public interface JsxIterator extends JsxNode {
	/**
	 * Returns the value of the '<em><b>Items</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Items</em>' containment reference.
	 * @see #setItems(CodeBlock)
	 * @see org.nasdanika.sdk.runtime.models.react.ReactPackage#getJsxIterator_Items()
	 * @model containment="true"
	 * @generated
	 */
	CodeBlock getItems();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.react.JsxIterator#getItems <em>Items</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Items</em>' containment reference.
	 * @see #getItems()
	 * @generated
	 */
	void setItems(CodeBlock value);

	/**
	 * Returns the value of the '<em><b>Variable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable</em>' attribute.
	 * @see #setVariable(String)
	 * @see org.nasdanika.sdk.runtime.models.react.ReactPackage#getJsxIterator_Variable()
	 * @model unique="false"
	 * @generated
	 */
	String getVariable();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.react.JsxIterator#getVariable <em>Variable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable</em>' attribute.
	 * @see #getVariable()
	 * @generated
	 */
	void setVariable(String value);

	/**
	 * Returns the value of the '<em><b>Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key</em>' containment reference.
	 * @see #setKey(CodeBlock)
	 * @see org.nasdanika.sdk.runtime.models.react.ReactPackage#getJsxIterator_Key()
	 * @model containment="true"
	 * @generated
	 */
	CodeBlock getKey();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.react.JsxIterator#getKey <em>Key</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key</em>' containment reference.
	 * @see #getKey()
	 * @generated
	 */
	void setKey(CodeBlock value);

	/**
	 * Returns the value of the '<em><b>Template</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Template</em>' containment reference.
	 * @see #setTemplate(JsxNode)
	 * @see org.nasdanika.sdk.runtime.models.react.ReactPackage#getJsxIterator_Template()
	 * @model containment="true"
	 * @generated
	 */
	JsxNode getTemplate();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.react.JsxIterator#getTemplate <em>Template</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Template</em>' containment reference.
	 * @see #getTemplate()
	 * @generated
	 */
	void setTemplate(JsxNode value);

} // JsxIterator
