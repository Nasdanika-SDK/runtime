/**
 */
package org.nasdanika.sdk.runtime.models.drawio.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.nasdanika.sdk.runtime.models.drawio.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DrawioFactoryImpl extends EFactoryImpl implements DrawioFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DrawioFactory init() {
		try {
			DrawioFactory theDrawioFactory = (DrawioFactory)EPackage.Registry.INSTANCE.getEFactory(DrawioPackage.eNS_URI);
			if (theDrawioFactory != null) {
				return theDrawioFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DrawioFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DrawioFactoryImpl() {
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
			case DrawioPackage.DOCUMENT: return createDocument();
			case DrawioPackage.PAGE: return createPage();
			case DrawioPackage.LAYER: return createLayer();
			case DrawioPackage.NODE: return createNode();
			case DrawioPackage.CONNECTION: return createConnection();
			case DrawioPackage.TAG: return createTag();
			case DrawioPackage.SIMPLE_LINK: return createSimpleLink();
			case DrawioPackage.CUSTOM_LINK: return createCustomLink();
			case DrawioPackage.SPEL_LINK: return createSpelLink();
			case DrawioPackage.ACTIONS: return createActions();
			case DrawioPackage.ANIMATION: return createAnimation();
			case DrawioPackage.WAIT: return createWait();
			case DrawioPackage.SHOW: return createShow();
			case DrawioPackage.HIDE: return createHide();
			case DrawioPackage.TOGGLE: return createToggle();
			case DrawioPackage.SET_OPACITY: return createSetOpacity();
			case DrawioPackage.FADE_IN: return createFadeIn();
			case DrawioPackage.FADE_OUT: return createFadeOut();
			case DrawioPackage.FADE_TO: return createFadeTo();
			case DrawioPackage.WIPE_IN: return createWipeIn();
			case DrawioPackage.WIPE_OUT: return createWipeOut();
			case DrawioPackage.POP_IN: return createPopIn();
			case DrawioPackage.POP_OUT: return createPopOut();
			case DrawioPackage.SET_STYLE: return createSetStyle();
			case DrawioPackage.TOGGLE_STYLE: return createToggleStyle();
			case DrawioPackage.HIGHLIGHT: return createHighlight();
			case DrawioPackage.FLOW: return createFlow();
			case DrawioPackage.SELECT: return createSelect();
			case DrawioPackage.SCROLL: return createScroll();
			case DrawioPackage.VIEWBOX: return createViewbox();
			case DrawioPackage.OPEN: return createOpen();
			case DrawioPackage.TAGS_ACTION: return createTagsAction();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case DrawioPackage.SELECTOR_TYPE:
				return createSelectorTypeFromString(eDataType, initialValue);
			case DrawioPackage.TAGS_MATCH:
				return createTagsMatchFromString(eDataType, initialValue);
			case DrawioPackage.FLOW_MODE:
				return createFlowModeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case DrawioPackage.SELECTOR_TYPE:
				return convertSelectorTypeToString(eDataType, instanceValue);
			case DrawioPackage.TAGS_MATCH:
				return convertTagsMatchToString(eDataType, instanceValue);
			case DrawioPackage.FLOW_MODE:
				return convertFlowModeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Document createDocument() {
		DocumentImpl document = new DocumentImpl();
		return document;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Page createPage() {
		PageImpl page = new PageImpl();
		return page;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Layer createLayer() {
		LayerImpl layer = new LayerImpl();
		return layer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node createNode() {
		NodeImpl node = new NodeImpl();
		return node;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connection createConnection() {
		ConnectionImpl connection = new ConnectionImpl();
		return connection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tag createTag() {
		TagImpl tag = new TagImpl();
		return tag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleLink createSimpleLink() {
		SimpleLinkImpl simpleLink = new SimpleLinkImpl();
		return simpleLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomLink createCustomLink() {
		CustomLinkImpl customLink = new CustomLinkImpl();
		return customLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpelLink createSpelLink() {
		SpelLinkImpl spelLink = new SpelLinkImpl();
		return spelLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Actions createActions() {
		ActionsImpl actions = new ActionsImpl();
		return actions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Animation createAnimation() {
		AnimationImpl animation = new AnimationImpl();
		return animation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Wait createWait() {
		WaitImpl wait = new WaitImpl();
		return wait;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Show createShow() {
		ShowImpl show = new ShowImpl();
		return show;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Hide createHide() {
		HideImpl hide = new HideImpl();
		return hide;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Toggle createToggle() {
		ToggleImpl toggle = new ToggleImpl();
		return toggle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SetOpacity createSetOpacity() {
		SetOpacityImpl setOpacity = new SetOpacityImpl();
		return setOpacity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FadeIn createFadeIn() {
		FadeInImpl fadeIn = new FadeInImpl();
		return fadeIn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FadeOut createFadeOut() {
		FadeOutImpl fadeOut = new FadeOutImpl();
		return fadeOut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FadeTo createFadeTo() {
		FadeToImpl fadeTo = new FadeToImpl();
		return fadeTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WipeIn createWipeIn() {
		WipeInImpl wipeIn = new WipeInImpl();
		return wipeIn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WipeOut createWipeOut() {
		WipeOutImpl wipeOut = new WipeOutImpl();
		return wipeOut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PopIn createPopIn() {
		PopInImpl popIn = new PopInImpl();
		return popIn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PopOut createPopOut() {
		PopOutImpl popOut = new PopOutImpl();
		return popOut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SetStyle createSetStyle() {
		SetStyleImpl setStyle = new SetStyleImpl();
		return setStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ToggleStyle createToggleStyle() {
		ToggleStyleImpl toggleStyle = new ToggleStyleImpl();
		return toggleStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Highlight createHighlight() {
		HighlightImpl highlight = new HighlightImpl();
		return highlight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Flow createFlow() {
		FlowImpl flow = new FlowImpl();
		return flow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Select createSelect() {
		SelectImpl select = new SelectImpl();
		return select;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Scroll createScroll() {
		ScrollImpl scroll = new ScrollImpl();
		return scroll;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Viewbox createViewbox() {
		ViewboxImpl viewbox = new ViewboxImpl();
		return viewbox;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Open createOpen() {
		OpenImpl open = new OpenImpl();
		return open;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TagsAction createTagsAction() {
		TagsActionImpl tagsAction = new TagsActionImpl();
		return tagsAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SelectorType createSelectorTypeFromString(EDataType eDataType, String initialValue) {
		SelectorType result = SelectorType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSelectorTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TagsMatch createTagsMatchFromString(EDataType eDataType, String initialValue) {
		TagsMatch result = TagsMatch.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTagsMatchToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlowMode createFlowModeFromString(EDataType eDataType, String initialValue) {
		FlowMode result = FlowMode.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFlowModeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DrawioPackage getDrawioPackage() {
		return (DrawioPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static DrawioPackage getPackage() {
		return DrawioPackage.eINSTANCE;
	}

} //DrawioFactoryImpl
