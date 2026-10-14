/**
 */
package org.nasdanika.sdk.runtime.models.react.bootstrap.components.content;

import org.eclipse.emf.common.util.EList;

import org.nasdanika.sdk.runtime.models.react.bootstrap.BootstrapComponent;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Button Toolbar</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.content.ButtonToolbar#getGroups <em>Groups</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.content.ContentPackage#getButtonToolbar()
 * @model annotation="urn:org.nasdanika:react component='ButtonToolbar'"
 * @generated
 */
public interface ButtonToolbar extends BootstrapComponent {
	/**
	 * Returns the value of the '<em><b>Groups</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.content.ButtonGroup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Groups</em>' containment reference list.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.content.ContentPackage#getButtonToolbar_Groups()
	 * @model containment="true"
	 * @generated
	 */
	EList<ButtonGroup> getGroups();

} // ButtonToolbar
