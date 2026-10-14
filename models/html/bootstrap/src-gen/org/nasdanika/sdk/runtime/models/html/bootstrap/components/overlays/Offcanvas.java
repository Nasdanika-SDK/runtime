/**
 */
package org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays;

import org.nasdanika.sdk.runtime.models.html.bootstrap.BootstrapElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Offcanvas</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The id of the offcanvas is generated if not set.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.Offcanvas#getPlacement <em>Placement</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.Offcanvas#isBackdrop <em>Backdrop</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.Offcanvas#isScroll <em>Scroll</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.Offcanvas#getHeader <em>Header</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.Offcanvas#getBody <em>Body</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.OverlaysPackage#getOffcanvas()
 * @model annotation="urn:org.nasdanika:html tag='div' classes='offcanvas' attributes='tabindex=-1'"
 * @generated
 */
public interface Offcanvas extends BootstrapElement {
	/**
	 * Returns the value of the '<em><b>Placement</b></em>' attribute.
	 * The literals are from the enumeration {@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.OffcanvasPlacement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Placement</em>' attribute.
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.OffcanvasPlacement
	 * @see #isSetPlacement()
	 * @see #unsetPlacement()
	 * @see #setPlacement(OffcanvasPlacement)
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.OverlaysPackage#getOffcanvas_Placement()
	 * @model unique="false" unsettable="true"
	 *        annotation="urn:org.nasdanika:html classes='offcanvas-{}' default='start'"
	 * @generated
	 */
	OffcanvasPlacement getPlacement();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.Offcanvas#getPlacement <em>Placement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Placement</em>' attribute.
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.OffcanvasPlacement
	 * @see #isSetPlacement()
	 * @see #unsetPlacement()
	 * @see #getPlacement()
	 * @generated
	 */
	void setPlacement(OffcanvasPlacement value);

	/**
	 * Unsets the value of the '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.Offcanvas#getPlacement <em>Placement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPlacement()
	 * @see #getPlacement()
	 * @see #setPlacement(OffcanvasPlacement)
	 * @generated
	 */
	void unsetPlacement();

	/**
	 * Returns whether the value of the '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.Offcanvas#getPlacement <em>Placement</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Placement</em>' attribute is set.
	 * @see #unsetPlacement()
	 * @see #getPlacement()
	 * @see #setPlacement(OffcanvasPlacement)
	 * @generated
	 */
	boolean isSetPlacement();

	/**
	 * Returns the value of the '<em><b>Backdrop</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Backdrop</em>' attribute.
	 * @see #isSetBackdrop()
	 * @see #unsetBackdrop()
	 * @see #setBackdrop(boolean)
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.OverlaysPackage#getOffcanvas_Backdrop()
	 * @model unique="false" unsettable="true"
	 *        annotation="urn:org.nasdanika:html logical='true'"
	 * @generated
	 */
	boolean isBackdrop();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.Offcanvas#isBackdrop <em>Backdrop</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Backdrop</em>' attribute.
	 * @see #isSetBackdrop()
	 * @see #unsetBackdrop()
	 * @see #isBackdrop()
	 * @generated
	 */
	void setBackdrop(boolean value);

	/**
	 * Unsets the value of the '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.Offcanvas#isBackdrop <em>Backdrop</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetBackdrop()
	 * @see #isBackdrop()
	 * @see #setBackdrop(boolean)
	 * @generated
	 */
	void unsetBackdrop();

	/**
	 * Returns whether the value of the '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.Offcanvas#isBackdrop <em>Backdrop</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Backdrop</em>' attribute is set.
	 * @see #unsetBackdrop()
	 * @see #isBackdrop()
	 * @see #setBackdrop(boolean)
	 * @generated
	 */
	boolean isSetBackdrop();

	/**
	 * Returns the value of the '<em><b>Scroll</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Body scrolling while the offcanvas is open
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Scroll</em>' attribute.
	 * @see #setScroll(boolean)
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.OverlaysPackage#getOffcanvas_Scroll()
	 * @model unique="false"
	 *        annotation="urn:org.nasdanika:html logical='true'"
	 * @generated
	 */
	boolean isScroll();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.Offcanvas#isScroll <em>Scroll</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scroll</em>' attribute.
	 * @see #isScroll()
	 * @generated
	 */
	void setScroll(boolean value);

	/**
	 * Returns the value of the '<em><b>Header</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Header</em>' containment reference.
	 * @see #setHeader(OffcanvasHeader)
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.OverlaysPackage#getOffcanvas_Header()
	 * @model containment="true"
	 * @generated
	 */
	OffcanvasHeader getHeader();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.Offcanvas#getHeader <em>Header</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Header</em>' containment reference.
	 * @see #getHeader()
	 * @generated
	 */
	void setHeader(OffcanvasHeader value);

	/**
	 * Returns the value of the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body</em>' containment reference.
	 * @see #setBody(OffcanvasBody)
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.OverlaysPackage#getOffcanvas_Body()
	 * @model containment="true"
	 * @generated
	 */
	OffcanvasBody getBody();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.Offcanvas#getBody <em>Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body</em>' containment reference.
	 * @see #getBody()
	 * @generated
	 */
	void setBody(OffcanvasBody value);

} // Offcanvas
