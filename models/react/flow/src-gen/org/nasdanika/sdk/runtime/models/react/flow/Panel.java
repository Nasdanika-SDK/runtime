/**
 */
package org.nasdanika.sdk.runtime.models.react.flow;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Panel</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Content over the flow, e.g. a title or a toolbar.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.flow.Panel#getPosition <em>Position</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.sdk.runtime.models.react.flow.FlowPackage#getPanel()
 * @model annotation="urn:org.nasdanika:react component='Panel'"
 * @generated
 */
public interface Panel extends FlowComponent {
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
	 * @see org.nasdanika.sdk.runtime.models.react.flow.FlowPackage#getPanel_Position()
	 * @model unique="false" unsettable="true"
	 * @generated
	 */
	PanelPosition getPosition();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.react.flow.Panel#getPosition <em>Position</em>}' attribute.
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
	 * Unsets the value of the '{@link org.nasdanika.sdk.runtime.models.react.flow.Panel#getPosition <em>Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPosition()
	 * @see #getPosition()
	 * @see #setPosition(PanelPosition)
	 * @generated
	 */
	void unsetPosition();

	/**
	 * Returns whether the value of the '{@link org.nasdanika.sdk.runtime.models.react.flow.Panel#getPosition <em>Position</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Position</em>' attribute is set.
	 * @see #unsetPosition()
	 * @see #getPosition()
	 * @see #setPosition(PanelPosition)
	 * @generated
	 */
	boolean isSetPosition();

} // Panel
