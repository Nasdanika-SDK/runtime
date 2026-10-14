/**
 */
package org.nasdanika.sdk.runtime.models.typescript;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Literal Type Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.typescript.LiteralTypeReference#getLiteralKind <em>Literal Kind</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.typescript.LiteralTypeReference#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.sdk.runtime.models.typescript.TypescriptPackage#getLiteralTypeReference()
 * @model
 * @generated
 */
public interface LiteralTypeReference extends TypeReference {
	/**
	 * Returns the value of the '<em><b>Literal Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link org.nasdanika.sdk.runtime.models.typescript.LiteralKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Literal Kind</em>' attribute.
	 * @see org.nasdanika.sdk.runtime.models.typescript.LiteralKind
	 * @see #setLiteralKind(LiteralKind)
	 * @see org.nasdanika.sdk.runtime.models.typescript.TypescriptPackage#getLiteralTypeReference_LiteralKind()
	 * @model unique="false"
	 * @generated
	 */
	LiteralKind getLiteralKind();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.typescript.LiteralTypeReference#getLiteralKind <em>Literal Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Literal Kind</em>' attribute.
	 * @see org.nasdanika.sdk.runtime.models.typescript.LiteralKind
	 * @see #getLiteralKind()
	 * @generated
	 */
	void setLiteralKind(LiteralKind value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see org.nasdanika.sdk.runtime.models.typescript.TypescriptPackage#getLiteralTypeReference_Value()
	 * @model unique="false"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.typescript.LiteralTypeReference#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

} // LiteralTypeReference
