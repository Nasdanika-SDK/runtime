/**
 */
package org.nasdanika.sdk.runtime.models.react;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hook</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 *  ---------------------------------------------------------------------------
 * Hooks. Declarations only: what is called, what it binds, what it depends on.
 * Bodies are opaque code, which is where application logic belongs.
 * ---------------------------------------------------------------------------
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.Hook#getBindings <em>Bindings</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.sdk.runtime.models.react.ReactPackage#getHook()
 * @model abstract="true"
 * @generated
 */
public interface Hook extends ReactElement {
	/**
	 * Returns the value of the '<em><b>Bindings</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Names bound by this hook, in destructuring order: ["count", "setCount"] for
	 * useState. Emitted as the left hand side; referenced by expressions elsewhere.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bindings</em>' attribute list.
	 * @see org.nasdanika.sdk.runtime.models.react.ReactPackage#getHook_Bindings()
	 * @model unique="false"
	 * @generated
	 */
	EList<String> getBindings();

} // Hook
