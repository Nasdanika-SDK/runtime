/**
 */
package org.nasdanika.sdk.runtime.models.meta;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.meta.Reference#isContainment <em>Containment</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.meta.Reference#getOpposite <em>Opposite</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.meta.Reference#getKeys <em>Keys</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.sdk.runtime.models.meta.MetaPackage#getReference()
 * @model
 * @generated
 */
public interface Reference extends Feature {
	/**
	 * Returns the value of the '<em><b>Containment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  The target is owned by this object: a tree edge rather than a graph edge.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Containment</em>' attribute.
	 * @see #setContainment(boolean)
	 * @see org.nasdanika.sdk.runtime.models.meta.MetaPackage#getReference_Containment()
	 * @model unique="false"
	 * @generated
	 */
	boolean isContainment();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.meta.Reference#isContainment <em>Containment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Containment</em>' attribute.
	 * @see #isContainment()
	 * @generated
	 */
	void setContainment(boolean value);

	/**
	 * Returns the value of the '<em><b>Opposite</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  The other end of a bidirectional reference.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Opposite</em>' reference.
	 * @see #setOpposite(Reference)
	 * @see org.nasdanika.sdk.runtime.models.meta.MetaPackage#getReference_Opposite()
	 * @model
	 * @generated
	 */
	Reference getOpposite();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.meta.Reference#getOpposite <em>Opposite</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Opposite</em>' reference.
	 * @see #getOpposite()
	 * @generated
	 */
	void setOpposite(Reference value);

	/**
	 * Returns the value of the '<em><b>Keys</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.sdk.runtime.models.meta.Attribute}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Attributes that identify a target within the containing list, which is
	 * what turns a positional path into //@members[id='lea'].
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Keys</em>' reference list.
	 * @see org.nasdanika.sdk.runtime.models.meta.MetaPackage#getReference_Keys()
	 * @model
	 * @generated
	 */
	EList<Attribute> getKeys();

} // Reference
