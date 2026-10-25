/**
 */
package org.nasdanika.sdk.runtime.models.presentation;

import org.eclipse.emf.common.util.EList;

import org.nasdanika.sdk.runtime.models.diagram.Diagram;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Presentation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.presentation.Presentation#getWidth <em>Width</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.presentation.Presentation#getHeight <em>Height</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.presentation.Presentation#getSlides <em>Slides</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.presentation.Presentation#getMasterSlides <em>Master Slides</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.sdk.runtime.models.presentation.PresentationPackage#getPresentation()
 * @model
 * @generated
 */
public interface Presentation extends Diagram {
	/**
	 * Returns the value of the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Slide size in points.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Width</em>' attribute.
	 * @see #setWidth(double)
	 * @see org.nasdanika.sdk.runtime.models.presentation.PresentationPackage#getPresentation_Width()
	 * @model unique="false"
	 * @generated
	 */
	double getWidth();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.presentation.Presentation#getWidth <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Width</em>' attribute.
	 * @see #getWidth()
	 * @generated
	 */
	void setWidth(double value);

	/**
	 * Returns the value of the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Height</em>' attribute.
	 * @see #setHeight(double)
	 * @see org.nasdanika.sdk.runtime.models.presentation.PresentationPackage#getPresentation_Height()
	 * @model unique="false"
	 * @generated
	 */
	double getHeight();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.presentation.Presentation#getHeight <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Height</em>' attribute.
	 * @see #getHeight()
	 * @generated
	 */
	void setHeight(double value);

	/**
	 * Returns the value of the '<em><b>Slides</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.sdk.runtime.models.presentation.Slide}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Slides</em>' reference list.
	 * @see org.nasdanika.sdk.runtime.models.presentation.PresentationPackage#getPresentation_Slides()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EList<Slide> getSlides();

	/**
	 * Returns the value of the '<em><b>Master Slides</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.sdk.runtime.models.presentation.MasterSlide}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Master Slides</em>' reference list.
	 * @see org.nasdanika.sdk.runtime.models.presentation.PresentationPackage#getPresentation_MasterSlides()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EList<MasterSlide> getMasterSlides();

} // Presentation
