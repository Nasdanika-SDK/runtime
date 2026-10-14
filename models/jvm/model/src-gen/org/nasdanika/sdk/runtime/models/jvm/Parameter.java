/**
 */
package org.nasdanika.sdk.runtime.models.jvm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A parameter. `name` is present only when the class was compiled with -parameters
 * or the information is otherwise available, so position is the reliable identity
 * and the name is a convenience.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.jvm.Parameter#getIndex <em>Index</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.jvm.Parameter#getDescriptor <em>Descriptor</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.jvm.Parameter#isFinal <em>Final</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.jvm.Parameter#isSynthetic <em>Synthetic</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.jvm.Parameter#isMandated <em>Mandated</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.jvm.Parameter#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.sdk.runtime.models.jvm.JvmPackage#getParameter()
 * @model
 * @generated
 */
public interface Parameter extends JvmElement {
	/**
	 * Returns the value of the '<em><b>Index</b></em>' attribute.
	 * The default value is <code>"-1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Index</em>' attribute.
	 * @see #setIndex(int)
	 * @see org.nasdanika.sdk.runtime.models.jvm.JvmPackage#getParameter_Index()
	 * @model default="-1" unique="false"
	 * @generated
	 */
	int getIndex();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.jvm.Parameter#getIndex <em>Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Index</em>' attribute.
	 * @see #getIndex()
	 * @generated
	 */
	void setIndex(int value);

	/**
	 * Returns the value of the '<em><b>Descriptor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Descriptor</em>' attribute.
	 * @see #setDescriptor(String)
	 * @see org.nasdanika.sdk.runtime.models.jvm.JvmPackage#getParameter_Descriptor()
	 * @model unique="false"
	 * @generated
	 */
	String getDescriptor();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.jvm.Parameter#getDescriptor <em>Descriptor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Descriptor</em>' attribute.
	 * @see #getDescriptor()
	 * @generated
	 */
	void setDescriptor(String value);

	/**
	 * Returns the value of the '<em><b>Final</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Final</em>' attribute.
	 * @see #setFinal(boolean)
	 * @see org.nasdanika.sdk.runtime.models.jvm.JvmPackage#getParameter_Final()
	 * @model unique="false"
	 * @generated
	 */
	boolean isFinal();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.jvm.Parameter#isFinal <em>Final</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Final</em>' attribute.
	 * @see #isFinal()
	 * @generated
	 */
	void setFinal(boolean value);

	/**
	 * Returns the value of the '<em><b>Synthetic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Synthetic</em>' attribute.
	 * @see #setSynthetic(boolean)
	 * @see org.nasdanika.sdk.runtime.models.jvm.JvmPackage#getParameter_Synthetic()
	 * @model unique="false"
	 * @generated
	 */
	boolean isSynthetic();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.jvm.Parameter#isSynthetic <em>Synthetic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Synthetic</em>' attribute.
	 * @see #isSynthetic()
	 * @generated
	 */
	void setSynthetic(boolean value);

	/**
	 * Returns the value of the '<em><b>Mandated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  A parameter the compiler generated, such as an enum constructor's.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Mandated</em>' attribute.
	 * @see #setMandated(boolean)
	 * @see org.nasdanika.sdk.runtime.models.jvm.JvmPackage#getParameter_Mandated()
	 * @model unique="false"
	 * @generated
	 */
	boolean isMandated();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.jvm.Parameter#isMandated <em>Mandated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mandated</em>' attribute.
	 * @see #isMandated()
	 * @generated
	 */
	void setMandated(boolean value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(Type)
	 * @see org.nasdanika.sdk.runtime.models.jvm.JvmPackage#getParameter_Type()
	 * @model
	 * @generated
	 */
	Type getType();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.jvm.Parameter#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(Type value);

} // Parameter
