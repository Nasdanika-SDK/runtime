/**
 */
package org.nasdanika.sdk.runtime.models.jvm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Requires</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.jvm.Requires#getModifiers <em>Modifiers</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.jvm.Requires#getCompiledVersion <em>Compiled Version</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.jvm.Requires#getModule <em>Module</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.sdk.runtime.models.jvm.JvmPackage#getRequires()
 * @model
 * @generated
 */
public interface Requires extends JvmElement {
	/**
	 * Returns the value of the '<em><b>Modifiers</b></em>' attribute list.
	 * The list contents are of type {@link org.nasdanika.sdk.runtime.models.jvm.RequiresModifier}.
	 * The literals are from the enumeration {@link org.nasdanika.sdk.runtime.models.jvm.RequiresModifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modifiers</em>' attribute list.
	 * @see org.nasdanika.sdk.runtime.models.jvm.RequiresModifier
	 * @see org.nasdanika.sdk.runtime.models.jvm.JvmPackage#getRequires_Modifiers()
	 * @model unique="false"
	 * @generated
	 */
	EList<RequiresModifier> getModifiers();

	/**
	 * Returns the value of the '<em><b>Compiled Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Version recorded at compile time, when present.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Compiled Version</em>' attribute.
	 * @see #setCompiledVersion(String)
	 * @see org.nasdanika.sdk.runtime.models.jvm.JvmPackage#getRequires_CompiledVersion()
	 * @model unique="false"
	 * @generated
	 */
	String getCompiledVersion();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.jvm.Requires#getCompiledVersion <em>Compiled Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Compiled Version</em>' attribute.
	 * @see #getCompiledVersion()
	 * @generated
	 */
	void setCompiledVersion(String value);

	/**
	 * Returns the value of the '<em><b>Module</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Resolved when the required module is in the model; name is authoritative.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Module</em>' reference.
	 * @see #setModule(org.nasdanika.sdk.runtime.models.jvm.Module)
	 * @see org.nasdanika.sdk.runtime.models.jvm.JvmPackage#getRequires_Module()
	 * @model
	 * @generated
	 */
	org.nasdanika.sdk.runtime.models.jvm.Module getModule();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.jvm.Requires#getModule <em>Module</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Module</em>' reference.
	 * @see #getModule()
	 * @generated
	 */
	void setModule(org.nasdanika.sdk.runtime.models.jvm.Module value);

} // Requires
