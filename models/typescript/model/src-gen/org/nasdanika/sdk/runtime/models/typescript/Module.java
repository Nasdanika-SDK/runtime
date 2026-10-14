/**
 */
package org.nasdanika.sdk.runtime.models.typescript;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Module</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * One emitted file. Situated because a generation run happens at a POINT in a
 * coordinate space (jurisdiction, language, tier, audience) and the module is the
 * artifact that records which point produced it. Individual declarations are not
 * Situated: the coordinate is a property of the generation run, and runs produce
 * modules. Note that the coordinate is a RECEIPT here, never a filter - what varies
 * by coordinate is decided on the source model and in the transformation, and a
 * TypeScript model that knew about Ontario would be a TypeScript model that is wrong.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.typescript.Module#getPath <em>Path</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.typescript.Module#isDeclarationOnly <em>Declaration Only</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.typescript.Module#getHeader <em>Header</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.typescript.Module#getImports <em>Imports</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.typescript.Module#getDeclarations <em>Declarations</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.typescript.Module#getFooter <em>Footer</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.sdk.runtime.models.typescript.TypescriptPackage#getModule()
 * @model
 * @generated
 */
public interface Module extends TypeScriptElement {
	/**
	 * Returns the value of the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Path relative to the package root, without extension, e.g. "model/element".
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Path</em>' attribute.
	 * @see #setPath(String)
	 * @see org.nasdanika.sdk.runtime.models.typescript.TypescriptPackage#getModule_Path()
	 * @model unique="false"
	 * @generated
	 */
	String getPath();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.typescript.Module#getPath <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path</em>' attribute.
	 * @see #getPath()
	 * @generated
	 */
	void setPath(String value);

	/**
	 * Returns the value of the '<em><b>Declaration Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Emit as .d.ts rather than .ts: declarations only, no bodies.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Declaration Only</em>' attribute.
	 * @see #setDeclarationOnly(boolean)
	 * @see org.nasdanika.sdk.runtime.models.typescript.TypescriptPackage#getModule_DeclarationOnly()
	 * @model unique="false"
	 * @generated
	 */
	boolean isDeclarationOnly();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.typescript.Module#isDeclarationOnly <em>Declaration Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Declaration Only</em>' attribute.
	 * @see #isDeclarationOnly()
	 * @generated
	 */
	void setDeclarationOnly(boolean value);

	/**
	 * Returns the value of the '<em><b>Header</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Verbatim banner emitted first: license header, do-not-edit notice, provenance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Header</em>' attribute.
	 * @see #setHeader(String)
	 * @see org.nasdanika.sdk.runtime.models.typescript.TypescriptPackage#getModule_Header()
	 * @model unique="false"
	 * @generated
	 */
	String getHeader();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.typescript.Module#getHeader <em>Header</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Header</em>' attribute.
	 * @see #getHeader()
	 * @generated
	 */
	void setHeader(String value);

	/**
	 * Returns the value of the '<em><b>Imports</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.sdk.runtime.models.typescript.Import}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Normally COMPUTED at save time from the TypeReferences reachable in this
	 * module. Authored imports are for the cases the resolver cannot see, such as
	 * side-effect imports and types referenced only inside opaque code.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Imports</em>' containment reference list.
	 * @see org.nasdanika.sdk.runtime.models.typescript.TypescriptPackage#getModule_Imports()
	 * @model containment="true"
	 * @generated
	 */
	EList<Import> getImports();

	/**
	 * Returns the value of the '<em><b>Declarations</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.sdk.runtime.models.typescript.Declaration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Declarations</em>' containment reference list.
	 * @see org.nasdanika.sdk.runtime.models.typescript.TypescriptPackage#getModule_Declarations()
	 * @model containment="true"
	 * @generated
	 */
	EList<Declaration> getDeclarations();

	/**
	 * Returns the value of the '<em><b>Footer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Opaque trailing source appended verbatim: re-exports, module augmentation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Footer</em>' attribute.
	 * @see #setFooter(String)
	 * @see org.nasdanika.sdk.runtime.models.typescript.TypescriptPackage#getModule_Footer()
	 * @model unique="false"
	 * @generated
	 */
	String getFooter();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.typescript.Module#getFooter <em>Footer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Footer</em>' attribute.
	 * @see #getFooter()
	 * @generated
	 */
	void setFooter(String value);

} // Module
