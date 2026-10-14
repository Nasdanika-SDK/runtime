/**
 */
package org.nasdanika.sdk.runtime.models.jvm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Opens</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * opens a.b, differing from exports in permitting deep reflective access rather
 * than compile-time access. The distinction is the whole point of the directive
 * and is worth keeping as a separate class rather than a flag.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.jvm.Opens#getModifiers <em>Modifiers</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.jvm.Opens#getTargetNames <em>Target Names</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.jvm.Opens#getPackage <em>Package</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.jvm.Opens#getTargets <em>Targets</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.sdk.runtime.models.jvm.JvmPackage#getOpens()
 * @model
 * @generated
 */
public interface Opens extends JvmElement {
	/**
	 * Returns the value of the '<em><b>Modifiers</b></em>' attribute list.
	 * The list contents are of type {@link org.nasdanika.sdk.runtime.models.jvm.DirectiveModifier}.
	 * The literals are from the enumeration {@link org.nasdanika.sdk.runtime.models.jvm.DirectiveModifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modifiers</em>' attribute list.
	 * @see org.nasdanika.sdk.runtime.models.jvm.DirectiveModifier
	 * @see org.nasdanika.sdk.runtime.models.jvm.JvmPackage#getOpens_Modifiers()
	 * @model unique="false"
	 * @generated
	 */
	EList<DirectiveModifier> getModifiers();

	/**
	 * Returns the value of the '<em><b>Target Names</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Names</em>' attribute list.
	 * @see org.nasdanika.sdk.runtime.models.jvm.JvmPackage#getOpens_TargetNames()
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
	 * @see org.nasdanika.sdk.runtime.models.jvm.JvmPackage#getOpens_Package()
	 * @model
	 * @generated
	 */
	org.nasdanika.sdk.runtime.models.jvm.Package getPackage();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.jvm.Opens#getPackage <em>Package</em>}' reference.
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
	 * @see org.nasdanika.sdk.runtime.models.jvm.JvmPackage#getOpens_Targets()
	 * @model
	 * @generated
	 */
	EList<org.nasdanika.sdk.runtime.models.jvm.Module> getTargets();

} // Opens
