/**
 */
package org.nasdanika.sdk.runtime.models.html;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.Element#getId <em>Id</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.Element#getClasses <em>Classes</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.Element#getStyle <em>Style</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.Element#getAttributes <em>Attributes</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.sdk.runtime.models.html.HtmlPackage#getElement()
 * @model abstract="true"
 * @generated
 */
public interface Element extends Node {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see org.nasdanika.sdk.runtime.models.html.HtmlPackage#getElement_Id()
	 * @model unique="false"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.html.Element#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Classes</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  class attribute
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Classes</em>' attribute list.
	 * @see org.nasdanika.sdk.runtime.models.html.HtmlPackage#getElement_Classes()
	 * @model unique="false"
	 * @generated
	 */
	EList<String> getClasses();

	/**
	 * Returns the value of the '<em><b>Style</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  style attribute as property to value map
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Style</em>' map.
	 * @see org.nasdanika.sdk.runtime.models.html.HtmlPackage#getElement_Style()
	 * @model mapType="org.nasdanika.sdk.runtime.models.core.StringToStringMapEntry&lt;org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString&gt;"
	 * @generated
	 */
	EMap<String, String> getStyle();

	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Attributes not modeled by the element class, including data-* and aria-*.
	 * Null value - boolean attribute.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Attributes</em>' map.
	 * @see org.nasdanika.sdk.runtime.models.html.HtmlPackage#getElement_Attributes()
	 * @model mapType="org.nasdanika.sdk.runtime.models.core.StringToStringMapEntry&lt;org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString&gt;"
	 * @generated
	 */
	EMap<String, String> getAttributes();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false"
	 * @generated
	 */
	String tagName();

} // Element
