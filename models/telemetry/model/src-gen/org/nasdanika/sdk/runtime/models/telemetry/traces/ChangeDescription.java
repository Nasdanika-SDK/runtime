/**
 */
package org.nasdanika.sdk.runtime.models.telemetry.traces;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Change Description</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.telemetry.traces.ChangeDescription#getRemovedObjects <em>Removed Objects</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.sdk.runtime.models.telemetry.traces.TracesPackage#getChangeDescription()
 * @model
 * @generated
 */
public interface ChangeDescription extends org.eclipse.emf.ecore.change.ChangeDescription, SpanReference {
	/**
	 * Returns the value of the '<em><b>Removed Objects</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Removed Objects</em>' containment reference list.
	 * @see org.nasdanika.sdk.runtime.models.telemetry.traces.TracesPackage#getChangeDescription_RemovedObjects()
	 * @model containment="true"
	 * @generated
	 */
	EList<EObject> getRemovedObjects();

} // ChangeDescription
