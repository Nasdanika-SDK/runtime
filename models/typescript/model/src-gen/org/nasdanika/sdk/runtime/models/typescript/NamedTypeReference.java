/**
 */
package org.nasdanika.sdk.runtime.models.typescript;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Named Type Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Reference to a declared type. `target` is set for types declared inside this
 * model, and is what the import resolver follows to work out the specifier and
 * whether the import can be type-only. `qualifiedName` plus `moduleSpecifier` cover
 * types from packages the generator does not own.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.typescript.NamedTypeReference#getTarget <em>Target</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.typescript.NamedTypeReference#getQualifiedName <em>Qualified Name</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.typescript.NamedTypeReference#getModuleSpecifier <em>Module Specifier</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.typescript.NamedTypeReference#getTypeArguments <em>Type Arguments</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.sdk.runtime.models.typescript.TypescriptPackage#getNamedTypeReference()
 * @model
 * @generated
 */
public interface NamedTypeReference extends TypeReference {
	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Declaration)
	 * @see org.nasdanika.sdk.runtime.models.typescript.TypescriptPackage#getNamedTypeReference_Target()
	 * @model
	 * @generated
	 */
	Declaration getTarget();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.typescript.NamedTypeReference#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Declaration value);

	/**
	 * Returns the value of the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Qualified Name</em>' attribute.
	 * @see #setQualifiedName(String)
	 * @see org.nasdanika.sdk.runtime.models.typescript.TypescriptPackage#getNamedTypeReference_QualifiedName()
	 * @model unique="false"
	 * @generated
	 */
	String getQualifiedName();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.typescript.NamedTypeReference#getQualifiedName <em>Qualified Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Qualified Name</em>' attribute.
	 * @see #getQualifiedName()
	 * @generated
	 */
	void setQualifiedName(String value);

	/**
	 * Returns the value of the '<em><b>Module Specifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Module Specifier</em>' attribute.
	 * @see #setModuleSpecifier(String)
	 * @see org.nasdanika.sdk.runtime.models.typescript.TypescriptPackage#getNamedTypeReference_ModuleSpecifier()
	 * @model unique="false"
	 * @generated
	 */
	String getModuleSpecifier();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.typescript.NamedTypeReference#getModuleSpecifier <em>Module Specifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Module Specifier</em>' attribute.
	 * @see #getModuleSpecifier()
	 * @generated
	 */
	void setModuleSpecifier(String value);

	/**
	 * Returns the value of the '<em><b>Type Arguments</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.sdk.runtime.models.typescript.TypeReference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Arguments</em>' containment reference list.
	 * @see org.nasdanika.sdk.runtime.models.typescript.TypescriptPackage#getNamedTypeReference_TypeArguments()
	 * @model containment="true"
	 * @generated
	 */
	EList<TypeReference> getTypeArguments();

} // NamedTypeReference
