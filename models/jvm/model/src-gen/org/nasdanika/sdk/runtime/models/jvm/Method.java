/**
 */
package org.nasdanika.sdk.runtime.models.jvm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Method</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A method, a constructor, or a static initializer.
 * 
 * Constructors are not a separate class. In the JVM a constructor is a method
 * named <init> and a static initializer is <clinit>, the descriptor distinguishes
 * overloads, and the identity scheme works uniformly across all three. Reflection
 * separates Constructor from Method; bytecode does not, and this model follows
 * bytecode because that is where its identity comes from.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.jvm.Method#isAbstract <em>Abstract</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.jvm.Method#isSynchronized <em>Synchronized</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.jvm.Method#isNative <em>Native</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.jvm.Method#isBridge <em>Bridge</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.jvm.Method#isVarargs <em>Varargs</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.jvm.Method#isDefault <em>Default</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.jvm.Method#getReturnDescriptor <em>Return Descriptor</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.jvm.Method#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.jvm.Method#getReturnType <em>Return Type</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.jvm.Method#getThrownTypeNames <em>Thrown Type Names</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.jvm.Method#getThrownTypes <em>Thrown Types</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.sdk.runtime.models.jvm.JvmPackage#getMethod()
 * @model
 * @generated
 */
public interface Method extends Member {
	/**
	 * Returns the value of the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract</em>' attribute.
	 * @see #setAbstract(boolean)
	 * @see org.nasdanika.sdk.runtime.models.jvm.JvmPackage#getMethod_Abstract()
	 * @model unique="false"
	 * @generated
	 */
	boolean isAbstract();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.jvm.Method#isAbstract <em>Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Abstract</em>' attribute.
	 * @see #isAbstract()
	 * @generated
	 */
	void setAbstract(boolean value);

	/**
	 * Returns the value of the '<em><b>Synchronized</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Synchronized</em>' attribute.
	 * @see #setSynchronized(boolean)
	 * @see org.nasdanika.sdk.runtime.models.jvm.JvmPackage#getMethod_Synchronized()
	 * @model unique="false"
	 * @generated
	 */
	boolean isSynchronized();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.jvm.Method#isSynchronized <em>Synchronized</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Synchronized</em>' attribute.
	 * @see #isSynchronized()
	 * @generated
	 */
	void setSynchronized(boolean value);

	/**
	 * Returns the value of the '<em><b>Native</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Native</em>' attribute.
	 * @see #setNative(boolean)
	 * @see org.nasdanika.sdk.runtime.models.jvm.JvmPackage#getMethod_Native()
	 * @model unique="false"
	 * @generated
	 */
	boolean isNative();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.jvm.Method#isNative <em>Native</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Native</em>' attribute.
	 * @see #isNative()
	 * @generated
	 */
	void setNative(boolean value);

	/**
	 * Returns the value of the '<em><b>Bridge</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bridge</em>' attribute.
	 * @see #setBridge(boolean)
	 * @see org.nasdanika.sdk.runtime.models.jvm.JvmPackage#getMethod_Bridge()
	 * @model unique="false"
	 * @generated
	 */
	boolean isBridge();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.jvm.Method#isBridge <em>Bridge</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bridge</em>' attribute.
	 * @see #isBridge()
	 * @generated
	 */
	void setBridge(boolean value);

	/**
	 * Returns the value of the '<em><b>Varargs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Varargs</em>' attribute.
	 * @see #setVarargs(boolean)
	 * @see org.nasdanika.sdk.runtime.models.jvm.JvmPackage#getMethod_Varargs()
	 * @model unique="false"
	 * @generated
	 */
	boolean isVarargs();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.jvm.Method#isVarargs <em>Varargs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Varargs</em>' attribute.
	 * @see #isVarargs()
	 * @generated
	 */
	void setVarargs(boolean value);

	/**
	 * Returns the value of the '<em><b>Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  An interface method with a body.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Default</em>' attribute.
	 * @see #setDefault(boolean)
	 * @see org.nasdanika.sdk.runtime.models.jvm.JvmPackage#getMethod_Default()
	 * @model unique="false"
	 * @generated
	 */
	boolean isDefault();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.jvm.Method#isDefault <em>Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default</em>' attribute.
	 * @see #isDefault()
	 * @generated
	 */
	void setDefault(boolean value);

	/**
	 * Returns the value of the '<em><b>Return Descriptor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Ljava/lang/String;, V, I.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Return Descriptor</em>' attribute.
	 * @see #setReturnDescriptor(String)
	 * @see org.nasdanika.sdk.runtime.models.jvm.JvmPackage#getMethod_ReturnDescriptor()
	 * @model unique="false"
	 * @generated
	 */
	String getReturnDescriptor();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.jvm.Method#getReturnDescriptor <em>Return Descriptor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return Descriptor</em>' attribute.
	 * @see #getReturnDescriptor()
	 * @generated
	 */
	void setReturnDescriptor(String value);

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.sdk.runtime.models.jvm.Parameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see org.nasdanika.sdk.runtime.models.jvm.JvmPackage#getMethod_Parameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<Parameter> getParameters();

	/**
	 * Returns the value of the '<em><b>Return Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return Type</em>' reference.
	 * @see #setReturnType(Type)
	 * @see org.nasdanika.sdk.runtime.models.jvm.JvmPackage#getMethod_ReturnType()
	 * @model
	 * @generated
	 */
	Type getReturnType();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.jvm.Method#getReturnType <em>Return Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return Type</em>' reference.
	 * @see #getReturnType()
	 * @generated
	 */
	void setReturnType(Type value);

	/**
	 * Returns the value of the '<em><b>Thrown Type Names</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Binary names of declared checked exceptions.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Thrown Type Names</em>' attribute list.
	 * @see org.nasdanika.sdk.runtime.models.jvm.JvmPackage#getMethod_ThrownTypeNames()
	 * @model unique="false"
	 * @generated
	 */
	EList<String> getThrownTypeNames();

	/**
	 * Returns the value of the '<em><b>Thrown Types</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.sdk.runtime.models.jvm.Type}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Thrown Types</em>' reference list.
	 * @see org.nasdanika.sdk.runtime.models.jvm.JvmPackage#getMethod_ThrownTypes()
	 * @model
	 * @generated
	 */
	EList<Type> getThrownTypes();

} // Method
