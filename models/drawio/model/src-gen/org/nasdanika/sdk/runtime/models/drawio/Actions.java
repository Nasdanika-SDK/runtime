/**
 */
package org.nasdanika.sdk.runtime.models.drawio;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Actions</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 *  ============================================================================
 * Custom actions and animations
 * 
 * Draw.io's docs use "action" and "effect" more or less interchangeably; the JSON
 * calls them actions, so the model does too.
 * 
 * Two carriers, one vocabulary:
 *   - Actions   - attached to an element, run when it is clicked.
 *   - Animation - attached to a page, runs on load, optionally looping.
 * ============================================================================
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.drawio.Actions#getTitle <em>Title</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.drawio.Actions#getActions <em>Actions</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.sdk.runtime.models.drawio.DrawioPackage#getActions()
 * @model
 * @generated
 */
public interface Actions extends AbstractLink {
	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Optional label shown for the action.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see org.nasdanika.sdk.runtime.models.drawio.DrawioPackage#getActions_Title()
	 * @model unique="false"
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.drawio.Actions#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Actions</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.sdk.runtime.models.drawio.Action}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actions</em>' containment reference list.
	 * @see org.nasdanika.sdk.runtime.models.drawio.DrawioPackage#getActions_Actions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Action> getActions();

} // Actions
