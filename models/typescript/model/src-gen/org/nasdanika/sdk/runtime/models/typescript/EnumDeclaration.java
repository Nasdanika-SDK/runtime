/**
 */
package org.nasdanika.sdk.runtime.models.typescript;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enum Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.typescript.EnumDeclaration#isConstant <em>Constant</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.typescript.EnumDeclaration#getMembers <em>Members</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.sdk.runtime.models.typescript.TypescriptPackage#getEnumDeclaration()
 * @model
 * @generated
 */
public interface EnumDeclaration extends Declaration {
	/**
	 * Returns the value of the '<em><b>Constant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Emit `const enum`. Rarely wanted in published packages: it does not survive
	 * isolatedModules and breaks consumers that compile files independently.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Constant</em>' attribute.
	 * @see #setConstant(boolean)
	 * @see org.nasdanika.sdk.runtime.models.typescript.TypescriptPackage#getEnumDeclaration_Constant()
	 * @model unique="false"
	 * @generated
	 */
	boolean isConstant();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.typescript.EnumDeclaration#isConstant <em>Constant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constant</em>' attribute.
	 * @see #isConstant()
	 * @generated
	 */
	void setConstant(boolean value);

	/**
	 * Returns the value of the '<em><b>Members</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.sdk.runtime.models.typescript.EnumMember}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Members</em>' containment reference list.
	 * @see org.nasdanika.sdk.runtime.models.typescript.TypescriptPackage#getEnumDeclaration_Members()
	 * @model containment="true"
	 * @generated
	 */
	EList<EnumMember> getMembers();

} // EnumDeclaration
