/**
 */
package org.nasdanika.sdk.runtime.models.react;

import org.nasdanika.sdk.runtime.models.typescript.CodeBlock;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Jsx Conditional</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Conditional rendering. With `otherwise` set the emitter writes a ternary,
 * without it a short-circuit. Target of ui.Conditional.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.JsxConditional#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.JsxConditional#getThen <em>Then</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.JsxConditional#getOtherwise <em>Otherwise</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.sdk.runtime.models.react.ReactPackage#getJsxConditional()
 * @model
 * @generated
 */
public interface JsxConditional extends JsxNode {
	/**
	 * Returns the value of the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' containment reference.
	 * @see #setCondition(CodeBlock)
	 * @see org.nasdanika.sdk.runtime.models.react.ReactPackage#getJsxConditional_Condition()
	 * @model containment="true"
	 * @generated
	 */
	CodeBlock getCondition();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.react.JsxConditional#getCondition <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' containment reference.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(CodeBlock value);

	/**
	 * Returns the value of the '<em><b>Then</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Then</em>' containment reference.
	 * @see #setThen(JsxNode)
	 * @see org.nasdanika.sdk.runtime.models.react.ReactPackage#getJsxConditional_Then()
	 * @model containment="true"
	 * @generated
	 */
	JsxNode getThen();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.react.JsxConditional#getThen <em>Then</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Then</em>' containment reference.
	 * @see #getThen()
	 * @generated
	 */
	void setThen(JsxNode value);

	/**
	 * Returns the value of the '<em><b>Otherwise</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Otherwise</em>' containment reference.
	 * @see #setOtherwise(JsxNode)
	 * @see org.nasdanika.sdk.runtime.models.react.ReactPackage#getJsxConditional_Otherwise()
	 * @model containment="true"
	 * @generated
	 */
	JsxNode getOtherwise();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.react.JsxConditional#getOtherwise <em>Otherwise</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Otherwise</em>' containment reference.
	 * @see #getOtherwise()
	 * @generated
	 */
	void setOtherwise(JsxNode value);

} // JsxConditional
