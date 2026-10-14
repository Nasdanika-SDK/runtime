/**
 */
package org.nasdanika.sdk.runtime.models.meta;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Primitive Type Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.meta.PrimitiveTypeReference#getKind <em>Kind</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.sdk.runtime.models.meta.MetaPackage#getPrimitiveTypeReference()
 * @model
 * @generated
 */
public interface PrimitiveTypeReference extends TypeReference {
	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link org.nasdanika.sdk.runtime.models.meta.PrimitiveKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see org.nasdanika.sdk.runtime.models.meta.PrimitiveKind
	 * @see #setKind(PrimitiveKind)
	 * @see org.nasdanika.sdk.runtime.models.meta.MetaPackage#getPrimitiveTypeReference_Kind()
	 * @model unique="false"
	 * @generated
	 */
	PrimitiveKind getKind();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.meta.PrimitiveTypeReference#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see org.nasdanika.sdk.runtime.models.meta.PrimitiveKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(PrimitiveKind value);

} // PrimitiveTypeReference
