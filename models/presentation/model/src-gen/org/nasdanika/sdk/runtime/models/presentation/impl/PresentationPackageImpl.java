/**
 */
package org.nasdanika.sdk.runtime.models.presentation.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.nasdanika.sdk.runtime.models.core.CorePackage;

import org.nasdanika.sdk.runtime.models.diagram.DiagramPackage;

import org.nasdanika.sdk.runtime.models.presentation.Cell;
import org.nasdanika.sdk.runtime.models.presentation.ConnectorShape;
import org.nasdanika.sdk.runtime.models.presentation.GroupShape;
import org.nasdanika.sdk.runtime.models.presentation.ImageShape;
import org.nasdanika.sdk.runtime.models.presentation.MasterSlide;
import org.nasdanika.sdk.runtime.models.presentation.MediaShape;
import org.nasdanika.sdk.runtime.models.presentation.Notes;
import org.nasdanika.sdk.runtime.models.presentation.Paragraph;
import org.nasdanika.sdk.runtime.models.presentation.Presentation;
import org.nasdanika.sdk.runtime.models.presentation.PresentationFactory;
import org.nasdanika.sdk.runtime.models.presentation.PresentationPackage;
import org.nasdanika.sdk.runtime.models.presentation.Row;
import org.nasdanika.sdk.runtime.models.presentation.Shape;
import org.nasdanika.sdk.runtime.models.presentation.Slide;
import org.nasdanika.sdk.runtime.models.presentation.TableShape;
import org.nasdanika.sdk.runtime.models.presentation.TextRun;
import org.nasdanika.sdk.runtime.models.presentation.TextShape;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PresentationPackageImpl extends EPackageImpl implements PresentationPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass presentationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass slideEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass masterSlideEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass notesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass shapeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass groupShapeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass textShapeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass paragraphEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass textRunEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass imageShapeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mediaShapeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tableShapeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rowEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cellEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connectorShapeEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.nasdanika.sdk.runtime.models.presentation.PresentationPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private PresentationPackageImpl() {
		super(eNS_URI, PresentationFactory.eINSTANCE);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link PresentationPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static PresentationPackage init() {
		if (isInited) return (PresentationPackage)EPackage.Registry.INSTANCE.getEPackage(PresentationPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredPresentationPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		PresentationPackageImpl thePresentationPackage = registeredPresentationPackage instanceof PresentationPackageImpl ? (PresentationPackageImpl)registeredPresentationPackage : new PresentationPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		DiagramPackage.eINSTANCE.eClass();
		CorePackage.eINSTANCE.eClass();
		EcorePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		thePresentationPackage.createPackageContents();

		// Initialize created meta-data
		thePresentationPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thePresentationPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(PresentationPackage.eNS_URI, thePresentationPackage);
		return thePresentationPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPresentation() {
		return presentationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPresentation_Width() {
		return (EAttribute)presentationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPresentation_Height() {
		return (EAttribute)presentationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPresentation_Slides() {
		return (EReference)presentationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPresentation_MasterSlides() {
		return (EReference)presentationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSlide() {
		return slideEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSlide_Master() {
		return (EReference)slideEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSlide_Hidden() {
		return (EAttribute)slideEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSlide_Notes() {
		return (EReference)slideEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMasterSlide() {
		return masterSlideEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNotes() {
		return notesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNotes_Text() {
		return (EAttribute)notesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getShape() {
		return shapeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getShape_Order() {
		return (EAttribute)shapeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getShape_Rotation() {
		return (EAttribute)shapeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getShape_FlipHorizontal() {
		return (EAttribute)shapeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getShape_FlipVertical() {
		return (EAttribute)shapeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGroupShape() {
		return groupShapeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTextShape() {
		return textShapeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTextShape_Paragraphs() {
		return (EReference)textShapeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParagraph() {
		return paragraphEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParagraph_Runs() {
		return (EReference)paragraphEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParagraph_IndentLevel() {
		return (EAttribute)paragraphEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParagraph_Alignment() {
		return (EAttribute)paragraphEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTextRun() {
		return textRunEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextRun_Text() {
		return (EAttribute)textRunEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextRun_FontFamily() {
		return (EAttribute)textRunEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextRun_FontSize() {
		return (EAttribute)textRunEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextRun_Bold() {
		return (EAttribute)textRunEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextRun_Italic() {
		return (EAttribute)textRunEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextRun_Underline() {
		return (EAttribute)textRunEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextRun_Color() {
		return (EAttribute)textRunEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextRun_Hyperlink() {
		return (EAttribute)textRunEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImageShape() {
		return imageShapeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImageShape_Location() {
		return (EAttribute)imageShapeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImageShape_ContentType() {
		return (EAttribute)imageShapeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMediaShape() {
		return mediaShapeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMediaShape_Location() {
		return (EAttribute)mediaShapeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMediaShape_ContentType() {
		return (EAttribute)mediaShapeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTableShape() {
		return tableShapeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTableShape_Rows() {
		return (EReference)tableShapeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRow() {
		return rowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRow_Cells() {
		return (EReference)rowEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRow_Height() {
		return (EAttribute)rowEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCell() {
		return cellEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCell_Paragraphs() {
		return (EReference)cellEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCell_ColumnSpan() {
		return (EAttribute)cellEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCell_RowSpan() {
		return (EAttribute)cellEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConnectorShape() {
		return connectorShapeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PresentationFactory getPresentationFactory() {
		return (PresentationFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		presentationEClass = createEClass(PRESENTATION);
		createEAttribute(presentationEClass, PRESENTATION__WIDTH);
		createEAttribute(presentationEClass, PRESENTATION__HEIGHT);
		createEReference(presentationEClass, PRESENTATION__SLIDES);
		createEReference(presentationEClass, PRESENTATION__MASTER_SLIDES);

		slideEClass = createEClass(SLIDE);
		createEReference(slideEClass, SLIDE__MASTER);
		createEAttribute(slideEClass, SLIDE__HIDDEN);
		createEReference(slideEClass, SLIDE__NOTES);

		masterSlideEClass = createEClass(MASTER_SLIDE);

		notesEClass = createEClass(NOTES);
		createEAttribute(notesEClass, NOTES__TEXT);

		shapeEClass = createEClass(SHAPE);
		createEAttribute(shapeEClass, SHAPE__ORDER);
		createEAttribute(shapeEClass, SHAPE__ROTATION);
		createEAttribute(shapeEClass, SHAPE__FLIP_HORIZONTAL);
		createEAttribute(shapeEClass, SHAPE__FLIP_VERTICAL);

		groupShapeEClass = createEClass(GROUP_SHAPE);

		textShapeEClass = createEClass(TEXT_SHAPE);
		createEReference(textShapeEClass, TEXT_SHAPE__PARAGRAPHS);

		paragraphEClass = createEClass(PARAGRAPH);
		createEReference(paragraphEClass, PARAGRAPH__RUNS);
		createEAttribute(paragraphEClass, PARAGRAPH__INDENT_LEVEL);
		createEAttribute(paragraphEClass, PARAGRAPH__ALIGNMENT);

		textRunEClass = createEClass(TEXT_RUN);
		createEAttribute(textRunEClass, TEXT_RUN__TEXT);
		createEAttribute(textRunEClass, TEXT_RUN__FONT_FAMILY);
		createEAttribute(textRunEClass, TEXT_RUN__FONT_SIZE);
		createEAttribute(textRunEClass, TEXT_RUN__BOLD);
		createEAttribute(textRunEClass, TEXT_RUN__ITALIC);
		createEAttribute(textRunEClass, TEXT_RUN__UNDERLINE);
		createEAttribute(textRunEClass, TEXT_RUN__COLOR);
		createEAttribute(textRunEClass, TEXT_RUN__HYPERLINK);

		imageShapeEClass = createEClass(IMAGE_SHAPE);
		createEAttribute(imageShapeEClass, IMAGE_SHAPE__LOCATION);
		createEAttribute(imageShapeEClass, IMAGE_SHAPE__CONTENT_TYPE);

		mediaShapeEClass = createEClass(MEDIA_SHAPE);
		createEAttribute(mediaShapeEClass, MEDIA_SHAPE__LOCATION);
		createEAttribute(mediaShapeEClass, MEDIA_SHAPE__CONTENT_TYPE);

		tableShapeEClass = createEClass(TABLE_SHAPE);
		createEReference(tableShapeEClass, TABLE_SHAPE__ROWS);

		rowEClass = createEClass(ROW);
		createEReference(rowEClass, ROW__CELLS);
		createEAttribute(rowEClass, ROW__HEIGHT);

		cellEClass = createEClass(CELL);
		createEReference(cellEClass, CELL__PARAGRAPHS);
		createEAttribute(cellEClass, CELL__COLUMN_SPAN);
		createEAttribute(cellEClass, CELL__ROW_SPAN);

		connectorShapeEClass = createEClass(CONNECTOR_SHAPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		DiagramPackage theDiagramPackage = (DiagramPackage)EPackage.Registry.INSTANCE.getEPackage(DiagramPackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		presentationEClass.getESuperTypes().add(theDiagramPackage.getDiagram());
		slideEClass.getESuperTypes().add(theDiagramPackage.getDiagram());
		masterSlideEClass.getESuperTypes().add(this.getSlide());
		shapeEClass.getESuperTypes().add(theDiagramPackage.getNode());
		groupShapeEClass.getESuperTypes().add(this.getShape());
		textShapeEClass.getESuperTypes().add(this.getShape());
		imageShapeEClass.getESuperTypes().add(this.getShape());
		mediaShapeEClass.getESuperTypes().add(this.getShape());
		tableShapeEClass.getESuperTypes().add(this.getShape());
		connectorShapeEClass.getESuperTypes().add(theDiagramPackage.getConnection());

		// Initialize classes, features, and operations; add parameters
		initEClass(presentationEClass, Presentation.class, "Presentation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPresentation_Width(), theEcorePackage.getEDouble(), "width", null, 0, 1, Presentation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPresentation_Height(), theEcorePackage.getEDouble(), "height", null, 0, 1, Presentation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPresentation_Slides(), this.getSlide(), null, "slides", null, 0, -1, Presentation.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getPresentation_MasterSlides(), this.getMasterSlide(), null, "masterSlides", null, 0, -1, Presentation.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(slideEClass, Slide.class, "Slide", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSlide_Master(), this.getMasterSlide(), null, "master", null, 0, 1, Slide.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSlide_Hidden(), theEcorePackage.getEBoolean(), "hidden", null, 0, 1, Slide.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSlide_Notes(), this.getNotes(), null, "notes", null, 0, 1, Slide.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(masterSlideEClass, MasterSlide.class, "MasterSlide", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(notesEClass, Notes.class, "Notes", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNotes_Text(), theEcorePackage.getEString(), "text", null, 0, 1, Notes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(shapeEClass, Shape.class, "Shape", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getShape_Order(), theEcorePackage.getEInt(), "order", null, 0, 1, Shape.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShape_Rotation(), theEcorePackage.getEDouble(), "rotation", null, 0, 1, Shape.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShape_FlipHorizontal(), theEcorePackage.getEBoolean(), "flipHorizontal", null, 0, 1, Shape.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShape_FlipVertical(), theEcorePackage.getEBoolean(), "flipVertical", null, 0, 1, Shape.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(groupShapeEClass, GroupShape.class, "GroupShape", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(textShapeEClass, TextShape.class, "TextShape", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTextShape_Paragraphs(), this.getParagraph(), null, "paragraphs", null, 0, -1, TextShape.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(paragraphEClass, Paragraph.class, "Paragraph", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getParagraph_Runs(), this.getTextRun(), null, "runs", null, 0, -1, Paragraph.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParagraph_IndentLevel(), theEcorePackage.getEInt(), "indentLevel", null, 0, 1, Paragraph.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParagraph_Alignment(), theEcorePackage.getEString(), "alignment", null, 0, 1, Paragraph.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(textRunEClass, TextRun.class, "TextRun", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTextRun_Text(), theEcorePackage.getEString(), "text", null, 0, 1, TextRun.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTextRun_FontFamily(), theEcorePackage.getEString(), "fontFamily", null, 0, 1, TextRun.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTextRun_FontSize(), theEcorePackage.getEDouble(), "fontSize", null, 0, 1, TextRun.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTextRun_Bold(), theEcorePackage.getEBoolean(), "bold", null, 0, 1, TextRun.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTextRun_Italic(), theEcorePackage.getEBoolean(), "italic", null, 0, 1, TextRun.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTextRun_Underline(), theEcorePackage.getEBoolean(), "underline", null, 0, 1, TextRun.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTextRun_Color(), theEcorePackage.getEString(), "color", null, 0, 1, TextRun.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTextRun_Hyperlink(), theEcorePackage.getEString(), "hyperlink", null, 0, 1, TextRun.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(imageShapeEClass, ImageShape.class, "ImageShape", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getImageShape_Location(), theEcorePackage.getEString(), "location", null, 0, 1, ImageShape.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getImageShape_ContentType(), theEcorePackage.getEString(), "contentType", null, 0, 1, ImageShape.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mediaShapeEClass, MediaShape.class, "MediaShape", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMediaShape_Location(), theEcorePackage.getEString(), "location", null, 0, 1, MediaShape.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMediaShape_ContentType(), theEcorePackage.getEString(), "contentType", null, 0, 1, MediaShape.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tableShapeEClass, TableShape.class, "TableShape", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTableShape_Rows(), this.getRow(), null, "rows", null, 0, -1, TableShape.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rowEClass, Row.class, "Row", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRow_Cells(), this.getCell(), null, "cells", null, 0, -1, Row.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRow_Height(), theEcorePackage.getEDouble(), "height", null, 0, 1, Row.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cellEClass, Cell.class, "Cell", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCell_Paragraphs(), this.getParagraph(), null, "paragraphs", null, 0, -1, Cell.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCell_ColumnSpan(), theEcorePackage.getEInt(), "columnSpan", "1", 0, 1, Cell.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCell_RowSpan(), theEcorePackage.getEInt(), "rowSpan", "1", 0, 1, Cell.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(connectorShapeEClass, ConnectorShape.class, "ConnectorShape", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/GenModel
		createGenModelAnnotations();
		// http://www.eclipse.org/emf/2011/Xcore
		createXcoreAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/GenModel</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGenModelAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/GenModel";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "modelDirectory", "/model/src-gen",
			   "featureDelegation", "Dynamic",
			   "complianceLevel", "25",
			   "suppressGenModelAnnotations", "false",
			   "copyrightFields", "false",
			   "operationReflection", "true",
			   "importOrganizing", "true",
			   "basePackage", "org.nasdanika.sdk.runtime.models"
		   });
		addAnnotation
		  (getPresentation_Width(),
		   source,
		   new String[] {
			   "documentation", " Slide size in points."
		   });
		addAnnotation
		  (getPresentation_Slides(),
		   source,
		   new String[] {
			   "get", "return new <%org.nasdanika.sdk.runtime.common.DerivedSubsetEList%><<%org.nasdanika.sdk.runtime.models.presentation.Slide%>>(\n\t<%org.nasdanika.sdk.runtime.models.presentation.Slide%>.class, \n\t((<%org.eclipse.emf.ecore.InternalEObject%>) this), \n\t<%org.nasdanika.sdk.runtime.models.presentation.PresentationPackage%>.PRESENTATION__SLIDES, \n\t<%org.nasdanika.sdk.runtime.models.diagram.DiagramPackage%>.DIAGRAM_ELEMENT__CHILDREN);"
		   });
		addAnnotation
		  (getPresentation_MasterSlides(),
		   source,
		   new String[] {
			   "get", "return new <%org.nasdanika.sdk.runtime.common.DerivedSubsetEList%><<%org.nasdanika.sdk.runtime.models.presentation.MasterSlide%>>(\n\t<%org.nasdanika.sdk.runtime.models.presentation.MasterSlide%>.class, \n\t((<%org.eclipse.emf.ecore.InternalEObject%>) this), \n\t<%org.nasdanika.sdk.runtime.models.presentation.PresentationPackage%>.PRESENTATION__MASTER_SLIDES, \n\t<%org.nasdanika.sdk.runtime.models.diagram.DiagramPackage%>.DIAGRAM_ELEMENT__CHILDREN);"
		   });
		addAnnotation
		  (slideEClass,
		   source,
		   new String[] {
			   "documentation", "A slide IS a diagram: shapes are diagram nodes, connectors are diagram connections,\nwhich makes slides convertible to/from Draw.io, Visio, PlantUML."
		   });
		addAnnotation
		  (getSlide_Notes(),
		   source,
		   new String[] {
			   "documentation", "Speaker notes. Also the primary annotation carrier for composability:\na conventional YAML/JSON block in notes is parsed on load into diagram\nproperties / modelElement bindings and re-emitted on save."
		   });
		addAnnotation
		  (shapeEClass,
		   source,
		   new String[] {
			   "documentation", " ---- Shared shape taxonomy ----"
		   });
		addAnnotation
		  (getShape_Order(),
		   source,
		   new String[] {
			   "documentation", " Z-order on the slide."
		   });
		addAnnotation
		  (getTextRun_Color(),
		   source,
		   new String[] {
			   "documentation", " #RRGGBB"
		   });
		addAnnotation
		  (getImageShape_Location(),
		   source,
		   new String[] {
			   "documentation", " Image location \ufffd URI resolved against the resource, or embedded part name."
		   });
		addAnnotation
		  (connectorShapeEClass,
		   source,
		   new String[] {
			   "documentation", " A connector between shapes - a first-class diagram connection."
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2011/Xcore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createXcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2011/Xcore";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "Ecore", "http://www.eclipse.org/emf/2002/Ecore",
			   "GenModel", "http://www.eclipse.org/emf/2002/GenModel",
			   "Nasdanika", "urn:org.nasdanika"
		   });
	}

} //PresentationPackageImpl
