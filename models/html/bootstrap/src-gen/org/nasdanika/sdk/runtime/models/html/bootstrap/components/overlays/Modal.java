/**
 */
package org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays;

import org.nasdanika.sdk.runtime.models.html.bootstrap.BootstrapElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Modal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * modal, modal-dialog and modal-content around the header, body and footer.
 * The id of the modal is generated if not set.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.Modal#getSize <em>Size</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.Modal#isCentered <em>Centered</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.Modal#isScrollable <em>Scrollable</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.Modal#isFullscreen <em>Fullscreen</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.Modal#getFullscreenBelow <em>Fullscreen Below</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.Modal#isStaticBackdrop <em>Static Backdrop</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.Modal#isKeyboard <em>Keyboard</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.Modal#getHeader <em>Header</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.Modal#getBody <em>Body</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.Modal#getFooter <em>Footer</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.OverlaysPackage#getModal()
 * @model annotation="urn:org.nasdanika:html tag='div' classes='modal fade' attributes='tabindex=-1;aria-hidden=true'"
 * @generated
 */
public interface Modal extends BootstrapElement {
	/**
	 * Returns the value of the '<em><b>Size</b></em>' attribute.
	 * The literals are from the enumeration {@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.ModalSize}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size</em>' attribute.
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.ModalSize
	 * @see #isSetSize()
	 * @see #unsetSize()
	 * @see #setSize(ModalSize)
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.OverlaysPackage#getModal_Size()
	 * @model unique="false" unsettable="true"
	 *        annotation="urn:org.nasdanika:html logical='true'"
	 * @generated
	 */
	ModalSize getSize();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.Modal#getSize <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size</em>' attribute.
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.ModalSize
	 * @see #isSetSize()
	 * @see #unsetSize()
	 * @see #getSize()
	 * @generated
	 */
	void setSize(ModalSize value);

	/**
	 * Unsets the value of the '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.Modal#getSize <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSize()
	 * @see #getSize()
	 * @see #setSize(ModalSize)
	 * @generated
	 */
	void unsetSize();

	/**
	 * Returns whether the value of the '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.Modal#getSize <em>Size</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Size</em>' attribute is set.
	 * @see #unsetSize()
	 * @see #getSize()
	 * @see #setSize(ModalSize)
	 * @generated
	 */
	boolean isSetSize();

	/**
	 * Returns the value of the '<em><b>Centered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Centered</em>' attribute.
	 * @see #setCentered(boolean)
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.OverlaysPackage#getModal_Centered()
	 * @model unique="false"
	 *        annotation="urn:org.nasdanika:html logical='true'"
	 * @generated
	 */
	boolean isCentered();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.Modal#isCentered <em>Centered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Centered</em>' attribute.
	 * @see #isCentered()
	 * @generated
	 */
	void setCentered(boolean value);

	/**
	 * Returns the value of the '<em><b>Scrollable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scrollable</em>' attribute.
	 * @see #setScrollable(boolean)
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.OverlaysPackage#getModal_Scrollable()
	 * @model unique="false"
	 *        annotation="urn:org.nasdanika:html logical='true'"
	 * @generated
	 */
	boolean isScrollable();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.Modal#isScrollable <em>Scrollable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scrollable</em>' attribute.
	 * @see #isScrollable()
	 * @generated
	 */
	void setScrollable(boolean value);

	/**
	 * Returns the value of the '<em><b>Fullscreen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fullscreen</em>' attribute.
	 * @see #setFullscreen(boolean)
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.OverlaysPackage#getModal_Fullscreen()
	 * @model unique="false"
	 *        annotation="urn:org.nasdanika:html logical='true'"
	 * @generated
	 */
	boolean isFullscreen();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.Modal#isFullscreen <em>Fullscreen</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fullscreen</em>' attribute.
	 * @see #isFullscreen()
	 * @generated
	 */
	void setFullscreen(boolean value);

	/**
	 * Returns the value of the '<em><b>Fullscreen Below</b></em>' attribute.
	 * The literals are from the enumeration {@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.Fullscreen}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Fullscreen below the breakpoint. Wins over fullscreen.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Fullscreen Below</em>' attribute.
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.Fullscreen
	 * @see #isSetFullscreenBelow()
	 * @see #unsetFullscreenBelow()
	 * @see #setFullscreenBelow(Fullscreen)
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.OverlaysPackage#getModal_FullscreenBelow()
	 * @model unique="false" unsettable="true"
	 *        annotation="urn:org.nasdanika:html logical='true'"
	 * @generated
	 */
	Fullscreen getFullscreenBelow();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.Modal#getFullscreenBelow <em>Fullscreen Below</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fullscreen Below</em>' attribute.
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.Fullscreen
	 * @see #isSetFullscreenBelow()
	 * @see #unsetFullscreenBelow()
	 * @see #getFullscreenBelow()
	 * @generated
	 */
	void setFullscreenBelow(Fullscreen value);

	/**
	 * Unsets the value of the '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.Modal#getFullscreenBelow <em>Fullscreen Below</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFullscreenBelow()
	 * @see #getFullscreenBelow()
	 * @see #setFullscreenBelow(Fullscreen)
	 * @generated
	 */
	void unsetFullscreenBelow();

	/**
	 * Returns whether the value of the '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.Modal#getFullscreenBelow <em>Fullscreen Below</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Fullscreen Below</em>' attribute is set.
	 * @see #unsetFullscreenBelow()
	 * @see #getFullscreenBelow()
	 * @see #setFullscreenBelow(Fullscreen)
	 * @generated
	 */
	boolean isSetFullscreenBelow();

	/**
	 * Returns the value of the '<em><b>Static Backdrop</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Clicking the backdrop does not close the modal
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Static Backdrop</em>' attribute.
	 * @see #setStaticBackdrop(boolean)
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.OverlaysPackage#getModal_StaticBackdrop()
	 * @model unique="false"
	 *        annotation="urn:org.nasdanika:html logical='true'"
	 * @generated
	 */
	boolean isStaticBackdrop();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.Modal#isStaticBackdrop <em>Static Backdrop</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Static Backdrop</em>' attribute.
	 * @see #isStaticBackdrop()
	 * @generated
	 */
	void setStaticBackdrop(boolean value);

	/**
	 * Returns the value of the '<em><b>Keyboard</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Escape closes the modal
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Keyboard</em>' attribute.
	 * @see #isSetKeyboard()
	 * @see #unsetKeyboard()
	 * @see #setKeyboard(boolean)
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.OverlaysPackage#getModal_Keyboard()
	 * @model unique="false" unsettable="true"
	 *        annotation="urn:org.nasdanika:html logical='true'"
	 * @generated
	 */
	boolean isKeyboard();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.Modal#isKeyboard <em>Keyboard</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Keyboard</em>' attribute.
	 * @see #isSetKeyboard()
	 * @see #unsetKeyboard()
	 * @see #isKeyboard()
	 * @generated
	 */
	void setKeyboard(boolean value);

	/**
	 * Unsets the value of the '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.Modal#isKeyboard <em>Keyboard</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetKeyboard()
	 * @see #isKeyboard()
	 * @see #setKeyboard(boolean)
	 * @generated
	 */
	void unsetKeyboard();

	/**
	 * Returns whether the value of the '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.Modal#isKeyboard <em>Keyboard</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Keyboard</em>' attribute is set.
	 * @see #unsetKeyboard()
	 * @see #isKeyboard()
	 * @see #setKeyboard(boolean)
	 * @generated
	 */
	boolean isSetKeyboard();

	/**
	 * Returns the value of the '<em><b>Header</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Header</em>' containment reference.
	 * @see #setHeader(ModalHeader)
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.OverlaysPackage#getModal_Header()
	 * @model containment="true"
	 * @generated
	 */
	ModalHeader getHeader();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.Modal#getHeader <em>Header</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Header</em>' containment reference.
	 * @see #getHeader()
	 * @generated
	 */
	void setHeader(ModalHeader value);

	/**
	 * Returns the value of the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body</em>' containment reference.
	 * @see #setBody(ModalBody)
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.OverlaysPackage#getModal_Body()
	 * @model containment="true"
	 * @generated
	 */
	ModalBody getBody();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.Modal#getBody <em>Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body</em>' containment reference.
	 * @see #getBody()
	 * @generated
	 */
	void setBody(ModalBody value);

	/**
	 * Returns the value of the '<em><b>Footer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Footer</em>' containment reference.
	 * @see #setFooter(ModalFooter)
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.OverlaysPackage#getModal_Footer()
	 * @model containment="true"
	 * @generated
	 */
	ModalFooter getFooter();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.Modal#getFooter <em>Footer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Footer</em>' containment reference.
	 * @see #getFooter()
	 * @generated
	 */
	void setFooter(ModalFooter value);

} // Modal
