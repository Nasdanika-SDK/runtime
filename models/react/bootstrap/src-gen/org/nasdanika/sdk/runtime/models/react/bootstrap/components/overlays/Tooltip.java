/**
 */
package org.nasdanika.sdk.runtime.models.react.bootstrap.components.overlays;

import org.nasdanika.sdk.runtime.models.react.bootstrap.BootstrapComponent;
import org.nasdanika.sdk.runtime.models.react.bootstrap.TextContent;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tooltip</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.overlays.Tooltip#getPlacement <em>Placement</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.overlays.OverlaysPackage#getTooltip()
 * @model annotation="urn:org.nasdanika:react component='Tooltip'"
 * @generated
 */
public interface Tooltip extends BootstrapComponent, TextContent {
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
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.overlays.OverlaysPackage#getTooltip_Placement()
	 * @model unique="false" unsettable="true"
	 * @generated
	 */
	Placement getPlacement();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.overlays.Tooltip#getPlacement <em>Placement</em>}' attribute.
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
	 * Unsets the value of the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.overlays.Tooltip#getPlacement <em>Placement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPlacement()
	 * @see #getPlacement()
	 * @see #setPlacement(Placement)
	 * @generated
	 */
	void unsetPlacement();

	/**
	 * Returns whether the value of the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.overlays.Tooltip#getPlacement <em>Placement</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Placement</em>' attribute is set.
	 * @see #unsetPlacement()
	 * @see #getPlacement()
	 * @see #setPlacement(Placement)
	 * @generated
	 */
	boolean isSetPlacement();

} // Tooltip
