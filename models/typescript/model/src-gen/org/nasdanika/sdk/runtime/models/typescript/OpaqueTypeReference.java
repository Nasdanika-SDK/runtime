/**
 */
package org.nasdanika.sdk.runtime.models.typescript;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Opaque Type Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Verbatim type text. Deliberate escape hatch for conditional types, mapped types,
 * template literal types, `keyof`/`typeof` gymnastics and anything else not worth a
 * class. `references` lets the import resolver still see the named types used inside
 * the text, so an opaque type does not silently break import management.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.typescript.OpaqueTypeReference#getText <em>Text</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.typescript.OpaqueTypeReference#getReferences <em>References</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.sdk.runtime.models.typescript.TypescriptPackage#getOpaqueTypeReference()
 * @model
 * @generated
 */
public interface OpaqueTypeReference extends TypeReference {
	/**
	 * Returns the value of the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' attribute.
	 * @see #setText(String)
	 * @see org.nasdanika.sdk.runtime.models.typescript.TypescriptPackage#getOpaqueTypeReference_Text()
	 * @model unique="false"
	 * @generated
	 */
	String getText();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.typescript.OpaqueTypeReference#getText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' attribute.
	 * @see #getText()
	 * @generated
	 */
	void setText(String value);

	/**
	 * Returns the value of the '<em><b>References</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.sdk.runtime.models.typescript.TypeReference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>References</em>' containment reference list.
	 * @see org.nasdanika.sdk.runtime.models.typescript.TypescriptPackage#getOpaqueTypeReference_References()
	 * @model containment="true"
	 * @generated
	 */
	EList<TypeReference> getReferences();

} // OpaqueTypeReference
