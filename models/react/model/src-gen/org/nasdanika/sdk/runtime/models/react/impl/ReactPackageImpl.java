/**
 */
package org.nasdanika.sdk.runtime.models.react.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.nasdanika.sdk.runtime.models.core.CorePackage;

import org.nasdanika.sdk.runtime.models.html.HtmlPackage;

import org.nasdanika.sdk.runtime.models.react.ComponentDeclaration;
import org.nasdanika.sdk.runtime.models.react.ContextDeclaration;
import org.nasdanika.sdk.runtime.models.react.ContextHook;
import org.nasdanika.sdk.runtime.models.react.ContextProvider;
import org.nasdanika.sdk.runtime.models.react.EffectHook;
import org.nasdanika.sdk.runtime.models.react.EventAttribute;
import org.nasdanika.sdk.runtime.models.react.ExpressionAttribute;
import org.nasdanika.sdk.runtime.models.react.Hook;
import org.nasdanika.sdk.runtime.models.react.Intrinsic;
import org.nasdanika.sdk.runtime.models.react.JsxAttribute;
import org.nasdanika.sdk.runtime.models.react.JsxBlock;
import org.nasdanika.sdk.runtime.models.react.JsxConditional;
import org.nasdanika.sdk.runtime.models.react.JsxContainer;
import org.nasdanika.sdk.runtime.models.react.JsxContent;
import org.nasdanika.sdk.runtime.models.react.JsxElement;
import org.nasdanika.sdk.runtime.models.react.JsxExpression;
import org.nasdanika.sdk.runtime.models.react.JsxFragment;
import org.nasdanika.sdk.runtime.models.react.JsxIterator;
import org.nasdanika.sdk.runtime.models.react.JsxNode;
import org.nasdanika.sdk.runtime.models.react.JsxText;
import org.nasdanika.sdk.runtime.models.react.LiteralAttribute;
import org.nasdanika.sdk.runtime.models.react.MemoHook;
import org.nasdanika.sdk.runtime.models.react.OpaqueHook;
import org.nasdanika.sdk.runtime.models.react.OpaqueJsx;
import org.nasdanika.sdk.runtime.models.react.ReactElement;
import org.nasdanika.sdk.runtime.models.react.ReactFactory;
import org.nasdanika.sdk.runtime.models.react.ReactPackage;
import org.nasdanika.sdk.runtime.models.react.RefHook;
import org.nasdanika.sdk.runtime.models.react.SpreadAttribute;
import org.nasdanika.sdk.runtime.models.react.StateHook;
import org.nasdanika.sdk.runtime.models.react.TsxModule;

import org.nasdanika.sdk.runtime.models.typescript.TypescriptPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ReactPackageImpl extends EPackageImpl implements ReactPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reactElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tsxModuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentDeclarationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jsxBlockEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hookEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stateHookEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass effectHookEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass memoHookEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contextHookEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass refHookEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass opaqueHookEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contextDeclarationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jsxNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jsxContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jsxElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jsxFragmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jsxTextEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jsxExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jsxConditionalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jsxIteratorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contextProviderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass opaqueJsxEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass intrinsicEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jsxContentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jsxAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass literalAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expressionAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass spreadAttributeEClass = null;

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
	 * @see org.nasdanika.sdk.runtime.models.react.ReactPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ReactPackageImpl() {
		super(eNS_URI, ReactFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ReactPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ReactPackage init() {
		if (isInited) return (ReactPackage)EPackage.Registry.INSTANCE.getEPackage(ReactPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredReactPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		ReactPackageImpl theReactPackage = registeredReactPackage instanceof ReactPackageImpl ? (ReactPackageImpl)registeredReactPackage : new ReactPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		TypescriptPackage.eINSTANCE.eClass();
		CorePackage.eINSTANCE.eClass();
		EcorePackage.eINSTANCE.eClass();
		HtmlPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theReactPackage.createPackageContents();

		// Initialize created meta-data
		theReactPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theReactPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ReactPackage.eNS_URI, theReactPackage);
		return theReactPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReactElement() {
		return reactElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTsxModule() {
		return tsxModuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTsxModule_Directive() {
		return (EAttribute)tsxModuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComponentDeclaration() {
		return componentDeclarationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentDeclaration_PropsType() {
		return (EReference)componentDeclarationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentDeclaration_Hooks() {
		return (EReference)componentDeclarationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentDeclaration_Render() {
		return (EReference)componentDeclarationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComponentDeclaration_Memo() {
		return (EAttribute)componentDeclarationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJsxBlock() {
		return jsxBlockEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJsxBlock_Root() {
		return (EReference)jsxBlockEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHook() {
		return hookEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHook_Bindings() {
		return (EAttribute)hookEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStateHook() {
		return stateHookEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStateHook_StateType() {
		return (EReference)stateHookEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStateHook_InitialValue() {
		return (EReference)stateHookEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEffectHook() {
		return effectHookEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEffectHook_Body() {
		return (EReference)effectHookEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEffectHook_Dependencies() {
		return (EReference)effectHookEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEffectHook_Layout() {
		return (EAttribute)effectHookEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEffectHook_Cleanup() {
		return (EReference)effectHookEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMemoHook() {
		return memoHookEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMemoHook_Expression() {
		return (EReference)memoHookEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMemoHook_Dependencies() {
		return (EReference)memoHookEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMemoHook_Callback() {
		return (EAttribute)memoHookEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContextHook() {
		return contextHookEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContextHook_Context() {
		return (EReference)contextHookEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRefHook() {
		return refHookEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRefHook_RefType() {
		return (EReference)refHookEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRefHook_InitialValue() {
		return (EReference)refHookEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOpaqueHook() {
		return opaqueHookEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOpaqueHook_Text() {
		return (EAttribute)opaqueHookEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOpaqueHook_References() {
		return (EReference)opaqueHookEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContextDeclaration() {
		return contextDeclarationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContextDeclaration_ValueType() {
		return (EReference)contextDeclarationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContextDeclaration_DefaultValue() {
		return (EReference)contextDeclarationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJsxNode() {
		return jsxNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJsxContainer() {
		return jsxContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJsxContainer_Children() {
		return (EReference)jsxContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJsxElement() {
		return jsxElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJsxElement_Tag() {
		return (EAttribute)jsxElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJsxElement_ComponentType() {
		return (EReference)jsxElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJsxElement_Attributes() {
		return (EReference)jsxElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJsxFragment() {
		return jsxFragmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJsxText() {
		return jsxTextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJsxText_Text() {
		return (EAttribute)jsxTextEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJsxExpression() {
		return jsxExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJsxExpression_Expression() {
		return (EReference)jsxExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJsxConditional() {
		return jsxConditionalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJsxConditional_Condition() {
		return (EReference)jsxConditionalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJsxConditional_Then() {
		return (EReference)jsxConditionalEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJsxConditional_Otherwise() {
		return (EReference)jsxConditionalEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJsxIterator() {
		return jsxIteratorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJsxIterator_Items() {
		return (EReference)jsxIteratorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJsxIterator_Variable() {
		return (EAttribute)jsxIteratorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJsxIterator_Key() {
		return (EReference)jsxIteratorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJsxIterator_Template() {
		return (EReference)jsxIteratorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContextProvider() {
		return contextProviderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContextProvider_Context() {
		return (EReference)contextProviderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContextProvider_Value() {
		return (EReference)contextProviderEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOpaqueJsx() {
		return opaqueJsxEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOpaqueJsx_Text() {
		return (EAttribute)opaqueJsxEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOpaqueJsx_References() {
		return (EReference)opaqueJsxEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntrinsic() {
		return intrinsicEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIntrinsic_Element() {
		return (EReference)intrinsicEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIntrinsic_Attributes() {
		return (EReference)intrinsicEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJsxContent() {
		return jsxContentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJsxContent_Node() {
		return (EReference)jsxContentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJsxAttribute() {
		return jsxAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJsxAttribute_AttributeName() {
		return (EAttribute)jsxAttributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLiteralAttribute() {
		return literalAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiteralAttribute_Value() {
		return (EAttribute)literalAttributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpressionAttribute() {
		return expressionAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpressionAttribute_Expression() {
		return (EReference)expressionAttributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEventAttribute() {
		return eventAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEventAttribute_Handler() {
		return (EReference)eventAttributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSpreadAttribute() {
		return spreadAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpreadAttribute_Expression() {
		return (EReference)spreadAttributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReactFactory getReactFactory() {
		return (ReactFactory)getEFactoryInstance();
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
		reactElementEClass = createEClass(REACT_ELEMENT);

		tsxModuleEClass = createEClass(TSX_MODULE);
		createEAttribute(tsxModuleEClass, TSX_MODULE__DIRECTIVE);

		componentDeclarationEClass = createEClass(COMPONENT_DECLARATION);
		createEReference(componentDeclarationEClass, COMPONENT_DECLARATION__PROPS_TYPE);
		createEReference(componentDeclarationEClass, COMPONENT_DECLARATION__HOOKS);
		createEReference(componentDeclarationEClass, COMPONENT_DECLARATION__RENDER);
		createEAttribute(componentDeclarationEClass, COMPONENT_DECLARATION__MEMO);

		jsxBlockEClass = createEClass(JSX_BLOCK);
		createEReference(jsxBlockEClass, JSX_BLOCK__ROOT);

		hookEClass = createEClass(HOOK);
		createEAttribute(hookEClass, HOOK__BINDINGS);

		stateHookEClass = createEClass(STATE_HOOK);
		createEReference(stateHookEClass, STATE_HOOK__STATE_TYPE);
		createEReference(stateHookEClass, STATE_HOOK__INITIAL_VALUE);

		effectHookEClass = createEClass(EFFECT_HOOK);
		createEReference(effectHookEClass, EFFECT_HOOK__BODY);
		createEReference(effectHookEClass, EFFECT_HOOK__DEPENDENCIES);
		createEAttribute(effectHookEClass, EFFECT_HOOK__LAYOUT);
		createEReference(effectHookEClass, EFFECT_HOOK__CLEANUP);

		memoHookEClass = createEClass(MEMO_HOOK);
		createEReference(memoHookEClass, MEMO_HOOK__EXPRESSION);
		createEReference(memoHookEClass, MEMO_HOOK__DEPENDENCIES);
		createEAttribute(memoHookEClass, MEMO_HOOK__CALLBACK);

		contextHookEClass = createEClass(CONTEXT_HOOK);
		createEReference(contextHookEClass, CONTEXT_HOOK__CONTEXT);

		refHookEClass = createEClass(REF_HOOK);
		createEReference(refHookEClass, REF_HOOK__REF_TYPE);
		createEReference(refHookEClass, REF_HOOK__INITIAL_VALUE);

		opaqueHookEClass = createEClass(OPAQUE_HOOK);
		createEAttribute(opaqueHookEClass, OPAQUE_HOOK__TEXT);
		createEReference(opaqueHookEClass, OPAQUE_HOOK__REFERENCES);

		contextDeclarationEClass = createEClass(CONTEXT_DECLARATION);
		createEReference(contextDeclarationEClass, CONTEXT_DECLARATION__VALUE_TYPE);
		createEReference(contextDeclarationEClass, CONTEXT_DECLARATION__DEFAULT_VALUE);

		jsxNodeEClass = createEClass(JSX_NODE);

		jsxContainerEClass = createEClass(JSX_CONTAINER);
		createEReference(jsxContainerEClass, JSX_CONTAINER__CHILDREN);

		jsxElementEClass = createEClass(JSX_ELEMENT);
		createEAttribute(jsxElementEClass, JSX_ELEMENT__TAG);
		createEReference(jsxElementEClass, JSX_ELEMENT__COMPONENT_TYPE);
		createEReference(jsxElementEClass, JSX_ELEMENT__ATTRIBUTES);

		jsxFragmentEClass = createEClass(JSX_FRAGMENT);

		jsxTextEClass = createEClass(JSX_TEXT);
		createEAttribute(jsxTextEClass, JSX_TEXT__TEXT);

		jsxExpressionEClass = createEClass(JSX_EXPRESSION);
		createEReference(jsxExpressionEClass, JSX_EXPRESSION__EXPRESSION);

		jsxConditionalEClass = createEClass(JSX_CONDITIONAL);
		createEReference(jsxConditionalEClass, JSX_CONDITIONAL__CONDITION);
		createEReference(jsxConditionalEClass, JSX_CONDITIONAL__THEN);
		createEReference(jsxConditionalEClass, JSX_CONDITIONAL__OTHERWISE);

		jsxIteratorEClass = createEClass(JSX_ITERATOR);
		createEReference(jsxIteratorEClass, JSX_ITERATOR__ITEMS);
		createEAttribute(jsxIteratorEClass, JSX_ITERATOR__VARIABLE);
		createEReference(jsxIteratorEClass, JSX_ITERATOR__KEY);
		createEReference(jsxIteratorEClass, JSX_ITERATOR__TEMPLATE);

		contextProviderEClass = createEClass(CONTEXT_PROVIDER);
		createEReference(contextProviderEClass, CONTEXT_PROVIDER__CONTEXT);
		createEReference(contextProviderEClass, CONTEXT_PROVIDER__VALUE);

		opaqueJsxEClass = createEClass(OPAQUE_JSX);
		createEAttribute(opaqueJsxEClass, OPAQUE_JSX__TEXT);
		createEReference(opaqueJsxEClass, OPAQUE_JSX__REFERENCES);

		intrinsicEClass = createEClass(INTRINSIC);
		createEReference(intrinsicEClass, INTRINSIC__ELEMENT);
		createEReference(intrinsicEClass, INTRINSIC__ATTRIBUTES);

		jsxContentEClass = createEClass(JSX_CONTENT);
		createEReference(jsxContentEClass, JSX_CONTENT__NODE);

		jsxAttributeEClass = createEClass(JSX_ATTRIBUTE);
		createEAttribute(jsxAttributeEClass, JSX_ATTRIBUTE__ATTRIBUTE_NAME);

		literalAttributeEClass = createEClass(LITERAL_ATTRIBUTE);
		createEAttribute(literalAttributeEClass, LITERAL_ATTRIBUTE__VALUE);

		expressionAttributeEClass = createEClass(EXPRESSION_ATTRIBUTE);
		createEReference(expressionAttributeEClass, EXPRESSION_ATTRIBUTE__EXPRESSION);

		eventAttributeEClass = createEClass(EVENT_ATTRIBUTE);
		createEReference(eventAttributeEClass, EVENT_ATTRIBUTE__HANDLER);

		spreadAttributeEClass = createEClass(SPREAD_ATTRIBUTE);
		createEReference(spreadAttributeEClass, SPREAD_ATTRIBUTE__EXPRESSION);
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
		TypescriptPackage theTypescriptPackage = (TypescriptPackage)EPackage.Registry.INSTANCE.getEPackage(TypescriptPackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);
		HtmlPackage theHtmlPackage = (HtmlPackage)EPackage.Registry.INSTANCE.getEPackage(HtmlPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		reactElementEClass.getESuperTypes().add(theTypescriptPackage.getTypeScriptElement());
		tsxModuleEClass.getESuperTypes().add(theTypescriptPackage.getModule());
		componentDeclarationEClass.getESuperTypes().add(theTypescriptPackage.getFunctionDeclaration());
		jsxBlockEClass.getESuperTypes().add(theTypescriptPackage.getCodeBlock());
		hookEClass.getESuperTypes().add(this.getReactElement());
		stateHookEClass.getESuperTypes().add(this.getHook());
		effectHookEClass.getESuperTypes().add(this.getHook());
		memoHookEClass.getESuperTypes().add(this.getHook());
		contextHookEClass.getESuperTypes().add(this.getHook());
		refHookEClass.getESuperTypes().add(this.getHook());
		opaqueHookEClass.getESuperTypes().add(this.getHook());
		contextDeclarationEClass.getESuperTypes().add(theTypescriptPackage.getDeclaration());
		jsxNodeEClass.getESuperTypes().add(this.getReactElement());
		jsxContainerEClass.getESuperTypes().add(this.getJsxNode());
		jsxElementEClass.getESuperTypes().add(this.getJsxContainer());
		jsxFragmentEClass.getESuperTypes().add(this.getJsxContainer());
		jsxTextEClass.getESuperTypes().add(this.getJsxNode());
		jsxExpressionEClass.getESuperTypes().add(this.getJsxNode());
		jsxConditionalEClass.getESuperTypes().add(this.getJsxNode());
		jsxIteratorEClass.getESuperTypes().add(this.getJsxNode());
		contextProviderEClass.getESuperTypes().add(this.getJsxContainer());
		opaqueJsxEClass.getESuperTypes().add(this.getJsxNode());
		intrinsicEClass.getESuperTypes().add(this.getJsxContainer());
		jsxContentEClass.getESuperTypes().add(theHtmlPackage.getNode());
		jsxAttributeEClass.getESuperTypes().add(this.getReactElement());
		literalAttributeEClass.getESuperTypes().add(this.getJsxAttribute());
		expressionAttributeEClass.getESuperTypes().add(this.getJsxAttribute());
		eventAttributeEClass.getESuperTypes().add(this.getJsxAttribute());
		spreadAttributeEClass.getESuperTypes().add(this.getJsxAttribute());

		// Initialize classes, features, and operations; add parameters
		initEClass(reactElementEClass, ReactElement.class, "ReactElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tsxModuleEClass, TsxModule.class, "TsxModule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTsxModule_Directive(), theEcorePackage.getEString(), "directive", null, 0, 1, TsxModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(componentDeclarationEClass, ComponentDeclaration.class, "ComponentDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComponentDeclaration_PropsType(), theTypescriptPackage.getInterfaceDeclaration(), null, "propsType", null, 0, 1, ComponentDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponentDeclaration_Hooks(), this.getHook(), null, "hooks", null, 0, -1, ComponentDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponentDeclaration_Render(), this.getJsxNode(), null, "render", null, 0, 1, ComponentDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponentDeclaration_Memo(), theEcorePackage.getEBoolean(), "memo", null, 0, 1, ComponentDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(jsxBlockEClass, JsxBlock.class, "JsxBlock", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getJsxBlock_Root(), this.getJsxNode(), null, "root", null, 0, 1, JsxBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hookEClass, Hook.class, "Hook", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHook_Bindings(), theEcorePackage.getEString(), "bindings", null, 0, -1, Hook.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stateHookEClass, StateHook.class, "StateHook", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStateHook_StateType(), theTypescriptPackage.getTypeReference(), null, "stateType", null, 0, 1, StateHook.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStateHook_InitialValue(), theTypescriptPackage.getCodeBlock(), null, "initialValue", null, 0, 1, StateHook.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(effectHookEClass, EffectHook.class, "EffectHook", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEffectHook_Body(), theTypescriptPackage.getCodeBlock(), null, "body", null, 0, 1, EffectHook.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEffectHook_Dependencies(), theTypescriptPackage.getCodeBlock(), null, "dependencies", null, 0, -1, EffectHook.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEffectHook_Layout(), theEcorePackage.getEBoolean(), "layout", null, 0, 1, EffectHook.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEffectHook_Cleanup(), theTypescriptPackage.getCodeBlock(), null, "cleanup", null, 0, 1, EffectHook.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(memoHookEClass, MemoHook.class, "MemoHook", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMemoHook_Expression(), theTypescriptPackage.getCodeBlock(), null, "expression", null, 0, 1, MemoHook.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMemoHook_Dependencies(), theTypescriptPackage.getCodeBlock(), null, "dependencies", null, 0, -1, MemoHook.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMemoHook_Callback(), theEcorePackage.getEBoolean(), "callback", null, 0, 1, MemoHook.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(contextHookEClass, ContextHook.class, "ContextHook", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getContextHook_Context(), this.getContextDeclaration(), null, "context", null, 0, 1, ContextHook.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(refHookEClass, RefHook.class, "RefHook", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRefHook_RefType(), theTypescriptPackage.getTypeReference(), null, "refType", null, 0, 1, RefHook.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRefHook_InitialValue(), theTypescriptPackage.getCodeBlock(), null, "initialValue", null, 0, 1, RefHook.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(opaqueHookEClass, OpaqueHook.class, "OpaqueHook", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOpaqueHook_Text(), theEcorePackage.getEString(), "text", null, 0, 1, OpaqueHook.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOpaqueHook_References(), theTypescriptPackage.getTypeReference(), null, "references", null, 0, -1, OpaqueHook.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(contextDeclarationEClass, ContextDeclaration.class, "ContextDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getContextDeclaration_ValueType(), theTypescriptPackage.getTypeReference(), null, "valueType", null, 0, 1, ContextDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContextDeclaration_DefaultValue(), theTypescriptPackage.getCodeBlock(), null, "defaultValue", null, 0, 1, ContextDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(jsxNodeEClass, JsxNode.class, "JsxNode", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(jsxContainerEClass, JsxContainer.class, "JsxContainer", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getJsxContainer_Children(), this.getJsxNode(), null, "children", null, 0, -1, JsxContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(jsxElementEClass, JsxElement.class, "JsxElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getJsxElement_Tag(), theEcorePackage.getEString(), "tag", null, 0, 1, JsxElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJsxElement_ComponentType(), theTypescriptPackage.getNamedTypeReference(), null, "componentType", null, 0, 1, JsxElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJsxElement_Attributes(), this.getJsxAttribute(), null, "attributes", null, 0, -1, JsxElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(jsxFragmentEClass, JsxFragment.class, "JsxFragment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(jsxTextEClass, JsxText.class, "JsxText", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getJsxText_Text(), theEcorePackage.getEString(), "text", null, 0, 1, JsxText.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(jsxExpressionEClass, JsxExpression.class, "JsxExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getJsxExpression_Expression(), theTypescriptPackage.getCodeBlock(), null, "expression", null, 0, 1, JsxExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(jsxConditionalEClass, JsxConditional.class, "JsxConditional", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getJsxConditional_Condition(), theTypescriptPackage.getCodeBlock(), null, "condition", null, 0, 1, JsxConditional.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJsxConditional_Then(), this.getJsxNode(), null, "then", null, 0, 1, JsxConditional.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJsxConditional_Otherwise(), this.getJsxNode(), null, "otherwise", null, 0, 1, JsxConditional.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(jsxIteratorEClass, JsxIterator.class, "JsxIterator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getJsxIterator_Items(), theTypescriptPackage.getCodeBlock(), null, "items", null, 0, 1, JsxIterator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJsxIterator_Variable(), theEcorePackage.getEString(), "variable", null, 0, 1, JsxIterator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJsxIterator_Key(), theTypescriptPackage.getCodeBlock(), null, "key", null, 0, 1, JsxIterator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJsxIterator_Template(), this.getJsxNode(), null, "template", null, 0, 1, JsxIterator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(contextProviderEClass, ContextProvider.class, "ContextProvider", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getContextProvider_Context(), this.getContextDeclaration(), null, "context", null, 0, 1, ContextProvider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContextProvider_Value(), theTypescriptPackage.getCodeBlock(), null, "value", null, 0, 1, ContextProvider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(opaqueJsxEClass, OpaqueJsx.class, "OpaqueJsx", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOpaqueJsx_Text(), theEcorePackage.getEString(), "text", null, 0, 1, OpaqueJsx.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOpaqueJsx_References(), theTypescriptPackage.getTypeReference(), null, "references", null, 0, -1, OpaqueJsx.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(intrinsicEClass, Intrinsic.class, "Intrinsic", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIntrinsic_Element(), theHtmlPackage.getElement(), null, "element", null, 0, 1, Intrinsic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIntrinsic_Attributes(), this.getJsxAttribute(), null, "attributes", null, 0, -1, Intrinsic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(jsxContentEClass, JsxContent.class, "JsxContent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getJsxContent_Node(), this.getJsxNode(), null, "node", null, 0, 1, JsxContent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(jsxAttributeEClass, JsxAttribute.class, "JsxAttribute", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getJsxAttribute_AttributeName(), theEcorePackage.getEString(), "attributeName", null, 0, 1, JsxAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(literalAttributeEClass, LiteralAttribute.class, "LiteralAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLiteralAttribute_Value(), theEcorePackage.getEString(), "value", null, 0, 1, LiteralAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(expressionAttributeEClass, ExpressionAttribute.class, "ExpressionAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExpressionAttribute_Expression(), theTypescriptPackage.getCodeBlock(), null, "expression", null, 0, 1, ExpressionAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eventAttributeEClass, EventAttribute.class, "EventAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEventAttribute_Handler(), theTypescriptPackage.getCodeBlock(), null, "handler", null, 0, 1, EventAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(spreadAttributeEClass, SpreadAttribute.class, "SpreadAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSpreadAttribute_Expression(), theTypescriptPackage.getCodeBlock(), null, "expression", null, 0, 1, SpreadAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
		  (reactElementEClass,
		   source,
		   new String[] {
			   "documentation", "Base of everything React specific. Extends the TypeScript base so the whole code\nfamily shares one root: name, documentation-as-structure, and nested markers from\nnxcore. The markers are the provenance join back to the ui elements a drawing\nproduced, and through them to owners and work."
		   });
		addAnnotation
		  (tsxModuleEClass,
		   source,
		   new String[] {
			   "documentation", "A .tsx module. Directive carries \"use client\" or \"use server\" verbatim when a\nframework needs it; the model does not interpret it, because interpreting it would\nmean modeling a specific meta-framework\'s boundary rules."
		   });
		addAnnotation
		  (componentDeclarationEClass,
		   source,
		   new String[] {
			   "documentation", "A React function component. It IS a TypeScript function declaration, so signature,\ntype parameters, exportedness and async-ness are inherited rather than duplicated.\n\nThe inherited `body` holds prelude statements as opaque code (destructuring,\nderived values). Hooks are separate because their ORDER is semantically\nsignificant in React and a generator must be able to emit them before the prelude\nand in a stable sequence; burying them in opaque text would make that\nunverifiable. `render` is the returned tree."
		   });
		addAnnotation
		  (getComponentDeclaration_PropsType(),
		   source,
		   new String[] {
			   "documentation", " Props interface, normally generated beside the component in the same module."
		   });
		addAnnotation
		  (getComponentDeclaration_Hooks(),
		   source,
		   new String[] {
			   "documentation", " Emitted in declaration order; React requires stable hook order across renders."
		   });
		addAnnotation
		  (getComponentDeclaration_Memo(),
		   source,
		   new String[] {
			   "documentation", " Wrap the export in React.memo."
		   });
		addAnnotation
		  (jsxBlockEClass,
		   source,
		   new String[] {
			   "documentation", "A function body that returns structured JSX rather than opaque text. This is the\nseam into the TypeScript model: anywhere a CodeBlock is accepted, a JsxBlock can\nappear, and its element types still feed import management. Used for render props,\ncell renderers and helper functions that are not components in their own right."
		   });
		addAnnotation
		  (hookEClass,
		   source,
		   new String[] {
			   "documentation", " ---------------------------------------------------------------------------\nHooks. Declarations only: what is called, what it binds, what it depends on.\nBodies are opaque code, which is where application logic belongs.\n---------------------------------------------------------------------------"
		   });
		addAnnotation
		  (getHook_Bindings(),
		   source,
		   new String[] {
			   "documentation", "Names bound by this hook, in destructuring order: [\"count\", \"setCount\"] for\nuseState. Emitted as the left hand side; referenced by expressions elsewhere."
		   });
		addAnnotation
		  (effectHookEClass,
		   source,
		   new String[] {
			   "documentation", " useEffect, or useLayoutEffect when layout is set. Empty dependencies means run once."
		   });
		addAnnotation
		  (getEffectHook_Cleanup(),
		   source,
		   new String[] {
			   "documentation", " Returned teardown, if any."
		   });
		addAnnotation
		  (memoHookEClass,
		   source,
		   new String[] {
			   "documentation", " useMemo, or useCallback when callback is set."
		   });
		addAnnotation
		  (opaqueHookEClass,
		   source,
		   new String[] {
			   "documentation", "Escape hatch: reducers, custom hooks, router hooks, store hooks, anything from a\nlibrary. `references` keeps import management honest about types and functions\nused only inside the text, the same bargain as OpaqueTypeReference."
		   });
		addAnnotation
		  (contextDeclarationEClass,
		   source,
		   new String[] {
			   "documentation", " React context object, created at module level."
		   });
		addAnnotation
		  (jsxNodeEClass,
		   source,
		   new String[] {
			   "documentation", " ---------------------------------------------------------------------------\nJSX\n---------------------------------------------------------------------------"
		   });
		addAnnotation
		  (jsxElementEClass,
		   source,
		   new String[] {
			   "documentation", "A JSX element. Exactly one of `tag` and `componentType` is set: `tag` for\nintrinsics (\"div\", \"table\", \"input\"), `componentType` for components.\nFor intrinsics prefer Intrinsic, which carries a typed HTML model element.\n\ncomponentType is the load-bearing feature of this whole model. It is what the\nemitter walks to decide which components must be imported, from which specifier,\nand whether the import can be type-only. Modeling JSX purely as text would lose\nthis and hand the problem back to a template."
		   });
		addAnnotation
		  (jsxFragmentEClass,
		   source,
		   new String[] {
			   "documentation", " <>...</>"
		   });
		addAnnotation
		  (jsxTextEClass,
		   source,
		   new String[] {
			   "documentation", " Literal text content. Escaping is an emitter concern."
		   });
		addAnnotation
		  (jsxExpressionEClass,
		   source,
		   new String[] {
			   "documentation", " {expression}"
		   });
		addAnnotation
		  (jsxConditionalEClass,
		   source,
		   new String[] {
			   "documentation", "Conditional rendering. With `otherwise` set the emitter writes a ternary,\nwithout it a short-circuit. Target of ui.Conditional."
		   });
		addAnnotation
		  (jsxIteratorEClass,
		   source,
		   new String[] {
			   "documentation", "List rendering: {items.map(variable => template)}. Target of ui.Iterator, whose\n`key` already exists for keyed updates and lands here as React\'s required key\nprop. The emitter must reject a missing key rather than emit a warning at runtime."
		   });
		addAnnotation
		  (contextProviderEClass,
		   source,
		   new String[] {
			   "documentation", "<SomeContext.Provider value={...}>. Kept as its own class rather than a plain\nJsxElement because the provider is where a ui.DataContext lands, and the\ntransformation needs to find these to hoist scopes correctly."
		   });
		addAnnotation
		  (opaqueJsxEClass,
		   source,
		   new String[] {
			   "documentation", " Verbatim JSX text. Escape hatch; `references` keeps imports resolvable."
		   });
		addAnnotation
		  (intrinsicEClass,
		   source,
		   new String[] {
			   "documentation", "An HTML model element used as a JSX intrinsic. Tag name, static attributes, classes,\nstyle and structure (table sections, select options, ...) come from the HTML model and\nare interpreted by its HtmlStructure, so HTML produced by a transformation, e.g. a\nBootstrap layer, can be used in components as is.\n\n`attributes` are props HTML cannot express: expressions, event handlers, key, spreads.\nWhere a name is set both ways, the JSX attribute wins. JSX inside the element is\nplaced into HTML containers with JsxContent. `children` follow the children of the\nHTML element - for dynamic content where the HTML model has a typed reference\nrather than a container, e.g. an iterator over the rows of a TableBody.\n\nPrefer this to JsxElement.tag, which remains for intrinsics the HTML model does not\ncover and for opaque output of older transformations."
		   });
		addAnnotation
		  (jsxContentEClass,
		   source,
		   new String[] {
			   "documentation", "JSX in an HTML container: {expression}, conditionals, iterators, component elements.\nThe counterpart of Intrinsic, so the two trees nest in each other. Rendered by the JSX\nemitter only - static HTML generation rejects it."
		   });
		addAnnotation
		  (jsxAttributeEClass,
		   source,
		   new String[] {
			   "documentation", " ---------------------------------------------------------------------------\nAttributes\n---------------------------------------------------------------------------"
		   });
		addAnnotation
		  (getJsxAttribute_AttributeName(),
		   source,
		   new String[] {
			   "documentation", " JSX attribute name: className, htmlFor, value, onClick, data-bs-theme."
		   });
		addAnnotation
		  (literalAttributeEClass,
		   source,
		   new String[] {
			   "documentation", " name=\"literal\""
		   });
		addAnnotation
		  (expressionAttributeEClass,
		   source,
		   new String[] {
			   "documentation", " name={expression}"
		   });
		addAnnotation
		  (eventAttributeEClass,
		   source,
		   new String[] {
			   "documentation", "onClick={handler} and friends. Distinguished from ExpressionAttribute so the\nemitter can validate the on* naming convention and so ui.EventBinding has an\nunambiguous target."
		   });
		addAnnotation
		  (spreadAttributeEClass,
		   source,
		   new String[] {
			   "documentation", " {...expression}"
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

} //ReactPackageImpl
