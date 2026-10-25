/**
 */
package org.nasdanika.sdk.runtime.models.drawio.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.nasdanika.sdk.runtime.models.core.CorePackage;

import org.nasdanika.sdk.runtime.models.diagram.DiagramPackage;

import org.nasdanika.sdk.runtime.models.drawio.AbstractLink;
import org.nasdanika.sdk.runtime.models.drawio.Action;
import org.nasdanika.sdk.runtime.models.drawio.Actions;
import org.nasdanika.sdk.runtime.models.drawio.Animation;
import org.nasdanika.sdk.runtime.models.drawio.Connection;
import org.nasdanika.sdk.runtime.models.drawio.CustomLink;
import org.nasdanika.sdk.runtime.models.drawio.Document;
import org.nasdanika.sdk.runtime.models.drawio.DrawioFactory;
import org.nasdanika.sdk.runtime.models.drawio.DrawioPackage;
import org.nasdanika.sdk.runtime.models.drawio.FadeIn;
import org.nasdanika.sdk.runtime.models.drawio.FadeOut;
import org.nasdanika.sdk.runtime.models.drawio.FadeTo;
import org.nasdanika.sdk.runtime.models.drawio.Flow;
import org.nasdanika.sdk.runtime.models.drawio.FlowMode;
import org.nasdanika.sdk.runtime.models.drawio.Hide;
import org.nasdanika.sdk.runtime.models.drawio.Highlight;
import org.nasdanika.sdk.runtime.models.drawio.Layer;
import org.nasdanika.sdk.runtime.models.drawio.LinkTarget;
import org.nasdanika.sdk.runtime.models.drawio.ModelElement;
import org.nasdanika.sdk.runtime.models.drawio.Node;
import org.nasdanika.sdk.runtime.models.drawio.Open;
import org.nasdanika.sdk.runtime.models.drawio.Page;
import org.nasdanika.sdk.runtime.models.drawio.PersistableAction;
import org.nasdanika.sdk.runtime.models.drawio.PopIn;
import org.nasdanika.sdk.runtime.models.drawio.PopOut;
import org.nasdanika.sdk.runtime.models.drawio.Scroll;
import org.nasdanika.sdk.runtime.models.drawio.Select;
import org.nasdanika.sdk.runtime.models.drawio.SelectorType;
import org.nasdanika.sdk.runtime.models.drawio.SetOpacity;
import org.nasdanika.sdk.runtime.models.drawio.SetStyle;
import org.nasdanika.sdk.runtime.models.drawio.Show;
import org.nasdanika.sdk.runtime.models.drawio.SimpleLink;
import org.nasdanika.sdk.runtime.models.drawio.SpelLink;
import org.nasdanika.sdk.runtime.models.drawio.Tag;
import org.nasdanika.sdk.runtime.models.drawio.TagsAction;
import org.nasdanika.sdk.runtime.models.drawio.TagsMatch;
import org.nasdanika.sdk.runtime.models.drawio.TargetedAction;
import org.nasdanika.sdk.runtime.models.drawio.Toggle;
import org.nasdanika.sdk.runtime.models.drawio.ToggleStyle;
import org.nasdanika.sdk.runtime.models.drawio.TransitionEffect;
import org.nasdanika.sdk.runtime.models.drawio.Viewbox;
import org.nasdanika.sdk.runtime.models.drawio.Wait;
import org.nasdanika.sdk.runtime.models.drawio.WipeIn;
import org.nasdanika.sdk.runtime.models.drawio.WipeOut;

import org.nasdanika.sdk.runtime.models.presentation.PresentationPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DrawioPackageImpl extends EPackageImpl implements DrawioPackage {
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
	private EClass linkTargetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass layerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelElementEClass = null;

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
	private EClass connectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tagEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractLinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simpleLinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass customLinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass spelLinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass animationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass waitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass targetedActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass persistableActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass showEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hideEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass toggleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass setOpacityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transitionEffectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fadeInEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fadeOutEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fadeToEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wipeInEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wipeOutEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass popInEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass popOutEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass setStyleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass toggleStyleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass highlightEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass flowEClass = null;

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
	private EClass scrollEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass viewboxEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass openEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tagsActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum selectorTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum tagsMatchEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum flowModeEEnum = null;

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
	 * @see org.nasdanika.sdk.runtime.models.drawio.DrawioPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DrawioPackageImpl() {
		super(eNS_URI, DrawioFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link DrawioPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DrawioPackage init() {
		if (isInited) return (DrawioPackage)EPackage.Registry.INSTANCE.getEPackage(DrawioPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredDrawioPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		DrawioPackageImpl theDrawioPackage = registeredDrawioPackage instanceof DrawioPackageImpl ? (DrawioPackageImpl)registeredDrawioPackage : new DrawioPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		PresentationPackage.eINSTANCE.eClass();
		CorePackage.eINSTANCE.eClass();
		DiagramPackage.eINSTANCE.eClass();
		EcorePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theDrawioPackage.createPackageContents();

		// Initialize created meta-data
		theDrawioPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDrawioPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DrawioPackage.eNS_URI, theDrawioPackage);
		return theDrawioPackage;
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
	public EAttribute getDocument_Host() {
		return (EAttribute)documentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocument_Agent() {
		return (EAttribute)documentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocument_Version() {
		return (EAttribute)documentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocument_Compressed() {
		return (EAttribute)documentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLinkTarget() {
		return linkTargetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPage() {
		return pageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPage_Dx() {
		return (EAttribute)pageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPage_Dy() {
		return (EAttribute)pageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPage_PageWidth() {
		return (EAttribute)pageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPage_PageHeight() {
		return (EAttribute)pageEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPage_GridSize() {
		return (EAttribute)pageEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPage_Tags() {
		return (EReference)pageEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLayer() {
		return layerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLayer_Style() {
		return (EAttribute)layerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModelElement() {
		return modelElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelElement_Link() {
		return (EReference)modelElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelElement_Tags() {
		return (EReference)modelElementEClass.getEStructuralFeatures().get(1);
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
	public EAttribute getNode_Style() {
		return (EAttribute)nodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNode_Label() {
		return (EAttribute)nodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNode_Collapsed() {
		return (EAttribute)nodeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConnection() {
		return connectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnection_Style() {
		return (EAttribute)connectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnection_Label() {
		return (EAttribute)connectionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTag() {
		return tagEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTag_Elements() {
		return (EReference)tagEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractLink() {
		return abstractLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSimpleLink() {
		return simpleLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimpleLink_Target() {
		return (EAttribute)simpleLinkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCustomLink() {
		return customLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomLink_Resource() {
		return (EAttribute)customLinkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCustomLink_Target() {
		return (EReference)customLinkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomLink_PageSelectorType() {
		return (EAttribute)customLinkEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomLink_PageSelector() {
		return (EAttribute)customLinkEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomLink_ElementSelectorType() {
		return (EAttribute)customLinkEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomLink_ElementSelector() {
		return (EAttribute)customLinkEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSpelLink() {
		return spelLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpelLink_Expression() {
		return (EAttribute)spelLinkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActions() {
		return actionsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActions_Title() {
		return (EAttribute)actionsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActions_Actions() {
		return (EReference)actionsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnimation() {
		return animationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnimation_Enabled() {
		return (EAttribute)animationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnimation_Loop() {
		return (EAttribute)animationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnimation_Steps() {
		return (EReference)animationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAction() {
		return actionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAction_Immediate() {
		return (EAttribute)actionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWait() {
		return waitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWait_Delay() {
		return (EAttribute)waitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTargetedAction() {
		return targetedActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTargetedAction_Cells() {
		return (EReference)targetedActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTargetedAction_AllCells() {
		return (EAttribute)targetedActionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTargetedAction_Layers() {
		return (EReference)targetedActionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTargetedAction_Tags() {
		return (EReference)targetedActionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTargetedAction_TagsMatch() {
		return (EAttribute)targetedActionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTargetedAction_ExcludeCells() {
		return (EReference)targetedActionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPersistableAction() {
		return persistableActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPersistableAction_PersistChanges() {
		return (EAttribute)persistableActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getShow() {
		return showEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHide() {
		return hideEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getToggle() {
		return toggleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSetOpacity() {
		return setOpacityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSetOpacity_Opacity() {
		return (EAttribute)setOpacityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransitionEffect() {
		return transitionEffectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransitionEffect_Delay() {
		return (EAttribute)transitionEffectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFadeIn() {
		return fadeInEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFadeOut() {
		return fadeOutEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFadeTo() {
		return fadeToEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFadeTo_Opacity() {
		return (EAttribute)fadeToEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWipeIn() {
		return wipeInEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWipeOut() {
		return wipeOutEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPopIn() {
		return popInEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPopOut() {
		return popOutEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSetStyle() {
		return setStyleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSetStyle_Key() {
		return (EAttribute)setStyleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSetStyle_Value() {
		return (EAttribute)setStyleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getToggleStyle() {
		return toggleStyleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getToggleStyle_Key() {
		return (EAttribute)toggleStyleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getToggleStyle_DefaultValue() {
		return (EAttribute)toggleStyleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHighlight() {
		return highlightEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHighlight_Color() {
		return (EAttribute)highlightEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHighlight_Opacity() {
		return (EAttribute)highlightEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHighlight_Duration() {
		return (EAttribute)highlightEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFlow() {
		return flowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFlow_Mode() {
		return (EAttribute)flowEClass.getEStructuralFeatures().get(0);
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
	public EClass getScroll() {
		return scrollEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScroll_Smooth() {
		return (EAttribute)scrollEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getViewbox() {
		return viewboxEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getViewbox_Bounds() {
		return (EReference)viewboxEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getViewbox_Smooth() {
		return (EAttribute)viewboxEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOpen() {
		return openEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOpen_Target() {
		return (EReference)openEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTagsAction() {
		return tagsActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTagsAction_Toggle() {
		return (EReference)tagsActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTagsAction_Hidden() {
		return (EReference)tagsActionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTagsAction_Visible() {
		return (EReference)tagsActionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSelectorType() {
		return selectorTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTagsMatch() {
		return tagsMatchEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getFlowMode() {
		return flowModeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DrawioFactory getDrawioFactory() {
		return (DrawioFactory)getEFactoryInstance();
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
		documentEClass = createEClass(DOCUMENT);
		createEAttribute(documentEClass, DOCUMENT__HOST);
		createEAttribute(documentEClass, DOCUMENT__AGENT);
		createEAttribute(documentEClass, DOCUMENT__VERSION);
		createEAttribute(documentEClass, DOCUMENT__COMPRESSED);

		linkTargetEClass = createEClass(LINK_TARGET);

		pageEClass = createEClass(PAGE);
		createEAttribute(pageEClass, PAGE__DX);
		createEAttribute(pageEClass, PAGE__DY);
		createEAttribute(pageEClass, PAGE__PAGE_WIDTH);
		createEAttribute(pageEClass, PAGE__PAGE_HEIGHT);
		createEAttribute(pageEClass, PAGE__GRID_SIZE);
		createEReference(pageEClass, PAGE__TAGS);

		layerEClass = createEClass(LAYER);
		createEAttribute(layerEClass, LAYER__STYLE);

		modelElementEClass = createEClass(MODEL_ELEMENT);
		createEReference(modelElementEClass, MODEL_ELEMENT__LINK);
		createEReference(modelElementEClass, MODEL_ELEMENT__TAGS);

		nodeEClass = createEClass(NODE);
		createEAttribute(nodeEClass, NODE__STYLE);
		createEAttribute(nodeEClass, NODE__LABEL);
		createEAttribute(nodeEClass, NODE__COLLAPSED);

		connectionEClass = createEClass(CONNECTION);
		createEAttribute(connectionEClass, CONNECTION__STYLE);
		createEAttribute(connectionEClass, CONNECTION__LABEL);

		tagEClass = createEClass(TAG);
		createEReference(tagEClass, TAG__ELEMENTS);

		abstractLinkEClass = createEClass(ABSTRACT_LINK);

		simpleLinkEClass = createEClass(SIMPLE_LINK);
		createEAttribute(simpleLinkEClass, SIMPLE_LINK__TARGET);

		customLinkEClass = createEClass(CUSTOM_LINK);
		createEAttribute(customLinkEClass, CUSTOM_LINK__RESOURCE);
		createEReference(customLinkEClass, CUSTOM_LINK__TARGET);
		createEAttribute(customLinkEClass, CUSTOM_LINK__PAGE_SELECTOR_TYPE);
		createEAttribute(customLinkEClass, CUSTOM_LINK__PAGE_SELECTOR);
		createEAttribute(customLinkEClass, CUSTOM_LINK__ELEMENT_SELECTOR_TYPE);
		createEAttribute(customLinkEClass, CUSTOM_LINK__ELEMENT_SELECTOR);

		spelLinkEClass = createEClass(SPEL_LINK);
		createEAttribute(spelLinkEClass, SPEL_LINK__EXPRESSION);

		actionsEClass = createEClass(ACTIONS);
		createEAttribute(actionsEClass, ACTIONS__TITLE);
		createEReference(actionsEClass, ACTIONS__ACTIONS);

		animationEClass = createEClass(ANIMATION);
		createEAttribute(animationEClass, ANIMATION__ENABLED);
		createEAttribute(animationEClass, ANIMATION__LOOP);
		createEReference(animationEClass, ANIMATION__STEPS);

		actionEClass = createEClass(ACTION);
		createEAttribute(actionEClass, ACTION__IMMEDIATE);

		waitEClass = createEClass(WAIT);
		createEAttribute(waitEClass, WAIT__DELAY);

		targetedActionEClass = createEClass(TARGETED_ACTION);
		createEReference(targetedActionEClass, TARGETED_ACTION__CELLS);
		createEAttribute(targetedActionEClass, TARGETED_ACTION__ALL_CELLS);
		createEReference(targetedActionEClass, TARGETED_ACTION__LAYERS);
		createEReference(targetedActionEClass, TARGETED_ACTION__TAGS);
		createEAttribute(targetedActionEClass, TARGETED_ACTION__TAGS_MATCH);
		createEReference(targetedActionEClass, TARGETED_ACTION__EXCLUDE_CELLS);

		persistableActionEClass = createEClass(PERSISTABLE_ACTION);
		createEAttribute(persistableActionEClass, PERSISTABLE_ACTION__PERSIST_CHANGES);

		showEClass = createEClass(SHOW);

		hideEClass = createEClass(HIDE);

		toggleEClass = createEClass(TOGGLE);

		setOpacityEClass = createEClass(SET_OPACITY);
		createEAttribute(setOpacityEClass, SET_OPACITY__OPACITY);

		transitionEffectEClass = createEClass(TRANSITION_EFFECT);
		createEAttribute(transitionEffectEClass, TRANSITION_EFFECT__DELAY);

		fadeInEClass = createEClass(FADE_IN);

		fadeOutEClass = createEClass(FADE_OUT);

		fadeToEClass = createEClass(FADE_TO);
		createEAttribute(fadeToEClass, FADE_TO__OPACITY);

		wipeInEClass = createEClass(WIPE_IN);

		wipeOutEClass = createEClass(WIPE_OUT);

		popInEClass = createEClass(POP_IN);

		popOutEClass = createEClass(POP_OUT);

		setStyleEClass = createEClass(SET_STYLE);
		createEAttribute(setStyleEClass, SET_STYLE__KEY);
		createEAttribute(setStyleEClass, SET_STYLE__VALUE);

		toggleStyleEClass = createEClass(TOGGLE_STYLE);
		createEAttribute(toggleStyleEClass, TOGGLE_STYLE__KEY);
		createEAttribute(toggleStyleEClass, TOGGLE_STYLE__DEFAULT_VALUE);

		highlightEClass = createEClass(HIGHLIGHT);
		createEAttribute(highlightEClass, HIGHLIGHT__COLOR);
		createEAttribute(highlightEClass, HIGHLIGHT__OPACITY);
		createEAttribute(highlightEClass, HIGHLIGHT__DURATION);

		flowEClass = createEClass(FLOW);
		createEAttribute(flowEClass, FLOW__MODE);

		selectEClass = createEClass(SELECT);

		scrollEClass = createEClass(SCROLL);
		createEAttribute(scrollEClass, SCROLL__SMOOTH);

		viewboxEClass = createEClass(VIEWBOX);
		createEReference(viewboxEClass, VIEWBOX__BOUNDS);
		createEAttribute(viewboxEClass, VIEWBOX__SMOOTH);

		openEClass = createEClass(OPEN);
		createEReference(openEClass, OPEN__TARGET);

		tagsActionEClass = createEClass(TAGS_ACTION);
		createEReference(tagsActionEClass, TAGS_ACTION__TOGGLE);
		createEReference(tagsActionEClass, TAGS_ACTION__HIDDEN);
		createEReference(tagsActionEClass, TAGS_ACTION__VISIBLE);

		// Create enums
		selectorTypeEEnum = createEEnum(SELECTOR_TYPE);
		tagsMatchEEnum = createEEnum(TAGS_MATCH);
		flowModeEEnum = createEEnum(FLOW_MODE);
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
		PresentationPackage thePresentationPackage = (PresentationPackage)EPackage.Registry.INSTANCE.getEPackage(PresentationPackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);
		DiagramPackage theDiagramPackage = (DiagramPackage)EPackage.Registry.INSTANCE.getEPackage(DiagramPackage.eNS_URI);
		CorePackage theCorePackage = (CorePackage)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		documentEClass.getESuperTypes().add(thePresentationPackage.getPresentation());
		pageEClass.getESuperTypes().add(thePresentationPackage.getSlide());
		pageEClass.getESuperTypes().add(this.getLinkTarget());
		layerEClass.getESuperTypes().add(theDiagramPackage.getLayer());
		modelElementEClass.getESuperTypes().add(this.getLinkTarget());
		nodeEClass.getESuperTypes().add(theDiagramPackage.getNode());
		nodeEClass.getESuperTypes().add(this.getModelElement());
		connectionEClass.getESuperTypes().add(theDiagramPackage.getConnection());
		connectionEClass.getESuperTypes().add(this.getModelElement());
		tagEClass.getESuperTypes().add(theCorePackage.getStringIdentity());
		simpleLinkEClass.getESuperTypes().add(this.getAbstractLink());
		customLinkEClass.getESuperTypes().add(this.getAbstractLink());
		spelLinkEClass.getESuperTypes().add(this.getAbstractLink());
		actionsEClass.getESuperTypes().add(this.getAbstractLink());
		waitEClass.getESuperTypes().add(this.getAction());
		targetedActionEClass.getESuperTypes().add(this.getAction());
		persistableActionEClass.getESuperTypes().add(this.getTargetedAction());
		showEClass.getESuperTypes().add(this.getPersistableAction());
		hideEClass.getESuperTypes().add(this.getPersistableAction());
		toggleEClass.getESuperTypes().add(this.getPersistableAction());
		setOpacityEClass.getESuperTypes().add(this.getTargetedAction());
		transitionEffectEClass.getESuperTypes().add(this.getTargetedAction());
		fadeInEClass.getESuperTypes().add(this.getTransitionEffect());
		fadeOutEClass.getESuperTypes().add(this.getTransitionEffect());
		fadeToEClass.getESuperTypes().add(this.getTransitionEffect());
		wipeInEClass.getESuperTypes().add(this.getTransitionEffect());
		wipeOutEClass.getESuperTypes().add(this.getTransitionEffect());
		popInEClass.getESuperTypes().add(this.getTransitionEffect());
		popOutEClass.getESuperTypes().add(this.getTransitionEffect());
		setStyleEClass.getESuperTypes().add(this.getPersistableAction());
		toggleStyleEClass.getESuperTypes().add(this.getPersistableAction());
		highlightEClass.getESuperTypes().add(this.getTargetedAction());
		flowEClass.getESuperTypes().add(this.getTargetedAction());
		selectEClass.getESuperTypes().add(this.getTargetedAction());
		scrollEClass.getESuperTypes().add(this.getTargetedAction());
		viewboxEClass.getESuperTypes().add(this.getAction());
		openEClass.getESuperTypes().add(this.getAction());
		tagsActionEClass.getESuperTypes().add(this.getAction());

		// Initialize classes, features, and operations; add parameters
		initEClass(documentEClass, Document.class, "Document", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocument_Host(), theEcorePackage.getEString(), "host", null, 0, 1, Document.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocument_Agent(), theEcorePackage.getEString(), "agent", null, 0, 1, Document.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocument_Version(), theEcorePackage.getEString(), "version", null, 0, 1, Document.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocument_Compressed(), theEcorePackage.getEBoolean(), "compressed", null, 0, 1, Document.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(linkTargetEClass, LinkTarget.class, "LinkTarget", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(pageEClass, Page.class, "Page", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPage_Dx(), theEcorePackage.getEDouble(), "dx", null, 0, 1, Page.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPage_Dy(), theEcorePackage.getEDouble(), "dy", null, 0, 1, Page.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPage_PageWidth(), theEcorePackage.getEDouble(), "pageWidth", null, 0, 1, Page.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPage_PageHeight(), theEcorePackage.getEDouble(), "pageHeight", null, 0, 1, Page.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPage_GridSize(), theEcorePackage.getEDouble(), "gridSize", null, 0, 1, Page.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPage_Tags(), this.getTag(), null, "tags", null, 0, -1, Page.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(layerEClass, Layer.class, "Layer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLayer_Style(), theEcorePackage.getEString(), "style", null, 0, 1, Layer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modelElementEClass, ModelElement.class, "ModelElement", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModelElement_Link(), this.getAbstractLink(), null, "link", null, 0, 1, ModelElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModelElement_Tags(), this.getTag(), this.getTag_Elements(), "tags", null, 0, -1, ModelElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nodeEClass, Node.class, "Node", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNode_Style(), theEcorePackage.getEString(), "style", null, 0, 1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNode_Label(), theEcorePackage.getEString(), "label", null, 0, 1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNode_Collapsed(), theEcorePackage.getEBoolean(), "collapsed", null, 0, 1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(connectionEClass, Connection.class, "Connection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConnection_Style(), theEcorePackage.getEString(), "style", null, 0, 1, Connection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConnection_Label(), theEcorePackage.getEString(), "label", null, 0, 1, Connection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tagEClass, Tag.class, "Tag", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTag_Elements(), this.getModelElement(), this.getModelElement_Tags(), "elements", null, 0, -1, Tag.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractLinkEClass, AbstractLink.class, "AbstractLink", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(simpleLinkEClass, SimpleLink.class, "SimpleLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSimpleLink_Target(), theEcorePackage.getEString(), "target", null, 0, 1, SimpleLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(customLinkEClass, CustomLink.class, "CustomLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCustomLink_Resource(), theEcorePackage.getEString(), "resource", null, 0, 1, CustomLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCustomLink_Target(), this.getLinkTarget(), null, "target", null, 0, 1, CustomLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustomLink_PageSelectorType(), this.getSelectorType(), "pageSelectorType", null, 0, 1, CustomLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustomLink_PageSelector(), theEcorePackage.getEString(), "pageSelector", null, 0, 1, CustomLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustomLink_ElementSelectorType(), this.getSelectorType(), "elementSelectorType", null, 0, 1, CustomLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustomLink_ElementSelector(), theEcorePackage.getEString(), "elementSelector", null, 0, 1, CustomLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(spelLinkEClass, SpelLink.class, "SpelLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSpelLink_Expression(), theEcorePackage.getEString(), "expression", null, 0, 1, SpelLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(actionsEClass, Actions.class, "Actions", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getActions_Title(), theEcorePackage.getEString(), "title", null, 0, 1, Actions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActions_Actions(), this.getAction(), null, "actions", null, 0, -1, Actions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(animationEClass, Animation.class, "Animation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAnimation_Enabled(), theEcorePackage.getEBoolean(), "enabled", "true", 0, 1, Animation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnimation_Loop(), theEcorePackage.getEBoolean(), "loop", null, 0, 1, Animation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAnimation_Steps(), this.getAction(), null, "steps", null, 0, -1, Animation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(actionEClass, Action.class, "Action", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAction_Immediate(), theEcorePackage.getEBoolean(), "immediate", null, 0, 1, Action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(waitEClass, Wait.class, "Wait", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWait_Delay(), theEcorePackage.getEInt(), "delay", null, 0, 1, Wait.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(targetedActionEClass, TargetedAction.class, "TargetedAction", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTargetedAction_Cells(), this.getModelElement(), null, "cells", null, 0, -1, TargetedAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTargetedAction_AllCells(), theEcorePackage.getEBoolean(), "allCells", null, 0, 1, TargetedAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTargetedAction_Layers(), this.getLayer(), null, "layers", null, 0, -1, TargetedAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTargetedAction_Tags(), this.getTag(), null, "tags", null, 0, -1, TargetedAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTargetedAction_TagsMatch(), this.getTagsMatch(), "tagsMatch", "OR", 0, 1, TargetedAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTargetedAction_ExcludeCells(), this.getModelElement(), null, "excludeCells", null, 0, -1, TargetedAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(persistableActionEClass, PersistableAction.class, "PersistableAction", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPersistableAction_PersistChanges(), theEcorePackage.getEBoolean(), "persistChanges", null, 0, 1, PersistableAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(showEClass, Show.class, "Show", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(hideEClass, Hide.class, "Hide", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(toggleEClass, Toggle.class, "Toggle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(setOpacityEClass, SetOpacity.class, "SetOpacity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSetOpacity_Opacity(), theEcorePackage.getEDouble(), "opacity", null, 0, 1, SetOpacity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(transitionEffectEClass, TransitionEffect.class, "TransitionEffect", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTransitionEffect_Delay(), theEcorePackage.getEInt(), "delay", null, 0, 1, TransitionEffect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fadeInEClass, FadeIn.class, "FadeIn", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(fadeOutEClass, FadeOut.class, "FadeOut", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(fadeToEClass, FadeTo.class, "FadeTo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFadeTo_Opacity(), theEcorePackage.getEDouble(), "opacity", null, 0, 1, FadeTo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(wipeInEClass, WipeIn.class, "WipeIn", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(wipeOutEClass, WipeOut.class, "WipeOut", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(popInEClass, PopIn.class, "PopIn", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(popOutEClass, PopOut.class, "PopOut", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(setStyleEClass, SetStyle.class, "SetStyle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSetStyle_Key(), theEcorePackage.getEString(), "key", null, 0, 1, SetStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSetStyle_Value(), theEcorePackage.getEString(), "value", null, 0, 1, SetStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(toggleStyleEClass, ToggleStyle.class, "ToggleStyle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getToggleStyle_Key(), theEcorePackage.getEString(), "key", null, 0, 1, ToggleStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getToggleStyle_DefaultValue(), theEcorePackage.getEString(), "defaultValue", null, 0, 1, ToggleStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(highlightEClass, Highlight.class, "Highlight", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHighlight_Color(), theEcorePackage.getEString(), "color", null, 0, 1, Highlight.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHighlight_Opacity(), theEcorePackage.getEInt(), "opacity", null, 0, 1, Highlight.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHighlight_Duration(), theEcorePackage.getEInt(), "duration", null, 0, 1, Highlight.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(flowEClass, Flow.class, "Flow", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFlow_Mode(), this.getFlowMode(), "mode", "TOGGLE", 0, 1, Flow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(selectEClass, Select.class, "Select", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(scrollEClass, Scroll.class, "Scroll", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getScroll_Smooth(), theEcorePackage.getEBoolean(), "smooth", null, 0, 1, Scroll.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(viewboxEClass, Viewbox.class, "Viewbox", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getViewbox_Bounds(), theDiagramPackage.getBounds(), null, "bounds", null, 0, 1, Viewbox.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getViewbox_Smooth(), theEcorePackage.getEBoolean(), "smooth", null, 0, 1, Viewbox.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(openEClass, Open.class, "Open", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOpen_Target(), this.getAbstractLink(), null, "target", null, 0, 1, Open.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tagsActionEClass, TagsAction.class, "TagsAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTagsAction_Toggle(), this.getTag(), null, "toggle", null, 0, -1, TagsAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTagsAction_Hidden(), this.getTag(), null, "hidden", null, 0, -1, TagsAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTagsAction_Visible(), this.getTag(), null, "visible", null, 0, -1, TagsAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(selectorTypeEEnum, SelectorType.class, "SelectorType");
		addEEnumLiteral(selectorTypeEEnum, SelectorType.ID);
		addEEnumLiteral(selectorTypeEEnum, SelectorType.NAME);
		addEEnumLiteral(selectorTypeEEnum, SelectorType.PROPERTY);

		initEEnum(tagsMatchEEnum, TagsMatch.class, "TagsMatch");
		addEEnumLiteral(tagsMatchEEnum, TagsMatch.OR);
		addEEnumLiteral(tagsMatchEEnum, TagsMatch.AND);

		initEEnum(flowModeEEnum, FlowMode.class, "FlowMode");
		addEEnumLiteral(flowModeEEnum, FlowMode.TOGGLE);
		addEEnumLiteral(flowModeEEnum, FlowMode.START);
		addEEnumLiteral(flowModeEEnum, FlowMode.STOP);

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
		  (documentEClass,
		   source,
		   new String[] {
			   "documentation", "TODO - adjust to Nasdanika Draw.io API. E.g. style class with a derived style EMap reference backed by \'style\' property\nHave ModelElement interface with style property\nConnection point - extends Port and has dx/dy (pixels)\nNodeStyle, ConnectionStyle extending style and adding Node/Connection flavors, Draw.io enums\nDerived features for Document.pages (from Presentation.slides)\nPage.layers, ..."
		   });
		addAnnotation
		  (linkTargetEClass,
		   source,
		   new String[] {
			   "documentation", " ============================================================================\nLink targets\n============================================================================"
		   });
		addAnnotation
		  (pageEClass,
		   source,
		   new String[] {
			   "documentation", " mxfile/diagram - a page is a slide is a diagram."
		   });
		addAnnotation
		  (getPage_Dx(),
		   source,
		   new String[] {
			   "documentation", " mxGraphModel attributes worth keeping."
		   });
		addAnnotation
		  (layerEClass,
		   source,
		   new String[] {
			   "documentation", " Common mxCell aspects: style string + custom properties (mxCell wrapped in <object>)."
		   });
		addAnnotation
		  (modelElementEClass,
		   source,
		   new String[] {
			   "documentation", "Common supertype of the Draw.io layer elements - what the format calls a cell\nand the Java API calls ModelElement: the things that carry a style, a link,\ntags, and custom properties.\n\nNAMING - the Java API calls this ModelElement and reserves Element for the\nwider base (Document, Page, Model, Root, ModelElement). This file follows the\nshorter name; if the API name is preferred, rename here and in doc/readme.md\ntogether.\n\nTo be merged into drawio.xcore as a second supertype:\n\n    class DrawioLayer      extends Layer,      Element { ... }\n    class DrawioNode       extends Node,       Element { ... }\n    class DrawioConnection extends Connection, Element { ... }\n\nEcore supports the resulting diamond (Node and Element both reach\nDiagramElement) without special handling."
		   });
		addAnnotation
		  (getModelElement_Link(),
		   source,
		   new String[] {
			   "documentation", "The \'link\' attribute, parsed. Null when the element has no link.\n\nContainment rather than an attribute because a link is either a target or a\nscript - see AbstractLink."
		   });
		addAnnotation
		  (getModelElement_Tags(),
		   source,
		   new String[] {
			   "documentation", "Tag objects for the raw tag names inherited from DiagramElement.tags,\nresolved against the containing Page.\n\nDerived because DiagramElement.tags is the state - Draw.io tags are not\ndeclared anywhere, they are just strings on cells. This reference is what\nmakes actions able to point at a tag rather than repeat its name."
		   });
		addAnnotation
		  (getNode_Style(),
		   source,
		   new String[] {
			   "documentation", " Raw draw.io style string, e.g. \"rounded=1;fillColor=#dae8fc;\". Parsed access via util."
		   });
		addAnnotation
		  (tagEClass,
		   source,
		   new String[] {
			   "documentation", "A Draw.io tag.\n\nTags matter more here than they look: the in-browser viewer can filter by them\nwith no server involved, and custom actions can target them, so a tag is the\ncheapest way to say \"this group of shapes moves together\".\n\nMERGE NOTE - Page needs a containment for these, and it cannot be called \'tags\'\nbecause DiagramElement.tags (String[], inherited through Slide -> Diagram) already\noccupies that name:\n\n    class Page extends Slide, LinkTarget {\n        contains Tag[] tagDefinitions keys name\n        contains Animation animation\n        ...\n    }\n\nThe loader populates tagDefinitions from the union of the tag strings on the\npage\'s elements. If the clash is worth resolving properly, the alternative is\nrenaming DiagramElement.tags on the diagram floor - a wider change than this one."
		   });
		addAnnotation
		  (getTag_Elements(),
		   source,
		   new String[] {
			   "documentation", " Elements on the page carrying this tag - the inverse of Element.elementTags."
		   });
		addAnnotation
		  (abstractLinkEClass,
		   source,
		   new String[] {
			   "documentation", " ============================================================================\nLinks\n============================================================================"
		   });
		addAnnotation
		  (simpleLinkEClass,
		   source,
		   new String[] {
			   "documentation", "A link that is stored and used verbatim: an http(s) URL, a mailto:, a relative\npath, or a data: URI this model does not interpret.\n\nAnything not recognised as a CustomLink, SpelLink, or Actions lands here, which\nis what keeps the round trip lossless."
		   });
		addAnnotation
		  (selectorTypeEEnum,
		   source,
		   new String[] {
			   "documentation", "How a page or an element is picked out by a selector.\n\nID and NAME are the two qualified forms in the notation - \'id,\' and \'name,\'.\nPROPERTY is the element-only \'property=value\' form supported by the Java API\'s\nselector syntax."
		   });
		addAnnotation
		  (customLinkEClass,
		   source,
		   new String[] {
			   "documentation", "The Nasdanika extended link notation, which widens Draw.io\'s page linking into\nelement linking and cross-document linking:\n\n    data:page/id,<page id>\n    data:page/name,<url encoded page name>\n    data:element/id,<element id>\n    data:element/name,<url encoded label>\n\nwith an optional document URI before a \'#\', resolved relative to the URI of the\ncontaining document and therefore able to reach through URI handlers:\n\n    data:element/name,compressed.drawio#name,Page+2/Linked\n    data:page/name,maven://<gav>/my-system.drawio#My+Component\n\nThe resolved references are the point of modelling this at all. In a resource\nset a folder of .drawio files stops being a folder and becomes one traversable\nobject graph, so \"what links to this component\" is a getReferrers query rather\nthan a text search - and a link into a document that was never checked out still\nresolves.\n\nThe selector attributes are kept alongside the references so that saving\nreproduces the notation the author wrote. A link written as \'name,\' should not\ncome back as \'id,\' just because the loader found it easier."
		   });
		addAnnotation
		  (getCustomLink_Resource(),
		   source,
		   new String[] {
			   "documentation", "URI of the document containing the target - the part before \'#\'.\nBlank for a link within the same document."
		   });
		addAnnotation
		  (getCustomLink_Target(),
		   source,
		   new String[] {
			   "documentation", " The target, resolved. A Page for a page link, an Element for an element link."
		   });
		addAnnotation
		  (getCustomLink_PageSelectorType(),
		   source,
		   new String[] {
			   "documentation", " How the page was selected. Blank pageSelector means \"the current page\"."
		   });
		addAnnotation
		  (getCustomLink_ElementSelectorType(),
		   source,
		   new String[] {
			   "documentation", " How the element was selected. Blank for a page link."
		   });
		addAnnotation
		  (spelLinkEClass,
		   source,
		   new String[] {
			   "documentation", "data:spel,<expression>\n\nA link computed by a SpEL expression evaluated against the element it sits on,\nso a shape can decide at generation time where it points."
		   });
		addAnnotation
		  (actionsEClass,
		   source,
		   new String[] {
			   "documentation", " ============================================================================\nCustom actions and animations\n\nDraw.io\'s docs use \"action\" and \"effect\" more or less interchangeably; the JSON\ncalls them actions, so the model does too.\n\nTwo carriers, one vocabulary:\n  - Actions   - attached to an element, run when it is clicked.\n  - Animation - attached to a page, runs on load, optionally looping.\n============================================================================"
		   });
		addAnnotation
		  (getActions_Title(),
		   source,
		   new String[] {
			   "documentation", " Optional label shown for the action."
		   });
		addAnnotation
		  (animationEClass,
		   source,
		   new String[] {
			   "documentation", "Page-level animation:\n\n    {\"animation\": {\"enabled\": true, \"loop\": true, \"steps\": [ ... ]}}\n\nMERGE NOTE - add \'contains Animation animation\' to Page."
		   });
		addAnnotation
		  (actionEClass,
		   source,
		   new String[] {
			   "documentation", "One step of a sequence.\n\nDraw.io steps carry a \'transient\' flag which, when set to false, persists the\nstep\'s changes into the model instead of only affecting the view. It is modelled\nas persistChanges on the actions that support it (see PersistableAction) rather\nthan as \'transient\', because that word is an Xcore feature modifier and a Java\nkeyword, and the inverted name reads better than an escaped one."
		   });
		addAnnotation
		  (getAction_Immediate(),
		   source,
		   new String[] {
			   "documentation", "Run together with the previous step rather than after it - the JSON\n\"immediate\": true. This is how several effects are made to happen at once."
		   });
		addAnnotation
		  (waitEClass,
		   source,
		   new String[] {
			   "documentation", " Pause for the given number of milliseconds - the JSON {\"wait\": 500}."
		   });
		addAnnotation
		  (tagsMatchEEnum,
		   source,
		   new String[] {
			   "documentation", " How several tag names are combined when selecting cells."
		   });
		addAnnotation
		  (targetedActionEClass,
		   source,
		   new String[] {
			   "documentation", "Base for every action that selects the cells it applies to.\n\nThe selector is the reason this is worth modelling rather than storing as a\nstring: \'cells\', \'layers\', and \'tags\' are identifiers in the JSON, and as\nreferences they survive a rename, break a build when the target is deleted, and\nlet a generator say \"animate the elements depicting this service\" instead of\nhand-assembling a list of ids."
		   });
		addAnnotation
		  (getTargetedAction_Cells(),
		   source,
		   new String[] {
			   "documentation", " Cells the action applies to."
		   });
		addAnnotation
		  (getTargetedAction_AllCells(),
		   source,
		   new String[] {
			   "documentation", " Select every cell - the JSON \"cells\": [\"*\"]."
		   });
		addAnnotation
		  (getTargetedAction_Layers(),
		   source,
		   new String[] {
			   "documentation", " Layers the action applies to; descendants are included."
		   });
		addAnnotation
		  (getTargetedAction_Tags(),
		   source,
		   new String[] {
			   "documentation", " Tags the action applies to."
		   });
		addAnnotation
		  (getTargetedAction_ExcludeCells(),
		   source,
		   new String[] {
			   "documentation", " Removed from the result of the above."
		   });
		addAnnotation
		  (persistableActionEClass,
		   source,
		   new String[] {
			   "documentation", "Actions whose changes can be written back into the model rather than only\naffecting the current view - Draw.io\'s \"transient\": false."
		   });
		addAnnotation
		  (getPersistableAction_PersistChanges(),
		   source,
		   new String[] {
			   "documentation", " JSON \"transient\": false. Default (false here) means view-only."
		   });
		addAnnotation
		  (showEClass,
		   source,
		   new String[] {
			   "documentation", " ---- Visibility ----"
		   });
		addAnnotation
		  (hideEClass,
		   source,
		   new String[] {
			   "documentation", " Make the cells invisible - opacity 0."
		   });
		addAnnotation
		  (toggleEClass,
		   source,
		   new String[] {
			   "documentation", " Flip each cell\'s opacity between 0 and 1."
		   });
		addAnnotation
		  (setOpacityEClass,
		   source,
		   new String[] {
			   "documentation", "Set opacity outright, 0..1.\n\nThe accounting case wants exactly this: opacity carrying a magnitude, so a flow\narrow between two accounts is faint when little moved through it and solid when\na lot did."
		   });
		addAnnotation
		  (transitionEffectEClass,
		   source,
		   new String[] {
			   "documentation", " ---- Transitions ----"
		   });
		addAnnotation
		  (fadeInEClass,
		   source,
		   new String[] {
			   "documentation", " Animate opacity 0 -> 1."
		   });
		addAnnotation
		  (fadeOutEClass,
		   source,
		   new String[] {
			   "documentation", " Animate opacity 1 -> 0."
		   });
		addAnnotation
		  (fadeToEClass,
		   source,
		   new String[] {
			   "documentation", " Animate opacity to a specific value, 0..1."
		   });
		addAnnotation
		  (wipeInEClass,
		   source,
		   new String[] {
			   "documentation", " Reveal with a wipe."
		   });
		addAnnotation
		  (wipeOutEClass,
		   source,
		   new String[] {
			   "documentation", " Hide with a reverse wipe."
		   });
		addAnnotation
		  (popInEClass,
		   source,
		   new String[] {
			   "documentation", " Scale-and-fade entrance."
		   });
		addAnnotation
		  (popOutEClass,
		   source,
		   new String[] {
			   "documentation", " Scale-and-fade exit."
		   });
		addAnnotation
		  (setStyleEClass,
		   source,
		   new String[] {
			   "documentation", " ---- Style ----"
		   });
		addAnnotation
		  (toggleStyleEClass,
		   source,
		   new String[] {
			   "documentation", "Flip a style key between its current value and a default -\n{\"toggleStyle\": {\"key\": \"fillColor\", \"defaultValue\": \"none\"}}."
		   });
		addAnnotation
		  (highlightEClass,
		   source,
		   new String[] {
			   "documentation", "Pulse a colour over the cells.\n\nThe workhorse for observability overlays - the \"this activity is slow\" or \"this\nstep failed\" marker on an otherwise unchanged diagram."
		   });
		addAnnotation
		  (getHighlight_Color(),
		   source,
		   new String[] {
			   "documentation", " #RRGGBB."
		   });
		addAnnotation
		  (getHighlight_Opacity(),
		   source,
		   new String[] {
			   "documentation", " Percent, 0..100 - Draw.io\'s own unit here, unlike the 0..1 opacity elsewhere."
		   });
		addAnnotation
		  (getHighlight_Duration(),
		   source,
		   new String[] {
			   "documentation", " Milliseconds."
		   });
		addAnnotation
		  (flowModeEEnum,
		   source,
		   new String[] {
			   "documentation", " Whether a flow animation is toggled, forced on, or forced off."
		   });
		addAnnotation
		  (flowEClass,
		   source,
		   new String[] {
			   "documentation", "Moving dashes along connections - the JSON {\"flow\": {\"start\": true}}.\n\nModelled as a three-state enum because the JSON distinguishes \"toggle whatever\nit is now\" (no \'start\' key) from forcing it on or off, and a plain boolean\ncannot say that.\n\nThis is the one effect that reads as motion along an edge, which makes it the\nnatural rendering of a message, a transaction, or a control transfer."
		   });
		addAnnotation
		  (selectEClass,
		   source,
		   new String[] {
			   "documentation", " ---- Navigation ----"
		   });
		addAnnotation
		  (scrollEClass,
		   source,
		   new String[] {
			   "documentation", " Scroll the cells into view."
		   });
		addAnnotation
		  (viewboxEClass,
		   source,
		   new String[] {
			   "documentation", "Move the viewport to a rectangle.\n\nReuses diagram Bounds rather than redeclaring x/y/width/height, which is the\nsame reuse rule the rest of the model follows."
		   });
		addAnnotation
		  (openEClass,
		   source,
		   new String[] {
			   "documentation", "Open a link - a URL, or another page via data:page/id,<id>.\n\nTyped as AbstractLink rather than String so that an action opening a page is the\nsame navigable reference as an element\'s own link, and a page rename does not\nquietly break the animation."
		   });
		addAnnotation
		  (tagsActionEClass,
		   source,
		   new String[] {
			   "documentation", " ---- Tags ----"
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

} //DrawioPackageImpl
