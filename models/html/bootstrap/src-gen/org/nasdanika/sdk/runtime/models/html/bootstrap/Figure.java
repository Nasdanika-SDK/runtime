/**
 */
package org.nasdanika.sdk.runtime.models.html.bootstrap;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Figure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.bootstrap.Figure#getImage <em>Image</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.bootstrap.Figure#getCaption <em>Caption</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.BootstrapPackage#getFigure()
 * @model annotation="urn:org.nasdanika:html tag='figure' classes='figure'"
 * @generated
 */
public interface Figure extends BootstrapElement {
	/**
	 * Returns the value of the '<em><b>Image</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Image</em>' containment reference.
	 * @see #setImage(FigureImage)
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.BootstrapPackage#getFigure_Image()
	 * @model containment="true"
	 * @generated
	 */
	FigureImage getImage();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.Figure#getImage <em>Image</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Image</em>' containment reference.
	 * @see #getImage()
	 * @generated
	 */
	void setImage(FigureImage value);

	/**
	 * Returns the value of the '<em><b>Caption</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Caption</em>' containment reference.
	 * @see #setCaption(FigureCaption)
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.BootstrapPackage#getFigure_Caption()
	 * @model containment="true"
	 * @generated
	 */
	FigureCaption getCaption();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.Figure#getCaption <em>Caption</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Caption</em>' containment reference.
	 * @see #getCaption()
	 * @generated
	 */
	void setCaption(FigureCaption value);

} // Figure
