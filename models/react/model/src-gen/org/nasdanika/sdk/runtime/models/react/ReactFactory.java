/**
 */
package org.nasdanika.sdk.runtime.models.react;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.nasdanika.sdk.runtime.models.react.ReactPackage
 * @generated
 */
public interface ReactFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ReactFactory eINSTANCE = org.nasdanika.sdk.runtime.models.react.impl.ReactFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Tsx Module</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tsx Module</em>'.
	 * @generated
	 */
	TsxModule createTsxModule();

	/**
	 * Returns a new object of class '<em>Component Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Component Declaration</em>'.
	 * @generated
	 */
	ComponentDeclaration createComponentDeclaration();

	/**
	 * Returns a new object of class '<em>Jsx Block</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Jsx Block</em>'.
	 * @generated
	 */
	JsxBlock createJsxBlock();

	/**
	 * Returns a new object of class '<em>State Hook</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>State Hook</em>'.
	 * @generated
	 */
	StateHook createStateHook();

	/**
	 * Returns a new object of class '<em>Effect Hook</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Effect Hook</em>'.
	 * @generated
	 */
	EffectHook createEffectHook();

	/**
	 * Returns a new object of class '<em>Memo Hook</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Memo Hook</em>'.
	 * @generated
	 */
	MemoHook createMemoHook();

	/**
	 * Returns a new object of class '<em>Context Hook</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Context Hook</em>'.
	 * @generated
	 */
	ContextHook createContextHook();

	/**
	 * Returns a new object of class '<em>Ref Hook</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ref Hook</em>'.
	 * @generated
	 */
	RefHook createRefHook();

	/**
	 * Returns a new object of class '<em>Opaque Hook</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Opaque Hook</em>'.
	 * @generated
	 */
	OpaqueHook createOpaqueHook();

	/**
	 * Returns a new object of class '<em>Context Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Context Declaration</em>'.
	 * @generated
	 */
	ContextDeclaration createContextDeclaration();

	/**
	 * Returns a new object of class '<em>Jsx Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Jsx Element</em>'.
	 * @generated
	 */
	JsxElement createJsxElement();

	/**
	 * Returns a new object of class '<em>Jsx Fragment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Jsx Fragment</em>'.
	 * @generated
	 */
	JsxFragment createJsxFragment();

	/**
	 * Returns a new object of class '<em>Jsx Text</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Jsx Text</em>'.
	 * @generated
	 */
	JsxText createJsxText();

	/**
	 * Returns a new object of class '<em>Jsx Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Jsx Expression</em>'.
	 * @generated
	 */
	JsxExpression createJsxExpression();

	/**
	 * Returns a new object of class '<em>Jsx Conditional</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Jsx Conditional</em>'.
	 * @generated
	 */
	JsxConditional createJsxConditional();

	/**
	 * Returns a new object of class '<em>Jsx Iterator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Jsx Iterator</em>'.
	 * @generated
	 */
	JsxIterator createJsxIterator();

	/**
	 * Returns a new object of class '<em>Context Provider</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Context Provider</em>'.
	 * @generated
	 */
	ContextProvider createContextProvider();

	/**
	 * Returns a new object of class '<em>Opaque Jsx</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Opaque Jsx</em>'.
	 * @generated
	 */
	OpaqueJsx createOpaqueJsx();

	/**
	 * Returns a new object of class '<em>Intrinsic</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Intrinsic</em>'.
	 * @generated
	 */
	Intrinsic createIntrinsic();

	/**
	 * Returns a new object of class '<em>Jsx Content</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Jsx Content</em>'.
	 * @generated
	 */
	JsxContent createJsxContent();

	/**
	 * Returns a new object of class '<em>Value Block</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Value Block</em>'.
	 * @generated
	 */
	ValueBlock createValueBlock();

	/**
	 * Returns a new object of class '<em>Literal Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Literal Attribute</em>'.
	 * @generated
	 */
	LiteralAttribute createLiteralAttribute();

	/**
	 * Returns a new object of class '<em>Expression Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Expression Attribute</em>'.
	 * @generated
	 */
	ExpressionAttribute createExpressionAttribute();

	/**
	 * Returns a new object of class '<em>Event Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Event Attribute</em>'.
	 * @generated
	 */
	EventAttribute createEventAttribute();

	/**
	 * Returns a new object of class '<em>Spread Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Spread Attribute</em>'.
	 * @generated
	 */
	SpreadAttribute createSpreadAttribute();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ReactPackage getReactPackage();

} //ReactFactory
