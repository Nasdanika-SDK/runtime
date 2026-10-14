/**
 */
package org.nasdanika.sdk.runtime.models.typescript;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Array Type Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.typescript.ArrayTypeReference#getElementType <em>Element Type</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.sdk.runtime.models.typescript.TypescriptPackage#getArrayTypeReference()
 * @model
 * @generated
 */
public interface ArrayTypeReference extends TypeReference {
	/**
	 * Returns the value of the '<em><b>Element Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element Type</em>' containment reference.
	 * @see #setElementType(TypeReference)
	 * @see org.nasdanika.sdk.runtime.models.typescript.TypescriptPackage#getArrayTypeReference_ElementType()
	 * @model containment="true"
	 * @generated
	 */
	TypeReference getElementType();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.typescript.ArrayTypeReference#getElementType <em>Element Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element Type</em>' containment reference.
	 * @see #getElementType()
	 * @generated
	 */
	void setElementType(TypeReference value);

} // ArrayTypeReference
