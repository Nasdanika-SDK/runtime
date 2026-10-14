/**
 */
package org.nasdanika.sdk.runtime.models.typescript;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An npm package to emit: enough to write package.json and lay out files, not an
 * estate model. Version, dependency versions and provenance belong to the packaging
 * estate model, which references packages by URI rather than containing them. Kept
 * here only because a generator that emits modules but not the package around them
 * leaves the last mile to a script, and that script is where drift starts.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.typescript.Package#getPackageName <em>Package Name</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.typescript.Package#getVersion <em>Version</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.typescript.Package#getDescription <em>Description</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.typescript.Package#getLicense <em>License</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.typescript.Package#getModuleType <em>Module Type</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.typescript.Package#getDependencies <em>Dependencies</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.typescript.Package#getPeerDependencies <em>Peer Dependencies</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.typescript.Package#getModules <em>Modules</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.sdk.runtime.models.typescript.TypescriptPackage#getPackage()
 * @model
 * @generated
 */
public interface Package extends TypeScriptElement {
	/**
	 * Returns the value of the '<em><b>Package Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Scoped npm name, e.g. @nasdanika/nxcore.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Package Name</em>' attribute.
	 * @see #setPackageName(String)
	 * @see org.nasdanika.sdk.runtime.models.typescript.TypescriptPackage#getPackage_PackageName()
	 * @model unique="false"
	 * @generated
	 */
	String getPackageName();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.typescript.Package#getPackageName <em>Package Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Package Name</em>' attribute.
	 * @see #getPackageName()
	 * @generated
	 */
	void setPackageName(String value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see org.nasdanika.sdk.runtime.models.typescript.TypescriptPackage#getPackage_Version()
	 * @model unique="false"
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.typescript.Package#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.nasdanika.sdk.runtime.models.typescript.TypescriptPackage#getPackage_Description()
	 * @model unique="false"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.typescript.Package#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>License</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>License</em>' attribute.
	 * @see #setLicense(String)
	 * @see org.nasdanika.sdk.runtime.models.typescript.TypescriptPackage#getPackage_License()
	 * @model unique="false"
	 * @generated
	 */
	String getLicense();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.typescript.Package#getLicense <em>License</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>License</em>' attribute.
	 * @see #getLicense()
	 * @generated
	 */
	void setLicense(String value);

	/**
	 * Returns the value of the '<em><b>Module Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  package.json "type"; "module" for the ESM packages the tower publishes.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Module Type</em>' attribute.
	 * @see #setModuleType(String)
	 * @see org.nasdanika.sdk.runtime.models.typescript.TypescriptPackage#getPackage_ModuleType()
	 * @model unique="false"
	 * @generated
	 */
	String getModuleType();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.typescript.Package#getModuleType <em>Module Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Module Type</em>' attribute.
	 * @see #getModuleType()
	 * @generated
	 */
	void setModuleType(String value);

	/**
	 * Returns the value of the '<em><b>Dependencies</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Bare specifiers of runtime dependencies, mapped to versions by the emitter.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dependencies</em>' attribute list.
	 * @see org.nasdanika.sdk.runtime.models.typescript.TypescriptPackage#getPackage_Dependencies()
	 * @model unique="false"
	 * @generated
	 */
	EList<String> getDependencies();

	/**
	 * Returns the value of the '<em><b>Peer Dependencies</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Bare specifiers of peer dependencies.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Peer Dependencies</em>' attribute list.
	 * @see org.nasdanika.sdk.runtime.models.typescript.TypescriptPackage#getPackage_PeerDependencies()
	 * @model unique="false"
	 * @generated
	 */
	EList<String> getPeerDependencies();

	/**
	 * Returns the value of the '<em><b>Modules</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.sdk.runtime.models.typescript.Module}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modules</em>' containment reference list.
	 * @see org.nasdanika.sdk.runtime.models.typescript.TypescriptPackage#getPackage_Modules()
	 * @model containment="true"
	 * @generated
	 */
	EList<org.nasdanika.sdk.runtime.models.typescript.Module> getModules();

} // Package
