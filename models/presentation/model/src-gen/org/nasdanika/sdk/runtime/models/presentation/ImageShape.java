/**
 */
package org.nasdanika.sdk.runtime.models.presentation;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Image Shape</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.presentation.ImageShape#getLocation <em>Location</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.presentation.ImageShape#getContentType <em>Content Type</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.sdk.runtime.models.presentation.PresentationPackage#getImageShape()
 * @model
 * @generated
 */
public interface ImageShape extends Shape {
	/**
	 * Returns the value of the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Image location � URI resolved against the resource, or embedded part name.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Location</em>' attribute.
	 * @see #setLocation(String)
	 * @see org.nasdanika.sdk.runtime.models.presentation.PresentationPackage#getImageShape_Location()
	 * @model unique="false"
	 * @generated
	 */
	String getLocation();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.presentation.ImageShape#getLocation <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' attribute.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(String value);

	/**
	 * Returns the value of the '<em><b>Content Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content Type</em>' attribute.
	 * @see #setContentType(String)
	 * @see org.nasdanika.sdk.runtime.models.presentation.PresentationPackage#getImageShape_ContentType()
	 * @model unique="false"
	 * @generated
	 */
	String getContentType();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.presentation.ImageShape#getContentType <em>Content Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content Type</em>' attribute.
	 * @see #getContentType()
	 * @generated
	 */
	void setContentType(String value);

} // ImageShape
