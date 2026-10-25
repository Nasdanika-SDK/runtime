/**
 */
package org.nasdanika.sdk.runtime.models.presentation;

import org.nasdanika.sdk.runtime.models.diagram.Node;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Shape</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 *  ---- Shared shape taxonomy ----
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.presentation.Shape#getOrder <em>Order</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.presentation.Shape#getRotation <em>Rotation</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.presentation.Shape#isFlipHorizontal <em>Flip Horizontal</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.presentation.Shape#isFlipVertical <em>Flip Vertical</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.sdk.runtime.models.presentation.PresentationPackage#getShape()
 * @model abstract="true"
 * @generated
 */
public interface Shape extends Node {
	/**
	 * Returns the value of the '<em><b>Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Z-order on the slide.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Order</em>' attribute.
	 * @see #setOrder(int)
	 * @see org.nasdanika.sdk.runtime.models.presentation.PresentationPackage#getShape_Order()
	 * @model unique="false"
	 * @generated
	 */
	int getOrder();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.presentation.Shape#getOrder <em>Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order</em>' attribute.
	 * @see #getOrder()
	 * @generated
	 */
	void setOrder(int value);

	/**
	 * Returns the value of the '<em><b>Rotation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rotation</em>' attribute.
	 * @see #setRotation(double)
	 * @see org.nasdanika.sdk.runtime.models.presentation.PresentationPackage#getShape_Rotation()
	 * @model unique="false"
	 * @generated
	 */
	double getRotation();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.presentation.Shape#getRotation <em>Rotation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rotation</em>' attribute.
	 * @see #getRotation()
	 * @generated
	 */
	void setRotation(double value);

	/**
	 * Returns the value of the '<em><b>Flip Horizontal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flip Horizontal</em>' attribute.
	 * @see #setFlipHorizontal(boolean)
	 * @see org.nasdanika.sdk.runtime.models.presentation.PresentationPackage#getShape_FlipHorizontal()
	 * @model unique="false"
	 * @generated
	 */
	boolean isFlipHorizontal();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.presentation.Shape#isFlipHorizontal <em>Flip Horizontal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Flip Horizontal</em>' attribute.
	 * @see #isFlipHorizontal()
	 * @generated
	 */
	void setFlipHorizontal(boolean value);

	/**
	 * Returns the value of the '<em><b>Flip Vertical</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flip Vertical</em>' attribute.
	 * @see #setFlipVertical(boolean)
	 * @see org.nasdanika.sdk.runtime.models.presentation.PresentationPackage#getShape_FlipVertical()
	 * @model unique="false"
	 * @generated
	 */
	boolean isFlipVertical();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.presentation.Shape#isFlipVertical <em>Flip Vertical</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Flip Vertical</em>' attribute.
	 * @see #isFlipVertical()
	 * @generated
	 */
	void setFlipVertical(boolean value);

} // Shape
