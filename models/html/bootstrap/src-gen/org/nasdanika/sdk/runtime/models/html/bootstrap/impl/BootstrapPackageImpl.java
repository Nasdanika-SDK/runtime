/**
 */
package org.nasdanika.sdk.runtime.models.html.bootstrap.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.nasdanika.sdk.runtime.models.core.CorePackage;

import org.nasdanika.sdk.runtime.models.html.HtmlPackage;

import org.nasdanika.sdk.runtime.models.html.bootstrap.AspectRatio;
import org.nasdanika.sdk.runtime.models.html.bootstrap.BootstrapDocument;
import org.nasdanika.sdk.runtime.models.html.bootstrap.BootstrapElement;
import org.nasdanika.sdk.runtime.models.html.bootstrap.BootstrapFactory;
import org.nasdanika.sdk.runtime.models.html.bootstrap.BootstrapPackage;
import org.nasdanika.sdk.runtime.models.html.bootstrap.Breakpoint;
import org.nasdanika.sdk.runtime.models.html.bootstrap.ButtonVariant;
import org.nasdanika.sdk.runtime.models.html.bootstrap.Col;
import org.nasdanika.sdk.runtime.models.html.bootstrap.ColorMode;
import org.nasdanika.sdk.runtime.models.html.bootstrap.ColumnSize;
import org.nasdanika.sdk.runtime.models.html.bootstrap.Figure;
import org.nasdanika.sdk.runtime.models.html.bootstrap.FigureCaption;
import org.nasdanika.sdk.runtime.models.html.bootstrap.FigureImage;
import org.nasdanika.sdk.runtime.models.html.bootstrap.Image;
import org.nasdanika.sdk.runtime.models.html.bootstrap.Ratio;
import org.nasdanika.sdk.runtime.models.html.bootstrap.Row;
import org.nasdanika.sdk.runtime.models.html.bootstrap.RowColumns;
import org.nasdanika.sdk.runtime.models.html.bootstrap.Size;
import org.nasdanika.sdk.runtime.models.html.bootstrap.Stack;
import org.nasdanika.sdk.runtime.models.html.bootstrap.TextContent;
import org.nasdanika.sdk.runtime.models.html.bootstrap.Theme;
import org.nasdanika.sdk.runtime.models.html.bootstrap.Variant;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BootstrapPackageImpl extends EPackageImpl implements BootstrapPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bootstrapElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass textContentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass columnSizeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rowColumnsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bootstrapDocumentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass containerEClass = null;

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
	private EClass colEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stackEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ratioEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass imageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass figureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass figureImageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass figureCaptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum variantEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum buttonVariantEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum sizeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum breakpointEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum colorModeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum themeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum aspectRatioEEnum = null;

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
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.BootstrapPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private BootstrapPackageImpl() {
		super(eNS_URI, BootstrapFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link BootstrapPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static BootstrapPackage init() {
		if (isInited) return (BootstrapPackage)EPackage.Registry.INSTANCE.getEPackage(BootstrapPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredBootstrapPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		BootstrapPackageImpl theBootstrapPackage = registeredBootstrapPackage instanceof BootstrapPackageImpl ? (BootstrapPackageImpl)registeredBootstrapPackage : new BootstrapPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		HtmlPackage.eINSTANCE.eClass();
		CorePackage.eINSTANCE.eClass();
		EcorePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theBootstrapPackage.createPackageContents();

		// Initialize created meta-data
		theBootstrapPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theBootstrapPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(BootstrapPackage.eNS_URI, theBootstrapPackage);
		return theBootstrapPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBootstrapElement() {
		return bootstrapElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTextContent() {
		return textContentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextContent_Content() {
		return (EAttribute)textContentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getColumnSize() {
		return columnSizeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getColumnSize_Breakpoint() {
		return (EAttribute)columnSizeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getColumnSize_Span() {
		return (EAttribute)columnSizeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getColumnSize_Auto() {
		return (EAttribute)columnSizeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getColumnSize_Offset() {
		return (EAttribute)columnSizeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getColumnSize_Order() {
		return (EAttribute)columnSizeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRowColumns() {
		return rowColumnsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRowColumns_Breakpoint() {
		return (EAttribute)rowColumnsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRowColumns_Count() {
		return (EAttribute)rowColumnsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRowColumns_Auto() {
		return (EAttribute)rowColumnsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBootstrapDocument() {
		return bootstrapDocumentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBootstrapDocument_Theme() {
		return (EAttribute)bootstrapDocumentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBootstrapDocument_ColorMode() {
		return (EAttribute)bootstrapDocumentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBootstrapDocument_BootstrapVersion() {
		return (EAttribute)bootstrapDocumentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBootstrapDocument_BootswatchVersion() {
		return (EAttribute)bootstrapDocumentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBootstrapDocument_JavaScript() {
		return (EAttribute)bootstrapDocumentEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContainer() {
		return containerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainer_Fluid() {
		return (EAttribute)containerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainer_FluidUntil() {
		return (EAttribute)containerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContainer_Rows() {
		return (EReference)containerEClass.getEStructuralFeatures().get(2);
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
	public EReference getRow_ColumnsPerRow() {
		return (EReference)rowEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRow_Gutter() {
		return (EAttribute)rowEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRow_Columns() {
		return (EReference)rowEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCol() {
		return colEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCol_Sizes() {
		return (EReference)colEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStack() {
		return stackEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStack_Horizontal() {
		return (EAttribute)stackEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStack_Gap() {
		return (EAttribute)stackEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRatio() {
		return ratioEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRatio_AspectRatio() {
		return (EAttribute)ratioEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImage() {
		return imageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImage_Src() {
		return (EAttribute)imageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImage_Alt() {
		return (EAttribute)imageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImage_Fluid() {
		return (EAttribute)imageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImage_Rounded() {
		return (EAttribute)imageEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImage_RoundedCircle() {
		return (EAttribute)imageEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImage_Thumbnail() {
		return (EAttribute)imageEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFigure() {
		return figureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFigure_Image() {
		return (EReference)figureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFigure_Caption() {
		return (EReference)figureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFigureImage() {
		return figureImageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFigureCaption() {
		return figureCaptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getVariant() {
		return variantEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getButtonVariant() {
		return buttonVariantEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSize() {
		return sizeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getBreakpoint() {
		return breakpointEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getColorMode() {
		return colorModeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTheme() {
		return themeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAspectRatio() {
		return aspectRatioEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BootstrapFactory getBootstrapFactory() {
		return (BootstrapFactory)getEFactoryInstance();
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
		bootstrapElementEClass = createEClass(BOOTSTRAP_ELEMENT);

		textContentEClass = createEClass(TEXT_CONTENT);
		createEAttribute(textContentEClass, TEXT_CONTENT__CONTENT);

		columnSizeEClass = createEClass(COLUMN_SIZE);
		createEAttribute(columnSizeEClass, COLUMN_SIZE__BREAKPOINT);
		createEAttribute(columnSizeEClass, COLUMN_SIZE__SPAN);
		createEAttribute(columnSizeEClass, COLUMN_SIZE__AUTO);
		createEAttribute(columnSizeEClass, COLUMN_SIZE__OFFSET);
		createEAttribute(columnSizeEClass, COLUMN_SIZE__ORDER);

		rowColumnsEClass = createEClass(ROW_COLUMNS);
		createEAttribute(rowColumnsEClass, ROW_COLUMNS__BREAKPOINT);
		createEAttribute(rowColumnsEClass, ROW_COLUMNS__COUNT);
		createEAttribute(rowColumnsEClass, ROW_COLUMNS__AUTO);

		bootstrapDocumentEClass = createEClass(BOOTSTRAP_DOCUMENT);
		createEAttribute(bootstrapDocumentEClass, BOOTSTRAP_DOCUMENT__THEME);
		createEAttribute(bootstrapDocumentEClass, BOOTSTRAP_DOCUMENT__COLOR_MODE);
		createEAttribute(bootstrapDocumentEClass, BOOTSTRAP_DOCUMENT__BOOTSTRAP_VERSION);
		createEAttribute(bootstrapDocumentEClass, BOOTSTRAP_DOCUMENT__BOOTSWATCH_VERSION);
		createEAttribute(bootstrapDocumentEClass, BOOTSTRAP_DOCUMENT__JAVA_SCRIPT);

		containerEClass = createEClass(CONTAINER);
		createEAttribute(containerEClass, CONTAINER__FLUID);
		createEAttribute(containerEClass, CONTAINER__FLUID_UNTIL);
		createEReference(containerEClass, CONTAINER__ROWS);

		rowEClass = createEClass(ROW);
		createEReference(rowEClass, ROW__COLUMNS_PER_ROW);
		createEAttribute(rowEClass, ROW__GUTTER);
		createEReference(rowEClass, ROW__COLUMNS);

		colEClass = createEClass(COL);
		createEReference(colEClass, COL__SIZES);

		stackEClass = createEClass(STACK);
		createEAttribute(stackEClass, STACK__HORIZONTAL);
		createEAttribute(stackEClass, STACK__GAP);

		ratioEClass = createEClass(RATIO);
		createEAttribute(ratioEClass, RATIO__ASPECT_RATIO);

		imageEClass = createEClass(IMAGE);
		createEAttribute(imageEClass, IMAGE__SRC);
		createEAttribute(imageEClass, IMAGE__ALT);
		createEAttribute(imageEClass, IMAGE__FLUID);
		createEAttribute(imageEClass, IMAGE__ROUNDED);
		createEAttribute(imageEClass, IMAGE__ROUNDED_CIRCLE);
		createEAttribute(imageEClass, IMAGE__THUMBNAIL);

		figureEClass = createEClass(FIGURE);
		createEReference(figureEClass, FIGURE__IMAGE);
		createEReference(figureEClass, FIGURE__CAPTION);

		figureImageEClass = createEClass(FIGURE_IMAGE);

		figureCaptionEClass = createEClass(FIGURE_CAPTION);

		// Create enums
		variantEEnum = createEEnum(VARIANT);
		buttonVariantEEnum = createEEnum(BUTTON_VARIANT);
		sizeEEnum = createEEnum(SIZE);
		breakpointEEnum = createEEnum(BREAKPOINT);
		colorModeEEnum = createEEnum(COLOR_MODE);
		themeEEnum = createEEnum(THEME);
		aspectRatioEEnum = createEEnum(ASPECT_RATIO);
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
		HtmlPackage theHtmlPackage = (HtmlPackage)EPackage.Registry.INSTANCE.getEPackage(HtmlPackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		bootstrapElementEClass.getESuperTypes().add(theHtmlPackage.getLibraryElement());
		bootstrapDocumentEClass.getESuperTypes().add(theHtmlPackage.getDocument());
		containerEClass.getESuperTypes().add(this.getBootstrapElement());
		rowEClass.getESuperTypes().add(this.getBootstrapElement());
		colEClass.getESuperTypes().add(this.getBootstrapElement());
		stackEClass.getESuperTypes().add(this.getBootstrapElement());
		ratioEClass.getESuperTypes().add(this.getBootstrapElement());
		imageEClass.getESuperTypes().add(this.getBootstrapElement());
		figureEClass.getESuperTypes().add(this.getBootstrapElement());
		figureImageEClass.getESuperTypes().add(this.getImage());
		figureCaptionEClass.getESuperTypes().add(this.getBootstrapElement());
		figureCaptionEClass.getESuperTypes().add(this.getTextContent());

		// Initialize classes, features, and operations; add parameters
		initEClass(bootstrapElementEClass, BootstrapElement.class, "BootstrapElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(textContentEClass, TextContent.class, "TextContent", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTextContent_Content(), theEcorePackage.getEString(), "content", null, 0, 1, TextContent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(columnSizeEClass, ColumnSize.class, "ColumnSize", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getColumnSize_Breakpoint(), this.getBreakpoint(), "breakpoint", null, 0, 1, ColumnSize.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getColumnSize_Span(), theEcorePackage.getEInt(), "span", null, 0, 1, ColumnSize.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getColumnSize_Auto(), theEcorePackage.getEBoolean(), "auto", null, 0, 1, ColumnSize.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getColumnSize_Offset(), theEcorePackage.getEInt(), "offset", null, 0, 1, ColumnSize.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getColumnSize_Order(), theEcorePackage.getEInt(), "order", null, 0, 1, ColumnSize.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rowColumnsEClass, RowColumns.class, "RowColumns", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRowColumns_Breakpoint(), this.getBreakpoint(), "breakpoint", null, 0, 1, RowColumns.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRowColumns_Count(), theEcorePackage.getEInt(), "count", null, 0, 1, RowColumns.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRowColumns_Auto(), theEcorePackage.getEBoolean(), "auto", null, 0, 1, RowColumns.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bootstrapDocumentEClass, BootstrapDocument.class, "BootstrapDocument", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBootstrapDocument_Theme(), this.getTheme(), "theme", null, 0, 1, BootstrapDocument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBootstrapDocument_ColorMode(), this.getColorMode(), "colorMode", null, 0, 1, BootstrapDocument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBootstrapDocument_BootstrapVersion(), theEcorePackage.getEString(), "bootstrapVersion", "5.3.8", 0, 1, BootstrapDocument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBootstrapDocument_BootswatchVersion(), theEcorePackage.getEString(), "bootswatchVersion", "5.3.8", 0, 1, BootstrapDocument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBootstrapDocument_JavaScript(), theEcorePackage.getEBoolean(), "javaScript", "true", 0, 1, BootstrapDocument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(containerEClass, org.nasdanika.sdk.runtime.models.html.bootstrap.Container.class, "Container", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getContainer_Fluid(), theEcorePackage.getEBoolean(), "fluid", null, 0, 1, org.nasdanika.sdk.runtime.models.html.bootstrap.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContainer_FluidUntil(), this.getBreakpoint(), "fluidUntil", null, 0, 1, org.nasdanika.sdk.runtime.models.html.bootstrap.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContainer_Rows(), this.getRow(), null, "rows", null, 0, -1, org.nasdanika.sdk.runtime.models.html.bootstrap.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rowEClass, Row.class, "Row", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRow_ColumnsPerRow(), this.getRowColumns(), null, "columnsPerRow", null, 0, -1, Row.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRow_Gutter(), theEcorePackage.getEInt(), "gutter", null, 0, 1, Row.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRow_Columns(), this.getCol(), null, "columns", null, 0, -1, Row.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(colEClass, Col.class, "Col", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCol_Sizes(), this.getColumnSize(), null, "sizes", null, 0, -1, Col.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stackEClass, Stack.class, "Stack", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStack_Horizontal(), theEcorePackage.getEBoolean(), "horizontal", null, 0, 1, Stack.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStack_Gap(), theEcorePackage.getEInt(), "gap", null, 0, 1, Stack.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ratioEClass, Ratio.class, "Ratio", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRatio_AspectRatio(), this.getAspectRatio(), "aspectRatio", null, 0, 1, Ratio.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(imageEClass, Image.class, "Image", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getImage_Src(), theEcorePackage.getEString(), "src", null, 0, 1, Image.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getImage_Alt(), theEcorePackage.getEString(), "alt", null, 0, 1, Image.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getImage_Fluid(), theEcorePackage.getEBoolean(), "fluid", null, 0, 1, Image.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getImage_Rounded(), theEcorePackage.getEBoolean(), "rounded", null, 0, 1, Image.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getImage_RoundedCircle(), theEcorePackage.getEBoolean(), "roundedCircle", null, 0, 1, Image.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getImage_Thumbnail(), theEcorePackage.getEBoolean(), "thumbnail", null, 0, 1, Image.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(figureEClass, Figure.class, "Figure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFigure_Image(), this.getFigureImage(), null, "image", null, 0, 1, Figure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFigure_Caption(), this.getFigureCaption(), null, "caption", null, 0, 1, Figure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(figureImageEClass, FigureImage.class, "FigureImage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(figureCaptionEClass, FigureCaption.class, "FigureCaption", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(variantEEnum, Variant.class, "Variant");
		addEEnumLiteral(variantEEnum, Variant.PRIMARY);
		addEEnumLiteral(variantEEnum, Variant.SECONDARY);
		addEEnumLiteral(variantEEnum, Variant.SUCCESS);
		addEEnumLiteral(variantEEnum, Variant.DANGER);
		addEEnumLiteral(variantEEnum, Variant.WARNING);
		addEEnumLiteral(variantEEnum, Variant.INFO);
		addEEnumLiteral(variantEEnum, Variant.LIGHT);
		addEEnumLiteral(variantEEnum, Variant.DARK);

		initEEnum(buttonVariantEEnum, ButtonVariant.class, "ButtonVariant");
		addEEnumLiteral(buttonVariantEEnum, ButtonVariant.PRIMARY);
		addEEnumLiteral(buttonVariantEEnum, ButtonVariant.SECONDARY);
		addEEnumLiteral(buttonVariantEEnum, ButtonVariant.SUCCESS);
		addEEnumLiteral(buttonVariantEEnum, ButtonVariant.DANGER);
		addEEnumLiteral(buttonVariantEEnum, ButtonVariant.WARNING);
		addEEnumLiteral(buttonVariantEEnum, ButtonVariant.INFO);
		addEEnumLiteral(buttonVariantEEnum, ButtonVariant.LIGHT);
		addEEnumLiteral(buttonVariantEEnum, ButtonVariant.DARK);
		addEEnumLiteral(buttonVariantEEnum, ButtonVariant.LINK);
		addEEnumLiteral(buttonVariantEEnum, ButtonVariant.OUTLINE_PRIMARY);
		addEEnumLiteral(buttonVariantEEnum, ButtonVariant.OUTLINE_SECONDARY);
		addEEnumLiteral(buttonVariantEEnum, ButtonVariant.OUTLINE_SUCCESS);
		addEEnumLiteral(buttonVariantEEnum, ButtonVariant.OUTLINE_DANGER);
		addEEnumLiteral(buttonVariantEEnum, ButtonVariant.OUTLINE_WARNING);
		addEEnumLiteral(buttonVariantEEnum, ButtonVariant.OUTLINE_INFO);
		addEEnumLiteral(buttonVariantEEnum, ButtonVariant.OUTLINE_LIGHT);
		addEEnumLiteral(buttonVariantEEnum, ButtonVariant.OUTLINE_DARK);

		initEEnum(sizeEEnum, Size.class, "Size");
		addEEnumLiteral(sizeEEnum, Size.SM);
		addEEnumLiteral(sizeEEnum, Size.LG);

		initEEnum(breakpointEEnum, Breakpoint.class, "Breakpoint");
		addEEnumLiteral(breakpointEEnum, Breakpoint.XS);
		addEEnumLiteral(breakpointEEnum, Breakpoint.SM);
		addEEnumLiteral(breakpointEEnum, Breakpoint.MD);
		addEEnumLiteral(breakpointEEnum, Breakpoint.LG);
		addEEnumLiteral(breakpointEEnum, Breakpoint.XL);
		addEEnumLiteral(breakpointEEnum, Breakpoint.XXL);

		initEEnum(colorModeEEnum, ColorMode.class, "ColorMode");
		addEEnumLiteral(colorModeEEnum, ColorMode.LIGHT);
		addEEnumLiteral(colorModeEEnum, ColorMode.DARK);

		initEEnum(themeEEnum, Theme.class, "Theme");
		addEEnumLiteral(themeEEnum, Theme.BOOTSTRAP);
		addEEnumLiteral(themeEEnum, Theme.BRITE);
		addEEnumLiteral(themeEEnum, Theme.CERULEAN);
		addEEnumLiteral(themeEEnum, Theme.COSMO);
		addEEnumLiteral(themeEEnum, Theme.CYBORG);
		addEEnumLiteral(themeEEnum, Theme.DARKLY);
		addEEnumLiteral(themeEEnum, Theme.FLATLY);
		addEEnumLiteral(themeEEnum, Theme.JOURNAL);
		addEEnumLiteral(themeEEnum, Theme.LITERA);
		addEEnumLiteral(themeEEnum, Theme.LUMEN);
		addEEnumLiteral(themeEEnum, Theme.LUX);
		addEEnumLiteral(themeEEnum, Theme.MATERIA);
		addEEnumLiteral(themeEEnum, Theme.MINTY);
		addEEnumLiteral(themeEEnum, Theme.MORPH);
		addEEnumLiteral(themeEEnum, Theme.PULSE);
		addEEnumLiteral(themeEEnum, Theme.QUARTZ);
		addEEnumLiteral(themeEEnum, Theme.SANDSTONE);
		addEEnumLiteral(themeEEnum, Theme.SIMPLEX);
		addEEnumLiteral(themeEEnum, Theme.SKETCHY);
		addEEnumLiteral(themeEEnum, Theme.SLATE);
		addEEnumLiteral(themeEEnum, Theme.SOLAR);
		addEEnumLiteral(themeEEnum, Theme.SPACELAB);
		addEEnumLiteral(themeEEnum, Theme.SUPERHERO);
		addEEnumLiteral(themeEEnum, Theme.UNITED);
		addEEnumLiteral(themeEEnum, Theme.VAPOR);
		addEEnumLiteral(themeEEnum, Theme.YETI);
		addEEnumLiteral(themeEEnum, Theme.ZEPHYR);

		initEEnum(aspectRatioEEnum, AspectRatio.class, "AspectRatio");
		addEEnumLiteral(aspectRatioEEnum, AspectRatio.R1X1);
		addEEnumLiteral(aspectRatioEEnum, AspectRatio.R4X3);
		addEEnumLiteral(aspectRatioEEnum, AspectRatio.R16X9);
		addEEnumLiteral(aspectRatioEEnum, AspectRatio.R21X9);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/GenModel
		createGenModelAnnotations();
		// http://www.eclipse.org/emf/2011/Xcore
		createXcoreAnnotations();
		// urn:org.nasdanika:html
		createUrnorgAnnotations();
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
			   "modelDirectory", "/bootstrap/src-gen",
			   "featureDelegation", "Dynamic",
			   "complianceLevel", "25",
			   "suppressGenModelAnnotations", "false",
			   "copyrightFields", "false",
			   "operationReflection", "true",
			   "importOrganizing", "true",
			   "basePackage", "org.nasdanika.sdk.runtime.models.html"
		   });
		addAnnotation
		  (bootstrapElementEClass,
		   source,
		   new String[] {
			   "documentation", "Base of Bootstrap elements. id, classes, style and attributes are inherited from\nthe HTML element; classes are added to the classes the element contributes."
		   });
		addAnnotation
		  (textContentEClass,
		   source,
		   new String[] {
			   "documentation", "Text content of an element, rendered as a text child after the children of\ncontainment features and before contents."
		   });
		addAnnotation
		  (variantEEnum,
		   source,
		   new String[] {
			   "documentation", " Theme colors"
		   });
		addAnnotation
		  (colorModeEEnum,
		   source,
		   new String[] {
			   "documentation", " data-bs-theme of a document or an element"
		   });
		addAnnotation
		  (themeEEnum,
		   source,
		   new String[] {
			   "documentation", "Bootstrap CSS, or a Bootswatch theme (https://bootswatch.com/)."
		   });
		addAnnotation
		  (columnSizeEClass,
		   source,
		   new String[] {
			   "documentation", "Columns at a breakpoint - of a Col, of a horizontal form label or of a placeholder:\ncol-6, col-md-4 offset-md-2, col-lg-auto."
		   });
		addAnnotation
		  (getColumnSize_Span(),
		   source,
		   new String[] {
			   "documentation", " 1 - 12"
		   });
		addAnnotation
		  (getColumnSize_Auto(),
		   source,
		   new String[] {
			   "documentation", " Natural width of the content"
		   });
		addAnnotation
		  (rowColumnsEClass,
		   source,
		   new String[] {
			   "documentation", "Columns per row at a breakpoint: row-cols-1 row-cols-md-3."
		   });
		addAnnotation
		  (bootstrapDocumentEClass,
		   source,
		   new String[] {
			   "documentation", "A page with Bootstrap or a Bootswatch theme. The theme stylesheet is added to the head\nbefore other stylesheets, the Bootstrap JavaScript bundle to the end of the body,\nfollowed by initialization of tooltips and popovers if the page has any."
		   });
		addAnnotation
		  (getBootstrapDocument_ColorMode(),
		   source,
		   new String[] {
			   "documentation", " Light or dark color mode of the page"
		   });
		addAnnotation
		  (getBootstrapDocument_JavaScript(),
		   source,
		   new String[] {
			   "documentation", " Dropdowns, modals, offcanvases, tooltips, ... need the Bootstrap JavaScript bundle"
		   });
		addAnnotation
		  (containerEClass,
		   source,
		   new String[] {
			   "documentation", "container, container-fluid, or container-{breakpoint}."
		   });
		addAnnotation
		  (getContainer_FluidUntil(),
		   source,
		   new String[] {
			   "documentation", " Fluid until the breakpoint. Wins over fluid."
		   });
		addAnnotation
		  (getRow_Gutter(),
		   source,
		   new String[] {
			   "documentation", " Gutter, 0 - 5"
		   });
		addAnnotation
		  (colEClass,
		   source,
		   new String[] {
			   "documentation", "col, or column sizes."
		   });
		addAnnotation
		  (stackEClass,
		   source,
		   new String[] {
			   "documentation", "vstack, or hstack if horizontal."
		   });
		addAnnotation
		  (getStack_Gap(),
		   source,
		   new String[] {
			   "documentation", " 0 - 5"
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
			   "Html", "urn:org.nasdanika:html"
		   });
	}

	/**
	 * Initializes the annotations for <b>urn:org.nasdanika:html</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUrnorgAnnotations() {
		String source = "urn:org.nasdanika:html";
		addAnnotation
		  (getTextContent_Content(),
		   source,
		   new String[] {
			   "child", "true"
		   });
		addAnnotation
		  (getBootstrapDocument_Theme(),
		   source,
		   new String[] {
			   "logical", "true"
		   });
		addAnnotation
		  (getBootstrapDocument_ColorMode(),
		   source,
		   new String[] {
			   "attribute", "data-bs-theme"
		   });
		addAnnotation
		  (getBootstrapDocument_BootstrapVersion(),
		   source,
		   new String[] {
			   "logical", "true"
		   });
		addAnnotation
		  (getBootstrapDocument_BootswatchVersion(),
		   source,
		   new String[] {
			   "logical", "true"
		   });
		addAnnotation
		  (getBootstrapDocument_JavaScript(),
		   source,
		   new String[] {
			   "logical", "true"
		   });
		addAnnotation
		  (containerEClass,
		   source,
		   new String[] {
			   "tag", "div"
		   });
		addAnnotation
		  (getContainer_Fluid(),
		   source,
		   new String[] {
			   "logical", "true"
		   });
		addAnnotation
		  (getContainer_FluidUntil(),
		   source,
		   new String[] {
			   "logical", "true"
		   });
		addAnnotation
		  (rowEClass,
		   source,
		   new String[] {
			   "tag", "div",
			   "classes", "row"
		   });
		addAnnotation
		  (getRow_ColumnsPerRow(),
		   source,
		   new String[] {
			   "logical", "true"
		   });
		addAnnotation
		  (getRow_Gutter(),
		   source,
		   new String[] {
			   "classes", "g-{}"
		   });
		addAnnotation
		  (colEClass,
		   source,
		   new String[] {
			   "tag", "div"
		   });
		addAnnotation
		  (getCol_Sizes(),
		   source,
		   new String[] {
			   "logical", "true"
		   });
		addAnnotation
		  (stackEClass,
		   source,
		   new String[] {
			   "tag", "div"
		   });
		addAnnotation
		  (getStack_Horizontal(),
		   source,
		   new String[] {
			   "logical", "true"
		   });
		addAnnotation
		  (getStack_Gap(),
		   source,
		   new String[] {
			   "classes", "gap-{}"
		   });
		addAnnotation
		  (ratioEClass,
		   source,
		   new String[] {
			   "tag", "div",
			   "classes", "ratio"
		   });
		addAnnotation
		  (getRatio_AspectRatio(),
		   source,
		   new String[] {
			   "classes", "ratio-{}"
		   });
		addAnnotation
		  (imageEClass,
		   source,
		   new String[] {
			   "tag", "img",
			   "voidElement", "true"
		   });
		addAnnotation
		  (getImage_Fluid(),
		   source,
		   new String[] {
			   "classes", "img-fluid"
		   });
		addAnnotation
		  (getImage_Rounded(),
		   source,
		   new String[] {
			   "classes", "rounded"
		   });
		addAnnotation
		  (getImage_RoundedCircle(),
		   source,
		   new String[] {
			   "classes", "rounded-circle"
		   });
		addAnnotation
		  (getImage_Thumbnail(),
		   source,
		   new String[] {
			   "classes", "img-thumbnail"
		   });
		addAnnotation
		  (figureEClass,
		   source,
		   new String[] {
			   "tag", "figure",
			   "classes", "figure"
		   });
		addAnnotation
		  (figureImageEClass,
		   source,
		   new String[] {
			   "classes", "figure-img"
		   });
		addAnnotation
		  (figureCaptionEClass,
		   source,
		   new String[] {
			   "tag", "figcaption",
			   "classes", "figure-caption"
		   });
	}

} //BootstrapPackageImpl
