/**
 */
package org.nasdanika.sdk.runtime.models.jvm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Exports</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * exports a.b, or exports a.b to c.d - a qualified export, visible only to the
 * named targets. An empty targets list means unqualified.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.jvm.Exports#getModifiers <em>Modifiers</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.jvm.Exports#getTargetNames <em>Target Names</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.jvm.Exports#getPackage <em>Package</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.jvm.Exports#getTargets <em>Targets</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.sdk.runtime.models.jvm.JvmPackage#getExports()
 * @model
 * @generated
 */
public interface Exports extends JvmElement {
	/**
	 * Returns the value of the '<em><b>Modifiers</b></em>' attribute list.
	 * The list contents are of type {@link org.nasdanika.sdk.runtime.models.jvm.DirectiveModifier}.
	 * The literals are from the enumeration {@link org.nasdanika.sdk.runtime.models.jvm.DirectiveModifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modifiers</em>' attribute list.
	 * @see org.nasdanika.sdk.runtime.models.jvm.DirectiveModifier
	 * @see org.nasdanika.sdk.runtime.models.jvm.JvmPackage#getExports_Modifiers()
	 * @model unique="false"
	 * @generated
	 */
	EList<DirectiveModifier> getModifiers();

	/**
	 * Returns the value of the '<em><b>Target Names</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Binary names of target modules; empty means exported to everyone.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Target Names</em>' attribute list.
	 * @see org.nasdanika.sdk.runtime.models.jvm.JvmPackage#getExports_TargetNames()
	 * @model unique="false"
	 * @generated
	 */
	EList<String> getTargetNames();

	/**
	 * Returns the value of the '<em><b>Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Package</em>' reference.
	 * @see #setPackage(org.nasdanika.sdk.runtime.models.jvm.Package)
	 * @see org.nasdanika.sdk.runtime.models.jvm.JvmPackage#getExports_Package()
	 * @model
	 * @generated
	 */
	org.nasdanika.sdk.runtime.models.jvm.Package getPackage();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.jvm.Exports#getPackage <em>Package</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Package</em>' reference.
	 * @see #getPackage()
	 * @generated
	 */
	void setPackage(org.nasdanika.sdk.runtime.models.jvm.Package value);

	/**
	 * Returns the value of the '<em><b>Targets</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.sdk.runtime.models.jvm.Module}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Targets</em>' reference list.
	 * @see org.nasdanika.sdk.runtime.models.jvm.JvmPackage#getExports_Targets()
	 * @model
	 * @generated
	 */
	EList<org.nasdanika.sdk.runtime.models.jvm.Module> getTargets();

} // Exports
