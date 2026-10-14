/**
 */
package org.nasdanika.sdk.runtime.models.react;

import org.eclipse.emf.common.util.EList;

import org.nasdanika.sdk.runtime.models.typescript.CodeBlock;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Effect Hook</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 *  useEffect, or useLayoutEffect when layout is set. Empty dependencies means run once.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.EffectHook#getBody <em>Body</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.EffectHook#getDependencies <em>Dependencies</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.EffectHook#isLayout <em>Layout</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.EffectHook#getCleanup <em>Cleanup</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.sdk.runtime.models.react.ReactPackage#getEffectHook()
 * @model
 * @generated
 */
public interface EffectHook extends Hook {
	/**
	 * Returns the value of the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body</em>' containment reference.
	 * @see #setBody(CodeBlock)
	 * @see org.nasdanika.sdk.runtime.models.react.ReactPackage#getEffectHook_Body()
	 * @model containment="true"
	 * @generated
	 */
	CodeBlock getBody();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.react.EffectHook#getBody <em>Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body</em>' containment reference.
	 * @see #getBody()
	 * @generated
	 */
	void setBody(CodeBlock value);

	/**
	 * Returns the value of the '<em><b>Dependencies</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.sdk.runtime.models.typescript.CodeBlock}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dependencies</em>' containment reference list.
	 * @see org.nasdanika.sdk.runtime.models.react.ReactPackage#getEffectHook_Dependencies()
	 * @model containment="true"
	 * @generated
	 */
	EList<CodeBlock> getDependencies();

	/**
	 * Returns the value of the '<em><b>Layout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Layout</em>' attribute.
	 * @see #setLayout(boolean)
	 * @see org.nasdanika.sdk.runtime.models.react.ReactPackage#getEffectHook_Layout()
	 * @model unique="false"
	 * @generated
	 */
	boolean isLayout();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.react.EffectHook#isLayout <em>Layout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Layout</em>' attribute.
	 * @see #isLayout()
	 * @generated
	 */
	void setLayout(boolean value);

	/**
	 * Returns the value of the '<em><b>Cleanup</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Returned teardown, if any.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cleanup</em>' containment reference.
	 * @see #setCleanup(CodeBlock)
	 * @see org.nasdanika.sdk.runtime.models.react.ReactPackage#getEffectHook_Cleanup()
	 * @model containment="true"
	 * @generated
	 */
	CodeBlock getCleanup();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.react.EffectHook#getCleanup <em>Cleanup</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cleanup</em>' containment reference.
	 * @see #getCleanup()
	 * @generated
	 */
	void setCleanup(CodeBlock value);

} // EffectHook
