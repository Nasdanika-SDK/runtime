/**
 */
package org.nasdanika.sdk.runtime.models.jvm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Field</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.jvm.Field#isTransient <em>Transient</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.jvm.Field#isVolatile <em>Volatile</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.jvm.Field#isEnumConstant <em>Enum Constant</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.jvm.Field#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.sdk.runtime.models.jvm.JvmPackage#getField()
 * @model
 * @generated
 */
public interface Field extends Member {
	/**
	 * Returns the value of the '<em><b>Transient</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transient</em>' attribute.
	 * @see #setTransient(boolean)
	 * @see org.nasdanika.sdk.runtime.models.jvm.JvmPackage#getField_Transient()
	 * @model unique="false"
	 * @generated
	 */
	boolean isTransient();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.jvm.Field#isTransient <em>Transient</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transient</em>' attribute.
	 * @see #isTransient()
	 * @generated
	 */
	void setTransient(boolean value);

	/**
	 * Returns the value of the '<em><b>Volatile</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Volatile</em>' attribute.
	 * @see #setVolatile(boolean)
	 * @see org.nasdanika.sdk.runtime.models.jvm.JvmPackage#getField_Volatile()
	 * @model unique="false"
	 * @generated
	 */
	boolean isVolatile();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.jvm.Field#isVolatile <em>Volatile</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Volatile</em>' attribute.
	 * @see #isVolatile()
	 * @generated
	 */
	void setVolatile(boolean value);

	/**
	 * Returns the value of the '<em><b>Enum Constant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enum Constant</em>' attribute.
	 * @see #setEnumConstant(boolean)
	 * @see org.nasdanika.sdk.runtime.models.jvm.JvmPackage#getField_EnumConstant()
	 * @model unique="false"
	 * @generated
	 */
	boolean isEnumConstant();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.jvm.Field#isEnumConstant <em>Enum Constant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enum Constant</em>' attribute.
	 * @see #isEnumConstant()
	 * @generated
	 */
	void setEnumConstant(boolean value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(Type)
	 * @see org.nasdanika.sdk.runtime.models.jvm.JvmPackage#getField_Type()
	 * @model
	 * @generated
	 */
	Type getType();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.jvm.Field#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(Type value);

} // Field
