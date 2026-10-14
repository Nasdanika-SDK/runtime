/**
 */
package org.nasdanika.sdk.runtime.models.react.bootstrap.components.overlays;

import org.nasdanika.sdk.runtime.models.react.bootstrap.BootstrapComponent;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Offcanvas Header</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.overlays.OffcanvasHeader#isCloseButton <em>Close Button</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.overlays.OffcanvasHeader#getTitle <em>Title</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.overlays.OverlaysPackage#getOffcanvasHeader()
 * @model annotation="urn:org.nasdanika:react component='Offcanvas.Header'"
 * @generated
 */
public interface OffcanvasHeader extends BootstrapComponent {
	/**
	 * Returns the value of the '<em><b>Close Button</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Close Button</em>' attribute.
	 * @see #setCloseButton(boolean)
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.overlays.OverlaysPackage#getOffcanvasHeader_CloseButton()
	 * @model unique="false"
	 * @generated
	 */
	boolean isCloseButton();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.overlays.OffcanvasHeader#isCloseButton <em>Close Button</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Close Button</em>' attribute.
	 * @see #isCloseButton()
	 * @generated
	 */
	void setCloseButton(boolean value);

	/**
	 * Returns the value of the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' containment reference.
	 * @see #setTitle(OffcanvasTitle)
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.overlays.OverlaysPackage#getOffcanvasHeader_Title()
	 * @model containment="true"
	 * @generated
	 */
	OffcanvasTitle getTitle();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.overlays.OffcanvasHeader#getTitle <em>Title</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' containment reference.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(OffcanvasTitle value);

} // OffcanvasHeader
