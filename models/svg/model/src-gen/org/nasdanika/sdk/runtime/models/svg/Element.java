/**
 */
package org.nasdanika.sdk.runtime.models.svg;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 *  ============================================================================
 * Common attributes
 * ============================================================================
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.svg.Element#getId <em>Id</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.svg.Element#getStyleClass <em>Style Class</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.svg.Element#getStyleAttribute <em>Style Attribute</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.svg.Element#getTransform <em>Transform</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.sdk.runtime.models.svg.SvgPackage#getElement()
 * @model abstract="true"
 *        extendedMetaData="name='Element' kind='empty'"
 * @generated
 */
public interface Element extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see org.nasdanika.sdk.runtime.models.svg.SvgPackage#getElement_Id()
	 * @model unique="false"
	 *        extendedMetaData="kind='attribute' name='id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.svg.Element#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Style Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  The class attribute: names of CSS classes, separated by spaces.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Style Class</em>' attribute.
	 * @see #setStyleClass(String)
	 * @see org.nasdanika.sdk.runtime.models.svg.SvgPackage#getElement_StyleClass()
	 * @model unique="false"
	 *        extendedMetaData="kind='attribute' name='class'"
	 * @generated
	 */
	String getStyleClass();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.svg.Element#getStyleClass <em>Style Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Style Class</em>' attribute.
	 * @see #getStyleClass()
	 * @generated
	 */
	void setStyleClass(String value);

	/**
	 * Returns the value of the '<em><b>Style Attribute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Inline CSS.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Style Attribute</em>' attribute.
	 * @see #setStyleAttribute(String)
	 * @see org.nasdanika.sdk.runtime.models.svg.SvgPackage#getElement_StyleAttribute()
	 * @model unique="false"
	 *        extendedMetaData="kind='attribute' name='style'"
	 * @generated
	 */
	String getStyleAttribute();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.svg.Element#getStyleAttribute <em>Style Attribute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Style Attribute</em>' attribute.
	 * @see #getStyleAttribute()
	 * @generated
	 */
	void setStyleAttribute(String value);

	/**
	 * Returns the value of the '<em><b>Transform</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transform</em>' attribute.
	 * @see #setTransform(String)
	 * @see org.nasdanika.sdk.runtime.models.svg.SvgPackage#getElement_Transform()
	 * @model unique="false"
	 *        extendedMetaData="kind='attribute' name='transform'"
	 * @generated
	 */
	String getTransform();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.svg.Element#getTransform <em>Transform</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transform</em>' attribute.
	 * @see #getTransform()
	 * @generated
	 */
	void setTransform(String value);

} // Element
