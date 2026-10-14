/**
 */
package org.nasdanika.sdk.runtime.models.html.bootstrap.components.content;

import org.eclipse.emf.common.util.EList;

import org.nasdanika.sdk.runtime.models.html.bootstrap.BootstrapElement;
import org.nasdanika.sdk.runtime.models.html.bootstrap.Variant;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Card</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.Card#getBg <em>Bg</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.Card#getTextColor <em>Text Color</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.Card#getBorder <em>Border</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.Card#getHeader <em>Header</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.Card#getImage <em>Image</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.Card#getBodies <em>Bodies</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.Card#getFooter <em>Footer</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.ContentPackage#getCard()
 * @model annotation="urn:org.nasdanika:html tag='div' classes='card'"
 * @generated
 */
public interface Card extends BootstrapElement {
	/**
	 * Returns the value of the '<em><b>Bg</b></em>' attribute.
	 * The literals are from the enumeration {@link org.nasdanika.sdk.runtime.models.html.bootstrap.Variant}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bg</em>' attribute.
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.Variant
	 * @see #isSetBg()
	 * @see #unsetBg()
	 * @see #setBg(Variant)
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.ContentPackage#getCard_Bg()
	 * @model unique="false" unsettable="true"
	 *        annotation="urn:org.nasdanika:html classes='bg-{}'"
	 * @generated
	 */
	Variant getBg();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.Card#getBg <em>Bg</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bg</em>' attribute.
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.Variant
	 * @see #isSetBg()
	 * @see #unsetBg()
	 * @see #getBg()
	 * @generated
	 */
	void setBg(Variant value);

	/**
	 * Unsets the value of the '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.Card#getBg <em>Bg</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetBg()
	 * @see #getBg()
	 * @see #setBg(Variant)
	 * @generated
	 */
	void unsetBg();

	/**
	 * Returns whether the value of the '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.Card#getBg <em>Bg</em>}' attribute is set.
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
	 * The literals are from the enumeration {@link org.nasdanika.sdk.runtime.models.html.bootstrap.Variant}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text Color</em>' attribute.
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.Variant
	 * @see #isSetTextColor()
	 * @see #unsetTextColor()
	 * @see #setTextColor(Variant)
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.ContentPackage#getCard_TextColor()
	 * @model unique="false" unsettable="true"
	 *        annotation="urn:org.nasdanika:html classes='text-{}'"
	 * @generated
	 */
	Variant getTextColor();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.Card#getTextColor <em>Text Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text Color</em>' attribute.
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.Variant
	 * @see #isSetTextColor()
	 * @see #unsetTextColor()
	 * @see #getTextColor()
	 * @generated
	 */
	void setTextColor(Variant value);

	/**
	 * Unsets the value of the '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.Card#getTextColor <em>Text Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTextColor()
	 * @see #getTextColor()
	 * @see #setTextColor(Variant)
	 * @generated
	 */
	void unsetTextColor();

	/**
	 * Returns whether the value of the '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.Card#getTextColor <em>Text Color</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Border</b></em>' attribute.
	 * The literals are from the enumeration {@link org.nasdanika.sdk.runtime.models.html.bootstrap.Variant}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Border</em>' attribute.
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.Variant
	 * @see #isSetBorder()
	 * @see #unsetBorder()
	 * @see #setBorder(Variant)
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.ContentPackage#getCard_Border()
	 * @model unique="false" unsettable="true"
	 *        annotation="urn:org.nasdanika:html classes='border-{}'"
	 * @generated
	 */
	Variant getBorder();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.Card#getBorder <em>Border</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Border</em>' attribute.
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.Variant
	 * @see #isSetBorder()
	 * @see #unsetBorder()
	 * @see #getBorder()
	 * @generated
	 */
	void setBorder(Variant value);

	/**
	 * Unsets the value of the '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.Card#getBorder <em>Border</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetBorder()
	 * @see #getBorder()
	 * @see #setBorder(Variant)
	 * @generated
	 */
	void unsetBorder();

	/**
	 * Returns whether the value of the '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.Card#getBorder <em>Border</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Border</em>' attribute is set.
	 * @see #unsetBorder()
	 * @see #getBorder()
	 * @see #setBorder(Variant)
	 * @generated
	 */
	boolean isSetBorder();

	/**
	 * Returns the value of the '<em><b>Header</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Header</em>' containment reference.
	 * @see #setHeader(CardHeader)
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.ContentPackage#getCard_Header()
	 * @model containment="true"
	 * @generated
	 */
	CardHeader getHeader();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.Card#getHeader <em>Header</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Header</em>' containment reference.
	 * @see #getHeader()
	 * @generated
	 */
	void setHeader(CardHeader value);

	/**
	 * Returns the value of the '<em><b>Image</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Image</em>' containment reference.
	 * @see #setImage(CardImage)
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.ContentPackage#getCard_Image()
	 * @model containment="true"
	 * @generated
	 */
	CardImage getImage();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.Card#getImage <em>Image</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Image</em>' containment reference.
	 * @see #getImage()
	 * @generated
	 */
	void setImage(CardImage value);

	/**
	 * Returns the value of the '<em><b>Bodies</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.CardBody}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bodies</em>' containment reference list.
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.ContentPackage#getCard_Bodies()
	 * @model containment="true"
	 * @generated
	 */
	EList<CardBody> getBodies();

	/**
	 * Returns the value of the '<em><b>Footer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Footer</em>' containment reference.
	 * @see #setFooter(CardFooter)
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.ContentPackage#getCard_Footer()
	 * @model containment="true"
	 * @generated
	 */
	CardFooter getFooter();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.Card#getFooter <em>Footer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Footer</em>' containment reference.
	 * @see #getFooter()
	 * @generated
	 */
	void setFooter(CardFooter value);

} // Card
