/**
 */
package org.nasdanika.sdk.runtime.models.react;

import org.nasdanika.sdk.runtime.models.typescript.CodeBlock;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * onClick={handler} and friends. Distinguished from ExpressionAttribute so the
 * emitter can validate the on* naming convention and so ui.EventBinding has an
 * unambiguous target.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.EventAttribute#getHandler <em>Handler</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.sdk.runtime.models.react.ReactPackage#getEventAttribute()
 * @model
 * @generated
 */
public interface EventAttribute extends JsxAttribute {
	/**
	 * Returns the value of the '<em><b>Handler</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Handler</em>' containment reference.
	 * @see #setHandler(CodeBlock)
	 * @see org.nasdanika.sdk.runtime.models.react.ReactPackage#getEventAttribute_Handler()
	 * @model containment="true"
	 * @generated
	 */
	CodeBlock getHandler();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.react.EventAttribute#getHandler <em>Handler</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Handler</em>' containment reference.
	 * @see #getHandler()
	 * @generated
	 */
	void setHandler(CodeBlock value);

} // EventAttribute
