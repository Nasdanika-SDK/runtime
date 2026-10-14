/**
 */
package org.nasdanika.sdk.runtime.models.html.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.nasdanika.sdk.runtime.models.core.CorePackage;

import org.nasdanika.sdk.runtime.models.html.Anchor;
import org.nasdanika.sdk.runtime.models.html.Article;
import org.nasdanika.sdk.runtime.models.html.Aside;
import org.nasdanika.sdk.runtime.models.html.Blockquote;
import org.nasdanika.sdk.runtime.models.html.Body;
import org.nasdanika.sdk.runtime.models.html.Button;
import org.nasdanika.sdk.runtime.models.html.Caption;
import org.nasdanika.sdk.runtime.models.html.Code;
import org.nasdanika.sdk.runtime.models.html.Column;
import org.nasdanika.sdk.runtime.models.html.ColumnGroup;
import org.nasdanika.sdk.runtime.models.html.Comment;
import org.nasdanika.sdk.runtime.models.html.DescriptionDetails;
import org.nasdanika.sdk.runtime.models.html.DescriptionList;
import org.nasdanika.sdk.runtime.models.html.DescriptionListItem;
import org.nasdanika.sdk.runtime.models.html.DescriptionTerm;
import org.nasdanika.sdk.runtime.models.html.Details;
import org.nasdanika.sdk.runtime.models.html.Div;
import org.nasdanika.sdk.runtime.models.html.Document;
import org.nasdanika.sdk.runtime.models.html.Element;
import org.nasdanika.sdk.runtime.models.html.Emphasis;
import org.nasdanika.sdk.runtime.models.html.Fieldset;
import org.nasdanika.sdk.runtime.models.html.Figure;
import org.nasdanika.sdk.runtime.models.html.FigureCaption;
import org.nasdanika.sdk.runtime.models.html.Footer;
import org.nasdanika.sdk.runtime.models.html.Form;
import org.nasdanika.sdk.runtime.models.html.GenericElement;
import org.nasdanika.sdk.runtime.models.html.GenericVoidElement;
import org.nasdanika.sdk.runtime.models.html.Head;
import org.nasdanika.sdk.runtime.models.html.Header;
import org.nasdanika.sdk.runtime.models.html.Heading;
import org.nasdanika.sdk.runtime.models.html.HorizontalRule;
import org.nasdanika.sdk.runtime.models.html.HtmlFactory;
import org.nasdanika.sdk.runtime.models.html.HtmlPackage;
import org.nasdanika.sdk.runtime.models.html.Image;
import org.nasdanika.sdk.runtime.models.html.ImportMap;
import org.nasdanika.sdk.runtime.models.html.ImportMapScope;
import org.nasdanika.sdk.runtime.models.html.InlineFrame;
import org.nasdanika.sdk.runtime.models.html.Input;
import org.nasdanika.sdk.runtime.models.html.ItemList;
import org.nasdanika.sdk.runtime.models.html.Label;
import org.nasdanika.sdk.runtime.models.html.Legend;
import org.nasdanika.sdk.runtime.models.html.LibraryElement;
import org.nasdanika.sdk.runtime.models.html.LineBreak;
import org.nasdanika.sdk.runtime.models.html.Link;
import org.nasdanika.sdk.runtime.models.html.ListItem;
import org.nasdanika.sdk.runtime.models.html.Main;
import org.nasdanika.sdk.runtime.models.html.Markup;
import org.nasdanika.sdk.runtime.models.html.Meta;
import org.nasdanika.sdk.runtime.models.html.Nav;
import org.nasdanika.sdk.runtime.models.html.Node;
import org.nasdanika.sdk.runtime.models.html.NodeReference;
import org.nasdanika.sdk.runtime.models.html.Option;
import org.nasdanika.sdk.runtime.models.html.OptionGroup;
import org.nasdanika.sdk.runtime.models.html.OrderedList;
import org.nasdanika.sdk.runtime.models.html.Paragraph;
import org.nasdanika.sdk.runtime.models.html.Pre;
import org.nasdanika.sdk.runtime.models.html.Script;
import org.nasdanika.sdk.runtime.models.html.Section;
import org.nasdanika.sdk.runtime.models.html.Select;
import org.nasdanika.sdk.runtime.models.html.SelectItem;
import org.nasdanika.sdk.runtime.models.html.Span;
import org.nasdanika.sdk.runtime.models.html.Strong;
import org.nasdanika.sdk.runtime.models.html.Stylesheet;
import org.nasdanika.sdk.runtime.models.html.Summary;
import org.nasdanika.sdk.runtime.models.html.Table;
import org.nasdanika.sdk.runtime.models.html.TableBody;
import org.nasdanika.sdk.runtime.models.html.TableCell;
import org.nasdanika.sdk.runtime.models.html.TableFoot;
import org.nasdanika.sdk.runtime.models.html.TableHead;
import org.nasdanika.sdk.runtime.models.html.TableRow;
import org.nasdanika.sdk.runtime.models.html.TableSection;
import org.nasdanika.sdk.runtime.models.html.Text;
import org.nasdanika.sdk.runtime.models.html.TextArea;
import org.nasdanika.sdk.runtime.models.html.UnorderedList;
import org.nasdanika.sdk.runtime.models.html.VoidElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class HtmlPackageImpl extends EPackageImpl implements HtmlPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nodeEClass = null;

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
	private EClass markupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass commentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nodeReferenceEClass = null;

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
	private EClass elementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass voidElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genericElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genericVoidElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass libraryElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass headEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bodyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass metaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass linkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stylesheetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scriptEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass importMapEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass importMapScopeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass divEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass spanEClass = null;

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
	private EClass headingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass headerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass footerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mainEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass navEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass articleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass asideEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass blockquoteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass preEClass = null;

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
	private EClass figureCaptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass detailsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass summaryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass horizontalRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lineBreakEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass anchorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass strongEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass emphasisEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass codeEClass = null;

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
	private EClass inlineFrameEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass itemListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unorderedListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orderedListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass descriptionListItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass descriptionListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass descriptionTermEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass descriptionDetailsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass captionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass columnGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass columnEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tableSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tableHeadEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tableBodyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tableFootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tableRowEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tableCellEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass formEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fieldsetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass legendEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass labelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inputEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass buttonEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass textAreaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass selectItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass selectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass optionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass optionGroupEClass = null;

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
	 * @see org.nasdanika.sdk.runtime.models.html.HtmlPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private HtmlPackageImpl() {
		super(eNS_URI, HtmlFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link HtmlPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static HtmlPackage init() {
		if (isInited) return (HtmlPackage)EPackage.Registry.INSTANCE.getEPackage(HtmlPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredHtmlPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		HtmlPackageImpl theHtmlPackage = registeredHtmlPackage instanceof HtmlPackageImpl ? (HtmlPackageImpl)registeredHtmlPackage : new HtmlPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		CorePackage.eINSTANCE.eClass();
		EcorePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theHtmlPackage.createPackageContents();

		// Initialize created meta-data
		theHtmlPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theHtmlPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(HtmlPackage.eNS_URI, theHtmlPackage);
		return theHtmlPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNode() {
		return nodeEClass;
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
	public EAttribute getText_Content() {
		return (EAttribute)textEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMarkup() {
		return markupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMarkup_Content() {
		return (EAttribute)markupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComment() {
		return commentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComment_Content() {
		return (EAttribute)commentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNodeReference() {
		return nodeReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNodeReference_Target() {
		return (EReference)nodeReferenceEClass.getEStructuralFeatures().get(0);
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
	public EReference getContainer_Contents() {
		return (EReference)containerEClass.getEStructuralFeatures().get(0);
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
	public EAttribute getElement_Classes() {
		return (EAttribute)elementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElement_Style() {
		return (EReference)elementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElement_Attributes() {
		return (EReference)elementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getElement__TagName() {
		return elementEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVoidElement() {
		return voidElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenericElement() {
		return genericElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenericElement_Name() {
		return (EAttribute)genericElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGenericElement__TagName() {
		return genericElementEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenericVoidElement() {
		return genericVoidElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenericVoidElement_Name() {
		return (EAttribute)genericVoidElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGenericVoidElement__TagName() {
		return genericVoidElementEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLibraryElement() {
		return libraryElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLibraryElement__TagName() {
		return libraryElementEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDocument() {
		return documentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocument_Doctype() {
		return (EAttribute)documentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocument_Lang() {
		return (EAttribute)documentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocument_Head() {
		return (EReference)documentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocument_Body() {
		return (EReference)documentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDocument__TagName() {
		return documentEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHead() {
		return headEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHead_Charset() {
		return (EAttribute)headEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHead_Title() {
		return (EAttribute)headEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHead_Base() {
		return (EAttribute)headEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHead_Metas() {
		return (EReference)headEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHead_Links() {
		return (EReference)headEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHead_Stylesheets() {
		return (EReference)headEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHead_ImportMap() {
		return (EReference)headEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHead_Scripts() {
		return (EReference)headEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getHead__TagName() {
		return headEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBody() {
		return bodyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBody__TagName() {
		return bodyEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMeta() {
		return metaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMeta_Name() {
		return (EAttribute)metaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMeta_HttpEquiv() {
		return (EAttribute)metaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMeta_Property() {
		return (EAttribute)metaEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMeta_Content() {
		return (EAttribute)metaEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMeta_Charset() {
		return (EAttribute)metaEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMeta__TagName() {
		return metaEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLink() {
		return linkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLink_Rel() {
		return (EAttribute)linkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLink_Href() {
		return (EAttribute)linkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLink_Type() {
		return (EAttribute)linkEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLink_Media() {
		return (EAttribute)linkEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLink_Sizes() {
		return (EAttribute)linkEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLink_Crossorigin() {
		return (EAttribute)linkEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLink_Integrity() {
		return (EAttribute)linkEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLink__TagName() {
		return linkEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStylesheet() {
		return stylesheetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStylesheet_Href() {
		return (EAttribute)stylesheetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStylesheet_Media() {
		return (EAttribute)stylesheetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStylesheet_Crossorigin() {
		return (EAttribute)stylesheetEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStylesheet_Integrity() {
		return (EAttribute)stylesheetEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStylesheet_Content() {
		return (EAttribute)stylesheetEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStylesheet__TagName() {
		return stylesheetEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getScript() {
		return scriptEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScript_Src() {
		return (EAttribute)scriptEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScript_Type() {
		return (EAttribute)scriptEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScript_Module() {
		return (EAttribute)scriptEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScript_Async() {
		return (EAttribute)scriptEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScript_Defer() {
		return (EAttribute)scriptEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScript_Crossorigin() {
		return (EAttribute)scriptEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScript_Integrity() {
		return (EAttribute)scriptEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScript_Content() {
		return (EAttribute)scriptEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getScript__TagName() {
		return scriptEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImportMap() {
		return importMapEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImportMap_Imports() {
		return (EReference)importMapEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImportMap_Scopes() {
		return (EReference)importMapEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getImportMap__TagName() {
		return importMapEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImportMapScope() {
		return importMapScopeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImportMapScope_Prefix() {
		return (EAttribute)importMapScopeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImportMapScope_Imports() {
		return (EReference)importMapScopeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDiv() {
		return divEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDiv__TagName() {
		return divEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSpan() {
		return spanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSpan__TagName() {
		return spanEClass.getEOperations().get(0);
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
	public EOperation getParagraph__TagName() {
		return paragraphEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHeading() {
		return headingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHeading_Level() {
		return (EAttribute)headingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getHeading__TagName() {
		return headingEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHeader() {
		return headerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getHeader__TagName() {
		return headerEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFooter() {
		return footerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFooter__TagName() {
		return footerEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMain() {
		return mainEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMain__TagName() {
		return mainEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNav() {
		return navEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNav__TagName() {
		return navEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSection() {
		return sectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSection__TagName() {
		return sectionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArticle() {
		return articleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getArticle__TagName() {
		return articleEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAside() {
		return asideEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAside__TagName() {
		return asideEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBlockquote() {
		return blockquoteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBlockquote_Cite() {
		return (EAttribute)blockquoteEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBlockquote__TagName() {
		return blockquoteEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPre() {
		return preEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPre__TagName() {
		return preEClass.getEOperations().get(0);
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
	public EOperation getFigure__TagName() {
		return figureEClass.getEOperations().get(0);
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
	public EOperation getFigureCaption__TagName() {
		return figureCaptionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDetails() {
		return detailsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDetails_Open() {
		return (EAttribute)detailsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDetails_Summary() {
		return (EReference)detailsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDetails__TagName() {
		return detailsEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSummary() {
		return summaryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSummary__TagName() {
		return summaryEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHorizontalRule() {
		return horizontalRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getHorizontalRule__TagName() {
		return horizontalRuleEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLineBreak() {
		return lineBreakEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLineBreak__TagName() {
		return lineBreakEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnchor() {
		return anchorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnchor_Href() {
		return (EAttribute)anchorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnchor_Target() {
		return (EAttribute)anchorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnchor_Rel() {
		return (EAttribute)anchorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnchor_Download() {
		return (EAttribute)anchorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAnchor__TagName() {
		return anchorEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStrong() {
		return strongEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStrong__TagName() {
		return strongEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEmphasis() {
		return emphasisEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEmphasis__TagName() {
		return emphasisEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCode() {
		return codeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCode__TagName() {
		return codeEClass.getEOperations().get(0);
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
	public EAttribute getImage_Srcset() {
		return (EAttribute)imageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImage_Sizes() {
		return (EAttribute)imageEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImage_Width() {
		return (EAttribute)imageEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImage_Height() {
		return (EAttribute)imageEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImage_Loading() {
		return (EAttribute)imageEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getImage__TagName() {
		return imageEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInlineFrame() {
		return inlineFrameEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInlineFrame_Src() {
		return (EAttribute)inlineFrameEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInlineFrame_Title() {
		return (EAttribute)inlineFrameEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInlineFrame_Width() {
		return (EAttribute)inlineFrameEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInlineFrame_Height() {
		return (EAttribute)inlineFrameEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInlineFrame_Allow() {
		return (EAttribute)inlineFrameEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInlineFrame_Loading() {
		return (EAttribute)inlineFrameEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getInlineFrame__TagName() {
		return inlineFrameEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getItemList() {
		return itemListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getItemList_Items() {
		return (EReference)itemListEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnorderedList() {
		return unorderedListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUnorderedList__TagName() {
		return unorderedListEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOrderedList() {
		return orderedListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOrderedList_Start() {
		return (EAttribute)orderedListEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOrderedList_Reversed() {
		return (EAttribute)orderedListEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOrderedList_Type() {
		return (EAttribute)orderedListEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getOrderedList__TagName() {
		return orderedListEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListItem() {
		return listItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getListItem_Value() {
		return (EAttribute)listItemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getListItem__TagName() {
		return listItemEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDescriptionListItem() {
		return descriptionListItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDescriptionList() {
		return descriptionListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDescriptionList_Items() {
		return (EReference)descriptionListEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDescriptionList__TagName() {
		return descriptionListEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDescriptionTerm() {
		return descriptionTermEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDescriptionTerm__TagName() {
		return descriptionTermEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDescriptionDetails() {
		return descriptionDetailsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDescriptionDetails__TagName() {
		return descriptionDetailsEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTable() {
		return tableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTable_Caption() {
		return (EReference)tableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTable_ColumnGroups() {
		return (EReference)tableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTable_Head() {
		return (EReference)tableEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTable_Bodies() {
		return (EReference)tableEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTable_Foot() {
		return (EReference)tableEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTable__TagName() {
		return tableEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCaption() {
		return captionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCaption__TagName() {
		return captionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getColumnGroup() {
		return columnGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getColumnGroup_Span() {
		return (EAttribute)columnGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getColumnGroup_Columns() {
		return (EReference)columnGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getColumnGroup__TagName() {
		return columnGroupEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getColumn() {
		return columnEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getColumn_Span() {
		return (EAttribute)columnEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getColumn__TagName() {
		return columnEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTableSection() {
		return tableSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTableSection_Rows() {
		return (EReference)tableSectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTableHead() {
		return tableHeadEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTableHead__TagName() {
		return tableHeadEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTableBody() {
		return tableBodyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTableBody__TagName() {
		return tableBodyEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTableFoot() {
		return tableFootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTableFoot__TagName() {
		return tableFootEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTableRow() {
		return tableRowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTableRow_Cells() {
		return (EReference)tableRowEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTableRow__TagName() {
		return tableRowEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTableCell() {
		return tableCellEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTableCell_Header() {
		return (EAttribute)tableCellEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTableCell_Colspan() {
		return (EAttribute)tableCellEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTableCell_Rowspan() {
		return (EAttribute)tableCellEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTableCell_Scope() {
		return (EAttribute)tableCellEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTableCell_Headers() {
		return (EAttribute)tableCellEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTableCell__TagName() {
		return tableCellEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getForm() {
		return formEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getForm_Action() {
		return (EAttribute)formEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getForm_Method() {
		return (EAttribute)formEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getForm_Enctype() {
		return (EAttribute)formEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getForm_Target() {
		return (EAttribute)formEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getForm_Novalidate() {
		return (EAttribute)formEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getForm__TagName() {
		return formEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFieldset() {
		return fieldsetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFieldset_Disabled() {
		return (EAttribute)fieldsetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFieldset_Legend() {
		return (EReference)fieldsetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFieldset__TagName() {
		return fieldsetEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLegend() {
		return legendEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLegend__TagName() {
		return legendEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLabel() {
		return labelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLabel_HtmlFor() {
		return (EAttribute)labelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLabel__TagName() {
		return labelEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInput() {
		return inputEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInput_Type() {
		return (EAttribute)inputEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInput_Name() {
		return (EAttribute)inputEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInput_Value() {
		return (EAttribute)inputEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInput_Placeholder() {
		return (EAttribute)inputEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInput_Required() {
		return (EAttribute)inputEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInput_Disabled() {
		return (EAttribute)inputEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInput_Readonly() {
		return (EAttribute)inputEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInput_Checked() {
		return (EAttribute)inputEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInput_Multiple() {
		return (EAttribute)inputEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getInput__TagName() {
		return inputEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getButton() {
		return buttonEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getButton_Type() {
		return (EAttribute)buttonEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getButton_Name() {
		return (EAttribute)buttonEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getButton_Value() {
		return (EAttribute)buttonEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getButton_Disabled() {
		return (EAttribute)buttonEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getButton__TagName() {
		return buttonEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTextArea() {
		return textAreaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextArea_Name() {
		return (EAttribute)textAreaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextArea_Rows() {
		return (EAttribute)textAreaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextArea_Cols() {
		return (EAttribute)textAreaEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextArea_Placeholder() {
		return (EAttribute)textAreaEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextArea_Required() {
		return (EAttribute)textAreaEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextArea_Disabled() {
		return (EAttribute)textAreaEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextArea_Readonly() {
		return (EAttribute)textAreaEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextArea_Text() {
		return (EAttribute)textAreaEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTextArea__TagName() {
		return textAreaEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSelectItem() {
		return selectItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSelect() {
		return selectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSelect_Name() {
		return (EAttribute)selectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSelect_Multiple() {
		return (EAttribute)selectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSelect_Required() {
		return (EAttribute)selectEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSelect_Disabled() {
		return (EAttribute)selectEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSelect_Size() {
		return (EAttribute)selectEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSelect_Items() {
		return (EReference)selectEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSelect__TagName() {
		return selectEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOption() {
		return optionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOption_Value() {
		return (EAttribute)optionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOption_Label() {
		return (EAttribute)optionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOption_Selected() {
		return (EAttribute)optionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOption_Disabled() {
		return (EAttribute)optionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOption_Text() {
		return (EAttribute)optionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getOption__TagName() {
		return optionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOptionGroup() {
		return optionGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOptionGroup_Label() {
		return (EAttribute)optionGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOptionGroup_Disabled() {
		return (EAttribute)optionGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOptionGroup_Options() {
		return (EReference)optionGroupEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getOptionGroup__TagName() {
		return optionGroupEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HtmlFactory getHtmlFactory() {
		return (HtmlFactory)getEFactoryInstance();
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
		nodeEClass = createEClass(NODE);

		textEClass = createEClass(TEXT);
		createEAttribute(textEClass, TEXT__CONTENT);

		markupEClass = createEClass(MARKUP);
		createEAttribute(markupEClass, MARKUP__CONTENT);

		commentEClass = createEClass(COMMENT);
		createEAttribute(commentEClass, COMMENT__CONTENT);

		nodeReferenceEClass = createEClass(NODE_REFERENCE);
		createEReference(nodeReferenceEClass, NODE_REFERENCE__TARGET);

		containerEClass = createEClass(CONTAINER);
		createEReference(containerEClass, CONTAINER__CONTENTS);

		elementEClass = createEClass(ELEMENT);
		createEAttribute(elementEClass, ELEMENT__ID);
		createEAttribute(elementEClass, ELEMENT__CLASSES);
		createEReference(elementEClass, ELEMENT__STYLE);
		createEReference(elementEClass, ELEMENT__ATTRIBUTES);
		createEOperation(elementEClass, ELEMENT___TAG_NAME);

		voidElementEClass = createEClass(VOID_ELEMENT);

		genericElementEClass = createEClass(GENERIC_ELEMENT);
		createEAttribute(genericElementEClass, GENERIC_ELEMENT__NAME);
		createEOperation(genericElementEClass, GENERIC_ELEMENT___TAG_NAME);

		genericVoidElementEClass = createEClass(GENERIC_VOID_ELEMENT);
		createEAttribute(genericVoidElementEClass, GENERIC_VOID_ELEMENT__NAME);
		createEOperation(genericVoidElementEClass, GENERIC_VOID_ELEMENT___TAG_NAME);

		libraryElementEClass = createEClass(LIBRARY_ELEMENT);
		createEOperation(libraryElementEClass, LIBRARY_ELEMENT___TAG_NAME);

		documentEClass = createEClass(DOCUMENT);
		createEAttribute(documentEClass, DOCUMENT__DOCTYPE);
		createEAttribute(documentEClass, DOCUMENT__LANG);
		createEReference(documentEClass, DOCUMENT__HEAD);
		createEReference(documentEClass, DOCUMENT__BODY);
		createEOperation(documentEClass, DOCUMENT___TAG_NAME);

		headEClass = createEClass(HEAD);
		createEAttribute(headEClass, HEAD__CHARSET);
		createEAttribute(headEClass, HEAD__TITLE);
		createEAttribute(headEClass, HEAD__BASE);
		createEReference(headEClass, HEAD__METAS);
		createEReference(headEClass, HEAD__LINKS);
		createEReference(headEClass, HEAD__STYLESHEETS);
		createEReference(headEClass, HEAD__IMPORT_MAP);
		createEReference(headEClass, HEAD__SCRIPTS);
		createEOperation(headEClass, HEAD___TAG_NAME);

		bodyEClass = createEClass(BODY);
		createEOperation(bodyEClass, BODY___TAG_NAME);

		metaEClass = createEClass(META);
		createEAttribute(metaEClass, META__NAME);
		createEAttribute(metaEClass, META__HTTP_EQUIV);
		createEAttribute(metaEClass, META__PROPERTY);
		createEAttribute(metaEClass, META__CONTENT);
		createEAttribute(metaEClass, META__CHARSET);
		createEOperation(metaEClass, META___TAG_NAME);

		linkEClass = createEClass(LINK);
		createEAttribute(linkEClass, LINK__REL);
		createEAttribute(linkEClass, LINK__HREF);
		createEAttribute(linkEClass, LINK__TYPE);
		createEAttribute(linkEClass, LINK__MEDIA);
		createEAttribute(linkEClass, LINK__SIZES);
		createEAttribute(linkEClass, LINK__CROSSORIGIN);
		createEAttribute(linkEClass, LINK__INTEGRITY);
		createEOperation(linkEClass, LINK___TAG_NAME);

		stylesheetEClass = createEClass(STYLESHEET);
		createEAttribute(stylesheetEClass, STYLESHEET__HREF);
		createEAttribute(stylesheetEClass, STYLESHEET__MEDIA);
		createEAttribute(stylesheetEClass, STYLESHEET__CROSSORIGIN);
		createEAttribute(stylesheetEClass, STYLESHEET__INTEGRITY);
		createEAttribute(stylesheetEClass, STYLESHEET__CONTENT);
		createEOperation(stylesheetEClass, STYLESHEET___TAG_NAME);

		scriptEClass = createEClass(SCRIPT);
		createEAttribute(scriptEClass, SCRIPT__SRC);
		createEAttribute(scriptEClass, SCRIPT__TYPE);
		createEAttribute(scriptEClass, SCRIPT__MODULE);
		createEAttribute(scriptEClass, SCRIPT__ASYNC);
		createEAttribute(scriptEClass, SCRIPT__DEFER);
		createEAttribute(scriptEClass, SCRIPT__CROSSORIGIN);
		createEAttribute(scriptEClass, SCRIPT__INTEGRITY);
		createEAttribute(scriptEClass, SCRIPT__CONTENT);
		createEOperation(scriptEClass, SCRIPT___TAG_NAME);

		importMapEClass = createEClass(IMPORT_MAP);
		createEReference(importMapEClass, IMPORT_MAP__IMPORTS);
		createEReference(importMapEClass, IMPORT_MAP__SCOPES);
		createEOperation(importMapEClass, IMPORT_MAP___TAG_NAME);

		importMapScopeEClass = createEClass(IMPORT_MAP_SCOPE);
		createEAttribute(importMapScopeEClass, IMPORT_MAP_SCOPE__PREFIX);
		createEReference(importMapScopeEClass, IMPORT_MAP_SCOPE__IMPORTS);

		divEClass = createEClass(DIV);
		createEOperation(divEClass, DIV___TAG_NAME);

		spanEClass = createEClass(SPAN);
		createEOperation(spanEClass, SPAN___TAG_NAME);

		paragraphEClass = createEClass(PARAGRAPH);
		createEOperation(paragraphEClass, PARAGRAPH___TAG_NAME);

		headingEClass = createEClass(HEADING);
		createEAttribute(headingEClass, HEADING__LEVEL);
		createEOperation(headingEClass, HEADING___TAG_NAME);

		headerEClass = createEClass(HEADER);
		createEOperation(headerEClass, HEADER___TAG_NAME);

		footerEClass = createEClass(FOOTER);
		createEOperation(footerEClass, FOOTER___TAG_NAME);

		mainEClass = createEClass(MAIN);
		createEOperation(mainEClass, MAIN___TAG_NAME);

		navEClass = createEClass(NAV);
		createEOperation(navEClass, NAV___TAG_NAME);

		sectionEClass = createEClass(SECTION);
		createEOperation(sectionEClass, SECTION___TAG_NAME);

		articleEClass = createEClass(ARTICLE);
		createEOperation(articleEClass, ARTICLE___TAG_NAME);

		asideEClass = createEClass(ASIDE);
		createEOperation(asideEClass, ASIDE___TAG_NAME);

		blockquoteEClass = createEClass(BLOCKQUOTE);
		createEAttribute(blockquoteEClass, BLOCKQUOTE__CITE);
		createEOperation(blockquoteEClass, BLOCKQUOTE___TAG_NAME);

		preEClass = createEClass(PRE);
		createEOperation(preEClass, PRE___TAG_NAME);

		figureEClass = createEClass(FIGURE);
		createEOperation(figureEClass, FIGURE___TAG_NAME);

		figureCaptionEClass = createEClass(FIGURE_CAPTION);
		createEOperation(figureCaptionEClass, FIGURE_CAPTION___TAG_NAME);

		detailsEClass = createEClass(DETAILS);
		createEAttribute(detailsEClass, DETAILS__OPEN);
		createEReference(detailsEClass, DETAILS__SUMMARY);
		createEOperation(detailsEClass, DETAILS___TAG_NAME);

		summaryEClass = createEClass(SUMMARY);
		createEOperation(summaryEClass, SUMMARY___TAG_NAME);

		horizontalRuleEClass = createEClass(HORIZONTAL_RULE);
		createEOperation(horizontalRuleEClass, HORIZONTAL_RULE___TAG_NAME);

		lineBreakEClass = createEClass(LINE_BREAK);
		createEOperation(lineBreakEClass, LINE_BREAK___TAG_NAME);

		anchorEClass = createEClass(ANCHOR);
		createEAttribute(anchorEClass, ANCHOR__HREF);
		createEAttribute(anchorEClass, ANCHOR__TARGET);
		createEAttribute(anchorEClass, ANCHOR__REL);
		createEAttribute(anchorEClass, ANCHOR__DOWNLOAD);
		createEOperation(anchorEClass, ANCHOR___TAG_NAME);

		strongEClass = createEClass(STRONG);
		createEOperation(strongEClass, STRONG___TAG_NAME);

		emphasisEClass = createEClass(EMPHASIS);
		createEOperation(emphasisEClass, EMPHASIS___TAG_NAME);

		codeEClass = createEClass(CODE);
		createEOperation(codeEClass, CODE___TAG_NAME);

		imageEClass = createEClass(IMAGE);
		createEAttribute(imageEClass, IMAGE__SRC);
		createEAttribute(imageEClass, IMAGE__ALT);
		createEAttribute(imageEClass, IMAGE__SRCSET);
		createEAttribute(imageEClass, IMAGE__SIZES);
		createEAttribute(imageEClass, IMAGE__WIDTH);
		createEAttribute(imageEClass, IMAGE__HEIGHT);
		createEAttribute(imageEClass, IMAGE__LOADING);
		createEOperation(imageEClass, IMAGE___TAG_NAME);

		inlineFrameEClass = createEClass(INLINE_FRAME);
		createEAttribute(inlineFrameEClass, INLINE_FRAME__SRC);
		createEAttribute(inlineFrameEClass, INLINE_FRAME__TITLE);
		createEAttribute(inlineFrameEClass, INLINE_FRAME__WIDTH);
		createEAttribute(inlineFrameEClass, INLINE_FRAME__HEIGHT);
		createEAttribute(inlineFrameEClass, INLINE_FRAME__ALLOW);
		createEAttribute(inlineFrameEClass, INLINE_FRAME__LOADING);
		createEOperation(inlineFrameEClass, INLINE_FRAME___TAG_NAME);

		itemListEClass = createEClass(ITEM_LIST);
		createEReference(itemListEClass, ITEM_LIST__ITEMS);

		unorderedListEClass = createEClass(UNORDERED_LIST);
		createEOperation(unorderedListEClass, UNORDERED_LIST___TAG_NAME);

		orderedListEClass = createEClass(ORDERED_LIST);
		createEAttribute(orderedListEClass, ORDERED_LIST__START);
		createEAttribute(orderedListEClass, ORDERED_LIST__REVERSED);
		createEAttribute(orderedListEClass, ORDERED_LIST__TYPE);
		createEOperation(orderedListEClass, ORDERED_LIST___TAG_NAME);

		listItemEClass = createEClass(LIST_ITEM);
		createEAttribute(listItemEClass, LIST_ITEM__VALUE);
		createEOperation(listItemEClass, LIST_ITEM___TAG_NAME);

		descriptionListItemEClass = createEClass(DESCRIPTION_LIST_ITEM);

		descriptionListEClass = createEClass(DESCRIPTION_LIST);
		createEReference(descriptionListEClass, DESCRIPTION_LIST__ITEMS);
		createEOperation(descriptionListEClass, DESCRIPTION_LIST___TAG_NAME);

		descriptionTermEClass = createEClass(DESCRIPTION_TERM);
		createEOperation(descriptionTermEClass, DESCRIPTION_TERM___TAG_NAME);

		descriptionDetailsEClass = createEClass(DESCRIPTION_DETAILS);
		createEOperation(descriptionDetailsEClass, DESCRIPTION_DETAILS___TAG_NAME);

		tableEClass = createEClass(TABLE);
		createEReference(tableEClass, TABLE__CAPTION);
		createEReference(tableEClass, TABLE__COLUMN_GROUPS);
		createEReference(tableEClass, TABLE__HEAD);
		createEReference(tableEClass, TABLE__BODIES);
		createEReference(tableEClass, TABLE__FOOT);
		createEOperation(tableEClass, TABLE___TAG_NAME);

		captionEClass = createEClass(CAPTION);
		createEOperation(captionEClass, CAPTION___TAG_NAME);

		columnGroupEClass = createEClass(COLUMN_GROUP);
		createEAttribute(columnGroupEClass, COLUMN_GROUP__SPAN);
		createEReference(columnGroupEClass, COLUMN_GROUP__COLUMNS);
		createEOperation(columnGroupEClass, COLUMN_GROUP___TAG_NAME);

		columnEClass = createEClass(COLUMN);
		createEAttribute(columnEClass, COLUMN__SPAN);
		createEOperation(columnEClass, COLUMN___TAG_NAME);

		tableSectionEClass = createEClass(TABLE_SECTION);
		createEReference(tableSectionEClass, TABLE_SECTION__ROWS);

		tableHeadEClass = createEClass(TABLE_HEAD);
		createEOperation(tableHeadEClass, TABLE_HEAD___TAG_NAME);

		tableBodyEClass = createEClass(TABLE_BODY);
		createEOperation(tableBodyEClass, TABLE_BODY___TAG_NAME);

		tableFootEClass = createEClass(TABLE_FOOT);
		createEOperation(tableFootEClass, TABLE_FOOT___TAG_NAME);

		tableRowEClass = createEClass(TABLE_ROW);
		createEReference(tableRowEClass, TABLE_ROW__CELLS);
		createEOperation(tableRowEClass, TABLE_ROW___TAG_NAME);

		tableCellEClass = createEClass(TABLE_CELL);
		createEAttribute(tableCellEClass, TABLE_CELL__HEADER);
		createEAttribute(tableCellEClass, TABLE_CELL__COLSPAN);
		createEAttribute(tableCellEClass, TABLE_CELL__ROWSPAN);
		createEAttribute(tableCellEClass, TABLE_CELL__SCOPE);
		createEAttribute(tableCellEClass, TABLE_CELL__HEADERS);
		createEOperation(tableCellEClass, TABLE_CELL___TAG_NAME);

		formEClass = createEClass(FORM);
		createEAttribute(formEClass, FORM__ACTION);
		createEAttribute(formEClass, FORM__METHOD);
		createEAttribute(formEClass, FORM__ENCTYPE);
		createEAttribute(formEClass, FORM__TARGET);
		createEAttribute(formEClass, FORM__NOVALIDATE);
		createEOperation(formEClass, FORM___TAG_NAME);

		fieldsetEClass = createEClass(FIELDSET);
		createEAttribute(fieldsetEClass, FIELDSET__DISABLED);
		createEReference(fieldsetEClass, FIELDSET__LEGEND);
		createEOperation(fieldsetEClass, FIELDSET___TAG_NAME);

		legendEClass = createEClass(LEGEND);
		createEOperation(legendEClass, LEGEND___TAG_NAME);

		labelEClass = createEClass(LABEL);
		createEAttribute(labelEClass, LABEL__HTML_FOR);
		createEOperation(labelEClass, LABEL___TAG_NAME);

		inputEClass = createEClass(INPUT);
		createEAttribute(inputEClass, INPUT__TYPE);
		createEAttribute(inputEClass, INPUT__NAME);
		createEAttribute(inputEClass, INPUT__VALUE);
		createEAttribute(inputEClass, INPUT__PLACEHOLDER);
		createEAttribute(inputEClass, INPUT__REQUIRED);
		createEAttribute(inputEClass, INPUT__DISABLED);
		createEAttribute(inputEClass, INPUT__READONLY);
		createEAttribute(inputEClass, INPUT__CHECKED);
		createEAttribute(inputEClass, INPUT__MULTIPLE);
		createEOperation(inputEClass, INPUT___TAG_NAME);

		buttonEClass = createEClass(BUTTON);
		createEAttribute(buttonEClass, BUTTON__TYPE);
		createEAttribute(buttonEClass, BUTTON__NAME);
		createEAttribute(buttonEClass, BUTTON__VALUE);
		createEAttribute(buttonEClass, BUTTON__DISABLED);
		createEOperation(buttonEClass, BUTTON___TAG_NAME);

		textAreaEClass = createEClass(TEXT_AREA);
		createEAttribute(textAreaEClass, TEXT_AREA__NAME);
		createEAttribute(textAreaEClass, TEXT_AREA__ROWS);
		createEAttribute(textAreaEClass, TEXT_AREA__COLS);
		createEAttribute(textAreaEClass, TEXT_AREA__PLACEHOLDER);
		createEAttribute(textAreaEClass, TEXT_AREA__REQUIRED);
		createEAttribute(textAreaEClass, TEXT_AREA__DISABLED);
		createEAttribute(textAreaEClass, TEXT_AREA__READONLY);
		createEAttribute(textAreaEClass, TEXT_AREA__TEXT);
		createEOperation(textAreaEClass, TEXT_AREA___TAG_NAME);

		selectItemEClass = createEClass(SELECT_ITEM);

		selectEClass = createEClass(SELECT);
		createEAttribute(selectEClass, SELECT__NAME);
		createEAttribute(selectEClass, SELECT__MULTIPLE);
		createEAttribute(selectEClass, SELECT__REQUIRED);
		createEAttribute(selectEClass, SELECT__DISABLED);
		createEAttribute(selectEClass, SELECT__SIZE);
		createEReference(selectEClass, SELECT__ITEMS);
		createEOperation(selectEClass, SELECT___TAG_NAME);

		optionEClass = createEClass(OPTION);
		createEAttribute(optionEClass, OPTION__VALUE);
		createEAttribute(optionEClass, OPTION__LABEL);
		createEAttribute(optionEClass, OPTION__SELECTED);
		createEAttribute(optionEClass, OPTION__DISABLED);
		createEAttribute(optionEClass, OPTION__TEXT);
		createEOperation(optionEClass, OPTION___TAG_NAME);

		optionGroupEClass = createEClass(OPTION_GROUP);
		createEAttribute(optionGroupEClass, OPTION_GROUP__LABEL);
		createEAttribute(optionGroupEClass, OPTION_GROUP__DISABLED);
		createEReference(optionGroupEClass, OPTION_GROUP__OPTIONS);
		createEOperation(optionGroupEClass, OPTION_GROUP___TAG_NAME);
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
		CorePackage theCorePackage = (CorePackage)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		nodeEClass.getESuperTypes().add(theCorePackage.getMarked());
		textEClass.getESuperTypes().add(this.getNode());
		markupEClass.getESuperTypes().add(this.getNode());
		commentEClass.getESuperTypes().add(this.getNode());
		nodeReferenceEClass.getESuperTypes().add(this.getNode());
		elementEClass.getESuperTypes().add(this.getNode());
		voidElementEClass.getESuperTypes().add(this.getElement());
		genericElementEClass.getESuperTypes().add(this.getElement());
		genericElementEClass.getESuperTypes().add(this.getContainer());
		genericVoidElementEClass.getESuperTypes().add(this.getVoidElement());
		libraryElementEClass.getESuperTypes().add(this.getElement());
		libraryElementEClass.getESuperTypes().add(this.getContainer());
		documentEClass.getESuperTypes().add(this.getElement());
		headEClass.getESuperTypes().add(this.getElement());
		headEClass.getESuperTypes().add(this.getContainer());
		bodyEClass.getESuperTypes().add(this.getElement());
		bodyEClass.getESuperTypes().add(this.getContainer());
		metaEClass.getESuperTypes().add(this.getVoidElement());
		linkEClass.getESuperTypes().add(this.getVoidElement());
		stylesheetEClass.getESuperTypes().add(this.getElement());
		scriptEClass.getESuperTypes().add(this.getElement());
		importMapEClass.getESuperTypes().add(this.getElement());
		divEClass.getESuperTypes().add(this.getElement());
		divEClass.getESuperTypes().add(this.getContainer());
		spanEClass.getESuperTypes().add(this.getElement());
		spanEClass.getESuperTypes().add(this.getContainer());
		paragraphEClass.getESuperTypes().add(this.getElement());
		paragraphEClass.getESuperTypes().add(this.getContainer());
		headingEClass.getESuperTypes().add(this.getElement());
		headingEClass.getESuperTypes().add(this.getContainer());
		headerEClass.getESuperTypes().add(this.getElement());
		headerEClass.getESuperTypes().add(this.getContainer());
		footerEClass.getESuperTypes().add(this.getElement());
		footerEClass.getESuperTypes().add(this.getContainer());
		mainEClass.getESuperTypes().add(this.getElement());
		mainEClass.getESuperTypes().add(this.getContainer());
		navEClass.getESuperTypes().add(this.getElement());
		navEClass.getESuperTypes().add(this.getContainer());
		sectionEClass.getESuperTypes().add(this.getElement());
		sectionEClass.getESuperTypes().add(this.getContainer());
		articleEClass.getESuperTypes().add(this.getElement());
		articleEClass.getESuperTypes().add(this.getContainer());
		asideEClass.getESuperTypes().add(this.getElement());
		asideEClass.getESuperTypes().add(this.getContainer());
		blockquoteEClass.getESuperTypes().add(this.getElement());
		blockquoteEClass.getESuperTypes().add(this.getContainer());
		preEClass.getESuperTypes().add(this.getElement());
		preEClass.getESuperTypes().add(this.getContainer());
		figureEClass.getESuperTypes().add(this.getElement());
		figureEClass.getESuperTypes().add(this.getContainer());
		figureCaptionEClass.getESuperTypes().add(this.getElement());
		figureCaptionEClass.getESuperTypes().add(this.getContainer());
		detailsEClass.getESuperTypes().add(this.getElement());
		detailsEClass.getESuperTypes().add(this.getContainer());
		summaryEClass.getESuperTypes().add(this.getElement());
		summaryEClass.getESuperTypes().add(this.getContainer());
		horizontalRuleEClass.getESuperTypes().add(this.getVoidElement());
		lineBreakEClass.getESuperTypes().add(this.getVoidElement());
		anchorEClass.getESuperTypes().add(this.getElement());
		anchorEClass.getESuperTypes().add(this.getContainer());
		strongEClass.getESuperTypes().add(this.getElement());
		strongEClass.getESuperTypes().add(this.getContainer());
		emphasisEClass.getESuperTypes().add(this.getElement());
		emphasisEClass.getESuperTypes().add(this.getContainer());
		codeEClass.getESuperTypes().add(this.getElement());
		codeEClass.getESuperTypes().add(this.getContainer());
		imageEClass.getESuperTypes().add(this.getVoidElement());
		inlineFrameEClass.getESuperTypes().add(this.getElement());
		unorderedListEClass.getESuperTypes().add(this.getElement());
		unorderedListEClass.getESuperTypes().add(this.getItemList());
		orderedListEClass.getESuperTypes().add(this.getElement());
		orderedListEClass.getESuperTypes().add(this.getItemList());
		listItemEClass.getESuperTypes().add(this.getElement());
		listItemEClass.getESuperTypes().add(this.getContainer());
		descriptionListEClass.getESuperTypes().add(this.getElement());
		descriptionTermEClass.getESuperTypes().add(this.getElement());
		descriptionTermEClass.getESuperTypes().add(this.getContainer());
		descriptionTermEClass.getESuperTypes().add(this.getDescriptionListItem());
		descriptionDetailsEClass.getESuperTypes().add(this.getElement());
		descriptionDetailsEClass.getESuperTypes().add(this.getContainer());
		descriptionDetailsEClass.getESuperTypes().add(this.getDescriptionListItem());
		tableEClass.getESuperTypes().add(this.getElement());
		captionEClass.getESuperTypes().add(this.getElement());
		captionEClass.getESuperTypes().add(this.getContainer());
		columnGroupEClass.getESuperTypes().add(this.getElement());
		columnEClass.getESuperTypes().add(this.getVoidElement());
		tableSectionEClass.getESuperTypes().add(this.getElement());
		tableHeadEClass.getESuperTypes().add(this.getTableSection());
		tableBodyEClass.getESuperTypes().add(this.getTableSection());
		tableFootEClass.getESuperTypes().add(this.getTableSection());
		tableRowEClass.getESuperTypes().add(this.getElement());
		tableCellEClass.getESuperTypes().add(this.getElement());
		tableCellEClass.getESuperTypes().add(this.getContainer());
		formEClass.getESuperTypes().add(this.getElement());
		formEClass.getESuperTypes().add(this.getContainer());
		fieldsetEClass.getESuperTypes().add(this.getElement());
		fieldsetEClass.getESuperTypes().add(this.getContainer());
		legendEClass.getESuperTypes().add(this.getElement());
		legendEClass.getESuperTypes().add(this.getContainer());
		labelEClass.getESuperTypes().add(this.getElement());
		labelEClass.getESuperTypes().add(this.getContainer());
		inputEClass.getESuperTypes().add(this.getVoidElement());
		buttonEClass.getESuperTypes().add(this.getElement());
		buttonEClass.getESuperTypes().add(this.getContainer());
		textAreaEClass.getESuperTypes().add(this.getElement());
		selectEClass.getESuperTypes().add(this.getElement());
		optionEClass.getESuperTypes().add(this.getElement());
		optionEClass.getESuperTypes().add(this.getSelectItem());
		optionGroupEClass.getESuperTypes().add(this.getElement());
		optionGroupEClass.getESuperTypes().add(this.getSelectItem());

		// Initialize classes, features, and operations; add parameters
		initEClass(nodeEClass, Node.class, "Node", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(textEClass, Text.class, "Text", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getText_Content(), theEcorePackage.getEString(), "content", null, 0, 1, Text.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(markupEClass, Markup.class, "Markup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMarkup_Content(), theEcorePackage.getEString(), "content", null, 0, 1, Markup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(commentEClass, Comment.class, "Comment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getComment_Content(), theEcorePackage.getEString(), "content", null, 0, 1, Comment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nodeReferenceEClass, NodeReference.class, "NodeReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNodeReference_Target(), this.getNode(), null, "target", null, 0, 1, NodeReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(containerEClass, org.nasdanika.sdk.runtime.models.html.Container.class, "Container", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getContainer_Contents(), this.getNode(), null, "contents", null, 0, -1, org.nasdanika.sdk.runtime.models.html.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(elementEClass, Element.class, "Element", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getElement_Id(), theEcorePackage.getEString(), "id", null, 0, 1, Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getElement_Classes(), theEcorePackage.getEString(), "classes", null, 0, -1, Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getElement_Style(), theCorePackage.getStringToStringMapEntry(), null, "style", null, 0, -1, Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getElement_Attributes(), theCorePackage.getStringToStringMapEntry(), null, "attributes", null, 0, -1, Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getElement__TagName(), theEcorePackage.getEString(), "tagName", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(voidElementEClass, VoidElement.class, "VoidElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(genericElementEClass, GenericElement.class, "GenericElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGenericElement_Name(), theEcorePackage.getEString(), "name", null, 0, 1, GenericElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getGenericElement__TagName(), theEcorePackage.getEString(), "tagName", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(genericVoidElementEClass, GenericVoidElement.class, "GenericVoidElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGenericVoidElement_Name(), theEcorePackage.getEString(), "name", null, 0, 1, GenericVoidElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getGenericVoidElement__TagName(), theEcorePackage.getEString(), "tagName", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(libraryElementEClass, LibraryElement.class, "LibraryElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getLibraryElement__TagName(), theEcorePackage.getEString(), "tagName", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(documentEClass, Document.class, "Document", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocument_Doctype(), theEcorePackage.getEString(), "doctype", "html", 0, 1, Document.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocument_Lang(), theEcorePackage.getEString(), "lang", null, 0, 1, Document.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocument_Head(), this.getHead(), null, "head", null, 0, 1, Document.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocument_Body(), this.getBody(), null, "body", null, 0, 1, Document.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getDocument__TagName(), theEcorePackage.getEString(), "tagName", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(headEClass, Head.class, "Head", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHead_Charset(), theEcorePackage.getEString(), "charset", "utf-8", 0, 1, Head.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHead_Title(), theEcorePackage.getEString(), "title", null, 0, 1, Head.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHead_Base(), theEcorePackage.getEString(), "base", null, 0, 1, Head.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHead_Metas(), this.getMeta(), null, "metas", null, 0, -1, Head.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHead_Links(), this.getLink(), null, "links", null, 0, -1, Head.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHead_Stylesheets(), this.getStylesheet(), null, "stylesheets", null, 0, -1, Head.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHead_ImportMap(), this.getImportMap(), null, "importMap", null, 0, 1, Head.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHead_Scripts(), this.getScript(), null, "scripts", null, 0, -1, Head.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getHead__TagName(), theEcorePackage.getEString(), "tagName", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(bodyEClass, Body.class, "Body", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getBody__TagName(), theEcorePackage.getEString(), "tagName", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(metaEClass, Meta.class, "Meta", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMeta_Name(), theEcorePackage.getEString(), "name", null, 0, 1, Meta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMeta_HttpEquiv(), theEcorePackage.getEString(), "httpEquiv", null, 0, 1, Meta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMeta_Property(), theEcorePackage.getEString(), "property", null, 0, 1, Meta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMeta_Content(), theEcorePackage.getEString(), "content", null, 0, 1, Meta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMeta_Charset(), theEcorePackage.getEString(), "charset", null, 0, 1, Meta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getMeta__TagName(), theEcorePackage.getEString(), "tagName", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(linkEClass, Link.class, "Link", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLink_Rel(), theEcorePackage.getEString(), "rel", null, 0, 1, Link.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLink_Href(), theEcorePackage.getEString(), "href", null, 0, 1, Link.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLink_Type(), theEcorePackage.getEString(), "type", null, 0, 1, Link.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLink_Media(), theEcorePackage.getEString(), "media", null, 0, 1, Link.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLink_Sizes(), theEcorePackage.getEString(), "sizes", null, 0, 1, Link.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLink_Crossorigin(), theEcorePackage.getEString(), "crossorigin", null, 0, 1, Link.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLink_Integrity(), theEcorePackage.getEString(), "integrity", null, 0, 1, Link.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getLink__TagName(), theEcorePackage.getEString(), "tagName", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(stylesheetEClass, Stylesheet.class, "Stylesheet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStylesheet_Href(), theEcorePackage.getEString(), "href", null, 0, 1, Stylesheet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStylesheet_Media(), theEcorePackage.getEString(), "media", null, 0, 1, Stylesheet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStylesheet_Crossorigin(), theEcorePackage.getEString(), "crossorigin", null, 0, 1, Stylesheet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStylesheet_Integrity(), theEcorePackage.getEString(), "integrity", null, 0, 1, Stylesheet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStylesheet_Content(), theEcorePackage.getEString(), "content", null, 0, 1, Stylesheet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getStylesheet__TagName(), theEcorePackage.getEString(), "tagName", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(scriptEClass, Script.class, "Script", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getScript_Src(), theEcorePackage.getEString(), "src", null, 0, 1, Script.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getScript_Type(), theEcorePackage.getEString(), "type", null, 0, 1, Script.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getScript_Module(), theEcorePackage.getEBoolean(), "module", null, 0, 1, Script.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getScript_Async(), theEcorePackage.getEBoolean(), "async", null, 0, 1, Script.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getScript_Defer(), theEcorePackage.getEBoolean(), "defer", null, 0, 1, Script.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getScript_Crossorigin(), theEcorePackage.getEString(), "crossorigin", null, 0, 1, Script.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getScript_Integrity(), theEcorePackage.getEString(), "integrity", null, 0, 1, Script.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getScript_Content(), theEcorePackage.getEString(), "content", null, 0, 1, Script.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getScript__TagName(), theEcorePackage.getEString(), "tagName", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(importMapEClass, ImportMap.class, "ImportMap", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getImportMap_Imports(), theCorePackage.getStringToStringMapEntry(), null, "imports", null, 0, -1, ImportMap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getImportMap_Scopes(), this.getImportMapScope(), null, "scopes", null, 0, -1, ImportMap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getImportMap__TagName(), theEcorePackage.getEString(), "tagName", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(importMapScopeEClass, ImportMapScope.class, "ImportMapScope", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getImportMapScope_Prefix(), theEcorePackage.getEString(), "prefix", null, 0, 1, ImportMapScope.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getImportMapScope_Imports(), theCorePackage.getStringToStringMapEntry(), null, "imports", null, 0, -1, ImportMapScope.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(divEClass, Div.class, "Div", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getDiv__TagName(), theEcorePackage.getEString(), "tagName", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(spanEClass, Span.class, "Span", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getSpan__TagName(), theEcorePackage.getEString(), "tagName", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(paragraphEClass, Paragraph.class, "Paragraph", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getParagraph__TagName(), theEcorePackage.getEString(), "tagName", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(headingEClass, Heading.class, "Heading", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHeading_Level(), theEcorePackage.getEInt(), "level", "1", 0, 1, Heading.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getHeading__TagName(), theEcorePackage.getEString(), "tagName", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(headerEClass, Header.class, "Header", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getHeader__TagName(), theEcorePackage.getEString(), "tagName", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(footerEClass, Footer.class, "Footer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getFooter__TagName(), theEcorePackage.getEString(), "tagName", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(mainEClass, Main.class, "Main", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getMain__TagName(), theEcorePackage.getEString(), "tagName", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(navEClass, Nav.class, "Nav", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getNav__TagName(), theEcorePackage.getEString(), "tagName", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(sectionEClass, Section.class, "Section", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getSection__TagName(), theEcorePackage.getEString(), "tagName", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(articleEClass, Article.class, "Article", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getArticle__TagName(), theEcorePackage.getEString(), "tagName", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(asideEClass, Aside.class, "Aside", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getAside__TagName(), theEcorePackage.getEString(), "tagName", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(blockquoteEClass, Blockquote.class, "Blockquote", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBlockquote_Cite(), theEcorePackage.getEString(), "cite", null, 0, 1, Blockquote.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getBlockquote__TagName(), theEcorePackage.getEString(), "tagName", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(preEClass, Pre.class, "Pre", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getPre__TagName(), theEcorePackage.getEString(), "tagName", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(figureEClass, Figure.class, "Figure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getFigure__TagName(), theEcorePackage.getEString(), "tagName", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(figureCaptionEClass, FigureCaption.class, "FigureCaption", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getFigureCaption__TagName(), theEcorePackage.getEString(), "tagName", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(detailsEClass, Details.class, "Details", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDetails_Open(), theEcorePackage.getEBoolean(), "open", null, 0, 1, Details.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDetails_Summary(), this.getSummary(), null, "summary", null, 0, 1, Details.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getDetails__TagName(), theEcorePackage.getEString(), "tagName", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(summaryEClass, Summary.class, "Summary", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getSummary__TagName(), theEcorePackage.getEString(), "tagName", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(horizontalRuleEClass, HorizontalRule.class, "HorizontalRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getHorizontalRule__TagName(), theEcorePackage.getEString(), "tagName", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(lineBreakEClass, LineBreak.class, "LineBreak", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getLineBreak__TagName(), theEcorePackage.getEString(), "tagName", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(anchorEClass, Anchor.class, "Anchor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAnchor_Href(), theEcorePackage.getEString(), "href", null, 0, 1, Anchor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnchor_Target(), theEcorePackage.getEString(), "target", null, 0, 1, Anchor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnchor_Rel(), theEcorePackage.getEString(), "rel", null, 0, 1, Anchor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnchor_Download(), theEcorePackage.getEString(), "download", null, 0, 1, Anchor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getAnchor__TagName(), theEcorePackage.getEString(), "tagName", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(strongEClass, Strong.class, "Strong", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getStrong__TagName(), theEcorePackage.getEString(), "tagName", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(emphasisEClass, Emphasis.class, "Emphasis", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getEmphasis__TagName(), theEcorePackage.getEString(), "tagName", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(codeEClass, Code.class, "Code", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getCode__TagName(), theEcorePackage.getEString(), "tagName", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(imageEClass, Image.class, "Image", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getImage_Src(), theEcorePackage.getEString(), "src", null, 0, 1, Image.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getImage_Alt(), theEcorePackage.getEString(), "alt", null, 0, 1, Image.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getImage_Srcset(), theEcorePackage.getEString(), "srcset", null, 0, 1, Image.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getImage_Sizes(), theEcorePackage.getEString(), "sizes", null, 0, 1, Image.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getImage_Width(), theEcorePackage.getEInt(), "width", null, 0, 1, Image.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getImage_Height(), theEcorePackage.getEInt(), "height", null, 0, 1, Image.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getImage_Loading(), theEcorePackage.getEString(), "loading", null, 0, 1, Image.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getImage__TagName(), theEcorePackage.getEString(), "tagName", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(inlineFrameEClass, InlineFrame.class, "InlineFrame", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInlineFrame_Src(), theEcorePackage.getEString(), "src", null, 0, 1, InlineFrame.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInlineFrame_Title(), theEcorePackage.getEString(), "title", null, 0, 1, InlineFrame.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInlineFrame_Width(), theEcorePackage.getEInt(), "width", null, 0, 1, InlineFrame.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInlineFrame_Height(), theEcorePackage.getEInt(), "height", null, 0, 1, InlineFrame.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInlineFrame_Allow(), theEcorePackage.getEString(), "allow", null, 0, 1, InlineFrame.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInlineFrame_Loading(), theEcorePackage.getEString(), "loading", null, 0, 1, InlineFrame.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getInlineFrame__TagName(), theEcorePackage.getEString(), "tagName", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(itemListEClass, ItemList.class, "ItemList", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getItemList_Items(), this.getListItem(), null, "items", null, 0, -1, ItemList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(unorderedListEClass, UnorderedList.class, "UnorderedList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getUnorderedList__TagName(), theEcorePackage.getEString(), "tagName", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(orderedListEClass, OrderedList.class, "OrderedList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOrderedList_Start(), theEcorePackage.getEInt(), "start", null, 0, 1, OrderedList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderedList_Reversed(), theEcorePackage.getEBoolean(), "reversed", null, 0, 1, OrderedList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderedList_Type(), theEcorePackage.getEString(), "type", null, 0, 1, OrderedList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getOrderedList__TagName(), theEcorePackage.getEString(), "tagName", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(listItemEClass, ListItem.class, "ListItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getListItem_Value(), theEcorePackage.getEInt(), "value", null, 0, 1, ListItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getListItem__TagName(), theEcorePackage.getEString(), "tagName", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(descriptionListItemEClass, DescriptionListItem.class, "DescriptionListItem", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(descriptionListEClass, DescriptionList.class, "DescriptionList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDescriptionList_Items(), this.getDescriptionListItem(), null, "items", null, 0, -1, DescriptionList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getDescriptionList__TagName(), theEcorePackage.getEString(), "tagName", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(descriptionTermEClass, DescriptionTerm.class, "DescriptionTerm", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getDescriptionTerm__TagName(), theEcorePackage.getEString(), "tagName", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(descriptionDetailsEClass, DescriptionDetails.class, "DescriptionDetails", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getDescriptionDetails__TagName(), theEcorePackage.getEString(), "tagName", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(tableEClass, Table.class, "Table", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTable_Caption(), this.getCaption(), null, "caption", null, 0, 1, Table.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTable_ColumnGroups(), this.getColumnGroup(), null, "columnGroups", null, 0, -1, Table.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTable_Head(), this.getTableHead(), null, "head", null, 0, 1, Table.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTable_Bodies(), this.getTableBody(), null, "bodies", null, 0, -1, Table.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTable_Foot(), this.getTableFoot(), null, "foot", null, 0, 1, Table.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getTable__TagName(), theEcorePackage.getEString(), "tagName", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(captionEClass, Caption.class, "Caption", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getCaption__TagName(), theEcorePackage.getEString(), "tagName", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(columnGroupEClass, ColumnGroup.class, "ColumnGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getColumnGroup_Span(), theEcorePackage.getEInt(), "span", null, 0, 1, ColumnGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getColumnGroup_Columns(), this.getColumn(), null, "columns", null, 0, -1, ColumnGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getColumnGroup__TagName(), theEcorePackage.getEString(), "tagName", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(columnEClass, Column.class, "Column", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getColumn_Span(), theEcorePackage.getEInt(), "span", null, 0, 1, Column.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getColumn__TagName(), theEcorePackage.getEString(), "tagName", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(tableSectionEClass, TableSection.class, "TableSection", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTableSection_Rows(), this.getTableRow(), null, "rows", null, 0, -1, TableSection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tableHeadEClass, TableHead.class, "TableHead", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getTableHead__TagName(), theEcorePackage.getEString(), "tagName", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(tableBodyEClass, TableBody.class, "TableBody", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getTableBody__TagName(), theEcorePackage.getEString(), "tagName", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(tableFootEClass, TableFoot.class, "TableFoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getTableFoot__TagName(), theEcorePackage.getEString(), "tagName", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(tableRowEClass, TableRow.class, "TableRow", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTableRow_Cells(), this.getTableCell(), null, "cells", null, 0, -1, TableRow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getTableRow__TagName(), theEcorePackage.getEString(), "tagName", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(tableCellEClass, TableCell.class, "TableCell", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTableCell_Header(), theEcorePackage.getEBoolean(), "header", null, 0, 1, TableCell.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTableCell_Colspan(), theEcorePackage.getEInt(), "colspan", null, 0, 1, TableCell.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTableCell_Rowspan(), theEcorePackage.getEInt(), "rowspan", null, 0, 1, TableCell.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTableCell_Scope(), theEcorePackage.getEString(), "scope", null, 0, 1, TableCell.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTableCell_Headers(), theEcorePackage.getEString(), "headers", null, 0, 1, TableCell.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getTableCell__TagName(), theEcorePackage.getEString(), "tagName", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(formEClass, Form.class, "Form", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getForm_Action(), theEcorePackage.getEString(), "action", null, 0, 1, Form.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getForm_Method(), theEcorePackage.getEString(), "method", null, 0, 1, Form.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getForm_Enctype(), theEcorePackage.getEString(), "enctype", null, 0, 1, Form.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getForm_Target(), theEcorePackage.getEString(), "target", null, 0, 1, Form.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getForm_Novalidate(), theEcorePackage.getEBoolean(), "novalidate", null, 0, 1, Form.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getForm__TagName(), theEcorePackage.getEString(), "tagName", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(fieldsetEClass, Fieldset.class, "Fieldset", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFieldset_Disabled(), theEcorePackage.getEBoolean(), "disabled", null, 0, 1, Fieldset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFieldset_Legend(), this.getLegend(), null, "legend", null, 0, 1, Fieldset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getFieldset__TagName(), theEcorePackage.getEString(), "tagName", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(legendEClass, Legend.class, "Legend", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getLegend__TagName(), theEcorePackage.getEString(), "tagName", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(labelEClass, Label.class, "Label", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLabel_HtmlFor(), theEcorePackage.getEString(), "htmlFor", null, 0, 1, Label.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getLabel__TagName(), theEcorePackage.getEString(), "tagName", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(inputEClass, Input.class, "Input", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInput_Type(), theEcorePackage.getEString(), "type", null, 0, 1, Input.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInput_Name(), theEcorePackage.getEString(), "name", null, 0, 1, Input.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInput_Value(), theEcorePackage.getEString(), "value", null, 0, 1, Input.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInput_Placeholder(), theEcorePackage.getEString(), "placeholder", null, 0, 1, Input.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInput_Required(), theEcorePackage.getEBoolean(), "required", null, 0, 1, Input.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInput_Disabled(), theEcorePackage.getEBoolean(), "disabled", null, 0, 1, Input.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInput_Readonly(), theEcorePackage.getEBoolean(), "readonly", null, 0, 1, Input.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInput_Checked(), theEcorePackage.getEBoolean(), "checked", null, 0, 1, Input.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInput_Multiple(), theEcorePackage.getEBoolean(), "multiple", null, 0, 1, Input.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getInput__TagName(), theEcorePackage.getEString(), "tagName", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(buttonEClass, Button.class, "Button", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getButton_Type(), theEcorePackage.getEString(), "type", null, 0, 1, Button.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getButton_Name(), theEcorePackage.getEString(), "name", null, 0, 1, Button.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getButton_Value(), theEcorePackage.getEString(), "value", null, 0, 1, Button.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getButton_Disabled(), theEcorePackage.getEBoolean(), "disabled", null, 0, 1, Button.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getButton__TagName(), theEcorePackage.getEString(), "tagName", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(textAreaEClass, TextArea.class, "TextArea", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTextArea_Name(), theEcorePackage.getEString(), "name", null, 0, 1, TextArea.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTextArea_Rows(), theEcorePackage.getEInt(), "rows", null, 0, 1, TextArea.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTextArea_Cols(), theEcorePackage.getEInt(), "cols", null, 0, 1, TextArea.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTextArea_Placeholder(), theEcorePackage.getEString(), "placeholder", null, 0, 1, TextArea.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTextArea_Required(), theEcorePackage.getEBoolean(), "required", null, 0, 1, TextArea.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTextArea_Disabled(), theEcorePackage.getEBoolean(), "disabled", null, 0, 1, TextArea.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTextArea_Readonly(), theEcorePackage.getEBoolean(), "readonly", null, 0, 1, TextArea.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTextArea_Text(), theEcorePackage.getEString(), "text", null, 0, 1, TextArea.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getTextArea__TagName(), theEcorePackage.getEString(), "tagName", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(selectItemEClass, SelectItem.class, "SelectItem", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(selectEClass, Select.class, "Select", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSelect_Name(), theEcorePackage.getEString(), "name", null, 0, 1, Select.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSelect_Multiple(), theEcorePackage.getEBoolean(), "multiple", null, 0, 1, Select.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSelect_Required(), theEcorePackage.getEBoolean(), "required", null, 0, 1, Select.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSelect_Disabled(), theEcorePackage.getEBoolean(), "disabled", null, 0, 1, Select.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSelect_Size(), theEcorePackage.getEInt(), "size", null, 0, 1, Select.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSelect_Items(), this.getSelectItem(), null, "items", null, 0, -1, Select.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getSelect__TagName(), theEcorePackage.getEString(), "tagName", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(optionEClass, Option.class, "Option", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOption_Value(), theEcorePackage.getEString(), "value", null, 0, 1, Option.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOption_Label(), theEcorePackage.getEString(), "label", null, 0, 1, Option.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOption_Selected(), theEcorePackage.getEBoolean(), "selected", null, 0, 1, Option.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOption_Disabled(), theEcorePackage.getEBoolean(), "disabled", null, 0, 1, Option.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOption_Text(), theEcorePackage.getEString(), "text", null, 0, 1, Option.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getOption__TagName(), theEcorePackage.getEString(), "tagName", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(optionGroupEClass, OptionGroup.class, "OptionGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOptionGroup_Label(), theEcorePackage.getEString(), "label", null, 0, 1, OptionGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOptionGroup_Disabled(), theEcorePackage.getEBoolean(), "disabled", null, 0, 1, OptionGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOptionGroup_Options(), this.getOption(), null, "options", null, 0, -1, OptionGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getOptionGroup__TagName(), theEcorePackage.getEString(), "tagName", 0, 1, !IS_UNIQUE, IS_ORDERED);

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
		  (nodeEClass,
		   source,
		   new String[] {
			   "documentation", "Anything that can be placed into a Container: elements, text, raw markup, comments.\nOther models (e.g. React) extend Node to put their own kinds of content, such as\nexpressions and component instances, into HTML containers.\nMarkers are the provenance join back to the source model element."
		   });
		addAnnotation
		  (textEClass,
		   source,
		   new String[] {
			   "documentation", "Plain text, escaped on output."
		   });
		addAnnotation
		  (markupEClass,
		   source,
		   new String[] {
			   "documentation", "Raw HTML emitted verbatim, without escaping. An escape hatch for content the model\ndoes not cover, e.g. output of a Markdown renderer."
		   });
		addAnnotation
		  (nodeReferenceEClass,
		   source,
		   new String[] {
			   "documentation", "Renders another node, which is contained elsewhere - the same fragment in several\nplaces, or a node of the model inside HTML expanded from a library element."
		   });
		addAnnotation
		  (containerEClass,
		   source,
		   new String[] {
			   "documentation", "Mixin for elements with flow/phrasing content.\nContent model rules (e.g. no div in p) are not encoded in types."
		   });
		addAnnotation
		  (getElement_Classes(),
		   source,
		   new String[] {
			   "documentation", " class attribute"
		   });
		addAnnotation
		  (getElement_Style(),
		   source,
		   new String[] {
			   "documentation", " style attribute as property to value map"
		   });
		addAnnotation
		  (getElement_Attributes(),
		   source,
		   new String[] {
			   "documentation", "Attributes not modeled by the element class, including data-* and aria-*.\nNull value - boolean attribute."
		   });
		addAnnotation
		  (voidElementEClass,
		   source,
		   new String[] {
			   "documentation", "Void elements have no content and no end tag."
		   });
		addAnnotation
		  (genericElementEClass,
		   source,
		   new String[] {
			   "documentation", "Element with an arbitrary tag name - for elements not modeled explicitly and for custom elements."
		   });
		addAnnotation
		  (getGenericElement__TagName(),
		   source,
		   new String[] {
			   "body", "return this.getName();"
		   });
		addAnnotation
		  (getGenericVoidElement__TagName(),
		   source,
		   new String[] {
			   "body", "return this.getName();"
		   });
		addAnnotation
		  (libraryElementEClass,
		   source,
		   new String[] {
			   "documentation", "An element of a library built on top of HTML, e.g. Bootstrap, modeled as an EClass and\nrendered reflectively from \"urn:org.nasdanika:html\" annotations - the HTML counterpart\nof the React model LibraryComponent.\n\nOn classes, looked up on the class and then its supertypes:\n- tag: tag name, e.g. \"div\".\n- classes: space separated classes of every element of the class, e.g. \"card\".\n- voidElement: \"true\" for elements without content, e.g. \"img\".\n\nFeatures of subclasses, in feature order:\n- Attributes are HTML attributes, as for other elements: attribute renames, logical skips.\n- classes: a class pattern - the attribute contributes a class instead of an attribute.\n  {} is replaced with the value, an enum literal or a number: \"btn-{}\". A true boolean\n  contributes the pattern as is: \"active\".\n- child: \"true\" for a string attribute rendered as a text child, after the children of\n  containment features and before contents.\n- Containments of nodes are children, followed by contents.\n\nElements which do not map to a single element - modals, accordions, form checks - are\nexpanded to plain HTML by an HtmlStructure subclass, e.g. the Bootstrap structure."
		   });
		addAnnotation
		  (getLibraryElement__TagName(),
		   source,
		   new String[] {
			   "body", "final <%java.util.ArrayList%><<%org.eclipse.emf.ecore.EClass%>> queue = new <%java.util.ArrayList%><<%org.eclipse.emf.ecore.EClass%>>();\nqueue.add(this.eClass());\nint i = 0;\nwhile ((i < queue.size()))\n{\n\t{\n\t\tfinal <%org.eclipse.emf.ecore.EAnnotation%> htmlAnnotation = queue.get(i).getEAnnotation(\"urn:org.nasdanika:html\");\n\t\tif (((htmlAnnotation != null) && htmlAnnotation.getDetails().containsKey(\"tag\")))\n\t\t{\n\t\t\treturn htmlAnnotation.getDetails().get(\"tag\");\n\t\t}\n\t\tqueue.addAll(queue.get(i).getESuperTypes());\n\t\ti = (i + 1);\n\t}\n}\nreturn null;"
		   });
		addAnnotation
		  (documentEClass,
		   source,
		   new String[] {
			   "documentation", "Page - html element preceded by the doctype."
		   });
		addAnnotation
		  (getDocument__TagName(),
		   source,
		   new String[] {
			   "body", "return \"html\";"
		   });
		addAnnotation
		  (headEClass,
		   source,
		   new String[] {
			   "documentation", "Head. Contents, if any, are rendered after the modeled children."
		   });
		addAnnotation
		  (getHead__TagName(),
		   source,
		   new String[] {
			   "body", "return \"head\";"
		   });
		addAnnotation
		  (getHead_Charset(),
		   source,
		   new String[] {
			   "documentation", " meta charset, rendered first"
		   });
		addAnnotation
		  (getHead_Base(),
		   source,
		   new String[] {
			   "documentation", " base href"
		   });
		addAnnotation
		  (getHead_ImportMap(),
		   source,
		   new String[] {
			   "documentation", " Rendered before scripts, as module scripts depend on it"
		   });
		addAnnotation
		  (getBody__TagName(),
		   source,
		   new String[] {
			   "body", "return \"body\";"
		   });
		addAnnotation
		  (getMeta__TagName(),
		   source,
		   new String[] {
			   "body", "return \"meta\";"
		   });
		addAnnotation
		  (getLink__TagName(),
		   source,
		   new String[] {
			   "body", "return \"link\";"
		   });
		addAnnotation
		  (stylesheetEClass,
		   source,
		   new String[] {
			   "documentation", "Logical stylesheet - rendered as <link rel=\"stylesheet\"> if href is set, as <style> otherwise."
		   });
		addAnnotation
		  (getStylesheet__TagName(),
		   source,
		   new String[] {
			   "body", "<%java.lang.String%> _xifexpression = null;\n<%java.lang.String%> _href = this.getHref();\nboolean _tripleEquals = (_href == null);\nif (_tripleEquals)\n{\n\t_xifexpression = \"style\";\n}\nelse\n{\n\t_xifexpression = \"link\";\n}\nreturn _xifexpression;"
		   });
		addAnnotation
		  (getStylesheet_Content(),
		   source,
		   new String[] {
			   "documentation", " Inline CSS, emitted verbatim"
		   });
		addAnnotation
		  (scriptEClass,
		   source,
		   new String[] {
			   "documentation", "Script - external if src is set, inline otherwise. Can be placed in head and in containers."
		   });
		addAnnotation
		  (getScript__TagName(),
		   source,
		   new String[] {
			   "body", "return \"script\";"
		   });
		addAnnotation
		  (getScript_Module(),
		   source,
		   new String[] {
			   "documentation", " type=\"module\" unless type is set explicitly"
		   });
		addAnnotation
		  (getScript_Content(),
		   source,
		   new String[] {
			   "documentation", " Inline source, emitted verbatim except for closing script tags"
		   });
		addAnnotation
		  (importMapEClass,
		   source,
		   new String[] {
			   "documentation", "<script type=\"importmap\"> - bare module specifiers to URLs, rendered as JSON."
		   });
		addAnnotation
		  (getImportMap__TagName(),
		   source,
		   new String[] {
			   "body", "return \"script\";"
		   });
		addAnnotation
		  (getImportMap_Imports(),
		   source,
		   new String[] {
			   "documentation", " Specifier or specifier prefix to URL"
		   });
		addAnnotation
		  (importMapScopeEClass,
		   source,
		   new String[] {
			   "documentation", "Imports applying to modules under a URL prefix."
		   });
		addAnnotation
		  (getDiv__TagName(),
		   source,
		   new String[] {
			   "body", "return \"div\";"
		   });
		addAnnotation
		  (getSpan__TagName(),
		   source,
		   new String[] {
			   "body", "return \"span\";"
		   });
		addAnnotation
		  (getParagraph__TagName(),
		   source,
		   new String[] {
			   "body", "return \"p\";"
		   });
		addAnnotation
		  (headingEClass,
		   source,
		   new String[] {
			   "documentation", "h1 - h6"
		   });
		addAnnotation
		  (getHeading__TagName(),
		   source,
		   new String[] {
			   "body", "int _level = this.getLevel();\nreturn (\"h\" + <%java.lang.Integer%>.valueOf(_level));"
		   });
		addAnnotation
		  (getHeader__TagName(),
		   source,
		   new String[] {
			   "body", "return \"header\";"
		   });
		addAnnotation
		  (getFooter__TagName(),
		   source,
		   new String[] {
			   "body", "return \"footer\";"
		   });
		addAnnotation
		  (getMain__TagName(),
		   source,
		   new String[] {
			   "body", "return \"main\";"
		   });
		addAnnotation
		  (getNav__TagName(),
		   source,
		   new String[] {
			   "body", "return \"nav\";"
		   });
		addAnnotation
		  (getSection__TagName(),
		   source,
		   new String[] {
			   "body", "return \"section\";"
		   });
		addAnnotation
		  (getArticle__TagName(),
		   source,
		   new String[] {
			   "body", "return \"article\";"
		   });
		addAnnotation
		  (getAside__TagName(),
		   source,
		   new String[] {
			   "body", "return \"aside\";"
		   });
		addAnnotation
		  (getBlockquote__TagName(),
		   source,
		   new String[] {
			   "body", "return \"blockquote\";"
		   });
		addAnnotation
		  (preEClass,
		   source,
		   new String[] {
			   "documentation", "Preformatted content, never re-indented by the generator."
		   });
		addAnnotation
		  (getPre__TagName(),
		   source,
		   new String[] {
			   "body", "return \"pre\";"
		   });
		addAnnotation
		  (getFigure__TagName(),
		   source,
		   new String[] {
			   "body", "return \"figure\";"
		   });
		addAnnotation
		  (getFigureCaption__TagName(),
		   source,
		   new String[] {
			   "body", "return \"figcaption\";"
		   });
		addAnnotation
		  (getDetails__TagName(),
		   source,
		   new String[] {
			   "body", "return \"details\";"
		   });
		addAnnotation
		  (getDetails_Summary(),
		   source,
		   new String[] {
			   "documentation", " Rendered before contents"
		   });
		addAnnotation
		  (getSummary__TagName(),
		   source,
		   new String[] {
			   "body", "return \"summary\";"
		   });
		addAnnotation
		  (getHorizontalRule__TagName(),
		   source,
		   new String[] {
			   "body", "return \"hr\";"
		   });
		addAnnotation
		  (getLineBreak__TagName(),
		   source,
		   new String[] {
			   "body", "return \"br\";"
		   });
		addAnnotation
		  (getAnchor__TagName(),
		   source,
		   new String[] {
			   "body", "return \"a\";"
		   });
		addAnnotation
		  (getStrong__TagName(),
		   source,
		   new String[] {
			   "body", "return \"strong\";"
		   });
		addAnnotation
		  (getEmphasis__TagName(),
		   source,
		   new String[] {
			   "body", "return \"em\";"
		   });
		addAnnotation
		  (getCode__TagName(),
		   source,
		   new String[] {
			   "body", "return \"code\";"
		   });
		addAnnotation
		  (getImage__TagName(),
		   source,
		   new String[] {
			   "body", "return \"img\";"
		   });
		addAnnotation
		  (getInlineFrame__TagName(),
		   source,
		   new String[] {
			   "body", "return \"iframe\";"
		   });
		addAnnotation
		  (getUnorderedList__TagName(),
		   source,
		   new String[] {
			   "body", "return \"ul\";"
		   });
		addAnnotation
		  (getOrderedList__TagName(),
		   source,
		   new String[] {
			   "body", "return \"ol\";"
		   });
		addAnnotation
		  (getListItem__TagName(),
		   source,
		   new String[] {
			   "body", "return \"li\";"
		   });
		addAnnotation
		  (descriptionListItemEClass,
		   source,
		   new String[] {
			   "documentation", "dt or dd"
		   });
		addAnnotation
		  (getDescriptionList__TagName(),
		   source,
		   new String[] {
			   "body", "return \"dl\";"
		   });
		addAnnotation
		  (getDescriptionTerm__TagName(),
		   source,
		   new String[] {
			   "body", "return \"dt\";"
		   });
		addAnnotation
		  (getDescriptionDetails__TagName(),
		   source,
		   new String[] {
			   "body", "return \"dd\";"
		   });
		addAnnotation
		  (getTable__TagName(),
		   source,
		   new String[] {
			   "body", "return \"table\";"
		   });
		addAnnotation
		  (getTable_Bodies(),
		   source,
		   new String[] {
			   "documentation", " HTML allows multiple tbody elements"
		   });
		addAnnotation
		  (getCaption__TagName(),
		   source,
		   new String[] {
			   "body", "return \"caption\";"
		   });
		addAnnotation
		  (getColumnGroup__TagName(),
		   source,
		   new String[] {
			   "body", "return \"colgroup\";"
		   });
		addAnnotation
		  (getColumn__TagName(),
		   source,
		   new String[] {
			   "body", "return \"col\";"
		   });
		addAnnotation
		  (getTableHead__TagName(),
		   source,
		   new String[] {
			   "body", "return \"thead\";"
		   });
		addAnnotation
		  (getTableBody__TagName(),
		   source,
		   new String[] {
			   "body", "return \"tbody\";"
		   });
		addAnnotation
		  (getTableFoot__TagName(),
		   source,
		   new String[] {
			   "body", "return \"tfoot\";"
		   });
		addAnnotation
		  (getTableRow__TagName(),
		   source,
		   new String[] {
			   "body", "return \"tr\";"
		   });
		addAnnotation
		  (tableCellEClass,
		   source,
		   new String[] {
			   "documentation", "td, or th if header is true"
		   });
		addAnnotation
		  (getTableCell__TagName(),
		   source,
		   new String[] {
			   "body", "<%java.lang.String%> _xifexpression = null;\nboolean _isHeader = this.isHeader();\nif (_isHeader)\n{\n\t_xifexpression = \"th\";\n}\nelse\n{\n\t_xifexpression = \"td\";\n}\nreturn _xifexpression;"
		   });
		addAnnotation
		  (getTableCell_Scope(),
		   source,
		   new String[] {
			   "documentation", " row, col, rowgroup, colgroup - for header cells"
		   });
		addAnnotation
		  (getTableCell_Headers(),
		   source,
		   new String[] {
			   "documentation", " Space separated ids of header cells"
		   });
		addAnnotation
		  (getForm__TagName(),
		   source,
		   new String[] {
			   "body", "return \"form\";"
		   });
		addAnnotation
		  (getFieldset__TagName(),
		   source,
		   new String[] {
			   "body", "return \"fieldset\";"
		   });
		addAnnotation
		  (getFieldset_Legend(),
		   source,
		   new String[] {
			   "documentation", " Rendered before contents"
		   });
		addAnnotation
		  (getLegend__TagName(),
		   source,
		   new String[] {
			   "body", "return \"legend\";"
		   });
		addAnnotation
		  (getLabel__TagName(),
		   source,
		   new String[] {
			   "body", "return \"label\";"
		   });
		addAnnotation
		  (getLabel_HtmlFor(),
		   source,
		   new String[] {
			   "documentation", " Id of the labeled control"
		   });
		addAnnotation
		  (getInput__TagName(),
		   source,
		   new String[] {
			   "body", "return \"input\";"
		   });
		addAnnotation
		  (getButton__TagName(),
		   source,
		   new String[] {
			   "body", "return \"button\";"
		   });
		addAnnotation
		  (getTextArea__TagName(),
		   source,
		   new String[] {
			   "body", "return \"textarea\";"
		   });
		addAnnotation
		  (getTextArea_Text(),
		   source,
		   new String[] {
			   "documentation", " Escaped, whitespace preserved"
		   });
		addAnnotation
		  (selectItemEClass,
		   source,
		   new String[] {
			   "documentation", "option or optgroup"
		   });
		addAnnotation
		  (getSelect__TagName(),
		   source,
		   new String[] {
			   "body", "return \"select\";"
		   });
		addAnnotation
		  (getOption__TagName(),
		   source,
		   new String[] {
			   "body", "return \"option\";"
		   });
		addAnnotation
		  (getOptionGroup__TagName(),
		   source,
		   new String[] {
			   "body", "return \"optgroup\";"
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
		  (getGenericElement_Name(),
		   source,
		   new String[] {
			   "logical", "true"
		   });
		addAnnotation
		  (getGenericVoidElement_Name(),
		   source,
		   new String[] {
			   "logical", "true"
		   });
		addAnnotation
		  (getDocument_Doctype(),
		   source,
		   new String[] {
			   "logical", "true"
		   });
		addAnnotation
		  (getHead_Charset(),
		   source,
		   new String[] {
			   "logical", "true"
		   });
		addAnnotation
		  (getHead_Title(),
		   source,
		   new String[] {
			   "logical", "true"
		   });
		addAnnotation
		  (getHead_Base(),
		   source,
		   new String[] {
			   "logical", "true"
		   });
		addAnnotation
		  (getMeta_HttpEquiv(),
		   source,
		   new String[] {
			   "attribute", "http-equiv"
		   });
		addAnnotation
		  (getStylesheet_Content(),
		   source,
		   new String[] {
			   "logical", "true"
		   });
		addAnnotation
		  (getScript_Module(),
		   source,
		   new String[] {
			   "logical", "true"
		   });
		addAnnotation
		  (getScript_Content(),
		   source,
		   new String[] {
			   "logical", "true"
		   });
		addAnnotation
		  (getHeading_Level(),
		   source,
		   new String[] {
			   "logical", "true"
		   });
		addAnnotation
		  (getTableCell_Header(),
		   source,
		   new String[] {
			   "logical", "true"
		   });
		addAnnotation
		  (getLabel_HtmlFor(),
		   source,
		   new String[] {
			   "attribute", "for"
		   });
		addAnnotation
		  (getTextArea_Text(),
		   source,
		   new String[] {
			   "logical", "true"
		   });
		addAnnotation
		  (getOption_Text(),
		   source,
		   new String[] {
			   "logical", "true"
		   });
	}

} //HtmlPackageImpl
