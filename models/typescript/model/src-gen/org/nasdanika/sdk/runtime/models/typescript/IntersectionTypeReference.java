/**
 */
package org.nasdanika.sdk.runtime.models.typescript;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Intersection Type Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.typescript.IntersectionTypeReference#getTypes <em>Types</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.sdk.runtime.models.typescript.TypescriptPackage#getIntersectionTypeReference()
 * @model
 * @generated
 */
public interface IntersectionTypeReference extends TypeReference {
	/**
	 * Returns the value of the '<em><b>Types</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.sdk.runtime.models.typescript.TypeReference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Types</em>' containment reference list.
	 * @see org.nasdanika.sdk.runtime.models.typescript.TypescriptPackage#getIntersectionTypeReference_Types()
	 * @model containment="true"
	 * @generated
	 */
	EList<TypeReference> getTypes();

} // IntersectionTypeReference
