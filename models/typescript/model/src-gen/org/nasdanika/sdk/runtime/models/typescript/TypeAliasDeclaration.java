/**
 */
package org.nasdanika.sdk.runtime.models.typescript;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Alias Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.typescript.TypeAliasDeclaration#getTypeParameters <em>Type Parameters</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.typescript.TypeAliasDeclaration#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.sdk.runtime.models.typescript.TypescriptPackage#getTypeAliasDeclaration()
 * @model
 * @generated
 */
public interface TypeAliasDeclaration extends Declaration {
	/**
	 * Returns the value of the '<em><b>Type Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.sdk.runtime.models.typescript.TypeParameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Parameters</em>' containment reference list.
	 * @see org.nasdanika.sdk.runtime.models.typescript.TypescriptPackage#getTypeAliasDeclaration_TypeParameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<TypeParameter> getTypeParameters();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(TypeReference)
	 * @see org.nasdanika.sdk.runtime.models.typescript.TypescriptPackage#getTypeAliasDeclaration_Type()
	 * @model containment="true"
	 * @generated
	 */
	TypeReference getType();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.typescript.TypeAliasDeclaration#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(TypeReference value);

} // TypeAliasDeclaration
