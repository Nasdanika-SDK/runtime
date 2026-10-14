/**
 */
package org.nasdanika.sdk.runtime.models.react.flow;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node Resizer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.flow.NodeResizer#getMinWidth <em>Min Width</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.flow.NodeResizer#getMinHeight <em>Min Height</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.flow.NodeResizer#isIsVisible <em>Is Visible</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.flow.NodeResizer#isKeepAspectRatio <em>Keep Aspect Ratio</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.flow.NodeResizer#getColor <em>Color</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.sdk.runtime.models.react.flow.FlowPackage#getNodeResizer()
 * @model annotation="urn:org.nasdanika:react component='NodeResizer'"
 * @generated
 */
public interface NodeResizer extends FlowComponent {
	/**
	 * Returns the value of the '<em><b>Min Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Width</em>' attribute.
	 * @see #isSetMinWidth()
	 * @see #unsetMinWidth()
	 * @see #setMinWidth(double)
	 * @see org.nasdanika.sdk.runtime.models.react.flow.FlowPackage#getNodeResizer_MinWidth()
	 * @model unique="false" unsettable="true"
	 * @generated
	 */
	double getMinWidth();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.react.flow.NodeResizer#getMinWidth <em>Min Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Width</em>' attribute.
	 * @see #isSetMinWidth()
	 * @see #unsetMinWidth()
	 * @see #getMinWidth()
	 * @generated
	 */
	void setMinWidth(double value);

	/**
	 * Unsets the value of the '{@link org.nasdanika.sdk.runtime.models.react.flow.NodeResizer#getMinWidth <em>Min Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMinWidth()
	 * @see #getMinWidth()
	 * @see #setMinWidth(double)
	 * @generated
	 */
	void unsetMinWidth();

	/**
	 * Returns whether the value of the '{@link org.nasdanika.sdk.runtime.models.react.flow.NodeResizer#getMinWidth <em>Min Width</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Min Width</em>' attribute is set.
	 * @see #unsetMinWidth()
	 * @see #getMinWidth()
	 * @see #setMinWidth(double)
	 * @generated
	 */
	boolean isSetMinWidth();

	/**
	 * Returns the value of the '<em><b>Min Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Height</em>' attribute.
	 * @see #isSetMinHeight()
	 * @see #unsetMinHeight()
	 * @see #setMinHeight(double)
	 * @see org.nasdanika.sdk.runtime.models.react.flow.FlowPackage#getNodeResizer_MinHeight()
	 * @model unique="false" unsettable="true"
	 * @generated
	 */
	double getMinHeight();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.react.flow.NodeResizer#getMinHeight <em>Min Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Height</em>' attribute.
	 * @see #isSetMinHeight()
	 * @see #unsetMinHeight()
	 * @see #getMinHeight()
	 * @generated
	 */
	void setMinHeight(double value);

	/**
	 * Unsets the value of the '{@link org.nasdanika.sdk.runtime.models.react.flow.NodeResizer#getMinHeight <em>Min Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMinHeight()
	 * @see #getMinHeight()
	 * @see #setMinHeight(double)
	 * @generated
	 */
	void unsetMinHeight();

	/**
	 * Returns whether the value of the '{@link org.nasdanika.sdk.runtime.models.react.flow.NodeResizer#getMinHeight <em>Min Height</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Min Height</em>' attribute is set.
	 * @see #unsetMinHeight()
	 * @see #getMinHeight()
	 * @see #setMinHeight(double)
	 * @generated
	 */
	boolean isSetMinHeight();

	/**
	 * Returns the value of the '<em><b>Is Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Visible</em>' attribute.
	 * @see #isSetIsVisible()
	 * @see #unsetIsVisible()
	 * @see #setIsVisible(boolean)
	 * @see org.nasdanika.sdk.runtime.models.react.flow.FlowPackage#getNodeResizer_IsVisible()
	 * @model unique="false" unsettable="true"
	 * @generated
	 */
	boolean isIsVisible();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.react.flow.NodeResizer#isIsVisible <em>Is Visible</em>}' attribute.
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
	 * Unsets the value of the '{@link org.nasdanika.sdk.runtime.models.react.flow.NodeResizer#isIsVisible <em>Is Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsVisible()
	 * @see #isIsVisible()
	 * @see #setIsVisible(boolean)
	 * @generated
	 */
	void unsetIsVisible();

	/**
	 * Returns whether the value of the '{@link org.nasdanika.sdk.runtime.models.react.flow.NodeResizer#isIsVisible <em>Is Visible</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Keep Aspect Ratio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Keep Aspect Ratio</em>' attribute.
	 * @see #isSetKeepAspectRatio()
	 * @see #unsetKeepAspectRatio()
	 * @see #setKeepAspectRatio(boolean)
	 * @see org.nasdanika.sdk.runtime.models.react.flow.FlowPackage#getNodeResizer_KeepAspectRatio()
	 * @model unique="false" unsettable="true"
	 * @generated
	 */
	boolean isKeepAspectRatio();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.react.flow.NodeResizer#isKeepAspectRatio <em>Keep Aspect Ratio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Keep Aspect Ratio</em>' attribute.
	 * @see #isSetKeepAspectRatio()
	 * @see #unsetKeepAspectRatio()
	 * @see #isKeepAspectRatio()
	 * @generated
	 */
	void setKeepAspectRatio(boolean value);

	/**
	 * Unsets the value of the '{@link org.nasdanika.sdk.runtime.models.react.flow.NodeResizer#isKeepAspectRatio <em>Keep Aspect Ratio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetKeepAspectRatio()
	 * @see #isKeepAspectRatio()
	 * @see #setKeepAspectRatio(boolean)
	 * @generated
	 */
	void unsetKeepAspectRatio();

	/**
	 * Returns whether the value of the '{@link org.nasdanika.sdk.runtime.models.react.flow.NodeResizer#isKeepAspectRatio <em>Keep Aspect Ratio</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Keep Aspect Ratio</em>' attribute is set.
	 * @see #unsetKeepAspectRatio()
	 * @see #isKeepAspectRatio()
	 * @see #setKeepAspectRatio(boolean)
	 * @generated
	 */
	boolean isSetKeepAspectRatio();

	/**
	 * Returns the value of the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Color</em>' attribute.
	 * @see #setColor(String)
	 * @see org.nasdanika.sdk.runtime.models.react.flow.FlowPackage#getNodeResizer_Color()
	 * @model unique="false"
	 * @generated
	 */
	String getColor();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.react.flow.NodeResizer#getColor <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Color</em>' attribute.
	 * @see #getColor()
	 * @generated
	 */
	void setColor(String value);

} // NodeResizer
