/**
 */
package org.nasdanika.sdk.runtime.models.react.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.nasdanika.sdk.runtime.models.core.Documented;
import org.nasdanika.sdk.runtime.models.core.Marked;
import org.nasdanika.sdk.runtime.models.core.ModelElement;
import org.nasdanika.sdk.runtime.models.core.NamedElement;
import org.nasdanika.sdk.runtime.models.core.Referrable;
import org.nasdanika.sdk.runtime.models.core.StringIdentity;

import org.nasdanika.sdk.runtime.models.html.Node;

import org.nasdanika.sdk.runtime.models.react.*;

import org.nasdanika.sdk.runtime.models.typescript.Callable;
import org.nasdanika.sdk.runtime.models.typescript.CodeBlock;
import org.nasdanika.sdk.runtime.models.typescript.Declaration;
import org.nasdanika.sdk.runtime.models.typescript.FunctionDeclaration;
import org.nasdanika.sdk.runtime.models.typescript.TypeScriptElement;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.nasdanika.sdk.runtime.models.react.ReactPackage
 * @generated
 */
public class ReactSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ReactPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReactSwitch() {
		if (modelPackage == null) {
			modelPackage = ReactPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case ReactPackage.REACT_ELEMENT: {
				ReactElement reactElement = (ReactElement)theEObject;
				T result = caseReactElement(reactElement);
				if (result == null) result = caseTypeScriptElement(reactElement);
				if (result == null) result = caseNamedElement(reactElement);
				if (result == null) result = caseModelElement(reactElement);
				if (result == null) result = caseStringIdentity(reactElement);
				if (result == null) result = caseDocumented(reactElement);
				if (result == null) result = caseMarked(reactElement);
				if (result == null) result = caseReferrable(reactElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReactPackage.TSX_MODULE: {
				TsxModule tsxModule = (TsxModule)theEObject;
				T result = caseTsxModule(tsxModule);
				if (result == null) result = caseModule(tsxModule);
				if (result == null) result = caseTypeScriptElement(tsxModule);
				if (result == null) result = caseNamedElement(tsxModule);
				if (result == null) result = caseModelElement(tsxModule);
				if (result == null) result = caseStringIdentity(tsxModule);
				if (result == null) result = caseDocumented(tsxModule);
				if (result == null) result = caseMarked(tsxModule);
				if (result == null) result = caseReferrable(tsxModule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReactPackage.COMPONENT_DECLARATION: {
				ComponentDeclaration componentDeclaration = (ComponentDeclaration)theEObject;
				T result = caseComponentDeclaration(componentDeclaration);
				if (result == null) result = caseFunctionDeclaration(componentDeclaration);
				if (result == null) result = caseDeclaration(componentDeclaration);
				if (result == null) result = caseCallable(componentDeclaration);
				if (result == null) result = caseTypeScriptElement(componentDeclaration);
				if (result == null) result = caseNamedElement(componentDeclaration);
				if (result == null) result = caseModelElement(componentDeclaration);
				if (result == null) result = caseStringIdentity(componentDeclaration);
				if (result == null) result = caseDocumented(componentDeclaration);
				if (result == null) result = caseMarked(componentDeclaration);
				if (result == null) result = caseReferrable(componentDeclaration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReactPackage.JSX_BLOCK: {
				JsxBlock jsxBlock = (JsxBlock)theEObject;
				T result = caseJsxBlock(jsxBlock);
				if (result == null) result = caseCodeBlock(jsxBlock);
				if (result == null) result = caseTypeScriptElement(jsxBlock);
				if (result == null) result = caseNamedElement(jsxBlock);
				if (result == null) result = caseModelElement(jsxBlock);
				if (result == null) result = caseStringIdentity(jsxBlock);
				if (result == null) result = caseDocumented(jsxBlock);
				if (result == null) result = caseMarked(jsxBlock);
				if (result == null) result = caseReferrable(jsxBlock);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReactPackage.HOOK: {
				Hook hook = (Hook)theEObject;
				T result = caseHook(hook);
				if (result == null) result = caseReactElement(hook);
				if (result == null) result = caseTypeScriptElement(hook);
				if (result == null) result = caseNamedElement(hook);
				if (result == null) result = caseModelElement(hook);
				if (result == null) result = caseStringIdentity(hook);
				if (result == null) result = caseDocumented(hook);
				if (result == null) result = caseMarked(hook);
				if (result == null) result = caseReferrable(hook);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReactPackage.STATE_HOOK: {
				StateHook stateHook = (StateHook)theEObject;
				T result = caseStateHook(stateHook);
				if (result == null) result = caseHook(stateHook);
				if (result == null) result = caseReactElement(stateHook);
				if (result == null) result = caseTypeScriptElement(stateHook);
				if (result == null) result = caseNamedElement(stateHook);
				if (result == null) result = caseModelElement(stateHook);
				if (result == null) result = caseStringIdentity(stateHook);
				if (result == null) result = caseDocumented(stateHook);
				if (result == null) result = caseMarked(stateHook);
				if (result == null) result = caseReferrable(stateHook);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReactPackage.EFFECT_HOOK: {
				EffectHook effectHook = (EffectHook)theEObject;
				T result = caseEffectHook(effectHook);
				if (result == null) result = caseHook(effectHook);
				if (result == null) result = caseReactElement(effectHook);
				if (result == null) result = caseTypeScriptElement(effectHook);
				if (result == null) result = caseNamedElement(effectHook);
				if (result == null) result = caseModelElement(effectHook);
				if (result == null) result = caseStringIdentity(effectHook);
				if (result == null) result = caseDocumented(effectHook);
				if (result == null) result = caseMarked(effectHook);
				if (result == null) result = caseReferrable(effectHook);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReactPackage.MEMO_HOOK: {
				MemoHook memoHook = (MemoHook)theEObject;
				T result = caseMemoHook(memoHook);
				if (result == null) result = caseHook(memoHook);
				if (result == null) result = caseReactElement(memoHook);
				if (result == null) result = caseTypeScriptElement(memoHook);
				if (result == null) result = caseNamedElement(memoHook);
				if (result == null) result = caseModelElement(memoHook);
				if (result == null) result = caseStringIdentity(memoHook);
				if (result == null) result = caseDocumented(memoHook);
				if (result == null) result = caseMarked(memoHook);
				if (result == null) result = caseReferrable(memoHook);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReactPackage.CONTEXT_HOOK: {
				ContextHook contextHook = (ContextHook)theEObject;
				T result = caseContextHook(contextHook);
				if (result == null) result = caseHook(contextHook);
				if (result == null) result = caseReactElement(contextHook);
				if (result == null) result = caseTypeScriptElement(contextHook);
				if (result == null) result = caseNamedElement(contextHook);
				if (result == null) result = caseModelElement(contextHook);
				if (result == null) result = caseStringIdentity(contextHook);
				if (result == null) result = caseDocumented(contextHook);
				if (result == null) result = caseMarked(contextHook);
				if (result == null) result = caseReferrable(contextHook);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReactPackage.REF_HOOK: {
				RefHook refHook = (RefHook)theEObject;
				T result = caseRefHook(refHook);
				if (result == null) result = caseHook(refHook);
				if (result == null) result = caseReactElement(refHook);
				if (result == null) result = caseTypeScriptElement(refHook);
				if (result == null) result = caseNamedElement(refHook);
				if (result == null) result = caseModelElement(refHook);
				if (result == null) result = caseStringIdentity(refHook);
				if (result == null) result = caseDocumented(refHook);
				if (result == null) result = caseMarked(refHook);
				if (result == null) result = caseReferrable(refHook);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReactPackage.OPAQUE_HOOK: {
				OpaqueHook opaqueHook = (OpaqueHook)theEObject;
				T result = caseOpaqueHook(opaqueHook);
				if (result == null) result = caseHook(opaqueHook);
				if (result == null) result = caseReactElement(opaqueHook);
				if (result == null) result = caseTypeScriptElement(opaqueHook);
				if (result == null) result = caseNamedElement(opaqueHook);
				if (result == null) result = caseModelElement(opaqueHook);
				if (result == null) result = caseStringIdentity(opaqueHook);
				if (result == null) result = caseDocumented(opaqueHook);
				if (result == null) result = caseMarked(opaqueHook);
				if (result == null) result = caseReferrable(opaqueHook);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReactPackage.CONTEXT_DECLARATION: {
				ContextDeclaration contextDeclaration = (ContextDeclaration)theEObject;
				T result = caseContextDeclaration(contextDeclaration);
				if (result == null) result = caseDeclaration(contextDeclaration);
				if (result == null) result = caseTypeScriptElement(contextDeclaration);
				if (result == null) result = caseNamedElement(contextDeclaration);
				if (result == null) result = caseModelElement(contextDeclaration);
				if (result == null) result = caseStringIdentity(contextDeclaration);
				if (result == null) result = caseDocumented(contextDeclaration);
				if (result == null) result = caseMarked(contextDeclaration);
				if (result == null) result = caseReferrable(contextDeclaration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReactPackage.JSX_NODE: {
				JsxNode jsxNode = (JsxNode)theEObject;
				T result = caseJsxNode(jsxNode);
				if (result == null) result = caseReactElement(jsxNode);
				if (result == null) result = caseTypeScriptElement(jsxNode);
				if (result == null) result = caseNamedElement(jsxNode);
				if (result == null) result = caseModelElement(jsxNode);
				if (result == null) result = caseStringIdentity(jsxNode);
				if (result == null) result = caseDocumented(jsxNode);
				if (result == null) result = caseMarked(jsxNode);
				if (result == null) result = caseReferrable(jsxNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReactPackage.JSX_CONTAINER: {
				JsxContainer jsxContainer = (JsxContainer)theEObject;
				T result = caseJsxContainer(jsxContainer);
				if (result == null) result = caseJsxNode(jsxContainer);
				if (result == null) result = caseReactElement(jsxContainer);
				if (result == null) result = caseTypeScriptElement(jsxContainer);
				if (result == null) result = caseNamedElement(jsxContainer);
				if (result == null) result = caseModelElement(jsxContainer);
				if (result == null) result = caseStringIdentity(jsxContainer);
				if (result == null) result = caseDocumented(jsxContainer);
				if (result == null) result = caseMarked(jsxContainer);
				if (result == null) result = caseReferrable(jsxContainer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReactPackage.JSX_ELEMENT: {
				JsxElement jsxElement = (JsxElement)theEObject;
				T result = caseJsxElement(jsxElement);
				if (result == null) result = caseJsxContainer(jsxElement);
				if (result == null) result = caseJsxNode(jsxElement);
				if (result == null) result = caseReactElement(jsxElement);
				if (result == null) result = caseTypeScriptElement(jsxElement);
				if (result == null) result = caseNamedElement(jsxElement);
				if (result == null) result = caseModelElement(jsxElement);
				if (result == null) result = caseStringIdentity(jsxElement);
				if (result == null) result = caseDocumented(jsxElement);
				if (result == null) result = caseMarked(jsxElement);
				if (result == null) result = caseReferrable(jsxElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReactPackage.JSX_FRAGMENT: {
				JsxFragment jsxFragment = (JsxFragment)theEObject;
				T result = caseJsxFragment(jsxFragment);
				if (result == null) result = caseJsxContainer(jsxFragment);
				if (result == null) result = caseJsxNode(jsxFragment);
				if (result == null) result = caseReactElement(jsxFragment);
				if (result == null) result = caseTypeScriptElement(jsxFragment);
				if (result == null) result = caseNamedElement(jsxFragment);
				if (result == null) result = caseModelElement(jsxFragment);
				if (result == null) result = caseStringIdentity(jsxFragment);
				if (result == null) result = caseDocumented(jsxFragment);
				if (result == null) result = caseMarked(jsxFragment);
				if (result == null) result = caseReferrable(jsxFragment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReactPackage.JSX_TEXT: {
				JsxText jsxText = (JsxText)theEObject;
				T result = caseJsxText(jsxText);
				if (result == null) result = caseJsxNode(jsxText);
				if (result == null) result = caseReactElement(jsxText);
				if (result == null) result = caseTypeScriptElement(jsxText);
				if (result == null) result = caseNamedElement(jsxText);
				if (result == null) result = caseModelElement(jsxText);
				if (result == null) result = caseStringIdentity(jsxText);
				if (result == null) result = caseDocumented(jsxText);
				if (result == null) result = caseMarked(jsxText);
				if (result == null) result = caseReferrable(jsxText);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReactPackage.JSX_EXPRESSION: {
				JsxExpression jsxExpression = (JsxExpression)theEObject;
				T result = caseJsxExpression(jsxExpression);
				if (result == null) result = caseJsxNode(jsxExpression);
				if (result == null) result = caseReactElement(jsxExpression);
				if (result == null) result = caseTypeScriptElement(jsxExpression);
				if (result == null) result = caseNamedElement(jsxExpression);
				if (result == null) result = caseModelElement(jsxExpression);
				if (result == null) result = caseStringIdentity(jsxExpression);
				if (result == null) result = caseDocumented(jsxExpression);
				if (result == null) result = caseMarked(jsxExpression);
				if (result == null) result = caseReferrable(jsxExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReactPackage.JSX_CONDITIONAL: {
				JsxConditional jsxConditional = (JsxConditional)theEObject;
				T result = caseJsxConditional(jsxConditional);
				if (result == null) result = caseJsxNode(jsxConditional);
				if (result == null) result = caseReactElement(jsxConditional);
				if (result == null) result = caseTypeScriptElement(jsxConditional);
				if (result == null) result = caseNamedElement(jsxConditional);
				if (result == null) result = caseModelElement(jsxConditional);
				if (result == null) result = caseStringIdentity(jsxConditional);
				if (result == null) result = caseDocumented(jsxConditional);
				if (result == null) result = caseMarked(jsxConditional);
				if (result == null) result = caseReferrable(jsxConditional);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReactPackage.JSX_ITERATOR: {
				JsxIterator jsxIterator = (JsxIterator)theEObject;
				T result = caseJsxIterator(jsxIterator);
				if (result == null) result = caseJsxNode(jsxIterator);
				if (result == null) result = caseReactElement(jsxIterator);
				if (result == null) result = caseTypeScriptElement(jsxIterator);
				if (result == null) result = caseNamedElement(jsxIterator);
				if (result == null) result = caseModelElement(jsxIterator);
				if (result == null) result = caseStringIdentity(jsxIterator);
				if (result == null) result = caseDocumented(jsxIterator);
				if (result == null) result = caseMarked(jsxIterator);
				if (result == null) result = caseReferrable(jsxIterator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReactPackage.CONTEXT_PROVIDER: {
				ContextProvider contextProvider = (ContextProvider)theEObject;
				T result = caseContextProvider(contextProvider);
				if (result == null) result = caseJsxContainer(contextProvider);
				if (result == null) result = caseJsxNode(contextProvider);
				if (result == null) result = caseReactElement(contextProvider);
				if (result == null) result = caseTypeScriptElement(contextProvider);
				if (result == null) result = caseNamedElement(contextProvider);
				if (result == null) result = caseModelElement(contextProvider);
				if (result == null) result = caseStringIdentity(contextProvider);
				if (result == null) result = caseDocumented(contextProvider);
				if (result == null) result = caseMarked(contextProvider);
				if (result == null) result = caseReferrable(contextProvider);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReactPackage.OPAQUE_JSX: {
				OpaqueJsx opaqueJsx = (OpaqueJsx)theEObject;
				T result = caseOpaqueJsx(opaqueJsx);
				if (result == null) result = caseJsxNode(opaqueJsx);
				if (result == null) result = caseReactElement(opaqueJsx);
				if (result == null) result = caseTypeScriptElement(opaqueJsx);
				if (result == null) result = caseNamedElement(opaqueJsx);
				if (result == null) result = caseModelElement(opaqueJsx);
				if (result == null) result = caseStringIdentity(opaqueJsx);
				if (result == null) result = caseDocumented(opaqueJsx);
				if (result == null) result = caseMarked(opaqueJsx);
				if (result == null) result = caseReferrable(opaqueJsx);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReactPackage.INTRINSIC: {
				Intrinsic intrinsic = (Intrinsic)theEObject;
				T result = caseIntrinsic(intrinsic);
				if (result == null) result = caseJsxContainer(intrinsic);
				if (result == null) result = caseJsxNode(intrinsic);
				if (result == null) result = caseReactElement(intrinsic);
				if (result == null) result = caseTypeScriptElement(intrinsic);
				if (result == null) result = caseNamedElement(intrinsic);
				if (result == null) result = caseModelElement(intrinsic);
				if (result == null) result = caseStringIdentity(intrinsic);
				if (result == null) result = caseDocumented(intrinsic);
				if (result == null) result = caseMarked(intrinsic);
				if (result == null) result = caseReferrable(intrinsic);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReactPackage.JSX_CONTENT: {
				JsxContent jsxContent = (JsxContent)theEObject;
				T result = caseJsxContent(jsxContent);
				if (result == null) result = caseNode(jsxContent);
				if (result == null) result = caseMarked(jsxContent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReactPackage.LIBRARY_COMPONENT: {
				LibraryComponent libraryComponent = (LibraryComponent)theEObject;
				T result = caseLibraryComponent(libraryComponent);
				if (result == null) result = caseJsxContainer(libraryComponent);
				if (result == null) result = caseJsxNode(libraryComponent);
				if (result == null) result = caseReactElement(libraryComponent);
				if (result == null) result = caseTypeScriptElement(libraryComponent);
				if (result == null) result = caseNamedElement(libraryComponent);
				if (result == null) result = caseModelElement(libraryComponent);
				if (result == null) result = caseStringIdentity(libraryComponent);
				if (result == null) result = caseDocumented(libraryComponent);
				if (result == null) result = caseMarked(libraryComponent);
				if (result == null) result = caseReferrable(libraryComponent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReactPackage.LIBRARY_HOOK: {
				LibraryHook libraryHook = (LibraryHook)theEObject;
				T result = caseLibraryHook(libraryHook);
				if (result == null) result = caseHook(libraryHook);
				if (result == null) result = caseReactElement(libraryHook);
				if (result == null) result = caseTypeScriptElement(libraryHook);
				if (result == null) result = caseNamedElement(libraryHook);
				if (result == null) result = caseModelElement(libraryHook);
				if (result == null) result = caseStringIdentity(libraryHook);
				if (result == null) result = caseDocumented(libraryHook);
				if (result == null) result = caseMarked(libraryHook);
				if (result == null) result = caseReferrable(libraryHook);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReactPackage.VALUE_BLOCK: {
				ValueBlock valueBlock = (ValueBlock)theEObject;
				T result = caseValueBlock(valueBlock);
				if (result == null) result = caseCodeBlock(valueBlock);
				if (result == null) result = caseTypeScriptElement(valueBlock);
				if (result == null) result = caseNamedElement(valueBlock);
				if (result == null) result = caseModelElement(valueBlock);
				if (result == null) result = caseStringIdentity(valueBlock);
				if (result == null) result = caseDocumented(valueBlock);
				if (result == null) result = caseMarked(valueBlock);
				if (result == null) result = caseReferrable(valueBlock);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReactPackage.JSX_ATTRIBUTE: {
				JsxAttribute jsxAttribute = (JsxAttribute)theEObject;
				T result = caseJsxAttribute(jsxAttribute);
				if (result == null) result = caseReactElement(jsxAttribute);
				if (result == null) result = caseTypeScriptElement(jsxAttribute);
				if (result == null) result = caseNamedElement(jsxAttribute);
				if (result == null) result = caseModelElement(jsxAttribute);
				if (result == null) result = caseStringIdentity(jsxAttribute);
				if (result == null) result = caseDocumented(jsxAttribute);
				if (result == null) result = caseMarked(jsxAttribute);
				if (result == null) result = caseReferrable(jsxAttribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReactPackage.LITERAL_ATTRIBUTE: {
				LiteralAttribute literalAttribute = (LiteralAttribute)theEObject;
				T result = caseLiteralAttribute(literalAttribute);
				if (result == null) result = caseJsxAttribute(literalAttribute);
				if (result == null) result = caseReactElement(literalAttribute);
				if (result == null) result = caseTypeScriptElement(literalAttribute);
				if (result == null) result = caseNamedElement(literalAttribute);
				if (result == null) result = caseModelElement(literalAttribute);
				if (result == null) result = caseStringIdentity(literalAttribute);
				if (result == null) result = caseDocumented(literalAttribute);
				if (result == null) result = caseMarked(literalAttribute);
				if (result == null) result = caseReferrable(literalAttribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReactPackage.EXPRESSION_ATTRIBUTE: {
				ExpressionAttribute expressionAttribute = (ExpressionAttribute)theEObject;
				T result = caseExpressionAttribute(expressionAttribute);
				if (result == null) result = caseJsxAttribute(expressionAttribute);
				if (result == null) result = caseReactElement(expressionAttribute);
				if (result == null) result = caseTypeScriptElement(expressionAttribute);
				if (result == null) result = caseNamedElement(expressionAttribute);
				if (result == null) result = caseModelElement(expressionAttribute);
				if (result == null) result = caseStringIdentity(expressionAttribute);
				if (result == null) result = caseDocumented(expressionAttribute);
				if (result == null) result = caseMarked(expressionAttribute);
				if (result == null) result = caseReferrable(expressionAttribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReactPackage.EVENT_ATTRIBUTE: {
				EventAttribute eventAttribute = (EventAttribute)theEObject;
				T result = caseEventAttribute(eventAttribute);
				if (result == null) result = caseJsxAttribute(eventAttribute);
				if (result == null) result = caseReactElement(eventAttribute);
				if (result == null) result = caseTypeScriptElement(eventAttribute);
				if (result == null) result = caseNamedElement(eventAttribute);
				if (result == null) result = caseModelElement(eventAttribute);
				if (result == null) result = caseStringIdentity(eventAttribute);
				if (result == null) result = caseDocumented(eventAttribute);
				if (result == null) result = caseMarked(eventAttribute);
				if (result == null) result = caseReferrable(eventAttribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReactPackage.SPREAD_ATTRIBUTE: {
				SpreadAttribute spreadAttribute = (SpreadAttribute)theEObject;
				T result = caseSpreadAttribute(spreadAttribute);
				if (result == null) result = caseJsxAttribute(spreadAttribute);
				if (result == null) result = caseReactElement(spreadAttribute);
				if (result == null) result = caseTypeScriptElement(spreadAttribute);
				if (result == null) result = caseNamedElement(spreadAttribute);
				if (result == null) result = caseModelElement(spreadAttribute);
				if (result == null) result = caseStringIdentity(spreadAttribute);
				if (result == null) result = caseDocumented(spreadAttribute);
				if (result == null) result = caseMarked(spreadAttribute);
				if (result == null) result = caseReferrable(spreadAttribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReactElement(ReactElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tsx Module</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tsx Module</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTsxModule(TsxModule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponentDeclaration(ComponentDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Jsx Block</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Jsx Block</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJsxBlock(JsxBlock object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hook</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hook</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHook(Hook object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>State Hook</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>State Hook</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStateHook(StateHook object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Effect Hook</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Effect Hook</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEffectHook(EffectHook object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Memo Hook</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Memo Hook</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMemoHook(MemoHook object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Context Hook</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Context Hook</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContextHook(ContextHook object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ref Hook</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ref Hook</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRefHook(RefHook object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Opaque Hook</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Opaque Hook</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOpaqueHook(OpaqueHook object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Context Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Context Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContextDeclaration(ContextDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Jsx Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Jsx Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJsxNode(JsxNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Jsx Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Jsx Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJsxContainer(JsxContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Jsx Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Jsx Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJsxElement(JsxElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Jsx Fragment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Jsx Fragment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJsxFragment(JsxFragment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Jsx Text</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Jsx Text</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJsxText(JsxText object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Jsx Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Jsx Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJsxExpression(JsxExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Jsx Conditional</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Jsx Conditional</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJsxConditional(JsxConditional object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Jsx Iterator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Jsx Iterator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJsxIterator(JsxIterator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Context Provider</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Context Provider</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContextProvider(ContextProvider object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Opaque Jsx</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Opaque Jsx</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOpaqueJsx(OpaqueJsx object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Intrinsic</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Intrinsic</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntrinsic(Intrinsic object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Jsx Content</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Jsx Content</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJsxContent(JsxContent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Library Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Library Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLibraryComponent(LibraryComponent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Library Hook</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Library Hook</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLibraryHook(LibraryHook object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value Block</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value Block</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValueBlock(ValueBlock object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Jsx Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Jsx Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJsxAttribute(JsxAttribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Literal Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Literal Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLiteralAttribute(LiteralAttribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expression Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expression Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpressionAttribute(ExpressionAttribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEventAttribute(EventAttribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Spread Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Spread Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpreadAttribute(SpreadAttribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Referrable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Referrable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReferrable(Referrable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String Identity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String Identity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStringIdentity(StringIdentity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Documented</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Documented</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumented(Documented object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Marked</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Marked</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMarked(Marked object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModelElement(ModelElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedElement(NamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Script Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Script Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeScriptElement(TypeScriptElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Module</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Module</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModule(org.nasdanika.sdk.runtime.models.typescript.Module object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeclaration(Declaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Callable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Callable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCallable(Callable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Function Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Function Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunctionDeclaration(FunctionDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Code Block</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Code Block</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCodeBlock(CodeBlock object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNode(Node object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //ReactSwitch
