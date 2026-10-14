/**
 */
package org.nasdanika.sdk.runtime.models.react.bootstrap.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.nasdanika.sdk.runtime.models.core.CorePackage;

import org.nasdanika.sdk.runtime.models.html.HtmlPackage;

import org.nasdanika.sdk.runtime.models.react.ReactPackage;

import org.nasdanika.sdk.runtime.models.react.bootstrap.AspectRatio;
import org.nasdanika.sdk.runtime.models.react.bootstrap.BootstrapComponent;
import org.nasdanika.sdk.runtime.models.react.bootstrap.BootstrapFactory;
import org.nasdanika.sdk.runtime.models.react.bootstrap.BootstrapPackage;
import org.nasdanika.sdk.runtime.models.react.bootstrap.Breakpoint;
import org.nasdanika.sdk.runtime.models.react.bootstrap.ButtonVariant;
import org.nasdanika.sdk.runtime.models.react.bootstrap.Col;
import org.nasdanika.sdk.runtime.models.react.bootstrap.ColumnSize;
import org.nasdanika.sdk.runtime.models.react.bootstrap.Direction;
import org.nasdanika.sdk.runtime.models.react.bootstrap.Figure;
import org.nasdanika.sdk.runtime.models.react.bootstrap.FigureCaption;
import org.nasdanika.sdk.runtime.models.react.bootstrap.FigureImage;
import org.nasdanika.sdk.runtime.models.react.bootstrap.Image;
import org.nasdanika.sdk.runtime.models.react.bootstrap.Ratio;
import org.nasdanika.sdk.runtime.models.react.bootstrap.Row;
import org.nasdanika.sdk.runtime.models.react.bootstrap.RowColumns;
import org.nasdanika.sdk.runtime.models.react.bootstrap.Size;
import org.nasdanika.sdk.runtime.models.react.bootstrap.Stack;
import org.nasdanika.sdk.runtime.models.react.bootstrap.TextContent;
import org.nasdanika.sdk.runtime.models.react.bootstrap.ThemeProvider;
import org.nasdanika.sdk.runtime.models.react.bootstrap.Variant;

import org.nasdanika.sdk.runtime.models.typescript.TypescriptPackage;

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
	private EClass bootstrapComponentEClass = null;

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
	private EClass themeProviderEClass = null;

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
	private EEnum directionEEnum = null;

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
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.BootstrapPackage#eNS_URI
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
		ReactPackage.eINSTANCE.eClass();
		CorePackage.eINSTANCE.eClass();
		TypescriptPackage.eINSTANCE.eClass();
		EcorePackage.eINSTANCE.eClass();
		HtmlPackage.eINSTANCE.eClass();

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
	public EClass getBootstrapComponent() {
		return bootstrapComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBootstrapComponent_ElementId() {
		return (EAttribute)bootstrapComponentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBootstrapComponent_Classes() {
		return (EAttribute)bootstrapComponentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBootstrapComponent_Style() {
		return (EReference)bootstrapComponentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBootstrapComponent_As() {
		return (EAttribute)bootstrapComponentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBootstrapComponent_AsComponent() {
		return (EReference)bootstrapComponentEClass.getEStructuralFeatures().get(4);
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
	public EClass getThemeProvider() {
		return themeProviderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getThemeProvider_Breakpoints() {
		return (EAttribute)themeProviderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getThemeProvider_MinBreakpoint() {
		return (EAttribute)themeProviderEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getThemeProvider_Dir() {
		return (EAttribute)themeProviderEClass.getEStructuralFeatures().get(2);
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
	public EReference getRow_Columns() {
		return (EReference)rowEClass.getEStructuralFeatures().get(1);
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
	public EAttribute getStack_Direction() {
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
	public EEnum getDirection() {
		return directionEEnum;
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
		bootstrapComponentEClass = createEClass(BOOTSTRAP_COMPONENT);
		createEAttribute(bootstrapComponentEClass, BOOTSTRAP_COMPONENT__ELEMENT_ID);
		createEAttribute(bootstrapComponentEClass, BOOTSTRAP_COMPONENT__CLASSES);
		createEReference(bootstrapComponentEClass, BOOTSTRAP_COMPONENT__STYLE);
		createEAttribute(bootstrapComponentEClass, BOOTSTRAP_COMPONENT__AS);
		createEReference(bootstrapComponentEClass, BOOTSTRAP_COMPONENT__AS_COMPONENT);

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

		themeProviderEClass = createEClass(THEME_PROVIDER);
		createEAttribute(themeProviderEClass, THEME_PROVIDER__BREAKPOINTS);
		createEAttribute(themeProviderEClass, THEME_PROVIDER__MIN_BREAKPOINT);
		createEAttribute(themeProviderEClass, THEME_PROVIDER__DIR);

		containerEClass = createEClass(CONTAINER);
		createEAttribute(containerEClass, CONTAINER__FLUID);
		createEAttribute(containerEClass, CONTAINER__FLUID_UNTIL);
		createEReference(containerEClass, CONTAINER__ROWS);

		rowEClass = createEClass(ROW);
		createEReference(rowEClass, ROW__COLUMNS_PER_ROW);
		createEReference(rowEClass, ROW__COLUMNS);

		colEClass = createEClass(COL);
		createEReference(colEClass, COL__SIZES);

		stackEClass = createEClass(STACK);
		createEAttribute(stackEClass, STACK__DIRECTION);
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
		directionEEnum = createEEnum(DIRECTION);
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
		ReactPackage theReactPackage = (ReactPackage)EPackage.Registry.INSTANCE.getEPackage(ReactPackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);
		CorePackage theCorePackage = (CorePackage)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI);
		TypescriptPackage theTypescriptPackage = (TypescriptPackage)EPackage.Registry.INSTANCE.getEPackage(TypescriptPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		bootstrapComponentEClass.getESuperTypes().add(theReactPackage.getLibraryComponent());
		themeProviderEClass.getESuperTypes().add(this.getBootstrapComponent());
		containerEClass.getESuperTypes().add(this.getBootstrapComponent());
		rowEClass.getESuperTypes().add(this.getBootstrapComponent());
		colEClass.getESuperTypes().add(this.getBootstrapComponent());
		stackEClass.getESuperTypes().add(this.getBootstrapComponent());
		ratioEClass.getESuperTypes().add(this.getBootstrapComponent());
		imageEClass.getESuperTypes().add(this.getBootstrapComponent());
		figureEClass.getESuperTypes().add(this.getBootstrapComponent());
		figureImageEClass.getESuperTypes().add(this.getImage());
		figureCaptionEClass.getESuperTypes().add(this.getBootstrapComponent());
		figureCaptionEClass.getESuperTypes().add(this.getTextContent());

		// Initialize classes, features, and operations; add parameters
		initEClass(bootstrapComponentEClass, BootstrapComponent.class, "BootstrapComponent", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBootstrapComponent_ElementId(), theEcorePackage.getEString(), "elementId", null, 0, 1, BootstrapComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBootstrapComponent_Classes(), theEcorePackage.getEString(), "classes", null, 0, -1, BootstrapComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBootstrapComponent_Style(), theCorePackage.getStringToStringMapEntry(), null, "style", null, 0, -1, BootstrapComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBootstrapComponent_As(), theEcorePackage.getEString(), "as", null, 0, 1, BootstrapComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBootstrapComponent_AsComponent(), theTypescriptPackage.getNamedTypeReference(), null, "asComponent", null, 0, 1, BootstrapComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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

		initEClass(themeProviderEClass, ThemeProvider.class, "ThemeProvider", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getThemeProvider_Breakpoints(), theEcorePackage.getEString(), "breakpoints", null, 0, -1, ThemeProvider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getThemeProvider_MinBreakpoint(), theEcorePackage.getEString(), "minBreakpoint", null, 0, 1, ThemeProvider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getThemeProvider_Dir(), theEcorePackage.getEString(), "dir", null, 0, 1, ThemeProvider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(containerEClass, org.nasdanika.sdk.runtime.models.react.bootstrap.Container.class, "Container", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getContainer_Fluid(), theEcorePackage.getEBoolean(), "fluid", null, 0, 1, org.nasdanika.sdk.runtime.models.react.bootstrap.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContainer_FluidUntil(), this.getBreakpoint(), "fluidUntil", null, 0, 1, org.nasdanika.sdk.runtime.models.react.bootstrap.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContainer_Rows(), this.getRow(), null, "rows", null, 0, -1, org.nasdanika.sdk.runtime.models.react.bootstrap.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rowEClass, Row.class, "Row", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRow_ColumnsPerRow(), this.getRowColumns(), null, "columnsPerRow", null, 0, -1, Row.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRow_Columns(), this.getCol(), null, "columns", null, 0, -1, Row.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(colEClass, Col.class, "Col", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCol_Sizes(), this.getColumnSize(), null, "sizes", null, 0, -1, Col.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stackEClass, Stack.class, "Stack", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStack_Direction(), this.getDirection(), "direction", null, 0, 1, Stack.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
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

		initEEnum(directionEEnum, Direction.class, "Direction");
		addEEnumLiteral(directionEEnum, Direction.HORIZONTAL);
		addEEnumLiteral(directionEEnum, Direction.VERTICAL);

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
		// urn:org.nasdanika:react
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
			   "basePackage", "org.nasdanika.sdk.runtime.models.react"
		   });
		addAnnotation
		  (bootstrapComponentEClass,
		   source,
		   new String[] {
			   "documentation", "Base of React Bootstrap components. Props every component passes to its element.\n * Inherited model features - id, name, documentation, markers, ... - are not props.\nProps with these names are features with other names and a prop annotation,\ne.g. elementId for id and fieldName for name."
		   });
		addAnnotation
		  (getBootstrapComponent_ElementId(),
		   source,
		   new String[] {
			   "documentation", " DOM id"
		   });
		addAnnotation
		  (getBootstrapComponent_As(),
		   source,
		   new String[] {
			   "documentation", " Element type to render as, e.g. \"a\" or \"section\""
		   });
		addAnnotation
		  (getBootstrapComponent_AsComponent(),
		   source,
		   new String[] {
			   "documentation", " Component to render as, e.g. Col for Form.Group as={Col}. Wins over as."
		   });
		addAnnotation
		  (textContentEClass,
		   source,
		   new String[] {
			   "documentation", "Text content of a component, rendered as a text child before other children."
		   });
		addAnnotation
		  (variantEEnum,
		   source,
		   new String[] {
			   "documentation", " Theme colors - variant, bg, text and border props"
		   });
		addAnnotation
		  (columnSizeEClass,
		   source,
		   new String[] {
			   "documentation", "Columns at a breakpoint - a Col or Form.Label column size, a Placeholder width.\nRenders as the span alone if only the span is set: xs={6}, md=\"auto\",\notherwise as an object: md={{ span: 4, offset: 2 }}."
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
			   "documentation", "Columns per row at a breakpoint: Row xs={1} md={3}."
		   });
		addAnnotation
		  (getThemeProvider_Breakpoints(),
		   source,
		   new String[] {
			   "documentation", " Breakpoint names, largest first"
		   });
		addAnnotation
		  (getThemeProvider_Dir(),
		   source,
		   new String[] {
			   "documentation", " \"rtl\" for right to left layouts"
		   });
		addAnnotation
		  (getContainer_FluidUntil(),
		   source,
		   new String[] {
			   "documentation", " Fluid until the breakpoint. Wins over fluid."
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
			   "React", "urn:org.nasdanika:react"
		   });
	}

	/**
	 * Initializes the annotations for <b>urn:org.nasdanika:react</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUrnorgAnnotations() {
		String source = "urn:org.nasdanika:react";
		addAnnotation
		  (bootstrapComponentEClass,
		   source,
		   new String[] {
			   "module", "react-bootstrap"
		   });
		addAnnotation
		  (getBootstrapComponent_ElementId(),
		   source,
		   new String[] {
			   "prop", "id"
		   });
		addAnnotation
		  (getBootstrapComponent_Classes(),
		   source,
		   new String[] {
			   "prop", "className",
			   "join", " "
		   });
		addAnnotation
		  (getBootstrapComponent_Style(),
		   source,
		   new String[] {
			   "style", "true"
		   });
		addAnnotation
		  (getBootstrapComponent_AsComponent(),
		   source,
		   new String[] {
			   "prop", "as"
		   });
		addAnnotation
		  (getTextContent_Content(),
		   source,
		   new String[] {
			   "child", "true"
		   });
		addAnnotation
		  (columnSizeEClass,
		   source,
		   new String[] {
			   "shorthand", "span"
		   });
		addAnnotation
		  (getColumnSize_Breakpoint(),
		   source,
		   new String[] {
			   "logical", "true"
		   });
		addAnnotation
		  (getColumnSize_Auto(),
		   source,
		   new String[] {
			   "prop", "span",
			   "value", "auto"
		   });
		addAnnotation
		  (rowColumnsEClass,
		   source,
		   new String[] {
			   "shorthand", "count"
		   });
		addAnnotation
		  (getRowColumns_Breakpoint(),
		   source,
		   new String[] {
			   "logical", "true"
		   });
		addAnnotation
		  (getRowColumns_Count(),
		   source,
		   new String[] {
			   "prop", "count"
		   });
		addAnnotation
		  (getRowColumns_Auto(),
		   source,
		   new String[] {
			   "prop", "count",
			   "value", "auto"
		   });
		addAnnotation
		  (themeProviderEClass,
		   source,
		   new String[] {
			   "component", "ThemeProvider"
		   });
		addAnnotation
		  (containerEClass,
		   source,
		   new String[] {
			   "component", "Container"
		   });
		addAnnotation
		  (getContainer_FluidUntil(),
		   source,
		   new String[] {
			   "prop", "fluid"
		   });
		addAnnotation
		  (rowEClass,
		   source,
		   new String[] {
			   "component", "Row"
		   });
		addAnnotation
		  (getRow_ColumnsPerRow(),
		   source,
		   new String[] {
			   "key", "breakpoint"
		   });
		addAnnotation
		  (colEClass,
		   source,
		   new String[] {
			   "component", "Col"
		   });
		addAnnotation
		  (getCol_Sizes(),
		   source,
		   new String[] {
			   "key", "breakpoint"
		   });
		addAnnotation
		  (stackEClass,
		   source,
		   new String[] {
			   "component", "Stack"
		   });
		addAnnotation
		  (ratioEClass,
		   source,
		   new String[] {
			   "component", "Ratio"
		   });
		addAnnotation
		  (imageEClass,
		   source,
		   new String[] {
			   "component", "Image"
		   });
		addAnnotation
		  (figureEClass,
		   source,
		   new String[] {
			   "component", "Figure"
		   });
		addAnnotation
		  (figureImageEClass,
		   source,
		   new String[] {
			   "component", "Figure.Image"
		   });
		addAnnotation
		  (figureCaptionEClass,
		   source,
		   new String[] {
			   "component", "Figure.Caption"
		   });
	}

} //BootstrapPackageImpl
