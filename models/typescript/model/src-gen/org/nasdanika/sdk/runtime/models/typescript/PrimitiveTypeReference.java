/**
 */
package org.nasdanika.sdk.runtime.models.typescript;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Primitive Type Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.typescript.PrimitiveTypeReference#getPrimitiveType <em>Primitive Type</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.sdk.runtime.models.typescript.TypescriptPackage#getPrimitiveTypeReference()
 * @model
 * @generated
 */
public interface PrimitiveTypeReference extends TypeReference {
	/**
	 * Returns the value of the '<em><b>Primitive Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.nasdanika.sdk.runtime.models.typescript.PrimitiveType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Primitive Type</em>' attribute.
	 * @see org.nasdanika.sdk.runtime.models.typescript.PrimitiveType
	 * @see #setPrimitiveType(PrimitiveType)
	 * @see org.nasdanika.sdk.runtime.models.typescript.TypescriptPackage#getPrimitiveTypeReference_PrimitiveType()
	 * @model unique="false"
	 * @generated
	 */
	PrimitiveType getPrimitiveType();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.typescript.PrimitiveTypeReference#getPrimitiveType <em>Primitive Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Primitive Type</em>' attribute.
	 * @see org.nasdanika.sdk.runtime.models.typescript.PrimitiveType
	 * @see #getPrimitiveType()
	 * @generated
	 */
	void setPrimitiveType(PrimitiveType value);

} // PrimitiveTypeReference
