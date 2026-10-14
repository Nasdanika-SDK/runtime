/**
 */
package org.nasdanika.sdk.runtime.models.jvm;

import org.eclipse.emf.common.util.EList;

import org.nasdanika.sdk.runtime.models.core.ModelElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Java Virtual Machine</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The root: one JVM, described. A live loader populates this from
 * ModuleLayer.boot() and reflection; a build-time scan synthesizes one with the
 * runtime features left unset and modules derived from module-info.class,
 * Automatic-Module-Name, or the unnamed module.
 * 
 * The distinction matters enough to be visible in the data rather than inferred:
 * `live` says whether anything here was observed running.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.jvm.JavaVirtualMachine#isLive <em>Live</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.jvm.JavaVirtualMachine#getVmName <em>Vm Name</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.jvm.JavaVirtualMachine#getVmVersion <em>Vm Version</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.jvm.JavaVirtualMachine#getVmVendor <em>Vm Vendor</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.jvm.JavaVirtualMachine#getSpecificationVersion <em>Specification Version</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.jvm.JavaVirtualMachine#getModules <em>Modules</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.jvm.JavaVirtualMachine#getLayers <em>Layers</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.jvm.JavaVirtualMachine#getClassLoaders <em>Class Loaders</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.sdk.runtime.models.jvm.JvmPackage#getJavaVirtualMachine()
 * @model
 * @generated
 */
public interface JavaVirtualMachine extends ModelElement {
	/**
	 * Returns the value of the '<em><b>Live</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  True when populated from a running VM, false for a static scan.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Live</em>' attribute.
	 * @see #setLive(boolean)
	 * @see org.nasdanika.sdk.runtime.models.jvm.JvmPackage#getJavaVirtualMachine_Live()
	 * @model unique="false"
	 * @generated
	 */
	boolean isLive();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.jvm.JavaVirtualMachine#isLive <em>Live</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Live</em>' attribute.
	 * @see #isLive()
	 * @generated
	 */
	void setLive(boolean value);

	/**
	 * Returns the value of the '<em><b>Vm Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  java.vm.name, java.vm.version, java.vm.vendor when known.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Vm Name</em>' attribute.
	 * @see #setVmName(String)
	 * @see org.nasdanika.sdk.runtime.models.jvm.JvmPackage#getJavaVirtualMachine_VmName()
	 * @model unique="false"
	 * @generated
	 */
	String getVmName();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.jvm.JavaVirtualMachine#getVmName <em>Vm Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vm Name</em>' attribute.
	 * @see #getVmName()
	 * @generated
	 */
	void setVmName(String value);

	/**
	 * Returns the value of the '<em><b>Vm Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vm Version</em>' attribute.
	 * @see #setVmVersion(String)
	 * @see org.nasdanika.sdk.runtime.models.jvm.JvmPackage#getJavaVirtualMachine_VmVersion()
	 * @model unique="false"
	 * @generated
	 */
	String getVmVersion();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.jvm.JavaVirtualMachine#getVmVersion <em>Vm Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vm Version</em>' attribute.
	 * @see #getVmVersion()
	 * @generated
	 */
	void setVmVersion(String value);

	/**
	 * Returns the value of the '<em><b>Vm Vendor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vm Vendor</em>' attribute.
	 * @see #setVmVendor(String)
	 * @see org.nasdanika.sdk.runtime.models.jvm.JvmPackage#getJavaVirtualMachine_VmVendor()
	 * @model unique="false"
	 * @generated
	 */
	String getVmVendor();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.jvm.JavaVirtualMachine#getVmVendor <em>Vm Vendor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vm Vendor</em>' attribute.
	 * @see #getVmVendor()
	 * @generated
	 */
	void setVmVendor(String value);

	/**
	 * Returns the value of the '<em><b>Specification Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  The Java SE specification version, e.g. "21".
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Specification Version</em>' attribute.
	 * @see #setSpecificationVersion(String)
	 * @see org.nasdanika.sdk.runtime.models.jvm.JvmPackage#getJavaVirtualMachine_SpecificationVersion()
	 * @model unique="false"
	 * @generated
	 */
	String getSpecificationVersion();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.jvm.JavaVirtualMachine#getSpecificationVersion <em>Specification Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specification Version</em>' attribute.
	 * @see #getSpecificationVersion()
	 * @generated
	 */
	void setSpecificationVersion(String value);

	/**
	 * Returns the value of the '<em><b>Modules</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.sdk.runtime.models.jvm.Module}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Modules are contained here rather than in a layer, because a named module
	 * belongs to a layer and an unnamed module belongs to a class loader, and one
	 * containment cannot express both. Layers and loaders reference them.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Modules</em>' containment reference list.
	 * @see org.nasdanika.sdk.runtime.models.jvm.JvmPackage#getJavaVirtualMachine_Modules()
	 * @model containment="true"
	 * @generated
	 */
	EList<org.nasdanika.sdk.runtime.models.jvm.Module> getModules();

	/**
	 * Returns the value of the '<em><b>Layers</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.sdk.runtime.models.jvm.Layer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Layers</em>' containment reference list.
	 * @see org.nasdanika.sdk.runtime.models.jvm.JvmPackage#getJavaVirtualMachine_Layers()
	 * @model containment="true"
	 * @generated
	 */
	EList<Layer> getLayers();

	/**
	 * Returns the value of the '<em><b>Class Loaders</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.sdk.runtime.models.jvm.ClassLoader}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class Loaders</em>' containment reference list.
	 * @see org.nasdanika.sdk.runtime.models.jvm.JvmPackage#getJavaVirtualMachine_ClassLoaders()
	 * @model containment="true"
	 * @generated
	 */
	EList<org.nasdanika.sdk.runtime.models.jvm.ClassLoader> getClassLoaders();

} // JavaVirtualMachine
