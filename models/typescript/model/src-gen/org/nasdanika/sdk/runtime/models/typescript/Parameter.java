/**
 */
package org.nasdanika.sdk.runtime.models.typescript;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.typescript.Parameter#getType <em>Type</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.typescript.Parameter#isOptional <em>Optional</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.typescript.Parameter#isRest <em>Rest</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.typescript.Parameter#getDefaultValue <em>Default Value</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.sdk.runtime.models.typescript.TypescriptPackage#getParameter()
 * @model
 * @generated
 */
public interface Parameter extends TypeScriptElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(TypeReference)
	 * @see org.nasdanika.sdk.runtime.models.typescript.TypescriptPackage#getParameter_Type()
	 * @model containment="true"
	 * @generated
	 */
	TypeReference getType();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.typescript.Parameter#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(TypeReference value);

	/**
	 * Returns the value of the '<em><b>Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Optional</em>' attribute.
	 * @see #setOptional(boolean)
	 * @see org.nasdanika.sdk.runtime.models.typescript.TypescriptPackage#getParameter_Optional()
	 * @model unique="false"
	 * @generated
	 */
	boolean isOptional();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.typescript.Parameter#isOptional <em>Optional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Optional</em>' attribute.
	 * @see #isOptional()
	 * @generated
	 */
	void setOptional(boolean value);

	/**
	 * Returns the value of the '<em><b>Rest</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Rest parameter: ...args
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rest</em>' attribute.
	 * @see #setRest(boolean)
	 * @see org.nasdanika.sdk.runtime.models.typescript.TypescriptPackage#getParameter_Rest()
	 * @model unique="false"
	 * @generated
	 */
	boolean isRest();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.typescript.Parameter#isRest <em>Rest</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rest</em>' attribute.
	 * @see #isRest()
	 * @generated
	 */
	void setRest(boolean value);

	/**
	 * Returns the value of the '<em><b>Default Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Value</em>' containment reference.
	 * @see #setDefaultValue(CodeBlock)
	 * @see org.nasdanika.sdk.runtime.models.typescript.TypescriptPackage#getParameter_DefaultValue()
	 * @model containment="true"
	 * @generated
	 */
	CodeBlock getDefaultValue();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.typescript.Parameter#getDefaultValue <em>Default Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value</em>' containment reference.
	 * @see #getDefaultValue()
	 * @generated
	 */
	void setDefaultValue(CodeBlock value);

} // Parameter
