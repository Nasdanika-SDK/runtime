/**
 */
package org.nasdanika.sdk.runtime.models.react.bootstrap;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;

import org.nasdanika.sdk.runtime.models.react.LibraryComponent;

import org.nasdanika.sdk.runtime.models.typescript.NamedTypeReference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Base of React Bootstrap components. Props every component passes to its element.
 *  * Inherited model features - id, name, documentation, markers, ... - are not props.
 * Props with these names are features with other names and a prop annotation,
 * e.g. elementId for id and fieldName for name.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.bootstrap.BootstrapComponent#getElementId <em>Element Id</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.bootstrap.BootstrapComponent#getClasses <em>Classes</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.bootstrap.BootstrapComponent#getStyle <em>Style</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.bootstrap.BootstrapComponent#getAs <em>As</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.bootstrap.BootstrapComponent#getAsComponent <em>As Component</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.BootstrapPackage#getBootstrapComponent()
 * @model abstract="true"
 *        annotation="urn:org.nasdanika:react module='react-bootstrap'"
 * @generated
 */
public interface BootstrapComponent extends LibraryComponent {
	/**
	 * Returns the value of the '<em><b>Element Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  DOM id
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Element Id</em>' attribute.
	 * @see #setElementId(String)
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.BootstrapPackage#getBootstrapComponent_ElementId()
	 * @model unique="false"
	 *        annotation="urn:org.nasdanika:react prop='id'"
	 * @generated
	 */
	String getElementId();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.BootstrapComponent#getElementId <em>Element Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element Id</em>' attribute.
	 * @see #getElementId()
	 * @generated
	 */
	void setElementId(String value);

	/**
	 * Returns the value of the '<em><b>Classes</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classes</em>' attribute list.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.BootstrapPackage#getBootstrapComponent_Classes()
	 * @model unique="false"
	 *        annotation="urn:org.nasdanika:react prop='className' join=' '"
	 * @generated
	 */
	EList<String> getClasses();

	/**
	 * Returns the value of the '<em><b>Style</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Style</em>' map.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.BootstrapPackage#getBootstrapComponent_Style()
	 * @model mapType="org.nasdanika.sdk.runtime.models.core.StringToStringMapEntry&lt;org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString&gt;"
	 *        annotation="urn:org.nasdanika:react style='true'"
	 * @generated
	 */
	EMap<String, String> getStyle();

	/**
	 * Returns the value of the '<em><b>As</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Element type to render as, e.g. "a" or "section"
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>As</em>' attribute.
	 * @see #setAs(String)
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.BootstrapPackage#getBootstrapComponent_As()
	 * @model unique="false"
	 * @generated
	 */
	String getAs();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.BootstrapComponent#getAs <em>As</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>As</em>' attribute.
	 * @see #getAs()
	 * @generated
	 */
	void setAs(String value);

	/**
	 * Returns the value of the '<em><b>As Component</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Component to render as, e.g. Col for Form.Group as={Col}. Wins over as.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>As Component</em>' containment reference.
	 * @see #setAsComponent(NamedTypeReference)
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.BootstrapPackage#getBootstrapComponent_AsComponent()
	 * @model containment="true"
	 *        annotation="urn:org.nasdanika:react prop='as'"
	 * @generated
	 */
	NamedTypeReference getAsComponent();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.BootstrapComponent#getAsComponent <em>As Component</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>As Component</em>' containment reference.
	 * @see #getAsComponent()
	 * @generated
	 */
	void setAsComponent(NamedTypeReference value);

} // BootstrapComponent
