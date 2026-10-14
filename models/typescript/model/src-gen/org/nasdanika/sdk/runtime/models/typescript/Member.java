/**
 */
package org.nasdanika.sdk.runtime.models.typescript;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Member</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.typescript.Member#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.typescript.Member#isStatic <em>Static</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.typescript.Member#isOptional <em>Optional</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.sdk.runtime.models.typescript.TypescriptPackage#getMember()
 * @model abstract="true"
 * @generated
 */
public interface Member extends TypeScriptElement {
	/**
	 * Returns the value of the '<em><b>Visibility</b></em>' attribute.
	 * The literals are from the enumeration {@link org.nasdanika.sdk.runtime.models.typescript.Visibility}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visibility</em>' attribute.
	 * @see org.nasdanika.sdk.runtime.models.typescript.Visibility
	 * @see #setVisibility(Visibility)
	 * @see org.nasdanika.sdk.runtime.models.typescript.TypescriptPackage#getMember_Visibility()
	 * @model unique="false"
	 * @generated
	 */
	Visibility getVisibility();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.typescript.Member#getVisibility <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visibility</em>' attribute.
	 * @see org.nasdanika.sdk.runtime.models.typescript.Visibility
	 * @see #getVisibility()
	 * @generated
	 */
	void setVisibility(Visibility value);

	/**
	 * Returns the value of the '<em><b>Static</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Static</em>' attribute.
	 * @see #setStatic(boolean)
	 * @see org.nasdanika.sdk.runtime.models.typescript.TypescriptPackage#getMember_Static()
	 * @model unique="false"
	 * @generated
	 */
	boolean isStatic();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.typescript.Member#isStatic <em>Static</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Static</em>' attribute.
	 * @see #isStatic()
	 * @generated
	 */
	void setStatic(boolean value);

	/**
	 * Returns the value of the '<em><b>Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Optional</em>' attribute.
	 * @see #setOptional(boolean)
	 * @see org.nasdanika.sdk.runtime.models.typescript.TypescriptPackage#getMember_Optional()
	 * @model unique="false"
	 * @generated
	 */
	boolean isOptional();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.typescript.Member#isOptional <em>Optional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Optional</em>' attribute.
	 * @see #isOptional()
	 * @generated
	 */
	void setOptional(boolean value);

} // Member
