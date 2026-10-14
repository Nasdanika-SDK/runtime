/**
 */
package org.nasdanika.sdk.runtime.models.jvm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class Loader</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A class loader. Orthogonal to layers: a loader may serve modules in several
 * layers, and every loader has exactly one unnamed module holding whatever it
 * loaded from the classpath.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.jvm.ClassLoader#getLoaderTypeName <em>Loader Type Name</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.jvm.ClassLoader#getParent <em>Parent</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.jvm.ClassLoader#getUnnamedModule <em>Unnamed Module</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.sdk.runtime.models.jvm.JvmPackage#getClassLoader()
 * @model
 * @generated
 */
public interface ClassLoader extends JvmElement {
	/**
	 * Returns the value of the '<em><b>Loader Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  The loader's own class, as a binary name, e.g. jdk.internal.loader.ClassLoaders$AppClassLoader.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Loader Type Name</em>' attribute.
	 * @see #setLoaderTypeName(String)
	 * @see org.nasdanika.sdk.runtime.models.jvm.JvmPackage#getClassLoader_LoaderTypeName()
	 * @model unique="false"
	 * @generated
	 */
	String getLoaderTypeName();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.jvm.ClassLoader#getLoaderTypeName <em>Loader Type Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Loader Type Name</em>' attribute.
	 * @see #getLoaderTypeName()
	 * @generated
	 */
	void setLoaderTypeName(String value);

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' reference.
	 * @see #setParent(ClassLoader)
	 * @see org.nasdanika.sdk.runtime.models.jvm.JvmPackage#getClassLoader_Parent()
	 * @model
	 * @generated
	 */
	ClassLoader getParent();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.jvm.ClassLoader#getParent <em>Parent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(ClassLoader value);

	/**
	 * Returns the value of the '<em><b>Unnamed Module</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unnamed Module</em>' reference.
	 * @see #setUnnamedModule(org.nasdanika.sdk.runtime.models.jvm.Module)
	 * @see org.nasdanika.sdk.runtime.models.jvm.JvmPackage#getClassLoader_UnnamedModule()
	 * @model
	 * @generated
	 */
	org.nasdanika.sdk.runtime.models.jvm.Module getUnnamedModule();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.jvm.ClassLoader#getUnnamedModule <em>Unnamed Module</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unnamed Module</em>' reference.
	 * @see #getUnnamedModule()
	 * @generated
	 */
	void setUnnamedModule(org.nasdanika.sdk.runtime.models.jvm.Module value);

} // ClassLoader
