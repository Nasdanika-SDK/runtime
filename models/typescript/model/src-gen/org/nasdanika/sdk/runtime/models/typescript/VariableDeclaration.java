/**
 */
package org.nasdanika.sdk.runtime.models.typescript;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.typescript.VariableDeclaration#getVariableKind <em>Variable Kind</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.typescript.VariableDeclaration#getType <em>Type</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.typescript.VariableDeclaration#getInitializer <em>Initializer</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.sdk.runtime.models.typescript.TypescriptPackage#getVariableDeclaration()
 * @model
 * @generated
 */
public interface VariableDeclaration extends Declaration, Callable {
	/**
	 * Returns the value of the '<em><b>Variable Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link org.nasdanika.sdk.runtime.models.typescript.VariableKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable Kind</em>' attribute.
	 * @see org.nasdanika.sdk.runtime.models.typescript.VariableKind
	 * @see #setVariableKind(VariableKind)
	 * @see org.nasdanika.sdk.runtime.models.typescript.TypescriptPackage#getVariableDeclaration_VariableKind()
	 * @model unique="false"
	 * @generated
	 */
	VariableKind getVariableKind();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.typescript.VariableDeclaration#getVariableKind <em>Variable Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable Kind</em>' attribute.
	 * @see org.nasdanika.sdk.runtime.models.typescript.VariableKind
	 * @see #getVariableKind()
	 * @generated
	 */
	void setVariableKind(VariableKind value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(TypeReference)
	 * @see org.nasdanika.sdk.runtime.models.typescript.TypescriptPackage#getVariableDeclaration_Type()
	 * @model containment="true"
	 * @generated
	 */
	TypeReference getType();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.typescript.VariableDeclaration#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(TypeReference value);

	/**
	 * Returns the value of the '<em><b>Initializer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initializer</em>' containment reference.
	 * @see #setInitializer(CodeBlock)
	 * @see org.nasdanika.sdk.runtime.models.typescript.TypescriptPackage#getVariableDeclaration_Initializer()
	 * @model containment="true"
	 * @generated
	 */
	CodeBlock getInitializer();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.typescript.VariableDeclaration#getInitializer <em>Initializer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initializer</em>' containment reference.
	 * @see #getInitializer()
	 * @generated
	 */
	void setInitializer(CodeBlock value);

} // VariableDeclaration
