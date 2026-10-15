/**
 */
package org.nasdanika.sdk.runtime.models.meta;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Wildcard Type Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * ? extends T, ? super T or a bare ?, and valid only as a type argument.
 * 
 * Use-site variance, which Java has and TypeScript does not. It is here rather
 * than in the java sub-model because it stands in a type position, and every
 * projection must handle every TypeReference, so a language-specific subclass
 * would break the emitters that do not know it. The rule for a projection without
 * wildcards: emit the bound that is set - the upper for ? extends T, the lower
 * for ? super T, which structural typing makes sound for the usual
 * producer-extends, consumer-super use - and the widest type it has for a bare ?
 * (unknown in TypeScript).
 * 
 * At most one bound is set. Neither set is a bare ?.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.meta.WildcardTypeReference#getUpperBound <em>Upper Bound</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.meta.WildcardTypeReference#getLowerBound <em>Lower Bound</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.sdk.runtime.models.meta.MetaPackage#getWildcardTypeReference()
 * @model
 * @generated
 */
public interface WildcardTypeReference extends TypeReference {
	/**
	 * Returns the value of the '<em><b>Upper Bound</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Upper Bound</em>' containment reference.
	 * @see #setUpperBound(TypeReference)
	 * @see org.nasdanika.sdk.runtime.models.meta.MetaPackage#getWildcardTypeReference_UpperBound()
	 * @model containment="true"
	 * @generated
	 */
	TypeReference getUpperBound();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.meta.WildcardTypeReference#getUpperBound <em>Upper Bound</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Upper Bound</em>' containment reference.
	 * @see #getUpperBound()
	 * @generated
	 */
	void setUpperBound(TypeReference value);

	/**
	 * Returns the value of the '<em><b>Lower Bound</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lower Bound</em>' containment reference.
	 * @see #setLowerBound(TypeReference)
	 * @see org.nasdanika.sdk.runtime.models.meta.MetaPackage#getWildcardTypeReference_LowerBound()
	 * @model containment="true"
	 * @generated
	 */
	TypeReference getLowerBound();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.meta.WildcardTypeReference#getLowerBound <em>Lower Bound</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lower Bound</em>' containment reference.
	 * @see #getLowerBound()
	 * @generated
	 */
	void setLowerBound(TypeReference value);

} // WildcardTypeReference
