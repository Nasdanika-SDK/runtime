/**
 */
package org.nasdanika.sdk.runtime.models.react.bootstrap;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Stack</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.bootstrap.Stack#getDirection <em>Direction</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.bootstrap.Stack#getGap <em>Gap</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.BootstrapPackage#getStack()
 * @model annotation="urn:org.nasdanika:react component='Stack'"
 * @generated
 */
public interface Stack extends BootstrapComponent {
	/**
	 * Returns the value of the '<em><b>Direction</b></em>' attribute.
	 * The literals are from the enumeration {@link org.nasdanika.sdk.runtime.models.react.bootstrap.Direction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Direction</em>' attribute.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.Direction
	 * @see #isSetDirection()
	 * @see #unsetDirection()
	 * @see #setDirection(Direction)
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.BootstrapPackage#getStack_Direction()
	 * @model unique="false" unsettable="true"
	 * @generated
	 */
	Direction getDirection();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.Stack#getDirection <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Direction</em>' attribute.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.Direction
	 * @see #isSetDirection()
	 * @see #unsetDirection()
	 * @see #getDirection()
	 * @generated
	 */
	void setDirection(Direction value);

	/**
	 * Unsets the value of the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.Stack#getDirection <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDirection()
	 * @see #getDirection()
	 * @see #setDirection(Direction)
	 * @generated
	 */
	void unsetDirection();

	/**
	 * Returns whether the value of the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.Stack#getDirection <em>Direction</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Direction</em>' attribute is set.
	 * @see #unsetDirection()
	 * @see #getDirection()
	 * @see #setDirection(Direction)
	 * @generated
	 */
	boolean isSetDirection();

	/**
	 * Returns the value of the '<em><b>Gap</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  0 - 5
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Gap</em>' attribute.
	 * @see #isSetGap()
	 * @see #unsetGap()
	 * @see #setGap(int)
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.BootstrapPackage#getStack_Gap()
	 * @model unique="false" unsettable="true"
	 * @generated
	 */
	int getGap();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.Stack#getGap <em>Gap</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gap</em>' attribute.
	 * @see #isSetGap()
	 * @see #unsetGap()
	 * @see #getGap()
	 * @generated
	 */
	void setGap(int value);

	/**
	 * Unsets the value of the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.Stack#getGap <em>Gap</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetGap()
	 * @see #getGap()
	 * @see #setGap(int)
	 * @generated
	 */
	void unsetGap();

	/**
	 * Returns whether the value of the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.Stack#getGap <em>Gap</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Gap</em>' attribute is set.
	 * @see #unsetGap()
	 * @see #getGap()
	 * @see #setGap(int)
	 * @generated
	 */
	boolean isSetGap();

} // Stack
