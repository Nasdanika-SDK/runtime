/**
 */
package org.nasdanika.sdk.runtime.models.react.bootstrap.components.content;

import org.eclipse.emf.common.util.EList;

import org.nasdanika.sdk.runtime.models.react.bootstrap.BootstrapComponent;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Card Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.content.CardGroup#getCards <em>Cards</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.content.ContentPackage#getCardGroup()
 * @model annotation="urn:org.nasdanika:react component='CardGroup'"
 * @generated
 */
public interface CardGroup extends BootstrapComponent {
	/**
	 * Returns the value of the '<em><b>Cards</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.content.Card}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cards</em>' containment reference list.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.content.ContentPackage#getCardGroup_Cards()
	 * @model containment="true"
	 * @generated
	 */
	EList<Card> getCards();

} // CardGroup
