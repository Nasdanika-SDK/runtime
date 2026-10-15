/**
 */
package org.nasdanika.sdk.runtime.models.meta;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Intersection Type Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * All of several. The counterpart of UnionTypeReference: TypeScript allows an
 * intersection in any type position, Java only as a type parameter bound - a T
 * that extends both Comparable of T and Serializable. Which is why TypeParameter
 * keeps a single `bound` rather than growing a list: a multiple bound is one of
 * these.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.meta.IntersectionTypeReference#getTypes <em>Types</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.sdk.runtime.models.meta.MetaPackage#getIntersectionTypeReference()
 * @model
 * @generated
 */
public interface IntersectionTypeReference extends TypeReference {
	/**
	 * Returns the value of the '<em><b>Types</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.sdk.runtime.models.meta.TypeReference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Types</em>' containment reference list.
	 * @see org.nasdanika.sdk.runtime.models.meta.MetaPackage#getIntersectionTypeReference_Types()
	 * @model containment="true"
	 * @generated
	 */
	EList<TypeReference> getTypes();

} // IntersectionTypeReference
