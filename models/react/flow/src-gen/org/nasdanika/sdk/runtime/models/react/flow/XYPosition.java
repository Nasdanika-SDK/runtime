/**
 */
package org.nasdanika.sdk.runtime.models.react.flow;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>XY Position</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.flow.XYPosition#getX <em>X</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.flow.XYPosition#getY <em>Y</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.sdk.runtime.models.react.flow.FlowPackage#getXYPosition()
 * @model
 * @generated
 */
public interface XYPosition extends EObject {
	/**
	 * Returns the value of the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>X</em>' attribute.
	 * @see #setX(double)
	 * @see org.nasdanika.sdk.runtime.models.react.flow.FlowPackage#getXYPosition_X()
	 * @model unique="false"
	 *        annotation="urn:org.nasdanika:react required='true'"
	 * @generated
	 */
	double getX();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.react.flow.XYPosition#getX <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>X</em>' attribute.
	 * @see #getX()
	 * @generated
	 */
	void setX(double value);

	/**
	 * Returns the value of the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Y</em>' attribute.
	 * @see #setY(double)
	 * @see org.nasdanika.sdk.runtime.models.react.flow.FlowPackage#getXYPosition_Y()
	 * @model unique="false"
	 *        annotation="urn:org.nasdanika:react required='true'"
	 * @generated
	 */
	double getY();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.react.flow.XYPosition#getY <em>Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Y</em>' attribute.
	 * @see #getY()
	 * @generated
	 */
	void setY(double value);

} // XYPosition
