/**
 */
package org.nasdanika.sdk.runtime.models.react;

import org.nasdanika.sdk.runtime.models.typescript.CodeBlock;
import org.nasdanika.sdk.runtime.models.typescript.Declaration;
import org.nasdanika.sdk.runtime.models.typescript.TypeReference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Context Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 *  React context object, created at module level.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.ContextDeclaration#getValueType <em>Value Type</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.ContextDeclaration#getDefaultValue <em>Default Value</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.sdk.runtime.models.react.ReactPackage#getContextDeclaration()
 * @model
 * @generated
 */
public interface ContextDeclaration extends Declaration {
	/**
	 * Returns the value of the '<em><b>Value Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Type</em>' containment reference.
	 * @see #setValueType(TypeReference)
	 * @see org.nasdanika.sdk.runtime.models.react.ReactPackage#getContextDeclaration_ValueType()
	 * @model containment="true"
	 * @generated
	 */
	TypeReference getValueType();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.react.ContextDeclaration#getValueType <em>Value Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Type</em>' containment reference.
	 * @see #getValueType()
	 * @generated
	 */
	void setValueType(TypeReference value);

	/**
	 * Returns the value of the '<em><b>Default Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Value</em>' containment reference.
	 * @see #setDefaultValue(CodeBlock)
	 * @see org.nasdanika.sdk.runtime.models.react.ReactPackage#getContextDeclaration_DefaultValue()
	 * @model containment="true"
	 * @generated
	 */
	CodeBlock getDefaultValue();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.react.ContextDeclaration#getDefaultValue <em>Default Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value</em>' containment reference.
	 * @see #getDefaultValue()
	 * @generated
	 */
	void setDefaultValue(CodeBlock value);

} // ContextDeclaration
