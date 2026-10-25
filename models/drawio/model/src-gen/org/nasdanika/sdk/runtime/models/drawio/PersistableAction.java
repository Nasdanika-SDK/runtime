/**
 */
package org.nasdanika.sdk.runtime.models.drawio;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Persistable Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Actions whose changes can be written back into the model rather than only
 * affecting the current view - Draw.io's "transient": false.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.drawio.PersistableAction#isPersistChanges <em>Persist Changes</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.sdk.runtime.models.drawio.DrawioPackage#getPersistableAction()
 * @model abstract="true"
 * @generated
 */
public interface PersistableAction extends TargetedAction {
	/**
	 * Returns the value of the '<em><b>Persist Changes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  JSON "transient": false. Default (false here) means view-only.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Persist Changes</em>' attribute.
	 * @see #setPersistChanges(boolean)
	 * @see org.nasdanika.sdk.runtime.models.drawio.DrawioPackage#getPersistableAction_PersistChanges()
	 * @model unique="false"
	 * @generated
	 */
	boolean isPersistChanges();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.drawio.PersistableAction#isPersistChanges <em>Persist Changes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Persist Changes</em>' attribute.
	 * @see #isPersistChanges()
	 * @generated
	 */
	void setPersistChanges(boolean value);

} // PersistableAction
