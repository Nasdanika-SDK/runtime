/**
 */
package org.nasdanika.sdk.runtime.models.html.bootstrap;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Stack</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * vstack, or hstack if horizontal.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.bootstrap.Stack#isHorizontal <em>Horizontal</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.bootstrap.Stack#getGap <em>Gap</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.BootstrapPackage#getStack()
 * @model annotation="urn:org.nasdanika:html tag='div'"
 * @generated
 */
public interface Stack extends BootstrapElement {
	/**
	 * Returns the value of the '<em><b>Horizontal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Horizontal</em>' attribute.
	 * @see #setHorizontal(boolean)
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.BootstrapPackage#getStack_Horizontal()
	 * @model unique="false"
	 *        annotation="urn:org.nasdanika:html logical='true'"
	 * @generated
	 */
	boolean isHorizontal();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.Stack#isHorizontal <em>Horizontal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Horizontal</em>' attribute.
	 * @see #isHorizontal()
	 * @generated
	 */
	void setHorizontal(boolean value);

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
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.BootstrapPackage#getStack_Gap()
	 * @model unique="false" unsettable="true"
	 *        annotation="urn:org.nasdanika:html classes='gap-{}'"
	 * @generated
	 */
	int getGap();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.Stack#getGap <em>Gap</em>}' attribute.
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
	 * Unsets the value of the '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.Stack#getGap <em>Gap</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetGap()
	 * @see #getGap()
	 * @see #setGap(int)
	 * @generated
	 */
	void unsetGap();

	/**
	 * Returns whether the value of the '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.Stack#getGap <em>Gap</em>}' attribute is set.
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
