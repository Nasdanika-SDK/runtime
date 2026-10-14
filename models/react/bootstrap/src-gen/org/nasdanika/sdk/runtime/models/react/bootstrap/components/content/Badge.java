/**
 */
package org.nasdanika.sdk.runtime.models.react.bootstrap.components.content;

import org.nasdanika.sdk.runtime.models.react.bootstrap.BootstrapComponent;
import org.nasdanika.sdk.runtime.models.react.bootstrap.TextContent;
import org.nasdanika.sdk.runtime.models.react.bootstrap.Variant;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Badge</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.content.Badge#getBg <em>Bg</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.content.Badge#getTextColor <em>Text Color</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.content.Badge#isPill <em>Pill</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.content.ContentPackage#getBadge()
 * @model annotation="urn:org.nasdanika:react component='Badge'"
 * @generated
 */
public interface Badge extends BootstrapComponent, TextContent {
	/**
	 * Returns the value of the '<em><b>Bg</b></em>' attribute.
	 * The literals are from the enumeration {@link org.nasdanika.sdk.runtime.models.react.bootstrap.Variant}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bg</em>' attribute.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.Variant
	 * @see #isSetBg()
	 * @see #unsetBg()
	 * @see #setBg(Variant)
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.content.ContentPackage#getBadge_Bg()
	 * @model unique="false" unsettable="true"
	 * @generated
	 */
	Variant getBg();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.content.Badge#getBg <em>Bg</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bg</em>' attribute.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.Variant
	 * @see #isSetBg()
	 * @see #unsetBg()
	 * @see #getBg()
	 * @generated
	 */
	void setBg(Variant value);

	/**
	 * Unsets the value of the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.content.Badge#getBg <em>Bg</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetBg()
	 * @see #getBg()
	 * @see #setBg(Variant)
	 * @generated
	 */
	void unsetBg();

	/**
	 * Returns whether the value of the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.content.Badge#getBg <em>Bg</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Bg</em>' attribute is set.
	 * @see #unsetBg()
	 * @see #getBg()
	 * @see #setBg(Variant)
	 * @generated
	 */
	boolean isSetBg();

	/**
	 * Returns the value of the '<em><b>Text Color</b></em>' attribute.
	 * The literals are from the enumeration {@link org.nasdanika.sdk.runtime.models.react.bootstrap.Variant}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Text color, for light backgrounds
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Text Color</em>' attribute.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.Variant
	 * @see #isSetTextColor()
	 * @see #unsetTextColor()
	 * @see #setTextColor(Variant)
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.content.ContentPackage#getBadge_TextColor()
	 * @model unique="false" unsettable="true"
	 *        annotation="urn:org.nasdanika:react prop='text'"
	 * @generated
	 */
	Variant getTextColor();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.content.Badge#getTextColor <em>Text Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text Color</em>' attribute.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.Variant
	 * @see #isSetTextColor()
	 * @see #unsetTextColor()
	 * @see #getTextColor()
	 * @generated
	 */
	void setTextColor(Variant value);

	/**
	 * Unsets the value of the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.content.Badge#getTextColor <em>Text Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTextColor()
	 * @see #getTextColor()
	 * @see #setTextColor(Variant)
	 * @generated
	 */
	void unsetTextColor();

	/**
	 * Returns whether the value of the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.content.Badge#getTextColor <em>Text Color</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Text Color</em>' attribute is set.
	 * @see #unsetTextColor()
	 * @see #getTextColor()
	 * @see #setTextColor(Variant)
	 * @generated
	 */
	boolean isSetTextColor();

	/**
	 * Returns the value of the '<em><b>Pill</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pill</em>' attribute.
	 * @see #setPill(boolean)
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.content.ContentPackage#getBadge_Pill()
	 * @model unique="false"
	 * @generated
	 */
	boolean isPill();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.content.Badge#isPill <em>Pill</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pill</em>' attribute.
	 * @see #isPill()
	 * @generated
	 */
	void setPill(boolean value);

} // Badge
