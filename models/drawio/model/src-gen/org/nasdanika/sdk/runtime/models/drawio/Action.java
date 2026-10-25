/**
 */
package org.nasdanika.sdk.runtime.models.drawio;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * One step of a sequence.
 * 
 * Draw.io steps carry a 'transient' flag which, when set to false, persists the
 * step's changes into the model instead of only affecting the view. It is modelled
 * as persistChanges on the actions that support it (see PersistableAction) rather
 * than as 'transient', because that word is an Xcore feature modifier and a Java
 * keyword, and the inverted name reads better than an escaped one.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.drawio.Action#isImmediate <em>Immediate</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.sdk.runtime.models.drawio.DrawioPackage#getAction()
 * @model abstract="true"
 * @generated
 */
public interface Action extends EObject {
	/**
	 * Returns the value of the '<em><b>Immediate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Run together with the previous step rather than after it - the JSON
	 * "immediate": true. This is how several effects are made to happen at once.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Immediate</em>' attribute.
	 * @see #setImmediate(boolean)
	 * @see org.nasdanika.sdk.runtime.models.drawio.DrawioPackage#getAction_Immediate()
	 * @model unique="false"
	 * @generated
	 */
	boolean isImmediate();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.drawio.Action#isImmediate <em>Immediate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Immediate</em>' attribute.
	 * @see #isImmediate()
	 * @generated
	 */
	void setImmediate(boolean value);

} // Action
