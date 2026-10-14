/**
 */
package org.nasdanika.sdk.runtime.models.react.flow;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mini Map</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.flow.MiniMap#getPosition <em>Position</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.flow.MiniMap#getNodeColor <em>Node Color</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.flow.MiniMap#getNodeStrokeColor <em>Node Stroke Color</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.flow.MiniMap#getMaskColor <em>Mask Color</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.flow.MiniMap#getBgColor <em>Bg Color</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.flow.MiniMap#isPannable <em>Pannable</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.flow.MiniMap#isZoomable <em>Zoomable</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.flow.MiniMap#getAriaLabel <em>Aria Label</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.sdk.runtime.models.react.flow.FlowPackage#getMiniMap()
 * @model annotation="urn:org.nasdanika:react component='MiniMap'"
 * @generated
 */
public interface MiniMap extends FlowComponent {
	/**
	 * Returns the value of the '<em><b>Position</b></em>' attribute.
	 * The literals are from the enumeration {@link org.nasdanika.sdk.runtime.models.react.flow.PanelPosition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Position</em>' attribute.
	 * @see org.nasdanika.sdk.runtime.models.react.flow.PanelPosition
	 * @see #isSetPosition()
	 * @see #unsetPosition()
	 * @see #setPosition(PanelPosition)
	 * @see org.nasdanika.sdk.runtime.models.react.flow.FlowPackage#getMiniMap_Position()
	 * @model unique="false" unsettable="true"
	 * @generated
	 */
	PanelPosition getPosition();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.react.flow.MiniMap#getPosition <em>Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position</em>' attribute.
	 * @see org.nasdanika.sdk.runtime.models.react.flow.PanelPosition
	 * @see #isSetPosition()
	 * @see #unsetPosition()
	 * @see #getPosition()
	 * @generated
	 */
	void setPosition(PanelPosition value);

	/**
	 * Unsets the value of the '{@link org.nasdanika.sdk.runtime.models.react.flow.MiniMap#getPosition <em>Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPosition()
	 * @see #getPosition()
	 * @see #setPosition(PanelPosition)
	 * @generated
	 */
	void unsetPosition();

	/**
	 * Returns whether the value of the '{@link org.nasdanika.sdk.runtime.models.react.flow.MiniMap#getPosition <em>Position</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Position</em>' attribute is set.
	 * @see #unsetPosition()
	 * @see #getPosition()
	 * @see #setPosition(PanelPosition)
	 * @generated
	 */
	boolean isSetPosition();

	/**
	 * Returns the value of the '<em><b>Node Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node Color</em>' attribute.
	 * @see #setNodeColor(String)
	 * @see org.nasdanika.sdk.runtime.models.react.flow.FlowPackage#getMiniMap_NodeColor()
	 * @model unique="false"
	 * @generated
	 */
	String getNodeColor();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.react.flow.MiniMap#getNodeColor <em>Node Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Node Color</em>' attribute.
	 * @see #getNodeColor()
	 * @generated
	 */
	void setNodeColor(String value);

	/**
	 * Returns the value of the '<em><b>Node Stroke Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node Stroke Color</em>' attribute.
	 * @see #setNodeStrokeColor(String)
	 * @see org.nasdanika.sdk.runtime.models.react.flow.FlowPackage#getMiniMap_NodeStrokeColor()
	 * @model unique="false"
	 * @generated
	 */
	String getNodeStrokeColor();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.react.flow.MiniMap#getNodeStrokeColor <em>Node Stroke Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Node Stroke Color</em>' attribute.
	 * @see #getNodeStrokeColor()
	 * @generated
	 */
	void setNodeStrokeColor(String value);

	/**
	 * Returns the value of the '<em><b>Mask Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mask Color</em>' attribute.
	 * @see #setMaskColor(String)
	 * @see org.nasdanika.sdk.runtime.models.react.flow.FlowPackage#getMiniMap_MaskColor()
	 * @model unique="false"
	 * @generated
	 */
	String getMaskColor();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.react.flow.MiniMap#getMaskColor <em>Mask Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mask Color</em>' attribute.
	 * @see #getMaskColor()
	 * @generated
	 */
	void setMaskColor(String value);

	/**
	 * Returns the value of the '<em><b>Bg Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bg Color</em>' attribute.
	 * @see #setBgColor(String)
	 * @see org.nasdanika.sdk.runtime.models.react.flow.FlowPackage#getMiniMap_BgColor()
	 * @model unique="false"
	 * @generated
	 */
	String getBgColor();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.react.flow.MiniMap#getBgColor <em>Bg Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bg Color</em>' attribute.
	 * @see #getBgColor()
	 * @generated
	 */
	void setBgColor(String value);

	/**
	 * Returns the value of the '<em><b>Pannable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pannable</em>' attribute.
	 * @see #isSetPannable()
	 * @see #unsetPannable()
	 * @see #setPannable(boolean)
	 * @see org.nasdanika.sdk.runtime.models.react.flow.FlowPackage#getMiniMap_Pannable()
	 * @model unique="false" unsettable="true"
	 * @generated
	 */
	boolean isPannable();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.react.flow.MiniMap#isPannable <em>Pannable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pannable</em>' attribute.
	 * @see #isSetPannable()
	 * @see #unsetPannable()
	 * @see #isPannable()
	 * @generated
	 */
	void setPannable(boolean value);

	/**
	 * Unsets the value of the '{@link org.nasdanika.sdk.runtime.models.react.flow.MiniMap#isPannable <em>Pannable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPannable()
	 * @see #isPannable()
	 * @see #setPannable(boolean)
	 * @generated
	 */
	void unsetPannable();

	/**
	 * Returns whether the value of the '{@link org.nasdanika.sdk.runtime.models.react.flow.MiniMap#isPannable <em>Pannable</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Pannable</em>' attribute is set.
	 * @see #unsetPannable()
	 * @see #isPannable()
	 * @see #setPannable(boolean)
	 * @generated
	 */
	boolean isSetPannable();

	/**
	 * Returns the value of the '<em><b>Zoomable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Zoomable</em>' attribute.
	 * @see #isSetZoomable()
	 * @see #unsetZoomable()
	 * @see #setZoomable(boolean)
	 * @see org.nasdanika.sdk.runtime.models.react.flow.FlowPackage#getMiniMap_Zoomable()
	 * @model unique="false" unsettable="true"
	 * @generated
	 */
	boolean isZoomable();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.react.flow.MiniMap#isZoomable <em>Zoomable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Zoomable</em>' attribute.
	 * @see #isSetZoomable()
	 * @see #unsetZoomable()
	 * @see #isZoomable()
	 * @generated
	 */
	void setZoomable(boolean value);

	/**
	 * Unsets the value of the '{@link org.nasdanika.sdk.runtime.models.react.flow.MiniMap#isZoomable <em>Zoomable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetZoomable()
	 * @see #isZoomable()
	 * @see #setZoomable(boolean)
	 * @generated
	 */
	void unsetZoomable();

	/**
	 * Returns whether the value of the '{@link org.nasdanika.sdk.runtime.models.react.flow.MiniMap#isZoomable <em>Zoomable</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Zoomable</em>' attribute is set.
	 * @see #unsetZoomable()
	 * @see #isZoomable()
	 * @see #setZoomable(boolean)
	 * @generated
	 */
	boolean isSetZoomable();

	/**
	 * Returns the value of the '<em><b>Aria Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aria Label</em>' attribute.
	 * @see #setAriaLabel(String)
	 * @see org.nasdanika.sdk.runtime.models.react.flow.FlowPackage#getMiniMap_AriaLabel()
	 * @model unique="false"
	 * @generated
	 */
	String getAriaLabel();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.react.flow.MiniMap#getAriaLabel <em>Aria Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aria Label</em>' attribute.
	 * @see #getAriaLabel()
	 * @generated
	 */
	void setAriaLabel(String value);

} // MiniMap
