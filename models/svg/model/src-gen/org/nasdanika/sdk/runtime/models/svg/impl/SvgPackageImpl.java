/**
 */
package org.nasdanika.sdk.runtime.models.svg.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.ETypeParameter;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.nasdanika.sdk.runtime.models.svg.Circle;
import org.nasdanika.sdk.runtime.models.svg.ClipPath;
import org.nasdanika.sdk.runtime.models.svg.Defs;
import org.nasdanika.sdk.runtime.models.svg.Desc;
import org.nasdanika.sdk.runtime.models.svg.DocumentRoot;
import org.nasdanika.sdk.runtime.models.svg.Element;
import org.nasdanika.sdk.runtime.models.svg.Ellipse;
import org.nasdanika.sdk.runtime.models.svg.Image;
import org.nasdanika.sdk.runtime.models.svg.Line;
import org.nasdanika.sdk.runtime.models.svg.LinearGradient;
import org.nasdanika.sdk.runtime.models.svg.Marker;
import org.nasdanika.sdk.runtime.models.svg.Path;
import org.nasdanika.sdk.runtime.models.svg.Polygon;
import org.nasdanika.sdk.runtime.models.svg.Polyline;
import org.nasdanika.sdk.runtime.models.svg.Presentation;
import org.nasdanika.sdk.runtime.models.svg.Rect;
import org.nasdanika.sdk.runtime.models.svg.Shape;
import org.nasdanika.sdk.runtime.models.svg.Stop;
import org.nasdanika.sdk.runtime.models.svg.Style;
import org.nasdanika.sdk.runtime.models.svg.Svg;
import org.nasdanika.sdk.runtime.models.svg.SvgFactory;
import org.nasdanika.sdk.runtime.models.svg.SvgPackage;
import org.nasdanika.sdk.runtime.models.svg.TSpan;
import org.nasdanika.sdk.runtime.models.svg.Text;
import org.nasdanika.sdk.runtime.models.svg.TextContent;
import org.nasdanika.sdk.runtime.models.svg.Title;
import org.nasdanika.sdk.runtime.models.svg.Use;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SvgPackageImpl extends EPackageImpl implements SvgPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentRootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elementEClass = null;

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
	private EClass containerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass svgEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass defsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass markerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass clipPathEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass linearGradientEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stopEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass titleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass descEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass styleEClass = null;

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
	private EClass rectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass circleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ellipseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lineEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass polylineEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass polygonEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pathEClass = null;

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
	private EClass useEClass = null;

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
	private EClass textEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tSpanEClass = null;

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
	 * @see org.nasdanika.sdk.runtime.models.svg.SvgPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SvgPackageImpl() {
		super(eNS_URI, SvgFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link SvgPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SvgPackage init() {
		if (isInited) return (SvgPackage)EPackage.Registry.INSTANCE.getEPackage(SvgPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredSvgPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		SvgPackageImpl theSvgPackage = registeredSvgPackage instanceof SvgPackageImpl ? (SvgPackageImpl)registeredSvgPackage : new SvgPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theSvgPackage.createPackageContents();

		// Initialize created meta-data
		theSvgPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSvgPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SvgPackage.eNS_URI, theSvgPackage);
		return theSvgPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDocumentRoot() {
		return documentRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Mixed() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XMLNSPrefixMap() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XSISchemaLocation() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Svg() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_G() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Defs() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_A() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Title() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Desc() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Style() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Rect() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Circle() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Ellipse() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Line() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Polyline() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Polygon() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Path() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Text() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Tspan() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Image() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Use() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Marker() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ClipPath() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_LinearGradient() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Stop() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElement() {
		return elementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElement_Id() {
		return (EAttribute)elementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElement_StyleClass() {
		return (EAttribute)elementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElement_StyleAttribute() {
		return (EAttribute)elementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElement_Transform() {
		return (EAttribute)elementEClass.getEStructuralFeatures().get(3);
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
	public EAttribute getPresentation_Fill() {
		return (EAttribute)presentationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPresentation_FillOpacity() {
		return (EAttribute)presentationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPresentation_Stroke() {
		return (EAttribute)presentationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPresentation_StrokeWidth() {
		return (EAttribute)presentationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPresentation_StrokeOpacity() {
		return (EAttribute)presentationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPresentation_StrokeDasharray() {
		return (EAttribute)presentationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPresentation_StrokeLinecap() {
		return (EAttribute)presentationEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPresentation_StrokeLinejoin() {
		return (EAttribute)presentationEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPresentation_Opacity() {
		return (EAttribute)presentationEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPresentation_FontFamily() {
		return (EAttribute)presentationEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPresentation_FontSize() {
		return (EAttribute)presentationEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPresentation_FontWeight() {
		return (EAttribute)presentationEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPresentation_FontStyle() {
		return (EAttribute)presentationEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPresentation_TextAnchor() {
		return (EAttribute)presentationEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPresentation_DominantBaseline() {
		return (EAttribute)presentationEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPresentation_MarkerStart() {
		return (EAttribute)presentationEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPresentation_MarkerMid() {
		return (EAttribute)presentationEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPresentation_MarkerEnd() {
		return (EAttribute)presentationEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPresentation_Visibility() {
		return (EAttribute)presentationEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPresentation_ClipPath() {
		return (EAttribute)presentationEClass.getEStructuralFeatures().get(19);
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
	public EAttribute getContainer_Content() {
		return (EAttribute)containerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getContainer__Add__Element() {
		return containerEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getContainer__Children() {
		return containerEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSvg() {
		return svgEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvg_Version() {
		return (EAttribute)svgEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvg_X() {
		return (EAttribute)svgEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvg_Y() {
		return (EAttribute)svgEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvg_Width() {
		return (EAttribute)svgEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvg_Height() {
		return (EAttribute)svgEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvg_ViewBox() {
		return (EAttribute)svgEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvg_PreserveAspectRatio() {
		return (EAttribute)svgEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getG() {
		return gEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDefs() {
		return defsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getA() {
		return aEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getA_Href() {
		return (EAttribute)aEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getA_Target() {
		return (EAttribute)aEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMarker() {
		return markerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMarker_ViewBox() {
		return (EAttribute)markerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMarker_RefX() {
		return (EAttribute)markerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMarker_RefY() {
		return (EAttribute)markerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMarker_MarkerWidth() {
		return (EAttribute)markerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMarker_MarkerHeight() {
		return (EAttribute)markerEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMarker_Orient() {
		return (EAttribute)markerEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMarker_MarkerUnits() {
		return (EAttribute)markerEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClipPath() {
		return clipPathEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClipPath_ClipPathUnits() {
		return (EAttribute)clipPathEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLinearGradient() {
		return linearGradientEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinearGradient_X1() {
		return (EAttribute)linearGradientEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinearGradient_Y1() {
		return (EAttribute)linearGradientEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinearGradient_X2() {
		return (EAttribute)linearGradientEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinearGradient_Y2() {
		return (EAttribute)linearGradientEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinearGradient_GradientUnits() {
		return (EAttribute)linearGradientEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStop() {
		return stopEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStop_Offset() {
		return (EAttribute)stopEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStop_StopColor() {
		return (EAttribute)stopEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStop_StopOpacity() {
		return (EAttribute)stopEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTitle() {
		return titleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTitle_Value() {
		return (EAttribute)titleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDesc() {
		return descEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDesc_Value() {
		return (EAttribute)descEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStyle() {
		return styleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStyle_Value() {
		return (EAttribute)styleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStyle_Type() {
		return (EAttribute)styleEClass.getEStructuralFeatures().get(1);
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
	public EClass getRect() {
		return rectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRect_X() {
		return (EAttribute)rectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRect_Y() {
		return (EAttribute)rectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRect_Width() {
		return (EAttribute)rectEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRect_Height() {
		return (EAttribute)rectEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRect_Rx() {
		return (EAttribute)rectEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRect_Ry() {
		return (EAttribute)rectEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCircle() {
		return circleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCircle_Cx() {
		return (EAttribute)circleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCircle_Cy() {
		return (EAttribute)circleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCircle_R() {
		return (EAttribute)circleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEllipse() {
		return ellipseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEllipse_Cx() {
		return (EAttribute)ellipseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEllipse_Cy() {
		return (EAttribute)ellipseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEllipse_Rx() {
		return (EAttribute)ellipseEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEllipse_Ry() {
		return (EAttribute)ellipseEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLine() {
		return lineEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLine_X1() {
		return (EAttribute)lineEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLine_Y1() {
		return (EAttribute)lineEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLine_X2() {
		return (EAttribute)lineEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLine_Y2() {
		return (EAttribute)lineEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPolyline() {
		return polylineEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolyline_Points() {
		return (EAttribute)polylineEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPolygon() {
		return polygonEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolygon_Points() {
		return (EAttribute)polygonEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPath() {
		return pathEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPath_D() {
		return (EAttribute)pathEClass.getEStructuralFeatures().get(0);
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
	public EAttribute getImage_Href() {
		return (EAttribute)imageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImage_X() {
		return (EAttribute)imageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImage_Y() {
		return (EAttribute)imageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImage_Width() {
		return (EAttribute)imageEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImage_Height() {
		return (EAttribute)imageEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImage_PreserveAspectRatio() {
		return (EAttribute)imageEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUse() {
		return useEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUse_Href() {
		return (EAttribute)useEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUse_X() {
		return (EAttribute)useEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUse_Y() {
		return (EAttribute)useEClass.getEStructuralFeatures().get(2);
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
	public EAttribute getTextContent_Mixed() {
		return (EAttribute)textContentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextContent_Any() {
		return (EAttribute)textContentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextContent_X() {
		return (EAttribute)textContentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextContent_Y() {
		return (EAttribute)textContentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextContent_Dx() {
		return (EAttribute)textContentEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextContent_Dy() {
		return (EAttribute)textContentEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTextContent__AddText__String() {
		return textContentEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTextContent__AddSpan__TSpan() {
		return textContentEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTextContent__Text() {
		return textContentEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getText() {
		return textEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTSpan() {
		return tSpanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SvgFactory getSvgFactory() {
		return (SvgFactory)getEFactoryInstance();
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
		documentRootEClass = createEClass(DOCUMENT_ROOT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__SVG);
		createEReference(documentRootEClass, DOCUMENT_ROOT__G);
		createEReference(documentRootEClass, DOCUMENT_ROOT__DEFS);
		createEReference(documentRootEClass, DOCUMENT_ROOT__A);
		createEReference(documentRootEClass, DOCUMENT_ROOT__TITLE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__DESC);
		createEReference(documentRootEClass, DOCUMENT_ROOT__STYLE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__RECT);
		createEReference(documentRootEClass, DOCUMENT_ROOT__CIRCLE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__ELLIPSE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__LINE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__POLYLINE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__POLYGON);
		createEReference(documentRootEClass, DOCUMENT_ROOT__PATH);
		createEReference(documentRootEClass, DOCUMENT_ROOT__TEXT);
		createEReference(documentRootEClass, DOCUMENT_ROOT__TSPAN);
		createEReference(documentRootEClass, DOCUMENT_ROOT__IMAGE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__USE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__MARKER);
		createEReference(documentRootEClass, DOCUMENT_ROOT__CLIP_PATH);
		createEReference(documentRootEClass, DOCUMENT_ROOT__LINEAR_GRADIENT);
		createEReference(documentRootEClass, DOCUMENT_ROOT__STOP);

		elementEClass = createEClass(ELEMENT);
		createEAttribute(elementEClass, ELEMENT__ID);
		createEAttribute(elementEClass, ELEMENT__STYLE_CLASS);
		createEAttribute(elementEClass, ELEMENT__STYLE_ATTRIBUTE);
		createEAttribute(elementEClass, ELEMENT__TRANSFORM);

		presentationEClass = createEClass(PRESENTATION);
		createEAttribute(presentationEClass, PRESENTATION__FILL);
		createEAttribute(presentationEClass, PRESENTATION__FILL_OPACITY);
		createEAttribute(presentationEClass, PRESENTATION__STROKE);
		createEAttribute(presentationEClass, PRESENTATION__STROKE_WIDTH);
		createEAttribute(presentationEClass, PRESENTATION__STROKE_OPACITY);
		createEAttribute(presentationEClass, PRESENTATION__STROKE_DASHARRAY);
		createEAttribute(presentationEClass, PRESENTATION__STROKE_LINECAP);
		createEAttribute(presentationEClass, PRESENTATION__STROKE_LINEJOIN);
		createEAttribute(presentationEClass, PRESENTATION__OPACITY);
		createEAttribute(presentationEClass, PRESENTATION__FONT_FAMILY);
		createEAttribute(presentationEClass, PRESENTATION__FONT_SIZE);
		createEAttribute(presentationEClass, PRESENTATION__FONT_WEIGHT);
		createEAttribute(presentationEClass, PRESENTATION__FONT_STYLE);
		createEAttribute(presentationEClass, PRESENTATION__TEXT_ANCHOR);
		createEAttribute(presentationEClass, PRESENTATION__DOMINANT_BASELINE);
		createEAttribute(presentationEClass, PRESENTATION__MARKER_START);
		createEAttribute(presentationEClass, PRESENTATION__MARKER_MID);
		createEAttribute(presentationEClass, PRESENTATION__MARKER_END);
		createEAttribute(presentationEClass, PRESENTATION__VISIBILITY);
		createEAttribute(presentationEClass, PRESENTATION__CLIP_PATH);

		containerEClass = createEClass(CONTAINER);
		createEAttribute(containerEClass, CONTAINER__CONTENT);
		createEOperation(containerEClass, CONTAINER___ADD__ELEMENT);
		createEOperation(containerEClass, CONTAINER___CHILDREN);

		svgEClass = createEClass(SVG);
		createEAttribute(svgEClass, SVG__VERSION);
		createEAttribute(svgEClass, SVG__X);
		createEAttribute(svgEClass, SVG__Y);
		createEAttribute(svgEClass, SVG__WIDTH);
		createEAttribute(svgEClass, SVG__HEIGHT);
		createEAttribute(svgEClass, SVG__VIEW_BOX);
		createEAttribute(svgEClass, SVG__PRESERVE_ASPECT_RATIO);

		gEClass = createEClass(G);

		defsEClass = createEClass(DEFS);

		aEClass = createEClass(A);
		createEAttribute(aEClass, A__HREF);
		createEAttribute(aEClass, A__TARGET);

		markerEClass = createEClass(MARKER);
		createEAttribute(markerEClass, MARKER__VIEW_BOX);
		createEAttribute(markerEClass, MARKER__REF_X);
		createEAttribute(markerEClass, MARKER__REF_Y);
		createEAttribute(markerEClass, MARKER__MARKER_WIDTH);
		createEAttribute(markerEClass, MARKER__MARKER_HEIGHT);
		createEAttribute(markerEClass, MARKER__ORIENT);
		createEAttribute(markerEClass, MARKER__MARKER_UNITS);

		clipPathEClass = createEClass(CLIP_PATH);
		createEAttribute(clipPathEClass, CLIP_PATH__CLIP_PATH_UNITS);

		linearGradientEClass = createEClass(LINEAR_GRADIENT);
		createEAttribute(linearGradientEClass, LINEAR_GRADIENT__X1);
		createEAttribute(linearGradientEClass, LINEAR_GRADIENT__Y1);
		createEAttribute(linearGradientEClass, LINEAR_GRADIENT__X2);
		createEAttribute(linearGradientEClass, LINEAR_GRADIENT__Y2);
		createEAttribute(linearGradientEClass, LINEAR_GRADIENT__GRADIENT_UNITS);

		stopEClass = createEClass(STOP);
		createEAttribute(stopEClass, STOP__OFFSET);
		createEAttribute(stopEClass, STOP__STOP_COLOR);
		createEAttribute(stopEClass, STOP__STOP_OPACITY);

		titleEClass = createEClass(TITLE);
		createEAttribute(titleEClass, TITLE__VALUE);

		descEClass = createEClass(DESC);
		createEAttribute(descEClass, DESC__VALUE);

		styleEClass = createEClass(STYLE);
		createEAttribute(styleEClass, STYLE__VALUE);
		createEAttribute(styleEClass, STYLE__TYPE);

		shapeEClass = createEClass(SHAPE);

		rectEClass = createEClass(RECT);
		createEAttribute(rectEClass, RECT__X);
		createEAttribute(rectEClass, RECT__Y);
		createEAttribute(rectEClass, RECT__WIDTH);
		createEAttribute(rectEClass, RECT__HEIGHT);
		createEAttribute(rectEClass, RECT__RX);
		createEAttribute(rectEClass, RECT__RY);

		circleEClass = createEClass(CIRCLE);
		createEAttribute(circleEClass, CIRCLE__CX);
		createEAttribute(circleEClass, CIRCLE__CY);
		createEAttribute(circleEClass, CIRCLE__R);

		ellipseEClass = createEClass(ELLIPSE);
		createEAttribute(ellipseEClass, ELLIPSE__CX);
		createEAttribute(ellipseEClass, ELLIPSE__CY);
		createEAttribute(ellipseEClass, ELLIPSE__RX);
		createEAttribute(ellipseEClass, ELLIPSE__RY);

		lineEClass = createEClass(LINE);
		createEAttribute(lineEClass, LINE__X1);
		createEAttribute(lineEClass, LINE__Y1);
		createEAttribute(lineEClass, LINE__X2);
		createEAttribute(lineEClass, LINE__Y2);

		polylineEClass = createEClass(POLYLINE);
		createEAttribute(polylineEClass, POLYLINE__POINTS);

		polygonEClass = createEClass(POLYGON);
		createEAttribute(polygonEClass, POLYGON__POINTS);

		pathEClass = createEClass(PATH);
		createEAttribute(pathEClass, PATH__D);

		imageEClass = createEClass(IMAGE);
		createEAttribute(imageEClass, IMAGE__HREF);
		createEAttribute(imageEClass, IMAGE__X);
		createEAttribute(imageEClass, IMAGE__Y);
		createEAttribute(imageEClass, IMAGE__WIDTH);
		createEAttribute(imageEClass, IMAGE__HEIGHT);
		createEAttribute(imageEClass, IMAGE__PRESERVE_ASPECT_RATIO);

		useEClass = createEClass(USE);
		createEAttribute(useEClass, USE__HREF);
		createEAttribute(useEClass, USE__X);
		createEAttribute(useEClass, USE__Y);

		textContentEClass = createEClass(TEXT_CONTENT);
		createEAttribute(textContentEClass, TEXT_CONTENT__MIXED);
		createEAttribute(textContentEClass, TEXT_CONTENT__ANY);
		createEAttribute(textContentEClass, TEXT_CONTENT__X);
		createEAttribute(textContentEClass, TEXT_CONTENT__Y);
		createEAttribute(textContentEClass, TEXT_CONTENT__DX);
		createEAttribute(textContentEClass, TEXT_CONTENT__DY);
		createEOperation(textContentEClass, TEXT_CONTENT___ADD_TEXT__STRING);
		createEOperation(textContentEClass, TEXT_CONTENT___ADD_SPAN__TSPAN);
		createEOperation(textContentEClass, TEXT_CONTENT___TEXT);

		textEClass = createEClass(TEXT);

		tSpanEClass = createEClass(TSPAN);
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
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		containerEClass.getESuperTypes().add(this.getElement());
		containerEClass.getESuperTypes().add(this.getPresentation());
		svgEClass.getESuperTypes().add(this.getContainer());
		gEClass.getESuperTypes().add(this.getContainer());
		defsEClass.getESuperTypes().add(this.getContainer());
		aEClass.getESuperTypes().add(this.getContainer());
		markerEClass.getESuperTypes().add(this.getContainer());
		clipPathEClass.getESuperTypes().add(this.getContainer());
		linearGradientEClass.getESuperTypes().add(this.getContainer());
		stopEClass.getESuperTypes().add(this.getElement());
		titleEClass.getESuperTypes().add(this.getElement());
		descEClass.getESuperTypes().add(this.getElement());
		styleEClass.getESuperTypes().add(this.getElement());
		shapeEClass.getESuperTypes().add(this.getContainer());
		rectEClass.getESuperTypes().add(this.getShape());
		circleEClass.getESuperTypes().add(this.getShape());
		ellipseEClass.getESuperTypes().add(this.getShape());
		lineEClass.getESuperTypes().add(this.getShape());
		polylineEClass.getESuperTypes().add(this.getShape());
		polygonEClass.getESuperTypes().add(this.getShape());
		pathEClass.getESuperTypes().add(this.getShape());
		imageEClass.getESuperTypes().add(this.getShape());
		useEClass.getESuperTypes().add(this.getShape());
		textContentEClass.getESuperTypes().add(this.getElement());
		textContentEClass.getESuperTypes().add(this.getPresentation());
		textEClass.getESuperTypes().add(this.getTextContent());
		tSpanEClass.getESuperTypes().add(this.getTextContent());

		// Initialize classes, features, and operations; add parameters
		initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocumentRoot_Mixed(), theEcorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XMLNSPrefixMap(), theEcorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XSISchemaLocation(), theEcorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Svg(), this.getSvg(), null, "svg", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_G(), this.getG(), null, "g", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Defs(), this.getDefs(), null, "defs", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_A(), this.getA(), null, "a", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Title(), this.getTitle(), null, "title", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Desc(), this.getDesc(), null, "desc", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Style(), this.getStyle(), null, "style", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Rect(), this.getRect(), null, "rect", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Circle(), this.getCircle(), null, "circle", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Ellipse(), this.getEllipse(), null, "ellipse", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Line(), this.getLine(), null, "line", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Polyline(), this.getPolyline(), null, "polyline", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Polygon(), this.getPolygon(), null, "polygon", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Path(), this.getPath(), null, "path", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Text(), this.getText(), null, "text", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Tspan(), this.getTSpan(), null, "tspan", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Image(), this.getImage(), null, "image", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Use(), this.getUse(), null, "use", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Marker(), this.getMarker(), null, "marker", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_ClipPath(), this.getClipPath(), null, "clipPath", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_LinearGradient(), this.getLinearGradient(), null, "linearGradient", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Stop(), this.getStop(), null, "stop", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(elementEClass, Element.class, "Element", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getElement_Id(), theEcorePackage.getEString(), "id", null, 0, 1, Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getElement_StyleClass(), theEcorePackage.getEString(), "styleClass", null, 0, 1, Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getElement_StyleAttribute(), theEcorePackage.getEString(), "styleAttribute", null, 0, 1, Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getElement_Transform(), theEcorePackage.getEString(), "transform", null, 0, 1, Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(presentationEClass, Presentation.class, "Presentation", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPresentation_Fill(), theEcorePackage.getEString(), "fill", null, 0, 1, Presentation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPresentation_FillOpacity(), theEcorePackage.getEString(), "fillOpacity", null, 0, 1, Presentation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPresentation_Stroke(), theEcorePackage.getEString(), "stroke", null, 0, 1, Presentation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPresentation_StrokeWidth(), theEcorePackage.getEString(), "strokeWidth", null, 0, 1, Presentation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPresentation_StrokeOpacity(), theEcorePackage.getEString(), "strokeOpacity", null, 0, 1, Presentation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPresentation_StrokeDasharray(), theEcorePackage.getEString(), "strokeDasharray", null, 0, 1, Presentation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPresentation_StrokeLinecap(), theEcorePackage.getEString(), "strokeLinecap", null, 0, 1, Presentation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPresentation_StrokeLinejoin(), theEcorePackage.getEString(), "strokeLinejoin", null, 0, 1, Presentation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPresentation_Opacity(), theEcorePackage.getEString(), "opacity", null, 0, 1, Presentation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPresentation_FontFamily(), theEcorePackage.getEString(), "fontFamily", null, 0, 1, Presentation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPresentation_FontSize(), theEcorePackage.getEString(), "fontSize", null, 0, 1, Presentation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPresentation_FontWeight(), theEcorePackage.getEString(), "fontWeight", null, 0, 1, Presentation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPresentation_FontStyle(), theEcorePackage.getEString(), "fontStyle", null, 0, 1, Presentation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPresentation_TextAnchor(), theEcorePackage.getEString(), "textAnchor", null, 0, 1, Presentation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPresentation_DominantBaseline(), theEcorePackage.getEString(), "dominantBaseline", null, 0, 1, Presentation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPresentation_MarkerStart(), theEcorePackage.getEString(), "markerStart", null, 0, 1, Presentation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPresentation_MarkerMid(), theEcorePackage.getEString(), "markerMid", null, 0, 1, Presentation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPresentation_MarkerEnd(), theEcorePackage.getEString(), "markerEnd", null, 0, 1, Presentation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPresentation_Visibility(), theEcorePackage.getEString(), "visibility", null, 0, 1, Presentation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPresentation_ClipPath(), theEcorePackage.getEString(), "clipPath", null, 0, 1, Presentation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(containerEClass, org.nasdanika.sdk.runtime.models.svg.Container.class, "Container", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getContainer_Content(), theEcorePackage.getEFeatureMapEntry(), "content", null, 0, -1, org.nasdanika.sdk.runtime.models.svg.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getContainer__Add__Element(), null, "add", 0, 1, !IS_UNIQUE, IS_ORDERED);
		ETypeParameter t1 = addETypeParameter(op, "T");
		EGenericType g1 = createEGenericType(this.getElement());
		t1.getEBounds().add(g1);
		g1 = createEGenericType(t1);
		addEParameter(op, g1, "child", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(t1);
		initEOperation(op, g1);

		initEOperation(getContainer__Children(), this.getElement(), "children", 0, -1, !IS_UNIQUE, IS_ORDERED);

		initEClass(svgEClass, Svg.class, "Svg", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSvg_Version(), theEcorePackage.getEString(), "version", null, 0, 1, Svg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSvg_X(), theEcorePackage.getEString(), "x", null, 0, 1, Svg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSvg_Y(), theEcorePackage.getEString(), "y", null, 0, 1, Svg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSvg_Width(), theEcorePackage.getEString(), "width", null, 0, 1, Svg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSvg_Height(), theEcorePackage.getEString(), "height", null, 0, 1, Svg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSvg_ViewBox(), theEcorePackage.getEString(), "viewBox", null, 0, 1, Svg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSvg_PreserveAspectRatio(), theEcorePackage.getEString(), "preserveAspectRatio", null, 0, 1, Svg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gEClass, org.nasdanika.sdk.runtime.models.svg.G.class, "G", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(defsEClass, Defs.class, "Defs", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(aEClass, org.nasdanika.sdk.runtime.models.svg.A.class, "A", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getA_Href(), theEcorePackage.getEString(), "href", null, 0, 1, org.nasdanika.sdk.runtime.models.svg.A.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getA_Target(), theEcorePackage.getEString(), "target", null, 0, 1, org.nasdanika.sdk.runtime.models.svg.A.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(markerEClass, Marker.class, "Marker", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMarker_ViewBox(), theEcorePackage.getEString(), "viewBox", null, 0, 1, Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMarker_RefX(), theEcorePackage.getEString(), "refX", null, 0, 1, Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMarker_RefY(), theEcorePackage.getEString(), "refY", null, 0, 1, Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMarker_MarkerWidth(), theEcorePackage.getEString(), "markerWidth", null, 0, 1, Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMarker_MarkerHeight(), theEcorePackage.getEString(), "markerHeight", null, 0, 1, Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMarker_Orient(), theEcorePackage.getEString(), "orient", null, 0, 1, Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMarker_MarkerUnits(), theEcorePackage.getEString(), "markerUnits", null, 0, 1, Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(clipPathEClass, ClipPath.class, "ClipPath", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getClipPath_ClipPathUnits(), theEcorePackage.getEString(), "clipPathUnits", null, 0, 1, ClipPath.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(linearGradientEClass, LinearGradient.class, "LinearGradient", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLinearGradient_X1(), theEcorePackage.getEString(), "x1", null, 0, 1, LinearGradient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLinearGradient_Y1(), theEcorePackage.getEString(), "y1", null, 0, 1, LinearGradient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLinearGradient_X2(), theEcorePackage.getEString(), "x2", null, 0, 1, LinearGradient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLinearGradient_Y2(), theEcorePackage.getEString(), "y2", null, 0, 1, LinearGradient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLinearGradient_GradientUnits(), theEcorePackage.getEString(), "gradientUnits", null, 0, 1, LinearGradient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stopEClass, Stop.class, "Stop", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStop_Offset(), theEcorePackage.getEString(), "offset", null, 0, 1, Stop.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStop_StopColor(), theEcorePackage.getEString(), "stopColor", null, 0, 1, Stop.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStop_StopOpacity(), theEcorePackage.getEString(), "stopOpacity", null, 0, 1, Stop.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(titleEClass, Title.class, "Title", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTitle_Value(), theEcorePackage.getEString(), "value", null, 0, 1, Title.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(descEClass, Desc.class, "Desc", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDesc_Value(), theEcorePackage.getEString(), "value", null, 0, 1, Desc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(styleEClass, Style.class, "Style", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStyle_Value(), theEcorePackage.getEString(), "value", null, 0, 1, Style.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStyle_Type(), theEcorePackage.getEString(), "type", null, 0, 1, Style.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(shapeEClass, Shape.class, "Shape", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(rectEClass, Rect.class, "Rect", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRect_X(), theEcorePackage.getEDouble(), "x", null, 0, 1, Rect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRect_Y(), theEcorePackage.getEDouble(), "y", null, 0, 1, Rect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRect_Width(), theEcorePackage.getEDouble(), "width", null, 0, 1, Rect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRect_Height(), theEcorePackage.getEDouble(), "height", null, 0, 1, Rect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRect_Rx(), theEcorePackage.getEDouble(), "rx", null, 0, 1, Rect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRect_Ry(), theEcorePackage.getEDouble(), "ry", null, 0, 1, Rect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(circleEClass, Circle.class, "Circle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCircle_Cx(), theEcorePackage.getEDouble(), "cx", null, 0, 1, Circle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCircle_Cy(), theEcorePackage.getEDouble(), "cy", null, 0, 1, Circle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCircle_R(), theEcorePackage.getEDouble(), "r", null, 0, 1, Circle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ellipseEClass, Ellipse.class, "Ellipse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEllipse_Cx(), theEcorePackage.getEDouble(), "cx", null, 0, 1, Ellipse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEllipse_Cy(), theEcorePackage.getEDouble(), "cy", null, 0, 1, Ellipse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEllipse_Rx(), theEcorePackage.getEDouble(), "rx", null, 0, 1, Ellipse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEllipse_Ry(), theEcorePackage.getEDouble(), "ry", null, 0, 1, Ellipse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(lineEClass, Line.class, "Line", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLine_X1(), theEcorePackage.getEDouble(), "x1", null, 0, 1, Line.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLine_Y1(), theEcorePackage.getEDouble(), "y1", null, 0, 1, Line.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLine_X2(), theEcorePackage.getEDouble(), "x2", null, 0, 1, Line.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLine_Y2(), theEcorePackage.getEDouble(), "y2", null, 0, 1, Line.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(polylineEClass, Polyline.class, "Polyline", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPolyline_Points(), theEcorePackage.getEString(), "points", null, 0, 1, Polyline.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(polygonEClass, Polygon.class, "Polygon", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPolygon_Points(), theEcorePackage.getEString(), "points", null, 0, 1, Polygon.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pathEClass, Path.class, "Path", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPath_D(), theEcorePackage.getEString(), "d", null, 0, 1, Path.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(imageEClass, Image.class, "Image", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getImage_Href(), theEcorePackage.getEString(), "href", null, 0, 1, Image.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getImage_X(), theEcorePackage.getEDouble(), "x", null, 0, 1, Image.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getImage_Y(), theEcorePackage.getEDouble(), "y", null, 0, 1, Image.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getImage_Width(), theEcorePackage.getEDouble(), "width", null, 0, 1, Image.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getImage_Height(), theEcorePackage.getEDouble(), "height", null, 0, 1, Image.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getImage_PreserveAspectRatio(), theEcorePackage.getEString(), "preserveAspectRatio", null, 0, 1, Image.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(useEClass, Use.class, "Use", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUse_Href(), theEcorePackage.getEString(), "href", null, 0, 1, Use.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUse_X(), theEcorePackage.getEDouble(), "x", null, 0, 1, Use.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUse_Y(), theEcorePackage.getEDouble(), "y", null, 0, 1, Use.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(textContentEClass, TextContent.class, "TextContent", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTextContent_Mixed(), theEcorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, TextContent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTextContent_Any(), theEcorePackage.getEFeatureMapEntry(), "any", null, 0, -1, TextContent.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getTextContent_X(), theEcorePackage.getEString(), "x", null, 0, 1, TextContent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTextContent_Y(), theEcorePackage.getEString(), "y", null, 0, 1, TextContent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTextContent_Dx(), theEcorePackage.getEString(), "dx", null, 0, 1, TextContent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTextContent_Dy(), theEcorePackage.getEString(), "dy", null, 0, 1, TextContent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getTextContent__AddText__String(), null, "addText", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "text", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getTextContent__AddSpan__TSpan(), this.getTSpan(), "addSpan", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getTSpan(), "span", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getTextContent__Text(), theEcorePackage.getEString(), "text", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(textEClass, Text.class, "Text", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tSpanEClass, TSpan.class, "TSpan", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/GenModel
		createGenModelAnnotations();
		// http://www.eclipse.org/emf/2011/Xcore
		createXcoreAnnotations();
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
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
			   "documentation", "A pragmatic subset of SVG as an EMF model: the twenty-odd elements and the presentation\nattributes that generated diagrams need, and that Asciidoctor PDF\'s SVG renderer, prawn-svg,\ndraws, so one SVG works in HTML, PDF and EPUB.\n * The model is annotated with ExtendedMetaData, as models generated from XML schemas are, so EMF\'s\nXML resource writes and reads SVG: element and attribute names are SVG\'s, and the namespace is\nSVG\'s, which is why the namespace URI of this package is http://www.w3.org/2000/svg rather than\na runtime.sdk.nasdanika.org URI. Elements and attributes outside the subset are recorded on load,\nnot lost.\n * Containers hold their children in a feature map, content, keyed by the elements of DocumentRoot,\nwhich is how one list holds rect, circle and g in document order. Text holds character data and\ntspan elements in its mixed feature map. The add, children, addText, addSpan and text operations\nadd and read children and text without touching feature maps.",
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
		  (documentRootEClass,
		   source,
		   new String[] {
			   "documentation", " ============================================================================\nThe document\n============================================================================"
		   });
		addAnnotation
		  (elementEClass,
		   source,
		   new String[] {
			   "documentation", " ============================================================================\nCommon attributes\n============================================================================"
		   });
		addAnnotation
		  (getElement_StyleClass(),
		   source,
		   new String[] {
			   "documentation", " The class attribute: names of CSS classes, separated by spaces."
		   });
		addAnnotation
		  (getElement_StyleAttribute(),
		   source,
		   new String[] {
			   "documentation", " Inline CSS."
		   });
		addAnnotation
		  (presentationEClass,
		   source,
		   new String[] {
			   "documentation", "The presentation attributes of the subset: how a shape or a text is painted. Values are as in\nSVG: colors such as #1168bd or none, lengths, and url(#id) references to markers and gradients."
		   });
		addAnnotation
		  (containerEClass,
		   source,
		   new String[] {
			   "documentation", " ============================================================================\nStructure\n============================================================================"
		   });
		addAnnotation
		  (getContainer__Add__Element(),
		   source,
		   new String[] {
			   "documentation", " Appends a child, keyed by its element of DocumentRoot, and returns it.",
			   "body", "final <%org.eclipse.emf.ecore.util.ExtendedMetaData%> metaData = <%org.eclipse.emf.ecore.util.ExtendedMetaData%>.INSTANCE;\nthis.getContent().add(metaData.getElement(<%org.nasdanika.sdk.runtime.models.svg.SvgPackage%>.eNS_URI, metaData.getName(child.eClass())), child);\nreturn child;"
		   });
		addAnnotation
		  (getContainer__Children(),
		   source,
		   new String[] {
			   "documentation", " The children that are elements of the subset, in document order.",
			   "body", "final <%org.eclipse.emf.common.util.BasicEList%><<%org.nasdanika.sdk.runtime.models.svg.Element%>> children = new <%org.eclipse.emf.common.util.BasicEList%><<%org.nasdanika.sdk.runtime.models.svg.Element%>>();\n<%org.eclipse.emf.ecore.util.FeatureMap%> _content = this.getContent();\nfor (final <%org.eclipse.emf.ecore.util.FeatureMap.Entry%> entry : _content)\n{\n\t{\n\t\tfinal <%java.lang.Object%> value = entry.getValue();\n\t\tif ((value instanceof <%org.nasdanika.sdk.runtime.models.svg.Element%>))\n\t\t{\n\t\t\tchildren.add(((<%org.nasdanika.sdk.runtime.models.svg.Element%>)value));\n\t\t}\n\t}\n}\nreturn children;"
		   });
		addAnnotation
		  (svgEClass,
		   source,
		   new String[] {
			   "documentation", " The root element, or a nested viewport."
		   });
		addAnnotation
		  (getSvg_Width(),
		   source,
		   new String[] {
			   "documentation", " A length, such as 640, 640px or 100%."
		   });
		addAnnotation
		  (getSvg_ViewBox(),
		   source,
		   new String[] {
			   "documentation", " min-x, min-y, width and height of the user coordinates, such as 0 0 640 480."
		   });
		addAnnotation
		  (gEClass,
		   source,
		   new String[] {
			   "documentation", " A group."
		   });
		addAnnotation
		  (defsEClass,
		   source,
		   new String[] {
			   "documentation", " Definitions: markers, gradients and clip paths, drawn only where they are referenced."
		   });
		addAnnotation
		  (aEClass,
		   source,
		   new String[] {
			   "documentation", " A hyperlink around its children."
		   });
		addAnnotation
		  (getA_Href(),
		   source,
		   new String[] {
			   "documentation", " The link. SVG 2\'s href; SVG 1.1 renderers read xlink:href."
		   });
		addAnnotation
		  (markerEClass,
		   source,
		   new String[] {
			   "documentation", " A marker: an arrowhead or another decoration drawn at the vertices of a line."
		   });
		addAnnotation
		  (getMarker_Orient(),
		   source,
		   new String[] {
			   "documentation", " auto, auto-start-reverse, or an angle."
		   });
		addAnnotation
		  (getMarker_MarkerUnits(),
		   source,
		   new String[] {
			   "documentation", " strokeWidth (the default) or userSpaceOnUse."
		   });
		addAnnotation
		  (clipPathEClass,
		   source,
		   new String[] {
			   "documentation", " A clip path: its children are the region that clips what refers to it."
		   });
		addAnnotation
		  (linearGradientEClass,
		   source,
		   new String[] {
			   "documentation", " A linear gradient, with stops as its children."
		   });
		addAnnotation
		  (stopEClass,
		   source,
		   new String[] {
			   "documentation", " A color stop of a gradient."
		   });
		addAnnotation
		  (titleEClass,
		   source,
		   new String[] {
			   "documentation", " ============================================================================\nText content of their own\n============================================================================"
		   });
		addAnnotation
		  (descEClass,
		   source,
		   new String[] {
			   "documentation", " A description of its parent."
		   });
		addAnnotation
		  (styleEClass,
		   source,
		   new String[] {
			   "documentation", " A style sheet."
		   });
		addAnnotation
		  (shapeEClass,
		   source,
		   new String[] {
			   "documentation", " ============================================================================\nShapes\n============================================================================"
		   });
		addAnnotation
		  (getRect_Rx(),
		   source,
		   new String[] {
			   "documentation", " Corner radii."
		   });
		addAnnotation
		  (polylineEClass,
		   source,
		   new String[] {
			   "documentation", " Points as SVG writes them: x,y pairs separated by spaces."
		   });
		addAnnotation
		  (pathEClass,
		   source,
		   new String[] {
			   "documentation", " A path, in SVG\'s path data: M 0 0 L 10 0 Z."
		   });
		addAnnotation
		  (useEClass,
		   source,
		   new String[] {
			   "documentation", " A copy of another element, by reference: href=\"#id\"."
		   });
		addAnnotation
		  (textContentEClass,
		   source,
		   new String[] {
			   "documentation", " ============================================================================\nText\n============================================================================"
		   });
		addAnnotation
		  (getTextContent__AddText__String(),
		   source,
		   new String[] {
			   "documentation", " Appends character data.",
			   "body", "this.getMixed().add(<%org.eclipse.emf.ecore.xml.type.XMLTypePackage.Literals%>.XML_TYPE_DOCUMENT_ROOT__TEXT, text);"
		   });
		addAnnotation
		  (getTextContent__AddSpan__TSpan(),
		   source,
		   new String[] {
			   "documentation", " Appends a span, and returns it.",
			   "body", "this.getMixed().add(<%org.nasdanika.sdk.runtime.models.svg.SvgPackage.Literals%>.DOCUMENT_ROOT__TSPAN, span);\nreturn span;"
		   });
		addAnnotation
		  (getTextContent__Text(),
		   source,
		   new String[] {
			   "documentation", " The character data of this element and its spans, in document order.",
			   "body", "final <%java.lang.StringBuilder%> text = new <%java.lang.StringBuilder%>();\n<%org.eclipse.emf.ecore.util.FeatureMap%> _mixed = this.getMixed();\nfor (final <%org.eclipse.emf.ecore.util.FeatureMap.Entry%> entry : _mixed)\n{\n\t{\n\t\tfinal <%java.lang.Object%> value = entry.getValue();\n\t\tif ((value instanceof <%org.nasdanika.sdk.runtime.models.svg.TextContent%>))\n\t\t{\n\t\t\ttext.append(((<%org.nasdanika.sdk.runtime.models.svg.TextContent%>)value).text());\n\t\t}\n\t\telse\n\t\t{\n\t\t\t<%org.eclipse.emf.ecore.EStructuralFeature%> _eStructuralFeature = entry.getEStructuralFeature();\n\t\t\tboolean _equals = <%java.util.Objects%>.equals(_eStructuralFeature, <%org.eclipse.emf.ecore.xml.type.XMLTypePackage.Literals%>.XML_TYPE_DOCUMENT_ROOT__TEXT);\n\t\t\tif (_equals)\n\t\t\t{\n\t\t\t\ttext.append(value);\n\t\t\t}\n\t\t}\n\t}\n}\nreturn text.toString();"
		   });
		addAnnotation
		  (getTextContent_Any(),
		   source,
		   new String[] {
			   "documentation", " The elements among the mixed content: spans."
		   });
		addAnnotation
		  (getTextContent_X(),
		   source,
		   new String[] {
			   "documentation", " x of each character, or of the first: one number or several."
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

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";
		addAnnotation
		  (documentRootEClass,
		   source,
		   new String[] {
			   "name", "",
			   "kind", "mixed"
		   });
		addAnnotation
		  (getDocumentRoot_Mixed(),
		   source,
		   new String[] {
			   "kind", "elementWildcard",
			   "name", ":mixed"
		   });
		addAnnotation
		  (getDocumentRoot_XMLNSPrefixMap(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "xmlns:prefix"
		   });
		addAnnotation
		  (getDocumentRoot_XSISchemaLocation(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "xsi:schemaLocation"
		   });
		addAnnotation
		  (getDocumentRoot_Svg(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "svg",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_G(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "g",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_Defs(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "defs",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_A(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "a",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_Title(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "title",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_Desc(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "desc",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_Style(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "style",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_Rect(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "rect",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_Circle(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "circle",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_Ellipse(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ellipse",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_Line(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "line",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_Polyline(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "polyline",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_Polygon(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "polygon",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_Path(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "path",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_Text(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "text",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_Tspan(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "tspan",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_Image(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "image",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_Use(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "use",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_Marker(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "marker",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_ClipPath(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "clipPath",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_LinearGradient(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "linearGradient",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_Stop(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "stop",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (elementEClass,
		   source,
		   new String[] {
			   "name", "Element",
			   "kind", "empty"
		   });
		addAnnotation
		  (getElement_Id(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "id"
		   });
		addAnnotation
		  (getElement_StyleClass(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "class"
		   });
		addAnnotation
		  (getElement_StyleAttribute(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "style"
		   });
		addAnnotation
		  (getElement_Transform(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "transform"
		   });
		addAnnotation
		  (getPresentation_Fill(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "fill"
		   });
		addAnnotation
		  (getPresentation_FillOpacity(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "fill-opacity"
		   });
		addAnnotation
		  (getPresentation_Stroke(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "stroke"
		   });
		addAnnotation
		  (getPresentation_StrokeWidth(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "stroke-width"
		   });
		addAnnotation
		  (getPresentation_StrokeOpacity(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "stroke-opacity"
		   });
		addAnnotation
		  (getPresentation_StrokeDasharray(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "stroke-dasharray"
		   });
		addAnnotation
		  (getPresentation_StrokeLinecap(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "stroke-linecap"
		   });
		addAnnotation
		  (getPresentation_StrokeLinejoin(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "stroke-linejoin"
		   });
		addAnnotation
		  (getPresentation_Opacity(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "opacity"
		   });
		addAnnotation
		  (getPresentation_FontFamily(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "font-family"
		   });
		addAnnotation
		  (getPresentation_FontSize(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "font-size"
		   });
		addAnnotation
		  (getPresentation_FontWeight(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "font-weight"
		   });
		addAnnotation
		  (getPresentation_FontStyle(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "font-style"
		   });
		addAnnotation
		  (getPresentation_TextAnchor(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "text-anchor"
		   });
		addAnnotation
		  (getPresentation_DominantBaseline(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "dominant-baseline"
		   });
		addAnnotation
		  (getPresentation_MarkerStart(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "marker-start"
		   });
		addAnnotation
		  (getPresentation_MarkerMid(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "marker-mid"
		   });
		addAnnotation
		  (getPresentation_MarkerEnd(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "marker-end"
		   });
		addAnnotation
		  (getPresentation_Visibility(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "visibility"
		   });
		addAnnotation
		  (getPresentation_ClipPath(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "clip-path"
		   });
		addAnnotation
		  (containerEClass,
		   source,
		   new String[] {
			   "name", "Container",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getContainer_Content(),
		   source,
		   new String[] {
			   "kind", "elementWildcard",
			   "wildcards", "##targetNamespace",
			   "name", ":content",
			   "processing", "lax"
		   });
		addAnnotation
		  (svgEClass,
		   source,
		   new String[] {
			   "name", "svg",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getSvg_Version(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "version"
		   });
		addAnnotation
		  (getSvg_X(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "x"
		   });
		addAnnotation
		  (getSvg_Y(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "y"
		   });
		addAnnotation
		  (getSvg_Width(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "width"
		   });
		addAnnotation
		  (getSvg_Height(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "height"
		   });
		addAnnotation
		  (getSvg_ViewBox(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "viewBox"
		   });
		addAnnotation
		  (getSvg_PreserveAspectRatio(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "preserveAspectRatio"
		   });
		addAnnotation
		  (gEClass,
		   source,
		   new String[] {
			   "name", "g",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (defsEClass,
		   source,
		   new String[] {
			   "name", "defs",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (aEClass,
		   source,
		   new String[] {
			   "name", "a",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getA_Href(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "href"
		   });
		addAnnotation
		  (getA_Target(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "target"
		   });
		addAnnotation
		  (markerEClass,
		   source,
		   new String[] {
			   "name", "marker",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getMarker_ViewBox(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "viewBox"
		   });
		addAnnotation
		  (getMarker_RefX(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "refX"
		   });
		addAnnotation
		  (getMarker_RefY(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "refY"
		   });
		addAnnotation
		  (getMarker_MarkerWidth(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "markerWidth"
		   });
		addAnnotation
		  (getMarker_MarkerHeight(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "markerHeight"
		   });
		addAnnotation
		  (getMarker_Orient(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "orient"
		   });
		addAnnotation
		  (getMarker_MarkerUnits(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "markerUnits"
		   });
		addAnnotation
		  (clipPathEClass,
		   source,
		   new String[] {
			   "name", "clipPath",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getClipPath_ClipPathUnits(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "clipPathUnits"
		   });
		addAnnotation
		  (linearGradientEClass,
		   source,
		   new String[] {
			   "name", "linearGradient",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getLinearGradient_X1(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "x1"
		   });
		addAnnotation
		  (getLinearGradient_Y1(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "y1"
		   });
		addAnnotation
		  (getLinearGradient_X2(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "x2"
		   });
		addAnnotation
		  (getLinearGradient_Y2(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "y2"
		   });
		addAnnotation
		  (getLinearGradient_GradientUnits(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "gradientUnits"
		   });
		addAnnotation
		  (stopEClass,
		   source,
		   new String[] {
			   "name", "stop",
			   "kind", "empty"
		   });
		addAnnotation
		  (getStop_Offset(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "offset"
		   });
		addAnnotation
		  (getStop_StopColor(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "stop-color"
		   });
		addAnnotation
		  (getStop_StopOpacity(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "stop-opacity"
		   });
		addAnnotation
		  (titleEClass,
		   source,
		   new String[] {
			   "name", "title",
			   "kind", "simple"
		   });
		addAnnotation
		  (getTitle_Value(),
		   source,
		   new String[] {
			   "name", ":0",
			   "kind", "simple"
		   });
		addAnnotation
		  (descEClass,
		   source,
		   new String[] {
			   "name", "desc",
			   "kind", "simple"
		   });
		addAnnotation
		  (getDesc_Value(),
		   source,
		   new String[] {
			   "name", ":0",
			   "kind", "simple"
		   });
		addAnnotation
		  (styleEClass,
		   source,
		   new String[] {
			   "name", "style",
			   "kind", "simple"
		   });
		addAnnotation
		  (getStyle_Value(),
		   source,
		   new String[] {
			   "name", ":0",
			   "kind", "simple"
		   });
		addAnnotation
		  (getStyle_Type(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "type"
		   });
		addAnnotation
		  (shapeEClass,
		   source,
		   new String[] {
			   "name", "Shape",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (rectEClass,
		   source,
		   new String[] {
			   "name", "rect",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getRect_X(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "x"
		   });
		addAnnotation
		  (getRect_Y(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "y"
		   });
		addAnnotation
		  (getRect_Width(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "width"
		   });
		addAnnotation
		  (getRect_Height(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "height"
		   });
		addAnnotation
		  (getRect_Rx(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "rx"
		   });
		addAnnotation
		  (getRect_Ry(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "ry"
		   });
		addAnnotation
		  (circleEClass,
		   source,
		   new String[] {
			   "name", "circle",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getCircle_Cx(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "cx"
		   });
		addAnnotation
		  (getCircle_Cy(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "cy"
		   });
		addAnnotation
		  (getCircle_R(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "r"
		   });
		addAnnotation
		  (ellipseEClass,
		   source,
		   new String[] {
			   "name", "ellipse",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getEllipse_Cx(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "cx"
		   });
		addAnnotation
		  (getEllipse_Cy(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "cy"
		   });
		addAnnotation
		  (getEllipse_Rx(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "rx"
		   });
		addAnnotation
		  (getEllipse_Ry(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "ry"
		   });
		addAnnotation
		  (lineEClass,
		   source,
		   new String[] {
			   "name", "line",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getLine_X1(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "x1"
		   });
		addAnnotation
		  (getLine_Y1(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "y1"
		   });
		addAnnotation
		  (getLine_X2(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "x2"
		   });
		addAnnotation
		  (getLine_Y2(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "y2"
		   });
		addAnnotation
		  (polylineEClass,
		   source,
		   new String[] {
			   "name", "polyline",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getPolyline_Points(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "points"
		   });
		addAnnotation
		  (polygonEClass,
		   source,
		   new String[] {
			   "name", "polygon",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getPolygon_Points(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "points"
		   });
		addAnnotation
		  (pathEClass,
		   source,
		   new String[] {
			   "name", "path",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getPath_D(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "d"
		   });
		addAnnotation
		  (imageEClass,
		   source,
		   new String[] {
			   "name", "image",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getImage_Href(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "href"
		   });
		addAnnotation
		  (getImage_X(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "x"
		   });
		addAnnotation
		  (getImage_Y(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "y"
		   });
		addAnnotation
		  (getImage_Width(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "width"
		   });
		addAnnotation
		  (getImage_Height(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "height"
		   });
		addAnnotation
		  (getImage_PreserveAspectRatio(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "preserveAspectRatio"
		   });
		addAnnotation
		  (useEClass,
		   source,
		   new String[] {
			   "name", "use",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getUse_Href(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "href"
		   });
		addAnnotation
		  (getUse_X(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "x"
		   });
		addAnnotation
		  (getUse_Y(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "y"
		   });
		addAnnotation
		  (textContentEClass,
		   source,
		   new String[] {
			   "name", "TextContent",
			   "kind", "mixed"
		   });
		addAnnotation
		  (getTextContent_Mixed(),
		   source,
		   new String[] {
			   "kind", "elementWildcard",
			   "name", ":mixed"
		   });
		addAnnotation
		  (getTextContent_Any(),
		   source,
		   new String[] {
			   "kind", "elementWildcard",
			   "wildcards", "##targetNamespace",
			   "name", ":1",
			   "processing", "lax",
			   "group", "#mixed"
		   });
		addAnnotation
		  (getTextContent_X(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "x"
		   });
		addAnnotation
		  (getTextContent_Y(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "y"
		   });
		addAnnotation
		  (getTextContent_Dx(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "dx"
		   });
		addAnnotation
		  (getTextContent_Dy(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "dy"
		   });
		addAnnotation
		  (textEClass,
		   source,
		   new String[] {
			   "name", "text",
			   "kind", "mixed"
		   });
		addAnnotation
		  (tSpanEClass,
		   source,
		   new String[] {
			   "name", "tspan",
			   "kind", "mixed"
		   });
	}

} //SvgPackageImpl
