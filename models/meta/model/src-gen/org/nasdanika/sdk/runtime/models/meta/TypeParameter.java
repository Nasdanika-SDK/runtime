/**
 */
package org.nasdanika.sdk.runtime.models.meta;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 *  ---------------------------------------------------------------------------
 * Types
 * ---------------------------------------------------------------------------
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.meta.TypeParameter#getBound <em>Bound</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.meta.TypeParameter#getDefault <em>Default</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.sdk.runtime.models.meta.MetaPackage#getTypeParameter()
 * @model
 * @generated
 */
public interface TypeParameter extends ModelElement {
	/**
	 * Returns the value of the '<em><b>Bound</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  The `extends` constraint.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bound</em>' containment reference.
	 * @see #setBound(TypeReference)
	 * @see org.nasdanika.sdk.runtime.models.meta.MetaPackage#getTypeParameter_Bound()
	 * @model containment="true"
	 * @generated
	 */
	TypeReference getBound();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.meta.TypeParameter#getBound <em>Bound</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bound</em>' containment reference.
	 * @see #getBound()
	 * @generated
	 */
	void setBound(TypeReference value);

	/**
	 * Returns the value of the '<em><b>Default</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default</em>' containment reference.
	 * @see #setDefault(TypeReference)
	 * @see org.nasdanika.sdk.runtime.models.meta.MetaPackage#getTypeParameter_Default()
	 * @model containment="true"
	 * @generated
	 */
	TypeReference getDefault();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.meta.TypeParameter#getDefault <em>Default</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default</em>' containment reference.
	 * @see #getDefault()
	 * @generated
	 */
	void setDefault(TypeReference value);

} // TypeParameter
