/**
 */
package org.nasdanika.sdk.runtime.models.html.bootstrap.components.content;

import org.eclipse.emf.common.util.EList;

import org.nasdanika.sdk.runtime.models.html.bootstrap.BootstrapElement;
import org.nasdanika.sdk.runtime.models.html.bootstrap.ColumnSize;
import org.nasdanika.sdk.runtime.models.html.bootstrap.Variant;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Placeholder</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Loading placeholder. Width in columns with sizes, e.g. col-6.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.Placeholder#getBg <em>Bg</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.Placeholder#getSize <em>Size</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.Placeholder#getSizes <em>Sizes</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.ContentPackage#getPlaceholder()
 * @model annotation="urn:org.nasdanika:html tag='span' classes='placeholder'"
 * @generated
 */
public interface Placeholder extends BootstrapElement {
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
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.ContentPackage#getPlaceholder_Bg()
	 * @model unique="false" unsettable="true"
	 *        annotation="urn:org.nasdanika:html classes='bg-{}'"
	 * @generated
	 */
	Variant getBg();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.Placeholder#getBg <em>Bg</em>}' attribute.
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
	 * Unsets the value of the '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.Placeholder#getBg <em>Bg</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetBg()
	 * @see #getBg()
	 * @see #setBg(Variant)
	 * @generated
	 */
	void unsetBg();

	/**
	 * Returns whether the value of the '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.Placeholder#getBg <em>Bg</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Size</b></em>' attribute.
	 * The literals are from the enumeration {@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.PlaceholderSize}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size</em>' attribute.
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.PlaceholderSize
	 * @see #isSetSize()
	 * @see #unsetSize()
	 * @see #setSize(PlaceholderSize)
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.ContentPackage#getPlaceholder_Size()
	 * @model unique="false" unsettable="true"
	 *        annotation="urn:org.nasdanika:html classes='placeholder-{}'"
	 * @generated
	 */
	PlaceholderSize getSize();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.Placeholder#getSize <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size</em>' attribute.
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.PlaceholderSize
	 * @see #isSetSize()
	 * @see #unsetSize()
	 * @see #getSize()
	 * @generated
	 */
	void setSize(PlaceholderSize value);

	/**
	 * Unsets the value of the '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.Placeholder#getSize <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSize()
	 * @see #getSize()
	 * @see #setSize(PlaceholderSize)
	 * @generated
	 */
	void unsetSize();

	/**
	 * Returns whether the value of the '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.Placeholder#getSize <em>Size</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Size</em>' attribute is set.
	 * @see #unsetSize()
	 * @see #getSize()
	 * @see #setSize(PlaceholderSize)
	 * @generated
	 */
	boolean isSetSize();

	/**
	 * Returns the value of the '<em><b>Sizes</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.sdk.runtime.models.html.bootstrap.ColumnSize}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sizes</em>' containment reference list.
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.ContentPackage#getPlaceholder_Sizes()
	 * @model containment="true"
	 *        annotation="urn:org.nasdanika:html logical='true'"
	 * @generated
	 */
	EList<ColumnSize> getSizes();

} // Placeholder
