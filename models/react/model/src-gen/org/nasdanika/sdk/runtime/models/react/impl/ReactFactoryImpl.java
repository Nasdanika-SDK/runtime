/**
 */
package org.nasdanika.sdk.runtime.models.react.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.nasdanika.sdk.runtime.models.react.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ReactFactoryImpl extends EFactoryImpl implements ReactFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ReactFactory init() {
		try {
			ReactFactory theReactFactory = (ReactFactory)EPackage.Registry.INSTANCE.getEFactory(ReactPackage.eNS_URI);
			if (theReactFactory != null) {
				return theReactFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ReactFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReactFactoryImpl() {
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
			case ReactPackage.TSX_MODULE: return createTsxModule();
			case ReactPackage.COMPONENT_DECLARATION: return createComponentDeclaration();
			case ReactPackage.JSX_BLOCK: return createJsxBlock();
			case ReactPackage.STATE_HOOK: return createStateHook();
			case ReactPackage.EFFECT_HOOK: return createEffectHook();
			case ReactPackage.MEMO_HOOK: return createMemoHook();
			case ReactPackage.CONTEXT_HOOK: return createContextHook();
			case ReactPackage.REF_HOOK: return createRefHook();
			case ReactPackage.OPAQUE_HOOK: return createOpaqueHook();
			case ReactPackage.CONTEXT_DECLARATION: return createContextDeclaration();
			case ReactPackage.JSX_ELEMENT: return createJsxElement();
			case ReactPackage.JSX_FRAGMENT: return createJsxFragment();
			case ReactPackage.JSX_TEXT: return createJsxText();
			case ReactPackage.JSX_EXPRESSION: return createJsxExpression();
			case ReactPackage.JSX_CONDITIONAL: return createJsxConditional();
			case ReactPackage.JSX_ITERATOR: return createJsxIterator();
			case ReactPackage.CONTEXT_PROVIDER: return createContextProvider();
			case ReactPackage.OPAQUE_JSX: return createOpaqueJsx();
			case ReactPackage.INTRINSIC: return createIntrinsic();
			case ReactPackage.JSX_CONTENT: return createJsxContent();
			case ReactPackage.LITERAL_ATTRIBUTE: return createLiteralAttribute();
			case ReactPackage.EXPRESSION_ATTRIBUTE: return createExpressionAttribute();
			case ReactPackage.EVENT_ATTRIBUTE: return createEventAttribute();
			case ReactPackage.SPREAD_ATTRIBUTE: return createSpreadAttribute();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TsxModule createTsxModule() {
		TsxModuleImpl tsxModule = new TsxModuleImpl();
		return tsxModule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentDeclaration createComponentDeclaration() {
		ComponentDeclarationImpl componentDeclaration = new ComponentDeclarationImpl();
		return componentDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JsxBlock createJsxBlock() {
		JsxBlockImpl jsxBlock = new JsxBlockImpl();
		return jsxBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateHook createStateHook() {
		StateHookImpl stateHook = new StateHookImpl();
		return stateHook;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EffectHook createEffectHook() {
		EffectHookImpl effectHook = new EffectHookImpl();
		return effectHook;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MemoHook createMemoHook() {
		MemoHookImpl memoHook = new MemoHookImpl();
		return memoHook;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContextHook createContextHook() {
		ContextHookImpl contextHook = new ContextHookImpl();
		return contextHook;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RefHook createRefHook() {
		RefHookImpl refHook = new RefHookImpl();
		return refHook;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OpaqueHook createOpaqueHook() {
		OpaqueHookImpl opaqueHook = new OpaqueHookImpl();
		return opaqueHook;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContextDeclaration createContextDeclaration() {
		ContextDeclarationImpl contextDeclaration = new ContextDeclarationImpl();
		return contextDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JsxElement createJsxElement() {
		JsxElementImpl jsxElement = new JsxElementImpl();
		return jsxElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JsxFragment createJsxFragment() {
		JsxFragmentImpl jsxFragment = new JsxFragmentImpl();
		return jsxFragment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JsxText createJsxText() {
		JsxTextImpl jsxText = new JsxTextImpl();
		return jsxText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JsxExpression createJsxExpression() {
		JsxExpressionImpl jsxExpression = new JsxExpressionImpl();
		return jsxExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JsxConditional createJsxConditional() {
		JsxConditionalImpl jsxConditional = new JsxConditionalImpl();
		return jsxConditional;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JsxIterator createJsxIterator() {
		JsxIteratorImpl jsxIterator = new JsxIteratorImpl();
		return jsxIterator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContextProvider createContextProvider() {
		ContextProviderImpl contextProvider = new ContextProviderImpl();
		return contextProvider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OpaqueJsx createOpaqueJsx() {
		OpaqueJsxImpl opaqueJsx = new OpaqueJsxImpl();
		return opaqueJsx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Intrinsic createIntrinsic() {
		IntrinsicImpl intrinsic = new IntrinsicImpl();
		return intrinsic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JsxContent createJsxContent() {
		JsxContentImpl jsxContent = new JsxContentImpl();
		return jsxContent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LiteralAttribute createLiteralAttribute() {
		LiteralAttributeImpl literalAttribute = new LiteralAttributeImpl();
		return literalAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpressionAttribute createExpressionAttribute() {
		ExpressionAttributeImpl expressionAttribute = new ExpressionAttributeImpl();
		return expressionAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventAttribute createEventAttribute() {
		EventAttributeImpl eventAttribute = new EventAttributeImpl();
		return eventAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpreadAttribute createSpreadAttribute() {
		SpreadAttributeImpl spreadAttribute = new SpreadAttributeImpl();
		return spreadAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReactPackage getReactPackage() {
		return (ReactPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ReactPackage getPackage() {
		return ReactPackage.eINSTANCE;
	}

} //ReactFactoryImpl
