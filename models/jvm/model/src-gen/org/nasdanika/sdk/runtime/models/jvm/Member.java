/**
 */
package org.nasdanika.sdk.runtime.models.jvm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Member</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 *  ===========================================================================
 * MEMBERS
 * ===========================================================================
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.jvm.Member#getAccess <em>Access</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.jvm.Member#isStatic <em>Static</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.jvm.Member#isFinal <em>Final</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.jvm.Member#isSynthetic <em>Synthetic</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.jvm.Member#getDescriptor <em>Descriptor</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.jvm.Member#getSignature <em>Signature</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.sdk.runtime.models.jvm.JvmPackage#getMember()
 * @model abstract="true"
 * @generated
 */
public interface Member extends JvmElement {
	/**
	 * Returns the value of the '<em><b>Access</b></em>' attribute.
	 * The literals are from the enumeration {@link org.nasdanika.sdk.runtime.models.jvm.AccessLevel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Access</em>' attribute.
	 * @see org.nasdanika.sdk.runtime.models.jvm.AccessLevel
	 * @see #setAccess(AccessLevel)
	 * @see org.nasdanika.sdk.runtime.models.jvm.JvmPackage#getMember_Access()
	 * @model unique="false"
	 * @generated
	 */
	AccessLevel getAccess();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.jvm.Member#getAccess <em>Access</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Access</em>' attribute.
	 * @see org.nasdanika.sdk.runtime.models.jvm.AccessLevel
	 * @see #getAccess()
	 * @generated
	 */
	void setAccess(AccessLevel value);

	/**
	 * Returns the value of the '<em><b>Static</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Static</em>' attribute.
	 * @see #setStatic(boolean)
	 * @see org.nasdanika.sdk.runtime.models.jvm.JvmPackage#getMember_Static()
	 * @model unique="false"
	 * @generated
	 */
	boolean isStatic();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.jvm.Member#isStatic <em>Static</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Static</em>' attribute.
	 * @see #isStatic()
	 * @generated
	 */
	void setStatic(boolean value);

	/**
	 * Returns the value of the '<em><b>Final</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Final</em>' attribute.
	 * @see #setFinal(boolean)
	 * @see org.nasdanika.sdk.runtime.models.jvm.JvmPackage#getMember_Final()
	 * @model unique="false"
	 * @generated
	 */
	boolean isFinal();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.jvm.Member#isFinal <em>Final</em>}' attribute.
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
	 * @see org.nasdanika.sdk.runtime.models.jvm.JvmPackage#getMember_Synthetic()
	 * @model unique="false"
	 * @generated
	 */
	boolean isSynthetic();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.jvm.Member#isSynthetic <em>Synthetic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Synthetic</em>' attribute.
	 * @see #isSynthetic()
	 * @generated
	 */
	void setSynthetic(boolean value);

	/**
	 * Returns the value of the '<em><b>Descriptor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  The JVM descriptor: a field's type, or a method's parameters and return.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Descriptor</em>' attribute.
	 * @see #setDescriptor(String)
	 * @see org.nasdanika.sdk.runtime.models.jvm.JvmPackage#getMember_Descriptor()
	 * @model unique="false"
	 * @generated
	 */
	String getDescriptor();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.jvm.Member#getDescriptor <em>Descriptor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Descriptor</em>' attribute.
	 * @see #getDescriptor()
	 * @generated
	 */
	void setDescriptor(String value);

	/**
	 * Returns the value of the '<em><b>Signature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The class file Signature attribute: a field's generic type, e.g.
	 * Ljava/util/List<Ljava/lang/String;>; or a method's type parameters,
	 * parameters, return and throws, e.g. <T:Ljava/lang/Object;>(TT;)Ljava/util/Optional<TT;>;
	 * Unset when the descriptor already says everything.
	 * 
	 * DATA, NOT IDENTITY. Overloads are told apart by erasure, so two members of
	 * one type never differ only in signature, and identity stays with the
	 * descriptor. This is what lets a projection to Meta keep generics - telling
	 * Supplier<Volume> from Supplier<Writable> - and what separates a source
	 * incompatible change, which alters only the signature, from a binary
	 * incompatible one, which alters the descriptor.
	 * 
	 * The JVM's own form rather than Java source text, for the same reason
	 * identity uses descriptors: it is what bytecode carries, so a static scan
	 * copies it verbatim and a live loader writes the same string from
	 * java.lang.reflect.Type. Parameters have none of their own; theirs are
	 * positions in the method's.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Signature</em>' attribute.
	 * @see #setSignature(String)
	 * @see org.nasdanika.sdk.runtime.models.jvm.JvmPackage#getMember_Signature()
	 * @model unique="false"
	 * @generated
	 */
	String getSignature();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.jvm.Member#getSignature <em>Signature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signature</em>' attribute.
	 * @see #getSignature()
	 * @generated
	 */
	void setSignature(String value);

} // Member
