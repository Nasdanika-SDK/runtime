/**
 */
package org.nasdanika.sdk.runtime.models.react;

import org.nasdanika.sdk.runtime.models.typescript.CodeBlock;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Jsx Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A function body that returns structured JSX rather than opaque text. This is the
 * seam into the TypeScript model: anywhere a CodeBlock is accepted, a JsxBlock can
 * appear, and its element types still feed import management. Used for render props,
 * cell renderers and helper functions that are not components in their own right.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.JsxBlock#getRoot <em>Root</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.sdk.runtime.models.react.ReactPackage#getJsxBlock()
 * @model
 * @generated
 */
public interface JsxBlock extends CodeBlock {
	/**
	 * Returns the value of the '<em><b>Root</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Root</em>' containment reference.
	 * @see #setRoot(JsxNode)
	 * @see org.nasdanika.sdk.runtime.models.react.ReactPackage#getJsxBlock_Root()
	 * @model containment="true"
	 * @generated
	 */
	JsxNode getRoot();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.react.JsxBlock#getRoot <em>Root</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Root</em>' containment reference.
	 * @see #getRoot()
	 * @generated
	 */
	void setRoot(JsxNode value);

} // JsxBlock
