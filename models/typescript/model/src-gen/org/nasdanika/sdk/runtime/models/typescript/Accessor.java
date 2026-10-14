/**
 */
package org.nasdanika.sdk.runtime.models.typescript;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Accessor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.typescript.Accessor#getAccessorKind <em>Accessor Kind</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.sdk.runtime.models.typescript.TypescriptPackage#getAccessor()
 * @model
 * @generated
 */
public interface Accessor extends Member, Callable {
	/**
	 * Returns the value of the '<em><b>Accessor Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link org.nasdanika.sdk.runtime.models.typescript.AccessorKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Accessor Kind</em>' attribute.
	 * @see org.nasdanika.sdk.runtime.models.typescript.AccessorKind
	 * @see #setAccessorKind(AccessorKind)
	 * @see org.nasdanika.sdk.runtime.models.typescript.TypescriptPackage#getAccessor_AccessorKind()
	 * @model unique="false"
	 * @generated
	 */
	AccessorKind getAccessorKind();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.typescript.Accessor#getAccessorKind <em>Accessor Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Accessor Kind</em>' attribute.
	 * @see org.nasdanika.sdk.runtime.models.typescript.AccessorKind
	 * @see #getAccessorKind()
	 * @generated
	 */
	void setAccessorKind(AccessorKind value);

} // Accessor
