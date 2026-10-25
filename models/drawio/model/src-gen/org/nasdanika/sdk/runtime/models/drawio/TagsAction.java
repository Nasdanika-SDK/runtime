/**
 */
package org.nasdanika.sdk.runtime.models.drawio;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tags Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 *  ---- Tags ----
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.drawio.TagsAction#getToggle <em>Toggle</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.drawio.TagsAction#getHidden <em>Hidden</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.drawio.TagsAction#getVisible <em>Visible</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.sdk.runtime.models.drawio.DrawioPackage#getTagsAction()
 * @model
 * @generated
 */
public interface TagsAction extends Action {
	/**
	 * Returns the value of the '<em><b>Toggle</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.sdk.runtime.models.drawio.Tag}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Toggle</em>' reference list.
	 * @see org.nasdanika.sdk.runtime.models.drawio.DrawioPackage#getTagsAction_Toggle()
	 * @model
	 * @generated
	 */
	EList<Tag> getToggle();

	/**
	 * Returns the value of the '<em><b>Hidden</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.sdk.runtime.models.drawio.Tag}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hidden</em>' reference list.
	 * @see org.nasdanika.sdk.runtime.models.drawio.DrawioPackage#getTagsAction_Hidden()
	 * @model
	 * @generated
	 */
	EList<Tag> getHidden();

	/**
	 * Returns the value of the '<em><b>Visible</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.sdk.runtime.models.drawio.Tag}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visible</em>' reference list.
	 * @see org.nasdanika.sdk.runtime.models.drawio.DrawioPackage#getTagsAction_Visible()
	 * @model
	 * @generated
	 */
	EList<Tag> getVisible();

} // TagsAction
