/**
 */
package org.nasdanika.sdk.runtime.models.jvm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A type: class, interface, enum, record, annotation, primitive or array.
 * 
 * One class rather than a hierarchy, mirroring reflection, where isPrimitive and
 * isArray are queries on Class rather than distinct types. That keeps the identity
 * scheme uniform, since `int` and `int[]` have binary names like everything else,
 * and it keeps the model small.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.jvm.Type#getKind <em>Kind</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.jvm.Type#getAccess <em>Access</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.jvm.Type#getBinaryName <em>Binary Name</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.jvm.Type#getDescriptor <em>Descriptor</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.jvm.Type#getSignature <em>Signature</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.jvm.Type#isAbstract <em>Abstract</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.jvm.Type#isFinal <em>Final</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.jvm.Type#isSynthetic <em>Synthetic</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.jvm.Type#isSealed <em>Sealed</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.jvm.Type#getClassFileVersion <em>Class File Version</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.jvm.Type#getMethods <em>Methods</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.jvm.Type#getFields <em>Fields</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.jvm.Type#getSuperType <em>Super Type</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.jvm.Type#getInterfaces <em>Interfaces</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.jvm.Type#getComponentType <em>Component Type</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.jvm.Type#getModule <em>Module</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.sdk.runtime.models.jvm.JvmPackage#getType()
 * @model
 * @generated
 */
public interface Type extends JvmElement {
	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link org.nasdanika.sdk.runtime.models.jvm.TypeKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see org.nasdanika.sdk.runtime.models.jvm.TypeKind
	 * @see #setKind(TypeKind)
	 * @see org.nasdanika.sdk.runtime.models.jvm.JvmPackage#getType_Kind()
	 * @model unique="false"
	 * @generated
	 */
	TypeKind getKind();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.jvm.Type#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see org.nasdanika.sdk.runtime.models.jvm.TypeKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(TypeKind value);

	/**
	 * Returns the value of the '<em><b>Access</b></em>' attribute.
	 * The literals are from the enumeration {@link org.nasdanika.sdk.runtime.models.jvm.AccessLevel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Access</em>' attribute.
	 * @see org.nasdanika.sdk.runtime.models.jvm.AccessLevel
	 * @see #setAccess(AccessLevel)
	 * @see org.nasdanika.sdk.runtime.models.jvm.JvmPackage#getType_Access()
	 * @model unique="false"
	 * @generated
	 */
	AccessLevel getAccess();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.jvm.Type#getAccess <em>Access</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Access</em>' attribute.
	 * @see org.nasdanika.sdk.runtime.models.jvm.AccessLevel
	 * @see #getAccess()
	 * @generated
	 */
	void setAccess(AccessLevel value);

	/**
	 * Returns the value of the '<em><b>Binary Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  com.foo.Bar, com.foo.Bar$Inner, [I. The identity-bearing name.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Binary Name</em>' attribute.
	 * @see #setBinaryName(String)
	 * @see org.nasdanika.sdk.runtime.models.jvm.JvmPackage#getType_BinaryName()
	 * @model unique="false"
	 * @generated
	 */
	String getBinaryName();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.jvm.Type#getBinaryName <em>Binary Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Binary Name</em>' attribute.
	 * @see #getBinaryName()
	 * @generated
	 */
	void setBinaryName(String value);

	/**
	 * Returns the value of the '<em><b>Descriptor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Ljava/lang/String;, I, [I.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Descriptor</em>' attribute.
	 * @see #setDescriptor(String)
	 * @see org.nasdanika.sdk.runtime.models.jvm.JvmPackage#getType_Descriptor()
	 * @model unique="false"
	 * @generated
	 */
	String getDescriptor();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.jvm.Type#getDescriptor <em>Descriptor</em>}' attribute.
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
	 * The class file Signature attribute: type parameters, generic superclass and
	 * interfaces, e.g. <T:Ljava/lang/Object;>Ljava/lang/Object;Ljava/util/function/Supplier<TT;>;
	 * Unset when the type declares nothing generic, which is when the class file
	 * has no such attribute either. See Member.signature.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Signature</em>' attribute.
	 * @see #setSignature(String)
	 * @see org.nasdanika.sdk.runtime.models.jvm.JvmPackage#getType_Signature()
	 * @model unique="false"
	 * @generated
	 */
	String getSignature();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.jvm.Type#getSignature <em>Signature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signature</em>' attribute.
	 * @see #getSignature()
	 * @generated
	 */
	void setSignature(String value);

	/**
	 * Returns the value of the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract</em>' attribute.
	 * @see #setAbstract(boolean)
	 * @see org.nasdanika.sdk.runtime.models.jvm.JvmPackage#getType_Abstract()
	 * @model unique="false"
	 * @generated
	 */
	boolean isAbstract();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.jvm.Type#isAbstract <em>Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Abstract</em>' attribute.
	 * @see #isAbstract()
	 * @generated
	 */
	void setAbstract(boolean value);

	/**
	 * Returns the value of the '<em><b>Final</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Final</em>' attribute.
	 * @see #setFinal(boolean)
	 * @see org.nasdanika.sdk.runtime.models.jvm.JvmPackage#getType_Final()
	 * @model unique="false"
	 * @generated
	 */
	boolean isFinal();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.jvm.Type#isFinal <em>Final</em>}' attribute.
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
	 * @see org.nasdanika.sdk.runtime.models.jvm.JvmPackage#getType_Synthetic()
	 * @model unique="false"
	 * @generated
	 */
	boolean isSynthetic();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.jvm.Type#isSynthetic <em>Synthetic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Synthetic</em>' attribute.
	 * @see #isSynthetic()
	 * @generated
	 */
	void setSynthetic(boolean value);

	/**
	 * Returns the value of the '<em><b>Sealed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sealed</em>' attribute.
	 * @see #setSealed(boolean)
	 * @see org.nasdanika.sdk.runtime.models.jvm.JvmPackage#getType_Sealed()
	 * @model unique="false"
	 * @generated
	 */
	boolean isSealed();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.jvm.Type#isSealed <em>Sealed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sealed</em>' attribute.
	 * @see #isSealed()
	 * @generated
	 */
	void setSealed(boolean value);

	/**
	 * Returns the value of the '<em><b>Class File Version</b></em>' attribute.
	 * The default value is <code>"-1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The class file major version, e.g. 61 for Java 17. Two bytes of the header,
	 * never aggregated by anything, and the basis of an estate report nobody has.
	 * -1 when unknown, which includes primitives and arrays.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Class File Version</em>' attribute.
	 * @see #setClassFileVersion(int)
	 * @see org.nasdanika.sdk.runtime.models.jvm.JvmPackage#getType_ClassFileVersion()
	 * @model default="-1" unique="false"
	 * @generated
	 */
	int getClassFileVersion();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.jvm.Type#getClassFileVersion <em>Class File Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class File Version</em>' attribute.
	 * @see #getClassFileVersion()
	 * @generated
	 */
	void setClassFileVersion(int value);

	/**
	 * Returns the value of the '<em><b>Methods</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.sdk.runtime.models.jvm.Method}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Methods</em>' containment reference list.
	 * @see org.nasdanika.sdk.runtime.models.jvm.JvmPackage#getType_Methods()
	 * @model containment="true"
	 * @generated
	 */
	EList<Method> getMethods();

	/**
	 * Returns the value of the '<em><b>Fields</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.sdk.runtime.models.jvm.Field}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fields</em>' containment reference list.
	 * @see org.nasdanika.sdk.runtime.models.jvm.JvmPackage#getType_Fields()
	 * @model containment="true"
	 * @generated
	 */
	EList<Field> getFields();

	/**
	 * Returns the value of the '<em><b>Super Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Super Type</em>' reference.
	 * @see #setSuperType(Type)
	 * @see org.nasdanika.sdk.runtime.models.jvm.JvmPackage#getType_SuperType()
	 * @model
	 * @generated
	 */
	Type getSuperType();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.jvm.Type#getSuperType <em>Super Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Super Type</em>' reference.
	 * @see #getSuperType()
	 * @generated
	 */
	void setSuperType(Type value);

	/**
	 * Returns the value of the '<em><b>Interfaces</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.sdk.runtime.models.jvm.Type}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interfaces</em>' reference list.
	 * @see org.nasdanika.sdk.runtime.models.jvm.JvmPackage#getType_Interfaces()
	 * @model
	 * @generated
	 */
	EList<Type> getInterfaces();

	/**
	 * Returns the value of the '<em><b>Component Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  For arrays; null otherwise.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Component Type</em>' reference.
	 * @see #setComponentType(Type)
	 * @see org.nasdanika.sdk.runtime.models.jvm.JvmPackage#getType_ComponentType()
	 * @model
	 * @generated
	 */
	Type getComponentType();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.jvm.Type#getComponentType <em>Component Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component Type</em>' reference.
	 * @see #getComponentType()
	 * @generated
	 */
	void setComponentType(Type value);

	/**
	 * Returns the value of the '<em><b>Module</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Convenience back-reference; the containing package is the container.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Module</em>' reference.
	 * @see #setModule(org.nasdanika.sdk.runtime.models.jvm.Module)
	 * @see org.nasdanika.sdk.runtime.models.jvm.JvmPackage#getType_Module()
	 * @model
	 * @generated
	 */
	org.nasdanika.sdk.runtime.models.jvm.Module getModule();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.jvm.Type#getModule <em>Module</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Module</em>' reference.
	 * @see #getModule()
	 * @generated
	 */
	void setModule(org.nasdanika.sdk.runtime.models.jvm.Module value);

} // Type
