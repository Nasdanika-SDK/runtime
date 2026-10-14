/**
 */
package org.nasdanika.sdk.runtime.models.react;

import org.nasdanika.sdk.runtime.models.typescript.CodeBlock;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Context Provider</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <SomeContext.Provider value={...}>. Kept as its own class rather than a plain
 * JsxElement because the provider is where a ui.DataContext lands, and the
 * transformation needs to find these to hoist scopes correctly.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.ContextProvider#getContext <em>Context</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.ContextProvider#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.sdk.runtime.models.react.ReactPackage#getContextProvider()
 * @model
 * @generated
 */
public interface ContextProvider extends JsxContainer {
	/**
	 * Returns the value of the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context</em>' reference.
	 * @see #setContext(ContextDeclaration)
	 * @see org.nasdanika.sdk.runtime.models.react.ReactPackage#getContextProvider_Context()
	 * @model
	 * @generated
	 */
	ContextDeclaration getContext();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.react.ContextProvider#getContext <em>Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context</em>' reference.
	 * @see #getContext()
	 * @generated
	 */
	void setContext(ContextDeclaration value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' containment reference.
	 * @see #setValue(CodeBlock)
	 * @see org.nasdanika.sdk.runtime.models.react.ReactPackage#getContextProvider_Value()
	 * @model containment="true"
	 * @generated
	 */
	CodeBlock getValue();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.react.ContextProvider#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(CodeBlock value);

} // ContextProvider
