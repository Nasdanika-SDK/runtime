/**
 */
package org.nasdanika.sdk.runtime.models.drawio;

import org.eclipse.emf.common.util.EList;

import org.nasdanika.sdk.runtime.models.presentation.Slide;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Page</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 *  mxfile/diagram - a page is a slide is a diagram.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.drawio.Page#getDx <em>Dx</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.drawio.Page#getDy <em>Dy</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.drawio.Page#getPageWidth <em>Page Width</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.drawio.Page#getPageHeight <em>Page Height</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.drawio.Page#getGridSize <em>Grid Size</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.drawio.Page#getTags <em>Tags</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.sdk.runtime.models.drawio.DrawioPackage#getPage()
 * @model
 * @generated
 */
public interface Page extends Slide, LinkTarget {
	/**
	 * Returns the value of the '<em><b>Dx</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  mxGraphModel attributes worth keeping.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dx</em>' attribute.
	 * @see #setDx(double)
	 * @see org.nasdanika.sdk.runtime.models.drawio.DrawioPackage#getPage_Dx()
	 * @model unique="false"
	 * @generated
	 */
	double getDx();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.drawio.Page#getDx <em>Dx</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dx</em>' attribute.
	 * @see #getDx()
	 * @generated
	 */
	void setDx(double value);

	/**
	 * Returns the value of the '<em><b>Dy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dy</em>' attribute.
	 * @see #setDy(double)
	 * @see org.nasdanika.sdk.runtime.models.drawio.DrawioPackage#getPage_Dy()
	 * @model unique="false"
	 * @generated
	 */
	double getDy();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.drawio.Page#getDy <em>Dy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dy</em>' attribute.
	 * @see #getDy()
	 * @generated
	 */
	void setDy(double value);

	/**
	 * Returns the value of the '<em><b>Page Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Page Width</em>' attribute.
	 * @see #setPageWidth(double)
	 * @see org.nasdanika.sdk.runtime.models.drawio.DrawioPackage#getPage_PageWidth()
	 * @model unique="false"
	 * @generated
	 */
	double getPageWidth();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.drawio.Page#getPageWidth <em>Page Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Page Width</em>' attribute.
	 * @see #getPageWidth()
	 * @generated
	 */
	void setPageWidth(double value);

	/**
	 * Returns the value of the '<em><b>Page Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Page Height</em>' attribute.
	 * @see #setPageHeight(double)
	 * @see org.nasdanika.sdk.runtime.models.drawio.DrawioPackage#getPage_PageHeight()
	 * @model unique="false"
	 * @generated
	 */
	double getPageHeight();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.drawio.Page#getPageHeight <em>Page Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Page Height</em>' attribute.
	 * @see #getPageHeight()
	 * @generated
	 */
	void setPageHeight(double value);

	/**
	 * Returns the value of the '<em><b>Grid Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Grid Size</em>' attribute.
	 * @see #setGridSize(double)
	 * @see org.nasdanika.sdk.runtime.models.drawio.DrawioPackage#getPage_GridSize()
	 * @model unique="false"
	 * @generated
	 */
	double getGridSize();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.drawio.Page#getGridSize <em>Grid Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Grid Size</em>' attribute.
	 * @see #getGridSize()
	 * @generated
	 */
	void setGridSize(double value);

	/**
	 * Returns the value of the '<em><b>Tags</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.sdk.runtime.models.drawio.Tag}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tags</em>' containment reference list.
	 * @see org.nasdanika.sdk.runtime.models.drawio.DrawioPackage#getPage_Tags()
	 * @model containment="true"
	 * @generated
	 */
	EList<Tag> getTags();

} // Page
