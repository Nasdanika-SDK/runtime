/**
 */
package org.nasdanika.sdk.runtime.models.react.bootstrap.components.content;

import org.nasdanika.sdk.runtime.models.react.bootstrap.BootstrapComponent;
import org.nasdanika.sdk.runtime.models.react.bootstrap.TextContent;
import org.nasdanika.sdk.runtime.models.react.bootstrap.Variant;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Alert</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.content.Alert#getVariant <em>Variant</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.content.Alert#isDismissible <em>Dismissible</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.content.Alert#isShow <em>Show</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.content.Alert#getHeading <em>Heading</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.content.ContentPackage#getAlert()
 * @model annotation="urn:org.nasdanika:react component='Alert'"
 * @generated
 */
public interface Alert extends BootstrapComponent, TextContent {
	/**
	 * Returns the value of the '<em><b>Variant</b></em>' attribute.
	 * The literals are from the enumeration {@link org.nasdanika.sdk.runtime.models.react.bootstrap.Variant}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variant</em>' attribute.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.Variant
	 * @see #isSetVariant()
	 * @see #unsetVariant()
	 * @see #setVariant(Variant)
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.content.ContentPackage#getAlert_Variant()
	 * @model unique="false" unsettable="true"
	 * @generated
	 */
	Variant getVariant();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.content.Alert#getVariant <em>Variant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variant</em>' attribute.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.Variant
	 * @see #isSetVariant()
	 * @see #unsetVariant()
	 * @see #getVariant()
	 * @generated
	 */
	void setVariant(Variant value);

	/**
	 * Unsets the value of the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.content.Alert#getVariant <em>Variant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetVariant()
	 * @see #getVariant()
	 * @see #setVariant(Variant)
	 * @generated
	 */
	void unsetVariant();

	/**
	 * Returns whether the value of the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.content.Alert#getVariant <em>Variant</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Variant</em>' attribute is set.
	 * @see #unsetVariant()
	 * @see #getVariant()
	 * @see #setVariant(Variant)
	 * @generated
	 */
	boolean isSetVariant();

	/**
	 * Returns the value of the '<em><b>Dismissible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Close button - pair with show and onClose attributes
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dismissible</em>' attribute.
	 * @see #setDismissible(boolean)
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.content.ContentPackage#getAlert_Dismissible()
	 * @model unique="false"
	 * @generated
	 */
	boolean isDismissible();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.content.Alert#isDismissible <em>Dismissible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dismissible</em>' attribute.
	 * @see #isDismissible()
	 * @generated
	 */
	void setDismissible(boolean value);

	/**
	 * Returns the value of the '<em><b>Show</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Show</em>' attribute.
	 * @see #isSetShow()
	 * @see #unsetShow()
	 * @see #setShow(boolean)
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.content.ContentPackage#getAlert_Show()
	 * @model unique="false" unsettable="true"
	 * @generated
	 */
	boolean isShow();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.content.Alert#isShow <em>Show</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Show</em>' attribute.
	 * @see #isSetShow()
	 * @see #unsetShow()
	 * @see #isShow()
	 * @generated
	 */
	void setShow(boolean value);

	/**
	 * Unsets the value of the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.content.Alert#isShow <em>Show</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetShow()
	 * @see #isShow()
	 * @see #setShow(boolean)
	 * @generated
	 */
	void unsetShow();

	/**
	 * Returns whether the value of the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.content.Alert#isShow <em>Show</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Show</em>' attribute is set.
	 * @see #unsetShow()
	 * @see #isShow()
	 * @see #setShow(boolean)
	 * @generated
	 */
	boolean isSetShow();

	/**
	 * Returns the value of the '<em><b>Heading</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Heading</em>' containment reference.
	 * @see #setHeading(AlertHeading)
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.content.ContentPackage#getAlert_Heading()
	 * @model containment="true"
	 * @generated
	 */
	AlertHeading getHeading();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.content.Alert#getHeading <em>Heading</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Heading</em>' containment reference.
	 * @see #getHeading()
	 * @generated
	 */
	void setHeading(AlertHeading value);

} // Alert
