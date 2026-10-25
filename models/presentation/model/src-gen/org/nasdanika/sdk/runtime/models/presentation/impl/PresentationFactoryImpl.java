/**
 */
package org.nasdanika.sdk.runtime.models.presentation.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.nasdanika.sdk.runtime.models.presentation.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PresentationFactoryImpl extends EFactoryImpl implements PresentationFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PresentationFactory init() {
		try {
			PresentationFactory thePresentationFactory = (PresentationFactory)EPackage.Registry.INSTANCE.getEFactory(PresentationPackage.eNS_URI);
			if (thePresentationFactory != null) {
				return thePresentationFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new PresentationFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PresentationFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case PresentationPackage.PRESENTATION: return createPresentation();
			case PresentationPackage.SLIDE: return createSlide();
			case PresentationPackage.MASTER_SLIDE: return createMasterSlide();
			case PresentationPackage.NOTES: return createNotes();
			case PresentationPackage.GROUP_SHAPE: return createGroupShape();
			case PresentationPackage.TEXT_SHAPE: return createTextShape();
			case PresentationPackage.PARAGRAPH: return createParagraph();
			case PresentationPackage.TEXT_RUN: return createTextRun();
			case PresentationPackage.IMAGE_SHAPE: return createImageShape();
			case PresentationPackage.MEDIA_SHAPE: return createMediaShape();
			case PresentationPackage.TABLE_SHAPE: return createTableShape();
			case PresentationPackage.ROW: return createRow();
			case PresentationPackage.CELL: return createCell();
			case PresentationPackage.CONNECTOR_SHAPE: return createConnectorShape();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Presentation createPresentation() {
		PresentationImpl presentation = new PresentationImpl();
		return presentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Slide createSlide() {
		SlideImpl slide = new SlideImpl();
		return slide;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MasterSlide createMasterSlide() {
		MasterSlideImpl masterSlide = new MasterSlideImpl();
		return masterSlide;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Notes createNotes() {
		NotesImpl notes = new NotesImpl();
		return notes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GroupShape createGroupShape() {
		GroupShapeImpl groupShape = new GroupShapeImpl();
		return groupShape;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextShape createTextShape() {
		TextShapeImpl textShape = new TextShapeImpl();
		return textShape;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Paragraph createParagraph() {
		ParagraphImpl paragraph = new ParagraphImpl();
		return paragraph;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextRun createTextRun() {
		TextRunImpl textRun = new TextRunImpl();
		return textRun;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImageShape createImageShape() {
		ImageShapeImpl imageShape = new ImageShapeImpl();
		return imageShape;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MediaShape createMediaShape() {
		MediaShapeImpl mediaShape = new MediaShapeImpl();
		return mediaShape;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TableShape createTableShape() {
		TableShapeImpl tableShape = new TableShapeImpl();
		return tableShape;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Row createRow() {
		RowImpl row = new RowImpl();
		return row;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cell createCell() {
		CellImpl cell = new CellImpl();
		return cell;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectorShape createConnectorShape() {
		ConnectorShapeImpl connectorShape = new ConnectorShapeImpl();
		return connectorShape;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PresentationPackage getPresentationPackage() {
		return (PresentationPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static PresentationPackage getPackage() {
		return PresentationPackage.eINSTANCE;
	}

} //PresentationFactoryImpl
