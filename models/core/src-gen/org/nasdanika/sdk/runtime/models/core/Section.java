/**
 */
package org.nasdanika.sdk.runtime.models.core;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Section</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.core.Section#getChildren <em>Children</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.core.Section#getContents <em>Contents</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.sdk.runtime.models.core.CorePackage#getSection()
 * @model
 * @generated
 */
public interface Section extends SectionReference {
	/**
	 * Returns the value of the '<em><b>Children</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.sdk.runtime.models.core.Section}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children</em>' containment reference list.
	 * @see org.nasdanika.sdk.runtime.models.core.CorePackage#getSection_Children()
	 * @model containment="true"
	 * @generated
	 */
	EList<Section> getChildren();

	/**
	 * Returns the value of the '<em><b>Contents</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.sdk.runtime.models.core.Content}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contents</em>' containment reference list.
	 * @see org.nasdanika.sdk.runtime.models.core.CorePackage#getSection_Contents()
	 * @model containment="true"
	 * @generated
	 */
	EList<Content> getContents();

} // Section
