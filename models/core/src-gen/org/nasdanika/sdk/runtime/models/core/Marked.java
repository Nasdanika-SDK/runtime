/**
 */
package org.nasdanika.sdk.runtime.models.core;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Marked</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.core.Marked#getMarkers <em>Markers</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.sdk.runtime.models.core.CorePackage#getMarked()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Marked extends EObject {
	/**
	 * Returns the value of the '<em><b>Markers</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.sdk.runtime.models.core.Marker}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Markers</em>' containment reference list.
	 * @see org.nasdanika.sdk.runtime.models.core.CorePackage#getMarked_Markers()
	 * @model containment="true"
	 * @generated
	 */
	EList<Marker> getMarkers();

} // Marked
