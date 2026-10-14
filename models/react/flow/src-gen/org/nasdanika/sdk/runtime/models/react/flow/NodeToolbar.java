/**
 */
package org.nasdanika.sdk.runtime.models.react.flow;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node Toolbar</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Toolbar of a custom node, shown when the node is selected unless isVisible is set.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.flow.NodeToolbar#getPosition <em>Position</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.flow.NodeToolbar#isIsVisible <em>Is Visible</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.flow.NodeToolbar#getOffset <em>Offset</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.flow.NodeToolbar#getAlign <em>Align</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.sdk.runtime.models.react.flow.FlowPackage#getNodeToolbar()
 * @model annotation="urn:org.nasdanika:react component='NodeToolbar'"
 * @generated
 */
public interface NodeToolbar extends FlowComponent {
	/**
	 * Returns the value of the '<em><b>Position</b></em>' attribute.
	 * The literals are from the enumeration {@link org.nasdanika.sdk.runtime.models.react.flow.HandlePosition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Position</em>' attribute.
	 * @see org.nasdanika.sdk.runtime.models.react.flow.HandlePosition
	 * @see #isSetPosition()
	 * @see #unsetPosition()
	 * @see #setPosition(HandlePosition)
	 * @see org.nasdanika.sdk.runtime.models.react.flow.FlowPackage#getNodeToolbar_Position()
	 * @model unique="false" unsettable="true"
	 *        annotation="urn:org.nasdanika:react enum='Position' module='@xyflow/react'"
	 * @generated
	 */
	HandlePosition getPosition();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.react.flow.NodeToolbar#getPosition <em>Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position</em>' attribute.
	 * @see org.nasdanika.sdk.runtime.models.react.flow.HandlePosition
	 * @see #isSetPosition()
	 * @see #unsetPosition()
	 * @see #getPosition()
	 * @generated
	 */
	void setPosition(HandlePosition value);

	/**
	 * Unsets the value of the '{@link org.nasdanika.sdk.runtime.models.react.flow.NodeToolbar#getPosition <em>Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPosition()
	 * @see #getPosition()
	 * @see #setPosition(HandlePosition)
	 * @generated
	 */
	void unsetPosition();

	/**
	 * Returns whether the value of the '{@link org.nasdanika.sdk.runtime.models.react.flow.NodeToolbar#getPosition <em>Position</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Position</em>' attribute is set.
	 * @see #unsetPosition()
	 * @see #getPosition()
	 * @see #setPosition(HandlePosition)
	 * @generated
	 */
	boolean isSetPosition();

	/**
	 * Returns the value of the '<em><b>Is Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Visible</em>' attribute.
	 * @see #isSetIsVisible()
	 * @see #unsetIsVisible()
	 * @see #setIsVisible(boolean)
	 * @see org.nasdanika.sdk.runtime.models.react.flow.FlowPackage#getNodeToolbar_IsVisible()
	 * @model unique="false" unsettable="true"
	 * @generated
	 */
	boolean isIsVisible();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.react.flow.NodeToolbar#isIsVisible <em>Is Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Visible</em>' attribute.
	 * @see #isSetIsVisible()
	 * @see #unsetIsVisible()
	 * @see #isIsVisible()
	 * @generated
	 */
	void setIsVisible(boolean value);

	/**
	 * Unsets the value of the '{@link org.nasdanika.sdk.runtime.models.react.flow.NodeToolbar#isIsVisible <em>Is Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsVisible()
	 * @see #isIsVisible()
	 * @see #setIsVisible(boolean)
	 * @generated
	 */
	void unsetIsVisible();

	/**
	 * Returns whether the value of the '{@link org.nasdanika.sdk.runtime.models.react.flow.NodeToolbar#isIsVisible <em>Is Visible</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Is Visible</em>' attribute is set.
	 * @see #unsetIsVisible()
	 * @see #isIsVisible()
	 * @see #setIsVisible(boolean)
	 * @generated
	 */
	boolean isSetIsVisible();

	/**
	 * Returns the value of the '<em><b>Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Offset</em>' attribute.
	 * @see #isSetOffset()
	 * @see #unsetOffset()
	 * @see #setOffset(double)
	 * @see org.nasdanika.sdk.runtime.models.react.flow.FlowPackage#getNodeToolbar_Offset()
	 * @model unique="false" unsettable="true"
	 * @generated
	 */
	double getOffset();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.react.flow.NodeToolbar#getOffset <em>Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Offset</em>' attribute.
	 * @see #isSetOffset()
	 * @see #unsetOffset()
	 * @see #getOffset()
	 * @generated
	 */
	void setOffset(double value);

	/**
	 * Unsets the value of the '{@link org.nasdanika.sdk.runtime.models.react.flow.NodeToolbar#getOffset <em>Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetOffset()
	 * @see #getOffset()
	 * @see #setOffset(double)
	 * @generated
	 */
	void unsetOffset();

	/**
	 * Returns whether the value of the '{@link org.nasdanika.sdk.runtime.models.react.flow.NodeToolbar#getOffset <em>Offset</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Offset</em>' attribute is set.
	 * @see #unsetOffset()
	 * @see #getOffset()
	 * @see #setOffset(double)
	 * @generated
	 */
	boolean isSetOffset();

	/**
	 * Returns the value of the '<em><b>Align</b></em>' attribute.
	 * The literals are from the enumeration {@link org.nasdanika.sdk.runtime.models.react.flow.Align}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Align</em>' attribute.
	 * @see org.nasdanika.sdk.runtime.models.react.flow.Align
	 * @see #isSetAlign()
	 * @see #unsetAlign()
	 * @see #setAlign(Align)
	 * @see org.nasdanika.sdk.runtime.models.react.flow.FlowPackage#getNodeToolbar_Align()
	 * @model unique="false" unsettable="true"
	 * @generated
	 */
	Align getAlign();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.react.flow.NodeToolbar#getAlign <em>Align</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Align</em>' attribute.
	 * @see org.nasdanika.sdk.runtime.models.react.flow.Align
	 * @see #isSetAlign()
	 * @see #unsetAlign()
	 * @see #getAlign()
	 * @generated
	 */
	void setAlign(Align value);

	/**
	 * Unsets the value of the '{@link org.nasdanika.sdk.runtime.models.react.flow.NodeToolbar#getAlign <em>Align</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAlign()
	 * @see #getAlign()
	 * @see #setAlign(Align)
	 * @generated
	 */
	void unsetAlign();

	/**
	 * Returns whether the value of the '{@link org.nasdanika.sdk.runtime.models.react.flow.NodeToolbar#getAlign <em>Align</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Align</em>' attribute is set.
	 * @see #unsetAlign()
	 * @see #getAlign()
	 * @see #setAlign(Align)
	 * @generated
	 */
	boolean isSetAlign();

} // NodeToolbar
