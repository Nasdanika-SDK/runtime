/**
 */
package org.nasdanika.sdk.runtime.models.react;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Context Hook</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.ContextHook#getContext <em>Context</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.sdk.runtime.models.react.ReactPackage#getContextHook()
 * @model
 * @generated
 */
public interface ContextHook extends Hook {
	/**
	 * Returns the value of the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context</em>' reference.
	 * @see #setContext(ContextDeclaration)
	 * @see org.nasdanika.sdk.runtime.models.react.ReactPackage#getContextHook_Context()
	 * @model
	 * @generated
	 */
	ContextDeclaration getContext();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.react.ContextHook#getContext <em>Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context</em>' reference.
	 * @see #getContext()
	 * @generated
	 */
	void setContext(ContextDeclaration value);

} // ContextHook
