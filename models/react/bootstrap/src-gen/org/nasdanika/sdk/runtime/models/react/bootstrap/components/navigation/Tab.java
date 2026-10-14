/**
 */
package org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation;

import org.nasdanika.sdk.runtime.models.react.JsxNode;

import org.nasdanika.sdk.runtime.models.react.bootstrap.BootstrapComponent;
import org.nasdanika.sdk.runtime.models.react.bootstrap.TextContent;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tab</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A tab and its pane. The pane content is children.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.Tab#getEventKey <em>Event Key</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.Tab#getTitle <em>Title</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.Tab#getTitleNode <em>Title Node</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.Tab#isDisabled <em>Disabled</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.NavigationPackage#getTab()
 * @model annotation="urn:org.nasdanika:react component='Tab'"
 * @generated
 */
public interface Tab extends BootstrapComponent, TextContent {
	/**
	 * Returns the value of the '<em><b>Event Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event Key</em>' attribute.
	 * @see #setEventKey(String)
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.NavigationPackage#getTab_EventKey()
	 * @model unique="false"
	 * @generated
	 */
	String getEventKey();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.Tab#getEventKey <em>Event Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event Key</em>' attribute.
	 * @see #getEventKey()
	 * @generated
	 */
	void setEventKey(String value);

	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.NavigationPackage#getTab_Title()
	 * @model unique="false"
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.Tab#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Title Node</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title Node</em>' containment reference.
	 * @see #setTitleNode(JsxNode)
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.NavigationPackage#getTab_TitleNode()
	 * @model containment="true"
	 *        annotation="urn:org.nasdanika:react prop='title'"
	 * @generated
	 */
	JsxNode getTitleNode();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.Tab#getTitleNode <em>Title Node</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title Node</em>' containment reference.
	 * @see #getTitleNode()
	 * @generated
	 */
	void setTitleNode(JsxNode value);

	/**
	 * Returns the value of the '<em><b>Disabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Disabled</em>' attribute.
	 * @see #setDisabled(boolean)
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.NavigationPackage#getTab_Disabled()
	 * @model unique="false"
	 * @generated
	 */
	boolean isDisabled();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.Tab#isDisabled <em>Disabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Disabled</em>' attribute.
	 * @see #isDisabled()
	 * @generated
	 */
	void setDisabled(boolean value);

} // Tab
