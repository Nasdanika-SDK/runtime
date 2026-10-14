/**
 */
package org.nasdanika.sdk.runtime.models.meta;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Parameter Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.meta.TypeParameterReference#getTarget <em>Target</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.meta.TypeParameterReference#getParameterName <em>Parameter Name</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.sdk.runtime.models.meta.MetaPackage#getTypeParameterReference()
 * @model
 * @generated
 */
public interface TypeParameterReference extends TypeReference {
	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(TypeParameter)
	 * @see org.nasdanika.sdk.runtime.models.meta.MetaPackage#getTypeParameterReference_Target()
	 * @model
	 * @generated
	 */
	TypeParameter getTarget();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.meta.TypeParameterReference#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(TypeParameter value);

	/**
	 * Returns the value of the '<em><b>Parameter Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Name, for when the parameter is declared outside the loaded fragment.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parameter Name</em>' attribute.
	 * @see #setParameterName(String)
	 * @see org.nasdanika.sdk.runtime.models.meta.MetaPackage#getTypeParameterReference_ParameterName()
	 * @model unique="false"
	 * @generated
	 */
	String getParameterName();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.meta.TypeParameterReference#getParameterName <em>Parameter Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameter Name</em>' attribute.
	 * @see #getParameterName()
	 * @generated
	 */
	void setParameterName(String value);

} // TypeParameterReference
