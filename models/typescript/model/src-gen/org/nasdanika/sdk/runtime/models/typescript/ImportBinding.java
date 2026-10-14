/**
 */
package org.nasdanika.sdk.runtime.models.typescript;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Import Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.typescript.ImportBinding#getKind <em>Kind</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.typescript.ImportBinding#getImportedName <em>Imported Name</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.typescript.ImportBinding#getAlias <em>Alias</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.sdk.runtime.models.typescript.TypescriptPackage#getImportBinding()
 * @model
 * @generated
 */
public interface ImportBinding extends TypeScriptElement {
	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link org.nasdanika.sdk.runtime.models.typescript.ImportKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see org.nasdanika.sdk.runtime.models.typescript.ImportKind
	 * @see #setKind(ImportKind)
	 * @see org.nasdanika.sdk.runtime.models.typescript.TypescriptPackage#getImportBinding_Kind()
	 * @model unique="false"
	 * @generated
	 */
	ImportKind getKind();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.typescript.ImportBinding#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see org.nasdanika.sdk.runtime.models.typescript.ImportKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(ImportKind value);

	/**
	 * Returns the value of the '<em><b>Imported Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Name as exported by the target module; unset for DEFAULT and NAMESPACE.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Imported Name</em>' attribute.
	 * @see #setImportedName(String)
	 * @see org.nasdanika.sdk.runtime.models.typescript.TypescriptPackage#getImportBinding_ImportedName()
	 * @model unique="false"
	 * @generated
	 */
	String getImportedName();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.typescript.ImportBinding#getImportedName <em>Imported Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Imported Name</em>' attribute.
	 * @see #getImportedName()
	 * @generated
	 */
	void setImportedName(String value);

	/**
	 * Returns the value of the '<em><b>Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Local alias; unset means the imported name is used as is.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Alias</em>' attribute.
	 * @see #setAlias(String)
	 * @see org.nasdanika.sdk.runtime.models.typescript.TypescriptPackage#getImportBinding_Alias()
	 * @model unique="false"
	 * @generated
	 */
	String getAlias();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.typescript.ImportBinding#getAlias <em>Alias</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alias</em>' attribute.
	 * @see #getAlias()
	 * @generated
	 */
	void setAlias(String value);

} // ImportBinding
