/**
 */
package org.nasdanika.sdk.runtime.models.react.bootstrap.components.content;

import org.nasdanika.sdk.runtime.models.react.bootstrap.BootstrapComponent;
import org.nasdanika.sdk.runtime.models.react.bootstrap.Size;
import org.nasdanika.sdk.runtime.models.react.bootstrap.TextContent;
import org.nasdanika.sdk.runtime.models.react.bootstrap.Variant;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Spinner</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.content.Spinner#getAnimation <em>Animation</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.content.Spinner#getVariant <em>Variant</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.content.Spinner#getSize <em>Size</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.content.Spinner#getRole <em>Role</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.content.ContentPackage#getSpinner()
 * @model annotation="urn:org.nasdanika:react component='Spinner'"
 * @generated
 */
public interface Spinner extends BootstrapComponent, TextContent {
	/**
	 * Returns the value of the '<em><b>Animation</b></em>' attribute.
	 * The literals are from the enumeration {@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.content.SpinnerAnimation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Animation</em>' attribute.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.content.SpinnerAnimation
	 * @see #isSetAnimation()
	 * @see #unsetAnimation()
	 * @see #setAnimation(SpinnerAnimation)
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.content.ContentPackage#getSpinner_Animation()
	 * @model unique="false" unsettable="true"
	 * @generated
	 */
	SpinnerAnimation getAnimation();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.content.Spinner#getAnimation <em>Animation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Animation</em>' attribute.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.content.SpinnerAnimation
	 * @see #isSetAnimation()
	 * @see #unsetAnimation()
	 * @see #getAnimation()
	 * @generated
	 */
	void setAnimation(SpinnerAnimation value);

	/**
	 * Unsets the value of the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.content.Spinner#getAnimation <em>Animation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAnimation()
	 * @see #getAnimation()
	 * @see #setAnimation(SpinnerAnimation)
	 * @generated
	 */
	void unsetAnimation();

	/**
	 * Returns whether the value of the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.content.Spinner#getAnimation <em>Animation</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Animation</em>' attribute is set.
	 * @see #unsetAnimation()
	 * @see #getAnimation()
	 * @see #setAnimation(SpinnerAnimation)
	 * @generated
	 */
	boolean isSetAnimation();

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
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.content.ContentPackage#getSpinner_Variant()
	 * @model unique="false" unsettable="true"
	 * @generated
	 */
	Variant getVariant();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.content.Spinner#getVariant <em>Variant</em>}' attribute.
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
	 * Unsets the value of the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.content.Spinner#getVariant <em>Variant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetVariant()
	 * @see #getVariant()
	 * @see #setVariant(Variant)
	 * @generated
	 */
	void unsetVariant();

	/**
	 * Returns whether the value of the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.content.Spinner#getVariant <em>Variant</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Size</b></em>' attribute.
	 * The literals are from the enumeration {@link org.nasdanika.sdk.runtime.models.react.bootstrap.Size}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size</em>' attribute.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.Size
	 * @see #isSetSize()
	 * @see #unsetSize()
	 * @see #setSize(Size)
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.content.ContentPackage#getSpinner_Size()
	 * @model unique="false" unsettable="true"
	 * @generated
	 */
	Size getSize();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.content.Spinner#getSize <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size</em>' attribute.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.Size
	 * @see #isSetSize()
	 * @see #unsetSize()
	 * @see #getSize()
	 * @generated
	 */
	void setSize(Size value);

	/**
	 * Unsets the value of the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.content.Spinner#getSize <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSize()
	 * @see #getSize()
	 * @see #setSize(Size)
	 * @generated
	 */
	void unsetSize();

	/**
	 * Returns whether the value of the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.content.Spinner#getSize <em>Size</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Size</em>' attribute is set.
	 * @see #unsetSize()
	 * @see #getSize()
	 * @see #setSize(Size)
	 * @generated
	 */
	boolean isSetSize();

	/**
	 * Returns the value of the '<em><b>Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role</em>' attribute.
	 * @see #setRole(String)
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.content.ContentPackage#getSpinner_Role()
	 * @model unique="false"
	 * @generated
	 */
	String getRole();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.content.Spinner#getRole <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role</em>' attribute.
	 * @see #getRole()
	 * @generated
	 */
	void setRole(String value);

} // Spinner
