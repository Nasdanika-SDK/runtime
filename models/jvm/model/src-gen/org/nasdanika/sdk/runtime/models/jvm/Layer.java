/**
 */
package org.nasdanika.sdk.runtime.models.jvm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Layer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A module layer. Most applications have one, the boot layer, and the interesting
 * case is the one that does not: layers are the only standard mechanism for
 * running two versions of the same module in one JVM, which makes "which version
 * is this code actually seeing" answerable where a classpath makes it guesswork.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.jvm.Layer#isBoot <em>Boot</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.jvm.Layer#getParents <em>Parents</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.jvm.Layer#getModules <em>Modules</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.sdk.runtime.models.jvm.JvmPackage#getLayer()
 * @model
 * @generated
 */
public interface Layer extends JvmElement {
	/**
	 * Returns the value of the '<em><b>Boot</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  True for ModuleLayer.boot().
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Boot</em>' attribute.
	 * @see #setBoot(boolean)
	 * @see org.nasdanika.sdk.runtime.models.jvm.JvmPackage#getLayer_Boot()
	 * @model unique="false"
	 * @generated
	 */
	boolean isBoot();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.jvm.Layer#isBoot <em>Boot</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Boot</em>' attribute.
	 * @see #isBoot()
	 * @generated
	 */
	void setBoot(boolean value);

	/**
	 * Returns the value of the '<em><b>Parents</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.sdk.runtime.models.jvm.Layer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parents</em>' reference list.
	 * @see org.nasdanika.sdk.runtime.models.jvm.JvmPackage#getLayer_Parents()
	 * @model
	 * @generated
	 */
	EList<Layer> getParents();

	/**
	 * Returns the value of the '<em><b>Modules</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.sdk.runtime.models.jvm.Module}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modules</em>' reference list.
	 * @see org.nasdanika.sdk.runtime.models.jvm.JvmPackage#getLayer_Modules()
	 * @model
	 * @generated
	 */
	EList<org.nasdanika.sdk.runtime.models.jvm.Module> getModules();

} // Layer
