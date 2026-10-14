/**
 */
package org.nasdanika.sdk.runtime.models.react.flow;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Controls</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.flow.Controls#isShowZoom <em>Show Zoom</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.flow.Controls#isShowFitView <em>Show Fit View</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.flow.Controls#isShowInteractive <em>Show Interactive</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.flow.Controls#getPosition <em>Position</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.flow.Controls#getOrientation <em>Orientation</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.sdk.runtime.models.react.flow.FlowPackage#getControls()
 * @model annotation="urn:org.nasdanika:react component='Controls'"
 * @generated
 */
public interface Controls extends FlowComponent {
	/**
	 * Returns the value of the '<em><b>Show Zoom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Show Zoom</em>' attribute.
	 * @see #isSetShowZoom()
	 * @see #unsetShowZoom()
	 * @see #setShowZoom(boolean)
	 * @see org.nasdanika.sdk.runtime.models.react.flow.FlowPackage#getControls_ShowZoom()
	 * @model unique="false" unsettable="true"
	 * @generated
	 */
	boolean isShowZoom();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.react.flow.Controls#isShowZoom <em>Show Zoom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Show Zoom</em>' attribute.
	 * @see #isSetShowZoom()
	 * @see #unsetShowZoom()
	 * @see #isShowZoom()
	 * @generated
	 */
	void setShowZoom(boolean value);

	/**
	 * Unsets the value of the '{@link org.nasdanika.sdk.runtime.models.react.flow.Controls#isShowZoom <em>Show Zoom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetShowZoom()
	 * @see #isShowZoom()
	 * @see #setShowZoom(boolean)
	 * @generated
	 */
	void unsetShowZoom();

	/**
	 * Returns whether the value of the '{@link org.nasdanika.sdk.runtime.models.react.flow.Controls#isShowZoom <em>Show Zoom</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Show Zoom</em>' attribute is set.
	 * @see #unsetShowZoom()
	 * @see #isShowZoom()
	 * @see #setShowZoom(boolean)
	 * @generated
	 */
	boolean isSetShowZoom();

	/**
	 * Returns the value of the '<em><b>Show Fit View</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Show Fit View</em>' attribute.
	 * @see #isSetShowFitView()
	 * @see #unsetShowFitView()
	 * @see #setShowFitView(boolean)
	 * @see org.nasdanika.sdk.runtime.models.react.flow.FlowPackage#getControls_ShowFitView()
	 * @model unique="false" unsettable="true"
	 * @generated
	 */
	boolean isShowFitView();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.react.flow.Controls#isShowFitView <em>Show Fit View</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Show Fit View</em>' attribute.
	 * @see #isSetShowFitView()
	 * @see #unsetShowFitView()
	 * @see #isShowFitView()
	 * @generated
	 */
	void setShowFitView(boolean value);

	/**
	 * Unsets the value of the '{@link org.nasdanika.sdk.runtime.models.react.flow.Controls#isShowFitView <em>Show Fit View</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetShowFitView()
	 * @see #isShowFitView()
	 * @see #setShowFitView(boolean)
	 * @generated
	 */
	void unsetShowFitView();

	/**
	 * Returns whether the value of the '{@link org.nasdanika.sdk.runtime.models.react.flow.Controls#isShowFitView <em>Show Fit View</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Show Fit View</em>' attribute is set.
	 * @see #unsetShowFitView()
	 * @see #isShowFitView()
	 * @see #setShowFitView(boolean)
	 * @generated
	 */
	boolean isSetShowFitView();

	/**
	 * Returns the value of the '<em><b>Show Interactive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Show Interactive</em>' attribute.
	 * @see #isSetShowInteractive()
	 * @see #unsetShowInteractive()
	 * @see #setShowInteractive(boolean)
	 * @see org.nasdanika.sdk.runtime.models.react.flow.FlowPackage#getControls_ShowInteractive()
	 * @model unique="false" unsettable="true"
	 * @generated
	 */
	boolean isShowInteractive();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.react.flow.Controls#isShowInteractive <em>Show Interactive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Show Interactive</em>' attribute.
	 * @see #isSetShowInteractive()
	 * @see #unsetShowInteractive()
	 * @see #isShowInteractive()
	 * @generated
	 */
	void setShowInteractive(boolean value);

	/**
	 * Unsets the value of the '{@link org.nasdanika.sdk.runtime.models.react.flow.Controls#isShowInteractive <em>Show Interactive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetShowInteractive()
	 * @see #isShowInteractive()
	 * @see #setShowInteractive(boolean)
	 * @generated
	 */
	void unsetShowInteractive();

	/**
	 * Returns whether the value of the '{@link org.nasdanika.sdk.runtime.models.react.flow.Controls#isShowInteractive <em>Show Interactive</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Show Interactive</em>' attribute is set.
	 * @see #unsetShowInteractive()
	 * @see #isShowInteractive()
	 * @see #setShowInteractive(boolean)
	 * @generated
	 */
	boolean isSetShowInteractive();

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
	 * @see org.nasdanika.sdk.runtime.models.react.flow.FlowPackage#getControls_Position()
	 * @model unique="false" unsettable="true"
	 * @generated
	 */
	PanelPosition getPosition();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.react.flow.Controls#getPosition <em>Position</em>}' attribute.
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
	 * Unsets the value of the '{@link org.nasdanika.sdk.runtime.models.react.flow.Controls#getPosition <em>Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPosition()
	 * @see #getPosition()
	 * @see #setPosition(PanelPosition)
	 * @generated
	 */
	void unsetPosition();

	/**
	 * Returns whether the value of the '{@link org.nasdanika.sdk.runtime.models.react.flow.Controls#getPosition <em>Position</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Orientation</b></em>' attribute.
	 * The literals are from the enumeration {@link org.nasdanika.sdk.runtime.models.react.flow.Orientation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Orientation</em>' attribute.
	 * @see org.nasdanika.sdk.runtime.models.react.flow.Orientation
	 * @see #isSetOrientation()
	 * @see #unsetOrientation()
	 * @see #setOrientation(Orientation)
	 * @see org.nasdanika.sdk.runtime.models.react.flow.FlowPackage#getControls_Orientation()
	 * @model unique="false" unsettable="true"
	 * @generated
	 */
	Orientation getOrientation();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.react.flow.Controls#getOrientation <em>Orientation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Orientation</em>' attribute.
	 * @see org.nasdanika.sdk.runtime.models.react.flow.Orientation
	 * @see #isSetOrientation()
	 * @see #unsetOrientation()
	 * @see #getOrientation()
	 * @generated
	 */
	void setOrientation(Orientation value);

	/**
	 * Unsets the value of the '{@link org.nasdanika.sdk.runtime.models.react.flow.Controls#getOrientation <em>Orientation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetOrientation()
	 * @see #getOrientation()
	 * @see #setOrientation(Orientation)
	 * @generated
	 */
	void unsetOrientation();

	/**
	 * Returns whether the value of the '{@link org.nasdanika.sdk.runtime.models.react.flow.Controls#getOrientation <em>Orientation</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Orientation</em>' attribute is set.
	 * @see #unsetOrientation()
	 * @see #getOrientation()
	 * @see #setOrientation(Orientation)
	 * @generated
	 */
	boolean isSetOrientation();

} // Controls
