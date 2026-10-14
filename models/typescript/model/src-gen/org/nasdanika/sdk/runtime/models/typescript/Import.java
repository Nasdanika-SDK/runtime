/**
 */
package org.nasdanika.sdk.runtime.models.typescript;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Import</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * One import statement. typeOnly emits `import type`, which is what keeps
 * cross-floor references from creating runtime cycles between generated packages:
 * a package that only needs its parent floor's TYPES must not pull in its runtime.
 * Getting this wrong is the single most likely defect in a hand-written emitter,
 * which is the argument for owning it here.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.typescript.Import#getModuleSpecifier <em>Module Specifier</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.typescript.Import#isTypeOnly <em>Type Only</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.typescript.Import#getBindings <em>Bindings</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.sdk.runtime.models.typescript.TypescriptPackage#getImport()
 * @model
 * @generated
 */
public interface Import extends TypeScriptElement {
	/**
	 * Returns the value of the '<em><b>Module Specifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Bare specifier (@nasdanika/nxcore) or relative path (./element.js).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Module Specifier</em>' attribute.
	 * @see #setModuleSpecifier(String)
	 * @see org.nasdanika.sdk.runtime.models.typescript.TypescriptPackage#getImport_ModuleSpecifier()
	 * @model unique="false"
	 * @generated
	 */
	String getModuleSpecifier();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.typescript.Import#getModuleSpecifier <em>Module Specifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Module Specifier</em>' attribute.
	 * @see #getModuleSpecifier()
	 * @generated
	 */
	void setModuleSpecifier(String value);

	/**
	 * Returns the value of the '<em><b>Type Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Only</em>' attribute.
	 * @see #setTypeOnly(boolean)
	 * @see org.nasdanika.sdk.runtime.models.typescript.TypescriptPackage#getImport_TypeOnly()
	 * @model unique="false"
	 * @generated
	 */
	boolean isTypeOnly();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.typescript.Import#isTypeOnly <em>Type Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Only</em>' attribute.
	 * @see #isTypeOnly()
	 * @generated
	 */
	void setTypeOnly(boolean value);

	/**
	 * Returns the value of the '<em><b>Bindings</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.sdk.runtime.models.typescript.ImportBinding}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bindings</em>' containment reference list.
	 * @see org.nasdanika.sdk.runtime.models.typescript.TypescriptPackage#getImport_Bindings()
	 * @model containment="true"
	 * @generated
	 */
	EList<ImportBinding> getBindings();

} // Import
