/**
 */
package org.nasdanika.sdk.runtime.models.typescript;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.typescript.TypeParameter#getConstraint <em>Constraint</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.typescript.TypeParameter#getDefault <em>Default</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.sdk.runtime.models.typescript.TypescriptPackage#getTypeParameter()
 * @model
 * @generated
 */
public interface TypeParameter extends TypeScriptElement {
	/**
	 * Returns the value of the '<em><b>Constraint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraint</em>' containment reference.
	 * @see #setConstraint(TypeReference)
	 * @see org.nasdanika.sdk.runtime.models.typescript.TypescriptPackage#getTypeParameter_Constraint()
	 * @model containment="true"
	 * @generated
	 */
	TypeReference getConstraint();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.typescript.TypeParameter#getConstraint <em>Constraint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constraint</em>' containment reference.
	 * @see #getConstraint()
	 * @generated
	 */
	void setConstraint(TypeReference value);

	/**
	 * Returns the value of the '<em><b>Default</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default</em>' containment reference.
	 * @see #setDefault(TypeReference)
	 * @see org.nasdanika.sdk.runtime.models.typescript.TypescriptPackage#getTypeParameter_Default()
	 * @model containment="true"
	 * @generated
	 */
	TypeReference getDefault();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.typescript.TypeParameter#getDefault <em>Default</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default</em>' containment reference.
	 * @see #getDefault()
	 * @generated
	 */
	void setDefault(TypeReference value);

} // TypeParameter
