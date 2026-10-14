/**
 */
package org.nasdanika.sdk.runtime.models.typescript;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 *  ---------------------------------------------------------------------------
 * Declarations
 * ---------------------------------------------------------------------------
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.typescript.Declaration#isExported <em>Exported</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.typescript.Declaration#isAmbient <em>Ambient</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.sdk.runtime.models.typescript.TypescriptPackage#getDeclaration()
 * @model abstract="true"
 * @generated
 */
public interface Declaration extends TypeScriptElement {
	/**
	 * Returns the value of the '<em><b>Exported</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exported</em>' attribute.
	 * @see #setExported(boolean)
	 * @see org.nasdanika.sdk.runtime.models.typescript.TypescriptPackage#getDeclaration_Exported()
	 * @model unique="false"
	 * @generated
	 */
	boolean isExported();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.typescript.Declaration#isExported <em>Exported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exported</em>' attribute.
	 * @see #isExported()
	 * @generated
	 */
	void setExported(boolean value);

	/**
	 * Returns the value of the '<em><b>Ambient</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Emit `declare`: ambient declaration, no implementation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ambient</em>' attribute.
	 * @see #setAmbient(boolean)
	 * @see org.nasdanika.sdk.runtime.models.typescript.TypescriptPackage#getDeclaration_Ambient()
	 * @model unique="false"
	 * @generated
	 */
	boolean isAmbient();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.typescript.Declaration#isAmbient <em>Ambient</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ambient</em>' attribute.
	 * @see #isAmbient()
	 * @generated
	 */
	void setAmbient(boolean value);

} // Declaration
