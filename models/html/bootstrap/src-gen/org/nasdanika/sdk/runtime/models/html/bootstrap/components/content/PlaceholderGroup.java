/**
 */
package org.nasdanika.sdk.runtime.models.html.bootstrap.components.content;

import org.eclipse.emf.common.util.EList;

import org.nasdanika.sdk.runtime.models.html.bootstrap.BootstrapElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Placeholder Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Animated group of placeholders - Placeholder as="p" animation="glow" in React Bootstrap.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.PlaceholderGroup#getAnimation <em>Animation</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.PlaceholderGroup#getPlaceholders <em>Placeholders</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.ContentPackage#getPlaceholderGroup()
 * @model annotation="urn:org.nasdanika:html tag='p'"
 * @generated
 */
public interface PlaceholderGroup extends BootstrapElement {
	/**
	 * Returns the value of the '<em><b>Animation</b></em>' attribute.
	 * The literals are from the enumeration {@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.PlaceholderAnimation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Animation</em>' attribute.
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.PlaceholderAnimation
	 * @see #isSetAnimation()
	 * @see #unsetAnimation()
	 * @see #setAnimation(PlaceholderAnimation)
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.ContentPackage#getPlaceholderGroup_Animation()
	 * @model unique="false" unsettable="true"
	 *        annotation="urn:org.nasdanika:html classes='placeholder-{}'"
	 * @generated
	 */
	PlaceholderAnimation getAnimation();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.PlaceholderGroup#getAnimation <em>Animation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Animation</em>' attribute.
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.PlaceholderAnimation
	 * @see #isSetAnimation()
	 * @see #unsetAnimation()
	 * @see #getAnimation()
	 * @generated
	 */
	void setAnimation(PlaceholderAnimation value);

	/**
	 * Unsets the value of the '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.PlaceholderGroup#getAnimation <em>Animation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAnimation()
	 * @see #getAnimation()
	 * @see #setAnimation(PlaceholderAnimation)
	 * @generated
	 */
	void unsetAnimation();

	/**
	 * Returns whether the value of the '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.PlaceholderGroup#getAnimation <em>Animation</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Animation</em>' attribute is set.
	 * @see #unsetAnimation()
	 * @see #getAnimation()
	 * @see #setAnimation(PlaceholderAnimation)
	 * @generated
	 */
	boolean isSetAnimation();

	/**
	 * Returns the value of the '<em><b>Placeholders</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.Placeholder}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Placeholders</em>' containment reference list.
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.ContentPackage#getPlaceholderGroup_Placeholders()
	 * @model containment="true"
	 * @generated
	 */
	EList<Placeholder> getPlaceholders();

} // PlaceholderGroup
