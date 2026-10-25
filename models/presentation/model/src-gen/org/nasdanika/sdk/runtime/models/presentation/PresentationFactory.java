/**
 */
package org.nasdanika.sdk.runtime.models.presentation;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.nasdanika.sdk.runtime.models.presentation.PresentationPackage
 * @generated
 */
public interface PresentationFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PresentationFactory eINSTANCE = org.nasdanika.sdk.runtime.models.presentation.impl.PresentationFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Presentation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Presentation</em>'.
	 * @generated
	 */
	Presentation createPresentation();

	/**
	 * Returns a new object of class '<em>Slide</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Slide</em>'.
	 * @generated
	 */
	Slide createSlide();

	/**
	 * Returns a new object of class '<em>Master Slide</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Master Slide</em>'.
	 * @generated
	 */
	MasterSlide createMasterSlide();

	/**
	 * Returns a new object of class '<em>Notes</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Notes</em>'.
	 * @generated
	 */
	Notes createNotes();

	/**
	 * Returns a new object of class '<em>Group Shape</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Group Shape</em>'.
	 * @generated
	 */
	GroupShape createGroupShape();

	/**
	 * Returns a new object of class '<em>Text Shape</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Text Shape</em>'.
	 * @generated
	 */
	TextShape createTextShape();

	/**
	 * Returns a new object of class '<em>Paragraph</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Paragraph</em>'.
	 * @generated
	 */
	Paragraph createParagraph();

	/**
	 * Returns a new object of class '<em>Text Run</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Text Run</em>'.
	 * @generated
	 */
	TextRun createTextRun();

	/**
	 * Returns a new object of class '<em>Image Shape</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Image Shape</em>'.
	 * @generated
	 */
	ImageShape createImageShape();

	/**
	 * Returns a new object of class '<em>Media Shape</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Media Shape</em>'.
	 * @generated
	 */
	MediaShape createMediaShape();

	/**
	 * Returns a new object of class '<em>Table Shape</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Table Shape</em>'.
	 * @generated
	 */
	TableShape createTableShape();

	/**
	 * Returns a new object of class '<em>Row</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Row</em>'.
	 * @generated
	 */
	Row createRow();

	/**
	 * Returns a new object of class '<em>Cell</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cell</em>'.
	 * @generated
	 */
	Cell createCell();

	/**
	 * Returns a new object of class '<em>Connector Shape</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Connector Shape</em>'.
	 * @generated
	 */
	ConnectorShape createConnectorShape();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	PresentationPackage getPresentationPackage();

} //PresentationFactory
