/**
 */
package org.nasdanika.sdk.runtime.models.meta;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.meta.Attribute#isIdentifying <em>Identifying</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.sdk.runtime.models.meta.MetaPackage#getAttribute()
 * @model
 * @generated
 */
public interface Attribute extends Feature {
	/**
	 * Returns the value of the '<em><b>Identifying</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This attribute identifies its instance, and a reference may cite it.
	 * Not named `id`: nxcore's StringIdentity already contributes one.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identifying</em>' attribute.
	 * @see #setIdentifying(boolean)
	 * @see org.nasdanika.sdk.runtime.models.meta.MetaPackage#getAttribute_Identifying()
	 * @model unique="false"
	 * @generated
	 */
	boolean isIdentifying();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.meta.Attribute#isIdentifying <em>Identifying</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identifying</em>' attribute.
	 * @see #isIdentifying()
	 * @generated
	 */
	void setIdentifying(boolean value);

} // Attribute
