/**
 */
package org.nasdanika.sdk.runtime.models.react;

import org.nasdanika.sdk.runtime.models.typescript.CodeBlock;
import org.nasdanika.sdk.runtime.models.typescript.TypeReference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ref Hook</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.RefHook#getRefType <em>Ref Type</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.RefHook#getInitialValue <em>Initial Value</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.sdk.runtime.models.react.ReactPackage#getRefHook()
 * @model
 * @generated
 */
public interface RefHook extends Hook {
	/**
	 * Returns the value of the '<em><b>Ref Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ref Type</em>' containment reference.
	 * @see #setRefType(TypeReference)
	 * @see org.nasdanika.sdk.runtime.models.react.ReactPackage#getRefHook_RefType()
	 * @model containment="true"
	 * @generated
	 */
	TypeReference getRefType();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.react.RefHook#getRefType <em>Ref Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ref Type</em>' containment reference.
	 * @see #getRefType()
	 * @generated
	 */
	void setRefType(TypeReference value);

	/**
	 * Returns the value of the '<em><b>Initial Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial Value</em>' containment reference.
	 * @see #setInitialValue(CodeBlock)
	 * @see org.nasdanika.sdk.runtime.models.react.ReactPackage#getRefHook_InitialValue()
	 * @model containment="true"
	 * @generated
	 */
	CodeBlock getInitialValue();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.react.RefHook#getInitialValue <em>Initial Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial Value</em>' containment reference.
	 * @see #getInitialValue()
	 * @generated
	 */
	void setInitialValue(CodeBlock value);

} // RefHook
