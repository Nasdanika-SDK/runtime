/**
 */
package org.nasdanika.sdk.runtime.models.react.bootstrap.components.overlays;

import org.nasdanika.sdk.runtime.models.react.bootstrap.BootstrapComponent;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Popover</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.overlays.Popover#getPlacement <em>Placement</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.overlays.Popover#getHeader <em>Header</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.overlays.Popover#getBody <em>Body</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.overlays.OverlaysPackage#getPopover()
 * @model annotation="urn:org.nasdanika:react component='Popover'"
 * @generated
 */
public interface Popover extends BootstrapComponent {
	/**
	 * Returns the value of the '<em><b>Placement</b></em>' attribute.
	 * The literals are from the enumeration {@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.overlays.Placement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Placement</em>' attribute.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.overlays.Placement
	 * @see #isSetPlacement()
	 * @see #unsetPlacement()
	 * @see #setPlacement(Placement)
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.overlays.OverlaysPackage#getPopover_Placement()
	 * @model unique="false" unsettable="true"
	 * @generated
	 */
	Placement getPlacement();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.overlays.Popover#getPlacement <em>Placement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Placement</em>' attribute.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.overlays.Placement
	 * @see #isSetPlacement()
	 * @see #unsetPlacement()
	 * @see #getPlacement()
	 * @generated
	 */
	void setPlacement(Placement value);

	/**
	 * Unsets the value of the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.overlays.Popover#getPlacement <em>Placement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPlacement()
	 * @see #getPlacement()
	 * @see #setPlacement(Placement)
	 * @generated
	 */
	void unsetPlacement();

	/**
	 * Returns whether the value of the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.overlays.Popover#getPlacement <em>Placement</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Placement</em>' attribute is set.
	 * @see #unsetPlacement()
	 * @see #getPlacement()
	 * @see #setPlacement(Placement)
	 * @generated
	 */
	boolean isSetPlacement();

	/**
	 * Returns the value of the '<em><b>Header</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Header</em>' containment reference.
	 * @see #setHeader(PopoverHeader)
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.overlays.OverlaysPackage#getPopover_Header()
	 * @model containment="true"
	 * @generated
	 */
	PopoverHeader getHeader();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.overlays.Popover#getHeader <em>Header</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Header</em>' containment reference.
	 * @see #getHeader()
	 * @generated
	 */
	void setHeader(PopoverHeader value);

	/**
	 * Returns the value of the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body</em>' containment reference.
	 * @see #setBody(PopoverBody)
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.overlays.OverlaysPackage#getPopover_Body()
	 * @model containment="true"
	 * @generated
	 */
	PopoverBody getBody();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.overlays.Popover#getBody <em>Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body</em>' containment reference.
	 * @see #getBody()
	 * @generated
	 */
	void setBody(PopoverBody value);

} // Popover
