/**
 */
package org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays;

import org.eclipse.emf.common.util.EList;

import org.nasdanika.sdk.runtime.models.html.bootstrap.BootstrapElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Toast Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.ToastContainer#getPosition <em>Position</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.ToastContainer#getContainment <em>Containment</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.ToastContainer#getToasts <em>Toasts</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.OverlaysPackage#getToastContainer()
 * @model annotation="urn:org.nasdanika:html tag='div' classes='toast-container'"
 * @generated
 */
public interface ToastContainer extends BootstrapElement {
	/**
	 * Returns the value of the '<em><b>Position</b></em>' attribute.
	 * The literals are from the enumeration {@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.ToastPosition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Position</em>' attribute.
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.ToastPosition
	 * @see #isSetPosition()
	 * @see #unsetPosition()
	 * @see #setPosition(ToastPosition)
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.OverlaysPackage#getToastContainer_Position()
	 * @model unique="false" unsettable="true"
	 *        annotation="urn:org.nasdanika:html logical='true'"
	 * @generated
	 */
	ToastPosition getPosition();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.ToastContainer#getPosition <em>Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position</em>' attribute.
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.ToastPosition
	 * @see #isSetPosition()
	 * @see #unsetPosition()
	 * @see #getPosition()
	 * @generated
	 */
	void setPosition(ToastPosition value);

	/**
	 * Unsets the value of the '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.ToastContainer#getPosition <em>Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPosition()
	 * @see #getPosition()
	 * @see #setPosition(ToastPosition)
	 * @generated
	 */
	void unsetPosition();

	/**
	 * Returns whether the value of the '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.ToastContainer#getPosition <em>Position</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Position</em>' attribute is set.
	 * @see #unsetPosition()
	 * @see #getPosition()
	 * @see #setPosition(ToastPosition)
	 * @generated
	 */
	boolean isSetPosition();

	/**
	 * Returns the value of the '<em><b>Containment</b></em>' attribute.
	 * The literals are from the enumeration {@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.ToastContainment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Containment</em>' attribute.
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.ToastContainment
	 * @see #isSetContainment()
	 * @see #unsetContainment()
	 * @see #setContainment(ToastContainment)
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.OverlaysPackage#getToastContainer_Containment()
	 * @model unique="false" unsettable="true"
	 *        annotation="urn:org.nasdanika:html classes='position-{}'"
	 * @generated
	 */
	ToastContainment getContainment();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.ToastContainer#getContainment <em>Containment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Containment</em>' attribute.
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.ToastContainment
	 * @see #isSetContainment()
	 * @see #unsetContainment()
	 * @see #getContainment()
	 * @generated
	 */
	void setContainment(ToastContainment value);

	/**
	 * Unsets the value of the '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.ToastContainer#getContainment <em>Containment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetContainment()
	 * @see #getContainment()
	 * @see #setContainment(ToastContainment)
	 * @generated
	 */
	void unsetContainment();

	/**
	 * Returns whether the value of the '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.ToastContainer#getContainment <em>Containment</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Containment</em>' attribute is set.
	 * @see #unsetContainment()
	 * @see #getContainment()
	 * @see #setContainment(ToastContainment)
	 * @generated
	 */
	boolean isSetContainment();

	/**
	 * Returns the value of the '<em><b>Toasts</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.Toast}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Toasts</em>' containment reference list.
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.OverlaysPackage#getToastContainer_Toasts()
	 * @model containment="true"
	 * @generated
	 */
	EList<Toast> getToasts();

} // ToastContainer
