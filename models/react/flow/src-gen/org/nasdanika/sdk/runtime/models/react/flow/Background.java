/**
 */
package org.nasdanika.sdk.runtime.models.react.flow;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Background</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.flow.Background#getVariant <em>Variant</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.flow.Background#getGap <em>Gap</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.flow.Background#getSize <em>Size</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.flow.Background#getLineWidth <em>Line Width</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.flow.Background#getColor <em>Color</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.flow.Background#getBgColor <em>Bg Color</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.flow.Background#getBackgroundId <em>Background Id</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.sdk.runtime.models.react.flow.FlowPackage#getBackground()
 * @model annotation="urn:org.nasdanika:react component='Background'"
 * @generated
 */
public interface Background extends FlowComponent {
	/**
	 * Returns the value of the '<em><b>Variant</b></em>' attribute.
	 * The literals are from the enumeration {@link org.nasdanika.sdk.runtime.models.react.flow.BackgroundVariant}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variant</em>' attribute.
	 * @see org.nasdanika.sdk.runtime.models.react.flow.BackgroundVariant
	 * @see #isSetVariant()
	 * @see #unsetVariant()
	 * @see #setVariant(BackgroundVariant)
	 * @see org.nasdanika.sdk.runtime.models.react.flow.FlowPackage#getBackground_Variant()
	 * @model unique="false" unsettable="true"
	 *        annotation="urn:org.nasdanika:react enum='BackgroundVariant' module='@xyflow/react'"
	 * @generated
	 */
	BackgroundVariant getVariant();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.react.flow.Background#getVariant <em>Variant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variant</em>' attribute.
	 * @see org.nasdanika.sdk.runtime.models.react.flow.BackgroundVariant
	 * @see #isSetVariant()
	 * @see #unsetVariant()
	 * @see #getVariant()
	 * @generated
	 */
	void setVariant(BackgroundVariant value);

	/**
	 * Unsets the value of the '{@link org.nasdanika.sdk.runtime.models.react.flow.Background#getVariant <em>Variant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetVariant()
	 * @see #getVariant()
	 * @see #setVariant(BackgroundVariant)
	 * @generated
	 */
	void unsetVariant();

	/**
	 * Returns whether the value of the '{@link org.nasdanika.sdk.runtime.models.react.flow.Background#getVariant <em>Variant</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Variant</em>' attribute is set.
	 * @see #unsetVariant()
	 * @see #getVariant()
	 * @see #setVariant(BackgroundVariant)
	 * @generated
	 */
	boolean isSetVariant();

	/**
	 * Returns the value of the '<em><b>Gap</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gap</em>' attribute.
	 * @see #isSetGap()
	 * @see #unsetGap()
	 * @see #setGap(double)
	 * @see org.nasdanika.sdk.runtime.models.react.flow.FlowPackage#getBackground_Gap()
	 * @model unique="false" unsettable="true"
	 * @generated
	 */
	double getGap();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.react.flow.Background#getGap <em>Gap</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gap</em>' attribute.
	 * @see #isSetGap()
	 * @see #unsetGap()
	 * @see #getGap()
	 * @generated
	 */
	void setGap(double value);

	/**
	 * Unsets the value of the '{@link org.nasdanika.sdk.runtime.models.react.flow.Background#getGap <em>Gap</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetGap()
	 * @see #getGap()
	 * @see #setGap(double)
	 * @generated
	 */
	void unsetGap();

	/**
	 * Returns whether the value of the '{@link org.nasdanika.sdk.runtime.models.react.flow.Background#getGap <em>Gap</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Gap</em>' attribute is set.
	 * @see #unsetGap()
	 * @see #getGap()
	 * @see #setGap(double)
	 * @generated
	 */
	boolean isSetGap();

	/**
	 * Returns the value of the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size</em>' attribute.
	 * @see #isSetSize()
	 * @see #unsetSize()
	 * @see #setSize(double)
	 * @see org.nasdanika.sdk.runtime.models.react.flow.FlowPackage#getBackground_Size()
	 * @model unique="false" unsettable="true"
	 * @generated
	 */
	double getSize();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.react.flow.Background#getSize <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size</em>' attribute.
	 * @see #isSetSize()
	 * @see #unsetSize()
	 * @see #getSize()
	 * @generated
	 */
	void setSize(double value);

	/**
	 * Unsets the value of the '{@link org.nasdanika.sdk.runtime.models.react.flow.Background#getSize <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSize()
	 * @see #getSize()
	 * @see #setSize(double)
	 * @generated
	 */
	void unsetSize();

	/**
	 * Returns whether the value of the '{@link org.nasdanika.sdk.runtime.models.react.flow.Background#getSize <em>Size</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Size</em>' attribute is set.
	 * @see #unsetSize()
	 * @see #getSize()
	 * @see #setSize(double)
	 * @generated
	 */
	boolean isSetSize();

	/**
	 * Returns the value of the '<em><b>Line Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Line Width</em>' attribute.
	 * @see #isSetLineWidth()
	 * @see #unsetLineWidth()
	 * @see #setLineWidth(double)
	 * @see org.nasdanika.sdk.runtime.models.react.flow.FlowPackage#getBackground_LineWidth()
	 * @model unique="false" unsettable="true"
	 * @generated
	 */
	double getLineWidth();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.react.flow.Background#getLineWidth <em>Line Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Line Width</em>' attribute.
	 * @see #isSetLineWidth()
	 * @see #unsetLineWidth()
	 * @see #getLineWidth()
	 * @generated
	 */
	void setLineWidth(double value);

	/**
	 * Unsets the value of the '{@link org.nasdanika.sdk.runtime.models.react.flow.Background#getLineWidth <em>Line Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLineWidth()
	 * @see #getLineWidth()
	 * @see #setLineWidth(double)
	 * @generated
	 */
	void unsetLineWidth();

	/**
	 * Returns whether the value of the '{@link org.nasdanika.sdk.runtime.models.react.flow.Background#getLineWidth <em>Line Width</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Line Width</em>' attribute is set.
	 * @see #unsetLineWidth()
	 * @see #getLineWidth()
	 * @see #setLineWidth(double)
	 * @generated
	 */
	boolean isSetLineWidth();

	/**
	 * Returns the value of the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Color</em>' attribute.
	 * @see #setColor(String)
	 * @see org.nasdanika.sdk.runtime.models.react.flow.FlowPackage#getBackground_Color()
	 * @model unique="false"
	 * @generated
	 */
	String getColor();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.react.flow.Background#getColor <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Color</em>' attribute.
	 * @see #getColor()
	 * @generated
	 */
	void setColor(String value);

	/**
	 * Returns the value of the '<em><b>Bg Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bg Color</em>' attribute.
	 * @see #setBgColor(String)
	 * @see org.nasdanika.sdk.runtime.models.react.flow.FlowPackage#getBackground_BgColor()
	 * @model unique="false"
	 * @generated
	 */
	String getBgColor();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.react.flow.Background#getBgColor <em>Bg Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bg Color</em>' attribute.
	 * @see #getBgColor()
	 * @generated
	 */
	void setBgColor(String value);

	/**
	 * Returns the value of the '<em><b>Background Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Distinguishes several backgrounds of a flow
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Background Id</em>' attribute.
	 * @see #setBackgroundId(String)
	 * @see org.nasdanika.sdk.runtime.models.react.flow.FlowPackage#getBackground_BackgroundId()
	 * @model unique="false"
	 *        annotation="urn:org.nasdanika:react prop='id'"
	 * @generated
	 */
	String getBackgroundId();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.react.flow.Background#getBackgroundId <em>Background Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Background Id</em>' attribute.
	 * @see #getBackgroundId()
	 * @generated
	 */
	void setBackgroundId(String value);

} // Background
