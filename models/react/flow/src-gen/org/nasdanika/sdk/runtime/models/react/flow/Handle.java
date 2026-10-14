/**
 */
package org.nasdanika.sdk.runtime.models.react.flow;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Handle</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Connection point of a custom node.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.flow.Handle#getHandleType <em>Handle Type</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.flow.Handle#getPosition <em>Position</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.flow.Handle#getHandleId <em>Handle Id</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.flow.Handle#isIsConnectable <em>Is Connectable</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.sdk.runtime.models.react.flow.FlowPackage#getHandle()
 * @model annotation="urn:org.nasdanika:react component='Handle'"
 * @generated
 */
public interface Handle extends FlowComponent {
	/**
	 * Returns the value of the '<em><b>Handle Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.nasdanika.sdk.runtime.models.react.flow.HandleType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Handle Type</em>' attribute.
	 * @see org.nasdanika.sdk.runtime.models.react.flow.HandleType
	 * @see #isSetHandleType()
	 * @see #unsetHandleType()
	 * @see #setHandleType(HandleType)
	 * @see org.nasdanika.sdk.runtime.models.react.flow.FlowPackage#getHandle_HandleType()
	 * @model unique="false" unsettable="true"
	 *        annotation="urn:org.nasdanika:react prop='type' required='true'"
	 * @generated
	 */
	HandleType getHandleType();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.react.flow.Handle#getHandleType <em>Handle Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Handle Type</em>' attribute.
	 * @see org.nasdanika.sdk.runtime.models.react.flow.HandleType
	 * @see #isSetHandleType()
	 * @see #unsetHandleType()
	 * @see #getHandleType()
	 * @generated
	 */
	void setHandleType(HandleType value);

	/**
	 * Unsets the value of the '{@link org.nasdanika.sdk.runtime.models.react.flow.Handle#getHandleType <em>Handle Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetHandleType()
	 * @see #getHandleType()
	 * @see #setHandleType(HandleType)
	 * @generated
	 */
	void unsetHandleType();

	/**
	 * Returns whether the value of the '{@link org.nasdanika.sdk.runtime.models.react.flow.Handle#getHandleType <em>Handle Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Handle Type</em>' attribute is set.
	 * @see #unsetHandleType()
	 * @see #getHandleType()
	 * @see #setHandleType(HandleType)
	 * @generated
	 */
	boolean isSetHandleType();

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
	 * @see org.nasdanika.sdk.runtime.models.react.flow.FlowPackage#getHandle_Position()
	 * @model unique="false" unsettable="true"
	 *        annotation="urn:org.nasdanika:react enum='Position' module='@xyflow/react' required='true'"
	 * @generated
	 */
	HandlePosition getPosition();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.react.flow.Handle#getPosition <em>Position</em>}' attribute.
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
	 * Unsets the value of the '{@link org.nasdanika.sdk.runtime.models.react.flow.Handle#getPosition <em>Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPosition()
	 * @see #getPosition()
	 * @see #setPosition(HandlePosition)
	 * @generated
	 */
	void unsetPosition();

	/**
	 * Returns whether the value of the '{@link org.nasdanika.sdk.runtime.models.react.flow.Handle#getPosition <em>Position</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Handle Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Distinguishes several handles of a type
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Handle Id</em>' attribute.
	 * @see #setHandleId(String)
	 * @see org.nasdanika.sdk.runtime.models.react.flow.FlowPackage#getHandle_HandleId()
	 * @model unique="false"
	 *        annotation="urn:org.nasdanika:react prop='id'"
	 * @generated
	 */
	String getHandleId();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.react.flow.Handle#getHandleId <em>Handle Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Handle Id</em>' attribute.
	 * @see #getHandleId()
	 * @generated
	 */
	void setHandleId(String value);

	/**
	 * Returns the value of the '<em><b>Is Connectable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Connectable</em>' attribute.
	 * @see #isSetIsConnectable()
	 * @see #unsetIsConnectable()
	 * @see #setIsConnectable(boolean)
	 * @see org.nasdanika.sdk.runtime.models.react.flow.FlowPackage#getHandle_IsConnectable()
	 * @model unique="false" unsettable="true"
	 * @generated
	 */
	boolean isIsConnectable();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.react.flow.Handle#isIsConnectable <em>Is Connectable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Connectable</em>' attribute.
	 * @see #isSetIsConnectable()
	 * @see #unsetIsConnectable()
	 * @see #isIsConnectable()
	 * @generated
	 */
	void setIsConnectable(boolean value);

	/**
	 * Unsets the value of the '{@link org.nasdanika.sdk.runtime.models.react.flow.Handle#isIsConnectable <em>Is Connectable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsConnectable()
	 * @see #isIsConnectable()
	 * @see #setIsConnectable(boolean)
	 * @generated
	 */
	void unsetIsConnectable();

	/**
	 * Returns whether the value of the '{@link org.nasdanika.sdk.runtime.models.react.flow.Handle#isIsConnectable <em>Is Connectable</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Is Connectable</em>' attribute is set.
	 * @see #unsetIsConnectable()
	 * @see #isIsConnectable()
	 * @see #setIsConnectable(boolean)
	 * @generated
	 */
	boolean isSetIsConnectable();

} // Handle
