/**
 */
package org.nasdanika.sdk.runtime.models.drawio;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Animation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Page-level animation:
 *  *     {"animation": {"enabled": true, "loop": true, "steps": [ ... ]}}
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.drawio.Animation#isEnabled <em>Enabled</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.drawio.Animation#isLoop <em>Loop</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.drawio.Animation#getSteps <em>Steps</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.sdk.runtime.models.drawio.DrawioPackage#getAnimation()
 * @model
 * @generated
 */
public interface Animation extends EObject {
	/**
	 * Returns the value of the '<em><b>Enabled</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enabled</em>' attribute.
	 * @see #setEnabled(boolean)
	 * @see org.nasdanika.sdk.runtime.models.drawio.DrawioPackage#getAnimation_Enabled()
	 * @model default="true" unique="false"
	 * @generated
	 */
	boolean isEnabled();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.drawio.Animation#isEnabled <em>Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enabled</em>' attribute.
	 * @see #isEnabled()
	 * @generated
	 */
	void setEnabled(boolean value);

	/**
	 * Returns the value of the '<em><b>Loop</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Loop</em>' attribute.
	 * @see #setLoop(boolean)
	 * @see org.nasdanika.sdk.runtime.models.drawio.DrawioPackage#getAnimation_Loop()
	 * @model unique="false"
	 * @generated
	 */
	boolean isLoop();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.drawio.Animation#isLoop <em>Loop</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Loop</em>' attribute.
	 * @see #isLoop()
	 * @generated
	 */
	void setLoop(boolean value);

	/**
	 * Returns the value of the '<em><b>Steps</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.sdk.runtime.models.drawio.Action}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Steps</em>' containment reference list.
	 * @see org.nasdanika.sdk.runtime.models.drawio.DrawioPackage#getAnimation_Steps()
	 * @model containment="true"
	 * @generated
	 */
	EList<Action> getSteps();

} // Animation
