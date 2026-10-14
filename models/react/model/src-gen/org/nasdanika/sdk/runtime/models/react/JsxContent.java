/**
 */
package org.nasdanika.sdk.runtime.models.react;

import org.nasdanika.sdk.runtime.models.html.Node;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Jsx Content</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * JSX in an HTML container: {expression}, conditionals, iterators, component elements.
 * The counterpart of Intrinsic, so the two trees nest in each other. Rendered by the JSX
 * emitter only - static HTML generation rejects it.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.JsxContent#getNode <em>Node</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.sdk.runtime.models.react.ReactPackage#getJsxContent()
 * @model
 * @generated
 */
public interface JsxContent extends Node {
	/**
	 * Returns the value of the '<em><b>Node</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node</em>' containment reference.
	 * @see #setNode(JsxNode)
	 * @see org.nasdanika.sdk.runtime.models.react.ReactPackage#getJsxContent_Node()
	 * @model containment="true"
	 * @generated
	 */
	JsxNode getNode();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.react.JsxContent#getNode <em>Node</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Node</em>' containment reference.
	 * @see #getNode()
	 * @generated
	 */
	void setNode(JsxNode value);

} // JsxContent
