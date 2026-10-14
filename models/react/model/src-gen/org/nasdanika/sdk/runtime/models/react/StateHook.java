/**
 */
package org.nasdanika.sdk.runtime.models.react;

import org.nasdanika.sdk.runtime.models.typescript.CodeBlock;
import org.nasdanika.sdk.runtime.models.typescript.TypeReference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State Hook</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.StateHook#getStateType <em>State Type</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.StateHook#getInitialValue <em>Initial Value</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.sdk.runtime.models.react.ReactPackage#getStateHook()
 * @model
 * @generated
 */
public interface StateHook extends Hook {
	/**
	 * Returns the value of the '<em><b>State Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State Type</em>' containment reference.
	 * @see #setStateType(TypeReference)
	 * @see org.nasdanika.sdk.runtime.models.react.ReactPackage#getStateHook_StateType()
	 * @model containment="true"
	 * @generated
	 */
	TypeReference getStateType();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.react.StateHook#getStateType <em>State Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State Type</em>' containment reference.
	 * @see #getStateType()
	 * @generated
	 */
	void setStateType(TypeReference value);

	/**
	 * Returns the value of the '<em><b>Initial Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial Value</em>' containment reference.
	 * @see #setInitialValue(CodeBlock)
	 * @see org.nasdanika.sdk.runtime.models.react.ReactPackage#getStateHook_InitialValue()
	 * @model containment="true"
	 * @generated
	 */
	CodeBlock getInitialValue();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.react.StateHook#getInitialValue <em>Initial Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial Value</em>' containment reference.
	 * @see #getInitialValue()
	 * @generated
	 */
	void setInitialValue(CodeBlock value);

} // StateHook
