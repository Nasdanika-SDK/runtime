/**
 */
package org.nasdanika.sdk.runtime.models.react;

import org.nasdanika.sdk.runtime.models.typescript.CodeBlock;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Spread Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 *  {...expression}
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.SpreadAttribute#getExpression <em>Expression</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.sdk.runtime.models.react.ReactPackage#getSpreadAttribute()
 * @model
 * @generated
 */
public interface SpreadAttribute extends JsxAttribute {
	/**
	 * Returns the value of the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression</em>' containment reference.
	 * @see #setExpression(CodeBlock)
	 * @see org.nasdanika.sdk.runtime.models.react.ReactPackage#getSpreadAttribute_Expression()
	 * @model containment="true"
	 * @generated
	 */
	CodeBlock getExpression();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.react.SpreadAttribute#getExpression <em>Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' containment reference.
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression(CodeBlock value);

} // SpreadAttribute
