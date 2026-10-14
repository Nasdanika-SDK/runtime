/**
 */
package org.nasdanika.sdk.runtime.models.react;

import org.eclipse.emf.common.util.EList;

import org.nasdanika.sdk.runtime.models.typescript.CodeBlock;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Memo Hook</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 *  useMemo, or useCallback when callback is set.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.MemoHook#getExpression <em>Expression</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.MemoHook#getDependencies <em>Dependencies</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.MemoHook#isCallback <em>Callback</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.sdk.runtime.models.react.ReactPackage#getMemoHook()
 * @model
 * @generated
 */
public interface MemoHook extends Hook {
	/**
	 * Returns the value of the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression</em>' containment reference.
	 * @see #setExpression(CodeBlock)
	 * @see org.nasdanika.sdk.runtime.models.react.ReactPackage#getMemoHook_Expression()
	 * @model containment="true"
	 * @generated
	 */
	CodeBlock getExpression();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.react.MemoHook#getExpression <em>Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' containment reference.
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression(CodeBlock value);

	/**
	 * Returns the value of the '<em><b>Dependencies</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.sdk.runtime.models.typescript.CodeBlock}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dependencies</em>' containment reference list.
	 * @see org.nasdanika.sdk.runtime.models.react.ReactPackage#getMemoHook_Dependencies()
	 * @model containment="true"
	 * @generated
	 */
	EList<CodeBlock> getDependencies();

	/**
	 * Returns the value of the '<em><b>Callback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Callback</em>' attribute.
	 * @see #setCallback(boolean)
	 * @see org.nasdanika.sdk.runtime.models.react.ReactPackage#getMemoHook_Callback()
	 * @model unique="false"
	 * @generated
	 */
	boolean isCallback();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.react.MemoHook#isCallback <em>Callback</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Callback</em>' attribute.
	 * @see #isCallback()
	 * @generated
	 */
	void setCallback(boolean value);

} // MemoHook
