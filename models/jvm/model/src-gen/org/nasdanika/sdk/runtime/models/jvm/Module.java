/**
 */
package org.nasdanika.sdk.runtime.models.jvm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Module</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A module, named or unnamed.
 * 
 * The two reference sets are the reason this model is worth having. `requires` is
 * what the module declared; `reads` is what resolution actually gave it. They
 * diverge when `requires transitive` propagates readability, and, more
 * interestingly, when service binding pulls a provider into the graph that
 * nothing declared a dependency on. That second case is absent from every POM by
 * construction, so no dependency tree can report it.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.jvm.Module#isNamed <em>Named</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.jvm.Module#getVersion <em>Version</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.jvm.Module#getModifiers <em>Modifiers</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.jvm.Module#getMainClassName <em>Main Class Name</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.jvm.Module#getPackages <em>Packages</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.jvm.Module#getRequires <em>Requires</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.jvm.Module#getExports <em>Exports</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.jvm.Module#getOpens <em>Opens</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.jvm.Module#getProvides <em>Provides</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.jvm.Module#getUses <em>Uses</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.jvm.Module#getReads <em>Reads</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.jvm.Module#getLayer <em>Layer</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.jvm.Module#getClassLoader <em>Class Loader</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.sdk.runtime.models.jvm.JvmPackage#getModule()
 * @model
 * @generated
 */
public interface Module extends JvmElement {
	/**
	 * Returns the value of the '<em><b>Named</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  False for a class loader's unnamed module, where name is absent.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Named</em>' attribute.
	 * @see #setNamed(boolean)
	 * @see org.nasdanika.sdk.runtime.models.jvm.JvmPackage#getModule_Named()
	 * @model unique="false"
	 * @generated
	 */
	boolean isNamed();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.jvm.Module#isNamed <em>Named</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Named</em>' attribute.
	 * @see #isNamed()
	 * @generated
	 */
	void setNamed(boolean value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  The raw version string from the descriptor, unparsed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see org.nasdanika.sdk.runtime.models.jvm.JvmPackage#getModule_Version()
	 * @model unique="false"
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.jvm.Module#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

	/**
	 * Returns the value of the '<em><b>Modifiers</b></em>' attribute list.
	 * The list contents are of type {@link org.nasdanika.sdk.runtime.models.jvm.ModuleModifier}.
	 * The literals are from the enumeration {@link org.nasdanika.sdk.runtime.models.jvm.ModuleModifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modifiers</em>' attribute list.
	 * @see org.nasdanika.sdk.runtime.models.jvm.ModuleModifier
	 * @see org.nasdanika.sdk.runtime.models.jvm.JvmPackage#getModule_Modifiers()
	 * @model unique="false"
	 * @generated
	 */
	EList<ModuleModifier> getModifiers();

	/**
	 * Returns the value of the '<em><b>Main Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Binary name of the main class, when declared.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Main Class Name</em>' attribute.
	 * @see #setMainClassName(String)
	 * @see org.nasdanika.sdk.runtime.models.jvm.JvmPackage#getModule_MainClassName()
	 * @model unique="false"
	 * @generated
	 */
	String getMainClassName();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.jvm.Module#getMainClassName <em>Main Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Main Class Name</em>' attribute.
	 * @see #getMainClassName()
	 * @generated
	 */
	void setMainClassName(String value);

	/**
	 * Returns the value of the '<em><b>Packages</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.sdk.runtime.models.jvm.Package}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Packages</em>' containment reference list.
	 * @see org.nasdanika.sdk.runtime.models.jvm.JvmPackage#getModule_Packages()
	 * @model containment="true"
	 * @generated
	 */
	EList<org.nasdanika.sdk.runtime.models.jvm.Package> getPackages();

	/**
	 * Returns the value of the '<em><b>Requires</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.sdk.runtime.models.jvm.Requires}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requires</em>' containment reference list.
	 * @see org.nasdanika.sdk.runtime.models.jvm.JvmPackage#getModule_Requires()
	 * @model containment="true"
	 * @generated
	 */
	EList<Requires> getRequires();

	/**
	 * Returns the value of the '<em><b>Exports</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.sdk.runtime.models.jvm.Exports}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exports</em>' containment reference list.
	 * @see org.nasdanika.sdk.runtime.models.jvm.JvmPackage#getModule_Exports()
	 * @model containment="true"
	 * @generated
	 */
	EList<Exports> getExports();

	/**
	 * Returns the value of the '<em><b>Opens</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.sdk.runtime.models.jvm.Opens}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Opens</em>' containment reference list.
	 * @see org.nasdanika.sdk.runtime.models.jvm.JvmPackage#getModule_Opens()
	 * @model containment="true"
	 * @generated
	 */
	EList<Opens> getOpens();

	/**
	 * Returns the value of the '<em><b>Provides</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.sdk.runtime.models.jvm.Provides}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provides</em>' containment reference list.
	 * @see org.nasdanika.sdk.runtime.models.jvm.JvmPackage#getModule_Provides()
	 * @model containment="true"
	 * @generated
	 */
	EList<Provides> getProvides();

	/**
	 * Returns the value of the '<em><b>Uses</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Binary names of service interfaces this module uses.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Uses</em>' attribute list.
	 * @see org.nasdanika.sdk.runtime.models.jvm.JvmPackage#getModule_Uses()
	 * @model unique="false"
	 * @generated
	 */
	EList<String> getUses();

	/**
	 * Returns the value of the '<em><b>Reads</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.sdk.runtime.models.jvm.Module}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Resolved readability, from the configuration rather than from the
	 * descriptor. The set difference against `requires` is the money query.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reads</em>' reference list.
	 * @see org.nasdanika.sdk.runtime.models.jvm.JvmPackage#getModule_Reads()
	 * @model
	 * @generated
	 */
	EList<Module> getReads();

	/**
	 * Returns the value of the '<em><b>Layer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Layer</em>' reference.
	 * @see #setLayer(Layer)
	 * @see org.nasdanika.sdk.runtime.models.jvm.JvmPackage#getModule_Layer()
	 * @model
	 * @generated
	 */
	Layer getLayer();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.jvm.Module#getLayer <em>Layer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Layer</em>' reference.
	 * @see #getLayer()
	 * @generated
	 */
	void setLayer(Layer value);

	/**
	 * Returns the value of the '<em><b>Class Loader</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class Loader</em>' reference.
	 * @see #setClassLoader(org.nasdanika.sdk.runtime.models.jvm.ClassLoader)
	 * @see org.nasdanika.sdk.runtime.models.jvm.JvmPackage#getModule_ClassLoader()
	 * @model
	 * @generated
	 */
	org.nasdanika.sdk.runtime.models.jvm.ClassLoader getClassLoader();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.jvm.Module#getClassLoader <em>Class Loader</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class Loader</em>' reference.
	 * @see #getClassLoader()
	 * @generated
	 */
	void setClassLoader(org.nasdanika.sdk.runtime.models.jvm.ClassLoader value);

} // Module
