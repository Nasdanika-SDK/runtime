/**
 */
package org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays;

import org.eclipse.emf.common.util.EList;

import org.nasdanika.sdk.runtime.models.html.Node;

import org.nasdanika.sdk.runtime.models.html.bootstrap.BootstrapElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Toast Header</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Header with title and secondary text, followed by a close button unless closeButton is false.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.ToastHeader#isCloseButton <em>Close Button</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.ToastHeader#getContent <em>Content</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.OverlaysPackage#getToastHeader()
 * @model annotation="urn:org.nasdanika:html tag='div' classes='toast-header'"
 * @generated
 */
public interface ToastHeader extends BootstrapElement {
	/**
	 * Returns the value of the '<em><b>Close Button</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Close Button</em>' attribute.
	 * @see #isSetCloseButton()
	 * @see #unsetCloseButton()
	 * @see #setCloseButton(boolean)
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.OverlaysPackage#getToastHeader_CloseButton()
	 * @model unique="false" unsettable="true"
	 *        annotation="urn:org.nasdanika:html logical='true'"
	 * @generated
	 */
	boolean isCloseButton();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.ToastHeader#isCloseButton <em>Close Button</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Close Button</em>' attribute.
	 * @see #isSetCloseButton()
	 * @see #unsetCloseButton()
	 * @see #isCloseButton()
	 * @generated
	 */
	void setCloseButton(boolean value);

	/**
	 * Unsets the value of the '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.ToastHeader#isCloseButton <em>Close Button</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCloseButton()
	 * @see #isCloseButton()
	 * @see #setCloseButton(boolean)
	 * @generated
	 */
	void unsetCloseButton();

	/**
	 * Returns whether the value of the '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.ToastHeader#isCloseButton <em>Close Button</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Close Button</em>' attribute is set.
	 * @see #unsetCloseButton()
	 * @see #isCloseButton()
	 * @see #setCloseButton(boolean)
	 * @generated
	 */
	boolean isSetCloseButton();

	/**
	 * Returns the value of the '<em><b>Content</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.sdk.runtime.models.html.Node}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content</em>' containment reference list.
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.OverlaysPackage#getToastHeader_Content()
	 * @model containment="true"
	 * @generated
	 */
	EList<Node> getContent();

} // ToastHeader
