/**
 */
package org.nasdanika.sdk.runtime.models.react;

import org.eclipse.emf.common.util.EList;

import org.nasdanika.sdk.runtime.models.typescript.FunctionDeclaration;
import org.nasdanika.sdk.runtime.models.typescript.InterfaceDeclaration;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A React function component. It IS a TypeScript function declaration, so signature,
 * type parameters, exportedness and async-ness are inherited rather than duplicated.
 * 
 * The inherited `body` holds prelude statements as opaque code (destructuring,
 * derived values). Hooks are separate because their ORDER is semantically
 * significant in React and a generator must be able to emit them before the prelude
 * and in a stable sequence; burying them in opaque text would make that
 * unverifiable. `render` is the returned tree.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.ComponentDeclaration#getPropsType <em>Props Type</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.ComponentDeclaration#getHooks <em>Hooks</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.ComponentDeclaration#getRender <em>Render</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.ComponentDeclaration#isMemo <em>Memo</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.sdk.runtime.models.react.ReactPackage#getComponentDeclaration()
 * @model
 * @generated
 */
public interface ComponentDeclaration extends FunctionDeclaration {
	/**
	 * Returns the value of the '<em><b>Props Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Props interface, normally generated beside the component in the same module.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Props Type</em>' reference.
	 * @see #setPropsType(InterfaceDeclaration)
	 * @see org.nasdanika.sdk.runtime.models.react.ReactPackage#getComponentDeclaration_PropsType()
	 * @model
	 * @generated
	 */
	InterfaceDeclaration getPropsType();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.react.ComponentDeclaration#getPropsType <em>Props Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Props Type</em>' reference.
	 * @see #getPropsType()
	 * @generated
	 */
	void setPropsType(InterfaceDeclaration value);

	/**
	 * Returns the value of the '<em><b>Hooks</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.sdk.runtime.models.react.Hook}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Emitted in declaration order; React requires stable hook order across renders.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Hooks</em>' containment reference list.
	 * @see org.nasdanika.sdk.runtime.models.react.ReactPackage#getComponentDeclaration_Hooks()
	 * @model containment="true"
	 * @generated
	 */
	EList<Hook> getHooks();

	/**
	 * Returns the value of the '<em><b>Render</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Render</em>' containment reference.
	 * @see #setRender(JsxNode)
	 * @see org.nasdanika.sdk.runtime.models.react.ReactPackage#getComponentDeclaration_Render()
	 * @model containment="true"
	 * @generated
	 */
	JsxNode getRender();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.react.ComponentDeclaration#getRender <em>Render</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Render</em>' containment reference.
	 * @see #getRender()
	 * @generated
	 */
	void setRender(JsxNode value);

	/**
	 * Returns the value of the '<em><b>Memo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Wrap the export in React.memo.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Memo</em>' attribute.
	 * @see #setMemo(boolean)
	 * @see org.nasdanika.sdk.runtime.models.react.ReactPackage#getComponentDeclaration_Memo()
	 * @model unique="false"
	 * @generated
	 */
	boolean isMemo();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.react.ComponentDeclaration#isMemo <em>Memo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Memo</em>' attribute.
	 * @see #isMemo()
	 * @generated
	 */
	void setMemo(boolean value);

} // ComponentDeclaration
